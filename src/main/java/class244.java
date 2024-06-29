import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class244 {

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field3350 = 0;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "B")
    public byte field3346;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Lcw;")
    public static class390 field3344;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Ljava/lang/String;")
    public String field3342;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Ljava/lang/String;")
    public String field3343;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Ljava/lang/String;")
    public String field3345;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Ljava/lang/String;")
    public String field3347;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIZILjava/lang/String;II)V")
    public static final void method1474(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5, int arg6, int arg7) {
        field3349++;
        class259 var8 = new class259();
        var8.field3514 = arg7;
        var8.field3510 = arg6;
        var8.field3511 = arg5;
        var8.field3519 = arg2;
        var8.field3522 = arg0;
        var8.field3520 = arg1;
        if (arg3) {
            method1474(71, 85, -112, false, -89, null, -13, -95);
        }
        var8.field3518 = class28.field417 + arg4;
        class415.field6024.method2599(1256, var8);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static void method1475(byte arg0) {
        field3344 = null;
        if (arg0 >= -43) {
            field3344 = null;
        }
    }
}
