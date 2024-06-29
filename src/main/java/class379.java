import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class379 {

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "F")
    public static float field5543;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Lha;")
    public static class65 field5542;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public static void method2419(int arg0) {
        field5542 = null;
        if (arg0 < 48) {
            field5542 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjp;)V")
    public static final void method2420(int arg0, class376 arg1) {
        field5537++;
        byte[] var2 = new byte[arg0];
        if (class365.field5320 != null) {
            try {
                class365.field5320.method174(true, 0L);
                class365.field5320.method172(var2, arg0 + 29645);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2403(var2, 24, 128, 0);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ID)V")
    public static final void method2421(int arg0, double arg1) {
        field5538++;
        if (arg0 < 51 || class229.field3123 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class342.field4931[var3] = var4 > 255 ? 255 : var4;
        }
        class229.field3123 = arg1;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
    public static final void method2422(boolean arg0) {
        field5540++;
        int var1 = class89.field1233.method2375((byte) 31);
        int var2 = class89.field1233.method2405(-361);
        boolean var3 = class89.field1233.method2412(-112) == 1;
        class184.field2474 = class89.field1233.method2412(-94);
        int var4 = class89.field1233.method2410(65280);
        class750.method4145((byte) -31);
        class41.method281(598809411, var1);
        class89.field1233.method1990(false);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class597.field8132 >> 3; var20++) {
                for (int var21 = 0; var21 < class628.field8800 >> 3; var21++) {
                    int var22 = class89.field1233.method1993(-1, 1);
                    if (var22 == 1) {
                        class590.field7953[var5][var20][var21] = class89.field1233.method1993(-1, 26);
                    } else {
                        class590.field7953[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class89.field1233.method1984(-69);
        int var6 = (class206.field2700 - class89.field1233.field5459) / 16;
        class30.field450 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class30.field450[var7][var19] = class89.field1233.method2384(108);
            }
        }
        if (!arg0) {
            return;
        }
        class476.field6617 = new byte[var6][];
        class103.field1426 = null;
        class503.field6969 = new int[var6];
        class255.field3811 = new byte[var6][];
        class618.field8334 = new int[var6];
        class381.field5565 = null;
        class73.field1070 = new byte[var6][];
        class366.field5331 = new int[var6];
        class560.field7531 = new byte[var6][];
        class286.field4212 = new int[var6];
        class186.field2487 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class597.field8132 >> 3; var10++) {
                for (int var11 = 0; var11 < (class628.field8800 >> 3); var11++) {
                    int var12 = class590.field7953[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFD1F3) >> 14;
                        int var14 = (var12 & 0x3FFF) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class186.field2487[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class186.field2487[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class618.field8334[var8] = class587.field7828.method2092("m" + var17 + "_" + var18, false);
                            class366.field5331[var8] = class587.field7828.method2092("l" + var17 + "_" + var18, false);
                            class503.field6969[var8] = class587.field7828.method2092("um" + var17 + "_" + var18, false);
                            class286.field4212[var8] = class587.field7828.method2092("ul" + var17 + "_" + var18, false);
                            var8++;
                        }
                    }
                }
            }
        }
        class327.method2069(var4, var3, var2, 11, 72);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
    public static final void method2423(int arg0, int arg1) {
        field5544++;
        if (arg0 <= 19) {
            return;
        }
        class150 var2 = (class150) class507.field7007.method3953((long) arg1, 14);
        if (var2 != null) {
            var2.field2082.method2719(-2);
            class672.method3739(102, var2.field2086, var2.field2084);
            var2.method792((byte) -118);
        }
    }
}
