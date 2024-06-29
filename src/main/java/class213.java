import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class213 extends class152 {

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "Lam;")
    public static class180 field3312 = new class180();

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "S")
    public static short field3319 = 1;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "I")
    public static int field3321 = 0;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "B")
    public byte field3313;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "Lmj;")
    public static class115 field3315;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "Lme;")
    public static class229 field3320;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "Lai;")
    public class88 field3308;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1446(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var8 = 109 % ((arg5 - 35) / 63);
        ++field3309;
        if (~arg3 <= -129 && arg4 >= 128 && ~arg3 >= -13057 && ~arg4 >= -13057) {
            int var9 = class34.method269(class240.field3892, arg4, arg3, 103) - arg1;
            int var10 = var9 - class170.field2653;
            int var11 = arg4 - class293.field4624;
            int var12 = class195.field3091[class62.field1066];
            int var13 = arg3 - class219.field3375;
            int var14 = class195.field3089[class62.field1066];
            int var15 = class195.field3091[class83.field1408];
            int var16 = class195.field3089[class83.field1408];
            int var17 = var11 * var15 - -(var13 * var16) >> 16;
            int var18 = var11 * var16 + -(var13 * var15) >> 16;
            int var20 = var10 * var14 + -(var12 * var18) >> 16;
            int var21 = var10 * var12 + var14 * var18 >> 16;
            if (~var21 <= -51) {
                class84.field1414 = (var20 << 9) / var21 + arg6;
                class294.field4630 = (var17 << 9) / var21 + arg2;
            } else {
                class84.field1414 = -1;
                class294.field4630 = -1;
            }
        } else {
            class84.field1414 = -1;
            class294.field4630 = -1;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)I")
    public final int method1026(boolean arg0) {
        ++field3318;
        if (this.field3308 == null) {
            return 0;
        } else {
            return !arg0 ? 120 : this.field3308.field1535 * 100 / (this.field3308.field1471.length + -this.field3313);
        }
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)V")
    public static void method1447(int arg0) {
        field3312 = null;
        if (arg0 > -89) {
            field3317 = -30;
        }
        field3320 = null;
        field3315 = null;
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)[B")
    public final byte[] method1024(int arg0) {
        ++field3314;
        if (!super.field2377 && this.field3308.field1535 >= this.field3308.field1471.length - this.field3313) {
            if (arg0 > -98) {
                field3312 = null;
            }
            return this.field3308.field1471;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "(I)V")
    public static final void method1448(int arg0) {
        if (arg0 != 6876) {
            field3316 = -120;
        }
        class42.field607.method1898((byte) -82);
        ++field3306;
    }
}
