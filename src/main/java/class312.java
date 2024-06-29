import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class312 {

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
    public static int[] field4829 = new int[2];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[[I")
    public static int[][] field4826;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBZI)I", line = 6)
    public static final int method2187(int arg0, byte arg1, boolean arg2, int arg3) {
        int var4 = 89 / ((47 - arg1) / 40);
        field4832++;
        class286 var5 = (class286) class229.field3337.method1537((long) arg3, -22708);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field4498.length; var7++) {
            if (var5.field4498[var7] >= 0 && var5.field4498[var7] < class342.field5316) {
                class93 var8 = class60.method353(var5.field4498[var7], (byte) -71);
                if (var8.field1211 != null) {
                    class172 var9 = (class172) var8.field1211.method1537((long) arg0, -22708);
                    if (var9 != null) {
                        if (arg2) {
                            var6 += var5.field4502[var7] * var9.field2483;
                        } else {
                            var6 += var9.field2483;
                        }
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V", line = 55)
    public static final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4825++;
        int var5 = arg0;
        int var6 = 0;
        int var7 = -arg3;
        int var8 = arg3;
        int var9 = class140.method930(24918, arg2 + arg3, class56.field678, class109.field1494);
        int var10 = class140.method930(24918, arg2 - arg3, class56.field678, class109.field1494);
        class279.method1997(var9, -824384948, var10, arg4, class206.field2886[arg1]);
        while (var6 < var8) {
            var5 += 2;
            var7 += var5;
            if (var7 > 0) {
                var8--;
                var7 -= var8 << 1;
                int var11 = arg1 - var8;
                int var12 = arg1 + var8;
                if (var12 >= class272.field4273 && var11 <= class248.field3759) {
                    int var13 = class140.method930(24918, arg2 + var6, class56.field678, class109.field1494);
                    int var14 = class140.method930(24918, arg2 - var6, class56.field678, class109.field1494);
                    if (var12 <= class248.field3759) {
                        class279.method1997(var13, arg0 - 824384947, var14, arg4, class206.field2886[var12]);
                    }
                    if (class272.field4273 <= var11) {
                        class279.method1997(var13, -824384948, var14, arg4, class206.field2886[var11]);
                    }
                }
            }
            var6++;
            int var15 = arg1 + var6;
            int var16 = arg1 - var6;
            if (var15 >= class272.field4273 && var16 <= class248.field3759) {
                int var17 = class140.method930(24918, arg2 + var8, class56.field678, class109.field1494);
                int var18 = class140.method930(arg0 + 24919, -var8 + arg2, class56.field678, class109.field1494);
                if (class248.field3759 >= var15) {
                    class279.method1997(var17, -824384948, var18, arg4, class206.field2886[var15]);
                }
                if (var16 >= class272.field4273) {
                    class279.method1997(var17, arg0 - 824384947, var18, arg4, class206.field2886[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 133)
    public static final void method2189(int arg0) {
        field4831++;
        class27.field347.method1237((byte) 62);
        class256.field3897.method1237((byte) 65);
        if (arg0 != 0) {
            method2191(121);
        }
        class134.field1851.method1237((byte) -80);
        client.field4227.method1237((byte) 115);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 147)
    public static final void method2190(int arg0) {
        field4827++;
        if (~class104.field1340 == arg0) {
            if (class49.field609 == class326.field4994 && class43.field508 == class229.field3340) {
                class104.field1340 = 0;
                if (class163.field2247 && class184.field2650[81] && class310.field4794 > 2) {
                    class99.method599(class310.field4794 - 2, (byte) 109);
                } else {
                    class99.method599(class310.field4794 - 1, (byte) 109);
                }
            }
        } else if (class49.field609 == class148.field2055 && class229.field3340 == class224.field3184) {
            class104.field1340 = 0;
            if (class163.field2247 && class184.field2650[81] && class310.field4794 > 2) {
                class99.method599(class310.field4794 - 2, (byte) 109);
            } else {
                class99.method599(class310.field4794 - 1, (byte) 109);
            }
        } else {
            class104.field1340 = 2;
            class326.field4994 = class148.field2055;
            class43.field508 = class224.field3184;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V", line = 198)
    public static void method2191(int arg0) {
        field4829 = null;
        if (arg0 != -32421) {
            method2191(-112);
        }
        field4826 = (int[][]) null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I", line = 213)
    public static int method2192(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Llc;I)V", line = 223)
    public static final void method2193(class175 arg0, int arg1) {
        class275.field4287 = class135.method896(class175.field2506, 0, false, arg0);
        class38.field458 = class15.method105(0, arg0, (byte) -44, class336.field5197);
        class282.field4373 = class15.method105(0, arg0, (byte) -44, class208.field2957);
        class315.field4859 = class15.method105(0, arg0, (byte) -44, class19.field244);
        field4828++;
        class48.field562 = class15.method105(0, arg0, (byte) -44, class162.field2244);
        class141.field1970 = class15.method105(0, arg0, (byte) -44, class325.field4985);
        class239.field3589 = class15.method105(0, arg0, (byte) -44, class91.field1139);
        class5.field82 = class37.method219(arg0, class326.field4992, 896, 0);
        class243.field3658 = class183.method1275(class264.field4157, 0, 31, arg0);
        class289.field4529 = class183.method1275(class264.field4168, 0, 38, arg0);
        class269.field4245 = class343.method2370(class10.field139, 0, arg0, -120);
        class79.field1009 = class343.method2370(class29.field368, 0, arg0, -121);
        class276.field4292.method84(class79.field1009, (int[]) null);
        class179.field2601.method84(class79.field1009, (int[]) null);
        class88.field1097.method84(class79.field1009, (int[]) null);
        if (class250.field3787) {
            class178.field2583 = class97.method590(-37, class130.field1791, 0, arg0);
            for (int var2 = 0; var2 < class178.field2583.length; var2++) {
                class178.field2583[var2].method1651();
            }
        }
        class189 var3 = class165.method1082(class43.field511, (byte) 45, 0, arg0);
        var3.method1307();
        if (class250.field3787) {
            class188.field2711 = new class202(var3);
        } else {
            class188.field2711 = var3;
        }
        class189[] var4 = class135.method896(class25.field340, 0, false, arg0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1307();
        }
        if (class250.field3787) {
            class255.field3888 = new class91[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class255.field3888[var6] = new class202(var4[var6]);
            }
        } else {
            class255.field3888 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class275.field4287.length; var11++) {
            class275.field4287[var11].method1314(var7 + var10, var8 + var10, var9 + var10);
        }
        if (arg1 > -75) {
            field4830 = 125;
        }
        if (class250.field3787) {
            class295.field4606 = new class91[class275.field4287.length];
            for (int var12 = 0; var12 < class275.field4287.length; var12++) {
                class295.field4606[var12] = new class202(class275.field4287[var12]);
            }
        } else {
            class295.field4606 = class275.field4287;
        }
    }
}
