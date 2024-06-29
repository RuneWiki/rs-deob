import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lrf;")
    public static class163 field361 = class53.method392(-41, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lrf;")
    public static class163 field365 = class53.method392(124, "(Y");

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field368 = 0;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lrf;")
    private static class163 field370 = class53.method392(-39, "Free world");

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
    public static byte[][][] field372 = new byte[4][104][104];

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[I")
    public static int[] field371 = new int[5];

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lrf;")
    public static class163 field377 = class53.method392(-60, "Weiter");

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[Lmh;")
    public static class121[] field375 = new class121[5000];

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[S")
    public static short[] field373 = new short[500];

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lrf;")
    public static class163 field374 = field370;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Lrf;")
    private static class163 field379 = class53.method392(-127, "Continue");

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lrf;")
    public static class163 field364 = field379;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lth;")
    public static class183 field367;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Lig;")
    public static class84 field378;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field362;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lig;B)I")
    public static final int method130(class84 arg0, byte arg1) {
        class17 var2 = (class17) class7.field141.method465(((long) arg0.field1782 << 32) + (long) arg0.field1758, (byte) -48);
        field376++;
        if (var2 == null) {
            return arg1 == 77 ? arg0.field1726 : -119;
        } else {
            return var2.field300;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Z")
    public static final boolean method131(byte arg0) {
        field360++;
        try {
            if (arg0 > -99) {
                method130(null, (byte) 89);
            }
            if (class180.field3611 == 2) {
                if (client.field613 == null) {
                    client.field613 = class45.method274(class155.field3210, class51.field1024, class158.field3230);
                    if (client.field613 == null) {
                        return false;
                    }
                }
                if (class194.field3811 == null) {
                    class194.field3811 = new class8(class108.field2251, class68.field1430);
                }
                if (class49.field949.method739(client.field613, -1, class194.field3811, class93.field2011, 22050)) {
                    class49.field949.method754((byte) -11);
                    class49.field949.method746(class209.field4074, 127);
                    class49.field949.method759(false, client.field613, class155.field3211);
                    class194.field3811 = null;
                    class155.field3210 = null;
                    client.field613 = null;
                    class180.field3611 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class49.field949.method750(16);
            class155.field3210 = null;
            class180.field3611 = 0;
            client.field613 = null;
            class194.field3811 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method132(int arg0) {
        field377 = null;
        field378 = null;
        field367 = null;
        field362 = null;
        field375 = null;
        field373 = null;
        if (arg0 != 0) {
            method132(-90);
        }
        field374 = null;
        field361 = null;
        field371 = null;
        field365 = null;
        field379 = null;
        field370 = null;
        field372 = null;
        field364 = null;
    }
}
