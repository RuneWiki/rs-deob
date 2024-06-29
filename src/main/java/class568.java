import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class568 {

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
    public int field8000;

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
    public int field7999;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
    public int field8001;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "B")
    public byte field7984;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
    private int field7986;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "[I")
    public static int[] field7985 = new int[2048];

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public int field7983;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    public int field7991;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
    public int field7992;

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
    public int field7993;

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
    public int field7994;

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
    public int field7996;

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "I")
    public int field8002;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    public int field8003;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
    public int field8004;

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "Lvd;")
    public static class36 field7988;

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "Llea;")
    public class568 field7989;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lo;IIIII)V", line = 5)
    public static final void method3229(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7995++;
        if (arg0.field406 == -1 && arg0.field419 == null) {
            return;
        }
        int var6 = 0;
        if (arg4 > arg0.field413) {
            var6 += arg4 - arg0.field413;
        } else if (arg4 < arg0.field409) {
            var6 += arg0.field409 - arg4;
        }
        int var7 = class287.field4270.field3687 * arg0.field415 >> 8;
        int var8 = -59 % ((9 - arg1) / 42);
        if (arg3 > arg0.field431) {
            var6 += arg3 - arg0.field431;
        } else if (arg0.field416 > arg3) {
            var6 += arg0.field416 - arg3;
        }
        if (arg0.field410 == 0 || (var6 - 256) > arg0.field410 || class287.field4270.field3687 == 0 || arg0.field426 != arg2) {
            if (arg0.field430 != null) {
                class627.field8780.method2114(arg0.field430);
                arg0.field428 = null;
                arg0.field430 = null;
                arg0.field402 = null;
            }
            if (arg0.field411 != null) {
                class627.field8780.method2114(arg0.field411);
                arg0.field422 = null;
                arg0.field411 = null;
                arg0.field412 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var9 = (arg0.field410 - var6) * var7 / arg0.field410;
        if (arg0.field430 != null) {
            arg0.field430.method3152(var9);
        } else if (arg0.field406 >= 0) {
            if (arg0.field404) {
                if (arg0.field428 == null) {
                    arg0.field428 = class359.method2189(class424.field6162, arg0.field406);
                }
                if (arg0.field428 != null) {
                    if (arg0.field402 == null) {
                        arg0.field402 = arg0.field428.method2188(new int[] { 22050 });
                    }
                    if (arg0.field402 != null) {
                        class557 var10 = class557.method3182(arg0.field402, 100, var9);
                        var10.method3192(-1);
                        class627.field8780.method2107(var10);
                        arg0.field430 = var10;
                    }
                }
            } else {
                class468 var11 = class468.method2764(class199.field2813, arg0.field406, 0);
                if (var11 != null) {
                    class250 var12 = var11.method2766().method1677(class37.field630);
                    class557 var13 = class557.method3182(var12, 100, var9);
                    var13.method3192(-1);
                    class627.field8780.method2107(var13);
                    arg0.field430 = var13;
                }
            }
        }
        if (arg0.field411 != null) {
            arg0.field411.method3152(var9);
            if (arg0.field411.method3675(true)) {
                return;
            }
            arg0.field422 = null;
            arg0.field412 = null;
            arg0.field411 = null;
        } else if (arg0.field419 != null && (arg0.field414 -= arg5) <= 0) {
            if (arg0.field420) {
                if (arg0.field412 == null) {
                    int var14 = (int) ((double) arg0.field419.length * Math.random());
                    arg0.field412 = class359.method2189(class424.field6162, arg0.field419[var14]);
                }
                if (arg0.field412 != null) {
                    if (arg0.field422 == null) {
                        arg0.field422 = arg0.field412.method2188(new int[] { 22050 });
                    }
                    if (arg0.field422 != null) {
                        class557 var15 = class557.method3182(arg0.field422, 100, var9);
                        var15.method3192(0);
                        class627.field8780.method2107(var15);
                        arg0.field414 = (int) (Math.random() * (double) (arg0.field403 - arg0.field418)) + arg0.field418;
                        arg0.field411 = var15;
                        return;
                    }
                }
            } else {
                int var16 = (int) (Math.random() * (double) arg0.field419.length);
                class468 var17 = class468.method2764(class199.field2813, arg0.field419[var16], 0);
                if (var17 == null) {
                    return;
                }
                class250 var18 = var17.method2766().method1677(class37.field630);
                class557 var19 = class557.method3182(var18, 100, var9);
                var19.method3192(0);
                class627.field8780.method2107(var19);
                arg0.field411 = var19;
                arg0.field414 = arg0.field418 + (int) ((double) (arg0.field403 - arg0.field418) * Math.random());
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)Lnp;", line = 206)
    public static final class453 method3230(byte arg0) {
        field7997++;
        try {
            if (arg0 < 38) {
                method3234(90);
            }
            return (class453) Class.forName("mh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(III[BIZLok;I)Lot;", line = 229)
    public static final class546 method3231(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, class228 arg6, int arg7) {
        if (arg1 != 100) {
            return null;
        }
        field7981++;
        if (!arg6.field3521 && (!class284.method1835(arg2, 79) || !class284.method1835(arg0, 111))) {
            return arg6.field3471 ? new class546(arg6, 34037, arg4, arg2, arg0, arg5, arg3, arg7) : new class546(arg6, arg4, arg2, arg0, class2.method9(arg2, arg1 ^ 0xFFFFFF84), class2.method9(arg0, 99), arg3, arg7);
        } else {
            return new class546(arg6, 3553, arg4, arg2, arg0, arg5, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)Lnw;", line = 258)
    public final class542 method3232(int arg0) {
        if (arg0 >= -109) {
            field7985 = null;
        }
        field7987++;
        return class668.method3702(26442, this.field7986);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIII)Llea;", line = 271)
    public final class568 method3233(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 89) {
            method3234(-10);
        }
        field7990++;
        return new class568(this.field7986, arg2, arg0, arg3, this.field7984);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V", line = 282)
    public static void method3234(int arg0) {
        if (arg0 < -37) {
            field7988 = null;
            field7985 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(IIIIB)V", line = 298)
    public class568(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field8000 = arg2;
        this.field7999 = arg1;
        this.field8001 = arg3;
        this.field7984 = arg4;
        this.field7986 = arg0;
    }
}
