import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class372 extends class8 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lsl;")
    public static class317 field5010 = new class317("", 12);

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lff;")
    public static class9 field5011 = new class9(27, 6);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "F")
    public static float field5008;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method2152(int arg0, byte arg1, int arg2) {
        if (arg1 != -105) {
            field5008 = -0.14965983F;
        }
        field5009++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class1 var3 = class402.field5388.method1994(-17294, arg2);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method12(0, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 23)
    public static void method2153(int arg0) {
        int var1 = -110 / ((57 - arg0) / 42);
        field5011 = null;
        field5010 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)Lef;")
    public abstract class336 method1904(byte arg0);
}
