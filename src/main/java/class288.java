import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class288 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "B")
    private byte field4929;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field4942;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public int field4941;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[Lk;")
    public static class228[] field4927 = new class228[0];

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lok;")
    private static class146 field4931 = class235.method1724(-12908, "Loading config )2 ");

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lok;")
    public static class146 field4934 = class235.method1724(-12908, "sch-Utteln:");

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lok;")
    public static class146 field4937 = field4931;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field4938 = 0;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lok;")
    private static class146 field4935 = class235.method1724(-12908, "Started 3d Library");

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lok;")
    public static class146 field4930 = field4935;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "B")
    public static byte field4943;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)I", line = 4)
    public final int method2074(boolean arg0) {
        field4928++;
        if (!arg0) {
            this.field4941 = -13;
        }
        return this.field4929 & 0x7;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)I", line = 20)
    public static final int method2075(int arg0) {
        if (arg0 != 7) {
            field4931 = (class146) null;
        }
        field4932++;
        return 6;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B[B)Lih;", line = 32)
    public static final class30 method2076(byte arg0, byte[] arg1) {
        field4933++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 57) {
            field4943 = -14;
        }
        class30 var2;
        if (class271.field4640) {
            var2 = new class308(arg1, class226.field3776, class23.field424, class238.field3967, class150.field2562, class17.field353);
        } else {
            var2 = new class90(arg1, class226.field3776, class23.field424, class238.field3967, class150.field2562, class17.field353);
        }
        class301.method2122((byte) 0);
        return var2;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 61)
    public static void method2077(int arg0) {
        field4935 = null;
        field4927 = null;
        if (arg0 <= -46) {
            field4934 = null;
            field4930 = null;
            field4931 = null;
            field4937 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I", line = 103)
    public final int method2078(int arg0) {
        if (arg0 >= -90) {
            method2076((byte) -29, (byte[]) null);
        }
        field4926++;
        return (this.field4929 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z", line = 125)
    public static final boolean method2079(int arg0, int arg1) {
        class171.field2892 = true;
        field4936++;
        class32.field616 = arg0 + 1 & 0xFFFF;
        if (arg1 != 14686) {
            field4930 = (class146) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 158)
    public class288() {
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lwe;)V", line = 160)
    public class288(class47 arg0) {
        this.field4929 = arg0.method352(255);
        this.field4944 = arg0.method379(-2);
        this.field4939 = arg0.method373((byte) 36);
        this.field4942 = arg0.method373((byte) 36);
        this.field4940 = arg0.method373((byte) 36);
        this.field4941 = arg0.method373((byte) 36);
    }
}
