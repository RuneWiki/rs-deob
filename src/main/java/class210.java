import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class210 {

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "S")
    public static short field3252 = 32767;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "Lfba;")
    public static class27 field3251 = new class27(83, -1);

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Ltd;")
    public static class477 field3249;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lfb;")
    public static class702 field3250;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field3253;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I", line = 5)
    public static final int method1446(int arg0, String arg1, int arg2, String arg3) {
        field3248++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || (var7 - var9) < var5) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class531.method3205(-339, var22);
            var9 = class531.method3205(-339, var24);
            char var26 = class497.method3020(var22, (byte) 81, arg0);
            char var27 = class497.method3020(var24, (byte) 84, arg0);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class716.method4021(var28, arg0, 1) - class716.method4021(var29, arg0, 1);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        if (arg2 >= -3) {
            return 91;
        }
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class716.method4021(var20, arg0, 1) - class716.method4021(var21, arg0, 1);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class716.method4021(var14, arg0, 1) - class716.method4021(var15, arg0, 1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V", line = 134)
    public static void method1447(byte arg0) {
        field3249 = null;
        field3250 = null;
        field3251 = null;
        if (arg0 == -59) {
            field3253 = null;
        }
    }
}
