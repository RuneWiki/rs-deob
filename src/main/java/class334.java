import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class334 {

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "J")
    public static long field5154 = 0L;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    private int field5153;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public int field5160;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Lkl;")
    public class100 field5159;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Ltc;")
    public static class359 field5152;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "[I")
    public static int[] field5157;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ltl;B)V", line = 5)
    public final void method2145(class91 arg0, byte arg1) {
        field5156++;
        if (arg1 != 76) {
            this.method2148(-65, null, 109);
        }
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                return;
            }
            this.method2148(var3, arg0, arg1 - 171);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 25)
    public static void method2146(int arg0) {
        field5157 = null;
        field5152 = null;
        if (arg0 != 1) {
            field5152 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Lrl;", line = 46)
    public final synchronized class476 method2147(int arg0) {
        field5155++;
        class476 var2 = (class476) this.field5159.field1446.method1013((long) this.field5153, (byte) -106);
        if (var2 != null) {
            return var2;
        }
        class476 var3 = class476.method2845(this.field5159.field1436, this.field5153, arg0);
        if (var3 != null) {
            this.field5159.field1446.method1012(-97, (long) this.field5153, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILtl;I)V", line = 64)
    private final void method2148(int arg0, class91 arg1, int arg2) {
        field5158++;
        if (arg0 == 1) {
            this.field5153 = arg1.method631(10494);
        } else if (arg0 == 2) {
            this.field5160 = arg1.method618((byte) 100);
            this.field5161 = arg1.method618((byte) 100);
        }
        int var4 = -128 / ((-arg2 - 46) / 42);
    }
}
