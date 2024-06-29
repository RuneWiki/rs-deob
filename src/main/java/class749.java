import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class749 {

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lui;")
    private class251 field10672 = new class251(256);

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lml;")
    private class194 field10671;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Ld;")
    private class673 field10673;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10674 = new String[] { method5425(method5424("p\u001a_O[y\u0018\u0005M\u001a")), method5425(method5424("y\u0004\u001d\u001f")), method5425(method5424("l__]O")), method5425(method5424("p\u001a_0\u001a")), method5425(method5424("p\u001a_1\u001a")), method5425(method5424("p\u001a_2\u001a")) };

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field10668;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field10669;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field10670;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public final void method5421(int arg0) {
        try {
            this.field10672.method2038(0, 5);
            if (arg0 != 6408) {
                this.field10673 = null;
            }
            field10670++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10674[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public final void method5422(byte arg0) {
        try {
            field10668++;
            this.field10672.method2043(false);
            if (arg0 > -96) {
                this.method5422((byte) 2);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10674[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lbp;")
    public final class117 method5423(int arg0, int arg1) {
        try {
            field10669++;
            if (arg1 >= -6) {
                return null;
            }
            Object var3 = this.field10672.method2053(0, (long) arg0);
            if (var3 != null) {
                return (class117) var3;
            } else if (this.field10673.method4504(arg0, -31410)) {
                class684 var4 = this.field10673.method4500(-23641, arg0);
                int var5 = var4.field9599 ? 64 : this.field10671.field2747;
                class117 var7;
                if (var4.field9585 && this.field10671.method217()) {
                    float[] var8 = this.field10673.method4501(false, var5, arg0, var5, true, 0.7F);
                    var7 = new class117(this.field10671, 3553, 34842, var5, var5, var4.field9597 != 0, var8, 6408);
                } else {
                    int[] var6;
                    if (var4.field9584 != 2 && class619.method4555(var4.field9605, -71)) {
                        var6 = this.field10673.method4502(0.7F, var5, -83, var5, arg0, true);
                    } else {
                        var6 = this.field10673.method4499(var5, var5, -7994, false, 0.7F, arg0);
                    }
                    var7 = new class117(this.field10671, 3553, 6408, var5, var5, var4.field9597 != 0, var6, 0, 0, false);
                }
                var7.method1065(var4.field9601, (byte) 116, var4.field9590);
                this.field10672.method2051((long) arg0, var7, 93);
                return var7;
            } else {
                return null;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10674[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lml;Ld;)V")
    public class749(class194 arg0, class673 arg1) {
        try {
            this.field10671 = arg0;
            this.field10673 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10674[0] + (arg0 == null ? field10674[1] : field10674[2]) + ',' + (arg1 == null ? field10674[1] : field10674[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5424(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5425(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
