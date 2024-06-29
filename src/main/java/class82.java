import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class82 extends class170 {

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public int field1134 = 0;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lij;")
    public static class316 field1136;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[Ldn;")
    public static class323[] field1130;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILrg;)V", line = 3)
    public final void method659(int arg0, class366 arg1) {
        while (true) {
            int var3 = arg1.method2306((byte) 52);
            if (var3 == 0) {
                field1131++;
                if (arg0 != -1) {
                    method662(73, (String) null);
                    return;
                }
                return;
            }
            this.method660(var3, arg1, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILrg;B)V", line = 29)
    private final void method660(int arg0, class366 arg1, byte arg2) {
        field1137++;
        if (arg0 == 2) {
            this.field1134 = arg1.method2297(arg2 + 13389);
        }
        if (arg2 != -37) {
            this.field1134 = -26;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)Lqg;", line = 46)
    public static final class157 method661(int arg0) {
        field1133++;
        if (class333.field4500 == null || class398.field5506 == null) {
            return null;
        } else if (arg0 == 2) {
            for (class157 var1 = (class157) class398.field5506.method2573(-126); var1 != null; var1 = (class157) class398.field5506.method2573(-128)) {
                class430 var2 = class204.method1389(var1.field2229, 37);
                if (var2 != null && var2.field5993 && var2.method2650((byte) 40)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;)I", line = 74)
    public static final int method662(int arg0, String arg1) {
        field1132++;
        if (arg0 != 12189) {
            field1135 = -22;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V", line = 95)
    public static void method663(boolean arg0) {
        field1130 = null;
        if (!arg0) {
            field1136 = null;
        }
    }
}
