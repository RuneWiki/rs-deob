import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class425 {

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lmq;")
    private class472 field6106 = new class472(64);

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Ljn;")
    private class668 field6108;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Ljn;")
    private class668 field6105;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lan;")
    public static class22 field6104 = new class22();

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field6109 = 0;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "[[I")
    public static int[][] field6110 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static void method2562(byte arg0) {
        if (arg0 < 115) {
            field6104 = null;
        }
        field6110 = null;
        field6104 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)Lnd;")
    public final class505 method2563(byte arg0, int arg1) {
        field6107++;
        class505 var3 = (class505) this.field6106.method2766(-124, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        if (arg0 < 78) {
            this.method2563((byte) -20, 84);
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field6108.method3800(arg1 & 0x7FFF, 0, (byte) -92);
        } else {
            var4 = this.field6105.method3800(arg1, 0, (byte) -92);
        }
        class505 var5 = new class505();
        if (var4 != null) {
            var5.method2929((byte) -105, new class389(var4));
        }
        if (arg1 >= 32768) {
            var5.method2922(false);
        }
        this.field6106.method2772(var5, true, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(ILjn;Ljn;)V")
    public class425(int arg0, class668 arg1, class668 arg2) {
        this.field6108 = arg2;
        this.field6105 = arg1;
        if (this.field6105 != null) {
            this.field6105.method3805(0, false);
        }
        if (this.field6108 != null) {
            this.field6108.method3805(0, false);
        }
    }
}
