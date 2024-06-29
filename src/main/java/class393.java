import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class393 {

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field5904 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "J")
    public long field5903;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lqj;")
    public static class238 field5900;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lo;")
    public class393 field5895;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lo;")
    public class393 field5898;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 5)
    public static void method2569(byte arg0) {
        field5900 = null;
        if (arg0 != 55) {
            field5904 = -101;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I", line = 16)
    public static final int method2570(int arg0) {
        field5905++;
        if (arg0 == -32251) {
            class24 var1 = class104.field1396;
            synchronized (class104.field1396) {
                return class104.field1396.method207(-127);
            }
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z", line = 32)
    public final boolean method2571(boolean arg0) {
        field5897++;
        if (this.field5898 == null) {
            return false;
        } else {
            if (!arg0) {
                this.field5898 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILqj;)I", line = 54)
    public static final int method2572(int arg0, class238 arg1) {
        field5906++;
        int var2 = arg0;
        if (arg1.method1451(-120, class282.field4137)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1451(-116, class177.field2326)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 71)
    public static final void method2573(int arg0, int arg1, int arg2, int arg3) {
        field5902++;
        if (class343.field5032 == null) {
            return;
        }
        long var4 = (long) (arg0 << 14 | arg2 << 28 | arg3);
        class281 var6 = (class281) class231.field3261.method954(-95, var4);
        if (var6 == null) {
            class123.method846(arg2, arg3, arg0);
            return;
        }
        class6 var7 = (class6) var6.field4135.method2649(0);
        if (var7 == null) {
            class123.method846(arg2, arg3, arg0);
            return;
        }
        int var8 = -60 % ((-arg1 - 20) / 38);
        class114 var9 = (class114) class123.method846(arg2, arg3, arg0);
        if (var9 == null) {
            var9 = new class114();
        } else {
            var9.field1548 = var9.field1558 = -1;
        }
        var9.field1557 = var7.field57;
        var9.field1550 = var7.field52;
        label44: while (true) {
            class6 var10 = (class6) var6.field4135.method2656(0);
            if (var10 == null) {
                break;
            }
            if (var9.field1557 != var10.field57) {
                var9.field1554 = var10.field52;
                var9.field1548 = var10.field57;
                while (true) {
                    class6 var11 = (class6) var6.field4135.method2656(0);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var9.field1557 != var11.field57 && var9.field1548 != var11.field57) {
                        var9.field1549 = var11.field52;
                        var9.field1558 = var11.field57;
                    }
                }
            }
        }
        int var12 = class139.method935((arg0 << 7) + 64, 114, (arg3 << 7) + 64, arg2);
        class259.method1627(arg2, arg3, arg0, var12, var9);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 151)
    public final void method2574(byte arg0) {
        field5896++;
        if (this.field5898 == null) {
            return;
        }
        this.field5898.field5895 = this.field5895;
        this.field5895.field5898 = this.field5898;
        if (arg0 < 113) {
            method2575(58, 20);
        }
        this.field5898 = null;
        this.field5895 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lpb;", line = 179)
    public static final class205 method2575(int arg0, int arg1) {
        field5901++;
        class205 var2 = (class205) class77.field1055.method209(arg1 + 118, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field1559.method1472(arg0, 33, arg1);
        class205 var4 = new class205();
        if (var3 != null) {
            var4.method1294(arg0, true, new class265(var3));
        }
        class77.field1055.method202(true, var4, (long) arg0);
        return var4;
    }
}
