import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class175 extends class114 {

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Z")
    public volatile boolean field2342 = true;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Lni;")
    public static class367 field2346;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Lfg;")
    public static class84 field2347;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Lgw;")
    public static class117 field2345;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lih;")
    public static class502 field2340;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lju;")
    public static class82 field2338;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Z")
    public boolean field2339;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Z")
    public boolean field2344;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[I")
    public static int[] field2343;

    static {
        new class446("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        new class446("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field2346 = new class367(2, 6);
        field2347 = new class84(0, 2, 2, 1);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)V", line = 3)
    public static final void method1177(byte arg0, int arg1) {
        class390.field5956 = -1;
        field2337++;
        class439.field6616 = arg1;
        class150.field1970 = 100;
        class84.field1223 = 3;
        if (arg0 <= 30) {
            field2346 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBIZ)V", line = 21)
    public static final void method1178(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field2341++;
        if (!arg4 && class492.field7259 == arg3 && class276.field3936 == arg0 && class367.field5618 == class253.field3515 || class203.field2716.method15(class378.field5771, 0)) {
            return;
        }
        class276.field3936 = arg0;
        class492.field7259 = arg3;
        class253.field3515 = class367.field5618;
        if (class203.field2716.method15(class378.field5771, 0)) {
            class253.field3515 = 0;
        }
        class134.method908(arg1, 2);
        class536.method3166(class86.field1253.method2705((byte) 69, class257.field3556), true, class94.field1380, arg2 + 82);
        int var5 = class331.field5162;
        class331.field5162 = (class492.field7259 - (class398.field6071 >> 4)) * 8;
        int var6 = class328.field5099;
        class328.field5099 = (class276.field3936 - (class528.field7734 >> 4)) * 8;
        class365.field5599 = class12.method122(class492.field7259 * 8, class276.field3936 * 8);
        class401.field6112 = null;
        int var7 = class331.field5162 - var5;
        if (arg2 != -80) {
            field2347 = null;
        }
        int var8 = class328.field5099 - var6;
        if (arg1 == 10) {
            for (int var17 = 0; var17 < class515.field7566; var17++) {
                class24 var30 = class480.field7090[var17];
                if (var30 != null) {
                    class17 var31 = var30.field348;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field3917[var32] -= var7;
                        var31.field3915[var32] -= var8;
                    }
                    var31.field1862 -= var8 * 128;
                    var31.field1867 -= var7 * 128;
                }
            }
        } else {
            class333.field5187 = 0;
            boolean var9 = false;
            int var10 = class398.field6071 * 128 - 128;
            int var11 = (class528.field7734 - 1) * 128;
            for (int var12 = 0; var12 < class515.field7566; var12++) {
                class24 var13 = class480.field7090[var12];
                if (var13 != null) {
                    class17 var14 = var13.field348;
                    var14.field1867 -= var7 * 128;
                    var14.field1862 -= var8 * 128;
                    if (var14.field1867 >= 0 && var10 >= var14.field1867 && var14.field1862 >= 0 && var14.field1862 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field3917[var16] -= var7;
                            var14.field3915[var16] -= var8;
                            if (var14.field3917[var16] < 0 || class398.field6071 <= var14.field3917[var16] || var14.field3915[var16] < 0 || var14.field3915[var16] >= class528.field7734) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class224.field3114[class333.field5187++] = var14.field3882;
                        } else {
                            var14.method167(8046, null);
                            var9 = true;
                            var13.method25(-13489);
                        }
                    } else {
                        var14.method167(8046, null);
                        var9 = true;
                        var13.method25(arg2 ^ 0x34FF);
                    }
                }
            }
            if (var9) {
                class515.field7566 = class406.field6158.method1749(0);
                class406.field6158.method1741(0, class480.field7090);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class96 var28 = class241.field3398[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3917[var29] -= var7;
                    var28.field3915[var29] -= var8;
                }
                var28.field1862 -= var8 * 128;
                var28.field1867 -= var7 * 128;
            }
        }
        class519[] var19 = class361.field5531;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class519 var27 = var19[var20];
            if (var27 != null) {
                var27.field7627 -= var7 * 128;
                var27.field7634 -= var8 * 128;
            }
        }
        for (class119 var21 = (class119) class460.field6887.method445(33); var21 != null; var21 = (class119) class460.field6887.method451(false)) {
            var21.field1638 -= var7;
            var21.field1640 -= var8;
            if (class405.field6149 != 4 && (var21.field1638 < 0 || var21.field1640 < 0 || class398.field6071 <= var21.field1638 || class528.field7734 <= var21.field1640)) {
                var21.method25(-13489);
            }
        }
        if (class405.field6149 != 4) {
            for (class247 var22 = (class247) class392.field6005.method1743(false); var22 != null; var22 = (class247) class392.field6005.method1742(-93)) {
                int var23 = (int) (var22.field35 & 0x3FFFL);
                int var24 = var23 - class331.field5162;
                int var25 = (int) (var22.field35 >> 14 & 0x3FFFL);
                int var26 = var25 - class328.field5099;
                if (var24 < 0 || var26 < 0 || var24 >= class398.field6071 || class528.field7734 <= var26) {
                    var22.method25(-13489);
                }
            }
        }
        if (class75.field1103 != 0) {
            class309.field4501 -= var8;
            class75.field1103 -= var7;
        }
        class259.method1671(arg2 ^ 0xFFFFFF82);
        if (arg1 != 10) {
            class24.field355 -= var8;
            class360.field5524 -= var7;
            class486.field7194 -= var7;
            class140.field1869 -= var8 * 128;
            class503.field7423 -= var8;
            class199.field2646 -= var7 * 128;
            if (Math.abs(var7) > class398.field6071 || Math.abs(var8) > class528.field7734) {
                class173.method1171((byte) -32);
            }
        } else if (class340.field5269 == 4) {
            class21.field320 -= var8 * 128;
            class312.field4571 -= var8 * 128;
            class366.field5609 -= var7 * 128;
            class62.field883 -= var7 * 128;
        } else {
            class340.field5269 = 1;
        }
        class513.method3064(arg2 + 80);
        class361.method2303((byte) -4);
        class422.field6436.method450((byte) 73);
        client.field2679.method450((byte) 73);
        class145.field1931.method3046(arg2 + 183);
        class478.method2845(-1);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V", line = 287)
    public static void method1179(byte arg0) {
        field2340 = null;
        field2345 = null;
        field2347 = null;
        int var1 = -116 / ((arg0 - 61) / 54);
        field2343 = null;
        field2346 = null;
        field2338 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)[B")
    public abstract byte[] method480(byte arg0);

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
    public abstract int method479(int arg0);
}
