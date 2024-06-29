import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class272 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lkh;")
    public static class13 field4669 = new class13(new byte[5000]);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4670 = 0;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "[I")
    public static int[] field4672 = new int[5];

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
    public static int[] field4671 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Z")
    public static boolean field4674 = false;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public int field4668;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field4673;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public int field4676;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[[Lja;")
    public static class60[][] field4675;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 9)
    public static void method1893(byte arg0) {
        field4671 = null;
        if (arg0 != 80) {
            method1893((byte) -24);
        }
        field4675 = (class60[][]) null;
        field4669 = null;
        field4672 = null;
    }
}
