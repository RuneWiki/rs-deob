import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class641 extends class775 {

    @OriginalMember(owner = "client!te", name = "u", descriptor = "J")
    private long field8893 = -1L;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Ljava/lang/String;")
    private String field8896 = null;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "[[I")
    public static int[][] field8898 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Lmga;")
    public static class739 field8895 = new class739(90, 2);

    @OriginalMember(owner = "client!te", name = "A", descriptor = "[I")
    public static int[] field8899 = new int[1];

    @OriginalMember(owner = "client!te", name = "v", descriptor = "B")
    private byte field8894;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    private int field8892;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLhka;)V", line = 4)
    public final void method2935(byte arg0, class56 arg1) {
        field8900++;
        class179 var3 = new class179();
        var3.field2378 = this.field8896;
        var3.field2381 = this.field8894;
        int var4 = 8 % ((arg0 + 58) / 57);
        var3.field2382 = this.field8892;
        arg1.method406(var3, -111);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjp;)V", line = 31)
    public final void method2934(int arg0, class376 arg1) {
        if (arg1.method2398(-1372747256) != 255) {
            arg1.field5459--;
            this.field8893 = arg1.method2366(true);
        }
        field8891++;
        this.field8896 = arg1.method2383((byte) 122);
        this.field8892 = arg1.method2359(-1);
        this.field8894 = arg1.method2387((byte) 90);
        if (arg0 != 3) {
            method3562((byte) -12);
        }
        arg1.method2366(true);
        if (class104.field1443) {
            System.out.println("memberhash:" + this.field8893 + " membername:" + this.field8896);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 57)
    public static void method3562(byte arg0) {
        field8899 = null;
        field8895 = null;
        field8898 = null;
        if (arg0 != 15) {
            method3562((byte) 95);
        }
    }
}
