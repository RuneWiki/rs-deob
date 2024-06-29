import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class237 {

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "Lco;")
    private class210 field3277 = new class210(64);

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "Lco;")
    public class210 field3285 = new class210(64);

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Lg;")
    private class470 field3281;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Lg;")
    public class470 field3278;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "Lec;")
    public static class40 field3276 = new class40("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "[B")
    public static byte[] field3282 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "[I")
    public static int[] field3284 = new int[8];

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "B")
    public static byte field3272;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
    public final void method1303(int arg0, int arg1, int arg2) {
        this.field3277 = new class210(arg0);
        field3274++;
        this.field3285 = new class210(arg1);
        if (arg2 != 64) {
            this.method1310((byte) -105);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method1304(int arg0) {
        int var1 = -114 % ((33 - arg0) / 56);
        field3276 = null;
        field3282 = null;
        field3284 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)Z")
    public static final boolean method1305(boolean arg0) {
        for (int var1 = class232.field3221; var1 < class346.field4937; var1++) {
            class263[][] var2 = class293.field4356[var1];
            for (int var3 = -class218.field3071; var3 <= 0; var3++) {
                int var4 = class352.field5065 + var3;
                int var5 = class352.field5065 - var3;
                if (var4 >= class63.field785 || var5 < class216.field2980) {
                    for (int var6 = -class218.field3071; var6 <= 0; var6++) {
                        int var7 = class25.field345 + var6;
                        int var8 = class25.field345 - var6;
                        if (var4 >= class63.field785) {
                            if (var7 >= class360.field5183) {
                                class263 var9 = var2[var4][var7];
                                if (var9 != null && var9.field3785) {
                                    class183.field2351 = arg0;
                                    class96.field1187.method714(var9, 119);
                                    class96.field1187.method710(100);
                                }
                            }
                            if (var8 < class257.field3718) {
                                class263 var10 = var2[var4][var8];
                                if (var10 != null && var10.field3785) {
                                    class183.field2351 = arg0;
                                    class96.field1187.method714(var10, 85);
                                    class96.field1187.method710(100);
                                }
                            }
                        }
                        if (var5 < class216.field2980) {
                            if (var7 >= class360.field5183) {
                                class263 var11 = var2[var5][var7];
                                if (var11 != null && var11.field3785) {
                                    class183.field2351 = arg0;
                                    class96.field1187.method714(var11, 104);
                                    class96.field1187.method710(100);
                                }
                            }
                            if (var8 < class257.field3718) {
                                class263 var12 = var2[var5][var8];
                                if (var12 != null && var12.field3785) {
                                    class183.field2351 = arg0;
                                    class96.field1187.method714(var12, 104);
                                    class96.field1187.method710(100);
                                }
                            }
                        }
                        if (class382.field5428 == 0) {
                            if (class183.field2363) {
                                class96.field1187.method706(-8173, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILab;BI)V")
    public static final void method1306(int arg0, class256 arg1, byte arg2, int arg3) {
        if (arg2 != 24) {
            field3276 = null;
        }
        class432.field6249 = arg0;
        class398.field5656 = arg3;
        class182.field2341 = arg1;
        field3273++;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
    public final void method1307(int arg0) {
        field3279++;
        int var2 = -46 % ((-arg0 - 59) / 55);
        class210 var3 = this.field3277;
        synchronized (this.field3277) {
            this.field3277.method1165((byte) 118);
        }
        class210 var4 = this.field3285;
        synchronized (this.field3285) {
            this.field3285.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)V")
    public final void method1308(int arg0, byte arg1) {
        class210 var3 = this.field3277;
        synchronized (this.field3277) {
            if (arg1 <= 3) {
                field3282 = null;
            }
            this.field3277.method1166(arg0, (byte) -52);
        }
        field3275++;
        class210 var4 = this.field3285;
        synchronized (this.field3285) {
            this.field3285.method1166(arg0, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)V")
    public static final void method1309(int arg0, int arg1) {
        field3269++;
        if (arg0 == -5616) {
            class89 var2 = class146.method695(7, arg1, (byte) -86);
            var2.method448(13);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
    public final void method1310(byte arg0) {
        if (arg0 != 57) {
            this.method1303(-46, -34, -17);
        }
        field3283++;
        class210 var2 = this.field3277;
        synchronized (this.field3277) {
            this.field3277.method1169(1076);
        }
        class210 var3 = this.field3285;
        synchronized (this.field3285) {
            this.field3285.method1169(1076);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)Loo;")
    public final class417 method1311(byte arg0, int arg1) {
        field3271++;
        class210 var3 = this.field3277;
        class417 var4;
        synchronized (this.field3277) {
            var4 = (class417) this.field3277.method1163((byte) -71, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 0) {
            this.field3285 = null;
        }
        byte[] var5 = this.field3281.method2768(arg0 ^ 0xFFFFB008, arg1, 34);
        class417 var6 = new class417();
        var6.field6004 = this;
        if (var5 != null) {
            var6.method2480(true, new class179(var5));
        }
        class210 var7 = this.field3277;
        synchronized (this.field3277) {
            this.field3277.method1172((long) arg1, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
    public static final void method1312(int arg0) {
        class93.method462(class231.field3205, (byte) 39, (long) class204.field2796);
        field3270++;
        if (~class57.field725 != arg0) {
            class258.method1586(class57.field725, -24134);
        }
        for (int var1 = 0; var1 < class358.field5172; var1++) {
            if (class61.field764[var1]) {
                class217.field2994[var1] = true;
            }
            class412.field5866[var1] = class61.field764[var1];
            class61.field764[var1] = false;
        }
        class76.field921 = class204.field2796;
        if (class231.field3205.method1359()) {
            class231.field3208 = true;
        }
        if (class57.field725 != -1) {
            class358.field5172 = 0;
            class19.method125(arg0 - 32);
        }
        class231.field3205.method1352();
        class58.method302(class84.field1019, arg0 - 15794);
        class263.field3805 = 0;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lci;ILg;Lg;)V")
    public class237(class421 arg0, int arg1, class470 arg2, class470 arg3) {
        this.field3281 = arg2;
        this.field3278 = arg3;
        this.field3281.method2755(-123, 34);
    }

    static {
        new class40("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }
}
