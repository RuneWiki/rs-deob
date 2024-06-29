import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class22 extends class117 {

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field284 = -1;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "Ljava/lang/String;")
    public static String field285 = " has logged out.";

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Ldk;")
    public static class251 field274;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)I")
    public static final int method118(byte arg0, int arg1) {
        if (arg0 <= 2) {
            return 11;
        } else {
            ++field279;
            return 127 & arg1 >> 11;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ldk;Ldk;I)V")
    public static final void method119(class251 arg0, class251 arg1, int arg2) {
        class82.field1370 = arg0;
        ++field273;
        if (arg2 != 23451) {
            method119((class251) null, (class251) null, -121);
        }
        class150.field2338 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "(I)V")
    public static final void method120(int arg0) {
        ++field278;
        if (class233.field3750 != null) {
            class233.field3750.method1922((byte) -115);
        }
        if (class62.field1024 != null) {
            class62.field1024.method1922((byte) -36);
        }
        class308.method2059(22050, class247.field3931, (byte) 123, 2);
        class233.field3750 = class92.method620(-1, class268.field4323, 22050, class131.field2064, 0);
        class233.field3750.method1926(class298.field4762, (byte) 80);
        class62.field1024 = class92.method620(-1, class268.field4323, 2048, class131.field2064, 1);
        class62.field1024.method1926(class6.field68, (byte) 96);
        if (arg0 > -38) {
            method125((Component) null, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)Llc;")
    public static final class307 method121(int arg0, boolean arg1) {
        class307 var2 = (class307) class274.field4404.method1261(0, (long) arg0);
        ++field280;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class245.field3894.method1680(class256.method1725(arg1, arg0), class273.method1829(arg0, false), -80);
            class307 var4 = new class307();
            var4.field4905 = arg0;
            if (var3 != null) {
                var4.method2052((byte) -119, new class162(var3));
            }
            var4.method2050(663);
            class274.field4404.method1264(-1, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IBI)I")
    public static final int method122(int arg0, byte arg1, int arg2) {
        if (arg1 != -37) {
            return 79;
        } else {
            ++field282;
            int var3 = arg0 >>> 31;
            return (arg0 - -var3) / arg2 + -var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class61.field992 == -2) {
            class173.field2821[class287.field4600 / 100].method1026(class136.field2151 + -8, class161.field2554 + -8);
        }
        if (arg2 != 929192351) {
            method119((class251) null, (class251) null, -90);
        }
        ++field281;
        if (class61.field992 == 2) {
            class173.field2821[class287.field4600 / 100 + 4].method1026(class136.field2151 + -8, class161.field2554 - 8);
        }
        class168.method1227(false);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class22() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V")
    public static void method124(int arg0) {
        field274 = null;
        if (arg0 == -1734) {
            field285 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method125(Component arg0, byte arg1) {
        if (arg1 < 2) {
            method120(-22);
        }
        arg0.removeKeyListener(class34.field516);
        arg0.removeFocusListener(class34.field516);
        class41.field603 = -1;
        ++field275;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field276;
        if (arg0 != 2) {
            field287 = 63;
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 73);
        if (super.field1883.field1313) {
            int[][] var4 = this.method838(0, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; class168.field2737 > var8; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)V")
    public static final void method126(int arg0, int arg1) {
        class136.field2145.method1262(arg1, 2736);
        ++field283;
        if (arg0 != -2) {
            method122(108, (byte) -43, 48);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILdk;)V")
    public static final void method127(int arg0, class251 arg1) {
        class49.field815 = arg1.method1699(0, "p11_full");
        class257.field4159 = arg1.method1699(0, "p12_full");
        ++field286;
        class255.field4135 = arg1.method1699(0, "b12_full");
        class192.field3120 = arg1.method1699(0, "hitmarks");
        class292.field4680 = arg1.method1699(0, "hitbar_default");
        class95.field1539 = arg1.method1699(0, "headicons_pk");
        class137.field2159 = arg1.method1699(0, "headicons_prayer");
        class84.field1394 = arg1.method1699(0, "hint_headicons");
        class304.field4862 = arg1.method1699(0, "hint_mapmarkers");
        class272.field4365 = arg1.method1699(0, "mapflag");
        class182.field2992 = arg1.method1699(0, "cross");
        class212.field3506 = arg1.method1699(0, "mapdots");
        if (arg0 > 54) {
            class97.field1561 = arg1.method1699(0, "scrollbar");
            class282.field4500 = arg1.method1699(0, "name_icons");
            class167.field2728 = arg1.method1699(0, "floorshadows");
            class11.field111 = arg1.method1699(0, "compass");
            class78.field1302 = arg1.method1699(0, "hint_mapedge");
        }
    }
}
