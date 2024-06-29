import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class751 implements class175 {

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "Lnga;")
    public class541 field11055;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Lgda;")
    private class58 field11059;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11068 = new String[] { method5454(method5453("\" X\u0013\u000e")), method5454(method5453("(\"\u001a7")), method5454(method5453("=yXu[")), method5454(method5453("\" X\u0019\u000e")), method5454(method5453("\" X\u0018\u000e")), method5454(method5453("\" X\u001a\u000e")), method5454(method5453("\" X\u0012\u000e")), method5454(method5453("\" X\u001c\u000e")), method5454(method5453("\" XgO(>\u0002e\u000e")) };

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field11062 = -1;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field11054;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field11056;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field11057;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public static int field11058;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public static int field11061;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
    public static int field11063;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field11064;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public static int field11065;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field11066;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    public static int field11067;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "Lhk;")
    public class107 field11060;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)[I", line = 3)
    public static final int[] method5449(int arg0, int arg1) {
        try {
            field11056++;
            int[] var2 = new int[3];
            class310.method2659(class240.method2066(-1, arg0), (byte) 72);
            var2[0] = class679.field9664.get(5);
            var2[1] = class679.field9664.get(arg1);
            var2[2] = class679.field9664.get(1);
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11068[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZZ)V", line = 20)
    public void method1618(boolean arg0, boolean arg1) {
        try {
            field11058++;
            if (arg0 && arg1) {
                int var3 = this.field11055.field7974.method4806(class696.field10028, this.field11060.method26(), -127) + this.field11055.field7971;
                int var4 = this.field11055.field7973.method4833(this.field11060.method12(), class518.field7672, (byte) 84) + this.field11055.field7970;
                this.field11060.method1001(var3, var4);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11068[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "()V", line = 50)
    public static final void method5450() {
        for (int var0 = 0; var0 < class251.field3843; var0++) {
            class185 var1 = class213.field3363[var0];
            class165.method1553(var1, true);
            class213.field3363[var0] = null;
        }
        class251.field3843 = 0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V", line = 70)
    public static final void method5451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            field11063++;
            class441 var8 = new class441();
            var8.field6880 = arg4;
            var8.field6888 = class431.field6776 + arg0;
            var8.field6889 = arg7;
            var8.field6886 = arg6;
            var8.field6885 = arg2;
            if (arg3 == 2) {
                var8.field6883 = arg5;
                var8.field6881 = arg1;
                class195.field3093.method748(43, var8);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field11068[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field11068[1] : field11068[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lgda;Lnga;)V", line = 89)
    public class751(class58 arg0, class541 arg1) {
        try {
            this.field11055 = arg1;
            this.field11059 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11068[8] + (arg0 == null ? field11068[1] : field11068[2]) + ',' + (arg1 == null ? field11068[1] : field11068[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLjava/lang/String;)V", line = 98)
    public static final void method5452(byte arg0, String arg1) {
        try {
            field11054++;
            if (!arg1.equals("")) {
                class359.field5801++;
                class164 var2 = class193.method1785(false);
                class487 var3 = class618.method4519(66, class172.field2751, var2.field2659);
                if (arg0 >= 54) {
                    var3.field7362.method1678(class126.method1216(-29, arg1), 65280);
                    var3.field7362.method1681(arg1, 23137);
                    var2.method1546(var3, 1);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11068[0] + arg0 + ',' + (arg1 == null ? field11068[1] : field11068[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V", line = 122)
    public final void method459(byte arg0) {
        try {
            if (arg0 != -13) {
                method5449(-1, -8);
            }
            field11066++;
            this.field11060 = class326.method2770(32428, this.field11059, this.field11055.field7968);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11068[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Z", line = 133)
    public final boolean method457(byte arg0) {
        try {
            if (arg0 <= 9) {
                method5449(106, -43);
            }
            field11067++;
            return this.field11059.method595(-2, this.field11055.field7968);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11068[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5453(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5454(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
