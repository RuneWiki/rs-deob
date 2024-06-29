import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class271 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lqk;")
    public static class207 field4786 = class24.method212(255, "(U4");

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "[[[B")
    public static byte[][][] field4791 = new byte[4][104][104];

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[Lml;")
    public static class287[] field4789 = new class287[14];

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Lqk;")
    public static class207 field4790 = class24.method212(255, ")4a=");

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static final void method1847(int arg0) {
        field4784++;
        class65.field1165.method1390((byte) 117);
        if (arg0 != 104) {
            method1848((byte[]) null, false, -56);
        }
        class115.field1993.method1390((byte) 127);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method1848(byte[] arg0, boolean arg1, int arg2) {
        field4787++;
        if (arg2 != 14) {
            method1848((byte[]) null, true, 17);
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class105.field1867) {
            try {
                class193 var3 = (class193) Class.forName("vj").getDeclaredConstructor().newInstance();
                var3.method812(-121, arg0);
                return var3;
            } catch (Throwable var4) {
                class105.field1867 = true;
            }
        }
        return arg1 ? class225.method1591(arg2 - 132, arg0) : arg0;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method1849(int arg0) {
        field4786 = null;
        field4789 = null;
        field4791 = null;
        field4790 = null;
        if (arg0 < 34) {
            method1849(28);
        }
    }
}
