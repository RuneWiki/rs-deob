import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class140 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2160 = "wave:";

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lec;")
    public static class25 field2161 = new class25(64);

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lkk;")
    public static class254 field2165;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static final void method932(int arg0) {
        if (arg0 != 0) {
            method932(-74);
        }
        class106.field1649 = null;
        class68.field986 = null;
        class147.field2307 = null;
        field2162++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public static final void method933(int arg0, int arg1, int arg2) {
        field2163++;
        class36 var3 = class161.method1067(arg2, arg1, (byte) 81);
        var3.method219(-95);
        var3.field465 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method934(int arg0) {
        field2165 = null;
        field2161 = null;
        if (arg0 == 6) {
            field2160 = null;
        }
    }
}
