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

@OriginalClass("client!uq")
public class class313 extends class167 {

    @OriginalMember(owner = "client!uq", name = "Ed", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4162 = new Hashtable();

    @OriginalMember(owner = "client!uq", name = "Wd", descriptor = "I")
    public int field4180 = 128;

    @OriginalMember(owner = "client!uq", name = "ie", descriptor = "Low;")
    private class89 field4192 = new class89();

    @OriginalMember(owner = "client!uq", name = "me", descriptor = "Lhba;")
    private class404 field4196 = new class404();

    @OriginalMember(owner = "client!uq", name = "ne", descriptor = "Lhba;")
    public class404 field4197 = new class404();

    @OriginalMember(owner = "client!uq", name = "qe", descriptor = "I")
    public int field4200 = 8;

    @OriginalMember(owner = "client!uq", name = "re", descriptor = "I")
    public int field4201 = 3;

    @OriginalMember(owner = "client!uq", name = "ue", descriptor = "Z")
    private boolean field4204 = false;

    @OriginalMember(owner = "client!uq", name = "te", descriptor = "Lbv;")
    private class568 field4203 = new class568();

    @OriginalMember(owner = "client!uq", name = "ye", descriptor = "I")
    private int field4208 = -1;

    @OriginalMember(owner = "client!uq", name = "ve", descriptor = "[Lve;")
    private class230[] field4205 = new class230[4];

    @OriginalMember(owner = "client!uq", name = "we", descriptor = "I")
    private int field4206 = -1;

    @OriginalMember(owner = "client!uq", name = "Be", descriptor = "[Lve;")
    private class230[] field4211 = new class230[4];

    @OriginalMember(owner = "client!uq", name = "xe", descriptor = "I")
    private int field4207 = -1;

    @OriginalMember(owner = "client!uq", name = "Ae", descriptor = "[Lve;")
    private class230[] field4210 = new class230[4];

    @OriginalMember(owner = "client!uq", name = "Fe", descriptor = "Lbv;")
    private class568 field4215;

    @OriginalMember(owner = "client!uq", name = "He", descriptor = "Lbv;")
    private class568 field4217;

    @OriginalMember(owner = "client!uq", name = "Ie", descriptor = "Lbv;")
    private class568 field4218;

    @OriginalMember(owner = "client!uq", name = "Je", descriptor = "Lbv;")
    private class568 field4219;

    @OriginalMember(owner = "client!uq", name = "Ke", descriptor = "Lbv;")
    private class568 field4220;

    @OriginalMember(owner = "client!uq", name = "Le", descriptor = "Lbv;")
    private class568 field4221;

    @OriginalMember(owner = "client!uq", name = "Me", descriptor = "Lbv;")
    private class568 field4222;

    @OriginalMember(owner = "client!uq", name = "Oe", descriptor = "I")
    private int field4224;

    @OriginalMember(owner = "client!uq", name = "Pe", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!uq", name = "Ue", descriptor = "F")
    private float field4230;

    @OriginalMember(owner = "client!uq", name = "Qe", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!uq", name = "nf", descriptor = "F")
    private float field4248;

    @OriginalMember(owner = "client!uq", name = "af", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!uq", name = "rf", descriptor = "F")
    public float field4252;

    @OriginalMember(owner = "client!uq", name = "Ze", descriptor = "F")
    public float field4235;

    @OriginalMember(owner = "client!uq", name = "qf", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!uq", name = "Rf", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!uq", name = "lf", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!uq", name = "uf", descriptor = "I")
    private int field4255;

    @OriginalMember(owner = "client!uq", name = "Hf", descriptor = "I")
    private int field4268;

    @OriginalMember(owner = "client!uq", name = "Se", descriptor = "[F")
    private float[] field4228;

    @OriginalMember(owner = "client!uq", name = "Ef", descriptor = "Z")
    private boolean field4265;

    @OriginalMember(owner = "client!uq", name = "vf", descriptor = "I")
    public int field4256;

    @OriginalMember(owner = "client!uq", name = "ng", descriptor = "I")
    private int field4300;

    @OriginalMember(owner = "client!uq", name = "kg", descriptor = "F")
    private float field4297;

    @OriginalMember(owner = "client!uq", name = "qg", descriptor = "I")
    private int field4303;

    @OriginalMember(owner = "client!uq", name = "Jf", descriptor = "I")
    private int field4270;

    @OriginalMember(owner = "client!uq", name = "Wf", descriptor = "F")
    private float field4283;

    @OriginalMember(owner = "client!uq", name = "lg", descriptor = "[F")
    private float[] field4298;

    @OriginalMember(owner = "client!uq", name = "Af", descriptor = "[F")
    private float[] field4261;

    @OriginalMember(owner = "client!uq", name = "Ag", descriptor = "[Lww;")
    private class592[] field4313;

    @OriginalMember(owner = "client!uq", name = "hg", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!uq", name = "ig", descriptor = "I")
    private int field4295;

    @OriginalMember(owner = "client!uq", name = "Cg", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!uq", name = "vg", descriptor = "[F")
    private float[] field4308;

    @OriginalMember(owner = "client!uq", name = "Ng", descriptor = "F")
    public float field4326;

    @OriginalMember(owner = "client!uq", name = "zg", descriptor = "F")
    public float field4312;

    @OriginalMember(owner = "client!uq", name = "Of", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!uq", name = "Wg", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!uq", name = "Tf", descriptor = "I")
    private int field4280;

    @OriginalMember(owner = "client!uq", name = "Fg", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!uq", name = "Vg", descriptor = "F")
    private float field4334;

    @OriginalMember(owner = "client!uq", name = "Rg", descriptor = "F")
    public float field4330;

    @OriginalMember(owner = "client!uq", name = "Yg", descriptor = "F")
    public float field4337;

    @OriginalMember(owner = "client!uq", name = "Zg", descriptor = "I")
    private int field4338;

    @OriginalMember(owner = "client!uq", name = "Sg", descriptor = "F")
    public float field4331;

    @OriginalMember(owner = "client!uq", name = "Xf", descriptor = "[F")
    public float[] field4284;

    @OriginalMember(owner = "client!uq", name = "dh", descriptor = "F")
    private float field4342;

    @OriginalMember(owner = "client!uq", name = "Yf", descriptor = "Law;")
    public class616 field4285;

    @OriginalMember(owner = "client!uq", name = "eh", descriptor = "[I")
    public int[] field4343;

    @OriginalMember(owner = "client!uq", name = "hh", descriptor = "[I")
    public int[] field4346;

    @OriginalMember(owner = "client!uq", name = "ih", descriptor = "[I")
    public int[] field4347;

    @OriginalMember(owner = "client!uq", name = "jh", descriptor = "[B")
    public byte[] field4348;

    @OriginalMember(owner = "client!uq", name = "ec", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4084;

    @OriginalMember(owner = "client!uq", name = "xd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4155;

    @OriginalMember(owner = "client!uq", name = "ee", descriptor = "I")
    public int field4188;

    @OriginalMember(owner = "client!uq", name = "Cb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4056;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "J")
    private long field4001;

    @OriginalMember(owner = "client!uq", name = "ob", descriptor = "J")
    private long field4042;

    @OriginalMember(owner = "client!uq", name = "eg", descriptor = "Z")
    public boolean field4291;

    @OriginalMember(owner = "client!uq", name = "Ye", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!uq", name = "Hg", descriptor = "Ljava/lang/String;")
    private String field4320;

    @OriginalMember(owner = "client!uq", name = "sg", descriptor = "Z")
    public boolean field4305;

    @OriginalMember(owner = "client!uq", name = "Ve", descriptor = "Z")
    public boolean field4231;

    @OriginalMember(owner = "client!uq", name = "jf", descriptor = "Z")
    private boolean field4244;

    @OriginalMember(owner = "client!uq", name = "hf", descriptor = "Z")
    public boolean field4243;

    @OriginalMember(owner = "client!uq", name = "Og", descriptor = "Z")
    private boolean field4327;

    @OriginalMember(owner = "client!uq", name = "sf", descriptor = "Z")
    public boolean field4253;

    @OriginalMember(owner = "client!uq", name = "ag", descriptor = "Ljava/lang/String;")
    private String field4287;

    @OriginalMember(owner = "client!uq", name = "Xg", descriptor = "Z")
    public boolean field4336;

    @OriginalMember(owner = "client!uq", name = "Mf", descriptor = "Z")
    private boolean field4273;

    @OriginalMember(owner = "client!uq", name = "je", descriptor = "Lcea;")
    private class103 field4193;

    @OriginalMember(owner = "client!uq", name = "pe", descriptor = "Lwo;")
    public class408 field4199;

    @OriginalMember(owner = "client!uq", name = "de", descriptor = "Lbh;")
    private class505 field4187;

    @OriginalMember(owner = "client!uq", name = "Sd", descriptor = "Los;")
    private class468 field4176;

    @OriginalMember(owner = "client!uq", name = "ke", descriptor = "Luaa;")
    private class396 field4194;

    @OriginalMember(owner = "client!uq", name = "Y", descriptor = "F")
    public static float field4026 = 0.25F;

    @OriginalMember(owner = "client!uq", name = "We", descriptor = "F")
    private float field4232;

    @OriginalMember(owner = "client!uq", name = "Xe", descriptor = "F")
    public float field4233;

    @OriginalMember(owner = "client!uq", name = "ef", descriptor = "F")
    private float field4240;

    @OriginalMember(owner = "client!uq", name = "Df", descriptor = "F")
    public float field4264;

    @OriginalMember(owner = "client!uq", name = "Lf", descriptor = "F")
    private float field4272;

    @OriginalMember(owner = "client!uq", name = "cg", descriptor = "F")
    public float field4289;

    @OriginalMember(owner = "client!uq", name = "xg", descriptor = "F")
    public float field4310;

    @OriginalMember(owner = "client!uq", name = "Eg", descriptor = "F")
    private float field4317;

    @OriginalMember(owner = "client!uq", name = "Lg", descriptor = "F")
    public float field4324;

    @OriginalMember(owner = "client!uq", name = "Mg", descriptor = "F")
    public float field4325;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!uq", name = "D", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!uq", name = "P", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!uq", name = "Q", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!uq", name = "R", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!uq", name = "S", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!uq", name = "T", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!uq", name = "U", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!uq", name = "V", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!uq", name = "W", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!uq", name = "X", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!uq", name = "Z", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!uq", name = "ab", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!uq", name = "bb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!uq", name = "cb", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!uq", name = "db", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!uq", name = "eb", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!uq", name = "fb", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!uq", name = "gb", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!uq", name = "hb", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!uq", name = "ib", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!uq", name = "jb", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!uq", name = "kb", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!uq", name = "lb", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!uq", name = "mb", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!uq", name = "nb", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!uq", name = "pb", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!uq", name = "qb", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!uq", name = "rb", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!uq", name = "sb", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!uq", name = "tb", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!uq", name = "ub", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!uq", name = "vb", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!uq", name = "wb", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!uq", name = "xb", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!uq", name = "yb", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!uq", name = "zb", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!uq", name = "Ab", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!uq", name = "Bb", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!uq", name = "Db", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!uq", name = "Eb", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!uq", name = "Fb", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!uq", name = "Gb", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!uq", name = "Hb", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!uq", name = "Ib", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!uq", name = "Jb", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!uq", name = "Kb", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!uq", name = "Lb", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!uq", name = "Mb", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!uq", name = "Nb", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!uq", name = "Ob", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!uq", name = "Pb", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!uq", name = "Qb", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!uq", name = "Rb", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!uq", name = "Sb", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!uq", name = "Tb", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!uq", name = "Ub", descriptor = "I")
    private int field4074;

    @OriginalMember(owner = "client!uq", name = "Vb", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!uq", name = "Wb", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!uq", name = "Xb", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!uq", name = "Yb", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!uq", name = "Zb", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!uq", name = "ac", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!uq", name = "bc", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!uq", name = "cc", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!uq", name = "dc", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!uq", name = "fc", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!uq", name = "gc", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!uq", name = "hc", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!uq", name = "ic", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!uq", name = "jc", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!uq", name = "kc", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!uq", name = "lc", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!uq", name = "mc", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!uq", name = "nc", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!uq", name = "oc", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!uq", name = "pc", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!uq", name = "qc", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!uq", name = "rc", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!uq", name = "sc", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!uq", name = "tc", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!uq", name = "uc", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!uq", name = "vc", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!uq", name = "wc", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!uq", name = "xc", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!uq", name = "yc", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!uq", name = "zc", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!uq", name = "Ac", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!uq", name = "Bc", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!uq", name = "Cc", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!uq", name = "Dc", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!uq", name = "Ec", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!uq", name = "Fc", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!uq", name = "Gc", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!uq", name = "Hc", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!uq", name = "Ic", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!uq", name = "Jc", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!uq", name = "Kc", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!uq", name = "Lc", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!uq", name = "Mc", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!uq", name = "Nc", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!uq", name = "Oc", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!uq", name = "Pc", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!uq", name = "Qc", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!uq", name = "Rc", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!uq", name = "Sc", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!uq", name = "Tc", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!uq", name = "Uc", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!uq", name = "Vc", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!uq", name = "Wc", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!uq", name = "Xc", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!uq", name = "Yc", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!uq", name = "Zc", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!uq", name = "ad", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!uq", name = "bd", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!uq", name = "cd", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!uq", name = "dd", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!uq", name = "ed", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!uq", name = "fd", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!uq", name = "gd", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!uq", name = "hd", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!uq", name = "id", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!uq", name = "jd", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!uq", name = "kd", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!uq", name = "ld", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!uq", name = "md", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!uq", name = "nd", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!uq", name = "od", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!uq", name = "pd", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!uq", name = "qd", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!uq", name = "rd", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!uq", name = "sd", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!uq", name = "td", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!uq", name = "ud", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!uq", name = "vd", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!uq", name = "wd", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!uq", name = "yd", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!uq", name = "zd", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!uq", name = "Ad", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!uq", name = "Bd", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!uq", name = "Cd", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!uq", name = "Dd", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!uq", name = "Fd", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!uq", name = "Gd", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!uq", name = "Hd", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!uq", name = "Id", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!uq", name = "Jd", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!uq", name = "Kd", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!uq", name = "Ld", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!uq", name = "Md", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!uq", name = "Nd", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!uq", name = "Od", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!uq", name = "Pd", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!uq", name = "Qd", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!uq", name = "Rd", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!uq", name = "Td", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!uq", name = "Ud", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!uq", name = "Vd", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!uq", name = "Xd", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!uq", name = "Yd", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!uq", name = "Zd", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!uq", name = "ae", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!uq", name = "be", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!uq", name = "ce", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!uq", name = "fe", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!uq", name = "ge", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!uq", name = "he", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!uq", name = "le", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!uq", name = "oe", descriptor = "I")
    public int field4198;

    @OriginalMember(owner = "client!uq", name = "De", descriptor = "I")
    private int field4213;

    @OriginalMember(owner = "client!uq", name = "Ee", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!uq", name = "Ge", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!uq", name = "bf", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!uq", name = "gf", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!uq", name = "pf", descriptor = "I")
    private int field4250;

    @OriginalMember(owner = "client!uq", name = "yf", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!uq", name = "Gf", descriptor = "I")
    private int field4267;

    @OriginalMember(owner = "client!uq", name = "Kf", descriptor = "I")
    private int field4271;

    @OriginalMember(owner = "client!uq", name = "Vf", descriptor = "I")
    public int field4282;

    @OriginalMember(owner = "client!uq", name = "fg", descriptor = "I")
    private int field4292;

    @OriginalMember(owner = "client!uq", name = "gg", descriptor = "I")
    private int field4293;

    @OriginalMember(owner = "client!uq", name = "pg", descriptor = "I")
    private int field4302;

    @OriginalMember(owner = "client!uq", name = "tg", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!uq", name = "yg", descriptor = "I")
    private int field4311;

    @OriginalMember(owner = "client!uq", name = "Dg", descriptor = "I")
    private int field4316;

    @OriginalMember(owner = "client!uq", name = "Ig", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!uq", name = "Ug", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!uq", name = "fh", descriptor = "I")
    private int field4344;

    @OriginalMember(owner = "client!uq", name = "gh", descriptor = "I")
    private int field4345;

    @OriginalMember(owner = "client!uq", name = "ff", descriptor = "J")
    private long field4241;

    @OriginalMember(owner = "client!uq", name = "jg", descriptor = "Lee;")
    private class159 field4296;

    @OriginalMember(owner = "client!uq", name = "Tg", descriptor = "Lee;")
    private class159 field4332;

    @OriginalMember(owner = "client!uq", name = "ze", descriptor = "Lve;")
    private class230 field4209;

    @OriginalMember(owner = "client!uq", name = "Ce", descriptor = "Lve;")
    private class230 field4212;

    @OriginalMember(owner = "client!uq", name = "ah", descriptor = "Lhj;")
    private class250 field4339;

    @OriginalMember(owner = "client!uq", name = "Ne", descriptor = "Llr;")
    public class261 field4223;

    @OriginalMember(owner = "client!uq", name = "df", descriptor = "Llr;")
    public class261 field4239;

    @OriginalMember(owner = "client!uq", name = "mf", descriptor = "Llr;")
    public class261 field4247;

    @OriginalMember(owner = "client!uq", name = "of", descriptor = "Llr;")
    public class261 field4249;

    @OriginalMember(owner = "client!uq", name = "If", descriptor = "Llr;")
    public class261 field4269;

    @OriginalMember(owner = "client!uq", name = "Pf", descriptor = "Llr;")
    public class261 field4276;

    @OriginalMember(owner = "client!uq", name = "dg", descriptor = "Llr;")
    public class261 field4290;

    @OriginalMember(owner = "client!uq", name = "rg", descriptor = "Llr;")
    public class261 field4304;

    @OriginalMember(owner = "client!uq", name = "wg", descriptor = "Llr;")
    public class261 field4309;

    @OriginalMember(owner = "client!uq", name = "Gg", descriptor = "Llr;")
    public class261 field4319;

    @OriginalMember(owner = "client!uq", name = "Qf", descriptor = "Lnu;")
    private class326 field4277;

    @OriginalMember(owner = "client!uq", name = "Bg", descriptor = "Lwd;")
    public class327 field4314;

    @OriginalMember(owner = "client!uq", name = "ug", descriptor = "Lhba;")
    public class404 field4307;

    @OriginalMember(owner = "client!uq", name = "Kg", descriptor = "Lhba;")
    public class404 field4323;

    @OriginalMember(owner = "client!uq", name = "Pg", descriptor = "Lku;")
    public class495 field4328;

    @OriginalMember(owner = "client!uq", name = "Ff", descriptor = "Lem;")
    private class600 field4266;

    @OriginalMember(owner = "client!uq", name = "wf", descriptor = "Lcd;")
    public class86 field4257;

    @OriginalMember(owner = "client!uq", name = "bh", descriptor = "Lcd;")
    public class86 field4340;

    @OriginalMember(owner = "client!uq", name = "se", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4202;

    @OriginalMember(owner = "client!uq", name = "Re", descriptor = "Z")
    public boolean field4227;

    @OriginalMember(owner = "client!uq", name = "Te", descriptor = "Z")
    private boolean field4229;

    @OriginalMember(owner = "client!uq", name = "cf", descriptor = "Z")
    private boolean field4238;

    @OriginalMember(owner = "client!uq", name = "kf", descriptor = "Z")
    public boolean field4245;

    @OriginalMember(owner = "client!uq", name = "tf", descriptor = "Z")
    private boolean field4254;

    @OriginalMember(owner = "client!uq", name = "xf", descriptor = "Z")
    private boolean field4258;

    @OriginalMember(owner = "client!uq", name = "zf", descriptor = "Z")
    private boolean field4260;

    @OriginalMember(owner = "client!uq", name = "Cf", descriptor = "Z")
    private boolean field4263;

    @OriginalMember(owner = "client!uq", name = "Nf", descriptor = "Z")
    public boolean field4274;

    @OriginalMember(owner = "client!uq", name = "Sf", descriptor = "Z")
    private boolean field4279;

    @OriginalMember(owner = "client!uq", name = "Uf", descriptor = "Z")
    public boolean field4281;

    @OriginalMember(owner = "client!uq", name = "Zf", descriptor = "Z")
    private boolean field4286;

    @OriginalMember(owner = "client!uq", name = "bg", descriptor = "Z")
    public boolean field4288;

    @OriginalMember(owner = "client!uq", name = "mg", descriptor = "Z")
    public boolean field4299;

    @OriginalMember(owner = "client!uq", name = "og", descriptor = "Z")
    private boolean field4301;

    @OriginalMember(owner = "client!uq", name = "Jg", descriptor = "Z")
    public boolean field4322;

    @OriginalMember(owner = "client!uq", name = "Qg", descriptor = "Z")
    private boolean field4329;

    @OriginalMember(owner = "client!uq", name = "ch", descriptor = "Z")
    public boolean field4341;

    @OriginalMember(owner = "client!uq", name = "Bf", descriptor = "[Lea;")
    private class148[] field4262;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "()Z")
    public final boolean method951() {
        ++field4136;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "(I)V")
    public final void method1883(int arg0) {
        ++field4070;
        if (arg0 != -1150) {
            this.method964();
        }
        if (this.field4306 != 4) {
            this.method1891(false);
            this.method1962(arg0 + 1118, false);
            this.method1930((byte) -65, false);
            this.method1950(false, -96);
            this.method1949(false, (byte) 120);
            this.method1960(-2, arg0 + 1152);
            this.method1905(arg0 ^ -4000, 1);
            this.field4306 = 4;
        }
    }

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "(IFFFFF)V")
    public final void method981(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4076;
        boolean var7 = this.field4280 != arg0;
        if (var7 || this.field4337 != arg1 || this.field4326 != arg2) {
            this.field4326 = arg2;
            this.field4337 = arg1;
            this.field4280 = arg0;
            if (var7) {
                this.field4252 = (float) (this.field4280 & 255) / 255.0F;
                this.field4235 = (float) (this.field4280 & 65280) / 65280.0F;
                this.field4312 = (float) (16711680 & this.field4280) / 1.671168E7F;
                this.method1956((byte) 124);
            }
            this.method1944(1);
        }
        if (this.field4261[0] != arg3 || this.field4261[1] != arg4 || this.field4261[2] != arg5) {
            this.field4261[2] = arg5;
            this.field4261[1] = arg4;
            this.field4261[0] = arg3;
            this.field4308[2] = -arg5;
            this.field4308[0] = -arg3;
            this.field4308[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4284[2] = arg5 * var8;
            this.field4284[0] = arg3 * var8;
            this.field4284[1] = arg4 * var8;
            this.field4228[0] = -this.field4284[0];
            this.field4228[2] = -this.field4284[2];
            this.field4228[1] = -this.field4284[1];
            this.method1893(-26006);
            this.field4321 = (int) (arg5 * 256.0F / arg4);
            this.field4259 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lea;I)V")
    public final void method1884(class148 arg0, int arg1) {
        ++field4151;
        class148 var3 = this.field4262[this.field4316];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 != null) {
                    if (arg0.field1907 != var3.field1907) {
                        OpenGL.glDisable(var3.field1907);
                        OpenGL.glEnable(arg0.field1907);
                    }
                } else {
                    OpenGL.glEnable(arg0.field1907);
                }
                OpenGL.glBindTexture(arg0.field1907, arg0.method814((byte) -128));
            } else {
                OpenGL.glDisable(var3.field1907);
            }
            this.field4262[this.field4316] = arg0;
        }
        this.field4306 &= arg1;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)V")
    public final void method1885(int arg0, int arg1) {
        class435.field5915[2] = (float) class143.method783(arg0, 255) / 255.0F;
        class435.field5915[1] = (float) class143.method783(65280, arg0) / 65280.0F;
        class435.field5915[3] = (float) (arg0 >>> 24) / 255.0F;
        class435.field5915[0] = (float) class143.method783(16711680, arg0) / 1.671168E7F;
        ++field4125;
        int var3 = 93 / ((arg1 - 7) / 43);
        OpenGL.glTexEnvfv(8960, 8705, class435.field5915, 0);
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(IIIIII)V")
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1955(9514);
        ++field4165;
        this.method1905(3042, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var10 + 0.35F, (float) arg3 + var11 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "(I)I")
    private final int method1886(int arg0) {
        ++field4185;
        int var2 = 0;
        this.field4287 = OpenGL.glGetString(7936).toLowerCase();
        this.field4320 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field4287.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field4287.indexOf("brian paul") != -1 || this.field4287.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class455.method2637(' ', (byte) -57, var3.replace('.', ' '));
        if (~var4.length <= -3) {
            try {
                int var5 = class254.method1532(var4[0], 2);
                int var6 = class254.method1532(var4[1], 2);
                this.field4267 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field4267 < 12) {
            var2 |= 2;
        }
        if (!this.field4056.method3263("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4056.method3263("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4237 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field4250 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field4242 = var7[0];
        if (this.field4237 < 2 || this.field4250 < 2 || this.field4242 < 2) {
            var2 |= 16;
        }
        this.field4291 = Stream.method3209();
        this.field4056.arePbuffersAvailable();
        this.field4244 = this.field4056.method3263("GL_ARB_vertex_buffer_object");
        this.field4260 = this.field4056.method3263("GL_ARB_multisample");
        this.field4281 = this.field4056.method3263("GL_ARB_vertex_program");
        this.field4056.method3263("GL_ARB_fragment_program");
        this.field4299 = this.field4056.method3263("GL_ARB_vertex_shader");
        this.field4274 = this.field4056.method3263("GL_ARB_fragment_shader");
        this.field4231 = this.field4056.method3263("GL_EXT_texture3D");
        this.field4243 = this.field4056.method3263("GL_ARB_texture_rectangle");
        this.field4245 = this.field4056.method3263("GL_ARB_texture_cube_map");
        this.field4305 = this.field4056.method3263("GL_ARB_texture_float");
        if (arg0 >= -115) {
            this.method1926(-39, (byte[]) null, 60, false, -58);
        }
        this.field4227 = false;
        this.field4336 = this.field4056.method3263("GL_EXT_framebuffer_object");
        this.field4341 = this.field4056.method3263("GL_EXT_framebuffer_blit");
        this.field4288 = this.field4056.method3263("GL_EXT_framebuffer_multisample");
        this.field4254 = this.field4341 & this.field4288;
        OpenGL.glGetFloatv(2834, class435.field5915, 0);
        this.field4334 = class435.field5915[1];
        this.field4248 = class435.field5915[0];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
    public final void method1887(int arg0, int arg1, int arg2) {
        int var4 = -95 % ((arg0 - 8) / 58);
        ++field4022;
        if (~this.field4316 == -1) {
            boolean var5 = false;
            if (this.field4270 != arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var5 = true;
                this.field4270 = arg1;
            }
            if (this.field4251 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field4251 = arg2;
                var5 = true;
            }
            if (var5) {
                this.field4306 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(III)Z")
    public static final boolean method1888(int arg0, int arg1, int arg2) {
        ++field4035;
        if (arg2 != -5347) {
            field4026 = -0.6669863F;
        }
        return ~(262144 & arg0) != -1 | class430.method2513(arg0, -119, arg1) || class105.method578(arg1, true, arg0);
    }

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "()Lm;")
    public final class105 method964() {
        ++field4145;
        return this.field4196;
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(Z)V")
    private final void method1889(boolean arg0) {
        if (this.field4155 != null) {
            Dimension var2 = this.field4155.getSize();
            this.field4074 = var2.height;
            this.field4091 = var2.width;
        } else {
            this.field4091 = this.field4074 = 0;
        }
        ++field4092;
        if (this.field4212 == null) {
            this.field4083 = this.field4091;
            this.field4003 = this.field4074;
            this.method1906(-114);
        }
        this.method1915(-12648);
        this.method962();
        if (arg0) {
            this.method905(115, 44, 39, -96);
        }
    }

    @OriginalMember(owner = "client!uq", name = "CA", descriptor = "()I")
    public final int method954() {
        ++field4133;
        return this.field4246;
    }

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "()Lqf;")
    public final class183 method988() {
        ++field4195;
        int var1 = -1;
        if (this.field4287.indexOf("nvidia") == -1) {
            if (~this.field4287.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (~this.field4287.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class183(var1, "OpenGL", this.field4267, this.field4320, 0L);
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)V")
    public final void method194(int arg0) {
        ++field4015;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "(I)V")
    private final void method1890(int arg0) {
        this.field4056.method3262();
        if (arg0 < -86) {
            ++field4123;
        }
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(Z)V")
    private final void method1891(boolean arg0) {
        if (this.field4311 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field4083 > 0 && this.field4003 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field4083, (double) this.field4003, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4306 &= -25;
            this.field4311 = 1;
        }
        if (arg0) {
            this.field4211 = null;
        }
        ++field4038;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
    private final void method1892(byte arg0) {
        ++field4095;
        if (this.field4240 == 0.0F) {
            this.field4298[10] = this.field4317;
            this.field4298[14] = this.field4232;
        } else {
            float var2 = this.field4283 / (this.field4283 + this.field4240);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field4232 * (1.0F - var2) / this.field4240;
            this.field4298[10] = this.field4317 + var4;
            this.field4298[14] = this.field4232 * var3;
        }
        this.field4330 = (this.field4298[14] + (float) (-this.field4246)) / this.field4298[10];
        this.field4331 = (float) this.field4246 + -this.field4240;
        int var5 = -78 / ((-67 - arg0) / 43);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public final void method907(int arg0) {
        ++field4158;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field4180 = arg0;
            this.field4193.method572((byte) 62);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "()Z")
    public final boolean method917() {
        ++field4141;
        return this.field4194.method2371(3, 0);
    }

    @OriginalMember(owner = "client!uq", name = "Z", descriptor = "(I)V")
    public final void method949(int arg0) {
        ++field4120;
        this.method1905(3042, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "(I)V")
    public final void method1893(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field4284, 0);
        ++field4190;
        if (arg0 != -26006) {
            this.field4346 = null;
        }
        OpenGL.glLightfv(16385, 4611, this.field4228, 0);
    }

    @OriginalMember(owner = "client!uq", name = "la", descriptor = "(FF)V")
    public final void method926(float arg0, float arg1) {
        ++field4183;
        if (this.field4283 != arg0 || this.field4240 != arg1) {
            this.field4240 = arg1;
            this.field4283 = arg0;
            this.method1892((byte) 44);
            if (~this.field4311 != -4) {
                if (this.field4311 == 2) {
                    this.method1919(false);
                    return;
                }
            } else {
                this.method1901(-26);
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class544 method200(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4065;
        return new class376(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V")
    private final void method1894(byte arg0) {
        if (~this.field4300 <= ~this.field4338 && ~this.field4255 >= ~this.field4303) {
            OpenGL.glScissor(this.field4224 - -this.field4338, -this.field4303 + this.field4295 + this.field4003, -this.field4338 + this.field4300, -this.field4255 + this.field4303);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field4089;
        if (arg0 < 78) {
            this.method921(45, 69);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(FIF)V")
    public final void method1895(float arg0, int arg1, float arg2) {
        if (arg1 != 768) {
            this.field4325 = 0.6903569F;
        }
        ++field3993;
        this.field4342 = arg0;
        this.field4230 = arg2;
        if (!this.field4322) {
            this.method1951((byte) -101);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILhba;)V")
    public final void method1896(int arg0, class404 arg1) {
        ++field4163;
        OpenGL.glLoadMatrixf(arg1.method2415(0), arg0);
    }

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "()F")
    public final float method1897() {
        ++field4068;
        return this.field4240;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lrn;)V")
    public final void method927(class307 arg0) {
        ++field4060;
        this.field4339 = (class250) arg0;
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(Z)V")
    public final void method1898(boolean arg0) {
        ++field4039;
        if (~this.field4306 != -3) {
            this.method1891(false);
            this.method1962(-32, false);
            this.method1930((byte) -88, false);
            this.method1950(false, -61);
            this.method1949(false, (byte) 120);
            this.method1960(-2, 2);
            this.field4306 = 2;
        }
        if (!arg0) {
            this.method1963(-26L, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "()V")
    public final void method936() {
        ++field4098;
        if (this.field4273 && ~this.field4083 < -1 && ~this.field4003 < -1) {
            int var1 = this.field4338;
            int var2 = this.field4300;
            int var3 = this.field4255;
            int var4 = this.field4303;
            this.method962();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1915(-12648);
            this.method1962(-32, false);
            this.method1930((byte) -112, false);
            this.method1950(false, 94);
            this.method1949(false, (byte) 120);
            this.method1884((class148) null, -2);
            this.method1960(-2, 2);
            this.method1909(-71, 1);
            this.method1905(3042, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4083, this.field4003, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method977(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lm;)V")
    public final void method956(class105 arg0) {
        this.field4323 = (class404) arg0;
        ++field4047;
        this.field4307.method2416((byte) -112, this.field4323);
        if (~this.field4311 != -2) {
            this.method1931((byte) 69);
        }
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(II)V")
    public static final void method1899(int arg0, int arg1) {
        ++field4010;
        class419.field5730 = arg1;
        class554.field7754 = 2;
        long var2 = 0L;
        if (class207.field2685 != null) {
            class551 var4 = new class551(class183.method1121(false, class606.method3469(class207.field2685, (byte) 102)));
            long var5 = var4.method3072(-24373);
            class551.field7716 = var4.method3072(arg0 ^ -24376);
            class492.method2763("", true, arg0 ^ arg0, class387.method2338((byte) -127, var5));
        } else {
            class372.method2272(35, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(II)I")
    public final int method1900(int arg0, int arg1) {
        ++field4139;
        if (arg1 != 4611) {
            this.field4204 = false;
        }
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && arg0 != 34846 && arg0 != 34844) {
                if (arg0 == 6407) {
                    return 3;
                } else if (arg0 != 6408 && ~arg0 != -34848) {
                    if (arg0 != 34843) {
                        if (arg0 != 34842) {
                            if (arg0 != 6402) {
                                if (~arg0 == -6402) {
                                    return 1;
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
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!uq", name = "D", descriptor = "()V")
    public final void method996() {
        this.method1949(true, (byte) 120);
        ++field4025;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "(I)V")
    private final void method1901(int arg0) {
        ++field4085;
        float var2 = (float) (-this.field4256) * this.field4297 / (float) this.field4335;
        int var3 = 41 / ((arg0 - 36) / 35);
        float var4 = (float) (-this.field4225) * this.field4297 / (float) this.field4318;
        float var5 = (float) (-this.field4256 + this.field4083) * this.field4297 / (float) this.field4335;
        float var6 = (float) (-this.field4225 + this.field4003) * this.field4297 / (float) this.field4318;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var5 && var4 != var6) {
            OpenGL.glOrtho((double) var2, (double) var5, (double) (-var6), (double) (-var4), (double) ((float) this.field4294 - this.field4240), (double) ((float) this.field4246 + -this.field4240));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(B)V")
    private final void method1902(byte arg0) {
        ++field4118;
        if (this.field4286 && this.field4226 >= 0 | this.field4322) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 >= -19) {
            this.field4259 = -69;
        }
    }

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "(IIIII)V")
    public final void method952(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field4048;
        if (arg0 - -arg2 >= this.field4338 && ~(-arg2 + arg0) >= ~this.field4300 && arg1 + arg2 >= this.field4255 && ~this.field4303 <= ~(-arg2 + arg1)) {
            this.method1955(9514);
            this.method1905(3042, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field4248) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field4334) {
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
                if (~var9 < -65) {
                    if (var9 > 512) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class103.method565(32085, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class90.field1217[var11] * (float) arg2 + var6, class90.field1216[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lve;Z)V")
    public final void method1903(class230 arg0, boolean arg1) {
        ++field4110;
        if (this.field4207 >= 0 && this.field4211[this.field4207] == arg0) {
            this.field4211[this.field4207--] = null;
            arg0.method1451(-109);
            if (~this.field4207 <= -1) {
                this.field4212 = this.field4211[this.field4207];
                this.field4212.method1449((byte) -74);
            } else {
                this.field4212 = null;
            }
            if (!arg1) {
                this.method936();
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)Lu;")
    public final class425 method971(int arg0) {
        ++field4126;
        class84 var2 = new class84(arg0);
        this.field4203.method3181(var2, true);
        return var2;
    }

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "(I)V")
    private final void method1904(int arg0) {
        ++field4008;
        this.field4323 = new class404();
        this.field4307 = new class404();
        this.field4262 = new class148[this.field4237];
        this.field4328 = new class495(this, 3553, 6408, 1, 1);
        new class495(this, 3553, 6408, 1, 1);
        new class495(this, 3553, 6408, arg0, 1);
        this.field4247 = new class261(this);
        this.field4223 = new class261(this);
        this.field4319 = new class261(this);
        this.field4276 = new class261(this);
        this.field4249 = new class261(this);
        this.field4239 = new class261(this);
        this.field4269 = new class261(this);
        this.field4309 = new class261(this);
        this.field4304 = new class261(this);
        this.field4290 = new class261(this);
        if (this.field4336) {
            this.field4314 = new class327(this);
            new class327(this);
        }
    }

    @OriginalMember(owner = "client!uq", name = "YA", descriptor = "()I")
    public final int method946() {
        ++field3999;
        int var1 = this.field4344;
        this.field4344 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(II)V")
    public final void method1905(int arg0, int arg1) {
        ++field4088;
        if (this.field4302 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -129) {
                        var3 = true;
                        var4 = true;
                        var5 = 3;
                    } else {
                        var5 = 0;
                        var3 = true;
                        var4 = false;
                    }
                } else {
                    var5 = 2;
                    var3 = true;
                    var4 = false;
                }
            } else {
                var5 = 1;
                var3 = true;
                var4 = true;
            }
            if (!var3 == this.field4301) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field4301 = var3;
            }
            if (!this.field4229 != !var4) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field4229 = var4;
            }
            if (this.field4333 != var5) {
                if (~var5 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var5 != 2) {
                    if (~var5 == -4) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field4333 = var5;
            }
            this.field4302 = arg1;
            this.field4306 &= -29;
        }
        if (arg0 != 3042) {
            this.field4224 = 70;
        }
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "()Z")
    public final boolean method915() {
        ++field4144;
        if (this.field4176 != null) {
            if (!this.field4176.method1658(7)) {
                if (!this.field4187.method2829(this.field4176, -16451)) {
                    return false;
                }
                this.field4193.method572((byte) 62);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "(I)V")
    private final void method1906(int arg0) {
        ++field4140;
        OpenGL.glViewport(this.field4224, this.field4295, this.field4083, this.field4003);
        int var2 = 86 / ((5 - arg0) / 60);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IF)V")
    public final void method1907(int arg0, float arg1) {
        if (this.field4297 != arg1) {
            this.field4297 = arg1;
            if (~this.field4311 == -4) {
                this.method1901(arg0 ^ -122);
            }
        }
        ++field4173;
        if (arg0 != -4) {
            this.field4307 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(FFIF)V")
    private final void method1908(float arg0, float arg1, int arg2, float arg3) {
        ++field4153;
        OpenGL.glMatrixMode(5890);
        if (arg2 < 104) {
            this.method1936((byte) -60);
        }
        if (this.field4279) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg1, arg3);
        OpenGL.glMatrixMode(5888);
        this.field4279 = true;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lu;)V")
    public final void method925(class425 arg0) {
        this.field4202 = ((class84) arg0).field1140;
        ++field4170;
        if (this.field4296 == null) {
            class616 var2 = new class616(80);
            if (this.field4291) {
                var2.method3531(1448476952, -1.0F);
                var2.method3531(1448476952, -1.0F);
                var2.method3531(1448476952, 0.0F);
                var2.method3531(1448476952, 0.0F);
                var2.method3531(1448476952, 1.0F);
                var2.method3531(1448476952, 1.0F);
                var2.method3531(1448476952, -1.0F);
                var2.method3531(1448476952, 0.0F);
                var2.method3531(1448476952, 1.0F);
                var2.method3531(1448476952, 1.0F);
                var2.method3531(1448476952, 1.0F);
                var2.method3531(1448476952, 1.0F);
                var2.method3531(1448476952, 0.0F);
                var2.method3531(1448476952, 1.0F);
                var2.method3531(1448476952, 0.0F);
                var2.method3531(1448476952, -1.0F);
                var2.method3531(1448476952, 1.0F);
                var2.method3531(1448476952, 0.0F);
                var2.method3531(1448476952, 0.0F);
                var2.method3531(1448476952, 0.0F);
            } else {
                var2.method3529(-1.0F, -109);
                var2.method3529(-1.0F, -125);
                var2.method3529(0.0F, -71);
                var2.method3529(0.0F, -106);
                var2.method3529(1.0F, -45);
                var2.method3529(1.0F, -52);
                var2.method3529(-1.0F, -87);
                var2.method3529(0.0F, -75);
                var2.method3529(1.0F, -80);
                var2.method3529(1.0F, -76);
                var2.method3529(1.0F, -118);
                var2.method3529(1.0F, -124);
                var2.method3529(0.0F, -66);
                var2.method3529(1.0F, -68);
                var2.method3529(0.0F, -71);
                var2.method3529(-1.0F, -58);
                var2.method3529(1.0F, -63);
                var2.method3529(0.0F, -32);
                var2.method3529(0.0F, -42);
                var2.method3529(0.0F, -125);
            }
            this.field4296 = this.method1926(8771, var2.field7693, 20, false, var2.field7707);
            this.field4257 = new class86(this.field4296, 5126, 3, 0);
            this.field4340 = new class86(this.field4296, 5126, 2, 12);
            this.field4192.method497(this, 5121);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class116 method969(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4134;
        return new class292(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "()Z")
    public final boolean method990() {
        ++field3996;
        return this.field4260 && (!this.method912() || this.field4254);
    }

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(II)V")
    public final void method1909(int arg0, int arg1) {
        if (arg0 >= -59) {
            this.field4196 = null;
        }
        if (arg1 == 1) {
            this.method1887(-69, 7681, 7681);
        } else if (~arg1 != -1) {
            if (arg1 == 2) {
                this.method1887(97, 34165, 7681);
            } else if (arg1 != 3) {
                if (arg1 == 4) {
                    this.method1887(101, 34023, 34023);
                }
            } else {
                this.method1887(70, 260, 8448);
            }
        } else {
            this.method1887(-88, 8448, 8448);
        }
        ++field4041;
    }

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "(I)V")
    private final void method1910(int arg0) {
        ++field4090;
        int var2 = 0;
        if (arg0 != -3677) {
            this.method1915(62);
        }
        while (~var2 > ~this.field4292) {
            class592 var3 = this.field4313[var2];
            class83.field1135[0] = (float) var3.method3414(232);
            int var4 = var2 + 16386;
            class83.field1135[1] = (float) var3.method3416(-2);
            class83.field1135[2] = (float) var3.method3415((byte) 117);
            class83.field1135[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class83.field1135, 0);
            int var5 = var3.method3419(104);
            float var6 = var3.method3422(arg0 ^ -3590) / 255.0F;
            class83.field1135[2] = (float) class143.method783(255, var5) * var6;
            class83.field1135[1] = var6 * (float) (class143.method783(var5, 65436) >> 8);
            class83.field1135[0] = (float) class143.method783(var5 >> 16, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class83.field1135, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3420(true) * var3.method3420(true)));
            OpenGL.glEnable(var4);
            ++var2;
        }
        while (~this.field4271 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field4271 = this.field4292;
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(B)V")
    private final void method1911(byte arg0) {
        ++field4109;
        if (arg0 != -81) {
            this.method1939((byte) -54);
        }
        int var2 = 0;
        while (!this.field4056.method3264()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class353.method2204(1000L, 7806);
        }
    }

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "()Z")
    public final boolean method966() {
        ++field4073;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIZ)V")
    public final synchronized void method1912(int arg0, int arg1, boolean arg2) {
        ++field4071;
        if (arg2) {
            this.field4314 = null;
        }
        class147 var4 = new class147(arg0);
        var4.field1401 = (long) arg1;
        this.field4218.method3181(var4, true);
    }

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "()V")
    public final void method978() {
        ++field4080;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(FFF)V")
    public final void method989(float arg0, float arg1, float arg2) {
        class109.field1408 = arg0;
        class17.field183 = arg1;
        field4026 = arg2;
        ++field3994;
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(IIIIII)V")
    public final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4103;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1955(9514);
        float var10 = (float) arg3 + var8;
        this.method1905(3042, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4260) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4260) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBZ)V")
    public final void method1913(int arg0, byte arg1, boolean arg2) {
        if (arg1 > -45) {
            this.field4253 = false;
        }
        this.method1922(arg0, arg2, 2, true);
        ++field4114;
    }

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(Z)V")
    public final void method1914(boolean arg0) {
        if (arg0) {
            this.field4202 = null;
        }
        ++field4182;
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4049;
        this.method1955(9514);
        this.method1905(3042, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "(ILpa;II)V")
    public final void method930(int arg0, class594 arg1, int arg2, int arg3) {
        ++field4168;
        class54 var5 = (class54) arg1;
        class600 var6 = var5.field727;
        this.method1898(true);
        this.method1884(var5.field727, -2);
        this.method1905(3042, 1);
        this.method1887(-106, 7681, 8448);
        this.method1933(-77, 768, 0, 34167);
        float var7 = var6.field8676 / (float) var6.field8672;
        float var8 = var6.field8671 / (float) var6.field8669;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4338) * var7, (float) (this.field4255 - arg3) * var8);
        OpenGL.glVertex2i(this.field4338, this.field4255);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4338) * var7, (float) (this.field4303 - arg3) * var8);
        OpenGL.glVertex2i(this.field4338, this.field4303);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4300) * var7, (float) (-arg3 + this.field4303) * var8);
        OpenGL.glVertex2i(this.field4300, this.field4303);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4300) * var7, (float) (-arg3 + this.field4255) * var8);
        OpenGL.glVertex2i(this.field4300, this.field4255);
        OpenGL.glEnd();
        this.method1933(-106, 768, 0, 5890);
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(IIIII)V")
    public final void method979(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4148;
        this.method1955(9514);
        this.method1905(3042, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIII)V")
    public final void method959(int arg0, int arg1, int arg2, int arg3) {
        this.field4187.method2823((byte) -10, arg0, arg1, arg3, arg2);
        ++field4069;
    }

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "(I)V")
    public final void method1915(int arg0) {
        if (arg0 == -12648) {
            ++field4005;
            if (this.field4311 != 0) {
                this.field4311 = 0;
                this.field4306 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "(II)V")
    public final synchronized void method1916(int arg0, int arg1) {
        ++field4101;
        class108 var3 = new class108();
        var3.field1401 = (long) arg1;
        this.field4221.method3181(var3, true);
        if (arg0 != 29252) {
            this.field4233 = -0.5479921F;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLve;)V")
    public final void method1917(byte arg0, class230 arg1) {
        ++field4072;
        if (this.field4341) {
            this.method1968((byte) 109, arg1);
            this.method1903(arg1, true);
        } else {
            if (this.field4206 < 0 || this.field4205[this.field4206] != arg1) {
                throw new RuntimeException();
            }
            this.field4205[this.field4206--] = null;
            arg1.method1453((byte) 107);
            if (~this.field4206 <= -1) {
                this.field4209 = this.field4212 = this.field4205[this.field4206];
                this.field4209.method1452(false);
            } else {
                this.field4209 = this.field4212 = null;
            }
        }
        int var3 = -89 / ((arg0 - -35) / 62);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lve;I)V")
    public final void method1918(class230 arg0, int arg1) {
        if (arg1 <= 115) {
            this.field4343 = null;
        }
        ++field4156;
        if (this.field4341) {
            this.method1937((byte) 24, arg0);
            this.method1957(arg0, -35);
        } else if (this.field4206 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field4206 >= 0) {
                this.field4205[this.field4206].method1453((byte) 95);
            }
            this.field4209 = this.field4212 = this.field4205[++this.field4206] = arg0;
            this.field4209.method1452(false);
        }
    }

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "(Z)V")
    private final void method1919(boolean arg0) {
        OpenGL.glMatrixMode(5889);
        ++field4094;
        if (arg0) {
            this.method1903((class230) null, false);
        }
        OpenGL.glLoadMatrixf(this.field4298, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIII)V")
    public final void method961(int arg0, int arg1, int arg2, int arg3) {
        this.field4335 = arg2;
        ++field4178;
        this.field4318 = arg3;
        this.field4225 = arg1;
        this.field4256 = arg0;
        this.method1959(-18492);
        this.method1953(-18608);
        if (this.field4311 != 3) {
            if (~this.field4311 == -3) {
                this.method1919(false);
                return;
            }
        } else {
            this.method1901(-23);
        }
    }

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "(II)I")
    public final int method1920(int arg0, int arg1) {
        ++field4189;
        if (arg0 != 1) {
            if (arg0 != 0) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            return 34023;
                        } else {
                            int var3 = -55 / ((arg1 - 26) / 39);
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

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(FFFFI)V")
    public final void method1921(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class435.field5915[2] = arg3;
        class435.field5915[3] = arg2;
        class435.field5915[0] = arg0;
        class435.field5915[1] = arg1;
        if (arg4 != 61) {
            this.method1941(44, -79);
        }
        ++field4029;
        OpenGL.glTexEnvfv(8960, 8705, class435.field5915, 0);
    }

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "()Lm;")
    public final class105 method987() {
        ++field4078;
        return new class404();
    }

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "()V")
    public final void method994() {
        if (this.field4176 != null && this.field4176.method1658(7)) {
            this.field4187.method2826(-39, this.field4176);
            this.field4193.method572((byte) 62);
        }
        ++field4146;
    }

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "()Z")
    public final boolean method944() {
        ++field4105;
        return this.field4176 != null && (this.field4188 <= 1 || this.field4254);
    }

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "(III)V")
    public final void method923(int arg0, int arg1, int arg2) {
        ++field4121;
        if (this.field4236 != arg0 || ~this.field4226 != ~arg1 || ~this.field4275 != ~arg2) {
            this.field4236 = arg0;
            this.field4226 = arg1;
            this.field4275 = arg2;
            if (this.field4322) {
                return;
            }
            this.method1951((byte) 73);
            this.method1902((byte) -61);
        }
    }

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "(IIII)V")
    public final void method977(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (this.field4083 < arg2) {
            arg2 = this.field4083;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        ++field3995;
        if (arg3 > this.field4003) {
            arg3 = this.field4003;
        }
        this.field4303 = arg3;
        this.field4300 = arg2;
        this.field4338 = arg0;
        this.field4255 = arg1;
        OpenGL.glEnable(3089);
        this.method1953(-18608);
        this.method1894((byte) 111);
    }

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "()Z")
    public final boolean method960() {
        ++field4066;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)V")
    public final synchronized void method932(int arg0) {
        ++field4096;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4217.method3179(true)) {
            class147 var12 = (class147) this.field4217.method3184(-5295);
            class119.field1498[var3++] = (int) var12.field1401;
            this.field4216 -= var12.field1902;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class119.field1498, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class119.field1498, 0);
            var3 = 0;
        }
        while (!this.field4218.method3179(true)) {
            class147 var11 = (class147) this.field4218.method3184(-5295);
            class119.field1498[var3++] = (int) var11.field1401;
            this.field4214 -= var11.field1902;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class119.field1498, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class119.field1498, 0);
            var3 = 0;
        }
        while (!this.field4219.method3179(true)) {
            class147 var10 = (class147) this.field4219.method3184(-5295);
            class119.field1498[var3++] = var10.field1902;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class119.field1498, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class119.field1498, 0);
            var3 = 0;
        }
        while (!this.field4220.method3179(true)) {
            class147 var9 = (class147) this.field4220.method3184(-5295);
            class119.field1498[var3++] = (int) var9.field1401;
            this.field4213 -= var9.field1902;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class119.field1498, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class119.field1498, 0);
            boolean var4 = false;
        }
        while (!this.field4215.method3179(true)) {
            class147 var8 = (class147) this.field4215.method3184(-5295);
            OpenGL.glDeleteLists((int) var8.field1401, var8.field1902);
        }
        while (!this.field4221.method3179(true)) {
            class108 var7 = this.field4221.method3184(-5295);
            OpenGL.glDeleteProgramARB((int) var7.field1401);
        }
        while (!this.field4222.method3179(true)) {
            class108 var6 = this.field4222.method3184(-5295);
            OpenGL.glDeleteObjectARB(var6.field1401);
        }
        while (!this.field4215.method3179(true)) {
            class147 var5 = (class147) this.field4215.method3184(-5295);
            OpenGL.glDeleteLists((int) var5.field1401, var5.field1902);
        }
        this.field4193.method570((byte) -128);
        if (~this.method965() < -100663297 && ~(this.field4241 + 60000L) > ~class348.method2175(-126)) {
            System.gc();
            this.field4241 = class348.method2175(-120);
        }
        this.field4198 = var2;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZIZ)V")
    public final void method1922(int arg0, boolean arg1, int arg2, boolean arg3) {
        ++field4093;
        if (~this.field4293 != ~arg0) {
            if (~arg0 > -1) {
                this.method1936((byte) -101);
                this.method1884((class148) null, -2);
                this.method1909(-92, 0);
                if (!this.field4322) {
                    this.field4194.method2373(arg3, (byte) -119, arg1, 0, 0, 0);
                }
            } else {
                class495 var5 = this.field4193.method571(6408, arg0);
                class41 var6 = super.field2114.method2151(true, arg0);
                if (var6.field601 == 0 && ~var6.field617 == -1) {
                    this.method1936((byte) -127);
                } else {
                    int var7 = !var6.field613 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method1908((float) (this.field4198 % var8 * var6.field601) / (float) var8, (float) (this.field4198 % var8 * var6.field617) / (float) var8, 112, 0.0F);
                }
                if (this.field4322) {
                    this.method1884(var5, -2);
                    this.method1909(-69, var6.field605);
                } else {
                    this.field4194.method2373(arg3, (byte) -119, arg1, var6.field602, var6.field620, var6.field618);
                    if (!this.field4194.method2372((byte) -40, var6.field605, var5)) {
                        this.method1884(var5, -2);
                        this.method1909(-103, var6.field605);
                    }
                }
            }
            this.field4293 = arg0;
        }
        this.field4306 &= -8;
        if (arg2 != 2) {
            this.method1960(-102, 93);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIILnu;I)V")
    public final void method1923(int arg0, int arg1, int arg2, class326 arg3, int arg4) {
        ++field4031;
        int var6 = arg3.method172(10903);
        int var7 = arg4 * this.method1928((byte) 119, var6);
        int var8 = -59 % ((29 - arg1) / 57);
        this.method1948(arg3, true);
        OpenGL.glDrawElements(arg2, arg0, var6, arg3.method169(21445) - -((long) var7));
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lcd;ILcd;Lcd;Lcd;)V")
    public final void method1924(class86 arg0, int arg1, class86 arg2, class86 arg3, class86 arg4) {
        ++field4184;
        if (arg1 != 0) {
            this.method1886(78);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1927(false, arg2.field1159);
            OpenGL.glVertexPointer(arg2.field1160, arg2.field1158, this.field4332.method865(17124), this.field4332.method867(arg1 + 6271) - -((long) arg2.field1157));
            OpenGL.glEnableClientState(32884);
        }
        if (arg3 != null) {
            this.method1927(false, arg3.field1159);
            OpenGL.glNormalPointer(arg3.field1158, this.field4332.method865(arg1 + 17124), this.field4332.method867(6271) - -((long) arg3.field1157));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg4 != null) {
            this.method1927(false, arg4.field1159);
            OpenGL.glColorPointer(arg4.field1160, arg4.field1158, this.field4332.method865(arg1 + 17124), this.field4332.method867(6271) - -((long) arg4.field1157));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method1927(false, arg0.field1159);
            OpenGL.glTexCoordPointer(arg0.field1160, arg0.field1158, this.field4332.method865(arg1 ^ 17124), this.field4332.method867(6271) - -((long) arg0.field1157));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!uq", name = "ta", descriptor = "(II)V")
    public final void method940(int arg0, int arg1) {
        if (this.field4294 != arg0 || this.field4246 != arg1) {
            this.field4246 = arg1;
            this.field4294 = arg0;
            this.method1959(-18492);
            this.method1951((byte) 119);
            if (~this.field4311 == -4) {
                this.method1901(-48);
            } else if (this.field4311 == 2) {
                this.method1919(false);
            }
        }
        ++field4004;
    }

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "(Z)V")
    public final void method1925(boolean arg0) {
        ++field4115;
        if (this.field4306 != 8) {
            this.method1939((byte) -126);
            this.method1962(-32, true);
            this.method1950(true, 71);
            this.method1949(true, (byte) 120);
            this.method1905(3042, 1);
            this.field4306 = 8;
        }
        if (arg0) {
            this.field4227 = true;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[BIZI)Lee;")
    public final class159 method1926(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        ++field4063;
        if (!this.field4244 || arg3 && !this.field4327) {
            if (arg0 != 8771) {
                this.field4281 = false;
            }
            return new class634(this, arg2, arg1, arg4);
        } else {
            return new class162(this, arg2, arg1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lww;)V")
    public final void method972(int arg0, class592[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field4313[var3] = arg1[var3];
        }
        ++field4137;
        this.field4292 = arg0;
        if (this.field4311 != 1) {
            this.method1910(-3677);
        }
    }

    @OriginalMember(owner = "client!uq", name = "UA", descriptor = "(IIIII)V")
    public final void method943(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4186;
        this.method1955(9514);
        this.method1905(3042, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLee;)V")
    public final void method1927(boolean arg0, class159 arg1) {
        if (arg0) {
            this.field4288 = true;
        }
        ++field4116;
        if (this.field4332 != arg1) {
            if (this.field4244) {
                OpenGL.glBindBufferARB(34962, arg1.method868((byte) 107));
            }
            this.field4332 = arg1;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)I")
    public final int method1928(byte arg0, int arg1) {
        ++field4009;
        if (arg1 != 5121 && ~arg1 != -5121) {
            if (arg0 != 119) {
                this.method1949(true, (byte) 9);
            }
            if (arg1 != 5123 && ~arg1 != -5123) {
                if (arg1 != 5125 && arg1 != 5124 && ~arg1 != -5127) {
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

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(Z)V")
    public final void method984(boolean arg0) {
        ++field4040;
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "([I)V")
    public final void method980(int[] arg0) {
        arg0[3] = this.field4303;
        arg0[2] = this.field4300;
        arg0[0] = this.field4338;
        ++field4175;
        arg0[1] = this.field4255;
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(B)Lsk;")
    public final class415 method1929(byte arg0) {
        ++field4112;
        if (arg0 != -43) {
            this.field4288 = true;
        }
        return this.field4339 == null ? null : this.field4339.method1414(1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public final void method968(boolean arg0) {
        ++field4044;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BZ)V")
    public final void method1930(byte arg0, boolean arg1) {
        if (arg0 < -61) {
            if (arg1 == !this.field4258) {
                this.field4258 = arg1;
                this.method1943(false);
                this.field4306 &= -8;
            }
            ++field4027;
        }
    }

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(B)V")
    private final void method1931(byte arg0) {
        int var2 = -11 % ((arg0 - -25) / 32);
        ++field4045;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field4323.method2415(0), 0);
        if (this.field4322) {
            this.field4194.field5467.method2531(-128);
        }
        this.method1893(-26006);
        this.method1910(-3677);
    }

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "(B)V")
    private final void method1932(byte arg0) {
        ++field4016;
        this.method1960(-2, 2);
        for (int var2 = this.field4237 + -1; var2 >= 0; --var2) {
            this.method1966(3000, var2);
            this.method1884((class148) null, -2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1887(-115, 8448, 8448);
        this.method1933(-97, 770, 2, 34168);
        this.method1936((byte) -104);
        this.field4302 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4333 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4229 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4301 = true;
        this.method1962(-32, true);
        this.method1930((byte) -82, true);
        this.method1950(true, -79);
        this.method1949(true, (byte) 120);
        this.method1915(-12648);
        this.field4056.setSwapInterval(0);
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
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        if (arg0 > -119) {
            this.field4277 = null;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field4280 = this.field4236 = -1;
        this.method962();
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "()Z")
    public final boolean method912() {
        ++field4058;
        return this.field4176 != null && this.field4176.method1658(7);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method918(Canvas arg0) {
        ++field4127;
        if (this.field4084 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4162.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field4056.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field4162.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(IIII)V")
    public final void method1933(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34176 - -arg2, arg3);
        ++field4024;
        OpenGL.glTexEnvi(8960, 34192 - -arg2, arg1);
        if (arg0 > -68) {
            this.method1932((byte) -95);
        }
    }

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "()V")
    public final void method962() {
        this.field4338 = 0;
        this.field4303 = this.field4003;
        this.field4300 = this.field4083;
        ++field4054;
        this.field4255 = 0;
        OpenGL.glDisable(3089);
        this.method1953(-18608);
    }

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "(I)V")
    private final void method1934(int arg0) {
        if (arg0 != 3) {
            this.field4306 = -127;
        }
        OpenGL.glDepthMask(this.field4329 && this.field4265);
        ++field4014;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z[BIZI)Lnu;")
    public final class326 method1935(boolean arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        ++field4028;
        if (arg0) {
            this.method1930((byte) -6, true);
        }
        return (class326) (!this.field4244 || arg3 && !this.field4327 ? new class29(this, arg4, arg1, arg2) : new class370(this, arg4, arg1, arg2, arg3));
    }

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "(B)V")
    private final void method1936(byte arg0) {
        ++field4150;
        int var2 = 77 / ((62 - arg0) / 62);
        if (this.field4279) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4279 = false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I")
    public final int method921(int arg0, int arg1) {
        ++field4161;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;I)V")
    public class313(Canvas arg0, class473 arg1, int arg2) {
        super(arg1);
        new class358();
        new class607(16);
        this.field4215 = new class568();
        this.field4217 = new class568();
        this.field4218 = new class568();
        this.field4219 = new class568();
        this.field4220 = new class568();
        this.field4221 = new class568();
        this.field4222 = new class568();
        this.field4224 = 0;
        this.field4225 = 0;
        this.field4230 = 0.0F;
        this.field4226 = -1;
        this.field4248 = -1.0F;
        this.field4236 = -1;
        this.field4252 = 1.0F;
        this.field4235 = 1.0F;
        this.field4251 = 8448;
        this.field4278 = -1;
        this.field4246 = 3584;
        this.field4255 = 0;
        this.field4268 = -1;
        this.field4228 = new float[4];
        this.field4265 = true;
        this.field4256 = 0;
        this.field4300 = 0;
        this.field4297 = 1.0F;
        this.field4303 = 0;
        this.field4270 = 8448;
        this.field4283 = 3000.0F;
        this.field4298 = new float[16];
        this.field4261 = new float[4];
        this.field4313 = new class592[class317.field4376];
        this.field4294 = 50;
        this.field4295 = 0;
        this.field4315 = 0;
        this.field4308 = new float[4];
        this.field4326 = -1.0F;
        this.field4312 = 1.0F;
        this.field4275 = 0;
        this.field4335 = 512;
        this.field4280 = -1;
        this.field4318 = 512;
        this.field4334 = -1.0F;
        this.field4330 = 3584.0F;
        this.field4337 = -1.0F;
        this.field4338 = 0;
        this.field4331 = 3584.0F;
        this.field4284 = new float[4];
        this.field4342 = 1.0F;
        this.field4285 = new class616(8192);
        this.field4343 = new int[1];
        this.field4346 = new int[1];
        this.field4347 = new int[1];
        this.field4348 = new byte[16384];
        this.field4155 = this.field4084 = arg0;
        this.field4188 = arg2;
        if (!class558.method3140("jaclib", (byte) -46)) {
            throw new RuntimeException("");
        } else if (!class558.method3140("jaggl", (byte) -46)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field4056 = new OpenGL();
                this.field4042 = this.field4001 = this.field4056.init(arg0, 8, 8, 8, 24, 0, this.field4188);
                if (~this.field4001 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1911((byte) -81);
                    int var4 = this.method1886(-125);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field4234 = this.field4291 ? 33639 : 5121;
                        if (this.field4320.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class455.method2637(' ', (byte) 109, this.field4320.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class111.method601(false, var10.substring(1, 3))) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (var10.length() >= 4 && class111.method601(false, var10.substring(0, 4))) {
                                                var5 = class254.method1532(var10.substring(0, 4), 2);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field4305 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 9250) {
                                    this.field4231 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field4244 = false;
                                }
                            }
                            this.field4243 &= this.field4056.method3263("GL_ARB_half_float_pixel");
                            this.field4327 = this.field4244;
                            this.field4253 = true;
                        }
                        if (this.field4287.indexOf("intel") != -1) {
                            this.field4336 = false;
                        }
                        this.field4273 = !this.field4287.equals("s3 graphics");
                        if (this.field4244) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class367.method2250((byte) 94, true, false);
                        this.field4204 = true;
                        this.field4193 = new class103(this, super.field2114);
                        this.method1904(1);
                        this.field4199 = new class408(this);
                        this.field4187 = new class505(this);
                        if (this.field4187.method2830(0)) {
                            this.field4176 = new class468(this);
                            if (!this.field4176.method2683((byte) 96)) {
                                this.field4176.method1655(11857);
                                this.field4176 = null;
                            }
                        }
                        this.field4194 = new class396(this);
                        this.method1932((byte) -124);
                        this.method1889(false);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field4056.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (var12++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class353.method2204(100L, 7806);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method945();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(BLve;)V")
    public final void method1937(byte arg0, class230 arg1) {
        ++field4053;
        if (this.field4208 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field4208 >= 0) {
                this.field4210[this.field4208].method1450((byte) -33);
            }
            int var3 = -103 % ((-54 - arg0) / 60);
            this.field4209 = this.field4210[++this.field4208] = arg1;
            this.field4209.method1448((byte) 92);
        }
    }

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "()Z")
    public final boolean method195() {
        ++field4075;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(III)V")
    public final void method1938(int arg0, int arg1, int arg2) {
        this.field4295 = arg0;
        if (arg2 == -30919) {
            ++field4149;
            this.field4224 = arg1;
            this.method1906(-102);
            this.method1894((byte) 127);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method201(Canvas arg0) {
        this.field4155 = null;
        this.field4042 = 0L;
        ++field4043;
        if (arg0 != null && this.field4084 != arg0) {
            if (this.field4162.containsKey(arg0)) {
                Long var2 = (Long) this.field4162.get(arg0);
                this.field4042 = var2;
                this.field4155 = arg0;
            }
        } else {
            this.field4155 = this.field4084;
            this.field4042 = this.field4001;
        }
        if (this.field4155 != null && ~this.field4042 != -1L) {
            this.field4056.setSurface(this.field4042);
            this.method1889(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uq", name = "xa", descriptor = "()V")
    public final void method933() {
        ++field4104;
        this.field4322 = false;
        this.field4194.method2373(false, (byte) -119, false, 0, 0, 0);
        this.method1951((byte) 95);
        this.method1902((byte) -64);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public final void method203(int arg0) {
        this.method1890(-119);
        ++field4033;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lkw;)V")
    public final void method957(class174 arg0) {
        ++field4067;
        this.field4192.method498(arg0, -1, this);
    }

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "()Z")
    public final boolean method970() {
        ++field4160;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "(IIII)V")
    public final void method905(int arg0, int arg1, int arg2, int arg3) {
        this.field4315 = arg3;
        ++field4159;
        this.field4322 = true;
        this.field4278 = arg2;
        this.field4282 = arg0;
        this.field4268 = arg1;
        this.field4194.method2373(false, (byte) -119, false, 0, 3, 0);
        this.field4194.field5467.method2531(-124);
        this.method1951((byte) 34);
        this.method1902((byte) -27);
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "()I")
    public final int method914() {
        ++field4113;
        return 4;
    }

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "()Z")
    public final boolean method924() {
        ++field4082;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "IA", descriptor = "(III[I)V")
    public final void method991(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4051;
        float var5 = (float) arg2 * this.field4323.field5521 + (float) arg0 * this.field4323.field5533 + (float) arg1 * this.field4323.field5538 + this.field4323.field5546;
        if (!(var5 < (float) this.field4294) && !((float) this.field4246 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4323.field5556 + (float) arg0 * this.field4323.field5540 + (float) arg1 * this.field4323.field5526 + this.field4323.field5529) * (float) this.field4335 / var5);
            int var7 = (int) (((float) arg2 * this.field4323.field5537 + (float) arg0 * this.field4323.field5548 + (float) arg1 * this.field4323.field5536 + this.field4323.field5544) * (float) this.field4318 / var5);
            if ((float) var6 >= this.field4325 && this.field4310 >= (float) var6 && this.field4233 <= (float) var7 && this.field4324 >= (float) var7) {
                arg3[1] = (int) ((float) var7 - this.field4233);
                arg3[0] = (int) ((float) var6 - this.field4325);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "(B)V")
    private final void method1939(byte arg0) {
        if (~this.field4311 != -3) {
            this.field4311 = 2;
            this.method1919(false);
            this.method1931((byte) 98);
            this.field4306 &= -8;
        }
        ++field4055;
        if (arg0 != -126) {
            this.method198(41);
        }
    }

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "()Z")
    public final boolean method963() {
        ++field4100;
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIB)V")
    public final synchronized void method1940(int arg0, int arg1, byte arg2) {
        ++field4023;
        class147 var4 = new class147(arg1);
        var4.field1401 = (long) arg0;
        this.field4220.method3181(var4, true);
        int var5 = 31 / ((arg2 - -22) / 32);
    }

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "(II)V")
    public final synchronized void method1941(int arg0, int arg1) {
        ++field4122;
        if (arg1 != 16711680) {
            this.field4343 = null;
        }
        class147 var3 = new class147(arg0);
        this.field4219.method3181(var3, true);
    }

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "(I)V")
    public final void method1942(int arg0) {
        if (arg0 <= 59) {
            this.method910(11, -40, 46, -105, 102, -77, (byte[]) null, -109, -121);
        }
        ++field4086;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "(Z)V")
    private final void method1943(boolean arg0) {
        if (this.field4258 && !this.field4263) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field4135;
        if (arg0) {
            this.field4219 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "U", descriptor = "()I")
    public final int method965() {
        ++field3998;
        return this.field4216 + this.field4214 + this.field4213;
    }

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "(I)V")
    private final void method1944(int arg0) {
        class435.field5915[3] = 1.0F;
        ++field4179;
        class435.field5915[2] = this.field4337 * this.field4252;
        class435.field5915[1] = this.field4337 * this.field4235;
        class435.field5915[0] = this.field4337 * this.field4312;
        OpenGL.glLightfv(16384, 4609, class435.field5915, 0);
        class435.field5915[0] = -this.field4326 * this.field4312;
        class435.field5915[2] = -this.field4326 * this.field4252;
        class435.field5915[3] = 1.0F;
        class435.field5915[arg0] = -this.field4326 * this.field4235;
        OpenGL.glLightfv(16385, 4609, class435.field5915, 0);
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(III)V")
    public final synchronized void method1945(int arg0, int arg1, int arg2) {
        ++field4171;
        if (arg2 < 68) {
            this.method1884((class148) null, -56);
        }
        class147 var4 = new class147(arg1);
        var4.field1401 = (long) arg0;
        this.field4217.method3181(var4, true);
    }

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "()F")
    public final float method1946() {
        ++field4036;
        return this.field4283;
    }

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "(F)V")
    public final void method993(float arg0) {
        if (this.field4264 != arg0) {
            this.field4264 = arg0;
            this.method1956((byte) 122);
        }
        ++field4154;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lpe;[Lig;Z)Lra;")
    public final class262 method982(class157 arg0, class295[] arg1, boolean arg2) {
        ++field4128;
        return new class219(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(IIII)V")
    public final void method1947(int arg0, int arg1, int arg2, int arg3) {
        ++field4147;
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg1);
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg3);
        if (arg0 != 34162) {
            this.field4225 = -74;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lnu;Z)V")
    public final void method1948(class326 arg0, boolean arg1) {
        if (arg1) {
            if (this.field4277 != arg0) {
                if (this.field4244) {
                    OpenGL.glBindBufferARB(34963, arg0.method171(true));
                }
                this.field4277 = arg0;
            }
            ++field4064;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZB)V")
    public final void method1949(boolean arg0, byte arg1) {
        if (!arg0 == this.field4329) {
            this.field4329 = arg0;
            this.method1934(arg1 ^ 123);
            this.field4306 &= -32;
        }
        if (arg1 != 120) {
            this.field4197 = null;
        }
        ++field4062;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lfp;IIII)Lr;")
    public final class521 method197(class528 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4034;
        return new class261(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)V")
    public final void method1950(boolean arg0, int arg1) {
        if (this.field4238 != arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field4306 &= -32;
            this.field4238 = arg0;
        }
        ++field4013;
        int var3 = 111 % ((2 - arg1) / 55);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "()V")
    public final void method911() {
        ++field4059;
        this.field4187.method2824((byte) 87);
    }

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "(I)V")
    public final void method973(int arg0) {
        this.field4201 = 0;
        ++field4130;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field4201;
        }
        this.field4200 = 1 << this.field4201;
    }

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "(B)V")
    private final void method1951(byte arg0) {
        ++field4000;
        int var2 = -120 % ((-19 - arg0) / 46);
        int var3;
        if (this.field4322) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var3 = this.field4268;
        } else {
            this.field4272 = (float) (-this.field4275 + this.field4246) + -this.field4230;
            this.field4289 = -((float) this.field4226 * this.field4342) + this.field4272;
            if (this.field4289 < (float) this.field4294) {
                this.field4289 = (float) this.field4294;
            }
            OpenGL.glFogf(2915, this.field4289);
            OpenGL.glFogf(2916, this.field4272);
            var3 = this.field4236;
        }
        class435.field5915[0] = (float) class143.method783(var3, 16711680) / 1.671168E7F;
        class435.field5915[1] = (float) class143.method783(var3, 65280) / 65280.0F;
        class435.field5915[2] = (float) class143.method783(var3, 255) / 255.0F;
        OpenGL.glFogfv(2918, class435.field5915, 0);
        if (this.field4322) {
            this.field4194.field5467.method2532(-768);
        }
    }

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "()V")
    public final void method945() {
        ++field4097;
        for (class108 var1 = this.field4203.method3188((byte) -100); var1 != null; var1 = this.field4203.method3182((byte) -63)) {
            ((class84) var1).method476((byte) -99);
        }
        if (this.field4187 != null) {
            this.field4187.method2821(-30821);
        }
        if (this.field4056 != null) {
            this.method1890(-122);
            Enumeration var2 = this.field4162.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4162.get(var3);
                this.field4056.releaseSurface(var3, var4);
            }
            this.field4056.release();
            this.field4056 = null;
        }
        if (this.field4204) {
            class111.method597(false, false, true);
            this.field4204 = false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class594 method985(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4129;
        return class293.method1797(this, arg2, -97, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lr;Lkw;Lm;[Leca;I)V")
    public final void method193(class521[] arg0, class174 arg1, class105 arg2, class378[] arg3, int arg4) {
        ++field4164;
        this.method202(arg0, arg2, arg3, arg4);
        this.method957(arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lr;Lm;[Leca;I)V")
    public final void method202(class521[] arg0, class105 arg1, class378[] arg2, int arg3) {
        ++field4102;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1595(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "()V")
    public final void method948() {
        ++field4019;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([IIIII)Lha;")
    public final class116 method976(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4050;
        return new class292(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "(B)V")
    public final void method1952(byte arg0) {
        ++field4111;
        if (arg0 != -123) {
            this.method948();
        }
        if (~this.field4306 != -17) {
            this.method1967(115);
            this.method1962(-32, true);
            this.method1950(true, arg0 ^ -40);
            this.method1949(true, (byte) 120);
            this.method1905(3042, 1);
            this.field4306 = 16;
        }
    }

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "(I)V")
    private final void method1953(int arg0) {
        this.field4310 = (float) (this.field4300 - this.field4256);
        this.field4233 = (float) (-this.field4225 + this.field4255);
        ++field4061;
        if (arg0 != -18608) {
            this.field4042 = 68L;
        }
        this.field4324 = (float) (this.field4303 - this.field4225);
        this.field4325 = (float) (this.field4338 - this.field4256);
    }

    @OriginalMember(owner = "client!uq", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4006;
        float var10;
        float var11;
        if (this.field4266 != null && ~arg2 >= ~this.field4266.field6902 && this.field4266.field6904 >= arg3) {
            this.field4266.method2782(false, arg3, (byte) -105, arg6, 0, 0, 0, 6406, arg2, 0);
            var10 = (float) arg2 * this.field4266.field8676 / (float) this.field4266.field6902;
            var11 = (float) arg3 * this.field4266.field8671 / (float) this.field4266.field6904;
        } else {
            this.field4266 = class429.method2508(6406, arg6, arg3, this, 3553, arg2, false, 6406);
            this.field4266.method2776(-28, false, false);
            var10 = this.field4266.field8676;
            var11 = this.field4266.field8671;
        }
        this.method1898(true);
        this.method1884(this.field4266, -2);
        this.method1905(3042, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1885(arg5, -87);
        this.method1887(-106, 34165, 34165);
        this.method1933(-86, 768, 0, 34166);
        this.method1933(-126, 770, 2, 5890);
        this.method1947(34162, 34166, 0, 770);
        this.method1947(34162, 5890, 2, 770);
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
        this.method1933(-94, 768, 0, 5890);
        this.method1933(-119, 770, 2, 34166);
        this.method1947(34162, 5890, 0, 770);
        this.method1947(34162, 34166, 2, 770);
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(IIIII)I")
    public static final int method1954(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4017;
        int var5 = -class310.field3965[arg1 * 8192 / arg4] + 65536 >> 1;
        if (arg2 != 212669616) {
            method1899(4, -81);
        }
        return ((-var5 + 65536) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lr;Lkw;Lm;Leca;I)V")
    public final void method947(class521 arg0, class174 arg1, class105 arg2, class378 arg3, int arg4) {
        arg0.method1595(arg2, arg3, arg4);
        ++field4166;
        this.method957(arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8) {
        ++field4117;
        class54 var10 = (class54) arg6;
        class600 var11 = var10.field727;
        this.method1898(true);
        this.method1884(var10.field727, -2);
        this.method1905(3042, arg5);
        this.method1887(-106, 7681, 8448);
        this.method1933(-71, 768, 0, 34167);
        float var12 = var11.field8676 / (float) var11.field8672;
        float var13 = var11.field8671 / (float) var11.field8669;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method1933(-105, 768, 0, 5890);
    }

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "(I)V")
    private final void method1955(int arg0) {
        ++field4167;
        if (arg0 != 9514) {
            this.method1958(26, false, -128, (Buffer) null, (byte) 115);
        }
        if (~this.field4306 != -2) {
            this.method1891(false);
            this.method1962(-32, false);
            this.method1930((byte) -118, false);
            this.method1950(false, 85);
            this.method1949(false, (byte) 120);
            this.method1884((class148) null, -2);
            this.method1960(-2, 2);
            this.method1909(arg0 ^ -9565, 1);
            this.field4306 = 1;
        }
    }

    @OriginalMember(owner = "client!uq", name = "JA", descriptor = "(IIII)V")
    public final void method953(int arg0, int arg1, int arg2, int arg3) {
        ++field4087;
        if (!this.field4322) {
            throw new RuntimeException("");
        } else {
            this.field4278 = arg2;
            this.field4282 = arg0;
            this.field4268 = arg1;
            this.field4315 = arg3;
            this.field4194.field5467.method2531(-107);
            this.method1951((byte) -85);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lig;Z)Lha;")
    public final class116 method916(class295 arg0, boolean arg1) {
        ++field4081;
        int[] var3 = new int[arg0.field3835 * arg0.field3834];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3833 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field3834; ++var6) {
                for (int var7 = 0; ~arg0.field3835 < ~var7; ++var7) {
                    int var8 = arg0.field3828[arg0.field3831[var4++] & 255];
                    var3[var5++] = ~var8 != -1 ? class292.method1790(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field3834; ++var9) {
                for (int var11 = 0; var11 < arg0.field3835; ++var11) {
                    var3[var5++] = class292.method1790(arg0.field3833[var4] << 24, arg0.field3828[class143.method783(255, arg0.field3831[var4])]);
                    ++var4;
                }
            }
        }
        class116 var10 = this.method976(var3, 0, arg0.field3835, arg0.field3835, arg0.field3834);
        var10.method623(arg0.field3830, arg0.field3832, arg0.field3829, arg0.field3827);
        return var10;
    }

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "(B)V")
    private final void method1956(byte arg0) {
        class435.field5915[3] = 1.0F;
        ++field4107;
        class435.field5915[0] = this.field4312 * this.field4264;
        class435.field5915[1] = this.field4264 * this.field4235;
        if (arg0 <= 112) {
            this.field4347 = null;
        }
        class435.field5915[2] = this.field4264 * this.field4252;
        OpenGL.glLightModelfv(2899, class435.field5915, 0);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lve;I)V")
    public final void method1957(class230 arg0, int arg1) {
        ++field4131;
        if (~this.field4207 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field4207 <= -1) {
                this.field4211[this.field4207].method1451(-78);
            }
            if (arg1 >= -20) {
                this.field4314 = null;
            }
            this.field4212 = this.field4211[++this.field4207] = arg0;
            this.field4212.method1449((byte) -74);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)V")
    public final void method983(boolean arg0) {
        this.field4265 = arg0;
        ++field4032;
        this.method1934(3);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZILjaclib/memory/Buffer;B)Lee;")
    public final class159 method1958(int arg0, boolean arg1, int arg2, Buffer arg3, byte arg4) {
        ++field4177;
        if (!this.field4244 || arg1 && !this.field4327) {
            int var6 = 66 / ((arg4 - -20) / 60);
            return new class634(this, arg2, arg3);
        } else {
            return new class162(this, arg2, arg3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "(I)V")
    private final void method1959(int arg0) {
        ++field4152;
        float[] var2 = this.field4298;
        float var3 = (float) (-this.field4256 * this.field4294) / (float) this.field4335;
        float var4 = (float) ((this.field4083 - this.field4256) * this.field4294) / (float) this.field4335;
        float var5 = (float) (this.field4294 * this.field4225) / (float) this.field4318;
        float var6 = (float) ((-this.field4003 + this.field4225) * this.field4294) / (float) this.field4318;
        if (arg0 != -18492) {
            this.method195();
        }
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field4294 * 2.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[4] = 0.0F;
            var2[7] = 0.0F;
            var2[1] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[11] = -1.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[14] = this.field4232 = -((float) this.field4246 * var7) / (float) (-this.field4294 + this.field4246);
            var2[2] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[10] = this.field4317 = (float) (-(this.field4246 - -this.field4294)) / (float) (-this.field4294 + this.field4246);
            var2[12] = 0.0F;
            var2[15] = 0.0F;
        } else {
            var2[15] = 1.0F;
            var2[4] = 0.0F;
            var2[11] = 0.0F;
            var2[2] = 0.0F;
            var2[8] = 0.0F;
            var2[10] = 1.0F;
            var2[9] = 0.0F;
            var2[12] = 0.0F;
            var2[0] = 1.0F;
            var2[1] = 0.0F;
            var2[14] = 0.0F;
            var2[13] = 0.0F;
            var2[6] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = 1.0F;
            var2[3] = 0.0F;
        }
        this.method1892((byte) -123);
    }

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "(II)V")
    public final void method1960(int arg0, int arg1) {
        this.method1913(arg0, (byte) -115, true);
        if (arg1 != 2) {
            this.method1961((class404) null, -52);
        }
        ++field4002;
    }

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "()Z")
    public final boolean method975() {
        ++field4157;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lhba;I)V")
    public final void method1961(class404 arg0, int arg1) {
        if (arg1 != 17791) {
            this.field4296 = null;
        }
        ++field4132;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method2415(0), 0);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIII)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4012;
        OpenGL.glLineWidth((float) arg5);
        this.method935(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V")
    public final void method1962(int arg0, boolean arg1) {
        if (arg0 != -32) {
            this.field4207 = -105;
        }
        ++field4108;
        if (!arg1 == this.field4286) {
            this.field4286 = arg1;
            this.method1902((byte) -106);
            this.field4306 &= -32;
        }
    }

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "(IIII)[I")
    public final int[] method950(int arg0, int arg1, int arg2, int arg3) {
        ++field3997;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field4003 - arg1 + -var6, arg2, 1, 32993, this.field4234, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(JB)V")
    public final synchronized void method1963(long arg0, byte arg1) {
        ++field4169;
        class108 var4 = new class108();
        var4.field1401 = arg0;
        if (arg1 < 96) {
            this.method907(-127);
        }
        this.field4222.method3181(var4, true);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method913(Rectangle[] arg0, int arg1) throws class487 {
        ++field4143;
        this.method934();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIBI)V")
    public final void method1964(int arg0, int arg1, byte arg2, int arg3) {
        OpenGL.glDrawArrays(arg3, arg1, arg0);
        ++field4077;
        if (arg2 <= 74) {
            this.method929();
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
    public final int method938(int arg0, int arg1) {
        ++field4011;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(ZI)V")
    public final void method1965(boolean arg0, int arg1) {
        if (!this.field4263 == arg0) {
            this.field4263 = arg0;
            this.method1943(false);
        }
        ++field4138;
        if (arg1 <= 125) {
            this.method1958(-46, false, 51, (Buffer) null, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "()Z")
    public final boolean method937() {
        ++field4174;
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "(II)V")
    public final void method1966(int arg0, int arg1) {
        if (~this.field4316 != ~arg1) {
            OpenGL.glActiveTexture(33984 - -arg1);
            this.field4316 = arg1;
        }
        if (arg0 != 3000) {
            this.method922(28, 77, 117, 41, -116, 22);
        }
        ++field4099;
    }

    @OriginalMember(owner = "client!uq", name = "ba", descriptor = "()I")
    public final int method929() {
        ++field4020;
        int var1 = this.field4345;
        this.field4345 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)V")
    public final void method198(int arg0) {
        this.method1911((byte) -81);
        ++field4007;
    }

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "()V")
    public final void method934() throws class487 {
        try {
            this.field4056.swapBuffers();
        } catch (Exception var1) {
        }
        ++field4106;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "()I")
    public final int method958() {
        ++field4018;
        return this.field4294;
    }

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "()Z")
    public final boolean method941() {
        ++field4030;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method187(Canvas arg0) {
        ++field4052;
        long var2 = 0L;
        if (arg0 != null && this.field4084 != arg0) {
            if (this.field4162.containsKey(arg0)) {
                Long var4 = (Long) this.field4162.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field4001;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field4056.surfaceResized(var2);
            if (this.field4155 == arg0) {
                this.method1889(false);
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIF)Lww;")
    public final class592 method955(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4181;
        return new class99(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIIIII)Lrn;")
    public final class307 method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4142;
        return this.field4245 ? new class220(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "(I)V")
    private final void method1967(int arg0) {
        if (arg0 >= 87) {
            ++field4124;
            if (this.field4311 != 3) {
                this.field4311 = 3;
                this.method1901(-47);
                this.method1931((byte) -65);
                this.field4306 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(BLve;)V")
    public final void method1968(byte arg0, class230 arg1) {
        ++field4119;
        if (this.field4208 >= 0 && this.field4210[this.field4208] == arg1) {
            this.field4210[this.field4208--] = null;
            arg1.method1450((byte) -33);
            if (arg0 == 109) {
                if (~this.field4208 > -1) {
                    this.field4209 = null;
                } else {
                    this.field4209 = this.field4210[this.field4208];
                    this.field4209.method1448((byte) 26);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "(IIII)V")
    public final void method939(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > this.field4338) {
            this.field4338 = arg0;
        }
        if (arg2 < this.field4300) {
            this.field4300 = arg2;
        }
        if (~this.field4255 > ~arg1) {
            this.field4255 = arg1;
        }
        if (~this.field4303 < ~arg3) {
            this.field4303 = arg3;
        }
        ++field4191;
        OpenGL.glEnable(3089);
        this.method1953(-18608);
        this.method1894((byte) 118);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lrn;Lrn;FLrn;)Lrn;")
    public final class307 method931(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        ++field4057;
        if (arg0 != null && arg1 != null && this.field4245 && this.field4336) {
            class593 var5 = null;
            class250 var6 = (class250) arg0;
            class250 var7 = (class250) arg1;
            class415 var8 = var6.method1414(1);
            class415 var9 = var7.method1414(1);
            if (var8 != null && var9 != null) {
                int var10 = var8.field5706 <= var9.field5706 ? var9.field5706 : var8.field5706;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class593) {
                    class593 var11 = (class593) arg3;
                    if (var11.method3423(-14418) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class593(this, var10);
                }
                if (var5.method3424(arg2, (byte) -24, var8, var9)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method986(Canvas arg0) {
        ++field4172;
        if (this.field4084 == arg0) {
            throw new RuntimeException();
        } else if (this.field4162.containsKey(arg0)) {
            Long var2 = (Long) this.field4162.get(arg0);
            this.field4056.releaseSurface(arg0, var2);
            this.field4162.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4021;
        float var7 = (float) arg2 * this.field4323.field5521 + (float) arg0 * this.field4323.field5533 + (float) arg1 * this.field4323.field5538 + this.field4323.field5546;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4323.field5521 + (float) arg3 * this.field4323.field5533 + (float) arg4 * this.field4323.field5538 + this.field4323.field5546;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field4294 > var7) || !((float) this.field4294 > var8)) && (!(var7 > (float) this.field4246) || !(var8 > (float) this.field4246))) {
            int var9 = (int) (((float) arg2 * this.field4323.field5556 + (float) arg0 * this.field4323.field5540 + (float) arg1 * this.field4323.field5526 + this.field4323.field5529) * (float) this.field4335 / var7);
            int var10 = (int) (((float) arg5 * this.field4323.field5556 + (float) arg3 * this.field4323.field5540 + (float) arg4 * this.field4323.field5526 + this.field4323.field5529) * (float) this.field4335 / var8);
            if (this.field4325 > (float) var9 && this.field4325 > (float) var10 || (float) var9 > this.field4310 && this.field4310 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4323.field5537 + (float) arg0 * this.field4323.field5548 + (float) arg1 * this.field4323.field5536 + this.field4323.field5544) * (float) this.field4318 / var7);
                int var12 = (int) (((float) arg5 * this.field4323.field5537 + (float) arg3 * this.field4323.field5548 + (float) arg4 * this.field4323.field5536 + this.field4323.field5544) * (float) this.field4318 / var8);
                return (!((float) var11 < this.field4233) || !((float) var12 < this.field4233)) && (!(this.field4324 < (float) var11) || !(this.field4324 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1969(int arg0, byte arg1, int arg2) {
        if (arg1 < 105) {
            method1888(118, -81, 127);
        }
        ++field4037;
        return (class202.method1294(-100, arg2, arg0) | class111.method599(true, arg0, arg2) | class53.method293(arg2, true, arg0)) & class579.method3255((byte) -76, arg0, arg2);
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(IIIIII)V")
    public final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4079;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method1955(9514);
        this.method1905(3042, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4260) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4260) {
            OpenGL.glEnable(32925);
        }
    }
}
