import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class275 extends class210 {

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    private int field4062 = 3216;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "[I")
    private int[] field4071 = new int[3];

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    private int field4068 = 4096;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    private int field4066 = 3216;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "Lil;")
    public static class274 field4063 = new class274(0, 7);

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "[[I")
    public static int[][] field4076 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    public static int field4077 = 0;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "Ljn;")
    public static class409 field4073 = new class409("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "Lbn;")
    public static class160 field4078 = new class160(73, 0);

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "Lpl;")
    public static class459 field4074;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V", line = 7)
    public static void method1874(int arg0) {
        field4073 = null;
        field4063 = null;
        if (arg0 < 88) {
            method1876(12, (class58) null, -126, -116, 66, 25, 24);
        }
        field4076 = null;
        field4074 = null;
        field4078 = null;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V", line = 22)
    private final void method1875(byte arg0) {
        ++field4065;
        double var2 = Math.cos((double) ((float) this.field4062 / 4096.0F));
        this.field4071[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field4066 / 4096.0F)));
        this.field4071[1] = (int) (var2 * Math.cos((double) ((float) this.field4066 / 4096.0F)) * 4096.0D);
        this.field4071[2] = (int) (Math.sin((double) ((float) this.field4062 / 4096.0F)) * 4096.0D);
        int var4 = this.field4071[0] * this.field4071[0] >> 12;
        int var5 = this.field4071[1] * this.field4071[1] >> 12;
        if (arg0 != -49) {
            method1874(-112);
        }
        int var6 = this.field4071[2] * this.field4071[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - -var6 + var5 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field4071[1] = (this.field4071[1] << 12) / var7;
            this.field4071[0] = (this.field4071[0] << 12) / var7;
            this.field4071[2] = (this.field4071[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILva;IIIII)V", line = 53)
    public static final void method1876(int arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4069;
        class33.method315(arg3, arg6, arg0, (byte) 80, arg1.field4954, arg5, arg1.field4951, arg4, arg2, arg1.field4960);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILat;)V", line = 62)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field4064;
        if (arg1 == -11941) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        this.field4062 = arg2.method1767(arg1 + 1930505517);
                    }
                } else {
                    this.field4066 = arg2.method1767(arg1 ^ -1930481709);
                }
            } else {
                this.field4068 = arg2.method1767(1930493576);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V", line = 106)
    public final void method363(int arg0) {
        if (arg0 != 0) {
            field4074 = null;
        }
        ++field4070;
        this.method1875((byte) -49);
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)V", line = 117)
    public static final void method1877(int arg0) {
        if (arg0 >= -41) {
            field4073 = null;
        }
        ++field4067;
        if (class341.field5020.toLowerCase().indexOf("microsoft") == -1) {
            class200.field2830[45] = 26;
            class200.field2830[44] = 71;
            if (class341.field5027 == null) {
                class200.field2830[222] = 59;
                class200.field2830[192] = 58;
            } else {
                class200.field2830[192] = 28;
                class200.field2830[222] = 58;
                class200.field2830[520] = 59;
            }
            class200.field2830[47] = 73;
            class200.field2830[59] = 57;
            class200.field2830[92] = 74;
            class200.field2830[46] = 72;
            class200.field2830[61] = 27;
            class200.field2830[93] = 43;
            class200.field2830[91] = 42;
        } else {
            class200.field2830[186] = 57;
            class200.field2830[187] = 27;
            class200.field2830[222] = 59;
            class200.field2830[220] = 74;
            class200.field2830[221] = 43;
            class200.field2830[219] = 42;
            class200.field2830[191] = 73;
            class200.field2830[189] = 26;
            class200.field2830[192] = 58;
            class200.field2830[188] = 71;
            class200.field2830[223] = 28;
            class200.field2830[190] = 72;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 203)
    public class275() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z", line = 172)
    public static final boolean method1878(int arg0, int arg1) {
        ++field4072;
        if (~arg1 != -61 && arg1 != 23 && arg1 != 22 && arg1 != 4 && arg1 != 47) {
            if (~arg1 != -13 && ~arg1 != -1003) {
                return arg0 != 4;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)[I", line = 206)
    public final int[] method361(int arg0, byte arg1) {
        if (arg1 != -38) {
            field4073 = null;
        }
        ++field4075;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int var4 = class4.field66 * this.field4068 >> 12;
            int[] var5 = this.method1447(class139.field1911 & arg0 + -1, arg1 ^ 86, 0);
            int[] var6 = this.method1447(arg0, -116, 0);
            int[] var7 = this.method1447(class139.field1911 & arg0 - -1, -125, 0);
            for (int var8 = 0; class202.field2852 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class437.field6373] - var6[class437.field6373 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class208.field2932[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field4071[2] * var14 >> 12;
                int var18 = this.field4071[1] * var16 >> 12;
                int var19 = this.field4071[0] * var15 >> 12;
                var3[var8] = var19 - -var18 + var17;
            }
        }
        return var3;
    }
}
