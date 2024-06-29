import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class184 {

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Z")
    public boolean field2713 = false;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lus;")
    public static class1 field2712 = new class1(0, 3);

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Ldk;")
    public static class326 field2716 = new class326("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field2706;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lb;")
    public static class201 field2717;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lir;")
    public static class22 field2718;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lbe;")
    public class28 field2714;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[B")
    public static byte[] field2707;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[I")
    public static int[] field2715;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZZLnp;)Ltr;")
    public final class176 method1141(int arg0, boolean arg1, boolean arg2, class313 arg3) {
        field2705++;
        long var5 = (long) (arg3.field4429 << 19 | (arg1 ? 262144 : 0) | arg0 << 16 | this.field2706);
        class176 var7 = (class176) this.field2714.field387.method1479(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field2714.field374.method1230(87, this.field2706)) {
            class72 var8 = class72.method423(this.field2714.field374, this.field2706, 0);
            if (arg2) {
                method1144(126);
            }
            if (var8 != null) {
                var8.field894 = var8.field896 = var8.field895 = var8.field891 = 0;
                if (arg1) {
                    var8.method424();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method430();
                }
            }
            class176 var10 = arg3.method644(var8, true);
            if (var10 != null) {
                this.field2714.field387.method1473(var10, var5, 112);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILrp;)V")
    public final void method1142(int arg0, class276 arg1) {
        field2710++;
        while (true) {
            int var3 = arg1.method1701(-23121);
            if (var3 == 0) {
                if (arg0 < 120) {
                    method1144(-69);
                    return;
                } else {
                    return;
                }
            }
            this.method1145(var3, arg1, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z")
    public final boolean method1143(int arg0) {
        field2708++;
        int var2 = 78 % ((-arg0 - 32) / 43);
        return this.field2714.field374.method1230(104, this.field2706);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static void method1144(int arg0) {
        field2707 = null;
        field2717 = null;
        field2712 = null;
        field2718 = null;
        if (arg0 != 0) {
            method1144(-80);
        }
        field2715 = null;
        field2716 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILrp;B)V")
    private final void method1145(int arg0, class276 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field2706 = arg1.method1729(65280);
        } else if (arg0 == 2) {
            this.field2711 = arg1.method1748(false);
        } else if (arg0 == 3) {
            this.field2713 = true;
        } else if (arg0 == 4) {
            this.field2706 = -1;
        }
        field2709++;
        int var4 = -14 / ((arg2 - 60) / 49);
    }
}
