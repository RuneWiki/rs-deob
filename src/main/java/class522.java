import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class522 {

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    private int field7712 = 0;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    private int field7721 = 4;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public int field7718 = 4;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "[S")
    private short[] field7725 = new short[512];

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    private int field7719 = 4;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    private int field7728 = 4;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "S")
    public static short field7723;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "F")
    public static float field7724;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "[I")
    public static int[] field7720;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "[S")
    private short[] field7727;

    static {
        new class304("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field7723 = 1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 3)
    public static void method3074(byte arg0) {
        field7720 = null;
        if (arg0 != 55) {
            method3074((byte) -101);
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V", line = 14)
    private final void method3075(byte arg0) {
        field7711++;
        Random var2 = new Random((long) this.field7712);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field7725[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != 77) {
            method3074((byte) 3);
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class363.method2116(var5, var2, true);
            short var7 = this.field7725[var6];
            this.field7725[var6] = this.field7725[var5];
            this.field7725[var5] = this.field7725[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 57)
    private final void method3076(int arg0) {
        this.field7727 = new short[this.field7718];
        field7722++;
        int var2 = -103 % ((arg0 + 36) / 48);
        for (int var3 = 0; var3 < this.field7718; var3++) {
            this.field7727[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIII)V", line = 436)
    public class522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7712 = arg0;
        this.field7719 = arg2;
        this.field7728 = arg4;
        this.field7718 = arg1;
        this.field7721 = arg3;
        this.method3076(15);
        this.method3075((byte) 77);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII)V", line = 84)
    public final void method3077(int arg0, int arg1, int arg2, int arg3) {
        field7708++;
        int[] var5 = new int[arg3];
        if (arg1 >= -8) {
            return;
        }
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg3; var7++) {
            var5[var7] = (var7 << 12) / arg3;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method917(121);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field7718; var14++) {
                        int var15 = this.field7727[var14] << 12;
                        int var16 = this.field7721 * var15 >> 12;
                        int var17 = this.field7719 * var15 >> 12;
                        int var18 = this.field7728 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var8[var11] * var15 >> 12;
                        int var22 = this.field7728 * var21;
                        int var23 = this.field7721 * var20;
                        int var24 = this.field7719 * var19;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var29 < var16) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var30 & 0xFF;
                        int var35 = var22 & 0xFFF;
                        int var36 = var24 & 0xFFF;
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var17 > var26) {
                            var38 = var26 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39;
                        if (var32 < var18) {
                            var39 = var32 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class200.field2776[var36];
                        int var41 = var36 - 4096;
                        short var42 = this.field7725[var39];
                        int var43 = var35 - 4096;
                        int var44 = class200.field2776[var37];
                        int var45 = class200.field2776[var35];
                        short var46 = this.field7725[var34];
                        int var47 = var37 - 4096;
                        short var48 = this.field7725[var31 + var46];
                        short var49 = this.field7725[var33 + var46];
                        short var50 = this.field7725[var33 + var42];
                        short var51 = this.field7725[var31 + var42];
                        int var52 = class240.method1479(0, var36, this.field7725[var28 + var48], var35, var37);
                        int var53 = class240.method1479(0, var41, this.field7725[var38 + var48], var35, var37);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class240.method1479(0, var36, this.field7725[var28 + var49], var35, var47);
                        int var56 = class240.method1479(0, var41, this.field7725[var38 + var49], var35, var47);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = ((var57 - var54) * var44 >> 12) + var54;
                        int var59 = class240.method1479(0, var36, this.field7725[var28 + var51], var43, var37);
                        int var60 = class240.method1479(0, var41, this.field7725[var38 + var51], var43, var37);
                        int var61 = ((var60 - var59) * var40 >> 12) + var59;
                        int var62 = class240.method1479(0, var36, this.field7725[var28 + var50], var43, var47);
                        int var63 = class240.method1479(0, var41, this.field7725[var38 + var50], var43, var47);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = ((var64 - var61) * var44 >> 12) + var61;
                        this.method920(var14, 1, ((var65 - var58) * var45 >> 12) + var58);
                    }
                    this.method921((byte) 114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)V", line = 255)
    public static final void method3078(int arg0, int arg1, int arg2) {
        field7710++;
        if (arg1 >= -101) {
            return;
        }
        if (class115.field1637 != arg0) {
            class195.field2715 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class195.field2715[var3] = (var3 << 12) / arg0;
            }
            class115.field1637 = arg0;
            class147.field2078 = arg0 * 32;
            class305.field4023 = arg0 - 1;
        }
        if (class494.field6866 == arg2) {
            return;
        }
        if (class115.field1637 == arg2) {
            class273.field3590 = class195.field2715;
        } else {
            class273.field3590 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class273.field3590[var4] = (var4 << 12) / arg2;
            }
        }
        class511.field7361 = arg2 - 1;
        class494.field6866 = arg2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(DZ)V", line = 322)
    public static final void method3079(double arg0, boolean arg1) {
        if (class485.field6756 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class421.field5767[var3] = var4 <= 255 ? var4 : 255;
            }
            class485.field6756 = arg0;
        }
        if (arg1) {
            field7713++;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V", line = 348)
    public static final void method3080(int arg0, int arg1) {
        field7717++;
        int var2 = class31.field516 - class286.field3747;
        if (var2 >= 100) {
            class42.field623 = 1;
            return;
        }
        int var3 = (int) class426.field5820;
        if (var3 < class366.field4952 >> 8) {
            var3 = class366.field4952 >> 8;
        }
        if (class265.field3504[4] && var3 < (class222.field2990[4] + 128)) {
            var3 = class222.field2990[4] + 128;
        }
        int var4 = (int) class184.field2621 + class336.field4405 & 0x3FFF;
        class170.method1137(arg1, arg0 + 890669940, class429.field5883, var4, var3, class210.method1330(class411.field5656, (byte) -106, class385.field5232.field584, class385.field5232.field574) - 50, (var3 >> 3) * 3 + 600 << 0, class150.field2135);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class365.field4937 = (int) ((float) (class365.field4937 - class286.field3749) * var5 + (float) class286.field3749);
        class168.field2439 = (int) ((float) (class168.field2439 - class208.field2856) * var5 + (float) class208.field2856);
        class168.field2438 = (int) ((float) (class168.field2438 - class46.field682) * var5 + (float) class46.field682);
        class430.field5888 = (int) ((float) (class430.field5888 - class497.field6884) * var5 + (float) class497.field6884);
        int var6 = class207.field2854 - class477.field6577;
        if (arg0 != -9765) {
            method3074((byte) -34);
        }
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class207.field2854 = (int) ((float) var6 * var5 + (float) class477.field6577);
        class207.field2854 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V", line = 409)
    public static final void method3081(int arg0) {
        field7709++;
        if (class209.field2866 || arg0 != -257) {
            return;
        }
        if (class154.field2244.field7738) {
            class184.field2621 = ((int) class184.field2621 + 191 & 0xFFFFFF80);
        } else {
            class467.field6440 += (24.0F - class467.field6440) / 2.0F;
        }
        class104.field1531 = true;
        class209.field2866 = true;
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V")
    public abstract void method921(byte arg0);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
    public abstract void method920(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
    public abstract void method917(int arg0);
}
