import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class541 extends class588 {

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    public static int field7568 = 0;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "Lei;")
    public static class331 field7563 = new class331();

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public int field7569;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    public int field7570;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
    public int field7571;

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "Llb;")
    public class239 field7572;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "[Leca;")
    public class378[] field7564;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public static void method3001(int arg0) {
        field7563 = null;
        if (arg0 != 1) {
            method3002(-61, 31, -67);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)I")
    public static final int method3002(int arg0, int arg1, int arg2) {
        field7565++;
        int var3 = class191.method1221(Integer.MAX_VALUE, arg2 - 1, arg0 + -1) + class191.method1221(Integer.MAX_VALUE, arg2 + 1, arg0 - arg1) + class191.method1221(Integer.MAX_VALUE, arg2 - 1, arg0 + 1) + class191.method1221(arg1 ^ 0x7FFFFFFE, arg2 - -1, arg0 + 1);
        int var4 = class191.method1221(Integer.MAX_VALUE, arg2 - 1, arg0) - (-class191.method1221(Integer.MAX_VALUE, arg2 + 1, arg0) - (class191.method1221(Integer.MAX_VALUE, arg2, arg0 - 1) + class191.method1221(arg1 ^ 0x7FFFFFFE, arg2, arg0 + 1)));
        int var5 = class191.method1221(Integer.MAX_VALUE, arg2, arg0);
        return var4 / 8 + (var3 / 16 + (var5 / 4));
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBLqa;I)Z")
    public final boolean method3003(int arg0, byte arg1, class167 arg2, int arg3) {
        if (arg1 != -98) {
            return false;
        }
        field7561++;
        if (this.field7564 != null) {
            for (int var5 = 0; var5 < this.field7564.length; var5++) {
                if (this.field7564[var5].method2306(arg0, arg3) && this.field7572.method63(arg0, arg3, arg2, arg1 ^ 0x1C)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)Z")
    public static final boolean method3004(int arg0) {
        field7562++;
        try {
            if (class463.field6597 == 2) {
                if (class449.field6352 == null) {
                    class449.field6352 = class482.method2726(class217.field2773, class474.field6695, class341.field4743);
                    if (class449.field6352 == null) {
                        return false;
                    }
                }
                if (class387.field5386 == null) {
                    class387.field5386 = new class633(class620.field8931, class171.field2197);
                }
                if (class115.field1466.method2093(class633.field9213, class387.field5386, -115, class449.field6352, 22050)) {
                    class115.field1466.method2117(31034);
                    class115.field1466.method2099((byte) -118, class148.field1917);
                    class115.field1466.method2096(class236.field3031, (byte) 91, class449.field6352);
                    class463.field6597 = 0;
                    class387.field5386 = null;
                    class449.field6352 = null;
                    class217.field2773 = null;
                    return true;
                }
            }
            if (arg0 != 22050) {
                method3002(-2, -1, -40);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class115.field1466.method2098((byte) 124);
            class449.field6352 = null;
            class387.field5386 = null;
            class217.field2773 = null;
            class463.field6597 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
    public static final void method3005(int arg0) {
        class555.method3110();
        field7567++;
        int var1 = 0;
        int var2 = 56 / ((-arg0 - 39) / 55);
        while (var1 < 4) {
            class15.field154[var1].method785(2097152);
            var1++;
        }
        class317.method1979((byte) 126);
        class485.method2738(14);
        System.gc();
    }
}
