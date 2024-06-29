import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 extends class75 {

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public int field2035 = -1;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public int field2044 = -1;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public int field2049 = 2;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public int field2057 = -1;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public int field2043 = 5;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public int field2052 = -1;

    @OriginalMember(owner = "client!ne", name = "nb", descriptor = "I")
    public int field2067 = 99;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "Z")
    public boolean field2058 = false;

    @OriginalMember(owner = "client!ne", name = "ob", descriptor = "I")
    public int field2068 = -1;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "Lod;")
    private static class101 field2056 = class46.method335(85, "Error connecting to server)3");

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "[I")
    public static int[] field2063 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "[[S")
    public static short[][] field2061 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Lod;")
    public static class101 field2047 = field2056;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Lod;")
    private static class101 field2034 = class46.method335(122, "Click to switch");

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "[Lod;")
    public static class101[] field2054 = new class101[100];

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Lod;")
    public static class101 field2050 = field2034;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ne", name = "pb", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ne", name = "qb", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ne", name = "rb", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Ldd;")
    public static class26 field2051;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "[I")
    public static int[] field2037;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "[I")
    public int[] field2041;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "[I")
    private int[] field2048;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "[I")
    private int[] field2053;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
    public int[] field2055;

    @OriginalMember(owner = "client!ne", name = "mb", descriptor = "[I")
    public int[] field2066;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "[Lee;")
    public static class34[] field2042;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltf;II)V")
    private final void method657(class138 arg0, int arg1, int arg2) {
        field2046++;
        int var4 = 34 % ((82 - arg1) / 32);
        if (arg2 == 1) {
            int var12 = arg0.method1098(true);
            this.field2066 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2066[var13] = arg0.method1098(true);
            }
            this.field2055 = new int[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                this.field2055[var14] = arg0.method1098(true);
            }
            for (int var15 = 0; var15 < var12; var15++) {
                this.field2055[var15] += arg0.method1098(true) << 16;
            }
        } else if (arg2 == 2) {
            this.field2057 = arg0.method1098(true);
        } else if (arg2 == 3) {
            int var10 = arg0.method1055(117);
            this.field2053 = new int[var10 + 1];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2053[var11] = arg0.method1055(112);
            }
            this.field2053[var10] = 9999999;
        } else if (arg2 == 4) {
            this.field2058 = true;
        } else if (arg2 == 5) {
            this.field2043 = arg0.method1055(109);
        } else if (arg2 == 6) {
            this.field2068 = arg0.method1098(true);
        } else if (arg2 == 7) {
            this.field2035 = arg0.method1098(true);
        } else if (arg2 == 8) {
            this.field2067 = arg0.method1055(115);
        } else if (arg2 == 9) {
            this.field2044 = arg0.method1055(126);
        } else if (arg2 == 10) {
            this.field2052 = arg0.method1055(115);
        } else if (arg2 == 11) {
            this.field2049 = arg0.method1055(109);
        } else if (arg2 == 12) {
            int var5 = arg0.method1055(122);
            this.field2048 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2048[var6] = arg0.method1098(true);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                this.field2048[var7] = (arg0.method1098(true) << 16) + this.field2048[var7];
            }
            return;
        } else if (arg2 == 13) {
            int var8 = arg0.method1055(115);
            this.field2041 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2041[var9] = arg0.method1088(255);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILqb;)Lqb;")
    public final class113 method658(byte arg0, int arg1, class113 arg2) {
        field2059++;
        int var4 = this.field2055[arg1];
        class146 var5 = class108.method775(var4 >> 16, (byte) -128);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method835(true);
        }
        class146 var7 = null;
        if (arg0 >= -72) {
            method663((byte) -13);
        }
        int var8 = 0;
        if (this.field2048 != null && this.field2048.length > arg1) {
            int var9 = this.field2048[arg1];
            var7 = class108.method775(var9 >> 16, (byte) -119);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class113 var11 = arg2.method835(!var5.method1156((byte) 46, var6));
            var11.method843(var5, var6);
            return var11;
        } else {
            class113 var10 = arg2.method835(!var5.method1156((byte) 78, var6) & !var7.method1156((byte) 84, var8));
            var10.method843(var5, var6);
            var10.method843(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILqb;)Lqb;")
    public final class113 method659(int arg0, int arg1, class113 arg2) {
        int var4 = this.field2055[arg0];
        field2045++;
        class146 var5 = class108.method775(var4 >> 16, (byte) -115);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method835(true);
        }
        if (arg1 != 128) {
            field2037 = null;
        }
        class113 var7 = arg2.method835(!var5.method1156((byte) 96, var6));
        var7.method843(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILqb;I)Lqb;")
    public final class113 method660(int arg0, class113 arg1, int arg2) {
        field2069++;
        int var4 = this.field2055[arg0];
        class146 var5 = class108.method775(var4 >> 16, (byte) -122);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method838(true);
        }
        class113 var7 = arg1.method838(!var5.method1156((byte) 72, var6));
        var7.method843(var5, var6);
        if (arg2 != -2061591408) {
            this.method666((byte) 86);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILqb;I)Lqb;")
    public final class113 method661(int arg0, int arg1, class113 arg2, int arg3) {
        int var5 = this.field2055[arg3];
        field2036++;
        class146 var6 = class108.method775(var5 >> 16, (byte) -126);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method835(true);
        }
        int var8 = arg1 & 0x3;
        class113 var9 = arg2.method835(!var6.method1156((byte) 61, var7));
        if (var8 == 1) {
            var9.method831();
        } else if (var8 == 2) {
            var9.method825();
        } else if (var8 == 3) {
            var9.method842();
        }
        var9.method843(var6, var7);
        if (var8 == 1) {
            var9.method842();
        } else if (var8 == 2) {
            var9.method825();
        } else if (var8 == 3) {
            var9.method831();
        }
        int var10 = 94 / (-arg0 / 52);
        return var9;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILne;IILqb;)Lqb;")
    public final class113 method662(int arg0, class95 arg1, int arg2, int arg3, class113 arg4) {
        field2071++;
        int var6 = this.field2055[arg0];
        class146 var7 = class108.method775(var6 >> 16, (byte) -121);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method659(arg3, 128, arg4);
        }
        int var9 = arg1.field2055[arg3];
        class146 var10 = class108.method775(var9 >> 16, (byte) -126);
        int var11 = var9 & arg2;
        if (var10 == null) {
            class113 var12 = arg4.method835(!var7.method1156((byte) 39, var8));
            var12.method843(var7, var8);
            return var12;
        } else {
            class113 var13 = arg4.method835(!var7.method1156((byte) 75, var8) & !var10.method1156((byte) 44, var11));
            var13.method845(var7, var8, var10, var11, this.field2053);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method663(byte arg0) {
        field2063 = null;
        field2037 = null;
        field2047 = null;
        field2034 = null;
        field2042 = null;
        if (arg0 != 100) {
            field2050 = null;
        }
        field2051 = null;
        field2056 = null;
        field2050 = null;
        field2054 = null;
        field2061 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIILdb;I)V")
    public static final void method664(int arg0, int arg1, int arg2, int arg3, class24 arg4, int arg5) {
        if (arg2 <= 34) {
            field2042 = null;
        }
        field2062++;
        class157 var6 = new class157();
        var6.field3608 = arg4.field568 * 128;
        var6.field3601 = arg0 * 128;
        var6.field3612 = arg4.field617;
        var6.field3614 = arg3;
        var6.field3619 = arg4.field581;
        var6.field3623 = arg4.field584;
        var6.field3603 = arg1 * 128;
        var6.field3624 = arg4.field571;
        int var7 = arg4.field613;
        int var8 = arg4.field599;
        if (arg5 == 1 || arg5 == 3) {
            var8 = arg4.field613;
            var7 = arg4.field599;
        }
        var6.field3618 = (arg0 + var7) * 128;
        var6.field3620 = (arg1 + var8) * 128;
        if (arg4.field567 != null) {
            var6.field3607 = arg4;
            var6.method1215(14278);
        }
        class20.field425.method529(var6, 19002);
        if (var6.field3623 != null) {
            var6.field3605 = var6.field3612 + (int) ((double) (var6.field3624 - var6.field3612) * Math.random());
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltf;I)V")
    public final void method665(class138 arg0, int arg1) {
        field2060++;
        while (true) {
            int var3 = arg0.method1055(127);
            if (var3 == 0) {
                if (arg1 == 17093) {
                    return;
                } else {
                    field2047 = null;
                    return;
                }
            }
            this.method657(arg0, 3, var3);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public final void method666(byte arg0) {
        field2038++;
        if (this.field2044 == -1) {
            if (this.field2053 == null) {
                this.field2044 = 0;
            } else {
                this.field2044 = 2;
            }
        }
        if (this.field2052 == -1) {
            if (this.field2053 == null) {
                this.field2052 = 0;
            } else {
                this.field2052 = 2;
            }
        }
        if (arg0 != -35) {
            this.method662(51, null, 101, 121, null);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lc;Lc;ILjava/awt/Component;)V")
    public static final void method667(class15 arg0, class15 arg1, int arg2, Component arg3) {
        field2065++;
        if (class83.field1815) {
            return;
        }
        class38.method285();
        byte[] var4 = arg1.method109((byte) -100, class105.field2265, class85.field1863);
        class119.field2618 = new class122(var4, arg3);
        class156.field3580 = class119.field2618.method932();
        class133.field3040 = class147.method1158(arg0, class75.field1601, class85.field1863, (byte) -114);
        class5.field64 = class147.method1158(arg0, class17.field348, class85.field1863, (byte) -120);
        class106.field2280 = class147.method1158(arg0, class47.field1127, class85.field1863, (byte) -123);
        class11.field172 = class100.method691(class83.field1809, arg0, class85.field1863, -1860);
        class89.field1926 = class100.method691(class34.field873, arg0, class85.field1863, -1860);
        class56.field1268 = new int[arg2];
        for (int var5 = 0; var5 < 64; var5++) {
            class56.field1268[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class56.field1268[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class56.field1268[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class56.field1268[var8 + 192] = 16777215;
        }
        class102.field2250 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class102.field2250[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class102.field2250[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class102.field2250[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class102.field2250[var12 + 192] = 16777215;
        }
        class93.field2006 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class93.field2006[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class93.field2006[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class93.field2006[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class93.field2006[var16 + 192] = 16777215;
        }
        class134.field3056 = new int[32768];
        field2037 = new int[32768];
        class15.field310 = new int[256];
        class27.method220(null, (byte) 34);
        class63.field1430 = new int[32768];
        if (class80.field1693 == 0) {
            class46.field1087 = true;
        } else {
            class46.field1087 = false;
        }
        class85.field1856 = class85.field1863;
        class98.field2131 = new int[32768];
        class140.field3229 = 0;
        class53.field1210 = false;
        class85.field1846 = class85.field1863;
        if (class46.field1087) {
            class33.method254(2, -56);
        } else {
            class93.method649((byte) -97, false, class105.field2266, 2, class85.field1863, class12.field245, 255);
        }
        class17.method136(false, 2);
        class83.field1815 = true;
        class119.field2618.method934(0, 0);
        class156.field3580.method934(382, 0);
        class133.field3040.method884(382 - class133.field3040.field2572 / 2, 18);
    }
}
