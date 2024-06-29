import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class28 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[[I")
    public static int[][] field462 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method164(int arg0) {
        field462 = null;
        if (arg0 < 46) {
            field462 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static final void method165(byte arg0) {
        if (arg0 <= -43) {
            field463++;
            class318.field4398.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
    public static final void method166(byte arg0, String arg1, int arg2, String arg3) {
        class419.field5730 = arg2;
        class554.field7754 = 2;
        if (arg0 <= 9) {
            method165((byte) -90);
        }
        field461++;
        class492.method2763(arg3, false, 0, arg1);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([SB)[S")
    public static final short[] method167(short[] arg0, byte arg1) {
        field464++;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 114 % ((-arg1 - 13) / 61);
            short[] var3 = new short[arg0.length];
            class205.method1316(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }
}
