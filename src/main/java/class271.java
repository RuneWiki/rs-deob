import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class271 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Llc;")
    public static class143 field4836 = class66.method374("Lade Texturen )2 ", -1);

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Llc;")
    public static class143 field4838 = class66.method374("Chargement des sprites )2 ", -1);

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Llc;")
    public static class143 field4844 = class66.method374("leuchten1:", -1);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Llc;")
    public static class143 field4837 = class66.method374(" ", -1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lvg;")
    public static class230 field4835;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLlc;)Z")
    public static final boolean method1788(byte arg0, class143 arg1) {
        field4834++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 > -74) {
            method1790((class43) null, true);
        }
        for (int var2 = 0; var2 < class25.field421; var2++) {
            if (arg1.method895((byte) -122, class237.field4305[var2])) {
                return true;
            }
        }
        return arg1.method895((byte) -115, class229.field4195.field518);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method1789(byte arg0) {
        field4841++;
        if (class185.field3366 != null) {
            class185.field3366.method1652(1024);
        }
        if (class231.field4232 != null) {
            class231.field4232.method1652(1024);
        }
        class269.method1780(-1, class88.field1594, 2, 22050);
        int var1 = -73 % ((arg0 - 30) / 44);
        class185.field3366 = class172.method1126(class155.field2792, 0, class4.field62, -3, 22050);
        class185.field3366.method1655(class174.field3121, (byte) 126);
        class231.field4232 = class172.method1126(class155.field2792, 1, class4.field62, 8, 2048);
        class231.field4232.method1655(class86.field1578, (byte) 113);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lvh;Z)V")
    public static final void method1790(class43 arg0, boolean arg1) {
        field4843++;
        int var2 = arg0.field862;
        if (var2 == 324) {
            if (class192.field3540 == -1) {
                class192.field3540 = arg0.field746;
                class1.field24 = arg0.field745;
            }
            if (class168.field2997.field1987) {
                arg0.field746 = class192.field3540;
            } else {
                arg0.field746 = class1.field24;
            }
        } else if (var2 == 325) {
            if (class192.field3540 == -1) {
                class192.field3540 = arg0.field746;
                class1.field24 = arg0.field745;
            }
            if (class168.field2997.field1987) {
                arg0.field746 = class1.field24;
            } else {
                arg0.field746 = class192.field3540;
            }
        } else {
            if (arg1) {
                field4835 = null;
            }
            if (var2 == 327) {
                arg0.field854 = 150;
                arg0.field830 = (int) (Math.sin((double) class146.field2635 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field755 = -1;
                arg0.field785 = 5;
            } else if (var2 == 328) {
                if (class229.field4195.field518 == null) {
                    arg0.field755 = 0;
                } else {
                    arg0.field854 = 150;
                    arg0.field830 = (int) (Math.sin((double) class146.field2635 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field785 = 5;
                    arg0.field755 = ((int) class229.field4195.field518.method874(7) << 11) + 2047;
                    arg0.field853 = class229.field4195.field4133;
                    arg0.field884 = class229.field4195.field4184;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1791(int arg0) {
        field4836 = null;
        field4838 = null;
        field4835 = null;
        if (arg0 < 95) {
            field4836 = null;
        }
        field4837 = null;
        field4844 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
    public static final void method1792(int arg0, byte arg1) {
        class124.field2185.method835(1, arg0);
        field4839++;
        if (arg1 != -111) {
            field4844 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLvh;IIIII)V")
    public static final void method1793(byte arg0, class43 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 * arg2 + arg4 * arg4;
        field4842++;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg1.field735 / 2, arg1.field831 / 2);
        if (arg0 > -3) {
            method1792(-10, (byte) -127);
        }
        if (var8 * var8 >= var7) {
            class230.method1566((byte) -73, arg3, arg1, arg4, arg2, class242.field4349[arg6], arg5);
            return;
        }
        int var9 = class184.field3339 + class137.field2400 & 0x7FF;
        int var10 = class196.field3635[var9];
        int var11 = class196.field3630[var9];
        int var12 = var11 * 256 / (class230.field4211 + 256);
        var8 -= 10;
        int var13 = var10 * 256 / (class230.field4211 + 256);
        int var14 = arg2 * var13 + arg4 * var12 >> 16;
        int var15 = arg2 * var12 - arg4 * var13 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class160) class35.field610[arg6]).method1060(arg1.field735 / 2 + arg3 + var18 - 10, arg1.field831 / 2 + arg5 + -var19 - 10, 20, 20, 15, 15, var16, 256);
    }
}
