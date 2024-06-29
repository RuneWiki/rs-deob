import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class306 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[Lsb;")
    public static class122[] field5148 = new class122[6];

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lbd;")
    public static class162 field5149 = class17.method142(0, "Titelbild geladen)3");

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lbd;")
    public static class162 field5155 = class17.method142(0, "welle:");

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lbd;")
    public static class162 field5150 = class17.method142(0, ")4p=");

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
    public static int[] field5152;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)I", line = 13)
    public static final int method2080(int arg0, byte arg1) {
        if (arg1 <= 36) {
            return 77;
        }
        field5151++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V", line = 58)
    public static final void method2081(int arg0, int arg1) {
        field5153++;
        class63 var2 = class46.method332(arg0, arg1, -12770);
        var2.method427(arg0 - 22513);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 67)
    public static void method2082(int arg0) {
        if (arg0 != 6) {
            method2083(-28, -75);
        }
        field5155 = null;
        field5148 = null;
        field5149 = null;
        field5152 = null;
        field5150 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V", line = 91)
    public static final void method2083(int arg0, int arg1) {
        class274.field4558 = 1000 / arg0;
        int var2 = -108 % ((-arg1 - 36) / 55);
        field5156++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZJ)V", line = 101)
    public static final void method2084(boolean arg0, long arg1) {
        field5154++;
        if (arg1 == 0L) {
            return;
        }
        class185.field3194++;
        class187.field3229.method338(52, (byte) 8);
        if (arg0) {
            method2082(-2);
        }
        class187.field3229.method745(arg1, (byte) -124);
    }
}
