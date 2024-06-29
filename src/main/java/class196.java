import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class196 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lge;")
    public static class65 field3888 = new class65(32);

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lrf;")
    private static class163 field3891 = class53.method392(76, "Password: ");

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lrf;")
    public static class163 field3893 = class53.method392(56, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lrf;")
    public static class163 field3894 = field3891;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lfc;")
    public static class54 field3890 = new class54(64);

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lrf;")
    public static class163 field3895 = class53.method392(109, "::gc");

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lrf;")
    public static class163 field3896 = class53.method392(65, "titlebutton");

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lfa;")
    public static class52 field3892;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        field3891 = null;
        field3888 = null;
        field3893 = null;
        field3890 = null;
        field3892 = null;
        field3896 = null;
        field3895 = null;
        if (arg0 <= -96) {
            field3894 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lfa;I)V")
    public static final void method1302(class52 arg0, int arg1) {
        field3889++;
        byte[] var2 = new byte[arg1];
        if (class26.field484 != null) {
            try {
                class26.field484.method964(0L, 255);
                class26.field484.method951((byte) 106, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method365(24, arg1 - 1640531551, var2, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILu;I)Lrh;")
    public static final class165 method1303(int arg0, class184 arg1, int arg2) {
        field3887++;
        if (arg0 == 0) {
            return class82.method551(arg2, 1, arg1) ? class73.method517(true) : null;
        } else {
            return null;
        }
    }
}
