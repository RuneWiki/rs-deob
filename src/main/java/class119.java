import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class119 {

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
    public static int[] field1805 = new int[6];

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "B")
    public byte field1806;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1800;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1801;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Ljava/lang/String;")
    public String field1803;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Ljava/lang/String;")
    public String field1808;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[B")
    public static byte[] field1802;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field1807;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[[B")
    public static byte[][] field1799;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 10)
    public static final void method912(int arg0) {
        field1797++;
        int var1 = class523.field7392.method3848(-1333735960);
        class48.field817 = class523.field7392.method3851((byte) 30);
        boolean var2 = class523.field7392.method3869(-128) == 1;
        int var3 = class523.field7392.method3818((byte) 109);
        if (arg0 != -1) {
            field1802 = null;
        }
        int var4 = class523.field7392.method3855(arg0 ^ 0x1);
        class22.method277(false);
        class460.method2702(var3, 4);
        class523.field7392.method312(117);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class199.field2812 >> 3; var20++) {
                for (int var21 = 0; var21 < class232.field3611 >> 3; var21++) {
                    int var22 = class523.field7392.method309((byte) 57, 1);
                    if (var22 == 1) {
                        class188.field2713[var5][var20][var21] = class523.field7392.method309((byte) 57, 26);
                    } else {
                        class188.field2713[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class523.field7392.method317(8);
        int var6 = (class418.field6098 - class523.field7392.field9761) / 16;
        class271.field4086 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class271.field4086[var7][var19] = class523.field7392.method3880(8);
            }
        }
        class462.field6663 = null;
        class505.field7133 = new byte[var6][];
        class273.field4105 = new int[var6];
        class131.field1934 = new int[var6];
        class544.field7660 = new byte[var6][];
        class44.field708 = new int[var6];
        class583.field8197 = null;
        field1799 = new byte[var6][];
        class475.field6774 = new byte[var6][];
        class549.field7718 = new int[var6];
        class248.field3860 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class199.field2812 >> 3); var10++) {
                for (int var11 = 0; var11 < class232.field3611 >> 3; var11++) {
                    int var12 = class188.field2713[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FF9) >> 3;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class273.field4105[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class273.field4105[var8] = var15;
                            int var17 = (var15 & 0xFF22) >> 8;
                            int var18 = var15 & 0xFF;
                            class44.field708[var8] = class334.field4954.method2980(-9104, "m" + var17 + "_" + var18);
                            class248.field3860[var8] = class334.field4954.method2980(-9104, "l" + var17 + "_" + var18);
                            class549.field7718[var8] = class334.field4954.method2980(-9104, "um" + var17 + "_" + var18);
                            class131.field1934[var8] = class334.field4954.method2980(-9104, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class264.method1738(512, var4, var2, var1, 11);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 158)
    public static void method913(boolean arg0) {
        field1807 = null;
        field1805 = null;
        field1799 = null;
        if (arg0) {
            method913(false);
        }
        field1802 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 175)
    public static final void method914(int arg0) {
        class512.field7202.method205(class572.field8049, class73.field1298, class356.field5110);
        field1804++;
        if (arg0 != -31356) {
            field1799 = null;
        }
    }
}
