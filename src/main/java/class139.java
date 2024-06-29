import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class139 {

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public int field2208 = -1;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "[I")
    public static int[] field2206 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Ltd;")
    public static class107 field2204;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "Leq;")
    public class140 field2207;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[I")
    public int[] field2205;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "[Lof;")
    public static class421[] field2210;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field2203;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 4)
    public static void method1124(int arg0) {
        if (arg0 != 10240) {
            method1124(-48);
        }
        field2206 = null;
        field2204 = null;
        field2210 = null;
    }
}
