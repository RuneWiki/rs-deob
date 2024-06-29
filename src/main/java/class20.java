import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 extends class243 {

    @OriginalMember(owner = "client!an", name = "h", descriptor = "[I")
    private int[] field224 = new int[512];

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "[I")
    public static int[] field228;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "F")
    public static float field227;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field225;

    static {
        new class475("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field226 = 0;
        new class475("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field228 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IBIIII[B)V", line = 5)
    public static final void method129(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field220++;
        if (arg5 > 0 && !class415.method2495(1, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class415.method2495(1, arg0)) {
            int var7 = class414.method2490(-31968, arg2);
            int var8 = 0;
            int var9 = arg0 <= arg5 ? arg0 : arg5;
            if (arg1 >= -118) {
                field228 = null;
            }
            int var10 = arg5 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg6;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var8, arg4, arg5, arg0, 0, arg2, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg5 = var10;
                arg0 = var11;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)I", line = 102)
    public static final int method130(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field223++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            int var5 = -6 / ((arg1 + 27) / 63);
            return arg3;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V", line = 124)
    public static final void method131(int arg0, int arg1) {
        if (arg0 != 25154) {
            field227 = 0.8419548F;
        }
        field222++;
        class338 var2 = class230.method1580(11, -1332166328, arg1);
        var2.method2052(100);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 137)
    public static final int method132(String arg0, int arg1) {
        field221++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - arg0.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 158)
    public static void method133(int arg0) {
        if (arg0 < 85) {
            method132(null, 104);
        }
        field228 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III[FFIFFZIF)V", line = 173)
    public final void method134(int arg0, int arg1, int arg2, float[] arg3, float arg4, int arg5, float arg6, float arg7, boolean arg8, int arg9, float arg10) {
        field218++;
        int var12 = (int) ((float) arg5 * arg4 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg2 * arg7 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg9 * arg6 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg0 * arg6;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class418.method2505(var21, true);
        int var25 = var19 & var17;
        int var26 = this.field224[var25];
        if (arg8) {
            field228 = null;
        }
        int var27 = this.field224[var23];
        for (int var28 = 0; var28 < arg2; var28++) {
            float var29 = (float) var28 * arg7;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class418.method2505(var32, !arg8);
            int var36 = var31 & var15;
            int var37 = this.field224[var26 + var34];
            int var38 = this.field224[var26 + var36];
            int var39 = this.field224[var27 + var34];
            int var40 = this.field224[var27 + var36];
            for (int var41 = 0; var41 < arg5; var41++) {
                float var42 = (float) var41 * arg4;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class418.method2505(var45, !arg8);
                int var48 = var44 & var13;
                int var49 = var43 & var13;
                arg3[arg1++] = class234.method1593(class234.method1593(class234.method1593(class333.method2027(var22, var33, var46, class286.method1847(7, this.field224[var37 + var49]), 2), class333.method2027(var22, var33, var45, class286.method1847(7, this.field224[var37 + var48]), 2), -14002, var47), class234.method1593(class333.method2027(var22, var32, var46, class286.method1847(this.field224[var38 + var49], 7), 2), class333.method2027(var22, var32, var45, class286.method1847(this.field224[var38 + var48], 7), 2), -14002, var47), -14002, var35), class234.method1593(class234.method1593(class333.method2027(var21, var33, var46, class286.method1847(7, this.field224[var39 + var49]), 2), class333.method2027(var21, var33, var45, class286.method1847(this.field224[var39 + var48], 7), 2), -14002, var47), class234.method1593(class333.method2027(var21, var32, var46, class286.method1847(this.field224[var40 + var49], 7), 2), class333.method2027(var21, var32, var45, class286.method1847(7, this.field224[var40 + var48]), 2), -14002, var47), -14002, var35), -14002, var24) * arg10;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V", line = 354)
    public class20(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field224[var3] = this.field224[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field224[var5];
            this.field224[var5] = this.field224[var5 + 256] = this.field224[var4];
            this.field224[var4] = this.field224[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(II)V", line = 272)
    public static final void method135(int arg0, int arg1) {
        if (arg1 == 37) {
            class460.field6813 = 3.0F;
        } else if (arg1 == 50) {
            class460.field6813 = 4.0F;
        } else if (arg1 == 75) {
            class460.field6813 = 6.0F;
        } else if (arg1 == 100) {
            class460.field6813 = 8.0F;
        } else if (arg1 == 200) {
            class460.field6813 = 16.0F;
        }
        class83.field1289 = -1;
        field219++;
        if (arg0 != 191) {
            field228 = null;
        }
        class83.field1289 = -1;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 304)
    public static final void method136(int arg0) {
        if (class432.field6461.toLowerCase().indexOf("microsoft") == -1) {
            class244.field3609[59] = 57;
            class244.field3609[44] = 71;
            class244.field3609[45] = 26;
            if (class432.field6474 == null) {
                class244.field3609[192] = 58;
                class244.field3609[222] = 59;
            } else {
                class244.field3609[192] = 28;
                class244.field3609[222] = 58;
                class244.field3609[520] = 59;
            }
            class244.field3609[46] = 72;
            class244.field3609[47] = 73;
            class244.field3609[91] = 42;
            class244.field3609[93] = 43;
            class244.field3609[92] = 74;
            class244.field3609[61] = 27;
        } else {
            class244.field3609[190] = 72;
            class244.field3609[219] = 42;
            class244.field3609[220] = 74;
            class244.field3609[187] = 27;
            class244.field3609[191] = 73;
            class244.field3609[223] = 28;
            class244.field3609[186] = 57;
            class244.field3609[188] = 71;
            class244.field3609[222] = 59;
            class244.field3609[221] = 43;
            class244.field3609[189] = 26;
            class244.field3609[192] = 58;
        }
        if (arg0 != 9235) {
            method130(22, 124, 97, 59);
        }
        field225++;
    }
}
