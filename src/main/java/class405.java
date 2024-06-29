import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class405 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lpi;")
    public static class340 field5432 = new class340(31, 6);

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field5434 = 0;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field5433 = 0;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lrc;")
    public static class21 field5435 = null;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[Lna;")
    public static class251[] field5436;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILmu;)V")
    public static final void method2409(int arg0, int arg1, int arg2, class338 arg3) {
        class510 var4 = class478.method2870(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7492 = arg3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method2410(int arg0) {
        field5436 = null;
        int var1 = 95 / ((arg0 - 3) / 53);
        field5432 = null;
    }
}
