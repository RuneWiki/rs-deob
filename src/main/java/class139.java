import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class139 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[I")
    public static int[] field2555 = new int[1000];

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "[I")
    public static int[] field2560 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
    public static int[] field2561 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lti;")
    public static class244 field2557;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 5)
    public static final int method1135(int arg0, String arg1, String arg2, int arg3) {
        field2562++;
        int var4 = 0;
        int var5 = 0;
        char var6 = 0;
        int var7 = arg1.length();
        char var8 = 0;
        if (arg3 != 21179) {
            field2555 = (int[]) null;
        }
        int var9 = arg2.length();
        while (var4 - var6 < var7 || var9 > var5 - var8) {
            if ((var4 - var6) >= var7) {
                return -1;
            }
            if (var5 - var8 >= var9) {
                return 1;
            }
            char var22;
            if (var6 == '\u0000') {
                var22 = arg1.charAt(var4++);
            } else {
                var22 = var6;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg2.charAt(var5++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var6 = class211.method1568(var22, false);
            var8 = class211.method1568(var24, false);
            char var26 = class78.method710(true, arg0, var22);
            char var27 = class78.method710(true, arg0, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class132.method1082(64, arg0, var28) - class132.method1082(arg3 - 21067, arg0, var29);
                }
            }
        }
        int var10 = Math.min(var7, var9);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg0 == 2) {
                var12 = var7 - var11 - 1;
                var13 = var9 - var11 - 1;
            } else {
                var13 = var11;
                var12 = var11;
            }
            char var14 = arg1.charAt(var12);
            char var15 = arg2.charAt(var13);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class132.method1082(72, arg0, var16) - class132.method1082(123, arg0, var17);
                }
            }
        }
        int var18 = var7 - var9;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg1.charAt(var19);
            char var21 = arg2.charAt(var19);
            if (var20 != var21) {
                return class132.method1082(arg3 ^ 0x52D5, arg0, var20) - class132.method1082(arg3 - 21140, arg0, var21);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 128)
    public static void method1136(int arg0) {
        field2555 = null;
        field2560 = null;
        field2557 = null;
        field2561 = null;
        int var1 = 108 % ((arg0 + 85) / 33);
    }
}
