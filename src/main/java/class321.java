import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class321 extends class301 {

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field5215 = 0;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "C")
    private char field5217;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public int field5223;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Ll;")
    public static class328 field5219;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Ljava/lang/String;")
    public String field5222;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "[I")
    public static int[] field5218;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 16)
    public static final void method2307(boolean arg0, Component arg1) {
        if (arg0) {
            field5215 = 21;
        }
        field5221++;
        Method var2 = class157.field2666;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class181.field3149);
        arg1.addFocusListener(class181.field3149);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILoe;)V", line = 42)
    public final void method2308(int arg0, class146 arg1) {
        while (true) {
            int var3 = arg1.method1005((byte) 122);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.field5222 = (String) null;
                }
                field5213++;
                return;
            }
            this.method2310((byte) 5, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 62)
    public static final int method2309(byte arg0, String arg1) {
        field5220++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class151.field2550; var2++) {
            if (arg1.equalsIgnoreCase(class91.field1610[var2])) {
                return var2;
            }
        }
        if (arg0 != -94) {
            method2309((byte) 112, (String) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLoe;I)V", line = 89)
    private final void method2310(byte arg0, class146 arg1, int arg2) {
        if (arg0 != 5) {
            this.method2311(-86);
        }
        field5216++;
        if (arg2 == 1) {
            this.field5217 = class251.method1768((byte) 122, arg1.method1029(arg0 - 7));
        } else if (arg2 == 2) {
            this.field5223 = arg1.method1004(arg0 - 2);
        } else if (arg2 == 5) {
            this.field5222 = arg1.method1017((byte) -125);
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)Z", line = 121)
    public final boolean method2311(int arg0) {
        int var2 = -18 / ((51 - arg0) / 36);
        field5214++;
        return this.field5217 == 's';
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V", line = 130)
    public static void method2312(boolean arg0) {
        field5219 = null;
        field5218 = null;
        if (!arg0) {
            field5219 = (class328) null;
        }
    }
}
