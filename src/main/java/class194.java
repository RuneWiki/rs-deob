import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class194 extends class278 {

    @OriginalMember(owner = "client!su", name = "y", descriptor = "Z")
    public static boolean field3050 = false;

    @OriginalMember(owner = "client!su", name = "u", descriptor = "Laj;")
    public static class287 field3046 = new class287(20);

    @OriginalMember(owner = "client!su", name = "C", descriptor = "Lsb;")
    public static class266 field3054 = new class266(75, 4);

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!su", name = "w", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!su", name = "z", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!su", name = "B", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "Lf;")
    private class702 field3040;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "Lf;")
    private class702 field3042;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "Lf;")
    private class702 field3043;

    @OriginalMember(owner = "client!su", name = "v", descriptor = "Lf;")
    private class702 field3047;

    @OriginalMember(owner = "client!su", name = "x", descriptor = "Lf;")
    private class702 field3049;

    @OriginalMember(owner = "client!su", name = "A", descriptor = "Lf;")
    public class702 field3052;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIZ)V")
    public final void method568(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3039;
        int var5 = this.field3043.method1784() + arg1;
        if (arg0 >= -35) {
            method1397(37L, (class167) null, 65);
        }
        int var6 = arg1 - (-super.field4164.field3492 + this.field3049.method1784());
        int var7 = arg2 - -this.field3040.method1789();
        int var8 = arg2 - (-super.field4164.field3491 - -this.field3047.method1789());
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method1839((byte) 35) / 10000;
        int[] var12 = new int[4];
        class623.field9017.method131(var12);
        class623.field9017.method142(var5, var7, var5 + var11, var8);
        this.method1396(var10, 123, var9, var7, var5);
        class623.field9017.method142(var5 + var11, var7, var6, var8);
        this.field3042.method3918(var5, var7, var9, var10);
        class623.field9017.method142(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
    public static void method1395(int arg0) {
        field3046 = null;
        field3054 = null;
        if (arg0 != 19202) {
            field3050 = false;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V")
    public void method1396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3052.method3918(arg4, arg3, arg2, arg0);
        ++field3041;
        if (arg1 < 95) {
            field3050 = false;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(JLr;I)V")
    public static final void method1397(long arg0, class167 arg1, int arg2) {
        class32.field956 = arg2;
        ++field3053;
        class311.field4628 = 0;
        class337.field5039 = class76.field1544;
        class76.field1544 = 0;
        long var4 = class525.method3074((byte) -101);
        for (class45 var6 = (class45) class705.field9921.method3317(-121); var6 != null; var6 = (class45) class705.field9921.method3321(arg2 ^ -121)) {
            if (var6.method583(arg1, arg0)) {
                ++class32.field956;
            }
        }
        if (class444.field6388 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class705.field9921.method3320((byte) -27) + ", running: " + class32.field956);
            System.out.println("Emitters: " + class311.field4628 + " Particles: " + class76.field1544 + ". Time taken: " + (class525.method3074((byte) -101) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lom;Lom;Ltp;)V")
    public class194(class344 arg0, class344 arg1, class496 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
    public final boolean method1398(byte arg0) {
        ++field3048;
        if (!super.method1398((byte) 114)) {
            return false;
        } else {
            class496 var2 = (class496) super.field4164;
            if (!super.field4155.method2230((byte) -92, var2.field7063)) {
                return false;
            } else if (!super.field4155.method2230((byte) -107, var2.field7070)) {
                return false;
            } else if (!super.field4155.method2230((byte) -105, var2.field7065)) {
                return false;
            } else if (!super.field4155.method2230((byte) 95, var2.field7074)) {
                return false;
            } else if (!super.field4155.method2230((byte) 66, var2.field7064)) {
                return false;
            } else if (!super.field4155.method2230((byte) -123, var2.field7066)) {
                return false;
            } else {
                if (arg0 <= 112) {
                    field3054 = null;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZI)V")
    public final void method569(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 != 2) {
            this.field3040 = null;
        }
        if (arg2) {
            int[] var5 = new int[4];
            class623.field9017.method131(var5);
            class623.field9017.method142(arg1, arg3, super.field4164.field3492 + arg1, super.field4164.field3491 + arg3);
            int var6 = this.field3043.method1784();
            int var7 = this.field3043.method1789();
            int var8 = this.field3049.method1784();
            int var9 = this.field3049.method1789();
            this.field3043.method3914(arg1, (-var7 + super.field4164.field3491) / 2 + arg3);
            this.field3049.method3914(-var8 + arg1 - -super.field4164.field3492, (super.field4164.field3491 - var9) / 2 + arg3);
            class623.field9017.method142(arg1, arg3, arg1 - -super.field4164.field3492, this.field3040.method1789() + arg3);
            this.field3040.method3918(arg1 + var6, arg3, -var6 + super.field4164.field3492 - var8, super.field4164.field3491);
            int var10 = this.field3047.method1789();
            class623.field9017.method142(arg1, super.field4164.field3491 + arg3 + -var10, arg1 - -super.field4164.field3492, super.field4164.field3491 + arg3);
            this.field3047.method3918(arg1 - -var6, -var10 + super.field4164.field3491 + arg3, -var6 + super.field4164.field3492 - var8, super.field4164.field3491);
            class623.field9017.method142(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field3045;
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(B)I")
    public static final int method1399(byte arg0) {
        ++field3044;
        class167 var1 = class623.field9017;
        boolean var2 = false;
        if (~class90.field1654 != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class167.method1260(0, 0, (class214) null, 0, (class344) null, var3);
        }
        long var4 = class525.method3074((byte) -101);
        for (int var6 = 0; var6 < 10000; ++var6) {
            var1.method88(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        if (arg0 > -85) {
            field3046 = null;
        }
        int var7 = (int) (-var4 + class525.method3074((byte) -101));
        var1.method1267(0, 100, 1, 100, 0, -16777216);
        if (var2) {
            var1.method1265((byte) -67);
        }
        return var7;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public final void method1400(byte arg0) {
        ++field3051;
        super.method1400(arg0);
        class496 var2 = (class496) super.field4164;
        this.field3052 = class505.method3001((byte) 71, super.field4155, var2.field7063);
        this.field3042 = class505.method3001((byte) 71, super.field4155, var2.field7070);
        this.field3043 = class505.method3001((byte) 71, super.field4155, var2.field7065);
        this.field3049 = class505.method3001((byte) 71, super.field4155, var2.field7074);
        this.field3040 = class505.method3001((byte) 71, super.field4155, var2.field7064);
        this.field3047 = class505.method3001((byte) 71, super.field4155, var2.field7066);
    }
}
