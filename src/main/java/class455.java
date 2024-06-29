import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class455 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lev;")
    public class498 field6378 = new class498();

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Lfc;")
    public static class174 field6389 = new class174(4);

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Leh;")
    public static class246 field6391 = new class246(46, -1);

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field6393 = 0;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field6392 = -1;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Leh;")
    public static class246 field6390;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Lev;")
    private class498 field6387;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Lev;")
    public final class498 method2654(int arg0) {
        field6376++;
        class498 var2 = this.field6378.field7055;
        if (this.field6378 == var2) {
            return null;
        }
        var2.method2891(arg0);
        if (arg0 != -1) {
            field6393 = 3;
        }
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)Lev;")
    public final class498 method2655(int arg0) {
        field6373++;
        class498 var2 = this.field6378.field7055;
        if (this.field6378 == var2) {
            this.field6387 = null;
            return null;
        }
        this.field6387 = var2.field7055;
        if (arg0 != 15152) {
            this.method2667(-42);
        }
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public final void method2656(int arg0) {
        field6383++;
        while (true) {
            class498 var2 = this.field6378.field7055;
            if (this.field6378 == var2) {
                this.field6387 = null;
                if (arg0 <= 55) {
                    this.field6387 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method2891(66);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILev;)V")
    public final void method2657(int arg0, class498 arg1) {
        if (arg0 != 8492) {
            this.method2657(-120, null);
        }
        field6380++;
        if (arg1.field7056 != null) {
            arg1.method2891(-124);
        }
        arg1.field7056 = this.field6378.field7056;
        arg1.field7055 = this.field6378;
        arg1.field7056.field7055 = arg1;
        arg1.field7055.field7056 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lev;Z)V")
    public final void method2658(class498 arg0, boolean arg1) {
        field6385++;
        if (arg0.field7056 != null) {
            arg0.method2891(-125);
        }
        if (arg1) {
            method2663(-73, 118, -1.479534F, 10, -84, 57, true, -11);
        }
        arg0.field7056 = this.field6378;
        arg0.field7055 = this.field6378.field7055;
        arg0.field7056.field7055 = arg0;
        arg0.field7055.field7056 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lam;B)V")
    public final void method2659(class455 arg0, byte arg1) {
        if (arg1 != 87) {
            method2663(83, -105, -1.1198877F, 90, -128, 119, false, -19);
        }
        field6386++;
        this.method2668(0, arg0, this.field6378.field7055);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lev;")
    public final class498 method2660(byte arg0) {
        if (arg0 != 67) {
            field6389 = null;
        }
        field6382++;
        class498 var2 = this.field6387;
        if (this.field6378 == var2) {
            this.field6387 = null;
            return null;
        } else {
            this.field6387 = var2.field7055;
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)Z")
    public final boolean method2661(int arg0) {
        field6377++;
        if (arg0 > -114) {
            return false;
        } else {
            return this.field6378.field7055 == this.field6378;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Lev;")
    public final class498 method2662(byte arg0) {
        field6379++;
        int var2 = -85 % ((55 - arg0) / 63);
        class498 var3 = this.field6378.field7056;
        if (this.field6378 == var3) {
            this.field6387 = null;
            return null;
        } else {
            this.field6387 = var3.field7056;
            return var3;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIFIIIZI)[I")
    public static final int[] method2663(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field6384++;
        int[] var8 = new int[arg7];
        class184 var9 = new class184();
        var9.field2645 = arg0;
        var9.field2643 = arg6;
        var9.field2648 = arg4;
        var9.field2644 = (int) (arg2 * 4096.0F);
        if (arg1 != 15227) {
            method2666((byte) 8);
        }
        var9.field2658 = arg3;
        var9.field2652 = arg5;
        var9.method31(arg1 - 15236);
        class450.method2635((byte) 117, 1, arg7);
        var9.method1166(true, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V")
    public static final void method2664(int arg0, byte arg1) {
        class498 var2 = class221.field3183.method2414((byte) -127);
        if (arg1 != 45) {
            return;
        }
        while (var2 != null) {
            if (((long) arg0) == (var2.field7060 >> 48 & 0xFFFFL)) {
                var2.method2891(arg1 ^ 0xFFFFFFAD);
            }
            var2 = class221.field3183.method2410((byte) 124);
        }
        field6374++;
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)I")
    public final int method2665(int arg0) {
        int var2 = -28 / ((arg0 - 55) / 38);
        field6388++;
        int var3 = 0;
        class498 var4 = this.field6378.field7055;
        while (this.field6378 != var4) {
            var4 = var4.field7055;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
    public static void method2666(byte arg0) {
        field6390 = null;
        int var1 = 60 / ((66 - arg0) / 48);
        field6389 = null;
        field6391 = null;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class455() {
        this.field6378.field7056 = this.field6378;
        this.field6378.field7055 = this.field6378;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)Lev;")
    public final class498 method2667(int arg0) {
        field6381++;
        class498 var2 = this.field6387;
        if (this.field6378 == var2) {
            this.field6387 = null;
            return null;
        } else if (arg0 == 4096) {
            this.field6387 = var2.field7056;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILam;Lev;)V")
    private final void method2668(int arg0, class455 arg1, class498 arg2) {
        field6375++;
        class498 var4 = this.field6378.field7056;
        this.field6378.field7056 = arg2.field7056;
        arg2.field7056.field7055 = this.field6378;
        if (arg0 != 0) {
            field6391 = null;
        }
        if (this.field6378 != arg2) {
            arg2.field7056 = arg1.field6378.field7056;
            arg2.field7056.field7055 = arg2;
            arg1.field6378.field7056 = var4;
            var4.field7055 = arg1.field6378;
        }
    }
}
