import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class535 {

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "Llj;")
    private class477 field7354 = new class477();

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "Lifa;")
    private class487 field7362 = new class487();

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "I")
    private int field7363;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    private int field7360;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "Lnj;")
    private class436 field7364;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7359 = new Rectangle[100];

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "Lta;")
    public static class301 field7356;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Lim;")
    public static class675 field7353;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BILta;Lfca;ILil;Ljava/lang/String;IILfa;II)V")
    public static final void method3023(byte arg0, int arg1, class301 arg2, class188 arg3, int arg4, class598 arg5, String arg6, int arg7, int arg8, class185 arg9, int arg10, int arg11) {
        field7355++;
        int var12;
        if (class42.field546 == 4) {
            var12 = (int) class620.field8432 & 0x3FFF;
        } else {
            var12 = (int) class620.field8432 + class254.field3506 & 0x3FFF;
        }
        int var13 = Math.max(arg3.field2438 / 2, arg3.field2371 / 2) + 10;
        int var14 = arg1 * arg1 + (arg10 * arg10);
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class654.field9259[var12];
        if (arg0 > -76) {
            return;
        }
        int var16 = class654.field9260[var12];
        if (class42.field546 != 4) {
            var15 = var15 * 256 / (class461.field6281 + 256);
            var16 = var16 * 256 / (class461.field6281 + 256);
        }
        int var17 = arg1 * var16 + arg10 * var15 >> 14;
        int var18 = arg10 * var16 - (arg1 * var15) >> 14;
        int var19 = arg5.method3308(100, arg6, null, 0);
        int var20 = arg5.method3315((byte) -45, 100, 0, null, arg6);
        int var21 = var17 - var19 / 2;
        if (var21 >= (-arg3.field2438) && var21 <= arg3.field2438 && -arg3.field2371 <= var18 && arg3.field2371 >= var18) {
            arg2.method1817(null, 0, 50, var19, arg6, (byte) 114, arg11, 1, arg7, arg9, null, arg3.field2438 / 2 + arg11 + var21, 0, 0, arg4, arg3.field2371 / 2 + (arg7 - (var18 + arg8)) - var20);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
    public static void method3024(byte arg0) {
        if (arg0 <= 87) {
            field7353 = null;
        }
        field7359 = null;
        field7356 = null;
        field7353 = null;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
    public final void method3025(byte arg0) {
        this.field7362.method2711(-14886);
        field7361++;
        this.field7364.method2510(arg0 ^ 0xFFFFFFF5);
        if (arg0 == 10) {
            this.field7354 = new class477();
            this.field7363 = this.field7360;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IJ)Llj;")
    public final class477 method3026(int arg0, long arg1) {
        field7365++;
        int var4 = -108 % ((arg0 + 78) / 43);
        class477 var5 = (class477) this.field7364.method2506(48, arg1);
        if (var5 != null) {
            this.field7362.method2713(-82, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(JLlj;B)V")
    public final void method3027(long arg0, class477 arg1, byte arg2) {
        field7358++;
        if (arg2 != 111) {
            return;
        }
        if (this.field7363 == 0) {
            class477 var5 = this.field7362.method2714(0);
            var5.method175(30604);
            var5.method2669(-29226);
            if (this.field7354 == var5) {
                class477 var6 = this.field7362.method2714(0);
                var6.method175(30604);
                var6.method2669(arg2 - 29337);
            }
        } else {
            this.field7363--;
        }
        this.field7364.method2504(arg0, 111, arg1);
        this.field7362.method2713(-82, arg1);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZIILpq;III)V")
    public static final void method3028(boolean arg0, int arg1, int arg2, class159 arg3, int arg4, int arg5, int arg6) {
        class490.field6609 = arg4;
        class168.field2093 = arg3;
        field7357++;
        class333.field4865 = arg5;
        class369.field5301 = 1;
        class208.field2732 = arg1;
        class159.field1987 = arg0;
        if (arg2 == 16383) {
            class265.field3643 = arg6;
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(I)V")
    public class535(int arg0) {
        this.field7363 = arg0;
        this.field7360 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field7364 = new class436(var2);
    }
}
