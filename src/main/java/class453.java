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

@OriginalClass("client!gt")
public abstract class class453 extends class58 {

    @OriginalMember(owner = "client!gt", name = "fc", descriptor = "Lnt;")
    private class220 field6335 = new class220();

    @OriginalMember(owner = "client!gt", name = "ke", descriptor = "Z")
    public boolean field6444 = true;

    @OriginalMember(owner = "client!gt", name = "he", descriptor = "Lfba;")
    public class25 field6441 = new class25();

    @OriginalMember(owner = "client!gt", name = "me", descriptor = "Lfba;")
    public class25 field6446 = new class25();

    @OriginalMember(owner = "client!gt", name = "ne", descriptor = "Lfba;")
    public class25 field6447 = new class25();

    @OriginalMember(owner = "client!gt", name = "oe", descriptor = "Lfba;")
    public class25 field6448 = new class25();

    @OriginalMember(owner = "client!gt", name = "pe", descriptor = "Lfba;")
    private class25 field6449 = new class25();

    @OriginalMember(owner = "client!gt", name = "qe", descriptor = "Lfba;")
    private class25 field6450 = new class25();

    @OriginalMember(owner = "client!gt", name = "ze", descriptor = "I")
    public int field6459 = 0;

    @OriginalMember(owner = "client!gt", name = "re", descriptor = "I")
    public int field6451 = 0;

    @OriginalMember(owner = "client!gt", name = "Be", descriptor = "[F")
    private float[] field6461 = new float[16];

    @OriginalMember(owner = "client!gt", name = "Ae", descriptor = "I")
    private int field6460 = 0;

    @OriginalMember(owner = "client!gt", name = "He", descriptor = "Z")
    private boolean field6467 = false;

    @OriginalMember(owner = "client!gt", name = "ve", descriptor = "F")
    public float field6455 = -1.0F;

    @OriginalMember(owner = "client!gt", name = "Xe", descriptor = "I")
    public int field6483 = 3584;

    @OriginalMember(owner = "client!gt", name = "Ze", descriptor = "Z")
    public boolean field6485 = true;

    @OriginalMember(owner = "client!gt", name = "ef", descriptor = "I")
    public int field6490 = 3;

    @OriginalMember(owner = "client!gt", name = "hf", descriptor = "F")
    public float field6493 = 1.0F;

    @OriginalMember(owner = "client!gt", name = "Re", descriptor = "I")
    public int field6477 = -1;

    @OriginalMember(owner = "client!gt", name = "lf", descriptor = "I")
    public int field6496 = 8;

    @OriginalMember(owner = "client!gt", name = "te", descriptor = "Lek;")
    public class505 field6453 = class701.field9845;

    @OriginalMember(owner = "client!gt", name = "wf", descriptor = "F")
    public float field6507 = -1.0F;

    @OriginalMember(owner = "client!gt", name = "vf", descriptor = "I")
    private int field6506 = 0;

    @OriginalMember(owner = "client!gt", name = "Ue", descriptor = "I")
    private int field6480 = -1;

    @OriginalMember(owner = "client!gt", name = "Pe", descriptor = "I")
    public int field6475 = 0;

    @OriginalMember(owner = "client!gt", name = "Qe", descriptor = "[F")
    private float[] field6476 = new float[16];

    @OriginalMember(owner = "client!gt", name = "we", descriptor = "[Ldw;")
    private class715[] field6456 = new class715[10];

    @OriginalMember(owner = "client!gt", name = "yf", descriptor = "I")
    private int field6509 = 1;

    @OriginalMember(owner = "client!gt", name = "Af", descriptor = "I")
    public int field6511 = 0;

    @OriginalMember(owner = "client!gt", name = "rf", descriptor = "I")
    public int field6502 = 0;

    @OriginalMember(owner = "client!gt", name = "ff", descriptor = "I")
    private int field6491 = 0;

    @OriginalMember(owner = "client!gt", name = "Ye", descriptor = "F")
    private float field6484 = 1.0F;

    @OriginalMember(owner = "client!gt", name = "Ie", descriptor = "I")
    public int field6468 = 0;

    @OriginalMember(owner = "client!gt", name = "kf", descriptor = "F")
    public float field6495 = 3584.0F;

    @OriginalMember(owner = "client!gt", name = "Lf", descriptor = "Z")
    private boolean field6522 = false;

    @OriginalMember(owner = "client!gt", name = "qf", descriptor = "Z")
    public boolean field6501 = false;

    @OriginalMember(owner = "client!gt", name = "Ce", descriptor = "[F")
    private float[] field6462 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gt", name = "Kf", descriptor = "I")
    public int field6521 = 0;

    @OriginalMember(owner = "client!gt", name = "Oe", descriptor = "F")
    public float field6474 = 1.0F;

    @OriginalMember(owner = "client!gt", name = "Pf", descriptor = "Z")
    private boolean field6526 = false;

    @OriginalMember(owner = "client!gt", name = "Nf", descriptor = "[F")
    private float[] field6524 = new float[16];

    @OriginalMember(owner = "client!gt", name = "tf", descriptor = "I")
    public int field6504 = 128;

    @OriginalMember(owner = "client!gt", name = "ag", descriptor = "I")
    private int field6537 = 0;

    @OriginalMember(owner = "client!gt", name = "Yf", descriptor = "Z")
    private boolean field6535 = false;

    @OriginalMember(owner = "client!gt", name = "ue", descriptor = "[F")
    public float[] field6454 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!gt", name = "Gf", descriptor = "Z")
    public boolean field6517 = false;

    @OriginalMember(owner = "client!gt", name = "If", descriptor = "Z")
    private boolean field6519 = false;

    @OriginalMember(owner = "client!gt", name = "fg", descriptor = "I")
    public int field6542 = -1;

    @OriginalMember(owner = "client!gt", name = "Tf", descriptor = "[F")
    private float[] field6530 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gt", name = "gf", descriptor = "F")
    public float field6492 = 3584.0F;

    @OriginalMember(owner = "client!gt", name = "Cf", descriptor = "Z")
    public boolean field6513 = true;

    @OriginalMember(owner = "client!gt", name = "Qf", descriptor = "I")
    public int field6527 = 512;

    @OriginalMember(owner = "client!gt", name = "Wf", descriptor = "I")
    public int field6533 = 50;

    @OriginalMember(owner = "client!gt", name = "dg", descriptor = "[F")
    public float[] field6540 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gt", name = "eg", descriptor = "Z")
    public boolean field6541 = true;

    @OriginalMember(owner = "client!gt", name = "Ne", descriptor = "Z")
    public boolean field6473 = false;

    @OriginalMember(owner = "client!gt", name = "Zf", descriptor = "F")
    public float field6536 = 1.0F;

    @OriginalMember(owner = "client!gt", name = "Xf", descriptor = "Z")
    public boolean field6534 = true;

    @OriginalMember(owner = "client!gt", name = "Uf", descriptor = "I")
    public int field6531 = 0;

    @OriginalMember(owner = "client!gt", name = "uf", descriptor = "I")
    public int field6505 = 0;

    @OriginalMember(owner = "client!gt", name = "hg", descriptor = "I")
    public int field6544 = 512;

    @OriginalMember(owner = "client!gt", name = "Jf", descriptor = "Z")
    public boolean field6520 = false;

    @OriginalMember(owner = "client!gt", name = "Of", descriptor = "[F")
    private float[] field6525 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gt", name = "Je", descriptor = "I")
    private int field6469 = 16777215;

    @OriginalMember(owner = "client!gt", name = "Vf", descriptor = "Lsn;")
    public class628 field6532 = class59.field1111;

    @OriginalMember(owner = "client!gt", name = "kg", descriptor = "F")
    public float field6547 = 1.0F;

    @OriginalMember(owner = "client!gt", name = "Ve", descriptor = "I")
    private int field6481 = -1;

    @OriginalMember(owner = "client!gt", name = "Rf", descriptor = "Z")
    private boolean field6528 = false;

    @OriginalMember(owner = "client!gt", name = "lg", descriptor = "I")
    public int field6548 = 0;

    @OriginalMember(owner = "client!gt", name = "ng", descriptor = "I")
    private int field6550 = -1;

    @OriginalMember(owner = "client!gt", name = "ye", descriptor = "Z")
    public boolean field6458 = true;

    @OriginalMember(owner = "client!gt", name = "Se", descriptor = "[F")
    public float[] field6478 = this.field6525;

    @OriginalMember(owner = "client!gt", name = "ig", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6545 = new Stream();

    @OriginalMember(owner = "client!gt", name = "sg", descriptor = "Lfba;")
    private class25 field6555 = new class25();

    @OriginalMember(owner = "client!gt", name = "Gb", descriptor = "Ljava/lang/Object;")
    public Object field6310;

    @OriginalMember(owner = "client!gt", name = "Nb", descriptor = "Ljava/lang/Object;")
    private Object field6317;

    @OriginalMember(owner = "client!gt", name = "be", descriptor = "Leq;")
    public class209 field6435;

    @OriginalMember(owner = "client!gt", name = "Id", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6416;

    @OriginalMember(owner = "client!gt", name = "wd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6404;

    @OriginalMember(owner = "client!gt", name = "Bf", descriptor = "I")
    public int field6512;

    @OriginalMember(owner = "client!gt", name = "xd", descriptor = "I")
    private int field6405;

    @OriginalMember(owner = "client!gt", name = "ud", descriptor = "I")
    public int field6402;

    @OriginalMember(owner = "client!gt", name = "Ob", descriptor = "I")
    private int field6318;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public int field6252;

    @OriginalMember(owner = "client!gt", name = "nf", descriptor = "I")
    public int field6498;

    @OriginalMember(owner = "client!gt", name = "zb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field6303;

    @OriginalMember(owner = "client!gt", name = "jf", descriptor = "Lmv;")
    private class373 field6494;

    @OriginalMember(owner = "client!gt", name = "Pc", descriptor = "Lqe;")
    public static class465 field6371 = new class465(86, 1);

    @OriginalMember(owner = "client!gt", name = "se", descriptor = "F")
    public float field6452;

    @OriginalMember(owner = "client!gt", name = "xe", descriptor = "F")
    private float field6457;

    @OriginalMember(owner = "client!gt", name = "Me", descriptor = "F")
    public float field6472;

    @OriginalMember(owner = "client!gt", name = "of", descriptor = "F")
    public float field6499;

    @OriginalMember(owner = "client!gt", name = "pf", descriptor = "F")
    public float field6500;

    @OriginalMember(owner = "client!gt", name = "xf", descriptor = "F")
    public float field6508;

    @OriginalMember(owner = "client!gt", name = "Ff", descriptor = "F")
    public float field6516;

    @OriginalMember(owner = "client!gt", name = "og", descriptor = "F")
    private float field6551;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!gt", name = "W", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!gt", name = "X", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!gt", name = "Y", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!gt", name = "Z", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!gt", name = "ab", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!gt", name = "bb", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!gt", name = "cb", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!gt", name = "db", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!gt", name = "eb", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!gt", name = "fb", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!gt", name = "gb", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!gt", name = "hb", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!gt", name = "ib", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!gt", name = "jb", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!gt", name = "kb", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!gt", name = "lb", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!gt", name = "mb", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!gt", name = "nb", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!gt", name = "ob", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!gt", name = "pb", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!gt", name = "qb", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!gt", name = "rb", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!gt", name = "tb", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!gt", name = "ub", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!gt", name = "vb", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!gt", name = "wb", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!gt", name = "xb", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!gt", name = "yb", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!gt", name = "Ab", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!gt", name = "Bb", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!gt", name = "Cb", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!gt", name = "Db", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!gt", name = "Eb", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!gt", name = "Fb", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!gt", name = "Hb", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!gt", name = "Ib", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!gt", name = "Jb", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!gt", name = "Kb", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!gt", name = "Lb", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!gt", name = "Mb", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!gt", name = "Pb", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!gt", name = "Qb", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!gt", name = "Rb", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!gt", name = "Sb", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!gt", name = "Tb", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!gt", name = "Ub", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!gt", name = "Vb", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!gt", name = "Wb", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!gt", name = "Xb", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!gt", name = "Yb", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!gt", name = "Zb", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!gt", name = "ac", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!gt", name = "bc", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!gt", name = "cc", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!gt", name = "dc", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!gt", name = "ec", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!gt", name = "gc", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!gt", name = "hc", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!gt", name = "ic", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!gt", name = "jc", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!gt", name = "lc", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!gt", name = "mc", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!gt", name = "nc", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!gt", name = "oc", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!gt", name = "pc", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!gt", name = "qc", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!gt", name = "rc", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!gt", name = "sc", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!gt", name = "tc", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!gt", name = "uc", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!gt", name = "vc", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!gt", name = "wc", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!gt", name = "xc", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!gt", name = "yc", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!gt", name = "zc", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!gt", name = "Ac", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!gt", name = "Bc", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!gt", name = "Cc", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!gt", name = "Dc", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!gt", name = "Ec", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!gt", name = "Fc", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!gt", name = "Gc", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!gt", name = "Hc", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!gt", name = "Ic", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!gt", name = "Jc", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!gt", name = "Kc", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!gt", name = "Lc", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!gt", name = "Nc", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!gt", name = "Oc", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!gt", name = "Qc", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!gt", name = "Rc", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!gt", name = "Sc", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!gt", name = "Tc", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!gt", name = "Uc", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!gt", name = "Vc", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!gt", name = "Wc", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!gt", name = "Xc", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!gt", name = "Yc", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!gt", name = "Zc", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!gt", name = "ad", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!gt", name = "bd", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!gt", name = "cd", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!gt", name = "ed", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!gt", name = "fd", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!gt", name = "gd", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!gt", name = "hd", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!gt", name = "id", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!gt", name = "jd", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!gt", name = "kd", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!gt", name = "ld", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!gt", name = "md", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!gt", name = "nd", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!gt", name = "od", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!gt", name = "pd", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!gt", name = "qd", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!gt", name = "rd", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!gt", name = "sd", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!gt", name = "td", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!gt", name = "vd", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!gt", name = "yd", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!gt", name = "zd", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!gt", name = "Ad", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!gt", name = "Bd", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!gt", name = "Cd", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!gt", name = "Dd", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!gt", name = "Ed", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!gt", name = "Fd", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!gt", name = "Gd", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!gt", name = "Hd", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!gt", name = "Jd", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!gt", name = "Kd", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!gt", name = "Ld", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!gt", name = "Md", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!gt", name = "Nd", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!gt", name = "Od", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!gt", name = "Pd", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!gt", name = "Qd", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!gt", name = "Rd", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!gt", name = "Sd", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!gt", name = "Td", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!gt", name = "Ud", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!gt", name = "Vd", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!gt", name = "Wd", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!gt", name = "Xd", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!gt", name = "Yd", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!gt", name = "Zd", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!gt", name = "ae", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!gt", name = "ce", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!gt", name = "de", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!gt", name = "ee", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!gt", name = "fe", descriptor = "I")
    public int field6439;

    @OriginalMember(owner = "client!gt", name = "ge", descriptor = "I")
    public int field6440;

    @OriginalMember(owner = "client!gt", name = "ie", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!gt", name = "je", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!gt", name = "le", descriptor = "I")
    public int field6445;

    @OriginalMember(owner = "client!gt", name = "De", descriptor = "I")
    public int field6463;

    @OriginalMember(owner = "client!gt", name = "Ee", descriptor = "I")
    public int field6464;

    @OriginalMember(owner = "client!gt", name = "Te", descriptor = "I")
    public int field6479;

    @OriginalMember(owner = "client!gt", name = "We", descriptor = "I")
    public int field6482;

    @OriginalMember(owner = "client!gt", name = "cf", descriptor = "I")
    private int field6488;

    @OriginalMember(owner = "client!gt", name = "mf", descriptor = "I")
    private int field6497;

    @OriginalMember(owner = "client!gt", name = "sf", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!gt", name = "Mf", descriptor = "I")
    public int field6523;

    @OriginalMember(owner = "client!gt", name = "cg", descriptor = "I")
    public int field6539;

    @OriginalMember(owner = "client!gt", name = "jg", descriptor = "I")
    public int field6546;

    @OriginalMember(owner = "client!gt", name = "Mg", descriptor = "I")
    private int field6575;

    @OriginalMember(owner = "client!gt", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!gt", name = "pg", descriptor = "Lhi;")
    public class203 field6552;

    @OriginalMember(owner = "client!gt", name = "qg", descriptor = "Lhi;")
    public class203 field6553;

    @OriginalMember(owner = "client!gt", name = "vg", descriptor = "Lhi;")
    private class203 field6558;

    @OriginalMember(owner = "client!gt", name = "wg", descriptor = "Lhi;")
    public class203 field6559;

    @OriginalMember(owner = "client!gt", name = "xg", descriptor = "Lhi;")
    public class203 field6560;

    @OriginalMember(owner = "client!gt", name = "Gg", descriptor = "Lhi;")
    private class203 field6569;

    @OriginalMember(owner = "client!gt", name = "Jg", descriptor = "Lhi;")
    private class203 field6572;

    @OriginalMember(owner = "client!gt", name = "Fg", descriptor = "Lida;")
    private class234 field6568;

    @OriginalMember(owner = "client!gt", name = "Ag", descriptor = "Lcaa;")
    private class302 field6563;

    @OriginalMember(owner = "client!gt", name = "Hg", descriptor = "Lcaa;")
    private class302 field6570;

    @OriginalMember(owner = "client!gt", name = "Ig", descriptor = "Lcaa;")
    private class302 field6571;

    @OriginalMember(owner = "client!gt", name = "bf", descriptor = "Ldj;")
    private class342 field6487;

    @OriginalMember(owner = "client!gt", name = "kc", descriptor = "Lwv;")
    public class34 field6340;

    @OriginalMember(owner = "client!gt", name = "Sf", descriptor = "Ldu;")
    public class355 field6529;

    @OriginalMember(owner = "client!gt", name = "rg", descriptor = "Ltv;")
    public class557 field6554;

    @OriginalMember(owner = "client!gt", name = "tg", descriptor = "Ltv;")
    public class557 field6556;

    @OriginalMember(owner = "client!gt", name = "ug", descriptor = "Ltv;")
    public class557 field6557;

    @OriginalMember(owner = "client!gt", name = "yg", descriptor = "Ltv;")
    public class557 field6561;

    @OriginalMember(owner = "client!gt", name = "zg", descriptor = "Ltv;")
    public class557 field6562;

    @OriginalMember(owner = "client!gt", name = "Bg", descriptor = "Ltv;")
    public class557 field6564;

    @OriginalMember(owner = "client!gt", name = "Cg", descriptor = "Ltv;")
    public class557 field6565;

    @OriginalMember(owner = "client!gt", name = "Dg", descriptor = "Ltv;")
    public class557 field6566;

    @OriginalMember(owner = "client!gt", name = "Eg", descriptor = "Ltv;")
    public class557 field6567;

    @OriginalMember(owner = "client!gt", name = "Kg", descriptor = "Ltv;")
    public class557 field6573;

    @OriginalMember(owner = "client!gt", name = "Ge", descriptor = "Ldw;")
    private class715 field6466;

    @OriginalMember(owner = "client!gt", name = "gg", descriptor = "Lnca;")
    private class750 field6543;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6263;

    @OriginalMember(owner = "client!gt", name = "dd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field6385;

    @OriginalMember(owner = "client!gt", name = "sb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6296;

    @OriginalMember(owner = "client!gt", name = "Fe", descriptor = "Z")
    public boolean field6465;

    @OriginalMember(owner = "client!gt", name = "zf", descriptor = "Z")
    public boolean field6510;

    @OriginalMember(owner = "client!gt", name = "Hf", descriptor = "Z")
    public boolean field6518;

    @OriginalMember(owner = "client!gt", name = "bg", descriptor = "Z")
    public boolean field6538;

    @OriginalMember(owner = "client!gt", name = "mg", descriptor = "Z")
    public boolean field6549;

    @OriginalMember(owner = "client!gt", name = "Lg", descriptor = "Z")
    public boolean field6574;

    @OriginalMember(owner = "client!gt", name = "Mc", descriptor = "[I")
    public static int[] field6368;

    @OriginalMember(owner = "client!gt", name = "Ef", descriptor = "[Lfga;")
    public class254[] field6515;

    @OriginalMember(owner = "client!gt", name = "af", descriptor = "[Lfba;")
    public class25[] field6486;

    @OriginalMember(owner = "client!gt", name = "Df", descriptor = "[Ldu;")
    private class355[] field6514;

    @OriginalMember(owner = "client!gt", name = "Le", descriptor = "[Lrr;")
    public class361[] field6471;

    @OriginalMember(owner = "client!gt", name = "df", descriptor = "[Lrr;")
    public class361[] field6489;

    @OriginalMember(owner = "client!gt", name = "Ke", descriptor = "[Lbh;")
    public class36[] field6470;

    @OriginalMember(owner = "client!gt", name = "ra", descriptor = "(IIII)V")
    public final void method639(int arg0, int arg1, int arg2, int arg3) {
        this.field6488 = arg0;
        this.field6481 = arg2;
        this.field6480 = arg1;
        this.field6538 = true;
        ++field6366;
        this.field6537 = arg3;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)V")
    public abstract void method1053(byte arg0);

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "()I")
    public final int method534() {
        ++field6392;
        return this.field6533;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)V")
    private final void method2696(byte arg0) {
        ++field6414;
        if (arg0 <= 125) {
            this.method559(-30);
        }
        this.field6495 = (float) this.field6483;
    }

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "(ILaa;II)V")
    public final void method523(int arg0, class484 arg1, int arg2, int arg3) {
        ++field6391;
        class613 var5 = (class613) arg1;
        class636 var6 = var5.field8869;
        this.method2777((byte) 45);
        this.method2732(-86, var6);
        this.method2738(-102, 1);
        this.method2769(class140.field2165, class140.field2165, 18721);
        this.method2767(0, 25103, class142.field2176);
        this.method2730(arg0, -32755);
        this.field6441.method179(0.0F, (float) this.field6252, false, (float) this.field6402);
        this.method2698(0);
        this.field6486[0].method179(1.0F, var6.method423(31272, (float) this.field6252), false, var6.method432((float) this.field6402, -12086));
        this.field6486[0].method170(var6.method432((float) (-arg3), -12086), (byte) 95, var6.method423(31272, (float) (-arg2)), 0.0F);
        this.field6515[0] = class56.field1049;
        this.method2707(-12475);
        this.method2757(2);
        this.method2763((byte) -108);
        this.method2767(0, 25103, class68.field1225);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IF)V")
    public final void method2697(int arg0, float arg1) {
        if (arg0 < 58) {
            this.field6508 = 0.38430908F;
        }
        if (this.field6484 != arg1) {
            this.field6484 = arg1;
            this.method2712((byte) -118);
        }
        ++field6269;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLcv;)V")
    public abstract void method1040(byte arg0, class565 arg1);

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
    public final void method2698(int arg0) {
        this.field6444 = false;
        if (arg0 != 0) {
            this.method2763((byte) 4);
        }
        ++field6374;
        this.method2754(8);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lfga;I)V")
    public final void method2699(class254 arg0, int arg1) {
        this.field6515[this.field6451] = arg0;
        int var3 = -124 / ((68 - arg1) / 45);
        ++field6255;
        this.method2707(-12475);
    }

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "(I)V")
    public final void method2700(int arg0) {
        ++field6253;
        if (arg0 == 9) {
            if (class59.field1111 != this.field6532) {
                class628 var2 = this.field6532;
                this.field6532 = class59.field1111;
                if (var2.method3626(17)) {
                    this.method2758((byte) 127);
                }
                this.field6497 &= -32;
                this.field6478 = this.field6525;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)V")
    public abstract void method1038(byte arg0);

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(B)V")
    public abstract void method1063(byte arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method572(Canvas arg0, int arg1, int arg2) {
        ++field6421;
        Object var4 = null;
        if (arg0 != null && this.field6416 != arg0) {
            if (this.field6296.containsKey(arg0)) {
                var4 = this.field6296.get(arg0);
            }
        } else {
            var4 = this.field6317;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method1034(var4, 15, arg0);
            if (this.field6404 == arg0) {
                this.method2702(true);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(B)V")
    private final void method2701(byte arg0) {
        ++field6430;
        this.field6563 = this.method1036((byte) -88, false);
        this.field6563.method1497(28, 140, -29407);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field6563.method1492((byte) -20, true);
            if (var3 != null) {
                Stream var4 = this.method2764(var3, (byte) -76);
                if (!Stream.method3762()) {
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(1.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(1.0F);
                    var4.method3770(0.0F);
                    var4.method3770(1.0F);
                    var4.method3770(1.0F);
                    var4.method3770(1.0F);
                    var4.method3770(0.0F);
                    var4.method3770(1.0F);
                    var4.method3770(1.0F);
                    var4.method3770(1.0F);
                    var4.method3770(1.0F);
                    var4.method3770(1.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(1.0F);
                    var4.method3770(0.0F);
                    var4.method3770(1.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                    var4.method3770(0.0F);
                } else {
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(1.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(1.0F);
                    var4.method3774(0.0F);
                    var4.method3774(1.0F);
                    var4.method3774(1.0F);
                    var4.method3774(1.0F);
                    var4.method3774(0.0F);
                    var4.method3774(1.0F);
                    var4.method3774(1.0F);
                    var4.method3774(1.0F);
                    var4.method3774(1.0F);
                    var4.method3774(1.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(1.0F);
                    var4.method3774(0.0F);
                    var4.method3774(1.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                }
                var4.method3761();
                if (this.field6563.method1494(5069)) {
                    break;
                }
            }
        }
        if (arg0 < 119) {
            this.field6462 = null;
        }
        this.field6569 = this.method1006(50, new class328[] { new class328(new class674[] { class674.field9457, class674.field9462, class674.field9462 }) });
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1025(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILtaa;ZI)V")
    public abstract void method1009(int arg0, class405 arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(Z)V")
    private final void method2702(boolean arg0) {
        if (this.field6404 == null) {
            this.field6318 = this.field6405 = 1;
        } else {
            Dimension var2 = this.field6404.getSize();
            this.field6318 = var2.width;
            this.field6405 = var2.height;
        }
        ++field6351;
        this.field6402 = this.field6405;
        this.field6252 = this.field6318;
        this.method2778(0);
        this.method2725((byte) 61);
        if (!arg0) {
            this.method640(-23, 27, -12, -68, 107);
        }
        this.method2712((byte) -72);
        this.method1019(-126);
        this.method2772(128);
        this.method2700(9);
        this.method601();
    }

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "(I)V")
    public abstract void method1027(int arg0);

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "(B)V")
    public abstract void method1043(byte arg0);

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "()Z")
    public final boolean method560() {
        ++field6362;
        return true;
    }

    @OriginalMember(owner = "client!gt", name = "za", descriptor = "(IIIII)V")
    public final void method640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2718(-965);
        ++field6272;
        this.method2730(arg3, -32755);
        this.method2767(0, 25103, class142.field2176);
        this.method2755(false, 0, class142.field2176);
        this.method2738(-81, arg4);
        this.field6441.method179(1.0F, (float) arg2, false, (float) arg2);
        this.field6441.method149(arg0, arg1, 0);
        this.method2698(0);
        this.method1031(false, false);
        this.method1059(this.field6570, 0, -122);
        this.method1014(this.field6558, false);
        this.method1022(class442.field6159, -124, 256, 0);
        this.method1031(false, true);
        this.method2755(false, 0, class68.field1225);
        this.method2767(0, 25103, class68.field1225);
    }

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "(I)V")
    public void method1023(int arg0) {
        ++field6308;
        if (arg0 >= 96) {
            this.field6523 = this.field6503;
            this.field6503 = 0;
        }
    }

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "(I)V")
    public static void method2703(int arg0) {
        if (arg0 != -13389) {
            field6328 = -93;
        }
        field6368 = null;
        field6371 = null;
    }

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "()Z")
    public final boolean method600() {
        ++field6280;
        return this.field6510;
    }

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "(B)V")
    public abstract void method1041(byte arg0);

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method607(Canvas arg0) {
        ++field6369;
        if (this.field6416 == arg0) {
            throw new RuntimeException();
        } else if (this.field6296.containsKey(arg0)) {
            this.method1025(-88, arg0, this.field6296.get(arg0));
            this.field6296.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "(I)V")
    private final void method2704(int arg0) {
        ++field6304;
        this.method1059(this.field6571, arg0, -96);
        this.method1014(this.field6572, false);
        this.method1022(class136.field2115, arg0 + -118, 1, 0);
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V")
    public void method566(int arg0) {
        ++field6427;
        if (this.field6494 != null) {
            this.field6494.method2348((byte) 99);
        }
        this.field6479 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lww;IIII)Lka;")
    public final class469 method646(class729 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6331;
        return new class557(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "(I)V")
    public abstract void method1052(int arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[F)[F")
    public final float[] method2705(int arg0, float[] arg1) {
        arg1[4] = this.field6478[1];
        arg1[8] = this.field6478[2];
        int var3 = -19 % ((arg0 - 62) / 46);
        arg1[0] = this.field6478[0];
        arg1[12] = this.field6478[3];
        ++field6419;
        arg1[9] = this.field6478[6];
        arg1[2] = this.field6478[8];
        arg1[5] = this.field6478[5];
        arg1[13] = this.field6478[7];
        arg1[1] = this.field6478[4];
        arg1[7] = this.field6478[13];
        arg1[6] = this.field6478[9];
        arg1[3] = this.field6478[12];
        arg1[10] = this.field6478[10];
        arg1[14] = this.field6478[11];
        arg1[15] = this.field6478[15];
        arg1[11] = this.field6478[14];
        return arg1;
    }

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "(I)V")
    public final void method2706(int arg0) {
        ++field6267;
        if (arg0 < 35) {
            this.field6518 = false;
        }
        Hashtable var2 = new Hashtable();
        if (this.field6296 != null && !this.field6296.isEmpty()) {
            Enumeration var3 = this.field6296.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1058(var4, (byte) 94));
            }
        }
        this.field6296 = var2;
        this.method2701((byte) 124);
        this.method2774((byte) 69);
        this.method2752(-121);
        this.field6487.method2165(this, (byte) 51);
    }

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "()Z")
    public final boolean method589() {
        ++field6342;
        return true;
    }

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "(I)V")
    public final void method591(int arg0) {
        ++field6298;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gt", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method522(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6274;
        boolean var7 = ~this.field6469 != ~arg0;
        if (var7 || this.field6507 != arg1 || this.field6455 != arg2) {
            this.field6469 = arg0;
            this.field6507 = arg1;
            this.field6455 = arg2;
            if (var7) {
                this.field6474 = (float) (this.field6469 & 16711680) / 1.671168E7F;
                this.field6547 = (float) (this.field6469 & 255) / 255.0F;
                this.field6536 = (float) (65280 & this.field6469) / 65280.0F;
                this.method1051(Integer.MIN_VALUE);
            }
            this.field6303.setSunColour(this.field6474, this.field6536, this.field6547, arg1, arg2);
            this.method1012((byte) 46);
        }
        if (this.field6462[0] != arg3 || this.field6462[1] != arg4 || this.field6462[2] != arg5) {
            this.field6462[2] = arg5;
            this.field6462[0] = arg3;
            this.field6462[1] = arg4;
            this.field6530[2] = -arg5;
            this.field6530[0] = -arg3;
            this.field6530[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6540[2] = arg5 * var8;
            this.field6540[0] = arg3 * var8;
            this.field6540[1] = arg4 * var8;
            this.field6454[0] = -this.field6540[0];
            this.field6454[2] = -this.field6540[2];
            this.field6454[1] = -this.field6540[1];
            this.field6303.setSunDirection(this.field6540[0], this.field6540[1], this.field6540[2]);
            this.method1053((byte) 127);
            this.field6482 = (int) (arg3 * 256.0F / arg4);
            this.field6464 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1029(9);
    }

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "(I)V")
    private final void method2707(int arg0) {
        this.method1063((byte) 125);
        if (arg0 != -12475) {
            this.method1010(false);
        }
        ++field6270;
        if (this.field6466 != null) {
            this.field6466.method888(false);
        }
    }

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "(I)V")
    public final void method2708(int arg0) {
        if (arg0 == 0) {
            ++field6396;
            if (this.field6497 != 16) {
                this.method2762(arg0 ^ -128);
                this.method2749(true, true);
                this.method2736(12485, true);
                this.method2715(true, -36);
                this.method2738(-82, 1);
                this.field6497 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "()V")
    public final void method565() {
        if (this.field6494 != null) {
            this.field6494.method2350(32025);
        }
        ++field6380;
    }

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "(I)V")
    public void method1048(int arg0) {
        this.method2724(arg0 ^ arg0);
        ++field6356;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BZ)Lcaa;")
    public abstract class302 method1036(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIF)Lbh;")
    public final class36 method577(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6417;
        return new class40(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lsfa;)V")
    public final void method587(class693 arg0) {
        ++field6345;
        this.field6543 = (class750) arg0;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
    public final void method559(int arg0) {
        ++field6260;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field6494 != null) {
                this.field6494.method2350(32025);
            }
            this.field6504 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "(I)V")
    private final void method2709(int arg0) {
        if (!this.field6528) {
            float[] var2 = this.field6476;
            float var3 = (float) this.field6533;
            float var4 = (float) this.field6483;
            float var5 = (float) (-this.field6502) * this.field6484 / (float) this.field6544;
            float var6 = (float) (-this.field6475) * this.field6484 / (float) this.field6527;
            float var7 = (float) (-this.field6475 + this.field6252) * this.field6484 / (float) this.field6527;
            float var8 = (float) (-this.field6502 + this.field6402) * this.field6484 / (float) this.field6544;
            if (var6 != var7 && var5 != var8) {
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[1] = 0.0F;
                var2[14] = var3 / (var3 - var4);
                var2[5] = 2.0F / (-var5 + var8);
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[0] = 2.0F / (-var6 + var7);
                var2[6] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[4] = 0.0F;
            } else {
                var2[14] = 0.0F;
                var2[15] = 1.0F;
                var2[3] = 0.0F;
                var2[0] = 1.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
            }
            this.method2696((byte) 127);
            this.field6528 = true;
        }
        if (arg0 == 13) {
            ++field6410;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZBIIZI)V")
    private final void method2710(boolean arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field6293;
        boolean var7 = arg0 & this.method627();
        if (arg1 > -13) {
            this.field6335 = null;
        }
        if (!var7 && (~arg3 == -5 || arg3 == 8 || arg3 == 9)) {
            arg3 = 2;
            arg2 = ~arg3 != -5 ? 1 : arg5 & 1;
            arg5 = 0;
        }
        if (arg3 != 0 && arg4) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (~this.field6460 != ~arg3) {
            if (~this.field6460 != -1) {
                this.field6456[this.field6460 & Integer.MAX_VALUE].method689(3);
            }
            if (arg3 != 0) {
                this.field6466 = this.field6456[Integer.MAX_VALUE & arg3];
                this.field6466.method691(arg4, 4);
                this.field6466.method686((byte) -127, arg4);
                this.field6466.method687(arg5, 1782, arg2);
            } else {
                this.field6466 = null;
            }
            this.field6460 = arg3;
            this.field6506 = arg2;
            this.field6491 = arg5;
        } else if (~this.field6460 != -1) {
            this.field6456[this.field6460 & Integer.MAX_VALUE].method686((byte) -115, arg4);
            if (this.field6491 != arg5 || this.field6506 != arg2) {
                this.field6456[Integer.MAX_VALUE & this.field6460].method687(arg5, 1782, arg2);
                this.field6491 = arg5;
                this.field6506 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "(B)V")
    public abstract void method1012(byte arg0);

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "(I)V")
    public final void method2711(int arg0) {
        this.field6441.method181();
        ++field6349;
        this.field6444 = true;
        if (arg0 > -46) {
            this.field6506 = -79;
        }
        this.method2754(8);
    }

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "(I)V")
    public final void method608(int arg0) {
        ++field6357;
    }

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "(B)V")
    public abstract void method1062(byte arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([IIIIIZ)Lkr;")
    public final class743 method620(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6258;
        return new class204(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "(B)V")
    private final void method2712(byte arg0) {
        this.field6528 = false;
        if (arg0 > -49) {
            this.field6553 = null;
        }
        ++field6413;
        this.method2709(13);
        if (class139.field2158 == this.field6532) {
            this.method2739(true);
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "()Lkd;")
    public final class280 method558() {
        ++field6322;
        return new class25();
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZIBIIIII)Z")
    public static final boolean method2713(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6409;
        int var9 = class468.field6748.field991[0];
        int var10 = class468.field6748.field995[0];
        if (var9 >= 0 && var9 < class174.field2540 && ~var10 <= -1 && var10 < class716.field9999) {
            if (~arg6 <= -1 && ~arg6 > ~class174.field2540 && arg7 >= 0 && ~arg7 > ~class716.field9999) {
                int var11 = class60.method666(arg8, arg4, arg2, var10, class595.field8703, arg1, class468.field6748.method482(false), arg6, arg5, arg7, class630.field9041[class468.field6748.field649], true, class63.field1148, arg0, var9);
                if (var11 < 1) {
                    return false;
                } else {
                    class318.field4513 = class63.field1148[var11 - 1];
                    class334.field4722 = class595.field8703[var11 + -1];
                    class726.field10161 = false;
                    class257.method1745(23836);
                    int var12 = 96 % ((-54 - arg3) / 40);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Lida;")
    public final class234 method2714(int arg0, byte arg1) {
        if (arg0 * 2 > this.field6568.method1491(-112)) {
            this.field6568.method1600(arg0, 89);
        }
        ++field6316;
        if (arg1 != 19) {
            this.field6405 = 127;
        }
        return this.field6568;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZZBILtaa;)V")
    public abstract void method1020(boolean arg0, boolean arg1, byte arg2, int arg3, class405 arg4);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZI)V")
    public final void method2715(boolean arg0, int arg1) {
        if (arg1 > -18) {
            this.method1014((class203) null, true);
        }
        if (!this.field6473 != !arg0) {
            this.field6473 = arg0;
            this.method1017(0);
            this.field6497 &= -32;
        }
        ++field6290;
    }

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "(B)V")
    public final void method2716(byte arg0) {
        this.method2700(9);
        ++field6266;
        if (arg0 >= -37) {
            this.field6512 = -53;
        }
        this.method2739(true);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class278 method621(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6329;
        return new class186(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[I[I)Laa;")
    public final class484 method573(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6287;
        return class748.method4161(arg1, arg3, true, arg0, arg2, this);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BB)V")
    public final void method2717(byte arg0, byte arg1) {
        if (arg0 != 27) {
            this.field6451 = 124;
        }
        ++field6355;
        this.method2730(arg1 | arg1 << 8 | arg1 << 16 | arg1 << 24, -32755);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lkca;IBI[BI)Lii;")
    public abstract class550 method1060(class82 arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "(III[I)V")
    public final void method592(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6422;
        float var5 = this.field6446.method189((float) arg0, (float) arg2, -1, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field6475;
            var7 = this.field6502;
        } else {
            var6 = (int) ((float) this.field6527 * this.field6446.method159((float) arg2, (float) arg0, (float) arg1, (byte) -4) / var5);
            var7 = (int) ((float) this.field6544 * this.field6446.method185((float) arg0, (float) arg2, -25147, (float) arg1) / var5);
        }
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 + -this.field6452);
        arg3[0] = (int) ((float) var6 + -this.field6516);
    }

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "(I)V")
    private final void method2718(int arg0) {
        ++field6354;
        if (arg0 != -965) {
            this.field6456 = null;
        }
        if (this.field6497 != 1) {
            this.method2729(-25);
            this.method2749(false, true);
            this.method2747(false, 104);
            this.method2736(12485, false);
            this.method2715(false, -19);
            this.method2728(false, false, (byte) 23, -2);
            this.method2721(1, true);
            this.method2732(-117, this.field6529);
            this.field6497 = 1;
        }
    }

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "(I)V")
    public abstract void method1061(int arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[FLkca;IZ)Lwda;")
    public final class636 method2719(int arg0, int arg1, float[] arg2, class82 arg3, int arg4, boolean arg5) {
        ++field6319;
        if (arg0 != 6636) {
            this.method1041((byte) -43);
        }
        return this.method1032(arg2, arg1, 0, arg5, arg4, 0, arg3, -46);
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(II)I")
    public final int method614(int arg0, int arg1) {
        ++field6338;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III[IZIZ)Lwda;")
    public abstract class636 method1049(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "(B)I")
    public final int method2720(byte arg0) {
        if (arg0 > -50) {
            this.method641();
        }
        ++field6346;
        return this.field6481;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)V")
    public final void method2721(int arg0, boolean arg1) {
        if (!arg1) {
            this.field6451 = 126;
        }
        if (arg0 != 1) {
            if (~arg0 == -1) {
                this.method2769(class571.field8118, class571.field8118, 18721);
            } else if (~arg0 != -3) {
                if (arg0 == 3) {
                    this.method2769(class571.field8118, class316.field4492, 18721);
                } else if (~arg0 == -5) {
                    this.method2769(class306.field4313, class306.field4313, 18721);
                }
            } else {
                this.method2769(class140.field2165, class218.field3121, 18721);
            }
        } else {
            this.method2769(class140.field2165, class140.field2165, 18721);
        }
        ++field6251;
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "(I)Lfba;")
    public final class25 method2722(int arg0) {
        if (arg0 >= -88) {
            return null;
        } else {
            ++field6425;
            return this.field6486[this.field6451];
        }
    }

    @OriginalMember(owner = "client!gt", name = "da", descriptor = "(III[I)V")
    public final void method537(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6276;
        float var5 = this.field6446.method189((float) arg0, (float) arg2, -1, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field6475;
            var7 = this.field6502;
        } else {
            var6 = (int) ((float) this.field6527 * this.field6446.method159((float) arg2, (float) arg0, (float) arg1, (byte) -4) / var5);
            var7 = (int) ((float) this.field6544 * this.field6446.method185((float) arg0, (float) arg2, -25147, (float) arg1) / var5);
        }
        arg3[0] = (int) ((float) var6 + -this.field6516);
        arg3[1] = (int) ((float) var7 + -this.field6452);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "(I)V")
    private final void method2723(int arg0) {
        ++field6286;
        this.field6524[10] = this.field6551;
        this.field6524[14] = this.field6457;
        int var2 = -82 / ((-59 - arg0) / 48);
        this.field6492 = (this.field6524[14] + (float) (-this.field6483)) / this.field6524[10];
    }

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "()V")
    public void method638() {
        ++field6326;
        if (!this.field6522) {
            for (class626 var1 = this.field6335.method1522(true); var1 != null; var1 = this.field6335.method1527((byte) 115)) {
                ((class180) var1).method1291((byte) -105);
            }
            Enumeration var2 = this.field6296.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1025(-113, var3, this.field6296.get(var3));
            }
            class372.method2334(0, false, true);
            this.field6303.release();
            this.field6522 = true;
        }
    }

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "(II)V")
    public abstract void method1028(int arg0, int arg1);

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "(I)V")
    private final void method2724(int arg0) {
        ++field6393;
        this.method1051(Integer.MIN_VALUE);
        this.method1012((byte) 46);
        this.method1027(67);
        this.method1023(101);
        this.method1053((byte) 124);
        this.method1029(arg0 ^ 9);
        this.method1004(16);
        this.method1041((byte) -28);
        this.method1017(arg0);
        this.method1045(arg0 + 6);
        this.method1056(0);
        this.method1018((byte) 122);
        this.method1038((byte) -105);
        this.method1050((byte) 111);
        for (int var2 = this.field6546 - 1; var2 >= 0; --var2) {
            this.method2753((byte) -17, var2);
            this.method1044(120);
            this.method1021(-27512);
            this.method2763((byte) -126);
        }
        this.method1008((byte) 92);
        this.method1019(arg0 + -117);
        this.method1043((byte) -117);
        this.method1055(11030);
        this.method1062((byte) 121);
    }

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "(B)V")
    private final void method2725(byte arg0) {
        ++field6411;
        this.field6467 = false;
        if (arg0 != 61) {
            this.method596(121, -63, 4, 38);
        }
        this.method2734((byte) -44);
        if (class594.field8527 == this.field6532) {
            this.method2739(true);
        }
    }

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "(B)[F")
    public final float[] method2726(byte arg0) {
        if (arg0 != -128) {
            this.field6524 = null;
        }
        ++field6388;
        return this.field6525;
    }

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6343;
    }

    @OriginalMember(owner = "client!gt", name = "pa", descriptor = "()V")
    public final void method613() {
        ++field6332;
        this.field6538 = false;
    }

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "(I)V")
    public abstract void method1021(int arg0);

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "()Z")
    public final boolean method627() {
        ++field6352;
        return this.field6456[3].method690((byte) -3);
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(Z)I")
    public final int method2727(boolean arg0) {
        if (!arg0) {
            return -7;
        } else {
            ++field6389;
            return this.field6451;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZZBI)V")
    public final void method2728(boolean arg0, boolean arg1, byte arg2, int arg3) {
        if (~this.field6550 != ~arg3 || !this.field6538 == this.field6519) {
            class636 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field6538 ? 3 : 0;
            if (~arg3 > -1) {
                this.method2763((byte) -75);
            } else {
                var5 = this.field6494.method2349((byte) 29, arg3);
                class546 var10 = super.field1084.method1154(-125, arg3);
                if (var10.field7714 == 0 && ~var10.field7712 == -1) {
                    this.method2763((byte) -106);
                } else {
                    int var11 = var10.field7706 ? 64 : 128;
                    int var12 = var11 * 50;
                    class25 var13 = this.method2773((byte) -30);
                    var13.method180(6, (float) (this.field6479 % var12 * var10.field7714) / (float) var12, 0.0F, (float) (this.field6479 % var12 * var10.field7712) / (float) var12);
                    this.method2699(class56.field1049, -82);
                }
                if (!this.field6538) {
                    var7 = var10.field7694;
                    var9 = var10.field7711;
                    var8 = var10.field7697;
                }
                var6 = var10.field7695;
            }
            this.method2710(arg1, (byte) -108, var8, var9, arg0, var7);
            if (this.field6466 == null) {
                this.method2732(-115, var5);
                this.method2721(var6, true);
            } else {
                this.field6466.method693(-60, var5, var6);
            }
            this.field6519 = this.field6538;
            this.field6550 = arg3;
        }
        ++field6314;
        this.field6497 &= -8;
        if (arg2 != 23) {
            this.field6463 = 59;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method645(Canvas arg0, int arg1, int arg2) {
        ++field6299;
        if (this.field6416 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6296.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method1058(arg0, (byte) 87);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field6296.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "(I)V")
    private final void method2729(int arg0) {
        if (arg0 != -25) {
            this.method1006(-90, (class328[]) null);
        }
        if (class175.field2545 != this.field6532) {
            class628 var2 = this.field6532;
            this.field6532 = class175.field2545;
            if (var2.method3626(arg0 + 42)) {
                this.method2758((byte) -111);
            }
            this.method2743(arg0 + -10163);
            this.field6478 = this.field6461;
            this.method2739(true);
            this.field6497 &= -25;
        }
        ++field6350;
    }

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "(B)V")
    public abstract void method1008(byte arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public abstract Object method1058(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "(II)V")
    public final void method2730(int arg0, int arg1) {
        ++field6398;
        if (~this.field6463 != ~arg0) {
            this.field6463 = arg0;
            this.method1008((byte) 69);
        }
        if (arg1 != -32755) {
            this.field6461 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6262;
        float var10 = (float) (-arg0) + (float) arg2;
        float var11 = (float) (-arg1) + (float) arg3;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method2718(-965);
        this.method2730(arg4, -32755);
        this.method2767(0, 25103, class142.field2176);
        this.method2755(false, 0, class142.field2176);
        this.method2738(-118, arg5);
        this.method2711(-75);
        this.method1031(false, false);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (var14 > arg6) {
            var18 = (float) (arg6 - var14 + arg7) * var11;
            var17 = (float) (arg6 - var14 + arg7) * var12;
        } else {
            var20 = (float) (arg6 - var14) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg2 >= ~arg0) {
                if (var21 < (float) arg2) {
                    break;
                }
                if (var19 + var21 < (float) arg2) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if ((float) arg2 < var21) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 + -var21;
                }
            }
            if (~arg1 <= ~arg3) {
                if (var22 < (float) arg3) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            } else {
                if (var22 > (float) arg3) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method2745(var22, var20 + var22, var19 + var21, 0.0F, false, var21, 0.0F)) {
                return;
            }
            var21 += var19 + var23;
            var22 += var20 + var24;
            this.method2704(0);
            var20 = var16;
            var19 = var15;
        }
        this.method1031(false, true);
        this.method2755(false, 0, class68.field1225);
        this.method2767(0, 25103, class68.field1225);
    }

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "(I)V")
    public final void method2731(int arg0) {
        ++field6370;
        Enumeration var2 = this.field6296.keys();
        int var3 = -68 / ((-11 - arg0) / 54);
        while (var2.hasMoreElements()) {
            Canvas var4 = (Canvas) var2.nextElement();
            this.method1025(-58, var4, this.field6296.get(var4));
        }
        this.field6563.method1496(false);
        this.field6571.method1496(false);
        this.field6570.method1496(false);
        this.field6564.method3262(false);
        this.field6567.method3262(false);
        this.field6554.method3262(false);
        this.field6566.method3262(false);
        this.field6557.method3262(false);
        this.field6487.method2164(0);
        this.field6568.method1496(false);
    }

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "(I)V")
    public abstract void method1030(int arg0);

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "()Z")
    public final boolean method634() {
        ++field6265;
        return false;
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)Lza;")
    public final class411 method568(int arg0) {
        ++field6384;
        class180 var2 = new class180(arg0);
        this.field6335.method1526(var2, -24);
        return var2;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Loo;)V")
    public final void method593(class624 arg0) {
        this.field6487.method2166(this, arg0, -1, false);
        ++field6400;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZZ)V")
    public abstract void method1031(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "([I)V")
    public final void method624(int[] arg0) {
        arg0[3] = this.field6459;
        arg0[2] = this.field6521;
        ++field6279;
        arg0[1] = this.field6511;
        arg0[0] = this.field6468;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILdu;)V")
    public final void method2732(int arg0, class355 arg1) {
        if (arg0 < -51) {
            ++field6292;
            if (this.field6514[this.field6451] != arg1) {
                this.field6514[this.field6451] = arg1;
                if (arg1 != null) {
                    arg1.method980(-109);
                } else {
                    this.method1061(-118);
                }
                this.field6497 &= -2;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "(B)V")
    public abstract void method1050(byte arg0);

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(Z)I")
    public final int method2733(boolean arg0) {
        if (arg0) {
            this.field6572 = null;
        }
        ++field6412;
        return this.field6537;
    }

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "(B)V")
    private final void method2734(byte arg0) {
        if (arg0 == -44) {
            ++field6403;
            if (!this.field6467) {
                float[] var2 = this.field6524;
                float var3 = (float) (-this.field6475 * this.field6533) / (float) this.field6527;
                float var4 = (float) ((-this.field6475 + this.field6252) * this.field6533) / (float) this.field6527;
                float var5 = (float) (this.field6533 * this.field6502) / (float) this.field6544;
                float var6 = (float) ((-this.field6402 + this.field6502) * this.field6533) / (float) this.field6544;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field6533 * 2.0F;
                    var2[13] = 0.0F;
                    var2[12] = 0.0F;
                    var2[0] = var7 / (-var3 + var4);
                    var2[6] = 0.0F;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[7] = 0.0F;
                    var2[10] = this.field6551 = (float) this.field6483 / (float) (-this.field6483 + this.field6533);
                    var2[15] = 0.0F;
                    var2[1] = 0.0F;
                    var2[9] = (var5 + var6) / (-var6 + var5);
                    var2[14] = this.field6457 = (float) (this.field6533 * this.field6483) / (float) (-this.field6483 + this.field6533);
                    var2[11] = -1.0F;
                    var2[8] = (var3 + var4) / (var4 - var3);
                    var2[2] = 0.0F;
                    var2[5] = var7 / (-var6 + var5);
                } else {
                    var2[8] = 0.0F;
                    var2[7] = 0.0F;
                    var2[10] = 1.0F;
                    var2[9] = 0.0F;
                    var2[1] = 0.0F;
                    var2[5] = 1.0F;
                    var2[14] = 0.0F;
                    var2[0] = 1.0F;
                    var2[11] = 0.0F;
                    var2[4] = 0.0F;
                    var2[13] = 0.0F;
                    var2[15] = 1.0F;
                    var2[6] = 0.0F;
                    var2[2] = 0.0F;
                    var2[3] = 0.0F;
                    var2[12] = 0.0F;
                }
                this.method2723(-3);
                this.field6467 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[Lofa;)Lhi;")
    public abstract class203 method1006(int arg0, class328[] arg1);

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "(B)V")
    public abstract void method1033(byte arg0);

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "(B)V")
    public final void method2735(byte arg0) {
        if (this.field6497 != 4) {
            this.method2729(-25);
            this.method2749(false, true);
            this.method2747(false, arg0 + 133);
            this.method2736(arg0 + 12505, false);
            this.method2715(false, -98);
            this.method2728(false, false, (byte) 23, -2);
            this.method2738(arg0 ^ 87, 1);
            this.method2721(0, true);
            this.field6497 = 4;
        }
        if (arg0 == -20) {
            ++field6426;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lfw;Z)Lkr;")
    public final class743 method637(class55 arg0, boolean arg1) {
        ++field6291;
        class743 var10;
        if (arg0.field1044 != 0 && ~arg0.field1038 != -1) {
            int[] var3 = new int[arg0.field1044 * arg0.field1038];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field1040 == null) {
                for (int var6 = 0; arg0.field1038 > var6; ++var6) {
                    for (int var7 = 0; arg0.field1044 > var7; ++var7) {
                        int var8 = arg0.field1039[arg0.field1041[var4++] & 255];
                        var3[var5++] = ~var8 == -1 ? 0 : class164.method1221(var8, -16777216);
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field1038; ++var9) {
                    for (int var11 = 0; arg0.field1044 > var11; ++var11) {
                        var3[var5++] = class164.method1221(arg0.field1039[class555.method3246(arg0.field1041[var4], 255)], arg0.field1040[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method561(arg0.field1044, var3, 0, arg0.field1044, 54, arg0.field1038);
        } else {
            var10 = this.method561(1, new int[1], 0, 1, 109, 1);
        }
        var10.method87(arg0.field1042, arg0.field1036, arg0.field1037, arg0.field1043);
        return var10;
    }

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "(IIII)V")
    public final void method583(int arg0, int arg1, int arg2, int arg3) {
        ++field6285;
        boolean var5 = false;
        if (~this.field6468 > ~arg0) {
            this.field6468 = arg0;
            var5 = true;
        }
        if (arg2 < this.field6521) {
            this.field6521 = arg2;
            var5 = true;
        }
        if (this.field6511 < arg1) {
            var5 = true;
            this.field6511 = arg1;
        }
        if (~this.field6459 < ~arg3) {
            var5 = true;
            this.field6459 = arg3;
        }
        if (var5) {
            if (!this.field6574) {
                this.field6574 = true;
                this.method1052(-13771);
            }
            this.method1033((byte) -120);
            this.method2772(128);
        }
    }

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "(III)V")
    public final void method636(int arg0, int arg1, int arg2) {
        ++field6257;
        if (~this.field6542 != ~arg0 || this.field6477 != arg1 || this.field6505 != arg2) {
            this.field6477 = arg1;
            this.field6542 = arg0;
            this.field6505 = arg2;
            this.method2741(806);
            this.method1045(6);
        }
    }

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "(I)V")
    public abstract void method1044(int arg0);

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(IZ)Lida;")
    public abstract class234 method1047(int arg0, boolean arg1);

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(IZ)V")
    public final void method2736(int arg0, boolean arg1) {
        if (!this.field6517 == arg1) {
            this.field6517 = arg1;
            this.method1041((byte) -28);
            this.field6497 &= -32;
        }
        if (arg0 != 12485) {
            this.field6562 = null;
        }
        ++field6443;
    }

    @OriginalMember(owner = "client!gt", name = "EA", descriptor = "(IIII)V")
    public final void method596(int arg0, int arg1, int arg2, int arg3) {
        ++field6307;
        if (!this.field6538) {
            throw new RuntimeException("");
        } else {
            this.field6480 = arg1;
            this.field6537 = arg3;
            this.field6481 = arg2;
            this.field6488 = arg0;
            if (this.field6519) {
                this.field6456[3].method2085((byte) -73);
                this.field6456[3].method886(-110);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "(I)I")
    public final int method2737(int arg0) {
        if (arg0 < 14) {
            this.method2749(false, false);
        }
        ++field6378;
        return this.field6488;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Luf;III)V")
    public abstract void method1022(class445 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILti;Lkca;)Z")
    public abstract boolean method1035(int arg0, class438 arg1, class82 arg2);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lkd;)V")
    public final void method538(class280 arg0) {
        this.field6446 = (class25) arg0;
        ++field6381;
        this.field6448.method160(this.field6446);
        this.field6448.method175(-120);
        this.field6449.method176(this.field6448, (byte) -1);
        this.field6447.method176(this.field6446, (byte) -1);
        if (this.field6532.method3626(17)) {
            this.method2758((byte) -17);
        }
    }

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "(I)V")
    public abstract void method1004(int arg0);

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "(II)V")
    public final void method2738(int arg0, int arg1) {
        ++field6363;
        if (arg0 > -29) {
            this.method607((Canvas) null);
        }
        if (this.field6509 != arg1) {
            boolean var3;
            class505 var4;
            boolean var5;
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 128) {
                        var3 = false;
                        var4 = class76.field1432;
                        var5 = false;
                    } else {
                        var3 = true;
                        var4 = class76.field1450;
                        var5 = true;
                    }
                } else {
                    var4 = class417.field5853;
                    var5 = false;
                    var3 = true;
                }
            } else {
                var3 = true;
                var4 = class701.field9845;
                var5 = true;
            }
            if (this.field6541 != var5) {
                this.field6541 = var5;
                this.method1050((byte) 111);
            }
            if (this.field6534 != var3) {
                this.field6534 = var3;
                this.method1018((byte) 121);
            }
            if (this.field6453 != var4) {
                this.field6453 = var4;
                this.method1038((byte) -106);
            }
            this.field6509 = arg1;
            this.field6497 &= -29;
        }
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "()Z")
    public final boolean method635() {
        ++field6330;
        return true;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Ldw;")
    public class715 method1039(byte arg0, int arg1) {
        ++field6436;
        if (arg0 != 67) {
            this.field6544 = -116;
        }
        if (~arg1 != -7) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    return ~arg1 == -8 ? new class723(this) : new class228(this);
                } else {
                    return new class502(this, this.field6340);
                }
            } else {
                return new class231(this);
            }
        } else {
            return new class290(this);
        }
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(Z)V")
    private final void method2739(boolean arg0) {
        this.method1043((byte) -113);
        ++field6334;
        if (this.field6466 != null) {
            this.field6466.method884(44);
        }
        if (!arg0) {
            this.field6525 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(II)V")
    public final void method556(int arg0, int arg1) {
        ++field6339;
        if (~this.field6533 != ~arg0 || ~this.field6483 != ~arg1) {
            this.field6533 = arg0;
            this.field6483 = arg1;
            this.method2725((byte) 61);
            this.method2712((byte) -126);
            this.method2741(806);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIZ)Lkr;")
    public final class743 method581(int arg0, int arg1, boolean arg2) {
        ++field6301;
        return new class204(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "(I)V")
    public abstract void method1029(int arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method1034(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "()Z")
    public final boolean method605() {
        ++field6273;
        return true;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZII[IB)Lwda;")
    public final class636 method2740(boolean arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        if (arg4 != -100) {
            this.method2701((byte) -125);
        }
        ++field6341;
        return this.method1049(0, 0, arg2, arg3, arg0, arg1, false);
    }

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "()Z")
    public final boolean method563() {
        ++field6407;
        return true;
    }

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "()Z")
    public final boolean method622() {
        ++field6379;
        return false;
    }

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "(IIIII)V")
    public final void method541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6367;
        this.method553(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "(I)V")
    private final void method2741(int arg0) {
        ++field6264;
        if (arg0 != 806) {
            this.method631(25, -125, -26, -14, (int[]) null);
        }
        if (this.field6466 != null) {
            this.field6466.method886(-114);
        }
        this.method1056(0);
    }

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "(I)Lfba;")
    public final class25 method2742(int arg0) {
        if (!this.field6535) {
            this.field6450.method152(this.field6448, this.field6441);
            this.field6535 = true;
        }
        ++field6281;
        if (arg0 != 15) {
            this.method600();
        }
        return this.field6450;
    }

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "(I)V")
    private final void method2743(int arg0) {
        if (arg0 == -10188) {
            ++field6395;
            if (!this.field6526) {
                float[] var2 = this.field6461;
                this.field6526 = true;
                if (~this.field6252 != -1 && this.field6402 != 0) {
                    var2[7] = 0.0F;
                    var2[2] = 0.0F;
                    var2[5] = -2.0F / (float) this.field6402;
                    var2[10] = 0.5F;
                    var2[15] = 1.0F;
                    var2[6] = 0.0F;
                    var2[8] = 0.0F;
                    var2[0] = 2.0F / (float) this.field6252;
                    var2[1] = 0.0F;
                    var2[14] = 0.5F;
                    var2[9] = 0.0F;
                    var2[12] = -1.0F;
                    var2[13] = 1.0F;
                    var2[11] = 0.0F;
                    var2[4] = 0.0F;
                    var2[3] = 0.0F;
                } else {
                    var2[3] = 0.0F;
                    var2[13] = 0.0F;
                    var2[10] = 1.0F;
                    var2[0] = 1.0F;
                    var2[2] = 0.0F;
                    var2[1] = 0.0F;
                    var2[14] = 0.0F;
                    var2[6] = 0.0F;
                    var2[7] = 0.0F;
                    var2[9] = 0.0F;
                    var2[4] = 0.0F;
                    var2[12] = 0.0F;
                    var2[11] = 0.0F;
                    var2[8] = 0.0F;
                    var2[15] = 1.0F;
                    var2[5] = 1.0F;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIZ)Lkr;")
    public final class743 method576(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6259;
        class204 var6 = new class204(this, arg2, arg3, arg4);
        var6.method88(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([FIIZIILkca;I)Lwda;")
    public abstract class636 method1032(float[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class82 arg6, int arg7);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILkca;I[BZI)Lwda;")
    public abstract class636 method1016(int arg0, int arg1, int arg2, class82 arg3, int arg4, byte[] arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "(I)Lfba;")
    public final class25 method2744(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field6434;
            return this.field6449;
        }
    }

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "(I)V")
    public abstract void method1056(int arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(FFFFZFF)Z")
    private final boolean method2745(float arg0, float arg1, float arg2, float arg3, boolean arg4, float arg5, float arg6) {
        ++field6348;
        if (arg4) {
            this.method2706(-32);
        }
        Buffer var8 = this.field6571.method1492((byte) -20, true);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2764(var8, (byte) -76);
            if (Stream.method3762()) {
                var9.method3774(arg5);
                var9.method3774(arg0);
                var9.method3774(arg3);
                var9.method3774(arg2);
                var9.method3774(arg1);
                var9.method3774(arg6);
            } else {
                var9.method3770(arg5);
                var9.method3770(arg0);
                var9.method3770(arg3);
                var9.method3770(arg2);
                var9.method3770(arg1);
                var9.method3770(arg6);
            }
            var9.method3761();
            return this.field6571.method1494(5069);
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(IIIIII)Lsfa;")
    public final class693 method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6312;
        return new class291(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lfba;I)V")
    public final void method2746(class25 arg0, int arg1) {
        int var3 = 123 / ((arg1 - -24) / 50);
        this.field6441.method160(arg0);
        ++field6361;
        this.field6444 = false;
        this.method2754(8);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(ZI)V")
    public final void method2747(boolean arg0, int arg1) {
        if (arg0 == !this.field6520) {
            this.field6520 = arg0;
            this.method1027(-124);
            this.field6497 &= -8;
        }
        ++field6377;
        if (arg1 < 96) {
            this.field6559 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "()I")
    public final int method598() {
        ++field6302;
        return this.field6575;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIII)V")
    public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6294;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lfp;[Lfw;Z)Lda;")
    public final class59 method632(class323 arg0, class55[] arg1, boolean arg2) {
        ++field6336;
        return new class713(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "(B)V")
    public abstract void method1018(byte arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lhi;Z)V")
    public abstract void method1014(class203 arg0, boolean arg1);

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(IIIIII)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6432;
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
        if (this.method2745((float) arg1, (float) arg3 + var8, (float) arg2 + var9, 0.0F, false, (float) arg0, 0.0F)) {
            this.method2718(-965);
            this.method2730(arg4, -32755);
            this.method2767(0, 25103, class142.field2176);
            this.method2755(false, 0, class142.field2176);
            this.method2738(-98, arg5);
            this.method2711(-77);
            this.method1031(false, false);
            this.method2704(0);
            this.method1031(false, true);
            this.method2755(false, 0, class68.field1225);
            this.method2767(0, 25103, class68.field1225);
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(ZI)V")
    public final void method2748(boolean arg0, int arg1) {
        if (arg0 == !this.field6485) {
            this.field6485 = arg0;
            this.method1045(6);
        }
        ++field6424;
        if (arg1 != 0) {
            this.field6518 = true;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(ZZ)V")
    public final void method2749(boolean arg0, boolean arg1) {
        ++field6295;
        if (!arg0 != !this.field6549) {
            this.field6549 = arg0;
            this.method1045(6);
            this.field6497 &= -32;
        }
        if (!arg1) {
            this.method2760(25);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([BZILkca;II)Lwda;")
    public final class636 method2750(byte[] arg0, boolean arg1, int arg2, class82 arg3, int arg4, int arg5) {
        if (arg5 > -15) {
            this.method2745(0.2788328F, 0.4080666F, 0.40786403F, -0.53672093F, false, -0.12037327F, -0.24960177F);
        }
        ++field6337;
        return this.method1016(0, 1, 0, arg3, arg2, arg0, arg1, arg4);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field6315;
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(IZ)V")
    public final void method2751(int arg0, boolean arg1) {
        if (arg0 == 8) {
            if (this.field6501 == !arg1) {
                this.field6501 = arg1;
                this.method1027(-119);
            }
            ++field6254;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8) {
        ++field6313;
    }

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "(I)V")
    private final void method2752(int arg0) {
        ++field6431;
        if (arg0 < -75) {
            this.field6570 = this.method1036((byte) -83, false);
            this.field6570.method1497(12, 3096, -29407);
            for (int var2 = 0; ~var2 > -5; ++var2) {
                Buffer var3 = this.field6570.method1492((byte) -20, true);
                if (var3 != null) {
                    Stream var4 = this.method2764(var3, (byte) -76);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    var4.method3774(0.0F);
                    for (int var5 = 0; ~var5 >= -257; ++var5) {
                        double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                        float var8 = (float) Math.cos(var6);
                        float var9 = (float) Math.sin(var6);
                        if (Stream.method3762()) {
                            var4.method3774(var9);
                            var4.method3774(var8);
                            var4.method3774(0.0F);
                        } else {
                            var4.method3770(var9);
                            var4.method3770(var8);
                            var4.method3770(0.0F);
                        }
                    }
                    var4.method3761();
                    if (this.field6570.method1494(5069)) {
                        break;
                    }
                }
            }
            this.field6558 = this.method1006(50, new class328[] { new class328(class674.field9457) });
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(BI)V")
    public final void method2753(byte arg0, int arg1) {
        if (~this.field6451 != ~arg1) {
            this.field6451 = arg1;
            this.method1030(-5578);
        }
        if (arg0 != -17) {
            this.method2704(125);
        }
        ++field6311;
    }

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "(I)V")
    private final void method2754(int arg0) {
        ++field6376;
        if (class175.field2545 == this.field6532) {
            float var2 = this.method1010(true);
            this.field6441.method170(var2, (byte) 95, var2, 0.0F);
        }
        if (arg0 != 8) {
            this.method1041((byte) -13);
        }
        this.field6535 = false;
        this.method1055(11030);
        if (this.field6466 != null) {
            this.field6466.method885(arg0);
        }
    }

    @OriginalMember(owner = "client!gt", name = "HA", descriptor = "(IIII[I)V")
    public final void method631(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field6383;
        float var6 = this.field6446.method189((float) arg0, (float) arg2, -1, (float) arg1);
        if (!(var6 < (float) this.field6533) && !((float) this.field6483 < var6)) {
            int var7 = (int) ((float) this.field6527 * this.field6446.method159((float) arg2, (float) arg0, (float) arg1, (byte) -4) / (float) arg3);
            int var8 = (int) ((float) this.field6544 * this.field6446.method185((float) arg0, (float) arg2, -25147, (float) arg1) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[0] = (int) ((float) var7 - this.field6516);
            arg4[1] = (int) ((float) var8 - this.field6452);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILtaa;)V")
    public final void method2755(boolean arg0, int arg1, class405 arg2) {
        ++field6284;
        this.method1009(0, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "(I)I")
    public final int method2756(int arg0) {
        ++field6324;
        int var2 = -39 / ((60 - arg0) / 63);
        return this.field6480;
    }

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "(I)V")
    public final void method2757(int arg0) {
        this.method2761(-104, class442.field6159, arg0);
        ++field6373;
    }

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "(B)V")
    private final void method2758(byte arg0) {
        int var2 = 25 / ((64 - arg0) / 59);
        ++field6394;
        this.field6535 = false;
        if (this.field6466 != null) {
            this.field6466.method887(-13878);
        }
        this.method1062((byte) 121);
    }

    @OriginalMember(owner = "client!gt", name = "Y", descriptor = "()[I")
    public final int[] method547() {
        ++field6271;
        return new int[] { this.field6475, this.field6502, this.field6527, this.field6544 };
    }

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "(I)V")
    public abstract void method1051(int arg0);

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "(I)Lsaa;")
    public final class326 method2759(int arg0) {
        ++field6289;
        if (arg0 >= -56) {
            this.method1017(-83);
        }
        return this.field6543 != null ? this.field6543.method1875((byte) 13) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field6386;
    }

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "(I)V")
    public final void method2760(int arg0) {
        if (arg0 != 6) {
            this.field6472 = 1.001979F;
        }
        ++field6408;
        if (~this.field6497 != -9) {
            this.method2771((byte) -126);
            this.method2749(true, true);
            this.method2736(arg0 + 12479, true);
            this.method2715(true, arg0 ^ -49);
            this.method2738(-76, 1);
            this.field6497 = 8;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public final void method527(int arg0) {
        ++field6256;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILuf;I)V")
    private final void method2761(int arg0, class445 arg1, int arg2) {
        ++field6305;
        if (arg0 > -58) {
            this.field6446 = null;
        }
        this.method1059(this.field6563, 0, -110);
        this.method1014(this.field6569, false);
        this.method1022(arg1, -50, arg2, 0);
    }

    @OriginalMember(owner = "client!gt", name = "W", descriptor = "(I)V")
    private final void method2762(int arg0) {
        if (class139.field2158 != this.field6532) {
            class628 var2 = this.field6532;
            this.field6532 = class139.field2158;
            if (!var2.method3626(17)) {
                this.method2758((byte) -49);
            }
            this.method2709(13);
            this.field6478 = this.field6476;
            this.method2739(true);
            this.field6497 &= -8;
        }
        ++field6261;
        if (arg0 > -125) {
            this.method1051(-18);
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Leq;II)V")
    public class453(Canvas arg0, Object arg1, class149 arg2, class209 arg3, int arg4, int arg5) {
        super(arg2);
        this.field6317 = this.field6310 = arg1;
        this.field6435 = arg3;
        this.field6404 = this.field6416 = arg0;
        this.field6512 = arg4;
        Dimension var7 = arg0.getSize();
        this.field6402 = this.field6405 = var7.height;
        this.field6252 = this.field6318 = var7.width;
        this.field6498 = arg5;
        class419.method2564(false, -64, true);
        if (super.field1084 == null) {
            this.field6303 = new NativeInterface(0, this.field6498);
            this.field6494 = null;
        } else {
            this.field6494 = new class373(this, super.field1084);
            this.field6303 = new NativeInterface(super.field1084.method1150(true), this.field6498);
            for (int var8 = 0; var8 < super.field1084.method1150(true); ++var8) {
                class546 var9 = super.field1084.method1154(-111, var8);
                if (var9 != null) {
                    this.field6303.initTextureMetrics(var8, var9.field7707, var9.field7696);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "(B)V")
    public final void method2763(byte arg0) {
        if (this.field6515[this.field6451] != class43.field653) {
            this.field6515[this.field6451] = class43.field653;
            this.field6486[this.field6451].method181();
            this.method2707(-12475);
        }
        if (arg0 < -64) {
            ++field6364;
        }
    }

    @OriginalMember(owner = "client!gt", name = "KA", descriptor = "(IIII)V")
    public final void method584(int arg0, int arg1, int arg2, int arg3) {
        ++field6344;
        if (~arg0 >= -1 && ~arg2 <= ~(this.field6252 + -1) && ~arg1 >= -1 && arg3 >= this.field6402 - 1) {
            this.method601();
        } else {
            this.field6521 = arg2 <= this.field6252 ? arg2 : 0;
            this.field6459 = ~arg3 >= ~this.field6252 ? arg3 : 0;
            this.field6468 = ~arg0 <= -1 ? arg0 : 0;
            this.field6511 = ~arg1 <= -1 ? arg1 : 0;
            if (!this.field6574) {
                this.field6574 = true;
                this.method1052(-13771);
            }
            this.method1033((byte) -61);
            this.method2772(128);
        }
    }

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "(Z)V")
    public final void method539(boolean arg0) {
        this.field6513 = arg0;
        ++field6359;
        this.method1017(0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;")
    public final Stream method2764(Buffer arg0, byte arg1) {
        if (arg1 != -76) {
            this.method547();
        }
        this.field6545.method3767(arg0);
        ++field6390;
        return this.field6545;
    }

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "(IIIII)V")
    public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method553(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field6300;
    }

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "(B)Lfba;")
    public final class25 method2765(byte arg0) {
        ++field6268;
        if (arg0 >= -22) {
            this.method2766(-92, 15, true);
        }
        return this.field6441;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(IIZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method2766(int arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field6320;
            return this.field6263.method3758(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILtaa;)V")
    public final void method2767(int arg0, int arg1, class405 arg2) {
        ++field6309;
        if (arg1 == 25103) {
            this.method1020(false, false, (byte) 65, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!gt", name = "X", descriptor = "(I)V")
    public final void method604(int arg0) {
        this.field6490 = 0;
        ++field6442;
        while (~arg0 < -2) {
            ++this.field6490;
            arg0 >>= 1;
        }
        this.field6496 = 1 << this.field6490;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2768(int arg0, boolean arg1, int arg2) {
        ++field6423;
        if (arg1) {
            return true;
        } else {
            return ~(arg2 & 34) != -1;
        }
    }

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "()I")
    public final int method615() {
        ++field6382;
        return this.field6539 - 2;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lrr;Lrr;I)V")
    public final void method2769(class361 arg0, class361 arg1, int arg2) {
        if (arg2 != 18721) {
            this.method602(38, -117, 16, 117, 89, -31);
        }
        ++field6406;
        boolean var4 = false;
        if (this.field6489[this.field6451] != arg1) {
            this.field6489[this.field6451] = arg1;
            var4 = true;
            this.method1044(arg2 ^ 18759);
        }
        if (this.field6471[this.field6451] != arg0) {
            this.field6471[this.field6451] = arg0;
            this.method1021(-27512);
            var4 = true;
        }
        if (var4) {
            this.field6497 &= -30;
        }
    }

    @OriginalMember(owner = "client!gt", name = "Y", descriptor = "(I)V")
    public abstract void method1019(int arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[Lbh;)V")
    public final void method575(int arg0, class36[] arg1) {
        ++field6433;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field6470[var3] = arg1[var3];
        }
        this.field6503 = arg0;
        if (this.field6532.method3626(17)) {
            this.method1023(105);
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(IZ)V")
    public final void method2770(int arg0, boolean arg1) {
        if (this.field6458 != arg1) {
            this.field6458 = arg1;
            this.method1004(16);
        }
        if (arg0 != 4862) {
            this.method558();
        }
        ++field6428;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILida;BILuf;I)V")
    public abstract void method1046(int arg0, int arg1, class234 arg2, byte arg3, int arg4, class445 arg5, int arg6);

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "()I")
    public final int method641() {
        ++field6327;
        return this.field6445 + this.field6439 - -this.field6440;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLti;Lkca;)Z")
    public abstract boolean method1013(byte arg0, class438 arg1, class82 arg2);

    @OriginalMember(owner = "client!gt", name = "Z", descriptor = "(I)V")
    public abstract void method1017(int arg0);

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "(IIIIIII)I")
    public final int method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6437;
        int var8 = 0;
        float var9 = (float) arg2 * this.field6446.field343 + (float) arg0 * this.field6446.field345 + (float) arg1 * this.field6446.field331 + this.field6446.field326;
        float var10 = (float) arg5 * this.field6446.field343 + (float) arg3 * this.field6446.field345 + (float) arg4 * this.field6446.field331 + this.field6446.field326;
        if (var9 < (float) this.field6533 && var10 < (float) this.field6533) {
            var8 |= 16;
        } else if ((float) this.field6483 < var9 && (float) this.field6483 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field6446.field315 + (float) arg0 * this.field6446.field360 + (float) arg1 * this.field6446.field353 + this.field6446.field347) * (float) this.field6527 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field6446.field315 + (float) arg3 * this.field6446.field360 + (float) arg4 * this.field6446.field353 + this.field6446.field347) * (float) this.field6527 / (float) arg6);
        if ((float) var11 < this.field6516 && this.field6516 > (float) var12) {
            var8 |= 1;
        } else if (this.field6499 < (float) var11 && this.field6499 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field6446.field348 + (float) arg0 * this.field6446.field330 + (float) arg1 * this.field6446.field367 + this.field6446.field334) * (float) this.field6544 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field6446.field348 + (float) arg3 * this.field6446.field330 + (float) arg4 * this.field6446.field367 + this.field6446.field334) * (float) this.field6544 / (float) arg6);
        if ((float) var13 < this.field6452 && this.field6452 > (float) var14) {
            var8 |= 4;
        } else if ((float) var13 > this.field6472 && this.field6472 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lza;)V")
    public final void method578(class411 arg0) {
        this.field6263 = ((class180) arg0).field2582;
        ++field6418;
        this.field6385 = this.field6263.method3758(32768, false);
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "()Z")
    public final boolean method550() {
        ++field6358;
        return true;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method529(Canvas arg0) {
        ++field6438;
        this.field6404 = null;
        this.field6317 = null;
        if (arg0 != null && this.field6416 != arg0) {
            if (this.field6296.containsKey(arg0)) {
                this.field6317 = this.field6296.get(arg0);
                this.field6404 = arg0;
            }
        } else {
            this.field6404 = this.field6416;
            this.field6317 = this.field6310;
        }
        if (this.field6404 != null && this.field6317 != null) {
            this.method1007(this.field6404, (byte) -91, this.field6317);
            this.method2702(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gt", name = "XA", descriptor = "()I")
    public final int method531() {
        ++field6325;
        return this.field6483;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
    public final void method548(boolean arg0) {
        ++field6347;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Loo;I)V")
    public final void method643(class624 arg0, int arg1) {
        ++field6353;
        this.field6487.method2166(this, arg0, arg1, false);
    }

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "(B)V")
    private final void method2771(byte arg0) {
        ++field6306;
        if (class594.field8527 != this.field6532) {
            class628 var2 = this.field6532;
            this.field6532 = class594.field8527;
            if (!var2.method3626(17)) {
                this.method2758((byte) -70);
            }
            this.method2734((byte) -44);
            this.field6478 = this.field6524;
            this.method2739(true);
            this.field6497 &= -8;
        }
        if (arg0 >= -124) {
            this.field6560 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "()Lkd;")
    public final class280 method530() {
        ++field6429;
        return this.field6555;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(II)I")
    public final int method611(int arg0, int arg1) {
        ++field6297;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!gt", name = "ab", descriptor = "(I)V")
    private final void method2772(int arg0) {
        if (arg0 != 128) {
            this.field6502 = 86;
        }
        this.field6499 = (float) (-this.field6475 + this.field6521);
        this.field6516 = (float) (-this.field6475 + this.field6468);
        this.field6472 = (float) (this.field6459 - this.field6502);
        this.field6452 = (float) (-this.field6502 + this.field6511);
        ++field6275;
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "(B)Lfba;")
    public final class25 method2773(byte arg0) {
        if (arg0 != -30) {
            this.field6456 = null;
        }
        ++field6278;
        return this.field6486[this.field6451];
    }

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "(Z)F")
    public abstract float method1010(boolean arg0);

    @OriginalMember(owner = "client!gt", name = "aa", descriptor = "(IIIIII)V")
    public final void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2718(-965);
        ++field6375;
        this.method2730(arg4, -32755);
        this.method2767(0, 25103, class142.field2176);
        this.method2755(false, 0, class142.field2176);
        this.method2738(-51, arg5);
        this.field6441.method179(1.0F, (float) arg2, false, (float) arg3);
        this.field6441.method149(arg0, arg1, 0);
        this.method2698(0);
        this.method1031(false, false);
        this.method2757(2);
        this.method1031(false, true);
        this.method2755(false, 0, class68.field1225);
        this.method2767(0, 25103, class68.field1225);
    }

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "(B)V")
    private final void method2774(byte arg0) {
        this.field6571 = this.method1036((byte) -102, true);
        ++field6282;
        this.field6571.method1497(12, 24, -29407);
        if (arg0 != 69) {
            this.field6547 = 1.5121545F;
        }
        this.field6572 = this.method1006(50, new class328[] { new class328(class674.field9457) });
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method1007(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(IIIIII)V")
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6321;
        float var7 = this.method1010(true);
        this.method2718(-965);
        this.method2730(arg4, -32755);
        this.method2767(0, 25103, class142.field2176);
        this.method2755(false, 0, class142.field2176);
        this.method2738(-62, arg5);
        this.field6441.method179(1.0F, (float) (arg2 + -1), false, (float) (arg3 + -1));
        this.field6441.method170((float) arg1 - var7, (byte) 95, (float) arg0 + -var7, 0.0F);
        this.method2698(0);
        this.method1031(false, false);
        this.method2761(-73, class543.field7664, 4);
        this.method1031(false, true);
        this.method2755(false, 0, class68.field1225);
        this.method2767(0, 25103, class68.field1225);
    }

    @OriginalMember(owner = "client!gt", name = "bb", descriptor = "(I)V")
    public abstract void method1055(int arg0);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([I)V")
    public final void method524(int[] arg0) {
        arg0[0] = this.field6252;
        arg0[1] = this.field6402;
        ++field6420;
    }

    @OriginalMember(owner = "client!gt", name = "cb", descriptor = "(I)V")
    public abstract void method1045(int arg0);

    @OriginalMember(owner = "client!gt", name = "db", descriptor = "(I)Lfba;")
    public final class25 method2775(int arg0) {
        ++field6415;
        return arg0 != 0 ? null : this.field6448;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lcaa;II)V")
    public abstract void method1059(class302 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILkca;Lti;II)Lwda;")
    public abstract class636 method1024(int arg0, class82 arg1, class438 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gt", name = "JA", descriptor = "(IIIIII)I")
    public final int method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6397;
        int var7 = 0;
        float var8 = (float) arg2 * this.field6446.field343 + (float) arg0 * this.field6446.field345 + (float) arg1 * this.field6446.field331 + this.field6446.field326;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field6446.field343 + (float) arg3 * this.field6446.field345 + (float) arg4 * this.field6446.field331 + this.field6446.field326;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field6533 > var8 && (float) this.field6533 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field6483 && (float) this.field6483 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field6446.field315 + (float) arg0 * this.field6446.field360 + (float) arg1 * this.field6446.field353 + this.field6446.field347) * (float) this.field6527 / var8);
        int var11 = (int) (((float) arg5 * this.field6446.field315 + (float) arg3 * this.field6446.field360 + (float) arg4 * this.field6446.field353 + this.field6446.field347) * (float) this.field6527 / var9);
        if ((float) var10 < this.field6516 && this.field6516 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field6499 && (float) var11 > this.field6499) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field6446.field348 + (float) arg0 * this.field6446.field330 + (float) arg1 * this.field6446.field367 + this.field6446.field334) * (float) this.field6544 / var8);
        int var13 = (int) (((float) arg5 * this.field6446.field348 + (float) arg3 * this.field6446.field330 + (float) arg4 * this.field6446.field367 + this.field6446.field334) * (float) this.field6544 / var9);
        if ((float) var12 < this.field6452 && this.field6452 > (float) var13) {
            var7 |= 4;
        } else if (this.field6472 < (float) var12 && this.field6472 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)V")
    public final void method570(int arg0) {
        ++field6365;
    }

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "()Z")
    public final boolean method579() {
        ++field6283;
        return false;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZIZ[[I)Lsaa;")
    public abstract class326 method1015(boolean arg0, int arg1, boolean arg2, int[][] arg3);

    @OriginalMember(owner = "client!gt", name = "xa", descriptor = "(F)V")
    public final void method552(float arg0) {
        if (this.field6493 != arg0) {
            this.field6493 = arg0;
            this.field6303.setAmbient(arg0);
            this.method1051(Integer.MIN_VALUE);
            this.method1029(9);
        }
        ++field6387;
    }

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "()Lkd;")
    public final class280 method612() {
        ++field6288;
        return this.field6446;
    }

    @OriginalMember(owner = "client!gt", name = "DA", descriptor = "(IIII)V")
    public final void method545(int arg0, int arg1, int arg2, int arg3) {
        this.field6544 = arg3;
        ++field6333;
        this.field6475 = arg0;
        this.field6527 = arg2;
        this.field6502 = arg1;
        this.method2712((byte) -54);
        this.method2725((byte) 61);
        this.method2700(9);
        this.method2772(128);
    }

    @OriginalMember(owner = "client!gt", name = "eb", descriptor = "(I)V")
    public final void method2776(int arg0) {
        this.field6514 = new class355[this.field6546];
        this.field6515 = new class254[this.field6546];
        this.field6489 = new class361[this.field6546];
        this.field6486 = new class25[this.field6546];
        this.field6471 = new class361[this.field6546];
        ++field6372;
        for (int var2 = 0; ~this.field6546 < ~var2; ++var2) {
            this.field6471[var2] = class571.field8118;
            this.field6489[var2] = class571.field8118;
            this.field6515[var2] = class43.field653;
            this.field6486[var2] = new class25();
        }
        this.field6470 = new class36[this.field6539 + -2];
        this.field6529 = this.method1024(1, class282.field4019, class438.field6117, 0, 1);
        this.method578(new class180(262144));
        this.field6560 = this.method1006(50, new class328[] { new class328(new class674[] { class674.field9457, class674.field9462 }) });
        this.field6552 = this.method1006(50, new class328[] { new class328(new class674[] { class674.field9457, class674.field9460 }) });
        this.field6559 = this.method1006(50, new class328[] { new class328(class674.field9457), new class328(class674.field9460), new class328(class674.field9462), new class328(class674.field9459) });
        this.field6553 = this.method1006(50, new class328[] { new class328(class674.field9457), new class328(class674.field9460), new class328(class674.field9462) });
        this.field6565 = new class557(this, 0, 0, false, false);
        this.field6564 = new class557(this, 0, 0, true, true);
        this.field6556 = new class557(this, 0, 0, false, false);
        this.field6567 = new class557(this, 0, 0, true, true);
        this.field6573 = new class557(this, 0, 0, false, false);
        this.field6554 = new class557(this, 0, 0, true, true);
        this.field6561 = new class557(this, 0, 0, false, false);
        this.field6566 = new class557(this, 0, 0, true, true);
        this.field6562 = new class557(this, 0, 0, false, false);
        this.field6557 = new class557(this, 0, 0, true, true);
        this.field6487 = new class342(this);
        if (arg0 < 104) {
            this.method1007((Canvas) null, (byte) -17, (Object) null);
        }
        this.field6568 = this.method1047(-115, true);
        this.method2706(68);
        this.field6340 = new class34(this);
        this.field6456[1] = this.method1039((byte) 67, 1);
        this.field6456[2] = this.method1039((byte) 67, 2);
        this.field6456[4] = this.method1039((byte) 67, 4);
        this.field6456[5] = this.method1039((byte) 67, 5);
        this.field6456[6] = this.method1039((byte) 67, 6);
        this.field6456[7] = this.method1039((byte) 67, 7);
        this.field6456[3] = this.method1039((byte) 67, 3);
        this.field6456[8] = this.method1039((byte) 67, 8);
        this.field6456[9] = this.method1039((byte) 67, 9);
        if (!this.field6456[2].method690((byte) -3)) {
            this.field6456[2] = this.method1039((byte) 67, 0);
        }
        if (!this.field6456[4].method690((byte) -3)) {
            this.field6456[4] = this.field6456[2];
        }
        if (!this.field6456[8].method690((byte) -3)) {
            this.field6456[8] = this.field6456[4];
        }
        if (!this.field6456[9].method690((byte) -3)) {
            this.field6456[9] = this.field6456[8];
        }
        this.method1048(9053);
        this.method601();
        this.method567();
    }

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "(B)V")
    public final void method2777(byte arg0) {
        if (arg0 != 45) {
            this.method547();
        }
        ++field6277;
        if (this.field6497 != 2) {
            this.method2729(arg0 ^ -54);
            this.method2749(false, true);
            this.method2747(false, 108);
            this.method2736(12485, false);
            this.method2715(false, -62);
            this.method2728(false, false, (byte) 23, -2);
            this.field6497 = 2;
        }
    }

    @OriginalMember(owner = "client!gt", name = "fb", descriptor = "(I)V")
    private final void method2778(int arg0) {
        if (arg0 == 0) {
            this.field6526 = false;
            ++field6401;
            if (class175.field2545 == this.field6532) {
                this.method2743(-10188);
                this.method2739(true);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "la", descriptor = "()V")
    public final void method601() {
        this.field6468 = 0;
        this.field6511 = 0;
        this.field6459 = this.field6402;
        ++field6360;
        this.field6521 = this.field6252;
        if (this.field6574) {
            this.field6574 = false;
            this.method1052(-13771);
        }
        this.method2772(128);
    }
}
