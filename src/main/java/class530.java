import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class530 {

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    private int field7803 = 0;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    private int field7797 = 0;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    private int field7805 = 0;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Lew;")
    private class271 field7800 = null;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "Lvd;")
    private class258 field7811;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "Lbt;")
    private class89 field7807;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "[Lue;")
    private class374[] field7798;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "Lck;")
    public class5 field7812;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Ldp;")
    public static class347 field7806 = new class347("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "Ljava/lang/Object;")
    public static Object field7809;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)V", line = 7)
    public final void method3144(int arg0, int arg1, int arg2) {
        field7808++;
        int var4 = 96 / ((33 - arg1) / 56);
        if (this.field7805 != 0 & (this.field7797 != arg2 | this.field7803 != arg0)) {
            this.field7798[this.field7805 & Integer.MAX_VALUE].method20(arg2, -20857, arg0);
            this.field7803 = arg0;
            this.field7797 = arg2;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 24)
    public static void method3145(int arg0) {
        field7806 = null;
        field7809 = null;
        if (arg0 != 16831) {
            method3145(42);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BLew;I)Z", line = 39)
    public final boolean method3146(byte arg0, class271 arg1, int arg2) {
        field7799++;
        if (arg0 != -81) {
            field7810 = -125;
        }
        if (this.field7805 == 0) {
            return false;
        }
        if (this.field7800 != arg1) {
            this.field7798[this.field7805 & Integer.MAX_VALUE].method18(true, arg1, arg2);
            this.field7800 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIZZ)V", line = 62)
    public final void method3147(int arg0, int arg1, boolean arg2, boolean arg3) {
        field7804++;
        boolean var5 = arg2 & this.field7811.method152();
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg3) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (arg1 != Integer.MAX_VALUE) {
            return;
        }
        if (this.field7805 != arg0) {
            if (this.field7805 != 0) {
                this.field7798[Integer.MAX_VALUE & this.field7805].method24(arg1 - 2147483534);
            }
            if (arg0 != 0) {
                this.field7798[arg0 & Integer.MAX_VALUE].method25(arg3, true);
                this.field7798[Integer.MAX_VALUE & arg0].method19(arg3, -107);
            }
            this.field7800 = null;
            this.field7805 = arg0;
            this.field7803 = Integer.MIN_VALUE;
            this.field7797 = Integer.MIN_VALUE;
        } else if (this.field7805 != 0) {
            this.field7798[Integer.MAX_VALUE & this.field7805].method19(arg3, -54);
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lvd;)V", line = 147)
    public class530(class258 arg0) {
        this.field7811 = arg0;
        this.field7807 = new class89(arg0);
        this.field7798 = new class374[10];
        this.field7798[1] = new class316(arg0);
        this.field7798[2] = new class445(arg0, this.field7807);
        this.field7798[4] = new class150(arg0, this.field7807);
        this.field7798[5] = new class197(arg0, this.field7807);
        this.field7798[6] = new class256(arg0);
        this.field7798[7] = new class301(arg0);
        this.field7798[3] = this.field7812 = new class5(arg0);
        this.field7798[8] = new class305(arg0, this.field7807);
        this.field7798[9] = new class179(arg0, this.field7807);
        if (!this.field7798[8].method21((byte) 120)) {
            this.field7798[8] = this.field7798[4];
        }
        if (!this.field7798[9].method21((byte) 113)) {
            this.field7798[9] = this.field7798[8];
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI)Z", line = 121)
    public final boolean method3148(byte arg0, int arg1) {
        field7802++;
        if (arg0 > -106) {
            method3149(-72, 55, -123);
        }
        return this.field7798[arg1].method21((byte) 95);
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(III)V", line = 132)
    public static final void method3149(int arg0, int arg1, int arg2) {
        int var3 = -125 % ((-arg0 - 15) / 52);
        field7801++;
        class506 var4 = class14.method185(-1304589728, arg2, 16);
        var4.method2992(0);
        var4.field7442 = arg1;
    }
}
