import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class580 {

    @OriginalMember(owner = "client!go", name = "e", descriptor = "J")
    public static long field8174 = 0L;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field8173 = 0;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "J")
    public static long field8175 = -1L;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lpu;")
    public static class522 field8170;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[Lea;")
    public static class506[] field8172;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[Lf;")
    public static class702[] field8176;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[[[I")
    public static int[][][] field8171;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 6)
    public static void method3311(byte arg0) {
        field8172 = null;
        field8171 = null;
        field8176 = null;
        if (arg0 != 118) {
            method3311((byte) -36);
        }
        field8170 = null;
    }
}
