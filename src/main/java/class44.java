import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RZNFVLPG")
public class class44 {

    @OriginalMember(owner = "RZNFVLPG", name = "a", descriptor = "I")
    private int field1145 = -24385;

    @OriginalMember(owner = "RZNFVLPG", name = "b", descriptor = "Z")
    private boolean field1146 = true;

    @OriginalMember(owner = "RZNFVLPG", name = "c", descriptor = "Z")
    private boolean field1147 = true;

    @OriginalMember(owner = "RZNFVLPG", name = "h", descriptor = "I")
    public int field1152 = 65000;

    @OriginalMember(owner = "RZNFVLPG", name = "g", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "RZNFVLPG", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1149;

    @OriginalMember(owner = "RZNFVLPG", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1150;

    @OriginalMember(owner = "RZNFVLPG", name = "d", descriptor = "[B")
    public static byte[] field1148 = new byte[520];

    @OriginalMember(owner = "RZNFVLPG", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ZIILjava/io/RandomAccessFile;)V")
    public class44(RandomAccessFile arg0, boolean arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field1151 = arg2;
        this.field1149 = arg0;
        if (arg1) {
            this.field1146 = !this.field1146;
        }
        this.field1150 = arg4;
        this.field1152 = arg3;
    }

    @OriginalMember(owner = "RZNFVLPG", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method427(int arg0, int arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this.field1145 = -105;
        }
        try {
            this.method430(false, this.field1150, arg1 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1150.read(field1148, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1148[2] & 0xFF) + ((field1148[0] & 0xFF) << 16) + ((field1148[1] & 0xFF) << 8);
            int var6 = (field1148[5] & 0xFF) + ((field1148[3] & 0xFF) << 16) + ((field1148[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1152) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1149.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method430(false, this.field1149, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1149.read(field1148, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1148[0] & 0xFF) << 8) + (field1148[1] & 0xFF);
                    int var14 = ((field1148[2] & 0xFF) << 8) + (field1148[3] & 0xFF);
                    int var15 = (field1148[6] & 0xFF) + ((field1148[4] & 0xFF) << 16) + ((field1148[5] & 0xFF) << 8);
                    int var16 = field1148[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field1151 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1149.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1148[var17 + 8];
                            }
                            var6 = var15;
                            var9++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var7;
            } else {
                return null;
            }
        } catch (IOException var18) {
            return null;
        }
    }

    @OriginalMember(owner = "RZNFVLPG", name = "a", descriptor = "(BII[B)Z")
    public synchronized boolean method428(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != -43) {
            this.field1147 = !this.field1147;
        }
        boolean var5 = this.method429(true, -913, arg2, arg3, arg1);
        if (!var5) {
            var5 = this.method429(false, -913, arg2, arg3, arg1);
        }
        return var5;
    }

    @OriginalMember(owner = "RZNFVLPG", name = "a", descriptor = "(ZII[BI)Z")
    private synchronized boolean method429(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg1 >= 0) {
            this.field1145 = -366;
        }
        try {
            int var8;
            if (arg0) {
                this.method430(false, this.field1150, arg4 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1150.read(field1148, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1148[5] & 0xFF) + ((field1148[3] & 0xFF) << 16) + ((field1148[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1149.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1149.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1148[0] = (byte) (arg2 >> 16);
            field1148[1] = (byte) (arg2 >> 8);
            field1148[2] = (byte) arg2;
            field1148[3] = (byte) (var8 >> 16);
            field1148[4] = (byte) (var8 >> 8);
            field1148[5] = (byte) var8;
            this.method430(false, this.field1150, arg4 * 6);
            this.field1150.write(field1148, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg2) {
                int var11 = 0;
                if (arg0) {
                    this.method430(false, this.field1149, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1149.read(field1148, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1148[0] & 0xFF) << 8) + (field1148[1] & 0xFF);
                            int var15 = ((field1148[2] & 0xFF) << 8) + (field1148[3] & 0xFF);
                            var11 = (field1148[6] & 0xFF) + ((field1148[4] & 0xFF) << 16) + ((field1148[5] & 0xFF) << 8);
                            int var16 = field1148[7] & 0xFF;
                            if (arg4 == var14 && var10 == var15 && this.field1151 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1149.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg0 = false;
                    var11 = (int) ((this.field1149.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg2 - var9 <= 512) {
                    var11 = 0;
                }
                field1148[0] = (byte) (arg4 >> 8);
                field1148[1] = (byte) arg4;
                field1148[2] = (byte) (var10 >> 8);
                field1148[3] = (byte) var10;
                field1148[4] = (byte) (var11 >> 16);
                field1148[5] = (byte) (var11 >> 8);
                field1148[6] = (byte) var11;
                field1148[7] = (byte) this.field1151;
                this.method430(false, this.field1149, var8 * 520);
                this.field1149.write(field1148, 0, 8);
                int var17 = arg2 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1149.write(arg3, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "RZNFVLPG", name = "a", descriptor = "(ZLjava/io/RandomAccessFile;I)V")
    public synchronized void method430(boolean arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg0) {
            this.field1147 = !this.field1147;
        }
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg2);
    }
}
