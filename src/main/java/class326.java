import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class326 {

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "Lsd;")
    public static class80 field4700 = new class80(8);

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field4703 = 0;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "F")
    public static float field4698;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "F")
    public static float field4704;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Lil;")
    public class7 field4701;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "[[[I")
    public static int[][][] field4697;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "[[[Luaa;")
    public static class99[][][] field4699;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IBI)I", line = 5)
    public static final int method2114(int arg0, byte arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        field4702++;
        if (arg1 != -42) {
            field4699 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 32)
    public static void method2115(int arg0) {
        int var1 = -128 % ((49 - arg0) / 42);
        field4700 = null;
        field4697 = null;
        field4699 = null;
    }
}
