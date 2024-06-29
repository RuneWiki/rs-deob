import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class36 extends class240 {

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Z")
    private boolean field586 = true;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "Z")
    private boolean field590 = true;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lcd;")
    public static class64 field580 = class44.method335((byte) 71, ":tradereq:");

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "Lcd;")
    public static class64 field584 = class44.method335((byte) 71, "<img=1>");

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field581 = 0;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "Lcd;")
    public static class64 field587 = class44.method335((byte) 71, "<col=80ff00>");

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "Lcd;")
    public static class64 field591 = class44.method335((byte) 71, "Mem:");

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "[S")
    public static short[] field578;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 10)
    public static void method292(int arg0) {
        if (arg0 != -10948) {
            method295((int[]) null, 15, -64, -111, -85, 15);
        }
        field578 = null;
        field591 = null;
        field587 = null;
        field580 = null;
        field584 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILkh;)V", line = 25)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.field586 = arg2.method152((byte) -115) == 1;
        } else if (arg1 == 1) {
            this.field590 = arg2.method152((byte) -71) == 1;
        } else if (arg1 == 2) {
            this.field4113 = arg2.method152((byte) -83) == 1;
        }
        field583++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)[[I", line = 76)
    public final int[][] method286(byte arg0, int arg1) {
        if (arg0 < 34) {
            this.field590 = false;
        }
        field582++;
        int[][] var3 = this.field4095.method1797(arg1, -17);
        if (this.field4095.field4355) {
            int[][] var4 = this.method1746(75, this.field590 ? class74.field1407 - arg1 : arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field586) {
                for (int var12 = 0; var12 < class169.field2936; var12++) {
                    var8[var12] = var5[class132.field2356 - var12];
                    var9[var12] = var6[class132.field2356 - var12];
                    var10[var12] = var7[class132.field2356 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class169.field2936; var11++) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 153)
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I", line = 166)
    public static final int method293(int arg0, int arg1) {
        field588++;
        int var2 = -101 / ((arg0 + 31) / 56);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)V", line = 176)
    public static final void method294(int arg0) {
        if (arg0 > 66) {
            class125.method908(0, -5, 0);
            field579++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([IIIIII)V", line = 187)
    public static final void method295(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class295 var6 = class304.field5203[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class181 var7 = var6.field5074;
        if (var7 != null) {
            int var8 = var7.field3117;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class45 var10 = var6.field5093;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field733;
        int var12 = var10.field748;
        int var13 = var10.field745;
        int var14 = var10.field744;
        int[] var15 = class159.field2818[var11];
        int[] var16 = class72.field1399[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Color;ZILcd;I)V", line = 283)
    public static final void method296(Color arg0, boolean arg1, int arg2, class64 arg3, int arg4) {
        field589++;
        if (arg4 <= 40) {
            field580 = (class64) null;
        }
        try {
            Graphics var5 = class307.field5251.getGraphics();
            if (class298.field5135 == null) {
                class298.field5135 = new Font("Helvetica", 1, 13);
                class28.field446 = class307.field5251.getFontMetrics(class298.field5135);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class13.field290, class58.field960);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class251.field4359 == null) {
                    class251.field4359 = class307.field5251.createImage(304, 34);
                }
                Graphics var6 = class251.field4359.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg2 * 3) + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class298.field5135);
                var6.setColor(Color.white);
                arg3.method496(-128, (304 - arg3.method507(class28.field446, 0)) / 2, 22, var6);
                var5.drawImage(class251.field4359, class13.field290 / 2 - 152, class58.field960 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class58.field960 / 2 - 18;
                int var9 = class13.field290 / 2 - 152;
                var5.setColor(arg0);
                var5.drawRect(var9, var8, 303, 33);
                var5.fillRect(var9 + 2, var8 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg2 * 3 + var9 + 2, var8 - -2, 300 - arg2 * 3, 30);
                var5.setFont(class298.field5135);
                var5.setColor(Color.white);
                arg3.method496(-98, var9 + (304 - arg3.method507(class28.field446, 0)) / 2, var8 - -22, var5);
            }
            if (class216.field3622 != null) {
                var5.setFont(class298.field5135);
                var5.setColor(Color.white);
                class216.field3622.method496(-118, class13.field290 / 2 - (class216.field3622.method507(class28.field446, 0) / 2), class58.field960 / 2 + -26, var5);
            }
        } catch (Exception var12) {
            class307.field5251.repaint();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I", line = 373)
    public final int[] method12(int arg0, int arg1) {
        field585++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[] var4 = this.method1745(this.field590 ? class74.field1407 - arg1 : arg1, 0, (byte) 109);
            if (this.field586) {
                for (int var5 = 0; var5 < class169.field2936; var5++) {
                    var3[var5] = var4[class132.field2356 - var5];
                }
            } else {
                class95.method719(var4, 0, var3, 0, class169.field2936);
            }
        }
        return arg0 == 64 ? var3 : (int[]) null;
    }
}
