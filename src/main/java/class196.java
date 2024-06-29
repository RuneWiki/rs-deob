import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class196 {

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field2884 = 0;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lqf;")
    public class145 field2878;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
    public int[] field2879;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[Ll;)V")
    public static final void method1293(int arg0, class127[] arg1) {
        class201.field2924 = arg1.length;
        field2880++;
        class184.field2715 = new class127[class201.field2924 + arg0];
        class179.field2652 = new int[class201.field2924 + 10];
        class442.method2594(arg1, 0, class184.field2715, 0, class201.field2924);
        for (int var2 = 0; var2 < class201.field2924; var2++) {
            class179.field2652[var2] = class184.field2715[var2].method467();
        }
        for (int var3 = class201.field2924; var3 < class184.field2715.length; var3++) {
            class179.field2652[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)I")
    public static final int method1294(String arg0, boolean arg1, int arg2, String arg3) {
        field2883++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
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
            var8 = class489.method2920(-340, var22);
            var9 = class489.method2920(-340, var24);
            char var26 = class393.method2361(false, arg2, var22);
            char var27 = class393.method2361(false, arg2, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class482.method2874((byte) 119, arg2, var28) - class482.method2874((byte) 68, arg2, var29);
                }
            }
        }
        if (!arg1) {
            field2884 = -104;
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - (var11 + 1);
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class482.method2874((byte) 103, arg2, var20) - class482.method2874((byte) 55, arg2, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class482.method2874((byte) 125, arg2, var14) - class482.method2874((byte) 53, arg2, var15);
            }
        }
        return 0;
    }
}
