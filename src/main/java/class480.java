import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class480 extends class179 {

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    private int field7324;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "F")
    public float field7332;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    private int field7321;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public int field7333;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public int field7325;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public int field7327;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field7323 = 0;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lsk;")
    public static class423 field7318 = new class423("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "Lft;")
    public static class4 field7334 = new class4();

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "Loe;")
    public static class127 field7335;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "[Lig;")
    public static class154[] field7336;

    static {
        new class423("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field7335 = new class127(9, 2);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I", line = 4)
    public final int method2894(byte arg0) {
        field7329++;
        if (arg0 > -80) {
            method2898(18);
        }
        return this.field7321;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)I", line = 15)
    public final int method2895(int arg0) {
        field7315++;
        if (arg0 != 0) {
            this.method2897(-105);
        }
        return this.field7325;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBI)V", line = 29)
    public static final void method2896(int arg0, byte arg1, int arg2) {
        if (arg1 != -54) {
            return;
        }
        field7322++;
        class407 var3 = new class407(16);
        for (class163 var4 = (class163) class252.field3845.method2415((byte) -93); var4 != null; var4 = (class163) class252.field3845.method2416((byte) -120)) {
            var4.method1121(false);
            int var5 = (int) (var4.field2798 >> 28);
            int var6 = (int) (var4.field2798 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field2798 & 0x3FFFL) - arg0;
            if (var7 >= 0 && var6 >= 0 && var7 < class150.field2422 && class21.field272 > var6) {
                var3.method2413((long) (var7 | var5 << 28 | var6 << 14), -1, var4);
            }
        }
        class252.field3845 = var3;
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)F", line = 64)
    public final float method2897(int arg0) {
        if (arg0 != 0) {
            this.method2894((byte) 9);
        }
        field7317++;
        return this.field7332;
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V", line = 80)
    public static void method2898(int arg0) {
        field7318 = null;
        if (arg0 != 27842) {
            field7320 = 50;
        }
        field7335 = null;
        field7334 = null;
        field7336 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V", line = 94)
    public static final void method2899(int arg0, int arg1) {
        if (arg0 == 37) {
            class492.field7478 = 3.0F;
        } else if (arg0 == 50) {
            class492.field7478 = 4.0F;
        } else if (arg0 == 75) {
            class492.field7478 = 6.0F;
        } else if (arg0 == 100) {
            class492.field7478 = 8.0F;
        } else if (arg0 == 200) {
            class492.field7478 = 16.0F;
        }
        field7316++;
        if (arg1 == 75) {
            class226.field3471 = -1;
            class226.field3471 = -1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I", line = 127)
    public final int method2900(byte arg0) {
        if (arg0 != -31) {
            this.field7325 = 113;
        }
        field7326++;
        return this.field7333;
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)I", line = 140)
    public final int method2901(int arg0) {
        if (arg0 == -24962) {
            field7319++;
            return this.field7327;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)I", line = 161)
    public final int method2902(byte arg0) {
        field7328++;
        if (arg0 != -46) {
            this.field7327 = 74;
        }
        return this.field7324;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZZ)I", line = 175)
    public static final int method2903(int arg0, int arg1, boolean arg2, boolean arg3) {
        field7330++;
        class146 var4 = class478.method2889(arg1, (byte) 27, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field2359.length; var6++) {
                if (var4.field2367[var6] == arg0) {
                    var5 += var4.field2359[var6];
                }
            }
            if (arg2) {
                field7320 = 54;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V", line = 213)
    public static final void method2904(int arg0, int arg1, int arg2) {
        field7331++;
        class64 var3 = class230.method1387(arg1, (byte) 40, 12);
        int var4 = -86 / ((-arg0 - 65) / 39);
        var3.method441((byte) 58);
        var3.field1051 = arg2;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIIF)V", line = 225)
    public class480(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field7324 = arg4;
        this.field7332 = arg5;
        this.field7321 = arg3;
        this.field7333 = arg2;
        this.field7325 = arg0;
        this.field7327 = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZF)V")
    public abstract void method929(boolean arg0, float arg1);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
    public abstract void method930(int arg0, int arg1, int arg2, int arg3);
}
