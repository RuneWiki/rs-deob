import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class98 {

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    private int field1445 = -1;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "Z")
    public boolean field1451 = true;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "Lvo;")
    private class44 field1454;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Lgca;")
    private class261 field1444;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "Llp;")
    private class414 field1450;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "Lah;")
    private class406 field1453;

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1455 = new String[] { method942(method941("+~*r\u001d&r\"(\u001fg")), method942(method941("42er\\")), method942(method941("!i'0")), method942(method941("+~*rcg")), method942(method941("+~*r`g")), method942(method941("+~*reg")), method942(method941("+~*rbg")) };

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "[I")
    public static int[] field1447 = new int[1000];

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "[[I")
    public static int[][] field1452 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLlp;I)V", line = 8)
    public final void method937(byte arg0, class414 arg1, int arg2) {
        try {
            if (arg0 != -21) {
                field1437 = -121;
            }
            field1443++;
            if (arg2 > 0) {
                this.method939((byte) -16);
                this.field1444.method2233((byte) -54, this.field1453);
                this.field1444.method1064(this.field1440 + 1 - this.field1438, this.field1438, (byte) -33, 0, class356.field5727, arg1, arg2);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1455[5] + arg0 + ',' + (arg1 == null ? field1455[2] : field1455[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V", line = 34)
    public static void method938(byte arg0) {
        try {
            int var1 = -53 / ((arg0 - 82) / 35);
            field1452 = null;
            field1447 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1455[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lgca;Lvo;Lkb;IIIII)V", line = 243)
    public class98(class261 arg0, class44 arg1, class721 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field1454 = arg1;
            this.field1444 = arg0;
            this.field1439 = arg7;
            this.field1449 = arg6;
            int var9 = 0x1 << arg5;
            int var10 = 0;
            int var11 = arg3 << arg5;
            int var12 = arg4 << arg5;
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = (var12 + var13) * arg2.field4704 + var11;
                for (int var15 = 0; var15 < var9; var15++) {
                    short[] var16 = arg2.field10553[var14++];
                    if (var16 != null) {
                        var10 += var16.length;
                    }
                }
            }
            if (var10 <= 0) {
                this.field1453 = null;
                this.field1442 = 0;
            } else {
                this.field1438 = Integer.MAX_VALUE;
                this.field1440 = Integer.MIN_VALUE;
                this.field1450 = this.field1444.method1077(-7930, false);
                this.field1450.method980(var10, false);
                for (int var17 = 0; var17 < 4; var17++) {
                    Buffer var18 = this.field1450.method3305(76, true);
                    if (var18 != null) {
                        Stream var19 = this.field1444.method2227(var18, (byte) 110);
                        if (Stream.method5108()) {
                            for (int var26 = 0; var26 < var9; var26++) {
                                int var27 = (var12 + var26) * arg2.field4704 + var11;
                                for (int var28 = 0; var28 < var9; var28++) {
                                    short[] var29 = arg2.field10553[var27++];
                                    if (var29 != null) {
                                        for (int var30 = 0; var30 < var29.length; var30++) {
                                            int var31 = var29[var30] & 0xFFFF;
                                            if (var31 > this.field1440) {
                                                this.field1440 = var31;
                                            }
                                            if (this.field1438 > var31) {
                                                this.field1438 = var31;
                                            }
                                            var19.method5104(var31);
                                        }
                                    }
                                }
                            }
                        } else {
                            for (int var20 = 0; var20 < var9; var20++) {
                                int var21 = (var12 + var20) * arg2.field4704 + var11;
                                for (int var22 = 0; var22 < var9; var22++) {
                                    short[] var23 = arg2.field10553[var21++];
                                    if (var23 != null) {
                                        for (int var24 = 0; var24 < var23.length; var24++) {
                                            int var25 = var23[var24] & 0xFFFF;
                                            if (this.field1440 < var25) {
                                                this.field1440 = var25;
                                            }
                                            if (this.field1438 > var25) {
                                                this.field1438 = var25;
                                            }
                                            var19.method5101(var25);
                                        }
                                    }
                                }
                            }
                        }
                        var19.method5097();
                        if (this.field1450.method3307(124)) {
                            break;
                        }
                    }
                }
                this.field1442 = var10 / 3;
            }
        } catch (RuntimeException var33) {
            throw class590.method4333(var33, field1455[0] + (arg0 == null ? field1455[2] : field1455[1]) + ',' + (arg1 == null ? field1455[2] : field1455[1]) + ',' + (arg2 == null ? field1455[2] : field1455[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V", line = 50)
    private final void method939(byte arg0) {
        try {
            field1446++;
            if (this.field1451) {
                this.field1451 = false;
                byte[] var2 = this.field1454.field491;
                if (arg0 > -8) {
                    field1452 = null;
                }
                int var3 = 0;
                int var4 = this.field1454.field488;
                int var5 = this.field1454.field488 * this.field1439 + this.field1449;
                for (int var6 = -128; var6 < 0; var6++) {
                    var3 = (var3 << 8) - var3;
                    for (int var7 = -128; var7 < 0; var7++) {
                        if (var2[var5++] != 0) {
                            var3++;
                        }
                    }
                    var5 += var4 - 128;
                }
                if (this.field1453 != null && this.field1445 == var3) {
                    this.field1451 = false;
                } else {
                    this.field1445 = var3;
                    int var8 = 0;
                    int var9 = this.field1439 * var4 + this.field1449;
                    if (this.field1444.method1058(6, class544.field8004, class335.field5466)) {
                        if (class438.field6843 == null) {
                            class438.field6843 = new byte[16384];
                        }
                        byte[] var14 = class438.field6843;
                        for (int var15 = -128; var15 < 0; var15++) {
                            for (int var16 = -128; var16 < 0; var16++) {
                                if (var2[var9] == 0) {
                                    int var17 = 0;
                                    if (var2[var9 - 1] != 0) {
                                        var17++;
                                    }
                                    if (var2[var9 + 1] != 0) {
                                        var17++;
                                    }
                                    if (var2[var9 - var4] != 0) {
                                        var17++;
                                    }
                                    if (var2[var4 + var9] != 0) {
                                        var17++;
                                    }
                                    var14[var8++] = (byte) (var17 * 17);
                                } else {
                                    var14[var8++] = 68;
                                }
                                var9++;
                            }
                            var9 += this.field1454.field488 - 128;
                        }
                        if (this.field1453 == null) {
                            this.field1453 = this.field1444.method2246(class438.field6843, 128, class335.field5466, 128, -118, false);
                            this.field1453.method3166(false, 8095, false);
                        } else {
                            this.field1453.method3171(0, 128, 128, class335.field5466, 27989, 0, class438.field6843, 128, 0);
                        }
                    } else {
                        if (class647.field9283 == null) {
                            class647.field9283 = new int[16384];
                        }
                        int[] var10 = class647.field9283;
                        for (int var11 = -128; var11 < 0; var11++) {
                            for (int var12 = -128; var12 < 0; var12++) {
                                if (var2[var9] == 0) {
                                    int var13 = 0;
                                    if (var2[var9 - 1] != 0) {
                                        var13++;
                                    }
                                    if (var2[var9 + 1] != 0) {
                                        var13++;
                                    }
                                    if (var2[var9 - var4] != 0) {
                                        var13++;
                                    }
                                    if (var2[var4 + var9] != 0) {
                                        var13++;
                                    }
                                    var10[var8++] = var13 * 17 << 24;
                                } else {
                                    var10[var8++] = 1140850688;
                                }
                                var9++;
                            }
                            var9 += this.field1454.field488 - 128;
                        }
                        if (this.field1453 == null) {
                            this.field1453 = this.field1444.method2206(1826, false, 128, class647.field9283, 128);
                            this.field1453.method3166(false, 8095, false);
                        } else {
                            this.field1453.method3169(0, 0, 128, class647.field9283, 128, (byte) -23, 128, 0);
                        }
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field1455[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 225)
    public final void method940(int arg0) {
        try {
            this.method937((byte) -21, this.field1450, this.field1442);
            field1448++;
            if (arg0 != 0) {
                this.field1442 = 37;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1455[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method941(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method942(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
