import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class113 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method858(String arg0, byte arg1) {
        if (arg1 != 18) {
            return 10;
        }
        field1477++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class576.method3152(arg0.charAt(var4), arg1 + 106) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lwk;II)V")
    public static final void method859(class227 arg0, int arg1, int arg2) {
        field1476++;
        if (arg0.field2979 != null) {
            int var3 = arg0.field2979[arg2 + 1];
            if (arg0.field3021 != var3) {
                arg0.field2944 = 0;
                arg0.field3015 = 0;
                arg0.field3037 = arg0.field3038;
                arg0.field2943 = 0;
                arg0.field3021 = var3;
                arg0.field2972 = 1;
                if (arg0.field3021 != -1) {
                    class451.method2548(class552.field7163.method3031(-116, arg0.field3021), arg0.field508, arg0.field503, arg0.field506, 255, class233.field3130 == arg0, arg0.field3015);
                }
            }
        }
        if (arg1 <= -108) {
            ;
        }
    }
}
