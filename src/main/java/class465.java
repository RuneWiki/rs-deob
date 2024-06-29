import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class465 extends class57 {

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field6912 = new String[200];

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "Lho;")
    public static class103 field6924 = new class103(63, 12);

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public static int field6929 = 0;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "C")
    public char field6922;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public int field6911;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public int field6921;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "J")
    public long field6913;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "Ltr;")
    public static class194 field6928;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "Lrs;")
    public class465 field6923;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "Lwf;")
    public static class90 field6927;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6918;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "Z")
    public boolean field6920;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)C")
    public final char method342(boolean arg0) {
        if (!arg0) {
            this.method341(true);
        }
        field6916++;
        return this.field6922;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)I")
    public final int method341(boolean arg0) {
        field6914++;
        if (arg0) {
            this.method342(false);
        }
        return this.field6921;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I")
    public final int method340(int arg0) {
        if (arg0 <= 84) {
            this.method344(-14);
        }
        field6915++;
        return this.field6911;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILnk;IIFFIFFFZI[B)V")
    public static final void method2844(int arg0, class505 arg1, int arg2, int arg3, float arg4, float arg5, int arg6, float arg7, float arg8, float arg9, boolean arg10, int arg11, byte[] arg12) {
        field6925++;
        int var13 = 0;
        if (arg10) {
            return;
        }
        while (arg11 > var13) {
            class372.method2201(arg7, arg3, arg4, arg5, arg2, arg1, arg0, arg11, arg12, arg8, 2, var13, arg9, arg6);
            arg3 += arg0 * arg2;
            var13++;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)[Lao;")
    public static final class191[] method2845(byte arg0) {
        int var1 = 73 / ((44 - arg0) / 47);
        field6926++;
        return new class191[] { class249.field3319, class93.field1115, class371.field5041, class260.field3491, class190.field2453, class43.field461, class117.field1521, class478.field7079, class328.field4363, class376.field5104, class63.field727, class55.field639, class134.field1764, class115.field1505, class140.field1865, class323.field4300, class43.field457, class280.field3705, class285.field3757, class436.field6356, class527.field7737, class262.field3517, class152.field1992, class456.field6806, class532.field7838, class417.field6056, class168.field2178, class10.field122, class360.field4890, class122.field1586, class408.field5857, class164.field2142, class121.field1568, class502.field7323, class510.field7414, class442.field6416, class325.field4334, class189.field2444, class6.field70, class207.field2727, class490.field7189, class276.field3675, class451.field6725, class143.field1905, class91.field1088, class76.field954, class138.field1845, class167.field2170, class176.field2272, class241.field3195, class184.field2397, class239.field3176, class276.field3676, class386.field5613, class376.field5094, class293.field3879, class308.field4130, class451.field6716, class289.field3800, class173.field2213, class206.field2717, class428.field6225, class379.field5478, class252.field3349, class57.field681, class214.field2930, class475.field7035, class125.field1614, class111.field1479, class515.field7482, class188.field2434, class418.field6073, class393.field5681, class174.field2247, class330.field4378, class184.field2389, class117.field1532, class302.field3995, class381.field5516, class444.field6460, class339.field4483, class452.field6736, class41.field450, class408.field5851, class326.field4343, class191.field2461, class419.field6081, class380.field5504, class15.field156, class55.field635, class155.field2022, class357.field4866, class502.field7318, class481.field7107, class495.field7231, class386.field5615, class232.field3113, class228.field3079, class377.field5225, class206.field2719, class428.field6222, class324.field4304, class470.field6973, class297.field3914, class285.field3755, class453.field6786, class33.field342, class521.field7669, class118.field1539, class68.field779, class102.field1389, class37.field385, class429.field6241 };
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
    public static void method2846(int arg0) {
        field6924 = null;
        field6927 = null;
        field6912 = null;
        if (arg0 <= 43) {
            field6924 = null;
        }
        field6928 = null;
        field6918 = null;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z")
    public final boolean method343(int arg0) {
        field6919++;
        if (arg0 != -1) {
            this.method343(10);
        }
        return this.field6920;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)J")
    public final long method344(int arg0) {
        if (arg0 != 10) {
            this.field6911 = 7;
        }
        field6917++;
        return this.field6913;
    }
}
