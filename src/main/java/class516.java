import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class516 extends class184 {

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "Ljava/lang/String;")
    public static String field7480;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    private int field7479;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    private int field7482;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    private int field7484;

    static {
        new class335("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field7480 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 5)
    public class516() {
        this(0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILfh;)V", line = 8)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = -1 % ((arg0 - -13) / 51);
        ++field7477;
        if (arg1 == 0) {
            this.method3080(arg2.method2738(-120), (byte) 117);
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V", line = 34)
    public static void method3078(int arg0) {
        if (arg0 == 6) {
            field7480 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V", line = 46)
    private class516(int arg0) {
        super(0, false);
        this.method3080(arg0, (byte) 76);
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V", line = 54)
    public static final void method3079(int arg0) {
        class327.field4132 = null;
        class378.field4967 = null;
        class249.field3193 = null;
        class175.field2275 = null;
        class505.field7276 = false;
        if (arg0 != -3782) {
            field7480 = null;
        }
        class518.field7499 = null;
        ++field7476;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[[I", line = 71)
    public final int[][] method13(int arg0, int arg1) {
        ++field7473;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (super.field2416.field7271) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class245.field3167 < ~var7; ++var7) {
                var4[var7] = this.field7479;
                var5[var7] = this.field7482;
                var6[var7] = this.field7484;
            }
        }
        if (arg1 != 1) {
            this.field7482 = -5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V", line = 116)
    private final void method3080(int arg0, byte arg1) {
        this.field7482 = arg0 >> 4 & 4080;
        this.field7484 = (arg0 & 255) << 4;
        ++field7478;
        if (arg1 < 66) {
            field7480 = null;
        }
        this.field7479 = arg0 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIZ)V", line = 133)
    public static final void method3081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class450.field6452 = arg3;
        class80.field1029 = arg4;
        class212.field2731 = arg0;
        class186.field2427 = arg2;
        class475.field6884 = arg1;
        if (arg5 != 64) {
            field7480 = null;
        }
        ++field7475;
        if (arg6 && ~class186.field2427 <= -101) {
            class193.field2500 = class450.field6452 * 128 - -64;
            class310.field3971 = class212.field2731 * 128 + 64;
            class286.field3665 = class151.method991(class193.field2500, false, class276.field3488, class310.field3971) - class80.field1029;
        }
        class142.field1835 = 2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lya;IIIILho;)V", line = 159)
    public static final void method3082(class38 arg0, int arg1, int arg2, int arg3, int arg4, class102 arg5) {
        ++field7474;
        if (arg2 == 4) {
            class250 var6 = class72.field931.method951(arg2 ^ -100, arg5.field1295);
            if (~var6.field3199 != 0) {
                int var8;
                if (arg5.field1233) {
                    int var7 = arg5.field1294 + arg1;
                    var8 = var7 & 3;
                } else {
                    var8 = 0;
                }
                class16 var9 = var6.method1514(arg0, (byte) -81, var8, arg5.field1234);
                if (var9 != null) {
                    int var10 = arg5.field1272;
                    int var11 = arg5.field1282;
                    if ((1 & var8) == 1) {
                        var11 = arg5.field1272;
                        var10 = arg5.field1282;
                    }
                    int var12 = var9.method148();
                    int var13 = var9.method131();
                    if (var6.field3198) {
                        var12 = var10 * 4;
                        var13 = var11 * 4;
                    }
                    if (var6.field3202 == 0) {
                        var9.method128(arg4, -((var11 + -1) * 4) + arg3, var12, var13);
                    } else {
                        var9.method135(arg4, -((var11 - 1) * 4) + arg3, var12, var13, 0, -16777216 | var6.field3202, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Color;IZILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V", line = 212)
    public static final void method3083(Color arg0, int arg1, boolean arg2, int arg3, Color arg4, Color arg5, String arg6) {
        try {
            Graphics var7 = class8.field71.getGraphics();
            if (class251.field3210 == null) {
                class251.field3210 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class174.field2262, class390.field5236);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class447.field6400 == null) {
                    class447.field6400 = class8.field71.createImage(304, 34);
                }
                Graphics var8 = class447.field6400.getGraphics();
                var8.setColor(arg4);
                if (arg3 != -1) {
                    method3081(84, -99, 99, 16, -64, -109, true);
                }
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg5);
                var8.fillRect(2, 2, arg1 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg1 * 3 + 2, 2, -(arg1 * 3) + 300, 30);
                var8.setFont(class251.field3210);
                var8.setColor(arg0);
                var8.drawString(arg6, (-(6 * arg6.length()) + 304) / 2, 22);
                var7.drawImage(class447.field6400, class174.field2262 / 2 + -152, class390.field5236 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class174.field2262 / 2 - 152;
                int var10 = class390.field5236 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var9 + 2, var10 - -2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + var9 + 2, var10 + 2, -(arg1 * 3) + 300, 30);
                var7.setFont(class251.field3210);
                var7.setColor(arg0);
                var7.drawString(arg6, (-(arg6.length() * 6) + 304) / 2 + var9, var10 - -22);
            }
            if (class135.field1745 != null) {
                var7.setFont(class251.field3210);
                var7.setColor(arg0);
                var7.drawString(class135.field1745, class174.field2262 / 2 - class135.field1745.length() * 6 / 2, class390.field5236 / 2 + -26);
            }
        } catch (Exception var12) {
            class8.field71.repaint();
        }
        ++field7481;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILpc;Ljava/awt/Component;BI)Lvl;", line = 298)
    public static final class11 method3084(int arg0, class476 arg1, Component arg2, byte arg3, int arg4) {
        ++field7483;
        if (class94.field1140 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && ~arg4 > -3) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class11 var5 = (class11) Class.forName("dk").newInstance();
                var5.field168 = new int[(!class8.field72 ? 1 : 2) * 256];
                var5.field202 = arg0;
                var5.method90(arg2);
                var5.field199 = (-1024 & arg0) + 1024;
                if (var5.field199 > 16384) {
                    var5.field199 = 16384;
                }
                var5.method79(var5.field199);
                if (~class441.field6316 < -1 && class116.field1567 == null) {
                    class116.field1567 = new class407();
                    class116.field1567.field5815 = arg1;
                    arg1.method2870(false, class441.field6316, class116.field1567);
                }
                if (class116.field1567 != null) {
                    if (class116.field1567.field5821[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class116.field1567.field5821[arg4] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class112 var6 = new class112(arg1, arg4);
                    var6.field202 = arg0;
                    var6.field168 = new int[(class8.field72 ? 2 : 1) * 256];
                    int var7 = -10 % ((-14 - arg3) / 34);
                    var6.method90(arg2);
                    var6.field199 = 16384;
                    var6.method79(var6.field199);
                    if (~class441.field6316 < -1 && class116.field1567 == null) {
                        class116.field1567 = new class407();
                        class116.field1567.field5815 = arg1;
                        arg1.method2870(false, class441.field6316, class116.field1567);
                    }
                    if (class116.field1567 != null) {
                        if (class116.field1567.field5821[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class116.field1567.field5821[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class11();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
