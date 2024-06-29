import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class177 extends class99 {

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "Llh;")
    public static class51 field3178 = new class51(0, 0);

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public static int field3183 = 0;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "Lhi;")
    public static class24 field3184 = null;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "B")
    public byte field3171;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "Lmd;")
    public static class112 field3176;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "Lwe;")
    public class75 field3173;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II[BI)Lha;")
    public static final class46 method1265(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field3179;
        class46 var4 = new class46();
        if (arg3 < 30) {
            field3176 = null;
        }
        var4.field768 = new byte[arg1];
        var4.field762 = 0;
        for (int var5 = arg0; ~var5 > ~(arg0 + arg1); ++var5) {
            if (~arg2[var5] != -1) {
                var4.field768[var4.field762++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)[B")
    public final byte[] method20(int arg0) {
        ++field3175;
        if (!super.field1834 && ~this.field3173.field1380 <= ~(this.field3173.field1368.length - this.field3171)) {
            if (arg0 > -95) {
                method1266(-68, 93);
            }
            return this.field3173.field1368;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)I")
    public final int method21(int arg0) {
        ++field3172;
        if (arg0 <= 95) {
            field3183 = 39;
        }
        return this.field3173 == null ? 0 : this.field3173.field1380 * 100 / (this.field3173.field1368.length - this.field3171);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Lmb;")
    public static final class119 method1266(int arg0, int arg1) {
        int var2 = -29 % ((arg0 - -47) / 34);
        ++field3182;
        return class71.field1217 && ~class122.field2268 >= ~arg1 && class161.field2850 >= arg1 ? class202.field3629[-class122.field2268 + arg1] : null;
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V")
    public static void method1267(int arg0) {
        field3184 = null;
        field3178 = null;
        if (arg0 != 0) {
            field3176 = null;
        }
        field3176 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZIII[Luf;[B)V")
    public static final void method1268(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class154[] arg6, byte[] arg7) {
        if (!arg2) {
            for (int var8 = 0; ~var8 > -5; ++var8) {
                for (int var9 = 0; var9 < 64; ++var9) {
                    for (int var10 = 0; var10 < 64; ++var10) {
                        if (~(arg3 + var9) < -1 && ~(arg3 + var9) > -104 && arg4 + var10 > 0 && ~(arg4 + var10) > -104) {
                            arg6[var8].field2718[arg3 + var9][arg4 + var10] = class50.method369(arg6[var8].field2718[arg3 + var9][arg4 + var10], -16777217);
                        }
                    }
                }
            }
        }
        ++field3174;
        if (arg5 != 64) {
            method1265(115, 3, (byte[]) null, -109);
        }
        byte var11;
        if (arg2) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class75 var12 = new class75(arg7);
        for (int var13 = 0; var11 > var13; ++var13) {
            for (int var14 = 0; var14 < 64; ++var14) {
                for (int var15 = 0; ~var15 > -65; ++var15) {
                    class60.method404(arg0, var12, var15 - -arg4, 0, arg2, var13, arg1, (byte) -94, arg3 + var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB)V")
    public static final void method1269(int arg0, int arg1, byte arg2) {
        ++field3177;
        class146 var3 = class6.method22((byte) 16, 12, arg1);
        var3.method1088(11102);
        if (arg2 <= 21) {
            field3176 = null;
        }
        var3.field2640 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V")
    public static final void method1270(int arg0) {
        ++field3180;
        if (class135.field2448 == arg0) {
            class83.method661(25, arg0 ^ 30);
        }
    }
}
