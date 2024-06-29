import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class139 extends class171 {

    @OriginalMember(owner = "client!ti", name = "pc", descriptor = "Lmj;")
    public static class144 field2322 = new class144(32);

    @OriginalMember(owner = "client!ti", name = "wc", descriptor = "Lre;")
    public static class266 field2329 = new class266();

    @OriginalMember(owner = "client!ti", name = "zc", descriptor = "Ljava/lang/String;")
    public static String field2332 = "Choose Option";

    @OriginalMember(owner = "client!ti", name = "kc", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ti", name = "lc", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ti", name = "mc", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ti", name = "nc", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ti", name = "qc", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!ti", name = "rc", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ti", name = "sc", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ti", name = "tc", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ti", name = "uc", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ti", name = "xc", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ti", name = "yc", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ti", name = "oc", descriptor = "Luf;")
    public class165 field2321;

    @OriginalMember(owner = "client!ti", name = "vc", descriptor = "Ljava/lang/String;")
    public static String field2328;

    @OriginalMember(owner = "client!ti", name = "Ac", descriptor = "[I")
    public static int[] field2333;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIIIJILpj;)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class98 arg10) {
        ++field2320;
        if (this.field2321 != null) {
            class77 var13 = ~super.field2816 != 0 && super.field2885 == 0 ? class28.method246(112, super.field2816) : null;
            class77 var14 = ~super.field2901 == 0 || ~super.field2901 == ~this.method1224(-1).field651 && var13 != null ? null : class28.method246(72, super.field2901);
            class168 var15 = this.field2321.method1195(var14, super.field2886, super.field2858, super.field2903, super.field2847, super.field2902, super.field2811, super.field2826, var13, (byte) 43);
            if (var15 != null) {
                super.field2830 = var15.method99();
                class165 var16 = this.field2321;
                if (var16.field2741 != null) {
                    var16 = var16.method1188((byte) -112);
                }
                if (class153.field2496 && var16.field2717) {
                    class168 var17 = class179.method1265(this.field2321.field2682, var14 == null ? var13 : var14, arg0, super.field2887, super.field2851, this.field2321.field2699, this.field2321.field2740, this.field2321.field2713, 32720, super.field2837, var14 != null ? super.field2858 : super.field2903, var15, this.field2321.field2715, super.field2849);
                    var17.method98(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field2828);
                }
                this.method1227(var15, false);
                this.method1230(2, var15, arg0);
                class168 var18 = null;
                if (super.field2817 != -1 && ~super.field2812 != 0) {
                    class281 var19 = class35.method298(super.field2817, false);
                    var18 = var19.method1888((byte) 36, super.field2897, super.field2812, super.field2823);
                    if (var18 != null) {
                        var18.method339(0, -super.field2807, 0);
                        if (var19.field4458) {
                            if (class278.field4411 != 0) {
                                var18.method350(class278.field4411);
                            }
                            if (class241.field3816 != 0) {
                                var18.method335(class241.field3816);
                            }
                            if (class113.field1745 != 0) {
                                var18.method339(0, class113.field1745, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class41) var15).method343(var18);
                }
                if (this.field2321.field2682 == 1) {
                    var15.field2758 = true;
                }
                var15.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2828);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILuf;)V")
    public final void method1038(int arg0, class165 arg1) {
        this.field2321 = arg1;
        ++field2318;
        if (arg0 == -15565) {
            if (super.field2828 != null) {
                super.field2828.method743();
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(IIIII)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2324;
        if (this.field2321 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
    public final int method99() {
        ++field2330;
        return super.field2830;
    }

    @OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2317;
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field2328 = null;
        field2322 = null;
        field2333 = null;
        field2329 = null;
        field2332 = null;
        if (arg0 != -1) {
            field2328 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)I")
    public final int method1040(int arg0) {
        ++field2319;
        if (arg0 != -1) {
            field2326 = -125;
        }
        if (class238.field3752 != 0 && this.field2321.field2741 != null) {
            class165 var2 = this.field2321.method1188((byte) -79);
            if (var2 != null && var2.field2702 != -1) {
                return var2.field2702;
            }
        }
        return super.field2835;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)Z")
    public final boolean method1041(byte arg0) {
        int var2 = 83 % ((arg0 - -60) / 43);
        ++field2323;
        return this.field2321 != null;
    }
}
