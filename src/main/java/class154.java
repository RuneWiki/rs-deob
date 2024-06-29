import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class154 {

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Lig;")
    public static class15 field2078 = new class15();

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "Lct;")
    public static class104 field2076;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Lct;")
    public static class104 field2077;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1051(int arg0) {
        field2077 = null;
        if (arg0 == -208) {
            field2076 = null;
            field2078 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(CI)C")
    public static final char method1052(char arg0, int arg1) {
        field2075++;
        if (arg1 != -7931) {
            field2077 = null;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public static final void method1053(int arg0) {
        field2079++;
        if (arg0 != 210) {
            return;
        }
        class363 var1 = class283.field4166;
        synchronized (class283.field4166) {
            class283.field4166.method2313(104);
        }
        class363 var2 = class272.field4022;
        synchronized (class272.field4022) {
            class272.field4022.method2313(110);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)Z")
    public static final boolean method1054(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class200.field2827; var3++) {
            class96 var4 = class373.field5448[var3];
            if (var4.field1195 == 1) {
                int var5 = var4.field1184 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1185 * var5 >> 8) + var4.field1186;
                    int var7 = (var4.field1198 * var5 >> 8) + var4.field1182;
                    int var8 = (var4.field1191 * var5 >> 8) + var4.field1194;
                    int var9 = (var4.field1202 * var5 >> 8) + var4.field1189;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1195 == 2) {
                int var10 = arg0 - var4.field1184;
                if (var10 > 0) {
                    int var11 = (var4.field1185 * var10 >> 8) + var4.field1186;
                    int var12 = (var4.field1198 * var10 >> 8) + var4.field1182;
                    int var13 = (var4.field1191 * var10 >> 8) + var4.field1194;
                    int var14 = (var4.field1202 * var10 >> 8) + var4.field1189;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1195 == 3) {
                int var15 = var4.field1186 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1190 * var15 >> 8) + var4.field1184;
                    int var17 = (var4.field1183 * var15 >> 8) + var4.field1200;
                    int var18 = (var4.field1191 * var15 >> 8) + var4.field1194;
                    int var19 = (var4.field1202 * var15 >> 8) + var4.field1189;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1195 == 4) {
                int var20 = arg2 - var4.field1186;
                if (var20 > 0) {
                    int var21 = (var4.field1190 * var20 >> 8) + var4.field1184;
                    int var22 = (var4.field1183 * var20 >> 8) + var4.field1200;
                    int var23 = (var4.field1191 * var20 >> 8) + var4.field1194;
                    int var24 = (var4.field1202 * var20 >> 8) + var4.field1189;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1195 == 5) {
                int var25 = arg1 - var4.field1194;
                if (var25 > 0) {
                    int var26 = (var4.field1190 * var25 >> 8) + var4.field1184;
                    int var27 = (var4.field1183 * var25 >> 8) + var4.field1200;
                    int var28 = (var4.field1185 * var25 >> 8) + var4.field1186;
                    int var29 = (var4.field1198 * var25 >> 8) + var4.field1182;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static {
        Math.sqrt(8192.0D);
    }
}
