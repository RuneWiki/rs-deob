import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class271 extends class458 {

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "[I")
    public static int[] field3779 = new int[1];

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "J")
    public long field3771;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "(B)V", line = 4)
    public static void method1647(byte arg0) {
        if (arg0 >= -14) {
            field3781 = 15;
        }
        field3779 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method1648(int arg0, int arg1, int arg2) {
        field3782++;
        if (arg0 != 0) {
            return false;
        } else if (class459.method2614(arg2, (byte) -106, arg1)) {
            return (arg2 & 0x9000) != 0 | class156.method1091(arg2, -28635, arg1) | class189.method1239(false, arg2, arg1) ? true : (arg1 & 0x37) == 0 & (class441.method2498(arg1, arg0 ^ 0x11, arg2) | (arg2 & 0x2000) != 0 | class563.method3089(-102, arg1, arg2));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)I", line = 39)
    public final int method1649(int arg0) {
        field3776++;
        return arg0 == -20210 ? this.field3777 : 93;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)I", line = 53)
    public final int method1650(int arg0) {
        if (arg0 != 0) {
            this.method1649(127);
        }
        field3773++;
        return this.field3774;
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)J", line = 68)
    public final long method1651(byte arg0) {
        field3770++;
        if (arg0 <= 79) {
            this.field3774 = 39;
        }
        return this.field3771;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)I", line = 79)
    public static final int method1652(byte arg0, int arg1) {
        int var2 = 77 % ((arg0 - 14) / 54);
        field3775++;
        return (arg1 & 0x3FDD6) >> 11;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Loa;I)V", line = 91)
    public static final void method1653(class651 arg0, int arg1) {
        field3783++;
        if (arg1 != -27617 || class94.field1439.method3261((byte) -67) == 0) {
            return;
        }
        if (class571.field7587 == 0) {
            for (class674 var2 = (class674) class94.field1439.method3257(-52); var2 != null; var2 = (class674) class94.field1439.method3263((byte) -112)) {
                class193.field2826.method1039(arg1 + 27698, class700.field9851, false, arg0, false, var2.field9531, var2.field9530, arg0, var2.field9539, var2.field9532 ? class199.field2897.field5362 : null, var2.field9536, var2.field9533);
                var2.method2797(-119);
            }
            class449.method2540((byte) -45);
            return;
        }
        if (class356.field4835 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class356.field4835 = class651.method3571(0, var3, -60, 0, class230.field3220, class94.field1447);
            class516.field6893 = class356.field4835.method389(class384.method2238(0, class688.field9680, (byte) -99, class68.field1035), class500.method2777(class658.field9155, class688.field9680, 0), true);
        }
        for (class674 var4 = (class674) class94.field1439.method3257(-56); var4 != null; var4 = (class674) class94.field1439.method3263((byte) -104)) {
            class193.field2826.method1039(arg1 + 27698, class516.field6893, false, class356.field4835, false, var4.field9531, var4.field9530, arg0, var4.field9539, var4.field9532 ? class199.field2897.field5362 : null, var4.field9536, var4.field9533);
            var4.method2797(-97);
        }
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)I", line = 146)
    public final int method1654(byte arg0) {
        if (arg0 != 96) {
            method1652((byte) 118, -105);
        }
        field3780++;
        return this.field3772;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)I", line = 158)
    public final int method1655(byte arg0) {
        if (arg0 == 29) {
            field3778++;
            return 0;
        } else {
            return -61;
        }
    }
}
