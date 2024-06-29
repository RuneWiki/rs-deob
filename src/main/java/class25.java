import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class25 extends class37 {

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lhc;")
    public static class368 field316 = new class368("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!n", name = "O", descriptor = "[I")
    public static int[] field324 = new int[1000];

    @OriginalMember(owner = "client!n", name = "H", descriptor = "B")
    public byte field317;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Lrg;")
    public class366 field315;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "[Z")
    public static boolean[] field320;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "[[[B")
    public static byte[][][] field321;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Lin;", line = 6)
    public static final class182 method153(int arg0, int arg1) {
        ++field314;
        class408 var2 = class354.field4769;
        class182 var3;
        synchronized (class354.field4769) {
            var3 = (class182) class354.field4769.method2529(arg0, (long) arg1);
            if (var3 == null) {
                var3 = new class182(arg1);
                class354.field4769.method2527(46, (long) arg1, var3);
            }
        }
        synchronized (var3) {
            return !var3.method1270((byte) -55) ? null : var3;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)[B", line = 30)
    public final byte[] method154(boolean arg0) {
        ++field318;
        if (!arg0) {
            return null;
        } else if (!super.field484 && this.field315.field5048 >= this.field315.field5076.length + -this.field317) {
            return this.field315.field5076;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V", line = 66)
    public static void method155(int arg0) {
        field320 = null;
        field324 = null;
        if (arg0 != 0) {
            field324 = null;
        }
        field316 = null;
        field321 = null;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)I", line = 81)
    public final int method156(byte arg0) {
        ++field322;
        if (this.field315 == null) {
            return 0;
        } else {
            return arg0 < 125 ? -73 : this.field315.field5048 * 100 / (this.field315.field5076.length + -this.field317);
        }
    }
}
