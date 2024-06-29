import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class272 extends OutputStream {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lve;")
    public static class527 field3798 = new class527(7, 2);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!mb", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3800++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
    public static final void method1769(int arg0, boolean arg1) {
        if (arg1 && class436.field6206 != null) {
            class472.field6735 = class436.field6206.field8669;
        } else {
            class472.field6735 = -1;
        }
        field3799++;
        class261.field3682 = 0;
        class271.field3793 = null;
        class436.field6206 = null;
        class425.field5983 = null;
        class436.method2616();
        class436.field6223.method2503(10);
        class363.field5252 = null;
        class265.field3746 = -1;
        class682.field9684 = null;
        class614.field8657 = null;
        class356.field5169 = null;
        class518.field7405 = null;
        class572.field8098 = null;
        class436.field6215 = null;
        class214.field3085 = null;
        if (arg0 != -374497842) {
            field3798 = null;
        }
        class751.field10420 = null;
        class650.field9151 = null;
        class389.field5537 = -1;
        if (class436.field6213 != null) {
            class436.field6213.method3706((byte) -46);
            class436.field6213.method3705((byte) -25, 128, 64);
        }
        if (class436.field6205 != null) {
            class436.field6205.method3216(64, -1, 64);
        }
        if (class436.field6209 != null) {
            class436.field6209.method326(64, 4);
        }
        class324.field4862.method3267(arg0 + 374497842, 64);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static final void method1770(int arg0) {
        field3803++;
        if (!class26.field382) {
            return;
        }
        class176 var1 = class333.method2152(false, class76.field1018, class483.field6863);
        if (var1 != null && var1.field2633 != null) {
            class140 var2 = new class140();
            var2.field1802 = var1;
            var2.field1808 = var1.field2633;
            class353.method2219(var2);
        }
        class26.field382 = false;
        class189.field2820 = -1;
        class303.field4540 = arg0;
        if (var1 != null) {
            class288.method1923((byte) -19, var1);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static final void method1771(byte arg0) {
        field3801++;
        boolean var1 = class26.field371.method846(15319) == 1;
        int var2 = class26.field371.method867(true);
        class64.field867 = class26.field371.method855(0);
        int var3 = class26.field371.method837(29806);
        int var4 = class26.field371.method837(29806);
        class361.method2265(121);
        class481.method2824(arg0 ^ 0x2CCA, var2);
        class26.field371.method2137(1112311075);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class109.field1314 >> 3); var20++) {
                for (int var21 = 0; var21 < class760.field10479 >> 3; var21++) {
                    int var22 = class26.field371.method2138(1, (byte) -105);
                    if (var22 == 1) {
                        class626.field8833[var5][var20][var21] = class26.field371.method2138(26, (byte) -105);
                    } else {
                        class626.field8833[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class26.field371.method2146(false);
        int var6 = (class440.field6294 - class26.field371.field1521) / 16;
        class713.field10063 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class713.field10063[var7][var19] = class26.field371.method871(23995);
            }
        }
        class467.field6632 = null;
        class146.field1866 = new int[var6];
        class379.field5438 = new int[var6];
        class405.field5709 = new byte[var6][];
        class347.field5088 = new int[var6];
        class96.field1236 = new int[var6];
        class205.field3018 = new byte[var6][];
        class9.field171 = new byte[var6][];
        class550.field7793 = new byte[var6][];
        class145.field1853 = null;
        class141.field1823 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class109.field1314 >> 3); var10++) {
                for (int var11 = 0; var11 < class760.field10479 >> 3; var11++) {
                    int var12 = class626.field8833[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFE8F9) >> 14;
                        int var14 = (var12 & 0x3FF8) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class96.field1236[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class96.field1236[var8] = var15;
                            int var17 = (var15 & 0xFF5D) >> 8;
                            int var18 = var15 & 0xFF;
                            class146.field1866[var8] = class277.field3850.method3134(class470.method2786(arg0, 85), "m" + var17 + "_" + var18);
                            class141.field1823[var8] = class277.field3850.method3134(class470.method2786(arg0, 85), "l" + var17 + "_" + var18);
                            class379.field5438[var8] = class277.field3850.method3134(0, "um" + var17 + "_" + var18);
                            class347.field5088[var8] = class277.field3850.method3134(0, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        if (arg0 != 85) {
            field3798 = null;
        }
        class230.method1600(var1, var4, 11, var3, arg0 ^ 0xFFFFA71F);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method1772(int arg0) {
        field3798 = null;
        int var1 = -16 % ((37 - arg0) / 40);
    }
}
