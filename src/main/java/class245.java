import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public abstract class class245 extends class383 {

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "Lug;")
    public class395 field3171;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "Z")
    public boolean field3163;

    static {
        new class335("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I", line = 4)
    public final int method1487(int arg0) {
        if (arg0 <= 121) {
            return -51;
        } else {
            field3172++;
            return 1;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIZFIZ)[I", line = 18)
    public static final int[] method1491(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5, int arg6, boolean arg7) {
        field3164++;
        int[] var8 = new int[arg2];
        class468 var9 = new class468();
        var9.field6752 = arg1;
        var9.field6758 = arg0;
        var9.field6759 = arg4;
        var9.field6766 = (int) (arg5 * 4096.0F);
        var9.field6767 = arg3;
        var9.field6757 = arg6;
        var9.method109(arg7);
        class172.method1098(1, arg2, 108);
        var9.method2824((byte) 117, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)Lmv;", line = 42)
    public static final class254 method1492(byte arg0) {
        if (arg0 != 59) {
            field3167 = -33;
        }
        field3166++;
        class293.field3732 = 0;
        return class273.method1616(false);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZIZZ)V", line = 62)
    public static final void method1496(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        field3168++;
        if (arg3) {
            field3167 = 111;
        }
        class133.method923(2, arg0, arg4, arg1, arg2, class62.field808.length - 1, 0);
        class251.field3213 = null;
        class387.field5104 = 0;
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)I", line = 75)
    public int method1497(byte arg0) {
        field3165++;
        if (arg0 > -92) {
            this.field3171 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(B)Z", line = 86)
    public final boolean method1498(byte arg0) {
        field3169++;
        if (arg0 != 82) {
            this.method1497((byte) -101);
        }
        return false;
    }

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "(I)Z", line = 98)
    public final boolean method1499(int arg0) {
        if (arg0 != -1) {
            this.method1487(77);
        }
        field3170++;
        return this.field3163;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lug;)V", line = 117)
    public class245(class395 arg0) {
        this.field3171 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)Z")
    public abstract boolean method1488(int arg0);

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)V")
    public abstract void method1489(int arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
    public abstract boolean method1490(byte arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)V")
    public abstract void method1493(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
    public abstract void method1494(int arg0, int arg1);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lml;IILml;)V")
    public abstract void method1495(class265 arg0, int arg1, int arg2, class265 arg3);
}
