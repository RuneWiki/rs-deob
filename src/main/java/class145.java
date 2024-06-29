import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class145 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Led;")
    public class645 field1623 = null;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Lta;")
    public class195 field1629 = null;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field1625 = 0;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "[I")
    public static int[] field1626 = new int[5];

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field1630 = 64;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Lpr;")
    public static class407 field1632 = new class407(42, 4);

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lpr;")
    public static class407 field1631;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZII)I")
    public static final int method792(boolean arg0, int arg1, int arg2) {
        field1628++;
        if (arg2 != 5) {
            return 60;
        } else if (arg0) {
            return 0;
        } else {
            class472 var3 = class236.method1367(arg1, true, arg0);
            if (var3 == null) {
                return class369.field4791.method3321(arg1, 76).field1719;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field6581.length; var5++) {
                if (var3.field6581[var5] == -1) {
                    var4++;
                }
            }
            return var4 + class369.field4791.method3321(arg1, 77).field1719 - var3.field6581.length;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)I")
    public static final int method793(boolean arg0) {
        field1627++;
        if (class464.field6446 == null) {
            if (!class215.field2615 && field1625 > 0) {
                if (class602.field8543 && class653.field9339.method1805((byte) -74, 81) && field1625 > 2) {
                    return ((class208) class530.field7597.field7992.field3404.field3404).field2531;
                }
                return ((class208) class530.field7597.field7992.field3404).field2531;
            }
            int var1 = class407.field5419.method162(-26561);
            int var2 = class407.field5419.method161(31285);
            int var3 = client.field3414;
            int var4 = class553.field7888;
            int var5 = class350.field4586;
            if (var3 < var1 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < field1625; var7++) {
                    if (class604.field8551) {
                        int var12 = (field1625 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > var12 - 13 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (field1625 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var11 - 13 && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class542 var9 = new class542(class530.field7597);
                    for (class208 var10 = (class208) var9.method3080(31590); var10 != null; var10 = (class208) var9.method3075((byte) -105)) {
                        if (var6 == (var8++)) {
                            return var10.field2531;
                        }
                    }
                }
            }
        }
        return arg0 ? -1 : 54;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method794(int arg0) {
        if (arg0 != 0) {
            field1631 = null;
        }
        field1632 = null;
        field1626 = null;
        field1631 = null;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lta;)V")
    public class145(class195 arg0) {
        this.field1629 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lta;Led;)V")
    public class145(class195 arg0, class645 arg1) {
        this.field1629 = arg0;
        this.field1623 = arg1;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIB)Z")
    public static final boolean method795(int arg0, int arg1, byte arg2) {
        field1624++;
        if (arg2 == 123) {
            return class373.method2052(31312, arg1, arg0) || class270.method1523(arg0, arg1, -4);
        } else {
            return false;
        }
    }
}
