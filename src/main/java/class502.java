import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class class502 {

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public int field7400 = 4;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[S")
    private short[] field7397 = new short[512];

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    private int field7402 = 4;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    private int field7398 = 0;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    private int field7403 = 4;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    private int field7406 = 4;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "Liv;")
    public static class64 field7407;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "Lug;")
    public static class392 field7411;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "[I")
    public static int[] field7409;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "[S")
    private short[] field7410;

    static {
        new class342("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class342("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field7407 = new class64(59, 7);
        field7411 = new class392();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 7)
    private final void method3002(int arg0) {
        field7396++;
        Random var2 = new Random((long) this.field7398);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field7397[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class455.method2714(var2, var5, arg0 ^ 0xFFFFC9E8);
            short var7 = this.field7397[var6];
            this.field7397[var6] = this.field7397[var5];
            this.field7397[var5] = this.field7397[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 44)
    public static void method3003(int arg0) {
        field7409 = null;
        field7407 = null;
        if (arg0 != -4096) {
            method3003(-61);
        }
        field7411 = null;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIII)V", line = 349)
    public class502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7400 = arg1;
        this.field7406 = arg2;
        this.field7398 = arg0;
        this.field7403 = arg3;
        this.field7402 = arg4;
        this.method3005(true);
        this.method3002(0);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)V", line = 71)
    public final void method3004(int arg0, int arg1, int arg2, int arg3) {
        field7399++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method447(arg2);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field7400; var14++) {
                        int var15 = this.field7410[var14] << 12;
                        int var16 = var8[var11] * var15 >> 12;
                        int var17 = this.field7406 * var15 >> 12;
                        int var18 = this.field7403 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field7402 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field7403 * var19;
                        int var23 = this.field7406 * var21;
                        int var24 = this.field7402 * var16;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var29 >= var18) {
                            var34 = 0;
                        } else {
                            var34 = var29 & 0xFF;
                        }
                        int var35;
                        if (var17 > var26) {
                            var35 = var26 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var23 & 0xFFF;
                        int var37;
                        if (var32 < var20) {
                            var37 = var32 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var31 & 0xFF;
                        int var39 = var22 & 0xFFF;
                        int var40 = class464.field6943[var36];
                        int var41 = class464.field6943[var33];
                        short var42 = this.field7397[var38];
                        int var43 = var39 - 4096;
                        int var44 = var36 - 4096;
                        int var45 = var33 - 4096;
                        short var46 = this.field7397[var37];
                        int var47 = class464.field6943[var39];
                        short var48 = this.field7397[var30 + var46];
                        short var49 = this.field7397[var34 + var46];
                        short var50 = this.field7397[var34 + var42];
                        short var51 = this.field7397[var30 + var42];
                        int var52 = class391.method2413(this.field7397[var28 + var51], 0, var39, var36, var33);
                        int var53 = class391.method2413(this.field7397[var35 + var51], 0, var39, var44, var33);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class391.method2413(this.field7397[var28 + var50], arg2 - 4, var43, var36, var33);
                        int var56 = class391.method2413(this.field7397[var35 + var50], arg2 - 4, var43, var44, var33);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = class391.method2413(this.field7397[var28 + var48], 0, var39, var36, var45);
                        int var59 = ((var57 - var54) * var47 >> 12) + var54;
                        int var60 = class391.method2413(this.field7397[var35 + var48], 0, var39, var44, var45);
                        int var61 = ((var60 - var58) * var40 >> 12) + var58;
                        int var62 = class391.method2413(this.field7397[var28 + var49], arg2 - 4, var43, var36, var45);
                        int var63 = class391.method2413(this.field7397[var35 + var49], 0, var43, var44, var45);
                        int var64 = var62 + ((var63 - var62) * var40 >> 12);
                        int var65 = ((var64 - var61) * var47 >> 12) + var61;
                        this.method444(var14, ((var65 - var59) * var41 >> 12) + var59, arg2 + 20);
                    }
                    this.method450(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V", line = 243)
    private final void method3005(boolean arg0) {
        field7401++;
        this.field7410 = new short[this.field7400];
        for (int var2 = 0; var2 < this.field7400; var2++) {
            this.field7410[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (!arg0) {
            this.field7398 = -4;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)V", line = 267)
    public static final void method3006(byte arg0, int arg1) {
        field7404++;
        int var2 = 11 % ((-arg1 - 5) / 35);
        if (class413.field6171 == null) {
            class413.field6171 = new byte[4][class33.field662][class121.field1966];
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class33.field662; var4++) {
                for (int var5 = 0; var5 < class121.field1966; var5++) {
                    class413.field6171[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)Ljq;", line = 302)
    public static final class353 method3007(boolean arg0) {
        field7405++;
        if (class509.field7494 == null || class355.field5421 == null) {
            return null;
        }
        if (!arg0) {
            field7407 = null;
        }
        class355.field5421.method3058(50, class509.field7494);
        class353 var1 = (class353) class355.field5421.method3056(!arg0);
        if (var1 == null) {
            return null;
        } else {
            class447 var2 = class509.field7486.method1812((byte) 28, var1.field5397);
            return var2 != null && var2.field6667 && var2.method2668(113, class509.field7487) ? var1 : class101.method750(-21654);
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
    public abstract void method447(int arg0);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
    public abstract void method444(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
    public abstract void method450(int arg0);
}
