import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class452 {

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6993 = new String[] { method3514(method3513("Sk_6h\u0012")), method3514(method3513("TxRt")), method3514(method3513("Sk_6j\u0012")), method3514(method3513("A#\u00106V")), method3514(method3513("Sk_6i\u0012")) };

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "Lak;")
    public static class369 field6989 = new class369();

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "Lhl;")
    public static class556 field6992 = new class556(25, 0);

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "Lgv;")
    public static class87 field6991;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 7)
    public static void method3510(int arg0) {
        try {
            field6989 = null;
            field6991 = null;
            if (arg0 == -13364) {
                field6992 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6993[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)I", line = 20)
    public static final int method3511(byte arg0) {
        try {
            field6988++;
            if (arg0 <= 0) {
                field6991 = null;
            }
            return class148.method1347(false, -30953);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6993[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILwq;Ltga;B)V", line = 34)
    public static final void method3512(int arg0, class176 arg1, class61 arg2, byte arg3) {
        try {
            field6987++;
            class303 var4 = new class303();
            var4.field4888 = arg1.method1645((byte) -102);
            var4.field4883 = arg1.method1622(-18712);
            var4.field4881 = new byte[var4.field4888][][];
            if (arg3 >= -57) {
                field6990 = -99;
            }
            var4.field4884 = new class218[var4.field4888];
            var4.field4878 = new int[var4.field4888];
            var4.field4886 = new class218[var4.field4888];
            var4.field4879 = new int[var4.field4888];
            var4.field4885 = new int[var4.field4888];
            for (int var5 = 0; var5 < var4.field4888; var5++) {
                try {
                    int var6 = arg1.method1645((byte) -104);
                    if (var6 == 0 || var6 == 1 || var6 == 2) {
                        String var17 = arg1.method1635((byte) 70);
                        String var18 = arg1.method1635((byte) 87);
                        int var19 = 0;
                        if (var6 == 1) {
                            var19 = arg1.method1622(-18712);
                        }
                        var4.field4878[var5] = var6;
                        var4.field4879[var5] = var19;
                        var4.field4886[var5] = arg2.method645(class642.method4649((byte) 80, var17), 0, var18);
                    } else if (var6 == 3 || var6 == 4) {
                        String var7 = arg1.method1635((byte) 89);
                        String var8 = arg1.method1635((byte) 121);
                        int var9 = arg1.method1645((byte) -127);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var11 < var9; var11++) {
                            var10[var11] = arg1.method1635((byte) 103);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var13 < var9; var13++) {
                                int var14 = arg1.method1622(-18712);
                                var12[var13] = new byte[var14];
                                arg1.method1651(var12[var13], 128, 0, var14);
                            }
                        }
                        var4.field4878[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var16 < var9; var16++) {
                            var15[var16] = class642.method4649((byte) 123, var10[var16]);
                        }
                        var4.field4884[var5] = arg2.method634(var8, (byte) -128, var15, class642.method4649((byte) 66, var7));
                        var4.field4881[var5] = var12;
                    }
                } catch (ClassNotFoundException var21) {
                    var4.field4885[var5] = -1;
                } catch (SecurityException var22) {
                    var4.field4885[var5] = -2;
                } catch (NullPointerException var23) {
                    var4.field4885[var5] = -3;
                } catch (Exception var24) {
                    var4.field4885[var5] = -4;
                } catch (Throwable var25) {
                    var4.field4885[var5] = -5;
                }
            }
            class140.field1953.method3220(var4, 0);
        } catch (RuntimeException var26) {
            throw class590.method4333(var26, field6993[2] + arg0 + ',' + (arg1 == null ? field6993[1] : field6993[3]) + ',' + (arg2 == null ? field6993[1] : field6993[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3513(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3514(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
