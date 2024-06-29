import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class711 {

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "[I")
    public static int[] field10011 = new int[4096];

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public int field10002;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public int field10008;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public int field10009;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "Lha;")
    public static class66 field10005;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "Z")
    public boolean field10003;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "Z")
    public boolean field10006;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "[Lqda;")
    public static class112[] field10007;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static final void method4023(int arg0) {
        field10010++;
        if (arg0 != -29049) {
            method4025(-74);
        }
        class203.field2970.method387(-21125);
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
    public static void method4024(int arg0) {
        field10005 = null;
        if (arg0 != 3) {
            method4024(95);
        }
        field10011 = null;
        field10007 = null;
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V")
    public static final void method4025(int arg0) {
        field10004++;
        class29 var1 = null;
        try {
            var1 = class590.method3424("2", (byte) 73);
            if (arg0 != -20081) {
                return;
            }
            class120 var2 = new class120(class132.field1728 * 6 + 3);
            var2.method851((byte) -2, 1);
            var2.method860(class132.field1728, (byte) 123);
            for (int var3 = 0; var3 < class604.field8499.length; var3++) {
                if (class9.field127[var3]) {
                    var2.method860(var3, (byte) 125);
                    var2.method879((byte) 69, class604.field8499[var3]);
                }
            }
            var1.method209(false, var2.field1521, 0, var2.field1556);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method210(14471);
            }
        } catch (Exception var4) {
        }
        class696.field9827 = class109.method731(arg0 + 20110);
        class387.field5502 = false;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field10011[var0] = class549.method3185(var0, (byte) -73);
        }
    }
}
