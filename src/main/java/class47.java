import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class47 extends class232 {

    @OriginalMember(owner = "client!hj", name = "oh", descriptor = "Lmba;")
    private class646 field632 = new class646();

    @OriginalMember(owner = "client!hj", name = "ui", descriptor = "Lmba;")
    private class646 field690 = new class646();

    @OriginalMember(owner = "client!hj", name = "zi", descriptor = "Lmba;")
    private class646 field695 = new class646();

    @OriginalMember(owner = "client!hj", name = "Ai", descriptor = "Lmba;")
    private class646 field696 = new class646();

    @OriginalMember(owner = "client!hj", name = "Bi", descriptor = "Lmba;")
    private class646 field697 = new class646();

    @OriginalMember(owner = "client!hj", name = "Ci", descriptor = "Lmba;")
    private class646 field698 = new class646();

    @OriginalMember(owner = "client!hj", name = "Di", descriptor = "Lmba;")
    private class646 field699 = new class646();

    @OriginalMember(owner = "client!hj", name = "Hi", descriptor = "[Lcs;")
    private class337[] field703 = new class337[16];

    @OriginalMember(owner = "client!hj", name = "Ei", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field700 = new MapBuffer();

    @OriginalMember(owner = "client!hj", name = "Ni", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field709 = new MapBuffer();

    @OriginalMember(owner = "client!hj", name = "Wi", descriptor = "I")
    private int field718 = 0;

    @OriginalMember(owner = "client!hj", name = "li", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field681;

    @OriginalMember(owner = "client!hj", name = "Yi", descriptor = "Ljava/lang/String;")
    private String field720;

    @OriginalMember(owner = "client!hj", name = "Ri", descriptor = "Ljava/lang/String;")
    private String field713;

    @OriginalMember(owner = "client!hj", name = "Ti", descriptor = "I")
    private int field715;

    @OriginalMember(owner = "client!hj", name = "Xi", descriptor = "Z")
    public boolean field719;

    @OriginalMember(owner = "client!hj", name = "Vi", descriptor = "Z")
    private boolean field717;

    @OriginalMember(owner = "client!hj", name = "Pi", descriptor = "Z")
    private boolean field711;

    @OriginalMember(owner = "client!hj", name = "Zi", descriptor = "Z")
    public boolean field721;

    @OriginalMember(owner = "client!hj", name = "Qi", descriptor = "Z")
    public boolean field712;

    @OriginalMember(owner = "client!hj", name = "Oi", descriptor = "Z")
    public boolean field710;

    @OriginalMember(owner = "client!hj", name = "Si", descriptor = "[I")
    public int[] field714;

    @OriginalMember(owner = "client!hj", name = "Ui", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!hj", name = "Yh", descriptor = "I")
    public static int field668 = -2;

    @OriginalMember(owner = "client!hj", name = "Ug", descriptor = "Ljava/lang/String;")
    public static String field612;

    @OriginalMember(owner = "client!hj", name = "gh", descriptor = "Ljava/lang/String;")
    public static String field624;

    @OriginalMember(owner = "client!hj", name = "Jg", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!hj", name = "Kg", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!hj", name = "Lg", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!hj", name = "Mg", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!hj", name = "Ng", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!hj", name = "Og", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!hj", name = "Pg", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!hj", name = "Qg", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!hj", name = "Rg", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!hj", name = "Sg", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!hj", name = "Tg", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!hj", name = "Vg", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!hj", name = "Wg", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!hj", name = "Xg", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!hj", name = "Yg", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!hj", name = "Zg", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!hj", name = "ah", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!hj", name = "bh", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!hj", name = "ch", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!hj", name = "dh", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!hj", name = "eh", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!hj", name = "fh", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!hj", name = "hh", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!hj", name = "ih", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!hj", name = "jh", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!hj", name = "kh", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!hj", name = "lh", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!hj", name = "mh", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!hj", name = "nh", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!hj", name = "ph", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!hj", name = "qh", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!hj", name = "rh", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!hj", name = "sh", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!hj", name = "th", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!hj", name = "uh", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!hj", name = "vh", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!hj", name = "wh", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!hj", name = "xh", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!hj", name = "yh", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!hj", name = "zh", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!hj", name = "Ah", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!hj", name = "Bh", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!hj", name = "Ch", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!hj", name = "Dh", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!hj", name = "Eh", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!hj", name = "Fh", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!hj", name = "Gh", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!hj", name = "Hh", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!hj", name = "Ih", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!hj", name = "Jh", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!hj", name = "Kh", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!hj", name = "Lh", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!hj", name = "Mh", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!hj", name = "Nh", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!hj", name = "Oh", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!hj", name = "Ph", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!hj", name = "Qh", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!hj", name = "Rh", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!hj", name = "Sh", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!hj", name = "Th", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!hj", name = "Uh", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!hj", name = "Vh", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!hj", name = "Wh", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!hj", name = "Xh", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!hj", name = "Zh", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!hj", name = "ai", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!hj", name = "bi", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!hj", name = "ci", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!hj", name = "di", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!hj", name = "ei", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!hj", name = "fi", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!hj", name = "gi", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!hj", name = "hi", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!hj", name = "ii", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!hj", name = "ji", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!hj", name = "ki", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!hj", name = "mi", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!hj", name = "ni", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!hj", name = "oi", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!hj", name = "pi", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!hj", name = "qi", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!hj", name = "ri", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!hj", name = "si", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!hj", name = "ti", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!hj", name = "vi", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!hj", name = "wi", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!hj", name = "xi", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!hj", name = "yi", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!hj", name = "Ii", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "client!hj", name = "Ki", descriptor = "J")
    private long field706;

    @OriginalMember(owner = "client!hj", name = "Fi", descriptor = "Z")
    private boolean field701;

    @OriginalMember(owner = "client!hj", name = "Gi", descriptor = "Z")
    private boolean field702;

    @OriginalMember(owner = "client!hj", name = "Ji", descriptor = "Z")
    private boolean field705;

    @OriginalMember(owner = "client!hj", name = "Li", descriptor = "Z")
    private boolean field707;

    @OriginalMember(owner = "client!hj", name = "Mi", descriptor = "Z")
    private boolean field708;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field612 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field624 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lhe;Lhe;FLhe;)Lhe;", line = 4)
    public final class577 method260(class577 arg0, class577 arg1, float arg2, class577 arg3) {
        ++field680;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(JZ)V", line = 12)
    public final synchronized void method261(long arg0, boolean arg1) {
        if (arg1) {
            this.field716 = -114;
        }
        ++field644;
        class71 var4 = new class71();
        var4.field1079 = arg0;
        this.field699.method3610(9289, var4);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)V", line = 26)
    public final void method262(int arg0, int arg1) throws class692 {
        this.field681.swapBuffers();
        ++field672;
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "()Ler;", line = 36)
    public final class299 method263() {
        ++field649;
        int var1 = -1;
        if (~this.field720.indexOf("nvidia") == 0) {
            if (this.field720.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (~this.field720.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class299(var1, "OpenGL", this.field715, this.field713, 0L);
    }

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "(II)V", line = 59)
    public final void method264(int arg0, int arg1) {
        ++field685;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILcc;)V", line = 66)
    public final void method265(int arg0, class579 arg1) {
        ++field677;
        class40[] var3 = ((class584) arg1).field7972;
        int var4 = 0;
        if (arg0 == 1024) {
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            for (int var8 = 0; var3.length > var8; ++var8) {
                class40 var11 = var3[var8];
                class337 var12 = this.field703[var8];
                int var13 = 0;
                int var14 = var12.method2142(11215);
                long var15 = var12.method1810(-1);
                var12.method1808(0);
                for (int var17 = 0; ~var17 > ~var11.method219(-1); ++var17) {
                    class385 var18 = var11.method221(var17, -1321);
                    if (class385.field5515 != var18) {
                        if (class385.field5522 != var18) {
                            if (class385.field5523 != var18) {
                                if (class385.field5524 == var18) {
                                    OpenGL.glClientActiveTexture(33984 - -(var4++));
                                    OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                                } else if (class385.field5526 != var18) {
                                    if (class385.field5527 == var18) {
                                        OpenGL.glClientActiveTexture(33984 - -(var4++));
                                        OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                                    } else if (class385.field5528 == var18) {
                                        OpenGL.glClientActiveTexture(var4++ + 33984);
                                        OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                                    }
                                } else {
                                    OpenGL.glClientActiveTexture(33984 - -(var4++));
                                    OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                                }
                            } else {
                                var5 = true;
                                OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                            }
                        } else {
                            OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                            var6 = true;
                        }
                    } else {
                        var7 = true;
                        OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                    }
                    var13 += var18.field5516;
                }
            }
            if (!var7 == this.field701) {
                if (!var7) {
                    OpenGL.glDisableClientState(32884);
                } else {
                    OpenGL.glEnableClientState(32884);
                }
                this.field701 = var7;
            }
            if (!var6 != !this.field708) {
                if (!var6) {
                    OpenGL.glDisableClientState(32885);
                } else {
                    OpenGL.glEnableClientState(32885);
                }
                this.field708 = var6;
            }
            if (this.field707 == !var5) {
                if (!var5) {
                    OpenGL.glDisableClientState(32886);
                } else {
                    OpenGL.glEnableClientState(32886);
                }
                this.field707 = var5;
            }
            if (var4 <= this.field704) {
                if (~this.field704 < ~var4) {
                    for (int var9 = var4; ~var9 > ~this.field704; ++var9) {
                        OpenGL.glClientActiveTexture(var9 + 33984);
                        OpenGL.glDisableClientState(32888);
                    }
                    this.field704 = var4;
                    return;
                }
            } else {
                for (int var10 = this.field704; ~var10 > ~var4; ++var10) {
                    OpenGL.glClientActiveTexture(var10 + 33984);
                    OpenGL.glEnableClientState(32888);
                }
                this.field704 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BZ)V", line = 229)
    public final void method266(byte arg0, boolean arg1) {
        ++field610;
        int var3 = 111 % ((arg0 - 45) / 40);
        if (!arg1) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)V", line = 244)
    public final void method267(boolean arg0) {
        ++field608;
        if (arg0) {
            OpenGL.glTexEnvi(8960, 34161, class579.method3369(super.field3386[super.field3350], 0));
        }
    }

    @OriginalMember(owner = "client!hj", name = "na", descriptor = "(IIII)[I", line = 257)
    public final int[] method268(int arg0, int arg1, int arg2, int arg3) {
        ++field673;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + super.field3293 + -var6 + -1, arg2, 1, 32993, this.field716, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)V", line = 276)
    public final synchronized void method269(int arg0, byte arg1, int arg2) {
        ++field671;
        class27 var4 = new class27(arg2);
        var4.field1079 = (long) arg0;
        if (arg1 <= 117) {
            this.method287(-15);
        }
        this.field695.method3610(9289, var4);
    }

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "(I)V", line = 290)
    public final void method270(int arg0) {
        int var2 = -116 / ((arg0 - 26) / 48);
        ++field669;
        OpenGL.glDepthMask(super.field3358 && super.field3349);
    }

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "(I)V", line = 300)
    public final void method271(int arg0) {
        if (arg0 == 1) {
            OpenGL.glActiveTexture(33984 - -super.field3350);
            ++field641;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V", line = 311)
    public final void method272(boolean arg0) {
        ++field637;
    }

    @OriginalMember(owner = "client!hj", name = "GA", descriptor = "(I)V", line = 318)
    public final void method273(int arg0) {
        ++field662;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(B)V", line = 333)
    public final void method274(byte arg0) {
        if (arg0 < 57) {
            this.method293(-96, (byte) -64, -9);
        }
        ++field618;
        this.field702 = false;
        this.method318(125);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Luu;I)V", line = 347)
    public class47(OpenGL arg0, Canvas arg1, long arg2, class270 arg3, class237 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field681 = arg0;
            this.field681.method3329();
            this.field720 = OpenGL.glGetString(7936).toLowerCase();
            this.field713 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field720.indexOf("microsoft") == 0 && this.field720.indexOf("brian paul") == -1 && ~this.field720.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class494.method2992(' ', var8.replace('.', ' '), 1);
                if (~var9.length <= -3) {
                    try {
                        int var10 = class341.method2169(var9[0], 127);
                        int var11 = class341.method2169(var9[1], 48);
                        this.field715 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field715 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field681.method3327("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field681.method3327("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field3416 = var12[0];
                        if (super.field3416 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field3431 = 8;
                            this.field719 = this.field681.method3327("GL_ARB_vertex_buffer_object");
                            super.field3372 = this.field681.method3327("GL_ARB_multisample");
                            this.field717 = this.field681.method3327("GL_ARB_texture_rectangle");
                            super.field3394 = this.field681.method3327("GL_ARB_texture_cube_map");
                            this.field711 = this.field681.method3327("GL_ARB_texture_non_power_of_two");
                            super.field3359 = this.field681.method3327("GL_EXT_texture3D");
                            this.field721 = this.field681.method3327("GL_ARB_vertex_shader");
                            this.field712 = this.field681.method3327("GL_ARB_vertex_program");
                            this.field710 = this.field681.method3327("GL_ARB_fragment_shader");
                            this.field681.method3327("GL_ARB_fragment_program");
                            this.field714 = new int[super.field3416];
                            this.field716 = Stream.method2614() ? 33639 : 5121;
                            if (this.field713.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class494.method2992(' ', this.field713.replace('/', ' '), 1);
                                for (int var17 = 0; ~var16.length < ~var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (~var18.charAt(0) == -121 && var18.length() >= 3 && class134.method849(var18.substring(1, 3), 0)) {
                                                var15 = true;
                                                var18 = var18.substring(1);
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var18 = var18.substring(2);
                                                    var14 = true;
                                                }
                                                if (~var18.length() <= -5 && class134.method849(var18.substring(0, 4), 0)) {
                                                    var13 = class341.method2169(var18.substring(0, 4), -107);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && ~var13 >= -9251) {
                                        super.field3359 = false;
                                    }
                                    if (var13 >= 7000 && var13 <= 7999) {
                                        this.field719 = false;
                                    }
                                }
                                this.field717 &= this.field681.method3327("GL_ARB_half_float_pixel");
                            }
                            this.field720.indexOf("intel");
                            if (this.field719) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                        }
                    }
                } else {
                    throw new RuntimeException("");
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method3248((byte) -88);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Luu;I)V", line = 501)
    public static final void method275(class237 arg0, int arg1) {
        ++field602;
        class261.field3774 = arg0.method1598("p11_full", false);
        class486.field6799 = arg0.method1598("p12_full", false);
        class453.field6276 = arg0.method1598("b12_full", false);
        int var2 = -71 % ((-58 - arg1) / 40);
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "(I)V", line = 516)
    public final void method276(int arg0) {
        ++field655;
        super.field3345 = (float) (super.field3352 - super.field3357);
        super.field3399 = super.field3345 - (float) super.field3406;
        if (super.field3399 < (float) super.field3353) {
            super.field3399 = (float) super.field3353;
        }
        OpenGL.glFogf(2915, super.field3399);
        OpenGL.glFogf(2916, super.field3345);
        class124.field1713[0] = (float) class665.method3759(super.field3405, 16711680) / 1.671168E7F;
        class124.field1713[2] = (float) class665.method3759(255, super.field3405) / 255.0F;
        class124.field1713[1] = (float) class665.method3759(super.field3405, 65280) / 65280.0F;
        if (arg0 != 1457265324) {
            this.method305(-49, (Canvas) null, (Object) null);
        }
        OpenGL.glFogfv(2918, class124.field1713, 0);
    }

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "()I", line = 542)
    public final int method277() {
        ++field656;
        return this.field718;
    }

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "()V", line = 550)
    public final void method278() {
        ++field621;
    }

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "(B)V", line = 560)
    public final void method279(byte arg0) {
        if (super.field3412 && !super.field3368) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != -3) {
            this.method309(-3, -10);
        }
        ++field684;
    }

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "(I)V", line = 577)
    public final void method280(int arg0) {
        ++field609;
        int var2 = this.field714[super.field3350];
        if (arg0 < 7) {
            field688 = 66;
        }
        if (var2 != 0) {
            this.field714[super.field3350] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "()V", line = 596)
    public final void method281() {
        ++field654;
        if (super.field3195 > 0 || super.field3293 > 0) {
            int var1 = super.field3414;
            int var2 = super.field3363;
            int var3 = super.field3422;
            int var4 = super.field3415;
            this.method1437();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1400(-109);
            this.method1467(false, -32);
            this.method1530((byte) -99, false);
            this.method1491(-32, false);
            this.method1453(false, -111);
            this.method1458(399403340, (class190) null);
            this.method1477(false, false, -87, -2);
            this.method1503(1, (byte) 109);
            this.method1422(11665, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field3195, super.field3293, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1544(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 638)
    public final void method282(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class692 {
        this.method262(arg2, arg3);
        ++field664;
    }

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "()Z", line = 646)
    public final boolean method283() {
        ++field601;
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V", line = 654)
    public final void method284(int arg0, int arg1, int arg2, int arg3) {
        ++field652;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V", line = 661)
    public final void method285(Object arg0, Canvas arg1, int arg2) {
        ++field617;
        Long var4 = (Long) arg0;
        this.field681.releaseSurface(arg1, var4);
        int var5 = -16 % ((arg2 - -68) / 39);
    }

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "(I)V", line = 673)
    public final void method286(int arg0) {
        if (arg0 == 3) {
            if (!super.field3419) {
                OpenGL.glDisable(3042);
            } else {
                OpenGL.glEnable(3042);
            }
            ++field611;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V", line = 689)
    public final void method287(int arg0) {
        this.method318(120);
        ++field633;
        if (arg0 != 18169) {
            this.field716 = 102;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Liv;Ljt;I)Z", line = 702)
    public final boolean method288(class25 arg0, class38 arg1, int arg2) {
        ++field691;
        if (arg2 != 12935) {
            this.field719 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()Z", line = 714)
    public final boolean method289() {
        ++field647;
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "()V", line = 723)
    public final void method290() {
        OpenGL.glFinish();
        ++field606;
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(B)V", line = 732)
    public final void method291(byte arg0) {
        ++field686;
        this.method1425(arg0 + -51);
        int var2;
        for (var2 = 0; var2 < super.field3440; ++var2) {
            class687 var3 = super.field3346[var2];
            int var4 = var3.method3868(6);
            int var5 = 16386 - -var2;
            float var6 = var3.method3871(16043) / 255.0F;
            class124.field1713[0] = (float) var3.method3873((byte) -7);
            class124.field1713[1] = (float) var3.method3867(false);
            class124.field1713[2] = (float) var3.method3870(94);
            class124.field1713[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class124.field1713, 0);
            class124.field1713[2] = (float) class665.method3759(var4, 255) * var6;
            class124.field1713[3] = 1.0F;
            class124.field1713[0] = var6 * (float) (class665.method3759(16719262, var4) >> 16);
            class124.field1713[1] = var6 * (float) (class665.method3759(var4, 65473) >> 8);
            OpenGL.glLightfv(var5, 4609, class124.field1713, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3866((byte) -46) * var3.method3866((byte) -94)));
            OpenGL.glEnable(var5);
        }
        while (super.field3378 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method291(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "(I)V", line = 776)
    public final void method292(int arg0) {
        OpenGL.glLightfv(16384, 4611, super.field3355, 0);
        ++field643;
        OpenGL.glLightfv(16385, 4611, super.field3381, 0);
        if (arg0 >= -104) {
            this.field696 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IBI)V", line = 790)
    public final synchronized void method293(int arg0, byte arg1, int arg2) {
        ++field646;
        if (arg1 > -79) {
            this.field705 = true;
        }
        class27 var4 = new class27(arg2);
        var4.field1079 = (long) arg0;
        this.field690.method3610(9289, var4);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZB)Ljs;", line = 804)
    public final class174 method294(boolean arg0, byte arg1) {
        ++field689;
        if (arg1 >= -49) {
            this.method318(-114);
        }
        return new class154(this, class38.field473, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "(I)V", line = 817)
    public final void method295(int arg0) {
        ++field693;
        OpenGL.glScissor(super.field3429 - -super.field3414, -super.field3415 + super.field3293 + super.field3417, -super.field3414 + super.field3363, -super.field3422 + super.field3415);
        if (arg0 < 109) {
            field624 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "ib", descriptor = "(I)V", line = 833)
    public static void method296(int arg0) {
        field624 = null;
        if (arg0 != 0) {
            field624 = null;
        }
        field612 = null;
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "(B)V", line = 844)
    public final void method297(byte arg0) {
        if (!super.field3423) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        if (arg0 < 56) {
            this.field708 = false;
        }
        ++field615;
    }

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "(I)V", line = 869)
    public final void method298(int arg0) {
        OpenGL.glMatrixMode(5890);
        ++field631;
        if (arg0 >= -75) {
            this.field699 = null;
        }
        if (super.field3392[super.field3350] != class149.field2065) {
            OpenGL.glLoadMatrixf(super.field3347[super.field3350].method2887(16383, class42.field525), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Lpw;", line = 888)
    public final class106 method299(int arg0, int arg1) {
        ++field648;
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[BILiv;)Lrj;", line = 896)
    public final class361 method300(int arg0, int arg1, int arg2, byte[] arg3, int arg4, class25 arg5) {
        if (arg0 != 18173) {
            this.field713 = null;
        }
        ++field622;
        return new class58(this, arg5, arg2, arg4, arg1, arg3);
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V", line = 908)
    public final void method301(byte arg0) {
        ++field603;
        OpenGL.glTexEnvi(8960, 34162, class579.method3369(super.field3439[super.field3350], arg0 + -7));
        if (arg0 != 7) {
            this.method316(60, -94);
        }
    }

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "()V", line = 919)
    public final void method302() {
        ++field625;
    }

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "(I)V", line = 926)
    public final void method303(int arg0) {
        if (arg0 != -1) {
            this.field716 = -123;
        }
        ++field658;
        if (!super.field3466) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILjt;Liv;I)Ldg;", line = 942)
    public final class19 method304(int arg0, int arg1, class38 arg2, class25 arg3, int arg4) {
        ++field630;
        if (arg4 != 2) {
            return null;
        } else if (!this.field711 && (!class88.method611(arg0, arg4) || !class88.method611(arg1, 2))) {
            return this.field717 ? new class117(this, arg3, arg2, arg0, arg1) : new class267(this, arg3, arg2, class606.method3450(arg0, (byte) -25), class606.method3450(arg1, (byte) -25));
        } else {
            return new class267(this, arg3, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 968)
    public final void method305(int arg0, Canvas arg1, Object arg2) {
        ++field607;
        Long var4 = (Long) arg2;
        if (arg0 < 30) {
            this.method316(-11, 66);
        }
        if (!this.field681.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFF)V", line = 985)
    public final void method306(float arg0, float arg1, float arg2) {
        ++field683;
    }

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "(I)V", line = 992)
    public final void method307(int arg0) {
        class124.field1713[0] = super.field3420 * super.field3354;
        class124.field1713[3] = 1.0F;
        class124.field1713[2] = super.field3365 * super.field3354;
        if (arg0 != -1) {
            this.field713 = null;
        }
        class124.field1713[1] = super.field3413 * super.field3354;
        ++field619;
        OpenGL.glLightModelfv(2899, class124.field1713, 0);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIIID)V", line = 1007)
    public final void method308(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field660;
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(II)Lkl;", line = 1014)
    public final class712 method309(int arg0, int arg1) {
        ++field676;
        if (arg0 != 13492) {
            this.field702 = true;
        }
        if (~arg1 != -4) {
            if (~arg1 != -5) {
                return ~arg1 == -9 ? new class678(this, super.field3230, super.field3185) : super.method309(arg0, arg1);
            } else {
                return new class313(this, super.field3230, super.field3185);
            }
        } else {
            return new class316(this, super.field3230);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 1064)
    public final synchronized void method310(int arg0) {
        ++field659;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field690.method3616((byte) 107)) {
            class27 var12 = (class27) this.field690.method3623(0);
            class112.field1504[var2++] = (int) var12.field1079;
            super.field3333 -= var12.field347;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class112.field1504, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class112.field1504, 0);
            var2 = 0;
        }
        while (!this.field695.method3616((byte) 76)) {
            class27 var11 = (class27) this.field695.method3623(0);
            class112.field1504[var2++] = (int) var11.field1079;
            super.field3331 -= var11.field347;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class112.field1504, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class112.field1504, 0);
            var2 = 0;
        }
        while (!this.field696.method3616((byte) 113)) {
            class27 var10 = (class27) this.field696.method3623(0);
            class112.field1504[var2++] = var10.field347;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class112.field1504, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class112.field1504, 0);
            var2 = 0;
        }
        while (!this.field697.method3616((byte) 19)) {
            class27 var9 = (class27) this.field697.method3623(0);
            class112.field1504[var2++] = (int) var9.field1079;
            super.field3334 -= var9.field347;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class112.field1504, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class112.field1504, 0);
            boolean var4 = false;
        }
        while (!this.field632.method3616((byte) 68)) {
            class27 var8 = (class27) this.field632.method3623(0);
            OpenGL.glDeleteLists((int) var8.field1079, var8.field347);
        }
        while (!this.field698.method3616((byte) 16)) {
            class71 var7 = this.field698.method3623(0);
            OpenGL.glDeleteProgramARB((int) var7.field1079);
        }
        while (!this.field699.method3616((byte) 104)) {
            class71 var6 = this.field699.method3623(0);
            OpenGL.glDeleteObjectARB(var6.field1079);
        }
        while (!this.field632.method3616((byte) 11)) {
            class27 var5 = (class27) this.field632.method3623(0);
            OpenGL.glDeleteLists((int) var5.field1079, var5.field347);
        }
        if (~this.method1509() < -100663297 && class97.method664((byte) -50) > this.field706 - -60000L) {
            System.gc();
            this.field706 = class97.method664((byte) -50);
        }
        super.method310(var3);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lpw;Llh;)Ldi;", line = 1225)
    public final class5 method311(class106 arg0, class208 arg1) {
        ++field687;
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "()V", line = 1233)
    public final void method312() {
        super.method312();
        ++field640;
        if (this.field681 != null) {
            this.field681.method3328();
            this.field681.release();
            this.field681 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "(I)F", line = 1249)
    public final float method313(int arg0) {
        ++field645;
        int var2 = 70 / ((arg0 - -44) / 34);
        return 0.0F;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILrv;)V", line = 1260)
    public final void method314(int arg0, int arg1, class440 arg2) {
        ++field613;
        int var4 = 54 / ((arg0 - -23) / 44);
        this.field703[arg1] = (class337) arg2;
    }

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "()V", line = 1271)
    public final void method315() {
        ++field682;
    }

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "(II)V", line = 1278)
    public final synchronized void method316(int arg0, int arg1) {
        ++field626;
        if (arg1 == 9898) {
            class71 var3 = new class71();
            var3.field1079 = (long) arg0;
            this.field698.method3610(9289, var3);
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(II)Llh;", line = 1293)
    public final class208 method317(int arg0, int arg1) {
        ++field650;
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "jb", descriptor = "(I)V", line = 1304)
    private final void method318(int arg0) {
        if (this.field705) {
            OpenGL.glPopMatrix();
        }
        if (arg0 >= 116) {
            ++field605;
            if (super.field3398.method4026(126)) {
                if (!this.field702) {
                    OpenGL.glLoadMatrixf(super.field3340.method2887(16383, class42.field525), 0);
                    this.field702 = true;
                    this.method292(-105);
                    this.method291((byte) 49);
                }
                if (super.field3335) {
                    this.field705 = false;
                } else {
                    OpenGL.glPushMatrix();
                    OpenGL.glMultMatrixf(super.field3337.method2887(16383, class42.field525), 0);
                    this.field705 = true;
                }
            } else if (!super.field3335) {
                OpenGL.glLoadMatrixf(super.field3337.method2887(16383, class42.field525), 0);
                this.field705 = false;
            } else {
                OpenGL.glLoadIdentity();
                this.field705 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(BZ)Lrv;", line = 1354)
    public final class440 method319(byte arg0, boolean arg1) {
        ++field628;
        return arg0 <= 58 ? null : new class337(this, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "(I)V", line = 1365)
    public final void method320(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field657;
        OpenGL.glLoadMatrixf(super.field3421, arg0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "(I)V", line = 1380)
    public final void method321(int arg0) {
        ++field629;
        if (arg0 == 9840) {
            if (super.field3390 && super.field3425 && ~super.field3406 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[BIILiv;IBZ)Ldg;", line = 1395)
    public final class19 method322(int arg0, byte[] arg1, int arg2, int arg3, class25 arg4, int arg5, byte arg6, boolean arg7) {
        ++field665;
        int var9 = -105 % ((70 - arg6) / 52);
        if (!this.field711 && (!class88.method611(arg5, 2) || !class88.method611(arg0, 2))) {
            if (!this.field717) {
                class267 var10 = new class267(this, arg4, class38.field472, class606.method3450(arg5, (byte) -25), class606.method3450(arg0, (byte) -25));
                var10.method99(0, arg2, arg5, arg4, arg1, 0, arg3, true, arg0);
                return var10;
            } else {
                return new class117(this, arg4, arg5, arg0, arg1, arg3, arg2);
            }
        } else {
            return new class267(this, arg4, arg5, arg0, arg7, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljt;Liv;B)Z", line = 1427)
    public final boolean method323(class38 arg0, class25 arg1, byte arg2) {
        if (arg2 != -16) {
            this.method289();
        }
        ++field694;
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZILip;Z)V", line = 1438)
    public final void method324(int arg0, boolean arg1, int arg2, class306 arg3, boolean arg4) {
        ++field620;
        OpenGL.glTexEnvi(8960, arg0 + 34176, class221.method1311((byte) 94, arg3));
        if (arg1) {
            OpenGL.glTexEnvi(8960, arg0 + 34192, arg4 ? 771 : 770);
        } else {
            OpenGL.glTexEnvi(8960, arg0 + 34192, arg4 ? 769 : 768);
        }
        if (arg2 != -9608) {
            field624 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ldi;)V", line = 1454)
    public final void method325(class5 arg0) {
        ++field623;
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "(II)V", line = 1461)
    public final void method326(int arg0, int arg1) {
        if (arg1 != -9763) {
            this.method289();
        }
        ++field634;
    }

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "(B)V", line = 1473)
    public final void method327(byte arg0) {
        ++field614;
        if (arg0 > 126) {
            if (class596.field8092 == super.field3432) {
                OpenGL.glBlendFunc(770, 771);
            } else {
                if (class57.field805 != super.field3432) {
                    if (class227.field3038 == super.field3432) {
                        OpenGL.glBlendFunc(774, 1);
                        return;
                    }
                } else {
                    OpenGL.glBlendFunc(1, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "(B)V", line = 1495)
    public final void method328(byte arg0) {
        if (arg0 <= 22) {
            this.field719 = true;
        }
        ++field604;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB[[IZ)Lpda;", line = 1506)
    public final class492 method329(int arg0, byte arg1, int[][] arg2, boolean arg3) {
        ++field661;
        if (arg1 != 75) {
            field624 = null;
        }
        return new class134(this, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZLip;)V", line = 1518)
    public final void method330(int arg0, int arg1, boolean arg2, class306 arg3) {
        ++field678;
        OpenGL.glTexEnvi(8960, 34184 - -arg1, class221.method1311((byte) 94, arg3));
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg2 ? 771 : 770);
        if (arg0 != -19072) {
            this.method307(47);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lpj;I)Lcc;", line = 1530)
    public final class579 method331(class40[] arg0, int arg1) {
        if (arg1 != 4982) {
            this.method320(-8);
        }
        ++field635;
        return new class584(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "hb", descriptor = "(I)V", line = 1542)
    public final void method332(int arg0) {
        for (int var2 = super.field3416 + -1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field627;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        int var4 = 90 % ((-60 - arg0) / 39);
        for (int var5 = 0; var5 < 8; ++var5) {
            int var6 = var5 + 16384;
            OpenGL.glLightfv(var6, 4608, var3, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field681.setSwapInterval(0);
        super.method332(-116);
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(Z)V", line = 1597)
    public final void method333(boolean arg0) {
        ++field674;
        class124.field1713[3] = (float) (super.field3430 >>> 24) / 255.0F;
        if (!arg0) {
            this.field714 = null;
        }
        class124.field1713[0] = (float) class665.method3759(super.field3430, 16711680) / 1.671168E7F;
        class124.field1713[1] = (float) class665.method3759(65280, super.field3430) / 65280.0F;
        class124.field1713[2] = (float) class665.method3759(super.field3430, 255) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class124.field1713, 0);
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(IB)Lpb;", line = 1612)
    public static final class79 method334(int arg0, byte arg1) {
        ++field667;
        if (arg1 > -9) {
            return null;
        } else {
            class79[] var2 = class25.method142(1);
            for (int var3 = 0; var3 < var2.length; ++var3) {
                class79 var4 = var2[var3];
                if (var4.field1142 == arg0) {
                    return var4;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)V", line = 1639)
    public final void method335(int arg0) {
        ++field670;
        if (!super.field3401) {
            OpenGL.glDisable(2929);
        } else {
            OpenGL.glEnable(2929);
        }
        if (arg0 != 18075) {
            this.field706 = 23L;
        }
    }

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "(I)V", line = 1654)
    public final void method336(int arg0) {
        OpenGL.glViewport(super.field3429, super.field3417, super.field3195, super.field3293);
        ++field639;
        if (arg0 != 9) {
            this.field698 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;", line = 1668)
    public final Object method337(Canvas arg0, boolean arg1) {
        ++field653;
        if (!arg1) {
            field668 = 23;
        }
        long var3 = this.field681.prepareSurface(arg0);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lsga;I)V", line = 1690)
    public final void method338(class651 arg0, int arg1) {
        ++field616;
        if (arg1 > -126) {
            this.method305(-74, (Canvas) null, (Object) null);
        }
        if (class134.field1909 == arg0) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class707.method3976(arg0, false);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
    }

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "(I)V", line = 1722)
    public final void method339(int arg0) {
        class124.field1713[2] = super.field3426 * super.field3365;
        ++field666;
        class124.field1713[arg0] = super.field3426 * super.field3420;
        class124.field1713[3] = 1.0F;
        class124.field1713[1] = super.field3426 * super.field3413;
        OpenGL.glLightfv(16384, 4609, class124.field1713, 0);
        class124.field1713[0] = -super.field3418 * super.field3420;
        class124.field1713[2] = -super.field3418 * super.field3365;
        class124.field1713[1] = -super.field3418 * super.field3413;
        class124.field1713[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class124.field1713, 0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([BI)V", line = 1789)
    public static final void method340(byte[] arg0, int arg1) {
        ++field692;
        class63 var2 = new class63(arg0);
        int var3 = 98 % ((arg1 - -41) / 58);
        boolean var4 = false;
        while (true) {
            while (true) {
                int var5 = var2.method505((byte) -119);
                if (var5 == 0) {
                    if (var4) {
                        return;
                    }
                    if (class425.field5961 == null) {
                        class425.field5961 = new int[4];
                        class540.field7511 = 4;
                        class558.field7750 = new int[4];
                    }
                    for (int var7 = 0; ~class425.field5961.length < ~var7; ++var7) {
                        class425.field5961[var7] = 0;
                        class558.field7750[var7] = var7 * 20;
                    }
                    return;
                }
                if (~var5 != -2) {
                    if (var5 != 2) {
                        if (~var5 == -4) {
                            class540.field7511 = var2.method505((byte) -119);
                            class558.field7750 = new int[class540.field7511];
                            class425.field5961 = new int[class540.field7511];
                        }
                    } else {
                        class32.field411 = var2.method482(-772591672);
                    }
                } else {
                    if (class425.field5961 == null) {
                        class425.field5961 = new int[4];
                        class558.field7750 = new int[4];
                        class540.field7511 = 4;
                    }
                    for (int var6 = 0; var6 < class425.field5961.length; ++var6) {
                        class425.field5961[var6] = var2.method496(-41);
                        class558.field7750[var6] = var2.method496(-45);
                    }
                    var4 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "(I)V", line = 1871)
    public final void method341(int arg0) {
        ++field663;
        if (arg0 != -27246) {
            this.method308(-48, -118, -26, 43, -1.7951590545458027D);
        }
        if (!super.field3343) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILjs;Lwi;III)V", line = 1886)
    public final void method342(int arg0, int arg1, class174 arg2, class202 arg3, int arg4, int arg5, int arg6) {
        ++field679;
        int var8;
        byte var9;
        if (class348.field4949 != arg3) {
            if (class542.field7532 == arg3) {
                var8 = arg4 + 1;
                var9 = 3;
            } else if (class542.field7529 == arg3) {
                var9 = 4;
                var8 = arg4 * 3;
            } else if (class151.field2082 != arg3) {
                if (class343.field4882 == arg3) {
                    var8 = arg4 - -2;
                    var9 = 5;
                } else {
                    var9 = 0;
                    var8 = arg4;
                }
            } else {
                var9 = 6;
                var8 = arg4 + 2;
            }
        } else {
            var8 = arg4 * 2;
            var9 = 1;
        }
        class38 var10 = arg2.method974(9484);
        class154 var11 = (class154) arg2;
        var11.method1808(0);
        OpenGL.glDrawElements(var9, var8, class466.method2849(var10, -11595), var11.method1810(-1) + (long) (var10.field460 * arg6));
        if (arg1 != 7) {
            this.field712 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIZ[III)Ldg;", line = 1944)
    public final class19 method343(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            return null;
        } else {
            ++field675;
            if (!this.field711 && (!class88.method611(arg2, 2) || !class88.method611(arg5, 2))) {
                if (!this.field717) {
                    class267 var8 = new class267(this, class623.field8394, class38.field472, class606.method3450(arg2, (byte) -25), class606.method3450(arg5, (byte) -25));
                    var8.method101(arg0, arg5, arg4, -28425, 0, arg1, arg2, 0);
                    return var8;
                } else {
                    return new class117(this, arg2, arg5, arg4, arg1, arg0);
                }
            } else {
                return new class267(this, arg2, arg5, arg3, arg4, arg1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V", line = 1976)
    public final void method344(Object arg0, byte arg1, Canvas arg2) {
        ++field642;
        Long var4 = (Long) arg0;
        if (arg1 <= 20) {
            this.field715 = 124;
        }
        this.field681.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZIBLiv;[FI)Ldg;", line = 1989)
    public final class19 method345(int arg0, int arg1, boolean arg2, int arg3, byte arg4, class25 arg5, float[] arg6, int arg7) {
        if (arg4 != -59) {
            this.method316(-108, 89);
        }
        ++field636;
        if (!this.field711 && (!class88.method611(arg1, 2) || !class88.method611(arg7, 2))) {
            if (this.field717) {
                return new class117(this, arg5, arg1, arg7, arg6, arg3, arg0);
            } else {
                class267 var9 = new class267(this, arg5, class38.field476, class606.method3450(arg1, (byte) -25), class606.method3450(arg7, (byte) -25));
                var9.method1816(0, arg3, arg7, arg6, arg1, 5121, arg5, 0, arg0);
                return var9;
            }
        } else {
            return new class267(this, arg5, arg1, arg7, arg2, arg6, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "ya", descriptor = "()V", line = 2018)
    public final void method346() {
        ++field651;
        this.method1453(true, -117);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILwi;II)V", line = 2027)
    public final void method347(int arg0, class202 arg1, int arg2, int arg3) {
        ++field638;
        int var5;
        byte var6;
        if (class348.field4949 == arg1) {
            var5 = arg2 * 2;
            var6 = 1;
        } else if (class542.field7532 != arg1) {
            if (class542.field7529 != arg1) {
                if (class151.field2082 == arg1) {
                    var5 = arg2 + 2;
                    var6 = 6;
                } else if (class343.field4882 == arg1) {
                    var6 = 5;
                    var5 = arg2 + 2;
                } else {
                    var6 = 0;
                    var5 = arg2;
                }
            } else {
                var5 = arg2 * 3;
                var6 = 4;
            }
        } else {
            var5 = arg2 + 1;
            var6 = 3;
        }
        OpenGL.glDrawArrays(var6, arg3, var5);
        int var7 = 86 / ((arg0 - -29) / 57);
    }
}
