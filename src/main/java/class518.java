import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class518 {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
    private boolean field7461 = false;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public int field7464 = 43594;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "Z")
    private boolean field7463 = true;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public int field7471 = 443;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field7465 = 0;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field7470 = 0;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public int field7472;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "Ljava/lang/String;")
    public String field7468;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lvs;I)Z")
    public final boolean method3148(class518 arg0, int arg1) {
        field7460++;
        if (arg1 != -1) {
            this.method3152(null, (byte) -18);
        }
        if (arg0 == null) {
            return false;
        } else {
            return this.field7472 == arg0.field7472 && this.field7468.equals(arg0.field7468);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
    public static final void method3149(int arg0, int arg1, int arg2) {
        field7474++;
        int var3 = class119.field1635.method3063(0, class608.field8644.method3543(-24350, class45.field748));
        int var5;
        if (class34.field311) {
            for (class194 var4 = (class194) class225.field3348.method3025(false); var4 != null; var4 = (class194) class225.field3348.method3026(true)) {
                int var6;
                if (var4.field2845 == 1) {
                    var6 = class380.method2355((class304) var4.field2841.field7165.field5596, -38);
                } else {
                    var6 = class491.method2991(10366, var4);
                }
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            var3 += 8;
            var5 = class654.field9376 * 16 + 21;
            class731.field10246 = class654.field9376 * 16 + (class404.field5765 ? 26 : 22);
        } else {
            for (class304 var7 = (class304) class303.field4137.method3565(125); var7 != null; var7 = (class304) class303.field4137.method3561((byte) 119)) {
                int var10 = class380.method2355(var7, -91);
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            var5 = class456.field6499 * 16 + 21;
            class731.field10246 = class456.field6499 * 16 + (class404.field5765 ? 26 : 22);
            var3 += 8;
        }
        int var8 = arg2 - (var3 / 2);
        if (class68.field1042 < (var3 + var8)) {
            var8 = class68.field1042 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        if ((arg0 + var5) > class565.field8187) {
            var9 = class565.field8187 - var5;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        if (arg1 == 20927) {
            class132.field1820 = var8;
            class388.field5606 = var9;
            class147.field2154 = true;
            class314.field4246 = var3;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public final void method3150(byte arg0) {
        if (arg0 != -15) {
            field7470 = -39;
        }
        if (!this.field7463) {
            this.field7463 = true;
            this.field7461 = true;
        } else if (this.field7461) {
            this.field7461 = false;
        } else {
            this.field7463 = false;
        }
        field7466++;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(III)I")
    public static final int method3151(int arg0, int arg1, int arg2) {
        field7469++;
        int var3 = class658.method3759((byte) 58, arg0 + 91923, arg1 + 45365, 4) + ((class658.method3759((byte) 112, arg0 - -37821, arg1 - -10294, 2) + -128 >> 1) - -(class658.method3759((byte) 77, arg0, arg1, 1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg2 != -25019) {
            field7473 = 123;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lhga;B)Lsca;")
    public final class432 method3152(class300 arg0, byte arg1) {
        if (arg1 > -124) {
            method3153(-58, -66, null, 119, 61);
        }
        field7462++;
        return arg0.method1883(this.field7461, this.field7468, this.field7463 ? this.field7471 : this.field7464, 0);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II[III)V")
    public static final void method3153(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        arg1--;
        field7467++;
        int var6 = arg0 - 1;
        int var5 = var6 + arg3;
        while (var5 > arg1) {
            int var7 = arg1 + 1;
            arg2[var7] = arg4;
            int var8 = var7 + 1;
            arg2[var8] = arg4;
            int var9 = var8 + 1;
            arg2[var9] = arg4;
            int var10 = var9 + 1;
            arg2[var10] = arg4;
            int var11 = var10 + 1;
            arg2[var11] = arg4;
            int var12 = var11 + 1;
            arg2[var12] = arg4;
            int var13 = var12 + 1;
            arg2[var13] = arg4;
            arg1 = var13 + 1;
            arg2[arg1] = arg4;
        }
        while (var6 > arg1) {
            arg1++;
            arg2[arg1] = arg4;
        }
    }
}
