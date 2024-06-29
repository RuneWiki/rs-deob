import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class399 extends RuntimeException {

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Ljava/lang/String;")
    public String field5253;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5254;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "Lkp;")
    public static class413 field5251 = new class413();

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 4)
    public static void method2288(int arg0) {
        field5251 = null;
        int var1 = 19 % ((-arg0 - 82) / 36);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)I", line = 15)
    public static final int method2289(int arg0, int arg1, int arg2) {
        field5250++;
        if (arg0 == 4 || arg0 == 5) {
            return class298.field3835[arg1 & 0x3];
        } else {
            int var3 = -114 / ((arg2 + 64) / 49);
            return 256;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIB)V", line = 28)
    public static final void method2290(int arg0, int arg1, byte arg2) {
        field5252++;
        class557 var3 = class93.method564(14, -14073, arg0);
        var3.method3257(arg2 + 2018);
        var3.field8207 = arg1;
        if (arg2 != -70) {
            field5251 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 51)
    public class399(Throwable arg0, String arg1) {
        this.field5253 = arg1;
        this.field5254 = arg0;
    }
}
