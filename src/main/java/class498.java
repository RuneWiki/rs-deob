import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class498 extends class448 {

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "[S")
    public static short[] field7331 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public int field7330;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public int field7333;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public int field7334;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "Lco;")
    public class76 field7328;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "[Lnh;")
    public class525[] field7332;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method2936(int arg0, String arg1, String arg2, int arg3) {
        field7329++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || (var7 - var9) < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= var7 - var9) {
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
            var8 = class171.method1061(var22, (byte) 72);
            var9 = class171.method1061(var24, (byte) 67);
            char var26 = class164.method1018(var22, arg0, -16711936);
            char var27 = class164.method1018(var24, arg0, -16711936);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class180.method1094(30744, var28, arg0) - class180.method1094(30744, var29, arg0);
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
                    return class180.method1094(30744, var20, arg0) - class180.method1094(30744, var21, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class180.method1094(30744, var14, arg0) - class180.method1094(30744, var15, arg0);
            }
        }
        if (arg3 != -5123) {
            method2940(26);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
    public static final void method2937(int arg0, int arg1) {
        if (arg1 != -8525) {
            field7331 = null;
        }
        field7326++;
        class163 var2 = class271.method1546(arg0, 2, true);
        var2.method1010(1504);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
    public static final void method2938(int arg0) {
        class370.field5198 = 0;
        field7325++;
        if (arg0 <= -103) {
            class260.field3585.method3076((byte) -89);
            class9.field86 = false;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIBLqa;)Z")
    public final boolean method2939(int arg0, int arg1, byte arg2, class162 arg3) {
        field7327++;
        int var5 = 78 / ((59 - arg2) / 44);
        if (this.field7332 != null) {
            for (int var6 = 0; var6 < this.field7332.length; var6++) {
                if (this.field7332[var6].method3079(arg1, arg0) && this.field7328.method403(arg3, arg1, 24130, arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
    public static void method2940(int arg0) {
        int var1 = 46 % ((70 - arg0) / 51);
        field7331 = null;
    }
}
