import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class65 extends class539 {

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Len;")
    public class289 field852;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Lfc;")
    public static class235 field861 = new class235(40, 10);

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field864 = new BigInteger("8b1388604eedbe953e057ac7a41bb8ba727ef3f12f43ca7d9fc7430fcd5ffe07dce0d4aef4faf510ce928692b8bbcd1c9c40630bebff4193e2b46c9d814abb69", 16);

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
    public boolean field857;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)Z")
    public abstract boolean method522(boolean arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
    public static final int method523(int arg0, int arg1) {
        field856++;
        if (arg0 < 96) {
            return 0;
        } else {
            if (arg1 != 510558785) {
                method535(8, -85, 70, 42, -4, (byte) -23);
            }
            return arg0 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[I[IB)V")
    public static final void method524(int arg0, int arg1, int[] arg2, int[] arg3, byte arg4) {
        field859++;
        if (arg1 > arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if (arg3[var10] < (var10 & var9) + var7) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method524(arg0, var6 - 1, arg2, arg3, (byte) -79);
            method524(var6 + 1, arg1, arg2, arg3, (byte) -92);
        }
        if (arg4 > -66) {
            method523(73, -32);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)I")
    public final int method525(int arg0) {
        field858++;
        if (arg0 < 54) {
            method533(-102);
        }
        return 1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZII)V")
    public abstract void method526(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)V")
    public abstract void method527(int arg0, byte arg1);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public abstract void method528(byte arg0);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Z")
    public abstract boolean method529(int arg0);

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(Z)I")
    public int method530(boolean arg0) {
        if (arg0) {
            this.method536((byte) -71);
        }
        field863++;
        return 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lwaa;BLwaa;I)V")
    public abstract void method531(class646 arg0, byte arg1, class646 arg2, int arg3);

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static final void method532(int arg0) {
        class66.method539((byte) 103, class274.field3872.field913);
        field853++;
        int var1 = (class511.field6989 >> 3) + (class172.field2572 >> 12);
        class233.field3305 = class253.field3576.field520 = 0;
        int var2 = (class124.field1726 >> 3) + (class117.field1563 >> 12);
        class253.field3576.method1718(8, 8, (byte) -120);
        byte var3 = 18;
        class283.field3935 = new int[var3][4];
        class298.field4458 = new byte[var3][];
        class234.field3367 = new int[var3];
        class590.field8213 = new byte[var3][];
        class73.field1019 = new int[var3];
        class377.field5331 = new byte[var3][];
        class417.field5874 = new byte[var3][];
        class684.field9628 = new int[var3];
        class180.field2663 = new int[var3];
        class105.field1407 = new int[var3];
        class72.field1001 = new int[var3];
        class313.field4658 = new byte[var3][];
        int var4 = arg0;
        for (int var5 = (var1 - (class86.field1185 >> 4)) / 8; var5 <= (((class86.field1185 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class526.field7212 >> 4)) / 8; var8 <= ((class526.field7212 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class234.field3367[var4] = var9;
                class684.field9628[var4] = class11.field211.method920(2, "m" + var5 + "_" + var8);
                class73.field1019[var4] = class11.field211.method920(class602.method3336(arg0, 2), "l" + var5 + "_" + var8);
                class105.field1407[var4] = class11.field211.method920(2, "n" + var5 + "_" + var8);
                class180.field2663[var4] = class11.field211.method920(2, "um" + var5 + "_" + var8);
                class72.field1001[var4] = class11.field211.method920(class602.method3336(arg0, 2), "ul" + var5 + "_" + var8);
                if (class105.field1407[var4] == -1) {
                    class684.field9628[var4] = -1;
                    class73.field1019[var4] = -1;
                    class180.field2663[var4] = -1;
                    class72.field1001[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class105.field1407.length; var6++) {
            class105.field1407[var6] = -1;
            class684.field9628[var6] = -1;
            class73.field1019[var6] = -1;
            class180.field2663[var6] = -1;
            class72.field1001[var6] = -1;
        }
        byte var7;
        if (class340.field4947 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class469.method2672(var2, false, 1, var1, var7);
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V")
    public static void method533(int arg0) {
        if (arg0 != -1) {
            method523(-57, 26);
        }
        field864 = null;
        field861 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Z")
    public final boolean method534(byte arg0) {
        int var2 = -63 / ((arg0 - 69) / 54);
        field854++;
        return false;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Len;)V")
    public class65(class289 arg0) {
        this.field852 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIB)V")
    public static final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field855++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = 83 / ((33 - arg5) / 63);
        int var9 = arg0 * arg0;
        int var10 = arg2 * arg2;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg2 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var10 - ((var13 - 1) * var12);
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg2 << 1) - 3) * var12;
        int var20 = (var6 + 1) * var17;
        class548.method3012(arg3 + arg0, (byte) 23, arg1, arg3 - arg0, class476.field6655[arg4]);
        int var21 = (arg2 - 1) * var16;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var18;
                    var15 += var20;
                    var6++;
                    var18 += var17;
                    var20 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var18 += var17;
                var6++;
                var20 += var17;
            }
            var14 += -var21;
            var15 += -var19;
            var7--;
            var19 -= var16;
            var21 -= var16;
            int var22 = arg4 - var7;
            int var23 = arg4 + var7;
            int var24 = arg3 + var6;
            int var25 = arg3 - var6;
            class548.method3012(var24, (byte) 23, arg1, var25, class476.field6655[var22]);
            class548.method3012(var24, (byte) 23, arg1, var25, class476.field6655[var23]);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z")
    public final boolean method536(byte arg0) {
        field860++;
        int var2 = -38 / ((arg0 + 23) / 61);
        return this.field857;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(Z)[I")
    public static final int[] method537(boolean arg0) {
        field862++;
        if (arg0) {
            field861 = null;
        }
        return new int[] { class459.field6499, class97.field1322, class235.field3396 };
    }
}
