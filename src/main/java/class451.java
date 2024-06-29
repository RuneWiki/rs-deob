import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class451 extends class597 implements class339 {

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Z")
    private boolean field5769 = false;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "Lrea;")
    public class567 field5779;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "Z")
    private boolean field5776;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "Llea;")
    public static class326 field5774 = new class326();

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "[Z")
    public static boolean[] field5788 = new boolean[5];

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field5790 = 0;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "Lsd;")
    private class362 field5770;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLr;)Log;", line = 4)
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field5782;
        class474 var3 = this.field5779.method3130(!arg0, super.field6461, arg1, true, arg0, super.field6464, 2048);
        if (var3 == null) {
            return null;
        } else {
            class491 var4 = arg1.method995();
            var4.method914(super.field6461, super.field6458, super.field6464);
            class101 var5 = null;
            if (this.field5776) {
                var5 = class676.method3794(true, 1);
            }
            int var6 = super.field6461 >> 9;
            int var7 = super.field6464 >> 9;
            this.field5779.method3129(var3, var6, arg1, var7, true, var6, var7, -118, var4);
            if (!class36.field498) {
                var3.method717(var4, var5 != null ? var5.field1361[0] : null, 0);
            } else {
                var3.method751(var4, var5 != null ? var5.field1361[0] : null, class432.field5406, 0);
            }
            if (this.field5779.field7939 != null) {
                class27 var8 = this.field5779.field7939.method545();
                if (!class36.field498) {
                    arg1.method993(var8);
                } else {
                    arg1.method999(var8, class432.field5406);
                }
            }
            this.field5769 = var3.method740() || this.field5779.field7939 != null;
            if (this.field5770 == null) {
                this.field5770 = class286.method1606(-24294, super.field6458, var3, super.field6464, super.field6461);
            } else {
                class227.method1360(var3, super.field6461, this.field5770, super.field6458, super.field6464, 26219);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(ZLr;)V", line = 55)
    public final void method67(boolean arg0, class566 arg1) {
        ++field5780;
        class474 var3 = this.field5779.method3130(true, super.field6461, arg1, true, true, super.field6464, 262144);
        if (var3 != null) {
            int var4 = super.field6461 >> 9;
            int var5 = super.field6464 >> 9;
            class491 var6 = arg1.method995();
            var6.method914(super.field6461, super.field6458, super.field6464);
            this.field5779.method3129(var3, var4, arg1, var5, false, var4, var5, -120, var6);
        }
        if (arg0) {
            this.field5776 = false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I", line = 81)
    public final int method72(int arg0) {
        ++field5783;
        return arg0 != -22496 ? -126 : this.field5779.method3128(arg0 + 50606);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZ)Z", line = 93)
    public static boolean method2420(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lr;I)Lsd;", line = 101)
    public final class362 method82(class566 arg0, int arg1) {
        if (arg1 != -1660704056) {
            this.method79((byte) 119);
        }
        ++field5787;
        return this.field5770;
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(B)Z", line = 115)
    public final boolean method79(byte arg0) {
        ++field5771;
        return arg0 > -26;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)I", line = 126)
    public final int method65(byte arg0) {
        if (arg0 <= 126) {
            this.method74((byte) 30);
        }
        ++field5772;
        return this.field5779.field7927;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLr;)V", line = 140)
    public final void method70(byte arg0, class566 arg1) {
        int var3 = -118 / ((arg0 - -19) / 34);
        this.field5779.method3120((byte) 88, arg1);
        ++field5777;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 150)
    public final void method81(boolean arg0) {
        ++field5773;
        if (arg0) {
            this.method68((byte) 26);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V", line = 161)
    public static void method2421(boolean arg0) {
        field5788 = null;
        field5774 = null;
        if (!arg0) {
            field5790 = 23;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(BLr;)V", line = 172)
    public final void method80(byte arg0, class566 arg1) {
        if (arg0 != -114) {
            field5774 = null;
        }
        ++field5781;
        this.field5779.method3123(2, arg1);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lr;Lbda;IIIIIZIII)V", line = 214)
    public class451(class566 arg0, class441 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class290.method1627(arg8, (byte) 120, arg9));
        this.field5779 = new class567(arg0, arg1, arg8, arg9, super.field6470, arg3, super.field6461, super.field6464, arg7, arg10);
        this.field5776 = ~arg1.field5560 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)Z", line = 188)
    public final boolean method83(byte arg0) {
        ++field5775;
        return arg0 != 23 ? true : this.field5769;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIBLr;Llo;II)V", line = 202)
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        int var8 = -101 % ((arg2 - -50) / 55);
        ++field5793;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)I", line = 224)
    public final int method78(byte arg0) {
        int var2 = 21 / ((12 - arg0) / 48);
        ++field5786;
        return this.field5779.field7940;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Z", line = 235)
    public final boolean method64(int arg0) {
        ++field5792;
        if (arg0 != 3755) {
            this.method72(7);
        }
        return this.field5779.method3126(0);
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 246)
    public final void method66(int arg0) {
        if (arg0 != -1) {
            field5788 = null;
        }
        ++field5785;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I", line = 257)
    public final int method74(byte arg0) {
        ++field5789;
        return arg0 != 42 ? -99 : this.field5779.field7925;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)I", line = 272)
    public final int method71(int arg0) {
        int var2 = 55 / ((arg0 - -43) / 59);
        ++field5791;
        return this.field5779.method3131((byte) -99);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILr;I)Z", line = 282)
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        ++field5778;
        class474 var5 = this.field5779.method3130(true, super.field6461, arg2, false, false, super.field6464, 131072);
        if (var5 == null) {
            return false;
        } else if (arg3 != 9678) {
            return false;
        } else {
            class491 var6 = arg2.method995();
            var6.method914(super.field6461, super.field6458, super.field6464);
            return class36.field498 ? var5.method738(arg0, arg1, var6, false, class432.field5406) : var5.method744(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(B)Z", line = 301)
    public final boolean method68(byte arg0) {
        ++field5784;
        if (arg0 < 114) {
            this.field5776 = true;
        }
        return false;
    }
}
