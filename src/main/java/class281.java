import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class281 extends class77 {

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field4256 = 0;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public int field4268 = -1;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public int field4264 = 12800;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public int field4269 = 12800;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public int field4277 = 0;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Z")
    public boolean field4278 = true;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public int field4275 = -1;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "Ljava/lang/String;")
    public String field4262;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Ljava/lang/String;")
    public String field4259;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "Lbo;")
    public class16 field4266;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field4263 = 0;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field4267 = new String[500];

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field4271 = 0;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BZ)Z", line = 11)
    public static final boolean method2043(byte arg0, boolean arg1) {
        int var2 = 109 / ((arg0 - 72) / 33);
        field4272++;
        boolean var3 = class233.method1731();
        if (arg1 == var3) {
            return true;
        }
        if (!arg1) {
            class233.method1735();
        } else if (!class233.method1733() || !class233.method1725() || !class233.method1724()) {
            arg1 = false;
        }
        class133.field1948 = arg1;
        class309.method2176(class54.field787, false);
        if (arg1 == var3) {
            return false;
        } else {
            ((class71) class345.field5336).method567(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V", line = 47)
    public final void method2044(byte arg0) {
        this.field4264 = 12800;
        this.field4256 = 0;
        this.field4277 = 0;
        this.field4269 = 12800;
        if (arg0 > -113) {
            return;
        }
        for (class99 var2 = (class99) this.field4266.method93((byte) -94); var2 != null; var2 = (class99) this.field4266.method97(-114)) {
            if (this.field4269 > var2.field1406) {
                this.field4269 = var2.field1406;
            }
            if (var2.field1420 > this.field4277) {
                this.field4277 = var2.field1420;
            }
            if (this.field4264 > var2.field1422) {
                this.field4264 = var2.field1422;
            }
            if (this.field4256 < var2.field1396) {
                this.field4256 = var2.field1396;
            }
        }
        field4254++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILph;Lph;Lph;Lph;)V", line = 86)
    public static final void method2045(int arg0, class361 arg1, class361 arg2, class361 arg3, class361 arg4) {
        int var5 = 5 % ((-arg0 - 8) / 51);
        class3.field104 = arg4;
        class252.field3756 = arg2;
        class356.field5469 = arg3;
        field4265++;
        class357.field5472 = arg1;
        class119.field1677 = new class359[class3.field104.method2526((byte) 83)][];
        class121.field1709 = new boolean[class3.field104.method2526((byte) 127)];
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILdm;III)V", line = 101)
    public static final void method2046(int arg0, int arg1, class349 arg2, int arg3, int arg4, int arg5) {
        field4258++;
        if (arg2.field5399 == -1 && arg2.field5400 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class207.field3035 * arg2.field5406 >> 8;
        if (arg2.field5396 < arg1) {
            var6 += arg1 - arg2.field5396;
        } else if (arg1 < arg2.field5386) {
            var6 += arg2.field5386 - arg1;
        }
        if (arg2.field5389 < arg0) {
            var6 += arg0 - arg2.field5389;
        } else if (arg2.field5403 > arg0) {
            var6 += arg2.field5403 - arg0;
        }
        if (arg2.field5392 == 0 || arg2.field5392 < var6 - 64 || class207.field3035 == 0 || arg2.field5387 != arg5) {
            if (arg2.field5405 != null) {
                class179.field2576.method1397(arg2.field5405);
                arg2.field5405 = null;
            }
            if (arg2.field5397 != null) {
                class179.field2576.method1397(arg2.field5397);
                arg2.field5397 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field5392 - var6) * var7 / arg2.field5392;
        if (arg4 != 100) {
            method2043((byte) -20, true);
        }
        if (arg2.field5405 != null) {
            arg2.field5405.method1651(var8);
        } else if (arg2.field5399 >= 0) {
            class188 var9 = class188.method1302(class253.field3785, arg2.field5399, 0);
            if (var9 != null) {
                class43 var10 = var9.method1301().method312(class144.field2088);
                class226 var11 = class226.method1661(var10, 100, var8);
                var11.method1650(-1);
                class179.field2576.method1398(var11);
                arg2.field5405 = var11;
            }
        }
        if (arg2.field5397 != null) {
            arg2.field5397.method1651(var8);
            if (!arg2.field5397.method874(8)) {
                arg2.field5397 = null;
            }
        } else if (arg2.field5400 != null && (arg2.field5391 -= arg3) <= 0) {
            int var12 = (int) (Math.random() * (double) arg2.field5400.length);
            class188 var13 = class188.method1302(class253.field3785, arg2.field5400[var12], 0);
            if (var13 != null) {
                class43 var14 = var13.method1301().method312(class144.field2088);
                class226 var15 = class226.method1661(var14, 100, var8);
                var15.method1650(0);
                class179.field2576.method1398(var15);
                arg2.field5397 = var15;
                arg2.field5391 = (int) ((double) (arg2.field5390 - arg2.field5394) * Math.random()) + arg2.field5394;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILjava/lang/String;[BII)I", line = 225)
    public static final int method2047(int arg0, int arg1, String arg2, byte[] arg3, int arg4, int arg5) {
        field4270++;
        if (arg0 != 12800) {
            method2049(-102, (String) null, (char) 65518);
        }
        int var6 = arg5 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg4 + var7] = -97;
            } else {
                arg3[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 881)
    public class281(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4276 = arg0;
        this.field4255 = arg3;
        this.field4262 = arg1;
        this.field4278 = arg5;
        this.field4275 = arg6;
        this.field4259 = arg2;
        this.field4268 = arg4;
        if (this.field4275 == 255) {
            this.field4275 = 0;
        }
        this.field4266 = new class16();
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V", line = 375)
    public static void method2048(int arg0) {
        field4267 = null;
        int var1 = -48 / ((-arg0 - 6) / 62);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;C)I", line = 389)
    public static final int method2049(int arg0, String arg1, char arg2) {
        if (arg0 != 500) {
            method2047(-32, 93, (String) null, (byte[]) null, 91, 28);
        }
        field4260++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)Lqb;", line = 417)
    public static final class27 method2050(byte arg0, int arg1) {
        if (arg0 > -82) {
            return (class27) null;
        }
        field4280++;
        if (arg1 == 0) {
            return new class320();
        } else if (arg1 == 1) {
            return new class136();
        } else if (arg1 == 2) {
            return new class104();
        } else if (arg1 == 3) {
            return new class362();
        } else if (arg1 == 4) {
            return new class169();
        } else if (arg1 == 5) {
            return new class322();
        } else if (arg1 == 6) {
            return new class89();
        } else if (arg1 == 7) {
            return new class132();
        } else if (arg1 == 8) {
            return new class203();
        } else if (arg1 == 9) {
            return new class304();
        } else if (arg1 == 10) {
            return new class334();
        } else if (arg1 == 11) {
            return new class157();
        } else if (arg1 == 12) {
            return new class299();
        } else if (arg1 == 13) {
            return new class150();
        } else if (arg1 == 14) {
            return new class18();
        } else if (arg1 == 15) {
            return new class276();
        } else if (arg1 == 16) {
            return new class160();
        } else if (arg1 == 17) {
            return new class86();
        } else if (arg1 == 18) {
            return new class237();
        } else if (arg1 == 19) {
            return new class275();
        } else if (arg1 == 20) {
            return new class340();
        } else if (arg1 == 21) {
            return new class208();
        } else if (arg1 == 22) {
            return new class197();
        } else if (arg1 == 23) {
            return new class74();
        } else if (arg1 == 24) {
            return new class51();
        } else if (arg1 == 25) {
            return new class56();
        } else if (arg1 == 26) {
            return new class173();
        } else if (arg1 == 27) {
            return new class321();
        } else if (arg1 == 28) {
            return new class50();
        } else if (arg1 == 29) {
            return new class312();
        } else if (arg1 == 30) {
            return new class3();
        } else if (arg1 == 31) {
            return new class58();
        } else if (arg1 == 32) {
            return new class244();
        } else if (arg1 == 33) {
            return new class49();
        } else if (arg1 == 34) {
            return new class253();
        } else if (arg1 == 35) {
            return new class91();
        } else if (arg1 == 36) {
            return new class202();
        } else if (arg1 == 37) {
            return new class108();
        } else if (arg1 == 38) {
            return new class125();
        } else if (arg1 == 39) {
            return new class360();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[III)Z", line = 739)
    public final boolean method2051(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field4261++;
        if (arg0 >= -120) {
            this.method2044((byte) -38);
        }
        for (class99 var6 = (class99) this.field4266.method93((byte) -32); var6 != null; var6 = (class99) this.field4266.method97(-102)) {
            if (var6.method776(arg1, false, arg3, arg4)) {
                var6.method781(arg1, arg2, -58, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V", line = 771)
    public static final void method2052(int arg0) {
        field4273++;
        if (arg0 != 13925) {
            field4263 = 16;
        }
        class47.field704 = null;
        class102.field1470 = null;
        class158.field2271 = null;
        class270.field4100 = null;
        class338.field5243 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[II)Z", line = 795)
    public final boolean method2053(int arg0, int arg1, int[] arg2, int arg3) {
        field4274++;
        for (class99 var5 = (class99) this.field4266.method93((byte) -63); var5 != null; var5 = (class99) this.field4266.method97(-103)) {
            if (var5.method777(arg0 ^ 0xFFFFDFDC, arg1, arg3)) {
                var5.method781(arg1, arg2, -67, arg3);
                return true;
            }
        }
        if (arg0 != -8226) {
            method2049(-90, (String) null, '\u001c');
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII)Z", line = 830)
    public final boolean method2054(boolean arg0, int arg1, int arg2) {
        field4279++;
        for (class99 var4 = (class99) this.field4266.method93((byte) -32); var4 != null; var4 = (class99) this.field4266.method97(-68)) {
            if (var4.method777(2, arg2, arg1)) {
                return true;
            }
        }
        if (!arg0) {
            method2050((byte) -25, -124);
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II[II)Z", line = 852)
    public final boolean method2055(int arg0, int arg1, int[] arg2, int arg3) {
        field4257++;
        for (class99 var5 = (class99) this.field4266.method93((byte) -33); var5 != null; var5 = (class99) this.field4266.method97(-83)) {
            if (var5.method780(arg0, (byte) 102, arg3)) {
                var5.method779(arg3, arg2, -102, arg0);
                return true;
            }
        }
        if (arg1 != 24558) {
            this.field4277 = 38;
        }
        return false;
    }
}
