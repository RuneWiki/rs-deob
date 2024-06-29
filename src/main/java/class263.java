import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class263 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lr;")
    public static class66 field4609 = class93.method641(43, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
    public static boolean field4614 = false;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lr;")
    public static class66 field4611 = class93.method641(43, ":assist:");

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lr;")
    public static class66 field4617 = class93.method641(43, "slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4618 = 0;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Llb;")
    public static class228 field4621;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[Ldh;")
    public static class265[] field4613;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLlh;)Llf;")
    public static final class99 method1784(boolean arg0, class249 arg1) {
        arg1.method1677(-6677);
        field4623++;
        int var2 = arg1.method1677(-6677);
        class99 var3 = class234.method1528(var2, (byte) -46);
        if (!arg0) {
            return null;
        }
        var3.field1949 = arg1.method1677(-6677);
        int var4 = arg1.method1677(-6677);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1677(-6677);
            var3.method11(arg1, var6, -1);
        }
        var3.method12((byte) -34);
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1785(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field4611 = null;
        field4621 = null;
        field4609 = null;
        field4613 = null;
        field4617 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4612++;
        if (arg0 >= -101) {
            field4609 = null;
        }
        int var7 = class54.method368(arg3, class222.field3788, (byte) 114, class241.field4186);
        int var8 = class54.method368(arg2, class222.field3788, (byte) 114, class241.field4186);
        int var9 = class54.method368(arg5, class215.field3706, (byte) 114, class165.field2972);
        int var10 = class54.method368(arg1, class215.field3706, (byte) 114, class165.field2972);
        int var11 = class54.method368(arg3 + arg4, class222.field3788, (byte) 114, class241.field4186);
        int var12 = class54.method368(arg2 - arg4, class222.field3788, (byte) 114, class241.field4186);
        for (int var13 = var7; var13 < var11; var13++) {
            class194.method1266(var9, (byte) -17, arg6, class15.field183[var13], var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class194.method1266(var9, (byte) -17, arg6, class15.field183[var14], var10);
        }
        int var15 = class54.method368(arg5 + arg4, class215.field3706, (byte) 114, class165.field2972);
        int var16 = class54.method368(arg1 - arg4, class215.field3706, (byte) 114, class165.field2972);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class15.field183[var17];
            class194.method1266(var9, (byte) -17, arg6, var18, var15);
            class194.method1266(var16, (byte) -17, arg6, var18, var10);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1787(int arg0, int arg1) {
        class174.field3066.method1611(-18767, arg1);
        class209.field3626.method1611(-18767, arg1);
        field4610++;
        class182.field3192.method1611(arg0 ^ 0xFFFFB6B1, arg1);
        if (arg0 != 0) {
            method1784(true, (class249) null);
        }
    }
}
