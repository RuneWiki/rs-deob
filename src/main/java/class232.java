import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class232 extends class149 {

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    private int field3293 = 4096;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    private int field3298 = 4096;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    private int field3301 = 4096;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Z")
    public static boolean field3294 = true;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "Lpg;")
    public static class492 field3296 = new class492(56, 3);

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Lui;")
    public static class375 field3297 = new class375("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[Lvj;")
    public static class153[] field3295;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "[S")
    public static short[] field3300;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class232() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
    public static void method1577(int arg0) {
        if (arg0 != -30328) {
            method1577(13);
        }
        field3295 = null;
        field3296 = null;
        field3300 = null;
        field3297 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            field3294 = false;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field3301 = arg2.method631(arg1 + 10459);
                }
            } else {
                this.field3298 = arg2.method631(10494);
            }
        } else {
            this.field3293 = arg2.method631(10494);
        }
        ++field3299;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method139(byte arg0, int arg1) {
        ++field3292;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (arg0 > -45) {
            return null;
        } else {
            if (super.field2147.field6664) {
                int[][] var4 = this.method984((byte) 114, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class316.field4838 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && ~var13 == ~var14) {
                        var8[var11] = this.field3293 * var12 >> 12;
                        var9[var11] = this.field3298 * var13 >> 12;
                        var10[var11] = this.field3301 * var14 >> 12;
                    } else {
                        var8[var11] = this.field3293;
                        var9[var11] = this.field3298;
                        var10[var11] = this.field3301;
                    }
                }
            }
            return var3;
        }
    }

    static {
        new class375("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field3302 = 0;
    }
}
