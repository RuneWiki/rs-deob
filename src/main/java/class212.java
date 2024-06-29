import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class212 extends class352 {

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "[I")
    public static int[] field3628 = new int[4096];

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "Lss;")
    public static class213 field3633 = new class213(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "[B")
    private byte[] field3629;

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3631;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
    public class212() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
    public static void method1576(boolean arg0) {
        if (arg0) {
            field3633 = null;
            field3628 = null;
            field3631 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)V")
    public static final void method1577(byte arg0) {
        field3632++;
        int var1 = class279.field4428.method1475(255);
        int var2 = class279.field4428.method1455(-3387);
        if (arg0 >= -27) {
            method1577((byte) 43);
        }
        int var3 = class279.field4428.method1455(-3387);
        boolean var4 = class279.field4428.method1475(255) == 1;
        class357.field5545 = class279.field4428.method1426(-127);
        class206.method1406(0);
        class104.method707(-101, var1);
        class279.field4428.method1860((byte) -107);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class135.field1839 >> 3; var20++) {
                for (int var21 = 0; var21 < class197.field3038 >> 3; var21++) {
                    int var22 = class279.field4428.method1852(89, 1);
                    if (var22 == 1) {
                        class298.field4685[var5][var20][var21] = class279.field4428.method1852(110, 26);
                    } else {
                        class298.field4685[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class279.field4428.method1854((byte) 38);
        int var6 = (class156.field2156 - class279.field4428.field3162) / 16;
        class84.field1228 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class84.field1228[var7][var19] = class279.field4428.method1436((byte) 104);
            }
        }
        class122.field1666 = new int[var6];
        class402.field6047 = new byte[var6][];
        class321.field4987 = new int[var6];
        class100.field1431 = null;
        class140.field1906 = null;
        class411.field6236 = new int[var6];
        class529.field7782 = new int[var6];
        class187.field2729 = new byte[var6][];
        class94.field1365 = new byte[var6][];
        class77.field1154 = new byte[var6][];
        class346.field5392 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class135.field1839 >> 3); var10++) {
                for (int var11 = 0; var11 < (class197.field3038 >> 3); var11++) {
                    int var12 = class298.field4685[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FFA) >> 3;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class529.field7782[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class529.field7782[var8] = var15;
                            int var17 = (var15 & 0xFF73) >> 8;
                            int var18 = var15 & 0xFF;
                            class122.field1666[var8] = class128.field1730.method1014(true, "m" + var17 + "_" + var18);
                            class346.field5392[var8] = class128.field1730.method1014(true, "l" + var17 + "_" + var18);
                            class411.field6236[var8] = class128.field1730.method1014(true, "um" + var17 + "_" + var18);
                            class321.field4987[var8] = class128.field1730.method1014(true, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class387.method2485(var4, 10, 98, var2, var3);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BII)V")
    public final void method1578(byte arg0, int arg1, int arg2) {
        field3627++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        if (arg2 != 16080) {
            this.method1579(14, 55, 39, -14);
        }
        this.field3629[var4++] = var5;
        this.field3629[var4] = var5;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIII)[B")
    public final byte[] method1579(int arg0, int arg1, int arg2, int arg3) {
        this.field3629 = new byte[arg1 * arg3 * 2 * arg0];
        field3630++;
        this.method1955(arg1, arg3, arg0, 13698);
        if (arg2 != -64) {
            field3633 = null;
        }
        return this.field3629;
    }
}
