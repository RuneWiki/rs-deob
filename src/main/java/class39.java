import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class39 extends class325 {

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public int field581 = 0;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "Lrj;")
    public static class269 field574;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "Lth;")
    public static class270 field575;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "Ljd;")
    public static class95 field580;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;", line = 12)
    public static final String method296(int arg0, int arg1, int arg2, String[] arg3) {
        field584++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var11 = arg3[arg0];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = 0;
            int var5 = arg0 + arg1;
            for (int var6 = arg0; var6 < var5; var6++) {
                String var7 = arg3[var6];
                if (var7 == null) {
                    var4 += 4;
                } else {
                    var4 += var7.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var4);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            if (arg2 >= -44) {
                field575 = (class270) null;
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 74)
    public static void method297(int arg0) {
        if (arg0 != -14665) {
            method302(114, -108, 18, -64, -101);
        }
        field575 = null;
        field574 = null;
        field580 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBIII)V", line = 86)
    public static final void method298(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field576++;
        if (arg1 <= 5) {
            return;
        }
        class188 var5 = class147.method1111(-50, arg3, 8);
        var5.method1392((byte) -48);
        var5.field2959 = arg2;
        var5.field2954 = arg4;
        var5.field2955 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lwm;BI)V", line = 103)
    private final void method299(class254 arg0, byte arg1, int arg2) {
        if (arg2 == 2) {
            this.field581 = arg0.method1755(false);
        }
        if (arg1 >= 18) {
            field579++;
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V", line = 120)
    public static final void method300(int arg0) {
        class59 var1 = (class59) class163.field2636.method1954(-66);
        int var2 = 32 / ((-arg0 - 14) / 36);
        while (var1 != null) {
            class141 var3 = var1.field784;
            if (class265.field4112 != var3.field2166 || var3.field2167) {
                var1.method39(10717);
            } else if (class233.field3542 >= var3.field2161) {
                var3.method1083(class228.field3488, (byte) 120);
                if (var3.field2167) {
                    var1.method39(10717);
                } else {
                    class114.method874(var3.field2166, var3.field2178, var3.field2171, var3.field2162, 60, var3, 0, -1L, false);
                }
            }
            var1 = (class59) class163.field2636.method1950((byte) 109);
        }
        field577++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)I", line = 154)
    public static final int method301(int arg0, byte arg1) {
        field582++;
        if (arg1 >= -96) {
            field575 = (class270) null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IIIII)V", line = 166)
    public static final void method302(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -4) {
            method301(-2, (byte) 23);
        }
        field583++;
        if (class311.field4833 == 0 || arg2 == 0 || class159.field2414 >= 50 || arg0 == -1) {
            return;
        }
        class296.field4566[class159.field2414] = arg0;
        class338.field5249[class159.field2414] = arg2;
        class8.field117[class159.field2414] = arg3;
        class251.field3798[class159.field2414] = null;
        class139.field2092[class159.field2414] = 0;
        class112.field1698[class159.field2414] = arg1;
        class159.field2414++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILwm;)V", line = 193)
    public final void method303(int arg0, class254 arg1) {
        field578++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method1774((byte) 121);
            if (var3 == 0) {
                return;
            }
            this.method299(arg1, (byte) 89, var3);
        }
    }
}
