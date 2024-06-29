import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class20 extends class254 implements class161 {

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Lob;")
    public class438 field261;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Z")
    private boolean field257;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Liq;")
    public static class360 field255 = null;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field258 = new String[100];

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Lng;")
    public static class190 field259 = new class190(4);

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "Ljava/lang/String;")
    public static String field273 = "shake:";

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Laa;B)V", line = 8)
    public final void method122(class281 arg0, byte arg1) {
        if (arg1 < 16) {
            this.field257 = true;
        }
        ++field253;
        this.field261.method2751(arg0, (byte) 100);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I", line = 19)
    public final int method123(byte arg0) {
        ++field271;
        if (arg0 <= 108) {
            field269 = 127;
        }
        return this.field261.field6316;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I", line = 30)
    public final int method124(int arg0) {
        if (arg0 != -11197) {
            field258 = null;
        }
        ++field267;
        return this.field261.field6324;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[B", line = 41)
    public static final byte[] method125(int arg0, int arg1) {
        ++field250;
        class434 var2 = (class434) class62.field976.method567((byte) 55, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class99.method704(var4, var7, (byte) -10);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class434(var3);
            class62.field976.method565(-1, var2, (long) arg0);
        }
        if (arg1 >= -59) {
            field272 = 68;
        }
        return var2.field6232;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I", line = 90)
    public final int method126(int arg0) {
        ++field260;
        if (arg0 != -13482) {
            field273 = null;
        }
        return this.field261.field6297;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z", line = 101)
    public final boolean method127(byte arg0) {
        int var2 = -14 % ((arg0 - -52) / 33);
        ++field252;
        return this.field261.method2743((byte) 115);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Laa;Z)V", line = 126)
    public final void method128(class281 arg0, boolean arg1) {
        ++field254;
        class75 var3 = this.field261.method2747(arg0, super.field3488, super.field3481, true, arg1, 131072, arg1);
        if (var3 != null) {
            this.field261.method2744(super.field3488 >> 7, super.field3481 >> 7, var3, false, arg0, super.field3481 >> 7, super.field3488 >> 7, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIILaa;ILqh;)V", line = 140)
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        if (arg0 != 0) {
            method130(-70);
        }
        ++field263;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Laa;Lsk;IIIIIIIZI)V", line = 153)
    public class20(class281 arg0, class369 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class441.method2762(arg3, 1, arg2));
        this.field261 = new class438(arg0, arg1, arg2, arg3, arg4, arg5, super.field3481, super.field3488, arg9, arg10);
        this.field257 = arg1.field5221 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V", line = 162)
    public static void method130(int arg0) {
        field258 = null;
        field273 = null;
        if (arg0 == 27647) {
            field259 = null;
            field255 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Laa;I)Lcn;", line = 175)
    public final class300 method131(class281 arg0, int arg1) {
        ++field264;
        if (arg1 <= 72) {
            this.field261 = null;
        }
        class75 var3 = this.field261.method2747(arg0, super.field3488, super.field3481, false, true, 1024, true);
        if (var3 == null) {
            return null;
        } else {
            class261 var4 = arg0.method1769();
            var4.method882(super.field3481, super.field3490, super.field3488);
            class300 var5 = null;
            if (this.field257) {
                var5 = class8.method54((byte) -114, 1);
            }
            if (this.field261.field6318 == null) {
                var3.method514(var4, var5 != null ? var5.field4152[0] : null, 0);
            } else {
                class260 var6 = this.field261.field6318.method1014();
                arg0.method1721(var3, var6, var4, var5 != null ? var5.field4152[0] : null, 0);
            }
            this.field261.method2744(super.field3488 >> 7, super.field3481 >> 7, var3, true, arg0, super.field3481 >> 7, super.field3488 >> 7, (byte) -115);
            return var5;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lvk;I)V", line = 214)
    public static final void method132(class207 arg0, int arg1) {
        ++field262;
        if (arg0 != null && class167.field2393.field2720 != arg0) {
            int var2 = arg0.field2808;
            int var3 = arg0.field2799;
            int var4 = arg0.field2797;
            int var5 = (int) arg0.field2807;
            long var6 = arg0.field2807;
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            if (~var4 == -37) {
                class442.field6400.method158((byte) 7, 242);
                ++class278.field3765;
                class442.field6400.method2386(var3, 19324);
                class383 var8 = class290.method1869((byte) 96, var3);
                if (var8.field5570 != null && ~var8.field5570[0][0] == -6) {
                    int var9 = var8.field5570[0][1];
                    if (class447.field6439[var9] != var8.field5527[0]) {
                        class447.field6439[var9] = var8.field5527[0];
                        class333.method2069(-2, var9);
                    }
                }
            }
            if (var4 == 15) {
                class442.field6400.method158((byte) 7, 62);
                ++class222.field2983;
                class442.field6400.method2386(var3, 19324);
                class442.field6400.method2392(class339.field4745, -1565457376);
                class442.field6400.method2428(var5, -84);
                class442.field6400.method2416(arg1 ^ 22066, var2);
                class442.field6400.method2416(22064, class236.field3214);
                class437.field6273 = 0;
                class15.field173 = class290.method1869((byte) 115, var3);
                class14.field167 = var2;
            }
            if (var4 == 40) {
                class442.field6400.method158((byte) 7, 242);
                ++class278.field3765;
                class442.field6400.method2386(var3, 19324);
                class383 var10 = class290.method1869((byte) 98, var3);
                if (var10.field5570 != null && var10.field5570[0][0] == 5) {
                    int var11 = var10.field5570[0][1];
                    class447.field6439[var11] = -class447.field6439[var11] + 1;
                    class333.method2069(-2, var11);
                }
            }
            if (var4 == 5) {
                class398.method2569(var3, var2, 19958);
            }
            if (arg1 != 2) {
                field272 = -40;
            }
            if (~var4 == -50) {
                class437 var12 = class445.field6422[var5];
                if (var12 != null) {
                    class369.field5234 = 0;
                    class27.field437 = class361.field5073;
                    class225.field3025 = class349.field4879;
                    ++class216.field2864;
                    class204.field2764 = 2;
                    class442.field6400.method158((byte) 7, 135);
                    class442.field6400.method2430(var5, -123);
                    class442.field6400.method2404(class293.field4056[82] ? 1 : 0, (byte) -95);
                    class386.method2522(class307.field4211.field944[0], 0, true, var12.method410((byte) 41), -2, (byte) 68, class307.field4211.field956[0], 0, var12.method410((byte) 99), var12.field956[0], var12.field944[0]);
                }
            }
            if (var4 == 16) {
                class437 var13 = class445.field6422[var5];
                if (var13 != null) {
                    ++class36.field555;
                    class204.field2764 = 2;
                    class225.field3025 = class349.field4879;
                    class27.field437 = class361.field5073;
                    class369.field5234 = 0;
                    class442.field6400.method158((byte) 7, 127);
                    class442.field6400.method2430(class301.field4170, 37);
                    class442.field6400.method2428(var5, -70);
                    class442.field6400.method2384(class293.field4056[82] ? 1 : 0, true);
                    class442.field6400.method2430(class29.field458, 71);
                    class442.field6400.method2407(class55.field805, 36);
                    class386.method2522(class307.field4211.field944[0], 0, true, var13.method410((byte) 116), -2, (byte) -97, class307.field4211.field956[0], 0, var13.method410((byte) 70), var13.field956[0], var13.field944[0]);
                }
            }
            if (var4 == 23) {
                class225.field3025 = class349.field4879;
                class204.field2764 = 2;
                class27.field437 = class361.field5073;
                class369.field5234 = 0;
                ++class176.field2484;
                class442.field6400.method158((byte) 7, 119);
                class442.field6400.method2393(class293.field4056[82] ? 1 : 0, (byte) -126);
                class442.field6400.method2407(class55.field805, arg1 + 6);
                class442.field6400.method2430(class29.field458, arg1 ^ 66);
                class442.field6400.method2416(22064, class301.field4170);
                class442.field6400.method2428(Integer.MAX_VALUE & (int) (var6 >>> 32), 121);
                class442.field6400.method2428(class449.field6509 + var2, -7);
                class442.field6400.method2416(22064, class354.field4981 + var3);
                class191.method1268(var6, var2, var3, -68);
            }
            if (~var4 == -60) {
                class354 var14 = class12.field153[var5];
                if (var14 != null) {
                    class369.field5234 = 0;
                    class225.field3025 = class349.field4879;
                    class27.field437 = class361.field5073;
                    class204.field2764 = 2;
                    ++class154.field2167;
                    class442.field6400.method158((byte) 7, 73);
                    class442.field6400.method2396(!class293.field4056[82] ? 0 : 1, arg1 + 12448);
                    class442.field6400.method2438(87, var5);
                    class386.method2522(class307.field4211.field944[0], 0, true, var14.method410((byte) 66), -2, (byte) -70, class307.field4211.field956[0], 0, var14.method410((byte) 56), var14.field956[0], var14.field944[0]);
                }
            }
            if (~var4 == -1011) {
                class27.field437 = class361.field5073;
                class225.field3025 = class349.field4879;
                class369.field5234 = 0;
                class204.field2764 = 2;
                class437 var15 = class445.field6422[var5];
                if (var15 != null) {
                    class221 var16 = var15.field6290;
                    if (var16.field2959 != null) {
                        var16 = var16.method1407(-36);
                    }
                    if (var16 != null) {
                        ++class413.field5999;
                        class442.field6400.method158((byte) 7, 109);
                        class442.field6400.method2416(22064, var16.field2950);
                    }
                }
            }
            if (~var4 == -1009) {
                class369.field5234 = 0;
                ++class91.field1372;
                class225.field3025 = class349.field4879;
                class27.field437 = class361.field5073;
                class204.field2764 = 2;
                class442.field6400.method158((byte) 7, 68);
                class442.field6400.method2416(22064, var5);
            }
            if (var4 == 1004) {
                class383 var17 = class290.method1869((byte) 72, var3);
                if (var17 != null && var17.field5560[var2] >= 100000) {
                    class141.method966((byte) -102, var17.field5560[var2] + " x " + class347.method2222(var5, arg1 ^ 18680).field5722);
                } else {
                    ++class31.field476;
                    class442.field6400.method158((byte) 7, 9);
                    class442.field6400.method2416(22064, var5);
                }
                class437.field6273 = 0;
                class15.field173 = class290.method1869((byte) 45, var3);
                class14.field167 = var2;
            }
            if (var4 == 34) {
                class225.field3025 = class349.field4879;
                class204.field2764 = 2;
                class27.field437 = class361.field5073;
                ++class170.field2430;
                class369.field5234 = 0;
                class442.field6400.method158((byte) 7, 2);
                class442.field6400.method2438(110, var2 - -class449.field6509);
                class442.field6400.method2438(51, class354.field4981 + var3);
                class442.field6400.method2428(var5, 120);
                class442.field6400.method2396(class293.field4056[82] ? 1 : 0, 12450);
                class135.method938(var2, (byte) 124, var3);
            }
            if (~var4 == -31) {
                ++class394.field5763;
                class442.field6400.method158((byte) 7, 105);
                class442.field6400.method2386(var3, arg1 + 19322);
                class442.field6400.method2416(arg1 + 22062, var2);
                class442.field6400.method2428(var5, -123);
                class437.field6273 = 0;
                class15.field173 = class290.method1869((byte) 111, var3);
                class14.field167 = var2;
            }
            if (~var4 == -21) {
                class442.field6400.method158((byte) 7, 180);
                ++class405.field5888;
                class442.field6400.method2386(var3, 19324);
                class442.field6400.method2428(var2, arg1 + 124);
                class442.field6400.method2430(var5, 75);
                class437.field6273 = 0;
                class15.field173 = class290.method1869((byte) 73, var3);
                class14.field167 = var2;
            }
            if (~var4 == -61) {
                class369.field5234 = 0;
                class225.field3025 = class349.field4879;
                class204.field2764 = 2;
                ++class260.field3560;
                class27.field437 = class361.field5073;
                class442.field6400.method158((byte) 7, 43);
                class442.field6400.method2428(Integer.MAX_VALUE & (int) (var6 >>> 32), -21);
                class442.field6400.method2438(120, class449.field6509 + var2);
                class442.field6400.method2393(class293.field4056[82] ? 1 : 0, (byte) -109);
                class442.field6400.method2416(22064, class354.field4981 + var3);
                class191.method1268(var6, var2, var3, 112);
            }
            if (var4 == 32) {
                class354 var18 = class12.field153[var5];
                if (var18 != null) {
                    class204.field2764 = 2;
                    class369.field5234 = 0;
                    class225.field3025 = class349.field4879;
                    ++class73.field1131;
                    class27.field437 = class361.field5073;
                    class442.field6400.method158((byte) 7, 195);
                    class442.field6400.method2416(22064, var5);
                    class442.field6400.method2384(class293.field4056[82] ? 1 : 0, true);
                    class386.method2522(class307.field4211.field944[0], 0, true, var18.method410((byte) 77), -2, (byte) -28, class307.field4211.field956[0], 0, var18.method410((byte) 84), var18.field956[0], var18.field944[0]);
                }
            }
            if (~var4 == -4) {
                class225.field3025 = class349.field4879;
                ++class327.field4461;
                class369.field5234 = 0;
                class204.field2764 = 1;
                class27.field437 = class361.field5073;
                class442.field6400.method158((byte) 7, 39);
                class442.field6400.method2428(class354.field4981 + var3, -83);
                class442.field6400.method2392(class339.field4745, arg1 + -1565457378);
                class442.field6400.method2438(109, class236.field3214);
                class442.field6400.method2438(79, class449.field6509 + var2);
                class386.method2522(class307.field4211.field944[0], 0, true, 1, -4, (byte) 71, class307.field4211.field956[0], 0, 1, var2, var3);
            }
            if (~var4 == -23) {
                class354 var19 = class12.field153[var5];
                if (var19 != null) {
                    class27.field437 = class361.field5073;
                    class204.field2764 = 2;
                    class369.field5234 = 0;
                    ++class243.field3358;
                    class225.field3025 = class349.field4879;
                    class442.field6400.method158((byte) 7, 176);
                    class442.field6400.method2416(22064, var5);
                    class442.field6400.method2404(class293.field4056[82] ? 1 : 0, (byte) 119);
                    class386.method2522(class307.field4211.field944[0], 0, true, var19.method410((byte) 121), -2, (byte) 71, class307.field4211.field956[0], 0, var19.method410((byte) 123), var19.field956[0], var19.field944[0]);
                }
            }
            if (~var4 == -44) {
                class378.method2471(125);
                class383 var20 = class290.method1869((byte) 87, var3);
                class55.field805 = var3;
                class29.field458 = var2;
                class301.field4170 = var5;
                class222.field2980 = 1;
                class86.method596(14459, var20);
                class265.field3624 = "<col=ff9040>" + class347.method2222(var5, 18682).field5722 + "<col=ffffff>";
                if (class265.field3624 == null) {
                    class265.field3624 = "null";
                }
            } else {
                if (~var4 == -42) {
                    class442.field6400.method158((byte) 7, 243);
                    ++class290.field4009;
                    class442.field6400.method2386(var3, 19324);
                    class442.field6400.method2430(var5, 100);
                    class442.field6400.method2438(97, var2);
                    class437.field6273 = 0;
                    class15.field173 = class290.method1869((byte) 40, var3);
                    class14.field167 = var2;
                }
                if (var4 == 46) {
                    class442.field6400.method158((byte) 7, 142);
                    ++class146.field2124;
                    class442.field6400.method2386(var3, 19324);
                    class442.field6400.method2416(22064, class301.field4170);
                    class442.field6400.method2392(class55.field805, -1565457376);
                    class442.field6400.method2430(var2, -118);
                    class442.field6400.method2416(arg1 + 22062, class29.field458);
                    class442.field6400.method2416(22064, var5);
                    class437.field6273 = 0;
                    class15.field173 = class290.method1869((byte) 8, var3);
                    class14.field167 = var2;
                }
                if (~var4 == -49) {
                    ++class252.field3473;
                    class369.field5234 = 0;
                    class204.field2764 = 2;
                    class27.field437 = class361.field5073;
                    class225.field3025 = class349.field4879;
                    class442.field6400.method158((byte) 7, 238);
                    class442.field6400.method2404(class293.field4056[82] ? 1 : 0, (byte) 122);
                    class442.field6400.method2416(22064, Integer.MAX_VALUE & (int) (var6 >>> 32));
                    class442.field6400.method2428(class354.field4981 + var3, 121);
                    class442.field6400.method2438(arg1 ^ 86, var2 - -class449.field6509);
                    class191.method1268(var6, var2, var3, -89);
                }
                if (~var4 == -1003) {
                    class27.field437 = class361.field5073;
                    ++class31.field476;
                    class225.field3025 = class349.field4879;
                    class369.field5234 = 0;
                    class204.field2764 = 2;
                    class442.field6400.method158((byte) 7, 9);
                    class442.field6400.method2416(arg1 ^ 22066, var5);
                }
                if (var4 == 21) {
                    class383 var21 = class290.method1869((byte) 27, var3);
                    boolean var22 = true;
                    if (var21.field5480 > 0) {
                        var22 = class308.method1955(-59, var21);
                    }
                    if (var22) {
                        class442.field6400.method158((byte) 7, 242);
                        ++class278.field3765;
                        class442.field6400.method2386(var3, 19324);
                    }
                }
                if (var4 == 6) {
                    ++class182.field2546;
                    class369.field5234 = 0;
                    class225.field3025 = class349.field4879;
                    class27.field437 = class361.field5073;
                    class204.field2764 = 2;
                    class442.field6400.method158((byte) 7, 235);
                    class442.field6400.method2430(var3 - -class354.field4981, arg1 + 109);
                    class442.field6400.method2430(Integer.MAX_VALUE & (int) (var6 >>> 32), 61);
                    class442.field6400.method2393(class293.field4056[82] ? 1 : 0, (byte) -95);
                    class442.field6400.method2430(var2 - -class449.field6509, arg1 ^ 75);
                    class191.method1268(var6, var2, var3, -78);
                }
                if (var4 == 1) {
                    class437 var23 = class445.field6422[var5];
                    if (var23 != null) {
                        class204.field2764 = 2;
                        class225.field3025 = class349.field4879;
                        ++class322.field4416;
                        class369.field5234 = 0;
                        class27.field437 = class361.field5073;
                        class442.field6400.method158((byte) 7, 65);
                        class442.field6400.method2416(arg1 ^ 22066, var5);
                        class442.field6400.method2404(!class293.field4056[82] ? 0 : 1, (byte) 126);
                        class386.method2522(class307.field4211.field944[0], 0, true, var23.method410((byte) 127), -2, (byte) 113, class307.field4211.field956[0], 0, var23.method410((byte) 58), var23.field956[0], var23.field944[0]);
                    }
                }
                if (var4 == 19 || var4 == 1001) {
                    class395.method2562(var2, var3, true, var5, arg0.field2798);
                }
                if (var4 == 2) {
                    ++class307.field4209;
                    class442.field6400.method158((byte) 7, 188);
                    class442.field6400.method2386(var3, 19324);
                    class442.field6400.method2430(var5, arg1 + -111);
                    class442.field6400.method2438(42, var2);
                    class437.field6273 = 0;
                    class15.field173 = class290.method1869((byte) 94, var3);
                    class14.field167 = var2;
                }
                if (var4 == 13) {
                    class383 var24 = class315.method2010(var3, var2, arg1 ^ -27592);
                    if (var24 != null) {
                        class378.method2471(38);
                        class265 var25 = client.method1119(var24);
                        class160.method1065(var3, var25.field3615, var24.field5522, var24.field5533, var2, arg1 ^ 108, var25.method1642((byte) 28));
                        class222.field2980 = 0;
                        class25.field359 = class160.method1067(arg1 ^ -7355, var24);
                        if (class25.field359 == null) {
                            class25.field359 = "Null";
                        }
                        if (var24.field5589) {
                            class125.field1770 = var24.field5583 + "<col=ffffff>";
                            return;
                        }
                        class125.field1770 = "<col=00ff00>" + var24.field5474 + "<col=ffffff>";
                    }
                } else {
                    if (~var4 == -32) {
                        class437 var26 = class445.field6422[var5];
                        if (var26 != null) {
                            class369.field5234 = 0;
                            class27.field437 = class361.field5073;
                            class225.field3025 = class349.field4879;
                            ++class153.field2159;
                            class204.field2764 = 2;
                            class442.field6400.method158((byte) 7, 82);
                            class442.field6400.method2430(class236.field3214, 113);
                            class442.field6400.method2393(!class293.field4056[82] ? 0 : 1, (byte) -103);
                            class442.field6400.method2428(var5, -122);
                            class442.field6400.method2392(class339.field4745, arg1 ^ -1565457374);
                            class386.method2522(class307.field4211.field944[0], 0, true, var26.method410((byte) 47), -2, (byte) -87, class307.field4211.field956[0], 0, var26.method410((byte) 114), var26.field956[0], var26.field944[0]);
                        }
                    }
                    if (~var4 == -46) {
                        class442.field6400.method158((byte) 7, 93);
                        ++class319.field4377;
                        class442.field6400.method2386(var3, 19324);
                        class442.field6400.method2416(22064, var5);
                        class442.field6400.method2428(var2, arg1 ^ 2);
                        class437.field6273 = 0;
                        class15.field173 = class290.method1869((byte) 37, var3);
                        class14.field167 = var2;
                    }
                    if (~var4 == -13) {
                        if (class204.field2771 > 0 && class293.field4056[82] && class293.field4056[81]) {
                            class99.method701(class354.field4981 + var3, false, class449.field6509 - -var2, class265.field3617);
                        } else {
                            class27.field437 = class361.field5073;
                            class369.field5234 = 0;
                            ++class417.field6043;
                            class204.field2764 = 1;
                            class225.field3025 = class349.field4879;
                            class442.field6400.method158((byte) 7, 94);
                            class442.field6400.method2416(22064, class449.field6509 + var2);
                            class442.field6400.method2438(arg1 ^ 89, class354.field4981 + var3);
                        }
                    }
                    if (var4 == 25) {
                        class354 var27 = class12.field153[var5];
                        if (var27 != null) {
                            ++class214.field2854;
                            class369.field5234 = 0;
                            class27.field437 = class361.field5073;
                            class225.field3025 = class349.field4879;
                            class204.field2764 = 2;
                            class442.field6400.method158((byte) 7, 240);
                            class442.field6400.method2430(var5, arg1 + 84);
                            class442.field6400.method2396(class293.field4056[82] ? 1 : 0, 12450);
                            class386.method2522(class307.field4211.field944[0], 0, true, var27.method410((byte) 54), -2, (byte) -72, class307.field4211.field956[0], 0, var27.method410((byte) 100), var27.field956[0], var27.field944[0]);
                        }
                    }
                    if (~var4 == -1008 || ~var4 == -1010 || ~var4 == -1013 || var4 == 1005 || var4 == 1011) {
                        class301.method1938(var4, var5, var2, true);
                    }
                    if (~var4 == -43) {
                        class204.field2764 = 2;
                        ++class142.field2025;
                        class27.field437 = class361.field5073;
                        class369.field5234 = 0;
                        class225.field3025 = class349.field4879;
                        class442.field6400.method158((byte) 7, 64);
                        class442.field6400.method2396(!class293.field4056[82] ? 0 : 1, 12450);
                        class442.field6400.method2416(22064, class449.field6509 + var2);
                        class442.field6400.method2430(class354.field4981 + var3, -99);
                        class442.field6400.method2438(107, var5);
                        class135.method938(var2, (byte) 101, var3);
                    }
                    if (var4 == 11) {
                        if (~class204.field2771 < -1 && class293.field4056[82] && class293.field4056[81]) {
                            class99.method701(class354.field4981 + var3, false, class449.field6509 + var2, class265.field3617);
                        } else {
                            class120.method811(0, var3, var2, var5);
                            if (~var5 != -2) {
                                class204.field2764 = 1;
                                class225.field3025 = class349.field4879;
                                class369.field5234 = 0;
                                class27.field437 = class361.field5073;
                            } else {
                                class442.field6400.method2396(-1, 12450);
                                class442.field6400.method2396(-1, arg1 + 12448);
                                class442.field6400.method2416(22064, (int) class6.field98);
                                class442.field6400.method2396(57, 12450);
                                class442.field6400.method2396(class390.field5737, 12450);
                                class442.field6400.method2396(class23.field312, 12450);
                                class442.field6400.method2396(89, 12450);
                                class442.field6400.method2416(arg1 + 22062, class307.field4211.field6197);
                                class442.field6400.method2416(arg1 ^ 22066, class307.field4211.field6192);
                                class442.field6400.method2396(63, 12450);
                            }
                            class386.method2522(class307.field4211.field944[0], 0, true, 1, -4, (byte) -64, class307.field4211.field956[0], 0, 1, var2, var3);
                        }
                    }
                    if (var4 == 58 && class353.field4958 == null) {
                        class127.method848(-1, var3, var2);
                        class353.field4958 = class315.method2010(var3, var2, arg1 ^ -27592);
                        class86.method596(14459, class353.field4958);
                    }
                    if (var4 == 17) {
                        ++class229.field3056;
                        class442.field6400.method158((byte) 7, 51);
                        class442.field6400.method2386(var3, arg1 + 19322);
                        class442.field6400.method2428(var5, arg1 ^ 119);
                        class442.field6400.method2416(22064, var2);
                        class437.field6273 = 0;
                        class15.field173 = class290.method1869((byte) 12, var3);
                        class14.field167 = var2;
                    }
                    if (~var4 == -29) {
                        class437 var28 = class445.field6422[var5];
                        if (var28 != null) {
                            class225.field3025 = class349.field4879;
                            class204.field2764 = 2;
                            class27.field437 = class361.field5073;
                            ++class118.field1695;
                            class369.field5234 = 0;
                            class442.field6400.method158((byte) 7, 206);
                            class442.field6400.method2428(var5, -94);
                            class442.field6400.method2393(class293.field4056[82] ? 1 : 0, (byte) -122);
                            class386.method2522(class307.field4211.field944[0], 0, true, var28.method410((byte) 115), -2, (byte) 81, class307.field4211.field956[0], 0, var28.method410((byte) 100), var28.field956[0], var28.field944[0]);
                        }
                    }
                    if (~var4 == -52) {
                        class369.field5234 = 0;
                        class225.field3025 = class349.field4879;
                        ++class158.field2238;
                        class204.field2764 = 2;
                        class27.field437 = class361.field5073;
                        class442.field6400.method158((byte) 7, 116);
                        class442.field6400.method2384(class293.field4056[82] ? 1 : 0, true);
                        class442.field6400.method2416(arg1 + 22062, class449.field6509 + var2);
                        class442.field6400.method2428((int) (var6 >>> 32) & Integer.MAX_VALUE, 7);
                        class442.field6400.method2438(53, class354.field4981 + var3);
                        class191.method1268(var6, var2, var3, arg1 ^ -114);
                    }
                    if (var4 == 7) {
                        class442.field6400.method158((byte) 7, 207);
                        ++class365.field5115;
                        class442.field6400.method2386(var3, 19324);
                        class442.field6400.method2428(var2, -55);
                        class442.field6400.method2416(22064, var5);
                        class437.field6273 = 0;
                        class15.field173 = class290.method1869((byte) 92, var3);
                        class14.field167 = var2;
                    }
                    if (~var4 == -27) {
                        class442.field6400.method158((byte) 7, 227);
                        ++class155.field2195;
                        class442.field6400.method2386(var3, 19324);
                        class442.field6400.method2428(var5, 126);
                        class442.field6400.method2438(119, var2);
                        class437.field6273 = 0;
                        class15.field173 = class290.method1869((byte) 57, var3);
                        class14.field167 = var2;
                    }
                    if (var4 == 29) {
                        ++class433.field6229;
                        class27.field437 = class361.field5073;
                        class204.field2764 = 2;
                        class369.field5234 = 0;
                        class225.field3025 = class349.field4879;
                        class442.field6400.method158((byte) 7, 189);
                        class442.field6400.method2430(var3 - -class354.field4981, 126);
                        class442.field6400.method2416(22064, class236.field3214);
                        class442.field6400.method2386(class339.field4745, 19324);
                        class442.field6400.method2428((int) (var6 >>> 32) & Integer.MAX_VALUE, 126);
                        class442.field6400.method2416(22064, class449.field6509 + var2);
                        class442.field6400.method2396(class293.field4056[82] ? 1 : 0, 12450);
                        class191.method1268(var6, var2, var3, 55);
                    }
                    if (var4 == 4) {
                        class225.field3025 = class349.field4879;
                        ++class280.field3831;
                        class369.field5234 = 0;
                        class204.field2764 = 2;
                        class27.field437 = class361.field5073;
                        class442.field6400.method158((byte) 7, 30);
                        class442.field6400.method2438(arg1 + 74, class354.field4981 + var3);
                        class442.field6400.method2428(var5, -56);
                        class442.field6400.method2416(22064, class449.field6509 + var2);
                        class442.field6400.method2404(class293.field4056[82] ? 1 : 0, (byte) 119);
                        class135.method938(var2, (byte) 103, var3);
                    }
                    if (~var4 == -58) {
                        class354 var29 = class12.field153[var5];
                        if (var29 != null) {
                            class27.field437 = class361.field5073;
                            ++class354.field4989;
                            class225.field3025 = class349.field4879;
                            class369.field5234 = 0;
                            class204.field2764 = 2;
                            class442.field6400.method158((byte) 7, 237);
                            class442.field6400.method2416(22064, var5);
                            class442.field6400.method2404(!class293.field4056[82] ? 0 : 1, (byte) -95);
                            class386.method2522(class307.field4211.field944[0], 0, true, var29.method410((byte) 111), -2, (byte) -69, class307.field4211.field956[0], 0, var29.method410((byte) 70), var29.field956[0], var29.field944[0]);
                        }
                    }
                    if (var4 == 47) {
                        class225.field3025 = class349.field4879;
                        class27.field437 = class361.field5073;
                        ++class58.field833;
                        class204.field2764 = 2;
                        class369.field5234 = 0;
                        class442.field6400.method158((byte) 7, 87);
                        class442.field6400.method2428(var5, arg1 + 117);
                        class442.field6400.method2438(arg1 + 102, var3 - -class354.field4981);
                        class442.field6400.method2396(class293.field4056[82] ? 1 : 0, arg1 + 12448);
                        class442.field6400.method2430(class449.field6509 + var2, -119);
                        class135.method938(var2, (byte) 104, var3);
                    }
                    if (~var4 == -25) {
                        class354 var30 = class12.field153[var5];
                        if (var30 != null) {
                            class27.field437 = class361.field5073;
                            class225.field3025 = class349.field4879;
                            class204.field2764 = 2;
                            ++class294.field4061;
                            class369.field5234 = 0;
                            class442.field6400.method158((byte) 7, 203);
                            class442.field6400.method2416(22064, var5);
                            class442.field6400.method2396(class293.field4056[82] ? 1 : 0, 12450);
                            class386.method2522(class307.field4211.field944[0], 0, true, var30.method410((byte) 46), -2, (byte) 120, class307.field4211.field956[0], 0, var30.method410((byte) 57), var30.field956[0], var30.field944[0]);
                        }
                    }
                    if (~var4 == -45) {
                        class27.field437 = class361.field5073;
                        class225.field3025 = class349.field4879;
                        class204.field2764 = 2;
                        ++class405.field5886;
                        class369.field5234 = 0;
                        class442.field6400.method158((byte) 7, 59);
                        class442.field6400.method2416(arg1 + 22062, class449.field6509 + var2);
                        class442.field6400.method2404(class293.field4056[82] ? 1 : 0, (byte) -81);
                        class442.field6400.method2428(var3 - -class354.field4981, 122);
                        class442.field6400.method2438(48, class236.field3214);
                        class442.field6400.method2416(22064, var5);
                        class442.field6400.method2392(class339.field4745, -1565457376);
                        class135.method938(var2, (byte) 87, var3);
                    }
                    if (~var4 == -36) {
                        class204.field2764 = 2;
                        class27.field437 = class361.field5073;
                        class225.field3025 = class349.field4879;
                        ++class401.field5854;
                        class369.field5234 = 0;
                        class442.field6400.method158((byte) 7, 163);
                        class442.field6400.method2430(class29.field458, arg1 + -80);
                        class442.field6400.method2428(class301.field4170, -50);
                        class442.field6400.method2396(class293.field4056[82] ? 1 : 0, 12450);
                        class442.field6400.method2386(class55.field805, 19324);
                        class442.field6400.method2416(arg1 + 22062, class449.field6509 + var2);
                        class442.field6400.method2430(var5, arg1 ^ 60);
                        class442.field6400.method2430(class354.field4981 + var3, 46);
                        class135.method938(var2, (byte) 111, var3);
                    }
                    if (~var4 == -15) {
                        class354 var31 = class12.field153[var5];
                        if (var31 != null) {
                            class27.field437 = class361.field5073;
                            class225.field3025 = class349.field4879;
                            ++class125.field1767;
                            class204.field2764 = 2;
                            class369.field5234 = 0;
                            class442.field6400.method158((byte) 7, 54);
                            class442.field6400.method2396(!class293.field4056[82] ? 0 : 1, 12450);
                            class442.field6400.method2430(var5, -126);
                            class386.method2522(class307.field4211.field944[0], 0, true, var31.method410((byte) 68), -2, (byte) 67, class307.field4211.field956[0], 0, var31.method410((byte) 75), var31.field956[0], var31.field944[0]);
                        }
                    }
                    if (~var4 == -39) {
                        class354 var32 = class12.field153[var5];
                        if (var32 != null) {
                            class369.field5234 = 0;
                            ++class376.field5364;
                            class27.field437 = class361.field5073;
                            class204.field2764 = 2;
                            class225.field3025 = class349.field4879;
                            class442.field6400.method158((byte) 7, 151);
                            class442.field6400.method2396(class293.field4056[82] ? 1 : 0, 12450);
                            class442.field6400.method2428(class29.field458, -126);
                            class442.field6400.method2438(108, var5);
                            class442.field6400.method2438(82, class301.field4170);
                            class442.field6400.method2377(class55.field805, arg1 ^ -1530088294);
                            class386.method2522(class307.field4211.field944[0], 0, true, var32.method410((byte) 106), -2, (byte) 97, class307.field4211.field956[0], 0, var32.method410((byte) 124), var32.field956[0], var32.field944[0]);
                        }
                    }
                    if (var4 == 10) {
                        class204.field2764 = 2;
                        class369.field5234 = 0;
                        ++class89.field1357;
                        class27.field437 = class361.field5073;
                        class225.field3025 = class349.field4879;
                        class442.field6400.method158((byte) 7, 173);
                        class442.field6400.method2438(arg1 ^ 110, class354.field4981 + var3);
                        class442.field6400.method2438(83, var5);
                        class442.field6400.method2384(class293.field4056[82] ? 1 : 0, true);
                        class442.field6400.method2416(22064, class449.field6509 + var2);
                        class135.method938(var2, (byte) 106, var3);
                    }
                    if (var4 == 33) {
                        class437 var33 = class445.field6422[var5];
                        if (var33 != null) {
                            class225.field3025 = class349.field4879;
                            ++class245.field3384;
                            class204.field2764 = 2;
                            class369.field5234 = 0;
                            class27.field437 = class361.field5073;
                            class442.field6400.method158((byte) 7, 140);
                            class442.field6400.method2430(var5, -93);
                            class442.field6400.method2384(class293.field4056[82] ? 1 : 0, true);
                            class386.method2522(class307.field4211.field944[0], 0, true, var33.method410((byte) 118), -2, (byte) 106, class307.field4211.field956[0], 0, var33.method410((byte) 96), var33.field956[0], var33.field944[0]);
                        }
                    }
                    if (var4 == 18) {
                        class354 var34 = class12.field153[var5];
                        if (var34 != null) {
                            class369.field5234 = 0;
                            class225.field3025 = class349.field4879;
                            ++class149.field2146;
                            class27.field437 = class361.field5073;
                            class204.field2764 = 2;
                            class442.field6400.method158((byte) 7, 249);
                            class442.field6400.method2428(class236.field3214, arg1 ^ -125);
                            class442.field6400.method2392(class339.field4745, -1565457376);
                            class442.field6400.method2430(var5, -101);
                            class442.field6400.method2393(!class293.field4056[82] ? 0 : 1, (byte) -117);
                            class386.method2522(class307.field4211.field944[0], 0, true, var34.method410((byte) 58), -2, (byte) -54, class307.field4211.field956[0], 0, var34.method410((byte) 62), var34.field956[0], var34.field944[0]);
                        }
                    }
                    if (var4 == 50) {
                        class437 var35 = class445.field6422[var5];
                        if (var35 != null) {
                            class369.field5234 = 0;
                            class225.field3025 = class349.field4879;
                            class27.field437 = class361.field5073;
                            class204.field2764 = 2;
                            ++class24.field333;
                            class442.field6400.method158((byte) 7, 154);
                            class442.field6400.method2404(class293.field4056[82] ? 1 : 0, (byte) -62);
                            class442.field6400.method2416(22064, var5);
                            class386.method2522(class307.field4211.field944[0], 0, true, var35.method410((byte) 107), -2, (byte) 94, class307.field4211.field956[0], 0, var35.method410((byte) 106), var35.field956[0], var35.field944[0]);
                        }
                    }
                    if (~var4 == -40) {
                        class315.method2008(0, false);
                    }
                    if (var4 == 37) {
                        class442.field6400.method158((byte) 7, 1);
                        ++class260.field3556;
                        class442.field6400.method2386(var3, arg1 + 19322);
                        class442.field6400.method2438(56, var5);
                        class442.field6400.method2428(var2, -22);
                        class437.field6273 = 0;
                        class15.field173 = class290.method1869((byte) 28, var3);
                        class14.field167 = var2;
                    }
                    if (~var4 == -9) {
                        class354 var36 = class12.field153[var5];
                        if (var36 != null) {
                            class27.field437 = class361.field5073;
                            class225.field3025 = class349.field4879;
                            class369.field5234 = 0;
                            ++class143.field2067;
                            class204.field2764 = 2;
                            class442.field6400.method158((byte) 7, 129);
                            class442.field6400.method2404(!class293.field4056[82] ? 0 : 1, (byte) 19);
                            class442.field6400.method2438(108, var5);
                            class386.method2522(class307.field4211.field944[0], 0, true, var36.method410((byte) 40), -2, (byte) 76, class307.field4211.field956[0], 0, var36.method410((byte) 37), var36.field956[0], var36.field944[0]);
                        }
                    }
                    if (~var4 == -1007) {
                        class225.field3025 = class349.field4879;
                        class369.field5234 = 0;
                        ++class124.field1741;
                        class27.field437 = class361.field5073;
                        class204.field2764 = 2;
                        class442.field6400.method158((byte) 7, 100);
                        class442.field6400.method2416(arg1 + 22062, var2 - -class449.field6509);
                        class442.field6400.method2384(class293.field4056[82] ? 1 : 0, true);
                        class442.field6400.method2428(Integer.MAX_VALUE & (int) (var6 >>> 32), 118);
                        class442.field6400.method2430(class354.field4981 + var3, arg1 ^ -119);
                        class191.method1268(var6, var2, var3, -74);
                    }
                    if (~var4 == -10) {
                        ++class448.field6480;
                        class442.field6400.method158((byte) 7, 226);
                        class442.field6400.method2386(var3, 19324);
                        class442.field6400.method2438(arg1 + 68, var2);
                        class442.field6400.method2428(var5, 120);
                        class437.field6273 = 0;
                        class15.field173 = class290.method1869((byte) 127, var3);
                        class14.field167 = var2;
                    }
                    if (class222.field2980 != 0) {
                        class222.field2980 = 0;
                        class86.method596(arg1 + 14457, class290.method1869((byte) 90, class55.field805));
                    }
                    if (class309.field4235) {
                        class378.method2471(69);
                    }
                    if (class15.field173 != null && ~class437.field6273 == -1) {
                        class86.method596(arg1 ^ 14457, class15.field173);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Laa;B)V", line = 1267)
    public final void method133(class281 arg0, byte arg1) {
        this.field261.method2753(arg0, arg1 ^ 7634);
        ++field265;
        if (arg1 != -102) {
            field273 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Laa;IB)Lhc;", line = 1279)
    public final class75 method134(class281 arg0, int arg1, byte arg2) {
        if (arg2 > -25) {
            this.method123((byte) 35);
        }
        ++field270;
        return this.field261.method2747(arg0, 0, 0, false, false, arg1, true);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V", line = 1291)
    public final void method135(byte arg0) {
        ++field266;
        if (arg0 != -123) {
            method132((class207) null, 102);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILaa;)Z", line = 1302)
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field251;
        class75 var5 = this.field261.method2747(arg3, super.field3488, super.field3481, false, false, 65536, true);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method134((class281) null, 104, (byte) -44);
            }
            class261 var6 = arg3.method1769();
            var6.method882(super.field3481, super.field3490, super.field3488);
            return var5.method516(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Z", line = 1330)
    public final boolean method137(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field268;
            return false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 1348)
    public final void method138(int arg0) {
        ++field256;
        if (arg0 != -4728) {
            this.method124(97);
        }
    }
}
