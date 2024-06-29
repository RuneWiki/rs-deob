import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class482 {

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "J")
    private long field7329;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    private int field7323;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7332 = new String[] { method3681(method3680("9A\u0012b")), method3681(method3680("0@P2\r9]\n0L")), method3681(method3680(",\u001aP \u0019")), method3681(method3680("0@PKL")), method3681(method3680("0@POL")), method3681(method3680("0@PJL")), method3681(method3680("0@PML")), method3681(method3680("0@PLL")) };

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "[I")
    public static int[] field7327 = new int[1];

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field7330 = 0;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)I")
    private final int method3675(byte arg0, int arg1) {
        try {
            if (arg0 != 29) {
                this.field7329 = -37L;
            }
            field7325++;
            return (int) (this.field7329 >> class771.field11307 * arg1) & 0xF;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7332[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
    public final int method3676(int arg0) {
        try {
            if (arg0 == 15) {
                field7324++;
                return this.field7323;
            } else {
                return 114;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7332[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)Lau;")
    public final class771 method3677(int arg0, int arg1) {
        try {
            if (arg1 != -25596) {
                this.method3677(56, -108);
            }
            field7328++;
            return class771.method5566(-100, this.method3675((byte) 29, arg0));
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7332[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public static void method3678(byte arg0) {
        try {
            field7327 = null;
            if (arg0 != 115) {
                field7331 = -112;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7332[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lau;I)V")
    private final void method3679(class771 arg0, int arg1) {
        try {
            field7326++;
            if (arg1 == 0) {
                this.field7329 |= (arg0.field11296 << class771.field11307 * this.field7323++);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7332[5] + (arg0 == null ? field7332[0] : field7332[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lau;)V")
    public class482(class771 arg0) {
        try {
            this.field7329 = arg0.field11296;
            this.field7323 = 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7332[1] + (arg0 == null ? field7332[0] : field7332[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "([Lau;)V")
    public class482(class771[] arg0) {
        try {
            for (int var2 = 0; var2 < arg0.length; var2++) {
                this.method3679(arg0[var2], 0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7332[1] + (arg0 == null ? field7332[0] : field7332[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3680(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3681(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 52;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
