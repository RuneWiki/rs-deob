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

@OriginalClass("client!tu")
public abstract class class294 extends class605 {

    @OriginalMember(owner = "client!tu", name = "Wb", descriptor = "Leea;")
    private class114 field4153 = new class114();

    @OriginalMember(owner = "client!tu", name = "Id", descriptor = "Z")
    public boolean field4243 = true;

    @OriginalMember(owner = "client!tu", name = "Jd", descriptor = "Lnh;")
    public class646 field4244 = new class646();

    @OriginalMember(owner = "client!tu", name = "Td", descriptor = "Lnh;")
    public class646 field4254 = new class646();

    @OriginalMember(owner = "client!tu", name = "Ud", descriptor = "Lnh;")
    public class646 field4255 = new class646();

    @OriginalMember(owner = "client!tu", name = "Vd", descriptor = "Lnh;")
    public class646 field4256 = new class646();

    @OriginalMember(owner = "client!tu", name = "Wd", descriptor = "Lnh;")
    private class646 field4257 = new class646();

    @OriginalMember(owner = "client!tu", name = "Xd", descriptor = "Lnh;")
    private class646 field4258 = new class646();

    @OriginalMember(owner = "client!tu", name = "he", descriptor = "I")
    public int field4268 = 0;

    @OriginalMember(owner = "client!tu", name = "ke", descriptor = "Z")
    private boolean field4271 = false;

    @OriginalMember(owner = "client!tu", name = "Yd", descriptor = "I")
    public int field4259 = 0;

    @OriginalMember(owner = "client!tu", name = "Ee", descriptor = "[F")
    private float[] field4291 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!tu", name = "oe", descriptor = "F")
    public float field4275 = 1.0F;

    @OriginalMember(owner = "client!tu", name = "ze", descriptor = "[Lic;")
    private class607[] field4286 = new class607[10];

    @OriginalMember(owner = "client!tu", name = "xe", descriptor = "F")
    private float field4284 = 3000.0F;

    @OriginalMember(owner = "client!tu", name = "me", descriptor = "F")
    public float field4273 = 3584.0F;

    @OriginalMember(owner = "client!tu", name = "te", descriptor = "I")
    private int field4280 = 0;

    @OriginalMember(owner = "client!tu", name = "pe", descriptor = "Z")
    private boolean field4276 = false;

    @OriginalMember(owner = "client!tu", name = "ee", descriptor = "I")
    public int field4265 = 0;

    @OriginalMember(owner = "client!tu", name = "Xe", descriptor = "I")
    public int field4310 = -1;

    @OriginalMember(owner = "client!tu", name = "Ye", descriptor = "Z")
    public boolean field4311 = false;

    @OriginalMember(owner = "client!tu", name = "ve", descriptor = "I")
    public int field4282 = 512;

    @OriginalMember(owner = "client!tu", name = "Ve", descriptor = "F")
    public float field4308 = 1.0F;

    @OriginalMember(owner = "client!tu", name = "Ae", descriptor = "[F")
    private float[] field4287 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!tu", name = "ff", descriptor = "I")
    private int field4318 = 0;

    @OriginalMember(owner = "client!tu", name = "Te", descriptor = "Z")
    private boolean field4306 = false;

    @OriginalMember(owner = "client!tu", name = "Zd", descriptor = "F")
    private float field4260 = 1.0F;

    @OriginalMember(owner = "client!tu", name = "ie", descriptor = "I")
    public int field4269 = 128;

    @OriginalMember(owner = "client!tu", name = "jf", descriptor = "I")
    public int field4321 = 0;

    @OriginalMember(owner = "client!tu", name = "Fe", descriptor = "Z")
    public boolean field4292 = true;

    @OriginalMember(owner = "client!tu", name = "Le", descriptor = "I")
    public int field4298 = 512;

    @OriginalMember(owner = "client!tu", name = "Me", descriptor = "[F")
    private float[] field4299 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!tu", name = "pf", descriptor = "I")
    private int field4327 = -1;

    @OriginalMember(owner = "client!tu", name = "yf", descriptor = "[F")
    private float[] field4336 = new float[16];

    @OriginalMember(owner = "client!tu", name = "Qe", descriptor = "I")
    public int field4303 = 3;

    @OriginalMember(owner = "client!tu", name = "mf", descriptor = "[F")
    public float[] field4324 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!tu", name = "qf", descriptor = "Z")
    private boolean field4328 = false;

    @OriginalMember(owner = "client!tu", name = "Af", descriptor = "[F")
    private float[] field4338 = new float[16];

    @OriginalMember(owner = "client!tu", name = "Cf", descriptor = "I")
    public int field4340 = 0;

    @OriginalMember(owner = "client!tu", name = "nf", descriptor = "Z")
    public boolean field4325 = false;

    @OriginalMember(owner = "client!tu", name = "ge", descriptor = "Z")
    public boolean field4267 = true;

    @OriginalMember(owner = "client!tu", name = "of", descriptor = "F")
    public float field4326 = 1.0F;

    @OriginalMember(owner = "client!tu", name = "ne", descriptor = "F")
    public float field4274 = -1.0F;

    @OriginalMember(owner = "client!tu", name = "We", descriptor = "Z")
    public boolean field4309 = false;

    @OriginalMember(owner = "client!tu", name = "kf", descriptor = "Z")
    public boolean field4322 = true;

    @OriginalMember(owner = "client!tu", name = "ye", descriptor = "I")
    public int field4285 = 3584;

    @OriginalMember(owner = "client!tu", name = "Hf", descriptor = "I")
    public int field4345 = 50;

    @OriginalMember(owner = "client!tu", name = "Ze", descriptor = "[F")
    public float[] field4312 = this.field4287;

    @OriginalMember(owner = "client!tu", name = "de", descriptor = "Z")
    public boolean field4264 = false;

    @OriginalMember(owner = "client!tu", name = "af", descriptor = "I")
    private int field4313 = 1;

    @OriginalMember(owner = "client!tu", name = "lf", descriptor = "I")
    public int field4323 = 8;

    @OriginalMember(owner = "client!tu", name = "sf", descriptor = "I")
    public int field4330 = 0;

    @OriginalMember(owner = "client!tu", name = "Df", descriptor = "I")
    public int field4341 = 0;

    @OriginalMember(owner = "client!tu", name = "vf", descriptor = "I")
    public int field4333 = 0;

    @OriginalMember(owner = "client!tu", name = "rf", descriptor = "I")
    public int field4329 = -1;

    @OriginalMember(owner = "client!tu", name = "Ff", descriptor = "I")
    private int field4343 = 16777215;

    @OriginalMember(owner = "client!tu", name = "De", descriptor = "F")
    public float field4290 = 3584.0F;

    @OriginalMember(owner = "client!tu", name = "zf", descriptor = "[F")
    public float[] field4337 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!tu", name = "Qf", descriptor = "Los;")
    public class379 field4354 = class331.field4766;

    @OriginalMember(owner = "client!tu", name = "Gf", descriptor = "Lqg;")
    public class398 field4344 = class229.field3207;

    @OriginalMember(owner = "client!tu", name = "be", descriptor = "I")
    private int field4262 = 0;

    @OriginalMember(owner = "client!tu", name = "Jf", descriptor = "I")
    private int field4347 = -1;

    @OriginalMember(owner = "client!tu", name = "Nf", descriptor = "I")
    public int field4351 = 0;

    @OriginalMember(owner = "client!tu", name = "Vf", descriptor = "I")
    public int field4359 = -1;

    @OriginalMember(owner = "client!tu", name = "Bf", descriptor = "Z")
    public boolean field4339 = true;

    @OriginalMember(owner = "client!tu", name = "Wf", descriptor = "[F")
    private float[] field4360 = new float[16];

    @OriginalMember(owner = "client!tu", name = "gf", descriptor = "Z")
    public boolean field4319 = true;

    @OriginalMember(owner = "client!tu", name = "Pf", descriptor = "I")
    private int field4353 = 0;

    @OriginalMember(owner = "client!tu", name = "df", descriptor = "Z")
    private boolean field4316 = false;

    @OriginalMember(owner = "client!tu", name = "Tf", descriptor = "F")
    public float field4357 = -1.0F;

    @OriginalMember(owner = "client!tu", name = "Mf", descriptor = "I")
    public int field4350 = 0;

    @OriginalMember(owner = "client!tu", name = "Oe", descriptor = "F")
    public float field4301 = 1.0F;

    @OriginalMember(owner = "client!tu", name = "He", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4294 = new Stream();

    @OriginalMember(owner = "client!tu", name = "og", descriptor = "Lnh;")
    private class646 field4378 = new class646();

    @OriginalMember(owner = "client!tu", name = "yc", descriptor = "Ljava/lang/Object;")
    public Object field4181;

    @OriginalMember(owner = "client!tu", name = "xb", descriptor = "Ljava/lang/Object;")
    private Object field4128;

    @OriginalMember(owner = "client!tu", name = "le", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!tu", name = "uc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4177;

    @OriginalMember(owner = "client!tu", name = "Lc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4194;

    @OriginalMember(owner = "client!tu", name = "ed", descriptor = "Lkea;")
    public class203 field4213;

    @OriginalMember(owner = "client!tu", name = "ae", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!tu", name = "W", descriptor = "I")
    private int field4101;

    @OriginalMember(owner = "client!tu", name = "nc", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!tu", name = "D", descriptor = "I")
    private int field4082;

    @OriginalMember(owner = "client!tu", name = "Eb", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!tu", name = "Ce", descriptor = "Lbaa;")
    private class452 field4289;

    @OriginalMember(owner = "client!tu", name = "Hd", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field4242;

    @OriginalMember(owner = "client!tu", name = "Md", descriptor = "Lsd;")
    public static class80 field4247 = new class80(64);

    @OriginalMember(owner = "client!tu", name = "je", descriptor = "F")
    public float field4270;

    @OriginalMember(owner = "client!tu", name = "se", descriptor = "F")
    public float field4279;

    @OriginalMember(owner = "client!tu", name = "Ke", descriptor = "F")
    private float field4297;

    @OriginalMember(owner = "client!tu", name = "bf", descriptor = "F")
    public float field4314;

    @OriginalMember(owner = "client!tu", name = "cf", descriptor = "F")
    private float field4315;

    @OriginalMember(owner = "client!tu", name = "uf", descriptor = "F")
    private float field4332;

    @OriginalMember(owner = "client!tu", name = "Ef", descriptor = "F")
    public float field4342;

    @OriginalMember(owner = "client!tu", name = "Rf", descriptor = "F")
    public float field4355;

    @OriginalMember(owner = "client!tu", name = "Uf", descriptor = "F")
    public float field4358;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!tu", name = "E", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!tu", name = "H", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!tu", name = "M", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!tu", name = "N", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!tu", name = "P", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!tu", name = "Q", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!tu", name = "R", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!tu", name = "S", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!tu", name = "T", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!tu", name = "U", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!tu", name = "V", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!tu", name = "X", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!tu", name = "Y", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!tu", name = "Z", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!tu", name = "bb", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!tu", name = "cb", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!tu", name = "db", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!tu", name = "eb", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!tu", name = "fb", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!tu", name = "gb", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!tu", name = "hb", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!tu", name = "ib", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!tu", name = "jb", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!tu", name = "kb", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!tu", name = "lb", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!tu", name = "mb", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!tu", name = "nb", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!tu", name = "ob", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!tu", name = "pb", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!tu", name = "qb", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!tu", name = "rb", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!tu", name = "sb", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!tu", name = "tb", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!tu", name = "ub", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!tu", name = "vb", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!tu", name = "wb", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!tu", name = "yb", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!tu", name = "zb", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!tu", name = "Ab", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!tu", name = "Bb", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!tu", name = "Cb", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!tu", name = "Db", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!tu", name = "Fb", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!tu", name = "Gb", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!tu", name = "Hb", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!tu", name = "Ib", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!tu", name = "Jb", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!tu", name = "Kb", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!tu", name = "Lb", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!tu", name = "Mb", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!tu", name = "Nb", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!tu", name = "Ob", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!tu", name = "Pb", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!tu", name = "Qb", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!tu", name = "Rb", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!tu", name = "Sb", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!tu", name = "Tb", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!tu", name = "Ub", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!tu", name = "Vb", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!tu", name = "Xb", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!tu", name = "Yb", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!tu", name = "Zb", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!tu", name = "ac", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!tu", name = "bc", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!tu", name = "cc", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!tu", name = "dc", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!tu", name = "ec", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!tu", name = "fc", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!tu", name = "gc", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!tu", name = "hc", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!tu", name = "ic", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!tu", name = "jc", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!tu", name = "kc", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!tu", name = "lc", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!tu", name = "mc", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!tu", name = "oc", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!tu", name = "pc", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!tu", name = "qc", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!tu", name = "rc", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!tu", name = "sc", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!tu", name = "tc", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!tu", name = "vc", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!tu", name = "wc", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!tu", name = "xc", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!tu", name = "zc", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!tu", name = "Ac", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!tu", name = "Bc", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!tu", name = "Cc", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!tu", name = "Dc", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!tu", name = "Ec", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!tu", name = "Fc", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!tu", name = "Gc", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!tu", name = "Hc", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!tu", name = "Jc", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!tu", name = "Kc", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!tu", name = "Mc", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!tu", name = "Nc", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!tu", name = "Oc", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!tu", name = "Pc", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!tu", name = "Qc", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!tu", name = "Rc", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!tu", name = "Sc", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!tu", name = "Tc", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!tu", name = "Uc", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!tu", name = "Vc", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!tu", name = "Wc", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!tu", name = "Xc", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!tu", name = "Yc", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!tu", name = "Zc", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!tu", name = "ad", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!tu", name = "bd", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!tu", name = "cd", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!tu", name = "dd", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!tu", name = "fd", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!tu", name = "gd", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!tu", name = "hd", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!tu", name = "id", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!tu", name = "jd", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!tu", name = "kd", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!tu", name = "ld", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!tu", name = "md", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!tu", name = "nd", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!tu", name = "od", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!tu", name = "qd", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!tu", name = "rd", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!tu", name = "sd", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!tu", name = "td", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!tu", name = "ud", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!tu", name = "vd", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!tu", name = "wd", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!tu", name = "xd", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!tu", name = "yd", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!tu", name = "zd", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!tu", name = "Ad", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!tu", name = "Bd", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!tu", name = "Cd", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!tu", name = "Ed", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!tu", name = "Fd", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!tu", name = "Gd", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!tu", name = "Kd", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!tu", name = "Ld", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!tu", name = "Nd", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!tu", name = "Od", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!tu", name = "Pd", descriptor = "I")
    public int field4250;

    @OriginalMember(owner = "client!tu", name = "Rd", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!tu", name = "Sd", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!tu", name = "ce", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!tu", name = "we", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!tu", name = "Ne", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!tu", name = "Pe", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!tu", name = "Re", descriptor = "I")
    public int field4304;

    @OriginalMember(owner = "client!tu", name = "Ue", descriptor = "I")
    public int field4307;

    @OriginalMember(owner = "client!tu", name = "ef", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!tu", name = "hf", descriptor = "I")
    private int field4320;

    @OriginalMember(owner = "client!tu", name = "Lf", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!tu", name = "Of", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!tu", name = "sg", descriptor = "I")
    private int field4382;

    @OriginalMember(owner = "client!tu", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!tu", name = "gg", descriptor = "Lcca;")
    private class209 field4370;

    @OriginalMember(owner = "client!tu", name = "hg", descriptor = "Lcca;")
    private class209 field4371;

    @OriginalMember(owner = "client!tu", name = "Yf", descriptor = "Loba;")
    public class222 field4362;

    @OriginalMember(owner = "client!tu", name = "ag", descriptor = "Loba;")
    public class222 field4364;

    @OriginalMember(owner = "client!tu", name = "dg", descriptor = "Loba;")
    public class222 field4367;

    @OriginalMember(owner = "client!tu", name = "eg", descriptor = "Loba;")
    public class222 field4368;

    @OriginalMember(owner = "client!tu", name = "fg", descriptor = "Loba;")
    public class222 field4369;

    @OriginalMember(owner = "client!tu", name = "jg", descriptor = "Loba;")
    public class222 field4373;

    @OriginalMember(owner = "client!tu", name = "kg", descriptor = "Loba;")
    public class222 field4374;

    @OriginalMember(owner = "client!tu", name = "ng", descriptor = "Loba;")
    public class222 field4377;

    @OriginalMember(owner = "client!tu", name = "pg", descriptor = "Loba;")
    public class222 field4379;

    @OriginalMember(owner = "client!tu", name = "qg", descriptor = "Loba;")
    public class222 field4380;

    @OriginalMember(owner = "client!tu", name = "qe", descriptor = "Lwd;")
    private class232 field4277;

    @OriginalMember(owner = "client!tu", name = "Se", descriptor = "Lvu;")
    private class286 field4305;

    @OriginalMember(owner = "client!tu", name = "Xf", descriptor = "Lep;")
    public class358 field4361;

    @OriginalMember(owner = "client!tu", name = "Zf", descriptor = "Lep;")
    public class358 field4363;

    @OriginalMember(owner = "client!tu", name = "bg", descriptor = "Lep;")
    private class358 field4365;

    @OriginalMember(owner = "client!tu", name = "cg", descriptor = "Lep;")
    public class358 field4366;

    @OriginalMember(owner = "client!tu", name = "lg", descriptor = "Lep;")
    public class358 field4375;

    @OriginalMember(owner = "client!tu", name = "mg", descriptor = "Lep;")
    private class358 field4376;

    @OriginalMember(owner = "client!tu", name = "ig", descriptor = "Lnq;")
    private class396 field4372;

    @OriginalMember(owner = "client!tu", name = "Be", descriptor = "Liu;")
    public class502 field4288;

    @OriginalMember(owner = "client!tu", name = "Qd", descriptor = "Lwda;")
    public static class555 field4251;

    @OriginalMember(owner = "client!tu", name = "fe", descriptor = "Lic;")
    private class607 field4266;

    @OriginalMember(owner = "client!tu", name = "Dd", descriptor = "Lki;")
    public class616 field4238;

    @OriginalMember(owner = "client!tu", name = "pd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4224;

    @OriginalMember(owner = "client!tu", name = "ab", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field4105;

    @OriginalMember(owner = "client!tu", name = "Ic", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4191;

    @OriginalMember(owner = "client!tu", name = "Ge", descriptor = "Z")
    public boolean field4293;

    @OriginalMember(owner = "client!tu", name = "Je", descriptor = "Z")
    public boolean field4296;

    @OriginalMember(owner = "client!tu", name = "wf", descriptor = "Z")
    public boolean field4334;

    @OriginalMember(owner = "client!tu", name = "If", descriptor = "Z")
    public boolean field4346;

    @OriginalMember(owner = "client!tu", name = "Kf", descriptor = "Z")
    public boolean field4348;

    @OriginalMember(owner = "client!tu", name = "rg", descriptor = "Z")
    public boolean field4381;

    @OriginalMember(owner = "client!tu", name = "tf", descriptor = "[Loj;")
    public class321[] field4331;

    @OriginalMember(owner = "client!tu", name = "xf", descriptor = "[Liu;")
    private class502[] field4335;

    @OriginalMember(owner = "client!tu", name = "re", descriptor = "[Lua;")
    public class581[] field4278;

    @OriginalMember(owner = "client!tu", name = "Sf", descriptor = "[Lua;")
    public class581[] field4356;

    @OriginalMember(owner = "client!tu", name = "Ie", descriptor = "[Lnh;")
    public class646[] field4295;

    @OriginalMember(owner = "client!tu", name = "ue", descriptor = "[Lqda;")
    public class87[] field4281;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "()Z")
    public final boolean method297() {
        ++field4197;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)V")
    public final void method378(boolean arg0) {
        ++field4131;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIILfea;Lnq;)V")
    public abstract void method1508(int arg0, int arg1, int arg2, int arg3, int arg4, class123 arg5, class396 arg6);

    @OriginalMember(owner = "client!tu", name = "IA", descriptor = "()I")
    public final int method369() {
        ++field4235;
        return this.field4285;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)I")
    public final int method1897(int arg0) {
        ++field4163;
        return arg0 != -18644 ? -68 : this.field4327;
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(Z)Lnh;")
    public final class646 method1898(boolean arg0) {
        if (arg0) {
            this.field4379 = null;
        }
        ++field4239;
        return this.field4244;
    }

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "()Z")
    public final boolean method395() {
        ++field4208;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class132 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4097;
        return new class53(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(Z)V")
    public abstract void method1533(boolean arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZIZI)V")
    public final void method1899(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (~this.field4347 != ~arg1) {
            if (~arg1 > -1) {
                this.method1950(7869);
                this.method1971((byte) -122, (class502) null);
                this.method1904(0, -120);
                if (!this.field4293) {
                    this.method1968(0, 0, 0, arg0, arg2, (byte) -7);
                }
            } else {
                class579 var5 = this.field4289.method2796(arg1, 66);
                class614 var6 = super.field8852.method438(90, arg1);
                if (var6.field8927 == 0 && ~var6.field8933 == -1) {
                    this.method1950(arg3 + 7869);
                } else {
                    int var7 = var6.field8944 ? 64 : 128;
                    int var8 = var7 * 50;
                    class646 var9 = this.method1930(1);
                    var9.method3690((float) (this.field4317 % var8 * var6.field8933) / (float) var8, (float) (this.field4317 % var8 * var6.field8927) / (float) var8, 0.0F, 1);
                    this.method1935(class199.field2681, true);
                }
                if (!this.field4293) {
                    this.method1968(var6.field8935, var6.field8925, var6.field8929, arg0, arg2, (byte) -37);
                }
                if (this.field4266 == null) {
                    this.method1971((byte) -100, var5);
                    this.method1904(var6.field8930, arg3 ^ -127);
                } else {
                    this.field4266.method810(var6.field8930, (byte) -111, var5);
                }
            }
            this.field4347 = arg1;
        }
        ++field4204;
        if (arg3 == 0) {
            this.field4320 &= -8;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIII)Ldw;")
    public final class622 method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4216;
        return new class526(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "(I)V")
    public abstract void method1509(int arg0);

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "(Z)V")
    public abstract void method1540(boolean arg0);

    @OriginalMember(owner = "client!tu", name = "U", descriptor = "()I")
    public final int method305() {
        ++field4249;
        return this.field4345;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public final void method1900(byte arg0) {
        ++field4187;
        int var2 = -128 % ((arg0 - 72) / 46);
        Enumeration var3 = this.field4191.keys();
        while (var3.hasMoreElements()) {
            Canvas var4 = (Canvas) var3.nextElement();
            this.method1534(var4, this.field4191.get(var4), (byte) -81);
        }
        this.field4370.method650(true);
        this.field4371.method650(true);
        this.field4374.method1436(false);
        this.field4367.method1436(false);
        this.field4379.method1436(false);
        this.field4364.method1436(false);
        this.field4373.method1436(false);
        this.field4305.method1848(-97);
        this.field4372.method650(true);
    }

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "(I)V")
    private final void method1901(int arg0) {
        ++field4150;
        this.field4276 = false;
        if (arg0 != -30) {
            this.method348(38);
        }
        if (class481.field7061 == this.field4344) {
            this.method1915((byte) 30);
            this.method1903(-8691);
        }
    }

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "(I)F")
    public abstract float method1524(int arg0);

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "(I)V")
    public static void method1902(int arg0) {
        field4247 = null;
        if (arg0 != 16202) {
            method1922(-30, 127, -110, 4, -11);
        }
        field4251 = null;
    }

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "(I)V")
    private final void method1903(int arg0) {
        if (arg0 == -8691) {
            ++field4178;
            this.method1531(123);
            if (this.field4266 != null) {
                this.field4266.method3006(-15201);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "ka", descriptor = "(FF)V")
    public final void method302(float arg0, float arg1) {
        if (this.field4284 != arg0 || this.field4332 != arg1) {
            this.field4284 = arg0;
            this.field4332 = arg1;
            this.method1952(-21761);
            this.method1906(true);
            this.method1901(-30);
            this.method1921(false);
        }
        ++field4118;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILkp;Lvt;)Z")
    public abstract boolean method1552(int arg0, class421 arg1, class256 arg2);

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "(I)V")
    public abstract void method1517(int arg0);

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(II)V")
    public final void method1904(int arg0, int arg1) {
        ++field4183;
        if (~arg0 != -2) {
            if (arg0 != 0) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.method1912(class543.field7773, class543.field7773, -51);
                        }
                    } else {
                        this.method1912(class457.field6837, class107.field1276, -105);
                    }
                } else {
                    this.method1912(class274.field3839, class310.field4559, 120);
                }
            } else {
                this.method1912(class457.field6837, class457.field6837, 123);
            }
        } else {
            this.method1912(class274.field3839, class274.field3839, 125);
        }
        if (arg1 > -116) {
            this.field4351 = -93;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lkp;BLvt;)Z")
    public abstract boolean method1528(class421 arg0, byte arg1, class256 arg2);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method361(Canvas arg0) {
        ++field4104;
        this.field4194 = null;
        this.field4128 = null;
        if (arg0 != null && this.field4177 != arg0) {
            if (this.field4191.containsKey(arg0)) {
                this.field4128 = this.field4191.get(arg0);
                this.field4194 = arg0;
            }
        } else {
            this.field4128 = this.field4181;
            this.field4194 = this.field4177;
        }
        if (this.field4194 != null && this.field4128 != null) {
            this.method1553(this.field4128, -83, this.field4194);
            this.method1913(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BZ)V")
    public final void method1905(byte arg0, boolean arg1) {
        if (this.field4325 != arg1) {
            this.field4325 = arg1;
            this.method1517(106);
            this.field4320 &= -32;
        }
        ++field4222;
        int var3 = -97 / ((-61 - arg0) / 51);
    }

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "(Z)V")
    private final void method1906(boolean arg0) {
        if (this.field4332 == 0.0F) {
            this.field4338[10] = this.field4315;
            this.field4338[14] = this.field4297;
        } else {
            float var2 = this.field4284 / (this.field4332 + this.field4284);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field4297 * (1.0F - var2) / this.field4332;
            this.field4338[14] = this.field4297 * var3;
            this.field4338[10] = this.field4315 + var4;
        }
        ++field4086;
        if (!arg0) {
            this.field4191 = null;
        }
        this.field4273 = (this.field4338[14] + (float) (-this.field4285)) / this.field4338[10];
    }

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "(I)V")
    public abstract void method1545(int arg0);

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method357(Canvas arg0) {
        ++field4112;
        if (this.field4177 == arg0) {
            throw new RuntimeException();
        } else if (this.field4191.containsKey(arg0)) {
            this.method1534(arg0, this.field4191.get(arg0), (byte) -19);
            this.field4191.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lkm;ZI)V")
    public final void method1907(class299 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field4291 = null;
        }
        this.method1551(arg0, false, arg2, (byte) -100);
        ++field4138;
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(IIIII)V")
    public final void method306(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method320(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field4215;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILfea;I)V")
    private final void method1908(int arg0, class123 arg1, int arg2) {
        this.method1558(this.field4370, arg2 + -101, 0);
        ++field4119;
        this.method1562(88, this.field4365);
        this.method1561(arg2, arg0, 19382, arg1);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I")
    public final int method300(int arg0, int arg1) {
        ++field4188;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(II)V")
    public abstract void method1507(int arg0, int arg1);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
    public final void method323(boolean arg0) {
        this.field4292 = arg0;
        ++field4212;
        this.method1517(-111);
    }

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "(I)V")
    public final void method348(int arg0) {
        ++field4092;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lba;Lbe;Lq;Lsda;I)V")
    public final void method307(class327 arg0, class33 arg1, class364 arg2, class219 arg3, int arg4) {
        arg0.method1380(arg2, arg3, arg4);
        ++field4209;
        this.method396(arg1);
    }

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "(Z)V")
    private final void method1909(boolean arg0) {
        if (this.field4266 != null) {
            this.field4266.method813(-8635);
        }
        ++field4141;
        if (arg0) {
            this.method1975(97);
        }
        this.method1544((byte) -117);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class433 method389(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4193;
        class246 var6 = new class246(this, arg2, arg3, arg4);
        var6.method1581(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(FB)V")
    public final void method1910(float arg0, byte arg1) {
        ++field4071;
        if (arg1 != -40) {
            this.method1959(-84);
        }
        if (this.field4260 != arg0) {
            this.field4260 = arg0;
            this.method1901(-30);
        }
    }

    @OriginalMember(owner = "client!tu", name = "Q", descriptor = "(IIII)V")
    public final void method333(int arg0, int arg1, int arg2, int arg3) {
        ++field4225;
        boolean var5 = false;
        if (~this.field4268 > ~arg0) {
            var5 = true;
            this.field4268 = arg0;
        }
        if (~this.field4321 < ~arg2) {
            var5 = true;
            this.field4321 = arg2;
        }
        if (~this.field4265 > ~arg1) {
            var5 = true;
            this.field4265 = arg1;
        }
        if (this.field4351 > arg3) {
            var5 = true;
            this.field4351 = arg3;
        }
        if (var5) {
            if (!this.field4381) {
                this.field4381 = true;
                this.method1538((byte) 116);
            }
            this.method1526(-104);
            this.method1967(-117);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
    public final void method1911(byte arg0) {
        ++field4164;
        if (arg0 <= -80) {
            if (~this.field4320 != -17) {
                this.method1976(15491);
                this.method1978(true, 20096);
                this.method1969(true, false);
                this.method1905((byte) -114, true);
                this.method1961(1, 11557);
                this.field4320 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([Lba;Lq;[Lsda;I)V")
    public final void method385(class327[] arg0, class364 arg1, class219[] arg2, int arg3) {
        ++field4157;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1380(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lua;Lua;I)V")
    public final void method1912(class581 arg0, class581 arg1, int arg2) {
        ++field4154;
        int var4 = 74 / ((arg2 - 48) / 46);
        boolean var5 = false;
        if (this.field4356[this.field4259] != arg1) {
            this.field4356[this.field4259] = arg1;
            this.method1530(true);
            var5 = true;
        }
        if (this.field4278[this.field4259] != arg0) {
            this.field4278[this.field4259] = arg0;
            this.method1515((byte) 55);
            var5 = true;
        }
        if (var5) {
            this.field4320 &= -30;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Li;)V")
    public final void method314(class35 arg0) {
        this.field4224 = ((class374) arg0).field5700;
        ++field4245;
        this.field4105 = this.field4224.method3408(32768, false);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZIII[II)Lica;")
    public abstract class579 method1549(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6);

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "(I)V")
    private final void method1913(int arg0) {
        if (this.field4194 == null) {
            this.field4101 = this.field4082 = 1;
        } else {
            Dimension var2 = this.field4194.getSize();
            this.field4082 = var2.height;
            this.field4101 = var2.width;
        }
        ++field4087;
        if (arg0 == 0) {
            this.field4135 = this.field4082;
            this.field4170 = this.field4101;
            this.method1973((byte) 120);
            this.method1921(false);
            this.method1901(-30);
            this.method1560((byte) 122);
            this.method1967(-74);
            this.method1975(-3);
            this.method404();
        }
    }

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "(I)I")
    public final int method1914(int arg0) {
        if (arg0 != 0) {
            this.field4307 = -36;
        }
        ++field4130;
        return this.field4353;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method1553(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(BZ)Lnq;")
    public abstract class396 method1535(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V")
    private final void method1915(byte arg0) {
        int var2 = -82 % ((-58 - arg0) / 50);
        if (!this.field4276) {
            float[] var3 = this.field4336;
            float var4 = (float) this.field4345 + -this.field4332;
            float var5 = (float) this.field4285 - this.field4332;
            float var6 = (float) (-this.field4341) * this.field4260 / (float) this.field4298;
            float var7 = (float) (-this.field4350) * this.field4260 / (float) this.field4282;
            float var8 = (float) (-this.field4350 + this.field4170) * this.field4260 / (float) this.field4282;
            float var9 = (float) (-this.field4341 + this.field4135) * this.field4260 / (float) this.field4298;
            if (var7 != var8 && var6 != var9) {
                var3[4] = 0.0F;
                var3[0] = 2.0F / (var8 - var7);
                var3[14] = var4 / (var4 - var5);
                var3[1] = 0.0F;
                var3[15] = 1.0F;
                var3[3] = 0.0F;
                var3[6] = 0.0F;
                var3[2] = 0.0F;
                var3[9] = 0.0F;
                var3[11] = 0.0F;
                var3[5] = 2.0F / (var9 - var6);
                var3[12] = (var7 + var8) / (var7 - var8);
                var3[13] = (var6 + var9) / (var9 - var6);
                var3[10] = 1.0F / (-var5 + var4);
                var3[7] = 0.0F;
                var3[8] = 0.0F;
            } else {
                var3[2] = 0.0F;
                var3[15] = 1.0F;
                var3[6] = 0.0F;
                var3[8] = 0.0F;
                var3[14] = 0.0F;
                var3[3] = 0.0F;
                var3[5] = 1.0F;
                var3[1] = 0.0F;
                var3[4] = 0.0F;
                var3[9] = 0.0F;
                var3[11] = 0.0F;
                var3[0] = 1.0F;
                var3[10] = 1.0F;
                var3[12] = 0.0F;
                var3[13] = 0.0F;
                var3[7] = 0.0F;
            }
            this.method1952(-21761);
            this.field4276 = true;
        }
        ++field4168;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public void method400(int arg0) {
        this.field4289.method2794(-5180);
        ++field4179;
        this.field4317 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)V")
    public abstract void method1547(byte arg0);

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "(Z)V")
    public abstract void method1541(boolean arg0);

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "()I")
    public final int method324() {
        ++field4211;
        return this.field4352 + -2;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIILfea;)V")
    public abstract void method1561(int arg0, int arg1, int arg2, class123 arg3);

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "(I)V")
    private final void method1916(int arg0) {
        if (arg0 != 30851) {
            this.method364(-63, -127, -58, (int[]) null);
        }
        if (!this.field4306) {
            float[] var2 = this.field4360;
            this.field4306 = true;
            if (~this.field4170 != -1 && this.field4135 != 0) {
                var2[0] = 2.0F / (float) this.field4170;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[12] = -1.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = -2.0F / (float) this.field4135;
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[14] = 0.5F;
                var2[13] = 1.0F;
                var2[10] = 0.5F;
            } else {
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[10] = 1.0F;
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[14] = 0.0F;
                var2[12] = 0.0F;
            }
        }
        ++field4094;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZZ)V")
    public final void method1917(boolean arg0, boolean arg1) {
        if (!arg1) {
            ++field4110;
            if (!arg0 != !this.field4311) {
                this.field4311 = arg0;
                this.method1527(-64);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "(I)V")
    private final void method1918(int arg0) {
        if (arg0 != -23596) {
            this.field4257 = null;
        }
        ++field4127;
        if (~this.field4320 != -2) {
            this.method1927(28295);
            this.method1978(false, 20096);
            this.method1931(false, -115);
            this.method1969(false, false);
            this.method1905((byte) -123, false);
            this.method1899(false, -2, false, 0);
            this.method1904(1, -121);
            this.method1971((byte) -73, this.field4288);
            this.field4320 = 1;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILep;)V")
    public abstract void method1562(int arg0, class358 arg1);

    @OriginalMember(owner = "client!tu", name = "X", descriptor = "(III)V")
    public final void method352(int arg0, int arg1, int arg2) {
        if (this.field4359 != arg0 || this.field4310 != arg1 || ~this.field4330 != ~arg2) {
            this.field4359 = arg0;
            this.field4330 = arg2;
            this.field4310 = arg1;
            if (!this.field4293) {
                this.method1909(false);
                this.method1566((byte) 95);
            }
        }
        ++field4159;
    }

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "()Lq;")
    public final class364 method342() {
        ++field4106;
        return this.field4378;
    }

    @OriginalMember(owner = "client!tu", name = "AA", descriptor = "(IIII)V")
    public final void method365(int arg0, int arg1, int arg2, int arg3) {
        this.field4293 = true;
        this.field4329 = arg1;
        ++field4236;
        this.field4349 = arg0;
        this.field4353 = arg3;
        this.field4327 = arg2;
        this.method1968(3, 0, 0, false, false, (byte) -96);
        if (this.field4266 != null) {
            this.field4266.method806(true);
        }
        this.method1909(false);
        this.method1566((byte) 95);
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(B)Lwn;")
    public final class627 method1919(byte arg0) {
        ++field4218;
        if (arg0 <= 89) {
            this.method347((Canvas) null);
        }
        return this.field4277 != null ? this.field4277.method1491(-118) : null;
    }

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "()Z")
    public final boolean method325() {
        ++field4076;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
    public final void method1920(boolean arg0, byte arg1) {
        ++field4075;
        if (arg1 < 24) {
            this.field4304 = 99;
        }
        if (this.field4339 != arg0) {
            this.field4339 = arg0;
            this.method1566((byte) 95);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lor;IIII)Lba;")
    public final class327 method326(class557 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4148;
        return new class222(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "(ILfa;II)V")
    public final void method312(int arg0, class199 arg1, int arg2, int arg3) {
        ++field4144;
        class50 var5 = (class50) arg1;
        class579 var6 = var5.field532;
        this.method1963((byte) 125);
        this.method1971((byte) -102, var6);
        this.method1961(1, 11557);
        this.method1912(class274.field3839, class274.field3839, -81);
        this.method1970(-119, class173.field2123, 0);
        this.method1939(arg0, true);
        this.field4244.method3705(0.0F, (float) this.field4170, -1, (float) this.field4135);
        this.method1959(8769);
        this.field4295[0].method3705(1.0F, var6.method473(false, (float) this.field4170), -1, var6.method474(122, (float) this.field4135));
        this.field4295[0].method3692(var6.method473(false, (float) (-arg2)), var6.method474(-116, (float) (-arg3)), 0.0F, 0);
        this.field4281[0] = class199.field2681;
        this.method1934(0);
        this.method1925((byte) 114);
        this.method1950(7869);
        this.method1970(102, class83.field935, 0);
    }

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "()V")
    public final void method373() {
        ++field4090;
        this.field4293 = false;
        this.method1968(0, 0, 0, false, false, (byte) -32);
        this.method1909(false);
        this.method1566((byte) 95);
    }

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "(Z)V")
    private final void method1921(boolean arg0) {
        ++field4210;
        this.field4271 = false;
        this.method1946(arg0);
        if (class31.field351 == this.field4344) {
            this.method1903(-8691);
        }
    }

    @OriginalMember(owner = "client!tu", name = "D", descriptor = "()Z")
    public final boolean method334() {
        ++field4084;
        return false;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([IIIII)Lxa;")
    public final class433 method343(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4147;
        return new class246(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
    public final void method345(int arg0) {
        ++field4201;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(IIIII)V")
    public static final void method1922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (client.field3599 != null) {
            client.field3599[arg0][arg1] = -16777216 | arg2;
        }
        if (class184.field2290 != null) {
            class184.field2290[arg0][arg1] = (short) arg3;
        }
        if (class136.field1696 != null) {
            class136.field1696[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "(B)V")
    public abstract void method1515(byte arg0);

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(BZ)V")
    public final void method1923(byte arg0, boolean arg1) {
        if (arg1 == !this.field4267) {
            this.field4267 = arg1;
            this.method1522(3);
        }
        if (arg0 != 47) {
            this.method1928((byte) 92);
        }
        ++field4233;
    }

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "(IIII)V")
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        this.field4282 = arg2;
        this.field4298 = arg3;
        this.field4341 = arg1;
        this.field4350 = arg0;
        ++field4156;
        this.method1901(-30);
        this.method1921(false);
        this.method1975(-3);
        this.method1967(-83);
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Le;Lkea;II)V")
    public class294(Canvas arg0, Object arg1, class462 arg2, class203 arg3, int arg4, int arg5) {
        super(arg2);
        this.field4128 = this.field4181 = arg1;
        this.field4272 = arg4;
        this.field4194 = this.field4177 = arg0;
        this.field4213 = arg3;
        Dimension var7 = arg0.getSize();
        this.field4261 = arg5;
        this.field4170 = this.field4101 = var7.width;
        this.field4135 = this.field4082 = var7.height;
        class27.method157(true, false, (byte) 2);
        this.field4289 = new class452(this, super.field8852);
        this.field4242 = new NativeInterface(super.field8852.method434((byte) 67), this.field4261);
        for (int var8 = 0; super.field8852.method434((byte) 67) > var8; ++var8) {
            class614 var9 = super.field8852.method438(126, var8);
            if (var9 != null) {
                this.field4242.initTextureMetrics(var8, var9.field8926, var9.field8939);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method347(Canvas arg0) {
        ++field4182;
        Object var2 = null;
        if (arg0 != null && this.field4177 != arg0) {
            if (this.field4191.containsKey(arg0)) {
                var2 = this.field4191.get(arg0);
            }
        } else {
            var2 = this.field4128;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1532(var2, 62, arg0);
            if (this.field4194 == arg0) {
                this.method1913(0);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "(B)V")
    public abstract void method1525(byte arg0);

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(II)Lnq;")
    public final class396 method1924(int arg0, int arg1) {
        if (arg0 != -9248) {
            return null;
        } else {
            if (arg1 * 2 > this.field4372.method653(arg0 + 23421)) {
                this.field4372.method654(arg1, 9658);
            }
            ++field4117;
            return this.field4372;
        }
    }

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "(B)V")
    public final void method1925(byte arg0) {
        ++field4219;
        this.method1908(2, class451.field6730, 0);
        int var2 = -97 / ((arg0 - -9) / 47);
    }

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "()Z")
    public final boolean method399() {
        ++field4111;
        return false;
    }

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "(I)V")
    private final void method1926(int arg0) {
        this.field4370 = this.method1548((byte) 107, false);
        ++field4200;
        this.field4370.method1071(28, arg0 ^ -1249, 140);
        for (int var2 = arg0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field4370.method652(true, 31983);
            if (var3 != null) {
                Stream var4 = this.method1932(var3, (byte) -82);
                if (!Stream.method3423()) {
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(1.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(1.0F);
                    var4.method3416(0.0F);
                    var4.method3416(1.0F);
                    var4.method3416(1.0F);
                    var4.method3416(1.0F);
                    var4.method3416(0.0F);
                    var4.method3416(1.0F);
                    var4.method3416(1.0F);
                    var4.method3416(1.0F);
                    var4.method3416(1.0F);
                    var4.method3416(1.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(1.0F);
                    var4.method3416(0.0F);
                    var4.method3416(1.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                    var4.method3416(0.0F);
                } else {
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(1.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(1.0F);
                    var4.method3415(0.0F);
                    var4.method3415(1.0F);
                    var4.method3415(1.0F);
                    var4.method3415(1.0F);
                    var4.method3415(0.0F);
                    var4.method3415(1.0F);
                    var4.method3415(1.0F);
                    var4.method3415(1.0F);
                    var4.method3415(1.0F);
                    var4.method3415(1.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(1.0F);
                    var4.method3415(0.0F);
                    var4.method3415(1.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                    var4.method3415(0.0F);
                }
                var4.method3411();
                if (this.field4370.method651(arg0 + -15045)) {
                    break;
                }
            }
        }
        this.field4365 = this.method1520(new class558[] { new class558(new class596[] { class596.field8705, class596.field8709, class596.field8709 }) }, true);
    }

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "(I)V")
    private final void method1927(int arg0) {
        if (arg0 != 28295) {
            this.method314((class35) null);
        }
        if (class443.field6629 != this.field4344) {
            class398 var2 = this.field4344;
            this.field4344 = class443.field6629;
            if (var2.method2541(124)) {
                this.method1940(true);
            }
            this.method1916(arg0 + 2556);
            this.field4312 = this.field4360;
            this.method1903(arg0 + -36986);
            this.field4320 &= -25;
        }
        ++field4151;
    }

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "(I)Li;")
    public final class35 method355(int arg0) {
        ++field4121;
        class374 var2 = new class374(arg0);
        this.field4153.method706(var2, true);
        return var2;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lcq;[Laf;Z)Lta;")
    public final class181 method329(class402 arg0, class372[] arg1, boolean arg2) {
        ++field4134;
        return new class153(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "(B)V")
    public final void method1928(byte arg0) {
        ++field4166;
        this.method1975(-3);
        if (arg0 != -32) {
            this.method1939(99, false);
        }
        this.method1903(-8691);
    }

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "(B)V")
    public abstract void method1560(byte arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lkp;Z[FIII)Lica;")
    public final class579 method1929(class421 arg0, boolean arg1, float[] arg2, int arg3, int arg4, int arg5) {
        ++field4108;
        return arg4 != 0 ? null : this.method1550(arg1, arg2, 0, arg3, arg0, arg5, 0, true);
    }

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "(I)Lnh;")
    public final class646 method1930(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field4079;
            return this.field4295[this.field4259];
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V")
    public final void method1931(boolean arg0, int arg1) {
        if (arg1 > 0) {
            this.field4309 = true;
        }
        if (arg0 == !this.field4309) {
            this.field4309 = arg0;
            this.method1527(-102);
            this.field4320 &= -8;
        }
        ++field4171;
    }

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "()Z")
    public final boolean method390() {
        ++field4205;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class199 arg6, int arg7, int arg8) {
        ++field4133;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
    public abstract void method1534(Canvas arg0, Object arg1, byte arg2);

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "(I)V")
    public abstract void method1563(int arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;")
    public final Stream method1932(Buffer arg0, byte arg1) {
        ++field4175;
        if (arg1 != -82) {
            return null;
        } else {
            this.field4294.method3417(arg0);
            return this.field4294;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ldw;)V")
    public final void method392(class622 arg0) {
        this.field4277 = (class232) arg0;
        ++field4206;
    }

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "()V")
    public final void method354() {
        this.field4289.method2797(-103);
        ++field4232;
    }

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "(I)V")
    public final void method1933(int arg0) {
        ++field4139;
        Hashtable var2 = new Hashtable();
        if (this.field4191 != null && !this.field4191.isEmpty()) {
            Enumeration var3 = this.field4191.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1565(var4, 0));
            }
        }
        this.field4191 = var2;
        this.method1926(arg0 ^ arg0);
        this.method1960(arg0 ^ 23999);
        this.field4305.method1850(false, this);
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V")
    public final void method296(int arg0) {
        ++field4085;
    }

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "(I)V")
    private final void method1934(int arg0) {
        ++field4223;
        this.method1525((byte) 121);
        if (this.field4266 != null) {
            this.field4266.method2065(true);
        }
        if (arg0 != 0) {
            this.field4273 = -0.7429644F;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)I")
    public final int method293(int arg0, int arg1) {
        ++field4226;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lqda;Z)V")
    public final void method1935(class87 arg0, boolean arg1) {
        if (!arg1) {
            this.field4128 = null;
        }
        ++field4078;
        this.field4281[this.field4259] = arg0;
        this.method1934(0);
    }

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "(I)Lnh;")
    public final class646 method1936(int arg0) {
        ++field4093;
        return arg0 != 1 ? null : this.field4257;
    }

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "(B)Lnh;")
    public final class646 method1937(byte arg0) {
        ++field4174;
        if (!this.field4328) {
            this.field4258.method3682(this.field4256, this.field4244);
            this.field4328 = true;
        }
        return arg0 >= -23 ? null : this.field4258;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZIZLkm;Z)V")
    public abstract void method1521(boolean arg0, int arg1, boolean arg2, class299 arg3, boolean arg4);

    @OriginalMember(owner = "client!tu", name = "sa", descriptor = "(II)V")
    public final void method393(int arg0, int arg1) {
        if (~this.field4345 != ~arg0 || this.field4285 != arg1) {
            this.field4345 = arg0;
            this.field4285 = arg1;
            this.method1921(false);
            this.method1901(-30);
            this.method1909(false);
        }
        ++field4083;
    }

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "(B)Lnh;")
    public final class646 method1938(byte arg0) {
        ++field4207;
        if (arg0 <= 41) {
            this.method1509(-51);
        }
        return this.field4295[this.field4259];
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IILkp;I[BZBI)Lica;")
    public abstract class579 method1536(int arg0, int arg1, class421 arg2, int arg3, byte[] arg4, boolean arg5, byte arg6, int arg7);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([Lck;Z)Lep;")
    public abstract class358 method1520(class558[] arg0, boolean arg1);

    @OriginalMember(owner = "client!tu", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4099;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lbe;)V")
    public final void method396(class33 arg0) {
        ++field4231;
        this.field4305.method1849(arg0, 22484, this);
    }

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "(Z)V")
    public void method1543(boolean arg0) {
        ++field4172;
        if (!arg0) {
            this.method1966(true);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
    public final void method1939(int arg0, boolean arg1) {
        if (~this.field4263 != ~arg0) {
            this.field4263 = arg0;
            this.method1547((byte) -83);
        }
        if (!arg1) {
            this.method369();
        }
        ++field4126;
    }

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "(Z)V")
    private final void method1940(boolean arg0) {
        if (!arg0) {
            this.field4309 = true;
        }
        this.field4328 = false;
        ++field4145;
        if (this.field4266 != null) {
            this.field4266.method3005(17367);
        }
        this.method1545(1864);
    }

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "(I)V")
    private final void method1941(int arg0) {
        ++field4162;
        if (class443.field6629 == this.field4344) {
            float var2 = this.method1524(6423);
            this.field4244.method3692(var2, var2, 0.0F, 0);
        }
        this.field4328 = false;
        this.method1554((byte) -37);
        if (arg0 < -69) {
            if (this.field4266 != null) {
                this.field4266.method3007(-18969);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "(I)V")
    private final void method1942(int arg0) {
        if (arg0 < 27) {
            this.method1968(-115, -69, 104, false, true, (byte) -102);
        }
        ++field4155;
        if (class31.field351 != this.field4344) {
            class398 var2 = this.field4344;
            this.field4344 = class31.field351;
            if (!var2.method2541(50)) {
                this.method1940(true);
            }
            this.method1946(false);
            this.field4312 = this.field4338;
            this.method1903(-8691);
            this.field4320 &= -8;
        }
    }

    @OriginalMember(owner = "client!tu", name = "E", descriptor = "(I)V")
    private final void method1943(int arg0) {
        ++field4142;
        this.method1558(this.field4371, arg0 + 28566, 0);
        this.method1562(68, this.field4376);
        this.method1561(0, 1, arg0 ^ -9288, class624.field9010);
        if (arg0 != -28658) {
            this.field4306 = false;
        }
    }

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "(I)V")
    public void method1529(int arg0) {
        int var2 = 57 / ((arg0 - -8) / 42);
        ++field4069;
        this.field4307 = this.field4300;
        this.field4300 = 0;
    }

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "(I)V")
    public final void method1944(int arg0) {
        if (arg0 == 0) {
            if (~this.field4320 != -5) {
                this.method1927(28295);
                this.method1978(false, 20096);
                this.method1931(false, -77);
                this.method1969(false, false);
                this.method1905((byte) -112, false);
                this.method1899(false, -2, false, 0);
                this.method1961(1, 11557);
                this.method1904(0, -122);
                this.field4320 = 4;
            }
            ++field4241;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(IIIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4103;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        if (this.method1956((float) arg3 + var11, 0.0F, (float) arg0, 0.0F, 121, (float) arg2 + var10, (float) arg1)) {
            this.method1918(-23596);
            this.method1939(arg4, true);
            this.method1970(-107, class173.field2123, 0);
            this.method1907(class173.field2123, true, 0);
            this.method1961(arg5, 11557);
            this.method1945((byte) 126);
            this.method1518(-28192, false);
            this.method1943(-28658);
            this.method1518(-28192, true);
            this.method1907(class83.field935, true, 0);
            this.method1970(-3, class83.field935, 0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "(B)V")
    public final void method1945(byte arg0) {
        this.field4244.method2021();
        ++field4195;
        this.field4243 = true;
        this.method1941(-109);
        if (arg0 < 117) {
            field4251 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "(Z)V")
    private final void method1946(boolean arg0) {
        if (!this.field4271) {
            float[] var2 = this.field4338;
            float var3 = (float) (-this.field4350 * this.field4345) / (float) this.field4282;
            float var4 = (float) ((-this.field4350 + this.field4170) * this.field4345) / (float) this.field4282;
            float var5 = (float) (this.field4345 * this.field4341) / (float) this.field4298;
            float var6 = (float) ((this.field4341 - this.field4135) * this.field4345) / (float) this.field4298;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field4345 * 2.0F;
                var2[11] = -1.0F;
                var2[5] = var7 / (var5 - var6);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[10] = this.field4315 = (float) this.field4285 / (float) (-this.field4285 + this.field4345);
                var2[6] = 0.0F;
                var2[14] = this.field4297 = (float) (this.field4345 * this.field4285) / (float) (-this.field4285 + this.field4345);
                var2[3] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[15] = 0.0F;
                var2[2] = 0.0F;
            } else {
                var2[5] = 1.0F;
                var2[3] = 0.0F;
                var2[0] = 1.0F;
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[4] = 0.0F;
            }
            this.method1906(true);
            this.field4271 = true;
        }
        if (arg0) {
            this.field4307 = 76;
        }
        ++field4173;
    }

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "()Z")
    public final boolean method341() {
        ++field4237;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "()V")
    public void method367() {
        ++field4132;
        if (!this.field4316) {
            for (class324 var1 = this.field4153.method719(false); var1 != null; var1 = this.field4153.method716(14)) {
                ((class374) var1).method2410(-4296);
            }
            Enumeration var2 = this.field4191.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1534(var3, this.field4191.get(var3), (byte) -57);
            }
            class98.method614(1, true, false);
            this.field4242.release();
            this.field4316 = true;
        }
    }

    @OriginalMember(owner = "client!tu", name = "YA", descriptor = "(IFFFFF)V")
    public final void method310(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4129;
        boolean var7 = this.field4343 != arg0;
        if (var7 || this.field4274 != arg1 || this.field4357 != arg2) {
            this.field4274 = arg1;
            this.field4357 = arg2;
            this.field4343 = arg0;
            if (var7) {
                this.field4308 = (float) (16711680 & this.field4343) / 1.671168E7F;
                this.field4301 = (float) (255 & this.field4343) / 255.0F;
                this.field4275 = (float) (this.field4343 & 65280) / 65280.0F;
                this.method1541(true);
            }
            this.field4242.setSunColour(this.field4308, this.field4275, this.field4301, arg1, arg2);
            this.method1516(0);
        }
        if (this.field4291[0] != arg3 || this.field4291[1] != arg4 || this.field4291[2] != arg5) {
            this.field4291[2] = arg5;
            this.field4291[0] = arg3;
            this.field4291[1] = arg4;
            this.field4299[2] = -arg5;
            this.field4299[0] = -arg3;
            this.field4299[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4337[0] = arg3 * var8;
            this.field4337[2] = arg5 * var8;
            this.field4337[1] = arg4 * var8;
            this.field4324[2] = -this.field4337[2];
            this.field4324[1] = -this.field4337[1];
            this.field4324[0] = -this.field4337[0];
            this.field4242.setSunDirection(this.field4337[0], this.field4337[1], this.field4337[2]);
            this.method1563(34);
            this.field4304 = (int) (arg3 * 256.0F / arg4);
            this.field4283 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1509(0);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(IZ)V")
    public abstract void method1518(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[IZII)Lica;")
    public final class579 method1947(int arg0, int[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 <= 95) {
            this.method294(-20, -117, 81, 9, 4, 127, -18, 1, -40, 87);
        }
        ++field4088;
        return this.method1549(10, arg2, 0, arg4, 0, arg1, arg3);
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "()Z")
    public final boolean method363() {
        ++field4160;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "ya", descriptor = "(IIIII)V")
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4246;
        this.method320(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lkp;[BIIZZ)Lica;")
    public final class579 method1948(class421 arg0, byte[] arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        if (!arg5) {
            return null;
        } else {
            ++field4091;
            return this.method1536(0, arg3, arg0, 0, arg1, arg4, (byte) 86, arg2);
        }
    }

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "()V")
    public final void method404() {
        this.field4268 = 0;
        this.field4265 = 0;
        this.field4321 = this.field4170;
        this.field4351 = this.field4135;
        ++field4185;
        if (this.field4381) {
            this.field4381 = false;
            this.method1538((byte) -42);
        }
        this.method1967(-90);
    }

    @OriginalMember(owner = "client!tu", name = "H", descriptor = "(I)V")
    public final void method1949(int arg0) {
        ++field4202;
        if (this.field4320 != 8) {
            this.method1942(31);
            this.method1978(true, 20096);
            this.method1969(true, false);
            this.method1905((byte) -119, true);
            this.method1961(1, arg0 + 11556);
            this.field4320 = 8;
        }
        if (arg0 != 1) {
            this.method369();
        }
    }

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "(I)V")
    public final void method1950(int arg0) {
        ++field4198;
        if (arg0 == 7869) {
            if (this.field4281[this.field4259] != class14.field118) {
                this.field4281[this.field4259] = class14.field118;
                this.field4295[this.field4259].method2021();
                this.method1934(arg0 ^ 7869);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BB)V")
    public final void method1951(byte arg0, byte arg1) {
        ++field4189;
        this.method1939(arg1 << 24 | arg1 << 16 | arg1 << 8 | arg1, true);
        int var3 = -84 / ((24 - arg0) / 35);
    }

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "(I)V")
    private final void method1952(int arg0) {
        ++field4081;
        if (arg0 != -21761) {
            this.field4297 = -1.1614665F;
        }
        this.field4290 = (float) this.field4285 + -this.field4332;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI[[IZ)Lwn;")
    public abstract class627 method1537(boolean arg0, int arg1, int[][] arg2, boolean arg3);

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method1532(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLnh;)V")
    public final void method1953(byte arg0, class646 arg1) {
        this.field4244.method2004(arg1);
        ++field4120;
        this.field4243 = false;
        if (arg0 == -10) {
            this.method1941(arg0 + -64);
        }
    }

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "(IIIIII)V")
    public final void method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1918(-23596);
        ++field4167;
        this.method1939(arg4, true);
        this.method1970(65, class173.field2123, 0);
        this.method1907(class173.field2123, true, 0);
        this.method1961(arg5, 11557);
        this.field4244.method3705(1.0F, (float) arg2, -1, (float) arg3);
        this.field4244.method2006(arg0, arg1, 0);
        this.method1959(8769);
        this.method1518(-28192, false);
        this.method1925((byte) 102);
        this.method1518(-28192, true);
        this.method1907(class83.field935, true, 0);
        this.method1970(24, class83.field935, 0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lcca;II)V")
    public abstract void method1558(class209 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "(Z)V")
    public abstract void method1530(boolean arg0);

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(IIIIII)V")
    public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4102;
        float var7 = this.method1524(6423);
        this.method1918(-23596);
        this.method1939(arg4, true);
        this.method1970(-97, class173.field2123, 0);
        this.method1907(class173.field2123, true, 0);
        this.method1961(arg5, 11557);
        this.field4244.method3705(1.0F, (float) (arg2 + -1), -1, (float) (arg3 + -1));
        this.field4244.method3692((float) arg0 - var7, (float) arg1 - var7, 0.0F, 0);
        this.method1959(8769);
        this.method1518(-28192, false);
        this.method1908(4, class174.field2133, 0);
        this.method1518(-28192, true);
        this.method1907(class83.field935, true, 0);
        this.method1970(43, class83.field935, 0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "()Lq;")
    public final class364 method337() {
        ++field4158;
        return new class646();
    }

    @OriginalMember(owner = "client!tu", name = "aa", descriptor = "()I")
    public final int method374() {
        ++field4125;
        return this.field4382;
    }

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "()F")
    public final float method1954() {
        ++field4124;
        return this.field4284;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([FI)[F")
    public final float[] method1955(float[] arg0, int arg1) {
        ++field4192;
        arg0[4] = this.field4312[1];
        arg0[arg1] = this.field4312[0];
        arg0[8] = this.field4312[2];
        arg0[12] = this.field4312[3];
        arg0[2] = this.field4312[8];
        arg0[9] = this.field4312[6];
        arg0[13] = this.field4312[7];
        arg0[1] = this.field4312[4];
        arg0[5] = this.field4312[5];
        arg0[3] = this.field4312[12];
        arg0[10] = this.field4312[10];
        arg0[7] = this.field4312[13];
        arg0[6] = this.field4312[9];
        arg0[14] = this.field4312[11];
        arg0[11] = this.field4312[14];
        arg0[15] = this.field4312[15];
        return arg0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4165;
    }

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "(B)V")
    public abstract void method1519(byte arg0);

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "(I)V")
    public final void method380(int arg0) {
        ++field4152;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field4269 = arg0;
            this.field4289.method2797(-120);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(FFFFIFF)Z")
    private final boolean method1956(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, float arg6) {
        ++field4203;
        Buffer var8 = this.field4371.method652(true, 31983);
        if (arg4 < 95) {
            return false;
        } else if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method1932(var8, (byte) -82);
            if (Stream.method3423()) {
                var9.method3415(arg2);
                var9.method3415(arg6);
                var9.method3415(arg1);
                var9.method3415(arg5);
                var9.method3415(arg0);
                var9.method3415(arg3);
            } else {
                var9.method3416(arg2);
                var9.method3416(arg6);
                var9.method3416(arg1);
                var9.method3416(arg5);
                var9.method3416(arg0);
                var9.method3416(arg3);
            }
            var9.method3411();
            return this.field4371.method651(-15045);
        }
    }

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "()I")
    public final int method381() {
        ++field4089;
        return this.field4253 + this.field4250 + this.field4248;
    }

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "(II)V")
    public final void method1957(int arg0, int arg1) {
        ++field4115;
        if (this.field4259 != arg1) {
            this.field4259 = arg1;
            this.method1512(0);
        }
        if (arg0 != -2) {
            this.method1910(0.6798359F, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "([I)V")
    public final void method403(int[] arg0) {
        arg0[0] = this.field4268;
        arg0[1] = this.field4265;
        arg0[2] = this.field4321;
        arg0[3] = this.field4351;
        ++field4220;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lq;)V")
    public final void method382(class364 arg0) {
        ++field4116;
        this.field4254 = (class646) arg0;
        this.field4256.method2004(this.field4254);
        this.field4256.method3695((byte) 64);
        this.field4257.method3685(this.field4256, (byte) 19);
        this.field4255.method3685(this.field4254, (byte) 19);
        if (this.field4344.method2541(75)) {
            this.method1940(true);
        }
    }

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "(I)I")
    public final int method1958(int arg0) {
        if (arg0 != -19719) {
            this.field4331 = null;
        }
        ++field4077;
        return this.field4349;
    }

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "(I)V")
    public abstract void method1516(int arg0);

    @OriginalMember(owner = "client!tu", name = "M", descriptor = "(I)V")
    public abstract void method1527(int arg0);

    @OriginalMember(owner = "client!tu", name = "N", descriptor = "(I)V")
    public final void method1959(int arg0) {
        ++field4100;
        this.field4243 = false;
        if (arg0 != 8769) {
            this.method1963((byte) 32);
        }
        this.method1941(-80);
    }

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "(I)V")
    public abstract void method1522(int arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Llk;I)V")
    public abstract void method1546(class510 arg0, int arg1);

    @OriginalMember(owner = "client!tu", name = "P", descriptor = "(I)V")
    private final void method1960(int arg0) {
        this.field4371 = this.method1548((byte) 102, true);
        ++field4199;
        if (arg0 != 7) {
            this.field4273 = -0.5862307F;
        }
        this.field4371.method1071(12, -1249, 24);
        this.field4376 = this.method1520(new class558[] { new class558(class596.field8705) }, true);
    }

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "(B)V")
    public abstract void method1567(byte arg0);

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "(B)V")
    public abstract void method1554(byte arg0);

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "(II)V")
    public final void method1961(int arg0, int arg1) {
        if (arg1 != 11557) {
            this.method1936(76);
        }
        ++field4074;
        if (~this.field4313 != ~arg0) {
            class379 var3;
            boolean var4;
            boolean var5;
            if (~arg0 == -2) {
                var3 = class331.field4766;
                var4 = true;
                var5 = true;
            } else if (~arg0 != -3) {
                if (~arg0 == -129) {
                    var3 = class238.field3393;
                    var5 = true;
                    var4 = true;
                } else {
                    var4 = false;
                    var3 = class406.field6125;
                    var5 = false;
                }
            } else {
                var3 = class297.field4402;
                var5 = true;
                var4 = false;
            }
            if (!var4 != !this.field4322) {
                this.field4322 = var4;
                this.method1533(true);
            }
            if (!var5 == this.field4319) {
                this.field4319 = var5;
                this.method1540(false);
            }
            if (this.field4354 != var3) {
                this.field4354 = var3;
                this.method1556((byte) 79);
            }
            this.field4320 &= -29;
            this.field4313 = arg0;
        }
    }

    @OriginalMember(owner = "client!tu", name = "E", descriptor = "()F")
    public final float method1962() {
        ++field4176;
        return this.field4332;
    }

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "(IIIII)V")
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4240;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lkp;Lvt;III)Lica;")
    public abstract class579 method1555(class421 arg0, class256 arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "(B)V")
    public final void method1963(byte arg0) {
        if (arg0 < 117) {
            this.method1528((class421) null, (byte) 15, (class256) null);
        }
        ++field4228;
        if (~this.field4320 != -3) {
            this.method1927(28295);
            this.method1978(false, 20096);
            this.method1931(false, -45);
            this.method1969(false, false);
            this.method1905((byte) -123, false);
            this.method1899(false, -2, false, 0);
            this.field4320 = 2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "()Z")
    public final boolean method356() {
        ++field4143;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "()Z")
    public final boolean method322() {
        ++field4230;
        return this.field4286[3].method814((byte) -97);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILkp;IIB[B)Lkc;")
    public abstract class115 method1557(int arg0, class421 arg1, int arg2, int arg3, byte arg4, byte[] arg5);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z[FIILkp;IIZ)Lica;")
    public abstract class579 method1550(boolean arg0, float[] arg1, int arg2, int arg3, class421 arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "(B)V")
    public abstract void method1556(byte arg0);

    @OriginalMember(owner = "client!tu", name = "Q", descriptor = "(I)V")
    public final void method1964(int arg0) {
        ++field4096;
        this.field4356 = new class581[this.field4302];
        this.field4295 = new class646[this.field4302];
        this.field4335 = new class502[this.field4302];
        this.field4281 = new class87[this.field4302];
        this.field4278 = new class581[this.field4302];
        for (int var2 = 0; var2 < this.field4302; ++var2) {
            this.field4278[var2] = class457.field6837;
            this.field4356[var2] = class457.field6837;
            this.field4281[var2] = class14.field118;
            this.field4295[var2] = new class646();
        }
        this.field4331 = new class321[this.field4352 + -2];
        this.field4288 = this.method1555(class538.field7742, class256.field3653, 1, 1, -8);
        this.method314(new class374(262144));
        this.field4363 = this.method1520(new class558[] { new class558(new class596[] { class596.field8705, class596.field8709 }) }, true);
        this.field4366 = this.method1520(new class558[] { new class558(new class596[] { class596.field8705, class596.field8707 }) }, true);
        this.field4375 = this.method1520(new class558[] { new class558(class596.field8705), new class558(class596.field8707), new class558(class596.field8709), new class558(class596.field8706) }, true);
        this.field4361 = this.method1520(new class558[] { new class558(class596.field8705), new class558(class596.field8707), new class558(class596.field8709) }, true);
        this.field4369 = new class222(this, 0, 0, false, false);
        this.field4374 = new class222(this, 0, 0, true, true);
        this.field4380 = new class222(this, 0, 0, false, false);
        this.field4367 = new class222(this, 0, 0, true, true);
        this.field4368 = new class222(this, 0, 0, false, false);
        this.field4379 = new class222(this, 0, 0, true, true);
        this.field4362 = new class222(this, 0, 0, false, false);
        this.field4364 = new class222(this, 0, 0, true, true);
        this.field4377 = new class222(this, 0, 0, false, false);
        this.field4373 = new class222(this, 0, 0, true, true);
        this.field4305 = new class286(this);
        this.field4372 = this.method1535((byte) -84, true);
        this.method1933(23992);
        this.field4238 = new class616(this);
        this.field4286[1] = this.method1559(1, -115);
        this.field4286[2] = this.method1559(2, -59);
        this.field4286[4] = this.method1559(4, arg0 + -106);
        this.field4286[5] = this.method1559(5, -124);
        this.field4286[6] = this.method1559(6, -48);
        this.field4286[7] = this.method1559(7, -56);
        this.field4286[3] = this.method1559(3, class92.method583(arg0, -39));
        this.field4286[8] = this.method1559(8, class92.method583(arg0, -107));
        this.field4286[9] = this.method1559(9, -50);
        if (!this.field4286[2].method814((byte) -97)) {
            this.field4286[2] = this.method1559(0, -106);
        }
        if (!this.field4286[arg0].method814((byte) -97)) {
            this.field4286[4] = this.field4286[2];
        }
        if (!this.field4286[8].method814((byte) -97)) {
            this.field4286[8] = this.field4286[4];
        }
        if (!this.field4286[9].method814((byte) -97)) {
            this.field4286[9] = this.field4286[8];
        }
        this.method1543(false);
        this.method404();
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method1565(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIII)V")
    public final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4221;
    }

    @OriginalMember(owner = "client!tu", name = "R", descriptor = "(I)V")
    public abstract void method1526(int arg0);

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "(B)V")
    public abstract void method1566(byte arg0);

    @OriginalMember(owner = "client!tu", name = "LA", descriptor = "(IIII)V")
    public final void method319(int arg0, int arg1, int arg2, int arg3) {
        ++field4169;
        if (!this.field4293) {
            throw new RuntimeException("");
        } else {
            if (this.field4349 != arg0) {
                this.field4349 = arg0;
                if (this.field4266 != null) {
                    this.field4266.method806(true);
                }
            }
            this.field4329 = arg1;
            this.field4353 = arg3;
            this.field4327 = arg2;
            this.method1909(false);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[Loj;)V")
    public final void method340(int arg0, class321[] arg1) {
        ++field4137;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field4331[var3] = arg1[var3];
        }
        this.field4300 = arg0;
        if (this.field4344.method2541(82)) {
            this.method1529(41);
        }
    }

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "()Z")
    public final boolean method331() {
        ++field4107;
        return false;
    }

    @OriginalMember(owner = "client!tu", name = "na", descriptor = "(III[I)V")
    public final void method364(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4149;
        float var5 = this.field4254.method3689((float) arg2, (float) arg0, (byte) -20, (float) arg1);
        if (!(var5 < (float) this.field4345) && !(var5 > (float) this.field4285)) {
            int var6 = (int) ((float) this.field4282 * this.field4254.method3683(-6334, (float) arg0, (float) arg1, (float) arg2) / var5);
            int var7 = (int) ((float) this.field4298 * this.field4254.method3702((float) arg1, 49, (float) arg2, (float) arg0) / var5);
            if ((float) var6 >= this.field4355 && (float) var6 <= this.field4279 && (float) var7 >= this.field4314 && this.field4358 >= (float) var7) {
                arg3[0] = (int) ((float) var6 - this.field4355);
                arg3[1] = (int) ((float) var7 + -this.field4314);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "()Z")
    public final boolean method370() {
        ++field4217;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "ha", descriptor = "(F)V")
    public final void method315(float arg0) {
        ++field4234;
        if (this.field4326 != arg0) {
            this.field4326 = arg0;
            this.field4242.setAmbient(arg0);
            this.method1541(true);
            this.method1509(0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([Lba;Lbe;Lq;[Lsda;I)V")
    public final void method328(class327[] arg0, class33 arg1, class364 arg2, class219[] arg3, int arg4) {
        this.method385(arg0, arg2, arg3, arg4);
        ++field4140;
        this.method396(arg1);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class199 method301(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4146;
        return class97.method605(this, arg0, arg1, (byte) -1, arg2, arg3);
    }

    @OriginalMember(owner = "client!tu", name = "S", descriptor = "(I)[F")
    public final float[] method1965(int arg0) {
        ++field4186;
        if (arg0 != 0) {
            this.method1925((byte) 65);
        }
        return this.field4287;
    }

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "(Z)V")
    private final void method1966(boolean arg0) {
        ++field4180;
        this.method1541(arg0);
        this.method1516(0);
        this.method1527(-63);
        this.method1529(-69);
        this.method1563(96);
        this.method1509(0);
        this.method1522(3);
        this.method1519((byte) 116);
        this.method1517(81);
        this.method1566((byte) 95);
        this.method1544((byte) -118);
        this.method1540(!arg0);
        this.method1556((byte) -87);
        this.method1533(arg0);
        for (int var2 = this.field4302 + -1; var2 >= 0; --var2) {
            this.method1957(-2, var2);
            this.method1530(true);
            this.method1515((byte) 55);
            this.method1950(7869);
        }
        this.method1547((byte) -61);
        this.method1560((byte) 123);
        this.method1531(-124);
        this.method1554((byte) -37);
        this.method1545(1864);
    }

    @OriginalMember(owner = "client!tu", name = "T", descriptor = "(I)V")
    private final void method1967(int arg0) {
        this.field4355 = (float) (this.field4268 - this.field4350);
        if (arg0 >= -67) {
            this.method1535((byte) -8, true);
        }
        this.field4314 = (float) (-this.field4341 + this.field4265);
        this.field4358 = (float) (-this.field4341 + this.field4351);
        this.field4279 = (float) (-this.field4350 + this.field4321);
        ++field4113;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIZZB)V")
    private final void method1968(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, byte arg5) {
        ++field4080;
        boolean var7 = arg4 & this.method322();
        if (arg5 < -5) {
            if (!var7 && (arg0 == 4 || ~arg0 == -9 || arg0 == 9)) {
                arg0 = 2;
                arg2 = ~arg0 != -5 ? 1 : 1 & arg1;
                arg1 = 0;
            }
            if (~arg0 != -1 && arg3) {
                arg0 |= Integer.MIN_VALUE;
            }
            if (~this.field4318 != ~arg0) {
                if (this.field4318 != 0) {
                    this.field4286[Integer.MAX_VALUE & this.field4318].method805((byte) -58);
                }
                if (~arg0 != -1) {
                    this.field4266 = this.field4286[arg0 & Integer.MAX_VALUE];
                    this.field4266.method811(arg3, (byte) 91);
                    this.field4266.method808(993, arg3);
                    this.field4266.method815(12868, arg1, arg2);
                } else {
                    this.field4266 = null;
                }
                this.field4262 = arg2;
                this.field4280 = arg1;
                this.field4318 = arg0;
            } else if (this.field4318 != 0) {
                this.field4286[Integer.MAX_VALUE & this.field4318].method808(993, arg3);
                if (this.field4280 != arg1 || this.field4262 != arg2) {
                    this.field4286[this.field4318 & Integer.MAX_VALUE].method815(12868, arg1, arg2);
                    this.field4280 = arg1;
                    this.field4262 = arg2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lkm;ZIB)V")
    public abstract void method1551(class299 arg0, boolean arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(ZZ)V")
    public final void method1969(boolean arg0, boolean arg1) {
        if (this.field4264 != arg0) {
            this.field4264 = arg0;
            this.method1519((byte) 92);
            this.field4320 &= -32;
        }
        ++field4136;
        if (arg1) {
            this.method389(-79, -6, 56, 91, true);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILkm;I)V")
    public final void method1970(int arg0, class299 arg1, int arg2) {
        this.method1521(false, arg2, false, arg1, false);
        int var4 = 24 / ((arg0 - -62) / 33);
        ++field4229;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLiu;)V")
    public final void method1971(byte arg0, class502 arg1) {
        ++field4070;
        if (arg0 < -53) {
            if (this.field4335[this.field4259] != arg1) {
                this.field4335[this.field4259] = arg1;
                if (arg1 == null) {
                    this.method1567((byte) -43);
                } else {
                    arg1.method152(24784);
                }
                this.field4320 &= -2;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "U", descriptor = "(I)I")
    public final int method1972(int arg0) {
        ++field4109;
        if (arg0 != -18556) {
            this.field4238 = null;
        }
        return this.field4259;
    }

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "(B)V")
    public abstract void method1538(byte arg0);

    @OriginalMember(owner = "client!tu", name = "JA", descriptor = "(I)V")
    public final void method406(int arg0) {
        this.field4303 = 0;
        ++field4068;
        while (~arg0 < -2) {
            ++this.field4303;
            arg0 >>= 1;
        }
        this.field4323 = 1 << this.field4303;
    }

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "(B)V")
    private final void method1973(byte arg0) {
        this.field4306 = false;
        ++field4184;
        if (arg0 == 120) {
            if (class443.field6629 == this.field4344) {
                this.method1916(30851);
                this.method1903(-8691);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIIIF)Loj;")
    public final class321 method346(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4214;
        return new class268(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tu", name = "V", descriptor = "(I)V")
    public abstract void method1531(int arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Laf;Z)Lxa;")
    public final class433 method388(class372 arg0, boolean arg1) {
        ++field4123;
        class433 var10;
        if (~arg0.field5688 != -1 && ~arg0.field5692 != -1) {
            int[] var3 = new int[arg0.field5692 * arg0.field5688];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field5684 == null) {
                for (int var6 = 0; ~arg0.field5692 < ~var6; ++var6) {
                    for (int var7 = 0; ~arg0.field5688 < ~var7; ++var7) {
                        int var8 = arg0.field5691[255 & arg0.field5685[var4++]];
                        var3[var5++] = ~var8 == -1 ? 0 : class283.method1834(-16777216, var8);
                    }
                }
            } else {
                for (int var9 = 0; arg0.field5692 > var9; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field5688; ++var11) {
                        var3[var5++] = class283.method1834(arg0.field5684[var4] << 24, arg0.field5691[class643.method3659(255, arg0.field5685[var4])]);
                        ++var4;
                    }
                }
            }
            var10 = this.method343(var3, 0, arg0.field5688, arg0.field5688, arg0.field5692);
        } else {
            var10 = this.method343(new int[1], 0, 1, 1, 1);
        }
        var10.method1580(arg0.field5686, arg0.field5687, arg0.field5690, arg0.field5689);
        return var10;
    }

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "()Z")
    public final boolean method398() {
        ++field4072;
        return this.field4296;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BZI)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1974(byte arg0, boolean arg1, int arg2) {
        if (arg0 != 56) {
            this.method1554((byte) -32);
        }
        ++field4196;
        return this.field4224.method3408(arg2, arg1);
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(BZ)Lcca;")
    public abstract class209 method1548(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!tu", name = "W", descriptor = "(I)V")
    public final void method1975(int arg0) {
        ++field4161;
        if (arg0 != -3) {
            this.field4331 = null;
        }
        if (class229.field3207 != this.field4344) {
            class398 var2 = this.field4344;
            this.field4344 = class229.field3207;
            if (var2.method2541(115)) {
                this.method1940(true);
            }
            this.field4320 &= -32;
            this.field4312 = this.field4287;
        }
    }

    @OriginalMember(owner = "client!tu", name = "ca", descriptor = "(IIII)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3) {
        ++field4073;
        if (~arg0 >= -1 && ~arg2 <= ~(this.field4170 - 1) && ~arg1 >= -1 && ~arg3 <= ~(this.field4135 - 1)) {
            this.method404();
        } else {
            this.field4321 = ~arg2 < ~this.field4170 ? 0 : arg2;
            this.field4351 = ~arg3 < ~this.field4170 ? 0 : arg3;
            this.field4265 = ~arg1 <= -1 ? arg1 : 0;
            this.field4268 = arg0 >= 0 ? arg0 : 0;
            if (!this.field4381) {
                this.field4381 = true;
                this.method1538((byte) -98);
            }
            this.method1526(-122);
            this.method1967(-95);
        }
    }

    @OriginalMember(owner = "client!tu", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4114;
        float var7 = this.field4254.method3689((float) arg2, (float) arg0, (byte) -20, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field4254.method3689((float) arg5, (float) arg3, (byte) -20, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4345) || !(var8 < (float) this.field4345)) && (!(var7 > (float) this.field4285) || !((float) this.field4285 < var8))) {
            int var9 = (int) ((float) this.field4282 * this.field4254.method3683(-6334, (float) arg0, (float) arg1, (float) arg2) / var7);
            int var10 = (int) ((float) this.field4282 * this.field4254.method3683(-6334, (float) arg3, (float) arg4, (float) arg5) / var8);
            if (this.field4355 > (float) var9 && (float) var10 < this.field4355 || (float) var9 > this.field4279 && (float) var10 > this.field4279) {
                return false;
            } else {
                int var11 = (int) ((float) this.field4298 * this.field4254.method3702((float) arg1, 11, (float) arg2, (float) arg0) / var7);
                int var12 = (int) ((float) this.field4298 * this.field4254.method3702((float) arg4, 114, (float) arg5, (float) arg3) / var8);
                return (!((float) var11 < this.field4314) || !(this.field4314 > (float) var12)) && (!((float) var11 > this.field4358) || !((float) var12 > this.field4358));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tu", name = "X", descriptor = "(I)V")
    private final void method1976(int arg0) {
        ++field4098;
        if (arg0 == 15491) {
            if (class481.field7061 != this.field4344) {
                class398 var2 = this.field4344;
                this.field4344 = class481.field7061;
                if (!var2.method2541(arg0 ^ 15577)) {
                    this.method1940(true);
                }
                this.method1915((byte) 111);
                this.field4312 = this.field4336;
                this.method1903(-8691);
                this.field4320 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "(II)Lic;")
    public class607 method1559(int arg0, int arg1) {
        ++field4122;
        if (arg1 >= -30) {
            return null;
        } else if (arg0 != 6) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    return ~arg0 == -8 ? new class570(this) : new class133(this);
                } else {
                    return new class313(this, this.field4238);
                }
            } else {
                return new class228(this);
            }
        } else {
            return new class441(this);
        }
    }

    @OriginalMember(owner = "client!tu", name = "Y", descriptor = "(I)V")
    public abstract void method1512(int arg0);

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "(Z)Lnh;")
    public final class646 method1977(boolean arg0) {
        ++field4227;
        return arg0 ? null : this.field4256;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(ZI)V")
    public final void method1978(boolean arg0, int arg1) {
        if (arg0 == !this.field4348) {
            this.field4348 = arg0;
            this.method1566((byte) 95);
            this.field4320 &= -32;
        }
        if (arg1 != 20096) {
            this.method406(-25);
        }
        ++field4095;
    }

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "(B)V")
    public abstract void method1544(byte arg0);

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method298(Canvas arg0) {
        ++field4190;
        if (this.field4177 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4191.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1565(arg0, 0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field4191.put(arg0, var4);
                }
            }
        }
    }
}
