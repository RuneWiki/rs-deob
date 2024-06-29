import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class113 {

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    private int field2109 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[Lee;")
    private class44[] field2087;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    private int field2106;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lkb;")
    private static class93 field2093 = class76.method390("Loading sprites )2 ", 0);

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[S")
    public static short[] field2092 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lkb;")
    public static class93 field2099 = class76.method390("Lade Eingabe)2Steuerungsprogramm)3)3)3", 0);

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lkb;")
    public static class93 field2107 = field2093;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field2108 = 128;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2095 = 0;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field2113 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "J")
    private long field2104;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lee;")
    private class44 field2094;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lee;")
    private class44 field2110;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "[Lob;")
    public static class129[] field2105;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lee;")
    public final class44 method612(int arg0) {
        this.field2109 = 0;
        field2097++;
        if (arg0 != 12981) {
            this.method623((byte) -72);
        }
        return this.method623((byte) -77);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
    public final int method613(int arg0) {
        field2098++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field2106; var3++) {
            class44 var4 = this.field2087[var3];
            class44 var5 = var4.field716;
            while (var4 != var5) {
                var5 = var5.field716;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Lee;")
    public final class44 method614(int arg0) {
        field2102++;
        if (this.field2094 == null) {
            return null;
        }
        int var2 = 121 % ((79 - arg0) / 36);
        class44 var3 = this.field2087[(int) (this.field2104 & (long) (this.field2106 - 1))];
        while (this.field2094 != var3) {
            if (this.field2094.field718 == this.field2104) {
                class44 var4 = this.field2094;
                this.field2094 = this.field2094.field716;
                return var4;
            }
            this.field2094 = this.field2094.field716;
        }
        this.field2094 = null;
        return null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILog;IIIB[Lqf;I[BI)V")
    public static final void method615(int arg0, int arg1, class134 arg2, int arg3, int arg4, int arg5, byte arg6, class151[] arg7, int arg8, byte[] arg9, int arg10) {
        if (arg6 >= -60) {
            field2105 = null;
        }
        field2091++;
        int var11 = -1;
        class158 var12 = new class158(arg9);
        while (true) {
            int var13 = var12.method1072(-25182);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1072(-25182);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 & 0x3F;
                int var19 = var12.method1054(128);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg3 == var17 && arg8 <= var16 && arg8 + 8 > var16 && var18 >= arg10 && arg10 + 8 > var18) {
                    class81 var22 = class154.method990(var11, true);
                    int var23 = arg0 + class153.method987(var22.field1439, (byte) -110, var18 & 0x7, var16 & 0x7, arg4, var21, var22.field1487);
                    int var24 = class106.method582(var22.field1487, var21, var16 & 0x7, var18 & 0x7, var22.field1439, arg4, (byte) -84) + arg1;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class151 var25 = null;
                        int var26 = arg5;
                        if ((class136.field2637[1][var23][var24] & 0x2) == 2) {
                            var26 = arg5 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg7[var26];
                        }
                        class34.method188(arg4 + var21 & 0x3, var24, var11, var25, arg2, 84, var23, var20, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)Lee;")
    public final class44 method616(long arg0, int arg1) {
        this.field2104 = arg0;
        field2090++;
        class44 var4 = this.field2087[(int) ((long) (this.field2106 + arg1) & arg0)];
        for (this.field2094 = var4.field716; this.field2094 != var4; this.field2094 = this.field2094.field716) {
            if (this.field2094.field718 == arg0) {
                class44 var5 = this.field2094;
                this.field2094 = this.field2094.field716;
                return var5;
            }
        }
        this.field2094 = null;
        return null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IJLee;)V")
    public final void method617(int arg0, long arg1, class44 arg2) {
        field2088++;
        if (arg2.field721 != null) {
            arg2.method235(false);
        }
        class44 var5 = this.field2087[(int) ((long) (this.field2106 - 1) & arg1)];
        arg2.field716 = var5;
        arg2.field718 = arg1;
        arg2.field721 = var5.field721;
        if (arg0 == 0) {
            arg2.field721.field716 = arg2;
            arg2.field716.field721 = arg2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BZI)Lkb;")
    public static final class93 method618(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field2089++;
        class93 var4 = new class93();
        var4.field1726 = new byte[arg0];
        var4.field1701 = 0;
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field1726[var4.field1701++] = arg1[var5];
            }
        }
        if (!arg2) {
            method615(-6, 58, null, -67, -113, -8, (byte) -16, null, 59, null, 46);
        }
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljg;Ljg;Ljg;B)V")
    public static final void method619(class89 arg0, class89 arg1, class89 arg2, byte arg3) {
        class68.field1256 = arg1;
        if (arg3 > -101) {
            field2113 = 30;
        }
        field2103++;
        class190.field3712 = arg0;
        class204.field3935 = arg2;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public static void method620(int arg0) {
        field2107 = null;
        field2105 = null;
        field2092 = null;
        field2093 = null;
        field2099 = null;
        if (arg0 != 1) {
            field2107 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lh;")
    public static final class65 method621(int arg0, int arg1, int arg2) {
        field2112++;
        class65 var3 = class204.method1325(65535, arg1);
        if (arg0 == arg2) {
            return var3;
        } else if (var3 == null || var3.field1121 == null || arg0 >= var3.field1121.length) {
            return null;
        } else {
            return var3.field1121[arg0];
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lee;I)I")
    public final int method622(class44[] arg0, int arg1) {
        int var3 = 0;
        for (int var4 = arg1; var4 < this.field2106; var4++) {
            class44 var5 = this.field2087[var4];
            for (class44 var6 = var5.field716; var6 != var5; var6 = var6.field716) {
                arg0[var3++] = var6;
            }
        }
        field2111++;
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lee;")
    public final class44 method623(byte arg0) {
        if (arg0 != -77) {
            return null;
        }
        field2100++;
        if (this.field2109 > 0 && this.field2087[this.field2109 - 1] != this.field2110) {
            class44 var2 = this.field2110;
            this.field2110 = var2.field716;
            return var2;
        }
        while (this.field2109 < this.field2106) {
            class44 var3 = this.field2087[this.field2109++].field716;
            if (this.field2087[this.field2109 - 1] != var3) {
                this.field2110 = var3.field716;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
    public class113(int arg0) {
        this.field2087 = new class44[arg0];
        this.field2106 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class44 var3 = this.field2087[var2] = new class44();
            var3.field721 = var3;
            var3.field716 = var3;
        }
    }
}
