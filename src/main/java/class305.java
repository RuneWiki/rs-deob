import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class305 extends class324 {

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    private int field4843;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    private int field4837;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    private int field4840;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Ltm;")
    public static class79 field4831 = new class79(16);

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Z")
    public static boolean field4841 = false;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Z")
    public static boolean field4842 = false;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "F")
    public static float field4839;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Lcg;")
    public static class49 field4838;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method346(int arg0, int arg1, byte arg2) {
        field4830++;
        int var4 = this.field4843 * arg0 >> 12;
        int var5 = this.field4837 * arg0 >> 12;
        int var6 = this.field4840 * arg1 >> 12;
        int var7 = this.field4836 * arg1 >> 12;
        int var8 = -122 / ((-arg2 - 20) / 39);
        class265.method1829(this.field5162, this.field5149, var6, var5, var4, var7, 16067);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Z", line = 29)
    public static final boolean method2099(byte arg0) {
        field4835++;
        try {
            if (class44.field705 == 2) {
                if (class334.field5296 == null) {
                    class334.field5296 = class187.method1430(class249.field4044, class241.field3924, class125.field2155);
                    if (class334.field5296 == null) {
                        return false;
                    }
                }
                if (class81.field1326 == null) {
                    class81.field1326 = new class77(class171.field2960, class279.field4425);
                }
                if (class69.field1128.method908(-89, 22050, class81.field1326, class334.field5296, class339.field5417)) {
                    class69.field1128.method934(82);
                    class69.field1128.method915(class226.field3799, (byte) -76);
                    class69.field1128.method916(class334.field5296, 12160, class334.field5300);
                    class44.field705 = 0;
                    class81.field1326 = null;
                    class334.field5296 = null;
                    class249.field4044 = null;
                    return true;
                }
            }
            int var1 = -98 / ((arg0 + 13) / 53);
        } catch (Exception var3) {
            var3.printStackTrace();
            class69.field1128.method942(18729);
            class81.field1326 = null;
            class249.field4044 = null;
            class44.field705 = 0;
            class334.field5296 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 81)
    public static final void method2100(int arg0, int arg1) {
        class218 var2 = class119.field2062;
        synchronized (class119.field2062) {
            class50.field782 = arg1;
            if (arg0 > -25) {
                field4841 = false;
            }
        }
        field4833++;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 94)
    public static void method2101(int arg0) {
        if (arg0 != 0) {
            field4842 = true;
        }
        field4831 = null;
        field4838 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V", line = 105)
    public final void method344(int arg0, int arg1, int arg2) {
        field4834++;
        int var4 = this.field4843 * arg1 >> 12;
        int var5 = this.field4837 * arg1 >> 12;
        int var6 = this.field4840 * arg0 >> 12;
        int var7 = this.field4836 * arg0 >> 12;
        class191.method1450(1, var4, var5, var6, this.field5164, var7);
        if (arg2 > -116) {
            field4841 = true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIII)V", line = 129)
    public class305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4843 = arg0;
        this.field4836 = arg3;
        this.field4837 = arg2;
        this.field4840 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V", line = 142)
    public final void method347(int arg0, int arg1, int arg2) {
        field4829++;
        int var4 = this.field4837 * arg2 >> 12;
        int var5 = this.field4843 * arg2 >> 12;
        if (arg1 < 103) {
            method2099((byte) -117);
        }
        int var6 = this.field4836 * arg0 >> 12;
        int var7 = this.field4840 * arg0 >> 12;
        class247.method1731(var5, var7, var4, this.field5149, this.field5164, var6, (byte) -68, this.field5162);
    }
}
