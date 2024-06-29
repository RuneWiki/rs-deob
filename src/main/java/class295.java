import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class295 {

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public int field4381 = -1;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public int field4379 = -1;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "[I")
    public static int[] field4374 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field4384 = -1;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
    public int[] field4375;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Z", line = 5)
    public static final boolean method2009(byte arg0) {
        if (arg0 > -86) {
            return false;
        }
        field4373++;
        try {
            if (class278.field4179 == 2) {
                if (class85.field1216 == null) {
                    class85.field1216 = class341.method2356(class100.field1383, class329.field4963, class290.field4320);
                    if (class85.field1216 == null) {
                        return false;
                    }
                }
                if (class274.field4105 == null) {
                    class274.field4105 = new class161(class230.field3258, class194.field2700);
                }
                if (class141.field1927.method581(22050, class85.field1216, class240.field3408, class274.field4105, -1)) {
                    class141.field1927.method587(38);
                    class141.field1927.method598(class106.field1437, -21801);
                    class141.field1927.method595((byte) -36, class188.field2599, class85.field1216);
                    class274.field4105 = null;
                    class100.field1383 = null;
                    class85.field1216 = null;
                    class278.field4179 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class141.field1927.method573((byte) -81);
            class100.field1383 = null;
            class274.field4105 = null;
            class85.field1216 = null;
            class278.field4179 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 58)
    public static void method2010(int arg0) {
        field4374 = null;
        int var1 = 79 % ((arg0 + 46) / 52);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V", line = 69)
    public static final void method2011(byte arg0) {
        class23.field295.method717((byte) 84);
        field4382++;
        class326.field4926.method717((byte) 53);
        class143.field1950.method717((byte) 78);
        if (arg0 >= 44) {
            class44.field534.method717((byte) 47);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lcg;III)V", line = 93)
    private final void method2012(class316 arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 0) {
            return;
        }
        field4380++;
        if (arg3 == 1) {
            this.field4381 = arg0.method2220((byte) 50);
        } else if (arg3 == 2) {
            this.field4375 = new int[arg0.method2219(16448)];
            for (int var5 = 0; var5 < this.field4375.length; var5++) {
                this.field4375[var5] = arg0.method2220((byte) 79);
            }
        } else if (arg3 == 3) {
            this.field4379 = arg0.method2219(16448);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZILcg;)V", line = 127)
    public final void method2013(boolean arg0, int arg1, class316 arg2) {
        field4378++;
        if (!arg0) {
            field4374 = (int[]) null;
        }
        while (true) {
            int var4 = arg2.method2219(16448);
            if (var4 == 0) {
                return;
            }
            this.method2012(arg2, 57, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lkm;Z)I", line = 149)
    public static final int method2014(class133 arg0, boolean arg1) {
        if (arg1) {
            field4384 = -9;
        }
        field4376++;
        int var2 = 0;
        if (arg0.method961(class234.field3313, (byte) -128)) {
            var2++;
        }
        if (arg0.method961(class119.field1607, (byte) -128)) {
            var2++;
        }
        return var2;
    }
}
