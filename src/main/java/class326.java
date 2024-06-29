import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class326 extends class206 {

    @OriginalMember(owner = "client!qja", name = "p", descriptor = "Z")
    public boolean field5134 = true;

    @OriginalMember(owner = "client!qja", name = "q", descriptor = "Z")
    public boolean field5149 = false;

    @OriginalMember(owner = "client!qja", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field5150 = new String[] { method2766(method2765("?\u0003 Oyf")), method2766(method2765("?\u0003 O\u007ff")), method2766(method2765("?\u0003 Oxf")), method2766(method2765("5GoOF")), method2766(method2765("?\u0003 Ozf")), method2766(method2765(" \u001c-\r")) };

    @OriginalMember(owner = "client!qja", name = "n", descriptor = "F")
    public static float field5132;

    @OriginalMember(owner = "client!qja", name = "v", descriptor = "I")
    public int field5133;

    @OriginalMember(owner = "client!qja", name = "z", descriptor = "I")
    public int field5135;

    @OriginalMember(owner = "client!qja", name = "o", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!qja", name = "s", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!qja", name = "l", descriptor = "I")
    public int field5139;

    @OriginalMember(owner = "client!qja", name = "x", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!qja", name = "j", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!qja", name = "m", descriptor = "I")
    public int field5142;

    @OriginalMember(owner = "client!qja", name = "r", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!qja", name = "y", descriptor = "I")
    public int field5144;

    @OriginalMember(owner = "client!qja", name = "k", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!qja", name = "B", descriptor = "I")
    public int field5146;

    @OriginalMember(owner = "client!qja", name = "w", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!qja", name = "t", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!qja", name = "u", descriptor = "Lrn;")
    public class282 field5138;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method2761(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg0 != 1) {
                field5132 = 0.49664763F;
            }
            if (class200.field3119 <= arg2 && arg2 <= class676.field9797) {
                int var7 = class541.method4089(class676.field9807, class381.field5786, arg3, 18286);
                int var8 = class541.method4089(class676.field9807, class381.field5786, arg4, arg0 + 18285);
                class57.method422(var8, arg2, (byte) 57, arg1, var7);
            }
            field5145++;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5150[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILsb;)Z", line = 35)
    public static final boolean method2762(int arg0, class306 arg1) {
        try {
            field5143++;
            if (arg1 == null) {
                return false;
            } else if (!arg1.field4786) {
                return false;
            } else if (!arg1.method2593(class161.field2148, false)) {
                return false;
            } else if (class279.field4188.method977((long) arg1.field4783, 1) == null) {
                int var2 = -40 % ((arg0 + 5) / 51);
                return class432.field6357.method977((long) arg1.field4825, 1) == null;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5150[4] + arg0 + ',' + (arg1 == null ? field5150[5] : field5150[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(B)V", line = 70)
    public static final void method2763(byte arg0) {
        try {
            field5147++;
            if (!class424.field6257) {
                if (arg0 != 22) {
                    method2762(-112, null);
                }
                class184.method1604((byte) 78, class443.field6508);
                if (class80.field907 != null) {
                    class184.method1604((byte) 88, class80.field907);
                }
                class424.field6257 = true;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5150[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IBII)I", line = 96)
    public static final int method2764(int arg0, byte arg1, int arg2, int arg3) {
        try {
            field5141++;
            int var4 = arg2 / arg3;
            int var5 = arg2 & arg3 - 1;
            int var6 = arg0 / arg3;
            int var7 = arg0 & arg3 - 1;
            int var8 = class273.method2261(123, var4, var6);
            if (arg1 > -18) {
                return -123;
            }
            int var9 = class273.method2261(-46, var4 + 1, var6);
            int var10 = class273.method2261(126, var4, var6 + 1);
            int var11 = class273.method2261(119, var4 + 1, var6 + 1);
            int var12 = class358.method2923(arg3, var5, var8, (byte) 127, var9);
            int var13 = class358.method2923(arg3, var5, var10, (byte) 126, var11);
            return class358.method2923(arg3, var7, var12, (byte) 121, var13);
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field5150[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2765(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2766(char[] arg0) {
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
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
