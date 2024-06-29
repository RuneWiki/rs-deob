import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class76 {

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Ljd;")
    public static class92 field1589 = class202.method1325((byte) 90, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljd;")
    public static class92 field1586 = class202.method1325((byte) 90, "::qa_op_test");

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field1588 = 0;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljd;")
    private static class92 field1585 = class202.method1325((byte) 90, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ljd;")
    public static class92 field1580 = field1585;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lnh;")
    public static class133 field1587;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lh;")
    public static class70 field1590;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Z")
    public static boolean field1583;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljd;B)Z")
    public static final boolean method522(class92 arg0, byte arg1) {
        field1591++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 117 % ((arg1 + 29) / 38);
        for (int var3 = 0; var3 < class166.field3273; var3++) {
            if (arg0.method646(114, class27.field603[var3])) {
                return true;
            }
        }
        return arg0.method646(102, class15.field423.field1805);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLac;)V")
    public static final void method523(boolean arg0, class4 arg1) {
        arg1.field213 = arg0;
        field1584++;
        if (arg1.field216 != -1) {
            class22 var2 = class153.method978(arg1.field216, -122);
            if (var2 == null || var2.field530 == null) {
                arg1.field216 = -1;
            } else {
                arg1.field229++;
                if (var2.field530.length > arg1.field221 && var2.field515[arg1.field221] < arg1.field229) {
                    arg1.field221++;
                    arg1.field229 = 1;
                    class212.method1376(var2, arg1.field221, class15.field423 == arg1, arg1.field208, 7330, arg1.field246);
                }
                if (var2.field530.length <= arg1.field221) {
                    arg1.field229 = 0;
                    arg1.field221 = 0;
                    class212.method1376(var2, arg1.field221, class15.field423 == arg1, arg1.field208, 7330, arg1.field246);
                }
            }
        }
        if (arg1.field238 != -1 && class158.field3150 >= arg1.field203) {
            if (arg1.field240 < 0) {
                arg1.field240 = 0;
            }
            int var3 = class102.method702((byte) -98, arg1.field238).field1295;
            if (var3 == -1) {
                arg1.field238 = -1;
            } else {
                class22 var4 = class153.method978(var3, -102);
                if (var4 == null || var4.field530 == null) {
                    arg1.field238 = -1;
                } else {
                    arg1.field191++;
                    if (var4.field530.length > arg1.field240 && arg1.field191 > var4.field515[arg1.field240]) {
                        arg1.field191 = 1;
                        arg1.field240++;
                        class212.method1376(var4, arg1.field240, class15.field423 == arg1, arg1.field208, 7330, arg1.field246);
                    }
                    if (arg1.field240 >= var4.field530.length) {
                        arg1.field238 = -1;
                    }
                }
            }
        }
        if (arg1.field215 != -1 && arg1.field254 <= 1) {
            class22 var5 = class153.method978(arg1.field215, -116);
            if (var5.field520 == 1 && arg1.field250 > 0 && class158.field3150 >= arg1.field249 && arg1.field232 < class158.field3150) {
                arg1.field254 = 1;
                return;
            }
        }
        if (arg1.field215 != -1 && arg1.field254 == 0) {
            class22 var6 = class153.method978(arg1.field215, -103);
            if (var6 == null || var6.field530 == null) {
                arg1.field215 = -1;
            } else {
                arg1.field251++;
                if (arg1.field260 < var6.field530.length && var6.field515[arg1.field260] < arg1.field251) {
                    arg1.field251 = 1;
                    arg1.field260++;
                    class212.method1376(var6, arg1.field260, class15.field423 == arg1, arg1.field208, 7330, arg1.field246);
                }
                if (var6.field530.length <= arg1.field260) {
                    arg1.field219++;
                    arg1.field260 -= var6.field529;
                    if (var6.field525 <= arg1.field219) {
                        arg1.field215 = -1;
                    } else if (arg1.field260 >= 0 && arg1.field260 < var6.field530.length) {
                        class212.method1376(var6, arg1.field260, class15.field423 == arg1, arg1.field208, 7330, arg1.field246);
                    } else {
                        arg1.field215 = -1;
                    }
                }
                arg1.field213 = var6.field527;
            }
        }
        if (arg1.field254 > 0) {
            arg1.field254--;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZ)I")
    public static final int method524(int arg0, int arg1, boolean arg2) {
        field1581++;
        if (arg2) {
            return 23;
        } else {
            int var3 = class133.method878(arg0 - 1, 133698503, arg1 - 1) + class133.method878(arg0 - 1, 133698503, arg1 + 1) + class133.method878(arg0 + 1, 133698503, arg1 + -1) + class133.method878(arg0 + 1, 133698503, arg1 - -1);
            int var4 = class133.method878(arg0, 133698503, arg1 - 1) + class133.method878(arg0, 133698503, arg1 + 1) + class133.method878(arg0 - 1, 133698503, arg1) + class133.method878(arg0 - -1, 133698503, arg1);
            int var5 = class133.method878(arg0, 133698503, arg1);
            return var5 / 4 + var3 / 16 + var4 / 8;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method525(int arg0) {
        if (arg0 != -22763) {
            return;
        }
        field1587 = null;
        field1590 = null;
        field1585 = null;
        field1589 = null;
        field1586 = null;
        field1580 = null;
    }
}
