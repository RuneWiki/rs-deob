import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class592 extends class168 {

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "Lcc;")
    public class733 field8280;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "Lkg;")
    public static class275 field8279 = new class275(47, 6);

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public static int field8283 = 0;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "[I")
    public static int[] field8284;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "[Z")
    public static boolean[] field8277;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/io/File;BLjava/lang/String;)V", line = 4)
    public static final void method3355(File arg0, byte arg1, String arg2) {
        field8281++;
        class551.field7694.put(arg2, arg0);
        if (arg1 != -67) {
            method3358(52);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 17)
    public static final void method3356(int arg0) {
        field8282++;
        if (arg0 != 6) {
            method3358(-90);
        }
        if (class717.field9982 != null) {
            class717.field9982 = null;
            class167.method1169(class454.field6068, class161.field2218, class238.field3097, 16184, class175.field2455);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V", line = 35)
    public static final void method3357(int arg0) {
        field8278++;
        for (class729 var1 = (class729) class757.field10565.method3672(-1); var1 != null; var1 = (class729) class757.field10565.method3662(-1)) {
            if (var1.field10149) {
                var1.method1175(-2);
            } else {
                var1.field10146 = true;
                if (var1.field10154 >= 0 && var1.field10139 >= 0 && class409.field5183 > var1.field10154 && var1.field10139 < class543.field7597) {
                    class126.method949((byte) -64, var1);
                }
            }
        }
        for (class729 var2 = (class729) class719.field10016.method3672(-1); var2 != null; var2 = (class729) class719.field10016.method3662(-1)) {
            if (var2.field10149) {
                var2.method1175(-2);
            } else {
                var2.field10146 = true;
            }
        }
        int var3 = -77 / ((arg0 - 14) / 59);
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V", line = 75)
    public static void method3358(int arg0) {
        field8284 = null;
        field8277 = null;
        if (arg0 >= -31) {
            method3358(115);
        }
        field8279 = null;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lcc;)V", line = 89)
    public class592(class733 arg0) {
        this.field8280 = arg0;
    }
}
