import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class40 extends class30 {

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "Z")
    public static boolean field424 = true;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "Lkh;")
    public static class11 field425;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "Lui;")
    public static class124 field428;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIB)V")
    public final void method172(int arg0, int arg1, byte arg2) {
        ++field429;
        if (arg2 != 78) {
            this.method170(21, -33, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V")
    public final void method174(int arg0, int arg1, int arg2) {
        ++field420;
        if (arg1 != 27492) {
            this.field426 = -89;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIB)V")
    public final void method170(int arg0, int arg1, byte arg2) {
        ++field419;
        if (arg2 >= 99) {
            int var4 = this.field433 * arg0 >> 12;
            int var5 = this.field423 * arg1 >> 12;
            int var6 = this.field430 * arg0 >> 12;
            int var7 = this.field426 * arg1 >> 12;
            int var8 = this.field422 * arg0 >> 12;
            int var9 = this.field435 * arg1 >> 12;
            int var10 = this.field421 * arg0 >> 12;
            int var11 = this.field434 * arg1 >> 12;
            class356.method2276(var9, var4, var8, super.field277, var11, var6, var5, var10, 103, var7);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public static final void method249(int arg0) {
        ++field418;
        if (arg0 >= -113) {
            method249(82);
        }
        int[] var1 = new int[class350.field5116];
        int var2 = 0;
        for (int var3 = 0; class350.field5116 > var3; ++var3) {
            class260 var5 = class392.method2498(var3, -107);
            if (var5.field3584 >= 0 || var5.field3525 >= 0) {
                var1[var2++] = var3;
            }
        }
        class306.field4387 = new int[var2];
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            class306.field4387[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field423 = arg1;
        this.field435 = arg5;
        this.field430 = arg2;
        this.field433 = arg0;
        this.field422 = arg4;
        this.field421 = arg6;
        this.field434 = arg7;
        this.field426 = arg3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
    public static final void method250(byte arg0) {
        ++field432;
        if (arg0 > 102) {
            class135.method812(class348.field5096, (byte) -59);
            class213.method1398(0, class348.field5096);
            if (class335.field4924 != null) {
                class335.field4924.method2230(class348.field5096, -15174);
            }
            class407.field5920.method1481(-30568);
            class348.field5096.setBackground(Color.black);
            class330.field4717 = -1;
            class55.method319(class348.field5096, (byte) 93);
            class108.method603((byte) 53, class348.field5096);
            if (class335.field4924 != null) {
                class335.field4924.method2229(20159, class348.field5096);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
    public static void method251(boolean arg0) {
        field425 = null;
        field428 = null;
        if (arg0) {
            field427 = 95;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lbk;I)Lik;")
    public static final class115 method252(class211 arg0, int arg1) {
        int var2 = 0 % ((-5 - arg1) / 45);
        arg0.method1342((byte) -127);
        ++field431;
        int var3 = arg0.method1342((byte) -127);
        class115 var4 = class303.method1910(false, var3);
        var4.field1345 = arg0.method1342((byte) -128);
        int var5 = arg0.method1342((byte) -128);
        for (int var6 = 0; var5 > var6; ++var6) {
            int var7 = arg0.method1342((byte) -127);
            var4.method149((byte) 107, arg0, var7);
        }
        var4.method140(0);
        return var4;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I")
    public static int method253(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
