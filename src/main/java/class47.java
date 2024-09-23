import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RUMGIOMW")
public class class47 {

    @OriginalMember(owner = "RUMGIOMW", name = "a", descriptor = "I")
    private int field1387 = 46093;

    @OriginalMember(owner = "RUMGIOMW", name = "b", descriptor = "Z")
    private boolean field1388 = true;

    @OriginalMember(owner = "RUMGIOMW", name = "c", descriptor = "I")
    private int field1389 = -620;

    @OriginalMember(owner = "RUMGIOMW", name = "h", descriptor = "I")
    public int field1394 = 65000;

    @OriginalMember(owner = "RUMGIOMW", name = "g", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "RUMGIOMW", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1391;

    @OriginalMember(owner = "RUMGIOMW", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1392;

    @OriginalMember(owner = "RUMGIOMW", name = "d", descriptor = "[B")
    public static byte[] field1390 = new byte[520];

    @OriginalMember(owner = "RUMGIOMW", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
    public class47(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field1393 = arg4;
        this.field1391 = arg1;
        if (this.field1387 != arg0) {
            this.field1388 = !this.field1388;
        }
        this.field1392 = arg2;
        this.field1394 = arg3;
    }

    @OriginalMember(owner = "RUMGIOMW", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method491(int arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        try {
            this.method494(true, arg0 * 6, this.field1392);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1392.read(field1390, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1390[2] & 0xFF) + ((field1390[0] & 0xFF) << 16) + ((field1390[1] & 0xFF) << 8);
            int var6 = (field1390[5] & 0xFF) + ((field1390[3] & 0xFF) << 16) + ((field1390[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1394) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1391.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method494(true, var6 * 520, this.field1391);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1391.read(field1390, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1390[0] & 0xFF) << 8) + (field1390[1] & 0xFF);
                    int var14 = ((field1390[2] & 0xFF) << 8) + (field1390[3] & 0xFF);
                    int var15 = (field1390[6] & 0xFF) + ((field1390[4] & 0xFF) << 16) + ((field1390[5] & 0xFF) << 8);
                    int var16 = field1390[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1393 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1391.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1390[var17 + 8];
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

    @OriginalMember(owner = "RUMGIOMW", name = "a", descriptor = "(ZI[BI)Z")
    public synchronized boolean method492(boolean arg0, int arg1, byte[] arg2, int arg3) {
        boolean var5 = this.method493(arg2, arg3, 1, true, arg1);
        if (!arg0) {
            this.field1389 = -450;
        }
        if (!var5) {
            var5 = this.method493(arg2, arg3, 1, false, arg1);
        }
        return var5;
    }

    @OriginalMember(owner = "RUMGIOMW", name = "a", descriptor = "([BIIZI)Z")
    private synchronized boolean method493(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 != 1) {
            this.field1389 = 465;
        }
        try {
            int var8;
            if (arg3) {
                this.method494(true, arg1 * 6, this.field1392);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1392.read(field1390, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1390[5] & 0xFF) + ((field1390[3] & 0xFF) << 16) + ((field1390[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1391.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1391.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1390[0] = (byte) (arg4 >> 16);
            field1390[1] = (byte) (arg4 >> 8);
            field1390[2] = (byte) arg4;
            field1390[3] = (byte) (var8 >> 16);
            field1390[4] = (byte) (var8 >> 8);
            field1390[5] = (byte) var8;
            this.method494(true, arg1 * 6, this.field1392);
            this.field1392.write(field1390, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg4) {
                int var11 = 0;
                if (arg3) {
                    this.method494(true, var8 * 520, this.field1391);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1391.read(field1390, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1390[0] & 0xFF) << 8) + (field1390[1] & 0xFF);
                            int var15 = ((field1390[2] & 0xFF) << 8) + (field1390[3] & 0xFF);
                            var11 = (field1390[6] & 0xFF) + ((field1390[4] & 0xFF) << 16) + ((field1390[5] & 0xFF) << 8);
                            int var16 = field1390[7] & 0xFF;
                            if (arg1 == var14 && var10 == var15 && this.field1393 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1391.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg3 = false;
                    var11 = (int) ((this.field1391.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg4 - var9 <= 512) {
                    var11 = 0;
                }
                field1390[0] = (byte) (arg1 >> 8);
                field1390[1] = (byte) arg1;
                field1390[2] = (byte) (var10 >> 8);
                field1390[3] = (byte) var10;
                field1390[4] = (byte) (var11 >> 16);
                field1390[5] = (byte) (var11 >> 8);
                field1390[6] = (byte) var11;
                field1390[7] = (byte) this.field1393;
                this.method494(true, var8 * 520, this.field1391);
                this.field1391.write(field1390, 0, 8);
                int var17 = arg4 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1391.write(arg0, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "RUMGIOMW", name = "a", descriptor = "(ZILjava/io/RandomAccessFile;)V")
    public synchronized void method494(boolean arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg1);
        if (!arg0) {
            this.field1387 = -192;
        }
    }
}
