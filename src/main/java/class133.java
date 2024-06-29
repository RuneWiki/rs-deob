import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class133 extends class260 {

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    private int field1807 = -32768;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1814 = "Loaded wordpack";

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lcc;")
    public static class327 field1806 = new class327(64);

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Z")
    public static boolean field1818 = true;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1819 = "Please remove ";

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Lfh;")
    public static class140 field1804;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[[Lih;")
    public static class70[][] field1810;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()I", line = 7)
    public final int method583() {
        field1815++;
        return this.field1807;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIJILne;)V", line = 19)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class187 arg10) {
        field1816++;
        class81 var13 = class172.method1265(this.field1813, (byte) -120).method2516(0, this.field1811, -113, -1, (class125) null, (class314) null, 0);
        if (var13 != null) {
            var13.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1807 = var13.method583();
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V", line = 33)
    public static final void method1014(byte arg0) {
        if (arg0 != 29) {
            method1015(43);
        }
        field1812++;
        class318.field4684.method2262(false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 45)
    public static final void method1015(int arg0) {
        class187.method1366((long) class313.field4603);
        field1803++;
        if (class233.field3340 != -1) {
            class160.method1223(-22845, class233.field3340);
        }
        for (int var1 = 0; var1 < class345.field5370; var1++) {
            if (class229.field3276[var1]) {
                class185.field2520[var1] = true;
            }
            class306.field4485[var1] = class229.field3276[var1];
            class229.field3276[var1] = false;
        }
        if (arg0 != 7878) {
            field1804 = (class140) null;
        }
        class109.field1411 = class313.field4603;
        class304.field4450 = null;
        class182.field2486 = -1;
        if (class47.field623) {
            class103.field1345 = true;
        }
        class304.field4453 = -1;
        if (class233.field3340 != -1) {
            class345.field5370 = 0;
            class182.method1330((byte) 105);
        }
        if (class47.field623) {
            class129.method994();
        } else {
            class37.method255();
        }
        class186.field2551 = 0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 100)
    public static void method1016(int arg0) {
        field1806 = null;
        field1819 = null;
        field1814 = null;
        if (arg0 == 28072) {
            field1804 = null;
            field1810 = (class70[][]) null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V", line = 116)
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1817++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V", line = 132)
    public static final void method1017(int arg0, byte arg1) {
        if (arg1 == -123) {
            class321.field4713.method2264((byte) 37, arg0);
            field1808++;
        }
    }
}
