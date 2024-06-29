import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class345 extends class383 {

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field4426 = 503;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field4429 = 1;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "[I")
    public int[] field4424;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "[I")
    public int[] field4428;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[I")
    public int[] field4433;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[Lcw;")
    public class121[] field4423;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[Lcw;")
    public class121[] field4430;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "[[[B")
    public byte[][][] field4431;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lya;Lgg;IIIII)V")
    public static final void method1981(class38 arg0, class117 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class524.field7753 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class470.field6825) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class105.field1336 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class490 var15 = class125.field1664[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class520.field7520[var12].method399(var13, var14) + class520.field7520[var12].method399(var13 + 1, var14) + class520.field7520[var12].method399(var13, var14 + 1) + class520.field7520[var12].method399(var13 + 1, var14 + 1)) / 4 - (class520.field7520[arg2].method399(arg3, arg4) + class520.field7520[arg2].method399(arg3 + 1, arg4) + class520.field7520[arg2].method399(arg3, arg4 + 1) + class520.field7520[arg2].method399(arg3 + 1, arg4 + 1)) / 4;
                                    class314 var17 = var15.field7126;
                                    class314 var18 = var15.field7130;
                                    if (var17 != null && var17.method194((byte) -128)) {
                                        arg1.method193(var17, (var13 - arg3) * class376.field4951 + (1 - arg5) * class59.field772, var7, (var14 - arg4) * class376.field4951 + (1 - arg6) * class59.field772, var16, -115, arg0);
                                    }
                                    if (var18 != null && var18.method194((byte) -92)) {
                                        arg1.method193(var18, (var13 - arg3) * class376.field4951 + (1 - arg5) * class59.field772, var7, (var14 - arg4) * class376.field4951 + (1 - arg6) * class59.field772, var16, -101, arg0);
                                    }
                                    for (class376 var19 = var15.field7127; var19 != null; var19 = var19.field4952) {
                                        class205 var20 = var19.field4953;
                                        if (var20 != null && var20.method194((byte) -111) && (var20.field2673 == var13 || var8 == var13) && (var20.field2671 == var14 || var10 == var14)) {
                                            int var21 = var20.field2681 + 1 - var20.field2673;
                                            int var22 = var20.field2670 + 1 - var20.field2671;
                                            arg1.method193(var20, (var20.field2673 - arg3) * class376.field4951 + (var21 - arg5) * class59.field772, var7, (var20.field2671 - arg4) * class376.field4951 + (var22 - arg6) * class59.field772, var16, -99, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILpc;IIII)Ljava/awt/Frame;")
    public static final Frame method1982(int arg0, class476 arg1, int arg2, int arg3, int arg4, int arg5) {
        field4425++;
        if (!arg1.method2878(false)) {
            return null;
        }
        if (arg2 == 0) {
            class266[] var6 = class465.method2800(false, arg1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3356 == arg0 && var6[var8].field3352 == arg5 && (arg4 == 0 || var6[var8].field3351 == arg4) && (!var7 || var6[var8].field3353 > arg2)) {
                    var7 = true;
                    arg2 = var6[var8].field3353;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class121 var9 = arg1.method2894(arg4, arg5, true, arg2, arg0);
        if (arg3 != 0) {
            field4429 = -126;
        }
        while (var9.field1628 == 0) {
            class199.method1251(10L, (byte) 119);
        }
        Frame var10 = (Frame) var9.field1627;
        if (var10 == null) {
            return null;
        } else if (var9.field1628 == 2) {
            class122.method868(var10, arg1, 0);
            return null;
        } else {
            return var10;
        }
    }
}
