import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class718 extends class568 {

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    public int field10500 = 0;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "Lkb;")
    private class721 field10509;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    public int field10503;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
    public int field10507;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
    public int field10506;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "[I")
    private int[] field10499;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "F")
    public float field10510;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "Lgca;")
    private class261 field10511;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public int field10495;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field10514 = new String[] { method5221(method5220("h\u0007L$b")), method5221(method5220("h\u0007L!b")), method5221(method5220("h\u0007L b")), method5221(method5220("h\u0007L%b")), method5221(method5220("d\u0001\u000e\u000f")), method5221(method5220("qZLM7")), method5221(method5220("h\u0007L\"b")), method5221(method5220("h\u0007L&b")), method5221(method5220("h\u0007L'b")), method5221(method5220("h\u0007L+b")), method5221(method5220("h\u0007L_#d\u001d\u0016]b")) };

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    public static int field10496;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    public static int field10497;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public static int field10498;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field10501;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
    public static int field10512;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "Lfk;")
    private class682 field10504;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "Ljaclib/memory/Stream;")
    private Stream field10505;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field10502;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[II)V")
    public final void method5211(int arg0, int[] arg1, int arg2) {
        try {
            field10498++;
            class414 var4 = this.field10511.method2276(-100, this.field10500 * 3);
            Buffer var5 = var4.method3305(-124, true);
            if (var5 != null) {
                Stream var6 = this.field10511.method2227(var5, (byte) 73);
                int var7 = 0;
                if (arg0 != -4687) {
                    this.field10511 = null;
                }
                int var8 = 32767;
                int var9 = -32768;
                if (Stream.method5108()) {
                    label120: for (int var18 = 0; var18 < arg2; var18++) {
                        int var19 = arg1[var18];
                        int var20 = this.field10499[var19];
                        short[] var21 = this.field10509.field10553[var19];
                        if (var20 != 0 && var21 != null) {
                            int var22 = 0;
                            int var23 = 0;
                            while (true) {
                                while (true) {
                                    if (var23 >= var21.length) {
                                        continue label120;
                                    }
                                    if ((var20 & 0x1 << var22++) == 0) {
                                        var23 += 3;
                                    } else {
                                        for (int var24 = 0; var24 < 3; var24++) {
                                            int var25 = var21[var23++] & 0xFFFF;
                                            var6.method5104(var25);
                                            if (var8 > var25) {
                                                var8 = var25;
                                            }
                                            if (var25 > var9) {
                                                var9 = var25;
                                            }
                                        }
                                        var7++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    label146: for (int var10 = 0; var10 < arg2; var10++) {
                        int var11 = arg1[var10];
                        int var12 = this.field10499[var11];
                        short[] var13 = this.field10509.field10553[var11];
                        if (var12 != 0 && var13 != null) {
                            int var14 = 0;
                            int var15 = 0;
                            while (true) {
                                while (true) {
                                    if (var15 >= var13.length) {
                                        continue label146;
                                    }
                                    if ((0x1 << var14++ & var12) == 0) {
                                        var15 += 3;
                                    } else {
                                        for (int var16 = 0; var16 < 3; var16++) {
                                            int var17 = var13[var15++] & 0xFFFF;
                                            if (var9 < var17) {
                                                var9 = var17;
                                            }
                                            var6.method5101(var17);
                                            if (var17 < var8) {
                                                var8 = var17;
                                            }
                                        }
                                        var7++;
                                    }
                                }
                            }
                        }
                    }
                }
                var6.method5097();
                if (var4.method3307(114) && var7 > 0) {
                    this.field10511.method2263((this.field10509.field10562 & 0x8) != 0, this.field10495, (byte) 93, (this.field10509.field10562 & 0x7) != 0);
                    if (this.field10511.field4190) {
                        this.field10511.method214(Integer.MAX_VALUE, this.field10503, this.field10506, this.field10507);
                    }
                    class615 var26 = this.field10511.method2208((byte) -91);
                    var26.method4486(6, 1.0F / this.field10510, 1.0F / this.field10510, 1.0F);
                    this.field10511.method2252(class428.field6751, true);
                    this.field10511.method1036(this.field10504, 1, arg0 + 4689);
                    this.field10511.method1042((byte) 123, this.field10509.field10593);
                    this.field10511.method1064(var9 + 1 - var8, var8, (byte) -33, 0, class356.field5727, var4, var7);
                    this.field10511.method2238(arg0 ^ 0x6F58);
                }
            }
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field10514[3] + arg0 + ',' + (arg1 == null ? field10514[4] : field10514[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V")
    public final void method5212(byte arg0, int arg1) {
        try {
            this.field10502 = this.field10511.method2216(true, arg1 * 4, (byte) -85);
            field10501++;
            if (arg0 <= 100) {
                this.method5212((byte) -69, -12);
            }
            this.field10505 = new Stream(this.field10502, 0, arg1 * 4);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10514[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)V")
    public static final void method5213(int arg0, byte arg1, int arg2) {
        try {
            field10512++;
            if (arg1 >= 31) {
                class551 var3 = class380.method3113(-117, (long) arg2, 6);
                var3.method4086(-67);
                var3.field8076 = arg0;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10514[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(BI)V")
    public final void method5214(byte arg0, int arg1) {
        try {
            field10496++;
            this.field10505.method5097();
            this.field10504 = this.field10511.method1030(false, false);
            this.field10504.method3931(4, arg0 ^ 0x70, arg1 * 4, this.field10502);
            this.field10502 = null;
            if (arg0 == 72) {
                this.field10505 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10514[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method5215(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class690.field9955 = 0;
        class33.field391 = 0;
        class326.field5362++;
        if ((arg5 & 0x2) == 0) {
            for (class693 var8 = class42.field476[var7]; var8 != null; var8 = var8.field9987) {
                if (!class690.method5020(var8, arg0, arg1, arg2, arg3)) {
                    class580.method4257(var8);
                    if (var8.field9973 != -1) {
                        class651.field9327[class690.field9955++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class693 var9 = class50.field608[var7]; var9 != null; var9 = var9.field9987) {
                if (!class690.method5020(var9, arg0, arg1, arg2, arg3)) {
                    class580.method4257(var9);
                    if (var9.field9973 != -1) {
                        class360.field5810[class33.field391++] = var9;
                    }
                }
            }
            for (class693 var10 = class570.field8262[var7]; var10 != null; var10 = var10.field9987) {
                if (!class690.method5020(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method45(-32768)) {
                        class580.method4257(var10);
                        if (var10.field9973 != -1) {
                            class360.field5810[class33.field391++] = var10;
                        }
                    } else {
                        class580.method4257(var10);
                        if (var10.field9973 != -1) {
                            class651.field9327[class690.field9955++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class251.field3843; var11++) {
                    if (!class690.method5020(class213.field3363[var11], arg0, arg1, arg2, arg3)) {
                        class580.method4257(class213.field3363[var11]);
                        if (class213.field3363[var11].field9973 != -1) {
                            if (class213.field3363[var11].method45(-32768)) {
                                class360.field5810[class33.field391++] = class213.field3363[var11];
                            } else {
                                class651.field9327[class690.field9955++] = class213.field3363[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class690.field9955 > 0) {
            class67.method699(class651.field9327, 0, class690.field9955 - 1);
            for (int var12 = 0; var12 < class690.field9955; var12++) {
                class271.method2339(class651.field9327[var12], true, arg6);
            }
        }
        if (class787.field11502) {
            class120.field1734.method218(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class103.field1521; var13 < class612.field8806; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class441.field6890.length;
                    if (class441.field6890.length + class588.field8521 > class150.field2096) {
                        var23 -= class441.field6890.length + class588.field8521 - class150.field2096;
                    }
                    int var24 = class441.field6890[0].length;
                    if (class441.field6890[0].length + class764.field11207 > class117.field1705) {
                        var24 -= class441.field6890[0].length + class764.field11207 - class117.field1705;
                    }
                    boolean[][] var25 = class483.field7334;
                    if (class588.field8527) {
                        if (class9.field103) {
                            var25 = class245.field3795[var13];
                        }
                        for (int var26 = class751.field11057; var26 < var23; var26++) {
                            int var27 = class588.field8521 + var26 - class751.field11057;
                            for (int var28 = class697.field10044; var28 < var24; var28++) {
                                if (class441.field6890[var26][var28] && !class527.method3934(22, var27, var13, class764.field11207 + var28 - class697.field10044)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class9.field103) {
                        if (arg4 >= 0) {
                            class740.field10902[var13].method703(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class740.field10902[var13].method711(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class586.field8501; var29++) {
                            class764.field11209[var29].method1591(8, new class581(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class740.field10902[var13].method703(class54.field689, class316.field5137, class297.field4835, class483.field7334, true, arg4, arg5);
                    } else {
                        class740.field10902[var13].method711(class54.field689, class316.field5137, class297.field4835, class483.field7334, true, arg5);
                    }
                } else {
                    int var14 = class441.field6890.length;
                    if (class441.field6890.length + class588.field8521 > class150.field2096) {
                        var14 -= class441.field6890.length + class588.field8521 - class150.field2096;
                    }
                    int var15 = class441.field6890[0].length;
                    if (class441.field6890[0].length + class764.field11207 > class117.field1705) {
                        var15 -= class441.field6890[0].length + class764.field11207 - class117.field1705;
                    }
                    boolean[][] var16 = class483.field7334;
                    if (class588.field8527) {
                        if (class9.field103) {
                            var16 = class245.field3795[var13];
                        }
                        for (int var17 = class751.field11057; var17 < var14; var17++) {
                            int var18 = class588.field8521 + var17 - class751.field11057;
                            for (int var19 = class697.field10044; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class441.field6890[var17][var19]) {
                                    int var20 = class764.field11207 + var19 - class697.field10044;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class85.field1280[var21][var18][var20] != null && class85.field1280[var21][var18][var20].field4674 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class527.method3934(30, var18, var13, var20)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class9.field103) {
                        if (arg4 >= 0) {
                            class740.field10902[var13].method703(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class740.field10902[var13].method711(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class586.field8501; var22++) {
                            class764.field11209[var22].method1591(8, new class581(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class740.field10902[var13].method703(class54.field689, class316.field5137, class297.field4835, class483.field7334, false, arg4, arg5);
                    } else {
                        class740.field10902[var13].method711(class54.field689, class316.field5137, class297.field4835, class483.field7334, false, arg5);
                    }
                }
            }
        }
        if (class33.field391 > 0) {
            class674.method4876(class360.field5810, 0, class33.field391 - 1);
            for (int var30 = 0; var30 < class33.field391; var30++) {
                class271.method2339(class360.field5810[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIFI)V")
    public final void method5216(int arg0, int arg1, int arg2, float arg3, int arg4) {
        try {
            if (this.field10495 != -1) {
                class304 var6 = this.field10511.field864.method1419(this.field10495, -82);
                int var7 = var6.field4893 & 0xFF;
                if (var7 != 0 && var6.field4913 != 4) {
                    int var8;
                    if (arg4 < 0) {
                        var8 = 0;
                    } else if (arg4 <= 127) {
                        var8 = arg4 * 131586;
                    } else {
                        var8 = 16777215;
                    }
                    if (var7 == 256) {
                        arg1 = var8;
                    } else {
                        int var10 = 256 - var7;
                        arg1 = ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                    }
                }
                int var11 = var6.field4905 & 0xFF;
                if (var11 != 0) {
                    var11 += 256;
                    int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                    if (var12 > 65535) {
                        var12 = 65535;
                    }
                    int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                    if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = (arg1 & 0xFF) * var11;
                    if (var14 > 65535) {
                        var14 = 65535;
                    }
                    arg1 = (var14 >> 8) + (var12 << 8 & 0xFF00DA) + (var13 & 0xFF00);
                }
            }
            if (arg0 != -256) {
                this.field10499 = null;
            }
            field10497++;
            this.field10505.method5103(arg2 * 4);
            if (arg3 != 1.0F) {
                int var15 = (arg1 & 0xFFCD24) >> 16;
                int var16 = arg1 >> 8 & 0xFF;
                int var17 = arg1 & 0xFF;
                int var18 = (int) ((float) var15 * arg3);
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                int var19 = (int) ((float) var16 * arg3);
                int var20 = (int) ((float) var17 * arg3);
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 255) {
                    var19 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                arg1 = var18 << 16 | var19 << 8 | var20;
            }
            if (this.field10511.field4138 == 0) {
                this.field10505.method5105((byte) arg1);
                this.field10505.method5105((byte) (arg1 >> 8));
                this.field10505.method5105((byte) (arg1 >> 16));
            } else {
                this.field10505.method5105((byte) (arg1 >> 16));
                this.field10505.method5105((byte) (arg1 >> 8));
                this.field10505.method5105((byte) arg1);
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field10514[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)V")
    public static final void method5217(boolean arg0, int arg1) {
        try {
            if (!arg0) {
                method5217(false, -83);
            }
            field10508++;
            if (class516.field7614 == 0) {
                class350.field5661.method1118(arg1, true);
            } else {
                class32.field389 = arg1;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10514[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)V")
    public final void method5218(int arg0, byte arg1) {
        try {
            field10513++;
            this.field10505.method5103(arg0 * 4 + 3);
            this.field10505.method5105(-1);
            if (arg1 > -1) {
                method5217(false, -101);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10514[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lkb;IIIII)V")
    public class718(class721 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field10509 = arg0;
            this.field10503 = arg3;
            this.field10507 = arg5;
            this.field10506 = arg4;
            this.field10499 = new int[this.field10509.field4704 * this.field10509.field4697];
            this.field10510 = arg2;
            this.field10511 = this.field10509.field10569;
            this.field10495 = arg1;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10514[10] + (arg0 == null ? field10514[4] : field10514[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIII)V")
    public final void method5219(int arg0, int arg1, int arg2, int arg3) {
        try {
            field10494++;
            this.field10499[this.field10509.field4704 * arg2 + arg0] = class553.method4099(this.field10499[this.field10509.field4704 * arg2 + arg0], arg1 << arg3);
            this.field10500++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10514[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5220(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5221(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
