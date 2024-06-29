import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class133 {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lcf;")
    public static class93 field2336 = class147.method1066("::clientdrop", -48);

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field2340 = 0;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "[[B")
    public static byte[][] field2339 = new byte[50][];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method968(int arg0) {
        class77.field1443.method300(0);
        class151.field2644.method300(arg0 ^ arg0);
        field2333++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method969(byte arg0) {
        field2334++;
        class63.field1128.method294(0);
        int var1 = 65 % ((arg0 - 83) / 40);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILlh;ZLjava/awt/Component;)Lfe;")
    public static final class253 method970(int arg0, int arg1, class286 arg2, boolean arg3, Component arg4) {
        field2338++;
        if (class140.field2443 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class253 var5 = (class253) Class.forName("la").getDeclaredConstructor().newInstance();
                var5.field4571 = new int[(class204.field3687 ? 2 : 1) * 256];
                var5.field4578 = arg1;
                var5.method705(arg4);
                var5.field4576 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field4576 > 16384) {
                    var5.field4576 = 16384;
                }
                var5.method701(var5.field4576);
                if (class267.field4751 > 0 && class267.field4748 == null) {
                    class267.field4748 = new class230();
                    class267.field4748.field4119 = arg2;
                    arg2.method1960(class267.field4751, class267.field4748, (byte) -38);
                }
                if (class267.field4748 != null) {
                    if (class267.field4748.field4121[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class267.field4748.field4121[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (arg3) {
                        method968(-68);
                    }
                    class281 var6 = new class281(arg2, arg0);
                    var6.field4578 = arg1;
                    var6.field4571 = new int[(class204.field3687 ? 2 : 1) * 256];
                    var6.method705(arg4);
                    var6.field4576 = 16384;
                    var6.method701(var6.field4576);
                    if (class267.field4751 > 0 && class267.field4748 == null) {
                        class267.field4748 = new class230();
                        class267.field4748.field4119 = arg2;
                        arg2.method1960(class267.field4751, class267.field4748, (byte) -126);
                    }
                    if (class267.field4748 != null) {
                        if (class267.field4748.field4121[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class267.field4748.field4121[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class253();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILcf;)V")
    public static final void method971(int arg0, int arg1, class93 arg2) {
        field2342++;
        class212 var3 = class123.method905(-1205364448, arg1, arg0);
        var3.method1493(13);
        var3.field3895 = arg2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Z")
    public static final boolean method972(byte arg0, int arg1) {
        field2337++;
        int var2 = -9 / ((arg0 + 19) / 34);
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIZI)V")
    public static final void method973(boolean arg0, int arg1, boolean arg2, int arg3) {
        int var10002;
        for (int var4 = 0; var4 < class72.field1299; var4++) {
            class227 var21 = class155.field2709[class58.field995[var4]];
            if (var21 != null && var21.method1478((byte) 69) && var21.field4062.method1050((byte) -116)) {
                int var22 = var21.method1475(false);
                if (arg0) {
                    if (!var21.field4062.field2559) {
                        continue;
                    }
                } else if (arg2 != var21.field4062.field2511 || arg3 != 0 && arg3 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field3868 & 0x7F) == 64 && (var21.field3784 & 0x7F) == 64) {
                        int var23 = var21.field3784 >> 7;
                        int var24 = var21.field3868 >> 7;
                        if (var24 >= 0 && var24 < 104 && var23 >= 0 && var23 < 104) {
                            var10002 = class104.field1804[var24][var23]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field3868 & 0x7F) == 0 && (var21.field3784 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field3868 & 0x7F) == 64 && (var21.field3784 & 0x7F) == 64)) {
                    int var25 = var21.field3868 - (var22 * 64) >> 7;
                    int var26 = var21.field3784 - (var22 * 64) >> 7;
                    int var27 = var25 + var21.method1475(false);
                    int var28 = var21.method1475(false) + var26;
                    if (var27 > 104) {
                        var27 = 104;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    if (var28 > 104) {
                        var28 = 104;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    for (int var29 = var25; var29 < var27; var29++) {
                        for (int var30 = var26; var30 < var28; var30++) {
                            var10002 = class104.field1804[var29][var30]++;
                        }
                    }
                }
            }
        }
        if (arg1 >= -51) {
            method972((byte) -100, 109);
        }
        field2341++;
        label205: for (int var5 = 0; var5 < class72.field1299; var5++) {
            long var6 = (long) class58.field995[var5] << 32 | 0x20000000L;
            class227 var8 = class155.field2709[class58.field995[var5]];
            if (var8 != null && var8.method1478((byte) -107) && var8.field4062.method1050((byte) -45)) {
                int var9 = var8.method1475(false);
                if (arg0) {
                    if (!var8.field4062.field2559) {
                        continue;
                    }
                } else if (var8.field4062.field2511 != arg2 || arg3 != 0 && arg3 != var9) {
                    continue;
                }
                var8.field3801 = true;
                if (var9 == 1) {
                    if ((var8.field3868 & 0x7F) == 64 && (var8.field3784 & 0x7F) == 64) {
                        int var19 = var8.field3784 >> 7;
                        int var20 = var8.field3868 >> 7;
                        if (var20 < 0 || var20 >= 104 || var19 < 0 || var19 >= 104) {
                            continue;
                        }
                        if (class104.field1804[var20][var19] > 1) {
                            var10002 = class104.field1804[var20][var19]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var8.field3868 & 0x7F) == 0 && (var8.field3784 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var8.field3868 & 0x7F) == 64 && (var8.field3784 & 0x7F) == 64) {
                    int var10 = var8.field3868 - (var9 * 64) >> 7;
                    int var11 = var8.field3784 - (var9 * 64) >> 7;
                    int var12 = var9 + var11;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    int var13 = var10 + var9;
                    boolean var14 = true;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    for (int var15 = var10; var15 < var13; var15++) {
                        for (int var18 = var11; var18 < var12; var18++) {
                            if (class104.field1804[var15][var18] <= 1) {
                                var14 = false;
                                break;
                            }
                        }
                    }
                    if (var14) {
                        int var16 = var10;
                        while (true) {
                            if (var16 >= var13) {
                                continue label205;
                            }
                            for (int var17 = var11; var17 < var12; var17++) {
                                var10002 = class104.field1804[var16][var17]--;
                            }
                            var16++;
                        }
                    }
                }
                var8.field3801 = false;
                if (!var8.field4062.field2554) {
                    var6 |= Long.MIN_VALUE;
                }
                var8.field3859 = class13.method56(var8.field3784, var8.field3868, (byte) 121, class138.field2405);
                class280.method1901(class138.field2405, var8.field3868, var8.field3784, var8.field3859, var9 * 64 + 60 - 64, var8, var8.field3807, var6, var8.field3795);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method974(boolean arg0) {
        if (!arg0) {
            field2336 = null;
        }
        field2336 = null;
        field2339 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)I")
    public static final int method975(byte arg0, int arg1, int arg2) {
        if (arg0 < 3) {
            field2336 = null;
        }
        field2332++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7F95630) >> 19;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILhg;Lhg;)V")
    public static final void method976(int arg0, class177 arg1, class177 arg2) {
        class63.field1149 = class33.method196(0, arg1, class288.field5144, arg2, (byte) -107);
        field2330++;
        if (arg0 != 13572) {
            field2340 = 46;
        }
        class266.field4736 = (class221) class63.field1149;
        class140.field2436 = class33.method196(0, arg1, class280.field5055, arg2, (byte) 62);
        class183.field3383 = class33.method196(0, arg1, class172.field3018, arg2, (byte) -121);
    }
}
