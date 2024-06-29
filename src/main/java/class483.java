import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class483 extends class154 {

    @OriginalMember(owner = "client!iga", name = "F", descriptor = "Lvca;")
    private class297 field6534;

    @OriginalMember(owner = "client!iga", name = "o", descriptor = "Lhk;")
    private class111 field6517;

    @OriginalMember(owner = "client!iga", name = "n", descriptor = "Lbq;")
    private class307 field6516;

    @OriginalMember(owner = "client!iga", name = "t", descriptor = "I")
    private int field6522;

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
    private int field6513;

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
    private int field6514;

    @OriginalMember(owner = "client!iga", name = "K", descriptor = "I")
    private int field6538;

    @OriginalMember(owner = "client!iga", name = "L", descriptor = "[[F")
    private float[][] field6539;

    @OriginalMember(owner = "client!iga", name = "p", descriptor = "[[F")
    private float[][] field6518;

    @OriginalMember(owner = "client!iga", name = "s", descriptor = "[[F")
    private float[][] field6521;

    @OriginalMember(owner = "client!iga", name = "M", descriptor = "I")
    private int field6540;

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "Lnc;")
    private class26 field6512;

    @OriginalMember(owner = "client!iga", name = "u", descriptor = "Lnba;")
    private class316 field6523;

    @OriginalMember(owner = "client!iga", name = "A", descriptor = "Lwfa;")
    private class212 field6529;

    @OriginalMember(owner = "client!iga", name = "r", descriptor = "Lnba;")
    private class316 field6520;

    @OriginalMember(owner = "client!iga", name = "D", descriptor = "Lfca;")
    private class93 field6532;

    @OriginalMember(owner = "client!iga", name = "B", descriptor = "Liw;")
    private class335 field6530;

    @OriginalMember(owner = "client!iga", name = "v", descriptor = "Lcja;")
    private class46 field6524;

    @OriginalMember(owner = "client!iga", name = "q", descriptor = "I")
    public static int field6519 = 1;

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
    public static int field6515 = 104;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "Z")
    public static boolean field6511 = false;

    @OriginalMember(owner = "client!iga", name = "E", descriptor = "I")
    public static int field6533 = -1;

    @OriginalMember(owner = "client!iga", name = "G", descriptor = "I")
    public static int field6535 = -1;

    @OriginalMember(owner = "client!iga", name = "w", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!iga", name = "x", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!iga", name = "y", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!iga", name = "C", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!iga", name = "I", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!iga", name = "J", descriptor = "I")
    private int field6537;

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "Lgj;")
    public static class662 field6528;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(III[[ZI)V")
    public final void method2760(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field6536++;
        if (this.field6512 == null || arg1 + arg2 < this.field6522 || (arg1 - arg2) > this.field6513 || arg0 + arg2 < this.field6514 || this.field6538 < arg0 - arg2) {
            return;
        }
        if (arg4 >= -106) {
            method2764(-127, null, null, null, null, -32);
        }
        for (int var6 = this.field6514; var6 <= this.field6538; var6++) {
            for (int var7 = this.field6522; var7 <= this.field6513; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if (var8 > -arg2 && var8 < arg2 && -arg2 < var9 && var9 < arg2 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field6517.method963(255, (int) (this.field6516.method1966((byte) -58) * 255.0F) << 24);
                    this.field6517.method948(this.field6520, 8448, null, null, this.field6523);
                    this.field6517.method951(393, 0, this.field6512, this.field6540, 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIIIIIB)V")
    private final void method2761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6531++;
        long var8 = -1L;
        if (arg6 != 26) {
            method2762(-70);
        }
        int var10 = (arg2 << this.field6534.field4036) + arg3;
        int var11 = arg1 + (arg0 << this.field6534.field4036);
        int var12 = this.field6534.method1907(var10, (byte) -56, var11);
        if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class154 var13 = this.field6524.method337(var8, 1);
            if (var13 != null) {
                this.method2763(119, ((class33) var13).field560);
                return;
            }
        }
        short var14 = (short) (this.field6537++);
        if (var8 != -1L) {
            this.field6524.method341(var8, new class33(var14), (byte) 63);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg1 == 0) {
            var15 = this.field6521[arg4][arg5];
            var16 = this.field6539[arg4][arg5];
            var17 = this.field6518[arg4][arg5];
        } else if (this.field6534.field4035 == arg3 && arg1 == 0) {
            var17 = this.field6518[arg4 + 1][arg5];
            var15 = this.field6521[arg4 + 1][arg5];
            var16 = this.field6539[arg4 + 1][arg5];
        } else if (this.field6534.field4035 == arg3 && this.field6534.field4035 == arg1) {
            var17 = this.field6518[arg4 + 1][arg5 + 1];
            var16 = this.field6539[arg4 + 1][arg5 + 1];
            var15 = this.field6521[arg4 + 1][arg5 + 1];
        } else if (arg3 == 0 && this.field6534.field4035 == arg1) {
            var17 = this.field6518[arg4][arg5 + 1];
            var15 = this.field6521[arg4][arg5 + 1];
            var16 = this.field6539[arg4][arg5 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field6534.field4035;
            float var19 = (float) arg1 / (float) this.field6534.field4035;
            float var20 = this.field6518[arg4][arg5];
            float var21 = this.field6521[arg4][arg5];
            float var22 = this.field6539[arg4][arg5];
            float var23 = this.field6518[arg4 + 1][arg5];
            float var24 = this.field6521[arg4 + 1][arg5];
            float var25 = (this.field6521[arg4][arg5 + 1] - var21) * var18 + var21;
            float var26 = (this.field6521[arg4 + 1][arg5 + 1] - var24) * var18 + var24;
            float var27 = (this.field6518[arg4][arg5 + 1] - var20) * var18 + var20;
            float var28 = (this.field6518[arg4 + 1][arg5 + 1] - var23) * var18 + var23;
            float var29 = this.field6539[arg4 + 1][arg5];
            float var30 = (this.field6539[arg4][arg5 + 1] - var22) * var18 + var22;
            float var31 = (this.field6539[arg4 + 1][arg5 + 1] - var29) * var18 + var29;
            var17 = (var28 - var27) * var19 + var27;
            var15 = (var26 - var25) * var19 + var25;
            var16 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field6516.method1962(0) - var10);
        float var33 = (float) (this.field6516.method1961(arg6 ^ 0xFFFFFF9A) - var12);
        float var34 = (float) (this.field6516.method1958(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field6516.method1963((byte) -7);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6516.method1965(0);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF8E) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field6517.field2000) {
            this.field6530.method2098((float) var10, true);
            this.field6530.method2098((float) var12, true);
            this.field6530.method2098((float) var11, true);
        } else {
            this.field6530.method2101(1836032144, (float) var10);
            this.field6530.method2101(1836032144, (float) var12);
            this.field6530.method2101(1836032144, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field6530.method754(var45, 93);
        this.field6530.method754(var46, 112);
        this.field6530.method754(var47, arg6 ^ 0x31);
        this.field6530.method754(255, 75);
        this.method2763(122, var14);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V")
    public static void method2762(int arg0) {
        if (arg0 >= 43) {
            field6528 = null;
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IS)V")
    private final void method2763(int arg0, short arg1) {
        int var3 = -65 % ((arg0 - 56) / 45);
        field6525++;
        if (this.field6517.field2000) {
            this.field6532.method781(63, arg1);
        } else {
            this.field6532.method748(255, arg1);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;I)V")
    public static final void method2764(int arg0, Color arg1, Color arg2, String arg3, Color arg4, int arg5) {
        try {
            Graphics var6 = class558.field7896.getGraphics();
            if (class471.field6387 == null) {
                class471.field6387 = new Font("Helvetica", 1, 13);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 > -21) {
                field6535 = -33;
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class95.field1473 == null) {
                    class95.field1473 = class558.field7896.createImage(class732.field10098, class108.field1697);
                }
                Graphics var7 = class95.field1473.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class732.field10098, class108.field1697);
                int var8 = class732.field10098 / 2 - 152;
                int var9 = class108.field1697 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + var8 + 2, var9 - -2, 300 - (arg0 * 3), 30);
                var7.setFont(class471.field6387);
                var7.setColor(arg2);
                var7.drawString(arg3, var8 + ((304 - (arg3.length() * 6)) / 2), var9 + 22);
                if (class735.field10155 != null) {
                    var7.setFont(class471.field6387);
                    var7.setColor(arg2);
                    var7.drawString(class735.field10155, class732.field10098 / 2 - (class735.field10155.length() * 6 / 2), class108.field1697 / 2 + -26);
                }
                var6.drawImage(class95.field1473, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class732.field10098, class108.field1697);
                int var10 = class732.field10098 / 2 - 152;
                int var11 = class108.field1697 / 2 - 18;
                var6.setColor(arg1);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg4);
                var6.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg0 * 3 + var10 + 2, var11 - -2, 300 - (arg0 * 3), 30);
                var6.setFont(class471.field6387);
                var6.setColor(arg2);
                if (class735.field10155 != null) {
                    var6.setFont(class471.field6387);
                    var6.setColor(arg2);
                    var6.drawString(class735.field10155, class732.field10098 / 2 - (class735.field10155.length() * 6 / 2), class108.field1697 / 2 + -26);
                }
                var6.drawString(arg3, var10 + ((304 - (arg3.length() * 6)) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class558.field7896.repaint();
        }
        field6526++;
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lhk;Lvca;Lbq;[I)V")
    public class483(class111 arg0, class297 arg1, class307 arg2, int[] arg3) {
        this.field6534 = arg1;
        this.field6517 = arg0;
        this.field6516 = arg2;
        int var5 = this.field6516.method1963((byte) 116) - (arg1.field4035 >> 1);
        this.field6522 = this.field6516.method1962(0) - var5 >> arg1.field4036;
        this.field6513 = var5 + this.field6516.method1962(0) >> arg1.field4036;
        this.field6514 = this.field6516.method1958(true) - var5 >> arg1.field4036;
        this.field6538 = this.field6516.method1958(true) + var5 >> arg1.field4036;
        int var6 = this.field6513 + 1 - this.field6522;
        int var7 = this.field6538 + 1 - this.field6514;
        this.field6539 = new float[var6 + 1][var7 + 1];
        this.field6518 = new float[var6 + 1][var7 + 1];
        this.field6521 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field6514 + var8;
            if (var25 > 0 && this.field6534.field4034 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field6522 + var26;
                    if (var27 > 0 && var27 < this.field6534.field4037 - 1) {
                        int var28 = arg1.method1897((byte) -34, var25, var27 + 1) - arg1.method1897((byte) -34, var25, var27 - 1);
                        int var29 = arg1.method1897((byte) -34, var25 + 1, var27) - arg1.method1897((byte) -34, var25 - 1, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field6518[var26][var8] = (float) var28 * var30;
                        this.field6521[var26][var8] = var30 * -256.0F;
                        this.field6539[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6514; var10 <= this.field6538; var10++) {
            if (var10 >= 0 && var10 < arg1.field4034) {
                for (int var21 = this.field6522; var21 <= this.field6513; var21++) {
                    if (var21 >= 0 && var21 < arg1.field4037) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field4074[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field6540 += 3;
                                    }
                                }
                            } else {
                                this.field6540 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6513 - this.field6522;
            }
        }
        if (this.field6540 <= 0) {
            this.field6512 = null;
            this.field6523 = null;
            this.field6529 = null;
            this.field6520 = null;
        } else {
            this.field6532 = new class93(this.field6540 * 2);
            this.field6530 = new class335(this.field6540 * 16);
            this.field6524 = new class46(class241.method1609((byte) -77, this.field6540));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field6514; var13 <= this.field6538; var13++) {
                if (var13 >= 0 && arg1.field4034 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field6522; var15 <= this.field6513; var15++) {
                        if (var15 >= 0 && var15 < arg1.field4037) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field4074[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field4073[var15][var13];
                                    int[] var19 = arg1.field4066[var15][var13];
                                    int var20 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label111;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2761(var13, var19[var20], var15, var18[var20], var14, var11, (byte) 26);
                                                var20++;
                                                this.method2761(var13, var19[var20], var15, var18[var20], var14, var11, (byte) 26);
                                                var20++;
                                                this.method2761(var13, var19[var20], var15, var18[var20], var14, var11, (byte) 26);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2761(var13, 0, var15, 0, var14, var11, (byte) 26);
                                    this.method2761(var13, 0, var15, arg1.field4035, var14, var11, (byte) 26);
                                    this.method2761(var13, arg1.field4035, var15, 0, var14, var11, (byte) 26);
                                } else if (var16 == 2) {
                                    this.method2761(var13, 0, var15, arg1.field4035, var14, var11, (byte) 26);
                                    this.method2761(var13, arg1.field4035, var15, arg1.field4035, var14, var11, (byte) 26);
                                    this.method2761(var13, 0, var15, 0, var14, var11, (byte) 26);
                                } else if (var16 == 5) {
                                    this.method2761(var13, arg1.field4035, var15, arg1.field4035, var14, var11, (byte) 26);
                                    this.method2761(var13, arg1.field4035, var15, 0, var14, var11, (byte) 26);
                                    this.method2761(var13, 0, var15, arg1.field4035, var14, var11, (byte) 26);
                                } else if (var16 == 4) {
                                    this.method2761(var13, arg1.field4035, var15, 0, var14, var11, (byte) 26);
                                    this.method2761(var13, 0, var15, 0, var14, var11, (byte) 26);
                                    this.method2761(var13, arg1.field4035, var15, arg1.field4035, var14, var11, (byte) 26);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field6513 - this.field6522;
                }
                var11++;
            }
            this.field6512 = this.field6517.method932((byte) 25, false, 5123, this.field6532.field1442, this.field6532.field1413);
            this.field6529 = this.field6517.method962(16, false, this.field6530.field1413, this.field6530.field1442, 2834);
            this.field6520 = new class316(this.field6529, 5126, 3, 0);
            this.field6523 = new class316(this.field6529, 5121, 4, 12);
        }
        this.field6524 = null;
        this.field6518 = this.field6521 = this.field6539 = null;
        this.field6532 = null;
        this.field6530 = null;
    }
}
