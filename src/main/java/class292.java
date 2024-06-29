import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class292 extends class87 {

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    private int field4586;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    private int field4594;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field4589 = 0;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field4590 = 3353893;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lwl;")
    public static class172 field4588;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public final void method548(int arg0, int arg1, int arg2) {
        ++field4587;
        if (arg0 >= -62) {
            this.field4594 = -64;
        }
        int var4 = this.field4586 * arg1 >> 12;
        int var5 = this.field4584 * arg2 >> 12;
        int var6 = this.field4594 * arg2 >> 12;
        int var7 = this.field4592 * arg1 >> 12;
        class47.method306(super.field1180, -4, var6, var4, var5, var7);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1954(int arg0) {
        String var1;
        if (~class141.field1963 == -2 && ~class68.field925 > -3) {
            var1 = class224.field3405 + class119.field1675 + class238.field3612 + " ->";
        } else if (class11.field113 && ~class68.field925 > -3) {
            var1 = class168.field2332 + class119.field1675 + class54.field791 + " ->";
        } else if (class273.field4202 && class138.field1928[81] && class68.field925 > 2) {
            var1 = class41.method273(0, class68.field925 - 2);
        } else {
            var1 = class41.method273(0, class68.field925 + -1);
        }
        if (arg0 > -90) {
            field4590 = 54;
        }
        ++field4585;
        if (~class68.field925 < -3) {
            var1 = var1 + "<col=ffffff> / " + (class68.field925 - 2) + class103.field1433;
        }
        return var1;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IIIIIII)V")
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4586 = arg0;
        this.field4594 = arg1;
        this.field4584 = arg3;
        this.field4592 = arg2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1955(byte arg0) {
        if (arg0 != -20) {
            method1956(-120, false, -50, 32);
        }
        field4588 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZII)I")
    public static final int method1956(int arg0, boolean arg1, int arg2, int arg3) {
        class69 var4 = (class69) class75.field1051.method23(216, (long) arg0);
        ++field4583;
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg3; var6 < var4.field941.length; ++var6) {
                if (var4.field941[var6] >= 0 && var4.field941[var6] < class127.field1805) {
                    class32 var7 = class73.method463(var4.field941[var6], -31104);
                    if (var7.field470 != null) {
                        class47 var8 = (class47) var7.field470.method23(arg3 + 216, (long) arg2);
                        if (var8 != null) {
                            if (!arg1) {
                                var5 += var8.field689;
                            } else {
                                var5 += var4.field942[var6] * var8.field689;
                            }
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZI)V")
    public final void method553(int arg0, boolean arg1, int arg2) {
        ++field4591;
        if (!arg1) {
            field4589 = 48;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
    public final void method552(int arg0, int arg1, int arg2) {
        ++field4593;
        int var4 = this.field4592 * arg0 >> 12;
        int var5 = this.field4586 * arg0 >> 12;
        int var6 = this.field4584 * arg2 >> 12;
        int var7 = this.field4594 * arg2 >> 12;
        if (arg1 > 94) {
            class281.method1883(var4, super.field1181, var6, super.field1180, super.field1186, 12686, var5, var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(III)Lgg;")
    public static final class198 method1957(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field1240; ++var4) {
                class198 var5 = var3.field1226[var4];
                if ((var5.field2753 >> 29 & 3L) == 2L && var5.field2746 == arg1 && var5.field2748 == arg2) {
                    class270.method1787(var5);
                    return var5;
                }
            }
            return null;
        }
    }
}
