import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class144 {

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[I")
    public static int[] field2432 = new int[14];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ls;")
    public static class186 field2429 = new class186(20, -1);

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[I")
    public static int[] field2436 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static final void method1071(byte arg0) {
        field2433++;
        int var1 = 74 % ((-arg0 - 16) / 54);
        for (int var2 = 0; var2 < class360.field5288.length; var2++) {
            for (int var3 = 0; var3 < class360.field5288[var2].length; var3++) {
                class360.field5288[var2][var3] = class322.field4924;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILgh;Z)V")
    public static final void method1072(int arg0, int arg1, class388 arg2, boolean arg3) {
        field2435++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field5754 != null) {
            class322 var4 = new class322();
            var4.field4918 = arg2;
            var4.field4911 = arg2.field5754;
            class495.method2982(var4);
        }
        class220.field3455 = arg2.field5738;
        class233.field3597 = true;
        class160.field2579 = arg2.field5688;
        class352.field5194 = arg0;
        class271.field4116 = arg2.field5681;
        if (arg3) {
            field2437 = -13;
        }
        class506.field7383 = arg2.field5700;
        class364.field5326 = arg1;
        class341.field5130 = arg2.field5777;
        class429.method2587(arg2, (byte) -63);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
    public static final boolean method1073(int arg0, int arg1) {
        field2434++;
        if (arg0 <= 41) {
            return false;
        } else {
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Z")
    public static final boolean method1074(int arg0, int arg1) {
        field2430++;
        if (arg0 != 44) {
            field2432 = null;
        }
        for (class328 var2 = (class328) class373.field5469.method1892(arg0 + 76); var2 != null; var2 = (class328) class373.field5469.method1893((byte) -2)) {
            if (class470.method2810(arg0 - 149, var2.field4972) && (long) arg1 == var2.field4981) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        field2429 = null;
        if (arg0 < 55) {
            method1073(110, 73);
        }
        field2432 = null;
        field2436 = null;
    }
}
