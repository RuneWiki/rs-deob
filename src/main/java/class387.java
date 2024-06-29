import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class387 {

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    private int field5737 = 0;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    private int field5732 = 0;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Lgo;")
    private class440 field5731 = null;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    private int field5734 = 0;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "Lqg;")
    private class321 field5736;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "Lpe;")
    private class430 field5744;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "[Lhl;")
    private class366[] field5730;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "Lst;")
    public class296 field5739;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Lqf;")
    public static class477 field5738 = new class477(5000);

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "[I")
    public static int[] field5746 = new int[3];

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "Lhh;")
    public static class84 field5735;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
    public static final void method2431(int arg0, int arg1) {
        field5733++;
        class115.field1834 = arg0;
        class22.field343.method2349(0);
        if (arg1 != 3) {
            method2433((byte) -68);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIZI)V")
    public final void method2432(boolean arg0, int arg1, boolean arg2, int arg3) {
        boolean var5 = arg0 & this.field5736.method482();
        field5742++;
        if (!var5 && (arg1 == 4 || arg1 == 8)) {
            arg1 = 2;
        }
        if (~arg1 != arg3 && arg2) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field5737 != arg1) {
            if (this.field5737 != 0) {
                this.field5730[this.field5737 & Integer.MAX_VALUE].method1(7);
            }
            if (arg1 != 0) {
                this.field5730[arg1 & Integer.MAX_VALUE].method5(arg2, arg3 + 66);
                this.field5730[Integer.MAX_VALUE & arg1].method7(true, arg2);
            }
            this.field5731 = null;
            this.field5737 = arg1;
            this.field5734 = Integer.MIN_VALUE;
            this.field5732 = Integer.MIN_VALUE;
        } else if (this.field5737 != 0) {
            this.field5730[Integer.MAX_VALUE & this.field5737].method7(true, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public static void method2433(byte arg0) {
        field5738 = null;
        field5735 = null;
        field5746 = null;
        if (arg0 <= 31) {
            method2431(-121, 86);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIB)V")
    public final void method2434(int arg0, int arg1, byte arg2) {
        field5743++;
        if (arg2 != 99) {
            this.field5732 = -100;
        }
        if (this.field5737 != 0 & (this.field5734 != arg1 | this.field5732 != arg0)) {
            this.field5730[this.field5737 & Integer.MAX_VALUE].method8(arg1, arg0, (byte) 54);
            this.field5734 = arg1;
            this.field5732 = arg0;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLgo;I)Z")
    public final boolean method2435(byte arg0, class440 arg1, int arg2) {
        field5745++;
        if (this.field5737 == 0) {
            return false;
        }
        if (this.field5731 != arg1) {
            this.field5730[Integer.MAX_VALUE & this.field5737].method6(arg2, arg1, (byte) 105);
            this.field5731 = arg1;
        }
        if (arg0 != 67) {
            field5735 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lqg;)V")
    public class387(class321 arg0) {
        this.field5736 = arg0;
        this.field5744 = new class430(arg0);
        this.field5730 = new class366[10];
        this.field5730[1] = new class351(arg0);
        this.field5730[2] = new class309(arg0, this.field5744);
        this.field5730[4] = new class333(arg0, this.field5744);
        this.field5730[5] = new class1(arg0, this.field5744);
        this.field5730[6] = new class114(arg0);
        this.field5730[7] = new class273(arg0);
        this.field5730[3] = this.field5739 = new class296(arg0);
        this.field5730[8] = new class496(arg0, this.field5744);
        this.field5730[9] = new class355(arg0, this.field5744);
        if (!this.field5730[8].method9(65)) {
            this.field5730[8] = this.field5730[4];
        }
        if (!this.field5730[9].method9(41)) {
            this.field5730[9] = this.field5730[8];
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)Z")
    public final boolean method2436(int arg0, byte arg1) {
        field5740++;
        if (arg1 <= 68) {
            this.field5739 = null;
        }
        return this.field5730[arg0].method9(76);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)I")
    public static final int method2437(int arg0, int arg1, int arg2) {
        if (arg1 > -9) {
            method2437(99, 36, 27);
        }
        field5741++;
        int var3 = arg2 - 1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    static {
        new class180(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }
}
