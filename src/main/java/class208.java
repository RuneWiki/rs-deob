import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class208 {

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3178 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Ltr;")
    public static class176 field3176;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lii;")
    public static class358 field3171;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1358(int arg0) {
        field3178 = null;
        if (arg0 != -48001) {
            method1358(90);
        }
        field3171 = null;
        field3176 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIII)V")
    public static final void method1359(boolean arg0, int arg1, int arg2, int arg3) {
        field3172++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg3 <= 108) {
            field3171 = null;
        }
        class437.field6071 = arg1;
        class410.field5752 = arg0;
        class31.field409 = arg2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)V")
    public static final void method1360(int arg0, int arg1, byte arg2) {
        field3173++;
        if (arg2 == 45) {
            class489 var3 = class116.method731(-625541408, 14, arg0);
            var3.method2863(255);
            var3.field6895 = arg1;
        }
    }
}
