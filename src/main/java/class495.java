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

@OriginalClass("client!nh")
public abstract class class495 extends class98 {

    @OriginalMember(owner = "client!nh", name = "oc", descriptor = "Lau;")
    private class692 field7188 = new class692();

    @OriginalMember(owner = "client!nh", name = "Nd", descriptor = "Z")
    public boolean field7265 = true;

    @OriginalMember(owner = "client!nh", name = "Vd", descriptor = "Lds;")
    public class14 field7273 = new class14();

    @OriginalMember(owner = "client!nh", name = "Wd", descriptor = "Lds;")
    public class14 field7274 = new class14();

    @OriginalMember(owner = "client!nh", name = "Xd", descriptor = "Lds;")
    public class14 field7275 = new class14();

    @OriginalMember(owner = "client!nh", name = "Yd", descriptor = "Lds;")
    public class14 field7276 = new class14();

    @OriginalMember(owner = "client!nh", name = "Zd", descriptor = "Lds;")
    private class14 field7277 = new class14();

    @OriginalMember(owner = "client!nh", name = "ae", descriptor = "Lds;")
    private class14 field7278 = new class14();

    @OriginalMember(owner = "client!nh", name = "ee", descriptor = "Z")
    public boolean field7282 = false;

    @OriginalMember(owner = "client!nh", name = "ke", descriptor = "I")
    private int field7288 = -1;

    @OriginalMember(owner = "client!nh", name = "oe", descriptor = "[F")
    private float[] field7292 = new float[16];

    @OriginalMember(owner = "client!nh", name = "ue", descriptor = "I")
    public int field7298 = 0;

    @OriginalMember(owner = "client!nh", name = "Je", descriptor = "Z")
    private boolean field7313 = false;

    @OriginalMember(owner = "client!nh", name = "te", descriptor = "F")
    private float field7297 = 1.0F;

    @OriginalMember(owner = "client!nh", name = "Pe", descriptor = "F")
    public float field7319 = 1.0F;

    @OriginalMember(owner = "client!nh", name = "ie", descriptor = "I")
    public int field7286 = 128;

    @OriginalMember(owner = "client!nh", name = "Be", descriptor = "F")
    public float field7305 = 1.0F;

    @OriginalMember(owner = "client!nh", name = "Ve", descriptor = "Z")
    public boolean field7325 = true;

    @OriginalMember(owner = "client!nh", name = "je", descriptor = "[F")
    private float[] field7287 = new float[16];

    @OriginalMember(owner = "client!nh", name = "re", descriptor = "Z")
    public boolean field7295 = true;

    @OriginalMember(owner = "client!nh", name = "Me", descriptor = "Z")
    private boolean field7316 = false;

    @OriginalMember(owner = "client!nh", name = "ef", descriptor = "F")
    public float field7334 = 1.0F;

    @OriginalMember(owner = "client!nh", name = "He", descriptor = "I")
    public int field7311 = 512;

    @OriginalMember(owner = "client!nh", name = "cf", descriptor = "I")
    public int field7332 = -1;

    @OriginalMember(owner = "client!nh", name = "se", descriptor = "F")
    public float field7296 = 3584.0F;

    @OriginalMember(owner = "client!nh", name = "ff", descriptor = "I")
    public int field7335 = 3;

    @OriginalMember(owner = "client!nh", name = "Fe", descriptor = "Leq;")
    public class335 field7309 = class22.field302;

    @OriginalMember(owner = "client!nh", name = "we", descriptor = "I")
    public int field7300 = 0;

    @OriginalMember(owner = "client!nh", name = "Ue", descriptor = "I")
    public int field7324 = 8;

    @OriginalMember(owner = "client!nh", name = "ve", descriptor = "Z")
    private boolean field7299 = false;

    @OriginalMember(owner = "client!nh", name = "sf", descriptor = "Z")
    public boolean field7347 = true;

    @OriginalMember(owner = "client!nh", name = "ce", descriptor = "I")
    private int field7280 = 0;

    @OriginalMember(owner = "client!nh", name = "qf", descriptor = "Z")
    public boolean field7345 = false;

    @OriginalMember(owner = "client!nh", name = "wf", descriptor = "Z")
    public boolean field7351 = true;

    @OriginalMember(owner = "client!nh", name = "Cf", descriptor = "[F")
    private float[] field7357 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nh", name = "rf", descriptor = "I")
    private int field7346 = 1;

    @OriginalMember(owner = "client!nh", name = "Gf", descriptor = "I")
    public int field7361 = 0;

    @OriginalMember(owner = "client!nh", name = "Ze", descriptor = "I")
    public int field7329 = 0;

    @OriginalMember(owner = "client!nh", name = "Ce", descriptor = "[F")
    public float[] field7306 = this.field7357;

    @OriginalMember(owner = "client!nh", name = "nf", descriptor = "Z")
    private boolean field7342 = false;

    @OriginalMember(owner = "client!nh", name = "xe", descriptor = "F")
    public float field7301 = 1.0F;

    @OriginalMember(owner = "client!nh", name = "qe", descriptor = "F")
    public float field7294 = -1.0F;

    @OriginalMember(owner = "client!nh", name = "Ye", descriptor = "I")
    public int field7328 = 0;

    @OriginalMember(owner = "client!nh", name = "yf", descriptor = "[Lcf;")
    private class135[] field7353 = new class135[10];

    @OriginalMember(owner = "client!nh", name = "Xe", descriptor = "I")
    private int field7327 = 0;

    @OriginalMember(owner = "client!nh", name = "Ff", descriptor = "[F")
    public float[] field7360 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nh", name = "Kf", descriptor = "Z")
    private boolean field7365 = false;

    @OriginalMember(owner = "client!nh", name = "Ne", descriptor = "I")
    public int field7317 = -1;

    @OriginalMember(owner = "client!nh", name = "pe", descriptor = "I")
    private int field7293 = 0;

    @OriginalMember(owner = "client!nh", name = "zf", descriptor = "I")
    private int field7354 = 16777215;

    @OriginalMember(owner = "client!nh", name = "Re", descriptor = "I")
    public int field7321 = 50;

    @OriginalMember(owner = "client!nh", name = "Sf", descriptor = "Z")
    public boolean field7373 = false;

    @OriginalMember(owner = "client!nh", name = "lf", descriptor = "I")
    public int field7340 = 512;

    @OriginalMember(owner = "client!nh", name = "uf", descriptor = "Z")
    private boolean field7349 = false;

    @OriginalMember(owner = "client!nh", name = "Af", descriptor = "[F")
    private float[] field7355 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nh", name = "Tf", descriptor = "Lwea;")
    public class90 field7374 = class196.field3068;

    @OriginalMember(owner = "client!nh", name = "ye", descriptor = "F")
    public float field7302 = 3584.0F;

    @OriginalMember(owner = "client!nh", name = "If", descriptor = "F")
    public float field7363 = -1.0F;

    @OriginalMember(owner = "client!nh", name = "Oe", descriptor = "I")
    public int field7318 = 0;

    @OriginalMember(owner = "client!nh", name = "Wf", descriptor = "I")
    public int field7377 = 0;

    @OriginalMember(owner = "client!nh", name = "Jf", descriptor = "I")
    public int field7364 = 0;

    @OriginalMember(owner = "client!nh", name = "fe", descriptor = "I")
    public int field7283 = 3584;

    @OriginalMember(owner = "client!nh", name = "Nf", descriptor = "[F")
    private float[] field7368 = new float[16];

    @OriginalMember(owner = "client!nh", name = "mf", descriptor = "Z")
    public boolean field7341 = true;

    @OriginalMember(owner = "client!nh", name = "Ge", descriptor = "[F")
    public float[] field7310 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!nh", name = "Vf", descriptor = "I")
    private int field7376 = -1;

    @OriginalMember(owner = "client!nh", name = "me", descriptor = "Z")
    public boolean field7290 = false;

    @OriginalMember(owner = "client!nh", name = "af", descriptor = "I")
    public int field7330 = 0;

    @OriginalMember(owner = "client!nh", name = "ne", descriptor = "I")
    public int field7291 = 0;

    @OriginalMember(owner = "client!nh", name = "Lf", descriptor = "I")
    private int field7366 = -1;

    @OriginalMember(owner = "client!nh", name = "Hf", descriptor = "[F")
    private float[] field7362 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nh", name = "Df", descriptor = "I")
    private int field7358 = 0;

    @OriginalMember(owner = "client!nh", name = "Of", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7369 = new Stream();

    @OriginalMember(owner = "client!nh", name = "ig", descriptor = "Lds;")
    private class14 field7389 = new class14();

    @OriginalMember(owner = "client!nh", name = "le", descriptor = "I")
    public int field7289;

    @OriginalMember(owner = "client!nh", name = "Vc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7221;

    @OriginalMember(owner = "client!nh", name = "ob", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7136;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Ljava/lang/Object;")
    public Object field7095;

    @OriginalMember(owner = "client!nh", name = "Db", descriptor = "Ljava/lang/Object;")
    private Object field7151;

    @OriginalMember(owner = "client!nh", name = "Fd", descriptor = "Lvo;")
    public class345 field7257;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    private int field7101;

    @OriginalMember(owner = "client!nh", name = "Rb", descriptor = "I")
    public int field7165;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    private int field7110;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public int field7098;

    @OriginalMember(owner = "client!nh", name = "Ae", descriptor = "I")
    public int field7304;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field7121;

    @OriginalMember(owner = "client!nh", name = "Ie", descriptor = "Lum;")
    private class530 field7312;

    @OriginalMember(owner = "client!nh", name = "Uc", descriptor = "I")
    public static int field7220 = 0;

    @OriginalMember(owner = "client!nh", name = "be", descriptor = "F")
    public float field7279;

    @OriginalMember(owner = "client!nh", name = "de", descriptor = "F")
    public float field7281;

    @OriginalMember(owner = "client!nh", name = "ge", descriptor = "F")
    public float field7284;

    @OriginalMember(owner = "client!nh", name = "De", descriptor = "F")
    private float field7307;

    @OriginalMember(owner = "client!nh", name = "Le", descriptor = "F")
    public float field7315;

    @OriginalMember(owner = "client!nh", name = "Se", descriptor = "F")
    public float field7322;

    @OriginalMember(owner = "client!nh", name = "bf", descriptor = "F")
    private float field7331;

    @OriginalMember(owner = "client!nh", name = "hf", descriptor = "F")
    public float field7337;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!nh", name = "kb", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!nh", name = "lb", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!nh", name = "mb", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!nh", name = "nb", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!nh", name = "pb", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!nh", name = "qb", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!nh", name = "rb", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!nh", name = "sb", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!nh", name = "tb", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!nh", name = "ub", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!nh", name = "vb", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!nh", name = "wb", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!nh", name = "xb", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!nh", name = "yb", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!nh", name = "zb", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!nh", name = "Ab", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!nh", name = "Bb", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!nh", name = "Cb", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!nh", name = "Eb", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!nh", name = "Fb", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!nh", name = "Gb", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!nh", name = "Hb", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!nh", name = "Ib", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!nh", name = "Jb", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!nh", name = "Kb", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!nh", name = "Lb", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!nh", name = "Mb", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!nh", name = "Nb", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!nh", name = "Ob", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!nh", name = "Pb", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!nh", name = "Qb", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!nh", name = "Sb", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!nh", name = "Tb", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!nh", name = "Ub", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!nh", name = "Vb", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!nh", name = "Wb", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!nh", name = "Xb", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!nh", name = "Yb", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!nh", name = "Zb", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!nh", name = "ac", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!nh", name = "bc", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!nh", name = "cc", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!nh", name = "dc", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!nh", name = "ec", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!nh", name = "fc", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!nh", name = "gc", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!nh", name = "hc", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!nh", name = "ic", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!nh", name = "jc", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!nh", name = "kc", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!nh", name = "lc", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!nh", name = "mc", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!nh", name = "nc", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!nh", name = "pc", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!nh", name = "qc", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!nh", name = "sc", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!nh", name = "tc", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!nh", name = "uc", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!nh", name = "vc", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!nh", name = "wc", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!nh", name = "xc", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!nh", name = "yc", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!nh", name = "zc", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!nh", name = "Ac", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!nh", name = "Bc", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!nh", name = "Cc", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!nh", name = "Dc", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!nh", name = "Ec", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!nh", name = "Fc", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!nh", name = "Gc", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!nh", name = "Hc", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!nh", name = "Ic", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!nh", name = "Jc", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!nh", name = "Kc", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!nh", name = "Lc", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!nh", name = "Mc", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!nh", name = "Nc", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!nh", name = "Oc", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!nh", name = "Pc", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!nh", name = "Qc", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!nh", name = "Rc", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!nh", name = "Sc", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!nh", name = "Tc", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!nh", name = "Wc", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!nh", name = "Xc", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!nh", name = "Yc", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!nh", name = "Zc", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!nh", name = "ad", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!nh", name = "bd", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!nh", name = "cd", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!nh", name = "dd", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!nh", name = "ed", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!nh", name = "fd", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!nh", name = "gd", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!nh", name = "hd", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!nh", name = "id", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!nh", name = "jd", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!nh", name = "kd", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!nh", name = "ld", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!nh", name = "md", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!nh", name = "nd", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!nh", name = "od", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!nh", name = "pd", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!nh", name = "qd", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!nh", name = "rd", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!nh", name = "sd", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!nh", name = "td", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!nh", name = "vd", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!nh", name = "wd", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!nh", name = "xd", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!nh", name = "yd", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!nh", name = "zd", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!nh", name = "Bd", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!nh", name = "Cd", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!nh", name = "Dd", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!nh", name = "Ed", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!nh", name = "Gd", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!nh", name = "Hd", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!nh", name = "Id", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!nh", name = "Jd", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!nh", name = "Kd", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!nh", name = "Ld", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!nh", name = "Md", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!nh", name = "Od", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!nh", name = "Pd", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!nh", name = "Qd", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!nh", name = "Rd", descriptor = "I")
    public int field7269;

    @OriginalMember(owner = "client!nh", name = "Sd", descriptor = "I")
    public int field7270;

    @OriginalMember(owner = "client!nh", name = "Td", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!nh", name = "Ud", descriptor = "I")
    public int field7272;

    @OriginalMember(owner = "client!nh", name = "Ke", descriptor = "I")
    public int field7314;

    @OriginalMember(owner = "client!nh", name = "df", descriptor = "I")
    public int field7333;

    @OriginalMember(owner = "client!nh", name = "jf", descriptor = "I")
    private int field7338;

    @OriginalMember(owner = "client!nh", name = "kf", descriptor = "I")
    public int field7339;

    @OriginalMember(owner = "client!nh", name = "tf", descriptor = "I")
    public int field7348;

    @OriginalMember(owner = "client!nh", name = "vf", descriptor = "I")
    private int field7350;

    @OriginalMember(owner = "client!nh", name = "Mf", descriptor = "I")
    public int field7367;

    @OriginalMember(owner = "client!nh", name = "Pf", descriptor = "I")
    public int field7370;

    @OriginalMember(owner = "client!nh", name = "Uf", descriptor = "I")
    public int field7375;

    @OriginalMember(owner = "client!nh", name = "Xf", descriptor = "I")
    public int field7378;

    @OriginalMember(owner = "client!nh", name = "tg", descriptor = "I")
    private int field7400;

    @OriginalMember(owner = "client!nh", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!nh", name = "Ee", descriptor = "Lcf;")
    private class135 field7308;

    @OriginalMember(owner = "client!nh", name = "ag", descriptor = "Leu;")
    private class175 field7381;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "Lob;")
    public class354 field7112;

    @OriginalMember(owner = "client!nh", name = "gf", descriptor = "Laj;")
    public class402 field7336;

    @OriginalMember(owner = "client!nh", name = "Rf", descriptor = "Laq;")
    private class445 field7372;

    @OriginalMember(owner = "client!nh", name = "xf", descriptor = "Lgb;")
    private class468 field7352;

    @OriginalMember(owner = "client!nh", name = "cg", descriptor = "Lwf;")
    private class483 field7383;

    @OriginalMember(owner = "client!nh", name = "og", descriptor = "Lwf;")
    private class483 field7395;

    @OriginalMember(owner = "client!nh", name = "Zf", descriptor = "Ldt;")
    public class573 field7380;

    @OriginalMember(owner = "client!nh", name = "bg", descriptor = "Ldt;")
    private class573 field7382;

    @OriginalMember(owner = "client!nh", name = "dg", descriptor = "Ldt;")
    public class573 field7384;

    @OriginalMember(owner = "client!nh", name = "fg", descriptor = "Ldt;")
    private class573 field7386;

    @OriginalMember(owner = "client!nh", name = "hg", descriptor = "Ldt;")
    public class573 field7388;

    @OriginalMember(owner = "client!nh", name = "qg", descriptor = "Ldt;")
    public class573 field7397;

    @OriginalMember(owner = "client!nh", name = "eg", descriptor = "Lqh;")
    public class67 field7385;

    @OriginalMember(owner = "client!nh", name = "gg", descriptor = "Lqh;")
    public class67 field7387;

    @OriginalMember(owner = "client!nh", name = "jg", descriptor = "Lqh;")
    public class67 field7390;

    @OriginalMember(owner = "client!nh", name = "kg", descriptor = "Lqh;")
    public class67 field7391;

    @OriginalMember(owner = "client!nh", name = "lg", descriptor = "Lqh;")
    public class67 field7392;

    @OriginalMember(owner = "client!nh", name = "mg", descriptor = "Lqh;")
    public class67 field7393;

    @OriginalMember(owner = "client!nh", name = "ng", descriptor = "Lqh;")
    public class67 field7394;

    @OriginalMember(owner = "client!nh", name = "pg", descriptor = "Lqh;")
    public class67 field7396;

    @OriginalMember(owner = "client!nh", name = "rg", descriptor = "Lqh;")
    public class67 field7398;

    @OriginalMember(owner = "client!nh", name = "sg", descriptor = "Lqh;")
    public class67 field7399;

    @OriginalMember(owner = "client!nh", name = "Ad", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7252;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field7118;

    @OriginalMember(owner = "client!nh", name = "ud", descriptor = "Ljava/awt/Font;")
    public static Font field7246;

    @OriginalMember(owner = "client!nh", name = "rc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7191;

    @OriginalMember(owner = "client!nh", name = "Qe", descriptor = "Z")
    public boolean field7320;

    @OriginalMember(owner = "client!nh", name = "Te", descriptor = "Z")
    public boolean field7323;

    @OriginalMember(owner = "client!nh", name = "Ef", descriptor = "Z")
    public boolean field7359;

    @OriginalMember(owner = "client!nh", name = "Qf", descriptor = "Z")
    public boolean field7371;

    @OriginalMember(owner = "client!nh", name = "Yf", descriptor = "Z")
    public boolean field7379;

    @OriginalMember(owner = "client!nh", name = "ug", descriptor = "Z")
    public boolean field7401;

    @OriginalMember(owner = "client!nh", name = "We", descriptor = "[Lds;")
    public class14[] field7326;

    @OriginalMember(owner = "client!nh", name = "ze", descriptor = "[Ltw;")
    public class233[] field7303;

    @OriginalMember(owner = "client!nh", name = "Bf", descriptor = "[Lam;")
    public class289[] field7356;

    @OriginalMember(owner = "client!nh", name = "he", descriptor = "[Lel;")
    public class3[] field7285;

    @OriginalMember(owner = "client!nh", name = "of", descriptor = "[Lel;")
    public class3[] field7343;

    @OriginalMember(owner = "client!nh", name = "pf", descriptor = "[Laj;")
    private class402[] field7344;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)V")
    public static void method2895(int arg0) {
        field7246 = null;
        if (arg0 != 0) {
            method2895(121);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)V")
    public final void method2896(byte arg0, int arg1) {
        if (arg1 != -1386621944) {
            this.method771(-14, 45, -125, 1);
        }
        this.method2936(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16, -126);
        ++field7271;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)[F")
    public final float[] method2897(byte arg0) {
        if (arg0 < 3) {
            this.field7383 = null;
        }
        ++field7226;
        return this.field7357;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
    public final int method2898(byte arg0) {
        ++field7268;
        if (arg0 > -7) {
            this.method149(-41);
        }
        return this.field7280;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
    public final int method738(int arg0, int arg1) {
        ++field7196;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "(I)V")
    private final void method2899(int arg0) {
        this.field7279 = (float) (-this.field7329 + this.field7377);
        this.field7281 = (float) (-this.field7298 + this.field7291);
        ++field7102;
        this.field7337 = (float) (this.field7318 - this.field7329);
        int var2 = 105 % ((arg0 - -58) / 56);
        this.field7284 = (float) (-this.field7298 + this.field7330);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljb;ILqda;)Z")
    public abstract boolean method91(class666 arg0, int arg1, class689 arg2);

    @OriginalMember(owner = "client!nh", name = "FA", descriptor = "(ILua;II)V")
    public final void method780(int arg0, class591 arg1, int arg2, int arg3) {
        ++field7239;
        class685 var5 = (class685) arg1;
        class612 var6 = var5.field9733;
        this.method2948(0);
        this.method2924(13528, var6);
        this.method2938(1, (byte) 88);
        this.method2959(class345.field4866, class345.field4866, (byte) -110);
        this.method2914(17, 0, class450.field6484);
        this.method2936(arg0, -124);
        this.field7273.method190(-68, 0.0F, (float) this.field7098, (float) this.field7165);
        this.method2973(true);
        this.field7326[0].method190(-66, 1.0F, var6.method416(-14098, (float) this.field7098), var6.method418((float) this.field7165, false));
        this.field7326[0].method182(var6.method416(-14098, (float) (-arg2)), var6.method418((float) (-arg3), false), (byte) 120, 0.0F);
        this.field7303[0] = class303.field4244;
        this.method2918((byte) 109);
        this.method2964((byte) 71);
        this.method2954((byte) 84);
        this.method2914(42, 0, class171.field2763);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
    public final void method2900(int arg0, boolean arg1) {
        if (arg0 < -105) {
            ++field7114;
            if (!arg1 != !this.field7373) {
                this.field7373 = arg1;
                this.method140((byte) -28);
                this.field7338 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[I[I)Lua;")
    public final class591 method748(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7164;
        return class666.method3750(arg2, arg1, arg0, arg3, this, 61);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
    public abstract void method150(byte arg0);

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "(I)I")
    public final int method2901(int arg0) {
        ++field7214;
        return arg0 <= 55 ? -58 : this.field7288;
    }

    @OriginalMember(owner = "client!nh", name = "va", descriptor = "(I)V")
    public final void method781(int arg0) {
        ++field7199;
        this.field7335 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field7335;
        }
        this.field7324 = 1 << this.field7335;
    }

    @OriginalMember(owner = "client!nh", name = "ZA", descriptor = "(Z)V")
    public final void method770(boolean arg0) {
        ++field7219;
        this.field7347 = arg0;
        this.method90(-107);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZILct;Z)V")
    public abstract void method73(boolean arg0, int arg1, class479 arg2, boolean arg3);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIILjb;IZ)Ldca;")
    public final class612 method2902(byte[] arg0, int arg1, int arg2, class666 arg3, int arg4, boolean arg5) {
        ++field7240;
        if (arg1 != 0) {
            this.method767();
        }
        return this.method107(arg2, arg4, arg0, arg5, 0, 93, arg3, 0);
    }

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "(I)V")
    public final void method2903(int arg0) {
        ++field7146;
        Hashtable var2 = new Hashtable();
        if (this.field7191 != null && !this.field7191.isEmpty()) {
            Enumeration var3 = this.field7191.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method104(arg0 ^ -2147483521, var4));
            }
        }
        this.field7191 = var2;
        this.method2921(arg0 ^ arg0);
        this.method2940(true);
        this.field7372.method2601(1, this);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
    public final void method2904(byte arg0) {
        if (arg0 != 38) {
            this.field7387 = null;
        }
        if (~this.field7338 != -17) {
            this.method2974((byte) -106);
            this.method2930(2, true);
            this.method2900(-110, true);
            this.method2931(arg0 ^ -8231, true);
            this.method2938(1, (byte) -44);
            this.field7338 = 16;
        }
        ++field7119;
    }

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "(I)V")
    private final void method2905(int arg0) {
        if (arg0 < 45) {
            this.method743(19, 16, -47, -113, -107, -79, 49);
        }
        if (class242.field3548 != this.field7374) {
            class90 var2 = this.field7374;
            this.field7374 = class242.field3548;
            if (!var2.method672(true)) {
                this.method2910(19022);
            }
            this.method2906((byte) -49);
            this.field7306 = this.field7292;
            this.method2920(110);
            this.field7338 &= -8;
        }
        ++field7262;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V")
    private final void method2906(byte arg0) {
        ++field7233;
        if (!this.field7313) {
            float[] var2 = this.field7292;
            float var3 = (float) (-this.field7298 * this.field7321) / (float) this.field7340;
            float var4 = (float) ((-this.field7298 + this.field7098) * this.field7321) / (float) this.field7340;
            float var5 = (float) (this.field7329 * this.field7321) / (float) this.field7311;
            float var6 = (float) ((-this.field7165 + this.field7329) * this.field7321) / (float) this.field7311;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field7321 * 2.0F;
                var2[0] = var7 / (var4 - var3);
                var2[6] = 0.0F;
                var2[11] = -1.0F;
                var2[12] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[14] = this.field7307 = (float) (this.field7321 * this.field7283) / (float) (-this.field7283 + this.field7321);
                var2[10] = this.field7331 = (float) this.field7283 / (float) (this.field7321 - this.field7283);
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[3] = 0.0F;
                var2[15] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = var7 / (var5 - var6);
            } else {
                var2[9] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[5] = 1.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
            }
            this.method2917((byte) 40);
            this.field7313 = true;
        }
        if (arg0 != -49) {
            this.method2902((byte[]) null, -77, -87, (class666) null, 61, true);
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(B)I")
    public final int method2907(byte arg0) {
        int var2 = 119 % ((arg0 - 25) / 35);
        ++field7163;
        return this.field7328;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZB)V")
    public final void method2908(boolean arg0, byte arg1) {
        if (arg0 == !this.field7290) {
            this.field7290 = arg0;
            this.method69((byte) -126);
        }
        ++field7148;
        if (arg1 != 97) {
            this.field7380 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "(I)V")
    private final void method2909(int arg0) {
        ++field7107;
        if (this.field7338 != arg0) {
            this.method2958(true);
            this.method2930(2, false);
            this.method2939(false, (byte) -121);
            this.method2900(-106, false);
            this.method2931(arg0 + -8194, false);
            this.method2922(-2, -27382, false, false);
            this.method2956((byte) 47, 1);
            this.method2924(arg0 ^ 13529, this.field7336);
            this.field7338 = 1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "CA", descriptor = "(IIII)V")
    public final void method760(int arg0, int arg1, int arg2, int arg3) {
        ++field7153;
        this.field7350 = arg0;
        this.field7280 = arg3;
        this.field7288 = arg1;
        this.field7359 = true;
        this.field7366 = arg2;
    }

    @OriginalMember(owner = "client!nh", name = "la", descriptor = "(IIII)V")
    public final void method819(int arg0, int arg1, int arg2, int arg3) {
        this.field7329 = arg1;
        this.field7340 = arg2;
        ++field7131;
        this.field7311 = arg3;
        this.field7298 = arg0;
        this.method2913((byte) 123);
        this.method2947(66);
        this.method2970((byte) -128);
        this.method2899(-124);
    }

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "(I)V")
    private final void method2910(int arg0) {
        ++field7127;
        this.field7299 = false;
        if (this.field7308 != null) {
            this.field7308.method383((byte) 83);
        }
        if (arg0 != 19022) {
            this.method2934(0.90321827F, 1.578149F, 0.11227156F, 0.3812178F, 0.39494315F, false, 0.62613684F);
        }
        this.method92(arg0 ^ 10625);
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(B)V")
    private final void method2911(byte arg0) {
        this.field7365 = false;
        ++field7108;
        if (arg0 <= 9) {
            this.field7315 = 0.25313628F;
        }
        if (class480.field6869 == this.field7374) {
            this.method2926(false);
            this.method2920(97);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method2912(int arg0, Buffer arg1) {
        ++field7115;
        this.field7369.method2043(arg1);
        if (arg0 <= 72) {
            this.field7359 = false;
        }
        return this.field7369;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(B)V")
    private final void method2913(byte arg0) {
        this.field7342 = false;
        if (arg0 < 100) {
            this.method2914(35, -113, (class479) null);
        }
        ++field7250;
        this.method2971(0);
        if (class400.field5793 == this.field7374) {
            this.method2920(101);
        }
    }

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "()V")
    public void method105() {
        if (!this.field7349) {
            for (class435 var1 = this.field7188.method3905(-128); var1 != null; var1 = this.field7188.method3899(0)) {
                ((class498) var1).method2982(true);
            }
            Enumeration var2 = this.field7191.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method89((byte) -77, var3, this.field7191.get(var3));
            }
            class487.method2849(34037, false, true);
            this.field7121.release();
            this.field7349 = true;
        }
        ++field7207;
    }

    @OriginalMember(owner = "client!nh", name = "JA", descriptor = "()V")
    public final void method805() {
        this.field7377 = 0;
        this.field7330 = 0;
        this.field7318 = this.field7165;
        ++field7213;
        this.field7291 = this.field7098;
        if (this.field7401) {
            this.field7401 = false;
            this.method101((byte) 17);
        }
        this.method2899(30);
    }

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "(I)V")
    public abstract void method90(int arg0);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
    public abstract void method145(boolean arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lfda;Z)Lf;")
    public final class257 method772(class628 arg0, boolean arg1) {
        ++field7174;
        class257 var10;
        if (~arg0.field8936 != -1 && ~arg0.field8940 != -1) {
            int[] var3 = new int[arg0.field8940 * arg0.field8936];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field8934 == null) {
                for (int var6 = 0; var6 < arg0.field8940; ++var6) {
                    for (int var7 = 0; var7 < arg0.field8936; ++var7) {
                        int var8 = arg0.field8938[arg0.field8939[var4++] & 255];
                        var3[var5++] = var8 == 0 ? 0 : class460.method2676(-16777216, var8);
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field8940; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field8936; ++var11) {
                        var3[var5++] = class460.method2676(arg0.field8934[var4] << 24, arg0.field8938[class248.method1593(arg0.field8939[var4], 255)]);
                        ++var4;
                    }
                }
            }
            var10 = this.method806(var3, 0, arg0.field8936, arg0.field8936, arg0.field8940);
        } else {
            var10 = this.method806(new int[1], 0, 1, 1, 1);
        }
        var10.method7(arg0.field8933, arg0.field8935, arg0.field8932, arg0.field8937);
        return var10;
    }

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "(I)V")
    public abstract void method92(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILeu;Lgca;BI)V")
    public abstract void method116(int arg0, int arg1, int arg2, class175 arg3, class627 arg4, byte arg5, int arg6);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILct;)V")
    public final void method2914(int arg0, int arg1, class479 arg2) {
        if (arg0 <= 7) {
            this.field7273 = null;
        }
        this.method143(false, arg2, 122, false, arg1);
        ++field7120;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lcr;IIII)Lda;")
    public final class397 method795(class163 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7194;
        return new class67(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZIIIZ)V")
    private final void method2915(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 != 1086) {
            this.method766();
        }
        boolean var7 = arg5 & this.method767();
        ++field7180;
        if (!var7 && (~arg0 == -5 || arg0 == 8 || ~arg0 == -10)) {
            arg0 = 2;
            arg3 = arg0 != 4 ? 1 : arg4 & 1;
            arg4 = 0;
        }
        if (~arg0 != -1 && arg1) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field7327 != arg0) {
            if (this.field7327 != 0) {
                this.field7353[Integer.MAX_VALUE & this.field7327].method385(85);
            }
            if (~arg0 != -1) {
                this.field7308 = this.field7353[arg0 & Integer.MAX_VALUE];
                this.field7308.method376(arg1, -25475);
                this.field7308.method375(63, arg1);
                this.field7308.method377(arg3, arg4, 0);
            } else {
                this.field7308 = null;
            }
            this.field7293 = arg3;
            this.field7358 = arg4;
            this.field7327 = arg0;
        } else if (this.field7327 != 0) {
            this.field7353[Integer.MAX_VALUE & this.field7327].method375(70, arg1);
            if (this.field7358 != arg4 || ~this.field7293 != ~arg3) {
                this.field7353[Integer.MAX_VALUE & this.field7327].method377(arg3, arg4, 0);
                this.field7293 = arg3;
                this.field7358 = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "(IIIII)V")
    public final void method817(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method782(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
        ++field7138;
    }

    @OriginalMember(owner = "client!nh", name = "oa", descriptor = "([I)V")
    public final void method764(int[] arg0) {
        arg0[2] = this.field7291;
        arg0[3] = this.field7318;
        arg0[0] = this.field7330;
        arg0[1] = this.field7377;
        ++field7260;
    }

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(B)V")
    public void method71(byte arg0) {
        if (arg0 <= -40) {
            ++field7130;
            this.method2941(98);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lhp;I)V")
    public abstract void method125(class329 arg0, int arg1);

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(Z)I")
    public final int method2916(boolean arg0) {
        ++field7254;
        return arg0 ? 17 : this.field7350;
    }

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7237;
        float var7 = this.field7274.method160((float) arg2, 0, (float) arg1, (float) arg0);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field7274.method160((float) arg5, 0, (float) arg4, (float) arg3);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field7321 > var7) || !((float) this.field7321 > var8)) && (!(var7 > (float) this.field7283) || !(var8 > (float) this.field7283))) {
            int var9 = (int) ((float) this.field7340 * this.field7274.method188(1, (float) arg0, (float) arg2, (float) arg1) / var7);
            int var10 = (int) ((float) this.field7340 * this.field7274.method188(1, (float) arg3, (float) arg5, (float) arg4) / var8);
            if ((float) var9 < this.field7284 && (float) var10 < this.field7284 || this.field7281 < (float) var9 && (float) var10 > this.field7281) {
                return false;
            } else {
                int var11 = (int) ((float) this.field7311 * this.field7274.method174(false, (float) arg1, (float) arg0, (float) arg2) / var7);
                int var12 = (int) ((float) this.field7311 * this.field7274.method174(false, (float) arg4, (float) arg3, (float) arg5) / var8);
                return (!((float) var11 < this.field7279) || !(this.field7279 > (float) var12)) && (!(this.field7337 < (float) var11) || !((float) var12 > this.field7337));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "(B)V")
    private final void method2917(byte arg0) {
        this.field7292[14] = this.field7307;
        if (arg0 != 40) {
            this.method800((Canvas) null);
        }
        ++field7224;
        this.field7292[10] = this.field7331;
        this.field7302 = (this.field7292[14] + (float) (-this.field7283)) / this.field7292[10];
    }

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "(B)V")
    private final void method2918(byte arg0) {
        if (arg0 >= 6) {
            ++field7264;
            this.method99(90);
            if (this.field7308 != null) {
                this.field7308.method378(0);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "(I)V")
    public final void method2919(int arg0) {
        this.field7343 = new class3[this.field7348];
        this.field7326 = new class14[this.field7348];
        this.field7285 = new class3[this.field7348];
        this.field7344 = new class402[this.field7348];
        this.field7303 = new class233[this.field7348];
        ++field7169;
        for (int var2 = 0; var2 < this.field7348; ++var2) {
            this.field7285[var2] = class55.field715;
            this.field7343[var2] = class55.field715;
            this.field7303[var2] = class172.field2780;
            this.field7326[var2] = new class14();
        }
        this.field7356 = new class289[this.field7367 + -2];
        this.field7336 = this.method103(class297.field4191, class689.field9771, 1, 1, (byte) 95);
        if (arg0 <= -99) {
            this.method822(new class498(262144));
            this.field7397 = this.method141(new class148[] { new class148(new class324[] { class324.field4509, class324.field4514 }) }, false);
            this.field7380 = this.method141(new class148[] { new class148(new class324[] { class324.field4509, class324.field4512 }) }, false);
            this.field7388 = this.method141(new class148[] { new class148(class324.field4509), new class148(class324.field4512), new class148(class324.field4514), new class148(class324.field4510) }, false);
            this.field7384 = this.method141(new class148[] { new class148(class324.field4509), new class148(class324.field4512), new class148(class324.field4514) }, false);
            this.field7385 = new class67(this, 0, 0, false, false);
            this.field7390 = new class67(this, 0, 0, true, true);
            this.field7394 = new class67(this, 0, 0, false, false);
            this.field7396 = new class67(this, 0, 0, true, true);
            this.field7387 = new class67(this, 0, 0, false, false);
            this.field7393 = new class67(this, 0, 0, true, true);
            this.field7399 = new class67(this, 0, 0, false, false);
            this.field7391 = new class67(this, 0, 0, true, true);
            this.field7398 = new class67(this, 0, 0, false, false);
            this.field7392 = new class67(this, 0, 0, true, true);
            this.field7372 = new class445(this);
            this.field7381 = this.method115((byte) 123, true);
            this.method2903(Integer.MAX_VALUE);
            this.field7112 = new class354(this);
            this.field7353[1] = this.method79(5076, 1);
            this.field7353[2] = this.method79(5076, 2);
            this.field7353[4] = this.method79(5076, 4);
            this.field7353[5] = this.method79(5076, 5);
            this.field7353[6] = this.method79(5076, 6);
            this.field7353[7] = this.method79(5076, 7);
            this.field7353[3] = this.method79(5076, 3);
            this.field7353[8] = this.method79(5076, 8);
            this.field7353[9] = this.method79(5076, 9);
            if (!this.field7353[2].method379(-4931)) {
                this.field7353[2] = this.method79(5076, 0);
            }
            if (!this.field7353[4].method379(-4931)) {
                this.field7353[4] = this.field7353[2];
            }
            if (!this.field7353[8].method379(-4931)) {
                this.field7353[8] = this.field7353[4];
            }
            if (!this.field7353[9].method379(-4931)) {
                this.field7353[9] = this.field7353[8];
            }
            this.method71((byte) -63);
            this.method805();
            this.method128();
        }
    }

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "(I)V")
    private final void method2920(int arg0) {
        this.method150((byte) 126);
        if (arg0 < 69) {
            this.peer = -45L;
        }
        ++field7208;
        if (this.field7308 != null) {
            this.field7308.method381(126);
        }
    }

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "()I")
    public final int method746() {
        ++field7189;
        return this.field7283;
    }

    @OriginalMember(owner = "client!nh", name = "XA", descriptor = "(IIIII)V")
    public final void method741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method782(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field7168;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lqg;)V")
    public final void method737(class272 arg0) {
        ++field7183;
        this.field7372.method2597(-1, (byte) 124, this, arg0);
    }

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "(I)V")
    private final void method2921(int arg0) {
        this.field7383 = this.method119(false, 0);
        ++field7092;
        this.field7383.method535(14036, 140, 28);
        for (int var2 = arg0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field7383.method532(true, (byte) 56);
            if (var3 != null) {
                Stream var4 = this.method2912(79, var3);
                if (!Stream.method2042()) {
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(1.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(1.0F);
                    var4.method2035(0.0F);
                    var4.method2035(1.0F);
                    var4.method2035(1.0F);
                    var4.method2035(1.0F);
                    var4.method2035(0.0F);
                    var4.method2035(1.0F);
                    var4.method2035(1.0F);
                    var4.method2035(1.0F);
                    var4.method2035(1.0F);
                    var4.method2035(1.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(1.0F);
                    var4.method2035(0.0F);
                    var4.method2035(1.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                    var4.method2035(0.0F);
                } else {
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(1.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(1.0F);
                    var4.method2037(0.0F);
                    var4.method2037(1.0F);
                    var4.method2037(1.0F);
                    var4.method2037(1.0F);
                    var4.method2037(0.0F);
                    var4.method2037(1.0F);
                    var4.method2037(1.0F);
                    var4.method2037(1.0F);
                    var4.method2037(1.0F);
                    var4.method2037(1.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(1.0F);
                    var4.method2037(0.0F);
                    var4.method2037(1.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                    var4.method2037(0.0F);
                }
                var4.method2034();
                if (this.field7383.method530(-14770)) {
                    break;
                }
            }
        }
        this.field7382 = this.method141(new class148[] { new class148(new class324[] { class324.field4509, class324.field4514, class324.field4514 }) }, false);
    }

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "(I)V")
    public abstract void method76(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)Lf;")
    public final class257 method825(int arg0, int arg1, boolean arg2) {
        ++field7258;
        return new class322(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZZ)V")
    public final void method2922(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (~this.field7376 != ~arg0 || !this.field7316 == this.field7359) {
            class612 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field7359 ? 3 : 0;
            if (arg0 < 0) {
                this.method2954((byte) -67);
            } else {
                var5 = this.field7312.method3119(arg0, false);
                class377 var10 = super.field1459.method2359(-126, arg0);
                if (~var10.field5220 == -1 && var10.field5224 == 0) {
                    this.method2954((byte) 97);
                } else {
                    int var11 = var10.field5222 ? 64 : 128;
                    int var12 = var11 * 50;
                    class14 var13 = this.method2946((byte) -124);
                    var13.method175((float) (this.field7370 % var12 * var10.field5220) / (float) var12, (byte) 90, 0.0F, (float) (this.field7370 % var12 * var10.field5224) / (float) var12);
                    this.method2949(class303.field4244, (byte) -26);
                }
                var6 = var10.field5236;
                if (!this.field7359) {
                    var8 = var10.field5228;
                    var9 = var10.field5217;
                    var7 = var10.field5229;
                }
            }
            this.method2915(var9, arg3, arg1 ^ -28364, var8, var7, arg2);
            if (this.field7308 == null) {
                this.method2924(13528, var5);
                this.method2956((byte) 47, var6);
            } else {
                this.field7308.method384(var5, arg1 + 27382, var6);
            }
            this.field7316 = this.field7359;
            this.field7376 = arg0;
        }
        ++field7162;
        if (arg1 == -27382) {
            this.field7338 &= -8;
        }
    }

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "(I)Lhba;")
    public final class639 method2923(int arg0) {
        ++field7210;
        int var2 = -98 / ((arg0 - 62) / 43);
        return this.field7352 != null ? this.field7352.method2767(0) : null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILaj;)V")
    public final void method2924(int arg0, class402 arg1) {
        if (arg0 == 13528) {
            ++field7251;
            if (this.field7344[this.field7328] != arg1) {
                this.field7344[this.field7328] = arg1;
                if (arg1 != null) {
                    arg1.method405(-29399);
                } else {
                    this.method110((byte) -77);
                }
                this.field7338 &= -2;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "(I)Lds;")
    public final class14 method2925(int arg0) {
        ++field7256;
        if (arg0 != 0) {
            this.method769((int[]) null);
        }
        return this.field7273;
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "()Z")
    public final boolean method766() {
        ++field7137;
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(Z)V")
    private final void method2926(boolean arg0) {
        if (!this.field7365) {
            float[] var2 = this.field7368;
            if (~this.field7098 != -1 && this.field7165 != 0) {
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[14] = 0.5F;
                var2[15] = 1.0F;
                var2[0] = 2.0F / (float) this.field7098;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = -2.0F / (float) this.field7165;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 1.0F;
                var2[12] = -1.0F;
                var2[10] = 0.5F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
            } else {
                var2[11] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
            }
            this.field7365 = true;
        }
        ++field7177;
        if (arg0) {
            this.method785();
        }
    }

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "(B)V")
    private final void method2927(byte arg0) {
        if (class480.field6869 == this.field7374) {
            float var2 = this.method84(125);
            this.field7273.method182(var2, var2, (byte) 90, 0.0F);
        }
        ++field7099;
        this.field7299 = false;
        if (arg0 != 40) {
            this.method89((byte) 18, (Canvas) null, (Object) null);
        }
        this.method148(11685);
        if (this.field7308 != null) {
            this.field7308.method382(arg0 + -140);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method800(Canvas arg0) {
        ++field7128;
        if (this.field7221 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7191.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method104(-28, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field7191.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method81(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIZI[I)Ldca;")
    public final class612 method2928(boolean arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg0) {
            this.field7329 = 77;
        }
        ++field7173;
        return this.method134(arg1, arg3, 0, 0, arg2, (byte) -113, arg4);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lds;B)V")
    public final void method2929(class14 arg0, byte arg1) {
        ++field7201;
        this.field7273.method163(arg0);
        if (arg1 == -125) {
            this.field7265 = false;
            this.method2927((byte) 40);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IZ)V")
    public final void method2930(int arg0, boolean arg1) {
        ++field7205;
        if (!this.field7371 != !arg1) {
            this.field7371 = arg1;
            this.method149(-107);
            this.field7338 &= -32;
        }
        if (arg0 != 2) {
            this.method2897((byte) -41);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method752(int arg0) {
        ++field7225;
        if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field7312 != null) {
                this.field7312.method3123(true);
            }
            this.field7286 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(IZ)V")
    public final void method2931(int arg0, boolean arg1) {
        if (arg1 == !this.field7282) {
            this.field7282 = arg1;
            this.method90(arg0 ^ 8284);
            this.field7338 &= -32;
        }
        ++field7247;
        if (arg0 != -8193) {
            this.method746();
        }
    }

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "(I)V")
    public abstract void method129(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)Lwf;")
    public abstract class483 method119(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljb;Lqda;IIB)Ldca;")
    public abstract class612 method103(class666 arg0, class689 arg1, int arg2, int arg3, byte arg4);

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "()Z")
    public final boolean method785() {
        ++field7155;
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "()Lq;")
    public final class152 method812() {
        ++field7116;
        return new class14();
    }

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "(I)V")
    public abstract void method99(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILgca;B)V")
    private final void method2932(int arg0, class627 arg1, byte arg2) {
        int var4 = 109 / ((-84 - arg2) / 34);
        ++field7222;
        this.method131(3438, this.field7383, 0);
        this.method98((byte) -117, this.field7382);
        this.method74((byte) 81, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method104(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method808(Canvas arg0) {
        ++field7178;
        Object var2 = null;
        if (arg0 != null && this.field7221 != arg0) {
            if (this.field7191.containsKey(arg0)) {
                var2 = this.field7191.get(arg0);
            }
        } else {
            var2 = this.field7151;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method109(arg0, var2, false);
            if (this.field7136 == arg0) {
                this.method2965(6);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "(I)V")
    public final void method2933(int arg0) {
        this.method2970((byte) -128);
        if (arg0 < 10) {
            this.method2939(false, (byte) 16);
        }
        ++field7216;
        this.method2920(118);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFZF)Z")
    private final boolean method2934(float arg0, float arg1, float arg2, float arg3, float arg4, boolean arg5, float arg6) {
        ++field7091;
        Buffer var8 = this.field7395.method532(arg5, (byte) 56);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2912(117, var8);
            if (Stream.method2042()) {
                var9.method2037(arg0);
                var9.method2037(arg6);
                var9.method2037(arg3);
                var9.method2037(arg4);
                var9.method2037(arg1);
                var9.method2037(arg2);
            } else {
                var9.method2035(arg0);
                var9.method2035(arg6);
                var9.method2035(arg3);
                var9.method2035(arg4);
                var9.method2035(arg1);
                var9.method2035(arg2);
            }
            var9.method2034();
            return this.field7395.method530(-14770);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(FZ)V")
    public final void method2935(float arg0, boolean arg1) {
        if (this.field7297 != arg0) {
            this.field7297 = arg0;
            this.method2913((byte) 125);
        }
        ++field7238;
        if (arg1) {
            this.method92(-74);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class257 method749(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7261;
        class322 var6 = new class322(this, arg2, arg3, arg4);
        var6.method500(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Le;)V")
    public final void method822(class698 arg0) {
        ++field7212;
        this.field7252 = ((class498) arg0).field7409;
        this.field7118 = this.field7252.method2026(32768, false);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)V")
    public final void method2936(int arg0, int arg1) {
        if (this.field7375 != arg0) {
            this.field7375 = arg0;
            this.method70((byte) 81);
        }
        if (arg1 < -121) {
            ++field7100;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILct;I)V")
    public final void method2937(int arg0, class479 arg1, int arg2) {
        ++field7248;
        if (arg0 != 8) {
            this.method2965(103);
        }
        this.method73(false, arg2, arg1, false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7245;
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
        if (this.method2934((float) arg0, (float) arg3 + var8, 0.0F, 0.0F, (float) arg2 + var9, true, (float) arg1)) {
            this.method2909(1);
            this.method2936(arg4, -127);
            this.method2914(62, 0, class450.field6484);
            this.method2937(8, class450.field6484, 0);
            this.method2938(arg5, (byte) 86);
            this.method2962((byte) -85);
            this.method122(true, false);
            this.method2950((byte) -71);
            this.method122(true, true);
            this.method2937(8, class171.field2763, 0);
            this.method2914(123, 0, class171.field2763);
        }
    }

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "(B)V")
    public abstract void method146(byte arg0);

    @OriginalMember(owner = "client!nh", name = "ra", descriptor = "(F)V")
    public final void method794(float arg0) {
        if (this.field7301 != arg0) {
            this.field7301 = arg0;
            this.field7121.setAmbient(arg0);
            this.method124(-7771);
            this.method72(-4);
        }
        ++field7182;
    }

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "(I)F")
    public abstract float method84(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
    public final void method2938(int arg0, byte arg1) {
        int var3 = 118 % ((arg1 - 11) / 39);
        if (~this.field7346 != ~arg0) {
            boolean var4;
            class335 var5;
            boolean var6;
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 128) {
                        var4 = false;
                        var5 = class693.field9849;
                        var6 = false;
                    } else {
                        var5 = class703.field9949;
                        var4 = true;
                        var6 = true;
                    }
                } else {
                    var5 = class450.field6493;
                    var6 = true;
                    var4 = false;
                }
            } else {
                var6 = true;
                var4 = true;
                var5 = class22.field302;
            }
            if (this.field7295 == !var4) {
                this.field7295 = var4;
                this.method117((byte) -114);
            }
            if (!var6 != !this.field7341) {
                this.field7341 = var6;
                this.method114(false);
            }
            if (this.field7309 != var5) {
                this.field7309 = var5;
                this.method78((byte) 40);
            }
            this.field7338 &= -29;
            this.field7346 = arg0;
        }
        ++field7217;
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
    public final void method807(int arg0) {
        ++field7159;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(IIIII)V")
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7135;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "()Z")
    public final boolean method757() {
        ++field7156;
        return false;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(ZB)V")
    public final void method2939(boolean arg0, byte arg1) {
        if (this.field7345 != arg0) {
            this.field7345 = arg0;
            this.method69((byte) -124);
            this.field7338 &= -8;
        }
        ++field7232;
        if (arg1 != -121) {
            this.field7374 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIF)Lam;")
    public final class289 method784(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7236;
        return new class640(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        ++field7190;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "()Z")
    public final boolean method767() {
        ++field7133;
        return this.field7353[3].method379(-4931);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()I")
    public final int method775() {
        ++field7244;
        return this.field7270 + this.field7269 + this.field7272;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(Z)V")
    private final void method2940(boolean arg0) {
        this.field7395 = this.method119(arg0, 0);
        ++field7089;
        this.field7395.method535(14036, 24, 12);
        this.field7386 = this.method141(new class148[] { new class148(class324.field4509) }, !arg0);
    }

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "()Z")
    public final boolean method778() {
        ++field7141;
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "BA", descriptor = "()I")
    public final int method820() {
        ++field7230;
        return this.field7321;
    }

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "(I)V")
    private final void method2941(int arg0) {
        this.method124(-7771);
        ++field7223;
        this.method146((byte) 20);
        this.method69((byte) -124);
        this.method86(0);
        if (arg0 > 24) {
            this.method129(-82);
            this.method72(-4);
            this.method139(13);
            this.method140((byte) -28);
            this.method90(-94);
            this.method149(-123);
            this.method76(0);
            this.method114(false);
            this.method78((byte) 106);
            this.method117((byte) 44);
            for (int var2 = this.field7348 - 1; var2 >= 0; --var2) {
                this.method2953(var2, 105);
                this.method75(0);
                this.method126(true);
                this.method2954((byte) 120);
            }
            this.method70((byte) -116);
            this.method123((byte) 107);
            this.method150((byte) 120);
            this.method148(11685);
            this.method92(25551);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([IIIII)Lf;")
    public final class257 method806(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7106;
        return new class322(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "(I)V")
    public final void method2942(int arg0) {
        if (this.field7338 != 8) {
            this.method2905(104);
            this.method2930(2, true);
            this.method2900(-113, true);
            this.method2931(-8193, true);
            this.method2938(1, (byte) 58);
            this.field7338 = 8;
        }
        int var2 = 75 % ((42 - arg0) / 44);
        ++field7202;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILwf;I)V")
    public abstract void method131(int arg0, class483 arg1, int arg2);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lll;[Lfda;Z)Lla;")
    public final class395 method804(class490 arg0, class628[] arg1, boolean arg2) {
        ++field7113;
        return new class268(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "()Z")
    public final boolean method816() {
        ++field7185;
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "()Z")
    public final boolean method742() {
        ++field7105;
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "pa", descriptor = "(III)V")
    public final void method763(int arg0, int arg1, int arg2) {
        if (~this.field7332 != ~arg0 || this.field7317 != arg1 || this.field7300 != arg2) {
            this.field7300 = arg2;
            this.field7332 = arg0;
            this.field7317 = arg1;
            this.method2952((byte) -109);
            this.method149(-116);
        }
        ++field7124;
    }

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "(B)Lds;")
    public final class14 method2943(byte arg0) {
        ++field7090;
        if (arg0 != -50) {
            this.field7310 = null;
        }
        return this.field7277;
    }

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "(I)V")
    public abstract void method72(int arg0);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(ZI)V")
    public final void method2944(boolean arg0, int arg1) {
        ++field7096;
        if (arg1 != -21729) {
            this.field7351 = false;
        }
        if (!this.field7351 == arg0) {
            this.field7351 = arg0;
            this.method139(13);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method2945(byte arg0, int arg1, boolean arg2) {
        ++field7176;
        return arg0 > -101 ? null : this.field7252.method2026(arg1, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZ)Leu;")
    public abstract class175 method115(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public final void method793(boolean arg0) {
        ++field7203;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
    public final void method774(int arg0) {
        ++field7184;
    }

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "(B)Lds;")
    public final class14 method2946(byte arg0) {
        ++field7170;
        return arg0 != -124 ? null : this.field7326[this.field7328];
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lqg;I)V")
    public final void method799(class272 arg0, int arg1) {
        this.field7372.method2597(arg1, (byte) 126, this, arg0);
        ++field7160;
    }

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "(I)V")
    public abstract void method124(int arg0);

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "(B)V")
    public abstract void method140(byte arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method758(Canvas arg0) {
        this.field7151 = null;
        ++field7122;
        this.field7136 = null;
        if (arg0 != null && this.field7221 != arg0) {
            if (this.field7191.containsKey(arg0)) {
                this.field7151 = this.field7191.get(arg0);
                this.field7136 = arg0;
            }
        } else {
            this.field7151 = this.field7095;
            this.field7136 = this.field7221;
        }
        if (this.field7136 != null && this.field7151 != null) {
            this.method81(-69, this.field7151, this.field7136);
            this.method2965(6);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "()Z")
    public final boolean method786() {
        ++field7167;
        return false;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)V")
    public abstract void method151(int arg0, int arg1);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
    public abstract void method109(Canvas arg0, Object arg1, boolean arg2);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class682 method768(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7117;
        return new class194(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "()Lq;")
    public final class152 method740() {
        ++field7145;
        return this.field7274;
    }

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "()I")
    public final int method802() {
        ++field7249;
        return this.field7367 + -2;
    }

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "(I)V")
    private final void method2947(int arg0) {
        this.field7313 = false;
        if (arg0 <= 51) {
            this.method2900(-122, false);
        }
        ++field7193;
        this.method2906((byte) -49);
        if (class242.field3548 == this.field7374) {
            this.method2920(126);
        }
    }

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "()Z")
    public final boolean method801() {
        ++field7215;
        return this.field7320;
    }

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "(I)V")
    public final void method2948(int arg0) {
        ++field7218;
        if (this.field7338 != 2) {
            this.method2958(true);
            this.method2930(2, false);
            this.method2939(false, (byte) -121);
            this.method2900(-124, false);
            this.method2931(-8193, false);
            this.method2922(-2, -27382, false, false);
            this.field7338 = 2;
        }
        if (arg0 != 0) {
            this.method2939(false, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljb;Lqda;I)Z")
    public abstract boolean method106(class666 arg0, class689 arg1, int arg2);

    @OriginalMember(owner = "client!nh", name = "VA", descriptor = "(IFFFFF)V")
    public final void method756(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7209;
        boolean var7 = this.field7354 != arg0;
        if (var7 || this.field7363 != arg1 || this.field7294 != arg2) {
            this.field7294 = arg2;
            this.field7363 = arg1;
            this.field7354 = arg0;
            if (var7) {
                this.field7319 = (float) (this.field7354 & 255) / 255.0F;
                this.field7334 = (float) (this.field7354 & 65280) / 65280.0F;
                this.field7305 = (float) (this.field7354 & 16711680) / 1.671168E7F;
                this.method124(-7771);
            }
            this.field7121.setSunColour(this.field7305, this.field7334, this.field7319, arg1, arg2);
            this.method146((byte) 20);
        }
        if (this.field7362[0] != arg3 || this.field7362[1] != arg4 || this.field7362[2] != arg5) {
            this.field7362[2] = arg5;
            this.field7362[0] = arg3;
            this.field7362[1] = arg4;
            this.field7355[2] = -arg5;
            this.field7355[0] = -arg3;
            this.field7355[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7360[2] = arg5 * var8;
            this.field7360[0] = arg3 * var8;
            this.field7360[1] = arg4 * var8;
            this.field7310[2] = -this.field7360[2];
            this.field7310[1] = -this.field7360[1];
            this.field7310[0] = -this.field7360[0];
            this.field7121.setSunDirection(this.field7360[0], this.field7360[1], this.field7360[2]);
            this.method129(-98);
            this.field7333 = (int) (arg5 * 256.0F / arg4);
            this.field7314 = (int) (arg3 * 256.0F / arg4);
        }
        this.method72(-4);
    }

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "()Z")
    public final boolean method814() {
        ++field7200;
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "(B)V")
    public abstract void method69(byte arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([Lls;Z)Ldt;")
    public abstract class573 method141(class148[] arg0, boolean arg1);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ltw;B)V")
    public final void method2949(class233 arg0, byte arg1) {
        this.field7303[this.field7328] = arg0;
        int var3 = 50 / ((-63 - arg1) / 34);
        ++field7171;
        this.method2918((byte) 111);
    }

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "(B)V")
    private final void method2950(byte arg0) {
        this.method131(3438, this.field7395, 0);
        ++field7152;
        int var2 = -35 / ((arg0 - 34) / 35);
        this.method98((byte) -100, this.field7386);
        this.method74((byte) 81, 1, 0, class77.field1192);
    }

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "(B)V")
    public abstract void method78(byte arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljb;ZBII[F)Ldca;")
    public final class612 method2951(class666 arg0, boolean arg1, byte arg2, int arg3, int arg4, float[] arg5) {
        if (arg2 != 50) {
            this.method778();
        }
        ++field7129;
        return this.method130(0, arg1, (byte) 36, arg4, arg0, arg3, arg5, 0);
    }

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "(IIII)V")
    public final void method818(int arg0, int arg1, int arg2, int arg3) {
        ++field7149;
        boolean var5 = false;
        if (~this.field7330 > ~arg0) {
            var5 = true;
            this.field7330 = arg0;
        }
        if (~this.field7291 < ~arg2) {
            var5 = true;
            this.field7291 = arg2;
        }
        if (~this.field7377 > ~arg1) {
            this.field7377 = arg1;
            var5 = true;
        }
        if (~this.field7318 < ~arg3) {
            this.field7318 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field7401) {
                this.field7401 = true;
                this.method101((byte) 17);
            }
            this.method120((byte) -119);
            this.method2899(-118);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIIIII)V")
    public final void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7181;
        float var7 = this.method84(118);
        this.method2909(1);
        this.method2936(arg4, -126);
        this.method2914(114, 0, class450.field6484);
        this.method2937(8, class450.field6484, 0);
        this.method2938(arg5, (byte) 103);
        this.field7273.method190(-110, 1.0F, (float) (arg2 + -1), (float) (arg3 - 1));
        this.field7273.method182((float) arg0 + -var7, (float) arg1 - var7, (byte) 107, 0.0F);
        this.method2973(true);
        this.method122(true, false);
        this.method2932(4, class140.field2348, (byte) 90);
        this.method122(true, true);
        this.method2937(8, class171.field2763, 0);
        this.method2914(102, 0, class171.field2763);
    }

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "()V")
    public final void method776() {
        if (this.field7312 != null) {
            this.field7312.method3123(true);
        }
        ++field7204;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLct;IZI)V")
    public abstract void method143(boolean arg0, class479 arg1, int arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZZ)V")
    public abstract void method122(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "(B)V")
    private final void method2952(byte arg0) {
        if (arg0 >= -91) {
            this.method2915(94, true, -13, 113, 73, false);
        }
        if (this.field7308 != null) {
            this.field7308.method380((byte) 65);
        }
        ++field7263;
        this.method76(0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z[[IIB)Lhba;")
    public abstract class639 method94(boolean arg0, int[][] arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "(B)V")
    public abstract void method117(byte arg0);

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(II)V")
    public final void method2953(int arg0, int arg1) {
        if (arg1 <= 101) {
            this.field7320 = true;
        }
        ++field7109;
        if (this.field7328 != arg0) {
            this.field7328 = arg0;
            this.method145(true);
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(Z)V")
    public abstract void method126(boolean arg0);

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "(I)V")
    public abstract void method139(int arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIII)V")
    public final void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7211;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[BZIILjb;I)Ldca;")
    public abstract class612 method107(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5, class666 arg6, int arg7);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()Z")
    public final boolean method739() {
        ++field7142;
        return false;
    }

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "(B)V")
    public final void method2954(byte arg0) {
        ++field7140;
        int var2 = -62 / ((arg0 - 6) / 62);
        if (this.field7303[this.field7328] != class172.field2780) {
            this.field7303[this.field7328] = class172.field2780;
            this.field7326[this.field7328].method167();
            this.method2918((byte) 89);
        }
    }

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "(B)V")
    public abstract void method101(byte arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZBILjb;I[FI)Ldca;")
    public abstract class612 method130(int arg0, boolean arg1, byte arg2, int arg3, class666 arg4, int arg5, float[] arg6, int arg7);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLdt;)V")
    public abstract void method98(byte arg0, class573 arg1);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[F)[F")
    public final float[] method2955(int arg0, float[] arg1) {
        ++field7229;
        arg1[0] = this.field7306[0];
        arg1[12] = this.field7306[3];
        arg1[8] = this.field7306[2];
        arg1[4] = this.field7306[1];
        arg1[2] = this.field7306[8];
        arg1[1] = this.field7306[4];
        if (arg0 != 10264) {
            this.field7324 = -57;
        }
        arg1[5] = this.field7306[5];
        arg1[13] = this.field7306[7];
        arg1[9] = this.field7306[6];
        arg1[10] = this.field7306[10];
        arg1[7] = this.field7306[13];
        arg1[3] = this.field7306[12];
        arg1[14] = this.field7306[11];
        arg1[6] = this.field7306[9];
        arg1[15] = this.field7306[15];
        arg1[11] = this.field7306[14];
        return arg1;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Lvo;II)V")
    public class495(Canvas arg0, Object arg1, class615 arg2, class345 arg3, int arg4, int arg5) {
        super(arg2);
        this.field7289 = arg4;
        this.field7136 = this.field7221 = arg0;
        this.field7151 = this.field7095 = arg1;
        this.field7257 = arg3;
        Dimension var7 = arg0.getSize();
        this.field7165 = this.field7101 = var7.height;
        this.field7098 = this.field7110 = var7.width;
        this.field7304 = arg5;
        class12.method62(true, false, (byte) -106);
        if (super.field1459 == null) {
            this.field7121 = new NativeInterface(0, this.field7304);
            this.field7312 = null;
        } else {
            this.field7312 = new class530(this, super.field1459);
            this.field7121 = new NativeInterface(super.field1459.method2364(-6274), this.field7304);
            for (int var8 = 0; var8 < super.field1459.method2364(-6274); ++var8) {
                class377 var9 = super.field1459.method2359(-122, var8);
                if (var9 != null) {
                    this.field7121.initTextureMetrics(var8, var9.field5227, var9.field5233);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "(B)V")
    public abstract void method70(byte arg0);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(BI)V")
    public final void method2956(byte arg0, int arg1) {
        ++field7150;
        if (~arg1 == -2) {
            this.method2959(class345.field4866, class345.field4866, (byte) -127);
        } else if (arg1 == 0) {
            this.method2959(class55.field715, class55.field715, (byte) 113);
        } else if (~arg1 != -3) {
            if (~arg1 != -4) {
                if (arg1 == 4) {
                    this.method2959(class511.field7601, class511.field7601, (byte) 64);
                }
            } else {
                this.method2959(class673.field9556, class55.field715, (byte) 26);
            }
        } else {
            this.method2959(class166.field2734, class345.field4866, (byte) 99);
        }
        if (arg0 != 47) {
            this.method767();
        }
    }

    @OriginalMember(owner = "client!nh", name = "AA", descriptor = "(III[I)V")
    public final void method810(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7234;
        float var5 = this.field7274.method160((float) arg2, 0, (float) arg1, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field7298;
            var7 = this.field7329;
        } else {
            var6 = (int) ((float) this.field7340 * this.field7274.method188(1, (float) arg0, (float) arg2, (float) arg1) / var5);
            var7 = (int) ((float) this.field7311 * this.field7274.method174(false, (float) arg1, (float) arg0, (float) arg2) / var5);
        }
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 - this.field7279);
        arg3[0] = (int) ((float) var6 + -this.field7284);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIZB[I)Ldca;")
    public abstract class612 method134(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int[] arg6);

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "(IIIIII)V")
    public final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2909(1);
        ++field7158;
        this.method2936(arg4, -125);
        this.method2914(113, 0, class450.field6484);
        this.method2937(8, class450.field6484, 0);
        this.method2938(arg5, (byte) 98);
        this.field7273.method190(-62, 1.0F, (float) arg2, (float) arg3);
        this.field7273.method158(arg0, arg1, 0);
        this.method2973(true);
        this.method122(true, false);
        this.method2964((byte) 71);
        this.method122(true, true);
        this.method2937(8, class171.field2763, 0);
        this.method2914(57, 0, class171.field2763);
    }

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "(I)Lds;")
    public final class14 method2957(int arg0) {
        if (arg0 != -11263) {
            return null;
        } else {
            ++field7206;
            return this.field7326[this.field7328];
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIILgca;)V")
    public abstract void method74(byte arg0, int arg1, int arg2, class627 arg3);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method89(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "(I)V")
    public abstract void method148(int arg0);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(Z)V")
    private final void method2958(boolean arg0) {
        if (!arg0) {
            this.field7257 = null;
        }
        ++field7266;
        if (class480.field6869 != this.field7374) {
            class90 var2 = this.field7374;
            this.field7374 = class480.field6869;
            if (var2.method672(true)) {
                this.method2910(19022);
            }
            this.method2926(false);
            this.field7306 = this.field7368;
            this.method2920(101);
            this.field7338 &= -25;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lel;Lel;B)V")
    public final void method2959(class3 arg0, class3 arg1, byte arg2) {
        ++field7157;
        boolean var4 = false;
        if (this.field7343[this.field7328] != arg0) {
            this.field7343[this.field7328] = arg0;
            this.method75(0);
            var4 = true;
        }
        if (this.field7285[this.field7328] != arg1) {
            this.field7285[this.field7328] = arg1;
            var4 = true;
            this.method126(true);
        }
        int var5 = 25 / ((arg2 - -38) / 56);
        if (var4) {
            this.field7338 &= -30;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(ZI)V")
    public final void method2960(boolean arg0, int arg1) {
        if (arg1 >= -35) {
            this.field7383 = null;
        }
        ++field7235;
        if (arg0 == !this.field7325) {
            this.field7325 = arg0;
            this.method149(-103);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lpa;)V")
    public final void method744(class587 arg0) {
        ++field7144;
        this.field7352 = (class468) arg0;
    }

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "(I)Lds;")
    public final class14 method2961(int arg0) {
        if (arg0 != 16680) {
            return null;
        } else {
            ++field7267;
            return this.field7276;
        }
    }

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "(B)V")
    public final void method2962(byte arg0) {
        this.field7273.method167();
        ++field7227;
        this.field7265 = true;
        int var2 = -112 % ((arg0 - 9) / 60);
        this.method2927((byte) 40);
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "(B)V")
    public final void method2963(byte arg0) {
        ++field7197;
        Enumeration var2 = this.field7191.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method89((byte) -109, var3, this.field7191.get(var3));
        }
        this.field7383.method231((byte) -105);
        this.field7395.method231((byte) -105);
        this.field7390.method549((byte) 17);
        this.field7396.method549((byte) 17);
        this.field7393.method549((byte) 17);
        this.field7391.method549((byte) 17);
        this.field7392.method549((byte) 17);
        this.field7372.method2593(-40);
        this.field7381.method231((byte) -105);
        if (arg0 > -24) {
            this.method143(true, (class479) null, 101, true, -76);
        }
    }

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "()V")
    public final void method821() {
        this.field7359 = false;
        ++field7094;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lq;)V")
    public final void method755(class152 arg0) {
        ++field7231;
        this.field7274 = (class14) arg0;
        this.field7276.method163(this.field7274);
        this.field7276.method173(true);
        this.field7277.method184(this.field7276, 7);
        this.field7275.method184(this.field7274, 7);
        if (this.field7374.method672(true)) {
            this.method2910(19022);
        }
    }

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "()[I")
    public final int[] method826() {
        ++field7132;
        return new int[] { this.field7298, this.field7329, this.field7340, this.field7311 };
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(IIIIII)Lpa;")
    public final class587 method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7255;
        return new class545(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "(B)V")
    public final void method2964(byte arg0) {
        ++field7179;
        if (arg0 != 71) {
            this.method72(-87);
        }
        this.method2932(2, class486.field6928, (byte) -125);
    }

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "(I)V")
    private final void method2965(int arg0) {
        ++field7139;
        if (this.field7136 != null) {
            Dimension var2 = this.field7136.getSize();
            this.field7110 = var2.width;
            this.field7101 = var2.height;
        } else {
            this.field7110 = this.field7101 = 1;
        }
        this.field7098 = this.field7110;
        this.field7165 = this.field7101;
        this.method2911((byte) 91);
        this.method2947(arg0 ^ 113);
        this.method2913((byte) 120);
        this.method123((byte) 116);
        this.method2899(-123);
        if (arg0 != 6) {
            this.method2898((byte) 88);
        }
        this.method2970((byte) -128);
        this.method805();
    }

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "(B)V")
    public abstract void method123(byte arg0);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
    public void method147(int arg0) {
        if (this.field7312 != null) {
            this.field7312.method3122(120);
        }
        ++field7243;
        this.field7370 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!nh", name = "da", descriptor = "(IIII)V")
    public final void method771(int arg0, int arg1, int arg2, int arg3) {
        ++field7104;
        if (~arg0 >= -1 && ~arg2 <= ~(this.field7098 + -1) && arg1 <= 0 && ~arg3 <= ~(this.field7165 + -1)) {
            this.method805();
        } else {
            this.field7377 = arg1 < 0 ? 0 : arg1;
            this.field7291 = ~arg2 >= ~this.field7098 ? arg2 : 0;
            this.field7318 = arg3 > this.field7098 ? 0 : arg3;
            this.field7330 = ~arg0 <= -1 ? arg0 : 0;
            if (!this.field7401) {
                this.field7401 = true;
                this.method101((byte) 17);
            }
            this.method120((byte) -106);
            this.method2899(-125);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method803(Canvas arg0) {
        ++field7192;
        if (this.field7221 == arg0) {
            throw new RuntimeException();
        } else if (this.field7191.containsKey(arg0)) {
            this.method89((byte) -54, arg0, this.field7191.get(arg0));
            this.field7191.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "()I")
    public final int method796() {
        ++field7125;
        return this.field7400;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method751(int arg0) {
        ++field7103;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)Le;")
    public final class698 method783(int arg0) {
        ++field7172;
        class498 var2 = new class498(arg0);
        this.field7188.method3904(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(II)Leu;")
    public final class175 method2966(int arg0, int arg1) {
        ++field7123;
        if (arg0 != 0) {
            this.method130(103, true, (byte) -34, -12, (class666) null, -81, (float[]) null, -4);
        }
        if (~this.field7381.method240(18471) > ~(arg1 * 2)) {
            this.field7381.method238(-22454, arg1);
        }
        return this.field7381;
    }

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "(I)V")
    public void method86(int arg0) {
        this.field7378 = this.field7339;
        ++field7093;
        this.field7339 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "(I)V")
    private final void method2967(int arg0) {
        ++field7259;
        if (arg0 == 31830) {
            this.field7296 = (float) this.field7283;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[Lam;)V")
    public final void method823(int arg0, class289[] arg1) {
        ++field7161;
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field7356[var3] = arg1[var3];
        }
        this.field7339 = arg0;
        if (this.field7374.method672(true)) {
            this.method86(0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(Z)I")
    public final int method2968(boolean arg0) {
        ++field7097;
        return arg0 ? -37 : this.field7366;
    }

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "(I)Lds;")
    public final class14 method2969(int arg0) {
        if (!this.field7299) {
            this.field7278.method177(this.field7276, this.field7273);
            this.field7299 = true;
        }
        ++field7126;
        if (arg0 != 15475) {
            this.field7390 = null;
        }
        return this.field7278;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7198;
    }

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "(I)V")
    public abstract void method75(int arg0);

    @OriginalMember(owner = "client!nh", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7186;
    }

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "(B)V")
    public final void method2970(byte arg0) {
        if (class196.field3068 != this.field7374) {
            class90 var2 = this.field7374;
            this.field7374 = class196.field3068;
            if (var2.method672(true)) {
                this.method2910(19022);
            }
            this.field7338 &= -32;
            this.field7306 = this.field7357;
        }
        if (arg0 == -128) {
            ++field7111;
        }
    }

    @OriginalMember(owner = "client!nh", name = "YA", descriptor = "(IIII)V")
    public final void method809(int arg0, int arg1, int arg2, int arg3) {
        ++field7228;
        if (!this.field7359) {
            throw new RuntimeException("");
        } else {
            this.field7280 = arg3;
            this.field7366 = arg2;
            this.field7350 = arg0;
            this.field7288 = arg1;
            if (this.field7316) {
                this.field7353[3].method1037(-13501);
                this.field7353[3].method380((byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(II)Lcf;")
    public class135 method79(int arg0, int arg1) {
        ++field7134;
        if (arg0 != 5076) {
            return null;
        } else if (arg1 != 6) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    return arg1 == 7 ? new class347(this) : new class541(this);
                } else {
                    return new class255(this, this.field7112);
                }
            } else {
                return new class667(this);
            }
        } else {
            return new class421(this);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)I")
    public final int method754(int arg0, int arg1) {
        ++field7242;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!nh", name = "GA", descriptor = "(II)V")
    public final void method765(int arg0, int arg1) {
        ++field7253;
        if (this.field7321 != arg0 || ~this.field7283 != ~arg1) {
            this.field7283 = arg1;
            this.field7321 = arg0;
            this.method2947(80);
            this.method2913((byte) 121);
            this.method2952((byte) -126);
        }
    }

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "(I)V")
    private final void method2971(int arg0) {
        ++field7175;
        if (!this.field7342) {
            float[] var2 = this.field7287;
            float var3 = (float) this.field7321;
            float var4 = (float) this.field7283;
            float var5 = (float) (-this.field7329) * this.field7297 / (float) this.field7311;
            float var6 = (float) (-this.field7298) * this.field7297 / (float) this.field7340;
            float var7 = (float) (-this.field7298 + this.field7098) * this.field7297 / (float) this.field7340;
            float var8 = (float) (-this.field7329 + this.field7165) * this.field7297 / (float) this.field7311;
            if (var6 != var7 && var5 != var8) {
                var2[8] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[9] = 0.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[14] = var3 / (var3 - var4);
                var2[6] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
            } else {
                var2[5] = 1.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
            }
            this.method2967(31830);
            this.field7342 = true;
        }
        if (arg0 != 0) {
            this.field7347 = false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "MA", descriptor = "(III[I)V")
    public final void method787(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7241;
        float var5 = this.field7274.method160((float) arg2, 0, (float) arg1, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field7329;
            var7 = this.field7298;
        } else {
            var7 = (int) ((float) this.field7340 * this.field7274.method188(1, (float) arg0, (float) arg2, (float) arg1) / var5);
            var6 = (int) ((float) this.field7311 * this.field7274.method174(false, (float) arg1, (float) arg0, (float) arg2) / var5);
        }
        arg3[1] = (int) ((float) var6 + -this.field7279);
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field7284);
    }

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "(B)V")
    public abstract void method120(byte arg0);

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "()Z")
    public final boolean method798() {
        ++field7187;
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "(I)V")
    public final void method2972(int arg0) {
        if (arg0 == 3644) {
            ++field7143;
            if (this.field7338 != 4) {
                this.method2958(true);
                this.method2930(2, false);
                this.method2939(false, (byte) -121);
                this.method2900(arg0 + -3752, false);
                this.method2931(arg0 + -11837, false);
                this.method2922(-2, arg0 + -31026, false, false);
                this.method2938(1, (byte) 62);
                this.method2956((byte) 47, 0);
                this.field7338 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "(Z)V")
    public abstract void method114(boolean arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjb;I[BZI)Lwca;")
    public abstract class36 method96(int arg0, class666 arg1, int arg2, byte[] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "(B)V")
    public abstract void method110(byte arg0);

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "(Z)V")
    public final void method2973(boolean arg0) {
        this.field7265 = false;
        if (!arg0) {
            this.method801();
        }
        ++field7154;
        this.method2927((byte) 40);
    }

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "(B)V")
    private final void method2974(byte arg0) {
        if (class400.field5793 != this.field7374) {
            class90 var2 = this.field7374;
            this.field7374 = class400.field5793;
            if (!var2.method672(true)) {
                this.method2910(19022);
            }
            this.method2971(0);
            this.field7306 = this.field7287;
            this.method2920(92);
            this.field7338 &= -8;
        }
        ++field7147;
        if (arg0 > -4) {
            this.field7339 = 88;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([I)V")
    public final void method769(int[] arg0) {
        arg0[1] = this.field7165;
        arg0[0] = this.field7098;
        ++field7195;
    }

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "()Lq;")
    public final class152 method777() {
        ++field7166;
        return this.field7389;
    }
}
