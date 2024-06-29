import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class22 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lid;")
    private static class149 field307 = class60.method382("Loading)3)3)3", (byte) 21);

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lid;")
    public static class149 field312 = field307;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field313 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Z")
    public static volatile boolean field308 = false;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Lid;")
    public static class149 field317 = class60.method382("Monde de jeu cr-B-B", (byte) 31);

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lbe;")
    public static class28 field311 = new class28(5000);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lal;")
    public static class230 field315;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method125(int arg0) {
        for (int var1 = 0; var1 < class162.field3013; var1++) {
            int var2 = class255.field4462[var1];
            class20 var3 = class38.field572[var2];
            int var4 = class11.field150.method489((byte) 98);
            if ((var4 & 0x8) != 0) {
                var4 += class11.field150.method489((byte) -19) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class11.field150.method489((byte) -85);
                int var6 = class11.field150.method487((byte) -80);
                var3.method924(var5, class118.field2022, 26, var6);
                var3.field2309 = class118.field2022 + 300;
                var3.field2375 = class11.field150.method522(128);
            }
            if ((var4 & 0x2) != 0) {
                int var7 = class11.field150.method487((byte) -80);
                int var8 = class11.field150.method522(128);
                var3.method924(var7, class118.field2022, 68, var8);
            }
            if ((var4 & 0x10) != 0) {
                int var9 = class11.field150.method485(-2386);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class11.field150.method489((byte) -127);
                class116.method809(var10, var9, (byte) -66, var3);
            }
            if ((var4 & 0x4) != 0) {
                var3.field2399 = class11.field150.method484((byte) 22);
                if (var3.field2399 == 65535) {
                    var3.field2399 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                boolean var11 = true;
                int var12 = class11.field150.method484((byte) 22);
                int var13 = class11.field150.method482(4);
                if (var12 == 65535) {
                    var12 = -1;
                }
                if (var12 != -1 && var3.field2353 != -1 && class69.method436(class200.method1374(-17177, var12).field5130, -32).field3036 < class69.method436(class200.method1374(-17177, var3.field2353).field5130, -32).field3036) {
                    var11 = false;
                }
                if (var11) {
                    var3.field2353 = var12;
                    var3.field2359 = 0;
                    var3.field2326 = 0;
                    var3.field2394 = 1;
                    var3.field2315 = class118.field2022 + (var13 & 0xFFFF);
                    var3.field2374 = var13 >> 16;
                    if (var3.field2315 > class118.field2022) {
                        var3.field2359 = -1;
                    }
                    if (var3.field2353 != -1 && class118.field2022 == var3.field2315) {
                        int var14 = class200.method1374(-17177, var3.field2353).field5130;
                        if (var14 != -1) {
                            class164 var15 = class69.method436(var14, -32);
                            if (var15 != null && var15.field3035 != null) {
                                class94.method686(var15, var3.field2340, -110, var3.field2347, false, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field296.method372((byte) 31)) {
                    class163.method1197(58, var3);
                }
                var3.method115((byte) -51, class98.method712(class11.field150.method491((byte) -111), -128));
                var3.method925(0, var3.field296.field1049);
                var3.field2342 = var3.field296.field1027;
                if (var3.field296.method372((byte) 26)) {
                    class185.method1275(var3.field2400[0], (class268) null, 128, class277.field4948, (class127) null, var3.field2333[0], var3, 0);
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field2337 = class11.field150.method529(-1);
                var3.field2387 = 100;
            }
            if ((var4 & 0x100) != 0) {
                int var16 = class11.field150.method487((byte) -80);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = class11.field150.method491((byte) -91);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var18[var20] = class11.field150.method522(128);
                    var19[var20] = class11.field150.method485(-2386);
                }
                class259.method1781(var3, var18, 0, var19, var17);
            }
            if ((var4 & 0x200) != 0) {
                var3.field2392 = class11.field150.method484((byte) 22);
                var3.field2352 = class11.field150.method485(-2386);
            }
        }
        field314++;
        if (arg0 >= -122) {
            field311 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method126(byte arg0) {
        class71.field1243.method1291(0);
        field309++;
        class103.field1802.method1291(0);
        int var1 = -42 % ((-arg0 - 54) / 49);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public static final int method127(int arg0, int arg1) {
        field316++;
        if (arg0 < 0) {
            return 0;
        }
        class19 var2 = (class19) class10.field135.method639((byte) -26, (long) arg0);
        if (var2 == null) {
            return class222.method1499((byte) 69, arg0).field4337;
        }
        int var3 = 0;
        int var4 = 0;
        if (arg1 >= -43) {
            method126((byte) -100);
        }
        while (var4 < var2.field290.length) {
            if (var2.field290[var4] == -1) {
                var3++;
            }
            var4++;
        }
        return var3 + (class222.method1499((byte) 69, arg0).field4337 - var2.field290.length);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static final void method128(boolean arg0) {
        if (arg0) {
            class261.field4664 = class102.field1798;
            class189.field3393 = class54.field973;
        } else {
            class261.field4664 = class31.field465;
            class189.field3393 = class211.field3759;
        }
        class62.field1114 = class261.field4664.length;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static void method129(byte arg0) {
        field315 = null;
        field307 = null;
        field311 = null;
        field312 = null;
        field317 = null;
        if (arg0 != -127) {
            method129((byte) -45);
        }
    }
}
