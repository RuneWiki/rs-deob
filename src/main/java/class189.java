import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class189 extends class476 {

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ljava/lang/String;")
    public String field2777;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "F")
    public static float field2780;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 9)
    public static final void method1260(int arg0) {
        field2779++;
        if (arg0 != 24391) {
            field2780 = 0.9893819F;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class9.field111; var2++) {
            for (int var3 = 0; var3 < class192.field2809; var3++) {
                if (class390.method2312(true, arg0 ^ 0x925F47, var3, var1, var2, class103.field1632)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 43)
    public class189() {
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 45)
    public class189(String arg0) {
        this.field2777 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLdc;)V", line = 55)
    public static final void method1261(boolean arg0, class16 arg1) {
        field2781++;
        int var2 = arg1.field160 - class28.field417;
        int var3 = arg1.field170 * 128 + arg1.method116(8569) * 64;
        int var4 = arg1.field184 * 128 + arg1.method116(8569) * 64;
        arg1.field6284 += (var3 - arg1.field6284) / var2;
        arg1.field266 = 0;
        arg1.field6287 += (var4 - arg1.field6287) / var2;
        if (arg1.field190 == 0) {
            arg1.method110(8192, (byte) -98);
        }
        if (arg1.field190 == 1) {
            arg1.method110(12288, (byte) -116);
        }
        if (!arg0) {
            field2780 = 0.17095499F;
        }
        if (arg1.field190 == 2) {
            arg1.method110(0, (byte) -95);
        }
        if (arg1.field190 == 3) {
            arg1.method110(4096, (byte) -83);
        }
    }
}
