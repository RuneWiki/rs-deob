import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public abstract class class68 extends class171 {

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "[Ltl;")
    public class68[] field932;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "Z")
    public boolean field926;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field914 = 0;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "F")
    public static float field912 = 0.0F;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "[I")
    public static int[] field929 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "Lah;")
    public class285 field917;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "Lcd;")
    public class28 field920;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)[I")
    public final int[] method423(int arg0, byte arg1, int arg2) {
        if (arg1 == -54) {
            field916++;
            return this.field932[arg0].field926 ? this.field932[arg0].method32(arg2, arg1 - 68) : this.field932[arg0].method91(arg2, (byte) -113)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V")
    public void method192(int arg0) {
        if (arg0 > -18) {
            method430((byte) -87, (String) null);
        }
        field918++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V")
    public final void method424(int arg0, int arg1, int arg2) {
        field928++;
        if (arg0 != -5656) {
            this.field926 = true;
        }
        int var4 = this.field922 == 255 ? arg1 : this.field922;
        if (this.field926) {
            this.field917 = new class285(var4, arg1, arg2);
        } else {
            this.field920 = new class28(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)[[I")
    public int[][] method91(int arg0, byte arg1) {
        int var3 = 78 / ((arg1 - 63) / 61);
        field915++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lql;IZ)V")
    public void method28(class224 arg0, int arg1, boolean arg2) {
        field924++;
        if (!arg2) {
            this.field926 = true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)I")
    public int method425(byte arg0) {
        field927++;
        if (arg0 != 28) {
            this.field932 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I")
    public int[] method32(int arg0, int arg1) {
        field921++;
        if (arg1 > -118) {
            this.method424(75, 65, 78);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
    public static void method426(int arg0) {
        if (arg0 == -14332) {
            field929 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBLhc;I)Lke;")
    public static final class110 method427(int arg0, byte arg1, class235 arg2, int arg3) {
        field919++;
        if (arg1 != -124) {
            method430((byte) 71, (String) null);
        }
        return class57.method351(arg2, arg3, arg0, (byte) -125) ? class246.method1654((byte) -6) : null;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)I")
    public int method153(byte arg0) {
        if (arg0 != -63) {
            this.field922 = -25;
        }
        field923++;
        return -1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILhc;BI)[Lag;")
    public static final class189[] method428(int arg0, class235 arg1, byte arg2, int arg3) {
        if (arg2 != -112) {
            field925 = 110;
        }
        field930++;
        return class57.method351(arg1, arg0, arg3, (byte) 109) ? class104.method677(0) : null;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V")
    public void method159(byte arg0) {
        if (this.field926) {
            this.field917.method1918(arg0 + 92);
            this.field917 = null;
        } else {
            this.field920.method181(2);
            this.field920 = null;
        }
        field931++;
        if (arg0 != -48) {
            this.method429(10, -116, 40);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)[[I")
    public final int[][] method429(int arg0, int arg1, int arg2) {
        field933++;
        if (arg2 != 2) {
            method430((byte) -38, (String) null);
        }
        if (this.field932[arg0].field926) {
            int[] var4 = this.field932[arg0].method32(arg1, arg2 ^ 0xFFFFFF8A);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field932[arg0].method91(arg1, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method430(byte arg0, String arg1) {
        String var2 = class197.method1258(class73.method465((byte) -99, arg1), (byte) 118);
        if (var2 == null) {
            var2 = "";
        }
        int var3 = -109 % ((arg0 - 58) / 36);
        field913++;
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IZ)V")
    public class68(int arg0, boolean arg1) {
        this.field932 = new class68[arg0];
        this.field926 = arg1;
    }
}
