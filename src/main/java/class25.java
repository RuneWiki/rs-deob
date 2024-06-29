import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class25 extends class181 {

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field319 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Lr;")
    public static class66 field324 = class93.method641(43, "<col=ff0000>");

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "[Lr;")
    public static class66[] field325 = new class66[500];

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "[I")
    public static int[] field323;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
    public static void method108(boolean arg0) {
        field324 = null;
        if (!arg0) {
            field319 = null;
            field325 = null;
            field323 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I")
    public static final int method109(byte arg0) {
        field322++;
        int var1 = -121 / ((arg0 + 31) / 48);
        return 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method110(int arg0, Component arg1) {
        if (arg0 <= -7) {
            field318++;
            arg1.removeKeyListener(class218.field3747);
            arg1.removeFocusListener(class218.field3747);
            class9.field90 = -1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)Lic;")
    public static final class197 method111(byte arg0) {
        field320++;
        class197 var1 = (class197) class98.field1921.method1132(1742);
        if (var1 != null) {
            var1.method560(-17554);
            var1.method704((byte) 73);
            return var1;
        }
        if (arg0 != 37) {
            field319 = null;
        }
        class197 var2;
        do {
            var2 = (class197) class19.field251.method1132(arg0 + 1705);
            if (var2 == null) {
                return null;
            }
            if (var2.method1285(arg0 + 218) > class3.method13(17161)) {
                return null;
            }
            var2.method560(-17554);
            var2.method704((byte) 73);
        } while ((var2.field1990 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
