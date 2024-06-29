import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class703 extends class66 {

    @OriginalMember(owner = "client!ee", name = "rd", descriptor = "Lqw;")
    private class84 field9454 = new class84();

    @OriginalMember(owner = "client!ee", name = "ce", descriptor = "Z")
    public boolean field9491 = true;

    @OriginalMember(owner = "client!ee", name = "me", descriptor = "Lod;")
    public class532 field9501 = new class532();

    @OriginalMember(owner = "client!ee", name = "ne", descriptor = "Lod;")
    public class532 field9502 = new class532();

    @OriginalMember(owner = "client!ee", name = "oe", descriptor = "Lod;")
    public class532 field9503 = new class532();

    @OriginalMember(owner = "client!ee", name = "pe", descriptor = "Lod;")
    public class532 field9504 = new class532();

    @OriginalMember(owner = "client!ee", name = "qe", descriptor = "Lod;")
    private class532 field9505 = new class532();

    @OriginalMember(owner = "client!ee", name = "re", descriptor = "Lod;")
    private class532 field9506 = new class532();

    @OriginalMember(owner = "client!ee", name = "ve", descriptor = "I")
    public int field9510 = 0;

    @OriginalMember(owner = "client!ee", name = "se", descriptor = "I")
    public int field9507 = 0;

    @OriginalMember(owner = "client!ee", name = "ye", descriptor = "F")
    public float field9513 = 3584.0F;

    @OriginalMember(owner = "client!ee", name = "ze", descriptor = "Z")
    private boolean field9514 = false;

    @OriginalMember(owner = "client!ee", name = "Ge", descriptor = "Z")
    public boolean field9521 = true;

    @OriginalMember(owner = "client!ee", name = "te", descriptor = "I")
    public int field9508 = 0;

    @OriginalMember(owner = "client!ee", name = "Me", descriptor = "Z")
    private boolean field9527 = false;

    @OriginalMember(owner = "client!ee", name = "Re", descriptor = "F")
    public float field9532 = 1.0F;

    @OriginalMember(owner = "client!ee", name = "Oe", descriptor = "F")
    public float field9529 = -1.0F;

    @OriginalMember(owner = "client!ee", name = "xe", descriptor = "I")
    public int field9512 = 0;

    @OriginalMember(owner = "client!ee", name = "Te", descriptor = "Z")
    public boolean field9534 = false;

    @OriginalMember(owner = "client!ee", name = "He", descriptor = "I")
    public int field9522 = 0;

    @OriginalMember(owner = "client!ee", name = "cf", descriptor = "Z")
    public boolean field9543 = true;

    @OriginalMember(owner = "client!ee", name = "lf", descriptor = "I")
    public int field9551 = 128;

    @OriginalMember(owner = "client!ee", name = "Ue", descriptor = "Z")
    public boolean field9535 = true;

    @OriginalMember(owner = "client!ee", name = "uf", descriptor = "I")
    private int field9560 = 16777215;

    @OriginalMember(owner = "client!ee", name = "Cf", descriptor = "I")
    public int field9568 = 8;

    @OriginalMember(owner = "client!ee", name = "jf", descriptor = "Z")
    public boolean field9549 = false;

    @OriginalMember(owner = "client!ee", name = "rf", descriptor = "I")
    public int field9557 = 512;

    @OriginalMember(owner = "client!ee", name = "Qe", descriptor = "Z")
    public boolean field9531 = false;

    @OriginalMember(owner = "client!ee", name = "we", descriptor = "[F")
    private float[] field9511 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ee", name = "ff", descriptor = "[F")
    private float[] field9546 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ee", name = "hf", descriptor = "I")
    public int field9548 = 0;

    @OriginalMember(owner = "client!ee", name = "nf", descriptor = "[F")
    private float[] field9553 = new float[16];

    @OriginalMember(owner = "client!ee", name = "sf", descriptor = "[F")
    public float[] field9558 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ee", name = "Se", descriptor = "I")
    public int field9533 = 3584;

    @OriginalMember(owner = "client!ee", name = "df", descriptor = "[Lev;")
    private class719[] field9544 = new class719[10];

    @OriginalMember(owner = "client!ee", name = "Fe", descriptor = "Z")
    public boolean field9520 = true;

    @OriginalMember(owner = "client!ee", name = "Hf", descriptor = "I")
    public int field9573 = 512;

    @OriginalMember(owner = "client!ee", name = "Ae", descriptor = "I")
    public int field9515 = -1;

    @OriginalMember(owner = "client!ee", name = "Uf", descriptor = "I")
    private int field9586 = -1;

    @OriginalMember(owner = "client!ee", name = "Lf", descriptor = "I")
    public int field9577 = 3;

    @OriginalMember(owner = "client!ee", name = "Df", descriptor = "I")
    public int field9569 = -1;

    @OriginalMember(owner = "client!ee", name = "Jf", descriptor = "I")
    private int field9575 = -1;

    @OriginalMember(owner = "client!ee", name = "We", descriptor = "I")
    private int field9537 = 0;

    @OriginalMember(owner = "client!ee", name = "of", descriptor = "[F")
    public float[] field9554 = this.field9511;

    @OriginalMember(owner = "client!ee", name = "Xe", descriptor = "I")
    private int field9538 = 0;

    @OriginalMember(owner = "client!ee", name = "pf", descriptor = "I")
    private int field9555 = 0;

    @OriginalMember(owner = "client!ee", name = "Ff", descriptor = "I")
    public int field9571 = 50;

    @OriginalMember(owner = "client!ee", name = "Pf", descriptor = "F")
    public float field9581 = 1.0F;

    @OriginalMember(owner = "client!ee", name = "zf", descriptor = "I")
    private int field9565 = 1;

    @OriginalMember(owner = "client!ee", name = "Ve", descriptor = "I")
    public int field9536 = 0;

    @OriginalMember(owner = "client!ee", name = "ag", descriptor = "[F")
    private float[] field9592 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ee", name = "Yf", descriptor = "Z")
    public boolean field9590 = true;

    @OriginalMember(owner = "client!ee", name = "wf", descriptor = "F")
    public float field9562 = 3584.0F;

    @OriginalMember(owner = "client!ee", name = "Kf", descriptor = "Z")
    private boolean field9576 = false;

    @OriginalMember(owner = "client!ee", name = "Wf", descriptor = "F")
    private float field9588 = 1.0F;

    @OriginalMember(owner = "client!ee", name = "Xf", descriptor = "Lhja;")
    public class426 field9589 = class612.field8269;

    @OriginalMember(owner = "client!ee", name = "Ie", descriptor = "[F")
    private float[] field9523 = new float[16];

    @OriginalMember(owner = "client!ee", name = "Nf", descriptor = "F")
    public float field9579 = 1.0F;

    @OriginalMember(owner = "client!ee", name = "yf", descriptor = "[F")
    public float[] field9564 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!ee", name = "dg", descriptor = "I")
    private int field9595 = 0;

    @OriginalMember(owner = "client!ee", name = "hg", descriptor = "I")
    public int field9599 = 0;

    @OriginalMember(owner = "client!ee", name = "Ze", descriptor = "F")
    public float field9540 = 1.0F;

    @OriginalMember(owner = "client!ee", name = "If", descriptor = "I")
    public int field9574 = 0;

    @OriginalMember(owner = "client!ee", name = "Sf", descriptor = "[F")
    private float[] field9584 = new float[16];

    @OriginalMember(owner = "client!ee", name = "ig", descriptor = "I")
    public int field9600 = 0;

    @OriginalMember(owner = "client!ee", name = "bg", descriptor = "I")
    private int field9593 = -1;

    @OriginalMember(owner = "client!ee", name = "lg", descriptor = "Z")
    private boolean field9603 = false;

    @OriginalMember(owner = "client!ee", name = "jg", descriptor = "Z")
    public boolean field9601 = false;

    @OriginalMember(owner = "client!ee", name = "ng", descriptor = "Lwv;")
    public class37 field9605 = class453.field6504;

    @OriginalMember(owner = "client!ee", name = "mg", descriptor = "Z")
    private boolean field9604 = false;

    @OriginalMember(owner = "client!ee", name = "og", descriptor = "Z")
    private boolean field9606 = false;

    @OriginalMember(owner = "client!ee", name = "pg", descriptor = "F")
    public float field9607 = -1.0F;

    @OriginalMember(owner = "client!ee", name = "Tf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9585 = new Stream();

    @OriginalMember(owner = "client!ee", name = "tg", descriptor = "Lod;")
    private class532 field9611 = new class532();

    @OriginalMember(owner = "client!ee", name = "Le", descriptor = "I")
    public int field9526;

    @OriginalMember(owner = "client!ee", name = "Xc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field9434;

    @OriginalMember(owner = "client!ee", name = "Gb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9365;

    @OriginalMember(owner = "client!ee", name = "Jd", descriptor = "Luq;")
    public class172 field9472;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "Ljava/lang/Object;")
    public Object field9343;

    @OriginalMember(owner = "client!ee", name = "yd", descriptor = "Ljava/lang/Object;")
    private Object field9461;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    private int field9309;

    @OriginalMember(owner = "client!ee", name = "dd", descriptor = "I")
    public int field9440;

    @OriginalMember(owner = "client!ee", name = "Zf", descriptor = "I")
    public int field9591;

    @OriginalMember(owner = "client!ee", name = "Yb", descriptor = "I")
    private int field9383;

    @OriginalMember(owner = "client!ee", name = "Gd", descriptor = "I")
    public int field9469;

    @OriginalMember(owner = "client!ee", name = "Bc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field9412;

    @OriginalMember(owner = "client!ee", name = "Ne", descriptor = "Lpea;")
    private class754 field9528;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
    public static int field9347 = 0;

    @OriginalMember(owner = "client!ee", name = "qd", descriptor = "[I")
    public static int[] field9453 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ee", name = "Ic", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9419 = new BigInteger("9433cff02d105ad4e45a50c83d2c692296130d9d5dbc705c4c4b181ce618425e838ae106d54285af02dc46244e1cc638a2491080d8398fdcfaf2b1e6eb89f1ebc98b5f50757ad060418e3b121f165c7ea0f02d65781f5486b49dadf49efb039d5ad7236b458ea04afbd9f3a188693cc9b470361666076847d9a71e773bffafe8d90103de5d2eb170d8ccdb6fae7c720727552bfd98d730ee287051748ce23f13efa8ed822023b2dec86813952e5049332b3e5a53cacc25d4a04dd618df9efae1e6d72d1e2a247f4d59a3e433591e68552e74cd0fd744c0c7ca2de8092b5fae7309a9c8df0179e5b2f1b63660e403207c390d1dfca47b28071572a97db6a128c8d4fb4469e3906af56ae6f3bb2bfd566b4bab73f1f35a255581e9273f244bbb67f1a6b60a8714f4a0b33db8bc242b45d1920384d05097a9532c4749f495b7a9ef3c1870483c7080dca35e9b75062e0daa3c7eef3f82667feab15e4f96262f6d925bb998ee0364b32b015e4650a8ef19fd52b5874614715ffa0ea79e0933a8826f304ab48f8dc58d24d0b6d9f442f9453265b08d298a08d8364ee9aa5b4de4fe1ceef0c38abc28b5d96588369046548ad194a4bf9d7107f6c8a29463f87d42f64737fd62155008df350b31b1f42156b05c62e35a136c62a3d74b1cc89635acd604772daaf2958dee1a72cd6ecc507de891404687123f59141f580492605f4fe96d", 16);

    @OriginalMember(owner = "client!ee", name = "Md", descriptor = "D")
    public static double field9475;

    @OriginalMember(owner = "client!ee", name = "De", descriptor = "F")
    public float field9518;

    @OriginalMember(owner = "client!ee", name = "Je", descriptor = "F")
    private float field9524;

    @OriginalMember(owner = "client!ee", name = "bf", descriptor = "F")
    private float field9542;

    @OriginalMember(owner = "client!ee", name = "mf", descriptor = "F")
    public float field9552;

    @OriginalMember(owner = "client!ee", name = "qf", descriptor = "F")
    public float field9556;

    @OriginalMember(owner = "client!ee", name = "tf", descriptor = "F")
    public float field9559;

    @OriginalMember(owner = "client!ee", name = "Ef", descriptor = "F")
    public float field9570;

    @OriginalMember(owner = "client!ee", name = "Vf", descriptor = "F")
    public float field9587;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!ee", name = "ub", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!ee", name = "vb", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!ee", name = "wb", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!ee", name = "xb", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!ee", name = "zb", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!ee", name = "Ab", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!ee", name = "Bb", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!ee", name = "Cb", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!ee", name = "Db", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!ee", name = "Eb", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!ee", name = "Fb", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!ee", name = "Hb", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!ee", name = "Ib", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!ee", name = "Jb", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!ee", name = "Kb", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!ee", name = "Lb", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!ee", name = "Mb", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!ee", name = "Nb", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!ee", name = "Ob", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!ee", name = "Pb", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!ee", name = "Qb", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!ee", name = "Rb", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!ee", name = "Sb", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!ee", name = "Tb", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!ee", name = "Ub", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!ee", name = "Vb", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!ee", name = "Wb", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!ee", name = "Xb", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!ee", name = "Zb", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!ee", name = "ac", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!ee", name = "bc", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!ee", name = "dc", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!ee", name = "ec", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!ee", name = "fc", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!ee", name = "gc", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!ee", name = "hc", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!ee", name = "ic", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!ee", name = "jc", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!ee", name = "kc", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!ee", name = "lc", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!ee", name = "mc", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!ee", name = "nc", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!ee", name = "oc", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!ee", name = "qc", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!ee", name = "rc", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!ee", name = "sc", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!ee", name = "tc", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!ee", name = "uc", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!ee", name = "vc", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!ee", name = "wc", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!ee", name = "xc", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!ee", name = "yc", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!ee", name = "zc", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!ee", name = "Ac", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!ee", name = "Cc", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!ee", name = "Dc", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!ee", name = "Ec", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!ee", name = "Fc", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!ee", name = "Gc", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!ee", name = "Hc", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!ee", name = "Jc", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!ee", name = "Kc", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!ee", name = "Mc", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!ee", name = "Nc", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!ee", name = "Oc", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!ee", name = "Pc", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!ee", name = "Qc", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!ee", name = "Rc", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!ee", name = "Sc", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!ee", name = "Tc", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!ee", name = "Uc", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!ee", name = "Vc", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!ee", name = "Wc", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!ee", name = "Yc", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!ee", name = "Zc", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!ee", name = "ad", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!ee", name = "bd", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!ee", name = "cd", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!ee", name = "ed", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!ee", name = "fd", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!ee", name = "gd", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!ee", name = "hd", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!ee", name = "id", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!ee", name = "jd", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!ee", name = "kd", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!ee", name = "ld", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!ee", name = "md", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!ee", name = "nd", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!ee", name = "od", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!ee", name = "pd", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!ee", name = "sd", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!ee", name = "td", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!ee", name = "ud", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!ee", name = "vd", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!ee", name = "wd", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!ee", name = "xd", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!ee", name = "zd", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!ee", name = "Ad", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!ee", name = "Bd", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!ee", name = "Cd", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!ee", name = "Dd", descriptor = "I")
    public static int field9466;

    @OriginalMember(owner = "client!ee", name = "Ed", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!ee", name = "Fd", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!ee", name = "Hd", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!ee", name = "Id", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!ee", name = "Kd", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!ee", name = "Ld", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!ee", name = "Nd", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!ee", name = "Od", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!ee", name = "Pd", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!ee", name = "Qd", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!ee", name = "Rd", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!ee", name = "Sd", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!ee", name = "Td", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!ee", name = "Ud", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!ee", name = "Vd", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!ee", name = "Wd", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!ee", name = "Xd", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!ee", name = "Yd", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!ee", name = "Zd", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!ee", name = "ae", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!ee", name = "be", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!ee", name = "de", descriptor = "I")
    public int field9492;

    @OriginalMember(owner = "client!ee", name = "ee", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!ee", name = "fe", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!ee", name = "ge", descriptor = "I")
    public int field9495;

    @OriginalMember(owner = "client!ee", name = "he", descriptor = "I")
    public int field9496;

    @OriginalMember(owner = "client!ee", name = "ie", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!ee", name = "je", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!ee", name = "ke", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!ee", name = "le", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!ee", name = "Be", descriptor = "I")
    public int field9516;

    @OriginalMember(owner = "client!ee", name = "Ce", descriptor = "I")
    private int field9517;

    @OriginalMember(owner = "client!ee", name = "Ee", descriptor = "I")
    private int field9519;

    @OriginalMember(owner = "client!ee", name = "af", descriptor = "I")
    public int field9541;

    @OriginalMember(owner = "client!ee", name = "gf", descriptor = "I")
    public int field9547;

    @OriginalMember(owner = "client!ee", name = "xf", descriptor = "I")
    public int field9563;

    @OriginalMember(owner = "client!ee", name = "Gf", descriptor = "I")
    public int field9572;

    @OriginalMember(owner = "client!ee", name = "cg", descriptor = "I")
    public int field9594;

    @OriginalMember(owner = "client!ee", name = "fg", descriptor = "I")
    public int field9597;

    @OriginalMember(owner = "client!ee", name = "kg", descriptor = "I")
    public int field9602;

    @OriginalMember(owner = "client!ee", name = "Ng", descriptor = "I")
    private int field9631;

    @OriginalMember(owner = "client!ee", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!ee", name = "ug", descriptor = "Leda;")
    private class110 field9612;

    @OriginalMember(owner = "client!ee", name = "vg", descriptor = "Leda;")
    public class110 field9613;

    @OriginalMember(owner = "client!ee", name = "wg", descriptor = "Leda;")
    private class110 field9614;

    @OriginalMember(owner = "client!ee", name = "yg", descriptor = "Leda;")
    public class110 field9616;

    @OriginalMember(owner = "client!ee", name = "Dg", descriptor = "Leda;")
    public class110 field9621;

    @OriginalMember(owner = "client!ee", name = "Eg", descriptor = "Leda;")
    public class110 field9622;

    @OriginalMember(owner = "client!ee", name = "Gg", descriptor = "Leda;")
    private class110 field9624;

    @OriginalMember(owner = "client!ee", name = "Bg", descriptor = "Lra;")
    private class118 field9619;

    @OriginalMember(owner = "client!ee", name = "qg", descriptor = "Lhm;")
    public class233 field9608;

    @OriginalMember(owner = "client!ee", name = "rg", descriptor = "Lhm;")
    public class233 field9609;

    @OriginalMember(owner = "client!ee", name = "xg", descriptor = "Lhm;")
    public class233 field9615;

    @OriginalMember(owner = "client!ee", name = "zg", descriptor = "Lhm;")
    public class233 field9617;

    @OriginalMember(owner = "client!ee", name = "Ag", descriptor = "Lhm;")
    public class233 field9618;

    @OriginalMember(owner = "client!ee", name = "Fg", descriptor = "Lhm;")
    public class233 field9623;

    @OriginalMember(owner = "client!ee", name = "Hg", descriptor = "Lhm;")
    public class233 field9625;

    @OriginalMember(owner = "client!ee", name = "Ig", descriptor = "Lhm;")
    public class233 field9626;

    @OriginalMember(owner = "client!ee", name = "Jg", descriptor = "Lhm;")
    public class233 field9627;

    @OriginalMember(owner = "client!ee", name = "Kg", descriptor = "Lhm;")
    public class233 field9628;

    @OriginalMember(owner = "client!ee", name = "pc", descriptor = "Lgaa;")
    public class314 field9400;

    @OriginalMember(owner = "client!ee", name = "ef", descriptor = "Lvw;")
    private class321 field9545;

    @OriginalMember(owner = "client!ee", name = "Ye", descriptor = "Lb;")
    public class352 field9539;

    @OriginalMember(owner = "client!ee", name = "sg", descriptor = "Lkm;")
    private class373 field9610;

    @OriginalMember(owner = "client!ee", name = "Cg", descriptor = "Lkm;")
    private class373 field9620;

    @OriginalMember(owner = "client!ee", name = "Lg", descriptor = "Lkm;")
    private class373 field9629;

    @OriginalMember(owner = "client!ee", name = "Bf", descriptor = "Lkga;")
    private class571 field9567;

    @OriginalMember(owner = "client!ee", name = "kf", descriptor = "Lev;")
    private class719 field9550;

    @OriginalMember(owner = "client!ee", name = "Lc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9422;

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field9351;

    @OriginalMember(owner = "client!ee", name = "cc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field9387;

    @OriginalMember(owner = "client!ee", name = "Mf", descriptor = "Z")
    public boolean field9578;

    @OriginalMember(owner = "client!ee", name = "Of", descriptor = "Z")
    public boolean field9580;

    @OriginalMember(owner = "client!ee", name = "Rf", descriptor = "Z")
    public boolean field9583;

    @OriginalMember(owner = "client!ee", name = "eg", descriptor = "Z")
    public boolean field9596;

    @OriginalMember(owner = "client!ee", name = "gg", descriptor = "Z")
    public boolean field9598;

    @OriginalMember(owner = "client!ee", name = "Mg", descriptor = "Z")
    public boolean field9630;

    @OriginalMember(owner = "client!ee", name = "vf", descriptor = "[Luaa;")
    public class127[] field9561;

    @OriginalMember(owner = "client!ee", name = "ue", descriptor = "[Lfea;")
    public class152[] field9509;

    @OriginalMember(owner = "client!ee", name = "Qf", descriptor = "[Lfea;")
    public class152[] field9582;

    @OriginalMember(owner = "client!ee", name = "Ke", descriptor = "[Lb;")
    private class352[] field9525;

    @OriginalMember(owner = "client!ee", name = "Pe", descriptor = "[Lvba;")
    public class45[] field9530;

    @OriginalMember(owner = "client!ee", name = "Af", descriptor = "[Lod;")
    public class532[] field9566;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "()Lal;", line = 3)
    public final class109 method475() {
        ++field9380;
        return this.field9611;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;", line = 13)
    public final NativeHeapBuffer method3835(boolean arg0, int arg1, int arg2) {
        ++field9366;
        if (arg1 != 0) {
            this.field9535 = false;
        }
        return this.field9422.method3794(arg2, arg0);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 24)
    private final void method3836(int arg0) {
        if (arg0 == 487) {
            this.method2771((byte) -101);
            ++field9322;
            if (this.field9550 != null) {
                this.field9550.method1335(118);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIIIIZ)Lhh;", line = 39)
    public final class140 method462(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9399;
        return new class676(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V", line = 49)
    public final void method3837(byte arg0) {
        ++field9462;
        this.method3862((byte) 18);
        if (arg0 < 27) {
            this.method436(72, 105, 111, -103);
        }
        this.method3836(487);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZ)Lhh;", line = 62)
    public final class140 method488(int arg0, int arg1, boolean arg2) {
        ++field9471;
        return new class676(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Luaa;)V", line = 75)
    public final void method481(int arg0, class127[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field9561[var3] = arg1[var3];
        }
        ++field9429;
        this.field9516 = arg0;
        if (this.field9605.method213(0)) {
            this.method2766(11);
        }
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(II)V", line = 93)
    public final void method3838(int arg0, int arg1) {
        if (this.field9563 != arg0) {
            this.field9563 = arg0;
            this.method2760(98);
        }
        if (arg1 != Integer.MAX_VALUE) {
            this.method2766(-39);
        }
        ++field9435;
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)I", line = 109)
    public final int method3839(int arg0) {
        ++field9426;
        if (arg0 <= 100) {
            this.method3840(101);
        }
        return this.field9575;
    }

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)V", line = 120)
    private final void method3840(int arg0) {
        if (arg0 != 12402) {
            this.field9565 = -110;
        }
        this.field9604 = false;
        ++field9455;
        this.method3891(arg0 ^ -29615);
        if (class219.field2841 == this.field9605) {
            this.method3836(487);
        }
    }

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "()V", line = 137)
    public final void method490() {
        if (this.field9528 != null) {
            this.field9528.method4133((byte) 66);
        }
        ++field9458;
    }

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "(I)Lod;", line = 149)
    public final class532 method3841(int arg0) {
        if (!this.field9514) {
            this.field9506.method3072(this.field9504, this.field9501);
            this.field9514 = true;
        }
        if (arg0 != -7153) {
            this.method3882(-43, (class352) null);
        }
        ++field9423;
        return this.field9506;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIIZZI)V", line = 169)
    private final void method3842(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        boolean var7 = arg3 & this.method459();
        ++field9344;
        int var8 = -39 % ((arg0 - -3) / 47);
        if (!var7 && (arg1 == 4 || ~arg1 == -9 || ~arg1 == -10)) {
            arg1 = 2;
            arg5 = arg1 != 4 ? 1 : 1 & arg2;
            arg2 = 0;
        }
        if (arg1 != 0 && arg4) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field9555 != arg1) {
            if (~this.field9555 != -1) {
                this.field9544[this.field9555 & Integer.MAX_VALUE].method220(23363);
            }
            if (arg1 == 0) {
                this.field9550 = null;
            } else {
                this.field9550 = this.field9544[Integer.MAX_VALUE & arg1];
                this.field9550.method222(-128, arg4);
                this.field9550.method225(true, arg4);
                this.field9550.method219(arg5, 0, arg2);
            }
            this.field9555 = arg1;
            this.field9595 = arg2;
            this.field9537 = arg5;
        } else if (~this.field9555 != -1) {
            this.field9544[this.field9555 & Integer.MAX_VALUE].method225(true, arg4);
            if (this.field9595 != arg2 || ~this.field9537 != ~arg5) {
                this.field9544[Integer.MAX_VALUE & this.field9555].method219(arg5, 0, arg2);
                this.field9537 = arg5;
                this.field9595 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "(IIIII)V", line = 224)
    public final void method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method487(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field9367;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IF)V", line = 232)
    public final void method3843(int arg0, float arg1) {
        if (this.field9588 != arg1) {
            this.field9588 = arg1;
            this.method3898(24252);
        }
        if (arg0 <= 95) {
            this.method484((class625) null, -70, -118, 11, 27);
        }
        ++field9463;
    }

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "()I", line = 256)
    public final int method496() {
        ++field9413;
        return this.field9496 + this.field9492 + this.field9495;
    }

    @OriginalMember(owner = "client!ee", name = "pa", descriptor = "()V", line = 264)
    public final void method500() {
        ++field9348;
        this.field9598 = false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIII)V", line = 273)
    public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field9460;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method3902(-2);
        this.method3838(arg4, Integer.MAX_VALUE);
        this.method3859(122, 0, class64.field840);
        this.method3867((byte) 18, class64.field840, 0);
        this.method3893(-73, arg5);
        this.method3880(8);
        this.method2817((byte) 102, false);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (var14 <= arg6) {
            var20 = (float) (arg6 - var14) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        } else {
            var18 = (float) (-var14 + arg6 + arg7) * var11;
            var17 = (float) (-var14 + arg7 + arg6) * var12;
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
                    var19 = (float) arg2 - var21;
                }
            } else {
                if ((float) arg2 < var21) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg1 < arg3) {
                if (var22 > (float) arg3) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if ((float) arg3 > var22) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method3901(0.0F, var21, -98, var19 + var21, var22, var20 + var22, 0.0F)) {
                return;
            }
            this.method3905(3);
            var21 += var19 + var23;
            var22 += var20 + var24;
            var20 = var16;
            var19 = var15;
        }
        this.method2817((byte) 102, true);
        this.method3867((byte) 18, class790.field10851, 0);
        this.method3859(120, 0, class790.field10851);
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V", line = 392)
    public final void method537(int arg0) {
        ++field9465;
    }

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "(I)V", line = 400)
    public final void method3844(int arg0) {
        if (arg0 == 2) {
            if (~this.field9519 != -9) {
                this.method3875(-18388);
                this.method3853(true, -96);
                this.method3887(true, true);
                this.method3849((byte) 54, true);
                this.method3893(99, 1);
                this.field9519 = 8;
            }
            ++field9443;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)I", line = 420)
    public final int method473(int arg0, int arg1) {
        ++field9382;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZ)V", line = 429)
    public final void method3845(byte arg0, boolean arg1) {
        if (arg0 != 54) {
            this.method3876(23);
        }
        ++field9486;
        if (this.field9521 != arg1) {
            this.field9521 = arg1;
            this.method2797(arg0 ^ -55);
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(Z)V", line = 445)
    private final void method3846(boolean arg0) {
        if (class109.field1519 == this.field9605) {
            float var2 = this.method2796(105);
            this.field9501.method3093(var2, 0.0F, 16383, var2);
        }
        ++field9357;
        this.field9514 = false;
        if (!arg0) {
            this.method3845((byte) 78, true);
        }
        this.method2762((byte) -55);
        if (this.field9550 != null) {
            this.field9550.method1337((byte) 125);
        }
    }

    @OriginalMember(owner = "client!ee", name = "JA", descriptor = "(IIIIII)I", line = 469)
    public final int method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9450;
        int var7 = 0;
        float var8 = (float) arg2 * this.field9502.field7374 + (float) arg0 * this.field9502.field7368 + (float) arg1 * this.field9502.field7355 + this.field9502.field7358;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field9502.field7374 + (float) arg3 * this.field9502.field7368 + (float) arg4 * this.field9502.field7355 + this.field9502.field7358;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field9571 > var8 && var9 < (float) this.field9571) {
            var7 |= 16;
        } else if (var8 > (float) this.field9533 && (float) this.field9533 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field9502.field7341 + (float) arg0 * this.field9502.field7384 + (float) arg1 * this.field9502.field7350 + this.field9502.field7377) * (float) this.field9573 / var8);
        int var11 = (int) (((float) arg5 * this.field9502.field7341 + (float) arg3 * this.field9502.field7384 + (float) arg4 * this.field9502.field7350 + this.field9502.field7377) * (float) this.field9573 / var9);
        if ((float) var10 < this.field9552 && (float) var11 < this.field9552) {
            var7 |= 1;
        } else if ((float) var10 > this.field9559 && (float) var11 > this.field9559) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field9502.field7376 + (float) arg0 * this.field9502.field7371 + (float) arg1 * this.field9502.field7357 + this.field9502.field7342) * (float) this.field9557 / var8);
        int var13 = (int) (((float) arg5 * this.field9502.field7376 + (float) arg3 * this.field9502.field7371 + (float) arg4 * this.field9502.field7357 + this.field9502.field7342) * (float) this.field9557 / var9);
        if (this.field9587 > (float) var12 && (float) var13 < this.field9587) {
            var7 |= 4;
        } else if (this.field9570 < (float) var12 && this.field9570 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 521)
    public final void method556(Canvas arg0) {
        this.field9461 = null;
        ++field9308;
        this.field9365 = null;
        if (arg0 != null && this.field9434 != arg0) {
            if (this.field9387.containsKey(arg0)) {
                this.field9461 = this.field9387.get(arg0);
                this.field9365 = arg0;
            }
        } else {
            this.field9365 = this.field9434;
            this.field9461 = this.field9343;
        }
        if (this.field9365 != null && this.field9461 != null) {
            this.method2819(true, this.field9365, this.field9461);
            this.method3873((byte) -123);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V", line = 553)
    public final void method528(int arg0) {
        ++field9310;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field9528 != null) {
                this.field9528.method4133((byte) 66);
            }
            this.field9551 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ee", name = "xa", descriptor = "(F)V", line = 570)
    public final void method468(float arg0) {
        ++field9346;
        if (this.field9579 != arg0) {
            this.field9579 = arg0;
            this.field9412.setAmbient(arg0);
            this.method2810(-30427);
            this.method2785(false);
        }
    }

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "()Z", line = 588)
    public final boolean method480() {
        ++field9484;
        return this.field9580;
    }

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "(I)V", line = 597)
    private final void method3847(int arg0) {
        ++field9405;
        this.field9553[10] = this.field9542;
        this.field9553[14] = this.field9524;
        this.field9562 = (this.field9553[14] + (float) (-this.field9533)) / this.field9553[10];
        int var2 = -66 % ((arg0 - -53) / 49);
    }

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "(I)I", line = 611)
    public final int method3848(int arg0) {
        ++field9478;
        if (arg0 < 72) {
            this.method495(16);
        }
        return this.field9508;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(BZ)V", line = 628)
    public final void method3849(byte arg0, boolean arg1) {
        ++field9315;
        if (this.field9531 != arg1) {
            this.field9531 = arg1;
            this.method2763((byte) 103);
            this.field9519 &= -32;
        }
        if (arg0 != 54) {
            this.field9551 = 115;
        }
    }

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "(I)I", line = 648)
    public final int method3850(int arg0) {
        int var2 = -98 % ((arg0 - 52) / 49);
        ++field9452;
        return this.field9586;
    }

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "()Lal;", line = 660)
    public final class109 method541() {
        ++field9364;
        return new class532();
    }

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "(I)V", line = 668)
    private final void method3851(int arg0) {
        ++field9433;
        this.field9513 = (float) this.field9533;
        if (arg0 != Integer.MIN_VALUE) {
            this.method3862((byte) 71);
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(Z)V", line = 681)
    public final void method3852(boolean arg0) {
        if (!arg0) {
            this.field9557 = 30;
        }
        this.field9491 = false;
        ++field9441;
        this.method3846(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V", line = 693)
    public final void method3853(boolean arg0, int arg1) {
        ++field9372;
        if (arg1 >= -86) {
            this.field9537 = 123;
        }
        if (this.field9583 != arg0) {
            this.field9583 = arg0;
            this.method2797(-1);
            this.field9519 &= -32;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lza;)V", line = 710)
    public final void method501(class434 arg0) {
        ++field9312;
        this.field9422 = ((class482) arg0).field6753;
        this.field9351 = this.field9422.method3794(32768, false);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[I[I)Laa;", line = 722)
    public final class512 method504(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field9414;
        return class784.method4305(arg2, arg0, arg3, this, -96, arg1);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V", line = 738)
    private final void method3854(byte arg0) {
        if (arg0 > -86) {
            this.method442(112);
        }
        this.field9610 = this.method2795(0, false);
        ++field9373;
        this.field9610.method2339(140, -32754, 28);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field9610.method2338(true, false);
            if (var3 != null) {
                Stream var4 = this.method3889(0, var3);
                if (!Stream.method3798()) {
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(1.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(1.0F);
                    var4.method3809(0.0F);
                    var4.method3809(1.0F);
                    var4.method3809(1.0F);
                    var4.method3809(1.0F);
                    var4.method3809(0.0F);
                    var4.method3809(1.0F);
                    var4.method3809(1.0F);
                    var4.method3809(1.0F);
                    var4.method3809(1.0F);
                    var4.method3809(1.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(1.0F);
                    var4.method3809(0.0F);
                    var4.method3809(1.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                    var4.method3809(0.0F);
                } else {
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(1.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(1.0F);
                    var4.method3800(0.0F);
                    var4.method3800(1.0F);
                    var4.method3800(1.0F);
                    var4.method3800(1.0F);
                    var4.method3800(0.0F);
                    var4.method3800(1.0F);
                    var4.method3800(1.0F);
                    var4.method3800(1.0F);
                    var4.method3800(1.0F);
                    var4.method3800(1.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(1.0F);
                    var4.method3800(0.0F);
                    var4.method3800(1.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                    var4.method3800(0.0F);
                }
                var4.method3797();
                if (this.field9610.method2337(6544)) {
                    break;
                }
            }
        }
        this.field9614 = this.method2791(new class92[] { new class92(new class382[] { class382.field5542, class382.field5552, class382.field5552 }) }, false);
    }

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "(I)Lod;", line = 854)
    public final class532 method3855(int arg0) {
        if (arg0 != -31606) {
            return null;
        } else {
            ++field9487;
            return this.field9566[this.field9508];
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZ)Lhh;", line = 865)
    public final class140 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field9497;
        class676 var6 = new class676(this, arg2, arg3, arg4);
        var6.method341(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ee", name = "HA", descriptor = "(IIII[I)V", line = 876)
    public final void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field9436;
        float var6 = this.field9502.method3094((float) arg0, (float) arg1, (float) arg2, 116);
        if (!((float) this.field9571 > var6) && !(var6 > (float) this.field9533)) {
            int var7 = (int) ((float) this.field9573 * this.field9502.method3092((float) arg2, (float) arg0, (float) arg1, 97) / (float) arg3);
            int var8 = (int) ((float) this.field9557 * this.field9502.method3073(-8861, (float) arg1, (float) arg2, (float) arg0) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[0] = (int) ((float) var7 + -this.field9552);
            arg4[1] = (int) ((float) var8 - this.field9587);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII[IZ)Lfk;", line = 900)
    public final class678 method3856(boolean arg0, int arg1, int arg2, int[] arg3, boolean arg4) {
        if (arg0) {
            this.field9585 = null;
        }
        ++field9379;
        return this.method2814(arg4, 0, arg1, arg2, arg3, -124, 0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lod;I)V", line = 912)
    public final void method3857(class532 arg0, int arg1) {
        ++field9327;
        this.field9501.method816(arg0);
        this.field9491 = false;
        if (arg1 != 0) {
            this.field9454 = null;
        }
        this.method3846(true);
    }

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "(I)V", line = 930)
    private final void method3858(int arg0) {
        this.field9559 = (float) (this.field9599 - this.field9507);
        if (arg0 != 0) {
            method3907(99, (byte) 121);
        }
        ++field9395;
        this.field9570 = (float) (this.field9574 - this.field9600);
        this.field9552 = (float) (-this.field9507 + this.field9522);
        this.field9587 = (float) (-this.field9600 + this.field9512);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILmq;)V", line = 945)
    public final void method3859(int arg0, int arg1, class534 arg2) {
        if (arg0 < 116) {
            this.method3846(false);
        }
        ++field9424;
        this.method2812(arg1, false, arg2, false, 0);
    }

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "(I)V", line = 958)
    private final void method3860(int arg0) {
        this.field9620 = this.method2795(0, false);
        ++field9466;
        this.field9620.method2339(3096, -32754, 12);
        int var2 = 0 / ((19 - arg0) / 58);
        for (int var3 = 0; ~var3 > -5; ++var3) {
            Buffer var4 = this.field9620.method2338(true, false);
            if (var4 != null) {
                Stream var5 = this.method3889(0, var4);
                var5.method3800(0.0F);
                var5.method3800(0.0F);
                var5.method3800(0.0F);
                for (int var6 = 0; ~var6 >= -257; ++var6) {
                    double var7 = (double) (var6 * 2) * 3.141592653589793D / 256.0D;
                    float var9 = (float) Math.cos(var7);
                    float var10 = (float) Math.sin(var7);
                    if (!Stream.method3798()) {
                        var5.method3809(var10);
                        var5.method3809(var9);
                        var5.method3809(0.0F);
                    } else {
                        var5.method3800(var10);
                        var5.method3800(var9);
                        var5.method3800(0.0F);
                    }
                }
                var5.method3797();
                if (this.field9620.method2337(6544)) {
                    break;
                }
            }
        }
        this.field9624 = this.method2791(new class92[] { new class92(class382.field5542) }, false);
    }

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "(III[I)V", line = 1025)
    public final void method552(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9320;
        float var5 = this.field9502.method3094((float) arg0, (float) arg1, (float) arg2, 92);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field9507;
            var7 = this.field9600;
        } else {
            var6 = (int) ((float) this.field9573 * this.field9502.method3092((float) arg2, (float) arg0, (float) arg1, 113) / var5);
            var7 = (int) ((float) this.field9557 * this.field9502.method3073(-8861, (float) arg1, (float) arg2, (float) arg0) / var5);
        }
        arg3[0] = (int) ((float) var6 + -this.field9552);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 + -this.field9587);
    }

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "(I)V", line = 1050)
    public void method2766(int arg0) {
        if (arg0 != 11) {
            this.method2781(122);
        }
        ++field9485;
        this.field9572 = this.field9516;
        this.field9516 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "()[I", line = 1062)
    public final int[] method532() {
        ++field9468;
        return new int[] { this.field9507, this.field9600, this.field9573, this.field9557 };
    }

    @OriginalMember(owner = "client!ee", name = "KA", descriptor = "(IIII)V", line = 1070)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field9488;
        if (arg0 <= 0 && ~(this.field9469 + -1) >= ~arg2 && arg1 <= 0 && this.field9440 - 1 <= arg3) {
            this.method526();
        } else {
            this.field9574 = this.field9469 < arg3 ? 0 : arg3;
            this.field9599 = arg2 > this.field9469 ? 0 : arg2;
            this.field9522 = arg0 >= 0 ? arg0 : 0;
            this.field9512 = ~arg1 <= -1 ? arg1 : 0;
            if (!this.field9630) {
                this.field9630 = true;
                this.method2777((byte) -78);
            }
            this.method2799(true);
            this.method3858(0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZI[BLg;)Lfk;", line = 1099)
    public final class678 method3861(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, class166 arg5) {
        if (arg3 != 12413) {
            return null;
        } else {
            ++field9404;
            return this.method2808(arg1, arg5, arg4, 0, arg0, -121, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(II)I", line = 1111)
    public final int method520(int arg0, int arg1) {
        ++field9477;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "()Z", line = 1126)
    public final boolean method455() {
        ++field9314;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)V", line = 1134)
    public final void method3862(byte arg0) {
        if (class453.field6504 != this.field9605) {
            class37 var2 = this.field9605;
            this.field9605 = class453.field6504;
            if (var2.method213(0)) {
                this.method3876(18004);
            }
            this.field9519 &= -32;
            this.field9554 = this.field9511;
        }
        ++field9416;
        if (arg0 != 18) {
            this.method2766(127);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ltv;I)V", line = 1157)
    public final void method524(class586 arg0, int arg1) {
        ++field9349;
        this.field9545.method2080(arg1, this, 6360, arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIIZ)V", line = 1166)
    public final void method3863(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 != 27016) {
            this.field9628 = null;
        }
        if (~this.field9593 != ~arg1 || !this.field9598 != !this.field9576) {
            class678 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field9598 ? 3 : 0;
            if (~arg1 > -1) {
                this.method3878((byte) 86);
            } else {
                var5 = this.field9528.method4134(arg1, (byte) 72);
                class577 var10 = super.field913.method1114(arg1, -103);
                if (var10.field7861 == 0 && ~var10.field7852 == -1) {
                    this.method3878((byte) 86);
                } else {
                    int var11 = !var10.field7853 ? 128 : 64;
                    int var12 = var11 * 50;
                    class532 var13 = this.method3877(3);
                    var13.method3083(0.0F, (float) (this.field9602 % var12 * var10.field7861) / (float) var12, (float) (this.field9602 % var12 * var10.field7852) / (float) var12, (byte) -37);
                    this.method3883((byte) 79, class525.field7284);
                }
                var6 = var10.field7869;
                if (!this.field9598) {
                    var9 = var10.field7855;
                    var7 = var10.field7867;
                    var8 = var10.field7876;
                }
            }
            this.method3842((byte) 71, var9, var7, arg0, arg3, var8);
            if (this.field9550 != null) {
                this.field9550.method221(true, var5, var6);
            } else {
                this.method3882(0, var5);
                this.method3871(arg2 + -27016, var6);
            }
            this.field9593 = arg1;
            this.field9576 = this.field9598;
        }
        ++field9334;
        this.field9519 &= -8;
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(B)Lod;", line = 1236)
    public final class532 method3864(byte arg0) {
        if (arg0 > -48) {
            return null;
        } else {
            ++field9446;
            return this.field9501;
        }
    }

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "(I)Lfaa;", line = 1247)
    public final class165 method3865(int arg0) {
        ++field9393;
        if (arg0 != 0) {
            this.method3861(-111, 70, true, 107, (byte[]) null, (class166) null);
        }
        return this.field9567 != null ? this.field9567.method701((byte) -64) : null;
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(B)V", line = 1261)
    private final void method3866(byte arg0) {
        if (arg0 == -106) {
            if (class109.field1519 != this.field9605) {
                class37 var2 = this.field9605;
                this.field9605 = class109.field1519;
                if (var2.method213(arg0 + 106)) {
                    this.method3876(18004);
                }
                this.method3903(arg0 ^ 35);
                this.field9554 = this.field9584;
                this.method3836(487);
                this.field9519 &= -25;
            }
            ++field9480;
        }
    }

    @OriginalMember(owner = "client!ee", name = "EA", descriptor = "(IIII)V", line = 1287)
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        ++field9363;
        if (!this.field9598) {
            throw new RuntimeException("");
        } else {
            this.field9586 = arg1;
            this.field9575 = arg2;
            this.field9517 = arg0;
            this.field9538 = arg3;
            if (this.field9576) {
                this.field9544[3].method672(-115);
                this.field9544[3].method673(-23970);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLmq;I)V", line = 1308)
    public final void method3867(byte arg0, class534 arg1, int arg2) {
        this.method2786(arg0 + -18, arg1, false, arg2);
        if (arg0 != 18) {
            this.method3839(-110);
        }
        ++field9500;
    }

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "()Z", line = 1323)
    public final boolean method538() {
        ++field9421;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "(I)Lod;", line = 1332)
    public final class532 method3868(int arg0) {
        ++field9448;
        return arg0 != 1 ? null : this.field9504;
    }

    @OriginalMember(owner = "client!ee", name = "XA", descriptor = "()I", line = 1343)
    public final int method469() {
        ++field9420;
        return this.field9533;
    }

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "(I)V", line = 1351)
    private final void method3869(int arg0) {
        ++field9368;
        if (arg0 < -112) {
            this.field9603 = false;
            if (class109.field1519 == this.field9605) {
                this.method3903(-80);
                this.method3836(487);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "(I)V", line = 1371)
    public static void method3870(int arg0) {
        field9419 = null;
        field9453 = null;
        if (arg0 != 0) {
            field9475 = 0.057449482440971436D;
        }
    }

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "(IIIIII[BII)V", line = 1383)
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field9489;
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(II)V", line = 1390)
    public final void method3871(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method556((Canvas) null);
        }
        ++field9402;
        if (arg1 != 1) {
            if (~arg1 != -1) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.method3911(22228, class291.field4152, class175.field2307);
                        return;
                    }
                    if (~arg1 == -5) {
                        this.method3911(22228, class66.field895, class66.field895);
                        return;
                    }
                } else {
                    this.method3911(arg0 + 22228, class117.field1574, class328.field4644);
                }
            } else {
                this.method3911(22228, class291.field4152, class291.field4152);
            }
        } else {
            this.method3911(22228, class117.field1574, class117.field1574);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 1421)
    public final void method546(Canvas arg0, int arg1, int arg2) {
        ++field9438;
        Object var4 = null;
        if (arg0 != null && this.field9434 != arg0) {
            if (this.field9387.containsKey(arg0)) {
                var4 = this.field9387.get(arg0);
            }
        } else {
            var4 = this.field9461;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method2811(arg0, (byte) 67, var4);
            if (this.field9365 == arg0) {
                this.method3873((byte) -123);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I)V", line = 1449)
    public final void method447(int[] arg0) {
        arg0[0] = this.field9469;
        ++field9407;
        arg0[1] = this.field9440;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(ZI)V", line = 1460)
    public final void method3872(boolean arg0, int arg1) {
        if (this.field9534 != arg0) {
            this.field9534 = arg0;
            this.method2821((byte) -27);
        }
        if (arg1 <= -105) {
            ++field9384;
        }
    }

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "(IIIIIII)I", line = 1481)
    public final int method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9345;
        int var8 = 0;
        float var9 = (float) arg2 * this.field9502.field7374 + (float) arg0 * this.field9502.field7368 + (float) arg1 * this.field9502.field7355 + this.field9502.field7358;
        float var10 = (float) arg5 * this.field9502.field7374 + (float) arg3 * this.field9502.field7368 + (float) arg4 * this.field9502.field7355 + this.field9502.field7358;
        if ((float) this.field9571 > var9 && var10 < (float) this.field9571) {
            var8 |= 16;
        } else if (var9 > (float) this.field9533 && var10 > (float) this.field9533) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field9502.field7341 + (float) arg0 * this.field9502.field7384 + (float) arg1 * this.field9502.field7350 + this.field9502.field7377) * (float) this.field9573 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field9502.field7341 + (float) arg3 * this.field9502.field7384 + (float) arg4 * this.field9502.field7350 + this.field9502.field7377) * (float) this.field9573 / (float) arg6);
        if ((float) var11 < this.field9552 && (float) var12 < this.field9552) {
            var8 |= 1;
        } else if ((float) var11 > this.field9559 && this.field9559 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field9502.field7376 + (float) arg0 * this.field9502.field7371 + (float) arg1 * this.field9502.field7357 + this.field9502.field7342) * (float) this.field9557 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field9502.field7376 + (float) arg3 * this.field9502.field7371 + (float) arg4 * this.field9502.field7357 + this.field9502.field7342) * (float) this.field9557 / (float) arg6);
        if ((float) var13 < this.field9587 && this.field9587 > (float) var14) {
            var8 |= 4;
        } else if (this.field9570 < (float) var13 && this.field9570 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "(B)V", line = 1529)
    private final void method3873(byte arg0) {
        if (this.field9365 == null) {
            this.field9383 = this.field9309 = 1;
        } else {
            Dimension var2 = this.field9365.getSize();
            this.field9383 = var2.width;
            this.field9309 = var2.height;
        }
        ++field9333;
        this.field9440 = this.field9309;
        this.field9469 = this.field9383;
        this.method3869(-124);
        this.method3840(12402);
        this.method3898(24252);
        this.method2781(0);
        this.method3858(0);
        if (arg0 != -123) {
            this.field9504 = null;
        }
        this.method3862((byte) 18);
        this.method526();
    }

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "(I)V", line = 1566)
    public final void method3874(int arg0) {
        this.field9525 = new class352[this.field9547];
        ++field9411;
        this.field9509 = new class152[this.field9547];
        this.field9530 = new class45[this.field9547];
        this.field9582 = new class152[this.field9547];
        this.field9566 = new class532[this.field9547];
        for (int var2 = 0; ~var2 > ~this.field9547; ++var2) {
            this.field9509[var2] = class291.field4152;
            this.field9582[var2] = class291.field4152;
            this.field9530[var2] = class183.field2405;
            this.field9566[var2] = new class532();
        }
        this.field9561 = new class127[this.field9541 - 2];
        this.field9539 = this.method2793(class415.field5986, 1, (byte) -124, 1, class109.field1521);
        this.method501(new class482(262144));
        this.field9622 = this.method2791(new class92[] { new class92(new class382[] { class382.field5542, class382.field5552 }) }, false);
        this.field9613 = this.method2791(new class92[] { new class92(new class382[] { class382.field5542, class382.field5550 }) }, false);
        this.field9616 = this.method2791(new class92[] { new class92(class382.field5542), new class92(class382.field5550), new class92(class382.field5552), new class92(class382.field5546) }, false);
        this.field9621 = this.method2791(new class92[] { new class92(class382.field5542), new class92(class382.field5550), new class92(class382.field5552) }, false);
        this.field9609 = new class233(this, 0, 0, false, false);
        this.field9623 = new class233(this, 0, 0, true, true);
        this.field9617 = new class233(this, 0, 0, false, false);
        this.field9608 = new class233(this, 0, 0, true, true);
        this.field9626 = new class233(this, 0, 0, false, false);
        this.field9625 = new class233(this, 0, 0, true, true);
        this.field9615 = new class233(this, 0, 0, false, false);
        this.field9618 = new class233(this, 0, 0, true, true);
        this.field9628 = new class233(this, 0, 0, false, false);
        this.field9627 = new class233(this, 0, 0, true, true);
        this.field9545 = new class321(this);
        this.field9619 = this.method2813(true, (byte) -114);
        this.method3896((byte) 121);
        this.field9400 = new class314(this);
        this.field9544[1] = this.method2775(1, arg0 + -19168);
        this.field9544[2] = this.method2775(2, 10);
        this.field9544[4] = this.method2775(4, 10);
        this.field9544[5] = this.method2775(5, class250.method1635(arg0, 19168));
        this.field9544[6] = this.method2775(6, 10);
        if (arg0 != 19178) {
            this.field9511 = null;
        }
        this.field9544[7] = this.method2775(7, 10);
        this.field9544[3] = this.method2775(3, 10);
        this.field9544[8] = this.method2775(8, 10);
        this.field9544[9] = this.method2775(9, arg0 + -19168);
        if (!this.field9544[2].method218((byte) 17)) {
            this.field9544[2] = this.method2775(0, class250.method1635(arg0, 19168));
        }
        if (!this.field9544[4].method218((byte) 30)) {
            this.field9544[4] = this.field9544[2];
        }
        if (!this.field9544[8].method218((byte) 53)) {
            this.field9544[8] = this.field9544[4];
        }
        if (!this.field9544[9].method218((byte) 59)) {
            this.field9544[9] = this.field9544[8];
        }
        this.method2804(arg0 ^ -32112);
        this.method526();
        this.method482();
    }

    @OriginalMember(owner = "client!ee", name = "DA", descriptor = "(IIII)V", line = 1644)
    public final void method436(int arg0, int arg1, int arg2, int arg3) {
        this.field9573 = arg2;
        ++field9376;
        this.field9557 = arg3;
        this.field9600 = arg1;
        this.field9507 = arg0;
        this.method3898(24252);
        this.method3840(12402);
        this.method3862((byte) 18);
        this.method3858(0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIILaa;II)V", line = 1660)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        ++field9323;
    }

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "(ILaa;II)V", line = 1667)
    public final void method449(int arg0, class512 arg1, int arg2, int arg3) {
        ++field9374;
        class237 var5 = (class237) arg1;
        class678 var6 = var5.field3156;
        this.method3899(0);
        this.method3882(0, var6);
        this.method3893(13, 1);
        this.method3911(22228, class117.field1574, class117.field1574);
        this.method3859(123, 0, class64.field840);
        this.method3838(arg0, Integer.MAX_VALUE);
        this.field9501.method3080((float) this.field9440, (float) this.field9469, 0.0F, (byte) -89);
        this.method3852(true);
        this.field9566[0].method3080(var6.method621(20490, (float) this.field9440), var6.method617((float) this.field9469, false), 1.0F, (byte) -89);
        this.field9566[0].method3093(var6.method617((float) (-arg2), false), 0.0F, 16383, var6.method621(20490, (float) (-arg3)));
        this.field9530[0] = class525.field7284;
        this.method3915((byte) 115);
        this.method3900(240957680);
        this.method3878((byte) 86);
        this.method3859(120, 0, class790.field10851);
    }

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "(I)V", line = 1693)
    private final void method3875(int arg0) {
        ++field9350;
        if (class219.field2841 != this.field9605) {
            class37 var2 = this.field9605;
            this.field9605 = class219.field2841;
            if (!var2.method213(0)) {
                this.method3876(arg0 + 36392);
            }
            this.method3891(-17373);
            this.field9554 = this.field9553;
            this.method3836(487);
            this.field9519 &= -8;
        }
        if (arg0 != -18388) {
            this.field9613 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "()Z", line = 1723)
    public final boolean method536() {
        ++field9431;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "la", descriptor = "()V", line = 1733)
    public final void method526() {
        this.field9574 = this.field9440;
        ++field9385;
        this.field9522 = 0;
        this.field9512 = 0;
        this.field9599 = this.field9469;
        if (this.field9630) {
            this.field9630 = false;
            this.method2777((byte) -78);
        }
        this.method3858(0);
    }

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "(I)V", line = 1751)
    private final void method3876(int arg0) {
        if (arg0 != 18004) {
            this.field9629 = null;
        }
        this.field9514 = false;
        ++field9498;
        if (this.field9550 != null) {
            this.field9550.method1336(256);
        }
        this.method2803((byte) 107);
    }

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "(I)Lod;", line = 1768)
    public final class532 method3877(int arg0) {
        ++field9359;
        if (arg0 != 3) {
            this.field9519 = -73;
        }
        return this.field9566[this.field9508];
    }

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "(B)V", line = 1779)
    public final void method3878(byte arg0) {
        if (this.field9530[this.field9508] != class183.field2405) {
            this.field9530[this.field9508] = class183.field2405;
            this.field9566[this.field9508].method822();
            this.method3915((byte) 115);
        }
        if (arg0 == 86) {
            ++field9341;
        }
    }

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "(I)V", line = 1796)
    public final void method3879(int arg0) {
        ++field9398;
        Enumeration var2 = this.field9387.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method2780(var3, -71, this.field9387.get(var3));
        }
        this.field9610.method851(arg0 ^ 21765);
        this.field9629.method851(arg0 ^ 21765);
        this.field9620.method851(-21765);
        this.field9623.method1475(5732);
        if (arg0 != -2) {
            this.method3849((byte) -107, false);
        }
        this.field9608.method1475(5732);
        this.field9625.method1475(5732);
        this.field9618.method1475(5732);
        this.field9627.method1475(5732);
        this.field9545.method2082((byte) -127);
        this.field9619.method851(arg0 + -21763);
    }

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "()Z", line = 1828)
    public final boolean method503() {
        ++field9325;
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 1843)
    public final void method492(Canvas arg0, int arg1, int arg2) {
        ++field9360;
        if (this.field9434 == arg0) {
            throw new RuntimeException();
        } else if (!this.field9387.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method2790(arg0, 125);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field9387.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "(I)V", line = 1881)
    public final void method3880(int arg0) {
        this.field9501.method822();
        ++field9352;
        if (arg0 != 8) {
            this.method456(-35, 28, 78, -9);
        }
        this.field9491 = true;
        this.method3846(true);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "()Z", line = 1902)
    public final boolean method458() {
        ++field9358;
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILfga;)V", line = 1912)
    private final void method3881(int arg0, int arg1, class269 arg2) {
        this.method2818(false, this.field9610, arg1);
        ++field9338;
        this.method2816((byte) 121, this.field9614);
        this.method2778((byte) -82, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILb;)V", line = 1924)
    public final void method3882(int arg0, class352 arg1) {
        ++field9394;
        if (arg0 != 0) {
            this.field9576 = false;
        }
        if (this.field9525[this.field9508] != arg1) {
            this.field9525[this.field9508] = arg1;
            if (arg1 == null) {
                this.method2764((byte) 127);
            } else {
                arg1.method702((byte) -122);
            }
            this.field9519 &= -2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLvba;)V", line = 1945)
    public final void method3883(byte arg0, class45 arg1) {
        if (arg0 <= 31) {
            this.field9583 = true;
        }
        this.field9530[this.field9508] = arg1;
        ++field9442;
        this.method3915((byte) -75);
    }

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "(I)V", line = 1957)
    private final void method3884(int arg0) {
        if (arg0 == 32414) {
            ++field9335;
            if (this.field9550 != null) {
                this.field9550.method673(-23970);
            }
            this.method2759(false);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(ZB)V", line = 1974)
    public final void method3885(boolean arg0, byte arg1) {
        ++field9408;
        if (this.field9543 != arg0) {
            this.field9543 = arg0;
            this.method2774((byte) 106);
        }
        if (arg1 != -81) {
            this.field9575 = 108;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()Lal;", line = 1993)
    public final class109 method444() {
        ++field9354;
        return this.field9502;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 2001)
    public final void method470(boolean arg0) {
        ++field9389;
    }

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "(II)V", line = 2009)
    public final void method3886(int arg0, int arg1) {
        ++field9317;
        if (arg0 > 16) {
            if (~this.field9508 != ~arg1) {
                this.field9508 = arg1;
                this.method2761(7);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()Z", line = 2026)
    public final boolean method448() {
        ++field9375;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lal;)V", line = 2037)
    public final void method509(class109 arg0) {
        this.field9502 = (class532) arg0;
        ++field9332;
        this.field9504.method816(this.field9502);
        this.field9504.method3082(true);
        this.field9505.method3075(5, this.field9504);
        this.field9503.method3075(5, this.field9502);
        if (this.field9605.method213(0)) {
            this.method3876(18004);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZ)V", line = 2053)
    public final void method3887(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method3878((byte) 126);
        }
        ++field9362;
        if (!this.field9549 != !arg0) {
            this.field9549 = arg0;
            this.method2798(-92);
            this.field9519 &= -32;
        }
    }

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "()I", line = 2070)
    public final int method494() {
        ++field9428;
        return this.field9631;
    }

    @OriginalMember(owner = "client!ee", name = "aa", descriptor = "(IIIIII)V", line = 2081)
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3902(-2);
        ++field9396;
        this.method3838(arg4, Integer.MAX_VALUE);
        this.method3859(117, 0, class64.field840);
        this.method3867((byte) 18, class64.field840, 0);
        this.method3893(110, arg5);
        this.field9501.method3080((float) arg3, (float) arg2, 1.0F, (byte) -89);
        this.field9501.method818(arg0, arg1, 0);
        this.method3852(true);
        this.method2817((byte) 102, false);
        this.method3900(240957680);
        this.method2817((byte) 102, true);
        this.method3867((byte) 18, class790.field10851, 0);
        this.method3859(126, 0, class790.field10851);
    }

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "(I)V", line = 2102)
    public final void method3888(int arg0) {
        if (~this.field9519 != -5) {
            this.method3866((byte) -106);
            this.method3853(false, -110);
            this.method3894(16544, false);
            this.method3887(false, true);
            this.method3849((byte) 54, false);
            this.method3863(false, -2, arg0 + 46245, false);
            this.method3893(10, 1);
            this.method3871(0, 0);
            this.field9519 = 4;
        }
        if (arg0 != -19229) {
            this.field9387 = null;
        }
        ++field9483;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V", line = 2127)
    public void method533(int arg0) {
        ++field9378;
        if (this.field9528 != null) {
            this.field9528.method4136(5);
        }
        this.field9602 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "(I)V", line = 2139)
    public void method2804(int arg0) {
        this.method3916(false);
        if (arg0 != -14214) {
            this.method481(-68, (class127[]) null);
        }
        ++field9319;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;", line = 2152)
    public final Stream method3889(int arg0, Buffer arg1) {
        ++field9418;
        if (arg0 != 0) {
            this.field9589 = null;
        }
        this.field9585.method3808(arg1);
        return this.field9585;
    }

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "(I)I", line = 2164)
    public final int method3890(int arg0) {
        if (arg0 != 13) {
            return -92;
        } else {
            ++field9459;
            return this.field9538;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2175)
    public final class295 method516(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field9356;
        return new class501(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(IIIIII)V", line = 2184)
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9370;
        float var7 = this.method2796(112);
        this.method3902(-2);
        this.method3838(arg4, Integer.MAX_VALUE);
        this.method3859(121, 0, class64.field840);
        this.method3867((byte) 18, class64.field840, 0);
        this.method3893(113, arg5);
        this.field9501.method3080((float) (arg3 - 1), (float) (arg2 - 1), 1.0F, (byte) -89);
        this.field9501.method3093((float) arg0 + -var7, 0.0F, 16383, (float) arg1 - var7);
        this.method3852(true);
        this.method2817((byte) 102, false);
        this.method3881(4, 0, class84.field1198);
        this.method2817((byte) 102, true);
        this.method3867((byte) 18, class790.field10851, 0);
        this.method3859(124, 0, class790.field10851);
    }

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "(I)V", line = 2206)
    private final void method3891(int arg0) {
        ++field9401;
        if (!this.field9604) {
            float[] var2 = this.field9553;
            float var3 = (float) (-this.field9507 * this.field9571) / (float) this.field9573;
            float var4 = (float) ((-this.field9507 + this.field9469) * this.field9571) / (float) this.field9573;
            float var5 = (float) (this.field9600 * this.field9571) / (float) this.field9557;
            float var6 = (float) ((-this.field9440 + this.field9600) * this.field9571) / (float) this.field9557;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field9571 * 2.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = this.field9524 = (float) (this.field9571 * this.field9533) / (float) (-this.field9533 + this.field9571);
                var2[11] = -1.0F;
                var2[4] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[10] = this.field9542 = (float) this.field9533 / (float) (-this.field9533 + this.field9571);
                var2[12] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[15] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[13] = 0.0F;
            } else {
                var2[5] = 1.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
            }
            this.method3847(-113);
            this.field9604 = true;
        }
        if (arg0 != -17373) {
            this.field9528 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "()Z", line = 2276)
    public final boolean method479() {
        ++field9388;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "(II)Lra;", line = 2284)
    public final class118 method3892(int arg0, int arg1) {
        if (arg0 * arg1 > this.field9619.method84(arg0 + -119)) {
            this.field9619.method850(-8165, arg1);
        }
        ++field9361;
        return this.field9619;
    }

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "(I)V", line = 2296)
    public final void method477(int arg0) {
        ++field9494;
        this.field9577 = 0;
        while (~arg0 < -2) {
            ++this.field9577;
            arg0 >>= 1;
        }
        this.field9568 = 1 << this.field9577;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Leb;[Lvf;Z)Lda;", line = 2312)
    public final class67 method502(class651 arg0, class162[] arg1, boolean arg2) {
        ++field9307;
        return new class258(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 2320)
    public final void method505(int arg0) {
        ++field9355;
    }

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "(II)V", line = 2328)
    public final void method3893(int arg0, int arg1) {
        int var3 = -69 % ((55 - arg0) / 39);
        ++field9457;
        if (~this.field9565 != ~arg1) {
            boolean var4;
            boolean var5;
            class426 var6;
            if (arg1 != 1) {
                if (arg1 == 2) {
                    var4 = true;
                    var5 = false;
                    var6 = class93.field1303;
                } else if (arg1 == 128) {
                    var5 = true;
                    var6 = class765.field10515;
                    var4 = true;
                } else {
                    var4 = false;
                    var5 = false;
                    var6 = class781.field10716;
                }
            } else {
                var6 = class612.field8269;
                var4 = true;
                var5 = true;
            }
            if (this.field9535 == !var5) {
                this.field9535 = var5;
                this.method2758((byte) -30);
            }
            if (!this.field9520 == var4) {
                this.field9520 = var4;
                this.method2789((byte) -112);
            }
            if (this.field9589 != var6) {
                this.field9589 = var6;
                this.method2772(-91);
            }
            this.field9519 &= -29;
            this.field9565 = arg1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IZ)V", line = 2396)
    public final void method3894(int arg0, boolean arg1) {
        ++field9444;
        if (arg0 != 16544) {
            this.field9546 = null;
        }
        if (arg1 == !this.field9601) {
            this.field9601 = arg1;
            this.method2821((byte) -27);
            this.field9519 &= -8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "()I", line = 2417)
    public final int method489() {
        ++field9340;
        return this.field9541 + -2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 2428)
    public final void method442(int arg0) {
        ++field9403;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ltv;)V", line = 2438)
    public final void method534(class586 arg0) {
        ++field9464;
        this.field9545.method2080(-1, this, 6360, arg0);
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V", line = 2449)
    public final void method495(int arg0) {
        ++field9353;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 2462)
    public static final String method3895(String arg0, byte arg1) {
        ++field9330;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = 92 / ((7 - arg1) / 62);
            int var4 = arg0.length();
            while (~var4 < ~var2 && class471.method2752(arg0.charAt(var2), (byte) 47)) {
                ++var2;
            }
            while (~var4 < ~var2 && class471.method2752(arg0.charAt(var4 + -1), (byte) 110)) {
                --var4;
            }
            int var5 = -var2 + var4;
            if (~var5 <= -2 && var5 <= 12) {
                StringBuffer var6 = new StringBuffer(var5);
                for (int var7 = var2; ~var7 > ~var4; ++var7) {
                    char var8 = arg0.charAt(var7);
                    if (class149.method1040(var8, 0)) {
                        char var9 = class141.method979(var8, -91);
                        if (var9 != 0) {
                            var6.append(var9);
                        }
                    }
                }
                if (~var6.length() == -1) {
                    return null;
                } else {
                    return var6.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "ra", descriptor = "(IIII)V", line = 2520)
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
        this.field9586 = arg1;
        this.field9538 = arg3;
        this.field9517 = arg0;
        ++field9437;
        this.field9575 = arg2;
        this.field9598 = true;
    }

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "(B)V", line = 2532)
    public final void method3896(byte arg0) {
        ++field9456;
        Hashtable var2 = new Hashtable();
        if (this.field9387 != null && !this.field9387.isEmpty()) {
            Enumeration var3 = this.field9387.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method2790(var4, 108));
            }
        }
        this.field9387 = var2;
        this.method3854((byte) -89);
        if (arg0 != 121) {
            this.field9624 = null;
        }
        this.method3912(-69);
        this.method3860(84);
        this.field9545.method2081(64, this);
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "()Z", line = 2565)
    public final boolean method460() {
        ++field9409;
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "(I)Lod;", line = 2574)
    public final class532 method3897(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field9449;
            return this.field9505;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lgl;IIII)Lka;", line = 2586)
    public final class497 method484(class625 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9318;
        return new class233(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ee", name = "za", descriptor = "(IIIII)V", line = 2595)
    public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3902(-2);
        ++field9476;
        this.method3838(arg3, Integer.MAX_VALUE);
        this.method3859(123, 0, class64.field840);
        this.method3867((byte) 18, class64.field840, 0);
        this.method3893(-19, arg4);
        this.field9501.method3080((float) arg2, (float) arg2, 1.0F, (byte) -89);
        this.field9501.method818(arg0, arg1, 0);
        this.method3852(true);
        this.method2817((byte) 102, false);
        this.method2818(false, this.field9620, 0);
        this.method2816((byte) 124, this.field9624);
        this.method2778((byte) -101, 0, 256, class9.field88);
        this.method2817((byte) 102, true);
        this.method3867((byte) 18, class790.field10851, 0);
        this.method3859(121, 0, class790.field10851);
    }

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "(I)V", line = 2621)
    private final void method3898(int arg0) {
        if (arg0 != 24252) {
            this.field9572 = -85;
        }
        ++field9474;
        this.field9606 = false;
        this.method3914((byte) -105);
        if (class280.field4058 == this.field9605) {
            this.method3836(487);
        }
    }

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "(I)V", line = 2637)
    public final void method3899(int arg0) {
        if (arg0 != 0) {
            this.method518(97, 105);
        }
        if (~this.field9519 != -3) {
            this.method3866((byte) -106);
            this.method3853(false, -115);
            this.method3894(arg0 + 16544, false);
            this.method3887(false, true);
            this.method3849((byte) 54, false);
            this.method3863(false, -2, 27016, false);
            this.field9519 = 2;
        }
        ++field9473;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Lza;", line = 2658)
    public final class434 method478(int arg0) {
        ++field9481;
        class482 var2 = new class482(arg0);
        this.field9454.method689(var2, -81);
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "()I", line = 2673)
    public final int method507() {
        ++field9311;
        return this.field9571;
    }

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "(I)V", line = 2681)
    public final void method3900(int arg0) {
        ++field9410;
        this.method3881(2, 0, class9.field88);
        if (arg0 != 240957680) {
            this.method480();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(FFIFFFF)Z", line = 2695)
    private final boolean method3901(float arg0, float arg1, int arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field9392;
        Buffer var8 = this.field9629.method2338(true, false);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method3889(0, var8);
            if (arg2 > -76) {
                this.method2820(117, -21, 121, -61, (class269) null, 101, (class118) null);
            }
            if (Stream.method3798()) {
                var9.method3800(arg1);
                var9.method3800(arg4);
                var9.method3800(arg6);
                var9.method3800(arg3);
                var9.method3800(arg5);
                var9.method3800(arg0);
            } else {
                var9.method3809(arg1);
                var9.method3809(arg4);
                var9.method3809(arg6);
                var9.method3809(arg3);
                var9.method3809(arg5);
                var9.method3809(arg0);
            }
            var9.method3797();
            return this.field9629.method2337(6544);
        }
    }

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "(I)V", line = 2735)
    private final void method3902(int arg0) {
        ++field9479;
        if (this.field9519 != 1) {
            this.method3866((byte) -106);
            this.method3853(false, -107);
            this.method3894(arg0 ^ -16546, false);
            this.method3887(false, true);
            this.method3849((byte) 54, false);
            this.method3863(false, -2, arg0 + 27018, false);
            this.method3871(0, 1);
            this.method3882(0, this.field9539);
            this.field9519 = 1;
        }
        if (arg0 != -2) {
            this.field9524 = -1.4514261F;
        }
    }

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "(I)V", line = 2759)
    private final void method3903(int arg0) {
        if (!this.field9603) {
            float[] var2 = this.field9584;
            if (~this.field9469 != -1 && this.field9440 != 0) {
                var2[1] = 0.0F;
                var2[0] = 2.0F / (float) this.field9469;
                var2[4] = 0.0F;
                var2[13] = 1.0F;
                var2[10] = 0.5F;
                var2[6] = 0.0F;
                var2[12] = -1.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[5] = -2.0F / (float) this.field9440;
                var2[14] = 0.5F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
                var2[3] = 0.0F;
            } else {
                var2[14] = 0.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
            }
            this.field9603 = true;
        }
        if (arg0 > -9) {
            this.method546((Canvas) null, -102, 78);
        }
        ++field9451;
    }

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "(IIIII)V", line = 2815)
    public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9371;
        this.method487(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIF)Luaa;", line = 2825)
    public final class127 method551(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field9381;
        return new class477(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "(I)V", line = 2833)
    public final void method3904(int arg0) {
        if (arg0 != 6444) {
            this.field9527 = true;
        }
        ++field9386;
        if (~this.field9519 != -17) {
            this.method3906(-17835);
            this.method3853(true, arg0 + -6555);
            this.method3887(true, true);
            this.method3849((byte) 54, true);
            this.method3893(115, 1);
            this.field9519 = 16;
        }
    }

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "(I)V", line = 2855)
    private final void method3905(int arg0) {
        ++field9427;
        if (arg0 == 3) {
            this.method2818(false, this.field9629, 0);
            this.method2816((byte) 98, this.field9612);
            this.method2778((byte) -117, 0, 1, class687.field9184);
        }
    }

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "(I)V", line = 2869)
    private final void method3906(int arg0) {
        if (arg0 == -17835) {
            ++field9313;
            if (class280.field4058 != this.field9605) {
                class37 var2 = this.field9605;
                this.field9605 = class280.field4058;
                if (!var2.method213(0)) {
                    this.method3876(arg0 ^ -1023);
                }
                this.method3914((byte) -64);
                this.field9554 = this.field9523;
                this.method3836(487);
                this.field9519 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)V", line = 2896)
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9432;
        float var8 = (float) (-arg0) + (float) arg2;
        float var9 = (float) (-arg1) + (float) arg3;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method3902(-2);
        this.method3838(arg4, Integer.MAX_VALUE);
        this.method3859(126, 0, class64.field840);
        this.method3867((byte) 18, class64.field840, 0);
        this.method3893(-95, arg6);
        this.field9501.method3080((float) arg5, var11, 1.0F, (byte) -89);
        this.field9501.method818(0, -arg5 / 2, 0);
        this.field9501.method824(16383 & (int) ((double) var10 * 2607.5945876176133D));
        this.field9501.method818(arg0, arg1, 0);
        this.method3852(true);
        this.method2817((byte) 102, false);
        this.method3900(240957680);
        this.method2817((byte) 102, true);
        this.method3867((byte) 18, class790.field10851, 0);
        this.method3859(125, 0, class790.field10851);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)[B", line = 2934)
    public static final byte[] method3907(int arg0, byte arg1) {
        ++field9499;
        if (arg1 <= 73) {
            field9453 = null;
        }
        class490 var2 = (class490) class441.field6349.method76(47, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = 255 - var6;
                int var8 = class594.method3335(var7, false, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class490(var3);
            class441.field6349.method79(var2, (long) arg0, false);
        }
        return var2.field6823;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "()Z", line = 2988)
    public final boolean method450() {
        ++field9467;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Luq;II)V", line = 3003)
    public class703(Canvas arg0, Object arg1, class161 arg2, class172 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field9526 = arg4;
            this.field9365 = this.field9434 = arg0;
            this.field9472 = arg3;
            this.field9461 = this.field9343 = arg1;
            Dimension var7 = arg0.getSize();
            this.field9440 = this.field9309 = var7.height;
            this.field9591 = arg5;
            this.field9469 = this.field9383 = var7.width;
            class96.method761(true, true, false);
            if (super.field913 == null) {
                this.field9412 = new NativeInterface(0, this.field9591);
                this.field9528 = null;
            } else {
                this.field9528 = new class754(this, super.field913);
                this.field9412 = new NativeInterface(super.field913.method1109(-97), this.field9591);
                for (int var8 = 0; var8 < super.field913.method1109(-91); ++var8) {
                    class577 var9 = super.field913.method1114(var8, -127);
                    if (var9 != null) {
                        this.field9412.initTextureMetrics(var8, var9.field7865, var9.field7857);
                    }
                }
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method464((byte) -112);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "(I)I", line = 3058)
    public final int method3908(int arg0) {
        ++field9439;
        if (arg0 < 20) {
            this.field9575 = -69;
        }
        return this.field9517;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V", line = 3069)
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9339;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method3901(0.0F, (float) arg0, -104, (float) arg2 + var9, (float) arg1, (float) arg3 + var8, 0.0F)) {
            this.method3902(-2);
            this.method3838(arg4, Integer.MAX_VALUE);
            this.method3859(124, 0, class64.field840);
            this.method3867((byte) 18, class64.field840, 0);
            this.method3893(104, arg5);
            this.method3880(8);
            this.method2817((byte) 102, false);
            this.method3905(3);
            this.method2817((byte) 102, true);
            this.method3867((byte) 18, class790.field10851, 0);
            this.method3859(124, 0, class790.field10851);
        }
    }

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "(IIII)V", line = 3109)
    public final void method525(int arg0, int arg1, int arg2, int arg3) {
        ++field9321;
        boolean var5 = false;
        if (arg0 > this.field9522) {
            this.field9522 = arg0;
            var5 = true;
        }
        if (~this.field9599 < ~arg2) {
            var5 = true;
            this.field9599 = arg2;
        }
        if (~arg1 < ~this.field9512) {
            var5 = true;
            this.field9512 = arg1;
        }
        if (~this.field9574 < ~arg3) {
            this.field9574 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field9630) {
                this.field9630 = true;
                this.method2777((byte) -78);
            }
            this.method2799(true);
            this.method3858(0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIIII)Lcj;", line = 3162)
    public final class720 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9425;
        return new class87(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lcj;)V", line = 3170)
    public final void method440(class720 arg0) {
        ++field9324;
        this.field9567 = (class571) arg0;
    }

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "(B)[F", line = 3178)
    public final float[] method3909(byte arg0) {
        ++field9390;
        if (arg0 <= 32) {
            this.method524((class586) null, -75);
        }
        return this.field9511;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lvf;Z)Lhh;", line = 3194)
    public final class140 method466(class162 arg0, boolean arg1) {
        ++field9415;
        class140 var10;
        if (arg0.field2156 != 0 && ~arg0.field2155 != -1) {
            int[] var3 = new int[arg0.field2156 * arg0.field2155];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field2157 == null) {
                for (int var6 = 0; var6 < arg0.field2155; ++var6) {
                    for (int var7 = 0; ~arg0.field2156 < ~var7; ++var7) {
                        int var8 = arg0.field2160[255 & arg0.field2154[var4++]];
                        var3[var5++] = ~var8 == -1 ? 0 : class670.method3699(-16777216, var8);
                    }
                }
            } else {
                for (int var9 = 0; ~arg0.field2155 < ~var9; ++var9) {
                    for (int var11 = 0; ~arg0.field2156 < ~var11; ++var11) {
                        var3[var5++] = class670.method3699(arg0.field2160[class519.method3018(arg0.field2154[var4], 255)], arg0.field2157[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method446(var3, -43, arg0.field2156, arg0.field2155, arg0.field2156, 0);
        } else {
            var10 = this.method446(new int[1], -34, 1, 1, 1, 0);
        }
        var10.method347(arg0.field2159, arg0.field2161, arg0.field2158, arg0.field2162);
        return var10;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[F)[F", line = 3266)
    public final float[] method3910(byte arg0, float[] arg1) {
        arg1[4] = this.field9554[1];
        arg1[8] = this.field9554[2];
        arg1[0] = this.field9554[0];
        arg1[12] = this.field9554[3];
        ++field9328;
        arg1[2] = this.field9554[8];
        arg1[9] = this.field9554[6];
        arg1[13] = this.field9554[7];
        arg1[1] = this.field9554[4];
        arg1[5] = this.field9554[5];
        if (arg0 >= -97) {
            return null;
        } else {
            arg1[14] = this.field9554[11];
            arg1[3] = this.field9554[12];
            arg1[7] = this.field9554[13];
            arg1[6] = this.field9554[9];
            arg1[10] = this.field9554[10];
            arg1[15] = this.field9554[15];
            arg1[11] = this.field9554[14];
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILfea;Lfea;)V", line = 3297)
    public final void method3911(int arg0, class152 arg1, class152 arg2) {
        ++field9430;
        if (arg0 != 22228) {
            this.field9540 = -1.1874698F;
        }
        boolean var4 = false;
        if (this.field9582[this.field9508] != arg2) {
            this.field9582[this.field9508] = arg2;
            this.method2800(-25);
            var4 = true;
        }
        if (this.field9509[this.field9508] != arg1) {
            this.field9509[this.field9508] = arg1;
            var4 = true;
            this.method2807(false);
        }
        if (var4) {
            this.field9519 &= -30;
        }
    }

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "(I)V", line = 3330)
    private final void method3912(int arg0) {
        ++field9337;
        this.field9629 = this.method2795(0, true);
        int var2 = -17 % ((arg0 - 60) / 56);
        this.field9629.method2339(24, -32754, 12);
        this.field9612 = this.method2791(new class92[] { new class92(class382.field5542) }, false);
    }

    @OriginalMember(owner = "client!ee", name = "da", descriptor = "(III[I)V", line = 3345)
    public final void method530(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9331;
        float var5 = this.field9502.method3094((float) arg0, (float) arg1, (float) arg2, 114);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field9600;
            var7 = this.field9507;
        } else {
            var7 = (int) ((float) this.field9573 * this.field9502.method3092((float) arg2, (float) arg0, (float) arg1, 98) / var5);
            var6 = (int) ((float) this.field9557 * this.field9502.method3073(-8861, (float) arg1, (float) arg2, (float) arg0) / var5);
        }
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field9587);
        arg3[0] = (int) ((float) var7 + -this.field9552);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)V", line = 3370)
    public final void method3913(int arg0, byte arg1) {
        ++field9336;
        this.method3838(arg1 << 8 | arg1 << 16 | arg1 << 24 | arg1, Integer.MAX_VALUE);
        if (arg0 != -27653) {
            this.method449(29, (class512) null, -27, -121);
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(II)V", line = 3386)
    public final void method518(int arg0, int arg1) {
        if (this.field9571 != arg0 || this.field9533 != arg1) {
            this.field9533 = arg1;
            this.field9571 = arg0;
            this.method3840(12402);
            this.method3898(24252);
            this.method3884(32414);
        }
        ++field9326;
    }

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "(III)V", line = 3404)
    public final void method540(int arg0, int arg1, int arg2) {
        if (~this.field9515 != ~arg0 || this.field9569 != arg1 || ~this.field9548 != ~arg2) {
            this.field9515 = arg0;
            this.field9569 = arg1;
            this.field9548 = arg2;
            this.method3884(32414);
            this.method2797(-1);
        }
        ++field9406;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3423)
    public final void method543(Canvas arg0) {
        ++field9447;
        if (this.field9434 == arg0) {
            throw new RuntimeException();
        } else if (this.field9387.containsKey(arg0)) {
            this.method2780(arg0, 119, this.field9387.get(arg0));
            this.field9387.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "(B)V", line = 3441)
    private final void method3914(byte arg0) {
        ++field9316;
        if (!this.field9606) {
            float[] var2 = this.field9523;
            float var3 = (float) this.field9571;
            float var4 = (float) this.field9533;
            float var5 = (float) (-this.field9600) * this.field9588 / (float) this.field9557;
            float var6 = (float) (-this.field9507) * this.field9588 / (float) this.field9573;
            float var7 = (float) (-this.field9507 + this.field9469) * this.field9588 / (float) this.field9573;
            float var8 = (float) (this.field9440 - this.field9600) * this.field9588 / (float) this.field9557;
            if (var6 != var7 && var5 != var8) {
                var2[10] = 1.0F / (-var4 + var3);
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[7] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[0] = 2.0F / (var7 - var6);
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = var3 / (-var4 + var3);
            } else {
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[5] = 1.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[8] = 0.0F;
                var2[10] = 1.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
            }
            this.method3851(Integer.MIN_VALUE);
            this.field9606 = true;
        }
        if (arg0 > -22) {
            this.method2781(4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "()Z", line = 3514)
    public final boolean method459() {
        ++field9329;
        return this.field9544[3].method218((byte) 58);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3523)
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field9377;
    }

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "(B)V", line = 3530)
    private final void method3915(byte arg0) {
        int var2 = -41 / ((arg0 - 39) / 63);
        this.method2788(4);
        ++field9397;
        if (this.field9550 != null) {
            this.field9550.method714(-22274);
        }
    }

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "(Z)V", line = 3544)
    private final void method3916(boolean arg0) {
        ++field9482;
        this.method2810(-30427);
        this.method2792((byte) -90);
        this.method2821((byte) -27);
        this.method2766(11);
        this.method2801((byte) 117);
        this.method2785(arg0);
        this.method2774((byte) 101);
        this.method2798(-66);
        this.method2763((byte) 103);
        this.method2797(-1);
        this.method2759(arg0);
        this.method2789((byte) -114);
        this.method2772(-63);
        this.method2758((byte) -30);
        for (int var2 = this.field9547 + -1; ~var2 <= -1; --var2) {
            this.method3886(107, var2);
            this.method2800(-25);
            this.method2807(arg0);
            this.method3878((byte) 86);
        }
        this.method2760(80);
        this.method2781(0);
        this.method2771((byte) -101);
        this.method2762((byte) -84);
        this.method2803((byte) 123);
    }

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "(Z)V", line = 3586)
    public final void method508(boolean arg0) {
        this.field9590 = arg0;
        ++field9493;
        this.method2763((byte) 103);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZILg;I[F)Lfk;", line = 3595)
    public final class678 method3917(int arg0, boolean arg1, int arg2, class166 arg3, int arg4, float[] arg5) {
        if (arg2 != 0) {
            this.field9601 = true;
        }
        ++field9490;
        return this.method2805(2, arg1, 0, arg5, arg4, 0, arg0, arg3);
    }

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "([I)V", line = 3613)
    public final void method467(int[] arg0) {
        arg0[3] = this.field9574;
        ++field9342;
        arg0[2] = this.field9599;
        arg0[0] = this.field9522;
        arg0[1] = this.field9512;
    }

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "()V", line = 3624)
    public void method476() {
        if (!this.field9527) {
            for (class159 var1 = this.field9454.method679((byte) -86); var1 != null; var1 = this.field9454.method681(-62)) {
                ((class482) var1).method2833((byte) -70);
            }
            Enumeration var2 = this.field9387.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2780(var3, 78, this.field9387.get(var3));
            }
            class186.method1251(false, true, (byte) -66);
            this.field9412.release();
            this.field9527 = true;
        }
        ++field9470;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 3675)
    public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field9369;
    }

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "(II)Lev;", line = 3692)
    public class719 method2775(int arg0, int arg1) {
        if (arg1 != 10) {
            this.method490();
        }
        ++field9445;
        if (~arg0 != -7) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    return arg0 == 7 ? new class208(this) : new class504(this);
                } else {
                    return new class90(this, this.field9400);
                }
            } else {
                return new class364(this);
            }
        } else {
            return new class61(this);
        }
    }

    @OriginalMember(owner = "client!ee", name = "ZA", descriptor = "(IFFFFF)V", line = 3747)
    public final void method555(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field9391;
        boolean var7 = ~this.field9560 != ~arg0;
        if (var7 || this.field9607 != arg1 || this.field9529 != arg2) {
            this.field9607 = arg1;
            this.field9560 = arg0;
            this.field9529 = arg2;
            if (var7) {
                this.field9532 = (float) (255 & this.field9560) / 255.0F;
                this.field9540 = (float) (16711680 & this.field9560) / 1.671168E7F;
                this.field9581 = (float) (this.field9560 & 65280) / 65280.0F;
                this.method2810(-30427);
            }
            this.field9412.setSunColour(this.field9540, this.field9581, this.field9532, arg1, arg2);
            this.method2792((byte) -63);
        }
        if (this.field9546[0] != arg3 || this.field9546[1] != arg4 || this.field9546[2] != arg5) {
            this.field9546[1] = arg4;
            this.field9546[0] = arg3;
            this.field9546[2] = arg5;
            this.field9592[1] = -arg4;
            this.field9592[2] = -arg5;
            this.field9592[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9558[0] = arg3 * var8;
            this.field9558[2] = arg5 * var8;
            this.field9558[1] = arg4 * var8;
            this.field9564[0] = -this.field9558[0];
            this.field9564[1] = -this.field9558[1];
            this.field9564[2] = -this.field9558[2];
            this.field9412.setSunDirection(this.field9558[0], this.field9558[1], this.field9558[2]);
            this.method2801((byte) -25);
            this.field9597 = (int) (arg5 * 256.0F / arg4);
            this.field9594 = (int) (arg3 * 256.0F / arg4);
        }
        this.method2785(false);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILmq;ZI)V")
    public abstract void method2786(int arg0, class534 arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lwj;IBILg;)Lfk;")
    public abstract class678 method2793(class415 arg0, int arg1, byte arg2, int arg3, class166 arg4);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI[FIIILg;)Lfk;")
    public abstract class678 method2805(int arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, class166 arg7);

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "(I)V")
    public abstract void method2761(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)Lkm;")
    public abstract class373 method2795(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
    public abstract void method2763(byte arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method2819(boolean arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLmq;ZI)V")
    public abstract void method2812(int arg0, boolean arg1, class534 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V")
    public abstract void method2774(byte arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method2780(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIILfga;ILra;)V")
    public abstract void method2820(int arg0, int arg1, int arg2, int arg3, class269 arg4, int arg5, class118 arg6);

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "(I)V")
    public abstract void method2772(int arg0);

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(Z)V")
    public abstract void method2799(boolean arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZB)Lra;")
    public abstract class118 method2813(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(B)V")
    public abstract void method2771(byte arg0);

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "(B)V")
    public abstract void method2764(byte arg0);

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(Z)V")
    public abstract void method2785(boolean arg0);

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "(I)F")
    public abstract float method2796(int arg0);

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "(B)V")
    public abstract void method2792(byte arg0);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(Z)V")
    public abstract void method2759(boolean arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLkm;I)V")
    public abstract void method2818(boolean arg0, class373 arg1, int arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILg;III[B)Lor;")
    public abstract class665 method2783(int arg0, class166 arg1, int arg2, int arg3, int arg4, byte[] arg5);

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "(I)V")
    public abstract void method2781(int arg0);

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "(Z)V")
    public abstract void method2807(boolean arg0);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(II)V")
    public abstract void method2809(int arg0, int arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLwj;Lg;)Z")
    public abstract boolean method2784(boolean arg0, class415 arg1, class166 arg2);

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "(B)V")
    public abstract void method2777(byte arg0);

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "(B)V")
    public abstract void method2801(byte arg0);

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "(I)V")
    public abstract void method2810(int arg0);

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "(B)V")
    public abstract void method2803(byte arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLeda;)V")
    public abstract void method2816(byte arg0, class110 arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIII[III)Lfk;")
    public abstract class678 method2814(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(BZ)V")
    public abstract void method2817(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILg;[BIIIIZ)Lfk;")
    public abstract class678 method2808(int arg0, class166 arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "(I)V")
    public abstract void method2797(int arg0);

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "(I)V")
    public abstract void method2800(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIILfga;)V")
    public abstract void method2778(byte arg0, int arg1, int arg2, class269 arg3);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lrf;Z)Leda;")
    public abstract class110 method2791(class92[] arg0, boolean arg1);

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "(B)V")
    public abstract void method2821(byte arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method2811(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "(B)V")
    public abstract void method2758(byte arg0);

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "(I)V")
    public abstract void method2788(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[[IZB)Lfaa;")
    public abstract class165 method2787(int arg0, int[][] arg1, boolean arg2, byte arg3);

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "(B)V")
    public abstract void method2789(byte arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILsia;)V")
    public abstract void method2765(int arg0, class765 arg1);

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "(B)V")
    public abstract void method2762(byte arg0);

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "(I)V")
    public abstract void method2798(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLg;Lwj;)Z")
    public abstract boolean method2769(byte arg0, class166 arg1, class415 arg2);

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "(I)V")
    public abstract void method2760(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method2790(Canvas arg0, int arg1);
}
