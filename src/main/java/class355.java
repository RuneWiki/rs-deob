import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class355 extends class232 implements class21 {

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "Lvr;")
    public class92 field5100;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "Z")
    private boolean field5098;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "[[[I")
    public static int[][][] field5087 = new int[2][][];

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)I")
    public final int method110(byte arg0) {
        if (arg0 <= 100) {
            this.method117((class290) null, (byte) -66);
        }
        ++field5092;
        return this.field5100.field1174;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
    public final int method112(int arg0) {
        ++field5082;
        int var2 = 47 % ((arg0 - -5) / 55);
        return this.field5100.field1177;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lza;B)V")
    public final void method117(class290 arg0, byte arg1) {
        ++field5094;
        this.field5100.method653(arg0, -1);
        if (arg1 != -38) {
            field5085 = 109;
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
    public final void method115(int arg0) {
        ++field5086;
        if (arg0 != 16372) {
            field5085 = -115;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lza;Lfu;IIIIIZIII)V")
    public class355(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class260.method1667(3, arg8, arg9));
        this.field5100 = new class92(arg0, arg1, arg8, arg9, arg2, arg3, super.field3402, super.field3400, arg7, arg10);
        this.field5098 = ~arg1.field3957 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lza;B)Lkf;")
    public final class170 method126(class290 arg0, byte arg1) {
        ++field5084;
        class377 var3 = this.field5100.method662(super.field3400, false, (byte) 88, true, super.field3402, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class125 var4 = arg0.method368();
            var4.method825(super.field3402, super.field3406, super.field3400);
            class170 var5 = null;
            if (this.field5098) {
                var5 = class423.method2509(0, 1);
            }
            if (arg1 > -86) {
                method2096(-112);
            }
            if (this.field5100.field1157 == null) {
                var3.method1566(var4, var5 != null ? var5.field2475[0] : null, 0);
            } else {
                class324 var6 = this.field5100.field1157.method2084();
                arg0.method345(var3, var6, var4, var5 != null ? var5.field2475[0] : null, 0);
            }
            int var7 = super.field3402 >> 7;
            int var8 = super.field3400 >> 7;
            this.field5100.method664(var3, true, var7, arg0, true, var7, var8, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILza;I)Z")
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field5096;
        class377 var5 = this.field5100.method662(super.field3400, false, (byte) 127, false, super.field3402, arg2, 131072);
        if (var5 == null) {
            return false;
        } else {
            class125 var6 = arg2.method368();
            var6.method825(super.field3402, super.field3406, super.field3400);
            return arg0 != 3 ? false : var5.method1586(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)I")
    public final int method114(int arg0) {
        if (arg0 != -9772) {
            this.field5100 = null;
        }
        ++field5081;
        return this.field5100.field1154;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lza;I)V")
    public final void method130(class290 arg0, int arg1) {
        ++field5091;
        class377 var3 = this.field5100.method662(super.field3400, true, (byte) 122, true, super.field3402, arg0, 262144);
        if (arg1 != 0) {
            field5087 = null;
        }
        if (var3 != null) {
            int var4 = super.field3402 >> 7;
            int var5 = super.field3400 >> 7;
            this.field5100.method664(var3, false, var4, arg0, true, var4, var5, var5);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        ++field5088;
        if (arg0 >= -71) {
            this.method114(-115);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 != 31692) {
            this.method115(-57);
        }
        ++field5097;
        return this.field5100.method654((byte) 105);
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V")
    public static final void method2096(int arg0) {
        class494.field6988 = new class150[class218.field3157.method434(arg0 + 26154)][];
        if (arg0 == 0) {
            ++field5095;
            class88.field1105 = new class150[class218.field3157.method434(arg0 ^ 26154)][];
            class401.field5640 = new boolean[class218.field3157.method434(arg0 + 26154)];
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        if (arg0 != 102) {
            return true;
        } else {
            ++field5099;
            return false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILza;)V")
    public final void method111(int arg0, class290 arg1) {
        this.field5100.method657(false, arg1);
        ++field5093;
        if (arg0 != -38) {
            this.method113(49);
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V")
    public final void method120(int arg0) {
        ++field5083;
        if (arg0 != 0) {
            field5087 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
    public static final void method2097(byte arg0) {
        class335.field4854.method1096((byte) 109);
        ++field5090;
        if (arg0 >= -85) {
            field5085 = 109;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILza;I)Le;")
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        if (arg0 != 13439) {
            return null;
        } else {
            ++field5089;
            return this.field5100.method662(0, false, (byte) 90, false, 0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
    public static void method2098(byte arg0) {
        if (arg0 != 108) {
            field5087 = null;
        }
        field5087 = null;
    }
}
