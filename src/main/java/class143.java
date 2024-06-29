import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class143 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3405 = 0;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lrd;")
    public static class114 field3410 = class84.method656("Bitte versuchen Sie es in ", (byte) 127);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lrd;")
    public static class114 field3403 = class84.method656("Schrifts-=tze geladen)3", (byte) 118);

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lrd;")
    public static class114 field3408 = class84.method656("redstone2", (byte) 126);

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lrd;")
    public static class114 field3413 = class84.method656("Benutzername: ", (byte) 122);

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3407 = new CRC32();

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
    public static int[] field3415 = new int[50];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lpb;")
    public static class100 field3401;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Ljd;")
    public static class66 field3402;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1139(int arg0, Component arg1) {
        if (arg0 != 50) {
            field3405 = 22;
        }
        arg1.addMouseListener(class63.field1340);
        arg1.addMouseMotionListener(class63.field1340);
        field3409++;
        arg1.addFocusListener(class63.field1340);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method1140(boolean arg0) {
        field3401 = null;
        field3415 = null;
        field3413 = null;
        if (!arg0) {
            field3413 = null;
        }
        field3402 = null;
        field3408 = null;
        field3407 = null;
        field3403 = null;
        field3410 = null;
    }
}
