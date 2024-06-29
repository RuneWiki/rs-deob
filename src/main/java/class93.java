import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class93 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field1355 = -1;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field1352 = -1;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1353 = new String[100];

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[[B")
    public static byte[][] field1357 = new byte[50][];

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[Lpt;")
    public static class403[] field1359 = new class403[30];

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lcg;")
    public static class10 field1354 = new class10(9, 0, 4, 1);

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lkm;")
    public static class137 field1361;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
    public int[] field1356;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1357 = null;
        field1361 = null;
        if (arg0 == 0) {
            field1353 = null;
            field1354 = null;
            field1359 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILhw;I)V")
    private final void method640(int arg0, class208 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1355 = arg1.method1455(arg2 - 3384);
        } else if (arg0 == 2) {
            this.field1356 = new int[arg1.method1445(arg2 ^ 0x54)];
            for (int var4 = 0; var4 < this.field1356.length; var4++) {
                this.field1356[var4] = arg1.method1455(-3387);
            }
        } else if (arg0 == 3) {
            this.field1352 = arg1.method1445(-127);
        }
        if (arg2 == -3) {
            field1358++;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLhw;)V")
    public final void method641(byte arg0, class208 arg1) {
        while (true) {
            int var3 = arg1.method1445(-113);
            if (var3 == 0) {
                field1360++;
                if (arg0 < 107) {
                    this.method640(31, null, -42);
                    return;
                }
                return;
            }
            this.method640(var3, arg1, -3);
        }
    }
}
