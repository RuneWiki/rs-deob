import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class118 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lqd;")
    public static class40 field1998 = class147.method1106("sch-Utteln:", (byte) -98);

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field2003 = 0;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lqd;")
    private static class40 field2005 = class147.method1106("Connection lost)3", (byte) -91);

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lqd;")
    private static class40 field2004 = class147.method1106(" has logged in)3", (byte) -113);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lqd;")
    public static class40 field1997 = field2005;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Lqd;")
    public static class40 field2007 = field2004;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lhi;")
    public static class282 field2000 = new class282();

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
    public static int[] field2001;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V", line = 9)
    public static final void method887(int arg0, byte arg1) {
        class309.field5183.method1348(0, arg0);
        field1999++;
        int var2 = 71 % ((arg1 + 61) / 60);
        class2.field19.method1348(0, arg0);
        class150.field2507.method1348(0, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I", line = 26)
    public static final int method888(int arg0, int arg1, int arg2) {
        field2006++;
        class164 var3 = (class164) class48.field934.method1405((byte) 115, (long) arg1);
        if (var3 == null) {
            return -1;
        } else {
            int var4 = -126 % ((-arg0 - 35) / 34);
            return arg2 >= 0 && arg2 < var3.field2717.length ? var3.field2717[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V", line = 49)
    public static final void method889(int arg0, int arg1) {
        field1996++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class159.field2652[arg1];
        int var3 = (int) class50.field958[arg1];
        long var4 = class50.field958[arg1];
        int var6 = class197.field3169[arg1];
        int var7 = class288.field4832[arg1];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 10) {
            class254.field4213++;
            boolean var8 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var2, var6, 2, false, 0, 0, 0, class255.field4233.field1532[0]);
            if (!var8) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var2, var6, 2, false, 0, 0, 1, class255.field4233.field1532[0]);
            }
            class233.field3845 = 0;
            class274.field4545 = class62.field1171;
            class294.field4940 = 2;
            class43.field814 = class128.field2208;
            class19.field295.method1464(232, 0);
            class19.field295.method209(16711680, class263.field4407 + var6);
            class19.field295.method245((byte) 69, class196.field3152 + var2);
            class19.field295.method202(var3, 49);
        }
        if (var7 == 15) {
            class19.field295.method1464(102, 0);
            class19.field295.method202(var3, arg0 + 49);
            class19.field295.method191(var2, -1);
            class19.field295.method196(-62, var6);
            class256.field4264++;
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) 81, var6);
            class268.field4476 = var2;
        }
        if (var7 == 49 && class37.method314(var4, var2, var6, arg0 - 981901216)) {
            class293.field4901++;
            class19.field295.method1464(250, 0);
            class19.field295.method191(class235.field3856, -1);
            class19.field295.method202(var6 + class263.field4407, 49);
            class19.field295.method202(class196.field3152 + var2, 49);
            class19.field295.method191(Integer.MAX_VALUE & (int) (var4 >>> 32), -1);
            class19.field295.method200(class83.field1440, (byte) -117);
        }
        if (var7 == 1) {
            class258 var10 = class298.field4979[var3];
            if (var10 != null) {
                class174.field2827++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var10.field1489[0], var10.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class233.field3845 = 0;
                class294.field4940 = 2;
                class274.field4545 = class62.field1171;
                class43.field814 = class128.field2208;
                class19.field295.method1464(108, 0);
                class19.field295.method202(var3, 49);
            }
        }
        if (var7 == 30) {
            class274.field4540++;
            class19.field295.method1464(229, 0);
            class19.field295.method191(var2, -1);
            class19.field295.method196(arg0 ^ 0x7F, var6);
            class19.field295.method209(16711680, var3);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) -123, var6);
            class268.field4476 = var2;
        }
        if (var7 == 34) {
            class19.field295.method1464(124, 0);
            class19.field295.method239((byte) -105, var6);
            class213 var11 = class314.method2172((byte) -125, var6);
            if (var11.field3505 != null && var11.field3505[0][0] == 5) {
                int var12 = var11.field3505[0][1];
                class192.field3098[var12] = 1 - class192.field3098[var12];
                class207.method1463(var12, (byte) 96);
            }
            class81.field1431++;
        }
        if (var7 == 36) {
            class193.field3105++;
            class19.field295.method1464(217, 0);
            class19.field295.method196(89, var6);
            class19.field295.method209(16711680, var2);
            class19.field295.method202(var3, 49);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) -124, var6);
            class268.field4476 = var2;
        }
        if (var7 == 46) {
            class43.method395(true);
        }
        if (var7 == 51) {
            class19.field295.method1464(83, 0);
            class19.field295.method221(var6, 255);
            class19.field295.method202(var2, 49);
            class285.field4797++;
            class19.field295.method209(arg0 + 16711680, var3);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) -115, var6);
            class268.field4476 = var2;
        }
        if (var7 == 24) {
            class83.field1446++;
            class37.method314(var4, var2, var6, -981901216);
            class19.field295.method1464(5, arg0 ^ 0x0);
            class19.field295.method202(var6 + class263.field4407, 49);
            class19.field295.method191(Integer.MAX_VALUE & (int) (var4 >>> 32), -1);
            class19.field295.method245((byte) 69, var2 + class196.field3152);
        }
        if (var7 == 5) {
            class258 var13 = class298.field4979[var3];
            if (var13 != null) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var13.field1489[0], var13.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class294.field4940 = 2;
                class43.field814 = class128.field2208;
                class274.field4545 = class62.field1171;
                class220.field3662++;
                class233.field3845 = 0;
                class19.field295.method1464(207, 0);
                class19.field295.method221(class10.field168, 255);
                class19.field295.method245((byte) 69, var3);
                class19.field295.method245((byte) 69, class9.field147);
                class19.field295.method209(16711680, class88.field1594);
            }
        }
        if (var7 == 26) {
            class42 var14 = class91.field1656[var3];
            if (var14 != null) {
                class265.field4437++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var14.field1489[0], var14.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class43.field814 = class128.field2208;
                class294.field4940 = 2;
                class233.field3845 = 0;
                class274.field4545 = class62.field1171;
                class19.field295.method1464(128, 0);
                class19.field295.method200(class10.field168, (byte) -124);
                class19.field295.method191(class88.field1594, -1);
                class19.field295.method209(16711680, var3);
                class19.field295.method191(class9.field147, -1);
            }
        }
        if (var7 == 8) {
            class213 var15 = class211.method1483(var2, var6, -17970);
            if (var15 != null) {
                class43.method392(-376);
                class185.method1343(var2, class22.method168(client.method1720(var15), arg0 - 1556662293), (byte) 126, var6);
                class274.field4566 = 0;
                class277.field4638 = class135.method1002(var15, arg0 ^ 0x0);
                if (class277.field4638 == null) {
                    class277.field4638 = client.field4042;
                }
                if (var15.field3520) {
                    class300.field5012 = class153.method1192(new class40[] { var15.field3535, class165.field2736 }, (byte) -121);
                } else {
                    class300.field5012 = class153.method1192(new class40[] { class3.field29, var15.field3492, class165.field2736 }, (byte) -49);
                }
            }
            return;
        }
        if (var7 == 17) {
            class42 var16 = class91.field1656[var3];
            if (var16 != null) {
                class162.field2698++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var16.field1489[0], var16.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class294.field4940 = 2;
                class43.field814 = class128.field2208;
                class233.field3845 = 0;
                class274.field4545 = class62.field1171;
                class19.field295.method1464(85, 0);
                class19.field295.method245((byte) 69, var3);
            }
        }
        if (var7 == 29 && class41.field792 == null) {
            class306.method2090(var6, 46, var2);
            class41.field792 = class211.method1483(var2, var6, -17970);
            class25.method188(0, class41.field792);
        }
        if (var7 == 9) {
            class19.field295.method1464(213, 0);
            class236.field3880++;
            class19.field295.method209(16711680, var2);
            class19.field295.method196(arg0 ^ 0xFFFFFF80, var6);
            class19.field295.method202(var3, 49);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) -123, var6);
            class268.field4476 = var2;
        }
        if (var7 == 1004) {
            class37.method314(var4, var2, var6, -981901216);
            class19.field295.method1464(148, 0);
            class172.field2812++;
            class19.field295.method191(class263.field4407 + var6, -1);
            class19.field295.method209(16711680, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class19.field295.method202(var2 + class196.field3152, 49);
        }
        if (var7 == 4) {
            class258 var17 = class298.field4979[var3];
            if (var17 != null) {
                class244.field4039++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var17.field1489[0], var17.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class43.field814 = class128.field2208;
                class294.field4940 = 2;
                class233.field3845 = 0;
                class274.field4545 = class62.field1171;
                class19.field295.method1464(52, 0);
                class19.field295.method209(16711680, var3);
            }
        }
        if (var7 == 44) {
            class258 var18 = class298.field4979[var3];
            if (var18 != null) {
                class251.field4169++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var18.field1489[0], var18.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class294.field4940 = 2;
                class43.field814 = class128.field2208;
                class274.field4545 = class62.field1171;
                class233.field3845 = 0;
                class19.field295.method1464(185, arg0 ^ 0x0);
                class19.field295.method191(var3, -1);
            }
        }
        if (var7 == 1007) {
            class43.field814 = class128.field2208;
            class274.field4545 = class62.field1171;
            class294.field4940 = 2;
            class233.field3845 = 0;
            class123.field2129++;
            class19.field295.method1464(57, 0);
            class19.field295.method191(var3, -1);
        }
        if (var7 == 35) {
            class42 var19 = class91.field1656[var3];
            if (var19 != null) {
                class65.field1211++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var19.field1489[0], var19.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class233.field3845 = 0;
                class43.field814 = class128.field2208;
                class274.field4545 = class62.field1171;
                class294.field4940 = 2;
                class19.field295.method1464(173, 0);
                class19.field295.method202(class235.field3856, 49);
                class19.field295.method196(-38, class83.field1440);
                class19.field295.method202(var3, 49);
            }
        }
        if (var7 == 14) {
            class42 var20 = class91.field1656[var3];
            if (var20 != null) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var20.field1489[0], var20.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class294.field4940 = 2;
                class274.field4545 = class62.field1171;
                class233.field3845 = 0;
                class43.field814 = class128.field2208;
                class57.field1090++;
                class19.field295.method1464(231, 0);
                class19.field295.method191(var3, -1);
            }
        }
        if (var7 == 41) {
            class14.field240++;
            class19.field295.method1464(109, 0);
            class19.field295.method202(var2, 49);
            class19.field295.method209(16711680, class235.field3856);
            class19.field295.method239((byte) -21, class83.field1440);
            class19.field295.method191(var3, -1);
            class19.field295.method221(var6, 255);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) -114, var6);
            class268.field4476 = var2;
        }
        if (var7 == 19) {
            class42 var21 = class91.field1656[var3];
            if (var21 != null) {
                class271.field4504++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var21.field1489[0], var21.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class294.field4940 = 2;
                class43.field814 = class128.field2208;
                class233.field3845 = 0;
                class274.field4545 = class62.field1171;
                class19.field295.method1464(235, 0);
                class19.field295.method209(16711680, var3);
            }
        }
        if (var7 == 39) {
            class19.field295.method1464(182, 0);
            class19.field295.method239((byte) -123, var6);
            class19.field295.method202(var2, 49);
            class291.field4868++;
            class19.field295.method245((byte) 69, var3);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) -18, var6);
            class268.field4476 = var2;
        }
        if (var7 == 42) {
            class317.field5370++;
            class37.method314(var4, var2, var6, arg0 ^ 0xC5796060);
            class19.field295.method1464(160, 0);
            class19.field295.method245((byte) 69, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class19.field295.method202(class196.field3152 + var2, 49);
            class19.field295.method245((byte) 69, class263.field4407 + var6);
        }
        if (var7 == 33) {
            class42 var22 = class91.field1656[var3];
            if (var22 != null) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var22.field1489[0], var22.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class233.field3845 = 0;
                class274.field4545 = class62.field1171;
                class43.field814 = class128.field2208;
                class294.field4940 = 2;
                class210.field3355++;
                class19.field295.method1464(112, arg0);
                class19.field295.method245((byte) 69, var3);
            }
        }
        if (var7 == 21) {
            class19.field295.method1464(145, 0);
            class253.field4191++;
            class19.field295.method239((byte) 119, var6);
            class19.field295.method245((byte) 69, var2);
            class19.field295.method239((byte) 100, class83.field1440);
            class19.field295.method191(class235.field3856, -1);
        }
        if (var7 == 1005) {
            class274.field4545 = class62.field1171;
            class233.field3845 = 0;
            class294.field4940 = 2;
            class257.field4284++;
            class43.field814 = class128.field2208;
            class19.field295.method1464(245, 0);
            class19.field295.method191(var3, -1);
        }
        if (var7 == 38) {
            class43.method392(-376);
            class213 var23 = class314.method2172((byte) 25, var6);
            class10.field168 = var6;
            class88.field1594 = var3;
            class274.field4566 = 1;
            class9.field147 = var2;
            class25.method188(0, var23);
            class3.field27 = class153.method1192(new class40[] { class299.field5005, class165.method1243(-33, var3).field4628, class165.field2736 }, (byte) 124);
            if (class3.field27 == null) {
                class3.field27 = class148.field2490;
            }
            return;
        }
        if (var7 == 1001) {
            class213 var24 = class314.method2172((byte) -1, var6);
            if (var24 == null || var24.field3471[var2] < 100000) {
                class19.field295.method1464(57, arg0 ^ 0x0);
                class19.field295.method191(var3, -1);
                class123.field2129++;
            } else {
                class303.method2071(class264.field4421, 52, 0, class153.method1192(new class40[] { class276.method1927((byte) -83, var24.field3471[var2]), class188.field3054, class165.method1243(arg0 - 24, var3).field4628 }, (byte) -44));
            }
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) 50, var6);
            class268.field4476 = var2;
        }
        if (var7 == 47) {
            class258 var25 = class298.field4979[var3];
            if (var25 != null) {
                class300.field5013++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var25.field1489[0], var25.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class274.field4545 = class62.field1171;
                class233.field3845 = 0;
                class43.field814 = class128.field2208;
                class294.field4940 = 2;
                class19.field295.method1464(133, 0);
                class19.field295.method191(var3, -1);
            }
        }
        if (var7 == 50) {
            class45.field870++;
            boolean var26 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var2, var6, 2, false, 0, 0, 0, class255.field4233.field1532[0]);
            if (!var26) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var2, var6, 2, false, 0, 0, 1, class255.field4233.field1532[0]);
            }
            class43.field814 = class128.field2208;
            class233.field3845 = 0;
            class294.field4940 = 2;
            class274.field4545 = class62.field1171;
            class19.field295.method1464(158, 0);
            class19.field295.method202(class263.field4407 + var6, 49);
            class19.field295.method191(class196.field3152 + var2, -1);
            class19.field295.method245((byte) 69, var3);
        }
        if (var7 == 3) {
            boolean var28 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var2, var6, 2, false, 0, 0, 0, class255.field4233.field1532[0]);
            class135.field2292++;
            if (!var28) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var2, var6, 2, false, 0, 0, 1, class255.field4233.field1532[0]);
            }
            class274.field4545 = class62.field1171;
            class294.field4940 = 2;
            class233.field3845 = 0;
            class43.field814 = class128.field2208;
            class19.field295.method1464(203, 0);
            class19.field295.method209(arg0 ^ 0xFF0000, class196.field3152 + var2);
            class19.field295.method209(16711680, class263.field4407 + var6);
            class19.field295.method245((byte) 69, var3);
        }
        if (var7 == 43) {
            class170.field2793++;
            boolean var30 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var2, var6, 2, false, 0, 0, 0, class255.field4233.field1532[0]);
            if (!var30) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var2, var6, 2, false, 0, 0, 1, class255.field4233.field1532[0]);
            }
            class294.field4940 = 2;
            class43.field814 = class128.field2208;
            class233.field3845 = 0;
            class274.field4545 = class62.field1171;
            class19.field295.method1464(152, 0);
            class19.field295.method209(arg0 + 16711680, var3);
            class19.field295.method245((byte) 69, class263.field4407 + var6);
            class19.field295.method209(16711680, var2 + class196.field3152);
        }
        if (var7 == 23) {
            class19.field295.method1464(124, 0);
            class19.field295.method239((byte) 126, var6);
            class213 var32 = class314.method2172((byte) -120, var6);
            class81.field1431++;
            if (var32.field3505 != null && var32.field3505[0][0] == 5) {
                int var33 = var32.field3505[0][1];
                if (class192.field3098[var33] != var32.field3508[0]) {
                    class192.field3098[var33] = var32.field3508[0];
                    class207.method1463(var33, (byte) 88);
                }
            }
        }
        if (var7 == 18) {
            class19.field295.method1464(170, 0);
            class221.field3677++;
            class19.field295.method245((byte) 69, var3);
            class19.field295.method245((byte) 69, var2);
            class19.field295.method196(86, var6);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) 103, var6);
            class268.field4476 = var2;
        }
        if (var7 == 31) {
            class258 var34 = class298.field4979[var3];
            if (var34 != null) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var34.field1489[0], var34.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class294.field4940 = 2;
                class43.field814 = class128.field2208;
                class274.field4545 = class62.field1171;
                class233.field3845 = 0;
                class19.field295.method1464(25, 0);
                class105.field1851++;
                class19.field295.method191(var3, ~arg0);
            }
        }
        if (var7 == 28) {
            class105.field1850++;
            class19.field295.method1464(135, 0);
            class19.field295.method196(-80, var6);
            class19.field295.method202(var3, arg0 ^ 0x31);
            class19.field295.method245((byte) 69, var2);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) 95, var6);
            class268.field4476 = var2;
        }
        if (var7 == 32) {
            class286.method1990(class160.field2671, var2, var6);
        }
        if (var7 == 25) {
            class23.field401 = true;
            class286.method1990(class160.field2671, var2, var6);
        }
        if (var7 == 22) {
            boolean var35 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var2, var6, 2, false, 0, 0, 0, class255.field4233.field1532[0]);
            if (!var35) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var2, var6, 2, false, 0, 0, 1, class255.field4233.field1532[0]);
            }
            class294.field4940 = 2;
            class43.field814 = class128.field2208;
            class233.field3845 = 0;
            class274.field4545 = class62.field1171;
            class275.field4587++;
            class19.field295.method1464(195, 0);
            class19.field295.method245((byte) 69, class263.field4407 + var6);
            class19.field295.method209(16711680, class196.field3152 + var2);
            class19.field295.method191(var3, ~arg0);
        }
        if (var7 == 40 || var7 == 1002) {
            class254.method1783(var3, (byte) -102, class3.field37[arg1], var2, var6);
        }
        if (var7 == 57) {
            class19.field295.method1464(90, arg0 ^ 0x0);
            class19.field295.method200(var6, (byte) -109);
            class19.field295.method202(var2, 49);
            class251.field4166++;
            class19.field295.method209(16711680, var3);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) 94, var6);
            class268.field4476 = var2;
        }
        if (var7 == 13) {
            class42 var37 = class91.field1656[var3];
            if (var37 != null) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var37.field1489[0], var37.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class294.field4940 = 2;
                class274.field4545 = class62.field1171;
                class43.field814 = class128.field2208;
                class122.field2118++;
                class233.field3845 = 0;
                class19.field295.method1464(29, arg0);
                class19.field295.method191(var3, -1);
            }
        }
        if (var7 == 58) {
            class213 var38 = class314.method2172((byte) 5, var6);
            boolean var39 = true;
            if (var38.field3510 > 0) {
                var39 = class93.method707((byte) 51, var38);
            }
            if (var39) {
                class81.field1431++;
                class19.field295.method1464(124, 0);
                class19.field295.method239((byte) -97, var6);
            }
        }
        if (var7 == 59) {
            class258 var40 = class298.field4979[var3];
            if (var40 != null) {
                class192.field3095++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var40.field1489[0], var40.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class233.field3845 = 0;
                class274.field4545 = class62.field1171;
                class43.field814 = class128.field2208;
                class294.field4940 = 2;
                class19.field295.method1464(230, 0);
                class19.field295.method202(var3, 49);
            }
        }
        if (var7 == 6) {
            class258 var41 = class298.field4979[var3];
            if (var41 != null) {
                class315.field5337++;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var41.field1489[0], var41.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class233.field3845 = 0;
                class294.field4940 = 2;
                class274.field4545 = class62.field1171;
                class43.field814 = class128.field2208;
                class19.field295.method1464(137, 0);
                class19.field295.method209(16711680, var3);
            }
        }
        if (var7 == 1003) {
            class43.field814 = class128.field2208;
            class294.field4940 = 2;
            class274.field4545 = class62.field1171;
            class233.field3845 = 0;
            class42 var42 = class91.field1656[var3];
            if (var42 != null) {
                class121 var43 = var42.field796;
                if (var43.field2098 != null) {
                    var43 = var43.method918(-1);
                }
                if (var43 != null) {
                    class19.field295.method1464(208, 0);
                    class19.field295.method191(var43.field2048, -1);
                    class95.field1710++;
                }
            }
        }
        if (var7 == 11) {
            class8.field125++;
            class19.field295.method1464(214, 0);
            class19.field295.method209(arg0 ^ 0xFF0000, var2);
            class19.field295.method245((byte) 69, class88.field1594);
            class19.field295.method245((byte) 69, class9.field147);
            class19.field295.method221(class10.field168, 255);
            class19.field295.method221(var6, 255);
            class19.field295.method245((byte) 69, var3);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) -112, var6);
            class268.field4476 = var2;
        }
        if (var7 == 7) {
            class105.field1852++;
            class19.field295.method1464(196, arg0 ^ 0x0);
            class19.field295.method209(16711680, var2);
            class19.field295.method221(var6, 255);
            class19.field295.method202(var3, 49);
            class37.field695 = 0;
            class254.field4228 = class314.method2172((byte) -126, var6);
            class268.field4476 = var2;
        }
        if (var7 == 12) {
            class258 var44 = class298.field4979[var3];
            if (var44 != null) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var44.field1489[0], var44.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class294.field4940 = 2;
                class43.field814 = class128.field2208;
                class274.field4545 = class62.field1171;
                class233.field3845 = 0;
                class202.field3202++;
                class19.field295.method1464(115, 0);
                class19.field295.method200(class83.field1440, (byte) -121);
                class19.field295.method209(16711680, class235.field3856);
                class19.field295.method191(var3, ~arg0);
            }
        }
        if (var7 == 45) {
            class302.field5065++;
            boolean var45 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var2, var6, 2, false, 0, 0, 0, class255.field4233.field1532[0]);
            if (!var45) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var2, var6, 2, false, 0, 0, 1, class255.field4233.field1532[0]);
            }
            class294.field4940 = 2;
            class233.field3845 = 0;
            class274.field4545 = class62.field1171;
            class43.field814 = class128.field2208;
            class19.field295.method1464(43, 0);
            class19.field295.method209(16711680, class88.field1594);
            class19.field295.method245((byte) 69, var3);
            class19.field295.method209(16711680, class9.field147);
            class19.field295.method221(class10.field168, 255);
            class19.field295.method202(var6 + class263.field4407, 49);
            class19.field295.method209(arg0 + 16711680, var2 - -class196.field3152);
        }
        if (var7 == 48) {
            class37.method314(var4, var2, var6, -981901216);
            class60.field1146++;
            class19.field295.method1464(220, 0);
            class19.field295.method191(Integer.MAX_VALUE & (int) (var4 >>> 32), -1);
            class19.field295.method202(class263.field4407 + var6, 49);
            class19.field295.method245((byte) 69, class196.field3152 + var2);
        }
        if (var7 == 37) {
            class258 var47 = class298.field4979[var3];
            if (var47 != null) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var47.field1489[0], var47.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                class20.field329++;
                class274.field4545 = class62.field1171;
                class294.field4940 = 2;
                class233.field3845 = 0;
                class43.field814 = class128.field2208;
                class19.field295.method1464(172, 0);
                class19.field295.method245((byte) 69, var3);
            }
        }
        if (var7 == 20 && class37.method314(var4, var2, var6, -981901216)) {
            class177.field2919++;
            class19.field295.method1464(234, 0);
            class19.field295.method209(16711680, class9.field147);
            class19.field295.method245((byte) 69, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class19.field295.method191(class263.field4407 + var6, -1);
            class19.field295.method202(class88.field1594, 49);
            class19.field295.method200(class10.field168, (byte) -77);
            class19.field295.method202(class196.field3152 + var2, 49);
        }
        if (var7 == 16) {
            class286.field4815++;
            boolean var48 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var2, var6, 2, false, 0, 0, 0, class255.field4233.field1532[0]);
            if (!var48) {
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var2, var6, 2, false, 0, 0, 1, class255.field4233.field1532[0]);
            }
            class233.field3845 = 0;
            class274.field4545 = class62.field1171;
            class294.field4940 = 2;
            class43.field814 = class128.field2208;
            class19.field295.method1464(209, 0);
            class19.field295.method202(class196.field3152 + var2, 49);
            class19.field295.method245((byte) 69, class263.field4407 + var6);
            class19.field295.method209(16711680, var3);
            class19.field295.method196(-85, class83.field1440);
            class19.field295.method202(class235.field3856, 49);
        }
        if (var7 == 2) {
            class37.method314(var4, var2, var6, arg0 - 981901216);
            class19.field295.method1464(33, arg0 ^ 0x0);
            class19.field295.method191(class196.field3152 + var2, -1);
            class19.field295.method191(class263.field4407 + var6, ~arg0);
            class132.field2242++;
            class19.field295.method245((byte) 69, (int) (var4 >>> 32) & Integer.MAX_VALUE);
        }
        if (class274.field4566 != arg0) {
            class274.field4566 = 0;
            class25.method188(0, class314.method2172((byte) -110, class10.field168));
        }
        if (class274.field4549) {
            class43.method392(-376);
        }
        if (class254.field4228 != null && class37.field695 == 0) {
            class25.method188(0, class254.field4228);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lsd;I)Lp;", line = 1019)
    public static final class94 method890(class26 arg0, int arg1) {
        field2008++;
        class94 var2 = new class94();
        var2.field1697 = arg0.method197(-1);
        int var3 = 50 / ((arg1 + 6) / 44);
        var2.field1694 = class68.method531(var2.field1697, 32767);
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZILqd;)V", line = 1037)
    public static final void method891(boolean arg0, int arg1, class40 arg2) {
        field1995++;
        short[] var3 = new short[16];
        class40 var4 = arg2.method337(40);
        int var5 = arg1;
        for (int var6 = 0; var6 < class288.field4835; var6++) {
            class277 var7 = class165.method1243(-20, var6);
            if ((!arg0 || var7.field4683) && var7.field4648 == -1 && var7.field4641 == -1 && var7.field4680 == 0 && var7.field4628.method337(40).method358(arg1 - 118, var4) != -1) {
                if (var5 >= 250) {
                    class101.field1781 = -1;
                    class244.field4019 = null;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        class101.field1781 = var5;
        class244.field4019 = var3;
        class40[] var10 = new class40[class101.field1781];
        class68.field1252 = 0;
        for (int var11 = 0; var11 < class101.field1781; var11++) {
            var10[var11] = class165.method1243(-63, var3[var11]).field4628;
        }
        class93.method706(var10, class244.field4019, -127);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 1112)
    public static void method892(byte arg0) {
        field2007 = null;
        field2004 = null;
        field2005 = null;
        field1998 = null;
        int var1 = -94 / ((-arg0 - 38) / 40);
        field1997 = null;
        field2001 = null;
        field2000 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Z", line = 1130)
    public static final boolean method893(int arg0) {
        field2009++;
        if (class21.field350) {
            return true;
        } else {
            if (arg0 != 2) {
                field2002 = -59;
            }
            return class254.field4211;
        }
    }
}
