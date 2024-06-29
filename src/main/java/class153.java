import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class153 {

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2072 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2075 = "glow2:";

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Llm;")
    public static class347 field2066;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZIZI)V")
    public static final void method957(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (arg0) {
            field2074 = 54;
        }
        field2068++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class9.field153 = arg3;
        class407.field6043 = arg2;
        class253.field3496 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static void method958(byte arg0) {
        field2072 = null;
        int var1 = -29 % ((arg0 - 6) / 50);
        field2066 = null;
        field2075 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public static final void method959(boolean arg0) {
        class331.method2194(arg0);
        field2067++;
        class302.method2062(3);
        class282.method1941(121);
        class278.method1922(-1);
        class422.method2697(true);
        class125.method799((byte) -4);
        method961(-110);
        class71.method516(-3248);
        class93.method648((byte) 122);
        class117.method760((byte) -92);
        class399.method2572(true);
        class167.method1026((byte) 105);
        class52.method362((byte) -63);
        class267.method1824(14646);
        class30.method201(-106);
        class43.method315(-123);
        class376.method2442(false);
        class435.method2743((byte) -54);
        class152.method952((byte) 106);
        class51.method356(-128);
        class110.method725(51);
        class268.method1829(65536);
        class98.method663(125);
        class129.field1789.method1136((byte) -109);
        class315.field4603.method1136((byte) -99);
        class88.field1231.method1136((byte) -100);
        class219.field2902.method1136((byte) -90);
        class123.field1718.method1136((byte) -86);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILii;ILfh;IIZ)V")
    public static final void method960(int arg0, class405 arg1, int arg2, class210 arg3, int arg4, int arg5, boolean arg6) {
        if (class180.field2383 < 100) {
            class439.method2763(-4096, arg3, arg1);
        }
        field2076++;
        arg1.method1767(arg5, arg4, arg2 + arg5, arg4 - -arg0);
        if (class180.field2383 < 100) {
            byte var7 = 20;
            int var8 = arg2 / 2 + arg5;
            int var9 = arg0 / 2 + arg4 - var7 - 18;
            arg1.method1632(arg5, arg4, arg2, arg0, -16777216, 0);
            arg1.method1731(var8 - 152, var9, 304, 34, class140.field1918[class202.field2714].getRGB(), 0);
            arg1.method1632(var8 - 150, var9 - -2, class180.field2383 * 3, 30, class416.field6112[class202.field2714].getRGB(), 0);
            class422.field6227.method1881(var8, class270.field3921, var7 + var9, -1, class321.field4732[class202.field2714].getRGB(), 122);
        } else if (arg6) {
            int var10 = class44.field624 - ((int) ((float) arg2 / class293.field4176));
            int var11 = (int) ((float) arg0 / class293.field4176) + class373.field5426;
            int var12 = (int) ((float) arg2 / class293.field4176) + class44.field624;
            class90.field1278 = (int) ((float) (arg2 * 2) / class293.field4176);
            class405.field6017 = (int) ((float) (arg0 * 2) / class293.field4176);
            class364.field5258 = class44.field624 - ((int) ((float) arg2 / class293.field4176));
            class281.field4088 = class373.field5426 - ((int) ((float) arg0 / class293.field4176));
            int var13 = class373.field5426 - ((int) ((float) arg0 / class293.field4176));
            class293.method2005(class293.field4205 + var10, class293.field4197 + var11, var12 + class293.field4205, class293.field4197 + var13, arg5, arg4, arg2 + arg5, arg4 - -arg0 + 1);
            class293.method1995(arg1);
            class47 var14 = class293.method1998(arg1);
            class78.method565(0, 0, arg1, var14, 12685);
            if (class449.field6577 > 0) {
                class249.field3365--;
                if (class249.field3365 == 0) {
                    class249.field3365 = 20;
                    class449.field6577--;
                }
            }
            if (class196.field2625) {
                int var15 = arg5 + arg2 - 5;
                int var16 = arg0 + arg4 - 8;
                class393.field5626.method1876("Fps:" + class398.field5939, var15, 16776960, var16, -1, 24412);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (var18 > 65536) {
                    var19 = 16711680;
                }
                class393.field5626.method1876("Mem:" + var18 + "k", var15, var19, var20, -1, 24412);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    private static final void method961(int arg0) {
        field2073++;
        class189 var1 = class329.field4793;
        synchronized (class329.field4793) {
            class329.field4793.method1136((byte) -99);
        }
        class189 var2 = class211.field2816;
        synchronized (class211.field2816) {
            class211.field2816.method1136((byte) -70);
        }
        int var3 = 43 % ((arg0 + 8) / 48);
    }
}
