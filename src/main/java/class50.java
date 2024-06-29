import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class50 {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lne;")
    public class317 field578 = new class317();

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static final void method312(byte arg0) {
        int var1 = 124 % ((arg0 + 19) / 63);
        field577++;
        class9.field137 = 0;
        class223.field2924 = 0;
        class151.field2140 = 0;
        class53.field604 = 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static final void method313(int arg0) {
        class504.field7232 = 0;
        field576++;
        class199.field2625++;
        class674.field9141 = 0;
        class558.method3217(29921);
        class530.method3084(68);
        class177.method1123(107);
        boolean var1 = false;
        for (int var2 = 0; var2 < class674.field9141; var2++) {
            int var6 = class673.field9115[var2];
            class740 var7 = (class740) class373.field5230.method1180((byte) 26, (long) var6);
            class468 var8 = var7.field10289;
            if (class436.field6192 && class235.method1511(var6, (byte) -120)) {
                class405.method2516((byte) 78);
            }
            if (class199.field2625 != var8.field7961) {
                if (var8.field6632.method2274(90)) {
                    class365.method2323(-123, var8);
                }
                var8.method2789(-1, null);
                var1 = true;
                var7.method1185(-105);
            }
        }
        if (var1) {
            class438.field6239 = class373.field5230.method1177(-52);
            class373.field5230.method1181(class30.field399, -1);
        }
        if (class398.field5617 != class89.field1072.field9146) {
            throw new RuntimeException("gnp1 pos:" + class89.field1072.field9146 + " psize:" + class398.field5617);
        }
        for (int var3 = 0; var3 < class344.field4849; var3++) {
            if (class373.field5230.method1180((byte) 26, (long) class100.field1196[var3]) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class344.field4849);
            }
        }
        int var4 = -43 % ((arg0 + 68) / 39);
        if (class438.field6239 - class344.field4849 != 0) {
            throw new RuntimeException("gnp3 mis:" + (class438.field6239 - class344.field4849));
        }
        for (int var5 = 0; var5 < class438.field6239; var5++) {
            if (class199.field2625 != class30.field399[var5].field10289.field7961) {
                throw new RuntimeException("gnp4 uk:" + class30.field399[var5].field10289.field7958);
            }
        }
    }
}
