import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class400 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lfs;")
    private class287 field5732 = new class287();

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lvv;")
    private class531 field5741 = new class531();

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    private int field5739;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    private int field5740;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lew;")
    private class270 field5738;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5730 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lhi;")
    public static class45 field5736 = new class45(66, 3);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[I")
    public static int[] field5735;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public final void method2369(int arg0) {
        this.field5741.method3149(arg0 + 61336);
        field5729++;
        if (arg0 != 3944) {
            field5730 = null;
        }
        this.field5738.method1583(61);
        this.field5732 = new class287();
        this.field5739 = this.field5740;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJLfs;)V")
    public final void method2370(int arg0, long arg1, class287 arg2) {
        if (this.field5739 == 0) {
            class287 var5 = this.field5741.method3148(true);
            var5.method2791((byte) 112);
            var5.method1645(arg0 - 28393);
            if (this.field5732 == var5) {
                class287 var6 = this.field5741.method3148(true);
                var6.method2791((byte) 112);
                var6.method1645(-118);
            }
        } else {
            this.field5739--;
        }
        if (arg0 != 28281) {
            this.method2371(-67L, 125);
        }
        field5733++;
        this.field5738.method1586(arg2, arg1, 1);
        this.field5741.method3150(16711680, arg2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(JI)Lfs;")
    public final class287 method2371(long arg0, int arg1) {
        field5737++;
        if (arg1 >= -22) {
            return null;
        }
        class287 var4 = (class287) this.field5738.method1592((byte) -25, arg0);
        if (var4 != null) {
            this.field5741.method3150(16711680, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method2372(int arg0) {
        if (arg0 > -70) {
            field5735 = null;
        }
        field5735 = null;
        field5730 = null;
        field5736 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
    public class400(int arg0) {
        this.field5739 = arg0;
        this.field5740 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5738 = new class270(var2);
    }
}
