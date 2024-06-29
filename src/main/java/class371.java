import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class371 extends class192 implements class518 {

    @OriginalMember(owner = "client!up", name = "B", descriptor = "Lpe;")
    public class461 field5726;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "Z")
    private boolean field5727;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "[I")
    public static int[] field5734 = new int[1024];

    @OriginalMember(owner = "client!up", name = "G", descriptor = "Lnk;")
    public static class326 field5731 = new class326(36, 4);

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(B)V")
    public static void method2340(byte arg0) {
        field5734 = null;
        int var1 = 98 / ((arg0 - 54) / 61);
        field5731 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([Lo;I)V")
    public static final void method2341(class138[] arg0, int arg1) {
        class182.field2875 = arg0.length;
        ++field5729;
        if (arg1 > 24) {
            class315.field4961 = new class138[class182.field2875 + 10];
            class491.field7177 = new int[class182.field2875 + 10];
            class85.method611(arg0, 0, class315.field4961, 0, class182.field2875);
            for (int var2 = 0; var2 < class182.field2875; ++var2) {
                class491.field7177[var2] = class315.field4961[var2].method198();
            }
            for (int var3 = class182.field2875; ~var3 > ~class315.field4961.length; ++var3) {
                class491.field7177[var3] = 12;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field5733;
        if (arg1 <= 121) {
            return true;
        } else {
            class530 var5 = this.field5726.method2746(super.field2978, (byte) -120, arg0, 131072, false, super.field2988, false);
            if (var5 == null) {
                return false;
            } else {
                class202 var6 = arg0.method820();
                var6.method1246(super.field2983 + super.field2978, super.field2981, super.field2988 + super.field2984);
                return var5.method776(arg3, arg2, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
    public final int method28(byte arg0) {
        ++field5732;
        if (arg0 != -118) {
            this.method32(74, (class491) null, -112);
        }
        return this.field5726.field6843;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(BLza;)V")
    public final void method43(byte arg0, class491 arg1) {
        ++field5721;
        class530 var3 = this.field5726.method2746(super.field2978, (byte) -111, arg1, 262144, true, super.field2988, false);
        if (var3 != null) {
            int var4 = super.field2978 >> 7;
            int var5 = super.field2988 >> 7;
            this.field5726.method2744(arg1, var5, var4, var3, var4, var5, -1, false);
        }
        if (arg0 != 35) {
            this.method34(-53, (class491) null);
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        int var2 = -76 / ((8 - arg0) / 45);
        ++field5736;
        return this.field5726.method2751(-67);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILza;)V")
    public final void method34(int arg0, class491 arg1) {
        if (arg0 == 25747) {
            this.field5726.method2750(arg1, (byte) 121);
            ++field5720;
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    public final void method31(int arg0) {
        ++field5725;
        int var2 = 98 % ((arg0 - 57) / 48);
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)V")
    public static final void method2342(boolean arg0) {
        class265.method1775(-2, class462.field6875);
        if (arg0) {
            field5734 = null;
        }
        ++class24.field336;
        ++field5719;
        class261.field4357.method163(0, (byte) 49);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(ILza;)Lsr;")
    public final class430 method40(int arg0, class491 arg1) {
        ++field5728;
        class530 var3 = this.field5726.method2746(super.field2978, (byte) -114, arg1, 2048, true, super.field2988, false);
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = arg1.method820();
            var4.method1246(super.field2983 + super.field2978, super.field2981, super.field2988 + super.field2984);
            class430 var5 = null;
            if (this.field5727) {
                var5 = class21.method111((byte) 110, 1);
            }
            if (this.field5726.field6824 == null) {
                var3.method736(var4, var5 == null ? null : var5.field6447[0], 0);
            } else {
                class66 var6 = this.field5726.field6824.method964();
                arg1.method853(var3, var6, var4, var5 == null ? null : var5.field6447[0], 0);
            }
            int var7 = super.field2978 >> 7;
            int var8 = super.field2988 >> 7;
            if (arg0 >= -24) {
                method2340((byte) -122);
            }
            this.field5726.method2744(arg1, var8, var7, var3, var7, var8, -1, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILza;I)Le;")
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        int var4 = -117 % ((arg2 - -24) / 60);
        ++field5735;
        return this.field5726.method2746(0, (byte) -112, arg1, arg0, false, 0, false);
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)I")
    public final int method274(int arg0) {
        ++field5737;
        if (arg0 != -2) {
            this.field5727 = false;
        }
        return this.field5726.method2752(false);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)I")
    public final int method38(int arg0) {
        ++field5730;
        if (arg0 != 5638) {
            this.field5726 = null;
        }
        return this.field5726.field6842;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
    public final int method29(int arg0) {
        ++field5723;
        int var2 = -118 % ((40 - arg0) / 52);
        return this.field5726.field6856;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lza;Lp;IIIIIZIIIIII)V")
    public class371(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class434.method2629(4, arg12, arg11));
        this.field5726 = new class461(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field5727 = arg1.field618 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BLza;)V")
    public final void method26(byte arg0, class491 arg1) {
        ++field5724;
        this.field5726.method2748((byte) 119, arg1);
        if (arg0 != 111) {
            field5731 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(B)V")
    public static final void method2343(byte arg0) {
        if (arg0 > 110) {
            ++field5722;
            class116.field2068 = new class411();
        }
    }
}
