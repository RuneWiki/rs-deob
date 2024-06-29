import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class41 extends class252 {

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field621 = -1;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "[I")
    public static int[] field622 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "Lti;")
    public static class5 field630 = new class5(64);

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "Z")
    public static boolean field633 = false;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field632 = -1;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)I")
    public static final int method283(int arg0, int arg1) {
        field623++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        if (arg0 != 557829249) {
            field630 = null;
        }
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V")
    public static final void method284(int arg0) {
        field629++;
        if (arg0 != 0) {
            method284(-122);
        }
        class63.field1010.method1873(-7401);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)Z")
    public abstract boolean method249(byte arg0);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLhd;II)V")
    public static final void method285(byte arg0, class12 arg1, int arg2, int arg3) {
        if (arg0 != 20) {
            method285((byte) -25, (class12) null, -52, 51);
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field898 = class229.field3584.method1867((byte) -69);
            arg1.field895 = class229.field3584.method1867((byte) -103);
        }
        field624++;
        if ((arg2 & 0x80) != 0) {
            int var4 = class229.field3584.method1863((byte) -102);
            int var5 = class229.field3584.method1849(255);
            arg1.method398(var4, var5, 0, class274.field4472);
            arg1.field937 = class274.field4472 + 300;
            arg1.field949 = class229.field3584.method1871((byte) -33);
        }
        if ((arg2 & 0x2) != 0) {
            int var6 = class229.field3584.method1867((byte) -98);
            int var7 = class229.field3584.method1854(false);
            int var8 = class229.field3584.method1854(false);
            int var9 = class229.field3584.field4458;
            boolean var10 = (var6 & 0x8000) != 0;
            if (arg1.field222 != null && arg1.field232 != null) {
                long var11 = class162.method1114((byte) -115, arg1.field222);
                boolean var13 = false;
                if (var7 <= 1) {
                    if (var10 || (!class86.field1357 || class91.field1450) && !class25.field457) {
                        for (int var14 = 0; var14 < class34.field562; var14++) {
                            if (class161.field2634[var14] == var11) {
                                var13 = true;
                                break;
                            }
                        }
                    } else {
                        var13 = true;
                    }
                }
                if (!var13 && class306.field4983 == 0) {
                    class271.field4362.field4458 = 0;
                    int var15 = -1;
                    class229.field3584.method1810(var8, 0, 71, class271.field4362.field4441);
                    class271.field4362.field4458 = 0;
                    String var16;
                    if (var10) {
                        var6 &= 0x7FFF;
                        class148 var17 = class168.method1197(class271.field4362, true);
                        var15 = var17.field2361;
                        var16 = var17.field2362.method1745(class271.field4362, 0);
                    } else {
                        var16 = class73.method529(class5.method64(false, class124.method856(0, class271.field4362)));
                    }
                    arg1.field974 = var16.trim();
                    arg1.field950 = var6 & 0xFF;
                    arg1.field914 = 150;
                    arg1.field935 = var6 >> 8;
                    if (var7 == 2) {
                        class35.method258(var16, (String) null, var15, "<img=1>" + arg1.method105(arg0 ^ 0xFFFFFCEF), var10 ? 17 : 1, -1);
                    } else if (var7 == 1) {
                        class35.method258(var16, (String) null, var15, "<img=0>" + arg1.method105(arg0 ^ 0xFFFFFCEF), var10 ? 17 : 1, arg0 - 21);
                    } else {
                        class35.method258(var16, (String) null, var15, arg1.method105(arg0 - 793), var10 ? 17 : 2, -1);
                    }
                }
            }
            class229.field3584.field4458 = var9 + var8;
        }
        if ((arg2 & 0x800) != 0) {
            int var18 = class229.field3584.method1863((byte) 66);
            int var19 = class229.field3584.method1849(255);
            arg1.method398(var18, var19, 0, class274.field4472);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field960 = class229.field3584.method1826(30334);
            arg1.field985 = class229.field3584.method1849(arg0 + 235);
            arg1.field989 = class229.field3584.method1871((byte) -33);
            arg1.field928 = class229.field3584.method1871((byte) -33);
            arg1.field912 = class229.field3584.method1815(arg0 ^ 0xFFFFFF8A) + class274.field4472;
            arg1.field967 = class229.field3584.method1829(-119) + class274.field4472;
            arg1.field953 = class229.field3584.method1826(30334);
            arg1.field943 = 0;
            arg1.field936 = 1;
        }
        if ((arg2 & 0x200) != 0) {
            int var20 = class229.field3584.method1871((byte) -33);
            int[] var21 = new int[var20];
            int[] var22 = new int[var20];
            int[] var23 = new int[var20];
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = class229.field3584.method1815(-101);
                if (var25 == 65535) {
                    var25 = -1;
                }
                var22[var24] = var25;
                var21[var24] = class229.field3584.method1871((byte) -33);
                var23[var24] = class229.field3584.method1815(-93);
            }
            class143.method986(90, var21, var22, arg1, var23);
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field974 = class229.field3584.method1855(arg0 + 74);
            if (arg1.field974.charAt(0) == '~') {
                arg1.field974 = arg1.field974.substring(1);
                class74.method536(arg1.field974, arg1.method105(-773), (byte) -101, 2);
            } else if (class217.field3408 == arg1) {
                class74.method536(arg1.field974, arg1.method105(arg0 ^ 0xFFFFFCEF), (byte) -128, 2);
            }
            arg1.field914 = 150;
            arg1.field935 = 0;
            arg1.field950 = 0;
        }
        if ((arg2 & 0x10) != 0) {
            int var26 = class229.field3584.method1815(-112);
            if (var26 == 65535) {
                var26 = -1;
            }
            int var27 = class229.field3584.method1854(false);
            class36.method262(var26, arg1, true, var27);
        }
        if ((arg2 & 0x100) != 0) {
            int var28 = class229.field3584.method1829(arg0 - 140);
            int var29 = class229.field3584.method1833((byte) -104);
            if (var28 == 65535) {
                var28 = -1;
            }
            boolean var30 = true;
            if (var28 != -1 && arg1.field995 != -1 && class159.method1085((byte) -63, class166.method1182(1, var28).field2486).field1447 < class159.method1085((byte) -63, class166.method1182(1, arg1.field995).field2486).field1447) {
                var30 = false;
            }
            if (var30) {
                arg1.field979 = 0;
                arg1.field911 = 0;
                arg1.field896 = class274.field4472 + (var29 & 0xFFFF);
                arg1.field901 = var29 >> 16;
                arg1.field995 = var28;
                if (arg1.field896 > class274.field4472) {
                    arg1.field911 = -1;
                }
                arg1.field919 = 1;
                if (arg1.field995 != -1 && class274.field4472 == arg1.field896) {
                    int var31 = class166.method1182(1, arg1.field995).field2486;
                    if (var31 != -1) {
                        class91 var32 = class159.method1085((byte) -63, var31);
                        if (var32 != null && var32.field1434 != null) {
                            class252.method1710(0, arg1.field929, var32, arg1.field994, class217.field3408 == arg1, 96);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var33 = class229.field3584.method1854(false);
            byte[] var34 = new byte[var33];
            class274 var35 = new class274(var34);
            class229.field3584.method1845(128, 0, var34, var33);
            class191.field3113[arg3] = var35;
            arg1.method98(var35, (byte) -55);
        }
        if ((arg2 & 0x8) == 0) {
            return;
        }
        arg1.field998 = class229.field3584.method1867((byte) -109);
        if (arg1.field998 == 65535) {
            arg1.field998 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)I")
    public static final int method286(int arg0, int arg1, int arg2) {
        field627++;
        if (arg2 != 32) {
            field625 = 48;
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public static void method287(boolean arg0) {
        field622 = null;
        field630 = null;
        if (arg0) {
            field620 = 73;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lsg;IIIIII)Z")
    public static final boolean method288(class172 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field628++;
        class159 var7 = class274.method1819(arg0.field2875, -20535);
        if (var7.field2598 == -1) {
            return true;
        }
        int var8;
        if (arg0.field2813) {
            int var9 = arg0.field2876 + arg1;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class2 var10 = var7.method1087(1265215536, var8, arg0.field2868);
        if (arg3 != 4) {
            return false;
        } else if (var10 == null) {
            return false;
        } else {
            int var11 = arg0.field2821;
            int var12 = arg0.field2809;
            int var13 = var10.field3177;
            int var14 = var10.field3178;
            if ((var8 & 0x1) == 1) {
                var11 = arg0.field2809;
                var12 = arg0.field2821;
            }
            if (var7.field2606) {
                var13 = var11 * 4;
                var14 = var12 * 4;
            }
            if (var7.field2595 == 0) {
                var10.method8((arg2 * 4) + 48, 48 - -((-arg6 + -var12 + 104) * 4), var13, var14);
            } else {
                var10.method12(arg2 * 4 + 48, (104 - var12 + -arg6) * 4 + 48, var13, var14, var7.field2595);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method245(int arg0);
}
