import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class182 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
    public static int[] field2883 = new int[128];

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2884 = Calendar.getInstance();

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field2888 = 100;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    public static int[] field2885 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljd;")
    public static class95 field2887;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 5)
    public static void method1357(int arg0) {
        field2887 = null;
        field2884 = null;
        if (arg0 != 128) {
            method1358(-70, -128, (byte) -44);
        }
        field2885 = null;
        field2883 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)V", line = 20)
    public static final void method1358(int arg0, int arg1, byte arg2) {
        field2882++;
        class188 var3 = class147.method1111(-67, arg1, 6);
        int var4 = -29 % ((17 - arg2) / 51);
        var3.method1392((byte) -48);
        var3.field2959 = arg0;
    }
}
