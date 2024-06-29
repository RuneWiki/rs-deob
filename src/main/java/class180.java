import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class180 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
    public static boolean field3140 = true;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lsc;")
    public static class181 field3143 = class149.method967(255, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Ljb;")
    public static class11 field3142;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lsc;")
    public static class181[] field3139;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method1195(int arg0) {
        field3139 = null;
        if (arg0 < -60) {
            field3143 = null;
            field3142 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)Z")
    public static final boolean method1196(byte arg0, int arg1, int arg2) {
        class148 var3 = class62.method442((byte) 79, arg1);
        int var4 = 25 / ((19 - arg0) / 54);
        field3144++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method956(arg2, 29560);
    }
}
