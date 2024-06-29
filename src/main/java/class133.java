import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class133 {

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Lok;")
    public static class146 field2238 = class235.method1724(-12908, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Z")
    public static volatile boolean field2236 = true;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "F")
    public static float field2231;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[I")
    public static int[] field2240;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method984(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2234++;
        int var5 = 98 / ((-arg2 - 60) / 37);
        for (int var6 = 0; var6 < class227.field3783; var6++) {
            if (arg4 < (class91.field1442[var6] + class175.field2922[var6]) && arg3 + arg4 > class175.field2922[var6] && arg1 < (class52.field952[var6] + class298.field5068[var6]) && class298.field5068[var6] < (arg0 + arg1)) {
                class269.field4623[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 30)
    public static void method985(byte arg0) {
        field2238 = null;
        field2240 = null;
        if (arg0 > -38) {
            method989(96, (class15) null, (class15) null);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILok;)V", line = 44)
    public static final void method986(int arg0, int arg1, class146 arg2) {
        field2239++;
        class158 var3 = class206.method1564(arg1, 2, -124);
        var3.method1236(arg0 ^ 0xC43DFBD8);
        var3.field2659 = arg2;
        if (arg0 != 1002582406) {
            method988(-76, -73, -2, -81, false, 106, (class318) null);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 82)
    public static final void method987(int arg0) {
        field2233++;
        if (class66.field1117 != null) {
            class37 var1 = class66.field1117;
            synchronized (class66.field1117) {
                class66.field1117 = null;
            }
        }
        if (arg0 != 64) {
            method989(-69, (class15) null, (class15) null);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIZILoj;)V", line = 106)
    public static final void method988(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class318 arg6) {
        class214.method1597(arg6.field5380, arg0, -304494096, arg2, arg1, arg6.field5409, arg3, arg5);
        field2235++;
        if (arg4) {
            field2236 = false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILoh;Loh;)V", line = 126)
    public static final void method989(int arg0, class15 arg1, class15 arg2) {
        field2237++;
        class313.field5329 = arg1;
        class75.field1224 = arg2;
        if (arg0 >= -117) {
            method988(-95, 111, -86, 63, false, -70, (class318) null);
        }
    }
}
