import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class355 implements class95 {

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "[I")
    public static int[] field5631 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "F")
    public static float field5628 = 0.0F;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field5632 = 0;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field5639 = -1;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Lah;")
    public static class176 field5630;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Lnm;")
    public static class221 field5638;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "[B")
    public static byte[] field5634;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2475(int arg0, int arg1) {
        field5637++;
        class6.field76 = 100;
        class2.field14 = -1;
        class325.field5326 = arg1;
        class268.field4416 = 3;
        if (arg0 != 1) {
            field5639 = 8;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 28)
    public static final void method2476(Component arg0, int arg1) {
        if (arg1 > -36) {
            field5630 = (class176) null;
        }
        field5627++;
        arg0.removeKeyListener(class300.field4960);
        arg0.removeFocusListener(class300.field4960);
        class198.field3040 = -1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I", line = 43)
    public static final int method2477(int arg0) {
        field5636++;
        if (arg0 != 1) {
            field5628 = -0.03114417F;
        }
        return ((class58.field878 == 0 ? 0 : 1) << 22) + (class162.field2580 & 0x3 << 11) + ((class121.field1814 ? 1 : 0) << 9) + ((class295.field4905 ? 1 : 0) << 7) + ((class115.field1680 ? 1 : 0) << 6) + ((class118.field1725 ? 1 : 0) << 5) + ((class153.field2486 ? 1 : 0) << 4) + (class75.field1138 & 0x7) + (((class242.field3816 ? 1 : 0) << 3) - -((class178.field2777 ? 1 : 0) << 8) + (((class142.field2279 ? 1 : 0) << 10) - (-((class322.field5287 ? 1 : 0) << 13) - ((class347.field5557 ? 1 : 0) << 15)) - -((class96.field1398 ? 1 : 0) << 16) - -(class31.field478 << 17)) - (-((class352.field5610 ? 1 : 0) << 19) - (((class182.field2824 == 0 ? 0 : 1) << 20) - -((class315.field5201 == 0 ? 0 : 1) << 21) - -(class145.method1033() << 23))));
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 71)
    public static void method2478(int arg0) {
        field5630 = null;
        field5634 = null;
        field5631 = null;
        field5638 = null;
        if (arg0 != -3) {
            field5638 = (class221) null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILsi;I)V", line = 84)
    public static final void method2479(byte arg0, int arg1, class264 arg2, int arg3) {
        field5635++;
        if (arg2.field4257 == 0) {
            arg2.field4310 = arg2.field4331;
        } else if (arg2.field4257 == 1) {
            arg2.field4310 = (arg1 - arg2.field4223) / 2 + arg2.field4331;
        } else if (arg2.field4257 == 2) {
            arg2.field4310 = arg1 - (arg2.field4223 + arg2.field4331);
        } else if (arg2.field4257 == 3) {
            arg2.field4310 = arg2.field4331 * arg1 >> 14;
        } else if (arg2.field4257 == 4) {
            arg2.field4310 = (arg2.field4331 * arg1 >> 14) + (arg1 - arg2.field4223) / 2;
        } else {
            arg2.field4310 = arg1 - arg2.field4223 - (arg2.field4331 * arg1 >> 14);
        }
        if (arg2.field4270 == 0) {
            arg2.field4286 = arg2.field4345;
        } else if (arg2.field4270 == 1) {
            arg2.field4286 = (arg3 - arg2.field4236) / 2 + arg2.field4345;
        } else if (arg2.field4270 == 2) {
            arg2.field4286 = arg3 - arg2.field4236 - arg2.field4345;
        } else if (arg2.field4270 == 3) {
            arg2.field4286 = arg2.field4345 * arg3 >> 14;
        } else if (arg2.field4270 == 4) {
            arg2.field4286 = (arg3 - arg2.field4236) / 2 + (arg2.field4345 * arg3 >> 14);
        } else {
            arg2.field4286 = arg3 - arg2.field4236 - (arg2.field4345 * arg3 >> 14);
        }
        if (arg0 > -7 || !class172.field2693 || !(client.method898(arg2).field1155 != 0 || arg2.field4350 == 0)) {
            return;
        }
        if (arg2.field4310 < 0) {
            arg2.field4310 = 0;
        } else if (arg1 < arg2.field4310 + arg2.field4223) {
            arg2.field4310 = arg1 - arg2.field4223;
        }
        if (arg2.field4286 < 0) {
            arg2.field4286 = 0;
        } else if (arg2.field4286 + arg2.field4236 > arg3) {
            arg2.field4286 = arg3 - arg2.field4236;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([IIBJ)Ljava/lang/String;", line = 157)
    public final String method630(int[] arg0, int arg1, byte arg2, long arg3) {
        field5633++;
        if (arg2 != -16) {
            field5628 = -0.8024567F;
        }
        if (arg1 == 0) {
            class341 var6 = class334.method2360((byte) 122, arg0[0]);
            return var6.method2413((int) arg3, 4);
        } else if (arg1 == 1 || arg1 == 10) {
            class109 var7 = class322.method2311((int) arg3, -116);
            return var7.field1596;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class334.method2360((byte) 122, arg0[0]).method2413((int) arg3, 4);
        } else {
            return null;
        }
    }
}
