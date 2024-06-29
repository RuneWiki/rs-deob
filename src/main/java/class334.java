import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class334 {

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "[I")
    private int[] field4324;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Ljs;")
    public static class275 field4325 = new class275(9, 0, 4, 1);

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)I")
    public final int method1868(int arg0, byte arg1) {
        field4326++;
        if (arg1 <= 24) {
            this.method1868(-83, (byte) -68);
        }
        int var3 = (this.field4324.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4324[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4324[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static final void method1869(int arg0) {
        field4328++;
        int var1 = class532.field7483.method2114(89);
        int var2 = class532.field7483.method2136(false);
        int var3 = class532.field7483.method2091(255);
        class593.field8620 = class532.field7483.method2091(arg0 ^ 0x2DC);
        boolean var4 = class532.field7483.method2129(arg0 - 658) == 1;
        class237.method1345((byte) -91);
        class620.method3559(var3, (byte) 120);
        class532.field7483.method2806(-1);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class106.field1289 >> 3); var20++) {
                for (int var21 = 0; var21 < (class422.field5452 >> 3); var21++) {
                    int var22 = class532.field7483.method2813(1, 120);
                    if (var22 == 1) {
                        class415.field5397[var5][var20][var21] = class532.field7483.method2813(26, arg0 - 549);
                    } else {
                        class415.field5397[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class532.field7483.method2814((byte) 113);
        int var6 = (class445.field6138 - class532.field7483.field4966) / 16;
        class82.field1002 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class82.field1002[var7][var19] = class532.field7483.method2123(false);
            }
        }
        class461.field6370 = new int[var6];
        class74.field871 = new byte[var6][];
        if (arg0 != 547) {
            method1870(118);
        }
        class148.field1777 = new byte[var6][];
        class422.field5451 = new byte[var6][];
        class196.field2378 = new int[var6];
        class391.field5165 = new int[var6];
        class550.field8087 = new byte[var6][];
        class102.field1255 = null;
        class633.field9116 = new int[var6];
        class5.field44 = null;
        class39.field302 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class106.field1289 >> 3; var10++) {
                for (int var11 = 0; var11 < (class422.field5452 >> 3); var11++) {
                    int var12 = class415.field5397[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class633.field9116[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class633.field9116[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class39.field302[var8] = class368.field4834.method2579(-1, "m" + var17 + "_" + var18);
                            class196.field2378[var8] = class368.field4834.method2579(arg0 - 548, "l" + var17 + "_" + var18);
                            class461.field6370[var8] = class368.field4834.method2579(class347.method1937(arg0, -548), "um" + var17 + "_" + var18);
                            class391.field5165[var8] = class368.field4834.method2579(arg0 - 548, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class367.method2053(var1, var2, 10, true, var4);
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "([I)V")
    public class334(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4324 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4324[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4324[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4324[var5 + var5] = arg0[var4];
            this.field4324[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V")
    public static void method1870(int arg0) {
        if (arg0 == 14083) {
            field4325 = null;
        }
    }
}
