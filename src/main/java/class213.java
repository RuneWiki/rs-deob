import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class213 extends class43 {

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    private int field3887 = 0;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    private int field3896 = 2048;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    private int field3891 = 10;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "Lmb;")
    public static class132 field3888 = class166.method1092(" loggt sich ein)3", 123);

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "Lmb;")
    public static class132 field3894 = class166.method1092("null", 114);

    @OriginalMember(owner = "client!ti", name = "gb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3900 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ti", name = "eb", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ti", name = "hb", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "[I")
    private int[] field3893;

    @OriginalMember(owner = "client!ti", name = "fb", descriptor = "[I")
    private int[] field3899;

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class213() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3887 = arg2.method716(-1308);
                }
            } else {
                this.field3896 = arg2.method739(119);
            }
        } else {
            this.field3891 = arg2.method716(-1308);
        }
        if (arg1 == -73) {
            ++field3898;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
    private final void method1329(byte arg0) {
        ++field3889;
        this.field3893 = new int[this.field3891 - -1];
        int var2 = 4096 / this.field3891;
        this.field3899 = new int[this.field3891 + 1];
        int var3 = 0;
        int var4 = this.field3896 * var2 >> 12;
        if (arg0 < -83) {
            for (int var5 = 0; var5 < this.field3891; ++var5) {
                this.field3893[var5] = var3;
                this.field3899[var5] = var3 + var4;
                var3 += var2;
            }
            this.field3893[this.field3891] = 4096;
            this.field3899[this.field3891] = 4096 - -this.field3899[0];
        }
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 <= 21) {
            this.field3896 = 100;
        }
        ++field3895;
        this.method1329((byte) -120);
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
    public static void method1330(int arg0) {
        field3894 = null;
        field3888 = null;
        if (arg0 == -4947) {
            field3900 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field3892;
        int[] var3 = super.field768.method1123(arg1 + arg1, arg0);
        if (super.field768.field3219) {
            int var4 = class2.field35[arg0];
            if (this.field3887 != 0) {
                for (int var5 = 0; var5 < class131.field2427; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class156.field2849[var5];
                    int var9 = this.field3887;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field3891 < ~var10; ++var10) {
                        if (var6 >= this.field3893[var10] && ~this.field3893[var10 + 1] < ~var6) {
                            if (~var6 > ~this.field3899[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field3891; ++var12) {
                    if (~this.field3893[var12] >= ~var4 && ~this.field3893[var12 + 1] < ~var4) {
                        if (~var4 > ~this.field3899[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class80.method493(var3, 0, class131.field2427, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lpb;ZBLj;Lpb;)V")
    public static final void method1331(class165 arg0, boolean arg1, byte arg2, class98 arg3, class165 arg4) {
        class75.field1252 = arg1;
        class102.field1917 = arg4;
        class64.field1057 = arg0;
        ++field3890;
        int var5 = -46 % ((arg2 - 15) / 54);
        int var6 = class64.field1057.method1084(124) + -1;
        class85.field1479 = var6 * 256 + class64.field1057.method1068(var6, 0);
        class10.field117 = arg3;
    }
}
