import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class212 extends Canvas {

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field3049;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public static int[] field3042 = new int[50];

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
    public static int[] field3048 = new int[500];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lnk;")
    public static class11 field3045;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIILtk;JZ)V")
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, class219 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class109 var8 = new class109();
        var8.field1569 = arg4;
        var8.field1573 = arg1 * 128 + 64;
        var8.field1576 = arg2 * 128 + 64;
        var8.field1583 = arg3;
        var8.field1578 = arg5;
        if (class16.field233[arg0][arg1][arg2] == null) {
            class16.field233[arg0][arg1][arg2] = new class131(arg0, arg1, arg2);
        }
        class16.field233[arg0][arg1][arg2].field1930 = var8;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILkl;)Lcl;")
    public static final class115 method1351(int arg0, class114 arg1) {
        arg1.method760(false);
        int var2 = arg1.method760(false);
        field3046++;
        class115 var3 = class109.method715(var2, arg0 + 22046);
        var3.field1711 = arg1.method760(false);
        int var4 = arg1.method760(false);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method760(false);
            var3.method168(-1, arg1, var6);
        }
        var3.method170((byte) 23);
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3049.update(arg0);
        field3044++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1352(int arg0) {
        field3042 = null;
        if (arg0 != 128) {
            field3048 = null;
        }
        field3048 = null;
        field3045 = null;
    }

    @OriginalMember(owner = "client!fe", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field3049.paint(arg0);
        field3041++;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class212(Component arg0) {
        this.field3049 = arg0;
    }
}
