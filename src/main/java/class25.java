import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "B")
    private byte field389;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Luf;")
    public static class310 field388 = new class310(36, 14);

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Llh;")
    public static class365 field398 = new class365(new byte[5000]);

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[[Lss;")
    public static class295[][] field396;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static void method181(byte arg0) {
        field388 = null;
        if (arg0 != 21) {
            method181((byte) -68);
        }
        field396 = null;
        field398 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I")
    public final int method182(int arg0) {
        if (arg0 != 8) {
            field396 = null;
        }
        field392++;
        return this.field389 & 0x7;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
    public static int method183(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class25() {
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Llh;)V")
    public class25(class365 arg0) {
        this.field389 = arg0.method2081((byte) -35);
        this.field394 = arg0.method2062((byte) 14);
        this.field395 = arg0.method2056((byte) -52);
        this.field390 = arg0.method2056((byte) -51);
        this.field391 = arg0.method2056((byte) 80);
        this.field397 = arg0.method2056((byte) -76);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)I")
    public final int method184(byte arg0) {
        if (arg0 == -101) {
            field393++;
            return (this.field389 & 0x8) == 8 ? 1 : 0;
        } else {
            return 126;
        }
    }
}
