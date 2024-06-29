import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class243 extends class449 {

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3527 = "";

    @OriginalMember(owner = "client!om", name = "y", descriptor = "Z")
    public static boolean field3533 = false;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3532 = new String[200];

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lch;")
    public static class151 field3525 = new class151("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field3536 = 0;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "Lrn;")
    public static class417 field3529;

    // $FF: synthetic field
    @OriginalMember(owner = "client!om", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field3537;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static void method1684(byte arg0) {
        if (arg0 <= 103) {
            field3527 = null;
        }
        field3529 = null;
        field3525 = null;
        field3527 = null;
        field3532 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBII)Z")
    public static final boolean method1685(int arg0, byte arg1, int arg2, int arg3) {
        field3531++;
        boolean var4 = true;
        class210 var5 = (class210) class133.method991(arg2, arg3, arg0);
        if (var5 != null) {
            var4 &= class472.method2797(115, var5);
        }
        class210 var6 = (class210) class106.method847(arg2, arg3, arg0, field3537 == null ? (field3537 = method1688("dc")) : field3537);
        if (arg1 >= -51) {
            return false;
        }
        if (var6 != null) {
            var4 &= class472.method2797(124, var6);
        }
        class210 var7 = (class210) class86.method730(arg2, arg3, arg0);
        if (var7 != null) {
            var4 &= class472.method2797(121, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
    public static final void method1686(int arg0) {
        if (arg0 > -47) {
            return;
        }
        field3535++;
        class259.method1745(class443.field6300, (byte) -68);
        int var1 = (class135.field1884 >> 10) + (class279.field4012 >> 3);
        class387.field5306 = class262.field3781.field4531 = 0;
        int var2 = (class189.field2810 >> 3) + (class184.field2784 >> 10);
        class262.field3781.method242(8, -54, 8);
        byte var3 = 18;
        class342.field4720 = new byte[var3][];
        class398.field5457 = new int[var3];
        class172.field2627 = new int[var3];
        class264.field3813 = new int[var3];
        class209.field3060 = new int[var3][4];
        class280.field4029 = new int[var3];
        class295.field4169 = new byte[var3][];
        class423.field5855 = new byte[var3][];
        class486.field6887 = new int[var3];
        class314.field4444 = new byte[var3][];
        class334.field4638 = new int[var3];
        client.field876 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class36.field388 >> 4)) / 8; var5 <= (((class36.field388 >> 4) + var1) / 8); var5++) {
            for (int var7 = (var2 - (class68.field998 >> 4)) / 8; var7 <= (((class68.field998 >> 4) + var2) / 8); var7++) {
                int var8 = (var5 << 8) + var7;
                class486.field6887[var4] = var8;
                class334.field4638[var4] = class280.field4026.method2657("m" + var5 + "_" + var7, (byte) 15);
                class264.field3813[var4] = class280.field4026.method2657("l" + var5 + "_" + var7, (byte) 15);
                class398.field5457[var4] = class280.field4026.method2657("n" + var5 + "_" + var7, (byte) 15);
                class172.field2627[var4] = class280.field4026.method2657("um" + var5 + "_" + var7, (byte) 15);
                class280.field4029[var4] = class280.field4026.method2657("ul" + var5 + "_" + var7, (byte) 15);
                if (class398.field5457[var4] == -1) {
                    class334.field4638[var4] = -1;
                    class264.field3813[var4] = -1;
                    class172.field2627[var4] = -1;
                    class280.field4029[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class398.field5457.length; var6++) {
            class398.field5457[var6] = -1;
            class334.field4638[var6] = -1;
            class264.field3813[var6] = -1;
            class172.field2627[var6] = -1;
            class280.field4029[var6] = -1;
        }
        class431.method2600(-1, var2, true, var1, false);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(II)V")
    public class243(int arg0, int arg1) {
        this.field3528 = arg0;
        this.field3530 = arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
    public static final void method1687(int arg0, boolean arg1) {
        class273.field3969 = arg1;
        field3526++;
        if (class273.field3969) {
            boolean var2 = class46.field710.method1172((byte) -107) == 1;
            int var3 = class46.field710.method1134(-16848);
            int var4 = class46.field710.method1139(-80);
            int var5 = class46.field710.method1181((byte) -38);
            class259.method1745(var5, (byte) -68);
            class46.field710.method710(false);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var21 = 0; var21 < class36.field388 >> 3; var21++) {
                    for (int var22 = 0; var22 < class68.field998 >> 3; var22++) {
                        int var23 = class46.field710.method712(false, 1);
                        if (var23 == 1) {
                            class4.field32[var6][var21][var22] = class46.field710.method712(false, 26);
                        } else {
                            class4.field32[var6][var21][var22] = -1;
                        }
                    }
                }
            }
            class46.field710.method715((byte) 124);
            int var7 = (class126.field1718 - class46.field710.field2298) / 16;
            class209.field3060 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var20 = 0; var20 < 4; var20++) {
                    class209.field3060[var8][var20] = class46.field710.method1168(255);
                }
            }
            class172.field2627 = new int[var7];
            class486.field6887 = new int[var7];
            class342.field4720 = null;
            class334.field4638 = new int[var7];
            class295.field4169 = new byte[var7][];
            class314.field4444 = new byte[var7][];
            class280.field4029 = new int[var7];
            class264.field3813 = new int[var7];
            class398.field5457 = null;
            client.field876 = new byte[var7][];
            class423.field5855 = new byte[var7][];
            int var9 = 0;
            for (int var10 = 0; var10 < 4; var10++) {
                for (int var11 = 0; var11 < (class36.field388 >> 3); var11++) {
                    for (int var12 = 0; var12 < (class68.field998 >> 3); var12++) {
                        int var13 = class4.field32[var10][var11][var12];
                        if (var13 != -1) {
                            int var14 = var13 >> 14 & 0x3FF;
                            int var15 = var13 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + (var15 / 8);
                            for (int var17 = 0; var17 < var9; var17++) {
                                if (class486.field6887[var17] == var16) {
                                    var16 = -1;
                                    break;
                                }
                            }
                            if (var16 != -1) {
                                class486.field6887[var9] = var16;
                                int var18 = var16 >> 8 & 0xFF;
                                int var19 = var16 & 0xFF;
                                class334.field4638[var9] = class280.field4026.method2657("m" + var18 + "_" + var19, (byte) 15);
                                class264.field3813[var9] = class280.field4026.method2657("l" + var18 + "_" + var19, (byte) 15);
                                class172.field2627[var9] = class280.field4026.method2657("um" + var18 + "_" + var19, (byte) 15);
                                class280.field4029[var9] = class280.field4026.method2657("ul" + var18 + "_" + var19, (byte) 15);
                                var9++;
                            }
                        }
                    }
                }
            }
            class431.method2600(-1, var3, false, var4, var2);
        } else {
            int var24 = class46.field710.method1137(true);
            int var25 = class46.field710.method1134(-16848);
            int var26 = class46.field710.method1139(-74);
            boolean var27 = class46.field710.method1181((byte) -38) == 1;
            class259.method1745(var24, (byte) -68);
            int var28 = (class126.field1718 - class46.field710.field2298) / 16;
            class209.field3060 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class209.field3060[var29][var34] = class46.field710.method1168(255);
                }
            }
            class314.field4444 = new byte[var28][];
            class334.field4638 = new int[var28];
            class486.field6887 = new int[var28];
            class172.field2627 = new int[var28];
            class342.field4720 = null;
            class295.field4169 = new byte[var28][];
            client.field876 = new byte[var28][];
            class280.field4029 = new int[var28];
            class398.field5457 = null;
            class264.field3813 = new int[var28];
            class423.field5855 = new byte[var28][];
            int var30 = 0;
            for (int var31 = (var25 - (class36.field388 >> 4)) / 8; var31 <= (((class36.field388 >> 4) + var25) / 8); var31++) {
                for (int var33 = (var26 - (class68.field998 >> 4)) / 8; var33 <= ((var26 + (class68.field998 >> 4)) / 8); var33++) {
                    class486.field6887[var30] = (var31 << 8) + var33;
                    class334.field4638[var30] = class280.field4026.method2657("m" + var31 + "_" + var33, (byte) 15);
                    class264.field3813[var30] = class280.field4026.method2657("l" + var31 + "_" + var33, (byte) 15);
                    class172.field2627[var30] = class280.field4026.method2657("um" + var31 + "_" + var33, (byte) 15);
                    class280.field4029[var30] = class280.field4026.method2657("ul" + var31 + "_" + var33, (byte) 15);
                    var30++;
                }
            }
            class431.method2600(-1, var26, false, var25, var27);
        }
        int var32 = -97 % ((arg0 + 16) / 45);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1688(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
