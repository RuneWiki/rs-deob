import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class524 extends class568 {

    @OriginalMember(owner = "client!va", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7737 = new String[] { method3920(method3919("4s:\u001dM")), method3920(method3919("4s:\u001cM")) };

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lrda;IIIII)V", line = 7)
    public static final void method3916(class693 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class612.field8806 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class150.field2096) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class117.field1705 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class290 var14 = class85.field1280[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class740.field10902[var11].method2495(var13, 1, var12) + class740.field10902[var11].method2495(var13, 1, var12 + 1) + class740.field10902[var11].method2495(var13 + 1, 1, var12) + class740.field10902[var11].method2495(var13 + 1, 1, var12 + 1)) / 4 - (class740.field10902[arg1].method2495(arg3, 1, arg2) + class740.field10902[arg1].method2495(arg3, 1, arg2 + 1) + class740.field10902[arg1].method2495(arg3 + 1, 1, arg2) + class740.field10902[arg1].method2495(arg3 + 1, 1, arg2 + 1)) / 4;
                                    class350 var16 = var14.field4684;
                                    class350 var17 = var14.field4678;
                                    if (var16 != null && var16.method53(47)) {
                                        arg0.method48(var6, var15, class120.field1734, (var13 - arg3) * class152.field2131 + (1 - arg5) * class316.field5139, var16, -103, (var12 - arg2) * class152.field2131 + (1 - arg4) * class316.field5139);
                                    }
                                    if (var17 != null && var17.method53(47)) {
                                        arg0.method48(var6, var15, class120.field1734, (var13 - arg3) * class152.field2131 + (1 - arg5) * class316.field5139, var17, -109, (var12 - arg2) * class152.field2131 + (1 - arg4) * class316.field5139);
                                    }
                                    for (class135 var18 = var14.field4670; var18 != null; var18 = var18.field1912) {
                                        class185 var19 = var18.field1911;
                                        if (var19 != null && var19.method53(47) && (var19.field2945 == var12 || var7 == var12) && (var19.field2946 == var13 || var9 == var13)) {
                                            int var20 = var19.field2940 + 1 - var19.field2945;
                                            int var21 = var19.field2939 + 1 - var19.field2946;
                                            arg0.method48(var6, var15, class120.field1734, (var19.field2946 - arg3) * class152.field2131 + (var21 - arg5) * class316.field5139, var19, -65, (var19.field2945 - arg2) * class152.field2131 + (var20 - arg4) * class316.field5139);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z", line = 102)
    public static final boolean method3917(int arg0, int arg1, int arg2) {
        try {
            field7734++;
            if (arg0 != 1) {
                field7735 = 116;
            }
            return class46.method465(arg2, -6635, arg1) | (arg2 & 0x70000) != 0 || class639.method4622(arg1, (byte) -128, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7737[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IJ)V", line = 114)
    public static final void method3918(int arg0, long arg1) {
        try {
            if (arg0 == -4) {
                field7736++;
                if (arg1 > 0L) {
                    if (arg1 % 10L == 0L) {
                        class563.method4134(arg1 - 1L, false);
                        class563.method4134(1L, false);
                    } else {
                        class563.method4134(arg1, false);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7737[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I")
    public abstract int method1936(int arg0);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)J")
    public abstract long method1939(byte arg0);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
    public abstract int method1935(int arg0);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I")
    public abstract int method1938(int arg0);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)I")
    public abstract int method1933(int arg0);

    @OriginalMember(owner = "client!va", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3919(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x65);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!va", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3920(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 101;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
