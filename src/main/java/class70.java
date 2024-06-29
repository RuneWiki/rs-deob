import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class70 extends class51 {

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public int field1775 = 1000;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lic;")
    public static class59 field1777 = class59.method433(0, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "Lic;")
    public static class59 field1776 = class59.method433(0, "sl_stars");

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Lic;")
    public static class59 field1772 = class59.method433(0, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Lic;")
    public static class59 field1773 = class59.method433(0, "::qa_op_test");

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "Lic;")
    public static class59 field1780 = class59.method433(0, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lic;")
    public static class59 field1783 = class59.method433(0, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "[I")
    public static int[] field1779;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)Lnb;")
    public class92 method43(byte arg0) {
        field1778++;
        if (arg0 < 21) {
            field1777 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)I")
    public static final int method552(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            int var3 = arg1 >>> 31;
            field1774++;
            return (arg1 + var3) / arg2 - var3;
        } else {
            return 44;
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
    public static void method553(byte arg0) {
        field1776 = null;
        if (arg0 != 2) {
            field1773 = null;
        }
        field1783 = null;
        field1779 = null;
        field1773 = null;
        field1772 = null;
        field1777 = null;
        field1780 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)V")
    public static final void method554(byte arg0, int arg1, int arg2) {
        field1771++;
        class83 var3 = class23.field563[class44.field1127][arg1][arg2];
        if (var3 == null) {
            class3.field58.method896(class44.field1127, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class15 var5 = (class15) var3.method682(arg0 + 114);
        class15 var6 = null;
        while (var5 != null) {
            class79 var11 = class7.method39(arg0 + 31110, var5.field303);
            int var12 = var11.field1919;
            if (var11.field1951 == 1) {
                var12 = (var5.field301 + 1) * var12;
            }
            if (var4 < var12) {
                var4 = var12;
                var6 = var5;
            }
            var5 = (class15) var3.method684((byte) -65);
        }
        if (var6 == null) {
            class3.field58.method896(class44.field1127, arg1, arg2);
            return;
        }
        var3.method679(true, var6);
        class15 var7 = (class15) var3.method682(0);
        class15 var8 = null;
        int var9 = arg1 + (arg2 << 7) + 1610612736;
        if (arg0 != -114) {
            return;
        }
        class15 var10 = null;
        while (var7 != null) {
            if (var6.field303 != var7.field303) {
                if (var8 == null) {
                    var8 = var7;
                }
                if (var7.field303 != var8.field303 && var10 == null) {
                    var10 = var7;
                }
            }
            var7 = (class15) var3.method684((byte) -65);
        }
        class3.field58.method910(class44.field1127, arg1, arg2, class147.method1095((byte) 30, arg2 * 128 + 64, class44.field1127, arg1 * 128 + 64), var6, var9, var8, var10);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIII)V")
    public void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class92 var10 = this.method43((byte) 127);
        if (var10 != null) {
            this.field1775 = var10.field1775;
            var10.method555(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        field1781++;
    }
}
