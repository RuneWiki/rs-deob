import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class144 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field1998 = -1;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2000 = "Unable to find ";

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "[I")
    public static int[] field2001 = new int[500];

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "F")
    public static float field1996 = 0.0F;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "S")
    public static short field2016 = 32767;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    private int field2010;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "J")
    private long field2002;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "J")
    private long field2006;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Z")
    public boolean field2015;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
    private int[] field1994;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "[I")
    public int[] field2003;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "[[I")
    private int[][] field2007;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method962(int arg0) {
        field2001 = null;
        if (arg0 == 20076) {
            field2000 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BZ)V")
    public final void method963(byte arg0, boolean arg1) {
        field2009++;
        if (arg0 != -117) {
            this.field2015 = false;
        }
        this.field2015 = arg1;
        this.method968(1933532360);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILgj;IIII)Lgh;")
    public final class25 method964(int arg0, int arg1, int arg2, class240 arg3, int arg4, int arg5, int arg6, int arg7) {
        field2005++;
        long var9 = (long) (arg5 << 16) | (long) arg7 << 32 | (long) arg1;
        if (arg2 != 3) {
            field1998 = 113;
        }
        class25 var11 = (class25) class57.field819.method540((byte) -117, var9);
        if (var11 == null) {
            class271[] var12 = new class271[3];
            int var13 = 0;
            if (!class212.method1386(arg1, 0).method1611(-87) || !class212.method1386(arg5, 0).method1611(arg2 - 123) || !class212.method1386(arg7, 0).method1611(-84)) {
                return null;
            }
            class271 var14 = class212.method1386(arg1, 0).method1610((byte) -90);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class271 var15 = class212.method1386(arg5, arg2 ^ 0x3).method1610((byte) -90);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class271 var16 = class212.method1386(arg7, 0).method1610((byte) -90);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class271 var17 = new class271(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class248.field3795[var18].length > this.field2003[var18]) {
                    var17.method1796(class11.field109[var18], class248.field3795[var18][this.field2003[var18]]);
                }
                if (class199.field2767[var18].length > this.field2003[var18]) {
                    var17.method1796(class276.field4274[var18], class199.field2767[var18][this.field2003[var18]]);
                }
            }
            var11 = var17.method1794(64, 768, -50, -10, -50);
            class57.field819.method543(var11, var9, arg2 + 858993456);
        }
        if (arg3 != null) {
            var11 = arg3.method1609(arg4, (byte) -83, arg6, arg0, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILgj;II)Lgh;")
    public final class25 method965(int arg0, int arg1, class240 arg2, int arg3, int arg4) {
        field1997++;
        if (this.field2012 != -1) {
            return class270.method1783((byte) -62, this.field2012).method1910(arg1, arg2, arg0, 0, arg4);
        }
        class25 var6 = (class25) class57.field819.method540((byte) -128, this.field2006);
        if (arg3 < 3) {
            return null;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field1994[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var17) != 0 && !class212.method1386(var17 & 0x3FFFFFFF, 0).method1611(-119)) {
                        var7 = true;
                    }
                } else if (!class73.method463(var17 & 0x3FFFFFFF, -31104).method213(-114, this.field2015)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            int var9 = 0;
            class271[] var10 = new class271[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field1994[var11];
                if ((var14 & 0x40000000) != 0) {
                    class271 var15 = class73.method463(var14 & 0x3FFFFFFF, -31104).method207(false, this.field2015);
                    if (var15 != null) {
                        var10[var9++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class271 var16 = class212.method1386(var14 & 0x3FFFFFFF, 0).method1610((byte) -90);
                    if (var16 != null) {
                        var10[var9++] = var16;
                    }
                }
            }
            class271 var12 = new class271(var10, var9);
            for (int var13 = 0; var13 < 5; var13++) {
                if (class248.field3795[var13].length > this.field2003[var13]) {
                    var12.method1796(class11.field109[var13], class248.field3795[var13][this.field2003[var13]]);
                }
                if (this.field2003[var13] < class199.field2767[var13].length) {
                    var12.method1796(class276.field4274[var13], class199.field2767[var13][this.field2003[var13]]);
                }
            }
            var6 = var12.method1794(64, 768, -50, -10, -50);
            class57.field819.method543(var6, this.field2006, 858993459);
        }
        if (arg2 != null) {
            var6 = arg2.method1609(arg1, (byte) -13, arg0, arg4, var6);
        }
        return var6;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([IIZ[III)V")
    public final void method966(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        if (this.field2010 != arg5) {
            this.field2007 = null;
            this.field2010 = arg5;
        }
        field2014++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class43.field656; var8++) {
                    class241 var9 = class212.method1386(var8, 0);
                    if (var9 != null && !var9.field3703 && var9.field3706 == (arg2 ? class268.field4107[var7] : class103.field1431[var7])) {
                        arg0[class107.field1493[var7]] = class54.method339(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2012 = arg4;
        this.field1994 = arg0;
        this.field2015 = arg2;
        this.field2003 = arg3;
        if (arg1 > -73) {
            this.method967(115, 1, 81);
        }
        this.method968(1933532360);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    public final void method967(int arg0, int arg1, int arg2) {
        if (arg0 < 10) {
            this.method972(46, -88, 10, 72, (class240) null, (class240) null, (class212[]) null, false, -16, -14, -10);
        }
        this.field2003[arg2] = arg1;
        this.method968(1933532360);
        field2013++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    private final void method968(int arg0) {
        field2008++;
        long var2 = this.field2006;
        long[] var4 = class35.field546;
        this.field2006 = -1L;
        this.field2006 = var4[(int) ((this.field2006 ^ (long) (this.field2010 >> 8)) & 0xFFL)] ^ this.field2006 >>> 8;
        this.field2006 = this.field2006 >>> 8 ^ var4[(int) ((this.field2006 ^ (long) this.field2010) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2006 = var4[(int) ((this.field2006 ^ (long) (this.field1994[var5] >> 24)) & 0xFFL)] ^ this.field2006 >>> 8;
            this.field2006 = var4[(int) ((this.field2006 ^ (long) (this.field1994[var5] >> 16)) & 0xFFL)] ^ this.field2006 >>> 8;
            this.field2006 = var4[(int) (((long) (this.field1994[var5] >> 8) ^ this.field2006) & 0xFFL)] ^ this.field2006 >>> 8;
            this.field2006 = this.field2006 >>> 8 ^ var4[(int) ((this.field2006 ^ (long) this.field1994[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2006 = var4[(int) ((this.field2006 ^ (long) this.field2003[var6]) & 0xFFL)] ^ this.field2006 >>> 8;
        }
        if (arg0 != 1933532360) {
            this.method971(117, 15, (byte) -61);
        }
        this.field2006 = var4[(int) ((this.field2006 ^ (long) (this.field2015 ? 1 : 0)) & 0xFFL)] ^ this.field2006 >>> 8;
        if (var2 != 0L && this.field2006 != var2) {
            class160.field2244.method539(4408, var2);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
    public final int method969(byte arg0) {
        field1995++;
        if (arg0 == -70) {
            return this.field2012 == -1 ? (this.field1994[8] << 10) + ((this.field2003[0] << 25) + (this.field2003[4] << 20)) - (-(this.field1994[0] << 15) - ((this.field1994[11] << 5) + this.field1994[1])) : class270.method1783((byte) -57, this.field2012).field4413 + 305419896;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public static final void method970(int arg0) {
        field1999++;
        if (class103.field1441 == arg0 || class103.field1441 == 5) {
            return;
        }
        try {
            if ((++class225.field3424) > 2000) {
                if (class290.field4567 != null) {
                    class290.field4567.method1958(arg0 + 5000);
                    class290.field4567 = null;
                }
                if (class20.field284 >= 1) {
                    class274.field4241 = -5;
                    class103.field1441 = 0;
                    return;
                }
                class20.field284++;
                class103.field1441 = 1;
                if (class56.field810 == class285.field4466) {
                    class56.field810 = class198.field2766;
                } else {
                    class56.field810 = class285.field4466;
                }
                class225.field3424 = 0;
            }
            if (class103.field1441 == 1) {
                class32.field498 = class200.field2784.method1637(class56.field810, false, class19.field273);
                class103.field1441 = 2;
            }
            if (class103.field1441 == 2) {
                if (class32.field498.field1663 == 2) {
                    throw new IOException();
                }
                if (class32.field498.field1663 != 1) {
                    return;
                }
                class290.field4567 = new class293((Socket) class32.field498.field1665, class200.field2784);
                class32.field498 = null;
                long var1 = class266.field4042 = class73.method465((byte) -102, class176.field2478);
                class281.field4359.field3402 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class281.field4359.method1447(14, arg0 ^ 0x108F210);
                class281.field4359.method1447(var3, 17363472);
                class290.field4567.method1967(class281.field4359.field3336, 0, 2, 0);
                if (class139.field1933 != null) {
                    class139.field1933.method857((byte) -36);
                }
                if (class234.field3537 != null) {
                    class234.field3537.method857((byte) -36);
                }
                int var4 = class290.field4567.method1959(arg0 - 88);
                if (class139.field1933 != null) {
                    class139.field1933.method857((byte) -36);
                }
                if (class234.field3537 != null) {
                    class234.field3537.method857((byte) -36);
                }
                if (var4 != 0) {
                    class274.field4241 = var4;
                    class103.field1441 = 0;
                    class290.field4567.method1958(5000);
                    class290.field4567 = null;
                    return;
                }
                class103.field1441 = 3;
            }
            if (class103.field1441 == 3) {
                if (class290.field4567.method1960(-1) < 8) {
                    return;
                }
                class290.field4567.method1963(8, class233.field3518.field3336, 0, false);
                class233.field3518.field3402 = 0;
                int[] var5 = new int[4];
                class180.field2520 = class233.field3518.method1491(-21241);
                class281.field4359.field3402 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class180.field2520;
                var5[2] = (int) (class180.field2520 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class281.field4359.method1447(10, 17363472);
                class281.field4359.method1435(-100, var5[0]);
                class281.field4359.method1435(-95, var5[1]);
                class281.field4359.method1435(-100, var5[2]);
                class281.field4359.method1435(-99, var5[3]);
                class281.field4359.method1451(class73.method465((byte) -72, class176.field2478), (byte) -24);
                class281.field4359.method1472((byte) 67, class296.field4666);
                class281.field4359.method1485((byte) 62, class33.field500, class277.field4290);
                class89.field1233.field3402 = 0;
                if (class79.field1097 == 40) {
                    class89.field1233.method1447(18, arg0 + 17363472);
                } else {
                    class89.field1233.method1447(16, 17363472);
                }
                class89.field1233.method1470(393660232, 163 - (-class281.field4359.field3402 - class69.method432(class218.field3287, arg0 ^ 0x14)));
                class89.field1233.method1435(arg0 - 109, 535);
                class89.field1233.method1447(class222.field3331, 17363472);
                class89.field1233.method1447(class286.field4521 ? 1 : 0, 17363472);
                class89.field1233.method1447(0, 17363472);
                class89.field1233.method1447(class89.method568(arg0 - 20891), arg0 + 17363472);
                class89.field1233.method1470(393660232, class275.field4263);
                class89.field1233.method1470(393660232, class197.field2739);
                class89.field1233.method1447(class111.field1617, 17363472);
                class230.method1516(0, class89.field1233);
                class89.field1233.method1472((byte) 67, class218.field3287);
                class89.field1233.method1435(-126, class230.field3491);
                class89.field1233.method1435(arg0 - 90, class138.method935(true));
                class173.field2418 = true;
                class89.field1233.method1470(arg0 ^ 0x1776C748, class215.field3245);
                class89.field1233.method1435(-103, class36.field560.method1558(arg0 ^ -23026));
                class89.field1233.method1435(-104, class225.field3413.method1558(arg0 ^ -23026));
                class89.field1233.method1435(-121, class42.field638.method1558(-23026));
                class89.field1233.method1435(-119, class96.field1353.method1558(arg0 - 23026));
                class89.field1233.method1435(-120, class10.field94.method1558(-23026));
                class89.field1233.method1435(arg0 ^ 0xFFFFFF91, class197.field2726.method1558(-23026));
                class89.field1233.method1435(-104, class23.field324.method1558(-23026));
                class89.field1233.method1435(arg0 - 101, class224.field3400.method1558(-23026));
                class89.field1233.method1435(-122, class21.field299.method1558(-23026));
                class89.field1233.method1435(-121, class237.field3602.method1558(arg0 ^ -23026));
                class89.field1233.method1435(-93, class232.field3510.method1558(arg0 - 23026));
                class89.field1233.method1435(-95, class50.field726.method1558(-23026));
                class89.field1233.method1435(-106, class184.field2551.method1558(arg0 ^ -23026));
                class89.field1233.method1435(-111, class50.field724.method1558(arg0 ^ -23026));
                class89.field1233.method1435(-115, class241.field3694.method1558(-23026));
                class89.field1233.method1435(arg0 - 126, class199.field2771.method1558(-23026));
                class89.field1233.method1435(-113, class41.field619.method1558(arg0 - 23026));
                class89.field1233.method1435(-98, class246.field3768.method1558(-23026));
                class89.field1233.method1435(-108, class180.field2525.method1558(-23026));
                class89.field1233.method1435(-127, class250.field3827.method1558(-23026));
                class89.field1233.method1435(-125, class138.field1931.method1558(arg0 ^ -23026));
                class89.field1233.method1435(-104, class186.field2559.method1558(-23026));
                class89.field1233.method1435(arg0 - 96, class246.field3780.method1558(-23026));
                class89.field1233.method1435(-99, class174.field2455.method1558(-23026));
                class89.field1233.method1435(-110, class295.field4637.method1558(-23026));
                class89.field1233.method1435(-96, class116.field1650.method1558(-23026));
                class89.field1233.method1435(arg0 ^ 0xFFFFFF9A, class213.field3204.method1558(arg0 ^ 0xFFFFA60E));
                class89.field1233.method1435(-103, class195.field2701.method1558(-23026));
                class89.field1233.method1435(-105, class42.field627.method1558(-23026));
                class89.field1233.method1452(class281.field4359.field3336, 0, class281.field4359.field3402, 128);
                class290.field4567.method1967(class89.field1233.field3336, 0, class89.field1233.field3402, arg0);
                class281.field4359.method1862(var5, 8);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class233.field3518.method1862(var5, 8);
                class103.field1441 = 4;
            }
            if (class103.field1441 == 4) {
                if (class290.field4567.method1960(-1) < 1) {
                    return;
                }
                int var7 = class290.field4567.method1959(-90);
                if (var7 == 21) {
                    class103.field1441 = 7;
                } else if (var7 == 29) {
                    class103.field1441 = 10;
                } else if (var7 == 1) {
                    class103.field1441 = 5;
                    class274.field4241 = var7;
                    return;
                } else if (var7 == 2) {
                    class103.field1441 = 8;
                } else if (var7 == 15) {
                    class103.field1441 = 0;
                    class274.field4241 = var7;
                    return;
                } else if (var7 == 23 && class20.field284 < 1) {
                    class103.field1441 = 1;
                    class20.field284++;
                    class225.field3424 = 0;
                    class290.field4567.method1958(5000);
                    class290.field4567 = null;
                    return;
                } else {
                    class103.field1441 = 0;
                    class274.field4241 = var7;
                    class290.field4567.method1958(arg0 ^ 0x1388);
                    class290.field4567 = null;
                    return;
                }
            }
            if (class103.field1441 == 6) {
                class281.field4359.field3402 = 0;
                class281.field4359.method1864(17, (byte) -69);
                class290.field4567.method1967(class281.field4359.field3336, 0, class281.field4359.field3402, 0);
                class103.field1441 = 4;
            } else if (class103.field1441 == 7) {
                if (class290.field4567.method1960(-1) >= 1) {
                    class292.field4589 = class290.field4567.method1959(-125) * 60 + 180;
                    class103.field1441 = 0;
                    class274.field4241 = 21;
                    class290.field4567.method1958(arg0 ^ 0x1388);
                    class290.field4567 = null;
                }
            } else if (class103.field1441 != 10) {
                if (class103.field1441 == 8) {
                    if (class290.field4567.method1960(-1) < 14) {
                        return;
                    }
                    class290.field4567.method1963(14, class233.field3518.field3336, 0, false);
                    class233.field3518.field3402 = 0;
                    class229.field3470 = class233.field3518.method1453((byte) -128);
                    class30.field411 = class233.field3518.method1453((byte) -128);
                    class110.field1529 = class233.field3518.method1453((byte) -128) == 1;
                    class176.field2476 = class233.field3518.method1453((byte) -128) == 1;
                    class75.field1055 = class233.field3518.method1453((byte) -127) == 1;
                    class266.field4007 = class233.field3518.method1453((byte) -128) == 1;
                    class256.field3922 = class233.field3518.method1453((byte) -128) == 1;
                    class35.field550 = class233.field3518.method1445(false);
                    class43.field643 = class233.field3518.method1453((byte) -127) == 1;
                    class180.field2522 = class233.field3518.method1453((byte) -127) == 1;
                    class234.method1537(class180.field2522, (byte) 124);
                    class114.method771(class180.field2522, (byte) 114);
                    if (!class286.field4521) {
                        if ((!class110.field1529 || class75.field1055) && !class43.field643) {
                            try {
                                class259.method1722("unzap", 3787, class200.field2784.field3715);
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class259.method1722("zap", 3787, class200.field2784.field3715);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    try {
                        class259.method1722("loggedin", 3787, class200.field2784.field3715);
                    } catch (Throwable var8) {
                    }
                    class253.field3868 = class233.field3518.method1861(arg0 ^ 0xED71CE03);
                    class105.field1460 = class233.field3518.method1445(false);
                    class103.field1441 = 9;
                }
                if (class103.field1441 == 9 && class290.field4567.method1960(-1) >= class105.field1460) {
                    class233.field3518.field3402 = 0;
                    class290.field4567.method1963(class105.field1460, class233.field3518.field3336, 0, false);
                    class274.field4241 = 2;
                    class103.field1441 = 0;
                    class254.method1703(120);
                    class101.field1422 = -1;
                    class85.method530((byte) 87, false);
                    class253.field3868 = -1;
                }
            } else if (class290.field4567.method1960(~arg0) >= 1) {
                class230.field3492 = class290.field4567.method1959(-102);
                class103.field1441 = 0;
                class274.field4241 = 29;
                class290.field4567.method1958(5000);
                class290.field4567 = null;
            }
        } catch (IOException var11) {
            if (class290.field4567 != null) {
                class290.field4567.method1958(5000);
                class290.field4567 = null;
            }
            if (class20.field284 < 1) {
                class20.field284++;
                class103.field1441 = 1;
                if (class56.field810 == class285.field4466) {
                    class56.field810 = class198.field2766;
                } else {
                    class56.field810 = class285.field4466;
                }
                class225.field3424 = 0;
            } else {
                class103.field1441 = 0;
                class274.field4241 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)V")
    public final void method971(int arg0, int arg1, byte arg2) {
        field2011++;
        int var4 = class107.field1493[arg1];
        if (this.field1994[var4] != 0 && class212.method1386(arg0, 0) != null && arg2 < -88) {
            this.field1994[var4] = class54.method339(arg0, Integer.MIN_VALUE);
            this.method968(1933532360);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIILgj;Lgj;[Lll;ZIII)Lgh;")
    public final class25 method972(int arg0, int arg1, int arg2, int arg3, class240 arg4, class240 arg5, class212[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field2004++;
        if (this.field2012 != -1) {
            return class270.method1783((byte) 98, this.field2012).method1915(arg3, arg1, arg0, arg6, arg10, arg5, 110, arg4, arg8, arg9);
        }
        long var12 = this.field2006;
        int[] var14 = this.field1994;
        if (arg4 != null && (arg4.field3656 >= 0 || arg4.field3655 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field1994[var15];
            }
            if (arg4.field3656 >= 0) {
                if (arg4.field3656 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class54.method339(1073741824, arg4.field3656);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg4.field3655 >= 0) {
                if (arg4.field3655 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class54.method339(1073741824, arg4.field3655);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class25 var16 = (class25) class160.field2244.method540((byte) -128, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class212.method1386(var43 & 0x3FFFFFFF, arg2 + 7893).method1623((byte) 41)) {
                        var17 = true;
                    }
                } else if (!class73.method463(var43 & 0x3FFFFFFF, arg2 ^ 0x67AB).method210(this.field2015, true)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field2002 != -1L) {
                    var16 = (class25) class160.field2244.method540((byte) -116, this.field2002);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class271[] var19 = new class271[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class271 var42 = class73.method463(var40 & 0x3FFFFFFF, -31104).method203(arg2 ^ 0xFFFFE1AB, this.field2015);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class271 var41 = class212.method1386(var40 & 0x3FFFFFFF, 0).method1619(-101);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    }
                }
                class151 var21 = null;
                if (this.field2010 != -1) {
                    var21 = class269.method1775((byte) 32, this.field2010);
                }
                if (var21 != null && var21.field2095 != null) {
                    for (int var22 = 0; var22 < var21.field2095.length; var22++) {
                        if (var21.field2095[var22] != null && var19[var22] != null) {
                            int var23 = var21.field2095[var22][0];
                            int var24 = var21.field2095[var22][2];
                            int var25 = var21.field2095[var22][1];
                            int var26 = var21.field2095[var22][4];
                            int var27 = var21.field2095[var22][3];
                            int var28 = var21.field2095[var22][5];
                            if (this.field2007 == null) {
                                this.field2007 = new int[var21.field2095.length][];
                            }
                            if (this.field2007[var22] == null) {
                                int[] var29 = this.field2007[var22] = new int[15];
                                if (var27 == 0 && var26 == 0 && var28 == 0) {
                                    var29[12] = -var23;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var24;
                                    var29[13] = -var25;
                                } else {
                                    int var30 = class90.field1259[var27] >> 1;
                                    int var31 = class90.field1255[var26] >> 1;
                                    int var32 = class90.field1255[var28] >> 1;
                                    int var33 = class90.field1259[var28] >> 1;
                                    int var34 = class90.field1255[var27] >> 1;
                                    int var35 = class90.field1259[var26] >> 1;
                                    var29[5] = -var30;
                                    int var36 = var30 * var32 + 16384 >> 15;
                                    int var37 = var30 * var33 + 16384 >> 15;
                                    var29[3] = var33 * var34 + 16384 >> 15;
                                    var29[6] = -var35 * var32 + (var31 * var37) + 16384 >> 15;
                                    var29[0] = var31 * var32 + var35 * var37 + 16384 >> 15;
                                    var29[4] = var32 * var34 + 16384 >> 15;
                                    var29[8] = var31 * var34 + 16384 >> 15;
                                    var29[2] = var34 * var35 + 16384 >> 15;
                                    var29[14] = var29[5] * -var25 + var29[2] * -var23 + var29[8] * -var24 + 16384 >> 15;
                                    var29[7] = -var33 * -var35 + var31 * var36 + 16384 >> 15;
                                    var29[1] = -var33 * var31 + var35 * var36 + 16384 >> 15;
                                    var29[13] = var29[1] * -var23 + 16384 - (-(var29[4] * -var25) - var29[7] * -var24) >> 15;
                                    var29[12] = var29[3] * -var25 + var29[0] * -var23 + var29[6] * -var24 + 16384 >> 15;
                                }
                                var29[9] = var23;
                                var29[10] = var25;
                                var29[11] = var24;
                            }
                            if (var27 != 0 || var26 != 0 || var28 != 0) {
                                var19[var22].method1814(var27, var26, var28);
                            }
                            if (var23 != 0 || var25 != 0 || var24 != 0) {
                                var19[var22].method1792(var23, var25, var24);
                            }
                        }
                    }
                }
                class271 var38 = new class271(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (this.field2003[var39] < class248.field3795[var39].length) {
                        var38.method1796(class11.field109[var39], class248.field3795[var39][this.field2003[var39]]);
                    }
                    if (this.field2003[var39] < class199.field2767[var39].length) {
                        var38.method1796(class276.field4274[var39], class199.field2767[var39][this.field2003[var39]]);
                    }
                }
                var16 = var38.method1794(64, 850, -30, -50, -30);
                if (arg7) {
                    class160.field2244.method543(var16, var12, 858993459);
                    this.field2002 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg6 == null ? 0 : arg6.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg6[var49] != null) {
                class240 var72 = class132.method905(true, arg6[var49].field3195);
                if (var72.field3665 != null) {
                    class19.field276[var49] = var72;
                    var44 = true;
                    int var73 = arg6[var49].field3196;
                    int var74 = arg6[var49].field3190;
                    int var75 = var72.field3665[var74];
                    class60.field846[var49] = class245.method1648(91, var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class41.field613[var49] = var76;
                    if (class60.field846[var49] != null) {
                        var46 |= class60.field846[var49].method1061(var76, -1);
                        var45 |= class60.field846[var49].method1058(123, var76);
                        var48 |= var72.field3681;
                    }
                    if ((var72.field3667 || class169.field2350) && var73 != -1 && var72.field3665.length > var73) {
                        class81.field1111[var49] = var72.field3673[var74];
                        class19.field275[var49] = arg6[var49].field3189;
                        int var77 = var72.field3665[var73];
                        class171.field2370[var49] = class245.method1648(arg2 + 7994, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class248.field3802[var49] = var78;
                        if (class171.field2370[var49] != null) {
                            var46 |= class171.field2370[var49].method1061(var78, -1);
                            var45 |= class171.field2370[var49].method1058(86, var78);
                        }
                    } else {
                        class81.field1111[var49] = 0;
                        class19.field275[var49] = 0;
                        class171.field2370[var49] = null;
                        class248.field3802[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg4 == null && arg5 == null) {
            return var16;
        }
        if (arg2 != -7893) {
            this.method967(-32, 123, -82);
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 0;
        class159 var53 = null;
        class159 var54 = null;
        if (arg4 != null) {
            int var55 = arg4.field3665[arg9];
            int var56 = var55 >>> 16;
            var51 = var55 & 0xFFFF;
            var54 = class245.method1648(114, var56);
            if (var54 != null) {
                var46 |= var54.method1061(var51, arg2 + 7892);
                var45 |= var54.method1058(66, var51);
                var48 |= arg4.field3681;
            }
            if ((arg4.field3667 || class169.field2350) && arg1 != -1 && arg4.field3665.length > arg1) {
                int var57 = arg4.field3665[arg1];
                var52 = arg4.field3673[arg9];
                int var58 = var57 >>> 16;
                var50 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var53 = var54;
                } else {
                    var53 = class245.method1648(arg2 + 7995, var50 >>> 16);
                }
                if (var53 != null) {
                    var46 |= var53.method1061(var50, -1);
                    var45 |= var53.method1058(121, var50);
                }
            }
        }
        int var59 = -1;
        int var60 = 0;
        int var61 = -1;
        class159 var62 = null;
        class159 var63 = null;
        if (arg5 != null) {
            int var64 = arg5.field3665[arg3];
            int var65 = var64 >>> 16;
            var61 = var64 & 0xFFFF;
            var63 = class245.method1648(72, var65);
            if (var63 != null) {
                var46 |= var63.method1061(var61, arg2 ^ 0x1ED4);
                var45 |= var63.method1058(95, var61);
                var48 |= arg5.field3681;
            }
            if ((arg5.field3667 || class169.field2350) && arg10 != -1 && arg5.field3665.length > arg10) {
                int var66 = arg5.field3665[arg10];
                int var67 = var66 >>> 16;
                var60 = arg5.field3673[arg3];
                var59 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var62 = var63;
                } else {
                    var62 = class245.method1648(arg2 + 7981, var59 >>> 16);
                }
                if (var62 != null) {
                    var46 |= var62.method1061(var59, -1);
                    var45 |= var62.method1058(68, var59);
                }
            }
        }
        class25 var68 = var16.method109(!var45, !var46, !var48);
        int var69 = 0;
        int var70 = 1;
        while (var47 > var69) {
            if (class60.field846[var69] != null) {
                var68.method174(class60.field846[var69], class41.field613[var69], class171.field2370[var69], class248.field3802[var69], class19.field275[var69] - 1, class81.field1111[var69], var70, class19.field276[var69].field3681, this.field2007[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var54 != null && var63 != null) {
            var68.method173(var54, var51, var53, var50, arg0 - 1, var52, var63, var61, var62, var59, arg8 - 1, var60, arg4.field3662, arg4.field3681 | arg5.field3681);
        } else if (var54 != null) {
            var68.method172(var54, var51, var53, var50, arg0 - 1, var52, arg4.field3681);
        } else if (var63 != null) {
            var68.method172(var63, var61, var62, var59, arg8 - 1, var60, arg5.field3681);
        }
        for (int var71 = 0; var71 < var47; var71++) {
            class60.field846[var71] = null;
            class171.field2370[var71] = null;
            class19.field276[var71] = null;
        }
        return var68;
    }
}
