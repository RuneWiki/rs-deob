import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class549 extends class263 {

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public int field6887 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field6885 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public int field6891 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field6882 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field6888 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public int field6892 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public int field6894 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public int field6893 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lfca;")
    public class79 field6886;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lcga;")
    public static class449 field6890 = new class449(71, -1);

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field6889;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field6895;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2940(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2934(byte arg0) {
        if (arg0 == 26) {
            field6881++;
            class110.field1374 = false;
            class95.field1236 = null;
            class377.method2172(100);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BII)Z", line = 20)
    public static final boolean method2935(byte arg0, int arg1, int arg2) {
        int var3 = 116 / ((23 - arg0) / 60);
        field6880++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ICI)I", line = 34)
    public static final int method2936(int arg0, char arg1, int arg2) {
        field6889++;
        if (arg0 != -1191559388) {
            field6890 = null;
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lfca;)V", line = 146)
    public class549(class79 arg0) {
        this.field6886 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V", line = 62)
    public static void method2937(byte arg0) {
        if (arg0 != 103) {
            field6890 = null;
        }
        field6890 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 74)
    public static final void method2938(int arg0) {
        if (arg0 != 0) {
            return;
        }
        try {
            Method var1 = (field6895 == null ? (field6895 = method2940("java.lang.Runtime")) : field6895).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class552.field6914 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field6884++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZII)Z", line = 115)
    public final boolean method2939(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2936(117, (char) 65421, 29);
        }
        field6883++;
        if (this.field6893 <= arg1 && this.field6891 >= arg1 && this.field6882 <= arg2 && this.field6888 >= arg2) {
            return true;
        } else {
            return this.field6894 <= arg1 && this.field6885 >= arg1 && arg2 >= this.field6892 && this.field6887 >= arg2;
        }
    }
}
