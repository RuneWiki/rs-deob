import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class75 extends class369 {

    @OriginalMember(owner = "client!lq", name = "U", descriptor = "[[I")
    public static int[][] field1014 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!lq", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1015 = "Choose Option";

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "Lmi;")
    public static class408 field1009 = new class408();

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!lq", name = "T", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!lq", name = "W", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!lq", name = "X", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "Ljb;")
    public class425 field1012;

    @OriginalMember(owner = "client!lq", name = "Y", descriptor = "[B")
    public byte[] field1018;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(Z)V", line = 3)
    public static void method459(boolean arg0) {
        field1015 = null;
        if (!arg0) {
            field1015 = null;
        }
        field1014 = null;
        field1009 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqj;Lqj;BZ)V", line = 16)
    public static final void method460(class238 arg0, class238 arg1, byte arg2, boolean arg3) {
        class402.field5980 = arg0;
        class5.field46 = arg3;
        if (arg2 > -40) {
            method465(-94, 62, 115);
        }
        ++field1010;
        class123.field1649 = arg1;
        int var4 = -1 + class402.field5980.method1469((byte) -126);
        class228.field3223 = var4 * 256 + class402.field5980.method1476(var4, (byte) -72);
        class50.field703 = new String[] { null, null, class26.field451, null, null };
        class24.field436 = new String[] { null, null, null, null, class309.field4435 };
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)[B", line = 42)
    public final byte[] method461(int arg0) {
        ++field1011;
        if (super.field5481) {
            throw new RuntimeException();
        } else {
            return arg0 != 6 ? null : this.field1018;
        }
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)I", line = 62)
    public final int method462(int arg0) {
        ++field1013;
        if (arg0 != 2) {
            return -25;
        } else {
            return super.field5481 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)V", line = 77)
    public static final void method463(int arg0, int arg1) {
        int var2 = -125 % ((arg0 - -14) / 39);
        class24 var3 = class70.field966;
        synchronized (class70.field966) {
            class70.field966.method215(0, arg1);
        }
        ++field1006;
        class24 var4 = class132.field1770;
        synchronized (class132.field1770) {
            class132.field1770.method215(0, arg1);
        }
        class261 var5 = class114.field1551;
        synchronized (class114.field1551) {
            class114.field1551.method1642(arg1, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)I", line = 104)
    public static final int method464(int arg0) {
        if (arg0 != -96) {
            method464(-124);
        }
        ++field1016;
        return 2;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)I", line = 115)
    public static final int method465(int arg0, int arg1, int arg2) {
        ++field1008;
        class363 var3 = (class363) class157.field2069.method954(arg0 ^ 49, (long) arg1);
        if (var3 == null) {
            return 0;
        } else {
            return arg0 <= arg2 && var3.field5312.length > arg2 ? var3.field5312[arg2] : 0;
        }
    }
}
