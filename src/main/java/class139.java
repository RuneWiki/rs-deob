import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class139 {

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lee;")
    private class195 field2014 = new class195();

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    private int field2012;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Ldb;")
    private class39 field2019;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lki;")
    public static class158 field2016;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)V")
    public final void method938(int arg0, byte arg1) {
        if (class51.field824 != null) {
            for (class37 var3 = (class37) this.field2014.method1318((byte) -97); var3 != null; var3 = (class37) this.field2014.method1317(-3668)) {
                if (var3.method293(true)) {
                    if (var3.method291(22473) == null) {
                        var3.method1193(119);
                        var3.method1746(-75);
                        this.field2008++;
                    }
                } else if (((long) arg0) < (++var3.field3978)) {
                    class37 var4 = class51.field824.method1195(-30558, var3);
                    this.field2019.method309((byte) -8, var4, var3.field2628);
                    class153.method1039(var4, var3, 14);
                    var3.method1193(arg1 + 232);
                    var3.method1746(115);
                }
            }
        }
        if (arg1 == -123) {
            field2015++;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public static final void method939(int arg0, int arg1) {
        class178.method1175(0);
        class214.method1442(false);
        int var2 = class236.method1591(arg1, 20909).field956;
        field2010++;
        if (var2 == 0) {
            return;
        }
        if (arg0 != 17) {
            method939(-67, 0);
        }
        int var3 = class166.field2447[arg1];
        if (var2 == 5) {
            class205.field3078 = var3;
        }
        if (var2 == 6) {
            class62.field1033 = var3;
        }
        if (var2 == 9) {
            class275.field4237 = var3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public final void method940(int arg0) {
        field2022++;
        this.field2014.method1320(false);
        this.field2019.method305((byte) -67);
        this.field2008 = this.field2012;
        if (arg0 <= 11) {
            method947((byte) 9);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method941(Object arg0, long arg1, int arg2) {
        this.method948(arg2 ^ 0xFFFFDF77, arg1);
        field2017++;
        if (this.field2008 == 0) {
            class37 var5 = (class37) this.field2014.method1312((byte) -27);
            var5.method1193(arg2 ^ 0xFFFFDF70);
            var5.method1746(38);
        } else {
            this.field2008--;
        }
        class59 var6 = new class59(arg0);
        if (arg2 == -8447) {
            this.field2019.method309((byte) -8, var6, arg1);
            this.field2014.method1315((byte) -48, var6);
            var6.field3978 = 0L;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BIIII[Lql;IZIB)V")
    public static final void method942(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class78[] arg6, int arg7, boolean arg8, int arg9, byte arg10) {
        if (arg10 != -120) {
            return;
        }
        field2009++;
        int var11 = -1;
        class54 var12 = new class54(arg1);
        while (true) {
            int var13 = var12.method434(65280);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method436(126);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method407(255);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg5 == var18 && var17 >= arg9 && arg9 + 8 > var17 && arg3 <= var16 && arg3 + 8 > var16) {
                    class188 var22 = class3.method42(1, var11);
                    int var23 = class55.method464(var17 & 0x7, var21, 8, arg7, var16 & 0x7, var22.field2757, var22.field2805) + arg0;
                    int var24 = class251.method1714(var16 & 0x7, var22.field2757, var22.field2805, var17 & 0x7, arg7, (byte) -110, var21) + arg2;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class78 var25 = null;
                        if (!arg8) {
                            int var26 = arg4;
                            if ((class247.field3844[1][var23][var24] & 0x2) == 2) {
                                var26 = arg4 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg6[var26];
                            }
                        }
                        class177.method1169(true, var11, !arg8, var24, arg7 + var21 & 0x3, var23, arg8, var20, arg4, arg4, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lgk;IBI)V")
    public static final void method943(class224 arg0, int arg1, byte arg2, int arg3) {
        field2011++;
        if ((arg3 & 0x40) != 0) {
            int var4 = class173.field2543.method450(-96);
            byte[] var5 = new byte[var4];
            class54 var6 = new class54(var5);
            class173.field2543.method410(-251030480, var5, var4, 0);
            class85.field1302[arg1] = var6;
            arg0.method1527(var6, (byte) 45);
        }
        if ((arg3 & 0x100) != 0) {
            int var7 = class173.field2543.method421(255);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class173.field2543.method420((byte) 18);
            boolean var9 = true;
            if (var7 != -1 && arg0.field491 != -1 && class108.method781(class296.method1957(var7, true).field1516, -1).field3427 < class108.method781(class296.method1957(arg0.field491, true).field1516, -1).field3427) {
                var9 = false;
            }
            if (var9) {
                arg0.field459 = 1;
                arg0.field491 = var7;
                arg0.field415 = var8 >> 16;
                arg0.field460 = 0;
                arg0.field488 = 0;
                arg0.field418 = class120.field1794 + (var8 & 0xFFFF);
                if (class120.field1794 < arg0.field418) {
                    arg0.field488 = -1;
                }
                if (arg0.field491 != -1 && class120.field1794 == arg0.field418) {
                    int var10 = class296.method1957(arg0.field491, true).field1516;
                    if (var10 != -1) {
                        class220 var11 = class108.method781(var10, -1);
                        if (var11 != null && var11.field3413 != null) {
                            class244.method1664(arg0.field455, class185.field2687 == arg0, 0, arg0.field425, 8890, var11);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x400) != 0) {
            int var12 = class173.field2543.method450(-120);
            int[] var13 = new int[var12];
            int[] var14 = new int[var12];
            int[] var15 = new int[var12];
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = class173.field2543.method447(30925);
                if (var17 == 65535) {
                    var17 = -1;
                }
                var14[var16] = var17;
                var13[var16] = class173.field2543.method407(255);
                var15[var16] = class173.field2543.method447(30925);
            }
            class89.method671(var15, (byte) -1, var14, var13, arg0);
        }
        if ((arg3 & 0x2) != 0) {
            int var18 = class173.field2543.method397(115);
            int var19 = class173.field2543.method401((byte) -31);
            int var20 = class173.field2543.method401((byte) -113);
            boolean var21 = (var18 & 0x8000) != 0;
            int var22 = class173.field2543.field887;
            if (arg0.field3488 != null && arg0.field3487 != null) {
                boolean var23 = false;
                long var24 = class37.method286(25077, arg0.field3488);
                if (var19 <= 1) {
                    if (var21 || (!class180.field2623 || class275.field4238) && !class199.field2991) {
                        for (int var26 = 0; var26 < class206.field3090; var26++) {
                            if (class51.field831[var26] == var24) {
                                var23 = true;
                                break;
                            }
                        }
                    } else {
                        var23 = true;
                    }
                }
                if (!var23 && class167.field2465 == 0) {
                    class206.field3085.field887 = 0;
                    int var27 = -1;
                    class173.field2543.method449(0, class206.field3085.field848, var20, -294208048);
                    class206.field3085.field887 = 0;
                    String var29;
                    if (var21) {
                        var18 &= 0x7FFF;
                        class138 var28 = class278.method1851(class206.field3085, (byte) 118);
                        var27 = var28.field2000;
                        var29 = var28.field2004.method1674(class206.field3085, 1);
                    } else {
                        var29 = class192.method1297(class176.method1163(class226.method1548(107, class206.field3085), (byte) -94));
                    }
                    arg0.field429 = var29.trim();
                    arg0.field451 = 150;
                    arg0.field489 = var18 >> 8;
                    arg0.field496 = var18 & 0xFF;
                    if (var19 == 2) {
                        class163.method1105(var27, -2694, var21 ? 17 : 1, "<img=1>" + arg0.method1534(110), var29, (String) null);
                    } else if (var19 == 1) {
                        class163.method1105(var27, -2694, var21 ? 17 : 1, "<img=0>" + arg0.method1534(-127), var29, (String) null);
                    } else {
                        class163.method1105(var27, -2694, var21 ? 17 : 2, arg0.method1534(-103), var29, (String) null);
                    }
                }
            }
            class173.field2543.field887 = var20 + var22;
        }
        if ((arg3 & 0x10) != 0) {
            int var30 = class173.field2543.method436(126);
            int var31 = class173.field2543.method450(-109);
            arg0.method176(var30, var31, (byte) -113, class120.field1794);
            arg0.field487 = class120.field1794 + 300;
            arg0.field406 = class173.field2543.method450(-123);
        }
        if ((arg3 & 0x80) != 0) {
            arg0.field417 = class173.field2543.method397(93);
            arg0.field474 = class173.field2543.method397(119);
        }
        if ((arg3 & 0x200) != 0) {
            int var32 = class173.field2543.method436(126);
            int var33 = class173.field2543.method450(-110);
            arg0.method176(var32, var33, (byte) -95, class120.field1794);
        }
        if ((arg3 & 0x20) != 0) {
            int var34 = class173.field2543.method397(31);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = class173.field2543.method401((byte) -49);
            class133.method914(100, arg0, var35, var34);
        }
        if ((arg3 & 0x800) != 0) {
            arg0.field404 = class173.field2543.method450(-96);
            arg0.field428 = class173.field2543.method407(255);
            arg0.field462 = class173.field2543.method448(128);
            arg0.field477 = class173.field2543.method407(255);
            arg0.field495 = class173.field2543.method421(255) + class120.field1794;
            arg0.field442 = class173.field2543.method421(255) + class120.field1794;
            arg0.field481 = class173.field2543.method407(255);
            arg0.field441 = 1;
            arg0.field426 = 0;
        }
        if (arg2 >= -122) {
            return;
        }
        if ((arg3 & 0x1) != 0) {
            arg0.field430 = class173.field2543.method447(30925);
            if (arg0.field430 == 65535) {
                arg0.field430 = -1;
            }
        }
        if ((arg3 & 0x8) == 0) {
            return;
        }
        arg0.field429 = class173.field2543.method439((byte) -64);
        if (arg0.field429.charAt(0) == '~') {
            arg0.field429 = arg0.field429.substring(1);
            class260.method1759(2, arg0.method1534(-109), 128, arg0.field429);
        } else if (class185.field2687 == arg0) {
            class260.method1759(2, arg0.method1534(93), 128, arg0.field429);
        }
        arg0.field451 = 150;
        arg0.field489 = 0;
        arg0.field496 = 0;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public final void method944(int arg0) {
        for (class37 var2 = (class37) this.field2014.method1318((byte) -97); var2 != null; var2 = (class37) this.field2014.method1317(-3668)) {
            if (var2.method293(true)) {
                var2.method1193(arg0 - 65425);
                var2.method1746(-125);
                this.field2008++;
            }
        }
        field2005++;
        if (arg0 != 65535) {
            this.method938(111, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
    public final Object method945(long arg0, boolean arg1) {
        class37 var4 = (class37) this.field2019.method306(arg0, 16216);
        field2013++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method291(22473);
        if (var5 == null) {
            var4.method1193(113);
            var4.method1746(-76);
            this.field2008++;
            return null;
        }
        if (var4.method293(arg1)) {
            class59 var6 = new class59(var5);
            this.field2019.method309((byte) -8, var6, var4.field2628);
            this.field2014.method1315((byte) -48, var6);
            var6.field3978 = 0L;
            var4.method1193(118);
            var4.method1746(70);
        } else {
            this.field2014.method1315((byte) -48, var4);
            var4.field3978 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public static final void method946(int arg0) {
        for (int var1 = 0; var1 < class244.field3790; var1++) {
            class58 var2 = class236.method1591(var1, 20909);
            if (var2 != null && var2.field956 == 0) {
                class234.field3607[var1] = 0;
                class166.field2447[var1] = 0;
            }
        }
        field2007++;
        class47.field797 = new class39(16);
        if (arg0 != -1) {
            method947((byte) 51);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static void method947(byte arg0) {
        field2016 = null;
        if (arg0 < 90) {
            field2016 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJ)V")
    public final void method948(int arg0, long arg1) {
        field2020++;
        class37 var4 = (class37) this.field2019.method306(arg1, 16216);
        if (arg0 < 40) {
            this.method945(-25L, true);
        }
        if (var4 != null) {
            var4.method1193(109);
            var4.method1746(-68);
            this.field2008++;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I")
    public final int method949(int arg0) {
        field2021++;
        int var2 = arg0;
        for (class37 var3 = (class37) this.field2014.method1318((byte) -102); var3 != null; var3 = (class37) this.field2014.method1317(-3668)) {
            if (!var3.method293(true)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        this.field2008 = arg0;
        this.field2012 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2019 = new class39(var2);
    }
}
