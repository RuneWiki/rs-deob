import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class716 extends class131 {

    @OriginalMember(owner = "client!vha", name = "v", descriptor = "I")
    public int field10354;

    @OriginalMember(owner = "client!vha", name = "u", descriptor = "I")
    public int field10356;

    @OriginalMember(owner = "client!vha", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field10363 = new String[] { method5188(method5187("5@\u000f3Vk")), method5188(method5187("5@\u000f3Wk")), method5188(method5187("5@\u000f3Tk")), method5188(method5187("5@\u000f3)*F\u0007i+k")), method5188(method5187("-]\u0002q")), method5188(method5187("8\u0006@3h")) };

    @OriginalMember(owner = "client!vha", name = "B", descriptor = "[I")
    public static int[] field10358 = new int[4096];

    @OriginalMember(owner = "client!vha", name = "t", descriptor = "Lhl;")
    public static class556 field10355 = new class556(48, 5);

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "[I")
    public static int[] field10361 = new int[2];

    @OriginalMember(owner = "client!vha", name = "C", descriptor = "I")
    public static int field10357;

    @OriginalMember(owner = "client!vha", name = "x", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!vha", name = "y", descriptor = "Ltv;")
    public static class587 field10360;

    @OriginalMember(owner = "client!vha", name = "w", descriptor = "[J")
    public static long[] field10359;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Z)Lwh;", line = 4)
    public final class155 method989(boolean arg0) {
        try {
            if (arg0) {
                field10361 = null;
            }
            field10362++;
            return class201.field3178;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10363[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V", line = 18)
    public static void method5185(byte arg0) {
        try {
            field10359 = null;
            field10358 = null;
            field10355 = null;
            if (arg0 <= -93) {
                field10361 = null;
                field10360 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10363[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Ljk;Ltda;IIIIIIIII)V", line = 32)
    public class716(class662 arg0, class666 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field10354 = arg10;
            this.field10356 = arg9;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field10363[3] + (arg0 == null ? field10363[4] : field10363[5]) + ',' + (arg1 == null ? field10363[4] : field10363[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V", line = 47)
    public static final void method5186(int arg0) {
        try {
            if (arg0 == 2) {
                field10357++;
                int var1 = class623.field8996.field6384.method5351(true);
                if (var1 == 0) {
                    class32.field388 = null;
                    class660.method4799(123, 0);
                } else if (var1 == 1) {
                    class464.method3588((byte) 0, (byte) -91);
                    class660.method4799(-119, 512);
                    if (class224.field3519 != null) {
                        class455.method3534((byte) -69);
                    }
                } else {
                    class464.method3588((byte) (class680.field9672 - 4 & 0xFF), (byte) -115);
                    class660.method4799(109, 2);
                }
                class760.field11176 = class673.field9554;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10363[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5187(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5188(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
