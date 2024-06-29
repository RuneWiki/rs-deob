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

@OriginalClass("client!um")
public abstract class class528 extends class98 {

    @OriginalMember(owner = "client!um", name = "M", descriptor = "Ldc;")
    private class302 field7513 = new class302();

    @OriginalMember(owner = "client!um", name = "od", descriptor = "Z")
    public boolean field7645 = true;

    @OriginalMember(owner = "client!um", name = "td", descriptor = "Lica;")
    public class300 field7650 = new class300();

    @OriginalMember(owner = "client!um", name = "Td", descriptor = "Lica;")
    public class300 field7676 = new class300();

    @OriginalMember(owner = "client!um", name = "Vd", descriptor = "Lica;")
    public class300 field7678 = new class300();

    @OriginalMember(owner = "client!um", name = "Wd", descriptor = "Lica;")
    public class300 field7679 = new class300();

    @OriginalMember(owner = "client!um", name = "Xd", descriptor = "Lica;")
    private class300 field7680 = new class300();

    @OriginalMember(owner = "client!um", name = "Yd", descriptor = "Lica;")
    private class300 field7681 = new class300();

    @OriginalMember(owner = "client!um", name = "be", descriptor = "I")
    private int field7684 = 16777215;

    @OriginalMember(owner = "client!um", name = "me", descriptor = "F")
    public float field7695 = 3584.0F;

    @OriginalMember(owner = "client!um", name = "te", descriptor = "Loba;")
    public class324 field7702 = class401.field6037;

    @OriginalMember(owner = "client!um", name = "re", descriptor = "I")
    public int field7700 = 0;

    @OriginalMember(owner = "client!um", name = "Ce", descriptor = "[F")
    private float[] field7711 = new float[16];

    @OriginalMember(owner = "client!um", name = "qe", descriptor = "I")
    public int field7699 = 0;

    @OriginalMember(owner = "client!um", name = "ae", descriptor = "Z")
    public boolean field7683 = true;

    @OriginalMember(owner = "client!um", name = "Ge", descriptor = "F")
    private float field7715 = 1.0F;

    @OriginalMember(owner = "client!um", name = "We", descriptor = "I")
    public int field7731 = 3584;

    @OriginalMember(owner = "client!um", name = "He", descriptor = "Z")
    public boolean field7716 = false;

    @OriginalMember(owner = "client!um", name = "Ye", descriptor = "I")
    public int field7733 = -1;

    @OriginalMember(owner = "client!um", name = "mf", descriptor = "I")
    public int field7746 = 0;

    @OriginalMember(owner = "client!um", name = "de", descriptor = "I")
    public int field7686 = 512;

    @OriginalMember(owner = "client!um", name = "Ue", descriptor = "I")
    private int field7729 = 0;

    @OriginalMember(owner = "client!um", name = "Ee", descriptor = "Lvs;")
    public class476 field7713 = class378.field5670;

    @OriginalMember(owner = "client!um", name = "oe", descriptor = "I")
    public int field7697 = 512;

    @OriginalMember(owner = "client!um", name = "ve", descriptor = "Z")
    public boolean field7704 = true;

    @OriginalMember(owner = "client!um", name = "Oe", descriptor = "Z")
    public boolean field7723 = true;

    @OriginalMember(owner = "client!um", name = "Zd", descriptor = "Z")
    private boolean field7682 = false;

    @OriginalMember(owner = "client!um", name = "xe", descriptor = "Z")
    private boolean field7706 = false;

    @OriginalMember(owner = "client!um", name = "Qe", descriptor = "I")
    private int field7725 = -1;

    @OriginalMember(owner = "client!um", name = "Te", descriptor = "I")
    private int field7728 = 0;

    @OriginalMember(owner = "client!um", name = "df", descriptor = "I")
    public int field7738 = 50;

    @OriginalMember(owner = "client!um", name = "Je", descriptor = "Z")
    private boolean field7718 = false;

    @OriginalMember(owner = "client!um", name = "cf", descriptor = "F")
    public float field7737 = 1.0F;

    @OriginalMember(owner = "client!um", name = "pe", descriptor = "I")
    public int field7698 = 128;

    @OriginalMember(owner = "client!um", name = "zf", descriptor = "I")
    public int field7759 = 0;

    @OriginalMember(owner = "client!um", name = "Fe", descriptor = "Z")
    private boolean field7714 = false;

    @OriginalMember(owner = "client!um", name = "Se", descriptor = "[Lwc;")
    private class353[] field7727 = new class353[10];

    @OriginalMember(owner = "client!um", name = "xf", descriptor = "I")
    public int field7757 = 0;

    @OriginalMember(owner = "client!um", name = "Ie", descriptor = "[F")
    private float[] field7717 = new float[16];

    @OriginalMember(owner = "client!um", name = "gf", descriptor = "F")
    public float field7741 = -1.0F;

    @OriginalMember(owner = "client!um", name = "yf", descriptor = "I")
    public int field7758 = 0;

    @OriginalMember(owner = "client!um", name = "Ff", descriptor = "[F")
    private float[] field7765 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!um", name = "Bf", descriptor = "Z")
    private boolean field7761 = false;

    @OriginalMember(owner = "client!um", name = "ge", descriptor = "F")
    public float field7689 = 3584.0F;

    @OriginalMember(owner = "client!um", name = "Ze", descriptor = "F")
    public float field7734 = 1.0F;

    @OriginalMember(owner = "client!um", name = "qf", descriptor = "I")
    public int field7750 = 0;

    @OriginalMember(owner = "client!um", name = "Lf", descriptor = "Z")
    public boolean field7771 = true;

    @OriginalMember(owner = "client!um", name = "ze", descriptor = "I")
    private int field7708 = 0;

    @OriginalMember(owner = "client!um", name = "rf", descriptor = "[F")
    private float[] field7751 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!um", name = "vf", descriptor = "I")
    public int field7755 = 0;

    @OriginalMember(owner = "client!um", name = "uf", descriptor = "I")
    private int field7754 = 0;

    @OriginalMember(owner = "client!um", name = "se", descriptor = "Z")
    public boolean field7701 = false;

    @OriginalMember(owner = "client!um", name = "Cf", descriptor = "I")
    private int field7762 = -1;

    @OriginalMember(owner = "client!um", name = "nf", descriptor = "[F")
    public float[] field7747 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!um", name = "Mf", descriptor = "F")
    public float field7772 = -1.0F;

    @OriginalMember(owner = "client!um", name = "Pf", descriptor = "I")
    private int field7775 = 1;

    @OriginalMember(owner = "client!um", name = "jf", descriptor = "Z")
    public boolean field7743 = true;

    @OriginalMember(owner = "client!um", name = "Qf", descriptor = "F")
    public float field7776 = 1.0F;

    @OriginalMember(owner = "client!um", name = "If", descriptor = "[F")
    public float[] field7768 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!um", name = "ef", descriptor = "I")
    public int field7739 = 8;

    @OriginalMember(owner = "client!um", name = "Df", descriptor = "I")
    public int field7763 = 0;

    @OriginalMember(owner = "client!um", name = "ke", descriptor = "Z")
    public boolean field7693 = false;

    @OriginalMember(owner = "client!um", name = "Pe", descriptor = "I")
    private int field7724 = -1;

    @OriginalMember(owner = "client!um", name = "Tf", descriptor = "Z")
    public boolean field7779 = false;

    @OriginalMember(owner = "client!um", name = "Hf", descriptor = "I")
    public int field7767 = 3;

    @OriginalMember(owner = "client!um", name = "Ae", descriptor = "[F")
    private float[] field7709 = new float[16];

    @OriginalMember(owner = "client!um", name = "Gf", descriptor = "Z")
    private boolean field7766 = false;

    @OriginalMember(owner = "client!um", name = "Rf", descriptor = "F")
    public float field7777 = 1.0F;

    @OriginalMember(owner = "client!um", name = "Uf", descriptor = "[F")
    private float[] field7780 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!um", name = "af", descriptor = "[F")
    public float[] field7735 = this.field7780;

    @OriginalMember(owner = "client!um", name = "Vf", descriptor = "I")
    public int field7781 = 0;

    @OriginalMember(owner = "client!um", name = "Wf", descriptor = "I")
    public int field7782 = -1;

    @OriginalMember(owner = "client!um", name = "bf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7736 = new Stream();

    @OriginalMember(owner = "client!um", name = "og", descriptor = "Lica;")
    private class300 field7800 = new class300();

    @OriginalMember(owner = "client!um", name = "Ab", descriptor = "Ljava/lang/Object;")
    public Object field7553;

    @OriginalMember(owner = "client!um", name = "zc", descriptor = "Ljava/lang/Object;")
    private Object field7604;

    @OriginalMember(owner = "client!um", name = "Ke", descriptor = "I")
    public int field7719;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7493;

    @OriginalMember(owner = "client!um", name = "rb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7544;

    @OriginalMember(owner = "client!um", name = "Zc", descriptor = "Lmv;")
    public class295 field7630;

    @OriginalMember(owner = "client!um", name = "Wc", descriptor = "I")
    private int field7627;

    @OriginalMember(owner = "client!um", name = "Rb", descriptor = "I")
    public int field7570;

    @OriginalMember(owner = "client!um", name = "Ic", descriptor = "I")
    private int field7613;

    @OriginalMember(owner = "client!um", name = "ec", descriptor = "I")
    public int field7583;

    @OriginalMember(owner = "client!um", name = "Ef", descriptor = "I")
    public int field7764;

    @OriginalMember(owner = "client!um", name = "ff", descriptor = "Luh;")
    private class141 field7740;

    @OriginalMember(owner = "client!um", name = "jc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field7588;

    @OriginalMember(owner = "client!um", name = "xc", descriptor = "F")
    public static float field7602 = 1024.0F;

    @OriginalMember(owner = "client!um", name = "ie", descriptor = "F")
    public float field7691;

    @OriginalMember(owner = "client!um", name = "je", descriptor = "F")
    public float field7692;

    @OriginalMember(owner = "client!um", name = "ue", descriptor = "F")
    public float field7703;

    @OriginalMember(owner = "client!um", name = "ye", descriptor = "F")
    private float field7707;

    @OriginalMember(owner = "client!um", name = "Be", descriptor = "F")
    private float field7710;

    @OriginalMember(owner = "client!um", name = "Le", descriptor = "F")
    public float field7720;

    @OriginalMember(owner = "client!um", name = "Af", descriptor = "F")
    public float field7760;

    @OriginalMember(owner = "client!um", name = "Sf", descriptor = "F")
    public float field7778;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!um", name = "V", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!um", name = "X", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!um", name = "Y", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!um", name = "Z", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!um", name = "ab", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!um", name = "bb", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!um", name = "cb", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!um", name = "db", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!um", name = "eb", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!um", name = "fb", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!um", name = "hb", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!um", name = "ib", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!um", name = "jb", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!um", name = "kb", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!um", name = "lb", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!um", name = "mb", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!um", name = "nb", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!um", name = "ob", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!um", name = "pb", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!um", name = "qb", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!um", name = "tb", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!um", name = "ub", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!um", name = "vb", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!um", name = "wb", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!um", name = "xb", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!um", name = "yb", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!um", name = "zb", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!um", name = "Bb", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!um", name = "Cb", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!um", name = "Db", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!um", name = "Eb", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!um", name = "Fb", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!um", name = "Gb", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!um", name = "Hb", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!um", name = "Jb", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!um", name = "Kb", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!um", name = "Mb", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!um", name = "Nb", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!um", name = "Ob", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!um", name = "Pb", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!um", name = "Qb", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!um", name = "Sb", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!um", name = "Tb", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!um", name = "Ub", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!um", name = "Vb", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!um", name = "Wb", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!um", name = "Xb", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!um", name = "Yb", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!um", name = "Zb", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!um", name = "ac", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!um", name = "bc", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!um", name = "cc", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!um", name = "dc", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!um", name = "fc", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!um", name = "gc", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!um", name = "hc", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!um", name = "ic", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!um", name = "kc", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!um", name = "lc", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!um", name = "mc", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!um", name = "nc", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!um", name = "oc", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!um", name = "pc", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!um", name = "qc", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!um", name = "rc", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!um", name = "sc", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!um", name = "tc", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!um", name = "uc", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!um", name = "vc", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!um", name = "wc", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!um", name = "yc", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!um", name = "Ac", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!um", name = "Bc", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!um", name = "Cc", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!um", name = "Dc", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!um", name = "Ec", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!um", name = "Fc", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!um", name = "Gc", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!um", name = "Hc", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!um", name = "Kc", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!um", name = "Lc", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!um", name = "Mc", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!um", name = "Nc", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!um", name = "Oc", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!um", name = "Pc", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!um", name = "Qc", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!um", name = "Rc", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!um", name = "Sc", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!um", name = "Tc", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!um", name = "Uc", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!um", name = "Vc", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!um", name = "Xc", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!um", name = "Yc", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!um", name = "ad", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!um", name = "bd", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!um", name = "cd", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!um", name = "dd", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!um", name = "ed", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!um", name = "fd", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!um", name = "gd", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!um", name = "hd", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!um", name = "id", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!um", name = "jd", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!um", name = "kd", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!um", name = "ld", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!um", name = "md", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!um", name = "nd", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!um", name = "pd", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!um", name = "qd", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!um", name = "rd", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!um", name = "sd", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!um", name = "ud", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!um", name = "vd", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!um", name = "wd", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!um", name = "xd", descriptor = "I")
    public int field7654;

    @OriginalMember(owner = "client!um", name = "yd", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!um", name = "zd", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!um", name = "Ad", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!um", name = "Bd", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!um", name = "Cd", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!um", name = "Dd", descriptor = "I")
    public int field7660;

    @OriginalMember(owner = "client!um", name = "Ed", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!um", name = "Fd", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!um", name = "Gd", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!um", name = "Hd", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!um", name = "Jd", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!um", name = "Kd", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!um", name = "Ld", descriptor = "I")
    public int field7668;

    @OriginalMember(owner = "client!um", name = "Md", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!um", name = "Nd", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!um", name = "Od", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!um", name = "Pd", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!um", name = "Qd", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!um", name = "Rd", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!um", name = "Sd", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!um", name = "Ud", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!um", name = "ce", descriptor = "I")
    public int field7685;

    @OriginalMember(owner = "client!um", name = "ne", descriptor = "I")
    public int field7696;

    @OriginalMember(owner = "client!um", name = "De", descriptor = "I")
    public int field7712;

    @OriginalMember(owner = "client!um", name = "Ne", descriptor = "I")
    public int field7722;

    @OriginalMember(owner = "client!um", name = "Ve", descriptor = "I")
    public int field7730;

    @OriginalMember(owner = "client!um", name = "lf", descriptor = "I")
    public int field7745;

    @OriginalMember(owner = "client!um", name = "of", descriptor = "I")
    public int field7748;

    @OriginalMember(owner = "client!um", name = "pf", descriptor = "I")
    private int field7749;

    @OriginalMember(owner = "client!um", name = "tf", descriptor = "I")
    public int field7753;

    @OriginalMember(owner = "client!um", name = "Kf", descriptor = "I")
    private int field7770;

    @OriginalMember(owner = "client!um", name = "rg", descriptor = "I")
    private int field7803;

    @OriginalMember(owner = "client!um", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!um", name = "ag", descriptor = "Lega;")
    private class184 field7786;

    @OriginalMember(owner = "client!um", name = "mg", descriptor = "Lega;")
    private class184 field7798;

    @OriginalMember(owner = "client!um", name = "Xe", descriptor = "Lpi;")
    private class301 field7732;

    @OriginalMember(owner = "client!um", name = "cg", descriptor = "Lcl;")
    public class314 field7788;

    @OriginalMember(owner = "client!um", name = "fg", descriptor = "Lcl;")
    public class314 field7791;

    @OriginalMember(owner = "client!um", name = "lg", descriptor = "Lcl;")
    private class314 field7797;

    @OriginalMember(owner = "client!um", name = "ng", descriptor = "Lcl;")
    public class314 field7799;

    @OriginalMember(owner = "client!um", name = "pg", descriptor = "Lcl;")
    public class314 field7801;

    @OriginalMember(owner = "client!um", name = "qg", descriptor = "Lcl;")
    private class314 field7802;

    @OriginalMember(owner = "client!um", name = "Nf", descriptor = "Lwc;")
    private class353 field7773;

    @OriginalMember(owner = "client!um", name = "Xf", descriptor = "Lde;")
    public class375 field7783;

    @OriginalMember(owner = "client!um", name = "Yf", descriptor = "Lde;")
    public class375 field7784;

    @OriginalMember(owner = "client!um", name = "Zf", descriptor = "Lde;")
    public class375 field7785;

    @OriginalMember(owner = "client!um", name = "bg", descriptor = "Lde;")
    public class375 field7787;

    @OriginalMember(owner = "client!um", name = "dg", descriptor = "Lde;")
    public class375 field7789;

    @OriginalMember(owner = "client!um", name = "eg", descriptor = "Lde;")
    public class375 field7790;

    @OriginalMember(owner = "client!um", name = "hg", descriptor = "Lde;")
    public class375 field7793;

    @OriginalMember(owner = "client!um", name = "ig", descriptor = "Lde;")
    public class375 field7794;

    @OriginalMember(owner = "client!um", name = "jg", descriptor = "Lde;")
    public class375 field7795;

    @OriginalMember(owner = "client!um", name = "kg", descriptor = "Lde;")
    public class375 field7796;

    @OriginalMember(owner = "client!um", name = "Ib", descriptor = "Lgb;")
    public class465 field7561;

    @OriginalMember(owner = "client!um", name = "gg", descriptor = "Lip;")
    private class532 field7792;

    @OriginalMember(owner = "client!um", name = "fe", descriptor = "Lhe;")
    private class551 field7688;

    @OriginalMember(owner = "client!um", name = "Id", descriptor = "Lut;")
    public static class616 field7665;

    @OriginalMember(owner = "client!um", name = "sf", descriptor = "Lqda;")
    public class689 field7752;

    @OriginalMember(owner = "client!um", name = "gb", descriptor = "Lr;")
    public static class98 field7533;

    @OriginalMember(owner = "client!um", name = "Lb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7564;

    @OriginalMember(owner = "client!um", name = "Jc", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field7614;

    @OriginalMember(owner = "client!um", name = "sb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7545;

    @OriginalMember(owner = "client!um", name = "we", descriptor = "Z")
    public boolean field7705;

    @OriginalMember(owner = "client!um", name = "Me", descriptor = "Z")
    public boolean field7721;

    @OriginalMember(owner = "client!um", name = "wf", descriptor = "Z")
    public boolean field7756;

    @OriginalMember(owner = "client!um", name = "Jf", descriptor = "Z")
    public boolean field7769;

    @OriginalMember(owner = "client!um", name = "Of", descriptor = "Z")
    public boolean field7774;

    @OriginalMember(owner = "client!um", name = "sg", descriptor = "Z")
    public boolean field7804;

    @OriginalMember(owner = "client!um", name = "hf", descriptor = "[Lica;")
    public class300[] field7742;

    @OriginalMember(owner = "client!um", name = "ee", descriptor = "[Ltg;")
    public class334[] field7687;

    @OriginalMember(owner = "client!um", name = "Re", descriptor = "[Lnw;")
    public class619[] field7726;

    @OriginalMember(owner = "client!um", name = "kf", descriptor = "[Lnw;")
    public class619[] field7744;

    @OriginalMember(owner = "client!um", name = "he", descriptor = "[Lqda;")
    private class689[] field7690;

    @OriginalMember(owner = "client!um", name = "le", descriptor = "[Lvf;")
    public class87[] field7694;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V", line = 4)
    public final void method2989(byte arg0) {
        if (arg0 != -18) {
            this.method692(-121, -2, -96, -65);
        }
        ++field7675;
        this.field7645 = false;
        this.method3064(0);
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V", line = 18)
    private final void method2990(byte arg0) {
        ++field7674;
        this.field7714 = false;
        this.method3012((byte) -24);
        if (arg0 >= -72) {
            this.method3002(107);
        }
        if (class302.field4477 == this.field7702) {
            this.method3044(true);
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Lmv;II)V", line = 35)
    public class528(Canvas arg0, Object arg1, class615 arg2, class295 arg3, int arg4, int arg5) {
        super(arg2);
        this.field7604 = this.field7553 = arg1;
        this.field7719 = arg4;
        this.field7544 = this.field7493 = arg0;
        this.field7630 = arg3;
        Dimension var7 = arg0.getSize();
        this.field7570 = this.field7627 = var7.height;
        this.field7583 = this.field7613 = var7.width;
        this.field7764 = arg5;
        class530.method3075(true, (byte) -68, false);
        if (super.field1491 != null) {
            this.field7740 = new class141(this, super.field1491);
            this.field7588 = new NativeInterface(super.field1491.method954(-25203), this.field7764);
            for (int var8 = 0; ~var8 > ~super.field1491.method954(-25203); ++var8) {
                class457 var9 = super.field1491.method955(-1330, var8);
                if (var9 != null) {
                    this.field7588.initTextureMetrics(var8, var9.field6603, var9.field6611);
                }
            }
        } else {
            this.field7588 = new NativeInterface(0, this.field7764);
            this.field7740 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Luo;I)V", line = 80)
    public final void method708(class620 arg0, int arg1) {
        this.field7732.method1889(arg1, this, 2, arg0);
        ++field7549;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lfo;[Lut;Z)Lla;", line = 88)
    public final class393 method684(class606 arg0, class616[] arg1, boolean arg2) {
        ++field7587;
        return new class664(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 100)
    public final void method613(Canvas arg0) {
        ++field7673;
        if (this.field7493 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7545.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method772(arg0, (byte) 107);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field7545.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V", line = 139)
    public final void method2991(boolean arg0, byte arg1) {
        if (arg1 < 86) {
            this.method620(-99, 60, -95, (int[]) null);
        }
        ++field7562;
        if (!this.field7701 == arg0) {
            this.field7701 = arg0;
            this.method799(0);
            this.field7770 &= -32;
        }
    }

    @OriginalMember(owner = "client!um", name = "da", descriptor = "(IIII)V", line = 158)
    public final void method652(int arg0, int arg1, int arg2, int arg3) {
        ++field7494;
        if (~arg0 >= -1 && ~arg2 <= ~(this.field7583 - 1) && arg1 <= 0 && ~(this.field7570 + -1) >= ~arg3) {
            this.method699();
        } else {
            this.field7758 = ~arg0 <= -1 ? arg0 : 0;
            this.field7781 = arg1 < 0 ? 0 : arg1;
            this.field7700 = ~arg3 >= ~this.field7583 ? arg3 : 0;
            this.field7755 = arg2 > this.field7583 ? 0 : arg2;
            if (!this.field7804) {
                this.field7804 = true;
                this.method760((byte) -3);
            }
            this.method786(28149);
            this.method3018(0);
        }
    }

    @OriginalMember(owner = "client!um", name = "BA", descriptor = "()I", line = 183)
    public final int method668() {
        ++field7541;
        return this.field7738;
    }

    @OriginalMember(owner = "client!um", name = "V", descriptor = "(IIII)V", line = 191)
    public final void method692(int arg0, int arg1, int arg2, int arg3) {
        ++field7556;
        boolean var5 = false;
        if (arg0 > this.field7758) {
            this.field7758 = arg0;
            var5 = true;
        }
        if (this.field7755 > arg2) {
            var5 = true;
            this.field7755 = arg2;
        }
        if (arg1 > this.field7781) {
            this.field7781 = arg1;
            var5 = true;
        }
        if (this.field7700 > arg3) {
            var5 = true;
            this.field7700 = arg3;
        }
        if (var5) {
            if (!this.field7804) {
                this.field7804 = true;
                this.method760((byte) -3);
            }
            this.method786(28149);
            this.method3018(0);
        }
    }

    @OriginalMember(owner = "client!um", name = "J", descriptor = "(IIIIII)V", line = 240)
    public final void method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7655;
        this.method3041((byte) -37);
        this.method3028(arg4, false);
        this.method3025(class475.field6812, -1, 0);
        this.method3019(0, 0, class475.field6812);
        this.method3068(124, arg5);
        this.field7650.method1867((float) arg2, 1.0F, (float) arg3, -97);
        this.field7650.method893(arg0, arg1, 0);
        this.method2989((byte) -18);
        this.method767(1, false);
        this.method2995((byte) 122);
        this.method767(1, true);
        this.method3019(0, 0, class283.field3777);
        this.method3025(class283.field3777, -1, 0);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(Z)V", line = 260)
    public static final void method2992(boolean arg0) {
        ++field7523;
        if (!arg0) {
            class66.field1043.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!um", name = "JA", descriptor = "()V", line = 275)
    public final void method699() {
        ++field7651;
        this.field7700 = this.field7570;
        this.field7755 = this.field7583;
        this.field7781 = 0;
        this.field7758 = 0;
        if (this.field7804) {
            this.field7804 = false;
            this.method760((byte) -3);
        }
        this.method3018(0);
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)V", line = 294)
    public final void method2993(int arg0) {
        if (this.field7770 != arg0) {
            this.method3055((byte) -4);
            this.method3069(5796, true);
            this.method2991(true, (byte) 105);
            this.method3056(true, (byte) 115);
            this.method3068(123, 1);
            this.field7770 = 8;
        }
        ++field7643;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lut;Z)Lf;", line = 315)
    public final class256 method660(class616 arg0, boolean arg1) {
        ++field7577;
        class256 var9;
        if (arg0.field8869 != 0 && arg0.field8868 != 0) {
            int[] var3 = new int[arg0.field8869 * arg0.field8868];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field8875 != null) {
                for (int var6 = 0; arg0.field8868 > var6; ++var6) {
                    for (int var7 = 0; ~arg0.field8869 < ~var7; ++var7) {
                        var3[var5++] = class151.method1076(arg0.field8873[class425.method2563(arg0.field8871[var4], 255)], arg0.field8875[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~var8 > ~arg0.field8868; ++var8) {
                    for (int var10 = 0; ~var10 > ~arg0.field8869; ++var10) {
                        int var11 = arg0.field8873[arg0.field8871[var4++] & 255];
                        var3[var5++] = ~var11 == -1 ? 0 : class151.method1076(-16777216, var11);
                    }
                }
            }
            var9 = this.method704(var3, 0, arg0.field8869, arg0.field8869, arg0.field8868);
        } else {
            var9 = this.method704(new int[1], 0, 1, 1, 1);
        }
        var9.method58(arg0.field8870, arg0.field8874, arg0.field8872, arg0.field8867);
        return var9;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(IZ)V", line = 383)
    public final void method2994(int arg0, boolean arg1) {
        ++field7547;
        if (arg0 != 0) {
            this.method794((class106) null, -81, (class149) null);
        }
        if (!this.field7693 != !arg1) {
            this.field7693 = arg1;
            this.method808((byte) 78);
            this.field7770 &= -8;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Luo;)V", line = 401)
    public final void method679(class620 arg0) {
        ++field7625;
        this.field7732.method1889(-1, this, 2, arg0);
    }

    @OriginalMember(owner = "client!um", name = "j", descriptor = "()Z", line = 410)
    public final boolean method654() {
        ++field7642;
        return false;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()I", line = 420)
    public final int method615() {
        ++field7526;
        return this.field7668 + this.field7660 + this.field7654;
    }

    @OriginalMember(owner = "client!um", name = "XA", descriptor = "(IIIII)V", line = 428)
    public final void method691(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7629;
        this.method609(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()Z", line = 436)
    public final boolean method624() {
        ++field7663;
        return false;
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(B)V", line = 446)
    public final void method2995(byte arg0) {
        this.method3015(class223.field2949, 1, 2);
        ++field7548;
        if (arg0 < 104) {
            this.method718(30, 89, -34);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;", line = 457)
    public final NativeHeapBuffer method2996(boolean arg0, int arg1, int arg2) {
        ++field7565;
        if (arg2 < 11) {
            this.method760((byte) 46);
        }
        return this.field7564.method2073(arg1, arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()Z", line = 473)
    public final boolean method618() {
        ++field7552;
        return true;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)V", line = 482)
    public final void method2997(byte arg0, int arg1) {
        if (arg1 != 22016) {
            this.method672((Canvas) null);
        }
        this.method3028(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0, false);
        ++field7595;
    }

    @OriginalMember(owner = "client!um", name = "l", descriptor = "()V", line = 493)
    public final void method656() {
        ++field7559;
        if (this.field7740 != null) {
            this.field7740.method993(false);
        }
    }

    @OriginalMember(owner = "client!um", name = "la", descriptor = "(IIII)V", line = 505)
    public final void method667(int arg0, int arg1, int arg2, int arg3) {
        this.field7757 = arg1;
        ++field7550;
        this.field7686 = arg2;
        this.field7697 = arg3;
        this.field7763 = arg0;
        this.method3046(-3983);
        this.method2990((byte) -102);
        this.method3005(13);
        this.method3018(0);
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(Z)Lica;", line = 521)
    public final class300 method2998(boolean arg0) {
        if (arg0) {
            this.method691(14, -98, 63, 87, 118);
        }
        ++field7539;
        return this.field7679;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(Z)Lap;", line = 532)
    public final class447 method2999(boolean arg0) {
        ++field7590;
        if (!arg0) {
            return null;
        } else {
            return this.field7688 == null ? null : this.field7688.method996(118);
        }
    }

    @OriginalMember(owner = "client!um", name = "YA", descriptor = "(IIII)V", line = 545)
    public final void method657(int arg0, int arg1, int arg2, int arg3) {
        ++field7633;
        if (!this.field7756) {
            throw new RuntimeException("");
        } else {
            this.field7749 = arg0;
            this.field7725 = arg1;
            this.field7729 = arg3;
            this.field7724 = arg2;
            if (this.field7718) {
                this.field7727[3].method1396(1);
                this.field7727[3].method1395(true);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V", line = 581)
    public final void method665(int arg0) {
        ++field7582;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 588)
    public final class682 method677(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7596;
        return new class351(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([IIIII)Lf;", line = 596)
    public final class256 method704(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7631;
        return new class8(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!um", name = "j", descriptor = "(B)I", line = 608)
    public final int method3000(byte arg0) {
        if (arg0 < 86) {
            return 112;
        } else {
            ++field7621;
            return this.field7759;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIII)V", line = 626)
    public final void method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7641;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method3051(0.0F, 0.0F, 41, (float) arg3 + var8, (float) arg0, (float) arg2 + var9, (float) arg1)) {
            this.method3041((byte) -37);
            this.method3028(arg4, false);
            this.method3025(class475.field6812, -1, 0);
            this.method3019(0, 0, class475.field6812);
            this.method3068(123, arg5);
            this.method3065(0);
            this.method767(1, false);
            this.method3034(-112);
            this.method767(1, true);
            this.method3019(0, 0, class283.field3777);
            this.method3025(class283.field3777, -1, 0);
        }
    }

    @OriginalMember(owner = "client!um", name = "j", descriptor = "(I)V", line = 663)
    private final void method3001(int arg0) {
        this.field7706 = false;
        ++field7648;
        if (class175.field2452 == this.field7702) {
            this.method3029(0);
            this.method3044(true);
        }
        int var2 = 70 % ((-40 - arg0) / 50);
    }

    @OriginalMember(owner = "client!um", name = "k", descriptor = "(I)V", line = 680)
    private final void method3002(int arg0) {
        ++field7527;
        if (class175.field2452 != this.field7702) {
            class324 var2 = this.field7702;
            this.field7702 = class175.field2452;
            if (var2.method2007(-51)) {
                this.method3026(0);
            }
            this.method3029(0);
            this.field7735 = this.field7711;
            this.method3044(true);
            this.field7770 &= -25;
        }
        if (arg0 >= -88) {
            this.field7688 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 706)
    public final void method641(Canvas arg0) {
        ++field7538;
        Object var2 = null;
        if (arg0 != null && this.field7493 != arg0) {
            if (this.field7545.containsKey(arg0)) {
                var2 = this.field7545.get(arg0);
            }
        } else {
            var2 = this.field7604;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method809(arg0, 8, var2);
            if (this.field7544 == arg0) {
                this.method3061(1);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V", line = 739)
    public final void method640(int arg0) {
        ++field7504;
    }

    @OriginalMember(owner = "client!um", name = "IA", descriptor = "(IIIIII[BII)V", line = 746)
    public final void method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7605;
    }

    @OriginalMember(owner = "client!um", name = "m", descriptor = "(I)V", line = 753)
    public final void method3003(int arg0) {
        ++field7584;
        if (this.field7694[this.field7759] != class42.field619) {
            this.field7694[this.field7759] = class42.field619;
            this.field7742[this.field7759].method890();
            this.method3031((byte) 125);
        }
        if (arg0 != 1) {
            this.method3048((byte) -78, true);
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(II)I", line = 775)
    public final int method706(int arg0, int arg1) {
        ++field7646;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!um", name = "o", descriptor = "(I)Lica;", line = 783)
    public final class300 method3004(int arg0) {
        ++field7530;
        if (arg0 <= 123) {
            return null;
        } else {
            if (!this.field7766) {
                this.field7681.method1872(this.field7679, this.field7650);
                this.field7766 = true;
            }
            return this.field7681;
        }
    }

    @OriginalMember(owner = "client!um", name = "p", descriptor = "(I)V", line = 802)
    public final void method3005(int arg0) {
        if (class401.field6037 != this.field7702) {
            class324 var2 = this.field7702;
            this.field7702 = class401.field6037;
            if (var2.method2007(-109)) {
                this.method3026(0);
            }
            this.field7770 &= -32;
            this.field7735 = this.field7780;
        }
        ++field7628;
        if (arg0 != 13) {
            this.method684((class606) null, (class616[]) null, true);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILica;)V", line = 827)
    public final void method3006(int arg0, class300 arg1) {
        int var3 = -40 / ((-31 - arg0) / 46);
        this.field7650.method887(arg1);
        ++field7575;
        this.field7645 = false;
        this.method3064(0);
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(II)Lip;", line = 841)
    public final class532 method3007(int arg0, int arg1) {
        if (~(arg0 * arg1) < ~this.field7792.method963(false)) {
            this.field7792.method984(arg1, 121);
        }
        ++field7603;
        return this.field7792;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIIII)V", line = 854)
    public final void method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7589;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III[FZLwu;)Lfj;", line = 861)
    public final class75 method3008(int arg0, int arg1, int arg2, float[] arg3, boolean arg4, class149 arg5) {
        ++field7599;
        return arg2 != 0 ? null : this.method755(arg3, arg1, arg0, 0, arg5, arg4, -1, 0);
    }

    @OriginalMember(owner = "client!um", name = "FA", descriptor = "(ILua;II)V", line = 875)
    public final void method715(int arg0, class591 arg1, int arg2, int arg3) {
        ++field7507;
        class571 var5 = (class571) arg1;
        class75 var6 = var5.field8300;
        this.method3023(0);
        this.method3011(-127, var6);
        this.method3068(124, 1);
        this.method3013(class519.field7276, 120, class519.field7276);
        this.method3025(class475.field6812, -1, 0);
        this.method3028(arg0, false);
        this.field7650.method1867((float) this.field7583, 0.0F, (float) this.field7570, -100);
        this.method2989((byte) -18);
        this.field7742[0].method1867(var6.method433(-27156, (float) this.field7583), 1.0F, var6.method429((float) this.field7570, -81), -90);
        this.field7742[0].method1870(0.0F, 0, var6.method429((float) (-arg3), -117), var6.method433(-27156, (float) (-arg2)));
        this.field7694[0] = class635.field9152;
        this.method3031((byte) 70);
        this.method2995((byte) 110);
        this.method3003(1);
        this.method3025(class283.field3777, -1, 0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([BBIZLwu;I)Lfj;", line = 901)
    public final class75 method3009(byte[] arg0, byte arg1, int arg2, boolean arg3, class149 arg4, int arg5) {
        ++field7529;
        if (arg1 != 62) {
            this.method620(61, 42, 114, (int[]) null);
        }
        return this.method805(arg0, arg4, arg3, arg5, 0, arg2, 0, 1);
    }

    @OriginalMember(owner = "client!um", name = "ZA", descriptor = "(Z)V", line = 912)
    public final void method636(boolean arg0) {
        ++field7491;
        this.field7771 = arg0;
        this.method761(2078023448);
    }

    @OriginalMember(owner = "client!um", name = "r", descriptor = "(I)V", line = 921)
    public final void method3010(int arg0) {
        this.field7694 = new class87[this.field7685];
        this.field7744 = new class619[this.field7685];
        this.field7690 = new class689[this.field7685];
        this.field7726 = new class619[this.field7685];
        ++field7617;
        this.field7742 = new class300[this.field7685];
        for (int var2 = 0; ~this.field7685 < ~var2; ++var2) {
            this.field7726[var2] = class492.field6998;
            this.field7744[var2] = class492.field6998;
            this.field7694[var2] = class42.field619;
            this.field7742[var2] = new class300();
        }
        this.field7687 = new class334[this.field7696 + -2];
        this.field7752 = this.method785(1, class564.field8245, (byte) -66, class106.field1573, 1);
        this.method648(new class103(262144));
        this.field7788 = this.method781(new class680[] { new class680(new class455[] { class455.field6559, class455.field6569 }) }, -42);
        this.field7801 = this.method781(new class680[] { new class680(new class455[] { class455.field6559, class455.field6567 }) }, -67);
        this.field7791 = this.method781(new class680[] { new class680(class455.field6559), new class680(class455.field6567), new class680(class455.field6569), new class680(class455.field6566) }, arg0 + 6245);
        this.field7799 = this.method781(new class680[] { new class680(class455.field6559), new class680(class455.field6567), new class680(class455.field6569) }, -102);
        this.field7783 = new class375(this, 0, 0, false, false);
        this.field7795 = new class375(this, 0, 0, true, true);
        this.field7794 = new class375(this, 0, 0, false, false);
        this.field7789 = new class375(this, 0, 0, true, true);
        this.field7784 = new class375(this, 0, 0, false, false);
        this.field7793 = new class375(this, 0, 0, true, true);
        this.field7796 = new class375(this, 0, 0, false, false);
        this.field7785 = new class375(this, 0, 0, true, true);
        this.field7787 = new class375(this, 0, 0, false, false);
        this.field7790 = new class375(this, 0, 0, true, true);
        this.field7732 = new class301(this);
        this.field7792 = this.method800(true, -25475);
        this.method3054(true);
        this.field7561 = new class465(this);
        this.field7727[1] = this.method753(101, 1);
        this.field7727[2] = this.method753(96, 2);
        this.field7727[4] = this.method753(-98, 4);
        this.field7727[5] = this.method753(arg0 + 6270, 5);
        this.field7727[6] = this.method753(-91, 6);
        this.field7727[7] = this.method753(-88, 7);
        this.field7727[3] = this.method753(arg0 + 6258, 3);
        if (arg0 != -6343) {
            this.field7699 = -57;
        }
        this.field7727[8] = this.method753(44, 8);
        this.field7727[9] = this.method753(95, 9);
        if (!this.field7727[2].method493((byte) -104)) {
            this.field7727[2] = this.method753(76, 0);
        }
        if (!this.field7727[4].method493((byte) -47)) {
            this.field7727[4] = this.field7727[2];
        }
        if (!this.field7727[8].method493((byte) -109)) {
            this.field7727[8] = this.field7727[4];
        }
        if (!this.field7727[9].method493((byte) -30)) {
            this.field7727[9] = this.field7727[8];
        }
        this.method770(arg0 ^ -6215);
        this.method699();
        this.method642();
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILqda;)V", line = 997)
    public final void method3011(int arg0, class689 arg1) {
        if (arg0 > -126) {
            this.method3016((byte) 105);
        }
        ++field7571;
        if (this.field7690[this.field7759] != arg1) {
            this.field7690[this.field7759] = arg1;
            if (arg1 == null) {
                this.method757(-72);
            } else {
                arg1.method1213(123);
            }
            this.field7770 &= -2;
        }
    }

    @OriginalMember(owner = "client!um", name = "x", descriptor = "()Z", line = 1019)
    public final boolean method685() {
        ++field7492;
        return true;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lak;IIII)Lda;", line = 1028)
    public final class395 method651(class677 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7606;
        return new class375(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II[I[I)Lua;", line = 1036)
    public final class591 method617(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7511;
        return class284.method1678(arg2, this, arg0, arg3, arg1, (byte) 69);
    }

    @OriginalMember(owner = "client!um", name = "k", descriptor = "(B)V", line = 1049)
    private final void method3012(byte arg0) {
        if (!this.field7714) {
            float[] var2 = this.field7717;
            float var3 = (float) (-this.field7763 * this.field7738) / (float) this.field7686;
            float var4 = (float) ((this.field7583 - this.field7763) * this.field7738) / (float) this.field7686;
            float var5 = (float) (this.field7757 * this.field7738) / (float) this.field7697;
            float var6 = (float) ((-this.field7570 + this.field7757) * this.field7738) / (float) this.field7697;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field7738 * 2.0F;
                var2[2] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = this.field7710 = (float) (this.field7738 * this.field7731) / (float) (this.field7738 - this.field7731);
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[5] = var7 / (var5 - var6);
                var2[13] = 0.0F;
                var2[15] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = -1.0F;
                var2[10] = this.field7707 = (float) this.field7731 / (float) (-this.field7731 + this.field7738);
            } else {
                var2[5] = 1.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[0] = 1.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
            }
            this.method3033(arg0 ^ 46);
            this.field7714 = true;
        }
        if (arg0 != -24) {
            this.field7746 = -125;
        }
        ++field7610;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)I", line = 1118)
    public final int method661(int arg0, int arg1) {
        ++field7543;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(IIIIZ)Lf;", line = 1126)
    public final class256 method688(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7666;
        class8 var6 = new class8(this, arg2, arg3, arg4);
        var6.method44(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!um", name = "m", descriptor = "(IIIII)V", line = 1137)
    public final void method635(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method609(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field7647;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnw;ILnw;)V", line = 1146)
    public final void method3013(class619 arg0, int arg1, class619 arg2) {
        ++field7560;
        boolean var4 = false;
        if (this.field7744[this.field7759] != arg0) {
            this.field7744[this.field7759] = arg0;
            var4 = true;
            this.method795((byte) -92);
        }
        if (arg1 > 55) {
            if (this.field7726[this.field7759] != arg2) {
                this.field7726[this.field7759] = arg2;
                var4 = true;
                this.method788(9);
            }
            if (var4) {
                this.field7770 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "s", descriptor = "(I)Lica;", line = 1180)
    public final class300 method3014(int arg0) {
        if (arg0 != -11433) {
            this.field7725 = 75;
        }
        ++field7518;
        return this.field7650;
    }

    @OriginalMember(owner = "client!um", name = "r", descriptor = "()Z", line = 1191)
    public final boolean method674() {
        ++field7611;
        return false;
    }

    @OriginalMember(owner = "client!um", name = "C", descriptor = "()Lq;", line = 1200)
    public final class151 method717() {
        ++field7635;
        return new class300();
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V", line = 1208)
    public final void method612(boolean arg0) {
        ++field7653;
    }

    @OriginalMember(owner = "client!um", name = "MA", descriptor = "(III[I)V", line = 1215)
    public final void method620(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7554;
        float var5 = this.field7676.method1876((float) arg1, (float) arg0, true, (float) arg2);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field7757;
            var7 = this.field7763;
        } else {
            var7 = (int) ((float) this.field7686 * this.field7676.method1879((float) arg2, (float) arg1, 4, (float) arg0) / var5);
            var6 = (int) ((float) this.field7697 * this.field7676.method1878((float) arg0, (float) arg1, 101, (float) arg2) / var5);
        }
        arg3[0] = (int) ((float) var7 + -this.field7691);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field7720);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(IIIIII)V", line = 1240)
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7502;
        float var7 = this.method784(128);
        this.method3041((byte) -37);
        this.method3028(arg4, false);
        this.method3025(class475.field6812, -1, 0);
        this.method3019(0, 0, class475.field6812);
        this.method3068(123, arg5);
        this.field7650.method1867((float) (arg2 + -1), 1.0F, (float) (arg3 + -1), -126);
        this.field7650.method1870(0.0F, 0, (float) arg1 - var7, (float) arg0 + -var7);
        this.method2989((byte) -18);
        this.method767(1, false);
        this.method3015(class454.field6543, 1, 4);
        this.method767(1, true);
        this.method3019(0, 0, class283.field3777);
        this.method3025(class283.field3777, -1, 0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lid;II)V", line = 1262)
    private final void method3015(class388 arg0, int arg1, int arg2) {
        ++field7671;
        if (arg1 != 1) {
            this.field7753 = -65;
        }
        this.method754(this.field7798, 0, 27910);
        this.method811(this.field7797, (byte) 124);
        this.method778(arg0, arg2, (byte) -104, 0);
    }

    @OriginalMember(owner = "client!um", name = "l", descriptor = "(B)V", line = 1278)
    private final void method3016(byte arg0) {
        ++field7623;
        this.method789(-73);
        this.method779(false);
        this.method808((byte) 127);
        this.method790(89);
        this.method787((byte) 124);
        this.method766(12);
        this.method782(0);
        int var2 = -86 % ((-26 - arg0) / 50);
        this.method799(0);
        this.method761(2078023448);
        this.method759((byte) 44);
        this.method775(false);
        this.method764(-79);
        this.method807(96);
        this.method783(false);
        for (int var3 = this.field7685 + -1; var3 >= 0; --var3) {
            this.method3050(var3, 0);
            this.method795((byte) -79);
            this.method788(9);
            this.method3003(1);
        }
        this.method776((byte) 105);
        this.method763(-81);
        this.method816((byte) -12);
        this.method798((byte) 118);
        this.method774((byte) 119);
    }

    @OriginalMember(owner = "client!um", name = "p", descriptor = "()I", line = 1320)
    public final int method669() {
        ++field7566;
        return this.field7696 - 2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([FI)[F", line = 1328)
    public final float[] method3017(float[] arg0, int arg1) {
        arg0[4] = this.field7735[1];
        arg0[0] = this.field7735[0];
        arg0[arg1] = this.field7735[2];
        ++field7656;
        arg0[12] = this.field7735[3];
        arg0[2] = this.field7735[8];
        arg0[1] = this.field7735[4];
        arg0[5] = this.field7735[5];
        arg0[13] = this.field7735[7];
        arg0[9] = this.field7735[6];
        arg0[10] = this.field7735[10];
        arg0[6] = this.field7735[9];
        arg0[14] = this.field7735[11];
        arg0[7] = this.field7735[13];
        arg0[3] = this.field7735[12];
        arg0[11] = this.field7735[14];
        arg0[15] = this.field7735[15];
        return arg0;
    }

    @OriginalMember(owner = "client!um", name = "GA", descriptor = "(II)V", line = 1354)
    public final void method675(int arg0, int arg1) {
        if (this.field7738 != arg0 || ~this.field7731 != ~arg1) {
            this.field7731 = arg1;
            this.field7738 = arg0;
            this.method2990((byte) -90);
            this.method3046(-3983);
            this.method3066(17996);
        }
        ++field7525;
    }

    @OriginalMember(owner = "client!um", name = "v", descriptor = "(I)V", line = 1381)
    private final void method3018(int arg0) {
        this.field7760 = (float) (this.field7755 - this.field7763);
        this.field7720 = (float) (-this.field7757 + this.field7781);
        if (arg0 != 0) {
            this.method708((class620) null, -110);
        }
        this.field7691 = (float) (-this.field7763 + this.field7758);
        ++field7573;
        this.field7703 = (float) (this.field7700 - this.field7757);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILpca;)V", line = 1396)
    public final void method3019(int arg0, int arg1, class529 arg2) {
        if (arg1 == 0) {
            ++field7524;
            this.method769(false, -7907, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!um", name = "AA", descriptor = "(III[I)V", line = 1409)
    public final void method629(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7563;
        float var5 = this.field7676.method1876((float) arg1, (float) arg0, true, (float) arg2);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field7757;
            var7 = this.field7763;
        } else {
            var7 = (int) ((float) this.field7686 * this.field7676.method1879((float) arg2, (float) arg1, 4, (float) arg0) / var5);
            var6 = (int) ((float) this.field7697 * this.field7676.method1878((float) arg0, (float) arg1, 107, (float) arg2) / var5);
        }
        arg3[0] = (int) ((float) var7 - this.field7691);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field7720);
    }

    @OriginalMember(owner = "client!um", name = "oa", descriptor = "([I)V", line = 1434)
    public final void method628(int[] arg0) {
        ++field7667;
        arg0[1] = this.field7781;
        arg0[0] = this.field7758;
        arg0[2] = this.field7755;
        arg0[3] = this.field7700;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZ)Lf;", line = 1446)
    public final class256 method631(int arg0, int arg1, boolean arg2) {
        ++field7581;
        return new class8(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!um", name = "w", descriptor = "(I)I", line = 1454)
    public final int method3020(int arg0) {
        ++field7540;
        return arg0 > -29 ? -53 : this.field7724;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZ)V", line = 1465)
    public final void method3021(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field7784 = null;
        }
        ++field7626;
        if (!arg1 == this.field7723) {
            this.field7723 = arg1;
            this.method782(0);
        }
    }

    @OriginalMember(owner = "client!um", name = "x", descriptor = "(I)I", line = 1481)
    public final int method3022(int arg0) {
        ++field7522;
        return arg0 < 125 ? 35 : this.field7749;
    }

    @OriginalMember(owner = "client!um", name = "y", descriptor = "(I)V", line = 1492)
    public final void method3023(int arg0) {
        if (arg0 == 0) {
            if (this.field7770 != 2) {
                this.method3002(-120);
                this.method3069(5796, false);
                this.method2994(0, false);
                this.method2991(false, (byte) 127);
                this.method3056(false, (byte) 125);
                this.method3058(false, -2, (byte) -122, false);
                this.field7770 = 2;
            }
            ++field7586;
        }
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "()Z", line = 1517)
    public final boolean method645() {
        ++field7608;
        return true;
    }

    @OriginalMember(owner = "client!um", name = "n", descriptor = "(B)V", line = 1528)
    private final void method3024(byte arg0) {
        ++field7615;
        if (class132.field1919 != this.field7702) {
            class324 var2 = this.field7702;
            this.field7702 = class132.field1919;
            if (!var2.method2007(-92)) {
                this.method3026(0);
            }
            this.method3059(false);
            this.field7735 = this.field7709;
            this.method3044(true);
            this.field7770 &= -8;
        }
        int var3 = -81 / ((arg0 - 44) / 55);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lpca;II)V", line = 1553)
    public final void method3025(class529 arg0, int arg1, int arg2) {
        this.method768(false, false, arg0, arg2, 3);
        ++field7517;
        if (arg1 != -1) {
            this.method780((class149) null, (class106) null, -31);
        }
    }

    @OriginalMember(owner = "client!um", name = "y", descriptor = "()Z", line = 1567)
    public final boolean method686() {
        ++field7657;
        return true;
    }

    @OriginalMember(owner = "client!um", name = "z", descriptor = "(I)V", line = 1576)
    private final void method3026(int arg0) {
        ++field7644;
        if (arg0 != 0) {
            this.method3042((byte) 42);
        }
        this.field7766 = false;
        if (this.field7773 != null) {
            this.field7773.method2195(-84);
        }
        this.method774((byte) 119);
    }

    @OriginalMember(owner = "client!um", name = "o", descriptor = "(B)V", line = 1593)
    private final void method3027(byte arg0) {
        if (arg0 > -64) {
            this.method2998(false);
        }
        ++field7536;
        this.field7695 = (float) this.field7731;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Le;", line = 1606)
    public final class698 method622(int arg0) {
        ++field7659;
        class103 var2 = new class103(arg0);
        this.field7513.method1909(var2, (byte) -81);
        return var2;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 1621)
    public final void method626(int arg0) {
        ++field7579;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIII)V", line = 1633)
    public final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7503;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(IZ)V", line = 1641)
    public final void method3028(int arg0, boolean arg1) {
        if (arg1) {
            this.method779(false);
        }
        ++field7593;
        if (this.field7730 != arg0) {
            this.field7730 = arg0;
            this.method776((byte) 105);
        }
    }

    @OriginalMember(owner = "client!um", name = "B", descriptor = "(I)V", line = 1668)
    private final void method3029(int arg0) {
        ++field7636;
        if (!this.field7706) {
            float[] var2 = this.field7711;
            this.field7706 = true;
            if (this.field7583 != 0 && this.field7570 != 0) {
                var2[15] = 1.0F;
                var2[0] = 2.0F / (float) this.field7583;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = -1.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[10] = 0.5F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 1.0F;
                var2[3] = 0.0F;
                var2[5] = -2.0F / (float) this.field7570;
                var2[14] = 0.5F;
            } else {
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[8] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
            }
        }
        if (arg0 != 0) {
            this.field7732 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(Z)I", line = 1726)
    public final int method3030(boolean arg0) {
        ++field7574;
        if (arg0) {
            this.field7755 = -125;
        }
        return this.field7729;
    }

    @OriginalMember(owner = "client!um", name = "p", descriptor = "(B)V", line = 1738)
    private final void method3031(byte arg0) {
        if (arg0 <= 9) {
            this.method799(-5);
        }
        this.method758(18851);
        ++field7597;
        if (this.field7773 != null) {
            this.field7773.method2196(124);
        }
    }

    @OriginalMember(owner = "client!um", name = "C", descriptor = "(I)Lica;", line = 1755)
    public final class300 method3032(int arg0) {
        if (arg0 != -30) {
            this.field7697 = 63;
        }
        ++field7510;
        return this.field7742[this.field7759];
    }

    @OriginalMember(owner = "client!um", name = "ra", descriptor = "(F)V", line = 1767)
    public final void method711(float arg0) {
        ++field7532;
        if (this.field7777 != arg0) {
            this.field7777 = arg0;
            this.field7588.setAmbient(arg0);
            this.method789(-109);
            this.method766(12);
        }
    }

    @OriginalMember(owner = "client!um", name = "v", descriptor = "()[I", line = 1788)
    public final int[] method625() {
        ++field7619;
        return new int[] { this.field7763, this.field7757, this.field7686, this.field7697 };
    }

    @OriginalMember(owner = "client!um", name = "E", descriptor = "(I)V", line = 1799)
    private final void method3033(int arg0) {
        this.field7717[10] = this.field7707;
        ++field7512;
        if (arg0 < -39) {
            this.field7717[14] = this.field7710;
            this.field7689 = (this.field7717[14] - (float) this.field7731) / this.field7717[10];
        }
    }

    @OriginalMember(owner = "client!um", name = "F", descriptor = "(I)V", line = 1814)
    private final void method3034(int arg0) {
        ++field7609;
        this.method754(this.field7786, 0, 27910);
        this.method811(this.field7802, (byte) -76);
        this.method778(class533.field7844, 1, (byte) -97, 0);
        if (arg0 >= -48) {
            this.method762((Canvas) null, true, (Object) null);
        }
    }

    @OriginalMember(owner = "client!um", name = "T", descriptor = "()I", line = 1827)
    public final int method627() {
        ++field7572;
        return this.field7803;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIBZ[I)Lfj;", line = 1837)
    public final class75 method3035(int arg0, int arg1, byte arg2, boolean arg3, int[] arg4) {
        if (arg2 != -50) {
            this.method767(108, false);
        }
        ++field7616;
        return this.method793(arg4, 0, arg1, 0, arg3, 4595, arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BF)V", line = 1848)
    public final void method3036(byte arg0, float arg1) {
        int var3 = -22 % ((arg0 - -72) / 34);
        if (this.field7715 != arg1) {
            this.field7715 = arg1;
            this.method3046(-3983);
        }
        ++field7634;
    }

    @OriginalMember(owner = "client!um", name = "A", descriptor = "()V", line = 1864)
    public void method697() {
        ++field7498;
        if (!this.field7761) {
            for (class381 var1 = this.field7513.method1904(false); var1 != null; var1 = this.field7513.method1901(110)) {
                ((class103) var1).method735(true);
            }
            Enumeration var2 = this.field7545.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method762(var3, true, this.field7545.get(var3));
            }
            class541.method3181((byte) 85, false, true);
            this.field7588.release();
            this.field7761 = true;
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(IZ)V", line = 1899)
    public final void method3037(int arg0, boolean arg1) {
        ++field7568;
        if (arg0 != 1) {
            if (~arg0 == -1) {
                this.method3013(class492.field6998, 86, class492.field6998);
            } else if (arg0 == 2) {
                this.method3013(class481.field6884, 69, class519.field7276);
            } else if (arg0 != 3) {
                if (~arg0 == -5) {
                    this.method3013(class444.field6451, 112, class444.field6451);
                }
            } else {
                this.method3013(class65.field1041, 63, class492.field6998);
            }
        } else {
            this.method3013(class519.field7276, 59, class519.field7276);
        }
        if (!arg1) {
            this.method3057(101, false);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;", line = 1930)
    public final Stream method3038(int arg0, Buffer arg1) {
        this.field7736.method2087(arg1);
        if (arg0 != -10641) {
            this.method617(-22, 52, (int[]) null, (int[]) null);
        }
        ++field7669;
        return this.field7736;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(IIIII)V", line = 1942)
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7578;
    }

    @OriginalMember(owner = "client!um", name = "r", descriptor = "(B)Lica;", line = 1951)
    public final class300 method3039(byte arg0) {
        if (arg0 >= -25) {
            return null;
        } else {
            ++field7640;
            return this.field7680;
        }
    }

    @OriginalMember(owner = "client!um", name = "H", descriptor = "(I)V", line = 1962)
    public static void method3040(int arg0) {
        field7533 = null;
        if (arg0 >= 89) {
            field7665 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "CA", descriptor = "(IIII)V", line = 1973)
    public final void method680(int arg0, int arg1, int arg2, int arg3) {
        this.field7756 = true;
        this.field7724 = arg2;
        this.field7749 = arg0;
        ++field7662;
        this.field7729 = arg3;
        this.field7725 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "I", descriptor = "(I)V", line = 1990)
    public void method770(int arg0) {
        this.method3016((byte) 84);
        ++field7622;
        if (arg0 != 128) {
            this.method697();
        }
    }

    @OriginalMember(owner = "client!um", name = "s", descriptor = "(B)V", line = 2009)
    private final void method3041(byte arg0) {
        if (arg0 == -37) {
            if (~this.field7770 != -2) {
                this.method3002(-120);
                this.method3069(arg0 + 5833, false);
                this.method2994(arg0 + 37, false);
                this.method2991(false, (byte) 121);
                this.method3056(false, (byte) 108);
                this.method3058(false, -2, (byte) -125, false);
                this.method3037(1, true);
                this.method3011(-127, this.field7752);
                this.field7770 = 1;
            }
            ++field7672;
        }
    }

    @OriginalMember(owner = "client!um", name = "t", descriptor = "(B)V", line = 2043)
    public final void method3042(byte arg0) {
        ++field7598;
        if (this.field7770 != 16) {
            this.method3024((byte) -97);
            this.method3069(5796, true);
            this.method2991(true, (byte) 103);
            this.method3056(true, (byte) 105);
            this.method3068(124, 1);
            this.field7770 = 16;
        }
        if (arg0 != -127) {
            this.method2998(true);
        }
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "()Z", line = 2064)
    public final boolean method649() {
        ++field7664;
        return this.field7727[3].method493((byte) -93);
    }

    @OriginalMember(owner = "client!um", name = "J", descriptor = "(I)V", line = 2072)
    public final void method3043(int arg0) {
        ++field7535;
        if (arg0 != 0) {
            this.method816((byte) -126);
        }
        this.method3005(13);
        this.method3044(true);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V", line = 2084)
    public void method639(int arg0) {
        if (this.field7740 != null) {
            this.field7740.method992(true);
        }
        ++field7528;
        this.field7753 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Le;)V", line = 2098)
    public final void method648(class698 arg0) {
        ++field7592;
        this.field7564 = ((class103) arg0).field1541;
        this.field7614 = this.field7564.method2073(32768, false);
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(Z)V", line = 2113)
    private final void method3044(boolean arg0) {
        this.method816((byte) -7);
        ++field7580;
        if (arg0) {
            if (this.field7773 != null) {
                this.field7773.method2192(39);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V", line = 2129)
    public final void method690(int arg0) {
        ++field7649;
        if (arg0 >= 128 && arg0 <= 1024) {
            if (this.field7740 != null) {
                this.field7740.method993(false);
            }
            this.field7698 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!um", name = "pa", descriptor = "(III)V", line = 2150)
    public final void method718(int arg0, int arg1, int arg2) {
        if (~this.field7782 != ~arg0 || this.field7733 != arg1 || ~this.field7746 != ~arg2) {
            this.field7733 = arg1;
            this.field7782 = arg0;
            this.field7746 = arg2;
            this.method3066(17996);
            this.method759((byte) 44);
        }
        ++field7557;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILvf;)V", line = 2166)
    public final void method3045(int arg0, class87 arg1) {
        ++field7501;
        this.field7694[this.field7759] = arg1;
        if (arg0 > -109) {
            this.field7689 = 0.19541782F;
        }
        this.method3031((byte) 57);
    }

    @OriginalMember(owner = "client!um", name = "K", descriptor = "(I)V", line = 2178)
    private final void method3046(int arg0) {
        this.field7682 = false;
        if (arg0 != -3983) {
            this.field7676 = null;
        }
        ++field7612;
        this.method3059(false);
        if (class132.field1919 == this.field7702) {
            this.method3044(true);
        }
    }

    @OriginalMember(owner = "client!um", name = "L", descriptor = "(I)V", line = 2194)
    private final void method3047(int arg0) {
        if (arg0 != 0) {
            this.method3059(true);
        }
        this.field7786 = this.method806(10, true);
        ++field7490;
        this.field7786.method1229(24, 12, 29812);
        this.field7802 = this.method781(new class680[] { new class680(class455.field6559) }, -110);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BZ)V", line = 2209)
    public final void method3048(byte arg0, boolean arg1) {
        if (this.field7743 == !arg1) {
            this.field7743 = arg1;
            this.method759((byte) 44);
        }
        if (arg0 != -46) {
            this.method690(-69);
        }
        ++field7500;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIF)Ltg;", line = 2230)
    public final class334 method687(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7620;
        return new class479(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(IIIIII)Lrs;", line = 2238)
    public final class649 method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7670;
        return new class142(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!um", name = "j", descriptor = "(Z)[F", line = 2246)
    public final float[] method3049(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field7677;
            return this.field7780;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2257)
    public final void method709(Canvas arg0) {
        ++field7515;
        this.field7604 = null;
        this.field7544 = null;
        if (arg0 != null && this.field7493 != arg0) {
            if (this.field7545.containsKey(arg0)) {
                this.field7604 = this.field7545.get(arg0);
                this.field7544 = arg0;
            }
        } else {
            this.field7604 = this.field7553;
            this.field7544 = this.field7493;
        }
        if (this.field7544 != null && this.field7604 != null) {
            this.method792(this.field7604, this.field7544, -6399);
            this.method3061(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!um", name = "z", descriptor = "()Z", line = 2288)
    public final boolean method694() {
        ++field7520;
        return true;
    }

    @OriginalMember(owner = "client!um", name = "m", descriptor = "()Lq;", line = 2298)
    public final class151 method658() {
        ++field7567;
        return this.field7676;
    }

    @OriginalMember(owner = "client!um", name = "o", descriptor = "()Z", line = 2310)
    public final boolean method663() {
        ++field7534;
        return true;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIILua;II)V", line = 2319)
    public final void method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        ++field7658;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(II)V", line = 2329)
    public final void method3050(int arg0, int arg1) {
        if (~this.field7759 != ~arg0) {
            this.field7759 = arg0;
            this.method813(28790);
        }
        if (arg1 != 0) {
            this.method808((byte) 22);
        }
        ++field7509;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(FFIFFFF)Z", line = 2347)
    private final boolean method3051(float arg0, float arg1, int arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field7618;
        Buffer var8 = this.field7786.method1231(true, 3696);
        if (var8 == null) {
            return false;
        } else {
            int var9 = 51 % ((arg2 - -33) / 56);
            Stream var10 = this.method3038(-10641, var8);
            if (Stream.method2077()) {
                var10.method2075(arg4);
                var10.method2075(arg6);
                var10.method2075(arg1);
                var10.method2075(arg5);
                var10.method2075(arg3);
                var10.method2075(arg0);
            } else {
                var10.method2088(arg4);
                var10.method2088(arg6);
                var10.method2088(arg1);
                var10.method2088(arg5);
                var10.method2088(arg3);
                var10.method2088(arg0);
            }
            var10.method2084();
            return this.field7786.method1230(-82);
        }
    }

    @OriginalMember(owner = "client!um", name = "VA", descriptor = "(IFFFFF)V", line = 2388)
    public final void method607(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7516;
        boolean var7 = ~this.field7684 != ~arg0;
        if (var7 || this.field7741 != arg1 || this.field7772 != arg2) {
            this.field7772 = arg2;
            this.field7684 = arg0;
            this.field7741 = arg1;
            if (var7) {
                this.field7734 = (float) (this.field7684 & 255) / 255.0F;
                this.field7737 = (float) (this.field7684 & 65280) / 65280.0F;
                this.field7776 = (float) (this.field7684 & 16711680) / 1.671168E7F;
                this.method789(-59);
            }
            this.field7588.setSunColour(this.field7776, this.field7737, this.field7734, arg1, arg2);
            this.method779(false);
        }
        if (this.field7751[0] != arg3 || this.field7751[1] != arg4 || this.field7751[2] != arg5) {
            this.field7751[0] = arg3;
            this.field7751[2] = arg5;
            this.field7751[1] = arg4;
            this.field7765[0] = -arg3;
            this.field7765[2] = -arg5;
            this.field7765[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7747[1] = arg4 * var8;
            this.field7747[0] = arg3 * var8;
            this.field7747[2] = arg5 * var8;
            this.field7768[1] = -this.field7747[1];
            this.field7768[0] = -this.field7747[0];
            this.field7768[2] = -this.field7747[2];
            this.field7588.setSunDirection(this.field7747[0], this.field7747[1], this.field7747[2]);
            this.method787((byte) 123);
            this.field7722 = (int) (arg5 * 256.0F / arg4);
            this.field7748 = (int) (arg3 * 256.0F / arg4);
        }
        this.method766(12);
    }

    @OriginalMember(owner = "client!um", name = "M", descriptor = "(I)V", line = 2441)
    public final void method3052(int arg0) {
        if (arg0 <= 94) {
            this.method697();
        }
        ++field7569;
        Enumeration var2 = this.field7545.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method762(var3, true, this.field7545.get(var3));
        }
        this.field7798.method987(-125);
        this.field7786.method987(-118);
        this.field7795.method2318((byte) 100);
        this.field7789.method2318((byte) 45);
        this.field7793.method2318((byte) 80);
        this.field7785.method2318((byte) 117);
        this.field7790.method2318((byte) 96);
        this.field7732.method1897(1600);
        this.field7792.method987(-124);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2471)
    public final void method672(Canvas arg0) {
        ++field7639;
        if (this.field7493 == arg0) {
            throw new RuntimeException();
        } else if (this.field7545.containsKey(arg0)) {
            this.method762(arg0, true, this.field7545.get(arg0));
            this.field7545.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!um", name = "N", descriptor = "(I)V", line = 2494)
    public void method790(int arg0) {
        this.field7712 = this.field7745;
        ++field7496;
        this.field7745 = 0;
        int var2 = 44 / ((arg0 - 11) / 51);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lrs;)V", line = 2514)
    public final void method611(class649 arg0) {
        this.field7688 = (class551) arg0;
        ++field7624;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(II)Lwc;", line = 2524)
    public class353 method753(int arg0, int arg1) {
        ++field7537;
        int var3 = -54 / ((-21 - arg0) / 51);
        if (~arg1 != -7) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    return arg1 == 7 ? new class372(this) : new class270(this);
                } else {
                    return new class618(this, this.field7561);
                }
            } else {
                return new class243(this);
            }
        } else {
            return new class86(this);
        }
    }

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "(I)I", line = 2579)
    public final int method3053(int arg0) {
        if (arg0 != 0) {
            this.method2997((byte) -55, 10);
        }
        ++field7555;
        return this.field7725;
    }

    @OriginalMember(owner = "client!um", name = "l", descriptor = "(Z)V", line = 2596)
    public final void method3054(boolean arg0) {
        ++field7637;
        Hashtable var2 = new Hashtable();
        if (this.field7545 != null && !this.field7545.isEmpty()) {
            Enumeration var3 = this.field7545.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method772(var4, (byte) -73));
            }
        }
        if (arg0) {
            this.field7545 = var2;
            this.method3062(false);
            this.method3047(0);
            this.field7732.method1892(2, this);
        }
    }

    @OriginalMember(owner = "client!um", name = "w", descriptor = "(B)V", line = 2629)
    private final void method3055(byte arg0) {
        if (class302.field4477 != this.field7702) {
            class324 var2 = this.field7702;
            this.field7702 = class302.field4477;
            if (!var2.method2007(arg0 ^ 106)) {
                this.method3026(0);
            }
            this.method3012((byte) -24);
            this.field7735 = this.field7717;
            this.method3044(true);
            this.field7770 &= -8;
        }
        ++field7521;
        if (arg0 != -4) {
            this.method665(-40);
        }
    }

    @OriginalMember(owner = "client!um", name = "va", descriptor = "(I)V", line = 2656)
    public final void method659(int arg0) {
        ++field7652;
        this.field7767 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field7767;
        }
        this.field7739 = 1 << this.field7767;
    }

    @OriginalMember(owner = "client!um", name = "O", descriptor = "(IIIIII)Z", line = 2673)
    public final boolean method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7519;
        float var7 = this.field7676.method1876((float) arg1, (float) arg0, true, (float) arg2);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field7676.method1876((float) arg4, (float) arg3, true, (float) arg5);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field7738 > var7) || !(var8 < (float) this.field7738)) && (!((float) this.field7731 < var7) || !(var8 > (float) this.field7731))) {
            int var9 = (int) ((float) this.field7686 * this.field7676.method1879((float) arg2, (float) arg1, 4, (float) arg0) / var7);
            int var10 = (int) ((float) this.field7686 * this.field7676.method1879((float) arg5, (float) arg4, 4, (float) arg3) / var8);
            if (this.field7691 > (float) var9 && (float) var10 < this.field7691 || this.field7760 < (float) var9 && this.field7760 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field7697 * this.field7676.method1878((float) arg0, (float) arg1, 64, (float) arg2) / var7);
                int var12 = (int) ((float) this.field7697 * this.field7676.method1878((float) arg3, (float) arg4, 117, (float) arg5) / var8);
                return (!((float) var11 < this.field7720) || !(this.field7720 > (float) var12)) && (!((float) var11 > this.field7703) || !((float) var12 > this.field7703));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(ZB)V", line = 2712)
    public final void method3056(boolean arg0, byte arg1) {
        if (!this.field7779 == arg0) {
            this.field7779 = arg0;
            this.method761(2078023448);
            this.field7770 &= -32;
        }
        ++field7591;
        if (arg1 <= 100) {
            this.method761(-28);
        }
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(IZ)V", line = 2731)
    public final void method3057(int arg0, boolean arg1) {
        ++field7585;
        int var3 = 89 / ((15 - arg0) / 34);
        if (this.field7716 == !arg1) {
            this.field7716 = arg1;
            this.method808((byte) 120);
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "()Z", line = 2749)
    public final boolean method630() {
        ++field7508;
        return this.field7769;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([I)V", line = 2760)
    public final void method610(int[] arg0) {
        ++field7546;
        arg0[1] = this.field7570;
        arg0[0] = this.field7583;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I[Ltg;)V", line = 2769)
    public final void method696(int arg0, class334[] arg1) {
        ++field7607;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field7687[var3] = arg1[var3];
        }
        this.field7745 = arg0;
        if (this.field7702.method2007(-99)) {
            this.method790(-40);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIBZ)V", line = 2789)
    public final void method3058(boolean arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 >= -114) {
            this.field7733 = 99;
        }
        if (this.field7762 != arg1 || !this.field7718 == this.field7756) {
            class75 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field7756 ? 3 : 0;
            if (arg1 < 0) {
                this.method3003(1);
            } else {
                var5 = this.field7740.method990(5459, arg1);
                class457 var10 = super.field1491.method955(-1330, arg1);
                if (~var10.field6601 == -1 && ~var10.field6607 == -1) {
                    this.method3003(1);
                } else {
                    int var11 = !var10.field6610 ? 128 : 64;
                    int var12 = var11 * 50;
                    class300 var13 = this.method3032(-30);
                    var13.method1888((float) (this.field7753 % var12 * var10.field6607) / (float) var12, 0.0F, (float) (this.field7753 % var12 * var10.field6601) / (float) var12, -112);
                    this.method3045(-110, class635.field9152);
                }
                if (!this.field7756) {
                    var7 = var10.field6599;
                    var9 = var10.field6600;
                    var8 = var10.field6589;
                }
                var6 = var10.field6591;
            }
            this.method3060(arg0, var7, var9, var8, arg3, 20218);
            if (this.field7773 != null) {
                this.field7773.method484(8056, var5, var6);
            } else {
                this.method3011(-128, var5);
                this.method3037(var6, true);
            }
            this.field7762 = arg1;
            this.field7718 = this.field7756;
        }
        ++field7505;
        this.field7770 &= -8;
    }

    @OriginalMember(owner = "client!um", name = "m", descriptor = "(Z)V", line = 2859)
    private final void method3059(boolean arg0) {
        ++field7576;
        if (arg0) {
            this.method3046(-126);
        }
        if (!this.field7682) {
            float[] var2 = this.field7709;
            float var3 = (float) this.field7738;
            float var4 = (float) this.field7731;
            float var5 = (float) (-this.field7757) * this.field7715 / (float) this.field7697;
            float var6 = (float) (-this.field7763) * this.field7715 / (float) this.field7686;
            float var7 = (float) (this.field7583 - this.field7763) * this.field7715 / (float) this.field7686;
            float var8 = (float) (-this.field7757 + this.field7570) * this.field7715 / (float) this.field7697;
            if (var6 != var7 && var5 != var8) {
                var2[9] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[14] = var3 / (var3 - var4);
                var2[3] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[5] = 2.0F / (var8 - var5);
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[7] = 0.0F;
            } else {
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[8] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[14] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[12] = 0.0F;
            }
            this.method3027((byte) -113);
            this.field7682 = true;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIIZI)V", line = 2929)
    private final void method3060(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field7558;
        boolean var7 = arg0 & this.method649();
        if (!var7 && (arg2 == 4 || ~arg2 == -9 || ~arg2 == -10)) {
            arg2 = 2;
            arg3 = arg2 == 4 ? arg1 & 1 : 1;
            arg1 = 0;
        }
        if (arg5 != 20218) {
            this.field7734 = 0.3540683F;
        }
        if (~arg2 != -1 && arg4) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field7754 != arg2) {
            if (this.field7754 != 0) {
                this.field7727[Integer.MAX_VALUE & this.field7754].method490(-2144900407);
            }
            if (arg2 == 0) {
                this.field7773 = null;
            } else {
                this.field7773 = this.field7727[Integer.MAX_VALUE & arg2];
                this.field7773.method491(arg5 ^ -20104, arg4);
                this.field7773.method485(52, arg4);
                this.field7773.method486(arg1, false, arg3);
            }
            this.field7708 = arg1;
            this.field7728 = arg3;
            this.field7754 = arg2;
        } else if (~this.field7754 != -1) {
            this.field7727[this.field7754 & Integer.MAX_VALUE].method485(107, arg4);
            if (~this.field7708 != ~arg1 || this.field7728 != arg3) {
                this.field7727[this.field7754 & Integer.MAX_VALUE].method486(arg1, false, arg3);
                this.field7728 = arg3;
                this.field7708 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "U", descriptor = "()I", line = 2988)
    public final int method608() {
        ++field7542;
        return this.field7731;
    }

    @OriginalMember(owner = "client!um", name = "S", descriptor = "(I)V", line = 2996)
    private final void method3061(int arg0) {
        if (this.field7544 == null) {
            this.field7613 = this.field7627 = 1;
        } else {
            Dimension var2 = this.field7544.getSize();
            this.field7613 = var2.width;
            this.field7627 = var2.height;
        }
        ++field7499;
        this.field7570 = this.field7627;
        this.field7583 = this.field7613;
        this.method3001(72);
        this.method2990((byte) -91);
        this.method3046(-3983);
        this.method763(-73);
        this.method3018(arg0 ^ arg0);
        this.method3005(13);
        this.method699();
    }

    @OriginalMember(owner = "client!um", name = "n", descriptor = "(Z)V", line = 3029)
    private final void method3062(boolean arg0) {
        ++field7531;
        this.field7798 = this.method806(10, arg0);
        this.field7798.method1229(140, 28, 29812);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field7798.method1231(true, 3696);
            if (var3 != null) {
                Stream var4 = this.method3038(-10641, var3);
                if (Stream.method2077()) {
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(1.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(1.0F);
                    var4.method2075(0.0F);
                    var4.method2075(1.0F);
                    var4.method2075(1.0F);
                    var4.method2075(1.0F);
                    var4.method2075(0.0F);
                    var4.method2075(1.0F);
                    var4.method2075(1.0F);
                    var4.method2075(1.0F);
                    var4.method2075(1.0F);
                    var4.method2075(1.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(1.0F);
                    var4.method2075(0.0F);
                    var4.method2075(1.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                    var4.method2075(0.0F);
                } else {
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(1.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(1.0F);
                    var4.method2088(0.0F);
                    var4.method2088(1.0F);
                    var4.method2088(1.0F);
                    var4.method2088(1.0F);
                    var4.method2088(0.0F);
                    var4.method2088(1.0F);
                    var4.method2088(1.0F);
                    var4.method2088(1.0F);
                    var4.method2088(1.0F);
                    var4.method2088(1.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(1.0F);
                    var4.method2088(0.0F);
                    var4.method2088(1.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                    var4.method2088(0.0F);
                }
                var4.method2084();
                if (this.field7798.method1230(-90)) {
                    break;
                }
            }
        }
        this.field7797 = this.method781(new class680[] { new class680(new class455[] { class455.field6559, class455.field6569, class455.field6569 }) }, -75);
    }

    @OriginalMember(owner = "client!um", name = "y", descriptor = "(B)V", line = 3142)
    public final void method3063(byte arg0) {
        ++field7514;
        if (arg0 > -108) {
            this.method772((Canvas) null, (byte) -106);
        }
        if (~this.field7770 != -5) {
            this.method3002(-112);
            this.method3069(5796, false);
            this.method2994(0, false);
            this.method2991(false, (byte) 102);
            this.method3056(false, (byte) 101);
            this.method3058(false, -2, (byte) -126, false);
            this.method3068(122, 1);
            this.method3037(0, true);
            this.field7770 = 4;
        }
    }

    @OriginalMember(owner = "client!um", name = "T", descriptor = "(I)V", line = 3166)
    private final void method3064(int arg0) {
        if (class175.field2452 == this.field7702) {
            float var2 = this.method784(arg0 ^ 128);
            this.field7650.method1870(0.0F, arg0, var2, var2);
        }
        ++field7632;
        this.field7766 = false;
        this.method798((byte) 118);
        if (this.field7773 != null) {
            this.field7773.method2190(arg0 + -25997);
        }
        if (arg0 != 0) {
            this.method640(-60);
        }
    }

    @OriginalMember(owner = "client!um", name = "q", descriptor = "()Z", line = 3190)
    public final boolean method671() {
        ++field7661;
        return true;
    }

    @OriginalMember(owner = "client!um", name = "U", descriptor = "(I)V", line = 3198)
    public final void method3065(int arg0) {
        this.field7650.method890();
        ++field7638;
        this.field7645 = true;
        this.method3064(arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lq;)V", line = 3211)
    public final void method616(class151 arg0) {
        this.field7676 = (class300) arg0;
        ++field7497;
        this.field7679.method887(this.field7676);
        this.field7679.method1871(16383);
        this.field7680.method1877(this.field7679, -15485);
        this.field7678.method1877(this.field7676, -15485);
        if (this.field7702.method2007(-78)) {
            this.method3026(0);
        }
    }

    @OriginalMember(owner = "client!um", name = "u", descriptor = "()Lq;", line = 3227)
    public final class151 method682() {
        ++field7594;
        return this.field7800;
    }

    @OriginalMember(owner = "client!um", name = "W", descriptor = "(I)V", line = 3238)
    private final void method3066(int arg0) {
        if (arg0 != 17996) {
            this.field7762 = -29;
        }
        ++field7551;
        if (this.field7773 != null) {
            this.field7773.method1395(true);
        }
        this.method775(false);
    }

    @OriginalMember(owner = "client!um", name = "X", descriptor = "(I)Lica;", line = 3253)
    public final class300 method3067(int arg0) {
        ++field7601;
        return arg0 != -11030 ? null : this.field7742[this.field7759];
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(II)V", line = 3266)
    public final void method3068(int arg0, int arg1) {
        if (this.field7775 != arg1) {
            class476 var3;
            boolean var4;
            boolean var5;
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    var3 = class284.field3792;
                    var4 = false;
                    var5 = true;
                } else if (~arg1 == -129) {
                    var4 = true;
                    var3 = class229.field3043;
                    var5 = true;
                } else {
                    var4 = false;
                    var5 = false;
                    var3 = class248.field3268;
                }
            } else {
                var5 = true;
                var3 = class378.field5670;
                var4 = true;
            }
            if (this.field7683 != var4) {
                this.field7683 = var4;
                this.method783(false);
            }
            if (this.field7704 != var5) {
                this.field7704 = var5;
                this.method764(-107);
            }
            if (this.field7713 != var3) {
                this.field7713 = var3;
                this.method807(26);
            }
            this.field7770 &= -29;
            this.field7775 = arg1;
        }
        ++field7495;
        if (arg0 <= 121) {
            this.field7544 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(IZ)V", line = 3334)
    public final void method3069(int arg0, boolean arg1) {
        if (arg0 != 5796) {
            this.field7723 = true;
        }
        ++field7506;
        if (!this.field7705 == arg1) {
            this.field7705 = arg1;
            this.method759((byte) 44);
            this.field7770 &= -32;
        }
    }

    @OriginalMember(owner = "client!um", name = "L", descriptor = "()V", line = 3352)
    public final void method647() {
        ++field7600;
        this.field7756 = false;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Lega;")
    public abstract class184 method806(int arg0, boolean arg1);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZLpca;II)V")
    public abstract void method768(boolean arg0, boolean arg1, class529 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(Z)V")
    public abstract void method783(boolean arg0);

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(B)V")
    public abstract void method795(byte arg0);

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V")
    public abstract void method813(int arg0);

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(B)V")
    public abstract void method808(byte arg0);

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(I)V")
    public abstract void method789(int arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIILpca;)V")
    public abstract void method769(boolean arg0, int arg1, int arg2, class529 arg3);

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(B)V")
    public abstract void method760(byte arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lrf;B)V")
    public abstract void method765(class157 arg0, byte arg1);

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(B)V")
    public abstract void method798(byte arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lwu;Lbk;I)Z")
    public abstract boolean method780(class149 arg0, class106 arg1, int arg2);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILwu;BLbk;I)Lfj;")
    public abstract class75 method785(int arg0, class149 arg1, byte arg2, class106 arg3, int arg4);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method792(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!um", name = "l", descriptor = "(I)F")
    public abstract float method784(int arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lid;IBI)V")
    public abstract void method778(class388 arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!um", name = "n", descriptor = "(I)V")
    public abstract void method807(int arg0);

    @OriginalMember(owner = "client!um", name = "q", descriptor = "(I)V")
    public abstract void method799(int arg0);

    @OriginalMember(owner = "client!um", name = "t", descriptor = "(I)V")
    public abstract void method763(int arg0);

    @OriginalMember(owner = "client!um", name = "u", descriptor = "(I)V")
    public abstract void method766(int arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILwu;I[BI)Ljf;")
    public abstract class695 method802(int arg0, int arg1, class149 arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([IIIIZII)Lfj;")
    public abstract class75 method793(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lcl;B)V")
    public abstract void method811(class314 arg0, byte arg1);

    @OriginalMember(owner = "client!um", name = "m", descriptor = "(B)V")
    public abstract void method774(byte arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lbk;ILwu;)Z")
    public abstract boolean method794(class106 arg0, int arg1, class149 arg2);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)Lip;")
    public abstract class532 method800(boolean arg0, int arg1);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ[[II)Lap;")
    public abstract class447 method812(int arg0, boolean arg1, int[][] arg2, int arg3);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILid;ILip;I)V")
    public abstract void method756(int arg0, int arg1, int arg2, class388 arg3, int arg4, class532 arg5, int arg6);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
    public abstract void method762(Canvas arg0, boolean arg1, Object arg2);

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(IZ)V")
    public abstract void method767(int arg0, boolean arg1);

    @OriginalMember(owner = "client!um", name = "A", descriptor = "(I)V")
    public abstract void method788(int arg0);

    @OriginalMember(owner = "client!um", name = "q", descriptor = "(B)V")
    public abstract void method816(byte arg0);

    @OriginalMember(owner = "client!um", name = "D", descriptor = "(I)V")
    public abstract void method782(int arg0);

    @OriginalMember(owner = "client!um", name = "G", descriptor = "(I)V")
    public abstract void method761(int arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public abstract Object method772(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method809(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(Z)V")
    public abstract void method775(boolean arg0);

    @OriginalMember(owner = "client!um", name = "u", descriptor = "(B)V")
    public abstract void method776(byte arg0);

    @OriginalMember(owner = "client!um", name = "k", descriptor = "(Z)V")
    public abstract void method779(boolean arg0);

    @OriginalMember(owner = "client!um", name = "O", descriptor = "(I)V")
    public abstract void method764(int arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([FIIILwu;ZII)Lfj;")
    public abstract class75 method755(float[] arg0, int arg1, int arg2, int arg3, class149 arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!um", name = "P", descriptor = "(I)V")
    public abstract void method786(int arg0);

    @OriginalMember(owner = "client!um", name = "v", descriptor = "(B)V")
    public abstract void method787(byte arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([Ldm;I)Lcl;")
    public abstract class314 method781(class680[] arg0, int arg1);

    @OriginalMember(owner = "client!um", name = "R", descriptor = "(I)V")
    public abstract void method758(int arg0);

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(ZI)V")
    public abstract void method804(boolean arg0, int arg1);

    @OriginalMember(owner = "client!um", name = "x", descriptor = "(B)V")
    public abstract void method759(byte arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([BLwu;ZIIIII)Lfj;")
    public abstract class75 method805(byte[] arg0, class149 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!um", name = "V", descriptor = "(I)V")
    public abstract void method757(int arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lega;II)V")
    public abstract void method754(class184 arg0, int arg1, int arg2);
}
