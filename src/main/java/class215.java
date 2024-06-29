import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class215 extends class187 {

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
    public static int[] field3394 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field3403 = 0;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "B")
    public byte field3405;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "Ljava/lang/String;")
    public String field3406;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Ljava/lang/String;")
    public String field3408;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lwf;ILwf;Z)V", line = 6)
    public static final void method1434(class306 arg0, int arg1, class306 arg2, boolean arg3) {
        class19.field266 = arg2;
        field3393++;
        class174.field2658 = arg0;
        if (arg1 <= -41) {
            class44.field622 = arg3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 19)
    public static void method1435(byte arg0) {
        if (arg0 == -29) {
            field3394 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)V", line = 29)
    public static final void method1436(byte arg0, int arg1) {
        field3407++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class76.field1135[arg1];
        int var3 = class194.field2925[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var4 = (int) class271.field4161[arg1];
        long var5 = class271.field4161[arg1];
        int var7 = class167.field2560[arg1];
        if (var3 == 12) {
            class175.method1189(-1);
            class207 var8 = class78.method547(var2, 100);
            class81.field1199 = 1;
            class39.field571 = var4;
            class203.field3061 = var7;
            class83.field1259 = var2;
            class277.method1822(4096, var8);
            class86.field1299 = "<col=ff9040>" + class160.method1106(var4, 43).field4468 + "<col=ffffff>";
            if (class86.field1299 == null) {
                class86.field1299 = "null";
            }
            return;
        }
        if (var3 == 23) {
            class82 var9 = class64.field966[var4];
            if (var9 != null) {
                class329.field5084 = 2;
                class206.field3114++;
                class213.field3366 = class7.field81;
                class109.field1691 = 0;
                class160.field2486 = class85.field1295;
                class265.field4095.method2064(255, 7);
                class265.field4095.method2031((byte) 106, class294.field4534[82] ? 1 : 0);
                class265.field4095.method1997(var4, 25311);
            }
        }
        if (var3 == 60) {
            class80 var10 = class208.field3313[var4];
            if (var10 != null) {
                class338.field5225++;
                class109.field1691 = 0;
                class160.field2486 = class85.field1295;
                class329.field5084 = 2;
                class213.field3366 = class7.field81;
                class265.field4095.method2064(255, 119);
                class265.field4095.method2034(-52, class294.field4534[82] ? 1 : 0);
                class265.field4095.method2055(var4, 1);
                class265.field4095.method2013(class197.field2954, -99);
                class265.field4095.method1997(class253.field3934, 25311);
            }
        }
        if (var3 == 14) {
            class160.field2486 = class85.field1295;
            class40.field583++;
            class109.field1691 = 0;
            class213.field3366 = class7.field81;
            class329.field5084 = 2;
            class265.field4095.method2064(255, 216);
            class265.field4095.method2044(1247686728, class30.field374 + var7);
            class265.field4095.method2007(false, var2 + class294.field4535);
            class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
            class265.field4095.method2055(var4, 1);
        }
        if (var3 == 37) {
            if (var4 == 0) {
                class152.method1067(class77.field1154, var7, var2);
            } else if (var4 == 1) {
                if (field3399 > 0 && class294.field4534[82] && class294.field4534[81]) {
                    class97.method669(false, class30.field374 + var7, class294.field4535 + var2, class77.field1154);
                } else {
                    class307.method2113(-5, var2, var7, 1);
                    class265.field4095.method2034(-79, class64.field970);
                    class265.field4095.method2034(-83, class269.field4154);
                    class265.field4095.method2044(1247686728, (int) class123.field1922);
                    class265.field4095.method2034(-106, 57);
                    class265.field4095.method2034(-69, class138.field2133);
                    class265.field4095.method2034(-17, class14.field148);
                    class265.field4095.method2034(-65, 89);
                    class265.field4095.method2044(1247686728, class79.field1173.field537);
                    class265.field4095.method2044(1247686728, class79.field1173.field519);
                    class265.field4095.method2034(-125, class98.field1527);
                    class265.field4095.method2034(-12, 63);
                }
            }
        }
        if (var3 == 43) {
            class82 var11 = class64.field966[var4];
            if (var11 != null) {
                class219.field3486++;
                class329.field5084 = 2;
                class213.field3366 = class7.field81;
                class109.field1691 = 0;
                class160.field2486 = class85.field1295;
                class265.field4095.method2064(255, 156);
                class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
                class265.field4095.method1997(var4, 25311);
            }
        }
        if (var3 == 6) {
            class329.field5084 = 2;
            class213.field3366 = class7.field81;
            class109.field1691 = 0;
            class171.field2601++;
            class160.field2486 = class85.field1295;
            class265.field4095.method2064(255, 213);
            class265.field4095.method2006((byte) -126, class294.field4534[82] ? 1 : 0);
            class265.field4095.method2055(class294.field4535 + var2, 1);
            class265.field4095.method2044(1247686728, var7 + class30.field374);
            class265.field4095.method2007(false, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var3 == 59) {
            class80 var12 = class208.field3313[var4];
            if (var12 != null) {
                class87.field1316++;
                class109.field1691 = 0;
                class160.field2486 = class85.field1295;
                class213.field3366 = class7.field81;
                class329.field5084 = 2;
                class265.field4095.method2064(255, 233);
                class265.field4095.method1997(class39.field571, 25311);
                class265.field4095.method1997(class203.field3061, 25311);
                class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
                class265.field4095.method2058(class83.field1259, -21049);
                class265.field4095.method2007(false, var4);
            }
        }
        if (var3 == 46) {
            class59.field836++;
            class109.field1691 = 0;
            class329.field5084 = 2;
            class213.field3366 = class7.field81;
            class160.field2486 = class85.field1295;
            class265.field4095.method2064(255, 130);
            class265.field4095.method2044(1247686728, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class265.field4095.method2034(-40, class294.field4534[82] ? 1 : 0);
            class265.field4095.method2044(1247686728, var2 + class294.field4535);
            class265.field4095.method1997(var7 + class30.field374, 25311);
        }
        if (var3 == 16) {
            class213.field3366 = class7.field81;
            class160.field2486 = class85.field1295;
            class338.field5227++;
            class109.field1691 = 0;
            class329.field5084 = 2;
            class265.field4095.method2064(255, 31);
            class265.field4095.method2007(false, class39.field571);
            class265.field4095.method1997(var4, 25311);
            class265.field4095.method2012(113, class83.field1259);
            class265.field4095.method2055(var2 + class294.field4535, 1);
            class265.field4095.method1997(class30.field374 + var7, 25311);
            class265.field4095.method2006((byte) -126, class294.field4534[82] ? 1 : 0);
            class265.field4095.method1997(class203.field3061, 25311);
        }
        if (var3 == 4) {
            class160.field2486 = class85.field1295;
            class109.field1691 = 0;
            class213.field3366 = class7.field81;
            class105.field1620++;
            class329.field5084 = 2;
            class265.field4095.method2064(255, 29);
            class265.field4095.method2031((byte) 106, class294.field4534[82] ? 1 : 0);
            class265.field4095.method1997(class30.field374 + var7, 25311);
            class265.field4095.method2055(class253.field3934, 1);
            class265.field4095.method2058(class197.field2954, -21049);
            class265.field4095.method2007(false, class294.field4535 + var2);
            class265.field4095.method2055(var4, 1);
        }
        int var13 = -14 % ((-arg0 - 61) / 57);
        if (var3 == 1003) {
            class107.field1639++;
            class160.field2486 = class85.field1295;
            class329.field5084 = 2;
            class213.field3366 = class7.field81;
            class109.field1691 = 0;
            class265.field4095.method2064(255, 12);
            class265.field4095.method2006((byte) -21, class294.field4534[82] ? 1 : 0);
            class265.field4095.method1997(class30.field374 + var7, 25311);
            class265.field4095.method2044(1247686728, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class265.field4095.method2044(1247686728, class294.field4535 + var2);
        }
        if (var3 == 34) {
            class80 var14 = class208.field3313[var4];
            if (var14 != null) {
                class329.field5084 = 2;
                class61.field854++;
                class109.field1691 = 0;
                class213.field3366 = class7.field81;
                class160.field2486 = class85.field1295;
                class265.field4095.method2064(255, 239);
                class265.field4095.method1997(var4, 25311);
                class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
            }
        }
        if (var3 == 10 && class108.field1674 == null) {
            class222.method1492((byte) 23, var2, var7);
            class108.field1674 = class276.method1812(true, var2, var7);
            class277.method1822(4096, class108.field1674);
        }
        if (var3 == 35) {
            class82 var15 = class64.field966[var4];
            if (var15 != null) {
                class329.field5084 = 2;
                class304.field4752++;
                class109.field1691 = 0;
                class160.field2486 = class85.field1295;
                class213.field3366 = class7.field81;
                class265.field4095.method2064(255, 180);
                class265.field4095.method2055(var4, 1);
                class265.field4095.method2006((byte) -127, class294.field4534[82] ? 1 : 0);
            }
        }
        if (var3 == 31) {
            class265.field4095.method2064(255, 167);
            class79.field1169++;
            class265.field4095.method2007(false, class253.field3934);
            class265.field4095.method2007(false, var4);
            class265.field4095.method1997(var7, 25311);
            class265.field4095.method2013(var2, -99);
            class265.field4095.method2012(99, class197.field2954);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 120);
            class200.field3004 = var7;
        }
        if (var3 == 3) {
            class82 var16 = class64.field966[var4];
            if (var16 != null) {
                class213.field3366 = class7.field81;
                class109.field1691 = 0;
                class64.field976++;
                class160.field2486 = class85.field1295;
                class329.field5084 = 2;
                class265.field4095.method2064(255, 164);
                class265.field4095.method2031((byte) 106, class294.field4534[82] ? 1 : 0);
                class265.field4095.method2007(false, var4);
            }
        }
        if (var3 == 24) {
            class4.field52++;
            class329.field5084 = 2;
            class109.field1691 = 0;
            class213.field3366 = class7.field81;
            class160.field2486 = class85.field1295;
            class265.field4095.method2064(255, 208);
            class265.field4095.method2058(class83.field1259, -21049);
            class265.field4095.method1997(class203.field3061, 25311);
            class265.field4095.method2055((int) (var5 >>> 32) & Integer.MAX_VALUE, 1);
            class265.field4095.method1997(class39.field571, 25311);
            class265.field4095.method2031((byte) 106, class294.field4534[82] ? 1 : 0);
            class265.field4095.method2044(1247686728, class294.field4535 + var2);
            class265.field4095.method1997(var7 + class30.field374, 25311);
        }
        if (var3 == 29) {
            class265.field4095.method2064(255, 81);
            class265.field4095.method2008(var2, (byte) 127);
            class190.field2889++;
            class265.field4095.method1997(var7, 25311);
            class265.field4095.method1997(var4, 25311);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 116);
            class200.field3004 = var7;
        }
        if (var3 == 33) {
            class160.field2486 = class85.field1295;
            class109.field1691 = 0;
            class345.field5352++;
            class213.field3366 = class7.field81;
            class329.field5084 = 2;
            class265.field4095.method2064(255, 250);
            class265.field4095.method1997(var4, 25311);
            class265.field4095.method2006((byte) 18, class294.field4534[82] ? 1 : 0);
            class265.field4095.method1997(class294.field4535 + var2, 25311);
            class265.field4095.method1997(class30.field374 + var7, 25311);
        }
        if (var3 == 57) {
            class109.field1691 = 0;
            class213.field3366 = class7.field81;
            class160.field2486 = class85.field1295;
            class329.field5084 = 2;
            class265.field4095.method2064(255, 159);
            class265.field4095.method2006((byte) -126, class294.field4534[82] ? 1 : 0);
            class248.field3902++;
            class265.field4095.method2044(1247686728, var4);
            class265.field4095.method2044(1247686728, class294.field4535 + var2);
            class265.field4095.method2055(class30.field374 + var7, 1);
        }
        if (var3 == 11) {
            boolean var17 = true;
            class207 var18 = class78.method547(var2, 115);
            if (var18.field3149 > 0) {
                var17 = class317.method2157(var18, 0);
            }
            if (var17) {
                class133.field2093++;
                class265.field4095.method2064(255, 196);
                class265.field4095.method2013(var2, -113);
            }
        }
        if (var3 == 49) {
            class29.field366++;
            class160.field2486 = class85.field1295;
            class213.field3366 = class7.field81;
            class329.field5084 = 2;
            class109.field1691 = 0;
            class265.field4095.method2064(255, 53);
            class265.field4095.method2034(-4, class294.field4534[82] ? 1 : 0);
            class265.field4095.method2058(class197.field2954, -21049);
            class265.field4095.method2055(class253.field3934, 1);
            class265.field4095.method2055(Integer.MAX_VALUE & (int) (var5 >>> 32), 1);
            class265.field4095.method2044(1247686728, class294.field4535 + var2);
            class265.field4095.method2055(var7 + class30.field374, 1);
        }
        if (var3 == 48) {
            class115.method791(128);
        }
        if (var3 == 41) {
            class80 var19 = class208.field3313[var4];
            if (var19 != null) {
                class88.field1337++;
                class160.field2486 = class85.field1295;
                class329.field5084 = 2;
                class213.field3366 = class7.field81;
                class109.field1691 = 0;
                class265.field4095.method2064(255, 115);
                class265.field4095.method2055(var4, 1);
                class265.field4095.method2031((byte) 106, class294.field4534[82] ? 1 : 0);
            }
        }
        if (var3 == 15) {
            class106.field1627++;
            class265.field4095.method2064(255, 116);
            class265.field4095.method2007(false, var7);
            class265.field4095.method2012(115, var2);
            class265.field4095.method1997(var4, 25311);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 102);
            class200.field3004 = var7;
        }
        if (var3 == 30) {
            class329.field5084 = 2;
            class109.field1691 = 0;
            class160.field2486 = class85.field1295;
            class270.field4158++;
            class213.field3366 = class7.field81;
            class265.field4095.method2064(255, 226);
            class265.field4095.method1997(var4, 25311);
            class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
            class265.field4095.method1997(class294.field4535 + var2, 25311);
            class265.field4095.method1997(class30.field374 + var7, 25311);
        }
        if (var3 == 17) {
            class265.field4095.method2064(255, 196);
            class265.field4095.method2013(var2, -104);
            class133.field2093++;
            class207 var20 = class78.method547(var2, 113);
            if (var20.field3222 != null && var20.field3222[0][0] == 5) {
                int var21 = var20.field3222[0][1];
                if (class156.field2442[var21] != var20.field3255[0]) {
                    class156.field2442[var21] = var20.field3255[0];
                    class150.method1057(var21, -10);
                }
            }
        }
        if (var3 == 40) {
            class207 var36 = class276.method1812(true, var2, var7);
            if (var36 != null) {
                class175.method1189(-1);
                class108 var37 = client.method888(var36);
                class278.method1830(var7, var36.field3148, 16925, var2, var37.field1661, var36.field3140, var37.method733(-162680420));
                class81.field1199 = 0;
                class227.field3638 = class71.method510(var36, -52);
                if (class227.field3638 == null) {
                    class227.field3638 = "Null";
                }
                if (var36.field3267) {
                    class302.field4663 = var36.field3124 + "<col=ffffff>";
                } else {
                    class302.field4663 = "<col=00ff00>" + var36.field3136 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var3 == 36) {
            class80 var22 = class208.field3313[var4];
            if (var22 != null) {
                class109.field1691 = 0;
                class213.field3366 = class7.field81;
                class307.field4834++;
                class160.field2486 = class85.field1295;
                class329.field5084 = 2;
                class265.field4095.method2064(255, 0);
                class265.field4095.method2044(1247686728, var4);
                class265.field4095.method2006((byte) -126, class294.field4534[82] ? 1 : 0);
            }
        }
        if (var3 == 1005) {
            class207 var23 = class78.method547(var2, 109);
            if (var23 == null || var23.field3227[var7] < 100000) {
                class265.field4095.method2064(255, 249);
                class265.field4095.method1997(var4, 25311);
                class23.field298++;
            } else {
                class343.method2390(var23.field3227[var7] + " x " + class160.method1106(var4, 22).field4468, 0, false, "");
            }
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 116);
            class200.field3004 = var7;
        }
        if (var3 == 51) {
            class213.field3366 = class7.field81;
            class52.field735++;
            class109.field1691 = 0;
            class329.field5084 = 2;
            class160.field2486 = class85.field1295;
            class265.field4095.method2064(255, 154);
            class265.field4095.method2034(-31, class294.field4534[82] ? 1 : 0);
            class265.field4095.method2055(class30.field374 + var7, 1);
            class265.field4095.method2055((int) (var5 >>> 32) & Integer.MAX_VALUE, 1);
            class265.field4095.method1997(class294.field4535 + var2, 25311);
        }
        if (var3 == 9) {
            class82 var24 = class64.field966[var4];
            if (var24 != null) {
                class160.field2486 = class85.field1295;
                class109.field1691 = 0;
                class213.field3366 = class7.field81;
                class310.field4900++;
                class329.field5084 = 2;
                class265.field4095.method2064(255, 232);
                class265.field4095.method1997(var4, 25311);
                class265.field4095.method2058(class197.field2954, -21049);
                class265.field4095.method2055(class253.field3934, 1);
                class265.field4095.method2034(-83, class294.field4534[82] ? 1 : 0);
            }
        }
        if (var3 == 45) {
            class265.field4095.method2064(255, 251);
            class265.field4095.method2044(1247686728, var4);
            class270.field4156++;
            class265.field4095.method1997(var7, 25311);
            class265.field4095.method1997(class203.field3061, 25311);
            class265.field4095.method2044(1247686728, class39.field571);
            class265.field4095.method2013(var2, -127);
            class265.field4095.method2013(class83.field1259, -128);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 127);
            class200.field3004 = var7;
        }
        if (var3 == 1006) {
            class329.field5084 = 2;
            class303.field4702++;
            class160.field2486 = class85.field1295;
            class109.field1691 = 0;
            class213.field3366 = class7.field81;
            class265.field4095.method2064(255, 209);
            class265.field4095.method2055(var4, 1);
        }
        if (var3 == 13) {
            class82 var25 = class64.field966[var4];
            if (var25 != null) {
                class109.field1691 = 0;
                class213.field3366 = class7.field81;
                class329.field5084 = 2;
                class160.field2486 = class85.field1295;
                class210.field3335++;
                class265.field4095.method2064(255, 205);
                class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
                class265.field4095.method2044(1247686728, var4);
            }
        }
        if (var3 == 39) {
            if (var4 == 0) {
                class106.field1631 = 1;
                class152.method1067(class77.field1154, var7, var2);
            } else if (var4 == 1) {
                class265.field4095.method2064(255, 79);
                class113.field1729++;
                class265.field4095.method2055(class253.field3934, 1);
                class265.field4095.method2044(1247686728, class30.field374 + var7);
                class265.field4095.method2044(1247686728, class294.field4535 + var2);
                class265.field4095.method2058(class197.field2954, -21049);
            }
        }
        if (var3 == 47) {
            class133.field2093++;
            class265.field4095.method2064(255, 196);
            class265.field4095.method2013(var2, -99);
            class207 var26 = class78.method547(var2, 101);
            if (var26.field3222 != null && var26.field3222[0][0] == 5) {
                int var27 = var26.field3222[0][1];
                class156.field2442[var27] = 1 - class156.field2442[var27];
                class150.method1057(var27, -10);
            }
        }
        if (var3 == 44) {
            class82 var28 = class64.field966[var4];
            if (var28 != null) {
                class109.field1691 = 0;
                class221.field3515++;
                class329.field5084 = 2;
                class213.field3366 = class7.field81;
                class160.field2486 = class85.field1295;
                class265.field4095.method2064(255, 37);
                class265.field4095.method2013(class83.field1259, -89);
                class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
                class265.field4095.method2007(false, var4);
                class265.field4095.method1997(class203.field3061, 25311);
                class265.field4095.method1997(class39.field571, 25311);
            }
        }
        if (var3 == 1002) {
            class213.field3366 = class7.field81;
            class160.field2486 = class85.field1295;
            class329.field5084 = 2;
            class23.field298++;
            class109.field1691 = 0;
            class265.field4095.method2064(255, 249);
            class265.field4095.method1997(var4, 25311);
        }
        if (var3 == 19) {
            class264.field4065++;
            class265.field4095.method2064(255, 43);
            class265.field4095.method2007(false, var4);
            class265.field4095.method2044(1247686728, var7);
            class265.field4095.method2012(103, var2);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 123);
            class200.field3004 = var7;
        }
        if (var3 == 8) {
            class265.field4095.method2064(255, 4);
            class33.field423++;
            class265.field4095.method2055(var7, 1);
            class265.field4095.method2044(1247686728, var4);
            class265.field4095.method2012(117, var2);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 124);
            class200.field3004 = var7;
        }
        if (var3 == 25) {
            class160.field2492++;
            class213.field3366 = class7.field81;
            class329.field5084 = 2;
            class160.field2486 = class85.field1295;
            class109.field1691 = 0;
            class265.field4095.method2064(255, 90);
            class265.field4095.method2044(1247686728, var4);
            class265.field4095.method2007(false, var2 + class294.field4535);
            class265.field4095.method1997(class30.field374 + var7, 25311);
            class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
        }
        if (var3 == 42) {
            class80 var29 = class208.field3313[var4];
            if (var29 != null) {
                class213.field3366 = class7.field81;
                class109.field1691 = 0;
                class160.field2486 = class85.field1295;
                class329.field5084 = 2;
                class97.field1493++;
                class265.field4095.method2064(255, 39);
                class265.field4095.method2034(-48, class294.field4534[82] ? 1 : 0);
                class265.field4095.method1997(var4, 25311);
            }
        }
        if (var3 == 58) {
            class125.field1957++;
            class265.field4095.method2064(255, 5);
            class265.field4095.method2044(1247686728, var7);
            class265.field4095.method1997(var4, 25311);
            class265.field4095.method2012(114, var2);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 105);
            class200.field3004 = var7;
        }
        if (var3 == 18) {
            class157.field2459++;
            class265.field4095.method2064(255, 231);
            class265.field4095.method2008(var2, (byte) 125);
            class265.field4095.method2007(false, var7);
            class265.field4095.method1997(var4, 25311);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 105);
            class200.field3004 = var7;
        }
        if (var3 == 21) {
            class329.field5084 = 2;
            class160.field2486 = class85.field1295;
            class29.field361++;
            class109.field1691 = 0;
            class213.field3366 = class7.field81;
            class265.field4095.method2064(255, 187);
            class265.field4095.method2007(false, class294.field4535 + var2);
            class265.field4095.method1997(class30.field374 + var7, 25311);
            class265.field4095.method2044(1247686728, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class265.field4095.method2034(-9, class294.field4534[82] ? 1 : 0);
        }
        if (var3 == 22) {
            class82 var30 = class64.field966[var4];
            if (var30 != null) {
                class329.field5084 = 2;
                class4.field50++;
                class160.field2486 = class85.field1295;
                class213.field3366 = class7.field81;
                class109.field1691 = 0;
                class265.field4095.method2064(255, 89);
                class265.field4095.method2031((byte) 106, class294.field4534[82] ? 1 : 0);
                class265.field4095.method1997(var4, 25311);
            }
        }
        if (var3 == 50) {
            class82 var31 = class64.field966[var4];
            if (var31 != null) {
                class109.field1691 = 0;
                class24.field302++;
                class160.field2486 = class85.field1295;
                class329.field5084 = 2;
                class213.field3366 = class7.field81;
                class265.field4095.method2064(255, 102);
                class265.field4095.method2006((byte) -121, class294.field4534[82] ? 1 : 0);
                class265.field4095.method2055(var4, 1);
            }
        }
        if (var3 == 38) {
            if (var4 == 0) {
                class56.field790 = 1;
                class152.method1067(class77.field1154, var7, var2);
            } else if (field3399 > 0 && class294.field4534[82] && class294.field4534[81]) {
                class97.method669(false, class30.field374 + var7, class294.field4535 + var2, class77.field1154);
            } else {
                class297.field4550++;
                class265.field4095.method2064(255, 136);
                class265.field4095.method2007(false, class30.field374 + var7);
                class265.field4095.method2044(1247686728, class294.field4535 + var2);
            }
        }
        if (var3 == 7 || var3 == 1001) {
            class96.method659(var7, var4, class76.field1144[arg1], var2, 114);
        }
        if (var3 == 1) {
            class30.field372++;
            class265.field4095.method2064(255, 161);
            class265.field4095.method2013(var2, -70);
            class265.field4095.method2007(false, var7);
            class265.field4095.method1997(class253.field3934, 25311);
            class265.field4095.method2058(class197.field2954, -21049);
        }
        if (var3 == 1004) {
            class160.field2486 = class85.field1295;
            class213.field3366 = class7.field81;
            class329.field5084 = 2;
            class109.field1691 = 0;
            class80 var32 = class208.field3313[var4];
            if (var32 != null) {
                class298 var33 = var32.field1178;
                if (var33.field4588 != null) {
                    var33 = var33.method1956(119);
                }
                if (var33 != null) {
                    class265.field4095.method2064(255, 19);
                    class265.field4095.method2044(1247686728, var33.field4606);
                    class13.field132++;
                }
            }
        }
        if (var3 == 2) {
            class265.field4095.method2064(255, 190);
            class283.field4353++;
            class265.field4095.method2044(1247686728, var4);
            class265.field4095.method2007(false, var7);
            class265.field4095.method2058(var2, -21049);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 117);
            class200.field3004 = var7;
        }
        if (var3 == 32) {
            class82 var34 = class64.field966[var4];
            if (var34 != null) {
                class213.field3366 = class7.field81;
                class109.field1691 = 0;
                class329.field5084 = 2;
                class160.field2486 = class85.field1295;
                class265.field4095.method2064(255, 76);
                class142.field2249++;
                class265.field4095.method2044(1247686728, var4);
                class265.field4095.method2018(class294.field4534[82] ? 1 : 0, 128);
            }
        }
        if (var3 == 26) {
            class265.field4095.method2064(255, 33);
            class265.field4095.method2007(false, var7);
            class227.field3640++;
            class265.field4095.method2007(false, var4);
            class265.field4095.method2008(var2, (byte) 126);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 124);
            class200.field3004 = var7;
        }
        if (var3 == 28) {
            class80 var35 = class208.field3313[var4];
            if (var35 != null) {
                class109.field1691 = 0;
                class160.field2486 = class85.field1295;
                class277.field4280++;
                class329.field5084 = 2;
                class213.field3366 = class7.field81;
                class265.field4095.method2064(255, 146);
                class265.field4095.method2044(1247686728, var4);
                class265.field4095.method2006((byte) 37, class294.field4534[82] ? 1 : 0);
            }
        }
        if (var3 == 20) {
            class284.field4355++;
            class265.field4095.method2064(255, 9);
            class265.field4095.method2007(false, var7);
            class265.field4095.method1997(var4, 25311);
            class265.field4095.method2058(var2, -21049);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 123);
            class200.field3004 = var7;
        }
        if (var3 == 5) {
            class52.field732++;
            class265.field4095.method2064(255, 103);
            class265.field4095.method2055(var4, 1);
            class265.field4095.method2055(var7, 1);
            class265.field4095.method2013(var2, -67);
            class275.field4225 = 0;
            class237.field3803 = class78.method547(var2, 106);
            class200.field3004 = var7;
        }
        if (class81.field1199 != 0) {
            class81.field1199 = 0;
            class277.method1822(4096, class78.method547(class83.field1259, 113));
        }
        if (class120.field1841) {
            class175.method1189(-1);
        }
        if (class237.field3803 != null && class275.field4225 == 0) {
            class277.method1822(4096, class237.field3803);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIIII)V", line = 1074)
    public static final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3396++;
        class75 var5 = class204.method1371(10, 7, arg4);
        var5.method524((byte) 57);
        var5.field1117 = arg0;
        if (arg2 != 0) {
            method1440(-69, -66, 117, 74, 36, -46, -14, 1, (byte) 124);
        }
        var5.field1124 = arg1;
        var5.field1122 = arg3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILfe;Lfe;IIJ)V", line = 1089)
    public static final void method1438(int arg0, int arg1, int arg2, int arg3, class94 arg4, class94 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class157 var10 = new class157();
        var10.field2457 = arg8;
        var10.field2452 = arg1 * 128 + 64;
        var10.field2458 = arg2 * 128 + 64;
        var10.field2456 = arg3;
        var10.field2454 = arg4;
        var10.field2451 = arg5;
        var10.field2453 = arg6;
        var10.field2455 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class90.field1375[var11][arg1][arg2] == null) {
                class90.field1375[var11][arg1][arg2] = new class174(var11, arg1, arg2);
            }
        }
        class90.field1375[arg0][arg1][arg2].field2672 = var10;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lwe;ILjava/awt/Component;II)Lbn;", line = 1117)
    public static final class177 method1439(class224 arg0, int arg1, Component arg2, int arg3, int arg4) {
        field3404++;
        if (class282.field4337 == 0) {
            throw new IllegalStateException();
        } else if (arg1 <= arg4 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class177 var5 = (class177) Class.forName("rf").getDeclaredConstructor().newInstance();
                var5.field2729 = arg3;
                var5.field2707 = new int[(class162.field2508 ? 2 : 1) * 256];
                var5.method1055(arg2);
                var5.field2726 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field2726 > 16384) {
                    var5.field2726 = 16384;
                }
                var5.method1054(var5.field2726);
                if (class278.field4290 > 0 && class64.field971 == null) {
                    class64.field971 = new class125();
                    class64.field971.field1953 = arg0;
                    arg0.method1515(class278.field4290, (byte) -5, class64.field971);
                }
                if (class64.field971 != null) {
                    if (class64.field971.field1955[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class64.field971.field1955[arg4] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class344 var7 = new class344(arg0, arg4);
                    var7.field2707 = new int[(class162.field2508 ? 2 : 1) * 256];
                    var7.field2729 = arg3;
                    var7.method1055(arg2);
                    var7.field2726 = 16384;
                    var7.method1054(var7.field2726);
                    if (class278.field4290 > 0 && class64.field971 == null) {
                        class64.field971 = new class125();
                        class64.field971.field1953 = arg0;
                        arg0.method1515(class278.field4290, (byte) -5, class64.field971);
                    }
                    if (class64.field971 != null) {
                        if (class64.field971.field1955[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class64.field971.field1955[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class177();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIB)V", line = 1195)
    public static final void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 >= -76) {
            return;
        }
        field3397++;
        int var9 = arg4 - arg5;
        int var10 = (arg2 - arg0 << 16) / var9;
        int var11 = arg1 - arg6;
        int var12 = (arg7 - arg3 << 16) / var11;
        class7.method42(arg3, var12, var10, (byte) -66, arg1, 0, arg5, arg6, arg4, 0, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIII[B)I", line = 1215)
    public static final int method1441(String arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field3395++;
        if (arg2 < 112) {
            return 104;
        }
        int var6 = arg4 - arg3;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg1 + var7] = -97;
            } else {
                arg5[arg1 + var7] = 63;
            }
        }
        return var6;
    }
}
