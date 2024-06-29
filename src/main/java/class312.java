import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class312 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lvh;")
    public static class240 field4295;

    static {
        new class83("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 3)
    public static void method1767(int arg0) {
        field4295 = null;
        if (arg0 != 23136) {
            method1767(-125);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 21)
    public static final void method1768(byte arg0) {
        field4294++;
        boolean var1 = class387.field5435.method2098(102) == 1;
        int var2 = class387.field5435.method2098(123);
        int var3 = class387.field5435.method2064(108);
        int var4 = class387.field5435.method2062((byte) 14);
        class65.field897 = class387.field5435.method2098(118);
        class506.method2978(var2, (byte) -114);
        class387.field5435.method2597(126);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class442.field6435 >> 3); var20++) {
                for (int var21 = 0; var21 < class232.field3217 >> 3; var21++) {
                    int var22 = class387.field5435.method2599((byte) 98, 1);
                    if (var22 == 1) {
                        class530.field7811[var5][var20][var21] = class387.field5435.method2599((byte) 98, 26);
                    } else {
                        class530.field7811[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class387.field5435.method2601((byte) 56);
        int var6 = (class438.field6394 - class387.field5435.field5069) / 16;
        class514.field7546 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class514.field7546[var7][var19] = class387.field5435.method2056((byte) 126);
            }
        }
        class292.field3916 = new int[var6];
        class234.field3249 = new int[var6];
        class477.field6982 = new int[var6];
        class499.field7346 = new byte[var6][];
        class20.field215 = new byte[var6][];
        class414.field6080 = new int[var6];
        class245.field3417 = null;
        class274.field3721 = new byte[var6][];
        class13.field159 = null;
        class101.field1378 = new int[var6];
        class207.field2938 = new byte[var6][];
        int var8 = 0;
        if (arg0 >= -86) {
            method1767(-121);
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class442.field6435 >> 3; var10++) {
                for (int var11 = 0; var11 < (class232.field3217 >> 3); var11++) {
                    int var12 = class530.field7811[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class101.field1378[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class101.field1378[var8] = var15;
                            int var17 = (var15 & 0xFF6C) >> 8;
                            int var18 = var15 & 0xFF;
                            class477.field6982[var8] = class241.field3334.method1396("m" + var17 + "_" + var18, (byte) 71);
                            class234.field3249[var8] = class241.field3334.method1396("l" + var17 + "_" + var18, (byte) 71);
                            class414.field6080[var8] = class241.field3334.method1396("um" + var17 + "_" + var18, (byte) 71);
                            class292.field3916[var8] = class241.field3334.method1396("ul" + var17 + "_" + var18, (byte) 71);
                            var8++;
                        }
                    }
                }
            }
        }
        class487.method2866(false, var1, 28, var3, var4);
    }
}
