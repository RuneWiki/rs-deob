import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class374 extends class149 {

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    private int field5729 = 32768;

    @OriginalMember(owner = "client!uu", name = "P", descriptor = "[I")
    public static int[] field5733;

    @OriginalMember(owner = "client!uu", name = "S", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!uu", name = "R", descriptor = "Lpg;")
    public static class492 field5735;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "Lfe;")
    public static class235 field5734;

    static {
        new class375("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field5733 = new int[5];
        field5736 = 328;
        field5735 = new class492(108, 8);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)[[I", line = 3)
    public final int[][] method139(byte arg0, int arg1) {
        ++field5732;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (arg0 > -45) {
            return null;
        } else {
            if (super.field2147.field6664) {
                int[] var4 = this.method983(1, 24824, arg1);
                int[] var5 = this.method983(2, 24824, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class316.field4838; ++var9) {
                    int var10 = 255 & var4[var9] * 255 >> 12;
                    int var11 = var5[var9] * this.field5729 >> 12;
                    int var12 = class253.field3510[var10] * var11 >> 12;
                    int var13 = class25.field406[var10] * var11 >> 12;
                    int var14 = class320.field4897 & (var12 >> 12) + var9;
                    int var15 = (var13 >> 12) + arg1 & class51.field694;
                    int[][] var16 = this.method984((byte) 122, 0, var15);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)V", line = 60)
    public final void method99(int arg0) {
        ++field5728;
        if (arg0 > -86) {
            this.method139((byte) 14, -57);
        }
        class117.method761(0);
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V", line = 73)
    public class374() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZ)I", line = 77)
    public static final int method2333(int arg0, int arg1, boolean arg2) {
        ++field5731;
        if (arg2) {
            field5733 = null;
        }
        int var3 = arg1 >>> 24;
        int var4 = -var3 + 255;
        int var5 = ((arg1 & 16711935) * var3 & -16711936 | 16711680 & (65280 & arg1) * var3) >>> 8;
        return (((16711935 & arg0) * var4 & -16711936 | 16711680 & (arg0 & 65280) * var4) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBLtl;)V", line = 93)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            this.method92(18, -14);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2148 = ~arg2.method618((byte) 100) == -2;
            }
        } else {
            this.field5729 = arg2.method631(10494) << 4;
        }
        ++field5727;
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)V", line = 133)
    public static void method2334(int arg0) {
        if (arg0 != -7224) {
            method2333(45, 51, false);
        }
        field5735 = null;
        field5733 = null;
        field5734 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)[I", line = 148)
    public final int[] method92(int arg0, int arg1) {
        ++field5730;
        int[] var3 = super.field2152.method2891(arg1, (byte) 115);
        if (super.field2152.field7051) {
            int[] var4 = this.method983(1, arg0 ^ -19115, arg1);
            int[] var5 = this.method983(2, arg0 + 35659, arg1);
            for (int var6 = 0; class316.field4838 > var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field5729 >> 12;
                int var9 = class253.field3510[var7] * var8 >> 12;
                int var10 = class25.field406[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class320.field4897;
                int var12 = (var10 >> 12) + arg1 & class51.field694;
                int[] var13 = this.method983(0, 24824, var12);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 != -10835) {
            field5733 = null;
        }
        return var3;
    }
}
