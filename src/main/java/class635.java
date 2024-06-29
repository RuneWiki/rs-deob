import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class635 {

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public int field8797;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "[I")
    public static int[] field8803 = new int[4096];

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "Lan;")
    public static class182 field8796 = new class182(8, -1);

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "[[Z")
    public static boolean[][] field8798;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3450(boolean arg0) {
        field8803 = null;
        field8796 = null;
        if (arg0) {
            method3451(114, 19, -106, 41);
        }
        field8798 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIII)V", line = 18)
    public static final void method3451(int arg0, int arg1, int arg2, int arg3) {
        field8799++;
        if (arg1 != -12989) {
            field8798 = null;
        }
        class711 var4 = class73.field960[arg3][arg2];
        class672.method3625(var4 == null ? class636.field8805 : var4, (byte) 5, arg0);
    }

    @OriginalMember(owner = "client!jt", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field8802++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V", line = 50)
    public class635(int arg0) {
        this.field8797 = arg0;
    }
}
