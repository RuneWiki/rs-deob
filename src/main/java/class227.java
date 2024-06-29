import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class227 extends class81 {

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lci;")
    public static class233 field3881 = new class233(64);

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field3886 = 0;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Lpj;")
    public static class237 field3890 = class33.method353("Texturen geladen)3", 31);

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field3891 = 0;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Lpj;")
    private static class237 field3889 = class33.method353("Connecting to update server", 16);

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Lpj;")
    public static class237 field3894 = field3889;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "Lug;")
    public static class194 field3884;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
    public int[] field3877;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "[I")
    public int[] field3892;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "[I")
    public int[] field3893;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "[Ljj;")
    public class103[] field3878;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[Ljj;")
    public class103[] field3879;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[Lpj;")
    public static class237[] field3887;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "[[[B")
    public byte[][][] field3880;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
    public static final boolean method1510(int arg0, int arg1) {
        field3883++;
        if (arg1 == -1496161763) {
            return (arg0 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
    public static final void method1511(int arg0, int arg1) {
        class216.field3755.method939(arg0, 1);
        class203.field3482.method939(arg0, 1);
        field3885++;
        class232.field4020.method939(arg0, 1);
        class32.field670.method939(arg0, arg1 + 1);
        if (arg1 != 0) {
            field3886 = 23;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method1512(byte arg0) {
        field3889 = null;
        field3884 = null;
        field3894 = null;
        field3890 = null;
        field3881 = null;
        if (arg0 == -9) {
            field3887 = null;
        }
    }
}
