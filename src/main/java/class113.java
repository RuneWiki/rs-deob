import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class113 extends Canvas {

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field2046;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lli;")
    public static class185 field2042 = class245.method1649("Schlie-8en", 122);

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field2040 = 100;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "J")
    public static volatile long field2036 = 0L;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lli;")
    private static class185 field2032 = class245.method1649("Started 3d Library", -56);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lli;")
    public static class185 field2034 = field2032;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lli;")
    public static class185 field2051 = class245.method1649("D-Bmarrage de la librairie 3D", 126);

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lfl;")
    public static class191 field2049 = new class191();

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lhi;")
    public static class250 field2047;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lbk;")
    public static class52 field2052;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[Ldb;")
    public static class156[] field2038;

    @OriginalMember(owner = "client!vd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2046.paint(arg0);
        field2035++;
    }

    @OriginalMember(owner = "client!vd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2045++;
        this.field2046.update(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method782(int arg0) {
        field2049 = null;
        field2051 = null;
        field2042 = null;
        field2052 = null;
        field2034 = null;
        if (arg0 != 3251) {
            method785((class185) null, -10, 101);
        }
        field2032 = null;
        field2047 = null;
        field2038 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static final void method783(byte arg0) {
        class241.field4299.method194(1123);
        field2044++;
        if (arg0 <= 4) {
            field2052 = null;
        }
        class276.field4883.method442((byte) 80);
        class241.field4307.method442((byte) 75);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
    public static final void method784(int arg0, byte arg1) {
        field2048++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class78.field1353[arg0];
        int var3 = class49.field809[arg0];
        int var4 = class55.field936[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class162.field3052[arg0];
        long var6 = class162.field3052[arg0];
        if (var4 == 45) {
            class82 var8 = class157.method1115(6684, var3, var2);
            if (var8 != null) {
                class260.method1763(true);
                class165.method1181(-1, var2, var3, class40.method248(client.method1502(var8), (byte) 123));
                class187.field3471 = 0;
                class102.field1856 = class142.method1019(var8, (byte) 61);
                if (class102.field1856 == null) {
                    class102.field1856 = class171.field3153;
                }
                if (var8.field1572) {
                    class110.field1980 = class87.method567(-11039, new class185[] { var8.field1502, class259.field4596 });
                    return;
                }
                class110.field1980 = class87.method567(-11039, new class185[] { class225.field4125, var8.field1560, class259.field4596 });
            }
            return;
        }
        if (var4 == 41) {
            class180.field3316++;
            class182.field3349.method577(255, arg1 - 10);
            class182.field3349.method842(var3, -6596);
            class82 var9 = class116.method805(1, var3);
            if (var9.field1561 != null && var9.field1561[0][0] == 5) {
                int var10 = var9.field1561[0][1];
                if (class59.field1059[var10] != var9.field1545[0]) {
                    class59.field1059[var10] = var9.field1545[0];
                    class262.method1791(var10, 7330);
                }
            }
        }
        if (var4 == 60) {
            class236.field4228++;
            if (class235.field4218 == 1) {
                class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 82, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
            } else {
                boolean var11 = class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 91, 0, 0, 0, false, 0, class241.field4310.field2651[0]);
                if (!var11) {
                    class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) -54, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                }
            }
            class268.field4744 = 2;
            class60.field1078 = 0;
            class123.field2230 = class161.field3041;
            class97.field1820 = class6.field136;
            class182.field3349.method577(48, arg1 ^ 0xA);
            class182.field3349.method856(31133, var5);
            class182.field3349.method874(class107.field1933 + var3, arg1 ^ 0x5BBB3E82);
            class182.field3349.method843((byte) 98, class77.field1339 + var2);
        }
        if (var4 == 11) {
            class193.field3564++;
            class182.field3349.method577(145, arg1 ^ 0xA);
            class182.field3349.method849(var3, arg1 ^ 0xE653F992);
            class182.field3349.method856(31133, var5);
            class182.field3349.method859(var2, -216122296);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 33) {
            class43.field651++;
            class182.field3349.method577(140, 0);
            class182.field3349.method843((byte) -107, var2);
            class182.field3349.method849(var3, -430704232);
            class182.field3349.method856(31133, var5);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 6) {
            class82 var13 = class116.method805(arg1 - 9, var3);
            boolean var14 = true;
            if (var13.field1599 > 0) {
                var14 = class271.method1856(250, var13);
            }
            if (var14) {
                class182.field3349.method577(255, 0);
                class182.field3349.method842(var3, -6596);
                class180.field3316++;
            }
        }
        if (var4 == 1005) {
            class123.field2230 = class161.field3041;
            class60.field1078 = 0;
            class97.field1820 = class6.field136;
            class169.field3134++;
            class268.field4744 = 2;
            class182.field3349.method577(9, arg1 ^ 0xA);
            class182.field3349.method856(31133, var5);
        }
        if (var4 == 1001) {
            class82 var15 = class116.method805(arg1 - 9, var3);
            if (var15 == null || var15.field1548[var2] < 100000) {
                class182.field3349.method577(60, 0);
                class182.field3349.method856(31133, var5);
                class239.field4265++;
            } else {
                class1.method5(class20.field336, 0, true, class87.method567(-11039, new class185[] { class90.method591(var15.field1548[var2], 0), class40.field625, class165.method1179(arg1 + 92, var5).field2436 }));
            }
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 1003) {
            class97.field1820 = class6.field136;
            class60.field1078 = 0;
            class239.field4265++;
            class123.field2230 = class161.field3041;
            class268.field4744 = 2;
            class182.field3349.method577(60, 0);
            class182.field3349.method856(31133, var5);
        }
        if (var4 == 39) {
            if (class235.field4218 == 1) {
                class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 91, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
            } else {
                boolean var16 = class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 118, 0, 0, 0, false, 0, class241.field4310.field2651[0]);
                if (!var16) {
                    class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) -101, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                }
            }
            class60.field1078 = 0;
            class268.field4744 = 2;
            class66.field1148++;
            class97.field1820 = class6.field136;
            class123.field2230 = class161.field3041;
            class182.field3349.method577(135, 0);
            class182.field3349.method856(31133, class77.field1339 + var2);
            class182.field3349.method856(arg1 ^ 0x7997, var5);
            class182.field3349.method874(class107.field1933 + var3, arg1 + 1538997886);
        }
        if (var4 == 46) {
            class71 var18 = class87.field1712[var5];
            if (var18 != null) {
                class126.field2263++;
                class256.method1739(var18.field2720[0], 0, var18.field2651[0], 2, class241.field4310.field2720[0], (byte) -58, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class97.field1820 = class6.field136;
                class123.field2230 = class161.field3041;
                class60.field1078 = 0;
                class268.field4744 = 2;
                class182.field3349.method577(105, 0);
                class182.field3349.method843((byte) 123, class102.field1853);
                class182.field3349.method833(class215.field3952, (byte) 124);
                class182.field3349.method874(var5, 1538997896);
                class182.field3349.method859(class210.field3840, arg1 ^ 0xF31E3C42);
            }
        }
        if (var4 == 29) {
            class188 var19 = class93.field1774[var5];
            if (var19 != null) {
                class103.field1870++;
                class256.method1739(var19.field2720[0], 0, var19.field2651[0], 2, class241.field4310.field2720[0], (byte) -119, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class60.field1078 = 0;
                class268.field4744 = 2;
                class97.field1820 = class6.field136;
                class123.field2230 = class161.field3041;
                class182.field3349.method577(203, 0);
                class182.field3349.method843((byte) -105, var5);
            }
        }
        if (var4 == 38) {
            class49.method310(var3, var6, var2, 0);
            class182.field3349.method577(54, 0);
            class63.field1101++;
            class182.field3349.method843((byte) 124, class107.field1933 + var3);
            class182.field3349.method856(31133, class77.field1339 + var2);
            class182.field3349.method843((byte) -94, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 30) {
            class182.field3349.method577(255, arg1 - 10);
            class180.field3316++;
            class182.field3349.method842(var3, arg1 ^ 0xFFFFE636);
            class82 var20 = class116.method805(1, var3);
            if (var20.field1561 != null && var20.field1561[0][0] == 5) {
                int var21 = var20.field1561[0][1];
                class59.field1059[var21] = 1 - class59.field1059[var21];
                class262.method1791(var21, 7330);
            }
        }
        if (var4 == 5) {
            class52.field877++;
            class49.method310(var3, var6, var2, 0);
            class182.field3349.method577(86, 0);
            class182.field3349.method874(var3 + class107.field1933, 1538997896);
            class182.field3349.method843((byte) 127, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class182.field3349.method859(class77.field1339 + var2, -216122296);
        }
        if (var4 == 3) {
            class127.field2275++;
            class49.method310(var3, var6, var2, 0);
            class182.field3349.method577(101, 0);
            class182.field3349.method874(Integer.MAX_VALUE & (int) (var6 >>> 32), 1538997896);
            class182.field3349.method843((byte) -60, class77.field1339 + var2);
            class182.field3349.method856(31133, var3 + class107.field1933);
        }
        if (var4 == 9) {
            class260.method1763(true);
            class82 var22 = class116.method805(1, var3);
            class187.field3471 = 1;
            class210.field3840 = var2;
            class215.field3952 = var3;
            class102.field1853 = var5;
            class229.method1581(var22, false);
            class264.field4689 = class87.method567(-11039, new class185[] { class20.field335, class165.method1179(102, var5).field2436, class259.field4596 });
            if (class264.field4689 == null) {
                class264.field4689 = class71.field1250;
            }
            return;
        }
        if (var4 == 1) {
            class173.field3175++;
            class49.method310(var3, var6, var2, 0);
            class182.field3349.method577(88, 0);
            class182.field3349.method859(class107.field1933 + var3, -216122296);
            class182.field3349.method874(Integer.MAX_VALUE & (int) (var6 >>> 32), 1538997896);
            class182.field3349.method859(class77.field1339 + var2, arg1 ^ 0xF31E3C42);
        }
        if (var4 == 37) {
            class97.field1818++;
            class182.field3349.method577(73, 0);
            class182.field3349.method874(var5, 1538997896);
            class182.field3349.method859(var2, -216122296);
            class182.field3349.method833(var3, (byte) 127);
            class182.field3349.method856(31133, class102.field1853);
            class182.field3349.method843((byte) 122, class210.field3840);
            class182.field3349.method833(class215.field3952, (byte) 120);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 19) {
            class188 var23 = class93.field1774[var5];
            if (var23 != null) {
                class117.field2092++;
                class256.method1739(var23.field2720[0], 0, var23.field2651[0], 2, class241.field4310.field2720[0], (byte) 93, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class123.field2230 = class161.field3041;
                class60.field1078 = 0;
                class97.field1820 = class6.field136;
                class268.field4744 = 2;
                class182.field3349.method577(62, arg1 - 10);
                class182.field3349.method856(31133, var5);
            }
        }
        if (var4 == 20) {
            if (var5 == 0) {
                class90.field1745 = 1;
                class272.method1863(class265.field4703, var2, var3);
            } else if (class205.field3769 > 0 && class139.field2615[82] && class139.field2615[81]) {
                class150.method1067(class107.field1933 + var3, class265.field4703, class77.field1339 + var2, -445958970);
            } else {
                class182.field3349.method577(250, 0);
                class157.field2977++;
                class182.field3349.method843((byte) -60, class77.field1339 + var2);
                class182.field3349.method843((byte) 122, class107.field1933 + var3);
            }
        }
        if (var4 == 21) {
            class188 var24 = class93.field1774[var5];
            if (var24 != null) {
                class256.method1739(var24.field2720[0], 0, var24.field2651[0], 2, class241.field4310.field2720[0], (byte) -77, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class60.field1078 = 0;
                class97.field1820 = class6.field136;
                class108.field1961++;
                class268.field4744 = 2;
                class123.field2230 = class161.field3041;
                class182.field3349.method577(178, 0);
                class182.field3349.method843((byte) 89, var5);
            }
        }
        if (var4 == 31) {
            class242.field4312++;
            class182.field3349.method577(41, arg1 ^ 0xA);
            class182.field3349.method833(var3, (byte) 119);
            class182.field3349.method843((byte) 113, var5);
            class182.field3349.method843((byte) 114, var2);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 43) {
            class182.field3349.method577(213, 0);
            class182.field3349.method833(var3, (byte) 123);
            class7.field162++;
            class182.field3349.method874(var2, 1538997896);
            class182.field3349.method859(var5, -216122296);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 22 || var4 == 1004) {
            class107.method753(var5, var2, class107.field1922[arg0], var3, 26);
        }
        if (var4 == 24) {
            class182.field3349.method577(192, 0);
            class260.field4609++;
            class182.field3349.method826((byte) -117, var3);
            class182.field3349.method843((byte) 122, var5);
            class182.field3349.method826((byte) -120, class140.field2617);
            class182.field3349.method856(31133, var2);
            class182.field3349.method843((byte) 118, class148.field2805);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(arg1 ^ 0xB, var3);
            class174.field3188 = var2;
        }
        if (var4 == 25) {
            if (class235.field4218 == 1) {
                class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 76, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
            } else {
                boolean var25 = class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 73, 0, 0, 0, false, 0, class241.field4310.field2651[0]);
                if (!var25) {
                    class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 111, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                }
            }
            class268.field4744 = 2;
            class60.field1078 = 0;
            class212.field3865++;
            class97.field1820 = class6.field136;
            class123.field2230 = class161.field3041;
            class182.field3349.method577(36, 0);
            class182.field3349.method843((byte) 120, class77.field1339 + var2);
            class182.field3349.method856(31133, var5);
            class182.field3349.method859(class107.field1933 + var3, -216122296);
        }
        if (var4 == 23) {
            class188 var27 = class93.field1774[var5];
            if (var27 != null) {
                class229.field4162++;
                class256.method1739(var27.field2720[0], 0, var27.field2651[0], 2, class241.field4310.field2720[0], (byte) -76, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class97.field1820 = class6.field136;
                class60.field1078 = 0;
                class123.field2230 = class161.field3041;
                class268.field4744 = 2;
                class182.field3349.method577(147, 0);
                class182.field3349.method843((byte) 95, var5);
            }
        }
        if (var4 == 1007) {
            class60.field1078 = 0;
            class123.field2230 = class161.field3041;
            class97.field1820 = class6.field136;
            class268.field4744 = 2;
            class71 var28 = class87.field1712[var5];
            if (var28 != null) {
                class81 var29 = var28.field1236;
                if (var29.field1411 != null) {
                    var29 = var29.method525((byte) -88);
                }
                if (var29 != null) {
                    class182.field3349.method577(65, 0);
                    class182.field3349.method843((byte) -67, var29.field1454);
                    class137.field2566++;
                }
            }
        }
        if (var4 == 48) {
            class17.method124(0);
        }
        if (var4 == 16) {
            class188 var30 = class93.field1774[var5];
            if (var30 != null) {
                class20.field318++;
                class256.method1739(var30.field2720[0], 0, var30.field2651[0], 2, class241.field4310.field2720[0], (byte) -88, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class97.field1820 = class6.field136;
                class268.field4744 = 2;
                class60.field1078 = 0;
                class123.field2230 = class161.field3041;
                class182.field3349.method577(77, arg1 ^ 0xA);
                class182.field3349.method859(var5, -216122296);
            }
        }
        if (var4 == 2) {
            class232.field4178++;
            class182.field3349.method577(171, arg1 - 10);
            class182.field3349.method849(var3, arg1 ^ 0xE653F992);
            class182.field3349.method856(arg1 ^ 0x7997, var2);
            class182.field3349.method856(31133, var5);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 4) {
            if (var5 == 0) {
                class140.field2624 = 1;
                class272.method1863(class265.field4703, var2, var3);
            } else if (var5 == 1) {
                class182.field3349.method577(27, 0);
                class128.field2289++;
                class182.field3349.method843((byte) 87, class148.field2805);
                class182.field3349.method842(class140.field2617, -6596);
                class182.field3349.method843((byte) 94, class77.field1339 + var2);
                class182.field3349.method843((byte) 115, class107.field1933 + var3);
            }
        }
        if (var4 == 42) {
            if (var5 == 0) {
                class272.method1863(class265.field4703, var2, var3);
            } else if (var5 == 1) {
                if (class205.field3769 > 0 && class139.field2615[82] && class139.field2615[81]) {
                    class150.method1067(class107.field1933 + var3, class265.field4703, class77.field1339 + var2, arg1 + -445958980);
                } else if (class256.method1739(var3, 0, var2, 1, class241.field4310.field2720[0], (byte) 72, 0, 0, 0, true, 0, class241.field4310.field2651[0])) {
                    class182.field3349.method877((byte) 107, class104.field1887);
                    class182.field3349.method877((byte) 113, class102.field1848);
                    class182.field3349.method856(31133, class92.field1765);
                    class182.field3349.method877((byte) 104, 57);
                    class182.field3349.method877((byte) 122, class191.field3543);
                    class182.field3349.method877((byte) 102, class239.field4270);
                    class182.field3349.method877((byte) 98, 89);
                    class182.field3349.method856(31133, class241.field4310.field2694);
                    class182.field3349.method856(31133, class241.field4310.field2687);
                    class182.field3349.method877((byte) 127, class258.field4587);
                    class182.field3349.method877((byte) 95, 63);
                }
            }
        }
        if (var4 == 36) {
            class182.field3349.method577(154, 0);
            class182.field3349.method833(var3, (byte) 119);
            class182.field3349.method859(var5, arg1 - 216122306);
            class237.field4238++;
            class182.field3349.method843((byte) 102, var2);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 14) {
            class71 var31 = class87.field1712[var5];
            if (var31 != null) {
                class256.method1739(var31.field2720[0], 0, var31.field2651[0], 2, class241.field4310.field2720[0], (byte) 121, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class97.field1820 = class6.field136;
                class123.field2230 = class161.field3041;
                class268.field4744 = 2;
                class60.field1078 = 0;
                class182.field3349.method577(166, 0);
                class232.field4174++;
                class182.field3349.method874(var5, arg1 + 1538997886);
            }
        }
        if (var4 == 57 && class49.method310(var3, var6, var2, arg1 ^ 0xA)) {
            class243.field4343++;
            class182.field3349.method577(179, 0);
            class182.field3349.method874(class77.field1339 + var2, arg1 + 1538997886);
            class182.field3349.method826((byte) -115, class140.field2617);
            class182.field3349.method856(31133, class148.field2805);
            class182.field3349.method874(Integer.MAX_VALUE & (int) (var6 >>> 32), arg1 + 1538997886);
            class182.field3349.method874(var3 + class107.field1933, 1538997896);
        }
        if (var4 == 12) {
            class71 var32 = class87.field1712[var5];
            if (var32 != null) {
                class256.method1739(var32.field2720[0], 0, var32.field2651[0], 2, class241.field4310.field2720[0], (byte) -40, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class123.field2230 = class161.field3041;
                class97.field1820 = class6.field136;
                class60.field1078 = 0;
                class24.field392++;
                class268.field4744 = 2;
                class182.field3349.method577(113, arg1 ^ 0xA);
                class182.field3349.method856(31133, var5);
            }
        }
        if (var4 == 7) {
            boolean var33 = class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) -42, 0, 0, 0, false, 0, class241.field4310.field2651[0]);
            if (!var33) {
                class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) -79, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
            }
            class268.field4744 = 2;
            class148.field2784++;
            class97.field1820 = class6.field136;
            class123.field2230 = class161.field3041;
            class60.field1078 = 0;
            class182.field3349.method577(75, 0);
            class182.field3349.method843((byte) -38, class107.field1933 + var3);
            class182.field3349.method849(class140.field2617, -430704232);
            class182.field3349.method843((byte) 89, class77.field1339 + var2);
            class182.field3349.method874(var5, 1538997896);
            class182.field3349.method843((byte) -117, class148.field2805);
        }
        if (var4 == 35) {
            class188 var35 = class93.field1774[var5];
            if (var35 != null) {
                class117.field2086++;
                class256.method1739(var35.field2720[0], 0, var35.field2651[0], 2, class241.field4310.field2720[0], (byte) 84, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class97.field1820 = class6.field136;
                class268.field4744 = 2;
                class60.field1078 = 0;
                class123.field2230 = class161.field3041;
                class182.field3349.method577(121, 0);
                class182.field3349.method874(var5, 1538997896);
                class182.field3349.method849(class140.field2617, arg1 - 430704242);
                class182.field3349.method859(class148.field2805, -216122296);
            }
        }
        if (var4 == 40) {
            boolean var36 = class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) -46, 0, 0, 0, false, 0, class241.field4310.field2651[0]);
            if (!var36) {
                class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 81, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
            }
            class268.field4744 = 2;
            class60.field1078 = 0;
            class97.field1820 = class6.field136;
            class220.field4006++;
            class123.field2230 = class161.field3041;
            class182.field3349.method577(186, 0);
            class182.field3349.method843((byte) 114, class210.field3840);
            class182.field3349.method859(class107.field1933 + var3, -216122296);
            class182.field3349.method843((byte) -55, class102.field1853);
            class182.field3349.method874(class77.field1339 + var2, 1538997896);
            class182.field3349.method843((byte) -65, var5);
            class182.field3349.method842(class215.field3952, -6596);
        }
        if (var4 == 47) {
            class71 var38 = class87.field1712[var5];
            if (var38 != null) {
                class256.method1739(var38.field2720[0], 0, var38.field2651[0], 2, class241.field4310.field2720[0], (byte) 81, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class60.field1078 = 0;
                class123.field2230 = class161.field3041;
                class97.field1820 = class6.field136;
                class268.field4744 = 2;
                class182.field3349.method577(227, arg1 - 10);
                class182.field3349.method826((byte) -34, class140.field2617);
                class182.field3349.method859(class148.field2805, -216122296);
                class182.field3349.method843((byte) -66, var5);
                class165.field3080++;
            }
        }
        if (var4 == 8 && class49.method310(var3, var6, var2, arg1 - 10)) {
            class212.field3880++;
            class182.field3349.method577(215, 0);
            class182.field3349.method859(class107.field1933 + var3, -216122296);
            class182.field3349.method874((int) (var6 >>> 32) & Integer.MAX_VALUE, 1538997896);
            class182.field3349.method874(class210.field3840, arg1 + 1538997886);
            class182.field3349.method859(class102.field1853, arg1 ^ 0xF31E3C42);
            class182.field3349.method859(class77.field1339 + var2, -216122296);
            class182.field3349.method849(class215.field3952, -430704232);
        }
        if (var4 == 51) {
            class106.field1914++;
            class182.field3349.method577(195, 0);
            class182.field3349.method874(var5, 1538997896);
            class182.field3349.method833(var3, (byte) 125);
            class182.field3349.method874(var2, 1538997896);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 50) {
            class182.field3349.method577(44, 0);
            class171.field3155++;
            class182.field3349.method849(var3, -430704232);
            class182.field3349.method843((byte) 106, var5);
            class182.field3349.method843((byte) -108, var2);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(arg1 ^ 0xB, var3);
            class174.field3188 = var2;
        }
        if (var4 == 58) {
            class209.field3817++;
            class182.field3349.method577(247, 0);
            class182.field3349.method849(var3, -430704232);
            class182.field3349.method859(var2, -216122296);
            class182.field3349.method843((byte) -44, var5);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(1, var3);
            class174.field3188 = var2;
        }
        if (var4 == 18) {
            class43.field678++;
            if (class235.field4218 == 1) {
                class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 99, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
            } else {
                boolean var39 = class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 121, 0, 0, 0, false, 0, class241.field4310.field2651[0]);
                if (!var39) {
                    class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) -128, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                }
            }
            class268.field4744 = 2;
            class60.field1078 = 0;
            class123.field2230 = class161.field3041;
            class97.field1820 = class6.field136;
            class182.field3349.method577(68, 0);
            class182.field3349.method843((byte) 87, class77.field1339 + var2);
            class182.field3349.method874(class107.field1933 + var3, 1538997896);
            class182.field3349.method856(31133, var5);
        }
        if (arg1 != 10) {
            method784(86, (byte) -32);
        }
        if (var4 == 13) {
            class188 var41 = class93.field1774[var5];
            if (var41 != null) {
                class256.method1739(var41.field2720[0], 0, var41.field2651[0], 2, class241.field4310.field2720[0], (byte) -57, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class60.field1078 = 0;
                class22.field374++;
                class268.field4744 = 2;
                class97.field1820 = class6.field136;
                class123.field2230 = class161.field3041;
                class182.field3349.method577(174, arg1 ^ 0xA);
                class182.field3349.method874(var5, 1538997896);
            }
        }
        if (var4 == 28) {
            class71 var42 = class87.field1712[var5];
            if (var42 != null) {
                class117.field2088++;
                class256.method1739(var42.field2720[0], 0, var42.field2651[0], 2, class241.field4310.field2720[0], (byte) -63, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class60.field1078 = 0;
                class268.field4744 = 2;
                class123.field2230 = class161.field3041;
                class97.field1820 = class6.field136;
                class182.field3349.method577(167, 0);
                class182.field3349.method856(31133, var5);
            }
        }
        if (var4 == 49) {
            class188 var43 = class93.field1774[var5];
            if (var43 != null) {
                class178.field3255++;
                class256.method1739(var43.field2720[0], 0, var43.field2651[0], 2, class241.field4310.field2720[0], (byte) 111, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class97.field1820 = class6.field136;
                class60.field1078 = 0;
                class123.field2230 = class161.field3041;
                class268.field4744 = 2;
                class182.field3349.method577(150, arg1 ^ 0xA);
                class182.field3349.method856(31133, var5);
            }
        }
        if (var4 == 10 && class225.field4118 == null) {
            class183.method1292(var2, var3, 173);
            class225.field4118 = class157.method1115(6684, var3, var2);
            class229.method1581(class225.field4118, false);
        }
        if (var4 == 26) {
            class182.field3349.method577(52, 0);
            class182.field3349.method843((byte) -63, var2);
            class182.field3349.method849(var3, -430704232);
            class182.field3349.method856(31133, class148.field2805);
            class5.field125++;
            class182.field3349.method833(class140.field2617, (byte) 123);
        }
        if (var4 == 17) {
            class71 var44 = class87.field1712[var5];
            if (var44 != null) {
                class256.method1739(var44.field2720[0], 0, var44.field2651[0], 2, class241.field4310.field2720[0], (byte) 73, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class268.field4744 = 2;
                class97.field1820 = class6.field136;
                class152.field2873++;
                class60.field1078 = 0;
                class123.field2230 = class161.field3041;
                class182.field3349.method577(185, 0);
                class182.field3349.method859(var5, -216122296);
            }
        }
        if (var4 == 1002) {
            class49.method310(var3, var6, var2, 0);
            class182.field3349.method577(239, 0);
            class269.field4757++;
            class182.field3349.method859(Integer.MAX_VALUE & (int) (var6 >>> 32), -216122296);
            class182.field3349.method859(class107.field1933 + var3, -216122296);
            class182.field3349.method843((byte) -116, var2 + class77.field1339);
        }
        if (var4 == 34) {
            class188 var45 = class93.field1774[var5];
            if (var45 != null) {
                class256.method1739(var45.field2720[0], 0, var45.field2651[0], 2, class241.field4310.field2720[0], (byte) 120, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class268.field4744 = 2;
                class97.field1820 = class6.field136;
                class130.field2329++;
                class60.field1078 = 0;
                class123.field2230 = class161.field3041;
                class182.field3349.method577(56, 0);
                class182.field3349.method843((byte) -84, var5);
            }
        }
        if (var4 == 44) {
            class182.field3349.method577(124, 0);
            class123.field2219++;
            class182.field3349.method843((byte) -100, var2);
            class182.field3349.method842(var3, -6596);
            class182.field3349.method874(var5, 1538997896);
            class194.field3573 = 0;
            class242.field4333 = class116.method805(arg1 - 9, var3);
            class174.field3188 = var2;
        }
        if (var4 == 32) {
            class188 var46 = class93.field1774[var5];
            if (var46 != null) {
                class162.field3049++;
                class256.method1739(var46.field2720[0], 0, var46.field2651[0], 2, class241.field4310.field2720[0], (byte) -52, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class97.field1820 = class6.field136;
                class60.field1078 = 0;
                class268.field4744 = 2;
                class123.field2230 = class161.field3041;
                class182.field3349.method577(123, 0);
                class182.field3349.method856(31133, var5);
                class182.field3349.method843((byte) -71, class102.field1853);
                class182.field3349.method849(class215.field3952, -430704232);
                class182.field3349.method874(class210.field3840, 1538997896);
            }
        }
        if (var4 == 15) {
            class71 var47 = class87.field1712[var5];
            if (var47 != null) {
                class272.field4821++;
                class256.method1739(var47.field2720[0], 0, var47.field2651[0], 2, class241.field4310.field2720[0], (byte) -70, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                class123.field2230 = class161.field3041;
                class268.field4744 = 2;
                class60.field1078 = 0;
                class97.field1820 = class6.field136;
                class182.field3349.method577(151, 0);
                class182.field3349.method856(31133, var5);
            }
        }
        if (var4 == 59) {
            if (class235.field4218 == 1) {
                class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 41, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
            } else {
                boolean var48 = class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) 72, 0, 0, 0, false, 0, class241.field4310.field2651[0]);
                if (!var48) {
                    class256.method1739(var3, 0, var2, 2, class241.field4310.field2720[0], (byte) -110, 0, 0, 1, false, 1, class241.field4310.field2651[0]);
                }
            }
            class60.field1078 = 0;
            class268.field4744 = 2;
            class118.field2159++;
            class123.field2230 = class161.field3041;
            class97.field1820 = class6.field136;
            class182.field3349.method577(160, 0);
            class182.field3349.method874(class77.field1339 + var2, 1538997896);
            class182.field3349.method843((byte) 88, var5);
            class182.field3349.method859(var3 + class107.field1933, arg1 ^ 0xF31E3C42);
        }
        if (class187.field3471 != 0) {
            class187.field3471 = 0;
            class229.method1581(class116.method805(1, class215.field3952), false);
        }
        if (class254.field4504) {
            class260.method1763(true);
        }
        if (class242.field4333 != null && class194.field3573 == 0) {
            class229.method1581(class242.field4333, false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lli;II)V")
    public static final void method785(class185 arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            method784(-5, (byte) -47);
        }
        field2050++;
        class174 var3 = class249.method1671(3, arg2, (byte) -3);
        var3.method1233(0);
        var3.field3183 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILli;)Lli;")
    public static final class185 method786(int arg0, class185 arg1) {
        int var2 = class76.method497(arg1, (byte) 0);
        field2041++;
        return ~var2 == arg0 ? class224.field4110 : class215.field3955.field3136[var2].method1336((byte) -102, class118.field2161, class163.field3059);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class113(Component arg0) {
        this.field2046 = arg0;
    }
}
