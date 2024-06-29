import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class622 extends class43 {

    @OriginalMember(owner = "client!ji", name = "Ec", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8478 = new Hashtable();

    @OriginalMember(owner = "client!ji", name = "de", descriptor = "I")
    public int field8555 = 128;

    @OriginalMember(owner = "client!ji", name = "ge", descriptor = "Lee;")
    private class458 field8558 = new class458();

    @OriginalMember(owner = "client!ji", name = "le", descriptor = "Lpf;")
    private class25 field8563 = new class25();

    @OriginalMember(owner = "client!ji", name = "ne", descriptor = "Lpf;")
    public class25 field8565 = new class25();

    @OriginalMember(owner = "client!ji", name = "re", descriptor = "Z")
    private boolean field8569 = false;

    @OriginalMember(owner = "client!ji", name = "te", descriptor = "I")
    public int field8571 = 3;

    @OriginalMember(owner = "client!ji", name = "se", descriptor = "I")
    public int field8570 = 8;

    @OriginalMember(owner = "client!ji", name = "pe", descriptor = "Lki;")
    private class364 field8567 = new class364();

    @OriginalMember(owner = "client!ji", name = "ve", descriptor = "[Lmga;")
    private class341[] field8573 = new class341[4];

    @OriginalMember(owner = "client!ji", name = "Be", descriptor = "I")
    private int field8579 = -1;

    @OriginalMember(owner = "client!ji", name = "Ce", descriptor = "[Lmga;")
    private class341[] field8580 = new class341[4];

    @OriginalMember(owner = "client!ji", name = "De", descriptor = "[Lmga;")
    private class341[] field8581 = new class341[4];

    @OriginalMember(owner = "client!ji", name = "we", descriptor = "I")
    private int field8574 = -1;

    @OriginalMember(owner = "client!ji", name = "Fe", descriptor = "I")
    private int field8583 = -1;

    @OriginalMember(owner = "client!ji", name = "Ee", descriptor = "Lca;")
    private class119 field8582 = new class119();

    @OriginalMember(owner = "client!ji", name = "Ge", descriptor = "Lbc;")
    private class9 field8584 = new class9(16);

    @OriginalMember(owner = "client!ji", name = "He", descriptor = "Lki;")
    private class364 field8585 = new class364();

    @OriginalMember(owner = "client!ji", name = "Me", descriptor = "Lki;")
    private class364 field8590 = new class364();

    @OriginalMember(owner = "client!ji", name = "Ne", descriptor = "Lki;")
    private class364 field8591 = new class364();

    @OriginalMember(owner = "client!ji", name = "Oe", descriptor = "Lki;")
    private class364 field8592 = new class364();

    @OriginalMember(owner = "client!ji", name = "Pe", descriptor = "Lki;")
    private class364 field8593 = new class364();

    @OriginalMember(owner = "client!ji", name = "Qe", descriptor = "Lki;")
    private class364 field8594 = new class364();

    @OriginalMember(owner = "client!ji", name = "Re", descriptor = "Lki;")
    private class364 field8595 = new class364();

    @OriginalMember(owner = "client!ji", name = "ff", descriptor = "I")
    private int field8609 = 8448;

    @OriginalMember(owner = "client!ji", name = "of", descriptor = "[F")
    private float[] field8617 = new float[16];

    @OriginalMember(owner = "client!ji", name = "Te", descriptor = "I")
    private int field8597 = 8448;

    @OriginalMember(owner = "client!ji", name = "Df", descriptor = "[F")
    private float[] field8632 = new float[4];

    @OriginalMember(owner = "client!ji", name = "Xe", descriptor = "I")
    private int field8601 = 0;

    @OriginalMember(owner = "client!ji", name = "pf", descriptor = "F")
    private float field8618 = -1.0F;

    @OriginalMember(owner = "client!ji", name = "Hf", descriptor = "F")
    private float field8636 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "Ff", descriptor = "I")
    public int field8634 = 0;

    @OriginalMember(owner = "client!ji", name = "gg", descriptor = "F")
    public float field8661 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "Uf", descriptor = "I")
    public int field8649 = 0;

    @OriginalMember(owner = "client!ji", name = "pg", descriptor = "I")
    private int field8670 = 0;

    @OriginalMember(owner = "client!ji", name = "Nf", descriptor = "I")
    private int field8642 = 0;

    @OriginalMember(owner = "client!ji", name = "eg", descriptor = "I")
    private int field8659 = 0;

    @OriginalMember(owner = "client!ji", name = "ug", descriptor = "I")
    public int field8675 = 0;

    @OriginalMember(owner = "client!ji", name = "yg", descriptor = "[F")
    private float[] field8679 = new float[4];

    @OriginalMember(owner = "client!ji", name = "Qf", descriptor = "[F")
    public float[] field8645 = new float[4];

    @OriginalMember(owner = "client!ji", name = "kg", descriptor = "[Lpn;")
    private class296[] field8665 = new class296[class565.field7386];

    @OriginalMember(owner = "client!ji", name = "Dg", descriptor = "F")
    public float field8684 = -1.0F;

    @OriginalMember(owner = "client!ji", name = "Kf", descriptor = "I")
    public int field8639 = 0;

    @OriginalMember(owner = "client!ji", name = "Hg", descriptor = "I")
    public int field8688 = 3584;

    @OriginalMember(owner = "client!ji", name = "Pg", descriptor = "I")
    private int field8696 = -1;

    @OriginalMember(owner = "client!ji", name = "If", descriptor = "I")
    public int field8637 = 512;

    @OriginalMember(owner = "client!ji", name = "Bg", descriptor = "F")
    private float field8682 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "jg", descriptor = "I")
    private int field8664 = -1;

    @OriginalMember(owner = "client!ji", name = "Kg", descriptor = "F")
    private float field8691 = 0.0F;

    @OriginalMember(owner = "client!ji", name = "nf", descriptor = "F")
    public float field8616 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "zg", descriptor = "I")
    public int field8680 = 512;

    @OriginalMember(owner = "client!ji", name = "Sf", descriptor = "I")
    public int field8647 = -1;

    @OriginalMember(owner = "client!ji", name = "kf", descriptor = "I")
    public int field8613 = -1;

    @OriginalMember(owner = "client!ji", name = "Ag", descriptor = "I")
    private int field8681 = 0;

    @OriginalMember(owner = "client!ji", name = "Rf", descriptor = "F")
    public float field8646 = 1.0F;

    @OriginalMember(owner = "client!ji", name = "hf", descriptor = "F")
    private float field8611 = 3000.0F;

    @OriginalMember(owner = "client!ji", name = "Mf", descriptor = "F")
    public float field8641 = -1.0F;

    @OriginalMember(owner = "client!ji", name = "Mg", descriptor = "I")
    private int field8693 = 0;

    @OriginalMember(owner = "client!ji", name = "ch", descriptor = "I")
    public int field8709 = 50;

    @OriginalMember(owner = "client!ji", name = "bh", descriptor = "Z")
    private boolean field8708 = true;

    @OriginalMember(owner = "client!ji", name = "ig", descriptor = "F")
    public float field8663 = 3584.0F;

    @OriginalMember(owner = "client!ji", name = "mg", descriptor = "[F")
    private float[] field8667 = new float[4];

    @OriginalMember(owner = "client!ji", name = "Yg", descriptor = "F")
    public float field8705 = 3584.0F;

    @OriginalMember(owner = "client!ji", name = "jh", descriptor = "I")
    public int field8716 = -1;

    @OriginalMember(owner = "client!ji", name = "hh", descriptor = "F")
    private float field8714 = -1.0F;

    @OriginalMember(owner = "client!ji", name = "Zf", descriptor = "Lph;")
    public class703 field8654 = new class703(8192);

    @OriginalMember(owner = "client!ji", name = "kh", descriptor = "[I")
    public int[] field8717 = new int[1];

    @OriginalMember(owner = "client!ji", name = "lh", descriptor = "[I")
    public int[] field8718 = new int[1];

    @OriginalMember(owner = "client!ji", name = "nh", descriptor = "[B")
    public byte[] field8720 = new byte[16384];

    @OriginalMember(owner = "client!ji", name = "mh", descriptor = "[I")
    public int[] field8719 = new int[1];

    @OriginalMember(owner = "client!ji", name = "Ob", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8436;

    @OriginalMember(owner = "client!ji", name = "Tb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8441;

    @OriginalMember(owner = "client!ji", name = "je", descriptor = "I")
    public int field8561;

    @OriginalMember(owner = "client!ji", name = "bd", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field8501;

    @OriginalMember(owner = "client!ji", name = "cc", descriptor = "J")
    private long field8450;

    @OriginalMember(owner = "client!ji", name = "Cd", descriptor = "J")
    private long field8528;

    @OriginalMember(owner = "client!ji", name = "Cf", descriptor = "Z")
    public boolean field8631;

    @OriginalMember(owner = "client!ji", name = "vg", descriptor = "I")
    public int field8676;

    @OriginalMember(owner = "client!ji", name = "ag", descriptor = "Ljava/lang/String;")
    private String field8655;

    @OriginalMember(owner = "client!ji", name = "Rg", descriptor = "Z")
    public boolean field8698;

    @OriginalMember(owner = "client!ji", name = "Xg", descriptor = "Z")
    private boolean field8704;

    @OriginalMember(owner = "client!ji", name = "Eg", descriptor = "Z")
    public boolean field8685;

    @OriginalMember(owner = "client!ji", name = "Vf", descriptor = "Z")
    public boolean field8650;

    @OriginalMember(owner = "client!ji", name = "sg", descriptor = "Z")
    private boolean field8673;

    @OriginalMember(owner = "client!ji", name = "hg", descriptor = "Z")
    public boolean field8662;

    @OriginalMember(owner = "client!ji", name = "Sg", descriptor = "Ljava/lang/String;")
    private String field8699;

    @OriginalMember(owner = "client!ji", name = "Lf", descriptor = "Z")
    public boolean field8640;

    @OriginalMember(owner = "client!ji", name = "Jg", descriptor = "Z")
    private boolean field8690;

    @OriginalMember(owner = "client!ji", name = "Xd", descriptor = "Lrp;")
    private class611 field8549;

    @OriginalMember(owner = "client!ji", name = "qe", descriptor = "Lgm;")
    public class509 field8568;

    @OriginalMember(owner = "client!ji", name = "be", descriptor = "Lob;")
    private class354 field8553;

    @OriginalMember(owner = "client!ji", name = "Yd", descriptor = "Lcf;")
    private class134 field8550;

    @OriginalMember(owner = "client!ji", name = "Zd", descriptor = "Lhv;")
    private class201 field8551;

    @OriginalMember(owner = "client!ji", name = "Ib", descriptor = "Z")
    public static boolean field8430 = false;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field8384 = 0;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "[I")
    public static int[] field8371 = new int[120];

    @OriginalMember(owner = "client!ji", name = "Ve", descriptor = "F")
    public float field8599;

    @OriginalMember(owner = "client!ji", name = "cf", descriptor = "F")
    public float field8606;

    @OriginalMember(owner = "client!ji", name = "ef", descriptor = "F")
    public float field8608;

    @OriginalMember(owner = "client!ji", name = "gf", descriptor = "F")
    private float field8610;

    @OriginalMember(owner = "client!ji", name = "Of", descriptor = "F")
    private float field8643;

    @OriginalMember(owner = "client!ji", name = "cg", descriptor = "F")
    private float field8657;

    @OriginalMember(owner = "client!ji", name = "og", descriptor = "F")
    public float field8669;

    @OriginalMember(owner = "client!ji", name = "Cg", descriptor = "F")
    private float field8683;

    @OriginalMember(owner = "client!ji", name = "eh", descriptor = "F")
    public float field8711;

    @OriginalMember(owner = "client!ji", name = "fh", descriptor = "F")
    public float field8712;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!ji", name = "ib", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!ji", name = "jb", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!ji", name = "kb", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!ji", name = "lb", descriptor = "I")
    public int field8407;

    @OriginalMember(owner = "client!ji", name = "mb", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!ji", name = "nb", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!ji", name = "ob", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!ji", name = "pb", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!ji", name = "qb", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!ji", name = "rb", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!ji", name = "sb", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!ji", name = "tb", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!ji", name = "ub", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!ji", name = "vb", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!ji", name = "wb", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!ji", name = "xb", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!ji", name = "yb", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!ji", name = "zb", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!ji", name = "Ab", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!ji", name = "Bb", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!ji", name = "Cb", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!ji", name = "Db", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!ji", name = "Eb", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!ji", name = "Fb", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!ji", name = "Gb", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!ji", name = "Hb", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!ji", name = "Jb", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!ji", name = "Kb", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!ji", name = "Lb", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!ji", name = "Mb", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!ji", name = "Nb", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!ji", name = "Pb", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!ji", name = "Qb", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!ji", name = "Rb", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!ji", name = "Sb", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!ji", name = "Ub", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!ji", name = "Vb", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!ji", name = "Wb", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!ji", name = "Xb", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!ji", name = "Yb", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!ji", name = "Zb", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!ji", name = "ac", descriptor = "I")
    private int field8448;

    @OriginalMember(owner = "client!ji", name = "bc", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!ji", name = "dc", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!ji", name = "ec", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!ji", name = "fc", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!ji", name = "gc", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!ji", name = "hc", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!ji", name = "ic", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!ji", name = "jc", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!ji", name = "kc", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!ji", name = "lc", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!ji", name = "mc", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!ji", name = "nc", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!ji", name = "oc", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!ji", name = "pc", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!ji", name = "qc", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!ji", name = "rc", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!ji", name = "sc", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!ji", name = "tc", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!ji", name = "uc", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!ji", name = "vc", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!ji", name = "wc", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!ji", name = "xc", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!ji", name = "yc", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!ji", name = "zc", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!ji", name = "Ac", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!ji", name = "Bc", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!ji", name = "Cc", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!ji", name = "Dc", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!ji", name = "Fc", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!ji", name = "Gc", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!ji", name = "Hc", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!ji", name = "Ic", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!ji", name = "Jc", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!ji", name = "Kc", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!ji", name = "Lc", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!ji", name = "Mc", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!ji", name = "Nc", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!ji", name = "Oc", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!ji", name = "Pc", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!ji", name = "Qc", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!ji", name = "Rc", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!ji", name = "Sc", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!ji", name = "Tc", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!ji", name = "Uc", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!ji", name = "Vc", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!ji", name = "Wc", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!ji", name = "Xc", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!ji", name = "Yc", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!ji", name = "Zc", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!ji", name = "ad", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!ji", name = "cd", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!ji", name = "dd", descriptor = "I")
    public int field8503;

    @OriginalMember(owner = "client!ji", name = "ed", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!ji", name = "fd", descriptor = "I")
    private int field8505;

    @OriginalMember(owner = "client!ji", name = "gd", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!ji", name = "hd", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!ji", name = "id", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!ji", name = "jd", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!ji", name = "kd", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!ji", name = "ld", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!ji", name = "md", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!ji", name = "nd", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!ji", name = "od", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!ji", name = "pd", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!ji", name = "qd", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!ji", name = "rd", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!ji", name = "sd", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!ji", name = "td", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!ji", name = "ud", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!ji", name = "vd", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!ji", name = "wd", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!ji", name = "xd", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!ji", name = "yd", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!ji", name = "zd", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!ji", name = "Ad", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!ji", name = "Bd", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!ji", name = "Dd", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!ji", name = "Ed", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!ji", name = "Fd", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!ji", name = "Gd", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!ji", name = "Hd", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!ji", name = "Id", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!ji", name = "Jd", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!ji", name = "Kd", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!ji", name = "Ld", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!ji", name = "Md", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!ji", name = "Nd", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!ji", name = "Od", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!ji", name = "Pd", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!ji", name = "Qd", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!ji", name = "Rd", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!ji", name = "Sd", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!ji", name = "Td", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!ji", name = "Ud", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!ji", name = "Vd", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!ji", name = "Wd", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!ji", name = "ae", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!ji", name = "ce", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!ji", name = "ee", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!ji", name = "fe", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!ji", name = "he", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!ji", name = "ie", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!ji", name = "ke", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!ji", name = "me", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!ji", name = "oe", descriptor = "I")
    public int field8566;

    @OriginalMember(owner = "client!ji", name = "Ie", descriptor = "I")
    private int field8586;

    @OriginalMember(owner = "client!ji", name = "Je", descriptor = "I")
    public int field8587;

    @OriginalMember(owner = "client!ji", name = "Ke", descriptor = "I")
    public int field8588;

    @OriginalMember(owner = "client!ji", name = "Le", descriptor = "I")
    private int field8589;

    @OriginalMember(owner = "client!ji", name = "Se", descriptor = "I")
    public int field8596;

    @OriginalMember(owner = "client!ji", name = "Ue", descriptor = "I")
    private int field8598;

    @OriginalMember(owner = "client!ji", name = "We", descriptor = "I")
    public int field8600;

    @OriginalMember(owner = "client!ji", name = "Ye", descriptor = "I")
    private int field8602;

    @OriginalMember(owner = "client!ji", name = "df", descriptor = "I")
    private int field8607;

    @OriginalMember(owner = "client!ji", name = "jf", descriptor = "I")
    private int field8612;

    @OriginalMember(owner = "client!ji", name = "tf", descriptor = "I")
    private int field8622;

    @OriginalMember(owner = "client!ji", name = "xf", descriptor = "I")
    private int field8626;

    @OriginalMember(owner = "client!ji", name = "Ef", descriptor = "I")
    private int field8633;

    @OriginalMember(owner = "client!ji", name = "Tf", descriptor = "I")
    public int field8648;

    @OriginalMember(owner = "client!ji", name = "Yf", descriptor = "I")
    private int field8653;

    @OriginalMember(owner = "client!ji", name = "bg", descriptor = "I")
    private int field8656;

    @OriginalMember(owner = "client!ji", name = "rg", descriptor = "I")
    public int field8672;

    @OriginalMember(owner = "client!ji", name = "Ug", descriptor = "I")
    private int field8701;

    @OriginalMember(owner = "client!ji", name = "Vg", descriptor = "I")
    private int field8702;

    @OriginalMember(owner = "client!ji", name = "oh", descriptor = "I")
    private int field8721;

    @OriginalMember(owner = "client!ji", name = "ph", descriptor = "I")
    private int field8722;

    @OriginalMember(owner = "client!ji", name = "Gg", descriptor = "J")
    private long field8687;

    @OriginalMember(owner = "client!ji", name = "gh", descriptor = "Lvj;")
    private class204 field8713;

    @OriginalMember(owner = "client!ji", name = "Af", descriptor = "Lch;")
    private class219 field8629;

    @OriginalMember(owner = "client!ji", name = "Xf", descriptor = "Lvga;")
    public class239 field8652;

    @OriginalMember(owner = "client!ji", name = "Gf", descriptor = "Lpf;")
    public class25 field8635;

    @OriginalMember(owner = "client!ji", name = "Qg", descriptor = "Lpf;")
    public class25 field8697;

    @OriginalMember(owner = "client!ji", name = "ye", descriptor = "Lmga;")
    private class341 field8576;

    @OriginalMember(owner = "client!ji", name = "ze", descriptor = "Lmga;")
    private class341 field8577;

    @OriginalMember(owner = "client!ji", name = "Fg", descriptor = "Lsj;")
    private class373 field8686;

    @OriginalMember(owner = "client!ji", name = "ih", descriptor = "Lsj;")
    private class373 field8715;

    @OriginalMember(owner = "client!ji", name = "bf", descriptor = "Lmf;")
    public class408 field8605;

    @OriginalMember(owner = "client!ji", name = "rf", descriptor = "Lmf;")
    public class408 field8620;

    @OriginalMember(owner = "client!ji", name = "uf", descriptor = "Lmf;")
    public class408 field8623;

    @OriginalMember(owner = "client!ji", name = "yf", descriptor = "Lmf;")
    public class408 field8627;

    @OriginalMember(owner = "client!ji", name = "zf", descriptor = "Lmf;")
    public class408 field8628;

    @OriginalMember(owner = "client!ji", name = "Wf", descriptor = "Lmf;")
    public class408 field8651;

    @OriginalMember(owner = "client!ji", name = "lg", descriptor = "Lmf;")
    public class408 field8666;

    @OriginalMember(owner = "client!ji", name = "tg", descriptor = "Lmf;")
    public class408 field8674;

    @OriginalMember(owner = "client!ji", name = "Og", descriptor = "Lmf;")
    public class408 field8695;

    @OriginalMember(owner = "client!ji", name = "Wg", descriptor = "Lmf;")
    public class408 field8703;

    @OriginalMember(owner = "client!ji", name = "sf", descriptor = "Lvv;")
    public class414 field8621;

    @OriginalMember(owner = "client!ji", name = "wg", descriptor = "Lvv;")
    public class414 field8677;

    @OriginalMember(owner = "client!ji", name = "Ae", descriptor = "Lrq;")
    private class423 field8578;

    @OriginalMember(owner = "client!ji", name = "Zg", descriptor = "Lul;")
    private class439 field8706;

    @OriginalMember(owner = "client!ji", name = "xe", descriptor = "Lqf;")
    private class701 field8575;

    @OriginalMember(owner = "client!ji", name = "fg", descriptor = "Lqf;")
    public class701 field8660;

    @OriginalMember(owner = "client!ji", name = "ue", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8572;

    @OriginalMember(owner = "client!ji", name = "Ze", descriptor = "Z")
    private boolean field8603;

    @OriginalMember(owner = "client!ji", name = "af", descriptor = "Z")
    private boolean field8604;

    @OriginalMember(owner = "client!ji", name = "lf", descriptor = "Z")
    public boolean field8614;

    @OriginalMember(owner = "client!ji", name = "mf", descriptor = "Z")
    public boolean field8615;

    @OriginalMember(owner = "client!ji", name = "vf", descriptor = "Z")
    private boolean field8624;

    @OriginalMember(owner = "client!ji", name = "wf", descriptor = "Z")
    public boolean field8625;

    @OriginalMember(owner = "client!ji", name = "Bf", descriptor = "Z")
    public boolean field8630;

    @OriginalMember(owner = "client!ji", name = "Jf", descriptor = "Z")
    private boolean field8638;

    @OriginalMember(owner = "client!ji", name = "Pf", descriptor = "Z")
    private boolean field8644;

    @OriginalMember(owner = "client!ji", name = "dg", descriptor = "Z")
    private boolean field8658;

    @OriginalMember(owner = "client!ji", name = "ng", descriptor = "Z")
    private boolean field8668;

    @OriginalMember(owner = "client!ji", name = "qg", descriptor = "Z")
    private boolean field8671;

    @OriginalMember(owner = "client!ji", name = "xg", descriptor = "Z")
    private boolean field8678;

    @OriginalMember(owner = "client!ji", name = "Ig", descriptor = "Z")
    public boolean field8689;

    @OriginalMember(owner = "client!ji", name = "Lg", descriptor = "Z")
    private boolean field8692;

    @OriginalMember(owner = "client!ji", name = "Ng", descriptor = "Z")
    public boolean field8694;

    @OriginalMember(owner = "client!ji", name = "Tg", descriptor = "Z")
    public boolean field8700;

    @OriginalMember(owner = "client!ji", name = "ah", descriptor = "Z")
    public boolean field8707;

    @OriginalMember(owner = "client!ji", name = "dh", descriptor = "Z")
    private boolean field8710;

    @OriginalMember(owner = "client!ji", name = "qf", descriptor = "[Lgq;")
    private class710[] field8619;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "(I)V")
    public final void method162(int arg0) {
        ++field8535;
        this.method3403(0, -3);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZILjaclib/memory/Buffer;II)Lsj;")
    public final class373 method3384(boolean arg0, int arg1, Buffer arg2, int arg3, int arg4) {
        if (arg1 != 8222) {
            this.field8684 = 0.43568662F;
        }
        ++field8379;
        return (class373) (!this.field8704 || arg0 && !this.field8673 ? new class484(this, arg3, arg2) : new class494(this, arg3, arg2, arg4, arg0));
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(IIIIII)V")
    public final void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8485;
        this.method3431(3);
        this.method3403(arg5, -3);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var11 + 0.35F, (float) arg3 + var10 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public final void method348(int arg0) {
        ++field8373;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field8555 = arg0;
            this.field8549.method3316(1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "LA", descriptor = "(IIII)V")
    public final void method358(int arg0, int arg1, int arg2, int arg3) {
        ++field8462;
        if (!this.field8630) {
            throw new RuntimeException("");
        } else {
            this.field8600 = arg0;
            this.field8613 = arg2;
            this.field8664 = arg1;
            this.field8634 = arg3;
            this.field8551.field2617.method34(317);
            this.method3405(false);
        }
    }

    @OriginalMember(owner = "client!ji", name = "SA", descriptor = "()I")
    public final int method168() {
        ++field8482;
        int var1 = this.field8722;
        this.field8722 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "()V")
    public final void method194() {
        this.field8553.method2038(112);
        ++field8429;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    private final void method3385(byte arg0) {
        if (~this.field8633 != -4) {
            this.field8633 = 3;
            this.method3435((byte) -71);
            this.method3450(-8250);
            this.field8702 &= -8;
        }
        ++field8416;
        int var2 = 40 % ((arg0 - -68) / 56);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    private final void method3386(int arg0) {
        ++field8396;
        if (arg0 >= 117) {
            int var2 = 0;
            while (!this.field8501.method122()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class122.method905(1000L, -6145);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)V")
    private final void method3387(int arg0) {
        if (arg0 != 10832) {
            this.method3427(95);
        }
        ++field8398;
        if (this.field8624 && this.field8630 | this.field8647 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lgq;Z)V")
    public final void method3388(class710 arg0, boolean arg1) {
        ++field8473;
        class710 var3 = this.field8619[this.field8607];
        if (arg1) {
            this.method404(-33, -4, 75);
        }
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field9928);
            } else {
                if (var3 != null) {
                    if (~arg0.field9928 != ~var3.field9928) {
                        OpenGL.glDisable(var3.field9928);
                        OpenGL.glEnable(arg0.field9928);
                    }
                } else {
                    OpenGL.glEnable(arg0.field9928);
                }
                OpenGL.glBindTexture(arg0.field9928, arg0.method3903(7124));
            }
            this.field8619[this.field8607] = arg0;
        }
        this.field8702 &= -2;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()Z")
    public final boolean method327() {
        ++field8457;
        return this.field8550 != null && (this.field8561 <= 1 || this.field8604);
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(IIIII)V")
    public final void method411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8442;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (~(arg0 - -arg2) <= ~this.field8670 && -arg2 + arg0 <= this.field8659 && this.field8642 <= arg1 + arg2 && ~this.field8681 <= ~(-arg2 + arg1)) {
            this.method3431(3);
            this.method3403(arg4, -3);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field8714) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field8618 >= (float) var8) {
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
                if (~var9 >= -65) {
                    var9 = 64;
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class71.method571(var9, (byte) 107);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class318.field4149[var11] * (float) arg2 + var6, class318.field4148[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lkn;Lkn;FLkn;)Lkn;")
    public final class307 method188(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        ++field8472;
        if (arg0 != null && arg1 != null && this.field8615 && this.field8640) {
            class129 var5 = null;
            class204 var6 = (class204) arg0;
            class204 var7 = (class204) arg1;
            class660 var8 = var6.method928(-122);
            class660 var9 = var7.method928(127);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field9202 > ~var8.field9202 ? var8.field9202 : var9.field9202;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class129) {
                    class129 var11 = (class129) arg3;
                    if (var10 == var11.method926((byte) -103)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class129(this, var10);
                }
                if (var5.method930(var9, (byte) 76, arg2, var8)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BIII)V")
    public final void method3389(byte arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg3);
        if (arg0 <= 67) {
            this.method3449(-116);
        }
        ++field8531;
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILmga;)V")
    public final void method3390(int arg0, class341 arg1) {
        if (arg0 != -22078) {
            this.method3469(-38, false);
        }
        ++field8415;
        if (this.field8707) {
            this.method3419(122, arg1);
            this.method3465(arg1, (byte) 77);
        } else if (~this.field8574 <= -1 && this.field8573[this.field8574] == arg1) {
            this.field8573[this.field8574--] = null;
            arg1.method1975(arg0 ^ 5495);
            if (this.field8574 < 0) {
                this.field8576 = this.field8577 = null;
            } else {
                this.field8576 = this.field8577 = this.field8573[this.field8574];
                this.field8576.method1977((byte) -81);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
    public final void method391(boolean arg0) {
        ++field8554;
        this.field8708 = arg0;
        this.method3440((byte) -101);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(Z)V")
    public final void method3391(boolean arg0) {
        ++field8358;
        if (!arg0) {
            this.field8644 = false;
        }
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)V")
    private final void method3392(int arg0) {
        ++field8517;
        if (arg0 < 105) {
            this.method369(31);
        }
        this.field8697 = new class25();
        this.field8635 = new class25();
        this.field8619 = new class710[this.field8672];
        this.field8652 = new class239(this, 3553, 6408, 1, 1);
        new class239(this, 3553, 6408, 1, 1);
        new class239(this, 3553, 6408, 1, 1);
        this.field8605 = new class408(this);
        this.field8623 = new class408(this);
        this.field8627 = new class408(this);
        this.field8695 = new class408(this);
        this.field8703 = new class408(this);
        this.field8666 = new class408(this);
        this.field8651 = new class408(this);
        this.field8674 = new class408(this);
        this.field8620 = new class408(this);
        this.field8628 = new class408(this);
        if (this.field8640) {
            this.field8660 = new class701(this);
            new class701(this);
        }
    }

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "()V")
    public final void method208() {
        ++field8366;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "()Z")
    public final boolean method340() {
        ++field8509;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lxa;Z)V")
    public final void method234(class511 arg0, boolean arg1) {
        ++field8534;
        this.field8578 = (class423) arg0;
        if (!this.field8640) {
            if (!this.field8603) {
                throw new RuntimeException("");
            }
            class93 var3 = (class93) this.field8584.method39((long) (this.field8578.method608() << 16 | this.field8578.method607()), 31750);
            if (var3 == null) {
                var3 = new class93(this, this.field8578.method608(), this.field8578.method607());
                class93 var5;
                for (this.field8586 += var3.field1235 * 4; ~this.field8586 < -2097153; this.field8586 -= var5.field1235) {
                    class28 var4 = this.field8582.method894((byte) -112);
                    if (var4 == null) {
                        break;
                    }
                    var5 = (class93) var4;
                    var5.method237((byte) -109);
                    var5.method2438((byte) -5);
                    this.field8501.releasePbuffer(var5.method718(192));
                }
                this.field8584.method38(var3, 29, (long) (this.field8578.method608() << 16 | this.field8578.method607()));
            }
            this.field8582.method889((byte) -49, var3);
            this.field8501.setPbuffer(var3.method718(192));
        } else {
            if (this.field8575 == null) {
                this.field8575 = new class701(this);
            }
            if (this.field8575 == this.field8577) {
                throw new RuntimeException();
            }
            this.method3395(18469, this.field8575);
            if (arg1) {
                class565 var6 = (class565) this.field8584.method39((long) (this.field8578.method608() << 16 | this.field8578.method607()), 31750);
                if (var6 == null) {
                    var6 = new class565(this, 6402, this.field8578.method608(), this.field8578.method607());
                    class565 var8;
                    for (this.field8586 += var6.field7375; ~this.field8586 < -2097153; this.field8586 -= var8.field7375) {
                        class28 var7 = this.field8582.method894((byte) -112);
                        if (var7 == null) {
                            break;
                        }
                        var8 = (class565) var7;
                        var8.method237((byte) -117);
                        var8.method2438((byte) 117);
                        var8.method3019(-14494);
                    }
                    this.field8584.method38(var6, 34, (long) (this.field8578.method608() << 16 | this.field8578.method607()));
                }
                this.field8582.method889((byte) -49, var6);
                this.field8575.method3839(-15959, 8, var6);
            }
            this.field8575.method3841(this.field8578.field5485, 0, (byte) 116);
        }
        this.field8503 = arg0.method608();
        this.field8407 = arg0.method607();
        this.method3407((byte) -76);
        this.method3416(false);
        this.method396();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
    public final void method3393(boolean arg0, int arg1) {
        if (!arg0 == this.field8624) {
            this.field8624 = arg0;
            this.method3387(10832);
            this.field8702 &= -32;
        }
        ++field8508;
        if (arg1 != -11594) {
            this.field8705 = -0.99052244F;
        }
    }

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "(I)V")
    private final void method3394(int arg0) {
        this.field8711 = (float) (-this.field8639 + this.field8670);
        this.field8608 = (float) (-this.field8649 + this.field8642);
        this.field8669 = (float) (-this.field8639 + this.field8659);
        this.field8599 = (float) (-this.field8649 + this.field8681);
        if (arg0 != 0) {
            this.method379();
        }
        ++field8506;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(ILmga;)V")
    public final void method3395(int arg0, class341 arg1) {
        ++field8533;
        if (arg0 != 18469) {
            this.method3423((byte) 70, 123);
        }
        if (!this.field8707) {
            if (this.field8574 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field8574 >= 0) {
                    this.field8573[this.field8574].method1975(-17227);
                }
                this.field8576 = this.field8577 = this.field8573[++this.field8574] = arg1;
                this.field8576.method1977((byte) -76);
            }
        } else {
            this.method3442(arg1, -85);
            this.method3402(arg1, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method407(Canvas arg0) {
        ++field8521;
        if (this.field8436 == arg0) {
            throw new RuntimeException();
        } else if (this.field8478.containsKey(arg0)) {
            Long var2 = (Long) this.field8478.get(arg0);
            this.field8501.releaseSurface(arg0, var2);
            this.field8478.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public final synchronized void method3396(int arg0, int arg1, int arg2) {
        ++field8497;
        if (arg2 != 34842) {
            this.field8622 = -26;
        }
        class195 var4 = new class195(arg0);
        var4.field5499 = (long) arg1;
        this.field8591.method2087(var4, 58);
    }

    @OriginalMember(owner = "client!ji", name = "aa", descriptor = "()I")
    public final int method401() {
        ++field8363;
        int var1 = this.field8721;
        this.field8721 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "(I)V")
    private final void method3397(int arg0) {
        int var2 = 84 % ((arg0 - -36) / 32);
        this.field8501.method124();
        ++field8476;
    }

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "(I)V")
    private final void method3398(int arg0) {
        ++field8459;
        if (arg0 != 128) {
            this.method3387(-17);
        }
        if (~this.field8659 <= ~this.field8670 && ~this.field8642 >= ~this.field8681) {
            OpenGL.glScissor(this.field8670 + this.field8601, this.field8693 + this.field8407 + -this.field8681, -this.field8670 + this.field8659, -this.field8642 + this.field8681);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "()V")
    public final void method351() {
        ++field8483;
        this.field8630 = false;
        this.field8551.method1313(0, false, false, 0, 0, true);
        this.method3405(false);
        this.method3387(10832);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)Lxa;")
    public final class511 method364(int arg0, int arg1, boolean arg2) {
        ++field8390;
        return new class423(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V")
    public final void method3399(byte arg0) {
        ++field8370;
        OpenGL.glLightfv(16384, 4611, this.field8645, 0);
        OpenGL.glLightfv(16385, 4611, this.field8632, 0);
        if (arg0 != 85) {
            this.method405((class547) null, (class506[]) null, false);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lkn;)V")
    public final void method403(class307 arg0) {
        ++field8376;
        this.field8713 = (class204) arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method219(Rectangle[] arg0, int arg1) throws class381 {
        this.method216();
        ++field8445;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(Z)V")
    private final void method3400(boolean arg0) {
        ++field8460;
        if (this.field8441 != null) {
            Dimension var2 = this.field8441.getSize();
            this.field8448 = var2.width;
            this.field8505 = var2.height;
        } else {
            this.field8448 = this.field8505 = 0;
        }
        if (this.field8577 == null) {
            this.field8407 = this.field8505;
            this.field8503 = this.field8448;
            this.method3416(!arg0);
        }
        this.method3407((byte) 122);
        if (!arg0) {
            this.method3463((class373) null, (byte) 120);
        }
        this.method396();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([Lba;Lqu;Lq;[Lht;I)V")
    public final void method349(class107[] arg0, class282 arg1, class151 arg2, class108[] arg3, int arg4) {
        ++field8451;
        this.method366(arg0, arg2, arg3, arg4);
        this.method326(arg1);
    }

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "(III)V")
    public final void method404(int arg0, int arg1, int arg2) {
        ++field8538;
        if (~this.field8716 != ~arg0 || ~this.field8647 != ~arg1 || this.field8675 != arg2) {
            this.field8716 = arg0;
            this.field8647 = arg1;
            this.field8675 = arg2;
            if (this.field8630) {
                return;
            }
            this.method3405(false);
            this.method3387(10832);
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)I")
    public final int method3401(int arg0, int arg1) {
        if (arg1 != 6) {
            this.field8551 = null;
        }
        ++field8556;
        if (~arg0 != -6407 && arg0 != 6409) {
            if (arg0 != 6410 && ~arg0 != -34847 && ~arg0 != -34845) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (arg0 != 6408 && ~arg0 != -34848) {
                    if (arg0 != 34843) {
                        if (arg0 != 34842) {
                            if (~arg0 == -6403) {
                                return 3;
                            } else if (~arg0 == -6402) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
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
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lmga;B)V")
    public final void method3402(class341 arg0, byte arg1) {
        ++field8456;
        if (~this.field8579 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field8579 <= -1) {
                this.field8580[this.field8579].method1978(20236);
            }
            if (arg1 < -33) {
                this.field8577 = this.field8580[++this.field8579] = arg0;
                this.field8577.method1974(110);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field8437;
        this.method406(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8) {
        ++field8522;
        class273 var10 = (class273) arg6;
        class219 var11 = var10.field3598;
        this.method3441(6369);
        this.method3388(var10.field3598, false);
        this.method3403(arg5, -3);
        this.method3462(8448, -5882, 7681);
        this.method3453(false, 768, 34167, 0);
        float var12 = var11.field2874 / (float) var11.field2877;
        float var13 = var11.field2872 / (float) var11.field2871;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method3453(false, 768, 5890, 0);
    }

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "()V")
    public final void method408() {
        ++field8427;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)V")
    public final void method3403(int arg0, int arg1) {
        ++field8410;
        if (arg1 != -3) {
            this.field8686 = null;
        }
        if (this.field8602 != arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    var3 = true;
                    var4 = false;
                    var5 = 2;
                } else if (~arg0 != -129) {
                    var4 = false;
                    var5 = 0;
                    var3 = true;
                } else {
                    var4 = true;
                    var3 = true;
                    var5 = 3;
                }
            } else {
                var3 = true;
                var5 = 1;
                var4 = true;
            }
            if (!var3 != !this.field8678) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field8678 = var3;
            }
            if (this.field8692 != var4) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field8692 = var4;
            }
            if (~this.field8656 != ~var5) {
                if (~var5 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var5 == -3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (~var5 != -4) {
                    OpenGL.glDisable(3042);
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                }
                this.field8656 = var5;
            }
            this.field8602 = arg0;
            this.field8702 &= -29;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lqu;)V")
    public final void method326(class282 arg0) {
        ++field8424;
        this.field8558.method2579(arg0, this, -11);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[Lpn;)V")
    public final void method412(int arg0, class296[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field8665[var3] = arg1[var3];
        }
        ++field8552;
        this.field8598 = arg0;
        if (~this.field8633 != -2) {
            this.method3451(14);
        }
    }

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "(I)I")
    private final int method3404(int arg0) {
        ++field8447;
        int var2 = 0;
        this.field8699 = OpenGL.glGetString(7936).toLowerCase();
        this.field8655 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field8699.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field8699.indexOf("brian paul") != -1 || ~this.field8699.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class420.method2420(' ', 31, var3.replace('.', ' '));
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class703.method3845((byte) -94, var4[0]);
                int var6 = class703.method3845((byte) -94, var4[1]);
                this.field8626 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field8626 > -13) {
            var2 |= 2;
        }
        if (!this.field8501.method123("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field8501.method123("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field8672 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field8622 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field8612 = var7[0];
        if (~this.field8672 > -3 || ~this.field8622 > -3 || ~this.field8612 > -3) {
            var2 |= 16;
        }
        this.field8631 = Stream.method1964();
        this.field8603 = this.field8501.arePbuffersAvailable();
        this.field8704 = this.field8501.method123("GL_ARB_vertex_buffer_object");
        this.field8668 = this.field8501.method123("GL_ARB_multisample");
        this.field8700 = this.field8501.method123("GL_ARB_vertex_program");
        this.field8501.method123("GL_ARB_fragment_program");
        this.field8625 = this.field8501.method123("GL_ARB_vertex_shader");
        this.field8614 = this.field8501.method123("GL_ARB_fragment_shader");
        if (arg0 != -5407) {
            return 126;
        } else {
            this.field8685 = this.field8501.method123("GL_EXT_texture3D");
            this.field8650 = this.field8501.method123("GL_ARB_texture_rectangle");
            this.field8615 = this.field8501.method123("GL_ARB_texture_cube_map");
            this.field8698 = this.field8501.method123("GL_ARB_texture_float");
            this.field8694 = false;
            this.field8640 = this.field8501.method123("GL_EXT_framebuffer_object");
            this.field8707 = this.field8501.method123("GL_EXT_framebuffer_blit");
            this.field8689 = this.field8501.method123("GL_EXT_framebuffer_multisample");
            this.field8604 = this.field8707 & this.field8689;
            OpenGL.glGetFloatv(2834, class116.field1500, 0);
            this.field8714 = class116.field1500[0];
            this.field8618 = class116.field1500[1];
            return var2 != 0 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "()Z")
    public final boolean method344() {
        ++field8511;
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lq;)V")
    public final void method342(class151 arg0) {
        this.field8697 = (class25) arg0;
        ++field8386;
        this.field8635.method140((byte) 109, this.field8697);
        if (this.field8633 != 1) {
            this.method3450(-8250);
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(Z)V")
    private final void method3405(boolean arg0) {
        ++field8529;
        int var2;
        if (!this.field8630) {
            this.field8610 = (float) (-this.field8675 + this.field8688) - this.field8691;
            this.field8606 = -((float) this.field8647 * this.field8682) + this.field8610;
            if (this.field8606 < (float) this.field8709) {
                this.field8606 = (float) this.field8709;
            }
            OpenGL.glFogf(2915, this.field8606);
            OpenGL.glFogf(2916, this.field8610);
            var2 = this.field8716;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field8664;
        }
        class116.field1500[2] = (float) class597.method3238(var2, 255) / 255.0F;
        class116.field1500[0] = (float) class597.method3238(16711680, var2) / 1.671168E7F;
        if (!arg0) {
            class116.field1500[1] = (float) class597.method3238(var2, 65280) / 65280.0F;
            OpenGL.glFogfv(2918, class116.field1500, 0);
            if (this.field8630) {
                this.field8551.field2617.method28((byte) 97);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "()F")
    public final float method3406() {
        ++field8484;
        return this.field8643;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)V")
    public final void method3407(byte arg0) {
        ++field8542;
        int var2 = -4 / ((arg0 - 47) / 42);
        if (~this.field8633 != -1) {
            this.field8702 &= -32;
            this.field8633 = 0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(FZFF)V")
    private final void method3408(float arg0, boolean arg1, float arg2, float arg3) {
        ++field8461;
        OpenGL.glMatrixMode(5890);
        if (this.field8638) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg3, arg2);
        OpenGL.glMatrixMode(5888);
        this.field8638 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)I")
    public final int method3409(int arg0, int arg1) {
        ++field8500;
        if (arg1 != 5121 && arg1 != 5120) {
            if (arg1 != 5123 && ~arg1 != -5123) {
                if (arg1 != 5125 && arg1 != 5124 && ~arg1 != -5127) {
                    if (arg0 != 4) {
                        this.field8680 = -101;
                    }
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

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V")
    public final void method3410(int arg0, int arg1, int arg2) {
        ++field8368;
        this.field8601 = arg0;
        if (arg1 <= -89) {
            this.field8693 = arg2;
            this.method3416(false);
            this.method3398(128);
        }
    }

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "(I)V")
    private final void method3411(int arg0) {
        ++field8562;
        this.method3459((byte) -119, -2);
        for (int var2 = this.field8672 + -1; ~var2 <= -1; --var2) {
            this.method3469(var2, false);
            this.method3388((class710) null, false);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3462(8448, arg0 + 5841, 8448);
        this.method3453(false, 770, 34168, 2);
        this.method3456(arg0 + 11819);
        this.field8602 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field8656 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field8692 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field8678 = true;
        this.method3393(true, -11594);
        this.method3425(true, 108);
        this.method3439(true, (byte) -119);
        this.method3424(true, -32);
        this.method3407((byte) -5);
        if (arg0 == -11723) {
            this.field8501.setSwapInterval(0);
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
            for (int var4 = 0; ~var4 > -9; ++var4) {
                int var5 = 16384 - -var4;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
            }
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field8696 = this.field8716 = -1;
            this.method396();
        }
    }

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "(IIII)V")
    public final void method339(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8642 < arg1) {
            this.field8642 = arg1;
        }
        ++field8510;
        if (this.field8681 > arg3) {
            this.field8681 = arg3;
        }
        if (this.field8659 > arg2) {
            this.field8659 = arg2;
        }
        if (arg0 > this.field8670) {
            this.field8670 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method3394(0);
        this.method3398(128);
    }

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "()I")
    public final int method384() {
        ++field8413;
        return 4;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIIIII)Lkn;")
    public final class307 method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8395;
        return this.field8615 ? new class457(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "()V")
    public final void method396() {
        this.field8659 = this.field8503;
        this.field8670 = 0;
        this.field8681 = this.field8407;
        this.field8642 = 0;
        ++field8546;
        OpenGL.glDisable(3089);
        this.method3394(0);
    }

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "()I")
    public final int method399() {
        ++field8418;
        return this.field8588 + this.field8587 - -this.field8589;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
    public final void method398(int arg0) {
        ++field8435;
        this.method3397(12);
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
    public final void method373(int arg0) {
        ++field8504;
        this.method3386(121);
    }

    @OriginalMember(owner = "client!ji", name = "ca", descriptor = "(IIII)V")
    public final void method376(int arg0, int arg1, int arg2, int arg3) {
        ++field8425;
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg2 < ~this.field8503) {
            arg2 = this.field8503;
        }
        if (arg3 > this.field8407) {
            arg3 = this.field8407;
        }
        this.field8681 = arg3;
        this.field8642 = arg1;
        this.field8659 = arg2;
        this.field8670 = arg0;
        OpenGL.glEnable(3089);
        this.method3394(0);
        this.method3398(128);
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(IIIII)V")
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8496;
        this.method3431(3);
        this.method3403(arg4, -3);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(II)I")
    public final int method3412(int arg0, int arg1) {
        if (arg1 > -119) {
            return 53;
        } else {
            ++field8400;
            if (arg0 != 1) {
                if (arg0 != 0) {
                    if (arg0 == 2) {
                        return 34165;
                    } else if (arg0 != 3) {
                        if (~arg0 == -5) {
                            return 34023;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        return 260;
                    }
                } else {
                    return 8448;
                }
            } else {
                return 7681;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "na", descriptor = "(III[I)V")
    public final void method350(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8454;
        float var5 = (float) arg2 * this.field8697.field298 + (float) arg0 * this.field8697.field291 + (float) arg1 * this.field8697.field313 + this.field8697.field293;
        if (!(var5 < (float) this.field8709) && !((float) this.field8688 < var5)) {
            int var6 = (int) (((float) arg2 * this.field8697.field296 + (float) arg0 * this.field8697.field290 + (float) arg1 * this.field8697.field289 + this.field8697.field306) * (float) this.field8637 / var5);
            int var7 = (int) (((float) arg2 * this.field8697.field297 + (float) arg0 * this.field8697.field302 + (float) arg1 * this.field8697.field309 + this.field8697.field288) * (float) this.field8680 / var5);
            if (this.field8711 <= (float) var6 && (float) var6 <= this.field8669 && (float) var7 >= this.field8608 && (float) var7 <= this.field8599) {
                arg3[0] = (int) ((float) var6 - this.field8711);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field8608);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class619 method363(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8520;
        return class261.method1624(arg1, this, arg3, (byte) -125, arg2, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BF)V")
    public final void method3413(byte arg0, float arg1) {
        if (this.field8636 != arg1) {
            this.field8636 = arg1;
            if (~this.field8633 == -4) {
                this.method3435((byte) -124);
            }
        }
        if (arg0 == -9) {
            ++field8360;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBZ)V")
    public final void method3414(int arg0, byte arg1, boolean arg2) {
        this.method3436(arg0, true, arg2, true);
        if (arg1 >= 39) {
            ++field8364;
        }
    }

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "(I)V")
    private final void method3415(int arg0) {
        ++field8438;
        float[] var2 = this.field8617;
        float var3 = (float) (-this.field8639 * this.field8709) / (float) this.field8637;
        float var4 = (float) ((-this.field8639 + this.field8503) * this.field8709) / (float) this.field8637;
        float var5 = (float) (this.field8709 * this.field8649) / (float) this.field8680;
        if (arg0 >= -47) {
            this.field8670 = 89;
        }
        float var6 = (float) ((-this.field8407 + this.field8649) * this.field8709) / (float) this.field8680;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field8709 * 2.0F;
            var2[13] = 0.0F;
            var2[14] = this.field8657 = -((float) this.field8688 * var7) / (float) (this.field8688 - this.field8709);
            var2[15] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[6] = 0.0F;
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[11] = -1.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[3] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[10] = this.field8683 = (float) (-(this.field8709 + this.field8688)) / (float) (this.field8688 - this.field8709);
            var2[1] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[4] = 0.0F;
        } else {
            var2[0] = 1.0F;
            var2[4] = 0.0F;
            var2[13] = 0.0F;
            var2[10] = 1.0F;
            var2[2] = 0.0F;
            var2[14] = 0.0F;
            var2[7] = 0.0F;
            var2[15] = 1.0F;
            var2[11] = 0.0F;
            var2[12] = 0.0F;
            var2[6] = 0.0F;
            var2[9] = 0.0F;
            var2[1] = 0.0F;
            var2[8] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
        }
        this.method3460(1);
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(Z)V")
    private final void method3416(boolean arg0) {
        OpenGL.glViewport(this.field8601, this.field8693, this.field8503, this.field8407);
        ++field8449;
        if (arg0) {
            this.method3470(-1, (byte) 52, true, (byte[]) null, 21);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(ZI)V")
    public final synchronized void method3417(boolean arg0, int arg1) {
        ++field8487;
        if (arg0) {
            this.method3440((byte) -86);
        }
        class195 var3 = new class195(arg1);
        this.field8592.method2087(var3, -114);
    }

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "()V")
    public final void method216() throws class381 {
        ++field8388;
        try {
            this.field8501.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ji", name = "sa", descriptor = "(II)V")
    public final void method335(int arg0, int arg1) {
        ++field8391;
        if (~this.field8709 != ~arg0 || ~this.field8688 != ~arg1) {
            this.field8709 = arg0;
            this.field8688 = arg1;
            this.method3415(-106);
            this.method3405(false);
            if (this.field8633 == 3) {
                this.method3435((byte) -85);
                return;
            }
            if (this.field8633 != 2) {
                return;
            }
            this.method3449(-13836);
        }
    }

    @OriginalMember(owner = "client!ji", name = "ka", descriptor = "(FF)V")
    public final void method371(float arg0, float arg1) {
        ++field8516;
        if (this.field8611 != arg0 || this.field8643 != arg1) {
            this.field8611 = arg0;
            this.field8643 = arg1;
            this.method3460(1);
            if (~this.field8633 == -4) {
                this.method3435((byte) -67);
                return;
            }
            if (~this.field8633 != -3) {
                return;
            }
            this.method3449(-13836);
        }
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(II)V")
    public static final void method3418(int arg0, int arg1) {
        if (arg0 == -13634) {
            ++field8466;
            class270.field3589 = 1000000000L / (long) arg1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(ILmga;)V")
    public final void method3419(int arg0, class341 arg1) {
        ++field8389;
        if (~this.field8583 <= -1 && this.field8581[this.field8583] == arg1) {
            if (arg0 <= 119) {
                this.field8632 = null;
            }
            this.field8581[this.field8583--] = null;
            arg1.method1976(-30127);
            if (~this.field8583 > -1) {
                this.field8576 = null;
            } else {
                this.field8576 = this.field8581[this.field8583];
                this.field8576.method1973(3843);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lvv;Lvv;ZLvv;Lvv;)V")
    public final void method3420(class414 arg0, class414 arg1, boolean arg2, class414 arg3, class414 arg4) {
        if (!arg2) {
            this.field8610 = -0.47341532F;
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method3463(arg4.field5324, (byte) -84);
            OpenGL.glVertexPointer(arg4.field5323, arg4.field5330, this.field8686.method2140(9126), this.field8686.method2143(20812) + (long) arg4.field5325);
            OpenGL.glEnableClientState(32884);
        }
        ++field8455;
        if (arg3 != null) {
            this.method3463(arg3.field5324, (byte) -84);
            OpenGL.glNormalPointer(arg3.field5330, this.field8686.method2140(9126), this.field8686.method2143(20812) + (long) arg3.field5325);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3463(arg0.field5324, (byte) -84);
            OpenGL.glColorPointer(arg0.field5323, arg0.field5330, this.field8686.method2140(9126), this.field8686.method2143(20812) + (long) arg0.field5325);
            OpenGL.glEnableClientState(32886);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3463(arg1.field5324, (byte) -84);
            OpenGL.glTexCoordPointer(arg1.field5323, arg1.field5330, this.field8686.method2140(9126), this.field8686.method2143(20812) + (long) arg1.field5325);
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
    public final void method3421(byte arg0, int arg1) {
        class116.field1500[0] = (float) class597.method3238(16711680, arg1) / 1.671168E7F;
        class116.field1500[3] = (float) (arg1 >>> 24) / 255.0F;
        if (arg0 != -29) {
            this.field8582 = null;
        }
        class116.field1500[2] = (float) class597.method3238(255, arg1) / 255.0F;
        class116.field1500[1] = (float) class597.method3238(65280, arg1) / 65280.0F;
        ++field8383;
        OpenGL.glTexEnvfv(8960, 8705, class116.field1500, 0);
    }

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "()Z")
    public final boolean method382() {
        ++field8475;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)V")
    private final void method3422(byte arg0) {
        if (~this.field8633 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field8503 < -1 && ~this.field8407 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field8503, (double) this.field8407, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field8633 = 1;
            this.field8702 &= -25;
        }
        ++field8499;
        int var2 = 45 / ((arg0 - -45) / 63);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)V")
    public final synchronized void method3423(byte arg0, int arg1) {
        if (arg0 == -49) {
            ++field8469;
            class424 var3 = new class424();
            var3.field5499 = (long) arg1;
            this.field8594.method2087(var3, -120);
        }
    }

    @OriginalMember(owner = "client!ji", name = "YA", descriptor = "(IFFFFF)V")
    public final void method390(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8539;
        boolean var7 = ~this.field8696 != ~arg0;
        if (var7 || this.field8641 != arg1 || this.field8684 != arg2) {
            this.field8696 = arg0;
            this.field8641 = arg1;
            this.field8684 = arg2;
            if (var7) {
                this.field8661 = (float) (this.field8696 & 255) / 255.0F;
                this.field8616 = (float) (this.field8696 & 16711680) / 1.671168E7F;
                this.field8646 = (float) (this.field8696 & 65280) / 65280.0F;
                this.method3452(2);
            }
            this.method3438(false);
        }
        if (this.field8679[0] != arg3 || this.field8679[1] != arg4 || this.field8679[2] != arg5) {
            this.field8679[1] = arg4;
            this.field8679[2] = arg5;
            this.field8679[0] = arg3;
            this.field8667[0] = -arg3;
            this.field8667[2] = -arg5;
            this.field8667[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8645[2] = arg5 * var8;
            this.field8645[0] = arg3 * var8;
            this.field8645[1] = arg4 * var8;
            this.field8632[2] = -this.field8645[2];
            this.field8632[1] = -this.field8645[1];
            this.field8632[0] = -this.field8645[0];
            this.method3399((byte) 85);
            this.field8648 = (int) (arg5 * 256.0F / arg4);
            this.field8596 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([Lba;Lq;[Lht;I)V")
    public final void method366(class107[] arg0, class151 arg1, class108[] arg2, int arg3) {
        ++field8362;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method827(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(ZI)V")
    public final void method3424(boolean arg0, int arg1) {
        if (!this.field8710 != !arg0) {
            this.field8710 = arg0;
            this.method3440((byte) -101);
            this.field8702 &= -32;
        }
        if (arg1 != -32) {
            this.method3409(-109, -52);
        }
        ++field8519;
    }

    @OriginalMember(owner = "client!ji", name = "ya", descriptor = "(IIIII)V")
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8394;
        this.method3431(3);
        this.method3403(arg4, -3);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lba;Lqu;Lq;Lht;I)V")
    public final void method365(class107 arg0, class282 arg1, class151 arg2, class108 arg3, int arg4) {
        arg0.method827(arg2, arg3, arg4);
        ++field8375;
        this.method326(arg1);
    }

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "()Z")
    public final boolean method389() {
        ++field8468;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(ZI)V")
    public final void method3425(boolean arg0, int arg1) {
        ++field8547;
        if (this.field8658 == !arg0) {
            this.field8658 = arg0;
            this.method3455(4663);
            this.field8702 &= -8;
        }
        if (arg1 <= 86) {
            this.method351();
        }
    }

    @OriginalMember(owner = "client!ji", name = "AA", descriptor = "(IIII)V")
    public final void method394(int arg0, int arg1, int arg2, int arg3) {
        this.field8664 = arg1;
        this.field8630 = true;
        this.field8634 = arg3;
        ++field8431;
        this.field8600 = arg0;
        this.field8613 = arg2;
        this.field8551.method1313(0, false, false, 0, 3, true);
        this.field8551.field2617.method34(317);
        this.method3405(false);
        this.method3387(10832);
    }

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "(I)V")
    public static final void method3426(int arg0) {
        class247.field3310 = -1;
        class165.field2055 = -1;
        class323.field4195 = 0;
        class199.field2598 = -1;
        ++field8530;
        if (arg0 != -23385) {
            method3445(81, -67, (byte[]) null, (byte) -118, (String) null, 110);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIF)Lpn;")
    public final class296 method385(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8405;
        return new class199(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lsga;[Law;Z)Lta;")
    public final class597 method405(class547 arg0, class506[] arg1, boolean arg2) {
        ++field8481;
        return new class523(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "(I)V")
    private final void method3427(int arg0) {
        ++field8397;
        if (this.field8633 != 2) {
            this.field8633 = 2;
            this.method3449(-13836);
            this.method3450(-8250);
            this.field8702 &= -8;
        }
        if (arg0 >= -102) {
            this.method396();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(FIFFF)V")
    public final void method3428(float arg0, int arg1, float arg2, float arg3, float arg4) {
        class116.field1500[1] = arg4;
        class116.field1500[0] = arg2;
        if (arg1 > -27) {
            this.method325((class506) null, false);
        }
        class116.field1500[2] = arg3;
        ++field8440;
        class116.field1500[3] = arg0;
        OpenGL.glTexEnvfv(8960, 8705, class116.field1500, 0);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)Li;")
    public final class686 method369(int arg0) {
        ++field8408;
        class62 var2 = new class62(arg0);
        this.field8567.method2087(var2, 59);
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3431(3);
        ++field8488;
        this.method3403(arg9, -3);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZI)V")
    public final synchronized void method3429(int arg0, boolean arg1, int arg2) {
        ++field8412;
        if (arg1) {
            this.field8611 = 0.78654045F;
        }
        class195 var4 = new class195(arg2);
        var4.field5499 = (long) arg0;
        this.field8593.method2087(var4, -117);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lfca;IIII)Lba;")
    public final class107 method410(class645 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8541;
        return new class408(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "(ILfa;II)V")
    public final void method357(int arg0, class619 arg1, int arg2, int arg3) {
        ++field8467;
        class273 var5 = (class273) arg1;
        class219 var6 = var5.field3598;
        this.method3441(6369);
        this.method3388(var5.field3598, false);
        this.method3403(1, -3);
        this.method3462(8448, -5882, 7681);
        this.method3453(false, 768, 34167, 0);
        float var7 = var6.field2874 / (float) var6.field2877;
        float var8 = var6.field2872 / (float) var6.field2871;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8670) * var7, (float) (-arg3 + this.field8642) * var8);
        OpenGL.glVertex2i(this.field8670, this.field8642);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8670) * var7, (float) (this.field8681 - arg3) * var8);
        OpenGL.glVertex2i(this.field8670, this.field8681);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8659) * var7, (float) (this.field8681 - arg3) * var8);
        OpenGL.glVertex2i(this.field8659, this.field8681);
        OpenGL.glTexCoord2f((float) (this.field8659 - arg2) * var7, (float) (-arg3 + this.field8642) * var8);
        OpenGL.glVertex2i(this.field8659, this.field8642);
        OpenGL.glEnd();
        this.method3453(false, 768, 5890, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lpf;I)V")
    public final void method3430(class25 arg0, int arg1) {
        ++field8564;
        if (arg1 != -23857) {
            this.field8695 = null;
        }
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method142(121), 0);
    }

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "()Z")
    public final boolean method387() {
        ++field8470;
        return this.field8551.method1312((byte) -97, 3);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3) {
        this.field8553.method2037(false, arg1, arg0, arg3, arg2);
        ++field8403;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public final void method332(boolean arg0) {
        ++field8428;
    }

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "(I)V")
    private final void method3431(int arg0) {
        if (~this.field8702 != -2) {
            this.method3422((byte) 63);
            this.method3393(false, arg0 ^ -11595);
            this.method3425(false, 114);
            this.method3439(false, (byte) -74);
            this.method3424(false, -32);
            this.method3388((class710) null, false);
            this.method3459((byte) 56, -2);
            this.method3443(1, true);
            this.field8702 = 1;
        }
        ++field8417;
        if (arg0 != 3) {
            this.method411(-22, 86, 5, -25, 31);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILpf;)V")
    public final void method3432(int arg0, class25 arg1) {
        ++field8443;
        OpenGL.glLoadMatrixf(arg1.method142(arg0 ^ 79), arg0);
    }

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "()V")
    public final void method179() {
        ++field8480;
        if (this.field8550 != null && this.field8550.method2024(0)) {
            this.field8553.method2035(12699, this.field8550);
            this.field8549.method3316(1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZZ[BI)Lsj;")
    public final class373 method3433(int arg0, boolean arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field8402;
        if (arg1) {
            this.method334();
        }
        return (class373) (!this.field8704 || arg2 && !this.field8673 ? new class484(this, arg4, arg3, arg0) : new class494(this, arg4, arg3, arg0, arg2));
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method367(Canvas arg0) {
        ++field8513;
        long var2 = 0L;
        if (arg0 != null && this.field8436 != arg0) {
            if (this.field8478.containsKey(arg0)) {
                Long var4 = (Long) this.field8478.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field8450;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field8501.surfaceResized(var2);
            if (this.field8441 == arg0) {
                this.method3400(true);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(B)V")
    public final void method3434(byte arg0) {
        if (~this.field8702 != -9) {
            this.method3427(-128);
            this.method3393(true, -11594);
            this.method3439(true, (byte) -55);
            this.method3424(true, -32);
            this.method3403(1, -3);
            this.field8702 = 8;
        }
        ++field8514;
        if (arg0 <= 84) {
            this.method410((class645) null, -113, 34, 67, -27);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIII)Lxa;")
    public final class511 method381(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8486;
        return new class423(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class511 method341(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8369;
        return new class423(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "()Z")
    public final boolean method380() {
        ++field8489;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(B)V")
    private final void method3435(byte arg0) {
        ++field8465;
        if (arg0 <= -40) {
            float var2 = (float) (-this.field8639) * this.field8636 / (float) this.field8637;
            float var3 = (float) (-this.field8649) * this.field8636 / (float) this.field8680;
            float var4 = (float) (-this.field8639 + this.field8503) * this.field8636 / (float) this.field8637;
            float var5 = (float) (-this.field8649 + this.field8407) * this.field8636 / (float) this.field8680;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field8709 - this.field8643), (double) ((float) this.field8688 - this.field8643));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZZZ)V")
    public final void method3436(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        ++field8557;
        if (this.field8653 != arg0) {
            if (arg0 < 0) {
                this.method3456(70);
                this.method3388((class710) null, false);
                this.method3443(0, arg1);
                if (!this.field8630) {
                    this.field8551.method1313(0, arg3, arg2, 0, 0, arg1);
                }
            } else {
                class239 var5 = this.field8549.method3317((byte) -95, arg0);
                class59 var6 = super.field598.method3162((byte) -104, arg0);
                if (~var6.field807 == -1 && ~var6.field806 == -1) {
                    this.method3456(62);
                } else {
                    int var7 = var6.field794 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method3408((float) (this.field8566 % var8 * var6.field807) / (float) var8, true, 0.0F, (float) (this.field8566 % var8 * var6.field806) / (float) var8);
                }
                if (this.field8630) {
                    this.method3388(var5, !arg1);
                    this.method3443(var6.field797, true);
                } else {
                    this.field8551.method1313(var6.field813, arg3, arg2, var6.field792, var6.field805, true);
                    if (!this.field8551.method1314((byte) -111, var5, var6.field797)) {
                        this.method3388(var5, !arg1);
                        this.method3443(var6.field797, true);
                    }
                }
            }
            this.field8653 = arg0;
        }
        if (!arg1) {
            this.field8594 = null;
        }
        this.field8702 &= -8;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(FIF)V")
    public final void method3437(float arg0, int arg1, float arg2) {
        this.field8691 = arg0;
        this.field8682 = arg2;
        ++field8432;
        if (!this.field8630) {
            this.method3405(false);
        }
        if (arg1 != -28950) {
            this.field8613 = 121;
        }
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(Z)V")
    private final void method3438(boolean arg0) {
        if (arg0) {
            this.field8714 = -1.8445941F;
        }
        class116.field1500[3] = 1.0F;
        class116.field1500[0] = this.field8641 * this.field8616;
        class116.field1500[2] = this.field8661 * this.field8641;
        class116.field1500[1] = this.field8646 * this.field8641;
        ++field8361;
        OpenGL.glLightfv(16384, 4609, class116.field1500, 0);
        class116.field1500[2] = -this.field8684 * this.field8661;
        class116.field1500[0] = -this.field8684 * this.field8616;
        class116.field1500[1] = -this.field8684 * this.field8646;
        class116.field1500[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class116.field1500, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZB)V")
    public final void method3439(boolean arg0, byte arg1) {
        if (!this.field8644 == arg0) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field8644 = arg0;
            this.field8702 &= -32;
        }
        if (arg1 < -39) {
            ++field8545;
        }
    }

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "()Z")
    public final boolean method231() {
        ++field8433;
        if (this.field8550 != null) {
            if (!this.field8550.method2024(0)) {
                if (!this.field8553.method2031(-116, this.field8550)) {
                    return false;
                }
                this.field8549.method3316(1);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "()V")
    public final void method173() {
        ++field8381;
        if (this.field8640) {
            if (this.field8575 != this.field8577) {
                throw new RuntimeException();
            }
            this.field8575.method3843(-26732, 0);
            this.field8575.method3843(-26732, 8);
            this.method3390(-22078, this.field8575);
        } else {
            if (!this.field8603) {
                throw new RuntimeException("");
            }
            this.field8578.method603(0, 0, this.field8503, this.field8407, 0, 0);
            this.field8501.setSurface(this.field8528);
        }
        this.field8578 = null;
        this.field8503 = this.field8448;
        this.field8407 = this.field8505;
        this.method3407((byte) -18);
        this.method3416(false);
        this.method396();
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(B)V")
    private final void method3440(byte arg0) {
        if (arg0 != -101) {
            this.method3398(-122);
        }
        OpenGL.glDepthMask(this.field8710 && this.field8708);
        ++field8518;
    }

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "(I)V")
    public final void method3441(int arg0) {
        if (arg0 != 6369) {
            this.field8634 = 72;
        }
        ++field8404;
        if (this.field8702 != 2) {
            this.method3422((byte) -112);
            this.method3393(false, -11594);
            this.method3425(false, arg0 ^ 6276);
            this.method3439(false, (byte) -60);
            this.method3424(false, -32);
            this.method3459((byte) 43, -2);
            this.field8702 = 2;
        }
    }

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "([I)V")
    public final void method356(int[] arg0) {
        arg0[1] = this.field8642;
        arg0[3] = this.field8681;
        arg0[2] = this.field8659;
        arg0[0] = this.field8670;
        ++field8382;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lmga;I)V")
    public final void method3442(class341 arg0, int arg1) {
        ++field8495;
        if (~this.field8583 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field8583 >= 0) {
                this.field8581[this.field8583].method1976(-30127);
            }
            this.field8576 = this.field8581[++this.field8583] = arg0;
            this.field8576.method1973(3843);
            if (arg1 > -57) {
                this.method167(true);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()Z")
    public final boolean method334() {
        ++field8540;
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "IA", descriptor = "()I")
    public final int method361() {
        ++field8560;
        return this.field8688;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V")
    public final void method3443(int arg0, boolean arg1) {
        ++field8409;
        if (~arg0 != -2) {
            if (~arg0 == -1) {
                this.method3462(8448, -5882, 8448);
            } else if (~arg0 == -3) {
                this.method3462(7681, -5882, 34165);
            } else if (~arg0 != -4) {
                if (arg0 == 4) {
                    this.method3462(34023, -5882, 34023);
                }
            } else {
                this.method3462(8448, -5882, 260);
            }
        } else {
            this.method3462(7681, -5882, 7681);
        }
        if (!arg1) {
            this.method353(-103, 101, -104, 33, -22, 117);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILul;)V")
    public final void method3444(int arg0, class439 arg1) {
        ++field8532;
        if (this.field8706 != arg1) {
            if (this.field8704) {
                OpenGL.glBindBufferARB(34963, arg1.method577(23152));
            }
            this.field8706 = arg1;
        }
        int var3 = -9 / ((52 - arg0) / 61);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)I")
    public final int method377(int arg0, int arg1) {
        ++field8374;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[BBLjava/lang/String;I)I")
    public static final int method3445(int arg0, int arg1, byte[] arg2, byte arg3, String arg4, int arg5) {
        ++field8515;
        int var6 = -arg0 + arg1;
        for (int var7 = 0; var7 < var6; ++var7) {
            char var8 = arg4.charAt(arg0 + var7);
            if (var8 > 0 && ~var8 > -129 || var8 >= 160 && ~var8 >= -256) {
                arg2[arg5 - -var7] = (byte) var8;
            } else if (~var8 != -8365) {
                if (~var8 == -8219) {
                    arg2[arg5 + var7] = -126;
                } else if (var8 == 402) {
                    arg2[arg5 + var7] = -125;
                } else if (var8 == 8222) {
                    arg2[arg5 + var7] = -124;
                } else if (var8 == 8230) {
                    arg2[arg5 + var7] = -123;
                } else if (~var8 == -8225) {
                    arg2[arg5 + var7] = -122;
                } else if (var8 == 8225) {
                    arg2[arg5 + var7] = -121;
                } else if (~var8 == -711) {
                    arg2[arg5 - -var7] = -120;
                } else if (var8 == 8240) {
                    arg2[arg5 - -var7] = -119;
                } else if (~var8 != -353) {
                    if (~var8 != -8250) {
                        if (~var8 == -339) {
                            arg2[arg5 + var7] = -116;
                        } else if (var8 == 381) {
                            arg2[arg5 - -var7] = -114;
                        } else if (var8 != 8216) {
                            if (~var8 == -8218) {
                                arg2[arg5 + var7] = -110;
                            } else if (var8 != 8220) {
                                if (~var8 == -8222) {
                                    arg2[arg5 + var7] = -108;
                                } else if (var8 != 8226) {
                                    if (~var8 != -8212) {
                                        if (~var8 != -8213) {
                                            if (~var8 == -733) {
                                                arg2[arg5 + var7] = -104;
                                            } else if (~var8 != -8483) {
                                                if (~var8 != -354) {
                                                    if (~var8 != -8251) {
                                                        if (~var8 == -340) {
                                                            arg2[arg5 + var7] = -100;
                                                        } else if (var8 != 382) {
                                                            if (var8 == 376) {
                                                                arg2[arg5 + var7] = -97;
                                                            } else {
                                                                arg2[arg5 + var7] = 63;
                                                            }
                                                        } else {
                                                            arg2[arg5 + var7] = -98;
                                                        }
                                                    } else {
                                                        arg2[arg5 - -var7] = -101;
                                                    }
                                                } else {
                                                    arg2[arg5 + var7] = -102;
                                                }
                                            } else {
                                                arg2[arg5 + var7] = -103;
                                            }
                                        } else {
                                            arg2[arg5 + var7] = -105;
                                        }
                                    } else {
                                        arg2[arg5 - -var7] = -106;
                                    }
                                } else {
                                    arg2[arg5 + var7] = -107;
                                }
                            } else {
                                arg2[arg5 + var7] = -109;
                            }
                        } else {
                            arg2[arg5 - -var7] = -111;
                        }
                    } else {
                        arg2[arg5 + var7] = -117;
                    }
                } else {
                    arg2[arg5 + var7] = -118;
                }
            } else {
                arg2[arg5 + var7] = -128;
            }
        }
        if (arg3 < 96) {
            method3445(-118, 107, (byte[]) null, (byte) -14, (String) null, 37);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "(B)V")
    public final void method3446(byte arg0) {
        if (arg0 != -126) {
            this.field8672 = 8;
        }
        ++field8491;
        if (this.field8702 != 4) {
            this.method3422((byte) 70);
            this.method3393(false, arg0 + -11468);
            this.method3425(false, 95);
            this.method3439(false, (byte) -113);
            this.method3424(false, -32);
            this.method3459((byte) 120, -2);
            this.method3403(1, -3);
            this.field8702 = 4;
        }
    }

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "(B)Lgfa;")
    public final class660 method3447(byte arg0) {
        if (arg0 <= 60) {
            this.method339(24, -35, -50, -45);
        }
        ++field8492;
        return this.field8713 == null ? null : this.field8713.method928(125);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(FFF)V")
    public final void method201(float arg0, float arg1, float arg2) {
        class305.field4011 = arg1;
        class64.field877 = arg2;
        ++field8493;
        class279.field3654 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "(I)V")
    public final void method3448(int arg0) {
        ++field8423;
        if (arg0 == 64) {
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "(I)V")
    private final void method3449(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field8426;
        OpenGL.glLoadMatrixf(this.field8617, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 != -13836) {
            this.field8586 = 38;
        }
    }

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "(I)V")
    private final void method3450(int arg0) {
        ++field8494;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg0 == -8250) {
            OpenGL.glMultMatrixf(this.field8697.method142(78), 0);
            if (this.field8630) {
                this.field8551.field2617.method34(317);
            }
            this.method3399((byte) 85);
            this.method3451(arg0 ^ -8248);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
    public final int method370(int arg0, int arg1) {
        ++field8439;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "(I)V")
    private final void method3451(int arg0) {
        ++field8458;
        int var2;
        for (var2 = 0; ~var2 > ~this.field8598; ++var2) {
            class296 var3 = this.field8665[var2];
            int var4 = 16386 - -var2;
            class247.field3326[0] = (float) var3.method1754(26);
            class247.field3326[1] = (float) var3.method1753((byte) 127);
            class247.field3326[2] = (float) var3.method1755(114);
            class247.field3326[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class247.field3326, 0);
            int var5 = var3.method1751(118);
            float var6 = var3.method1756((byte) 124) / 255.0F;
            class247.field3326[2] = var6 * (float) class597.method3238(var5, 255);
            class247.field3326[0] = (float) class597.method3238(255, var5 >> 16) * var6;
            class247.field3326[1] = (float) (class597.method3238(var5, 65521) >> 8) * var6;
            OpenGL.glLightfv(var4, 4609, class247.field3326, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1752(arg0 ^ 36) * var3.method1752(arg0 ^ 67)));
            OpenGL.glEnable(var4);
        }
        if (arg0 == 14) {
            while (this.field8701 > var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field8701 = this.field8598;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class88 method413(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8537;
        return new class295(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Li;)V")
    public final void method345(class686 arg0) {
        this.field8572 = ((class62) arg0).field850;
        ++field8507;
        if (this.field8715 == null) {
            class703 var2 = new class703(80);
            if (this.field8631) {
                var2.method3847(-1.0F, -40);
                var2.method3847(-1.0F, -74);
                var2.method3847(0.0F, -110);
                var2.method3847(0.0F, -108);
                var2.method3847(1.0F, -2);
                var2.method3847(1.0F, 102);
                var2.method3847(-1.0F, -17);
                var2.method3847(0.0F, -6);
                var2.method3847(1.0F, 114);
                var2.method3847(1.0F, -124);
                var2.method3847(1.0F, -52);
                var2.method3847(1.0F, 114);
                var2.method3847(0.0F, -103);
                var2.method3847(1.0F, -45);
                var2.method3847(0.0F, 125);
                var2.method3847(-1.0F, 100);
                var2.method3847(1.0F, 112);
                var2.method3847(0.0F, -52);
                var2.method3847(0.0F, 110);
                var2.method3847(0.0F, -107);
            } else {
                var2.method3846(-1.0F, -58);
                var2.method3846(-1.0F, -27);
                var2.method3846(0.0F, -35);
                var2.method3846(0.0F, -58);
                var2.method3846(1.0F, -69);
                var2.method3846(1.0F, -127);
                var2.method3846(-1.0F, -49);
                var2.method3846(0.0F, -57);
                var2.method3846(1.0F, -40);
                var2.method3846(1.0F, -54);
                var2.method3846(1.0F, -95);
                var2.method3846(1.0F, -38);
                var2.method3846(0.0F, -45);
                var2.method3846(1.0F, -82);
                var2.method3846(0.0F, -25);
                var2.method3846(-1.0F, -16);
                var2.method3846(1.0F, -101);
                var2.method3846(0.0F, -17);
                var2.method3846(0.0F, -16);
                var2.method3846(0.0F, -87);
            }
            this.field8715 = this.method3433(var2.field5367, false, false, var2.field5393, 20);
            this.field8677 = new class414(this.field8715, 5126, 3, 0);
            this.field8621 = new class414(this.field8715, 5126, 2, 12);
            this.field8558.method2580(5126, this);
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public final synchronized void method224(int arg0) {
        ++field8385;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field8590.method2093(-2)) {
            class195 var12 = (class195) this.field8590.method2092((byte) 92);
            class649.field9037[var3++] = (int) var12.field5499;
            this.field8587 -= var12.field2546;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class649.field9037, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class649.field9037, 0);
            var3 = 0;
        }
        while (!this.field8591.method2093(-2)) {
            class195 var11 = (class195) this.field8591.method2092((byte) 92);
            class649.field9037[var3++] = (int) var11.field5499;
            this.field8588 -= var11.field2546;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class649.field9037, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class649.field9037, 0);
            var3 = 0;
        }
        while (!this.field8592.method2093(-2)) {
            class195 var10 = (class195) this.field8592.method2092((byte) 92);
            class649.field9037[var3++] = var10.field2546;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class649.field9037, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class649.field9037, 0);
            var3 = 0;
        }
        while (!this.field8593.method2093(-2)) {
            class195 var9 = (class195) this.field8593.method2092((byte) 92);
            class649.field9037[var3++] = (int) var9.field5499;
            this.field8589 -= var9.field2546;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class649.field9037, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class649.field9037, 0);
            boolean var4 = false;
        }
        while (!this.field8585.method2093(-2)) {
            class195 var8 = (class195) this.field8585.method2092((byte) 92);
            OpenGL.glDeleteLists((int) var8.field5499, var8.field2546);
        }
        while (!this.field8594.method2093(-2)) {
            class424 var7 = this.field8594.method2092((byte) 92);
            OpenGL.glDeleteProgramARB((int) var7.field5499);
        }
        while (!this.field8595.method2093(-2)) {
            class424 var6 = this.field8595.method2092((byte) 92);
            OpenGL.glDeleteObjectARB(var6.field5499);
        }
        while (!this.field8585.method2093(-2)) {
            class195 var5 = (class195) this.field8585.method2092((byte) 92);
            OpenGL.glDeleteLists((int) var5.field5499, var5.field2546);
        }
        this.field8549.method3314((byte) -121);
        if (this.method399() > 100663296 && class584.method3191(1) > this.field8687 - -60000L) {
            System.gc();
            this.field8687 = class584.method3191(1);
        }
        this.field8566 = var2;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "()Z")
    public final boolean method338() {
        ++field8420;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "()V")
    public final void method205() {
        ++field8399;
        this.method3424(true, -32);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "()Z")
    public final boolean method386() {
        ++field8444;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "(I)V")
    private final void method3452(int arg0) {
        class116.field1500[1] = this.field8712 * this.field8646;
        class116.field1500[3] = 1.0F;
        class116.field1500[arg0] = this.field8712 * this.field8661;
        ++field8512;
        class116.field1500[0] = this.field8712 * this.field8616;
        OpenGL.glLightModelfv(2899, class116.field1500, 0);
    }

    @OriginalMember(owner = "client!ji", name = "ha", descriptor = "(F)V")
    public final void method360(float arg0) {
        if (this.field8712 != arg0) {
            this.field8712 = arg0;
            this.method3452(2);
        }
        ++field8477;
    }

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "()Lq;")
    public final class151 method402() {
        ++field8359;
        return this.field8563;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIII)V")
    public final void method3453(boolean arg0, int arg1, int arg2, int arg3) {
        ++field8387;
        if (!arg0) {
            OpenGL.glTexEnvi(8960, arg3 + 34176, arg2);
            OpenGL.glTexEnvi(8960, 34192 - -arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "()Lq;")
    public final class151 method346() {
        ++field8372;
        return new class25();
    }

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "(B)V")
    public static void method3454(byte arg0) {
        field8371 = null;
        if (arg0 <= 34) {
            field8371 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "JA", descriptor = "(I)V")
    public final void method330(int arg0) {
        this.field8571 = 0;
        ++field8393;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field8571;
        }
        this.field8570 = 1 << this.field8571;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()Z")
    public final boolean method329() {
        ++field8392;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public final void method359(int arg0) {
        ++field8479;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "(IIIIII)V")
    public final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8422;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3431(3);
        this.method3403(arg5, -3);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8668) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8668) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "(I)V")
    private final void method3455(int arg0) {
        if (this.field8658 && !this.field8671) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field8490;
        if (arg0 != 4663) {
            method3418(-84, 16);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()Log;")
    public final class463 method189() {
        ++field8526;
        int var1 = -1;
        if (this.field8699.indexOf("nvidia") == -1) {
            if (~this.field8699.indexOf("intel") == 0) {
                if (this.field8699.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class463(var1, "OpenGL", this.field8626, this.field8655, 0L);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Law;Z)Lxa;")
    public final class511 method325(class506 arg0, boolean arg1) {
        ++field8523;
        int[] var3 = new int[arg0.field6651 * arg0.field6650];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field6649 == null) {
            for (int var6 = 0; arg0.field6650 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field6651 < ~var7; ++var7) {
                    int var8 = arg0.field6648[arg0.field6647[var4++] & 255];
                    var3[var5++] = var8 != 0 ? class131.method954(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; var9 < arg0.field6650; ++var9) {
                for (int var11 = 0; ~arg0.field6651 < ~var11; ++var11) {
                    var3[var5++] = class131.method954(arg0.field6649[var4] << 24, arg0.field6648[class597.method3238(255, arg0.field6647[var4])]);
                    ++var4;
                }
            }
        }
        class511 var10 = this.method381(var3, 0, arg0.field6651, arg0.field6651, arg0.field6650);
        var10.method610(arg0.field6646, arg0.field6652, arg0.field6645, arg0.field6653);
        return var10;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;I)V")
    public class622(Canvas arg0, class702 arg1, int arg2) {
        super(arg1);
        this.field8441 = this.field8436 = arg0;
        this.field8561 = arg2;
        if (!client.method709("jaclib", (byte) 90)) {
            throw new RuntimeException("");
        } else if (!client.method709("jaggl", (byte) -16)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field8501 = new OpenGL();
                this.field8528 = this.field8450 = this.field8501.init(arg0, 8, 8, 8, 24, 0, this.field8561);
                if (this.field8450 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method3386(119);
                    int var4 = this.method3404(-5407);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field8676 = this.field8631 ? 33639 : 5121;
                        if (this.field8655.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class420.method2420(' ', -110, this.field8655.replace('/', ' '));
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class594.method3226(-86, var10.substring(1, 3))) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (~var10.length() <= -5 && class594.method3226(-106, var10.substring(0, 4))) {
                                                var5 = class703.method3845((byte) -94, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field8698 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field8704 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field8685 = false;
                                }
                            }
                            this.field8650 &= this.field8501.method123("GL_ARB_half_float_pixel");
                            this.field8673 = this.field8704;
                            this.field8662 = true;
                        }
                        if (this.field8699.indexOf("intel") != -1) {
                            this.field8640 = false;
                        }
                        this.field8690 = !this.field8699.equals("s3 graphics");
                        if (this.field8704) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class315.method1837(-1753516255, true, false);
                        this.field8569 = true;
                        this.field8549 = new class611(this, super.field598);
                        this.method3392(125);
                        this.field8568 = new class509(this);
                        this.field8553 = new class354(this);
                        if (this.field8553.method2039(4)) {
                            this.field8550 = new class134(this);
                            if (!this.field8550.method975(false)) {
                                this.field8550.method972(-1);
                                this.field8550 = null;
                            }
                        }
                        this.field8551 = new class201(this);
                        this.method3411(-11723);
                        this.method3400(true);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field8501.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (var12++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class122.method905(100L, -6145);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method225();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8434;
        float var7 = (float) arg2 * this.field8697.field298 + (float) arg0 * this.field8697.field291 + (float) arg1 * this.field8697.field313 + this.field8697.field293;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field8697.field298 + (float) arg3 * this.field8697.field291 + (float) arg4 * this.field8697.field313 + this.field8697.field293;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field8709 > var7) || !(var8 < (float) this.field8709)) && (!((float) this.field8688 < var7) || !((float) this.field8688 < var8))) {
            int var9 = (int) (((float) arg2 * this.field8697.field296 + (float) arg0 * this.field8697.field290 + (float) arg1 * this.field8697.field289 + this.field8697.field306) * (float) this.field8637 / var7);
            int var10 = (int) (((float) arg5 * this.field8697.field296 + (float) arg3 * this.field8697.field290 + (float) arg4 * this.field8697.field289 + this.field8697.field306) * (float) this.field8637 / var8);
            if (this.field8711 > (float) var9 && this.field8711 > (float) var10 || this.field8669 < (float) var9 && this.field8669 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field8697.field297 + (float) arg0 * this.field8697.field302 + (float) arg1 * this.field8697.field309 + this.field8697.field288) * (float) this.field8680 / var7);
                int var12 = (int) (((float) arg5 * this.field8697.field297 + (float) arg3 * this.field8697.field302 + (float) arg4 * this.field8697.field309 + this.field8697.field288) * (float) this.field8680 / var8);
                return (!((float) var11 < this.field8608) || !((float) var12 < this.field8608)) && (!((float) var11 > this.field8599) || !((float) var12 > this.field8599));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "(I)V")
    private final void method3456(int arg0) {
        ++field8365;
        if (arg0 <= 19) {
            this.field8590 = null;
        }
        if (this.field8638) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field8638 = false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(JI)V")
    public final synchronized void method3457(long arg0, int arg1) {
        ++field8452;
        if (arg1 != 0) {
            this.method396();
        }
        class424 var4 = new class424();
        var4.field5499 = arg0;
        this.field8595.method2087(var4, -112);
    }

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "(I)V")
    public final void method3458(int arg0) {
        if (this.field8702 != 16) {
            this.method3385((byte) -127);
            this.method3393(true, -11594);
            this.method3439(true, (byte) -68);
            this.method3424(true, -32);
            this.method3403(1, -3);
            this.field8702 = 16;
        }
        if (arg0 >= -34) {
            this.method3423((byte) -80, -9);
        }
        ++field8536;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(BI)V")
    public final void method3459(byte arg0, int arg1) {
        this.method3414(arg1, (byte) 62, true);
        int var3 = -8 % ((-60 - arg0) / 47);
        ++field8414;
    }

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "(I)V")
    private final void method3460(int arg0) {
        if (this.field8643 != 0.0F) {
            float var2 = this.field8611 / (this.field8643 + this.field8611);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field8657 * (-var2 + 1.0F) / this.field8643;
            this.field8617[10] = this.field8683 + var4;
            this.field8617[14] = this.field8657 * var3;
        } else {
            this.field8617[10] = this.field8683;
            this.field8617[14] = this.field8657;
        }
        ++field8378;
        this.field8705 = (this.field8617[14] - (float) this.field8688) / this.field8617[10];
        if (arg0 != 1) {
            this.method3416(true);
        }
        this.field8663 = (float) this.field8688 - this.field8643;
    }

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "()Z")
    public final boolean method379() {
        ++field8559;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "()Z")
    public final boolean method355() {
        ++field8527;
        return this.field8668 && (!this.method211() || this.field8604);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method336(Canvas arg0) {
        ++field8411;
        if (this.field8436 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8478.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field8501.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field8478.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIBI)V")
    public final void method3461(int arg0, int arg1, byte arg2, int arg3) {
        OpenGL.glDrawArrays(arg1, arg3, arg0);
        int var5 = 47 % ((38 - arg2) / 35);
        ++field8543;
    }

    @OriginalMember(owner = "client!ji", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8406;
        float var10;
        float var11;
        if (this.field8629 != null && ~arg2 >= ~this.field8629.field3212 && arg3 <= this.field8629.field3213) {
            this.field8629.method1512(0, 5065, 0, arg6, false, arg2, 0, 6406, 0, arg3);
            var10 = (float) arg3 * this.field8629.field2872 / (float) this.field8629.field3213;
            var11 = (float) arg2 * this.field8629.field2874 / (float) this.field8629.field3212;
        } else {
            this.field8629 = class521.method2798(6406, this, -13842, arg6, false, arg2, 6406, arg3);
            this.field8629.method1504(false, (byte) 123, false);
            var10 = this.field8629.field2872;
            var11 = this.field8629.field2874;
        }
        this.method3441(6369);
        this.method3388(this.field8629, false);
        this.method3403(arg8, -3);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3421((byte) -29, arg5);
        this.method3462(34165, -5882, 34165);
        this.method3453(false, 768, 34166, 0);
        this.method3453(false, 770, 5890, 2);
        this.method3389((byte) 101, 770, 0, 34166);
        this.method3389((byte) 86, 770, 2, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method3453(false, 768, 5890, 0);
        this.method3453(false, 770, 34166, 2);
        this.method3389((byte) 89, 770, 0, 5890);
        this.method3389((byte) 93, 770, 2, 34166);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(III)V")
    public final void method3462(int arg0, int arg1, int arg2) {
        if (~this.field8607 == -1) {
            boolean var4 = false;
            if (~this.field8609 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var4 = true;
                this.field8609 = arg2;
            }
            if (~this.field8597 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field8597 = arg0;
            }
            if (var4) {
                this.field8702 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        }
        ++field8453;
        if (arg1 != -5882) {
            this.method3396(-68, 123, 109);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lsj;B)V")
    public final void method3463(class373 arg0, byte arg1) {
        if (this.field8686 != arg0) {
            if (this.field8704) {
                OpenGL.glBindBufferARB(34962, arg0.method2142((byte) 17));
            }
            this.field8686 = arg0;
        }
        ++field8498;
        if (arg1 != -84) {
            this.method364(-95, -89, false);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILul;II)V")
    public final void method3464(int arg0, int arg1, class439 arg2, int arg3, int arg4) {
        ++field8401;
        int var6 = arg2.method575(true);
        int var7 = arg4 * this.method3409(4, var6);
        int var8 = -63 / ((18 - arg3) / 47);
        this.method3444(-107, arg2);
        OpenGL.glDrawElements(arg1, arg0, var6, arg2.method576((byte) -36) + (long) var7);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method374(Canvas arg0) {
        ++field8377;
        this.field8528 = 0L;
        this.field8441 = null;
        if (arg0 != null && this.field8436 != arg0) {
            if (this.field8478.containsKey(arg0)) {
                Long var2 = (Long) this.field8478.get(arg0);
                this.field8528 = var2;
                this.field8441 = arg0;
            }
        } else {
            this.field8441 = this.field8436;
            this.field8528 = this.field8450;
        }
        if (this.field8441 != null && this.field8528 != 0L) {
            this.field8501.setSurface(this.field8528);
            this.method3400(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "KA", descriptor = "(IIII)[I")
    public final int[] method157(int arg0, int arg1, int arg2, int arg3) {
        ++field8463;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field8407 + -arg1, arg2, 1, 32993, this.field8676, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lmga;B)V")
    public final void method3465(class341 arg0, byte arg1) {
        ++field8474;
        if (this.field8579 >= 0 && this.field8580[this.field8579] == arg0) {
            this.field8580[this.field8579--] = null;
            arg0.method1978(20236);
            if (~this.field8579 > -1) {
                this.field8577 = null;
            } else {
                this.field8577 = this.field8580[this.field8579];
                this.field8577.method1974(97);
            }
            if (arg1 <= 40) {
                this.method194();
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "()Z")
    public final boolean method211() {
        ++field8524;
        return this.field8550 != null && this.field8550.method2024(0);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IZ)V")
    public final void method3466(int arg0, boolean arg1) {
        if (this.field8671 != arg1) {
            this.field8671 = arg1;
            this.method3455(4663);
        }
        ++field8367;
        if (arg0 > -29) {
            this.field8682 = -0.2816413F;
        }
    }

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "()I")
    public final int method343() {
        ++field8544;
        return this.field8709;
    }

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "(IIII)V")
    public final void method393(int arg0, int arg1, int arg2, int arg3) {
        this.field8680 = arg3;
        ++field8502;
        this.field8649 = arg1;
        this.field8637 = arg2;
        this.field8639 = arg0;
        this.method3415(-48);
        this.method3394(0);
        if (this.field8633 == 3) {
            this.method3435((byte) -93);
        } else if (this.field8633 == 2) {
            this.method3449(-13836);
        }
    }

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "()F")
    public final float method3467() {
        ++field8446;
        return this.field8611;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(Z)V")
    public final void method167(boolean arg0) {
        ++field8419;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
    public final synchronized void method3468(int arg0, int arg1, byte arg2) {
        ++field8471;
        class195 var4 = new class195(arg0);
        var4.field5499 = (long) arg1;
        if (arg2 == 113) {
            this.field8590.method2087(var4, 84);
        }
    }

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "()V")
    public final void method225() {
        ++field8548;
        for (class424 var1 = this.field8567.method2090(true); var1 != null; var1 = this.field8567.method2088(-152)) {
            ((class62) var1).method527(-50);
        }
        if (this.field8553 != null) {
            this.field8553.method2033((byte) 105);
        }
        if (this.field8501 != null) {
            this.method3397(-73);
            Enumeration var2 = this.field8478.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field8478.get(var3);
                this.field8501.releaseSurface(var3, var4);
            }
            this.field8501.release();
            this.field8501 = null;
        }
        if (this.field8569) {
            class260.method1621(false, true, false);
            this.field8569 = false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IZ)V")
    public final void method3469(int arg0, boolean arg1) {
        if (~this.field8607 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field8607 = arg0;
        }
        ++field8464;
        if (arg1) {
            this.method3440((byte) -42);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
    public final void method180() {
        ++field8525;
        if (this.field8690 && this.field8503 > 0 && ~this.field8407 < -1) {
            int var1 = this.field8670;
            int var2 = this.field8659;
            int var3 = this.field8642;
            int var4 = this.field8681;
            this.method396();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3407((byte) -108);
            this.method3393(false, -11594);
            this.method3425(false, 119);
            this.method3439(false, (byte) -68);
            this.method3424(false, -32);
            this.method3388((class710) null, false);
            this.method3459((byte) -112, -2);
            this.method3443(1, true);
            this.method3403(0, -3);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field8503, this.field8407, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method376(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBZ[BI)Lul;")
    public final class439 method3470(int arg0, byte arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field8421;
        int var6 = -60 % ((-44 - arg1) / 59);
        return (class439) (!this.field8704 || arg2 && !this.field8673 ? new class333(this, arg0, arg3, arg4) : new class72(this, arg0, arg3, arg4, arg2));
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(IIIIII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8380;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method3431(3);
        this.method3403(arg5, -3);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8668) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8668) {
            OpenGL.glEnable(32925);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -121; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field8371[var1] = var0 / 4;
        }
    }
}
