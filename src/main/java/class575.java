import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class575 extends class43 {

    @OriginalMember(owner = "client!fc", name = "Dc", descriptor = "Lki;")
    private class364 field7605 = new class364();

    @OriginalMember(owner = "client!fc", name = "Sd", descriptor = "Z")
    public boolean field7672 = true;

    @OriginalMember(owner = "client!fc", name = "Pd", descriptor = "Lvc;")
    public class131 field7669 = new class131();

    @OriginalMember(owner = "client!fc", name = "Td", descriptor = "Lvc;")
    public class131 field7673 = new class131();

    @OriginalMember(owner = "client!fc", name = "Ud", descriptor = "Lvc;")
    public class131 field7674 = new class131();

    @OriginalMember(owner = "client!fc", name = "Vd", descriptor = "Lvc;")
    public class131 field7675 = new class131();

    @OriginalMember(owner = "client!fc", name = "Wd", descriptor = "Lvc;")
    private class131 field7676 = new class131();

    @OriginalMember(owner = "client!fc", name = "Xd", descriptor = "Lvc;")
    private class131 field7677 = new class131();

    @OriginalMember(owner = "client!fc", name = "ie", descriptor = "[F")
    private float[] field7688 = new float[16];

    @OriginalMember(owner = "client!fc", name = "pe", descriptor = "I")
    public int field7695 = 0;

    @OriginalMember(owner = "client!fc", name = "ge", descriptor = "I")
    public int field7686 = 0;

    @OriginalMember(owner = "client!fc", name = "De", descriptor = "I")
    public int field7709 = 512;

    @OriginalMember(owner = "client!fc", name = "ye", descriptor = "I")
    public int field7704 = 3;

    @OriginalMember(owner = "client!fc", name = "ce", descriptor = "Z")
    public boolean field7682 = true;

    @OriginalMember(owner = "client!fc", name = "le", descriptor = "[F")
    private float[] field7691 = new float[16];

    @OriginalMember(owner = "client!fc", name = "Zd", descriptor = "[F")
    public float[] field7679 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!fc", name = "he", descriptor = "I")
    public int field7687 = -1;

    @OriginalMember(owner = "client!fc", name = "Yd", descriptor = "F")
    public float field7678 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "Ze", descriptor = "F")
    private float field7731 = 3000.0F;

    @OriginalMember(owner = "client!fc", name = "Ye", descriptor = "I")
    public int field7730 = 0;

    @OriginalMember(owner = "client!fc", name = "xe", descriptor = "F")
    public float field7703 = 3584.0F;

    @OriginalMember(owner = "client!fc", name = "af", descriptor = "F")
    public float field7732 = 3584.0F;

    @OriginalMember(owner = "client!fc", name = "Qe", descriptor = "I")
    private int field7722 = 0;

    @OriginalMember(owner = "client!fc", name = "sf", descriptor = "F")
    public float field7749 = -1.0F;

    @OriginalMember(owner = "client!fc", name = "pf", descriptor = "[F")
    private float[] field7746 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!fc", name = "Pe", descriptor = "I")
    private int field7721 = 0;

    @OriginalMember(owner = "client!fc", name = "te", descriptor = "Leg;")
    public class366 field7699 = class201.field2620;

    @OriginalMember(owner = "client!fc", name = "of", descriptor = "[F")
    private float[] field7745 = new float[16];

    @OriginalMember(owner = "client!fc", name = "Ae", descriptor = "F")
    private float field7706 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "Te", descriptor = "Z")
    public boolean field7725 = true;

    @OriginalMember(owner = "client!fc", name = "lf", descriptor = "F")
    public float field7742 = -1.0F;

    @OriginalMember(owner = "client!fc", name = "tf", descriptor = "Z")
    public boolean field7750 = false;

    @OriginalMember(owner = "client!fc", name = "ff", descriptor = "I")
    public int field7737 = 128;

    @OriginalMember(owner = "client!fc", name = "ee", descriptor = "I")
    public int field7684 = 8;

    @OriginalMember(owner = "client!fc", name = "He", descriptor = "F")
    public float field7713 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "qf", descriptor = "I")
    private int field7747 = -1;

    @OriginalMember(owner = "client!fc", name = "kf", descriptor = "Z")
    private boolean field7741 = false;

    @OriginalMember(owner = "client!fc", name = "We", descriptor = "[F")
    private float[] field7728 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!fc", name = "mf", descriptor = "I")
    public int field7743 = 3584;

    @OriginalMember(owner = "client!fc", name = "Cf", descriptor = "[Lwh;")
    private class695[] field7759 = new class695[10];

    @OriginalMember(owner = "client!fc", name = "Oe", descriptor = "Z")
    private boolean field7720 = false;

    @OriginalMember(owner = "client!fc", name = "Ke", descriptor = "I")
    private int field7716 = 16777215;

    @OriginalMember(owner = "client!fc", name = "Ff", descriptor = "Lgaa;")
    public class432 field7762 = class508.field6666;

    @OriginalMember(owner = "client!fc", name = "nf", descriptor = "I")
    public int field7744 = 0;

    @OriginalMember(owner = "client!fc", name = "Gf", descriptor = "Z")
    private boolean field7763 = false;

    @OriginalMember(owner = "client!fc", name = "Df", descriptor = "F")
    public float field7760 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "Xe", descriptor = "I")
    public int field7729 = 0;

    @OriginalMember(owner = "client!fc", name = "Ue", descriptor = "Z")
    private boolean field7726 = false;

    @OriginalMember(owner = "client!fc", name = "Pf", descriptor = "I")
    public int field7772 = 0;

    @OriginalMember(owner = "client!fc", name = "ae", descriptor = "Z")
    public boolean field7680 = true;

    @OriginalMember(owner = "client!fc", name = "Kf", descriptor = "F")
    public float field7767 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "Fe", descriptor = "Z")
    public boolean field7711 = false;

    @OriginalMember(owner = "client!fc", name = "Of", descriptor = "Z")
    private boolean field7771 = false;

    @OriginalMember(owner = "client!fc", name = "be", descriptor = "Z")
    public boolean field7681 = false;

    @OriginalMember(owner = "client!fc", name = "oe", descriptor = "I")
    public int field7694 = 0;

    @OriginalMember(owner = "client!fc", name = "Tf", descriptor = "I")
    public int field7776 = 50;

    @OriginalMember(owner = "client!fc", name = "Jf", descriptor = "Z")
    public boolean field7766 = false;

    @OriginalMember(owner = "client!fc", name = "Bf", descriptor = "Z")
    public boolean field7758 = true;

    @OriginalMember(owner = "client!fc", name = "Se", descriptor = "I")
    public int field7724 = 0;

    @OriginalMember(owner = "client!fc", name = "Mf", descriptor = "I")
    public int field7769 = 0;

    @OriginalMember(owner = "client!fc", name = "If", descriptor = "I")
    public int field7765 = -1;

    @OriginalMember(owner = "client!fc", name = "uf", descriptor = "I")
    public int field7751 = 512;

    @OriginalMember(owner = "client!fc", name = "re", descriptor = "[F")
    public float[] field7697 = this.field7746;

    @OriginalMember(owner = "client!fc", name = "Rf", descriptor = "I")
    private int field7774 = -1;

    @OriginalMember(owner = "client!fc", name = "Vf", descriptor = "I")
    private int field7778 = 0;

    @OriginalMember(owner = "client!fc", name = "Qf", descriptor = "[F")
    private float[] field7773 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!fc", name = "Nf", descriptor = "I")
    public int field7770 = 0;

    @OriginalMember(owner = "client!fc", name = "Uf", descriptor = "Z")
    public boolean field7777 = true;

    @OriginalMember(owner = "client!fc", name = "Af", descriptor = "I")
    private int field7757 = 1;

    @OriginalMember(owner = "client!fc", name = "zf", descriptor = "I")
    public int field7756 = -1;

    @OriginalMember(owner = "client!fc", name = "Wf", descriptor = "[F")
    public float[] field7779 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!fc", name = "cf", descriptor = "I")
    private int field7734 = 0;

    @OriginalMember(owner = "client!fc", name = "fe", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7685 = new Stream();

    @OriginalMember(owner = "client!fc", name = "cg", descriptor = "Lvc;")
    private class131 field7785 = new class131();

    @OriginalMember(owner = "client!fc", name = "yc", descriptor = "Ljava/lang/Object;")
    public Object field7600;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field7512;

    @OriginalMember(owner = "client!fc", name = "Zb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7575;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7524;

    @OriginalMember(owner = "client!fc", name = "Ge", descriptor = "I")
    public int field7712;

    @OriginalMember(owner = "client!fc", name = "Jd", descriptor = "Lpe;")
    public class615 field7663;

    @OriginalMember(owner = "client!fc", name = "gf", descriptor = "I")
    public int field7738;

    @OriginalMember(owner = "client!fc", name = "wc", descriptor = "I")
    private int field7598;

    @OriginalMember(owner = "client!fc", name = "qb", descriptor = "I")
    public int field7540;

    @OriginalMember(owner = "client!fc", name = "Mb", descriptor = "I")
    private int field7562;

    @OriginalMember(owner = "client!fc", name = "ic", descriptor = "I")
    public int field7584;

    @OriginalMember(owner = "client!fc", name = "me", descriptor = "Ljl;")
    private class652 field7692;

    @OriginalMember(owner = "client!fc", name = "Ld", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field7665;

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "Lra;")
    public static class361 field7532 = new class361(71, 1);

    @OriginalMember(owner = "client!fc", name = "Be", descriptor = "F")
    public float field7707;

    @OriginalMember(owner = "client!fc", name = "Ee", descriptor = "F")
    public float field7710;

    @OriginalMember(owner = "client!fc", name = "Ie", descriptor = "F")
    public float field7714;

    @OriginalMember(owner = "client!fc", name = "Je", descriptor = "F")
    public float field7715;

    @OriginalMember(owner = "client!fc", name = "Le", descriptor = "F")
    private float field7717;

    @OriginalMember(owner = "client!fc", name = "Me", descriptor = "F")
    public float field7718;

    @OriginalMember(owner = "client!fc", name = "Ve", descriptor = "F")
    private float field7727;

    @OriginalMember(owner = "client!fc", name = "bf", descriptor = "F")
    private float field7733;

    @OriginalMember(owner = "client!fc", name = "yf", descriptor = "F")
    public float field7755;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!fc", name = "pb", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!fc", name = "rb", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!fc", name = "tb", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!fc", name = "ub", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!fc", name = "vb", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!fc", name = "wb", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!fc", name = "Ab", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!fc", name = "Bb", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!fc", name = "Cb", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!fc", name = "Db", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!fc", name = "Eb", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!fc", name = "Fb", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!fc", name = "Gb", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!fc", name = "Hb", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!fc", name = "Ib", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!fc", name = "Jb", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!fc", name = "Kb", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!fc", name = "Lb", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!fc", name = "Nb", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!fc", name = "Ob", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!fc", name = "Pb", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!fc", name = "Qb", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!fc", name = "Rb", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!fc", name = "Sb", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!fc", name = "Tb", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!fc", name = "Vb", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!fc", name = "Wb", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!fc", name = "Xb", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!fc", name = "Yb", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!fc", name = "ac", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!fc", name = "bc", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!fc", name = "cc", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!fc", name = "dc", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!fc", name = "ec", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!fc", name = "fc", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!fc", name = "gc", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!fc", name = "hc", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!fc", name = "jc", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!fc", name = "kc", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!fc", name = "lc", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!fc", name = "mc", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!fc", name = "nc", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!fc", name = "oc", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!fc", name = "pc", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!fc", name = "qc", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!fc", name = "rc", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!fc", name = "sc", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!fc", name = "tc", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!fc", name = "uc", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!fc", name = "vc", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!fc", name = "xc", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!fc", name = "zc", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!fc", name = "Ac", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!fc", name = "Bc", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!fc", name = "Cc", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!fc", name = "Ec", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!fc", name = "Fc", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!fc", name = "Gc", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!fc", name = "Hc", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!fc", name = "Ic", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!fc", name = "Jc", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!fc", name = "Kc", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!fc", name = "Lc", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!fc", name = "Mc", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!fc", name = "Nc", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!fc", name = "Oc", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!fc", name = "Pc", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!fc", name = "Qc", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!fc", name = "Rc", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!fc", name = "Sc", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!fc", name = "Tc", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!fc", name = "Uc", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!fc", name = "Vc", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!fc", name = "Wc", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!fc", name = "Xc", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!fc", name = "Yc", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!fc", name = "Zc", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!fc", name = "ad", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!fc", name = "bd", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!fc", name = "cd", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!fc", name = "dd", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!fc", name = "ed", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!fc", name = "fd", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!fc", name = "gd", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!fc", name = "hd", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!fc", name = "id", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!fc", name = "jd", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!fc", name = "kd", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!fc", name = "ld", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!fc", name = "md", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!fc", name = "nd", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!fc", name = "od", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!fc", name = "pd", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!fc", name = "qd", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!fc", name = "rd", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!fc", name = "sd", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!fc", name = "td", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!fc", name = "ud", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!fc", name = "vd", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!fc", name = "wd", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!fc", name = "xd", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!fc", name = "yd", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!fc", name = "zd", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!fc", name = "Ad", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!fc", name = "Bd", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!fc", name = "Cd", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!fc", name = "Dd", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!fc", name = "Ed", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!fc", name = "Fd", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!fc", name = "Hd", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!fc", name = "Id", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!fc", name = "Kd", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!fc", name = "Md", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!fc", name = "Nd", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!fc", name = "Od", descriptor = "I")
    public int field7668;

    @OriginalMember(owner = "client!fc", name = "Qd", descriptor = "I")
    public int field7670;

    @OriginalMember(owner = "client!fc", name = "Rd", descriptor = "I")
    public int field7671;

    @OriginalMember(owner = "client!fc", name = "de", descriptor = "I")
    public int field7683;

    @OriginalMember(owner = "client!fc", name = "je", descriptor = "I")
    public int field7689;

    @OriginalMember(owner = "client!fc", name = "we", descriptor = "I")
    public int field7702;

    @OriginalMember(owner = "client!fc", name = "ze", descriptor = "I")
    public int field7705;

    @OriginalMember(owner = "client!fc", name = "Ce", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!fc", name = "df", descriptor = "I")
    public int field7735;

    @OriginalMember(owner = "client!fc", name = "hf", descriptor = "I")
    private int field7739;

    @OriginalMember(owner = "client!fc", name = "vf", descriptor = "I")
    public int field7752;

    @OriginalMember(owner = "client!fc", name = "wf", descriptor = "I")
    private int field7753;

    @OriginalMember(owner = "client!fc", name = "Lf", descriptor = "I")
    public int field7768;

    @OriginalMember(owner = "client!fc", name = "rg", descriptor = "I")
    private int field7800;

    @OriginalMember(owner = "client!fc", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!fc", name = "Xf", descriptor = "Lhj;")
    private class150 field7780;

    @OriginalMember(owner = "client!fc", name = "Yf", descriptor = "Lhj;")
    private class150 field7781;

    @OriginalMember(owner = "client!fc", name = "ag", descriptor = "Lhj;")
    public class150 field7783;

    @OriginalMember(owner = "client!fc", name = "hg", descriptor = "Lhj;")
    public class150 field7790;

    @OriginalMember(owner = "client!fc", name = "ig", descriptor = "Lhj;")
    public class150 field7791;

    @OriginalMember(owner = "client!fc", name = "og", descriptor = "Lhj;")
    public class150 field7797;

    @OriginalMember(owner = "client!fc", name = "eg", descriptor = "Lcu;")
    private class269 field7787;

    @OriginalMember(owner = "client!fc", name = "pg", descriptor = "Lcu;")
    private class269 field7798;

    @OriginalMember(owner = "client!fc", name = "yb", descriptor = "Lbl;")
    public class350 field7548;

    @OriginalMember(owner = "client!fc", name = "qe", descriptor = "Lnm;")
    public class391 field7696;

    @OriginalMember(owner = "client!fc", name = "ne", descriptor = "Lwm;")
    private class397 field7693;

    @OriginalMember(owner = "client!fc", name = "Zf", descriptor = "Lkb;")
    public class447 field7782;

    @OriginalMember(owner = "client!fc", name = "bg", descriptor = "Lkb;")
    public class447 field7784;

    @OriginalMember(owner = "client!fc", name = "dg", descriptor = "Lkb;")
    public class447 field7786;

    @OriginalMember(owner = "client!fc", name = "fg", descriptor = "Lkb;")
    public class447 field7788;

    @OriginalMember(owner = "client!fc", name = "gg", descriptor = "Lkb;")
    public class447 field7789;

    @OriginalMember(owner = "client!fc", name = "jg", descriptor = "Lkb;")
    public class447 field7792;

    @OriginalMember(owner = "client!fc", name = "kg", descriptor = "Lkb;")
    public class447 field7793;

    @OriginalMember(owner = "client!fc", name = "lg", descriptor = "Lkb;")
    public class447 field7794;

    @OriginalMember(owner = "client!fc", name = "mg", descriptor = "Lkb;")
    public class447 field7795;

    @OriginalMember(owner = "client!fc", name = "qg", descriptor = "Lkb;")
    public class447 field7799;

    @OriginalMember(owner = "client!fc", name = "ng", descriptor = "Lui;")
    private class498 field7796;

    @OriginalMember(owner = "client!fc", name = "jf", descriptor = "Ltj;")
    private class618 field7740;

    @OriginalMember(owner = "client!fc", name = "ef", descriptor = "Lwh;")
    private class695 field7736;

    @OriginalMember(owner = "client!fc", name = "Gd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7660;

    @OriginalMember(owner = "client!fc", name = "Ub", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field7570;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7517;

    @OriginalMember(owner = "client!fc", name = "ke", descriptor = "Z")
    public boolean field7690;

    @OriginalMember(owner = "client!fc", name = "ue", descriptor = "Z")
    public boolean field7700;

    @OriginalMember(owner = "client!fc", name = "Ne", descriptor = "Z")
    public boolean field7719;

    @OriginalMember(owner = "client!fc", name = "rf", descriptor = "Z")
    public boolean field7748;

    @OriginalMember(owner = "client!fc", name = "Ef", descriptor = "Z")
    public boolean field7761;

    @OriginalMember(owner = "client!fc", name = "sg", descriptor = "Z")
    public boolean field7801;

    @OriginalMember(owner = "client!fc", name = "ve", descriptor = "[Lvc;")
    public class131[] field7701;

    @OriginalMember(owner = "client!fc", name = "Re", descriptor = "[Lpn;")
    public class296[] field7723;

    @OriginalMember(owner = "client!fc", name = "Sf", descriptor = "[Lnm;")
    private class391[] field7775;

    @OriginalMember(owner = "client!fc", name = "se", descriptor = "[Lgga;")
    public class462[] field7698;

    @OriginalMember(owner = "client!fc", name = "xf", descriptor = "[Lgga;")
    public class462[] field7754;

    @OriginalMember(owner = "client!fc", name = "Hf", descriptor = "[Lwq;")
    public class492[] field7764;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    private final void method3063(int arg0) {
        if (arg0 != 16263) {
            this.method3122(-77);
        }
        ++field7601;
        if (this.field7736 != null) {
            this.field7736.method500((byte) 76);
        }
        this.method217(true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIF)Lpn;")
    public final class296 method385(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7508;
        return new class222(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    private final void method3064(byte arg0) {
        ++field7588;
        if (arg0 > 105) {
            this.field7771 = false;
            this.method3111(-124);
            if (class524.field6825 == this.field7699) {
                this.method3081(1);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V")
    public abstract void method212(int arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lkn;)V")
    public final void method403(class307 arg0) {
        this.field7740 = (class618) arg0;
        ++field7586;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method367(Canvas arg0) {
        ++field7625;
        Object var2 = null;
        if (arg0 != null && this.field7575 != arg0) {
            if (this.field7517.containsKey(arg0)) {
                var2 = this.field7517.get(arg0);
            }
        } else {
            var2 = this.field7512;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method166(var2, 83, arg0);
            if (this.field7524 == arg0) {
                this.method3113(99);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZII)V")
    public final void method3065(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (~this.field7774 != ~arg3) {
            if (arg3 < 0) {
                this.method3114(15);
                this.method3091(true, (class391) null);
                this.method3072((byte) -57, 0);
                if (!this.field7690) {
                    this.method3119(arg0, 0, 0, 0, arg1, 64);
                }
            } else {
                class309 var5 = this.field7692.method3581(arg3, -3787);
                class59 var6 = super.field598.method3162((byte) -104, arg3);
                if (~var6.field807 == -1 && var6.field806 == 0) {
                    this.method3114(15);
                } else {
                    int var7 = !var6.field794 ? 128 : 64;
                    int var8 = var7 * 50;
                    class131 var9 = this.method3125((byte) 119);
                    var9.method948(0.0F, (float) (this.field7708 % var8 * var6.field807) / (float) var8, (float) (this.field7708 % var8 * var6.field806) / (float) var8, 74);
                    this.method3140(30604, class34.field500);
                }
                if (!this.field7690) {
                    this.method3119(arg0, var6.field813, var6.field805, var6.field792, arg1, arg2 + -14613);
                }
                if (this.field7736 != null) {
                    this.field7736.method488(var5, false, var6.field797);
                } else {
                    this.method3091(true, var5);
                    this.method3072((byte) -57, var6.field797);
                }
            }
            this.field7774 = arg3;
        }
        ++field7607;
        this.field7739 &= -8;
        if (arg2 != 14721) {
            this.field7737 = 116;
        }
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
    private final void method3066(int arg0) {
        this.field7720 = false;
        ++field7506;
        if (arg0 != 0) {
            this.method401();
        }
        if (this.field7736 != null) {
            this.field7736.method490((byte) 48);
        }
        this.method203((byte) -127);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
    public abstract void method203(byte arg0);

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
    private final void method3067(byte arg0) {
        ++field7518;
        if (this.field7739 != 1) {
            this.method3131(true);
            this.method3132(true, false);
            this.method3084(false, (byte) 63);
            this.method3129((byte) -121, false);
            this.method3083(false, false);
            this.method3065(false, false, 14721, -2);
            this.method3072((byte) -57, 1);
            this.method3091(true, this.field7696);
            this.field7739 = 1;
        }
        if (arg0 != 13) {
            this.method164(89, (class637) null, -76, -27, 92, 49, (class498) null);
        }
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "(I)I")
    public final int method3068(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            return -9;
        } else {
            ++field7635;
            return this.field7694;
        }
    }

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "(IIIIII)V")
    public final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7550;
        this.method3067((byte) 13);
        this.method3142(arg4, 14);
        this.method3115(0, 0, class425.field5511);
        this.method3143(4, class425.field5511, 0);
        this.method3123(arg5, 1);
        this.field7669.method955(1.0F, (float) arg3, 0, (float) arg2);
        this.field7669.method143(arg0, arg1, 0);
        this.method3116(-110);
        this.method221((byte) -70, false);
        this.method3126((byte) -98);
        this.method221((byte) 113, true);
        this.method3143(4, class61.field833, 0);
        this.method3115(0, 0, class61.field833);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lba;Lqu;Lq;[Lht;I)V")
    public final void method349(class107[] arg0, class282 arg1, class151 arg2, class108[] arg3, int arg4) {
        ++field7525;
        this.method366(arg0, arg2, arg3, arg4);
        this.method326(arg1);
    }

    @OriginalMember(owner = "client!fc", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7620;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILbm;)V")
    private final void method3069(int arg0, int arg1, class637 arg2) {
        this.method155(0, this.field7787, -121);
        if (arg1 != -20322) {
            this.method344();
        }
        ++field7597;
        this.method187(-2, this.field7781);
        this.method185(0, arg0, -31084, arg2);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method336(Canvas arg0) {
        ++field7611;
        if (this.field7575 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7517.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method170((byte) 90, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field7517.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "(I)V")
    public abstract void method184(int arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(FB)V")
    public final void method3070(float arg0, byte arg1) {
        if (arg1 >= -15) {
            this.field7741 = false;
        }
        if (this.field7706 != arg0) {
            this.field7706 = arg0;
            this.method3079((byte) 82);
        }
        ++field7516;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Li;")
    public final class686 method369(int arg0) {
        ++field7514;
        class588 var2 = new class588(arg0);
        this.field7605.method2087(var2, -112);
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7573;
        float var7 = this.field7673.method943((float) arg2, (float) arg0, 0, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field7673.method943((float) arg5, (float) arg3, 0, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field7776 > var7) || !(var8 < (float) this.field7776)) && (!(var7 > (float) this.field7743) || !(var8 > (float) this.field7743))) {
            int var9 = (int) ((float) this.field7751 * this.field7673.method949(true, (float) arg0, (float) arg1, (float) arg2) / var7);
            int var10 = (int) ((float) this.field7751 * this.field7673.method949(true, (float) arg3, (float) arg4, (float) arg5) / var8);
            if ((float) var9 < this.field7715 && (float) var10 < this.field7715 || this.field7714 < (float) var9 && this.field7714 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field7709 * this.field7673.method950((float) arg2, (float) arg1, (float) arg0, -40) / var7);
                int var12 = (int) ((float) this.field7709 * this.field7673.method950((float) arg5, (float) arg4, (float) arg3, -101) / var8);
                return (!((float) var11 < this.field7718) || !((float) var12 < this.field7718)) && (!((float) var11 > this.field7707) || !((float) var12 > this.field7707));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(Z)F")
    public abstract float method232(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
    public abstract void method163(Canvas arg0, boolean arg1, Object arg2);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)I")
    public final int method377(int arg0, int arg1) {
        ++field7621;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "()Z")
    public final boolean method387() {
        ++field7647;
        return this.field7759[3].method494(true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BIILpw;I)Laq;")
    public abstract class444 method227(int arg0, byte[] arg1, int arg2, int arg3, class89 arg4, int arg5);

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "(I)[F")
    public final float[] method3071(int arg0) {
        if (arg0 != 0) {
            this.field7780 = null;
        }
        ++field7544;
        return this.field7746;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V")
    public abstract void method191(byte arg0);

    @OriginalMember(owner = "client!fc", name = "ka", descriptor = "(FF)V")
    public final void method371(float arg0, float arg1) {
        ++field7558;
        if (this.field7731 != arg0 || this.field7717 != arg1) {
            this.field7717 = arg1;
            this.field7731 = arg0;
            this.method3075((byte) 38);
            this.method3077((byte) -13);
            this.method3079((byte) 82);
            this.method3064((byte) 106);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7595;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8) {
        ++field7507;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
    public final void method3072(byte arg0, int arg1) {
        ++field7549;
        if (arg0 == -57) {
            if (~arg1 != -2) {
                if (~arg1 != -1) {
                    if (arg1 == 2) {
                        this.method3105(class510.field6687, true, class456.field5976);
                    } else {
                        if (~arg1 != -4) {
                            if (~arg1 == -5) {
                                this.method3105(class473.field6161, true, class473.field6161);
                                return;
                            }
                        } else {
                            this.method3105(class219.field2875, true, class600.field8091);
                        }
                    }
                } else {
                    this.method3105(class219.field2875, true, class219.field2875);
                }
            } else {
                this.method3105(class510.field6687, true, class510.field6687);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "(I)Ltda;")
    public final class342 method3073(int arg0) {
        if (arg0 != -5) {
            return null;
        } else {
            ++field7603;
            return this.field7740 == null ? null : this.field7740.method2064((byte) -109);
        }
    }

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "([I)V")
    public final void method356(int[] arg0) {
        ++field7489;
        arg0[1] = this.field7686;
        arg0[2] = this.field7695;
        arg0[3] = this.field7770;
        arg0[0] = this.field7769;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(IIIIII)V")
    public final void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7510;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        if (this.method3085(0.0F, (float) arg1, 0.0F, (float) arg3 + var11, (float) arg2 + var10, (float) arg0, -29)) {
            this.method3067((byte) 13);
            this.method3142(arg4, 42);
            this.method3115(0, 0, class425.field5511);
            this.method3143(4, class425.field5511, 0);
            this.method3123(arg5, 1);
            this.method3133((byte) 120);
            this.method221((byte) 111, false);
            this.method3080(false);
            this.method221((byte) -46, true);
            this.method3143(4, class61.field833, 0);
            this.method3115(0, 0, class61.field833);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLpw;Llj;)Z")
    public abstract boolean method176(byte arg0, class89 arg1, class6 arg2);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILbm;IIIILui;)V")
    public abstract void method164(int arg0, class637 arg1, int arg2, int arg3, int arg4, int arg5, class498 arg6);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILcu;I)V")
    public abstract void method155(int arg0, class269 arg1, int arg2);

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)Lvc;")
    public final class131 method3074(byte arg0) {
        if (arg0 != -97) {
            return null;
        } else {
            if (!this.field7720) {
                this.field7677.method935(this.field7675, this.field7669);
                this.field7720 = true;
            }
            ++field7496;
            return this.field7677;
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(B)V")
    private final void method3075(byte arg0) {
        if (arg0 != 38) {
            this.field7746 = null;
        }
        this.field7703 = (float) this.field7743 + -this.field7717;
        ++field7624;
    }

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "(I)V")
    public abstract void method181(int arg0);

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(B)V")
    public abstract void method196(byte arg0);

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "(I)V")
    public abstract void method199(int arg0);

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "(IIII)V")
    public final void method393(int arg0, int arg1, int arg2, int arg3) {
        this.field7730 = arg1;
        ++field7617;
        this.field7751 = arg2;
        this.field7709 = arg3;
        this.field7744 = arg0;
        this.method3079((byte) 82);
        this.method3064((byte) 123);
        this.method3124(10);
        this.method3145(false);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "()Z")
    public final boolean method329() {
        ++field7486;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "()F")
    public final float method3076() {
        ++field7576;
        return this.field7717;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lfca;IIII)Lba;")
    public final class107 method410(class645 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7498;
        return new class447(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)Lcu;")
    public abstract class269 method159(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(B)V")
    private final void method3077(byte arg0) {
        if (this.field7717 != 0.0F) {
            float var2 = this.field7731 / (this.field7731 + this.field7717);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field7727 * (-var2 + 1.0F) / this.field7717;
            this.field7691[14] = this.field7727 * var3;
            this.field7691[10] = this.field7733 + var4;
        } else {
            this.field7691[14] = this.field7727;
            this.field7691[10] = this.field7733;
        }
        ++field7564;
        if (arg0 != -13) {
            this.field7790 = null;
        }
        this.field7732 = (this.field7691[14] - (float) this.field7743) / this.field7691[10];
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Le;Lpe;II)V")
    public class575(Canvas arg0, Object arg1, class702 arg2, class615 arg3, int arg4, int arg5) {
        super(arg2);
        this.field7512 = this.field7600 = arg1;
        this.field7524 = this.field7575 = arg0;
        this.field7712 = arg4;
        this.field7663 = arg3;
        Dimension var7 = arg0.getSize();
        this.field7738 = arg5;
        this.field7540 = this.field7598 = var7.width;
        this.field7584 = this.field7562 = var7.height;
        class315.method1837(-1753516255, true, false);
        this.field7692 = new class652(this, super.field598);
        this.field7665 = new NativeInterface(super.field598.method3159((byte) -121), this.field7738);
        for (int var8 = 0; ~var8 > ~super.field598.method3159((byte) -126); ++var8) {
            class59 var9 = super.field598.method3162((byte) -104, var8);
            if (var9 != null) {
                this.field7665.initTextureMetrics(var8, var9.field798, var9.field811);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIIZ)Lqaa;")
    public final class309 method3078(int[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 96 / ((arg2 - 1) / 62);
        ++field7543;
        return this.method213(arg3, arg0, 0, -8, 0, arg4, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Lpn;)V")
    public final void method412(int arg0, class296[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field7723[var3] = arg1[var3];
        }
        ++field7638;
        this.field7689 = arg0;
        if (this.field7699.method2106(14)) {
            this.method229(1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "(B)V")
    public void method220(byte arg0) {
        ++field7652;
        if (arg0 == -107) {
            this.method3117(true);
        }
    }

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "(B)V")
    public abstract void method172(byte arg0);

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "(B)V")
    public abstract void method207(byte arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLol;)V")
    public abstract void method183(byte arg0, class388 arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class511 method341(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7666;
        class380 var6 = new class380(this, arg2, arg3, arg4);
        var6.method603(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method407(Canvas arg0) {
        ++field7636;
        if (this.field7575 == arg0) {
            throw new RuntimeException();
        } else if (this.field7517.containsKey(arg0)) {
            this.method163(arg0, true, this.field7517.get(arg0));
            this.field7517.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "ca", descriptor = "(IIII)V")
    public final void method376(int arg0, int arg1, int arg2, int arg3) {
        ++field7559;
        if (arg0 <= 0 && ~arg2 <= ~(this.field7540 - 1) && ~arg1 >= -1 && ~(this.field7584 - 1) >= ~arg3) {
            this.method396();
        } else {
            this.field7686 = arg1 >= 0 ? arg1 : 0;
            this.field7770 = arg3 > this.field7540 ? 0 : arg3;
            this.field7769 = ~arg0 > -1 ? 0 : arg0;
            this.field7695 = ~this.field7540 <= ~arg2 ? arg2 : 0;
            if (!this.field7801) {
                this.field7801 = true;
                this.method195(17506);
            }
            this.method197(-11717);
            this.method3145(false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "(III)V")
    public final void method404(int arg0, int arg1, int arg2) {
        if (~this.field7756 != ~arg0 || ~this.field7765 != ~arg1 || ~this.field7724 != ~arg2) {
            this.field7756 = arg0;
            this.field7724 = arg2;
            this.field7765 = arg1;
            if (!this.field7690) {
                this.method3063(16263);
                this.method212(0);
            }
        }
        ++field7645;
    }

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "(B)V")
    private final void method3079(byte arg0) {
        if (arg0 != 82) {
            this.field7763 = false;
        }
        ++field7538;
        this.field7763 = false;
        if (class482.field6417 == this.field7699) {
            this.method3136((byte) -108);
            this.method3081(1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILhj;)V")
    public abstract void method187(int arg0, class150 arg1);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public final void method359(int arg0) {
        ++field7528;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "()I")
    public final int method399() {
        ++field7556;
        return this.field7671 + this.field7668 + this.field7670;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(Z)V")
    private final void method3080(boolean arg0) {
        this.method155(0, this.field7798, -43);
        ++field7587;
        this.method187(-2, this.field7780);
        if (arg0) {
            this.method220((byte) -96);
        }
        this.method185(0, 1, -31084, class17.field198);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)V")
    public abstract void method221(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "(ILfa;II)V")
    public final void method357(int arg0, class619 arg1, int arg2, int arg3) {
        ++field7646;
        class677 var5 = (class677) arg1;
        class309 var6 = var5.field9337;
        this.method3138(-70);
        this.method3091(true, var6);
        this.method3123(1, 1);
        this.method3105(class510.field6687, true, class510.field6687);
        this.method3115(0, 0, class425.field5511);
        this.method3142(arg0, -112);
        this.field7669.method955(0.0F, (float) this.field7584, 0, (float) this.field7540);
        this.method3116(96);
        this.field7701[0].method955(1.0F, var6.method1136((float) this.field7584, (byte) -119), 0, var6.method1135(7886, (float) this.field7540));
        this.field7701[0].method942(var6.method1136((float) (-arg3), (byte) -109), 0.0F, var6.method1135(7886, (float) (-arg2)), -3);
        this.field7764[0] = class34.field500;
        this.method3102((byte) 76);
        this.method3126((byte) 126);
        this.method3114(15);
        this.method3115(0, 0, class61.field833);
    }

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "(I)V")
    public abstract void method195(int arg0);

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "(I)V")
    private final void method3081(int arg0) {
        this.method154(false);
        ++field7499;
        if (arg0 != 1) {
            this.method389();
        }
        if (this.field7736 != null) {
            this.field7736.method492(arg0 ^ -59);
        }
    }

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "(B)V")
    public abstract void method158(byte arg0);

    @OriginalMember(owner = "client!fc", name = "AA", descriptor = "(IIII)V")
    public final void method394(int arg0, int arg1, int arg2, int arg3) {
        this.field7687 = arg1;
        ++field7634;
        this.field7753 = arg0;
        this.field7734 = arg3;
        this.field7690 = true;
        this.field7747 = arg2;
        this.method3119(false, 0, 3, 0, false, 99);
        if (this.field7736 != null) {
            this.field7736.method499((byte) 104);
        }
        this.method3063(16263);
        this.method212(0);
    }

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "(B)V")
    public final void method3082(byte arg0) {
        if (this.field7739 != 16) {
            this.method3110(-8);
            this.method3132(true, true);
            this.method3129((byte) -119, true);
            this.method3083(true, false);
            this.method3123(1, 1);
            this.field7739 = 16;
        }
        ++field7596;
        if (arg0 > -119) {
            this.method3096((byte) -6);
        }
    }

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "(B)V")
    public abstract void method171(byte arg0);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZZ)V")
    public final void method3083(boolean arg0, boolean arg1) {
        ++field7641;
        if (!arg1) {
            if (!arg0 != !this.field7750) {
                this.field7750 = arg0;
                this.method172((byte) -34);
                this.field7739 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "(I)V")
    public abstract void method193(int arg0);

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "(I)V")
    public abstract void method165(int arg0);

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "(I)V")
    public abstract void method161(int arg0);

    @OriginalMember(owner = "client!fc", name = "JA", descriptor = "(I)V")
    public final void method330(int arg0) {
        ++field7563;
        this.field7704 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field7704;
        }
        this.field7684 = 1 << this.field7704;
    }

    @OriginalMember(owner = "client!fc", name = "YA", descriptor = "(IFFFFF)V")
    public final void method390(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7521;
        boolean var7 = this.field7716 != arg0;
        if (var7 || this.field7742 != arg1 || this.field7749 != arg2) {
            this.field7742 = arg1;
            this.field7749 = arg2;
            this.field7716 = arg0;
            if (var7) {
                this.field7767 = (float) (this.field7716 & 65280) / 65280.0F;
                this.field7760 = (float) (this.field7716 & 255) / 255.0F;
                this.field7713 = (float) (16711680 & this.field7716) / 1.671168E7F;
                this.method165(-127);
            }
            this.field7665.setSunColour(this.field7713, this.field7767, this.field7760, arg1, arg2);
            this.method214(false);
        }
        if (this.field7773[0] != arg3 || this.field7773[1] != arg4 || this.field7773[2] != arg5) {
            this.field7773[2] = arg5;
            this.field7773[1] = arg4;
            this.field7773[0] = arg3;
            this.field7728[2] = -arg5;
            this.field7728[0] = -arg3;
            this.field7728[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7779[1] = arg4 * var8;
            this.field7779[2] = arg5 * var8;
            this.field7779[0] = arg3 * var8;
            this.field7679[2] = -this.field7779[2];
            this.field7679[1] = -this.field7779[1];
            this.field7679[0] = -this.field7779[0];
            this.field7665.setSunDirection(this.field7779[0], this.field7779[1], this.field7779[2]);
            this.method184(-8);
            this.field7705 = (int) (arg5 * 256.0F / arg4);
            this.field7702 = (int) (arg3 * 256.0F / arg4);
        }
        this.method202(true);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(IIIIII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7580;
        float var7 = this.method232(true);
        this.method3067((byte) 13);
        this.method3142(arg4, 76);
        this.method3115(0, 0, class425.field5511);
        this.method3143(4, class425.field5511, 0);
        this.method3123(arg5, 1);
        this.field7669.method955(1.0F, (float) (arg3 - 1), 0, (float) (arg2 - 1));
        this.field7669.method942((float) arg1 - var7, 0.0F, (float) arg0 + -var7, -3);
        this.method3116(98);
        this.method221((byte) -103, false);
        this.method3069(4, -20322, class586.field7944);
        this.method221((byte) 119, true);
        this.method3143(4, class61.field833, 0);
        this.method3115(0, 0, class61.field833);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZB)V")
    public final void method3084(boolean arg0, byte arg1) {
        if (arg1 < 38) {
            this.method3101(36);
        }
        if (this.field7681 != arg0) {
            this.field7681 = arg0;
            this.method190(126);
            this.field7739 &= -8;
        }
        ++field7632;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLej;ZII)V")
    public abstract void method206(boolean arg0, class694 arg1, boolean arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(Z)V")
    public abstract void method214(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(Z)V")
    public abstract void method154(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(FFFFFFI)Z")
    private final boolean method3085(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        ++field7560;
        if (arg6 >= -20) {
            return true;
        } else {
            Buffer var8 = this.field7798.method647(false, true);
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method3087(var8, 6);
                if (!Stream.method1964()) {
                    var9.method1956(arg5);
                    var9.method1956(arg1);
                    var9.method1956(arg2);
                    var9.method1956(arg4);
                    var9.method1956(arg3);
                    var9.method1956(arg0);
                } else {
                    var9.method1958(arg5);
                    var9.method1958(arg1);
                    var9.method1958(arg2);
                    var9.method1958(arg4);
                    var9.method1958(arg3);
                    var9.method1958(arg0);
                }
                var9.method1955();
                return this.field7798.method646(-125);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public final int method370(int arg0, int arg1) {
        ++field7566;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lq;)V")
    public final void method342(class151 arg0) {
        ++field7547;
        this.field7673 = (class131) arg0;
        this.field7675.method133(this.field7673);
        this.field7675.method953(24616);
        this.field7676.method947(this.field7675, 6);
        this.field7674.method947(this.field7673, 6);
        if (this.field7699.method2106(14)) {
            this.method3066(0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3086(int arg0, byte arg1, int arg2) {
        if (arg1 <= 123) {
            method3086(107, (byte) 125, -64);
        }
        ++field7552;
        return (class528.method2815(-125, arg2, arg0) | class560.method2995(arg0, arg2, 1536) | class681.method3742(arg2, arg0, 12382)) & class663.method3631((byte) -120, arg0, arg2);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;")
    public final Stream method3087(Buffer arg0, int arg1) {
        if (arg1 != 6) {
            this.method3140(-29, (class492) null);
        }
        this.field7685.method1962(arg0);
        ++field7606;
        return this.field7685;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)V")
    public final void method3088(byte arg0, int arg1) {
        if (~this.field7694 != ~arg1) {
            this.field7694 = arg1;
            this.method177(87);
        }
        ++field7653;
        if (arg0 != 91) {
            this.field7674 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLvc;)V")
    public final void method3089(byte arg0, class131 arg1) {
        if (arg0 >= 107) {
            ++field7554;
            this.field7669.method133(arg1);
            this.field7672 = false;
            this.method3094(-23210);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method170(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "(I)I")
    public final int method3090(int arg0) {
        ++field7513;
        if (arg0 != 23203) {
            this.field7665 = null;
        }
        return this.field7753;
    }

    @OriginalMember(owner = "client!fc", name = "aa", descriptor = "()I")
    public final int method401() {
        ++field7616;
        return this.field7800;
    }

    @OriginalMember(owner = "client!fc", name = "LA", descriptor = "(IIII)V")
    public final void method358(int arg0, int arg1, int arg2, int arg3) {
        ++field7585;
        if (!this.field7690) {
            throw new RuntimeException("");
        } else {
            if (this.field7753 != arg0) {
                this.field7753 = arg0;
                if (this.field7736 != null) {
                    this.field7736.method499((byte) 103);
                }
            }
            this.field7747 = arg2;
            this.field7734 = arg3;
            this.field7687 = arg1;
            this.method3063(16263);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqu;)V")
    public final void method326(class282 arg0) {
        this.field7693.method2271(65, this, arg0);
        ++field7583;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLnm;)V")
    public final void method3091(boolean arg0, class391 arg1) {
        ++field7495;
        if (this.field7775[this.field7694] != arg1) {
            this.field7775[this.field7694] = arg1;
            if (arg1 == null) {
                this.method169(false);
            } else {
                arg1.method1141(1896);
            }
            this.field7739 &= -2;
        }
        if (!arg0) {
            this.field7719 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "(I)Lvc;")
    public final class131 method3092(int arg0) {
        ++field7530;
        if (arg0 != -27998) {
            this.method154(false);
        }
        return this.field7676;
    }

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "()I")
    public final int method343() {
        ++field7643;
        return this.field7776;
    }

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "(B)V")
    public final void method3093(byte arg0) {
        ++field7657;
        Hashtable var2 = new Hashtable();
        if (this.field7517 != null && !this.field7517.isEmpty()) {
            Enumeration var3 = this.field7517.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method170((byte) -97, var4));
            }
        }
        this.field7517 = var2;
        if (arg0 != -86) {
            this.method3110(-125);
        }
        this.method3096((byte) 4);
        this.method3104((byte) 79);
        this.field7693.method2270(this, (byte) 76);
    }

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "(I)V")
    private final void method3094(int arg0) {
        if (class244.field3267 == this.field7699) {
            float var2 = this.method232(true);
            this.field7669.method942(var2, 0.0F, var2, -3);
        }
        ++field7618;
        this.field7720 = false;
        if (arg0 == -23210) {
            this.method158((byte) -35);
            if (this.field7736 != null) {
                this.field7736.method497(1);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "(B)V")
    public final void method3095(byte arg0) {
        this.field7754 = new class462[this.field7683];
        ++field7501;
        this.field7775 = new class391[this.field7683];
        this.field7764 = new class492[this.field7683];
        this.field7701 = new class131[this.field7683];
        this.field7698 = new class462[this.field7683];
        for (int var2 = 0; ~this.field7683 < ~var2; ++var2) {
            this.field7754[var2] = class219.field2875;
            this.field7698[var2] = class219.field2875;
            this.field7764[var2] = class696.field9529;
            this.field7701[var2] = new class131();
        }
        this.field7723 = new class296[this.field7735 + -2];
        this.field7696 = this.method192(1, 0, 1, class6.field48, class135.field1774);
        this.method345(new class588(262144));
        this.field7790 = this.method230((byte) -125, new class560[] { new class560(new class568[] { class568.field7414, class568.field7420 }) });
        this.field7783 = this.method230((byte) -125, new class560[] { new class560(new class568[] { class568.field7414, class568.field7417 }) });
        this.field7797 = this.method230((byte) -125, new class560[] { new class560(class568.field7414), new class560(class568.field7417), new class560(class568.field7420), new class560(class568.field7415) });
        this.field7791 = this.method230((byte) -125, new class560[] { new class560(class568.field7414), new class560(class568.field7417), new class560(class568.field7420) });
        if (arg0 != 17) {
            this.field7801 = true;
        }
        this.field7786 = new class447(this, 0, 0, false, false);
        this.field7784 = new class447(this, 0, 0, true, true);
        this.field7795 = new class447(this, 0, 0, false, false);
        this.field7782 = new class447(this, 0, 0, true, true);
        this.field7799 = new class447(this, 0, 0, false, false);
        this.field7794 = new class447(this, 0, 0, true, true);
        this.field7788 = new class447(this, 0, 0, false, false);
        this.field7789 = new class447(this, 0, 0, true, true);
        this.field7792 = new class447(this, 0, 0, false, false);
        this.field7793 = new class447(this, 0, 0, true, true);
        this.field7693 = new class397(this);
        this.field7796 = this.method186(true, true);
        this.method3093((byte) -86);
        this.field7548 = new class350(this);
        this.field7759[1] = this.method174(1, false);
        this.field7759[2] = this.method174(2, false);
        this.field7759[4] = this.method174(4, false);
        this.field7759[5] = this.method174(5, false);
        this.field7759[6] = this.method174(6, false);
        this.field7759[7] = this.method174(7, false);
        this.field7759[3] = this.method174(3, false);
        this.field7759[8] = this.method174(8, false);
        this.field7759[9] = this.method174(9, false);
        if (!this.field7759[2].method494(true)) {
            this.field7759[2] = this.method174(0, false);
        }
        if (!this.field7759[4].method494(true)) {
            this.field7759[4] = this.field7759[2];
        }
        if (!this.field7759[8].method494(true)) {
            this.field7759[8] = this.field7759[4];
        }
        if (!this.field7759[9].method494(true)) {
            this.field7759[9] = this.field7759[8];
        }
        this.method220((byte) -107);
        this.method396();
    }

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "(B)V")
    private final void method3096(byte arg0) {
        ++field7523;
        this.field7787 = this.method159(false, false);
        if (arg0 != 4) {
            this.method391(true);
        }
        this.field7787.method649((byte) 97, 28, 140);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field7787.method647(false, true);
            if (var3 != null) {
                Stream var4 = this.method3087(var3, 6);
                if (Stream.method1964()) {
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(1.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(1.0F);
                    var4.method1958(0.0F);
                    var4.method1958(1.0F);
                    var4.method1958(1.0F);
                    var4.method1958(1.0F);
                    var4.method1958(0.0F);
                    var4.method1958(1.0F);
                    var4.method1958(1.0F);
                    var4.method1958(1.0F);
                    var4.method1958(1.0F);
                    var4.method1958(1.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(1.0F);
                    var4.method1958(0.0F);
                    var4.method1958(1.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                    var4.method1958(0.0F);
                } else {
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(1.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(1.0F);
                    var4.method1956(0.0F);
                    var4.method1956(1.0F);
                    var4.method1956(1.0F);
                    var4.method1956(1.0F);
                    var4.method1956(0.0F);
                    var4.method1956(1.0F);
                    var4.method1956(1.0F);
                    var4.method1956(1.0F);
                    var4.method1956(1.0F);
                    var4.method1956(1.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(1.0F);
                    var4.method1956(0.0F);
                    var4.method1956(1.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                    var4.method1956(0.0F);
                }
                var4.method1955();
                if (this.field7787.method646(-104)) {
                    break;
                }
            }
        }
        this.field7781 = this.method230((byte) -125, new class560[] { new class560(new class568[] { class568.field7414, class568.field7420, class568.field7420 }) });
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILbm;)V")
    public abstract void method185(int arg0, int arg1, int arg2, class637 arg3);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[Led;)Lhj;")
    public abstract class150 method230(byte arg0, class560[] arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lcda;I)V")
    public static final void method3097(class534 arg0, int arg1) {
        int var2 = 0;
        if (arg1 == 29013) {
            while (~var2 > ~class109.field1411) {
                int var3 = class651.field9061[var2];
                class193 var4 = class592.field8019[var3];
                int var5 = arg0.method2396(arg1 + -29116);
                if (~(var5 & 2) != -1) {
                    var5 += arg0.method2396(-125) << 8;
                }
                if ((var5 & 512) != 0) {
                    var5 += arg0.method2396(arg1 + -29030) << 16;
                }
                class363.method2076((byte) -53, arg0, var3, var5, var4);
                ++var2;
            }
            ++field7659;
        }
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "()Lq;")
    public final class151 method346() {
        ++field7610;
        return new class131();
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public final void method373(int arg0) {
        ++field7487;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZB)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method3098(int arg0, boolean arg1, byte arg2) {
        ++field7639;
        int var4 = 114 / ((arg2 - -59) / 33);
        return this.field7660.method1950(arg0, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "na", descriptor = "(III[I)V")
    public final void method350(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7628;
        float var5 = this.field7673.method943((float) arg2, (float) arg0, 0, (float) arg1);
        if (!((float) this.field7776 > var5) && !((float) this.field7743 < var5)) {
            int var6 = (int) ((float) this.field7751 * this.field7673.method949(true, (float) arg0, (float) arg1, (float) arg2) / var5);
            int var7 = (int) ((float) this.field7709 * this.field7673.method950((float) arg2, (float) arg1, (float) arg0, -79) / var5);
            if ((float) var6 >= this.field7715 && this.field7714 >= (float) var6 && this.field7718 <= (float) var7 && this.field7707 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field7718);
                arg3[0] = (int) ((float) var6 + -this.field7715);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
    public final void method3099(boolean arg0, int arg1) {
        if (this.field7777 != arg0) {
            this.field7777 = arg0;
            this.method212(0);
        }
        ++field7615;
        if (arg1 != -21716) {
            this.field7764 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
    public final void method3100(int arg0, byte arg1) {
        if (arg0 != -714740432) {
            this.field7712 = 9;
        }
        this.method3142(arg1 << 8 | arg1 << 24 | arg1 << 16 | arg1, -125);
        ++field7644;
    }

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "(I)V")
    public final void method3101(int arg0) {
        ++field7604;
        Enumeration var2 = this.field7517.keys();
        while (var2.hasMoreElements()) {
            Canvas var4 = (Canvas) var2.nextElement();
            this.method163(var4, true, this.field7517.get(var4));
        }
        this.field7787.method645(-103);
        this.field7798.method645(-53);
        this.field7784.method2539((byte) -42);
        this.field7782.method2539((byte) -42);
        this.field7794.method2539((byte) -42);
        this.field7789.method2539((byte) -42);
        int var3 = -88 / ((arg0 - -20) / 62);
        this.field7793.method2539((byte) -42);
        this.field7693.method2274(true);
        this.field7796.method645(-18);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lba;Lq;[Lht;I)V")
    public final void method366(class107[] arg0, class151 arg1, class108[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method827(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field7626;
    }

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "(B)V")
    private final void method3102(byte arg0) {
        this.method226(1);
        ++field7569;
        if (this.field7736 != null) {
            this.field7736.method496(-114);
        }
        int var2 = 52 % ((-1 - arg0) / 39);
    }

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "(B)Lvc;")
    public final class131 method3103(byte arg0) {
        ++field7651;
        return arg0 != 73 ? null : this.field7675;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lsga;[Law;Z)Lta;")
    public final class597 method405(class547 arg0, class506[] arg1, boolean arg2) {
        ++field7557;
        return new class643(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "(IIII)V")
    public final void method339(int arg0, int arg1, int arg2, int arg3) {
        ++field7553;
        boolean var5 = false;
        if (this.field7769 < arg0) {
            this.field7769 = arg0;
            var5 = true;
        }
        if (~arg2 > ~this.field7695) {
            this.field7695 = arg2;
            var5 = true;
        }
        if (arg1 > this.field7686) {
            var5 = true;
            this.field7686 = arg1;
        }
        if (arg3 < this.field7770) {
            this.field7770 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field7801) {
                this.field7801 = true;
                this.method195(17506);
            }
            this.method197(-11717);
            this.method3145(false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "()Z")
    public final boolean method355() {
        ++field7491;
        return this.field7719;
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(IIIII)V")
    public final void method411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7555;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Law;Z)Lxa;")
    public final class511 method325(class506 arg0, boolean arg1) {
        ++field7613;
        class511 var9;
        if (arg0.field6651 != 0 && ~arg0.field6650 != -1) {
            int[] var3 = new int[arg0.field6651 * arg0.field6650];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field6649 != null) {
                for (int var6 = 0; arg0.field6650 > var6; ++var6) {
                    for (int var7 = 0; arg0.field6651 > var7; ++var7) {
                        var3[var5++] = class131.method954(arg0.field6649[var4] << 24, arg0.field6648[class597.method3238(arg0.field6647[var4], 255)]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~arg0.field6650 < ~var8; ++var8) {
                    for (int var10 = 0; ~var10 > ~arg0.field6651; ++var10) {
                        int var11 = arg0.field6648[255 & arg0.field6647[var4++]];
                        var3[var5++] = var11 != 0 ? class131.method954(-16777216, var11) : 0;
                    }
                }
            }
            var9 = this.method381(var3, 0, arg0.field6651, arg0.field6651, arg0.field6650);
        } else {
            var9 = this.method381(new int[1], 0, 1, 1, 1);
        }
        var9.method610(arg0.field6646, arg0.field6652, arg0.field6645, arg0.field6653);
        return var9;
    }

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "(B)V")
    private final void method3104(byte arg0) {
        this.field7798 = this.method159(true, false);
        ++field7536;
        this.field7798.method649((byte) 108, 12, 24);
        int var2 = -35 % ((-71 - arg0) / 36);
        this.field7780 = this.method230((byte) -125, new class560[] { new class560(class568.field7414) });
    }

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "()V")
    public final void method408() {
        ++field7637;
        this.field7692.method3585(83);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lgga;ZLgga;)V")
    public final void method3105(class462 arg0, boolean arg1, class462 arg2) {
        ++field7649;
        if (!arg1) {
            this.field7681 = true;
        }
        boolean var4 = false;
        if (this.field7698[this.field7694] != arg2) {
            this.field7698[this.field7694] = arg2;
            var4 = true;
            this.method160(-1);
        }
        if (this.field7754[this.field7694] != arg0) {
            this.field7754[this.field7694] = arg0;
            var4 = true;
            this.method161(-5882);
        }
        if (var4) {
            this.field7739 &= -30;
        }
    }

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "(I)Lvc;")
    public final class131 method3106(int arg0) {
        if (arg0 < 109) {
            this.method3130(24, 59);
        }
        ++field7609;
        return this.field7669;
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(Z)V")
    private final void method3107(boolean arg0) {
        this.field7741 = false;
        ++field7631;
        if (class244.field3267 == this.field7699) {
            this.method3122(0);
            this.method3081(1);
        }
        if (!arg0) {
            this.field7697 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "(I)V")
    public final void method3108(int arg0) {
        int var2 = -84 / (-arg0 / 63);
        ++field7494;
        if (~this.field7739 != -5) {
            this.method3131(true);
            this.method3132(true, false);
            this.method3084(false, (byte) 61);
            this.method3129((byte) -120, false);
            this.method3083(false, false);
            this.method3065(false, false, 14721, -2);
            this.method3123(1, 1);
            this.method3072((byte) -57, 0);
            this.field7739 = 4;
        }
    }

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "(I)V")
    public final void method3109(int arg0) {
        if (arg0 == 0) {
            ++field7664;
            this.method3124(10);
            this.method3081(1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "(I)V")
    private final void method3110(int arg0) {
        ++field7551;
        if (arg0 != -8) {
            this.method3106(109);
        }
        if (class482.field6417 != this.field7699) {
            class366 var2 = this.field7699;
            this.field7699 = class482.field6417;
            if (!var2.method2106(14)) {
                this.method3066(0);
            }
            this.method3136((byte) -94);
            this.field7697 = this.field7688;
            this.method3081(1);
            this.field7739 &= -8;
        }
    }

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "(I)V")
    private final void method3111(int arg0) {
        if (arg0 > -77) {
            this.field7669 = null;
        }
        if (!this.field7771) {
            float[] var2 = this.field7691;
            float var3 = (float) (-this.field7744 * this.field7776) / (float) this.field7751;
            float var4 = (float) ((-this.field7744 + this.field7540) * this.field7776) / (float) this.field7751;
            float var5 = (float) (this.field7776 * this.field7730) / (float) this.field7709;
            float var6 = (float) ((-this.field7584 + this.field7730) * this.field7776) / (float) this.field7709;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field7776 * 2.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[3] = 0.0F;
                var2[10] = this.field7733 = (float) this.field7743 / (float) (this.field7776 - this.field7743);
                var2[5] = var7 / (-var6 + var5);
                var2[12] = 0.0F;
                var2[11] = -1.0F;
                var2[7] = 0.0F;
                var2[13] = 0.0F;
                var2[15] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[14] = this.field7727 = (float) (this.field7776 * this.field7743) / (float) (-this.field7743 + this.field7776);
            } else {
                var2[15] = 1.0F;
                var2[0] = 1.0F;
                var2[12] = 0.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
            }
            this.method3077((byte) -13);
            this.field7771 = true;
        }
        ++field7591;
    }

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "(I)V")
    public abstract void method226(int arg0);

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "()F")
    public final float method3112() {
        ++field7642;
        return this.field7731;
    }

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "(I)V")
    private final void method3113(int arg0) {
        ++field7533;
        if (this.field7524 == null) {
            this.field7598 = this.field7562 = 1;
        } else {
            Dimension var2 = this.field7524.getSize();
            this.field7598 = var2.width;
            this.field7562 = var2.height;
        }
        this.field7540 = this.field7598;
        this.field7584 = this.field7562;
        this.method3107(true);
        this.method3064((byte) 127);
        this.method3079((byte) 82);
        this.method199(0);
        this.method3145(false);
        this.method3124(10);
        this.method396();
        int var3 = 24 / ((-18 - arg0) / 56);
    }

    @OriginalMember(owner = "client!fc", name = "IA", descriptor = "()I")
    public final int method361() {
        ++field7497;
        return this.field7743;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIZ[BLpw;)Lqaa;")
    public abstract class309 method198(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, class89 arg7);

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    public void method224(int arg0) {
        this.field7692.method3580(256);
        ++field7565;
        this.field7708 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "(I)V")
    public void method229(int arg0) {
        if (arg0 != 1) {
            this.field7756 = -117;
        }
        ++field7656;
        this.field7768 = this.field7689;
        this.field7689 = 0;
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "()Z")
    public final boolean method340() {
        ++field7578;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "(I)V")
    public final void method3114(int arg0) {
        if (this.field7764[this.field7694] != class696.field9529) {
            this.field7764[this.field7694] = class696.field9529;
            this.field7701[this.field7694].method137();
            this.method3102((byte) -107);
        }
        if (arg0 == 15) {
            ++field7599;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lpw;BLlj;)Z")
    public abstract boolean method222(class89 arg0, byte arg1, class6 arg2);

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "()Z")
    public final boolean method389() {
        ++field7633;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIII)Lxa;")
    public final class511 method381(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7608;
        return new class380(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILej;)V")
    public final void method3115(int arg0, int arg1, class694 arg2) {
        ++field7511;
        this.method206(false, arg2, false, arg0, 23798);
        if (arg1 != 0) {
            this.field7785 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "(I)V")
    public final void method3116(int arg0) {
        int var2 = 68 % ((arg0 - 32) / 61);
        ++field7542;
        this.field7672 = false;
        this.method3094(-23210);
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(Z)V")
    public abstract void method202(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "(Z)V")
    private final void method3117(boolean arg0) {
        this.method165(-128);
        ++field7582;
        this.method214(false);
        this.method190(110);
        this.method229(1);
        this.method184(-8);
        this.method202(arg0);
        this.method181(968032408);
        this.method196((byte) -116);
        this.method172((byte) -34);
        this.method212(0);
        this.method217(arg0);
        this.method193(-80);
        this.method207((byte) -50);
        this.method171((byte) -87);
        for (int var2 = this.field7683 + -1; var2 >= 0; --var2) {
            this.method3088((byte) 91, var2);
            this.method160(-1);
            this.method161(-5882);
            this.method3114(15);
        }
        this.method191((byte) 122);
        this.method199(0);
        this.method154(false);
        this.method158((byte) -105);
        this.method203((byte) -113);
    }

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "()Z")
    public final boolean method382() {
        ++field7640;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public final void method348(int arg0) {
        ++field7619;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field7737 = arg0;
            this.field7692.method3585(94);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ[FILpw;I)Lqaa;")
    public final class309 method3118(int arg0, boolean arg1, float[] arg2, int arg3, class89 arg4, int arg5) {
        ++field7590;
        if (arg5 <= 5) {
            this.field7799 = null;
        }
        return this.method156(3000, arg3, arg1, arg2, 0, arg4, 0, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZIIIZI)V")
    private final void method3119(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        boolean var7 = arg4 & this.method387();
        ++field7623;
        if (arg5 < 14) {
            this.field7721 = 64;
        }
        if (!var7 && (~arg2 == -5 || arg2 == 8 || arg2 == 9)) {
            arg2 = 2;
            arg3 = ~arg2 == -5 ? arg1 & 1 : 1;
            arg1 = 0;
        }
        if (arg2 != 0 && arg0) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field7722 != arg2) {
            if (~this.field7722 != -1) {
                this.field7759[this.field7722 & Integer.MAX_VALUE].method491(67);
            }
            if (~arg2 == -1) {
                this.field7736 = null;
            } else {
                this.field7736 = this.field7759[Integer.MAX_VALUE & arg2];
                this.field7736.method498(arg0, (byte) -89);
                this.field7736.method495(1, arg0);
                this.field7736.method489(arg1, arg3, 89);
            }
            this.field7721 = arg1;
            this.field7722 = arg2;
            this.field7778 = arg3;
        } else if (this.field7722 != 0) {
            this.field7759[Integer.MAX_VALUE & this.field7722].method495(1, arg0);
            if (~this.field7721 != ~arg1 || ~this.field7778 != ~arg3) {
                this.field7759[Integer.MAX_VALUE & this.field7722].method489(arg1, arg3, 100);
                this.field7778 = arg3;
                this.field7721 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)Lwh;")
    public class695 method174(int arg0, boolean arg1) {
        ++field7488;
        if (arg1) {
            this.method396();
        }
        if (arg0 != 6) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    return ~arg0 == -8 ? new class531(this) : new class253(this);
                } else {
                    return new class323(this, this.field7548);
                }
            } else {
                return new class84(this);
            }
        } else {
            return new class347(this);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZI)V")
    public final void method3120(boolean arg0, int arg1) {
        if (!this.field7758 != !arg0) {
            this.field7758 = arg0;
            this.method181(968032408);
        }
        ++field7612;
        if (arg1 != 0) {
            this.method3095((byte) -77);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(IIIIII)Lkn;")
    public final class307 method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7574;
        return new class359(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    public final void method398(int arg0) {
        ++field7630;
    }

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "()Z")
    public final boolean method386() {
        ++field7568;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "()Z")
    public final boolean method334() {
        ++field7500;
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(IIIII)V")
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method406(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
        ++field7509;
    }

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "(I)V")
    public abstract void method160(int arg0);

    @OriginalMember(owner = "client!fc", name = "ha", descriptor = "(F)V")
    public final void method360(float arg0) {
        if (this.field7678 != arg0) {
            this.field7678 = arg0;
            this.field7665.setAmbient(arg0);
            this.method165(-127);
            this.method202(true);
        }
        ++field7546;
    }

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "(Z)V")
    public abstract void method217(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method166(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([FI)[F")
    public final float[] method3121(float[] arg0, int arg1) {
        arg0[0] = this.field7697[0];
        arg0[8] = this.field7697[2];
        ++field7581;
        arg0[4] = this.field7697[1];
        arg0[12] = this.field7697[3];
        arg0[2] = this.field7697[8];
        arg0[1] = this.field7697[4];
        arg0[9] = this.field7697[6];
        arg0[5] = this.field7697[5];
        arg0[13] = this.field7697[7];
        arg0[14] = this.field7697[11];
        arg0[10] = this.field7697[10];
        arg0[3] = this.field7697[12];
        arg0[7] = this.field7697[arg1];
        arg0[6] = this.field7697[9];
        arg0[15] = this.field7697[15];
        arg0[11] = this.field7697[14];
        return arg0;
    }

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "(I)V")
    private final void method3122(int arg0) {
        if (arg0 == 0) {
            if (!this.field7741) {
                float[] var2 = this.field7745;
                if (~this.field7540 != -1 && ~this.field7584 != -1) {
                    var2[5] = -2.0F / (float) this.field7584;
                    var2[9] = 0.0F;
                    var2[7] = 0.0F;
                    var2[0] = 2.0F / (float) this.field7540;
                    var2[14] = 0.5F;
                    var2[15] = 1.0F;
                    var2[8] = 0.0F;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[12] = -1.0F;
                    var2[10] = 0.5F;
                    var2[6] = 0.0F;
                    var2[13] = 1.0F;
                    var2[11] = 0.0F;
                    var2[2] = 0.0F;
                    var2[1] = 0.0F;
                } else {
                    var2[4] = 0.0F;
                    var2[6] = 0.0F;
                    var2[5] = 1.0F;
                    var2[10] = 1.0F;
                    var2[9] = 0.0F;
                    var2[0] = 1.0F;
                    var2[15] = 1.0F;
                    var2[3] = 0.0F;
                    var2[11] = 0.0F;
                    var2[2] = 0.0F;
                    var2[7] = 0.0F;
                    var2[13] = 0.0F;
                    var2[1] = 0.0F;
                    var2[12] = 0.0F;
                    var2[8] = 0.0F;
                    var2[14] = 0.0F;
                }
                this.field7741 = true;
            }
            ++field7522;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZILej;)V")
    public abstract void method228(boolean arg0, boolean arg1, int arg2, class694 arg3);

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "(I)V")
    public abstract void method190(int arg0);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
    public final void method3123(int arg0, int arg1) {
        ++field7661;
        if (arg1 == 1) {
            if (this.field7757 != arg0) {
                boolean var3;
                boolean var4;
                class432 var5;
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        var3 = true;
                        var4 = false;
                        var5 = class389.field4987;
                    } else if (~arg0 == -129) {
                        var4 = true;
                        var3 = true;
                        var5 = class124.field1606;
                    } else {
                        var5 = class486.field6469;
                        var4 = false;
                        var3 = false;
                    }
                } else {
                    var4 = true;
                    var5 = class508.field6666;
                    var3 = true;
                }
                if (!this.field7725 != !var4) {
                    this.field7725 = var4;
                    this.method171((byte) -87);
                }
                if (!var3 != !this.field7680) {
                    this.field7680 = var3;
                    this.method193(-103);
                }
                if (this.field7762 != var5) {
                    this.field7762 = var5;
                    this.method207((byte) -110);
                }
                this.field7739 &= -29;
                this.field7757 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)V")
    public abstract void method210(int arg0, int arg1);

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "(I)V")
    public final void method3124(int arg0) {
        ++field7503;
        if (arg0 == 10) {
            if (class201.field2620 != this.field7699) {
                class366 var2 = this.field7699;
                this.field7699 = class201.field2620;
                if (var2.method2106(14)) {
                    this.method3066(0);
                }
                this.field7739 &= -32;
                this.field7697 = this.field7746;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class619 method363(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7662;
        return class428.method2459(this, arg3, arg1, arg0, arg2, 7412);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI[[IZ)Ltda;")
    public abstract class342 method204(byte arg0, int arg1, int[][] arg2, boolean arg3);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method218(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "(B)Lvc;")
    public final class131 method3125(byte arg0) {
        ++field7648;
        int var2 = 121 / ((34 - arg0) / 63);
        return this.field7701[this.field7694];
    }

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "(B)V")
    public final void method3126(byte arg0) {
        ++field7493;
        int var2 = -29 % ((arg0 - 52) / 48);
        this.method3069(2, -20322, class235.field3146);
    }

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "(I)V")
    public static void method3127(int arg0) {
        if (arg0 != 6) {
            field7532 = null;
        }
        field7532 = null;
    }

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "(I)V")
    public abstract void method177(int arg0);

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "(I)Lvc;")
    public final class131 method3128(int arg0) {
        if (arg0 != 0) {
            this.field7779 = null;
        }
        ++field7589;
        return this.field7701[this.field7694];
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(BZ)V")
    public final void method3129(byte arg0, boolean arg1) {
        if (arg0 >= -103) {
            this.field7744 = 4;
        }
        ++field7594;
        if (this.field7766 != arg1) {
            this.field7766 = arg1;
            this.method196((byte) -116);
            this.field7739 &= -32;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIII)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7571;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method374(Canvas arg0) {
        ++field7627;
        this.field7512 = null;
        this.field7524 = null;
        if (arg0 != null && this.field7575 != arg0) {
            if (this.field7517.containsKey(arg0)) {
                this.field7512 = this.field7517.get(arg0);
                this.field7524 = arg0;
            }
        } else {
            this.field7524 = this.field7575;
            this.field7512 = this.field7600;
        }
        if (this.field7524 != null && this.field7512 != null) {
            this.method218(this.field7512, -14649, this.field7524);
            this.method3113(91);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[IIIIZI)Lqaa;")
    public abstract class309 method213(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()Z")
    public final boolean method327() {
        ++field7614;
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILlj;Lpw;)Lqaa;")
    public abstract class309 method192(int arg0, int arg1, int arg2, class6 arg3, class89 arg4);

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "()V")
    public final void method351() {
        this.field7690 = false;
        ++field7492;
        this.method3119(false, 0, 0, 0, false, 58);
        this.method3063(16263);
        this.method212(0);
    }

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "(Z)V")
    public abstract void method169(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(II)Lui;")
    public final class498 method3130(int arg0, int arg1) {
        ++field7667;
        if (arg0 != -10903) {
            this.method3087((Buffer) null, -37);
        }
        if (this.field7796.method648(true) < arg1 * 2) {
            this.field7796.method2429(arg1, (byte) -32);
        }
        return this.field7796;
    }

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "(Z)V")
    private final void method3131(boolean arg0) {
        ++field7654;
        if (class244.field3267 != this.field7699) {
            class366 var2 = this.field7699;
            this.field7699 = class244.field3267;
            if (var2.method2106(14)) {
                this.method3066(0);
            }
            this.method3122(0);
            this.field7697 = this.field7745;
            this.method3081(1);
            this.field7739 &= -25;
        }
        if (!arg0) {
            this.method376(50, 19, -17, 8);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(ZZ)V")
    public final void method3132(boolean arg0, boolean arg1) {
        if (!this.field7700 != !arg1) {
            this.field7700 = arg1;
            this.method212(0);
            this.field7739 &= -32;
        }
        if (!arg0) {
            this.method413(-2, 123, (int[][]) null, (int[][]) null, -56, -36, 80);
        }
        ++field7579;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    public final void method391(boolean arg0) {
        ++field7535;
        this.field7682 = arg0;
        this.method172((byte) -34);
    }

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "(B)V")
    public final void method3133(byte arg0) {
        ++field7561;
        if (arg0 < 104) {
            this.field7665 = null;
        }
        this.field7669.method137();
        this.field7672 = true;
        this.method3094(-23210);
    }

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "()V")
    public void method225() {
        if (!this.field7726) {
            for (class424 var1 = this.field7605.method2090(true); var1 != null; var1 = this.field7605.method2088(-152)) {
                ((class588) var1).method3211(124);
            }
            Enumeration var2 = this.field7517.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method163(var3, true, this.field7517.get(var3));
            }
            class260.method1621(false, true, false);
            this.field7665.release();
            this.field7726 = true;
        }
        ++field7650;
    }

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "()Lq;")
    public final class151 method402() {
        ++field7529;
        return this.field7785;
    }

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "(I)I")
    public final int method3134(int arg0) {
        ++field7505;
        if (arg0 != 0) {
            this.method3094(74);
        }
        return this.field7747;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ[FILpw;II)Lqaa;")
    public abstract class309 method156(int arg0, int arg1, boolean arg2, float[] arg3, int arg4, class89 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "(I)I")
    public final int method3135(int arg0) {
        ++field7541;
        int var2 = -58 % ((arg0 - 8) / 50);
        return this.field7734;
    }

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "()V")
    public final void method396() {
        ++field7527;
        this.field7686 = 0;
        this.field7769 = 0;
        this.field7695 = this.field7540;
        this.field7770 = this.field7584;
        if (this.field7801) {
            this.field7801 = false;
            this.method195(17506);
        }
        this.method3145(false);
    }

    @OriginalMember(owner = "client!fc", name = "ya", descriptor = "(IIIII)V")
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7602;
        this.method406(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "(B)V")
    private final void method3136(byte arg0) {
        if (arg0 >= -76) {
            this.method199(69);
        }
        if (!this.field7763) {
            float[] var2 = this.field7688;
            float var3 = (float) this.field7776 + -this.field7717;
            float var4 = (float) this.field7743 - this.field7717;
            float var5 = (float) (-this.field7730) * this.field7706 / (float) this.field7709;
            float var6 = (float) (-this.field7744) * this.field7706 / (float) this.field7751;
            float var7 = (float) (-this.field7744 + this.field7540) * this.field7706 / (float) this.field7751;
            float var8 = (float) (-this.field7730 + this.field7584) * this.field7706 / (float) this.field7709;
            if (var6 != var7 && var5 != var8) {
                var2[14] = var3 / (-var4 + var3);
                var2[3] = 0.0F;
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[8] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[15] = 1.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[10] = 1.0F / (-var4 + var3);
                var2[1] = 0.0F;
            } else {
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[13] = 0.0F;
                var2[14] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[2] = 0.0F;
            }
            this.method3075((byte) 38);
            this.field7763 = true;
        }
        ++field7593;
    }

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "(B)V")
    private final void method3137(byte arg0) {
        if (arg0 == -40) {
            if (class524.field6825 != this.field7699) {
                class366 var2 = this.field7699;
                this.field7699 = class524.field6825;
                if (!var2.method2106(14)) {
                    this.method3066(0);
                }
                this.method3111(-91);
                this.field7697 = this.field7691;
                this.method3081(1);
                this.field7739 &= -8;
            }
            ++field7622;
        }
    }

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "()I")
    public final int method384() {
        ++field7526;
        return this.field7735 + -2;
    }

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "(I)V")
    public final void method3138(int arg0) {
        if (this.field7739 != 2) {
            this.method3131(true);
            this.method3132(true, false);
            this.method3084(false, (byte) 102);
            this.method3129((byte) -121, false);
            this.method3083(false, false);
            this.method3065(false, false, 14721, -2);
            this.field7739 = 2;
        }
        ++field7577;
        int var2 = -40 % ((-3 - arg0) / 59);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Li;)V")
    public final void method345(class686 arg0) {
        this.field7660 = ((class588) arg0).field7987;
        ++field7655;
        this.field7570 = this.field7660.method1950(32768, false);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class88 method413(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7592;
        return new class247(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "()Z")
    public final boolean method344() {
        ++field7539;
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BBZILpw;)Lqaa;")
    public final class309 method3139(int arg0, byte[] arg1, byte arg2, boolean arg3, int arg4, class89 arg5) {
        ++field7504;
        return arg2 != 33 ? null : this.method198(arg4, arg0, 0, 0, 0, arg3, arg1, arg5);
    }

    @OriginalMember(owner = "client!fc", name = "sa", descriptor = "(II)V")
    public final void method335(int arg0, int arg1) {
        ++field7515;
        if (this.field7776 != arg0 || ~this.field7743 != ~arg1) {
            this.field7776 = arg0;
            this.field7743 = arg1;
            this.method3064((byte) 116);
            this.method3079((byte) 82);
            this.method3063(16263);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILwq;)V")
    public final void method3140(int arg0, class492 arg1) {
        this.field7764[this.field7694] = arg1;
        ++field7531;
        this.method3102((byte) 127);
        if (arg0 != 30604) {
            this.field7692 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "()Z")
    public final boolean method379() {
        ++field7502;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "(I)V")
    public final void method3141(int arg0) {
        if (~this.field7739 != -9) {
            this.method3137((byte) -40);
            this.method3132(true, true);
            this.method3129((byte) -121, true);
            this.method3083(true, false);
            this.method3123(1, 1);
            this.field7739 = 8;
        }
        if (arg0 == 8) {
            ++field7572;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)Lxa;")
    public final class511 method364(int arg0, int arg1, boolean arg2) {
        ++field7567;
        return new class380(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(II)V")
    public final void method3142(int arg0, int arg1) {
        int var3 = -77 / ((arg1 - -59) / 40);
        ++field7490;
        if (~this.field7752 != ~arg0) {
            this.field7752 = arg0;
            this.method191((byte) 123);
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "()Z")
    public final boolean method338() {
        ++field7629;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILej;I)V")
    public final void method3143(int arg0, class694 arg1, int arg2) {
        if (arg0 != 4) {
            this.method3073(102);
        }
        ++field7545;
        this.method228(false, false, arg2, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(ZZ)Lui;")
    public abstract class498 method186(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(ZI)V")
    public final void method3144(boolean arg0, int arg1) {
        ++field7519;
        if (arg0 == !this.field7711) {
            this.field7711 = arg0;
            this.method190(77);
        }
        if (arg1 != -2) {
            this.method3083(false, false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lba;Lqu;Lq;Lht;I)V")
    public final void method365(class107 arg0, class282 arg1, class151 arg2, class108 arg3, int arg4) {
        ++field7658;
        arg0.method827(arg2, arg3, arg4);
        this.method326(arg1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public final void method332(boolean arg0) {
        ++field7520;
    }

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "(Z)V")
    private final void method3145(boolean arg0) {
        ++field7534;
        this.field7714 = (float) (-this.field7744 + this.field7695);
        this.field7707 = (float) (-this.field7730 + this.field7770);
        this.field7715 = (float) (-this.field7744 + this.field7769);
        this.field7718 = (float) (-this.field7730 + this.field7686);
        if (arg0) {
            this.method212(-105);
        }
    }

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "()Z")
    public final boolean method380() {
        ++field7537;
        return true;
    }
}
