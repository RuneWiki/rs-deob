import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class234 extends class259 {

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "[S")
    private short[] field4167 = new short[257];

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
    private int field4171 = 0;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "Lsg;")
    public static class30 field4163 = class167.method1221((byte) 33, "hint_headicons");

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "Llk;")
    public static class232 field4165 = new class232(50);

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lsg;")
    private static class30 field4172 = class167.method1221((byte) 33, "Sat");

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lsg;")
    private static class30 field4173 = class167.method1221((byte) 33, "Wed");

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "Lsg;")
    private static class30 field4176 = class167.method1221((byte) 33, "Tue");

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lsg;")
    private static class30 field4174 = class167.method1221((byte) 33, "Mon");

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "Lsg;")
    private static class30 field4178 = class167.method1221((byte) 33, "Fri");

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "Lsg;")
    private static class30 field4175 = class167.method1221((byte) 33, "Thu");

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "Lsg;")
    private static class30 field4179 = class167.method1221((byte) 33, "Sun");

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "[Lsg;")
    public static class30[] field4177 = new class30[] { field4179, field4174, field4176, field4173, field4175, field4178, field4172 };

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "[I")
    private int[] field4159;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "[I")
    private int[] field4166;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "[[I")
    private int[][] field4158;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field4156;
        if (arg1) {
            field4163 = null;
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int[] var4 = this.method1799(0, arg0, 124);
            for (int var5 = 0; ~var5 > ~class223.field3999; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4167[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([Ldl;IB)V")
    public static final void method1655(class31[] arg0, int arg1, byte arg2) {
        ++field4155;
        if (arg2 <= -37) {
            for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
                class31 var4 = arg0[var3];
                if (var4 != null) {
                    if (var4.field655 == 0) {
                        if (var4.field732 != null) {
                            method1655(var4.field732, arg1, (byte) -102);
                        }
                        class180 var5 = (class180) class143.field2762.method1168(-3, (long) var4.field638);
                        if (var5 != null) {
                            class185.method1325(var5.field3335, (byte) -57, arg1);
                        }
                    }
                    if (~arg1 == -1 && var4.field673 != null) {
                        class183 var6 = new class183();
                        var6.field3369 = var4;
                        var6.field3363 = var4.field673;
                        class104.method835(var6, (byte) 41);
                    }
                    if (~arg1 == -2 && var4.field779 != null) {
                        if (var4.field716 >= 0) {
                            class31 var7 = class272.method1858(var4.field638, 65535);
                            if (var7 == null || var7.field732 == null || ~var7.field732.length >= ~var4.field716 || var7.field732[var4.field716] != var4) {
                                continue;
                            }
                        }
                        class183 var8 = new class183();
                        var8.field3363 = var4.field779;
                        var8.field3369 = var4;
                        class104.method835(var8, (byte) 41);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
    public static final void method1656(int arg0, int arg1) {
        ++field4160;
        if (arg0 >= 0) {
            int var2 = class231.field4108[arg0];
            int var3 = class97.field1969[arg0];
            int var4 = class30.field602[arg0];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            int var5 = (int) class43.field1031[arg0];
            long var6 = class43.field1031[arg0];
            if (~var4 == -34) {
                ++class226.field4048;
                boolean var8 = class96.method786(var2, 0, 0, 0, 2, 0, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                if (!var8) {
                    class96.method786(var2, 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                }
                class36.field868 = 2;
                class150.field2847 = class32.field817;
                class44.field1035 = class183.field3365;
                class108.field2179 = 0;
                class196.field3553.method1267(190, -9);
                class196.field3553.method48(class196.field3547 + var3, 127);
                class196.field3553.method97(var5, (byte) -2);
                class196.field3553.method71(class22.field421 + var2, 255);
            }
            if (var4 == 1003) {
                class31 var10 = class272.method1858(var3, 65535);
                if (var10 != null && var10.field708[var2] >= 100000) {
                    class268.method1838(0, -1, class160.method1188(new class30[] { class73.method675(-31, var10.field708[var2]), class167.field3080, class201.method1425(62, var5).field3162 }, 0), class55.field1203);
                } else {
                    ++class2.field28;
                    class196.field3553.method1267(93, -9);
                    class196.field3553.method87(-55174520, var5);
                }
                class86.field1770 = 0;
                class168.field3106 = class272.method1858(var3, 65535);
                class71.field1614 = var2;
            }
            if (~var4 == -2) {
                ++class167.field3074;
                class196.field3553.method1267(91, -9);
                class196.field3553.method71(var5, 255);
                class196.field3553.method57(var3, 83);
                class196.field3553.method87(-55174520, var2);
                class86.field1770 = 0;
                class168.field3106 = class272.method1858(var3, 65535);
                class71.field1614 = var2;
            }
            if (~var4 == -52) {
                ++class79.field1705;
                boolean var11 = class96.method786(var2, 0, 0, 0, 2, 0, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                if (!var11) {
                    class96.method786(var2, 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                }
                class150.field2847 = class32.field817;
                class36.field868 = 2;
                class44.field1035 = class183.field3365;
                class108.field2179 = 0;
                class196.field3553.method1267(148, -9);
                class196.field3553.method48(var5, 76);
                class196.field3553.method87(-55174520, class22.field421 + var2);
                class196.field3553.method97(var3 - -class196.field3547, (byte) -2);
            }
            if (~var4 == -1003) {
                class108.field2179 = 0;
                ++class86.field1773;
                class150.field2847 = class32.field817;
                class44.field1035 = class183.field3365;
                class36.field868 = 2;
                class196.field3553.method1267(39, -9);
                class196.field3553.method71(var5, 255);
            }
            if (~var4 == -12) {
                class196.field3553.method1267(74, -9);
                class196.field3553.method57(var3, 62);
                ++class105.field2119;
                class196.field3553.method71(var2, 255);
                class196.field3553.method87(-55174520, var5);
                class86.field1770 = 0;
                class168.field3106 = class272.method1858(var3, 65535);
                class71.field1614 = var2;
            }
            if (var4 == 8) {
                class120 var13 = class75.field1670[var5];
                if (var13 != null) {
                    class96.method786(var13.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var13.field1372[0]);
                    class36.field868 = 2;
                    ++class246.field4390;
                    class108.field2179 = 0;
                    class44.field1035 = class183.field3365;
                    class150.field2847 = class32.field817;
                    class196.field3553.method1267(241, -9);
                    class196.field3553.method48(var5, 116);
                }
            }
            if (~var4 == -38) {
                class275 var14 = class125.field2443[var5];
                if (var14 != null) {
                    class96.method786(var14.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var14.field1372[0]);
                    class108.field2179 = 0;
                    class36.field868 = 2;
                    class44.field1035 = class183.field3365;
                    ++class20.field372;
                    class150.field2847 = class32.field817;
                    class196.field3553.method1267(58, -9);
                    class196.field3553.method87(-55174520, var5);
                    class196.field3553.method71(class125.field2445, 255);
                    class196.field3553.method94(class210.field3772, 103);
                }
            }
            if (~var4 == -39) {
                class196.field3553.method1267(4, -9);
                ++class147.field2815;
                class196.field3553.method89(var3, (byte) 119);
                class196.field3553.method87(-55174520, var5);
                class196.field3553.method71(var2, 255);
                class86.field1770 = 0;
                class168.field3106 = class272.method1858(var3, 65535);
                class71.field1614 = var2;
            }
            if (var4 == 9 && class138.method1040(var2, var6, var3, true)) {
                class196.field3553.method1267(86, -9);
                class196.field3553.method97(class22.field421 + var2, (byte) -2);
                class196.field3553.method87(-55174520, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class196.field3553.method48(class166.field3051, 60);
                ++class275.field4798;
                class196.field3553.method97(class236.field4225, (byte) -2);
                class196.field3553.method57(class174.field3253, 119);
                class196.field3553.method48(class196.field3547 + var3, 46);
            }
            if (~var4 == -40) {
                class31 var15 = class272.method1858(var3, 65535);
                boolean var16 = true;
                if (~var15.field664 < -1) {
                    var16 = class46.method462(var15, 890);
                }
                if (var16) {
                    ++class41.field1020;
                    class196.field3553.method1267(164, -9);
                    class196.field3553.method57(var3, 78);
                }
            }
            if (~var4 == -45 || var4 == 1005) {
                class228.method1624(var2, var5, var3, (byte) -127, class48.field1088[arg0]);
            }
            if (~var4 == -5) {
                class275 var17 = class125.field2443[var5];
                if (var17 != null) {
                    class96.method786(var17.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var17.field1372[0]);
                    class150.field2847 = class32.field817;
                    class108.field2179 = 0;
                    class36.field868 = 2;
                    class44.field1035 = class183.field3365;
                    class196.field3553.method1267(149, -9);
                    ++class21.field384;
                    class196.field3553.method97(var5, (byte) -2);
                }
            }
            if (var4 == 18) {
                class120 var18 = class75.field1670[var5];
                if (var18 != null) {
                    class96.method786(var18.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var18.field1372[0]);
                    ++class276.field4815;
                    class108.field2179 = 0;
                    class44.field1035 = class183.field3365;
                    class150.field2847 = class32.field817;
                    class36.field868 = 2;
                    class196.field3553.method1267(237, -9);
                    class196.field3553.method71(var5, 255);
                }
            }
            if (~var4 == -36) {
                class275 var19 = class125.field2443[var5];
                if (var19 != null) {
                    class96.method786(var19.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var19.field1372[0]);
                    class108.field2179 = 0;
                    class150.field2847 = class32.field817;
                    class36.field868 = 2;
                    class44.field1035 = class183.field3365;
                    class196.field3553.method1267(147, -9);
                    ++class277.field4828;
                    class196.field3553.method71(class166.field3051, 255);
                    class196.field3553.method57(class174.field3253, 109);
                    class196.field3553.method87(-55174520, class236.field4225);
                    class196.field3553.method87(-55174520, var5);
                }
            }
            if (var4 == 7) {
                ++class166.field3056;
                class196.field3553.method1267(121, -9);
                class196.field3553.method48(var5, 67);
                class196.field3553.method57(var3, 58);
                class196.field3553.method87(-55174520, var2);
                class86.field1770 = 0;
                class168.field3106 = class272.method1858(var3, 65535);
                class71.field1614 = var2;
            }
            if (~var4 == -4) {
                class138.method1040(var2, var6, var3, true);
                class196.field3553.method1267(143, -9);
                class196.field3553.method71((int) (var6 >>> 32) & Integer.MAX_VALUE, 255);
                ++class49.field1118;
                class196.field3553.method71(class22.field421 + var2, 255);
                class196.field3553.method71(var3 - -class196.field3547, 255);
            }
            if (var4 == 36 && class263.field4661 == null) {
                class46.method461(51, var2, var3);
                class263.field4661 = class122.method931(var2, (byte) 125, var3);
                class254.method1771(class263.field4661, 8);
            }
            if (var4 == 49) {
                class114.method891(5919);
                class31 var20 = class272.method1858(var3, 65535);
                class132.field2607 = 1;
                class236.field4225 = var2;
                class174.field3253 = var3;
                class166.field3051 = var5;
                class254.method1771(var20, 8);
                class173.field3234 = class160.method1188(new class30[] { class104.field2098, class201.method1425(101, var5).field3162, class270.field4757 }, 0);
                if (class173.field3234 == null) {
                    class173.field3234 = class129.field2536;
                }
            } else {
                if (var4 == 5) {
                    class196.field3553.method1267(134, -9);
                    ++class23.field432;
                    class196.field3553.method87(-55174520, var5);
                    class196.field3553.method64(var3, 1738089264);
                    class196.field3553.method97(var2, (byte) -2);
                    class86.field1770 = 0;
                    class168.field3106 = class272.method1858(var3, 65535);
                    class71.field1614 = var2;
                }
                if (var4 == 46) {
                    class120 var21 = class75.field1670[var5];
                    if (var21 != null) {
                        class96.method786(var21.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var21.field1372[0]);
                        class36.field868 = 2;
                        class108.field2179 = 0;
                        class150.field2847 = class32.field817;
                        ++class28.field519;
                        class44.field1035 = class183.field3365;
                        class196.field3553.method1267(42, -9);
                        class196.field3553.method71(var5, 255);
                    }
                }
                if (var4 == 12) {
                    class275 var22 = class125.field2443[var5];
                    if (var22 != null) {
                        class96.method786(var22.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var22.field1372[0]);
                        class150.field2847 = class32.field817;
                        class44.field1035 = class183.field3365;
                        class108.field2179 = 0;
                        class36.field868 = 2;
                        ++class263.field4639;
                        class196.field3553.method1267(37, -9);
                        class196.field3553.method87(-55174520, var5);
                    }
                }
                if (var4 == 19) {
                    ++class96.field1966;
                    class196.field3553.method1267(244, -9);
                    class196.field3553.method97(class166.field3051, (byte) -2);
                    class196.field3553.method94(var3, -110);
                    class196.field3553.method48(class236.field4225, 74);
                    class196.field3553.method71(var2, 255);
                    class196.field3553.method89(class174.field3253, (byte) 119);
                    class196.field3553.method71(var5, 255);
                    class86.field1770 = 0;
                    class168.field3106 = class272.method1858(var3, 65535);
                    class71.field1614 = var2;
                }
                if (~var4 == -14) {
                    ++class194.field3504;
                    boolean var23 = class96.method786(var2, 0, 0, 0, 2, 0, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                    if (!var23) {
                        class96.method786(var2, 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                    }
                    class150.field2847 = class32.field817;
                    class36.field868 = 2;
                    class108.field2179 = 0;
                    class44.field1035 = class183.field3365;
                    class196.field3553.method1267(24, -9);
                    class196.field3553.method97(class196.field3547 + var3, (byte) -2);
                    class196.field3553.method71(var2 - -class22.field421, 255);
                    class196.field3553.method97(var5, (byte) -2);
                }
                if (~var4 == -24) {
                    boolean var25 = class96.method786(var2, 0, 0, 0, 2, 0, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                    if (!var25) {
                        class96.method786(var2, 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                    }
                    ++class195.field3513;
                    class150.field2847 = class32.field817;
                    class108.field2179 = 0;
                    class44.field1035 = class183.field3365;
                    class36.field868 = 2;
                    class196.field3553.method1267(1, -9);
                    class196.field3553.method97(var5, (byte) -2);
                    class196.field3553.method97(class196.field3547 + var3, (byte) -2);
                    class196.field3553.method48(class125.field2445, 120);
                    class196.field3553.method87(-55174520, var2 - -class22.field421);
                    class196.field3553.method89(class210.field3772, (byte) 119);
                }
                if (~var4 == -29) {
                    class120 var27 = class75.field1670[var5];
                    if (var27 != null) {
                        ++class74.field1655;
                        class96.method786(var27.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var27.field1372[0]);
                        class108.field2179 = 0;
                        class150.field2847 = class32.field817;
                        class44.field1035 = class183.field3365;
                        class36.field868 = 2;
                        class196.field3553.method1267(177, -9);
                        class196.field3553.method97(var5, (byte) -2);
                    }
                }
                if (~var4 == -59) {
                    ++class167.field3059;
                    class196.field3553.method1267(193, -9);
                    class196.field3553.method89(var3, (byte) 119);
                    class196.field3553.method71(var2, 255);
                    class196.field3553.method71(var5, 255);
                    class86.field1770 = 0;
                    class168.field3106 = class272.method1858(var3, 65535);
                    class71.field1614 = var2;
                }
                if (var4 == 17) {
                    class120 var28 = class75.field1670[var5];
                    if (var28 != null) {
                        ++class146.field2799;
                        class96.method786(var28.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var28.field1372[0]);
                        class150.field2847 = class32.field817;
                        class44.field1035 = class183.field3365;
                        class36.field868 = 2;
                        class108.field2179 = 0;
                        class196.field3553.method1267(171, -9);
                        class196.field3553.method94(class210.field3772, 114);
                        class196.field3553.method71(var5, 255);
                        class196.field3553.method48(class125.field2445, 57);
                    }
                }
                if (~var4 == -23) {
                    class275 var29 = class125.field2443[var5];
                    if (var29 != null) {
                        class96.method786(var29.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var29.field1372[0]);
                        class150.field2847 = class32.field817;
                        class44.field1035 = class183.field3365;
                        class108.field2179 = 0;
                        ++class17.field337;
                        class36.field868 = 2;
                        class196.field3553.method1267(77, -9);
                        class196.field3553.method87(-55174520, var5);
                    }
                }
                if (var4 == 16) {
                    ++class277.field4822;
                    class196.field3553.method1267(59, -9);
                    class196.field3553.method71(var2, 255);
                    class196.field3553.method87(-55174520, var5);
                    class196.field3553.method57(var3, 84);
                    class86.field1770 = 0;
                    class168.field3106 = class272.method1858(var3, 65535);
                    class71.field1614 = var2;
                }
                if (~var4 == -44) {
                    class275 var30 = class125.field2443[var5];
                    if (var30 != null) {
                        ++class78.field1694;
                        class96.method786(var30.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var30.field1372[0]);
                        class150.field2847 = class32.field817;
                        class36.field868 = 2;
                        class44.field1035 = class183.field3365;
                        class108.field2179 = 0;
                        class196.field3553.method1267(229, -9);
                        class196.field3553.method97(var5, (byte) -2);
                    }
                }
                if (~var4 == -31) {
                    class31 var31 = class122.method931(var2, (byte) 122, var3);
                    if (var31 != null) {
                        class114.method891(5919);
                        class110.method867(-28279, var2, class225.method1613(-100596213, client.method1498(var31)), var3);
                        class132.field2607 = 0;
                        class93.field1867 = class185.method1331((byte) -126, var31);
                        if (class93.field1867 == null) {
                            class93.field1867 = class166.field3052;
                        }
                        if (var31.field671) {
                            class246.field4384 = class160.method1188(new class30[] { var31.field692, class270.field4757 }, 0);
                            return;
                        }
                        class246.field4384 = class160.method1188(new class30[] { class231.field4099, var31.field740, class270.field4757 }, 0);
                    }
                } else {
                    if (~var4 == -25) {
                        class196.field3553.method1267(57, -9);
                        ++class247.field4399;
                        class196.field3553.method97(var2, (byte) -2);
                        class196.field3553.method57(var3, 71);
                        class196.field3553.method97(var5, (byte) -2);
                        class196.field3553.method94(class210.field3772, -108);
                        class196.field3553.method97(class125.field2445, (byte) -2);
                        class86.field1770 = 0;
                        class168.field3106 = class272.method1858(var3, 65535);
                        class71.field1614 = var2;
                    }
                    if (~var4 == -42) {
                        class275 var32 = class125.field2443[var5];
                        if (var32 != null) {
                            ++class76.field1679;
                            class96.method786(var32.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var32.field1372[0]);
                            class36.field868 = 2;
                            class108.field2179 = 0;
                            class150.field2847 = class32.field817;
                            class44.field1035 = class183.field3365;
                            class196.field3553.method1267(43, -9);
                            class196.field3553.method97(var5, (byte) -2);
                        }
                    }
                    if (var4 == 42) {
                        class196.field3553.method1267(164, -9);
                        ++class41.field1020;
                        class196.field3553.method57(var3, 60);
                        class31 var33 = class272.method1858(var3, 65535);
                        if (var33.field797 != null && var33.field797[0][0] == 5) {
                            int var34 = var33.field797[0][1];
                            class142.field2741[var34] = -class142.field2741[var34] + 1;
                            class253.method1761(var34, (byte) 122);
                        }
                    }
                    if (var4 == 29) {
                        class120 var35 = class75.field1670[var5];
                        if (var35 != null) {
                            class96.method786(var35.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var35.field1372[0]);
                            class44.field1035 = class183.field3365;
                            class150.field2847 = class32.field817;
                            ++class227.field4053;
                            class36.field868 = 2;
                            class108.field2179 = 0;
                            class196.field3553.method1267(207, -9);
                            class196.field3553.method87(-55174520, var5);
                        }
                    }
                    if (var4 == 2) {
                        ++class53.field1180;
                        class138.method1040(var2, var6, var3, true);
                        class196.field3553.method1267(146, -9);
                        class196.field3553.method97(class22.field421 + var2, (byte) -2);
                        class196.field3553.method48(class196.field3547 + var3, 68);
                        class196.field3553.method97((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -2);
                    }
                    if (~var4 == -58) {
                        boolean var36 = class96.method786(var2, 0, 0, 0, 2, 0, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                        if (!var36) {
                            class96.method786(var2, 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                        }
                        class44.field1035 = class183.field3365;
                        class150.field2847 = class32.field817;
                        class108.field2179 = 0;
                        class36.field868 = 2;
                        ++class155.field2946;
                        class196.field3553.method1267(139, -9);
                        class196.field3553.method48(class166.field3051, 116);
                        class196.field3553.method71(class196.field3547 + var3, 255);
                        class196.field3553.method71(var5, 255);
                        class196.field3553.method87(-55174520, class236.field4225);
                        class196.field3553.method87(-55174520, var2 - -class22.field421);
                        class196.field3553.method94(class174.field3253, 25);
                    }
                    if (var4 == 1001) {
                        ++class58.field1267;
                        class138.method1040(var2, var6, var3, true);
                        class196.field3553.method1267(66, -9);
                        class196.field3553.method48(Integer.MAX_VALUE & (int) (var6 >>> 32), 122);
                        class196.field3553.method97(class22.field421 + var2, (byte) -2);
                        class196.field3553.method97(var3 - -class196.field3547, (byte) -2);
                    }
                    if (arg1 < 110) {
                        method1655((class31[]) null, 74, (byte) -107);
                    }
                    if (~var4 == -21) {
                        ++class114.field2265;
                        class138.method1040(var2, var6, var3, true);
                        class196.field3553.method1267(110, -9);
                        class196.field3553.method97(class196.field3547 + var3, (byte) -2);
                        class196.field3553.method71(class22.field421 + var2, 255);
                        class196.field3553.method87(-55174520, Integer.MAX_VALUE & (int) (var6 >>> 32));
                    }
                    if (~var4 == -22) {
                        class125.method941(30549);
                    }
                    if (var4 == 32 && class138.method1040(var2, var6, var3, true)) {
                        class196.field3553.method1267(8, -9);
                        ++class235.field4201;
                        class196.field3553.method87(-55174520, var3 - -class196.field3547);
                        class196.field3553.method97(class125.field2445, (byte) -2);
                        class196.field3553.method97((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -2);
                        class196.field3553.method71(var2 - -class22.field421, 255);
                        class196.field3553.method64(class210.field3772, 1738089264);
                    }
                    if (var4 == 25) {
                        ++class91.field1833;
                        class196.field3553.method1267(111, -9);
                        class196.field3553.method97(var2, (byte) -2);
                        class196.field3553.method94(var3, 103);
                        class196.field3553.method87(-55174520, var5);
                        class86.field1770 = 0;
                        class168.field3106 = class272.method1858(var3, 65535);
                        class71.field1614 = var2;
                    }
                    if (~var4 == -41) {
                        class120 var38 = class75.field1670[var5];
                        if (var38 != null) {
                            class96.method786(var38.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var38.field1372[0]);
                            class36.field868 = 2;
                            class108.field2179 = 0;
                            class150.field2847 = class32.field817;
                            ++class262.field4623;
                            class44.field1035 = class183.field3365;
                            class196.field3553.method1267(141, -9);
                            class196.field3553.method87(-55174520, var5);
                        }
                    }
                    if (var4 == 1006) {
                        class150.field2847 = class32.field817;
                        class108.field2179 = 0;
                        class36.field868 = 2;
                        class44.field1035 = class183.field3365;
                        class275 var39 = class125.field2443[var5];
                        if (var39 != null) {
                            class241 var40 = var39.field4805;
                            if (var40.field4295 != null) {
                                var40 = var40.method1700((byte) 59);
                            }
                            if (var40 != null) {
                                ++class250.field4417;
                                class196.field3553.method1267(80, -9);
                                class196.field3553.method71(var40.field4310, 255);
                            }
                        }
                    }
                    if (~var4 == -35) {
                        ++class270.field4745;
                        boolean var41 = class96.method786(var2, 0, 0, 0, 2, 0, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                        if (!var41) {
                            class96.method786(var2, 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                        }
                        class36.field868 = 2;
                        class44.field1035 = class183.field3365;
                        class108.field2179 = 0;
                        class150.field2847 = class32.field817;
                        class196.field3553.method1267(222, -9);
                        class196.field3553.method48(var5, 107);
                        class196.field3553.method71(class196.field3547 + var3, 255);
                        class196.field3553.method97(var2 - -class22.field421, (byte) -2);
                    }
                    if (var4 == 59) {
                        class120 var43 = class75.field1670[var5];
                        if (var43 != null) {
                            class96.method786(var43.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var43.field1372[0]);
                            ++class31.field801;
                            class36.field868 = 2;
                            class44.field1035 = class183.field3365;
                            class108.field2179 = 0;
                            class150.field2847 = class32.field817;
                            class196.field3553.method1267(84, -9);
                            class196.field3553.method48(var5, 78);
                        }
                    }
                    if (var4 == 10) {
                        class196.field3553.method1267(45, -9);
                        ++class249.field4414;
                        class196.field3553.method48(var5, 125);
                        class196.field3553.method97(var2, (byte) -2);
                        class196.field3553.method64(var3, 1738089264);
                        class86.field1770 = 0;
                        class168.field3106 = class272.method1858(var3, 65535);
                        class71.field1614 = var2;
                    }
                    if (var4 == 6) {
                        class120 var44 = class75.field1670[var5];
                        if (var44 != null) {
                            ++class68.field1477;
                            class96.method786(var44.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var44.field1372[0]);
                            class108.field2179 = 0;
                            class150.field2847 = class32.field817;
                            class44.field1035 = class183.field3365;
                            class36.field868 = 2;
                            class196.field3553.method1267(228, -9);
                            class196.field3553.method89(class174.field3253, (byte) 119);
                            class196.field3553.method87(-55174520, class166.field3051);
                            class196.field3553.method97(class236.field4225, (byte) -2);
                            class196.field3553.method97(var5, (byte) -2);
                        }
                    }
                    if (~var4 == -15) {
                        ++class109.field2198;
                        class138.method1040(var2, var6, var3, true);
                        class196.field3553.method1267(218, -9);
                        class196.field3553.method97(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -2);
                        class196.field3553.method71(class196.field3547 + var3, 255);
                        class196.field3553.method48(class22.field421 + var2, 103);
                    }
                    if (~var4 == -49) {
                        ++class146.field2794;
                        boolean var45 = class96.method786(var2, 0, 0, 0, 2, 0, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                        if (!var45) {
                            class96.method786(var2, 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var3);
                        }
                        class44.field1035 = class183.field3365;
                        class36.field868 = 2;
                        class150.field2847 = class32.field817;
                        class108.field2179 = 0;
                        class196.field3553.method1267(76, -9);
                        class196.field3553.method97(class196.field3547 + var3, (byte) -2);
                        class196.field3553.method48(var2 - -class22.field421, 121);
                        class196.field3553.method97(var5, (byte) -2);
                    }
                    if (var4 == 15) {
                        class120 var47 = class75.field1670[var5];
                        if (var47 != null) {
                            ++class183.field3362;
                            class96.method786(var47.field1349[0], 1, 0, 0, 2, 1, 0, false, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var47.field1372[0]);
                            class108.field2179 = 0;
                            class44.field1035 = class183.field3365;
                            class36.field868 = 2;
                            class150.field2847 = class32.field817;
                            class196.field3553.method1267(183, -9);
                            class196.field3553.method87(-55174520, var5);
                        }
                    }
                    if (~var4 == -32) {
                        ++class190.field3453;
                        class196.field3553.method1267(226, -9);
                        class196.field3553.method97(var5, (byte) -2);
                        class196.field3553.method87(-55174520, var2);
                        class196.field3553.method64(var3, 1738089264);
                        class86.field1770 = 0;
                        class168.field3106 = class272.method1858(var3, 65535);
                        class71.field1614 = var2;
                    }
                    if (var4 == 47) {
                        class138.method1046(class159.field2998, var2, var3);
                    }
                    if (var4 == 50) {
                        class210.field3767 = true;
                        class138.method1046(class159.field2998, var2, var3);
                    }
                    if (~var4 == -1005) {
                        ++class2.field28;
                        class44.field1035 = class183.field3365;
                        class150.field2847 = class32.field817;
                        class36.field868 = 2;
                        class108.field2179 = 0;
                        class196.field3553.method1267(93, -9);
                        class196.field3553.method87(-55174520, var5);
                    }
                    if (var4 == 26) {
                        class196.field3553.method1267(164, -9);
                        class196.field3553.method57(var3, 83);
                        ++class41.field1020;
                        class31 var48 = class272.method1858(var3, 65535);
                        if (var48.field797 != null && ~var48.field797[0][0] == -6) {
                            int var49 = var48.field797[0][1];
                            if (~class142.field2741[var49] != ~var48.field707[0]) {
                                class142.field2741[var49] = var48.field707[0];
                                class253.method1761(var49, (byte) 125);
                            }
                        }
                    }
                    if (var4 == 45) {
                        class196.field3553.method1267(29, -9);
                        class196.field3553.method71(var2, 255);
                        ++class80.field1720;
                        class196.field3553.method89(class210.field3772, (byte) 119);
                        class196.field3553.method89(var3, (byte) 119);
                        class196.field3553.method97(class125.field2445, (byte) -2);
                    }
                    if (class132.field2607 != 0) {
                        class132.field2607 = 0;
                        class254.method1771(class272.method1858(class174.field3253, 65535), 8);
                    }
                    if (class175.field3258) {
                        class114.method891(5919);
                    }
                    if (class168.field3106 != null && class86.field1770 == 0) {
                        class254.method1771(class168.field3106, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V")
    public static void method1657(int arg0) {
        if (arg0 != -1281) {
            method1661(83, (class8) null);
        }
        field4165 = null;
        field4175 = null;
        field4177 = null;
        field4172 = null;
        field4179 = null;
        field4178 = null;
        field4176 = null;
        field4163 = null;
        field4174 = null;
        field4173 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            field4175 = null;
        }
        if (arg0 == 0) {
            this.field4171 = arg2.method63((byte) 121);
            this.field4158 = new int[arg2.method63((byte) 101)][2];
            for (int var4 = 0; this.field4158.length > var4; ++var4) {
                this.field4158[var4][0] = arg2.method65((byte) 112);
                this.field4158[var4][1] = arg2.method65((byte) 119);
            }
        }
        ++field4170;
    }

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)V")
    private final void method1658(int arg0) {
        ++field4157;
        int[] var2 = this.field4158[0];
        if (arg0 == 4096) {
            int[] var3 = this.field4158[this.field4158.length + -1];
            int[] var4 = this.field4158[this.field4158.length + -2];
            int[] var5 = this.field4158[1];
            this.field4159 = new int[] { var4[0] + -var3[0] + var4[0], var4[1] + -var3[1] + var4[1] };
            this.field4166 = new int[] { -var5[0] - -var2[0] + var2[0], var2[1] + var2[1] - var5[1] };
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(III)Lw;")
    public static final class225 method1659(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3532;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)[I")
    private final int[] method1660(int arg0, int arg1) {
        if (arg0 < 39) {
            field4178 = null;
        }
        ++field4164;
        if (arg1 < 0) {
            return this.field4166;
        } else {
            return ~this.field4158.length >= ~arg1 ? this.field4159 : this.field4158[arg1];
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILaa;)V")
    public static final void method1661(int arg0, class8 arg1) {
        ++field4169;
        while (true) {
            while (arg1.field124.length > arg1.field146) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method63((byte) 103) == 1) {
                    var2 = true;
                    var3 = arg1.method63((byte) 120);
                    var4 = arg1.method63((byte) 49);
                }
                int var5 = arg1.method63((byte) 103);
                int var6 = arg1.method63((byte) 74);
                int var7 = var5 * 64 + -class61.field1323;
                int var8 = -(var6 * 64) + class170.field3205 + class53.field1179 + -1;
                if (var7 >= 0 && var8 + -63 >= 0 && class98.field1979 > var7 + 63 && ~var8 > ~class53.field1179) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var2 || var3 * 8 <= var11 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var4 * 8 - -8 > var12) {
                                byte var13 = arg1.method98(1);
                                if (var13 != 0) {
                                    if (class246.field4386[var9][var10] == null) {
                                        class246.field4386[var9][var10] = new byte[4096];
                                    }
                                    class246.field4386[var9][var10][(-var12 + 63 << 6) + var11] = var13;
                                    byte var14 = arg1.method98(1);
                                    if (class138.field2708[var9][var10] == null) {
                                        class138.field2708[var9][var10] = new byte[4096];
                                    }
                                    class138.field2708[var9][var10][(-var12 + 63 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; ~var15 > ~(var2 ? 64 : 4096); ++var15) {
                        byte var16 = arg1.method98(1);
                        if (~var16 != -1) {
                            ++arg1.field146;
                        }
                    }
                }
            }
            if (arg0 >= -108) {
                field4172 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)V")
    public static final void method1662(int arg0, int arg1) {
        ++field4162;
        class68 var2 = class103.method830(arg0, 4, arg1);
        var2.method610(2141640544);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class234() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 >= 11) {
            ++field4168;
            if (this.field4158 == null) {
                this.field4158 = new int[][] { new int[2], { 4096, 4096 } };
            }
            if (~this.field4158.length > -3) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (~this.field4171 == -3) {
                    this.method1658(4096);
                }
                class168.method1242((byte) -33);
                this.method1663((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
    private final void method1663(byte arg0) {
        int var2 = 46 / ((arg0 - -52) / 63);
        int var3 = this.field4171;
        if (~var3 != -3) {
            if (~var3 == -2) {
                for (int var4 = 0; ~var4 > -258; ++var4) {
                    int var5 = var4 << 4;
                    int var6;
                    for (var6 = 1; ~var6 > ~(this.field4158.length + -1) && ~this.field4158[var6][0] >= ~var5; ++var6) {
                    }
                    int[] var7 = this.field4158[var6 - 1];
                    int[] var8 = this.field4158[var6];
                    int var9 = (-var7[0] + var5 << 12) / (var8[0] + -var7[0]);
                    int var10 = 4096 - class201.field3592[(8174 & var9) >> 5] >> 1;
                    int var11 = -var10 + 4096;
                    int var12 = var7[1] * var11 + var8[1] * var10 >> 12;
                    if (var12 <= -32768) {
                        var12 = -32767;
                    }
                    if (~var12 <= -32769) {
                        var12 = 32767;
                    }
                    this.field4167[var4] = (short) var12;
                }
            } else {
                for (int var13 = 0; ~var13 > -258; ++var13) {
                    int var14 = var13 << 4;
                    int var15;
                    for (var15 = 1; var15 < this.field4158.length + -1 && ~var14 <= ~this.field4158[var15][0]; ++var15) {
                    }
                    int[] var16 = this.field4158[var15 + -1];
                    int[] var17 = this.field4158[var15];
                    int var18 = (-var16[0] + var14 << 12) / (var17[0] + -var16[0]);
                    int var19 = 4096 - var18;
                    int var20 = var16[1] * var19 - -(var17[1] * var18) >> 12;
                    if (~var20 >= 32767) {
                        var20 = -32767;
                    }
                    if (var20 >= 32768) {
                        var20 = 32767;
                    }
                    this.field4167[var13] = (short) var20;
                }
            }
        } else {
            for (int var21 = 0; var21 < 257; ++var21) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; this.field4158.length + -1 > var23 && ~this.field4158[var23][0] >= ~var22; ++var23) {
                }
                int[] var24 = this.field4158[var23];
                int[] var25 = this.field4158[var23 - 1];
                int var26 = this.method1660(56, var23 + -2)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method1660(118, var23 + 1)[1];
                int var30 = (-var25[0] + var22 << 12) / (var24[0] + -var25[0]);
                int var31 = -var27 + var29 - -var28 + -var26;
                int var32 = var30 * var30 >> 12;
                int var33 = -var28 + -var31 + var26;
                int var34 = -var26 + var27;
                int var36 = (var30 * var31 >> 12) * var32 >> 12;
                int var37 = var32 * var33 >> 12;
                int var38 = var30 * var34 >> 12;
                int var39 = var36 - (-var37 - var38) + var28;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (~var39 <= -32769) {
                    var39 = 32767;
                }
                this.field4167[var21] = (short) var39;
            }
        }
        ++field4161;
    }
}
