import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class417 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field5805 = 0;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Lmha;")
    public static class701 field5803 = new class701(1, 2, 2, 0);

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 10)
    public static void method2535(int arg0) {
        if (arg0 != 2) {
            method2536(-59, null);
        }
        field5803 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjm;)V", line = 25)
    public static final void method2536(int arg0, class6 arg1) {
        field5804++;
        int var2 = -43 / ((-arg0 - 88) / 34);
        if (class484.field6549) {
            return;
        }
        arg1.method3065(-17363);
        class605.field8642--;
        if (!arg1.field56) {
            long var3 = arg1.field48;
            class480 var5;
            for (var5 = (class480) class675.field9509.method1381(true, var3); var5 != null && !var5.field6518.equals(arg1.field50); var5 = (class480) class675.field9509.method1391(-1)) {
            }
            if (var5 != null && var5.method2835((byte) -81, arg1)) {
                class29.method211(var5, true);
                return;
            }
            return;
        }
        for (class480 var6 = (class480) class314.field4033.method667(true); var6 != null; var6 = (class480) class314.field4033.method662((byte) 34)) {
            if (var6.field6518.equals(arg1.field50)) {
                boolean var7 = false;
                for (class6 var8 = (class6) var6.field6519.method667(true); var8 != null; var8 = (class6) var6.field6519.method662((byte) -89)) {
                    if (arg1 == var8) {
                        var7 = true;
                        if (var6.method2835((byte) -92, arg1)) {
                            class29.method211(var6, true);
                        }
                        break;
                    }
                }
                if (var7) {
                    return;
                }
            }
        }
    }
}
