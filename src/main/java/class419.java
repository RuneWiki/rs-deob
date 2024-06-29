import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class419 {

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lvg;")
    private class49 field6419 = new class49(64);

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lri;")
    private class97 field6416;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[S")
    public static short[] field6413 = new short[256];

    @OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
    public static int[] field6420 = new int[1000];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILoo;)V", line = 4)
    public static final void method2672(int arg0, class580 arg1) {
        int var2 = -42 % (arg0 / 49);
        field6409++;
        arg1.method3405(true);
        int var3 = class114.field1793;
        class304 var4 = class567.field8141 = class597.field8465[var3] = new class304();
        var4.field4197 = var3;
        int var5 = arg1.method3404(30, 8);
        byte var6 = (byte) (var5 >> 28);
        int var7 = (var5 & 0xFFFE5FD) >> 14;
        int var8 = var5 & 0x3FFF;
        var4.field4264[0] = var7 - class612.field8702;
        var4.field9696 = (var4.field4264[0] << 9) + (var4.method1841(20744) << 8);
        var4.field4265[0] = var8 - class626.field8855;
        var4.field9705 = (var4.field4265[0] << 9) + (var4.method1841(20744) << 8);
        class423.field6439 = var4.field9695 = var4.field9703 = var6;
        if (class437.method2774(true, var4.field4264[0], var4.field4265[0])) {
            var4.field9703++;
        }
        if (class588.field8351[var3] != null) {
            var4.method2112(class588.field8351[var3], -85);
        }
        class99.field1607 = 0;
        class359.field5700[class99.field1607++] = var3;
        class490.field7163[var3] = 0;
        class585.field8329 = 0;
        for (int var9 = 1; var9 < 2048; var9++) {
            if (var3 != var9) {
                int var10 = arg1.method3404(18, 8);
                int var11 = var10 >> 16;
                int var12 = (var10 & 0xFFA3) >> 8;
                int var13 = var10 & 0xFF;
                class30 var14 = class515.field7491[var9] = new class30();
                var14.field441 = false;
                var14.field445 = 0;
                var14.field443 = (var12 << 14) + (var11 << 28) + var13;
                var14.field444 = -1;
                class62.field792[class585.field8329++] = var9;
                class490.field7163[var9] = 0;
            }
        }
        arg1.method3398((byte) 104);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lofa;I)Z", line = 80)
    public static final boolean method2673(class302 arg0, int arg1) {
        int var2 = -7 % ((arg1 - 7) / 63);
        field6410++;
        class698 var3 = class213.field3537.method94(arg0.method394((byte) -91), (byte) -42);
        if (var3.field9793 == -1) {
            return true;
        } else {
            class265 var4 = class584.field8299.method1885(false, var3.field9793);
            return var4.field4315 == -1 ? true : var4.method1875(-527);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lhg;", line = 103)
    public final class642 method2674(int arg0, int arg1) {
        field6412++;
        class49 var3 = this.field6419;
        class642 var5;
        synchronized (this.field6419) {
            int var4 = -90 / ((-arg0 - 21) / 39);
            var5 = (class642) this.field6419.method560(false, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class97 var6 = this.field6416;
        byte[] var7;
        synchronized (this.field6416) {
            var7 = this.field6416.method926(32, -128, arg1);
        }
        class642 var8 = new class642();
        if (var7 != null) {
            var8.method3723(7865, new class6(var7));
        }
        class49 var9 = this.field6419;
        synchronized (this.field6419) {
            this.field6419.method559(var8, (long) arg1, 0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[Lac;", line = 136)
    public static final class501[] method2675(int arg0) {
        if (arg0 != -15) {
            field6420 = null;
        }
        field6411++;
        return new class501[] { class182.field3060, class299.field4674, class354.field5658, class133.field2182, class31.field451, class89.field1079 };
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 147)
    public final void method2676(byte arg0) {
        class49 var2 = this.field6419;
        synchronized (this.field6419) {
            this.field6419.method569(0);
        }
        int var3 = -98 / ((arg0 + 74) / 42);
        field6417++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V", line = 161)
    public final void method2677(byte arg0, int arg1) {
        field6418++;
        class49 var3 = this.field6419;
        synchronized (this.field6419) {
            if (arg0 != 116) {
                field6421 = 94;
            }
            this.field6419.method573((byte) 121, arg1);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 174)
    public final void method2678(byte arg0) {
        class49 var2 = this.field6419;
        synchronized (this.field6419) {
            this.field6419.method563(0);
            int var3 = 95 % ((arg0 + 72) / 38);
        }
        field6415++;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 188)
    public static void method2679(byte arg0) {
        field6420 = null;
        field6413 = null;
        if (arg0 != 105) {
            method2672(51, null);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Loo;BI)V", line = 205)
    public static final void method2680(class580 arg0, byte arg1, int arg2) {
        field6414++;
        boolean var3 = arg0.method3404(1, 8) == 1;
        if (var3) {
            class318.field4992[class422.field6437++] = arg2;
        }
        int var4 = arg0.method3404(2, 8);
        class304 var5 = class597.field8465[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field4751 = false;
            } else if (class114.field1793 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class30 var6 = class515.field7491[arg2] = new class30();
                var6.field443 = (var5.field9695 << 28) + (var5.field4264[0] + class612.field8702 >> 6 << 14) + (var5.field4265[0] + class626.field8855 >> 6);
                if (var5.field4743 == -1) {
                    var6.field445 = var5.field4244.method1707(-126);
                } else {
                    var6.field445 = var5.field4743;
                }
                var6.field441 = var5.field4758;
                var6.field444 = var5.field4206;
                if (var5.field4761 > 0) {
                    class639.method3712(var5, (byte) 118);
                }
                class597.field8465[arg2] = null;
                if (arg0.method3404(1, 8) != 0) {
                    class180.method1475(arg0, (byte) -46, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method3404(3, 8);
            int var8 = var5.field4264[0];
            int var9 = var5.field4265[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field4741 = var9;
                var5.field4790 = var8;
                var5.field4751 = true;
            } else {
                var5.method2104(class545.field7924[arg2], var9, (byte) -99, var8);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method3404(4, 8);
            int var11 = var5.field4264[0];
            int var12 = var5.field4265[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
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
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field4751 = true;
                var5.field4790 = var11;
                var5.field4741 = var12;
            } else {
                var5.method2104(class545.field7924[arg2], var12, (byte) -99, var11);
            }
        } else {
            int var13 = arg0.method3404(1, 8);
            if (var13 == 0) {
                int var14 = arg0.method3404(12, 8);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E5) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field4264[0] + var16;
                int var19 = var5.field4265[0] + var17;
                if (var3) {
                    var5.field4741 = var19;
                    var5.field4751 = true;
                    var5.field4790 = var18;
                } else {
                    var5.method2104(class545.field7924[arg2], var19, (byte) -99, var18);
                }
                var5.field9695 = var5.field9703 = (byte) (var5.field9695 + var15 & 0x3);
                if (class437.method2774(true, var18, var19)) {
                    var5.field9703++;
                }
                if (class114.field1793 == arg2) {
                    class423.field6439 = var5.field9695;
                }
            } else {
                int var20 = arg0.method3404(30, 8);
                if (arg1 >= 33) {
                    int var21 = var20 >> 28;
                    int var22 = var20 >> 14 & 0x3FFF;
                    int var23 = var20 & 0x3FFF;
                    int var24 = (var5.field4264[0] + var22 + class612.field8702 & 0x3FFF) - class612.field8702;
                    int var25 = (var5.field4265[0] + class626.field8855 + var23 & 0x3FFF) - class626.field8855;
                    if (var3) {
                        var5.field4741 = var25;
                        var5.field4790 = var24;
                        var5.field4751 = true;
                    } else {
                        var5.method2104(class545.field7924[arg2], var25, (byte) -99, var24);
                    }
                    var5.field9695 = var5.field9703 = (byte) (var5.field9695 + var21 & 0x3);
                    if (class437.method2774(true, var24, var25)) {
                        var5.field9703++;
                    }
                    if (class114.field1793 == arg2) {
                        class423.field6439 = var5.field9695;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lei;ILri;)V", line = 535)
    public class419(class162 arg0, int arg1, class97 arg2) {
        this.field6416 = arg2;
        this.field6416.method949(32, 0);
    }
}
