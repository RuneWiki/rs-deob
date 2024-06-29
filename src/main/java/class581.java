import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class581 extends class152 {

    @OriginalMember(owner = "client!jw", name = "E", descriptor = "Ljava/lang/String;")
    public String field7922;

    @OriginalMember(owner = "client!jw", name = "H", descriptor = "Lut;")
    public class136 field7925;

    @OriginalMember(owner = "client!jw", name = "x", descriptor = "I")
    public static int field7916 = 0;

    @OriginalMember(owner = "client!jw", name = "A", descriptor = "[S")
    private static short[] field7919 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!jw", name = "F", descriptor = "[S")
    private static short[] field7923 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!jw", name = "M", descriptor = "[S")
    private static short[] field7929 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!jw", name = "L", descriptor = "[S")
    private static short[] field7928 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!jw", name = "y", descriptor = "[[S")
    public static short[][] field7917 = new short[][] { field7928, field7919, field7923, field7929 };

    @OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!jw", name = "w", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!jw", name = "C", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!jw", name = "D", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!jw", name = "J", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!jw", name = "K", descriptor = "I")
    public int field7927;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V", line = 3)
    public static void method3345(byte arg0) {
        field7929 = null;
        if (arg0 > -52) {
            field7921 = -40;
        }
        field7917 = null;
        field7928 = null;
        field7923 = null;
        field7919 = null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILqh;)Z", line = 21)
    public final boolean method3346(int arg0, class75 arg1) {
        if (arg0 != 19143) {
            this.method3349(-119, null);
        }
        field7915++;
        int var3 = this.method3348(26488);
        arg1.method1088(4);
        this.field7927--;
        if (this.field7927 != 0) {
            return var3 != this.method3348(arg0 ^ 0x2DBF);
        }
        this.method2219(arg0 - 5513);
        this.method1088(arg0 ^ 0x4AC3);
        class282.field3279--;
        class488.field6822.method1686(-25638, arg1.field1024, this);
        return false;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(Z)Lke;", line = 56)
    public static final class625 method3347(boolean arg0) {
        field7914++;
        if (class9.field156 == null || class760.field10517 == null) {
            return null;
        } else if (arg0) {
            for (class625 var1 = (class625) class760.field10517.method3135((byte) 101); var1 != null; var1 = (class625) class760.field10517.method3135((byte) 83)) {
                class305 var2 = class9.field143.method4140(36, var1.field8567);
                if (var2 != null && var2.field3629 && var2.method1763((byte) 126, class9.field146)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I", line = 86)
    public final int method3348(int arg0) {
        field7920++;
        if (this.field7925.field1703.field1903 == this.field7925.field1703) {
            return arg0 == 26488 ? -1 : -5;
        } else {
            return ((class75) this.field7925.field1703.field1903).field1029;
        }
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(ILqh;)Z", line = 108)
    public final boolean method3349(int arg0, class75 arg1) {
        field7926++;
        arg1.method1088(arg0 ^ 0x4FB9);
        boolean var3 = true;
        for (class75 var4 = (class75) this.field7925.method1003((byte) 53); var4 != null; var4 = (class75) this.field7925.method1004(true)) {
            if (class424.method2536((byte) 123, arg1.field1029, var4.field1029)) {
                class159.method1117((byte) -62, var4, arg1);
                this.field7927++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var3 = false;
        }
        this.field7925.method1005(-26, arg1);
        this.field7927++;
        if (arg0 != 20413) {
            field7923 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 140)
    public class581(String arg0) {
        this.field7922 = arg0;
        this.field7925 = new class136();
    }
}
