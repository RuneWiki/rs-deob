import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class27 {

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "B")
    private byte field239;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public int field231;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field230;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)I")
    public final int method115(int arg0) {
        if (arg0 != 8) {
            method116((byte) 84);
        }
        field237++;
        return (this.field239 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
    public static void method116(byte arg0) {
        field230 = null;
        int var1 = 11 % ((arg0 - 49) / 34);
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
    public class27() {
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
    public final int method117(int arg0) {
        if (arg0 != 7) {
            this.method115(-56);
        }
        field238++;
        return this.field239 & 0x7;
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lmc;)V")
    public class27(class234 arg0) {
        this.field239 = arg0.method1554(27806);
        this.field236 = arg0.method1553((byte) 77);
        this.field234 = arg0.method1497((byte) 27);
        this.field231 = arg0.method1497((byte) 67);
        this.field232 = arg0.method1497((byte) 36);
        this.field235 = arg0.method1497((byte) 38);
    }
}
