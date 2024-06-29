import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class54 extends class93 {

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    private int field1123 = 1;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    private int field1124 = 0;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    private int field1121 = 0;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Ljd;")
    private static class92 field1116 = class202.method1325((byte) 90, "You have only just left another world)3");

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "Ljd;")
    private static class92 field1120 = class202.method1325((byte) 90, " from your ignore list first)3");

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "Ljd;")
    private static class92 field1118 = class202.method1325((byte) 90, "Examine");

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "Ljd;")
    public static class92 field1122 = field1120;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "Ljd;")
    public static class92 field1129 = field1118;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "Ljd;")
    public static class92 field1127 = field1116;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "[I")
    public static int[] field1128;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field1126;
        int[] var3 = super.field1887.method916(arg0, -112);
        int var4 = 34 % ((arg1 - 67) / 42);
        if (super.field1887.field2757) {
            int var5 = class166.field3271[arg0];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; class150.field2985 > var7; ++var7) {
                int var8 = class75.field1574[var7];
                int var9 = var8 + -2048 >> 1;
                int var10;
                if (~this.field1124 == -1) {
                    var10 = (-var5 + var8) * this.field1123;
                } else {
                    int var11 = var6 * var6 + var9 * var9 >> 12;
                    int var12 = (int) (4096.0D * Math.sqrt((double) (var11 / 4096)));
                    var10 = (int) ((double) (this.field1123 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (var10 & -4096);
                if (~this.field1121 == -1) {
                    var13 = field1128[255 & var13 >> 4] + 4096 >> 1;
                } else if (~this.field1121 == -3) {
                    var13 -= 2048;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    var13 = -var13 + 2048 << 1;
                }
                var3[var7] = var13;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field1123 = arg1.method443(255);
                }
            } else {
                this.field1121 = arg1.method443(255);
            }
        } else {
            this.field1124 = arg1.method443(255);
        }
        if (arg2 != 0) {
            this.method87((byte) 94);
        }
        ++field1117;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjd;)I")
    public static final int method315(int arg0, class92 arg1) {
        ++field1125;
        if (arg0 <= 31) {
            field1129 = null;
        }
        if (~class72.field1532 == -2) {
            return 7;
        } else if (arg1.method636(class40.field909, true)) {
            return 1;
        } else if (arg1.method636(class214.field4195, true)) {
            return 1;
        } else if (arg1.method636(class193.field3762, true)) {
            return 2;
        } else if (arg1.method636(class6.field305, true)) {
            return 2;
        } else if (arg1.method636(class170.field3322, true)) {
            return 3;
        } else if (arg1.method636(class64.field1301, true)) {
            return 4;
        } else if (arg1.method636(class45.field994, true)) {
            return 4;
        } else if (arg1.method636(class75.field1576, true)) {
            return 5;
        } else {
            return arg1.method636(class101.field2082, true) ? 6 : 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    public static void method316(int arg0) {
        field1120 = null;
        field1122 = null;
        if (arg0 == 255) {
            field1129 = null;
            field1128 = null;
            field1127 = null;
            field1118 = null;
            field1116 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 != -85) {
            method316(-61);
        }
        ++field1130;
        class107.method738((byte) -20);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)V")
    public static final void method317(byte arg0, long arg1) {
        ++field1119;
        if (arg1 != 0L) {
            if ((~class166.field3273 > -101 || ~class25.field576 == -2) && ~class166.field3273 > -201) {
                class92 var3 = class129.method855(false, arg1).method617(1);
                for (int var4 = 0; ~var4 > ~class166.field3273; ++var4) {
                    if (~class93.field1878[var4] == ~arg1) {
                        class117.method788(class3.field189, -19001, 0, class77.method529(-3, new class92[] { var3, class72.field1534 }));
                        return;
                    }
                }
                for (int var5 = 0; class64.field1302 > var5; ++var5) {
                    if (~class144.field2880[var5] == ~arg1) {
                        class117.method788(class3.field189, -19001, 0, class77.method529(-3, new class92[] { class135.field2706, var3, field1122 }));
                        return;
                    }
                }
                if (var3.method631(5003, class15.field423.field1805)) {
                    class117.method788(class3.field189, -19001, 0, class4.field267);
                } else {
                    ++class18.field458;
                    class27.field603[class166.field3273] = var3;
                    if (arg0 <= 5) {
                        method316(-31);
                    }
                    class93.field1878[class166.field3273] = arg1;
                    class148.field2936[class166.field3273] = 0;
                    class34.field776[class166.field3273] = class3.field189;
                    class116.field2346[class166.field3273] = 0;
                    class136.field2732 = class186.field3516;
                    ++class166.field3273;
                    class99.field2000.method405(194, 7);
                    class99.field2000.method459(false, arg1);
                }
            } else {
                class117.method788(class3.field189, -19001, 0, class170.field3314);
            }
        }
    }
}
