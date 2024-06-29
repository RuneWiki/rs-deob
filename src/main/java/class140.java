import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class140 extends class564 {

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    private int field1822;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Ljj;")
    private class334 field1825;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    private int field1828;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    private int field1823;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field1830 = new String[] { method1221(method1220("\u0002:\u0013>\u0015")), method1221(method1220("\u0002:\u00138\u0015")), method1221(method1220("\u0002:\u0013?\u0015")), method1221(method1220("\u0002:\u0013GT\b=IE\u0015")), method1221(method1220("\b!Q\u0017")), method1221(method1220("\u001dz\u0013U@")) };

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field1819 = 0;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "Lui;")
    public static class251 field1821 = new class251(8);

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "Lnm;")
    private class361 field1827;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V", line = 15)
    public static final void method1217(byte arg0) {
        try {
            field1817++;
            if (class363.field5269 != null) {
                if (class363.field5269.field4486 == 1) {
                    class363.field5269 = null;
                    return;
                }
                if (class363.field5269.field4486 == 2) {
                    class524.method3985(class584.field8432, 2, 122, class268.field3798);
                    class363.field5269 = null;
                    return;
                }
            }
            if (arg0 <= 75) {
                field1821 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1830[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V", line = 48)
    public static void method1218(byte arg0) {
        try {
            field1821 = null;
            if (arg0 != 123) {
                method1217((byte) 55);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1830[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Lnm;", line = 61)
    public final class361 method1219(byte arg0) {
        try {
            field1816++;
            if (arg0 >= -112) {
                method1218((byte) 38);
            }
            if (this.field1827 == null) {
                class30.field379[1] = this.field1818;
                class30.field379[5] = this.field1829;
                class673 var2 = this.field1825.field237;
                class30.field379[4] = this.field1823;
                class30.field379[3] = this.field1822;
                class30.field379[0] = this.field1828;
                class30.field379[2] = this.field1820;
                boolean var3 = false;
                int var4 = 0;
                for (int var5 = 0; var5 < 6; var5++) {
                    if (!var2.method4504(class30.field379[var5], -31410)) {
                        return null;
                    }
                    class684 var6 = var2.method4500(-23641, class30.field379[var5]);
                    int var7 = var6.field9599 ? 64 : 128;
                    if (var6.field9597 > 0) {
                        var3 = true;
                    }
                    if (var4 < var7) {
                        var4 = var7;
                    }
                }
                for (int var8 = 0; var8 < 6; var8++) {
                    class98.field1332[var8] = var2.method4502(1.0F, var4, -118, var4, class30.field379[var8], false);
                }
                this.field1827 = this.field1825.method2083(1, var4, class98.field1332, var3);
            }
            return this.field1827;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field1830[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljj;IIIIII)V", line = 123)
    public class140(class334 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.field1820 = arg3;
            this.field1822 = arg4;
            this.field1825 = arg0;
            this.field1818 = arg2;
            this.field1828 = arg1;
            this.field1823 = arg5;
            this.field1829 = arg6;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1830[3] + (arg0 == null ? field1830[4] : field1830[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1220(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1221(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
