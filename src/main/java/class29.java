import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 extends class211 {

    @OriginalMember(owner = "client!qaa", name = "I", descriptor = "I")
    private int field359 = 0;

    @OriginalMember(owner = "client!qaa", name = "E", descriptor = "I")
    private int field358 = 4096;

    @OriginalMember(owner = "client!qaa", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field360 = new String[] { method203(method202("G]QF\u0005\u001e")), method203(method202("G]QF\u0003\u001e")), method203(method202("G]QF\u0004\u001e")), method203(method202("M\u0012\u001eF<")), method203(method202("XI\\\u0004")), method203(method202("G]QF\u0002\u001e")), method203(method202("G]QF\u0000\u001e")) };

    @OriginalMember(owner = "client!qaa", name = "D", descriptor = "Lqha;")
    public static class112 field357 = new class112(64);

    @OriginalMember(owner = "client!qaa", name = "G", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!qaa", name = "K", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!qaa", name = "L", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!qaa", name = "C", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!qaa", name = "J", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
    public class29() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field352;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                field355 = 102;
            }
            if (super.field3231.field57) {
                int[] var4 = this.method1856(0, arg1, 95);
                for (int var5 = 0; class343.field5332 > var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = this.field359 <= var6 && var6 <= this.field358 ? 4096 : 0;
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field360[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)V")
    public static void method198(int arg0) {
        try {
            if (arg0 != 4096) {
                method200(102);
            }
            field357 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field360[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IJIIZIILla;)V")
    public static final void method199(int arg0, long arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class476 arg7) {
        try {
            class494.field7093 = null;
            class726.field10492 = arg0;
            int var9 = -128 / ((arg6 - -33) / 58);
            class514.field7421 = arg1;
            ++field354;
            class252.field3914 = arg3;
            class166.field2289 = arg7;
            class573.field8466 = arg5;
            class515.field7438 = 10000;
            class84.field940 = 1;
            class336.field5242 = arg4;
            class550.field8199 = arg2;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field360[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field360[3] : field360[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
    public static final void method200(int arg0) {
        try {
            class683.field9897 = new class541[class113.field1322.method3629((byte) 18)][];
            ++field356;
            if (arg0 != 4096) {
                method198(14);
            }
            class769.field11137 = new class541[class113.field1322.method3629((byte) 18)][];
            class376.field5722 = new boolean[class113.field1322.method3629((byte) 18)];
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field360[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field358 = arg2.method1445((byte) 120);
                }
            } else {
                this.field359 = arg2.method1445((byte) 103);
            }
            if (arg0 <= 67) {
                field355 = -9;
            }
            ++field353;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field360[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field360[3] : field360[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method202(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 65);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method203(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
