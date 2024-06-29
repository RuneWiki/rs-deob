import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class31 extends class125 {

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "Lmr;")
    public static class611 field288 = new class611();

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!jha", name = "o", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!jha", name = "p", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!jha", name = "q", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(ILgp;)V", line = 6)
    public class31(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "([[BLdu;B)V", line = 9)
    public static final void method152(byte[][] arg0, class418 arg1, byte arg2) {
        for (int var3 = 0; ~arg1.field7271 < ~var3; ++var3) {
            class569.method3387(0);
            for (int var5 = 0; var5 < class184.field2546 >> 3; ++var5) {
                for (int var6 = 0; var6 < class240.field3555 >> 3; ++var6) {
                    int var7 = class742.field10347[var3][var5][var6];
                    if (~var7 != 0) {
                        int var8 = (65623432 & var7) >> 24;
                        if (!arg1.field7266 || ~var8 == -1) {
                            int var9 = var7 >> 1 & 3;
                            int var10 = 1023 & var7 >> 14;
                            int var11 = (16382 & var7) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; class284.field3961.length > var13; ++var13) {
                                if (class284.field3961[var13] == var12 && arg0[var13] != null) {
                                    arg1.method2540(true, class211.field3164, class6.field57, var6 * 8, (var11 & 7) * 8, (var10 & 7) * 8, var8, var9, var5 * 8, var3, arg0[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field286;
        int var4 = -40 % ((-4 - arg2) / 57);
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILhga;)[Luv;", line = 78)
    public static final class750[] method153(int arg0, class300 arg1) {
        ++field289;
        if (!arg1.method1866(true)) {
            return new class750[0];
        } else {
            class432 var2 = arg1.method1878(false);
            while (var2.field6198 == 0) {
                class363.method2283(10L, -24244);
            }
            if (~var2.field6198 == -3) {
                return new class750[0];
            } else {
                int[] var3 = (int[]) var2.field6200;
                class750[] var4 = new class750[var3.length >> 2];
                for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                    class750 var6 = new class750();
                    var4[var5] = var6;
                    var6.field10454 = var3[var5 << 2];
                    var6.field10455 = var3[(var5 << 2) - -1];
                    var6.field10450 = var3[(var5 << 2) + 2];
                    var6.field10453 = var3[(var5 << 2) + 3];
                }
                if (arg0 != 1006102306) {
                    field288 = null;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)V", line = 121)
    public static void method154(int arg0) {
        if (arg0 != 1023) {
            method153(-58, (class300) null);
        }
        field288 = null;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZI)I", line = 136)
    public final int method155(boolean arg0, int arg1) {
        if (!arg0) {
            this.method158((byte) -115);
        }
        ++field284;
        return 1;
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(Z)V", line = 147)
    public final void method156(boolean arg0) {
        if (arg0) {
            if (~super.field1732 != -2 && super.field1732 != 0) {
                super.field1732 = this.method158((byte) -128);
            }
            ++field283;
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lgp;)V", line = 160)
    public class31(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(BI)V", line = 163)
    public final void method157(byte arg0, int arg1) {
        ++field287;
        super.field1732 = arg1;
        if (arg0 >= -32) {
            field291 = -16;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)I", line = 177)
    public final int method158(byte arg0) {
        ++field285;
        int var2 = 49 % ((arg0 - -63) / 49);
        return 0;
    }

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "(Z)I", line = 192)
    public final int method159(boolean arg0) {
        ++field290;
        return arg0 ? -27 : super.field1732;
    }
}
