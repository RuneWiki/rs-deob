import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class111 extends class134 {

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "[B")
    public byte[] field1172;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "[I")
    public static int[] field1169 = new int[2048];

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[[B")
    public static byte[][] field1170 = new byte[50][];

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "[I")
    public static int[] field1173;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 6)
    public static void method749(int arg0) {
        field1173 = null;
        if (arg0 == -16379) {
            field1169 = null;
            field1170 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V", line = 18)
    public static final void method750(int arg0, int arg1, int arg2) {
        field1171++;
        class47 var3 = class258.method1546(15, 0, (byte) 121);
        var3.method271((byte) 124);
        var3.field507 = arg1;
        if (arg2 > -13) {
            method750(-19, -101, 106);
        }
        var3.field514 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([B)V", line = 40)
    public class111(byte[] arg0) {
        this.field1172 = arg0;
    }
}
