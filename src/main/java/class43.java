import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lta;")
    private class131 field1157 = new class131(256);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lq;")
    private class111 field1145;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lq;")
    private class111 field1147;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lkd;")
    public static class73 field1154 = class126.method1070((byte) -66, "backvmid3");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lkd;")
    private static class73 field1159 = class126.method1070((byte) -66, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lkd;")
    public static class73 field1143 = field1159;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lkd;")
    private static class73 field1146 = class126.method1070((byte) -66, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lkd;")
    public static class73 field1148 = field1146;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lkd;")
    private static class73 field1155 = class126.method1070((byte) -66, "Public chat");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lkd;")
    public static class73 field1150 = field1155;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([IIB)Lpd;")
    public final class108 method320(int[] arg0, int arg1, byte arg2) {
        field1158++;
        if (this.field1145.method904(32466) == 1) {
            return this.method326(arg0, 0, 24443, arg1);
        } else if (this.field1145.method889(arg2 + 46, arg1) == 1) {
            return this.method326(arg0, arg1, 24443, 0);
        } else {
            if (arg2 != -47) {
                method325(-121, null, (byte) 62, -128);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([III)Lpd;")
    public final class108 method321(int[] arg0, int arg1, int arg2) {
        if (arg2 <= 71) {
            this.field1145 = null;
        }
        field1151++;
        if (this.field1147.method904(32466) == 1) {
            return this.method324(0, arg0, arg1, -113);
        } else if (this.field1147.method889(-1, arg1) == 1) {
            return this.method324(arg1, arg0, 0, -62);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static void method322(boolean arg0) {
        field1150 = null;
        field1143 = null;
        field1154 = null;
        field1159 = null;
        field1148 = null;
        field1155 = null;
        if (arg0) {
            method323(96, true);
        }
        field1146 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)Lid;")
    public static final class60 method323(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field1152++;
        class60 var2 = (class60) class71.field1803.method538(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class84.field2142.method898((byte) -115, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class60 var4 = new class60();
        class114 var5 = new class114(var3);
        int var6 = 0;
        var5.field2816 = var5.field2880.length - 12;
        int var7 = var5.method973(-118);
        var4.field1586 = var5.method944((byte) 124);
        var4.field1577 = var5.method944((byte) 126);
        var4.field1590 = var5.method944((byte) 115);
        var4.field1568 = var5.method944((byte) 115);
        var5.field2816 = 0;
        var4.field1564 = new int[var7];
        var4.field1587 = new class73[var7];
        var4.field1571 = new int[var7];
        while (var5.field2880.length - 12 > var5.field2816) {
            int var8 = var5.method944((byte) 110);
            if (var8 == 3) {
                var4.field1587[var6] = var5.method927((byte) 122);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field1571[var6] = var5.method957((byte) 71);
            } else {
                var4.field1571[var6] = var5.method973(-126);
            }
            var4.field1564[var6++] = var8;
        }
        class71.field1803.method542(var4, -901, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[III)Lpd;")
    private final class108 method324(int arg0, int[] arg1, int arg2, int arg3) {
        field1153++;
        int var5 = (arg0 << 4 & 0xFFF3 | arg0 >>> 12) ^ arg2;
        if (arg3 > -17) {
            field1155 = null;
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class108 var9 = (class108) this.field1157.method1099(111, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class95 var10 = class95.method792(this.field1147, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class108 var11 = var10.method793();
            this.field1157.method1093((byte) 106, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field2659.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILr;BI)V")
    public static final void method325(int arg0, class118 arg1, byte arg2, int arg3) {
        if ((arg3 & 0x40) != 0) {
            int var4 = class89.field2235.method944((byte) 124);
            int var5 = class89.field2235.method957((byte) 90);
            int var6 = class89.field2235.method962(false);
            int var7 = class89.field2235.field2816;
            if (arg1.field3025 != null && arg1.field3014 != null) {
                long var8 = arg1.field3025.method643(255);
                boolean var10 = false;
                if (var5 <= 1) {
                    for (int var11 = 0; var11 < class126.field3231; var11++) {
                        if (class102.field2558[var11] == var8) {
                            var10 = true;
                            break;
                        }
                    }
                }
                if (!var10 && class32.field894 == 0) {
                    class139.field3447.field2816 = 0;
                    class89.field2235.method940(-10498, var6, class139.field3447.field2880, 0);
                    class139.field3447.field2816 = 0;
                    class73 var12 = class46.method346(class116.method1002(class139.field3447, (byte) 13).method625((byte) 16));
                    arg1.field2285 = var12.method640(-123);
                    arg1.field2256 = var4 >> 8;
                    arg1.field2250 = 150;
                    arg1.field2269 = var4 & 0xFF;
                    if (var5 == 2 || var5 == 3) {
                        class74.method647((byte) 12, class32.method258(-78, new class73[] { class42.field1122, arg1.field3025 }), var12, 1);
                    } else if (var5 == 1) {
                        class74.method647((byte) 126, class32.method258(-100, new class73[] { class131.field3284, arg1.field3025 }), var12, 1);
                    } else {
                        class74.method647((byte) 124, arg1.field3025, var12, 2);
                    }
                }
            }
            class89.field2235.field2816 = var7 + var6;
        }
        if ((arg3 & 0x400) != 0) {
            arg1.field2301 = class89.field2235.method929(31165);
            int var13 = class89.field2235.method925(110);
            if (arg1.field2301 == 65535) {
                arg1.field2301 = -1;
            }
            arg1.field2275 = 0;
            arg1.field2262 = 0;
            arg1.field2248 = var13 >> 16;
            arg1.field2243 = (var13 & 0xFFFF) + class49.field1308;
            if (arg1.field2243 > class49.field1308) {
                arg1.field2262 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg1.field2289 = class89.field2235.method929(31165);
            arg1.field2224 = class89.field2235.method944((byte) 126);
        }
        field1144++;
        if ((arg3 & 0x4) != 0) {
            arg1.field2285 = class89.field2235.method927((byte) 122);
            if (arg1.field2285.method624(0, false) == 126) {
                arg1.field2285 = arg1.field2285.method638(1, -112);
                class74.method647((byte) 127, arg1.field3025, arg1.field2285, 2);
            } else if (class73.field1901 == arg1) {
                class74.method647((byte) -25, arg1.field3025, arg1.field2285, 2);
            }
            arg1.field2269 = 0;
            arg1.field2256 = 0;
            arg1.field2250 = 150;
        }
        if ((arg3 & 0x1) != 0) {
            arg1.field2266 = class89.field2235.method944((byte) 127);
            if (arg1.field2266 == 65535) {
                arg1.field2266 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            int var14 = class89.field2235.method959(128);
            int var15 = class89.field2235.method959(128);
            arg1.method740(class49.field1308, var15, var14, false);
            arg1.field2222 = class49.field1308 + 300;
            arg1.field2230 = class89.field2235.method959(128);
            arg1.field2221 = class89.field2235.method957((byte) 125);
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field2279 = class89.field2235.method957((byte) 11);
            arg1.field2292 = class89.field2235.method959(128);
            arg1.field2226 = class89.field2235.method962(false);
            arg1.field2287 = class89.field2235.method957((byte) 119);
            arg1.field2238 = class89.field2235.method929(31165) + class49.field1308;
            arg1.field2257 = class89.field2235.method929(31165) + class49.field1308;
            arg1.field2281 = class89.field2235.method938(-128);
            arg1.field2228 = 0;
            arg1.field2286 = 1;
        }
        if ((arg3 & 0x10) != 0) {
            int var16 = class89.field2235.method934((byte) -9);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class89.field2235.method962(false);
            class123.method1046(arg1, var16, 109, var17);
        }
        if ((arg3 & 0x8) != 0) {
            int var18 = class89.field2235.method962(false);
            int var19 = class89.field2235.method959(128);
            arg1.method740(class49.field1308, var19, var18, false);
            arg1.field2222 = class49.field1308 + 300;
            arg1.field2230 = class89.field2235.method959(128);
            arg1.field2221 = class89.field2235.method938(-128);
        }
        if (arg2 < 57 || (arg3 & 0x2) == 0) {
            return;
        }
        int var20 = class89.field2235.method938(-128);
        byte[] var21 = new byte[var20];
        class114 var22 = new class114(var21);
        class89.field2235.method940(-10498, var20, var21, 0);
        class38.field1046[arg0] = var22;
        arg1.method1021(90, var22);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([IIII)Lpd;")
    private final class108 method326(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 24443) {
            field1159 = null;
        }
        int var5 = (arg1 << 4 & 0xFFF1 | arg1 >>> 12) ^ arg3;
        field1160++;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class108 var9 = (class108) this.field1157.method1099(43, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class93 var10 = class93.method777(this.field1145, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class108 var11 = var10.method776();
            this.field1157.method1093((byte) -116, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2659.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lq;Lq;)V")
    public class43(class111 arg0, class111 arg1) {
        this.field1145 = arg0;
        this.field1147 = arg1;
    }
}
