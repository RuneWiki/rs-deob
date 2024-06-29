import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class20 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lm;")
    private class72 field432 = new class72();

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lec;")
    public static class28 field438 = class28.method210(-46, "null");

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field446 = -1;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lec;")
    public static class28 field435 = class28.method210(-46, "To extend or cancel a subscription:*6n1(Y Logout and return to the frontpage of this website)3*6n2(YChoose the relevant option from the (Wmembership(W section)3*6n*6nNote: If you are a credit card subscriber a top)2up payment will*6nautomatically be taken when 3 days credit remain)3*6n(Xunless you cancel your subscription)1 which can be done at any time)3(Y");

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field434 = -1;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Z")
    public static volatile boolean field449 = true;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lec;")
    public static class28 field444 = class28.method210(-46, "Report abuse @whi@");

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Z")
    public static boolean field451 = false;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lec;")
    public static class28 field445 = class28.method210(-46, "To switch to a members)2only world:*6n1(Y Logout and return to the world selection page)3*6n2(Y Choose one of the members world with a gold star next to it(Ws name)3*6n*6nIf you prefer you can continue to use this world)1*6nbut members only features will be unavailable here)3");

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[Lwc;")
    public static class128[] field439;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lm;I)V")
    public final void method131(class72 arg0, int arg1) {
        field450++;
        if (arg0.field1604 != null) {
            arg0.method569(false);
        }
        arg0.field1604 = this.field432.field1604;
        arg0.field1605 = this.field432;
        arg0.field1604.field1605 = arg0;
        arg0.field1605.field1604 = arg0;
        if (arg1 != 0) {
            field436 = -106;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)[Lea;")
    public static final class26[] method132(int arg0) {
        field452++;
        class26[] var1 = new class26[class66.field1509];
        int var2 = 0;
        if (arg0 >= -104) {
            method139((byte) 36, null, null);
        }
        while (class66.field1509 > var2) {
            class26 var3 = var1[var2] = new class26();
            var3.field564 = class72.field1613;
            var3.field566 = class106.field2250;
            var3.field569 = class61.field1365[var2];
            var3.field567 = class25.field552[var2];
            var3.field568 = class118.field2514[var2];
            var3.field565 = class62.field1382[var2];
            int var4 = var3.field568 * var3.field565;
            byte[] var5 = class123.field2682[var2];
            var3.field563 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field563[var6] = class53.field1219[class106.method732(255, var5[var6])];
            }
            var2++;
        }
        class51.method409(-91);
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method133(int arg0) {
        field439 = null;
        field438 = null;
        field435 = null;
        if (arg0 != 0) {
            method137((byte) -22, 70, -52);
        }
        field444 = null;
        field445 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lm;B)V")
    public final void method134(class72 arg0, byte arg1) {
        if (arg0.field1604 != null) {
            arg0.method569(false);
        }
        field447++;
        arg0.field1604 = this.field432;
        arg0.field1605 = this.field432.field1605;
        arg0.field1604.field1605 = arg0;
        arg0.field1605.field1604 = arg0;
        int var3 = -60 % ((-arg1 - 46) / 48);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class20() {
        this.field432.field1605 = this.field432;
        this.field432.field1604 = this.field432;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static final void method135(boolean arg0) {
        while (true) {
            if (class56.field1282.method155((byte) 47, class76.field1692) >= 26) {
                int var1 = class56.field1282.method159(0, 14);
                if (var1 != 16383) {
                    if (class88.field1956[var1] == null) {
                        class88.field1956[var1] = new class90();
                    }
                    class90 var2 = class88.field1956[var1];
                    class64.field1429[class64.field1430++] = var1;
                    var2.field1458 = class83.field1888;
                    int var3 = class56.field1282.method159(0, 5);
                    int var4 = class56.field1282.method159(0, 1);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    var2.field1996 = class8.method42(class56.field1282.method159(0, 13), 103);
                    int var5 = class56.field1282.method159(0, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class56.field1282.method159(0, 1);
                    if (var6 == 1) {
                        class25.field557[class16.field306++] = var1;
                    }
                    var2.field1486 = var2.field1996.field2268;
                    var2.field1500 = var2.field1996.field2235;
                    var2.field1449 = var2.field1996.field2249;
                    var2.field1451 = var2.field1996.field2236;
                    var2.field1445 = var2.field1996.field2259;
                    var2.field1433 = var2.field1996.field2252;
                    var2.field1469 = var2.field1996.field2264;
                    var2.method519(64, var4 == 1, class37.field848.field1466[0] + var5, class37.field848.field1487[0] + var3);
                    continue;
                }
            }
            field431++;
            class56.field1282.method163((byte) 66);
            if (!arg0) {
                method133(93);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)Lm;")
    public final class72 method136(int arg0) {
        field433++;
        class72 var2 = this.field432.field1605;
        if (this.field432 == var2) {
            return null;
        } else if (arg0 == -5431) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
    public static final void method137(byte arg0, int arg1, int arg2) {
        class42 var3 = class127.field2746[class122.field2657][arg1][arg2];
        field437++;
        if (var3 == null) {
            class11.field179.method771(class122.field2657, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class34 var5 = null;
        if (arg0 > -107) {
            method133(-56);
        }
        for (class34 var6 = (class34) var3.method326(0); var6 != null; var6 = (class34) var3.method325((byte) 119)) {
            class129 var11 = class129.method992(var6.field764, -103);
            int var12 = var11.field2804;
            if (var11.field2801) {
                var12 = (var6.field766 + 1) * var12;
            }
            if (var12 > var4) {
                var4 = var12;
                var5 = var6;
            }
        }
        var3.method324(65, var5);
        class34 var7 = null;
        class34 var8 = (class34) var3.method326(0);
        int var9 = (arg2 << 7) + arg1 + 1610612736;
        class34 var10 = null;
        while (var8 != null) {
            if (var5.field764 != var8.field764 && var7 == null) {
                var7 = var8;
            }
            if (var5.field764 != var8.field764 && var7.field764 != var8.field764 && var10 == null) {
                var10 = var8;
            }
            var8 = (class34) var3.method325((byte) 125);
        }
        class11.field179.method784(class122.field2657, arg1, arg2, class18.method107(arg2 * 128 + 64, arg1 * 128 + 64, -2049, class122.field2657), var5, var9, var7, var10);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)Lm;")
    public final class72 method138(boolean arg0) {
        field442++;
        class72 var2 = this.field432.field1605;
        if (arg0) {
            field446 = -94;
        }
        if (this.field432 == var2) {
            return null;
        } else {
            var2.method569(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/awt/Component;Lnd;)Lid;")
    public static final class52 method139(byte arg0, Component arg1, class82 arg2) {
        class83.method630(arg2, arg1, 17853);
        field443++;
        if (arg0 < 89) {
            field436 = 50;
        }
        class52 var3 = new class52();
        class88.method656((byte) 122, var3);
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZLvb;Lvb;)Lqc;")
    public static final class98 method140(int arg0, int arg1, boolean arg2, class122 arg3, class122 arg4) {
        if (arg1 != 26) {
            method135(false);
        }
        boolean var5 = true;
        field441++;
        int[] var6 = arg3.method931(1, arg0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method926(var6[var7], 27, arg0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg4.method926(var9, arg1 ^ 0x6A, 0);
                } else {
                    var10 = arg4.method926(0, 59, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class98(arg3, arg4, arg0, arg2);
        } catch (Exception var11) {
            return null;
        }
    }
}
