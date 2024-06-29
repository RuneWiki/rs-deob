import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class145 extends class124 {

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "Le;")
    public static class191 field2447 = class54.method368("gr-Un:", 2047);

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "[I")
    public static int[] field2446 = new int[32];

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "[I")
    public static int[] field2445 = new int[1000];

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "Le;")
    public static class191 field2454 = class54.method368("Spielwelt erstellt)3", 2047);

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "[Loe;")
    private class67[] field2451;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "[[[B")
    public static byte[][][] field2443;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        int[] var3 = super.field2064.method378(arg1, 0);
        ++field2452;
        if (arg0 <= 68) {
            this.method137(8, (byte) -81);
        }
        if (super.field2064.field1035) {
            this.method978(0, super.field2064.method376((byte) 125));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BILng;I)[Lmh;")
    public static final class232[] method977(byte arg0, int arg1, class121 arg2, int arg3) {
        ++field2450;
        if (arg0 != -57) {
            method980(-113L, (byte) 50);
        }
        return !class121.method796(true, arg3, arg1, arg2) ? null : class252.method1749(arg0 + 57);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[[I)V")
    private final void method978(int arg0, int[][] arg1) {
        ++field2455;
        int var3 = class87.field1423;
        int var4 = class64.field1132;
        class25.method179(10743, arg1);
        class100.method624((byte) -23, class8.field82, 0, arg0, class181.field3119);
        if (this.field2451 != null) {
            for (int var5 = 0; this.field2451.length > var5; ++var5) {
                class67 var6 = this.field2451[var5];
                int var7 = var6.field1172;
                int var8 = var6.field1165;
                if (var7 < 0) {
                    if (~var8 <= -1) {
                        var6.method446(var4, var3, (byte) -109);
                    }
                } else if (var8 >= 0) {
                    var6.method443(var3, (byte) -52, var4);
                } else {
                    var6.method441(32, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static void method979(boolean arg0) {
        field2447 = null;
        field2445 = null;
        field2454 = null;
        if (!arg0) {
            field2454 = null;
        }
        field2443 = null;
        field2446 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(JB)V")
    public static final void method980(long arg0, byte arg1) {
        ++field2448;
        if (~arg0 != -1L) {
            for (int var3 = 0; ~var3 > ~class270.field4759; ++var3) {
                if (class35.field643[var3] == arg0) {
                    --class270.field4759;
                    ++class166.field2808;
                    for (int var4 = var3; ~class270.field4759 < ~var4; ++var4) {
                        class252.field4466[var4] = class252.field4466[var4 + 1];
                        class206.field3650[var4] = class206.field3650[var4 - -1];
                        class209.field3702[var4] = class209.field3702[var4 - -1];
                        class35.field643[var4] = class35.field643[var4 + 1];
                        class33.field504[var4] = class33.field504[var4 + 1];
                        class42.field743[var4] = class42.field743[var4 + 1];
                    }
                    class21.field297 = class110.field1841;
                    class53.field963.method1096(253, 0);
                    class53.field963.method1589(arg0, false);
                    break;
                }
            }
            if (arg1 < 13) {
                method977((byte) -111, 2, (class121) null, 102);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2063 = ~arg1.method1580(-107) == -2;
            }
        } else {
            this.field2451 = new class67[arg1.method1580(-13)];
            for (int var4 = 0; var4 < this.field2451.length; ++var4) {
                int var5 = arg1.method1580(-51);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field2451[var4] = class126.method852(0, arg1);
                            }
                        } else {
                            this.field2451[var4] = class207.method1429(arg1, (byte) -27);
                        }
                    } else {
                        this.field2451[var4] = class225.method1595((byte) -115, arg1);
                    }
                } else {
                    this.field2451[var4] = class141.method930(591384455, arg1);
                }
            }
        }
        if (!arg2) {
            field2454 = null;
        }
        ++field2453;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field2449;
        if (arg1 != -7) {
            this.method131((byte) -102, 2);
        }
        int[][] var3 = super.field2053.method1775((byte) -99, arg0);
        if (super.field2053.field4558) {
            int var4 = class87.field1423;
            int var5 = class64.field1132;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = super.field2053.method1766(arg1 + -119);
            this.method978(0, var6);
            for (int var8 = 0; class87.field1423 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class64.field1132 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class167.method1128(var15, 255) << 4;
                    var12[var14] = class167.method1128(65280, var15) >> 4;
                    var11[var14] = class167.method1128(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }
}
