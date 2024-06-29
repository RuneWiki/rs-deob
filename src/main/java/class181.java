import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class181 extends class29 {

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "S")
    public static short field2921 = 320;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field2915 = 0;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "Ljava/lang/String;")
    public String field2926;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "[C")
    public char[] field2920;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "[C")
    public char[] field2923;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "[I")
    public int[] field2919;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "[I")
    public int[] field2931;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "[Z")
    public static boolean[] field2927;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I", line = 6)
    public static final int method1248(String arg0, byte arg1, int arg2, String arg3) {
        field2922++;
        int var4 = arg0.length();
        if (arg1 < 17) {
            field2932 = -108;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = arg3.length();
        char var8 = 0;
        char var9 = 0;
        while ((var5 - var8) < var4 || var7 > var6 - var9) {
            if (var4 <= var5 - var8) {
                return -1;
            }
            if (var7 <= (var6 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var5++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var6++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class209.method1530(-120, var22);
            var9 = class209.method1530(-125, var24);
            char var26 = class113.method782((byte) 46, arg2, var22);
            char var27 = class113.method782((byte) 29, arg2, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class250.method1767(arg2, var28, (byte) -123) - class250.method1767(arg2, var29, (byte) -123);
                }
            }
        }
        int var10 = Math.min(var4, var7);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg2 == 2) {
                var12 = var7 - var11 - 1;
                var13 = var4 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class250.method1767(arg2, var16, (byte) -123) - class250.method1767(arg2, var17, (byte) -123);
                }
            }
        }
        int var18 = var4 - var7;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg0.charAt(var19);
            char var21 = arg3.charAt(var19);
            if (var20 != var21) {
                return class250.method1767(arg2, var20, (byte) -123) - class250.method1767(arg2, var21, (byte) -123);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(CB)I", line = 132)
    public final int method1249(char arg0, byte arg1) {
        field2924++;
        if (this.field2919 == null) {
            return -1;
        }
        if (arg1 != 39) {
            this.field2920 = (char[]) null;
        }
        for (int var3 = 0; var3 < this.field2919.length; var3++) {
            if (this.field2920[var3] == arg0) {
                return this.field2919[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V", line = 159)
    public final void method1250(byte arg0) {
        field2929++;
        if (this.field2919 != null) {
            for (int var2 = 0; var2 < this.field2919.length; var2++) {
                this.field2919[var2] = class24.method149(this.field2919[var2], 32768);
            }
        }
        if (arg0 == -18 && this.field2931 != null) {
            for (int var3 = 0; var3 < this.field2931.length; var3++) {
                this.field2931[var3] = class24.method149(this.field2931[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/lang/String;BZ)I", line = 195)
    public static final int method1251(int arg0, String arg1, byte arg2, boolean arg3) {
        field2933++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg2 >= -22) {
            field2918 = -49;
        }
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
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
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
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

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IC)I", line = 272)
    public final int method1252(int arg0, char arg1) {
        field2930++;
        if (this.field2931 == null) {
            return -1;
        }
        if (arg0 != -1) {
            this.field2931 = (int[]) null;
        }
        for (int var3 = 0; var3 < this.field2931.length; var3++) {
            if (this.field2923[var3] == arg1) {
                return this.field2931[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lim;II)V", line = 307)
    private final void method1253(class192 arg0, int arg1, int arg2) {
        if (arg2 != 15567) {
            return;
        }
        if (arg1 == 1) {
            this.field2926 = arg0.method1355((byte) 64);
        } else if (arg1 == 2) {
            int var4 = arg0.method1399(arg2 ^ 0xBA1EFCA7);
            this.field2923 = new char[var4];
            this.field2931 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2931[var5] = arg0.method1396(-82);
                byte var6 = arg0.method1377(true);
                this.field2923[var5] = var6 == 0 ? 0 : class327.method2268(var6, arg2 - 15454);
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method1399(arg2 - 1172405351);
            this.field2919 = new int[var7];
            this.field2920 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2919[var8] = arg0.method1396(-108);
                byte var9 = arg0.method1377(true);
                this.field2920[var8] = var9 == 0 ? 0 : class327.method2268(var9, 116);
            }
        } else if (arg1 != 4) {
        }
        field2916++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILim;)V", line = 375)
    public final void method1254(int arg0, class192 arg1) {
        field2928++;
        if (arg0 != 29440) {
            this.method1252(-62, (char) 65466);
        }
        while (true) {
            int var3 = arg1.method1399(arg0 ^ 0xBA1EB368);
            if (var3 == 0) {
                return;
            }
            this.method1253(arg1, var3, arg0 ^ 0x4FCF);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 404)
    public static void method1255(int arg0) {
        int var1 = 75 / ((-arg0 - 28) / 42);
        field2927 = null;
    }
}
