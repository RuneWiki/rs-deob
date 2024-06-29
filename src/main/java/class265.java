import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class265 extends class540 {

    @OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "I")
    private int field3738;

    @OriginalMember(owner = "client!fga", name = "s", descriptor = "I")
    private int field3745;

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!fga", name = "u", descriptor = "I")
    private int field3747;

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!fga", name = "y", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "Lke;")
    public static class622 field3742 = new class622(66, 16);

    @OriginalMember(owner = "client!fga", name = "t", descriptor = "I")
    public static int field3746 = -1;

    @OriginalMember(owner = "client!fga", name = "w", descriptor = "Lke;")
    public static class622 field3749 = new class622(33, 3);

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!fga", name = "v", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!fga", name = "x", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)Z")
    public final boolean method1742(int arg0, int arg1, int arg2) {
        if (arg1 > -26) {
            return false;
        } else {
            field3744++;
            return this.field3740 <= arg0 && this.field3741 >= arg0 && arg2 >= this.field3739 && this.field3737 >= arg2;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BIII)Z")
    public final boolean method1743(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -122) {
            field3743++;
            return this.field3738 == arg2 && this.field3747 <= arg1 && arg1 <= this.field3751 && arg3 >= this.field3745 && this.field3752 >= arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(III)Z")
    public final boolean method1744(int arg0, int arg1, int arg2) {
        field3735++;
        if (arg0 != 16) {
            this.method1744(-117, -72, 22);
        }
        return this.field3747 <= arg1 && arg1 <= this.field3751 && this.field3745 <= arg2 && arg2 <= this.field3752;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)I")
    public static final int method1745(int arg0) {
        field3748++;
        if (class260.field3656 == 0) {
            class490.field6937.method2862(new class690("jaclib"), -105);
            if (class490.field6937.method2868((byte) -72).method1558(105) != 100) {
                return 1;
            }
            if (!((class690) class490.field6937.method2868((byte) -116)).method3886(-2)) {
                class364.field5270.method3368(15324);
            }
            class260.field3656 = 1;
        }
        if (class260.field3656 == 1) {
            class393.field5580 = class490.method2866(26);
            class490.field6927.method2862(new class626(class134.field1740), -116);
            class490.field6940.method2862(new class690("jaggl"), -122);
            class490.field6941.method2862(new class690("jagdx"), -125);
            class490.field6942.method2862(new class690("jagmisc"), arg0 - 212);
            class490.field6943.method2862(new class690("sw3d"), -118);
            class490.field6944.method2862(new class690("hw3d"), -89);
            class490.field6945.method2862(new class690("jagtheora"), -90);
            class490.field6946.method2862(new class626(class689.field9756), -111);
            class490.field6947.method2862(new class626(class214.field3087), arg0 ^ 0xFFFFFFE1);
            class490.field6948.method2862(new class626(class518.field7400), -118);
            class490.field6949.method2862(new class626(class179.field2712), arg0 ^ 0xFFFFFFCD);
            class490.field6950.method2862(new class626(class490.field6965), -119);
            class490.field6951.method2862(new class626(class439.field6284), -115);
            class490.field6952.method2862(new class626(class145.field1851), -97);
            class490.field6953.method2862(new class626(class703.field9906), -101);
            class490.field6954.method2862(new class626(class171.field2443), -95);
            class490.field6955.method2862(new class626(client.field4674), -92);
            class490.field6956.method2862(new class626(class136.field1780), arg0 ^ 0xFFFFFFFB);
            class490.field6957.method2862(new class626(class739.field10311), arg0 - 195);
            class490.field6958.method2862(new class626(class657.field9270), -105);
            class490.field6959.method2862(new class626(class587.field8308), -110);
            class490.field6960.method2862(new class305(class397.field5630, "huffman"), -100);
            class490.field6961.method2862(new class626(class471.field6715), -128);
            class490.field6962.method2862(new class626(class264.field3732), -100);
            class490.field6963.method2862(new class626(class7.field79), -88);
            class490.field6964.method2862(new class225(class621.field8752, "details"), -90);
            for (int var1 = 0; var1 < class393.field5580.length; var1++) {
                if (class393.field5580[var1].method2868((byte) -103) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class490[] var3 = class393.field5580;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class490 var5 = var3[var4];
                int var6 = var5.method2861((byte) -111);
                int var7 = var5.method2868((byte) -77).method1558(124);
                var2 += var6 * var7 / 100;
            }
            class114.field1436 = var2;
            class260.field3656 = 2;
        }
        if (arg0 != 100) {
            return -37;
        } else if (class393.field5580 == null) {
            return 100;
        } else {
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            class490[] var11 = class393.field5580;
            for (int var12 = 0; var12 < var11.length; var12++) {
                class490 var16 = var11[var12];
                int var17 = var16.method2861((byte) 50);
                int var18 = var16.method2868((byte) -108).method1558(arg0 + 9);
                var9 += var17 * var18 / 100;
                var8 += var17;
                if (var18 < 100) {
                    var10 = false;
                }
            }
            if (var10) {
                if (!((class690) class490.field6942.method2868((byte) -78)).method3886(-2)) {
                    class364.field5270.method3377((byte) 117);
                }
                if (!((class690) class490.field6945.method2868((byte) -88)).method3886(-2)) {
                    class60.field827 = class364.field5270.method3375((byte) 119);
                }
                class393.field5580 = null;
            }
            int var13 = var9 - class114.field1436;
            int var14 = var8 - class114.field1436;
            int var15 = var14 <= 0 ? 100 : var13 * 100 / var14;
            if (!var10 && var15 > 99) {
                var15 = 99;
            }
            return var15;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "([IBII)V")
    public final void method1746(int[] arg0, byte arg1, int arg2, int arg3) {
        arg0[1] = arg3 - (this.field3740 - this.field3747);
        int var5 = 53 / ((-arg1 - 34) / 50);
        arg0[0] = this.field3738;
        field3736++;
        arg0[2] = this.field3745 + arg2 - this.field3739;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(III[I)V")
    public final void method1747(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = this.field3740 + arg0 - this.field3747;
        field3750++;
        int var5 = -116 % ((arg2 - 2) / 56);
        arg3[0] = 0;
        arg3[2] = arg1 + this.field3739 - this.field3745;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V")
    public static void method1748(byte arg0) {
        if (arg0 == -121) {
            field3749 = null;
            field3742 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3737 = arg8;
        this.field3738 = arg0;
        this.field3745 = arg2;
        this.field3740 = arg5;
        this.field3747 = arg1;
        this.field3752 = arg4;
        this.field3741 = arg7;
        this.field3739 = arg6;
        this.field3751 = arg3;
    }
}
