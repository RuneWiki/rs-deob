import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class244 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Z")
    public boolean field3258;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Z")
    public boolean field3250;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[S")
    public short[] field3252;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public int field3261;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[I")
    public static int[] field3257 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private int field3264;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    private int field3266;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Lwi;")
    public class465 field3265;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method1558(int arg0) {
        if (arg0 != 16) {
            method1558(60);
        }
        field3257 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;ILjava/lang/String;Ljava/awt/Color;)V")
    public static final void method1559(Color arg0, int arg1, Color arg2, int arg3, String arg4, Color arg5) {
        try {
            Graphics var6 = class366.field5196.getGraphics();
            if (class172.field2349 == null) {
                class172.field2349 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (class296.field4170 == null) {
                    class296.field4170 = class366.field5196.createImage(class446.field6323, class172.field2348);
                }
                Graphics var7 = class296.field4170.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(arg3, 0, class446.field6323, class172.field2348);
                int var8 = class446.field6323 / 2 - 152;
                int var9 = class172.field2348 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - arg1 * 3, 30);
                var7.setFont(class172.field2349);
                var7.setColor(arg5);
                var7.drawString(arg4, var8 + ((304 - (arg4.length() * 6)) / 2), var9 + 22);
                if (class738.field10273 != null) {
                    var7.setFont(class172.field2349);
                    var7.setColor(arg5);
                    var7.drawString(class738.field10273, class446.field6323 / 2 - (class738.field10273.length() * 6 / 2), class172.field2348 / 2 + -26);
                }
                var6.drawImage(class296.field4170, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class446.field6323, class172.field2348);
                int var10 = class446.field6323 / 2 - 152;
                int var11 = class172.field2348 / 2 - 18;
                var6.setColor(arg0);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + (arg1 * 3) + 2, var11 + 2, 300 - arg1 * 3, 30);
                var6.setFont(class172.field2349);
                var6.setColor(arg5);
                if (class738.field10273 != null) {
                    var6.setFont(class172.field2349);
                    var6.setColor(arg5);
                    var6.drawString(class738.field10273, class446.field6323 / 2 - class738.field10273.length() * 6 / 2, class172.field2348 / 2 - 26);
                }
                var6.drawString(arg4, (304 - (arg4.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class366.field5196.repaint();
        }
        field3263++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BIIII)V")
    public final void method1560(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3256 = arg4;
        this.field3266 = arg1;
        field3254++;
        this.field3264 = arg2;
        this.field3249 = arg3;
        if (arg0 <= 48) {
            this.method1562(true, 78, -36);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILha;BIII)V")
    private final void method1561(int arg0, int arg1, class58 arg2, byte arg3, int arg4, int arg5, int arg6) {
        this.field3265 = arg2.method475(arg0, arg4, arg6, arg1, arg5, 1.0F);
        field3251++;
        if (arg3 <= 55) {
            this.field3250 = false;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZII)V")
    public final void method1562(boolean arg0, int arg1, int arg2) {
        field3260++;
        if (arg1 != 18223) {
            this.field3258 = true;
        }
        int var6;
        if (arg0) {
            var6 = 2048;
        } else {
            int var4 = this.field3259 + (this.field3264 * arg2 / 50) & 0x7FF;
            int var5 = this.field3256;
            if (var5 == 1) {
                var6 = (class164.field2258[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class440.field6284[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field3265.method1044((float) ((this.field3249 * var6 >> 11) + this.field3266) / 2048.0F, 65536);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    private final void method1563(byte arg0) {
        int var2 = this.field3261;
        if (var2 == 2) {
            this.field3256 = 1;
            this.field3249 = 2048;
            this.field3266 = 0;
            this.field3264 = 2048;
        } else if (var2 == 3) {
            this.field3256 = 1;
            this.field3266 = 0;
            this.field3249 = 2048;
            this.field3264 = 4096;
        } else if (var2 == 4) {
            this.field3249 = 2048;
            this.field3264 = 2048;
            this.field3256 = 4;
            this.field3266 = 0;
        } else if (var2 == 5) {
            this.field3249 = 2048;
            this.field3264 = 8192;
            this.field3256 = 4;
            this.field3266 = 0;
        } else if (var2 == 12) {
            this.field3264 = 2048;
            this.field3256 = 2;
            this.field3249 = 2048;
            this.field3266 = 0;
        } else if (var2 == 13) {
            this.field3249 = 2048;
            this.field3266 = 0;
            this.field3256 = 2;
            this.field3264 = 8192;
        } else if (var2 == 10) {
            this.field3256 = 3;
            this.field3266 = 1536;
            this.field3264 = 2048;
            this.field3249 = 512;
        } else if (var2 == 11) {
            this.field3264 = 4096;
            this.field3266 = 1536;
            this.field3256 = 3;
            this.field3249 = 512;
        } else if (var2 == 6) {
            this.field3264 = 2048;
            this.field3249 = 768;
            this.field3266 = 1280;
            this.field3256 = 3;
        } else if (var2 == 7) {
            this.field3264 = 4096;
            this.field3249 = 768;
            this.field3266 = 1280;
            this.field3256 = 3;
        } else if (var2 == 8) {
            this.field3249 = 1024;
            this.field3256 = 3;
            this.field3264 = 2048;
            this.field3266 = 1024;
        } else if (var2 == 9) {
            this.field3264 = 4096;
            this.field3249 = 1024;
            this.field3256 = 3;
            this.field3266 = 1024;
        } else if (var2 == 14) {
            this.field3249 = 768;
            this.field3266 = 1280;
            this.field3256 = 1;
            this.field3264 = 2048;
        } else if (var2 == 15) {
            this.field3249 = 512;
            this.field3264 = 4096;
            this.field3256 = 1;
            this.field3266 = 1536;
        } else if (var2 == 16) {
            this.field3249 = 256;
            this.field3264 = 8192;
            this.field3266 = 1792;
            this.field3256 = 1;
        } else {
            this.field3249 = 2048;
            this.field3264 = 2048;
            this.field3256 = 0;
            this.field3266 = 0;
        }
        if (arg0 == -80) {
            field3255++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    protected class244() {
        if (class440.field6284 == null) {
            class639.method3545(false);
        }
        this.method1563((byte) -80);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lha;Lee;I)V")
    public class244(class58 arg0, class675 arg1, int arg2) {
        if (class440.field6284 == null) {
            class639.method3545(false);
        }
        this.field3253 = arg1.method3750((byte) 35);
        this.field3258 = (this.field3253 & 0x10) != 0;
        this.field3250 = (this.field3253 & 0x8) != 0;
        this.field3253 &= 0x7;
        int var4 = arg1.method3757((byte) -65) << arg2;
        int var5 = arg1.method3757((byte) -65) << arg2;
        int var6 = arg1.method3757((byte) -65) << arg2;
        int var7 = arg1.method3750((byte) 35);
        int var8 = var7 * 2 + 1;
        this.field3252 = new short[var8];
        for (int var9 = 0; var9 < this.field3252.length; var9++) {
            short var13 = (short) arg1.method3757((byte) -65);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field3252[var9] = (short) class325.method2116(var15, var14 << 8);
        }
        int var10 = (var7 << class660.field9038) + class197.field2617;
        int var11 = class295.field4163 == null ? class2.field23[class199.method1219(0, arg1.method3757((byte) -65)) & 0xFFFF] : class295.field4163[arg1.method3757((byte) -65)];
        int var12 = arg1.method3750((byte) 35);
        this.field3261 = var12 & 0x1F;
        this.field3259 = (var12 & 0xE0) << 3;
        if (this.field3261 != 31) {
            this.method1563((byte) -80);
        }
        this.method1561(var4, var10, arg0, (byte) 119, var6, var11, var5);
    }
}
