import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class303 extends class162 {

    @OriginalMember(owner = "client!vj", name = "Mc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4410 = new Hashtable();

    @OriginalMember(owner = "client!vj", name = "de", descriptor = "I")
    public int field4479 = 128;

    @OriginalMember(owner = "client!vj", name = "be", descriptor = "Ljn;")
    private class503 field4477 = new class503();

    @OriginalMember(owner = "client!vj", name = "me", descriptor = "Lmn;")
    private class246 field4488 = new class246();

    @OriginalMember(owner = "client!vj", name = "ne", descriptor = "Lmn;")
    public class246 field4489 = new class246();

    @OriginalMember(owner = "client!vj", name = "pe", descriptor = "Z")
    private boolean field4491 = false;

    @OriginalMember(owner = "client!vj", name = "qe", descriptor = "I")
    public int field4492 = 3;

    @OriginalMember(owner = "client!vj", name = "te", descriptor = "I")
    public int field4495 = 8;

    @OriginalMember(owner = "client!vj", name = "se", descriptor = "Lug;")
    private class392 field4494 = new class392();

    @OriginalMember(owner = "client!vj", name = "we", descriptor = "I")
    private int field4498 = -1;

    @OriginalMember(owner = "client!vj", name = "xe", descriptor = "[Lwq;")
    private class113[] field4499 = new class113[4];

    @OriginalMember(owner = "client!vj", name = "ye", descriptor = "I")
    private int field4500 = -1;

    @OriginalMember(owner = "client!vj", name = "Be", descriptor = "[Lwq;")
    private class113[] field4503 = new class113[4];

    @OriginalMember(owner = "client!vj", name = "Ae", descriptor = "I")
    private int field4502 = -1;

    @OriginalMember(owner = "client!vj", name = "Ce", descriptor = "[Lwq;")
    private class113[] field4504 = new class113[4];

    @OriginalMember(owner = "client!vj", name = "Ee", descriptor = "Lug;")
    private class392 field4506;

    @OriginalMember(owner = "client!vj", name = "He", descriptor = "Lug;")
    private class392 field4509;

    @OriginalMember(owner = "client!vj", name = "Ie", descriptor = "Lug;")
    private class392 field4510;

    @OriginalMember(owner = "client!vj", name = "Je", descriptor = "Lug;")
    private class392 field4511;

    @OriginalMember(owner = "client!vj", name = "Ke", descriptor = "Lug;")
    private class392 field4512;

    @OriginalMember(owner = "client!vj", name = "Le", descriptor = "Lug;")
    private class392 field4513;

    @OriginalMember(owner = "client!vj", name = "Me", descriptor = "Lug;")
    private class392 field4514;

    @OriginalMember(owner = "client!vj", name = "Re", descriptor = "Z")
    private boolean field4519;

    @OriginalMember(owner = "client!vj", name = "uf", descriptor = "F")
    public float field4547;

    @OriginalMember(owner = "client!vj", name = "Lf", descriptor = "F")
    public float field4564;

    @OriginalMember(owner = "client!vj", name = "Xe", descriptor = "I")
    private int field4525;

    @OriginalMember(owner = "client!vj", name = "jf", descriptor = "F")
    public float field4536;

    @OriginalMember(owner = "client!vj", name = "Ze", descriptor = "[F")
    public float[] field4527;

    @OriginalMember(owner = "client!vj", name = "cg", descriptor = "F")
    private float field4581;

    @OriginalMember(owner = "client!vj", name = "qf", descriptor = "I")
    private int field4543;

    @OriginalMember(owner = "client!vj", name = "xf", descriptor = "I")
    private int field4550;

    @OriginalMember(owner = "client!vj", name = "Ff", descriptor = "[F")
    private float[] field4558;

    @OriginalMember(owner = "client!vj", name = "vg", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!vj", name = "Jf", descriptor = "[Lfk;")
    private class462[] field4562;

    @OriginalMember(owner = "client!vj", name = "df", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!vj", name = "Pe", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!vj", name = "Zf", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!vj", name = "pg", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!vj", name = "dg", descriptor = "[F")
    private float[] field4582;

    @OriginalMember(owner = "client!vj", name = "sg", descriptor = "[F")
    private float[] field4597;

    @OriginalMember(owner = "client!vj", name = "Ng", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!vj", name = "jg", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!vj", name = "Lg", descriptor = "I")
    private int field4616;

    @OriginalMember(owner = "client!vj", name = "bg", descriptor = "F")
    public float field4580;

    @OriginalMember(owner = "client!vj", name = "Kg", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!vj", name = "Uf", descriptor = "F")
    public float field4573;

    @OriginalMember(owner = "client!vj", name = "Ag", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!vj", name = "Rg", descriptor = "F")
    private float field4622;

    @OriginalMember(owner = "client!vj", name = "qg", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!vj", name = "Og", descriptor = "[F")
    private float[] field4619;

    @OriginalMember(owner = "client!vj", name = "Cg", descriptor = "I")
    private int field4607;

    @OriginalMember(owner = "client!vj", name = "Qg", descriptor = "F")
    private float field4621;

    @OriginalMember(owner = "client!vj", name = "hg", descriptor = "I")
    private int field4586;

    @OriginalMember(owner = "client!vj", name = "Gg", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!vj", name = "kf", descriptor = "I")
    private int field4537;

    @OriginalMember(owner = "client!vj", name = "Fg", descriptor = "I")
    private int field4610;

    @OriginalMember(owner = "client!vj", name = "Wf", descriptor = "F")
    public float field4575;

    @OriginalMember(owner = "client!vj", name = "lg", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!vj", name = "Yg", descriptor = "I")
    private int field4629;

    @OriginalMember(owner = "client!vj", name = "ch", descriptor = "F")
    public float field4633;

    @OriginalMember(owner = "client!vj", name = "ah", descriptor = "F")
    public float field4631;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4302;

    @OriginalMember(owner = "client!vj", name = "Id", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4458;

    @OriginalMember(owner = "client!vj", name = "ge", descriptor = "I")
    public int field4482;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4314;

    @OriginalMember(owner = "client!vj", name = "hc", descriptor = "J")
    private long field4379;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "J")
    private long field4294;

    @OriginalMember(owner = "client!vj", name = "ug", descriptor = "Z")
    public boolean field4599;

    @OriginalMember(owner = "client!vj", name = "mf", descriptor = "I")
    public int field4539;

    @OriginalMember(owner = "client!vj", name = "cf", descriptor = "Ljava/lang/String;")
    private String field4530;

    @OriginalMember(owner = "client!vj", name = "Af", descriptor = "Z")
    public boolean field4553;

    @OriginalMember(owner = "client!vj", name = "Bf", descriptor = "Z")
    private boolean field4554;

    @OriginalMember(owner = "client!vj", name = "Sf", descriptor = "Z")
    public boolean field4571;

    @OriginalMember(owner = "client!vj", name = "lf", descriptor = "Z")
    public boolean field4538;

    @OriginalMember(owner = "client!vj", name = "Df", descriptor = "Z")
    private boolean field4556;

    @OriginalMember(owner = "client!vj", name = "Pf", descriptor = "Ljava/lang/String;")
    private String field4568;

    @OriginalMember(owner = "client!vj", name = "ef", descriptor = "Z")
    public boolean field4532;

    @OriginalMember(owner = "client!vj", name = "Nf", descriptor = "Z")
    private boolean field4566;

    @OriginalMember(owner = "client!vj", name = "Wd", descriptor = "Lrv;")
    public class71 field4472;

    @OriginalMember(owner = "client!vj", name = "re", descriptor = "Lcv;")
    public class398 field4493;

    @OriginalMember(owner = "client!vj", name = "he", descriptor = "Lrf;")
    private class57 field4483;

    @OriginalMember(owner = "client!vj", name = "ae", descriptor = "Lra;")
    private class70 field4476;

    @OriginalMember(owner = "client!vj", name = "Ud", descriptor = "Lad;")
    private class290 field4470;

    @OriginalMember(owner = "client!vj", name = "Bd", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4451;

    @OriginalMember(owner = "client!vj", name = "Qe", descriptor = "F")
    public float field4518;

    @OriginalMember(owner = "client!vj", name = "sf", descriptor = "F")
    public float field4545;

    @OriginalMember(owner = "client!vj", name = "vf", descriptor = "F")
    private float field4548;

    @OriginalMember(owner = "client!vj", name = "Kf", descriptor = "F")
    public float field4563;

    @OriginalMember(owner = "client!vj", name = "Qf", descriptor = "F")
    public float field4569;

    @OriginalMember(owner = "client!vj", name = "Rf", descriptor = "F")
    private float field4570;

    @OriginalMember(owner = "client!vj", name = "Eg", descriptor = "F")
    public float field4609;

    @OriginalMember(owner = "client!vj", name = "Jg", descriptor = "F")
    public float field4614;

    @OriginalMember(owner = "client!vj", name = "Vg", descriptor = "F")
    private float field4626;

    @OriginalMember(owner = "client!vj", name = "Xg", descriptor = "F")
    public float field4628;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!vj", name = "eb", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!vj", name = "fb", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!vj", name = "gb", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!vj", name = "hb", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!vj", name = "ib", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!vj", name = "jb", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!vj", name = "kb", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!vj", name = "lb", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!vj", name = "mb", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!vj", name = "nb", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!vj", name = "ob", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!vj", name = "pb", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!vj", name = "qb", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!vj", name = "rb", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!vj", name = "sb", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!vj", name = "tb", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!vj", name = "ub", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!vj", name = "vb", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!vj", name = "wb", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!vj", name = "xb", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!vj", name = "yb", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!vj", name = "zb", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!vj", name = "Ab", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!vj", name = "Bb", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!vj", name = "Cb", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vj", name = "Db", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vj", name = "Eb", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!vj", name = "Fb", descriptor = "I")
    private int field4351;

    @OriginalMember(owner = "client!vj", name = "Gb", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!vj", name = "Hb", descriptor = "I")
    private int field4353;

    @OriginalMember(owner = "client!vj", name = "Ib", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!vj", name = "Jb", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!vj", name = "Kb", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!vj", name = "Lb", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!vj", name = "Mb", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!vj", name = "Nb", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!vj", name = "Ob", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!vj", name = "Pb", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!vj", name = "Qb", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!vj", name = "Rb", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!vj", name = "Sb", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!vj", name = "Tb", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!vj", name = "Ub", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!vj", name = "Vb", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!vj", name = "Wb", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!vj", name = "Xb", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!vj", name = "Yb", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!vj", name = "Zb", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!vj", name = "ac", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!vj", name = "bc", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!vj", name = "cc", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!vj", name = "dc", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!vj", name = "ec", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!vj", name = "fc", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!vj", name = "gc", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!vj", name = "ic", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!vj", name = "jc", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!vj", name = "kc", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!vj", name = "lc", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!vj", name = "mc", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!vj", name = "nc", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!vj", name = "oc", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!vj", name = "pc", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!vj", name = "qc", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!vj", name = "rc", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!vj", name = "sc", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!vj", name = "tc", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!vj", name = "uc", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!vj", name = "vc", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!vj", name = "wc", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!vj", name = "xc", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!vj", name = "yc", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!vj", name = "zc", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!vj", name = "Ac", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!vj", name = "Bc", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!vj", name = "Cc", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!vj", name = "Dc", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!vj", name = "Ec", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!vj", name = "Fc", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!vj", name = "Gc", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!vj", name = "Hc", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!vj", name = "Ic", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!vj", name = "Jc", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!vj", name = "Kc", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!vj", name = "Lc", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!vj", name = "Nc", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!vj", name = "Oc", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!vj", name = "Pc", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!vj", name = "Qc", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!vj", name = "Rc", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!vj", name = "Sc", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!vj", name = "Tc", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!vj", name = "Uc", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!vj", name = "Vc", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!vj", name = "Wc", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!vj", name = "Xc", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!vj", name = "Yc", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!vj", name = "Zc", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!vj", name = "ad", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!vj", name = "bd", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!vj", name = "cd", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!vj", name = "dd", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!vj", name = "ed", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!vj", name = "fd", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!vj", name = "gd", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!vj", name = "hd", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!vj", name = "id", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!vj", name = "jd", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!vj", name = "kd", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!vj", name = "ld", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!vj", name = "md", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!vj", name = "nd", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!vj", name = "od", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!vj", name = "pd", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!vj", name = "qd", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!vj", name = "rd", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!vj", name = "sd", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!vj", name = "td", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!vj", name = "ud", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!vj", name = "vd", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!vj", name = "wd", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!vj", name = "xd", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!vj", name = "yd", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!vj", name = "zd", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!vj", name = "Ad", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!vj", name = "Cd", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!vj", name = "Dd", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!vj", name = "Ed", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!vj", name = "Fd", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!vj", name = "Gd", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!vj", name = "Hd", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!vj", name = "Jd", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!vj", name = "Kd", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!vj", name = "Ld", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!vj", name = "Md", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!vj", name = "Nd", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!vj", name = "Od", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!vj", name = "Pd", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!vj", name = "Qd", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!vj", name = "Rd", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!vj", name = "Sd", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!vj", name = "Td", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!vj", name = "Vd", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!vj", name = "Xd", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!vj", name = "Yd", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!vj", name = "Zd", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!vj", name = "ce", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!vj", name = "ee", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!vj", name = "fe", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!vj", name = "ie", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!vj", name = "je", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!vj", name = "ke", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!vj", name = "le", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!vj", name = "oe", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!vj", name = "De", descriptor = "I")
    private int field4505;

    @OriginalMember(owner = "client!vj", name = "Fe", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!vj", name = "Ge", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!vj", name = "Ue", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!vj", name = "bf", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!vj", name = "gf", descriptor = "I")
    private int field4534;

    @OriginalMember(owner = "client!vj", name = "hf", descriptor = "I")
    private int field4535;

    @OriginalMember(owner = "client!vj", name = "yf", descriptor = "I")
    private int field4551;

    @OriginalMember(owner = "client!vj", name = "Gf", descriptor = "I")
    private int field4559;

    @OriginalMember(owner = "client!vj", name = "Mf", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!vj", name = "Of", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!vj", name = "Yf", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!vj", name = "gg", descriptor = "I")
    private int field4585;

    @OriginalMember(owner = "client!vj", name = "kg", descriptor = "I")
    private int field4589;

    @OriginalMember(owner = "client!vj", name = "mg", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!vj", name = "ng", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!vj", name = "tg", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!vj", name = "Tg", descriptor = "I")
    private int field4624;

    @OriginalMember(owner = "client!vj", name = "dh", descriptor = "I")
    private int field4634;

    @OriginalMember(owner = "client!vj", name = "eh", descriptor = "I")
    private int field4635;

    @OriginalMember(owner = "client!vj", name = "Zg", descriptor = "J")
    private long field4630;

    @OriginalMember(owner = "client!vj", name = "ve", descriptor = "Lwq;")
    private class113 field4497;

    @OriginalMember(owner = "client!vj", name = "ze", descriptor = "Lwq;")
    private class113 field4501;

    @OriginalMember(owner = "client!vj", name = "pf", descriptor = "Lkd;")
    public class184 field4542;

    @OriginalMember(owner = "client!vj", name = "Sg", descriptor = "Lkd;")
    public class184 field4623;

    @OriginalMember(owner = "client!vj", name = "zf", descriptor = "Lvh;")
    public class240 field4552;

    @OriginalMember(owner = "client!vj", name = "Ug", descriptor = "Lvh;")
    public class240 field4625;

    @OriginalMember(owner = "client!vj", name = "of", descriptor = "Lmn;")
    public class246 field4541;

    @OriginalMember(owner = "client!vj", name = "zg", descriptor = "Lmn;")
    public class246 field4604;

    @OriginalMember(owner = "client!vj", name = "Oe", descriptor = "Lmf;")
    public class286 field4516;

    @OriginalMember(owner = "client!vj", name = "Ye", descriptor = "Lmf;")
    public class286 field4526;

    @OriginalMember(owner = "client!vj", name = "Mg", descriptor = "Lmf;")
    public class286 field4617;

    @OriginalMember(owner = "client!vj", name = "Se", descriptor = "Lvq;")
    public class319 field4520;

    @OriginalMember(owner = "client!vj", name = "rf", descriptor = "Lvq;")
    public class319 field4544;

    @OriginalMember(owner = "client!vj", name = "wf", descriptor = "Lvq;")
    public class319 field4549;

    @OriginalMember(owner = "client!vj", name = "Vf", descriptor = "Lvq;")
    public class319 field4574;

    @OriginalMember(owner = "client!vj", name = "ag", descriptor = "Lvq;")
    public class319 field4579;

    @OriginalMember(owner = "client!vj", name = "ig", descriptor = "Lvq;")
    public class319 field4587;

    @OriginalMember(owner = "client!vj", name = "og", descriptor = "Lvq;")
    public class319 field4593;

    @OriginalMember(owner = "client!vj", name = "rg", descriptor = "Lvq;")
    public class319 field4596;

    @OriginalMember(owner = "client!vj", name = "yg", descriptor = "Lvq;")
    public class319 field4603;

    @OriginalMember(owner = "client!vj", name = "Pg", descriptor = "Lvq;")
    public class319 field4620;

    @OriginalMember(owner = "client!vj", name = "Ef", descriptor = "Lmk;")
    private class39 field4557;

    @OriginalMember(owner = "client!vj", name = "wg", descriptor = "Lnh;")
    private class525 field4601;

    @OriginalMember(owner = "client!vj", name = "Ig", descriptor = "Lnh;")
    private class525 field4613;

    @OriginalMember(owner = "client!vj", name = "Bg", descriptor = "Lu;")
    private class52 field4606;

    @OriginalMember(owner = "client!vj", name = "Xf", descriptor = "Lhc;")
    private class93 field4576;

    @OriginalMember(owner = "client!vj", name = "ue", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4496;

    @OriginalMember(owner = "client!vj", name = "Ne", descriptor = "Z")
    public boolean field4515;

    @OriginalMember(owner = "client!vj", name = "Te", descriptor = "Z")
    public boolean field4521;

    @OriginalMember(owner = "client!vj", name = "Ve", descriptor = "Z")
    public boolean field4523;

    @OriginalMember(owner = "client!vj", name = "We", descriptor = "Z")
    private boolean field4524;

    @OriginalMember(owner = "client!vj", name = "af", descriptor = "Z")
    private boolean field4528;

    @OriginalMember(owner = "client!vj", name = "ff", descriptor = "Z")
    public boolean field4533;

    @OriginalMember(owner = "client!vj", name = "nf", descriptor = "Z")
    private boolean field4540;

    @OriginalMember(owner = "client!vj", name = "tf", descriptor = "Z")
    public boolean field4546;

    @OriginalMember(owner = "client!vj", name = "Cf", descriptor = "Z")
    private boolean field4555;

    @OriginalMember(owner = "client!vj", name = "Hf", descriptor = "Z")
    private boolean field4560;

    @OriginalMember(owner = "client!vj", name = "If", descriptor = "Z")
    public boolean field4561;

    @OriginalMember(owner = "client!vj", name = "Tf", descriptor = "Z")
    private boolean field4572;

    @OriginalMember(owner = "client!vj", name = "eg", descriptor = "Z")
    public boolean field4583;

    @OriginalMember(owner = "client!vj", name = "fg", descriptor = "Z")
    private boolean field4584;

    @OriginalMember(owner = "client!vj", name = "xg", descriptor = "Z")
    private boolean field4602;

    @OriginalMember(owner = "client!vj", name = "Hg", descriptor = "Z")
    public boolean field4612;

    @OriginalMember(owner = "client!vj", name = "Wg", descriptor = "Z")
    private boolean field4627;

    @OriginalMember(owner = "client!vj", name = "bh", descriptor = "Z")
    private boolean field4632;

    @OriginalMember(owner = "client!vj", name = "Dg", descriptor = "[Lih;")
    private class492[] field4608;

    static {
        new class342("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field4451 = new Color[] { new Color(16777215), new Color(16777215) };
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 3)
    public final void method250(Canvas arg0) {
        ++field4368;
        if (this.field4302 == arg0) {
            throw new RuntimeException();
        } else if (this.field4410.containsKey(arg0)) {
            Long var2 = (Long) this.field4410.get(arg0);
            this.field4314.releaseSurface(arg0, var2);
            this.field4410.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V", line = 21)
    private final void method1906(int arg0) {
        if (this.field4458 == null) {
            this.field4353 = this.field4351 = 0;
        } else {
            Dimension var2 = this.field4458.getSize();
            this.field4351 = var2.height;
            this.field4353 = var2.width;
        }
        ++field4467;
        if (arg0 == 1) {
            if (this.field4501 == null) {
                this.field4387 = this.field4351;
                this.field4372 = this.field4353;
                this.method1912((byte) -123);
            }
            this.method1937(-30401);
            this.method258();
        }
    }

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "()Lia;", line = 51)
    public final class414 method240() {
        ++field4371;
        return this.field4488;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(Z)V", line = 61)
    private final void method1907(boolean arg0) {
        this.field4604 = new class246();
        ++field4383;
        this.field4541 = new class246();
        this.field4608 = new class492[this.field4598];
        this.field4516 = new class286(this, 3553, 6408, 1, 1);
        this.field4526 = new class286(this, 3553, 6408, 1, 1);
        this.field4617 = new class286(this, 3553, 6408, 1, 1);
        this.field4620 = new class319(this);
        this.field4574 = new class319(this);
        this.field4596 = new class319(this);
        this.field4549 = new class319(this);
        this.field4579 = new class319(this);
        this.field4587 = new class319(this);
        this.field4593 = new class319(this);
        this.field4544 = new class319(this);
        this.field4520 = new class319(this);
        this.field4603 = new class319(this);
        if (!arg0) {
            this.method303();
        }
        if (this.field4532) {
            this.field4625 = new class240(this);
            this.field4552 = new class240(this);
        }
    }

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "()Z", line = 94)
    public final boolean method299() {
        ++field4478;
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "()V", line = 102)
    public final void method203() {
        ++field4457;
        try {
            this.field4314.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 121)
    public final void method256(int arg0) {
        ++field4292;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "(I)V", line = 133)
    private final void method1908(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field4316;
        OpenGL.glLoadMatrixf(this.field4597, 0);
        if (arg0 < 49) {
            this.field4314 = null;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)V", line = 146)
    public final synchronized void method213(int arg0) {
        ++field4349;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4509.method2430(-1)) {
            class451 var12 = (class451) this.field4509.method2423(0);
            class202.field2957[var3++] = (int) var12.field4904;
            this.field4507 -= var12.field6742;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class202.field2957, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class202.field2957, 0);
            var3 = 0;
        }
        while (!this.field4510.method2430(-1)) {
            class451 var11 = (class451) this.field4510.method2423(0);
            class202.field2957[var3++] = (int) var11.field4904;
            this.field4508 -= var11.field6742;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class202.field2957, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class202.field2957, 0);
            var3 = 0;
        }
        while (!this.field4511.method2430(-1)) {
            class451 var10 = (class451) this.field4511.method2423(0);
            class202.field2957[var3++] = var10.field6742;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class202.field2957, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class202.field2957, 0);
            var3 = 0;
        }
        while (!this.field4512.method2430(-1)) {
            class451 var9 = (class451) this.field4512.method2423(0);
            class202.field2957[var3++] = (int) var9.field4904;
            this.field4505 -= var9.field6742;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class202.field2957, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class202.field2957, 0);
            boolean var4 = false;
        }
        while (!this.field4506.method2430(-1)) {
            class451 var8 = (class451) this.field4506.method2423(0);
            OpenGL.glDeleteLists((int) var8.field4904, var8.field6742);
        }
        while (!this.field4513.method2430(-1)) {
            class320 var7 = this.field4513.method2423(0);
            OpenGL.glDeleteProgramARB((int) var7.field4904);
        }
        while (!this.field4514.method2430(-1)) {
            class320 var6 = this.field4514.method2423(0);
            OpenGL.glDeleteObjectARB(var6.field4904);
        }
        while (!this.field4506.method2430(-1)) {
            class451 var5 = (class451) this.field4506.method2423(0);
            OpenGL.glDeleteLists((int) var5.field4904, var5.field6742);
        }
        this.field4472.method586(5);
        if (this.method217() > 100663296 && this.field4630 + 60000L < class211.method1419(12921)) {
            System.gc();
            this.field4630 = class211.method1419(12921);
        }
        this.field4490 = var2;
    }

    @OriginalMember(owner = "client!vj", name = "xa", descriptor = "()I", line = 314)
    public final int method228() {
        ++field4407;
        int var1 = this.field4592;
        this.field4592 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "()I", line = 327)
    public final int method252() {
        ++field4328;
        int var1 = this.field4534;
        this.field4534 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(BI)I", line = 339)
    public final int method1909(byte arg0, int arg1) {
        ++field4462;
        if (arg1 == 1) {
            return 7681;
        } else if (~arg1 != -1) {
            if (arg1 == 2) {
                return 34165;
            } else if (arg1 != 3) {
                if (~arg1 == -5) {
                    return 34023;
                } else if (arg0 != -33) {
                    return -16;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 8448;
        }
    }

    @OriginalMember(owner = "client!vj", name = "ba", descriptor = "(IIII)V", line = 372)
    public final void method214(int arg0, int arg1, int arg2, int arg3) {
        ++field4375;
        if (!this.field4561) {
            throw new RuntimeException("");
        } else {
            this.field4610 = arg1;
            this.field4590 = arg3;
            this.field4594 = arg2;
            this.field4565 = arg0;
            this.field4470.field4130.method2600(8192);
            this.method1948((byte) -53);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZI)V", line = 390)
    public final synchronized void method1910(int arg0, boolean arg1, int arg2) {
        ++field4360;
        if (!arg1) {
            this.field4494 = null;
        }
        class451 var4 = new class451(arg2);
        var4.field4904 = (long) arg0;
        this.field4510.method2417(-119, var4);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lu;I)V", line = 404)
    public final void method1911(class52 arg0, int arg1) {
        if (arg1 <= 49) {
            this.method1925(42);
        }
        if (this.field4606 != arg0) {
            if (this.field4554) {
                OpenGL.glBindBufferARB(34963, arg0.method469((byte) 101));
            }
            this.field4606 = arg0;
        }
        ++field4345;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 424)
    private final void method1912(byte arg0) {
        if (arg0 == -123) {
            ++field4454;
            OpenGL.glViewport(this.field4543, this.field4525, this.field4372, this.field4387);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V", line = 436)
    public final synchronized void method1913(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.field4624 = -104;
        }
        ++field4474;
        class451 var4 = new class451(arg0);
        var4.field4904 = (long) arg1;
        this.field4509.method2417(-122, var4);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 450)
    public final class35 method273(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4397;
        return new class390(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)Lrd;", line = 460)
    public final class221 method1914(byte arg0) {
        if (arg0 != -59) {
            this.method223();
        }
        ++field4363;
        return this.field4576 != null ? this.field4576.method713(false) : null;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "()V", line = 478)
    public final void method303() {
        if (this.field4476 != null && this.field4476.method2193((byte) 80)) {
            this.field4483.method512(0, this.field4476);
            this.field4472.method579(7);
        }
        ++field4455;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 496)
    public final void method227(Rectangle[] arg0, int arg1) {
        ++field4440;
        this.method203();
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "(I)V", line = 504)
    public final void method1915(int arg0) {
        ++field4293;
        if (arg0 >= -11) {
            this.method1924((byte) 86, (class113) null);
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lwq;I)V", line = 516)
    public final void method1916(class113 arg0, int arg1) {
        ++field4442;
        if (arg1 > 90) {
            if (this.field4533) {
                this.method1960(4, arg0);
                this.method1935(-1, arg0);
            } else if (~this.field4502 <= -1 && this.field4504[this.field4502] == arg0) {
                this.field4504[this.field4502--] = null;
                arg0.method842(-26504);
                if (this.field4502 >= 0) {
                    this.field4497 = this.field4501 = this.field4504[this.field4502];
                    this.field4497.method844((byte) 22);
                } else {
                    this.field4497 = this.field4501 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "XA", descriptor = "(IFFFFF)V", line = 554)
    public final void method233(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4450;
        boolean var7 = ~this.field4537 != ~arg0;
        if (var7 || this.field4547 != arg1 || this.field4633 != arg2) {
            this.field4547 = arg1;
            this.field4537 = arg0;
            this.field4633 = arg2;
            if (var7) {
                this.field4573 = (float) (this.field4537 & 16711680) / 1.671168E7F;
                this.field4536 = (float) (this.field4537 & 255) / 255.0F;
                this.field4575 = (float) (65280 & this.field4537) / 65280.0F;
                this.method1973(-47);
            }
            this.method1961(-28636);
        }
        if (this.field4619[0] != arg3 || this.field4619[1] != arg4 || this.field4619[2] != arg5) {
            this.field4619[0] = arg3;
            this.field4619[1] = arg4;
            this.field4619[2] = arg5;
            this.field4582[2] = -arg5;
            this.field4582[1] = -arg4;
            this.field4582[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4527[2] = arg5 * var8;
            this.field4527[1] = arg4 * var8;
            this.field4527[0] = arg3 * var8;
            this.field4558[1] = -this.field4527[1];
            this.field4558[0] = -this.field4527[0];
            this.field4558[2] = -this.field4527[2];
            this.method1969((byte) -41);
            this.field4591 = (int) (arg5 * 256.0F / arg4);
            this.field4567 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([Lc;Lsh;Lia;[Llc;I)V", line = 604)
    public final void method272(class121[] arg0, class49 arg1, class414 arg2, class456[] arg3, int arg4) {
        this.method263(arg0, arg2, arg3, arg4);
        ++field4306;
        this.method268(arg1);
    }

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "(I)V", line = 613)
    public static final void method1917(int arg0) {
        ++field4443;
        if (class197.field2913 == null) {
            if (arg0 < 63) {
                method1918(false);
            }
            Container var1;
            if (class423.field6321 == null) {
                var1 = class368.field5553.field4170;
            } else {
                var1 = class423.field6321;
            }
            class431.field6418 = var1.getSize().width;
            class420.field6275 = var1.getSize().height;
            if (class423.field6321 == var1) {
                Insets var2 = class423.field6321.getInsets();
                class431.field6418 -= var2.right + var2.left;
                class420.field6275 -= var2.top + var2.bottom;
            }
            if (~class8.method43(false) == -2) {
                class77.field1297 = class347.field5193;
                class5.field127 = 0;
                class414.field6183 = (-class25.field543 + class431.field6418) / 2;
                class466.field6952 = class25.field543;
            } else if (class457.field6854 < 96 && ~class169.field2624 == -1) {
                int var3 = class431.field6418 > 1024 ? 1024 : class431.field6418;
                int var4 = class420.field6275 <= 768 ? class420.field6275 : 768;
                class414.field6183 = (-var3 + class431.field6418) / 2;
                class466.field6952 = var3;
                class5.field127 = 0;
                class77.field1297 = var4;
            } else {
                class77.field1297 = class420.field6275;
                class466.field6952 = class431.field6418;
                class5.field127 = 0;
                class414.field6183 = 0;
            }
            if (class446.field6661 != class423.field6322) {
                boolean var10000;
                if (class466.field6952 < 1024 && ~class77.field1297 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class370.field5611.setSize(class466.field6952, class77.field1297);
            if (class4.field109 != null) {
                class4.field109.method248(class370.field5611);
            }
            if (class423.field6321 != var1) {
                class370.field5611.setLocation(class414.field6183, class5.field127);
            } else {
                Insets var5 = class423.field6321.getInsets();
                class370.field5611.setLocation(class414.field6183 + var5.left, class5.field127 + var5.top);
            }
            if (~class364.field5513 != 0) {
                class11.method76(0, true);
            }
            class79.method633((byte) -20);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V", line = 711)
    public final void method206() {
        ++field4343;
        this.field4483.method506(0);
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(Z)V", line = 721)
    public static void method1918(boolean arg0) {
        if (!arg0) {
            method1918(true);
        }
        field4451 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FIFF)V", line = 732)
    private final void method1919(float arg0, int arg1, float arg2, float arg3) {
        ++field4469;
        OpenGL.glMatrixMode(arg1);
        if (this.field4540) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg3, arg0);
        OpenGL.glMatrixMode(5888);
        this.field4540 = true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[BZII)Lu;", line = 746)
    public final class52 method1920(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 255) {
            this.field4525 = -13;
        }
        ++field4481;
        return (class52) (!this.field4554 || arg2 && !this.field4556 ? new class370(this, arg4, arg1, arg0) : new class449(this, arg4, arg1, arg0, arg2));
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lsh;)V", line = 763)
    public final void method268(class49 arg0) {
        this.field4477.method3012((byte) -99, this, arg0);
        ++field4446;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 772)
    public final void method225(Canvas arg0) {
        ++field4310;
        this.field4294 = 0L;
        this.field4458 = null;
        if (arg0 != null && this.field4302 != arg0) {
            if (this.field4410.containsKey(arg0)) {
                Long var2 = (Long) this.field4410.get(arg0);
                this.field4294 = var2;
                this.field4458 = arg0;
            }
        } else {
            this.field4458 = this.field4302;
            this.field4294 = this.field4379;
        }
        if (this.field4458 != null && ~this.field4294 != -1L) {
            this.field4314.setSurface(this.field4294);
            this.method1906(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "()Z", line = 806)
    public final boolean method226() {
        ++field4473;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBI)V", line = 814)
    public final void method1921(int arg0, int arg1, byte arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg3 + 34176, arg1);
        ++field4369;
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg0);
        int var5 = 48 % ((-41 - arg2) / 60);
    }

    @OriginalMember(owner = "client!vj", name = "na", descriptor = "(I)V", line = 825)
    public final void method307(int arg0) {
        ++field4303;
        this.field4492 = 0;
        while (arg0 > 1) {
            ++this.field4492;
            arg0 >>= 1;
        }
        this.field4495 = 1 << this.field4492;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V", line = 840)
    private final void method1922(byte arg0) {
        if (arg0 >= -109) {
            this.field4587 = null;
        }
        ++field4426;
        if (this.field4555 && this.field4561 | ~this.field4531 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Lwq;I)V", line = 856)
    public final void method1923(class113 arg0, int arg1) {
        ++field4419;
        if (this.field4500 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field4500 >= 0) {
                this.field4499[this.field4500].method843(-13658);
            }
            this.field4497 = this.field4499[++this.field4500] = arg0;
            this.field4497.method841(-89);
            if (arg1 != -5831) {
                this.field4529 = 83;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIIIII)V", line = 874)
    public final void method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4384;
        this.method1965((byte) 22);
        this.method1934(arg5, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ll;)V", line = 892)
    public final void method301(class16 arg0) {
        this.field4496 = ((class302) arg0).field4280;
        ++field4424;
        if (this.field4613 == null) {
            class409 var2 = new class409(80);
            if (!this.field4599) {
                var2.method2487(986946216, -1.0F);
                var2.method2487(986946216, -1.0F);
                var2.method2487(986946216, 0.0F);
                var2.method2487(986946216, 0.0F);
                var2.method2487(986946216, 1.0F);
                var2.method2487(986946216, 1.0F);
                var2.method2487(986946216, -1.0F);
                var2.method2487(986946216, 0.0F);
                var2.method2487(986946216, 1.0F);
                var2.method2487(986946216, 1.0F);
                var2.method2487(986946216, 1.0F);
                var2.method2487(986946216, 1.0F);
                var2.method2487(986946216, 0.0F);
                var2.method2487(986946216, 1.0F);
                var2.method2487(986946216, 0.0F);
                var2.method2487(986946216, -1.0F);
                var2.method2487(986946216, 1.0F);
                var2.method2487(986946216, 0.0F);
                var2.method2487(986946216, 0.0F);
                var2.method2487(986946216, 0.0F);
            } else {
                var2.method2489(-1.0F, 24204);
                var2.method2489(-1.0F, 24204);
                var2.method2489(0.0F, 24204);
                var2.method2489(0.0F, 24204);
                var2.method2489(1.0F, 24204);
                var2.method2489(1.0F, 24204);
                var2.method2489(-1.0F, 24204);
                var2.method2489(0.0F, 24204);
                var2.method2489(1.0F, 24204);
                var2.method2489(1.0F, 24204);
                var2.method2489(1.0F, 24204);
                var2.method2489(1.0F, 24204);
                var2.method2489(0.0F, 24204);
                var2.method2489(1.0F, 24204);
                var2.method2489(0.0F, 24204);
                var2.method2489(-1.0F, 24204);
                var2.method2489(1.0F, 24204);
                var2.method2489(0.0F, 24204);
                var2.method2489(0.0F, 24204);
                var2.method2489(0.0F, 24204);
            }
            this.field4613 = this.method1946(false, var2.field2289, var2.field2270, 20, 4564);
            this.field4623 = new class184(this.field4613, 5126, 3, 0);
            this.field4542 = new class184(this.field4613, 5126, 2, 12);
            this.field4477.method3014(this, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V", line = 959)
    public final void method245(int arg0) {
        ++field4382;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field4479 = arg0;
            this.field4472.method579(7);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "SA", descriptor = "(IIIIII)Z", line = 972)
    public final boolean method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4449;
        float var7 = (float) arg2 * this.field4604.field3543 + (float) arg0 * this.field4604.field3559 + (float) arg1 * this.field4604.field3561 + this.field4604.field3529;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4604.field3543 + (float) arg3 * this.field4604.field3559 + (float) arg4 * this.field4604.field3561 + this.field4604.field3529;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4600) || !(var8 < (float) this.field4600)) && (!(var7 > (float) this.field4615) || !((float) this.field4615 < var8))) {
            int var9 = (int) (((float) arg2 * this.field4604.field3530 + (float) arg0 * this.field4604.field3555 + (float) arg1 * this.field4604.field3551 + this.field4604.field3554) * (float) this.field4578 / var7);
            int var10 = (int) (((float) arg5 * this.field4604.field3530 + (float) arg3 * this.field4604.field3555 + (float) arg4 * this.field4604.field3551 + this.field4604.field3554) * (float) this.field4578 / var8);
            if (this.field4569 > (float) var9 && (float) var10 < this.field4569 || this.field4628 < (float) var9 && (float) var10 > this.field4628) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4604.field3544 + (float) arg0 * this.field4604.field3533 + (float) arg1 * this.field4604.field3536 + this.field4604.field3557) * (float) this.field4611 / var7);
                int var12 = (int) (((float) arg5 * this.field4604.field3544 + (float) arg3 * this.field4604.field3533 + (float) arg4 * this.field4604.field3536 + this.field4604.field3557) * (float) this.field4611 / var8);
                return (!(this.field4563 > (float) var11) || !(this.field4563 > (float) var12)) && (!(this.field4609 < (float) var11) || !((float) var12 > this.field4609));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLwq;)V", line = 1012)
    public final void method1924(byte arg0, class113 arg1) {
        ++field4436;
        if (~this.field4498 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field4498 >= 0) {
                this.field4503[this.field4498].method840(18847);
            }
            this.field4501 = this.field4503[++this.field4498] = arg1;
            if (arg0 > -62) {
                this.method252();
            }
            this.field4501.method839(20433);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[I[I)Lea;", line = 1031)
    public final class381 method294(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4326;
        return class63.method539(arg0, arg2, this, 88, arg1, arg3);
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "(I)V", line = 1040)
    private final void method1925(int arg0) {
        if (this.field4559 != arg0) {
            this.field4559 = 3;
            this.method1979((byte) 73);
            this.method1931((byte) 62);
            this.field4522 &= -8;
        }
        ++field4373;
    }

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "(I)V", line = 1055)
    private final void method1926(int arg0) {
        ++field4344;
        if (this.field4540) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4540 = false;
        }
        if (arg0 > -115) {
            this.field4610 = 6;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V", line = 1077)
    private final void method1927(byte arg0) {
        if (arg0 == 40) {
            ++field4463;
            int var2;
            for (var2 = 0; ~this.field4529 < ~var2; ++var2) {
                class462 var3 = this.field4562[var2];
                int var4 = var2 + 16386;
                class208.field3011[0] = (float) var3.method2752(-25273);
                class208.field3011[1] = (float) var3.method2746((byte) -96);
                class208.field3011[2] = (float) var3.method2744(-254);
                class208.field3011[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class208.field3011, 0);
                int var5 = var3.method2750(true);
                float var6 = var3.method2748(true) / 255.0F;
                class208.field3011[0] = (float) class207.method1405(255, var5 >> 16) * var6;
                class208.field3011[1] = (float) class207.method1405(255, var5 >> 8) * var6;
                class208.field3011[2] = (float) class207.method1405(255, var5) * var6;
                OpenGL.glLightfv(var4, 4609, class208.field3011, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2749((byte) -80) * var3.method2749((byte) -89)));
                OpenGL.glEnable(var4);
            }
            while (~this.field4551 < ~var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field4551 = this.field4529;
        }
    }

    @OriginalMember(owner = "client!vj", name = "pa", descriptor = "(IIII)V", line = 1122)
    public final void method298(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > this.field4372) {
            arg2 = this.field4372;
        }
        ++field4377;
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg3 > this.field4387) {
            arg3 = this.field4387;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field4629 = arg3;
        this.field4550 = arg0;
        this.field4616 = arg1;
        this.field4595 = arg2;
        OpenGL.glEnable(3089);
        this.method1966(-2);
        this.method1936(117);
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V", line = 1155)
    public final void method277(int arg0) {
        ++field4452;
        this.method1964(5);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V", line = 1163)
    public final synchronized void method1928(int arg0, int arg1) {
        ++field4422;
        class451 var3 = new class451(arg0);
        this.field4511.method2417(arg1 ^ 307, var3);
        if (arg1 != 260) {
            this.method198(-67, 27, -29, 80);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V", line = 1185)
    public final void method1929(int arg0, byte arg1) {
        if (this.field4624 != arg0) {
            OpenGL.glActiveTexture(33984 - -arg0);
            this.field4624 = arg0;
        }
        if (arg1 <= 58) {
            this.field4518 = -0.07682592F;
        }
        ++field4311;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFF)V", line = 1202)
    public final void method215(float arg0, float arg1, float arg2) {
        ++field4334;
        class482.field7168 = arg2;
        class42.field826 = arg0;
        class474.field7094 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)V", line = 1218)
    public final void method1930(byte arg0) {
        if (arg0 >= 106) {
            if (this.field4522 != 2) {
                this.method1968(10543);
                this.method1943(false, (byte) -60);
                this.method1941(false, 21282);
                this.method1983(34161, false);
                this.method1984(115, false);
                this.method1970(7, -2);
                this.field4522 = 2;
            }
            ++field4416;
        }
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(B)V", line = 1239)
    private final void method1931(byte arg0) {
        OpenGL.glLoadIdentity();
        ++field4342;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field4604.method1599(arg0 ^ 16321), 0);
        if (this.field4561) {
            this.field4470.field4130.method2600(8192);
        }
        if (arg0 == 62) {
            this.method1969((byte) -41);
            this.method1927((byte) 40);
        }
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "(ILea;II)V", line = 1257)
    public final void method270(int arg0, class381 arg1, int arg2, int arg3) {
        ++field4297;
        class363 var5 = (class363) arg1;
        class39 var6 = var5.field5496;
        this.method1930((byte) 109);
        this.method1990(var5.field5496, 11864);
        this.method1934(1, true);
        this.method1951((byte) -39, 7681, 8448);
        this.method1921(768, 34167, (byte) -110, 0);
        float var7 = var6.field718 / (float) var6.field723;
        float var8 = var6.field722 / (float) var6.field720;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4550) * var7, (float) (-arg3 + this.field4616) * var8);
        OpenGL.glVertex2i(this.field4550, this.field4616);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4550) * var7, (float) (this.field4629 - arg3) * var8);
        OpenGL.glVertex2i(this.field4550, this.field4629);
        OpenGL.glTexCoord2f((float) (this.field4595 - arg2) * var7, (float) (-arg3 + this.field4629) * var8);
        OpenGL.glVertex2i(this.field4595, this.field4629);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4595) * var7, (float) (-arg3 + this.field4616) * var8);
        OpenGL.glVertex2i(this.field4595, this.field4616);
        OpenGL.glEnd();
        this.method1921(768, 5890, (byte) 118, 0);
    }

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "()V", line = 1294)
    public final void method291() {
        ++field4307;
        this.method1984(109, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "()Z", line = 1305)
    public final boolean method219() {
        ++field4348;
        return this.field4476 != null && (this.field4482 <= 1 || this.field4602);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V", line = 1314)
    public final synchronized void method1932(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            ++field4425;
            class451 var4 = new class451(arg0);
            var4.field4904 = (long) arg2;
            this.field4512.method2417(-123, var4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[Lfk;)V", line = 1329)
    public final void method289(int arg0, class462[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field4562[var3] = arg1[var3];
        }
        ++field4367;
        this.field4529 = arg0;
        if (this.field4559 != 1) {
            this.method1927((byte) 40);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIIII)Lf;", line = 1352)
    public final class529 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4389;
        return new class270(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()Z", line = 1361)
    public final boolean method223() {
        ++field4391;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIZ)Lf;", line = 1371)
    public final class529 method218(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4355;
        return new class270(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "(I)I", line = 1383)
    private final int method1933(int arg0) {
        ++field4406;
        this.field4568 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field4530 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field4568.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field4568.indexOf("brian paul") != 0 || ~this.field4568.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class139.method1043(var3.replace('.', ' '), 0, ' ');
        if (~var4.length <= -3) {
            try {
                int var5 = class463.method2758(-85, var4[0]);
                int var6 = class463.method2758(-96, var4[1]);
                this.field4634 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field4634 > -13) {
            var2 |= 2;
        }
        if (!this.field4314.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4314.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        if (arg0 <= 75) {
            this.method243(37, 125, 112);
        }
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4598 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field4535 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field4577 = var7[0];
        if (~this.field4598 > -3 || this.field4535 < 2 || this.field4577 < 2) {
            var2 |= 16;
        }
        this.field4599 = NativeStream.method2629();
        this.field4314.arePbuffersAvailable();
        this.field4554 = this.field4314.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4627 = this.field4314.isExtensionAvailable("GL_ARB_multisample");
        this.field4546 = this.field4314.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4314.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4523 = this.field4314.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4612 = this.field4314.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4553 = this.field4314.isExtensionAvailable("GL_EXT_texture3D");
        this.field4538 = this.field4314.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4515 = this.field4314.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4571 = this.field4314.isExtensionAvailable("GL_ARB_texture_float");
        this.field4583 = false;
        this.field4532 = this.field4314.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field4533 = this.field4314.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field4521 = this.field4314.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field4602 = this.field4521 & this.field4533;
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V", line = 1470)
    public final void method1934(int arg0, boolean arg1) {
        if (this.field4585 != arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg0 == 1) {
                var3 = 1;
                var4 = true;
                var5 = true;
            } else if (arg0 == 2) {
                var3 = 2;
                var5 = true;
                var4 = false;
            } else if (~arg0 != -129) {
                var3 = 0;
                var5 = true;
                var4 = false;
            } else {
                var5 = true;
                var4 = true;
                var3 = 3;
            }
            if (this.field4584 != var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field4584 = var5;
            }
            if (!var4 != !this.field4528) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field4528 = var4;
            }
            if (~this.field4589 != ~var3) {
                if (var3 != 1) {
                    if (var3 != 2) {
                        if (var3 == 3) {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        } else {
                            OpenGL.glDisable(3042);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field4589 = var3;
            }
            this.field4522 &= -29;
            this.field4585 = arg0;
        }
        if (!arg1) {
            field4329 = -27;
        }
        ++field4291;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILwq;)V", line = 1566)
    public final void method1935(int arg0, class113 arg1) {
        ++field4300;
        if (arg0 >= ~this.field4498 && this.field4503[this.field4498] == arg1) {
            this.field4503[this.field4498--] = null;
            arg1.method840(18847);
            if (this.field4498 < 0) {
                this.field4501 = null;
            } else {
                this.field4501 = this.field4503[this.field4498];
                this.field4501.method839(20433);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lc;Lsh;Lia;Llc;I)V", line = 1586)
    public final void method249(class121 arg0, class49 arg1, class414 arg2, class456 arg3, int arg4) {
        arg0.method927(arg2, arg3, arg4);
        ++field4471;
        this.method268(arg1);
    }

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "()I", line = 1596)
    public final int method275() {
        ++field4357;
        return this.field4615;
    }

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "(I)V", line = 1609)
    private final void method1936(int arg0) {
        if (this.field4550 <= this.field4595 && ~this.field4629 <= ~this.field4616) {
            OpenGL.glScissor(this.field4550 + this.field4543, this.field4525 + this.field4387 + -this.field4629, this.field4595 - this.field4550, this.field4629 - this.field4616);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        int var2 = 16 % ((arg0 - 71) / 46);
        ++field4338;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lwe;Z)Lf;", line = 1624)
    public final class529 method304(class279 arg0, boolean arg1) {
        ++field4415;
        int[] var3 = new int[arg0.field4005 * arg0.field4003];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4004 != null) {
            for (int var6 = 0; ~var6 > ~arg0.field4003; ++var6) {
                for (int var7 = 0; var7 < arg0.field4005; ++var7) {
                    var3[var5++] = class121.method909(arg0.field4004[var4] << 24, arg0.field4011[class207.method1405(arg0.field4006[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; var8 < arg0.field4003; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field4005; ++var10) {
                    int var11 = arg0.field4011[255 & arg0.field4006[var4++]];
                    var3[var5++] = ~var11 != -1 ? class121.method909(-16777216, var11) : 0;
                }
            }
        }
        class529 var9 = this.method306(var3, 0, arg0.field4005, arg0.field4005, arg0.field4003);
        var9.method99(arg0.field4007, arg0.field4008, arg0.field4009, arg0.field4010);
        return var9;
    }

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "(I)V", line = 1685)
    public final void method1937(int arg0) {
        if (arg0 != -30401) {
            this.field4488 = null;
        }
        ++field4432;
        if (~this.field4559 != -1) {
            this.field4522 &= -32;
            this.field4559 = 0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIZZ)V", line = 1704)
    public final void method1938(boolean arg0, int arg1, boolean arg2, boolean arg3) {
        ++field4465;
        if (this.field4635 != arg1) {
            if (arg1 < 0) {
                this.method1926(-116);
                this.method1990((class492) null, 11864);
                this.method1989(-24145, 0);
                if (!this.field4561) {
                    this.field4470.method1836(0, arg3, arg2, (byte) -11);
                }
            } else {
                class286 var5 = this.field4472.method584(arg1, (byte) -103);
                class83 var6 = super.field2501.method956(-945, arg1);
                if (~var6.field1430 == -1 && var6.field1433 == 0) {
                    this.method1926(-128);
                } else {
                    int var7 = !var6.field1429 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method1919(0.0F, 5890, (float) (this.field4490 % var8 * var6.field1430) / (float) var8, (float) (this.field4490 % var8 * var6.field1433) / (float) var8);
                }
                if (!this.field4561) {
                    this.field4470.method1836(var6.field1451, arg3, arg2, (byte) -11);
                    this.field4470.method1835(false, var6.field1440, var6.field1428);
                    if (!this.field4470.method1833(var5, (byte) 125, var6.field1442)) {
                        this.method1990(var5, 11864);
                        this.method1989(-24145, var6.field1442);
                    }
                } else {
                    this.field4470.method1836(3, arg3, arg2, (byte) -11);
                    this.method1990(var5, 11864);
                    this.method1989(-24145, var6.field1442);
                }
            }
            this.field4635 = arg1;
        }
        if (!arg0) {
            this.field4522 &= -8;
        }
    }

    @OriginalMember(owner = "client!vj", name = "ia", descriptor = "(III[I)V", line = 1769)
    public final void method279(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4480;
        float var5 = (float) arg2 * this.field4604.field3543 + (float) arg0 * this.field4604.field3559 + (float) arg1 * this.field4604.field3561 + this.field4604.field3529;
        if (!((float) this.field4600 > var5) && !((float) this.field4615 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4604.field3530 + (float) arg0 * this.field4604.field3555 + (float) arg1 * this.field4604.field3551 + this.field4604.field3554) * (float) this.field4578 / var5);
            int var7 = (int) (((float) arg2 * this.field4604.field3544 + (float) arg0 * this.field4604.field3533 + (float) arg1 * this.field4604.field3536 + this.field4604.field3557) * (float) this.field4611 / var5);
            if ((float) var6 >= this.field4569 && this.field4628 >= (float) var6 && this.field4563 <= (float) var7 && this.field4609 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field4569);
                arg3[1] = (int) ((float) var7 - this.field4563);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZII)V", line = 1803)
    public final void method1939(boolean arg0, int arg1, int arg2) {
        ++field4417;
        if (arg2 != 0) {
            this.field4601 = null;
        }
        this.method1938(false, arg1, arg0, true);
    }

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "()Lia;", line = 1814)
    public final class414 method231() {
        ++field4362;
        return new class246();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 1822)
    public final void method211(boolean arg0) {
        ++field4412;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IF)V", line = 1831)
    public final void method1940(int arg0, float arg1) {
        if (this.field4581 != arg1) {
            this.field4581 = arg1;
            if (this.field4559 == 3) {
                this.method1979((byte) 73);
            }
        }
        if (arg0 < 16) {
            this.method1972(-88, 88L);
        }
        ++field4327;
    }

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "(IIIII)V", line = 1850)
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1965((byte) 22);
        ++field4364;
        this.method1934(arg4, true);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V", line = 1878)
    public final void method1941(boolean arg0, int arg1) {
        if (this.field4572 != arg0) {
            this.field4572 = arg0;
            this.method1949(-75);
            this.field4522 &= -8;
        }
        ++field4459;
        if (arg1 != 21282) {
            this.field4547 = -0.11374568F;
        }
    }

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "()V", line = 1897)
    public final void method222() {
        this.field4561 = false;
        ++field4411;
        this.field4470.method1836(0, false, false, (byte) -11);
        this.method1948((byte) -91);
        this.method1922((byte) -116);
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(B)V", line = 1910)
    public static final void method1942(byte arg0) {
        ++field4428;
        if (arg0 > -114) {
            method1917(-23);
        }
        class412.field6158.method281(((float) class443.field6623.field602 * 0.1F + 0.7F) * class292.field4158);
        class412.field6158.method233(class237.field3432, class60.field1061, class515.field7571, (float) (class202.field2949 << 0), (float) (class155.field2438 << 0), (float) (class84.field1459 << 0));
        class412.field6158.method284(class453.field6777);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZB)V", line = 1925)
    public final void method1943(boolean arg0, byte arg1) {
        if (arg1 != -60) {
            this.method1972(68, -45L);
        }
        ++field4330;
        if (this.field4555 == !arg0) {
            this.field4555 = arg0;
            this.method1922((byte) -112);
            this.field4522 &= -32;
        }
    }

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "()Z", line = 1943)
    public final boolean method208() {
        ++field4301;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(Z)V", line = 1951)
    private final void method1944(boolean arg0) {
        OpenGL.glDepthMask(this.field4524 && this.field4519);
        ++field4423;
        if (!arg0) {
            this.field4549 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "JA", descriptor = "(II)V", line = 1963)
    public final void method296(int arg0, int arg1) {
        ++field4485;
        if (~this.field4600 != ~arg0 || ~this.field4615 != ~arg1) {
            this.field4600 = arg0;
            this.field4615 = arg1;
            this.method1956(8735);
            this.method1948((byte) -77);
            if (~this.field4559 != -4) {
                if (this.field4559 == 2) {
                    this.method1908(101);
                    return;
                }
            } else {
                this.method1979((byte) 73);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lwq;Z)V", line = 1991)
    public final void method1945(class113 arg0, boolean arg1) {
        ++field4318;
        if (!this.field4533) {
            if (this.field4502 >= 3) {
                throw new RuntimeException();
            }
            if (~this.field4502 <= -1) {
                this.field4504[this.field4502].method842(-26504);
            }
            this.field4497 = this.field4501 = this.field4504[++this.field4502] = arg0;
            this.field4497.method844((byte) 22);
        } else {
            this.method1923(arg0, -5831);
            this.method1924((byte) -121, arg0);
        }
        if (arg1) {
            this.method1990((class492) null, -9);
        }
    }

    @OriginalMember(owner = "client!vj", name = "fa", descriptor = "(IIII)V", line = 2020)
    public final void method266(int arg0, int arg1, int arg2, int arg3) {
        this.field4610 = arg1;
        this.field4565 = arg0;
        this.field4594 = arg2;
        this.field4561 = true;
        this.field4590 = arg3;
        ++field4295;
        this.field4470.method1836(3, false, false, (byte) -11);
        this.field4470.field4130.method2600(8192);
        this.method1948((byte) -50);
        this.method1922((byte) -115);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI[BII)Lnh;", line = 2039)
    public final class525 method1946(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg4 != 4564) {
            this.method1960(-91, (class113) null);
        }
        ++field4427;
        return (class525) (!this.field4554 || arg0 && !this.field4556 ? new class75(this, arg3, arg2, arg1) : new class183(this, arg3, arg2, arg1, arg0));
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(IIIIII)Lbi;", line = 2057)
    public final class333 method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4378;
        return !this.field4515 ? null : new class242(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vj", name = "IA", descriptor = "(IIII)[I", line = 2065)
    public final int[] method259(int arg0, int arg1, int arg2, int arg3) {
        ++field4395;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field4387, arg2, 1, 32993, this.field4539, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;ILli;)V", line = 2086)
    public class303(int arg0, Canvas arg1, class126 arg2, int arg3, class293 arg4) {
        super(arg0, arg2);
        new class259();
        new class20(16);
        this.field4506 = new class392();
        this.field4509 = new class392();
        this.field4510 = new class392();
        this.field4511 = new class392();
        this.field4512 = new class392();
        this.field4513 = new class392();
        this.field4514 = new class392();
        this.field4519 = true;
        this.field4547 = -1.0F;
        this.field4564 = 3584.0F;
        this.field4525 = 0;
        this.field4536 = 1.0F;
        this.field4527 = new float[4];
        this.field4581 = 1.0F;
        this.field4543 = 0;
        this.field4550 = 0;
        this.field4558 = new float[4];
        this.field4600 = 50;
        this.field4562 = new class462[class335.field5058];
        this.field4531 = -1;
        this.field4517 = 0;
        this.field4578 = 512;
        this.field4594 = -1;
        this.field4582 = new float[4];
        this.field4597 = new float[16];
        this.field4618 = 0;
        this.field4588 = -1;
        this.field4616 = 0;
        this.field4580 = 3000.0F;
        this.field4615 = 3584;
        this.field4573 = 1.0F;
        this.field4605 = 0;
        this.field4622 = 1.0F;
        this.field4595 = 0;
        this.field4619 = new float[4];
        this.field4607 = 8448;
        this.field4621 = 0.0F;
        this.field4586 = 8448;
        this.field4611 = 512;
        this.field4537 = -1;
        this.field4610 = -1;
        this.field4575 = 1.0F;
        this.field4590 = 0;
        this.field4629 = 0;
        this.field4633 = -1.0F;
        this.field4631 = 3584.0F;
        this.field4458 = this.field4302 = arg1;
        this.field4482 = arg3;
        try {
            if (class286.field4086 == null || !class286.field4086) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method1872(true, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method1872(true, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method1872(true, "libjaggl.so").toString());
                    }
                    class286.field4086 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class286.field4086 = Boolean.TRUE;
                }
            }
            if (class286.field4086 != null && class286.field4086) {
                this.field4314 = new OpenGL();
                this.field4294 = this.field4379 = this.field4314.init(arg1, 8, 8, 8, 24, 0, this.field4482);
                if (~this.field4379 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1964(5);
                    int var7 = this.method1933(80);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field4539 = this.field4599 ? 33639 : 5121;
                        if (~this.field4530.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class139.method1043(this.field4530.replace('/', ' '), 0, ' ');
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && ~var13.length() <= -4 && class259.method1675((byte) 4, var13.substring(1, 3))) {
                                            var13 = var13.substring(1);
                                            var10 = true;
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (~var13.length() <= -5 && class259.method1675((byte) 4, var13.substring(0, 4))) {
                                                var8 = class463.method2758(-86, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && ~var8 >= -9251) {
                                    this.field4553 = false;
                                }
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field4554 = false;
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field4571 = false;
                            }
                            this.field4538 &= this.field4314.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field4556 = this.field4554;
                        }
                        if (this.field4568.indexOf("intel") != -1) {
                            this.field4532 = false;
                        }
                        this.field4566 = !this.field4568.equals("s3 graphics");
                        if (this.field4554) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class392.method2432(false, true, (byte) 51);
                        this.field4491 = true;
                        this.field4472 = new class71(this, super.field2501);
                        this.method1907(true);
                        this.field4493 = new class398(this);
                        this.field4483 = new class57(this);
                        if (this.field4483.method504(38)) {
                            this.field4476 = new class70(this);
                            if (!this.field4476.method576(1)) {
                                this.field4476.method570(1);
                                this.field4476 = null;
                            }
                        }
                        this.field4470 = new class290(this);
                        this.method1981((byte) -69);
                        this.method1906(1);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field4314.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class71.method583(100L, 34);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var20) {
            var20.printStackTrace();
            this.method297();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "()V", line = 2290)
    public final void method278() {
        ++field4332;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(Z)V", line = 2299)
    public final void method1947(boolean arg0) {
        ++field4347;
        if (!arg0) {
            this.field4519 = false;
        }
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(B)V", line = 2312)
    private final void method1948(byte arg0) {
        if (arg0 >= -9) {
            this.field4620 = null;
        }
        ++field4361;
        int var2;
        if (!this.field4561) {
            this.field4548 = (float) (-this.field4618 + this.field4615) - this.field4621;
            this.field4614 = -((float) this.field4531 * this.field4622) + this.field4548;
            if ((float) this.field4600 > this.field4614) {
                this.field4614 = (float) this.field4600;
            }
            OpenGL.glFogf(2915, this.field4614);
            OpenGL.glFogf(2916, this.field4548);
            var2 = this.field4588;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field4610;
        }
        class350.field5368[0] = (float) class207.method1405(16711680, var2) / 1.671168E7F;
        class350.field5368[2] = (float) class207.method1405(255, var2) / 255.0F;
        class350.field5368[1] = (float) class207.method1405(var2, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class350.field5368, 0);
        if (this.field4561) {
            this.field4470.field4130.method2601(-124);
        }
    }

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "(I)V", line = 2348)
    private final void method1949(int arg0) {
        if (this.field4572 && !this.field4560) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 >= -61) {
            this.field4574 = null;
        }
        ++field4403;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lbu;Lbu;I)I", line = 2379)
    public static final int method1950(class17 arg0, class17 arg1, int arg2) {
        ++field4358;
        int var3 = 0;
        if (arg1.method129(true, class272.field3931)) {
            ++var3;
        }
        if (arg1.method129(true, class228.field3246)) {
            ++var3;
        }
        if (arg1.method129(true, class244.field3498)) {
            ++var3;
        }
        if (arg0.method129(true, class272.field3931)) {
            ++var3;
        }
        if (arg2 <= 32) {
            field4287 = 43;
        }
        if (arg0.method129(true, class228.field3246)) {
            ++var3;
        }
        if (arg0.method129(true, class244.field3498)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)V", line = 2415)
    public final void method210(boolean arg0) {
        ++field4366;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I", line = 2422)
    public final int method255(int arg0, int arg1) {
        ++field4413;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BII)V", line = 2433)
    public final void method1951(byte arg0, int arg1, int arg2) {
        ++field4394;
        int var4 = 85 % ((39 - arg0) / 50);
        if (~this.field4624 == -1) {
            boolean var5 = false;
            if (~this.field4607 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var5 = true;
                this.field4607 = arg1;
            }
            if (~this.field4586 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                var5 = true;
                this.field4586 = arg2;
            }
            if (var5) {
                this.field4522 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Ll;", line = 2472)
    public final class16 method238(int arg0) {
        ++field4405;
        class302 var2 = new class302(arg0);
        this.field4494.method2417(-125, var2);
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "()Z", line = 2483)
    public final boolean method286() {
        ++field4439;
        if (this.field4476 != null) {
            if (!this.field4476.method2193((byte) 94)) {
                if (!this.field4483.method513((byte) 106, this.field4476)) {
                    return false;
                }
                this.field4472.method579(7);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIII)V", line = 2510)
    public final void method1952(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 114) {
            this.field4576 = null;
        }
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg1);
        ++field4339;
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "(Lia;)V", line = 2522)
    public final void method302(class414 arg0) {
        this.field4604 = (class246) arg0;
        ++field4429;
        this.field4541.method1597(this.field4604, (byte) 40);
        if (this.field4559 != 1) {
            this.method1931((byte) 62);
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)V", line = 2537)
    public final void method1953(int arg0, int arg1) {
        class350.field5368[3] = (float) (arg1 >>> 24) / 255.0F;
        class350.field5368[1] = (float) class207.method1405(65280, arg1) / 65280.0F;
        ++field4385;
        class350.field5368[2] = (float) class207.method1405(255, arg1) / 255.0F;
        if (arg0 != -28487) {
            this.method1925(-56);
        }
        class350.field5368[0] = (float) class207.method1405(16711680, arg1) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class350.field5368, 0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([Lc;Lia;[Llc;I)V", line = 2552)
    public final void method263(class121[] arg0, class414 arg1, class456[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method927(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field4431;
    }

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "(I)V", line = 2571)
    private final void method1954(int arg0) {
        if (arg0 < -81) {
            if (this.field4559 != 2) {
                this.field4559 = 2;
                this.method1908(80);
                this.method1931((byte) 62);
                this.field4522 &= -8;
            }
            ++field4324;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V", line = 2590)
    public final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4408;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method1965((byte) 22);
        this.method1934(arg5, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4627) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4627) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!vj", name = "FA", descriptor = "()I", line = 2622)
    public final int method217() {
        ++field4319;
        return this.field4508 + this.field4507 + this.field4505;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lmn;B)V", line = 2630)
    public final void method1955(class246 arg0, byte arg1) {
        if (arg1 <= -60) {
            ++field4317;
            OpenGL.glLoadMatrixf(arg0.method1599(16383), 0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "(I)V", line = 2645)
    private final void method1956(int arg0) {
        ++field4418;
        float[] var2 = this.field4597;
        if (arg0 != 8735) {
            this.method291();
        }
        float var3 = (float) (-this.field4605 * this.field4600) / (float) this.field4578;
        float var4 = (float) ((-this.field4605 + this.field4372) * this.field4600) / (float) this.field4578;
        float var5 = (float) (this.field4600 * this.field4517) / (float) this.field4611;
        float var6 = (float) ((-this.field4387 + this.field4517) * this.field4600) / (float) this.field4611;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field4600 * 2.0F;
            var2[12] = 0.0F;
            var2[4] = 0.0F;
            var2[3] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[11] = -1.0F;
            var2[7] = 0.0F;
            var2[15] = 0.0F;
            var2[10] = this.field4626 = (float) (-(this.field4615 - -this.field4600)) / (float) (-this.field4600 + this.field4615);
            var2[1] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[14] = this.field4570 = -((float) this.field4615 * var7) / (float) (-this.field4600 + this.field4615);
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[2] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[0] = var7 / (-var3 + var4);
        } else {
            var2[6] = 0.0F;
            var2[1] = 0.0F;
            var2[15] = 1.0F;
            var2[0] = 1.0F;
            var2[13] = 0.0F;
            var2[8] = 0.0F;
            var2[2] = 0.0F;
            var2[5] = 1.0F;
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[10] = 1.0F;
            var2[4] = 0.0F;
            var2[11] = 0.0F;
            var2[9] = 0.0F;
            var2[14] = 0.0F;
            var2[7] = 0.0F;
        }
        this.method1971((byte) -68);
    }

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "()F", line = 2708)
    public final float method276() {
        ++field4433;
        return this.field4518;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIII)V", line = 2719)
    public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4460;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZLjaggl/memory/NativeBuffer;I)Lnh;", line = 2727)
    public final class525 method1957(int arg0, int arg1, boolean arg2, NativeBuffer arg3, int arg4) {
        ++field4434;
        if (arg1 != 25630) {
            this.method1983(58, false);
        }
        return (class525) (!this.field4554 || arg2 && !this.field4556 ? new class75(this, arg4, arg3) : new class183(this, arg4, arg3, arg0, arg2));
    }

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "(I)V", line = 2743)
    public final void method1958(int arg0) {
        if (arg0 != 8960) {
            this.field4505 = 54;
        }
        if (~this.field4522 != -17) {
            this.method1925(3);
            this.method1943(true, (byte) -60);
            this.method1983(34161, true);
            this.method1984(arg0 + -8841, true);
            this.method1934(1, true);
            this.method1989(-24145, 0);
            this.field4522 = 16;
        }
        ++field4438;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)V", line = 2766)
    public final void method1959(int arg0, int arg1, byte arg2) {
        ++field4390;
        this.field4543 = arg1;
        this.field4525 = arg0;
        if (arg2 != 45) {
            this.field4575 = -0.31942925F;
        }
        this.method1912((byte) -123);
        this.method1936(-121);
    }

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "()V", line = 2780)
    public final void method297() {
        ++field4401;
        for (class320 var1 = this.field4494.method2427(111); var1 != null; var1 = this.field4494.method2422(-100)) {
            ((class302) var1).method1904((byte) 51);
        }
        if (this.field4483 != null) {
            this.field4483.method505(-118);
        }
        if (this.field4314 != null) {
            this.method1974(-12154);
            Enumeration var2 = this.field4410.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4410.get(var3);
                this.field4314.releaseSurface(var3, var4);
            }
            this.field4314.release();
            this.field4314 = null;
        }
        if (this.field4491) {
            class404.method2473(true, false, 7);
            this.field4491 = false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(ILwq;)V", line = 2825)
    public final void method1960(int arg0, class113 arg1) {
        ++field4374;
        if (this.field4500 >= 0 && this.field4499[this.field4500] == arg1) {
            this.field4499[this.field4500--] = null;
            arg1.method843(-13658);
            if (~this.field4500 > -1) {
                this.field4497 = null;
            } else {
                this.field4497 = this.field4499[this.field4500];
                this.field4497.method841(-125);
            }
            if (arg0 != 4) {
                this.method282(81, 31, -7, 26, -48, -64);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "(I)V", line = 2851)
    private final void method1961(int arg0) {
        ++field4486;
        class350.field5368[2] = this.field4547 * this.field4536;
        if (arg0 != -28636) {
            this.field4600 = 43;
        }
        class350.field5368[3] = 1.0F;
        class350.field5368[1] = this.field4575 * this.field4547;
        class350.field5368[0] = this.field4573 * this.field4547;
        OpenGL.glLightfv(16384, 4609, class350.field5368, 0);
        class350.field5368[1] = -this.field4633 * this.field4575;
        class350.field5368[2] = -this.field4633 * this.field4536;
        class350.field5368[0] = -this.field4633 * this.field4573;
        class350.field5368[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class350.field5368, 0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lmn;I)V", line = 2872)
    public final void method1962(class246 arg0, int arg1) {
        if (arg1 > 94) {
            OpenGL.glPushMatrix();
            ++field4331;
            OpenGL.glMultMatrixf(arg0.method1599(16383), 0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(II)I", line = 2884)
    public final int method1963(int arg0, int arg1) {
        ++field4445;
        if (arg1 != 6406 && arg1 != 6409) {
            if (~arg1 != -6411 && arg1 != 34846 && arg1 != 34844) {
                if (arg1 != 6407) {
                    if (~arg1 != -6409 && arg1 != 34847) {
                        if (~arg1 != -34844) {
                            if (~arg1 == -34843) {
                                return 8;
                            } else if (~arg1 != -6403) {
                                if (arg1 == 6401) {
                                    return 1;
                                } else {
                                    if (arg0 != 503683664) {
                                        this.method1956(-29);
                                    }
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 3;
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

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I", line = 2929)
    public final int method280(int arg0, int arg1) {
        ++field4484;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIILea;II)V", line = 2938)
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        ++field4461;
        class363 var10 = (class363) arg6;
        class39 var11 = var10.field5496;
        this.method1930((byte) 125);
        this.method1990(var10.field5496, 11864);
        this.method1934(arg5, true);
        this.method1951((byte) 93, 7681, 8448);
        this.method1921(768, 34167, (byte) 115, 0);
        float var12 = var11.field718 / (float) var11.field723;
        float var13 = var11.field722 / (float) var11.field720;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method1921(768, 5890, (byte) -118, 0);
    }

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "()I", line = 2970)
    public final int method293() {
        ++field4430;
        return 4;
    }

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "(I)V", line = 2982)
    private final void method1964(int arg0) {
        if (arg0 == 5) {
            ++field4388;
            int var2 = 0;
            while (!this.field4314.attach()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class71.method583(1000L, -92);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Leu;[Lwe;Z)Loa;", line = 3004)
    public final class489 method260(class332 arg0, class279[] arg1, boolean arg2) {
        ++field4456;
        return new class224(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(B)V", line = 3016)
    private final void method1965(byte arg0) {
        if (this.field4522 != 1) {
            this.method1968(10543);
            this.method1943(false, (byte) -60);
            this.method1941(false, 21282);
            this.method1983(34161, false);
            this.method1984(98, false);
            this.method1990((class492) null, 11864);
            this.method1970(arg0 ^ 17, -2);
            this.method1989(-24145, 1);
            this.field4522 = 1;
        }
        if (arg0 != 22) {
            this.method245(9);
        }
        ++field4447;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V", line = 3047)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4393;
        OpenGL.glLineWidth((float) arg5);
        this.method282(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "(I)V", line = 3059)
    private final void method1966(int arg0) {
        this.field4569 = (float) (-this.field4605 + this.field4550);
        if (arg0 != -2) {
            this.method1931((byte) -84);
        }
        this.field4609 = (float) (-this.field4517 + this.field4629);
        this.field4628 = (float) (-this.field4605 + this.field4595);
        ++field4441;
        this.field4563 = (float) (-this.field4517 + this.field4616);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IFFFF)V", line = 3078)
    public final void method1967(int arg0, float arg1, float arg2, float arg3, float arg4) {
        class350.field5368[1] = arg4;
        if (arg0 != 6406) {
            this.field4548 = 0.9299098F;
        }
        class350.field5368[2] = arg3;
        class350.field5368[3] = arg2;
        ++field4322;
        class350.field5368[0] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class350.field5368, 0);
    }

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "(I)V", line = 3095)
    private final void method1968(int arg0) {
        if (this.field4559 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field4372 < -1 && ~this.field4387 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field4372, (double) this.field4387, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4522 &= -25;
            this.field4559 = 1;
        }
        if (arg0 != 10543) {
            this.method218(101, -103, -29, -92, true);
        }
        ++field4321;
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "(B)V", line = 3120)
    public final void method1969(byte arg0) {
        if (arg0 != -41) {
            this.field4571 = true;
        }
        ++field4315;
        OpenGL.glLightfv(16384, 4611, this.field4527, 0);
        OpenGL.glLightfv(16385, 4611, this.field4558, 0);
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(II)V", line = 3132)
    public final void method1970(int arg0, int arg1) {
        if (arg0 != 7) {
            this.method200();
        }
        this.method1939(true, arg1, 0);
        ++field4448;
    }

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "()V", line = 3143)
    public final void method247() {
        ++field4466;
        if (this.field4566 && this.field4372 > 0 && this.field4387 > 0) {
            int var1 = this.field4550;
            int var2 = this.field4595;
            int var3 = this.field4616;
            int var4 = this.field4629;
            this.method258();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1937(-30401);
            this.method1943(false, (byte) -60);
            this.method1941(false, 21282);
            this.method1983(34161, false);
            this.method1984(123, false);
            this.method1990((class492) null, 11864);
            this.method1970(7, -2);
            this.method1989(-24145, 1);
            this.method1934(0, true);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4372, this.field4387, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method298(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "(B)V", line = 3186)
    private final void method1971(byte arg0) {
        if (arg0 == -68) {
            ++field4376;
            if (this.field4518 == 0.0F) {
                this.field4597[14] = this.field4570;
                this.field4597[10] = this.field4626;
            } else {
                float var2 = this.field4580 / (this.field4580 + this.field4518);
                float var3 = var2 * var2;
                float var4 = (-var2 + 1.0F) * -this.field4570 * (-var2 + 1.0F) / this.field4518;
                this.field4597[10] = this.field4626 + var4;
                this.field4597[14] = this.field4570 * var3;
            }
            this.field4631 = (float) this.field4615 - this.field4518;
            this.field4564 = (this.field4597[14] + (float) (-this.field4615)) / this.field4597[10];
        }
    }

    @OriginalMember(owner = "client!vj", name = "aa", descriptor = "(IIIIII[BII)V", line = 3221)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4312;
        float var10;
        float var11;
        if (this.field4557 != null && ~arg2 >= ~this.field4557.field4076 && this.field4557.field4074 >= arg3) {
            this.field4557.method1821(false, arg2, 82, arg3, 0, 0, 0, arg6, 6406, 0);
            var10 = (float) arg2 * this.field4557.field718 / (float) this.field4557.field4076;
            var11 = (float) arg3 * this.field4557.field722 / (float) this.field4557.field4074;
        } else {
            this.field4557 = class104.method789(this, (byte) 82, false, arg6, 6406, 6406, arg3, arg2);
            this.field4557.method1818(false, (byte) 123, false);
            var10 = this.field4557.field718;
            var11 = this.field4557.field722;
        }
        this.method1930((byte) 127);
        this.method1990(this.field4557, 11864);
        this.method1934(arg8, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1953(-28487, arg5);
        this.method1951((byte) 107, 34165, 34165);
        this.method1921(768, 34166, (byte) -105, 0);
        this.method1921(770, 5890, (byte) -102, 2);
        this.method1952(770, 34166, 123, 0);
        this.method1952(770, 5890, 118, 2);
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
        this.method1921(768, 5890, (byte) 33, 0);
        this.method1921(770, 34166, (byte) -103, 2);
        this.method1952(770, 5890, 125, 0);
        this.method1952(770, 34166, 123, 2);
    }

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "()Z", line = 3280)
    public final boolean method305() {
        ++field4333;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3290)
    public final void method248(Canvas arg0) {
        ++field4323;
        long var2 = 0L;
        if (arg0 != null && this.field4302 != arg0) {
            if (this.field4410.containsKey(arg0)) {
                Long var4 = (Long) this.field4410.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field4379;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field4314.surfaceResized(var2);
            if (this.field4458 == arg0) {
                this.method1906(1);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)V", line = 3320)
    public final synchronized void method1972(int arg0, long arg1) {
        if (arg0 != 2) {
            this.field4533 = true;
        }
        ++field4380;
        class320 var4 = new class320();
        var4.field4904 = arg1;
        this.field4514.method2417(-120, var4);
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "(I)V", line = 3337)
    private final void method1973(int arg0) {
        if (arg0 > -38) {
            this.field4488 = null;
        }
        class350.field5368[0] = this.field4573 * this.field4545;
        class350.field5368[2] = this.field4545 * this.field4536;
        class350.field5368[3] = 1.0F;
        ++field4354;
        class350.field5368[1] = this.field4575 * this.field4545;
        OpenGL.glLightModelfv(2899, class350.field5368, 0);
    }

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "([I)V", line = 3360)
    public final void method251(int[] arg0) {
        arg0[1] = this.field4616;
        arg0[0] = this.field4550;
        arg0[3] = this.field4629;
        ++field4296;
        arg0[2] = this.field4595;
    }

    @OriginalMember(owner = "client!vj", name = "ua", descriptor = "(F)V", line = 3371)
    public final void method281(float arg0) {
        ++field4341;
        if (this.field4545 != arg0) {
            this.field4545 = arg0;
            this.method1973(-120);
        }
    }

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "(I)V", line = 3386)
    private final void method1974(int arg0) {
        ++field4335;
        if (arg0 != -12154) {
            this.method295((class333) null, (class333) null, 1.3202965F, (class333) null);
        }
        this.field4314.detach();
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()I", line = 3400)
    public final int method200() {
        ++field4453;
        return this.field4600;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILnh;)V", line = 3411)
    public final void method1975(int arg0, class525 arg1) {
        if (arg0 >= -63) {
            this.method1978(47, -48);
        }
        ++field4386;
        if (this.field4601 != arg1) {
            if (this.field4554) {
                OpenGL.glBindBufferARB(34962, arg1.method604((byte) 35));
            }
            this.field4601 = arg1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIII)V", line = 3431)
    public final void method1976(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg0, arg2, arg1);
        int var5 = -86 % ((arg3 - -41) / 48);
        ++field4365;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IB)V", line = 3444)
    public final synchronized void method1977(int arg0, byte arg1) {
        ++field4398;
        if (arg1 == -9) {
            class320 var3 = new class320();
            var3.field4904 = (long) arg0;
            this.field4513.method2417(arg1 ^ 11, var3);
        }
    }

    @OriginalMember(owner = "client!vj", name = "GA", descriptor = "(IIII)V", line = 3459)
    public final void method230(int arg0, int arg1, int arg2, int arg3) {
        ++field4304;
        this.field4611 = arg3;
        this.field4517 = arg1;
        this.field4578 = arg2;
        this.field4605 = arg0;
        this.method1956(8735);
        this.method1966(-2);
        if (this.field4559 != 3) {
            if (this.field4559 == 2) {
                this.method1908(125);
                return;
            }
        } else {
            this.method1979((byte) 73);
        }
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(II)I", line = 3481)
    public final int method1978(int arg0, int arg1) {
        ++field4340;
        if (arg1 != -14063) {
            this.field4545 = 0.53098404F;
        }
        if (arg0 != 5121 && arg0 != 5120) {
            if (arg0 != 5123 && arg0 != 5122) {
                if (~arg0 != -5126 && ~arg0 != -5125 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "(B)V", line = 3504)
    private final void method1979(byte arg0) {
        ++field4437;
        float var2 = (float) (-this.field4605) * this.field4581 / (float) this.field4578;
        if (arg0 == 73) {
            float var3 = (float) (-this.field4517) * this.field4581 / (float) this.field4611;
            float var4 = (float) (-this.field4605 + this.field4372) * this.field4581 / (float) this.field4578;
            float var5 = (float) (this.field4387 - this.field4517) * this.field4581 / (float) this.field4611;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field4600 + -this.field4518), (double) ((float) this.field4615 - this.field4518));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!vj", name = "la", descriptor = "()F", line = 3530)
    public final float method221() {
        ++field4325;
        return this.field4580;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FIF)V", line = 3538)
    public final void method1980(float arg0, int arg1, float arg2) {
        if (arg1 != 0) {
            this.method1914((byte) -76);
        }
        this.field4621 = arg2;
        ++field4336;
        this.field4622 = arg0;
        if (!this.field4561) {
            this.method1948((byte) -14);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3554)
    public final void method261(Canvas arg0) {
        ++field4313;
        if (this.field4302 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4410.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field4314.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field4410.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lbi;Lbi;FLbi;)Lbi;", line = 3591)
    public final class333 method295(class333 arg0, class333 arg1, float arg2, class333 arg3) {
        ++field4305;
        if (arg0 != null && arg1 != null && this.field4515 && this.field4532 && this.field4533) {
            class107 var5 = null;
            class93 var6 = (class93) arg0;
            class93 var7 = (class93) arg1;
            class221 var8 = var6.method713(false);
            class221 var9 = var7.method713(false);
            if (var8 != null && var9 != null) {
                int var10 = var8.field3173 <= var9.field3173 ? var9.field3173 : var8.field3173;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class107) {
                    class107 var11 = (class107) arg3;
                    if (~var10 == ~var11.method802((byte) -117)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class107(this, var10);
                }
                if (var5.method804((byte) 37, arg2, var8, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V", line = 3639)
    public final void method220(boolean arg0) {
        ++field4298;
        this.field4519 = arg0;
        this.method1944(true);
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "(B)V", line = 3650)
    private final void method1981(byte arg0) {
        ++field4414;
        this.method1970(7, -2);
        if (arg0 != -69) {
            this.field4572 = false;
        }
        for (int var2 = this.field4598 + -1; ~var2 <= -1; --var2) {
            this.method1929(var2, (byte) 100);
            this.method1990((class492) null, 11864);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1951((byte) -22, 8448, 8448);
        this.method1921(770, 34168, (byte) -111, 2);
        this.method1926(arg0 ^ 60);
        this.field4585 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4589 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4528 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4584 = true;
        this.method1943(true, (byte) -60);
        this.method1941(true, 21282);
        this.method1983(34161, true);
        this.method1984(98, true);
        this.method1937(-30401);
        this.field4314.setSwapInterval(0);
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
        this.field4537 = this.field4588 = -1;
        this.method258();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lbi;)V", line = 3726)
    public final void method284(class333 arg0) {
        ++field4308;
        this.field4576 = (class93) arg0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lkd;Lkd;Lkd;Lkd;I)V", line = 3734)
    public final void method1982(class184 arg0, class184 arg1, class184 arg2, class184 arg3, int arg4) {
        if (arg2 != null) {
            this.method1975(-111, arg2.field2759);
            OpenGL.glVertexPointer(arg2.field2751, arg2.field2752, this.field4601.method601(536), this.field4601.method602(-16182) + (long) arg2.field2757);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field4309;
        if (arg4 <= 23) {
            this.method214(73, -61, -125, -79);
        }
        if (arg3 != null) {
            this.method1975(-66, arg3.field2759);
            OpenGL.glNormalPointer(arg3.field2752, this.field4601.method601(536), this.field4601.method602(-16182) - -((long) arg3.field2757));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg0 != null) {
            this.method1975(-83, arg0.field2759);
            OpenGL.glColorPointer(arg0.field2751, arg0.field2752, this.field4601.method601(536), this.field4601.method602(-16182) - -((long) arg0.field2757));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg1 != null) {
            this.method1975(-87, arg1.field2759);
            OpenGL.glTexCoordPointer(arg1.field2751, arg1.field2752, this.field4601.method601(536), this.field4601.method602(-16182) - -((long) arg1.field2757));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IZ)V", line = 3780)
    public final void method1983(int arg0, boolean arg1) {
        if (arg1 == !this.field4632) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field4522 &= -32;
            this.field4632 = arg1;
        }
        if (arg0 == 34161) {
            ++field4337;
        }
    }

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "()Z", line = 3802)
    public final boolean method283() {
        ++field4399;
        return this.field4470.method1832(3, true);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(IZ)V", line = 3811)
    public final void method1984(int arg0, boolean arg1) {
        ++field4288;
        if (arg0 >= 91) {
            if (!this.field4524 != !arg1) {
                this.field4524 = arg1;
                this.method1944(true);
                this.field4522 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "(I)V", line = 3828)
    public final void method1985(int arg0) {
        int var2 = -92 % ((arg0 - -74) / 42);
        ++field4409;
        if (~this.field4522 != -5) {
            this.method1968(10543);
            this.method1943(false, (byte) -60);
            this.method1941(false, 21282);
            this.method1983(34161, false);
            this.method1984(126, false);
            this.method1970(7, -2);
            this.method1934(1, true);
            this.method1989(-24145, 0);
            this.field4522 = 4;
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "()Z", line = 3851)
    public final boolean method285() {
        ++field4320;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "(IIII)V", line = 3859)
    public final void method198(int arg0, int arg1, int arg2, int arg3) {
        ++field4487;
        if (~this.field4629 < ~arg3) {
            this.field4629 = arg3;
        }
        if (arg2 < this.field4595) {
            this.field4595 = arg2;
        }
        if (this.field4550 < arg0) {
            this.field4550 = arg0;
        }
        if (arg1 > this.field4616) {
            this.field4616 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method1966(-2);
        this.method1936(122);
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "()Z", line = 3886)
    public final boolean method287() {
        ++field4420;
        return this.field4627 && (!this.method264() || this.field4602);
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "()Z", line = 3895)
    public final boolean method202() {
        ++field4435;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(ZB)V", line = 3903)
    public final void method1986(boolean arg0, byte arg1) {
        if (arg1 < 79) {
            this.field4597 = null;
        }
        if (this.field4560 != arg0) {
            this.field4560 = arg0;
            this.method1949(-92);
        }
        ++field4464;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lnd;IIII)Lc;", line = 3919)
    public final class121 method265(class380 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4396;
        return new class319(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V", line = 3928)
    public final void method207(int arg0, int arg1, int arg2, int arg3) {
        ++field4381;
        this.field4483.method507(arg3, arg1, arg0, arg2, 62);
    }

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "(I)V", line = 3938)
    public final void method1987(int arg0) {
        ++field4421;
        if (this.field4522 != 8) {
            this.method1954(-107);
            this.method1943(true, (byte) -60);
            this.method1983(34161, true);
            this.method1984(109, true);
            this.method1934(1, true);
            this.method1989(-24145, 0);
            this.field4522 = 8;
        }
        if (arg0 <= 16) {
            this.method218(-121, -122, 0, -119, true);
        }
    }

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "(I)V", line = 3959)
    public final void method241(int arg0) {
        ++field4352;
        this.method1934(0, true);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "()Z", line = 3972)
    public final boolean method224() {
        ++field4392;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "(III)V", line = 3980)
    public final void method243(int arg0, int arg1, int arg2) {
        ++field4468;
        if (this.field4588 != arg0 || ~this.field4531 != ~arg1 || this.field4618 != arg2) {
            this.field4531 = arg1;
            this.field4618 = arg2;
            this.field4588 = arg0;
            if (this.field4561) {
                return;
            }
            this.method1948((byte) -78);
            this.method1922((byte) -121);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()Z", line = 4003)
    public final boolean method232() {
        ++field4290;
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILu;IZI)V", line = 4011)
    public final void method1988(int arg0, class52 arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method1983(-126, false);
        }
        ++field4444;
        int var6 = arg1.method467((byte) -46);
        int var7 = arg2 * this.method1978(var6, -14063);
        this.method1911(arg1, 53);
        OpenGL.glDrawElements(arg4, arg0, var6, (long) var7 + arg1.method468(true));
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIF)Lfk;", line = 4033)
    public final class462 method267(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4400;
        return new class209(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V", line = 4044)
    public final void method212(int arg0) {
        ++field4402;
        this.method1974(-12154);
    }

    @OriginalMember(owner = "client!vj", name = "da", descriptor = "(IIIII)V", line = 4052)
    public final void method216(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4404;
        this.method1965((byte) 22);
        this.method1934(arg4, true);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vj", name = "NA", descriptor = "(IIIIII)V", line = 4072)
    public final void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4359;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1965((byte) 22);
        this.method1934(arg5, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4627) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4627) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "()Z", line = 4105)
    public final boolean method269() {
        ++field4350;
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "()Z", line = 4114)
    public final boolean method264() {
        ++field4370;
        return this.field4476 != null && this.field4476.method2193((byte) -106);
    }

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "(FF)V", line = 4127)
    public final void method300(float arg0, float arg1) {
        if (this.field4580 != arg0 || this.field4518 != arg1) {
            this.field4580 = arg0;
            this.field4518 = arg1;
            this.method1971((byte) -68);
            if (this.field4559 != 3) {
                if (~this.field4559 == -3) {
                    this.method1908(84);
                }
            } else {
                this.method1979((byte) 73);
            }
        }
        ++field4475;
    }

    @OriginalMember(owner = "client!vj", name = "va", descriptor = "()V", line = 4151)
    public final void method258() {
        this.field4595 = this.field4372;
        ++field4289;
        this.field4629 = this.field4387;
        this.field4550 = 0;
        this.field4616 = 0;
        OpenGL.glDisable(3089);
        this.method1966(-2);
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(II)V", line = 4168)
    public final void method1989(int arg0, int arg1) {
        if (arg1 != 1) {
            if (arg1 != 0) {
                if (arg1 == 2) {
                    this.method1951((byte) -128, 34165, 7681);
                } else if (~arg1 != -4) {
                    if (~arg1 == -5) {
                        this.method1951((byte) 115, 34023, 34023);
                    }
                } else {
                    this.method1951((byte) 112, 260, 8448);
                }
            } else {
                this.method1951((byte) 106, 8448, 8448);
            }
        } else {
            this.method1951((byte) -98, 7681, 7681);
        }
        ++field4346;
        if (arg0 != -24145) {
            this.method1964(-54);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lih;I)V", line = 4200)
    public final void method1990(class492 arg0, int arg1) {
        ++field4299;
        class492 var3 = this.field4608[this.field4624];
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field7272);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field7272);
                } else if (~arg0.field7272 != ~var3.field7272) {
                    OpenGL.glDisable(var3.field7272);
                    OpenGL.glEnable(arg0.field7272);
                }
                OpenGL.glBindTexture(arg0.field7272, arg0.method2925(arg1 ^ 2395));
            }
            this.field4608[this.field4624] = arg0;
        }
        if (arg1 != 11864) {
            this.field4518 = 1.0918732F;
        }
        this.field4522 &= -2;
    }

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "(IIIII)V", line = 4245)
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4356;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }
}
