import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class310 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Lho;")
    private class222 field3879 = null;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    private int field3890 = 65000;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "Lho;")
    private class222 field3891 = null;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    private int field3880;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Z")
    public static boolean field3881 = false;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3887 = null;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "[[I")
    public static int[][] field3885;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1824(String arg0, int arg1) {
        if (arg1 != 10796) {
            field3886 = 127;
        }
        class416.method2405(0, "", "", "", arg0, 0, arg1 ^ 0xFFFFD5D3);
        field3884++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field3885 = null;
        field3887 = null;
        int var1 = -19 / ((arg0 + 4) / 52);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)[B")
    public final byte[] method1826(int arg0, int arg1) {
        field3889++;
        class222 var3 = this.field3891;
        synchronized (this.field3891) {
            try {
                if (this.field3879.method1447(true) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field3879.method1442((long) (arg0 * 6), false);
                this.field3879.method1440(class597.field7583, -105, 6, 0);
                int var5 = (class597.field7583[2] & 0xFF) + ((class597.field7583[0] & 0xFF << 16) + (class597.field7583[1] & 0xFF << 8));
                int var6 = ((class597.field7583[3] & 0xFF) << 16) - (-((class597.field7583[4] & 0xFF) << 8) - (class597.field7583[5] & 0xFF));
                if (var5 < 0 || this.field3890 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field3891.method1447(true) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg1 <= 104) {
                        this.method1829(false, -97, 70, null, (byte) -112);
                    }
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3891.method1442((long) (var6 * 520), false);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3891.method1440(class597.field7583, -126, var13 + 8, 0);
                        int var14 = ((class597.field7583[0] & 0xFF) << 8) + (class597.field7583[1] & 0xFF);
                        int var15 = (class597.field7583[2] & 0xFF << 8) + (class597.field7583[3] & 0xFF);
                        int var16 = ((class597.field7583[5] & 0xFF) << 8) + ((class597.field7583[4] & 0xFF) << 16) + (class597.field7583[6] & 0xFF);
                        int var17 = class597.field7583[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field3880 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field3891.method1447(true) / 520L)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class597.field7583[var20 + 8];
                                }
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3888++;
        return "Cache:" + this.field3880;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[B)Z")
    public final boolean method1827(int arg0, int arg1, int arg2, byte[] arg3) {
        field3878++;
        class222 var5 = this.field3891;
        synchronized (this.field3891) {
            if (arg0 < 0 || this.field3890 < arg0) {
                throw new IllegalArgumentException();
            }
            if (arg2 != -26844) {
                this.field3879 = null;
            }
            boolean var6 = this.method1829(true, arg1, arg0, arg3, (byte) 108);
            if (!var6) {
                var6 = this.method1829(false, arg1, arg0, arg3, (byte) 108);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIZILuaa;)V")
    public static final void method1828(int arg0, int arg1, boolean arg2, int arg3, class391 arg4) {
        field3883++;
        if (arg3 != 512) {
            return;
        }
        int var5 = arg4.field5117;
        int var6 = arg4.field5031;
        if (arg4.field5004 == 0) {
            arg4.field5117 = arg4.field5014;
        } else if (arg4.field5004 == 1) {
            arg4.field5117 = arg1 - arg4.field5014;
        } else if (arg4.field5004 == 2) {
            arg4.field5117 = arg4.field5014 * arg1 >> 14;
        }
        if (arg4.field5034 == 0) {
            arg4.field5031 = arg4.field5045;
        } else if (arg4.field5034 == 1) {
            arg4.field5031 = arg0 - arg4.field5045;
        } else if (arg4.field5034 == 2) {
            arg4.field5031 = arg4.field5045 * arg0 >> 14;
        }
        if (arg4.field5004 == 4) {
            arg4.field5117 = arg4.field5112 * arg4.field5031 / arg4.field5071;
        }
        if (arg4.field5034 == 4) {
            arg4.field5031 = arg4.field5117 * arg4.field5071 / arg4.field5112;
        }
        if (class538.field6782 && (client.method2637(arg4).field4547 != 0 || arg4.field5007 == 0)) {
            if (arg4.field5031 < 5 && arg4.field5117 < 5) {
                arg4.field5117 = 5;
                arg4.field5031 = 5;
            } else {
                if (arg4.field5117 <= 0) {
                    arg4.field5117 = 5;
                }
                if (arg4.field5031 <= 0) {
                    arg4.field5031 = 5;
                }
            }
        }
        if (class66.field870 == arg4.field5110) {
            class377.field4620 = arg4;
        }
        if (arg2 && arg4.field5058 != null && arg4.field5117 != var5 || arg4.field5031 != var6) {
            class244 var7 = new class244();
            var7.field3350 = arg4;
            var7.field3349 = arg4.field5058;
            class251.field3427.method3593(var7, 15);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZII[BB)Z")
    private final boolean method1829(boolean arg0, int arg1, int arg2, byte[] arg3, byte arg4) {
        field3892++;
        class222 var6 = this.field3891;
        synchronized (this.field3891) {
            try {
                int var7;
                if (arg0) {
                    if (this.field3879.method1447(true) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field3879.method1442((long) (arg1 * 6), false);
                    this.field3879.method1440(class597.field7583, -100, 6, 0);
                    var7 = ((class597.field7583[3] & 0xFF) << 16) + ((class597.field7583[4] & 0xFF) << 8) + (class597.field7583[5] & 0xFF);
                    if (var7 <= 0 || this.field3891.method1447(true) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3891.method1447(true) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class597.field7583[3] = (byte) (var7 >> 16);
                class597.field7583[5] = (byte) var7;
                class597.field7583[1] = (byte) (arg2 >> 8);
                class597.field7583[2] = (byte) arg2;
                class597.field7583[4] = (byte) (var7 >> 8);
                class597.field7583[0] = (byte) (arg2 >> 16);
                this.field3879.method1442((long) (arg1 * 6), false);
                this.field3879.method1443(0, 16711680, class597.field7583, 6);
                int var10 = 0;
                if (arg4 != 108) {
                    field3885 = null;
                }
                int var11 = 0;
                while (var10 < arg2) {
                    int var12 = 0;
                    if (arg0) {
                        label108: {
                            this.field3891.method1442((long) (var7 * 520), false);
                            try {
                                this.field3891.method1440(class597.field7583, -95, 8, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class597.field7583[0] & 0xFF << 8) + (class597.field7583[1] & 0xFF);
                            var12 = ((class597.field7583[5] & 0xFF) << 8) + ((class597.field7583[4] & 0xFF) << 16) + (class597.field7583[6] & 0xFF);
                            int var14 = ((class597.field7583[2] & 0xFF) << 8) + (class597.field7583[3] & 0xFF);
                            int var15 = class597.field7583[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field3880 == var15) {
                                if (var12 >= 0 && (this.field3891.method1447(true) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3891.method1447(true) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class597.field7583[0] = (byte) (arg1 >> 8);
                    class597.field7583[3] = (byte) var11;
                    class597.field7583[1] = (byte) arg1;
                    class597.field7583[2] = (byte) (var11 >> 8);
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class597.field7583[4] = (byte) (var12 >> 16);
                    class597.field7583[5] = (byte) (var12 >> 8);
                    class597.field7583[7] = (byte) this.field3880;
                    class597.field7583[6] = (byte) var12;
                    this.field3891.method1442((long) (var7 * 520), false);
                    this.field3891.method1443(0, 16711680, class597.field7583, 8);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3891.method1443(var10, 16711680, arg3, var18);
                    var10 += var18;
                    var7 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([BI)Lfba;")
    public static final class368 method1830(byte[] arg0, int arg1) {
        field3882++;
        class368 var2 = new class368();
        if (arg1 >= -77) {
            method1828(-115, -33, true, 94, null);
        }
        class234 var3 = new class234(arg0);
        var3.field3133 = var3.field3193.length - 2;
        int var4 = var3.method1553((byte) 126);
        int var5 = var3.field3193.length - var4 - 16 - 2;
        var3.field3133 = var5;
        int var6 = var3.method1497((byte) 115);
        var2.field4510 = var3.method1553((byte) -112);
        var2.field4501 = var3.method1553((byte) 66);
        var2.field4504 = var3.method1553((byte) 7);
        var2.field4505 = var3.method1553((byte) -120);
        var2.field4513 = var3.method1553((byte) -109);
        var2.field4497 = var3.method1553((byte) -128);
        int var7 = var3.method1509(true);
        if (var7 > 0) {
            var2.field4507 = new class467[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1553((byte) -120);
                class467 var10 = new class467(class483.method2714(var9, (byte) -120));
                var2.field4507[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1497((byte) 94);
                    int var12 = var3.method1497((byte) 63);
                    var10.method2619(new class405(var12), (long) var11, -1);
                }
            }
        }
        var3.field3133 = 0;
        var2.field4506 = var3.method1508(8);
        var2.field4512 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field3133) {
            int var14 = var3.method1553((byte) -110);
            if (var14 == 3) {
                if (var2.field4509 == null) {
                    var2.field4509 = new String[var6];
                }
                var2.field4509[var13] = var3.method1540((byte) -120).intern();
            } else if (var14 == 54) {
                if (var2.field4502 == null) {
                    var2.field4502 = new long[var6];
                }
                var2.field4502[var13] = var3.method1516(-11290);
            } else {
                if (var2.field4498 == null) {
                    var2.field4498 = new int[var6];
                }
                if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                    var2.field4498[var13] = var3.method1509(true);
                } else {
                    var2.field4498[var13] = var3.method1497((byte) 77);
                }
            }
            var2.field4512[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILho;Lho;I)V")
    public class310(int arg0, class222 arg1, class222 arg2, int arg3) {
        this.field3879 = arg2;
        this.field3880 = arg0;
        this.field3890 = arg3;
        this.field3891 = arg1;
    }
}
