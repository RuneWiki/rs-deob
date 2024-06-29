import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class400 extends class263 {

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "[B")
    public byte[] field5074;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "[I")
    public static int[] field5076 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method2254(int arg0, int arg1, boolean arg2, int arg3) {
        field5077++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        if (arg3 > -32) {
            method2256(-39);
        }
        if (!arg2 || arg1 < 0) {
            return Integer.toString(arg1, arg0);
        }
        int var4 = 2;
        int var5 = arg1 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        char[] var6 = new char[var4];
        var6[0] = '+';
        for (int var7 = var4 - 1; var7 > 0; var7--) {
            int var8 = arg1;
            arg1 /= arg0;
            int var9 = var8 - (arg0 * arg1);
            if (var9 < 10) {
                var6[var7] = (char) (var9 + 48);
            } else {
                var6[var7] = (char) (var9 + 87);
            }
        }
        return new String(var6);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Loa;Lnt;IIIII)V")
    public static final void method2255(class650 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class709.field9904 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class546.field6871) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class36.field538 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class565 var15 = class407.field5237[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class299.field3801[var12].method201(var13, var14) + class299.field3801[var12].method201(var13 + 1, var14) + class299.field3801[var12].method201(var13, var14 + 1) + class299.field3801[var12].method201(var13 + 1, var14 + 1)) / 4 - (class299.field3801[arg2].method201(arg3, arg4) + class299.field3801[arg2].method201(arg3 + 1, arg4) + class299.field3801[arg2].method201(arg3, arg4 + 1) + class299.field3801[arg2].method201(arg3 + 1, arg4 + 1)) / 4;
                                    class567 var17 = var15.field7079;
                                    class567 var18 = var15.field7087;
                                    if (var17 != null && var17.method137(-67)) {
                                        arg1.method135(var7, arg0, var17, var16, (var14 - arg4) * class97.field1256 + (1 - arg6) * class660.field8949, (var13 - arg3) * class97.field1256 + (1 - arg5) * class660.field8949, 12137);
                                    }
                                    if (var18 != null && var18.method137(-31)) {
                                        arg1.method135(var7, arg0, var18, var16, (var14 - arg4) * class97.field1256 + (1 - arg6) * class660.field8949, (var13 - arg3) * class97.field1256 + (1 - arg5) * class660.field8949, 12137);
                                    }
                                    for (class436 var19 = var15.field7074; var19 != null; var19 = var19.field5485) {
                                        class597 var20 = var19.field5486;
                                        if (var20 != null && var20.method137(-82) && (var20.field8017 == var13 || var8 == var13) && (var20.field8014 == var14 || var10 == var14)) {
                                            int var21 = var20.field8005 + 1 - var20.field8017;
                                            int var22 = var20.field8008 + 1 - var20.field8014;
                                            arg1.method135(var7, arg0, var20, var16, (var20.field8014 - arg4) * class97.field1256 + (var22 - arg6) * class660.field8949, (var20.field8017 - arg3) * class97.field1256 + (var21 - arg5) * class660.field8949, 12137);
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

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method2256(int arg0) {
        if (arg0 != 17213) {
            field5075 = -98;
        }
        field5076 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B[B)V")
    public static final void method2257(byte arg0, byte[] arg1) {
        field5078++;
        if (arg0 > -18) {
            method2254(50, -32, true, 111);
        }
        class572 var2 = new class572(arg1);
        while (true) {
            int var3 = var2.method3097((byte) 12);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class343.field4375 = var2.method3031(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "([B)V")
    public class400(byte[] arg0) {
        this.field5074 = arg0;
    }
}
