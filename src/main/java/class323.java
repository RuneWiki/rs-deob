import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class323 extends class15 {

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lsd;")
    public static class74 field4662 = new class74(94, 15);

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "Lwb;")
    private class45 field4665;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Lg;")
    public static class470 field4673;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Ljava/awt/Font;")
    public static Font field4667;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "[Z")
    public static boolean[] field4671;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Ldl;")
    public static final class217 method1966(int arg0, int arg1) {
        field4669++;
        class217 var2 = (class217) class206.field2821.method1163((byte) 123, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class144.field1738.method2768(-20472, arg1, arg0);
        class217 var4 = new class217();
        if (var3 != null) {
            var4.method1218((byte) -86, new class179(var3));
        }
        var4.method1216(-101);
        class206.field2821.method1172((long) arg1, 1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lvt;II)V")
    private final void method1967(class179 arg0, int arg1, int arg2) {
        field4663++;
        if (arg1 == 249) {
            int var4 = arg0.method895((byte) -72);
            if (this.field4665 == null) {
                int var5 = class93.method459(-719824240, var4);
                this.field4665 = new class45(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method895((byte) -106) == 1;
                int var8 = arg0.method899((byte) -42);
                class147 var9;
                if (var7) {
                    var9 = new class373(arg0.method907(-27652));
                } else {
                    var9 = new class363(arg0.method939((byte) 99));
                }
                this.field4665.method234(-73, (long) var8, var9);
            }
        }
        if (arg2 != 21418) {
            this.field4665 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static void method1968(int arg0) {
        field4673 = null;
        if (arg0 == 0) {
            field4667 = null;
            field4671 = null;
            field4662 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)I")
    public final int method1969(byte arg0, int arg1, int arg2) {
        field4672++;
        if (this.field4665 == null) {
            return arg2;
        }
        if (arg0 != 115) {
            this.field4665 = null;
        }
        class363 var4 = (class363) this.field4665.method233(-90, (long) arg1);
        return var4 == null ? arg2 : var4.field5221;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
    public final String method1970(int arg0, byte arg1, String arg2) {
        field4664++;
        if (this.field4665 == null) {
            return arg2;
        } else if (arg1 == 20) {
            class373 var4 = (class373) this.field4665.method233(84, (long) arg0);
            return var4 == null ? arg2 : var4.field5332;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4668++;
        class41 var10 = null;
        for (class41 var11 = (class41) class56.field712.method802((byte) 103); var11 != null; var11 = (class41) class56.field712.method806((byte) 104)) {
            if (var11.field488 == arg5 && var11.field495 == arg7 && var11.field490 == arg0 && var11.field489 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class41();
            var10.field495 = arg7;
            var10.field489 = arg2;
            var10.field488 = arg5;
            var10.field490 = arg0;
            class456.method2687(var10, -4);
            class56.field712.method803(var10, 50);
        }
        var10.field487 = arg6;
        var10.field497 = arg9;
        var10.field481 = arg8;
        var10.field486 = arg3;
        var10.field483 = arg1;
        if (arg4 != -293447748) {
            field4673 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLvt;)V")
    public final void method1972(byte arg0, class179 arg1) {
        if (arg0 != 11) {
            this.method1967((class179) null, -36, 15);
        }
        while (true) {
            int var3 = arg1.method895((byte) -85);
            if (var3 == 0) {
                field4670++;
                return;
            }
            this.method1967(arg1, var3, 21418);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(BII)V")
    public static final void method1973(byte arg0, int arg1, int arg2) {
        field4666++;
        class45 var3 = new class45(16);
        for (class173 var4 = (class173) class76.field913.method241(0); var4 != null; var4 = (class173) class76.field913.method239(0)) {
            var4.method702((byte) -114);
            int var6 = (int) (var4.field1776 >> 28);
            int var7 = (int) (var4.field1776 >> 14 & 0x3FFFL) - arg2;
            int var8 = (int) (var4.field1776 & 0x3FFFL) - arg1;
            if (var8 >= 0 && var7 >= 0 && var8 < class159.field1895 && var7 < class289.field4316) {
                var3.method234(-104, (long) (var6 << 28 | var7 << 14 | var8), var4);
            }
        }
        class76.field913 = var3;
        int var5 = 19 / ((arg0 + 33) / 33);
    }

    static {
        new class40("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }
}
