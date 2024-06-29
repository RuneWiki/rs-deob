import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class109 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1683 = "scroll:";

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lom;")
    public static class156 field1686 = new class156();

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V", line = 10)
    public static final void method759(int arg0, boolean arg1) {
        if (class278.field4227 == null || class278.field4227.length < arg0) {
            class278.field4227 = new int[arg0];
        }
        if (arg1) {
            method759(66, false);
        }
        field1682++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIIIIII)V", line = 28)
    public static final void method760(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1684++;
        class323[] var7 = class294.field4497;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class323 var9 = var7[var8];
            if (var9 != null && var9.field4869 == 2) {
                class269.method1896(arg2 >> 1, var9.field4878 * 2, (byte) -75, arg3 >> 1, arg5, (var9.field4881 - class189.field2807 << 7) + var9.field4876, arg1, (var9.field4872 - class217.field3309 << 7) + var9.field4874);
                if (class160.field2398 > -1 && class304.field4641 % 20 < 10) {
                    class226.field3433[var9.field4873].method935(arg4 + class160.field2398 - 12, class159.field2385 + arg6 + -28);
                }
            }
        }
        if (arg0 < 9) {
            method759(-42, true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 58)
    public static void method761(int arg0) {
        field1683 = null;
        if (arg0 != -3) {
            method759(-30, false);
        }
        field1686 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V", line = 82)
    public static final void method762(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1685++;
        class234.field3507.field4025 = 0;
        class234.field3507.method1813(68, 20);
        class234.field3507.method1813(115, arg4);
        class234.field3507.method1813(72, arg2);
        class234.field3507.method1823(arg0, (byte) -75);
        class234.field3507.method1823(arg3, (byte) -36);
        class234.field3515 = 1;
        class126.field1975 = arg1;
        class138.field2095 = 0;
        class56.field709 = -3;
    }
}
