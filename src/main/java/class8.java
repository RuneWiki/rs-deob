import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 extends class36 {

    @OriginalMember(owner = "client!b", name = "bd", descriptor = "Lrd;")
    public static class114 field110 = class84.method656("Bitte entfernen Sie ", (byte) 116);

    @OriginalMember(owner = "client!b", name = "dd", descriptor = "I")
    public static int field112 = -1;

    @OriginalMember(owner = "client!b", name = "ad", descriptor = "Lrd;")
    public static class114 field109 = class84.method656("Handel akzeptieren", (byte) 127);

    @OriginalMember(owner = "client!b", name = "ed", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!b", name = "ld", descriptor = "I")
    public static int field120 = -1;

    @OriginalMember(owner = "client!b", name = "id", descriptor = "I")
    public static volatile int field117 = 0;

    @OriginalMember(owner = "client!b", name = "gd", descriptor = "[Lrd;")
    public static class114[] field115 = new class114[100];

    @OriginalMember(owner = "client!b", name = "nd", descriptor = "Lrd;")
    public static class114 field122 = class84.method656("auf einer freien Welt zu spielen)3", (byte) 116);

    @OriginalMember(owner = "client!b", name = "kd", descriptor = "Lrd;")
    public static class114 field119 = class84.method656("Regeln versto-8en hat)3", (byte) 124);

    @OriginalMember(owner = "client!b", name = "hd", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!b", name = "Yc", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!b", name = "Zc", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!b", name = "cd", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!b", name = "jd", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!b", name = "fd", descriptor = "J")
    public static long field114;

    @OriginalMember(owner = "client!b", name = "Xc", descriptor = "Lbb;")
    public static class10 field106;

    @OriginalMember(owner = "client!b", name = "md", descriptor = "Ltb;")
    public class124 field121;

    @OriginalMember(owner = "client!b", name = "od", descriptor = "[I")
    public static int[] field123;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)Z")
    public final boolean method66(byte arg0) {
        ++field108;
        if (this.field121 == null) {
            return false;
        } else {
            return arg0 < -121;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)Lue;")
    public final class133 method67(byte arg0) {
        if (arg0 > -9) {
            field113 = -64;
        }
        ++field118;
        if (this.field121 == null) {
            return null;
        } else {
            class29 var2 = super.field750 != -1 && super.field705 == 0 ? class12.method97(super.field750, false) : null;
            class29 var3 = super.field736 == -1 || ~super.field736 == ~super.field697 && var2 != null ? null : class12.method97(super.field736, false);
            class133 var4 = this.field121.method964(super.field704, var2, super.field692, (byte) 24, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method1071();
                super.field746 = var4.field1052;
                if (~super.field721 != 0 && ~super.field744 != 0) {
                    class133 var5 = class74.method606(true, super.field721).method511(-1565796086, super.field744);
                    if (var5 != null) {
                        var5.method1086(0, -super.field731, 0);
                        class133[] var6 = new class133[] { var4, var5 };
                        var4 = new class133(var6, 2);
                    }
                }
                if (this.field121.field2946 == 1) {
                    var4.field3213 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(B)V")
    public static void method68(byte arg0) {
        field109 = null;
        field122 = null;
        field115 = null;
        field123 = null;
        field119 = null;
        field110 = null;
        if (arg0 == -63) {
            field106 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
    public static final boolean method69(int arg0, int arg1) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field107;
            return (arg1 >> 30 & 1) != 0;
        }
    }
}
