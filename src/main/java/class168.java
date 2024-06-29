import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class168 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[S")
    public static short[] field2612 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Loq;")
    public static class239 field2608 = new class239("runescape", 0);

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "F")
    public static float field2614 = 0.0F;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Ljava/lang/String;")
    public String field2607;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
    public static int[] field2605;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([[BLhu;I)V", line = 4)
    public static final void method1230(byte[][] arg0, class85 arg1, int arg2) {
        field2606++;
        int[] var3 = new int[] { -1, 0, arg2, 0, 0 };
        for (int var4 = 0; var4 < arg1.field168; var4++) {
            class386.method2389(arg2 + 15804);
            for (int var5 = 0; var5 < class33.field662 >> 3; var5++) {
                for (int var6 = 0; var6 < class121.field1966 >> 3; var6++) {
                    boolean var7 = false;
                    int var8 = class86.field1503[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1.field189 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0xFFE684) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class381.field5776.length; var14++) {
                                if (class381.field5776[var14] == var13 && arg0[var14] != null) {
                                    class145 var15 = new class145(arg0[var14]);
                                    arg1.method70(var12, arg2 ^ 0x73, var15, var6 * 8, var11, var4, var9, class141.field2244, var5 * 8, var10);
                                    var7 = true;
                                    arg1.method658(var12, var15, arg2 - 106, var11, var3[0] == -1 ? var3 : null, class4.field109, var6 * 8, var4, var9, var5 * 8, var10);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg1.method83(var6 * 8, 8, var5 * 8, -1, var4, 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class381.field5778 = class519.field7721.method1992(var3[3], var3[0], var3[1], -23528, var3[2], class2.field93);
            class506.field7468 = var3[4];
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BIZ)[B", line = 91)
    public static final byte[] method1231(byte[] arg0, int arg1, boolean arg2) {
        field2604++;
        if (!arg2) {
            method1233(true);
        }
        byte[] var3 = new byte[arg1];
        class73.method589(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIILjg;)V", line = 105)
    public static final void method1232(int arg0, byte arg1, int arg2, int arg3, class223 arg4) {
        field2610++;
        long var5 = (long) (arg2 << 28 | arg0 << 14 | arg3);
        class294 var7 = (class294) class433.field6430.method171((byte) -92, var5);
        if (var7 == null) {
            class294 var8 = new class294();
            class433.field6430.method166(var8, var5, 82);
            var8.field4192.method2417(-127, arg4);
            return;
        }
        class134 var9 = class367.field5550.method1312((byte) 91, arg4.field3191);
        int var10 = var9.field2094;
        if (var9.field2107 == 1) {
            var10 = (arg4.field3192 + 1) * var10;
        }
        class223 var11 = (class223) var7.field4192.method2427(118);
        int var12 = -26 / ((93 - arg1) / 33);
        while (var11 != null) {
            class134 var13 = class367.field5550.method1312((byte) 91, var11.field3191);
            int var14 = var13.field2094;
            if (var13.field2107 == 1) {
                var14 = (var11.field3192 + 1) * var14;
            }
            if (var10 > var14) {
                class487.method2886(var11, arg4, -532427220);
                return;
            }
            var11 = (class223) var7.field4192.method2422(-91);
        }
        var7.field4192.method2417(-120, arg4);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 163)
    public static final void method1233(boolean arg0) {
        field2613++;
        if (field2605 != null) {
            return;
        }
        field2605 = new int[65536];
        if (arg0) {
            method1235(-90);
        }
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                field2605[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/lang/String;C)I", line = 285)
    public static final int method1234(int arg0, String arg1, char arg2) {
        field2609++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = arg0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 315)
    public static void method1235(int arg0) {
        int var1 = 36 / ((arg0 - 16) / 51);
        field2608 = null;
        field2605 = null;
        field2612 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(CB)Z", line = 326)
    public static final boolean method1236(char arg0, byte arg1) {
        field2611++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class26.field569;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (arg1 <= 6) {
            field2605 = null;
        }
        return false;
    }
}
