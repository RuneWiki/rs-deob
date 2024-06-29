import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class182 {

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2900 = new String[] { method1718(method1717("_\u0013\nl)u\\")), method1718(method1717("_\u0013\nl/u\\")), method1718(method1717("_\u0013\nl(u\\")) };

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Lhga;")
    public class182 field2895;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "Lhga;")
    public class182 field2896;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method1713(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var6 = arg1 & arg2;
            field2897++;
            if (var6 == 0) {
                return arg3;
            } else if (var6 == 1) {
                return arg0;
            } else if (var6 == 2) {
                return 4095 - arg3;
            } else {
                return 4095 - arg0;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2900[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(III)V", line = 24)
    public static final void method1714(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class292.method2484(var3.field4684);
        class292.method2484(var3.field4678);
        if (var3.field4684 != null) {
            var3.field4684 = null;
        }
        if (var3.field4678 != null) {
            var3.field4678 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)V", line = 42)
    public final void method1715(int arg0) {
        try {
            field2894++;
            if (arg0 != -20685) {
                method1714(101, 60, -70);
            }
            if (this.field2895 != null) {
                this.field2895.field2896 = this.field2896;
                this.field2896.field2895 = this.field2895;
                this.field2895 = null;
                this.field2896 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2900[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)V", line = 67)
    public static final void method1716(int arg0, int arg1, int arg2) {
        try {
            if (class516.field7614 != 0) {
                if (arg1 >= 0) {
                    class459.field7078[arg1] = arg2;
                } else {
                    for (int var3 = 0; var3 < 16; var3++) {
                        class459.field7078[var3] = arg2;
                    }
                }
            }
            int var4 = -78 % ((77 - arg0) / 49);
            field2898++;
            class350.field5661.method1137(arg2, arg1, -17);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2900[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1717(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1718(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
