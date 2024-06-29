import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class278 {

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4410 = "slide:";

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4407;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1868(String arg0, byte arg1) {
        field4415++;
        int var2 = class45.method390(arg0, arg1 + 30215);
        if (var2 == -1) {
            return "";
        } else {
            if (arg1 != 105) {
                field4407 = null;
            }
            return class189.method1303("<br>", " ", (byte) -120, class143.field2358.field4057[var2]);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method1869(int arg0) {
        field4407 = null;
        field4410 = null;
        if (arg0 != 27598) {
            field4409 = 126;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLmk;)V")
    public static final void method1870(byte arg0, class213 arg1) {
        if (arg0 != 14) {
            return;
        }
        field4406++;
        class132 var2 = (class132) class269.field4315.method1063((byte) -69, class260.method1739(false, arg1.field3445));
        if (var2 == null) {
            class255.method1707((class248) null, (class139) null, arg1, (byte) 79, class92.field1448, arg1.field2844[0], arg1.field2813[0], 0);
        } else {
            var2.method950(true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZZBZI)Lsb;")
    public static final class124 method1871(boolean arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        if (arg2 <= 28) {
            field4411 = -113;
        }
        field4412++;
        class239 var5 = null;
        if (class207.field3334 != null) {
            var5 = new class239(arg4, class207.field3334, class85.field1397[arg4], 1000000);
        }
        class267.field4276[arg4] = class114.field1834.method1543(-116, class283.field4487, arg4, var5);
        if (arg3) {
            class267.field4276[arg4].method406((byte) -99);
        }
        return new class124(class267.field4276[arg4], arg1, arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method1872(byte arg0) {
        field4414++;
        for (int var1 = 0; var1 < 5; var1++) {
            class269.field4319[var1] = false;
        }
        class184.field3033 = 1;
        class22.field334 = -1;
        int var2 = 78 / ((-arg0 - 60) / 38);
        class239.field3776 = -1;
        class260.field4131 = 0;
        class108.field1651 = 0;
    }
}
