import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class77 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
    public static int[] field979;

    static {
        new class409("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 7)
    public static void method537(byte arg0) {
        if (arg0 <= -100) {
            field979 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Lds;", line = 30)
    public static final class233 method538(int arg0, int arg1, int arg2) {
        class369 var3 = class178.field2530[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5327;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIILfp;Lgn;)V", line = 38)
    public static final void method539(int arg0, int arg1, int arg2, int arg3, class9 arg4, class178 arg5) {
        field981++;
        class127 var6 = class250.method1655(34, arg5.field2458);
        if (arg2 > -127) {
            field982 = 48;
        }
        if (var6.field1676 == -1) {
            return;
        }
        int var7;
        if (arg5.field2462) {
            int var8 = arg5.field2473 + arg0;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class285 var9 = var6.method853(var7, arg5.field2481, (byte) -88, arg4);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field2533;
        int var11 = arg5.field2476;
        if ((var7 & 0x1) == 1) {
            var10 = arg5.field2476;
            var11 = arg5.field2533;
        }
        int var12 = var9.method1861();
        int var13 = var9.method1860();
        if (var6.field1675) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field1681 == 0) {
            var9.method1919(arg1, arg3 - (var11 - 1) * 4, var12, var13);
        } else {
            var9.method929(arg1, arg3 - (var11 * 4 - 4), var12, var13, 1, var6.field1681 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 94)
    public static final void method540(byte arg0) {
        field980++;
        int var1 = -43 % ((arg0 + 9) / 53);
        int var2 = class208.field2933;
        int[] var3 = class88.field1085;
        for (int var4 = 0; var4 < var2; var4++) {
            class380 var5 = class455.field6731[var3[var4]];
            if (var5 != null) {
                class328.method2149(var5, false, var5.method446(10));
            }
        }
    }
}
