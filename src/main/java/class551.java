import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class551 extends class66 {

    @OriginalMember(owner = "client!sf", name = "qd", descriptor = "Ljia;")
    private class645 field7629 = new class645();

    @OriginalMember(owner = "client!sf", name = "Zd", descriptor = "Z")
    public boolean field7664 = true;

    @OriginalMember(owner = "client!sf", name = "Yd", descriptor = "Ljba;")
    public class421 field7663 = new class421();

    @OriginalMember(owner = "client!sf", name = "fe", descriptor = "Ljba;")
    public class421 field7670 = new class421();

    @OriginalMember(owner = "client!sf", name = "ge", descriptor = "Ljba;")
    public class421 field7671 = new class421();

    @OriginalMember(owner = "client!sf", name = "he", descriptor = "Ljba;")
    public class421 field7672 = new class421();

    @OriginalMember(owner = "client!sf", name = "ie", descriptor = "Ljba;")
    private class421 field7673 = new class421();

    @OriginalMember(owner = "client!sf", name = "je", descriptor = "Ljba;")
    private class421 field7674 = new class421();

    @OriginalMember(owner = "client!sf", name = "qe", descriptor = "I")
    private int field7681 = -1;

    @OriginalMember(owner = "client!sf", name = "ue", descriptor = "F")
    public float field7685 = 1.0F;

    @OriginalMember(owner = "client!sf", name = "Ee", descriptor = "Z")
    private boolean field7695 = false;

    @OriginalMember(owner = "client!sf", name = "Ae", descriptor = "Z")
    private boolean field7691 = false;

    @OriginalMember(owner = "client!sf", name = "Be", descriptor = "F")
    public float field7692 = 1.0F;

    @OriginalMember(owner = "client!sf", name = "Ye", descriptor = "F")
    public float field7715 = 1.0F;

    @OriginalMember(owner = "client!sf", name = "Ue", descriptor = "I")
    public int field7711 = 0;

    @OriginalMember(owner = "client!sf", name = "Ze", descriptor = "I")
    public int field7716 = -1;

    @OriginalMember(owner = "client!sf", name = "me", descriptor = "Z")
    private boolean field7677 = false;

    @OriginalMember(owner = "client!sf", name = "Ie", descriptor = "I")
    public int field7699 = 512;

    @OriginalMember(owner = "client!sf", name = "of", descriptor = "F")
    public float field7730 = 3584.0F;

    @OriginalMember(owner = "client!sf", name = "He", descriptor = "[F")
    private float[] field7698 = new float[16];

    @OriginalMember(owner = "client!sf", name = "tf", descriptor = "I")
    public int field7735 = 0;

    @OriginalMember(owner = "client!sf", name = "cf", descriptor = "I")
    public int field7719 = 3584;

    @OriginalMember(owner = "client!sf", name = "Se", descriptor = "I")
    private int field7709 = -1;

    @OriginalMember(owner = "client!sf", name = "mf", descriptor = "Z")
    public boolean field7728 = false;

    @OriginalMember(owner = "client!sf", name = "Ve", descriptor = "Lad;")
    public class448 field7712 = class709.field9750;

    @OriginalMember(owner = "client!sf", name = "we", descriptor = "Z")
    private boolean field7687 = false;

    @OriginalMember(owner = "client!sf", name = "jf", descriptor = "F")
    public float field7725 = -1.0F;

    @OriginalMember(owner = "client!sf", name = "Te", descriptor = "[F")
    private float[] field7710 = new float[16];

    @OriginalMember(owner = "client!sf", name = "We", descriptor = "Z")
    public boolean field7713 = false;

    @OriginalMember(owner = "client!sf", name = "gf", descriptor = "I")
    private int field7723 = -1;

    @OriginalMember(owner = "client!sf", name = "se", descriptor = "Z")
    public boolean field7683 = true;

    @OriginalMember(owner = "client!sf", name = "kf", descriptor = "[F")
    public float[] field7726 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sf", name = "Pe", descriptor = "I")
    public int field7706 = 3;

    @OriginalMember(owner = "client!sf", name = "Gf", descriptor = "I")
    private int field7748 = 0;

    @OriginalMember(owner = "client!sf", name = "ne", descriptor = "Z")
    public boolean field7678 = true;

    @OriginalMember(owner = "client!sf", name = "Ke", descriptor = "I")
    public int field7701 = 50;

    @OriginalMember(owner = "client!sf", name = "lf", descriptor = "Z")
    public boolean field7727 = false;

    @OriginalMember(owner = "client!sf", name = "Af", descriptor = "I")
    private int field7742 = 0;

    @OriginalMember(owner = "client!sf", name = "Bf", descriptor = "I")
    private int field7743 = 16777215;

    @OriginalMember(owner = "client!sf", name = "Sf", descriptor = "I")
    public int field7760 = 0;

    @OriginalMember(owner = "client!sf", name = "Jf", descriptor = "I")
    public int field7751 = 512;

    @OriginalMember(owner = "client!sf", name = "bf", descriptor = "Z")
    private boolean field7718 = false;

    @OriginalMember(owner = "client!sf", name = "oe", descriptor = "I")
    public int field7679 = 128;

    @OriginalMember(owner = "client!sf", name = "Fe", descriptor = "[F")
    private float[] field7696 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!sf", name = "Of", descriptor = "I")
    private int field7756 = 0;

    @OriginalMember(owner = "client!sf", name = "ef", descriptor = "F")
    public float field7721 = -1.0F;

    @OriginalMember(owner = "client!sf", name = "ke", descriptor = "Z")
    public boolean field7675 = true;

    @OriginalMember(owner = "client!sf", name = "Wf", descriptor = "F")
    private float field7764 = 1.0F;

    @OriginalMember(owner = "client!sf", name = "Kf", descriptor = "[F")
    private float[] field7752 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sf", name = "af", descriptor = "I")
    private int field7717 = 0;

    @OriginalMember(owner = "client!sf", name = "Cf", descriptor = "I")
    public int field7744 = 0;

    @OriginalMember(owner = "client!sf", name = "zf", descriptor = "Z")
    public boolean field7741 = true;

    @OriginalMember(owner = "client!sf", name = "Ff", descriptor = "Z")
    public boolean field7747 = false;

    @OriginalMember(owner = "client!sf", name = "eg", descriptor = "Z")
    public boolean field7772 = true;

    @OriginalMember(owner = "client!sf", name = "wf", descriptor = "[F")
    public float[] field7738 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!sf", name = "sf", descriptor = "I")
    public int field7734 = 0;

    @OriginalMember(owner = "client!sf", name = "Je", descriptor = "F")
    public float field7700 = 1.0F;

    @OriginalMember(owner = "client!sf", name = "le", descriptor = "[F")
    public float[] field7676 = this.field7696;

    @OriginalMember(owner = "client!sf", name = "qf", descriptor = "I")
    public int field7732 = 0;

    @OriginalMember(owner = "client!sf", name = "xf", descriptor = "I")
    public int field7739 = 0;

    @OriginalMember(owner = "client!sf", name = "Xf", descriptor = "I")
    public int field7765 = 0;

    @OriginalMember(owner = "client!sf", name = "Ef", descriptor = "I")
    public int field7746 = 0;

    @OriginalMember(owner = "client!sf", name = "re", descriptor = "[Lmr;")
    private class155[] field7682 = new class155[10];

    @OriginalMember(owner = "client!sf", name = "yf", descriptor = "I")
    public int field7740 = -1;

    @OriginalMember(owner = "client!sf", name = "Re", descriptor = "Z")
    private boolean field7708 = false;

    @OriginalMember(owner = "client!sf", name = "cg", descriptor = "F")
    public float field7770 = 3584.0F;

    @OriginalMember(owner = "client!sf", name = "fg", descriptor = "Lwm;")
    public class591 field7773 = class611.field8531;

    @OriginalMember(owner = "client!sf", name = "dg", descriptor = "I")
    public int field7771 = 0;

    @OriginalMember(owner = "client!sf", name = "Qe", descriptor = "[F")
    private float[] field7707 = new float[16];

    @OriginalMember(owner = "client!sf", name = "Nf", descriptor = "I")
    private int field7755 = 1;

    @OriginalMember(owner = "client!sf", name = "hg", descriptor = "I")
    public int field7775 = 8;

    @OriginalMember(owner = "client!sf", name = "gg", descriptor = "[F")
    private float[] field7774 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sf", name = "pf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7731 = new Stream();

    @OriginalMember(owner = "client!sf", name = "vg", descriptor = "Ljba;")
    private class421 field7789 = new class421();

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7490;

    @OriginalMember(owner = "client!sf", name = "ed", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7617;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "Ljava/lang/Object;")
    public Object field7514;

    @OriginalMember(owner = "client!sf", name = "xb", descriptor = "Ljava/lang/Object;")
    private Object field7532;

    @OriginalMember(owner = "client!sf", name = "wd", descriptor = "Lgj;")
    public class662 field7635;

    @OriginalMember(owner = "client!sf", name = "ze", descriptor = "I")
    public int field7690;

    @OriginalMember(owner = "client!sf", name = "sd", descriptor = "I")
    private int field7631;

    @OriginalMember(owner = "client!sf", name = "Xd", descriptor = "I")
    public int field7662;

    @OriginalMember(owner = "client!sf", name = "Bb", descriptor = "I")
    private int field7536;

    @OriginalMember(owner = "client!sf", name = "Wd", descriptor = "I")
    public int field7661;

    @OriginalMember(owner = "client!sf", name = "De", descriptor = "I")
    public int field7694;

    @OriginalMember(owner = "client!sf", name = "Zf", descriptor = "Lai;")
    private class626 field7767;

    @OriginalMember(owner = "client!sf", name = "Dc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field7590;

    @OriginalMember(owner = "client!sf", name = "ye", descriptor = "F")
    private float field7689;

    @OriginalMember(owner = "client!sf", name = "Ce", descriptor = "F")
    private float field7693;

    @OriginalMember(owner = "client!sf", name = "Le", descriptor = "F")
    public float field7702;

    @OriginalMember(owner = "client!sf", name = "ff", descriptor = "F")
    public float field7722;

    @OriginalMember(owner = "client!sf", name = "If", descriptor = "F")
    public float field7750;

    @OriginalMember(owner = "client!sf", name = "Qf", descriptor = "F")
    public float field7758;

    @OriginalMember(owner = "client!sf", name = "Rf", descriptor = "F")
    public float field7759;

    @OriginalMember(owner = "client!sf", name = "Vf", descriptor = "F")
    public float field7763;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!sf", name = "qb", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!sf", name = "rb", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!sf", name = "sb", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!sf", name = "tb", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!sf", name = "ub", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!sf", name = "vb", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!sf", name = "wb", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!sf", name = "yb", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!sf", name = "zb", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!sf", name = "Ab", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!sf", name = "Cb", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!sf", name = "Db", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!sf", name = "Eb", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!sf", name = "Gb", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!sf", name = "Hb", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!sf", name = "Jb", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!sf", name = "Kb", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!sf", name = "Lb", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!sf", name = "Mb", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!sf", name = "Nb", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!sf", name = "Ob", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!sf", name = "Pb", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!sf", name = "Qb", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!sf", name = "Rb", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!sf", name = "Sb", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!sf", name = "Tb", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!sf", name = "Ub", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!sf", name = "Vb", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!sf", name = "Wb", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!sf", name = "Xb", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!sf", name = "Yb", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!sf", name = "Zb", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!sf", name = "ac", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!sf", name = "bc", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!sf", name = "cc", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!sf", name = "dc", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!sf", name = "ec", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!sf", name = "fc", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!sf", name = "gc", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!sf", name = "hc", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!sf", name = "ic", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!sf", name = "jc", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!sf", name = "kc", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!sf", name = "lc", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!sf", name = "mc", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!sf", name = "nc", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!sf", name = "oc", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!sf", name = "pc", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!sf", name = "qc", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!sf", name = "rc", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!sf", name = "sc", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!sf", name = "tc", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!sf", name = "uc", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!sf", name = "vc", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!sf", name = "wc", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!sf", name = "xc", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!sf", name = "yc", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!sf", name = "zc", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!sf", name = "Ac", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!sf", name = "Bc", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!sf", name = "Cc", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!sf", name = "Ec", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!sf", name = "Fc", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!sf", name = "Gc", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!sf", name = "Hc", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!sf", name = "Ic", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!sf", name = "Jc", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!sf", name = "Kc", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!sf", name = "Lc", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!sf", name = "Mc", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!sf", name = "Nc", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!sf", name = "Oc", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!sf", name = "Pc", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!sf", name = "Qc", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!sf", name = "Rc", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!sf", name = "Sc", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!sf", name = "Tc", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!sf", name = "Uc", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!sf", name = "Vc", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!sf", name = "Wc", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!sf", name = "Xc", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!sf", name = "Yc", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!sf", name = "Zc", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!sf", name = "ad", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!sf", name = "bd", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!sf", name = "cd", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!sf", name = "dd", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!sf", name = "fd", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!sf", name = "gd", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!sf", name = "hd", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!sf", name = "id", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!sf", name = "jd", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!sf", name = "kd", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!sf", name = "ld", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!sf", name = "md", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!sf", name = "nd", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!sf", name = "od", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!sf", name = "pd", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!sf", name = "rd", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!sf", name = "ud", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!sf", name = "vd", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!sf", name = "xd", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!sf", name = "yd", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!sf", name = "zd", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!sf", name = "Ad", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!sf", name = "Bd", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!sf", name = "Dd", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!sf", name = "Ed", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!sf", name = "Fd", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!sf", name = "Gd", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!sf", name = "Hd", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!sf", name = "Id", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!sf", name = "Jd", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!sf", name = "Kd", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!sf", name = "Ld", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!sf", name = "Md", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!sf", name = "Nd", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!sf", name = "Od", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!sf", name = "Pd", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!sf", name = "Qd", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!sf", name = "Rd", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!sf", name = "Sd", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!sf", name = "Td", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!sf", name = "Ud", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!sf", name = "Vd", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!sf", name = "ae", descriptor = "I")
    public int field7665;

    @OriginalMember(owner = "client!sf", name = "be", descriptor = "I")
    public int field7666;

    @OriginalMember(owner = "client!sf", name = "ce", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!sf", name = "de", descriptor = "I")
    public int field7668;

    @OriginalMember(owner = "client!sf", name = "ee", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!sf", name = "xe", descriptor = "I")
    public int field7688;

    @OriginalMember(owner = "client!sf", name = "Ne", descriptor = "I")
    private int field7704;

    @OriginalMember(owner = "client!sf", name = "Oe", descriptor = "I")
    public int field7705;

    @OriginalMember(owner = "client!sf", name = "Hf", descriptor = "I")
    public int field7749;

    @OriginalMember(owner = "client!sf", name = "Mf", descriptor = "I")
    public int field7754;

    @OriginalMember(owner = "client!sf", name = "Pf", descriptor = "I")
    public int field7757;

    @OriginalMember(owner = "client!sf", name = "Tf", descriptor = "I")
    public int field7761;

    @OriginalMember(owner = "client!sf", name = "Uf", descriptor = "I")
    public int field7762;

    @OriginalMember(owner = "client!sf", name = "Yf", descriptor = "I")
    public int field7766;

    @OriginalMember(owner = "client!sf", name = "bg", descriptor = "I")
    private int field7769;

    @OriginalMember(owner = "client!sf", name = "Fg", descriptor = "I")
    private int field7799;

    @OriginalMember(owner = "client!sf", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!sf", name = "nf", descriptor = "Lmr;")
    private class155 field7729;

    @OriginalMember(owner = "client!sf", name = "ig", descriptor = "Lwp;")
    public class193 field7776;

    @OriginalMember(owner = "client!sf", name = "jg", descriptor = "Lwp;")
    public class193 field7777;

    @OriginalMember(owner = "client!sf", name = "lg", descriptor = "Lwp;")
    public class193 field7779;

    @OriginalMember(owner = "client!sf", name = "mg", descriptor = "Lwp;")
    private class193 field7780;

    @OriginalMember(owner = "client!sf", name = "sg", descriptor = "Lwp;")
    public class193 field7786;

    @OriginalMember(owner = "client!sf", name = "xg", descriptor = "Lwp;")
    private class193 field7791;

    @OriginalMember(owner = "client!sf", name = "zg", descriptor = "Lwp;")
    private class193 field7793;

    @OriginalMember(owner = "client!sf", name = "ng", descriptor = "Lta;")
    private class226 field7781;

    @OriginalMember(owner = "client!sf", name = "Ge", descriptor = "Lue;")
    private class246 field7697;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "Lpp;")
    public static class415 field7498;

    @OriginalMember(owner = "client!sf", name = "ve", descriptor = "Lbr;")
    public class416 field7686;

    @OriginalMember(owner = "client!sf", name = "ug", descriptor = "Lmha;")
    private class438 field7788;

    @OriginalMember(owner = "client!sf", name = "yg", descriptor = "Lmha;")
    private class438 field7792;

    @OriginalMember(owner = "client!sf", name = "Dg", descriptor = "Lmha;")
    private class438 field7797;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "Luw;")
    public class440 field7516;

    @OriginalMember(owner = "client!sf", name = "Lf", descriptor = "Lum;")
    private class552 field7753;

    @OriginalMember(owner = "client!sf", name = "kg", descriptor = "Lhaa;")
    public class89 field7778;

    @OriginalMember(owner = "client!sf", name = "og", descriptor = "Lhaa;")
    public class89 field7782;

    @OriginalMember(owner = "client!sf", name = "pg", descriptor = "Lhaa;")
    public class89 field7783;

    @OriginalMember(owner = "client!sf", name = "qg", descriptor = "Lhaa;")
    public class89 field7784;

    @OriginalMember(owner = "client!sf", name = "rg", descriptor = "Lhaa;")
    public class89 field7785;

    @OriginalMember(owner = "client!sf", name = "tg", descriptor = "Lhaa;")
    public class89 field7787;

    @OriginalMember(owner = "client!sf", name = "wg", descriptor = "Lhaa;")
    public class89 field7790;

    @OriginalMember(owner = "client!sf", name = "Ag", descriptor = "Lhaa;")
    public class89 field7794;

    @OriginalMember(owner = "client!sf", name = "Bg", descriptor = "Lhaa;")
    public class89 field7795;

    @OriginalMember(owner = "client!sf", name = "Cg", descriptor = "Lhaa;")
    public class89 field7796;

    @OriginalMember(owner = "client!sf", name = "Cd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7641;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field7488;

    @OriginalMember(owner = "client!sf", name = "td", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field7632;

    @OriginalMember(owner = "client!sf", name = "Ib", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7543;

    @OriginalMember(owner = "client!sf", name = "Me", descriptor = "Z")
    public boolean field7703;

    @OriginalMember(owner = "client!sf", name = "Xe", descriptor = "Z")
    public boolean field7714;

    @OriginalMember(owner = "client!sf", name = "hf", descriptor = "Z")
    public boolean field7724;

    @OriginalMember(owner = "client!sf", name = "rf", descriptor = "Z")
    public boolean field7733;

    @OriginalMember(owner = "client!sf", name = "Df", descriptor = "Z")
    public boolean field7745;

    @OriginalMember(owner = "client!sf", name = "Eg", descriptor = "Z")
    public boolean field7798;

    @OriginalMember(owner = "client!sf", name = "Fb", descriptor = "[I")
    public static int[] field7540;

    @OriginalMember(owner = "client!sf", name = "uf", descriptor = "[Lbq;")
    public class307[] field7736;

    @OriginalMember(owner = "client!sf", name = "te", descriptor = "[Lafa;")
    public class365[] field7684;

    @OriginalMember(owner = "client!sf", name = "ag", descriptor = "[Lafa;")
    public class365[] field7768;

    @OriginalMember(owner = "client!sf", name = "df", descriptor = "[Lbr;")
    private class416[] field7720;

    @OriginalMember(owner = "client!sf", name = "vf", descriptor = "[Ljba;")
    public class421[] field7737;

    @OriginalMember(owner = "client!sf", name = "pe", descriptor = "[Lam;")
    public class660[] field7680;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public abstract void method823(byte arg0);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public void method481(int arg0) {
        if (this.field7767 != null) {
            this.field7767.method3524(5);
        }
        ++field7660;
        this.field7757 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!sf", name = "za", descriptor = "(IIIII)V")
    public final void method567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7642;
        this.method3141(true);
        this.method3130((byte) -101, arg3);
        this.method3143(class633.field8767, true, 0);
        this.method3168((byte) 77, 0, class633.field8767);
        this.method3117(arg4, true);
        this.field7663.method2490((float) arg2, (float) arg2, -14978, 1.0F);
        this.field7663.method1860(arg0, arg1, 0);
        this.method3126(33);
        this.method819(false, (byte) 1);
        this.method863(0, (byte) 94, this.field7797);
        this.method846((byte) -112, this.field7780);
        this.method861(2, 256, class784.field10779, 0);
        this.method819(true, (byte) 1);
        this.method3168((byte) 61, 0, class327.field4459);
        this.method3143(class327.field4459, true, 0);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public void method862(int arg0) {
        this.method3164(arg0 + -6035);
        if (arg0 != 6035) {
            this.method3153(105);
        }
        ++field7637;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ldc;IIII)Lka;")
    public final class499 method505(class5 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7537;
        return new class89(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public final void method473(int arg0) {
        ++field7478;
        if (arg0 >= 128 && arg0 <= 1024) {
            if (this.field7767 != null) {
                this.field7767.method3521(94);
            }
            this.field7679 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sf", name = "JA", descriptor = "(IIIIII)I")
    public final int method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7615;
        int var7 = 0;
        float var8 = (float) arg2 * this.field7670.field5742 + (float) arg0 * this.field7670.field5780 + (float) arg1 * this.field7670.field5748 + this.field7670.field5737;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field7670.field5742 + (float) arg3 * this.field7670.field5780 + (float) arg4 * this.field7670.field5748 + this.field7670.field5737;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field7701 && var9 < (float) this.field7701) {
            var7 |= 16;
        } else if ((float) this.field7719 < var8 && (float) this.field7719 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field7670.field5750 + (float) arg0 * this.field7670.field5734 + (float) arg1 * this.field7670.field5730 + this.field7670.field5771) * (float) this.field7699 / var8);
        int var11 = (int) (((float) arg5 * this.field7670.field5750 + (float) arg3 * this.field7670.field5734 + (float) arg4 * this.field7670.field5730 + this.field7670.field5771) * (float) this.field7699 / var9);
        if ((float) var10 < this.field7763 && (float) var11 < this.field7763) {
            var7 |= 1;
        } else if (this.field7758 < (float) var10 && this.field7758 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field7670.field5740 + (float) arg0 * this.field7670.field5754 + (float) arg1 * this.field7670.field5775 + this.field7670.field5769) * (float) this.field7751 / var8);
        int var13 = (int) (((float) arg5 * this.field7670.field5740 + (float) arg3 * this.field7670.field5754 + (float) arg4 * this.field7670.field5775 + this.field7670.field5769) * (float) this.field7751 / var9);
        if ((float) var12 < this.field7759 && (float) var13 < this.field7759) {
            var7 |= 4;
        } else if (this.field7750 < (float) var12 && this.field7750 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "(IIIII)V")
    public final void method551(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7491;
        this.method508(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()Z")
    public final boolean method485() {
        ++field7648;
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "(I)V")
    private final void method3089(int arg0) {
        ++field7600;
        this.field7687 = false;
        if (this.field7729 != null) {
            this.field7729.method253(155);
        }
        if (arg0 == 1) {
            this.method831((byte) 118);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbr;B)V")
    public final void method3090(class416 arg0, byte arg1) {
        ++field7494;
        int var3 = 25 / ((21 - arg1) / 34);
        if (this.field7720[this.field7711] != arg0) {
            this.field7720[this.field7711] = arg0;
            if (arg0 != null) {
                arg0.method2033((byte) -40);
            } else {
                this.method864(82);
            }
            this.field7769 &= -2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(Z)Ljba;")
    public final class421 method3091(boolean arg0) {
        ++field7625;
        if (!arg0) {
            this.field7679 = -26;
        }
        if (!this.field7687) {
            this.field7674.method2476(this.field7672, this.field7663);
            this.field7687 = true;
        }
        return this.field7674;
    }

    @OriginalMember(owner = "client!sf", name = "EA", descriptor = "(IIII)V")
    public final void method569(int arg0, int arg1, int arg2, int arg3) {
        ++field7597;
        if (!this.field7714) {
            throw new RuntimeException("");
        } else {
            this.field7709 = arg1;
            this.field7723 = arg2;
            this.field7704 = arg0;
            this.field7748 = arg3;
            if (this.field7708) {
                this.field7682[3].method1210((byte) 2);
                this.field7682[3].method251((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "()I")
    public final int method552() {
        ++field7542;
        return this.field7701;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BZ)V")
    public final void method3092(byte arg0, boolean arg1) {
        int var3 = -105 % ((arg0 - 1) / 54);
        ++field7506;
        if (this.field7728 != arg1) {
            this.field7728 = arg1;
            this.method849(0);
            this.field7769 &= -32;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()Z")
    public final boolean method479() {
        ++field7577;
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "(I)V")
    public abstract void method849(int arg0);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)F")
    public abstract float method851(byte arg0);

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "(I)V")
    public final void method3093(int arg0) {
        ++field7584;
        this.method3156((byte) -127);
        this.method3155(arg0);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Ljba;")
    public final class421 method3094(byte arg0) {
        ++field7517;
        int var2 = 49 % ((-50 - arg0) / 57);
        return this.field7672;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
    public final int method482(int arg0, int arg1) {
        ++field7572;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "(IIIIIII)I")
    public final int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7588;
        int var8 = 0;
        float var9 = (float) arg2 * this.field7670.field5742 + (float) arg0 * this.field7670.field5780 + (float) arg1 * this.field7670.field5748 + this.field7670.field5737;
        float var10 = (float) arg5 * this.field7670.field5742 + (float) arg3 * this.field7670.field5780 + (float) arg4 * this.field7670.field5748 + this.field7670.field5737;
        if ((float) this.field7701 > var9 && var10 < (float) this.field7701) {
            var8 |= 16;
        } else if ((float) this.field7719 < var9 && var10 > (float) this.field7719) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field7670.field5750 + (float) arg0 * this.field7670.field5734 + (float) arg1 * this.field7670.field5730 + this.field7670.field5771) * (float) this.field7699 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field7670.field5750 + (float) arg3 * this.field7670.field5734 + (float) arg4 * this.field7670.field5730 + this.field7670.field5771) * (float) this.field7699 / (float) arg6);
        if ((float) var11 < this.field7763 && (float) var12 < this.field7763) {
            var8 |= 1;
        } else if ((float) var11 > this.field7758 && (float) var12 > this.field7758) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field7670.field5740 + (float) arg0 * this.field7670.field5754 + (float) arg1 * this.field7670.field5775 + this.field7670.field5769) * (float) this.field7751 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field7670.field5740 + (float) arg3 * this.field7670.field5754 + (float) arg4 * this.field7670.field5775 + this.field7670.field5769) * (float) this.field7751 / (float) arg6);
        if (this.field7759 > (float) var13 && (float) var14 < this.field7759) {
            var8 |= 4;
        } else if ((float) var13 > this.field7750 && this.field7750 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lul;BLso;)Z")
    public abstract boolean method817(class599 arg0, byte arg1, class497 arg2);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
    public abstract void method868(byte arg0);

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
    private final void method3095(byte arg0) {
        this.field7788 = this.method818(0, true);
        if (arg0 != 73) {
            this.method3090((class416) null, (byte) -47);
        }
        ++field7496;
        this.field7788.method1736((byte) 120, 24, 12);
        this.field7793 = this.method844(111, new class588[] { new class588(class601.field8400) });
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(Z)Ljba;")
    public final class421 method3096(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field7535;
            return this.field7663;
        }
    }

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "(I)Lpj;")
    public final class158 method3097(int arg0) {
        ++field7639;
        if (arg0 != 0) {
            this.field7742 = 82;
        }
        return this.field7697 == null ? null : this.field7697.method428(false);
    }

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "()Z")
    public final boolean method578() {
        ++field7544;
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIIIII)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7659;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method3151(0.0F, (float) arg1, (float) arg0, 10306, (float) arg2 + var9, (float) arg3 + var8, 0.0F)) {
            this.method3141(true);
            this.method3130((byte) -65, arg4);
            this.method3143(class633.field8767, true, 0);
            this.method3168((byte) 37, 0, class633.field8767);
            this.method3117(arg5, true);
            this.method3140(25723);
            this.method819(false, (byte) 1);
            this.method3110(32016);
            this.method819(true, (byte) 1);
            this.method3168((byte) 55, 0, class327.field4459);
            this.method3143(class327.field4459, true, 0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljba;I)V")
    public final void method3098(class421 arg0, int arg1) {
        this.field7663.method1874(arg0);
        ++field7489;
        this.field7664 = false;
        if (arg1 != 6) {
            this.field7715 = 1.5648906F;
        }
        this.method3166((byte) -107);
    }

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "(I)V")
    public abstract void method843(int arg0);

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(B)V")
    public abstract void method826(byte arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILam;)V")
    public final void method3099(int arg0, class660 arg1) {
        ++field7549;
        this.field7680[this.field7711] = arg1;
        this.method3119((byte) 122);
        int var3 = -114 / ((-35 - arg0) / 52);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([FI)[F")
    public final float[] method3100(float[] arg0, int arg1) {
        arg0[4] = this.field7676[1];
        if (arg1 != 18895) {
            this.method3132(-24);
        }
        ++field7653;
        arg0[12] = this.field7676[3];
        arg0[8] = this.field7676[2];
        arg0[0] = this.field7676[0];
        arg0[1] = this.field7676[4];
        arg0[5] = this.field7676[5];
        arg0[2] = this.field7676[8];
        arg0[9] = this.field7676[6];
        arg0[13] = this.field7676[7];
        arg0[14] = this.field7676[11];
        arg0[3] = this.field7676[12];
        arg0[10] = this.field7676[10];
        arg0[6] = this.field7676[9];
        arg0[7] = this.field7676[13];
        arg0[15] = this.field7676[15];
        arg0[11] = this.field7676[14];
        return arg0;
    }

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "(I)V")
    public abstract void method824(int arg0);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(B)V")
    public abstract void method854(byte arg0);

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(Z)V")
    public final void method3101(boolean arg0) {
        if (!arg0) {
            this.method595();
        }
        ++field7570;
        if (this.field7769 != 4) {
            this.method3132(-5850);
            this.method3159(false, -32);
            this.method3128((byte) -41, false);
            this.method3092((byte) 93, false);
            this.method3112(false, (byte) 91);
            this.method3131(-2, 0, false, false);
            this.method3117(1, arg0);
            this.method3113(-3334, 0);
            this.field7769 = 4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIIIZ)Lnf;")
    public final class604 method523(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7580;
        class87 var6 = new class87(this, arg2, arg3, arg4);
        var6.method642(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(B)V")
    public final void method3102(byte arg0) {
        ++field7593;
        int var2 = 2 / ((arg0 - -24) / 59);
        if (this.field7769 != 2) {
            this.method3132(-5850);
            this.method3159(false, -32);
            this.method3128((byte) 6, false);
            this.method3092((byte) 92, false);
            this.method3112(false, (byte) 91);
            this.method3131(-2, 0, false, false);
            this.field7769 = 2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "(I)V")
    public abstract void method860(int arg0);

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "(I)V")
    public abstract void method821(int arg0);

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(B)V")
    public final void method3103(byte arg0) {
        this.field7684 = new class365[this.field7754];
        this.field7768 = new class365[this.field7754];
        this.field7737 = new class421[this.field7754];
        this.field7720 = new class416[this.field7754];
        ++field7497;
        this.field7680 = new class660[this.field7754];
        for (int var2 = 0; ~var2 > ~this.field7754; ++var2) {
            this.field7768[var2] = class671.field9318;
            this.field7684[var2] = class671.field9318;
            this.field7680[var2] = class429.field5854;
            this.field7737[var2] = new class421();
        }
        this.field7736 = new class307[this.field7766 + -2];
        this.field7686 = this.method850(1, 1, class497.field6799, true, class530.field7176);
        this.method475(new class342(262144));
        this.field7779 = this.method844(arg0 + 131, new class588[] { new class588(new class601[] { class601.field8400, class601.field8405 }) });
        this.field7777 = this.method844(83, new class588[] { new class588(new class601[] { class601.field8400, class601.field8403 }) });
        this.field7776 = this.method844(110, new class588[] { new class588(class601.field8400), new class588(class601.field8403), new class588(class601.field8405), new class588(class601.field8402) });
        this.field7786 = this.method844(-126, new class588[] { new class588(class601.field8400), new class588(class601.field8403), new class588(class601.field8405) });
        this.field7795 = new class89(this, 0, 0, false, false);
        this.field7794 = new class89(this, 0, 0, true, true);
        this.field7790 = new class89(this, 0, 0, false, false);
        this.field7778 = new class89(this, 0, 0, true, true);
        this.field7796 = new class89(this, 0, 0, false, false);
        this.field7784 = new class89(this, 0, 0, true, true);
        this.field7782 = new class89(this, 0, 0, false, false);
        this.field7785 = new class89(this, 0, 0, true, true);
        this.field7783 = new class89(this, 0, 0, false, false);
        this.field7787 = new class89(this, 0, 0, true, true);
        this.field7753 = new class552(this);
        this.field7781 = this.method812(true, 104);
        this.method3121(-128);
        this.field7516 = new class440(this);
        if (arg0 != -17) {
            this.field7779 = null;
        }
        this.field7682[1] = this.method828(0, 1);
        this.field7682[2] = this.method828(0, 2);
        this.field7682[4] = this.method828(0, 4);
        this.field7682[5] = this.method828(0, 5);
        this.field7682[6] = this.method828(0, 6);
        this.field7682[7] = this.method828(class18.method125(arg0, -17), 7);
        this.field7682[3] = this.method828(arg0 + 17, 3);
        this.field7682[8] = this.method828(0, 8);
        this.field7682[9] = this.method828(0, 9);
        if (!this.field7682[2].method250(45)) {
            this.field7682[2] = this.method828(arg0 + 17, 0);
        }
        if (!this.field7682[4].method250(-111)) {
            this.field7682[4] = this.field7682[2];
        }
        if (!this.field7682[8].method250(76)) {
            this.field7682[8] = this.field7682[4];
        }
        if (!this.field7682[9].method250(48)) {
            this.field7682[9] = this.field7682[8];
        }
        this.method862(6035);
        this.method575();
        this.method548();
    }

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "()[I")
    public final int[] method496() {
        ++field7603;
        return new int[] { this.field7744, this.field7739, this.field7699, this.field7751 };
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(Z)V")
    public static void method3104(boolean arg0) {
        if (!arg0) {
            method3104(false);
        }
        field7498 = null;
        field7632 = null;
        field7540 = null;
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "()Z")
    public final boolean method534() {
        ++field7612;
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lza;)V")
    public final void method475(class437 arg0) {
        this.field7641 = ((class342) arg0).field4607;
        ++field7560;
        this.field7488 = this.field7641.method3898(32768, false);
    }

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "(I)V")
    private final void method3105(int arg0) {
        ++field7546;
        this.field7759 = (float) (-this.field7739 + this.field7760);
        this.field7750 = (float) (this.field7771 - this.field7739);
        if (arg0 == -1) {
            this.field7763 = (float) (this.field7765 - this.field7744);
            this.field7758 = (float) (this.field7732 - this.field7744);
        }
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "(B)V")
    public abstract void method866(byte arg0);

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "(I)I")
    public final int method3106(int arg0) {
        if (arg0 != 0) {
            this.field7730 = -0.8509445F;
        }
        ++field7591;
        return this.field7723;
    }

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "(I)V")
    private final void method3107(int arg0) {
        ++field7484;
        if (!this.field7691) {
            float[] var2 = this.field7710;
            float var3 = (float) (-this.field7744 * this.field7701) / (float) this.field7699;
            float var4 = (float) ((-this.field7744 + this.field7662) * this.field7701) / (float) this.field7699;
            float var5 = (float) (this.field7739 * this.field7701) / (float) this.field7751;
            float var6 = (float) ((-this.field7661 + this.field7739) * this.field7701) / (float) this.field7751;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field7701 * 2.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[4] = 0.0F;
                var2[11] = -1.0F;
                var2[14] = this.field7689 = (float) (this.field7719 * this.field7701) / (float) (-this.field7719 + this.field7701);
                var2[2] = 0.0F;
                var2[15] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[10] = this.field7693 = (float) this.field7719 / (float) (this.field7701 - this.field7719);
                var2[13] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[12] = 0.0F;
                var2[1] = 0.0F;
            } else {
                var2[8] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = 1.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = 0.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
            }
            this.method3145((byte) 20);
            this.field7691 = true;
        }
        if (arg0 != 15851) {
            this.method3089(1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "(I)V")
    public final void method3108(int arg0) {
        if (this.field7680[this.field7711] != class429.field5854) {
            this.field7680[this.field7711] = class429.field5854;
            this.field7737[this.field7711].method1862();
            this.method3119((byte) 122);
        }
        if (arg0 == 3) {
            ++field7493;
        }
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "()Z")
    public final boolean method592() {
        ++field7531;
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "(I)V")
    private final void method3109(int arg0) {
        ++field7667;
        this.field7770 = (float) this.field7719;
        if (arg0 >= -101) {
            this.method848(127);
        }
    }

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "(I)V")
    private final void method3110(int arg0) {
        this.method863(0, (byte) 91, this.field7788);
        if (arg0 != 32016) {
            this.field7679 = -52;
        }
        ++field7477;
        this.method846((byte) -118, this.field7793);
        this.method861(2, 1, class491.field6706, 0);
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(Z)V")
    public abstract void method837(boolean arg0);

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "(I)I")
    public final int method3111(int arg0) {
        if (arg0 != 0) {
            this.field7725 = -0.8565828F;
        }
        ++field7623;
        return this.field7711;
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(II)Lmr;")
    public class155 method828(int arg0, int arg1) {
        if (arg0 != 0) {
            field7498 = null;
        }
        ++field7509;
        if (arg1 != 6) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    return arg1 == 7 ? new class615(this) : new class295(this);
                } else {
                    return new class259(this, this.field7516);
                }
            } else {
                return new class218(this);
            }
        } else {
            return new class640(this);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZB)V")
    public final void method3112(boolean arg0, byte arg1) {
        ++field7643;
        if (this.field7713 != arg0) {
            this.field7713 = arg0;
            this.method823((byte) 9);
            this.field7769 &= -32;
        }
        if (arg1 != 91) {
            this.field7756 = 112;
        }
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(II)V")
    public final void method3113(int arg0, int arg1) {
        if (~arg1 == -2) {
            this.method3118(class371.field5051, class371.field5051, arg0 ^ -3334);
        } else if (~arg1 == -1) {
            this.method3118(class671.field9318, class671.field9318, arg0 + 3334);
        } else if (~arg1 != -3) {
            if (~arg1 == -4) {
                this.method3118(class671.field9318, class639.field8801, 0);
            } else if (arg1 == 4) {
                this.method3118(class726.field9977, class726.field9977, 0);
            }
        } else {
            this.method3118(class371.field5051, class34.field565, 0);
        }
        if (arg0 == -3334) {
            ++field7481;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
    public final void method3114(int arg0, boolean arg1) {
        if (this.field7711 != arg0) {
            this.field7711 = arg0;
            this.method843(0);
        }
        ++field7581;
        if (arg1) {
            this.field7752 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
    public final void method3115(boolean arg0, int arg1) {
        if (!arg0 != !this.field7727) {
            this.field7727 = arg0;
            this.method811((byte) -15);
        }
        ++field7534;
        if (arg1 != -25) {
            this.method583((int[]) null);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lgj;II)V")
    public class551(Canvas arg0, Object arg1, class162 arg2, class662 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field7617 = this.field7490 = arg0;
            this.field7532 = this.field7514 = arg1;
            this.field7635 = arg3;
            this.field7690 = arg4;
            Dimension var7 = arg0.getSize();
            this.field7662 = this.field7631 = var7.width;
            this.field7661 = this.field7536 = var7.height;
            this.field7694 = arg5;
            class184.method1371(-2526, true, false);
            if (super.field970 != null) {
                this.field7767 = new class626(this, super.field970);
                this.field7590 = new NativeInterface(super.field970.method1271((byte) 63), this.field7694);
                for (int var8 = 0; ~super.field970.method1271((byte) 63) < ~var8; ++var8) {
                    class311 var9 = super.field970.method1270(var8, true);
                    if (var9 != null) {
                        this.field7590.initTextureMetrics(var8, var9.field4241, var9.field4236);
                    }
                }
            } else {
                this.field7590 = new NativeInterface(0, this.field7694);
                this.field7767 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method594(0);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!sf", name = "pa", descriptor = "()V")
    public final void method553() {
        this.field7714 = false;
        ++field7539;
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "(I)V")
    private final void method3116(int arg0) {
        ++field7480;
        if (arg0 == -26922) {
            if (class218.field3219 != this.field7712) {
                class448 var2 = this.field7712;
                this.field7712 = class218.field3219;
                if (!var2.method2601(false)) {
                    this.method3089(arg0 ^ -26921);
                }
                this.method3135(-124);
                this.field7676 = this.field7707;
                this.method3155(-32);
                this.field7769 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "(I)V")
    public abstract void method865(int arg0);

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "()Z")
    public final boolean method588() {
        ++field7553;
        return this.field7682[3].method250(92);
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)Lza;")
    public final class437 method579(int arg0) {
        ++field7503;
        class342 var2 = new class342(arg0);
        this.field7629.method3594((byte) -54, var2);
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(Z)V")
    public abstract void method840(boolean arg0);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method574(Canvas arg0, int arg1, int arg2) {
        ++field7610;
        if (this.field7490 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7543.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method835(arg0, 36);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field7543.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IZ)V")
    public final void method3117(int arg0, boolean arg1) {
        if (!arg1) {
            this.method3148(70);
        }
        if (this.field7755 != arg0) {
            boolean var3;
            class591 var4;
            boolean var5;
            if (arg0 == 1) {
                var3 = true;
                var4 = class611.field8531;
                var5 = true;
            } else if (~arg0 != -3) {
                if (~arg0 != -129) {
                    var4 = class462.field6282;
                    var5 = false;
                    var3 = false;
                } else {
                    var5 = true;
                    var4 = class666.field9257;
                    var3 = true;
                }
            } else {
                var5 = false;
                var3 = true;
                var4 = class791.field10843;
            }
            if (!this.field7741 != !var5) {
                this.field7741 = var5;
                this.method820((byte) 109);
            }
            if (this.field7678 == !var3) {
                this.field7678 = var3;
                this.method826((byte) -121);
            }
            if (this.field7773 != var4) {
                this.field7773 = var4;
                this.method852((byte) -96);
            }
            this.field7755 = arg0;
            this.field7769 &= -29;
        }
        ++field7652;
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)V")
    public final void method573(int arg0) {
        ++field7555;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([IIIIIZ)Lnf;")
    public final class604 method587(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7658;
        return new class87(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "()Z")
    public final boolean method566() {
        ++field7528;
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[FZIILul;)Lgl;")
    public abstract class627 method839(int arg0, int arg1, int arg2, float[] arg3, boolean arg4, int arg5, int arg6, class599 arg7);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lafa;Lafa;I)V")
    public final void method3118(class365 arg0, class365 arg1, int arg2) {
        ++field7586;
        boolean var4 = false;
        if (this.field7684[this.field7711] != arg1) {
            this.field7684[this.field7711] = arg1;
            this.method854((byte) 29);
            var4 = true;
        }
        if (arg2 != 0) {
            this.field7733 = false;
        }
        if (this.field7768[this.field7711] != arg0) {
            this.field7768[this.field7711] = arg0;
            var4 = true;
            this.method865(-105);
        }
        if (var4) {
            this.field7769 &= -30;
        }
    }

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "(I)V")
    public abstract void method838(int arg0);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public final void method507(boolean arg0) {
        ++field7508;
    }

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "(B)V")
    private final void method3119(byte arg0) {
        this.method829(0);
        ++field7587;
        if (arg0 == 122) {
            if (this.field7729 != null) {
                this.field7729.method256(-87);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "DA", descriptor = "(IIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3) {
        this.field7751 = arg3;
        ++field7566;
        this.field7699 = arg2;
        this.field7744 = arg0;
        this.field7739 = arg1;
        this.method3142((byte) 124);
        this.method3122((byte) -110);
        this.method3156((byte) -106);
        this.method3105(-1);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(IZ)Lmha;")
    public abstract class438 method818(int arg0, boolean arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method835(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "(Z)V")
    private final void method3120(boolean arg0) {
        ++field7618;
        this.field7797 = this.method818(0, arg0);
        this.field7797.method1736((byte) 109, 3096, 12);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field7797.method1739(true, 80);
            if (var3 != null) {
                Stream var4 = this.method3170((byte) 5, var3);
                var4.method3914(0.0F);
                var4.method3914(0.0F);
                var4.method3914(0.0F);
                for (int var5 = 0; ~var5 >= -257; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (!Stream.method3910()) {
                        var4.method3909(var9);
                        var4.method3909(var8);
                        var4.method3909(0.0F);
                    } else {
                        var4.method3914(var9);
                        var4.method3914(var8);
                        var4.method3914(0.0F);
                    }
                }
                var4.method3901();
                if (this.field7797.method1737((byte) -74)) {
                    break;
                }
            }
        }
        this.field7780 = this.method844(81, new class588[] { new class588(class601.field8400) });
    }

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "(I)V")
    public final void method3121(int arg0) {
        ++field7562;
        Hashtable var2 = new Hashtable();
        if (this.field7543 != null && !this.field7543.isEmpty()) {
            Enumeration var3 = this.field7543.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method835(var4, 124));
            }
        }
        this.field7543 = var2;
        this.method3162((byte) -52);
        this.method3095((byte) 73);
        this.method3120(false);
        if (arg0 > -112) {
            this.method3103((byte) -84);
        }
        this.field7753.method3171(this, (byte) -26);
    }

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "(B)V")
    private final void method3122(byte arg0) {
        ++field7627;
        if (arg0 >= -46) {
            this.method3113(10, 63);
        }
        this.field7691 = false;
        this.method3107(15851);
        if (class15.field219 == this.field7712) {
            this.method3155(-32);
        }
    }

    @OriginalMember(owner = "client!sf", name = "HA", descriptor = "(IIII[I)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field7554;
        float var6 = this.field7670.method2473(4028, (float) arg2, (float) arg0, (float) arg1);
        if (!(var6 < (float) this.field7701) && !(var6 > (float) this.field7719)) {
            int var7 = (int) ((float) this.field7699 * this.field7670.method2481((float) arg0, 9, (float) arg1, (float) arg2) / (float) arg3);
            int var8 = (int) ((float) this.field7751 * this.field7670.method2494((float) arg2, (float) arg1, 88, (float) arg0) / (float) arg3);
            arg4[0] = (int) ((float) var7 - this.field7763);
            arg4[2] = (int) var6;
            arg4[1] = (int) ((float) var8 - this.field7759);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "(B)V")
    public abstract void method811(byte arg0);

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "(B)V")
    public abstract void method855(byte arg0);

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "(I)V")
    public final void method3123(int arg0) {
        ++field7651;
        this.method3133(-5221, class784.field10779, 2);
        if (arg0 != -14626) {
            this.method516((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(II)V")
    public final void method509(int arg0, int arg1) {
        ++field7609;
        if (~this.field7701 != ~arg0 || this.field7719 != arg1) {
            this.field7719 = arg1;
            this.field7701 = arg0;
            this.method3122((byte) -53);
            this.method3142((byte) 121);
            this.method3146(1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method845(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BZILul;IIII)Lgl;")
    public abstract class627 method814(byte[] arg0, boolean arg1, int arg2, class599 arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "(B)I")
    public final int method3124(byte arg0) {
        ++field7583;
        if (arg0 >= -59) {
            this.method3111(33);
        }
        return this.field7748;
    }

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "(I)Ljba;")
    public final class421 method3125(int arg0) {
        if (arg0 != 0) {
            this.method572();
        }
        ++field7525;
        return this.field7737[this.field7711];
    }

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "(I)V")
    public final void method3126(int arg0) {
        ++field7521;
        if (arg0 < 32) {
            this.method850(49, 24, (class497) null, true, (class599) null);
        }
        this.field7664 = false;
        this.method3166((byte) -128);
    }

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "()Z")
    public final boolean method595() {
        ++field7655;
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "xa", descriptor = "(F)V")
    public final void method480(float arg0) {
        if (this.field7685 != arg0) {
            this.field7685 = arg0;
            this.field7590.setAmbient(arg0);
            this.method868((byte) 114);
            this.method816((byte) -29);
        }
        ++field7594;
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
    public final void method545(int arg0) {
        ++field7545;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Len;)V")
    public final void method596(class339 arg0) {
        this.field7697 = (class246) arg0;
        ++field7479;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lmf;I)V")
    public final void method474(class442 arg0, int arg1) {
        this.field7753.method3172(64, this, arg1, arg0);
        ++field7530;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBLmha;)V")
    public abstract void method863(int arg0, byte arg1, class438 arg2);

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "(IIIII)V")
    public final void method591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7657;
        this.method508(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBZ[[I)Lpj;")
    public abstract class158 method847(int arg0, byte arg1, boolean arg2, int[][] arg3);

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "()Lsk;")
    public final class650 method533() {
        ++field7601;
        return this.field7789;
    }

    @OriginalMember(owner = "client!sf", name = "KA", descriptor = "(IIII)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3) {
        ++field7511;
        if (arg0 <= 0 && ~arg2 <= ~(this.field7662 + -1) && ~arg1 >= -1 && ~arg3 <= ~(this.field7661 + -1)) {
            this.method575();
        } else {
            this.field7765 = ~arg0 <= -1 ? arg0 : 0;
            this.field7760 = arg1 >= 0 ? arg1 : 0;
            this.field7771 = arg3 <= this.field7662 ? arg3 : 0;
            this.field7732 = this.field7662 < arg2 ? 0 : arg2;
            if (!this.field7798) {
                this.field7798 = true;
                this.method838(91);
            }
            this.method837(true);
            this.method3105(-1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)Lnf;")
    public final class604 method549(int arg0, int arg1, boolean arg2) {
        ++field7619;
        return new class87(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZI)V")
    public final void method3127(boolean arg0, int arg1) {
        if (!this.field7683 != !arg0) {
            this.field7683 = arg0;
            this.method824(-2466);
        }
        if (arg1 < -114) {
            ++field7638;
        }
    }

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "()Z")
    public final boolean method585() {
        ++field7650;
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(BZ)V")
    public final void method3128(byte arg0, boolean arg1) {
        int var3 = 37 % ((58 - arg0) / 36);
        if (this.field7747 != arg1) {
            this.field7747 = arg1;
            this.method811((byte) -15);
            this.field7769 &= -8;
        }
        ++field7649;
    }

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "(I)V")
    public final void method3129(int arg0) {
        ++field7483;
        if (arg0 != 8) {
            this.field7726 = null;
        }
        Enumeration var2 = this.field7543.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method845(this.field7543.get(var3), 0, var3);
        }
        this.field7792.method1543(-21647);
        this.field7788.method1543(-21647);
        this.field7797.method1543(-21647);
        this.field7794.method714(-19);
        this.field7778.method714(-39);
        this.field7784.method714(-42);
        this.field7785.method714(-30);
        this.field7787.method714(-6);
        this.field7753.method3176(1326432616);
        this.field7781.method1543(-21647);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method477(Canvas arg0, int arg1, int arg2) {
        ++field7485;
        Object var4 = null;
        if (arg0 != null && this.field7490 != arg0) {
            if (this.field7543.containsKey(arg0)) {
                var4 = this.field7543.get(arg0);
            }
        } else {
            var4 = this.field7532;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method842(false, arg0, var4);
            if (this.field7617 == arg0) {
                this.method3148(-66);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(ZI)Lta;")
    public abstract class226 method812(boolean arg0, int arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)V")
    public final void method3130(byte arg0, int arg1) {
        ++field7565;
        if (arg0 > -58) {
            this.field7755 = 14;
        }
        if (~this.field7761 != ~arg1) {
            this.field7761 = arg1;
            this.method840(true);
        }
    }

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "(I)V")
    public final void method502(int arg0) {
        this.field7706 = 0;
        ++field7527;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field7706;
        }
        this.field7775 = 1 << this.field7706;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "()Z")
    public final boolean method524() {
        ++field7568;
        return this.field7733;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZZ)V")
    public final void method3131(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg1 != 0) {
            this.method3161(true, -14, false);
        }
        if (this.field7681 != arg0 || !this.field7708 == this.field7714) {
            class627 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field7714 ? 3 : 0;
            if (~arg0 > -1) {
                this.method3108(3);
            } else {
                var5 = this.field7767.method3526(arg0, 5);
                class311 var10 = super.field970.method1270(arg0, true);
                if (var10.field4251 == 0 && ~var10.field4243 == -1) {
                    this.method3108(3);
                } else {
                    int var11 = var10.field4248 ? 64 : 128;
                    int var12 = var11 * 50;
                    class421 var13 = this.method3125(0);
                    var13.method2486(0.0F, (float) (this.field7757 % var12 * var10.field4243) / (float) var12, 111, (float) (this.field7757 % var12 * var10.field4251) / (float) var12);
                    this.method3099(arg1 ^ 109, class462.field6288);
                }
                var6 = var10.field4240;
                if (!this.field7714) {
                    var8 = var10.field4246;
                    var7 = var10.field4249;
                    var9 = var10.field4250;
                }
            }
            this.method3157(arg3, false, var9, var8, var7, arg2);
            if (this.field7729 == null) {
                this.method3090(var5, (byte) -83);
                this.method3113(-3334, var6);
            } else {
                this.field7729.method259(var5, -116, var6);
            }
            this.field7708 = this.field7714;
            this.field7681 = arg0;
        }
        ++field7505;
        this.field7769 &= -8;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(IIIIII)Len;")
    public final class339 method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7636;
        return new class61(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "(I)V")
    private final void method3132(int arg0) {
        ++field7604;
        if (arg0 == -5850) {
            if (class562.field7971 != this.field7712) {
                class448 var2 = this.field7712;
                this.field7712 = class562.field7971;
                if (var2.method2601(false)) {
                    this.method3089(1);
                }
                this.method3153(11);
                this.field7676 = this.field7698;
                this.method3155(arg0 ^ 5830);
                this.field7769 &= -25;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILbo;I)V")
    private final void method3133(int arg0, class761 arg1, int arg2) {
        if (arg0 != -5221) {
            this.method3100((float[]) null, -8);
        }
        ++field7504;
        this.method863(0, (byte) 71, this.field7792);
        this.method846((byte) -105, this.field7791);
        this.method861(2, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "(B)V")
    public final void method3134(byte arg0) {
        if (arg0 != 120) {
            this.method851((byte) -77);
        }
        if (~this.field7769 != -9) {
            this.method3163(1);
            this.method3159(true, -32);
            this.method3092((byte) 100, true);
            this.method3112(true, (byte) 91);
            this.method3117(1, true);
            this.field7769 = 8;
        }
        ++field7585;
    }

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "(I)V")
    public abstract void method825(int arg0);

    @OriginalMember(owner = "client!sf", name = "XA", descriptor = "()I")
    public final int method563() {
        ++field7541;
        return this.field7719;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIF)Lbq;")
    public final class307 method531(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7606;
        return new class402(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method842(boolean arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method834(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[Lug;)Lwp;")
    public abstract class193 method844(int arg0, class588[] arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[Lbq;)V")
    public final void method542(int arg0, class307[] arg1) {
        ++field7513;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field7736[var3] = arg1[var3];
        }
        this.field7762 = arg0;
        if (this.field7712.method2601(false)) {
            this.method822(19231);
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public final void method487(int arg0) {
        ++field7646;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method516(Canvas arg0) {
        ++field7529;
        if (this.field7490 == arg0) {
            throw new RuntimeException();
        } else if (this.field7543.containsKey(arg0)) {
            this.method845(this.field7543.get(arg0), 0, arg0);
            this.field7543.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "la", descriptor = "()V")
    public final void method575() {
        this.field7771 = this.field7661;
        this.field7732 = this.field7662;
        this.field7765 = 0;
        this.field7760 = 0;
        ++field7548;
        if (this.field7798) {
            this.field7798 = false;
            this.method838(127);
        }
        this.method3105(-1);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lmf;)V")
    public final void method478(class442 arg0) {
        this.field7753.method3172(64, this, -1, arg0);
        ++field7556;
    }

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "(I)V")
    private final void method3135(int arg0) {
        if (arg0 >= -121) {
            this.field7724 = false;
        }
        if (!this.field7695) {
            float[] var2 = this.field7707;
            float var3 = (float) this.field7701;
            float var4 = (float) this.field7719;
            float var5 = (float) (-this.field7739) * this.field7764 / (float) this.field7751;
            float var6 = (float) (-this.field7744) * this.field7764 / (float) this.field7699;
            float var7 = (float) (-this.field7744 + this.field7662) * this.field7764 / (float) this.field7699;
            float var8 = (float) (-this.field7739 + this.field7661) * this.field7764 / (float) this.field7751;
            if (var6 != var7 && var5 != var8) {
                var2[5] = 2.0F / (-var5 + var8);
                var2[14] = var3 / (var3 - var4);
                var2[9] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[7] = 0.0F;
                var2[10] = 1.0F / (-var4 + var3);
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
            } else {
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F;
            }
            this.method3109(-102);
            this.field7695 = true;
        }
        ++field7571;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lgs;Z)Lnf;")
    public final class604 method498(class49 arg0, boolean arg1) {
        ++field7644;
        class604 var10;
        if (arg0.field745 != 0 && ~arg0.field741 != -1) {
            int[] var3 = new int[arg0.field745 * arg0.field741];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field737 == null) {
                for (int var6 = 0; arg0.field741 > var6; ++var6) {
                    for (int var7 = 0; arg0.field745 > var7; ++var7) {
                        int var8 = arg0.field739[arg0.field743[var4++] & 255];
                        var3[var5++] = var8 == 0 ? 0 : class530.method3011(-16777216, var8);
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field741; ++var9) {
                    for (int var11 = 0; ~arg0.field745 < ~var11; ++var11) {
                        var3[var5++] = class530.method3011(arg0.field739[class204.method1456(255, arg0.field743[var4])], arg0.field737[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method495(0, arg0.field745, var3, arg0.field741, arg0.field745, true);
        } else {
            var10 = this.method495(0, 1, new int[1], 1, 1, true);
        }
        var10.method213(arg0.field744, arg0.field738, arg0.field740, arg0.field742);
        return var10;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        ++field7519;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)Lta;")
    public final class226 method3136(byte arg0, int arg1) {
        ++field7608;
        if (arg0 > -65) {
            this.method492(-24, 0, 75, -25, -18, 6, 17, 4, 57);
        }
        if (~this.field7781.method1638((byte) 91) > ~(arg1 * 2)) {
            this.field7781.method1546(arg1, -13659);
        }
        return this.field7781;
    }

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "(I)I")
    public final int method3137(int arg0) {
        if (arg0 != -29) {
            this.field7749 = -90;
        }
        ++field7573;
        return this.field7709;
    }

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "(B)V")
    public static final void method3138(byte arg0) {
        ++field7654;
        class583 var1 = null;
        try {
            var1 = class742.method4108("2", 92);
            class93 var2 = new class93(class647.field8938 * 6 + 3);
            var2.method754(1, 49);
            var2.method781(66, class647.field8938);
            int var3 = 0;
            if (arg0 >= -30) {
                method3104(false);
            }
            while (~class46.field724.length < ~var3) {
                if (class617.field8593[var3]) {
                    var2.method781(73, var3);
                    var2.method759(class46.field724[var3], 125);
                }
                ++var3;
            }
            var1.method3348(0, var2.field1413, var2.field1442, 1);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3349(-4013);
            }
        } catch (Exception var4) {
        }
        class18.field429 = class197.method1423(1);
        class271.field3792 = false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIZI[I)Lgl;")
    public final class627 method3139(boolean arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        ++field7547;
        return arg0 ? null : this.method827(arg3, arg2, 0, (byte) -106, arg1, 0, arg4);
    }

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "(ILaa;II)V")
    public final void method511(int arg0, class514 arg1, int arg2, int arg3) {
        ++field7520;
        class389 var5 = (class389) arg1;
        class627 var6 = var5.field5340;
        this.method3102((byte) 62);
        this.method3090(var6, (byte) -57);
        this.method3117(1, true);
        this.method3118(class371.field5051, class371.field5051, 0);
        this.method3143(class633.field8767, true, 0);
        this.method3130((byte) -77, arg0);
        this.field7663.method2490((float) this.field7662, (float) this.field7661, -14978, 0.0F);
        this.method3126(41);
        this.field7737[0].method2490(var6.method2675((float) this.field7662, (byte) 122), var6.method2669(31463, (float) this.field7661), -14978, 1.0F);
        this.field7737[0].method2489(var6.method2675((float) (-arg2), (byte) 114), 0.0F, -125, var6.method2669(31463, (float) (-arg3)));
        this.field7680[0] = class462.field6288;
        this.method3119((byte) 122);
        this.method3123(-14626);
        this.method3108(3);
        this.method3143(class327.field4459, true, 0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljda;ZIZI)V")
    public abstract void method841(class240 arg0, boolean arg1, int arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
    public abstract void method836(int arg0, byte arg1);

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "(I)V")
    public final void method3140(int arg0) {
        this.field7663.method1862();
        ++field7578;
        if (arg0 == 25723) {
            this.field7664 = true;
            this.method3166((byte) -122);
        }
    }

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "(B)V")
    public abstract void method820(byte arg0);

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        if (~this.field7716 != ~arg0 || ~this.field7740 != ~arg1 || this.field7735 != arg2) {
            this.field7716 = arg0;
            this.field7740 = arg1;
            this.field7735 = arg2;
            this.method3146(1);
            this.method821(92);
        }
        ++field7495;
    }

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "(Z)V")
    private final void method3141(boolean arg0) {
        ++field7515;
        if (arg0) {
            if (~this.field7769 != -2) {
                this.method3132(-5850);
                this.method3159(false, -32);
                this.method3128((byte) -60, false);
                this.method3092((byte) 96, false);
                this.method3112(false, (byte) 91);
                this.method3131(-2, 0, false, false);
                this.method3113(-3334, 1);
                this.method3090(this.field7686, (byte) -40);
                this.field7769 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "da", descriptor = "(III[I)V")
    public final void method515(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7574;
        float var5 = this.field7670.method2473(4028, (float) arg2, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field7739;
            var7 = this.field7744;
        } else {
            var7 = (int) ((float) this.field7699 * this.field7670.method2481((float) arg0, 9, (float) arg1, (float) arg2) / var5);
            var6 = (int) ((float) this.field7751 * this.field7670.method2494((float) arg2, (float) arg1, 108, (float) arg0) / var5);
        }
        arg3[1] = (int) ((float) var6 - this.field7759);
        arg3[0] = (int) ((float) var7 + -this.field7763);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method559(Canvas arg0) {
        this.field7532 = null;
        ++field7656;
        this.field7617 = null;
        if (arg0 != null && this.field7490 != arg0) {
            if (this.field7543.containsKey(arg0)) {
                this.field7532 = this.field7543.get(arg0);
                this.field7617 = arg0;
            }
        } else {
            this.field7532 = this.field7514;
            this.field7617 = this.field7490;
        }
        if (this.field7617 != null && this.field7532 != null) {
            this.method834(-7511, this.field7532, this.field7617);
            this.method3148(-121);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbl;B)V")
    public abstract void method853(class677 arg0, byte arg1);

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "(B)V")
    private final void method3142(byte arg0) {
        ++field7518;
        this.field7695 = false;
        this.method3135(-122);
        if (class218.field3219 == this.field7712) {
            this.method3155(-32);
        }
        if (arg0 <= 118) {
            this.method593(108, -36);
        }
    }

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "(III[I)V")
    public final void method490(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7557;
        float var5 = this.field7670.method2473(4028, (float) arg2, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field7739;
            var7 = this.field7744;
        } else {
            var7 = (int) ((float) this.field7699 * this.field7670.method2481((float) arg0, 9, (float) arg1, (float) arg2) / var5);
            var6 = (int) ((float) this.field7751 * this.field7670.method2494((float) arg2, (float) arg1, 112, (float) arg0) / var5);
        }
        arg3[0] = (int) ((float) var7 + -this.field7763);
        arg3[1] = (int) ((float) var6 + -this.field7759);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field7613;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljda;ZI)V")
    public final void method3143(class240 arg0, boolean arg1, int arg2) {
        this.method841(arg0, false, arg2, false, 18680);
        ++field7620;
        if (!arg1) {
            this.field7711 = 5;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZIBII[I)Lgl;")
    public abstract class627 method827(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class296 method589(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7640;
        return new class535(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FI)V")
    public final void method3144(float arg0, int arg1) {
        if (arg1 == -4902) {
            ++field7482;
            if (this.field7764 != arg0) {
                this.field7764 = arg0;
                this.method3142((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "ra", descriptor = "(IIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3) {
        this.field7714 = true;
        this.field7704 = arg0;
        this.field7723 = arg2;
        this.field7748 = arg3;
        ++field7630;
        this.field7709 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLwp;)V")
    public abstract void method846(byte arg0, class193 arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIII)V")
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7564;
        float var8 = (float) (-arg0) + (float) arg2;
        float var9 = (float) arg3 - (float) arg1;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method3141(true);
        this.method3130((byte) -88, arg4);
        this.method3143(class633.field8767, true, 0);
        this.method3168((byte) 27, 0, class633.field8767);
        this.method3117(arg6, true);
        this.field7663.method2490(var11, (float) arg5, -14978, 1.0F);
        this.field7663.method1860(0, -arg5 / 2, 0);
        this.field7663.method1869((int) ((double) var10 * 2607.5945876176133D) & 16383);
        this.field7663.method1860(arg0, arg1, 0);
        this.method3126(114);
        this.method819(false, (byte) 1);
        this.method3123(-14626);
        this.method819(true, (byte) 1);
        this.method3168((byte) 70, 0, class327.field4459);
        this.method3143(class327.field4459, true, 0);
    }

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "(B)V")
    private final void method3145(byte arg0) {
        if (arg0 == 20) {
            this.field7710[10] = this.field7693;
            this.field7710[14] = this.field7689;
            ++field7576;
            this.field7730 = (this.field7710[14] + (float) (-this.field7719)) / this.field7710[10];
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[I[I)Laa;")
    public final class514 method517(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7622;
        return class17.method101(arg3, arg1, this, 105, arg2, arg0);
    }

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "(I)V")
    private final void method3146(int arg0) {
        if (this.field7729 != null) {
            this.field7729.method251((byte) 127);
        }
        ++field7526;
        if (arg0 != 1) {
            this.field7738 = null;
        }
        this.method860(86);
    }

    @OriginalMember(owner = "client!sf", name = "aa", descriptor = "(IIIIII)V")
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7486;
        this.method3141(true);
        this.method3130((byte) -85, arg4);
        this.method3143(class633.field8767, true, 0);
        this.method3168((byte) 31, 0, class633.field8767);
        this.method3117(arg5, true);
        this.field7663.method2490((float) arg2, (float) arg3, -14978, 1.0F);
        this.field7663.method1860(arg0, arg1, 0);
        this.method3126(62);
        this.method819(false, (byte) 1);
        this.method3123(-14626);
        this.method819(true, (byte) 1);
        this.method3168((byte) 25, 0, class327.field4459);
        this.method3143(class327.field4459, true, 0);
    }

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "(I)V")
    public final void method3147(int arg0) {
        if (arg0 != -29742) {
            this.method512(-112, 74, 125, 27);
        }
        if (~this.field7769 != -17) {
            this.method3116(-26922);
            this.method3159(true, -32);
            this.method3092((byte) 58, true);
            this.method3112(true, (byte) 91);
            this.method3117(1, true);
            this.field7769 = 16;
        }
        ++field7607;
    }

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "(I)V")
    private final void method3148(int arg0) {
        if (arg0 < -64) {
            ++field7602;
            if (this.field7617 == null) {
                this.field7631 = this.field7536 = 1;
            } else {
                Dimension var2 = this.field7617.getSize();
                this.field7631 = var2.width;
                this.field7536 = var2.height;
            }
            this.field7661 = this.field7536;
            this.field7662 = this.field7631;
            this.method3149(0);
            this.method3122((byte) -89);
            this.method3142((byte) 121);
            this.method848(-21421);
            this.method3105(-1);
            this.method3156((byte) -121);
            this.method575();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lso;ZLul;)Z")
    public abstract boolean method810(class497 arg0, boolean arg1, class599 arg2);

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "(I)V")
    private final void method3149(int arg0) {
        if (arg0 == 0) {
            ++field7626;
            this.field7718 = false;
            if (class562.field7971 == this.field7712) {
                this.method3153(11);
                this.method3155(-32);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "(I)[F")
    public final float[] method3150(int arg0) {
        if (arg0 != 14) {
            this.field7735 = -12;
        }
        ++field7552;
        return this.field7696;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFIFFF)Z")
    private final boolean method3151(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
        ++field7589;
        if (arg3 != 10306) {
            this.method3166((byte) -119);
        }
        Buffer var8 = this.field7788.method1739(true, 47);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method3170((byte) 5, var8);
            if (Stream.method3910()) {
                var9.method3914(arg2);
                var9.method3914(arg1);
                var9.method3914(arg0);
                var9.method3914(arg4);
                var9.method3914(arg5);
                var9.method3914(arg6);
            } else {
                var9.method3909(arg2);
                var9.method3909(arg1);
                var9.method3909(arg0);
                var9.method3909(arg4);
                var9.method3909(arg5);
                var9.method3909(arg6);
            }
            var9.method3901();
            return this.field7788.method1737((byte) -83);
        }
    }

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "(B)V")
    public abstract void method816(byte arg0);

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "([I)V")
    public final void method580(int[] arg0) {
        arg0[0] = this.field7765;
        arg0[2] = this.field7732;
        arg0[3] = this.field7771;
        ++field7575;
        arg0[1] = this.field7760;
    }

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "(I)Ljba;")
    public final class421 method3152(int arg0) {
        ++field7533;
        if (arg0 != 8) {
            this.field7785 = null;
        }
        return this.field7737[this.field7711];
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[BILul;II)Lvga;")
    public abstract class94 method857(int arg0, byte[] arg1, int arg2, class599 arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
    public final void method500(int arg0) {
        ++field7621;
    }

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "(I)V")
    private final void method3153(int arg0) {
        if (!this.field7718) {
            float[] var2 = this.field7698;
            if (~this.field7662 != -1 && ~this.field7661 != -1) {
                var2[1] = 0.0F;
                var2[0] = 2.0F / (float) this.field7662;
                var2[4] = 0.0F;
                var2[5] = -2.0F / (float) this.field7661;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 1.0F;
                var2[12] = -1.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.5F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 0.5F;
                var2[15] = 1.0F;
            } else {
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[2] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[5] = 1.0F;
            }
            this.field7718 = true;
        }
        ++field7567;
        if (arg0 != 11) {
            this.field7716 = -107;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILso;ZLul;)Lgl;")
    public abstract class627 method850(int arg0, int arg1, class497 arg2, boolean arg3, class599 arg4);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lul;IBI[BZ)Lgl;")
    public final class627 method3154(class599 arg0, int arg1, byte arg2, int arg3, byte[] arg4, boolean arg5) {
        if (arg2 <= 47) {
            this.method552();
        }
        ++field7614;
        return this.method814(arg4, arg5, 8945, arg0, 0, arg3, 0, arg1);
    }

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "(I)V")
    private final void method3155(int arg0) {
        this.method825(124);
        ++field7487;
        if (arg0 == -32) {
            if (this.field7729 != null) {
                this.field7729.method252(155);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "()Lsk;")
    public final class650 method565() {
        ++field7605;
        return new class421();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljda;IIZ)V")
    public abstract void method867(class240 arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field7595;
    }

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "(I)V")
    public void method822(int arg0) {
        ++field7499;
        this.field7705 = this.field7762;
        this.field7762 = 0;
        if (arg0 != 19231) {
            this.method3142((byte) 117);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZB)V")
    public abstract void method819(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILta;Lbo;BIII)V")
    public abstract void method830(int arg0, class226 arg1, class761 arg2, byte arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7624;
    }

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "(B)V")
    public final void method3156(byte arg0) {
        ++field7645;
        if (class709.field9750 != this.field7712) {
            class448 var2 = this.field7712;
            this.field7712 = class709.field9750;
            if (var2.method2601(false)) {
                this.method3089(1);
            }
            this.field7769 &= -32;
            this.field7676 = this.field7696;
        }
        int var3 = 18 % ((-54 - arg0) / 49);
    }

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "()V")
    public void method543() {
        if (!this.field7677) {
            for (class154 var1 = this.field7629.method3589((byte) -127); var1 != null; var1 = this.field7629.method3591(0)) {
                ((class342) var1).method2126((byte) 106);
            }
            Enumeration var2 = this.field7543.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method845(this.field7543.get(var3), 0, var3);
            }
            class660.method3712((byte) -119, false, true);
            this.field7590.release();
            this.field7677 = true;
        }
        ++field7561;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lkc;[Lgs;Z)Lda;")
    public final class67 method476(class145 arg0, class49[] arg1, boolean arg2) {
        ++field7598;
        return new class306(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "()I")
    public final int method497() {
        ++field7616;
        return this.field7666 + this.field7665 - -this.field7668;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZIIIZ)V")
    private final void method3157(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg0 & this.method588();
        ++field7551;
        if (!var7 && (~arg2 == -5 || arg2 == 8 || ~arg2 == -10)) {
            arg2 = 2;
            arg3 = arg2 != 4 ? 1 : arg4 & 1;
            arg4 = 0;
        }
        if (~arg2 != -1 && arg5) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (!arg1) {
            if (~this.field7742 == ~arg2) {
                if (this.field7742 != 0) {
                    this.field7682[this.field7742 & Integer.MAX_VALUE].method257(false, arg5);
                    if (this.field7717 != arg4 || this.field7756 != arg3) {
                        this.field7682[Integer.MAX_VALUE & this.field7742].method254(arg4, arg3, (byte) -92);
                        this.field7717 = arg4;
                        this.field7756 = arg3;
                    }
                    return;
                }
            } else {
                if (this.field7742 != 0) {
                    this.field7682[this.field7742 & Integer.MAX_VALUE].method255(-128);
                }
                if (~arg2 != -1) {
                    this.field7729 = this.field7682[arg2 & Integer.MAX_VALUE];
                    this.field7729.method258(205, arg5);
                    this.field7729.method257(arg1, arg5);
                    this.field7729.method254(arg4, arg3, (byte) -92);
                } else {
                    this.field7729 = null;
                }
                this.field7742 = arg2;
                this.field7717 = arg4;
                this.field7756 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "(I)V")
    public abstract void method829(int arg0);

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "()Z")
    public final boolean method584() {
        ++field7628;
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "(I)Ljba;")
    public final class421 method3158(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field7596;
            return this.field7673;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(ZI)V")
    public final void method3159(boolean arg0, int arg1) {
        if (arg0 == !this.field7703) {
            this.field7703 = arg0;
            this.method821(80);
            this.field7769 &= -32;
        }
        if (arg1 != -32) {
            this.method3160(true, -40, (class599) null, 78, (byte) -64, (float[]) null);
        }
        ++field7507;
    }

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "(I)V")
    public abstract void method833(int arg0);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()I")
    public final int method493() {
        ++field7500;
        return this.field7766 + -2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsk;)V")
    public final void method503(class650 arg0) {
        ++field7633;
        this.field7670 = (class421) arg0;
        this.field7672.method1874(this.field7670);
        this.field7672.method2491((byte) -9);
        this.field7673.method2493(this.field7672, 127);
        this.field7671.method2493(this.field7670, 97);
        if (this.field7712.method2601(false)) {
            this.method3089(1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(II)I")
    public final int method593(int arg0, int arg1) {
        ++field7599;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "(I)V")
    public abstract void method864(int arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILul;IB[F)Lgl;")
    public final class627 method3160(boolean arg0, int arg1, class599 arg2, int arg3, byte arg4, float[] arg5) {
        ++field7538;
        if (arg4 > -70) {
            this.field7543 = null;
        }
        return this.method839(0, arg3, arg1, arg5, arg0, 15952, 0, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method590(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7634;
        boolean var7 = this.field7743 != arg0;
        if (var7 || this.field7721 != arg1 || this.field7725 != arg2) {
            this.field7725 = arg2;
            this.field7743 = arg0;
            this.field7721 = arg1;
            if (var7) {
                this.field7700 = (float) (this.field7743 & 16711680) / 1.671168E7F;
                this.field7715 = (float) (this.field7743 & 255) / 255.0F;
                this.field7692 = (float) (this.field7743 & 65280) / 65280.0F;
                this.method868((byte) 65);
            }
            this.field7590.setSunColour(this.field7700, this.field7692, this.field7715, arg1, arg2);
            this.method855((byte) -123);
        }
        if (this.field7752[0] != arg3 || this.field7752[1] != arg4 || this.field7752[2] != arg5) {
            this.field7752[1] = arg4;
            this.field7752[0] = arg3;
            this.field7752[2] = arg5;
            this.field7774[1] = -arg4;
            this.field7774[0] = -arg3;
            this.field7774[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7726[0] = arg3 * var8;
            this.field7726[1] = arg4 * var8;
            this.field7726[2] = arg5 * var8;
            this.field7738[1] = -this.field7726[1];
            this.field7738[2] = -this.field7726[2];
            this.field7738[0] = -this.field7726[0];
            this.field7590.setSunDirection(this.field7726[0], this.field7726[1], this.field7726[2]);
            this.method866((byte) -89);
            this.field7688 = (int) (arg3 * 256.0F / arg4);
            this.field7749 = (int) (arg5 * 256.0F / arg4);
        }
        this.method816((byte) -90);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method3161(boolean arg0, int arg1, boolean arg2) {
        if (!arg0) {
            this.field7761 = -92;
        }
        ++field7669;
        return this.field7641.method3898(arg1, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "(B)V")
    public abstract void method831(byte arg0);

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "(B)V")
    private final void method3162(byte arg0) {
        this.field7792 = this.method818(0, false);
        ++field7592;
        this.field7792.method1736((byte) 101, 140, 28);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field7792.method1739(true, 94);
            if (var3 != null) {
                Stream var4 = this.method3170((byte) 5, var3);
                if (!Stream.method3910()) {
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(1.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(1.0F);
                    var4.method3909(0.0F);
                    var4.method3909(1.0F);
                    var4.method3909(1.0F);
                    var4.method3909(1.0F);
                    var4.method3909(0.0F);
                    var4.method3909(1.0F);
                    var4.method3909(1.0F);
                    var4.method3909(1.0F);
                    var4.method3909(1.0F);
                    var4.method3909(1.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(1.0F);
                    var4.method3909(0.0F);
                    var4.method3909(1.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                    var4.method3909(0.0F);
                } else {
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(1.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(1.0F);
                    var4.method3914(0.0F);
                    var4.method3914(1.0F);
                    var4.method3914(1.0F);
                    var4.method3914(1.0F);
                    var4.method3914(0.0F);
                    var4.method3914(1.0F);
                    var4.method3914(1.0F);
                    var4.method3914(1.0F);
                    var4.method3914(1.0F);
                    var4.method3914(1.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(1.0F);
                    var4.method3914(0.0F);
                    var4.method3914(1.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                    var4.method3914(0.0F);
                }
                var4.method3901();
                if (this.field7792.method1737((byte) -75)) {
                    break;
                }
            }
        }
        this.field7791 = this.method844(arg0 ^ 23, new class588[] { new class588(new class601[] { class601.field8400, class601.field8405, class601.field8405 }) });
        if (arg0 != -52) {
            this.field7629 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7502;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method3141(true);
        this.method3130((byte) -125, arg4);
        this.method3143(class633.field8767, true, 0);
        this.method3168((byte) 66, 0, class633.field8767);
        this.method3117(arg5, true);
        this.method3140(25723);
        int var14 = arg8 % (arg6 + arg7);
        this.method819(false, (byte) 1);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (var14 > arg6) {
            var18 = (float) (arg7 - var14 + arg6) * var11;
            var17 = (float) (-var14 + arg6 - -arg7) * var12;
        } else {
            var19 = (float) (-var14 + arg6) * var12;
            var20 = (float) (-var14 + arg6) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg0 > ~arg2) {
                if ((float) arg2 < var21) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 < (float) arg2) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (~arg3 < ~arg1) {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            } else {
                if ((float) arg3 > var22) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method3151(0.0F, var22, var21, 10306, var19 + var21, var20 + var22, 0.0F)) {
                return;
            }
            var21 += var19 + var23;
            var22 += var20 + var24;
            this.method3110(32016);
            var19 = var15;
            var20 = var16;
        }
        this.method819(true, (byte) 1);
        this.method3168((byte) 66, 0, class327.field4459);
        this.method3143(class327.field4459, true, 0);
    }

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "(I)V")
    private final void method3163(int arg0) {
        if (class15.field219 != this.field7712) {
            class448 var2 = this.field7712;
            this.field7712 = class15.field219;
            if (!var2.method2601(false)) {
                this.method3089(1);
            }
            this.method3107(15851);
            this.field7676 = this.field7710;
            this.method3155(-32);
            this.field7769 &= -8;
        }
        ++field7558;
        if (arg0 != 1) {
            this.field7730 = -0.106844366F;
        }
    }

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "()Lsk;")
    public final class650 method539() {
        ++field7563;
        return this.field7670;
    }

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "(I)V")
    private final void method3164(int arg0) {
        this.method868((byte) 73);
        ++field7524;
        this.method855((byte) -123);
        this.method811((byte) -15);
        this.method822(19231);
        this.method866((byte) -122);
        this.method816((byte) -124);
        this.method824(-2466);
        this.method849(arg0 ^ arg0);
        this.method823((byte) 9);
        this.method821(91);
        this.method860(77);
        this.method826((byte) -126);
        this.method852((byte) -102);
        this.method820((byte) 109);
        for (int var2 = this.field7754 + -1; var2 >= 0; --var2) {
            this.method3114(var2, false);
            this.method854((byte) 29);
            this.method865(-24);
            this.method3108(3);
        }
        this.method840(true);
        this.method848(-21421);
        this.method825(105);
        this.method833(1);
        this.method831((byte) 118);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILbo;I)V")
    public abstract void method861(int arg0, int arg1, class761 arg2, int arg3);

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "(B)V")
    public abstract void method852(byte arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([I)V")
    public final void method583(int[] arg0) {
        ++field7611;
        arg0[1] = this.field7661;
        arg0[0] = this.field7662;
    }

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "(IIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
        ++field7550;
        boolean var5 = false;
        if (this.field7765 < arg0) {
            var5 = true;
            this.field7765 = arg0;
        }
        if (arg2 < this.field7732) {
            this.field7732 = arg2;
            var5 = true;
        }
        if (this.field7760 < arg1) {
            var5 = true;
            this.field7760 = arg1;
        }
        if (~this.field7771 < ~arg3) {
            var5 = true;
            this.field7771 = arg3;
        }
        if (var5) {
            if (!this.field7798) {
                this.field7798 = true;
                this.method838(51);
            }
            this.method837(true);
            this.method3105(-1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(IIIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7569;
        float var7 = this.method851((byte) 60);
        this.method3141(true);
        this.method3130((byte) -95, arg4);
        this.method3143(class633.field8767, true, 0);
        this.method3168((byte) 107, 0, class633.field8767);
        this.method3117(arg5, true);
        this.field7663.method2490((float) (arg2 + -1), (float) (arg3 + -1), -14978, 1.0F);
        this.field7663.method2489((float) arg0 + -var7, 0.0F, -122, (float) arg1 + -var7);
        this.method3126(109);
        this.method819(false, (byte) 1);
        this.method3133(-5221, class282.field3915, 4);
        this.method819(true, (byte) 1);
        this.method3168((byte) 52, 0, class327.field4459);
        this.method3143(class327.field4459, true, 0);
    }

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "(I)I")
    public final int method3165(int arg0) {
        if (arg0 != 1) {
            return -24;
        } else {
            ++field7647;
            return this.field7704;
        }
    }

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "(Z)V")
    public final void method557(boolean arg0) {
        ++field7579;
        this.field7772 = arg0;
        this.method823((byte) 9);
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "(B)V")
    private final void method3166(byte arg0) {
        ++field7501;
        if (class562.field7971 == this.field7712) {
            float var2 = this.method851((byte) 120);
            this.field7663.method2489(var2, 0.0F, -110, var2);
        }
        this.field7687 = false;
        this.method833(1);
        if (this.field7729 != null) {
            this.field7729.method260(110);
        }
        int var3 = -54 % ((arg0 - -10) / 56);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IB)V")
    public final void method3167(int arg0, byte arg1) {
        this.method3130((byte) -71, arg1 | arg1 << 16 | arg1 << 24 | arg1 << 8);
        if (arg0 != -7232) {
            this.field7778 = null;
        }
        ++field7492;
    }

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "(I)V")
    public abstract void method848(int arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILjda;)V")
    public final void method3168(byte arg0, int arg1, class240 arg2) {
        this.method867(arg2, arg1, 1, false);
        ++field7510;
        if (arg0 <= 22) {
            this.method3159(true, 59);
        }
    }

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "()V")
    public final void method541() {
        if (this.field7767 != null) {
            this.field7767.method3521(41);
        }
        ++field7522;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(ZB)V")
    public final void method3169(boolean arg0, byte arg1) {
        if (arg1 >= -104) {
            this.method508(-72, 2, -51, -99, -6, 18);
        }
        ++field7512;
        if (!arg0 != !this.field7675) {
            this.field7675 = arg0;
            this.method821(101);
        }
    }

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "()I")
    public final int method572() {
        ++field7523;
        return this.field7799;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method3170(byte arg0, Buffer arg1) {
        if (arg0 != 5) {
            return null;
        } else {
            ++field7582;
            this.field7731.method3911(arg1);
            return this.field7731;
        }
    }
}
