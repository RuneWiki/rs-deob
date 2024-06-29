import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class580 extends class638 {

    @OriginalMember(owner = "client!gj", name = "Ub", descriptor = "Lsu;")
    private class192 field7858 = new class192();

    @OriginalMember(owner = "client!gj", name = "Ud", descriptor = "Z")
    public boolean field7962 = true;

    @OriginalMember(owner = "client!gj", name = "Ed", descriptor = "Lje;")
    public class367 field7946 = new class367();

    @OriginalMember(owner = "client!gj", name = "Vd", descriptor = "Lje;")
    public class367 field7963 = new class367();

    @OriginalMember(owner = "client!gj", name = "Xd", descriptor = "Lje;")
    public class367 field7965 = new class367();

    @OriginalMember(owner = "client!gj", name = "Yd", descriptor = "Lje;")
    public class367 field7966 = new class367();

    @OriginalMember(owner = "client!gj", name = "Zd", descriptor = "Lje;")
    private class367 field7967 = new class367();

    @OriginalMember(owner = "client!gj", name = "ae", descriptor = "Lje;")
    private class367 field7968 = new class367();

    @OriginalMember(owner = "client!gj", name = "je", descriptor = "I")
    private int field7977 = 0;

    @OriginalMember(owner = "client!gj", name = "ne", descriptor = "Z")
    private boolean field7981 = false;

    @OriginalMember(owner = "client!gj", name = "Ne", descriptor = "I")
    public int field8007 = 128;

    @OriginalMember(owner = "client!gj", name = "ve", descriptor = "I")
    public int field7989 = 50;

    @OriginalMember(owner = "client!gj", name = "Ie", descriptor = "I")
    public int field8002 = -1;

    @OriginalMember(owner = "client!gj", name = "ke", descriptor = "I")
    public int field7978 = 0;

    @OriginalMember(owner = "client!gj", name = "Ce", descriptor = "F")
    public float field7996 = 1.0F;

    @OriginalMember(owner = "client!gj", name = "le", descriptor = "I")
    private int field7979 = 16777215;

    @OriginalMember(owner = "client!gj", name = "ue", descriptor = "F")
    private float field7988 = 1.0F;

    @OriginalMember(owner = "client!gj", name = "Pe", descriptor = "I")
    public int field8009 = 0;

    @OriginalMember(owner = "client!gj", name = "fe", descriptor = "I")
    public int field7973 = 0;

    @OriginalMember(owner = "client!gj", name = "ie", descriptor = "Z")
    public boolean field7976 = false;

    @OriginalMember(owner = "client!gj", name = "pe", descriptor = "Z")
    public boolean field7983 = true;

    @OriginalMember(owner = "client!gj", name = "Ue", descriptor = "F")
    public float field8014 = 3584.0F;

    @OriginalMember(owner = "client!gj", name = "Le", descriptor = "I")
    public int field8005 = -1;

    @OriginalMember(owner = "client!gj", name = "ce", descriptor = "I")
    public int field7970 = 0;

    @OriginalMember(owner = "client!gj", name = "me", descriptor = "[F")
    private float[] field7980 = new float[16];

    @OriginalMember(owner = "client!gj", name = "kf", descriptor = "I")
    public int field8029 = 0;

    @OriginalMember(owner = "client!gj", name = "jf", descriptor = "[F")
    private float[] field8028 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gj", name = "tf", descriptor = "I")
    public int field8038 = 512;

    @OriginalMember(owner = "client!gj", name = "lf", descriptor = "I")
    public int field8030 = -1;

    @OriginalMember(owner = "client!gj", name = "be", descriptor = "Z")
    public boolean field7969 = true;

    @OriginalMember(owner = "client!gj", name = "Ze", descriptor = "F")
    public float field8019 = 3584.0F;

    @OriginalMember(owner = "client!gj", name = "Ge", descriptor = "Z")
    public boolean field8000 = false;

    @OriginalMember(owner = "client!gj", name = "Qe", descriptor = "I")
    public int field8010 = 0;

    @OriginalMember(owner = "client!gj", name = "vf", descriptor = "I")
    public int field8040 = 0;

    @OriginalMember(owner = "client!gj", name = "he", descriptor = "I")
    public int field7975 = 0;

    @OriginalMember(owner = "client!gj", name = "xe", descriptor = "I")
    private int field7991 = -1;

    @OriginalMember(owner = "client!gj", name = "Ye", descriptor = "Z")
    public boolean field8018 = false;

    @OriginalMember(owner = "client!gj", name = "wf", descriptor = "I")
    public int field8041 = 3584;

    @OriginalMember(owner = "client!gj", name = "Af", descriptor = "Z")
    public boolean field8045 = true;

    @OriginalMember(owner = "client!gj", name = "Hf", descriptor = "F")
    public float field8052 = 1.0F;

    @OriginalMember(owner = "client!gj", name = "Cf", descriptor = "F")
    public float field8047 = -1.0F;

    @OriginalMember(owner = "client!gj", name = "te", descriptor = "[F")
    private float[] field7987 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gj", name = "rf", descriptor = "I")
    public int field8036 = 3;

    @OriginalMember(owner = "client!gj", name = "ff", descriptor = "F")
    public float field8025 = -1.0F;

    @OriginalMember(owner = "client!gj", name = "Ef", descriptor = "[F")
    private float[] field8049 = new float[16];

    @OriginalMember(owner = "client!gj", name = "ef", descriptor = "[F")
    public float[] field8024 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!gj", name = "He", descriptor = "[F")
    public float[] field8001 = this.field7987;

    @OriginalMember(owner = "client!gj", name = "Bf", descriptor = "[F")
    private float[] field8046 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gj", name = "of", descriptor = "Z")
    private boolean field8033 = false;

    @OriginalMember(owner = "client!gj", name = "Mf", descriptor = "I")
    private int field8057 = 1;

    @OriginalMember(owner = "client!gj", name = "zf", descriptor = "Lbf;")
    public class492 field8044 = class23.field320;

    @OriginalMember(owner = "client!gj", name = "gf", descriptor = "Z")
    private boolean field8026 = false;

    @OriginalMember(owner = "client!gj", name = "se", descriptor = "[Ltf;")
    private class266[] field7986 = new class266[10];

    @OriginalMember(owner = "client!gj", name = "Nf", descriptor = "Z")
    public boolean field8058 = false;

    @OriginalMember(owner = "client!gj", name = "ye", descriptor = "I")
    private int field7992 = 0;

    @OriginalMember(owner = "client!gj", name = "Me", descriptor = "Z")
    private boolean field8006 = false;

    @OriginalMember(owner = "client!gj", name = "cf", descriptor = "I")
    public int field8022 = 8;

    @OriginalMember(owner = "client!gj", name = "Qf", descriptor = "Z")
    public boolean field8061 = true;

    @OriginalMember(owner = "client!gj", name = "Pf", descriptor = "Z")
    public boolean field8060 = true;

    @OriginalMember(owner = "client!gj", name = "ge", descriptor = "Z")
    private boolean field7974 = false;

    @OriginalMember(owner = "client!gj", name = "Tf", descriptor = "I")
    public int field8064 = 512;

    @OriginalMember(owner = "client!gj", name = "Kf", descriptor = "I")
    private int field8055 = 0;

    @OriginalMember(owner = "client!gj", name = "uf", descriptor = "F")
    public float field8039 = 1.0F;

    @OriginalMember(owner = "client!gj", name = "yf", descriptor = "I")
    public int field8043 = 0;

    @OriginalMember(owner = "client!gj", name = "Sf", descriptor = "Lsr;")
    public class228 field8063 = class30.field367;

    @OriginalMember(owner = "client!gj", name = "Se", descriptor = "F")
    private float field8012 = 3000.0F;

    @OriginalMember(owner = "client!gj", name = "Re", descriptor = "I")
    private int field8011 = 0;

    @OriginalMember(owner = "client!gj", name = "Xf", descriptor = "I")
    private int field8068 = -1;

    @OriginalMember(owner = "client!gj", name = "Of", descriptor = "[F")
    private float[] field8059 = new float[16];

    @OriginalMember(owner = "client!gj", name = "Wf", descriptor = "I")
    public int field8067 = 0;

    @OriginalMember(owner = "client!gj", name = "Yf", descriptor = "F")
    public float field8069 = 1.0F;

    @OriginalMember(owner = "client!gj", name = "Zf", descriptor = "[F")
    public float[] field8070 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gj", name = "Be", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7995 = new Stream();

    @OriginalMember(owner = "client!gj", name = "tg", descriptor = "Lje;")
    private class367 field8090 = new class367();

    @OriginalMember(owner = "client!gj", name = "de", descriptor = "I")
    public int field7971;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "Lpj;")
    public class132 field7799;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7805;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7812;

    @OriginalMember(owner = "client!gj", name = "lc", descriptor = "Ljava/lang/Object;")
    public Object field7875;

    @OriginalMember(owner = "client!gj", name = "hd", descriptor = "Ljava/lang/Object;")
    private Object field7923;

    @OriginalMember(owner = "client!gj", name = "Fe", descriptor = "I")
    public int field7999;

    @OriginalMember(owner = "client!gj", name = "wb", descriptor = "I")
    private int field7834;

    @OriginalMember(owner = "client!gj", name = "mc", descriptor = "I")
    public int field7876;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    private int field7802;

    @OriginalMember(owner = "client!gj", name = "sd", descriptor = "I")
    public int field7934;

    @OriginalMember(owner = "client!gj", name = "oe", descriptor = "Lnr;")
    private class53 field7982;

    @OriginalMember(owner = "client!gj", name = "qb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field7828;

    @OriginalMember(owner = "client!gj", name = "Sc", descriptor = "Lof;")
    public static class568 field7908 = new class568(2, 14);

    @OriginalMember(owner = "client!gj", name = "Ae", descriptor = "F")
    private float field7994;

    @OriginalMember(owner = "client!gj", name = "Oe", descriptor = "F")
    public float field8008;

    @OriginalMember(owner = "client!gj", name = "Ve", descriptor = "F")
    private float field8015;

    @OriginalMember(owner = "client!gj", name = "Xe", descriptor = "F")
    public float field8017;

    @OriginalMember(owner = "client!gj", name = "df", descriptor = "F")
    public float field8023;

    @OriginalMember(owner = "client!gj", name = "mf", descriptor = "F")
    public float field8031;

    @OriginalMember(owner = "client!gj", name = "sf", descriptor = "F")
    public float field8037;

    @OriginalMember(owner = "client!gj", name = "Ff", descriptor = "F")
    public float field8050;

    @OriginalMember(owner = "client!gj", name = "Vf", descriptor = "F")
    private float field8066;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!gj", name = "jb", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!gj", name = "kb", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!gj", name = "lb", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!gj", name = "mb", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!gj", name = "nb", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!gj", name = "ob", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!gj", name = "pb", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!gj", name = "rb", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!gj", name = "sb", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!gj", name = "ub", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!gj", name = "vb", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!gj", name = "xb", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!gj", name = "yb", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!gj", name = "zb", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!gj", name = "Ab", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!gj", name = "Bb", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!gj", name = "Cb", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!gj", name = "Db", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!gj", name = "Eb", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!gj", name = "Fb", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!gj", name = "Gb", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!gj", name = "Hb", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!gj", name = "Ib", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!gj", name = "Jb", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!gj", name = "Kb", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!gj", name = "Lb", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!gj", name = "Mb", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!gj", name = "Nb", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!gj", name = "Ob", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!gj", name = "Pb", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!gj", name = "Qb", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!gj", name = "Rb", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!gj", name = "Sb", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!gj", name = "Tb", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!gj", name = "Vb", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!gj", name = "Wb", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!gj", name = "Xb", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!gj", name = "Yb", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!gj", name = "Zb", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!gj", name = "ac", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!gj", name = "bc", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!gj", name = "cc", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!gj", name = "dc", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!gj", name = "ec", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!gj", name = "fc", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!gj", name = "gc", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!gj", name = "hc", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!gj", name = "ic", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!gj", name = "jc", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!gj", name = "kc", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!gj", name = "nc", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!gj", name = "oc", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!gj", name = "pc", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!gj", name = "qc", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!gj", name = "rc", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!gj", name = "sc", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!gj", name = "tc", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!gj", name = "uc", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!gj", name = "vc", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!gj", name = "wc", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!gj", name = "xc", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!gj", name = "yc", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!gj", name = "zc", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!gj", name = "Ac", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!gj", name = "Bc", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!gj", name = "Cc", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!gj", name = "Dc", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!gj", name = "Ec", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!gj", name = "Fc", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!gj", name = "Hc", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!gj", name = "Ic", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!gj", name = "Jc", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!gj", name = "Kc", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!gj", name = "Lc", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!gj", name = "Mc", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!gj", name = "Nc", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!gj", name = "Oc", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!gj", name = "Pc", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!gj", name = "Qc", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!gj", name = "Rc", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!gj", name = "Tc", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!gj", name = "Uc", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!gj", name = "Vc", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!gj", name = "Wc", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!gj", name = "Xc", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!gj", name = "Yc", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!gj", name = "Zc", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!gj", name = "ad", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!gj", name = "bd", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!gj", name = "cd", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!gj", name = "dd", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!gj", name = "ed", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!gj", name = "fd", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!gj", name = "gd", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!gj", name = "id", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!gj", name = "jd", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!gj", name = "kd", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!gj", name = "ld", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!gj", name = "md", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!gj", name = "nd", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!gj", name = "od", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!gj", name = "pd", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!gj", name = "qd", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!gj", name = "rd", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!gj", name = "td", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!gj", name = "ud", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!gj", name = "wd", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!gj", name = "xd", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!gj", name = "zd", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!gj", name = "Ad", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!gj", name = "Bd", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!gj", name = "Cd", descriptor = "I")
    public int field7944;

    @OriginalMember(owner = "client!gj", name = "Dd", descriptor = "I")
    public int field7945;

    @OriginalMember(owner = "client!gj", name = "Fd", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!gj", name = "Gd", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!gj", name = "Hd", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!gj", name = "Id", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!gj", name = "Jd", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!gj", name = "Kd", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!gj", name = "Ld", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!gj", name = "Md", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!gj", name = "Nd", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!gj", name = "Od", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!gj", name = "Pd", descriptor = "I")
    public int field7957;

    @OriginalMember(owner = "client!gj", name = "Qd", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!gj", name = "Rd", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!gj", name = "Sd", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!gj", name = "Td", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!gj", name = "Wd", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!gj", name = "Ee", descriptor = "I")
    private int field7998;

    @OriginalMember(owner = "client!gj", name = "Je", descriptor = "I")
    public int field8003;

    @OriginalMember(owner = "client!gj", name = "We", descriptor = "I")
    public int field8016;

    @OriginalMember(owner = "client!gj", name = "pf", descriptor = "I")
    public int field8034;

    @OriginalMember(owner = "client!gj", name = "xf", descriptor = "I")
    public int field8042;

    @OriginalMember(owner = "client!gj", name = "Df", descriptor = "I")
    public int field8048;

    @OriginalMember(owner = "client!gj", name = "Gf", descriptor = "I")
    public int field8051;

    @OriginalMember(owner = "client!gj", name = "If", descriptor = "I")
    public int field8053;

    @OriginalMember(owner = "client!gj", name = "Jf", descriptor = "I")
    public int field8054;

    @OriginalMember(owner = "client!gj", name = "Uf", descriptor = "I")
    private int field8065;

    @OriginalMember(owner = "client!gj", name = "ug", descriptor = "I")
    private int field8091;

    @OriginalMember(owner = "client!gj", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!gj", name = "Lf", descriptor = "Ldga;")
    private class189 field8056;

    @OriginalMember(owner = "client!gj", name = "qe", descriptor = "Ltf;")
    private class266 field7984;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "Ldb;")
    public class292 field7810;

    @OriginalMember(owner = "client!gj", name = "ag", descriptor = "Lna;")
    public class42 field8071;

    @OriginalMember(owner = "client!gj", name = "bg", descriptor = "Lna;")
    public class42 field8072;

    @OriginalMember(owner = "client!gj", name = "gg", descriptor = "Lna;")
    public class42 field8077;

    @OriginalMember(owner = "client!gj", name = "hg", descriptor = "Lna;")
    public class42 field8078;

    @OriginalMember(owner = "client!gj", name = "jg", descriptor = "Lna;")
    public class42 field8080;

    @OriginalMember(owner = "client!gj", name = "lg", descriptor = "Lna;")
    public class42 field8082;

    @OriginalMember(owner = "client!gj", name = "ng", descriptor = "Lna;")
    public class42 field8084;

    @OriginalMember(owner = "client!gj", name = "qg", descriptor = "Lna;")
    public class42 field8087;

    @OriginalMember(owner = "client!gj", name = "rg", descriptor = "Lna;")
    public class42 field8088;

    @OriginalMember(owner = "client!gj", name = "sg", descriptor = "Lna;")
    public class42 field8089;

    @OriginalMember(owner = "client!gj", name = "re", descriptor = "Lek;")
    public class467 field7985;

    @OriginalMember(owner = "client!gj", name = "fg", descriptor = "Liq;")
    private class555 field8076;

    @OriginalMember(owner = "client!gj", name = "ig", descriptor = "Liq;")
    private class555 field8079;

    @OriginalMember(owner = "client!gj", name = "De", descriptor = "Llu;")
    private class654 field7997;

    @OriginalMember(owner = "client!gj", name = "og", descriptor = "Ljn;")
    private class659 field8085;

    @OriginalMember(owner = "client!gj", name = "cg", descriptor = "Lfl;")
    public class677 field8073;

    @OriginalMember(owner = "client!gj", name = "dg", descriptor = "Lfl;")
    public class677 field8074;

    @OriginalMember(owner = "client!gj", name = "eg", descriptor = "Lfl;")
    private class677 field8075;

    @OriginalMember(owner = "client!gj", name = "kg", descriptor = "Lfl;")
    private class677 field8081;

    @OriginalMember(owner = "client!gj", name = "mg", descriptor = "Lfl;")
    public class677 field8083;

    @OriginalMember(owner = "client!gj", name = "pg", descriptor = "Lfl;")
    public class677 field8086;

    @OriginalMember(owner = "client!gj", name = "tb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7831;

    @OriginalMember(owner = "client!gj", name = "vd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field7937;

    @OriginalMember(owner = "client!gj", name = "yd", descriptor = "Ljava/awt/Font;")
    public static Font field7940;

    @OriginalMember(owner = "client!gj", name = "Gc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7896;

    @OriginalMember(owner = "client!gj", name = "ee", descriptor = "Z")
    public boolean field7972;

    @OriginalMember(owner = "client!gj", name = "we", descriptor = "Z")
    public boolean field7990;

    @OriginalMember(owner = "client!gj", name = "Ke", descriptor = "Z")
    public boolean field8004;

    @OriginalMember(owner = "client!gj", name = "Te", descriptor = "Z")
    public boolean field8013;

    @OriginalMember(owner = "client!gj", name = "af", descriptor = "Z")
    public boolean field8020;

    @OriginalMember(owner = "client!gj", name = "vg", descriptor = "Z")
    public boolean field8092;

    @OriginalMember(owner = "client!gj", name = "ze", descriptor = "[Lld;")
    public class154[] field7993;

    @OriginalMember(owner = "client!gj", name = "hf", descriptor = "[Lkh;")
    public class15[] field8027;

    @OriginalMember(owner = "client!gj", name = "nf", descriptor = "[Lje;")
    public class367[] field8032;

    @OriginalMember(owner = "client!gj", name = "Rf", descriptor = "[Lek;")
    private class467[] field8062;

    @OriginalMember(owner = "client!gj", name = "bf", descriptor = "[Lnd;")
    public class500[] field8021;

    @OriginalMember(owner = "client!gj", name = "qf", descriptor = "[Lnd;")
    public class500[] field8035;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Lje;")
    public final class367 method3171(int arg0) {
        ++field7780;
        return arg0 != -19068 ? null : this.field8032[this.field8043];
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
    public final void method3172(int arg0, boolean arg1) {
        ++field7803;
        if (this.field8018 != arg1) {
            this.field8018 = arg1;
            this.method354(61);
            this.field8065 &= -8;
        }
        int var3 = 73 % ((arg0 - 5) / 59);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class212 arg6, int arg7, int arg8) {
        ++field7860;
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(Z)V")
    private final void method3173(boolean arg0) {
        this.method335(0);
        if (arg0) {
            ++field7897;
            if (this.field7984 != null) {
                this.field7984.method146((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public abstract void method328(byte arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBLuj;)V")
    public abstract void method294(int arg0, int arg1, byte arg2, class349 arg3);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIF)Lld;")
    public final class154 method457(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7794;
        return new class273(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[FLkf;ZZI)Lhr;")
    public final class483 method3174(int arg0, float[] arg1, class229 arg2, boolean arg3, boolean arg4, int arg5) {
        ++field7813;
        if (arg4) {
            this.method416((int[]) null);
        }
        return this.method361(arg5, arg3, arg2, 0, arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "(IIII)V")
    public final void method433(int arg0, int arg1, int arg2, int arg3) {
        ++field7825;
        boolean var5 = false;
        if (~this.field7970 > ~arg0) {
            this.field7970 = arg0;
            var5 = true;
        }
        if (this.field7978 > arg2) {
            var5 = true;
            this.field7978 = arg2;
        }
        if (~this.field8029 > ~arg1) {
            this.field8029 = arg1;
            var5 = true;
        }
        if (this.field8010 > arg3) {
            this.field8010 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field8092) {
                this.field8092 = true;
                this.method288(-20470);
            }
            this.method364((byte) 14);
            this.method3199(60);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZB)V")
    public final void method3175(boolean arg0, byte arg1) {
        if (arg1 != 67) {
            this.field7971 = 17;
        }
        ++field7830;
        if (arg0 == !this.field7983) {
            this.field7983 = arg0;
            this.method302(18509);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method437(Canvas arg0) {
        ++field7785;
        if (this.field7805 == arg0) {
            throw new RuntimeException();
        } else if (this.field7896.containsKey(arg0)) {
            this.method291((byte) 114, this.field7896.get(arg0), arg0);
            this.field7896.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([Lba;Lq;[Lrc;I)V")
    public final void method393(class352[] arg0, class391 arg1, class494[] arg2, int arg3) {
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method205(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field7961;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
    public final int method444(int arg0, int arg1) {
        ++field7822;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLkf;IIII[F)Lhr;")
    public abstract class483 method361(int arg0, boolean arg1, class229 arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7);

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "()F")
    public final float method3176() {
        ++field7918;
        return this.field8012;
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V")
    public abstract void method302(int arg0);

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(I)V")
    public abstract void method320(int arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[BILkf;I)Lk;")
    public abstract class519 method343(int arg0, int arg1, byte[] arg2, int arg3, class229 arg4, int arg5);

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "(I)V")
    public abstract void method289(int arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILiv;)V")
    public final void method3177(int arg0, int arg1, class84 arg2) {
        if (arg1 > 51) {
            ++field7867;
            this.method316(false, arg2, false, arg0, false);
        }
    }

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "(I)V")
    public abstract void method334(int arg0);

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(Z)V")
    private final void method3178(boolean arg0) {
        if (this.field7984 != null) {
            this.field7984.method151(-72);
        }
        if (!arg0) {
            this.method3215(false);
        }
        ++field7798;
        this.method320(-127);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)I")
    public final int method3179(byte arg0) {
        if (arg0 < 2) {
            return -91;
        } else {
            ++field7820;
            return this.field8043;
        }
    }

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "()Z")
    public final boolean method436() {
        ++field7911;
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(Z)I")
    public final int method3180(boolean arg0) {
        ++field7909;
        return arg0 ? -18 : this.field7998;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public final void method448(int arg0) {
        ++field7800;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field8007 = arg0;
            this.field7982.method378(-94);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[Lld;)V")
    public final void method398(int arg0, class154[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field7993[var3] = arg1[var3];
        }
        ++field7846;
        this.field8016 = arg0;
        if (this.field8063.method1454(1433259682)) {
            this.method331((byte) -123);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)Ljn;")
    public abstract class659 method290(boolean arg0, int arg1);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)V")
    public final void method422(boolean arg0) {
        ++field7931;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)[F")
    public final float[] method3181(byte arg0) {
        ++field7865;
        int var2 = -13 % ((arg0 - 52) / 56);
        return this.field7987;
    }

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "(I)V")
    private final void method3182(int arg0) {
        ++field7922;
        if (!this.field7974) {
            float[] var2 = this.field8049;
            if (this.field7934 != 0 && this.field7876 != 0) {
                var2[11] = 0.0F;
                var2[5] = -2.0F / (float) this.field7876;
                var2[3] = 0.0F;
                var2[14] = 0.5F;
                var2[12] = -1.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[13] = 1.0F;
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 2.0F / (float) this.field7934;
                var2[2] = 0.0F;
                var2[10] = 0.5F;
            } else {
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[5] = 1.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[10] = 1.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
            }
            this.field7974 = true;
        }
        if (arg0 < 26) {
            this.field8049 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIIZ)V")
    public final void method3183(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != 128) {
            this.field8003 = -32;
        }
        ++field7902;
        if (~this.field8068 != ~arg2) {
            if (arg2 < 0) {
                this.method3198((byte) -87);
                this.method3232(false, (class467) null);
                this.method3229(0, arg1 ^ 140);
                if (!this.field7972) {
                    this.method3218(arg3, 41, arg0, 0, 0, 0);
                }
            } else {
                class483 var5 = this.field7982.method374((byte) -110, arg2);
                class269 var6 = super.field9050.method588(-26679, arg2);
                if (var6.field3808 == 0 && ~var6.field3806 == -1) {
                    this.method3198((byte) -87);
                } else {
                    int var7 = !var6.field3823 ? 128 : 64;
                    int var8 = var7 * 50;
                    class367 var9 = this.method3204(126);
                    var9.method2162((float) (this.field8003 % var8 * var6.field3808) / (float) var8, (float) (this.field8003 % var8 * var6.field3806) / (float) var8, 0.0F, (byte) -128);
                    this.method3201(arg1 + -145, class133.field1868);
                }
                if (!this.field7972) {
                    this.method3218(arg3, 78, arg0, var6.field3814, var6.field3803, var6.field3816);
                }
                if (this.field7984 != null) {
                    this.field7984.method150(var5, var6.field3804, (byte) -68);
                } else {
                    this.method3232(false, var5);
                    this.method3229(var6.field3804, 12);
                }
            }
            this.field8068 = arg2;
        }
        this.field8065 &= -8;
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V")
    public void method331(byte arg0) {
        if (arg0 > -113) {
            this.field8045 = true;
        }
        this.field8034 = this.field8016;
        ++field7921;
        this.field8016 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "(I)V")
    public final void method3184(int arg0) {
        this.method3245(-32);
        if (arg0 == 0) {
            ++field7815;
            this.method3173(true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method381(Canvas arg0) {
        this.field7923 = null;
        ++field7844;
        this.field7812 = null;
        if (arg0 != null && this.field7805 != arg0) {
            if (this.field7896.containsKey(arg0)) {
                this.field7923 = this.field7896.get(arg0);
                this.field7812 = arg0;
            }
        } else {
            this.field7923 = this.field7875;
            this.field7812 = this.field7805;
        }
        if (this.field7812 != null && this.field7923 != null) {
            this.method285(this.field7923, (byte) -40, this.field7812);
            this.method3211(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "(I)V")
    public abstract void method292(int arg0);

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "()I")
    public final int method400() {
        ++field7956;
        return this.field7945 - -this.field7944 - -this.field7957;
    }

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "(I)V")
    public abstract void method357(int arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLfl;)V")
    public abstract void method348(byte arg0, class677 arg1);

    @OriginalMember(owner = "client!gj", name = "ha", descriptor = "(F)V")
    public final void method465(float arg0) {
        ++field7859;
        if (this.field8039 != arg0) {
            this.field8039 = arg0;
            this.field7828.setAmbient(arg0);
            this.method321(1);
            this.method292(95);
        }
    }

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "(ILfa;II)V")
    public final void method425(int arg0, class212 arg1, int arg2, int arg3) {
        ++field7778;
        class644 var5 = (class644) arg1;
        class483 var6 = var5.field9144;
        this.method3187(117);
        this.method3232(false, var6);
        this.method3242(-2, 1);
        this.method3193(class24.field325, class24.field325, 0);
        this.method3177(0, 92, class22.field305);
        this.method3248((byte) -113, arg0);
        this.field7946.method2154((float) this.field7934, (byte) 69, 0.0F, (float) this.field7876);
        this.method3228(true);
        this.field8032[0].method2154(var6.method781((float) this.field7934, -8639), (byte) 69, 1.0F, var6.method787((float) this.field7876, (byte) 73));
        this.field8032[0].method2148(26921, 0.0F, var6.method787((float) (-arg3), (byte) 93), var6.method781((float) (-arg2), -8639));
        this.field8027[0] = class133.field1868;
        this.method3233(false);
        this.method3188((byte) 45);
        this.method3198((byte) -87);
        this.method3177(0, 72, class558.field7530);
    }

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "(I)V")
    private final void method3185(int arg0) {
        if (arg0 != -4192) {
            this.method3246(-38);
        }
        ++field7910;
        this.field7974 = false;
        if (class637.field9048 == this.field8063) {
            this.method3182(56);
            this.method3173(true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(Z)V")
    public final void method3186(boolean arg0) {
        if (arg0) {
            this.field7976 = false;
        }
        if (~this.field8065 != -5) {
            this.method3226(-25);
            this.method3207(false, 0);
            this.method3172(-96, false);
            this.method3195(15420, false);
            this.method3250(false, false);
            this.method3183(false, 128, -2, false);
            this.method3242(-2, 1);
            this.method3229(0, 12);
            this.field8065 = 4;
        }
        ++field7786;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lkf;BLps;)Z")
    public abstract boolean method345(class229 arg0, byte arg1, class82 arg2);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLiv;ZIZ)V")
    public abstract void method316(boolean arg0, class84 arg1, boolean arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "(I)V")
    public final void method3187(int arg0) {
        if (arg0 <= 97) {
            this.method3212((Buffer) null, (byte) -120);
        }
        if (this.field8065 != 2) {
            this.method3226(-25);
            this.method3207(false, 0);
            this.method3172(-74, false);
            this.method3195(15420, false);
            this.method3250(false, false);
            this.method3183(false, 128, -2, false);
            this.field8065 = 2;
        }
        ++field7855;
    }

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "()I")
    public final int method451() {
        ++field7782;
        return this.field7989;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIIII)Lxa;")
    public final class461 method452(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7960;
        return new class150(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(B)V")
    public final void method3188(byte arg0) {
        this.method3244((byte) 32, class126.field1758, 2);
        if (arg0 == 45) {
            ++field7819;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()Z")
    public final boolean method411() {
        ++field7864;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(IIIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method415(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field7920;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIILjn;Luj;I)V")
    public abstract void method318(int arg0, int arg1, int arg2, int arg3, class659 arg4, class349 arg5, int arg6);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method291(byte arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZ)Liq;")
    public abstract class555 method337(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()I")
    public final int method473() {
        ++field7913;
        return this.field8053 - 2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Li;")
    public final class37 method438(int arg0) {
        ++field7924;
        class227 var2 = new class227(arg0);
        this.field7858.method1273(var2, (byte) 122);
        return var2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class136 method383(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7907;
        return new class634(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "(I)V")
    public abstract void method298(int arg0);

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "(I)V")
    public abstract void method321(int arg0);

    @OriginalMember(owner = "client!gj", name = "AA", descriptor = "(IIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        this.field7972 = true;
        this.field7991 = arg2;
        this.field8030 = arg1;
        ++field7781;
        this.field7998 = arg0;
        this.field8055 = arg3;
        this.method3218(false, 40, false, 0, 3, 0);
        if (this.field7984 != null) {
            this.field7984.method147(0);
        }
        this.method3178(true);
        this.method284(2);
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(B)V")
    public abstract void method304(byte arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BB)V")
    public final void method3189(byte arg0, byte arg1) {
        this.method3248((byte) -105, arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
        ++field7790;
        if (arg1 <= 14) {
            this.method3234((byte) 89);
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(B)V")
    public final void method3190(byte arg0) {
        ++field7891;
        Hashtable var2 = new Hashtable();
        if (this.field7896 != null && !this.field7896.isEmpty()) {
            Enumeration var3 = this.field7896.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method350(var4, 111));
            }
        }
        this.field7896 = var2;
        this.method3213(1);
        this.method3227(true);
        this.field8056.method1253(this, 24);
        if (arg0 < 103) {
            this.method477(84, 37, 112, -94, -70);
        }
    }

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "(I)Lje;")
    public final class367 method3191(int arg0) {
        ++field7912;
        if (arg0 > -84) {
            this.method415(116, -55, -21, -5, 59, -105);
        }
        return this.field7967;
    }

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "(I)V")
    private final void method3192(int arg0) {
        ++field7905;
        if (arg0 != 1) {
            this.field8001 = null;
        }
        this.field8019 = (float) this.field8041 + -this.field7994;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lnd;Lnd;I)V")
    public final void method3193(class500 arg0, class500 arg1, int arg2) {
        if (arg2 == 0) {
            ++field7821;
            boolean var4 = false;
            if (this.field8035[this.field8043] != arg0) {
                this.field8035[this.field8043] = arg0;
                this.method341(22626);
                var4 = true;
            }
            if (this.field8021[this.field8043] != arg1) {
                this.field8021[this.field8043] = arg1;
                this.method332(94);
                var4 = true;
            }
            if (var4) {
                this.field8065 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "(I)V")
    public abstract void method301(int arg0);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Li;)V")
    public final void method421(class37 arg0) {
        this.field7831 = ((class227) arg0).field3260;
        ++field7903;
        this.field7937 = this.field7831.method3413(32768, false);
    }

    @OriginalMember(owner = "client!gj", name = "JA", descriptor = "(I)V")
    public final void method402(int arg0) {
        this.field8036 = 0;
        ++field7823;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field8036;
        }
        this.field8022 = 1 << this.field8036;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([Lba;Lhfa;Lq;[Lrc;I)V")
    public final void method390(class352[] arg0, class281 arg1, class391 arg2, class494[] arg3, int arg4) {
        ++field7829;
        this.method393(arg0, arg2, arg3, arg4);
        this.method419(arg1);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(ZI)V")
    public final void method3194(boolean arg0, int arg1) {
        if (this.field8058 != arg0) {
            this.field8058 = arg0;
            this.method354(arg1 ^ 43);
        }
        if (arg1 == 0) {
            ++field7837;
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(IIIII)V")
    public final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7838;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IZ)V")
    public final void method3195(int arg0, boolean arg1) {
        if (arg0 != 15420) {
            this.method457(-2, -115, 34, 46, -22, -2.4283926F);
        }
        if (!this.field7976 == arg1) {
            this.field7976 = arg1;
            this.method326(-46);
            this.field8065 &= -32;
        }
        ++field7927;
    }

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "(I)Lje;")
    public final class367 method3196(int arg0) {
        if (!this.field8033) {
            this.field7968.method2147(this.field7966, this.field7946);
            this.field8033 = true;
        }
        ++field7882;
        int var2 = -96 % ((-67 - arg0) / 54);
        return this.field7968;
    }

    @OriginalMember(owner = "client!gj", name = "YA", descriptor = "(IFFFFF)V")
    public final void method450(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7894;
        boolean var7 = ~this.field7979 != ~arg0;
        if (var7 || this.field8025 != arg1 || this.field8047 != arg2) {
            this.field8025 = arg1;
            this.field8047 = arg2;
            this.field7979 = arg0;
            if (var7) {
                this.field7996 = (float) (this.field7979 & 16711680) / 1.671168E7F;
                this.field8052 = (float) (65280 & this.field7979) / 65280.0F;
                this.field8069 = (float) (this.field7979 & 255) / 255.0F;
                this.method321(1);
            }
            this.field7828.setSunColour(this.field7996, this.field8052, this.field8069, arg1, arg2);
            this.method334(-113);
        }
        if (this.field8046[0] != arg3 || this.field8046[1] != arg4 || this.field8046[2] != arg5) {
            this.field8046[2] = arg5;
            this.field8046[1] = arg4;
            this.field8046[0] = arg3;
            this.field8028[1] = -arg4;
            this.field8028[0] = -arg3;
            this.field8028[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8070[0] = arg3 * var8;
            this.field8070[2] = arg5 * var8;
            this.field8070[1] = arg4 * var8;
            this.field8024[1] = -this.field8070[1];
            this.field8024[2] = -this.field8070[2];
            this.field8024[0] = -this.field8070[0];
            this.field7828.setSunDirection(this.field8070[0], this.field8070[1], this.field8070[2]);
            this.method298(-120);
            this.field8054 = (int) (arg3 * 256.0F / arg4);
            this.field8042 = (int) (arg5 * 256.0F / arg4);
        }
        this.method292(92);
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(Z)V")
    private final void method3197(boolean arg0) {
        if (!arg0) {
            this.method382(-69);
        }
        if (this.field7994 == 0.0F) {
            this.field8059[10] = this.field8015;
            this.field8059[14] = this.field8066;
        } else {
            float var2 = this.field8012 / (this.field8012 + this.field7994);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field8066 * (-var2 + 1.0F) / this.field7994;
            this.field8059[14] = this.field8066 * var3;
            this.field8059[10] = this.field8015 + var4;
        }
        ++field7836;
        this.field8014 = (this.field8059[14] - (float) this.field8041) / this.field8059[10];
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public final void method386(int arg0) {
        ++field7895;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(B)V")
    public final void method3198(byte arg0) {
        ++field7841;
        if (arg0 != -87) {
            this.method294(75, -65, (byte) 1, (class349) null);
        }
        if (this.field8027[this.field8043] != class283.field3934) {
            this.field8027[this.field8043] = class283.field3934;
            this.field8032[this.field8043].method1296();
            this.method3233(false);
        }
    }

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "(I)V")
    private final void method3199(int arg0) {
        ++field7879;
        this.field8023 = (float) (-this.field7973 + this.field7978);
        this.field8017 = (float) (-this.field8040 + this.field8010);
        int var2 = -34 % ((arg0 - -3) / 59);
        this.field8008 = (float) (-this.field8040 + this.field8029);
        this.field8050 = (float) (-this.field7973 + this.field7970);
    }

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "(I)F")
    public abstract float method330(int arg0);

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "(B)V")
    public final void method3200(byte arg0) {
        ++field7832;
        Enumeration var2 = this.field7896.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method291((byte) 105, this.field7896.get(var3), var3);
        }
        this.field8079.method776(false);
        this.field8076.method776(false);
        this.field8071.method190(arg0 ^ 93);
        this.field8088.method190(-46);
        this.field8080.method190(-65);
        this.field8082.method190(-79);
        this.field8078.method190(-35);
        this.field8056.method1254((byte) -126);
        if (arg0 == -58) {
            this.field8085.method776(false);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIIIII)V")
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7917;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        if (this.method3239((float) arg2 + var11, 0.0F, (float) arg0, (byte) -127, 0.0F, (float) arg3 + var10, (float) arg1)) {
            this.method3223(-2);
            this.method3248((byte) -127, arg4);
            this.method3177(0, 93, class22.field305);
            this.method3235(class22.field305, -12912, 0);
            this.method3242(-2, arg5);
            this.method3251((byte) 123);
            this.method295(false, 116);
            this.method3240(false);
            this.method295(true, -100);
            this.method3235(class558.field7530, -12912, 0);
            this.method3177(0, 78, class558.field7530);
        }
    }

    @OriginalMember(owner = "client!gj", name = "LA", descriptor = "(IIII)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3) {
        ++field7885;
        if (!this.field7972) {
            throw new RuntimeException("");
        } else {
            if (this.field7998 != arg0) {
                this.field7998 = arg0;
                if (this.field7984 != null) {
                    this.field7984.method147(0);
                }
            }
            this.field8055 = arg3;
            this.field8030 = arg1;
            this.field7991 = arg2;
            this.method3178(true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILkh;)V")
    public final void method3201(int arg0, class15 arg1) {
        if (arg0 != -17) {
            this.method401();
        }
        this.field8027[this.field8043] = arg1;
        ++field7801;
        this.method3233(false);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)Ljn;")
    public final class659 method3202(byte arg0, int arg1) {
        ++field7948;
        if (arg1 * 2 > this.field8085.method21(false)) {
            this.field8085.method777(arg1, (byte) 73);
        }
        return arg0 != -62 ? null : this.field8085;
    }

    @OriginalMember(owner = "client!gj", name = "IA", descriptor = "()I")
    public final int method474() {
        ++field7900;
        return this.field8041;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public final void method382(int arg0) {
        ++field7851;
    }

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "(I)V")
    public void method336(int arg0) {
        ++field7792;
        if (arg0 != 9) {
            this.method3246(-24);
        }
        this.method3236(arg0 + 118);
    }

    @OriginalMember(owner = "client!gj", name = "aa", descriptor = "()I")
    public final int method471() {
        ++field7818;
        return this.field8091;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public final void method394(int arg0) {
        ++field7915;
    }

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "(I)V")
    public abstract void method355(int arg0);

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "(B)V")
    public static void method3203(byte arg0) {
        field7908 = null;
        if (arg0 == 96) {
            field7940 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "(I)Lje;")
    public final class367 method3204(int arg0) {
        ++field7788;
        return arg0 <= 107 ? null : this.field8032[this.field8043];
    }

    @OriginalMember(owner = "client!gj", name = "ka", descriptor = "(FF)V")
    public final void method462(float arg0, float arg1) {
        if (this.field8012 != arg0 || this.field7994 != arg1) {
            this.field8012 = arg0;
            this.field7994 = arg1;
            this.method3192(1);
            this.method3197(true);
            this.method3209(-5075);
            this.method3222(28849);
        }
        ++field7871;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lje;B)V")
    public final void method3205(class367 arg0, byte arg1) {
        if (arg1 <= 24) {
            this.field7983 = false;
        }
        ++field7787;
        this.field7946.method1298(arg0);
        this.field7962 = false;
        this.method3234((byte) 72);
    }

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "(I)V")
    public abstract void method332(int arg0);

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "(I)Lje;")
    public final class367 method3206(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field7817;
            return this.field7966;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lkq;Z)Lxa;")
    public final class461 method412(class543 arg0, boolean arg1) {
        ++field7929;
        class461 var10;
        if (arg0.field7377 != 0 && arg0.field7373 != 0) {
            int[] var3 = new int[arg0.field7377 * arg0.field7373];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field7380 == null) {
                for (int var6 = 0; var6 < arg0.field7373; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field7377; ++var7) {
                        int var8 = arg0.field7376[255 & arg0.field7378[var4++]];
                        var3[var5++] = var8 == 0 ? 0 : class266.method1624(var8, -16777216);
                    }
                }
            } else {
                for (int var9 = 0; arg0.field7373 > var9; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field7377; ++var11) {
                        var3[var5++] = class266.method1624(arg0.field7380[var4] << 24, arg0.field7376[class249.method1537(arg0.field7378[var4], 255)]);
                        ++var4;
                    }
                }
            }
            var10 = this.method452(var3, 0, arg0.field7377, arg0.field7377, arg0.field7373);
        } else {
            var10 = this.method452(new int[1], 0, 1, 1, 1);
        }
        var10.method34(arg0.field7375, arg0.field7374, arg0.field7381, arg0.field7379);
        return var10;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(ZI)V")
    public final void method3207(boolean arg0, int arg1) {
        if (this.field8020 == !arg0) {
            this.field8020 = arg0;
            this.method284(2);
            this.field8065 &= -32;
        }
        if (arg1 != 0) {
            this.method390((class352[]) null, (class281) null, (class391) null, (class494[]) null, -124);
        }
        ++field7947;
    }

    @OriginalMember(owner = "client!gj", name = "na", descriptor = "(III[I)V")
    public final void method443(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7809;
        float var5 = this.field7963.method2160((float) arg0, (float) arg1, (byte) -67, (float) arg2);
        if (!((float) this.field7989 > var5) && !(var5 > (float) this.field8041)) {
            int var6 = (int) ((float) this.field8038 * this.field7963.method2163((float) arg1, (byte) -26, (float) arg2, (float) arg0) / var5);
            int var7 = (int) ((float) this.field8064 * this.field7963.method2141((float) arg1, (float) arg0, (float) arg2, 123) / var5);
            if (this.field8050 <= (float) var6 && this.field8023 >= (float) var6 && (float) var7 >= this.field8008 && this.field8017 >= (float) var7) {
                arg3[0] = (int) ((float) var6 + -this.field8050);
                arg3[1] = (int) ((float) var7 + -this.field8008);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "()F")
    public final float method3208() {
        ++field7783;
        return this.field7994;
    }

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "(I)V")
    private final void method3209(int arg0) {
        ++field7951;
        this.field8026 = false;
        if (arg0 != -5075) {
            this.field7967 = null;
        }
        if (class390.field5465 == this.field8063) {
            this.method3238(arg0 ^ -5078);
            this.method3173(true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "()Z")
    public final boolean method385() {
        ++field7796;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZZILiv;)V")
    public abstract void method351(boolean arg0, boolean arg1, int arg2, class84 arg3);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class212 method469(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7901;
        return class309.method1900(arg2, arg1, -103, arg3, arg0, this);
    }

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "()V")
    public final void method449() {
        this.field7970 = 0;
        this.field7978 = this.field7934;
        this.field8029 = 0;
        this.field8010 = this.field7876;
        ++field7892;
        if (this.field8092) {
            this.field8092 = false;
            this.method288(-20470);
        }
        this.method3199(58);
    }

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "(I)V")
    private final void method3210(int arg0) {
        int var2 = -31 / ((arg0 - -39) / 32);
        if (!this.field7981) {
            float[] var3 = this.field8059;
            float var4 = (float) (-this.field7973 * this.field7989) / (float) this.field8038;
            float var5 = (float) ((-this.field7973 + this.field7934) * this.field7989) / (float) this.field8038;
            float var6 = (float) (this.field8040 * this.field7989) / (float) this.field8064;
            float var7 = (float) ((-this.field7876 + this.field8040) * this.field7989) / (float) this.field8064;
            if (var4 != var5 && var6 != var7) {
                float var8 = (float) this.field7989 * 2.0F;
                var3[8] = (var4 + var5) / (var5 - var4);
                var3[4] = 0.0F;
                var3[10] = this.field8015 = (float) this.field8041 / (float) (-this.field8041 + this.field7989);
                var3[1] = 0.0F;
                var3[14] = this.field8066 = (float) (this.field8041 * this.field7989) / (float) (-this.field8041 + this.field7989);
                var3[7] = 0.0F;
                var3[15] = 0.0F;
                var3[6] = 0.0F;
                var3[13] = 0.0F;
                var3[5] = var8 / (var6 - var7);
                var3[11] = -1.0F;
                var3[9] = (var6 + var7) / (-var7 + var6);
                var3[12] = 0.0F;
                var3[3] = 0.0F;
                var3[0] = var8 / (var5 - var4);
                var3[2] = 0.0F;
            } else {
                var3[8] = 0.0F;
                var3[13] = 0.0F;
                var3[15] = 1.0F;
                var3[11] = 0.0F;
                var3[1] = 0.0F;
                var3[5] = 1.0F;
                var3[10] = 1.0F;
                var3[3] = 0.0F;
                var3[12] = 0.0F;
                var3[6] = 0.0F;
                var3[14] = 0.0F;
                var3[2] = 0.0F;
                var3[9] = 0.0F;
                var3[7] = 0.0F;
                var3[4] = 0.0F;
                var3[0] = 1.0F;
            }
            this.method3197(true);
            this.field7981 = true;
        }
        ++field7887;
    }

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "(Z)V")
    private final void method3211(boolean arg0) {
        ++field7793;
        if (arg0) {
            if (this.field7812 == null) {
                this.field7802 = this.field7834 = 1;
            } else {
                Dimension var2 = this.field7812.getSize();
                this.field7834 = var2.height;
                this.field7802 = var2.width;
            }
            this.field7876 = this.field7834;
            this.field7934 = this.field7802;
            this.method3185(-4192);
            this.method3222(28849);
            this.method3209(-5075);
            this.method293((byte) 70);
            this.method3199(57);
            this.method3245(-32);
            this.method449();
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;")
    public final Stream method3212(Buffer arg0, byte arg1) {
        int var3 = -51 % ((-6 - arg1) / 53);
        ++field7884;
        this.field7995.method3420(arg0);
        return this.field7995;
    }

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "(I)V")
    private final void method3213(int arg0) {
        this.field8079 = this.method337((byte) -61, false);
        if (arg0 == 1) {
            ++field7880;
            this.field8079.method1249(140, 28, (byte) -124);
            for (int var2 = 0; var2 < 4; ++var2) {
                Buffer var3 = this.field8079.method779((byte) -20, true);
                if (var3 != null) {
                    Stream var4 = this.method3212(var3, (byte) -63);
                    if (Stream.method3418()) {
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(1.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(1.0F);
                        var4.method3421(0.0F);
                        var4.method3421(1.0F);
                        var4.method3421(1.0F);
                        var4.method3421(1.0F);
                        var4.method3421(0.0F);
                        var4.method3421(1.0F);
                        var4.method3421(1.0F);
                        var4.method3421(1.0F);
                        var4.method3421(1.0F);
                        var4.method3421(1.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(1.0F);
                        var4.method3421(0.0F);
                        var4.method3421(1.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                        var4.method3421(0.0F);
                    } else {
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(1.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(1.0F);
                        var4.method3428(0.0F);
                        var4.method3428(1.0F);
                        var4.method3428(1.0F);
                        var4.method3428(1.0F);
                        var4.method3428(0.0F);
                        var4.method3428(1.0F);
                        var4.method3428(1.0F);
                        var4.method3428(1.0F);
                        var4.method3428(1.0F);
                        var4.method3428(1.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(1.0F);
                        var4.method3428(0.0F);
                        var4.method3428(1.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                        var4.method3428(0.0F);
                    }
                    var4.method3426();
                    if (this.field8079.method774(-22324)) {
                        break;
                    }
                }
            }
            this.field8075 = this.method307(new class215[] { new class215(new class657[] { class657.field9245, class657.field9255, class657.field9255 }) }, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[IZ)Lhr;")
    public final class483 method3214(int arg0, int arg1, int arg2, int[] arg3, boolean arg4) {
        if (arg2 != -17318) {
            return null;
        } else {
            ++field7925;
            return this.method311(arg3, 15, arg4, 0, arg0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "(Z)V")
    public final void method3215(boolean arg0) {
        if (!arg0) {
            ++field7814;
            if (this.field8065 != 8) {
                this.method3252(true);
                this.method3207(true, 0);
                this.method3195(15420, true);
                this.method3250(true, false);
                this.method3242(-2, 1);
                this.field8065 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(ZI)V")
    public abstract void method295(boolean arg0, int arg1);

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()Lq;")
    public final class391 method401() {
        ++field7898;
        return this.field8090;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZI[BLkf;ZII)Lhr;")
    public abstract class483 method305(int arg0, boolean arg1, int arg2, byte[] arg3, class229 arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method350(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "(I)Lje;")
    public final class367 method3216(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field7950;
            return this.field7946;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public abstract void method285(Object arg0, byte arg1, Canvas arg2);

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "(I)V")
    public final void method3217(int arg0) {
        if (~this.field8065 != -17) {
            this.method3246(11959);
            this.method3207(true, 0);
            this.method3195(arg0 ^ -15423, true);
            this.method3250(true, false);
            this.method3242(-2, 1);
            this.field8065 = 16;
        }
        ++field7883;
        if (arg0 != -3) {
            this.method414(73, 68, -79, -118, -4);
        }
    }

    @OriginalMember(owner = "client!gj", name = "sa", descriptor = "(II)V")
    public final void method428(int arg0, int arg1) {
        if (~this.field7989 != ~arg0 || this.field8041 != arg1) {
            this.field7989 = arg0;
            this.field8041 = arg1;
            this.method3222(28849);
            this.method3209(-5075);
            this.method3178(true);
        }
        ++field7935;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([Llf;B)Lfl;")
    public abstract class677 method307(class215[] arg0, byte arg1);

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "([I)V")
    public final void method416(int[] arg0) {
        arg0[3] = this.field8010;
        ++field7872;
        arg0[1] = this.field8029;
        arg0[0] = this.field7970;
        arg0[2] = this.field7978;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7936;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIZIII)V")
    private final void method3218(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        boolean var7 = arg0 & this.method461();
        if (arg1 < 4) {
            this.field7802 = -9;
        }
        ++field7806;
        if (!var7 && (arg4 == 4 || ~arg4 == -9 || arg4 == 9)) {
            arg4 = 2;
            arg5 = arg4 == 4 ? 1 & arg3 : 1;
            arg3 = 0;
        }
        if (arg4 != 0 && arg2) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (this.field7977 == arg4) {
            if (~this.field7977 != -1) {
                this.field7986[this.field7977 & Integer.MAX_VALUE].method144(1, arg2);
                if (this.field8011 != arg3 || ~this.field7992 != ~arg5) {
                    this.field7986[Integer.MAX_VALUE & this.field7977].method156(arg5, arg3, 0);
                    this.field8011 = arg3;
                    this.field7992 = arg5;
                }
                return;
            }
        } else {
            if (~this.field7977 != -1) {
                this.field7986[Integer.MAX_VALUE & this.field7977].method155(false);
            }
            if (~arg4 == -1) {
                this.field7984 = null;
            } else {
                this.field7984 = this.field7986[Integer.MAX_VALUE & arg4];
                this.field7984.method148(0, arg2);
                this.field7984.method144(1, arg2);
                this.field7984.method156(arg5, arg3, 0);
            }
            this.field8011 = arg3;
            this.field7992 = arg5;
            this.field7977 = arg4;
        }
    }

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "(I)V")
    public abstract void method300(int arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IF)V")
    public final void method3219(int arg0, float arg1) {
        if (this.field7988 != arg1) {
            this.field7988 = arg1;
            this.method3209(-5075);
        }
        ++field7952;
        if (arg0 != -11838) {
            this.field7986 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "ya", descriptor = "(IIIII)V")
    public final void method414(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7853;
        this.method415(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
    public final void method3220(int arg0, int arg1) {
        if (arg1 != -23809) {
            this.method414(-95, 66, 33, -91, 123);
        }
        ++field7863;
        if (this.field8043 != arg0) {
            this.field8043 = arg0;
            this.method304((byte) 119);
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(ZI)V")
    public final void method3221(boolean arg0, int arg1) {
        ++field7804;
        if (this.field8061 != arg0) {
            this.field8061 = arg0;
            this.method284(2);
        }
        if (arg1 != 512) {
            this.field7802 = 91;
        }
    }

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "(I)V")
    private final void method3222(int arg0) {
        ++field7964;
        if (arg0 != 28849) {
            this.field7969 = false;
        }
        this.field7981 = false;
        this.method3210(31);
        if (class243.field3465 == this.field8063) {
            this.method3173(true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "(I)V")
    private final void method3223(int arg0) {
        ++field7890;
        if (this.field8065 != 1) {
            this.method3226(-25);
            this.method3207(false, 0);
            this.method3172(-95, false);
            this.method3195(15420, false);
            this.method3250(false, false);
            this.method3183(false, 128, -2, false);
            this.method3229(1, arg0 ^ -14);
            this.method3232(false, this.field7985);
            this.field8065 = 1;
        }
        if (arg0 != -2) {
            this.field8048 = 110;
        }
    }

    @OriginalMember(owner = "client!gj", name = "ca", descriptor = "(IIII)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3) {
        ++field7811;
        if (~arg0 >= -1 && this.field7934 + -1 <= arg2 && arg1 <= 0 && ~arg3 <= ~(this.field7876 + -1)) {
            this.method449();
        } else {
            this.field7978 = ~this.field7934 <= ~arg2 ? arg2 : 0;
            this.field7970 = arg0 < 0 ? 0 : arg0;
            this.field8010 = arg3 > this.field7934 ? 0 : arg3;
            this.field8029 = arg1 >= 0 ? arg1 : 0;
            if (!this.field8092) {
                this.field8092 = true;
                this.method288(-20470);
            }
            this.method364((byte) 14);
            this.method3199(-80);
        }
    }

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "()V")
    public final void method460() {
        ++field7889;
        this.field7982.method378(-6);
    }

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "()V")
    public final void method406() {
        this.field7972 = false;
        ++field7942;
        this.method3218(false, 61, false, 0, 0, 0);
        this.method3178(true);
        this.method284(2);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lka;)V")
    public final void method432(class434 arg0) {
        ++field7904;
        this.field7997 = (class654) arg0;
    }

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "(Z)V")
    public abstract void method339(boolean arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lbt;Z)Z")
    public static final boolean method3224(class39 arg0, boolean arg1) {
        boolean var2 = class581.field8114 == class144.field2149;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method178(12);
        if (arg0.field517 >= 0 && arg0.field512 >= 0 && arg0.field516 < class137.field1931 && arg0.field519 < class22.field308) {
            short var6 = 0;
            for (int var7 = arg0.field517; var7 <= arg0.field516; ++var7) {
                for (int var10 = arg0.field512; var10 <= arg0.field519; ++var10) {
                    class486 var11 = class80.method635(arg0.field520, var7, var10);
                    if (var11 != null) {
                        int var12 = 0;
                        if (var7 > arg0.field517) {
                            ++var12;
                        }
                        if (var7 < arg0.field516) {
                            var12 += 4;
                        }
                        if (var10 > arg0.field512) {
                            var12 += 8;
                        }
                        if (var10 < arg0.field519) {
                            var12 += 2;
                        }
                        class20 var13 = class465.method2665(var12, (byte) -47, arg0);
                        class20 var14 = var11.field6751;
                        if (var14 == null) {
                            var11.field6751 = var13;
                        } else {
                            while (var14.field284 != null) {
                                var14 = var14.field284;
                            }
                            var14.field284 = var13;
                        }
                        var11.field6733 = (byte) (var11.field6733 | var12);
                        if (var2 && (class326.field4815[var7][var10] & -16777216) != 0) {
                            var3 = class326.field4815[var7][var10];
                            var4 = class144.field2144[var7][var10];
                            var5 = class198.field2927[var7][var10];
                        }
                        if (var11.field6748 != null && var11.field6748.field5008 > var6) {
                            var6 = var11.field6748.field5008;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field517; var8 <= arg0.field516; ++var8) {
                    for (int var9 = arg0.field512; var9 <= arg0.field519; ++var9) {
                        if ((class326.field4815[var8][var9] & -16777216) == 0) {
                            class326.field4815[var8][var9] = var3;
                            class144.field2144[var8][var9] = var4;
                            class198.field2927[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class376.field5329[class589.field8211++] = arg0;
            }
            if (arg1) {
                arg0.field518 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(BI)V")
    public static final void method3225(byte arg0, int arg1) {
        ++field7919;
        class679 var2 = class669.method3708(8, arg1, 1403048928);
        var2.method3749(-99);
        int var3 = 41 / ((arg0 - -73) / 44);
    }

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "(I)V")
    public abstract void method341(int arg0);

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "(I)V")
    private final void method3226(int arg0) {
        ++field7873;
        if (arg0 == -25) {
            if (class637.field9048 != this.field8063) {
                class228 var2 = this.field8063;
                this.field8063 = class637.field9048;
                if (var2.method1454(1433259682)) {
                    this.method3243(-31429);
                }
                this.method3182(arg0 ^ -115);
                this.field8001 = this.field8049;
                this.method3173(true);
                this.field8065 &= -25;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "(Z)V")
    private final void method3227(boolean arg0) {
        this.field8076 = this.method337((byte) -61, arg0);
        ++field7954;
        this.field8076.method1249(24, 12, (byte) -120);
        this.field8081 = this.method307(new class215[] { new class215(class657.field9245) }, (byte) 113);
    }

    @OriginalMember(owner = "client!gj", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7886;
    }

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "(Z)V")
    public final void method3228(boolean arg0) {
        ++field7958;
        this.field7962 = false;
        this.method3234((byte) 72);
        if (!arg0) {
            this.field8047 = -0.17727333F;
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)V")
    public final void method3229(int arg0, int arg1) {
        ++field7874;
        if (arg1 != 12) {
            this.method351(true, false, 84, (class84) null);
        }
        if (arg0 != 1) {
            if (arg0 == 0) {
                this.method3193(class137.field1929, class137.field1929, 0);
            } else if (arg0 == 2) {
                this.method3193(class175.field2614, class24.field325, 0);
            } else {
                if (~arg0 != -4) {
                    if (arg0 == 4) {
                        this.method3193(class62.field821, class62.field821, arg1 + -12);
                        return;
                    }
                } else {
                    this.method3193(client.field3838, class137.field1929, 0);
                }
            }
        } else {
            this.method3193(class24.field325, class24.field325, arg1 + -12);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([FB)[F")
    public final float[] method3230(float[] arg0, byte arg1) {
        ++field7824;
        if (arg1 < 61) {
            this.method415(-19, 18, 102, -89, 0, 89);
        }
        arg0[4] = this.field8001[1];
        arg0[0] = this.field8001[0];
        arg0[8] = this.field8001[2];
        arg0[12] = this.field8001[3];
        arg0[1] = this.field8001[4];
        arg0[13] = this.field8001[7];
        arg0[9] = this.field8001[6];
        arg0[5] = this.field8001[5];
        arg0[2] = this.field8001[8];
        arg0[14] = this.field8001[11];
        arg0[6] = this.field8001[9];
        arg0[3] = this.field8001[12];
        arg0[10] = this.field8001[10];
        arg0[7] = this.field8001[13];
        arg0[11] = this.field8001[14];
        arg0[15] = this.field8001[15];
        return arg0;
    }

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "()Z")
    public final boolean method426() {
        ++field7854;
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BIIZLkf;I)Lhr;")
    public final class483 method3231(byte[] arg0, int arg1, int arg2, boolean arg3, class229 arg4, int arg5) {
        if (arg1 != 30569) {
            this.method393((class352[]) null, (class391) null, (class494[]) null, 98);
        }
        ++field7868;
        return this.method305(arg5, arg3, 0, arg0, arg4, false, arg2, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIZIIII)Lhr;")
    public abstract class483 method311(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)I")
    public final int method431(int arg0, int arg1) {
        ++field7955;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLek;)V")
    public final void method3232(boolean arg0, class467 arg1) {
        ++field7949;
        if (!arg0) {
            if (this.field8062[this.field8043] != arg1) {
                this.field8062[this.field8043] = arg1;
                if (arg1 != null) {
                    arg1.method129((byte) -33);
                } else {
                    this.method355(6);
                }
                this.field8065 &= -2;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "(B)V")
    public abstract void method346(byte arg0);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lkf;IILps;I)Lhr;")
    public abstract class483 method303(class229 arg0, int arg1, int arg2, class82 arg3, int arg4);

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "(IIII)V")
    public final void method404(int arg0, int arg1, int arg2, int arg3) {
        this.field8040 = arg1;
        this.field7973 = arg0;
        ++field7807;
        this.field8038 = arg2;
        this.field8064 = arg3;
        this.method3209(-5075);
        this.method3222(28849);
        this.method3245(-32);
        this.method3199(112);
    }

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "(Z)V")
    private final void method3233(boolean arg0) {
        ++field7953;
        if (!arg0) {
            this.method347(18415);
            if (this.field7984 != null) {
                this.field7984.method145((byte) 117);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLps;Lkf;)Z")
    public abstract boolean method315(byte arg0, class82 arg1, class229 arg2);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lhfa;)V")
    public final void method419(class281 arg0) {
        ++field7852;
        this.field8056.method1252(30670, this, arg0);
    }

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "(B)V")
    private final void method3234(byte arg0) {
        if (class637.field9048 == this.field8063) {
            float var2 = this.method330(1);
            this.field7946.method2148(arg0 + 26849, 0.0F, var2, var2);
        }
        ++field7850;
        this.field8033 = false;
        if (arg0 != 72) {
            this.method3216(-112);
        }
        this.method346((byte) 23);
        if (this.field7984 != null) {
            this.field7984.method152(0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Liv;II)V")
    public final void method3235(class84 arg0, int arg1, int arg2) {
        if (arg1 == -12912) {
            this.method351(true, false, arg2, arg0);
            ++field7914;
        }
    }

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "(IIIIII)V")
    public final void method472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7835;
        this.method3223(-2);
        this.method3248((byte) 59, arg4);
        this.method3177(0, 102, class22.field305);
        this.method3235(class22.field305, -12912, 0);
        this.method3242(-2, arg5);
        this.field7946.method2154((float) arg2, (byte) 69, 1.0F, (float) arg3);
        this.field7946.method1285(arg0, arg1, 0);
        this.method3228(true);
        this.method295(false, 123);
        this.method3188((byte) 45);
        this.method295(true, 120);
        this.method3235(class558.field7530, -12912, 0);
        this.method3177(0, 110, class558.field7530);
    }

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "(I)V")
    private final void method3236(int arg0) {
        this.method321(1);
        ++field7856;
        this.method334(-128);
        this.method354(122);
        this.method331((byte) -122);
        this.method298(-37);
        this.method292(124);
        this.method302(18509);
        this.method326(-97);
        this.method300(-122);
        this.method284(2);
        this.method320(127);
        this.method289(125);
        this.method339(true);
        this.method328((byte) -75);
        for (int var2 = this.field8048 + -1; var2 >= 0; --var2) {
            this.method3220(var2, -23809);
            this.method341(22626);
            this.method332(112);
            this.method3198((byte) -87);
        }
        if (arg0 > 7) {
            this.method357(0);
            this.method293((byte) 70);
            this.method335(0);
            this.method346((byte) 23);
            this.method301(0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "(I)V")
    public final void method3237(int arg0) {
        this.field8062 = new class467[this.field8048];
        this.field8027 = new class15[this.field8048];
        this.field8021 = new class500[this.field8048];
        this.field8035 = new class500[this.field8048];
        ++field7888;
        this.field8032 = new class367[this.field8048];
        for (int var2 = 0; ~this.field8048 < ~var2; ++var2) {
            this.field8021[var2] = class137.field1929;
            this.field8035[var2] = class137.field1929;
            this.field8027[var2] = class283.field3934;
            this.field8032[var2] = new class367();
        }
        this.field7993 = new class154[this.field8053 + -2];
        this.field7985 = this.method303(class583.field8126, -8, 1, class82.field1147, 1);
        this.method421(new class227(262144));
        this.field8083 = this.method307(new class215[] { new class215(new class657[] { class657.field9245, class657.field9255 }) }, (byte) 119);
        this.field8074 = this.method307(new class215[] { new class215(new class657[] { class657.field9245, class657.field9253 }) }, (byte) 106);
        this.field8086 = this.method307(new class215[] { new class215(class657.field9245), new class215(class657.field9253), new class215(class657.field9255), new class215(class657.field9252) }, (byte) 124);
        this.field8073 = this.method307(new class215[] { new class215(class657.field9245), new class215(class657.field9253), new class215(class657.field9255) }, (byte) 121);
        this.field8087 = new class42(this, 0, 0, false, false);
        this.field8071 = new class42(this, 0, 0, true, true);
        this.field8072 = new class42(this, 0, 0, false, false);
        this.field8088 = new class42(this, arg0, 0, true, true);
        this.field8089 = new class42(this, 0, 0, false, false);
        this.field8080 = new class42(this, 0, 0, true, true);
        this.field8084 = new class42(this, 0, 0, false, false);
        this.field8082 = new class42(this, 0, 0, true, true);
        this.field8077 = new class42(this, 0, 0, false, false);
        this.field8078 = new class42(this, 0, 0, true, true);
        this.field8056 = new class189(this);
        this.field8085 = this.method290(true, 0);
        this.method3190((byte) 116);
        this.field7810 = new class292(this);
        this.field7986[1] = this.method363(arg0 + -15892, 1);
        this.field7986[2] = this.method363(-15892, 2);
        this.field7986[4] = this.method363(-15892, 4);
        this.field7986[5] = this.method363(-15892, 5);
        this.field7986[6] = this.method363(class602.method3336(arg0, -15892), 6);
        this.field7986[7] = this.method363(class602.method3336(arg0, -15892), 7);
        this.field7986[3] = this.method363(-15892, 3);
        this.field7986[8] = this.method363(class602.method3336(arg0, -15892), 8);
        this.field7986[9] = this.method363(-15892, 9);
        if (!this.field7986[2].method154(113)) {
            this.field7986[2] = this.method363(-15892, 0);
        }
        if (!this.field7986[4].method154(arg0 ^ 119)) {
            this.field7986[4] = this.field7986[2];
        }
        if (!this.field7986[8].method154(105)) {
            this.field7986[8] = this.field7986[4];
        }
        if (!this.field7986[9].method154(119)) {
            this.field7986[9] = this.field7986[8];
        }
        this.method336(9);
        this.method449();
    }

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "(I)V")
    private final void method3238(int arg0) {
        ++field7941;
        if (!this.field8026) {
            float[] var2 = this.field7980;
            float var3 = (float) this.field7989 - this.field7994;
            float var4 = (float) this.field8041 + -this.field7994;
            float var5 = (float) (-this.field8040) * this.field7988 / (float) this.field8064;
            float var6 = (float) (-this.field7973) * this.field7988 / (float) this.field8038;
            float var7 = (float) (-this.field7973 + this.field7934) * this.field7988 / (float) this.field8038;
            float var8 = (float) (-this.field8040 + this.field7876) * this.field7988 / (float) this.field8064;
            if (var6 != var7 && var5 != var8) {
                var2[0] = 2.0F / (-var6 + var7);
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[14] = var3 / (var3 - var4);
                var2[10] = 1.0F / (var3 - var4);
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[5] = 2.0F / (var8 - var5);
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
            } else {
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[5] = 1.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.0F;
                var2[10] = 1.0F;
            }
            this.method3192(1);
            this.field8026 = true;
        }
        if (arg0 != 7) {
            this.field8010 = 79;
        }
    }

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "()Z")
    public final boolean method476() {
        ++field7928;
        return this.field7990;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class461 method420(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7845;
        class150 var6 = new class150(this, arg2, arg3, arg4);
        var6.method181(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFBFFF)Z")
    private final boolean method3239(float arg0, float arg1, float arg2, byte arg3, float arg4, float arg5, float arg6) {
        int var8 = -22 / ((arg3 - 86) / 32);
        ++field7826;
        Buffer var9 = this.field8076.method779((byte) -20, true);
        if (var9 == null) {
            return false;
        } else {
            Stream var10 = this.method3212(var9, (byte) -61);
            if (Stream.method3418()) {
                var10.method3421(arg2);
                var10.method3421(arg6);
                var10.method3421(arg4);
                var10.method3421(arg0);
                var10.method3421(arg5);
                var10.method3421(arg1);
            } else {
                var10.method3428(arg2);
                var10.method3428(arg6);
                var10.method3428(arg4);
                var10.method3428(arg0);
                var10.method3428(arg5);
                var10.method3428(arg1);
            }
            var10.method3426();
            return this.field8076.method774(-22324);
        }
    }

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "(I)V")
    public abstract void method354(int arg0);

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method395(Canvas arg0) {
        ++field7861;
        Object var2 = null;
        if (arg0 != null && this.field7805 != arg0) {
            if (this.field7896.containsKey(arg0)) {
                var2 = this.field7896.get(arg0);
            }
        } else {
            var2 = this.field7923;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method353(arg0, 1, var2);
            if (this.field7812 == arg0) {
                this.method3211(true);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method353(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "()V")
    public void method306() {
        ++field7926;
        if (!this.field8006) {
            for (class539 var1 = this.field7858.method1270((byte) -25); var1 != null; var1 = this.field7858.method1282(0)) {
                ((class227) var1).method1452(0);
            }
            Enumeration var2 = this.field7896.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method291((byte) 112, this.field7896.get(var3), var3);
            }
            class256.method1572(false, true, false);
            this.field7828.release();
            this.field8006 = true;
        }
    }

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "(III)V")
    public final void method453(int arg0, int arg1, int arg2) {
        ++field7869;
        if (~this.field8002 != ~arg0 || this.field8005 != arg1 || this.field7975 != arg2) {
            this.field7975 = arg2;
            this.field8002 = arg0;
            this.field8005 = arg1;
            if (this.field7972) {
                return;
            }
            this.method3178(true);
            this.method284(2);
        }
    }

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "(I)V")
    public abstract void method284(int arg0);

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "()Z")
    public final boolean method423() {
        ++field7943;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "(Z)V")
    private final void method3240(boolean arg0) {
        ++field7899;
        this.method313(this.field8076, 15, 0);
        this.method348((byte) -62, this.field8081);
        this.method294(1, 0, (byte) 108, class315.field4669);
        if (arg0) {
            this.method3212((Buffer) null, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "(I)I")
    public final int method3241(int arg0) {
        ++field7959;
        if (arg0 != 0) {
            this.field7963 = null;
        }
        return this.field7991;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Le;Lpj;II)V")
    public class580(Canvas arg0, Object arg1, class489 arg2, class132 arg3, int arg4, int arg5) {
        super(arg2);
        this.field7971 = arg4;
        this.field7799 = arg3;
        this.field7812 = this.field7805 = arg0;
        this.field7923 = this.field7875 = arg1;
        Dimension var7 = arg0.getSize();
        this.field7999 = arg5;
        this.field7876 = this.field7834 = var7.height;
        this.field7934 = this.field7802 = var7.width;
        class256.method1570(true, false, -18);
        this.field7982 = new class53(this, super.field9050);
        this.field7828 = new NativeInterface(super.field9050.method581(-16264), this.field7999);
        for (int var8 = 0; ~var8 > ~super.field9050.method581(-16264); ++var8) {
            class269 var9 = super.field9050.method588(-26679, var8);
            if (var9 != null) {
                this.field7828.initTextureMetrics(var8, var9.field3820, var9.field3810);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "()Z")
    public final boolean method424() {
        ++field7833;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(II)V")
    public final void method3242(int arg0, int arg1) {
        ++field7866;
        if (~this.field8057 != ~arg1) {
            class492 var3;
            boolean var4;
            boolean var5;
            if (~arg1 == -2) {
                var3 = class23.field320;
                var4 = true;
                var5 = true;
            } else if (arg1 != 2) {
                if (arg1 != 128) {
                    var4 = false;
                    var5 = false;
                    var3 = class172.field2583;
                } else {
                    var4 = true;
                    var3 = class191.field2813;
                    var5 = true;
                }
            } else {
                var3 = class161.field2443;
                var4 = true;
                var5 = false;
            }
            if (!this.field8045 == var5) {
                this.field8045 = var5;
                this.method328((byte) -96);
            }
            if (this.field8060 != var4) {
                this.field8060 = var4;
                this.method289(arg0 + 101);
            }
            if (this.field8044 != var3) {
                this.field8044 = var3;
                this.method339(true);
            }
            this.field8065 &= -29;
            this.field8057 = arg1;
        }
        if (arg0 != -2) {
            this.field8050 = -1.1119907F;
        }
    }

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "(I)V")
    public abstract void method288(int arg0);

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "(B)V")
    public abstract void method364(byte arg0);

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "(I)V")
    private final void method3243(int arg0) {
        ++field7808;
        this.field8033 = false;
        if (arg0 != -31429) {
            this.field8084 = null;
        }
        if (this.field7984 != null) {
            this.field7984.method153(arg0 ^ 31406);
        }
        this.method301(0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLuj;I)V")
    private final void method3244(byte arg0, class349 arg1, int arg2) {
        ++field7789;
        this.method313(this.field8079, 15, 0);
        if (arg0 == 32) {
            this.method348((byte) -62, this.field8075);
            this.method294(arg2, 0, (byte) 122, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "(I)V")
    public final void method3245(int arg0) {
        if (arg0 == -32) {
            if (class30.field367 != this.field8063) {
                class228 var2 = this.field8063;
                this.field8063 = class30.field367;
                if (var2.method1454(1433259682)) {
                    this.method3243(arg0 ^ 31451);
                }
                this.field8065 &= -32;
                this.field8001 = this.field7987;
            }
            ++field7827;
        }
    }

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "(I)V")
    public abstract void method335(int arg0);

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
    public void method299(int arg0) {
        ++field7878;
        this.field7982.method376(false);
        this.field8003 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!gj", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7795;
        float var7 = this.field7963.method2160((float) arg0, (float) arg1, (byte) -67, (float) arg2);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field7963.method2160((float) arg3, (float) arg4, (byte) -67, (float) arg5);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7989) || !(var8 < (float) this.field7989)) && (!(var7 > (float) this.field8041) || !(var8 > (float) this.field8041))) {
            int var9 = (int) ((float) this.field8038 * this.field7963.method2163((float) arg1, (byte) -85, (float) arg2, (float) arg0) / var7);
            int var10 = (int) ((float) this.field8038 * this.field7963.method2163((float) arg4, (byte) -23, (float) arg5, (float) arg3) / var8);
            if ((float) var9 < this.field8050 && this.field8050 > (float) var10 || this.field8023 < (float) var9 && (float) var10 > this.field8023) {
                return false;
            } else {
                int var11 = (int) ((float) this.field8064 * this.field7963.method2141((float) arg1, (float) arg0, (float) arg2, 121) / var7);
                int var12 = (int) ((float) this.field8064 * this.field7963.method2141((float) arg4, (float) arg3, (float) arg5, 85) / var8);
                return (!(this.field8008 > (float) var11) || !(this.field8008 > (float) var12)) && (!((float) var11 > this.field8017) || !(this.field8017 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lq;)V")
    public final void method446(class391 arg0) {
        ++field7857;
        this.field7963 = (class367) arg0;
        this.field7966.method1298(this.field7963);
        this.field7966.method2159(-122);
        this.field7967.method2156(18360, this.field7966);
        this.field7965.method2156(18360, this.field7963);
        if (this.field8063.method1454(1433259682)) {
            this.method3243(-31429);
        }
    }

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "()Z")
    public final boolean method461() {
        ++field7797;
        return this.field7986[3].method154(111);
    }

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "()Lq;")
    public final class391 method459() {
        ++field7849;
        return new class367();
    }

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "(I)V")
    private final void method3246(int arg0) {
        if (arg0 != 11959) {
            this.field8073 = null;
        }
        if (class390.field5465 != this.field8063) {
            class228 var2 = this.field8063;
            this.field8063 = class390.field5465;
            if (!var2.method1454(arg0 ^ 1433264149)) {
                this.method3243(-31429);
            }
            this.method3238(7);
            this.field8001 = this.field7980;
            this.method3173(true);
            this.field8065 &= -8;
        }
        ++field7784;
    }

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "(I)I")
    public final int method3247(int arg0) {
        ++field7930;
        if (arg0 != -15077) {
            this.field8010 = 116;
        }
        return this.field8055;
    }

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "()Z")
    public final boolean method447() {
        ++field7906;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(BI)V")
    public final void method3248(byte arg0, int arg1) {
        ++field7816;
        if (~this.field8051 != ~arg1) {
            this.field8051 = arg1;
            this.method357(0);
        }
        int var3 = -109 % ((-49 - arg0) / 56);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method3249(int arg0, byte arg1, boolean arg2) {
        ++field7843;
        return arg1 != 85 ? null : this.field7831.method3413(arg0, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(Z)V")
    public final void method387(boolean arg0) {
        ++field7847;
        this.field7969 = arg0;
        this.method300(-56);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZZ)V")
    public final void method3250(boolean arg0, boolean arg1) {
        ++field7779;
        if (this.field8000 != arg0) {
            this.field8000 = arg0;
            this.method300(-94);
            this.field8065 &= -32;
        }
        if (arg1) {
            this.field7831 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "(I)V")
    public abstract void method326(int arg0);

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "(B)V")
    public final void method3251(byte arg0) {
        ++field7839;
        this.field7946.method1296();
        this.field7962 = true;
        this.method3234((byte) 72);
        if (arg0 != 123) {
            this.method419((class281) null);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7848;
    }

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "()Z")
    public final boolean method407() {
        ++field7938;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lkda;I)V")
    public abstract void method286(class354 arg0, int arg1);

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "()Z")
    public final boolean method408() {
        ++field7870;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lmj;[Lkq;Z)Lta;")
    public final class194 method405(class599 arg0, class543[] arg1, boolean arg2) {
        ++field7862;
        return new class518(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(II)Ltf;")
    public class266 method363(int arg0, int arg1) {
        ++field7877;
        if (arg0 != -15892) {
            return null;
        } else if (~arg1 != -7) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    return ~arg1 == -8 ? new class684(this) : new class190(this);
                } else {
                    return new class110(this, this.field7810);
                }
            } else {
                return new class179(this);
            }
        } else {
            return new class41(this);
        }
    }

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "()Z")
    public final boolean method440() {
        ++field7916;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[[IZI)Ljs;")
    public abstract class300 method324(int arg0, int[][] arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lhn;IIII)Lba;")
    public final class352 method379(class661 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7840;
        return new class42(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method413(Canvas arg0) {
        ++field7842;
        if (this.field7805 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7896.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method350(arg0, -101);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field7896.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Liq;II)V")
    public abstract void method313(class555 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)Lka;")
    public final class434 method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7893;
        return new class47(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "(B)V")
    public abstract void method293(byte arg0);

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "(Z)V")
    private final void method3252(boolean arg0) {
        ++field7933;
        if (class243.field3465 != this.field8063) {
            class228 var2 = this.field8063;
            this.field8063 = class243.field3465;
            if (!var2.method1454(1433259682)) {
                this.method3243(-31429);
            }
            this.method3210(-124);
            this.field8001 = this.field8059;
            this.method3173(true);
            this.field8065 &= -8;
        }
        if (!arg0) {
            this.method469(106, 4, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(IIIIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7791;
        float var7 = this.method330(1);
        this.method3223(-2);
        this.method3248((byte) -118, arg4);
        this.method3177(0, 104, class22.field305);
        this.method3235(class22.field305, -12912, 0);
        this.method3242(-2, arg5);
        this.field7946.method2154((float) (arg2 + -1), (byte) 69, 1.0F, (float) (arg3 - 1));
        this.field7946.method2148(26921, 0.0F, (float) arg1 - var7, (float) arg0 + -var7);
        this.method3228(true);
        this.method295(false, 120);
        this.method3244((byte) 32, class287.field3999, 4);
        this.method295(true, -30);
        this.method3235(class558.field7530, -12912, 0);
        this.method3177(0, 105, class558.field7530);
    }

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "(B)Ljs;")
    public final class300 method3253(byte arg0) {
        ++field7932;
        if (arg0 != 4) {
            this.method3204(-88);
        }
        return this.field7997 == null ? null : this.field7997.method265(13);
    }

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "()Z")
    public final boolean method417() {
        ++field7939;
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lba;Lhfa;Lq;Lrc;I)V")
    public final void method434(class352 arg0, class281 arg1, class391 arg2, class494 arg3, int arg4) {
        arg0.method205(arg2, arg3, arg4);
        ++field7881;
        this.method419(arg1);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)V")
    public abstract void method333(int arg0, byte arg1);
}
