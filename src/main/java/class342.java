import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class class342 {

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field5454 = 0;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
    public static int[] field5455 = new int[14];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5445 = new String[100];

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[I")
    public static int[] field5459 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lln;")
    public static class117 field5449;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field5456;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
    public int[] field5447;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 5)
    public static void method2412(int arg0) {
        field5459 = null;
        field5449 = null;
        if (arg0 != -1) {
            method2416((byte) -71, -103);
        }
        field5445 = null;
        field5455 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 18)
    public static final void method2413(String arg0, boolean arg1, int arg2) {
        field5451++;
        if (arg2 != 4940) {
            method2413((String) null, true, 121);
        }
        if (!arg1) {
            try {
                class88.method702(class128.field2163.field2350, "loggedout", (byte) 51);
            } catch (Throwable var8) {
            }
            try {
                class32.field463.getAppletContext().showDocument(new URL(class32.field463.getCodeBase(), arg0), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class42.field607 && class16.field184) {
            try {
                class88.method700(class128.field2163.field2350, true, "openjs", new Object[] { (new URL(class32.field463.getCodeBase(), arg0)).toString() });
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class32.field463.getAppletContext().showDocument(new URL(class32.field463.getCodeBase(), arg0), "_blank");
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZLth;I)V", line = 67)
    public static final void method2414(int arg0, int arg1, int arg2, int arg3, boolean arg4, class57 arg5, int arg6) {
        if (arg3 != -1) {
            return;
        }
        class152.field2417 = 1;
        class183.field2954 = arg0;
        class267.field4479 = arg2;
        class200.field3190 = arg4;
        class66.field1177 = arg1;
        field5448++;
        class318.field5065 = arg6;
        class135.field2259 = arg5;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 94)
    public final void method2415(int arg0) {
        field5452++;
        class246.method1894(this.field5447, this.field5453, this.field5457);
        if (arg0 != -1) {
            method2413((String) null, false, -89);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 119)
    protected class342() {
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V", line = 131)
    public static final void method2416(byte arg0, int arg1) {
        field5458++;
        class173.field2768.method2326(-4);
        if (arg0 < 51) {
            method2416((byte) -63, -90);
        }
        class173.field2768 = new class332(arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public abstract void method572(int arg0, int arg1, byte arg2, Graphics arg3);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method573(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method571(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5);
}
