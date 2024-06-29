import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class34 extends class476 {

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "Z")
    public boolean field533;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "[Leg;")
    public class34[] field527;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lhi;")
    public static class45 field522 = new class45(69, 3);

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Lhi;")
    public static class45 field535 = new class45(79, 4);

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field538 = 0;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "Lnk;")
    public class308 field537;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Lqs;")
    public class50 field536;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "[[B")
    public static byte[][] field526;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ldk;I)V")
    public static final void method247(class421 arg0, int arg1) {
        if (arg1 == 1) {
            field524++;
            class247.field3364 = arg0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[I")
    public int[] method64(int arg0, byte arg1) {
        int var3 = 38 % (-arg1 / 50);
        field528++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V")
    public void method248(int arg0, byte arg1, int arg2) {
        field532++;
        int var4 = this.field519 == 255 ? arg0 : this.field519;
        if (this.field533) {
            this.field537 = new class308(var4, arg0, arg2);
        } else {
            this.field536 = new class50(var4, arg0, arg2);
        }
        if (arg1 <= 44) {
            this.field527 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public void method249(int arg0) {
        field530++;
        if (this.field533) {
            this.field537.method1783(0);
            this.field537 = null;
        } else {
            this.field536.method332(1);
            this.field536 = null;
        }
        int var2 = -65 / ((arg0 + 34) / 52);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)I")
    public int method250(boolean arg0) {
        field534++;
        return arg0 ? -1 : -89;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)I")
    public int method251(int arg0) {
        if (arg0 >= -21) {
            field538 = -99;
        }
        field525++;
        return -1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lsv;II)V")
    public void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 <= 16) {
            this.method66((byte) 63, -14);
        }
        field531++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[[I")
    public int[][] method66(byte arg0, int arg1) {
        if (arg0 != -11) {
            this.field537 = null;
        }
        field529++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZII)[I")
    public final int[] method252(boolean arg0, int arg1, int arg2) {
        field521++;
        if (arg0) {
            return null;
        } else if (this.field527[arg2].field533) {
            return this.field527[arg2].method64(arg1, (byte) -121);
        } else {
            return this.field527[arg2].method66((byte) -11, arg1)[0];
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static void method253(int arg0) {
        field526 = null;
        field522 = null;
        field535 = null;
        if (arg0 != 3) {
            field535 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)[[I")
    public final int[][] method254(int arg0, int arg1, int arg2) {
        field520++;
        if (arg0 != 0) {
            this.method66((byte) 3, 100);
        }
        if (this.field527[arg1].field533) {
            int[] var4 = this.field527[arg1].method64(arg2, (byte) -73);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field527[arg1].method66((byte) -11, arg2);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
    public void method146(byte arg0) {
        field523++;
        if (arg0 > -84) {
            method247(null, -120);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IZ)V")
    public class34(int arg0, boolean arg1) {
        this.field533 = arg1;
        this.field527 = new class34[arg0];
    }
}
