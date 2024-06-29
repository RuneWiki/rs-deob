import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
    public static boolean field123 = false;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lni;")
    public static class522 field125;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 10)
    public static final void method77(int arg0) {
        class118.field1557 = 0;
        class558.field7854++;
        class488.field6690 = 0;
        field126++;
        class706.method3977(-4942);
        class277.method1650((byte) 121);
        class553.method3142((byte) -61);
        boolean var1 = false;
        for (int var2 = 0; var2 < class118.field1557; var2++) {
            int var5 = class640.field8888[var2];
            class706 var6 = (class706) class681.field9475.method2552((long) var5, -1);
            class215 var7 = var6.field9890;
            if (class83.field1156 && class164.method966(-128, var5)) {
                class198.method1096((byte) -53);
            }
            if (class558.field7854 != var7.field863) {
                if (var7.field2589.method1639((byte) 117)) {
                    class638.method3586(var7, -16255);
                }
                var7.method1200(null, 1);
                var6.method315(arg0 + 98);
                var1 = true;
            }
        }
        if (var1) {
            class12.field79 = class681.field9475.method2561((byte) -6);
            class681.field9475.method2554(class746.field10359, (byte) 74);
        }
        if (class488.field6682 != class569.field8012.field8520) {
            throw new RuntimeException("gnp1 pos:" + class569.field8012.field8520 + " psize:" + class488.field6682);
        }
        for (int var3 = 0; var3 < class84.field1169; var3++) {
            if (class681.field9475.method2552((long) class665.field9261[var3], -1) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class84.field1169);
            }
        }
        if (class12.field79 - class84.field1169 != arg0) {
            throw new RuntimeException("gnp3 mis:" + (class12.field79 - class84.field1169));
        }
        for (int var4 = 0; var4 < class12.field79; var4++) {
            if (class558.field7854 != class746.field10359[var4].field9890.field863) {
                throw new RuntimeException("gnp4 uk:" + class746.field10359[var4].field9890.field817);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 96)
    public static void method78(int arg0) {
        field125 = null;
        if (arg0 != -19351) {
            method78(-23);
        }
    }
}
