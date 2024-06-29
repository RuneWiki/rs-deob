import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class42 extends class89 implements class81 {

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "Lcm;")
    private class413 field558 = new class413();

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "Lde;")
    private class257 field567 = new class16();

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
    private int field571 = -1;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "[Lnd;")
    private class81[] field569 = new class81[4];

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public int field570 = 3;

    @OriginalMember(owner = "client!fu", name = "S", descriptor = "Z")
    private boolean field577 = false;

    @OriginalMember(owner = "client!fu", name = "T", descriptor = "I")
    public int field578 = 8;

    @OriginalMember(owner = "client!fu", name = "P", descriptor = "Lcf;")
    private class92 field574 = new class92();

    @OriginalMember(owner = "client!fu", name = "W", descriptor = "Lcf;")
    private class92 field581 = new class92();

    @OriginalMember(owner = "client!fu", name = "X", descriptor = "Lcf;")
    private class92 field582 = new class92();

    @OriginalMember(owner = "client!fu", name = "Y", descriptor = "Lcf;")
    private class92 field583 = new class92();

    @OriginalMember(owner = "client!fu", name = "Z", descriptor = "Lcf;")
    private class92 field584 = new class92();

    @OriginalMember(owner = "client!fu", name = "ab", descriptor = "Lcf;")
    private class92 field585 = new class92();

    @OriginalMember(owner = "client!fu", name = "bb", descriptor = "Lcf;")
    private class92 field586 = new class92();

    @OriginalMember(owner = "client!fu", name = "ub", descriptor = "F")
    public float field605 = 1.0F;

    @OriginalMember(owner = "client!fu", name = "pb", descriptor = "I")
    private int field600 = 0;

    @OriginalMember(owner = "client!fu", name = "hb", descriptor = "I")
    public int field592 = 50;

    @OriginalMember(owner = "client!fu", name = "sb", descriptor = "I")
    private int field603 = 0;

    @OriginalMember(owner = "client!fu", name = "Ub", descriptor = "F")
    private float field631 = 0.0F;

    @OriginalMember(owner = "client!fu", name = "Tb", descriptor = "F")
    private float field630 = 1.0F;

    @OriginalMember(owner = "client!fu", name = "ob", descriptor = "I")
    public int field599 = -1;

    @OriginalMember(owner = "client!fu", name = "nc", descriptor = "I")
    private int field650 = -1;

    @OriginalMember(owner = "client!fu", name = "Pb", descriptor = "I")
    public int field626 = 0;

    @OriginalMember(owner = "client!fu", name = "Qb", descriptor = "I")
    private int field627 = 0;

    @OriginalMember(owner = "client!fu", name = "eb", descriptor = "F")
    public float field589 = 3584.0F;

    @OriginalMember(owner = "client!fu", name = "tc", descriptor = "I")
    private int field656 = 0;

    @OriginalMember(owner = "client!fu", name = "oc", descriptor = "I")
    public int field651 = -1;

    @OriginalMember(owner = "client!fu", name = "Rb", descriptor = "F")
    public float field628 = -1.0F;

    @OriginalMember(owner = "client!fu", name = "Hb", descriptor = "F")
    public float field618 = -1.0F;

    @OriginalMember(owner = "client!fu", name = "ac", descriptor = "I")
    public int field637 = 3584;

    @OriginalMember(owner = "client!fu", name = "Bc", descriptor = "I")
    private int field664 = 0;

    @OriginalMember(owner = "client!fu", name = "Wb", descriptor = "I")
    private int field633 = 8448;

    @OriginalMember(owner = "client!fu", name = "bc", descriptor = "I")
    public int field638 = 0;

    @OriginalMember(owner = "client!fu", name = "Ic", descriptor = "F")
    public float field671 = 1.0F;

    @OriginalMember(owner = "client!fu", name = "xc", descriptor = "I")
    private int field660 = 0;

    @OriginalMember(owner = "client!fu", name = "dc", descriptor = "F")
    public float field640 = 1.0F;

    @OriginalMember(owner = "client!fu", name = "Ab", descriptor = "I")
    public int field611 = 0;

    @OriginalMember(owner = "client!fu", name = "mc", descriptor = "[F")
    private float[] field649 = new float[16];

    @OriginalMember(owner = "client!fu", name = "Zb", descriptor = "I")
    public int field636 = 512;

    @OriginalMember(owner = "client!fu", name = "yc", descriptor = "I")
    private int field661 = -1;

    @OriginalMember(owner = "client!fu", name = "vc", descriptor = "I")
    private int field658 = 8448;

    @OriginalMember(owner = "client!fu", name = "yb", descriptor = "F")
    public float field609 = 3584.0F;

    @OriginalMember(owner = "client!fu", name = "qb", descriptor = "[F")
    private float[] field601 = new float[4];

    @OriginalMember(owner = "client!fu", name = "Mc", descriptor = "[F")
    public float[] field675 = new float[4];

    @OriginalMember(owner = "client!fu", name = "Vc", descriptor = "I")
    public int field684 = 512;

    @OriginalMember(owner = "client!fu", name = "Kc", descriptor = "[F")
    private float[] field673 = new float[4];

    @OriginalMember(owner = "client!fu", name = "Dc", descriptor = "I")
    private int field666 = 0;

    @OriginalMember(owner = "client!fu", name = "wb", descriptor = "F")
    private float field607 = 1.0F;

    @OriginalMember(owner = "client!fu", name = "Ib", descriptor = "[F")
    private float[] field619 = new float[4];

    @OriginalMember(owner = "client!fu", name = "Ac", descriptor = "I")
    public int field663 = -1;

    @OriginalMember(owner = "client!fu", name = "bd", descriptor = "Z")
    private boolean field690 = true;

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "Ljava/awt/Canvas;")
    private Canvas field564;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "Ljaggl/context;")
    private context field560;

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "Ljaggl/opengl;")
    public opengl field557;

    @OriginalMember(owner = "client!fu", name = "Lb", descriptor = "Z")
    public boolean field622;

    @OriginalMember(owner = "client!fu", name = "ib", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!fu", name = "cc", descriptor = "Ljava/lang/String;")
    private String field639;

    @OriginalMember(owner = "client!fu", name = "Hc", descriptor = "Ljava/lang/String;")
    private String field670;

    @OriginalMember(owner = "client!fu", name = "Cc", descriptor = "Z")
    private boolean field665;

    @OriginalMember(owner = "client!fu", name = "Jb", descriptor = "Z")
    public boolean field620;

    @OriginalMember(owner = "client!fu", name = "Nc", descriptor = "Z")
    public boolean field676;

    @OriginalMember(owner = "client!fu", name = "Fc", descriptor = "Z")
    public boolean field668;

    @OriginalMember(owner = "client!fu", name = "Xc", descriptor = "Z")
    private boolean field686;

    @OriginalMember(owner = "client!fu", name = "ed", descriptor = "Z")
    public boolean field693;

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "Lsn;")
    public class452 field556;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "Lmc;")
    private class220 field566;

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "Lqj;")
    private class356 field559;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "Leg;")
    private class253 field561;

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "[I")
    private static int[] field555 = new int[1000];

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "[F")
    private static float[] field562 = new float[4];

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "[F")
    private static float[] field565 = new float[4];

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field563 = Boolean.FALSE;

    @OriginalMember(owner = "client!fu", name = "cb", descriptor = "F")
    private float field587;

    @OriginalMember(owner = "client!fu", name = "jb", descriptor = "F")
    public float field594;

    @OriginalMember(owner = "client!fu", name = "mb", descriptor = "F")
    private float field597;

    @OriginalMember(owner = "client!fu", name = "Fb", descriptor = "F")
    public float field616;

    @OriginalMember(owner = "client!fu", name = "hc", descriptor = "F")
    public float field644;

    @OriginalMember(owner = "client!fu", name = "sc", descriptor = "F")
    public float field655;

    @OriginalMember(owner = "client!fu", name = "zc", descriptor = "F")
    private float field662;

    @OriginalMember(owner = "client!fu", name = "Gc", descriptor = "F")
    public float field669;

    @OriginalMember(owner = "client!fu", name = "Pc", descriptor = "F")
    public float field678;

    @OriginalMember(owner = "client!fu", name = "Rc", descriptor = "F")
    public float field680;

    @OriginalMember(owner = "client!fu", name = "cd", descriptor = "F")
    public float field691;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!fu", name = "R", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!fu", name = "U", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!fu", name = "db", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!fu", name = "lb", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!fu", name = "nb", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!fu", name = "xb", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!fu", name = "Cb", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!fu", name = "Mb", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!fu", name = "Sb", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!fu", name = "Xb", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!fu", name = "gc", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!fu", name = "lc", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!fu", name = "pc", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!fu", name = "wc", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "client!fu", name = "Sc", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!fu", name = "Wc", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "client!fu", name = "dd", descriptor = "J")
    private long field692;

    @OriginalMember(owner = "client!fu", name = "rb", descriptor = "Lhm;")
    public class148 field602;

    @OriginalMember(owner = "client!fu", name = "Gb", descriptor = "Ljj;")
    private class159 field617;

    @OriginalMember(owner = "client!fu", name = "gb", descriptor = "Lmi;")
    public class16 field591;

    @OriginalMember(owner = "client!fu", name = "Ec", descriptor = "Lmi;")
    public class16 field667;

    @OriginalMember(owner = "client!fu", name = "Uc", descriptor = "Lpc;")
    private class171 field683;

    @OriginalMember(owner = "client!fu", name = "Ob", descriptor = "Lwc;")
    private class245 field625;

    @OriginalMember(owner = "client!fu", name = "zb", descriptor = "Lfa;")
    public class425 field610;

    @OriginalMember(owner = "client!fu", name = "Vb", descriptor = "Lfa;")
    public class425 field632;

    @OriginalMember(owner = "client!fu", name = "Yb", descriptor = "Lfa;")
    public class425 field635;

    @OriginalMember(owner = "client!fu", name = "rc", descriptor = "Lfa;")
    public class425 field654;

    @OriginalMember(owner = "client!fu", name = "Jc", descriptor = "Lfa;")
    public class425 field672;

    @OriginalMember(owner = "client!fu", name = "Yc", descriptor = "Lfa;")
    public class425 field687;

    @OriginalMember(owner = "client!fu", name = "Zc", descriptor = "Lfa;")
    public class425 field688;

    @OriginalMember(owner = "client!fu", name = "ad", descriptor = "Lfa;")
    public class425 field689;

    @OriginalMember(owner = "client!fu", name = "Eb", descriptor = "Luo;")
    public class429 field615;

    @OriginalMember(owner = "client!fu", name = "fc", descriptor = "Luo;")
    public class429 field642;

    @OriginalMember(owner = "client!fu", name = "jc", descriptor = "Luo;")
    public class429 field646;

    @OriginalMember(owner = "client!fu", name = "Nb", descriptor = "Lbm;")
    private class438 field624;

    @OriginalMember(owner = "client!fu", name = "V", descriptor = "Lnd;")
    private class81 field580;

    @OriginalMember(owner = "client!fu", name = "fb", descriptor = "Z")
    private boolean field590;

    @OriginalMember(owner = "client!fu", name = "kb", descriptor = "Z")
    private boolean field595;

    @OriginalMember(owner = "client!fu", name = "tb", descriptor = "Z")
    public boolean field604;

    @OriginalMember(owner = "client!fu", name = "vb", descriptor = "Z")
    private boolean field606;

    @OriginalMember(owner = "client!fu", name = "Bb", descriptor = "Z")
    public boolean field612;

    @OriginalMember(owner = "client!fu", name = "Db", descriptor = "Z")
    private boolean field614;

    @OriginalMember(owner = "client!fu", name = "Kb", descriptor = "Z")
    public boolean field621;

    @OriginalMember(owner = "client!fu", name = "ec", descriptor = "Z")
    private boolean field641;

    @OriginalMember(owner = "client!fu", name = "ic", descriptor = "Z")
    private boolean field645;

    @OriginalMember(owner = "client!fu", name = "kc", descriptor = "Z")
    private boolean field647;

    @OriginalMember(owner = "client!fu", name = "qc", descriptor = "Z")
    private boolean field653;

    @OriginalMember(owner = "client!fu", name = "Lc", descriptor = "Z")
    private boolean field674;

    @OriginalMember(owner = "client!fu", name = "Oc", descriptor = "Z")
    public boolean field677;

    @OriginalMember(owner = "client!fu", name = "Qc", descriptor = "Z")
    private boolean field679;

    @OriginalMember(owner = "client!fu", name = "Tc", descriptor = "Z")
    public boolean field682;

    @OriginalMember(owner = "client!fu", name = "uc", descriptor = "[Ltp;")
    private class375[] field657;

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ltq;IILis;)V")
    public class42(Canvas arg0, class248 arg1, int arg2, int arg3, class65 arg4) {
        super(arg2, arg1);
        this.field564 = arg0;
        int var6 = 0;
        while (!this.field564.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class89.method752(0, 1000L);
        }
        this.field564.setIgnoreRepaint(true);
        try {
            if (field563 == null || !field563) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field563 = Boolean.TRUE;
                } else {
                    class275 var7 = arg4.method612(this.getClass(), false);
                    while (var7.field3979 == 0) {
                        class89.method752(0, 100L);
                    }
                    if (var7.field3979 == 1) {
                        field563 = Boolean.TRUE;
                    }
                }
            }
            if (field563 == null || !field563) {
                throw new RuntimeException("");
            }
            this.field560 = new context();
            if (!this.field560.choosePixelFormat(this.field564, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field560.createContext()) {
                this.method310();
                this.field557 = this.field560.getGL();
                int var8 = this.method433();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field593 = this.field622 ? 33639 : 5121;
                String var9 = this.field639.toLowerCase();
                String var10 = this.field670.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class237.method1645(' ', var10.replace('/', ' '), 0);
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class105.method839(119, var16.substring(1, 3))) {
                                    var16 = var16.substring(1);
                                    var13 = true;
                                }
                                if (var16.equals("hd")) {
                                    var12 = true;
                                } else {
                                    if (var16.startsWith("hd")) {
                                        var16 = var16.substring(2);
                                        var12 = true;
                                    }
                                    if (var16.length() >= 4 && class105.method839(76, var16.substring(0, 4))) {
                                        var11 = class270.method1827(var16.substring(0, 4), false);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field665 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field620 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field676 = false;
                    }
                    this.field668 &= this.field557.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field686 = this.field665;
                }
                if (var9.contains("intel")) {
                    this.field693 = false;
                }
                if (this.field665) {
                    try {
                        int[] var18 = new int[1];
                        this.field557.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method319(this);
                this.method294();
                this.method370();
                new class455(this);
                this.field556 = new class452(this, this.field1250);
                class157.method1126(-105, true, true);
                this.field577 = true;
                this.field566 = new class220(this);
                this.field559 = new class356(this);
                this.field561 = new class253(this);
                this.method399();
                this.field557.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field560.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class89.method752(0, 100L);
                    }
                }
                this.field557.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method331();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)V")
    public final void method289(int arg0, int arg1, int arg2) {
        this.field557.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field557.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "()V")
    public final void method290() {
        if (this.field681 == 8) {
            return;
        }
        this.method344();
        this.method412(true);
        this.method313(true);
        this.method388(true);
        this.method349(1);
        this.method421(1);
        this.field681 = 8;
    }

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "()Z")
    public final boolean method291() {
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(Z)V")
    public final void method292(boolean arg0) {
    }

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "()V")
    public final void method293() {
        this.field557.glLightfv(16384, 4611, this.field675, 0);
        this.field557.glLightfv(16385, 4611, this.field673, 0);
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "()V")
    public final void method294() {
        this.field572 = this.field564.getWidth();
        this.field576 = this.field564.getHeight();
        this.field557.glViewport(this.field656, this.field664, this.field572, this.field576);
        this.method317();
        this.method360();
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
    public final synchronized void method295(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field581.method765(-24)) {
            class478 var4 = (class478) this.field581.method776((byte) 47);
            field555[var2++] = (int) var4.field6382;
            this.field575 -= var4.field6789;
            if (var2 == 1000) {
                this.field557.glDeleteBuffersARB(var2, field555, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field557.glDeleteBuffersARB(var2, field555, 0);
            var2 = 0;
        }
        while (!this.field582.method765(-64)) {
            class478 var5 = (class478) this.field582.method776((byte) -56);
            field555[var2++] = (int) var5.field6382;
            this.field573 -= var5.field6789;
            if (var2 == 1000) {
                this.field557.glDeleteTextures(var2, field555, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field557.glDeleteTextures(var2, field555, 0);
            var2 = 0;
        }
        while (!this.field583.method765(-54)) {
            class478 var6 = (class478) this.field583.method776((byte) -54);
            field555[var2++] = var6.field6789;
            if (var2 == 1000) {
                this.field557.glDeleteFramebuffersEXT(var2, field555, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field557.glDeleteFramebuffersEXT(var2, field555, 0);
            var2 = 0;
        }
        while (!this.field584.method765(-69)) {
            class478 var7 = (class478) this.field584.method776((byte) -47);
            field555[var2++] = (int) var7.field6382;
            this.field579 -= var7.field6789;
            if (var2 == 1000) {
                this.field557.glDeleteRenderbuffersEXT(var2, field555, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field557.glDeleteRenderbuffersEXT(var2, field555, 0);
            var2 = 0;
        }
        while (!this.field585.method765(-24)) {
            class478 var8 = (class478) this.field585.method776((byte) 106);
            field555[var2++] = (int) var8.field6382;
            if (var2 == 1000) {
                this.field557.glDeleteProgramsARB(var2, field555, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field557.glDeleteProgramsARB(var2, field555, 0);
            boolean var9 = false;
        }
        while (!this.field574.method765(-38)) {
            class478 var10 = (class478) this.field574.method776((byte) -101);
            this.field557.glDeleteLists((int) var10.field6382, var10.field6789);
        }
        while (!this.field586.method765(-41)) {
            class478 var11 = (class478) this.field586.method776((byte) -58);
            this.field557.glDeleteObjectARB(var11.field6789);
        }
        while (!this.field574.method765(-50)) {
            class478 var12 = (class478) this.field574.method776((byte) -71);
            this.field557.glDeleteLists((int) var12.field6382, var12.field6789);
        }
        if (this.method322() > 100663296 && class10.method51(-3183) > this.field692 + 60000L) {
            System.gc();
            this.field692 = class10.method51(-3183);
        }
        this.field568 = var3;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
    public final void method296(int arg0, int arg1) {
        if (this.field599 == arg0 && this.field651 == arg1) {
            return;
        }
        this.field599 = arg0;
        this.field651 = arg1;
        if (!this.field604) {
            this.method372();
            this.method324();
        }
    }

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "(IIIIII)Lrp;")
    public final class419 method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field682 ? new class306(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "()V")
    public final void method298() {
        if (this.field572 <= 0 && this.field576 <= 0) {
            return;
        }
        int var1 = this.field627;
        int var2 = this.field603;
        int var3 = this.field600;
        int var4 = this.field660;
        this.method360();
        this.field557.glReadBuffer(1028);
        this.field557.glDrawBuffer(1029);
        this.method317();
        this.method412(false);
        this.method339(false);
        this.method313(false);
        this.method388(false);
        this.method303((class375) null);
        this.method347(-2);
        this.method421(0);
        this.method349(0);
        this.field557.glMatrixMode(5889);
        this.field557.glLoadIdentity();
        this.field557.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field557.glMatrixMode(5888);
        this.field557.glLoadIdentity();
        this.field557.glRasterPos2i(0, 0);
        this.field557.glCopyPixels(0, 0, this.field572, this.field576, 6144);
        this.field557.glFlush();
        this.field557.glReadBuffer(1029);
        this.field557.glDrawBuffer(1029);
        this.method453(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "()Z")
    public final boolean method299() {
        return false;
    }

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "()I")
    public final int method300() {
        int var1 = this.field629;
        this.field629 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fu", name = "O", descriptor = "()V")
    private final void method301() {
        float var1 = (float) (-this.field611) * this.field607 / (float) this.field684;
        float var2 = (float) (-this.field638) * this.field607 / (float) this.field636;
        float var3 = (float) (this.field572 - this.field611) * this.field607 / (float) this.field684;
        float var4 = (float) (this.field576 - this.field638) * this.field607 / (float) this.field636;
        this.field557.glMatrixMode(5889);
        this.field557.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field557.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field592 - this.field691), (double) ((float) this.field637 - this.field691));
        }
        this.field557.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lgm;Z)Lrn;")
    public final class417 method302(class355 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field4877 * arg0.field4876];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4879 == null) {
            for (int var8 = 0; var8 < arg0.field4876; var8++) {
                for (int var9 = 0; var9 < arg0.field4877; var9++) {
                    int var10 = arg0.field4881[arg0.field4880[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field4876; var6++) {
                for (int var7 = 0; var7 < arg0.field4877; var7++) {
                    var3[var5++] = arg0.field4879[var4] << 24 | arg0.field4881[arg0.field4880[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class417 var11 = this.method342(var3, 0, arg0.field4877, arg0.field4877, arg0.field4876);
        var11.method1291(arg0.field4874, arg0.field4873, arg0.field4875, arg0.field4878);
        return var11;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ltp;)V")
    public final void method303(class375 arg0) {
        class375 var2 = this.field657[this.field652];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field557.glDisable(var2.field5180);
            } else {
                if (var2 == null) {
                    this.field557.glEnable(arg0.field5180);
                } else if (arg0.field5180 != var2.field5180) {
                    this.field557.glDisable(var2.field5180);
                    this.field557.glEnable(arg0.field5180);
                }
                this.field557.glBindTexture(arg0.field5180, arg0.method2295());
            }
            this.field657[this.field652] = arg0;
        }
        this.field681 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIILoj;II)V")
    public final void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class405 arg6, int arg7, int arg8) {
        class60 var10 = (class60) arg6;
        class245 var11 = var10.field880;
        this.method449();
        this.method303(var10.field880);
        this.method349(arg5);
        this.method353(7681, 8448);
        this.method335(0, 34167, 768);
        float var12 = var11.field3550 / (float) var11.field3553;
        float var13 = var11.field3549 / (float) var11.field3551;
        this.field557.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field557.glBegin(1);
        this.field557.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field557.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field557.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field557.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field557.glEnd();
        this.method335(0, 5890, 768);
    }

    @OriginalMember(owner = "client!fu", name = "P", descriptor = "()Lnd;")
    public final class81 method305() {
        return this.field580;
    }

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "()Lde;")
    public final class257 method306() {
        return this.field567;
    }

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "()Z")
    public final boolean method307() {
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(Z)V")
    public final void method308(boolean arg0) {
        this.field690 = arg0;
        this.method346();
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(IIII)V")
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        this.field604 = true;
        this.field650 = arg1;
        this.field663 = arg2;
        this.field626 = arg3;
        this.method372();
        this.method324();
        this.field566.method1517(false, 22957, false, 3);
        this.field566.method1516((byte) 66, true, arg0);
    }

    @OriginalMember(owner = "client!fu", name = "Q", descriptor = "()V")
    private final void method310() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field560.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class89.method752(0, 1000L);
        }
    }

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "(I)I")
    public final int method311(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljj;III)V")
    public final void method312(class159 arg0, int arg1, int arg2, int arg3) {
        this.method451(arg0);
        arg0.method1033(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(Z)V")
    public final void method313(boolean arg0) {
        if (this.field674 == arg0) {
            return;
        }
        if (arg0) {
            this.field557.glEnable(2929);
        } else {
            this.field557.glDisable(2929);
        }
        this.field674 = arg0;
        this.field681 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "(I)V")
    public final void method314(int arg0) {
        this.method310();
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(IZ)V")
    public final void method315(int arg0, boolean arg1) {
        this.method440(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III[I)V")
    public final void method316(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field591.field152 + (float) arg0 * this.field591.field157 + (float) arg1 * this.field591.field155 + this.field591.field162;
        if ((var5 < (float) this.field592) || (var5 > (float) this.field637)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field591.field153 + (float) arg0 * this.field591.field160 + (float) arg1 * this.field591.field151 + this.field591.field154) * (float) this.field684 / var5);
        int var7 = (int) (((float) arg2 * this.field591.field159 + (float) arg0 * this.field591.field158 + (float) arg1 * this.field591.field150 + this.field591.field156) * (float) this.field636 / var5);
        if ((float) var6 >= this.field655 && (float) var6 <= this.field644 && (float) var7 >= this.field678 && (float) var7 <= this.field680) {
            arg3[0] = (int) ((float) var6 - this.field655);
            arg3[1] = (int) ((float) var7 - this.field678);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fu", name = "R", descriptor = "()V")
    public final void method317() {
        if (this.field598 != 0) {
            this.field598 = 0;
            this.field681 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(II)V")
    public final synchronized void method318(int arg0, int arg1) {
        class478 var3 = new class478(arg1);
        var3.field6382 = (long) arg0;
        this.field583.method766(var3, -1);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lnd;)V")
    public final void method319(class81 arg0) {
        if (this.field571 >= 3) {
            throw new RuntimeException();
        }
        if (this.field571 >= 0) {
            this.field569[this.field571].method358();
        }
        this.field580 = this.field569[++this.field571] = arg0;
        this.field580.method426();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field625 == null || this.field625.field5978 < arg2 || this.field625.field5977 < arg3) {
            this.field625 = class245.method1690(false, 6406, (byte) -44, 6406, arg6, arg3, arg2, this);
            this.field625.method2564(false, false);
            var10 = this.field625.field3549;
            var11 = this.field625.field3550;
        } else {
            this.field625.method2561(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field625.field3549 / (float) this.field625.field5977;
            var11 = (float) arg2 * this.field625.field3550 / (float) this.field625.field5978;
        }
        this.method449();
        this.method303(this.field625);
        this.method349(arg8);
        this.field557.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method436(arg5);
        this.method353(34165, 34165);
        this.method335(0, 34166, 768);
        this.method335(2, 5890, 770);
        this.method289(0, 34166, 770);
        this.method289(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field557.glBegin(7);
        this.field557.glTexCoord2f(0.0F, 0.0F);
        this.field557.glVertex2f(var12, var13);
        this.field557.glTexCoord2f(0.0F, var11);
        this.field557.glVertex2f(var12, var15);
        this.field557.glTexCoord2f(var10, var11);
        this.field557.glVertex2f(var14, var15);
        this.field557.glTexCoord2f(var10, 0.0F);
        this.field557.glVertex2f(var14, var13);
        this.field557.glEnd();
        this.method335(0, 5890, 768);
        this.method335(2, 34166, 770);
        this.method289(0, 5890, 770);
        this.method289(2, 34166, 770);
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(IIIIII)V")
    public final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method428();
        this.method349(arg5);
        this.field557.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field557.glBegin(2);
        this.field557.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field557.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field557.glEnd();
    }

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "()I")
    public final int method322() {
        return this.field575 + this.field573 + this.field579;
    }

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "()V")
    public final void method323() {
        if (this.field561.method925(23620)) {
            this.field559.method2206(this.field561);
            this.field556.method2730((byte) -127);
        }
    }

    @OriginalMember(owner = "client!fu", name = "S", descriptor = "()V")
    private final void method324() {
        if (this.field614 && this.field604 | this.field651 >= 0) {
            this.field557.glEnable(2912);
        } else {
            this.field557.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(Z)V")
    public final void method325(boolean arg0) {
        if (this.field641 != arg0) {
            this.field641 = arg0;
            this.method424();
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([Ln;Lpa;Lde;[Lr;I)V")
    public final void method326(class468[] arg0, class404 arg1, class257 arg2, class63[] arg3, int arg4) {
        this.method437(arg0, arg2, arg3, arg4);
        this.method329(arg1);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lqi;IIII)Ln;")
    public final class468 method327(class430 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class425(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "()Lde;")
    public final class257 method328() {
        return new class16();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lpa;)V")
    public final void method329(class404 arg0) {
        this.field558.method2482(this, arg0);
    }

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "()Z")
    public final boolean method330() {
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "()V")
    public final void method331() {
        if (this.field557 != null) {
            try {
                this.field559.method2205();
            } catch (Throwable var4) {
            }
            this.field557 = null;
        }
        if (this.field560 != null) {
            this.method336();
            try {
                this.field560.destroy();
            } catch (Throwable var3) {
            }
            this.field560 = null;
        }
        if (this.field577) {
            class169.method1225(true, (byte) 111, true);
            this.field577 = false;
        }
    }

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "()I")
    public final int method332() {
        int var1 = this.field623;
        this.field623 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(II)V")
    public final synchronized void method333(int arg0, int arg1) {
        class478 var3 = new class478(arg1);
        var3.field6382 = (long) arg0;
        this.field582.method766(var3, -1);
    }

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "()I")
    public final int method334() {
        return this.field592;
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(III)V")
    public final void method335(int arg0, int arg1, int arg2) {
        this.field557.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field557.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!fu", name = "T", descriptor = "()V")
    private final void method336() {
        try {
            this.field560.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!fu", name = "U", descriptor = "()V")
    private final void method337() {
        this.field557.glLoadIdentity();
        this.field557.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field557.glMultMatrixf(this.field591.method98(true), 0);
        this.method293();
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(F)V")
    public final void method338(float arg0) {
        if (this.field607 != arg0) {
            this.field607 = arg0;
            if (this.field598 == 3) {
                this.method301();
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(Z)V")
    public final void method339(boolean arg0) {
        if (this.field590 != arg0) {
            this.field590 = arg0;
            this.method424();
            this.field681 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "()Z")
    public final boolean method340() {
        return !this.field645;
    }

    @OriginalMember(owner = "client!fu", name = "V", descriptor = "()V")
    public final void method341() {
        this.field557.glPopMatrix();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([IIIII)Lrn;")
    public final class417 method342(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class179(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "()V")
    public final void method343() {
        try {
            this.field560.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!fu", name = "W", descriptor = "()V")
    public final void method344() {
        if (this.field598 != 2) {
            this.field598 = 2;
            this.method427();
            this.method337();
            this.field681 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "()V")
    public final void method345() {
        this.field566.method1517(false, 22957, false, 0);
        this.field604 = false;
        this.method372();
        this.method324();
    }

    @OriginalMember(owner = "client!fu", name = "X", descriptor = "()V")
    private final void method346() {
        this.field557.glDepthMask(this.field606 && this.field690);
    }

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "(I)V")
    public final void method347(int arg0) {
        this.method315(arg0, true);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(IIIIII)V")
    public final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method428();
        this.method349(arg5);
        this.field557.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field653) {
            this.field557.glDisable(32925);
        }
        this.field557.glBegin(2);
        this.field557.glVertex2f(var7, var8);
        this.field557.glVertex2f(var7, var10);
        this.field557.glVertex2f(var9, var10);
        this.field557.glVertex2f(var9, var8);
        this.field557.glEnd();
        if (this.field653) {
            this.field557.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "(I)V")
    public final void method349(int arg0) {
        if (this.field608 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 2;
            var3 = false;
            var4 = true;
        } else if (arg0 == 129) {
            var2 = 3;
            var3 = false;
            var4 = true;
        } else if (arg0 == 130) {
            var2 = 4;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field595 != var3) {
            this.field557.glColorMask(var3, var3, var3, true);
            this.field595 = var3;
        }
        if (this.field647 != var4) {
            if (var4) {
                this.field557.glEnable(3008);
            } else {
                this.field557.glDisable(3008);
            }
            this.field647 = var4;
        }
        if (this.field659 != var2) {
            if (var2 == 1) {
                this.field557.glEnable(3042);
                this.field557.glBlendEquation(32774);
                this.field557.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field557.glEnable(3042);
                this.field557.glBlendEquation(32774);
                this.field557.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field557.glEnable(3042);
                this.field557.glBlendEquation(32778);
                this.field557.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field557.glEnable(3042);
                this.field557.glBlendEquation(32774);
                this.field557.glBlendFunc(774, 1);
            } else {
                this.field557.glDisable(3042);
            }
            this.field659 = var2;
        }
        this.field608 = arg0;
        this.field681 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(II)V")
    public final void method350(int arg0, int arg1) {
        if (this.field592 == arg0 && this.field637 == arg1) {
            return;
        }
        this.field592 = arg0;
        this.field637 = arg1;
        this.method396();
        this.method372();
        if (this.field598 == 3) {
            this.method301();
        } else if (this.field598 == 2) {
            this.method427();
        }
    }

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "()V")
    public final void method351() {
        this.field559.method2203();
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(IIIII)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "(II)V")
    public final void method353(int arg0, int arg1) {
        if (this.field652 != 0) {
            this.field557.glTexEnvi(8960, 34161, arg0);
            this.field557.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field658 != arg0) {
            this.field557.glTexEnvi(8960, 34161, arg0);
            this.field658 = arg0;
            var3 = true;
        }
        if (this.field633 != arg1) {
            this.field557.glTexEnvi(8960, 34162, arg1);
            this.field633 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field681 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "()I")
    public final int method354() {
        return this.field576;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)I")
    public final int method355(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fu", name = "Y", descriptor = "()V")
    private final void method356() {
        if (this.field679) {
            this.field557.glMatrixMode(5890);
            this.field557.glLoadIdentity();
            this.field557.glMatrixMode(5888);
            this.field679 = false;
        }
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "()V")
    public final void method358() {
    }

    @OriginalMember(owner = "client!fu", name = "Z", descriptor = "()Lbl;")
    public final class240 method359() {
        return this.field624 == null ? null : this.field624.method1966((byte) -122);
    }

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "()V")
    public final void method360() {
        this.field627 = 0;
        this.field600 = 0;
        this.field603 = this.field572;
        this.field660 = this.field576;
        this.field557.glDisable(3089);
        this.method394();
    }

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "(I)V")
    public final synchronized void method361(int arg0) {
        class478 var2 = new class478(arg0);
        this.field586.method766(var2, -1);
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(II)I")
    public final int method362(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(FFF)V")
    public final void method363(float arg0, float arg1, float arg2) {
        class253.field3625 = arg0;
        class253.field3628 = arg1;
        class253.field3640 = arg2;
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(IIIIII)Z")
    public final boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field591.field152 + (float) arg0 * this.field591.field157 + (float) arg1 * this.field591.field155 + this.field591.field162;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field591.field152 + (float) arg3 * this.field591.field157 + (float) arg4 * this.field591.field155 + this.field591.field162;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field592) || !(var8 < (float) this.field592)) || !(!(var7 > (float) this.field637) || !(var8 > (float) this.field637))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field591.field153 + (float) arg0 * this.field591.field160 + (float) arg1 * this.field591.field151 + this.field591.field154) * (float) this.field684 / var7);
        int var10 = (int) (((float) arg5 * this.field591.field153 + (float) arg3 * this.field591.field160 + (float) arg4 * this.field591.field151 + this.field591.field154) * (float) this.field684 / var8);
        if ((float) var9 < this.field655 && (float) var10 < this.field655 || (float) var9 > this.field644 && (float) var10 > this.field644) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field591.field159 + (float) arg0 * this.field591.field158 + (float) arg1 * this.field591.field150 + this.field591.field156) * (float) this.field636 / var7);
            int var12 = (int) (((float) arg5 * this.field591.field159 + (float) arg3 * this.field591.field158 + (float) arg4 * this.field591.field150 + this.field591.field156) * (float) this.field636 / var8);
            return (!((float) var11 < this.field678) || !((float) var12 < this.field678)) && (!((float) var11 > this.field680) || !((float) var12 > this.field680));
        }
    }

    @OriginalMember(owner = "client!fu", name = "ab", descriptor = "()V")
    private final void method365() {
        field562[0] = this.field640 * this.field628;
        field562[1] = this.field628 * this.field605;
        field562[2] = this.field671 * this.field628;
        field562[3] = 1.0F;
        this.field557.glLightfv(16384, 4609, field562, 0);
        field562[0] = -this.field618 * this.field640;
        field562[1] = -this.field618 * this.field605;
        field562[2] = -this.field618 * this.field671;
        field562[3] = 1.0F;
        this.field557.glLightfv(16385, 4609, field562, 0);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILoj;II)V")
    public final void method366(int arg0, class405 arg1, int arg2, int arg3) {
        class60 var5 = (class60) arg1;
        class245 var6 = var5.field880;
        this.method449();
        this.method303(var5.field880);
        this.method349(1);
        this.method353(7681, 8448);
        this.method335(0, 34167, 768);
        float var7 = var6.field3550 / (float) var6.field3553;
        float var8 = var6.field3549 / (float) var6.field3551;
        this.field557.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field557.glBegin(7);
        this.field557.glTexCoord2f((float) (this.field627 - arg2) * var7, (float) (this.field600 - arg3) * var8);
        this.field557.glVertex2i(this.field627, this.field600);
        this.field557.glTexCoord2f((float) (this.field627 - arg2) * var7, (float) (this.field660 - arg3) * var8);
        this.field557.glVertex2i(this.field627, this.field660);
        this.field557.glTexCoord2f((float) (this.field603 - arg2) * var7, (float) (this.field660 - arg3) * var8);
        this.field557.glVertex2i(this.field603, this.field660);
        this.field557.glTexCoord2f((float) (this.field603 - arg2) * var7, (float) (this.field600 - arg3) * var8);
        this.field557.glVertex2i(this.field603, this.field600);
        this.field557.glEnd();
        this.method335(0, 5890, 768);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lkg;[Lgm;Z)Lam;")
    public final class199 method367(class194 arg0, class355[] arg1, boolean arg2) {
        return new class335(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fu", name = "bb", descriptor = "()V")
    private final void method368() {
        field562[0] = this.field640 * this.field616;
        field562[1] = this.field616 * this.field605;
        field562[2] = this.field671 * this.field616;
        field562[3] = 1.0F;
        this.field557.glLightModelfv(2899, field562, 0);
    }

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "()I")
    public final int method369() {
        return this.field637;
    }

    @OriginalMember(owner = "client!fu", name = "cb", descriptor = "()V")
    private final void method370() {
        this.field591 = new class16();
        this.field667 = new class16();
        this.field657 = new class375[this.field648];
        this.field615 = new class429(this, 3553, 6408, 1, 1);
        this.field642 = new class429(this, 3553, 6408, 1, 1);
        this.field646 = new class429(this, 3553, 6408, 1, 1);
        this.field632 = new class425(this);
        this.field689 = new class425(this);
        this.field635 = new class425(this);
        this.field654 = new class425(this);
        this.field687 = new class425(this);
        this.field610 = new class425(this);
        this.field688 = new class425(this);
        this.field672 = new class425(this);
        if (this.field693) {
            this.field602 = new class148(this);
        }
        this.field558.method2480(this);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(FFFF)V")
    public final void method371(float arg0, float arg1, float arg2, float arg3) {
        field562[0] = arg0;
        field562[1] = arg1;
        field562[2] = arg2;
        field562[3] = arg3;
        this.field557.glTexEnvfv(8960, 8705, field562, 0);
    }

    @OriginalMember(owner = "client!fu", name = "db", descriptor = "()V")
    private final void method372() {
        int var1;
        if (this.field604) {
            this.field557.glFogf(2915, 0.0F);
            this.field557.glFogf(2916, 1.0F);
            var1 = this.field650;
        } else {
            this.field662 = (float) (this.field637 - 256) - this.field631;
            this.field669 = this.field662 - (float) this.field651 * this.field630;
            if (this.field669 < (float) this.field592) {
                this.field669 = (float) this.field592;
            }
            this.field557.glFogf(2915, this.field669);
            this.field557.glFogf(2916, this.field662);
            var1 = this.field599;
        }
        field562[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field562[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field562[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field557.glFogfv(2918, field562, 0);
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
    public final void method373(int arg0) {
        this.method349(0);
        this.field557.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field557.glClear(16384);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(IIIII)V")
    public final void method374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method428();
        this.method349(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field557.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field557.glBegin(1);
        this.field557.glVertex2f(var6, var7);
        this.field557.glVertex2f((float) arg2 + var6, var7);
        this.field557.glEnd();
    }

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "()Z")
    public final boolean method375() {
        return this.field566.method1515(28, 3);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lhb;)V")
    public final void method376(class349 arg0) {
    }

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "()Z")
    public final boolean method377() {
        return this.field561.method1721();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(FF)V")
    public final void method378(float arg0, float arg1) {
        if (this.field594 == arg0 && this.field691 == arg1) {
            return;
        }
        this.field594 = arg0;
        this.field691 = arg1;
        this.method400();
        if (this.field598 == 3) {
            this.method301();
        } else if (this.field598 == 2) {
            this.method427();
        }
    }

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "()Z")
    public final boolean method379() {
        return this.field561.method925(23620);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[BIZ)Ljj;")
    public final class159 method380(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class159) (this.field665 && !arg3 || this.field686 ? new class144(this, arg0, arg1, arg2, arg3) : new class351(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "(I)I")
    public final int method381(int arg0) {
        if (arg0 == 6406 || arg0 == 6409) {
            return 1;
        } else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408 || arg0 == 34847) {
            return 4;
        } else if (arg0 == 34843) {
            return 6;
        } else if (arg0 == 34842) {
            return 8;
        } else if (arg0 == 6402) {
            return 3;
        } else if (arg0 == 6401) {
            return 1;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "(IIII)V")
    public final void method382(int arg0, int arg1, int arg2, int arg3) {
        this.field559.method2204(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(IIII)[I")
    public final int[] method383(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field557.glReadPixels(arg0, this.field576 - arg1 - var6, arg2, 1, 32993, this.field593, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ln;Lpa;Lde;Lr;I)V")
    public final void method384(class468 arg0, class404 arg1, class257 arg2, class63 arg3, int arg4) {
        arg0.method1592(arg2, arg3, arg4);
        this.method329(arg1);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lmi;)V")
    public final void method385(class16 arg0) {
        this.field557.glPushMatrix();
        this.field557.glMultMatrixf(arg0.method98(true), 0);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V")
    public final void method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method428();
        this.method349(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field557.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field557.glBegin(1);
        this.field557.glVertex2f(var6, var7);
        this.field557.glVertex2f(var6, (float) arg2 + var7);
        this.field557.glEnd();
    }

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "(Z)V")
    public final void method388(boolean arg0) {
        if (this.field606 != arg0) {
            this.field606 = arg0;
            this.method346();
            this.field681 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
    }

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "()Z")
    public final boolean method390() {
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V")
    public final void method391(int arg0) {
        this.method336();
    }

    @OriginalMember(owner = "client!fu", name = "eb", descriptor = "()V")
    private final void method392() {
        if (this.field627 <= this.field603 && this.field600 <= this.field660) {
            this.field557.glScissor(this.field656 + this.field627, this.field664 + this.field576 - this.field660, this.field603 - this.field627, this.field660 - this.field600);
        } else {
            this.field557.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method393(Rectangle[] arg0, int arg1) {
        this.method343();
    }

    @OriginalMember(owner = "client!fu", name = "fb", descriptor = "()V")
    private final void method394() {
        this.field655 = (float) (this.field627 - this.field611);
        this.field644 = (float) (this.field603 - this.field611);
        this.field678 = (float) (this.field600 - this.field638);
        this.field680 = (float) (this.field660 - this.field638);
    }

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "(II)V")
    public final void method395(int arg0, int arg1) {
        this.field656 = arg0;
        this.field664 = arg1;
        this.field557.glViewport(arg0, arg1, this.field572, this.field576);
        this.method392();
    }

    @OriginalMember(owner = "client!fu", name = "gb", descriptor = "()V")
    private final void method396() {
        float[] var1 = this.field649;
        float var2 = (float) (-this.field611 * this.field592) / (float) this.field684;
        float var3 = (float) ((this.field572 - this.field611) * this.field592) / (float) this.field684;
        float var4 = (float) (this.field638 * this.field592) / (float) this.field636;
        float var5 = (float) ((this.field638 - this.field576) * this.field592) / (float) this.field636;
        if (var2 == var3 || var4 == var5) {
            var1[0] = 1.0F;
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = 1.0F;
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = 0.0F;
            var1[9] = 0.0F;
            var1[10] = 1.0F;
            var1[11] = 0.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = 0.0F;
            var1[15] = 1.0F;
        } else {
            float var6 = (float) this.field592 * 2.0F;
            var1[0] = var6 / (var3 - var2);
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = var6 / (var4 - var5);
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = (var2 + var3) / (var3 - var2);
            var1[9] = (var4 + var5) / (var4 - var5);
            var1[10] = this.field587 = (float) (-(this.field637 + this.field592)) / (float) (this.field637 - this.field592);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field597 = -((float) this.field637 * var6) / (float) (this.field637 - this.field592);
            var1[15] = 0.0F;
        }
        this.method400();
    }

    @OriginalMember(owner = "client!fu", name = "hb", descriptor = "()V")
    public final void method397() {
        if (this.field681 == 16) {
            return;
        }
        this.method416();
        this.method412(true);
        this.method313(true);
        this.method388(true);
        this.method349(1);
        this.method421(1);
        this.field681 = 16;
    }

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "(I)I")
    public final int method398(int arg0) {
        if (arg0 == 0) {
            return 7681;
        } else if (arg0 == 1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fu", name = "ib", descriptor = "()V")
    private final void method399() {
        this.method347(-2);
        for (int var1 = this.field648 - 1; var1 >= 0; var1--) {
            this.method407(var1);
            this.method303((class375) null);
            this.field557.glTexEnvi(8960, 8704, 34160);
        }
        this.method353(8448, 8448);
        this.method335(2, 34168, 770);
        this.method356();
        this.field608 = 1;
        this.field557.glEnable(3042);
        this.field557.glBlendFunc(770, 771);
        this.field659 = 1;
        this.field557.glEnable(3008);
        this.field557.glAlphaFunc(516, 0.0F);
        this.field647 = true;
        this.field557.glColorMask(true, true, true, true);
        this.field595 = true;
        this.method412(true);
        this.method339(true);
        this.method313(true);
        this.method388(true);
        this.method317();
        this.field557.setSwapInterval(0);
        this.field557.glShadeModel(7425);
        this.field557.glClearDepth(1.0F);
        this.field557.glDepthFunc(515);
        this.field557.glPolygonMode(1028, 6914);
        this.field557.glEnable(2884);
        this.field557.glCullFace(1029);
        this.field557.glMatrixMode(5888);
        this.field557.glLoadIdentity();
        this.field557.glColorMaterial(1028, 5634);
        this.field557.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field557.glLightfv(var4, 4608, var2, 0);
            this.field557.glLightf(var4, 4615, 0.0F);
            this.field557.glLightf(var4, 4616, 0.0F);
        }
        this.field557.glEnable(16384);
        this.field557.glEnable(16385);
        this.field557.glFogf(2914, 0.95F);
        this.field557.glFogi(2917, 9729);
        this.field557.glHint(3156, 4353);
        this.field661 = this.field599 = -1;
        this.method360();
    }

    @OriginalMember(owner = "client!fu", name = "jb", descriptor = "()V")
    private final void method400() {
        if (this.field691 == 0.0F) {
            this.field649[10] = this.field587;
            this.field649[14] = this.field597;
        } else {
            float var1 = this.field594 / (this.field691 + this.field594);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field597 * (1.0F - var1) / this.field691;
            this.field649[10] = this.field587 + var3;
            this.field649[14] = this.field597 * var2;
        }
        this.field609 = (this.field649[14] - (float) this.field637) / this.field649[10];
        this.field589 = (float) this.field637 - this.field691;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I[BIZ)Lpc;")
    public final class171 method401(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class171) (this.field665 && !arg3 || this.field686 ? new class45(this, arg0, arg1, arg2, arg3) : new class49(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II[I[I)Loj;")
    public final class405 method402(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class60.method553(arg0, arg1, arg2, (byte) 114, arg3, this);
    }

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "()I")
    public final int method403() {
        return 4;
    }

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "()F")
    public final float method404() {
        return this.field594;
    }

    @OriginalMember(owner = "client!fu", name = "kb", descriptor = "()V")
    public final void method405() {
        if (this.field681 == 4) {
            return;
        }
        this.method408();
        this.method412(false);
        this.method339(false);
        this.method313(false);
        this.method388(false);
        this.method347(-2);
        this.method349(1);
        this.method421(1);
        this.field681 = 4;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lfm;Lfm;Lfm;Lfm;)V")
    public final void method406(class170 arg0, class170 arg1, class170 arg2, class170 arg3) {
        if (arg0 == null) {
            this.field557.glDisableClientState(32884);
        } else {
            this.field557.glEnableClientState(32884);
            arg0.method1237(-24672);
        }
        if (arg1 == null) {
            this.field557.glDisableClientState(32885);
        } else {
            this.field557.glEnableClientState(32885);
            arg1.method1236(15716);
        }
        if (arg2 == null) {
            this.field557.glDisableClientState(32886);
        } else {
            this.field557.glEnableClientState(32886);
            arg2.method1235(false);
        }
        if (arg3 == null) {
            this.field557.glDisableClientState(32888);
        } else {
            this.field557.glEnableClientState(32888);
            arg3.method1238((byte) 91);
        }
    }

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "(I)V")
    public final void method407(int arg0) {
        if (this.field652 != arg0) {
            this.field557.glActiveTexture(arg0 + 33984);
            this.field652 = arg0;
        }
    }

    @OriginalMember(owner = "client!fu", name = "lb", descriptor = "()V")
    private final void method408() {
        if (this.field598 == 1) {
            return;
        }
        this.field557.glMatrixMode(5889);
        this.field557.glLoadIdentity();
        if (this.field572 > 0 && this.field576 > 0) {
            this.field557.glOrtho(0.0D, (double) this.field572, (double) this.field576, 0.0D, -1.0D, 1.0D);
        }
        this.field557.glMatrixMode(5888);
        this.field557.glLoadIdentity();
        this.field598 = 1;
        this.field681 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([I)V")
    public final void method409(int[] arg0) {
        arg0[0] = this.field627;
        arg0[1] = this.field600;
        arg0[2] = this.field603;
        arg0[3] = this.field660;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lrp;Lrp;FLrp;)Lrp;")
    public final class419 method410(class419 arg0, class419 arg1, float arg2, class419 arg3) {
        if (arg0 != null && arg1 != null && this.field682 && this.field693) {
            class458 var5 = null;
            class438 var6 = (class438) arg0;
            class438 var7 = (class438) arg1;
            class240 var8 = var6.method1966((byte) -64);
            class240 var9 = var7.method1966((byte) -88);
            if (var8 != null && var9 != null) {
                int var10 = var8.field3509 > var9.field3509 ? var8.field3509 : var9.field3509;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class458) {
                    class458 var11 = (class458) arg3;
                    if (var11.method2746(true) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class458(this, var10);
                }
                var5.method2747((byte) -55, arg2, var8, var9);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lpc;)V")
    public final void method411(class171 arg0) {
        if (this.field683 != arg0 && this.field665) {
            this.field557.glBindBufferARB(34962, arg0.method464());
            this.field683 = arg0;
        }
    }

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "(Z)V")
    public final void method412(boolean arg0) {
        if (this.field614 != arg0) {
            this.field614 = arg0;
            this.method324();
            this.field681 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(Lnd;)V")
    public final void method413(class81 arg0) {
        if (this.field571 < 0 || this.field569[this.field571] != arg0) {
            throw new RuntimeException();
        }
        this.field569[this.field571--] = null;
        arg0.method358();
        if (this.field571 >= 0) {
            this.field580 = this.field569[this.field571];
            this.field580.method426();
        }
    }

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "()F")
    public final float method414() {
        return this.field691;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(F)V")
    public final void method415(float arg0) {
        if (this.field616 != arg0) {
            this.field616 = arg0;
            this.method368();
        }
    }

    @OriginalMember(owner = "client!fu", name = "mb", descriptor = "()V")
    private final void method416() {
        if (this.field598 != 3) {
            this.field598 = 3;
            this.method301();
            this.method337();
            this.field681 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "()V")
    public final void method417() {
        this.method388(true);
        this.field557.glClear(256);
    }

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "(I)V")
    public final synchronized void method418(int arg0) {
        class478 var2 = new class478(arg0);
        this.field583.method766(var2, -1);
    }

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "()Z")
    public final boolean method419() {
        return false;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IFFFFF)V")
    public final void method420(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field661 != arg0;
        if (var7 || this.field628 != arg1 || this.field618 != arg2) {
            this.field661 = arg0;
            this.field628 = arg1;
            this.field618 = arg2;
            if (var7) {
                this.field640 = (float) (this.field661 & 0xFF0000) / 1.671168E7F;
                this.field605 = (float) (this.field661 & 0xFFFF) / 65535.0F;
                this.field671 = (float) (this.field661 & 0xFF) / 255.0F;
                this.method368();
            }
            this.method365();
        }
        if (this.field601[0] == arg3 && this.field601[1] == arg4 && this.field601[2] == arg5) {
            return;
        }
        this.field601[0] = arg3;
        this.field601[1] = arg4;
        this.field601[2] = arg5;
        this.field619[0] = -arg3;
        this.field619[1] = -arg4;
        this.field619[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field675[0] = arg3 * var8;
        this.field675[1] = arg4 * var8;
        this.field675[2] = arg5 * var8;
        this.field673[0] = -this.field675[0];
        this.field673[1] = -this.field675[1];
        this.field673[2] = -this.field675[2];
        this.method293();
        this.field588 = (int) (arg3 * 256.0F / arg4);
        this.field634 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "(I)V")
    public final void method421(int arg0) {
        if (arg0 == 0) {
            this.method353(7681, 7681);
        } else if (arg0 == 1) {
            this.method353(8448, 8448);
        } else if (arg0 == 2) {
            this.method353(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "(I)V")
    public final synchronized void method422(int arg0) {
        class478 var2 = new class478(arg0);
        this.field585.method766(var2, -1);
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(IIII)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field604) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field650 = arg1;
        this.field663 = arg2;
        this.field626 = arg3;
        this.method372();
        this.field566.method1516((byte) 102, true, arg0);
    }

    @OriginalMember(owner = "client!fu", name = "nb", descriptor = "()V")
    private final void method424() {
        if (this.field590 && !this.field641) {
            this.field557.glEnable(2896);
        } else {
            this.field557.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "(II)V")
    public final synchronized void method425(int arg0, int arg1) {
        class478 var3 = new class478(arg1);
        var3.field6382 = (long) arg0;
        this.field581.method766(var3, -1);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "()V")
    public final void method426() {
    }

    @OriginalMember(owner = "client!fu", name = "ob", descriptor = "()V")
    private final void method427() {
        this.field557.glMatrixMode(5889);
        this.field557.glLoadMatrixf(this.field649, 0);
        this.field557.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!fu", name = "pb", descriptor = "()V")
    private final void method428() {
        if (this.field681 == 1) {
            return;
        }
        this.method408();
        this.method412(false);
        this.method339(false);
        this.method313(false);
        this.method388(false);
        this.method303((class375) null);
        this.method347(-2);
        this.method421(0);
        this.field681 = 1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIZ)Lrn;")
    public final class417 method429(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class179(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(FFF)V")
    private final void method430(float arg0, float arg1, float arg2) {
        this.field557.glMatrixMode(5890);
        if (this.field679) {
            this.field557.glLoadIdentity();
        }
        this.field557.glTranslatef(arg0, arg1, arg2);
        this.field557.glMatrixMode(5888);
        this.field679 = true;
    }

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "()Z")
    public final boolean method431() {
        return this.field653;
    }

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "()Z")
    public final boolean method432() {
        return false;
    }

    @OriginalMember(owner = "client!fu", name = "qb", descriptor = "()I")
    private final int method433() {
        int var1 = 0;
        this.field639 = this.field557.glGetString(7936);
        this.field670 = this.field557.glGetString(7937);
        String var2 = this.field639.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field557.glGetString(7938);
        String[] var4 = class237.method1645(' ', var3.replace('.', ' '), 0);
        if (var4.length >= 2) {
            try {
                int var5 = class270.method1827(var4[0], false);
                int var6 = class270.method1827(var4[1], false);
                this.field596 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field596 < 12) {
            var1 |= 0x2;
        }
        if (!this.field557.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field557.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field557.glGetIntegerv(34018, var8, 0);
        this.field648 = var8[0];
        this.field557.glGetIntegerv(34929, var8, 0);
        this.field613 = var8[0];
        this.field557.glGetIntegerv(34930, var8, 0);
        this.field643 = var8[0];
        if (this.field648 < 2 || this.field613 < 2 || this.field643 < 2) {
            var1 |= 0x10;
        }
        this.field645 = class65.field959 != null && class65.field959.startsWith("mac");
        this.field622 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field665 = this.field557.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field653 = this.field557.isExtensionAvailable("GL_ARB_multisample");
        this.field621 = this.field557.isExtensionAvailable("GL_ARB_vertex_program");
        this.field557.isExtensionAvailable("GL_ARB_fragment_program");
        this.field557.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field677 = this.field557.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field620 = this.field557.isExtensionAvailable("GL_EXT_texture3D");
        this.field668 = this.field557.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field682 = this.field557.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field676 = this.field557.isExtensionAvailable("GL_ARB_texture_float");
        this.field612 = false;
        this.field693 = this.field557.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lpc;")
    public final class171 method434(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class171) (this.field665 && !arg2 || this.field686 ? new class45(this, arg0, arg1, arg2) : new class49(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method435(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "(I)V")
    public final void method436(int arg0) {
        field562[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field562[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field562[2] = (float) (arg0 & 0xFF) / 255.0F;
        field562[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field557.glTexEnvfv(8960, 8705, field562, 0);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([Ln;Lde;[Lr;I)V")
    public final void method437(class468[] arg0, class257 arg1, class63[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1592(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(IIIIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method428();
        this.method349(arg5);
        this.field557.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field653) {
            this.field557.glDisable(32925);
        }
        this.field557.glBegin(7);
        this.field557.glVertex2f(var7, var8);
        this.field557.glVertex2f(var7, var10);
        this.field557.glVertex2f(var9, var10);
        this.field557.glVertex2f(var9, var8);
        this.field557.glEnd();
        if (this.field653) {
            this.field557.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[Lnq;)V")
    public final void method439(int arg0, class104[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class104 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field565[0] = (float) var4.field1466;
            field565[1] = (float) var4.field1465;
            field565[2] = (float) var4.field1461;
            field565[3] = 1.0F;
            this.field557.glLightfv(var5, 4611, field565, 0);
            int var6 = var4.field1464;
            float var7 = var4.field1460 / 255.0F;
            field565[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field565[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field565[2] = (float) (var6 & 0xFF) * var7;
            this.field557.glLightfv(var5, 4609, field565, 0);
            this.field557.glLightf(var5, 4617, 1.0F / (float) (var4.field1467 * var4.field1467));
            this.field557.glEnable(var5);
        }
        while (var3 < this.field666) {
            this.field557.glDisable(var3 + 16386);
            var3++;
        }
        this.field666 = arg0;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZZ)V")
    public final void method440(int arg0, boolean arg1, boolean arg2) {
        if (this.field685 != arg0) {
            if (arg0 < 0) {
                this.method356();
                this.method303((class375) null);
                if (!this.field604) {
                    this.field566.method1517(arg1, 22957, arg2, 0);
                }
            } else {
                class429 var4 = this.field556.method2729((byte) -107, arg0);
                class308 var5 = this.field1250.method1224((byte) 110, arg0);
                if (var5.field4363 == 0 && var5.field4360 == 0) {
                    this.method356();
                } else {
                    int var6 = var5.field4361 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method430((float) (this.field568 % var7 * var5.field4363) / (float) var7, (float) (this.field568 % var7 * var5.field4360) / (float) var7, 0.0F);
                }
                if (this.field604) {
                    this.field566.method1517(arg1, 22957, arg2, 3);
                    this.method303(var4);
                } else {
                    this.field566.method1517(arg1, 22957, arg2, var5.field4368);
                    this.field566.method1516((byte) 74, false, var5.field4373);
                    if (!this.field566.method1518((byte) -11, var4)) {
                        this.method303(var4);
                    }
                }
            }
            this.field685 = arg0;
        }
        this.field681 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(III)V")
    public final void method441(int arg0, int arg1, int arg2) {
        this.field557.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIII)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field557.glLineWidth((float) arg5);
        this.method321(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field557.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(IIII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3) {
        if (this.field627 < arg0) {
            this.field627 = arg0;
        }
        if (this.field603 > arg2) {
            this.field603 = arg2;
        }
        if (this.field600 < arg1) {
            this.field600 = arg1;
        }
        if (this.field660 > arg3) {
            this.field660 = arg3;
        }
        this.field557.glEnable(3089);
        this.method394();
        this.method392();
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)Lhb;")
    public final class349 method444(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "()Z")
    public final boolean method445() {
        if (!this.field561.method925(23620)) {
            if (!this.field559.method2200(this.field561)) {
                return false;
            }
            this.field556.method2730((byte) -127);
        }
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lrp;)V")
    public final void method446(class419 arg0) {
        this.field624 = (class438) arg0;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(FF)V")
    public final void method447(float arg0, float arg1) {
        this.field630 = arg0;
        this.field631 = arg1;
        if (!this.field604) {
            this.method372();
        }
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(IIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3) {
        this.field611 = arg0;
        this.field638 = arg1;
        this.field684 = arg2;
        this.field636 = arg3;
        this.method396();
        this.method394();
        if (this.field598 == 3) {
            this.method301();
        } else if (this.field598 == 2) {
            this.method427();
        }
    }

    @OriginalMember(owner = "client!fu", name = "rb", descriptor = "()V")
    public final void method449() {
        if (this.field681 == 2) {
            return;
        }
        this.method408();
        this.method412(false);
        this.method339(false);
        this.method313(false);
        this.method388(false);
        this.method347(-2);
        this.field681 = 2;
    }

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "()V")
    public final void method450() {
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljj;)V")
    public final void method451(class159 arg0) {
        if (this.field617 != arg0 && this.field665) {
            this.field557.glBindBufferARB(34963, arg0.method464());
            this.field617 = arg0;
        }
    }

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "()Z")
    public final boolean method452() {
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field572) {
            arg2 = this.field572;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field576) {
            arg3 = this.field576;
        }
        this.field627 = arg0;
        this.field600 = arg1;
        this.field603 = arg2;
        this.field660 = arg3;
        this.field557.glEnable(3089);
        this.method394();
        this.method392();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lde;)V")
    public final void method454(class257 arg0) {
        this.field591 = (class16) arg0;
        this.field667.method97(this.field591, 1);
        if (this.field598 != 1) {
            this.method337();
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "()Z")
    public final boolean method455() {
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II[[I[[IIII)Lij;")
    public final class241 method456(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class140(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }
}
