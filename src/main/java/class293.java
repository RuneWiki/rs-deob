import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class293 extends class435 {

    @OriginalMember(owner = "client!un", name = "q", descriptor = "Ljc;")
    public static class305 field3870 = new class305("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!un", name = "z", descriptor = "Lao;")
    public static class191 field3879 = new class191(55, -1);

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field3881 = 0;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "Lka;")
    public static class331 field3880 = new class331(1);

    @OriginalMember(owner = "client!un", name = "E", descriptor = "[I")
    public static int[] field3884 = new int[32];

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public int field3871;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "Lgf;")
    public static class183 field3883;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "Ljk;")
    public class450 field3875;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "Ljk;")
    public class450 field3877;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "Ljava/lang/String;")
    public String field3878;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "Z")
    public boolean field3869;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field3866;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 6)
    public static void method1761(byte arg0) {
        field3870 = null;
        if (arg0 <= 123) {
            field3876 = -58;
        }
        field3880 = null;
        field3879 = null;
        field3883 = null;
        field3884 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILug;)Lfj;", line = 26)
    public static final class469 method1762(int arg0, class396 arg1) {
        field3867++;
        int var2 = 70 / ((-arg0 - 72) / 47);
        return new class469(arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2396((byte) 95), arg1.method2396((byte) -92), arg1.method2388((byte) -115));
    }
}
