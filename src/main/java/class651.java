import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class651 {

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9421 = new String[] { method4786(method4785("+\u0003\u007f`s")), method4786(method4785("+\u0003\u007fbs")), method4786(method4785("5O\u007f\u000f&")), method4786(method4785("+\u0003\u007fcs")), method4786(method4785(" \u0014=M")) };

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[F")
    public static float[] field9420 = new float[4];

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field9416 = -1;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "F")
    public static float field9419;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 6)
    public static void method4782(int arg0) {
        try {
            if (arg0 != -8) {
                field9419 = -0.347652F;
            }
            field9420 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9421[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method4783(int arg0, int arg1, int arg2) {
        try {
            field9417++;
            if (arg0 == 2) {
                return (arg1 & 0x800) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9421[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZLjava/lang/String;I)V", line = 29)
    public static final void method4784(boolean arg0, boolean arg1, String arg2, int arg3) {
        try {
            field9418++;
            class762.method5517((byte) -17);
            class12.method81(false);
            if (!arg1) {
                method4784(true, true, null, -3);
            }
            class454.method3476(-72);
            class378.method3044(arg2, -128, arg0, arg3);
            class639.method4687((byte) -123);
            class472.method3585(!arg1, class610.field8913);
            class514.method3888(-1, class610.field8913);
            class88.method745(class383.field5798, 0, class610.field8913);
            class49.method378(2);
            class670.method4930(class208.field3193, (byte) -16);
            class649.method4771((byte) 4);
            class735.method5364(2);
            if (class138.field1645 == 3) {
                class86.method728(4, (byte) -96);
            } else if (class138.field1645 == 7) {
                class86.method728(8, (byte) -96);
            } else if (class138.field1645 == 10) {
                class86.method728(11, (byte) -96);
            } else if (class138.field1645 == 1 || class138.field1645 == 2) {
                class753.method5470(123);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9421[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9421[4] : field9421[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4785(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4786(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
