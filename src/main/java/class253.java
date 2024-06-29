import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class253 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lli;")
    public static class185 field4496 = class245.method1649("scape main", -53);

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[I")
    public static int[] field4497 = new int[32];

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field4500 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public int field4493;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lpa;")
    public static final class2 method1712(int arg0, int arg1) {
        field4498++;
        class2 var2 = (class2) class109.field1964.method82(126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -118) {
            method1712(118, 13);
        }
        byte[] var3 = class27.field452.method1688(0, class185.method1345(arg0, 71), class12.method105(10429, arg0));
        class2 var4 = new class2();
        if (var3 != null) {
            var4.method28(new class118(var3), -1);
        }
        var4.method24(0);
        class109.field1964.method84(84, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1713(byte arg0) {
        field4496 = null;
        int var1 = -126 % ((arg0 + 52) / 39);
        field4497 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BILgb;IIII)V")
    public static final void method1714(byte arg0, int arg1, class142 arg2, int arg3, int arg4, int arg5, int arg6) {
        field4490++;
        class81.method521(arg2.field2687, -78, arg2.field2694, arg5, arg4, arg6, arg3, arg1);
        if (arg0 != 120) {
            field4497 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
    public static final void method1715(int arg0, int arg1, int arg2) {
        field4492++;
        if (class193.field3568 != 0 && arg2 != -1) {
            class38.method241(class148.field2801, class193.field3568, -89, 0, false, arg2);
            class134.field2405 = true;
        }
        int var3 = 57 % ((arg0 + 50) / 61);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)V")
    public static final void method1716(int arg0, int arg1) {
        int var2 = -4 % ((-arg1 - 1) / 62);
        class217.field3977.method85((byte) 75, arg0);
        field4495++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZIZIB)V")
    public static final void method1717(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        field4489++;
        if (arg1 == 3) {
            method1717(arg0, class56.field965, true, -1, true, -1, (byte) -121);
            return;
        }
        Container var7;
        if (class144.field2746 != null) {
            var7 = class144.field2746;
        } else if (class131.field2357 == null) {
            var7 = class124.field2238.field3022;
        } else {
            var7 = class131.field2357;
        }
        class201.field3680 = var7.getSize().width;
        class266.field4715 = var7.getSize().height;
        if (class131.field2357 == var7) {
            Insets var8 = class131.field2357.getInsets();
            class266.field4715 -= var8.top + var8.bottom;
            class201.field3680 -= var8.right + var8.left;
        }
        if (arg1 < 2) {
            class148.field2796 = 503;
            class70.field1226 = 0;
            class204.field3738 = 765;
            class210.field3841 = (class201.field3680 - 765) / 2;
        } else {
            class70.field1226 = 0;
            class148.field2796 = class266.field4715;
            class204.field3738 = class201.field3680;
            class210.field3841 = 0;
        }
        if (arg4) {
            class43.method266(class30.field500, false);
            class150.method1066(class30.field500, 0);
            if (class282.field4976 != null) {
                class282.field4976.method1417(class30.field500, (byte) 23);
            }
            class88.field1730.method416(0);
            class188.method1353(class30.field500, 11951);
            class144.method1032(64, class30.field500);
            if (class282.field4976 != null) {
                class282.field4976.method1412((byte) -117, class30.field500);
            }
        } else {
            class30.field500.setSize(class204.field3738, class148.field2796);
            if (class131.field2357 == var7) {
                Insets var9 = class131.field2357.getInsets();
                class30.field500.setLocation(class210.field3841 + var9.left, class70.field1226 + var9.top);
            } else {
                class30.field500.setLocation(class210.field3841, class70.field1226);
            }
        }
        if (arg1 > 0) {
            method1717(arg0, 0, true, -1, true, -1, (byte) -83);
            return;
        }
        if (arg6 > -72) {
            method1716(-93, -49);
        }
        class77.field1349 = !class17.method125(84);
        if (class275.field4877 != -1) {
            class176.method1245(true, -1);
        }
        if (class125.field2252 != null && (class80.field1399 == 30 || class80.field1399 == 25)) {
            class52.method350(88);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class44.field700[var10] = true;
        }
        class181.field3324 = true;
    }
}
