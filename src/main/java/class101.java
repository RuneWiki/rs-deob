import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class101 extends class350 implements class659 {

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "Lps;")
    private class82 field1373;

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    public static int field1370 = -1;

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "[[I")
    public static int[][] field1378 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
    public static int field1377 = -1;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method774(int arg0) {
        field1376++;
        if (arg0 != -22324) {
            field1370 = -105;
        }
        return super.method774(-22324);
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lmc;Lps;Z)V", line = 18)
    public class101(class120 arg0, class82 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field1373 = arg1;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)Lps;", line = 28)
    public final class82 method775(int arg0) {
        field1372++;
        int var2 = 112 / ((arg0 + 31) / 57);
        return this.field1373;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)I", line = 44)
    public final int method21(boolean arg0) {
        if (arg0) {
            field1370 = -28;
        }
        field1371++;
        return super.method21(false);
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(Z)V", line = 58)
    public final void method776(boolean arg0) {
        super.method776(arg0);
        field1374++;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IB)V", line = 66)
    public final void method777(int arg0, byte arg1) {
        field1369++;
        super.method777(this.field1373.field1141 * arg0, arg1);
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V", line = 79)
    public static void method778(int arg0) {
        if (arg0 == -10) {
            field1378 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 89)
    public final Buffer method779(byte arg0, boolean arg1) {
        field1375++;
        if (arg0 != -20) {
            this.method775(93);
        }
        return super.method779((byte) -20, arg1);
    }
}
