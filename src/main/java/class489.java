import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class489 {

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public int field7155;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lmm;")
    public static class255 field7154;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method2994(int arg0, int arg1, int arg2, int arg3) {
        field7156++;
        int var4 = arg2 / arg1;
        int var5 = arg2 & arg1 - 1;
        int var6 = arg3 / arg1;
        int var7 = arg1 - 1 & arg3;
        int var8 = class271.method1914(var6, true, var4);
        int var9 = class271.method1914(var6, true, var4 + 1);
        int var10 = class271.method1914(var6 + 1, true, var4);
        int var11 = class271.method1914(var6 + 1, true, var4 - arg0);
        int var12 = class486.method2977(arg1, var9, var8, var5, false);
        int var13 = class486.method2977(arg1, var11, var10, var5, false);
        return class486.method2977(arg1, var13, var12, var7, false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 32)
    public static void method2995(int arg0) {
        if (arg0 != -19975) {
            field7154 = null;
        }
        field7154 = null;
    }

    @OriginalMember(owner = "client!hl", name = "toString", descriptor = "()Ljava/lang/String;", line = 51)
    public final String toString() {
        field7158++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V", line = 58)
    public class489(int arg0, int arg1) {
        this.field7155 = arg0;
    }
}
