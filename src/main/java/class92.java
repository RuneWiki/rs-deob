import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class92 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1553 = new String[100];

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[Z")
    public static boolean[] field1560 = new boolean[200];

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Z")
    public static boolean field1558;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 4)
    public static final void method724(boolean arg0, Component arg1) {
        field1554++;
        Method var2 = class145.field2361;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class52.field832);
        arg1.addFocusListener(class52.field832);
        if (!arg0) {
            field1553 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 30)
    public static void method725(int arg0) {
        field1553 = null;
        if (arg0 == 1371294444) {
            field1560 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I", line = 49)
    public static final int method726(int arg0, int arg1) {
        field1557++;
        int var2 = -119 % ((arg1 - 66) / 47);
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = arg0 * 6 - 61440;
        int var5 = (arg0 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V", line = 68)
    public static final void method727(int arg0, int arg1) {
        field1555++;
        class209.field3298 = arg0;
        class248.method1909((byte) -16, 3);
        class248.method1909((byte) -16, arg1);
    }
}
