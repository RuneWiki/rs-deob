import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class205 {

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2769 = "Created gameworld";

    @OriginalMember(owner = "client!np", name = "g", descriptor = "[I")
    public static int[] field2772 = new int[2];

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
    public static boolean field2770 = false;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method1214(int arg0) {
        if (arg0 == 1) {
            field2769 = null;
            field2772 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method1215(String arg0, int arg1, String arg2, int arg3) {
        field2767++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var7 - var9 < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class291.method1982(-413, var22);
            var9 = class291.method1982(-413, var24);
            char var26 = class12.method91(-205, arg3, var22);
            char var27 = class12.method91(-205, arg3, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class376.method2441(-242, arg3, var28) - class376.method2441(-242, arg3, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class376.method2441(-242, arg3, var20) - class376.method2441(-242, arg3, var21);
                }
            }
        }
        if (arg1 != 1) {
            method1215((String) null, -95, (String) null, -87);
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class376.method2441(-242, arg3, var14) - class376.method2441(-242, arg3, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)Z")
    public static final boolean method1216(int arg0) {
        field2771++;
        try {
            if (arg0 <= 123) {
                return true;
            }
            if (class375.field5452 == 2) {
                if (class165.field2230 == null) {
                    class165.field2230 = class392.method2513(class129.field1785, class159.field2146, class57.field782);
                    if (class165.field2230 == null) {
                        return false;
                    }
                }
                if (class228.field3004 == null) {
                    class228.field3004 = new class397(class364.field5255, class388.field5603);
                }
                if (class321.field4733.method491(class228.field3004, class165.field2230, 22050, (byte) 127, class23.field306)) {
                    class321.field4733.method472((byte) 20);
                    class321.field4733.method493(class159.field2147, -39);
                    class321.field4733.method480(-18, class178.field2358, class165.field2230);
                    class165.field2230 = null;
                    class228.field3004 = null;
                    class129.field1785 = null;
                    class375.field5452 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class321.field4733.method507(-97);
            class228.field3004 = null;
            class165.field2230 = null;
            class375.field5452 = 0;
            class129.field1785 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII)I")
    public static final int method1217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2768++;
        if (class12.field205 == null) {
            return 0;
        }
        int var6 = 7 % ((77 - arg2) / 47);
        if (arg4 < 3) {
            int var7 = arg0 >> 7;
            int var8 = arg5 >> 7;
            if (arg1 < 0 || arg3 < 0 || arg1 > class192.field2574 - 1 || class364.field5262 - 1 < arg3) {
                return 0;
            }
            if (var7 < 1 || var8 < 1 || (class192.field2574 - 1) < var7 || (class364.field5262 - 1) < var8) {
                return 0;
            }
            boolean var9 = (class103.field1430[1][arg0 >> 7][arg5 >> 7] & 0x2) != 0;
            if ((arg0 & 0x7F) == 0) {
                boolean var10 = (class103.field1430[1][var7 - 1][arg5 >> 7] & 0x2) != 0;
                boolean var11 = (class103.field1430[1][var7][arg5 >> 7] & 0x2) != 0;
                if (var10 != var11) {
                    var9 = (class103.field1430[1][arg1][arg3] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x7F) == 0) {
                boolean var12 = (class103.field1430[1][arg0 >> 7][var8 - 1] & 0x2) != 0;
                boolean var13 = (class103.field1430[1][arg0 >> 7][var8] & 0x2) != 0;
                if (var13 != var12) {
                    var9 = (class103.field1430[1][arg1][arg3] & 0x2) != 0;
                }
            }
            if (var9) {
                arg4++;
            }
        }
        return class12.field205[arg4].method745(arg0, arg5);
    }
}
