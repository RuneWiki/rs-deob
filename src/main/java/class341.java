import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class341 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lgf;")
    public static class180 field5202 = new class180(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field5207 = -1;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static final void method2225(byte arg0) {
        field5204++;
        int var1 = class387.field5738.method1918((byte) 112);
        int var2 = class387.field5738.method1888((byte) 125);
        int var3 = class387.field5738.method1868(0);
        boolean var4 = class387.field5738.method1861((byte) 111) == 1;
        class445.field6534 = class387.field5738.method1918((byte) 69);
        class482.method2882(69, var1);
        class387.field5738.method2857(arg0 ^ 0x4737);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class237.field3436 >> 3); var20++) {
                for (int var21 = 0; var21 < (class83.field1366 >> 3); var21++) {
                    int var22 = class387.field5738.method2847(-112, 1);
                    if (var22 == 1) {
                        class332.field5101[var5][var20][var21] = class387.field5738.method2847(125, 26);
                    } else {
                        class332.field5101[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class387.field5738.method2849(107);
        int var6 = (class133.field2060 - class387.field5738.field4333) / 16;
        class178.field2702 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class178.field2702[var7][var19] = class387.field5738.method1870(-1945262512);
            }
        }
        class222.field3218 = new byte[var6][];
        if (arg0 != -77) {
            method2225((byte) 39);
        }
        class266.field3846 = new int[var6];
        class29.field476 = new byte[var6][];
        class364.field5473 = new int[var6];
        class323.field4961 = new int[var6];
        class379.field5653 = new byte[var6][];
        class403.field5925 = null;
        class515.field7579 = new int[var6];
        class98.field1597 = new byte[var6][];
        class466.field6852 = null;
        class274.field3954 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class237.field3436 >> 3; var10++) {
                for (int var11 = 0; var11 < class83.field1366 >> 3; var11++) {
                    int var12 = class332.field5101[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FFF) >> 3;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class274.field3954[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class274.field3954[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class515.field7579[var8] = class490.field7157.method677(class113.method838(arg0, 76), "m" + var17 + "_" + var18);
                            class364.field5473[var8] = class490.field7157.method677(-1, "l" + var17 + "_" + var18);
                            class323.field4961[var8] = class490.field7157.method677(-1, "um" + var17 + "_" + var18);
                            class266.field3846[var8] = class490.field7157.method677(-1, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class370.method2370(var2, arg0 ^ 0xFFFFFF33, false, var4, var3);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2226(int arg0, String arg1) {
        field5203++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 != 1102109936) {
            return 117;
        }
        while (class424.field6218 > var2) {
            if (arg1.equalsIgnoreCase(class469.field6908[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method2227(int arg0) {
        field5202 = null;
        if (arg0 != -1) {
            method2227(-99);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lcu;")
    public static final class145 method2228(int arg0) {
        field5205++;
        if (arg0 > -66) {
            field5202 = null;
        }
        return class2.field19;
    }
}
