import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class417 {

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "Z")
    public boolean field6167 = false;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public int field6157 = -1;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
    public boolean field6156 = false;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public int field6159 = 99;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public int field6162 = -1;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public int field6172 = 2;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public int field6170 = -1;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "Z")
    public boolean field6179 = false;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public int field6175 = -1;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public int field6166 = 5;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public int field6169 = -1;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "Z")
    public boolean field6184 = false;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field6163 = 0;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
    public static int field6178 = 0;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field6173 = 0;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field6181 = new String[100];

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public int field6153;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "[I")
    public int[] field6171;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "[I")
    private int[] field6174;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "[I")
    public int[] field6177;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "[Z")
    public boolean[] field6158;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "[[I")
    public int[][] field6155;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static final void method2602(int arg0) {
        class385[] var1 = class104.field1457;
        synchronized (class104.field1457) {
            if (arg0 != 2) {
                return;
            }
            int var2 = 0;
            while (true) {
                if (var2 >= class104.field1457.length) {
                    break;
                }
                class104.field1457[var2] = new class385();
                class51.field630[var2] = 0;
                var2++;
            }
        }
        field6183++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lmo;I)V")
    public static final void method2603(class447 arg0, int arg1) {
        class37.field470 = arg0;
        if (arg1 <= 3) {
            method2602(104);
        }
        field6180++;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public static void method2604(int arg0) {
        if (arg0 != 1550411184) {
            field6164 = 26;
        }
        field6181 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjg;)V")
    public final void method2605(byte arg0, class186 arg1) {
        if (arg0 > -29) {
            return;
        }
        field6154++;
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                return;
            }
            this.method2610(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZIII)I")
    public final int method2606(boolean arg0, int arg1, int arg2, int arg3) {
        field6176++;
        int var5 = 0;
        if (arg1 < 20) {
            method2607(-44);
        }
        int var6 = 0;
        int var7 = this.field6177[arg3];
        class209 var8 = null;
        class209 var9 = class452.method2825(var7 >> 16, -30741);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field6156 || class191.field3120) && arg2 != -1 && this.field6177.length > arg2) {
            int var11 = this.field6177[arg2];
            var8 = class452.method2825(var11 >> 16, -30741);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6179) {
            var5 |= 0x200;
        }
        if (var9.method1481(var10, 35)) {
            var5 |= 0x80;
        }
        if (var9.method1477(var10, 0)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method1481(var6, 35)) {
                var5 |= 0x80;
            }
            if (var8.method1477(var6, 0)) {
                var5 |= 0x100;
            }
        }
        if (this.field6174 != null && arg0) {
            if (this.field6174.length > arg3) {
                int var12 = this.field6174[arg3];
                if (var12 != 65535) {
                    class209 var13 = class452.method2825(var12 >> 16, -30741);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1481(var14, 35)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1477(var14, 0)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field6156 || class191.field3120) && arg2 != -1 && this.field6174.length > arg2) {
                int var15 = this.field6174[arg2];
                if (var15 != 65535) {
                    class209 var16 = class452.method2825(var15 >> 16, -30741);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1481(var17, 35)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1477(var17, 0)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)I")
    public static final int method2607(int arg0) {
        field6168++;
        if (arg0 >= -98) {
            method2611(-30);
        }
        if (class262.field4214 || class144.field2267 <= 0) {
            int var1 = class414.field6125;
            int var2 = class287.field4604;
            int var3 = class75.field949;
            int var4 = class27.field315;
            int var5 = class427.field6299;
            if (var3 < var1 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class144.field2267; var7++) {
                    if (class61.field786) {
                        int var12 = (class144.field2267 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > (var12 - 13) && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class144.field2267 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class388 var9 = new class388(class86.field1089);
                    for (class418 var10 = (class418) var9.method2458(true); var10 != null; var10 = (class418) var9.method2459(127)) {
                        if ((var8++) == var6) {
                            return var10.field6196;
                        }
                    }
                }
            }
            return -1;
        } else if (class183.field2983 && class232.field3856[81] && class144.field2267 > 2) {
            return ((class418) class86.field1089.field459.field2536.field2536).field6196;
        } else {
            return ((class418) class86.field1089.field459.field2536).field6196;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBIIILid;)Lid;")
    public final class348 method2608(int arg0, byte arg1, int arg2, int arg3, int arg4, class348 arg5) {
        field6161++;
        int var7 = this.field6171[arg2];
        int var8 = this.field6177[arg2];
        class209 var9 = class452.method2825(var8 >> 16, -30741);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method15((byte) 1, arg3, true);
        }
        class209 var11 = null;
        if ((this.field6156 || class191.field3120) && arg4 != -1 && this.field6177.length > arg4) {
            int var12 = this.field6177[arg4];
            var11 = class452.method2825(var12 >> 16, -30741);
            arg4 = var12 & 0xFFFF;
        }
        class209 var13 = null;
        class209 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field6174 != null) {
            if (arg2 < this.field6174.length) {
                var15 = this.field6174[arg2];
                if (var15 != 65535) {
                    var13 = class452.method2825(var15 >> 16, -30741);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6156 || class191.field3120) && arg4 != -1 && this.field6174.length > arg4) {
                var16 = this.field6174[arg4];
                if (var16 != 65535) {
                    var14 = class452.method2825(var16 >> 16, -30741);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (arg1 >= -108) {
            return null;
        }
        if (this.field6179) {
            arg3 |= 0x200;
        }
        if (var9.method1481(var10, 35)) {
            arg3 |= 0x80;
        }
        if (var9.method1477(var10, 0)) {
            arg3 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1481(var15, 35)) {
                arg3 |= 0x80;
            }
            if (var13.method1477(var15, 0)) {
                arg3 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method1481(arg4, 35)) {
                arg3 |= 0x80;
            }
            if (var11.method1477(arg4, 0)) {
                arg3 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method1481(var16, 35)) {
                arg3 |= 0x80;
            }
            if (var14.method1477(var16, 0)) {
                arg3 |= 0x100;
            }
        }
        int var17 = arg3 | 0x20;
        class348 var18 = arg5.method15((byte) 1, var17, true);
        var18.method2274(0, var9, var7, this.field6179, var11, (byte) -98, var10, arg4, arg0 - 1);
        if (var13 != null) {
            var18.method2274(0, var13, var7, this.field6179, var14, (byte) -101, var15, var16, arg0 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
    public final void method2609(int arg0) {
        if (this.field6175 == -1) {
            if (this.field6158 == null) {
                this.field6175 = 0;
            } else {
                this.field6175 = 2;
            }
        }
        field6160++;
        if (~this.field6170 != arg0) {
            return;
        }
        if (this.field6158 == null) {
            this.field6170 = 0;
        } else {
            this.field6170 = 2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljg;IZ)V")
    private final void method2610(class186 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field6181 = null;
        }
        if (arg1 == 1) {
            int var13 = arg0.method1272((byte) -108);
            this.field6171 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6171[var14] = arg0.method1272((byte) -80);
            }
            this.field6177 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field6177[var15] = arg0.method1272((byte) -45);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field6177[var16] += arg0.method1272((byte) -95) << 16;
            }
        } else if (arg1 == 2) {
            this.field6162 = arg0.method1272((byte) -100);
        } else if (arg1 == 3) {
            this.field6158 = new boolean[256];
            int var11 = arg0.method1322(!arg2);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field6158[arg0.method1322(false)] = true;
            }
        } else if (arg1 == 4) {
            this.field6167 = true;
        } else if (arg1 == 5) {
            this.field6166 = arg0.method1322(false);
        } else if (arg1 == 6) {
            this.field6169 = arg0.method1272((byte) -96);
        } else if (arg1 == 7) {
            this.field6157 = arg0.method1272((byte) -76);
        } else if (arg1 == 8) {
            this.field6159 = arg0.method1322(false);
        } else if (arg1 == 9) {
            this.field6175 = arg0.method1322(false);
        } else if (arg1 == 10) {
            this.field6170 = arg0.method1322(false);
        } else if (arg1 == 11) {
            this.field6172 = arg0.method1322(false);
        } else if (arg1 == 12) {
            int var8 = arg0.method1322(false);
            this.field6174 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6174[var9] = arg0.method1272((byte) -99);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field6174[var10] = (arg0.method1272((byte) -92) << 16) + this.field6174[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg0.method1272((byte) -121);
            this.field6155 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1322(false);
                if (var6 > 0) {
                    this.field6155[var5] = new int[var6];
                    this.field6155[var5][0] = arg0.method1275(-1);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field6155[var5][var7] = arg0.method1272((byte) -79);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field6179 = true;
        } else if (arg1 == 15) {
            this.field6156 = true;
        } else if (arg1 == 16) {
            this.field6184 = true;
        }
        field6182++;
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V")
    public static final void method2611(int arg0) {
        if (arg0 != -1) {
            field6163 = 99;
        }
        field6185++;
        if (class433.field6389 != null) {
            class74 var1 = class433.field6389;
            synchronized (class433.field6389) {
                class433.field6389 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBIIILid;II)Lid;")
    public final class348 method2612(int arg0, byte arg1, int arg2, int arg3, int arg4, class348 arg5, int arg6, int arg7) {
        field6165++;
        int var9 = this.field6171[arg4];
        int var10 = this.field6177[arg4];
        class209 var11 = class452.method2825(var10 >> 16, -30741);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method15((byte) 1, arg2, true);
        }
        class209 var13 = null;
        if ((this.field6156 || class191.field3120) && arg3 != -1 && this.field6177.length > arg3) {
            int var14 = this.field6177[arg3];
            var13 = class452.method2825(var14 >> 16, -30741);
            arg3 = var14 & 0xFFFF;
        }
        if (this.field6179) {
            arg2 |= 0x200;
        }
        if (var11.method1481(var12, 35)) {
            arg2 |= 0x80;
        }
        if (var11.method1477(var12, arg7 - 128)) {
            arg2 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1481(arg3, 35)) {
                arg2 |= 0x80;
            }
            if (var13.method1477(arg3, arg7 ^ 0x80)) {
                arg2 |= 0x100;
            }
        }
        int var15 = arg2 | 0x20;
        if (arg7 != 128) {
            method2611(-123);
        }
        class348 var16 = arg5.method15(arg1, var15, true);
        var16.method2274(arg6, var11, var9, this.field6179, var13, (byte) -97, var12, arg3, arg0 - 1);
        return var16;
    }
}
