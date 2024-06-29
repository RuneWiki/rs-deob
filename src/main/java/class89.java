import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class89 implements class199 {

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    private int field1554 = 50;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Z")
    private boolean field1553 = false;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lkk;")
    private class223 field1569;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lkk;")
    private class223 field1547;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Lha;")
    private class30 field1573;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Lha;")
    private class30 field1576;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[B")
    private byte[] field1551;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "[Z")
    private boolean[] field1577;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "[Z")
    private boolean[] field1557;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[B")
    private byte[] field1567;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "[S")
    private short[] field1563;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "[B")
    private byte[] field1562;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[Z")
    private boolean[] field1564;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[Z")
    private boolean[] field1543;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[Z")
    private boolean[] field1571;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[B")
    private byte[] field1550;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[Lci;")
    public static class232[] field1549 = new class232[6];

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Leb;")
    public static class230 field1565 = class68.method589(0, "details");

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Leb;")
    public static class230 field1580 = class68.method589(0, "");

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "Leb;")
    public static class230 field1582 = class68.method589(0, " loggt sich aus)3");

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "Leb;")
    public static class230 field1579 = field1580;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Leb;")
    public static class230 field1545 = field1580;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field1572 = 0;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lkk;")
    public static class223 field1555;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lkk;")
    public static class223 field1559;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(II)Z")
    public final boolean method721(int arg0, int arg1) {
        field1561++;
        int var3 = 6 % ((-arg0 - 47) / 52);
        class34 var4 = this.method733(0, arg1);
        return var4 == null ? false : var4.method311(4, this.field1569, this);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1544++;
        if (arg6 != -29) {
            method722(-17, 110, -20, -74, -71, -32, (byte) -20, -46);
        }
        if (arg3 == arg7) {
            class118.method943(arg1, (byte) -78, arg4, arg3, arg5, arg0, arg2);
        } else if (class78.field1404 <= (arg0 - arg3) && (arg0 + arg3) <= class42.field769 && arg1 - arg7 >= class15.field345 && arg1 + arg7 <= class259.field4587) {
            class228.method1574(2143942273, arg5, arg3, arg0, arg7, arg4, arg1, arg2);
        } else {
            class210.method1464(arg7, arg0, arg3, arg2, arg4, arg1, arg5, arg6 + 32);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[I")
    public final int[] method723(int arg0, byte arg1) {
        class34 var3 = this.method733(0, arg0);
        if (arg1 <= 82) {
            this.method732(60, (byte) -48);
        }
        field1568++;
        return var3 == null ? null : var3.method312(this.field1569, this.field1553 || this.field1571[arg0], (byte) -128, this);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
    public final void method724(int arg0, boolean arg1) {
        this.field1553 = arg1;
        field1556++;
        this.method725(21630);
        int var3 = 85 / ((67 - arg0) / 46);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method725(int arg0) {
        this.field1573.method275(false);
        if (arg0 != 21630) {
            this.field1557 = null;
        }
        if (this.field1576 != null) {
            this.field1576.method275(false);
        }
        field1574++;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)Z")
    public final boolean method726(int arg0, int arg1) {
        field1583++;
        if (this.field1553 || this.field1571[arg0]) {
            return true;
        } else {
            int var3 = 122 / ((-arg1 - 32) / 56);
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)I")
    public static final int method727(int arg0) {
        field1560++;
        if (arg0 < 101) {
            field1572 = 85;
        }
        return 16;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Z")
    public final boolean method728(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method730(116, false, -0.90914065F);
        }
        field1570++;
        return this.field1543[arg1];
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)I")
    public final int method729(int arg0, int arg1) {
        field1552++;
        return arg0 < 55 ? -77 : this.field1563[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZF)[I")
    public final int[] method730(int arg0, boolean arg1, float arg2) {
        field1558++;
        class34 var4 = this.method733(0, arg0);
        if (var4 == null) {
            return null;
        }
        var4.field646 = true;
        if (arg1) {
            this.method726(67, 46);
        }
        return var4.method317(arg2, this, this.field1553 || this.field1571[arg0], 2, this.field1569);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Z")
    public final boolean method731(byte arg0, int arg1) {
        if (arg0 < 73) {
            this.method725(-85);
        }
        field1575++;
        return this.field1557[arg1];
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IB)V")
    public final void method732(int arg0, byte arg1) {
        for (class34 var3 = (class34) this.field1573.method274(-119); var3 != null; var3 = (class34) this.field1573.method277(125)) {
            if (var3.field646) {
                var3.method314((byte) 124, arg0);
                var3.field646 = false;
            }
        }
        field1578++;
        int var4 = -104 % ((arg1 - 52) / 40);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(II)Lva;")
    private final class34 method733(int arg0, int arg1) {
        field1546++;
        class34 var3 = (class34) this.field1573.method273((long) arg1, arg0 ^ 0xFF);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1547.method1546(arg0, (byte) -100, arg1);
        if (var4 == null) {
            return null;
        } else {
            class14 var5 = new class14(var4);
            class34 var6 = new class34(var5);
            this.field1573.method276(var6, (long) arg1, -105);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IZ)V")
    public static final void method734(int arg0, boolean arg1) {
        class186.field3266--;
        field1548++;
        if (arg1 || class186.field3266 == arg0) {
            return;
        }
        class43.method374(class149.field2667, arg0 + 1, class149.field2667, arg0, class186.field3266 - arg0);
        class43.method374(class192.field3388, arg0 + 1, class192.field3388, arg0, class186.field3266 - arg0);
        class43.method372(class225.field3890, arg0 + 1, class225.field3890, arg0, class186.field3266 - arg0);
        class43.method375(class145.field2599, arg0 + 1, class145.field2599, arg0, class186.field3266 - arg0);
        class43.method377(class46.field809, arg0 + 1, class46.field809, arg0, class186.field3266 - arg0);
        class43.method377(class244.field4196, arg0 + 1, class244.field4196, arg0, class186.field3266 - arg0);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkk;Lkk;Lkk;IZ)V")
    public class89(class223 arg0, class223 arg1, class223 arg2, int arg3, boolean arg4) {
        this.field1569 = arg2;
        this.field1553 = arg4;
        this.field1554 = arg3;
        this.field1547 = arg0;
        this.field1573 = new class30(this.field1554);
        this.field1576 = null;
        class14 var6 = new class14(arg1.method1546(0, (byte) -100, 0));
        int var7 = var6.method161(4);
        this.field1551 = new byte[var7];
        this.field1577 = new boolean[var7];
        this.field1557 = new boolean[var7];
        this.field1567 = new byte[var7];
        this.field1563 = new short[var7];
        this.field1562 = new byte[var7];
        this.field1564 = new boolean[var7];
        this.field1543 = new boolean[var7];
        this.field1571 = new boolean[var7];
        this.field1550 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1577[var8] = var6.method200(255) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1577[var9]) {
                this.field1543[var9] = var6.method200(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1577[var10]) {
                this.field1557[var10] = var6.method200(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1577[var11]) {
                this.field1571[var11] = var6.method200(255) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1577[var12]) {
                this.field1564[var12] = var6.method200(255) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1577[var13]) {
                this.field1550[var13] = var6.method198(false);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1577[var14]) {
                this.field1567[var14] = var6.method198(false);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1577[var15]) {
                this.field1562[var15] = var6.method198(false);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1577[var16]) {
                this.field1551[var16] = var6.method198(false);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1577[var17]) {
                this.field1563[var17] = (short) var6.method161(4);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static void method735(int arg0) {
        field1580 = null;
        field1579 = null;
        if (arg0 > -53) {
            method734(118, true);
        }
        field1555 = null;
        field1582 = null;
        field1549 = null;
        field1545 = null;
        field1565 = null;
        field1559 = null;
    }
}
