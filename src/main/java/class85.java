import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 implements class54 {

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lda;")
    private class23 field2023 = new class23();

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "D")
    private double field2032 = 1.0D;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    private int field2038 = 0;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    private int field2042 = 128;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lg;")
    private class43 field2031;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    private int field2035;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[Lkc;")
    private class72[] field2028;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lu;")
    public static class135 field2016 = class87.method676((byte) -117, "::fpson");

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[I")
    public static int[] field2025 = new int[25];

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lu;")
    public static class135 field2017 = class87.method676((byte) -61, "@gre@");

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lu;")
    private static class135 field2030 = class87.method676((byte) -109, "Loaded fonts");

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lu;")
    public static class135 field2036 = field2030;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Lu;")
    private static class135 field2040 = class87.method676((byte) -118, "Select");

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lu;")
    public static class135 field2029 = field2040;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "Lu;")
    public static class135 field2039 = class87.method676((byte) -105, "Side panel redrawn");

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Le;")
    public static class29 field2015 = new class29(64);

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Lu;")
    public static class135 field2044 = class87.method676((byte) -72, "title_mute");

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2043 = 0;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field2018++;
        class44 var10 = (class44) class123.field2940.method182((byte) 50);
        class44 var11 = null;
        while (var10 != null) {
            if (var10.field1058 == arg4 && var10.field1060 == arg1 && var10.field1073 == arg9 && var10.field1063 == arg6) {
                var11 = var10;
                break;
            }
            var10 = (class44) class123.field2940.method181((byte) 56);
        }
        if (var11 == null) {
            var11 = new class44();
            var11.field1058 = arg4;
            var11.field1073 = arg9;
            var11.field1063 = arg6;
            var11.field1060 = arg1;
            class100.method827(var11, -109);
            class123.field2940.method185(var11, -27557);
        }
        var11.field1062 = arg8;
        if (arg5 < 56) {
            field2025 = null;
        }
        var11.field1083 = arg2;
        var11.field1064 = arg0;
        var11.field1070 = arg7;
        var11.field1072 = arg3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method660(int arg0) {
        field2017 = null;
        field2025 = null;
        field2015 = null;
        field2044 = null;
        field2040 = null;
        field2016 = null;
        field2039 = null;
        field2030 = null;
        field2029 = null;
        field2036 = null;
        if (arg0 != 20079) {
            field2017 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BD)V")
    public final void method661(byte arg0, double arg1) {
        this.field2032 = arg1;
        if (arg0 >= -71) {
            this.field2028 = null;
        }
        this.method665(0);
        field2019++;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
    public final void method662(int arg0, int arg1) {
        if (arg0 != 11040) {
            return;
        }
        for (int var3 = 0; var3 < this.field2028.length; var3++) {
            class72 var4 = this.field2028[var3];
            if (var4 != null && var4.field1729 != 0 && var4.field1731) {
                var4.method577(arg1);
                var4.field1731 = false;
            }
        }
        field2041++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lic;II)Lu;")
    public static final class135 method663(class59 arg0, int arg1, int arg2) {
        field2026++;
        try {
            if (arg2 != 128) {
                return null;
            }
            class135 var3 = new class135();
            var3.field3255 = arg0.method450((byte) -71);
            if (arg1 < var3.field3255) {
                var3.field3255 = arg1;
            }
            var3.field3266 = new byte[var3.field3255];
            arg0.field1485 += class124.field2973.method370(var3.field3255, arg0.field1485, true, arg0.field1495, 0, var3.field3266);
            return var3;
        } catch (Exception var4) {
            return class135.field3248;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Z")
    public final boolean method412(int arg0, int arg1) {
        field2037++;
        int var3 = -38 / ((arg1 - 4) / 62);
        return this.field2028[arg0].field1728;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static final void method664(int arg0) {
        field2034++;
        int var1 = 52 % ((arg0 - 43) / 59);
        while (true) {
            class23 var2 = class23.field551;
            class129 var3;
            synchronized (class23.field551) {
                var3 = (class129) class77.field1826.method186(-32);
            }
            if (var3 == null) {
                return;
            }
            var3.field3105.method878((int) var3.field951, var3.field3109, false, var3.field3108, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method665(int arg0) {
        for (int var2 = arg0; var2 < this.field2028.length; var2++) {
            if (this.field2028[var2] != null) {
                this.field2028[var2].method579();
            }
        }
        field2022++;
        this.field2023 = new class23();
        this.field2038 = this.field2035;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILve;)Z")
    public static final boolean method666(int arg0, class146 arg1) {
        if (arg0 != 601) {
            return false;
        }
        int var2 = arg1.field3601;
        field2033++;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class14.field298++;
            class47.field1123++;
            class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, class23.field563[var2] }), class39.field909, 0, 25);
            class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, class23.field563[var2] }), class141.field3441, 0, 3);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class146.field3553++;
            class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, arg1.field3568 }), class39.field909, 0, 41);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
    public final int method413(int arg0, int arg1) {
        field2020++;
        if (arg0 != -4078) {
            field2044 = null;
        }
        return this.field2028[arg1] == null ? 0 : this.field2028[arg1].field1722;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
    public final int[] method411(int arg0, int arg1) {
        if (arg1 != -11508) {
            return null;
        }
        field2027++;
        class72 var3 = this.field2028[arg0];
        if (var3 != null) {
            if (var3.field1725 != null) {
                this.field2023.method195(var3, arg1 + 37872);
                var3.field1731 = true;
                return var3.field1725;
            }
            boolean var4 = var3.method578(this.field2032, this.field2042, this.field2031);
            if (var4) {
                if (this.field2038 == 0) {
                    class72 var5 = (class72) this.field2023.method190((byte) -119);
                    var5.method579();
                } else {
                    this.field2038--;
                }
                this.field2023.method195(var3, 26364);
                var3.field1731 = true;
                return var3.field1725;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Z")
    public final boolean method414(byte arg0, int arg1) {
        if (arg0 != -56) {
            method666(18, null);
        }
        field2014++;
        return this.field2042 == 64;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lu;BI)Lu;")
    public static final class135 method667(int arg0, class135[] arg1, byte arg2, int arg3) {
        field2021++;
        int var4 = 0;
        if (arg2 > -102) {
            method664(90);
        }
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class28.field684;
            }
            var4 += arg1[arg0 + var5].field3255;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class135 var10 = arg1[arg0 + var8];
            class71.method575(var10.field3266, 0, var6, var7, var10.field3255);
            var7 += var10.field3255;
        }
        class135 var9 = new class135();
        var9.field3255 = var4;
        var9.field3266 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lg;Lg;IDI)V")
    public class85(class43 arg0, class43 arg1, int arg2, double arg3, int arg4) {
        this.field2031 = arg1;
        this.field2032 = arg3;
        this.field2042 = arg4;
        this.field2035 = arg2;
        this.field2038 = this.field2035;
        int[] var7 = arg0.method318(0, 0);
        int var8 = var7.length;
        this.field2028 = new class72[arg0.method335(0, (byte) -38)];
        for (int var9 = 0; var9 < var8; var9++) {
            class59 var10 = new class59(arg0.method324(0, var7[var9], 0));
            this.field2028[var7[var9]] = new class72(var10);
        }
    }
}
