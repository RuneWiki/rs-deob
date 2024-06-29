import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class530 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Luj;")
    public class476 field7789 = new class476();

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field7788 = 0;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lrb;")
    public static class283 field7804;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Luj;")
    private class476 field7801;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Luj;")
    public final class476 method3132(int arg0) {
        field7797++;
        if (arg0 != 0) {
            this.field7789 = null;
        }
        class476 var2 = this.field7801;
        if (this.field7789 == var2) {
            this.field7801 = null;
            return null;
        } else {
            this.field7801 = var2.field6884;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lmg;Luj;B)V")
    private final void method3133(class530 arg0, class476 arg1, byte arg2) {
        field7795++;
        if (arg2 != -120) {
            this.method3140(null, (byte) 82);
        }
        class476 var4 = this.field7789.field6879;
        this.field7789.field6879 = arg1.field6879;
        arg1.field6879.field6884 = this.field7789;
        if (this.field7789 != arg1) {
            arg1.field6879 = arg0.field7789.field6879;
            arg1.field6879.field6884 = arg1;
            arg0.field7789.field6879 = var4;
            var4.field6884 = arg0.field7789;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Luj;")
    public final class476 method3134(byte arg0) {
        field7798++;
        int var2 = 93 % ((34 - arg0) / 61);
        class476 var3 = this.field7789.field6884;
        if (this.field7789 == var3) {
            return null;
        } else {
            var3.method2791((byte) 112);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Z")
    public final boolean method3135(int arg0) {
        field7802++;
        if (arg0 != -19033) {
            field7804 = null;
        }
        return this.field7789.field6884 == this.field7789;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLgk;ILgk;Z)I")
    public static final int method3136(boolean arg0, class468 arg1, int arg2, class468 arg3, boolean arg4) {
        field7796++;
        if (arg2 == 1) {
            int var5 = arg3.field2691;
            int var6 = arg1.field2691;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class8.method53(class486.field6998, arg3.method2720(-13708).field3796, (byte) -109, arg1.method2720(-13708).field3796);
        } else if (arg2 == 3) {
            if (arg3.field6767.equals("-")) {
                if (arg1.field6767.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field6767.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class8.method53(class486.field6998, arg3.field6767, (byte) -109, arg1.field6767);
            }
        } else if (arg2 == 4) {
            if (arg3.method1231(true)) {
                return arg1.method1231(arg4) ? 0 : 1;
            } else if (arg1.method1231(arg4)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != 5) {
            if (!arg4) {
                method3144(-15);
            }
            if (arg2 == 6) {
                if (arg3.method1233(4)) {
                    return arg1.method1233(4) ? 0 : 1;
                } else if (arg1.method1233(4)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 7) {
                if (arg3.method1232(53)) {
                    return arg1.method1232(-93) ? 0 : 1;
                } else if (arg1.method1232(-127)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 8) {
                int var7 = arg3.field6770;
                int var8 = arg1.field6770;
                if (arg0) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg3.field6762 - arg1.field6762;
            }
        } else if (arg3.method1234((byte) -100)) {
            return arg1.method1234((byte) -100) ? 0 : 1;
        } else if (arg1.method1234((byte) -100)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Luj;")
    public final class476 method3137(int arg0) {
        field7805++;
        class476 var2 = this.field7789.field6884;
        if (this.field7789 == var2) {
            this.field7801 = null;
            return null;
        }
        if (arg0 != 0) {
            this.method3135(5);
        }
        this.field7801 = var2.field6884;
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIII)I")
    public static final int method3138(byte arg0, int arg1, int arg2, int arg3) {
        field7799++;
        int var4 = arg3 & 0x3;
        int var5 = 56 / ((67 - arg0) / 51);
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILuj;)V")
    public final void method3139(int arg0, class476 arg1) {
        if (arg1.field6879 != null) {
            arg1.method2791((byte) 112);
        }
        field7794++;
        arg1.field6879 = this.field7789.field6879;
        if (arg0 != 0) {
            this.field7801 = null;
        }
        arg1.field6884 = this.field7789;
        arg1.field6879.field6884 = arg1;
        arg1.field6884.field6879 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lmg;B)V")
    public final void method3140(class530 arg0, byte arg1) {
        field7791++;
        this.method3133(arg0, this.field7789.field6884, (byte) -120);
        if (arg1 != 0) {
            this.field7789 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(ILuj;)V")
    public final void method3141(int arg0, class476 arg1) {
        if (arg1.field6879 != null) {
            arg1.method2791((byte) 112);
        }
        field7803++;
        arg1.field6879 = this.field7789;
        arg1.field6884 = this.field7789.field6884;
        arg1.field6879.field6884 = arg1;
        arg1.field6884.field6879 = arg1;
        if (arg0 <= 43) {
            field7788 = 37;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)Luj;")
    public final class476 method3142(int arg0) {
        field7800++;
        class476 var2 = this.field7801;
        if (this.field7789 == var2) {
            this.field7801 = null;
            return null;
        }
        if (arg0 != 0) {
            this.method3134((byte) -19);
        }
        this.field7801 = var2.field6879;
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public final void method3143(boolean arg0) {
        while (true) {
            class476 var2 = this.field7789.field6884;
            if (this.field7789 == var2) {
                field7792++;
                if (!arg0) {
                    this.method3132(82);
                }
                this.field7801 = null;
                return;
            }
            var2.method2791((byte) 112);
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
    public static void method3144(int arg0) {
        field7804 = null;
        if (arg0 != 0) {
            field7804 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)Luj;")
    public final class476 method3145(int arg0) {
        field7790++;
        class476 var2 = this.field7789.field6879;
        if (arg0 != 0) {
            this.method3143(true);
        }
        if (this.field7789 == var2) {
            this.field7801 = null;
            return null;
        } else {
            this.field7801 = var2.field6879;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)I")
    public final int method3146(byte arg0) {
        field7793++;
        int var2 = 0;
        if (arg0 != -10) {
            this.method3141(-128, null);
        }
        for (class476 var3 = this.field7789.field6884; var3 != this.field7789; var3 = var3.field6884) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class530() {
        this.field7789.field6884 = this.field7789;
        this.field7789.field6879 = this.field7789;
    }
}
