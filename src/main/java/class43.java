import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class43 extends class181 {

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Lpj;")
    public static class284 field764 = new class284();

    @OriginalMember(owner = "client!r", name = "N", descriptor = "Ljava/lang/String;")
    public static String field770 = "";

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "Lpk;")
    public static class237 field769;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Ljk;")
    public class297 field750;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Ljk;")
    public class297 field756;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Ljava/lang/String;")
    public String field766;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Z")
    public boolean field761;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "[Ljava/lang/Object;")
    public Object[] field767;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)V")
    public static final void method347(int arg0, int arg1) {
        if (arg0 == -161) {
            class231.field3576.method938(arg1, (byte) -123);
            field760++;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static void method348(int arg0) {
        if (arg0 == 338) {
            field769 = null;
            field764 = null;
            field770 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZIIIIIII)V")
    public static final void method349(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg3 - arg1;
        field755++;
        int var11 = 93 % ((arg0 + 4) / 33);
        int var12 = arg7 - arg6;
        int var13 = (arg5 - arg9 << 16) / var12;
        int var14 = (arg8 - arg4 << 16) / var10;
        class163.method1106(arg3, 0, arg1, arg7, arg9, arg4, arg6, 0, arg2, var14, true, var13);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(CI)Z")
    public static final boolean method350(char arg0, int arg1) {
        field763++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            int var2 = 72 % ((5 - arg1) / 54);
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field758++;
        for (int var6 = arg4; var6 <= arg5; var6++) {
            class222.method1519((byte) -116, arg1, class241.field3751[var6], arg2, arg0);
        }
        if (arg3 != 0) {
            field769 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)Lbk;")
    public static final class46 method352(int arg0) {
        if (arg0 != 31488) {
            method348(-113);
        }
        field751++;
        class46 var1 = new class46(client.field729, class126.field1857, class135.field1973[0], class5.field69[0], class27.field525[0], class173.field2530[0], class209.field3125[0], class15.field221);
        class293.method1936(-105);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ldg;I)V")
    public static final void method353(class87 arg0, int arg1) {
        field768++;
        for (class269 var2 = (class269) class256.field3947.method1894((byte) -90); var2 != null; var2 = (class269) class256.field3947.method1886(-62)) {
            if (var2.field4208 == arg0) {
                if (var2.field4198 != null) {
                    class108.field1581.method908(var2.field4198);
                    var2.field4198 = null;
                }
                var2.method1193(116);
                return;
            }
        }
        if (arg1 != -8213) {
            method352(20);
        }
    }
}
