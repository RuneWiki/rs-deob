import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class251 extends class326 {

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3720 = "Loaded textures";

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Z")
    public static boolean field3727 = false;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field3730 = 0;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
    public static int[] field3721;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "[[[Lmc;")
    public static class167[][][] field3726;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 5)
    public static void method1839(byte arg0) {
        if (arg0 == -52) {
            field3720 = null;
            field3721 = null;
            field3726 = (class167[][][]) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIII)I", line = 19)
    public static final int method1840(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 107) {
            field3724++;
            return arg2 <= arg3 ? (arg3 <= arg1 ? arg3 : arg1) : arg2;
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)I", line = 31)
    public static final int method1841(int arg0, int arg1) {
        field3729++;
        if (arg1 >= -121) {
            return -96;
        } else if (arg0 == 16711935) {
            return -1;
        } else {
            return class361.method2524(7100, arg0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIILqf;)V", line = 63)
    public static final void method1842(int arg0, boolean arg1, int arg2, int arg3, class359 arg4) {
        int var5 = arg4.field5506;
        field3722++;
        int var6 = arg4.field5560;
        if (arg4.field5505 == 0) {
            arg4.field5560 = arg4.field5599;
        } else if (arg4.field5505 == 1) {
            arg4.field5560 = arg0 - arg4.field5599;
        } else if (arg4.field5505 == 2) {
            arg4.field5560 = arg4.field5599 * arg0 >> 14;
        } else if (arg4.field5505 == 3) {
            if (arg4.field5554 == 2) {
                arg4.field5560 = arg4.field5599 * 32 + ((arg4.field5599 - 1) * arg4.field5632);
            } else if (arg4.field5554 == 7) {
                arg4.field5560 = (arg4.field5599 - 1) * arg4.field5632 + arg4.field5599 * 12;
            }
        }
        if (arg4.field5661 == 0) {
            arg4.field5506 = arg4.field5524;
        } else if (arg4.field5661 == 1) {
            arg4.field5506 = arg3 - arg4.field5524;
        } else if (arg4.field5661 == 2) {
            arg4.field5506 = arg4.field5524 * arg3 >> 14;
        } else if (arg4.field5661 == 3) {
            if (arg4.field5554 == 2) {
                arg4.field5506 = (arg4.field5524 - 1) * arg4.field5565 + arg4.field5524 * 32;
            } else if (arg4.field5554 == 7) {
                arg4.field5506 = (arg4.field5524 - 1) * arg4.field5565 + arg4.field5524 * 115;
            }
        }
        if (arg4.field5661 == 4) {
            arg4.field5506 = arg4.field5604 * arg4.field5560 / arg4.field5574;
        }
        if (arg4.field5505 == 4) {
            arg4.field5560 = arg4.field5574 * arg4.field5506 / arg4.field5604;
        }
        if (class190.field2769 && (client.method347(arg4).field2901 != 0 || arg4.field5554 == 0)) {
            if (arg4.field5560 < 5 && arg4.field5506 < 5) {
                arg4.field5560 = 5;
                arg4.field5506 = 5;
            } else {
                if (arg4.field5560 <= 0) {
                    arg4.field5560 = 5;
                }
                if (arg4.field5506 <= 0) {
                    arg4.field5506 = 5;
                }
            }
        }
        if (arg4.field5515 == 1337) {
            class189.field2702 = arg4;
        }
        if (arg1 && arg4.field5573 != null && (arg4.field5506 != var5 || arg4.field5560 != var6)) {
            class300 var7 = new class300();
            var7.field4494 = arg4.field5573;
            var7.field4491 = arg4;
            class190.field2762.method106(var7, -128);
        }
        if (arg2 > -48) {
            method1841(-44, 0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I", line = 165)
    public static final int method1843(byte arg0) {
        if (arg0 < 52) {
            field3721 = (int[]) null;
        }
        field3728++;
        return 6;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lph;ILph;)V", line = 176)
    public static final void method1844(class361 arg0, int arg1, class361 arg2) {
        class131.field1923 = arg2;
        if (arg1 != -1) {
            field3723 = -55;
        }
        class289.field4377 = arg0;
        field3725++;
    }
}
