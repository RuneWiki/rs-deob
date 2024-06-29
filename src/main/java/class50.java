import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class50 extends class130 {

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public int field1202 = -1;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public int field1206 = -1;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "Z")
    public boolean field1211 = true;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public int field1210 = 0;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "[I")
    public static int[] field1203 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field1216 = -1;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "[I")
    public static int[] field1217 = new int[32];

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static final void method483(byte arg0) {
        class182.field3698.method386(false);
        class49.field1187 = null;
        if (arg0 == -90) {
            class42.field971 = 1;
            field1205++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lgg;Ljava/awt/Color;II)V")
    public static final void method484(class63 arg0, Color arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class49.field1193.getGraphics();
            if (class191.field3885 == null) {
                class191.field3885 = new Font("Helvetica", 1, 13);
                class162.field3340 = class49.field1193.getFontMetrics(class191.field3885);
            }
            if (class127.field2796) {
                class127.field2796 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class84.field2000, class121.field2685);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class68.field1706 == null) {
                    class68.field1706 = class49.field1193.createImage(304, 34);
                }
                Graphics var5 = class68.field1706.getGraphics();
                var5.setColor(arg1);
                int var6 = 103 / ((arg3 + 12) / 50);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class191.field3885);
                var5.setColor(Color.white);
                arg0.method572((byte) -99, (304 - arg0.method577((byte) 80, class162.field3340)) / 2, 22, var5);
                var4.drawImage(class68.field1706, class84.field2000 / 2 - 152, class121.field2685 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class121.field2685 / 2 - 18;
                int var8 = class84.field2000 / 2 - 152;
                var4.setColor(arg1);
                var4.drawRect(var8, var7, 303, 33);
                var4.fillRect(var8 + 2, var7 - -2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var7 + 1, 301, 31);
                var4.fillRect(var8 + arg2 * 3 + 2, var7 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class191.field3885);
                var4.setColor(Color.white);
                arg0.method572((byte) -99, var8 + (304 - arg0.method577((byte) 80, class162.field3340)) / 2, var7 - -22, var4);
            }
        } catch (Exception var10) {
            class49.field1193.repaint();
        }
        field1212++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIILjc;Ljc;)Ldc;")
    public static final class33 method485(boolean arg0, int arg1, int arg2, class85 arg3, class85 arg4) {
        field1214++;
        boolean var5 = true;
        int[] var6 = arg4.method754((byte) 119, arg1);
        for (int var7 = arg2; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method744((byte) 55, var6[var7], arg1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg3.method744((byte) 82, var9, 0);
                } else {
                    var10 = arg3.method744((byte) 109, 0, var9);
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
            return new class33(arg4, arg3, arg1, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLjc;)V")
    public static final void method486(byte arg0, class85 arg1) {
        field1208++;
        class203.field4047 = arg1;
        if (arg0 != -24) {
            method483((byte) 77);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLab;I)V")
    private final void method487(int arg0, byte arg1, class3 arg2, int arg3) {
        field1218++;
        if (arg0 == 1) {
            this.field1210 = this.method488(-127, arg2.method20((byte) 66));
        } else if (arg0 == 2) {
            this.field1202 = arg2.method64(31790);
        } else if (arg0 == 3) {
            this.field1202 = arg2.method46((byte) 65);
            if (this.field1202 == 65535) {
                this.field1202 = -1;
            }
        } else if (arg0 == 5) {
            this.field1211 = false;
        } else if (arg0 == 7) {
            this.field1206 = this.method488(-113, arg2.method20((byte) 66));
        } else if (arg0 != 8 && arg0 == 9) {
            arg2.method46((byte) 65);
        }
        if (arg1 != -33) {
            field1216 = 46;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
    private final int method488(int arg0, int arg1) {
        field1215++;
        if (arg1 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        double var11 = var5;
        if (var5 > var3) {
            var7 = var3;
        }
        double var13 = 0.0D;
        if (var5 < var3) {
            var11 = var3;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        double var15 = 0.0D;
        if (arg0 > -69) {
            return -24;
        }
        double var17 = (var7 + var11) / 2.0D;
        int var19 = (int) (var17 * 256.0D);
        if (var7 != var11) {
            if (var5 == var11) {
                var13 = (var3 - var9) / (-var7 + var11);
            } else if (var3 == var11) {
                var13 = (var9 - var5) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var5 - var3) / (-var7 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (-var11 + 2.0D - var7);
            }
        }
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        double var20 = var13 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        int var23 = (int) (var15 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var19 > 243) {
            var23 >>= 0x4;
        } else if (var19 > 217) {
            var23 >>= 0x3;
        } else if (var19 > 192) {
            var23 >>= 0x2;
        } else if (var19 > 179) {
            var23 >>= 0x1;
        }
        return (var19 >> 1) + (var22 >> 2 << 10) + (var23 >> 5 << 7);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILab;)V")
    public final void method489(int arg0, int arg1, class3 arg2) {
        if (arg1 != 15849) {
            field1203 = null;
        }
        field1204++;
        while (true) {
            int var4 = arg2.method64(31790);
            if (var4 == 0) {
                return;
            }
            this.method487(var4, (byte) -33, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
    public static void method490(byte arg0) {
        field1217 = null;
        if (arg0 > 51) {
            field1203 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
    public static final void method491(int arg0, byte arg1) {
        field1213++;
        if (arg0 == -1 || !class144.method1026((byte) -127, arg0)) {
            return;
        }
        class54[] var2 = class23.field539[arg0];
        if (arg1 != -83) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class54 var4 = var2[var3];
            if (var4.field1300 != null) {
                class131 var5 = new class131();
                var5.field2862 = var4;
                var5.field2853 = var4.field1300;
                class75.method688(-123, var5, 2000000);
            }
        }
    }
}
