import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class462 extends class85 {

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field6422 = 0;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "[Lvi;")
    public static class370[] field6425 = new class370[0];

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
    public static final void method2828() {
        for (int var0 = 0; var0 < class323.field4472; ++var0) {
            class395 var1 = class529.field7337[var0];
            class192.method1185(var1, true);
            class529.field7337[var0] = null;
        }
        class323.field4472 = 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2829(int arg0, int arg1, byte arg2) {
        ++field6421;
        if (arg2 <= 72) {
            return false;
        } else {
            return class395.method2467(arg1, -11098, arg0) | (arg1 & 393216) != 0 || class133.method847(arg0, -6772, arg1);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
    public static final void method2830(int arg0, int arg1, int arg2) {
        boolean var3 = class137.field1948[0][arg1][arg2] != null && class137.field1948[0][arg1][arg2].field3847 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class137.field1948[var4][arg1][arg2] == null) {
                class262 var5 = class137.field1948[var4][arg1][arg2] = new class262(var4);
                if (var3) {
                    ++var5.field3852;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIBII)V")
    public final void method598(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 == 62) {
            ++field6423;
            int var6 = super.field1212.method1963();
            int var7 = ((class472) super.field2073).field6538 * class63.method450(false) / 10 % var6;
            super.field1212.method1964(-var6 + var7 + arg3, arg4, -var7 + var6 + arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Luu;Luu;Lbl;)V")
    public class462(class237 arg0, class237 arg1, class472 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static void method2831(int arg0) {
        if (arg0 != 0) {
            method2830(-8, -21, -9);
        }
        field6425 = null;
    }
}
