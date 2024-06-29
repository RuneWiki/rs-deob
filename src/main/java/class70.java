import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class70 extends class577 {

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
    public boolean field831;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Ljava/util/Random;")
    public static Random field833 = new Random();

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "Z")
    public static boolean field838 = false;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIII)Lvn;")
    public static final class330 method580(byte arg0, int arg1, int arg2, int arg3) {
        field832++;
        class46 var4 = class767.field10562[arg2][arg3][arg1];
        if (var4 == null) {
            return null;
        }
        if (arg0 > -25) {
            method582(null, -81);
        }
        class330 var5 = null;
        int var6 = -1;
        for (class48 var7 = var4.field586; var7 != null; var7 = var7.field611) {
            class672 var8 = var7.field605;
            if (var8 instanceof class330) {
                class330 var9 = (class330) var8;
                int var10 = var9.method2102(true) * 256 - 4;
                int var11 = var9.field5742 - var10 >> 9;
                int var12 = var9.field5746 - var10 >> 9;
                int var13 = var9.field5742 + var10 >> 9;
                int var14 = var9.field5746 + var10 >> 9;
                if (var11 <= arg3 && arg1 >= var12 && var13 >= arg3 && arg1 <= var14) {
                    int var15 = (var14 + 1 - arg1) * (var13 + 1 - arg3);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public static void method581(boolean arg0) {
        field833 = null;
        if (!arg0) {
            method581(false);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lwia;I)V")
    public static final void method582(class791 arg0, int arg1) {
        class597.field8401 = arg0;
        if (arg1 != 32394) {
            field838 = false;
        }
        field836++;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIZ)V")
    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field830 = arg0;
        this.field834 = arg1;
        this.field831 = arg5;
        this.field835 = arg4;
        this.field837 = arg2;
        this.field829 = arg3;
    }
}
