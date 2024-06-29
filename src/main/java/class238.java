import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class238 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3823 = "Checking for updates - ";

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3824 = -1;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[Ldm;")
    public static class271[] field3822;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Laj;B)V")
    public static final void method1667(class1 arg0, byte arg1) {
        field3827++;
        class251 var2 = (class251) class13.field190.method1064(-1, class176.method1256((byte) 127, arg0.field31));
        if (arg1 != 68) {
            return;
        }
        if (var2 == null) {
            class1.method7(class148.field2204, (class191) null, arg0, arg0.field3972[0], 0, (class86) null, arg0.field3970[0], 17733);
        } else {
            var2.method1794(true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method1668(int arg0) {
        if (arg0 <= 81) {
            field3822 = null;
        }
        field3822 = null;
        field3823 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)I")
    public static final int method1669(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3826++;
        if (arg1 != -32302) {
            return -69;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }
}
