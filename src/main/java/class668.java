import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class668 {

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "Lqr;")
    private class65 field9117 = new class65(16);

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "Lwu;")
    private class376 field9118;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "Lhda;")
    public static class752 field9115 = new class752(102, -2);

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "Lhda;")
    public static class752 field9125 = new class752(106, 8);

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "F")
    public static float field9123;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "Lro;")
    public static class2 field9127;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "Lon;")
    public static class340 field9129;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "Lws;")
    public static class362 field9128;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V", line = 3)
    public static void method3683(int arg0) {
        field9127 = null;
        field9128 = null;
        field9125 = null;
        field9115 = null;
        field9129 = null;
        if (arg0 != 2) {
            method3690(-20, 115, null, 116);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)V", line = 17)
    public final void method3684(int arg0, boolean arg1) {
        if (!arg1) {
            this.method3689(false);
        }
        field9114++;
        class65 var3 = this.field9117;
        synchronized (this.field9117) {
            this.field9117.method553(arg0, -15782);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)I", line = 33)
    public static final int method3685(boolean arg0) {
        field9116++;
        if (class410.field5681 == 1) {
            return class195.field2938;
        } else if (arg0) {
            return 124;
        } else {
            return class394.field5491;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILwd;)V", line = 49)
    public static final void method3686(int arg0, int arg1, class276 arg2) {
        field9120++;
        boolean var3 = arg2.method1664(2059, 1) == 1;
        if (var3) {
            class189.field2853[class408.field5673++] = arg0;
        }
        int var4 = arg2.method1664(2059, 2);
        class383 var5 = class248.field3438[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field5360 = false;
            } else if (class303.field4293 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class753 var6 = class32.field496[arg0] = new class753();
                var6.field10494 = (var5.field10322[0] + class503.field6752 >> 6 << 14) + (var5.field3508 << 28) + (var5.field10321[0] + class334.field4757 >> 6);
                if (var5.field5320 == -1) {
                    var6.field10499 = var5.field10284.method2097((byte) -70);
                } else {
                    var6.field10499 = var5.field5320;
                }
                var6.field10495 = var5.field5349;
                var6.field10497 = var5.field10287;
                if (var5.field5337 > 0) {
                    class161.method1158(arg1 + 1073744557, var5);
                }
                class248.field3438[arg0] = null;
                if (arg2.method1664(2059, 1) != 0) {
                    class700.method3946(2, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1664(2059, 3);
            int var8 = var5.field10322[0];
            int var9 = var5.field10321[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field5343 = var8;
                var5.field5360 = true;
                var5.field5365 = var9;
            } else {
                var5.method2263(class261.field3636[arg0], 0, var9, var8);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1664(2059, 4);
            int var11 = var5.field10322[0];
            int var12 = var5.field10321[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field5360 = true;
                var5.field5365 = var12;
                var5.field5343 = var11;
            } else {
                var5.method2263(class261.field3636[arg0], 0, var12, var11);
            }
        } else {
            int var13 = arg2.method1664(2059, 1);
            if (var13 == 0) {
                int var14 = arg2.method1664(2059, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E8) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field10322[0] + var16;
                int var19 = var5.field10321[0] + var17;
                if (var3) {
                    var5.field5365 = var19;
                    var5.field5360 = true;
                    var5.field5343 = var18;
                } else {
                    var5.method2263(class261.field3636[arg0], 0, var19, var18);
                }
                var5.field3508 = var5.field3515 = (byte) (var5.field3508 + var15 & 0x3);
                if (class498.method2810(-10387, var18, var19)) {
                    var5.field3515++;
                }
                if (class303.field4293 == arg0) {
                    if (class507.field6775 != var5.field3508) {
                        class302.field4291 = true;
                    }
                    class507.field6775 = var5.field3508;
                }
            } else {
                int var20 = arg2.method1664(2059, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFF3E2) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class503.field6752 + var22 + var5.field10322[0] & 0x3FFF) - class503.field6752;
                int var25 = (var5.field10321[0] + class334.field4757 + var23 & 0x3FFF) - class334.field4757;
                if (var3) {
                    var5.field5360 = true;
                    var5.field5343 = var24;
                    var5.field5365 = var25;
                } else {
                    var5.method2263(class261.field3636[arg0], 0, var25, var24);
                }
                var5.field3508 = var5.field3515 = (byte) (var5.field3508 + var21 & 0x3);
                if (arg1 != -2734) {
                    method3683(3);
                }
                if (class498.method2810(-10387, var24, var25)) {
                    var5.field3515++;
                }
                if (class303.field4293 == arg0) {
                    class507.field6775 = var5.field3508;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V", line = 376)
    public final void method3687(byte arg0) {
        field9119++;
        class65 var2 = this.field9117;
        synchronized (this.field9117) {
            this.field9117.method558(0);
        }
        if (arg0 < 120) {
            method3690(-27, -46, null, 103);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)Ldd;", line = 389)
    private final class705 method3688(int arg0, int arg1) {
        field9124++;
        class65 var3 = this.field9117;
        class705 var4;
        synchronized (this.field9117) {
            var4 = (class705) this.field9117.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field9118;
        byte[] var6;
        synchronized (this.field9118) {
            var6 = this.field9118.method2218((byte) 117, 29, arg1);
        }
        if (arg0 > -20) {
            method3690(-111, 3, null, 81);
        }
        class705 var7 = new class705();
        if (var6 != null) {
            var7.method3969(-5224, new class677(var6));
        }
        class65 var8 = this.field9117;
        synchronized (this.field9117) {
            this.field9117.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(Z)V", line = 425)
    public final void method3689(boolean arg0) {
        if (!arg0) {
            return;
        }
        class65 var2 = this.field9117;
        synchronized (this.field9117) {
            this.field9117.method561((byte) -78);
        }
        field9113++;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILvfa;I)V", line = 443)
    public static final void method3690(int arg0, int arg1, class672 arg2, int arg3) {
        field9112++;
        class517.field6906 = arg0;
        class316.field4503 = arg2;
        if (arg1 == -104) {
            class117.field1892 = arg3;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 494)
    public class668(class763 arg0, int arg1, class376 arg2) {
        this.field9118 = arg2;
        this.field9118.method2195(29, 0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIILap;)Llt;", line = 462)
    public final class676 method3691(int arg0, int arg1, int arg2, int arg3, int arg4, class480 arg5) {
        field9122++;
        class344[] var7 = null;
        class705 var8 = this.method3688(-43, arg1);
        if (arg2 != -23470) {
            return null;
        }
        if (var8.field9775 != null) {
            var7 = new class344[var8.field9775.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class645 var10 = arg5.method2703(8, var8.field9775[var9]);
                var7[var9] = new class344(var10.field8580, var10.field8571, var10.field8569, var10.field8578, var10.field8572, var10.field8576, var10.field8577, var10.field8575);
            }
        }
        return new class676(var8.field9771, var7, var8.field9772, arg3, arg0, arg4);
    }
}
