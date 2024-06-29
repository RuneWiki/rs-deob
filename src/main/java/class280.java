import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class280 extends class66 {

    @OriginalMember(owner = "client!kv", name = "fb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3991 = new Hashtable();

    @OriginalMember(owner = "client!kv", name = "ne", descriptor = "I")
    public int field4155 = 128;

    @OriginalMember(owner = "client!kv", name = "ke", descriptor = "Lkg;")
    private class283 field4152 = new class283();

    @OriginalMember(owner = "client!kv", name = "te", descriptor = "Lvha;")
    private class712 field4161 = new class712();

    @OriginalMember(owner = "client!kv", name = "ue", descriptor = "Lvha;")
    public class712 field4162 = new class712();

    @OriginalMember(owner = "client!kv", name = "we", descriptor = "Z")
    private boolean field4164 = false;

    @OriginalMember(owner = "client!kv", name = "xe", descriptor = "I")
    public int field4165 = 3;

    @OriginalMember(owner = "client!kv", name = "Be", descriptor = "I")
    public int field4169 = 8;

    @OriginalMember(owner = "client!kv", name = "ye", descriptor = "Lga;")
    private class420 field4166 = new class420();

    @OriginalMember(owner = "client!kv", name = "Ce", descriptor = "I")
    private int field4170 = -1;

    @OriginalMember(owner = "client!kv", name = "Ee", descriptor = "[Lvl;")
    private class15[] field4172 = new class15[4];

    @OriginalMember(owner = "client!kv", name = "He", descriptor = "I")
    private int field4175 = -1;

    @OriginalMember(owner = "client!kv", name = "Ie", descriptor = "[Lvl;")
    private class15[] field4176 = new class15[4];

    @OriginalMember(owner = "client!kv", name = "Ge", descriptor = "[Lvl;")
    private class15[] field4174 = new class15[4];

    @OriginalMember(owner = "client!kv", name = "Ke", descriptor = "I")
    private int field4178 = -1;

    @OriginalMember(owner = "client!kv", name = "Me", descriptor = "Lga;")
    private class420 field4180;

    @OriginalMember(owner = "client!kv", name = "Qe", descriptor = "Lga;")
    private class420 field4184;

    @OriginalMember(owner = "client!kv", name = "Re", descriptor = "Lga;")
    private class420 field4185;

    @OriginalMember(owner = "client!kv", name = "Se", descriptor = "Lga;")
    private class420 field4186;

    @OriginalMember(owner = "client!kv", name = "Te", descriptor = "Lga;")
    private class420 field4187;

    @OriginalMember(owner = "client!kv", name = "Ue", descriptor = "Lga;")
    private class420 field4188;

    @OriginalMember(owner = "client!kv", name = "Ve", descriptor = "Lga;")
    private class420 field4189;

    @OriginalMember(owner = "client!kv", name = "Ye", descriptor = "Lvha;")
    public class712 field4192;

    @OriginalMember(owner = "client!kv", name = "ff", descriptor = "Lvha;")
    public class712 field4199;

    @OriginalMember(owner = "client!kv", name = "gf", descriptor = "Lvha;")
    public class712 field4200;

    @OriginalMember(owner = "client!kv", name = "kf", descriptor = "F")
    public float field4203;

    @OriginalMember(owner = "client!kv", name = "Cf", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!kv", name = "Pf", descriptor = "[Ljw;")
    private class578[] field4234;

    @OriginalMember(owner = "client!kv", name = "jf", descriptor = "F")
    private float field4202;

    @OriginalMember(owner = "client!kv", name = "Of", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!kv", name = "lf", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!kv", name = "gg", descriptor = "F")
    public float field4251;

    @OriginalMember(owner = "client!kv", name = "Jf", descriptor = "I")
    private int field4228;

    @OriginalMember(owner = "client!kv", name = "Sf", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!kv", name = "Yf", descriptor = "[F")
    private float[] field4243;

    @OriginalMember(owner = "client!kv", name = "pg", descriptor = "[F")
    public float[] field4260;

    @OriginalMember(owner = "client!kv", name = "qf", descriptor = "F")
    public float field4209;

    @OriginalMember(owner = "client!kv", name = "jg", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!kv", name = "nf", descriptor = "Z")
    private boolean field4206;

    @OriginalMember(owner = "client!kv", name = "Zf", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!kv", name = "Wf", descriptor = "F")
    public float field4241;

    @OriginalMember(owner = "client!kv", name = "Bf", descriptor = "F")
    public float field4220;

    @OriginalMember(owner = "client!kv", name = "rg", descriptor = "I")
    private int field4262;

    @OriginalMember(owner = "client!kv", name = "If", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!kv", name = "sg", descriptor = "I")
    private int field4263;

    @OriginalMember(owner = "client!kv", name = "mg", descriptor = "Z")
    private boolean field4257;

    @OriginalMember(owner = "client!kv", name = "Ig", descriptor = "I")
    public int field4279;

    @OriginalMember(owner = "client!kv", name = "Bg", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!kv", name = "Pg", descriptor = "[F")
    private float[] field4286;

    @OriginalMember(owner = "client!kv", name = "tg", descriptor = "[F")
    private float[] field4264;

    @OriginalMember(owner = "client!kv", name = "wg", descriptor = "I")
    private int field4267;

    @OriginalMember(owner = "client!kv", name = "Ag", descriptor = "I")
    private int field4271;

    @OriginalMember(owner = "client!kv", name = "Wg", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!kv", name = "Xg", descriptor = "I")
    private int field4294;

    @OriginalMember(owner = "client!kv", name = "Nf", descriptor = "F")
    public float field4232;

    @OriginalMember(owner = "client!kv", name = "Hg", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!kv", name = "Sg", descriptor = "F")
    private float field4289;

    @OriginalMember(owner = "client!kv", name = "wf", descriptor = "[F")
    private float[] field4215;

    @OriginalMember(owner = "client!kv", name = "ah", descriptor = "I")
    private int field4297;

    @OriginalMember(owner = "client!kv", name = "tf", descriptor = "I")
    private int field4212;

    @OriginalMember(owner = "client!kv", name = "ig", descriptor = "F")
    public float field4253;

    @OriginalMember(owner = "client!kv", name = "Zg", descriptor = "F")
    private float field4296;

    @OriginalMember(owner = "client!kv", name = "fg", descriptor = "F")
    private float field4250;

    @OriginalMember(owner = "client!kv", name = "dh", descriptor = "I")
    private int field4300;

    @OriginalMember(owner = "client!kv", name = "kh", descriptor = "F")
    private float field4307;

    @OriginalMember(owner = "client!kv", name = "oh", descriptor = "I")
    public int field4311;

    @OriginalMember(owner = "client!kv", name = "Mf", descriptor = "Ldca;")
    public class186 field4231;

    @OriginalMember(owner = "client!kv", name = "ph", descriptor = "[B")
    public byte[] field4312;

    @OriginalMember(owner = "client!kv", name = "sh", descriptor = "[I")
    public int[] field4315;

    @OriginalMember(owner = "client!kv", name = "rh", descriptor = "[I")
    public int[] field4314;

    @OriginalMember(owner = "client!kv", name = "uh", descriptor = "[I")
    public int[] field4317;

    @OriginalMember(owner = "client!kv", name = "le", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!kv", name = "md", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4102;

    @OriginalMember(owner = "client!kv", name = "uc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4058;

    @OriginalMember(owner = "client!kv", name = "wb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4008;

    @OriginalMember(owner = "client!kv", name = "Vc", descriptor = "J")
    private long field4085;

    @OriginalMember(owner = "client!kv", name = "Tb", descriptor = "J")
    private long field4031;

    @OriginalMember(owner = "client!kv", name = "Lf", descriptor = "Z")
    public boolean field4230;

    @OriginalMember(owner = "client!kv", name = "Cg", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!kv", name = "rf", descriptor = "Ljava/lang/String;")
    private String field4210;

    @OriginalMember(owner = "client!kv", name = "eg", descriptor = "Z")
    public boolean field4249;

    @OriginalMember(owner = "client!kv", name = "Xf", descriptor = "Z")
    private boolean field4242;

    @OriginalMember(owner = "client!kv", name = "Vf", descriptor = "Z")
    public boolean field4240;

    @OriginalMember(owner = "client!kv", name = "Ug", descriptor = "Z")
    public boolean field4291;

    @OriginalMember(owner = "client!kv", name = "hh", descriptor = "Z")
    public boolean field4304;

    @OriginalMember(owner = "client!kv", name = "kg", descriptor = "Z")
    private boolean field4255;

    @OriginalMember(owner = "client!kv", name = "Fg", descriptor = "Ljava/lang/String;")
    private String field4276;

    @OriginalMember(owner = "client!kv", name = "Og", descriptor = "Z")
    public boolean field4285;

    @OriginalMember(owner = "client!kv", name = "mh", descriptor = "Z")
    private boolean field4309;

    @OriginalMember(owner = "client!kv", name = "je", descriptor = "Ltm;")
    private class407 field4151;

    @OriginalMember(owner = "client!kv", name = "Ae", descriptor = "Lhfa;")
    public class327 field4168;

    @OriginalMember(owner = "client!kv", name = "oe", descriptor = "Lgi;")
    private class705 field4156;

    @OriginalMember(owner = "client!kv", name = "me", descriptor = "Ldi;")
    private class136 field4154;

    @OriginalMember(owner = "client!kv", name = "qe", descriptor = "Lsg;")
    private class415 field4158;

    @OriginalMember(owner = "client!kv", name = "Pb", descriptor = "Lke;")
    public static class622 field4027 = new class622(94, 4);

    @OriginalMember(owner = "client!kv", name = "Gf", descriptor = "F")
    private float field4225;

    @OriginalMember(owner = "client!kv", name = "Tf", descriptor = "F")
    public float field4238;

    @OriginalMember(owner = "client!kv", name = "Uf", descriptor = "F")
    public float field4239;

    @OriginalMember(owner = "client!kv", name = "ag", descriptor = "F")
    private float field4245;

    @OriginalMember(owner = "client!kv", name = "dg", descriptor = "F")
    public float field4248;

    @OriginalMember(owner = "client!kv", name = "ug", descriptor = "F")
    public float field4265;

    @OriginalMember(owner = "client!kv", name = "Dg", descriptor = "F")
    public float field4274;

    @OriginalMember(owner = "client!kv", name = "Yg", descriptor = "F")
    public float field4295;

    @OriginalMember(owner = "client!kv", name = "nh", descriptor = "F")
    private float field4310;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!kv", name = "L", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!kv", name = "M", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!kv", name = "N", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!kv", name = "O", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!kv", name = "P", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!kv", name = "Q", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!kv", name = "R", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!kv", name = "S", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!kv", name = "T", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!kv", name = "U", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!kv", name = "V", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!kv", name = "W", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!kv", name = "X", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!kv", name = "Y", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!kv", name = "Z", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!kv", name = "ab", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!kv", name = "bb", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!kv", name = "cb", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!kv", name = "db", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!kv", name = "eb", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!kv", name = "gb", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!kv", name = "hb", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!kv", name = "ib", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!kv", name = "jb", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!kv", name = "kb", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!kv", name = "lb", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!kv", name = "mb", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!kv", name = "nb", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!kv", name = "ob", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!kv", name = "pb", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!kv", name = "qb", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!kv", name = "rb", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!kv", name = "sb", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!kv", name = "tb", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!kv", name = "ub", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!kv", name = "vb", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!kv", name = "xb", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!kv", name = "yb", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!kv", name = "zb", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!kv", name = "Ab", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!kv", name = "Bb", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!kv", name = "Cb", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!kv", name = "Db", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!kv", name = "Eb", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!kv", name = "Fb", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!kv", name = "Gb", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!kv", name = "Hb", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!kv", name = "Ib", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!kv", name = "Jb", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!kv", name = "Kb", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!kv", name = "Lb", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!kv", name = "Mb", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!kv", name = "Nb", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!kv", name = "Ob", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!kv", name = "Qb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!kv", name = "Rb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!kv", name = "Sb", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!kv", name = "Ub", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!kv", name = "Vb", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!kv", name = "Wb", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!kv", name = "Xb", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!kv", name = "Yb", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!kv", name = "Zb", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!kv", name = "ac", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!kv", name = "bc", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!kv", name = "cc", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!kv", name = "dc", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!kv", name = "ec", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!kv", name = "fc", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!kv", name = "gc", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!kv", name = "hc", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!kv", name = "ic", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!kv", name = "jc", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!kv", name = "kc", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!kv", name = "lc", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!kv", name = "mc", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!kv", name = "nc", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!kv", name = "oc", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!kv", name = "pc", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!kv", name = "qc", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!kv", name = "rc", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!kv", name = "sc", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!kv", name = "tc", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!kv", name = "vc", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!kv", name = "wc", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!kv", name = "xc", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!kv", name = "yc", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!kv", name = "zc", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!kv", name = "Ac", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!kv", name = "Bc", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!kv", name = "Cc", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!kv", name = "Dc", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!kv", name = "Ec", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!kv", name = "Fc", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!kv", name = "Gc", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!kv", name = "Hc", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!kv", name = "Ic", descriptor = "I")
    private int field4072;

    @OriginalMember(owner = "client!kv", name = "Jc", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!kv", name = "Kc", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!kv", name = "Lc", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!kv", name = "Mc", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!kv", name = "Nc", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!kv", name = "Oc", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!kv", name = "Pc", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!kv", name = "Qc", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!kv", name = "Rc", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!kv", name = "Sc", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!kv", name = "Tc", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!kv", name = "Uc", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!kv", name = "Wc", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!kv", name = "Xc", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!kv", name = "Yc", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!kv", name = "Zc", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!kv", name = "ad", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!kv", name = "bd", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!kv", name = "cd", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!kv", name = "dd", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!kv", name = "ed", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!kv", name = "fd", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!kv", name = "gd", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!kv", name = "hd", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!kv", name = "id", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!kv", name = "jd", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!kv", name = "kd", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!kv", name = "ld", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!kv", name = "nd", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!kv", name = "od", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!kv", name = "pd", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!kv", name = "qd", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!kv", name = "rd", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!kv", name = "sd", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!kv", name = "td", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!kv", name = "ud", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!kv", name = "vd", descriptor = "I")
    private int field4111;

    @OriginalMember(owner = "client!kv", name = "wd", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!kv", name = "xd", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!kv", name = "yd", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!kv", name = "zd", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!kv", name = "Ad", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!kv", name = "Bd", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!kv", name = "Cd", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!kv", name = "Dd", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!kv", name = "Ed", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!kv", name = "Fd", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!kv", name = "Gd", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!kv", name = "Hd", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!kv", name = "Id", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!kv", name = "Jd", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!kv", name = "Kd", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!kv", name = "Ld", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!kv", name = "Md", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!kv", name = "Nd", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!kv", name = "Od", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!kv", name = "Pd", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!kv", name = "Qd", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!kv", name = "Rd", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!kv", name = "Sd", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!kv", name = "Td", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!kv", name = "Ud", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!kv", name = "Vd", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!kv", name = "Wd", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!kv", name = "Xd", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!kv", name = "Yd", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!kv", name = "Zd", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!kv", name = "ae", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!kv", name = "be", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!kv", name = "ce", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!kv", name = "de", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!kv", name = "ee", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!kv", name = "fe", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!kv", name = "ge", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!kv", name = "he", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!kv", name = "ie", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!kv", name = "pe", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!kv", name = "re", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!kv", name = "se", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!kv", name = "ze", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!kv", name = "Ne", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!kv", name = "Oe", descriptor = "I")
    private int field4182;

    @OriginalMember(owner = "client!kv", name = "Pe", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!kv", name = "Xe", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!kv", name = "df", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!kv", name = "ef", descriptor = "I")
    private int field4198;

    @OriginalMember(owner = "client!kv", name = "mf", descriptor = "I")
    public int field4205;

    @OriginalMember(owner = "client!kv", name = "uf", descriptor = "I")
    private int field4213;

    @OriginalMember(owner = "client!kv", name = "Af", descriptor = "I")
    private int field4219;

    @OriginalMember(owner = "client!kv", name = "Ef", descriptor = "I")
    private int field4223;

    @OriginalMember(owner = "client!kv", name = "Ff", descriptor = "I")
    private int field4224;

    @OriginalMember(owner = "client!kv", name = "Kf", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!kv", name = "hg", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!kv", name = "lg", descriptor = "I")
    private int field4256;

    @OriginalMember(owner = "client!kv", name = "vg", descriptor = "I")
    private int field4266;

    @OriginalMember(owner = "client!kv", name = "yg", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!kv", name = "ch", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!kv", name = "ih", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!kv", name = "qh", descriptor = "I")
    private int field4313;

    @OriginalMember(owner = "client!kv", name = "th", descriptor = "I")
    private int field4316;

    @OriginalMember(owner = "client!kv", name = "Ze", descriptor = "J")
    private long field4193;

    @OriginalMember(owner = "client!kv", name = "Qf", descriptor = "Lho;")
    public class158 field4235;

    @OriginalMember(owner = "client!kv", name = "De", descriptor = "Lvl;")
    private class15 field4171;

    @OriginalMember(owner = "client!kv", name = "Fe", descriptor = "Lvl;")
    private class15 field4173;

    @OriginalMember(owner = "client!kv", name = "cg", descriptor = "Lmda;")
    private class274 field4247;

    @OriginalMember(owner = "client!kv", name = "pf", descriptor = "Lwv;")
    public class37 field4208;

    @OriginalMember(owner = "client!kv", name = "og", descriptor = "Lwv;")
    public class37 field4259;

    @OriginalMember(owner = "client!kv", name = "zg", descriptor = "Lwv;")
    public class37 field4270;

    @OriginalMember(owner = "client!kv", name = "Eg", descriptor = "Lwv;")
    public class37 field4275;

    @OriginalMember(owner = "client!kv", name = "Gg", descriptor = "Lwv;")
    public class37 field4277;

    @OriginalMember(owner = "client!kv", name = "Jg", descriptor = "Lwv;")
    public class37 field4280;

    @OriginalMember(owner = "client!kv", name = "Kg", descriptor = "Lwv;")
    public class37 field4281;

    @OriginalMember(owner = "client!kv", name = "fh", descriptor = "Lwv;")
    public class37 field4302;

    @OriginalMember(owner = "client!kv", name = "gh", descriptor = "Lwv;")
    public class37 field4303;

    @OriginalMember(owner = "client!kv", name = "jh", descriptor = "Lwv;")
    public class37 field4306;

    @OriginalMember(owner = "client!kv", name = "sf", descriptor = "Lbp;")
    private class403 field4211;

    @OriginalMember(owner = "client!kv", name = "Le", descriptor = "Lsca;")
    private class50 field4179;

    @OriginalMember(owner = "client!kv", name = "yf", descriptor = "Lsca;")
    public class50 field4217;

    @OriginalMember(owner = "client!kv", name = "Je", descriptor = "Lqf;")
    private class708 field4177;

    @OriginalMember(owner = "client!kv", name = "Df", descriptor = "Lkb;")
    public class717 field4222;

    @OriginalMember(owner = "client!kv", name = "Lg", descriptor = "Lkb;")
    public class717 field4282;

    @OriginalMember(owner = "client!kv", name = "hf", descriptor = "Lic;")
    private class726 field4201;

    @OriginalMember(owner = "client!kv", name = "Vg", descriptor = "Lic;")
    private class726 field4292;

    @OriginalMember(owner = "client!kv", name = "xg", descriptor = "Lbo;")
    private class759 field4268;

    @OriginalMember(owner = "client!kv", name = "ve", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4163;

    @OriginalMember(owner = "client!kv", name = "We", descriptor = "Z")
    private boolean field4190;

    @OriginalMember(owner = "client!kv", name = "af", descriptor = "Z")
    private boolean field4194;

    @OriginalMember(owner = "client!kv", name = "bf", descriptor = "Z")
    private boolean field4195;

    @OriginalMember(owner = "client!kv", name = "cf", descriptor = "Z")
    private boolean field4196;

    @OriginalMember(owner = "client!kv", name = "of", descriptor = "Z")
    private boolean field4207;

    @OriginalMember(owner = "client!kv", name = "vf", descriptor = "Z")
    private boolean field4214;

    @OriginalMember(owner = "client!kv", name = "zf", descriptor = "Z")
    public boolean field4218;

    @OriginalMember(owner = "client!kv", name = "Hf", descriptor = "Z")
    private boolean field4226;

    @OriginalMember(owner = "client!kv", name = "Rf", descriptor = "Z")
    private boolean field4236;

    @OriginalMember(owner = "client!kv", name = "bg", descriptor = "Z")
    public boolean field4246;

    @OriginalMember(owner = "client!kv", name = "ng", descriptor = "Z")
    public boolean field4258;

    @OriginalMember(owner = "client!kv", name = "qg", descriptor = "Z")
    private boolean field4261;

    @OriginalMember(owner = "client!kv", name = "Mg", descriptor = "Z")
    public boolean field4283;

    @OriginalMember(owner = "client!kv", name = "Ng", descriptor = "Z")
    public boolean field4284;

    @OriginalMember(owner = "client!kv", name = "Qg", descriptor = "Z")
    public boolean field4287;

    @OriginalMember(owner = "client!kv", name = "Rg", descriptor = "Z")
    public boolean field4288;

    @OriginalMember(owner = "client!kv", name = "Tg", descriptor = "Z")
    private boolean field4290;

    @OriginalMember(owner = "client!kv", name = "bh", descriptor = "Z")
    public boolean field4298;

    @OriginalMember(owner = "client!kv", name = "eh", descriptor = "Z")
    private boolean field4301;

    @OriginalMember(owner = "client!kv", name = "lh", descriptor = "Z")
    public boolean field4308;

    @OriginalMember(owner = "client!kv", name = "xf", descriptor = "[Lfia;")
    private class599[] field4216;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "()Z")
    public final boolean method454() {
        ++field4150;
        if (this.field4154 != null) {
            if (!this.field4154.method3085(1)) {
                if (!this.field4156.method3991(this.field4154, (byte) -88)) {
                    return false;
                }
                this.field4151.method2456(3553);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "(II)V")
    public final void method1817(int arg0, int arg1) {
        if (~this.field4191 != ~arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg0 == 1) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg0 != -3) {
                if (~arg0 == -129) {
                    var4 = true;
                    var5 = 3;
                    var3 = true;
                } else {
                    var5 = 0;
                    var4 = false;
                    var3 = true;
                }
            } else {
                var4 = false;
                var5 = 2;
                var3 = true;
            }
            if (!var3 != !this.field4190) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field4190 = var3;
            }
            if (var4 == !this.field4196) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field4196 = var4;
            }
            if (~this.field4197 != ~var5) {
                if (~var5 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var5 != -3) {
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
                this.field4197 = var5;
            }
            this.field4198 &= -29;
            this.field4191 = arg0;
        }
        ++field4014;
        if (arg1 != 2) {
            this.method1833((byte) -80);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILvl;)V")
    public final void method1818(int arg0, class15 arg1) {
        ++field4010;
        if (this.field4175 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg0 <= this.field4175) {
                this.field4172[this.field4175].method134(795);
            }
            this.field4171 = this.field4172[++this.field4175] = arg1;
            this.field4171.method133(false);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIF)Ljw;")
    public final class578 method492(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3969;
        return new class381(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(Z)V")
    public final void method1819(boolean arg0) {
        if (!arg0) {
            ++field4159;
            OpenGL.glLightfv(16384, 4611, this.field4260, 0);
            OpenGL.glLightfv(16385, 4611, this.field4243, 0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)V")
    private final void method1820(int arg0) {
        if (this.field4058 == null) {
            this.field4072 = this.field4111 = 0;
        } else {
            Dimension var2 = this.field4058.getSize();
            this.field4072 = var2.width;
            this.field4111 = var2.height;
        }
        ++field4040;
        if (this.field4173 == null) {
            this.field4070 = this.field4111;
            this.field4129 = this.field4072;
            this.method1833((byte) -108);
        }
        this.method1887(arg0 + 95);
        if (arg0 != 0) {
            this.field4263 = 37;
        }
        this.method463();
    }

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "()Z")
    public final boolean method448() {
        ++field3960;
        return this.field4154 != null && this.field4154.method3085(1);
    }

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "(I)V")
    private final void method1821(int arg0) {
        ++field4054;
        if (arg0 < -85) {
            if (~this.field4198 != -2) {
                this.method1868(false);
                this.method1871(115, false);
                this.method1888(false, (byte) -127);
                this.method1892(false, 94);
                this.method1826(false, -85);
                this.method1840((class599) null, 2205);
                this.method1873((byte) 23, -2);
                this.method1889(false, 1);
                this.field4198 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(II)V")
    public final void method446(int arg0, int arg1) {
        if (~this.field4227 != ~arg0 || ~this.field4267 != ~arg1) {
            this.field4267 = arg1;
            this.field4227 = arg0;
            this.method1830((byte) 123);
            this.method1832((byte) -27);
            if (~this.field4256 == -4) {
                this.method1896(-27996);
            } else if (this.field4256 == 2) {
                this.method1890(16);
            }
        }
        ++field4044;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZIIILjaclib/memory/Buffer;)Lic;")
    public final class726 method1822(boolean arg0, int arg1, int arg2, int arg3, Buffer arg4) {
        if (arg2 < 44) {
            this.method475();
        }
        ++field3983;
        return (class726) (!this.field4242 || arg0 && !this.field4255 ? new class588(this, arg3, arg4) : new class529(this, arg3, arg4, arg1, arg0));
    }

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "()Z")
    public final boolean method436() {
        ++field4069;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(B)V")
    private final void method1823(byte arg0) {
        if (arg0 == -59) {
            this.field4274 = (float) (-this.field4293 + this.field4228);
            this.field4239 = (float) (-this.field4311 + this.field4300);
            this.field4265 = (float) (-this.field4293 + this.field4263);
            ++field4105;
            this.field4295 = (float) (-this.field4311 + this.field4297);
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method510(Canvas arg0) {
        this.field4058 = null;
        this.field4031 = 0L;
        ++field4131;
        if (arg0 != null && this.field4102 != arg0) {
            if (this.field3991.containsKey(arg0)) {
                Long var2 = (Long) this.field3991.get(arg0);
                this.field4031 = var2;
                this.field4058 = arg0;
            }
        } else {
            this.field4031 = this.field4085;
            this.field4058 = this.field4102;
        }
        if (this.field4058 != null && this.field4031 != 0L) {
            this.field4008.setSurface(this.field4031);
            this.method1820(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIZ)V")
    public final synchronized void method1824(int arg0, int arg1, boolean arg2) {
        ++field4103;
        if (!arg2) {
            class633 var4 = new class633(arg1);
            var4.field7577 = (long) arg0;
            this.field4184.method2510(var4, arg2);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class292 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3954;
        return new class480(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "(II)V")
    public final void method1825(int arg0, int arg1) {
        if (this.field4252 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field4252 = arg0;
        }
        int var3 = 91 % ((54 - arg1) / 51);
        ++field4122;
    }

    @OriginalMember(owner = "client!kv", name = "M", descriptor = "()I")
    public final int method432() {
        ++field4066;
        int var1 = this.field4313;
        this.field4313 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)V")
    public final void method1826(boolean arg0, int arg1) {
        if (arg1 >= -82) {
            this.method430(5, 44, (int[]) null, (int[]) null);
        }
        ++field4060;
        if (!this.field4194 == arg0) {
            this.field4194 = arg0;
            this.method1875(244752880);
            this.field4198 &= -32;
        }
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(B)V")
    public final void method1827(byte arg0) {
        if (this.field4198 != 8) {
            this.method1836(-126);
            this.method1871(110, true);
            this.method1892(true, 93);
            this.method1826(true, -120);
            this.method1817(1, 2);
            this.field4198 = 8;
        }
        if (arg0 != 28) {
            this.method1831((byte) -59);
        }
        ++field4050;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lcp;)V")
    public final void method485(class753 arg0) {
        ++field3989;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BIII)V")
    public final void method1828(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -3) {
            this.field4187 = null;
        }
        ++field4123;
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg1);
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "(I)V")
    private final void method1829(int arg0) {
        ++field4083;
        class754.field10431[3] = 1.0F;
        class754.field10431[2] = this.field4209 * this.field4203;
        class754.field10431[1] = this.field4220 * this.field4209;
        class754.field10431[0] = this.field4232 * this.field4209;
        OpenGL.glLightfv(16384, 4609, class754.field10431, 0);
        class754.field10431[0] = -this.field4253 * this.field4232;
        class754.field10431[1] = -this.field4253 * this.field4220;
        class754.field10431[3] = 1.0F;
        class754.field10431[2] = -this.field4253 * this.field4203;
        if (arg0 >= 60) {
            OpenGL.glLightfv(16385, 4609, class754.field10431, 0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(B)V")
    private final void method1830(byte arg0) {
        ++field4128;
        float[] var2 = this.field4215;
        if (arg0 > 119) {
            float var3 = (float) (-this.field4293 * this.field4227) / (float) this.field4278;
            float var4 = (float) ((-this.field4293 + this.field4129) * this.field4227) / (float) this.field4278;
            float var5 = (float) (this.field4311 * this.field4227) / (float) this.field4204;
            float var6 = (float) ((-this.field4070 + this.field4311) * this.field4227) / (float) this.field4204;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field4227 * 2.0F;
                var2[4] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[14] = this.field4245 = -((float) this.field4267 * var7) / (float) (-this.field4227 + this.field4267);
                var2[13] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = -1.0F;
                var2[5] = var7 / (var5 - var6);
                var2[15] = 0.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = this.field4310 = (float) (-(this.field4267 + this.field4227)) / (float) (-this.field4227 + this.field4267);
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[12] = 0.0F;
            } else {
                var2[13] = 0.0F;
                var2[8] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[0] = 1.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = 1.0F;
            }
            this.method1874(0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "()Leh;")
    public final class378 method493() {
        ++field4025;
        return this.field4192;
    }

    @OriginalMember(owner = "client!kv", name = "da", descriptor = "(III[I)V")
    public final void method500(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4118;
        float var5 = (float) arg2 * this.field4192.field10044 + (float) arg0 * this.field4192.field10030 + (float) arg1 * this.field4192.field10032 + this.field4192.field10037;
        if (!(var5 < (float) this.field4227) && !(var5 > (float) this.field4267)) {
            int var6 = (int) (((float) arg2 * this.field4192.field10043 + (float) arg0 * this.field4192.field10031 + (float) arg1 * this.field4192.field10018 + this.field4192.field10041) * (float) this.field4278 / var5);
            int var7 = (int) (((float) arg2 * this.field4192.field10024 + (float) arg0 * this.field4192.field10023 + (float) arg1 * this.field4192.field10039 + this.field4192.field10042) * (float) this.field4204 / var5);
            if (this.field4265 <= (float) var6 && (float) var6 <= this.field4274 && (float) var7 >= this.field4239 && this.field4295 >= (float) var7) {
                arg3[0] = (int) ((float) var6 + -this.field4265);
                arg3[1] = (int) ((float) var7 + -this.field4239);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "()Z")
    public final boolean method465() {
        ++field4146;
        return false;
    }

    @OriginalMember(owner = "client!kv", name = "pa", descriptor = "()V")
    public final void method418() {
        this.field4308 = false;
        ++field3963;
    }

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "(I)Lza;")
    public final class432 method508(int arg0) {
        ++field4127;
        class679 var2 = new class679(arg0);
        this.field4166.method2510(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "()Z")
    public final boolean method422() {
        ++field4045;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "(B)V")
    private final void method1831(byte arg0) {
        ++field3976;
        this.method1873((byte) 23, -2);
        for (int var2 = this.field4205 + -1; var2 >= 0; --var2) {
            this.method1825(var2, 116);
            this.method1840((class599) null, 2205);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1835(false, 8448, 8448);
        this.method1842(770, -128, 2, 34168);
        this.method1849(1);
        this.field4191 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4197 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4196 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4190 = true;
        this.method1871(114, true);
        this.method1888(true, (byte) -115);
        this.method1892(true, 80);
        this.method1826(true, -106);
        this.method1887(69);
        this.field4008.setSwapInterval(0);
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
            int var6 = var4 + 16384;
            OpenGL.glLightfv(var6, 4608, var3, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field4262 = this.field4244 = -1;
        int var5 = -83 % ((41 - arg0) / 36);
        this.method463();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
    public final void method406(int arg0, int arg1) throws class138 {
        try {
            this.field4008.swapBuffers();
        } catch (Exception var3) {
        }
        ++field4139;
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(B)V")
    private final void method1832(byte arg0) {
        this.field4225 = (float) (-this.field4254 + this.field4267) - this.field4289;
        ++field4119;
        this.field4238 = this.field4225 - (float) this.field4221 * this.field4202;
        if ((float) this.field4227 > this.field4238) {
            this.field4238 = (float) this.field4227;
        }
        OpenGL.glFogf(2915, this.field4238);
        OpenGL.glFogf(2916, this.field4225);
        class754.field10431[2] = (float) class111.method773(255, this.field4244) / 255.0F;
        class754.field10431[1] = (float) class111.method773(65280, this.field4244) / 65280.0F;
        class754.field10431[0] = (float) class111.method773(16711680, this.field4244) / 1.671168E7F;
        if (arg0 == -27) {
            OpenGL.glFogfv(2918, class754.field10431, 0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "(B)V")
    private final void method1833(byte arg0) {
        ++field4000;
        if (arg0 > -6) {
            this.method1890(50);
        }
        OpenGL.glViewport(this.field4271, this.field4237, this.field4129, this.field4070);
    }

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "(I)V")
    private final void method1834(int arg0) {
        if (arg0 == 9911) {
            ++field3993;
            if (this.field4226 && ~this.field4221 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(I)V")
    public final synchronized void method473(int arg0) {
        ++field4029;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4184.method2513((byte) 88)) {
            class633 var12 = (class633) this.field4184.method2507(-108);
            class586.field8298[var2++] = (int) var12.field7577;
            this.field4183 -= var12.field8932;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class586.field8298, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class586.field8298, 0);
            var2 = 0;
        }
        while (!this.field4185.method2513((byte) 88)) {
            class633 var11 = (class633) this.field4185.method2507(-121);
            class586.field8298[var2++] = (int) var11.field7577;
            this.field4181 -= var11.field8932;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class586.field8298, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class586.field8298, 0);
            var2 = 0;
        }
        while (!this.field4186.method2513((byte) 88)) {
            class633 var10 = (class633) this.field4186.method2507(-90);
            class586.field8298[var2++] = var10.field8932;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class586.field8298, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class586.field8298, 0);
            var2 = 0;
        }
        while (!this.field4187.method2513((byte) 88)) {
            class633 var9 = (class633) this.field4187.method2507(-101);
            class586.field8298[var2++] = (int) var9.field7577;
            this.field4182 -= var9.field8932;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class586.field8298, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class586.field8298, 0);
            boolean var4 = false;
        }
        while (!this.field4180.method2513((byte) 88)) {
            class633 var8 = (class633) this.field4180.method2507(-87);
            OpenGL.glDeleteLists((int) var8.field7577, var8.field8932);
        }
        while (!this.field4188.method2513((byte) 88)) {
            class540 var7 = this.field4188.method2507(-105);
            OpenGL.glDeleteProgramARB((int) var7.field7577);
        }
        while (!this.field4189.method2513((byte) 88)) {
            class540 var6 = this.field4189.method2507(-87);
            OpenGL.glDeleteObjectARB(var6.field7577);
        }
        while (!this.field4180.method2513((byte) 88)) {
            class633 var5 = (class633) this.field4180.method2507(-118);
            OpenGL.glDeleteLists((int) var5.field7577, var5.field8932);
        }
        this.field4151.method2457((byte) -92);
        if (this.method466() > 100663296 && ~class109.method731(32) < ~(this.field4193 + 60000L)) {
            System.gc();
            this.field4193 = class109.method731(105);
        }
        this.field4167 = var3;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZII)V")
    public final void method1835(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            if (~this.field4252 == -1) {
                boolean var4 = false;
                if (~this.field4212 != ~arg1) {
                    OpenGL.glTexEnvi(8960, 34161, arg1);
                    this.field4212 = arg1;
                    var4 = true;
                }
                if (~this.field4294 != ~arg2) {
                    OpenGL.glTexEnvi(8960, 34162, arg2);
                    this.field4294 = arg2;
                    var4 = true;
                }
                if (var4) {
                    this.field4198 &= -30;
                }
            } else {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                OpenGL.glTexEnvi(8960, 34162, arg2);
            }
            ++field3973;
        }
    }

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "(I)V")
    private final void method1836(int arg0) {
        ++field4088;
        if (~this.field4256 != -3) {
            this.field4256 = 2;
            this.method1890(16);
            this.method1855(7937);
            this.field4198 &= -8;
        }
        if (arg0 >= -124) {
            this.method1862(-76);
        }
    }

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "()Z")
    public final boolean method509() {
        ++field4086;
        return false;
    }

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "(I)V")
    private final void method1837(int arg0) {
        ++field4038;
        if (~this.field4228 <= ~this.field4263 && this.field4300 <= this.field4297) {
            OpenGL.glScissor(this.field4271 + this.field4263, this.field4237 + this.field4070 - this.field4297, -this.field4263 + this.field4228, -this.field4300 + this.field4297);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        int var2 = -97 / ((arg0 - -74) / 37);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Leh;)V")
    public final void method445(class378 arg0) {
        ++field4137;
        this.field4192.method1950(arg0);
        this.field4199.method1950(this.field4192);
        this.field4199.method4032((byte) -78);
        this.field4200.method4028(this.field4199, (byte) 49);
        if (~this.field4256 != -2) {
            this.method1855(7937);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lag;)V")
    public final void method484(class710 arg0) {
        this.field4211 = (class403) arg0;
        ++field4113;
    }

    @OriginalMember(owner = "client!kv", name = "JA", descriptor = "(IIIIII)I")
    public final int method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4124;
        int var7 = 0;
        float var8 = (float) arg2 * this.field4192.field10044 + (float) arg0 * this.field4192.field10030 + (float) arg1 * this.field4192.field10032 + this.field4192.field10037;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field4192.field10044 + (float) arg3 * this.field4192.field10030 + (float) arg4 * this.field4192.field10032 + this.field4192.field10037;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field4227 > var8 && var9 < (float) this.field4227) {
            var7 |= 16;
        } else if (var8 > (float) this.field4267 && var9 > (float) this.field4267) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field4192.field10043 + (float) arg0 * this.field4192.field10031 + (float) arg1 * this.field4192.field10018 + this.field4192.field10041) * (float) this.field4278 / var8);
        int var11 = (int) (((float) arg5 * this.field4192.field10043 + (float) arg3 * this.field4192.field10031 + (float) arg4 * this.field4192.field10018 + this.field4192.field10041) * (float) this.field4278 / var9);
        if (this.field4265 > (float) var10 && (float) var11 < this.field4265) {
            var7 |= 1;
        } else if ((float) var10 > this.field4274 && this.field4274 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field4192.field10024 + (float) arg0 * this.field4192.field10023 + (float) arg1 * this.field4192.field10039 + this.field4192.field10042) * (float) this.field4204 / var8);
        int var13 = (int) (((float) arg5 * this.field4192.field10024 + (float) arg3 * this.field4192.field10023 + (float) arg4 * this.field4192.field10039 + this.field4192.field10042) * (float) this.field4204 / var9);
        if ((float) var12 < this.field4239 && this.field4239 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field4295 && (float) var13 > this.field4295) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ[BZI)Lmda;")
    public final class274 method1838(int arg0, boolean arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field3977;
        if (!this.field4242 || arg3 && !this.field4255) {
            if (arg1) {
                this.field4232 = 0.58115304F;
            }
            return new class341(this, arg0, arg2, arg4);
        } else {
            return new class306(this, arg0, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
    public final synchronized void method1839(int arg0, int arg1, int arg2) {
        if (arg0 == 24138) {
            ++field3987;
            class633 var4 = new class633(arg2);
            var4.field7577 = (long) arg1;
            this.field4185.method2510(var4, false);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lfia;I)V")
    public final void method1840(class599 arg0, int arg1) {
        ++field4148;
        if (arg1 != 2205) {
            this.field4220 = 0.928697F;
        }
        class599 var3 = this.field4216[this.field4252];
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field8452);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field8452);
                } else if (~arg0.field8452 != ~var3.field8452) {
                    OpenGL.glDisable(var3.field8452);
                    OpenGL.glEnable(arg0.field8452);
                }
                OpenGL.glBindTexture(arg0.field8452, arg0.method3461(true));
            }
            this.field4216[this.field4252] = arg0;
        }
        this.field4198 &= -2;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(III)V")
    public final void method1841(int arg0, int arg1, int arg2) {
        int var4 = -122 % ((20 - arg0) / 46);
        this.field4271 = arg1;
        this.field4237 = arg2;
        ++field4140;
        this.method1833((byte) -73);
        this.method1837(-128);
    }

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "()I")
    public final int method460() {
        ++field4091;
        return this.field4227;
    }

    @OriginalMember(owner = "client!kv", name = "P", descriptor = "(IIIII)V")
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4059;
        this.method1821(-125);
        this.method1817(arg4, 2);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "()Leh;")
    public final class378 method433() {
        ++field4099;
        return this.field4161;
    }

    @OriginalMember(owner = "client!kv", name = "za", descriptor = "(IIIII)V")
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field3990;
        if (this.field4263 <= arg0 + arg2 && ~this.field4228 <= ~(-arg2 + arg0) && ~this.field4300 >= ~(arg1 + arg2) && -arg2 + arg1 <= this.field4297) {
            this.method1821(-100);
            this.method1817(arg4, 2);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field4296) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field4307) {
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
                if (var9 <= 64) {
                    var9 = 64;
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class377.method2330((byte) 48, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class453.field6514[var11] * (float) arg2 + var6, class453.field6517[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method405(Canvas arg0) {
        ++field4141;
        if (this.field4102 == arg0) {
            throw new RuntimeException();
        } else if (this.field3991.containsKey(arg0)) {
            Long var2 = (Long) this.field3991.get(arg0);
            this.field4008.releaseSurface(arg0, var2);
            this.field3991.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIII)V")
    public final void method1842(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -22 / ((arg1 - 33) / 62);
        ++field4089;
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg3);
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BI)I")
    public final int method1843(byte arg0, int arg1) {
        if (arg0 != 91) {
            this.method1835(false, -92, -126);
        }
        ++field4132;
        if (~arg1 != -6407 && arg1 != 6409) {
            if (~arg1 != -6411 && arg1 != 34846 && ~arg1 != -34845) {
                if (arg1 == 6407) {
                    return 3;
                } else if (~arg1 != -6409 && arg1 != 34847) {
                    if (~arg1 != -34844) {
                        if (arg1 != 34842) {
                            if (arg1 != 6402) {
                                if (~arg1 == -6402) {
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

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(Z)V")
    private final void method1844(boolean arg0) {
        ++field4114;
        if (!arg0) {
            this.method405((Canvas) null);
        }
        this.field4008.method3714();
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(III)Z")
    public static final boolean method1845(int arg0, int arg1, int arg2) {
        ++field3995;
        if (arg1 != 65280) {
            field4027 = null;
        }
        return class642.method3648(arg2, arg0, arg1 + -92744) | (arg2 & 458752) != 0 || class428.method2549(arg1 ^ -33211, arg0, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "()V")
    public final void method443() {
        ++field4062;
        this.field4156.method3988(-81);
    }

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "(II)V")
    public final synchronized void method1846(int arg0, int arg1) {
        ++field4020;
        class633 var3 = new class633(arg1);
        this.field4186.method2510(var3, false);
        if (arg0 != 1) {
            this.method435(-72, 92, -26);
        }
    }

    @OriginalMember(owner = "client!kv", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4125;
        float var10;
        float var11;
        if (this.field4268 != null && ~this.field4268.field2367 <= ~arg2 && ~arg3 >= ~this.field4268.field2358) {
            this.field4268.method1257((byte) 122, 0, 6406, 0, 0, arg2, 0, arg6, arg3, false);
            var10 = (float) arg3 * this.field4268.field10476 / (float) this.field4268.field2358;
            var11 = (float) arg2 * this.field4268.field10473 / (float) this.field4268.field2367;
        } else {
            this.field4268 = class784.method4293(6406, arg3, 6406, arg6, false, 34037, this, arg2);
            this.field4268.method1252(false, 3314, false);
            var11 = this.field4268.field10473;
            var10 = this.field4268.field10476;
        }
        this.method1864((byte) -117);
        this.method1840(this.field4268, 2205);
        this.method1817(arg8, 2);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1877((byte) -83, arg5);
        this.method1835(false, 34165, 34165);
        this.method1842(768, 101, 0, 34166);
        this.method1842(770, 106, 2, 5890);
        this.method1828((byte) -10, 34166, 770, 0);
        this.method1828((byte) -43, 5890, 770, 2);
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
        this.method1842(768, -62, 0, 5890);
        this.method1842(770, 112, 2, 34166);
        this.method1828((byte) -34, 5890, 770, 0);
        this.method1828((byte) -16, 34166, 770, 2);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lmda;B)V")
    public final void method1847(class274 arg0, byte arg1) {
        if (this.field4247 != arg0) {
            if (this.field4242) {
                OpenGL.glBindBufferARB(34963, arg0.method1774(105));
            }
            this.field4247 = arg0;
        }
        if (arg1 <= -70) {
            ++field4101;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(II)I")
    public final int method421(int arg0, int arg1) {
        ++field4110;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "(III[I)V")
    public final void method407(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4001;
        float var5 = (float) arg2 * this.field4192.field10044 + (float) arg0 * this.field4192.field10030 + (float) arg1 * this.field4192.field10032 + this.field4192.field10037;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field4192.field10043 + (float) arg0 * this.field4192.field10031 + (float) arg1 * this.field4192.field10018 + this.field4192.field10041) * (float) this.field4278 / var5);
            arg3[0] = (int) ((float) var6 - this.field4265);
            int var7 = (int) (((float) arg2 * this.field4192.field10024 + (float) arg0 * this.field4192.field10023 + (float) arg1 * this.field4192.field10039 + this.field4192.field10042) * (float) this.field4204 / var5);
            arg3[1] = (int) ((float) var7 - this.field4239);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
    public final void method395() {
        ++field4057;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4109;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            this.method1821(-112);
            this.method1817(arg5, 2);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var13 = var11 * var12;
            float var14 = var10 * var12;
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var13;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (arg6 < var15) {
                var19 = (float) (arg6 - var15 + arg7) * var13;
                var18 = (float) (arg6 + arg7 + -var15) * var14;
            } else {
                var21 = (float) (-var15 + arg6) * var13;
                var20 = (float) (-var15 + arg6) * var14;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var13;
            while (true) {
                if (arg0 < arg2) {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                } else {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (~arg3 < ~arg1) {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if ((float) arg3 + 0.35F > var23) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                OpenGL.glEnd();
                var23 += var21 + var25;
                var22 += var20 + var24;
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "(B)Lmu;")
    public final class314 method1848(byte arg0) {
        ++field4116;
        if (arg0 != 121) {
            this.field4274 = 1.021812F;
        }
        return this.field4211 != null ? this.field4211.method2433(-38) : null;
    }

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "()Lrda;")
    public final class689 method483() {
        ++field3955;
        int var1 = -1;
        if (~this.field4276.indexOf("nvidia") == 0) {
            if (this.field4276.indexOf("intel") == -1) {
                if (this.field4276.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class689(var1, "OpenGL", this.field4224, this.field4210, 0L);
    }

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "(I)V")
    private final void method1849(int arg0) {
        if (this.field4261) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4261 = false;
        }
        if (arg0 != 1) {
            this.method1820(1);
        }
        ++field4021;
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "(I)V")
    public final void method458(int arg0) {
        ++field3992;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field4155 = arg0;
            this.field4151.method2456(3553);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "(I)V")
    public final void method489(int arg0) {
        ++field4096;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "()I")
    public final int method404() {
        ++field3961;
        int var1 = this.field4316;
        this.field4316 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILvha;)V")
    public final void method1850(int arg0, class712 arg1) {
        if (arg0 <= 11) {
            this.field4161 = null;
        }
        ++field3986;
        OpenGL.glLoadMatrixf(arg1.method4033(-8826), 0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIZZ)V")
    public final void method1851(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field4003;
        int var5 = -15 / ((24 - arg1) / 49);
        if (this.field4219 != arg0 || !this.field4206 == this.field4308) {
            class158 var6 = null;
            int var7 = 0;
            byte var8 = 0;
            int var9 = 0;
            int var10 = !this.field4308 ? 0 : 3;
            if (~arg0 > -1) {
                this.method1849(1);
            } else {
                var6 = this.field4151.method2458(arg0, 5);
                class181 var11 = super.field883.method1263(arg0, (byte) 114);
                if (var11.field2740 == 0 && ~var11.field2736 == -1) {
                    this.method1849(1);
                } else {
                    int var12 = !var11.field2742 ? 128 : 64;
                    int var13 = var12 * 50;
                    this.method1859((float) (this.field4167 % var13 * var11.field2736) / (float) var13, (float) (this.field4167 % var13 * var11.field2740) / (float) var13, 0.0F, 65);
                }
                var7 = var11.field2746;
                if (!this.field4308) {
                    var10 = var11.field2745;
                    var9 = var11.field2749;
                    var8 = var11.field2737;
                }
            }
            this.field4158.method2487(arg2, var9, -6207, arg3, var8, var10);
            if (!this.field4158.method2483(var6, -14, var7)) {
                this.method1840(var6, 2205);
                this.method1889(false, var7);
            }
            this.field4206 = this.field4308;
            this.field4219 = arg0;
        }
        this.field4198 &= -8;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lre;Z)Lqda;")
    public final class112 method482(class625 arg0, boolean arg1) {
        ++field4026;
        int[] var3 = new int[arg0.field8827 * arg0.field8822];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field8820 != null) {
            for (int var6 = 0; ~var6 > ~arg0.field8822; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field8827; ++var7) {
                    var3[var5++] = class281.method1904(arg0.field8820[var4] << 24, arg0.field8823[class111.method773(arg0.field8828[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~arg0.field8822 < ~var8; ++var8) {
                for (int var10 = 0; arg0.field8827 > var10; ++var10) {
                    int var11 = arg0.field8823[255 & arg0.field8828[var4++]];
                    var3[var5++] = ~var11 == -1 ? 0 : class281.method1904(-16777216, var11);
                }
            }
        }
        class112 var9 = this.method476(0, arg0.field8822, arg0.field8827, true, arg0.field8827, var3);
        var9.method790(arg0.field8826, arg0.field8825, arg0.field8824, arg0.field8821);
        return var9;
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(III)V")
    public final synchronized void method1852(int arg0, int arg1, int arg2) {
        ++field4022;
        class633 var4 = new class633(arg0);
        if (arg2 != 32885) {
            this.method1897(21, 51);
        }
        var4.field7577 = (long) arg1;
        this.field4187.method2510(var4, false);
    }

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "()V")
    public final void method444() {
        ++field4028;
        if (this.field4309 && this.field4129 > 0 && ~this.field4070 < -1) {
            int var1 = this.field4263;
            int var2 = this.field4228;
            int var3 = this.field4300;
            int var4 = this.field4297;
            this.method463();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1887(82);
            this.method1871(122, false);
            this.method1888(false, (byte) -126);
            this.method1892(false, 99);
            this.method1826(false, -120);
            this.method1840((class599) null, 2205);
            this.method1873((byte) 23, -2);
            this.method1889(false, 1);
            this.method1817(0, 2);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4129, this.field4070, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method455(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lkf;[Lre;Z)Lda;")
    public final class67 method403(class263 arg0, class625[] arg1, boolean arg2) {
        ++field4064;
        return new class5(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "na", descriptor = "(IIII)[I")
    public final int[] method400(int arg0, int arg1, int arg2, int arg3) {
        ++field4065;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field4070 + -var6, arg2, 1, 32993, this.field4273, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kv", name = "KA", descriptor = "(IIII)V")
    public final void method455(int arg0, int arg1, int arg2, int arg3) {
        if (~arg2 < ~this.field4129) {
            arg2 = this.field4129;
        }
        ++field4143;
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg3 < ~this.field4070) {
            arg3 = this.field4070;
        }
        this.field4300 = arg1;
        this.field4297 = arg3;
        this.field4228 = arg2;
        this.field4263 = arg0;
        OpenGL.glEnable(3089);
        this.method1823((byte) -59);
        this.method1837(91);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIII)Lag;")
    public final class710 method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4134;
        return !this.field4258 ? null : new class459(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        ++field4042;
    }

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "(II)V")
    public final synchronized void method1853(int arg0, int arg1) {
        if (arg1 <= 119) {
            this.method460();
        }
        ++field4032;
        class540 var3 = new class540();
        var3.field7577 = (long) arg0;
        this.field4188.method2510(var3, false);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lhm;IIII)Lka;")
    public final class495 method420(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3967;
        return new class37(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3962;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            class729 var13 = (class729) arg6;
            class759 var14 = var13.field10198;
            this.method1864((byte) -117);
            this.method1840(var13.field10198, 2205);
            this.method1817(arg5, 2);
            this.method1835(false, 7681, 8448);
            this.method1842(768, -98, 0, 34167);
            float var15 = var14.field10473 / (float) var14.field10474;
            float var16 = var14.field10476 / (float) var14.field10470;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            float var20 = var18 * var19;
            int var21 = arg11 % (arg10 - -arg9);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var22 = var17 * var19;
            float var23 = (float) arg9 * var22;
            float var24 = (float) arg9 * var20;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 > ~var21) {
                var25 = (float) (arg9 + arg10 - var21) * var22;
                var26 = (float) (arg9 + arg10 + -var21) * var20;
            } else {
                var28 = (float) (-var21 + arg9) * var20;
                var27 = (float) (-var21 + arg9) * var22;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var22;
            float var32 = (float) arg10 * var20;
            while (true) {
                if (~arg0 <= ~arg2) {
                    if (var29 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var27 + var29) {
                        var27 = (float) arg2 + -var29;
                    }
                }
                if (arg1 >= arg3) {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 + (float) (-arg7)) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var29 += var27 + var31;
                var30 += var28 + var32;
                OpenGL.glEnd();
                var28 = var24;
                var27 = var23;
            }
            this.method1842(768, 108, 0, 5890);
        }
    }

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "()Leh;")
    public final class378 method462() {
        ++field3958;
        return new class712();
    }

    @OriginalMember(owner = "client!kv", name = "ya", descriptor = "()V")
    public final void method449() {
        this.method1826(true, -121);
        ++field4097;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)V")
    public final void method412(boolean arg0) {
        ++field4061;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
    public final void method441(int arg0) {
        this.method1869(true);
        ++field4126;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lvha;I)V")
    public final void method1854(class712 arg0, int arg1) {
        ++field4094;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method4033(arg1 + -8826), arg1);
    }

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "(I)V")
    private final void method1855(int arg0) {
        ++field4063;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field4199.method4033(-8826), 0);
        if (this.field4206) {
            this.field4158.field5862.method1442(2);
        }
        this.method1819(false);
        if (arg0 != 7937) {
            this.field4222 = null;
        }
        this.method1862(arg0 + -7937);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class138 {
        this.method406(arg2, arg3);
        ++field4002;
    }

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "()V")
    public final void method447() {
        for (class540 var1 = this.field4166.method2508((byte) 113); var1 != null; var1 = this.field4166.method2505((byte) -55)) {
            ((class679) var1).method3840(65536);
        }
        ++field4145;
        if (this.field4156 != null) {
            this.field4156.method3997(-111);
        }
        if (this.field4008 != null) {
            this.method1844(true);
            Enumeration var2 = this.field3991.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3991.get(var3);
                this.field4008.releaseSurface(var3, var4);
            }
            this.field4008.release();
            this.field4008 = null;
        }
        if (this.field4164) {
            class209.method1485(false, (byte) 30, true);
            this.field4164 = false;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZII)V")
    public final void method1856(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4071;
        if (!arg1) {
            this.method492(-109, 27, -24, -33, -92, -0.34181908F);
        }
        OpenGL.glDrawArrays(arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "()Z")
    public final boolean method426() {
        ++field4043;
        return this.field4158.method2488(55, 3);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(JB)V")
    public final synchronized void method1857(long arg0, byte arg1) {
        ++field4157;
        int var4 = 2 / ((-4 - arg1) / 50);
        class540 var5 = new class540();
        var5.field7577 = arg0;
        this.field4189.method2510(var5, false);
    }

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "(I)V")
    public final void method1858(int arg0) {
        if (arg0 < 103) {
            this.method439((class432) null);
        }
        ++field4034;
        if (~this.field4198 != -5) {
            this.method1868(false);
            this.method1871(111, false);
            this.method1888(false, (byte) -127);
            this.method1892(false, 115);
            this.method1826(false, -105);
            this.method1873((byte) 23, -2);
            this.method1817(1, 2);
            this.field4198 = 4;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[I[I)Laa;")
    public final class510 method430(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4024;
        return class648.method3700((byte) -1, this, arg3, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "()Z")
    public final boolean method423() {
        ++field4075;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFFI)V")
    private final void method1859(float arg0, float arg1, float arg2, int arg3) {
        ++field4048;
        OpenGL.glMatrixMode(5890);
        if (arg3 >= 46) {
            if (this.field4261) {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glTranslatef(arg1, arg0, arg2);
            OpenGL.glMatrixMode(5888);
            this.field4261 = true;
        }
    }

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "()Z")
    public final boolean method424() {
        ++field3997;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IFF)V")
    public final void method1860(int arg0, float arg1, float arg2) {
        this.field4289 = arg1;
        this.field4202 = arg2;
        if (arg0 != 7681) {
            this.field4209 = 0.2554591F;
        }
        ++field4005;
        this.method1832((byte) -27);
    }

    @OriginalMember(owner = "client!kv", name = "U", descriptor = "(IIIII)V")
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1821(-92);
        ++field4047;
        this.method1817(arg4, 2);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lvl;B)V")
    public final void method1861(class15 arg0, byte arg1) {
        if (arg1 != 94) {
            this.method1831((byte) -61);
        }
        ++field4030;
        if (this.field4283) {
            this.method1886(arg0, true);
            this.method1863(arg0, arg1 + -95);
        } else if (this.field4170 >= 0 && this.field4176[this.field4170] == arg0) {
            this.field4176[this.field4170--] = null;
            arg0.method136(false);
            if (this.field4170 >= 0) {
                this.field4171 = this.field4173 = this.field4176[this.field4170];
                this.field4171.method132(26054);
            } else {
                this.field4171 = this.field4173 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kv", name = "xa", descriptor = "(F)V")
    public final void method506(float arg0) {
        ++field4035;
        if (this.field4248 != arg0) {
            this.field4248 = arg0;
            this.method1893(1);
        }
    }

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "(I)V")
    private final void method1862(int arg0) {
        ++field4067;
        int var2;
        for (var2 = arg0; var2 < this.field4223; ++var2) {
            class578 var3 = this.field4234[var2];
            int var4 = var2 + 16386;
            class358.field5211[0] = (float) var3.method3358((byte) 22);
            class358.field5211[1] = (float) var3.method3355(0);
            class358.field5211[2] = (float) var3.method3363(-1);
            class358.field5211[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class358.field5211, 0);
            int var5 = var3.method3362(0);
            float var6 = var3.method3356((byte) 91) / 255.0F;
            class358.field5211[0] = (float) (class111.method773(16730021, var5) >> 16) * var6;
            class358.field5211[2] = (float) class111.method773(var5, 255) * var6;
            class358.field5211[1] = var6 * (float) class111.method773(var5 >> 8, 255);
            OpenGL.glLightfv(var4, 4609, class358.field5211, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3360(-31770) * var3.method3360(-31770)));
            OpenGL.glEnable(var4);
        }
        while (~this.field4213 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field4213 = this.field4223;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lvl;I)V")
    public final void method1863(class15 arg0, int arg1) {
        ++field3975;
        if (~this.field4178 <= -1 && this.field4174[this.field4178] == arg0) {
            this.field4174[this.field4178--] = null;
            arg0.method137(arg1 + 76);
            if (arg1 < ~this.field4178) {
                this.field4173 = null;
            } else {
                this.field4173 = this.field4174[this.field4178];
                this.field4173.method135(16667);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field4076;
        this.method1821(-117);
        this.method1817(arg12, 2);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kv", name = "ra", descriptor = "(IIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        ++field4033;
        this.field4308 = true;
        this.field4279 = arg1;
        this.field4233 = arg3;
        this.field4272 = arg2;
        this.field4269 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(II)Lvu;")
    public final class354 method442(int arg0, int arg1) {
        ++field4080;
        return null;
    }

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "(B)V")
    public final void method1864(byte arg0) {
        ++field4149;
        if (this.field4198 != 2) {
            this.method1868(false);
            this.method1871(110, false);
            this.method1888(false, (byte) 59);
            this.method1892(false, arg0 + 211);
            this.method1826(false, -111);
            this.method1873((byte) 23, -2);
            this.field4198 = 2;
        }
        if (arg0 != -117) {
            this.field4156 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lkb;ILkb;Lkb;Lkb;)V")
    public final void method1865(class717 arg0, int arg1, class717 arg2, class717 arg3, class717 arg4) {
        if (arg0 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1878(arg0.field10091, 0);
            OpenGL.glVertexPointer(arg0.field10087, arg0.field10084, this.field4292.method3071(true), this.field4292.method3074((byte) -92) + (long) arg0.field10089);
            OpenGL.glEnableClientState(32884);
        }
        ++field4006;
        if (arg4 != null) {
            this.method1878(arg4.field10091, 0);
            OpenGL.glNormalPointer(arg4.field10084, this.field4292.method3071(true), this.field4292.method3074((byte) -102) + (long) arg4.field10089);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg3 != null) {
            this.method1878(arg3.field10091, 0);
            OpenGL.glColorPointer(arg3.field10087, arg3.field10084, this.field4292.method3071(true), this.field4292.method3074((byte) -95) - -((long) arg3.field10089));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 != null) {
            this.method1878(arg2.field10091, 0);
            OpenGL.glTexCoordPointer(arg2.field10087, arg2.field10084, this.field4292.method3071(true), this.field4292.method3074((byte) -104) - -((long) arg2.field10089));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
        if (arg1 != 32888) {
            this.method1898(115);
        }
    }

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "(II)I")
    public final int method1866(int arg0, int arg1) {
        ++field4093;
        if (arg1 != 27248) {
            return -125;
        } else if (arg0 == 1) {
            return 7681;
        } else if (arg0 == 0) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else if (~arg0 != -4) {
            if (~arg0 == -5) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 260;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(ZII)V")
    public final void method1867(boolean arg0, int arg1, int arg2) {
        ++field4092;
        this.method1851(arg1, arg2 + -2066881106, true, arg0);
        if (arg2 != 2066881232) {
            this.field4201 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "(Z)V")
    private final void method1868(boolean arg0) {
        if (~this.field4256 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field4129 < -1 && this.field4070 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field4129, (double) this.field4070, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4256 = 1;
            this.field4198 &= -25;
        }
        if (!arg0) {
            ++field3968;
        }
    }

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "([I)V")
    public final void method428(int[] arg0) {
        arg0[3] = this.field4297;
        arg0[1] = this.field4300;
        arg0[0] = this.field4263;
        ++field4107;
        arg0[2] = this.field4228;
    }

    @OriginalMember(owner = "client!kv", name = "aa", descriptor = "(IIIIII)V")
    public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3974;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1821(-93);
        float var10 = (float) arg3 + var8;
        this.method1817(arg5, 2);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4214) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4214) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "()I")
    public final int method471() {
        ++field4133;
        return 4;
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(Z)V")
    private final void method1869(boolean arg0) {
        ++field3957;
        if (arg0) {
            int var2 = 0;
            while (!this.field4008.method3713()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class117.method820(false, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "(Z)V")
    public final void method408(boolean arg0) {
        ++field4068;
        this.field4257 = arg0;
        this.method1875(244752880);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[Ljw;)V")
    public final void method429(int arg0, class578[] arg1) {
        ++field3982;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field4234[var3] = arg1[var3];
        }
        this.field4223 = arg0;
        if (this.field4256 != 1) {
            this.method1862(0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "DA", descriptor = "(IIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3) {
        this.field4204 = arg3;
        this.field4293 = arg0;
        this.field4311 = arg1;
        ++field3951;
        this.field4278 = arg2;
        this.method1830((byte) 121);
        this.method1823((byte) -59);
        if (this.field4256 == 3) {
            this.method1896(-27996);
        } else if (this.field4256 == 2) {
            this.method1890(16);
        }
    }

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "(Z)I")
    private final int method1870(boolean arg0) {
        ++field4019;
        this.field4276 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field4210 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field4276.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field4276.indexOf("brian paul") != 0 || this.field4276.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class29.method214(' ', var3.replace('.', ' '), -109);
        if (~var4.length <= -3) {
            try {
                int var5 = class4.method25(0, var4[0]);
                int var6 = class4.method25(0, var4[1]);
                this.field4224 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field4224 > -13) {
            var2 |= 2;
        }
        if (!this.field4008.method3715("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4008.method3715("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4205 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field4305 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field4266 = var7[0];
        if (this.field4205 < 2 || ~this.field4305 > -3 || this.field4266 < 2) {
            var2 |= 16;
        }
        this.field4230 = Stream.method3956();
        this.field4207 = this.field4008.arePbuffersAvailable();
        this.field4242 = this.field4008.method3715("GL_ARB_vertex_buffer_object");
        this.field4214 = this.field4008.method3715("GL_ARB_multisample");
        this.field4298 = this.field4008.method3715("GL_ARB_vertex_program");
        this.field4008.method3715("GL_ARB_fragment_program");
        this.field4246 = this.field4008.method3715("GL_ARB_vertex_shader");
        this.field4287 = this.field4008.method3715("GL_ARB_fragment_shader");
        this.field4249 = this.field4008.method3715("GL_EXT_texture3D");
        this.field4291 = this.field4008.method3715("GL_ARB_texture_rectangle");
        this.field4258 = this.field4008.method3715("GL_ARB_texture_cube_map");
        this.field4240 = this.field4008.method3715("GL_ARB_texture_float");
        this.field4218 = arg0;
        this.field4285 = this.field4008.method3715("GL_EXT_framebuffer_object");
        this.field4283 = this.field4008.method3715("GL_EXT_framebuffer_blit");
        this.field4284 = this.field4008.method3715("GL_EXT_framebuffer_multisample");
        this.field4301 = this.field4284 & this.field4283;
        this.field4288 = class16.field272.startsWith("mac");
        OpenGL.glGetFloatv(2834, class754.field10431, 0);
        this.field4296 = class754.field10431[0];
        this.field4307 = class754.field10431[1];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)V")
    public final void method1871(int arg0, boolean arg1) {
        ++field4007;
        if (this.field4226 != arg1) {
            this.field4226 = arg1;
            this.method1834(9911);
            this.field4198 &= -32;
        }
        if (arg0 <= 92) {
            this.method481((int[]) null, -68, 57, -83, 48, false);
        }
    }

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "(I)V")
    public final void method1872(int arg0) {
        OpenGL.glPopMatrix();
        if (arg0 != 1) {
            this.method468(-116, 49, 62, 0);
        }
        ++field4121;
    }

    @OriginalMember(owner = "client!kv", name = "EA", descriptor = "(IIII)V")
    public final void method411(int arg0, int arg1, int arg2, int arg3) {
        ++field4160;
        if (!this.field4308) {
            throw new RuntimeException("");
        } else {
            this.field4233 = arg3;
            this.field4272 = arg2;
            this.field4279 = arg1;
            this.field4269 = arg0;
            if (this.field4206) {
                this.field4158.field5862.method1442(2);
                this.field4158.field5862.method1444(-32708);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)V")
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4082;
        OpenGL.glLineWidth((float) arg5);
        this.method438(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!kv", name = "X", descriptor = "(I)V")
    public final void method459(int arg0) {
        this.field4165 = 0;
        ++field4130;
        while (~arg0 < -2) {
            ++this.field4165;
            arg0 >>= 1;
        }
        this.field4169 = 1 << this.field4165;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(BI)V")
    public final void method1873(byte arg0, int arg1) {
        this.method1867(true, arg1, 2066881232);
        ++field4004;
        if (arg0 != 23) {
            this.method444();
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIII)V")
    public final void method401(int arg0, int arg1, int arg2, int arg3) {
        ++field3972;
        this.field4156.method3994(arg0, arg1, (byte) -101, arg2, arg3);
    }

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "()Z")
    public final boolean method434() {
        ++field4056;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class280(Canvas arg0, class159 arg1, int arg2) {
        super(arg1);
        new class413();
        new class64(16);
        this.field4180 = new class420();
        this.field4184 = new class420();
        this.field4185 = new class420();
        this.field4186 = new class420();
        this.field4187 = new class420();
        this.field4188 = new class420();
        this.field4189 = new class420();
        this.field4192 = new class712();
        this.field4199 = new class712();
        this.field4200 = new class712();
        this.field4203 = 1.0F;
        this.field4221 = -1;
        this.field4234 = new class578[class216.field3102];
        this.field4202 = 1.0F;
        this.field4233 = 0;
        this.field4204 = 512;
        this.field4251 = 3584.0F;
        this.field4228 = 0;
        this.field4237 = 0;
        this.field4243 = new float[4];
        this.field4260 = new float[4];
        this.field4209 = -1.0F;
        this.field4254 = 0;
        this.field4206 = false;
        this.field4244 = -1;
        this.field4241 = 3584.0F;
        this.field4220 = 1.0F;
        this.field4262 = -1;
        this.field4227 = 50;
        this.field4263 = 0;
        this.field4257 = true;
        this.field4279 = -1;
        this.field4272 = -1;
        this.field4286 = new float[4];
        this.field4264 = new float[4];
        this.field4267 = 3584;
        this.field4271 = 0;
        this.field4293 = 0;
        this.field4294 = 8448;
        this.field4232 = 1.0F;
        this.field4278 = 512;
        this.field4289 = 0.0F;
        this.field4215 = new float[16];
        this.field4297 = 0;
        this.field4212 = 8448;
        this.field4253 = -1.0F;
        this.field4296 = -1.0F;
        this.field4250 = 1.0F;
        this.field4300 = 0;
        this.field4307 = -1.0F;
        this.field4311 = 0;
        this.field4231 = new class186(8192);
        this.field4312 = new byte[16384];
        this.field4315 = new int[1];
        this.field4314 = new int[1];
        this.field4317 = new int[1];
        this.field4153 = arg2;
        this.field4058 = this.field4102 = arg0;
        if (!class291.method1971("jaclib", 0)) {
            throw new RuntimeException("");
        } else if (!class291.method1971("jaggl", 0)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field4008 = new OpenGL();
                this.field4031 = this.field4085 = this.field4008.init(arg0, 8, 8, 8, 24, 0, this.field4153);
                if (this.field4085 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method1869(true);
                    int var4 = this.method1870(false);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field4273 = this.field4230 ? 33639 : 5121;
                        if (this.field4210.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class29.method214(' ', this.field4210.replace('/', ' '), -113);
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class55.method358(var10.substring(1, 3), 10)) {
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
                                            if (~var10.length() <= -5 && class55.method358(var10.substring(0, 4), 10)) {
                                                var5 = class4.method25(0, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field4249 = false;
                                }
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field4242 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field4240 = false;
                            }
                            this.field4291 &= this.field4008.method3715("GL_ARB_half_float_pixel");
                            this.field4304 = true;
                            this.field4255 = this.field4242;
                        }
                        if (~this.field4276.indexOf("intel") != 0) {
                            this.field4285 = false;
                        }
                        this.field4309 = !this.field4276.equals("s3 graphics");
                        if (this.field4242) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class211.method1486(false, true, (byte) 31);
                        this.field4164 = true;
                        this.field4151 = new class407(this, super.field883);
                        this.method1898(-10593);
                        this.field4168 = new class327(this);
                        this.field4156 = new class705(this);
                        if (this.field4156.method3992(26919)) {
                            this.field4154 = new class136(this);
                            if (!this.field4154.method957(109)) {
                                this.field4154.method958((byte) 122);
                                this.field4154 = null;
                            }
                        }
                        this.field4158 = new class415(this);
                        this.method1831((byte) 81);
                        this.method1820(0);
                        this.method444();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method447();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "(I)V")
    private final void method1874(int arg0) {
        ++field4142;
        this.field4215[10] = this.field4310;
        this.field4215[14] = this.field4245;
        this.field4251 = (this.field4215[14] - (float) this.field4267) / this.field4215[10];
        if (arg0 != 0) {
            this.method1833((byte) 7);
        }
        this.field4241 = (float) this.field4267;
    }

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "(I)V")
    private final void method1875(int arg0) {
        if (arg0 != 244752880) {
            this.method1865((class717) null, -39, (class717) null, (class717) null, (class717) null);
        }
        OpenGL.glDepthMask(this.field4194 && this.field4257);
        ++field3970;
    }

    @OriginalMember(owner = "client!kv", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method499(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4090;
        boolean var7 = ~this.field4262 != ~arg0;
        if (var7 || this.field4209 != arg1 || this.field4253 != arg2) {
            this.field4262 = arg0;
            this.field4209 = arg1;
            this.field4253 = arg2;
            if (var7) {
                this.field4203 = (float) (this.field4262 & 255) / 255.0F;
                this.field4220 = (float) (this.field4262 & 65280) / 65280.0F;
                this.field4232 = (float) (this.field4262 & 16711680) / 1.671168E7F;
                this.method1893(1);
            }
            this.method1829(72);
        }
        if (this.field4264[0] != arg3 || this.field4264[1] != arg4 || this.field4264[2] != arg5) {
            this.field4264[1] = arg4;
            this.field4264[0] = arg3;
            this.field4264[2] = arg5;
            this.field4286[0] = -arg3;
            this.field4286[2] = -arg5;
            this.field4286[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4260[1] = arg4 * var8;
            this.field4260[0] = arg3 * var8;
            this.field4260[2] = arg5 * var8;
            this.field4243[2] = -this.field4260[2];
            this.field4243[1] = -this.field4260[1];
            this.field4243[0] = -this.field4260[0];
            this.method1819(false);
            this.field4229 = (int) (arg5 * 256.0F / arg4);
            this.field4299 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BZ)V")
    public final void method1876(byte arg0, boolean arg1) {
        ++field4013;
        if (!this.field4290 == arg1) {
            this.field4290 = arg1;
            this.method1880(true);
        }
        if (arg0 <= 29) {
            this.method433();
        }
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(BI)V")
    public final void method1877(byte arg0, int arg1) {
        ++field3985;
        class754.field10431[1] = (float) class111.method773(65280, arg1) / 65280.0F;
        class754.field10431[0] = (float) class111.method773(16711680, arg1) / 1.671168E7F;
        class754.field10431[2] = (float) class111.method773(255, arg1) / 255.0F;
        class754.field10431[3] = (float) (arg1 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class754.field10431, 0);
        if (arg0 != -83) {
            this.method400(-124, 88, 90, 3);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lic;I)V")
    public final void method1878(class726 arg0, int arg1) {
        ++field4077;
        if (this.field4292 != arg0) {
            if (this.field4242) {
                OpenGL.glBindBufferARB(34962, arg0.method3072(true));
            }
            this.field4292 = arg0;
        }
        if (arg1 != 0) {
            this.method1880(false);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFZFF)V")
    public final void method1879(float arg0, float arg1, boolean arg2, float arg3, float arg4) {
        class754.field10431[0] = arg0;
        class754.field10431[2] = arg3;
        ++field4039;
        class754.field10431[3] = arg4;
        if (arg2) {
            this.field4245 = -0.6090289F;
        }
        class754.field10431[1] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class754.field10431, 0);
    }

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "(Z)V")
    private final void method1880(boolean arg0) {
        if (arg0) {
            ++field3965;
            if (this.field4236 && !this.field4290) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public final void method398(int arg0) {
        ++field3956;
        this.method1844(true);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lhea;)V")
    public final void method437(class443 arg0) {
        ++field3999;
        this.field4152.method1908(this, arg0, -1, (byte) 110);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([I)V")
    public final void method470(int[] arg0) {
        arg0[0] = this.field4129;
        ++field4052;
        arg0[1] = this.field4070;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method505(Canvas arg0, int arg1, int arg2) {
        ++field4017;
        long var4 = 0L;
        if (arg0 != null && this.field4102 != arg0) {
            if (this.field3991.containsKey(arg0)) {
                Long var6 = (Long) this.field3991.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field4085;
        }
        if (~var4 == -1L) {
            throw new RuntimeException();
        } else {
            this.field4008.surfaceResized(var4);
            if (this.field4058 == arg0) {
                this.method1820(0);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "(ILaa;II)V")
    public final void method494(int arg0, class510 arg1, int arg2, int arg3) {
        ++field4147;
        class729 var5 = (class729) arg1;
        class759 var6 = var5.field10198;
        this.method1864((byte) -117);
        this.method1840(var5.field10198, 2205);
        this.method1817(1, 2);
        this.method1835(false, 7681, 8448);
        this.method1842(768, 96, 0, 34167);
        float var7 = var6.field10473 / (float) var6.field10474;
        float var8 = var6.field10476 / (float) var6.field10470;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4263) * var7, (float) (this.field4300 - arg3) * var8);
        OpenGL.glVertex2i(this.field4263, this.field4300);
        OpenGL.glTexCoord2f((float) (this.field4263 - arg2) * var7, (float) (-arg3 + this.field4297) * var8);
        OpenGL.glVertex2i(this.field4263, this.field4297);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4228) * var7, (float) (this.field4297 - arg3) * var8);
        OpenGL.glVertex2i(this.field4228, this.field4297);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4228) * var7, (float) (-arg3 + this.field4300) * var8);
        OpenGL.glVertex2i(this.field4228, this.field4300);
        OpenGL.glEnd();
        this.method1842(768, -33, 0, 5890);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[BIIZ)Lic;")
    public final class726 method1881(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 != 12486) {
            return null;
        } else {
            ++field4079;
            return (class726) (!this.field4242 || arg4 && !this.field4255 ? new class588(this, arg3, arg1, arg0) : new class529(this, arg3, arg1, arg0, arg4));
        }
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "()V")
    public final void method397() {
        ++field3959;
        if (this.field4154 != null && this.field4154.method3085(1)) {
            this.field4156.method3995(this.field4154, false);
            this.field4151.method2456(3553);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
    public final void method392() {
        ++field3966;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!kv", name = "GA", descriptor = "(I)V")
    public final void method417(int arg0) {
        this.method1817(0, 2);
        ++field3994;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "()Z")
    public final boolean method475() {
        ++field4112;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lvl;Z)V")
    public final void method1882(class15 arg0, boolean arg1) {
        if (!arg1) {
            ++field4073;
            if (this.field4283) {
                this.method1818(0, arg0);
                this.method1884(114, arg0);
            } else if (this.field4170 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field4170 <= -1) {
                    this.field4176[this.field4170].method136(false);
                }
                this.field4171 = this.field4173 = this.field4176[++this.field4170] = arg0;
                this.field4171.method132(26054);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lag;Lag;FLag;)Lag;")
    public final class710 method507(class710 arg0, class710 arg1, float arg2, class710 arg3) {
        ++field4037;
        if (arg0 != null && arg1 != null && this.field4258 && this.field4285) {
            class738 var5 = null;
            class403 var6 = (class403) arg0;
            class403 var7 = (class403) arg1;
            class314 var8 = var6.method2433(109);
            class314 var9 = var7.method2433(-22);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field4652 <= ~var8.field4652 ? var9.field4652 : var8.field4652;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class738) {
                    class738 var11 = (class738) arg3;
                    if (var10 == var11.method4133(-37)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class738(this, var10);
                }
                if (var5.method4134(arg2, var8, var9, true)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "()Z")
    public final boolean method461() {
        ++field4081;
        return this.field4214 && (!this.method448() || this.field4301);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lhea;I)V")
    public final void method464(class443 arg0, int arg1) {
        this.field4152.method1908(this, arg0, arg1, (byte) 110);
        ++field3996;
    }

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "(II)V")
    public final void method512(int arg0, int arg1) {
        ++field3998;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
        ++field3980;
        class729 var10 = (class729) arg6;
        class759 var11 = var10.field10198;
        this.method1864((byte) -117);
        this.method1840(var10.field10198, 2205);
        this.method1817(arg5, 2);
        this.method1835(false, 7681, 8448);
        this.method1842(768, -104, 0, 34167);
        float var12 = var11.field10473 / (float) var11.field10474;
        float var13 = var11.field10476 / (float) var11.field10470;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method1842(768, 101, 0, 5890);
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(II)I")
    public final int method451(int arg0, int arg1) {
        ++field4016;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "(I)V")
    public static void method1883(int arg0) {
        field4027 = null;
        if (arg0 != 13499) {
            method1885(-26, 120L, -44, true);
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(ILvl;)V")
    public final void method1884(int arg0, class15 arg1) {
        ++field4108;
        if (this.field4178 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg0 < 23) {
                this.field4204 = 49;
            }
            if (~this.field4178 <= -1) {
                this.field4174[this.field4178].method137(101);
            }
            this.field4173 = this.field4174[++this.field4178] = arg1;
            this.field4173.method135(16667);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lnea;Lvu;)Lcp;")
    public final class753 method456(class742 arg0, class354 arg1) {
        ++field4138;
        return null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IJIZ)Ljava/lang/String;")
    public static final String method1885(int arg0, long arg1, int arg2, boolean arg3) {
        ++field4011;
        Calendar var5;
        if (arg3) {
            class572.method3323(arg1, arg2 ^ -16677);
            var5 = class241.field3459;
        } else {
            class527.method3060(-12477, arg1);
            var5 = class241.field3461;
        }
        int var6 = var5.get(5);
        if (arg2 != -16687) {
            field4027 = null;
        }
        int var7 = var5.get(2);
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return ~arg0 == -4 ? class190.method1402(arg0, arg3, (byte) -65, arg1) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class87.field1123[arg0][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Lvl;Z)V")
    public final void method1886(class15 arg0, boolean arg1) {
        ++field3984;
        if (~this.field4175 <= -1 && this.field4172[this.field4175] == arg0) {
            this.field4172[this.field4175--] = null;
            arg0.method134(795);
            if (this.field4175 >= 0) {
                this.field4171 = this.field4172[this.field4175];
                this.field4171.method133(false);
            } else {
                this.field4171 = null;
            }
            if (!arg1) {
                this.method421(102, -104);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kv", name = "HA", descriptor = "(IIII[I)V")
    public final void method513(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field4036;
        float var6 = (float) arg2 * this.field4192.field10044 + (float) arg0 * this.field4192.field10030 + (float) arg1 * this.field4192.field10032 + this.field4192.field10037;
        if (!((float) this.field4227 > var6) && !((float) this.field4267 < var6)) {
            int var7 = (int) (((float) arg2 * this.field4192.field10043 + (float) arg0 * this.field4192.field10031 + (float) arg1 * this.field4192.field10018 + this.field4192.field10041) * (float) this.field4278 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field4192.field10024 + (float) arg0 * this.field4192.field10023 + (float) arg1 * this.field4192.field10039 + this.field4192.field10042) * (float) this.field4204 / (float) arg3);
            if ((float) var7 >= this.field4265 && this.field4274 >= (float) var7 && (float) var8 >= this.field4239 && this.field4295 >= (float) var8) {
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field4239);
                arg4[0] = (int) ((float) var7 - this.field4265);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "(I)V")
    public final void method1887(int arg0) {
        if (~this.field4256 != -1) {
            this.field4198 &= -32;
            this.field4256 = 0;
        }
        ++field4117;
        if (arg0 <= 60) {
            this.method1836(-102);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZB)V")
    public final void method1888(boolean arg0, byte arg1) {
        if (this.field4236 != arg0) {
            this.field4236 = arg0;
            this.method1880(true);
            this.field4198 &= -8;
        }
        ++field3981;
        int var3 = -58 / ((-51 - arg1) / 56);
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIID)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field4023;
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "(II)Lnea;")
    public final class742 method501(int arg0, int arg1) {
        ++field4084;
        return null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFF)V")
    public final void method396(float arg0, float arg1, float arg2) {
        ++field3971;
        class440.field6295 = arg1;
        class424.field5981 = arg0;
        class259.field3636 = arg2;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(ZI)V")
    public final void method1889(boolean arg0, int arg1) {
        ++field4078;
        if (arg0) {
            this.field4224 = 86;
        }
        if (~arg1 == -2) {
            this.method1835(arg0, 7681, 7681);
        } else {
            if (arg1 != 0) {
                if (~arg1 == -3) {
                    this.method1835(false, 34165, 7681);
                    return;
                }
                if (arg1 == 3) {
                    this.method1835(false, 260, 8448);
                    return;
                }
                if (arg1 == 4) {
                    this.method1835(false, 34023, 34023);
                    return;
                }
            } else {
                this.method1835(false, 8448, 8448);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lza;)V")
    public final void method439(class432 arg0) {
        ++field3979;
        this.field4163 = ((class679) arg0).field9653;
        if (this.field4201 == null) {
            class186 var2 = new class186(80);
            if (!this.field4230) {
                var2.method1381(-1.0F, 3);
                var2.method1381(-1.0F, 3);
                var2.method1381(0.0F, 3);
                var2.method1381(0.0F, 3);
                var2.method1381(1.0F, 3);
                var2.method1381(1.0F, 3);
                var2.method1381(-1.0F, 3);
                var2.method1381(0.0F, 3);
                var2.method1381(1.0F, 3);
                var2.method1381(1.0F, 3);
                var2.method1381(1.0F, 3);
                var2.method1381(1.0F, 3);
                var2.method1381(0.0F, 3);
                var2.method1381(1.0F, 3);
                var2.method1381(0.0F, 3);
                var2.method1381(-1.0F, 3);
                var2.method1381(1.0F, 3);
                var2.method1381(0.0F, 3);
                var2.method1381(0.0F, 3);
                var2.method1381(0.0F, 3);
            } else {
                var2.method1383((byte) -121, -1.0F);
                var2.method1383((byte) -116, -1.0F);
                var2.method1383((byte) -123, 0.0F);
                var2.method1383((byte) 81, 0.0F);
                var2.method1383((byte) -123, 1.0F);
                var2.method1383((byte) 43, 1.0F);
                var2.method1383((byte) -116, -1.0F);
                var2.method1383((byte) 110, 0.0F);
                var2.method1383((byte) -119, 1.0F);
                var2.method1383((byte) -128, 1.0F);
                var2.method1383((byte) -113, 1.0F);
                var2.method1383((byte) 95, 1.0F);
                var2.method1383((byte) 117, 0.0F);
                var2.method1383((byte) 28, 1.0F);
                var2.method1383((byte) 66, 0.0F);
                var2.method1383((byte) 94, -1.0F);
                var2.method1383((byte) -127, 1.0F);
                var2.method1383((byte) 64, 0.0F);
                var2.method1383((byte) 102, 0.0F);
                var2.method1383((byte) 35, 0.0F);
            }
            this.field4201 = this.method1881(var2.field1521, var2.field1556, 12486, 20, false);
            this.field4222 = new class717(this.field4201, 5126, 3, 0);
            this.field4282 = new class717(this.field4201, 5126, 2, 12);
            this.field4152.method1913(109, this);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([IIIIIZ)Lqda;")
    public final class112 method481(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4104;
        return new class708(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "(I)V")
    private final void method1890(int arg0) {
        ++field4041;
        OpenGL.glMatrixMode(5889);
        if (arg0 != 16) {
            this.method396(-0.052486263F, 0.63629F, 1.0881131F);
        }
        OpenGL.glLoadMatrixf(this.field4215, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIIZ)Lqda;")
    public final class112 method504(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3952;
        return new class708(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
    public final void method393(boolean arg0) {
        ++field4100;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4049;
        this.method1821(-92);
        this.method1817(arg5, 2);
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
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kv", name = "Y", descriptor = "()[I")
    public final int[] method469() {
        ++field4106;
        return new int[] { this.field4293, this.field4311, this.field4278, this.field4204 };
    }

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "(I)V")
    private final void method1891(int arg0) {
        ++field3964;
        int var2 = 42 % ((arg0 - -13) / 63);
        if (this.field4256 != 3) {
            this.field4256 = 3;
            this.method1896(-27996);
            this.method1855(7937);
            this.field4198 &= -8;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method498(Canvas arg0, int arg1, int arg2) {
        ++field4144;
        if (this.field4102 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3991.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field4008.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field3991.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(IIIIII)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4135;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1821(-101);
        this.method1817(arg5, 2);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4214) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4214) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(ZI)V")
    public final void method1892(boolean arg0, int arg1) {
        if (!this.field4195 != !arg0) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field4195 = arg0;
            this.field4198 &= -32;
        }
        if (arg1 < 64) {
            this.method433();
        }
        ++field3953;
    }

    @OriginalMember(owner = "client!kv", name = "la", descriptor = "()V")
    public final void method463() {
        this.field4300 = 0;
        this.field4263 = 0;
        this.field4228 = this.field4129;
        this.field4297 = this.field4070;
        ++field4051;
        OpenGL.glDisable(3089);
        this.method1823((byte) -59);
    }

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "(I)V")
    private final void method1893(int arg0) {
        class754.field10431[0] = this.field4248 * this.field4232;
        ++field4015;
        class754.field10431[2] = this.field4248 * this.field4203;
        class754.field10431[3] = 1.0F;
        class754.field10431[arg0] = this.field4248 * this.field4220;
        OpenGL.glLightModelfv(2899, class754.field10431, 0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIZ)Lqda;")
    public final class112 method502(int arg0, int arg1, boolean arg2) {
        ++field4074;
        return new class708(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "(I)V")
    public final void method1894(int arg0) {
        if (arg0 <= -80) {
            ++field4098;
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "()I")
    public final int method466() {
        ++field4136;
        return this.field4183 + this.field4181 + this.field4182;
    }

    @OriginalMember(owner = "client!kv", name = "T", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < this.field4297) {
            this.field4297 = arg3;
        }
        ++field4046;
        if (~this.field4300 > ~arg1) {
            this.field4300 = arg1;
        }
        if (~this.field4228 < ~arg2) {
            this.field4228 = arg2;
        }
        if (this.field4263 < arg0) {
            this.field4263 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method1823((byte) -59);
        this.method1837(51);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(FB)V")
    public final void method1895(float arg0, byte arg1) {
        if (arg1 <= -34) {
            ++field4018;
            if (this.field4250 != arg0) {
                this.field4250 = arg0;
                if (~this.field4256 == -4) {
                    this.method1896(-27996);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "(I)V")
    private final void method1896(int arg0) {
        ++field4095;
        float var2 = (float) (-this.field4293) * this.field4250 / (float) this.field4278;
        float var3 = (float) (-this.field4311) * this.field4250 / (float) this.field4204;
        float var4 = (float) (-this.field4293 + this.field4129) * this.field4250 / (float) this.field4278;
        float var5 = (float) (-this.field4311 + this.field4070) * this.field4250 / (float) this.field4204;
        OpenGL.glMatrixMode(5889);
        if (arg0 != -27996) {
            this.method440(-34, 12, 46, 31, 17);
        }
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field4227, (double) this.field4267);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "()Z")
    public final boolean method497() {
        ++field4120;
        return this.field4154 != null && (this.field4153 <= 1 || this.field4301);
    }

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "(II)I")
    public final int method1897(int arg0, int arg1) {
        ++field4009;
        if (arg1 != 5121 && arg1 != 5120) {
            int var3 = -95 / ((-32 - arg0) / 52);
            if (~arg1 != -5124 && ~arg1 != -5123) {
                if (arg1 != 5125 && ~arg1 != -5125 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!kv", name = "XA", descriptor = "()I")
    public final int method425() {
        ++field4055;
        return this.field4267;
    }

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "(I)V")
    private final void method1898(int arg0) {
        ++field3978;
        this.field4216 = new class599[this.field4205];
        this.field4235 = new class158(this, 3553, 6408, 1, 1);
        new class158(this, 3553, 6408, 1, 1);
        new class158(this, 3553, 6408, 1, 1);
        if (arg0 != -10593) {
            this.field4271 = -67;
        }
        this.field4208 = new class37(this);
        this.field4281 = new class37(this);
        this.field4275 = new class37(this);
        this.field4306 = new class37(this);
        this.field4280 = new class37(this);
        this.field4303 = new class37(this);
        this.field4277 = new class37(this);
        this.field4259 = new class37(this);
        this.field4270 = new class37(this);
        this.field4302 = new class37(this);
        if (this.field4285) {
            this.field4217 = new class50(this);
            new class50(this);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lmda;IIII)V")
    public final void method1899(class274 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4115;
        int var6 = arg0.method1775(false);
        int var7 = arg4 * this.method1897(-86, var6);
        this.method1847(arg0, (byte) -94);
        int var8 = -88 % ((arg1 - 51) / 35);
        OpenGL.glDrawElements(arg2, arg3, var6, (long) var7 + arg0.method1777(-30677));
    }

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "(I)V")
    public final void method1900(int arg0) {
        if (arg0 == -1) {
            ++field4087;
            if (this.field4198 != 16) {
                this.method1891(106);
                this.method1871(119, true);
                this.method1892(true, 79);
                this.method1826(true, -108);
                this.method1817(1, 2);
                this.field4198 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "L", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        if (~this.field4244 != ~arg0 || ~this.field4221 != ~arg1 || this.field4254 != arg2) {
            this.field4254 = arg2;
            this.field4244 = arg0;
            this.field4221 = arg1;
            this.method1832((byte) -27);
            this.method1834(9911);
        }
        ++field4012;
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "()V")
    public final void method413() {
        ++field4053;
        if (!this.field4285) {
            if (!this.field4207) {
                throw new RuntimeException("");
            }
            this.field4177.method782(0, 0, this.field4129, this.field4070, 0, 0);
            this.field4008.setSurface(this.field4031);
        } else {
            if (this.field4179 != this.field4173) {
                throw new RuntimeException();
            }
            this.field4179.method332(0, (byte) 86);
            this.field4179.method332(8, (byte) 119);
            this.method1861(this.field4179, (byte) 94);
        }
        this.field4070 = this.field4111;
        this.field4129 = this.field4072;
        this.field4177 = null;
        this.method1887(80);
        this.method1833((byte) -12);
        this.method463();
    }

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "(IIIIIII)I")
    public final int method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3988;
        float var8 = (float) arg2 * this.field4192.field10044 + (float) arg0 * this.field4192.field10030 + (float) arg1 * this.field4192.field10032 + this.field4192.field10037;
        float var9 = (float) arg5 * this.field4192.field10044 + (float) arg3 * this.field4192.field10030 + (float) arg4 * this.field4192.field10032 + this.field4192.field10037;
        int var10 = 0;
        if ((float) this.field4227 > var8 && var9 < (float) this.field4227) {
            var10 |= 16;
        } else if (var8 > (float) this.field4267 && (float) this.field4267 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field4192.field10043 + (float) arg0 * this.field4192.field10031 + (float) arg1 * this.field4192.field10018 + this.field4192.field10041) * (float) this.field4278 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field4192.field10043 + (float) arg3 * this.field4192.field10031 + (float) arg4 * this.field4192.field10018 + this.field4192.field10041) * (float) this.field4278 / (float) arg6);
        if (this.field4265 > (float) var11 && this.field4265 > (float) var12) {
            var10 |= 1;
        } else if ((float) var11 > this.field4274 && (float) var12 > this.field4274) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field4192.field10024 + (float) arg0 * this.field4192.field10023 + (float) arg1 * this.field4192.field10039 + this.field4192.field10042) * (float) this.field4204 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field4192.field10024 + (float) arg3 * this.field4192.field10023 + (float) arg4 * this.field4192.field10039 + this.field4192.field10042) * (float) this.field4204 / (float) arg6);
        if (this.field4239 > (float) var13 && this.field4239 > (float) var14) {
            var10 |= 4;
        } else if ((float) var13 > this.field4295 && (float) var14 > this.field4295) {
            var10 |= 8;
        }
        return var10;
    }
}
