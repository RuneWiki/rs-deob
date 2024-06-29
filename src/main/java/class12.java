import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 {

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lob;")
    private static class141 field237 = class175.method1195(40, "Login server offline)3");

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lob;")
    public static class141 field239 = field237;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLpe;I)Z")
    public static final boolean method76(byte arg0, class154 arg1, int arg2) {
        if (arg0 != 98) {
            return false;
        }
        byte[] var3 = arg1.method1054(arg2, arg0 ^ 0xFFFFDAEF);
        field232++;
        if (var3 == null) {
            return false;
        } else {
            class11.method75(var3, (byte) -112);
            return true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lre;IZ)V")
    public static final void method77(class174 arg0, int arg1, boolean arg2) {
        field231++;
        int var3 = arg0.field3454;
        int var4 = (int) arg0.field4067;
        arg0.method1392(128);
        if (arg2) {
            class36.method247(-3, var3);
        }
        class31.method227(var3, -119);
        class170 var5 = class192.method1268(var4, -58);
        if (var5 != null) {
            class38.method252(var5, arg1 ^ 0xFFFFFFAB);
        }
        class114.field2180 = false;
        class188.field3637 = 0;
        class143.method944(class197.field3770, class114.field2188, class203.field3890, class79.field1594, arg1 + arg1);
        if (class18.field322 != -1) {
            class216.method1411(1, true, class18.field322);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class12() {
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method78(Component arg0, int arg1) {
        field238++;
        if (arg1 >= -109) {
            field239 = null;
        }
        arg0.addMouseListener(class212.field4046);
        arg0.addMouseMotionListener(class212.field4046);
        arg0.addFocusListener(class212.field4046);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method79(int arg0) {
        field239 = null;
        if (arg0 != 1) {
            method78(null, 69);
        }
        field237 = null;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lba;)V")
    public class12(class12 arg0) {
        this.field234 = arg0.field234;
        this.field236 = arg0.field236;
        this.field235 = arg0.field235;
        this.field233 = arg0.field233;
    }
}
