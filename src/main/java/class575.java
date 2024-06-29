import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class575 extends class627 {

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "[I")
    public static int[] field8023 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
    public static int field8031 = 0;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "Lus;")
    public static class328 field8020 = new class328(15, 6);

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "I")
    public static int field8033 = 0;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "I")
    public static int field8034 = 16777215;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public int field8019;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public int field8021;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public int field8022;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    public int field8025;

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
    public int field8029;

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "I")
    public int field8030;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "Lql;")
    public static class187 field8035;

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "Lgaa;")
    public class460 field8028;

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "Lgaa;")
    public class460 field8032;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "Ljava/lang/String;")
    public String field8024;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "Z")
    public boolean field8026;

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field8027;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 6)
    public static final boolean method3223(String arg0, int arg1) {
        field8018++;
        if (arg1 != 32145) {
            method3224((byte) 2);
        }
        return class377.method2291(arg0, (byte) -55, 10, true);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V", line = 31)
    public static void method3224(byte arg0) {
        field8035 = null;
        if (arg0 < 65) {
            method3224((byte) 117);
        }
        field8023 = null;
        field8020 = null;
    }
}
