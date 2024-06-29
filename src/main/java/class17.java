import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 {

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "B")
    public byte field199;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "Lbu;")
    public class17 field185;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "[I")
    public static int[] field200;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "Lfs;")
    public static class387 field196;

    static {
        new class331("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        new class331("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field200 = new int[1];
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 8)
    public static void method129(byte arg0) {
        field196 = null;
        field200 = null;
        if (arg0 != 7) {
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIII)Lbu;", line = 20)
    public final class17 method130(int arg0, int arg1, int arg2, int arg3) {
        field187++;
        int var5 = -17 / ((arg3 + 4) / 54);
        return new class17(this.field198, arg0, arg1, arg2, this.field199);
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)Ljv;", line = 32)
    public final class56 method131(byte arg0) {
        if (arg0 == 85) {
            field195++;
            return class417.method2546(90, this.field198);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lya;Lfs;ILfs;)V", line = 55)
    public static final void method132(class38 arg0, class387 arg1, int arg2, class387 arg3) {
        class59.field685 = class88.method775(6, 0, class65.field814, arg3);
        field179++;
        int var4 = 31 % ((-arg2 - 13) / 62);
        class122.field1792 = arg0.method343(class59.field685, class218.method1497(arg1, class65.field814, 0), true);
        class307.field4366 = class88.method775(6, 0, class398.field5888, arg3);
        class396.field5802 = arg0.method343(class307.field4366, class218.method1497(arg1, class398.field5888, 0), true);
        class387.field5731 = class88.method775(6, 0, class486.field7139, arg3);
        class466.field6840 = arg0.method343(class387.field5731, class218.method1497(arg1, class486.field7139, 0), true);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILuu;II)V", line = 73)
    public static final void method133(int arg0, class188 arg1, int arg2, int arg3) {
        class351.field4868 = arg3;
        class457.field6711 = arg1;
        class188.field2768 = arg2;
        int var4 = -49 / ((-arg0 - 37) / 60);
        field188++;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 88)
    public static final int method134(int arg0, String arg1, String arg2, int arg3) {
        field193++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var5 > (var7 - var9)) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var23;
            if (var8 == '\u0000') {
                var23 = arg2.charAt(var6++);
            } else {
                var23 = var8;
                boolean var24 = false;
            }
            char var25;
            if (var9 == '\u0000') {
                var25 = arg1.charAt(var7++);
            } else {
                var25 = var9;
                boolean var26 = false;
            }
            var8 = class297.method1871(var23, 520);
            var9 = class297.method1871(var25, 520);
            char var27 = class294.method1862(-73, var23, arg3);
            char var28 = class294.method1862(-120, var25, arg3);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class520.method3092((byte) -78, arg3, var29) - class520.method3092((byte) -78, arg3, var30);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var17;
            int var18;
            if (arg3 == 2) {
                var17 = var5 - var11 - 1;
                var18 = var4 - var11 - 1;
            } else {
                var17 = var11;
                var18 = var11;
            }
            char var19 = arg2.charAt(var18);
            char var20 = arg1.charAt(var17);
            if (var19 != var20 && Character.toUpperCase(var19) != Character.toUpperCase(var20)) {
                char var21 = Character.toLowerCase(var19);
                char var22 = Character.toLowerCase(var20);
                if (var21 != var22) {
                    return class520.method3092((byte) -78, arg3, var21) - class520.method3092((byte) -78, arg3, var22);
                }
            }
        }
        int var12 = var4 - var5;
        int var13 = 102 % ((arg0 - 60) / 33);
        if (var12 != 0) {
            return var12;
        }
        for (int var14 = 0; var14 < var10; var14++) {
            char var15 = arg2.charAt(var14);
            char var16 = arg1.charAt(var14);
            if (var15 != var16) {
                return class520.method3092((byte) -78, arg3, var15) - class520.method3092((byte) -78, arg3, var16);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIB)V", line = 225)
    public class17(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field199 = arg4;
        this.field197 = arg2;
        this.field189 = arg1;
        this.field198 = arg0;
        this.field180 = arg3;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lbu;I)V", line = 236)
    public class17(class17 arg0, int arg1) {
        this.field185 = arg0;
        this.field198 = this.field185.field198;
        this.field199 = this.field185.field199;
        this.field180 = this.field185.field180 + arg1;
        this.field197 = this.field185.field197 + arg1;
        this.field189 = this.field185.field189 + arg1;
    }
}
