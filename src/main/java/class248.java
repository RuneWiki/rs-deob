import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class248 extends class136 {

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    private int field3675 = 4096;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "Z")
    private boolean field3676 = true;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "Llq;")
    public static class385 field3671;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
    public static void method1625(byte arg0) {
        field3671 = null;
        if (arg0 > -17) {
            field3671 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            method1625((byte) -50);
        }
        ++field3673;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field3676 = arg2.method577(arg0 + 251) == 1;
            }
        } else {
            this.field3675 = arg2.method623((byte) -111);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lrs;I)V")
    public static final void method1626(class461 arg0, int arg1) {
        ++field3672;
        for (class307 var2 = (class307) class250.field3680.method1018(49); var2 != null; var2 = (class307) class250.field3680.method1022((byte) -112)) {
            if (var2.field4349 == arg0) {
                if (var2.field4367 != null) {
                    class273.field4030.method1242(var2.field4367);
                    var2.field4367 = null;
                }
                var2.method1525((byte) -101);
                return;
            }
        }
        if (arg1 != 16777216) {
            field3674 = 46;
        }
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
    public static final void method1627(int arg0) {
        ++field3677;
        if (~class172.field2444 != -1 && class172.field2444 != 5) {
            try {
                if (++class495.field7265 > 2000) {
                    if (class383.field5635 != null) {
                        class383.field5635.method646(false);
                        class383.field5635 = null;
                    }
                    if (~class347.field4824 <= -2) {
                        class172.field2444 = 0;
                        class428.field6307 = -5;
                        return;
                    }
                    class172.field2444 = 1;
                    ++class347.field4824;
                    if (class310.field4422 == class291.field4193) {
                        class291.field4193 = class69.field883;
                    } else {
                        class291.field4193 = class310.field4422;
                    }
                    class495.field7265 = 0;
                }
                if (class172.field2444 == 1) {
                    class262.field3853 = class498.field7404.method2551(0, class521.field7650, class291.field4193);
                    class172.field2444 = 2;
                }
                if (~class172.field2444 == -3) {
                    if (~class262.field3853.field6617 == -3) {
                        throw new IOException();
                    }
                    if (class262.field3853.field6617 != 1) {
                        return;
                    }
                    class383.field5635 = new class66((Socket) class262.field3853.field6613, class498.field7404);
                    class262.field3853 = null;
                    long var1 = class258.field3800 = class141.method1055(1, class336.field4677);
                    class472.field6970.field827 = 0;
                    int var3 = (int) (var1 >> 16 & 31L);
                    class472.field6970.method638(255, class215.field3075.field3575);
                    class472.field6970.method638(255, var3);
                    class383.field5635.method650(2, 0, class472.field6970.field783, 127);
                    class515.method3056((byte) 73);
                    int var4 = class383.field5635.method647(87);
                    class515.method3056((byte) 123);
                    if (~var4 != -1) {
                        class172.field2444 = 0;
                        class428.field6307 = var4;
                        class383.field5635.method646(false);
                        class383.field5635 = null;
                        return;
                    }
                    class172.field2444 = 3;
                }
                if (~class172.field2444 == -4) {
                    if (~class383.field5635.method641(3) > -9) {
                        return;
                    }
                    class383.field5635.method639(0, (byte) 113, 8, class85.field1163.field783);
                    class85.field1163.field827 = 0;
                    class523.field7688 = class85.field1163.method588(true);
                    class65 var5 = new class65(70);
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class523.field7688 >> 32), (int) class523.field7688 };
                    var5.method638(255, 10);
                    var5.method618(var6[0], (byte) -65);
                    var5.method618(var6[1], (byte) 85);
                    var5.method618(var6[2], (byte) -80);
                    var5.method618(var6[3], (byte) -126);
                    var5.method591(class141.method1055(1, class336.field4677), (byte) -48);
                    var5.method605(75, class123.field1796);
                    var5.method609(class496.field7276, (byte) -107, class523.field7684);
                    class472.field6970.field827 = 0;
                    if (class113.field1589 != 40) {
                        class472.field6970.method638(255, class215.field3086.field3575);
                    } else {
                        class472.field6970.method638(255, class215.field3088.field3575);
                    }
                    class472.field6970.method611((byte) 67, 0);
                    int var7 = class472.field6970.field827;
                    class472.field6970.method618(592, (byte) 89);
                    class472.field6970.method638(255, class412.field6114);
                    class472.field6970.method638(255, class114.method920((byte) -123));
                    class472.field6970.method611((byte) 67, class94.field1278);
                    class472.field6970.method611((byte) 67, class410.field6100);
                    class472.field6970.method638(255, class478.field7044.field3335);
                    class369.method2282((byte) -120, class472.field6970);
                    class472.field6970.method605(68, class307.field4365);
                    class472.field6970.method618(class401.field5950, (byte) -8);
                    class65 var8 = class478.field7044.method2074(-76);
                    class472.field6970.method638(255, var8.field827);
                    class472.field6970.method606(0, true, var8.field783, var8.field827);
                    class247.field3663 = true;
                    class472.field6970.method611((byte) 67, class276.field4070);
                    class472.field6970.method618(class391.field5757.method2370((byte) -23), (byte) -106);
                    class472.field6970.method618(class322.field4533.method2370((byte) -23), (byte) 96);
                    class472.field6970.method618(class3.field44.method2370((byte) -23), (byte) -17);
                    class472.field6970.method618(class196.field2868.method2370((byte) -23), (byte) 104);
                    class472.field6970.method618(class283.field4117.method2370((byte) -23), (byte) -79);
                    class472.field6970.method618(class91.field1256.method2370((byte) -23), (byte) 87);
                    class472.field6970.method618(class512.field7556.method2370((byte) -23), (byte) 105);
                    class472.field6970.method618(class62.field726.method2370((byte) -23), (byte) 103);
                    class472.field6970.method618(class240.field3533.method2370((byte) -23), (byte) -44);
                    class472.field6970.method618(class68.field879.method2370((byte) -23), (byte) 127);
                    class472.field6970.method618(class242.field3579.method2370((byte) -23), (byte) 111);
                    class472.field6970.method618(class279.field4087.method2370((byte) -23), (byte) 85);
                    class472.field6970.method618(class82.field1116.method2370((byte) -23), (byte) -81);
                    class472.field6970.method618(class55.field584.method2370((byte) -23), (byte) 127);
                    class472.field6970.method618(class129.field1865.method2370((byte) -23), (byte) -111);
                    class472.field6970.method618(class233.field3429.method2370((byte) -23), (byte) 127);
                    class472.field6970.method618(class305.field4337.method2370((byte) -23), (byte) 92);
                    class472.field6970.method618(class126.field1843.method2370((byte) -23), (byte) 85);
                    class472.field6970.method618(class193.field2807.method2370((byte) -23), (byte) 110);
                    class472.field6970.method618(class192.field2806.method2370((byte) -23), (byte) -8);
                    class472.field6970.method618(class8.field94.method2370((byte) -23), (byte) -31);
                    class472.field6970.method618(class355.field4952.method2370((byte) -23), (byte) 127);
                    class472.field6970.method618(class495.field7251.method2370((byte) -23), (byte) 93);
                    class472.field6970.method618(class161.field2270.method2370((byte) -23), (byte) -87);
                    class472.field6970.method618(class275.field4059.method2370((byte) -23), (byte) -23);
                    class472.field6970.method618(class109.field1549.method2370((byte) -23), (byte) -96);
                    class472.field6970.method618(class263.field3865.method2370((byte) -23), (byte) -67);
                    class472.field6970.method618(class131.field1907.method2370((byte) -23), (byte) -58);
                    class472.field6970.method618(class479.field7046.method2370((byte) -23), (byte) 119);
                    class472.field6970.method618(class186.field2600.method2370((byte) -23), (byte) 0);
                    class472.field6970.method606(0, true, var5.field783, var5.field827);
                    class472.field6970.method634(-40, class472.field6970.field827 - var7);
                    class383.field5635.method650(class472.field6970.field827, 0, class472.field6970.field783, 127);
                    class472.field6970.method948(var6, -938442011);
                    for (int var9 = 0; var9 < 4; ++var9) {
                        var6[var9] += 50;
                    }
                    class85.field1163.method948(var6, -938442011);
                    class172.field2444 = 4;
                }
                if (~class172.field2444 == -5) {
                    if (class383.field5635.method641(3) < 1) {
                        return;
                    }
                    int var10 = class383.field5635.method647(5);
                    if (~var10 == -22) {
                        class172.field2444 = 7;
                    } else if (var10 == 29) {
                        class172.field2444 = 11;
                    } else {
                        if (var10 == 1) {
                            class172.field2444 = 5;
                            class428.field6307 = var10;
                            return;
                        }
                        if (var10 != 2) {
                            if (~var10 != -16) {
                                if (~var10 == -24 && ~class347.field4824 > -2) {
                                    class495.field7265 = 0;
                                    class172.field2444 = 1;
                                    ++class347.field4824;
                                    class383.field5635.method646(false);
                                    class383.field5635 = null;
                                    return;
                                }
                                class172.field2444 = 0;
                                class428.field6307 = var10;
                                class383.field5635.method646(false);
                                class383.field5635 = null;
                                return;
                            }
                            class26.field314 = -2;
                            class172.field2444 = 12;
                        } else {
                            class172.field2444 = 8;
                        }
                    }
                }
                if (~class172.field2444 == -7) {
                    class472.field6970.field827 = 0;
                    class472.field6970.method942(class215.field3087.field3575, 13127);
                    class383.field5635.method650(class472.field6970.field827, 0, class472.field6970.field783, 127);
                    class172.field2444 = 4;
                } else if (class172.field2444 == 7) {
                    if (class383.field5635.method641(3) >= 1) {
                        class455.field6701 = 60 * (class383.field5635.method647(53) + 3);
                        class428.field6307 = 21;
                        class172.field2444 = 0;
                        class383.field5635.method646(false);
                        class383.field5635 = null;
                    }
                } else {
                    int var11 = 14 % ((arg0 - 53) / 58);
                    if (~class172.field2444 == -12) {
                        if (~class383.field5635.method641(3) <= -2) {
                            class473.field6982 = class383.field5635.method647(52);
                            class172.field2444 = 0;
                            class428.field6307 = 29;
                            class383.field5635.method646(false);
                            class383.field5635 = null;
                        }
                    } else {
                        if (~class172.field2444 == -9) {
                            if (~class383.field5635.method641(3) > -14) {
                                return;
                            }
                            class383.field5635.method639(0, (byte) 113, 13, class85.field1163.field783);
                            class85.field1163.field827 = 0;
                            class365.field5273 = class85.field1163.method577(255);
                            class499.field7409 = class85.field1163.method577(255);
                            class388.field5741 = ~class85.field1163.method577(255) == -2;
                            class53.field582 = ~class85.field1163.method577(255) == -2;
                            class195.field2848 = ~class85.field1163.method577(255) == -2;
                            class411.field6107 = ~class85.field1163.method577(255) == -2;
                            class396.field5815 = class85.field1163.method623((byte) -70);
                            class40.field454 = class85.field1163.method577(255) == 1;
                            class49.field542 = class85.field1163.method577(255) == 1;
                            class384.field5645.method790(class49.field542, (byte) 124);
                            class270.field3995.method7(class49.field542, true);
                            class515.field7587.method1216(class49.field542, 115);
                            if ((!class388.field5741 || class195.field2848) && !class40.field454) {
                                try {
                                    class505.method3017(class498.field7404.field6180, "unzap", 60);
                                } catch (Throwable var16) {
                                }
                            } else {
                                try {
                                    class505.method3017(class498.field7404.field6180, "zap", 43);
                                } catch (Throwable var17) {
                                    if (class133.field1932) {
                                        try {
                                            class498.field7404.field6180.getAppletContext().showDocument(new URL(class498.field7404.field6180.getCodeBase(), "blank.ws"), "tbi");
                                        } catch (Exception var15) {
                                        }
                                    }
                                }
                            }
                            if (class365.field5281 == class297.field4260) {
                                try {
                                    class505.method3017(class498.field7404.field6180, "loggedin", 93);
                                } catch (Throwable var14) {
                                }
                            }
                            class172.field2444 = 10;
                        }
                        if (~class172.field2444 == -11) {
                            if (class85.field1163.method950(-6742)) {
                                if (class383.field5635.method641(3) < 1) {
                                    return;
                                }
                                class383.field5635.method639(class85.field1163.field827 + 2, (byte) 113, 1, class85.field1163.field783);
                            }
                            class169.field2395 = class67.method652(105)[class85.field1163.method949(1941438248)];
                            class26.field314 = class85.field1163.method623((byte) -31);
                            class172.field2444 = 9;
                        }
                        if (class172.field2444 == 9) {
                            if (class383.field5635.method641(3) >= class26.field314) {
                                class383.field5635.method639(0, (byte) 113, class26.field314, class85.field1163.field783);
                                class85.field1163.field827 = 0;
                                int var12 = class26.field314;
                                class172.field2444 = 0;
                                class428.field6307 = 2;
                                class7.method47(126);
                                class192.method1346(-95, class85.field1163);
                                class60.field695 = -1;
                                class385.method2346(false);
                                if (class85.field1163.field827 != var12) {
                                    throw new RuntimeException("lswp pos:" + class85.field1163.field827 + " psize:" + var12);
                                } else {
                                    class169.field2395 = null;
                                }
                            }
                        } else if (~class172.field2444 == -13) {
                            if (~class26.field314 == 1) {
                                if (class383.field5635.method641(3) < 2) {
                                    return;
                                }
                                class383.field5635.method639(0, (byte) 113, 2, class85.field1163.field783);
                                class85.field1163.field827 = 0;
                                class26.field314 = class85.field1163.method623((byte) -108);
                            }
                            if (~class383.field5635.method641(3) <= ~class26.field314) {
                                class383.field5635.method639(0, (byte) 113, class26.field314, class85.field1163.field783);
                                class85.field1163.field827 = 0;
                                int var13 = class26.field314;
                                class172.field2444 = 0;
                                class428.field6307 = 15;
                                class123.method973(30);
                                class192.method1346(-90, class85.field1163);
                                if (~class85.field1163.field827 != ~var13) {
                                    throw new RuntimeException("lswpr pos:" + class85.field1163.field827 + " psize:" + var13);
                                } else {
                                    class169.field2395 = null;
                                }
                            }
                        }
                    }
                }
            } catch (IOException var18) {
                if (class383.field5635 != null) {
                    class383.field5635.method646(false);
                    class383.field5635 = null;
                }
                if (~class347.field4824 <= -2) {
                    class428.field6307 = -4;
                    class172.field2444 = 0;
                } else {
                    if (~class310.field4422 != ~class291.field4193) {
                        class291.field4193 = class310.field4422;
                    } else {
                        class291.field4193 = class69.field883;
                    }
                    class172.field2444 = 1;
                    ++class347.field4824;
                    class495.field7265 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        ++field3670;
        int[][] var3 = super.field1952.method3127((byte) 92, arg1);
        if (arg0 < 33) {
            return null;
        } else {
            if (super.field1952.field7770) {
                int[] var4 = this.method1033(class519.field7637 & arg1 - 1, 0, 0);
                int[] var5 = this.method1033(arg1, 0, 0);
                int[] var6 = this.method1033(class519.field7637 & arg1 + 1, 0, 0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; var10 < class467.field6889; ++var10) {
                    int var11 = (var6[var10] - var4[var10]) * this.field3675;
                    int var12 = (var5[var10 - -1 & class166.field2356] - var5[class166.field2356 & var10 + -1]) * this.field3675;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var18 = var11 / var17;
                        var19 = var12 / var17;
                        var20 = 16777216 / var17;
                    }
                    if (this.field3676) {
                        var20 = 2048 - -(var20 >> 1);
                        var18 = 2048 - -(var18 >> 1);
                        var19 = (var19 >> 1) + 2048;
                    }
                    var7[var10] = var19;
                    var8[var10] = var18;
                    var9[var10] = var20;
                }
            }
            return var3;
        }
    }
}
