import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class230 {

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3670 = "white:";

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3665 = 0;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Z")
    public static boolean field3676 = true;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field3675 = 5063219;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field3687 = 0;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field3686 = 0;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[Lak;")
    public static class146[] field3678 = new class146[14];

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public int field3682;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public int field3694;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "[S")
    public static short[] field3684;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method1617(int arg0) {
        if (arg0 >= -46) {
            field3686 = 111;
        }
        if (class73.field1080 != null) {
            class69 var1 = class73.field1080;
            synchronized (class73.field1080) {
                class73.field1080 = null;
            }
        }
        field3695++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public static final void method1618(int arg0, int arg1) {
        field3690++;
        if (arg1 == 0) {
            class40 var2 = class190.field2937;
            synchronized (class190.field2937) {
                class312.field5035 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1619(int arg0) {
        String var1 = "www";
        if (class138.field2130 != 0) {
            var1 = "www-wtqa";
        }
        field3680++;
        if (arg0 != 0) {
            return null;
        }
        String var2 = "";
        if (class275.field4552 != null) {
            var2 = "/p=" + class275.field4552;
        }
        return "http://" + var1 + ".runescape.com/l=" + class284.field4755 + "/a=" + class115.field1742 + var2 + "/";
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1620(Component arg0, int arg1) {
        field3667++;
        arg0.removeMouseListener(class190.field2937);
        arg0.removeMouseMotionListener(class190.field2937);
        arg0.removeFocusListener(class190.field2937);
        class202.field3245 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static void method1621(int arg0) {
        field3670 = null;
        if (arg0 != 5063219) {
            method1618(-17, -68);
        }
        field3678 = null;
        field3684 = null;
    }
}
