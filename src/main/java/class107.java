import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class107 {

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1644 = "glow1:";

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[F")
    public static float[] field1648 = new float[4];

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1636 = 0;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "F")
    public static float field1643;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lec;")
    public class236 field1642;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[I")
    public int[] field1633;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
    public int[] field1634;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[I")
    public static int[] field1635;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[I")
    public int[] field1645;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
    public int[] field1649;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "[I")
    public int[] field1651;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[I")
    public static int[] field1652;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "[I")
    public int[] field1654;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "[Lec;")
    public class236[] field1646;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[[I")
    public int[][] field1637;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[[I")
    public int[][] field1640;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B)V", line = 7)
    private final void method720(int arg0, byte[] arg1) {
        class303 var3 = new class303(class339.method2343(36, arg1));
        field1641++;
        int var4 = var3.method2043((byte) -120);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1650 = var3.method1996(-111);
        } else {
            this.field1650 = 0;
        }
        int var5 = var3.method2043((byte) -107);
        this.field1647 = var3.method1994(false);
        int var6 = 0;
        int var7 = -1;
        this.field1649 = new int[this.field1647];
        for (int var8 = 0; var8 < this.field1647; var8++) {
            this.field1649[var8] = var6 += var3.method1994(false);
            if (var7 < this.field1649[var8]) {
                var7 = this.field1649[var8];
            }
        }
        this.field1655 = var7 + 1;
        this.field1645 = new int[this.field1655];
        this.field1640 = new int[this.field1655][];
        this.field1651 = new int[this.field1655];
        this.field1634 = new int[this.field1655];
        this.field1633 = new int[this.field1655];
        if (~var5 != arg0) {
            this.field1654 = new int[this.field1655];
            for (int var9 = 0; var9 < this.field1655; var9++) {
                this.field1654[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1647; var10++) {
                this.field1654[this.field1649[var10]] = var3.method1996(52);
            }
            this.field1642 = new class236(this.field1654);
        }
        for (int var11 = 0; var11 < this.field1647; var11++) {
            this.field1645[this.field1649[var11]] = var3.method1996(-54);
        }
        for (int var12 = 0; var12 < this.field1647; var12++) {
            this.field1651[this.field1649[var12]] = var3.method1996(54);
        }
        for (int var13 = 0; var13 < this.field1647; var13++) {
            this.field1633[this.field1649[var13]] = var3.method1994(false);
        }
        for (int var14 = 0; var14 < this.field1647; var14++) {
            int var15 = 0;
            int var16 = this.field1649[var14];
            int var17 = this.field1633[var16];
            int var18 = -1;
            this.field1640[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field1640[var16][var19] = var15 += var3.method1994(false);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field1634[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field1640[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1637 = new int[var7 + 1][];
        this.field1646 = new class236[var7 + 1];
        for (int var21 = 0; var21 < this.field1647; var21++) {
            int var22 = this.field1649[var21];
            int var23 = this.field1633[var22];
            this.field1637[var22] = new int[this.field1634[var22]];
            for (int var24 = 0; var24 < this.field1634[var22]; var24++) {
                this.field1637[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field1640[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field1640[var22][var25];
                }
                this.field1637[var22][var26] = var3.method1996(-66);
            }
            this.field1646[var22] = new class236(this.field1637[var22]);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lwf;B)V", line = 196)
    public static final void method721(class306 arg0, byte arg1) {
        field1638++;
        int var2 = 121 / ((-arg1) / 53);
        class245.field3852 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 212)
    public static void method722(byte arg0) {
        field1635 = null;
        if (arg0 == -48) {
            field1644 = null;
            field1652 = null;
            field1648 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([BI)V", line = 228)
    public class107(byte[] arg0, int arg1) {
        this.field1653 = class23.method175(arg0, arg0.length, -52);
        if (this.field1653 != arg1) {
            throw new RuntimeException();
        }
        this.method720(-1, arg0);
    }
}
