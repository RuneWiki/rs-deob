import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class660 extends class205 {

    @OriginalMember(owner = "client!mia", name = "v", descriptor = "Z")
    public boolean field9392 = true;

    @OriginalMember(owner = "client!mia", name = "w", descriptor = "Lkk;")
    public static class40 field9393 = new class40();

    @OriginalMember(owner = "client!mia", name = "K", descriptor = "[C")
    public static char[] field9407 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!mia", name = "t", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!mia", name = "u", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!mia", name = "x", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!mia", name = "y", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!mia", name = "B", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!mia", name = "C", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!mia", name = "D", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!mia", name = "F", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!mia", name = "J", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!mia", name = "L", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!mia", name = "M", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!mia", name = "N", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!mia", name = "E", descriptor = "Lcu;")
    public class200 field9401;

    @OriginalMember(owner = "client!mia", name = "A", descriptor = "[I")
    public int[] field9397;

    @OriginalMember(owner = "client!mia", name = "I", descriptor = "[I")
    private int[] field9405;

    @OriginalMember(owner = "client!mia", name = "H", descriptor = "[Ljava/lang/String;")
    private String[] field9404;

    @OriginalMember(owner = "client!mia", name = "G", descriptor = "[[I")
    private int[][] field9403;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lofa;B)Ljava/lang/String;", line = 4)
    public final String method3708(class301 arg0, byte arg1) {
        field9406++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg1 != 105) {
            this.method3717((byte) -29, 77);
        }
        if (this.field9405 != null) {
            for (int var4 = 0; var4 < this.field9405.length; var4++) {
                var3.append(this.field9404[var4]);
                var3.append(this.field9401.method1495(this.field9403[var4], (byte) -73, this.method3717((byte) 127, var4), arg0.method1966(class82.method730(this.field9405[var4], -119).field6850, (byte) 109)));
            }
        }
        var3.append(this.field9404[this.field9404.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V", line = 33)
    public static void method3709(byte arg0) {
        int var1 = -15 % ((55 - arg0) / 54);
        field9393 = null;
        field9407 = null;
    }

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "(B)I", line = 43)
    public final int method3710(byte arg0) {
        if (arg0 > -101) {
            this.method3711(null, (byte) 15, null);
        }
        field9391++;
        return this.field9405 == null ? 0 : this.field9405.length;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "([IBLofa;)V", line = 60)
    public final void method3711(int[] arg0, byte arg1, class301 arg2) {
        field9409++;
        if (this.field9405 == null) {
            return;
        }
        if (arg1 != 79) {
            this.method3708(null, (byte) 45);
        }
        for (int var4 = 0; var4 < this.field9405.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method3717((byte) 125, var4).field6849;
            if (var5 > 0) {
                arg2.method1935((long) arg0[var4], arg1 - 102, var5);
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(II)V", line = 89)
    public static final void method3712(int arg0, int arg1) {
        field9395++;
        class118 var2 = class86.method755(true, arg0, arg1);
        var2.method936(0);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)I", line = 106)
    public final int method3713(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field9405 = null;
        }
        field9399++;
        if (this.field9405 == null || arg2 < 0 || this.field9405.length < arg2) {
            return -1;
        } else if (this.field9403[arg2] == null || arg0 < 0 || arg0 > this.field9403[arg2].length) {
            return -1;
        } else {
            return this.field9403[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILgba;B)V", line = 124)
    public static final void method3714(int arg0, class702 arg1, byte arg2) {
        int var3 = -52 % ((arg2 - 70) / 50);
        field9396++;
        boolean var4 = arg1.method3905(-4, 1) == 1;
        if (var4) {
            class505.field7374[class395.field5901++] = arg0;
        }
        int var5 = arg1.method3905(-4, 2);
        class573 var6 = class279.field4271[arg0];
        if (var5 == 0) {
            if (var4) {
                var6.field8122 = false;
            } else if (class673.field9516 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class195 var7 = class457.field6636[arg0] = new class195();
                var7.field3354 = (var6.field1702[0] + class265.field4123 >> 6 << 14) + (var6.field9470 << 28) + (var6.field1704[0] + class723.field10155 >> 6);
                if (var6.field8139 == -1) {
                    var7.field3357 = var6.field1636.method3102(-8255);
                } else {
                    var7.field3357 = var6.field8139;
                }
                var7.field3355 = var6.field1687;
                var7.field3358 = var6.field8133;
                if (var6.field8153 > 0) {
                    class599.method3442(102, var6);
                }
                class279.field4271[arg0] = null;
                if (arg1.method3905(-4, 1) != 0) {
                    class442.method2710(5, arg0, arg1);
                }
            }
        } else if (var5 == 1) {
            int var8 = arg1.method3905(-4, 3);
            int var9 = var6.field1702[0];
            int var10 = var6.field1704[0];
            if (var8 == 0) {
                var9--;
                var10--;
            } else if (var8 == 1) {
                var10--;
            } else if (var8 == 2) {
                var10--;
                var9++;
            } else if (var8 == 3) {
                var9--;
            } else if (var8 == 4) {
                var9++;
            } else if (var8 == 5) {
                var9--;
                var10++;
            } else if (var8 == 6) {
                var10++;
            } else if (var8 == 7) {
                var9++;
                var10++;
            }
            if (var4) {
                var6.field8126 = var10;
                var6.field8120 = var9;
                var6.field8122 = true;
            } else {
                var6.method3320(-1, var10, var9, class397.field5909[arg0]);
            }
        } else if (var5 == 2) {
            int var11 = arg1.method3905(-4, 4);
            int var12 = var6.field1702[0];
            int var13 = var6.field1704[0];
            if (var11 == 0) {
                var12 -= 2;
                var13 -= 2;
            } else if (var11 == 1) {
                var13 -= 2;
                var12--;
            } else if (var11 == 2) {
                var13 -= 2;
            } else if (var11 == 3) {
                var12++;
                var13 -= 2;
            } else if (var11 == 4) {
                var13 -= 2;
                var12 += 2;
            } else if (var11 == 5) {
                var13--;
                var12 -= 2;
            } else if (var11 == 6) {
                var12 += 2;
                var13--;
            } else if (var11 == 7) {
                var12 -= 2;
            } else if (var11 == 8) {
                var12 += 2;
            } else if (var11 == 9) {
                var12 -= 2;
                var13++;
            } else if (var11 == 10) {
                var12 += 2;
                var13++;
            } else if (var11 == 11) {
                var13 += 2;
                var12 -= 2;
            } else if (var11 == 12) {
                var12--;
                var13 += 2;
            } else if (var11 == 13) {
                var13 += 2;
            } else if (var11 == 14) {
                var12++;
                var13 += 2;
            } else if (var11 == 15) {
                var13 += 2;
                var12 += 2;
            }
            if (var4) {
                var6.field8126 = var13;
                var6.field8122 = true;
                var6.field8120 = var12;
            } else {
                var6.method3320(-1, var13, var12, class397.field5909[arg0]);
            }
        } else {
            int var14 = arg1.method3905(-4, 1);
            if (var14 == 0) {
                int var15 = arg1.method3905(-4, 12);
                int var16 = var15 >> 10;
                int var17 = var15 >> 5 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var15 & 0x1F;
                if (var18 > 15) {
                    var18 -= 32;
                }
                int var19 = var6.field1702[0] + var17;
                int var20 = var6.field1704[0] + var18;
                if (var4) {
                    var6.field8122 = true;
                    var6.field8126 = var20;
                    var6.field8120 = var19;
                } else {
                    var6.method3320(-1, var20, var19, class397.field5909[arg0]);
                }
                var6.field9470 = var6.field9469 = (byte) (var6.field9470 + var16 & 0x3);
                if (class584.method3365(false, var19, var20)) {
                    var6.field9469++;
                }
                if (class673.field9516 == arg0) {
                    if (class582.field8234 != var6.field9470) {
                        class245.field3947 = true;
                    }
                    class582.field8234 = var6.field9470;
                }
            } else {
                int var21 = arg1.method3905(-4, 30);
                int var22 = var21 >> 28;
                int var23 = (var21 & 0xFFFDC8D) >> 14;
                int var24 = var21 & 0x3FFF;
                int var25 = (var6.field1702[0] - (-class265.field4123 - var23) & 0x3FFF) - class265.field4123;
                int var26 = (var6.field1704[0] + class723.field10155 + var24 & 0x3FFF) - class723.field10155;
                if (var4) {
                    var6.field8122 = true;
                    var6.field8120 = var25;
                    var6.field8126 = var26;
                } else {
                    var6.method3320(-1, var26, var25, class397.field5909[arg0]);
                }
                var6.field9470 = var6.field9469 = (byte) (var6.field9470 + var22 & 0x3);
                if (class584.method3365(false, var25, var26)) {
                    var6.field9469++;
                }
                if (class673.field9516 == arg0) {
                    class582.field8234 = var6.field9470;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;)V", line = 456)
    public static final void method3715(int arg0, String arg1) {
        field9410++;
        if (arg1 == null) {
            return;
        }
        if (!(class468.field6818 < 200 || class325.field4807) || class468.field6818 >= 200) {
            class564.method3268(class641.field9003.method3621(125, class467.field6804), 17137, 4);
            String var2 = class641.field9004.method3621(106, class467.field6804);
            if (var2 != null) {
                class564.method3268(var2, 17137, 4);
            }
            return;
        }
        String var3 = class519.method3095(arg1, false);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class468.field6818; var4++) {
            String var10 = class519.method3095(class562.field7961[var4], false);
            if (var10 != null && var10.equals(var3)) {
                class564.method3268(arg1 + class641.field9031.method3621(110, class467.field6804), 17137, 4);
                return;
            }
            if (class624.field8745[var4] != null) {
                String var11 = class519.method3095(class624.field8745[var4], false);
                if (var11 != null && var11.equals(var3)) {
                    class564.method3268(arg1 + class641.field9031.method3621(93, class467.field6804), 17137, 4);
                    return;
                }
            }
        }
        int var5 = -61 / ((-arg0 - 52) / 58);
        for (int var6 = 0; var6 < class270.field4155; var6++) {
            String var8 = class519.method3095(class379.field5697[var6], false);
            if (var8 != null && var8.equals(var3)) {
                class564.method3268(class641.field9036.method3621(108, class467.field6804) + arg1 + class641.field9037.method3621(116, class467.field6804), 17137, 4);
                return;
            }
            if (class603.field8536[var6] != null) {
                String var9 = class519.method3095(class603.field8536[var6], false);
                if (var9 != null && var9.equals(var3)) {
                    class564.method3268(class641.field9036.method3621(123, class467.field6804) + arg1 + class641.field9037.method3621(116, class467.field6804), 17137, 4);
                    return;
                }
            }
        }
        if (class519.method3095(class145.field2251.field8146, false).equals(var3)) {
            class564.method3268(class641.field9034.method3621(103, class467.field6804), 17137, 4);
            return;
        }
        class37.field376++;
        class540 var7 = class257.method1732(true, class341.field5050, class655.field9332);
        var7.field7707.method1926(class16.method101(-108, arg1), 65280);
        var7.field7707.method1931(113, arg1);
        class756.method4211(var7, 126);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IZLofa;)V", line = 561)
    private final void method3716(int arg0, boolean arg1, class301 arg2) {
        if (!arg1) {
            this.field9405 = null;
        }
        field9394++;
        if (arg0 == 1) {
            this.field9404 = class750.method4181((byte) -40, arg2.method1958(-3438), '<');
        } else if (arg0 == 2) {
            int var4 = arg2.method1987(-122);
            this.field9397 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9397[var5] = arg2.method1989((byte) -107);
            }
            return;
        } else if (arg0 == 3) {
            int var6 = arg2.method1987(-96);
            this.field9403 = new int[var6][];
            this.field9405 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1989((byte) -61);
                class472 var9 = class82.method730(var8, -106);
                if (var9 != null) {
                    this.field9405[var7] = var8;
                    this.field9403[var7] = new int[var9.field6855];
                    for (int var10 = 0; var10 < var9.field6855; var10++) {
                        this.field9403[var7][var10] = arg2.method1989((byte) -112);
                    }
                }
            }
            return;
        } else if (arg0 == 4) {
            this.field9392 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BI)Lln;", line = 642)
    public final class472 method3717(byte arg0, int arg1) {
        field9390++;
        if (this.field9405 == null || arg1 < 0 || arg1 > this.field9405.length) {
            return null;
        } else {
            if (arg0 <= 120) {
                this.field9397 = null;
            }
            return class82.method730(this.field9405[arg1], -72);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BLofa;)V", line = 662)
    public final void method3718(byte arg0, class301 arg1) {
        while (true) {
            int var3 = arg1.method1987(-128);
            if (var3 == 0) {
                field9400++;
                if (arg0 != 54) {
                    this.field9404 = null;
                    return;
                }
                return;
            }
            this.method3716(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 682)
    public final String method3719(boolean arg0) {
        field9402++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field9404 == null) {
            return "";
        }
        if (arg0) {
            this.method3717((byte) -51, 41);
        }
        var2.append(this.field9404[0]);
        for (int var3 = 1; var3 < this.field9404.length; var3++) {
            var2.append("...");
            var2.append(this.field9404[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)V", line = 710)
    public final void method3720(int arg0) {
        if (arg0 != 0) {
            field9393 = null;
        }
        field9398++;
        if (this.field9397 != null) {
            for (int var2 = 0; var2 < this.field9397.length; var2++) {
                this.field9397[var2] = class112.method903(this.field9397[var2], 32768);
            }
        }
    }
}
