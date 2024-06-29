import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class361 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
    public static boolean field5067 = false;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field5072 = 0;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[Z")
    public static boolean[] field5070 = new boolean[8];

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field5073 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[[[B")
    public static byte[][][] field5069;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z[[[Luk;)V")
    public static final void method2325(boolean arg0, class142[][][] arg1) {
        if (arg0) {
            method2326(-62, 107, -96);
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class142[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class142 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2047 instanceof class161) {
                            ((class161) var6.field2047).method138(-4728);
                        }
                        if (var6.field2052 instanceof class161) {
                            ((class161) var6.field2052).method138(-4728);
                        }
                        if (var6.field2035 instanceof class161) {
                            ((class161) var6.field2035).method138(-4728);
                        }
                        if (var6.field2031 instanceof class161) {
                            ((class161) var6.field2031).method138(-4728);
                        }
                        if (var6.field2044 instanceof class161) {
                            ((class161) var6.field2044).method138(-4728);
                        }
                        for (class218 var7 = var6.field2043; var7 != null; var7 = var7.field2884) {
                            class430 var8 = var7.field2882;
                            if (var8 instanceof class161) {
                                ((class161) var8).method138(-4728);
                            }
                        }
                    }
                }
            }
        }
        field5066++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public static final void method2326(int arg0, int arg1, int arg2) {
        class27.field432 = new class190(arg1);
        field5071++;
        class299.field4141 = new class190(arg2);
        if (arg0 != -25117) {
            method2327((class354) null, -40, -120, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lke;IIB)V")
    public static final void method2327(class354 arg0, int arg1, int arg2, byte arg3) {
        if ((arg1 & 0x4) != 0) {
            arg0.field919 = class393.field5747.method2403((byte) 115);
            arg0.field854 = class393.field5747.method2435((byte) 79);
        }
        if (arg3 < 116) {
            field5069 = null;
        }
        field5065++;
        if ((arg1 & 0x10) != 0) {
            arg0.field915 = class393.field5747.method2432((byte) 112);
            if (arg0.field915 == 65535) {
                arg0.field915 = -1;
            }
        }
        if ((arg1 & 0x80) != 0) {
            int var4 = class393.field5747.method2433(-38);
            int var5 = class393.field5747.method2388((byte) 97);
            arg0.method415(class35.field541, var5, var4, (byte) -107);
            arg0.field868 = class35.field541 + 300;
            arg0.field913 = class393.field5747.method2382(false);
        }
        if ((arg1 & 0x200) != 0) {
            int var6 = class393.field5747.method2432((byte) 108);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class393.field5747.method2413((byte) -30);
            boolean var8 = true;
            if (var6 != -1 && arg0.field877 != -1) {
                if (arg0.field877 == var6) {
                    class69 var9 = class221.method1405(var6, -116);
                    if (var9.field1086 && var9.field1076 != -1) {
                        class449 var10 = class86.method599(false, var9.field1076);
                        int var11 = var10.field6516;
                        if (var11 == 0) {
                            var8 = false;
                        } else if (var11 == 1) {
                            var8 = true;
                        } else if (var11 == 2) {
                            var8 = false;
                            arg0.field864 = 0;
                        }
                    }
                } else {
                    class69 var12 = class221.method1405(var6, 86);
                    class69 var13 = class221.method1405(arg0.field877, 125);
                    if (var12.field1076 != -1 && var13.field1076 != -1) {
                        class449 var14 = class86.method599(false, var12.field1076);
                        class449 var15 = class86.method599(false, var13.field1076);
                        if (var14.field6504 < var15.field6504) {
                            var8 = false;
                        }
                    }
                }
            }
            if (var8) {
                arg0.field930 = 0;
                arg0.field908 = var7 >> 16;
                arg0.field924 = 1;
                arg0.field897 = (var7 & 0xFFFF) + class35.field541;
                arg0.field877 = var6;
                arg0.field934 = 0;
                if (class35.field541 < arg0.field897) {
                    arg0.field934 = -1;
                }
                if (arg0.field877 != -1 && class35.field541 == arg0.field897) {
                    int var16 = class221.method1405(arg0.field877, -61).field1076;
                    if (var16 != -1) {
                        class449 var17 = class86.method599(false, var16);
                        if (var17 != null && var17.field6521 != null) {
                            class27.method218(class307.field4211 == arg0, (byte) -85, var17, 0, arg0.field6192, arg0.field6197);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x1) != 0) {
            arg0.field909 = class393.field5747.method2422(-1);
            if (arg0.field909.charAt(0) == '~') {
                arg0.field909 = arg0.field909.substring(1);
                class216.method1381(0, (byte) -125, arg0.method2291(true, (byte) 127), arg0.method2288(false, (byte) 43), arg0.field909, 2);
            } else if (class307.field4211 == arg0) {
                class216.method1381(0, (byte) -124, arg0.method2291(true, (byte) 112), arg0.method2288(false, (byte) 43), arg0.field909, 2);
            }
            arg0.field891 = 150;
            arg0.field893 = 0;
            arg0.field870 = 0;
        }
        if ((arg1 & 0x20) != 0) {
            int var18 = class393.field5747.method2400((byte) 123);
            byte[] var19 = new byte[var18];
            class371 var20 = new class371(var19);
            class393.field5747.method2394(-75, 0, var18, var19);
            class257.field3502[arg2] = var20;
            arg0.method2289(-1264, var20);
        }
        if ((arg1 & 0x100) != 0) {
            int var21 = class393.field5747.method2429(0);
            int[] var22 = new int[var21];
            int[] var23 = new int[var21];
            int[] var24 = new int[var21];
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = class393.field5747.method2389(89);
                if (var26 == 65535) {
                    var26 = -1;
                }
                var22[var25] = var26;
                var23[var25] = class393.field5747.method2429(0);
                var24[var25] = class393.field5747.method2432((byte) 125);
            }
            class21.method145(var22, false, arg0, var24, var23);
        }
        if ((arg1 & 0x800) != 0) {
            int var27 = class393.field5747.method2403((byte) 67);
            arg0.field888 = class393.field5747.method2382(false);
            arg0.field918 = class393.field5747.method2388((byte) 127);
            arg0.field926 = var27 & 0x7FFF;
            arg0.field907 = (var27 & 0x8000) != 0;
            arg0.field857 = class35.field541 + arg0.field926 + arg0.field888;
        }
        if ((arg1 & 0x40) != 0) {
            int var28 = class393.field5747.method2435((byte) 96);
            int var29 = class393.field5747.method2382(false);
            int var30 = class393.field5747.method2400((byte) 123);
            int var31 = class393.field5747.field5273;
            boolean var32 = (var28 & 0x8000) != 0;
            if (arg0.field4994 != null && arg0.field4965 != null) {
                boolean var33 = false;
                if (var29 <= 1) {
                    if (!var32 && !(!class396.field5786 || class192.field2665) || class190.field2645) {
                        var33 = true;
                    } else if (class364.method2339(arg0.field4994, (byte) 126)) {
                        var33 = true;
                    }
                }
                if (!var33 && class58.field831 == 0) {
                    class194.field2692.field5273 = 0;
                    class393.field5747.method2421(var30, class194.field2692.field5258, (byte) -17, 0);
                    class194.field2692.field5273 = 0;
                    int var34 = -1;
                    String var36;
                    if (var32) {
                        var28 &= 0x7FFF;
                        class275 var35 = class417.method2657((byte) -31, class194.field2692);
                        var34 = var35.field3736;
                        var36 = var35.field3732.method982((byte) 58, class194.field2692);
                    } else {
                        var36 = class378.method2472(class202.method1335(class358.method2316(32767, class194.field2692), -24073), (byte) 106);
                    }
                    arg0.field909 = var36.trim();
                    arg0.field891 = 150;
                    arg0.field870 = var28 >> 8;
                    arg0.field893 = var28 & 0xFF;
                    int var37;
                    if (var29 == 1 || var29 == 2) {
                        var37 = var32 ? 17 : 1;
                    } else {
                        var37 = var32 ? 17 : 2;
                    }
                    if (var29 == 2) {
                        class70.method479(var34, var37, (String) null, 0, "<img=1>" + arg0.method2288(false, (byte) 43), var36, -1, "<img=1>" + arg0.method2291(true, (byte) 114));
                    } else if (var29 == 1) {
                        class70.method479(var34, var37, (String) null, 0, "<img=0>" + arg0.method2288(false, (byte) 43), var36, -1, "<img=0>" + arg0.method2291(true, (byte) 95));
                    } else {
                        class70.method479(var34, var37, (String) null, 0, arg0.method2288(false, (byte) 43), var36, -1, arg0.method2291(true, (byte) 109));
                    }
                }
            }
            class393.field5747.field5273 = var30 + var31;
        }
        if ((arg1 & 0x8) != 0) {
            int var38 = class393.field5747.method2435((byte) 124);
            if (var38 == 65535) {
                var38 = -1;
            }
            int var39 = class393.field5747.method2400((byte) 123);
            class69.method474(63, arg0, var38, var39);
        }
        if ((arg1 & 0x1000) != 0) {
            arg0.field852 = class393.field5747.method2429(0);
            arg0.field901 = class393.field5747.method2429(0);
            arg0.field871 = class393.field5747.method2400((byte) 123);
            arg0.field867 = class393.field5747.method2382(false);
            arg0.field912 = class393.field5747.method2435((byte) 77) + class35.field541;
            arg0.field922 = class393.field5747.method2432((byte) 113) + class35.field541;
            arg0.field873 = class393.field5747.method2382(false);
            arg0.field947 = 0;
            arg0.field948 = 1;
        }
        if ((arg1 & 0x400) != 0) {
            int var40 = class393.field5747.method2433(-113);
            int var41 = class393.field5747.method2400((byte) 123);
            arg0.method415(class35.field541, var41, var40, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method2328(int arg0) {
        if (arg0 != 1) {
            method2329((byte) -105, -5);
        }
        field5069 = null;
        field5070 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)V")
    public static final void method2329(byte arg0, int arg1) {
        field5068++;
        if (arg0 <= 23) {
            field5067 = false;
        }
        class124 var2 = (class124) class71.field1103.method1412((byte) -54, (long) arg1);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field1744.length; var3++) {
                var2.field1744[var3] = -1;
                var2.field1740[var3] = 0;
            }
        }
    }
}
