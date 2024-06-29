import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class68 extends class577 {

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Ljava/lang/String;")
    public String field825;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lso;I)Leia;", line = 5)
    public static final class253 method576(class494 arg0, int arg1) {
        field824++;
        class706 var2 = class259.method1689((byte) 4, arg0);
        int var3 = arg0.method2998(true);
        if (arg1 <= 92) {
            method576(null, 54);
        }
        int var4 = arg0.method2998(true);
        int var5 = arg0.method2998(true);
        int var6 = arg0.method2998(true);
        int var7 = arg0.method2998(true);
        int var8 = arg0.method2998(true);
        return new class253(var2.field9843, var2.field9845, var2.field9838, var2.field9832, var2.field9833, var2.field9837, var2.field9834, var2.field9840, var2.field9835, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 31)
    public class68() {
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 33)
    public class68(String arg0) {
        this.field825 = arg0;
    }
}
