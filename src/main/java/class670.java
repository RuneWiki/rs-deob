import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class670 {

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    private int field9522 = -1;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Z")
    public boolean field9518 = true;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "Lgt;")
    private class90 field9524;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
    private int field9528;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    private int field9521;

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "Lqq;")
    private class651 field9529;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "Lgn;")
    private class691 field9519;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
    public int field9533;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "I")
    private int field9535;

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
    private int field9531;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "Lkga;")
    private class556 field9520;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    public static int field9525;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field9532;

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lqq;Lgt;Ljba;IIIII)V", line = 353)
    public class670(class651 arg0, class90 arg1, class704 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9524 = arg1;
        this.field9528 = arg7;
        this.field9521 = arg6;
        this.field9529 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3524 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field9910[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field9519 = null;
            this.field9533 = 0;
        } else {
            this.field9535 = Integer.MIN_VALUE;
            this.field9531 = Integer.MAX_VALUE;
            this.field9520 = this.field9529.method2046(1, false);
            this.field9520.method1765(var10, 30907);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field9520.method2143(true, (byte) 77);
                if (var15 != null) {
                    Stream var16 = this.field9529.method3614(var15, 0);
                    if (Stream.method3445()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3524 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field9910[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field9531) {
                                            this.field9531 = var28;
                                        }
                                        if (var28 > this.field9535) {
                                            this.field9535 = var28;
                                        }
                                        var16.method3433(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3524 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field9910[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field9535 < var22) {
                                            this.field9535 = var22;
                                        }
                                        if (this.field9531 > var22) {
                                            this.field9531 = var22;
                                        }
                                        var16.method3443(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3440();
                    if (this.field9520.method2145(false)) {
                        break;
                    }
                }
            }
            this.field9533 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILkga;I)V", line = 14)
    public final void method3804(int arg0, class556 arg1, int arg2) {
        field9523++;
        if (arg0 >= 27 && arg2 > 0) {
            this.method3810(-12664);
            this.field9529.method3613((byte) 116, this.field9519);
            this.field9529.method2040(0, 103, this.field9531, arg1, arg2, this.field9535 + 1 - this.field9531, class694.field9783);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIB)Z", line = 34)
    public static final boolean method3805(int arg0, int arg1, byte arg2) {
        if (arg2 <= 112) {
            method3806(null, 44);
        }
        field9536++;
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 45)
    public static final int method3806(String arg0, int arg1) {
        field9534++;
        for (int var2 = arg1; var2 < class508.field7013.length; var2++) {
            if (class508.field7013[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/String;)V", line = 63)
    public static final void method3807(byte arg0, Color arg1, Color arg2, Color arg3, int arg4, String arg5) {
        field9526++;
        try {
            Graphics var6 = class583.field7996.getGraphics();
            if (class73.field863 == null) {
                class73.field863 = new Font("Helvetica", 1, 13);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class320.field4273 == null) {
                    class320.field4273 = class583.field7996.createImage(class399.field5301, class60.field750);
                }
                Graphics var7 = class320.field4273.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class399.field5301, class60.field750);
                int var8 = class399.field5301 / 2 - 152;
                int var9 = class60.field750 / 2 - 18;
                var7.setColor(arg2);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var8 + 2, var9 - -2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(var8 + (arg4 * 3) + 2, var9 + 2, 300 - arg4 * 3, 30);
                var7.setFont(class73.field863);
                var7.setColor(arg3);
                var7.drawString(arg5, var8 + ((304 - arg5.length() * 6) / 2), var9 + 22);
                if (class370.field4873 != null) {
                    var7.setFont(class73.field863);
                    var7.setColor(arg3);
                    var7.drawString(class370.field4873, class399.field5301 / 2 - (class370.field4873.length() * 6 / 2), class60.field750 / 2 + -26);
                }
                var6.drawImage(class320.field4273, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class399.field5301, class60.field750);
                int var10 = class399.field5301 / 2 - 152;
                int var11 = class60.field750 / 2 - 18;
                var6.setColor(arg2);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg1);
                var6.fillRect(var10 + 2, var11 - -2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg4 * 3 + (var10 + 2), var11 + 2, 300 - (arg4 * 3), 30);
                var6.setFont(class73.field863);
                var6.setColor(arg3);
                if (class370.field4873 != null) {
                    var6.setFont(class73.field863);
                    var6.setColor(arg3);
                    var6.drawString(class370.field4873, class399.field5301 / 2 - class370.field4873.length() * 6 / 2, class60.field750 / 2 + -26);
                }
                var6.drawString(arg5, var10 + ((304 - (arg5.length() * 6)) / 2), var11 + 22);
            }
            if (arg0 >= -15) {
                field9532 = null;
            }
        } catch (Exception var13) {
            class583.field7996.repaint();
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 152)
    public final void method3808(int arg0) {
        if (arg0 <= -41) {
            field9527++;
            this.method3804(35, this.field9520, this.field9533);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V", line = 173)
    public static void method3809(byte arg0) {
        field9532 = null;
        if (arg0 != -49) {
            method3807((byte) -74, null, null, null, 68, null);
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V", line = 184)
    private final void method3810(int arg0) {
        field9530++;
        if (!this.field9518) {
            return;
        }
        this.field9518 = false;
        byte[] var2 = this.field9524.field1102;
        int var3 = 0;
        int var4 = this.field9524.field1092;
        int var5 = this.field9524.field1092 * this.field9528 + this.field9521;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field9519 != null && this.field9522 == var3) {
            this.field9518 = false;
            return;
        }
        if (arg0 != -12664) {
            this.method3808(-23);
        }
        this.field9522 = var3;
        int var7 = this.field9521 + (this.field9528 * var4);
        int var8 = 0;
        if (!this.field9529.method2037(class404.field5338, class635.field8783, (byte) 51)) {
            if (class517.field7186 == null) {
                class517.field7186 = new int[16384];
            }
            int[] var9 = class517.field7186;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field9524.field1092 - 128;
            }
            if (this.field9519 == null) {
                this.field9519 = this.field9529.method3662(128, false, 128, -116, class517.field7186);
                this.field9519.method846(false, (byte) 113, false);
            } else {
                this.field9519.method851(128, 128, 0, class517.field7186, 0, (byte) -122, 128, 0);
            }
            return;
        }
        if (class276.field3664 == null) {
            class276.field3664 = new byte[16384];
        }
        byte[] var13 = class276.field3664;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var7 + var4] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field9524.field1092 - 128;
        }
        if (this.field9519 == null) {
            this.field9519 = this.field9529.method3653(class635.field8783, 128, class276.field3664, false, arg0 - 17135, 128);
            this.field9519.method846(false, (byte) 81, false);
        } else {
            this.field9519.method850(-3661, 0, 128, 128, 0, 0, class276.field3664, class635.field8783, 128);
        }
    }
}
