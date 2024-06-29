import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class204 extends class311 {

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Ljava/lang/String;")
    public String field2898;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "[I")
    public static int[] field2900 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!po", name = "y", descriptor = "Ltn;")
    public static class109 field2903;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "[[B")
    public static byte[][] field2902;

    static {
        new class368("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field2903 = new class109(8);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(II)Lwk;", line = 5)
    public static final class430 method1389(int arg0, int arg1) {
        field2899++;
        class430 var2 = (class430) class68.field967.method2529(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = -7 / ((-arg1 - 70) / 49);
        byte[] var4 = class200.field2870.method1926(0, arg0, 36);
        class430 var5 = new class430();
        var5.field6009 = arg0;
        if (var4 != null) {
            var5.method2649(new class366(var4), (byte) -105);
        }
        var5.method2647((byte) 112);
        class68.field967.method2527(50, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lij;Lij;I)V", line = 29)
    public static final void method1390(class316 arg0, class316 arg1, int arg2) {
        class200.field2870 = arg1;
        class160.field2273 = arg0;
        field2896++;
        class200.field2870.method1934((byte) 28, 36);
        if (arg2 != 24) {
            method1391((byte) 6);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)V", line = 45)
    public static void method1391(byte arg0) {
        field2900 = null;
        field2902 = null;
        if (arg0 < 15) {
            method1389(104, -16);
        }
        field2903 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lrg;B)Lwr;", line = 57)
    public static final class370 method1392(class366 arg0, byte arg1) {
        field2901++;
        int var2 = 45 % ((arg1 + 32) / 33);
        return new class370(arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2257((byte) 110), arg0.method2263((byte) 10), arg0.method2306((byte) 58));
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 78)
    public static final void method1393(String[] arg0, int arg1, short[] arg2) {
        class395.method2456(arg1 ^ 0xFFFFFFFD, arg2, 0, arg0, arg0.length + arg1);
        field2895++;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)[Lip;", line = 86)
    public static final class49[] method1394(int arg0) {
        if (class405.field5601 == null) {
            class49[] var1 = class130.method977(class122.field1839, -328264830);
            class49[] var2 = new class49[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class49 var8 = var1[var4];
                if ((var8.field623 <= 0 || var8.field623 >= 24) && var8.field620 >= 800 && var8.field626 >= 600 && (class409.field5703 >= 96 || class22.field284 != 0 || var8.field620 <= 1024 && var8.field626 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class49 var10 = var2[var9];
                        if (var8.field620 == var10.field620 && var8.field626 == var10.field626) {
                            if (var10.field623 < var8.field623) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class405.field5601 = new class49[var3];
            class79.method641(var2, 0, class405.field5601, 0, var3);
            int[] var5 = new int[class405.field5601.length];
            for (int var6 = 0; var6 < class405.field5601.length; var6++) {
                class49 var7 = class405.field5601[var6];
                var5[var6] = var7.field626 * var7.field620;
            }
            class156.method1137(class405.field5601, var5, (byte) 110);
        }
        field2897++;
        if (arg0 != 0) {
            field2900 = null;
        }
        return class405.field5601;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 175)
    public class204() {
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 177)
    public class204(String arg0, int arg1) {
        this.field2898 = arg0;
    }
}
