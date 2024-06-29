import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class215 extends class459 {

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "Lok;")
    public class265 field3379;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "Lot;")
    public class617 field3384;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field3387 = new String[] { method1932(method1931("\u0015Bkd")), method1932(method1931("\u0000\u0019)&(")), method1932(method1931("\u0013^)J}")), method1932(method1931("\u0013^)4<\u0015^s6}")), method1932(method1931("\u0013^)I}")) };

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V", line = 3)
    public final void method1929(byte arg0) {
        try {
            field3378++;
            this.field3382 = this.field3379.field4292;
            if (arg0 >= -39) {
                this.field3379 = null;
            }
            this.field3385 = this.field3379.field4299;
            this.field3380 = this.field3379.field4290;
            if (this.field3379.field4297 != null) {
                this.field3379.field4297.method2466(this.field3384.field8905, this.field3384.field8920, this.field3384.field8919, class666.field9475);
            }
            this.field3386 = class666.field9475[2];
            this.field3381 = class666.field9475[0];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3387[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 36)
    public static final void method1930(String arg0, int arg1) {
        try {
            field3383++;
            if (class566.field8232 != null) {
                class702.field10077++;
                class164 var2 = class193.method1785(false);
                class487 var3 = class618.method4519(64, class514.field7600, var2.field2659);
                var3.field7362.method1678(class126.method1216(74, arg0), 65280);
                if (arg1 == 0) {
                    var3.field7362.method1681(arg0, 23137);
                    var2.method1546(var3, 1);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3387[2] + (arg0 == null ? field3387[0] : field3387[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lok;Ltn;)V", line = 56)
    public class215(class265 arg0, class92 arg1) {
        try {
            this.field3379 = arg0;
            this.field3384 = this.field3379.method2299(73);
            this.method1929((byte) -61);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3387[3] + (arg0 == null ? field3387[0] : field3387[1]) + ',' + (arg1 == null ? field3387[0] : field3387[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1931(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1932(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 7;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
