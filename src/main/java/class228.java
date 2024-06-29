import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class228 {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public int field3222 = 128;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    private int field3220 = 0;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field3224 = -1;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Z")
    public boolean field3225 = true;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Z")
    public static boolean field3215 = false;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3232;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Ltm;")
    public static class112 field3229;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lfc;")
    public static class343 field3227;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLlk;I)V")
    private final void method1434(byte arg0, class425 arg1, int arg2) {
        int var4 = 56 % ((7 - arg0) / 54);
        field3219++;
        if (arg2 == 1) {
            this.field3220 = arg1.method2498(3);
            this.method1437(-122, this.field3220);
        } else if (arg2 == 2) {
            this.field3224 = arg1.method2508(true);
            if (this.field3224 == 65535) {
                this.field3224 = -1;
                return;
            }
        } else if (arg2 == 3) {
            this.field3222 = arg1.method2508(true);
        } else if (arg2 == 4) {
            this.field3225 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILms;IIIILvb;I)V")
    public static final void method1435(int arg0, int arg1, class363 arg2, int arg3, int arg4, int arg5, int arg6, class90 arg7, int arg8) {
        field3214++;
        int var9 = arg0 * arg0 + arg6 * arg6;
        if (var9 > arg5) {
            return;
        }
        if (arg1 != -28360) {
            method1435(-58, -19, (class363) null, 29, 68, 118, 122, (class90) null, 43);
        }
        int var10 = Math.min(arg2.field5101 / 2, arg2.field5200 / 2);
        if (var9 <= (var10 * var10)) {
            class232.method1455(-256, arg6, arg2, arg4, arg0, arg7, class376.field5318[arg8], arg3);
            return;
        }
        var10 -= 10;
        int var11;
        if (class375.field5312 == 4) {
            var11 = (int) class418.field5750 & 0x3FFF;
        } else {
            var11 = (int) class418.field5750 + class361.field5042 & 0x3FFF;
        }
        int var12 = class432.field5955[var11];
        int var13 = class432.field5957[var11];
        if (class375.field5312 != 4) {
            var12 = var12 * 256 / (class351.field4804 + 256);
            var13 = var13 * 256 / (class351.field4804 + 256);
        }
        int var14 = arg0 * var13 + arg6 * var12 >> 15;
        int var15 = arg6 * var13 - (arg0 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var10);
        int var19 = (int) ((double) var10 * Math.cos(var16));
        class154.field2225[arg8].method2298((float) arg2.field5101 / 2.0F + (float) arg4 + (float) var18, (float) arg2.field5200 / 2.0F + (float) arg3 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method1436(int arg0) {
        field3227 = null;
        field3232 = null;
        if (arg0 > 64) {
            field3229 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    private final void method1437(int arg0, int arg1) {
        field3226++;
        double var3 = (double) ((arg1 & 0xFF07CA) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field3223 = (int) (var15 * 256.0D);
        this.field3217 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field3217 < 0) {
            this.field3217 = 0;
        } else if (this.field3217 > 255) {
            this.field3217 = 255;
        }
        if (var17 > 0.5D) {
            this.field3216 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3216 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3223 < 0) {
            this.field3223 = 0;
        } else if (this.field3223 > 255) {
            this.field3223 = 255;
        }
        if (arg0 >= -87) {
            field3215 = true;
        }
        if (this.field3216 < 1) {
            this.field3216 = 1;
        }
        this.field3221 = (int) ((double) this.field3216 * var19);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILlk;)V")
    public final void method1438(int arg0, class425 arg1) {
        if (arg0 > -73) {
            this.method1438(91, (class425) null);
        }
        while (true) {
            int var3 = arg1.method2503(true);
            if (var3 == 0) {
                field3218++;
                return;
            }
            this.method1434((byte) 87, arg1, var3);
        }
    }

    static {
        new class112((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        new class112("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field3231 = 0;
        field3230 = 0;
        field3232 = "";
        field3229 = new class112("K", "T", "K", "K");
        field3233 = 1;
        new class112("From", "Von:", "De", "De");
    }
}
