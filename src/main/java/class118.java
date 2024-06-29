import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class118 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1985 = 0;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lrg;")
    public static class88 field1980;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "[[I")
    public static int[][] field1982;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[[[B")
    public static byte[][][] field1981;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[[[Lsc;")
    public static class249[][][] field1984;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 30)
    public static void method884(byte arg0) {
        int var1 = -72 / ((arg0 + 20) / 43);
        field1982 = (int[][]) null;
        field1984 = (class249[][][]) null;
        field1980 = null;
        field1981 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 54)
    public static final void method885(boolean arg0) {
        if (class250.field4219 != null) {
            class250.field4219.method1033((byte) -72);
        }
        if (class195.field3208 != null) {
            class195.field3208.method1033((byte) -109);
        }
        if (!arg0) {
            method884((byte) 16);
        }
        field1983++;
    }
}
