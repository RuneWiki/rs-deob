import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class469 extends class562 {

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6198 = new Hashtable();

    @OriginalMember(owner = "client!ag", name = "Md", descriptor = "I")
    public int field6366 = 128;

    @OriginalMember(owner = "client!ag", name = "je", descriptor = "Llq;")
    private class9 field6389 = new class9();

    @OriginalMember(owner = "client!ag", name = "ke", descriptor = "Lofa;")
    private class62 field6390 = new class62();

    @OriginalMember(owner = "client!ag", name = "le", descriptor = "Lofa;")
    public class62 field6391 = new class62();

    @OriginalMember(owner = "client!ag", name = "qe", descriptor = "I")
    public int field6396 = 3;

    @OriginalMember(owner = "client!ag", name = "re", descriptor = "Z")
    private boolean field6397 = false;

    @OriginalMember(owner = "client!ag", name = "pe", descriptor = "I")
    public int field6395 = 8;

    @OriginalMember(owner = "client!ag", name = "me", descriptor = "Lwo;")
    private class445 field6392 = new class445();

    @OriginalMember(owner = "client!ag", name = "ue", descriptor = "I")
    private int field6400 = -1;

    @OriginalMember(owner = "client!ag", name = "ve", descriptor = "[Lna;")
    private class345[] field6401 = new class345[4];

    @OriginalMember(owner = "client!ag", name = "we", descriptor = "[Lna;")
    private class345[] field6402 = new class345[4];

    @OriginalMember(owner = "client!ag", name = "Ae", descriptor = "I")
    private int field6406 = -1;

    @OriginalMember(owner = "client!ag", name = "ze", descriptor = "[Lna;")
    private class345[] field6405 = new class345[4];

    @OriginalMember(owner = "client!ag", name = "Ce", descriptor = "I")
    private int field6408 = -1;

    @OriginalMember(owner = "client!ag", name = "De", descriptor = "Lgfa;")
    private class150 field6409 = new class150();

    @OriginalMember(owner = "client!ag", name = "Ee", descriptor = "Lwh;")
    private class546 field6410 = new class546(16);

    @OriginalMember(owner = "client!ag", name = "Ge", descriptor = "Lwo;")
    private class445 field6412 = new class445();

    @OriginalMember(owner = "client!ag", name = "Ke", descriptor = "Lwo;")
    private class445 field6416 = new class445();

    @OriginalMember(owner = "client!ag", name = "Le", descriptor = "Lwo;")
    private class445 field6417 = new class445();

    @OriginalMember(owner = "client!ag", name = "Me", descriptor = "Lwo;")
    private class445 field6418 = new class445();

    @OriginalMember(owner = "client!ag", name = "Ne", descriptor = "Lwo;")
    private class445 field6419 = new class445();

    @OriginalMember(owner = "client!ag", name = "Oe", descriptor = "Lwo;")
    private class445 field6420 = new class445();

    @OriginalMember(owner = "client!ag", name = "Pe", descriptor = "Lwo;")
    private class445 field6421 = new class445();

    @OriginalMember(owner = "client!ag", name = "We", descriptor = "Lofa;")
    public class62 field6428 = new class62();

    @OriginalMember(owner = "client!ag", name = "Ze", descriptor = "Lofa;")
    public class62 field6431 = new class62();

    @OriginalMember(owner = "client!ag", name = "af", descriptor = "Lofa;")
    public class62 field6432 = new class62();

    @OriginalMember(owner = "client!ag", name = "jf", descriptor = "I")
    public int field6440 = 50;

    @OriginalMember(owner = "client!ag", name = "lf", descriptor = "[F")
    private float[] field6442 = new float[4];

    @OriginalMember(owner = "client!ag", name = "hf", descriptor = "F")
    public float field6439 = 1.0F;

    @OriginalMember(owner = "client!ag", name = "Tf", descriptor = "F")
    public float field6476 = 3584.0F;

    @OriginalMember(owner = "client!ag", name = "ef", descriptor = "I")
    public int field6436 = -1;

    @OriginalMember(owner = "client!ag", name = "Qf", descriptor = "F")
    private float field6473 = 1.0F;

    @OriginalMember(owner = "client!ag", name = "yf", descriptor = "F")
    private float field6455 = -1.0F;

    @OriginalMember(owner = "client!ag", name = "gg", descriptor = "I")
    private int field6489 = 8448;

    @OriginalMember(owner = "client!ag", name = "fg", descriptor = "I")
    public int field6488 = 0;

    @OriginalMember(owner = "client!ag", name = "Of", descriptor = "[F")
    private float[] field6471 = new float[16];

    @OriginalMember(owner = "client!ag", name = "Vf", descriptor = "F")
    private float field6478 = -1.0F;

    @OriginalMember(owner = "client!ag", name = "Yf", descriptor = "I")
    private int field6481 = 0;

    @OriginalMember(owner = "client!ag", name = "zf", descriptor = "I")
    private int field6456 = 0;

    @OriginalMember(owner = "client!ag", name = "Hf", descriptor = "I")
    private int field6464 = 0;

    @OriginalMember(owner = "client!ag", name = "kg", descriptor = "[Lqea;")
    private class392[] field6493 = new class392[class484.field6730];

    @OriginalMember(owner = "client!ag", name = "rf", descriptor = "[F")
    public float[] field6448 = new float[4];

    @OriginalMember(owner = "client!ag", name = "rg", descriptor = "I")
    public int field6500 = 512;

    @OriginalMember(owner = "client!ag", name = "ng", descriptor = "[F")
    private float[] field6496 = new float[4];

    @OriginalMember(owner = "client!ag", name = "sg", descriptor = "F")
    public float field6501 = 3584.0F;

    @OriginalMember(owner = "client!ag", name = "ig", descriptor = "I")
    public int field6491 = -1;

    @OriginalMember(owner = "client!ag", name = "pg", descriptor = "F")
    public float field6498 = 1.0F;

    @OriginalMember(owner = "client!ag", name = "ff", descriptor = "I")
    public int field6437 = 0;

    @OriginalMember(owner = "client!ag", name = "Nf", descriptor = "Z")
    private boolean field6470 = true;

    @OriginalMember(owner = "client!ag", name = "mg", descriptor = "I")
    public int field6495 = 0;

    @OriginalMember(owner = "client!ag", name = "uf", descriptor = "I")
    public int field6451 = 512;

    @OriginalMember(owner = "client!ag", name = "zg", descriptor = "I")
    public int field6508 = 0;

    @OriginalMember(owner = "client!ag", name = "Lf", descriptor = "F")
    private float field6468 = 1.0F;

    @OriginalMember(owner = "client!ag", name = "Ag", descriptor = "I")
    public int field6509 = -1;

    @OriginalMember(owner = "client!ag", name = "Kg", descriptor = "I")
    public int field6519 = -1;

    @OriginalMember(owner = "client!ag", name = "Bg", descriptor = "F")
    public float field6510 = -1.0F;

    @OriginalMember(owner = "client!ag", name = "Rf", descriptor = "I")
    private int field6474 = 3584;

    @OriginalMember(owner = "client!ag", name = "Gg", descriptor = "I")
    private int field6515 = 0;

    @OriginalMember(owner = "client!ag", name = "Jg", descriptor = "[F")
    private float[] field6518 = new float[4];

    @OriginalMember(owner = "client!ag", name = "ch", descriptor = "I")
    private int field6537 = 8448;

    @OriginalMember(owner = "client!ag", name = "vg", descriptor = "F")
    public float field6504 = -1.0F;

    @OriginalMember(owner = "client!ag", name = "Hg", descriptor = "I")
    private int field6516 = 0;

    @OriginalMember(owner = "client!ag", name = "lg", descriptor = "F")
    public float field6494 = 1.0F;

    @OriginalMember(owner = "client!ag", name = "gh", descriptor = "I")
    private int field6541 = 0;

    @OriginalMember(owner = "client!ag", name = "Wg", descriptor = "F")
    private float field6531 = 0.0F;

    @OriginalMember(owner = "client!ag", name = "Sg", descriptor = "I")
    private int field6527 = -1;

    @OriginalMember(owner = "client!ag", name = "hh", descriptor = "Z")
    private boolean field6542 = false;

    @OriginalMember(owner = "client!ag", name = "Og", descriptor = "Lkv;")
    public class210 field6523 = new class210(8192);

    @OriginalMember(owner = "client!ag", name = "ih", descriptor = "[I")
    public int[] field6543 = new int[1];

    @OriginalMember(owner = "client!ag", name = "kh", descriptor = "[I")
    public int[] field6545 = new int[1];

    @OriginalMember(owner = "client!ag", name = "lh", descriptor = "[B")
    public byte[] field6546 = new byte[16384];

    @OriginalMember(owner = "client!ag", name = "nh", descriptor = "[I")
    public int[] field6548 = new int[1];

    @OriginalMember(owner = "client!ag", name = "ge", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6224;

    @OriginalMember(owner = "client!ag", name = "Ob", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6264;

    @OriginalMember(owner = "client!ag", name = "Pc", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field6317;

    @OriginalMember(owner = "client!ag", name = "qd", descriptor = "J")
    private long field6344;

    @OriginalMember(owner = "client!ag", name = "Bc", descriptor = "J")
    private long field6303;

    @OriginalMember(owner = "client!ag", name = "Jf", descriptor = "Z")
    public boolean field6466;

    @OriginalMember(owner = "client!ag", name = "Df", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!ag", name = "Qg", descriptor = "Ljava/lang/String;")
    private String field6525;

    @OriginalMember(owner = "client!ag", name = "ag", descriptor = "Z")
    public boolean field6483;

    @OriginalMember(owner = "client!ag", name = "Pg", descriptor = "Z")
    public boolean field6524;

    @OriginalMember(owner = "client!ag", name = "Sf", descriptor = "Z")
    private boolean field6475;

    @OriginalMember(owner = "client!ag", name = "Cf", descriptor = "Z")
    public boolean field6459;

    @OriginalMember(owner = "client!ag", name = "df", descriptor = "Z")
    public boolean field6435;

    @OriginalMember(owner = "client!ag", name = "Pf", descriptor = "Z")
    private boolean field6472;

    @OriginalMember(owner = "client!ag", name = "tf", descriptor = "Ljava/lang/String;")
    private String field6450;

    @OriginalMember(owner = "client!ag", name = "yg", descriptor = "Z")
    public boolean field6507;

    @OriginalMember(owner = "client!ag", name = "dh", descriptor = "Z")
    private boolean field6538;

    @OriginalMember(owner = "client!ag", name = "he", descriptor = "Lmfa;")
    private class572 field6387;

    @OriginalMember(owner = "client!ag", name = "oe", descriptor = "Lwm;")
    public class630 field6394;

    @OriginalMember(owner = "client!ag", name = "Wd", descriptor = "Loh;")
    private class598 field6376;

    @OriginalMember(owner = "client!ag", name = "ce", descriptor = "Lsq;")
    private class482 field6382;

    @OriginalMember(owner = "client!ag", name = "Hd", descriptor = "Lqk;")
    private class12 field6361;

    @OriginalMember(owner = "client!ag", name = "cc", descriptor = "I")
    public static int field6278 = 0;

    @OriginalMember(owner = "client!ag", name = "uc", descriptor = "Lwo;")
    public static class445 field6296 = new class445();

    @OriginalMember(owner = "client!ag", name = "ed", descriptor = "Ltt;")
    public static class338 field6332 = new class338(75, 6);

    @OriginalMember(owner = "client!ag", name = "nf", descriptor = "F")
    public float field6444;

    @OriginalMember(owner = "client!ag", name = "of", descriptor = "F")
    private float field6445;

    @OriginalMember(owner = "client!ag", name = "Kf", descriptor = "F")
    public float field6467;

    @OriginalMember(owner = "client!ag", name = "Wf", descriptor = "F")
    public float field6479;

    @OriginalMember(owner = "client!ag", name = "hg", descriptor = "F")
    private float field6490;

    @OriginalMember(owner = "client!ag", name = "og", descriptor = "F")
    public float field6497;

    @OriginalMember(owner = "client!ag", name = "qg", descriptor = "F")
    public float field6499;

    @OriginalMember(owner = "client!ag", name = "tg", descriptor = "F")
    private float field6502;

    @OriginalMember(owner = "client!ag", name = "bh", descriptor = "F")
    public float field6536;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public int field6213;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!ag", name = "mb", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!ag", name = "nb", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!ag", name = "ob", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!ag", name = "pb", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!ag", name = "qb", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!ag", name = "rb", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!ag", name = "sb", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!ag", name = "tb", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!ag", name = "ub", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!ag", name = "vb", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!ag", name = "wb", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ag", name = "xb", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!ag", name = "yb", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!ag", name = "zb", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!ag", name = "Ab", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!ag", name = "Bb", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!ag", name = "Cb", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!ag", name = "Db", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!ag", name = "Eb", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!ag", name = "Fb", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!ag", name = "Gb", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!ag", name = "Hb", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!ag", name = "Ib", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!ag", name = "Jb", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!ag", name = "Kb", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!ag", name = "Lb", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!ag", name = "Mb", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!ag", name = "Nb", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ag", name = "Pb", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ag", name = "Qb", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ag", name = "Rb", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!ag", name = "Sb", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!ag", name = "Tb", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ag", name = "Ub", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!ag", name = "Vb", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!ag", name = "Wb", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!ag", name = "Xb", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!ag", name = "Yb", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!ag", name = "Zb", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!ag", name = "ac", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!ag", name = "bc", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ag", name = "dc", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!ag", name = "ec", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!ag", name = "fc", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ag", name = "gc", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!ag", name = "hc", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!ag", name = "ic", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ag", name = "jc", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!ag", name = "kc", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!ag", name = "lc", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!ag", name = "mc", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!ag", name = "nc", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!ag", name = "oc", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!ag", name = "pc", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ag", name = "qc", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ag", name = "rc", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!ag", name = "sc", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!ag", name = "tc", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!ag", name = "vc", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ag", name = "wc", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!ag", name = "xc", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!ag", name = "yc", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!ag", name = "zc", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!ag", name = "Ac", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!ag", name = "Cc", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!ag", name = "Dc", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!ag", name = "Ec", descriptor = "I")
    private int field6306;

    @OriginalMember(owner = "client!ag", name = "Fc", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!ag", name = "Gc", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!ag", name = "Hc", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!ag", name = "Ic", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!ag", name = "Jc", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!ag", name = "Kc", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!ag", name = "Lc", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!ag", name = "Mc", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ag", name = "Nc", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!ag", name = "Oc", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ag", name = "Qc", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!ag", name = "Rc", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!ag", name = "Sc", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ag", name = "Tc", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!ag", name = "Uc", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!ag", name = "Vc", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!ag", name = "Wc", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!ag", name = "Xc", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!ag", name = "Yc", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!ag", name = "Zc", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!ag", name = "ad", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!ag", name = "bd", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!ag", name = "cd", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!ag", name = "dd", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!ag", name = "fd", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!ag", name = "gd", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!ag", name = "hd", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!ag", name = "id", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!ag", name = "jd", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!ag", name = "kd", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!ag", name = "ld", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!ag", name = "md", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!ag", name = "nd", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!ag", name = "od", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!ag", name = "pd", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!ag", name = "rd", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ag", name = "sd", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!ag", name = "td", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!ag", name = "ud", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!ag", name = "vd", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!ag", name = "wd", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!ag", name = "xd", descriptor = "I")
    private int field6351;

    @OriginalMember(owner = "client!ag", name = "yd", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!ag", name = "zd", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!ag", name = "Ad", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!ag", name = "Bd", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!ag", name = "Cd", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!ag", name = "Dd", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!ag", name = "Ed", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!ag", name = "Fd", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!ag", name = "Gd", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!ag", name = "Id", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!ag", name = "Jd", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!ag", name = "Kd", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!ag", name = "Ld", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!ag", name = "Nd", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!ag", name = "Od", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!ag", name = "Pd", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!ag", name = "Qd", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!ag", name = "Rd", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!ag", name = "Sd", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!ag", name = "Td", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!ag", name = "Ud", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!ag", name = "Vd", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!ag", name = "Xd", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!ag", name = "Yd", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!ag", name = "Zd", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!ag", name = "ae", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!ag", name = "be", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!ag", name = "de", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!ag", name = "ee", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!ag", name = "fe", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!ag", name = "ie", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!ag", name = "ne", descriptor = "I")
    public int field6393;

    @OriginalMember(owner = "client!ag", name = "Fe", descriptor = "I")
    private int field6411;

    @OriginalMember(owner = "client!ag", name = "He", descriptor = "I")
    public int field6413;

    @OriginalMember(owner = "client!ag", name = "Ie", descriptor = "I")
    public int field6414;

    @OriginalMember(owner = "client!ag", name = "Je", descriptor = "I")
    private int field6415;

    @OriginalMember(owner = "client!ag", name = "Re", descriptor = "I")
    private int field6423;

    @OriginalMember(owner = "client!ag", name = "Se", descriptor = "I")
    private int field6424;

    @OriginalMember(owner = "client!ag", name = "Te", descriptor = "I")
    private int field6425;

    @OriginalMember(owner = "client!ag", name = "bf", descriptor = "I")
    private int field6433;

    @OriginalMember(owner = "client!ag", name = "qf", descriptor = "I")
    private int field6447;

    @OriginalMember(owner = "client!ag", name = "wf", descriptor = "I")
    private int field6453;

    @OriginalMember(owner = "client!ag", name = "Bf", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!ag", name = "If", descriptor = "I")
    private int field6465;

    @OriginalMember(owner = "client!ag", name = "ug", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!ag", name = "Dg", descriptor = "I")
    private int field6512;

    @OriginalMember(owner = "client!ag", name = "Eg", descriptor = "I")
    public int field6513;

    @OriginalMember(owner = "client!ag", name = "Ng", descriptor = "I")
    private int field6522;

    @OriginalMember(owner = "client!ag", name = "Rg", descriptor = "I")
    public int field6526;

    @OriginalMember(owner = "client!ag", name = "Vg", descriptor = "I")
    private int field6530;

    @OriginalMember(owner = "client!ag", name = "eh", descriptor = "I")
    private int field6539;

    @OriginalMember(owner = "client!ag", name = "jh", descriptor = "I")
    private int field6544;

    @OriginalMember(owner = "client!ag", name = "mh", descriptor = "I")
    private int field6547;

    @OriginalMember(owner = "client!ag", name = "Ve", descriptor = "J")
    private long field6427;

    @OriginalMember(owner = "client!ag", name = "cf", descriptor = "Lvp;")
    public class111 field6434;

    @OriginalMember(owner = "client!ag", name = "kf", descriptor = "Lvp;")
    public class111 field6441;

    @OriginalMember(owner = "client!ag", name = "mf", descriptor = "Lvp;")
    public class111 field6443;

    @OriginalMember(owner = "client!ag", name = "sf", descriptor = "Lvp;")
    public class111 field6449;

    @OriginalMember(owner = "client!ag", name = "cg", descriptor = "Lvp;")
    public class111 field6485;

    @OriginalMember(owner = "client!ag", name = "wg", descriptor = "Lvp;")
    public class111 field6505;

    @OriginalMember(owner = "client!ag", name = "Cg", descriptor = "Lvp;")
    public class111 field6511;

    @OriginalMember(owner = "client!ag", name = "Lg", descriptor = "Lvp;")
    public class111 field6520;

    @OriginalMember(owner = "client!ag", name = "Tg", descriptor = "Lvp;")
    public class111 field6528;

    @OriginalMember(owner = "client!ag", name = "Ug", descriptor = "Lvp;")
    public class111 field6529;

    @OriginalMember(owner = "client!ag", name = "xe", descriptor = "Laf;")
    private class162 field6403;

    @OriginalMember(owner = "client!ag", name = "Mf", descriptor = "Lfe;")
    public class199 field6469;

    @OriginalMember(owner = "client!ag", name = "ah", descriptor = "Lfe;")
    public class199 field6535;

    @OriginalMember(owner = "client!ag", name = "Ef", descriptor = "Lvh;")
    private class265 field6461;

    @OriginalMember(owner = "client!ag", name = "Fg", descriptor = "Lvl;")
    private class326 field6514;

    @OriginalMember(owner = "client!ag", name = "te", descriptor = "Lna;")
    private class345 field6399;

    @OriginalMember(owner = "client!ag", name = "Be", descriptor = "Lna;")
    private class345 field6407;

    @OriginalMember(owner = "client!ag", name = "Xf", descriptor = "Ldga;")
    public class441 field6480;

    @OriginalMember(owner = "client!ag", name = "bg", descriptor = "Lcw;")
    private class511 field6484;

    @OriginalMember(owner = "client!ag", name = "Ig", descriptor = "Lcw;")
    private class511 field6517;

    @OriginalMember(owner = "client!ag", name = "ye", descriptor = "Liu;")
    private class560 field6404;

    @OriginalMember(owner = "client!ag", name = "Zg", descriptor = "Liu;")
    public class560 field6534;

    @OriginalMember(owner = "client!ag", name = "vf", descriptor = "Lck;")
    private class8 field6452;

    @OriginalMember(owner = "client!ag", name = "se", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6398;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ag", name = "oh", descriptor = "Ljava/lang/Class;")
    public static Class field6549;

    @OriginalMember(owner = "client!ag", name = "Qe", descriptor = "Z")
    private boolean field6422;

    @OriginalMember(owner = "client!ag", name = "Ue", descriptor = "Z")
    private boolean field6426;

    @OriginalMember(owner = "client!ag", name = "Xe", descriptor = "Z")
    private boolean field6429;

    @OriginalMember(owner = "client!ag", name = "Ye", descriptor = "Z")
    private boolean field6430;

    @OriginalMember(owner = "client!ag", name = "gf", descriptor = "Z")
    private boolean field6438;

    @OriginalMember(owner = "client!ag", name = "pf", descriptor = "Z")
    public boolean field6446;

    @OriginalMember(owner = "client!ag", name = "xf", descriptor = "Z")
    public boolean field6454;

    @OriginalMember(owner = "client!ag", name = "Af", descriptor = "Z")
    public boolean field6457;

    @OriginalMember(owner = "client!ag", name = "Ff", descriptor = "Z")
    public boolean field6462;

    @OriginalMember(owner = "client!ag", name = "Uf", descriptor = "Z")
    private boolean field6477;

    @OriginalMember(owner = "client!ag", name = "Zf", descriptor = "Z")
    public boolean field6482;

    @OriginalMember(owner = "client!ag", name = "dg", descriptor = "Z")
    private boolean field6486;

    @OriginalMember(owner = "client!ag", name = "eg", descriptor = "Z")
    private boolean field6487;

    @OriginalMember(owner = "client!ag", name = "jg", descriptor = "Z")
    public boolean field6492;

    @OriginalMember(owner = "client!ag", name = "xg", descriptor = "Z")
    public boolean field6506;

    @OriginalMember(owner = "client!ag", name = "Mg", descriptor = "Z")
    private boolean field6521;

    @OriginalMember(owner = "client!ag", name = "Xg", descriptor = "Z")
    private boolean field6532;

    @OriginalMember(owner = "client!ag", name = "Yg", descriptor = "Z")
    private boolean field6533;

    @OriginalMember(owner = "client!ag", name = "fh", descriptor = "Z")
    public boolean field6540;

    @OriginalMember(owner = "client!ag", name = "Gf", descriptor = "[Lvfa;")
    private class262[] field6463;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2704(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLna;)V", line = 3)
    public final void method2621(byte arg0, class345 arg1) {
        ++field6284;
        if (!this.field6457) {
            if (~this.field6408 > -1 || this.field6401[this.field6408] != arg1) {
                throw new RuntimeException();
            }
            this.field6401[this.field6408--] = null;
            arg1.method2057(-127);
            if (this.field6408 < 0) {
                this.field6399 = this.field6407 = null;
            } else {
                this.field6399 = this.field6407 = this.field6401[this.field6408];
                this.field6399.method2056((byte) 106);
            }
        } else {
            this.method2645(31285, arg1);
            this.method2695(arg1, 102);
        }
        int var3 = -37 / ((17 - arg0) / 47);
    }

    @OriginalMember(owner = "client!ag", name = "pa", descriptor = "(III)V", line = 37)
    public final void method1073(int arg0, int arg1, int arg2) {
        ++field6319;
        if (this.field6436 != arg0 || ~this.field6509 != ~arg1 || this.field6437 != arg2) {
            this.field6437 = arg2;
            this.field6509 = arg1;
            this.field6436 = arg0;
            this.method2701(1);
            this.method2684(-25359);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V", line = 55)
    public final synchronized void method2622(byte arg0, int arg1, int arg2) {
        ++field6360;
        class37 var4 = new class37(arg2);
        var4.field545 = (long) arg1;
        this.field6419.method2507(var4, (byte) -128);
        if (arg0 != -78) {
            this.field6513 = -104;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 69)
    public final void method1126(Canvas arg0) {
        ++field6242;
        if (this.field6224 == arg0) {
            throw new RuntimeException();
        } else if (this.field6198.containsKey(arg0)) {
            Long var2 = (Long) this.field6198.get(arg0);
            this.field6317.releaseSurface(arg0, var2);
            this.field6198.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BLna;)V", line = 90)
    public final void method2623(byte arg0, class345 arg1) {
        ++field6239;
        if (this.field6400 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field6400 <= -1) {
                this.field6402[this.field6400].method2055(false);
            }
            this.field6399 = this.field6402[++this.field6400] = arg1;
            this.field6399.method2059(115);
            int var3 = -22 % ((arg0 - -31) / 35);
        }
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "()Z", line = 108)
    public final boolean method1099() {
        ++field6339;
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)V", line = 116)
    public final void method2624(byte arg0, int arg1) {
        class113.field1444[3] = (float) (arg1 >>> 24) / 255.0F;
        class113.field1444[1] = (float) class15.method97(arg1, 65280) / 65280.0F;
        if (arg0 == 26) {
            ++field6347;
            class113.field1444[2] = (float) class15.method97(255, arg1) / 255.0F;
            class113.field1444[0] = (float) class15.method97(arg1, 16711680) / 1.671168E7F;
            OpenGL.glTexEnvfv(8960, 8705, class113.field1444, 0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([IIIII)Lf;", line = 132)
    public final class532 method1122(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6266;
        return new class162(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)V", line = 141)
    public final void method2625(int arg0, int arg1) {
        ++field6230;
        if (arg0 != 20296) {
            this.field6543 = null;
        }
        if (this.field6530 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field6530 = arg1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "oa", descriptor = "([I)V", line = 158)
    public final void method1057(int[] arg0) {
        ++field6293;
        arg0[0] = this.field6515;
        arg0[2] = this.field6464;
        arg0[3] = this.field6541;
        arg0[1] = this.field6481;
    }

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "()Z", line = 172)
    public final boolean method1100() {
        ++field6364;
        return this.field6382 != null && (this.field6386 <= 1 || this.field6477);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(IIIIII)Lit;", line = 180)
    public final class513 method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6245;
        return this.field6446 ? new class287(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ag", name = "CA", descriptor = "(IIII)V", line = 189)
    public final void method1072(int arg0, int arg1, int arg2, int arg3) {
        this.field6458 = arg0;
        this.field6491 = arg1;
        this.field6519 = arg2;
        this.field6488 = arg3;
        this.field6482 = true;
        ++field6286;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lec;)V", line = 205)
    public final void method1096(class144 arg0) {
        this.field6389.method48(this, arg0, -7224, -1);
        ++field6383;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(II)I", line = 215)
    public final int method2626(int arg0, int arg1) {
        ++field6323;
        if (arg0 != 6406 && arg0 != 6409) {
            if (arg0 != 6410 && arg0 != 34846 && arg0 != 34844) {
                if (~arg0 != -6408) {
                    if (arg0 != 6408 && arg0 != 34847) {
                        if (~arg0 != -34844) {
                            if (arg0 != 34842) {
                                if (~arg0 != -6403) {
                                    if (~arg0 == -6402) {
                                        return 1;
                                    } else if (arg1 != 6120) {
                                        return -46;
                                    } else {
                                        throw new IllegalArgumentException("");
                                    }
                                } else {
                                    return 3;
                                }
                            } else {
                                return 8;
                            }
                        } else {
                            return 6;
                        }
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lcca;IIII)Lda;", line = 258)
    public final class470 method1089(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6285;
        return new class111(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "(IIIIII)Z", line = 267)
    public final boolean method1083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6362;
        float var7 = (float) arg2 * this.field6428.field795 + (float) arg0 * this.field6428.field790 + (float) arg1 * this.field6428.field775 + this.field6428.field791;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field6428.field795 + (float) arg3 * this.field6428.field790 + (float) arg4 * this.field6428.field775 + this.field6428.field791;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field6440) || !(var8 < (float) this.field6440)) && (!((float) this.field6474 < var7) || !(var8 > (float) this.field6474))) {
            int var9 = (int) (((float) arg2 * this.field6428.field783 + (float) arg0 * this.field6428.field771 + (float) arg1 * this.field6428.field770 + this.field6428.field769) * (float) this.field6451 / var7);
            int var10 = (int) (((float) arg5 * this.field6428.field783 + (float) arg3 * this.field6428.field771 + (float) arg4 * this.field6428.field770 + this.field6428.field769) * (float) this.field6451 / var8);
            if ((float) var9 < this.field6479 && this.field6479 > (float) var10 || (float) var9 > this.field6467 && (float) var10 > this.field6467) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field6428.field789 + (float) arg0 * this.field6428.field772 + (float) arg1 * this.field6428.field767 + this.field6428.field792) * (float) this.field6500 / var7);
                int var12 = (int) (((float) arg5 * this.field6428.field789 + (float) arg3 * this.field6428.field772 + (float) arg4 * this.field6428.field767 + this.field6428.field792) * (float) this.field6500 / var8);
                return (!((float) var11 < this.field6536) || !((float) var12 < this.field6536)) && (!(this.field6444 < (float) var11) || !((float) var12 > this.field6444));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "()Z", line = 304)
    public final boolean method1112() {
        ++field6349;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILvfa;)V", line = 312)
    public final void method2627(int arg0, class262 arg1) {
        ++field6333;
        class262 var3 = this.field6463[this.field6530];
        if (arg0 <= 20) {
            this.field6500 = -81;
        }
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field3417);
                } else if (~arg1.field3417 != ~var3.field3417) {
                    OpenGL.glDisable(var3.field3417);
                    OpenGL.glEnable(arg1.field3417);
                }
                OpenGL.glBindTexture(arg1.field3417, arg1.method1574(-15592));
            } else {
                OpenGL.glDisable(var3.field3417);
            }
            this.field6463[this.field6530] = arg1;
        }
        this.field6424 &= -2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 353)
    public final void method1038(int arg0) {
        ++field6225;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V", line = 364)
    public final void method1081(int arg0) {
        ++field6195;
        this.method2698((byte) -98);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FI)V", line = 372)
    public final void method2628(float arg0, int arg1) {
        if (this.field6473 != arg0) {
            this.field6473 = arg0;
            if (this.field6512 == 3) {
                this.method2688((byte) 80);
            }
        }
        ++field6241;
        if (arg1 != 4) {
            this.method2696(-117);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 391)
    public final void method2629(byte arg0) {
        ++field6260;
        if (~this.field6424 != -3) {
            this.method2642((byte) -127);
            this.method2630(false, (byte) -88);
            this.method2703(false, 43);
            this.method2639(77, false);
            this.method2653(-108, false);
            this.method2693(-2, 15210);
            this.field6424 = 2;
        }
        if (arg0 >= -112) {
            this.method2628(-0.7644484F, -24);
        }
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "()V", line = 412)
    public final void method1114() {
        if (this.field6382 != null && this.field6382.method3423(-62)) {
            this.field6376.method3315(0, this.field6382);
            this.field6387.method3155(true);
        }
        ++field6363;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 432)
    public final void method1143(Canvas arg0) {
        ++field6357;
        this.field6264 = null;
        this.field6303 = 0L;
        if (arg0 != null && this.field6224 != arg0) {
            if (this.field6198.containsKey(arg0)) {
                Long var2 = (Long) this.field6198.get(arg0);
                this.field6303 = var2;
                this.field6264 = arg0;
            }
        } else {
            this.field6264 = this.field6224;
            this.field6303 = this.field6344;
        }
        if (this.field6264 != null && ~this.field6303 != -1L) {
            this.field6317.setSurface(this.field6303);
            this.method2649(3200);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZB)V", line = 468)
    public final void method2630(boolean arg0, byte arg1) {
        int var3 = -93 % ((arg1 - 34) / 42);
        ++field6356;
        if (this.field6533 == !arg0) {
            this.field6533 = arg0;
            this.method2684(-25359);
            this.field6424 &= -32;
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V", line = 484)
    public final synchronized void method1063(int arg0) {
        ++field6325;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field6416.method2499((byte) 116)) {
            class37 var12 = (class37) this.field6416.method2502((byte) -122);
            class138.field1875[var3++] = (int) var12.field545;
            this.field6413 -= var12.field505;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class138.field1875, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class138.field1875, 0);
            var3 = 0;
        }
        while (!this.field6417.method2499((byte) 103)) {
            class37 var11 = (class37) this.field6417.method2502((byte) -110);
            class138.field1875[var3++] = (int) var11.field545;
            this.field6414 -= var11.field505;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class138.field1875, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class138.field1875, 0);
            var3 = 0;
        }
        while (!this.field6418.method2499((byte) 98)) {
            class37 var10 = (class37) this.field6418.method2502((byte) 94);
            class138.field1875[var3++] = var10.field505;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class138.field1875, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class138.field1875, 0);
            var3 = 0;
        }
        while (!this.field6419.method2499((byte) 85)) {
            class37 var9 = (class37) this.field6419.method2502((byte) 95);
            class138.field1875[var3++] = (int) var9.field545;
            this.field6411 -= var9.field505;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class138.field1875, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class138.field1875, 0);
            boolean var4 = false;
        }
        while (!this.field6412.method2499((byte) 93)) {
            class37 var8 = (class37) this.field6412.method2502((byte) 58);
            OpenGL.glDeleteLists((int) var8.field545, var8.field505);
        }
        while (!this.field6420.method2499((byte) -12)) {
            class45 var7 = this.field6420.method2502((byte) -81);
            OpenGL.glDeleteProgramARB((int) var7.field545);
        }
        while (!this.field6421.method2499((byte) 116)) {
            class45 var6 = this.field6421.method2502((byte) -106);
            OpenGL.glDeleteObjectARB(var6.field545);
        }
        while (!this.field6412.method2499((byte) 84)) {
            class37 var5 = (class37) this.field6412.method2502((byte) 52);
            OpenGL.glDeleteLists((int) var5.field545, var5.field505);
        }
        this.field6387.method3156(5);
        if (~this.method1137() < -100663297 && ~class529.method2982((byte) -69) < ~(this.field6427 + 60000L)) {
            System.gc();
            this.field6427 = class529.method2982((byte) -69);
        }
        this.field6393 = var2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 650)
    public final synchronized void method2631(int arg0, int arg1, int arg2) {
        ++field6365;
        if (arg2 == 8448) {
            class37 var4 = new class37(arg1);
            var4.field545 = (long) arg0;
            this.field6416.method2507(var4, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lofa;B)V", line = 664)
    public final void method2632(class62 arg0, byte arg1) {
        ++field6289;
        OpenGL.glPushMatrix();
        if (arg1 > -27) {
            this.method1126((Canvas) null);
        }
        OpenGL.glMultMatrixf(arg0.method360(1), 0);
    }

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "()Z", line = 676)
    public final boolean method1117() {
        ++field6231;
        if (this.field6382 != null) {
            if (!this.field6382.method3423(-57)) {
                if (!this.field6376.method3311((byte) 104, this.field6382)) {
                    return false;
                }
                this.field6387.method3155(true);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFF)V", line = 704)
    public final void method1079(float arg0, float arg1, float arg2) {
        class482.field6702 = arg0;
        class52.field667 = arg2;
        class79.field931 = arg1;
        ++field6281;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(II)I", line = 717)
    public final int method2633(int arg0, int arg1) {
        if (arg0 != 2) {
            this.field6527 = -36;
        }
        ++field6328;
        if (arg1 != 1) {
            if (arg1 != 0) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            return 34023;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        return 260;
                    }
                } else {
                    return 34165;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "()[I", line = 757)
    public final int[] method1110() {
        ++field6256;
        return new int[] { this.field6495, this.field6508, this.field6451, this.field6500 };
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V", line = 766)
    public final void method2634(byte arg0) {
        ++field6336;
        if (arg0 >= -103) {
            this.method1135();
        }
        OpenGL.glLightfv(16384, 4611, this.field6448, 0);
        OpenGL.glLightfv(16385, 4611, this.field6496, 0);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V", line = 778)
    private final void method2635(byte arg0) {
        ++field6318;
        if (arg0 < -109) {
            OpenGL.glDepthMask(this.field6426 && this.field6470);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIII)V", line = 789)
    public final void method2636(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
        if (arg3 <= -88) {
            ++field6295;
            OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(IIII)V", line = 802)
    public final void method2637(int arg0, int arg1, int arg2, int arg3) {
        ++field6345;
        if (arg1 == -513) {
            OpenGL.glTexEnvi(8960, arg2 + 34184, arg3);
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V", line = 814)
    private final void method2638(int arg0) {
        if (this.field6487 && !this.field6438) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field6253;
        if (arg0 < 16) {
            this.field6483 = true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V", line = 829)
    public final void method2639(int arg0, boolean arg1) {
        if (!arg1 != !this.field6429) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field6424 &= -32;
            this.field6429 = arg1;
        }
        int var3 = 123 / ((-6 - arg0) / 38);
        ++field6235;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 850)
    public final void method1052(Canvas arg0) {
        ++field6219;
        long var2 = 0L;
        if (arg0 != null && this.field6224 != arg0) {
            if (this.field6198.containsKey(arg0)) {
                Long var4 = (Long) this.field6198.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field6344;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field6317.surfaceResized(var2);
            if (this.field6264 == arg0) {
                this.method2649(3200);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "(IIII)V", line = 881)
    public final void method1077(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6464 > arg2) {
            this.field6464 = arg2;
        }
        ++field6330;
        if (arg3 < this.field6541) {
            this.field6541 = arg3;
        }
        if (this.field6515 < arg0) {
            this.field6515 = arg0;
        }
        if (this.field6481 < arg1) {
            this.field6481 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method2700(-124);
        this.method2699(0);
    }

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "()V", line = 906)
    public final void method1050() {
        ++field6367;
        if (this.field6538 && this.field6213 > 0 && this.field6337 > 0) {
            int var1 = this.field6515;
            int var2 = this.field6464;
            int var3 = this.field6481;
            int var4 = this.field6541;
            this.method1044();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2678((byte) 3);
            this.method2630(false, (byte) 123);
            this.method2703(false, 78);
            this.method2639(43, false);
            this.method2653(-89, false);
            this.method2627(45, (class262) null);
            this.method2693(-2, 15210);
            this.method2650((byte) -46, 1);
            this.method2644(0, (byte) 79);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field6213, this.field6337, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1042(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(JI)V", line = 950)
    public final synchronized void method2640(long arg0, int arg1) {
        ++field6233;
        if (arg1 != 6) {
            this.method2647(17, true, 31, false);
        }
        class45 var4 = new class45();
        var4.field545 = arg0;
        this.field6421.method2507(var4, (byte) -122);
    }

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "()Z", line = 964)
    public final boolean method1071() {
        ++field6247;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lq;)V", line = 976)
    public final void method1123(class487 arg0) {
        ++field6251;
        this.field6428.method344(arg0);
        this.field6431.method344(this.field6428);
        this.field6431.method346(88418498);
        this.field6432.method353(2, this.field6431);
        if (~this.field6512 != -2) {
            this.method2689(34023);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V", line = 992)
    public final void method1093(boolean arg0) {
        ++field6316;
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V", line = 1003)
    public static void method2641(int arg0) {
        field6296 = null;
        field6332 = null;
        if (arg0 != 9054) {
            method2686((Class) null, -101, (String) null);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()Z", line = 1014)
    public final boolean method1074() {
        ++field6288;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V", line = 1025)
    private final void method2642(byte arg0) {
        ++field6314;
        if (arg0 == -127) {
            if (~this.field6512 != -2) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (this.field6213 > 0 && this.field6337 > 0) {
                    OpenGL.glOrtho(0.0D, (double) this.field6213, (double) this.field6337, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field6512 = 1;
                this.field6424 &= -25;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "JA", descriptor = "()V", line = 1051)
    public final void method1044() {
        this.field6515 = 0;
        this.field6541 = this.field6337;
        ++field6308;
        this.field6464 = this.field6213;
        this.field6481 = 0;
        OpenGL.glDisable(3089);
        this.method2700(-83);
    }

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "()V", line = 1066)
    public final void method1061() {
        this.field6376.method3318(62);
        ++field6277;
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "(I)V", line = 1077)
    private final void method2643(int arg0) {
        this.field6317.method3498();
        if (arg0 != -17733) {
            this.field6408 = -115;
        }
        ++field6312;
    }

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "()Z", line = 1089)
    public final boolean method1094() {
        ++field6346;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V", line = 1097)
    public final void method2644(int arg0, byte arg1) {
        if (arg1 != 79) {
            this.field6459 = true;
        }
        if (~this.field6423 != ~arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (arg0 == 2) {
                var5 = 2;
                var4 = false;
                var3 = true;
            } else if (~arg0 == -129) {
                var4 = true;
                var3 = true;
                var5 = 3;
            } else {
                var5 = 0;
                var3 = true;
                var4 = false;
            }
            if (!var3 != !this.field6430) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field6430 = var3;
            }
            if (!this.field6422 != !var4) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field6422 = var4;
            }
            if (this.field6425 != var5) {
                if (var5 != 1) {
                    if (~var5 != -3) {
                        if (~var5 != -4) {
                            OpenGL.glDisable(3042);
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field6425 = var5;
            }
            this.field6423 = arg0;
            this.field6424 &= -29;
        }
        ++field6384;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILna;)V", line = 1192)
    public final void method2645(int arg0, class345 arg1) {
        ++field6202;
        if (this.field6400 >= 0 && this.field6402[this.field6400] == arg1) {
            this.field6402[this.field6400--] = null;
            arg1.method2055(false);
            if (this.field6400 < 0) {
                this.field6399 = null;
            } else {
                this.field6399 = this.field6402[this.field6400];
                this.field6399.method2059(123);
            }
            if (arg0 != 31285) {
                this.field6492 = true;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I", line = 1216)
    public final int method1080(int arg0, int arg1) {
        ++field6324;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIZ)V", line = 1226)
    public final void method2646(int arg0, int arg1, boolean arg2) {
        ++field6259;
        this.method2647(arg0, true, arg1 ^ -3648, arg2);
        if (arg1 != -1) {
            this.method2676((class345) null, -38);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIZ)V", line = 1239)
    public final void method2647(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (this.field6465 != arg0 || !this.field6542 != !this.field6482) {
            class441 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field6482 ? 3 : 0;
            if (arg0 < 0) {
                this.method2661((byte) 15);
            } else {
                var5 = this.field6387.method3157(true, arg0);
                class105 var10 = super.field7682.method2959(arg2 + -3543, arg0);
                if (~var10.field1258 == -1 && var10.field1248 == 0) {
                    this.method2661((byte) 15);
                } else {
                    int var11 = !var10.field1260 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method2664((float) (this.field6393 % var12 * var10.field1258) / (float) var12, (byte) 81, (float) (this.field6393 % var12 * var10.field1248) / (float) var12, 0.0F);
                }
                if (!this.field6482) {
                    var8 = var10.field1259;
                    var7 = var10.field1246;
                    var9 = var10.field1255;
                }
                var6 = var10.field1257;
            }
            this.field6361.method76(127, arg3, var7, arg1, var8, var9);
            if (!this.field6361.method73((byte) 73, var5, var6)) {
                this.method2627(arg2 + -3523, var5);
                this.method2650((byte) -68, var6);
            }
            this.field6465 = arg0;
            this.field6542 = this.field6482;
        }
        if (arg2 != 3647) {
            this.method1150();
        }
        ++field6292;
        this.field6424 &= -8;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V", line = 1308)
    private final void method2648(byte arg0) {
        int var2 = -21 / ((arg0 - -25) / 52);
        ++field6375;
        if (this.field6512 != 3) {
            this.field6512 = 3;
            this.method2688((byte) 80);
            this.method2689(34023);
            this.field6424 &= -8;
        }
    }

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "()V", line = 1325)
    public final void method1150() {
        ++field6193;
        if (!this.field6507) {
            if (!this.field6521) {
                throw new RuntimeException("");
            }
            this.field6403.method215(0, 0, this.field6213, this.field6337, 0, 0);
            this.field6317.setSurface(this.field6303);
        } else {
            if (this.field6404 != this.field6407) {
                throw new RuntimeException();
            }
            this.field6404.method3105((byte) 107, 0);
            this.field6404.method3105((byte) 107, 8);
            this.method2621((byte) 112, this.field6404);
        }
        this.field6337 = this.field6306;
        this.field6213 = this.field6351;
        this.field6403 = null;
        this.method2678((byte) 3);
        this.method2668(-6619);
        this.method1044();
    }

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "(I)V", line = 1358)
    private final void method2649(int arg0) {
        if (this.field6264 != null) {
            Dimension var2 = this.field6264.getSize();
            this.field6306 = var2.height;
            this.field6351 = var2.width;
        } else {
            this.field6351 = this.field6306 = 0;
        }
        ++field6341;
        if (this.field6407 == null) {
            this.field6337 = this.field6306;
            this.field6213 = this.field6351;
            this.method2668(-6619);
        }
        if (arg0 == 3200) {
            this.method2678((byte) 3);
            this.method1044();
        }
    }

    @OriginalMember(owner = "client!ag", name = "va", descriptor = "(I)V", line = 1388)
    public final void method1049(int arg0) {
        this.field6396 = 0;
        ++field6327;
        while (arg0 > 1) {
            ++this.field6396;
            arg0 >>= 1;
        }
        this.field6395 = 1 << this.field6396;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)V", line = 1403)
    public final void method2650(byte arg0, int arg1) {
        if (~arg1 == -2) {
            this.method2669(7681, 105, 7681);
        } else if (arg1 != 0) {
            if (arg1 == 2) {
                this.method2669(7681, -95, 34165);
            } else if (~arg1 != -4) {
                if (arg1 == 4) {
                    this.method2669(34023, -126, 34023);
                }
            } else {
                this.method2669(8448, -94, 260);
            }
        } else {
            this.method2669(8448, 7, 8448);
        }
        ++field6226;
        if (arg0 > -31) {
            this.method1089((class250) null, -27, -5, -117, 27);
        }
    }

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "(I)V", line = 1438)
    public final void method2651(int arg0) {
        if (arg0 < 84) {
            this.field6452 = null;
        }
        ++field6268;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V", line = 1451)
    public final synchronized void method2652(int arg0, int arg1, int arg2) {
        if (arg0 != 24208728) {
            this.method1106();
        }
        ++field6313;
        class37 var4 = new class37(arg1);
        var4.field545 = (long) arg2;
        this.field6417.method2507(var4, (byte) -124);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IZ)V", line = 1466)
    public final void method2653(int arg0, boolean arg1) {
        if (arg0 >= -72) {
            this.method1087();
        }
        if (!arg1 == this.field6426) {
            this.field6426 = arg1;
            this.method2635((byte) -120);
            this.field6424 &= -32;
        }
        ++field6212;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V", line = 1483)
    public final void method1109(int arg0) {
        ++field6290;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field6366 = arg0;
            this.field6387.method3155(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIB[BI)Lvh;", line = 1497)
    public final class265 method2654(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4) {
        if (arg2 != -112) {
            return null;
        } else {
            ++field6334;
            return (class265) (!this.field6475 || arg0 && !this.field6472 ? new class290(this, arg4, arg3, arg1) : new class188(this, arg4, arg3, arg1, arg0));
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lit;Lit;FLit;)Lit;", line = 1514)
    public final class513 method1154(class513 arg0, class513 arg1, float arg2, class513 arg3) {
        ++field6283;
        if (arg0 != null && arg1 != null && this.field6446 && this.field6507) {
            class590 var5 = null;
            class326 var6 = (class326) arg0;
            class326 var7 = (class326) arg1;
            class327 var8 = var6.method1702(4);
            class327 var9 = var7.method1702(4);
            if (var8 != null && var9 != null) {
                int var10 = var9.field4395 < var8.field4395 ? var8.field4395 : var9.field4395;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class590) {
                    class590 var11 = (class590) arg3;
                    if (~var10 == ~var11.method3265((byte) 67)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class590(this, var10);
                }
                if (var5.method3261(arg2, var8, var9, true)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIF)Lqea;", line = 1561)
    public final class392 method1152(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6280;
        return new class209(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I)Lua;", line = 1570)
    public final class596 method1128(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6335;
        return class546.method3055(arg3, (byte) 66, arg1, arg2, this, arg0);
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(IIIIII)V", line = 1579)
    public final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2662((byte) 71);
        ++field6217;
        this.method2644(arg5, (byte) 79);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "()I", line = 1611)
    public final int method1108() {
        ++field6354;
        return this.field6474;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ)Lf;", line = 1619)
    public final class532 method1040(int arg0, int arg1, boolean arg2) {
        ++field6322;
        return new class162(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lf;Z)V", line = 1629)
    public final void method1107(class532 arg0, boolean arg1) {
        this.field6403 = (class162) arg0;
        ++field6311;
        if (this.field6507) {
            if (this.field6404 == null) {
                this.field6404 = new class560(this);
            }
            if (this.field6404 == this.field6407) {
                throw new RuntimeException();
            }
            this.method2673(this.field6404, 128);
            if (arg1) {
                class72 var3 = (class72) this.field6410.method3057(1, (long) (this.field6403.method530() << 16 | this.field6403.method529()));
                if (var3 == null) {
                    var3 = new class72(this, 6402, this.field6403.method530(), this.field6403.method529());
                    class72 var5;
                    for (this.field6415 += var3.field850; this.field6415 > 2097152; this.field6415 -= var5.field850) {
                        class339 var4 = this.field6409.method876(-70);
                        if (var4 == null) {
                            break;
                        }
                        var5 = (class72) var4;
                        var5.method1982((byte) -24);
                        var5.method242(true);
                        var5.method394(-34);
                    }
                    this.field6410.method3061(125, (long) (this.field6403.method530() << 16 | this.field6403.method529()), var3);
                }
                this.field6409.method877(var3, 16);
                this.field6404.method3112(1, var3, 8);
            }
            this.field6404.method3111((byte) -116, this.field6403.field2335, 0);
        } else {
            if (!this.field6521) {
                throw new RuntimeException("");
            }
            class538 var6 = (class538) this.field6410.method3057(1, (long) (this.field6403.method530() << 16 | this.field6403.method529()));
            if (var6 == null) {
                var6 = new class538(this, this.field6403.method530(), this.field6403.method529());
                class538 var8;
                for (this.field6415 += var6.field7377 * 4; this.field6415 > 2097152; this.field6415 -= var8.field7377) {
                    class339 var7 = this.field6409.method876(-69);
                    if (var7 == null) {
                        break;
                    }
                    var8 = (class538) var7;
                    var8.method1982((byte) -24);
                    var8.method242(true);
                    this.field6317.releasePbuffer(var8.method3022(19174));
                }
                this.field6410.method3061(126, (long) (this.field6403.method530() << 16 | this.field6403.method529()), var6);
            }
            this.field6409.method877(var6, 16);
            this.field6317.setPbuffer(var6.method3022(19174));
        }
        this.field6213 = arg0.method530();
        this.field6337 = arg0.method529();
        this.method2678((byte) 3);
        this.method2668(-6619);
        this.method1044();
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()I", line = 1727)
    public final int method1137() {
        ++field6261;
        return this.field6413 + this.field6411 + this.field6414;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[Lqea;)V", line = 1735)
    public final void method1111(int arg0, class392[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field6493[var3] = arg1[var3];
        }
        ++field6255;
        this.field6522 = arg0;
        if (~this.field6512 != -2) {
            this.method2672((byte) 78);
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "()Lq;", line = 1756)
    public final class487 method1075() {
        ++field6326;
        return new class62();
    }

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "()Z", line = 1765)
    public final boolean method1098() {
        ++field6191;
        return this.field6382 != null && this.field6382.method3423(-92);
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(B)V", line = 1776)
    private final void method2655(byte arg0) {
        class113.field1444[0] = this.field6510 * this.field6498;
        class113.field1444[2] = this.field6510 * this.field6439;
        class113.field1444[3] = 1.0F;
        ++field6204;
        class113.field1444[1] = this.field6510 * this.field6494;
        OpenGL.glLightfv(16384, 4609, class113.field1444, 0);
        class113.field1444[2] = -this.field6504 * this.field6439;
        class113.field1444[0] = -this.field6504 * this.field6498;
        class113.field1444[1] = -this.field6504 * this.field6494;
        class113.field1444[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class113.field1444, 0);
        if (arg0 < 99) {
            this.method1121(92, -102, 99, -42, -36, -126);
        }
    }

    @OriginalMember(owner = "client!ag", name = "GA", descriptor = "(II)V", line = 1797)
    public final void method1090(int arg0, int arg1) {
        ++field6329;
        if (~this.field6440 != ~arg0 || this.field6474 != arg1) {
            this.field6474 = arg1;
            this.field6440 = arg0;
            this.method2682((byte) 109);
            this.method2701(1);
            if (~this.field6512 == -4) {
                this.method2688((byte) 80);
                return;
            }
            if (this.field6512 != 2) {
                return;
            }
            this.method2679(24242);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()I", line = 1823)
    public final int method1133() {
        ++field6305;
        return 4;
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(II)V", line = 1831)
    public final synchronized void method2656(int arg0, int arg1) {
        ++field6200;
        if (arg0 != -4891) {
            this.field6492 = true;
        }
        class37 var3 = new class37(arg1);
        this.field6418.method2507(var3, (byte) -126);
    }

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "()Z", line = 1845)
    public final boolean method1069() {
        ++field6342;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Le;)V", line = 1853)
    public final void method1129(class381 arg0) {
        this.field6398 = ((class653) arg0).field9305;
        ++field6206;
        if (this.field6517 == null) {
            class210 var2 = new class210(80);
            if (this.field6466) {
                var2.method1334(917876560, -1.0F);
                var2.method1334(917876560, -1.0F);
                var2.method1334(917876560, 0.0F);
                var2.method1334(917876560, 0.0F);
                var2.method1334(917876560, 1.0F);
                var2.method1334(917876560, 1.0F);
                var2.method1334(917876560, -1.0F);
                var2.method1334(917876560, 0.0F);
                var2.method1334(917876560, 1.0F);
                var2.method1334(917876560, 1.0F);
                var2.method1334(917876560, 1.0F);
                var2.method1334(917876560, 1.0F);
                var2.method1334(917876560, 0.0F);
                var2.method1334(917876560, 1.0F);
                var2.method1334(917876560, 0.0F);
                var2.method1334(917876560, -1.0F);
                var2.method1334(917876560, 1.0F);
                var2.method1334(917876560, 0.0F);
                var2.method1334(917876560, 0.0F);
                var2.method1334(917876560, 0.0F);
            } else {
                var2.method1332((byte) -13, -1.0F);
                var2.method1332((byte) -13, -1.0F);
                var2.method1332((byte) -13, 0.0F);
                var2.method1332((byte) -13, 0.0F);
                var2.method1332((byte) -13, 1.0F);
                var2.method1332((byte) -13, 1.0F);
                var2.method1332((byte) -13, -1.0F);
                var2.method1332((byte) -13, 0.0F);
                var2.method1332((byte) -13, 1.0F);
                var2.method1332((byte) -13, 1.0F);
                var2.method1332((byte) -13, 1.0F);
                var2.method1332((byte) -13, 1.0F);
                var2.method1332((byte) -13, 0.0F);
                var2.method1332((byte) -13, 1.0F);
                var2.method1332((byte) -13, 0.0F);
                var2.method1332((byte) -13, -1.0F);
                var2.method1332((byte) -13, 1.0F);
                var2.method1332((byte) -13, 0.0F);
                var2.method1332((byte) -13, 0.0F);
                var2.method1332((byte) -13, 0.0F);
            }
            this.field6517 = this.method2658(var2.field2199, (byte) -126, var2.field2219, false, 20);
            this.field6535 = new class199(this.field6517, 5126, 3, 0);
            this.field6469 = new class199(this.field6517, 5126, 2, 12);
            this.field6389.method52(this, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLcw;)V", line = 1920)
    public final void method2657(byte arg0, class511 arg1) {
        ++field6275;
        if (arg0 == 71) {
            if (this.field6484 != arg1) {
                if (this.field6475) {
                    OpenGL.glBindBufferARB(34962, arg1.method1558((byte) 79));
                }
                this.field6484 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V", line = 1940)
    public class469(Canvas arg0, class522 arg1, int arg2) {
        super(arg1);
        this.field6386 = arg2;
        this.field6264 = this.field6224 = arg0;
        if (!class324.method1882("jaclib", 103)) {
            throw new RuntimeException("");
        } else if (!class324.method1882("jaggl", -83)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field6317 = new OpenGL();
                this.field6303 = this.field6344 = this.field6317.init(arg0, 8, 8, 8, 24, 0, this.field6386);
                if (~this.field6344 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2698((byte) -63);
                    int var4 = this.method2667(-114);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field6460 = !this.field6466 ? 5121 : 33639;
                        if (~this.field6525.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class87.method475(' ', this.field6525.replace('/', ' '), false);
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class15.method100(var10.substring(1, 3), (byte) -100)) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (var10.length() >= 4 && class15.method100(var10.substring(0, 4), (byte) -81)) {
                                                var5 = class289.method1717(var10.substring(0, 4), -87);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field6483 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field6524 = false;
                                }
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field6475 = false;
                                }
                            }
                            this.field6459 &= this.field6317.method3496("GL_ARB_half_float_pixel");
                            this.field6435 = true;
                            this.field6472 = this.field6475;
                        }
                        if (~this.field6450.indexOf("intel") != 0) {
                            this.field6507 = false;
                        }
                        this.field6538 = !this.field6450.equals("s3 graphics");
                        if (this.field6475) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class413.method2341(-116, true, false);
                        this.field6397 = true;
                        this.field6387 = new class572(this, super.field7682);
                        this.method2696(3553);
                        this.field6394 = new class630(this);
                        this.field6376 = new class598(this);
                        if (this.field6376.method3313((byte) 66)) {
                            this.field6382 = new class482(this);
                            if (!this.field6382.method2775(112)) {
                                this.field6382.method2778((byte) 127);
                                this.field6382 = null;
                            }
                        }
                        this.field6361 = new class12(this);
                        this.method2697((byte) -105);
                        this.method2649(3200);
                        this.method1050();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method1142();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "YA", descriptor = "(IIII)V", line = 2087)
    public final void method1064(int arg0, int arg1, int arg2, int arg3) {
        ++field6369;
        if (!this.field6482) {
            throw new RuntimeException("");
        } else {
            this.field6488 = arg3;
            this.field6519 = arg2;
            this.field6458 = arg0;
            this.field6491 = arg1;
            if (this.field6542) {
                this.field6361.field160.method95(-1);
                this.field6361.field160.method102(-125);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 2110)
    public final void method1082(int arg0) {
        ++field6294;
        this.method2643(-17733);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lec;I)V", line = 2119)
    public final void method1120(class144 arg0, int arg1) {
        this.field6389.method48(this, arg0, -7224, arg1);
        ++field6205;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([BBIZI)Lcw;", line = 2128)
    public final class511 method2658(byte[] arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        ++field6282;
        if (!this.field6475 || arg3 && !this.field6472) {
            return arg1 >= -123 ? null : new class467(this, arg4, arg0, arg2);
        } else {
            return new class258(this, arg4, arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILvh;)V", line = 2148)
    public final void method2659(int arg0, class265 arg1) {
        if (this.field6461 != arg1) {
            if (this.field6475) {
                OpenGL.glBindBufferARB(34963, arg1.method1244((byte) 87));
            }
            this.field6461 = arg1;
        }
        ++field6287;
        if (arg0 != 34963) {
            this.method1099();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 2168)
    public final class270 method1037(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6291;
        return new class303(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "(I)V", line = 2176)
    public final void method2660(int arg0) {
        if (~this.field6424 != -17) {
            this.method2648((byte) -111);
            this.method2630(true, (byte) 96);
            this.method2639(arg0 + -108, true);
            this.method2653(-103, true);
            this.method2644(1, (byte) 79);
            this.field6424 = 16;
        }
        if (arg0 == 16) {
            ++field6207;
        }
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(B)V", line = 2199)
    private final void method2661(byte arg0) {
        if (this.field6486) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field6486 = false;
        }
        if (arg0 == 15) {
            ++field6258;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V", line = 2218)
    public final void method1140(int arg0, int arg1, int arg2, int arg3) {
        this.field6376.method3314(arg1, arg0, -111, arg2, arg3);
        ++field6359;
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(B)V", line = 2230)
    private final void method2662(byte arg0) {
        ++field6234;
        if (~this.field6424 != -2) {
            this.method2642((byte) -127);
            this.method2630(false, (byte) 110);
            this.method2703(false, arg0 ^ 30);
            this.method2639(-113, false);
            this.method2653(-83, false);
            this.method2627(90, (class262) null);
            this.method2693(-2, arg0 + 15139);
            this.method2650((byte) -77, 1);
            this.field6424 = 1;
        }
        if (arg0 != 71) {
            this.method2675(-7);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lit;)V", line = 2255)
    public final void method1048(class513 arg0) {
        this.field6514 = (class326) arg0;
        ++field6221;
    }

    @OriginalMember(owner = "client!ag", name = "BA", descriptor = "()I", line = 2263)
    public final int method1054() {
        ++field6348;
        return this.field6440;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILofa;)V", line = 2271)
    public final void method2663(int arg0, class62 arg1) {
        if (arg0 != 467844120) {
            this.method1152(-64, 72, -21, 113, 2, -0.4840571F);
        }
        OpenGL.glLoadMatrixf(arg1.method360(1), 0);
        ++field6372;
    }

    @OriginalMember(owner = "client!ag", name = "ra", descriptor = "(F)V", line = 2282)
    public final void method1041(float arg0) {
        if (this.field6497 != arg0) {
            this.field6497 = arg0;
            this.method2675(64);
        }
        ++field6310;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FBFF)V", line = 2298)
    private final void method2664(float arg0, byte arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field6262;
        if (this.field6486) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg2, arg3);
        OpenGL.glMatrixMode(5888);
        this.field6486 = true;
        if (arg1 != 81) {
            this.field6536 = -0.29897517F;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ltq;Z)Lf;", line = 2323)
    public final class532 method1139(class92 arg0, boolean arg1) {
        ++field6254;
        int[] var3 = new int[arg0.field1132 * arg0.field1128];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1129 != null) {
            for (int var6 = 0; ~arg0.field1128 < ~var6; ++var6) {
                for (int var7 = 0; arg0.field1132 > var7; ++var7) {
                    var3[var5++] = class665.method3789(arg0.field1129[var4] << 24, arg0.field1127[class15.method97(255, arg0.field1130[var4])]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field1128 > var8; ++var8) {
                for (int var10 = 0; ~arg0.field1132 < ~var10; ++var10) {
                    int var11 = arg0.field1127[arg0.field1130[var4++] & 255];
                    var3[var5++] = var11 == 0 ? 0 : class665.method3789(-16777216, var11);
                }
            }
        }
        class532 var9 = this.method1122(var3, 0, arg0.field1132, arg0.field1132, arg0.field1128);
        var9.method527(arg0.field1125, arg0.field1126, arg0.field1131, arg0.field1133);
        return var9;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V", line = 2385)
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field6352;
        this.method1101(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "()V", line = 2404)
    public final void method1092() {
        OpenGL.glFinish();
        ++field6279;
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "()V", line = 2412)
    public final void method1151() throws class56 {
        ++field6250;
        try {
            this.field6317.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "(I)V", line = 2430)
    public final void method2665(int arg0) {
        if (arg0 < 54) {
            this.method1130((class658) null, (class92[]) null, true);
        }
        if (this.field6424 != 8) {
            this.method2687((byte) -121);
            this.method2630(true, (byte) 111);
            this.method2639(57, true);
            this.method2653(-88, true);
            this.method2644(1, (byte) 79);
            this.field6424 = 8;
        }
        ++field6252;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(II)I", line = 2455)
    public final int method2666(int arg0, int arg1) {
        ++field6220;
        if (arg1 != 2) {
            this.method1110();
        }
        if (~arg0 != -5122 && ~arg0 != -5121) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
                if (~arg0 != -5126 && arg0 != 5124 && ~arg0 != -5127) {
                    throw new IllegalArgumentException("");
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2478)
    public final void method1056(Rectangle[] arg0, int arg1) throws class56 {
        ++field6353;
        this.method1151();
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIIII)V", line = 2487)
    public final void method1121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6248;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method2662((byte) 71);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2644(arg5, (byte) 79);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6532) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field6532) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "(I)I", line = 2523)
    private final int method2667(int arg0) {
        ++field6237;
        this.field6450 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field6525 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field6450.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field6450.indexOf("brian paul") != 0 || this.field6450.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class87.method475(' ', var3.replace('.', ' '), false);
        if (var4.length >= 2) {
            try {
                int var5 = class289.method1717(var4[0], -118);
                int var6 = class289.method1717(var4[1], -100);
                this.field6539 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field6539 > -13) {
            var2 |= 2;
        }
        if (!this.field6317.method3496("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field6317.method3496("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field6503 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field6433 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field6447 = var7[0];
        if (this.field6503 < 2 || this.field6433 < 2 || ~this.field6447 > -3) {
            var2 |= 16;
        }
        this.field6466 = Stream.method3445();
        this.field6521 = this.field6317.arePbuffersAvailable();
        this.field6475 = this.field6317.method3496("GL_ARB_vertex_buffer_object");
        this.field6532 = this.field6317.method3496("GL_ARB_multisample");
        this.field6492 = this.field6317.method3496("GL_ARB_vertex_program");
        this.field6317.method3496("GL_ARB_fragment_program");
        int var8 = -77 % ((arg0 - -46) / 32);
        this.field6540 = this.field6317.method3496("GL_ARB_vertex_shader");
        this.field6454 = this.field6317.method3496("GL_ARB_fragment_shader");
        this.field6524 = this.field6317.method3496("GL_EXT_texture3D");
        this.field6459 = this.field6317.method3496("GL_ARB_texture_rectangle");
        this.field6446 = this.field6317.method3496("GL_ARB_texture_cube_map");
        this.field6483 = this.field6317.method3496("GL_ARB_texture_float");
        this.field6462 = false;
        this.field6507 = this.field6317.method3496("GL_EXT_framebuffer_object");
        this.field6457 = this.field6317.method3496("GL_EXT_framebuffer_blit");
        this.field6506 = this.field6317.method3496("GL_EXT_framebuffer_multisample");
        this.field6477 = this.field6457 & this.field6506;
        OpenGL.glGetFloatv(2834, class113.field1444, 0);
        this.field6455 = class113.field1444[1];
        this.field6478 = class113.field1444[0];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "(I)V", line = 2605)
    private final void method2668(int arg0) {
        if (arg0 == -6619) {
            OpenGL.glViewport(this.field6456, this.field6516, this.field6213, this.field6337);
            ++field6197;
        }
    }

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "(IIIIII)V", line = 2617)
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6192;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2662((byte) 71);
        float var10 = (float) arg3 + var8;
        this.method2644(arg5, (byte) 79);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6532) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field6532) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)V", line = 2651)
    public final void method2669(int arg0, int arg1, int arg2) {
        ++field6228;
        if (this.field6530 == 0) {
            boolean var4 = false;
            if (~this.field6537 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var4 = true;
                this.field6537 = arg2;
            }
            if (~this.field6489 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field6489 = arg0;
            }
            if (var4) {
                this.field6424 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        }
        int var5 = -68 % ((-47 - arg1) / 46);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIILjaclib/memory/Buffer;I)Lcw;", line = 2692)
    public final class511 method2670(boolean arg0, int arg1, int arg2, Buffer arg3, int arg4) {
        int var6 = -41 % ((-36 - arg4) / 44);
        ++field6229;
        return (class511) (!this.field6475 || arg0 && !this.field6472 ? new class467(this, arg2, arg3) : new class258(this, arg2, arg3, arg1, arg0));
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(III)V", line = 2708)
    public final void method2671(int arg0, int arg1, int arg2) {
        ++field6267;
        this.field6456 = arg1;
        this.field6516 = arg0;
        if (arg2 == 9114) {
            this.method2668(-6619);
            this.method2699(0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "MA", descriptor = "(III[I)V", line = 2727)
    public final void method1118(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6270;
        float var5 = (float) arg2 * this.field6428.field795 + (float) arg0 * this.field6428.field790 + (float) arg1 * this.field6428.field775 + this.field6428.field791;
        if (!(var5 < (float) this.field6440) && !(var5 > (float) this.field6474)) {
            int var6 = (int) (((float) arg2 * this.field6428.field783 + (float) arg0 * this.field6428.field771 + (float) arg1 * this.field6428.field770 + this.field6428.field769) * (float) this.field6451 / var5);
            int var7 = (int) (((float) arg2 * this.field6428.field789 + (float) arg0 * this.field6428.field772 + (float) arg1 * this.field6428.field767 + this.field6428.field792) * (float) this.field6500 / var5);
            arg3[0] = (int) ((float) var6 + -this.field6479);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field6536);
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(B)V", line = 2750)
    private final void method2672(byte arg0) {
        ++field6236;
        int var2;
        for (var2 = 0; ~this.field6522 < ~var2; ++var2) {
            class392 var3 = this.field6493[var2];
            class109.field1285[0] = (float) var3.method2258((byte) -28);
            int var4 = var2 + 16386;
            class109.field1285[1] = (float) var3.method2261((byte) 37);
            class109.field1285[2] = (float) var3.method2257(arg0 + -17973);
            class109.field1285[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class109.field1285, 0);
            int var5 = var3.method2263(0);
            float var6 = var3.method2259(false) / 255.0F;
            class109.field1285[1] = var6 * (float) class15.method97(var5 >> 8, 255);
            class109.field1285[2] = var6 * (float) class15.method97(var5, 255);
            class109.field1285[0] = (float) (class15.method97(16723984, var5) >> 16) * var6;
            OpenGL.glLightfv(var4, 4609, class109.field1285, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2260(2) * var3.method2260(2)));
            OpenGL.glEnable(var4);
        }
        while (this.field6453 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field6453 = this.field6522;
        if (arg0 != 78) {
            this.method1108();
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "()V", line = 2795)
    public final void method1142() {
        for (class45 var1 = this.field6392.method2506(68); var1 != null; var1 = this.field6392.method2505(-112)) {
            ((class653) var1).method3694((byte) 44);
        }
        ++field6216;
        if (this.field6376 != null) {
            this.field6376.method3310(-27838);
        }
        if (this.field6317 != null) {
            this.method2643(-17733);
            Enumeration var2 = this.field6198.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field6198.get(var3);
                this.field6317.releaseSurface(var3, var4);
            }
            this.field6317.release();
            this.field6317 = null;
        }
        if (this.field6397) {
            class374.method2146(false, true, false);
            this.field6397 = false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lna;I)V", line = 2841)
    public final void method2673(class345 arg0, int arg1) {
        ++field6215;
        if (this.field6457) {
            this.method2623((byte) -70, arg0);
            this.method2676(arg0, arg1 + -22445);
        } else {
            if (~this.field6408 <= -4) {
                throw new RuntimeException();
            }
            if (~this.field6408 <= -1) {
                this.field6401[this.field6408].method2057(arg1 + -251);
            }
            this.field6399 = this.field6407 = this.field6401[++this.field6408] = arg0;
            this.field6399.method2056((byte) -54);
        }
        if (arg1 != 128) {
            this.method2633(-68, -13);
        }
    }

    @OriginalMember(owner = "client!ag", name = "IA", descriptor = "(IIIIII[BII)V", line = 2875)
    public final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6265;
        float var10;
        float var11;
        if (this.field6452 != null && this.field6452.field5862 >= arg2 && ~this.field6452.field5857 <= ~arg3) {
            this.field6452.method2492(arg2, 109, 0, arg6, 6406, false, arg3, 0, 0, 0);
            var10 = (float) arg2 * this.field6452.field75 / (float) this.field6452.field5862;
            var11 = (float) arg3 * this.field6452.field73 / (float) this.field6452.field5857;
        } else {
            this.field6452 = class367.method2129(false, arg6, arg2, (byte) 119, arg3, 6406, this, 6406);
            this.field6452.method2495(false, false, (byte) -1);
            var10 = this.field6452.field75;
            var11 = this.field6452.field73;
        }
        this.method2629((byte) -124);
        this.method2627(85, this.field6452);
        this.method2644(arg8, (byte) 79);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2624((byte) 26, arg5);
        this.method2669(34165, 5, 34165);
        this.method2636(0, 768, 34166, -104);
        this.method2636(2, 770, 5890, -119);
        this.method2637(770, -513, 0, 34166);
        this.method2637(770, -513, 2, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2636(0, 768, 5890, -118);
        this.method2636(2, 770, 34166, -107);
        this.method2637(770, -513, 0, 5890);
        this.method2637(770, -513, 2, 34166);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILvh;II)V", line = 2934)
    public final void method2674(int arg0, int arg1, class265 arg2, int arg3, int arg4) {
        ++field6272;
        if (arg3 != 8704) {
            this.field6499 = 0.0797679F;
        }
        int var6 = arg2.method1247((byte) 116);
        int var7 = arg0 * this.method2666(var6, 2);
        this.method2659(arg3 ^ 43667, arg2);
        OpenGL.glDrawElements(arg1, arg4, var6, arg2.method1246((byte) -124) + (long) var7);
    }

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "(I)V", line = 2951)
    private final void method2675(int arg0) {
        ++field6331;
        class113.field1444[1] = this.field6497 * this.field6494;
        class113.field1444[3] = 1.0F;
        class113.field1444[2] = this.field6497 * this.field6439;
        if (arg0 != 64) {
            this.method1042(-50, -107, -128, -26);
        }
        class113.field1444[0] = this.field6498 * this.field6497;
        OpenGL.glLightModelfv(2899, class113.field1444, 0);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Le;", line = 2966)
    public final class381 method1078(int arg0) {
        ++field6214;
        class653 var2 = new class653(arg0);
        this.field6392.method2507(var2, (byte) -127);
        return var2;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lna;I)V", line = 2982)
    public final void method2676(class345 arg0, int arg1) {
        ++field6188;
        if (~this.field6406 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field6406 >= 0) {
                this.field6405[this.field6406].method2058(1325);
            }
            this.field6407 = this.field6405[++this.field6406] = arg0;
            if (arg1 == -22317) {
                this.field6407.method2060(12185);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lfe;Lfe;ILfe;Lfe;)V", line = 3002)
    public final void method2677(class199 arg0, class199 arg1, int arg2, class199 arg3, class199 arg4) {
        if (arg0 != null) {
            this.method2657((byte) 71, arg0.field2697);
            OpenGL.glVertexPointer(arg0.field2703, arg0.field2696, this.field6484.method1560(arg2 ^ -22224), this.field6484.method1559(false) - -((long) arg0.field2698));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field6194;
        if (arg1 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method2657((byte) 71, arg1.field2697);
            OpenGL.glNormalPointer(arg1.field2696, this.field6484.method1560(-4696), this.field6484.method1559(false) + (long) arg1.field2698);
            OpenGL.glEnableClientState(32885);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method2657((byte) 71, arg3.field2697);
            OpenGL.glColorPointer(arg3.field2703, arg3.field2696, this.field6484.method1560(-4696), this.field6484.method1559(false) + (long) arg3.field2698);
            OpenGL.glEnableClientState(32886);
        }
        if (arg2 != 17560) {
            this.method2652(126, -40, -5);
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method2657((byte) 71, arg4.field2697);
            OpenGL.glTexCoordPointer(arg4.field2703, arg4.field2696, this.field6484.method1560(-4696), this.field6484.method1559(false) + (long) arg4.field2698);
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "(B)V", line = 3051)
    public final void method2678(byte arg0) {
        ++field6203;
        if (arg0 != 3) {
            this.method1063(-104);
        }
        if (~this.field6512 != -1) {
            this.field6512 = 0;
            this.field6424 &= -32;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIILua;II)V", line = 3069)
    public final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        ++field6355;
        class516 var10 = (class516) arg6;
        class8 var11 = var10.field7173;
        this.method2629((byte) -114);
        this.method2627(122, var10.field7173);
        this.method2644(arg5, (byte) 79);
        this.method2669(8448, 87, 7681);
        this.method2636(0, 768, 34167, -102);
        float var12 = var11.field75 / (float) var11.field74;
        float var13 = var11.field73 / (float) var11.field71;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method2636(0, 768, 5890, -99);
    }

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "(I)V", line = 3107)
    private final void method2679(int arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0 != 24242) {
            this.field6408 = -56;
        }
        ++field6304;
        OpenGL.glLoadMatrixf(this.field6471, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFFIF)V", line = 3120)
    public final void method2680(float arg0, float arg1, float arg2, int arg3, float arg4) {
        class113.field1444[3] = arg0;
        class113.field1444[2] = arg2;
        class113.field1444[0] = arg4;
        ++field6380;
        class113.field1444[1] = arg1;
        OpenGL.glTexEnvfv(arg3, 8705, class113.field1444, 0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIIII)V", line = 3132)
    public final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6211;
        this.method2662((byte) 71);
        this.method2644(arg9, (byte) 79);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "()Laa;", line = 3151)
    public final class102 method1141() {
        ++field6343;
        int var1 = -1;
        if (this.field6450.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field6450.indexOf("intel") == -1) {
            if (this.field6450.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class102(var1, "OpenGL", this.field6539, this.field6525, 0L);
    }

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "()Lq;", line = 3173)
    public final class487 method1136() {
        ++field6315;
        return this.field6428;
    }

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "(I)Ld;", line = 3183)
    public final class327 method2681(int arg0) {
        ++field6377;
        if (arg0 != -21692) {
            this.method2631(-59, -82, 27);
        }
        return this.field6514 != null ? this.field6514.method1702(4) : null;
    }

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "(B)V", line = 3196)
    private final void method2682(byte arg0) {
        ++field6320;
        float[] var2 = this.field6471;
        float var3 = (float) (-this.field6495 * this.field6440) / (float) this.field6451;
        if (arg0 == 109) {
            float var4 = (float) ((-this.field6495 + this.field6213) * this.field6440) / (float) this.field6451;
            float var5 = (float) (this.field6508 * this.field6440) / (float) this.field6500;
            float var6 = (float) ((-this.field6337 + this.field6508) * this.field6440) / (float) this.field6500;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field6440 * 2.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[13] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[11] = -1.0F;
                var2[1] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[6] = 0.0F;
                var2[14] = this.field6445 = -((float) this.field6474 * var7) / (float) (-this.field6440 + this.field6474);
                var2[10] = this.field6502 = (float) (-(this.field6474 - -this.field6440)) / (float) (-this.field6440 + this.field6474);
            } else {
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[15] = 1.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[0] = 1.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
            }
            this.method2694((byte) -123);
        }
    }

    @OriginalMember(owner = "client!ag", name = "ya", descriptor = "()V", line = 3258)
    public final void method1147() {
        this.method2653(-89, true);
        ++field6249;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 3271)
    public final void method1132(Canvas arg0) {
        ++field6232;
        if (this.field6224 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6198.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field6317.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field6198.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "()Z", line = 3307)
    public final boolean method1106() {
        ++field6257;
        return this.field6532 && (!this.method1098() || this.field6477);
    }

    @OriginalMember(owner = "client!ag", name = "ja", descriptor = "(I)V", line = 3315)
    public final void method1146(int arg0) {
        ++field6208;
        this.method2644(0, (byte) 79);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "()V", line = 3327)
    public final void method1148() {
        ++field6373;
        this.field6482 = false;
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(II)V", line = 3341)
    public final synchronized void method2683(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method2656(-113, 8);
        }
        ++field6189;
        class45 var3 = new class45();
        var3.field545 = (long) arg0;
        this.field6420.method2507(var3, (byte) -128);
    }

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "(I)V", line = 3355)
    private final void method2684(int arg0) {
        ++field6378;
        if (arg0 != -25359) {
            this.field6547 = 114;
        }
        if (this.field6533 && ~this.field6509 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "()Z", line = 3370)
    public final boolean method1084() {
        ++field6209;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Laga;[Ltq;Z)Lla;", line = 3380)
    public final class409 method1130(class658 arg0, class92[] arg1, boolean arg2) {
        ++field6276;
        return new class241(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(IZ)V", line = 3388)
    public final void method2685(int arg0, boolean arg1) {
        if (arg0 != 3359) {
            this.field6351 = 84;
        }
        ++field6196;
        if (!arg1 == this.field6438) {
            this.field6438 = arg1;
            this.method2638(119);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z", line = 3409)
    public static final boolean method2686(Class arg0, int arg1, String arg2) {
        ++field6199;
        Class var3 = (Class) class615.field8523.get(arg2);
        if (arg1 != -3) {
            method2641(105);
        }
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        } else {
            File var4 = null;
            if (var4 == null) {
                var4 = (File) class611.field8485.get(arg2);
            }
            if (var4 != null) {
                try {
                    var4 = new File(var4.getCanonicalPath());
                    Class var5 = Class.forName("java.lang.Runtime");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var7.invoke(var8, Boolean.TRUE);
                    var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                    var7.invoke(var8, Boolean.FALSE);
                    class615.field8523.put(arg2, arg0);
                    return true;
                } catch (NoSuchMethodException var9) {
                    System.load(var4.getPath());
                    class615.field8523.put(arg2, field6549 != null ? field6549 : (field6549 = method2704("lh")));
                    return true;
                } catch (Throwable var10) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(IIII)[I", line = 3484)
    public final int[] method1068(int arg0, int arg1, int arg2, int arg3) {
        ++field6340;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field6337, arg2, 1, 32993, this.field6460, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "(B)V", line = 3506)
    private final void method2687(byte arg0) {
        if (arg0 > -106) {
            this.method2621((byte) 7, (class345) null);
        }
        if (this.field6512 != 2) {
            this.field6512 = 2;
            this.method2679(24242);
            this.method2689(34023);
            this.field6424 &= -8;
        }
        ++field6370;
    }

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "()Lq;", line = 3524)
    public final class487 method1153() {
        ++field6309;
        return this.field6390;
    }

    @OriginalMember(owner = "client!ag", name = "da", descriptor = "(IIII)V", line = 3537)
    public final void method1042(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > this.field6337) {
            arg3 = this.field6337;
        }
        ++field6374;
        if (~arg2 < ~this.field6213) {
            arg2 = this.field6213;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        this.field6464 = arg2;
        this.field6481 = arg1;
        this.field6541 = arg3;
        this.field6515 = arg0;
        OpenGL.glEnable(3089);
        this.method2700(-102);
        this.method2699(0);
    }

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "(B)V", line = 3567)
    private final void method2688(byte arg0) {
        ++field6190;
        float var2 = (float) (-this.field6495) * this.field6473 / (float) this.field6451;
        if (arg0 != 80) {
            this.field6534 = null;
        }
        float var3 = (float) (-this.field6508) * this.field6473 / (float) this.field6500;
        float var4 = (float) (-this.field6495 + this.field6213) * this.field6473 / (float) this.field6451;
        float var5 = (float) (-this.field6508 + this.field6337) * this.field6473 / (float) this.field6500;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field6440, (double) this.field6474);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 3591)
    public final void method1058(boolean arg0) {
        ++field6301;
    }

    @OriginalMember(owner = "client!ag", name = "AA", descriptor = "(III[I)V", line = 3598)
    public final void method1045(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6273;
        float var5 = (float) arg2 * this.field6428.field795 + (float) arg0 * this.field6428.field790 + (float) arg1 * this.field6428.field775 + this.field6428.field791;
        if (!((float) this.field6440 > var5) && !(var5 > (float) this.field6474)) {
            int var6 = (int) (((float) arg2 * this.field6428.field783 + (float) arg0 * this.field6428.field771 + (float) arg1 * this.field6428.field770 + this.field6428.field769) * (float) this.field6451 / var5);
            int var7 = (int) (((float) arg2 * this.field6428.field789 + (float) arg0 * this.field6428.field772 + (float) arg1 * this.field6428.field767 + this.field6428.field792) * (float) this.field6500 / var5);
            if ((float) var6 >= this.field6479 && this.field6467 >= (float) var6 && (float) var7 >= this.field6536 && this.field6444 >= (float) var7) {
                arg3[0] = (int) ((float) var6 + -this.field6479);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field6536);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "(I)V", line = 3628)
    private final void method2689(int arg0) {
        ++field6263;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field6431.method360(1), 0);
        if (this.field6542) {
            this.field6361.field160.method95(-1);
        }
        this.method2634((byte) -116);
        this.method2672((byte) 78);
        if (arg0 != 34023) {
            this.field6478 = -0.119602114F;
        }
    }

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "()I", line = 3647)
    public final int method1062() {
        ++field6201;
        int var1 = this.field6547;
        this.field6547 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFI)V", line = 3660)
    public final void method2690(float arg0, float arg1, int arg2) {
        this.field6468 = arg1;
        this.field6531 = arg0;
        ++field6297;
        this.method2701(1);
        if (arg2 != -1642) {
            this.method1136();
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(IIII)V", line = 3673)
    public final void method2691(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 34842) {
            this.method1142();
        }
        OpenGL.glDrawArrays(arg2, arg3, arg1);
        ++field6238;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I", line = 3686)
    public final int method1053(int arg0, int arg1) {
        ++field6298;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "(I)V", line = 3696)
    public final void method2692(int arg0) {
        ++field6321;
        if (~this.field6424 != -5) {
            this.method2642((byte) -127);
            this.method2630(false, (byte) -42);
            this.method2703(false, arg0 ^ 29559);
            this.method2639(-116, false);
            this.method2653(-97, false);
            this.method2693(-2, 15210);
            this.method2644(1, (byte) 79);
            this.field6424 = 4;
        }
        if (arg0 != 29527) {
            this.method1041(0.044732526F);
        }
    }

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "()Z", line = 3719)
    public final boolean method1065() {
        ++field6307;
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "FA", descriptor = "(ILua;II)V", line = 3730)
    public final void method1095(int arg0, class596 arg1, int arg2, int arg3) {
        ++field6218;
        class516 var5 = (class516) arg1;
        class8 var6 = var5.field7173;
        this.method2629((byte) -116);
        this.method2627(69, var5.field7173);
        this.method2644(1, (byte) 79);
        this.method2669(8448, 84, 7681);
        this.method2636(0, 768, 34167, -120);
        float var7 = var6.field75 / (float) var6.field74;
        float var8 = var6.field73 / (float) var6.field71;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6515) * var7, (float) (this.field6481 - arg3) * var8);
        OpenGL.glVertex2i(this.field6515, this.field6481);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6515) * var7, (float) (this.field6541 - arg3) * var8);
        OpenGL.glVertex2i(this.field6515, this.field6541);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6464) * var7, (float) (-arg3 + this.field6541) * var8);
        OpenGL.glVertex2i(this.field6464, this.field6541);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6464) * var7, (float) (this.field6481 - arg3) * var8);
        OpenGL.glVertex2i(this.field6464, this.field6481);
        OpenGL.glEnd();
        this.method2636(0, 768, 5890, -91);
    }

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "()V", line = 3762)
    public final void method1125() {
        ++field6227;
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(II)V", line = 3769)
    public final void method2693(int arg0, int arg1) {
        this.method2646(arg0, -1, true);
        if (arg1 != 15210) {
            this.field6467 = 1.1265509F;
        }
        ++field6338;
    }

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "(B)V", line = 3785)
    private final void method2694(byte arg0) {
        ++field6299;
        this.field6471[14] = this.field6445;
        this.field6471[10] = this.field6502;
        this.field6501 = (this.field6471[14] + (float) (-this.field6474)) / this.field6471[10];
        this.field6476 = (float) this.field6474;
        if (arg0 >= -91) {
            this.method2648((byte) -68);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(Lna;I)V", line = 3803)
    public final void method2695(class345 arg0, int arg1) {
        ++field6243;
        if (~this.field6406 <= -1 && this.field6405[this.field6406] == arg0) {
            int var3 = 32 % ((6 - arg1) / 51);
            this.field6405[this.field6406--] = null;
            arg0.method2058(1325);
            if (this.field6406 >= 0) {
                this.field6407 = this.field6405[this.field6406];
                this.field6407.method2060(12185);
            } else {
                this.field6407 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "(I)V", line = 3831)
    private final void method2696(int arg0) {
        this.field6463 = new class262[this.field6503];
        ++field6222;
        this.field6480 = new class441(this, 3553, 6408, 1, 1);
        new class441(this, arg0, 6408, 1, 1);
        new class441(this, 3553, 6408, 1, 1);
        this.field6434 = new class111(this);
        this.field6443 = new class111(this);
        this.field6449 = new class111(this);
        this.field6529 = new class111(this);
        this.field6485 = new class111(this);
        this.field6528 = new class111(this);
        this.field6520 = new class111(this);
        this.field6511 = new class111(this);
        this.field6441 = new class111(this);
        this.field6505 = new class111(this);
        if (this.field6507) {
            this.field6534 = new class560(this);
            new class560(this);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([I)V", line = 3865)
    public final void method1127(int[] arg0) {
        ++field6274;
        arg0[1] = this.field6337;
        arg0[0] = this.field6213;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "()Z", line = 3874)
    public final boolean method1135() {
        ++field6350;
        return this.field6361.method74(3, -1);
    }

    @OriginalMember(owner = "client!ag", name = "XA", descriptor = "(IIIII)V", line = 3884)
    public final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2662((byte) 71);
        ++field6244;
        this.method2644(arg4, (byte) 79);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "(B)V", line = 3908)
    private final void method2697(byte arg0) {
        this.method2693(-2, 15210);
        ++field6300;
        for (int var2 = this.field6503 - 1; ~var2 <= -1; --var2) {
            this.method2625(20296, var2);
            this.method2627(59, (class262) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2669(8448, 112, 8448);
        this.method2636(2, 770, 34168, -89);
        this.method2661((byte) 15);
        this.field6423 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field6425 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field6422 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field6430 = true;
        this.method2630(true, (byte) 120);
        this.method2703(true, 58);
        this.method2639(-102, true);
        this.method2653(-75, true);
        this.method2678((byte) 3);
        this.field6317.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        if (arg0 > -74) {
            this.method1089((class250) null, 93, -104, -115, -82);
        }
        for (int var4 = 0; ~var4 > -9; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field6527 = this.field6436 = -1;
        this.method1044();
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(IIIII)V", line = 3980)
    public final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6388;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (arg0 + arg2 >= this.field6515 && -arg2 + arg0 <= this.field6464 && this.field6481 <= arg1 - -arg2 && ~(-arg2 + arg1) >= ~this.field6541) {
            this.method2662((byte) 71);
            this.method2644(arg4, (byte) 79);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field6478 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field6455 >= (float) var8) {
                OpenGL.glEnable(2832);
                OpenGL.glPointSize((float) var8);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(var6, var7);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            } else {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(var6, var7);
                int var9 = 262144 / (arg2 * 6);
                if (var9 > 64) {
                    if (~var9 < -513) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class245.method1497(var9, (byte) -124);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class76.field897[var11] * (float) arg2 + var6, class76.field894[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()Z", line = 4053)
    public final boolean method1087() {
        ++field6269;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "(B)V", line = 4063)
    private final void method2698(byte arg0) {
        if (arg0 > -43) {
            this.method2662((byte) 96);
        }
        ++field6302;
        int var2 = 0;
        while (!this.field6317.method3497()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class588.method3253(0, 1000L);
        }
    }

    @OriginalMember(owner = "client!ag", name = "la", descriptor = "(IIII)V", line = 4093)
    public final void method1088(int arg0, int arg1, int arg2, int arg3) {
        this.field6495 = arg0;
        this.field6508 = arg1;
        ++field6379;
        this.field6451 = arg2;
        this.field6500 = arg3;
        this.method2682((byte) 109);
        this.method2700(-90);
        if (this.field6512 != 3) {
            if (this.field6512 == 2) {
                this.method2679(24242);
                return;
            }
        } else {
            this.method2688((byte) 80);
        }
    }

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "(IIIII)V", line = 4116)
    public final void method1149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2662((byte) 71);
        ++field6371;
        this.method2644(arg4, (byte) 79);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "(I)V", line = 4140)
    private final void method2699(int arg0) {
        if (arg0 != 0) {
            this.method1142();
        }
        ++field6381;
        if (this.field6515 <= this.field6464 && this.field6481 <= this.field6541) {
            OpenGL.glScissor(this.field6515 + this.field6456, this.field6516 - this.field6541 + this.field6337, -this.field6515 + this.field6464, -this.field6481 + this.field6541);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIZ)Lf;", line = 4160)
    public final class532 method1076(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6385;
        return new class162(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ag", name = "VA", descriptor = "(IFFFFF)V", line = 4168)
    public final void method1060(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6246;
        boolean var7 = ~this.field6527 != ~arg0;
        if (var7 || this.field6510 != arg1 || this.field6504 != arg2) {
            this.field6527 = arg0;
            this.field6510 = arg1;
            this.field6504 = arg2;
            if (var7) {
                this.field6494 = (float) (this.field6527 & 65280) / 65280.0F;
                this.field6498 = (float) (this.field6527 & 16711680) / 1.671168E7F;
                this.field6439 = (float) (255 & this.field6527) / 255.0F;
                this.method2675(64);
            }
            this.method2655((byte) 125);
        }
        if (this.field6518[0] != arg3 || this.field6518[1] != arg4 || this.field6518[2] != arg5) {
            this.field6518[0] = arg3;
            this.field6518[2] = arg5;
            this.field6518[1] = arg4;
            this.field6442[1] = -arg4;
            this.field6442[0] = -arg3;
            this.field6442[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6448[0] = arg3 * var8;
            this.field6448[1] = arg4 * var8;
            this.field6448[2] = arg5 * var8;
            this.field6496[2] = -this.field6448[2];
            this.field6496[0] = -this.field6448[0];
            this.field6496[1] = -this.field6448[1];
            this.method2634((byte) -115);
            this.field6513 = (int) (arg5 * 256.0F / arg4);
            this.field6526 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ag", name = "ZA", descriptor = "(Z)V", line = 4219)
    public final void method1091(boolean arg0) {
        ++field6223;
        this.field6470 = arg0;
        this.method2635((byte) -114);
    }

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "(I)V", line = 4232)
    private final void method2700(int arg0) {
        this.field6444 = (float) (-this.field6508 + this.field6541);
        this.field6479 = (float) (this.field6515 - this.field6495);
        ++field6240;
        if (arg0 <= -74) {
            this.field6467 = (float) (this.field6464 - this.field6495);
            this.field6536 = (float) (-this.field6508 + this.field6481);
        }
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "(I)V", line = 4248)
    private final void method2701(int arg0) {
        ++field6368;
        this.field6490 = (float) (-this.field6437 + this.field6474) - this.field6531;
        this.field6499 = -((float) this.field6509 * this.field6468) + this.field6490;
        if ((float) this.field6440 > this.field6499) {
            this.field6499 = (float) this.field6440;
        }
        OpenGL.glFogf(2915, this.field6499);
        OpenGL.glFogf(2916, this.field6490);
        class113.field1444[arg0] = (float) class15.method97(65280, this.field6436) / 65280.0F;
        class113.field1444[0] = (float) class15.method97(16711680, this.field6436) / 1.671168E7F;
        class113.field1444[2] = (float) class15.method97(this.field6436, 255) / 255.0F;
        OpenGL.glFogfv(2918, class113.field1444, 0);
    }

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "(I)V", line = 4267)
    public final void method2702(int arg0) {
        ++field6271;
        OpenGL.glPushMatrix();
        if (arg0 != 2) {
            this.field6495 = -15;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)V", line = 4278)
    public final void method2703(boolean arg0, int arg1) {
        if (arg1 <= 10) {
            this.field6451 = -96;
        }
        ++field6358;
        if (!this.field6487 == arg0) {
            this.field6487 = arg0;
            this.method2638(57);
            this.field6424 &= -8;
        }
    }

    @OriginalMember(owner = "client!ag", name = "DA", descriptor = "()I", line = 4303)
    public final int method1119() {
        ++field6210;
        int var1 = this.field6544;
        this.field6544 = 0;
        return var1;
    }
}
