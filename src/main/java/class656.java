import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class656 {

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "J")
    private long field9262 = -1L;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Low;")
    private class665 field9258 = new class665();

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "[I")
    public static int[] field9265 = new int[32];

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "J")
    private long field9259;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "[I")
    public static int[] field9264;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIZ)V", line = 8)
    public static final void method3679(int arg0, int arg1, boolean arg2) {
        field9261++;
        if (arg2) {
            method3682(71, -99, (byte) 52, 99);
        }
        class371 var3 = class490.method2867((byte) -53, 5, (long) arg1);
        var3.method2212(-78);
        var3.field5233 = arg0;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V", line = 24)
    public static void method3680(int arg0) {
        field9265 = null;
        if (arg0 <= 25) {
            field9263 = -108;
        }
        field9264 = null;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lol;B)V", line = 38)
    private final void method3681(class431 arg0, byte arg1) {
        this.field9259 = arg0.method2567((byte) -127);
        if (arg1 != -47) {
            method3680(-100);
        }
        field9257++;
        this.field9262 = arg0.method2567((byte) -127);
        for (int var3 = arg0.method2557(arg1 + 14976); var3 != 0; var3 = arg0.method2557(14929)) {
            class147 var4;
            if (var3 == 1) {
                var4 = new class507();
            } else if (var3 == 4) {
                var4 = new class732();
            } else if (var3 == 3) {
                var4 = new class689();
            } else if (var3 == 2) {
                var4 = new class502();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var4.method1162(arg0, -43);
            this.field9258.method3728((byte) 125, var4);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIBI)I", line = 88)
    public static final int method3682(int arg0, int arg1, byte arg2, int arg3) {
        field9266++;
        int var4 = arg3 & 0x3;
        if (arg2 != 46) {
            method3679(-90, -66, false);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLhi;)V", line = 112)
    public final void method3683(byte arg0, class465 arg1) {
        field9267++;
        if (this.field9259 != arg1.field10592 || this.field9262 != arg1.field6334) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg1.field10592 + " updateNum:" + arg1.field6334 + " delta.clanHash:" + this.field9259 + " updateNum:" + this.field9262);
        }
        for (class147 var3 = (class147) this.field9258.method3731((byte) -105); var3 != null; var3 = (class147) this.field9258.method3729((byte) -115)) {
            var3.method1161(arg1, (byte) -28);
        }
        int var4 = -35 / ((arg0 - 54) / 41);
        arg1.field6334++;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lea;[I[I[IB)V", line = 135)
    public static final void method3684(class21 arg0, int[] arg1, int[] arg2, int[] arg3, byte arg4) {
        int var5 = 0;
        if (arg4 != -34) {
            return;
        }
        while (arg2.length > var5) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field4077.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field4077[var9] = null;
                    } else {
                        class98 var10 = class168.field2552.method3287(85, var6);
                        int var11 = var10.field1392;
                        class596 var12 = arg0.field4077[var9];
                        if (var12 != null) {
                            if (var12.field8518 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field4077[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field8520 = var8;
                                    var12.field8521 = 1;
                                    var12.field8517 = 0;
                                    var12.field8513 = 0;
                                    var12.field8515 = 0;
                                    if (!arg0.field4120) {
                                        class324.method1958(var10, (byte) 42, arg0, 0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field8517 = 0;
                                }
                            } else if (var10.field1407 >= class168.field2552.method3287(arg4 ^ 0xFFFFFFA4, var12.field8518).field1407) {
                                var12 = arg0.field4077[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class596 var13 = arg0.field4077[var9] = new class596();
                            var13.field8518 = var6;
                            var13.field8521 = 1;
                            var13.field8513 = 0;
                            var13.field8515 = 0;
                            var13.field8517 = 0;
                            var13.field8520 = var8;
                            if (!arg0.field4120) {
                                class324.method1958(var10, (byte) 42, arg0, 0);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
            var5++;
        }
        field9260++;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lol;)V", line = 243)
    public class656(class431 arg0) {
        this.method3681(arg0, (byte) -47);
    }
}
