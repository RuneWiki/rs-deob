import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class364 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field4926 = -1;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4924 = new String[100];

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lff;")
    public static class9 field4933;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lcu;")
    public static class145 field4934;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "[B")
    public byte[] field4925;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[S")
    public short[] field4927;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "[S")
    public short[] field4928;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "[S")
    public short[] field4932;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;BIZ)I")
    public static final int method2122(String arg0, byte arg1, int arg2, boolean arg3) {
        field4930++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 > -19) {
            return 69;
        } else {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg3) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (arg2 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if ((var10 / arg2) != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4929++;
        for (class327 var7 = (class327) class321.field4209.method1771(arg6 + 20987); var7 != null; var7 = (class327) class321.field4209.method1774((byte) -29)) {
            if (var7.field4316 <= class31.field516) {
                var7.method2291(-122);
            } else {
                class54.method396((var7.field4322 << 7) + 64, arg0, var7.field4323 * 2, -18510, arg3 >> 1, arg1 >> 1, (var7.field4312 << 7) + 64, var7.field4314, arg2);
                class219.field2961.method2812(0, class80.field1181[1] + arg5, (byte) 33, var7.field4318 | 0xFF000000, class80.field1181[0] + arg4, var7.field4313);
            }
        }
        if (arg6 != -21109) {
            method2125(null, 32, null, null);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method2124(int arg0) {
        field4934 = null;
        field4933 = null;
        if (arg0 != 2) {
            field4934 = null;
        }
        field4924 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lfh;ILtk;Lqa;)V")
    public static final void method2125(class460 arg0, int arg1, class228 arg2, class162 arg3) {
        field4923++;
        class529 var4 = arg0.method2622(arg3, 0);
        if (arg1 != 18915) {
            field4934 = null;
        }
        if (var4 == null) {
            return;
        }
        int var5 = var4.method154();
        if (var5 < var4.method161()) {
            var5 = var4.method161();
        }
        byte var6 = 10;
        int var7 = arg2.field3072;
        int var8 = arg2.field3077;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field6352 != null) {
            var9 = class433.field5928.method2453(class129.field1879, arg0.field6352, null, (byte) -125, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class129.field1879[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class23.field415.method1637(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class23.field415.method1638() * var9 + (class23.field415.method1640() / 2);
        }
        int var15 = arg2.field3072 + (var5 / 2);
        if (var7 < class6.field184 + var5) {
            var7 = class6.field184;
            var15 = var10 / 2 + class6.field184 - (-(var5 / 2) - (var6 + 5));
        } else if (class6.field183 - var5 < var7) {
            var7 = class6.field183 - var5;
            var15 = class6.field183 - var6 - (var5 / 2 + 5) - (var10 / 2);
        }
        int var16 = arg2.field3077;
        if (var8 < (class6.field192 + var5)) {
            var8 = class6.field192;
            var16 = var5 / 2 + class6.field192 + var6;
        } else if ((class6.field178 - var5) < var8) {
            var8 = class6.field178 - var5;
            var16 = class6.field178 - (var5 / 2) - var11 - var6;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg2.field3072), (double) (var8 - arg2.field3077)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method3113((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field6352 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var16 - (-(var9 * class23.field415.method1638()) - 3);
            var20 = var10 + var18 + 10;
            if (arg0.field6355 != 0) {
                arg3.method1093(var21 - var16, var18, var16, 3, var20 - var18, arg0.field6355);
            }
            if (arg0.field6331 != 0) {
                arg3.method1099(var18, var20 - var18, var16, arg0.field6331, true, var21 - var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class129.field1879[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class23.field415.method1639(arg3, var23, var15, var16, arg0.field6359, true);
                var16 += class23.field415.method1638();
            }
        }
        if (arg0.field6364 == -1 && arg0.field6352 == null) {
            return;
        }
        class203 var24 = new class203(arg2);
        int var25 = var5 >> 1;
        var24.field2809 = var8 - var25;
        var24.field2814 = var21;
        var24.field2807 = var20;
        var24.field2808 = var7 + var25;
        var24.field2819 = var8 + var25;
        var24.field2811 = var18;
        var24.field2806 = var19;
        var24.field2813 = var7 - var25;
        class224.field3022.method1666((byte) -100, var24);
    }

    static {
        new class304(" days.", " Tage.", " jours.", " dias.");
        field4933 = new class9(109, 2);
        field4934 = new class145(79, 3);
    }
}
