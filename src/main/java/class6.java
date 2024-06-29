import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 extends class224 {

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field73 = 500;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Luf;")
    public static class168 field78 = class148.method1019(-1720, "details");

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "Luf;")
    public static class168 field81 = class148.method1019(-1720, "Clientscript error in: ");

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 7)
    public class6() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[[I", line = 16)
    public final int[][] method17(int arg0, byte arg1) {
        field76++;
        if (arg1 != -77) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3631.method1587(arg0, arg1 ^ 0xFFFFD9FF);
        if (this.field3631.field3756) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class187.field2961; var7++) {
                this.method24(var7, arg1 + 2125, arg0);
                int[][] var8 = this.method1535(0, arg1 ^ 0xFFFFFFB0, class182.field2913);
                var4[var7] = var8[0][class80.field1146];
                var5[var7] = var8[1][class80.field1146];
                var6[var7] = var8[2][class80.field1146];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)[I", line = 61)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = 50 % ((20 - arg0) / 51);
        field85++;
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            for (int var5 = 0; var5 < class187.field2961; var5++) {
                this.method24(var5, 2048, arg1);
                int[] var6 = this.method1537(class182.field2913, 0, 0);
                var4[var5] = var6[class80.field1146];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLj;)V", line = 93)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field75++;
        if (arg0 == 0) {
            this.field3610 = arg2.method1042((byte) 123) == 1;
        }
        if (arg1) {
            field79 = 70;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILdk;I)[Lgk;", line = 106)
    public static final class265[] method20(byte arg0, int arg1, class241 arg2, int arg3) {
        field77++;
        if (arg0 > -120) {
            method20((byte) -36, 82, (class241) null, -53);
        }
        return class28.method148(arg1, arg2, arg3, -38) ? class121.method870(10472) : null;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V", line = 143)
    public static void method21(byte arg0) {
        field81 = null;
        int var1 = 117 % ((-arg0 - 16) / 55);
        field78 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILoe;I)V", line = 153)
    public static final void method22(int arg0, int arg1, int arg2, class54 arg3, int arg4) {
        field82++;
        if (class266.field4489 == arg3 || class22.field275 >= 400) {
            return;
        }
        class168 var5;
        if (arg3.field665 == 0) {
            var5 = class134.method938((byte) -125, new class168[] { arg3.method300(arg4 - 12409), class179.method1287(6, arg3.field696, class266.field4489.field696), class27.field339, class178.field2877, class169.method1228(arg3.field696, 0), class144.field2222 });
        } else {
            var5 = class134.method938((byte) -126, new class168[] { arg3.method300(-119), class27.field339, class166.field2673, class169.method1228(arg3.field665, 0), class144.field2222 });
        }
        if (arg4 != 12285) {
            return;
        }
        if (class211.field3461 == 1) {
            class237.field3792++;
            class45.method247(arg1, class134.method938((byte) -126, new class168[] { class213.field3486, class285.field4827, var5 }), class127.field1957, (short) 1, (byte) 66, (long) arg2, arg0);
        } else if (!class111.field1740) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class79.field1131[var6] != null) {
                    class177.field2866++;
                    short var7 = 0;
                    if (class58.field765 == 0 && class79.field1131[var6].method1194(class127.field1955, -26023)) {
                        if (class266.field4489.field696 < arg3.field696) {
                            var7 = 2000;
                        }
                        if (class266.field4489.field693 != 0 && arg3.field693 != 0) {
                            if (class266.field4489.field693 == arg3.field693) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class213.field3481[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    short var9 = class231.field3729[var6];
                    short var10 = (short) (var7 + var9);
                    class45.method247(arg1, class134.method938((byte) -124, new class168[] { class118.field1845, var5 }), class79.field1131[var6], var10, (byte) 66, (long) arg2, arg0);
                }
            }
        } else if ((class298.field5055 & 0x8) == 8) {
            class297.field5032++;
            class45.method247(arg1, class134.method938((byte) -127, new class168[] { class233.field3754, class285.field4827, var5 }), class120.field1872, (short) 50, (byte) 66, (long) arg2, arg0);
        }
        for (int var11 = 0; var11 < class22.field275; var11++) {
            if (class61.field804[var11] == 35) {
                class274.field4606[var11] = class134.method938((byte) -126, new class168[] { class118.field1845, var5 });
                break;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V", line = 258)
    public static final void method23(int arg0) {
        field84++;
        class285.method1966(false);
        class43.method238();
        class247.method1700();
        class124.field1923 = -1;
        class216.field3514 = class46.field562 = new class192[4][];
        class207.field3394 = null;
        class102.method765((byte) 124);
        class255.field4350.method186(30588);
        class188.field2983 = new class12();
        ((class85) class173.field2815).method584(255);
        class257.field4371 = new class291[255];
        class257.field4370 = 0;
        class93.method679();
        class100.field1567 = (class42[][]) null;
        if (arg0 < 119) {
            method20((byte) 5, -116, (class241) null, -90);
        }
        class282.method1946(true);
        class267.method1859((byte) 71);
        class110.method818(-1445985368);
        for (int var1 = 0; var1 < 2048; var1++) {
            class54 var2 = class9.field117[var1];
            if (var2 != null) {
                var2.field687 = null;
            }
        }
        class168.method1172(0);
        class7.method27();
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)V", line = 303)
    private final void method24(int arg0, int arg1, int arg2) {
        int var4 = class73.field979[arg0];
        field83++;
        int var5 = class303.field5103[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - arg1));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class182.field2913 = arg2;
            class80.field1146 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class80.field1146 = arg2;
            class182.field2913 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class80.field1146 = class187.field2961 - arg2;
            class182.field2913 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class80.field1146 = arg0;
            class182.field2913 = class115.field1791 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class182.field2913 = class115.field1791 - arg2;
            class80.field1146 = class187.field2961 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class182.field2913 = class115.field1791 - arg0;
            class80.field1146 = class187.field2961 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class80.field1146 = arg2;
            class182.field2913 = class115.field1791 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class182.field2913 = arg2;
            class80.field1146 = class187.field2961 - arg0;
        }
        class182.field2913 &= class169.field2777;
        class80.field1146 &= class205.field3363;
    }
}
