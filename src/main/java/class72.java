import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class72 {

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Lwt;")
    public static class194 field1054 = new class194("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field1058 = -1;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1053;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method487(int arg0) {
        int var1 = 87 / ((-arg0 - 42) / 63);
        field1053 = null;
        field1054 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(FIFIF)F")
    public static final float method488(float arg0, int arg1, float arg2, int arg3, float arg4) {
        field1057++;
        float[] var5 = class341.field4963[arg1];
        if (arg3 != 2) {
            field1053 = null;
        }
        return var5[2] * arg2 + var5[0] * arg0 + var5[1] * arg4;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)I")
    public static final int method489(boolean arg0, int arg1) {
        if (class22.field294 != null) {
            class22.field294.method2123(111);
            class22.field294 = null;
        }
        field1055++;
        class325.field4746++;
        if (!arg0) {
            field1053 = null;
        }
        if (class325.field4746 > 4) {
            class325.field4746 = 0;
            class286.field4090 = 0;
            return arg1;
        }
        class286.field4090 = 0;
        if (class308.field4492 == class195.field2767) {
            class195.field2767 = class35.field559;
        } else {
            class195.field2767 = class308.field4492;
        }
        return -1;
    }
}
