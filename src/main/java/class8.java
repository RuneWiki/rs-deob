import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class8 extends class308 {

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public int field100 = 0;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "Z")
    public static volatile boolean field101 = false;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "Lui;")
    public static class98 field104 = new class98(64);

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "F")
    public static float field106;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "Lnm;")
    public static class221 field107;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLfh;)V", line = 5)
    public final void method59(byte arg0, class313 arg1) {
        int var3 = -122 / ((arg0 - 79) / 39);
        while (true) {
            int var4 = arg1.method2224(-120);
            if (var4 == 0) {
                field99++;
                return;
            }
            this.method61(var4, arg1, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V", line = 27)
    public static void method60(byte arg0) {
        if (arg0 < -95) {
            field107 = null;
            field104 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILfh;B)V", line = 53)
    private final void method61(int arg0, class313 arg1, byte arg2) {
        if (arg2 < 57) {
            field101 = false;
        }
        field105++;
        if (arg0 == 2) {
            this.field100 = arg1.method2250(-1613178296);
        }
    }
}
