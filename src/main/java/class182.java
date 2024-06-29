import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class182 extends class12 {

    @OriginalMember(owner = "client!uc", name = "nc", descriptor = "Lcd;")
    public static class23 field3592 = class54.method414("Anmelde)2Zeitlimit -Uberschritten)3", -1);

    @OriginalMember(owner = "client!uc", name = "pc", descriptor = "Lcd;")
    public static class23 field3594 = class54.method414("(Y", -1);

    @OriginalMember(owner = "client!uc", name = "uc", descriptor = "[S")
    public static short[] field3599 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!uc", name = "rc", descriptor = "[[[I")
    public static int[][][] field3596 = new int[4][105][105];

    @OriginalMember(owner = "client!uc", name = "oc", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!uc", name = "sc", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!uc", name = "tc", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!uc", name = "xc", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!uc", name = "qc", descriptor = "Lac;")
    public class4 field3595;

    @OriginalMember(owner = "client!uc", name = "vc", descriptor = "Lgd;")
    public static class58 field3600;

    @OriginalMember(owner = "client!uc", name = "wc", descriptor = "Lkh;")
    public static class97 field3601;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)Z")
    public final boolean method69(boolean arg0) {
        ++field3602;
        if (this.field3595 == null) {
            return false;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        ++field3593;
        class67.field1576.method997(false);
        if (arg0 != -1) {
            method1126(-80);
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Lbh;")
    public final class18 method31(int arg0) {
        ++field3597;
        if (this.field3595 == null) {
            return null;
        } else {
            class94 var2 = super.field288 != -1 && super.field252 == 0 ? class20.method128(super.field288, (byte) 72) : null;
            class94 var3 = super.field250 == -1 || ~super.field262 == ~super.field250 && var2 != null ? null : class20.method128(super.field250, (byte) 75);
            if (arg0 >= -101) {
                method1126(125);
            }
            class18 var4 = this.field3595.method18(super.field285, var2, var3, -15497, super.field220);
            if (var4 == null) {
                return null;
            } else {
                var4.method122();
                super.field283 = var4.field3376;
                if (~super.field287 != 0 && super.field278 != -1) {
                    class18 var5 = class82.method553((byte) 6, super.field287).method221(super.field278, -89);
                    if (var5 != null) {
                        var5.method119(0, -super.field249, 0);
                        var4 = var4.method121(var5);
                    }
                }
                if (~this.field3595.field69 == -2) {
                    var4.field386 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
    public static void method1126(int arg0) {
        if (arg0 < 66) {
            field3594 = null;
        }
        field3594 = null;
        field3596 = null;
        field3600 = null;
        field3599 = null;
        field3601 = null;
        field3592 = null;
    }
}
