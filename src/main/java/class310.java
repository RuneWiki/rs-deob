import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class310 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4879 = "Face here";

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4882 = -1;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Loj;")
    public static class325 field4877;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4878;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[S")
    public static short[] field4881;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lme;", line = 6)
    public static final class189 method2144(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class189 var4 = var3.field4236;
            var3.field4236 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 18)
    public static void method2145(byte arg0) {
        field4879 = null;
        field4881 = null;
        field4877 = null;
        if (arg0 != -92) {
            field4876 = 43;
        }
        field4878 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBLob;III)V", line = 31)
    public static final void method2146(int arg0, int arg1, byte arg2, class292 arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 104) {
            method2145((byte) 123);
        }
        field4880++;
        int var7 = arg5 * arg5 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field4608 / 2, arg3.field4499 / 2);
        if (var7 <= (var8 * var8)) {
            class100.method722(arg1, arg4, arg2 + 1943, class78.field1199[arg0], arg6, arg5, arg3);
            return;
        }
        var8 -= 10;
        int var9 = class248.field3833 + class204.field3234 & 0x7FF;
        int var10 = class174.field2731[var9];
        int var11 = var10 * 256 / (class123.field1970 + 256);
        int var12 = class174.field2732[var9];
        int var13 = var12 * 256 / (class123.field1970 + 256);
        int var14 = arg5 * var13 + arg6 * var11 >> 16;
        int var15 = arg6 * var13 - (arg5 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        if (class265.field4126) {
            ((class105) class319.field4958[arg0]).method811(240, 240, (arg3.field4608 / 2 + var18 + arg1) * 16, (arg4 - (var19 - (arg3.field4499 / 2))) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class7) class319.field4958[arg0]).method48(arg3.field4608 / 2 + arg1 + var18 - 10, arg3.field4499 / 2 + arg4 + -var19 + -10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 100)
    public static final boolean method2147(String arg0, byte arg1) {
        field4886++;
        if (arg1 != -118) {
            field4885 = 87;
        }
        return class185.method1393(arg0, -121, 10, true);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V", line = 112)
    public static final void method2148(int arg0, int arg1) {
        class4 var2 = class67.method510(1, 12, arg1);
        var2.method6(255);
        int var3 = -52 % ((arg0 + 47) / 41);
        field4883++;
    }
}
