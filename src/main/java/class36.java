import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class36 {

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "Lin;")
    public static class380 field431 = new class380(88, 10);

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "[I")
    public static int[] field433 = new int[4096];

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(FB)F", line = 3)
    public static final float method278(float arg0, byte arg1) {
        if (arg1 > -28) {
            method281(null, true, 60, 6);
        }
        field430++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 14)
    public static final void method279(String arg0, int arg1) {
        field428++;
        if (class288.field4217 == null) {
            return;
        }
        if (arg1 != -17462) {
            field433 = null;
        }
        class269.field3799++;
        class302 var2 = class582.method3419(class112.field1623, (byte) 125, class626.field8901);
        var2.field4341.method2524(false, class389.method2339(arg0, true));
        var2.field4341.method2566(-2, arg0);
        class501.method2928(0, var2);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Z)V", line = 34)
    public static void method280(boolean arg0) {
        field433 = null;
        field431 = null;
        if (!arg0) {
            field433 = null;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lha;ZII)Lda;", line = 46)
    public static final class443 method281(class475 arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 != 6) {
            field432 = 27;
        }
        field429++;
        class406 var4 = class504.method2948(arg1, arg0, arg2, -1);
        return var4 == null ? null : var4.field5587;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)Laia;", line = 69)
    public static final class400 method282(byte arg0) {
        if (arg0 != 104) {
            return null;
        }
        field427++;
        class400 var1 = (class400) class259.field3674.method1735(-17801);
        if (var1 == null) {
            return new class400();
        } else {
            class585.field8406--;
            return var1;
        }
    }
}
