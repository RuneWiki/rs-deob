import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class282 {

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "Lep;")
    private class371 field3740;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3739 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "[[I")
    public static int[][] field3744 = new int[6][];

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
    public static int field3747 = 100;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public static int field3746 = -1;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
    public static int field3749 = 0;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!sea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3738++;
        this.field3740.method2078((byte) -85, this.field3742);
        super.finalize();
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
    public static final void method1685(byte arg0) {
        field3748++;
        for (class67 var1 = (class67) class154.field2122.method3118((byte) 73); var1 != null; var1 = (class67) class154.field2122.method3111(125)) {
            if (var1.field934) {
                var1.method437((byte) 109);
            }
        }
        for (class67 var2 = (class67) class483.field6544.method3118((byte) 73); var2 != null; var2 = (class67) class483.field6544.method3111(123)) {
            if (var2.field934) {
                var2.method437((byte) 114);
            }
        }
        if (arg0 != -90) {
            method1687(-58);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Z")
    public static final boolean method1686(int arg0, int arg1) {
        field3743++;
        if (arg1 == -6) {
            return arg0 == 10 || arg0 == 9 || arg0 == 1002 || arg0 == 5 || arg0 == 15;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public static void method1687(int arg0) {
        if (arg0 != 0) {
            field3749 = 14;
        }
        field3739 = null;
        field3744 = null;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(II)V")
    public static final void method1688(int arg0, int arg1) {
        if (arg1 == 37) {
            class531.field7438 = 3.0F;
        } else if (arg1 == 50) {
            class531.field7438 = 4.0F;
        } else if (arg1 == 75) {
            class531.field7438 = 6.0F;
        } else if (arg1 == 100) {
            class531.field7438 = 8.0F;
        } else if (arg1 == 200) {
            class531.field7438 = 16.0F;
        }
        class313.field4031 = -1;
        field3745++;
        class313.field4031 = -1;
        if (arg0 != 9179409) {
            field3741 = 87;
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lep;II)V")
    public class282(class371 arg0, int arg1, int arg2) {
        this.field3740 = arg0;
        this.field3742 = arg2;
    }
}
