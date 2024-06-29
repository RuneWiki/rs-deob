import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class294 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lmg;")
    public static class151 field3871 = new class151();

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1765(int arg0) {
        class719.field10012++;
        field3872++;
        class589 var1 = class514.method2994(arg0 - 56442, class760.field10605, class440.field5863);
        var1.field8251.method2578(class120.method926(15492), arg0 ^ 0xB731E8BA);
        var1.field8251.method2620(class356.field4586, false);
        var1.field8251.method2620(class466.field6263, false);
        var1.field8251.method2578(class748.field10451.field10409.method3020((byte) -52), -1221492240);
        if (arg0 != 26954) {
            method1767(105, null, null, null);
        }
        class737.method4107(var1, 7);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 22)
    public static void method1766(byte arg0) {
        if (arg0 <= 33) {
            method1765(-61);
        }
        field3871 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 32)
    public static final String method1767(int arg0, String arg1, String arg2, String arg3) {
        if (arg0 != 0) {
            field3871 = null;
        }
        field3873++;
        for (int var4 = arg2.indexOf(arg3); var4 != -1; var4 = arg2.indexOf(arg3, arg1.length() + var4)) {
            arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(arg3.length() + var4);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Lwf;", line = 57)
    public static final class138 method1768(int arg0) {
        field3874++;
        if (arg0 > -106) {
            method1767(-95, null, null, null);
        }
        return class662.field9326 < class411.field5232.length ? class411.field5232[class662.field9326++] : null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBIFIFFFI[FI)V")
    public abstract void method1769(int arg0, byte arg1, int arg2, float arg3, int arg4, float arg5, float arg6, float arg7, int arg8, float[] arg9, int arg10);
}
