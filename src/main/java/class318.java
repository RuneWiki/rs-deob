import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class318 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lpi;")
    private class424 field4310;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lej;")
    public static class104 field4311 = new class104("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[I")
    public static int[] field4314 = new int[500];

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field4315 = 0;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Ldv;")
    public static class566 field4317 = new class566(19, 8);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lan;")
    public static class21 field4318;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static final void method1984(int arg0) {
        field4309++;
        for (class438 var1 = (class438) class311.field4187.method456((byte) -105); var1 != null; var1 = (class438) class311.field4187.method460((byte) -124)) {
            if (var1.field6214 > 0) {
                var1.field6214--;
            }
            if (var1.field6214 != 0) {
                if (var1.field6209 > 0) {
                    var1.field6209--;
                }
                if (var1.field6209 == 0 && var1.field6220 >= 1 && var1.field6213 >= 1 && (class32.field513 - 2) >= var1.field6220 && var1.field6213 <= class611.field8786 - 2 && (var1.field6217 < 0 || class384.method2255(var1.field6217, (byte) 126, var1.field6212))) {
                    class212.method1386(var1.field6212, var1.field6224, var1.field6220, var1.field6213, var1.field6222, arg0 - 23806, var1.field6216, var1.field6217, -1);
                    var1.field6209 = -1;
                    if (var1.field6217 == var1.field6215 && var1.field6215 == -1) {
                        var1.method1117(0);
                    } else if (var1.field6217 == var1.field6215 && var1.field6219 == var1.field6216 && var1.field6212 == var1.field6211) {
                        var1.method1117(arg0 + 1);
                    }
                }
            } else if (var1.field6215 < 0 || class384.method2255(var1.field6215, (byte) 18, var1.field6211)) {
                class212.method1386(var1.field6211, var1.field6224, var1.field6220, var1.field6213, var1.field6222, arg0 ^ 0x5CFE, var1.field6219, var1.field6215, -1);
                var1.method1117(0);
            }
        }
        if (arg0 != -1) {
            field4316 = 55;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static void method1985(int arg0) {
        field4318 = null;
        field4314 = null;
        field4317 = null;
        if (arg0 != 1288) {
            field4315 = 75;
        }
        field4311 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lpi;II)V")
    public class318(class424 arg0, int arg1, int arg2) {
        this.field4310 = arg0;
        this.field4312 = arg2;
    }

    @OriginalMember(owner = "client!oj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4310.method2530(118, this.field4312);
        field4313++;
        super.finalize();
    }
}
