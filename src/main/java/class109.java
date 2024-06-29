import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class109 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Liq;")
    public static class362 field1338 = new class362("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "S")
    public static short field1343 = 205;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
    public static int[] field1344 = new int[200];

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[[I")
    public static int[][] field1345;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lrr;")
    public static class202 field1341;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[[B")
    public static byte[][] field1346;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method692(byte arg0) {
        class182.field2485.method1887(-99);
        field1340++;
        class328.field4655.method1948((byte) 105);
        int var1 = 19 / ((arg0 - 56) / 56);
        class23.field287.method1948((byte) -101);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILhl;)Lhl;")
    public abstract class311 method327(int arg0, class311 arg1);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lsg;")
    public static final class225 method693(int arg0, int arg1) {
        field1339++;
        class225 var2 = (class225) class118.field1443.method1625((long) arg1, arg0 ^ arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class203.field2924.method2431((byte) 68, 30, arg1);
        class225 var4 = new class225();
        if (var3 != null) {
            var4.method1507(new class236(var3), -110, arg1);
        }
        class118.field1443.method1622((byte) 13, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILtq;)V")
    public static final void method694(int arg0, class376 arg1) {
        if (arg0 == 6) {
            field1342++;
            class81.field945 = arg1;
            class225.field3154 = class81.field945.method2415(15, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public static void method695(byte arg0) {
        field1346 = null;
        field1344 = null;
        if (arg0 < 11) {
            field1345 = null;
        }
        field1341 = null;
        field1345 = null;
        field1338 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Ltn;")
    public static final class48 method696(int arg0, int arg1, int arg2) {
        class193 var3 = class250.field3570[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2788;
    }

    static {
        new class362("Ok", "Okay", "OK", "Ok");
        field1345 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
    }
}
