import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XWXMLCDO")
public class class66 {

    @OriginalMember(owner = "XWXMLCDO", name = "a", descriptor = "I")
    private int field1491 = -261;

    @OriginalMember(owner = "XWXMLCDO", name = "b", descriptor = "Z")
    private boolean field1492 = false;

    @OriginalMember(owner = "XWXMLCDO", name = "g", descriptor = "I")
    public int field1497 = 65000;

    @OriginalMember(owner = "XWXMLCDO", name = "f", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "XWXMLCDO", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1494;

    @OriginalMember(owner = "XWXMLCDO", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1495;

    @OriginalMember(owner = "XWXMLCDO", name = "c", descriptor = "[B")
    public static byte[] field1493 = new byte[520];

    @OriginalMember(owner = "XWXMLCDO", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IBILjava/io/RandomAccessFile;)V")
    public class66(RandomAccessFile arg0, int arg1, byte arg2, int arg3, RandomAccessFile arg4) {
        this.field1496 = arg1;
        this.field1494 = arg4;
        if (arg2 != 8) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        this.field1495 = arg0;
        this.field1497 = arg3;
    }

    @OriginalMember(owner = "XWXMLCDO", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method520(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1491 = 140;
        }
        try {
            this.method523(this.field1495, arg0 * 6, false);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1495.read(field1493, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1493[2] & 0xFF) + ((field1493[0] & 0xFF) << 16) + ((field1493[1] & 0xFF) << 8);
            int var6 = (field1493[5] & 0xFF) + ((field1493[3] & 0xFF) << 16) + ((field1493[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1497) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1494.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method523(this.field1494, var6 * 520, false);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1494.read(field1493, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1493[0] & 0xFF) << 8) + (field1493[1] & 0xFF);
                    int var14 = ((field1493[2] & 0xFF) << 8) + (field1493[3] & 0xFF);
                    int var15 = (field1493[6] & 0xFF) + ((field1493[4] & 0xFF) << 16) + ((field1493[5] & 0xFF) << 8);
                    int var16 = field1493[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1496 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1494.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1493[var17 + 8];
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

    @OriginalMember(owner = "XWXMLCDO", name = "a", descriptor = "(II[BI)Z")
    public synchronized boolean method521(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var5 = this.method522(arg3, arg2, true, arg0, -676);
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method522(arg3, arg2, false, arg0, -676);
        }
        return var5;
    }

    @OriginalMember(owner = "XWXMLCDO", name = "a", descriptor = "(I[BZII)Z")
    private synchronized boolean method522(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        while (arg4 >= 0) {
            this.field1492 = !this.field1492;
        }
        try {
            int var8;
            if (arg2) {
                this.method523(this.field1495, arg3 * 6, false);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1495.read(field1493, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1493[5] & 0xFF) + ((field1493[3] & 0xFF) << 16) + ((field1493[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1494.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1494.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1493[0] = (byte) (arg0 >> 16);
            field1493[1] = (byte) (arg0 >> 8);
            field1493[2] = (byte) arg0;
            field1493[3] = (byte) (var8 >> 16);
            field1493[4] = (byte) (var8 >> 8);
            field1493[5] = (byte) var8;
            this.method523(this.field1495, arg3 * 6, false);
            this.field1495.write(field1493, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg0) {
                int var11 = 0;
                if (arg2) {
                    this.method523(this.field1494, var8 * 520, false);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1494.read(field1493, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label119: {
                            int var14 = ((field1493[0] & 0xFF) << 8) + (field1493[1] & 0xFF);
                            int var15 = ((field1493[2] & 0xFF) << 8) + (field1493[3] & 0xFF);
                            var11 = (field1493[6] & 0xFF) + ((field1493[4] & 0xFF) << 16) + ((field1493[5] & 0xFF) << 8);
                            int var16 = field1493[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field1496 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1494.length() / 520L) {
                                    break label119;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg2 = false;
                    var11 = (int) ((this.field1494.length() + 519L) / 520L);
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
                field1493[0] = (byte) (arg3 >> 8);
                field1493[1] = (byte) arg3;
                field1493[2] = (byte) (var10 >> 8);
                field1493[3] = (byte) var10;
                field1493[4] = (byte) (var11 >> 16);
                field1493[5] = (byte) (var11 >> 8);
                field1493[6] = (byte) var11;
                field1493[7] = (byte) this.field1496;
                this.method523(this.field1494, var8 * 520, false);
                this.field1494.write(field1493, 0, 8);
                int var17 = arg0 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1494.write(arg1, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "XWXMLCDO", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IZ)V")
    public synchronized void method523(RandomAccessFile arg0, int arg1, boolean arg2) throws IOException {
        if (arg2) {
            this.field1491 = 192;
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
