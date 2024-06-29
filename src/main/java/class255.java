import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class255 extends class35 {

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "[I")
    public static int[] field3788 = new int[32];

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "[[S")
    public static short[][] field3786 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lng;")
    public static class153 field3783;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([IB[Ljava/lang/Object;)V", line = 4)
    public static final void method1683(int[] arg0, byte arg1, Object[] arg2) {
        field3782++;
        int var3 = 21 / ((arg1 - 44) / 60);
        class29.method251(arg0.length - 1, arg2, arg0, false, 0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 15)
    public static void method1684(byte arg0) {
        field3783 = null;
        field3788 = null;
        field3786 = null;
        int var1 = 38 / ((arg0 - 25) / 45);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V", line = 26)
    public static final void method1685(byte arg0) {
        class400 var1 = class269.field3975;
        synchronized (class269.field3975) {
            class269.field3975.method2388(-43);
            int var2 = -114 % ((39 - arg0) / 60);
        }
        field3784++;
        class400 var3 = class452.field6417;
        synchronized (class452.field6417) {
            class452.field6417.method2388(-124);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V", line = 51)
    public static final void method1686() {
        class330.field4952 = 0;
        label191: for (int var0 = 0; var0 < class387.field5713; var0++) {
            class27 var1 = class454.field6460[var0];
            if (class351.field5355 != null) {
                for (int var2 = 0; var2 < class351.field5355.length; var2++) {
                    if (class351.field5355[var2] != -1000000 && (var1.field351 <= class351.field5355[var2] || var1.field359 <= class351.field5355[var2]) && (var1.field340 <= class144.field2043[var2] || var1.field345 <= class144.field2043[var2]) && (var1.field340 >= class456.field6482[var2] || var1.field345 >= class456.field6482[var2]) && (var1.field350 <= class422.field6047[var2] || var1.field337 <= class422.field6047[var2]) && (var1.field350 >= class65.field902[var2] || var1.field337 >= class65.field902[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field349 == 1) {
                int var3 = var1.field355 + class281.field4243 - class307.field4577;
                if (var3 >= 0 && var3 <= class281.field4243 + class281.field4243) {
                    int var4 = var1.field347 + class281.field4243 - class386.field5702;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field343 + class281.field4243 - class386.field5702;
                    if (var5 > class281.field4243 + class281.field4243) {
                        var5 = class281.field4243 + class281.field4243;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class206.field3116[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class100.field1420 - var1.field340;
                        if (var7 > class75.field1053) {
                            var1.field353 = 1;
                        } else {
                            if (var7 >= -class75.field1053) {
                                continue;
                            }
                            var1.field353 = 2;
                            var7 = -var7;
                        }
                        var1.field342 = (var1.field350 - class208.field3132 << 8) / var7;
                        var1.field348 = (var1.field337 - class208.field3132 << 8) / var7;
                        var1.field339 = (var1.field351 - class400.field5855 << 8) / var7;
                        var1.field354 = (var1.field359 - class400.field5855 << 8) / var7;
                        class414.field5971[class330.field4952++] = var1;
                    }
                }
            } else if (var1.field349 == 2) {
                int var8 = var1.field347 + class281.field4243 - class386.field5702;
                if (var8 >= 0 && var8 <= class281.field4243 + class281.field4243) {
                    int var9 = var1.field355 + class281.field4243 - class307.field4577;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field356 + class281.field4243 - class307.field4577;
                    if (var10 > class281.field4243 + class281.field4243) {
                        var10 = class281.field4243 + class281.field4243;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class206.field3116[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class208.field3132 - var1.field350;
                        if (var12 > class75.field1053) {
                            var1.field353 = 3;
                        } else {
                            if (var12 >= -class75.field1053) {
                                continue;
                            }
                            var1.field353 = 4;
                            var12 = -var12;
                        }
                        var1.field338 = (var1.field340 - class100.field1420 << 8) / var12;
                        var1.field344 = (var1.field345 - class100.field1420 << 8) / var12;
                        var1.field339 = (var1.field351 - class400.field5855 << 8) / var12;
                        var1.field354 = (var1.field359 - class400.field5855 << 8) / var12;
                        class414.field5971[class330.field4952++] = var1;
                    }
                }
            } else if (var1.field349 == 4) {
                int var13 = var1.field351 - class400.field5855;
                if (var13 > class75.field1058) {
                    int var14 = var1.field347 + class281.field4243 - class386.field5702;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field343 + class281.field4243 - class386.field5702;
                    if (var15 > class281.field4243 + class281.field4243) {
                        var15 = class281.field4243 + class281.field4243;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field355 + class281.field4243 - class307.field4577;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field356 + class281.field4243 - class307.field4577;
                        if (var17 > class281.field4243 + class281.field4243) {
                            var17 = class281.field4243 + class281.field4243;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class206.field3116[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field353 = 5;
                            var1.field338 = (var1.field340 - class100.field1420 << 8) / var13;
                            var1.field344 = (var1.field345 - class100.field1420 << 8) / var13;
                            var1.field342 = (var1.field350 - class208.field3132 << 8) / var13;
                            var1.field348 = (var1.field337 - class208.field3132 << 8) / var13;
                            class414.field5971[class330.field4952++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 273)
    public static final void method1687(int arg0) {
        field3785++;
        if (class123.field1698 != null || arg0 != 768) {
            return;
        }
        Container var1;
        if (class316.field4749 == null) {
            var1 = class21.field261.field2125;
        } else {
            var1 = class316.field4749;
        }
        class297.field4450 = var1.getSize().width;
        class321.field4794 = var1.getSize().height;
        if (class316.field4749 == var1) {
            Insets var2 = class316.field4749.getInsets();
            class321.field4794 -= var2.top + var2.bottom;
            class297.field4450 -= var2.right + var2.left;
        }
        if (class419.method2487((byte) -66) == 1) {
            class233.field3411 = class4.field86;
            class73.field979 = (class297.field4450 - class356.field5401) / 2;
            class433.field6157 = 0;
            class342.field5115 = class356.field5401;
        } else if (class45.field646 < 96 && class170.field2424 == 0) {
            int var3 = class297.field4450 <= 1024 ? class297.field4450 : 1024;
            class73.field979 = (class297.field4450 - var3) / 2;
            int var4 = class321.field4794 > 768 ? 768 : class321.field4794;
            class342.field5115 = var3;
            class233.field3411 = var4;
            class433.field6157 = 0;
        } else {
            class433.field6157 = 0;
            class73.field979 = 0;
            class233.field3411 = class321.field4794;
            class342.field5115 = class297.field4450;
        }
        if (class150.field2114 != class103.field1445) {
            boolean var10000;
            if (class342.field5115 < 1024 && class233.field3411 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class378.field5618.setSize(class342.field5115, class233.field3411);
        if (class138.field1976 != null) {
            class138.field1976.method546();
        }
        if (class316.field4749 == var1) {
            Insets var5 = class316.field4749.getInsets();
            class378.field5618.setLocation(class73.field979 + var5.left, class433.field6157 + var5.top);
        } else {
            class378.field5618.setLocation(class73.field979, class433.field6157);
        }
        if (class279.field4220 != -1) {
            class355.method2187(true, -1);
        }
        class188.method1300(true);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V", line = 376)
    public class255(int arg0, int arg1) {
        this.field3789 = arg0;
        this.field3787 = arg1;
    }
}
