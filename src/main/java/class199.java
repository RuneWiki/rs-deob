import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class199 {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "[Lec;")
    public static class103[] field2881 = new class103[14];

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field2878 = 0;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "B")
    public byte field2882;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Ljava/lang/String;")
    public String field2879;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "Ljava/lang/String;")
    public String field2883;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Ljava/lang/String;")
    public String field2884;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "Ljava/lang/String;")
    public String field2885;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V", line = 13)
    public static void method1349(byte arg0) {
        field2881 = null;
        if (arg0 < 52) {
            field2878 = -58;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 33)
    public static final void method1350(int arg0) {
        if (arg0 != -26159) {
            field2878 = 64;
        }
        field2886++;
        class721 var1 = null;
        try {
            class436 var2 = class379.field5339.method3596((byte) 102, "", true);
            while (var2.field5975 == 0) {
                class740.method4124(1L, 87);
            }
            if (var2.field5975 == 1) {
                var1 = (class721) var2.field5973;
                class26 var3 = class674.field9500.method2252((byte) -68);
                var1.method4042(var3.field279, var3.field330, -17, 0);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method4048(1);
            }
        } catch (Exception var4) {
        }
    }
}
