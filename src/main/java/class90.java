import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class90 {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    private int field1641 = -1;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    private int field1655 = 0;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lv;")
    private class218 field1639 = new class218();

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
    public boolean field1658 = false;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[[[I")
    private int[][][] field1638;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "[Lhf;")
    private class82[] field1644;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lv;")
    public static class218 field1649 = new class218();

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "[I")
    public static int[] field1651 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Loc;")
    public static class151 field1653 = class137.method873(2, "gr-Un:");

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Loc;")
    private static class151 field1652 = class137.method873(2, "Please enter your username)3");

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Loc;")
    public static class151 field1654 = field1652;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1657 = 0;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static volatile int field1659 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public final void method572(byte arg0) {
        if (arg0 > -103) {
            method574(null, 108);
        }
        for (int var2 = 0; var2 < this.field1647; var2++) {
            this.field1638[var2][0] = null;
            this.field1638[var2][1] = null;
            this.field1638[var2][2] = null;
            this.field1638[var2] = null;
        }
        field1636++;
        this.field1638 = null;
        this.field1644 = null;
        this.field1639.method1357(4);
        this.field1639 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method573(int arg0) {
        field1648++;
        if (this.field1647 != this.field1646) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 1) {
            this.field1646 = -82;
        }
        for (int var2 = 0; var2 < this.field1647; var2++) {
            this.field1644[var2] = class202.field3601;
        }
        return this.field1638;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lwa;I)La;")
    public static final class1 method574(class229 arg0, int arg1) {
        arg0.method1475(255);
        field1640++;
        int var2 = arg0.method1475(arg1 ^ 0xFF);
        class1 var3 = class54.method369(var2, (byte) -112);
        var3.field25 = arg0.method1475(255);
        int var4 = arg0.method1475(arg1 + 255);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method1475(arg1 + 255);
            var3.method13(0, var6, arg0);
        }
        var3.method2(3);
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method575(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1645++;
        if (class197.method1234(arg1, 113)) {
            class39.field794 = null;
            class53.method365(arg4, arg0, class115.field2067[arg1], -1, 5315, arg2, arg8, arg7, arg5, arg6);
            if (arg3 <= -64 && class39.field794 != null) {
                class53.method365(arg4, arg0, class39.field794, -1412584499, 5315, arg2, arg8, arg7, class191.field3378, class82.field1559);
                class39.field794 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class224.field3911[var9] = true;
            }
        } else {
            class224.field3911[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method576(int arg0) {
        field1652 = null;
        field1649 = null;
        field1651 = null;
        field1654 = null;
        if (arg0 != 4134) {
            method574(null, -89);
        }
        field1653 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lwd;I)Loc;")
    public static final class151 method577(class232 arg0, int arg1) {
        field1637++;
        if (class122.method739(class174.method1110(true, arg0), 258072555) == 0) {
            return null;
        }
        if (arg1 > -92) {
            method574(null, 49);
        }
        if (arg0.field4151 == null || arg0.field4151.method972(0).method988(-1) == 0) {
            return class8.field124 ? class1.field41 : null;
        } else {
            return arg0.field4151;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[[I")
    public final int[][] method578(int arg0, int arg1) {
        field1642++;
        if (arg1 != -1) {
            this.field1641 = 38;
        }
        if (this.field1647 == this.field1646) {
            this.field1658 = this.field1644[arg0] == null;
            this.field1644[arg0] = class202.field3601;
            return this.field1638[arg0];
        } else if (this.field1647 == 1) {
            this.field1658 = this.field1641 != arg0;
            this.field1641 = arg0;
            return this.field1638[0];
        } else {
            class82 var3 = this.field1644[arg0];
            if (var3 == null) {
                this.field1658 = true;
                if (this.field1655 < this.field1647) {
                    var3 = new class82(arg0, this.field1655);
                    this.field1655++;
                } else {
                    class82 var4 = (class82) this.field1639.method1359(arg1 ^ 0x35);
                    var3 = new class82(arg0, var4.field1560);
                    this.field1644[var4.field1563] = null;
                    var4.method636(84);
                }
                this.field1644[arg0] = var3;
            } else {
                this.field1658 = false;
            }
            this.field1639.method1356(var3, arg1 + 2);
            return this.field1638[var3.field1560];
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V")
    public class90(int arg0, int arg1, int arg2) {
        this.field1647 = arg0;
        this.field1646 = arg1;
        this.field1638 = new int[this.field1647][3][arg2];
        this.field1644 = new class82[this.field1646];
    }
}
