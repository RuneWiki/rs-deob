import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class130 {

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "S")
    public static short field2229 = 320;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2233 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lik;")
    public static class262 field2224;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lhn;")
    public class34 field2223;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
    public int[] field2227;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[Lvd;")
    public static class135[] field2226;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method892(byte arg0, int arg1) {
        field2230++;
        class217.method1491(class217.field3861, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        if (arg0 == -26) {
            class217.method1496(-50.0F, -60.0F, -50.0F);
            class217.method1488(class217.field3868, 0);
            class217.method1489();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZZLik;ILik;)Lee;", line = 22)
    public static final class284 method893(boolean arg0, boolean arg1, class262 arg2, int arg3, class262 arg4) {
        field2232++;
        boolean var5 = true;
        int[] var6 = arg4.method1889((byte) -28, arg3);
        if (arg0) {
            field2233 = -34;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method1888(arg3, var6[var7], 103);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg2.method1888(0, var9, 49);
                } else {
                    var10 = arg2.method1888(var9, 0, 28);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class284(arg4, arg2, arg3, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 77)
    public static void method894(int arg0) {
        field2226 = null;
        if (arg0 != 907485512) {
            field2225 = 111;
        }
        field2224 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILik;)V", line = 91)
    public static final void method895(int arg0, class262 arg1) {
        class313.field5408 = class160.method1107(class154.field2767, arg1, (byte) 57);
        class60.field931 = new int[256];
        field2234++;
        int var2 = -27 / ((arg0 - 32) / 47);
        for (int var3 = 0; var3 < 3; var3++) {
            float var4 = (float) (class117.field2030[var3] >> 16 & 0xFF);
            int var5 = class117.field2030[var3 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            int var7 = class117.field2030[var3 + 1] >> 8 & 0xFF;
            float var8 = (float) ((class117.field2030[var3] & 0xFF00) >> 8);
            float var9 = ((float) var7 - var8) / 64.0F;
            float var10 = (float) (class117.field2030[var3] & 0xFF);
            int var11 = class117.field2030[var3 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class60.field931[var3 * 64 + var13] = class242.method1674((int) var10, class242.method1674((int) var4 << 16, (int) var8 << 8));
                var4 += var6;
                var8 += var9;
                var10 += var12;
            }
        }
        for (int var14 = 192; var14 < 255; var14++) {
            class60.field931[var14] = class117.field2030[3];
        }
        class52.field764 = new int[32768];
        class282.field4943 = new int[32768];
        class283.method2034(false, (class257) null);
        class17.field235 = new int[32768];
        class19.field282 = new int[32768];
        if (class231.field4051) {
            class81.field1268 = new class214(128, 254);
        } else {
            class81.field1268 = new class12(128, 254);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 165)
    public static final void method896() {
        for (int var0 = 0; var0 < class74.field1146; var0++) {
            class326 var1 = class182.field3349[var0];
            class268.method1941(var1);
            class182.field3349[var0] = null;
        }
        class74.field1146 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIBII)V", line = 187)
    public static final void method897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg1 == arg3 && arg2 == arg9 && arg0 == arg4 && arg5 == arg6) {
            class252.method1782(arg9, arg4, arg5, 349598156, arg3, arg8);
        } else {
            int var10 = arg3;
            int var11 = arg9 * 3;
            int var12 = arg9;
            int var13 = arg3 * 3;
            int var14 = arg1 * 3;
            int var15 = arg2 * 3;
            int var16 = arg0 * 3;
            int var17 = arg6 * 3;
            int var18 = arg4 + var14 - arg3 - var16;
            int var19 = var13 + var16 - var14 - var14;
            int var20 = arg5 + var15 - var17 - arg9;
            int var21 = var11 + var17 - var15 - var15;
            int var22 = var14 - var13;
            int var23 = var15 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var26;
                int var29 = var21 * var25;
                int var30 = var19 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg3 + (var27 + var30 + var31 >> 12);
                int var34 = (var28 + var29 + var32 >> 12) + arg9;
                class252.method1782(var12, var33, var34, 349598156, var10, arg8);
                var12 = var34;
                var10 = var33;
            }
        }
        int var35 = -47 / ((arg7 - 32) / 56);
        field2228++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 260)
    public static final void method898(int arg0) {
        class209.field3738 = arg0;
        for (int var1 = 0; var1 < class320.field5489; var1++) {
            for (int var2 = 0; var2 < class325.field5535; var2++) {
                if (class99.field1759[arg0][var1][var2] == null) {
                    class99.field1759[arg0][var1][var2] = new class74(arg0, var1, var2);
                }
            }
        }
    }
}
