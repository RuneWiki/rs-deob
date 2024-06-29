import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class201 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lnd;")
    public static class122 field3897 = new class122();

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lkb;")
    public static class93 field3904 = class76.method390("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 0);

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lkb;")
    public static class93 field3900 = class76.method390(")1p", 0);

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lkb;")
    public static class93 field3903 = class76.method390("titlebox", 0);

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Lkb;")
    private static class93 field3906 = class76.method390("green:", 0);

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "[I")
    public static int[] field3901 = new int[4000];

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lkb;")
    public static class93 field3898 = field3906;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lkb;")
    public static class93 field3902 = field3906;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lkb;")
    public static class93 field3907 = class76.method390("Die Adresse dieses Computers wurde gesperrt)1", 0);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Ljava/awt/Image;")
    public static Image field3899;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[Lna;")
    public static class119[] field3905;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1314(byte arg0) {
        field3903 = null;
        field3901 = null;
        field3898 = null;
        field3899 = null;
        field3905 = null;
        field3902 = null;
        field3906 = null;
        field3897 = null;
        field3904 = null;
        field3900 = null;
        if (arg0 <= -27) {
            field3907 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILkb;Lkb;Lkb;I)V")
    public static final void method1315(int arg0, class93 arg1, class93 arg2, class93 arg3, int arg4) {
        field3896++;
        for (int var5 = arg4; var5 > 0; var5--) {
            class82.field1519[var5] = class82.field1519[var5 - 1];
            class34.field561[var5] = class34.field561[var5 - 1];
            class161.field3223[var5] = class161.field3223[var5 - 1];
            class206.field4031[var5] = class206.field4031[var5 - 1];
        }
        class34.field561[0] = arg1;
        class80.field1421++;
        class82.field1519[0] = arg0;
        class206.field4033 = class203.field3928;
        class161.field3223[0] = arg2;
        class206.field4031[0] = arg3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static final void method1316(int arg0) {
        field3895++;
        if (class144.field2815 != null) {
            class144.field2815.method253(-1772);
        }
        if (class157.field3130 != null) {
            class157.field3130.method253(-1772);
        }
        if (arg0 != 0) {
            field3903 = null;
        }
    }
}
