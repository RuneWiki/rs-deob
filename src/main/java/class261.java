import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class261 {

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    private int field3386;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "[Lmk;")
    private class321[] field3396;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "Lvg;")
    public static class622 field3397 = new class622(36, 3);

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "J")
    private long field3394;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "Lmk;")
    private class321 field3392;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)Z")
    public static final boolean method1566(byte arg0, int arg1) {
        if (arg0 == 5) {
            field3389++;
            return arg1 == 7 || arg1 == 8 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILmk;J)V")
    public final void method1567(int arg0, class321 arg1, long arg2) {
        field3390++;
        if (arg1.field4673 != null) {
            arg1.method1989((byte) 62);
        }
        class321 var5 = this.field3396[(int) (arg2 & (long) (this.field3386 - 1))];
        if (arg0 != -18996) {
            return;
        }
        arg1.field4674 = var5;
        arg1.field4673 = var5.field4673;
        arg1.field4673.field4674 = arg1;
        arg1.field4674.field4673 = arg1;
        arg1.field4679 = arg2;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BJ)Lmk;")
    public final class321 method1568(byte arg0, long arg1) {
        field3385++;
        this.field3394 = arg1;
        class321 var4 = this.field3396[(int) ((long) (this.field3386 - 1) & arg1)];
        for (this.field3392 = var4.field4674; this.field3392 != var4; this.field3392 = this.field3392.field4674) {
            if (this.field3392.field4679 == arg1) {
                class321 var5 = this.field3392;
                this.field3392 = this.field3392.field4674;
                return var5;
            }
        }
        this.field3392 = null;
        return arg0 < 25 ? null : null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([BII)I")
    public static final int method1569(byte[] arg0, int arg1, int arg2) {
        if (arg2 >= -50) {
            method1572((byte) -13);
        }
        field3395++;
        return class59.method368(arg1, -95, arg0, 0);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Lmk;")
    public final class321 method1570(int arg0) {
        field3400++;
        if (this.field3392 == null) {
            return null;
        }
        class321 var2 = this.field3396[(int) (this.field3394 & (long) (this.field3386 + arg0))];
        while (this.field3392 != var2) {
            if (this.field3392.field4679 == this.field3394) {
                class321 var3 = this.field3392;
                this.field3392 = this.field3392.field4674;
                return var3;
            }
            this.field3392 = this.field3392.field4674;
        }
        this.field3392 = null;
        return null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILrg;)V")
    public static final void method1571(int arg0, class523 arg1) {
        field3399++;
        if (arg1.field7357 == null && arg1.field7355 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.field7357.length; var3++) {
            int var4 = -1;
            if (arg1.field7357 != null) {
                var4 = arg1.field7357[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    var9 = arg1.field7895 - ((-class397.field6005 + var8) * 512) - 256;
                    int var10 = var7 & 0x3FFF;
                    var11 = arg1.field7896 - ((-class403.field6049 + var10) * 512) - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class177 var14 = (class177) class271.field3550.method2002((byte) -123, (long) var4);
                    if (var14 == null) {
                        arg1.method2960(-1, (byte) 86, var3);
                        continue;
                    }
                    class53 var15 = var14.field2476;
                    var9 = arg1.field7895 - var15.field7895;
                    var11 = arg1.field7896 - var15.field7896;
                } else {
                    int var12 = var4 & 0x7FFF;
                    class71 var13 = class35.field551[var12];
                    if (var13 == null) {
                        arg1.method2960(-1, (byte) 98, var3);
                        continue;
                    }
                    var11 = arg1.field7896 - var13.field7896;
                    var9 = arg1.field7895 - var13.field7895;
                }
                if (var9 != 0 || var11 != 0) {
                    arg1.method2960((int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF, (byte) 45, var3);
                }
            } else if (!arg1.method2960(-1, (byte) 40, var3)) {
                var2 = false;
            }
        }
        if (arg0 != 7) {
            field3397 = null;
        }
        if (var2) {
            arg1.field7357 = null;
            arg1.field7355 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public static void method1572(byte arg0) {
        if (arg0 <= 57) {
            method1569(null, -58, 69);
        }
        field3397 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg2;
            arg2 = var8;
        }
        field3391++;
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return -arg4 - (-(7 - arg6) - 1);
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg3;
        } else if (arg1 == 12283) {
            return arg6;
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(FFIFB)F")
    public static final float method1574(float arg0, float arg1, int arg2, float arg3, byte arg4) {
        if (arg4 != -77) {
            field3397 = null;
        }
        field3388++;
        float[] var5 = class115.field1721[arg2];
        return var5[2] * arg3 + var5[0] * arg1 + var5[1] * arg0;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public static final void method1575(int arg0) {
        class220.field2917 = new class5[class509.field7194.method1816(-122)][];
        field3393++;
        if (arg0 != -1) {
            method1575(25);
        }
        class379.field5710 = new class5[class509.field7194.method1816(84)][];
        class422.field6201 = new boolean[class509.field7194.method1816(arg0 - 104)];
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)V")
    public static final void method1576(int arg0, int arg1) {
        field3387++;
        if (class177.field2475 == 0) {
            class416.field6148.method3545(arg0, (byte) 96);
        } else {
            class20.field381 = arg0;
        }
        if (arg1 != 32768) {
            field3398 = -22;
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(I)V")
    public class261(int arg0) {
        this.field3386 = arg0;
        this.field3396 = new class321[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class321 var3 = this.field3396[var2] = new class321();
            var3.field4674 = var3;
            var3.field4673 = var3;
        }
    }
}
