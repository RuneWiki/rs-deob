import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class32 extends class96 {

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "[I")
    public static int[] field880 = new int[32];

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Lwb;")
    public static class130 field883 = null;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Lwb;")
    public static class130 field890;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Z")
    public static boolean field891;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "Lwb;")
    public static class130 field889;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "Lwb;")
    private static class130 field894;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "Lwb;")
    public static class130 field898;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lwb;")
    public class130 field879;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lda;")
    public static class20 field896;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Lda;")
    public static class20 field897;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Z")
    public static boolean field899;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "[Lqd;")
    public static class100[] field888;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field880[var1] = var0 - 1;
            var0 += var0;
        }
        field890 = class26.method212("null", -32376);
        field891 = false;
        field889 = class26.method212("RuneScape wird geladen )2 bitte warten)3)3)3", -32376);
        field893 = 0;
        field894 = class26.method212("Public chat", -32376);
        field892 = 2;
        field895 = 0;
        field898 = field894;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 3)
    public static void method252(int arg0) {
        if (arg0 >= -21) {
            method252(7);
        }
        field894 = null;
        field883 = null;
        field889 = null;
        field888 = null;
        field880 = null;
        field890 = null;
        field896 = null;
        field898 = null;
        field897 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lab;I)V", line = 39)
    public static final void method253(class3 arg0, int arg1) {
        field887++;
        int var2 = arg0.field111;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class42.field1183 == 0) {
                arg0.field147 = class113.field2797;
                arg0.field79 = 0;
            } else if (var2 == 1 && class42.field1183 == 1) {
                arg0.field79 = 0;
                arg0.field147 = class119.field2916;
            } else if (var2 == 2 && class42.field1183 != 2) {
                arg0.field79 = 0;
                arg0.field147 = class7.field248;
            } else {
                if (var2 <= 700) {
                    var2--;
                } else {
                    var2 -= 601;
                }
                int var3 = class35.field993;
                if (class42.field1183 != 2) {
                    var3 = 0;
                }
                if (var3 <= var2) {
                    arg0.field147 = class9.field295;
                    arg0.field79 = 0;
                } else {
                    arg0.field147 = class79.field1915[var2];
                    arg0.field79 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 <= 800) {
                var2 -= 101;
            } else {
                var2 -= 701;
            }
            int var4 = class35.field993;
            if (class42.field1183 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field79 = 0;
                arg0.field147 = class9.field295;
            } else {
                if (class14.field410[var2] == 0) {
                    arg0.field147 = class15.method114(new class130[] { class47.field1259, class59.field1510 }, -20349);
                } else if (class14.field410[var2] >= 5000) {
                    if (class14.field410[var2] == class47.field1258) {
                        arg0.field147 = class15.method114(new class130[] { class53.field1399, class33.field912, class109.method831(class14.field410[var2] - 5000, 10) }, -20349);
                    } else {
                        arg0.field147 = class15.method114(new class130[] { class115.field2836, class33.field912, class109.method831(class14.field410[var2] - 5000, 10) }, -20349);
                    }
                } else if (class14.field410[var2] == class47.field1258) {
                    arg0.field147 = class15.method114(new class130[] { class53.field1399, class4.field195, class109.method831(class14.field410[var2], 10) }, -20349);
                } else {
                    arg0.field147 = class15.method114(new class130[] { class115.field2836, class4.field195, class109.method831(class14.field410[var2], 10) }, -20349);
                }
                arg0.field79 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class35.field993;
            if (class42.field1183 != 2) {
                var5 = 0;
            }
            arg0.field70 = var5 * 15 + 20;
            if (arg0.field94 >= arg0.field70) {
                arg0.field70 = arg0.field94 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class42.field1183 == 0) {
                arg0.field79 = 0;
                arg0.field147 = class111.field2735;
            } else if (var2 == 1 && class42.field1183 == 0) {
                arg0.field79 = 0;
                arg0.field147 = class7.field248;
            } else {
                int var6 = class109.field2657;
                if (class42.field1183 == 0) {
                    var6 = 0;
                }
                if (var6 <= var2) {
                    arg0.field79 = 0;
                    arg0.field147 = class9.field295;
                } else {
                    arg0.field147 = class26.method213((byte) 103, class59.field1477[var2]).method985(-114);
                    arg0.field79 = 1;
                }
            }
        } else if (var2 == 503) {
            arg0.field70 = class109.field2657 * 15 + 20;
            if (arg0.field94 >= arg0.field70) {
                arg0.field70 = arg0.field94 + 1;
            }
        } else if (var2 == 324) {
            if (class83.field1961 == -1) {
                class83.field1961 = arg0.field101;
                class121.field2977 = arg0.field84;
            }
            if (class79.field1905.field2415) {
                arg0.field101 = class83.field1961;
            } else {
                arg0.field101 = class121.field2977;
            }
        } else if (var2 == 325) {
            if (class83.field1961 == -1) {
                class121.field2977 = arg0.field84;
                class83.field1961 = arg0.field101;
            }
            if (class79.field1905.field2415) {
                arg0.field101 = class121.field2977;
            } else {
                arg0.field101 = class83.field1961;
            }
        } else if (var2 == 327) {
            arg0.field133 = 150;
            arg0.field85 = (int) (Math.sin((double) class130.field3128 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field132 = 5;
            arg0.field69 = 0;
        } else if (var2 == 328) {
            arg0.field133 = 150;
            arg0.field85 = (int) (Math.sin((double) class130.field3128 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field132 = 5;
            arg0.field69 = 1;
        } else if (var2 == 600) {
            arg0.field147 = class15.method114(new class130[] { class9.field291, class120.field2941 }, -20349);
        } else {
            if (var2 == 620) {
                if (class21.field605 < 1) {
                    arg0.field147 = class9.field295;
                } else if (client.field539) {
                    arg0.field148 = 16711680;
                    arg0.field147 = class36.field1052;
                } else {
                    arg0.field147 = class37.field1093;
                    arg0.field148 = 16777215;
                }
            }
            if (arg1 <= 122) {
                field898 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([BB)V", line = 291)
    public static final void method254(byte[] arg0, byte arg1) {
        field881++;
        class36 var2 = new class36(arg0);
        var2.field1057 = arg0.length - 2;
        class93.field2254 = var2.method351((byte) -99);
        class119.field2920 = new byte[class93.field2254][];
        class31.field876 = new int[class93.field2254];
        class115.field2839 = new int[class93.field2254];
        class26.field758 = new int[class93.field2254];
        int var3 = 24 % ((arg1 + 89) / 36);
        client.field548 = new int[class93.field2254];
        var2.field1057 = arg0.length - class93.field2254 * 8 - 7;
        class106.field2580 = var2.method351((byte) -125);
        class97.field2352 = var2.method351((byte) -110);
        int var4 = (var2.method365((byte) -127) & 0xFF) + 1;
        for (int var5 = 0; var5 < class93.field2254; var5++) {
            class31.field876[var5] = var2.method351((byte) -114);
        }
        for (int var6 = 0; var6 < class93.field2254; var6++) {
            client.field548[var6] = var2.method351((byte) -125);
        }
        for (int var7 = 0; var7 < class93.field2254; var7++) {
            class115.field2839[var7] = var2.method351((byte) -105);
        }
        for (int var8 = 0; var8 < class93.field2254; var8++) {
            class26.field758[var8] = var2.method351((byte) -105);
        }
        var2.field1057 = arg0.length - (var4 - 1) * 3 - class93.field2254 * 8 - 7;
        class31.field869 = new int[var4];
        for (int var9 = 1; var9 < var4; var9++) {
            class31.field869[var9] = var2.method343((byte) 5);
            if (class31.field869[var9] == 0) {
                class31.field869[var9] = 1;
            }
        }
        var2.field1057 = 0;
        for (int var10 = 0; var10 < class93.field2254; var10++) {
            int var11 = class26.field758[var10];
            int var12 = class115.field2839[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class119.field2920[var10] = var14;
            int var15 = var2.method365((byte) -124);
            if (var15 == 0) {
                for (int var16 = 0; var16 < var13; var16++) {
                    var14[var16] = var2.method335(-113);
                }
            } else if (var15 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var11; var18++) {
                        var14[var12 * var18 + var17] = var2.method335(-89);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V", line = 411)
    public static final void method255(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        field882++;
        if (arg0 != 1) {
            method256(-96, 88);
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lsa;", line = 423)
    public static final class109 method256(int arg0, int arg1) {
        field886++;
        class109 var2 = (class109) class7.field241.method402((long) arg1, -108);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class99.field2397.method508(arg1, arg0 - 6, arg0);
        class109 var4 = new class109();
        var4.field2645 = arg1;
        if (var3 != null) {
            var4.method823(arg0 + 14742, new class36(var3));
        }
        var4.method835(111);
        if (var4.field2683) {
            var4.field2639 = false;
            var4.field2646 = false;
        }
        class7.field241.method403((long) arg1, var4, (byte) -101);
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I", line = 466)
    public static int method257(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lod;I)V", line = 476)
    public static final void method258(class88 arg0, int arg1) {
        arg0.field2136 = 0;
        if (arg0.field2098 == 0) {
            arg0.field2106 = 1024;
        }
        field885++;
        if (arg0.field2098 == 1) {
            arg0.field2106 = 1536;
        }
        int var2 = arg0.field2133 - class130.field3128;
        if (arg0.field2098 == 2) {
            arg0.field2106 = 0;
        }
        int var3 = arg0.field2073 * 128 + arg0.field2076 * 64;
        int var4 = arg0.field2142 * 128 + arg0.field2076 * 64;
        if (arg0.field2098 == arg1) {
            arg0.field2106 = 512;
        }
        arg0.field2128 += (var4 - arg0.field2128) / var2;
        arg0.field2071 += (var3 - arg0.field2071) / var2;
    }
}
