import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class320 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[Z")
    public static boolean[] field4992 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[I")
    public static int[] field4991 = new int[50];

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "J")
    public static volatile long field4997 = 0L;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lj;")
    public static class285 field4994 = new class285(128);

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lrm;")
    public static class246 field5001 = new class246();

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5002 = 0;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lja;")
    public static class64 field4996;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 4)
    public static void method2195(int arg0) {
        field4991 = null;
        field4992 = null;
        if (arg0 >= 122) {
            field5001 = null;
            field4996 = null;
            field4994 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Ldg;", line = 28)
    public class320 method988(int arg0, int arg1, int arg2) {
        field4999++;
        return this;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ldg;IIIZ)V", line = 37)
    public void method989(class320 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5000++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V", line = 59)
    public static final void method2196(int arg0, int arg1) {
        field4995++;
        if (class22.field394 == arg0) {
            return;
        }
        if (class22.field394 == arg1) {
            class137.method1051(arg1);
        }
        if (arg0 == 40) {
            class272.method1965(false);
        }
        if (arg0 != 40 && class267.field4140 != null) {
            class267.field4140.method131(arg1 - 11918);
            class267.field4140 = null;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 25 || arg0 == 28) {
            class231.field3672 = 0;
            class278.field4296 = 0;
            class302.field4757 = 1;
            class18.field352 = 1;
            class185.field2950 = 0;
            class191.method1414(true, false);
        }
        if (arg0 == 25 || arg0 == 10) {
            class54.method395(-111);
        }
        if (arg0 == 5) {
            class132.method1002(-127, class210.field3356);
        } else {
            class36.method283(-114);
        }
        boolean var3 = class22.field394 == 5 || class22.field394 == 10 || class22.field394 == 28;
        if (var3 != var2) {
            if (var2) {
                class306.field4808 = class26.field426;
                if (class288.field4397 == 0) {
                    class270.method1952(2, false);
                } else {
                    class163.method1207(0, -92, class26.field426, 255, false, class111.field1842, 2);
                }
                class275.field4276.method691(false, (byte) 61);
            } else {
                class270.method1952(2, false);
                class275.field4276.method691(true, (byte) 61);
            }
        }
        if (class265.field4126 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class265.method1888();
        }
        class22.field394 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()Z", line = 135)
    public boolean method983() {
        field4998++;
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILob;IZI)V", line = 149)
    public static final void method2197(int arg0, class292 arg1, int arg2, boolean arg3, int arg4) {
        field4993++;
        int var5 = arg1.field4608;
        if (arg4 >= -124) {
            field4992 = (boolean[]) null;
        }
        if (arg1.field4589 == 0) {
            arg1.field4608 = arg1.field4432;
        } else if (arg1.field4589 == 1) {
            arg1.field4608 = arg0 - arg1.field4432;
        } else if (arg1.field4589 == 2) {
            arg1.field4608 = arg1.field4432 * arg0 >> 14;
        } else if (arg1.field4589 == 3) {
            if (arg1.field4490 == 2) {
                arg1.field4608 = (arg1.field4432 - 1) * arg1.field4568 + arg1.field4432 * 32;
            } else if (arg1.field4490 == 7) {
                arg1.field4608 = (arg1.field4432 - 1) * arg1.field4568 + arg1.field4432 * 115;
            }
        }
        int var6 = arg1.field4499;
        if (arg1.field4456 == 0) {
            arg1.field4499 = arg1.field4512;
        } else if (arg1.field4456 == 1) {
            arg1.field4499 = arg2 - arg1.field4512;
        } else if (arg1.field4456 == 2) {
            arg1.field4499 = arg1.field4512 * arg2 >> 14;
        } else if (arg1.field4456 == 3) {
            if (arg1.field4490 == 2) {
                arg1.field4499 = (arg1.field4512 - 1) * arg1.field4551 + arg1.field4512 * 32;
            } else if (arg1.field4490 == 7) {
                arg1.field4499 = (arg1.field4512 - 1) * arg1.field4551 + arg1.field4512 * 12;
            }
        }
        if (arg1.field4589 == 4) {
            arg1.field4608 = arg1.field4499 * arg1.field4498 / arg1.field4592;
        }
        if (arg1.field4456 == 4) {
            arg1.field4499 = arg1.field4608 * arg1.field4592 / arg1.field4498;
        }
        if (class31.field523 && (client.method1786(arg1).field738 != 0 || arg1.field4490 == 0)) {
            if (arg1.field4499 < 5 && arg1.field4608 < 5) {
                arg1.field4608 = 5;
                arg1.field4499 = 5;
            } else {
                if (arg1.field4499 <= 0) {
                    arg1.field4499 = 5;
                }
                if (arg1.field4608 <= 0) {
                    arg1.field4608 = 5;
                }
            }
        }
        if (arg1.field4477 == 1337) {
            class251.field3869 = arg1;
        }
        if (arg3 && arg1.field4562 != null && (arg1.field4608 != var5 || arg1.field4499 != var6)) {
            class88 var7 = new class88();
            var7.field1357 = arg1;
            var7.field1340 = arg1.field4562;
            class143.field2250.method1493(-103, var7);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()I")
    public abstract int method207();

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public abstract void method205(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIJILmf;)V")
    public abstract void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10);
}
