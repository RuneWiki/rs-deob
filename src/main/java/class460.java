import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class460 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "[I")
    public int[] field6861 = new int[100];

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "[I")
    public int[] field6865 = new int[3];

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "[Lada;")
    public class144[] field6866 = new class144[100];

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[Loj;")
    public class321[] field6871 = new class321[8];

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Lhp;")
    public static class277 field6862 = new class277(50);

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "[F")
    public static float[] field6868 = new float[4];

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public int field6869;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field6867;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIII)I")
    public static final int method2831(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 111) {
            method2832(null, -6, null, null, null);
        }
        field6863++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg1;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([II[ILtt;[I)V")
    public static final void method2832(int[] arg0, int arg1, int[] arg2, class78 arg3, int[] arg4) {
        field6870++;
        for (int var5 = arg1; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field2428.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field2428[var9] = null;
                    } else {
                        class177 var10 = class259.field3686.method2961(var6, arg1 ^ 0x8);
                        int var11 = var10.field2160;
                        class283 var12 = arg3.field2428[var9];
                        if (var12 != null) {
                            if (var12.field3928 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field2428[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3926 = 1;
                                    var12.field3927 = 0;
                                    var12.field3932 = var8;
                                    var12.field3929 = 0;
                                    var12.field3930 = 0;
                                    class405.method2571(false, arg3.field1764, -90, arg3.field1768, arg3.field1757, var10, 0);
                                } else if (var11 == 2) {
                                    var12.field3927 = 0;
                                }
                            } else if (var10.field2161 >= class259.field3686.method2961(var12.field3928, 8).field2161) {
                                var12 = arg3.field2428[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class283 var13 = arg3.field2428[var9] = new class283();
                            var13.field3932 = var8;
                            var13.field3926 = 1;
                            var13.field3927 = 0;
                            var13.field3928 = var6;
                            var13.field3930 = 0;
                            var13.field3929 = 0;
                            class405.method2571(false, arg3.field1764, 82, arg3.field1768, arg3.field1757, var10, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6864++;
        int var7 = class132.method818((byte) -93, arg0, class418.field6298, class461.field6877);
        int var8 = class132.method818((byte) -93, arg1, class418.field6298, class461.field6877);
        int var9 = class132.method818((byte) -93, arg5, class113.field1385, class4.field43);
        int var10 = class132.method818((byte) -93, arg4, class113.field1385, class4.field43);
        int var11 = class132.method818((byte) -93, arg0 + arg6, class418.field6298, class461.field6877);
        int var12 = class132.method818((byte) -93, arg1 - arg6, class418.field6298, class461.field6877);
        for (int var13 = var7; var13 < var11; var13++) {
            class645.method3675(88, class402.field6087[var13], arg3, var9, var10);
        }
        if (arg2 != 0) {
            field6862 = null;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class645.method3675(111, class402.field6087[var14], arg3, var9, var10);
        }
        int var15 = class132.method818((byte) -93, arg5 + arg6, class113.field1385, class4.field43);
        int var16 = class132.method818((byte) -93, arg4 - arg6, class113.field1385, class4.field43);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class402.field6087[var17];
            class645.method3675(111, var18, arg3, var9, var15);
            class645.method3675(103, var18, arg3, var16, var10);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static void method2834(int arg0) {
        field6868 = null;
        if (arg0 != 9195) {
            field6868 = null;
        }
        field6862 = null;
    }
}
