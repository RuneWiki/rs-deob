import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class209 extends class272 {

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "[B")
    public byte[] field3182;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field3181 = 2;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field3183 = 0;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "Lwf;")
    public static class79 field3180 = new class79(67, 2);

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "Lus;")
    public static class1 field3184 = new class1(103, 3);

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
    public static void method1361(byte arg0) {
        field3184 = null;
        field3180 = null;
        int var1 = -109 / ((arg0 - 31) / 36);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([B)V")
    public class209(byte[] arg0) {
        this.field3182 = arg0;
    }
}
