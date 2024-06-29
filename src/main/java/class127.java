import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class127 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    private int field2213 = 0;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lbg;")
    private class237 field2214;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[Lgj;")
    public static class236[] field2216 = new class236[28];

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "J")
    public static long field2217 = 0L;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Z")
    public static boolean field2222 = false;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lhk;")
    private class125 field2209;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Ltg;")
    public static class182 field2215;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lvd;")
    public static class4 field2207;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lue;")
    public static class88 field2206;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    public static int[] field2208;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public static final void method838(int arg0, int arg1) {
        class153.method1018((byte) -128);
        class237.method1548((byte) 26);
        if (arg1 > -32) {
            method838(59, -94);
        }
        field2221++;
        int var2 = class199.method1340(-116, arg0).field1199;
        if (var2 == 0) {
            return;
        }
        int var3 = class43.field733[arg0];
        if (var2 == 6) {
            class229.field3953 = var3;
        }
        if (var2 == 5) {
            class143.field2522 = var3;
        }
        if (var2 == 9) {
            class54.field892 = var3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method839(int arg0) {
        field2205++;
        int var1 = class129.field2252.method975(8, true);
        if (arg0 < 78) {
            field2219 = -45;
        }
        if (class190.field3342 > var1) {
            for (int var2 = var1; var2 < class190.field3342; var2++) {
                class100.field1715[client.field2779++] = class105.field1765[var2];
            }
        }
        if (class190.field3342 < var1) {
            throw new RuntimeException("gppov1");
        }
        class190.field3342 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class105.field1765[var3];
            class183 var5 = class259.field4515[var4];
            int var6 = class129.field2252.method975(1, true);
            if (var6 == 0) {
                class105.field1765[class190.field3342++] = var4;
                var5.field1274 = class56.field926;
            } else {
                int var7 = class129.field2252.method975(2, true);
                if (var7 == 0) {
                    class105.field1765[class190.field3342++] = var4;
                    var5.field1274 = class56.field926;
                    class25.field438[class64.field1078++] = var4;
                } else if (var7 == 1) {
                    class105.field1765[class190.field3342++] = var4;
                    var5.field1274 = class56.field926;
                    int var8 = class129.field2252.method975(3, true);
                    var5.method523(var8, false, (byte) -87);
                    int var9 = class129.field2252.method975(1, true);
                    if (var9 == 1) {
                        class25.field438[class64.field1078++] = var4;
                    }
                } else if (var7 == 2) {
                    class105.field1765[class190.field3342++] = var4;
                    var5.field1274 = class56.field926;
                    int var10 = class129.field2252.method975(3, true);
                    var5.method523(var10, true, (byte) -102);
                    int var11 = class129.field2252.method975(3, true);
                    var5.method523(var11, true, (byte) -111);
                    int var12 = class129.field2252.method975(1, true);
                    if (var12 == 1) {
                        class25.field438[class64.field1078++] = var4;
                    }
                } else if (var7 == 3) {
                    class100.field1715[client.field2779++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BIIZI[Lob;)V")
    public static final void method840(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, class131[] arg5) {
        class261 var6 = new class261(arg0);
        field2218++;
        if (arg4 != 0) {
            method842((byte) 62, -7, 22);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1721(false);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1742(arg4 - 957401312);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFD2) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method1693((byte) -83);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg2 + var12;
                int var18 = arg1 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class131 var19 = null;
                    if (!arg3) {
                        int var20 = var13;
                        if ((class230.field3973[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class183.method1255(var18, var15, var17, var16, var7, var19, !arg3, arg3, var13, arg4 ^ 0x76, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method841(int arg0) {
        field2206 = null;
        field2216 = null;
        field2215 = null;
        field2207 = null;
        field2208 = null;
        if (arg0 != 0) {
            field2215 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)Ltf;")
    public static final class107 method842(byte arg0, int arg1, int arg2) {
        class107 var3 = class22.method131(arg2, 1538872048);
        if (arg0 != -48) {
            method842((byte) 73, -52, -42);
        }
        field2220++;
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field1837 == null || var3.field1837.length <= arg1) {
            return null;
        } else {
            return var3.field1837[arg1];
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method843(byte arg0) {
        field2212++;
        int var1 = class79.field1399 + class168.field3006.field1325;
        int var2 = class229.field3963 + class168.field3006.field1301;
        if (class53.field875 - var1 < -500 || (class53.field875 - var1) > 500 || (class221.field3843 - var2) < -500 || class221.field3843 - var2 > 500) {
            class221.field3843 = var2;
            class53.field875 = var1;
        }
        if (class221.field3843 != var2) {
            class221.field3843 += (var2 - class221.field3843) / 16;
        }
        if (class53.field875 != var1) {
            class53.field875 += (var1 - class53.field875) / 16;
        }
        if (arg0 <= 43) {
            field2215 = null;
        }
        if (class3.field34) {
            for (int var3 = 0; var3 < class124.field2176; var3++) {
                int var4 = class180.field3131[var3];
                if (var4 == 98) {
                    class160.field2843 = class160.field2843 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class160.field2843 = class160.field2843 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class239.field4129 = class239.field4129 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class239.field4129 = class239.field4129 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class51.field839[98]) {
                class32.field567 += (12 - class32.field567) / 2;
            } else if (class51.field839[99]) {
                class32.field567 += (-class32.field567 - 12) / 2;
            } else {
                class32.field567 /= 2;
            }
            class160.field2843 += class32.field567 / 2;
            if (class51.field839[96]) {
                class41.field703 += (-class41.field703 - 24) / 2;
            } else if (class51.field839[97]) {
                class41.field703 += (24 - class41.field703) / 2;
            } else {
                class41.field703 /= 2;
            }
            class239.field4129 += class41.field703 / 2;
        }
        class278.method1833(78);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lhk;")
    public final class125 method844(byte arg0) {
        field2211++;
        if (this.field2213 > 0 && this.field2214.field4091[this.field2213 - 1] != this.field2209) {
            class125 var2 = this.field2209;
            this.field2209 = var2.field2184;
            return var2;
        } else if (arg0 == 45) {
            while (this.field2213 < this.field2214.field4104) {
                class125 var3 = this.field2214.field4091[this.field2213++].field2184;
                if (this.field2214.field4091[this.field2213 - 1] != var3) {
                    this.field2209 = var3.field2184;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Lhk;")
    public final class125 method845(int arg0) {
        this.field2213 = 0;
        field2223++;
        if (arg0 < 88) {
            method842((byte) 79, 38, -44);
        }
        return this.method844((byte) 45);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lbg;)V")
    public class127(class237 arg0) {
        this.field2214 = arg0;
    }
}
