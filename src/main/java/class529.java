import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class529 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lst;")
    public static class335 field7335 = new class335(74, -1);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "[[B")
    public static byte[][] field7336 = new byte[50][];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lht;")
    public static class395[] field7337;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 6)
    public static void method3142(int arg0) {
        field7337 = null;
        if (arg0 == 0) {
            field7335 = null;
            field7336 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method3143(int arg0, int arg1, int arg2) {
        field7334++;
        if (arg1 >= -30) {
            method3142(-16);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILrea;I)V", line = 32)
    public static final void method3144(byte arg0, int arg1, class121 arg2, int arg3) {
        class601.field8136[arg3][arg1] = arg2;
        field7332++;
        if (arg0 != 61) {
            method3144((byte) -13, 98, null, 115);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 43)
    public static final int method3145(int arg0, String arg1, String arg2, int arg3) {
        field7333++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var5 > var7 - var9) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
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
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class679.method3818(var22, -115);
            var9 = class679.method3818(var24, arg3 - 124);
            char var26 = class390.method2449(109, arg0, var22);
            char var27 = class390.method2449(104, arg0, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class618.method3492(25396, arg0, var28) - class618.method3492(25396, arg0, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
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
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class618.method3492(25396, arg0, var20) - class618.method3492(25396, arg0, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (~var12 != arg3) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class618.method3492(25396, arg0, var14) - class618.method3492(arg3 + 25397, arg0, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILuv;)I", line = 164)
    public static final int method3146(byte arg0, int arg1, class755 arg2) {
        field7330++;
        if (arg0 > -47) {
            field7336 = null;
        }
        if (!client.method2738(arg2).method1840(arg1, (byte) 69) && arg2.field10502 == null) {
            return -1;
        } else if (arg2.field10511 == null || arg2.field10511.length <= arg1) {
            return -1;
        } else {
            return arg2.field10511[arg1];
        }
    }
}
