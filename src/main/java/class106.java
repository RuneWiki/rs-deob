import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class106 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lwa;")
    private static class75 field1783 = class66.method560("Prepared sound engine", false);

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lwa;")
    public static class75 field1782 = field1783;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lwa;")
    private static class75 field1781 = class66.method560("World", false);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[Lwa;")
    public static class75[] field1779 = new class75[200];

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lwa;")
    public static class75 field1788 = class66.method560("l", false);

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lwa;")
    public static class75 field1790 = field1781;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lwa;")
    private static class75 field1789 = class66.method560("glow3:", false);

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lwa;")
    public static class75 field1784 = field1789;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lwa;")
    public static class75 field1787 = field1789;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method827(boolean arg0, int arg1) {
        if (arg0) {
            field1780++;
            return (arg1 >> 30 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 19)
    public static void method828(int arg0) {
        field1790 = null;
        field1784 = null;
        field1783 = null;
        field1787 = null;
        field1788 = null;
        field1781 = null;
        field1789 = null;
        field1782 = null;
        field1779 = null;
        if (arg0 != -8878) {
            method829(-56, -124, true, -63, 103, 19, -46);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZIIII)V", line = 54)
    public static final void method829(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1786++;
        int var7 = class14.method74(class294.field5041, arg5, -1178441849, class90.field1495);
        int var8 = class14.method74(class294.field5041, arg1, -1178441849, class90.field1495);
        if (!arg2) {
            return;
        }
        int var9 = class14.method74(class288.field4956, arg0, -1178441849, class153.field2635);
        int var10 = class14.method74(class288.field4956, arg4, -1178441849, class153.field2635);
        int var11 = class14.method74(class294.field5041, arg5 + arg3, -1178441849, class90.field1495);
        int var12 = class14.method74(class294.field5041, arg1 - arg3, -1178441849, class90.field1495);
        for (int var13 = var7; var13 < var11; var13++) {
            class150.method1151(7, class63.field1096[var13], var9, arg6, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class150.method1151(7, class63.field1096[var14], var9, arg6, var10);
        }
        int var15 = class14.method74(class288.field4956, arg0 + arg3, -1178441849, class153.field2635);
        int var16 = class14.method74(class288.field4956, arg4 - arg3, -1178441849, class153.field2635);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class63.field1096[var17];
            class150.method1151(7, var18, var9, arg6, var15);
            class150.method1151(7, var18, var16, arg6, var10);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I", line = 106)
    public static final int method830(int arg0, int arg1) {
        field1785++;
        if (arg1 != 200) {
            field1781 = (class75) null;
        }
        return arg0 & 0xFF;
    }
}
