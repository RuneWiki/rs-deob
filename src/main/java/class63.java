import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UZKSGXIW")
public class class63 {

    @OriginalMember(owner = "UZKSGXIW", name = "a", descriptor = "Z")
    private boolean field1522 = true;

    @OriginalMember(owner = "UZKSGXIW", name = "b", descriptor = "Z")
    private boolean field1523 = true;

    @OriginalMember(owner = "UZKSGXIW", name = "c", descriptor = "Z")
    private boolean field1524 = false;

    @OriginalMember(owner = "UZKSGXIW", name = "h", descriptor = "I")
    public int field1529 = 65000;

    @OriginalMember(owner = "UZKSGXIW", name = "g", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "UZKSGXIW", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1526;

    @OriginalMember(owner = "UZKSGXIW", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1527;

    @OriginalMember(owner = "UZKSGXIW", name = "d", descriptor = "[B")
    public static byte[] field1525 = new byte[520];

    @OriginalMember(owner = "UZKSGXIW", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ZILjava/io/RandomAccessFile;)V")
    public class63(int arg0, RandomAccessFile arg1, boolean arg2, int arg3, RandomAccessFile arg4) {
        this.field1528 = arg3;
        this.field1526 = arg1;
        this.field1527 = arg4;
        this.field1529 = arg0;
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "UZKSGXIW", name = "a", descriptor = "(IZ)[B")
    public synchronized byte[] method515(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1523 = !this.field1523;
        }
        try {
            this.method518(this.field1527, arg0 * 6, 0);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1527.read(field1525, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1525[2] & 0xFF) + ((field1525[0] & 0xFF) << 16) + ((field1525[1] & 0xFF) << 8);
            int var6 = (field1525[5] & 0xFF) + ((field1525[3] & 0xFF) << 16) + ((field1525[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1529) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1526.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method518(this.field1526, var6 * 520, 0);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1526.read(field1525, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1525[0] & 0xFF) << 8) + (field1525[1] & 0xFF);
                    int var14 = ((field1525[2] & 0xFF) << 8) + (field1525[3] & 0xFF);
                    int var15 = (field1525[6] & 0xFF) + ((field1525[4] & 0xFF) << 16) + ((field1525[5] & 0xFF) << 8);
                    int var16 = field1525[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1528 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1526.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1525[var17 + 8];
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

    @OriginalMember(owner = "UZKSGXIW", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method516(byte[] arg0, int arg1, int arg2, int arg3) {
        while (arg2 >= 0) {
            this.field1524 = !this.field1524;
        }
        boolean var5 = this.method517(true, (byte) 8, arg1, arg0, arg3);
        if (!var5) {
            var5 = this.method517(false, (byte) 8, arg1, arg0, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "UZKSGXIW", name = "a", descriptor = "(ZBI[BI)Z")
    private synchronized boolean method517(boolean arg0, byte arg1, int arg2, byte[] arg3, int arg4) {
        if (arg1 == 8) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        try {
            int var10;
            if (arg0) {
                this.method518(this.field1527, arg2 * 6, 0);
                int var9;
                for (int var8 = 0; var8 < 6; var8 += var9) {
                    var9 = this.field1527.read(field1525, var8, 6 - var8);
                    if (var9 == -1) {
                        return false;
                    }
                }
                var10 = (field1525[5] & 0xFF) + ((field1525[3] & 0xFF) << 16) + ((field1525[4] & 0xFF) << 8);
                if (var10 <= 0 || (long) var10 > this.field1526.length() / 520L) {
                    return false;
                }
            } else {
                var10 = (int) ((this.field1526.length() + 519L) / 520L);
                if (var10 == 0) {
                    var10 = 1;
                }
            }
            field1525[0] = (byte) (arg4 >> 16);
            field1525[1] = (byte) (arg4 >> 8);
            field1525[2] = (byte) arg4;
            field1525[3] = (byte) (var10 >> 16);
            field1525[4] = (byte) (var10 >> 8);
            field1525[5] = (byte) var10;
            this.method518(this.field1527, arg2 * 6, 0);
            this.field1527.write(field1525, 0, 6);
            int var11 = 0;
            int var12 = 0;
            while (var11 < arg4) {
                int var13 = 0;
                if (arg0) {
                    this.method518(this.field1526, var10 * 520, 0);
                    int var14;
                    int var15;
                    for (var14 = 0; var14 < 8; var14 += var15) {
                        var15 = this.field1526.read(field1525, var14, 8 - var14);
                        if (var15 == -1) {
                            break;
                        }
                    }
                    if (var14 == 8) {
                        label118: {
                            int var16 = ((field1525[0] & 0xFF) << 8) + (field1525[1] & 0xFF);
                            int var17 = ((field1525[2] & 0xFF) << 8) + (field1525[3] & 0xFF);
                            var13 = (field1525[6] & 0xFF) + ((field1525[4] & 0xFF) << 16) + ((field1525[5] & 0xFF) << 8);
                            int var18 = field1525[7] & 0xFF;
                            if (arg2 == var16 && var12 == var17 && this.field1528 == var18) {
                                if (var13 >= 0 && (long) var13 <= this.field1526.length() / 520L) {
                                    break label118;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var13 == 0) {
                    arg0 = false;
                    var13 = (int) ((this.field1526.length() + 519L) / 520L);
                    if (var13 == 0) {
                        var13++;
                    }
                    if (var10 == var13) {
                        var13++;
                    }
                }
                if (arg4 - var11 <= 512) {
                    var13 = 0;
                }
                field1525[0] = (byte) (arg2 >> 8);
                field1525[1] = (byte) arg2;
                field1525[2] = (byte) (var12 >> 8);
                field1525[3] = (byte) var12;
                field1525[4] = (byte) (var13 >> 16);
                field1525[5] = (byte) (var13 >> 8);
                field1525[6] = (byte) var13;
                field1525[7] = (byte) this.field1528;
                this.method518(this.field1526, var10 * 520, 0);
                this.field1526.write(field1525, 0, 8);
                int var19 = arg4 - var11;
                if (var19 > 512) {
                    var19 = 512;
                }
                this.field1526.write(arg3, var11, var19);
                var11 += var19;
                var10 = var13;
                var12++;
            }
            return true;
        } catch (IOException var20) {
            return false;
        }
    }

    @OriginalMember(owner = "UZKSGXIW", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method518(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg2 != 0) {
            this.field1522 = !this.field1522;
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg1);
    }
}
