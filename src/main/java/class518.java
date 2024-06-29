import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class518 {

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public int field7674 = 443;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
    private boolean field7673 = false;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public int field7675 = 43594;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Z")
    private boolean field7679 = true;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7681 = new String[] { method3889(method3888("6=IA/")), method3889(method3888("#cI,z")), method3889(method3888("6=I@/")), method3889(method3888("68\u000bn")), method3889(method3888("6=IF/")), method3889(method3888("6=IC/")) };

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field7672 = 503;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public int field7676;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "Ljava/lang/String;")
    public String field7671;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V", line = 7)
    public final void method3884(boolean arg0) {
        try {
            if (!arg0) {
                method3885(10, null);
            }
            field7680++;
            if (!this.field7679) {
                this.field7679 = true;
                this.field7673 = true;
            } else if (this.field7673) {
                this.field7673 = false;
            } else {
                this.field7679 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7681[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILha;)V", line = 35)
    public static final void method3885(int arg0, class63 arg1) {
        try {
            field7678++;
            if (class478.field7266 != class438.field6846.field9975) {
                if (arg0 != 21954) {
                    field7672 = -15;
                }
                if (class85.field1280 != null && class507.method3816(arg1, arg0 ^ 0x55C6, class438.field6846.field9975)) {
                    class478.field7266 = class438.field6846.field9975;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7681[2] + arg0 + ',' + (arg1 == null ? field7681[3] : field7681[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lnp;B)Z", line = 68)
    public final boolean method3886(class518 arg0, byte arg1) {
        try {
            field7670++;
            if (arg1 >= -79) {
                this.field7676 = 31;
            }
            if (arg0 == null) {
                return false;
            } else {
                return this.field7676 == arg0.field7676 && this.field7671.equals(arg0.field7671);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7681[4] + (arg0 == null ? field7681[3] : field7681[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ltga;I)Luga;", line = 84)
    public final class218 method3887(class61 arg0, int arg1) {
        try {
            if (arg1 != 32380) {
                this.method3887(null, 22);
            }
            field7677++;
            return arg0.method639(this.field7671, this.field7673, this.field7679 ? this.field7674 : this.field7675, arg1 ^ 0x7E7C);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7681[5] + (arg0 == null ? field7681[3] : field7681[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!np", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3888(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!np", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3889(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
