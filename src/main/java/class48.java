import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QQNRPAWO")
public class class48 {

    @OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "I")
    private int field1414 = -30470;

    @OriginalMember(owner = "client!QQNRPAWO", name = "b", descriptor = "Z")
    private boolean field1415 = true;

    @OriginalMember(owner = "client!QQNRPAWO", name = "h", descriptor = "I")
    public int field1420 = 65000;

    @OriginalMember(owner = "client!QQNRPAWO", name = "g", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!QQNRPAWO", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1417;

    @OriginalMember(owner = "client!QQNRPAWO", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1418;

    @OriginalMember(owner = "client!QQNRPAWO", name = "c", descriptor = "[B")
    public static byte[] field1416 = new byte[520];

    @OriginalMember(owner = "client!QQNRPAWO", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
    public class48(RandomAccessFile arg0, int arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field1419 = arg1;
        this.field1417 = arg4;
        int var6 = 67 / arg3;
        this.field1418 = arg0;
        this.field1420 = arg2;
    }

    @OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method488(int arg0, int arg1) {
        int var3 = 15 / arg0;
        try {
            this.method491(arg1 * 6, 4848, this.field1418);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1418.read(field1416, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1416[2] & 0xFF) + ((field1416[0] & 0xFF) << 16) + ((field1416[1] & 0xFF) << 8);
            int var7 = (field1416[5] & 0xFF) + ((field1416[3] & 0xFF) << 16) + ((field1416[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1420) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1417.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method491(var7 * 520, 4848, this.field1417);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1417.read(field1416, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1416[0] & 0xFF) << 8) + (field1416[1] & 0xFF);
                    int var15 = ((field1416[2] & 0xFF) << 8) + (field1416[3] & 0xFF);
                    int var16 = (field1416[6] & 0xFF) + ((field1416[4] & 0xFF) << 16) + ((field1416[5] & 0xFF) << 8);
                    int var17 = field1416[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field1419 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1417.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1416[var18 + 8];
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

    @OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "(III[B)Z")
    public synchronized boolean method489(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var5 = this.method490(arg2, -752, true, arg0, arg3);
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!var5) {
            var5 = this.method490(arg2, -752, false, arg0, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "(IIZI[B)Z")
    private synchronized boolean method490(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1 >= 0) {
            this.field1414 = 363;
        }
        try {
            int var8;
            if (arg2) {
                this.method491(arg3 * 6, 4848, this.field1418);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1418.read(field1416, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1416[5] & 0xFF) + ((field1416[3] & 0xFF) << 16) + ((field1416[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1417.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1417.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1416[0] = (byte) (arg0 >> 16);
            field1416[1] = (byte) (arg0 >> 8);
            field1416[2] = (byte) arg0;
            field1416[3] = (byte) (var8 >> 16);
            field1416[4] = (byte) (var8 >> 8);
            field1416[5] = (byte) var8;
            this.method491(arg3 * 6, 4848, this.field1418);
            this.field1418.write(field1416, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg0) {
                int var11 = 0;
                if (arg2) {
                    this.method491(var8 * 520, 4848, this.field1417);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1417.read(field1416, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1416[0] & 0xFF) << 8) + (field1416[1] & 0xFF);
                            int var15 = ((field1416[2] & 0xFF) << 8) + (field1416[3] & 0xFF);
                            var11 = (field1416[6] & 0xFF) + ((field1416[4] & 0xFF) << 16) + ((field1416[5] & 0xFF) << 8);
                            int var16 = field1416[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field1419 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1417.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg2 = false;
                    var11 = (int) ((this.field1417.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg0 - var9 <= 512) {
                    var11 = 0;
                }
                field1416[0] = (byte) (arg3 >> 8);
                field1416[1] = (byte) arg3;
                field1416[2] = (byte) (var10 >> 8);
                field1416[3] = (byte) var10;
                field1416[4] = (byte) (var11 >> 16);
                field1416[5] = (byte) (var11 >> 8);
                field1416[6] = (byte) var11;
                field1416[7] = (byte) this.field1419;
                this.method491(var8 * 520, 4848, this.field1417);
                this.field1417.write(field1416, 0, 8);
                int var17 = arg0 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1417.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!QQNRPAWO", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
    public synchronized void method491(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 != 4848) {
            this.field1415 = !this.field1415;
        }
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg0);
    }
}
