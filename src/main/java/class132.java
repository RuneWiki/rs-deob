import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class132 extends class114 {

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "[I")
    public static int[] field1783 = new int[120];

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lps;")
    public static class63 field1784;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
    public class132(int arg0) {
        this.field1781 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIBI)V")
    public static final void method902(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == -21) {
            if (class203.field2716.field1173 != 0 && arg4 != 0 && class303.field4434 < 50 && arg0 != -1) {
                class475.field7049[class303.field4434++] = new class153((byte) 2, arg0, arg4, arg1, arg2, 0);
            }
            field1782++;
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method652(int arg0);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public static void method903(byte arg0) {
        field1783 = null;
        field1784 = null;
        if (arg0 != 11) {
            method903((byte) -49);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Z")
    public abstract boolean method651(byte arg0);

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1783[var1] = var0 / 4;
        }
        field1785 = 2;
        field1784 = new class63();
    }
}
