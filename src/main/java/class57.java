import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class57 extends class209 {

    @OriginalMember(owner = "client!i", name = "G", descriptor = "Lhc;")
    public class244 field898;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "Z")
    public static boolean field897 = false;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Ljava/lang/String;")
    public static String field895 = "Please remove ";

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Ljava/lang/String;")
    public static String field899 = "glow1:";

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method473(int arg0, byte arg1, String arg2) {
        class240.field3826.method1762(74, true);
        field894++;
        class240.field3826.method286(class170.method1223(true, arg2), false);
        class240.field3826.method283(arg0, arg1 + 24941);
        class55.field868++;
        if (arg1 != -105) {
            field899 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method474(int arg0, int arg1) {
        class22 var2 = class149.field2210[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class22 var4 = class149.field2210[var3][arg0][arg1] = class149.field2210[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field362--;
                for (int var5 = 0; var5 < var4.field371; var5++) {
                    class19 var6 = var4.field355[var5];
                    if ((var6.field267 >> 29 & 0x3L) == 2L && var6.field255 == arg0 && var6.field258 == arg1) {
                        var6.field254--;
                    }
                }
            }
        }
        if (class149.field2210[0][arg0][arg1] == null) {
            class149.field2210[0][arg0][arg1] = new class22(0, arg0, arg1);
        }
        class149.field2210[0][arg0][arg1].field379 = var2;
        class149.field2210[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lhc;)V")
    public class57(class244 arg0) {
        this.field898 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZIIIILai;)V")
    public static final void method475(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class89 arg6) {
        field896++;
        long var7 = 0L;
        boolean var9 = false;
        if (arg2 == 0) {
            var7 = class254.method1722(arg5, arg0, arg3);
        } else if (arg2 == 1) {
            var7 = class47.method400(arg5, arg0, arg3);
        } else if (arg2 == 2) {
            var7 = class104.method793(arg5, arg0, arg3);
        } else if (arg2 == 3) {
            var7 = class183.method1310(arg5, arg0, arg3);
        }
        int var10 = ((int) var7 & 0x393892) >> 20;
        if (arg1) {
            field895 = null;
        }
        boolean var11 = false;
        boolean var12 = true;
        int var13 = (int) var7 >> 14 & 0x1F;
        int var14 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class295 var15 = class166.method1209(113, var14);
        if (var15.method1958(!arg1)) {
            class216.method1491(var15, arg0, arg3, arg5, (byte) -113);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg2 == 0) {
            class95.method749(arg5, arg0, arg3);
            if (var15.field4621 != 0) {
                arg6.method677(!var15.field4655, arg0, var13, var15.field4611, 671744, arg3, var10);
            }
        } else if (arg2 == 1) {
            class288.method1925(arg5, arg0, arg3);
        } else if (arg2 == 2) {
            class194.method1388(arg5, arg0, arg3);
            if (var15.field4621 != 0 && var15.field4620 + arg0 < 104 && (var15.field4620 + arg3) < 104 && (var15.field4592 + arg0) < 104 && var15.field4592 + arg3 < 104) {
                arg6.method681(!var15.field4655, var15.field4611, var10, var15.field4592, arg0, var15.field4620, arg3, 7662);
            }
        } else if (arg2 == 3) {
            class82.method642(arg5, arg0, arg3);
            if (var15.field4621 == 1) {
                arg6.method685(arg3, !arg1, arg0);
            }
        }
        if (var15.field4598 != null) {
            class295 var20 = var15.method1956(25748);
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public static void method476(int arg0) {
        field895 = null;
        if (arg0 != 0) {
            field895 = null;
        }
        field899 = null;
    }
}
