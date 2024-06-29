import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class159 extends class521 {

    @OriginalMember(owner = "client!r", name = "M", descriptor = "[[I")
    public static int[][] field1966 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!r", name = "I", descriptor = "Lqda;")
    public static class87 field1962 = new class87();

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "[B")
    private byte[] field1968;

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 3)
    public class159() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method917(int arg0, int arg1, int arg2) {
        field1969++;
        if (arg0 != 8) {
            field1962 = null;
        }
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 22)
    public static void method918(byte arg0) {
        if (arg0 <= -97) {
            field1962 = null;
            field1966 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBLkea;IZ)V", line = 40)
    public static final void method919(int arg0, int arg1, int arg2, byte arg3, class203 arg4, int arg5, boolean arg6) {
        class332.field4779 = arg0;
        class509.field7411 = arg1;
        class22.field221 = arg2;
        class438.field6508 = arg6;
        field1964++;
        class568.field8160 = 1;
        class195.field2647 = arg4;
        class190.field2345 = class224.field3145.method2475((byte) -124) / arg5;
        if (arg3 >= -65) {
            field1962 = null;
        }
        if (class190.field2345 < 1) {
            class190.field2345 = 1;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILcm;)Ljava/lang/String;", line = 62)
    public static final String method920(int arg0, class631 arg1) {
        if (arg0 != -12510) {
            method917(-111, 30, -28);
        }
        field1965++;
        return arg1.field9107 == null || arg1.field9107.length() <= 0 ? arg1.field9101 : arg1.field9101 + class448.field6683.method2902(class35.field396, -20139) + arg1.field9107;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)[B", line = 77)
    public final byte[] method921(int arg0, int arg1, int arg2, int arg3) {
        this.field1968 = new byte[arg0 * 2 * arg2 * arg3];
        if (arg1 == -22908) {
            field1967++;
            this.method2905(arg2, arg0, (byte) -128, arg3);
            return this.field1968;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)V", line = 93)
    public final void method922(int arg0, int arg1, byte arg2) {
        field1960++;
        int var4 = arg0 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field1968[var10001] = -1;
        if (arg1 == 14482) {
            int var5 = arg2 & 0xFF;
            this.field1968[var6] = (byte) (var5 * 3 >> 5);
        }
    }
}
