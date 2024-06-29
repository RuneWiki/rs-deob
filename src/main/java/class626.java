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

@OriginalClass("client!ai")
public abstract class class626 extends class65 {

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "Ltm;")
    private class412 field8457 = new class412();

    @OriginalMember(owner = "client!ai", name = "Xd", descriptor = "Z")
    public boolean field8633 = true;

    @OriginalMember(owner = "client!ai", name = "ae", descriptor = "Lwn;")
    public class754 field8636 = new class754();

    @OriginalMember(owner = "client!ai", name = "ce", descriptor = "Lwn;")
    public class754 field8638 = new class754();

    @OriginalMember(owner = "client!ai", name = "de", descriptor = "Lwn;")
    public class754 field8639 = new class754();

    @OriginalMember(owner = "client!ai", name = "ee", descriptor = "Lwn;")
    public class754 field8640 = new class754();

    @OriginalMember(owner = "client!ai", name = "fe", descriptor = "Lwn;")
    private class754 field8641 = new class754();

    @OriginalMember(owner = "client!ai", name = "ge", descriptor = "Lwn;")
    private class754 field8642 = new class754();

    @OriginalMember(owner = "client!ai", name = "me", descriptor = "Z")
    public boolean field8648 = true;

    @OriginalMember(owner = "client!ai", name = "ve", descriptor = "Z")
    public boolean field8657 = false;

    @OriginalMember(owner = "client!ai", name = "qe", descriptor = "I")
    public int field8652 = 0;

    @OriginalMember(owner = "client!ai", name = "pe", descriptor = "I")
    public int field8651 = -1;

    @OriginalMember(owner = "client!ai", name = "we", descriptor = "F")
    public float field8658 = 1.0F;

    @OriginalMember(owner = "client!ai", name = "Te", descriptor = "Z")
    private boolean field8681 = false;

    @OriginalMember(owner = "client!ai", name = "Ee", descriptor = "[F")
    private float[] field8666 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ai", name = "Le", descriptor = "F")
    public float field8673 = -1.0F;

    @OriginalMember(owner = "client!ai", name = "Ae", descriptor = "I")
    public int field8662 = 0;

    @OriginalMember(owner = "client!ai", name = "Ke", descriptor = "[F")
    private float[] field8672 = new float[16];

    @OriginalMember(owner = "client!ai", name = "He", descriptor = "I")
    private int field8669 = -1;

    @OriginalMember(owner = "client!ai", name = "ie", descriptor = "F")
    public float field8644 = 1.0F;

    @OriginalMember(owner = "client!ai", name = "nf", descriptor = "[F")
    public float[] field8700 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ai", name = "Xe", descriptor = "[F")
    private float[] field8685 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ai", name = "af", descriptor = "F")
    public float field8688 = 3584.0F;

    @OriginalMember(owner = "client!ai", name = "Ze", descriptor = "F")
    public float field8687 = 1.0F;

    @OriginalMember(owner = "client!ai", name = "Ce", descriptor = "F")
    private float field8664 = 1.0F;

    @OriginalMember(owner = "client!ai", name = "ef", descriptor = "I")
    public int field8692 = 512;

    @OriginalMember(owner = "client!ai", name = "Pe", descriptor = "I")
    public int field8677 = 0;

    @OriginalMember(owner = "client!ai", name = "se", descriptor = "[Laba;")
    private class188[] field8654 = new class188[10];

    @OriginalMember(owner = "client!ai", name = "sf", descriptor = "F")
    public float field8705 = -1.0F;

    @OriginalMember(owner = "client!ai", name = "Me", descriptor = "[F")
    private float[] field8674 = new float[16];

    @OriginalMember(owner = "client!ai", name = "Re", descriptor = "I")
    public int field8679 = 0;

    @OriginalMember(owner = "client!ai", name = "We", descriptor = "Z")
    private boolean field8684 = false;

    @OriginalMember(owner = "client!ai", name = "hf", descriptor = "I")
    private int field8695 = 0;

    @OriginalMember(owner = "client!ai", name = "Ue", descriptor = "Z")
    private boolean field8682 = false;

    @OriginalMember(owner = "client!ai", name = "ze", descriptor = "Z")
    public boolean field8661 = true;

    @OriginalMember(owner = "client!ai", name = "xe", descriptor = "I")
    public int field8659 = 3584;

    @OriginalMember(owner = "client!ai", name = "Bf", descriptor = "I")
    public int field8714 = 0;

    @OriginalMember(owner = "client!ai", name = "df", descriptor = "I")
    public int field8691 = 50;

    @OriginalMember(owner = "client!ai", name = "Cf", descriptor = "I")
    public int field8715 = 0;

    @OriginalMember(owner = "client!ai", name = "kf", descriptor = "[F")
    public float[] field8697 = this.field8685;

    @OriginalMember(owner = "client!ai", name = "ff", descriptor = "[F")
    public float[] field8693 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!ai", name = "Mf", descriptor = "Z")
    public boolean field8725 = true;

    @OriginalMember(owner = "client!ai", name = "Gf", descriptor = "I")
    private int field8719 = -1;

    @OriginalMember(owner = "client!ai", name = "ne", descriptor = "Lfb;")
    public class704 field8649 = class647.field8982;

    @OriginalMember(owner = "client!ai", name = "he", descriptor = "I")
    public int field8643 = 3;

    @OriginalMember(owner = "client!ai", name = "Lf", descriptor = "I")
    private int field8724 = 0;

    @OriginalMember(owner = "client!ai", name = "tf", descriptor = "I")
    private int field8706 = -1;

    @OriginalMember(owner = "client!ai", name = "Be", descriptor = "Z")
    public boolean field8663 = false;

    @OriginalMember(owner = "client!ai", name = "Ff", descriptor = "I")
    private int field8718 = 0;

    @OriginalMember(owner = "client!ai", name = "If", descriptor = "I")
    public int field8721 = -1;

    @OriginalMember(owner = "client!ai", name = "bf", descriptor = "F")
    public float field8689 = 3584.0F;

    @OriginalMember(owner = "client!ai", name = "Fe", descriptor = "Z")
    public boolean field8667 = true;

    @OriginalMember(owner = "client!ai", name = "xf", descriptor = "I")
    private int field8710 = 1;

    @OriginalMember(owner = "client!ai", name = "pf", descriptor = "Z")
    private boolean field8702 = false;

    @OriginalMember(owner = "client!ai", name = "Jf", descriptor = "I")
    public int field8722 = 0;

    @OriginalMember(owner = "client!ai", name = "Pf", descriptor = "Z")
    public boolean field8728 = true;

    @OriginalMember(owner = "client!ai", name = "Hf", descriptor = "I")
    public int field8720 = 8;

    @OriginalMember(owner = "client!ai", name = "jf", descriptor = "I")
    public int field8696 = 0;

    @OriginalMember(owner = "client!ai", name = "Oe", descriptor = "I")
    public int field8676 = 128;

    @OriginalMember(owner = "client!ai", name = "Xf", descriptor = "I")
    public int field8736 = 512;

    @OriginalMember(owner = "client!ai", name = "Nf", descriptor = "Z")
    public boolean field8726 = false;

    @OriginalMember(owner = "client!ai", name = "Vf", descriptor = "Z")
    private boolean field8734 = false;

    @OriginalMember(owner = "client!ai", name = "Je", descriptor = "I")
    public int field8671 = 0;

    @OriginalMember(owner = "client!ai", name = "Wf", descriptor = "[F")
    private float[] field8735 = new float[16];

    @OriginalMember(owner = "client!ai", name = "of", descriptor = "I")
    private int field8701 = 0;

    @OriginalMember(owner = "client!ai", name = "Zf", descriptor = "Z")
    private boolean field8738 = false;

    @OriginalMember(owner = "client!ai", name = "Se", descriptor = "[F")
    private float[] field8680 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ai", name = "Sf", descriptor = "Z")
    public boolean field8731 = false;

    @OriginalMember(owner = "client!ai", name = "Uf", descriptor = "I")
    public int field8733 = 0;

    @OriginalMember(owner = "client!ai", name = "bg", descriptor = "F")
    public float field8740 = 1.0F;

    @OriginalMember(owner = "client!ai", name = "eg", descriptor = "Lnaa;")
    public class78 field8743 = class120.field1751;

    @OriginalMember(owner = "client!ai", name = "cg", descriptor = "I")
    private int field8741 = 16777215;

    @OriginalMember(owner = "client!ai", name = "dg", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8742 = new Stream();

    @OriginalMember(owner = "client!ai", name = "xg", descriptor = "Lwn;")
    private class754 field8762 = new class754();

    @OriginalMember(owner = "client!ai", name = "uf", descriptor = "I")
    public int field8707;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "Laj;")
    public class333 field8460;

    @OriginalMember(owner = "client!ai", name = "Ub", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8526;

    @OriginalMember(owner = "client!ai", name = "ac", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8532;

    @OriginalMember(owner = "client!ai", name = "Gd", descriptor = "Ljava/lang/Object;")
    public Object field8616;

    @OriginalMember(owner = "client!ai", name = "Id", descriptor = "Ljava/lang/Object;")
    private Object field8618;

    @OriginalMember(owner = "client!ai", name = "Df", descriptor = "I")
    public int field8716;

    @OriginalMember(owner = "client!ai", name = "Hb", descriptor = "I")
    private int field8513;

    @OriginalMember(owner = "client!ai", name = "jd", descriptor = "I")
    public int field8593;

    @OriginalMember(owner = "client!ai", name = "mc", descriptor = "I")
    private int field8544;

    @OriginalMember(owner = "client!ai", name = "vc", descriptor = "I")
    public int field8553;

    @OriginalMember(owner = "client!ai", name = "vf", descriptor = "Liha;")
    private class32 field8708;

    @OriginalMember(owner = "client!ai", name = "sb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field8498;

    @OriginalMember(owner = "client!ai", name = "tc", descriptor = "Lmga;")
    public static class739 field8551 = new class739(60, -1);

    @OriginalMember(owner = "client!ai", name = "oe", descriptor = "F")
    public float field8650;

    @OriginalMember(owner = "client!ai", name = "te", descriptor = "F")
    public float field8655;

    @OriginalMember(owner = "client!ai", name = "ue", descriptor = "F")
    public float field8656;

    @OriginalMember(owner = "client!ai", name = "ye", descriptor = "F")
    public float field8660;

    @OriginalMember(owner = "client!ai", name = "Ne", descriptor = "F")
    private float field8675;

    @OriginalMember(owner = "client!ai", name = "zf", descriptor = "F")
    public float field8712;

    @OriginalMember(owner = "client!ai", name = "Qf", descriptor = "F")
    public float field8729;

    @OriginalMember(owner = "client!ai", name = "Tf", descriptor = "F")
    private float field8732;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!ai", name = "mb", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!ai", name = "nb", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!ai", name = "pb", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!ai", name = "qb", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!ai", name = "rb", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!ai", name = "tb", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!ai", name = "ub", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!ai", name = "wb", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!ai", name = "xb", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!ai", name = "yb", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!ai", name = "zb", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!ai", name = "Ab", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!ai", name = "Bb", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!ai", name = "Cb", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!ai", name = "Db", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!ai", name = "Fb", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!ai", name = "Gb", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!ai", name = "Ib", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!ai", name = "Jb", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!ai", name = "Kb", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!ai", name = "Lb", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!ai", name = "Mb", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!ai", name = "Nb", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!ai", name = "Ob", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!ai", name = "Pb", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!ai", name = "Qb", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!ai", name = "Rb", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!ai", name = "Sb", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!ai", name = "Tb", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!ai", name = "Vb", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!ai", name = "Wb", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!ai", name = "Xb", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!ai", name = "Yb", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!ai", name = "Zb", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!ai", name = "bc", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!ai", name = "cc", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!ai", name = "dc", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!ai", name = "ec", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!ai", name = "fc", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!ai", name = "gc", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!ai", name = "hc", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!ai", name = "ic", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!ai", name = "jc", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!ai", name = "kc", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!ai", name = "lc", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!ai", name = "nc", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!ai", name = "oc", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!ai", name = "pc", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!ai", name = "qc", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!ai", name = "rc", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!ai", name = "sc", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!ai", name = "uc", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!ai", name = "wc", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!ai", name = "xc", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!ai", name = "yc", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!ai", name = "zc", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!ai", name = "Ac", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!ai", name = "Bc", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!ai", name = "Cc", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!ai", name = "Dc", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!ai", name = "Ec", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!ai", name = "Fc", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!ai", name = "Gc", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!ai", name = "Hc", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!ai", name = "Ic", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!ai", name = "Jc", descriptor = "I")
    public static int field8567;

    @OriginalMember(owner = "client!ai", name = "Kc", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!ai", name = "Lc", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!ai", name = "Mc", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!ai", name = "Nc", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!ai", name = "Oc", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!ai", name = "Pc", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!ai", name = "Qc", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!ai", name = "Rc", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!ai", name = "Sc", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!ai", name = "Tc", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!ai", name = "Uc", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!ai", name = "Vc", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!ai", name = "Wc", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!ai", name = "Xc", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!ai", name = "Yc", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!ai", name = "Zc", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!ai", name = "ad", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!ai", name = "bd", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!ai", name = "cd", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!ai", name = "dd", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!ai", name = "ed", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!ai", name = "fd", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!ai", name = "gd", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!ai", name = "hd", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!ai", name = "id", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!ai", name = "kd", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!ai", name = "ld", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!ai", name = "md", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!ai", name = "nd", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!ai", name = "od", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!ai", name = "pd", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!ai", name = "qd", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!ai", name = "rd", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!ai", name = "sd", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!ai", name = "td", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!ai", name = "ud", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!ai", name = "vd", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!ai", name = "wd", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!ai", name = "xd", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!ai", name = "yd", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!ai", name = "zd", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!ai", name = "Ad", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!ai", name = "Bd", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!ai", name = "Cd", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!ai", name = "Ed", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!ai", name = "Fd", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!ai", name = "Hd", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!ai", name = "Jd", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!ai", name = "Kd", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!ai", name = "Ld", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!ai", name = "Md", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!ai", name = "Nd", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!ai", name = "Od", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!ai", name = "Pd", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!ai", name = "Rd", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!ai", name = "Sd", descriptor = "I")
    public int field8628;

    @OriginalMember(owner = "client!ai", name = "Td", descriptor = "I")
    public int field8629;

    @OriginalMember(owner = "client!ai", name = "Ud", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!ai", name = "Vd", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!ai", name = "Wd", descriptor = "I")
    public int field8632;

    @OriginalMember(owner = "client!ai", name = "Yd", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!ai", name = "Zd", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!ai", name = "be", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!ai", name = "ke", descriptor = "I")
    public int field8646;

    @OriginalMember(owner = "client!ai", name = "le", descriptor = "I")
    public int field8647;

    @OriginalMember(owner = "client!ai", name = "cf", descriptor = "I")
    private int field8690;

    @OriginalMember(owner = "client!ai", name = "lf", descriptor = "I")
    public int field8698;

    @OriginalMember(owner = "client!ai", name = "mf", descriptor = "I")
    public int field8699;

    @OriginalMember(owner = "client!ai", name = "qf", descriptor = "I")
    public int field8703;

    @OriginalMember(owner = "client!ai", name = "rf", descriptor = "I")
    public int field8704;

    @OriginalMember(owner = "client!ai", name = "yf", descriptor = "I")
    public int field8711;

    @OriginalMember(owner = "client!ai", name = "Of", descriptor = "I")
    private int field8727;

    @OriginalMember(owner = "client!ai", name = "ag", descriptor = "I")
    public int field8739;

    @OriginalMember(owner = "client!ai", name = "Bg", descriptor = "I")
    private int field8766;

    @OriginalMember(owner = "client!ai", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!ai", name = "Ve", descriptor = "Lbm;")
    public class123 field8683;

    @OriginalMember(owner = "client!ai", name = "Ef", descriptor = "Laba;")
    private class188 field8717;

    @OriginalMember(owner = "client!ai", name = "kg", descriptor = "Lnc;")
    public class26 field8749;

    @OriginalMember(owner = "client!ai", name = "lg", descriptor = "Lnc;")
    private class26 field8750;

    @OriginalMember(owner = "client!ai", name = "mg", descriptor = "Lnc;")
    public class26 field8751;

    @OriginalMember(owner = "client!ai", name = "pg", descriptor = "Lnc;")
    public class26 field8754;

    @OriginalMember(owner = "client!ai", name = "tg", descriptor = "Lnc;")
    private class26 field8758;

    @OriginalMember(owner = "client!ai", name = "yg", descriptor = "Lnc;")
    public class26 field8763;

    @OriginalMember(owner = "client!ai", name = "Ag", descriptor = "Lnc;")
    private class26 field8765;

    @OriginalMember(owner = "client!ai", name = "qg", descriptor = "Loh;")
    private class427 field8755;

    @OriginalMember(owner = "client!ai", name = "hg", descriptor = "Lkj;")
    public class593 field8746;

    @OriginalMember(owner = "client!ai", name = "ig", descriptor = "Lkj;")
    public class593 field8747;

    @OriginalMember(owner = "client!ai", name = "jg", descriptor = "Lkj;")
    public class593 field8748;

    @OriginalMember(owner = "client!ai", name = "ng", descriptor = "Lkj;")
    public class593 field8752;

    @OriginalMember(owner = "client!ai", name = "og", descriptor = "Lkj;")
    public class593 field8753;

    @OriginalMember(owner = "client!ai", name = "rg", descriptor = "Lkj;")
    public class593 field8756;

    @OriginalMember(owner = "client!ai", name = "sg", descriptor = "Lkj;")
    public class593 field8757;

    @OriginalMember(owner = "client!ai", name = "ug", descriptor = "Lkj;")
    public class593 field8759;

    @OriginalMember(owner = "client!ai", name = "vg", descriptor = "Lkj;")
    public class593 field8760;

    @OriginalMember(owner = "client!ai", name = "wg", descriptor = "Lkj;")
    public class593 field8761;

    @OriginalMember(owner = "client!ai", name = "Qe", descriptor = "Lfe;")
    private class597 field8678;

    @OriginalMember(owner = "client!ai", name = "fg", descriptor = "Lid;")
    private class612 field8744;

    @OriginalMember(owner = "client!ai", name = "gg", descriptor = "Lid;")
    private class612 field8745;

    @OriginalMember(owner = "client!ai", name = "zg", descriptor = "Lid;")
    private class612 field8764;

    @OriginalMember(owner = "client!ai", name = "De", descriptor = "Lno;")
    private class732 field8665;

    @OriginalMember(owner = "client!ai", name = "Eb", descriptor = "Llja;")
    public class745 field8510;

    @OriginalMember(owner = "client!ai", name = "ob", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8494;

    @OriginalMember(owner = "client!ai", name = "Dd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field8613;

    @OriginalMember(owner = "client!ai", name = "Qd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8626;

    @OriginalMember(owner = "client!ai", name = "je", descriptor = "Z")
    public boolean field8645;

    @OriginalMember(owner = "client!ai", name = "Ge", descriptor = "Z")
    public boolean field8668;

    @OriginalMember(owner = "client!ai", name = "Ie", descriptor = "Z")
    public boolean field8670;

    @OriginalMember(owner = "client!ai", name = "wf", descriptor = "Z")
    public boolean field8709;

    @OriginalMember(owner = "client!ai", name = "Yf", descriptor = "Z")
    public boolean field8737;

    @OriginalMember(owner = "client!ai", name = "Cg", descriptor = "Z")
    public boolean field8767;

    @OriginalMember(owner = "client!ai", name = "Af", descriptor = "[Lbm;")
    private class123[] field8713;

    @OriginalMember(owner = "client!ai", name = "Ye", descriptor = "[Leo;")
    public class314[] field8686;

    @OriginalMember(owner = "client!ai", name = "gf", descriptor = "[Lln;")
    public class400[] field8694;

    @OriginalMember(owner = "client!ai", name = "Rf", descriptor = "[Lln;")
    public class400[] field8730;

    @OriginalMember(owner = "client!ai", name = "Kf", descriptor = "[Luca;")
    public class540[] field8723;

    @OriginalMember(owner = "client!ai", name = "re", descriptor = "[Lwn;")
    public class754[] field8653;

    @OriginalMember(owner = "client!ai", name = "vb", descriptor = "[[[Ljd;")
    public static class243[][][] field8501;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;", line = 7)
    public final Stream method3445(int arg0, Buffer arg1) {
        ++field8491;
        if (arg0 != 9) {
            this.field8632 = -99;
        }
        this.field8742.method3919(arg1);
        return this.field8742;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V", line = 19)
    private final void method3446(int arg0) {
        if (arg0 > -80) {
            this.method3509(18, (class457) null, -100);
        }
        if (class276.field4094 != this.field8743) {
            class78 var2 = this.field8743;
            this.field8743 = class276.field4094;
            if (!var2.method673(92)) {
                this.method3515(3);
            }
            this.method3494(true);
            this.field8697 = this.field8735;
            this.method3501((byte) -121);
            this.field8727 &= -8;
        }
        ++field8496;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Leu;Z)Lvr;", line = 44)
    public final class147 method477(class508 arg0, boolean arg1) {
        ++field8459;
        class147 var9;
        if (~arg0.field7017 != -1 && ~arg0.field7014 != -1) {
            int[] var3 = new int[arg0.field7017 * arg0.field7014];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field7019 != null) {
                for (int var6 = 0; arg0.field7014 > var6; ++var6) {
                    for (int var7 = 0; ~arg0.field7017 < ~var7; ++var7) {
                        var3[var5++] = class213.method1409(arg0.field7019[var4] << 24, arg0.field7013[class440.method2643(arg0.field7018[var4], 255)]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; var8 < arg0.field7014; ++var8) {
                    for (int var10 = 0; ~arg0.field7017 < ~var10; ++var10) {
                        int var11 = arg0.field7013[255 & arg0.field7018[var4++]];
                        var3[var5++] = ~var11 != -1 ? class213.method1409(-16777216, var11) : 0;
                    }
                }
            }
            var9 = this.method499(arg0.field7017, var3, true, 0, arg0.field7014, arg0.field7017);
        } else {
            var9 = this.method499(1, new int[1], true, 0, 1, 1);
        }
        var9.method1112(arg0.field7020, arg0.field7016, arg0.field7015, arg0.field7021);
        return var9;
    }

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "()Z", line = 111)
    public final boolean method542() {
        ++field8527;
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[F)[F", line = 120)
    public final float[] method3447(int arg0, float[] arg1) {
        arg1[0] = this.field8697[0];
        arg1[8] = this.field8697[2];
        arg1[4] = this.field8697[1];
        ++field8481;
        arg1[12] = this.field8697[3];
        if (arg0 >= -49) {
            this.field8760 = null;
        }
        arg1[2] = this.field8697[8];
        arg1[1] = this.field8697[4];
        arg1[13] = this.field8697[7];
        arg1[5] = this.field8697[5];
        arg1[9] = this.field8697[6];
        arg1[3] = this.field8697[12];
        arg1[7] = this.field8697[13];
        arg1[10] = this.field8697[10];
        arg1[6] = this.field8697[9];
        arg1[14] = this.field8697[11];
        arg1[11] = this.field8697[14];
        arg1[15] = this.field8697[15];
        return arg1;
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)Lwn;", line = 148)
    public final class754 method3448(int arg0) {
        ++field8485;
        if (arg0 != 0) {
            this.field8718 = 75;
        }
        return this.field8640;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILwn;)V", line = 160)
    public final void method3449(int arg0, class754 arg1) {
        ++field8489;
        if (arg0 == 2) {
            this.field8636.method986(arg1);
            this.field8633 = false;
            this.method3522(true);
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)I", line = 173)
    public final int method3450(byte arg0) {
        if (arg0 < 126) {
            this.method452(-0.2348364F);
        }
        ++field8529;
        return this.field8706;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()I", line = 189)
    public final int method451() {
        ++field8518;
        return this.field8698 - 2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIILaa;II)V", line = 198)
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        ++field8596;
    }

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "()I", line = 205)
    public final int method567() {
        ++field8472;
        return this.field8629 + this.field8628 + this.field8632;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(FB)V", line = 217)
    public final void method3451(float arg0, byte arg1) {
        ++field8578;
        if (this.field8664 != arg0) {
            this.field8664 = arg0;
            this.method3510(-14326);
        }
        if (arg1 <= 91) {
            this.field8728 = false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "(IIIII)V", line = 234)
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method559(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field8582;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I", line = 244)
    public final int method498(int arg0, int arg1) {
        ++field8545;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(B)Lwn;", line = 254)
    public final class754 method3452(byte arg0) {
        ++field8604;
        return arg0 != 13 ? null : this.field8653[this.field8662];
    }

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "(I)V", line = 266)
    public final void method3453(int arg0) {
        this.field8713 = new class123[this.field8711];
        this.field8686 = new class314[this.field8711];
        this.field8730 = new class400[this.field8711];
        ++field8521;
        this.field8694 = new class400[this.field8711];
        this.field8653 = new class754[this.field8711];
        for (int var2 = 0; var2 < this.field8711; ++var2) {
            this.field8694[var2] = class364.field5299;
            this.field8730[var2] = class364.field5299;
            this.field8686[var2] = class57.field799;
            this.field8653[var2] = new class754();
        }
        this.field8723 = new class540[this.field8698 + -2];
        this.field8683 = this.method892(1, 1, class258.field3847, class305.field4404, arg0 + 18018);
        this.method449(new class688(262144));
        this.field8749 = this.method893(new class357[] { new class357(new class542[] { class542.field7354, class542.field7365 }) }, (byte) -125);
        this.field8763 = this.method893(new class357[] { new class357(new class542[] { class542.field7354, class542.field7363 }) }, (byte) -125);
        this.field8754 = this.method893(new class357[] { new class357(class542.field7354), new class357(class542.field7363), new class357(class542.field7365), new class357(class542.field7358) }, (byte) -125);
        this.field8751 = this.method893(new class357[] { new class357(class542.field7354), new class357(class542.field7363), new class357(class542.field7365) }, (byte) 57);
        this.field8759 = new class593(this, 0, 0, false, false);
        this.field8757 = new class593(this, 0, 0, true, true);
        this.field8756 = new class593(this, 0, 0, false, false);
        this.field8760 = new class593(this, 0, 0, true, true);
        this.field8746 = new class593(this, 0, 0, false, false);
        this.field8748 = new class593(this, 0, arg0, true, true);
        this.field8752 = new class593(this, 0, 0, false, false);
        this.field8761 = new class593(this, 0, 0, true, true);
        this.field8753 = new class593(this, 0, 0, false, false);
        this.field8747 = new class593(this, 0, 0, true, true);
        this.field8665 = new class732(this);
        this.field8755 = this.method908(-1, true);
        this.method3518(80);
        this.field8510 = new class745(this);
        this.field8654[1] = this.method899(1, arg0 + 2);
        this.field8654[2] = this.method899(2, 2);
        this.field8654[4] = this.method899(4, class471.method2773(arg0, 2));
        this.field8654[5] = this.method899(5, 2);
        this.field8654[6] = this.method899(6, arg0 + 2);
        this.field8654[7] = this.method899(7, 2);
        this.field8654[3] = this.method899(3, 2);
        this.field8654[8] = this.method899(8, 2);
        this.field8654[9] = this.method899(9, 2);
        if (!this.field8654[2].method956(93)) {
            this.field8654[2] = this.method899(0, 2);
        }
        if (!this.field8654[4].method956(68)) {
            this.field8654[4] = this.field8654[2];
        }
        if (!this.field8654[8].method956(88)) {
            this.field8654[8] = this.field8654[4];
        }
        if (!this.field8654[9].method956(59)) {
            this.field8654[9] = this.field8654[8];
        }
        this.method909(29906);
        this.method543();
        this.method500();
    }

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "([I)V", line = 338)
    public final void method494(int[] arg0) {
        arg0[2] = this.field8677;
        ++field8557;
        arg0[3] = this.field8715;
        arg0[1] = this.field8671;
        arg0[0] = this.field8652;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIII)V", line = 349)
    public final void method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8605;
        float var8 = (float) arg2 - (float) arg0;
        float var9 = (float) (-arg1) + (float) arg3;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method3491(-2);
        this.method3525(arg4, 1);
        this.method3514((byte) 94, class109.field1493, 0);
        this.method3509(0, class109.field1493, -102);
        this.method3460(0, arg6);
        this.field8636.method4197((byte) -86, var11, 1.0F, (float) arg5);
        this.field8636.method970(0, -arg5 / 2, 0);
        this.field8636.method968((int) ((double) var10 * 2607.5945876176133D) & 16383);
        this.field8636.method970(arg0, arg1, 0);
        this.method3508(11570);
        this.method895(-113, false);
        this.method3483(-27539);
        this.method895(-128, true);
        this.method3509(0, class122.field1782, -96);
        this.method3514((byte) 110, class122.field1782, 0);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 393)
    public final void method480(Canvas arg0, int arg1, int arg2) {
        ++field8603;
        if (this.field8526 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8626.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method875((byte) 70, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field8626.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "(I)V", line = 431)
    private final void method3454(int arg0) {
        if (arg0 != 8) {
            this.field8757 = null;
        }
        ++field8502;
        this.method883(this.field8764, 0, 113);
        this.method913(this.field8750, (byte) -63);
        this.method855(class771.field10604, 1, 0, (byte) 45);
    }

    @OriginalMember(owner = "client!ai", name = "EA", descriptor = "(IIII)V", line = 444)
    public final void method557(int arg0, int arg1, int arg2, int arg3) {
        ++field8591;
        if (!this.field8645) {
            throw new RuntimeException("");
        } else {
            this.field8706 = arg2;
            this.field8669 = arg1;
            this.field8718 = arg3;
            this.field8690 = arg0;
            if (this.field8681) {
                this.field8654[3].method1306((byte) -36);
                this.field8654[3].method1305((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "()Z", line = 465)
    public final boolean method491() {
        ++field8583;
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 475)
    public final void method531(boolean arg0) {
        ++field8449;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)Lza;", line = 485)
    public final class437 method482(int arg0) {
        ++field8506;
        class688 var2 = new class688(arg0);
        this.field8457.method2545(-126, var2);
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(B)I", line = 500)
    public final int method3455(byte arg0) {
        if (arg0 != 97) {
            this.field8764 = null;
        }
        ++field8612;
        return this.field8718;
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "()I", line = 512)
    public final int method539() {
        ++field8479;
        return this.field8691;
    }

    @OriginalMember(owner = "client!ai", name = "da", descriptor = "(III[I)V", line = 520)
    public final void method455(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8635;
        float var5 = this.field8638.method4194((float) arg1, (float) arg0, 16383, (float) arg2);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field8679;
            var7 = this.field8696;
        } else {
            var6 = (int) ((float) this.field8692 * this.field8638.method4190((float) arg0, (float) arg1, (byte) 120, (float) arg2) / var5);
            var7 = (int) ((float) this.field8736 * this.field8638.method4209(false, (float) arg2, (float) arg1, (float) arg0) / var5);
        }
        arg3[1] = (int) ((float) var7 - this.field8712);
        arg3[0] = (int) ((float) var6 - this.field8650);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIF)Luca;", line = 545)
    public final class540 method530(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8535;
        return new class543(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "(I)Lwn;", line = 555)
    public final class754 method3456(int arg0) {
        if (arg0 != -1690) {
            return null;
        } else {
            if (!this.field8734) {
                this.field8642.method4198(this.field8640, this.field8636);
                this.field8734 = true;
            }
            ++field8631;
            return this.field8642;
        }
    }

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "(IIIIII[BII)V", line = 572)
    public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8590;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)V", line = 584)
    public void method853(boolean arg0) {
        if (arg0) {
            ++field8568;
            this.field8703 = this.field8739;
            this.field8739 = 0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "(I)V", line = 597)
    private final void method3457(int arg0) {
        this.field8702 = false;
        ++field8620;
        if (arg0 != 16202) {
            this.method3520(true, (class123) null);
        }
        this.method3479(11);
        if (class584.field7799 == this.field8743) {
            this.method3501((byte) -60);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lza;)V", line = 613)
    public final void method449(class437 arg0) {
        this.field8494 = ((class688) arg0).field9681;
        ++field8471;
        this.field8613 = this.field8494.method3913(32768, false);
    }

    @OriginalMember(owner = "client!ai", name = "ZA", descriptor = "(IFFFFF)V", line = 626)
    public final void method533(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8560;
        boolean var7 = this.field8741 != arg0;
        if (var7 || this.field8705 != arg1 || this.field8673 != arg2) {
            this.field8741 = arg0;
            this.field8673 = arg2;
            this.field8705 = arg1;
            if (var7) {
                this.field8658 = (float) (this.field8741 & 16711680) / 1.671168E7F;
                this.field8687 = (float) (255 & this.field8741) / 255.0F;
                this.field8740 = (float) (65280 & this.field8741) / 65280.0F;
                this.method890(1);
            }
            this.field8498.setSunColour(this.field8658, this.field8740, this.field8687, arg1, arg2);
            this.method912((byte) -74);
        }
        if (this.field8666[0] != arg3 || this.field8666[1] != arg4 || this.field8666[2] != arg5) {
            this.field8666[1] = arg4;
            this.field8666[0] = arg3;
            this.field8666[2] = arg5;
            this.field8680[0] = -arg3;
            this.field8680[2] = -arg5;
            this.field8680[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8700[2] = arg5 * var8;
            this.field8700[1] = arg4 * var8;
            this.field8700[0] = arg3 * var8;
            this.field8693[1] = -this.field8700[1];
            this.field8693[2] = -this.field8700[2];
            this.field8693[0] = -this.field8700[0];
            this.field8498.setSunDirection(this.field8700[0], this.field8700[1], this.field8700[2]);
            this.method879(-103);
            this.field8646 = (int) (arg5 * 256.0F / arg4);
            this.field8647 = (int) (arg3 * 256.0F / arg4);
        }
        this.method861(0);
    }

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "(I)Lwn;", line = 681)
    public final class754 method3458(int arg0) {
        if (arg0 != 0) {
            this.method494((int[]) null);
        }
        ++field8452;
        return this.field8641;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 692)
    public final void method460(Canvas arg0) {
        this.field8618 = null;
        ++field8606;
        this.field8532 = null;
        if (arg0 != null && this.field8526 != arg0) {
            if (this.field8626.containsKey(arg0)) {
                this.field8618 = this.field8626.get(arg0);
                this.field8532 = arg0;
            }
        } else {
            this.field8532 = this.field8526;
            this.field8618 = this.field8616;
        }
        if (this.field8532 != null && this.field8618 != null) {
            this.method891(this.field8532, (byte) 109, this.field8618);
            this.method3466(-99);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lef;I)V", line = 726)
    public final void method532(class515 arg0, int arg1) {
        this.field8665.method4063(arg1, arg0, this, (byte) -81);
        ++field8571;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZZII)V", line = 734)
    private final void method3459(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        ++field8537;
        boolean var7 = arg2 & this.method534();
        if (!var7 && (~arg5 == -5 || arg5 == 8 || ~arg5 == -10)) {
            arg5 = 2;
            arg4 = arg5 != 4 ? 1 : 1 & arg1;
            arg1 = 0;
        }
        if (arg5 != 0 && arg3) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (arg0 == 8) {
            if (~this.field8724 != ~arg5) {
                if (this.field8724 != 0) {
                    this.field8654[Integer.MAX_VALUE & this.field8724].method955((byte) 86);
                }
                if (arg5 == 0) {
                    this.field8717 = null;
                } else {
                    this.field8717 = this.field8654[arg5 & Integer.MAX_VALUE];
                    this.field8717.method961(arg3, 2);
                    this.field8717.method962(arg0 ^ 22797, arg3);
                    this.field8717.method958(arg1, arg4, true);
                }
                this.field8695 = arg4;
                this.field8701 = arg1;
                this.field8724 = arg5;
            } else if (~this.field8724 != -1) {
                this.field8654[Integer.MAX_VALUE & this.field8724].method962(arg0 + 22781, arg3);
                if (~this.field8701 != ~arg1 || ~this.field8695 != ~arg4) {
                    this.field8654[this.field8724 & Integer.MAX_VALUE].method958(arg1, arg4, true);
                    this.field8701 = arg1;
                    this.field8695 = arg4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "()Z", line = 791)
    public final boolean method522() {
        ++field8517;
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(II)V", line = 802)
    public final void method3460(int arg0, int arg1) {
        if (this.field8710 != arg1) {
            boolean var3;
            class704 var4;
            boolean var5;
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    var3 = true;
                    var4 = class94.field1341;
                    var5 = false;
                } else if (arg1 == 128) {
                    var4 = class705.field9871;
                    var3 = true;
                    var5 = true;
                } else {
                    var5 = false;
                    var3 = false;
                    var4 = class262.field3887;
                }
            } else {
                var4 = class647.field8982;
                var5 = true;
                var3 = true;
            }
            if (var5 == !this.field8667) {
                this.field8667 = var5;
                this.method915(124);
            }
            if (this.field8725 != var3) {
                this.field8725 = var3;
                this.method904(0);
            }
            if (this.field8649 != var4) {
                this.field8649 = var4;
                this.method882((byte) 106);
            }
            this.field8710 = arg1;
            this.field8727 &= -29;
        }
        ++field8563;
        if (arg0 != 0) {
            this.method3518(-84);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIII)V", line = 872)
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8589;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) (-arg1) + (float) arg3;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method3491(-2);
        this.method3525(arg4, 1);
        this.method3514((byte) 111, class109.field1493, 0);
        this.method3509(0, class109.field1493, -92);
        this.method3460(0, arg5);
        this.method3469((byte) 62);
        int var14 = arg8 % (arg6 + arg7);
        this.method895(-122, false);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (var14 > arg6) {
            var18 = (float) (arg7 - var14 + arg6) * var11;
            var17 = (float) (-var14 + arg6 + arg7) * var12;
        } else {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg2 <= arg0) {
                if (var21 < (float) arg2) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if (var21 > (float) arg2) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg1 >= arg3) {
                if (var22 < (float) arg3) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if (var22 > (float) arg3) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method3488(var21, var22, 256, 0.0F, var19 + var21, var20 + var22, 0.0F)) {
                return;
            }
            var22 += var20 + var24;
            var21 += var19 + var23;
            this.method3454(8);
            var20 = var16;
            var19 = var15;
        }
        this.method895(-112, true);
        this.method3509(0, class122.field1782, -106);
        this.method3514((byte) -83, class122.field1782, 0);
    }

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "(I)V", line = 992)
    public void method909(int arg0) {
        if (arg0 != 29906) {
            this.field8672 = null;
        }
        ++field8461;
        this.method3526(arg0 ^ 29907);
    }

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "()Z", line = 1007)
    public final boolean method534() {
        ++field8455;
        return this.field8654[3].method956(64);
    }

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "(I)V", line = 1016)
    public final void method481(int arg0) {
        ++field8609;
        this.field8643 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field8643;
        }
        this.field8720 = 1 << this.field8643;
    }

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "(I)V", line = 1031)
    public final void method3461(int arg0) {
        ++field8447;
        int var2 = -47 % ((arg0 - -9) / 63);
        this.method3497(true);
        this.method3501((byte) 99);
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V", line = 1044)
    public final void method506(int arg0) {
        ++field8622;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            if (this.field8708 != null) {
                this.field8708.method232(true);
            }
            this.field8676 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)V", line = 1059)
    public void method546(int arg0) {
        ++field8448;
        if (this.field8708 != null) {
            this.field8708.method229(105);
        }
        this.field8699 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([BIIBZLsw;)Lec;", line = 1070)
    public final class248 method3462(byte[] arg0, int arg1, int arg2, byte arg3, boolean arg4, class787 arg5) {
        if (arg3 != -62) {
            this.field8655 = -0.41894042F;
        }
        ++field8547;
        return this.method873(arg4, arg5, arg2, 0, arg0, 8, arg1, 0);
    }

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "(III[I)V", line = 1081)
    public final void method551(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8505;
        float var5 = this.field8638.method4194((float) arg1, (float) arg0, 16383, (float) arg2);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field8696;
            var7 = this.field8679;
        } else {
            var7 = (int) ((float) this.field8692 * this.field8638.method4190((float) arg0, (float) arg1, (byte) 120, (float) arg2) / var5);
            var6 = (int) ((float) this.field8736 * this.field8638.method4209(false, (float) arg2, (float) arg1, (float) arg0) / var5);
        }
        arg3[1] = (int) ((float) var6 + -this.field8712);
        arg3[0] = (int) ((float) var7 + -this.field8650);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!ai", name = "aa", descriptor = "(IIIIII)V", line = 1109)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3491(-2);
        ++field8625;
        this.method3525(arg4, 1);
        this.method3514((byte) -75, class109.field1493, 0);
        this.method3509(0, class109.field1493, -92);
        this.method3460(0, arg5);
        this.field8636.method4197((byte) -120, (float) arg2, 1.0F, (float) arg3);
        this.field8636.method970(arg0, arg1, 0);
        this.method3508(11570);
        this.method895(-112, false);
        this.method3483(-27539);
        this.method895(-104, true);
        this.method3509(0, class122.field1782, -83);
        this.method3514((byte) -58, class122.field1782, 0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILwt;)V", line = 1133)
    private final void method3463(int arg0, int arg1, class330 arg2) {
        if (arg0 >= -113) {
            this.method3487((byte) 59, false);
        }
        this.method883(this.field8745, 0, 5);
        ++field8515;
        this.method913(this.field8765, (byte) -63);
        this.method855(arg2, arg1, 0, (byte) 42);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(Z)V", line = 1146)
    private final void method3464(boolean arg0) {
        if (class549.field7441 != this.field8743) {
            class78 var2 = this.field8743;
            this.field8743 = class549.field7441;
            if (var2.method673(38)) {
                this.method3515(3);
            }
            this.method3498(15);
            this.field8697 = this.field8672;
            this.method3501((byte) 123);
            this.field8727 &= -25;
        }
        if (!arg0) {
            this.field8705 = 1.9381421F;
        }
        ++field8561;
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(B)V", line = 1171)
    public final void method3465(byte arg0) {
        ++field8580;
        Enumeration var2 = this.field8626.keys();
        int var3 = -61 % ((-1 - arg0) / 51);
        while (var2.hasMoreElements()) {
            Canvas var4 = (Canvas) var2.nextElement();
            this.method878(127, var4, this.field8626.get(var4));
        }
        this.field8745.method2614(487);
        this.field8764.method2614(487);
        this.field8744.method2614(487);
        this.field8757.method3303(63);
        this.field8760.method3303(31);
        this.field8748.method3303(111);
        this.field8761.method3303(120);
        this.field8747.method3303(82);
        this.field8665.method4060(-37);
        this.field8755.method2614(487);
    }

    @OriginalMember(owner = "client!ai", name = "ra", descriptor = "(IIII)V", line = 1204)
    public final void method552(int arg0, int arg1, int arg2, int arg3) {
        this.field8669 = arg1;
        this.field8690 = arg0;
        this.field8706 = arg2;
        ++field8450;
        this.field8645 = true;
        this.field8718 = arg3;
    }

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "(I)V", line = 1216)
    private final void method3466(int arg0) {
        if (arg0 <= -93) {
            if (this.field8532 != null) {
                Dimension var2 = this.field8532.getSize();
                this.field8544 = var2.width;
                this.field8513 = var2.height;
            } else {
                this.field8544 = this.field8513 = 1;
            }
            ++field8493;
            this.field8593 = this.field8513;
            this.field8553 = this.field8544;
            this.method3512(-16826);
            this.method3457(16202);
            this.method3510(-14326);
            this.method885((byte) -30);
            this.method3507(-1);
            this.method3497(true);
            this.method543();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 1252)
    public final class296 method547(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8564;
        return new class520(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "(I)V", line = 1260)
    private final void method3467(int arg0) {
        this.field8745 = this.method902(arg0, false);
        ++field8621;
        this.field8745.method2642(140, 28, -10760);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field8745.method2646(true, true);
            if (var3 != null) {
                Stream var4 = this.method3445(arg0 ^ 9, var3);
                if (Stream.method3926()) {
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(1.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(1.0F);
                    var4.method3930(0.0F);
                    var4.method3930(1.0F);
                    var4.method3930(1.0F);
                    var4.method3930(1.0F);
                    var4.method3930(0.0F);
                    var4.method3930(1.0F);
                    var4.method3930(1.0F);
                    var4.method3930(1.0F);
                    var4.method3930(1.0F);
                    var4.method3930(1.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(1.0F);
                    var4.method3930(0.0F);
                    var4.method3930(1.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                    var4.method3930(0.0F);
                } else {
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(1.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(1.0F);
                    var4.method3929(0.0F);
                    var4.method3929(1.0F);
                    var4.method3929(1.0F);
                    var4.method3929(1.0F);
                    var4.method3929(0.0F);
                    var4.method3929(1.0F);
                    var4.method3929(1.0F);
                    var4.method3929(1.0F);
                    var4.method3929(1.0F);
                    var4.method3929(1.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(1.0F);
                    var4.method3929(0.0F);
                    var4.method3929(1.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                    var4.method3929(0.0F);
                }
                var4.method3922();
                if (this.field8745.method2640(10925)) {
                    break;
                }
            }
        }
        this.field8765 = this.method893(new class357[] { new class357(new class542[] { class542.field7354, class542.field7365, class542.field7365 }) }, (byte) -125);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1376)
    public final void method476(Canvas arg0) {
        ++field8477;
        if (this.field8526 == arg0) {
            throw new RuntimeException();
        } else if (this.field8626.containsKey(arg0)) {
            this.method878(114, arg0, this.field8626.get(arg0));
            this.field8626.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(B)V", line = 1402)
    public static final void method3468(byte arg0) {
        if (arg0 != 14) {
            field8551 = null;
        }
        ++field8533;
        for (class744 var1 = (class744) class229.field3116.method2551((byte) -108); var1 != null; var1 = (class744) class229.field3116.method2542(-105)) {
            class657 var2 = var1.field10274;
            if (var2.field9101) {
                var1.method792((byte) -109);
                var2.method3644(true);
            } else if (var2.field9086 <= class100.field1401) {
                var2.method3645(class303.field4368, (byte) -43);
                if (var2.field9101) {
                    var1.method792((byte) -115);
                } else {
                    class356.method2242(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "(B)V", line = 1442)
    public final void method3469(byte arg0) {
        int var2 = 115 / ((arg0 - -76) / 47);
        this.field8636.method967();
        ++field8574;
        this.field8633 = true;
        this.method3522(true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)V", line = 1460)
    public final void method3470(byte arg0, int arg1) {
        if (~this.field8662 != ~arg1) {
            this.field8662 = arg1;
            this.method911((byte) 123);
        }
        int var3 = 116 / ((arg0 - 86) / 35);
        ++field8573;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILeo;)V", line = 1484)
    public final void method3471(int arg0, class314 arg1) {
        ++field8579;
        this.field8686[this.field8662] = arg1;
        if (arg0 <= 18) {
            this.field8692 = 64;
        }
        this.method3481(1);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lef;)V", line = 1496)
    public final void method524(class515 arg0) {
        this.field8665.method4063(-1, arg0, this, (byte) -121);
        ++field8627;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZ)V", line = 1504)
    public final void method3472(byte arg0, boolean arg1) {
        if (this.field8731 != arg1) {
            this.field8731 = arg1;
            this.method874(false);
            this.field8727 &= -8;
        }
        ++field8600;
        if (arg0 != -68) {
            this.field8694 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;", line = 1524)
    public final NativeHeapBuffer method3473(boolean arg0, int arg1, int arg2) {
        ++field8520;
        if (arg1 != 12) {
            this.field8683 = null;
        }
        return this.field8494.method3913(arg2, arg0);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(Z)I", line = 1535)
    public final int method3474(boolean arg0) {
        if (arg0) {
            this.field8714 = 85;
        }
        ++field8478;
        return this.field8669;
    }

    @OriginalMember(owner = "client!ai", name = "pa", descriptor = "()V", line = 1546)
    public final void method555() {
        ++field8446;
        this.field8645 = false;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "()Luu;", line = 1555)
    public final class303 method472() {
        ++field8490;
        return new class754();
    }

    @OriginalMember(owner = "client!ai", name = "za", descriptor = "(IIIII)V", line = 1565)
    public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3491(-2);
        ++field8512;
        this.method3525(arg3, 1);
        this.method3514((byte) 119, class109.field1493, 0);
        this.method3509(0, class109.field1493, -106);
        this.method3460(0, arg4);
        this.field8636.method4197((byte) 87, (float) arg2, 1.0F, (float) arg2);
        this.field8636.method970(arg0, arg1, 0);
        this.method3508(11570);
        this.method895(-122, false);
        this.method883(this.field8744, 0, -97);
        this.method913(this.field8758, (byte) -63);
        this.method855(class432.field6127, 256, 0, (byte) 87);
        this.method895(-124, true);
        this.method3509(0, class122.field1782, -116);
        this.method3514((byte) 98, class122.field1782, 0);
    }

    @OriginalMember(owner = "client!ai", name = "xa", descriptor = "(F)V", line = 1598)
    public final void method452(float arg0) {
        if (this.field8644 != arg0) {
            this.field8644 = arg0;
            this.field8498.setAmbient(arg0);
            this.method890(1);
            this.method861(0);
        }
        ++field8569;
    }

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "(I)[F", line = 1614)
    public final float[] method3475(int arg0) {
        ++field8555;
        return arg0 != 32768 ? null : this.field8685;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Laj;II)V", line = 1625)
    public class626(Canvas arg0, Object arg1, class161 arg2, class333 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field8707 = arg4;
            this.field8460 = arg3;
            this.field8532 = this.field8526 = arg0;
            this.field8618 = this.field8616 = arg1;
            Dimension var7 = arg0.getSize();
            this.field8716 = arg5;
            this.field8593 = this.field8513 = var7.height;
            this.field8553 = this.field8544 = var7.width;
            class679.method3753(true, false, true);
            if (super.field912 != null) {
                this.field8708 = new class32(this, super.field912);
                this.field8498 = new NativeInterface(super.field912.method1175((byte) 40), this.field8716);
                for (int var8 = 0; ~super.field912.method1175((byte) 18) < ~var8; ++var8) {
                    class662 var9 = super.field912.method1174(var8, true);
                    if (var9 != null) {
                        this.field8498.initTextureMetrics(var8, var9.field9146, var9.field9133);
                    }
                }
            } else {
                this.field8498 = new NativeInterface(0, this.field8716);
                this.field8708 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method470((byte) -109);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ai", name = "XA", descriptor = "()I", line = 1676)
    public final int method457() {
        ++field8541;
        return this.field8659;
    }

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "()Z", line = 1685)
    public final boolean method535() {
        ++field8487;
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "(I)I", line = 1700)
    public final int method3476(int arg0) {
        ++field8482;
        int var2 = 50 / ((arg0 - -12) / 51);
        return this.field8662;
    }

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "(I)V", line = 1710)
    private final void method3477(int arg0) {
        ++field8519;
        this.field8744 = this.method902(0, false);
        if (arg0 != 256) {
            this.method3445(97, (Buffer) null);
        }
        this.field8744.method2642(3096, 12, arg0 + -11016);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field8744.method2646(true, true);
            if (var3 != null) {
                Stream var4 = this.method3445(arg0 ^ 265, var3);
                var4.method3930(0.0F);
                var4.method3930(0.0F);
                var4.method3930(0.0F);
                for (int var5 = 0; ~var5 >= -257; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (Stream.method3926()) {
                        var4.method3930(var9);
                        var4.method3930(var8);
                        var4.method3930(0.0F);
                    } else {
                        var4.method3929(var9);
                        var4.method3929(var8);
                        var4.method3929(0.0F);
                    }
                }
                var4.method3922();
                if (this.field8744.method2640(arg0 + 10669)) {
                    break;
                }
            }
        }
        this.field8758 = this.method893(new class357[] { new class357(class542.field7354) }, (byte) 52);
    }

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "(IIIII)V", line = 1777)
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method559(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
        ++field8530;
    }

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "(I)V", line = 1791)
    public final void method3478(int arg0) {
        if (arg0 != 4) {
            this.method3500((byte) -76, false);
        }
        ++field8570;
        if (~this.field8727 != -3) {
            this.method3464(true);
            this.method3524(-545832829, false);
            this.method3472((byte) -68, false);
            this.method3484(1, false);
            this.method3500((byte) 123, false);
            this.method3502(false, -2, false, (byte) -112);
            this.field8727 = 2;
        }
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V", line = 1814)
    public final void method554(int arg0) {
        ++field8451;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(IIIIII)V", line = 1824)
    public final void method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8548;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method3488((float) arg0, (float) arg1, 256, 0.0F, (float) arg2 + var9, (float) arg3 + var8, 0.0F)) {
            this.method3491(-2);
            this.method3525(arg4, 1);
            this.method3514((byte) -124, class109.field1493, 0);
            this.method3509(0, class109.field1493, -81);
            this.method3460(0, arg5);
            this.method3469((byte) -123);
            this.method895(-114, false);
            this.method3454(8);
            this.method895(-117, true);
            this.method3509(0, class122.field1782, -82);
            this.method3514((byte) -81, class122.field1782, 0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "(I)V", line = 1863)
    private final void method3479(int arg0) {
        if (!this.field8702) {
            float[] var2 = this.field8674;
            float var3 = (float) (-this.field8679 * this.field8691) / (float) this.field8692;
            float var4 = (float) ((this.field8553 - this.field8679) * this.field8691) / (float) this.field8692;
            float var5 = (float) (this.field8696 * this.field8691) / (float) this.field8736;
            float var6 = (float) ((-this.field8593 + this.field8696) * this.field8691) / (float) this.field8736;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field8691 * 2.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[0] = var7 / (-var3 + var4);
                var2[4] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[10] = this.field8675 = (float) this.field8659 / (float) (-this.field8659 + this.field8691);
                var2[5] = var7 / (-var6 + var5);
                var2[15] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = -1.0F;
                var2[12] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = this.field8732 = (float) (this.field8691 * this.field8659) / (float) (-this.field8659 + this.field8691);
                var2[3] = 0.0F;
                var2[13] = 0.0F;
            } else {
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[7] = 0.0F;
            }
            this.method3499(arg0 + 12847);
            this.field8702 = true;
        }
        ++field8542;
        if (arg0 != 11) {
            this.field8758 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([IIIIIZ)Lvr;", line = 1931)
    public final class147 method544(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8543;
        return new class572(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(IIIIII)V", line = 1939)
    public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8522;
        float var7 = this.method859(-116);
        this.method3491(-2);
        this.method3525(arg4, 1);
        this.method3514((byte) 101, class109.field1493, 0);
        this.method3509(0, class109.field1493, -87);
        this.method3460(0, arg5);
        this.field8636.method4197((byte) 114, (float) (arg2 - 1), 1.0F, (float) (arg3 - 1));
        this.field8636.method4208(18645, 0.0F, (float) arg1 + -var7, (float) arg0 + -var7);
        this.method3508(11570);
        this.method895(-110, false);
        this.method3463(-118, 4, class458.field6352);
        this.method895(-109, true);
        this.method3509(0, class122.field1782, -83);
        this.method3514((byte) -69, class122.field1782, 0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILsw;[FZ)Lec;", line = 1964)
    public final class248 method3480(int arg0, int arg1, int arg2, class787 arg3, float[] arg4, boolean arg5) {
        if (arg0 != 1) {
            this.field8638 = null;
        }
        ++field8581;
        return this.method858(0, arg4, arg3, 0, arg2, arg1, 0, arg5);
    }

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "(I)V", line = 1975)
    private final void method3481(int arg0) {
        if (arg0 != 1) {
            this.field8693 = null;
        }
        ++field8624;
        this.method872((byte) -21);
        if (this.field8717 != null) {
            this.field8717.method1304((byte) -56);
        }
    }

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "(B)Lwn;", line = 1990)
    public final class754 method3482(byte arg0) {
        ++field8488;
        if (arg0 <= 66) {
            this.field8685 = null;
        }
        return this.field8636;
    }

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "()Luu;", line = 2002)
    public final class303 method565() {
        ++field8475;
        return this.field8638;
    }

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "(I)V", line = 2010)
    public final void method3483(int arg0) {
        ++field8630;
        this.method3463(-119, 2, class432.field6127);
        if (arg0 != -27539) {
            this.method3452((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ldn;)V", line = 2022)
    public final void method473(class544 arg0) {
        ++field8462;
        this.field8678 = (class597) arg0;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V", line = 2032)
    public final void method493(int arg0) {
        ++field8508;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IZ)V", line = 2039)
    public final void method3484(int arg0, boolean arg1) {
        if (arg0 != 1) {
            this.field8642 = null;
        }
        if (this.field8663 != arg1) {
            this.field8663 = arg1;
            this.method906(true);
            this.field8727 &= -32;
        }
        ++field8549;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Leia;[Leu;Z)Lda;", line = 2056)
    public final class66 method545(class255 arg0, class508[] arg1, boolean arg2) {
        ++field8601;
        return new class585(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BB)V", line = 2064)
    public final void method3485(byte arg0, byte arg1) {
        this.method3525(arg0 << 8 | arg0 << 24 | arg0 << 16 | arg0, 1);
        int var3 = 19 % ((-34 - arg1) / 55);
        ++field8608;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(IZ)V", line = 2078)
    public final void method3486(int arg0, boolean arg1) {
        if (arg1 == !this.field8648) {
            this.field8648 = arg1;
            this.method903((byte) 82);
        }
        ++field8480;
        if (arg0 != 8) {
            this.field8652 = -77;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BZ)V", line = 2095)
    public final void method3487(byte arg0, boolean arg1) {
        if (!arg1 != !this.field8726) {
            this.field8726 = arg1;
            this.method874(false);
        }
        ++field8607;
        if (arg0 != 18) {
            this.field8727 = -64;
        }
    }

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "()Z", line = 2111)
    public final boolean method501() {
        ++field8575;
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(FFIFFFF)Z", line = 2126)
    private final boolean method3488(float arg0, float arg1, int arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field8617;
        Buffer var8 = this.field8764.method2646(true, true);
        if (var8 == null) {
            return false;
        } else if (arg2 != 256) {
            return true;
        } else {
            Stream var9 = this.method3445(arg2 ^ 265, var8);
            if (!Stream.method3926()) {
                var9.method3929(arg0);
                var9.method3929(arg1);
                var9.method3929(arg3);
                var9.method3929(arg4);
                var9.method3929(arg5);
                var9.method3929(arg6);
            } else {
                var9.method3930(arg0);
                var9.method3930(arg1);
                var9.method3930(arg3);
                var9.method3930(arg4);
                var9.method3930(arg5);
                var9.method3930(arg6);
            }
            var9.method3922();
            return this.field8764.method2640(arg2 ^ 11181);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 2164)
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field8554;
    }

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "()Z", line = 2172)
    public final boolean method513() {
        ++field8558;
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V", line = 2182)
    public final void method3489(boolean arg0, int arg1) {
        if (arg1 != 64) {
            this.method3446(6);
        }
        if (!this.field8661 != !arg0) {
            this.field8661 = arg0;
            this.method914(4);
        }
        ++field8597;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2199)
    public final void method448(Canvas arg0, int arg1, int arg2) {
        ++field8585;
        Object var4 = null;
        if (arg0 != null && this.field8526 != arg0) {
            if (this.field8626.containsKey(arg0)) {
                var4 = this.field8626.get(arg0);
            }
        } else {
            var4 = this.field8618;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method898((byte) 95, arg0, var4);
            if (this.field8532 == arg0) {
                this.method3466(-113);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "(I)V", line = 2226)
    public final void method3490(int arg0) {
        ++field8584;
        if (arg0 != 1) {
            this.field8657 = true;
        }
        if (~this.field8727 != -5) {
            this.method3464(true);
            this.method3524(-545832829, false);
            this.method3472((byte) -68, false);
            this.method3484(arg0, false);
            this.method3500((byte) 124, false);
            this.method3502(false, -2, false, (byte) -112);
            this.method3460(arg0 ^ 1, 1);
            this.method3503((byte) -99, 0);
            this.field8727 = 4;
        }
    }

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "(I)V", line = 2251)
    private final void method3491(int arg0) {
        if (~this.field8727 != arg0) {
            this.method3464(true);
            this.method3524(-545832829, false);
            this.method3472((byte) -68, false);
            this.method3484(1, false);
            this.method3500((byte) 3, false);
            this.method3502(false, -2, false, (byte) -112);
            this.method3503((byte) 78, 1);
            this.method3520(true, this.field8683);
            this.field8727 = 1;
        }
        ++field8511;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)Loh;", line = 2272)
    public final class427 method3492(byte arg0, int arg1) {
        if (arg1 * 2 > this.field8755.method2631((byte) 91)) {
            this.field8755.method2615(arg1, (byte) -73);
        }
        ++field8509;
        return arg0 != 31 ? null : this.field8755;
    }

    @OriginalMember(owner = "client!ai", name = "HA", descriptor = "(IIII[I)V", line = 2299)
    public final void method527(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field8495;
        float var6 = this.field8638.method4194((float) arg1, (float) arg0, 16383, (float) arg2);
        if (!(var6 < (float) this.field8691) && !((float) this.field8659 < var6)) {
            int var7 = (int) ((float) this.field8692 * this.field8638.method4190((float) arg0, (float) arg1, (byte) 120, (float) arg2) / (float) arg3);
            int var8 = (int) ((float) this.field8736 * this.field8638.method4209(false, (float) arg2, (float) arg1, (float) arg0) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[0] = (int) ((float) var7 + -this.field8650);
            arg4[1] = (int) ((float) var8 - this.field8712);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(Z)V", line = 2323)
    public final void method3493(boolean arg0) {
        if (~this.field8727 != -9) {
            this.method3505((byte) 106);
            this.method3524(-545832829, true);
            this.method3484(1, true);
            this.method3500((byte) -122, true);
            this.method3460(0, 1);
            this.field8727 = 8;
        }
        if (arg0) {
            ++field8474;
        }
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(Z)V", line = 2345)
    private final void method3494(boolean arg0) {
        if (!arg0) {
            this.method3500((byte) 15, false);
        }
        ++field8556;
        if (!this.field8682) {
            float[] var2 = this.field8735;
            float var3 = (float) this.field8691;
            float var4 = (float) this.field8659;
            float var5 = (float) (-this.field8696) * this.field8664 / (float) this.field8736;
            float var6 = (float) (-this.field8679) * this.field8664 / (float) this.field8692;
            float var7 = (float) (-this.field8679 + this.field8553) * this.field8664 / (float) this.field8692;
            float var8 = (float) (-this.field8696 + this.field8593) * this.field8664 / (float) this.field8736;
            if (var6 != var7 && var5 != var8) {
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[14] = var3 / (-var4 + var3);
                var2[5] = 2.0F / (var8 - var5);
                var2[15] = 1.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[3] = 0.0F;
                var2[11] = 0.0F;
            } else {
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[11] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method3523(-118);
            this.field8682 = true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "(I)V", line = 2415)
    private final void method3495(int arg0) {
        this.field8764 = this.method902(0, true);
        ++field8572;
        this.field8764.method2642(24, arg0, -10760);
        this.field8750 = this.method893(new class357[] { new class357(class542.field7354) }, (byte) -124);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([[BLdga;B)V", line = 2427)
    public static final void method3496(byte[][] arg0, class219 arg1, byte arg2) {
        ++field8586;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field2883; ++var4) {
            class230.method1508((byte) -48);
            for (int var9 = 0; var9 < class597.field8132 >> 3; ++var9) {
                for (int var10 = 0; ~(class628.field8800 >> 3) < ~var10; ++var10) {
                    int var11 = class590.field7953[var4][var9][var10];
                    if (~var11 != 0) {
                        int var12 = (var11 & 66711379) >> 24;
                        if (!arg1.field2895 || ~var12 == -1) {
                            int var13 = 3 & var11 >> 1;
                            int var14 = (16774431 & var11) >> 14;
                            int var15 = var11 >> 3 & 2047;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; class186.field2487.length > var17; ++var17) {
                                if (~class186.field2487[var17] == ~var16 && arg0[var17] != null) {
                                    class376 var18 = new class376(arg0[var17]);
                                    arg1.method1434(var13, var9 * 8, var10 * 8, class514.field7038, var12, var4, var14, var18, var15, arg2 ^ -91);
                                    arg1.method1445(var10 * 8, false, var4, ~var3[0] == 0 ? var3 : null, var12, var9 * 8, var18, var14, var13, var15, class379.field5542);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != -91) {
            method3468((byte) 69);
        }
        for (int var5 = 0; arg1.field2883 > var5; ++var5) {
            class230.method1508((byte) -93);
            for (int var6 = 0; class597.field8132 >> 3 > var6; ++var6) {
                for (int var7 = 0; ~var7 > ~(class628.field8800 >> 3); ++var7) {
                    int var8 = class590.field7953[var5][var6][var7];
                    if (~var8 == 0) {
                        arg1.method1430(var7 * 8, 8, var5, var6 * 8, 8, (byte) 111);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class296.field4302 = class457.field6339.method784(-18085, var3[2], class563.field7548, var3[3], var3[1], var3[0]);
            class319.field4602 = var3[4];
        }
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(Z)V", line = 2550)
    public final void method3497(boolean arg0) {
        if (arg0) {
            ++field8550;
            if (class120.field1751 != this.field8743) {
                class78 var2 = this.field8743;
                this.field8743 = class120.field1751;
                if (var2.method673(122)) {
                    this.method3515(3);
                }
                this.field8697 = this.field8685;
                this.field8727 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "(I)V", line = 2574)
    private final void method3498(int arg0) {
        if (arg0 != 15) {
            this.field8675 = -0.028265707F;
        }
        ++field8466;
        if (!this.field8738) {
            float[] var2 = this.field8672;
            this.field8738 = true;
            if (this.field8553 != 0 && this.field8593 != 0) {
                var2[12] = -1.0F;
                var2[13] = 1.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[10] = 0.5F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[7] = 0.0F;
                var2[5] = -2.0F / (float) this.field8593;
                var2[14] = 0.5F;
                var2[1] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (float) this.field8553;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
            } else {
                var2[5] = 1.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[13] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([I)V", line = 2631)
    public final void method561(int[] arg0) {
        ++field8619;
        arg0[1] = this.field8593;
        arg0[0] = this.field8553;
    }

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "(I)V", line = 2644)
    private final void method3499(int arg0) {
        this.field8674[14] = this.field8732;
        ++field8598;
        this.field8674[10] = this.field8675;
        this.field8688 = (this.field8674[14] - (float) this.field8659) / this.field8674[10];
        if (arg0 != 12858) {
            this.field8685 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "(IIIIIII)I", line = 2661)
    public final int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8565;
        int var8 = 0;
        float var9 = (float) arg2 * this.field8638.field10456 + (float) arg0 * this.field8638.field10464 + (float) arg1 * this.field8638.field10478 + this.field8638.field10454;
        float var10 = (float) arg5 * this.field8638.field10456 + (float) arg3 * this.field8638.field10464 + (float) arg4 * this.field8638.field10478 + this.field8638.field10454;
        if (var9 < (float) this.field8691 && (float) this.field8691 > var10) {
            var8 |= 16;
        } else if (var9 > (float) this.field8659 && var10 > (float) this.field8659) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field8638.field10479 + (float) arg0 * this.field8638.field10450 + (float) arg1 * this.field8638.field10441 + this.field8638.field10445) * (float) this.field8692 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field8638.field10479 + (float) arg3 * this.field8638.field10450 + (float) arg4 * this.field8638.field10441 + this.field8638.field10445) * (float) this.field8692 / (float) arg6);
        if ((float) var11 < this.field8650 && (float) var12 < this.field8650) {
            var8 |= 1;
        } else if ((float) var11 > this.field8660 && this.field8660 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field8638.field10439 + (float) arg0 * this.field8638.field10474 + (float) arg1 * this.field8638.field10434 + this.field8638.field10442) * (float) this.field8736 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field8638.field10439 + (float) arg3 * this.field8638.field10474 + (float) arg4 * this.field8638.field10434 + this.field8638.field10442) * (float) this.field8736 / (float) arg6);
        if ((float) var13 < this.field8712 && (float) var14 < this.field8712) {
            var8 |= 4;
        } else if (this.field8729 < (float) var13 && (float) var14 > this.field8729) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(BZ)V", line = 2705)
    public final void method3500(byte arg0, boolean arg1) {
        if (arg1 == !this.field8657) {
            this.field8657 = arg1;
            this.method918(0);
            this.field8727 &= -32;
        }
        int var3 = -45 / ((70 - arg0) / 52);
        ++field8456;
    }

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "(B)V", line = 2731)
    private final void method3501(byte arg0) {
        this.method889(108);
        ++field8615;
        int var2 = -44 % ((14 - arg0) / 39);
        if (this.field8717 != null) {
            this.field8717.method1308(1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "()Z", line = 2748)
    public final boolean method484() {
        ++field8577;
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIZB)V", line = 2756)
    public final void method3502(boolean arg0, int arg1, boolean arg2, byte arg3) {
        ++field8514;
        if (~this.field8719 != ~arg1 || this.field8645 == !this.field8681) {
            class248 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field8645 ? 3 : 0;
            if (arg1 < 0) {
                this.method3504((byte) -57);
            } else {
                var5 = this.field8708.method230(false, arg1);
                class662 var10 = super.field912.method1174(arg1, true);
                if (~var10.field9152 == -1 && var10.field9157 == 0) {
                    this.method3504((byte) -57);
                } else {
                    int var11 = var10.field9143 ? 64 : 128;
                    int var12 = var11 * 50;
                    class754 var13 = this.method3506((byte) -103);
                    var13.method4210(0.0F, (float) (this.field8699 % var12 * var10.field9152) / (float) var12, (float) (this.field8699 % var12 * var10.field9157) / (float) var12, (byte) -20);
                    this.method3471(30, class413.field5937);
                }
                var6 = var10.field9141;
                if (!this.field8645) {
                    var7 = var10.field9149;
                    var8 = var10.field9154;
                    var9 = var10.field9140;
                }
            }
            this.method3459(8, var7, arg0, arg2, var8, var9);
            if (this.field8717 == null) {
                this.method3520(true, var5);
                this.method3503((byte) -108, var6);
            } else {
                this.field8717.method959(var6, (byte) 125, var5);
            }
            this.field8681 = this.field8645;
            this.field8719 = arg1;
        }
        if (arg3 != -112) {
            this.field8746 = null;
        }
        this.field8727 &= -8;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(BI)V", line = 2824)
    public final void method3503(byte arg0, int arg1) {
        ++field8562;
        if (~arg1 != -2) {
            if (~arg1 == -1) {
                this.method3513(class364.field5299, class364.field5299, -87);
            } else if (arg1 != 2) {
                if (arg1 == 3) {
                    this.method3513(class364.field5299, class187.field2499, -114);
                } else if (arg1 == 4) {
                    this.method3513(class165.field2224, class165.field2224, 86);
                }
            } else {
                this.method3513(class521.field7150, class412.field5923, -81);
            }
        } else {
            this.method3513(class521.field7150, class521.field7150, -31);
        }
        int var3 = -48 / ((arg0 - -34) / 63);
    }

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "(B)V", line = 2852)
    public final void method3504(byte arg0) {
        if (arg0 == -57) {
            ++field8464;
            if (this.field8686[this.field8662] != class57.field799) {
                this.field8686[this.field8662] = class57.field799;
                this.field8653[this.field8662].method967();
                this.method3481(arg0 + 58);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "(B)V", line = 2870)
    private final void method3505(byte arg0) {
        if (class584.field7799 != this.field8743) {
            class78 var2 = this.field8743;
            this.field8743 = class584.field7799;
            if (!var2.method673(81)) {
                this.method3515(3);
            }
            this.method3479(11);
            this.field8697 = this.field8674;
            this.method3501((byte) -35);
            this.field8727 &= -8;
        }
        if (arg0 < 2) {
            this.method3456(-95);
        }
        ++field8588;
    }

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "(B)Lwn;", line = 2896)
    public final class754 method3506(byte arg0) {
        ++field8476;
        if (arg0 > -102) {
            this.method3453(-89);
        }
        return this.field8653[this.field8662];
    }

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "(IIII)V", line = 2907)
    public final void method556(int arg0, int arg1, int arg2, int arg3) {
        ++field8483;
        boolean var5 = false;
        if (this.field8652 < arg0) {
            this.field8652 = arg0;
            var5 = true;
        }
        if (arg2 < this.field8677) {
            var5 = true;
            this.field8677 = arg2;
        }
        if (arg1 > this.field8671) {
            var5 = true;
            this.field8671 = arg1;
        }
        if (~arg3 > ~this.field8715) {
            var5 = true;
            this.field8715 = arg3;
        }
        if (var5) {
            if (!this.field8767) {
                this.field8767 = true;
                this.method887(70);
            }
            this.method871(-2);
            this.method3507(-1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "(I)V", line = 2957)
    private final void method3507(int arg0) {
        if (arg0 == -1) {
            this.field8650 = (float) (-this.field8679 + this.field8652);
            this.field8660 = (float) (-this.field8679 + this.field8677);
            this.field8729 = (float) (-this.field8696 + this.field8715);
            ++field8538;
            this.field8712 = (float) (-this.field8696 + this.field8671);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIIII)Ldn;", line = 2972)
    public final class544 method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8499;
        return new class378(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "(I)V", line = 2981)
    public final void method3508(int arg0) {
        ++field8468;
        if (arg0 != 11570) {
            this.method556(-25, -46, -63, -77);
        }
        this.field8633 = false;
        this.method3522(true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILss;I)V", line = 2997)
    public final void method3509(int arg0, class457 arg1, int arg2) {
        if (arg2 >= -76) {
            this.field8666 = null;
        }
        ++field8484;
        this.method916(arg1, false, true, arg0);
    }

    @OriginalMember(owner = "client!ai", name = "KA", descriptor = "(IIII)V", line = 3008)
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        ++field8516;
        if (~arg0 >= -1 && arg2 >= this.field8553 - 1 && arg1 <= 0 && this.field8593 + -1 <= arg3) {
            this.method543();
        } else {
            this.field8677 = ~this.field8553 > ~arg2 ? 0 : arg2;
            this.field8715 = arg3 <= this.field8553 ? arg3 : 0;
            this.field8671 = arg1 >= 0 ? arg1 : 0;
            this.field8652 = arg0 < 0 ? 0 : arg0;
            if (!this.field8767) {
                this.field8767 = true;
                this.method887(120);
            }
            this.method871(-2);
            this.method3507(-1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "(I)V", line = 3036)
    private final void method3510(int arg0) {
        this.field8682 = false;
        ++field8559;
        this.method3494(true);
        if (class276.field4094 == this.field8743) {
            this.method3501((byte) 76);
        }
        if (arg0 != -14326) {
            this.method871(115);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lgfa;IIII)Lka;", line = 3051)
    public final class500 method510(class782 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8531;
        return new class593(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "(I)V", line = 3059)
    public final void method3511(int arg0) {
        ++field8469;
        if (this.field8727 != 16) {
            this.method3446(-83);
            this.method3524(arg0 ^ 545832828, true);
            this.method3484(1, true);
            this.method3500((byte) -62, true);
            this.method3460(0, 1);
            this.field8727 = 16;
        }
        if (arg0 != -1) {
            this.method457();
        }
    }

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "(I)V", line = 3080)
    private final void method3512(int arg0) {
        if (arg0 == -16826) {
            this.field8738 = false;
            ++field8602;
            if (class549.field7441 == this.field8743) {
                this.method3498(arg0 + 16841);
                this.method3501((byte) -31);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lln;Lln;I)V", line = 3100)
    public final void method3513(class400 arg0, class400 arg1, int arg2) {
        int var4 = 112 / ((23 - arg2) / 41);
        ++field8463;
        boolean var5 = false;
        if (this.field8730[this.field8662] != arg1) {
            this.field8730[this.field8662] = arg1;
            var5 = true;
            this.method860(13608);
        }
        if (this.field8694[this.field8662] != arg0) {
            this.field8694[this.field8662] = arg0;
            this.method894(7);
            var5 = true;
        }
        if (var5) {
            this.field8727 &= -30;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLss;I)V", line = 3131)
    public final void method3514(byte arg0, class457 arg1, int arg2) {
        int var4 = 122 / ((arg0 - 33) / 60);
        this.method907(false, false, (byte) -67, arg2, arg1);
        ++field8453;
    }

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "(I)V", line = 3141)
    private final void method3515(int arg0) {
        this.field8734 = false;
        ++field8611;
        if (this.field8717 != null) {
            this.field8717.method1302((byte) 117);
        }
        if (arg0 != 3) {
            this.field8763 = null;
        }
        this.method856(24);
    }

    @OriginalMember(owner = "client!ai", name = "JA", descriptor = "(IIIIII)I", line = 3159)
    public final int method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8528;
        int var7 = 0;
        float var8 = (float) arg2 * this.field8638.field10456 + (float) arg0 * this.field8638.field10464 + (float) arg1 * this.field8638.field10478 + this.field8638.field10454;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field8638.field10456 + (float) arg3 * this.field8638.field10464 + (float) arg4 * this.field8638.field10478 + this.field8638.field10454;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field8691 && (float) this.field8691 > var9) {
            var7 |= 16;
        } else if ((float) this.field8659 < var8 && (float) this.field8659 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field8638.field10479 + (float) arg0 * this.field8638.field10450 + (float) arg1 * this.field8638.field10441 + this.field8638.field10445) * (float) this.field8692 / var8);
        int var11 = (int) (((float) arg5 * this.field8638.field10479 + (float) arg3 * this.field8638.field10450 + (float) arg4 * this.field8638.field10441 + this.field8638.field10445) * (float) this.field8692 / var9);
        if ((float) var10 < this.field8650 && this.field8650 > (float) var11) {
            var7 |= 1;
        } else if (this.field8660 < (float) var10 && (float) var11 > this.field8660) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field8638.field10439 + (float) arg0 * this.field8638.field10474 + (float) arg1 * this.field8638.field10434 + this.field8638.field10442) * (float) this.field8736 / var8);
        int var13 = (int) (((float) arg5 * this.field8638.field10439 + (float) arg3 * this.field8638.field10474 + (float) arg4 * this.field8638.field10434 + this.field8638.field10442) * (float) this.field8736 / var9);
        if ((float) var12 < this.field8712 && this.field8712 > (float) var13) {
            var7 |= 4;
        } else if (this.field8729 < (float) var12 && (float) var13 > this.field8729) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "(I)V", line = 3211)
    private final void method3516(int arg0) {
        if (this.field8717 != null) {
            this.field8717.method1305((byte) -127);
        }
        ++field8592;
        if (arg0 == 4) {
            this.method862((byte) 58);
        }
    }

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "(Z)V", line = 3228)
    public final void method474(boolean arg0) {
        ++field8454;
        this.field8728 = arg0;
        this.method918(0);
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "()Z", line = 3238)
    public final boolean method478() {
        ++field8610;
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3246)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field8525;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "()V", line = 3253)
    public void method465() {
        if (!this.field8684) {
            for (class101 var1 = this.field8457.method2551((byte) -108); var1 != null; var1 = this.field8457.method2542(-122)) {
                ((class688) var1).method3820(-28982);
            }
            Enumeration var2 = this.field8626.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method878(114, var3, this.field8626.get(var3));
            }
            class182.method1269(true, -11692, false);
            this.field8498.release();
            this.field8684 = true;
        }
        ++field8536;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BIIZ[I)Lec;", line = 3287)
    public final class248 method3517(byte arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        ++field8534;
        if (arg0 > -102) {
            this.field8663 = true;
        }
        return this.method857(0, arg4, arg1, 0, arg3, arg2, 9567);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIZ)Lvr;", line = 3305)
    public final class147 method562(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8458;
        class572 var6 = new class572(this, arg2, arg3, arg4);
        var6.method1082(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 3319)
    public final void method459(int arg0) {
        ++field8623;
    }

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "(I)V", line = 3326)
    public final void method3518(int arg0) {
        ++field8594;
        Hashtable var2 = new Hashtable();
        if (this.field8626 != null && !this.field8626.isEmpty()) {
            Enumeration var3 = this.field8626.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method875((byte) 86, var4));
            }
        }
        this.field8626 = var2;
        this.method3467(0);
        this.method3495(12);
        int var5 = 115 % ((-32 - arg0) / 40);
        this.method3477(256);
        this.field8665.method4064(this, -1403085716);
    }

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "()I", line = 3358)
    public final int method453() {
        ++field8504;
        return this.field8766;
    }

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "(I)Lfn;", line = 3369)
    public final class149 method3519(int arg0) {
        if (arg0 > -41) {
            this.field8724 = -25;
        }
        ++field8634;
        return this.field8678 == null ? null : this.field8678.method2418(22113);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLbm;)V", line = 3381)
    public final void method3520(boolean arg0, class123 arg1) {
        if (!arg0) {
            this.field8650 = 1.4081922F;
        }
        if (this.field8713[this.field8662] != arg1) {
            this.field8713[this.field8662] = arg1;
            if (arg1 == null) {
                this.method917((byte) -87);
            } else {
                arg1.method1004(20464);
            }
            this.field8727 &= -2;
        }
        ++field8503;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Luu;)V", line = 3403)
    public final void method526(class303 arg0) {
        this.field8638 = (class754) arg0;
        ++field8546;
        this.field8640.method986(this.field8638);
        this.field8640.method4206(31433);
        this.field8641.method4191(16383, this.field8640);
        this.field8639.method4191(16383, this.field8638);
        if (this.field8743.method673(70)) {
            this.method3515(3);
        }
    }

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "(I)I", line = 3423)
    public final int method3521(int arg0) {
        int var2 = -70 / ((arg0 - 50) / 62);
        ++field8614;
        return this.field8690;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()Luu;", line = 3433)
    public final class303 method450() {
        ++field8587;
        return this.field8762;
    }

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "(Z)V", line = 3443)
    private final void method3522(boolean arg0) {
        ++field8539;
        if (!arg0) {
            this.field8701 = 15;
        }
        if (class549.field7441 == this.field8743) {
            float var2 = this.method859(-85);
            this.field8636.method4208(18645, 0.0F, var2, var2);
        }
        this.field8734 = false;
        this.method900(11);
        if (this.field8717 != null) {
            this.field8717.method1307(88);
        }
    }

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "(I)V", line = 3466)
    private final void method3523(int arg0) {
        this.field8689 = (float) this.field8659;
        ++field8523;
        if (arg0 > -48) {
            this.field8714 = 63;
        }
    }

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "()Z", line = 3481)
    public final boolean method485() {
        ++field8465;
        return this.field8737;
    }

    @OriginalMember(owner = "client!ai", name = "DA", descriptor = "(IIII)V", line = 3489)
    public final void method540(int arg0, int arg1, int arg2, int arg3) {
        this.field8692 = arg2;
        this.field8696 = arg1;
        ++field8486;
        this.field8679 = arg0;
        this.field8736 = arg3;
        this.method3510(-14326);
        this.method3457(16202);
        this.method3497(true);
        this.method3507(-1);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I", line = 3504)
    public final int method517(int arg0, int arg1) {
        ++field8445;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(IZ)V", line = 3514)
    public final void method3524(int arg0, boolean arg1) {
        ++field8467;
        if (!arg1 == this.field8670) {
            this.field8670 = arg1;
            this.method903((byte) 82);
            this.field8727 &= -32;
        }
        if (arg0 != -545832829) {
            this.method893((class357[]) null, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[I[I)Laa;", line = 3532)
    public final class514 method523(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8567;
        return class10.method87(arg3, arg2, this, arg1, arg0, -106);
    }

    @OriginalMember(owner = "client!ai", name = "la", descriptor = "()V", line = 3540)
    public final void method543() {
        this.field8652 = 0;
        this.field8715 = this.field8593;
        this.field8677 = this.field8553;
        ++field8470;
        this.field8671 = 0;
        if (this.field8767) {
            this.field8767 = false;
            this.method887(78);
        }
        this.method3507(-1);
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(II)V", line = 3567)
    public final void method466(int arg0, int arg1) {
        if (this.field8691 != arg0 || ~this.field8659 != ~arg1) {
            this.field8691 = arg0;
            this.field8659 = arg1;
            this.method3457(16202);
            this.method3510(-14326);
            this.method3516(4);
        }
        ++field8599;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 3583)
    public final void method469(int arg0) {
        ++field8492;
    }

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "(ILaa;II)V", line = 3591)
    public final void method518(int arg0, class514 arg1, int arg2, int arg3) {
        ++field8637;
        class659 var5 = (class659) arg1;
        class248 var6 = var5.field9116;
        this.method3478(4);
        this.method3520(true, var6);
        this.method3460(0, 1);
        this.method3513(class521.field7150, class521.field7150, -128);
        this.method3514((byte) 122, class109.field1493, 0);
        this.method3525(arg0, 1);
        this.field8636.method4197((byte) 64, (float) this.field8553, 0.0F, (float) this.field8593);
        this.method3508(11570);
        this.field8653[0].method4197((byte) 117, var6.method1666(-18982, (float) this.field8553), 1.0F, var6.method1670(122, (float) this.field8593));
        this.field8653[0].method4208(18645, 0.0F, var6.method1670(127, (float) (-arg3)), var6.method1666(-18982, (float) (-arg2)));
        this.field8686[0] = class413.field5937;
        this.method3481(1);
        this.method3483(-27539);
        this.method3504((byte) -57);
        this.method3514((byte) -55, class122.field1782, 0);
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(II)V", line = 3617)
    public final void method3525(int arg0, int arg1) {
        ++field8497;
        if (this.field8704 != arg0) {
            this.field8704 = arg0;
            this.method897(0);
        }
        if (arg1 != 1) {
            this.field8553 = -9;
        }
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(II)Laba;", line = 3635)
    public class188 method899(int arg0, int arg1) {
        if (arg1 != 2) {
            this.field8670 = true;
        }
        ++field8566;
        if (~arg0 != -7) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    return ~arg0 == -8 ? new class326(this) : new class117(this);
                } else {
                    return new class487(this, this.field8510);
                }
            } else {
                return new class365(this);
            }
        } else {
            return new class609(this);
        }
    }

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "()Z", line = 3688)
    public final boolean method519() {
        ++field8540;
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[Luca;)V", line = 3696)
    public final void method486(int arg0, class540[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field8723[var3] = arg1[var3];
        }
        ++field8576;
        this.field8739 = arg0;
        if (this.field8743.method673(84)) {
            this.method853(true);
        }
    }

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "()V", line = 3720)
    public final void method529() {
        if (this.field8708 != null) {
            this.field8708.method232(true);
        }
        ++field8473;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZ)Lvr;", line = 3738)
    public final class147 method508(int arg0, int arg1, boolean arg2) {
        ++field8500;
        return new class572(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "(III)V", line = 3747)
    public final void method550(int arg0, int arg1, int arg2) {
        ++field8552;
        if (~this.field8651 != ~arg0 || this.field8721 != arg1 || ~this.field8714 != ~arg2) {
            this.field8714 = arg2;
            this.field8651 = arg0;
            this.field8721 = arg1;
            this.method3516(4);
            this.method903((byte) 82);
        }
    }

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "(I)V", line = 3763)
    private final void method3526(int arg0) {
        this.method890(1);
        ++field8595;
        this.method912((byte) -57);
        this.method874(false);
        this.method853(true);
        this.method879(-101);
        this.method861(arg0 ^ arg0);
        this.method914(4);
        this.method906(true);
        this.method918(0);
        this.method903((byte) 82);
        this.method862((byte) 58);
        this.method904(arg0 ^ 1);
        this.method882((byte) -111);
        this.method915(125);
        for (int var2 = this.field8711 + -1; var2 >= 0; --var2) {
            this.method3470((byte) -47, var2);
            this.method860(13608);
            this.method894(7);
            this.method3504((byte) -57);
        }
        this.method897(arg0 ^ 1);
        this.method885((byte) -30);
        this.method889(arg0 ^ 116);
        this.method900(arg0 + 10);
        this.method856(24);
    }

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "(I)V", line = 3803)
    public static void method3527(int arg0) {
        if (arg0 == 0) {
            field8501 = null;
            field8551 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "()[I", line = 3814)
    public final int[] method496() {
        ++field8507;
        return new int[] { this.field8679, this.field8696, this.field8692, this.field8736 };
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILaga;)V")
    public abstract void method870(int arg0, class696 arg1);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)V")
    public abstract void method914(int arg0);

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "(I)V")
    public abstract void method894(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLsw;II[BIII)Lec;")
    public abstract class248 method873(boolean arg0, class787 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V")
    public abstract void method872(byte arg0);

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "(I)V")
    public abstract void method897(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lid;II)V")
    public abstract void method883(class612 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILoh;IIZLwt;)V")
    public abstract void method864(int arg0, int arg1, class427 arg2, int arg3, int arg4, boolean arg5, class330 arg6);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lsw;ILig;)Z")
    public abstract boolean method863(class787 arg0, int arg1, class258 arg2);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([Lrd;B)Lnc;")
    public abstract class26 method893(class357[] arg0, byte arg1);

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "(I)V")
    public abstract void method861(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method878(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "(I)V")
    public abstract void method904(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Loh;")
    public abstract class427 method908(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "(I)V")
    public abstract void method915(int arg0);

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "(I)V")
    public abstract void method871(int arg0);

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "(I)V")
    public abstract void method856(int arg0);

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(B)V")
    public abstract void method862(byte arg0);

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "(I)V")
    public abstract void method918(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lsw;III[BI)Loo;")
    public abstract class654 method896(class787 arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lsw;Lig;Z)Z")
    public abstract boolean method910(class787 arg0, class258 arg1, boolean arg2);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lwt;IIB)V")
    public abstract void method855(class330 arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "(I)V")
    public abstract void method887(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[FLsw;IIIIZ)Lec;")
    public abstract class248 method858(int arg0, float[] arg1, class787 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "(I)F")
    public abstract float method859(int arg0);

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "(B)V")
    public abstract void method911(byte arg0);

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "(B)V")
    public abstract void method917(byte arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method891(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "(B)V")
    public abstract void method882(byte arg0);

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(Z)V")
    public abstract void method906(boolean arg0);

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "(B)V")
    public abstract void method903(byte arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lnc;B)V")
    public abstract void method913(class26 arg0, byte arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lss;ZZI)V")
    public abstract void method916(class457 arg0, boolean arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method898(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "(I)V")
    public abstract void method879(int arg0);

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "(B)V")
    public abstract void method912(byte arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZBILss;)V")
    public abstract void method907(boolean arg0, boolean arg1, byte arg2, int arg3, class457 arg4);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[IIIZII)Lec;")
    public abstract class248 method857(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "(B)V")
    public abstract void method885(byte arg0);

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "(I)V")
    public abstract void method890(int arg0);

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "(I)V")
    public abstract void method889(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZI[[I)Lfn;")
    public abstract class149 method869(byte arg0, boolean arg1, int arg2, int[][] arg3);

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "(I)V")
    public abstract void method860(int arg0);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(Z)V")
    public abstract void method874(boolean arg0);

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(II)V")
    public abstract void method905(int arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(IZ)V")
    public abstract void method895(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILig;Lsw;I)Lec;")
    public abstract class248 method892(int arg0, int arg1, class258 arg2, class787 arg3, int arg4);

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "(I)V")
    public abstract void method900(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method875(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(IZ)Lid;")
    public abstract class612 method902(int arg0, boolean arg1);
}
