import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class295 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    private int field4504 = 0;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lsl;")
    private class39 field4506;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[[B")
    public static byte[][] field4502 = new byte[50][];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lbm;")
    public static class307 field4507;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Laa;")
    private class35 field4508;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Laa;", line = 14)
    public final class35 method1974(int arg0) {
        this.field4504 = arg0;
        field4505++;
        return this.method1977(-1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjava/lang/String;)I", line = 30)
    public static final int method1975(byte arg0, String arg1) {
        if (arg0 < 74) {
            method1976((byte) 62);
        }
        field4503++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 42)
    public static void method1976(byte arg0) {
        field4502 = (byte[][]) null;
        if (arg0 > -81) {
            method1975((byte) -25, (String) null);
        }
        field4507 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Laa;", line = 56)
    public final class35 method1977(int arg0) {
        field4501++;
        if (arg0 > ~this.field4504 && this.field4506.field751[this.field4504 - 1] != this.field4508) {
            class35 var2 = this.field4508;
            this.field4508 = var2.field701;
            return var2;
        }
        class35 var3;
        do {
            if (this.field4504 >= this.field4506.field752) {
                return null;
            }
            var3 = this.field4506.field751[this.field4504++].field701;
        } while (this.field4506.field751[this.field4504 - 1] == var3);
        this.field4508 = var3.field701;
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lsl;)V", line = 90)
    public class295(class39 arg0) {
        this.field4506 = arg0;
    }
}
