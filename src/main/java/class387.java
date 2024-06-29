import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class387 {

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "[I")
    public static int[] field5423 = new int[2];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lts;)V", line = 4)
    public static final void method2417(class532 arg0) {
        class62.field1128 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([IB)Ljava/lang/String;", line = 7)
    public static final String method2418(int[] arg0, byte arg1) {
        field5424++;
        StringBuffer var2 = new StringBuffer();
        if (arg1 != -104) {
            field5423 = null;
        }
        int var3 = class364.field5109;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class301 var5 = class252.field3594.method967(arg0[var4], 91);
            if (var5.field4236 != -1) {
                class743 var6 = (class743) class233.field3308.method3054((byte) -128, (long) var5.field4236);
                if (var6 == null) {
                    class55 var7 = class55.method502(class501.field7161, var5.field4236, 0);
                    if (var7 != null) {
                        var6 = class359.field5046.method637(var7, true);
                        class233.field3308.method3047(false, var6, (long) var5.field4236);
                    }
                }
                if (var6 != null) {
                    class698.field9810[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLud;)V", line = 58)
    public static final void method2419(boolean arg0, class35 arg1) {
        field5422++;
        int var2 = arg1.method232((byte) -127);
        class7.field111 = new class442[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class7.field111[var3] = new class442();
            class7.field111[var3].field6161 = arg1.method232((byte) -126);
            class7.field111[var3].field6162 = arg1.method279((byte) -126);
        }
        class453.field6399 = arg1.method232((byte) 63);
        class66.field1199 = arg1.method232((byte) -127);
        class660.field9306 = arg1.method232((byte) 116);
        class200.field2874 = new class483[class66.field1199 + 1 - class453.field6399];
        for (int var4 = 0; var4 < class660.field9306; var4++) {
            int var5 = arg1.method232((byte) -127);
            class483 var6 = class200.field2874[var5] = new class483();
            var6.field9244 = arg1.method273(255);
            var6.field9240 = arg1.method234((byte) -102);
            var6.field6838 = class453.field6399 + var5;
            var6.field6842 = arg1.method279((byte) 117);
            var6.field6839 = arg1.method279((byte) 127);
        }
        class321.field4558 = arg1.method234((byte) -94);
        class657.field9249 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 102)
    public static void method2420(int arg0) {
        field5423 = null;
        if (arg0 != 0) {
            method2420(-55);
        }
    }
}
