import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class26 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[S")
    public static short[] field346;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Lv;", line = 8)
    public static final class80 method163(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3214; var4++) {
            class80 var5 = var3.field3199[var4];
            if ((var5.field1026 >> 29 & 0x3L) == 2L && var5.field1015 == arg1 && var5.field1027 == arg2) {
                class149.method1002(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIIII)V", line = 40)
    public static final void method164(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class272.field4273 <= arg1 && arg1 <= class248.field3759) {
            int var5 = class140.method930(24918, arg4, class56.field678, class109.field1494);
            int var6 = class140.method930(24918, arg3, class56.field678, class109.field1494);
            class235.method1661((byte) 41, arg2, var5, arg1, var6);
        }
        field345++;
        if (arg0 > -32) {
            field346 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 57)
    public static void method165(int arg0) {
        field346 = null;
        if (arg0 != -23718) {
            field346 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I", line = 70)
    public static final int method166(int arg0, int arg1, String arg2, String arg3) {
        int var4 = 0;
        int var5 = arg3.length();
        int var6 = 0;
        field344++;
        int var7 = arg2.length();
        char var8 = 0;
        char var9 = (char) arg1;
        while ((var4 - var8) < var5 || var6 - var9 < var7) {
            if (var4 - var8 >= var5) {
                return -1;
            }
            if (var7 <= var6 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var4++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var6++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class305.method2136(var22, false);
            var9 = class305.method2136(var24, false);
            char var26 = class93.method561((byte) 8, arg0, var22);
            char var27 = class93.method561((byte) 8, arg0, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class141.method936(var28, 120, arg0) - class141.method936(var29, arg1 + 120, arg0);
                }
            }
        }
        int var10 = Math.min(var5, var7);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg0 == 2) {
                var13 = var5 - var11 - 1;
                var12 = var7 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class141.method936(var16, arg1 + 120, arg0) - class141.method936(var17, 115, arg0);
                }
            }
        }
        int var18 = var5 - var7;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg3.charAt(var19);
            char var21 = arg2.charAt(var19);
            if (var20 != var21) {
                return class141.method936(var20, -69, arg0) - class141.method936(var21, 124, arg0);
            }
        }
        return 0;
    }
}
