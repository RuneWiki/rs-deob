import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class130 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lic;")
    public static class59 field2913 = class59.method433(0, "<col=ffff00>");

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lic;")
    public static class59 field2924 = class59.method433(0, "<col=ff9040>");

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2927 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[J")
    public static long[] field2928 = new long[32];

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lic;")
    public static class59 field2917 = class59.method433(0, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!se", name = "k", descriptor = "[I")
    public static int[] field2923 = new int[5];

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2931 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lic;")
    private static class59 field2925 = class59.method433(0, "Unexpected server response)3");

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lic;")
    public static class59 field2915 = field2925;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lic;")
    private static class59 field2920 = class59.method433(0, "Please enter your password)3");

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lic;")
    public static class59 field2919 = field2920;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Lic;")
    private static class59 field2933 = class59.method433(0, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lic;")
    public static class59 field2922 = field2933;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lic;")
    public static class59 field2929 = field2933;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field2914;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    public static int[] field2916;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
    public int[] field2932;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method998(byte arg0) {
        field2917 = null;
        int var1 = 90 % ((32 - arg0) / 36);
        field2916 = null;
        field2922 = null;
        field2924 = null;
        field2923 = null;
        field2928 = null;
        field2925 = null;
        field2920 = null;
        field2915 = null;
        field2929 = null;
        field2919 = null;
        field2933 = null;
        field2913 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public final void method999(int arg0) {
        class129.method979(this.field2932, this.field2921, this.field2926);
        field2918++;
        if (arg0 != -16) {
            field2922 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method857(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public abstract void method856(int arg0, Component arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method855(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    protected class130() {
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLic;)Z")
    public static final boolean method1000(byte arg0, class59 arg1) {
        field2930++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class65.field1649; var2++) {
            if (arg1.method423(class102.field2486[var2], -61)) {
                return true;
            }
        }
        if (arg0 != -121) {
            field2913 = null;
        }
        return arg1.method423(class159.field3650.field1225, -61);
    }
}
