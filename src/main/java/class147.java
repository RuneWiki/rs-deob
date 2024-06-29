import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class147 extends class60 {

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    private int field2415;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    private int field2421;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    private int field2404;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    private int field2398;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    private int field2402;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field2399 = 0;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2419 = "Take";

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "Lgd;")
    public static class325 field2416 = new class325(200);

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "Lpk;")
    public static class120 field2407;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "Lpk;")
    public static class120 field2408;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V", line = 12)
    public static final void method1113(int arg0, int arg1, int arg2) {
        class32.field496 = class188.field2953 + class286.field4473 - (arg1 + 1);
        field2412++;
        if (arg0 < -54) {
            class339.field5234 = arg2 - class227.field3512;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBI)Z", line = 24)
    public final boolean method1114(int arg0, int arg1, byte arg2, int arg3) {
        field2405++;
        if (arg2 >= -42) {
            return false;
        } else {
            return this.field2402 == arg0 && arg1 >= this.field2410 && this.field2421 >= arg1 && this.field2415 <= arg3 && arg3 <= this.field2404;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lpk;I)I", line = 46)
    public static final int method1115(class120 arg0, int arg1) {
        field2409++;
        int var2 = 0;
        if (arg0.method939((byte) 101, class217.field3367)) {
            var2++;
        }
        if (arg0.method939((byte) 85, class218.field3413)) {
            var2++;
        }
        if (arg0.method939((byte) 69, class274.field4292)) {
            var2++;
        }
        if (arg0.method939((byte) 67, class213.field3329)) {
            var2++;
        }
        if (arg0.method939((byte) 95, class111.field1812)) {
            var2++;
        }
        if (arg0.method939((byte) 82, class299.field4786)) {
            var2++;
        }
        if (arg0.method939((byte) 63, class36.field533)) {
            var2++;
        }
        if (arg0.method939((byte) 79, class150.field2446)) {
            var2++;
        }
        if (arg0.method939((byte) 46, class86.field1376)) {
            var2++;
        }
        if (arg0.method939((byte) 55, class151.field2472)) {
            var2++;
        }
        if (arg0.method939((byte) 71, class133.field2114)) {
            var2++;
        }
        if (arg0.method939((byte) 90, class185.field2931)) {
            var2++;
        }
        if (arg1 <= 9) {
            field2419 = (String) null;
        }
        if (arg0.method939((byte) 55, class176.field2814)) {
            var2++;
        }
        if (arg0.method939((byte) 118, class229.field3523)) {
            var2++;
        }
        if (arg0.method939((byte) 102, class160.field2599)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)Z", line = 110)
    public static final boolean method1116(int arg0, int arg1, int arg2, int arg3) {
        if (class284.method1988(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class316.method2230(var4 + 1, class85.field1374[arg0][arg1][arg2] + arg3, var5 + 1) && class316.method2230(var4 + 128 - 1, class85.field1374[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class316.method2230(var4 + 128 - 1, class85.field1374[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class316.method2230(var4 + 1, class85.field1374[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)Z", line = 135)
    public final boolean method1117(int arg0, int arg1, int arg2) {
        if (arg0 != 51) {
            field2416 = (class325) null;
        }
        field2413++;
        return arg2 >= this.field2397 && this.field2411 >= arg2 && arg1 >= this.field2414 && arg1 <= this.field2406;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 150)
    public static void method1118(byte arg0) {
        if (arg0 != 107) {
            field2408 = (class120) null;
        }
        field2408 = null;
        field2416 = null;
        field2419 = null;
        field2407 = null;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(III)Z", line = 166)
    public final boolean method1119(int arg0, int arg1, int arg2) {
        field2418++;
        if (arg2 == 0) {
            return arg1 >= this.field2410 && this.field2421 >= arg1 && this.field2415 <= arg0 && arg0 <= this.field2404;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(III)[I", line = 181)
    public final int[] method1120(int arg0, int arg1, int arg2) {
        field2400++;
        return arg1 > -88 ? (int[]) null : new int[] { this.field2402, arg2 + this.field2410 - this.field2397, this.field2415 + arg0 + -this.field2414 };
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IIJS)V", line = 192)
    public static final void method1121(int arg0, String arg1, int arg2, String arg3, int arg4, int arg5, long arg6, short arg7) {
        field2396++;
        if (class260.field3858) {
            return;
        }
        if (class137.field2225 < 500) {
            class301.field4800[class137.field2225] = arg1;
            class285.field4441[class137.field2225] = arg3;
            class179.field2856[class137.field2225] = arg4 == -1 ? class220.field3430 : arg4;
            class120.field1960[class137.field2225] = arg7;
            class319.field5002[class137.field2225] = arg6;
            class304.field4847[class137.field2225] = arg0;
            class247.field3683[class137.field2225] = arg2;
            class137.field2225++;
        }
        int var9 = -117 / ((55 - arg5) / 59);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BII)[I", line = 219)
    public final int[] method1122(byte arg0, int arg1, int arg2) {
        field2401++;
        int var4 = -40 / ((75 - arg0) / 32);
        return new int[] { this.field2398, this.field2397 + arg2 - this.field2410, -this.field2415 + arg1 + this.field2414 };
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)V", line = 232)
    public static final void method1123(byte arg0, int arg1) {
        field2417++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class304.field4847[arg1];
        int var3 = class247.field3683[arg1];
        int var4 = class120.field1960[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class319.field5002[arg1];
        long var6 = class319.field5002[arg1];
        if (var4 == 8) {
            class209.field3305.method1808((byte) -74, 145);
            class209.field3305.method11(var3, 31932);
            class237.field3577++;
            class266 var8 = class171.method1276(var3, (byte) 35);
            if (var8.field3938 != null && var8.field3938[0][0] == 5) {
                int var9 = var8.field3938[0][1];
                if (class123.field1998[var9] != var8.field3957[0]) {
                    class123.field1998[var9] = var8.field3957[0];
                    class314.method2210(31845, var9);
                }
            }
        }
        if (var4 == 13) {
            class209.field3305.method1808((byte) -74, 164);
            class209.field3305.method14(-246866616, var2);
            class209.field3305.method52(var3, (byte) 115);
            class209.field3305.method44((byte) -74, var5);
            class171.field2750++;
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -120);
            class303.field4829 = var2;
        }
        if (var4 == 48) {
            class92 var10 = class74.field1140[var5];
            if (var10 != null) {
                class36.field538 = class170.field2740;
                class18.field349 = 0;
                class247.field3676++;
                class44.field697 = class243.field3639;
                class172.field2762 = 2;
                class209.field3305.method1808((byte) -74, 85);
                class209.field3305.method65(class48.field737[82] ? 1 : 0, 0);
                class209.field3305.method26(-70, var5);
            }
        }
        if (var4 == 11) {
            class86 var11 = class197.field3029[var5];
            if (var11 != null) {
                class18.field349 = 0;
                class305.field4855++;
                class44.field697 = class243.field3639;
                class172.field2762 = 2;
                class36.field538 = class170.field2740;
                class209.field3305.method1808((byte) -74, 6);
                class209.field3305.method26(-55, var5);
                class209.field3305.method21(-115, class48.field737[82] ? 1 : 0);
                class209.field3305.method7(-5628, class22.field392);
                class209.field3305.method47(class201.field3076, false);
            }
        }
        if (var4 == 24) {
            class266 var12 = class171.method1276(var3, (byte) -117);
            boolean var13 = true;
            if (var12.field4064 > 0) {
                var13 = class291.method2041(-89, var12);
            }
            if (var13) {
                class209.field3305.method1808((byte) -74, 145);
                class209.field3305.method11(var3, 31932);
                class237.field3577++;
            }
        }
        if (var4 == 49) {
            class86 var14 = class197.field3029[var5];
            if (var14 != null) {
                class44.field697 = class243.field3639;
                class36.field538 = class170.field2740;
                class128.field2058++;
                class18.field349 = 0;
                class172.field2762 = 2;
                class209.field3305.method1808((byte) -74, 82);
                class209.field3305.method14(-246866616, var5);
                class209.field3305.method21(-105, class48.field737[82] ? 1 : 0);
            }
        }
        if (var4 == 35) {
            class209.field3305.method1808((byte) -74, 121);
            class73.field1116++;
            class209.field3305.method47(var2, false);
            class209.field3305.method52(var3, (byte) 116);
            class209.field3305.method26(-50, var5);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -117);
            class303.field4829 = var2;
        }
        if (var4 == 58) {
            if (var5 == 0) {
                class226.field3505 = 1;
                class218.method1579(class75.field1153, var2, var3);
            } else if (var5 == 1) {
                class320.field5018++;
                class209.field3305.method1808((byte) -74, 229);
                class209.field3305.method26(-61, class117.field1902 + var2);
                class209.field3305.method11(class22.field392, 31932);
                class209.field3305.method44((byte) -47, class133.field2118 + var3);
                class209.field3305.method47(class201.field3076, false);
            }
        }
        if (var4 == 50) {
            class92 var15 = class74.field1140[var5];
            if (var15 != null) {
                class36.field538 = class170.field2740;
                class18.field349 = 0;
                class10.field225++;
                class44.field697 = class243.field3639;
                class172.field2762 = 2;
                class209.field3305.method1808((byte) -74, 103);
                class209.field3305.method47(var5, false);
                class209.field3305.method65(class48.field737[82] ? 1 : 0, 0);
            }
        }
        if (var4 == 33) {
            class209.field3305.method1808((byte) -74, 29);
            class5.field117++;
            class209.field3305.method26(-71, var2);
            class209.field3305.method10(var3, -119);
            class209.field3305.method47(var5, false);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -119);
            class303.field4829 = var2;
        }
        if (var4 == 47) {
            class92 var16 = class74.field1140[var5];
            if (var16 != null) {
                class66.field1008++;
                class18.field349 = 0;
                class44.field697 = class243.field3639;
                class172.field2762 = 2;
                class36.field538 = class170.field2740;
                class209.field3305.method1808((byte) -74, 172);
                class209.field3305.method26(-86, var5);
                class209.field3305.method49(-66, class48.field737[82] ? 1 : 0);
            }
        }
        if (var4 == 43) {
            class209.field3305.method1808((byte) -74, 201);
            class209.field3305.method52(var3, (byte) 117);
            class218.field3408++;
            class209.field3305.method47(var5, false);
            class209.field3305.method47(var2, false);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) 16);
            class303.field4829 = var2;
        }
        if (var4 == 29) {
            class209.field3305.method1808((byte) -74, 92);
            class209.field3305.method11(var3, 31932);
            class141.field2277++;
            class209.field3305.method14(-246866616, class296.field4755);
            class209.field3305.method26(-59, class333.field5191);
            class209.field3305.method10(class15.field311, -122);
            class209.field3305.method26(-95, var5);
            class209.field3305.method44((byte) 120, var2);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -124);
            class303.field4829 = var2;
        }
        if (var4 == 44) {
            class18.field349 = 0;
            class172.field2762 = 2;
            class36.field538 = class170.field2740;
            class184.field2916++;
            class44.field697 = class243.field3639;
            class209.field3305.method1808((byte) -74, 125);
            class209.field3305.method21(-108, class48.field737[82] ? 1 : 0);
            class209.field3305.method47(var3 + class133.field2118, false);
            class209.field3305.method47(class117.field1902 + var2, false);
            class209.field3305.method44((byte) -84, var5);
        }
        if (var4 == 15) {
            class209.field3305.method1808((byte) -74, 100);
            class209.field3305.method14(-246866616, var2);
            class209.field3305.method26(-121, var5);
            class100.field1597++;
            class209.field3305.method52(var3, (byte) 113);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -119);
            class303.field4829 = var2;
        }
        if (var4 == 42 || var4 == 1004) {
            class243.method1716(-63, var5, class285.field4441[arg1], var2, var3);
        }
        if (var4 == 21) {
            class259.field3847++;
            class36.field538 = class170.field2740;
            class18.field349 = 0;
            class44.field697 = class243.field3639;
            class172.field2762 = 2;
            class209.field3305.method1808((byte) -74, 9);
            class209.field3305.method65(class48.field737[82] ? 1 : 0, 0);
            class209.field3305.method44((byte) 95, var5);
            class209.field3305.method44((byte) 126, class117.field1902 + var2);
            class209.field3305.method26(-69, var3 + class133.field2118);
        }
        if (var4 == 1003) {
            class36.field538 = class170.field2740;
            class172.field2762 = 2;
            class44.field697 = class243.field3639;
            class18.field349 = 0;
            class86 var17 = class197.field3029[var5];
            if (var17 != null) {
                class84 var18 = var17.field1381;
                if (var18.field1339 != null) {
                    var18 = var18.method667(-50);
                }
                if (var18 != null) {
                    class146.field2365++;
                    class209.field3305.method1808((byte) -74, 136);
                    class209.field3305.method14(-246866616, var18.field1361);
                }
            }
        }
        if (var4 == 31) {
            if (var5 == 0) {
                class218.method1579(class75.field1153, var2, var3);
            } else if (var5 == 1) {
                if (class233.field3543 > 0 && class48.field737[82] && class48.field737[81]) {
                    class71.method571(class117.field1902 + var2, class75.field1153, class133.field2118 + var3, -101);
                } else {
                    class6.method103(var3, (byte) 36, var2, 1);
                    class209.field3305.method21(121, class28.field459);
                    class209.field3305.method21(-99, class260.field3871);
                    class209.field3305.method14(-246866616, (int) class171.field2747);
                    class209.field3305.method21(95, 57);
                    class209.field3305.method21(-115, class150.field2455);
                    class209.field3305.method21(77, class10.field242);
                    class209.field3305.method21(-113, 89);
                    class209.field3305.method14(-246866616, class345.field5363.field4671);
                    class209.field3305.method14(-246866616, class345.field5363.field4672);
                    class209.field3305.method21(-118, class129.field2068);
                    class209.field3305.method21(111, 63);
                }
            }
        }
        if (var4 == 26) {
            class86.method683(9049);
        }
        if (var4 == 1001) {
            class36.field538 = class170.field2740;
            class18.field349 = 0;
            class44.field697 = class243.field3639;
            class257.field3806++;
            class172.field2762 = 2;
            class209.field3305.method1808((byte) -74, 242);
            class209.field3305.method47(var5, false);
        }
        if (var4 == 12) {
            class36.field538 = class170.field2740;
            class44.field697 = class243.field3639;
            class18.field349 = 0;
            class172.field2762 = 2;
            class183.field2896++;
            class209.field3305.method1808((byte) -74, 155);
            class209.field3305.method49(-117, class48.field737[82] ? 1 : 0);
            class209.field3305.method26(-40, var5);
            class209.field3305.method44((byte) 103, class133.field2118 + var3);
            class209.field3305.method44((byte) -108, class117.field1902 + var2);
        }
        if (var4 == 38) {
            class92 var19 = class74.field1140[var5];
            if (var19 != null) {
                class36.field538 = class170.field2740;
                class172.field2762 = 2;
                class18.field349 = 0;
                class229.field3526++;
                class44.field697 = class243.field3639;
                class209.field3305.method1808((byte) -74, 220);
                class209.field3305.method49(-99, class48.field737[82] ? 1 : 0);
                class209.field3305.method47(var5, false);
            }
        }
        if (var4 == 39) {
            class92 var20 = class74.field1140[var5];
            if (var20 != null) {
                class36.field538 = class170.field2740;
                class44.field697 = class243.field3639;
                class18.field349 = 0;
                class63.field914++;
                class172.field2762 = 2;
                class209.field3305.method1808((byte) -74, 210);
                class209.field3305.method37((byte) -81, class48.field737[82] ? 1 : 0);
                class209.field3305.method14(-246866616, var5);
            }
        }
        if (var4 == 57) {
            class18.field349 = 0;
            class172.field2762 = 2;
            class36.field538 = class170.field2740;
            class76.field1185++;
            class44.field697 = class243.field3639;
            class209.field3305.method1808((byte) -74, 41);
            class209.field3305.method26(-107, class333.field5191);
            class209.field3305.method26(-126, class296.field4755);
            class209.field3305.method37((byte) -118, class48.field737[82] ? 1 : 0);
            class209.field3305.method52(class15.field311, (byte) 125);
            class209.field3305.method26(-111, class133.field2118 + var3);
            class209.field3305.method26(-50, var2 + class117.field1902);
            class209.field3305.method26(-100, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 5) {
            class172.field2762 = 2;
            class36.field538 = class170.field2740;
            class18.field349 = 0;
            class333.field5187++;
            class44.field697 = class243.field3639;
            class209.field3305.method1808((byte) -74, 106);
            class209.field3305.method21(96, class48.field737[82] ? 1 : 0);
            class209.field3305.method14(-246866616, var2 + class117.field1902);
            class209.field3305.method47(var3 + class133.field2118, false);
            class209.field3305.method44((byte) 111, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 1005) {
            class36.field538 = class170.field2740;
            class64.field932++;
            class44.field697 = class243.field3639;
            class18.field349 = 0;
            class172.field2762 = 2;
            class209.field3305.method1808((byte) -74, 224);
            class209.field3305.method14(-246866616, var5);
        }
        if (var4 == 23) {
            class36.field538 = class170.field2740;
            class172.field2762 = 2;
            class81.field1259++;
            class44.field697 = class243.field3639;
            class18.field349 = 0;
            class209.field3305.method1808((byte) -74, 39);
            class209.field3305.method37((byte) -100, class48.field737[82] ? 1 : 0);
            class209.field3305.method47(var2 + class117.field1902, false);
            class209.field3305.method47(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
            class209.field3305.method14(-246866616, class133.field2118 + var3);
        }
        if (var4 == 45) {
            if (var5 == 0) {
                class309.field4894 = 1;
                class218.method1579(class75.field1153, var2, var3);
            } else if (class233.field3543 > 0 && class48.field737[82] && class48.field737[81]) {
                class71.method571(class117.field1902 + var2, class75.field1153, class133.field2118 + var3, -102);
            } else {
                class209.field3305.method1808((byte) -74, 226);
                class180.field2859++;
                class209.field3305.method44((byte) -47, class133.field2118 + var3);
                class209.field3305.method26(-120, class117.field1902 + var2);
            }
        }
        if (var4 == 4) {
            class86 var21 = class197.field3029[var5];
            if (var21 != null) {
                class18.field349 = 0;
                class172.field2762 = 2;
                class36.field538 = class170.field2740;
                field2420++;
                class44.field697 = class243.field3639;
                class209.field3305.method1808((byte) -74, 2);
                class209.field3305.method44((byte) -107, var5);
                class209.field3305.method65(class48.field737[82] ? 1 : 0, 0);
            }
        }
        if (var4 == 1002) {
            class191.field2988++;
            class18.field349 = 0;
            class36.field538 = class170.field2740;
            class172.field2762 = 2;
            class44.field697 = class243.field3639;
            class209.field3305.method1808((byte) -74, 8);
            class209.field3305.method26(-123, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class209.field3305.method49(-104, class48.field737[82] ? 1 : 0);
            class209.field3305.method26(-111, class117.field1902 + var2);
            class209.field3305.method26(-66, class133.field2118 + var3);
        }
        if (var4 == 25 && class49.field757 == null) {
            class155.method1160(var3, (byte) -10, var2);
            class49.field757 = class77.method604(var2, var3, -10316);
            class280.method1971((byte) 101, class49.field757);
        }
        if (var4 == 51) {
            class107.field1753++;
            class209.field3305.method1808((byte) -74, 232);
            class209.field3305.method47(var2, false);
            class209.field3305.method14(-246866616, var5);
            class209.field3305.method52(var3, (byte) 121);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -119);
            class303.field4829 = var2;
        }
        if (var4 == 9) {
            class266 var36 = class77.method604(var2, var3, -10316);
            if (var36 != null) {
                class28.method249(-1);
                class257 var37 = client.method1867(var36);
                class201.method1441(var36.field3998, var3, var2, (byte) 7, var36.field4001, var37.field3807, var37.method1777(-2171));
                class25.field428 = 0;
                class129.field2067 = class204.method1462(-1, var36);
                if (class129.field2067 == null) {
                    class129.field2067 = "Null";
                }
                if (var36.field4043) {
                    class55.field848 = var36.field3935 + "<col=ffffff>";
                } else {
                    class55.field848 = "<col=00ff00>" + var36.field4078 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var4 == 41) {
            class92 var22 = class74.field1140[var5];
            if (var22 != null) {
                class255.field3752++;
                class172.field2762 = 2;
                class44.field697 = class243.field3639;
                class18.field349 = 0;
                class36.field538 = class170.field2740;
                class209.field3305.method1808((byte) -74, 37);
                class209.field3305.method26(-91, var5);
                class209.field3305.method37((byte) -115, class48.field737[82] ? 1 : 0);
            }
        }
        if (var4 == 1) {
            class28.method249(-1);
            class266 var23 = class171.method1276(var3, (byte) -116);
            class296.field4755 = var5;
            class15.field311 = var3;
            class333.field5191 = var2;
            class25.field428 = 1;
            class280.method1971((byte) 101, var23);
            class141.field2283 = "<col=ff9040>" + class188.method1361(true, var5).field2200 + "<col=ffffff>";
            if (class141.field2283 == null) {
                class141.field2283 = "null";
            }
            return;
        }
        int var24 = 47 / ((5 - arg0) / 53);
        if (var4 == 19) {
            class5.field126++;
            class209.field3305.method1808((byte) -74, 27);
            class209.field3305.method44((byte) 123, class201.field3076);
            class209.field3305.method7(-5628, class22.field392);
            class209.field3305.method14(-246866616, var2);
            class209.field3305.method11(var3, 31932);
        }
        if (var4 == 32) {
            class237.field3577++;
            class209.field3305.method1808((byte) -74, 145);
            class209.field3305.method11(var3, 31932);
            class266 var25 = class171.method1276(var3, (byte) -119);
            if (var25.field3938 != null && var25.field3938[0][0] == 5) {
                int var26 = var25.field3938[0][1];
                class123.field1998[var26] = 1 - class123.field1998[var26];
                class314.method2210(31845, var26);
            }
        }
        if (var4 == 1006) {
            class266 var27 = class171.method1276(var3, (byte) -120);
            if (var27 == null || var27.field3976[var2] < 100000) {
                class64.field932++;
                class209.field3305.method1808((byte) -74, 224);
                class209.field3305.method14(-246866616, var5);
            } else {
                class129.method1003(0, var27.field3976[var2] + " x " + class188.method1361(true, var5).field2200, "", -92);
            }
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -126);
            class303.field4829 = var2;
        }
        if (var4 == 36) {
            class209.field3305.method1808((byte) -74, 10);
            class209.field3305.method44((byte) 92, var2);
            class209.field3305.method44((byte) 89, var5);
            class209.field3305.method11(var3, 31932);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -125);
            class340.field5251++;
            class303.field4829 = var2;
        }
        if (var4 == 17) {
            class172.field2762 = 2;
            class44.field697 = class243.field3639;
            class25.field426++;
            class18.field349 = 0;
            class36.field538 = class170.field2740;
            class209.field3305.method1808((byte) -74, 78);
            class209.field3305.method14(-246866616, class117.field1902 + var2);
            class209.field3305.method21(68, class48.field737[82] ? 1 : 0);
            class209.field3305.method14(-246866616, class133.field2118 + var3);
            class209.field3305.method26(-98, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 14) {
            class342.field5294++;
            class209.field3305.method1808((byte) -74, 184);
            class209.field3305.method11(class22.field392, 31932);
            class209.field3305.method14(-246866616, var5);
            class209.field3305.method47(class201.field3076, false);
            class209.field3305.method52(var3, (byte) 117);
            class209.field3305.method44((byte) 118, var2);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -125);
            class303.field4829 = var2;
        }
        if (var4 == 22) {
            class36.field538 = class170.field2740;
            class44.field697 = class243.field3639;
            class182.field2883++;
            class18.field349 = 0;
            class172.field2762 = 2;
            class209.field3305.method1808((byte) -74, 171);
            class209.field3305.method26(-92, var3 + class133.field2118);
            class209.field3305.method47(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
            class209.field3305.method14(-246866616, class117.field1902 + var2);
            class209.field3305.method49(-64, class48.field737[82] ? 1 : 0);
        }
        if (var4 == 18) {
            class86 var28 = class197.field3029[var5];
            if (var28 != null) {
                class18.field349 = 0;
                class172.field2762 = 2;
                class45.field707++;
                class44.field697 = class243.field3639;
                class36.field538 = class170.field2740;
                class209.field3305.method1808((byte) -74, 137);
                class209.field3305.method14(-246866616, class333.field5191);
                class209.field3305.method21(98, class48.field737[82] ? 1 : 0);
                class209.field3305.method52(class15.field311, (byte) 127);
                class209.field3305.method26(-89, class296.field4755);
                class209.field3305.method14(-246866616, var5);
            }
        }
        if (var4 == 10) {
            class36.field538 = class170.field2740;
            class18.field349 = 0;
            class172.field2762 = 2;
            class44.field697 = class243.field3639;
            class211.field3313++;
            class209.field3305.method1808((byte) -74, 216);
            class209.field3305.method52(class22.field392, (byte) 113);
            class209.field3305.method14(-246866616, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class209.field3305.method47(class133.field2118 + var3, false);
            class209.field3305.method26(-63, class117.field1902 + var2);
            class209.field3305.method47(class201.field3076, false);
            class209.field3305.method49(-104, class48.field737[82] ? 1 : 0);
        }
        if (var4 == 16) {
            class92 var29 = class74.field1140[var5];
            if (var29 != null) {
                class172.field2762 = 2;
                class144.field2325++;
                class44.field697 = class243.field3639;
                class36.field538 = class170.field2740;
                class18.field349 = 0;
                class209.field3305.method1808((byte) -74, 140);
                class209.field3305.method44((byte) 109, class201.field3076);
                class209.field3305.method47(var5, false);
                class209.field3305.method52(class22.field392, (byte) 124);
                class209.field3305.method37((byte) -112, class48.field737[82] ? 1 : 0);
            }
        }
        if (var4 == 20) {
            class18.field349 = 0;
            class36.field538 = class170.field2740;
            class42.field660++;
            class172.field2762 = 2;
            class44.field697 = class243.field3639;
            class209.field3305.method1808((byte) -74, 250);
            class209.field3305.method21(97, class48.field737[82] ? 1 : 0);
            class209.field3305.method26(-40, class201.field3076);
            class209.field3305.method7(-5628, class22.field392);
            class209.field3305.method26(-121, var3 + class133.field2118);
            class209.field3305.method26(-96, var5);
            class209.field3305.method47(var2 + class117.field1902, false);
        }
        if (var4 == 7) {
            class332.field5178++;
            class18.field349 = 0;
            class44.field697 = class243.field3639;
            class172.field2762 = 2;
            class36.field538 = class170.field2740;
            class209.field3305.method1808((byte) -74, 72);
            class209.field3305.method52(class15.field311, (byte) 119);
            class209.field3305.method14(-246866616, var5);
            class209.field3305.method26(-122, class333.field5191);
            class209.field3305.method26(-113, class133.field2118 + var3);
            class209.field3305.method44((byte) 125, class296.field4755);
            class209.field3305.method44((byte) 122, class117.field1902 + var2);
            class209.field3305.method49(-90, class48.field737[82] ? 1 : 0);
        }
        if (var4 == 30) {
            class92 var30 = class74.field1140[var5];
            if (var30 != null) {
                class343.field5309++;
                class172.field2762 = 2;
                class36.field538 = class170.field2740;
                class44.field697 = class243.field3639;
                class18.field349 = 0;
                class209.field3305.method1808((byte) -74, 0);
                class209.field3305.method14(-246866616, var5);
                class209.field3305.method21(-93, class48.field737[82] ? 1 : 0);
                class209.field3305.method10(class15.field311, -117);
                class209.field3305.method44((byte) -95, class333.field5191);
                class209.field3305.method47(class296.field4755, false);
            }
        }
        if (var4 == 59) {
            class92 var31 = class74.field1140[var5];
            if (var31 != null) {
                class172.field2762 = 2;
                class108.field1769++;
                class44.field697 = class243.field3639;
                class18.field349 = 0;
                class36.field538 = class170.field2740;
                class209.field3305.method1808((byte) -74, 79);
                class209.field3305.method26(-52, var5);
                class209.field3305.method49(-94, class48.field737[82] ? 1 : 0);
            }
        }
        if (var4 == 46) {
            class86 var32 = class197.field3029[var5];
            if (var32 != null) {
                class322.field5037++;
                class172.field2762 = 2;
                class18.field349 = 0;
                class44.field697 = class243.field3639;
                class36.field538 = class170.field2740;
                class209.field3305.method1808((byte) -74, 221);
                class209.field3305.method49(-80, class48.field737[82] ? 1 : 0);
                class209.field3305.method47(var5, false);
            }
        }
        if (var4 == 2) {
            class156.field2563++;
            class209.field3305.method1808((byte) -74, 143);
            class209.field3305.method52(var3, (byte) 114);
            class209.field3305.method47(var5, false);
            class209.field3305.method44((byte) -55, var2);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) 99);
            class303.field4829 = var2;
        }
        if (var4 == 60) {
            class44.field697 = class243.field3639;
            class172.field2762 = 2;
            class185.field2927++;
            class18.field349 = 0;
            class36.field538 = class170.field2740;
            class209.field3305.method1808((byte) -74, 71);
            class209.field3305.method47(var5, false);
            class209.field3305.method49(-104, class48.field737[82] ? 1 : 0);
            class209.field3305.method14(-246866616, var2 + class117.field1902);
            class209.field3305.method44((byte) 122, class133.field2118 + var3);
        }
        if (var4 == 3) {
            class86 var33 = class197.field3029[var5];
            if (var33 != null) {
                class18.field349 = 0;
                class44.field697 = class243.field3639;
                class172.field2762 = 2;
                class258.field3833++;
                class36.field538 = class170.field2740;
                class209.field3305.method1808((byte) -74, 42);
                class209.field3305.method21(124, class48.field737[82] ? 1 : 0);
                class209.field3305.method14(-246866616, var5);
            }
        }
        if (var4 == 28) {
            class277.field4335++;
            class209.field3305.method1808((byte) -74, 196);
            class209.field3305.method47(var5, false);
            class209.field3305.method52(var3, (byte) 119);
            class209.field3305.method47(var2, false);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) 41);
            class303.field4829 = var2;
        }
        if (var4 == 40) {
            class118.field1917++;
            class172.field2762 = 2;
            class44.field697 = class243.field3639;
            class36.field538 = class170.field2740;
            class18.field349 = 0;
            class209.field3305.method1808((byte) -74, 222);
            class209.field3305.method65(class48.field737[82] ? 1 : 0, 0);
            class209.field3305.method44((byte) 91, class133.field2118 + var3);
            class209.field3305.method14(-246866616, class117.field1902 + var2);
            class209.field3305.method47(var5, false);
        }
        if (var4 == 37) {
            class34.field517++;
            class209.field3305.method1808((byte) -74, 129);
            class209.field3305.method26(-111, var5);
            class209.field3305.method11(var3, 31932);
            class209.field3305.method44((byte) -113, var2);
            class173.field2769 = 0;
            class64.field936 = class171.method1276(var3, (byte) -124);
            class303.field4829 = var2;
        }
        if (var4 == 6) {
            class86 var34 = class197.field3029[var5];
            if (var34 != null) {
                class172.field2762 = 2;
                class20.field371++;
                class18.field349 = 0;
                class36.field538 = class170.field2740;
                class44.field697 = class243.field3639;
                class209.field3305.method1808((byte) -74, 213);
                class209.field3305.method44((byte) 96, var5);
                class209.field3305.method21(-95, class48.field737[82] ? 1 : 0);
            }
        }
        if (var4 == 34) {
            class92 var35 = class74.field1140[var5];
            if (var35 != null) {
                class44.field697 = class243.field3639;
                class18.field349 = 0;
                class191.field2996++;
                class172.field2762 = 2;
                class36.field538 = class170.field2740;
                class209.field3305.method1808((byte) -74, 173);
                class209.field3305.method21(-102, class48.field737[82] ? 1 : 0);
                class209.field3305.method26(-78, var5);
            }
        }
        if (class25.field428 != 0) {
            class25.field428 = 0;
            class280.method1971((byte) 101, class171.method1276(class15.field311, (byte) 16));
        }
        if (class315.field4977) {
            class28.method249(-1);
        }
        if (class64.field936 != null && class173.field2769 == 0) {
            class280.method1971((byte) 101, class64.field936);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 1272)
    public class147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2415 = arg3;
        this.field2397 = arg6;
        this.field2421 = arg4;
        this.field2404 = arg5;
        this.field2411 = arg8;
        this.field2398 = arg1;
        this.field2406 = arg9;
        this.field2410 = arg2;
        this.field2402 = arg0;
        this.field2414 = arg7;
    }
}
