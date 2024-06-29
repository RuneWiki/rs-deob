import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class256 extends class286 {

    @OriginalMember(owner = "client!ka", name = "vc", descriptor = "Lbf;")
    public static class199 field4580 = new class199(64);

    @OriginalMember(owner = "client!ka", name = "Ac", descriptor = "Z")
    public static boolean field4585 = true;

    @OriginalMember(owner = "client!ka", name = "Cc", descriptor = "I")
    public static int field4587 = -1;

    @OriginalMember(owner = "client!ka", name = "Dc", descriptor = "Z")
    public static boolean field4588 = false;

    @OriginalMember(owner = "client!ka", name = "Ec", descriptor = "Lqk;")
    public static class207 field4589 = class24.method212(255, "leuchten2:");

    @OriginalMember(owner = "client!ka", name = "pc", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ka", name = "qc", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ka", name = "rc", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ka", name = "sc", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ka", name = "tc", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ka", name = "uc", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ka", name = "xc", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!ka", name = "yc", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!ka", name = "zc", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ka", name = "Bc", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ka", name = "wc", descriptor = "Lvg;")
    public class72 field4581;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)I")
    public final int method85(boolean arg0) {
        ++field4583;
        if (class171.field3035 != 0 && this.field4581.field1293 != null) {
            class72 var2 = this.field4581.method517(-29);
            if (var2 != null && ~var2.field1324 != 0) {
                return var2.field1324;
            }
        }
        if (arg0) {
            this.method80();
        }
        return super.field5107;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
    public static void method1777(int arg0) {
        if (arg0 >= -87) {
            method1779(100, 32);
        }
        field4580 = null;
        field4589 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()I")
    public final int method80() {
        ++field4578;
        return super.field5018;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BZ)Lrg;")
    public static final class226 method1778(byte[] arg0, boolean arg1) {
        ++field4584;
        if (arg1) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            class205 var2 = new class205(arg0, class287.field5127, class170.field3021, class107.field1895, class241.field4402, class185.field3286);
            class116.method821((byte) -128);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4576;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIIJILe;)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        ++field4575;
        if (this.field4581 != null) {
            class65 var13 = super.field5052 != -1 && super.field5103 == 0 ? class16.method101((byte) 112, super.field5052) : null;
            class65 var14 = ~super.field5039 == 0 || super.field5039 == this.method1947(9).field3539 && var13 != null ? null : class16.method101((byte) 80, super.field5039);
            class166 var15 = this.field4581.method519((byte) -67, super.field5069, super.field5026, super.field5076, super.field5065, super.field5077, super.field5047, super.field5081, var14, var13);
            if (var15 != null) {
                super.field5018 = var15.method80();
                class72 var16 = this.field4581;
                if (var16.field1293 != null) {
                    var16 = var16.method517(-51);
                }
                if (class230.field4214 && var16.field1289) {
                    class166 var17 = class135.method942(arg0, super.field5072, this.field4581.field1306, (byte) -7, this.field4581.field1287, this.field4581.field1303, this.field4581.field1320, var14 == null ? var13 : var14, super.field5104, super.field5053, var14 == null ? super.field5069 : super.field5077, this.field4581.field1310, var15, super.field5037);
                    var17.method87(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field5093);
                }
                this.method1944(var15, 58);
                this.method1953(arg0, var15, -1);
                class166 var18 = null;
                if (~super.field5105 != 0 && ~super.field5080 != 0) {
                    class234 var19 = class165.method1192(super.field5105, -113);
                    var18 = var19.method1673(super.field5080, -104, super.field5012, super.field5088);
                    if (var18 != null) {
                        var18.method274(0, -super.field5096, 0);
                        if (var19.field4322) {
                            if (class212.field3771 != 0) {
                                var18.method281(class212.field3771);
                            }
                            if (~class26.field537 != -1) {
                                var18.method267(class26.field537);
                            }
                            if (class162.field2865 != 0) {
                                var18.method274(0, class162.field2865, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class37) var15).method297(var18);
                }
                if (~this.field4581.field1303 == -2) {
                    var15.field2926 = true;
                }
                var15.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field5093);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)Z")
    public final boolean method90(byte arg0) {
        int var2 = -71 / ((arg0 - -55) / 40);
        ++field4577;
        return this.field4581 != null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
    public static final void method1779(int arg0, int arg1) {
        class2.field38.method1383(-8052, arg0);
        ++field4579;
        if (arg1 != 0) {
            field4587 = 127;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4586;
        if (this.field4581 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLvg;)V")
    public final void method1780(byte arg0, class72 arg1) {
        ++field4574;
        this.field4581 = arg1;
        if (arg0 != 57) {
            this.method80();
        }
        if (super.field5093 != null) {
            super.field5093.method464();
        }
    }
}
