import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class320 {

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[Lu;")
    public static class278[] field5071 = new class278[32768];

    @OriginalMember(owner = "client!te", name = "k", descriptor = "F")
    public static float field5072;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "J")
    public long field5062;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lnc;")
    public static class160 field5064;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lte;")
    public class320 field5065;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lte;")
    public class320 field5068;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 7)
    public final void method2195(int arg0) {
        field5063++;
        if (this.field5065 == null) {
            return;
        }
        this.field5065.field5068 = this.field5068;
        this.field5068.field5065 = this.field5065;
        this.field5068 = null;
        this.field5065 = null;
        if (arg0 != -1) {
            field5069 = -82;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V", line = 28)
    public static final void method2196(int arg0, int arg1, int arg2, int arg3) {
        field5066++;
        String var4 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        if (arg2 == 0) {
            System.out.println(var4);
            class349.method2439(var4, 768);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 42)
    public static void method2197(int arg0) {
        if (arg0 != -314671962) {
            field5071 = (class278[]) null;
        }
        field5064 = null;
        field5071 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILof;B)V", line = 54)
    public static final void method2198(int arg0, int arg1, int arg2, int arg3, class261 arg4, byte arg5) {
        field5067++;
        if (arg4.field4223 == -1 && arg4.field4238 == null) {
            return;
        }
        int var6 = 0;
        if (arg4.field4220 < arg0) {
            var6 += arg0 - arg4.field4220;
        } else if (arg0 < arg4.field4230) {
            var6 += arg4.field4230 - arg0;
        }
        int var7 = class29.field393 * arg4.field4235 >> 8;
        int var8 = 69 / ((-arg5 - 79) / 38);
        if (arg2 > arg4.field4225) {
            var6 += arg2 - arg4.field4225;
        } else if (arg4.field4228 > arg2) {
            var6 += arg4.field4228 - arg2;
        }
        if (arg4.field4239 == 0 || var6 - 64 > arg4.field4239 || class29.field393 == 0 || arg4.field4219 != arg1) {
            if (arg4.field4229 != null) {
                class1.field9.method1839(arg4.field4229);
                arg4.field4229 = null;
            }
            if (arg4.field4215 != null) {
                class1.field9.method1839(arg4.field4215);
                arg4.field4215 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var9 = (arg4.field4239 - var6) * var7 / arg4.field4239;
        if (arg4.field4229 != null) {
            arg4.field4229.method2039(var9);
        } else if (arg4.field4223 >= 0) {
            class22 var10 = class22.method220(class207.field3517, arg4.field4223, 0);
            if (var10 != null) {
                class76 var11 = var10.method223().method701(class210.field3559);
                class299 var12 = class299.method2034(var11, 100, var9);
                var12.method2040(-1);
                class1.field9.method1840(var12);
                arg4.field4229 = var12;
            }
        }
        if (arg4.field4215 != null) {
            arg4.field4215.method2039(var9);
            if (!arg4.field4215.method2199(true)) {
                arg4.field4215 = null;
            }
        } else if (arg4.field4238 != null && (arg4.field4237 -= arg3) <= 0) {
            int var13 = (int) ((double) arg4.field4238.length * Math.random());
            class22 var14 = class22.method220(class207.field3517, arg4.field4238[var13], 0);
            if (var14 != null) {
                class76 var15 = var14.method223().method701(class210.field3559);
                class299 var16 = class299.method2034(var15, 100, var9);
                var16.method2040(0);
                class1.field9.method1840(var16);
                arg4.field4215 = var16;
                arg4.field4237 = (int) (Math.random() * (double) (arg4.field4224 - arg4.field4221)) + arg4.field4221;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z", line = 192)
    public final boolean method2199(boolean arg0) {
        field5070++;
        if (!arg0) {
            field5064 = (class160) null;
        }
        return this.field5065 != null;
    }
}
