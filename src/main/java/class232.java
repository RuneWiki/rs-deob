import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class232 extends class42 {

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "Lff;")
    public static class9 field3116 = new class9(17, 5);

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "Lvj;")
    public static class304 field3125 = new class304("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "Los;")
    public static class305 field3129 = new class305();

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!rq", name = "u", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "[I")
    public int[] field3122;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "[I")
    public int[] field3123;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "[I")
    public int[] field3124;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "[Ljk;")
    public class446[] field3114;

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "[Ljk;")
    public class446[] field3117;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "[[[B")
    public byte[][][] field3127;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method1443(int arg0) {
        field3116 = null;
        field3129 = null;
        field3125 = null;
        if (arg0 != 7873) {
            field3126 = -80;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)I")
    public static final int method1444(boolean arg0, int arg1) {
        if (!arg0) {
            return -100;
        }
        field3121++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)I")
    public static final int method1445(int arg0, String arg1, String arg2, boolean arg3) {
        field3118++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var5 > (var7 - var9)) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= var7 - var9) {
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
            var8 = class118.method810(-123, var22);
            var9 = class118.method810(-58, var24);
            char var26 = class71.method466(var22, arg0, 32);
            char var27 = class71.method466(var24, arg0, 92);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class83.method516(arg0, false, var28) - class83.method516(arg0, !arg3, var29);
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
                    return class83.method516(arg0, !arg3, var20) - class83.method516(arg0, false, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (!arg3) {
            method1443(-71);
        }
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class83.method516(arg0, !arg3, var14) - class83.method516(arg0, false, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
    public static final void method1446(int arg0) {
        field3119++;
        if (arg0 != 0) {
            field3126 = -84;
        }
        class302.field3987.method606(class154.field2241, class154.field2244.field7769 ? class381.field5206 + 256 << 0 : -1, 256);
    }

    static {
        new class304("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }
}
