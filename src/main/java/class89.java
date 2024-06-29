import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public abstract class class89 {

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)Lgm;")
    public abstract class109 method664(byte arg0);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lfaa;ZII)V")
    public static final void method665(class140 arg0, boolean arg1, int arg2, int arg3) {
        field1198++;
        if (class457.field6455) {
            class374 var4 = class36.field449 == -1 ? null : class324.field4784.method2171((byte) -80, class36.field449);
            if (client.method1655(arg0).method2850(0) && (class414.field5858 & 0x20) != 0 && (var4 == null || arg0.method1003(var4.field5300, class36.field449, 64) != var4.field5300)) {
                class92.method678(class73.field1010 + " -> " + arg0.field2034, arg0.field2092, 5, arg0.field1969, arg0.field2100, 0L, class561.field7575, true, class281.field3927, (byte) -74, false);
                class563.field7600++;
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class590.method3279(var5, 2048, arg0);
            if (var9 != null) {
                class92.method678(arg0.field2034, arg0.field2092, 1012, arg0.field1969, arg0.field2100, (long) (var5 + 1), class110.method825(arg1, arg0, var5), true, var9, (byte) -74, false);
                class680.field9586++;
            }
        }
        String var6 = class397.method2262(arg0, (byte) 23);
        if (var6 != null) {
            class31.field373++;
            class92.method678(arg0.field2034, arg0.field2092, 23, arg0.field1969, arg0.field2100, 0L, arg0.field2101, true, var6, (byte) -74, false);
        }
        if (!arg1) {
            return;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class590.method3279(var7, 2048, arg0);
            if (var8 != null) {
                class680.field9586++;
                class92.method678(arg0.field2034, arg0.field2092, 60, arg0.field1969, arg0.field2100, (long) (var7 + 1), class110.method825(true, arg0, var7), true, var8, (byte) -74, false);
            }
        }
        if (!client.method1655(arg0).method2845((byte) -94)) {
            return;
        }
        if (arg0.field1986 == null) {
            class92.method678("", arg0.field2092, 50, arg0.field1969, arg0.field2100, 0L, -1, true, class9.field96.method42(class666.field9377, 19572), (byte) -74, false);
        } else {
            class92.method678("", arg0.field2092, 50, arg0.field1969, arg0.field2100, 0L, -1, true, arg0.field1986, (byte) -74, false);
        }
        class246.field3500++;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)Z")
    public abstract boolean method666(int arg0, int arg1);

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
    public abstract void method667(byte arg0);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "([[BBLop;)V")
    public static final void method668(byte[][] arg0, byte arg1, class172 arg2) {
        field1199++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field3766; var4++) {
            class74.method592(0);
            for (int var5 = 0; var5 < class86.field1185 >> 3; var5++) {
                for (int var6 = 0; var6 < (class526.field7212 >> 3); var6++) {
                    int var7 = class308.field4593[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field3775 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFC) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class234.field3367.length; var13++) {
                                if (class234.field3367[var13] == var12 && arg0[var13] != null) {
                                    class96 var14 = new class96(arg0[var13]);
                                    arg2.method1613(var6 * 8, (byte) -83, var10, var4, class480.field6696, var11, var5 * 8, var14, var9, var8);
                                    arg2.method1179(var4, var5 * 8, var11, class630.field8790, var14, var10, var8, 126, var6 * 8, var9, var3[0] == -1 ? var3 : null);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= 46 && var3[0] != -1) {
            class127.field1765 = class169.field2547.method1946(29045, var3[3], var3[2], class305.field4492, var3[1], var3[0]);
            class448.field6272 = var3[4];
        }
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(B)V")
    public abstract void method669(byte arg0);
}
