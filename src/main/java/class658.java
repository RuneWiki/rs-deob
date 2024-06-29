import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class658 {

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    private int field9383 = 0;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    private int field9380 = 0;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    private int field9381 = 0;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Luda;")
    private class412 field9385 = null;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Lap;")
    private class435 field9384;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "Lum;")
    private class479 field9386;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lqk;")
    private class16[] field9382;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Lff;")
    public class9 field9393;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "[I")
    public static int[] field9388 = new int[1];

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Liaa;I)Lsv;")
    public static final class602 method3710(class452 arg0, int arg1) {
        field9392++;
        int var2 = -31 / ((-arg1 - 56) / 44);
        int var3 = arg0.method2574(-1758460248);
        return new class602(var3);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static void method3711(int arg0) {
        if (arg0 != 13784) {
            method3710(null, -35);
        }
        field9388 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBZIIZ)V")
    public final void method3712(int arg0, byte arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg5 & this.field9384.method380();
        field9378++;
        int var8 = -45 % ((arg1 + 23) / 37);
        if (!var7 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
            if (arg0 == 4) {
                arg4 = arg3;
            }
            arg0 = 2;
        }
        if (arg0 != 0 && arg2) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field9380 != arg0) {
            if (this.field9380 != 0) {
                this.field9382[Integer.MAX_VALUE & this.field9380].method48((byte) -106);
            }
            if (arg0 != 0) {
                this.field9382[Integer.MAX_VALUE & arg0].method50(arg2, (byte) 42);
                this.field9382[Integer.MAX_VALUE & arg0].method46((byte) -61, arg2);
                this.field9382[Integer.MAX_VALUE & arg0].method42(arg3, arg4, false);
            }
            this.field9383 = arg3;
            this.field9381 = arg4;
            this.field9380 = arg0;
            this.field9385 = null;
        } else if (this.field9380 != 0) {
            this.field9382[Integer.MAX_VALUE & this.field9380].method46((byte) -61, arg2);
            if (this.field9383 != arg3 || this.field9381 != arg4) {
                this.field9382[this.field9380 & Integer.MAX_VALUE].method42(arg3, arg4, false);
                this.field9383 = arg3;
                this.field9381 = arg4;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILuda;I)Z")
    public final boolean method3713(int arg0, class412 arg1, int arg2) {
        field9391++;
        if (this.field9380 == 0) {
            return false;
        }
        if (this.field9385 != arg1) {
            this.field9382[Integer.MAX_VALUE & this.field9380].method44(arg2, -1, arg1);
            this.field9385 = arg1;
        }
        return arg0 == -692 ? true : true;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Z")
    public final boolean method3714(byte arg0, int arg1) {
        field9379++;
        int var3 = -2 % ((42 - arg0) / 35);
        return this.field9382[arg1].method52(12733);
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lap;)V")
    public class658(class435 arg0) {
        this.field9384 = arg0;
        this.field9386 = new class479(arg0);
        this.field9382 = new class16[10];
        this.field9382[1] = new class95(arg0);
        this.field9382[2] = new class233(arg0, this.field9386);
        this.field9382[4] = new class421(arg0, this.field9386);
        this.field9382[5] = new class687(arg0, this.field9386);
        this.field9382[6] = new class300(arg0);
        this.field9382[7] = new class550(arg0);
        this.field9382[3] = this.field9393 = new class9(arg0);
        this.field9382[8] = new class516(arg0, this.field9386);
        this.field9382[9] = new class568(arg0, this.field9386);
        if (!this.field9382[8].method52(12733)) {
            this.field9382[8] = this.field9382[4];
        }
        if (!this.field9382[9].method52(12733)) {
            this.field9382[9] = this.field9382[8];
        }
    }
}
