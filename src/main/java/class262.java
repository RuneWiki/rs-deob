import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class262 {

    @OriginalMember(owner = "client!of", name = "j", descriptor = "B")
    private byte field4629;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    public static int[] field4621 = new int[2000];

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lp;")
    public static class280 field4632 = class18.method140((byte) -118, "p11_full");

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Loe;")
    public static class142 field4631;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[Llk;")
    public static class82[] field4624;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[Z")
    public static boolean[] field4636;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[[B")
    public static byte[][] field4637;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
    public static final void method1771(int arg0, int arg1) {
        field4634++;
        if (arg0 > 88) {
            class205 var2 = class45.field750;
            synchronized (class45.field750) {
                class134.field2377 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static final void method1772(boolean arg0) {
        class132.method919(124, 5);
        field4628++;
        class124.method864(-121, 5);
        class142.method977(81, 5);
        class212.method1421(5, -124);
        class89.method636(25473, 5);
        class164.method1157(5, -1339);
        class61.method431(5, -1641);
        class278.method1848(5, 127);
        class197.method1346(5, (byte) 41);
        class2.method43(98, 5);
        class29.method261(5, (byte) 69);
        class32.method276(5, (byte) 112);
        class104.method730(-5185, 50);
        class134.method927(8127, 5);
        class253.method1706(arg0, 5);
        class96.field1532.method1478(5, 112);
        class126.field2203.method1478(5, 105);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZI)I")
    public static final int method1773(int arg0, boolean arg1, int arg2) {
        int var3 = class64.method446(1, 4, arg0 + 45365, arg2 + 91923) + ((class64.method446(1, 2, arg0 + 10294, arg2 + 37821) + -128 >> 1) - -(class64.method446(1, 1, arg0, arg2) + -128 >> 2)) - 128;
        if (arg1) {
            return 118;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field4635++;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
    public final int method1774(byte arg0) {
        field4627++;
        if (arg0 > -23) {
            this.field4629 = 18;
        }
        return (this.field4629 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLua;)Z")
    public static final boolean method1775(boolean arg0, class113 arg1) {
        field4626++;
        if (!arg0) {
            field4636 = null;
        }
        if (arg1.field1899 == 205) {
            class252.field4406 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class262() {
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
    public final int method1776(int arg0) {
        field4638++;
        return arg0 == 6696 ? this.field4629 & 0x7 : -119;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static final void method1777(int arg0) {
        field4630++;
        if (class75.method562(arg0 ^ 0xFFFFFF8B) != 2) {
            return;
        }
        if (arg0 != 1) {
            method1771(10, 107);
        }
        byte var1 = (byte) (class102.field1665 - 4 & 0xFF);
        int var2 = class102.field1665 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class268.field4705[var3][var2][var16] = var1;
            }
        }
        if (class231.field4013 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class54.field879[var4] = -1000000;
            class109.field1826[var4] = 1000000;
            class275.field4769[var4] = 0;
            class194.field3419[var4] = 1000000;
            class8.field177[var4] = 0;
        }
        if (class4.field113 != 1) {
            int var5 = class158.method1123(class231.field4013, client.field2695, -6230, class78.field1273);
            if (var5 - class22.field406 < 800 && (class259.field4598[class231.field4013][client.field2695 >> 7][class78.field1273 >> 7] & 0x4) != 0) {
                class100.method714(-1, class220.field3787, 1, class78.field1273 >> 7, false, client.field2695 >> 7);
                return;
            }
            return;
        }
        if ((class259.field4598[class231.field4013][field4631.field4791 >> 7][field4631.field4793 >> 7] & 0x4) != 0) {
            class100.method714(-1, class220.field3787, 0, field4631.field4793 >> 7, false, field4631.field4791 >> 7);
        }
        if (class8.field170 >= 310) {
            return;
        }
        int var6 = client.field2695 >> 7;
        int var7 = class78.field1273 >> 7;
        int var8 = field4631.field4791 >> 7;
        int var9 = field4631.field4793 >> 7;
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class259.field4598[class231.field4013][var6][var7] & 0x4) != 0) {
                    class100.method714(-1, class220.field3787, 1, var7, false, var6);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class259.field4598[class231.field4013][var6][var7] & 0x4) != 0) {
                        class100.method714(arg0 - 2, class220.field3787, 1, var7, false, var6);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var8 > var6) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class259.field4598[class231.field4013][var6][var7] & 0x4) != 0) {
                class100.method714(-1, class220.field3787, 1, var7, false, var6);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var9 > var7) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                var15 -= 65536;
                if ((class259.field4598[class231.field4013][var6][var7] & 0x4) != 0) {
                    class100.method714(-1, class220.field3787, 1, var7, false, var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static void method1778(byte arg0) {
        field4632 = null;
        field4621 = null;
        field4624 = null;
        field4637 = null;
        if (arg0 == 115) {
            field4631 = null;
            field4636 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Llj;)V")
    public class262(class25 arg0) {
        this.field4629 = arg0.method200(32768);
        this.field4623 = arg0.method193((byte) 77);
        this.field4620 = arg0.method199((byte) -85);
        this.field4622 = arg0.method199((byte) -85);
        this.field4633 = arg0.method199((byte) -85);
        this.field4625 = arg0.method199((byte) -85);
    }
}
