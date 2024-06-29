import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class274 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Ljm;")
    public static class485 field3722 = new class485(81, 3);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
    public static int[] field3726 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lvh;")
    public static class240 field3727;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[[B")
    public static byte[][] field3721;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static final void method1554(boolean arg0) {
        class398[] var1 = class109.field1494;
        synchronized (class109.field1494) {
            for (int var2 = 0; var2 < class109.field1494.length; var2++) {
                class109.field1494[var2] = new class398();
                class371.field5210[var2] = 0;
            }
            if (!arg0) {
                method1554(true);
            }
        }
        field3723++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([FIB)[F")
    public static final float[] method1555(float[] arg0, int arg1, byte arg2) {
        field3724++;
        float[] var3 = new float[arg1];
        class416.method2488(arg0, 0, var3, 0, arg1);
        if (arg2 != 12) {
            field3721 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLoa;IIIBLqa;)V")
    public static final void method1556(boolean arg0, class490 arg1, int arg2, int arg3, int arg4, byte arg5, class162 arg6) {
        field3725++;
        if (arg0) {
            class234.field3250.method3111((class177.field2513 - class234.field3250.method126()) / 2, (class351.field4795 - class234.field3250.method121()) / 2);
            class304.field4152.method3111((class177.field2513 - class304.field4152.method126()) / 2, 18);
        }
        arg1.method2884(class351.field4795 / 2 - 26, class177.field2513 / 2, arg4, -110, -1, (class341.field4700 == class166.field2348 ? class191.field2684 : class157.field2236).method590(class105.field1434, -22602));
        if (arg5 < 34) {
            method1557((byte) -47);
        }
        int var7 = class351.field4795 / 2 - 18;
        arg6.method431(class177.field2513 / 2 - 152, var7, 304, 34, arg3, 0);
        arg6.method431(class177.field2513 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg6.method459(class177.field2513 / 2 - 150, var7 + 2, class40.field544 * 3, 30, arg2, 0);
        arg6.method459(class177.field2513 / 2 + (class40.field544 * 3) - 150, var7 + 2, 300 - (class40.field544 * 3), 30, 0, 0);
        arg1.method2884(class351.field4795 / 2 + 4, class177.field2513 / 2, arg4, -123, -1, class272.field3712);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method1557(byte arg0) {
        field3726 = null;
        field3722 = null;
        field3727 = null;
        if (arg0 == 16) {
            field3721 = null;
        }
    }
}
