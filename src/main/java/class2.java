import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lra;")
    public static class361 field8 = new class361(83, 0);

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    public static int[] field12 = new int[32];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field10 = 0;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    private static int field14 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lh;")
    public static class214 field9;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lts;")
    public static class35 field15;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Luga;")
    public static class552 field13;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
    public static final boolean method2(int arg0, int arg1) {
        if (arg1 != 83) {
            method6(-116, 50, -10, 20, 44, 60, -87);
        }
        field7++;
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method3(int arg0, int arg1) {
        field4++;
        if (arg1 < 54) {
            field14 = -102;
        }
        if (arg0 == 100 && class585.field7939 > 0) {
            byte[] var2 = class305.field4013[--class585.field7939];
            class305.field4013[class585.field7939] = null;
            return var2;
        } else if (arg0 == 5000 && class268.field3582 > 0) {
            byte[] var3 = class386.field4957[--class268.field3582];
            class386.field4957[class268.field3582] = null;
            return var3;
        } else if (arg0 == 30000 && field14 > 0) {
            byte[] var4 = class616.field8342[--field14];
            class616.field8342[field14] = null;
            return var4;
        } else {
            if (class310.field4028 != null) {
                for (int var5 = 0; var5 < class171.field2117.length; var5++) {
                    if (class171.field2117[var5] == arg0 && class109.field1416[var5] > 0) {
                        byte[] var6 = class310.field4028[var5][--class109.field1416[var5]];
                        class310.field4028[var5][class109.field1416[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        if (arg0 != 1000) {
            field11 = -96;
        }
        field15 = null;
        field13 = null;
        field9 = null;
        field8 = null;
        field12 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method5(byte arg0) {
        field5++;
        class668 var1 = class207.field2671;
        synchronized (class207.field2671) {
            class207.field2671.method3658(0);
        }
        class668 var2 = class201.field2622;
        synchronized (class201.field2622) {
            class201.field2622.method3658(0);
        }
        if (arg0 > -99) {
            method7(null, -70);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 - arg4) >= class265.field3552 && class641.field8924 >= arg3 + arg4 && class165.field2061 <= arg1 - arg4 && class99.field1309 >= arg1 + arg4) {
            class407.method2303(arg3, (byte) -29, arg0, arg2, arg1, arg4, arg6);
        } else {
            class602.method3274(arg2, arg3, arg1, arg0, arg4, arg6, (byte) -33);
        }
        field3++;
        if (arg5 != 50) {
            method6(-68, 73, 75, 60, -63, -112, 23);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)V")
    public static final synchronized void method7(byte[] arg0, int arg1) {
        field6++;
        if (arg0.length == 100 && class585.field7939 < 1000) {
            class305.field4013[class585.field7939++] = arg0;
        } else if (arg0.length == 5000 && class268.field3582 < 250) {
            class386.field4957[class268.field3582++] = arg0;
        } else {
            if (arg1 > -92) {
                method4(93);
            }
            if (arg0.length == 30000 && field14 < 50) {
                class616.field8342[field14++] = arg0;
            } else if (class310.field4028 != null) {
                for (int var2 = 0; var2 < class171.field2117.length; var2++) {
                    if (class171.field2117[var2] == arg0.length && class310.field4028[var2].length > class109.field1416[var2]) {
                        class310.field4028[var2][class109.field1416[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }
}
