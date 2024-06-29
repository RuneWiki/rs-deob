import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class335 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5058 = 4;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lpi;")
    public static class342 field5054 = new class342("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5060 = 0;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lpi;")
    public static class342 field5062 = new class342(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lde;")
    public static class368 field5059;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "[Lna;")
    public static class35[] field5061;

    @OriginalMember(owner = "client!ef", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5056++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method2144(int arg0) {
        field5062 = null;
        if (arg0 < -122) {
            field5059 = null;
            field5061 = null;
            field5054 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([BI)[B")
    public static final byte[] method2145(byte[] arg0, int arg1) {
        if (arg1 != 4) {
            return null;
        }
        field5057++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class73.method589(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIII)V")
    public class335(int arg0, int arg1, int arg2, int arg3) {
        this.field5052 = arg0;
        this.field5055 = arg3;
        this.field5051 = arg1;
        this.field5053 = arg2;
    }
}
