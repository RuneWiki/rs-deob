import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class411 {

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    private int field5627 = 0;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    private int field5626 = 0;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    private int field5620 = 0;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "Llea;")
    private class573 field5621;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Lan;")
    private class193 field5628;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "[Lut;")
    private class692[] field5619;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Lop;")
    public class586 field5625;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "Lsv;")
    public static class570 field5629 = new class570(42, 4);

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "[I")
    public static int[] field5632 = new int[2];

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIB)V")
    public static final void method2416(int arg0, int arg1, byte arg2) {
        field5622++;
        if (class484.method2853(arg0, (byte) -50) && arg2 == -49) {
            class274.method1743(class610.field8661[arg0], 6680, arg1);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZIIZ)V")
    public final void method2417(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        field5623++;
        boolean var7 = arg5 & this.field5621.method435();
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg3 = arg0;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg2) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field5620 != arg1) {
            if (this.field5620 != 0) {
                this.field5619[Integer.MAX_VALUE & this.field5620].method1111((byte) 114);
            }
            if (arg1 != 0) {
                this.field5619[arg1 & Integer.MAX_VALUE].method1118(arg2, -3826);
                this.field5619[Integer.MAX_VALUE & arg1].method1117(arg2, (byte) 57);
                this.field5619[arg1 & Integer.MAX_VALUE].method1113(arg0, true, arg3);
            }
            this.field5627 = arg0;
            this.field5620 = arg1;
            this.field5626 = arg3;
        } else if (this.field5620 != 0) {
            this.field5619[this.field5620 & Integer.MAX_VALUE].method1117(arg2, (byte) 57);
            if (this.field5627 != arg0 || this.field5626 != arg3) {
                this.field5619[Integer.MAX_VALUE & this.field5620].method1113(arg0, true, arg3);
                this.field5626 = arg3;
                this.field5627 = arg0;
            }
        }
        int var8 = -29 % ((arg4 - 39) / 35);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILfga;I)Z")
    public final boolean method2418(int arg0, class377 arg1, int arg2) {
        field5631++;
        if (arg0 < 67) {
            return true;
        } else if (this.field5620 == 0) {
            return false;
        } else {
            this.field5619[Integer.MAX_VALUE & this.field5620].method1119(59, arg1, arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public static void method2419(byte arg0) {
        if (arg0 != 96) {
            method2420((byte) 19);
        }
        field5632 = null;
        field5629 = null;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)Lmha;")
    public static final class422 method2420(byte arg0) {
        int var1 = 94 / ((36 - arg0) / 48);
        field5630++;
        return class335.field4759 < class556.field7710.length ? class556.field7710[class335.field4759++] : null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)Z")
    public final boolean method2421(byte arg0, int arg1) {
        int var3 = -114 % ((arg0 - 4) / 55);
        field5624++;
        return this.field5619[arg1].method1112(-126);
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Llea;)V")
    public class411(class573 arg0) {
        this.field5621 = arg0;
        this.field5628 = new class193(arg0);
        this.field5619 = new class692[10];
        this.field5619[1] = new class509(arg0);
        this.field5619[2] = new class221(arg0, this.field5628);
        this.field5619[4] = new class134(arg0, this.field5628);
        this.field5619[5] = new class523(arg0, this.field5628);
        this.field5619[6] = new class437(arg0);
        this.field5619[7] = new class263(arg0);
        this.field5619[3] = this.field5625 = new class586(arg0);
        this.field5619[8] = new class526(arg0, this.field5628);
        this.field5619[9] = new class275(arg0, this.field5628);
        if (!this.field5619[8].method1112(-128)) {
            this.field5619[8] = this.field5619[4];
        }
        if (!this.field5619[9].method1112(-128)) {
            this.field5619[9] = this.field5619[8];
        }
    }
}
