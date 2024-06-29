import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class284 extends class264 {

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    private int field4067 = 3072;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    private int field4066 = 1024;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    private int field4070 = 2048;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "Lch;")
    public static class151 field4064 = new class151("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "Lch;")
    public static class151 field4071 = new class151(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "Lap;")
    public static class310 field4072 = new class310(61, 7);

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field4073 = 1406;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field4074 = -1;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
    public static void method1881(int arg0) {
        if (arg0 == -2) {
            field4072 = null;
            field4064 = null;
            field4071 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
    public final void method95(int arg0) {
        ++field4069;
        this.field4070 = -this.field4066 + this.field4067;
        if (arg0 != -8) {
            method1881(82);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class284() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field4065;
        int[][] var3 = super.field3816.method1928((byte) 122, arg1);
        if (arg0 != 116) {
            method1881(17);
        }
        if (super.field3816.field4208) {
            int[][] var4 = this.method1782(arg1, (byte) 116, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class478.field6792; ++var11) {
                var8[var11] = this.field4066 - -(var5[var11] * this.field4070 >> 12);
                var9[var11] = (var6[var11] * this.field4070 >> 12) + this.field4066;
                var10[var11] = (var7[var11] * this.field4070 >> 12) + this.field4066;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 >= 31) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field3794 = ~arg1.method1172((byte) -110) == -2;
                    }
                } else {
                    this.field4067 = arg1.method1134(-16848);
                }
            } else {
                this.field4066 = arg1.method1134(-16848);
            }
            ++field4063;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field4068;
        int[] var3 = super.field3808.method958((byte) 19, arg0);
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(arg0, (byte) -92, 0);
            for (int var5 = 0; class478.field6792 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field4070 >> 12) + this.field4066;
            }
        }
        if (arg1 != 21034) {
            this.method7((byte) 112, (class161) null, 25);
        }
        return var3;
    }
}
