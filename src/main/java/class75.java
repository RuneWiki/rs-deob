import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class75 extends class573 {

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "Z")
    private boolean field906 = false;

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "Lkg;")
    public static class275 field916 = new class275(8, 0, 4, 1);

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!gea", name = "A", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!gea", name = "B", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)V", line = 3)
    public static final void method601(byte arg0) {
        int var1 = -45 / ((30 - arg0) / 56);
        ++field912;
        class148.field2333.method561((byte) -78);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)V", line = 16)
    public final void method602(int arg0, int arg1, int arg2) {
        ++field909;
        if (arg0 != -26427) {
            this.method602(-12, 22, 48);
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V", line = 26)
    public final void method603(boolean arg0) {
        if (!this.field906) {
            super.field7517.method845(class454.field6199, (byte) 87, 0);
        } else {
            super.field7517.method934(1, (byte) -65);
            super.field7517.method893(117, class680.field9501);
            super.field7517.method849((byte) 47, class312.field4469, class312.field4469);
            super.field7517.method840(2, -126, class362.field5101);
            super.field7517.method845(class454.field6199, (byte) 94, 0);
            super.field7517.method819(-111);
            super.field7517.method823((class67) null, -8423);
            super.field7517.method934(0, (byte) -65);
            this.field906 = false;
        }
        if (!arg0) {
            field915 = 59;
        }
        ++field914;
        super.field7517.method849((byte) 117, class312.field4469, class312.field4469);
    }

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "(I)V", line = 53)
    public static void method604(int arg0) {
        field916 = null;
        if (arg0 != 1002) {
            method609((byte) 98, 58, (class376) null, (class376) null);
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)Z", line = 63)
    public final boolean method605(int arg0) {
        if (arg0 != 4095) {
            field915 = 5;
        }
        ++field908;
        return true;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZLft;Z)V", line = 79)
    public static final void method606(boolean arg0, class3 arg1, boolean arg2) {
        ++field907;
        if (!arg0) {
            field916 = null;
        }
        class453.field6187.method1796(arg1, 76);
        if (arg2) {
            class409.method2388(class11.field175, class250.field3445, arg1, -1, class193.field2920, class453.field6187);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lwc;IB)V", line = 96)
    public final void method607(class67 arg0, int arg1, byte arg2) {
        super.field7517.method823(arg0, -8423);
        ++field911;
        super.field7517.method887((byte) 119, arg1);
        if (arg2 < 68) {
            field918 = -63;
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lrv;)V", line = 980)
    public class75(class111 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZIILli;)V", line = 112)
    public static final void method608(boolean arg0, int arg1, int arg2, class433 arg3) {
        ++field910;
        if (arg3 != null && class446.field6126.field24 != arg3) {
            int var4 = arg3.field5962;
            int var5 = arg3.field5951;
            int var6 = arg3.field5963;
            int var7 = (int) arg3.field5970;
            long var8 = arg3.field5970;
            if (~var6 <= -2001) {
                var6 -= 2000;
            }
            if (var6 == 47) {
                class134 var10 = (class134) class390.field5470.method2135((long) var7, (byte) 31);
                if (var10 != null) {
                    ++class615.field8188;
                    class556 var11 = var10.field2154;
                    class678.field9469 = arg1;
                    class21.field389 = 2;
                    class696.field9696 = arg2;
                    class680.field9505 = 0;
                    class583 var12 = class381.method2246(1, class128.field2105, class255.field3498);
                    var12.field7637.method3788(!class153.field2345.method2313(true, 82) ? 0 : 1, (byte) 122);
                    var12.field7637.method3780(var7, 100);
                    class42.method309(var12, 0);
                    class126.method1000(0, var11.field10321[0], 0, var11.method2256(-1), -2, var11.method2256(-1), true, var11.field10322[0], -1);
                }
            }
            if (var6 == 51) {
                class383 var13 = class248.field3438[var7];
                if (var13 != null) {
                    class678.field9469 = arg1;
                    class680.field9505 = 0;
                    ++class284.field4012;
                    class21.field389 = 2;
                    class696.field9696 = arg2;
                    class583 var14 = class381.method2246(1, class128.field2105, class478.field6559);
                    var14.field7637.method3785(!class153.field2345.method2313(true, 82) ? 0 : 1, (byte) 109);
                    var14.field7637.method3780(var7, 120);
                    class42.method309(var14, 0);
                    class126.method1000(0, var13.field10321[0], 0, var13.method2256(-1), -2, var13.method2256(-1), true, var13.field10322[0], -1);
                }
            }
            if (~var6 == -59) {
                class383 var15 = class248.field3438[var7];
                if (var15 != null) {
                    class680.field9505 = 0;
                    class678.field9469 = arg1;
                    class696.field9696 = arg2;
                    ++class314.field4484;
                    class21.field389 = 2;
                    class583 var16 = class381.method2246(1, class128.field2105, class22.field394);
                    var16.field7637.method3780(var7, 116);
                    var16.field7637.method3788(class153.field2345.method2313(true, 82) ? 1 : 0, (byte) 102);
                    class42.method309(var16, 0);
                    class126.method1000(0, var15.field10321[0], 0, var15.method2256(-1), -2, var15.method2256(-1), true, var15.field10322[0], -1);
                }
            }
            if (~var6 == -7) {
                class134 var17 = (class134) class390.field5470.method2135((long) var7, (byte) 31);
                if (var17 != null) {
                    class678.field9469 = arg1;
                    class680.field9505 = 0;
                    class21.field389 = 2;
                    class556 var18 = var17.field2154;
                    class696.field9696 = arg2;
                    ++class762.field10617;
                    class583 var19 = class381.method2246(1, class128.field2105, class402.field5605);
                    var19.field7637.method3788(class153.field2345.method2313(!arg0, 82) ? 1 : 0, (byte) 100);
                    var19.field7637.method3772(var7, -231665880);
                    class42.method309(var19, 0);
                    class126.method1000(0, var18.field10321[0], 0, var18.method2256(-1), -2, var18.method2256(-1), true, var18.field10322[0], -1);
                }
            }
            if (var6 == 12) {
                class696.field9696 = arg2;
                ++class562.field7370;
                class21.field389 = 2;
                class680.field9505 = 0;
                class678.field9469 = arg1;
                class583 var20 = class381.method2246(1, class128.field2105, class343.field4816);
                var20.field7637.method3831(1182, class503.field6752 + var4);
                var20.field7637.method3781(true, var5 - -class334.field4757);
                var20.field7637.method3823(-24, class153.field2345.method2313(!arg0, 82) ? 1 : 0);
                var20.field7637.method3772(var7, -231665880);
                class42.method309(var20, 0);
                class553.method3083(var4, var5, (byte) 40);
            }
            if (var6 == 49) {
                class680.field9505 = 0;
                class21.field389 = 2;
                ++class163.field2459;
                class696.field9696 = arg2;
                class678.field9469 = arg1;
                class583 var21 = class381.method2246(1, class128.field2105, class743.field10326);
                var21.field7637.method3781(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                var21.field7637.method3823(-98, !class153.field2345.method2313(true, 82) ? 0 : 1);
                var21.field7637.method3781(true, class334.field4757 + var5);
                var21.field7637.method3772(class503.field6752 + var4, -231665880);
                class42.method309(var21, 0);
                class285.method1766(var4, var8, var5, 0);
            }
            if (var6 == 59) {
                class134 var22 = (class134) class390.field5470.method2135((long) var7, (byte) 31);
                if (var22 != null) {
                    ++class110.field1515;
                    class21.field389 = 2;
                    class696.field9696 = arg2;
                    class678.field9469 = arg1;
                    class680.field9505 = 0;
                    class556 var23 = var22.field2154;
                    class583 var24 = class381.method2246(1, class128.field2105, class454.field6201);
                    var24.field7637.method3772(var7, -231665880);
                    var24.field7637.method3788(!class153.field2345.method2313(true, 82) ? 0 : 1, (byte) 101);
                    class42.method309(var24, 0);
                    class126.method1000(0, var23.field10321[0], 0, var23.method2256(-1), -2, var23.method2256(-1), true, var23.field10322[0], -1);
                }
            }
            if (~var6 == -24) {
                class383 var25 = class248.field3438[var7];
                if (var25 != null) {
                    ++class436.field6009;
                    class21.field389 = 2;
                    class696.field9696 = arg2;
                    class680.field9505 = 0;
                    class678.field9469 = arg1;
                    class583 var26 = class381.method2246(1, class128.field2105, class270.field3780);
                    var26.field7637.method3780(var7, 109);
                    var26.field7637.method3785(class153.field2345.method2313(true, 82) ? 1 : 0, (byte) 115);
                    class42.method309(var26, 0);
                    class126.method1000(0, var25.field10321[0], 0, var25.method2256(-1), -2, var25.method2256(-1), true, var25.field10322[0], -1);
                }
            }
            if (var6 == 9) {
                class134 var27 = (class134) class390.field5470.method2135((long) var7, (byte) 31);
                if (var27 != null) {
                    ++class343.field4818;
                    class680.field9505 = 0;
                    class678.field9469 = arg1;
                    class556 var28 = var27.field2154;
                    class696.field9696 = arg2;
                    class21.field389 = 2;
                    class583 var29 = class381.method2246(1, class128.field2105, class7.field153);
                    var29.field7637.method3831(1182, var7);
                    var29.field7637.method3772(class275.field3827, -231665880);
                    var29.field7637.method3781(true, class136.field2168);
                    var29.field7637.method3804(class649.field8631, (byte) -64);
                    var29.field7637.method3814((byte) 105, class153.field2345.method2313(true, 82) ? 1 : 0);
                    class42.method309(var29, 0);
                    class126.method1000(0, var28.field10321[0], 0, var28.method2256(-1), -2, var28.method2256(-1), true, var28.field10322[0], -1);
                }
            }
            if (~var6 == -31 && class420.field5787 == null) {
                class435.method2504(var5, -1, var4);
                class420.field5787 = class239.method1503(var5, var4, 0);
                class399.method2347(class420.field5787, 2260);
            }
            if (var6 == 44) {
                ++class683.field9533;
                class21.field389 = 2;
                class696.field9696 = arg2;
                class678.field9469 = arg1;
                class680.field9505 = 0;
                class583 var30 = class381.method2246(1, class128.field2105, class93.field1121);
                var30.field7637.method3778((byte) 114, class649.field8631);
                var30.field7637.method3831(1182, class334.field4757 + var5);
                var30.field7637.method3788(class153.field2345.method2313(true, 82) ? 1 : 0, (byte) 122);
                var30.field7637.method3780(var7, 105);
                var30.field7637.method3780(class136.field2168, 59);
                var30.field7637.method3780(class503.field6752 + var4, 107);
                var30.field7637.method3831(1182, class275.field3827);
                class42.method309(var30, 0);
                class553.method3083(var4, var5, (byte) 40);
            }
            if (var6 == 13) {
                class383 var31 = class248.field3438[var7];
                if (var31 != null) {
                    class21.field389 = 2;
                    class678.field9469 = arg1;
                    class696.field9696 = arg2;
                    class680.field9505 = 0;
                    ++class597.field7788;
                    class583 var32 = class381.method2246(1, class128.field2105, class376.field5234);
                    var32.field7637.method3831(1182, var7);
                    var32.field7637.method3785(!class153.field2345.method2313(!arg0, 82) ? 0 : 1, (byte) 103);
                    class42.method309(var32, 0);
                    class126.method1000(0, var31.field10321[0], 0, var31.method2256(-1), -2, var31.method2256(-1), true, var31.field10322[0], -1);
                }
            }
            if (var6 == 48 || ~var6 == -1004) {
                class50.method355(arg3.field5965, -1, var4, var5, var7);
            }
            if (~var6 == -51) {
                class696.field9696 = arg2;
                class678.field9469 = arg1;
                class680.field9505 = 0;
                ++class415.field5735;
                class21.field389 = 2;
                class583 var33 = class381.method2246(1, class128.field2105, class54.field659);
                var33.field7637.method3823(-127, class153.field2345.method2313(true, 82) ? 1 : 0);
                var33.field7637.method3780(class334.field4757 + var5, 121);
                var33.field7637.method3780(class503.field6752 + var4, 95);
                var33.field7637.method3781(!arg0, var7);
                class42.method309(var33, 0);
                class553.method3083(var4, var5, (byte) 40);
            }
            if (~var6 == -46) {
                if (class257.field3521 > 0 && class153.field2345.method2313(true, 82) && class153.field2345.method2313(true, 81)) {
                    class559.method3108(class334.field4757 + var5, class503.field6752 + var4, class472.field6475.field3508, false);
                } else {
                    class583 var34 = class607.method3298(var7, (byte) 26, var5, var4);
                    if (var7 != 1) {
                        class680.field9505 = 0;
                        class21.field389 = 1;
                        class678.field9469 = arg1;
                        class696.field9696 = arg2;
                    } else {
                        var34.field7637.method3823(-48, -1);
                        var34.field7637.method3823(-68, -1);
                        var34.field7637.method3831(1182, (int) class547.field7230);
                        var34.field7637.method3823(-108, 57);
                        var34.field7637.method3823(-23, class649.field8626);
                        var34.field7637.method3823(-58, class260.field3629);
                        var34.field7637.method3823(-52, 89);
                        var34.field7637.method3831(1182, class472.field6475.field3505);
                        var34.field7637.method3831(1182, class472.field6475.field3502);
                        var34.field7637.method3823(-92, 63);
                    }
                    class42.method309(var34, 0);
                    class126.method1000(0, var5, 0, 1, -4, 1, true, var4, -1);
                }
            }
            if (!arg0) {
                if (~var6 == -6) {
                    class383 var35 = class248.field3438[var7];
                    if (var35 != null) {
                        class21.field389 = 2;
                        class678.field9469 = arg1;
                        class696.field9696 = arg2;
                        class680.field9505 = 0;
                        ++class559.field7351;
                        class583 var36 = class381.method2246(1, class128.field2105, class88.field1070);
                        var36.field7637.method3831(1182, var7);
                        var36.field7637.method3814((byte) 123, class153.field2345.method2313(true, 82) ? 1 : 0);
                        class42.method309(var36, 0);
                        class126.method1000(0, var35.field10321[0], 0, var35.method2256(-1), -2, var35.method2256(-1), true, var35.field10322[0], -1);
                    }
                }
                if (var6 == 16) {
                    class696.field9696 = arg2;
                    class678.field9469 = arg1;
                    ++class97.field1194;
                    class680.field9505 = 0;
                    class21.field389 = 2;
                    class583 var37 = class381.method2246(1, class128.field2105, class281.field3981);
                    var37.field7637.method3780(class334.field4757 + var5, 97);
                    var37.field7637.method3781(true, class503.field6752 + var4);
                    var37.field7637.method3781(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    var37.field7637.method3788(class153.field2345.method2313(true, 82) ? 1 : 0, (byte) 119);
                    class42.method309(var37, 0);
                    class285.method1766(var4, var8, var5, 0);
                }
                if (var6 == 19) {
                    class678.field9469 = arg1;
                    ++class175.field2645;
                    class21.field389 = 2;
                    class696.field9696 = arg2;
                    class680.field9505 = 0;
                    class583 var38 = class381.method2246(1, class128.field2105, class22.field398);
                    var38.field7637.method3788(!class153.field2345.method2313(true, 82) ? 0 : 1, (byte) 95);
                    var38.field7637.method3780(var5 - -class334.field4757, 117);
                    var38.field7637.method3780(var4 - -class503.field6752, 91);
                    var38.field7637.method3780(var7, 86);
                    class42.method309(var38, 0);
                    class553.method3083(var4, var5, (byte) 40);
                }
                if (var6 == 1011) {
                    class696.field9696 = arg2;
                    class680.field9505 = 0;
                    ++class545.field7211;
                    class21.field389 = 2;
                    class678.field9469 = arg1;
                    class583 var39 = class381.method2246(1, class128.field2105, class7.field154);
                    var39.field7637.method3831(1182, var7);
                    class42.method309(var39, 0);
                }
                if (~var6 == -9) {
                    class383 var40 = class248.field3438[var7];
                    if (var40 != null) {
                        class21.field389 = 2;
                        class680.field9505 = 0;
                        ++class336.field4761;
                        class696.field9696 = arg2;
                        class678.field9469 = arg1;
                        class583 var41 = class381.method2246(1, class128.field2105, class427.field5891);
                        var41.field7637.method3780(var7, 52);
                        var41.field7637.method3785(!class153.field2345.method2313(!arg0, 82) ? 0 : 1, (byte) 95);
                        class42.method309(var41, 0);
                        class126.method1000(0, var40.field10321[0], 0, var40.method2256(-1), -2, var40.method2256(-1), true, var40.field10322[0], -1);
                    }
                }
                if (var6 == 1002) {
                    class696.field9696 = arg2;
                    class680.field9505 = 0;
                    class678.field9469 = arg1;
                    class21.field389 = 2;
                    class134 var42 = (class134) class390.field5470.method2135((long) var7, (byte) 31);
                    if (var42 != null) {
                        class556 var43 = var42.field2154;
                        class166 var44 = var43.field7328;
                        if (var44.field2575 != null) {
                            var44 = var44.method1190((byte) 83, class74.field901);
                        }
                        if (var44 != null) {
                            ++class341.field4810;
                            class583 var45 = class381.method2246(1, class128.field2105, class495.field6678);
                            var45.field7637.method3831(1182, var44.field2566);
                            class42.method309(var45, 0);
                        }
                    }
                }
                if (var6 == 2) {
                    if (class257.field3521 > 0 && class153.field2345.method2313(!arg0, 82) && class153.field2345.method2313(true, 81)) {
                        class559.method3108(class334.field4757 + var5, class503.field6752 - -var4, class472.field6475.field3508, false);
                    } else {
                        ++class179.field2702;
                        class680.field9505 = 0;
                        class678.field9469 = arg1;
                        class696.field9696 = arg2;
                        class21.field389 = 1;
                        class583 var46 = class381.method2246(1, class128.field2105, class1.field10);
                        var46.field7637.method3772(class503.field6752 + var4, -231665880);
                        var46.field7637.method3772(class334.field4757 + var5, -231665880);
                        class42.method309(var46, 0);
                    }
                }
                if (~var6 == -26) {
                    class672 var47 = class239.method1503(var5, var4, 0);
                    if (var47 != null) {
                        class227.method1450(var47, false);
                    }
                }
                if (~var6 == -19) {
                    class134 var48 = (class134) class390.field5470.method2135((long) var7, (byte) 31);
                    if (var48 != null) {
                        class678.field9469 = arg1;
                        ++class681.field9507;
                        class21.field389 = 2;
                        class696.field9696 = arg2;
                        class556 var49 = var48.field2154;
                        class680.field9505 = 0;
                        class583 var50 = class381.method2246(1, class128.field2105, class380.field5285);
                        var50.field7637.method3785(class153.field2345.method2313(true, 82) ? 1 : 0, (byte) 124);
                        var50.field7637.method3780(var7, 63);
                        class42.method309(var50, 0);
                        class126.method1000(0, var49.field10321[0], 0, var49.method2256(-1), -2, var49.method2256(-1), true, var49.field10322[0], -1);
                    }
                }
                if (var6 == 4) {
                    class678.field9469 = arg1;
                    ++class446.field6120;
                    class21.field389 = 2;
                    class680.field9505 = 0;
                    class696.field9696 = arg2;
                    class583 var51 = class381.method2246(1, class128.field2105, class277.field3860);
                    var51.field7637.method3785(class153.field2345.method2313(true, 82) ? 1 : 0, (byte) 109);
                    var51.field7637.method3780(class503.field6752 + var4, 43);
                    var51.field7637.method3781(true, var5 - -class334.field4757);
                    var51.field7637.method3772((int) (var8 >>> 32) & Integer.MAX_VALUE, -231665880);
                    class42.method309(var51, 0);
                    class285.method1766(var4, var8, var5, 0);
                }
                if (var6 == 15) {
                    class21.field389 = 2;
                    class696.field9696 = arg2;
                    ++class10.field171;
                    class680.field9505 = 0;
                    class678.field9469 = arg1;
                    class583 var52 = class381.method2246(1, class128.field2105, class359.field5042);
                    var52.field7637.method3772(var7, -231665880);
                    var52.field7637.method3772(var5 - -class334.field4757, -231665880);
                    var52.field7637.method3788(!class153.field2345.method2313(!arg0, 82) ? 0 : 1, (byte) 112);
                    var52.field7637.method3781(true, class503.field6752 + var4);
                    class42.method309(var52, 0);
                    class553.method3083(var4, var5, (byte) 40);
                }
                if (var6 == 60) {
                    class383 var53 = class248.field3438[var7];
                    if (var53 != null) {
                        class696.field9696 = arg2;
                        class680.field9505 = 0;
                        class21.field389 = 2;
                        class678.field9469 = arg1;
                        ++class625.field8302;
                        class583 var54 = class381.method2246(1, class128.field2105, class551.field7271);
                        var54.field7637.method3772(var7, -231665880);
                        var54.field7637.method3772(class136.field2168, -231665880);
                        var54.field7637.method3781(true, class275.field3827);
                        var54.field7637.method3823(-124, class153.field2345.method2313(true, 82) ? 1 : 0);
                        var54.field7637.method3798(27695, class649.field8631);
                        class42.method309(var54, 0);
                        class126.method1000(0, var53.field10321[0], 0, var53.method2256(-1), -2, var53.method2256(-1), true, var53.field10322[0], -1);
                    }
                }
                if (var6 == 1009) {
                    ++class263.field3676;
                    class21.field389 = 2;
                    class680.field9505 = 0;
                    class696.field9696 = arg2;
                    class678.field9469 = arg1;
                    class583 var55 = class381.method2246(1, class128.field2105, class671.field9155);
                    var55.field7637.method3831(1182, var7);
                    class42.method309(var55, 0);
                }
                if (~var6 == -21) {
                    class383 var56 = class248.field3438[var7];
                    if (var56 != null) {
                        class680.field9505 = 0;
                        class696.field9696 = arg2;
                        class678.field9469 = arg1;
                        class21.field389 = 2;
                        ++class317.field4527;
                        class583 var57 = class381.method2246(1, class128.field2105, class478.field6556);
                        var57.field7637.method3772(var7, -231665880);
                        var57.field7637.method3788(class153.field2345.method2313(!arg0, 82) ? 1 : 0, (byte) 116);
                        class42.method309(var57, 0);
                        class126.method1000(0, var56.field10321[0], 0, var56.method2256(-1), -2, var56.method2256(-1), true, var56.field10322[0], -1);
                    }
                }
                if (var6 == 1006 || var6 == 1004 || ~var6 == -1008 || ~var6 == -1002 || ~var6 == -1013) {
                    class679.method3841(113, var6, var7, var4);
                }
                if (var6 == 1008) {
                    class21.field389 = 2;
                    class696.field9696 = arg2;
                    ++class119.field1911;
                    class678.field9469 = arg1;
                    class680.field9505 = 0;
                    class583 var58 = class381.method2246(1, class128.field2105, class709.field9834);
                    var58.field7637.method3780(class334.field4757 + var5, 79);
                    var58.field7637.method3780(class503.field6752 + var4, 56);
                    var58.field7637.method3780((int) (var8 >>> 32) & Integer.MAX_VALUE, 79);
                    var58.field7637.method3785(class153.field2345.method2313(true, 82) ? 1 : 0, (byte) 91);
                    class42.method309(var58, 0);
                    class285.method1766(var4, var8, var5, 0);
                }
                if (var6 == 11) {
                    class134 var59 = (class134) class390.field5470.method2135((long) var7, (byte) 31);
                    if (var59 != null) {
                        class696.field9696 = arg2;
                        class678.field9469 = arg1;
                        class680.field9505 = 0;
                        class556 var60 = var59.field2154;
                        ++class614.field8173;
                        class21.field389 = 2;
                        class583 var61 = class381.method2246(1, class128.field2105, class498.field6713);
                        var61.field7637.method3785(!class153.field2345.method2313(!arg0, 82) ? 0 : 1, (byte) 96);
                        var61.field7637.method3780(var7, 58);
                        class42.method309(var61, 0);
                        class126.method1000(0, var60.field10321[0], 0, var60.method2256(-1), -2, var60.method2256(-1), true, var60.field10322[0], -1);
                    }
                }
                if (var6 == 17) {
                    class672 var62 = class239.method1503(var5, var4, 0);
                    if (var62 != null) {
                        class617.method3377((byte) 11);
                        class200 var63 = client.method1875(var62);
                        class679.method3839(var63.field2998, 1, var62, var63.method1351(2));
                        class719.field10008 = class596.method3239(-1, var62);
                        class341.field4808 = var62.field9165 + "<col=ffffff>";
                        if (class719.field10008 == null) {
                            class719.field10008 = "Null";
                        }
                    }
                } else {
                    if (var6 == 57) {
                        class21.field389 = 2;
                        class696.field9696 = arg2;
                        class680.field9505 = 0;
                        class678.field9469 = arg1;
                        ++class625.field8300;
                        class583 var64 = class381.method2246(1, class128.field2105, class353.field4966);
                        var64.field7637.method3788(class153.field2345.method2313(true, 82) ? 1 : 0, (byte) 99);
                        var64.field7637.method3831(1182, var4 - -class503.field6752);
                        var64.field7637.method3781(true, class334.field4757 + var5);
                        var64.field7637.method3781(true, var7);
                        class42.method309(var64, 0);
                        class553.method3083(var4, var5, (byte) 40);
                    }
                    if (var6 == 22) {
                        class678.field9469 = arg1;
                        class21.field389 = 2;
                        ++class625.field8302;
                        class680.field9505 = 0;
                        class696.field9696 = arg2;
                        class583 var65 = class381.method2246(1, class128.field2105, class551.field7271);
                        var65.field7637.method3772(class472.field6475.field10297, -231665880);
                        var65.field7637.method3772(class136.field2168, -231665880);
                        var65.field7637.method3781(true, class275.field3827);
                        var65.field7637.method3823(-38, class153.field2345.method2313(true, 82) ? 1 : 0);
                        var65.field7637.method3798(27695, class649.field8631);
                        class42.method309(var65, 0);
                    }
                    if (var6 == 10) {
                        class680.field9505 = 0;
                        ++class177.field2675;
                        class696.field9696 = arg2;
                        class21.field389 = 2;
                        class678.field9469 = arg1;
                        class583 var66 = class381.method2246(1, class128.field2105, class314.field4491);
                        var66.field7637.method3780(class334.field4757 + var5, 46);
                        var66.field7637.method3788(!class153.field2345.method2313(true, 82) ? 0 : 1, (byte) 118);
                        var66.field7637.method3781(true, var4 - -class503.field6752);
                        var66.field7637.method3772((int) (var8 >>> 32) & Integer.MAX_VALUE, -231665880);
                        class42.method309(var66, 0);
                        class285.method1766(var4, var8, var5, 0);
                    }
                    if (~var6 == -47) {
                        class678.field9469 = arg1;
                        ++class460.field6281;
                        class680.field9505 = 0;
                        class696.field9696 = arg2;
                        class21.field389 = 2;
                        class583 var67 = class381.method2246(1, class128.field2105, class105.field1443);
                        var67.field7637.method3831(1182, class334.field4757 + var5);
                        var67.field7637.method3772(class503.field6752 + var4, -231665880);
                        var67.field7637.method3831(1182, class275.field3827);
                        var67.field7637.method3785(!class153.field2345.method2313(true, 82) ? 0 : 1, (byte) 115);
                        var67.field7637.method3780((int) (var8 >>> 32) & Integer.MAX_VALUE, 118);
                        var67.field7637.method3778((byte) 113, class649.field8631);
                        var67.field7637.method3781(true, class136.field2168);
                        class42.method309(var67, 0);
                        class285.method1766(var4, var8, var5, 0);
                    }
                    if (~var6 == -22) {
                        class696.field9696 = arg2;
                        ++class509.field6781;
                        class678.field9469 = arg1;
                        class680.field9505 = 0;
                        class21.field389 = 1;
                        class583 var68 = class381.method2246(1, class128.field2105, class721.field10034);
                        var68.field7637.method3772(class275.field3827, -231665880);
                        var68.field7637.method3772(class136.field2168, -231665880);
                        var68.field7637.method3778((byte) 121, class649.field8631);
                        var68.field7637.method3781(!arg0, class503.field6752 + var4);
                        var68.field7637.method3781(!arg0, class334.field4757 + var5);
                        class42.method309(var68, 0);
                        class126.method1000(0, var5, 0, 1, -4, 1, true, var4, -1);
                    }
                    if (~var6 == -4) {
                        class383 var69 = class248.field3438[var7];
                        if (var69 != null) {
                            class680.field9505 = 0;
                            class696.field9696 = arg2;
                            class678.field9469 = arg1;
                            class21.field389 = 2;
                            ++class109.field1476;
                            class583 var70 = class381.method2246(1, class128.field2105, class363.field5109);
                            var70.field7637.method3823(-84, class153.field2345.method2313(true, 82) ? 1 : 0);
                            var70.field7637.method3780(var7, 104);
                            class42.method309(var70, 0);
                            class126.method1000(0, var69.field10321[0], 0, var69.method2256(-1), -2, var69.method2256(-1), true, var69.field10322[0], -1);
                        }
                    }
                    if (class142.field2268) {
                        class617.method3377((byte) -125);
                    }
                    if (class508.field6777 != null && class416.field5751 == 0) {
                        class399.method2347(class508.field6777, 2260);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BILwu;Lwu;)V", line = 922)
    public static final void method609(byte arg0, int arg1, class376 arg2, class376 arg3) {
        class87.field1062 = arg3;
        if (arg0 != 94) {
            method606(true, (class3) null, false);
        }
        ++field917;
        class350.field4921 = arg2;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZI)V", line = 938)
    public final void method610(boolean arg0, int arg1) {
        if (arg1 > 109) {
            super.field7517.method849((byte) 73, class99.field1265, class312.field4469);
            ++field905;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZZ)V", line = 949)
    public final void method611(boolean arg0, boolean arg1) {
        ++field913;
        class493 var3 = super.field7517.method868(0);
        if (!arg0) {
            field915 = 64;
        }
        if (var3 != null && arg1) {
            super.field7517.method934(1, (byte) -65);
            super.field7517.method823(var3, -8423);
            super.field7517.method893(123, class536.field7059);
            super.field7517.method934(1, (byte) -65);
            super.field7517.method849((byte) 124, class99.field1265, class314.field4479);
            super.field7517.method911(-8980, 2, class227.field3230, false, true);
            super.field7517.method845(class92.field1112, (byte) 97, 0);
            class615 var4 = super.field7517.method916(0);
            var4.method3354((byte) 87, super.field7517.method852(47));
            super.field7517.method878(3, class180.field2729);
            super.field7517.method934(0, (byte) -65);
            this.field906 = true;
        } else {
            super.field7517.method845(class92.field1112, (byte) 97, 0);
        }
    }
}
