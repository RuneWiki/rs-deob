import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class24 extends class51 {

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    private int field392 = -32768;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
    private boolean field397 = false;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    private int field404 = 0;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "Z")
    public boolean field408 = false;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    private int field409 = 0;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Lld;")
    private class104 field389;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static volatile int field399 = 0;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "Lng;")
    public static class139 field411 = new class139(100);

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Lmg;")
    public static class134 field415 = new class134(5000);

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lnc;")
    private class125 field396;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)I")
    public static final int method164(int arg0, boolean arg1) {
        field391++;
        if (!arg1) {
            field415 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static void method165(int arg0) {
        if (arg0 == 5000) {
            field411 = null;
            field415 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()I")
    public final int method166() {
        field405++;
        return this.field392;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field401++;
        if (!this.field397) {
            class150 var6 = this.method173(-1);
            if (var6 == null) {
                return;
            }
            this.method169(var6, 255);
        }
        if (this.field396 != null) {
            this.field396.method758(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lgf;Lgf;Lne;Lgf;I)Z")
    public static final boolean method168(class7 arg0, class7 arg1, class206 arg2, class7 arg3, int arg4) {
        if (arg4 != 5000) {
            method170(42, -10);
        }
        class58.field1120 = arg3;
        class184.field3342 = arg2;
        class130.field2305 = arg0;
        class89.field1618 = arg1;
        field400++;
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lhg;I)V")
    private final void method169(class150 arg0, int arg1) {
        field394++;
        class183 var3 = (class183) arg0;
        if (arg1 != 255) {
            this.method166();
        }
        if ((this.field396 == null || this.field396.field2190) && (var3.field3275 != null || var3.field3279 != null)) {
            this.field396 = new class125(class146.field2635, 1, 1);
        }
        if (this.field396 != null) {
            this.field396.method763(var3.field3275, var3.field3279, false, var3.field3284, var3.field3262, var3.field3274);
        }
        this.field397 = true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
    public static final void method170(int arg0, int arg1) {
        field398++;
        class162 var2 = (class162) class143.field2518.method1824((long) arg1, 0);
        if (var2 != null) {
            var2.method349(0);
            if (arg0 != 1) {
                method165(-37);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
    public final void method171(int arg0, int arg1) {
        field414++;
        if (this.field408) {
            return;
        }
        this.field409 += arg1;
        if (arg0 != 0) {
            return;
        }
        while (this.field389.field1824[this.field404] < this.field409) {
            this.field409 -= this.field389.field1824[this.field404];
            this.field404++;
            if (this.field389.field1829.length <= this.field404) {
                this.field408 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V")
    public static final void method172(int arg0, int arg1) {
        field410++;
        client.method1504(86);
        class277.method1827(-76);
        int var2 = class109.method655(-19850, arg1).field3984;
        if (var2 == 0) {
            return;
        }
        int var3 = class148.field2691[arg1];
        if (arg0 != 0) {
            method172(-6, 106);
        }
        if (var2 == 9) {
            class54.field1053 = var3;
        }
        if (var2 == 5) {
            class141.field2457 = var3;
        }
        if (var2 == 6) {
            class164.field2939 = var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIII)V")
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field395 = arg3;
        this.field402 = arg0;
        this.field412 = arg2;
        this.field390 = arg1;
        this.field403 = arg4;
        this.field393 = arg5 + arg6;
        int var8 = class122.method742(-49, this.field402).field3090;
        if (var8 == -1) {
            this.field408 = true;
        } else {
            this.field408 = false;
            this.field389 = class164.method1081(var8, -21331);
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Lhg;")
    private final class150 method173(int arg0) {
        field413++;
        class173 var2 = class122.method742(-78, this.field402);
        class150 var3;
        if (this.field408) {
            var3 = var2.method1137(29263, -1);
        } else {
            var3 = var2.method1137(29263, this.field404);
        }
        if (arg0 != -1) {
            this.field402 = -102;
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIJILnc;)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class125 arg10) {
        class150 var13 = this.method173(-1);
        field406++;
        if (var13 != null) {
            this.method169(var13, 255);
            var13.method174(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field396);
            this.field392 = var13.method166();
        }
    }
}
