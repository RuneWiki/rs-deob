import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class248 extends class273 {

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3900 = "scroll:";

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "Lwf;")
    public static class306 field3911;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "[Lv;")
    private class30[] field3910;

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 3)
    public class248() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BILgn;)V", line = 8)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 <= 27) {
            return;
        }
        field3903++;
        if (arg1 == 0) {
            this.field3910 = new class30[arg2.method2043((byte) -113)];
            for (int var4 = 0; var4 < this.field3910.length; var4++) {
                int var5 = arg2.method2043((byte) -120);
                if (var5 == 0) {
                    this.field3910[var4] = class199.method1342(arg2, 0);
                } else if (var5 == 1) {
                    this.field3910[var4] = class171.method1160((byte) 47, arg2);
                } else if (var5 == 2) {
                    this.field3910[var4] = class188.method1291(7527, arg2);
                } else if (var5 == 3) {
                    this.field3910[var4] = class130.method882(-1, arg2);
                }
            }
        } else if (arg1 == 1) {
            this.field4194 = arg2.method2043((byte) -120) == 1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V", line = 82)
    public static void method1684(byte arg0) {
        field3911 = null;
        if (arg0 != 91) {
            field3900 = (String) null;
        }
        field3900 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILwf;BI)[Lng;", line = 94)
    public static final class245[] method1685(int arg0, class306 arg1, byte arg2, int arg3) {
        field3909++;
        if (class156.method1093(true, arg3, arg0, arg1)) {
            int var4 = -40 % ((arg2 + 7) / 63);
            return class116.method800(-10666);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLjh;)Z", line = 107)
    public static final boolean method1686(byte arg0, class207 arg1) {
        field3905++;
        if (arg1.field3188 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field3188.length; var2++) {
            int var3 = class115.method797(var2, (byte) -45, arg1);
            int var4 = arg1.field3255[var2];
            if (arg1.field3188[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field3188[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field3188[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -18) {
            method1686((byte) 65, (class207) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[[I", line = 170)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            this.method170(-111, (byte) 104);
        }
        int[][] var3 = this.field4200.method539(152, arg0);
        field3907++;
        if (this.field4200.field1147) {
            int var4 = class99.field1533;
            int var5 = class27.field346;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = this.field4200.method538(true);
            this.method1690(var6, -31571);
            for (int var8 = 0; var8 < class99.field1533; var8++) {
                int[][] var9 = var7[var8];
                int[] var10 = var9[0];
                int[] var11 = var6[var8];
                int[] var12 = var9[1];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class27.field346; var14++) {
                    int var15 = var11[var14];
                    var13[var14] = class311.method2135(255, var15) << 4;
                    var12[var14] = class311.method2135(65280, var15) >> 4;
                    var10[var14] = class311.method2135(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I", line = 232)
    public final int[] method331(int arg0, int arg1) {
        field3906++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            this.method1690(this.field4204.method368(20378), -31571);
        }
        if (arg1 != -14650) {
            this.field3910 = (class30[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V", line = 254)
    public static final void method1687(int arg0) {
        field3901++;
        int var1 = 34 % ((-arg0 - 60) / 57);
        while (class230.field3713.method2070((byte) 118, class85.field1284) >= 27) {
            int var2 = class230.field3713.method2072(15, false);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class208.field3313[var2] == null) {
                var3 = true;
                class208.field3313[var2] = new class80();
            }
            class80 var4 = class208.field3313[var2];
            class144.field2286[class155.field2439++] = var2;
            var4.field527 = class343.field5341;
            if (var4.field1178 != null && var4.field1178.method1953(0)) {
                class235.method1602(var4, 108);
            }
            var4.method554(class71.method511(class230.field3713.method2072(14, false), 10), 62);
            int var5 = class230.field3713.method2072(1, false);
            int var6 = class303.field4677[class230.field3713.method2072(3, false)];
            if (var3) {
                var4.field520 = var4.field564 = var6;
            }
            int var7 = class230.field3713.method2072(5, false);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class230.field3713.method2072(1, false);
            if (var8 == 1) {
                class105.field1619[class142.field2248++] = var2;
            }
            int var9 = class230.field3713.method2072(5, false);
            if (var9 > 15) {
                var9 -= 32;
            }
            var4.method279(var4.field1178.field4609, 17);
            var4.field565 = var4.field1178.field4572;
            if (var4.field565 == 0) {
                var4.field564 = 0;
            }
            var4.field522 = var4.field1178.field4595;
            var4.method269(var5 == 1, class79.field1173.field505[0] + var7, -115, class79.field1173.field476[0] + var9, var4.method271((byte) 44));
            if (var4.field1178.method1953(0)) {
                class270.method1785(var4.field476[0], (class17) null, (class82) null, var4.field505[0], class77.field1154, var4, 0, -96);
            }
        }
        class230.field3713.method2062(8);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BIIIII)V", line = 333)
    private static final void method1688(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3908++;
        if (arg0 != -56) {
            method1686((byte) -69, (class207) null);
        }
        for (int var6 = arg2; var6 <= arg4; var6++) {
            class253.method1704(arg5, arg3, arg1, class175.field2675[var6], 7);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIB)V", line = 367)
    public static final void method1689(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3904++;
        if (class256.field3995 <= arg3 && arg2 <= class118.field1834 && class323.field5030 <= arg4 && arg0 <= class88.field1324) {
            method1688((byte) -56, arg1, arg4, arg2, arg0, arg3);
        } else {
            class18.method142(arg1, arg4, arg0, arg3, (byte) 127, arg2);
        }
        int var6 = 101 / ((arg5 + 45) / 46);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([[II)V", line = 385)
    private final void method1690(int[][] arg0, int arg1) {
        int var3 = class27.field346;
        field3899++;
        if (arg1 != -31571) {
            method1686((byte) 16, (class207) null);
        }
        int var4 = class99.field1533;
        class221.method1477(true, arg0);
        class200.method1348(class117.field1819, 0, 0, 0, class197.field2963);
        if (this.field3910 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3910.length; var5++) {
            class30 var6 = this.field3910[var5];
            int var7 = var6.field370;
            int var8 = var6.field369;
            if (var8 < 0) {
                if (var7 >= 0) {
                    var6.method225(var3, var4, 2);
                }
            } else if (var7 < 0) {
                var6.method228(var3, var4, (byte) -94);
            } else {
                var6.method227(1325998625, var3, var4);
            }
        }
    }
}
