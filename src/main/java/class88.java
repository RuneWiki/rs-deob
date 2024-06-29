import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class88 extends class42 {

    @OriginalMember(owner = "client!od", name = "zb", descriptor = "[I")
    private int[] field2075 = new int[6];

    @OriginalMember(owner = "client!od", name = "yb", descriptor = "[I")
    private int[] field2074 = new int[6];

    @OriginalMember(owner = "client!od", name = "Nb", descriptor = "Z")
    public boolean field2089 = false;

    @OriginalMember(owner = "client!od", name = "rb", descriptor = "[I")
    private int[] field2067 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!od", name = "Db", descriptor = "I")
    public int field2079 = -1;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "Lad;")
    public static class5 field2059 = method674("Die Verbindung konnte", -122);

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "Lad;")
    public static class5 field2052 = method674("(U5", -87);

    @OriginalMember(owner = "client!od", name = "db", descriptor = "Lad;")
    private static class5 field2053 = method674("Malformed login packet)3", 70);

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "[I")
    public static int[] field2060 = new int[4000];

    @OriginalMember(owner = "client!od", name = "Bb", descriptor = "Lad;")
    private static class5 field2077 = method674("RuneScape is loading )2 please wait)3)3)3", 21);

    @OriginalMember(owner = "client!od", name = "sb", descriptor = "Lad;")
    public static class5 field2068 = method674("Verbindung mit Update)2Server)3)3)3", 12);

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "Lad;")
    private static class5 field2062 = method674("Enter amount:", 101);

    @OriginalMember(owner = "client!od", name = "tb", descriptor = "Lad;")
    public static class5 field2069 = field2062;

    @OriginalMember(owner = "client!od", name = "qb", descriptor = "Lad;")
    private static class5 field2066 = method674("Loading title screen )2 ", -126);

    @OriginalMember(owner = "client!od", name = "Fb", descriptor = "Lad;")
    public static class5 field2081 = method674(" )2>", -124);

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "Lad;")
    public static class5 field2058 = field2053;

    @OriginalMember(owner = "client!od", name = "Kb", descriptor = "Lad;")
    public static class5 field2086 = method674("mapfunction", 19);

    @OriginalMember(owner = "client!od", name = "Lb", descriptor = "Lad;")
    public static class5 field2087 = field2066;

    @OriginalMember(owner = "client!od", name = "Mb", descriptor = "Lad;")
    public static class5 field2088 = field2077;

    @OriginalMember(owner = "client!od", name = "vb", descriptor = "Lad;")
    public static class5 field2071 = method674("@cr2@", 71);

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!od", name = "ub", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!od", name = "wb", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!od", name = "xb", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!od", name = "Ab", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!od", name = "Cb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!od", name = "Eb", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!od", name = "Hb", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!od", name = "Ib", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!od", name = "Jb", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!od", name = "Ob", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!od", name = "Gb", descriptor = "Luc;")
    public static class123 field2082;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "[I")
    private int[] field2057;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)Lhc;", line = 8)
    public final class45 method665(byte arg0) {
        field2084++;
        int var2 = 0;
        class45[] var3 = new class45[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2067[var4] != -1) {
                var3[var2++] = class45.method400(class104.field2529, this.field2067[var4], 0);
            }
        }
        class45 var5 = new class45(var3, var2);
        int var6 = 0;
        if (arg0 != 4) {
            this.method673(-83);
        }
        while (var6 < 6 && this.field2074[var6] != 0) {
            var5.method381(this.field2074[var6], this.field2075[var6]);
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Lad;", line = 58)
    public static final class5 method666(int arg0, boolean arg1) {
        field2065++;
        class5 var2 = class106.method864(18413, arg0);
        for (int var3 = var2.method33(97) - 3; var3 > 0; var3 -= 3) {
            var2 = class69.method546(!arg1, new class5[] { var2.method51((byte) -32, 0, var3), class32.field763, var2.method52(var3, (byte) -97) });
        }
        if (arg1) {
            field2058 = null;
        }
        if (var2.method33(115) > 8) {
            var2 = class69.method546(!arg1, new class5[] { class38.field946, var2.method51((byte) -112, 0, var2.method33(91) - 8), class83.field1947, class99.field2398, var2, class42.field1063 });
        } else if (var2.method33(126) > 4) {
            var2 = class69.method546(true, new class5[] { class60.field1486, var2.method51((byte) -49, 0, var2.method33(70) - 4), class81.field1902, class99.field2398, var2, class42.field1063 });
        }
        return class69.method546(true, new class5[] { class23.field589, var2 });
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)Z", line = 101)
    public final boolean method667(boolean arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2067[var3] != -1 && !class104.field2529.method865(this.field2067[var3], -2691, 0)) {
                var2 = false;
            }
        }
        if (arg0) {
            this.field2057 = null;
        }
        field2061++;
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lgb;B)[Ljava/lang/Object;", line = 135)
    public static final Object[] method668(class39 arg0, byte arg1) {
        field2090++;
        int var2 = arg0.method330(-30864);
        if (var2 == 0) {
            return null;
        } else if (arg1 == 75) {
            Object[] var3 = new Object[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                int var5 = arg0.method330(-30864);
                if (var5 == 0) {
                    var3[var4] = Integer.valueOf(arg0.method322((byte) -118));
                } else if (var5 == 1) {
                    var3[var4] = arg0.method301(-1);
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)Lhc;", line = 173)
    public final class45 method669(byte arg0) {
        field2083++;
        if (this.field2057 == null) {
            return null;
        }
        class45[] var2 = new class45[this.field2057.length];
        for (int var3 = 0; var3 < this.field2057.length; var3++) {
            var2[var3] = class45.method400(class104.field2529, this.field2057[var3], 0);
        }
        class45 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class45(var2, var2.length);
        }
        int var5 = 0;
        if (arg0 != 46) {
            field2086 = null;
        }
        while (var5 < 6 && this.field2074[var5] != 0) {
            var4.method381(this.field2074[var5], this.field2075[var5]);
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)I", line = 220)
    public static final int method670(int arg0, byte arg1, int arg2) {
        field2064++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 0) {
                arg0 = 0;
            } else if (arg0 > 127) {
                arg0 = 127;
            }
            return 127 - arg0;
        } else if (arg1 > -51) {
            return 53;
        } else {
            int var4 = (arg2 & 0x7F) * arg0 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 256)
    public static void method671(int arg0) {
        field2052 = null;
        field2053 = null;
        field2069 = null;
        field2087 = null;
        field2081 = null;
        field2068 = null;
        field2071 = null;
        field2059 = null;
        field2088 = null;
        if (arg0 != 5) {
            method668(null, (byte) -6);
        }
        field2077 = null;
        field2086 = null;
        field2058 = null;
        field2062 = null;
        field2066 = null;
        field2082 = null;
        field2060 = null;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V", line = 281)
    public static final void method672(byte arg0) {
        int var1 = -91 % ((-arg0 - 32) / 49);
        field2073++;
        for (class132 var2 = (class132) class78.field1844.method180(0); var2 != null; var2 = (class132) class78.field1844.method181(0)) {
            if (var2.field3186 == -1) {
                var2.field3202 = 0;
                class120.method952(var2, -128);
            } else {
                var2.method114(-3789);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Z", line = 306)
    public final boolean method673(int arg0) {
        field2078++;
        if (this.field2057 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 > -15) {
            this.field2067 = null;
        }
        for (int var3 = 0; var3 < this.field2057.length; var3++) {
            if (!class104.field2529.method865(this.field2057[var3], -2691, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Lad;", line = 342)
    public static final class5 method674(String arg0, int arg1) {
        field2072++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class5 var4 = new class5();
        var4.field164 = new byte[var3];
        int var5 = 0;
        int var6 = 9 % ((-arg1 - 23) / 34);
        while (var5 < var3) {
            int var7 = var2[var5++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var8 = var2[var5++] & 0xFF;
                var4.field164[var4.field183++] = (byte) (var7 * 43 + var8 - 1720 - 48);
            } else if (var7 != 0) {
                var4.field164[var4.field183++] = (byte) var7;
            }
        }
        var4.method48((byte) 127);
        return var4.method37(-3);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZ)V", line = 383)
    public static final void method675(boolean arg0, boolean arg1) {
        class46.field1204++;
        field2063++;
        if (arg1) {
            method668(null, (byte) -121);
        }
        if (class46.field1204 < 50 && !arg0) {
            return;
        }
        class46.field1204 = 0;
        if (class12.field370 || class59.field1455 == null) {
            return;
        }
        class86.field1980++;
        class5.field163.method209(102, 10);
        try {
            class59.field1455.method349(0, -1, class5.field163.field957, class5.field163.field974);
            class5.field163.field957 = 0;
        } catch (IOException var2) {
            class12.field370 = true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lgb;II)V", line = 410)
    private final void method676(class39 arg0, int arg1, int arg2) {
        field2085++;
        if (arg1 == 1) {
            this.field2079 = arg0.method330(arg2 - 30864);
        } else if (arg1 == 2) {
            int var4 = arg0.method330(-30864);
            this.field2057 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2057[var5] = arg0.method343((byte) -6);
            }
        } else if (arg1 == 3) {
            this.field2089 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2074[arg1 - 40] = arg0.method343((byte) -6);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2075[arg1 - 50] = arg0.method343((byte) -6);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2067[arg1 - 60] = arg0.method343((byte) -6);
        }
        if (arg2 != 0) {
            field2088 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V", line = 494)
    public static final void method677(int arg0) {
        field2055++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                class56.field1395[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            class56.field1395[var17] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var13 = 1; var13 < 127; var13++) {
                int var14 = var13 + (var4 << 7);
                class21.field548[var14] = (class56.field1395[var14 - 128] + class56.field1395[var14 + 128] + class56.field1395[var14 - 1] + class56.field1395[var14 - -1]) / 4;
            }
        }
        class1.field5 += 128;
        if (class98.field2366.length < class1.field5) {
            int var5 = (int) (Math.random() * 12.0D);
            class1.field5 -= class98.field2366.length;
            class106.method849(0, class30.field739[var5]);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var10 = 1; var10 < 127; var10++) {
                int var11 = (var6 << 7) + var10;
                int var12 = class21.field548[var11 + 128] - class98.field2366[var11 + class1.field5 & class98.field2366.length + -1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                class56.field1395[var11] = var12;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class60.field1483[var7] = class60.field1483[var7 + 1];
        }
        class60.field1483[var1 - 1] = (int) (Math.sin((double) class69.field1636 / 14.0D) * 16.0D + Math.sin((double) class69.field1636 / 15.0D) * 14.0D + Math.sin((double) class69.field1636 / 16.0D) * 12.0D);
        int var8 = -28 % ((arg0 + 39) / 43);
        if (class94.field2231 > 0) {
            class94.field2231 -= 4;
        }
        if (class121.field3003 > 0) {
            class121.field3003 -= 4;
        }
        if (class94.field2231 != 0 || class121.field3003 != 0) {
            return;
        }
        int var9 = (int) (Math.random() * 2000.0D);
        if (var9 == 0) {
            class94.field2231 = 1024;
        }
        if (var9 == 1) {
            class121.field3003 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLgb;)V", line = 617)
    public final void method678(byte arg0, class39 arg1) {
        if (arg0 < 55) {
            method671(95);
        }
        field2070++;
        while (true) {
            int var3 = arg1.method330(-30864);
            if (var3 == 0) {
                return;
            }
            this.method676(arg1, var3, 0);
        }
    }
}
