import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Ldd;")
    public static class26 field651 = new class26(64);

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field653 = 0;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Ldd;")
    public static class26 field654 = new class26(500);

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lrd;")
    public static class114 field656 = class84.method656("backleft1", (byte) 116);

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
    public static int[] field662 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field661 = -1;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[J")
    public static long[] field659 = new long[32];

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Lrd;")
    public static class114 field663 = class84.method656("Update)2Liste geladen)3", (byte) 114);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "J")
    public static long field655;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lff;")
    public static class42 field660;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/awt/Frame;")
    public static Frame field657;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method232(byte arg0) {
        field659 = null;
        field654 = null;
        field657 = null;
        if (arg0 > -28) {
            return;
        }
        field662 = null;
        field663 = null;
        field660 = null;
        field656 = null;
        field651 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lpb;Lpb;ILpb;)V")
    public static final void method233(class100 arg0, class100 arg1, int arg2, class100 arg3) {
        class111.field2580 = arg0;
        class123.field2874 = arg1;
        field650++;
        class31.field642 = arg3;
        class78.field1772 = new class90[class31.field642.method753((byte) -51)][];
        class74.field1713 = new boolean[class31.field642.method753((byte) -51)];
        if (arg2 != 0) {
            method236(108);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLpb;III)[B")
    public static final byte[] method234(byte arg0, class100 arg1, int arg2, int arg3, int arg4) {
        field645++;
        long var5 = ((long) arg4 << 32) + (long) (arg2 << 16) + (long) (arg2 * 37 - -arg3 & 0xFFFF);
        if (class46.field943 != null) {
            class106 var7 = (class106) class46.field943.method194((byte) -77, var5);
            if (var7 != null) {
                return var7.field2443;
            }
        }
        if (arg0 != -115) {
            return null;
        }
        byte[] var8 = arg1.method762(arg2, arg3, (byte) 66);
        if (var8 == null) {
            return null;
        } else {
            if (class46.field943 != null) {
                class46.field943.method193(-64, new class106(var8), var5);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method235(int arg0, int arg1, byte[] arg2, int arg3) {
        field652++;
        int var4 = 13 % ((-arg0 - 67) / 52);
        boolean var5 = true;
        int var6 = -1;
        class60 var7 = new class60(arg2);
        label52: while (true) {
            int var8 = var7.method469((byte) -61);
            if (var8 == 0) {
                return var5;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var7.method469((byte) -85);
                    if (var12 == 0) {
                        continue label52;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var7.method462((byte) 116) >> 2;
                    int var16 = arg1 + var14;
                    int var17 = arg3 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class12 var18 = class130.method1048(-110, var6);
                        if (var15 != 22 || !class64.field1370 || var18.field244 != 0 || var18.field238) {
                            var10 = true;
                            if (!var18.method90(28385)) {
                                class52.field1078++;
                                var5 = false;
                            }
                        }
                    }
                }
                int var11 = var7.method469((byte) -123);
                if (var11 == 0) {
                    break;
                }
                var7.method462((byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method236(int arg0) {
        if (arg0 > -120) {
            method233(null, null, -117, null);
        }
        field649++;
        for (class98 var1 = (class98) class72.field1598.method654((byte) 120); var1 != null; var1 = (class98) class72.field1598.method644((byte) -68)) {
            if (var1.field2230 > 0) {
                var1.field2230--;
            }
            if (var1.field2230 != 0) {
                if (var1.field2217 > 0) {
                    var1.field2217--;
                }
                if (var1.field2217 == 0 && var1.field2237 >= 1 && var1.field2225 >= 1 && var1.field2237 <= 102 && var1.field2225 <= 102 && (var1.field2236 < 0 || class82.method641(var1.field2238, -11090, var1.field2236))) {
                    class96.method736(var1.field2220, var1.field2228, var1.field2237, var1.field2238, var1.field2236, var1.field2233, 0, var1.field2225);
                    var1.field2217 = -1;
                    if (var1.field2239 == var1.field2236 && var1.field2239 == -1) {
                        var1.method540(-26669);
                    } else if (var1.field2239 == var1.field2236 && var1.field2228 == var1.field2222 && var1.field2238 == var1.field2231) {
                        var1.method540(-26669);
                    }
                }
            } else if (var1.field2239 < 0 || class82.method641(var1.field2231, -11090, var1.field2239)) {
                class96.method736(var1.field2220, var1.field2222, var1.field2237, var1.field2231, var1.field2239, var1.field2233, 0, var1.field2225);
                var1.method540(-26669);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    public static final void method237(int arg0, int arg1, int arg2) {
        field648++;
        class84 var3 = class77.field1767[class20.field346][arg0][arg2];
        if (var3 == null) {
            class101.field2325.method1002(class20.field346, arg0, arg2);
            return;
        }
        int var4 = 6 % ((-arg1 - 73) / 48);
        int var5 = -99999999;
        class96 var6 = null;
        for (class96 var7 = (class96) var3.method654((byte) 94); var7 != null; var7 = (class96) var3.method644((byte) -68)) {
            class52 var12 = class128.method988(var7.field2205, false);
            int var13 = var12.field1118;
            if (var12.field1074 == 1) {
                var13 = (var7.field2214 + 1) * var13;
            }
            if (var13 > var5) {
                var6 = var7;
                var5 = var13;
            }
        }
        if (var6 == null) {
            class101.field2325.method1002(class20.field346, arg0, arg2);
            return;
        }
        var3.method647(0, var6);
        class96 var8 = null;
        class96 var9 = (class96) var3.method654((byte) 56);
        class96 var10 = null;
        int var11 = (arg2 << 7) + arg0 + 1610612736;
        while (var9 != null) {
            if (var6.field2205 != var9.field2205) {
                if (var10 == null) {
                    var10 = var9;
                }
                if (var9.field2205 != var10.field2205 && var8 == null) {
                    var8 = var9;
                }
            }
            var9 = (class96) var3.method644((byte) -68);
        }
        class101.field2325.method1019(class20.field346, arg0, arg2, class137.method1110(class20.field346, arg0 * 128 + 64, arg2 * 128 - -64, (byte) 37), var6, var11, var10, var8);
    }
}
