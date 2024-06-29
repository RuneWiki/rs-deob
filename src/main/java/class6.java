import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 implements class515 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lpd;")
    public class241 field53;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Z")
    public boolean field52;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Ltl;")
    public class580 field58;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Ldr;")
    public static class675 field59 = new class675(107, 6);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Z")
    public static boolean field61 = true;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field63 = 1407;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "[I")
    public static int[] field64 = new int[1000];

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lcga;")
    public static class449 field62 = new class449(79, -1);

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field65 = new String[100];

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Ljd;", line = 11)
    public final class216 method20(byte arg0) {
        field56++;
        int var2 = 116 % ((arg0 + 27) / 42);
        return class435.field5476;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 30)
    public static void method21(byte arg0) {
        field62 = null;
        field64 = null;
        if (arg0 <= 103) {
            field65 = null;
        }
        field65 = null;
        field59 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(ILtl;Lpd;IIIIIIIZ)V", line = 43)
    public class6(int arg0, class580 arg1, class241 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field48 = arg3;
        this.field57 = arg6;
        this.field60 = arg4;
        this.field53 = arg2;
        this.field55 = arg9;
        this.field49 = arg7;
        this.field54 = arg0;
        this.field50 = arg8;
        this.field52 = arg10;
        this.field51 = arg5;
        this.field58 = arg1;
    }
}
