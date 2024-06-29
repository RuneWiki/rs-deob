import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class53 extends class64 {

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    private int field1250 = 2048;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    private int field1252 = 1024;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    private int field1259 = 3072;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "[[[B")
    public static byte[][][] field1253 = new byte[4][104][104];

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Lcd;")
    public static class23 field1248 = class54.method414("scrollbar", -1);

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "Lcd;")
    public static class23 field1251 = class54.method414("<col=ffff00>", -1);

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "[I")
    public static int[] field1257 = new int[] { 48, 46, 22, 41, 18, 10, 50, 6 };

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "[I")
    public static int[] field1258 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            this.method36(-27, false);
        }
        ++field1247;
        int[] var3 = super.field1513.method1033(-105, arg0);
        if (super.field1513.field3368) {
            int[] var4 = this.method479(-1, arg0, 0);
            for (int var5 = 0; var5 < class168.field3367; ++var5) {
                var3[var5] = (var4[var5] * this.field1250 >> 12) + this.field1252;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lva;I)V")
    public static final void method408(class189 arg0, int arg1) {
        ++field1256;
        if (class20.field414 != null) {
            try {
                class20.field414.method401((byte) -85, 0L);
                class20.field414.method405(arg0.field3752, arg0.field3753, 24, -89);
            } catch (Exception var3) {
            }
        }
        int var2 = 85 / ((-55 - arg1) / 46);
        arg0.field3752 += 24;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(JI)V")
    public static final void method409(long arg0, int arg1) {
        ++field1244;
        if (~arg0 < -1L) {
            if (~(arg0 % 10L) == -1L) {
                class30.method225(arg0 + -1L, (byte) -89);
                class30.method225(1L, (byte) -108);
            } else {
                class30.method225(arg0, (byte) -79);
            }
            if (arg1 != -25391) {
                field1257 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        if (arg0 != -22) {
            field1258 = null;
        }
        this.field1250 = this.field1259 - this.field1252;
        ++field1246;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1259 = -60;
        }
        int[][] var3 = super.field1508.method846(7287, arg0);
        ++field1249;
        if (super.field1508.field2757) {
            int[][] var4 = this.method482(0, arg0, (byte) -124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class168.field3367; ++var11) {
                var8[var11] = (var5[var11] * this.field1250 >> 12) + this.field1252;
                var9[var11] = (var6[var11] * this.field1250 >> 12) + this.field1252;
                var10[var11] = (var7[var11] * this.field1250 >> 12) + this.field1252;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = -126 / ((7 - arg0) / 43);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1510 = ~arg2.method1202(-110) == -2;
                }
            } else {
                this.field1259 = arg2.method1197(-1);
            }
        } else {
            this.field1252 = arg2.method1197(-1);
        }
        ++field1260;
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public static void method410(int arg0) {
        field1257 = null;
        field1253 = null;
        field1248 = null;
        field1251 = null;
        if (arg0 != 13323) {
            method409(26L, 41);
        }
        field1258 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
    public static final void method411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class196.method1278(arg2, arg0, arg2 + arg4, arg0 + arg3);
        ++field1245;
        class140.method888();
        ++class129.field2691;
        class121.method755(true, 1);
        class25.method180(true, arg1 ^ 72);
        class121.method755(false, 1);
        class25.method180(false, arg1 ^ 67);
        class17.method92((byte) -49);
        class25.method183(21740);
        if (!class181.field3575) {
            int var5 = class13.field297;
            int var6 = 2047 & class48.field1155 - -class69.field1619;
            if (class57.field1346 / 256 > var5) {
                var5 = class57.field1346 / 256;
            }
            if (class203.field4006[4] && ~(class63.field1496[4] + 128) < ~var5) {
                var5 = class63.field1496[4] - -128;
            }
            class134.method855(class203.method1330((byte) -88, class134.field2790.field277, class134.field2790.field215, class59.field1385) - 50, var5, var6, 600 - -(var5 * 3), class66.field1556, class70.field1630, 0);
        }
        int var7;
        if (class181.field3575) {
            var7 = class10.method59(-78);
        } else {
            var7 = class17.method93(-119);
        }
        int var8 = class119.field2452;
        int var9 = class122.field2530;
        int var10 = class115.field2404;
        int var11 = class105.field2266;
        int var12 = class181.field3574;
        for (int var13 = arg1; var13 < 5; ++var13) {
            if (class203.field4006[var13]) {
                int var16 = (int) (Math.random() * (double) (class78.field1722[var13] * 2 + 1) - (double) class78.field1722[var13] + Math.sin((double) class44.field925[var13] / 100.0D * (double) class132.field2724[var13]) * (double) class63.field1496[var13]);
                if (var13 == 4) {
                    class105.field2266 += var16;
                    if (~class105.field2266 > -129) {
                        class105.field2266 = 128;
                    }
                    if (~class105.field2266 < -384) {
                        class105.field2266 = 383;
                    }
                }
                if (~var13 == -3) {
                    class115.field2404 += var16;
                }
                if (~var13 == -2) {
                    class122.field2530 += var16;
                }
                if (~var13 == -4) {
                    class181.field3574 = 2047 & class181.field3574 + var16;
                }
                if (~var13 == -1) {
                    class119.field2452 += var16;
                }
            }
        }
        int var14 = class78.field1724;
        int var15 = class64.field1518;
        if (var14 >= arg2 && ~var14 > ~(arg2 + arg4) && arg0 <= var15 && ~var15 > ~(arg0 + arg3)) {
            class45.field955 = -arg0 + class64.field1518;
            class45.field949 = -arg2 + class78.field1724;
            class45.field978 = true;
            class45.field958 = 0;
        } else {
            class45.field978 = false;
            class45.field958 = 0;
        }
        class175.method1097(true);
        class196.method1281(arg2, arg0, arg4, arg3, 0);
        class175.method1097(true);
        class205.field4041.method788(class119.field2452, class122.field2530, class115.field2404, class105.field2266, class181.field3574, var7);
        class175.method1097(true);
        class205.field4041.method804();
        class189.method1222((byte) -125, arg2, arg0, arg4, arg3);
        class177.method1113(arg2, arg0, (byte) 123);
        ((class17) class140.field2890).method97(class138.field2850, 19875);
        class1.method2(arg4, arg0, arg2, arg3, (byte) 120);
        class119.field2452 = var8;
        class105.field2266 = var11;
        class181.field3574 = var12;
        class115.field2404 = var10;
        class122.field2530 = var9;
        if (class86.field1852 && ~class57.method438(false, arg1, true) == -1) {
            class86.field1852 = false;
        }
        if (class86.field1852) {
            class196.method1281(arg2, arg0, arg4, arg3, 0);
            class193.method1249(false, -17570, class21.field443);
        }
        if (!class86.field1852 && !class134.field2786 && ~arg2 >= ~var14 && ~(arg2 + arg4) < ~var14 && ~arg0 >= ~var15 && var15 < arg0 - -arg3) {
            class128.method830(var15, var14, 27745, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)I")
    public static final int method412(byte arg0) {
        ++field1254;
        if (arg0 != -37) {
            method409(3L, -36);
        }
        return class50.field1197++;
    }
}
