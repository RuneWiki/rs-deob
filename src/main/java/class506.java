import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class506 {

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Lff;")
    private class9 field7438 = new class9(128);

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Lvh;")
    private class240 field7444;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Lfg;")
    public static class83 field7437 = new class83("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Liq;")
    public static final class430 method2971(int arg0) {
        field7434++;
        class430 var1 = (class430) class138.field1983.method2308((byte) 20);
        if (var1 == null) {
            if (arg0 >= -44) {
                field7437 = null;
            }
            return new class430();
        } else {
            class457.field6679--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lls;Lqa;ILtr;)V")
    public static final void method2972(class92 arg0, class162 arg1, int arg2, class191 arg3) {
        field7439++;
        class529 var4 = arg3.method1151(65535, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method125();
        if (arg2 != -10772) {
            field7437 = null;
        }
        if (var4.method129() > var5) {
            var5 = var4.method129();
        }
        byte var6 = 10;
        int var7 = arg0.field1235;
        int var8 = arg0.field1238;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field2662 != null) {
            var9 = class483.field7097.method367(null, null, arg3.field2662, false, class131.field1812);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class131.field1812[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class451.field6507.method2718(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class451.field6507.method2720() + (class451.field6507.method2721() / 2);
        }
        int var15 = var5 / 2 + arg0.field1235;
        int var16 = arg0.field1238;
        if ((class481.field7045 + var5) > var7) {
            var7 = class481.field7045;
            var15 = var5 / 2 + class481.field7045 + var10 / 2 + var6 + 5;
        } else if (class481.field7065 - var5 < var7) {
            var7 = class481.field7065 - var5;
            var15 = class481.field7065 - var5 / 2 - (var10 / 2) - var6 - 5;
        }
        if ((class481.field7053 + var5) > var8) {
            var16 = class481.field7053 + var6 + (var5 / 2);
            var8 = class481.field7053;
        } else if ((class481.field7064 - var5) < var8) {
            var8 = class481.field7064 - var5;
            var16 = class481.field7064 - (var5 / 2) - var11 - var6;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field1235), (double) (var8 - arg0.field1238)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method3109((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field2662 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = var16 + (class451.field6507.method2720() * var9) + 3;
            var20 = var18 + var10 + 10;
            if (arg3.field2650 != 0) {
                arg1.method1006(var18, arg3.field2650, var16, var21 - var16, arg2 + 10773, var20 - var18);
            }
            if (arg3.field2655 != 0) {
                arg1.method1003(arg3.field2655, var21 - var16, 1, var18, var16, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class131.field1812[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class451.field6507.method2717(arg1, var23, var15, var16, arg3.field2676, true);
                var16 += class451.field6507.method2720();
            }
        }
        if (arg3.field2669 == -1 && arg3.field2662 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class208 var25 = new class208(arg0);
        var25.field2953 = var8 - var24;
        var25.field2952 = var7 + var24;
        var25.field2945 = var21;
        var25.field2947 = var8 + var24;
        var25.field2943 = var20;
        var25.field2949 = var19;
        var25.field2941 = var7 - var24;
        var25.field2944 = var18;
        class496.field7297.method3070(var25, (byte) -127);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public final void method2973(byte arg0) {
        field7436++;
        class9 var2 = this.field7438;
        synchronized (this.field7438) {
            this.field7438.method65(false);
        }
        if (arg0 < 17) {
            this.method2975((byte) -85, -123);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V")
    public final void method2974(boolean arg0, int arg1) {
        field7440++;
        class9 var3 = this.field7438;
        synchronized (this.field7438) {
            if (!arg0) {
                this.field7438.method61((byte) -67, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Lwp;")
    public final class118 method2975(byte arg0, int arg1) {
        field7443++;
        class9 var3 = this.field7438;
        class118 var4;
        synchronized (this.field7438) {
            var4 = (class118) this.field7438.method56((long) arg1, 115);
            int var5 = 55 % ((-arg0 - 48) / 63);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field7444.method1411(true, arg1, 1);
        class118 var7 = new class118();
        if (var6 != null) {
            var7.method749(-28791, new class365(var6));
        }
        class9 var8 = this.field7438;
        synchronized (this.field7438) {
            this.field7438.method73((long) arg1, var7, 26425);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/lang/String;II)I")
    public static final int method2976(boolean arg0, String arg1, int arg2, int arg3) {
        field7442++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = arg3; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
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

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public final void method2977(int arg0) {
        field7435++;
        if (arg0 != 1) {
            method2978(-104, (byte) 125);
        }
        class9 var2 = this.field7438;
        synchronized (this.field7438) {
            this.field7438.method67(-101);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
    public static final void method2978(int arg0, byte arg1) {
        field7441++;
        if (class348.field4772 == arg0) {
            return;
        }
        class442.field6435 = class232.field3217 = class424.field6195[arg0];
        class437.method2607(false);
        class149.field2110 = new int[class442.field6435][class232.field3217];
        class162.field2319 = new int[class442.field6435][class232.field3217];
        class530.field7811 = new int[4][class442.field6435 >> 3][class232.field3217 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class6.field64[var2] = class250.method1472((byte) -122, class232.field3217, class442.field6435);
        }
        class99.field1369 = new byte[4][class442.field6435][class232.field3217];
        class478.method2807(class442.field6435, class232.field3217, 4, 14);
        class448.method2644(class418.field6109, class232.field3217 >> 3, true, class442.field6435 >> 3);
        class348.field4772 = arg0;
        int var3 = 30 % ((-arg1 - 24) / 47);
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Llf;ILvh;)V")
    public class506(class157 arg0, int arg1, class240 arg2) {
        this.field7444 = arg2;
        this.field7444.method1397((byte) -128, 1);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
    public static void method2979(int arg0) {
        field7437 = null;
        if (arg0 != -9955) {
            method2976(false, null, -86, -103);
        }
    }
}
