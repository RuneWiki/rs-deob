import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class235 extends class292 {

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3644 = "Loaded sprites";

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "Luf;")
    public static class176 field3650;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Lll;")
    private class211 field3651;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static final void method1574(byte arg0) {
        field3643++;
        int var1 = 59 / ((arg0 - 23) / 54);
        if (class209.field3246) {
            return;
        }
        if (class195.field3070) {
            class161.field2460 = (float) ((int) class161.field2460 - 17 & 0xFFFFFFF0);
        } else {
            class26.field400 += (-class26.field400 - 12.0F) / 2.0F;
        }
        class216.field3333 = true;
        class209.field3246 = true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1575(String arg0, byte arg1) {
        field3649++;
        if (class293.field4615 == null || arg0.length() == 0) {
            return -1;
        } else if (arg1 <= 104) {
            return 98;
        } else {
            for (int var2 = 0; var2 < class293.field4615.field4535; var2++) {
                if (class263.method1792(class290.method1953(0, class293.field4615.field4538[var2], " ", "<br>"), (byte) -109, arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
    public final String method1576(String arg0, byte arg1, int arg2) {
        int var4 = 103 / ((arg1 - 30) / 62);
        field3647++;
        if (this.field3651 == null) {
            return arg0;
        } else {
            class145 var5 = (class145) this.field3651.method1414(true, (long) arg2);
            return var5 == null ? arg0 : var5.field2257;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lf;II)V")
    private final void method1577(class37 arg0, int arg1, int arg2) {
        field3642++;
        if (arg1 == 249) {
            int var4 = arg0.method333((byte) -59);
            if (this.field3651 == null) {
                int var5 = class208.method1388((byte) 103, var4);
                this.field3651 = new class211(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method333((byte) -59) == 1;
                int var8 = arg0.method336(23362);
                class86 var9;
                if (var7) {
                    var9 = new class145(arg0.method331(16312));
                } else {
                    var9 = new class229(arg0.method307(-45));
                }
                this.field3651.method1409((long) var8, arg2 + 1, var9);
            }
        }
        if (arg2 != 0) {
            this.field3651 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    public final int method1578(int arg0, int arg1, int arg2) {
        field3648++;
        if (this.field3651 == null) {
            return arg1;
        }
        if (arg0 != -16) {
            method1582((byte) 41);
        }
        class229 var4 = (class229) this.field3651.method1414(true, (long) arg2);
        return var4 == null ? arg1 : var4.field3580;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lf;B)V")
    public final void method1579(class37 arg0, byte arg1) {
        if (arg1 != 48) {
            return;
        }
        while (true) {
            int var3 = arg0.method333((byte) -59);
            if (var3 == 0) {
                field3641++;
                return;
            }
            this.method1577(arg0, var3, 0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 > -67) {
            return;
        }
        field3646++;
        if (class75.field1265 <= (arg5 - arg0) && arg0 + arg5 <= class261.field4025 && (arg3 - arg0) >= class271.field4289 && (arg0 + arg3) <= class113.field1779) {
            class134.method934(-47, arg4, arg5, arg3, arg1, arg6, arg0);
        } else {
            class9.method104(arg3, arg5, arg6, -1, arg0, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Luf;IBI)[La;")
    public static final class49[] method1581(class176 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 67) {
            field3644 = null;
        }
        field3645++;
        return class261.method1750(arg0, arg1, arg3, (byte) 62) ? class266.method1812((byte) 105) : null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public static void method1582(byte arg0) {
        if (arg0 != -55) {
            field3650 = null;
        }
        field3650 = null;
        field3644 = null;
    }
}
