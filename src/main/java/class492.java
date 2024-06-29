import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class492 {

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public int field6728 = class99.method720(71);

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/lang/String;")
    public String field6716;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Ljava/lang/String;")
    public String field6721;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public int field6725;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field6719;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field6718;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Ljava/lang/String;")
    public String field6727;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Ljava/lang/String;")
    public String field6724;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/lang/String;")
    public String field6722;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field6714;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Lem;")
    public static class206 field6726 = new class206(32, -2);

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lem;")
    public static class206 field6729 = new class206(26, 7);

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lhm;")
    public static class202 field6730 = new class202("WIP", 2);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "[Lf;")
    public static class702[] field6731;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[[[B")
    public static byte[][][] field6720;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method2782(byte arg0) {
        if (arg0 <= 73) {
            return;
        }
        field6730 = null;
        field6729 = null;
        field6726 = null;
        field6731 = null;
        field6720 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z")
    public static final boolean method2783(int arg0, int arg1) {
        int var2 = 87 / ((-arg1 - 69) / 45);
        field6723++;
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public final void method2784(String arg0, int arg1, int arg2, String arg3, int arg4, String arg5, String arg6, int arg7, String arg8) {
        this.field6728 = class99.method720(71);
        if (arg2 != -2) {
            field6726 = null;
        }
        field6717++;
        this.field6727 = arg0;
        this.field6721 = arg6;
        this.field6714 = class186.field2697;
        this.field6716 = arg8;
        this.field6722 = arg5;
        this.field6718 = arg7;
        this.field6725 = arg1;
        this.field6719 = arg4;
        this.field6724 = arg3;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class492(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field6716 = arg7;
        this.field6721 = arg3;
        this.field6725 = arg1;
        this.field6719 = arg0;
        this.field6718 = arg6;
        this.field6727 = arg5;
        this.field6724 = arg2;
        this.field6722 = arg4;
        this.field6714 = class186.field2697;
    }
}
