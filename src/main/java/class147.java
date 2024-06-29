import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class147 extends class148 {

    @OriginalMember(owner = "client!v", name = "E", descriptor = "Lja;")
    private static class62 field3459 = class30.method243(43, "Loaded input handler");

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field3460 = 0;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field3454 = 20;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "Lja;")
    private static class62 field3455 = class30.method243(43, "Connection lost");

    @OriginalMember(owner = "client!v", name = "x", descriptor = "[[I")
    public static int[][] field3453 = new int[104][104];

    @OriginalMember(owner = "client!v", name = "L", descriptor = "[B")
    public static byte[] field3466 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field3473 = 0;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Lja;")
    public static class62 field3457 = field3455;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Lja;")
    private static class62 field3470 = class30.method243(43, "Please enter your username)3");

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Lja;")
    public static class62 field3474 = field3459;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Lja;")
    public static class62 field3478 = field3470;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "[I")
    public int[] field3461;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "[I")
    public int[] field3475;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
    public int[] field3477;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "[I")
    public static int[] field3479;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "[Lcf;")
    public class21[] field3462;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "[Lcf;")
    public class21[] field3467;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[[[B")
    public byte[][][] field3471;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public static void method1169(byte arg0) {
        field3466 = null;
        field3453 = null;
        field3478 = null;
        field3459 = null;
        field3479 = null;
        field3457 = null;
        if (arg0 == 35) {
            field3474 = null;
            field3455 = null;
            field3470 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static final void method1170(byte arg0) {
        field3469++;
        if (arg0 != 0) {
            return;
        }
        for (int var1 = 0; var1 < class34.field814; var1++) {
            int var2 = class38.field894[var1];
            class130 var3 = class136.field3127[var2];
            int var4 = class38.field879.method1025(255);
            if ((var4 & 0x20) != 0) {
                var3.field2966 = class105.method848(class38.field879.method1018((byte) 80), (byte) 21);
                var3.field190 = var3.field2966.field3214;
                var3.field167 = var3.field2966.field3207;
                var3.field153 = var3.field2966.field3188;
                var3.field152 = var3.field2966.field3173;
                var3.field154 = var3.field2966.field3190;
                var3.field151 = var3.field2966.field3181;
                var3.field163 = var3.field2966.field3213;
                var3.field178 = var3.field2966.field3186;
                var3.field149 = var3.field2966.field3178;
            }
            if ((var4 & 0x80) != 0) {
                var3.field172 = class38.field879.method1022((byte) 82);
                if (var3.field172 == 65535) {
                    var3.field172 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class38.field879.method995(-83);
                int var6 = class38.field879.method1025(255);
                var3.method62(var5, 32, class86.field2060, var6);
                var3.field142 = class86.field2060 + 300;
                var3.field182 = class38.field879.method1023((byte) 113);
                var3.field162 = class38.field879.method995(-62);
            }
            if ((var4 & 0x2) != 0) {
                int var7 = class38.field879.method1004(-101981656);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class38.field879.method989(true);
                if (var3.field177 == var7 && var7 != -1) {
                    int var9 = class141.method1121(var7, -24732).field272;
                    if (var9 == 1) {
                        var3.field169 = 0;
                        var3.field176 = 0;
                        var3.field139 = 0;
                        var3.field155 = var8;
                    }
                    if (var9 == 2) {
                        var3.field176 = 0;
                    }
                } else if (var7 == -1 || var3.field177 == -1 || class141.method1121(var7, -24732).field261 >= class141.method1121(var3.field177, -24732).field261) {
                    var3.field169 = 0;
                    var3.field176 = 0;
                    var3.field185 = var3.field156;
                    var3.field155 = var8;
                    var3.field177 = var7;
                    var3.field139 = 0;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field157 = class38.field879.method1015((byte) -86);
                var3.field170 = 100;
            }
            if ((var4 & 0x4) != 0) {
                int var10 = class38.field879.method1025(255);
                int var11 = class38.field879.method1025(255);
                var3.method62(var10, -108, class86.field2060, var11);
                var3.field142 = class86.field2060 + 300;
                var3.field182 = class38.field879.method1025(255);
                var3.field162 = class38.field879.method1023((byte) 108);
            }
            if ((var4 & 0x10) != 0) {
                var3.field186 = class38.field879.method1041(212464720);
                var3.field133 = class38.field879.method1004(-101981656);
            }
            if ((var4 & 0x40) != 0) {
                var3.field195 = class38.field879.method1018((byte) 80);
                int var12 = class38.field879.method996(arg0 ^ 0x3B92);
                var3.field196 = var12 >> 16;
                if (var3.field195 == 65535) {
                    var3.field195 = -1;
                }
                var3.field198 = 0;
                var3.field159 = class86.field2060 + (var12 & 0xFFFF);
                var3.field184 = 0;
                if (var3.field159 > class86.field2060) {
                    var3.field184 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public static final void method1171(byte arg0) {
        field3468++;
        if (class144.field3361 && class53.field1221 != class155.field3598) {
            class36.method278(class40.field936.field193[0], class155.field3598, class80.field1936, class40.field936.field144[0], class28.field694, -32537);
            return;
        }
        if (class155.field3598 != class12.field298) {
            class12.field298 = class155.field3598;
            class35.method268(class155.field3598, 20);
        }
        if (arg0 != 55) {
            method1170((byte) -93);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static final void method1172(boolean arg0) {
        if (class126.field2840 != null) {
            class126.field2840.method978(66);
        }
        field3476++;
        if (!arg0) {
            field3470 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V")
    public static final void method1173(byte arg0) {
        if (class82.field1980 != null) {
            class82.field1980.method394(false);
        }
        field3456++;
        if (class85.field2036 != null) {
            class85.field2036.method394(false);
        }
        if (arg0 != 10) {
            method1171((byte) -7);
        }
    }
}
