import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class459 {

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    private int field6731 = 0;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lmk;")
    private class40 field6737 = null;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    private int field6733 = 0;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    private int field6742 = 0;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Lef;")
    private class338 field6740;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lmc;")
    private class88 field6730;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[Log;")
    private class457[] field6728;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Le;")
    public class370 field6741;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field6735 = 1406;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field6727 = 0;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Lwj;")
    public static class270 field6734 = new class270(91, -1);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[I")
    public static int[] field6736;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method2690(boolean arg0) {
        field6743++;
        class405.field5946 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lef;)V", line = 181)
    public class459(class338 arg0) {
        this.field6740 = arg0;
        this.field6730 = new class88(arg0);
        this.field6728 = new class457[10];
        this.field6728[1] = new class209(arg0);
        this.field6728[2] = new class307(arg0, this.field6730);
        this.field6728[4] = new class49(arg0, this.field6730);
        this.field6728[5] = new class239(arg0, this.field6730);
        this.field6728[6] = new class65(arg0);
        this.field6728[7] = new class231(arg0);
        this.field6728[3] = this.field6741 = new class370(arg0);
        this.field6728[8] = new class112(arg0, this.field6730);
        this.field6728[9] = new class171(arg0, this.field6730);
        if (!this.field6728[8].method429(0)) {
            this.field6728[8] = this.field6728[4];
        }
        if (!this.field6728[9].method429(0)) {
            this.field6728[9] = this.field6728[8];
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZZI)V", line = 27)
    public final void method2691(int arg0, boolean arg1, boolean arg2, int arg3) {
        field6732++;
        boolean var5 = arg2 & this.field6740.method276();
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (~arg3 != arg0 && arg1) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field6742 != arg3) {
            if (this.field6742 != 0) {
                this.field6728[Integer.MAX_VALUE & this.field6742].method433((byte) 8);
            }
            if (arg3 != 0) {
                this.field6728[Integer.MAX_VALUE & arg3].method434(28037, arg1);
                this.field6728[Integer.MAX_VALUE & arg3].method435(arg1, (byte) 114);
            }
            this.field6731 = Integer.MIN_VALUE;
            this.field6733 = Integer.MIN_VALUE;
            this.field6742 = arg3;
            this.field6737 = null;
        } else if (this.field6742 != 0) {
            this.field6728[Integer.MAX_VALUE & this.field6742].method435(arg1, (byte) 103);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)Z", line = 65)
    public final boolean method2692(boolean arg0, int arg1) {
        field6729++;
        return arg0 ? this.field6728[arg1].method429(0) : true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lar;ILya;BI)V", line = 82)
    public static final void method2693(class479 arg0, int arg1, class38 arg2, byte arg3, int arg4) {
        class212.field2958.method2814((byte) 121);
        field6738++;
        if (class471.field6883) {
            return;
        }
        int var5 = 80 % ((-arg3 - 17) / 32);
        for (class109 var6 = (class109) arg0.method2818((byte) 104); var6 != null; var6 = (class109) arg0.method2820((byte) -58)) {
            class146 var7 = class350.field5106.method141(var6.field1639, false);
            if (class519.method3092(false, var7)) {
                boolean var8 = class403.method2428(arg4, arg1, var7, arg2, -25703, var6);
                if (var8) {
                    class377.method2249(arg2, true, var6, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLmk;I)Z", line = 115)
    public final boolean method2694(boolean arg0, class40 arg1, int arg2) {
        field6739++;
        if (this.field6742 == 0) {
            return false;
        }
        if (arg0) {
            field6736 = null;
        }
        if (this.field6737 != arg1) {
            this.field6728[this.field6742 & Integer.MAX_VALUE].method431(arg1, 384, arg2);
            this.field6737 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 138)
    public static void method2695(int arg0) {
        field6736 = null;
        field6734 = null;
        if (arg0 != 8) {
            field6727 = 69;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V", line = 155)
    public final void method2696(int arg0, int arg1, int arg2) {
        if (this.field6742 != 0 & (this.field6731 != arg2 | this.field6733 != arg0)) {
            this.field6728[Integer.MAX_VALUE & this.field6742].method430(arg0, arg2, false);
            this.field6731 = arg2;
            this.field6733 = arg0;
        }
        field6744++;
        if (arg1 != 2) {
            this.method2691(64, false, true, 101);
        }
    }
}
