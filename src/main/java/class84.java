import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class84 {

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field1287 = 0;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lqe;")
    public static class168 field1279 = class66.method448("weiss:", 94);

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field1285 = -1;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "[I")
    public static int[] field1289 = new int[200];

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field1284 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
    public static boolean field1277 = false;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[J")
    public static long[] field1281 = new long[32];

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method553(int arg0) {
        int var1 = -37 % ((arg0 + 15) / 33);
        field1279 = null;
        field1289 = null;
        field1281 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)[B")
    public abstract byte[] method554(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public static final void method555(int arg0, int arg1) {
        field1288++;
        if (class254.field4403 == arg1) {
            return;
        }
        if (class254.field4403 == 0) {
            class44.method295(false);
        }
        if (arg1 == 20 || arg1 == 40) {
            class193.field3366 = 0;
            class118.field1924 = 0;
            class252.field4370 = 0;
            class26.field320 = -4;
        }
        if (arg1 != 20 && arg1 != 40 && class185.field3273 != null) {
            class185.field3273.method1653(arg0 - 37);
            class185.field3273 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class170.field2967 = 1;
            class207.field3603 = 0;
            class23.field263 = 0;
            class80.field1208 = 0;
            class172.field2987 = 1;
            class166.method1064((byte) 70);
        }
        if (arg1 == 5) {
            class236.method1526(73, class152.field2645);
        } else {
            class61.method415((byte) 115);
        }
        boolean var2 = arg1 == 5 || arg1 == 8 || arg1 == 10 || arg1 == 28;
        boolean var3 = class254.field4403 == arg0 || class254.field4403 == 8 || class254.field4403 == 10 || class254.field4403 == 28;
        if (var2 != var3) {
            if (var2) {
                class230.field3908 = class207.field3595;
                if (class93.field1464 == 0) {
                    class31.method202(2, true);
                } else {
                    class85.method565(class159.field2749, class207.field3595, 255, 0, -1, false, 2);
                }
                class60.method409(false, -102);
            } else {
                class31.method202(2, true);
                class60.method409(true, -93);
            }
        }
        if (arg1 == 8) {
            arg1 = class16.method82(-38);
        }
        class254.field4403 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static final void method556(byte arg0) {
        if (arg0 != 66) {
            field1284 = -44;
        }
        field1290++;
        if (class227.field3872 == null) {
            return;
        }
        try {
            byte[] var1 = class227.field3872.method1248(-103);
            if (var1 != null) {
                class112 var2 = new class112(var1);
                class230.field3907 = var2.method731(false);
                class129.field2252 = new class171[class230.field3907];
                for (int var3 = 0; var3 < class230.field3907; var3++) {
                    class171 var4 = class129.field2252[var3] = new class171();
                    int var5 = var2.method731(false);
                    var4.field2979 = var5 & 0x7FFF;
                    var4.field2972 = (var5 & 0x8000) != 0;
                    var4.field2971 = var2.method751((byte) -81);
                    var4.field2981 = var2.method740(16711680);
                    var4.field2976 = var3;
                    var4.field2970 = class91.method601(var2.method731(false), (byte) -120);
                }
                class19.method101(0, 1, class129.field2252, class129.field2252.length - 1);
                class227.field3872 = null;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class227.field3872 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z[B)V")
    public abstract void method557(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static final void method558(byte arg0) {
        for (int var1 = 0; var1 < class82.field1244; var1++) {
            int var2 = class51.field690[var1];
            class222 var3 = class229.field3898[var2];
            if (var3 != null) {
                class257.method1716(var3.field3814.field3189, var3, (byte) 71);
            }
        }
        field1283++;
        if (arg0 != -99) {
            field1281 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method559(boolean arg0) {
        class65.method443(class240.field4106, 0);
        if (!arg0) {
            field1277 = false;
        }
        field1282++;
        class155.field2706++;
        if (class51.field697 && class254.field4388) {
            int var1 = class161.field2765;
            int var2 = var1 - class46.field599;
            if (var2 < class169.field2949) {
                var2 = class169.field2949;
            }
            if (class169.field2949 + class91.field1430.field2210 < var2 - -class240.field4106.field2210) {
                var2 = class91.field1430.field2210 + class169.field2949 - class240.field4106.field2210;
            }
            int var3 = var2 - class123.field2033;
            int var4 = class146.field2550;
            int var5 = class240.field4106.field2227;
            int var6 = var4 - class71.field1075;
            int var7 = var2 + class91.field1430.field2224 - class169.field2949;
            if (var6 < class68.field959) {
                var6 = class68.field959;
            }
            if (class68.field959 + class91.field1430.field2175 < class240.field4106.field2175 + var6) {
                var6 = class68.field959 + class91.field1430.field2175 - class240.field4106.field2175;
            }
            int var8 = var6 - field1285;
            if (class240.field4106.field2270 < class155.field2706 && (var8 > var5 || -var5 > var8 || var3 > var5 || -var5 > var3)) {
                class234.field3971 = true;
            }
            int var9 = var6 + class91.field1430.field2203 - class68.field959;
            if (class240.field4106.field2130 != null && class234.field3971) {
                class147 var10 = new class147();
                var10.field2557 = var7;
                var10.field2566 = class240.field4106.field2130;
                var10.field2553 = var9;
                var10.field2552 = class240.field4106;
                class82.method545(var10, (byte) 106);
            }
            if (class89.field1384 == 0) {
                if (class234.field3971) {
                    if (class240.field4106.field2213 != null) {
                        class147 var11 = new class147();
                        var11.field2552 = class240.field4106;
                        var11.field2566 = class240.field4106.field2213;
                        var11.field2553 = var9;
                        var11.field2571 = class38.field520;
                        var11.field2557 = var7;
                        class82.method545(var11, (byte) 106);
                    }
                    if (class38.field520 != null && client.method271(class240.field4106) != null) {
                        class229.field3885++;
                        class87.field1348.method672(49, 238);
                        class87.field1348.method775(73, class38.field520.field2222);
                        class87.field1348.method755(-120, class38.field520.field2123);
                        class87.field1348.method755(82, class240.field4106.field2123);
                        class87.field1348.method745(-1529536968, class240.field4106.field2222);
                    }
                } else if ((class242.field4135 == 1 || class142.method972(4096, class109.field1748 - 1)) && class109.field1748 > 2) {
                    class123.method840(11340);
                } else if (class109.field1748 > 0) {
                    class65.method444(125, class109.field1748 - 1);
                }
                class240.field4106 = null;
            }
        } else if (class155.field2706 > 1) {
            class240.field4106 = null;
        }
    }
}
