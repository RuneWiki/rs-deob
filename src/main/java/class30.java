import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 extends class260 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "J")
    public long field395;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Ldi;")
    public static class83 field396 = new class83(8, 3);

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lri;")
    public static class74 field398 = new class74(12, 2);

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
    public static volatile boolean field399 = true;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[I")
    public static int[] field402 = new int[100];

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lmg;")
    public static class101 field400;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "[Ll;")
    public static class16[] field403;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 7)
    public static void method176(byte arg0) {
        field403 = null;
        field402 = null;
        field396 = null;
        field398 = null;
        field400 = null;
        if (arg0 <= 31) {
            method176((byte) -112);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)Z", line = 31)
    public static final boolean method177(int arg0, int arg1, byte arg2) {
        field397++;
        int var3 = 97 % ((-arg2 - 27) / 47);
        return (arg0 & 0x70000) != 0 | class121.method853(arg0, (byte) -54, arg1) || class211.method1306(arg0, 32, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 40)
    public class30() {
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(J)V", line = 43)
    public class30(long arg0) {
        this.field395 = arg0;
    }
}
