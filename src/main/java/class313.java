import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class313 extends class46 {

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field4964 = new String[] { method2643(method2642("/JC:\u001e`")), method2643(method2642("/JC:\u0011`")), method2643(method2642("/JC:\u0012`")), method2643(method2642("/JC:\u0014`")), method2643(method2642("/JC:\u001f`")), method2643(method2642("/JC:\u0013`")), method2643(method2642("/JC:d!EK`f`")), method2643(method2642("/JC:\u0010`")) };

    @OriginalMember(owner = "client!gaa", name = "C", descriptor = "Ldea;")
    public static class259 field4962 = new class259();

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "Lgq;")
    public static class540 field4963 = new class540();

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "I")
    public int field4952;

    @OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "I")
    public int field4958;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "Ljava/lang/String;")
    public String field4956;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)V", line = 4)
    public final void method2635(boolean arg0) {
        try {
            super.field533 = 500L + class430.method3299(81) | super.field533 & Long.MIN_VALUE;
            ++field4953;
            if (!arg0) {
                this.method2638(41);
            }
            class251.field3894.method4067((byte) -84, this);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4964[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "(B)V", line = 20)
    public final void method2636(byte arg0) {
        try {
            int var2 = -88 / ((arg0 - 50) / 32);
            ++field4960;
            super.field533 |= Long.MIN_VALUE;
            if (~this.method2640((byte) -110) == -1L) {
                field4963.method4067((byte) -85, this);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4964[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)I", line = 33)
    public final int method2637(boolean arg0) {
        try {
            ++field4959;
            return arg0 ? -75 : (int) (255L & super.field3177 >>> 56);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4964[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "(I)J", line = 48)
    public final long method2638(int arg0) {
        try {
            ++field4954;
            return arg0 != 255 ? -20L : super.field3177 & 72057594037927935L;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4964[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V", line = 59)
    public static void method2639(int arg0) {
        try {
            int var1 = -21 / ((arg0 - -65) / 50);
            field4963 = null;
            field4962 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4964[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)J", line = 72)
    public final long method2640(byte arg0) {
        try {
            int var2 = 84 % ((arg0 - -9) / 51);
            ++field4957;
            return Long.MAX_VALUE & super.field533;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4964[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)Lib;", line = 82)
    public static final class163 method2641(int arg0) {
        try {
            ++field4961;
            class163 var1 = class686.method5027(0);
            var1.method1443(0L, 255);
            int var2 = 10 / ((arg0 - 62) / 36);
            var1.method1464(class489.field7027, 255);
            var1.method1443(class422.field6215, 255);
            var1.method1443(class21.field245, 255);
            var1.method1420(class77.field886, (byte) 92, class298.field4702);
            return var1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4964[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(IJ)V", line = 98)
    public class313(int arg0, long arg1) {
        try {
            super.field3177 = (long) arg0 << 56 | arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4964[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2642(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 88);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2643(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
