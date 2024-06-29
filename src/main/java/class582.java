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

@OriginalClass("client!re")
public abstract class class582 extends class167 {

    @OriginalMember(owner = "client!re", name = "ad", descriptor = "Lbv;")
    private class568 field8247 = new class568();

    @OriginalMember(owner = "client!re", name = "Qd", descriptor = "Z")
    public boolean field8289 = true;

    @OriginalMember(owner = "client!re", name = "Td", descriptor = "Luw;")
    public class186 field8292 = new class186();

    @OriginalMember(owner = "client!re", name = "Xd", descriptor = "Luw;")
    public class186 field8296 = new class186();

    @OriginalMember(owner = "client!re", name = "Yd", descriptor = "Luw;")
    public class186 field8297 = new class186();

    @OriginalMember(owner = "client!re", name = "Zd", descriptor = "Luw;")
    public class186 field8298 = new class186();

    @OriginalMember(owner = "client!re", name = "ae", descriptor = "Luw;")
    private class186 field8299 = new class186();

    @OriginalMember(owner = "client!re", name = "be", descriptor = "Luw;")
    private class186 field8300 = new class186();

    @OriginalMember(owner = "client!re", name = "de", descriptor = "I")
    public int field8302 = 0;

    @OriginalMember(owner = "client!re", name = "fe", descriptor = "F")
    private float field8304 = 3000.0F;

    @OriginalMember(owner = "client!re", name = "pe", descriptor = "[Lsf;")
    private class554[] field8314 = new class554[10];

    @OriginalMember(owner = "client!re", name = "ge", descriptor = "I")
    public int field8305 = -1;

    @OriginalMember(owner = "client!re", name = "oe", descriptor = "F")
    private float field8313 = 1.0F;

    @OriginalMember(owner = "client!re", name = "De", descriptor = "I")
    public int field8328 = 0;

    @OriginalMember(owner = "client!re", name = "re", descriptor = "I")
    private int field8316 = 0;

    @OriginalMember(owner = "client!re", name = "ze", descriptor = "I")
    public int field8324 = 0;

    @OriginalMember(owner = "client!re", name = "Te", descriptor = "I")
    public int field8344 = 0;

    @OriginalMember(owner = "client!re", name = "Fe", descriptor = "I")
    public int field8330 = 512;

    @OriginalMember(owner = "client!re", name = "we", descriptor = "I")
    private int field8321 = 1;

    @OriginalMember(owner = "client!re", name = "Ne", descriptor = "Z")
    private boolean field8338 = false;

    @OriginalMember(owner = "client!re", name = "ce", descriptor = "Ljn;")
    public class491 field8301 = class6.field55;

    @OriginalMember(owner = "client!re", name = "Pe", descriptor = "Z")
    private boolean field8340 = false;

    @OriginalMember(owner = "client!re", name = "me", descriptor = "F")
    public float field8311 = 3584.0F;

    @OriginalMember(owner = "client!re", name = "Be", descriptor = "I")
    private int field8326 = -1;

    @OriginalMember(owner = "client!re", name = "ke", descriptor = "I")
    private int field8309 = 0;

    @OriginalMember(owner = "client!re", name = "Se", descriptor = "F")
    public float field8343 = -1.0F;

    @OriginalMember(owner = "client!re", name = "ef", descriptor = "F")
    public float field8355 = 1.0F;

    @OriginalMember(owner = "client!re", name = "Ze", descriptor = "I")
    public int field8350 = 512;

    @OriginalMember(owner = "client!re", name = "hf", descriptor = "[F")
    private float[] field8358 = new float[16];

    @OriginalMember(owner = "client!re", name = "Ye", descriptor = "Z")
    public boolean field8349 = true;

    @OriginalMember(owner = "client!re", name = "Oe", descriptor = "Z")
    public boolean field8339 = false;

    @OriginalMember(owner = "client!re", name = "he", descriptor = "I")
    public int field8306 = -1;

    @OriginalMember(owner = "client!re", name = "Qe", descriptor = "I")
    private int field8341 = -1;

    @OriginalMember(owner = "client!re", name = "cf", descriptor = "I")
    public int field8353 = 0;

    @OriginalMember(owner = "client!re", name = "kf", descriptor = "I")
    private int field8360 = 0;

    @OriginalMember(owner = "client!re", name = "gf", descriptor = "I")
    public int field8357 = 3;

    @OriginalMember(owner = "client!re", name = "ye", descriptor = "I")
    public int field8323 = -1;

    @OriginalMember(owner = "client!re", name = "zf", descriptor = "Z")
    private boolean field8375 = false;

    @OriginalMember(owner = "client!re", name = "Ff", descriptor = "I")
    public int field8381 = 0;

    @OriginalMember(owner = "client!re", name = "pf", descriptor = "[F")
    private float[] field8365 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!re", name = "mf", descriptor = "Z")
    public boolean field8362 = true;

    @OriginalMember(owner = "client!re", name = "sf", descriptor = "[F")
    private float[] field8368 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!re", name = "of", descriptor = "[F")
    private float[] field8364 = new float[16];

    @OriginalMember(owner = "client!re", name = "nf", descriptor = "F")
    public float field8363 = 1.0F;

    @OriginalMember(owner = "client!re", name = "bf", descriptor = "F")
    public float field8352 = 1.0F;

    @OriginalMember(owner = "client!re", name = "qf", descriptor = "Z")
    public boolean field8366 = false;

    @OriginalMember(owner = "client!re", name = "Lf", descriptor = "I")
    public int field8387 = 0;

    @OriginalMember(owner = "client!re", name = "Ge", descriptor = "F")
    public float field8331 = 3584.0F;

    @OriginalMember(owner = "client!re", name = "xe", descriptor = "Z")
    private boolean field8322 = false;

    @OriginalMember(owner = "client!re", name = "Ke", descriptor = "Z")
    public boolean field8335 = true;

    @OriginalMember(owner = "client!re", name = "jf", descriptor = "Z")
    public boolean field8359 = true;

    @OriginalMember(owner = "client!re", name = "He", descriptor = "[F")
    public float[] field8332 = this.field8365;

    @OriginalMember(owner = "client!re", name = "vf", descriptor = "Z")
    private boolean field8371 = false;

    @OriginalMember(owner = "client!re", name = "ve", descriptor = "I")
    public int field8320 = 8;

    @OriginalMember(owner = "client!re", name = "Bf", descriptor = "[F")
    public float[] field8377 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!re", name = "Tf", descriptor = "Z")
    public boolean field8395 = false;

    @OriginalMember(owner = "client!re", name = "We", descriptor = "Ldm;")
    public class368 field8347 = class291.field3775;

    @OriginalMember(owner = "client!re", name = "lf", descriptor = "I")
    private int field8361 = 16777215;

    @OriginalMember(owner = "client!re", name = "Jf", descriptor = "F")
    public float field8385 = -1.0F;

    @OriginalMember(owner = "client!re", name = "Sf", descriptor = "I")
    public int field8394 = 128;

    @OriginalMember(owner = "client!re", name = "xf", descriptor = "I")
    public int field8373 = 0;

    @OriginalMember(owner = "client!re", name = "rf", descriptor = "Z")
    public boolean field8367 = true;

    @OriginalMember(owner = "client!re", name = "Nf", descriptor = "[F")
    private float[] field8389 = new float[16];

    @OriginalMember(owner = "client!re", name = "Xf", descriptor = "I")
    public int field8399 = 0;

    @OriginalMember(owner = "client!re", name = "Uf", descriptor = "[F")
    private float[] field8396 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!re", name = "yf", descriptor = "I")
    public int field8374 = 3584;

    @OriginalMember(owner = "client!re", name = "Rf", descriptor = "I")
    public int field8393 = 50;

    @OriginalMember(owner = "client!re", name = "Vf", descriptor = "Z")
    public boolean field8397 = false;

    @OriginalMember(owner = "client!re", name = "Pf", descriptor = "I")
    public int field8391 = 0;

    @OriginalMember(owner = "client!re", name = "ag", descriptor = "F")
    public float field8402 = 1.0F;

    @OriginalMember(owner = "client!re", name = "Yf", descriptor = "[F")
    public float[] field8400 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!re", name = "Of", descriptor = "I")
    private int field8390 = 0;

    @OriginalMember(owner = "client!re", name = "Je", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8334 = new Stream();

    @OriginalMember(owner = "client!re", name = "hg", descriptor = "Luw;")
    private class186 field8409 = new class186();

    @OriginalMember(owner = "client!re", name = "uf", descriptor = "I")
    public int field8370;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Ljava/lang/Object;")
    public Object field8128;

    @OriginalMember(owner = "client!re", name = "Ad", descriptor = "Ljava/lang/Object;")
    private Object field8273;

    @OriginalMember(owner = "client!re", name = "Ib", descriptor = "Lkr;")
    public class329 field8177;

    @OriginalMember(owner = "client!re", name = "xd", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8270;

    @OriginalMember(owner = "client!re", name = "Ld", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8284;

    @OriginalMember(owner = "client!re", name = "sb", descriptor = "I")
    private int field8161;

    @OriginalMember(owner = "client!re", name = "cd", descriptor = "I")
    public int field8249;

    @OriginalMember(owner = "client!re", name = "Af", descriptor = "I")
    public int field8376;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
    private int field8149;

    @OriginalMember(owner = "client!re", name = "yc", descriptor = "I")
    public int field8219;

    @OriginalMember(owner = "client!re", name = "Wf", descriptor = "Lag;")
    private class431 field8398;

    @OriginalMember(owner = "client!re", name = "Qc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field8237;

    @OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
    public static int field8155 = 0;

    @OriginalMember(owner = "client!re", name = "ee", descriptor = "F")
    private float field8303;

    @OriginalMember(owner = "client!re", name = "je", descriptor = "F")
    public float field8308;

    @OriginalMember(owner = "client!re", name = "Ce", descriptor = "F")
    private float field8327;

    @OriginalMember(owner = "client!re", name = "Le", descriptor = "F")
    private float field8336;

    @OriginalMember(owner = "client!re", name = "tf", descriptor = "F")
    public float field8369;

    @OriginalMember(owner = "client!re", name = "Ef", descriptor = "F")
    public float field8380;

    @OriginalMember(owner = "client!re", name = "If", descriptor = "F")
    public float field8384;

    @OriginalMember(owner = "client!re", name = "Mf", descriptor = "F")
    public float field8388;

    @OriginalMember(owner = "client!re", name = "Qf", descriptor = "F")
    public float field8392;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!re", name = "lb", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!re", name = "nb", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!re", name = "pb", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!re", name = "qb", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!re", name = "rb", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!re", name = "tb", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!re", name = "ub", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!re", name = "vb", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!re", name = "wb", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!re", name = "xb", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!re", name = "yb", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!re", name = "zb", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!re", name = "Ab", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!re", name = "Bb", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!re", name = "Cb", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!re", name = "Db", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!re", name = "Eb", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!re", name = "Fb", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!re", name = "Gb", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!re", name = "Hb", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!re", name = "Jb", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!re", name = "Kb", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!re", name = "Lb", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!re", name = "Mb", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!re", name = "Nb", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!re", name = "Ob", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!re", name = "Pb", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!re", name = "Qb", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!re", name = "Rb", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!re", name = "Sb", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!re", name = "Tb", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!re", name = "Ub", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!re", name = "Vb", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!re", name = "Wb", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!re", name = "Xb", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!re", name = "Yb", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!re", name = "Zb", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!re", name = "ac", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!re", name = "bc", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!re", name = "cc", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!re", name = "dc", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!re", name = "ec", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!re", name = "fc", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!re", name = "gc", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!re", name = "hc", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!re", name = "ic", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!re", name = "jc", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!re", name = "kc", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!re", name = "lc", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!re", name = "mc", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!re", name = "nc", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!re", name = "oc", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!re", name = "pc", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!re", name = "qc", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!re", name = "rc", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!re", name = "tc", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!re", name = "uc", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!re", name = "vc", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!re", name = "wc", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!re", name = "xc", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!re", name = "zc", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!re", name = "Ac", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!re", name = "Bc", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!re", name = "Cc", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!re", name = "Dc", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!re", name = "Ec", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!re", name = "Fc", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!re", name = "Gc", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!re", name = "Hc", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!re", name = "Ic", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!re", name = "Jc", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!re", name = "Kc", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!re", name = "Lc", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!re", name = "Mc", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!re", name = "Nc", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!re", name = "Oc", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!re", name = "Pc", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!re", name = "Rc", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!re", name = "Sc", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!re", name = "Tc", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!re", name = "Uc", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!re", name = "Vc", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!re", name = "Wc", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!re", name = "Xc", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!re", name = "Yc", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!re", name = "Zc", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!re", name = "bd", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!re", name = "dd", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!re", name = "ed", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!re", name = "fd", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!re", name = "gd", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!re", name = "hd", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!re", name = "id", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!re", name = "jd", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!re", name = "kd", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!re", name = "ld", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!re", name = "md", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!re", name = "nd", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!re", name = "od", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!re", name = "pd", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!re", name = "qd", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!re", name = "rd", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!re", name = "sd", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!re", name = "td", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!re", name = "ud", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!re", name = "vd", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!re", name = "wd", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!re", name = "yd", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!re", name = "zd", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!re", name = "Bd", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!re", name = "Cd", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!re", name = "Dd", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!re", name = "Ed", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!re", name = "Fd", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!re", name = "Gd", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!re", name = "Hd", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!re", name = "Id", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!re", name = "Jd", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!re", name = "Kd", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!re", name = "Md", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!re", name = "Nd", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!re", name = "Od", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!re", name = "Pd", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!re", name = "Rd", descriptor = "I")
    public int field8290;

    @OriginalMember(owner = "client!re", name = "Sd", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!re", name = "Ud", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!re", name = "Vd", descriptor = "I")
    public int field8294;

    @OriginalMember(owner = "client!re", name = "Wd", descriptor = "I")
    public int field8295;

    @OriginalMember(owner = "client!re", name = "ie", descriptor = "I")
    public int field8307;

    @OriginalMember(owner = "client!re", name = "se", descriptor = "I")
    public int field8317;

    @OriginalMember(owner = "client!re", name = "te", descriptor = "I")
    private int field8318;

    @OriginalMember(owner = "client!re", name = "ue", descriptor = "I")
    public int field8319;

    @OriginalMember(owner = "client!re", name = "Ie", descriptor = "I")
    public int field8333;

    @OriginalMember(owner = "client!re", name = "Ue", descriptor = "I")
    public int field8345;

    @OriginalMember(owner = "client!re", name = "af", descriptor = "I")
    public int field8351;

    @OriginalMember(owner = "client!re", name = "Cf", descriptor = "I")
    public int field8378;

    @OriginalMember(owner = "client!re", name = "Df", descriptor = "I")
    private int field8379;

    @OriginalMember(owner = "client!re", name = "Hf", descriptor = "I")
    public int field8383;

    @OriginalMember(owner = "client!re", name = "vg", descriptor = "I")
    private int field8423;

    @OriginalMember(owner = "client!re", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!re", name = "cg", descriptor = "Lkq;")
    public class102 field8404;

    @OriginalMember(owner = "client!re", name = "fg", descriptor = "Lkq;")
    public class102 field8407;

    @OriginalMember(owner = "client!re", name = "jg", descriptor = "Lkq;")
    public class102 field8411;

    @OriginalMember(owner = "client!re", name = "mg", descriptor = "Lkq;")
    private class102 field8414;

    @OriginalMember(owner = "client!re", name = "pg", descriptor = "Lkq;")
    private class102 field8417;

    @OriginalMember(owner = "client!re", name = "qg", descriptor = "Lkq;")
    public class102 field8418;

    @OriginalMember(owner = "client!re", name = "ff", descriptor = "Lsw;")
    public class11 field8356;

    @OriginalMember(owner = "client!re", name = "df", descriptor = "Ljl;")
    private class123 field8354;

    @OriginalMember(owner = "client!re", name = "gg", descriptor = "Llca;")
    private class133 field8408;

    @OriginalMember(owner = "client!re", name = "kg", descriptor = "Llca;")
    private class133 field8412;

    @OriginalMember(owner = "client!re", name = "ig", descriptor = "Lbd;")
    private class180 field8410;

    @OriginalMember(owner = "client!re", name = "bg", descriptor = "Luf;")
    public class351 field8403;

    @OriginalMember(owner = "client!re", name = "dg", descriptor = "Luf;")
    public class351 field8405;

    @OriginalMember(owner = "client!re", name = "eg", descriptor = "Luf;")
    public class351 field8406;

    @OriginalMember(owner = "client!re", name = "lg", descriptor = "Luf;")
    public class351 field8413;

    @OriginalMember(owner = "client!re", name = "ng", descriptor = "Luf;")
    public class351 field8415;

    @OriginalMember(owner = "client!re", name = "og", descriptor = "Luf;")
    public class351 field8416;

    @OriginalMember(owner = "client!re", name = "rg", descriptor = "Luf;")
    public class351 field8419;

    @OriginalMember(owner = "client!re", name = "sg", descriptor = "Luf;")
    public class351 field8420;

    @OriginalMember(owner = "client!re", name = "tg", descriptor = "Luf;")
    public class351 field8421;

    @OriginalMember(owner = "client!re", name = "ug", descriptor = "Luf;")
    public class351 field8422;

    @OriginalMember(owner = "client!re", name = "Xe", descriptor = "Len;")
    private class436 field8348;

    @OriginalMember(owner = "client!re", name = "Ae", descriptor = "Lsf;")
    private class554 field8325;

    @OriginalMember(owner = "client!re", name = "sc", descriptor = "Lpv;")
    public class64 field8213;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8146;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field8115;

    @OriginalMember(owner = "client!re", name = "ob", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8157;

    @OriginalMember(owner = "client!re", name = "le", descriptor = "Z")
    public boolean field8310;

    @OriginalMember(owner = "client!re", name = "qe", descriptor = "Z")
    public boolean field8315;

    @OriginalMember(owner = "client!re", name = "Ee", descriptor = "Z")
    public boolean field8329;

    @OriginalMember(owner = "client!re", name = "Me", descriptor = "Z")
    public boolean field8337;

    @OriginalMember(owner = "client!re", name = "wf", descriptor = "Z")
    public boolean field8372;

    @OriginalMember(owner = "client!re", name = "wg", descriptor = "Z")
    public boolean field8424;

    @OriginalMember(owner = "client!re", name = "Re", descriptor = "[Lsw;")
    private class11[] field8342;

    @OriginalMember(owner = "client!re", name = "Gf", descriptor = "[Luw;")
    public class186[] field8382;

    @OriginalMember(owner = "client!re", name = "ne", descriptor = "[Lsm;")
    public class577[] field8312;

    @OriginalMember(owner = "client!re", name = "Zf", descriptor = "[Lsm;")
    public class577[] field8401;

    @OriginalMember(owner = "client!re", name = "Ve", descriptor = "[Lww;")
    public class592[] field8346;

    @OriginalMember(owner = "client!re", name = "Kf", descriptor = "[Lgn;")
    public class635[] field8386;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V")
    private final void method3282(int arg0) {
        this.field8408 = this.method1197(arg0 + -2, true);
        ++field8230;
        this.field8408.method703(24, arg0 + 11348, arg0);
        this.field8417 = this.method1178(new class410[] { new class410(class76.field1031) }, (byte) -13);
    }

    @OriginalMember(owner = "client!re", name = "i", descriptor = "(I)V")
    private final void method3283(int arg0) {
        ++field8240;
        this.field8322 = false;
        if (class555.field7757 == this.field8347) {
            this.method3286(false);
            this.method3290(-76);
        }
        if (arg0 != 9) {
            this.field8213 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
    public final void method3284(boolean arg0, int arg1) {
        int var3 = 54 / ((-25 - arg1) / 60);
        if (!arg0 != !this.field8339) {
            this.field8339 = arg0;
            this.method1191(16725);
            this.field8379 &= -32;
        }
        ++field8171;
    }

    @OriginalMember(owner = "client!re", name = "j", descriptor = "(I)V")
    public abstract void method1213(int arg0);

    @OriginalMember(owner = "client!re", name = "E", descriptor = "(III)V")
    public final void method923(int arg0, int arg1, int arg2) {
        ++field8286;
        if (this.field8305 != arg0 || ~this.field8323 != ~arg1 || ~this.field8302 != ~arg2) {
            this.field8323 = arg1;
            this.field8302 = arg2;
            this.field8305 = arg0;
            if (this.field8329) {
                return;
            }
            this.method3332(0);
            this.method1194(0);
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public void method932(int arg0) {
        this.field8398.method2517(25606);
        ++field8124;
        this.field8378 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpe;[Lig;Z)Lra;")
    public final class262 method982(class157 arg0, class295[] arg1, boolean arg2) {
        ++field8137;
        return new class87(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!re", name = "k", descriptor = "(I)Luw;")
    public final class186 method3285(int arg0) {
        if (arg0 <= 62) {
            this.field8307 = -44;
        }
        ++field8239;
        return this.field8382[this.field8391];
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(Z)V")
    private final void method3286(boolean arg0) {
        if (!this.field8322) {
            float[] var2 = this.field8358;
            this.field8322 = true;
            if (this.field8219 != 0 && ~this.field8249 != -1) {
                var2[4] = 0.0F;
                var2[14] = 0.5F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[5] = -2.0F / (float) this.field8249;
                var2[13] = 1.0F;
                var2[12] = -1.0F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (float) this.field8219;
                var2[6] = 0.0F;
                var2[10] = 0.5F;
            } else {
                var2[10] = 1.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = 0.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[14] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
            }
        }
        if (arg0) {
            this.method3355((byte) 52);
        }
        ++field8203;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method3287(int arg0, Buffer arg1) {
        ++field8261;
        this.field8334.method3201(arg1);
        if (arg0 != -1) {
            this.field8312 = null;
        }
        return this.field8334;
    }

    @OriginalMember(owner = "client!re", name = "l", descriptor = "(I)V")
    public abstract void method1180(int arg0);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    private final void method3288(byte arg0) {
        if (class609.field8765 != this.field8347) {
            class368 var2 = this.field8347;
            this.field8347 = class609.field8765;
            if (!var2.method2260(-122)) {
                this.method3345(0);
            }
            this.method3335(true);
            this.field8332 = this.field8364;
            this.method3290(66);
            this.field8379 &= -8;
        }
        ++field8274;
        int var3 = -104 / ((arg0 - 11) / 50);
    }

    @OriginalMember(owner = "client!re", name = "m", descriptor = "(I)V")
    public abstract void method1160(int arg0);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)Luw;")
    public final class186 method3289(byte arg0) {
        ++field8262;
        int var2 = 59 % ((arg0 - -46) / 58);
        return this.field8299;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
    public final int method914() {
        ++field8178;
        return this.field8351 + -2;
    }

    @OriginalMember(owner = "client!re", name = "n", descriptor = "(I)V")
    private final void method3290(int arg0) {
        ++field8145;
        this.method1175(7);
        if (this.field8325 != null) {
            this.field8325.method2172((byte) -121);
        }
        int var2 = -20 % ((-2 - arg0) / 49);
    }

    @OriginalMember(owner = "client!re", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8232;
        float var7 = this.field8296.method1147((float) arg1, (float) arg0, (float) arg2, false);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field8296.method1147((float) arg4, (float) arg3, (float) arg5, false);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field8393 > var7) || !((float) this.field8393 > var8)) && (!((float) this.field8374 < var7) || !(var8 > (float) this.field8374))) {
            int var9 = (int) ((float) this.field8350 * this.field8296.method1144((float) arg2, (float) arg0, (float) arg1, 1380) / var7);
            int var10 = (int) ((float) this.field8350 * this.field8296.method1144((float) arg5, (float) arg3, (float) arg4, 1380) / var8);
            if (this.field8308 > (float) var9 && this.field8308 > (float) var10 || this.field8369 < (float) var9 && (float) var10 > this.field8369) {
                return false;
            } else {
                int var11 = (int) ((float) this.field8330 * this.field8296.method1129((float) arg0, (float) arg2, 2, (float) arg1) / var7);
                int var12 = (int) ((float) this.field8330 * this.field8296.method1129((float) arg3, (float) arg5, 2, (float) arg4) / var8);
                return (!((float) var11 < this.field8380) || !((float) var12 < this.field8380)) && (!((float) var11 > this.field8392) || !(this.field8392 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method201(Canvas arg0) {
        this.field8284 = null;
        this.field8273 = null;
        ++field8209;
        if (arg0 != null && this.field8270 != arg0) {
            if (this.field8157.containsKey(arg0)) {
                this.field8273 = this.field8157.get(arg0);
                this.field8284 = arg0;
            }
        } else {
            this.field8284 = this.field8270;
            this.field8273 = this.field8128;
        }
        if (this.field8284 != null && this.field8273 != null) {
            this.method1195(this.field8284, true, this.field8273);
            this.method3305(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
    public final void method3291(int arg0, int arg1) {
        if (arg0 == 1) {
            this.method3316(class509.field7093, -81, class509.field7093);
        } else if (arg0 == 0) {
            this.method3316(class443.field6123, arg1 ^ 62, class443.field6123);
        } else if (arg0 == 2) {
            this.method3316(class550.field7639, arg1 + 113, class509.field7093);
        } else if (~arg0 == -4) {
            this.method3316(class505.field7041, 28, class443.field6123);
        } else if (arg0 == 4) {
            this.method3316(class334.field4669, 120, class334.field4669);
        }
        ++field8169;
        if (arg1 != 2) {
            this.field8369 = -0.51702714F;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method986(Canvas arg0) {
        ++field8174;
        if (this.field8270 == arg0) {
            throw new RuntimeException();
        } else if (this.field8157.containsKey(arg0)) {
            this.method1176(this.field8157.get(arg0), arg0, 114);
            this.field8157.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIII)V")
    public final void method961(int arg0, int arg1, int arg2, int arg3) {
        this.field8353 = arg0;
        this.field8350 = arg2;
        ++field8130;
        this.field8330 = arg3;
        this.field8373 = arg1;
        this.method3341(true);
        this.method3352(18027);
        this.method3296(3292);
        this.method3318(-125);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILuw;)V")
    public final void method3292(int arg0, class186 arg1) {
        this.field8292.method362(arg1);
        ++field8173;
        this.field8289 = false;
        this.method3354(0);
        int var3 = -107 % ((19 - arg0) / 62);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
    public static final void method3293(int arg0, boolean arg1) {
        ++field8250;
        if (arg1) {
            if (class126.field1565 != -1) {
                class211.method1342(110, class126.field1565);
            }
            for (class496 var2 = (class496) class523.field7289.method3473(-27089); var2 != null; var2 = (class496) class523.field7289.method3478((byte) 5)) {
                if (!var2.method591(107)) {
                    var2 = (class496) class523.field7289.method3473(-27089);
                    if (var2 == null) {
                        break;
                    }
                }
                class489.method2752(false, var2, true, false);
            }
            class126.field1565 = -1;
            class523.field7289 = new class607(8);
            class268.method1644(30000);
            class126.field1565 = class120.field1526;
            class266.method1638(true, false);
            class145.method794((byte) 120);
            class218.method1409(class126.field1565);
        }
        if (arg0 != 0) {
            field8216 = -65;
        }
        class438.field5984 = true;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public final void method203(int arg0) {
        ++field8127;
    }

    @OriginalMember(owner = "client!re", name = "F", descriptor = "(IIII)V")
    public final void method939(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8328 > arg2) {
            this.field8328 = arg2;
        }
        if (this.field8399 > arg3) {
            this.field8399 = arg3;
        }
        if (arg0 > this.field8344) {
            this.field8344 = arg0;
        }
        if (arg1 > this.field8324) {
            this.field8324 = arg1;
        }
        ++field8165;
        if (this.field8344 <= 0 && ~this.field8219 >= ~this.field8328 && ~this.field8324 >= -1 && this.field8399 >= this.field8249) {
            this.method962();
        } else {
            if (!this.field8424) {
                this.field8424 = true;
                this.method1206((byte) 94);
            }
            this.method1168((byte) -102);
            this.method3318(78);
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public abstract void method1168(byte arg0);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)I")
    public final int method3294(byte arg0) {
        ++field8214;
        if (arg0 != -62) {
            this.method3322(-99, 0.852139F);
        }
        return this.field8318;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
    public abstract void method1195(Canvas arg0, boolean arg1, Object arg2);

    @OriginalMember(owner = "client!re", name = "M", descriptor = "(F)V")
    public final void method993(float arg0) {
        if (this.field8355 != arg0) {
            this.field8355 = arg0;
            this.field8237.setAmbient(arg0);
            this.method1202(140);
            this.method1166(0);
        }
        ++field8148;
    }

    @OriginalMember(owner = "client!re", name = "n", descriptor = "()V")
    public final void method962() {
        if (this.field8424) {
            this.field8424 = false;
            this.method1206((byte) 94);
        }
        ++field8281;
        this.field8328 = this.field8219;
        this.field8399 = this.field8249;
        this.field8324 = 0;
        this.field8344 = 0;
        this.method3318(110);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[FZLuda;II)Lgq;")
    public final class305 method3295(int arg0, float[] arg1, boolean arg2, class509 arg3, int arg4, int arg5) {
        ++field8278;
        if (arg4 != 0) {
            this.method952(-92, 83, -68, -39, -6);
        }
        return this.method1205(arg2, arg1, -126, arg3, 0, arg0, arg5, 0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lr;Lkw;Lm;Leca;I)V")
    public final void method947(class521 arg0, class174 arg1, class105 arg2, class378 arg3, int arg4) {
        ++field8150;
        arg0.method1595(arg2, arg3, arg4);
        this.method957(arg1);
    }

    @OriginalMember(owner = "client!re", name = "o", descriptor = "(I)V")
    public final void method3296(int arg0) {
        if (class291.field3775 != this.field8347) {
            class368 var2 = this.field8347;
            this.field8347 = class291.field3775;
            if (var2.method2260(-118)) {
                this.method3345(0);
            }
            this.field8332 = this.field8365;
            this.field8379 &= -32;
        }
        ++field8266;
        if (arg0 != 3292) {
            this.field8128 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "ta", descriptor = "(II)V")
    public final void method940(int arg0, int arg1) {
        if (this.field8393 != arg0 || ~this.field8374 != ~arg1) {
            this.field8393 = arg0;
            this.field8374 = arg1;
            this.method3352(18027);
            this.method3341(true);
            this.method3332(0);
        }
        ++field8140;
    }

    @OriginalMember(owner = "client!re", name = "p", descriptor = "(I)V")
    public abstract void method1177(int arg0);

    @OriginalMember(owner = "client!re", name = "g", descriptor = "()Z")
    public final boolean method924() {
        ++field8288;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "w", descriptor = "()F")
    public final float method3297() {
        ++field8224;
        return this.field8304;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIZIIB)V")
    private final void method3298(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        boolean var7 = arg2 & this.method917();
        ++field8248;
        if (!var7 && (arg4 == 4 || ~arg4 == -9 || arg4 == 9)) {
            arg4 = 2;
            arg1 = arg4 != 4 ? 1 : 1 & arg3;
            arg3 = 0;
        }
        if (~arg4 != -1 && arg0) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (arg5 != 122) {
            this.method961(53, 74, -34, -113);
        }
        if (~this.field8316 != ~arg4) {
            if (this.field8316 != 0) {
                this.field8314[Integer.MAX_VALUE & this.field8316].method470(4096);
            }
            if (arg4 == 0) {
                this.field8325 = null;
            } else {
                this.field8325 = this.field8314[arg4 & Integer.MAX_VALUE];
                this.field8325.method466((byte) 61, arg0);
                this.field8325.method471(arg0, 84);
                this.field8325.method473(arg1, true, arg3);
            }
            this.field8316 = arg4;
            this.field8309 = arg1;
            this.field8360 = arg3;
        } else if (~this.field8316 != -1) {
            this.field8314[this.field8316 & Integer.MAX_VALUE].method471(arg0, 78);
            if (~this.field8360 != ~arg3 || ~this.field8309 != ~arg1) {
                this.field8314[this.field8316 & Integer.MAX_VALUE].method473(arg1, true, arg3);
                this.field8360 = arg3;
                this.field8309 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(ZI)V")
    public abstract void method1185(boolean arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "m", descriptor = "(IFFFFF)V")
    public final void method981(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8233;
        boolean var7 = ~this.field8361 != ~arg0;
        if (var7 || this.field8385 != arg1 || this.field8343 != arg2) {
            this.field8343 = arg2;
            this.field8385 = arg1;
            this.field8361 = arg0;
            if (var7) {
                this.field8363 = (float) (this.field8361 & 255) / 255.0F;
                this.field8352 = (float) (16711680 & this.field8361) / 1.671168E7F;
                this.field8402 = (float) (65280 & this.field8361) / 65280.0F;
                this.method1202(140);
            }
            this.field8237.setSunColour(this.field8352, this.field8402, this.field8363, arg1, arg2);
            this.method1187(-5477);
        }
        if (this.field8396[0] != arg3 || this.field8396[1] != arg4 || this.field8396[2] != arg5) {
            this.field8396[1] = arg4;
            this.field8396[0] = arg3;
            this.field8396[2] = arg5;
            this.field8368[1] = -arg4;
            this.field8368[2] = -arg5;
            this.field8368[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8377[0] = arg3 * var8;
            this.field8377[1] = arg4 * var8;
            this.field8377[2] = arg5 * var8;
            this.field8400[2] = -this.field8377[2];
            this.field8400[1] = -this.field8377[1];
            this.field8400[0] = -this.field8377[0];
            this.field8237.setSunDirection(this.field8377[0], this.field8377[1], this.field8377[2]);
            this.method1155(0);
            this.field8317 = (int) (arg3 * 256.0F / arg4);
            this.field8345 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1166(0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lkq;I)V")
    public abstract void method1207(class102 arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "q", descriptor = "(IIII)V")
    public final void method905(int arg0, int arg1, int arg2, int arg3) {
        this.field8326 = arg2;
        this.field8390 = arg3;
        this.field8306 = arg1;
        this.field8329 = true;
        this.field8318 = arg0;
        ++field8166;
        this.method3298(false, 0, false, 0, 3, (byte) 122);
        if (this.field8325 != null) {
            this.field8325.method2168(101);
        }
        this.method3332(0);
        this.method1194(0);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(IIIIII)V")
    public final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8129;
        float var7 = this.method1163(false);
        this.method3309(0);
        this.method3334(8, arg4);
        this.method3300(true, 0, class320.field4434);
        this.method3307(class320.field4434, 0, 16711680);
        this.method3343(arg5, 0);
        this.field8292.method1138(0, (float) (arg3 + -1), (float) (arg2 + -1), 1.0F);
        this.field8292.method1146((float) arg1 + -var7, (float) arg0 - var7, 0.0F, 0);
        this.method3336((byte) 86);
        this.method1185(false, 6420);
        this.method3327(class516.field7179, 4, false);
        this.method1185(true, 6420);
        this.method3307(class93.field1233, 0, 16711680);
        this.method3300(true, 0, class93.field1233);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ln;Lkr;II)V")
    public class582(Canvas arg0, Object arg1, class473 arg2, class329 arg3, int arg4, int arg5) {
        super(arg2);
        this.field8370 = arg4;
        this.field8273 = this.field8128 = arg1;
        this.field8177 = arg3;
        this.field8284 = this.field8270 = arg0;
        Dimension var7 = arg0.getSize();
        this.field8249 = this.field8161 = var7.height;
        this.field8376 = arg5;
        this.field8219 = this.field8149 = var7.width;
        class367.method2250((byte) 94, true, false);
        this.field8398 = new class431(this, super.field2114);
        this.field8237 = new NativeInterface(super.field2114.method2148(-23093), this.field8376);
        for (int var8 = 0; super.field2114.method2148(-23093) > var8; ++var8) {
            class41 var9 = super.field2114.method2151(true, var8);
            if (var9 != null) {
                this.field8237.initTextureMetrics(var8, var9.field600, var9.field614);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIII)Lrn;")
    public final class307 method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8172;
        return new class405(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!re", name = "q", descriptor = "(I)Luw;")
    public final class186 method3299(int arg0) {
        ++field8228;
        if (arg0 != -8435) {
            this.method1187(-31);
        }
        return this.field8382[this.field8391];
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZILlg;)V")
    public final void method3300(boolean arg0, int arg1, class32 arg2) {
        this.method1210(arg2, false, arg0, false, arg1);
        if (arg0) {
            ++field8116;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lig;Z)Lha;")
    public final class116 method916(class295 arg0, boolean arg1) {
        ++field8181;
        class116 var9;
        if (~arg0.field3835 != -1 && arg0.field3834 != 0) {
            int[] var3 = new int[arg0.field3835 * arg0.field3834];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field3833 != null) {
                for (int var6 = 0; var6 < arg0.field3834; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field3835; ++var7) {
                        var3[var5++] = class292.method1790(arg0.field3828[class143.method783(arg0.field3831[var4], 255)], arg0.field3833[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~arg0.field3834 < ~var8; ++var8) {
                    for (int var10 = 0; arg0.field3835 > var10; ++var10) {
                        int var11 = arg0.field3828[255 & arg0.field3831[var4++]];
                        var3[var5++] = var11 != 0 ? class292.method1790(-16777216, var11) : 0;
                    }
                }
            }
            var9 = this.method976(var3, 0, arg0.field3835, arg0.field3835, arg0.field3834);
        } else {
            var9 = this.method976(new int[1], 0, 1, 1, 1);
        }
        var9.method623(arg0.field3830, arg0.field3832, arg0.field3829, arg0.field3827);
        return var9;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(II)Lbd;")
    public final class180 method3301(int arg0, int arg1) {
        if (arg1 * 2 > this.field8410.method288(7224)) {
            this.field8410.method292(false, arg1);
        }
        if (arg0 != 7040) {
            this.field8302 = -53;
        }
        ++field8194;
        return this.field8410;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(II)Lsf;")
    public class554 method1157(int arg0, int arg1) {
        if (arg0 < 85) {
            this.method941();
        }
        ++field8253;
        if (arg1 != 6) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    return ~arg1 == -8 ? new class132(this) : new class373(this);
                } else {
                    return new class449(this, this.field8213);
                }
            } else {
                return new class131(this);
            }
        } else {
            return new class236(this);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method1165(boolean arg0, Canvas arg1);

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(B)V")
    private final void method3302(byte arg0) {
        if (arg0 < 98) {
            this.field8298 = null;
        }
        if (!this.field8340) {
            float[] var2 = this.field8389;
            float var3 = (float) (-this.field8353 * this.field8393) / (float) this.field8350;
            float var4 = (float) ((-this.field8353 + this.field8219) * this.field8393) / (float) this.field8350;
            float var5 = (float) (this.field8393 * this.field8373) / (float) this.field8330;
            float var6 = (float) ((-this.field8249 + this.field8373) * this.field8393) / (float) this.field8330;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field8393 * 2.0F;
                var2[11] = -1.0F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[12] = 0.0F;
                var2[15] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[14] = this.field8303 = (float) (this.field8393 * this.field8374) / (float) (-this.field8374 + this.field8393);
                var2[4] = 0.0F;
                var2[10] = this.field8336 = (float) this.field8374 / (float) (-this.field8374 + this.field8393);
                var2[6] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[0] = var7 / (var4 - var3);
            } else {
                var2[6] = 0.0F;
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
            }
            this.method3362(9);
            this.field8340 = true;
        }
        ++field8138;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([Lr;Lm;[Leca;I)V")
    public final void method202(class521[] arg0, class105 arg1, class378[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1595(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field8283;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(Z)V")
    private final void method3303(boolean arg0) {
        ++field8118;
        this.method1182(22469);
        if (this.field8325 != null) {
            this.field8325.method2170(true);
        }
        if (arg0) {
            this.field8384 = 0.49426696F;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IZ)V")
    public final void method3304(int arg0, boolean arg1) {
        ++field8187;
        if (this.field8362 != arg1) {
            this.field8362 = arg1;
            this.method1194(0);
        }
        if (arg0 != 7) {
            this.field8333 = -6;
        }
    }

    @OriginalMember(owner = "client!re", name = "r", descriptor = "(I)V")
    private final void method3305(int arg0) {
        ++field8245;
        if (this.field8284 != null) {
            Dimension var2 = this.field8284.getSize();
            this.field8149 = var2.width;
            this.field8161 = var2.height;
        } else {
            this.field8149 = this.field8161 = 1;
        }
        this.field8219 = this.field8149;
        this.field8249 = this.field8161;
        this.method3283(9);
        this.method3352(arg0 + 18026);
        this.method3341(true);
        this.method1186(10);
        if (arg0 == 1) {
            this.method3318(90);
            this.method3296(3292);
            this.method962();
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lkw;)V")
    public final void method957(class174 arg0) {
        this.field8348.method2541(this, arg0, false);
        ++field8291;
    }

    @OriginalMember(owner = "client!re", name = "s", descriptor = "(I)V")
    public final void method3306(int arg0) {
        if (arg0 >= 101) {
            ++field8154;
            this.method3296(3292);
            this.method3290(-94);
        }
    }

    @OriginalMember(owner = "client!re", name = "t", descriptor = "(I)V")
    public abstract void method1153(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Llg;II)V")
    public final void method3307(class32 arg0, int arg1, int arg2) {
        this.method1154(10, arg1, false, arg0);
        ++field8142;
        if (arg2 != 16711680) {
            this.field8420 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "s", descriptor = "()Lm;")
    public final class105 method964() {
        ++field8229;
        return this.field8409;
    }

    @OriginalMember(owner = "client!re", name = "q", descriptor = "()Z")
    public final boolean method960() {
        ++field8113;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(B)V")
    public void method1192(byte arg0) {
        if (arg0 != 45) {
            this.method3289((byte) 29);
        }
        ++field8244;
        this.field8383 = this.field8307;
        this.field8307 = 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lu;)V")
    public final void method925(class425 arg0) {
        this.field8146 = ((class301) arg0).field3914;
        ++field8211;
        this.field8115 = this.field8146.method3194(32768, false);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "([I)V")
    public final void method980(int[] arg0) {
        arg0[1] = this.field8324;
        arg0[2] = this.field8328;
        arg0[3] = this.field8399;
        arg0[0] = this.field8344;
        ++field8189;
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(B)V")
    public abstract void method1181(byte arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([BBIIILuda;)Lnf;")
    public abstract class37 method1151(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, class509 arg5);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method1176(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!re", name = "i", descriptor = "(B)V")
    public final void method3308(byte arg0) {
        if (arg0 < 69) {
            this.method1202(-4);
        }
        ++field8163;
        Hashtable var2 = new Hashtable();
        if (this.field8157 != null && !this.field8157.isEmpty()) {
            Enumeration var3 = this.field8157.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1165(true, var4));
            }
        }
        this.field8157 = var2;
        this.method3358((byte) 96);
        this.method3282(12);
        this.field8348.method2540(this, 786336);
    }

    @OriginalMember(owner = "client!re", name = "u", descriptor = "(I)V")
    private final void method3309(int arg0) {
        ++field8153;
        if (this.field8379 != 1) {
            this.method3355((byte) -106);
            this.method3320(-32, false);
            this.method3333(false, (byte) 119);
            this.method3330(false, (byte) -127);
            this.method3284(false, -89);
            this.method3329(arg0 + -10053, false, false, -2);
            this.method3291(1, arg0 + 2);
            this.method3344(arg0 + 29639, this.field8356);
            this.field8379 = 1;
        }
        if (arg0 != 0) {
            this.field8273 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8222;
    }

    @OriginalMember(owner = "client!re", name = "j", descriptor = "(B)I")
    public final int method3310(byte arg0) {
        ++field8168;
        if (arg0 != -23) {
            this.method3318(36);
        }
        return this.field8326;
    }

    @OriginalMember(owner = "client!re", name = "v", descriptor = "(I)V")
    public abstract void method1183(int arg0);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "()Z")
    public final boolean method944() {
        ++field8139;
        return false;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method3311(int arg0, boolean arg1, int arg2) {
        if (arg2 != -20127) {
            return null;
        } else {
            ++field8263;
            return this.field8146.method3194(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!re", name = "w", descriptor = "(I)V")
    private final void method3312(int arg0) {
        this.method1207(this.field8417, 1);
        ++field8151;
        this.method1171(this.field8408, 0, (byte) -98);
        this.method1208(class202.field2645, 0, 121, 1);
        int var2 = 61 / ((arg0 - -73) / 44);
    }

    @OriginalMember(owner = "client!re", name = "ba", descriptor = "()I")
    public final int method929() {
        ++field8218;
        return this.field8423;
    }

    @OriginalMember(owner = "client!re", name = "x", descriptor = "(I)V")
    public abstract void method1202(int arg0);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "(B)Luw;")
    public final class186 method3313(byte arg0) {
        if (!this.field8375) {
            this.field8300.method1135(this.field8298, this.field8292);
            this.field8375 = true;
        }
        ++field8164;
        if (arg0 != -8) {
            this.method995(-27, -86, -88, -70, -84, -68);
        }
        return this.field8300;
    }

    @OriginalMember(owner = "client!re", name = "y", descriptor = "(I)V")
    public final void method3314(int arg0) {
        if (this.field8379 != 16) {
            this.method3288((byte) 120);
            this.method3320(arg0 ^ -31, true);
            this.method3330(true, (byte) -127);
            this.method3284(true, 89);
            this.method3343(1, 0);
            this.field8379 = 16;
        }
        if (arg0 != 1) {
            this.method1205(false, (float[]) null, 8, (class509) null, -97, 74, 13, -81);
        }
        ++field8275;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class544 method200(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8254;
        return new class171(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!re", name = "z", descriptor = "(I)V")
    public abstract void method1187(int arg0);

    @OriginalMember(owner = "client!re", name = "A", descriptor = "(I)V")
    public abstract void method1191(int arg0);

    @OriginalMember(owner = "client!re", name = "B", descriptor = "(I)V")
    public abstract void method1158(int arg0);

    @OriginalMember(owner = "client!re", name = "C", descriptor = "(I)V")
    private final void method3315(int arg0) {
        this.field8311 = (float) this.field8374 + -this.field8327;
        if (arg0 > -67) {
            this.field8306 = 62;
        }
        ++field8126;
    }

    @OriginalMember(owner = "client!re", name = "D", descriptor = "(I)V")
    public abstract void method1172(int arg0);

    @OriginalMember(owner = "client!re", name = "E", descriptor = "(I)V")
    public abstract void method1211(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lsm;ILsm;)V")
    public final void method3316(class577 arg0, int arg1, class577 arg2) {
        int var4 = 86 / ((-27 - arg1) / 45);
        ++field8120;
        boolean var5 = false;
        if (this.field8312[this.field8391] != arg0) {
            this.field8312[this.field8391] = arg0;
            var5 = true;
            this.method1158(-125);
        }
        if (this.field8401[this.field8391] != arg2) {
            this.field8401[this.field8391] = arg2;
            var5 = true;
            this.method1189((byte) -100);
        }
        if (var5) {
            this.field8379 &= -30;
        }
    }

    @OriginalMember(owner = "client!re", name = "F", descriptor = "(I)V")
    public final void method3317(int arg0) {
        ++field8183;
        if (arg0 != 1) {
            this.method3296(-21);
        }
        this.method3327(class603.field8706, 2, false);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(IIIIII)V")
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8202;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        if (this.method3338(-58, (float) arg3 + var10, (float) arg2 + var11, (float) arg1, 0.0F, (float) arg0, 0.0F)) {
            this.method3309(0);
            this.method3334(8, arg4);
            this.method3300(true, 0, class320.field4434);
            this.method3307(class320.field4434, 0, 16711680);
            this.method3343(arg5, 0);
            this.method3331((byte) -112);
            this.method1185(false, 6420);
            this.method3312(-126);
            this.method1185(true, 6420);
            this.method3307(class93.field1233, 0, 16711680);
            this.method3300(true, 0, class93.field1233);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lsb;Luda;III)Lgq;")
    public abstract class305 method1161(class280 arg0, class509 arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!re", name = "G", descriptor = "(I)V")
    public abstract void method1162(int arg0);

    @OriginalMember(owner = "client!re", name = "H", descriptor = "(I)V")
    private final void method3318(int arg0) {
        ++field8111;
        int var2 = -99 / ((arg0 - -38) / 56);
        this.field8392 = (float) (-this.field8373 + this.field8399);
        this.field8369 = (float) (-this.field8353 + this.field8328);
        this.field8308 = (float) (-this.field8353 + this.field8344);
        this.field8380 = (float) (-this.field8373 + this.field8324);
    }

    @OriginalMember(owner = "client!re", name = "N", descriptor = "(IIII)V")
    public final void method977(int arg0, int arg1, int arg2, int arg3) {
        this.field8324 = arg1 >= 0 ? arg1 : 0;
        this.field8328 = ~arg2 < ~this.field8219 ? 0 : arg2;
        ++field8141;
        this.field8399 = this.field8219 < arg3 ? 0 : arg3;
        this.field8344 = ~arg0 <= -1 ? arg0 : 0;
        if (this.field8344 <= 0 && ~this.field8219 >= ~this.field8328 && ~this.field8324 >= -1 && this.field8399 >= this.field8249) {
            this.method962();
        } else {
            if (!this.field8424) {
                this.field8424 = true;
                this.method1206((byte) 94);
            }
            this.method1168((byte) -102);
            this.method3318(-94);
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(IIIII)V")
    public final void method979(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8167;
        this.method935(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!re", name = "E", descriptor = "()F")
    public final float method3319() {
        ++field8205;
        return this.field8327;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(IZ)V")
    public final void method3320(int arg0, boolean arg1) {
        ++field8199;
        if (arg0 != -32) {
            this.method1186(41);
        }
        if (!arg1 == this.field8310) {
            this.field8310 = arg1;
            this.method1194(0);
            this.field8379 &= -32;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLgn;)V")
    public final void method3321(byte arg0, class635 arg1) {
        if (arg0 >= -120) {
            this.field8397 = true;
        }
        this.field8386[this.field8391] = arg1;
        ++field8260;
        this.method3303(false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IF)V")
    public final void method3322(int arg0, float arg1) {
        if (arg0 == 9) {
            if (this.field8313 != arg1) {
                this.field8313 = arg1;
                this.method3341(true);
            }
            ++field8136;
        }
    }

    @OriginalMember(owner = "client!re", name = "I", descriptor = "(I)V")
    public final void method3323(int arg0) {
        if (this.field8386[this.field8391] != class467.field6627) {
            this.field8386[this.field8391] = class467.field6627;
            this.field8382[this.field8391].method354();
            this.method3303(false);
        }
        if (arg0 != 0) {
            this.method1155(38);
        }
        ++field8109;
    }

    @OriginalMember(owner = "client!re", name = "p", descriptor = "()Z")
    public final boolean method951() {
        ++field8234;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lrn;)V")
    public final void method927(class307 arg0) {
        ++field8132;
        this.field8354 = (class123) arg0;
    }

    @OriginalMember(owner = "client!re", name = "J", descriptor = "(I)V")
    public abstract void method1194(int arg0);

    @OriginalMember(owner = "client!re", name = "K", descriptor = "(I)V")
    public final void method3324(int arg0) {
        if (arg0 == 30426) {
            ++field8257;
            if (this.field8379 != 4) {
                this.method3355((byte) -127);
                this.method3320(-32, false);
                this.method3333(false, (byte) -105);
                this.method3330(false, (byte) -116);
                this.method3284(false, 104);
                this.method3329(-10053, false, false, -2);
                this.method3343(1, 0);
                this.method3291(0, arg0 ^ 30424);
                this.field8379 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([S[Ljava/lang/String;Z)V")
    public static final void method3325(short[] arg0, String[] arg1, boolean arg2) {
        if (!arg2) {
            method3293(65, true);
        }
        class152.method829((byte) 39, arg1, arg0, 0, arg1.length - 1);
        ++field8236;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lsb;Luda;I)Z")
    public abstract boolean method1214(class280 arg0, class509 arg1, int arg2);

    @OriginalMember(owner = "client!re", name = "M", descriptor = "(I)V")
    public final void method3326(int arg0) {
        this.field8342 = new class11[this.field8319];
        this.field8401 = new class577[this.field8319];
        this.field8312 = new class577[this.field8319];
        ++field8271;
        this.field8386 = new class635[this.field8319];
        this.field8382 = new class186[this.field8319];
        for (int var2 = 0; this.field8319 > var2; ++var2) {
            this.field8401[var2] = class443.field6123;
            this.field8312[var2] = class443.field6123;
            this.field8386[var2] = class467.field6627;
            this.field8382[var2] = new class186();
        }
        this.field8346 = new class592[this.field8351 - 2];
        this.field8356 = this.method1161(class280.field3663, class532.field7430, 1, 1, -36);
        this.method925(new class301(262144));
        this.field8404 = this.method1178(new class410[] { new class410(new class76[] { class76.field1031, class76.field1038 }) }, (byte) -13);
        this.field8411 = this.method1178(new class410[] { new class410(new class76[] { class76.field1031, class76.field1036 }) }, (byte) -13);
        this.field8407 = this.method1178(new class410[] { new class410(class76.field1031), new class410(class76.field1036), new class410(class76.field1038), new class410(class76.field1035) }, (byte) -13);
        this.field8418 = this.method1178(new class410[] { new class410(class76.field1031), new class410(class76.field1036), new class410(class76.field1038) }, (byte) -13);
        this.field8413 = new class351(this, 0, 0, false, false);
        this.field8419 = new class351(this, 0, 0, true, true);
        this.field8422 = new class351(this, 0, 0, false, false);
        this.field8416 = new class351(this, 0, 0, true, true);
        this.field8405 = new class351(this, 0, 0, false, false);
        if (arg0 <= -18) {
            this.field8420 = new class351(this, 0, 0, true, true);
            this.field8415 = new class351(this, 0, 0, false, false);
            this.field8421 = new class351(this, 0, 0, true, true);
            this.field8403 = new class351(this, 0, 0, false, false);
            this.field8406 = new class351(this, 0, 0, true, true);
            this.field8348 = new class436(this);
            this.field8410 = this.method1188((byte) 113, true);
            this.method3308((byte) 71);
            this.field8213 = new class64(this);
            this.field8314[1] = this.method1157(110, 1);
            this.field8314[2] = this.method1157(123, 2);
            this.field8314[4] = this.method1157(117, 4);
            this.field8314[5] = this.method1157(95, 5);
            this.field8314[6] = this.method1157(105, 6);
            this.field8314[7] = this.method1157(93, 7);
            this.field8314[3] = this.method1157(97, 3);
            this.field8314[8] = this.method1157(108, 8);
            this.field8314[9] = this.method1157(120, 9);
            if (!this.field8314[2].method467(4096)) {
                this.field8314[2] = this.method1157(103, 0);
            }
            if (!this.field8314[4].method467(4096)) {
                this.field8314[4] = this.field8314[2];
            }
            if (!this.field8314[8].method467(4096)) {
                this.field8314[8] = this.field8314[4];
            }
            if (!this.field8314[9].method467(4096)) {
                this.field8314[9] = this.field8314[8];
            }
            this.method1184(0);
            this.method962();
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lbe;IZ)V")
    private final void method3327(class189 arg0, int arg1, boolean arg2) {
        this.method1207(this.field8414, 1);
        ++field8192;
        this.method1171(this.field8412, 0, (byte) -98);
        this.method1208(arg0, 0, 83, arg1);
        if (arg2) {
            this.field8316 = -9;
        }
    }

    @OriginalMember(owner = "client!re", name = "U", descriptor = "()I")
    public final int method965() {
        ++field8119;
        return this.field8295 + this.field8294 - -this.field8290;
    }

    @OriginalMember(owner = "client!re", name = "x", descriptor = "()Z")
    public final boolean method195() {
        ++field8186;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "N", descriptor = "(I)V")
    public final void method3328(int arg0) {
        ++field8212;
        Enumeration var2 = this.field8157.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1176(this.field8157.get(var3), var3, arg0 ^ -5);
        }
        this.field8412.method296((byte) 36);
        this.field8408.method296((byte) 36);
        this.field8419.method2182(0);
        this.field8416.method2182(0);
        this.field8420.method2182(0);
        this.field8421.method2182(0);
        this.field8406.method2182(0);
        this.field8348.method2536(32655);
        if (arg0 != 6) {
            this.field8394 = -128;
        }
        this.field8410.method296((byte) 36);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZZI)V")
    public final void method3329(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (~this.field8341 != ~arg3) {
            if (arg3 < 0) {
                this.method3323(0);
                this.method3344(29639, (class11) null);
                this.method3291(0, 2);
                if (!this.field8329) {
                    this.method3298(arg2, 0, arg1, 0, 0, (byte) 122);
                }
            } else {
                class305 var5 = this.field8398.method2515(118, arg3);
                class41 var6 = super.field2114.method2151(true, arg3);
                if (var6.field601 == 0 && ~var6.field617 == -1) {
                    this.method3323(arg0 ^ -10053);
                } else {
                    int var7 = var6.field613 ? 64 : 128;
                    int var8 = var7 * 50;
                    class186 var9 = this.method3299(-8435);
                    var9.method1136(0.0F, (float) (this.field8378 % var8 * var6.field617) / (float) var8, (float) (this.field8378 % var8 * var6.field601) / (float) var8, arg0 ^ -10061);
                    this.method3321((byte) -123, class620.field8928);
                }
                if (!this.field8329) {
                    this.method3298(arg2, var6.field602, arg1, var6.field618, var6.field620, (byte) 122);
                }
                if (this.field8325 == null) {
                    this.method3344(29639, var5);
                    this.method3291(var6.field605, 2);
                } else {
                    this.field8325.method464(true, var6.field605, var5);
                }
            }
            this.field8341 = arg3;
        }
        ++field8269;
        if (arg0 == -10053) {
            this.field8379 &= -8;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lm;)V")
    public final void method956(class105 arg0) {
        ++field8200;
        this.field8296 = (class186) arg0;
        this.field8298.method362(this.field8296);
        this.field8298.method1139((byte) -121);
        this.field8299.method1143(this.field8298, 2);
        this.field8297.method1143(this.field8296, 2);
        if (this.field8347.method2260(-70)) {
            this.method3345(0);
        }
    }

    @OriginalMember(owner = "client!re", name = "O", descriptor = "(I)V")
    public abstract void method1186(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZB)V")
    public final void method3330(boolean arg0, byte arg1) {
        if (!this.field8397 != !arg0) {
            this.field8397 = arg0;
            this.method1160(-28988);
            this.field8379 &= -32;
        }
        ++field8246;
        if (arg1 >= -109) {
            this.method925((class425) null);
        }
    }

    @OriginalMember(owner = "client!re", name = "l", descriptor = "(B)V")
    public abstract void method1203(byte arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class116 method969(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8293;
        class235 var6 = new class235(this, arg2, arg3, arg4);
        var6.method620(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class594 method985(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8225;
        return class436.method2542(arg3, 27737, this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(II)V")
    public abstract void method1204(int arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "m", descriptor = "(B)V")
    public abstract void method1189(byte arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1152(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!re", name = "n", descriptor = "(B)V")
    public final void method3331(byte arg0) {
        ++field8255;
        this.field8292.method354();
        this.field8289 = true;
        this.method3354(0);
        if (arg0 > -111) {
            this.field8388 = 1.3375598F;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIIIIB[I)Lgq;")
    public abstract class305 method1169(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int[] arg6);

    @OriginalMember(owner = "client!re", name = "t", descriptor = "()Z")
    public final boolean method966() {
        ++field8242;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "B", descriptor = "()Z")
    public final boolean method990() {
        ++field8180;
        return this.field8337;
    }

    @OriginalMember(owner = "client!re", name = "j", descriptor = "()Z")
    public final boolean method937() {
        ++field8193;
        return false;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[[IIZ)Lmca;")
    public abstract class5 method1200(int arg0, int[][] arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!re", name = "P", descriptor = "(I)V")
    private final void method3332(int arg0) {
        if (this.field8325 != null) {
            this.field8325.method2174(1406);
        }
        ++field8196;
        if (arg0 != 0) {
            this.field8397 = true;
        }
        this.method1203((byte) -117);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
    public final int method921(int arg0, int arg1) {
        ++field8162;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(ZB)V")
    public final void method3333(boolean arg0, byte arg1) {
        ++field8158;
        int var3 = 29 / ((-36 - arg1) / 53);
        if (this.field8395 != arg0) {
            this.field8395 = arg0;
            this.method1211(22488);
            this.field8379 &= -8;
        }
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(II)V")
    public final void method3334(int arg0, int arg1) {
        if (~this.field8333 != ~arg1) {
            this.field8333 = arg1;
            this.method1183(-886);
        }
        ++field8226;
        if (arg0 != 8) {
            this.field8308 = -0.6515315F;
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(Z)V")
    private final void method3335(boolean arg0) {
        if (!arg0) {
            this.method1153(-43);
        }
        if (!this.field8338) {
            float[] var2 = this.field8364;
            float var3 = (float) this.field8393 + -this.field8327;
            float var4 = (float) this.field8374 - this.field8327;
            float var5 = (float) (-this.field8373) * this.field8313 / (float) this.field8330;
            float var6 = (float) (-this.field8353) * this.field8313 / (float) this.field8350;
            float var7 = (float) (-this.field8353 + this.field8219) * this.field8313 / (float) this.field8350;
            float var8 = (float) (-this.field8373 + this.field8249) * this.field8313 / (float) this.field8330;
            if (var6 != var7 && var5 != var8) {
                var2[8] = 0.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[14] = var3 / (-var4 + var3);
                var2[0] = 2.0F / (var7 - var6);
                var2[1] = 0.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[13] = (var5 + var8) / (-var5 + var8);
            } else {
                var2[12] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[8] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method3315(-83);
            this.field8338 = true;
        }
        ++field8221;
    }

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "(I)V")
    public abstract void method1175(int arg0);

    @OriginalMember(owner = "client!re", name = "R", descriptor = "(I)V")
    public abstract void method1182(int arg0);

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(IIIIII)V")
    public final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8170;
        this.method3309(0);
        this.method3334(8, arg4);
        this.method3300(true, 0, class320.field4434);
        this.method3307(class320.field4434, 0, 16711680);
        this.method3343(arg5, 0);
        this.field8292.method1138(0, (float) arg3, (float) arg2, 1.0F);
        this.field8292.method365(arg0, arg1, 0);
        this.method3336((byte) 92);
        this.method1185(false, 6420);
        this.method3317(1);
        this.method1185(true, 6420);
        this.method3307(class93.field1233, 0, 16711680);
        this.method3300(true, 0, class93.field1233);
    }

    @OriginalMember(owner = "client!re", name = "o", descriptor = "(B)V")
    public final void method3336(byte arg0) {
        this.field8289 = false;
        ++field8265;
        if (arg0 <= 47) {
            this.field8360 = 28;
        }
        this.method3354(0);
    }

    @OriginalMember(owner = "client!re", name = "p", descriptor = "(B)V")
    public final void method3337(byte arg0) {
        if (~this.field8379 != -9) {
            this.method3351(113);
            this.method3320(-32, true);
            this.method3330(true, (byte) -111);
            this.method3284(true, 48);
            this.method3343(1, 0);
            this.field8379 = 8;
        }
        if (arg0 > 95) {
            ++field8264;
        }
    }

    @OriginalMember(owner = "client!re", name = "S", descriptor = "(I)V")
    public abstract void method1166(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method918(Canvas arg0) {
        ++field8114;
        if (this.field8270 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8157.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1165(true, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field8157.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "u", descriptor = "()Z")
    public final boolean method970() {
        ++field8190;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "T", descriptor = "(I)V")
    public void method1184(int arg0) {
        this.method3353((byte) -103);
        ++field8207;
        if (arg0 != 0) {
            this.method1186(73);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lbe;III)V")
    public abstract void method1208(class189 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!re", name = "v", descriptor = "()Z")
    public final boolean method975() {
        ++field8201;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IFFFFFF)Z")
    private final boolean method3338(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        int var8 = 51 / ((arg0 - 62) / 32);
        ++field8251;
        Buffer var9 = this.field8408.method297((byte) 52, true);
        if (var9 == null) {
            return false;
        } else {
            Stream var10 = this.method3287(-1, var9);
            if (!Stream.method3209()) {
                var10.method3206(arg5);
                var10.method3206(arg3);
                var10.method3206(arg6);
                var10.method3206(arg2);
                var10.method3206(arg1);
                var10.method3206(arg4);
            } else {
                var10.method3197(arg5);
                var10.method3197(arg3);
                var10.method3197(arg6);
                var10.method3197(arg2);
                var10.method3197(arg1);
                var10.method3197(arg4);
            }
            var10.method3207();
            return this.field8408.method290(22526);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V")
    public final void method3339(byte arg0, int arg1) {
        if (arg0 != 90) {
            this.field8331 = -0.9902508F;
        }
        ++field8198;
        if (~this.field8391 != ~arg1) {
            this.field8391 = arg1;
            this.method1180(arg0 ^ 90);
        }
    }

    @OriginalMember(owner = "client!re", name = "z", descriptor = "()Lm;")
    public final class105 method987() {
        ++field8267;
        return new class186();
    }

    @OriginalMember(owner = "client!re", name = "U", descriptor = "(I)[F")
    public final float[] method3340(int arg0) {
        ++field8182;
        if (arg0 > -86) {
            this.field8307 = -76;
        }
        return this.field8365;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(Z)V")
    private final void method3341(boolean arg0) {
        ++field8133;
        if (!arg0) {
            this.method1191(-16);
        }
        this.field8338 = false;
        if (class609.field8765 == this.field8347) {
            this.method3335(true);
            this.method3290(121);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[Lww;)V")
    public final void method972(int arg0, class592[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field8346[var3] = arg1[var3];
        }
        ++field8159;
        this.field8307 = arg0;
        if (this.field8347.method2260(-49)) {
            this.method1192((byte) 45);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
    public final void method983(boolean arg0) {
        this.field8335 = arg0;
        ++field8252;
        this.method1191(16725);
    }

    @OriginalMember(owner = "client!re", name = "V", descriptor = "(I)V")
    public abstract void method1155(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
    public final void method3342(boolean arg0, boolean arg1) {
        if (!arg1 == this.field8366) {
            this.field8366 = arg1;
            this.method1211(22488);
        }
        ++field8134;
        if (!arg0) {
            this.field8373 = 12;
        }
    }

    @OriginalMember(owner = "client!re", name = "q", descriptor = "(B)V")
    public abstract void method1196(byte arg0);

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(II)V")
    public final void method3343(int arg0, int arg1) {
        if (this.field8321 != arg0) {
            boolean var3;
            class491 var4;
            boolean var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = class6.field55;
                var5 = true;
            } else if (~arg0 == -3) {
                var5 = true;
                var3 = false;
                var4 = class198.field2596;
            } else if (arg0 == 128) {
                var3 = true;
                var5 = true;
                var4 = class504.field7015;
            } else {
                var5 = false;
                var4 = class117.field1480;
                var3 = false;
            }
            if (this.field8367 != var3) {
                this.field8367 = var3;
                this.method1153(118);
            }
            if (!var5 == this.field8349) {
                this.field8349 = var5;
                this.method1181((byte) -106);
            }
            if (this.field8301 != var4) {
                this.field8301 = var4;
                this.method1213(-117);
            }
            this.field8321 = arg0;
            this.field8379 &= -29;
        }
        ++field8210;
        if (arg1 != 0) {
            this.field8270 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILsw;)V")
    public final void method3344(int arg0, class11 arg1) {
        if (arg0 != 29639) {
            this.method995(-105, -45, -36, 105, 81, -10);
        }
        if (this.field8342[this.field8391] != arg1) {
            this.field8342[this.field8391] = arg1;
            if (arg1 != null) {
                arg1.method50(-23983);
            } else {
                this.method1196((byte) 72);
            }
            this.field8379 &= -2;
        }
        ++field8235;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BILuda;BIZI)Lgq;")
    public abstract class305 method1156(int arg0, byte[] arg1, int arg2, class509 arg3, byte arg4, int arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public final void method198(int arg0) {
        ++field8238;
    }

    @OriginalMember(owner = "client!re", name = "W", descriptor = "(I)V")
    private final void method3345(int arg0) {
        ++field8184;
        this.field8375 = false;
        if (this.field8325 != null) {
            this.field8325.method2173(arg0 + -101);
        }
        if (arg0 != 0) {
            this.field8320 = 93;
        }
        this.method1162(-113);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V")
    public final void method984(boolean arg0) {
        ++field8220;
    }

    @OriginalMember(owner = "client!re", name = "r", descriptor = "(B)Luw;")
    public final class186 method3346(byte arg0) {
        if (arg0 != 75) {
            this.field8380 = 1.1840804F;
        }
        ++field8280;
        return this.field8292;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLei;)V")
    public abstract void method1201(byte arg0, class331 arg1);

    @OriginalMember(owner = "client!re", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8125;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLsb;Luda;)Z")
    public abstract boolean method1170(byte arg0, class280 arg1, class509 arg2);

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public final void method194(int arg0) {
        ++field8277;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([FI)[F")
    public final float[] method3347(float[] arg0, int arg1) {
        arg0[4] = this.field8332[1];
        arg0[12] = this.field8332[3];
        ++field8197;
        arg0[0] = this.field8332[0];
        arg0[8] = this.field8332[2];
        arg0[5] = this.field8332[5];
        arg0[13] = this.field8332[7];
        arg0[9] = this.field8332[6];
        arg0[2] = this.field8332[8];
        arg0[1] = this.field8332[4];
        arg0[14] = this.field8332[11];
        if (arg1 > -98) {
            this.method964();
        }
        arg0[6] = this.field8332[9];
        arg0[10] = this.field8332[10];
        arg0[3] = this.field8332[12];
        arg0[7] = this.field8332[13];
        arg0[11] = this.field8332[14];
        arg0[15] = this.field8332[15];
        return arg0;
    }

    @OriginalMember(owner = "client!re", name = "la", descriptor = "(FF)V")
    public final void method926(float arg0, float arg1) {
        if (this.field8304 != arg0 || this.field8327 != arg1) {
            this.field8304 = arg0;
            this.field8327 = arg1;
            this.method3315(-85);
            this.method3362(9);
            this.method3341(true);
            this.method3352(18027);
        }
        ++field8117;
    }

    @OriginalMember(owner = "client!re", name = "X", descriptor = "(I)V")
    public final void method3348(int arg0) {
        ++field8131;
        if (arg0 == -2) {
            if (~this.field8379 != -3) {
                this.method3355((byte) -115);
                this.method3320(-32, false);
                this.method3333(false, (byte) -119);
                this.method3330(false, (byte) -127);
                this.method3284(false, 50);
                this.method3329(arg0 + -10051, false, false, -2);
                this.field8379 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "m", descriptor = "()V")
    public void method945() {
        ++field8179;
        if (!this.field8371) {
            for (class108 var1 = this.field8247.method3188((byte) -100); var1 != null; var1 = this.field8247.method3182((byte) -110)) {
                ((class301) var1).method1837(12);
            }
            Enumeration var2 = this.field8157.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1176(this.field8157.get(var3), var3, 93);
            }
            class111.method597(false, false, true);
            this.field8237.release();
            this.field8371 = true;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8217;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZLlg;)V")
    public abstract void method1154(int arg0, int arg1, boolean arg2, class32 arg3);

    @OriginalMember(owner = "client!re", name = "IA", descriptor = "(III[I)V")
    public final void method991(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8175;
        float var5 = this.field8296.method1147((float) arg1, (float) arg0, (float) arg2, false);
        if (!(var5 < (float) this.field8393) && !((float) this.field8374 < var5)) {
            int var6 = (int) ((float) this.field8350 * this.field8296.method1144((float) arg2, (float) arg0, (float) arg1, 1380) / var5);
            int var7 = (int) ((float) this.field8330 * this.field8296.method1129((float) arg0, (float) arg2, 2, (float) arg1) / var5);
            if ((float) var6 >= this.field8308 && (float) var6 <= this.field8369 && (float) var7 >= this.field8380 && (float) var7 <= this.field8392) {
                arg3[1] = (int) ((float) var7 + -this.field8380);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field8308);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "()Z")
    public final boolean method917() {
        ++field8259;
        return this.field8314[3].method467(4096);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BZ)Lbd;")
    public abstract class180 method1188(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZI[I)Lgq;")
    public final class305 method3349(int arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        ++field8185;
        if (arg0 >= -1) {
            this.method993(0.05584482F);
        }
        return this.method1169(arg2, arg1, 0, 0, arg3, (byte) -63, arg4);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Luda;B[BZII)Lgq;")
    public final class305 method3350(class509 arg0, byte arg1, byte[] arg2, boolean arg3, int arg4, int arg5) {
        ++field8206;
        if (arg1 >= -22) {
            this.field8388 = 1.4821751F;
        }
        return this.method1156(arg4, arg2, arg5, arg0, (byte) -115, 0, arg3, 0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([Lr;Lkw;Lm;[Leca;I)V")
    public final void method193(class521[] arg0, class174 arg1, class105 arg2, class378[] arg3, int arg4) {
        ++field8241;
        this.method202(arg0, arg2, arg3, arg4);
        this.method957(arg1);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)I")
    public final int method938(int arg0, int arg1) {
        ++field8195;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)Lu;")
    public final class425 method971(int arg0) {
        ++field8176;
        class301 var2 = new class301(arg0);
        this.field8247.method3181(var2, true);
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "(I)V")
    private final void method3351(int arg0) {
        if (arg0 <= 92) {
            this.field8338 = false;
        }
        ++field8279;
        if (class351.field4931 != this.field8347) {
            class368 var2 = this.field8347;
            this.field8347 = class351.field4931;
            if (!var2.method2260(-100)) {
                this.method3345(0);
            }
            this.method3302((byte) 115);
            this.field8332 = this.field8389;
            this.method3290(112);
            this.field8379 &= -8;
        }
    }

    @OriginalMember(owner = "client!re", name = "y", descriptor = "()V")
    public final void method978() {
        this.field8398.method2518(true);
        ++field8215;
    }

    @OriginalMember(owner = "client!re", name = "L", descriptor = "(I)V")
    public final void method973(int arg0) {
        ++field8156;
        this.field8357 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field8357;
        }
        this.field8320 = 1 << this.field8357;
    }

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "(I)V")
    private final void method3352(int arg0) {
        this.field8340 = false;
        ++field8152;
        this.method3302((byte) 123);
        if (arg0 == 18027) {
            if (class351.field4931 == this.field8347) {
                this.method3290(-87);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Llca;IB)V")
    public abstract void method1171(class133 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!re", name = "s", descriptor = "(B)V")
    private final void method3353(byte arg0) {
        this.method1202(140);
        ++field8282;
        this.method1187(-5477);
        this.method1211(22488);
        this.method1192((byte) 45);
        this.method1155(0);
        this.method1166(0);
        this.method1177(1);
        int var2 = 65 / ((-20 - arg0) / 59);
        this.method1160(-28988);
        this.method1191(16725);
        this.method1194(0);
        this.method1203((byte) -99);
        this.method1181((byte) 72);
        this.method1213(-107);
        this.method1153(92);
        for (int var3 = this.field8319 + -1; ~var3 <= -1; --var3) {
            this.method3339((byte) 90, var3);
            this.method1158(-118);
            this.method1189((byte) 97);
            this.method3323(0);
        }
        this.method1183(-886);
        this.method1186(10);
        this.method1175(7);
        this.method1172(128);
        this.method1162(-113);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method187(Canvas arg0) {
        ++field8112;
        Object var2 = null;
        if (arg0 != null && this.field8270 != arg0) {
            if (this.field8157.containsKey(arg0)) {
                var2 = this.field8157.get(arg0);
            }
        } else {
            var2 = this.field8273;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1152((byte) -12, arg0, var2);
            if (this.field8284 == arg0) {
                this.method3305(1);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method907(int arg0) {
        ++field8285;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field8394 = arg0;
            this.field8398.method2518(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "(I)V")
    private final void method3354(int arg0) {
        ++field8160;
        if (arg0 != 0) {
            this.field8298 = null;
        }
        if (class555.field7757 == this.field8347) {
            float var2 = this.method1163(false);
            this.field8292.method1146(var2, var2, 0.0F, 0);
        }
        this.field8375 = false;
        this.method1172(128);
        if (this.field8325 != null) {
            this.field8325.method2169((byte) 78);
        }
    }

    @OriginalMember(owner = "client!re", name = "t", descriptor = "(B)V")
    private final void method3355(byte arg0) {
        int var2 = -102 / ((-56 - arg0) / 32);
        ++field8258;
        if (class555.field7757 != this.field8347) {
            class368 var3 = this.field8347;
            this.field8347 = class555.field7757;
            if (var3.method2260(-26)) {
                this.method3345(0);
            }
            this.method3286(false);
            this.field8332 = this.field8358;
            this.method3290(104);
            this.field8379 &= -25;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lbe;Lbd;IIIII)V")
    public abstract void method1212(class189 arg0, class180 arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIF)Lww;")
    public final class592 method955(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8208;
        return new class193(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BB)V")
    public final void method3356(byte arg0, byte arg1) {
        int var3 = 48 % ((arg1 - 56) / 46);
        ++field8122;
        this.method3334(8, arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lfp;IIII)Lr;")
    public final class521 method197(class528 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8123;
        return new class351(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(IZ)Llca;")
    public abstract class133 method1197(int arg0, boolean arg1);

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(Z)F")
    public abstract float method1163(boolean arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z[FILuda;IIII)Lgq;")
    public abstract class305 method1205(boolean arg0, float[] arg1, int arg2, class509 arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!re", name = "G", descriptor = "(ILpa;II)V")
    public final void method930(int arg0, class594 arg1, int arg2, int arg3) {
        ++field8147;
        class78 var5 = (class78) arg1;
        class305 var6 = var5.field1061;
        this.method3348(-2);
        this.method3344(29639, var6);
        this.method3343(1, 0);
        this.method3316(class509.field7093, 35, class509.field7093);
        this.method3300(true, 0, class320.field4434);
        this.method3334(8, arg0);
        this.field8292.method1138(0, (float) this.field8249, (float) this.field8219, 0.0F);
        this.method3336((byte) 112);
        this.field8382[0].method1138(0, var6.method1051(-3008, (float) this.field8249), var6.method1053((byte) 3, (float) this.field8219), 1.0F);
        this.field8382[0].method1146(var6.method1051(-3008, (float) (-arg3)), var6.method1053((byte) 3, (float) (-arg2)), 0.0F, 0);
        this.field8386[0] = class620.field8928;
        this.method3303(false);
        this.method3317(1);
        this.method3323(0);
        this.method3300(true, 0, class93.field1233);
    }

    @OriginalMember(owner = "client!re", name = "r", descriptor = "()Z")
    public final boolean method963() {
        ++field8243;
        return false;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([Lug;B)Lkq;")
    public abstract class102 method1178(class410[] arg0, byte arg1);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(BZ)V")
    public final void method3357(byte arg0, boolean arg1) {
        int var3 = 98 % ((39 - arg0) / 42);
        ++field8188;
        if (!arg1 != !this.field8359) {
            this.field8359 = arg1;
            this.method1177(1);
        }
    }

    @OriginalMember(owner = "client!re", name = "u", descriptor = "(B)V")
    private final void method3358(byte arg0) {
        this.field8412 = this.method1197(10, false);
        ++field8110;
        this.field8412.method703(140, 11360, 28);
        if (arg0 != 96) {
            this.method3360(-44);
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field8412.method297((byte) 52, true);
            if (var3 != null) {
                Stream var4 = this.method3287(-1, var3);
                if (Stream.method3209()) {
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(1.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(1.0F);
                    var4.method3197(0.0F);
                    var4.method3197(1.0F);
                    var4.method3197(1.0F);
                    var4.method3197(1.0F);
                    var4.method3197(0.0F);
                    var4.method3197(1.0F);
                    var4.method3197(1.0F);
                    var4.method3197(1.0F);
                    var4.method3197(1.0F);
                    var4.method3197(1.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(1.0F);
                    var4.method3197(0.0F);
                    var4.method3197(1.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                    var4.method3197(0.0F);
                } else {
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(1.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(1.0F);
                    var4.method3206(0.0F);
                    var4.method3206(1.0F);
                    var4.method3206(1.0F);
                    var4.method3206(1.0F);
                    var4.method3206(0.0F);
                    var4.method3206(1.0F);
                    var4.method3206(1.0F);
                    var4.method3206(1.0F);
                    var4.method3206(1.0F);
                    var4.method3206(1.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(1.0F);
                    var4.method3206(0.0F);
                    var4.method3206(1.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                    var4.method3206(0.0F);
                }
                var4.method3207();
                if (this.field8412.method290(22526)) {
                    break;
                }
            }
        }
        this.field8414 = this.method1178(new class410[] { new class410(new class76[] { class76.field1031, class76.field1038, class76.field1038 }) }, (byte) -13);
    }

    @OriginalMember(owner = "client!re", name = "k", descriptor = "()Z")
    public final boolean method941() {
        ++field8204;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "A", descriptor = "(IIIII)V")
    public final void method952(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8191;
    }

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "(I)Lmca;")
    public final class5 method3359(int arg0) {
        ++field8135;
        int var2 = 84 / ((arg0 - 74) / 52);
        return this.field8354 == null ? null : this.field8354.method668(3);
    }

    @OriginalMember(owner = "client!re", name = "CA", descriptor = "()I")
    public final int method954() {
        ++field8256;
        return this.field8374;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()I")
    public final int method958() {
        ++field8287;
        return this.field8393;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Llg;ZZZI)V")
    public abstract void method1210(class32 arg0, boolean arg1, boolean arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8) {
        ++field8223;
    }

    @OriginalMember(owner = "client!re", name = "JA", descriptor = "(IIII)V")
    public final void method953(int arg0, int arg1, int arg2, int arg3) {
        ++field8144;
        if (!this.field8329) {
            throw new RuntimeException("");
        } else {
            if (this.field8318 != arg0) {
                this.field8318 = arg0;
                if (this.field8325 != null) {
                    this.field8325.method2168(121);
                }
            }
            this.field8326 = arg2;
            this.field8306 = arg1;
            this.field8390 = arg3;
            this.method3332(0);
        }
    }

    @OriginalMember(owner = "client!re", name = "db", descriptor = "(I)Luw;")
    public final class186 method3360(int arg0) {
        if (arg0 != -1) {
            return null;
        } else {
            ++field8121;
            return this.field8298;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([IIIII)Lha;")
    public final class116 method976(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8231;
        return new class235(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "(I)I")
    public final int method3361(int arg0) {
        ++field8268;
        return arg0 != 1000 ? 94 : this.field8391;
    }

    @OriginalMember(owner = "client!re", name = "xa", descriptor = "()V")
    public final void method933() {
        this.field8329 = false;
        ++field8227;
        this.method3298(false, 0, false, 0, 0, (byte) 122);
        this.method3332(0);
        this.method1194(0);
    }

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "(I)V")
    private final void method3362(int arg0) {
        ++field8276;
        if (arg0 == 9) {
            if (this.field8327 == 0.0F) {
                this.field8389[10] = this.field8336;
                this.field8389[14] = this.field8303;
            } else {
                float var2 = this.field8304 / (this.field8327 + this.field8304);
                float var3 = var2 * var2;
                float var4 = (1.0F - var2) * -this.field8303 * (1.0F - var2) / this.field8327;
                this.field8389[14] = this.field8303 * var3;
                this.field8389[10] = this.field8336 + var4;
            }
            this.field8331 = (this.field8389[14] + (float) (-this.field8374)) / this.field8389[10];
        }
    }

    @OriginalMember(owner = "client!re", name = "v", descriptor = "(B)V")
    public abstract void method1206(byte arg0);

    @OriginalMember(owner = "client!re", name = "UA", descriptor = "(IIIII)V")
    public final void method943(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method935(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
        ++field8272;
    }

    @OriginalMember(owner = "client!re", name = "w", descriptor = "(B)I")
    public final int method3363(byte arg0) {
        int var2 = -108 % ((-24 - arg0) / 43);
        ++field8143;
        return this.field8390;
    }
}
