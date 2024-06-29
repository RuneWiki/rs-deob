import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class163 {

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "[[I")
    public static int[][] field1896 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field1899 = -50;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
    public static int[] field1901;

    static {
        new class72("Use", "Benutzen", "Utiliser", "Usar");
        new class72("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 7)
    public static void method1035(int arg0) {
        field1896 = null;
        field1901 = null;
        if (arg0 <= 45) {
            method1035(3);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([Ljava/lang/Object;II[IZ)V", line = 24)
    public static final void method1036(Object[] arg0, int arg1, int arg2, int[] arg3, boolean arg4) {
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if ((var9 & 0x1) + var7 > arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method1036(arg0, arg1, var6 - 1, arg3, true);
            method1036(arg0, var6 + 1, arg2, arg3, arg4);
        }
        if (arg4) {
            field1897++;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)I", line = 87)
    public static final int method1037(int arg0, String arg1, String arg2, byte arg3) {
        field1900++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        if (arg3 != 92) {
            return 25;
        }
        while ((var6 - var8) < var4 || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
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
            var8 = class424.method2598(-114, var22);
            var9 = class424.method2598(54, var24);
            char var26 = class65.method371(65, arg0, var22);
            char var27 = class65.method371(121, arg0, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class373.method2337((byte) -124, var28, arg0) - class373.method2337((byte) -41, var29, arg0);
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
                    return class373.method2337((byte) -24, var20, arg0) - class373.method2337((byte) -49, var21, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class373.method2337((byte) -38, var14, arg0) - class373.method2337((byte) -94, var15, arg0);
            }
        }
        return 0;
    }
}
