import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class224 extends class149 {

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    private int field3159 = 4096;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "Z")
    private boolean field3156 = true;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public static int field3160 = 1;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "Ler;")
    public static class157 field3158 = new class157(4);

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "[F")
    public static float[] field3163 = new float[4];

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "Ljava/lang/Object;")
    public static Object field3157;

    static {
        new class375("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field3164 = 1;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V", line = 10)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)[[I", line = 15)
    public final int[][] method139(byte arg0, int arg1) {
        ++field3162;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int[] var4 = this.method983(0, 24824, class51.field694 & arg1 + -1);
            int[] var5 = this.method983(0, 24824, arg1);
            int[] var6 = this.method983(0, 24824, class51.field694 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class316.field4838 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3159;
                int var12 = (var5[var10 + 1 & class320.field4897] + -var5[class320.field4897 & var10 + -1]) * this.field3159;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var18 = var12 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field3156) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        if (arg0 >= -45) {
            field3164 = -15;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V", line = 98)
    public static void method1512(boolean arg0) {
        field3163 = null;
        if (arg0) {
            method1512(true);
        }
        field3158 = null;
        field3157 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBLtl;)V", line = 112)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field3156 = ~arg2.method618((byte) 100) == -2;
            }
        } else {
            this.field3159 = arg2.method631(10494);
        }
        if (arg1 != 35) {
            field3163 = null;
        }
        ++field3161;
    }
}
