import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class314 {

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4857 = "Unable to find ";

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lbi;")
    public static class145 field4853;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lrn;")
    public static class18 field4861;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lia;")
    private class320 field4854;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lmm;")
    private class43 field4862;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2218(int arg0) {
        field4859++;
        if (arg0 > -20) {
            field4855 = 104;
        }
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class121.field1889 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 35)
    public static void method2219(byte arg0) {
        field4857 = null;
        field4861 = null;
        field4853 = null;
        if (arg0 != -9) {
            method2218(24);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILmm;)V", line = 52)
    public final void method2220(int arg0, class43 arg1) {
        field4852++;
        if (arg0 != -2) {
            method2219((byte) 118);
        }
        this.field4862 = arg1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)Lia;", line = 65)
    public final class320 method2221(boolean arg0) {
        class320 var2 = this.field4854;
        if (!arg0) {
            this.method2223(true);
        }
        field4856++;
        if (this.field4862.field679 == var2) {
            this.field4854 = null;
            return null;
        } else {
            this.field4854 = var2.field4934;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V", line = 101)
    public static final void method2222(int arg0, int arg1) {
        field4851++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class292.method2111(253);
        } else if (arg1 == 2) {
            class112.method962(8);
        } else if (arg1 == 3) {
            class190.method1453(0);
        } else {
            throw new RuntimeException();
        }
        int var2 = 127 % ((-arg0 - 23) / 48);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)Lia;", line = 127)
    public final class320 method2223(boolean arg0) {
        field4860++;
        class320 var2 = this.field4862.field679.field4934;
        if (this.field4862.field679 == var2) {
            this.field4854 = null;
            return null;
        }
        this.field4854 = var2.field4934;
        if (arg0) {
            field4857 = (String) null;
        }
        return var2;
    }
}
