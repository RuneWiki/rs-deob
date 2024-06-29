import java.awt.Component;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class266 {

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Le;")
    public static class191 field4706 = class54.method368("Lade Konfiguration )2 ", 2047);

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Le;")
    public static class191 field4701 = class54.method368("Nehmen", 2047);

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Le;")
    private static class191 field4710 = class54.method368("Use", 2047);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Le;")
    public static class191 field4708 = field4710;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4700 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field4714 = -1;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
    public static int[] field4711 = new int[100];

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[Le;")
    public static class191[] field4713 = new class191[1000];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lqk;")
    public static class6 field4712;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method1824(byte arg0) {
        field4712 = null;
        field4701 = null;
        if (arg0 != 96) {
            method1825((byte) 34);
        }
        field4700 = null;
        field4706 = null;
        field4713 = null;
        field4711 = null;
        field4710 = null;
        field4708 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static final void method1825(byte arg0) {
        field4703++;
        if (arg0 > -74) {
            method1830(32, 17);
        }
        if (!class197.field3523) {
            return;
        }
        class33 var1 = class10.method74(class3.field21, class36.field659, (byte) 4);
        if (var1 != null && var1.field594 != null) {
            class61 var2 = new class61();
            var2.field1101 = var1.field594;
            var2.field1089 = var1;
            class12.method87(var2, -12934);
        }
        class197.field3523 = false;
        class184.method1238(var1, (byte) -118);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static final void method1826(boolean arg0) {
        field4702++;
        class79.field1350 = 0;
        class90.field1460 = 0;
        class189.method1299(0);
        class99.method620(84);
        class27.method197(124);
        for (int var1 = 0; var1 < class79.field1350; var1++) {
            int var3 = class54.field1012[var1];
            if (class135.field2267 != class115.field1901[var3].field2992) {
                if (class115.field1901[var3].field2663.method1241(-1)) {
                    class111.method715(-2854, class115.field1901[var3]);
                }
                class115.field1901[var3].field2663 = null;
                class115.field1901[var3] = null;
            }
        }
        if (class253.field4486 != class107.field1776.field3996) {
            throw new RuntimeException("gnp1 pos:" + class107.field1776.field3996 + " psize:" + class253.field4486);
        }
        for (int var2 = 0; var2 < class197.field3514; var2++) {
            if (class115.field1901[class256.field4542[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class197.field3514);
            }
        }
        if (arg0) {
            field4701 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lji;I)Lsc;")
    public static final class124 method1827(class225 arg0, int arg1) {
        field4707++;
        if (arg1 > -14) {
            method1831((Component) null, (byte) 91);
        }
        arg0.method1580(-59);
        int var2 = arg0.method1580(-61);
        class124 var3 = class233.method1651((byte) -99, var2);
        var3.field2050 = arg0.method1580(-91);
        int var4 = arg0.method1580(-110);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1580(-100);
            var3.method136(var6, arg0, true);
        }
        var3.method451(-1);
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method1828(byte[] arg0, byte arg1, boolean arg2) {
        field4704++;
        if (arg1 != -13) {
            field4706 = null;
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class130.field2173) {
            try {
                class42 var3 = (class42) Class.forName("ta").getDeclaredConstructor().newInstance();
                var3.method277(arg0, -106);
                return var3;
            } catch (Throwable var4) {
                class130.field2173 = true;
            }
        }
        return arg2 ? class26.method187(arg0, -128) : arg0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public static final void method1830(int arg0, int arg1) {
        class225.field4008 = arg1;
        class30.field420 = arg0;
        field4705++;
        class270.field4767 = -1;
        class185.method1256(0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1831(Component arg0, byte arg1) {
        Method var2 = class247.field4386;
        if (arg1 != 12) {
            field4701 = null;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        field4699++;
        arg0.addKeyListener(class229.field4119);
        arg0.addFocusListener(class229.field4119);
    }
}
