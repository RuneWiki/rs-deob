import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class671 extends class211 {

    @OriginalMember(owner = "client!nia", name = "I", descriptor = "I")
    private int field9748 = 4096;

    @OriginalMember(owner = "client!nia", name = "G", descriptor = "I")
    private int field9747 = 4096;

    @OriginalMember(owner = "client!nia", name = "L", descriptor = "I")
    private int field9742 = 4096;

    @OriginalMember(owner = "client!nia", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field9753 = new String[] { method4940(method4939("]\u00070Q\u0007\u001b")), method4940(method4939("]\u00070Q\u000f\u001b")), method4940(method4939("]\u001b=\u0013")), method4940(method4939("]\u00070Q\u0005\u001b")), method4940(method4939("H@\u007fQ;")) };

    @OriginalMember(owner = "client!nia", name = "F", descriptor = "I")
    public static int field9744 = -1;

    @OriginalMember(owner = "client!nia", name = "H", descriptor = "Leu;")
    public static class505 field9751 = new class505(3);

    @OriginalMember(owner = "client!nia", name = "D", descriptor = "D")
    public static double field9752;

    @OriginalMember(owner = "client!nia", name = "M", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!nia", name = "N", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!nia", name = "C", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!nia", name = "K", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!nia", name = "J", descriptor = "Lbp;")
    public static class405 field9743;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)[[I")
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field9749;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[][] var4 = this.method1853(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class343.field5332 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && var13 == var14) {
                        var8[var11] = this.field9747 * var12 >> 12;
                        var9[var11] = this.field9742 * var13 >> 12;
                        var10[var11] = this.field9748 * var14 >> 12;
                    } else {
                        var8[var11] = this.field9747;
                        var9[var11] = this.field9742;
                        var10[var11] = this.field9748;
                    }
                }
            }
            if (arg1 > -38) {
                field9752 = -0.13126333923782413D;
            }
            return var3;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field9753[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIILqa;Lqa;)V")
    public static final void method4937(int arg0, int arg1, int arg2, class261 arg3, class261 arg4) {
        class96 var5 = class483.method3683(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field1082 = arg3;
            var5.field1079 = arg4;
            int var6 = class555.field8261 == class195.field2617 ? 1 : 0;
            if (arg3.method1082((byte) 27)) {
                if (arg3.method1098(false)) {
                    arg3.field6207 = class273.field4136[var6];
                    class273.field4136[var6] = arg3;
                } else {
                    arg3.field6207 = class106.field1228[var6];
                    class106.field1228[var6] = arg3;
                    class222.field3412 = true;
                }
            } else {
                arg3.field6207 = class74.field862[var6];
                class74.field862[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method1082((byte) 27)) {
                    if (arg4.method1098(false)) {
                        arg4.field6207 = class273.field4136[var6];
                        class273.field4136[var6] = arg4;
                        return;
                    }
                    arg4.field6207 = class106.field1228[var6];
                    class106.field1228[var6] = arg4;
                    class222.field3412 = true;
                    return;
                }
                arg4.field6207 = class74.field862[var6];
                class74.field862[var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(Z)V")
    public static void method4938(boolean arg0) {
        try {
            if (arg0) {
                field9743 = null;
            }
            field9751 = null;
            field9743 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9753[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "()V")
    public class671() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field9748 = arg2.method1445((byte) 118);
                    }
                } else {
                    this.field9742 = arg2.method1445((byte) 121);
                }
            } else {
                this.field9747 = arg2.method1445((byte) 108);
            }
            if (arg0 <= 67) {
                method4937(50, 122, 123, (class261) null, (class261) null);
            }
            ++field9750;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9753[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9753[4] : field9753[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4939(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4940(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
