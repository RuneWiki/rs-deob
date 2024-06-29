import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class554 extends class329 {

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public int field7828 = (int) (class538.method2963(-47) / 1000L);

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Ljava/lang/String;")
    public String field7824;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "S")
    public short field7823;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Lea;")
    public static class547 field7820 = new class547(98, -2);

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "Lqc;")
    public static class743 field7825 = new class743();

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Lfc;")
    public static class262 field7826 = new class262(4);

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field7827 = new String[100];

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method3144(byte arg0) {
        field7820 = null;
        field7826 = null;
        field7825 = null;
        field7827 = null;
        if (arg0 != -62) {
            field7820 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    public static final void method3145(byte arg0) {
        field7819++;
        if (class421.field5893 == 5) {
            class421.field5893 = 6;
            if (arg0 != -38) {
                method3146(52);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static final void method3146(int arg0) {
        class148.field1901.method2556(-124);
        field7822++;
        if (arg0 == 5134) {
            class68.field745.method2556(arg0 ^ 0xFFFFEBCC);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B[[[Llha;)V")
    public static final void method3147(byte arg0, class624[][][] arg1) {
        field7821++;
        if (arg0 >= -30) {
            field7825 = null;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class624[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class624 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field8736 instanceof class722) {
                            ((class722) var6.field8736).method681((byte) -96);
                        }
                        if (var6.field8738 instanceof class722) {
                            ((class722) var6.field8738).method681((byte) -96);
                        }
                        if (var6.field8730 instanceof class722) {
                            ((class722) var6.field8730).method681((byte) -96);
                        }
                        if (var6.field8728 instanceof class722) {
                            ((class722) var6.field8728).method681((byte) -96);
                        }
                        if (var6.field8737 instanceof class722) {
                            ((class722) var6.field8737).method681((byte) -96);
                        }
                        for (class603 var7 = var6.field8729; var7 != null; var7 = var7.field8413) {
                            class752 var8 = var7.field8410;
                            if (var8 instanceof class722) {
                                ((class722) var8).method681((byte) -96);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class554(String arg0, int arg1) {
        this.field7824 = arg0;
        this.field7823 = (short) arg1;
    }
}
