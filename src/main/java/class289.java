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

@OriginalClass("client!en")
public class class289 extends class638 {

    @OriginalMember(owner = "client!en", name = "wd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4175 = new Hashtable();

    @OriginalMember(owner = "client!en", name = "Kd", descriptor = "I")
    public int field4189 = 128;

    @OriginalMember(owner = "client!en", name = "Wd", descriptor = "Lwh;")
    private class133 field4201 = new class133();

    @OriginalMember(owner = "client!en", name = "le", descriptor = "Lim;")
    private class524 field4216 = new class524();

    @OriginalMember(owner = "client!en", name = "me", descriptor = "Lim;")
    public class524 field4217 = new class524();

    @OriginalMember(owner = "client!en", name = "oe", descriptor = "I")
    public int field4219 = 3;

    @OriginalMember(owner = "client!en", name = "se", descriptor = "I")
    public int field4223 = 8;

    @OriginalMember(owner = "client!en", name = "te", descriptor = "Z")
    private boolean field4224 = false;

    @OriginalMember(owner = "client!en", name = "ne", descriptor = "Lsu;")
    private class192 field4218 = new class192();

    @OriginalMember(owner = "client!en", name = "we", descriptor = "I")
    private int field4227 = -1;

    @OriginalMember(owner = "client!en", name = "ye", descriptor = "[Luk;")
    private class236[] field4229 = new class236[4];

    @OriginalMember(owner = "client!en", name = "ve", descriptor = "I")
    private int field4226 = -1;

    @OriginalMember(owner = "client!en", name = "ue", descriptor = "[Luk;")
    private class236[] field4225 = new class236[4];

    @OriginalMember(owner = "client!en", name = "xe", descriptor = "I")
    private int field4228 = -1;

    @OriginalMember(owner = "client!en", name = "ze", descriptor = "[Luk;")
    private class236[] field4230 = new class236[4];

    @OriginalMember(owner = "client!en", name = "Fe", descriptor = "Lsu;")
    private class192 field4236;

    @OriginalMember(owner = "client!en", name = "Ge", descriptor = "Lsu;")
    private class192 field4237;

    @OriginalMember(owner = "client!en", name = "He", descriptor = "Lsu;")
    private class192 field4238;

    @OriginalMember(owner = "client!en", name = "Ie", descriptor = "Lsu;")
    private class192 field4239;

    @OriginalMember(owner = "client!en", name = "Je", descriptor = "Lsu;")
    private class192 field4240;

    @OriginalMember(owner = "client!en", name = "Ke", descriptor = "Lsu;")
    private class192 field4241;

    @OriginalMember(owner = "client!en", name = "Le", descriptor = "Lsu;")
    private class192 field4242;

    @OriginalMember(owner = "client!en", name = "df", descriptor = "F")
    private float field4260;

    @OriginalMember(owner = "client!en", name = "cf", descriptor = "F")
    private float field4259;

    @OriginalMember(owner = "client!en", name = "rf", descriptor = "[F")
    private float[] field4273;

    @OriginalMember(owner = "client!en", name = "Ef", descriptor = "[Lld;")
    private class154[] field4286;

    @OriginalMember(owner = "client!en", name = "Df", descriptor = "[F")
    private float[] field4285;

    @OriginalMember(owner = "client!en", name = "Nf", descriptor = "I")
    private int field4295;

    @OriginalMember(owner = "client!en", name = "ff", descriptor = "F")
    public float field4262;

    @OriginalMember(owner = "client!en", name = "tf", descriptor = "F")
    public float field4275;

    @OriginalMember(owner = "client!en", name = "pf", descriptor = "I")
    private int field4271;

    @OriginalMember(owner = "client!en", name = "jg", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!en", name = "Lf", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!en", name = "jf", descriptor = "F")
    public float field4265;

    @OriginalMember(owner = "client!en", name = "wg", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!en", name = "nf", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!en", name = "kg", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!en", name = "kf", descriptor = "I")
    private int field4266;

    @OriginalMember(owner = "client!en", name = "Cg", descriptor = "I")
    private int field4336;

    @OriginalMember(owner = "client!en", name = "cg", descriptor = "F")
    public float field4310;

    @OriginalMember(owner = "client!en", name = "Of", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!en", name = "lg", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!en", name = "Bf", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!en", name = "vg", descriptor = "F")
    public float field4329;

    @OriginalMember(owner = "client!en", name = "pg", descriptor = "F")
    public float field4323;

    @OriginalMember(owner = "client!en", name = "Eg", descriptor = "[F")
    private float[] field4338;

    @OriginalMember(owner = "client!en", name = "Ig", descriptor = "[F")
    private float[] field4342;

    @OriginalMember(owner = "client!en", name = "Ne", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!en", name = "ug", descriptor = "F")
    public float field4328;

    @OriginalMember(owner = "client!en", name = "xf", descriptor = "I")
    private int field4279;

    @OriginalMember(owner = "client!en", name = "Jg", descriptor = "F")
    private float field4343;

    @OriginalMember(owner = "client!en", name = "Ff", descriptor = "F")
    private float field4287;

    @OriginalMember(owner = "client!en", name = "Pg", descriptor = "F")
    private float field4349;

    @OriginalMember(owner = "client!en", name = "ef", descriptor = "Z")
    private boolean field4261;

    @OriginalMember(owner = "client!en", name = "gg", descriptor = "I")
    private int field4314;

    @OriginalMember(owner = "client!en", name = "Ag", descriptor = "F")
    private float field4334;

    @OriginalMember(owner = "client!en", name = "Me", descriptor = "I")
    private int field4243;

    @OriginalMember(owner = "client!en", name = "Og", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!en", name = "yf", descriptor = "I")
    private int field4280;

    @OriginalMember(owner = "client!en", name = "Dg", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!en", name = "Fg", descriptor = "I")
    public int field4339;

    @OriginalMember(owner = "client!en", name = "Ug", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!en", name = "ah", descriptor = "[F")
    public float[] field4360;

    @OriginalMember(owner = "client!en", name = "Hf", descriptor = "Ldl;")
    public class57 field4289;

    @OriginalMember(owner = "client!en", name = "eh", descriptor = "[B")
    public byte[] field4364;

    @OriginalMember(owner = "client!en", name = "gh", descriptor = "[I")
    public int[] field4366;

    @OriginalMember(owner = "client!en", name = "hh", descriptor = "[I")
    public int[] field4367;

    @OriginalMember(owner = "client!en", name = "ih", descriptor = "[I")
    public int[] field4368;

    @OriginalMember(owner = "client!en", name = "ke", descriptor = "I")
    public int field4215;

    @OriginalMember(owner = "client!en", name = "gd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4159;

    @OriginalMember(owner = "client!en", name = "rc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4118;

    @OriginalMember(owner = "client!en", name = "Fb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4080;

    @OriginalMember(owner = "client!en", name = "Ub", descriptor = "J")
    private long field4095;

    @OriginalMember(owner = "client!en", name = "Hc", descriptor = "J")
    private long field4134;

    @OriginalMember(owner = "client!en", name = "ch", descriptor = "Z")
    public boolean field4362;

    @OriginalMember(owner = "client!en", name = "Af", descriptor = "I")
    public int field4282;

    @OriginalMember(owner = "client!en", name = "Yg", descriptor = "Ljava/lang/String;")
    private String field4358;

    @OriginalMember(owner = "client!en", name = "Te", descriptor = "Z")
    public boolean field4250;

    @OriginalMember(owner = "client!en", name = "bf", descriptor = "Z")
    private boolean field4258;

    @OriginalMember(owner = "client!en", name = "Mg", descriptor = "Z")
    public boolean field4346;

    @OriginalMember(owner = "client!en", name = "Bg", descriptor = "Z")
    public boolean field4335;

    @OriginalMember(owner = "client!en", name = "Ng", descriptor = "Z")
    public boolean field4347;

    @OriginalMember(owner = "client!en", name = "Kg", descriptor = "Z")
    private boolean field4344;

    @OriginalMember(owner = "client!en", name = "Gg", descriptor = "Ljava/lang/String;")
    private String field4340;

    @OriginalMember(owner = "client!en", name = "Ve", descriptor = "Z")
    public boolean field4252;

    @OriginalMember(owner = "client!en", name = "Qg", descriptor = "Z")
    private boolean field4350;

    @OriginalMember(owner = "client!en", name = "Yd", descriptor = "Ljq;")
    private class471 field4203;

    @OriginalMember(owner = "client!en", name = "pe", descriptor = "Lig;")
    public class220 field4220;

    @OriginalMember(owner = "client!en", name = "Ud", descriptor = "Lul;")
    private class525 field4199;

    @OriginalMember(owner = "client!en", name = "Sd", descriptor = "Lrw;")
    private class693 field4197;

    @OriginalMember(owner = "client!en", name = "Jd", descriptor = "Lnda;")
    private class512 field4188;

    @OriginalMember(owner = "client!en", name = "gb", descriptor = "[[I")
    public static int[][] field4055 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!en", name = "qf", descriptor = "F")
    public float field4272;

    @OriginalMember(owner = "client!en", name = "sf", descriptor = "F")
    public float field4274;

    @OriginalMember(owner = "client!en", name = "zf", descriptor = "F")
    private float field4281;

    @OriginalMember(owner = "client!en", name = "Mf", descriptor = "F")
    public float field4294;

    @OriginalMember(owner = "client!en", name = "mg", descriptor = "F")
    public float field4320;

    @OriginalMember(owner = "client!en", name = "ng", descriptor = "F")
    private float field4321;

    @OriginalMember(owner = "client!en", name = "og", descriptor = "F")
    public float field4322;

    @OriginalMember(owner = "client!en", name = "yg", descriptor = "F")
    private float field4332;

    @OriginalMember(owner = "client!en", name = "Sg", descriptor = "F")
    public float field4352;

    @OriginalMember(owner = "client!en", name = "Vg", descriptor = "F")
    private float field4355;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!en", name = "M", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!en", name = "N", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!en", name = "O", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!en", name = "P", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!en", name = "R", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!en", name = "S", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!en", name = "T", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!en", name = "U", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!en", name = "V", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!en", name = "W", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!en", name = "X", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!en", name = "Y", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!en", name = "Z", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!en", name = "ab", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!en", name = "bb", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!en", name = "cb", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!en", name = "db", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!en", name = "eb", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!en", name = "fb", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!en", name = "hb", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!en", name = "ib", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!en", name = "jb", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!en", name = "kb", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!en", name = "lb", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!en", name = "mb", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!en", name = "nb", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!en", name = "ob", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!en", name = "pb", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!en", name = "qb", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!en", name = "rb", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!en", name = "sb", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!en", name = "tb", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!en", name = "ub", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!en", name = "vb", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!en", name = "wb", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!en", name = "xb", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!en", name = "yb", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!en", name = "zb", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!en", name = "Ab", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!en", name = "Bb", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!en", name = "Cb", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!en", name = "Db", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!en", name = "Eb", descriptor = "I")
    private int field4079;

    @OriginalMember(owner = "client!en", name = "Gb", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!en", name = "Hb", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!en", name = "Ib", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!en", name = "Jb", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!en", name = "Kb", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!en", name = "Lb", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!en", name = "Mb", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!en", name = "Nb", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!en", name = "Ob", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!en", name = "Pb", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!en", name = "Qb", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!en", name = "Rb", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!en", name = "Sb", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!en", name = "Tb", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!en", name = "Vb", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!en", name = "Wb", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!en", name = "Xb", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!en", name = "Yb", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!en", name = "Zb", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!en", name = "ac", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!en", name = "bc", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!en", name = "cc", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!en", name = "dc", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!en", name = "ec", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!en", name = "fc", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!en", name = "gc", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!en", name = "hc", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!en", name = "ic", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!en", name = "jc", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!en", name = "kc", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!en", name = "lc", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!en", name = "mc", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!en", name = "nc", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!en", name = "oc", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!en", name = "pc", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!en", name = "qc", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!en", name = "sc", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!en", name = "tc", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!en", name = "uc", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!en", name = "vc", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!en", name = "wc", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!en", name = "xc", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!en", name = "yc", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!en", name = "zc", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!en", name = "Ac", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!en", name = "Bc", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!en", name = "Cc", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!en", name = "Dc", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!en", name = "Ec", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!en", name = "Fc", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!en", name = "Gc", descriptor = "I")
    private int field4133;

    @OriginalMember(owner = "client!en", name = "Ic", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!en", name = "Jc", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!en", name = "Kc", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!en", name = "Lc", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!en", name = "Mc", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!en", name = "Nc", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!en", name = "Oc", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!en", name = "Pc", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!en", name = "Qc", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!en", name = "Rc", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!en", name = "Sc", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!en", name = "Tc", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!en", name = "Uc", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!en", name = "Vc", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!en", name = "Wc", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!en", name = "Xc", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!en", name = "Yc", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!en", name = "Zc", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!en", name = "ad", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!en", name = "bd", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!en", name = "cd", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!en", name = "dd", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!en", name = "ed", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!en", name = "fd", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!en", name = "hd", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!en", name = "id", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!en", name = "jd", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!en", name = "kd", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!en", name = "ld", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!en", name = "md", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!en", name = "nd", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!en", name = "od", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!en", name = "pd", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!en", name = "qd", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!en", name = "rd", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!en", name = "sd", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!en", name = "td", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!en", name = "ud", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!en", name = "vd", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!en", name = "xd", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!en", name = "yd", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!en", name = "zd", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!en", name = "Ad", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!en", name = "Bd", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!en", name = "Cd", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!en", name = "Dd", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!en", name = "Ed", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!en", name = "Fd", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!en", name = "Gd", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!en", name = "Hd", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!en", name = "Id", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!en", name = "Ld", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!en", name = "Md", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!en", name = "Nd", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!en", name = "Od", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!en", name = "Pd", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!en", name = "Qd", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!en", name = "Rd", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!en", name = "Td", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!en", name = "Vd", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!en", name = "Xd", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!en", name = "Zd", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!en", name = "ae", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!en", name = "be", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!en", name = "ce", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!en", name = "de", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!en", name = "ee", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!en", name = "fe", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!en", name = "ge", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!en", name = "he", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!en", name = "ie", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!en", name = "je", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!en", name = "qe", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!en", name = "Ce", descriptor = "I")
    private int field4233;

    @OriginalMember(owner = "client!en", name = "De", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!en", name = "Ee", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!en", name = "Re", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!en", name = "Ue", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!en", name = "mf", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!en", name = "of", descriptor = "I")
    private int field4270;

    @OriginalMember(owner = "client!en", name = "uf", descriptor = "I")
    private int field4276;

    @OriginalMember(owner = "client!en", name = "If", descriptor = "I")
    private int field4290;

    @OriginalMember(owner = "client!en", name = "Uf", descriptor = "I")
    private int field4302;

    @OriginalMember(owner = "client!en", name = "ag", descriptor = "I")
    private int field4308;

    @OriginalMember(owner = "client!en", name = "ig", descriptor = "I")
    private int field4316;

    @OriginalMember(owner = "client!en", name = "qg", descriptor = "I")
    private int field4324;

    @OriginalMember(owner = "client!en", name = "sg", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!en", name = "tg", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!en", name = "zg", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!en", name = "Rg", descriptor = "I")
    private int field4351;

    @OriginalMember(owner = "client!en", name = "Xg", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!en", name = "dh", descriptor = "I")
    private int field4363;

    @OriginalMember(owner = "client!en", name = "fh", descriptor = "I")
    private int field4365;

    @OriginalMember(owner = "client!en", name = "Yf", descriptor = "J")
    private long field4306;

    @OriginalMember(owner = "client!en", name = "Tg", descriptor = "Laba;")
    private class159 field4353;

    @OriginalMember(owner = "client!en", name = "Oe", descriptor = "Lqa;")
    private class224 field4245;

    @OriginalMember(owner = "client!en", name = "Rf", descriptor = "Lan;")
    private class22 field4299;

    @OriginalMember(owner = "client!en", name = "Ae", descriptor = "Luk;")
    private class236 field4231;

    @OriginalMember(owner = "client!en", name = "Be", descriptor = "Luk;")
    private class236 field4232;

    @OriginalMember(owner = "client!en", name = "Se", descriptor = "Ljc;")
    public class403 field4249;

    @OriginalMember(owner = "client!en", name = "Ze", descriptor = "Ljc;")
    public class403 field4256;

    @OriginalMember(owner = "client!en", name = "vf", descriptor = "Ljc;")
    public class403 field4277;

    @OriginalMember(owner = "client!en", name = "wf", descriptor = "Ljc;")
    public class403 field4278;

    @OriginalMember(owner = "client!en", name = "Gf", descriptor = "Ljc;")
    public class403 field4288;

    @OriginalMember(owner = "client!en", name = "Jf", descriptor = "Ljc;")
    public class403 field4291;

    @OriginalMember(owner = "client!en", name = "Qf", descriptor = "Ljc;")
    public class403 field4298;

    @OriginalMember(owner = "client!en", name = "Xf", descriptor = "Ljc;")
    public class403 field4305;

    @OriginalMember(owner = "client!en", name = "Zf", descriptor = "Ljc;")
    public class403 field4307;

    @OriginalMember(owner = "client!en", name = "eg", descriptor = "Ljc;")
    public class403 field4312;

    @OriginalMember(owner = "client!en", name = "af", descriptor = "Lim;")
    public class524 field4257;

    @OriginalMember(owner = "client!en", name = "Vf", descriptor = "Lim;")
    public class524 field4303;

    @OriginalMember(owner = "client!en", name = "fg", descriptor = "Lufa;")
    public class625 field4313;

    @OriginalMember(owner = "client!en", name = "dg", descriptor = "Lwaa;")
    public class646 field4311;

    @OriginalMember(owner = "client!en", name = "Xe", descriptor = "Lpn;")
    private class682 field4254;

    @OriginalMember(owner = "client!en", name = "hf", descriptor = "Lpn;")
    private class682 field4264;

    @OriginalMember(owner = "client!en", name = "Cf", descriptor = "Lkca;")
    public class74 field4284;

    @OriginalMember(owner = "client!en", name = "hg", descriptor = "Lkca;")
    public class74 field4315;

    @OriginalMember(owner = "client!en", name = "re", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4222;

    @OriginalMember(owner = "client!en", name = "Pe", descriptor = "Z")
    private boolean field4246;

    @OriginalMember(owner = "client!en", name = "Qe", descriptor = "Z")
    public boolean field4247;

    @OriginalMember(owner = "client!en", name = "We", descriptor = "Z")
    private boolean field4253;

    @OriginalMember(owner = "client!en", name = "Ye", descriptor = "Z")
    private boolean field4255;

    @OriginalMember(owner = "client!en", name = "gf", descriptor = "Z")
    public boolean field4263;

    @OriginalMember(owner = "client!en", name = "lf", descriptor = "Z")
    private boolean field4267;

    @OriginalMember(owner = "client!en", name = "Kf", descriptor = "Z")
    public boolean field4292;

    @OriginalMember(owner = "client!en", name = "Pf", descriptor = "Z")
    private boolean field4297;

    @OriginalMember(owner = "client!en", name = "Sf", descriptor = "Z")
    private boolean field4300;

    @OriginalMember(owner = "client!en", name = "Tf", descriptor = "Z")
    public boolean field4301;

    @OriginalMember(owner = "client!en", name = "Wf", descriptor = "Z")
    private boolean field4304;

    @OriginalMember(owner = "client!en", name = "bg", descriptor = "Z")
    public boolean field4309;

    @OriginalMember(owner = "client!en", name = "rg", descriptor = "Z")
    public boolean field4325;

    @OriginalMember(owner = "client!en", name = "xg", descriptor = "Z")
    public boolean field4331;

    @OriginalMember(owner = "client!en", name = "Hg", descriptor = "Z")
    private boolean field4341;

    @OriginalMember(owner = "client!en", name = "Lg", descriptor = "Z")
    public boolean field4345;

    @OriginalMember(owner = "client!en", name = "Wg", descriptor = "Z")
    private boolean field4356;

    @OriginalMember(owner = "client!en", name = "Zg", descriptor = "Z")
    private boolean field4359;

    @OriginalMember(owner = "client!en", name = "bh", descriptor = "[Lit;")
    private class591[] field4361;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[I[I)Lfa;", line = 7)
    public final class212 method469(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4019;
        return class16.method76(arg0, arg1, this, arg2, false, arg3);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 15)
    private final void method1737(int arg0) {
        ++field4099;
        if (this.field4321 != 0.0F) {
            float var2 = this.field4343 / (this.field4343 + this.field4321);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field4281 * (1.0F - var2) / this.field4321;
            this.field4285[10] = this.field4332 + var4;
            this.field4285[14] = this.field4281 * var3;
        } else {
            this.field4285[10] = this.field4332;
            this.field4285[14] = this.field4281;
        }
        if (arg0 != 8192) {
            method1740(118);
        }
        this.field4328 = (this.field4285[14] + (float) (-this.field4244)) / this.field4285[10];
        this.field4329 = (float) this.field4244 + -this.field4321;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FFF)V", line = 50)
    public final void method322(float arg0, float arg1, float arg2) {
        class152.field2269 = arg0;
        ++field4069;
        class194.field2876 = arg2;
        class102.field1385 = arg1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lhn;IIII)Lba;", line = 63)
    public final class352 method379(class661 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4072;
        return new class403(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 71)
    public final void method319(Rectangle[] arg0, int arg1) throws class211 {
        this.method365();
        ++field4050;
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(I)V", line = 80)
    private final void method1738(int arg0) {
        OpenGL.glViewport(this.field4266, this.field4279, this.field4110, this.field4036);
        ++field4195;
        if (arg0 != 19520) {
            this.field4259 = -1.5514965F;
        }
    }

    @OriginalMember(owner = "client!en", name = "L", descriptor = "(ILfa;II)V", line = 91)
    public final void method425(int arg0, class212 arg1, int arg2, int arg3) {
        ++field4132;
        class438 var5 = (class438) arg1;
        class22 var6 = var5.field6173;
        this.method1808(-53);
        this.method1804(false, var5.field6173);
        this.method1768(1, -41);
        this.method1798(false, 8448, 7681);
        this.method1797(0, (byte) 118, 768, 34167);
        float var7 = var6.field299 / (float) var6.field302;
        float var8 = var6.field300 / (float) var6.field301;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4280) * var7, (float) (-arg3 + this.field4296) * var8);
        OpenGL.glVertex2i(this.field4280, this.field4296);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4280) * var7, (float) (-arg3 + this.field4336) * var8);
        OpenGL.glVertex2i(this.field4280, this.field4336);
        OpenGL.glTexCoord2f((float) (this.field4348 - arg2) * var7, (float) (-arg3 + this.field4336) * var8);
        OpenGL.glVertex2i(this.field4348, this.field4336);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4348) * var7, (float) (-arg3 + this.field4296) * var8);
        OpenGL.glVertex2i(this.field4348, this.field4296);
        OpenGL.glEnd();
        this.method1797(0, (byte) 113, 768, 5890);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V", line = 123)
    public final synchronized void method1739(int arg0, int arg1, int arg2) {
        ++field4017;
        if (arg1 > 117) {
            class108 var4 = new class108(arg2);
            var4.field7311 = (long) arg0;
            this.field4240.method1273(var4, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!en", name = "i", descriptor = "(I)V", line = 139)
    public static final void method1740(int arg0) {
        ++field4161;
        class247.method1527(class274.field3872.field879, -18905, 2, 22050);
        class140.field2049 = new class432();
        class140.field2049.method2463(arg0 ^ 9, 128, arg0);
        class552.field7489 = class675.method3737(22050, class105.field1413, class503.field6878, 0, (byte) 70);
        class552.field7489.method2222((byte) 75, class140.field2049);
        class23.method113(126, class465.field6542, class417.field5882, class140.field2049, class693.field9709);
        class173.field2597 = class675.method3737(2048, class105.field1413, class503.field6878, 1, (byte) -126);
        class135.field1907 = new class598();
        class173.field2597.method2222((byte) 115, class135.field1907);
        class182.field2682 = new class453(22050, class29.field359);
        class318.field4720 = class74.field1027.method920(2, "scape main");
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FFFI)V", line = 158)
    private final void method1741(float arg0, float arg1, float arg2, int arg3) {
        ++field4198;
        OpenGL.glMatrixMode(5890);
        if (this.field4304) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg1, arg2);
        OpenGL.glMatrixMode(5888);
        this.field4304 = true;
        if (arg3 != 18311) {
            this.method410(-24, 70, 111, -78);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lq;)V", line = 176)
    public final void method446(class391 arg0) {
        this.field4303 = (class524) arg0;
        ++field4073;
        this.field4257.method2907((byte) 106, this.field4303);
        if (this.field4270 != 1) {
            this.method1774(13808);
        }
    }

    @OriginalMember(owner = "client!en", name = "z", descriptor = "()Z", line = 194)
    public final boolean method417() {
        ++field4048;
        return false;
    }

    @OriginalMember(owner = "client!en", name = "m", descriptor = "()V", line = 202)
    public final void method460() {
        ++field4089;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIIIIII)V", line = 209)
    public static final void method1742(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class576.field7741 = arg2;
        if (arg3 <= -51) {
            ++field4057;
            class30.field365 = arg1;
            class130.field1785 = arg5;
            class663.field9356 = arg6;
            class678.field9554 = arg4;
            if (arg0 && ~class678.field9554 <= -101) {
                class117.field1563 = class576.field7741 * 512 + 256;
                class172.field2572 = class663.field9356 * 512 + 256;
                class628.field8762 = class203.method1355(class117.field1563, class172.field2572, 4, class233.field3305) - class130.field1785;
            }
            class670.field9445 = 2;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([BIIZI)Lqa;", line = 234)
    public final class224 method1743(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field4027;
        if (!this.field4258 || arg3 && !this.field4344) {
            if (arg1 >= -58) {
                this.field4272 = 0.7945692F;
            }
            return new class135(this, arg4, arg0, arg2);
        } else {
            return new class268(this, arg4, arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lkca;BLkca;Lkca;Lkca;)V", line = 255)
    public final void method1744(class74 arg0, byte arg1, class74 arg2, class74 arg3, class74 arg4) {
        if (arg0 != null) {
            this.method1757(arg0.field1021, -75);
            OpenGL.glVertexPointer(arg0.field1023, arg0.field1026, this.field4264.method2004((byte) 40), this.field4264.method2003(false) - -((long) arg0.field1022));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field4138;
        if (arg4 != null) {
            this.method1757(arg4.field1021, -111);
            OpenGL.glNormalPointer(arg4.field1026, this.field4264.method2004((byte) -54), this.field4264.method2003(false) + (long) arg4.field1022);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg1 <= -88) {
            if (arg3 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method1757(arg3.field1021, -109);
                OpenGL.glColorPointer(arg3.field1023, arg3.field1026, this.field4264.method2004((byte) -77), this.field4264.method2003(false) - -((long) arg3.field1022));
                OpenGL.glEnableClientState(32886);
            }
            if (arg2 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method1757(arg2.field1021, -95);
                OpenGL.glTexCoordPointer(arg2.field1023, arg2.field1026, this.field4264.method2004((byte) 59), this.field4264.method2003(false) + (long) arg2.field1022);
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V", line = 301)
    public final void method1745(byte arg0) {
        ++field4016;
        if (arg0 != -110) {
            this.field4355 = 0.48224404F;
        }
        OpenGL.glLightfv(16384, 4611, this.field4360, 0);
        OpenGL.glLightfv(16385, 4611, this.field4342, 0);
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V", line = 315)
    public final void method382(int arg0) {
        this.method1806(-22474);
        ++field4206;
    }

    @OriginalMember(owner = "client!en", name = "j", descriptor = "(I)Lwg;", line = 324)
    public final class389 method1746(int arg0) {
        if (arg0 != 0) {
            this.method379((class661) null, -23, -113, -25, -103);
        }
        ++field4074;
        return this.field4353 == null ? null : this.field4353.method1099((byte) 114);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)V", line = 335)
    public final void method1747(int arg0, byte arg1) {
        if (this.field4251 != arg0) {
            OpenGL.glActiveTexture(33984 - -arg0);
            this.field4251 = arg0;
        }
        if (arg1 != 108) {
            this.field4201 = null;
        }
        ++field4211;
    }

    @OriginalMember(owner = "client!en", name = "j", descriptor = "()Z", line = 351)
    public final boolean method385() {
        ++field4022;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "()V", line = 359)
    public final void method325() {
        ++field4081;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Lld;)V", line = 367)
    public final void method398(int arg0, class154[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field4286[var3] = arg1[var3];
        }
        ++field4030;
        this.field4351 = arg0;
        if (this.field4270 != 1) {
            this.method1814(-104);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Li;)V", line = 389)
    public final void method421(class37 arg0) {
        this.field4222 = ((class168) arg0).field2534;
        ++field4042;
        if (this.field4254 == null) {
            class57 var2 = new class57(80);
            if (this.field4362) {
                var2.method503((byte) 30, -1.0F);
                var2.method503((byte) 30, -1.0F);
                var2.method503((byte) 30, 0.0F);
                var2.method503((byte) 30, 0.0F);
                var2.method503((byte) 30, 1.0F);
                var2.method503((byte) 30, 1.0F);
                var2.method503((byte) 30, -1.0F);
                var2.method503((byte) 30, 0.0F);
                var2.method503((byte) 30, 1.0F);
                var2.method503((byte) 30, 1.0F);
                var2.method503((byte) 30, 1.0F);
                var2.method503((byte) 30, 1.0F);
                var2.method503((byte) 30, 0.0F);
                var2.method503((byte) 30, 1.0F);
                var2.method503((byte) 30, 0.0F);
                var2.method503((byte) 30, -1.0F);
                var2.method503((byte) 30, 1.0F);
                var2.method503((byte) 30, 0.0F);
                var2.method503((byte) 30, 0.0F);
                var2.method503((byte) 30, 0.0F);
            } else {
                var2.method501(-1.0F, 117);
                var2.method501(-1.0F, 127);
                var2.method501(0.0F, 120);
                var2.method501(0.0F, 115);
                var2.method501(1.0F, 112);
                var2.method501(1.0F, 123);
                var2.method501(-1.0F, 111);
                var2.method501(0.0F, 113);
                var2.method501(1.0F, 114);
                var2.method501(1.0F, 115);
                var2.method501(1.0F, 125);
                var2.method501(1.0F, 116);
                var2.method501(0.0F, 123);
                var2.method501(1.0F, 125);
                var2.method501(0.0F, 118);
                var2.method501(-1.0F, 126);
                var2.method501(1.0F, 116);
                var2.method501(0.0F, 119);
                var2.method501(0.0F, 122);
                var2.method501(0.0F, 114);
            }
            this.field4254 = this.method1786(var2.field1316, false, 20, (byte) -80, var2.field1301);
            this.field4315 = new class74(this.field4254, 5126, 3, 0);
            this.field4284 = new class74(this.field4254, 5126, 2, 12);
            this.field4201.method952(this, 5121);
        }
    }

    @OriginalMember(owner = "client!en", name = "C", descriptor = "(IIIIII)V", line = 457)
    public final void method472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4093;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1771((byte) 123);
        float var10 = (float) arg3 + var8;
        this.method1768(arg5, -51);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4356) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4356) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZZZ)V", line = 490)
    public final void method1748(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        ++field4148;
        if (~this.field4308 != ~arg0) {
            if (arg0 < 0) {
                this.method1781((byte) 71);
                this.method1804(!arg2, (class591) null);
                this.method1801(0, 34166);
                if (!this.field4309) {
                    this.field4188.method2839(arg1, arg3, 0, (byte) 99, 0, 0);
                }
            } else {
                class646 var5 = this.field4203.method2677(76, arg0);
                class269 var6 = super.field9050.method588(-26679, arg0);
                if (var6.field3808 == 0 && ~var6.field3806 == -1) {
                    this.method1781((byte) 71);
                } else {
                    int var7 = !var6.field3823 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method1741((float) (this.field4221 % var8 * var6.field3808) / (float) var8, (float) (this.field4221 % var8 * var6.field3806) / (float) var8, 0.0F, 18311);
                }
                if (this.field4309) {
                    this.method1804(false, var5);
                    this.method1801(var6.field3804, 34166);
                } else {
                    this.field4188.method2839(arg1, arg3, var6.field3803, (byte) 112, var6.field3816, var6.field3814);
                    if (!this.field4188.method2840((byte) 127, var6.field3804, var5)) {
                        this.method1804(!arg2, var5);
                        this.method1801(var6.field3804, 34166);
                    }
                }
            }
            this.field4308 = arg0;
        }
        this.field4302 &= -8;
        if (!arg2) {
            this.method1798(true, -58, 116);
        }
    }

    @OriginalMember(owner = "client!en", name = "k", descriptor = "(I)V", line = 552)
    public final void method1749(int arg0) {
        ++field4054;
        if (~this.field4270 != arg0) {
            this.field4302 &= -32;
            this.field4270 = 0;
        }
    }

    @OriginalMember(owner = "client!en", name = "l", descriptor = "(I)V", line = 566)
    private final void method1750(int arg0) {
        if (~this.field4270 != arg0) {
            this.field4270 = 2;
            this.method1821(5889);
            this.method1774(arg0 + 13811);
            this.field4302 &= -8;
        }
        ++field4196;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)Lka;", line = 582)
    public final class434 method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4115;
        return this.field4325 ? new class570(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V", line = 592)
    public final void method1751(boolean arg0, int arg1) {
        if (this.field4359 != arg0) {
            this.field4359 = arg0;
            this.method1809(-76);
        }
        if (arg1 <= 108) {
            this.method1794(-122, true, -87, 93, (Buffer) null);
        }
        ++field4066;
    }

    @OriginalMember(owner = "client!en", name = "X", descriptor = "(III)V", line = 611)
    public final void method453(int arg0, int arg1, int arg2) {
        ++field4090;
        if (~this.field4339 != ~arg0 || ~this.field4283 != ~arg1 || this.field4293 != arg2) {
            this.field4283 = arg1;
            this.field4339 = arg0;
            this.field4293 = arg2;
            if (this.field4309) {
                return;
            }
            this.method1767((byte) -80);
            this.method1776(false);
        }
    }

    @OriginalMember(owner = "client!en", name = "q", descriptor = "()Z", line = 635)
    public final boolean method408() {
        ++field4153;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "m", descriptor = "(I)V", line = 643)
    private final void method1752(int arg0) {
        ++field4121;
        if (this.field4270 != arg0) {
            this.field4270 = 3;
            this.method1795(5889);
            this.method1774(13808);
            this.field4302 &= -8;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(B)V", line = 658)
    public final void method1753(byte arg0) {
        ++field4052;
        OpenGL.glPopMatrix();
        if (arg0 != 90) {
            this.field4248 = -36;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(II)I", line = 669)
    public final int method1754(int arg0, int arg1) {
        if (arg1 < 80) {
            this.field4257 = null;
        }
        ++field4056;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && ~arg0 != -34847 && arg0 != 34844) {
                if (arg0 == 6407) {
                    return 3;
                } else if (arg0 != 6408 && arg0 != 34847) {
                    if (arg0 != 34843) {
                        if (arg0 == 34842) {
                            return 8;
                        } else if (arg0 == 6402) {
                            return 3;
                        } else if (~arg0 == -6402) {
                            return 1;
                        } else {
                            throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lka;Lka;FLka;)Lka;", line = 713)
    public final class434 method317(class434 arg0, class434 arg1, float arg2, class434 arg3) {
        ++field4125;
        if (arg0 != null && arg1 != null && this.field4325 && this.field4252) {
            class278 var5 = null;
            class159 var6 = (class159) arg0;
            class159 var7 = (class159) arg1;
            class389 var8 = var6.method1099((byte) 127);
            class389 var9 = var7.method1099((byte) 106);
            if (var8 != null && var9 != null) {
                int var10 = var9.field5456 < var8.field5456 ? var8.field5456 : var9.field5456;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class278) {
                    class278 var11 = (class278) arg3;
                    if (~var11.method1684((byte) 49) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class278(this, var10);
                }
                if (var5.method1686(var8, var9, 1, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!en", name = "n", descriptor = "(I)V", line = 762)
    private final void method1755(int arg0) {
        ++field4127;
        float[] var2 = this.field4285;
        float var3 = (float) (-this.field4337 * this.field4354) / (float) this.field4318;
        if (arg0 != 12) {
            this.field4358 = null;
        }
        float var4 = (float) ((-this.field4337 + this.field4110) * this.field4354) / (float) this.field4318;
        float var5 = (float) (this.field4354 * this.field4269) / (float) this.field4330;
        float var6 = (float) ((-this.field4036 + this.field4269) * this.field4354) / (float) this.field4330;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field4354 * 2.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[2] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[6] = 0.0F;
            var2[14] = this.field4281 = -((float) this.field4244 * var7) / (float) (-this.field4354 + this.field4244);
            var2[0] = var7 / (var4 - var3);
            var2[10] = this.field4332 = (float) (-(this.field4244 - -this.field4354)) / (float) (-this.field4354 + this.field4244);
            var2[15] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[13] = 0.0F;
            var2[11] = -1.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
        } else {
            var2[15] = 1.0F;
            var2[1] = 0.0F;
            var2[11] = 0.0F;
            var2[5] = 1.0F;
            var2[0] = 1.0F;
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[9] = 0.0F;
            var2[14] = 0.0F;
            var2[10] = 1.0F;
            var2[6] = 0.0F;
            var2[4] = 0.0F;
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[13] = 0.0F;
            var2[8] = 0.0F;
        }
        this.method1737(8192);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Luk;I)V", line = 828)
    public final void method1756(class236 arg0, int arg1) {
        ++field4130;
        if (arg1 <= this.field4227) {
            throw new RuntimeException();
        } else {
            if (this.field4227 >= 0) {
                this.field4225[this.field4227].method1487(false);
            }
            this.field4232 = this.field4225[++this.field4227] = arg0;
            this.field4232.method1489(false);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lpn;I)V", line = 846)
    public final void method1757(class682 arg0, int arg1) {
        ++field4145;
        if (arg1 > -74) {
            this.field4220 = null;
        }
        if (this.field4264 != arg0) {
            if (this.field4258) {
                OpenGL.glBindBufferARB(34962, arg0.method2002((byte) -113));
            }
            this.field4264 = arg0;
        }
    }

    @OriginalMember(owner = "client!en", name = "u", descriptor = "()Z", line = 867)
    public final boolean method461() {
        ++field4032;
        return this.field4188.method2841(15688, 3);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I", line = 876)
    public final int method444(int arg0, int arg1) {
        ++field4136;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V", line = 884)
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field4061;
        this.method415(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)I", line = 896)
    public final int method1758(int arg0, boolean arg1) {
        if (arg1) {
            this.field4342 = null;
        }
        ++field4015;
        if (~arg0 != -5122 && ~arg0 != -5121) {
            if (arg0 != 5123 && ~arg0 != -5123) {
                if (~arg0 != -5126 && arg0 != 5124 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([Lba;Lhfa;Lq;[Lrc;I)V", line = 916)
    public final void method390(class352[] arg0, class281 arg1, class391 arg2, class494[] arg3, int arg4) {
        this.method393(arg0, arg2, arg3, arg4);
        ++field4157;
        this.method419(arg1);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(IIII)V", line = 931)
    public final void method1759(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            OpenGL.glDrawArrays(arg1, arg0, arg3);
            ++field4212;
        }
    }

    @OriginalMember(owner = "client!en", name = "aa", descriptor = "()I", line = 945)
    public final int method471() {
        ++field4179;
        int var1 = this.field4365;
        this.field4365 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZI)V", line = 960)
    public final void method1760(boolean arg0, boolean arg1, int arg2) {
        ++field4088;
        if (arg0) {
            this.method360(-123, 110, 59, -69);
        }
        this.method1748(arg2, arg1, true, true);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIILfa;II)V", line = 974)
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class212 arg6, int arg7, int arg8) {
        ++field4046;
        class438 var10 = (class438) arg6;
        class22 var11 = var10.field6173;
        this.method1808(-22);
        this.method1804(false, var10.field6173);
        this.method1768(arg5, -36);
        this.method1798(false, 8448, 7681);
        this.method1797(0, (byte) 111, 768, 34167);
        float var12 = var11.field299 / (float) var11.field302;
        float var13 = var11.field300 / (float) var11.field301;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method1797(0, (byte) 89, 768, 5890);
    }

    @OriginalMember(owner = "client!en", name = "A", descriptor = "()V", line = 1012)
    public final void method327() {
        ++field4210;
        if (this.field4197 != null && this.field4197.method536((byte) -106)) {
            this.field4199.method2918(this.field4197, 0);
            this.field4203.method2678(-67524572);
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "()V", line = 1029)
    public final void method358() {
        ++field4143;
        if (this.field4350 && ~this.field4110 < -1 && this.field4036 > 0) {
            int var1 = this.field4280;
            int var2 = this.field4348;
            int var3 = this.field4296;
            int var4 = this.field4336;
            this.method449();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1749(-1);
            this.method1778(false, (byte) 28);
            this.method1777(false, 109);
            this.method1779(true, false);
            this.method1805(false, (byte) 58);
            this.method1804(false, (class591) null);
            this.method1789((byte) -51, -2);
            this.method1801(1, 34166);
            this.method1768(0, -105);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4110, this.field4036, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method442(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1072)
    public final void method381(Canvas arg0) {
        ++field4204;
        this.field4118 = null;
        this.field4134 = 0L;
        if (arg0 != null && this.field4159 != arg0) {
            if (this.field4175.containsKey(arg0)) {
                Long var2 = (Long) this.field4175.get(arg0);
                this.field4134 = var2;
                this.field4118 = arg0;
            }
        } else {
            this.field4134 = this.field4095;
            this.field4118 = this.field4159;
        }
        if (this.field4118 != null && ~this.field4134 != -1L) {
            this.field4080.setSurface(this.field4134);
            this.method1815(32884);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()Z", line = 1102)
    public final boolean method423() {
        ++field4194;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(IIIII)V", line = 1111)
    public final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4038;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (arg0 + arg2 >= this.field4280 && ~this.field4348 <= ~(-arg2 + arg0) && ~(arg1 + arg2) <= ~this.field4296 && arg1 - arg2 <= this.field4336) {
            this.method1771((byte) -112);
            this.method1768(arg4, -65);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field4287 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field4259 >= (float) var8) {
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
                int var10 = class694.method3810(var9, 71828324);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class232.field3299[var11] * (float) arg2 + var6, class232.field3301[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "v", descriptor = "()I", line = 1188)
    public final int method400() {
        ++field4135;
        return this.field4235 - -this.field4233 + this.field4234;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(II)V", line = 1196)
    public final void method1761(int arg0, int arg1) {
        class531.field7244[3] = (float) (arg0 >>> 24) / 255.0F;
        class531.field7244[2] = (float) class249.method1537(arg0, 255) / 255.0F;
        if (arg1 <= 52) {
            this.field4338 = null;
        }
        class531.field7244[1] = (float) class249.method1537(65280, arg0) / 65280.0F;
        class531.field7244[0] = (float) class249.method1537(arg0, 16711680) / 1.671168E7F;
        ++field4037;
        OpenGL.glTexEnvfv(8960, 8705, class531.field7244, 0);
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(II)I", line = 1215)
    public final int method1762(int arg0, int arg1) {
        int var3 = 2 / ((89 - arg0) / 35);
        ++field4149;
        if (~arg1 != -2) {
            if (~arg1 == -1) {
                return 8448;
            } else if (arg1 == 2) {
                return 34165;
            } else if (arg1 == 3) {
                return 260;
            } else if (arg1 == 4) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIZ)Lxa;", line = 1250)
    public final class461 method420(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4200;
        return new class186(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!en", name = "w", descriptor = "()Z", line = 1258)
    public final boolean method426() {
        ++field4071;
        return false;
    }

    @OriginalMember(owner = "client!en", name = "o", descriptor = "(I)V", line = 1266)
    public final void method1763(int arg0) {
        if (arg0 != 8960) {
            this.method1766(-114);
        }
        if (this.field4302 != 16) {
            this.method1752(3);
            this.method1778(true, (byte) 28);
            this.method1779(true, true);
            this.method1805(true, (byte) 58);
            this.method1768(1, -125);
            this.field4302 = 16;
        }
        ++field4128;
    }

    @OriginalMember(owner = "client!en", name = "l", descriptor = "()Z", line = 1286)
    public final boolean method436() {
        ++field4114;
        return this.field4197 != null && (this.field4215 <= 1 || this.field4267);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 1294)
    public final void method394(int arg0) {
        ++field4098;
        this.method1803((byte) 12);
    }

    @OriginalMember(owner = "client!en", name = "r", descriptor = "()Z", line = 1303)
    public final boolean method407() {
        ++field4040;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "F", descriptor = "()V", line = 1314)
    public final void method449() {
        this.field4280 = 0;
        this.field4348 = this.field4110;
        ++field4137;
        this.field4296 = 0;
        this.field4336 = this.field4036;
        OpenGL.glDisable(3089);
        this.method1816(16760760);
    }

    @OriginalMember(owner = "client!en", name = "SA", descriptor = "()I", line = 1329)
    public final int method356() {
        ++field4167;
        int var1 = this.field4363;
        this.field4363 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lmj;[Lkq;Z)Lta;", line = 1342)
    public final class194 method405(class599 arg0, class543[] arg1, boolean arg2) {
        ++field4208;
        return new class118(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!en", name = "p", descriptor = "(I)V", line = 1351)
    private final void method1764(int arg0) {
        if (arg0 != -14013) {
            this.method1821(56);
        }
        ++field4181;
        this.field4303 = new class524();
        this.field4257 = new class524();
        this.field4361 = new class591[this.field4326];
        this.field4311 = new class646(this, 3553, 6408, 1, 1);
        new class646(this, 3553, 6408, 1, 1);
        new class646(this, 3553, 6408, 1, 1);
        this.field4278 = new class403(this);
        this.field4277 = new class403(this);
        this.field4256 = new class403(this);
        this.field4312 = new class403(this);
        this.field4249 = new class403(this);
        this.field4305 = new class403(this);
        this.field4288 = new class403(this);
        this.field4298 = new class403(this);
        this.field4307 = new class403(this);
        this.field4291 = new class403(this);
        if (this.field4252) {
            this.field4313 = new class625(this);
            new class625(this);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V", line = 1392)
    public final void method422(boolean arg0) {
        ++field4085;
    }

    @OriginalMember(owner = "client!en", name = "q", descriptor = "(I)V", line = 1402)
    public final void method1765(int arg0) {
        if (~this.field4302 != -5) {
            this.method1796(arg0 ^ -27012);
            this.method1778(false, (byte) 28);
            this.method1777(false, -106);
            this.method1779(true, false);
            this.method1805(false, (byte) 58);
            this.method1789((byte) -51, -2);
            this.method1768(1, -69);
            this.field4302 = 4;
        }
        ++field4029;
        if (arg0 != -27126) {
            this.field4276 = 95;
        }
    }

    @OriginalMember(owner = "client!en", name = "na", descriptor = "(III[I)V", line = 1428)
    public final void method443(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4176;
        float var5 = (float) arg2 * this.field4303.field7155 + (float) arg0 * this.field4303.field7126 + (float) arg1 * this.field4303.field7152 + this.field4303.field7141;
        if (!(var5 < (float) this.field4354) && !((float) this.field4244 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4303.field7151 + (float) arg0 * this.field4303.field7134 + (float) arg1 * this.field4303.field7127 + this.field4303.field7128) * (float) this.field4318 / var5);
            int var7 = (int) (((float) arg2 * this.field4303.field7133 + (float) arg0 * this.field4303.field7138 + (float) arg1 * this.field4303.field7145 + this.field4303.field7153) * (float) this.field4330 / var5);
            if (this.field4352 <= (float) var6 && this.field4272 >= (float) var6 && (float) var7 >= this.field4322 && (float) var7 <= this.field4274) {
                arg3[1] = (int) ((float) var7 - this.field4322);
                arg3[0] = (int) ((float) var6 - this.field4352);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!en", name = "y", descriptor = "()V", line = 1461)
    public final void method365() throws class211 {
        try {
            this.field4080.swapBuffers();
        } catch (Exception var1) {
        }
        ++field4155;
    }

    @OriginalMember(owner = "client!en", name = "r", descriptor = "(I)V", line = 1481)
    private final void method1766(int arg0) {
        OpenGL.glDepthMask(this.field4255 && this.field4261);
        ++field4077;
        if (arg0 != 2) {
            this.field4313 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "YA", descriptor = "(IFFFFF)V", line = 1498)
    public final void method450(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4177;
        boolean var7 = this.field4295 != arg0;
        if (var7 || this.field4310 != arg1 || this.field4262 != arg2) {
            this.field4310 = arg1;
            this.field4295 = arg0;
            this.field4262 = arg2;
            if (var7) {
                this.field4323 = (float) (this.field4295 & 16711680) / 1.671168E7F;
                this.field4265 = (float) (65280 & this.field4295) / 65280.0F;
                this.field4275 = (float) (this.field4295 & 255) / 255.0F;
                this.method1783((byte) 82);
            }
            this.method1775(60);
        }
        if (this.field4273[0] != arg3 || this.field4273[1] != arg4 || this.field4273[2] != arg5) {
            this.field4273[2] = arg5;
            this.field4273[0] = arg3;
            this.field4273[1] = arg4;
            this.field4338[0] = -arg3;
            this.field4338[1] = -arg4;
            this.field4338[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4360[2] = arg5 * var8;
            this.field4360[0] = arg3 * var8;
            this.field4360[1] = arg4 * var8;
            this.field4342[1] = -this.field4360[1];
            this.field4342[0] = -this.field4360[0];
            this.field4342[2] = -this.field4360[2];
            this.method1745((byte) -110);
            this.field4248 = (int) (arg5 * 256.0F / arg4);
            this.field4357 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!en", name = "o", descriptor = "()Z", line = 1548)
    public final boolean method308() {
        ++field4117;
        return this.field4197 != null && this.field4197.method536((byte) 42);
    }

    @OriginalMember(owner = "client!en", name = "k", descriptor = "()V", line = 1559)
    public final void method406() {
        ++field4214;
        this.field4309 = false;
        this.field4188.method2839(false, false, 0, (byte) -93, 0, 0);
        this.method1767((byte) -98);
        this.method1776(false);
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(B)V", line = 1572)
    private final void method1767(byte arg0) {
        ++field4120;
        int var2;
        if (!this.field4309) {
            this.field4355 = (float) (-this.field4293 + this.field4244) + -this.field4349;
            this.field4294 = -((float) this.field4283 * this.field4334) + this.field4355;
            if (this.field4294 < (float) this.field4354) {
                this.field4294 = (float) this.field4354;
            }
            OpenGL.glFogf(2915, this.field4294);
            OpenGL.glFogf(2916, this.field4355);
            var2 = this.field4339;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field4243;
        }
        class531.field7244[0] = (float) class249.method1537(var2, 16711680) / 1.671168E7F;
        class531.field7244[1] = (float) class249.method1537(65280, var2) / 65280.0F;
        class531.field7244[2] = (float) class249.method1537(255, var2) / 255.0F;
        if (arg0 <= -54) {
            OpenGL.glFogfv(2918, class531.field7244, 0);
            if (this.field4309) {
                this.field4188.field6998.method261(-59);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(II)V", line = 1609)
    public final void method1768(int arg0, int arg1) {
        if (~this.field4290 != ~arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    var3 = true;
                    var4 = false;
                    var5 = 2;
                } else if (arg0 != 128) {
                    var5 = 0;
                    var4 = false;
                    var3 = true;
                } else {
                    var3 = true;
                    var4 = true;
                    var5 = 3;
                }
            } else {
                var3 = true;
                var4 = true;
                var5 = 1;
            }
            if (!var3 == this.field4341) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field4341 = var3;
            }
            if (!var4 != !this.field4300) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field4300 = var4;
            }
            if (this.field4333 != var5) {
                if (~var5 != -2) {
                    if (~var5 == -3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var5 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field4333 = var5;
            }
            this.field4302 &= -29;
            this.field4290 = arg0;
        }
        ++field4021;
        if (arg1 >= -19) {
            this.field4293 = -20;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lqa;Z)V", line = 1702)
    public final void method1769(class224 arg0, boolean arg1) {
        if (this.field4245 != arg0) {
            if (this.field4258) {
                OpenGL.glBindBufferARB(34963, arg0.method967(-5602));
            }
            this.field4245 = arg0;
        }
        ++field4168;
        if (!arg1) {
            this.field4325 = true;
        }
    }

    @OriginalMember(owner = "client!en", name = "IA", descriptor = "()I", line = 1720)
    public final int method474() {
        ++field4092;
        return this.field4244;
    }

    @OriginalMember(owner = "client!en", name = "D", descriptor = "(I)V", line = 1728)
    public final void method310(int arg0) {
        this.method1768(0, -102);
        ++field4205;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!en", name = "FA", descriptor = "(IIIIII)Z", line = 1742)
    public final boolean method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4186;
        float var7 = (float) arg2 * this.field4303.field7155 + (float) arg0 * this.field4303.field7126 + (float) arg1 * this.field4303.field7152 + this.field4303.field7141;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4303.field7155 + (float) arg3 * this.field4303.field7126 + (float) arg4 * this.field4303.field7152 + this.field4303.field7141;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4354) || !((float) this.field4354 > var8)) && (!(var7 > (float) this.field4244) || !((float) this.field4244 < var8))) {
            int var9 = (int) (((float) arg2 * this.field4303.field7151 + (float) arg0 * this.field4303.field7134 + (float) arg1 * this.field4303.field7127 + this.field4303.field7128) * (float) this.field4318 / var7);
            int var10 = (int) (((float) arg5 * this.field4303.field7151 + (float) arg3 * this.field4303.field7134 + (float) arg4 * this.field4303.field7127 + this.field4303.field7128) * (float) this.field4318 / var8);
            if ((float) var9 < this.field4352 && this.field4352 > (float) var10 || (float) var9 > this.field4272 && (float) var10 > this.field4272) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4303.field7133 + (float) arg0 * this.field4303.field7138 + (float) arg1 * this.field4303.field7145 + this.field4303.field7153) * (float) this.field4330 / var7);
                int var12 = (int) (((float) arg5 * this.field4303.field7133 + (float) arg3 * this.field4303.field7138 + (float) arg4 * this.field4303.field7145 + this.field4303.field7153) * (float) this.field4330 / var8);
                return (!((float) var11 < this.field4322) || !((float) var12 < this.field4322)) && (!((float) var11 > this.field4274) || !(this.field4274 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(B)V", line = 1782)
    public final void method1770(byte arg0) {
        if (arg0 != 25) {
            this.method442(52, -115, 87, 80);
        }
        ++field4173;
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(B)V", line = 1793)
    private final void method1771(byte arg0) {
        if (this.field4302 != 1) {
            this.method1796(125);
            this.method1778(false, (byte) 28);
            this.method1777(false, 55);
            this.method1779(true, false);
            this.method1805(false, (byte) 58);
            this.method1804(false, (class591) null);
            this.method1789((byte) -51, -2);
            this.method1801(1, 34166);
            this.field4302 = 1;
        }
        int var2 = -118 / ((-24 - arg0) / 43);
        ++field4097;
    }

    @OriginalMember(owner = "client!en", name = "JA", descriptor = "(I)V", line = 1816)
    public final void method402(int arg0) {
        this.field4219 = 0;
        ++field4183;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field4219;
        }
        this.field4223 = 1 << this.field4219;
    }

    @OriginalMember(owner = "client!en", name = "p", descriptor = "()Z", line = 1831)
    public final boolean method440() {
        ++field4045;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)V", line = 1840)
    public final void method342(int arg0, int arg1, int arg2, int arg3) {
        this.field4199.method2912(arg2, arg0, arg3, (byte) -14, arg1);
        ++field4184;
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(B)I", line = 1852)
    private final int method1772(byte arg0) {
        ++field4123;
        int var2 = 0;
        this.field4340 = OpenGL.glGetString(7936).toLowerCase();
        this.field4358 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field4340.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field4340.indexOf("brian paul") != -1 || ~this.field4340.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class533.method2945(arg0 ^ -18957, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class551.method3028(arg0 ^ 91, var4[0]);
                int var6 = class551.method3028(4, var4[1]);
                this.field4316 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field4316 < 12) {
            var2 |= 2;
        }
        if (!this.field4080.method3139("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4080.method3139("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4326 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field4324 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field4276 = var7[0];
        if (~this.field4326 > -3 || this.field4324 < 2 || this.field4276 < 2) {
            var2 |= 16;
        }
        this.field4362 = Stream.method3418();
        this.field4080.arePbuffersAvailable();
        this.field4258 = this.field4080.method3139("GL_ARB_vertex_buffer_object");
        this.field4356 = this.field4080.method3139("GL_ARB_multisample");
        if (arg0 != 95) {
            this.field4217 = null;
        }
        this.field4247 = this.field4080.method3139("GL_ARB_vertex_program");
        this.field4080.method3139("GL_ARB_fragment_program");
        this.field4331 = this.field4080.method3139("GL_ARB_vertex_shader");
        this.field4301 = this.field4080.method3139("GL_ARB_fragment_shader");
        this.field4346 = this.field4080.method3139("GL_EXT_texture3D");
        this.field4335 = this.field4080.method3139("GL_ARB_texture_rectangle");
        this.field4325 = this.field4080.method3139("GL_ARB_texture_cube_map");
        this.field4250 = this.field4080.method3139("GL_ARB_texture_float");
        this.field4292 = false;
        this.field4252 = this.field4080.method3139("GL_EXT_framebuffer_object");
        this.field4263 = this.field4080.method3139("GL_EXT_framebuffer_blit");
        this.field4345 = this.field4080.method3139("GL_EXT_framebuffer_multisample");
        this.field4267 = this.field4345 & this.field4263;
        OpenGL.glGetFloatv(2834, class531.field7244, 0);
        this.field4259 = class531.field7244[1];
        this.field4287 = class531.field7244[0];
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!en", name = "sa", descriptor = "(II)V", line = 1944)
    public final void method428(int arg0, int arg1) {
        ++field4162;
        if (this.field4354 != arg0 || ~this.field4244 != ~arg1) {
            this.field4244 = arg1;
            this.field4354 = arg0;
            this.method1755(12);
            this.method1767((byte) -73);
            if (this.field4270 != 3) {
                if (this.field4270 == 2) {
                    this.method1821(5889);
                    return;
                }
            } else {
                this.method1795(5889);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lim;B)V", line = 1971)
    public final void method1773(class524 arg0, byte arg1) {
        ++field4166;
        OpenGL.glLoadMatrixf(arg0.method2908(9), 0);
        if (arg1 > -81) {
            this.method456(64, -31, 73, -44, 62, -112);
        }
    }

    @OriginalMember(owner = "client!en", name = "AA", descriptor = "(IIII)V", line = 1983)
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        this.field4319 = arg2;
        this.field4268 = arg0;
        this.field4317 = arg3;
        this.field4243 = arg1;
        ++field4063;
        this.field4309 = true;
        this.field4188.method2839(false, false, 3, (byte) 86, 0, 0);
        this.field4188.field6998.method260(-93);
        this.method1767((byte) -125);
        this.method1776(false);
    }

    @OriginalMember(owner = "client!en", name = "s", descriptor = "(I)V", line = 2001)
    private final void method1774(int arg0) {
        if (arg0 != 13808) {
            this.field4234 = -118;
        }
        ++field4122;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field4303.method2908(arg0 ^ 13817), 0);
        if (this.field4309) {
            this.field4188.field6998.method260(-102);
        }
        this.method1745((byte) -110);
        this.method1814(-108);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(IIIIII)V", line = 2020)
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1771((byte) 58);
        ++field4020;
        this.method1768(arg5, -68);
        float var7 = (float) arg2 - (float) arg0;
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

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I", line = 2045)
    public final int method431(int arg0, int arg1) {
        ++field4191;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!en", name = "ma", descriptor = "(IIIIII[BII)V", line = 2054)
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4213;
        float var10;
        float var11;
        if (this.field4299 != null && ~this.field4299.field9165 <= ~arg2 && arg3 <= this.field4299.field9171) {
            this.field4299.method3597(arg2, arg6, false, 0, arg3, 0, 0, 0, 6406, 4);
            var10 = (float) arg3 * this.field4299.field300 / (float) this.field4299.field9171;
            var11 = (float) arg2 * this.field4299.field299 / (float) this.field4299.field9165;
        } else {
            this.field4299 = class403.method2307(6406, arg2, arg6, 6406, false, (byte) -97, arg3, this);
            this.field4299.method3601(false, false, -125);
            var10 = this.field4299.field300;
            var11 = this.field4299.field299;
        }
        this.method1808(-65);
        this.method1804(false, this.field4299);
        this.method1768(arg8, -99);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1761(arg5, 73);
        this.method1798(false, 34165, 34165);
        this.method1797(0, (byte) 100, 768, 34166);
        this.method1797(2, (byte) 23, 770, 5890);
        this.method1811(770, 0, false, 34166);
        this.method1811(770, 2, false, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method1797(0, (byte) 34, 768, 5890);
        this.method1797(2, (byte) 27, 770, 34166);
        this.method1811(770, 0, false, 5890);
        this.method1811(770, 2, false, 34166);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([Lba;Lq;[Lrc;I)V", line = 2111)
    public final void method393(class352[] arg0, class391 arg1, class494[] arg2, int arg3) {
        ++field4028;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method205(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "t", descriptor = "(I)V", line = 2131)
    private final void method1775(int arg0) {
        class531.field7244[2] = this.field4310 * this.field4275;
        class531.field7244[0] = this.field4323 * this.field4310;
        ++field4078;
        class531.field7244[1] = this.field4310 * this.field4265;
        class531.field7244[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class531.field7244, 0);
        class531.field7244[3] = 1.0F;
        class531.field7244[0] = -this.field4262 * this.field4323;
        if (arg0 > 21) {
            class531.field7244[1] = -this.field4262 * this.field4265;
            class531.field7244[2] = -this.field4262 * this.field4275;
            OpenGL.glLightfv(16385, 4609, class531.field7244, 0);
        }
    }

    @OriginalMember(owner = "client!en", name = "ka", descriptor = "(FF)V", line = 2151)
    public final void method462(float arg0, float arg1) {
        if (this.field4343 != arg0 || this.field4321 != arg1) {
            this.field4343 = arg0;
            this.field4321 = arg1;
            this.method1737(8192);
            if (~this.field4270 != -4) {
                if (this.field4270 == 2) {
                    this.method1821(5889);
                }
            } else {
                this.method1795(5889);
            }
        }
        ++field4163;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()Lfea;", line = 2176)
    public final class127 method340() {
        ++field4031;
        int var1 = -1;
        if (~this.field4340.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field4340.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (this.field4340.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class127(var1, "OpenGL", this.field4316, this.field4358, 0L);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lhfa;)V", line = 2197)
    public final void method419(class281 arg0) {
        ++field4202;
        this.field4201.method948(122, arg0, this);
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(Z)V", line = 2205)
    private final void method1776(boolean arg0) {
        if (this.field4246 && this.field4283 >= 0 | this.field4309) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0) {
            this.method1814(-67);
        }
        ++field4023;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(ZI)V", line = 2220)
    public final void method1777(boolean arg0, int arg1) {
        int var3 = 12 % ((arg1 - -48) / 40);
        ++field4107;
        if (!this.field4253 != !arg0) {
            this.field4253 = arg0;
            this.method1809(-93);
            this.field4302 &= -8;
        }
    }

    @OriginalMember(owner = "client!en", name = "t", descriptor = "()V", line = 2237)
    public final void method296() {
        this.field4199.method2910(31279);
        ++field4154;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZB)V", line = 2248)
    public final void method1778(boolean arg0, byte arg1) {
        if (arg1 == 28) {
            if (!arg0 != !this.field4246) {
                this.field4246 = arg0;
                this.method1776(false);
                this.field4302 &= -32;
            }
            ++field4024;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZ)V", line = 2266)
    public final void method1779(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field4302 = 31;
        }
        ++field4172;
        if (!this.field4297 != !arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field4302 &= -32;
            this.field4297 = arg1;
        }
    }

    @OriginalMember(owner = "client!en", name = "ya", descriptor = "(IIIII)V", line = 2287)
    public final void method414(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4129;
        this.method1771((byte) 89);
        this.method1768(arg4, -50);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!en", name = "ca", descriptor = "(IIII)V", line = 2307)
    public final void method442(int arg0, int arg1, int arg2, int arg3) {
        ++field4160;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (this.field4110 < arg2) {
            arg2 = this.field4110;
        }
        if (~arg3 < ~this.field4036) {
            arg3 = this.field4036;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        this.field4280 = arg0;
        this.field4336 = arg3;
        this.field4296 = arg1;
        this.field4348 = arg2;
        OpenGL.glEnable(3089);
        this.method1816(16760760);
        this.method1819(0);
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(IIIII)V", line = 2340)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1771((byte) -107);
        ++field4112;
        this.method1768(arg4, -114);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Luk;I)V", line = 2360)
    public final void method1780(class236 arg0, int arg1) {
        ++field4113;
        if (this.field4226 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg1 != 16640) {
                this.method1818();
            }
            if (this.field4226 >= 0) {
                this.field4229[this.field4226].method1485((byte) 66);
            }
            this.field4231 = this.field4229[++this.field4226] = arg0;
            this.field4231.method1488(59);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lkq;Z)Lxa;", line = 2380)
    public final class461 method412(class543 arg0, boolean arg1) {
        ++field4087;
        int[] var3 = new int[arg0.field7377 * arg0.field7373];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field7380 == null) {
            for (int var6 = 0; arg0.field7373 > var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field7377; ++var7) {
                    int var8 = arg0.field7376[arg0.field7378[var4++] & 255];
                    var3[var5++] = var8 != 0 ? class266.method1624(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field7373; ++var9) {
                for (int var11 = 0; arg0.field7377 > var11; ++var11) {
                    var3[var5++] = class266.method1624(arg0.field7380[var4] << 24, arg0.field7376[class249.method1537(255, arg0.field7378[var4])]);
                    ++var4;
                }
            }
        }
        class461 var10 = this.method452(var3, 0, arg0.field7377, arg0.field7377, arg0.field7373);
        var10.method34(arg0.field7375, arg0.field7374, arg0.field7381, arg0.field7379);
        return var10;
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(B)V", line = 2441)
    private final void method1781(byte arg0) {
        if (this.field4304) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4304 = false;
        }
        ++field4094;
        if (arg0 != 71) {
            this.method390((class352[]) null, (class281) null, (class391) null, (class494[]) null, 30);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(III)V", line = 2467)
    public final synchronized void method1782(int arg0, int arg1, int arg2) {
        ++field4111;
        if (arg2 != -17057) {
            method1791(true);
        }
        class108 var4 = new class108(arg1);
        var4.field7311 = (long) arg0;
        this.field4238.method1273(var4, (byte) 122);
    }

    @OriginalMember(owner = "client!en", name = "i", descriptor = "(B)V", line = 2482)
    private final void method1783(byte arg0) {
        class531.field7244[3] = 1.0F;
        if (arg0 != 82) {
            this.field4330 = 104;
        }
        class531.field7244[0] = this.field4323 * this.field4320;
        ++field4091;
        class531.field7244[1] = this.field4320 * this.field4265;
        class531.field7244[2] = this.field4320 * this.field4275;
        OpenGL.glLightModelfv(2899, class531.field7244, 0);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FFB)V", line = 2497)
    public final void method1784(float arg0, float arg1, byte arg2) {
        if (arg2 == -81) {
            this.field4349 = arg0;
            ++field4178;
            this.field4334 = arg1;
            if (!this.field4309) {
                this.method1767((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Luk;B)V", line = 2513)
    public final void method1785(class236 arg0, byte arg1) {
        if (arg1 != -1) {
            this.method1784(0.49414608F, -1.5551981F, (byte) 48);
        }
        ++field4147;
        if (this.field4263) {
            this.method1820(false, arg0);
            this.method1799(arg0, arg1 ^ -128);
        } else if (~this.field4228 <= -1 && this.field4230[this.field4228] == arg0) {
            this.field4230[this.field4228--] = null;
            arg0.method1484(6181);
            if (this.field4228 >= 0) {
                this.field4232 = this.field4231 = this.field4230[this.field4228];
                this.field4232.method1486((byte) 29);
            } else {
                this.field4232 = this.field4231 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([BZIBI)Lpn;", line = 2547)
    public final class682 method1786(byte[] arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -79) {
            return null;
        } else {
            ++field4146;
            return (class682) (!this.field4258 || arg1 && !this.field4344 ? new class642(this, arg2, arg0, arg4) : new class331(this, arg2, arg0, arg4, arg1));
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "()Z", line = 2563)
    public final boolean method424() {
        ++field4026;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lim;Z)V", line = 2571)
    public final void method1787(class524 arg0, boolean arg1) {
        if (!arg1) {
            ++field4187;
            OpenGL.glPushMatrix();
            OpenGL.glMultMatrixf(arg0.method2908(9), 0);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(JI)V", line = 2584)
    public final synchronized void method1788(long arg0, int arg1) {
        ++field4152;
        class539 var4 = new class539();
        if (arg1 <= 71) {
            this.method296();
        }
        var4.field7311 = arg0;
        this.field4242.method1273(var4, (byte) 122);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)V", line = 2598)
    public final void method1789(byte arg0, int arg1) {
        ++field4140;
        this.method1760(false, true, arg1);
        if (arg0 != -51) {
            this.field4307 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BF)V", line = 2609)
    public final void method1790(byte arg0, float arg1) {
        if (arg0 != -3) {
            this.field4036 = -117;
        }
        ++field4209;
        if (this.field4260 != arg1) {
            this.field4260 = arg1;
            if (~this.field4270 == -4) {
                this.method1795(arg0 ^ -5892);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(Z)V", line = 2629)
    public static void method1791(boolean arg0) {
        field4055 = null;
        if (arg0) {
            method1740(-29);
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(II)V", line = 2641)
    public final synchronized void method1792(int arg0, int arg1) {
        ++field4039;
        class108 var3 = new class108(arg0);
        if (arg1 != 4) {
            this.method1815(1);
        }
        this.field4239.method1273(var3, (byte) 122);
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(II)V", line = 2654)
    public final synchronized void method1793(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field4245 = null;
        }
        ++field4207;
        class539 var3 = new class539();
        var3.field7311 = (long) arg1;
        this.field4241.method1273(var3, (byte) 122);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZIILjaclib/memory/Buffer;)Lpn;", line = 2669)
    public final class682 method1794(int arg0, boolean arg1, int arg2, int arg3, Buffer arg4) {
        if (arg3 < 114) {
            this.method352(true);
        }
        ++field4170;
        return (class682) (!this.field4258 || arg1 && !this.field4344 ? new class642(this, arg2, arg4) : new class331(this, arg2, arg4, arg0, arg1));
    }

    @OriginalMember(owner = "client!en", name = "u", descriptor = "(I)V", line = 2690)
    private final void method1795(int arg0) {
        ++field4102;
        float var2 = (float) (-this.field4337) * this.field4260 / (float) this.field4318;
        float var3 = (float) (-this.field4269) * this.field4260 / (float) this.field4330;
        float var4 = (float) (-this.field4337 + this.field4110) * this.field4260 / (float) this.field4318;
        float var5 = (float) (this.field4036 - this.field4269) * this.field4260 / (float) this.field4330;
        OpenGL.glMatrixMode(arg0);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field4354 + -this.field4321), (double) ((float) this.field4244 - this.field4321));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V", line = 2714)
    public final synchronized void method299(int arg0) {
        ++field4059;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4237.method1274((byte) 98)) {
            class108 var12 = (class108) this.field4237.method1272(0);
            class597.field8286[var3++] = (int) var12.field7311;
            this.field4235 -= var12.field1479;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class597.field8286, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class597.field8286, 0);
            var3 = 0;
        }
        while (!this.field4238.method1274((byte) 94)) {
            class108 var11 = (class108) this.field4238.method1272(0);
            class597.field8286[var3++] = (int) var11.field7311;
            this.field4234 -= var11.field1479;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class597.field8286, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class597.field8286, 0);
            var3 = 0;
        }
        while (!this.field4239.method1274((byte) 118)) {
            class108 var10 = (class108) this.field4239.method1272(0);
            class597.field8286[var3++] = var10.field1479;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class597.field8286, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class597.field8286, 0);
            var3 = 0;
        }
        while (!this.field4240.method1274((byte) 116)) {
            class108 var9 = (class108) this.field4240.method1272(0);
            class597.field8286[var3++] = (int) var9.field7311;
            this.field4233 -= var9.field1479;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class597.field8286, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class597.field8286, 0);
            boolean var4 = false;
        }
        while (!this.field4236.method1274((byte) 122)) {
            class108 var8 = (class108) this.field4236.method1272(0);
            OpenGL.glDeleteLists((int) var8.field7311, var8.field1479);
        }
        while (!this.field4241.method1274((byte) 110)) {
            class539 var7 = this.field4241.method1272(0);
            OpenGL.glDeleteProgramARB((int) var7.field7311);
        }
        while (!this.field4242.method1274((byte) 97)) {
            class539 var6 = this.field4242.method1272(0);
            OpenGL.glDeleteObjectARB(var6.field7311);
        }
        while (!this.field4236.method1274((byte) 125)) {
            class108 var5 = (class108) this.field4236.method1272(0);
            OpenGL.glDeleteLists((int) var5.field7311, var5.field1479);
        }
        this.field4203.method2681(false);
        if (~this.method400() < -100663297 && this.field4306 + 60000L < class680.method3756(-92)) {
            System.gc();
            this.field4306 = class680.method3756(-56);
        }
        this.field4221 = var2;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lba;Lhfa;Lq;Lrc;I)V", line = 2880)
    public final void method434(class352 arg0, class281 arg1, class391 arg2, class494 arg3, int arg4) {
        arg0.method205(arg2, arg3, arg4);
        ++field4182;
        this.method419(arg1);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;I)V", line = 2889)
    public class289(Canvas arg0, class489 arg1, int arg2) {
        super(arg1);
        new class649();
        new class346(16);
        this.field4236 = new class192();
        this.field4237 = new class192();
        this.field4238 = new class192();
        this.field4239 = new class192();
        this.field4240 = new class192();
        this.field4241 = new class192();
        this.field4242 = new class192();
        this.field4260 = 1.0F;
        this.field4259 = -1.0F;
        this.field4273 = new float[4];
        this.field4286 = new class154[class323.field4777];
        this.field4285 = new float[16];
        this.field4295 = -1;
        this.field4262 = -1.0F;
        this.field4275 = 1.0F;
        this.field4271 = 8448;
        this.field4317 = 0;
        this.field4293 = 0;
        this.field4265 = 1.0F;
        this.field4330 = 512;
        this.field4269 = 0;
        this.field4318 = 512;
        this.field4266 = 0;
        this.field4336 = 0;
        this.field4310 = -1.0F;
        this.field4296 = 0;
        this.field4319 = -1;
        this.field4283 = -1;
        this.field4329 = 3584.0F;
        this.field4323 = 1.0F;
        this.field4338 = new float[4];
        this.field4342 = new float[4];
        this.field4244 = 3584;
        this.field4328 = 3584.0F;
        this.field4279 = 0;
        this.field4343 = 3000.0F;
        this.field4287 = -1.0F;
        this.field4349 = 0.0F;
        this.field4261 = true;
        this.field4314 = 8448;
        this.field4334 = 1.0F;
        this.field4243 = -1;
        this.field4348 = 0;
        this.field4280 = 0;
        this.field4337 = 0;
        this.field4339 = -1;
        this.field4354 = 50;
        this.field4360 = new float[4];
        this.field4289 = new class57(8192);
        this.field4364 = new byte[16384];
        this.field4366 = new int[1];
        this.field4367 = new int[1];
        this.field4368 = new int[1];
        this.field4215 = arg2;
        this.field4118 = this.field4159 = arg0;
        if (!class307.method1881("jaclib", false)) {
            throw new RuntimeException("");
        } else if (!class307.method1881("jaggl", false)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field4080 = new OpenGL();
                this.field4134 = this.field4095 = this.field4080.init(arg0, 8, 8, 8, 24, 0, this.field4215);
                if (~this.field4095 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1806(-22474);
                    int var4 = this.method1772((byte) 95);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field4282 = !this.field4362 ? 5121 : 33639;
                        if (this.field4358.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class533.method2945(-19028, this.field4358.replace('/', ' '), ' ');
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class226.method1445(var10.substring(1, 3), (byte) 106)) {
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
                                            if (~var10.length() <= -5 && class226.method1445(var10.substring(0, 4), (byte) 106)) {
                                                var5 = class551.method3028(4, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field4250 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field4258 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field4346 = false;
                                }
                            }
                            this.field4335 &= this.field4080.method3139("GL_ARB_half_float_pixel");
                            this.field4347 = true;
                            this.field4344 = this.field4258;
                        }
                        if (~this.field4340.indexOf("intel") != 0) {
                            this.field4252 = false;
                        }
                        this.field4350 = !this.field4340.equals("s3 graphics");
                        if (this.field4258) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class256.method1570(true, false, -102);
                        this.field4224 = true;
                        this.field4203 = new class471(this, super.field9050);
                        this.method1764(-14013);
                        this.field4220 = new class220(this);
                        this.field4199 = new class525(this);
                        if (this.field4199.method2913((byte) -82)) {
                            this.field4197 = new class693(this);
                            if (!this.field4197.method3805((byte) 51)) {
                                this.field4197.method528((byte) 17);
                                this.field4197 = null;
                            }
                        }
                        this.field4188 = new class512(this);
                        this.method1810(-1);
                        this.method1815(32884);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field4080.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (~(var12++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class419.method2390(126, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method306();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Li;", line = 3057)
    public final class37 method438(int arg0) {
        ++field4035;
        class168 var2 = new class168(arg0);
        this.field4218.method1273(var2, (byte) 122);
        return var2;
    }

    @OriginalMember(owner = "client!en", name = "A", descriptor = "([I)V", line = 3069)
    public final void method416(int[] arg0) {
        ++field4171;
        arg0[3] = this.field4336;
        arg0[1] = this.field4296;
        arg0[2] = this.field4348;
        arg0[0] = this.field4280;
    }

    @OriginalMember(owner = "client!en", name = "m", descriptor = "(IIII)V", line = 3080)
    public final void method404(int arg0, int arg1, int arg2, int arg3) {
        this.field4318 = arg2;
        ++field4034;
        this.field4330 = arg3;
        this.field4269 = arg1;
        this.field4337 = arg0;
        this.method1755(12);
        this.method1816(16760760);
        if (~this.field4270 != -4) {
            if (~this.field4270 == -3) {
                this.method1821(5889);
                return;
            }
        } else {
            this.method1795(5889);
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V", line = 3105)
    public final void method448(int arg0) {
        ++field4174;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field4189 = arg0;
            this.field4203.method2678(-67524572);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!en", name = "LA", descriptor = "(IIII)V", line = 3119)
    public final void method410(int arg0, int arg1, int arg2, int arg3) {
        ++field4144;
        if (!this.field4309) {
            throw new RuntimeException("");
        } else {
            this.field4319 = arg2;
            this.field4243 = arg1;
            this.field4317 = arg3;
            this.field4268 = arg0;
            this.field4188.field6998.method260(89);
            this.method1767((byte) -70);
        }
    }

    @OriginalMember(owner = "client!en", name = "v", descriptor = "(I)V", line = 3138)
    private final void method1796(int arg0) {
        if (arg0 <= 116) {
            this.field4319 = -113;
        }
        ++field4106;
        if (this.field4270 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field4110 > 0 && this.field4036 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field4110, (double) this.field4036, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4302 &= -25;
            this.field4270 = 1;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBII)V", line = 3165)
    public final void method1797(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg3);
        ++field4158;
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
        if (arg1 < 21) {
            this.method476();
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZII)V", line = 3182)
    public final void method1798(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            if (~this.field4251 != -1) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                OpenGL.glTexEnvi(8960, 34162, arg1);
            } else {
                boolean var4 = false;
                if (this.field4271 != arg2) {
                    OpenGL.glTexEnvi(8960, 34161, arg2);
                    this.field4271 = arg2;
                    var4 = true;
                }
                if (this.field4314 != arg1) {
                    OpenGL.glTexEnvi(8960, 34162, arg1);
                    var4 = true;
                    this.field4314 = arg1;
                }
                if (var4) {
                    this.field4302 &= -30;
                }
            }
            ++field4033;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Luk;I)V", line = 3224)
    public final void method1799(class236 arg0, int arg1) {
        ++field4096;
        if (arg1 >= 125) {
            if (~this.field4226 <= -1 && this.field4229[this.field4226] == arg0) {
                this.field4229[this.field4226--] = null;
                arg0.method1485((byte) 73);
                if (this.field4226 >= 0) {
                    this.field4231 = this.field4229[this.field4226];
                    this.field4231.method1488(56);
                } else {
                    this.field4231 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "ha", descriptor = "(F)V", line = 3248)
    public final void method465(float arg0) {
        ++field4084;
        if (this.field4320 != arg0) {
            this.field4320 = arg0;
            this.method1783((byte) 82);
        }
    }

    @OriginalMember(owner = "client!en", name = "KA", descriptor = "(IIII)[I", line = 3267)
    public final int[] method360(int arg0, int arg1, int arg2, int arg3) {
        ++field4180;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field4036 - (arg1 + var6), arg2, 1, 32993, this.field4282, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(Z)V", line = 3288)
    public final void method1800(boolean arg0) {
        if (this.field4302 != 8) {
            this.method1750(-3);
            this.method1778(true, (byte) 28);
            this.method1779(true, true);
            this.method1805(true, (byte) 58);
            this.method1768(1, -113);
            this.field4302 = 8;
        }
        if (!arg0) {
            ++field4058;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIF)Lld;", line = 3308)
    public final class154 method457(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4169;
        return new class334(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 3316)
    public final class136 method383(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4165;
        return new class540(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()I", line = 3324)
    public final int method473() {
        ++field4119;
        return 4;
    }

    @OriginalMember(owner = "client!en", name = "i", descriptor = "(II)V", line = 3332)
    public final void method1801(int arg0, int arg1) {
        ++field4124;
        if (arg1 == 34166) {
            if (~arg0 == -2) {
                this.method1798(false, 7681, 7681);
            } else if (~arg0 != -1) {
                if (arg0 == 2) {
                    this.method1798(false, 7681, 34165);
                } else {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.method1798(false, 34023, 34023);
                            return;
                        }
                    } else {
                        this.method1798(false, 8448, 260);
                    }
                }
            } else {
                this.method1798(false, 8448, 8448);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "s", descriptor = "()F", line = 3363)
    public final float method1802() {
        ++field4151;
        return this.field4321;
    }

    @OriginalMember(owner = "client!en", name = "j", descriptor = "(B)V", line = 3373)
    private final void method1803(byte arg0) {
        if (arg0 != 12) {
            this.field4225 = null;
        }
        ++field4075;
        this.field4080.method3140();
    }

    @OriginalMember(owner = "client!en", name = "C", descriptor = "()V", line = 3385)
    public final void method344() {
        ++field4150;
        this.method1805(true, (byte) 58);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLit;)V", line = 3397)
    public final void method1804(boolean arg0, class591 arg1) {
        ++field4062;
        class591 var3 = this.field4361[this.field4251];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field8241);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field8241);
                } else if (arg1.field8241 != var3.field8241) {
                    OpenGL.glDisable(var3.field8241);
                    OpenGL.glEnable(arg1.field8241);
                }
                OpenGL.glBindTexture(arg1.field8241, arg1.method3286(-108));
            }
            this.field4361[this.field4251] = arg1;
        }
        if (arg0) {
            this.method406();
        }
        this.field4302 &= -2;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(ZB)V", line = 3435)
    public final void method1805(boolean arg0, byte arg1) {
        ++field4025;
        if (arg1 == 58) {
            if (arg0 == !this.field4255) {
                this.field4255 = arg0;
                this.method1766(2);
                this.field4302 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIII)V", line = 3452)
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4064;
        this.method1771((byte) -98);
        this.method1768(arg9, -85);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!en", name = "w", descriptor = "(I)V", line = 3471)
    private final void method1806(int arg0) {
        ++field4192;
        if (arg0 != -22474) {
            this.method1793(39, 56);
        }
        int var2 = 0;
        while (!this.field4080.method3138()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class419.method2390(arg0 ^ -22451, 1000L);
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(III)V", line = 3496)
    public final synchronized void method1807(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            ++field4086;
            class108 var4 = new class108(arg2);
            var4.field7311 = (long) arg0;
            this.field4237.method1273(var4, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!en", name = "x", descriptor = "(I)V", line = 3511)
    public final void method1808(int arg0) {
        if (this.field4302 != 2) {
            this.method1796(120);
            this.method1778(false, (byte) 28);
            this.method1777(false, -128);
            this.method1779(true, false);
            this.method1805(false, (byte) 58);
            this.method1789((byte) -51, -2);
            this.field4302 = 2;
        }
        if (arg0 >= -19) {
            this.method477(-94, 98, -44, -107, 120);
        }
        ++field4139;
    }

    @OriginalMember(owner = "client!en", name = "y", descriptor = "(I)V", line = 3534)
    private final void method1809(int arg0) {
        ++field4053;
        if (this.field4253 && !this.field4359) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 >= -20) {
            this.method1766(104);
        }
    }

    @OriginalMember(owner = "client!en", name = "z", descriptor = "(I)V", line = 3550)
    private final void method1810(int arg0) {
        ++field4141;
        this.method1789((byte) -51, -2);
        for (int var2 = this.field4326 - 1; ~var2 <= -1; --var2) {
            this.method1747(var2, (byte) 108);
            this.method1804(false, (class591) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1798(false, 8448, 8448);
        this.method1797(2, (byte) 57, 770, 34168);
        this.method1781((byte) 71);
        this.field4290 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4333 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4300 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4341 = true;
        this.method1778(true, (byte) 28);
        this.method1777(true, 18);
        this.method1779(true, true);
        this.method1805(true, (byte) 58);
        this.method1749(arg0);
        this.field4080.setSwapInterval(0);
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
        for (int var4 = 0; var4 < 8; ++var4) {
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
        this.field4295 = this.field4339 = arg0;
        this.method449();
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZI)V", line = 3619)
    public final void method1811(int arg0, int arg1, boolean arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
        ++field4060;
        OpenGL.glTexEnvi(8960, 34200 - -arg1, arg0);
        if (arg2) {
            this.field4308 = -50;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([IIIII)Lxa;", line = 3635)
    public final class461 method452(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4100;
        return new class186(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lka;)V", line = 3643)
    public final void method432(class434 arg0) {
        ++field4185;
        this.field4353 = (class159) arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FFFBF)V", line = 3656)
    public final void method1812(float arg0, float arg1, float arg2, byte arg3, float arg4) {
        class531.field7244[2] = arg2;
        ++field4065;
        class531.field7244[3] = arg4;
        class531.field7244[1] = arg1;
        class531.field7244[0] = arg0;
        if (arg3 > -20) {
            this.method390((class352[]) null, (class281) null, (class391) null, (class494[]) null, 51);
        }
        OpenGL.glTexEnvfv(8960, 8705, class531.field7244, 0);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()Lq;", line = 3672)
    public final class391 method401() {
        ++field4076;
        return this.field4216;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3682)
    public final void method437(Canvas arg0) {
        ++field4104;
        if (this.field4159 == arg0) {
            throw new RuntimeException();
        } else if (this.field4175.containsKey(arg0)) {
            Long var2 = (Long) this.field4175.get(arg0);
            this.field4080.releaseSurface(arg0, var2);
            this.field4175.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!en", name = "i", descriptor = "()Z", line = 3703)
    public final boolean method297() {
        ++field4108;
        if (this.field4197 != null) {
            if (!this.field4197.method536((byte) 63)) {
                if (!this.field4199.method2911(3125, this.field4197)) {
                    return false;
                }
                this.field4203.method2678(-67524572);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)V", line = 3729)
    public final void method1813(int arg0, int arg1, byte arg2) {
        int var4 = 55 % ((-47 - arg2) / 53);
        this.field4266 = arg1;
        ++field4105;
        this.field4279 = arg0;
        this.method1738(19520);
        this.method1819(0);
    }

    @OriginalMember(owner = "client!en", name = "A", descriptor = "(I)V", line = 3747)
    private final void method1814(int arg0) {
        ++field4101;
        int var2 = 0;
        int var3 = -41 / ((arg0 - -63) / 40);
        while (~this.field4351 < ~var2) {
            class154 var4 = this.field4286[var2];
            class610.field8480[0] = (float) var4.method1079(-868177151);
            int var5 = var2 + 16386;
            class610.field8480[1] = (float) var4.method1076(false);
            class610.field8480[2] = (float) var4.method1074(0);
            class610.field8480[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class610.field8480, 0);
            int var6 = var4.method1083(true);
            float var7 = var4.method1081(-21) / 255.0F;
            class610.field8480[2] = var7 * (float) class249.method1537(255, var6);
            class610.field8480[1] = (float) class249.method1537(255, var6 >> 8) * var7;
            class610.field8480[0] = (float) (class249.method1537(var6, 16760760) >> 16) * var7;
            OpenGL.glLightfv(var5, 4609, class610.field8480, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var4.method1072(2) * var4.method1072(2)));
            OpenGL.glEnable(var5);
            ++var2;
        }
        while (var2 < this.field4327) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field4327 = this.field4351;
    }

    @OriginalMember(owner = "client!en", name = "B", descriptor = "(I)V", line = 3791)
    private final void method1815(int arg0) {
        ++field4193;
        if (this.field4118 == null) {
            this.field4079 = this.field4133 = 0;
        } else {
            Dimension var2 = this.field4118.getSize();
            this.field4133 = var2.height;
            this.field4079 = var2.width;
        }
        if (arg0 != 32884) {
            this.field4197 = null;
        }
        if (this.field4231 == null) {
            this.field4110 = this.field4079;
            this.field4036 = this.field4133;
            this.method1738(19520);
        }
        this.method1749(-1);
        this.method449();
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V", line = 3820)
    public final void method352(boolean arg0) {
        ++field4142;
    }

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "(IIII)V", line = 3832)
    public final void method433(int arg0, int arg1, int arg2, int arg3) {
        ++field4082;
        if (arg0 > this.field4280) {
            this.field4280 = arg0;
        }
        if (~this.field4336 < ~arg3) {
            this.field4336 = arg3;
        }
        if (this.field4296 < arg1) {
            this.field4296 = arg1;
        }
        if (this.field4348 > arg2) {
            this.field4348 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method1816(16760760);
        this.method1819(0);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(IIIIII)V", line = 3860)
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4044;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method1771((byte) -67);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1768(arg5, -89);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4356) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4356) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V", line = 3893)
    public final void method386(int arg0) {
        ++field4047;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!en", name = "C", descriptor = "(I)V", line = 3906)
    private final void method1816(int arg0) {
        this.field4274 = (float) (-this.field4269 + this.field4336);
        this.field4352 = (float) (-this.field4337 + this.field4280);
        this.field4272 = (float) (-this.field4337 + this.field4348);
        if (arg0 != 16760760) {
            this.field4368 = null;
        }
        this.field4322 = (float) (-this.field4269 + this.field4296);
        ++field4043;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Luk;Z)V", line = 3924)
    public final void method1817(class236 arg0, boolean arg1) {
        ++field4068;
        if (this.field4263) {
            this.method1756(arg0, 3);
            this.method1780(arg0, 16640);
        } else {
            if (this.field4228 >= 3) {
                throw new RuntimeException();
            }
            if (~this.field4228 <= -1) {
                this.field4230[this.field4228].method1484(6181);
            }
            this.field4232 = this.field4231 = this.field4230[++this.field4228] = arg0;
            this.field4232.method1486((byte) 29);
        }
        if (arg1) {
            this.field4235 = -103;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 3959)
    public final void method413(Canvas arg0) {
        ++field4049;
        if (this.field4159 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4175.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field4080.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field4175.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "E", descriptor = "()F", line = 3994)
    public final float method1818() {
        ++field4103;
        return this.field4343;
    }

    @OriginalMember(owner = "client!en", name = "B", descriptor = "()Lq;", line = 4011)
    public final class391 method459() {
        ++field4190;
        return new class524();
    }

    @OriginalMember(owner = "client!en", name = "x", descriptor = "()Z", line = 4021)
    public final boolean method447() {
        ++field4051;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 4035)
    public final void method395(Canvas arg0) {
        ++field4116;
        long var2 = 0L;
        if (arg0 != null && this.field4159 != arg0) {
            if (this.field4175.containsKey(arg0)) {
                Long var4 = (Long) this.field4175.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field4095;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field4080.surfaceResized(var2);
            if (this.field4118 == arg0) {
                this.method1815(32884);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "D", descriptor = "()V", line = 4066)
    public final void method306() {
        for (class539 var1 = this.field4218.method1270((byte) -25); var1 != null; var1 = this.field4218.method1282(0)) {
            ((class168) var1).method1158(-128);
        }
        ++field4083;
        if (this.field4199 != null) {
            this.field4199.method2916(95);
        }
        if (this.field4080 != null) {
            this.method1803((byte) 12);
            Enumeration var2 = this.field4175.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4175.get(var3);
                this.field4080.releaseSurface(var3, var4);
            }
            this.field4080.release();
            this.field4080 = null;
        }
        if (this.field4224) {
            class256.method1572(false, true, false);
            this.field4224 = false;
        }
    }

    @OriginalMember(owner = "client!en", name = "E", descriptor = "(I)V", line = 4111)
    private final void method1819(int arg0) {
        if (arg0 != 0) {
            this.field4312 = null;
        }
        ++field4156;
        if (this.field4348 >= this.field4280 && this.field4296 <= this.field4336) {
            OpenGL.glScissor(this.field4280 + this.field4266, this.field4279 + this.field4036 + -this.field4336, -this.field4280 + this.field4348, -this.field4296 + this.field4336);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLuk;)V", line = 4130)
    public final void method1820(boolean arg0, class236 arg1) {
        ++field4164;
        if (~this.field4227 <= -1 && this.field4225[this.field4227] == arg1) {
            this.field4225[this.field4227--] = null;
            arg1.method1487(arg0);
            if (~this.field4227 > -1) {
                this.field4232 = null;
            } else {
                this.field4232 = this.field4225[this.field4227];
                this.field4232.method1489(false);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!en", name = "F", descriptor = "(I)V", line = 4151)
    private final void method1821(int arg0) {
        OpenGL.glMatrixMode(arg0);
        ++field4131;
        OpenGL.glLoadMatrixf(this.field4285, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!en", name = "n", descriptor = "()Z", line = 4166)
    public final boolean method476() {
        ++field4067;
        return this.field4356 && (!this.method308() || this.field4267);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()Z", line = 4177)
    public final boolean method411() {
        ++field4018;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "U", descriptor = "()I", line = 4186)
    public final int method451() {
        ++field4109;
        return this.field4354;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(Z)V", line = 4195)
    public final void method387(boolean arg0) {
        this.field4261 = arg0;
        ++field4126;
        this.method1766(2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILqa;IBI)V", line = 4208)
    public final void method1822(int arg0, class224 arg1, int arg2, byte arg3, int arg4) {
        ++field4041;
        int var6 = arg1.method965(24);
        int var7 = arg2 * this.method1758(var6, false);
        if (arg3 == 63) {
            this.method1769(arg1, true);
            OpenGL.glDrawElements(arg4, arg0, var6, arg1.method971(20055) + (long) var7);
        }
    }
}
