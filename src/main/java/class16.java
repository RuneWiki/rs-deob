import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 {

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Lrg;")
    public class644 field313 = new class644();

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field317 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "[I")
    public static int[] field322 = new int[16384];

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "[I")
    public static int[] field320 = new int[16384];

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Z")
    public static boolean field324;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Ltba;")
    public static class165 field323;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Lwaa;")
    public static class705 field325;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "D")
    public static double field327;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lrg;")
    private class644 field321;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Lrg;")
    public final class644 method111(int arg0) {
        field311++;
        class644 var2 = this.field321;
        if (this.field313 == var2) {
            this.field321 = null;
            return null;
        } else if (arg0 == 22548) {
            this.field321 = var2.field8921;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ICI)I")
    public static final int method112(int arg0, char arg1, int arg2) {
        field312++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        int var5 = 61 / ((arg2 - 28) / 59);
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public final void method113(int arg0) {
        field310++;
        while (true) {
            class644 var2 = this.field313.field8921;
            if (this.field313 == var2) {
                if (arg0 <= 34) {
                    this.field321 = null;
                }
                this.field321 = null;
                return;
            }
            var2.method3615(113);
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)Lrg;")
    public final class644 method114(int arg0) {
        field316++;
        int var2 = 18 / ((-arg0 - 2) / 42);
        class644 var3 = this.field313.field8921;
        if (this.field313 == var3) {
            return null;
        } else {
            var3.method3615(120);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
    public final int method115(byte arg0) {
        field318++;
        int var2 = 0;
        int var3 = 99 / ((arg0 + 41) / 47);
        class644 var4 = this.field313.field8921;
        while (this.field313 != var4) {
            var4 = var4.field8921;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lrg;I)V")
    public final void method116(class644 arg0, int arg1) {
        if (arg0.field8926 != null) {
            arg0.method3615(arg1 + 53);
        }
        field315++;
        arg0.field8921 = this.field313;
        arg0.field8926 = this.field313.field8926;
        arg0.field8926.field8921 = arg0;
        arg0.field8921.field8926 = arg0;
        if (arg1 != 1) {
            field326 = -45;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static void method117(byte arg0) {
        field322 = null;
        field320 = null;
        if (arg0 > 70) {
            field317 = null;
            field325 = null;
            field323 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)Lrg;")
    public final class644 method118(int arg0) {
        field314++;
        class644 var2 = this.field313.field8921;
        if (this.field313 == var2) {
            this.field321 = null;
            return null;
        } else if (arg0 == -30553) {
            this.field321 = var2.field8921;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
    public static final void method119(boolean arg0, int arg1) {
        class705.field9776.method604(class565.field7943.method480());
        field319++;
        int[] var2 = class565.field7943.method509();
        if (arg1 != 16384) {
            method117((byte) 22);
        }
        class518.field7261 = var2[2];
        class8.field93 = var2[0];
        class27.field491 = var2[1];
        class429.field5743 = var2[3];
        if (arg0) {
            class565.field7943.method437(class649.field9013, class710.field9855, class545.field7605, class70.field986);
            class622.method3498(119, class740.field10330);
        } else {
            class565.field7943.method437(class491.field6979, class698.field9715, class130.field1837, class708.field9835);
            class622.method3498(-97, field327);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class16() {
        this.field313.field8921 = this.field313;
        this.field313.field8926 = this.field313;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field320[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field322[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field324 = false;
        field323 = new class165(512);
        field326 = 0;
        field325 = new class705("LOCAL", "", "local", 4);
    }
}
