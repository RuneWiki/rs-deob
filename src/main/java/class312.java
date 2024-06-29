import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class312 extends class190 {

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "[Lla;")
    public static class72[] field4714 = new class72[4];

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "[I")
    public static int[] field4715 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Llh;")
    public static class320 field4705 = new class320(5000);

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field4719 = new String[100];

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "F")
    public static float field4717 = 0.0F;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "Z")
    public static boolean field4720 = false;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Lrk;")
    public static class277 field4716;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[S")
    public static short[] field4713;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2135(boolean arg0) {
        if (arg0) {
            return;
        }
        int var1 = class201.method1432((byte) -43);
        if (var1 == 0) {
            class136.field1887 = (byte[][][]) null;
            class187.method1312(0, (byte) -92);
        } else if (var1 == 1) {
            class138.method1000(2, (byte) 0);
            class187.method1312(512, (byte) -121);
            if (class240.field3406 != null) {
                class161.method1159((byte) -53);
            }
        } else {
            class138.method1000(2, (byte) (class8.field83 - 4 & 0xFF));
            class187.method1312(2, (byte) -123);
        }
        field4710++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V", line = 38)
    public static final void method2136(int arg0, int arg1) {
        class159.field2182.method720(arg1, 1088);
        class193.field2646.method720(arg1, 1088);
        if (arg0 < 61) {
            method2135(false);
        }
        field4707++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 50)
    public static void method2137(int arg0) {
        field4705 = null;
        field4719 = null;
        field4716 = null;
        if (arg0 == -4669) {
            field4715 = null;
            field4713 = null;
            field4714 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 67)
    public static final void method2138(int arg0) {
        int var1 = -60 % ((14 - arg0) / 34);
        class306.field4591.method717((byte) 51);
        field4706++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)I", line = 81)
    public static final int method2139(int arg0, String arg1) {
        field4711++;
        int var2 = 37 % ((-arg0 - 29) / 42);
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 94)
    public static final void method2140(int arg0) {
        class68.field939 = -3;
        class117.field1593 = 0;
        class185.field2559 = false;
        class211.field3062 = 0;
        class28.field347 = 0;
        if (arg0 <= -85) {
            class198.field2822 = 1;
            class207.field2976 = -1;
            field4708++;
        }
    }
}
