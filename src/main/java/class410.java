import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class410 extends class227 {

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "Z")
    private boolean field5869 = true;

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
    private int field5872 = 4096;

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "Ljc;")
    public static class305 field5868 = new class305("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!iu", name = "M", descriptor = "Ljc;")
    public static class305 field5873 = new class305("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!iu", name = "O", descriptor = "I")
    public static int field5875 = 0;

    @OriginalMember(owner = "client!iu", name = "Q", descriptor = "[F")
    public static float[] field5877;

    @OriginalMember(owner = "client!iu", name = "P", descriptor = "Lho;")
    public static class103 field5876;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!iu", name = "N", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
    public class410() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field5869 = ~arg0.method2388((byte) -125) == -2;
            }
        } else {
            this.field5872 = arg0.method2386(arg1 ^ -487197780);
        }
        if (arg1 != 487215116) {
            this.method112(-79, false);
        }
        ++field5871;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field5870;
            int[][] var3 = super.field3059.method28((byte) -118, arg0);
            if (super.field3059.field57) {
                int[] var4 = this.method1459(arg0 + -1 & class115.field1508, 112, 0);
                int[] var5 = this.method1459(arg0, -90, 0);
                int[] var6 = this.method1459(class115.field1508 & arg0 + 1, 127, 0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; var10 < class446.field6486; ++var10) {
                    int var11 = (var6[var10] - var4[var10]) * this.field5872;
                    int var12 = (var5[var10 + 1 & class102.field1388] + -var5[class102.field1388 & var10 + -1]) * this.field5872;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 - (-var16 - 4096)) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var19 = var11 / var17;
                        var18 = 16777216 / var17;
                        var20 = var12 / var17;
                    }
                    if (this.field5869) {
                        var20 = 2048 - -(var20 >> 1);
                        var18 = (var18 >> 1) + 2048;
                        var19 = 2048 - -(var19 >> 1);
                    }
                    var7[var10] = var20;
                    var8[var10] = var19;
                    var9[var10] = var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "(I)V")
    public static void method2507(int arg0) {
        field5876 = null;
        int var1 = -38 / ((2 - arg0) / 45);
        field5868 = null;
        field5873 = null;
        field5877 = null;
    }

    static {
        new class305("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field5877 = new float[4];
        field5876 = new class103(74, 16);
    }
}
