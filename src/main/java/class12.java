import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "[I")
    public static int[] field245 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lmd;")
    public static class379 field246 = new class379(new byte[5000]);

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "[B")
    public static byte[] field248 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field251 = 104;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field247;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static void method129(byte arg0) {
        field248 = null;
        field247 = null;
        int var1 = -105 / ((arg0 - 58) / 37);
        field246 = null;
        field245 = null;
    }
}
