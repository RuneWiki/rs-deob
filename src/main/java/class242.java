import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class242 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[I")
    public static int[] field3747 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3751 = 0;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3752 = -1;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIIII)V", line = 5)
    public static final void method1717(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 - arg0 >= class319.field4965 && class116.field1888 >= (arg0 + arg5) && class188.field2995 <= arg6 - arg0 && arg6 + arg0 <= class195.field3108) {
            class23.method163(arg3, -128, arg1, arg5, arg0, arg4, arg6);
        } else {
            class247.method1755(arg0, arg1, arg6, arg3, (byte) 68, arg4, arg5);
        }
        if (arg2 != -128) {
            method1722((class101) null, -28);
        }
        field3753++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIII)V", line = 22)
    public static final void method1718(byte arg0, int arg1, int arg2, int arg3) {
        field3749++;
        if (arg0 != 107) {
            field3751 = -105;
        }
        class4 var4 = class67.method510(arg0 ^ 0x6A, 11, arg2);
        var4.method14(24710);
        var4.field15 = arg3;
        var4.field20 = arg1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I", line = 44)
    public static final int method1719(int arg0) {
        field3750++;
        if (class52.field823 != null) {
            return 3;
        }
        if (arg0 != 0) {
            field3752 = -53;
        }
        if (class265.field4126 && class29.field476) {
            return 2;
        } else if (class265.field4126 && !class29.field476) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V", line = 68)
    public static final void method1720(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            method1723(-62);
        }
        field3746++;
        if (arg2 < arg1) {
            for (int var5 = arg2; var5 < arg1; var5++) {
                class102.field1729[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg1; var6 < arg2; var6++) {
                class102.field1729[var6][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lpb;Lpb;B)V", line = 104)
    public static final void method1721(class78 arg0, class78 arg1, byte arg2) {
        field3748++;
        if (arg0.field1197 != null) {
            arg0.method571(7);
        }
        arg0.field1197 = arg1;
        if (arg2 < -61) {
            arg0.field1195 = arg1.field1195;
            arg0.field1197.field1195 = arg0;
            arg0.field1195.field1197 = arg0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lpe;I)Lqi;", line = 121)
    public static final class303 method1722(class101 arg0, int arg1) {
        if (arg1 != 37) {
            field3747 = (int[]) null;
        }
        field3745++;
        arg0.method741(arg1 ^ 0x5D);
        int var2 = arg0.method741(103);
        class303 var3 = class254.method1805((byte) -118, var2);
        var3.field4771 = arg0.method741(arg1 ^ 0x11);
        int var4 = arg0.method741(arg1 ^ 0x34);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method741(arg1 ^ 0x65);
            var3.method65(arg1 - 4041, arg0, var6);
        }
        var3.method70(30);
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 159)
    public static void method1723(int arg0) {
        field3747 = null;
        if (arg0 != 25771) {
            method1723(-1);
        }
    }
}
