import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OVNURGUS")
public class class46 {

    @OriginalMember(owner = "OVNURGUS", name = "a", descriptor = "B")
    private byte field1206 = -27;

    @OriginalMember(owner = "OVNURGUS", name = "b", descriptor = "Z")
    private boolean field1207 = false;

    @OriginalMember(owner = "OVNURGUS", name = "c", descriptor = "I")
    private int field1208 = 7;

    @OriginalMember(owner = "OVNURGUS", name = "h", descriptor = "I")
    public int field1213 = 65000;

    @OriginalMember(owner = "OVNURGUS", name = "g", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "OVNURGUS", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1210;

    @OriginalMember(owner = "OVNURGUS", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1211;

    @OriginalMember(owner = "OVNURGUS", name = "d", descriptor = "[B")
    public static byte[] field1209 = new byte[520];

    @OriginalMember(owner = "OVNURGUS", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
    public class46(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field1212 = arg3;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field1210 = arg2;
        this.field1211 = arg1;
        this.field1213 = arg4;
    }

    @OriginalMember(owner = "OVNURGUS", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method392(byte arg0, int arg1) {
        if (this.field1206 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method395(this.field1211, arg1 * 6, 0);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1211.read(field1209, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1209[2] & 0xFF) + ((field1209[0] & 0xFF) << 16) + ((field1209[1] & 0xFF) << 8);
            int var7 = (field1209[5] & 0xFF) + ((field1209[3] & 0xFF) << 16) + ((field1209[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1213) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1210.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method395(this.field1210, var7 * 520, 0);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1210.read(field1209, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1209[0] & 0xFF) << 8) + (field1209[1] & 0xFF);
                    int var15 = ((field1209[2] & 0xFF) << 8) + (field1209[3] & 0xFF);
                    int var16 = (field1209[6] & 0xFF) + ((field1209[4] & 0xFF) << 16) + ((field1209[5] & 0xFF) << 8);
                    int var17 = field1209[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field1212 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1210.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1209[var18 + 8];
                            }
                            var7 = var16;
                            var10++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var8;
            } else {
                return null;
            }
        } catch (IOException var19) {
            return null;
        }
    }

    @OriginalMember(owner = "OVNURGUS", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method393(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var5 = this.method394(arg1, (byte) 7, arg0, arg2, true);
        if (arg3 != 1) {
            this.field1208 = 296;
        }
        if (!var5) {
            var5 = this.method394(arg1, (byte) 7, arg0, arg2, false);
        }
        return var5;
    }

    @OriginalMember(owner = "OVNURGUS", name = "a", descriptor = "(IB[BIZ)Z")
    private synchronized boolean method394(int arg0, byte arg1, byte[] arg2, int arg3, boolean arg4) {
        if (arg1 == 7) {
            boolean var6 = false;
        } else {
            this.field1207 = !this.field1207;
        }
        try {
            int var9;
            if (arg4) {
                this.method395(this.field1211, arg3 * 6, 0);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1211.read(field1209, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1209[5] & 0xFF) + ((field1209[3] & 0xFF) << 16) + ((field1209[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1210.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1210.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1209[0] = (byte) (arg0 >> 16);
            field1209[1] = (byte) (arg0 >> 8);
            field1209[2] = (byte) arg0;
            field1209[3] = (byte) (var9 >> 16);
            field1209[4] = (byte) (var9 >> 8);
            field1209[5] = (byte) var9;
            this.method395(this.field1211, arg3 * 6, 0);
            this.field1211.write(field1209, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg0) {
                int var12 = 0;
                if (arg4) {
                    this.method395(this.field1210, var9 * 520, 0);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1210.read(field1209, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label118: {
                            int var15 = ((field1209[0] & 0xFF) << 8) + (field1209[1] & 0xFF);
                            int var16 = ((field1209[2] & 0xFF) << 8) + (field1209[3] & 0xFF);
                            var12 = (field1209[6] & 0xFF) + ((field1209[4] & 0xFF) << 16) + ((field1209[5] & 0xFF) << 8);
                            int var17 = field1209[7] & 0xFF;
                            if (arg3 == var15 && var11 == var16 && this.field1212 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1210.length() / 520L) {
                                    break label118;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg4 = false;
                    var12 = (int) ((this.field1210.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg0 - var10 <= 512) {
                    var12 = 0;
                }
                field1209[0] = (byte) (arg3 >> 8);
                field1209[1] = (byte) arg3;
                field1209[2] = (byte) (var11 >> 8);
                field1209[3] = (byte) var11;
                field1209[4] = (byte) (var12 >> 16);
                field1209[5] = (byte) (var12 >> 8);
                field1209[6] = (byte) var12;
                field1209[7] = (byte) this.field1212;
                this.method395(this.field1210, var9 * 520, 0);
                this.field1210.write(field1209, 0, 8);
                int var18 = arg0 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1210.write(arg2, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "OVNURGUS", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method395(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg1);
        if (arg2 == 0) {
            ;
        }
    }
}
