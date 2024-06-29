import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class468 extends class214 {

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    private int field6559 = 4096;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    private int field6554 = 3216;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    private int field6556 = 3216;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "[I")
    private int[] field6557 = new int[3];

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field6561 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "[I")
    public static int[] field6565 = new int[50];

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field6566;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V")
    public final void method12(int arg0) {
        ++field6555;
        this.method2752(-1);
        if (arg0 != 27108) {
            this.method12(40);
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class468() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
    private final void method2752(int arg0) {
        ++field6560;
        double var2 = Math.cos((double) ((float) this.field6554 / 4096.0F));
        this.field6557[0] = (int) (Math.sin((double) ((float) this.field6556 / 4096.0F)) * var2 * 4096.0D);
        this.field6557[1] = (int) (Math.cos((double) ((float) this.field6556 / 4096.0F)) * var2 * 4096.0D);
        this.field6557[2] = (int) (4096.0D * Math.sin((double) ((float) this.field6554 / 4096.0F)));
        int var4 = this.field6557[0] * this.field6557[0] >> 12;
        int var5 = this.field6557[1] * this.field6557[1] >> 12;
        int var6 = this.field6557[2] * this.field6557[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - (-var5 - var6) >> 12)) * 4096.0D);
        if (~var7 != arg0) {
            this.field6557[0] = (this.field6557[0] << 12) / var7;
            this.field6557[1] = (this.field6557[1] << 12) / var7;
            this.field6557[2] = (this.field6557[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
    public static final byte[] method2753(byte arg0, Object arg1, boolean arg2) {
        ++field6558;
        int var3 = -15 / ((-21 - arg0) / 60);
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return arg2 ? class81.method555(var4, 119) : var4;
        } else if (arg1 instanceof class373) {
            class373 var5 = (class373) arg1;
            return var5.method2146((byte) 108);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIIII)V")
    public static final void method2754(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6562;
        class265 var5 = class440.method2554(arg4, 2, 8);
        var5.method1675(false);
        var5.field3698 = arg3;
        var5.field3692 = arg2;
        var5.field3689 = arg1;
        if (arg0 >= -99) {
            method2754((byte) -100, 51, 109, -102, 113);
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(I)V")
    public static void method2755(int arg0) {
        field6561 = null;
        field6566 = null;
        field6565 = null;
        if (arg0 != 27988) {
            field6565 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field6563;
        if (arg1 > -114) {
            this.method12(67);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field6554 = arg0.method2508(true);
                }
            } else {
                this.field6556 = arg0.method2508(true);
            }
        } else {
            this.field6559 = arg0.method2508(true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field6564;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (arg0 != 123) {
            this.field6554 = -64;
        }
        if (super.field3024.field6135) {
            int var4 = class471.field6584 * this.field6559 >> 12;
            int[] var5 = this.method1352(class183.field2659 & arg1 + -1, 0, -81);
            int[] var6 = this.method1352(arg1, 0, arg0 + -218);
            int[] var7 = this.method1352(class183.field2659 & arg1 + 1, 0, -115);
            for (int var8 = 0; ~class399.field5585 < ~var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class467.field6551 & var8 + -1] + -var6[var8 - -1 & class467.field6551]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class356.field4961[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field6557[0] * var14 >> 12;
                int var18 = this.field6557[1] * var16 >> 12;
                int var19 = this.field6557[2] * var15 >> 12;
                var3[var8] = var17 + var18 - -var19;
            }
        }
        return var3;
    }

    static {
        new class112("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        new class112("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field6566 = new String[100];
    }
}
