import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class91 extends class314 {

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lhc;")
    public static class171 field1715 = new class171(4);

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "[[[I")
    public static int[][][] field1717 = new int[2][][];

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field1718 = 128;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lud;")
    public static class279 field1719 = class130.method1024("www)2wtqa", 255);

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Lud;")
    public static class279 field1720 = class130.method1024("(U4", 255);

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lua;")
    public static class90 field1716;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 10)
    public static void method782(int arg0) {
        field1719 = null;
        if (arg0 == 128) {
            field1720 = null;
            field1716 = null;
            field1717 = (int[][][]) null;
            field1715 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 53)
    public class91() {
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V", line = 55)
    public class91(int arg0) {
        this.field1714 = arg0;
    }
}
