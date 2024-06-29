import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class665 {

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "Lit;")
    public class766 field9375 = new class766();

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field9362 = 0;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "Lmca;")
    public static class41 field9367 = new class41("game3", 2);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "Lit;")
    private class766 field9376;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLit;Low;)V")
    private final void method3722(byte arg0, class766 arg1, class665 arg2) {
        field9371++;
        class766 var4 = this.field9375.field10584;
        this.field9375.field10584 = arg1.field10584;
        arg1.field10584.field10591 = this.field9375;
        if (arg0 < 34) {
            this.method3728((byte) 29, null);
        }
        if (this.field9375 != arg1) {
            arg1.field10584 = arg2.field9375.field10584;
            arg1.field10584.field10591 = arg1;
            arg2.field9375.field10584 = var4;
            var4.field10591 = arg2.field9375;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)Z")
    public final boolean method3723(byte arg0) {
        field9363++;
        if (arg0 < 73) {
            this.method3722((byte) 91, null, null);
        }
        return this.field9375.field10591 == this.field9375;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)Lit;")
    public final class766 method3724(byte arg0) {
        field9366++;
        class766 var2 = this.field9375.field10584;
        if (this.field9375 == var2) {
            this.field9376 = null;
            return null;
        }
        if (arg0 != -60) {
            this.method3729((byte) 81);
        }
        this.field9376 = var2.field10584;
        return var2;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lit;B)V")
    public final void method3725(class766 arg0, byte arg1) {
        field9374++;
        if (arg0.field10584 != null) {
            arg0.method4237(-1);
        }
        arg0.field10591 = this.field9375.field10591;
        if (arg1 > -32) {
            this.method3723((byte) -96);
        }
        arg0.field10584 = this.field9375;
        arg0.field10584.field10591 = arg0;
        arg0.field10591.field10584 = arg0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Lit;")
    public final class766 method3726(int arg0) {
        field9364++;
        if (arg0 != 12691) {
            this.field9376 = null;
        }
        class766 var2 = this.field9375.field10591;
        if (this.field9375 == var2) {
            return null;
        } else {
            var2.method4237(-1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(B)V")
    public static void method3727(byte arg0) {
        if (arg0 != 114) {
            field9362 = -114;
        }
        field9367 = null;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLit;)V")
    public final void method3728(byte arg0, class766 arg1) {
        if (arg1.field10584 != null) {
            arg1.method4237(-1);
        }
        field9360++;
        arg1.field10591 = this.field9375;
        arg1.field10584 = this.field9375.field10584;
        if (arg0 < 97) {
            this.method3728((byte) 65, null);
        }
        arg1.field10584.field10591 = arg1;
        arg1.field10591.field10584 = arg1;
    }

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "(B)Lit;")
    public final class766 method3729(byte arg0) {
        field9373++;
        class766 var2 = this.field9376;
        if (this.field9375 == var2) {
            this.field9376 = null;
            return null;
        } else {
            this.field9376 = var2.field10591;
            int var3 = -9 % ((-arg0 - 62) / 49);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIBZI)V")
    public static final void method3730(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field9369++;
        if (arg3 <= 116) {
            field9367 = null;
        }
        if (class514.field7096 == null) {
            class686.field9702.method2765(arg0, arg2, 102, -16777216, arg1, arg5);
        } else if (class719.field10041.field10347 >= 0 && class719.field10041.field10347 < class192.field2891 * 512 && class719.field10041.field10350 >= 0 && (class456.field6225 * 512) > class719.field10041.field10350) {
            class626.field8887++;
            if (class719.field10041 != null && class719.field10041.field10347 - (class719.field10041.method209(true) - 1) * 256 >> 9 == class263.field3717 && (class719.field10041.field10350 - ((class719.field10041.method209(true) - 1) * 256) >> 9) == class104.field1516) {
                class104.field1516 = -1;
                class263.field3717 = -1;
                class91.method779((byte) -36);
            }
            class215.method1481((byte) 111);
            if (!arg4) {
                class518.method3031(512);
            }
            class223.method1528((byte) 43);
            class508.method2970(arg1, arg5, true, arg0, arg2, (byte) -64);
            class349.field4956 = class349.field4948;
            int var6 = class580.field8358;
            int var7 = class575.field8295;
            int var8 = class286.field4206;
            int var9 = class94.field1351;
            if (class783.field10725 == 1) {
                int var12 = (int) class208.field3031;
                if (class547.field7577 >> 8 > var12) {
                    var12 = class547.field7577 >> 8;
                }
                if (class81.field1203[4] && class367.field5188[4] + 128 > var12) {
                    var12 = class367.field5188[4] + 128;
                }
                int var13 = (int) class98.field1423 + class193.field2902 & 0x3FFF;
                class415.method2439((var12 >> 3) * 3 + 600 << 2, -722150064, var13, class577.method3399(class719.field10041.field10350, class719.field10041.field10347, -8724, class403.field5560) - 200, var12, class335.field4760, var6, class478.field6577);
            } else if (class783.field10725 == 4) {
                int var10 = (int) class208.field3031;
                if (class547.field7577 >> 8 > var10) {
                    var10 = class547.field7577 >> 8;
                }
                if (class81.field1203[4] && (class367.field5188[4] + 128) > var10) {
                    var10 = class367.field5188[4] + 128;
                }
                int var11 = (int) class98.field1423 & 0x3FFF;
                class415.method2439((var10 >> 3) * 3 + 600 << 2, -722150064, var11, class577.method3399(class45.field598, class374.field5256, -8724, class403.field5560) - 200, var10, class335.field4760, var6, class478.field6577);
            } else if (class783.field10725 == 5) {
                class645.method3655((byte) -23, var6);
            }
            int var14 = class733.field10199;
            int var15 = class243.field3482;
            int var16 = class286.field4204;
            int var17 = class99.field1437;
            int var18 = class642.field9037;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class81.field1203[var19]) {
                    int var22 = (int) ((double) (-class359.field5084[var19]) + (double) (class359.field5084[var19] * 2 + 1) * Math.random() + Math.sin((double) class732.field10183[var19] / 100.0D * (double) class51.field732[var19]) * (double) class367.field5188[var19]);
                    if (var19 == 4) {
                        class99.field1437 += var22;
                        if (class99.field1437 < 1024) {
                            class99.field1437 = 1024;
                        } else if (class99.field1437 > 3072) {
                            class99.field1437 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class733.field10199 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class642.field9037 = class642.field9037 + var22 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class286.field4204 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class243.field3482 += var22 << 2;
                    }
                }
            }
            if (class733.field10199 < 0) {
                class733.field10199 = 0;
            }
            if (class286.field4204 < 0) {
                class286.field4204 = 0;
            }
            if (class733.field10199 > (class42.field520 << 9) - 1) {
                class733.field10199 = (class42.field520 << 9) - 1;
            }
            if ((class681.field9665 << 9) - 1 < class286.field4204) {
                class286.field4204 = (class681.field9665 << 9) - 1;
            }
            class124.method1072((byte) 107);
            class338.method2067(false);
            class686.field9702.method488(var9, var7, var8 + var9, var6 + var7);
            class259.method1688((byte) 7, true);
            if (class593.field8489) {
                class637.method3627(class469.field6391, -3);
                if (class349.field4956 != class236.field3415) {
                    class87.field1297 = true;
                }
                class236.field3415 = class349.field4956;
            } else {
                class686.field9702.method91();
                int var20 = class469.field6391;
                if (class283.field4157 == null) {
                    class686.field9702.method97(var20);
                } else {
                    class283.field4157.method2318(var6, var7, class686.field9702, class99.field1437, class642.field9037, var8, var9, class250.field3603 << 3, (byte) -117, var20);
                }
            }
            class193.method1378(-109);
            class390.field5441.method1567(class733.field10199, class243.field3482, class286.field4204, -class99.field1437 & 0x3FFF, -class642.field9037 & 0x3FFF, -class389.field5439 & 0x3FFF);
            class686.field9702.method498(class390.field5441);
            class686.field9702.method449(var8 / 2 + var9, var6 / 2 + var7, class446.field6162 << 1, class446.field6162 << 1);
            class349.method2120((byte) 85, class446.field6162 << 1, var6 / 2 + var7, class446.field6162 << 1, var8 / 2 + var9);
            class245.method1629((byte) -35, -class99.field1437 & 0x3FFF, class243.field3482, -class642.field9037 & 0x3FFF, -class389.field5439 & 0x3FFF, class733.field10199, class286.field4204);
            byte var21 = class420.field5820.field9460.method3420(17539) == 2 ? (byte) class626.field8887 : 1;
            if (class593.field8489) {
                class107.method861(-class99.field1437 & 0x3FFF, -class642.field9037 & 0x3FFF, -class389.field5439 & 0x3FFF, 2);
                class381.method2299(class349.field4956, class719.field10041.field10361 + 1, class286.field4204, class126.field2151, class733.field10199, class728.field10158, class486.field6695, class719.field10041.field10347 >> 9, class23.field257, var21, class243.field3482, class594.field8494, class509.field6988, (byte) -57, class411.field5632, class719.field10041.field10350 >> 9, true, class420.field5820.field9490.method798(17539) == 0);
            } else {
                class393.method2352(class594.field8494, class733.field10199, class243.field3482, class286.field4204, class23.field257, class509.field6988, class411.field5632, class486.field6695, class728.field10158, class126.field2151, class719.field10041.field10361 + 1, var21, class719.field10041.field10347 >> 9, class719.field10041.field10350 >> 9, class420.field5820.field9490.method798(17539) == 0, true, class765.field10581 ? class349.field4956 : -1, 0, false);
            }
            class193.method1378(-67);
            if (class141.field2306 == 10) {
                class519.method3043((byte) -56, var6, 256, var9, var7, 256, var8);
                class392.method2348(-15254, var8, 256, 256, var7, var9, var6);
                class326.method1979(var6, var9, false, var8, 256, var7, 256);
                class183.method1326(4, var7, var8, var6, var9);
            }
            class371.method2213();
            class99.field1437 = var17;
            class243.field3482 = var15;
            class286.field4204 = var16;
            class733.field10199 = var14;
            class642.field9037 = var18;
            if (class717.field10018 && class138.field2286.method1840(98) == 0) {
                class717.field10018 = false;
            }
            if (class717.field10018) {
                class686.field9702.method2765(var7, var6, 125, -16777216, var9, var8);
                class609.method3526(class563.field7810.method3281(class423.field5892, -1), class686.field9702, (byte) -30, class30.field322, class420.field5827, false);
            }
            class259.method1688((byte) 7, false);
        } else {
            class686.field9702.method2765(arg0, arg2, 108, -16777216, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "(B)Lit;")
    public final class766 method3731(byte arg0) {
        field9365++;
        class766 var2 = this.field9375.field10591;
        if (this.field9375 == var2) {
            this.field9376 = null;
            return null;
        }
        this.field9376 = var2.field10591;
        if (arg0 > -65) {
            this.field9376 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)I")
    public final int method3732(int arg0) {
        if (arg0 != 256) {
            return 55;
        }
        field9368++;
        int var2 = 0;
        for (class766 var3 = this.field9375.field10591; var3 != this.field9375; var3 = var3.field10591) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)Lit;")
    public final class766 method3733(int arg0) {
        field9370++;
        if (arg0 != 27852) {
            this.field9375 = null;
        }
        class766 var2 = this.field9376;
        if (this.field9375 == var2) {
            this.field9376 = null;
            return null;
        } else {
            this.field9376 = var2.field10584;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Low;Z)V")
    public final void method3734(class665 arg0, boolean arg1) {
        if (!arg1) {
            this.method3733(61);
        }
        field9361++;
        this.method3722((byte) 77, this.field9375.field10591, arg0);
    }

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "(I)V")
    public final void method3735(int arg0) {
        field9372++;
        if (arg0 != -4676) {
            method3730(-64, 48, -125, (byte) -38, true, -104);
        }
        while (true) {
            class766 var2 = this.field9375.field10591;
            if (this.field9375 == var2) {
                this.field9376 = null;
                return;
            }
            var2.method4237(-1);
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
    public class665() {
        this.field9375.field10584 = this.field9375;
        this.field9375.field10591 = this.field9375;
    }
}
