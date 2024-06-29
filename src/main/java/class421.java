import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class421 extends class316 {

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field5831;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public int field5830;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public int field5833;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public int field5824;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "F")
    public static float field5826 = 1024.0F;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "S")
    public static short field5825 = 1;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lmo;")
    public static class336 field5832 = new class336(8);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "[I")
    public static int[] field5827;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public static final void method2513(int arg0) {
        class251.method1716();
        int var1 = 111 / ((-arg0 - 54) / 60);
        field5828++;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public static void method2514(int arg0) {
        field5827 = null;
        field5832 = null;
        if (arg0 != 1024) {
            method2515((String) null, (class435) null, -90, false);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;Lnl;IZ)Lrj;")
    public static final class481 method2515(String arg0, class435 arg1, int arg2, boolean arg3) {
        field5823++;
        int var4 = arg1.method2657(arg0, (byte) 15);
        if (var4 == -1) {
            return new class481(0);
        }
        int[] var5 = arg1.method2655(arg2 ^ arg2, var4);
        class481 var6 = new class481(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field6807 > var7) {
                class161 var9 = new class161(arg1.method2633(var4, var5[var8++], 99));
                int var10 = var9.method1168(255);
                int var11 = var9.method1134(-16848);
                int var12 = var9.method1172((byte) -115);
                if (!arg3 && var12 == 1) {
                    var6.field6807--;
                } else {
                    var6.field6804[var7] = var10;
                    var6.field6805[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(IIII)V")
    public class421(int arg0, int arg1, int arg2, int arg3) {
        this.field5831 = arg2;
        this.field5830 = arg1;
        this.field5833 = arg0;
        this.field5824 = arg3;
    }
}
