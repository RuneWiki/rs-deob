import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class480 {

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Lwp;")
    public static final class163 method2699(byte arg0) {
        field6618++;
        if (class510.field6985 == null || class586.field8249 == null) {
            return null;
        }
        class586.field8249.method3762(class510.field6985, true);
        class163 var1 = (class163) class586.field8249.method3765(-1968);
        if (var1 == null) {
            return null;
        } else {
            int var2 = 93 % ((57 - arg0) / 57);
            class165 var3 = class510.field6981.method3709((byte) 43, var1.field2338);
            return var3 != null && var3.field2404 && var3.method1158(class510.field6978, 124) ? var1 : class485.method2758((byte) -55);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static final void method2700(int arg0) {
        field6617++;
        if (arg0 < -124) {
            class244.method1509(true);
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
    public static final void method2701(int arg0) {
        field6620++;
        if (class273.field3739 == 1 || class273.field3739 == 3 || class273.field3739 != class236.field3253 && (class273.field3739 == 0 || class236.field3253 == 0)) {
            class254.field3465 = 0;
            class698.field9912 = 0;
            class299.field4071.method974(arg0 ^ 0x4058);
        }
        if (arg0 == -4014) {
            class236.field3253 = class273.field3739;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIJ)V")
    public static final void method2702(int arg0, int arg1, int arg2, long arg3) {
        field6619++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = ((int) arg3 & 0x3A4A63) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (arg1 != var5 && var5 != 11 && var5 != 22) {
            class151.method1091(arg2, true, var6, arg1 ^ 0xEB8, var5, arg0, 0, 0, 0);
            return;
        }
        class301 var8 = class475.field6543.method2685(var7, -100);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field4119;
            var9 = var8.field4109;
        } else {
            var9 = var8.field4119;
            var10 = var8.field4109;
        }
        int var11 = var8.field4123;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class151.method1091(arg2, true, 0, arg1 ^ 0xEB8, 0, arg0, var11, var9, var10);
    }
}
