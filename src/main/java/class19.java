import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class4 {

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    private int field409 = 0;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "[S")
    private short[] field415 = new short[6];

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    private int field408 = 0;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    private int field404 = 0;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "[S")
    private short[] field411 = new short[6];

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
    private int field418 = 128;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
    private int field420 = 128;

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "I")
    public int field428 = -1;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "Ln;")
    public static class90 field417 = new class90(200);

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "[[B")
    public static byte[][] field423 = new byte[250][];

    @OriginalMember(owner = "client!cd", name = "ub", descriptor = "Lja;")
    public static class63 field426 = new class63();

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lhe;")
    public static class54 field416;

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "Lid;")
    public static class60 field422;

    @OriginalMember(owner = "client!cd", name = "tb", descriptor = "Lmd;")
    public static class87 field425;

    @OriginalMember(owner = "client!cd", name = "vb", descriptor = "[Lv;")
    public static class140[] field427;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILb;Z)V")
    private final void method180(int arg0, class8 arg1, boolean arg2) {
        field407++;
        if (arg0 == 1) {
            this.field405 = arg1.method68(-2);
        } else if (arg0 == 2) {
            this.field428 = arg1.method68(-2);
        } else if (arg0 == 4) {
            this.field418 = arg1.method68(-2);
        } else if (arg0 == 5) {
            this.field420 = arg1.method68(-2);
        } else if (arg0 == 6) {
            this.field409 = arg1.method68(-2);
        } else if (arg0 == 7) {
            this.field404 = arg1.method62((byte) 109);
        } else if (arg0 == 8) {
            this.field408 = arg1.method62((byte) 85);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field415[arg0 - 40] = (short) arg1.method68(-2);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field411[arg0 - 50] = (short) arg1.method68(-2);
        }
        if (!arg2) {
            method184(true, null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    public static final int method181(int arg0, int arg1, int arg2) {
        field403++;
        int var3 = class75.method618(arg0 - 1, 126, arg1 - 1) + class75.method618(arg0 + 1, 118, arg1 - 1) + class75.method618(arg0 + -1, 125, arg1 + 1) + class75.method618(arg0 - -1, 97, arg1 + 1);
        int var4 = class75.method618(arg0 - 1, 127, arg1) + class75.method618(arg0 + 1, 121, arg1) + class75.method618(arg0, 118, arg1 - 1) + class75.method618(arg0, 81, arg1 + 1);
        int var5 = class75.method618(arg0, 120, arg1);
        return arg2 <= 108 ? 61 : var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Lt;")
    public final class128 method182(byte arg0, int arg1) {
        class128 var3 = (class128) class114.field2566.method730((byte) 35, (long) this.field410);
        field413++;
        if (var3 == null) {
            class12 var4 = class12.method133(class126.field2815, this.field405, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field415[0] != 0) {
                    var4.method134(this.field415[var5], this.field411[var5]);
                }
            }
            var3 = var4.method126(this.field404 + 64, this.field408 + 850, -30, -50, -30);
            class114.field2566.method732(-1, var3, (long) this.field410);
        }
        int var6 = 93 % ((arg0 - 77) / 33);
        class128 var7;
        if (this.field428 == -1 || arg1 == -1) {
            var7 = var3.method1015(true);
        } else {
            var7 = class48.method413(-126, this.field428).method325(var3, (byte) -83, arg1);
        }
        if (this.field418 != 128 || this.field420 != 128) {
            var7.method1016(this.field418, this.field420, this.field418);
        }
        if (this.field409 != 0) {
            if (this.field409 == 90) {
                var7.method1007();
            }
            if (this.field409 == 180) {
                var7.method1007();
                var7.method1007();
            }
            if (this.field409 == 270) {
                var7.method1007();
                var7.method1007();
                var7.method1007();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IJ)Loa;")
    public static final class98 method183(int arg0, long arg1) {
        field419++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != -30) {
                method183(52, 119L);
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class54.field1190[(int) (var8 - arg1 * 37L)];
            }
            class98 var7 = new class98();
            var7.field2255 = var6;
            var7.field2277 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLtd;)V")
    public static final void method184(boolean arg0, class132 arg1) {
        field406++;
        int var2 = arg1.field3126;
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class27.field665 == 0) {
                if (var2 == 1) {
                    arg1.field3204 = class147.field3589;
                    arg1.field3150 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg1.field3204 = class37.field906;
                    arg1.field3150 = 0;
                    return;
                }
            }
            if (class27.field665 == 1) {
                if (var2 == 1) {
                    arg1.field3150 = 0;
                    arg1.field3204 = class105.field2406;
                    return;
                }
                if (var2 == 2) {
                    arg1.field3150 = 0;
                    arg1.field3204 = class37.field921;
                    return;
                }
                if (var2 == 3) {
                    arg1.field3204 = class33.field789;
                    arg1.field3150 = 0;
                    return;
                }
            }
            if (var2 <= 700) {
                var2--;
            } else {
                var2 -= 601;
            }
            int var3 = class49.field1112;
            if (class27.field665 != 2) {
                var3 = 0;
            }
            if (var3 <= var2) {
                arg1.field3204 = class145.field3503;
                arg1.field3150 = 0;
            } else {
                arg1.field3204 = class134.field3287[var2];
                arg1.field3150 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class49.field1112;
            if (class27.field665 != 2) {
                var4 = 0;
            }
            if (var4 <= var2) {
                arg1.field3204 = class145.field3503;
                arg1.field3150 = 0;
            } else {
                if (class105.field2404[var2] == 0) {
                    arg1.field3204 = class102.method840(new class98[] { class48.field1088, class127.field2850 }, 10);
                } else if (class105.field2404[var2] >= 5000) {
                    if (class105.field2404[var2] == class5.field74) {
                        arg1.field3204 = class102.method840(new class98[] { class58.field1296, class77.field1690, class132.method1074(class105.field2404[var2] - 5000, (byte) 69) }, 10);
                    } else {
                        arg1.field3204 = class102.method840(new class98[] { class58.field1288, class77.field1690, class132.method1074(class105.field2404[var2] - 5000, (byte) 74) }, 10);
                    }
                } else if (class105.field2404[var2] == class5.field74) {
                    arg1.field3204 = class102.method840(new class98[] { class58.field1296, class73.field1533, class132.method1074(class105.field2404[var2], (byte) -64) }, 10);
                } else {
                    arg1.field3204 = class102.method840(new class98[] { class58.field1288, class73.field1533, class132.method1074(class105.field2404[var2], (byte) -99) }, 10);
                }
                arg1.field3150 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class49.field1112;
            if (class27.field665 != 2) {
                var5 = 0;
            }
            arg1.field3167 = var5 * 15 + 20;
            if (arg1.field3165 >= arg1.field3167) {
                arg1.field3167 = arg1.field3165 + 1;
            }
        } else if (!arg0) {
            if (var2 >= 401 && var2 <= 500) {
                var2 -= 401;
                if (var2 == 0 && class27.field665 == 0) {
                    arg1.field3150 = 0;
                    arg1.field3204 = class41.field958;
                } else if (var2 == 1 && class27.field665 == 0) {
                    arg1.field3150 = 0;
                    arg1.field3204 = class37.field906;
                } else {
                    int var6 = class77.field1697;
                    if (class27.field665 == 0) {
                        var6 = 0;
                    }
                    if (var6 <= var2) {
                        arg1.field3204 = class145.field3503;
                        arg1.field3150 = 0;
                    } else {
                        arg1.field3204 = method183(-30, class102.field2345[var2]).method785(10);
                        arg1.field3150 = 1;
                    }
                }
            } else if (var2 == 503) {
                arg1.field3167 = class77.field1697 * 15 + 20;
                if (arg1.field3165 >= arg1.field3167) {
                    arg1.field3167 = arg1.field3165 + 1;
                }
            } else if (var2 == 324) {
                if (class91.field2114 == -1) {
                    class91.field2114 = arg1.field3129;
                    class15.field317 = arg1.field3171;
                }
                if (class91.field2088.field1473) {
                    arg1.field3129 = class91.field2114;
                } else {
                    arg1.field3129 = class15.field317;
                }
            } else if (var2 == 325) {
                if (class91.field2114 == -1) {
                    class15.field317 = arg1.field3171;
                    class91.field2114 = arg1.field3129;
                }
                if (class91.field2088.field1473) {
                    arg1.field3129 = class15.field317;
                } else {
                    arg1.field3129 = class91.field2114;
                }
            } else if (var2 == 327) {
                arg1.field3218 = 150;
                arg1.field3220 = (int) (Math.sin((double) class119.field2680 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3187 = 5;
                arg1.field3112 = 0;
            } else if (var2 == 328) {
                arg1.field3218 = 150;
                arg1.field3220 = (int) (Math.sin((double) class119.field2680 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3187 = 5;
                arg1.field3112 = 1;
            } else if (var2 == 600) {
                arg1.field3204 = class102.method840(new class98[] { class145.field3499, class117.field2611 }, 10);
            } else if (var2 == 620) {
                if (class33.field823 < 1) {
                    arg1.field3204 = class145.field3503;
                } else if (class84.field1955) {
                    arg1.field3148 = 16711680;
                    arg1.field3204 = class145.field3527;
                } else {
                    arg1.field3148 = 16777215;
                    arg1.field3204 = class73.field1510;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public static void method185(int arg0) {
        field426 = null;
        if (arg0 != 28859) {
            field417 = null;
        }
        field417 = null;
        field423 = null;
        field427 = null;
        field422 = null;
        field425 = null;
        field416 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILb;)V")
    public final void method186(int arg0, class8 arg1) {
        field412++;
        while (true) {
            int var3 = arg1.method62((byte) 78);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    field417 = null;
                    return;
                }
            }
            this.method180(var3, arg1, true);
        }
    }
}
