import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public abstract class class377 extends class263 {

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "[Lqba;")
    public class377[] field4854;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "Z")
    public boolean field4853;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "[Lcu;")
    public static class207[] field4841 = new class207[14];

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public static int field4848 = 100;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "Lbda;")
    public class472 field4850;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "Llb;")
    public class508 field4842;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2172(int arg0) {
        if (arg0 != 100) {
            field4841 = null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class58.field743[var1] = true;
        }
        field4843++;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)[[I", line = 28)
    public final int[][] method2173(int arg0, int arg1, int arg2) {
        field4855++;
        if (arg0 != 1) {
            this.field4842 = null;
        }
        if (this.field4854[arg2].field4853) {
            int[] var4 = this.field4854[arg2].method88(arg1, -97);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4854[arg2].method23(arg1, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIB)[I", line = 60)
    public final int[] method2174(int arg0, int arg1, byte arg2) {
        field4840++;
        int var4 = -6 / ((arg2 + 57) / 61);
        return this.field4854[arg0].field4853 ? this.field4854[arg0].method88(arg1, 104) : this.field4854[arg0].method23(arg1, (byte) 96)[0];
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)I", line = 88)
    public int method1724(int arg0) {
        field4845++;
        if (arg0 <= 94) {
            this.method2173(-68, -80, 5);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILji;)V", line = 100)
    public void method27(int arg0, int arg1, class572 arg2) {
        field4839++;
        int var4 = -105 / ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)V", line = 112)
    public void method1721(int arg0) {
        field4856++;
        if (this.field4853) {
            this.field4842.method2770((byte) 96);
            this.field4842 = null;
        } else {
            this.field4850.method2567(118);
            this.field4850 = null;
        }
        if (arg0 != -101) {
            this.method2178(105);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V", line = 144)
    public static void method2175(byte arg0) {
        if (arg0 != 13) {
            field4841 = null;
        }
        field4841 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)[I", line = 158)
    public int[] method88(int arg0, int arg1) {
        int var3 = -5 % ((arg1 - 5) / 53);
        field4849++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V", line = 171)
    public void method91(byte arg0) {
        field4846++;
        if (arg0 < 52) {
            field4848 = 88;
        }
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(B)V", line = 183)
    public static final void method2176(byte arg0) {
        if (arg0 < 39) {
            method2175((byte) -27);
        }
        class132.method858(0);
        field4847++;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBI)V", line = 196)
    public void method2177(int arg0, byte arg1, int arg2) {
        field4851++;
        int var4 = this.field4844 == 255 ? arg0 : this.field4844;
        if (this.field4853) {
            this.field4842 = new class508(var4, arg0, arg2);
        } else {
            this.field4850 = new class472(var4, arg0, arg2);
        }
        if (arg1 != -125) {
            this.method27(-60, -91, null);
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(IZ)V", line = 218)
    public class377(int arg0, boolean arg1) {
        this.field4854 = new class377[arg0];
        this.field4853 = arg1;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)[[I", line = 231)
    public int[][] method23(int arg0, byte arg1) {
        int var3 = 8 % ((31 - arg1) / 42);
        field4857++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "(I)I", line = 245)
    public int method2178(int arg0) {
        field4852++;
        return arg0 == -1 ? -1 : 56;
    }
}
