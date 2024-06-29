import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public abstract class class440 {

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6493 = new String[] { method3384(method3383("b=.j\u0019'")), method3384(method3383("a\"#(")), method3384(method3383("tyaj&")), method3384(method3383("b=.j\u001f'")), method3384(method3383("b=.j\u001a'")) };

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "Lel;")
    public static class573 field6485 = new class573(85, 6);

    @OriginalMember(owner = "client!mja", name = "h", descriptor = "[I")
    public static int[] field6488 = new int[1];

    @OriginalMember(owner = "client!mja", name = "f", descriptor = "[I")
    public static int[] field6492 = new int[4096];

    @OriginalMember(owner = "client!mja", name = "d", descriptor = "Lel;")
    public static class573 field6487 = new class573(13, 6);

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!mja", name = "g", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!mja", name = "e", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "Lqq;")
    public static class501 field6490;

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "(B)V")
    public static void method3380(byte arg0) {
        try {
            field6492 = null;
            field6488 = null;
            field6490 = null;
            if (arg0 != 122) {
                method3380((byte) 62);
            }
            field6487 = null;
            field6485 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6493[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lss;IZZ)V")
    public static final void method3381(class454 arg0, int arg1, boolean arg2, boolean arg3) {
        try {
            field6486++;
            int var4 = arg0.field6640;
            int var5 = (int) arg0.field3177;
            arg0.method1824(1);
            if (arg2) {
                class273.method2258((byte) 21, var4);
            }
            class431.method3306(255, var4);
            class541 var6 = class461.method3513(var5, 127);
            if (var6 != null) {
                class115.method1013(true, var6);
            }
            class159.method1356(arg1 + 255);
            if (!arg3 && class742.field10801 != -1) {
                class781.method5644(class742.field10801, 73, 1);
            }
            if (arg1 == 0) {
                class342 var7 = new class342(class661.field9563);
                for (class454 var8 = (class454) var7.method2840(-128); var8 != null; var8 = (class454) var7.method2838(arg1 + 92)) {
                    if (!var8.method1823(0)) {
                        var8 = (class454) var7.method2840(arg1 - 124);
                        if (var8 == null) {
                            return;
                        }
                    }
                    if (var8.field6635 == 3) {
                        int var9 = (int) var8.field3177;
                        if ((var9 >>> 16) == var4) {
                            method3381(var8, 0, true, arg3);
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field6493[3] + (arg0 == null ? field6493[1] : field6493[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(II)I")
    public static final int method3382(int arg0, int arg1) {
        try {
            field6491++;
            return arg0 == -909794393 ? arg1 >>> 7 : 23;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6493[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)J")
    public abstract long method165(byte arg0);

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3383(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3384(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
