import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class16 extends class287 {

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "D")
    public double field205;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "[[S")
    public short[][] field208;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "Lfha;")
    public static class522 field206 = new class522();

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "Lju;")
    public static class102 field209 = new class102(19, 8);

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Lcd;")
    public static class22 field212;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)V", line = 12)
    public static final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg3; var6++) {
            class721.method4044(class591.field8480[var6], arg5, (byte) -124, arg0, arg1);
        }
        field211++;
        if (arg2 != -334506528) {
            method80(-5, 0, 32, 48, 16, -93);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)J", line = 31)
    public final long method81(byte arg0) {
        field207++;
        if (arg0 != 98) {
            this.method81((byte) 94);
        }
        return (long) (this.field208.length << 0 | this.field208[0].length);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 45)
    public static void method82(int arg0) {
        if (arg0 > 67) {
            field209 = null;
            field206 = null;
            field212 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "([[SD)V", line = 58)
    public class16(short[][] arg0, double arg1) {
        this.field205 = arg1;
        this.field208 = arg0;
    }
}
