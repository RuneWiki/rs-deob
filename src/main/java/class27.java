import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class27 extends class44 {

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "[Lcf;")
    public class27[] field431;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Z")
    public boolean field435;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field438 = -1;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Lkb;")
    public static class93 field437 = class76.method390("Lade)3)3)3", 0);

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Lva;")
    public class191 field447;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lkd;")
    public class95 field436;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "[I")
    public static int[] field440;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)[I")
    public final int[] method145(int arg0, byte arg1, int arg2) {
        if (arg1 <= 118) {
            return null;
        } else {
            field442++;
            return this.field431[arg0].field435 ? this.field431[arg0].method55(arg2, false) : this.field431[arg0].method19(105, arg2)[0];
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public final void method146(int arg0) {
        field429++;
        if (arg0 != -868) {
            this.field426 = -65;
        }
        if (this.field435) {
            this.field447.method1236(arg0 + 868);
            this.field447 = null;
        } else {
            this.field436.method535(false);
            this.field436 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BILrd;)V")
    public void method15(byte arg0, int arg1, class158 arg2) {
        field448++;
        if (arg0 <= 106) {
            this.method19(31, -31);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public static void method147(int arg0) {
        field440 = null;
        if (arg0 == -11941) {
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lkb;Ljg;BLkb;)[Lna;")
    public static final class119[] method148(class93 arg0, class89 arg1, byte arg2, class93 arg3) {
        field443++;
        int var4 = arg1.method454(236, arg0);
        if (arg2 >= -40) {
            field424 = 15;
        }
        int var5 = arg1.method468(21, arg3, var4);
        return class65.method344(-21724, var5, var4, arg1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)V")
    public final void method149(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field435 = false;
        }
        field441++;
        int var4 = this.field426 == 255 ? arg0 : this.field426;
        if (this.field435) {
            this.field447 = new class191(var4, arg0, arg1);
        } else {
            this.field436 = new class95(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)I")
    public int method150(boolean arg0) {
        if (arg0) {
            return 68;
        } else {
            field446++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)[I")
    public int[] method55(int arg0, boolean arg1) {
        if (arg1) {
            method151(-121, (byte) -109);
        }
        field427++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Z")
    public static final boolean method151(int arg0, byte arg1) {
        field428++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = -126 % ((arg1 - 10) / 50);
        int var3 = class152.field2944[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        return var3 == 1006;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)[[I")
    public final int[][] method152(int arg0, int arg1, int arg2) {
        field433++;
        if (arg2 <= 76) {
            return null;
        } else if (this.field431[arg1].field435) {
            int[] var4 = this.field431[arg1].method55(arg0, false);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field431[arg1].method19(121, arg0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[[I")
    public int[][] method19(int arg0, int arg1) {
        int var3 = -93 / ((42 - arg0) / 54);
        field449++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)I")
    public int method153(byte arg0) {
        field425++;
        if (arg0 > -53) {
            this.field447 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
    public void method154(byte arg0) {
        if (arg0 <= 77) {
            this.field447 = null;
        }
        field445++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)I")
    public static final int method155(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 123) {
            method148(null, null, (byte) 37, null);
        }
        field434++;
        if ((class136.field2637[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class136.field2637[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IZ)V")
    public class27(int arg0, boolean arg1) {
        this.field431 = new class27[arg0];
        this.field435 = arg1;
    }
}
