import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class163 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2555 = "flash3:";

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2554 = "Loaded wordpack";

    @OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
    public static int[] field2557 = new int[32];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)I")
    public static final int method1130(int arg0, String arg1, String arg2, boolean arg3) {
        field2558++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var5 > (var7 - var9)) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
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
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class386.method2447((byte) 75, var22);
            var9 = class386.method2447((byte) 75, var24);
            char var26 = class385.method2433((byte) -58, var22, arg0);
            char var27 = class385.method2433((byte) -58, var24, arg0);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class266.method1814(-14775, var28, arg0) - class266.method1814(-14775, var29, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class266.method1814(-14775, var20, arg0) - class266.method1814(-14775, var21, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        int var13 = 0;
        if (!arg3) {
            method1132(118);
        }
        while (var13 < var10) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class266.method1814(-14775, var14, arg0) - class266.method1814(-14775, var15, arg0);
            }
            var13++;
        }
        return 0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static final void method1131(boolean arg0) {
        field2553++;
        class382.field5768 = new class418(class125.field1923, "", class50.field617, 1002, 0L, 0, 0);
        if (!arg0) {
            method1132(59);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2557 = null;
        if (arg0 != 0) {
            method1130(-2, (String) null, (String) null, true);
        }
        field2554 = null;
        field2555 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method1133(boolean arg0, String arg1, byte arg2) {
        field2556++;
        if (arg1 == null) {
            return;
        }
        if (class418.field6190 >= 100) {
            class357.method2329(class158.field2521, 0);
            return;
        }
        String var3 = class428.method2652(arg1, false);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class418.field6190; var4++) {
            String var8 = class428.method2652(class269.field4317[var4], false);
            if (var8 != null && var8.equals(var3)) {
                class357.method2329(arg1 + class321.field5023, arg2 ^ 0xFFFFFFF9);
                return;
            }
            if (class285.field4576[var4] != null) {
                String var9 = class428.method2652(class285.field4576[var4], false);
                if (var9 != null && var9.equals(var3)) {
                    class357.method2329(arg1 + class321.field5023, 0);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class262.field4215; var5++) {
            String var6 = class428.method2652(class338.field5248[var5], false);
            if (var6 != null && var6.equals(var3)) {
                class357.method2329(class112.field1551 + arg1 + class272.field4378, arg2 + 7);
                return;
            }
            if (class70.field863[var5] != null) {
                String var7 = class428.method2652(class70.field863[var5], false);
                if (var7 != null && var7.equals(var3)) {
                    class357.method2329(class112.field1551 + arg1 + class272.field4378, 0);
                    return;
                }
            }
        }
        if (class428.method2652(class261.field4201.field3588, false).equals(var3)) {
            class357.method2329(class433.field6395, 0);
            return;
        }
        if (arg2 != -7) {
            field2554 = null;
        }
        class11.field139.method2224(134, (byte) 0);
        class392.field5885++;
        class11.field139.method1312(class317.method2110(true, arg1) + 1, -52);
        class11.field139.method1301(arg1, arg2 + 123);
        class11.field139.method1312(arg0 ? 1 : 0, -99);
    }
}
