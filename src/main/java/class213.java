import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class213 {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
    public static int[] field3309 = new int[13];

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3306 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lhi;")
    public static class131 field3304 = new class131(15, 0, 1, 0);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1308(int arg0) {
        field3308++;
        if (class123.field2028) {
            return;
        }
        class7.field81 = true;
        if (class463.field7116.field2961) {
            class376.field5483 = ((int) class376.field5483 + 47 & 0xFFFFFFF0);
        } else {
            class219.field3373 += (12.0F - class219.field3373) / 2.0F;
        }
        class123.field2028 = true;
        if (arg0 != 9201) {
            method1311(null, -36, null, -41);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method1309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            field3306 = null;
        }
        field3307++;
        if (arg3 >= arg2) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class69.field1212[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class69.field1212[var6][arg4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V", line = 85)
    public static void method1310(boolean arg0) {
        field3309 = null;
        if (!arg0) {
            field3304 = null;
        }
        field3306 = null;
        field3304 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I", line = 97)
    public static final int method1311(String arg0, int arg1, String arg2, int arg3) {
        field3305++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = (char) arg3;
        while (var6 - var8 < var4 || var7 - var9 < var5) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
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
            var8 = class253.method1521(var22, arg3 + 29661);
            var9 = class253.method1521(var24, arg3 + 29661);
            char var26 = class294.method1785(true, var22, arg1);
            char var27 = class294.method1785(true, var24, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class188.method1160(-77, var28, arg1) - class188.method1160(arg3 ^ 0xFFFFFF8D, var29, arg1);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
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
                    return class188.method1160(arg3 - 101, var20, arg1) - class188.method1160(arg3 - 84, var21, arg1);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class188.method1160(arg3 ^ 0xFFFFFF8A, var14, arg1) - class188.method1160(arg3 ^ 0xFFFFFFB2, var15, arg1);
            }
        }
        return 0;
    }
}
