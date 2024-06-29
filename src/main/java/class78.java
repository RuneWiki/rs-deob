import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class78 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lrd;")
    public static class114 field1779 = class84.method656("sideicons", (byte) 127);

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
    public static int[] field1784 = new int[5];

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lrd;")
    private static class114 field1785 = class84.method656("World", (byte) 122);

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lrd;")
    public static class114 field1777 = field1785;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "[[Lnd;")
    public static class90[][] field1772;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method617(byte arg0) {
        field1784 = null;
        field1785 = null;
        if (arg0 != 4) {
            method619(106, null, 108, true, 35, 42, null, null);
        }
        field1779 = null;
        field1772 = null;
        field1777 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZLpb;IIB)V")
    public static final synchronized void method618(int arg0, int arg1, boolean arg2, class100 arg3, int arg4, int arg5, byte arg6) {
        field1786++;
        if (!class131.method1049(-71)) {
            return;
        }
        class36.field726 = true;
        class51.field1057 = arg4;
        class26.field521 = arg3;
        class13.field292 = arg5;
        if (arg6 != 124) {
            method620(19, false, -12, 89, 72, -109, null, -73);
        }
        class51.field1061 = -1;
        class58.field1203 = arg1;
        class36.field727 = -1;
        class101.field2326 = arg0;
        class116.field2705 = arg2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILpb;IZIILrd;Lrd;)V")
    public static final synchronized void method619(int arg0, class100 arg1, int arg2, boolean arg3, int arg4, int arg5, class114 arg6, class114 arg7) {
        if (arg5 != 255) {
            method617((byte) 52);
        }
        field1773++;
        if (class131.method1049(-56)) {
            int var8 = arg1.method766(arg6, (byte) -115);
            int var9 = arg1.method752(arg7, -31757, var8);
            method620(arg2, arg3, arg0, -5, arg4, var9, arg1, var8);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIIILpb;I)V")
    public static final synchronized void method620(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class100 arg6, int arg7) {
        field1783++;
        if (!class131.method1049(-66)) {
            return;
        }
        class116.field2705 = arg1;
        if (arg3 != -5) {
            field1772 = null;
        }
        class51.field1061 = arg4;
        class13.field292 = arg0;
        class58.field1203 = arg7;
        class36.field727 = -1;
        class101.field2326 = arg5;
        class36.field726 = true;
        class26.field521 = arg6;
        class51.field1057 = arg2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final synchronized void method621(int arg0) {
        field1774++;
        if (!class131.method1049(-127)) {
            return;
        }
        class20.method134(87);
        class36.field726 = false;
        if (arg0 >= -113) {
            method622(-33, (byte) -1);
        }
        class26.field521 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
    public static final synchronized void method622(int arg0, byte arg1) {
        if (arg1 != 13) {
            field1785 = null;
        }
        field1771++;
        if (class131.method1049(-112)) {
            class120.method938(arg0, 17923);
            class26.field521 = null;
            class36.field726 = false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static final synchronized void method623(byte arg0) {
        class116.method900((byte) -87);
        if (arg0 == -104) {
            field1782++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILke;I)V")
    public static final void method624(int arg0, class73 arg1, int arg2) {
        field1781++;
        if (class88.field1969 != null) {
            class88.field1969.field1227 = arg2 * 4 + 5;
            int var3 = class88.field1969.method442((byte) -80);
            arg1.method592(-30004, var3);
            return;
        }
        class128.method989(null, 255, 0, (byte) -16, 255, (byte) 0, true);
        if (arg0 <= 7) {
            field1785 = null;
        }
        class126.field3020[arg2] = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BILhe;I)V")
    public static final void method625(byte arg0, int arg1, class54 arg2, int arg3) {
        field1775++;
        if (arg2 == null) {
            return;
        }
        int var4 = class92.field2159 + class69.field1505 & 0x7FF;
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (var5 > 6400) {
            return;
        }
        if (arg0 < 94) {
            method624(-84, null, 61);
        }
        int var6 = class134.field3272[var4];
        int var7 = var6 * 256 / (class48.field997 + 256);
        int var8 = class134.field3279[var4];
        int var9 = var8 * 256 / (class48.field997 + 256);
        int var10 = arg1 * var7 + arg3 * var9 >> 16;
        int var11 = arg1 * var9 - arg3 * var7 >> 16;
        if (var5 <= 2500) {
            arg2.method400(var10 + 94 + 4 - arg2.field1132 / 2, -(arg2.field1131 / 2) - 4 + -var11 + 83);
        } else {
            arg2.method399(class49.field1021, var10 + 94 + 4 - arg2.field1132 / 2, 83 - (arg2.field1131 / 2 + var11) + -4);
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static final synchronized void method626(byte arg0) {
        field1780++;
        if (!class131.method1049(-114)) {
            return;
        }
        if (class36.field726) {
            byte[] var1 = class32.method234((byte) -115, class26.field521, class58.field1203, class101.field2326, class51.field1057);
            if (var1 != null) {
                if (class51.field1061 >= 0) {
                    class142.method1138(class13.field292, 1, var1, class51.field1061, class116.field2705);
                } else if (class36.field727 < 0) {
                    class63.method513((byte) -105, class13.field292, var1, class116.field2705);
                } else {
                    class77.method614(-35, class13.field292, var1, class116.field2705, class36.field727);
                }
                class26.field521 = null;
                class36.field726 = false;
            }
        }
        if (arg0 <= 66) {
            field1777 = null;
        }
        class38.method275(true);
    }
}
