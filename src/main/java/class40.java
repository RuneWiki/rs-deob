import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class40 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field588 = -1;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
    public static int[] field587;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I", line = 3)
    public static final int method250(String arg0, int arg1, int arg2, String arg3) {
        if (arg2 < 44) {
            field588 = -40;
        }
        field589++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var5 > (var7 - var9)) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
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
            var8 = class256.method1602((byte) -120, var22);
            var9 = class256.method1602((byte) -120, var24);
            char var26 = class503.method3001(arg1, -13066, var22);
            char var27 = class503.method3001(arg1, -13066, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class501.method2991(var28, true, arg1) - class501.method2991(var29, true, arg1);
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
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class501.method2991(var20, true, arg1) - class501.method2991(var21, true, arg1);
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
                return class501.method2991(var14, true, arg1) - class501.method2991(var15, true, arg1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 124)
    public static void method251(byte arg0) {
        if (arg0 == 105) {
            field587 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 139)
    public static final void method252(int arg0) {
        field590++;
        if (arg0 != -16) {
            method251((byte) -40);
        }
        if (class418.field5561) {
            return;
        }
        if (class421.field5647.field7707) {
            class163.field2110 = ((int) class163.field2110 + 47 & 0xFFFFFFF0);
        } else {
            class183.field2409 += (12.0F - class183.field2409) / 2.0F;
        }
        class418.field5561 = true;
        class267.field3387 = true;
    }
}
