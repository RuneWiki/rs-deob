import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class143 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "J")
    public static long field2598 = 0L;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2607 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lee;")
    public static class293 field2605;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1040(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -16532) {
            field2606 = 93;
        }
        if (class321.field5489 <= arg2 && arg2 <= class52.field795) {
            int var5 = class94.method645(class197.field3372, 0, arg4, class194.field3302);
            int var6 = class94.method645(class197.field3372, 0, arg3, class194.field3302);
            class251.method1700(55, arg2, var6, var5, arg1);
        }
        field2601++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lwd;I)V", line = 27)
    public static final void method1041(class112 arg0, int arg1) {
        if (arg1 <= 62) {
            return;
        }
        class112 var2 = class119.method783(arg0, 21);
        field2597++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class7.field87;
            var4 = class1.field6;
        } else {
            var3 = var2.field1766;
            var4 = var2.field1753;
        }
        class285.method1898(var4, arg0, var3, false, (byte) -87);
        class110.method723(var4, arg0, 75, var3);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V", line = 58)
    public static final void method1042(byte arg0, int arg1) {
        field2604++;
        if (arg1 >= 0 && class185.field3201.length > arg1) {
            class185.field3201[arg1] = !class185.field3201[arg1];
            if (arg0 < 46) {
                field2598 = 61L;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 76)
    public static void method1043(int arg0) {
        int var1 = -3 / ((9 - arg0) / 46);
        field2605 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLwd;)Z", line = 108)
    public static final boolean method1044(byte arg0, class112 arg1) {
        field2603++;
        if (arg1.field1867 == null) {
            return false;
        } else if (arg0 >= -83) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg1.field1867.length; var2++) {
                int var3 = class40.method253(var2, arg1, -86);
                int var4 = arg1.field1818[var2];
                if (arg1.field1867[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg1.field1867[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field1867[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }
}
