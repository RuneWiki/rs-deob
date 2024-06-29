import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class251 extends class188 {

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "[B")
    public byte[] field3980;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[Lo;")
    public static class231[] field3974 = new class231[32768];

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Lnk;")
    public static class16 field3976;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[I")
    public static int[] field3978;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "[Lmm;")
    public static class285[] field3979;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "[Z")
    public static boolean[] field3975;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 13)
    public static void method1784(byte arg0) {
        field3979 = null;
        field3976 = null;
        if (arg0 <= 76) {
            method1784((byte) -109);
        }
        field3978 = null;
        field3974 = null;
        field3975 = null;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([B)V", line = 34)
    public class251(byte[] arg0) {
        this.field3980 = arg0;
    }
}
