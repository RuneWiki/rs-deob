import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class193 extends class318 implements class669 {

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "Lpr;")
    public static class407 field2320 = new class407(99, 20);

    @OriginalMember(owner = "client!su", name = "q", descriptor = "Loh;")
    public static class368 field2323 = new class368();

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(I)V")
    public static void method1107(int arg0) {
        field2320 = null;
        if (arg0 != -5) {
            field2323 = null;
        }
        field2323 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public final void method1108(byte arg0) {
        ++field2319;
        super.field4119.method2349(-93, this);
        if (arg0 != -103) {
            method1107(60);
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
    public final int method3(int arg0) {
        ++field2318;
        return arg0 != 29970 ? 123 : this.field2316;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Loa;B)V")
    public static final void method1109(class635 arg0, byte arg1) {
        ++field2321;
        int var2 = client.field3414;
        int var3 = class553.field7888;
        int var4 = class350.field4586;
        int var5 = class70.field749 + -3;
        byte var6 = 20;
        if (class426.field5656 == null || class513.field7337 == null) {
            if (class633.field8972.method1711(class622.field8829, arg1 + 35) && class633.field8972.method1711(class419.field5568, 1)) {
                class426.field5656 = arg0.method351(class563.method3185(class633.field8972, class622.field8829, 0), true);
                class563 var7 = class563.method3185(class633.field8972, class419.field5568, 0);
                class513.field7337 = arg0.method351(var7, true);
                var7.method3183();
                class489.field7097 = arg0.method351(var7, true);
            } else {
                arg0.method286(var2, var3, var4, var6, -class635.field8986 + 255 << 24 | class580.field8251, 1);
            }
        }
        if (class426.field5656 != null && class513.field7337 != null) {
            int var8 = (-(2 * class513.field7337.method415()) + var4) / class426.field5656.method415();
            for (int var9 = 0; var8 > var9; ++var9) {
                class426.field5656.method2612(class513.field7337.method415() + var2 + class426.field5656.method415() * var9, var3);
            }
            class513.field7337.method2612(var2, var3);
            class489.field7097.method2612(-class489.field7097.method415() + var2 + var4, var3);
        }
        class211.field2561.method1124(0, class221.field2743.method1296(class226.field2899, (byte) -128), -16777216 | class454.field6294, -1, var2 + 3, var3 + 14);
        arg0.method286(var2, var3 - -var6, var4, -var6 + var5, -class635.field8986 + 255 << 24 | class580.field8251, 1);
        int var10 = class407.field5419.method162(-26561);
        int var11 = class407.field5419.method161(31285);
        if (arg1 == -34) {
            int var12 = 0;
            for (class208 var13 = (class208) class530.field7597.method3174((byte) 49); var13 != null; var13 = (class208) class530.field7597.method3168(false)) {
                int var31 = var3 + var6 - (-((class145.field1625 - 1 - var12) * 16) + -13);
                if (var10 > var2 && var2 + var4 > var10 && var31 - 13 < var11 && ~(var31 + 4) < ~var11 && var13.field2526) {
                    arg0.method286(var2, var31 + -12, var4, 16, -class279.field3529 + 255 << 24 | class427.field5672, 1);
                }
                ++var12;
            }
            if ((class35.field398 == null || class282.field3594 == null || class284.field3601 == null) && class633.field8972.method1711(class474.field6908, arg1 + 35) && class633.field8972.method1711(class608.field8602, arg1 ^ -33) && class633.field8972.method1711(class485.field7067, 1)) {
                class563 var14 = class563.method3185(class633.field8972, class608.field8602, 0);
                class282.field3594 = arg0.method351(var14, true);
                var14.method3183();
                class275.field3478 = arg0.method351(var14, true);
                class35.field398 = arg0.method351(class563.method3185(class633.field8972, class474.field6908, 0), true);
                class563 var15 = class563.method3185(class633.field8972, class485.field7067, 0);
                class284.field3601 = arg0.method351(var15, true);
                var15.method3183();
                class141.field1609 = arg0.method351(var15, true);
            }
            if (class35.field398 != null && class282.field3594 != null && class284.field3601 != null) {
                int var16 = (-(2 * class284.field3601.method415()) + var4) / class35.field398.method415();
                for (int var17 = 0; var16 > var17; ++var17) {
                    class35.field398.method2612(var2 + class284.field3601.method415() + var17 * class35.field398.method415(), var3 + var5 - class35.field398.method417());
                }
                int var18 = (-class284.field3601.method417() + -var6 + var5) / class282.field3594.method417();
                for (int var19 = 0; ~var18 < ~var19; ++var19) {
                    class282.field3594.method2612(var2, var19 * class282.field3594.method417() + var6 + var3);
                    class275.field3478.method2612(var2 + var4 + -class275.field3478.method415(), class282.field3594.method417() * var19 + (var3 - -var6));
                }
                class284.field3601.method2612(var2, -class284.field3601.method417() + var3 + var5);
                class141.field1609.method2612(var4 + (var2 - class284.field3601.method415()), var3 + var5 - class284.field3601.method417());
            }
            int var20 = 0;
            for (class208 var21 = (class208) class530.field7597.method3174((byte) 49); var21 != null; var21 = (class208) class530.field7597.method3168(false)) {
                int var22 = (-1 - var20 + class145.field1625) * 16 + var3 + var6 + 13;
                int var23 = class454.field6294 | -16777216;
                if (~var2 > ~var10 && ~var10 > ~(var2 + var4) && ~(var22 + -13) > ~var11 && ~(var22 + 4) < ~var11 && var21.field2526) {
                    var23 = -16777216 | class249.field3201;
                }
                int[] var24 = null;
                if (!class455.method2586(var21.field2527, (byte) -94)) {
                    if (var21.field2534 != -1) {
                        var24 = class472.field6588.method1903(var21.field2534, (byte) -116).field7702;
                    } else if (class662.method3721((byte) 103, var21.field2527)) {
                        class443 var25 = (class443) class392.field5223.method3234((byte) -70, (long) ((int) var21.field2524));
                        if (var25 != null) {
                            class625 var26 = var25.field6107;
                            class23 var27 = var26.field8855;
                            if (var27.field229 != null) {
                                var27 = var27.method108(0, class491.field7127);
                            }
                            if (var27 != null) {
                                var24 = var27.field215;
                            }
                        }
                    } else if (class429.method2304(15311, var21.field2527)) {
                        Object var28 = null;
                        class335 var29;
                        if (~var21.field2527 == -1010) {
                            var29 = class195.field2339.method3729((int) var21.field2524, (byte) 109);
                        } else {
                            var29 = class195.field2339.method3729((int) (var21.field2524 >>> 32 & 2147483647L), (byte) 109);
                        }
                        if (var29.field4342 != null) {
                            var29 = var29.method1889(1, class491.field7127);
                        }
                        if (var29 != null) {
                            var24 = var29.field4375;
                        }
                    }
                } else {
                    var24 = class472.field6588.method1903((int) var21.field2524, (byte) -113).field7702;
                }
                String var30 = class5.method24(var21, (byte) -121);
                if (var24 != null) {
                    var30 = var30 + class392.method2140(var24, -74);
                }
                class211.field2561.method1135(class595.field8449, var23, var2 + 3, 0, var30, class85.field906, arg1 + -18156, var22);
                if (var21.field2535) {
                    class217.field2619.method2612(var2 - -5 - -class612.field8650.method3622(62, var30), var22 + -12);
                }
                ++var20;
            }
            class110.method690(class70.field749, class553.field7888, class350.field4586, client.field3414, 0);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
    public static final void method1110(int arg0, int arg1) {
        class235.field2997 = 3;
        if (arg0 < 82) {
            method1110(-122, 96);
        }
        class2.field19 = 100;
        class685.field9699 = -1;
        class388.field5189 = arg1;
        ++field2325;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lap;I[BIZ)V")
    public class193(class435 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2316 = arg1;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)I")
    public final int method2(int arg0) {
        ++field2322;
        int var2 = 29 / ((arg0 - -54) / 38);
        return super.field4122;
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)J")
    public final long method6(int arg0) {
        ++field2317;
        return arg0 != 1151 ? 73L : 0L;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IB[BI)V")
    public final void method4(int arg0, byte arg1, byte[] arg2, int arg3) {
        this.method1792(arg0, 0, arg2);
        if (arg1 != 5) {
            this.method3(82);
        }
        ++field2324;
        this.field2316 = arg3;
    }
}
