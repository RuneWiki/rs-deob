import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class579 extends class255 {

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "[I")
    private int[] field8182 = new int[512];

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8178 = new BigInteger("8204013232bc4e4e727b2641e0a0ba41d3ad6f01ebde2b9f6a0134e88dbbe990c4c34a75d9b717a4e47c8c702125effcc5d98c914340642f28fcf2855169504afc39e59929083b7a32c237bf665dc089f1386e26a10c3dd6a66d973b13b8ce59543c8e3317b6c5ad2ce3625f67f8ccc9edc4e7af8fccda07e57529aae8cdd176d137cb8a8361760c829a5ff1074ec75bf9754cc8b3d388a04703a91ba595643161bd211461e7611cc7720e12861cc16cb92fa63ff6156b3245300945453c549725277f190c18c54aa0e0e92cbcff5d24598a377f1a78891267d1c5b3795f4bbb1d599d16ecb5dbf644f8a202976499b25692d5ace4c4559d595603920ffcca2eb94b11fe7f3db7f862ebd0f49a88493ca9532661b9ac0af6d693d797739f198a55dc9078b82bcf504d6f076b5be5306c6742c867426182f8af7c4422da2dffaf00c810838f48d2dbe27d1bae5d6d47b7c0a9b54d2ecd674a82b18918d92f98553ba69bb9dab543a891999005d347d88f0b7346eeed71188b2d569117e71b2b175f63abc9b43c9ff6957c1a25cff16610bb09ae285f37cbfffaa4c438609d5139ed88b7a09c94bee55ab1d4a6a4c116caef9766768186e728eb5e55a5c99ddd7e67e57b712970a02b747c4637741736316fee8fafae22d0ce3fef12f1656104278f4a127ce0eeafe4618d6cc72eac94a11678769fdb46550695d59fd16ea76947", 16);

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Z")
    public static boolean field8180 = false;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
    public static int[] field8176;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([Ljava/lang/String;I)V", line = 4)
    public static final void method3348(String[] arg0, int arg1) {
        field8177++;
        if (arg0.length > 1) {
            for (int var2 = 0; var2 < arg0.length; var2++) {
                if (arg0[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg0[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class569.method3326("Pausing for " + var3 + " seconds...", (byte) -42);
                    class298.field4136 = var2 + 1;
                    class162.field2398 = arg0;
                    class202.field2885 = class742.method4128(1) + (long) (var3 * 1000);
                    return;
                }
                class718.field10065 = arg0[var2];
                class215.method1498(-122, false);
            }
        } else {
            class718.field10065 = class718.field10065 + arg0[0];
            class129.field1942 += arg0[0].length();
        }
        if (arg1 != 7281) {
            field8180 = true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 51)
    public static void method3349(boolean arg0) {
        field8178 = null;
        if (!arg0) {
            field8176 = null;
        }
        field8176 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(FIII[FIFFBFI)V", line = 70)
    public final void method1738(float arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, float arg6, float arg7, byte arg8, float arg9, int arg10) {
        field8181++;
        int var12 = (int) ((float) arg10 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg6 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg1 * arg9 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg5 * arg9;
        int var19 = (int) var18;
        if (arg8 <= 68) {
            return;
        }
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        float var25 = class339.method2154(-70, var21);
        int var26 = this.field8182[var23];
        int var27 = this.field8182[var24];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg6;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            int var35 = var30 & var15;
            float var36 = class339.method2154(-113, var32);
            int var37 = this.field8182[var35 + var26];
            int var38 = this.field8182[var26 + var34];
            int var39 = this.field8182[var27 + var35];
            int var40 = this.field8182[var27 + var34];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class339.method2154(113, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg4[arg2++] = arg7 * class606.method3507(class606.method3507(class606.method3507(class631.method3632(var21, class555.method3246(7, this.field8182[var40 + var49]), (byte) -80, var45, var32), -5, var47, class631.method3632(var21, class555.method3246(7, this.field8182[var40 + var48]), (byte) -78, var46, var32)), -5, var36, class606.method3507(class631.method3632(var21, class555.method3246(this.field8182[var39 + var49], 7), (byte) -124, var45, var33), -5, var47, class631.method3632(var21, class555.method3246(7, this.field8182[var39 + var48]), (byte) 88, var46, var33))), -5, var25, class606.method3507(class606.method3507(class631.method3632(var22, class555.method3246(7, this.field8182[var38 + var49]), (byte) 102, var45, var32), -5, var47, class631.method3632(var22, class555.method3246(7, this.field8182[var38 + var48]), (byte) 106, var46, var32)), -5, var36, class606.method3507(class631.method3632(var22, class555.method3246(this.field8182[var37 + var49], 7), (byte) 62, var45, var33), -5, var47, class631.method3632(var22, class555.method3246(this.field8182[var37 + var48], 7), (byte) 28, var46, var33))));
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V", line = 165)
    public class579(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field8182[var3] = this.field8182[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field8182[var5];
            this.field8182[var5] = this.field8182[var5 + 256] = this.field8182[var4];
            this.field8182[var4] = this.field8182[var4 + 256] = var6;
        }
    }
}
