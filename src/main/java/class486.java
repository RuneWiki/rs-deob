import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class486 {

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "Lah;")
    public class238 field6838 = new class238();

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Ldk;")
    public static class326 field6844 = new class326("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "J")
    public static long field6845 = 0L;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "[Lrp;")
    public static class276[] field6847 = new class276[2048];

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "Lah;")
    private class238 field6848;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public final void method2838(byte arg0) {
        while (true) {
            class238 var2 = this.field6838.field3575;
            if (this.field6838 == var2) {
                if (arg0 < 0) {
                    this.field6838 = null;
                }
                field6836++;
                this.field6848 = null;
                return;
            }
            var2.method1510((byte) -13);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Lah;")
    public final class238 method2839(int arg0) {
        if (arg0 != -31216) {
            field6844 = null;
        }
        field6835++;
        class238 var2 = this.field6838.field3575;
        if (this.field6838 == var2) {
            return null;
        } else {
            var2.method1510((byte) -13);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lkr;I)V")
    public final void method2840(class486 arg0, int arg1) {
        if (arg1 != 64) {
            method2841(false);
        }
        field6833++;
        this.method2844((byte) -13, arg0, this.field6838.field3575);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public static void method2841(boolean arg0) {
        field6844 = null;
        if (arg0) {
            field6847 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Lah;")
    public final class238 method2842(int arg0) {
        field6834++;
        if (arg0 != 1673506446) {
            this.method2840((class486) null, -31);
        }
        class238 var2 = this.field6848;
        if (this.field6838 == var2) {
            this.field6848 = null;
            return null;
        } else {
            this.field6848 = var2.field3575;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)Lah;")
    public final class238 method2843(int arg0) {
        if (arg0 != 1123227612) {
            field6847 = null;
        }
        field6837++;
        class238 var2 = this.field6838.field3575;
        if (this.field6838 == var2) {
            this.field6848 = null;
            return null;
        } else {
            this.field6848 = var2.field3575;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLkr;Lah;)V")
    private final void method2844(byte arg0, class486 arg1, class238 arg2) {
        field6842++;
        if (arg0 != -13) {
            method2848(-87, 31, -111, -47);
        }
        class238 var4 = this.field6838.field3576;
        this.field6838.field3576 = arg2.field3576;
        arg2.field3576.field3575 = this.field6838;
        if (this.field6838 != arg2) {
            arg2.field3576 = arg1.field6838.field3576;
            arg2.field3576.field3575 = arg2;
            var4.field3575 = arg1.field6838;
            arg1.field6838.field3576 = var4;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lah;B)V")
    public final void method2845(class238 arg0, byte arg1) {
        if (arg0.field3576 != null) {
            arg0.method1510((byte) -13);
        }
        field6840++;
        arg0.field3576 = this.field6838.field3576;
        arg0.field3575 = this.field6838;
        arg0.field3576.field3575 = arg0;
        arg0.field3575.field3576 = arg0;
        if (arg1 != 37) {
            field6844 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lah;I)V")
    public final void method2846(class238 arg0, int arg1) {
        field6846++;
        if (arg0.field3576 != null) {
            arg0.method1510((byte) -13);
        }
        arg0.field3575 = this.field6838.field3575;
        arg0.field3576 = this.field6838;
        arg0.field3576.field3575 = arg0;
        arg0.field3575.field3576 = arg0;
        if (arg1 != 2048) {
            field6845 = -50L;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)Lah;")
    public final class238 method2847(byte arg0) {
        field6839++;
        if (arg0 != 86) {
            field6847 = null;
        }
        class238 var2 = this.field6838.field3576;
        if (this.field6838 == var2) {
            this.field6848 = null;
            return null;
        } else {
            this.field6848 = var2.field3576;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
    public static final void method2848(int arg0, int arg1, int arg2, int arg3) {
        field6832++;
        if (class330.field4786 == null) {
            return;
        }
        long var4 = (long) (arg0 | arg1 << 28 | arg3 << 14);
        class442 var6 = (class442) class269.field3928.method2761(var4, (byte) -112);
        if (var6 == null) {
            class393.method2349(arg1, arg0, arg3);
            return;
        }
        class71 var7 = (class71) var6.field6126.method2843(1123227612);
        if (var7 == null) {
            class393.method2349(arg1, arg0, arg3);
        } else if (arg2 == -25665) {
            class286 var8 = (class286) class393.method2349(arg1, arg0, arg3);
            if (var8 == null) {
                var8 = new class286();
            } else {
                var8.field4168 = var8.field4175 = -1;
            }
            var8.field4178 = var7.field885;
            var8.field4177 = var7.field887;
            label48: while (true) {
                class71 var9 = (class71) var6.field6126.method2842(1673506446);
                if (var9 == null) {
                    break;
                }
                if (var8.field4178 != var9.field885) {
                    var8.field4168 = var9.field885;
                    var8.field4170 = var9.field887;
                    while (true) {
                        class71 var10 = (class71) var6.field6126.method2842(1673506446);
                        if (var10 == null) {
                            break label48;
                        }
                        if (var8.field4178 != var10.field885 && var8.field4168 != var10.field885) {
                            var8.field4175 = var10.field885;
                            var8.field4176 = var10.field887;
                        }
                    }
                }
            }
            int var11 = class132.method835((arg3 << 7) + 64, arg1, (arg0 << 7) + 64, 2002);
            class54.method342(arg1, arg0, arg3, var11, var8);
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)Lah;")
    public final class238 method2849(int arg0) {
        field6831++;
        class238 var2 = this.field6848;
        if (this.field6838 == var2) {
            this.field6848 = null;
            return null;
        }
        if (arg0 != -44984953) {
            this.method2839(22);
        }
        this.field6848 = var2.field3576;
        return var2;
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)I")
    public final int method2850(int arg0) {
        field6841++;
        int var2 = arg0;
        class238 var3 = this.field6838.field3575;
        while (this.field6838 != var3) {
            var3 = var3.field3575;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)Z")
    public final boolean method2851(boolean arg0) {
        if (arg0) {
            this.method2846((class238) null, -72);
        }
        field6843++;
        return this.field6838.field3575 == this.field6838;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
    public class486() {
        this.field6838.field3575 = this.field6838;
        this.field6838.field3576 = this.field6838;
    }
}
