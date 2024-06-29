import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class240 {

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "J")
    private long field3634;

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "I")
    private int field3630;

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3638 = new String[] { method2059(method2058("E,4\u0001%\f")), method2059(method2058("E,4\u0001XM+<[Z\f")), method2059(method2058("J09C")), method2059(method2058("_k{\u0001\u0019")), method2059(method2058("E,4\u0001 \f")), method2059(method2058("E,4\u0001'\f")), method2059(method2058("E,4\u0001&\f")), method2059(method2058("E,4\u0001!\f")) };

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BI)I", line = 6)
    private final int method2053(byte arg0, int arg1) {
        try {
            int var3 = 7 / ((28 - arg0) / 35);
            field3637++;
            return (int) (this.field3634 >> class778.field11307 * arg1) & 0xF;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3638[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)I", line = 19)
    public final int method2054(int arg0) {
        try {
            field3633++;
            if (arg0 != 15) {
                field3631 = -88;
            }
            return this.field3630;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3638[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lwga;)V", line = 33)
    public class240(class778 arg0) {
        try {
            this.field3634 = arg0.field11293;
            this.field3630 = 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3638[1] + (arg0 == null ? field3638[2] : field3638[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lwga;I)V", line = 43)
    private final void method2055(class778 arg0, int arg1) {
        try {
            field3632++;
            this.field3634 |= (arg0.field11293 << class778.field11307 * this.field3630++);
            if (arg1 != -14402) {
                method2056(-97, 0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3638[4] + (arg0 == null ? field3638[2] : field3638[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)I", line = 55)
    public static final int method2056(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                method2056(-24, -87);
            }
            field3629++;
            return arg1 & 0xFF;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3638[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "([Lwga;)V", line = 66)
    public class240(class778[] arg0) {
        try {
            for (int var2 = 0; var2 < arg0.length; var2++) {
                this.method2055(arg0[var2], -14402);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3638[1] + (arg0 == null ? field3638[2] : field3638[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)Lwga;", line = 80)
    public final class778 method2057(int arg0, int arg1) {
        try {
            if (arg1 != 255) {
                field3631 = -37;
            }
            field3635++;
            return class778.method5626(this.method2053((byte) 97, arg0), (byte) -37);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3638[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2058(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2059(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
