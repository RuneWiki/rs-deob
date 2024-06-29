import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class118 extends class97 {

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "[Lcj;")
    public class118[] field1541;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "Z")
    public boolean field1552;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lwl;")
    public static class452 field1544 = new class452(12, 3);

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "Liq;")
    public static class134 field1553;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "Liq;")
    public static class134 field1554;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Lhg;")
    public class326 field1549;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Lnc;")
    public class388 field1537;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static void method701(int arg0) {
        field1544 = null;
        field1553 = null;
        field1554 = null;
        if (arg0 != 0) {
            method705(true, -102, (class146) null, 83, -38);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public void method702(int arg0, int arg1, int arg2) {
        field1540++;
        int var4 = this.field1551 == 255 ? arg2 : this.field1551;
        if (arg1 < 49) {
            this.field1541 = null;
        }
        if (this.field1552) {
            this.field1537 = new class388(var4, arg2, arg0);
        } else {
            this.field1549 = new class326(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
    public int[] method20(int arg0, int arg1) {
        field1546++;
        if (arg0 != 1) {
            this.field1541 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)[I")
    public final int[] method703(int arg0, int arg1, int arg2) {
        field1547++;
        if (arg2 != -2) {
            this.field1551 = 39;
        }
        return this.field1541[arg0].field1552 ? this.field1541[arg0].method20(1, arg1) : this.field1541[arg0].method195(false, arg1)[0];
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)I")
    public int method704(byte arg0) {
        if (arg0 != -92) {
            method701(44);
        }
        field1550++;
        return -1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)[[I")
    public int[][] method195(boolean arg0, int arg1) {
        if (arg0) {
            field1553 = null;
        }
        field1539++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZILng;II)V")
    public static final void method705(boolean arg0, int arg1, class146 arg2, int arg3, int arg4) {
        field1548++;
        long var5 = (long) (arg1 | arg4 << 14 | arg3 << 28);
        class429 var7 = (class429) class45.field557.method2302(var5, 23576);
        if (var7 == null) {
            class429 var8 = new class429();
            class45.field557.method2301(79, var8, var5);
            var8.field6304.method2504(42, arg2);
            return;
        }
        class167 var9 = class186.field2796.method1106(50, arg2.field2025);
        int var10 = var9.field2331;
        if (var9.field2356 == 1) {
            var10 = (arg2.field2022 + 1) * var10;
        }
        for (class146 var11 = (class146) var7.field6304.method2514((byte) 61); var11 != null; var11 = (class146) var7.field6304.method2511(-123)) {
            class167 var12 = class186.field2796.method1106(50, var11.field2025);
            int var13 = var12.field2331;
            if (var12.field2356 == 1) {
                var13 = (var11.field2022 + 1) * var13;
            }
            if (var10 > var13) {
                class54.method311(var11, -1, arg2);
                return;
            }
        }
        if (arg0) {
            field1554 = null;
        }
        var7.field6304.method2504(42, arg2);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILef;)V")
    public void method24(int arg0, int arg1, class385 arg2) {
        field1543++;
        if (arg1 != 1) {
            this.method24(15, 114, (class385) null);
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public void method706(int arg0) {
        if (arg0 != 13928) {
            this.field1537 = null;
        }
        if (this.field1552) {
            this.field1537.method2400(arg0 - 13925);
            this.field1537 = null;
        } else {
            this.field1549.method2016(arg0 ^ 0x3668);
            this.field1549 = null;
        }
        field1545++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)I")
    public int method707(boolean arg0) {
        field1536++;
        if (arg0) {
            this.method20(-108, -65);
        }
        return -1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBI)[[I")
    public final int[][] method708(int arg0, byte arg1, int arg2) {
        field1542++;
        int var4 = 100 / ((-arg1 - 25) / 55);
        if (this.field1541[arg2].field1552) {
            int[] var5 = this.field1541[arg2].method20(1, arg0);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field1541[arg2].method195(false, arg0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public void method306(int arg0) {
        field1538++;
        if (arg0 <= 103) {
            field1554 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IZ)V")
    public class118(int arg0, boolean arg1) {
        this.field1541 = new class118[arg0];
        this.field1552 = arg1;
    }

    static {
        new class151("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
