import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class168 extends class97 {

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
    public int[] field2400;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "[[I")
    public int[][] field2414;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "[I")
    public int[] field2410;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "[Z")
    public boolean[] field2407;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field2415 = 0;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Ltm;")
    public static class354 field2405 = new class354();

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Liq;")
    public static class134 field2412;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field2417;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "[Lks;")
    public static class19[] field2409;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
    public static final void method1017(int arg0, int arg1) {
        field2413++;
        class32 var2 = class136.method854(arg1, (byte) 104, arg0);
        var2.method192(-17451);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
    public static final void method1018(int arg0, int arg1, int arg2) {
        field2403++;
        class451 var3 = class247.field3702[arg0][arg2];
        if (arg1 != 0) {
            field2409 = null;
        }
        if (var3 != null) {
            class382.field5580 = var3.field6649;
            class427.field6292 = var3.field6639;
            class353.field5220 = var3.field6636;
        }
        class153.method945(true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 8) {
            method1018(75, -49, -26);
        }
        field2404++;
        if (arg5 < 0 || arg3 < 0 || class115.field1522 - 1 <= arg5 || (class198.field3004 - 1) <= arg3) {
            return;
        }
        if (class277.field4216 == null) {
            return;
        }
        if (arg2 == 0) {
            class18 var8 = (class18) class37.method211(arg4, arg5, arg3);
            class18 var9 = (class18) class115.method694(arg4, arg5, arg3);
            if (var8 != null && arg7 != 2) {
                if ((var8 instanceof class103)) {
                    ((class103) var8).field1380.method1625(arg1, (byte) 94);
                } else {
                    class113.method689(arg2, arg3, arg1, arg7, arg4, arg5, arg0, var8.method7(true), arg6 ^ 0xFFFFFF82);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class103)) {
                    class113.method689(arg2, arg3, arg1, arg7, arg4, arg5, arg0, var9.method7(true), 76);
                    return;
                }
                ((class103) var9).field1380.method1625(arg1, (byte) 117);
                return;
            }
            return;
        }
        if (arg2 == 1) {
            class18 var10 = (class18) class213.method1245(arg4, arg5, arg3);
            if (var10 != null) {
                if (var10 instanceof class1) {
                    ((class1) var10).field2.method1625(arg1, (byte) -89);
                    return;
                }
                int var11 = var10.method7(true);
                if (arg7 != 4 && arg7 != 5) {
                    if (arg7 == 6) {
                        class113.method689(arg2, arg3, arg1, 4, arg4, arg5, arg0 + 4, var11, arg6 ^ 0xFFFFFF80);
                    } else if (arg7 == 7) {
                        class113.method689(arg2, arg3, arg1, 4, arg4, arg5, (arg0 + 2 & 0x3) + 4, var11, 109);
                        return;
                    } else if (arg7 == 8) {
                        class113.method689(arg2, arg3, arg1, 4, arg4, arg5, arg0 + 4, var11, 25);
                        class113.method689(arg2, arg3, arg1, 4, arg4, arg5, (arg0 + 2 & 0x3) + 4, var11, -114);
                        return;
                    }
                    return;
                }
                class113.method689(arg2, arg3, arg1, 4, arg4, arg5, arg0, var11, 22);
                return;
            }
            return;
        }
        if (arg2 == 2) {
            class18 var12 = (class18) class51.method293(arg4, arg5, arg3, field2417 == null ? (field2417 = method1025("rc")) : field2417);
            if (var12 != null) {
                if (arg7 == 11) {
                    arg7 = 10;
                }
                if (var12 instanceof class163) {
                    ((class163) var12).field2278.method1625(arg1, (byte) 16);
                    return;
                }
                class113.method689(arg2, arg3, arg1, arg7, arg4, arg5, arg0, var12.method7(true), -82);
                return;
            }
            return;
        }
        if (arg2 != 3) {
            return;
        }
        class18 var13 = (class18) class386.method2385(arg4, arg5, arg3);
        if (var13 == null) {
            return;
        }
        if (!(var13 instanceof class39)) {
            class113.method689(arg2, arg3, arg1, arg7, arg4, arg5, arg0, var13.method7(true), arg6 ^ 0xFFFFFF92);
            return;
        }
        ((class39) var13).field482.method1625(arg1, (byte) 46);
        return;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lfh;")
    public static final class170 method1020(int arg0, byte arg1) {
        if (arg1 <= 68) {
            return null;
        }
        field2402++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class130.field1650[var2] == null || class130.field1650[var2][var3] == null) {
            boolean var4 = class345.method2100(-1, var2);
            if (!var4) {
                return null;
            }
        }
        return class130.field1650[var2][var3];
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public static void method1021(int arg0) {
        field2405 = null;
        field2409 = null;
        field2412 = null;
        if (arg0 != 10) {
            method1020(124, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI[B)I")
    public static final int method1022(byte arg0, int arg1, byte[] arg2) {
        field2399++;
        if (arg0 <= 125) {
            method1021(26);
        }
        return class188.method1144(0, (byte) -115, arg2, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public static final void method1023(int arg0) {
        class452.field6685 = -1;
        class97.field1337 = 0;
        if (arg0 == 4) {
            field2406++;
            class423.field6227 = -1;
            class8.field80 = -1;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I[B)V")
    public class168(int arg0, byte[] arg1) {
        this.field2408 = arg0;
        class385 var3 = new class385(arg1);
        this.field2411 = var3.method2343(255);
        this.field2400 = new int[this.field2411];
        this.field2414 = new int[this.field2411][];
        this.field2410 = new int[this.field2411];
        this.field2407 = new boolean[this.field2411];
        for (int var4 = 0; var4 < this.field2411; var4++) {
            this.field2410[var4] = var3.method2343(255);
        }
        for (int var5 = 0; var5 < this.field2411; var5++) {
            this.field2407[var5] = var3.method2343(255) == 1;
        }
        for (int var6 = 0; var6 < this.field2411; var6++) {
            this.field2400[var6] = var3.method2323(-8);
        }
        for (int var7 = 0; var7 < this.field2411; var7++) {
            this.field2414[var7] = new int[var3.method2343(255)];
        }
        for (int var8 = 0; var8 < this.field2411; var8++) {
            for (int var9 = 0; var9 < this.field2414[var8].length; var9++) {
                this.field2414[var8][var9] = var3.method2343(255);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
    public static final void method1024(int arg0) {
        field2401++;
        if (class6.field69 == -1) {
            return;
        }
        if (arg0 != -12) {
            method1024(-74);
        }
        int var1 = class74.field1004.method505((byte) -125);
        int var2 = class74.field1004.method501(127);
        if (class465.field6850 != null) {
            var1 = class465.field6850.method467(9);
            var2 = class465.field6850.method465((byte) -106);
        }
        class450.method2771(0, class6.field69, var1, class221.field3368, -1, class161.field2232, var2, 0, 0, 0);
        if (class288.field4381 != null) {
            class412.method2579(var1, var2, arg0 + 11);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1025(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        new class151("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }
}
