import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class62 extends class11 {

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    private int field765 = 3216;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    private int field767 = 4096;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    private int field768 = 3216;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "[I")
    private int[] field774 = new int[3];

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Lmg;")
    public static class101 field777;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
    public static final void method507(int arg0, byte arg1) {
        ++field769;
        class97 var2 = class348.method2064(arg0, 2, 97);
        var2.method710(-9237);
        if (arg1 >= -119) {
            field777 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public static void method508(byte arg0) {
        if (arg0 == -37) {
            field777 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field771;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field768 = arg0.method2353((byte) 74);
                }
            } else {
                this.field765 = arg0.method2353((byte) 109);
            }
        } else {
            this.field767 = arg0.method2353((byte) 86);
        }
        if (arg1 >= -40) {
            this.method42(false);
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field773;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int var4 = class380.field5559 * this.field767 >> 12;
            int[] var5 = this.method48(arg1 + -1 & class183.field2683, 0, (byte) -70);
            int[] var6 = this.method48(arg1, 0, (byte) -125);
            int[] var7 = this.method48(class183.field2683 & arg1 + 1, 0, (byte) -104);
            for (int var8 = 0; ~var8 > ~class90.field1316; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class99.field1490 & var8 + -1] + -var6[class99.field1490 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class261.field3624[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field774[2] * var15 >> 12;
                int var18 = this.field774[1] * var16 >> 12;
                int var19 = this.field774[0] * var14 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        if (arg0 >= -42) {
            this.field765 = -90;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class417.field6057 && class224.field3193 >= arg2) {
            int var5 = class46.method425(true, arg4, class76.field1021, class424.field6204);
            int var6 = class46.method425(true, arg1, class76.field1021, class424.field6204);
            class519.method3098(arg3, var5, arg2, var6, -95);
        }
        ++field775;
        if (arg0 != -1266276916) {
            field766 = 2;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lsi;I)Lvl;")
    public static final class11 method510(class391 arg0, int arg1) {
        ++field776;
        arg0.method2348(-2);
        int var2 = arg0.method2348(-2);
        class11 var3 = class344.method2042(arg1, var2);
        var3.field169 = arg0.method2348(-2);
        int var4 = arg0.method2348(-2);
        for (int var5 = arg1; var5 < var4; ++var5) {
            int var6 = arg0.method2348(-2);
            var3.method43(arg0, arg1 + -101, var6);
        }
        var3.method42(true);
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class62() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
    public final void method42(boolean arg0) {
        this.method511((byte) -51);
        if (arg0) {
            ++field772;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
    private final void method511(byte arg0) {
        ++field770;
        double var2 = Math.cos((double) ((float) this.field768 / 4096.0F));
        this.field774[0] = (int) (Math.sin((double) ((float) this.field765 / 4096.0F)) * var2 * 4096.0D);
        this.field774[1] = (int) (var2 * Math.cos((double) ((float) this.field765 / 4096.0F)) * 4096.0D);
        this.field774[2] = (int) (4096.0D * Math.sin((double) ((float) this.field768 / 4096.0F)));
        int var4 = this.field774[0] * this.field774[0] >> 12;
        int var5 = this.field774[1] * this.field774[1] >> 12;
        int var6 = this.field774[2] * this.field774[2] >> 12;
        if (arg0 != -51) {
            this.field765 = 41;
        }
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field774[1] = (this.field774[1] << 12) / var7;
            this.field774[2] = (this.field774[2] << 12) / var7;
            this.field774[0] = (this.field774[0] << 12) / var7;
        }
    }
}
