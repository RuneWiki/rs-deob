import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class238 extends class237 {

    @OriginalMember(owner = "client!re", name = "q", descriptor = "J")
    public long field3930;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[C")
    public static char[] field3929 = new char[128];

    @OriginalMember(owner = "client!re", name = "s", descriptor = "[S")
    public static short[] field3932 = new short[256];

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3937 = "Please remove ";

    @OriginalMember(owner = "client!re", name = "t", descriptor = "F")
    public static float field3933 = 128.0F;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field3938 = 0;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "[I")
    public static int[] field3939 = new int[2500];

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Leh;")
    public static class137 field3935;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lml;")
    public static class148 field3928;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "[[B")
    public static byte[][] field3936;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public static void method1679(byte arg0) {
        int var1 = -22 % ((-arg0 - 20) / 51);
        field3929 = null;
        field3935 = null;
        field3932 = null;
        field3937 = null;
        field3939 = null;
        field3936 = null;
        field3928 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class238() {
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(J)V")
    public class238(long arg0) {
        this.field3930 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static final void method1680(boolean arg0) {
        field3927++;
        try {
            if (arg0 && class190.field3070 == 1) {
                int var1 = class67.field848.method1070(arg0);
                if (var1 > 0 && class67.field848.method1059(127)) {
                    int var2 = var1 - class112.field1598;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class67.field848.method1068((byte) -76, var2);
                } else {
                    class67.field848.method1062(16);
                    class67.field848.method1060((byte) 68);
                    class187.field2978 = null;
                    if (class160.field2558 == null) {
                        class190.field3070 = 0;
                    } else {
                        class190.field3070 = 2;
                    }
                    class285.field4545 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class67.field848.method1062(16);
            class285.field4545 = null;
            class190.field3070 = 0;
            class160.field2558 = null;
            class187.field2978 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B[I)[I")
    public static final int[] method1681(byte arg0, int[] arg1) {
        field3931++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        if (arg0 < 16) {
            return null;
        } else {
            class72.method407(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
