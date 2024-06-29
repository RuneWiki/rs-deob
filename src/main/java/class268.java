import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class268 {

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public int field3504;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Lcaa;")
    public class538 field3496;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "B")
    public byte field3495;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public int field3497;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3501 = new String[100];

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "[I")
    public static int[] field3509 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "Ldc;")
    public static class302 field3506 = new class302();

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "F")
    public static float field3513;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "Lpda;")
    public class137 field3510;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "Lwm;")
    public class396 field3502;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "Lfb;")
    public class482 field3505;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "Llca;")
    public class93 field3508;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1601(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class355.method2197(var3.field668);
        class355.method2197(var3.field670);
        if (var3.field668 != null) {
            var3.field668 = null;
        }
        if (var3.field670 != null) {
            var3.field670 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)Z", line = 27)
    public final boolean method1602(int arg0) {
        field3512++;
        if (arg0 != 128) {
            method1603((byte) 91);
        }
        return this.field3495 == 2 || this.field3495 == 3;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V", line = 38)
    public static void method1603(byte arg0) {
        field3501 = null;
        if (arg0 != -17) {
            field3506 = null;
        }
        field3509 = null;
        field3506 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)V", line = 68)
    public static final void method1604(byte arg0, String arg1) {
        int var2 = -2 / ((arg0 - 4) / 42);
        class46.method275("", 0, arg1, "", 255, "", 0);
        field3498++;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(BIIIIIILcaa;)V", line = 82)
    public class268(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class538 arg7) {
        this.field3504 = arg4;
        this.field3496 = arg7;
        this.field3500 = arg6;
        this.field3511 = arg3;
        this.field3499 = arg1;
        this.field3503 = arg2;
        this.field3495 = arg0;
        this.field3497 = arg5;
    }
}
