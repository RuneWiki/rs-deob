import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class281 {

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "Ljo;")
    private class382 field4238 = new class382(64);

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "Ljo;")
    public class382 field4252 = new class382(50);

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "Lhq;")
    public class424 field4253 = new class424(250);

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Lwv;")
    private class318 field4254 = new class318();

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Lok;")
    public class74 field4236;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Lpl;")
    private class462 field4256;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Z")
    private boolean field4237;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Lok;")
    private class74 field4251;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field4257;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field4255;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "F")
    public static float field4242;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public int field4258;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BZ)V", line = 4)
    public final void method1744(byte arg0, boolean arg1) {
        field4233++;
        if (this.field4237 != arg1) {
            this.field4237 = arg1;
            if (arg0 == 70) {
                this.method1750(-29553);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 20)
    public final void method1745(int arg0) {
        class382 var2 = this.field4238;
        synchronized (this.field4238) {
            if (arg0 > -125) {
                this.method1744((byte) 76, true);
            }
            this.field4238.method2287(119);
        }
        field4250++;
        class382 var3 = this.field4252;
        synchronized (this.field4252) {
            this.field4252.method2287(66);
        }
        class424 var4 = this.field4253;
        synchronized (this.field4253) {
            this.field4253.method2525((byte) 99);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lya;)V", line = 42)
    public static final void method1746(class11 arg0) {
        for (int var1 = class39.field523; var1 < class349.field5377; var1++) {
            for (int var2 = 0; var2 < class445.field6562; var2++) {
                for (int var3 = 0; var3 < class167.field2473; var3++) {
                    class306 var4 = class236.field3305[var1][var2][var3];
                    if (var4 != null) {
                        class512 var5 = var4.field4596;
                        class512 var6 = var4.field4582;
                        if (var5 != null && var5.method230(-22611)) {
                            class6.method27(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method230(-22611)) {
                                class6.method27(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method224(arg0, 0, 0, 0, var5, 121, false);
                                var6.method239(-76);
                            }
                            var5.method239(-58);
                        }
                        for (class17 var7 = var4.field4589; var7 != null; var7 = var7.field281) {
                            class522 var9 = var7.field279;
                            if (var9 != null && var9.method230(-22611)) {
                                class6.method27(arg0, var9, var1, var2, var3, var9.field7683 + 1 - var9.field7687, var9.field7673 - var9.field7676 + 1);
                                var9.method239(-81);
                            }
                        }
                        class259 var8 = var4.field4577;
                        if (var8 != null && var8.method230(-22611)) {
                            class289.method1784(arg0, var8, var1, var2, var3);
                            var8.method239(-98);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 126)
    public final void method1747(int arg0) {
        class382 var2 = this.field4252;
        synchronized (this.field4252) {
            this.field4252.method2293(false);
            if (arg0 <= 78) {
                this.method1754(-85);
            }
        }
        field4244++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 141)
    public static final void method1748(String arg0, byte arg1) {
        class339.field5232 = arg0;
        field4245++;
        if (class25.field375.field1611 == null) {
            return;
        }
        int var2 = -87 % ((arg1 + 12) / 54);
        try {
            String var3 = class25.field375.field1611.getParameter("cookieprefix");
            String var4 = class25.field375.field1611.getParameter("cookiehost");
            String var5 = var3 + "settings=" + arg0 + "; version=1; path=/; domain=" + var4;
            String var6;
            if (arg0.length() == 0) {
                var6 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var6 = var5 + "; Expires=" + class406.method2441(10, class381.method2281((byte) -124) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class331.method2048(class25.field375.field1611, "document.cookie=\"" + var6 + "\"", (byte) 114);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Lcq;", line = 175)
    public final class81 method1749(int arg0, int arg1) {
        field4241++;
        class382 var3 = this.field4238;
        class81 var4;
        synchronized (this.field4238) {
            var4 = (class81) this.field4238.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field4251;
        byte[] var6;
        synchronized (this.field4251) {
            var6 = this.field4251.method541(class179.method1220(arg1 ^ 0xFFFF9913, arg0), class280.method1742(arg0, arg1 ^ 0xF33FCD92), (byte) -122);
        }
        class81 var7 = new class81();
        var7.field1135 = this;
        var7.field1136 = arg0;
        var7.field1169 = new String[] { null, null, class251.field3426.method2103(this.field4239, (byte) 34), null, null };
        if (arg1 != -20230) {
            return null;
        }
        var7.field1183 = new String[] { null, null, null, null, class99.field1520.method2103(this.field4239, (byte) 34) };
        if (var6 != null) {
            var7.method591(-5010, new class468(var6));
        }
        var7.method592(-104);
        if (var7.field1123 != -1) {
            var7.method582(this.method1749(var7.field1133, -20230), this.method1749(var7.field1123, -20230), -7889);
        }
        if (var7.field1150 != -1) {
            var7.method577(this.method1749(var7.field1149, -20230), 99, this.method1749(var7.field1150, -20230));
        }
        if (!this.field4237 && var7.field1146) {
            var7.field1131 = class166.field2471.method2103(this.field4239, (byte) 34);
            var7.field1147 = null;
            var7.field1137 = 0;
            var7.field1169 = this.field4257;
            var7.field1178 = false;
            var7.field1183 = this.field4255;
            if (var7.field1158 != null) {
                boolean var8 = false;
                for (class115 var9 = var7.field1158.method3061(-16817); var9 != null; var9 = var7.field1158.method3066((byte) 122)) {
                    class184 var10 = this.field4256.method2676((int) var9.field1739, (byte) -14);
                    if (var10.field2720) {
                        var9.method876((byte) -96);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field1158 = null;
                }
            }
        }
        class382 var11 = this.field4238;
        synchronized (this.field4238) {
            this.field4238.method2290((long) arg0, var7, 99);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 258)
    public final void method1750(int arg0) {
        field4247++;
        class382 var2 = this.field4238;
        synchronized (this.field4238) {
            this.field4238.method2293(false);
        }
        class382 var3 = this.field4252;
        synchronized (this.field4252) {
            this.field4252.method2293(false);
        }
        if (arg0 == -29553) {
            class424 var4 = this.field4253;
            synchronized (this.field4253) {
                this.field4253.method2519(true);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V", line = 278)
    public final void method1751(int arg0, int arg1) {
        this.field4258 = arg0;
        if (arg1 > -69) {
            this.field4234 = 98;
        }
        field4243++;
        class382 var3 = this.field4252;
        synchronized (this.field4252) {
            this.field4252.method2293(false);
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V", line = 292)
    public static final void method1752(int arg0) {
        field4240++;
        int var1 = class94.field1456 * 128 + 64;
        int var2 = class16.field272 * 128 + 64;
        int var3 = class50.method373(class521.field7651, 14966, var2, var1) - class175.field2589;
        if (class117.field1753 >= 100) {
            class393.field5897 = class16.field272 * 128 + 64;
            class282.field4263 = class94.field1456 * 128 + 64;
            class201.field2925 = class50.method373(class521.field7651, 14966, class393.field5897, class282.field4263) - class175.field2589;
        } else {
            if (var1 > class282.field4263) {
                class282.field4263 += class452.field6649 + ((var1 - class282.field4263) * class117.field1753 / 1000);
                if (var1 < class282.field4263) {
                    class282.field4263 = var1;
                }
            }
            if (class282.field4263 > var1) {
                class282.field4263 -= (class282.field4263 - var1) * class117.field1753 / 1000 + class452.field6649;
                if (class282.field4263 < var1) {
                    class282.field4263 = var1;
                }
            }
            if (var3 > class201.field2925) {
                class201.field2925 += (var3 - class201.field2925) * class117.field1753 / 1000 + class452.field6649;
                if (class201.field2925 > var3) {
                    class201.field2925 = var3;
                }
            }
            if (var2 > class393.field5897) {
                class393.field5897 += (var2 - class393.field5897) * class117.field1753 / 1000 + class452.field6649;
                if (var2 < class393.field5897) {
                    class393.field5897 = var2;
                }
            }
            if (var3 < class201.field2925) {
                class201.field2925 -= class452.field6649 + ((class201.field2925 - var3) * class117.field1753 / 1000);
                if (class201.field2925 < var3) {
                    class201.field2925 = var3;
                }
            }
            if (class393.field5897 > var2) {
                class393.field5897 -= (class393.field5897 - var2) * class117.field1753 / 1000 + class452.field6649;
                if (class393.field5897 < var2) {
                    class393.field5897 = var2;
                }
            }
        }
        int var4 = class227.field3208 * 128 + 64;
        int var5 = class333.field5159 * 128 + 64;
        int var6 = class50.method373(class521.field7651, 14966, var5, var4) - class226.field3194;
        int var7 = var4 - class282.field4263;
        int var8 = var6 - class201.field2925;
        int var9 = var5 - class393.field5897;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (arg0 != -613070045) {
            method1757(23, -7);
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class350.field5383 < var11) {
            class350.field5383 += (var11 - class350.field5383 >> 3) * class215.field3065 / 1000 + class305.field4564 << 3;
            if (class350.field5383 > var11) {
                class350.field5383 = var11;
            }
        }
        if (var11 < class350.field5383) {
            class350.field5383 -= (class350.field5383 - var11 >> 3) * class215.field3065 / 1000 + class305.field4564 << 3;
            if (var11 > class350.field5383) {
                class350.field5383 = var11;
            }
        }
        int var13 = var12 - class431.field6396;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class431.field6396 += class215.field3065 * var14 / 1000 + class305.field4564 << 3;
            class431.field6396 &= 0x3FFF;
        }
        if (var14 < 0) {
            class431.field6396 -= -var14 * class215.field3065 / 1000 + class305.field4564 << 3;
            class431.field6396 &= 0x3FFF;
        }
        int var15 = var12 - class431.field6396;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class431.field6396 = var12;
        }
        class487.field7247 = 0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIILya;Lfb;Z)Ll;", line = 449)
    public final class127 method1753(int arg0, int arg1, int arg2, int arg3, int arg4, class11 arg5, class36 arg6, boolean arg7) {
        this.field4254.field4909 = arg4;
        this.field4254.field4910 = arg3;
        if (arg7) {
            return null;
        }
        this.field4254.field4907 = arg1;
        this.field4254.field4912 = arg5.field104;
        this.field4254.field4916 = arg6 != null;
        this.field4254.field4914 = arg0;
        this.field4254.field4915 = arg2;
        field4249++;
        return (class127) this.field4253.method2515(117, this.field4254);
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V", line = 469)
    public final void method1754(int arg0) {
        class424 var2 = this.field4253;
        synchronized (this.field4253) {
            if (arg0 != -14403) {
                this.field4258 = 83;
            }
            this.field4253.method2519(true);
        }
        field4235++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lla;IIZZBIIILfb;Lya;Lya;)Ll;", line = 484)
    public final class127 method1755(class307 arg0, int arg1, int arg2, boolean arg3, boolean arg4, byte arg5, int arg6, int arg7, int arg8, class36 arg9, class11 arg10, class11 arg11) {
        field4248++;
        class127 var13 = this.method1753(arg1, arg7, arg2, arg6, arg8, arg10, arg9, false);
        if (var13 != null) {
            return var13;
        }
        class81 var14 = this.method1749(arg7, -20230);
        if (arg6 > 1 && var14.field1163 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field1188[var16] <= arg6 && var14.field1188[var16] != 0) {
                    var15 = var14.field1163[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1749(var15, -20230);
            }
        }
        int[] var17 = var14.method585(arg4, -25798, arg6, arg9, arg8, arg1, arg0, arg2, arg10, arg11);
        if (var17 == null) {
            return null;
        }
        int var18 = -42 / ((-arg5 - 62) / 45);
        class127 var19;
        if (arg3) {
            var19 = arg11.method103(var17, 0, 36, 36, 32);
        } else {
            var19 = arg10.method103(var17, 0, 36, 36, 32);
        }
        if (!arg3) {
            class318 var20 = new class318();
            var20.field4914 = arg1;
            var20.field4910 = arg6;
            var20.field4915 = arg2;
            var20.field4907 = arg7;
            var20.field4909 = arg8;
            var20.field4916 = arg9 != null;
            var20.field4912 = arg10.field104;
            this.field4253.method2521(var19, var20, (byte) 111);
        }
        return var19;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V", line = 549)
    public final void method1756(int arg0, byte arg1) {
        if (arg1 >= -120) {
            return;
        }
        field4246++;
        class382 var3 = this.field4238;
        synchronized (this.field4238) {
            this.field4238.method2294(arg0, true);
        }
        class382 var4 = this.field4252;
        synchronized (this.field4252) {
            this.field4252.method2294(arg0, true);
        }
        class424 var5 = this.field4253;
        synchronized (this.field4253) {
            this.field4253.method2516(arg0, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lkr;IZLpl;Lok;Lok;)V", line = 621)
    public class281(class262 arg0, int arg1, boolean arg2, class462 arg3, class74 arg4, class74 arg5) {
        this.field4236 = arg5;
        this.field4256 = arg3;
        this.field4237 = arg2;
        this.field4251 = arg4;
        this.field4239 = arg1;
        if (this.field4251 == null) {
            this.field4234 = 0;
        } else {
            int var7 = this.field4251.method535((byte) 117) - 1;
            this.field4234 = this.field4251.method536(false, var7) + var7 * 256;
        }
        this.field4257 = new String[] { null, null, class251.field3426.method2103(this.field4239, (byte) 34), null, null };
        this.field4255 = new String[] { null, null, null, null, class99.field1520.method2103(this.field4239, (byte) 34) };
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)Lmo;", line = 574)
    public static final class268 method1757(int arg0, int arg1) {
        field4232++;
        class521[] var2 = class181.field2674;
        synchronized (class181.field2674) {
            if (arg0 != 0) {
                method1746(null);
            }
            class268 var3;
            if (class181.field2674.length <= arg1 || class181.field2674[arg1].method3086(arg0 ^ 0xFFFFF6AB)) {
                var3 = new class268();
                var3.field3992 = new class518[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field3992[var4] = new class518();
                }
            } else {
                var3 = (class268) class181.field2674[arg1].method3083(25761);
                var3.method2096((byte) 105);
                int var10002 = class514.field7519[arg1]--;
            }
            return var3;
        }
    }
}
