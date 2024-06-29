import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class513 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Z")
    public boolean field6804 = false;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field6808 = 0;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "D")
    public static double field6810;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field6802;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field6807;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Ld;")
    public static class152 field6801;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lcl;")
    public class269 field6800;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Lhda;")
    public static class752 field6809;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZILha;I)Lhu;")
    public final class133 method2862(boolean arg0, int arg1, class59 arg2, int arg3) {
        if (arg1 != 681903699) {
            return null;
        }
        field6805++;
        long var5 = (long) (arg2.field721 << 19 | (arg0 ? 262144 : 0) | arg3 << 16 | this.field6802);
        class133 var7 = (class133) this.field6800.field3770.method552(arg1 - 681903695, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field6800.field3768.method2216(this.field6802, 84)) {
            class720 var8 = class720.method4034(this.field6800.field3768, this.field6802, 0);
            if (var8 != null) {
                var8.field10025 = var8.field10024 = var8.field10026 = var8.field10031 = 0;
                if (arg0) {
                    var8.method4033();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method4038();
                }
            }
            class133 var10 = arg2.method415(var8, true);
            if (var10 != null) {
                this.field6800.field3770.method556((byte) 0, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lee;II)V")
    private final void method2863(class677 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field6802 = arg0.method3807(-1);
        } else if (arg2 == 2) {
            this.field6807 = arg0.method3833(255);
        } else if (arg2 == 3) {
            this.field6804 = true;
        } else if (arg2 == 4) {
            this.field6802 = -1;
        }
        field6806++;
        int var4 = 6 / ((14 - arg1) / 53);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Z")
    public final boolean method2864(byte arg0) {
        if (arg0 != 80) {
            field6810 = 0.8167371204208419D;
        }
        field6813++;
        return this.field6800.field3768.method2216(this.field6802, 127);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method2865(int arg0) {
        field6812++;
        if (class514.field6818 == null) {
            return;
        }
        if (arg0 != -3) {
            field6808 = 72;
        }
        try {
            String var1 = class514.field6818.getParameter("cookiehost");
            int var2 = (int) (class375.method2193(116) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class124.method986((byte) -14, class514.field6818, "document.cookie=\"" + var3 + "\"");
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lee;B)V")
    public final void method2866(class677 arg0, byte arg1) {
        int var3 = -118 % ((arg1 + 34) / 58);
        while (true) {
            int var4 = arg0.method3821((byte) 95);
            if (var4 == 0) {
                field6803++;
                return;
            }
            this.method2863(arg0, -58, var4);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static void method2867(byte arg0) {
        if (arg0 > -22) {
            method2865(-29);
        }
        field6801 = null;
        field6809 = null;
    }
}
