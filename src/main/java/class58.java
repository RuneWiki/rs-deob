import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class58 extends class523 {

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "client!tga", name = "p", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "I")
    private int field804;

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!tga", name = "t", descriptor = "I")
    private int field806;

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "Lbi;")
    private class483 field800;

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "client!tga", name = "q", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!tga", name = "u", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!tga", name = "w", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!tga", name = "x", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "Lkk;")
    private class193 field799;

    @OriginalMember(owner = "client!tga", name = "v", descriptor = "[Lua;")
    public static class667[] field808;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(III)Lkv;")
    public static final class272 method419(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class272 var4 = var3.field284;
            var3.field284 = null;
            class501.method2938(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Lkk;")
    public final class193 method420(int arg0) {
        if (arg0 != 22) {
            this.field804 = 30;
        }
        field807++;
        if (this.field799 == null) {
            class396.field5054[3] = this.field804;
            class153 var2 = this.field800.field830;
            class396.field5054[2] = this.field802;
            class396.field5054[1] = this.field798;
            class396.field5054[5] = this.field806;
            class396.field5054[4] = this.field805;
            class396.field5054[0] = this.field801;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1071((byte) 126, class396.field5054[var5])) {
                    return null;
                }
                class537 var7 = var2.method1072(class396.field5054[var5], true);
                int var8 = var7.field7460 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field7446 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class282.field3563[var6] = var2.method1069(var4, class396.field5054[var6], false, var4, 1.0F, class386.method2198(arg0, 6776));
            }
            this.field799 = new class193(this.field800, 6407, var4, var3 != 0, class282.field3563);
        }
        return this.field799;
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(III)Z")
    public static final boolean method421(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field797 = -126;
        }
        field810++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Lbi;IIIIII)V")
    public class58(class483 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field798 = arg2;
        this.field802 = arg3;
        this.field804 = arg4;
        this.field801 = arg1;
        this.field806 = arg6;
        this.field800 = arg0;
        this.field805 = arg5;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 30203) {
            field803 = -103;
        }
        field809++;
        for (int var6 = arg3; var6 <= arg1; var6++) {
            for (int var7 = arg4; var7 <= arg0; var7++) {
                if (class331.field4227[var6][var7] == arg5 && class125.field1796[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V")
    public static void method423(boolean arg0) {
        if (!arg0) {
            method422(-46, 20, 110, 75, 20, -55);
        }
        field808 = null;
    }
}
