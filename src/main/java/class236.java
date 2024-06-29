import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class236 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4108 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4107 = -1;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Lud;")
    public static class279 field4110 = class130.method1024("scrollen:", 255);

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field4121 = 0;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lud;")
    public static class279 field4118 = class130.method1024("Chargement des sprites )2 ", 255);

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[I")
    public static int[] field4116 = new int[256];

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lud;")
    public static class279 field4120 = class130.method1024("overlay2", 255);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "F")
    public static float field4109;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Ljava/lang/Thread;")
    public static Thread field4115;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V", line = 28)
    public static final void method1696(int arg0, int arg1, int arg2) {
        field4119++;
        class212 var3 = class79.method661((byte) 31, arg2);
        int var4 = var3.field3727;
        int var5 = var3.field3716;
        int var6 = var3.field3725;
        if (arg1 > -104) {
            return;
        }
        int var7 = class131.field2390[var5 - var4];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class77.method652(var6, arg0 << var4 & var8 | class326.field5679[var6] & ~var8, 0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 56)
    public static final void method1697(Component arg0, byte arg1) {
        arg0.removeKeyListener(class101.field1892);
        if (arg1 != -29) {
            method1696(-7, -21, -93);
        }
        field4111++;
        arg0.removeFocusListener(class101.field1892);
        class262.field4664 = -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lok;Lok;Z)V", line = 78)
    public static final void method1698(class149 arg0, class149 arg1, boolean arg2) {
        field4122++;
        class125.field2305 = arg1;
        if (!arg2) {
            field4118 = (class279) null;
        }
        class109.field2012 = arg0;
        class249.field4445 = class125.field2305.method1174(3, -17680);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 103)
    public static void method1699(byte arg0) {
        field4110 = null;
        field4120 = null;
        field4115 = null;
        if (arg0 > -16) {
            method1697((Component) null, (byte) 127);
        }
        field4116 = null;
        field4118 = null;
    }
}
