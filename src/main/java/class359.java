import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class359 {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lr;")
    public class27 field5610 = new class27();

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lf;")
    public static class239 field5616;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lr;")
    private class27 field5617;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
    public static int[] field5615;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 6)
    public static void method2493(byte arg0) {
        field5615 = null;
        if (arg0 != 108) {
            field5616 = (class239) null;
        }
        field5616 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 17)
    public static final void method2494(byte arg0) {
        field5607++;
        if (arg0 >= -4) {
            return;
        }
        if (class16.field195 <= 0) {
            class339.field5290 = class265.field3848;
            class265.field3848 = null;
            class59.method445(40, (byte) 95);
        } else {
            class344.method2389(true);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[Lma;", line = 38)
    public static final class145[] method2495(int arg0) {
        field5609++;
        class145[] var1 = new class145[class171.field2369];
        for (int var2 = arg0; var2 < class171.field2369; var2++) {
            if (class47.field623) {
                var1[var2] = new class127(class16.field201, class133.field1805, class348.field5418[var2], class119.field1578[var2], class251.field3673[var2], class184.field2508[var2], class338.field5276[var2], class292.field4253);
            } else {
                var1[var2] = new class153(class16.field201, class133.field1805, class348.field5418[var2], class119.field1578[var2], class251.field3673[var2], class184.field2508[var2], class338.field5276[var2], class292.field4253);
            }
        }
        class236.method1685(false);
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 70)
    public final void method2496(int arg0) {
        while (true) {
            class27 var2 = this.field5610.field314;
            if (this.field5610 == var2) {
                field5608++;
                this.field5617 = null;
                if (arg0 != 25480) {
                    method2494((byte) -65);
                }
                return;
            }
            var2.method181(arg0 - 25467);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Lr;", line = 90)
    public final class27 method2497(byte arg0) {
        if (arg0 > -79) {
            method2498(19, (int[]) null, (int[]) null, -77, -31);
        }
        field5613++;
        class27 var2 = this.field5610.field314;
        if (this.field5610 == var2) {
            this.field5617 = null;
            return null;
        } else {
            this.field5617 = var2.field314;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[I[III)V", line = 121)
    public static final void method2498(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 != 40) {
            method2498(4, (int[]) null, (int[]) null, 107, -108);
        }
        field5611++;
        if (arg4 >= arg0) {
            return;
        }
        int var5 = arg4;
        int var6 = (arg0 + arg4) / 2;
        int var7 = arg2[var6];
        arg2[var6] = arg2[arg0];
        arg2[arg0] = var7;
        int var8 = arg1[var6];
        arg1[var6] = arg1[arg0];
        arg1[arg0] = var8;
        for (int var9 = arg4; var9 < arg0; var9++) {
            if (arg2[var9] > (var9 & 0x1) + var7) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5++] = var11;
            }
        }
        arg2[arg0] = arg2[var5];
        arg2[var5] = var7;
        arg1[arg0] = arg1[var5];
        arg1[var5] = var8;
        method2498(var5 - 1, arg1, arg2, 40, arg4);
        method2498(arg0, arg1, arg2, 40, var5 + 1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILr;)V", line = 176)
    public final void method2499(int arg0, class27 arg1) {
        if (arg1.field316 != null) {
            arg1.method181(13);
        }
        arg1.field314 = this.field5610;
        field5606++;
        arg1.field316 = this.field5610.field316;
        if (arg0 == -2260) {
            arg1.field316.field314 = arg1;
            arg1.field314.field316 = arg1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)Lr;", line = 195)
    public final class27 method2500(byte arg0) {
        class27 var2 = this.field5617;
        field5612++;
        if (arg0 != 38) {
            method2498(-90, (int[]) null, (int[]) null, -91, -94);
        }
        if (this.field5610 == var2) {
            this.field5617 = null;
            return null;
        } else {
            this.field5617 = var2.field314;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 221)
    public class359() {
        this.field5610.field314 = this.field5610;
        this.field5610.field316 = this.field5610;
    }
}
