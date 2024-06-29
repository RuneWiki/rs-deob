import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 extends class70 {

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field627 = new Hashtable();

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "Lfja;")
    public static class783 field628 = new class783(36, 6);

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "D")
    public static double field633;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field631++;
        int var5 = 0;
        int var6 = arg4;
        if (arg0 != -28223) {
            field633 = 0.8516463048039586D;
        }
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class748.method4155(class268.field3766, 16, arg2 + arg4, class236.field3392);
        int var10 = class748.method4155(class268.field3766, 16, arg2 - arg4, class236.field3392);
        class679.method3826(class298.field4105[arg3], var9, 11, var10, arg1);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class223.field3260 && var11 <= class706.field9700) {
                    int var13 = class748.method4155(class268.field3766, 16, arg2 + var5, class236.field3392);
                    int var14 = class748.method4155(class268.field3766, 16, arg2 - var5, class236.field3392);
                    if (var12 <= class706.field9700) {
                        class679.method3826(class298.field4105[var12], var13, 11, var14, arg1);
                    }
                    if (var11 >= class223.field3260) {
                        class679.method3826(class298.field4105[var11], var13, 11, var14, arg1);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class223.field3260 <= var16 && var15 <= class706.field9700) {
                int var17 = class748.method4155(class268.field3766, 16, arg2 + var6, class236.field3392);
                int var18 = class748.method4155(class268.field3766, 16, arg2 - var6, class236.field3392);
                if (class706.field9700 >= var16) {
                    class679.method3826(class298.field4105[var16], var17, 11, var18, arg1);
                }
                if (class223.field3260 <= var15) {
                    class679.method3826(class298.field4105[var15], var17, 11, var18, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Laca;", line = 80)
    public final class758 method228(int arg0) {
        if (arg0 != 1) {
            method232((byte) 74);
        }
        field635++;
        return class492.field6767;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Leaa;Lcq;IIIIIIIIII)V", line = 92)
    public class37(class528 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field634 = arg11;
        this.field632 = arg10;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z", line = 104)
    public static final boolean method229(int arg0, int arg1) {
        if (arg1 != -7) {
            field633 = 0.40020780098501624D;
        }
        field630++;
        return arg0 == 23 || arg0 == 2 || arg0 == 1001 || arg0 == 8 || arg0 == 6;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V", line = 115)
    public static void method230(int arg0) {
        field628 = null;
        field627 = null;
        if (arg0 != -4030) {
            method231((byte) -70, 32, -24);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)V", line = 141)
    public static final void method231(byte arg0, int arg1, int arg2) {
        field636++;
        if (arg0 != -15) {
            field628 = null;
        }
        class281 var3 = class54.method395((byte) -53, (long) arg2, 6);
        var3.method1821((byte) -127);
        var3.field3910 = arg1;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 159)
    public static final void method232(byte arg0) {
        field629++;
        if (class286.field3936 == null) {
            return;
        }
        try {
            String var1 = class286.field3936.getParameter("cookiehost");
            int var2 = (int) (class197.method1423(1) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class729.method4042((byte) 101, "document.cookie=\"" + var3 + "\"", class286.field3936);
        } catch (Throwable var4) {
        }
        if (arg0 > -109) {
            field633 = 0.8050395265286052D;
        }
    }
}
