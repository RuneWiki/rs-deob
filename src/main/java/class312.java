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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class class312 extends class689 {

    @OriginalMember(owner = "client!sv", name = "hd", descriptor = "Lrh;")
    private class59 field4329 = new class59();

    @OriginalMember(owner = "client!sv", name = "Xd", descriptor = "Z")
    public boolean field4371 = true;

    @OriginalMember(owner = "client!sv", name = "ae", descriptor = "Lkm;")
    public class492 field4374 = new class492();

    @OriginalMember(owner = "client!sv", name = "de", descriptor = "Lkm;")
    public class492 field4377 = new class492();

    @OriginalMember(owner = "client!sv", name = "ee", descriptor = "Lkm;")
    public class492 field4378 = new class492();

    @OriginalMember(owner = "client!sv", name = "fe", descriptor = "Lkm;")
    public class492 field4379 = new class492();

    @OriginalMember(owner = "client!sv", name = "ge", descriptor = "Lkm;")
    private class492 field4380 = new class492();

    @OriginalMember(owner = "client!sv", name = "he", descriptor = "Lkm;")
    private class492 field4381 = new class492();

    @OriginalMember(owner = "client!sv", name = "me", descriptor = "Z")
    public boolean field4386 = true;

    @OriginalMember(owner = "client!sv", name = "ke", descriptor = "I")
    public int field4384 = 50;

    @OriginalMember(owner = "client!sv", name = "se", descriptor = "I")
    private int field4392 = -1;

    @OriginalMember(owner = "client!sv", name = "pe", descriptor = "I")
    private int field4389 = 16777215;

    @OriginalMember(owner = "client!sv", name = "De", descriptor = "I")
    public int field4403 = 0;

    @OriginalMember(owner = "client!sv", name = "ze", descriptor = "F")
    public float field4399 = -1.0F;

    @OriginalMember(owner = "client!sv", name = "Be", descriptor = "Z")
    private boolean field4401 = false;

    @OriginalMember(owner = "client!sv", name = "ue", descriptor = "I")
    private int field4394 = 0;

    @OriginalMember(owner = "client!sv", name = "je", descriptor = "Ldk;")
    public class488 field4383 = class630.field8568;

    @OriginalMember(owner = "client!sv", name = "ie", descriptor = "I")
    public int field4382 = 512;

    @OriginalMember(owner = "client!sv", name = "He", descriptor = "I")
    private int field4407 = 0;

    @OriginalMember(owner = "client!sv", name = "xe", descriptor = "Z")
    public boolean field4397 = true;

    @OriginalMember(owner = "client!sv", name = "df", descriptor = "F")
    private float field4429 = 3000.0F;

    @OriginalMember(owner = "client!sv", name = "sf", descriptor = "[F")
    public float[] field4443 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sv", name = "ef", descriptor = "I")
    public int field4430 = 0;

    @OriginalMember(owner = "client!sv", name = "We", descriptor = "I")
    public int field4422 = 0;

    @OriginalMember(owner = "client!sv", name = "xf", descriptor = "Z")
    private boolean field4448 = false;

    @OriginalMember(owner = "client!sv", name = "bf", descriptor = "I")
    private int field4427 = -1;

    @OriginalMember(owner = "client!sv", name = "qf", descriptor = "I")
    public int field4441 = -1;

    @OriginalMember(owner = "client!sv", name = "jf", descriptor = "Z")
    private boolean field4434 = false;

    @OriginalMember(owner = "client!sv", name = "Me", descriptor = "[F")
    private float[] field4412 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sv", name = "Ke", descriptor = "I")
    public int field4410 = 512;

    @OriginalMember(owner = "client!sv", name = "pf", descriptor = "[F")
    private float[] field4440 = new float[16];

    @OriginalMember(owner = "client!sv", name = "lf", descriptor = "I")
    public int field4436 = 8;

    @OriginalMember(owner = "client!sv", name = "Ze", descriptor = "I")
    public int field4425 = 0;

    @OriginalMember(owner = "client!sv", name = "Oe", descriptor = "F")
    public float field4414 = 1.0F;

    @OriginalMember(owner = "client!sv", name = "ve", descriptor = "I")
    public int field4395 = 0;

    @OriginalMember(owner = "client!sv", name = "wf", descriptor = "Z")
    public boolean field4447 = true;

    @OriginalMember(owner = "client!sv", name = "Gf", descriptor = "Z")
    public boolean field4457 = false;

    @OriginalMember(owner = "client!sv", name = "gf", descriptor = "F")
    public float field4432 = -1.0F;

    @OriginalMember(owner = "client!sv", name = "Nf", descriptor = "I")
    public int field4464 = 0;

    @OriginalMember(owner = "client!sv", name = "uf", descriptor = "I")
    public int field4445 = 0;

    @OriginalMember(owner = "client!sv", name = "Ne", descriptor = "Z")
    public boolean field4413 = true;

    @OriginalMember(owner = "client!sv", name = "If", descriptor = "[Lqr;")
    private class213[] field4459 = new class213[10];

    @OriginalMember(owner = "client!sv", name = "Ye", descriptor = "I")
    public int field4424 = 3584;

    @OriginalMember(owner = "client!sv", name = "Tf", descriptor = "[F")
    public float[] field4470 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!sv", name = "yf", descriptor = "I")
    private int field4449 = 0;

    @OriginalMember(owner = "client!sv", name = "of", descriptor = "I")
    public int field4439 = -1;

    @OriginalMember(owner = "client!sv", name = "le", descriptor = "F")
    private float field4385 = 1.0F;

    @OriginalMember(owner = "client!sv", name = "kf", descriptor = "I")
    public int field4435 = 0;

    @OriginalMember(owner = "client!sv", name = "Kf", descriptor = "[F")
    private float[] field4461 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sv", name = "Qf", descriptor = "Z")
    public boolean field4467 = false;

    @OriginalMember(owner = "client!sv", name = "cf", descriptor = "F")
    public float field4428 = 3584.0F;

    @OriginalMember(owner = "client!sv", name = "hf", descriptor = "Z")
    public boolean field4433 = true;

    @OriginalMember(owner = "client!sv", name = "Ge", descriptor = "Z")
    private boolean field4406 = false;

    @OriginalMember(owner = "client!sv", name = "Hf", descriptor = "F")
    public float field4458 = 1.0F;

    @OriginalMember(owner = "client!sv", name = "nf", descriptor = "I")
    public int field4438 = 3;

    @OriginalMember(owner = "client!sv", name = "we", descriptor = "I")
    public int field4396 = 0;

    @OriginalMember(owner = "client!sv", name = "Re", descriptor = "[F")
    private float[] field4417 = new float[16];

    @OriginalMember(owner = "client!sv", name = "Yf", descriptor = "F")
    public float field4475 = 1.0F;

    @OriginalMember(owner = "client!sv", name = "Te", descriptor = "F")
    public float field4419 = 1.0F;

    @OriginalMember(owner = "client!sv", name = "Uf", descriptor = "I")
    public int field4471 = -1;

    @OriginalMember(owner = "client!sv", name = "ye", descriptor = "Z")
    private boolean field4398 = false;

    @OriginalMember(owner = "client!sv", name = "vf", descriptor = "I")
    private int field4446 = 0;

    @OriginalMember(owner = "client!sv", name = "zf", descriptor = "I")
    public int field4450 = 0;

    @OriginalMember(owner = "client!sv", name = "Ce", descriptor = "[F")
    private float[] field4402 = new float[16];

    @OriginalMember(owner = "client!sv", name = "fg", descriptor = "[F")
    private float[] field4482 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!sv", name = "rf", descriptor = "Z")
    public boolean field4442 = false;

    @OriginalMember(owner = "client!sv", name = "Ue", descriptor = "[F")
    public float[] field4420 = this.field4482;

    @OriginalMember(owner = "client!sv", name = "gg", descriptor = "Z")
    public boolean field4483 = false;

    @OriginalMember(owner = "client!sv", name = "Xf", descriptor = "Lnc;")
    public class580 field4474 = class301.field4011;

    @OriginalMember(owner = "client!sv", name = "dg", descriptor = "I")
    private int field4480 = 1;

    @OriginalMember(owner = "client!sv", name = "Vf", descriptor = "F")
    public float field4472 = 3584.0F;

    @OriginalMember(owner = "client!sv", name = "Zf", descriptor = "I")
    public int field4476 = 128;

    @OriginalMember(owner = "client!sv", name = "Se", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4418 = new Stream();

    @OriginalMember(owner = "client!sv", name = "yg", descriptor = "Lkm;")
    private class492 field4501 = new class492();

    @OriginalMember(owner = "client!sv", name = "yd", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4346;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4192;

    @OriginalMember(owner = "client!sv", name = "Od", descriptor = "Ljava/lang/Object;")
    public Object field4362;

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field4196;

    @OriginalMember(owner = "client!sv", name = "nb", descriptor = "Lpq;")
    public class159 field4231;

    @OriginalMember(owner = "client!sv", name = "Bf", descriptor = "I")
    public int field4452;

    @OriginalMember(owner = "client!sv", name = "dc", descriptor = "I")
    private int field4273;

    @OriginalMember(owner = "client!sv", name = "xd", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!sv", name = "qb", descriptor = "I")
    private int field4234;

    @OriginalMember(owner = "client!sv", name = "sd", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!sv", name = "Lf", descriptor = "I")
    public int field4462;

    @OriginalMember(owner = "client!sv", name = "Fe", descriptor = "Lfk;")
    private class143 field4405;

    @OriginalMember(owner = "client!sv", name = "rb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field4235;

    @OriginalMember(owner = "client!sv", name = "Rd", descriptor = "Lcb;")
    public static class318 field4365 = new class318(108, 19);

    @OriginalMember(owner = "client!sv", name = "Ud", descriptor = "Lcb;")
    public static class318 field4368 = new class318(116, 6);

    @OriginalMember(owner = "client!sv", name = "Yd", descriptor = "J")
    public static long field4372 = 0L;

    @OriginalMember(owner = "client!sv", name = "be", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4375 = new BigInteger("938f489d6b47d109e5ca8b95355b381ef51a34b800b930da1b134082a3c84bee417b5d0715604da90f013d2a5b3092a8d062956f8b3c457df7d33fb6c38aeac18006f89a79f182ada3f39b278d3714a1bcf5289b432558725ac55edb9a12f47bf390b3721f5eb403f537206694567c7e5dbe8713320e1de852cf53a8fbe0796b4957576342e002e8cd556160bc6d4ae6dea0ebd78812f27a9a117f3605a8ad55704cc48fce3cf4300187fd43057ebfd6c26b3f19fdca1bb149b148349b4c0c609c0988542ab1086a37c9439399727a9046e5b0181f3ee4d2740201fa71c29a338cf97c859aaf1862b6a09d2ac5494ad54de001450ca1eb7627116affc08121b437374f1bbc87c4adeb9f2b78cf27db57d30864f5345195b0c47e4f09de03ba221f32ac65ca11d6bfc5af63be5fc3eba7a4a7684463366d4503e2d720e0eb9b8edd2e6ccd825f090101237fbcc9966288152d072576ad9cefcba92fd4ce85645f454fc5002add0c47e518e58d376f5660dccf4d453275c88af1c442451aac0ecca94d02bcd19745ebb679f7b78b448607da1500356223afe2660fbfd8d81953161dbf7180c1875936b62e048f0c136aae5885d5595bf21dc8715f529d0c9925bc02401745e6cbaebb4da62ac141bb8ff40385a379b508eab5a91642a55f61c64559a6222118b3ed6abf9ce43df2b1f63e5c85b135c34ba8f9320e16ac6e8c1a41", 16);

    @OriginalMember(owner = "client!sv", name = "oe", descriptor = "F")
    private float field4388;

    @OriginalMember(owner = "client!sv", name = "te", descriptor = "F")
    public float field4393;

    @OriginalMember(owner = "client!sv", name = "Pe", descriptor = "F")
    public float field4415;

    @OriginalMember(owner = "client!sv", name = "Af", descriptor = "F")
    public float field4451;

    @OriginalMember(owner = "client!sv", name = "Df", descriptor = "F")
    public float field4454;

    @OriginalMember(owner = "client!sv", name = "Mf", descriptor = "F")
    private float field4463;

    @OriginalMember(owner = "client!sv", name = "Pf", descriptor = "F")
    public float field4466;

    @OriginalMember(owner = "client!sv", name = "Wf", descriptor = "F")
    private float field4473;

    @OriginalMember(owner = "client!sv", name = "bg", descriptor = "F")
    public float field4478;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!sv", name = "S", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!sv", name = "T", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!sv", name = "U", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!sv", name = "V", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!sv", name = "W", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!sv", name = "X", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!sv", name = "Y", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!sv", name = "Z", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!sv", name = "ab", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!sv", name = "bb", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!sv", name = "cb", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!sv", name = "db", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!sv", name = "eb", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!sv", name = "fb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!sv", name = "gb", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!sv", name = "hb", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!sv", name = "ib", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!sv", name = "jb", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!sv", name = "kb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!sv", name = "lb", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!sv", name = "mb", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!sv", name = "ob", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!sv", name = "pb", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!sv", name = "sb", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!sv", name = "tb", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!sv", name = "ub", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!sv", name = "vb", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!sv", name = "wb", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!sv", name = "xb", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!sv", name = "yb", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!sv", name = "zb", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!sv", name = "Ab", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!sv", name = "Bb", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!sv", name = "Cb", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!sv", name = "Db", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!sv", name = "Eb", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!sv", name = "Fb", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!sv", name = "Gb", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!sv", name = "Hb", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!sv", name = "Ib", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!sv", name = "Jb", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!sv", name = "Kb", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!sv", name = "Lb", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!sv", name = "Mb", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!sv", name = "Nb", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!sv", name = "Ob", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!sv", name = "Pb", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!sv", name = "Qb", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!sv", name = "Rb", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!sv", name = "Sb", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!sv", name = "Tb", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!sv", name = "Ub", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!sv", name = "Vb", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!sv", name = "Wb", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!sv", name = "Xb", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!sv", name = "Yb", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!sv", name = "Zb", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!sv", name = "ac", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!sv", name = "bc", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!sv", name = "cc", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!sv", name = "ec", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!sv", name = "fc", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!sv", name = "gc", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!sv", name = "hc", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!sv", name = "ic", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!sv", name = "jc", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!sv", name = "kc", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!sv", name = "lc", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!sv", name = "mc", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!sv", name = "nc", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!sv", name = "oc", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!sv", name = "pc", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!sv", name = "qc", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!sv", name = "rc", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!sv", name = "sc", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!sv", name = "tc", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!sv", name = "uc", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!sv", name = "vc", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!sv", name = "wc", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!sv", name = "xc", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!sv", name = "yc", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!sv", name = "zc", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!sv", name = "Ac", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!sv", name = "Bc", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!sv", name = "Cc", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!sv", name = "Dc", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!sv", name = "Ec", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!sv", name = "Fc", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!sv", name = "Gc", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!sv", name = "Hc", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!sv", name = "Ic", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!sv", name = "Jc", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!sv", name = "Kc", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!sv", name = "Lc", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!sv", name = "Mc", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!sv", name = "Nc", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!sv", name = "Oc", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!sv", name = "Pc", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!sv", name = "Qc", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!sv", name = "Rc", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!sv", name = "Sc", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!sv", name = "Tc", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!sv", name = "Uc", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!sv", name = "Vc", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!sv", name = "Wc", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!sv", name = "Xc", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!sv", name = "Yc", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!sv", name = "Zc", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!sv", name = "ad", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!sv", name = "bd", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!sv", name = "dd", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!sv", name = "ed", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!sv", name = "fd", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!sv", name = "gd", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!sv", name = "id", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!sv", name = "jd", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!sv", name = "ld", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!sv", name = "md", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!sv", name = "nd", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!sv", name = "od", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!sv", name = "pd", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!sv", name = "qd", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!sv", name = "rd", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!sv", name = "td", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!sv", name = "ud", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!sv", name = "vd", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!sv", name = "wd", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!sv", name = "zd", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!sv", name = "Ad", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!sv", name = "Bd", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!sv", name = "Cd", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!sv", name = "Ed", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!sv", name = "Fd", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!sv", name = "Gd", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!sv", name = "Hd", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!sv", name = "Id", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!sv", name = "Jd", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!sv", name = "Kd", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!sv", name = "Ld", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!sv", name = "Md", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!sv", name = "Nd", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!sv", name = "Pd", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!sv", name = "Qd", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!sv", name = "Sd", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!sv", name = "Td", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!sv", name = "Vd", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!sv", name = "Wd", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!sv", name = "Zd", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!sv", name = "ce", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!sv", name = "ne", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!sv", name = "Ae", descriptor = "I")
    private int field4400;

    @OriginalMember(owner = "client!sv", name = "Ee", descriptor = "I")
    private int field4404;

    @OriginalMember(owner = "client!sv", name = "mf", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!sv", name = "Cf", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!sv", name = "Ff", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!sv", name = "Jf", descriptor = "I")
    public int field4460;

    @OriginalMember(owner = "client!sv", name = "Sf", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!sv", name = "ag", descriptor = "I")
    public int field4477;

    @OriginalMember(owner = "client!sv", name = "cg", descriptor = "I")
    public int field4479;

    @OriginalMember(owner = "client!sv", name = "Cg", descriptor = "I")
    private int field4505;

    @OriginalMember(owner = "client!sv", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!sv", name = "Ve", descriptor = "Lqr;")
    private class213 field4421;

    @OriginalMember(owner = "client!sv", name = "re", descriptor = "Lij;")
    private class222 field4391;

    @OriginalMember(owner = "client!sv", name = "eg", descriptor = "Lep;")
    private class275 field4481;

    @OriginalMember(owner = "client!sv", name = "ig", descriptor = "Lvp;")
    private class467 field4485;

    @OriginalMember(owner = "client!sv", name = "ng", descriptor = "Lvp;")
    private class467 field4490;

    @OriginalMember(owner = "client!sv", name = "Dd", descriptor = "Lrba;")
    public class494 field4351;

    @OriginalMember(owner = "client!sv", name = "Ag", descriptor = "Lgo;")
    private class526 field4503;

    @OriginalMember(owner = "client!sv", name = "hg", descriptor = "Lqca;")
    private class547 field4484;

    @OriginalMember(owner = "client!sv", name = "lg", descriptor = "Lqca;")
    public class547 field4488;

    @OriginalMember(owner = "client!sv", name = "mg", descriptor = "Lqca;")
    public class547 field4489;

    @OriginalMember(owner = "client!sv", name = "vg", descriptor = "Lqca;")
    public class547 field4498;

    @OriginalMember(owner = "client!sv", name = "wg", descriptor = "Lqca;")
    private class547 field4499;

    @OriginalMember(owner = "client!sv", name = "zg", descriptor = "Lqca;")
    public class547 field4502;

    @OriginalMember(owner = "client!sv", name = "jg", descriptor = "Lid;")
    public class565 field4486;

    @OriginalMember(owner = "client!sv", name = "kg", descriptor = "Lid;")
    public class565 field4487;

    @OriginalMember(owner = "client!sv", name = "og", descriptor = "Lid;")
    public class565 field4491;

    @OriginalMember(owner = "client!sv", name = "pg", descriptor = "Lid;")
    public class565 field4492;

    @OriginalMember(owner = "client!sv", name = "qg", descriptor = "Lid;")
    public class565 field4493;

    @OriginalMember(owner = "client!sv", name = "rg", descriptor = "Lid;")
    public class565 field4494;

    @OriginalMember(owner = "client!sv", name = "sg", descriptor = "Lid;")
    public class565 field4495;

    @OriginalMember(owner = "client!sv", name = "tg", descriptor = "Lid;")
    public class565 field4496;

    @OriginalMember(owner = "client!sv", name = "ug", descriptor = "Lid;")
    public class565 field4497;

    @OriginalMember(owner = "client!sv", name = "xg", descriptor = "Lid;")
    public class565 field4500;

    @OriginalMember(owner = "client!sv", name = "Ie", descriptor = "Law;")
    public class619 field4408;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4190;

    @OriginalMember(owner = "client!sv", name = "cd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field4324;

    @OriginalMember(owner = "client!sv", name = "kd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4332;

    @OriginalMember(owner = "client!sv", name = "qe", descriptor = "Z")
    public boolean field4390;

    @OriginalMember(owner = "client!sv", name = "Je", descriptor = "Z")
    public boolean field4409;

    @OriginalMember(owner = "client!sv", name = "Xe", descriptor = "Z")
    public boolean field4423;

    @OriginalMember(owner = "client!sv", name = "ff", descriptor = "Z")
    public boolean field4431;

    @OriginalMember(owner = "client!sv", name = "Rf", descriptor = "Z")
    public boolean field4468;

    @OriginalMember(owner = "client!sv", name = "Bg", descriptor = "Z")
    public boolean field4504;

    @OriginalMember(owner = "client!sv", name = "Le", descriptor = "[Lcv;")
    public class264[] field4411;

    @OriginalMember(owner = "client!sv", name = "tf", descriptor = "[Lcv;")
    public class264[] field4444;

    @OriginalMember(owner = "client!sv", name = "Of", descriptor = "[Lhj;")
    public class329[] field4465;

    @OriginalMember(owner = "client!sv", name = "Qe", descriptor = "[Lkm;")
    public class492[] field4416;

    @OriginalMember(owner = "client!sv", name = "Ef", descriptor = "[Lkca;")
    public class537[] field4455;

    @OriginalMember(owner = "client!sv", name = "af", descriptor = "[Law;")
    private class619[] field4426;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
    public abstract void method835(int arg0);

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "(IIII)V")
    public final void method1875(int arg0, int arg1, int arg2, int arg3) {
        this.field4430 = arg1;
        this.field4410 = arg2;
        ++field4258;
        this.field4445 = arg0;
        this.field4382 = arg3;
        this.method1912((byte) -34);
        this.method1909((byte) 51);
        this.method1979(3000);
        this.method1911(6);
    }

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "(I)V")
    public abstract void method828(int arg0);

    @OriginalMember(owner = "client!sv", name = "ya", descriptor = "(IIIII)V")
    public final void method1876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2010(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field4239;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lrf;IIII)Lba;")
    public final class629 method1784(class238 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4194;
        return new class565(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(Li;)V")
    public final void method1877(class173 arg0) {
        ++field4221;
        this.field4190 = ((class323) arg0).field4726;
        this.field4324 = this.field4190.method1534(32768, false);
    }

    @OriginalMember(owner = "client!sv", name = "AA", descriptor = "(IIII)V")
    public final void method1878(int arg0, int arg1, int arg2, int arg3) {
        this.field4404 = arg0;
        ++field4227;
        this.field4471 = arg1;
        this.field4392 = arg2;
        this.field4394 = arg3;
        this.field4431 = true;
        this.method1902(0, 0, false, false, false, 3);
        if (this.field4421 != null) {
            this.field4421.method1326((byte) 82);
        }
        this.method1999(12519);
        this.method800((byte) -46);
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(IIIII)V")
    public final void method1879(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2010(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field4338;
    }

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "()F")
    public final float method1880() {
        ++field4260;
        return this.field4388;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(II)V")
    public final void method1881(int arg0, int arg1) {
        if (arg0 > 119) {
            ++field4278;
            if (~this.field4480 != ~arg1) {
                boolean var3;
                boolean var4;
                class580 var5;
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        var3 = true;
                        var4 = false;
                        var5 = class624.field8481;
                    } else if (arg1 != 128) {
                        var4 = false;
                        var3 = false;
                        var5 = class179.field2230;
                    } else {
                        var3 = true;
                        var5 = class604.field8250;
                        var4 = true;
                    }
                } else {
                    var3 = true;
                    var5 = class301.field4011;
                    var4 = true;
                }
                if (this.field4386 != var4) {
                    this.field4386 = var4;
                    this.method790((byte) 94);
                }
                if (this.field4447 != var3) {
                    this.field4447 = var3;
                    this.method828(-116);
                }
                if (this.field4474 != var5) {
                    this.field4474 = var5;
                    this.method833(false);
                }
                this.field4480 = arg1;
                this.field4400 &= -29;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)V")
    private final void method1882(int arg0) {
        if (!this.field4434) {
            float[] var2 = this.field4440;
            if (~this.field4345 != -1 && this.field4340 != 0) {
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = 1.0F;
                var2[5] = -2.0F / (float) this.field4340;
                var2[2] = 0.0F;
                var2[12] = -1.0F;
                var2[14] = 0.5F;
                var2[0] = 2.0F / (float) this.field4345;
                var2[4] = 0.0F;
                var2[10] = 0.5F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
            } else {
                var2[14] = 0.0F;
                var2[5] = 1.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[6] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
            }
            this.field4434 = true;
        }
        ++field4256;
        if (arg0 != -2) {
            this.field4426 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)V")
    public final void method1883(int arg0, byte arg1) {
        ++field4311;
        if (arg1 < 78) {
            this.field4378 = null;
        }
        if (~this.field4477 != ~arg0) {
            this.field4477 = arg0;
            this.method841(-51);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Law;I)V")
    public final void method1884(class619 arg0, int arg1) {
        if (this.field4426[this.field4425] != arg0) {
            this.field4426[this.field4425] = arg0;
            if (arg0 != null) {
                arg0.method163(9901);
            } else {
                this.method779(71);
            }
            this.field4400 &= -2;
        }
        ++field4251;
        if (arg1 != -2) {
            this.method1901();
        }
    }

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "(I)V")
    public void method857(int arg0) {
        this.field4479 = this.field4469;
        ++field4290;
        this.field4469 = 0;
        if (arg0 != -3136) {
            this.field4405 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "sa", descriptor = "(II)V")
    public final void method1885(int arg0, int arg1) {
        ++field4276;
        if (~this.field4384 != ~arg0 || this.field4424 != arg1) {
            this.field4424 = arg1;
            this.field4384 = arg0;
            this.method1909((byte) 111);
            this.method1912((byte) -115);
            this.method1999(12519);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lnl;Leea;Z)Z")
    public abstract boolean method826(class50 arg0, class680 arg1, boolean arg2);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
    public final void method1886(boolean arg0, int arg1) {
        if (this.field4483 != arg0) {
            this.field4483 = arg0;
            this.method830(arg1 ^ -13494);
        }
        ++field4304;
        if (arg1 != 13512) {
            this.field4491 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lq;)V")
    public final void method1887(class111 arg0) {
        ++field4216;
        this.field4377 = (class492) arg0;
        this.field4379.method597(this.field4377);
        this.field4379.method2765((byte) -18);
        this.field4380.method2769(this.field4379, (byte) 60);
        this.field4378.method2769(this.field4377, (byte) 75);
        if (this.field4383.method2716(-86)) {
            this.method1981(31);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method847(boolean arg0, Canvas arg1);

    @OriginalMember(owner = "client!sv", name = "LA", descriptor = "(IIII)V")
    public final void method1888(int arg0, int arg1, int arg2, int arg3) {
        ++field4294;
        if (!this.field4431) {
            throw new RuntimeException("");
        } else {
            if (~this.field4404 != ~arg0) {
                this.field4404 = arg0;
                if (this.field4421 != null) {
                    this.field4421.method1326((byte) 110);
                }
            }
            this.field4394 = arg3;
            this.field4471 = arg1;
            this.field4392 = arg2;
            this.method1999(12519);
        }
    }

    @OriginalMember(owner = "client!sv", name = "aa", descriptor = "()I")
    public final int method1889() {
        ++field4318;
        return this.field4505;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    private final void method1890(byte arg0) {
        if (arg0 < 17) {
            this.field4491 = null;
        }
        ++field4288;
        this.field4428 = (float) this.field4424 + -this.field4388;
    }

    @OriginalMember(owner = "client!sv", name = "na", descriptor = "(III[I)V")
    public final void method1891(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4229;
        float var5 = this.field4377.method2787(1, (float) arg2, (float) arg0, (float) arg1);
        if (!((float) this.field4384 > var5) && !(var5 > (float) this.field4424)) {
            int var6 = (int) ((float) this.field4410 * this.field4377.method2786(16, (float) arg0, (float) arg2, (float) arg1) / var5);
            int var7 = (int) ((float) this.field4382 * this.field4377.method2766((float) arg0, (float) arg2, (float) arg1, 14) / var5);
            if (this.field4393 <= (float) var6 && this.field4466 >= (float) var6 && this.field4454 <= (float) var7 && this.field4415 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field4393);
                arg3[1] = (int) ((float) var7 - this.field4454);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)Lqr;")
    public class213 method798(int arg0, boolean arg1) {
        ++field4275;
        if (arg1) {
            return null;
        } else if (arg0 != 6) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    return ~arg0 == -8 ? new class320(this) : new class4(this);
                } else {
                    return new class344(this, this.field4351);
                }
            } else {
                return new class386(this);
            }
        } else {
            return new class357(this);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public abstract void method815(Object arg0, byte arg1, Canvas arg2);

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "(I)V")
    public abstract void method816(int arg0);

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "(I)V")
    public abstract void method793(int arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lba;Lob;Lq;Lqn;I)V")
    public final void method1892(class629 arg0, class309 arg1, class111 arg2, class455 arg3, int arg4) {
        arg0.method665(arg2, arg3, arg4);
        ++field4252;
        this.method1961(arg1);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
    public abstract void method790(byte arg0);

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(ZI)V")
    public final void method1893(boolean arg0, int arg1) {
        if (arg1 != -19894) {
            this.method1886(true, 91);
        }
        ++field4341;
        if (this.field4413 != arg0) {
            this.field4413 = arg0;
            this.method800((byte) -46);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIII)Lxa;")
    public final class424 method1894(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4270;
        return new class282(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)V")
    public abstract void method825(byte arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIB)V")
    public static final void method1895(int arg0, int arg1, byte arg2) {
        if (!(class561.field7650 > class561.field7651)) {
            if (class561.field7651 > class561.field7650) {
                class561.field7651 = (float) ((double) class561.field7651 - (double) class561.field7651 / 30.0D);
                if (class561.field7651 < class561.field7650) {
                    class561.field7651 = class561.field7650;
                }
                class511.method2892(-1);
                class561.field7659 = (int) class561.field7651 >> 1;
                class561.field7657 = class244.method1495(true, class561.field7659);
            }
        } else {
            class561.field7651 = (float) ((double) class561.field7651 / 30.0D + (double) class561.field7651);
            if (class561.field7650 < class561.field7651) {
                class561.field7651 = class561.field7650;
            }
            class511.method2892(-1);
            class561.field7659 = (int) class561.field7651 >> 1;
            class561.field7657 = class244.method1495(true, class561.field7659);
        }
        ++field4277;
        if (class92.field1131 != -1 && ~class522.field7230 != 0) {
            int var3 = -class52.field677 + class92.field1131;
            if (var3 < 2 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class351.field5122 + class522.field7230;
            class52.field677 += var3;
            if (~var4 > -3 || ~var4 < -3) {
                var4 /= 8;
            }
            class351.field5122 += var4;
            if (~var3 == -1 && var4 == 0) {
                class92.field1131 = -1;
                class522.field7230 = -1;
            }
            class511.method2892(-1);
        }
        if (arg2 > 59) {
            if (class235.field3067 > 0) {
                --class514.field7002;
                if (~class514.field7002 == -1) {
                    --class235.field3067;
                    class514.field7002 = 100;
                }
            } else {
                class613.field8375 = -1;
                class341.field5013 = -1;
            }
            if (class85.field1040 && class626.field8524 != null) {
                for (class91 var5 = (class91) class626.field8524.method374((byte) 62); var5 != null; var5 = (class91) class626.field8524.method372(-20740)) {
                    class679 var6 = class561.field7649.method218(var5.field1111.field8076, (byte) 13);
                    if (var5.method501((byte) 91, arg1, arg0)) {
                        if (var6.field9650 != null) {
                            if (var6.field9650[4] != null) {
                                class606.method3350(0, (long) var5.field1111.field8076, false, var6.field9630, var6.field9650[4], -1, 1007, var6.field9649, -1, true, false);
                            }
                            if (var6.field9650[3] != null) {
                                class606.method3350(0, (long) var5.field1111.field8076, false, var6.field9630, var6.field9650[3], -1, 1008, var6.field9649, -1, true, false);
                            }
                            if (var6.field9650[2] != null) {
                                class606.method3350(0, (long) var5.field1111.field8076, false, var6.field9630, var6.field9650[2], -1, 1001, var6.field9649, -1, true, false);
                            }
                            if (var6.field9650[1] != null) {
                                class606.method3350(0, (long) var5.field1111.field8076, false, var6.field9630, var6.field9650[1], -1, 1011, var6.field9649, -1, true, false);
                            }
                            if (var6.field9650[0] != null) {
                                class606.method3350(0, (long) var5.field1111.field8076, false, var6.field9630, var6.field9650[0], -1, 1003, var6.field9649, -1, true, false);
                            }
                        }
                        if (!var5.field1111.field8073) {
                            var5.field1111.field8073 = true;
                            class317.method2043(class275.field3733, var5.field1111.field8076, var6.field9630);
                        }
                        if (var5.field1111.field8073) {
                            class317.method2043(class275.field3719, var5.field1111.field8076, var6.field9630);
                        }
                    } else if (var5.field1111.field8073) {
                        var5.field1111.field8073 = false;
                        class317.method2043(class527.field7279, var5.field1111.field8076, var6.field9630);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lkca;B)V")
    public final void method1896(class537 arg0, byte arg1) {
        ++field4215;
        this.field4455[this.field4425] = arg0;
        if (arg1 == -6) {
            this.method1985(124);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1786(Canvas arg0) {
        this.field4196 = null;
        this.field4192 = null;
        ++field4230;
        if (arg0 != null && this.field4346 != arg0) {
            if (this.field4332.containsKey(arg0)) {
                this.field4196 = this.field4332.get(arg0);
                this.field4192 = arg0;
            }
        } else {
            this.field4196 = this.field4362;
            this.field4192 = this.field4346;
        }
        if (this.field4192 != null && this.field4196 != null) {
            this.method855(7472, this.field4192, this.field4196);
            this.method1904((byte) -78);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(Z)V")
    public final void method1897(boolean arg0) {
        ++field4203;
    }

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "(I)V")
    public abstract void method841(int arg0);

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)V")
    private final void method1898(byte arg0) {
        ++field4327;
        this.field4485 = this.method819(false, (byte) -117);
        int var2 = 99 % ((-83 - arg0) / 41);
        this.field4485.method1019(28, 140, -26802);
        for (int var3 = 0; ~var3 > -5; ++var3) {
            Buffer var4 = this.field4485.method1025(true, (byte) 67);
            if (var4 != null) {
                Stream var5 = this.method1920((byte) 120, var4);
                if (Stream.method1519()) {
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(1.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(1.0F);
                    var5.method1530(0.0F);
                    var5.method1530(1.0F);
                    var5.method1530(1.0F);
                    var5.method1530(1.0F);
                    var5.method1530(0.0F);
                    var5.method1530(1.0F);
                    var5.method1530(1.0F);
                    var5.method1530(1.0F);
                    var5.method1530(1.0F);
                    var5.method1530(1.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(1.0F);
                    var5.method1530(0.0F);
                    var5.method1530(1.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                    var5.method1530(0.0F);
                } else {
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(1.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(1.0F);
                    var5.method1520(0.0F);
                    var5.method1520(1.0F);
                    var5.method1520(1.0F);
                    var5.method1520(1.0F);
                    var5.method1520(0.0F);
                    var5.method1520(1.0F);
                    var5.method1520(1.0F);
                    var5.method1520(1.0F);
                    var5.method1520(1.0F);
                    var5.method1520(1.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(1.0F);
                    var5.method1520(0.0F);
                    var5.method1520(1.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                    var5.method1520(0.0F);
                }
                var5.method1523();
                if (this.field4485.method1021(true)) {
                    break;
                }
            }
        }
        this.field4499 = this.method813(new class401[] { new class401(new class102[] { class102.field1241, class102.field1245, class102.field1245 }) }, 95);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method855(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILeea;IILnl;)Lsd;")
    public abstract class595 method804(int arg0, class680 arg1, int arg2, int arg3, class50 arg4);

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "()Z")
    public final boolean method1899() {
        ++field4187;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(Z)V")
    private final void method1900(boolean arg0) {
        ++field4210;
        if (!arg0) {
            this.field4485 = null;
        }
        this.field4434 = false;
        if (class431.field5990 == this.field4383) {
            this.method1882(-2);
            this.method2009(0);
        }
    }

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "()Z")
    public final boolean method1901() {
        ++field4209;
        return this.field4459[3].method22((byte) 75);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIZZZI)V")
    private final void method1902(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4, int arg5) {
        ++field4298;
        if (arg3) {
            this.field4433 = false;
        }
        boolean var7 = arg2 & this.method1901();
        if (!var7 && (~arg5 == -5 || ~arg5 == -9 || ~arg5 == -10)) {
            arg5 = 2;
            arg0 = arg5 == 4 ? arg1 & 1 : 1;
            arg1 = 0;
        }
        if (~arg5 != -1 && arg4) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field4407 != arg5) {
            if (this.field4407 != 0) {
                this.field4459[Integer.MAX_VALUE & this.field4407].method20(62);
            }
            if (arg5 == 0) {
                this.field4421 = null;
            } else {
                this.field4421 = this.field4459[Integer.MAX_VALUE & arg5];
                this.field4421.method17(arg4, 90);
                this.field4421.method23(arg4, -18);
                this.field4421.method28(-16595, arg1, arg0);
            }
            this.field4449 = arg1;
            this.field4407 = arg5;
            this.field4446 = arg0;
        } else if (this.field4407 != 0) {
            this.field4459[this.field4407 & Integer.MAX_VALUE].method23(arg4, -18);
            if (this.field4449 != arg1 || ~this.field4446 != ~arg0) {
                this.field4459[Integer.MAX_VALUE & this.field4407].method28(-16595, arg1, arg0);
                this.field4449 = arg1;
                this.field4446 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "()Z")
    public final boolean method1903() {
        ++field4347;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(B)V")
    private final void method1904(byte arg0) {
        if (this.field4192 != null) {
            Dimension var2 = this.field4192.getSize();
            this.field4234 = var2.height;
            this.field4273 = var2.width;
        } else {
            this.field4273 = this.field4234 = 1;
        }
        ++field4300;
        this.field4340 = this.field4234;
        this.field4345 = this.field4273;
        int var3 = -49 / ((arg0 - 8) / 58);
        this.method1900(true);
        this.method1909((byte) -116);
        this.method1912((byte) 114);
        this.method848((byte) -126);
        this.method1911(6);
        this.method1979(3000);
        this.method1984();
    }

    @OriginalMember(owner = "client!sv", name = "JA", descriptor = "(I)V")
    public final void method1905(int arg0) {
        this.field4438 = 0;
        ++field4232;
        while (arg0 > 1) {
            ++this.field4438;
            arg0 >>= 1;
        }
        this.field4436 = 1 << this.field4438;
    }

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "(I)Lkm;")
    public final class492 method1906(int arg0) {
        if (arg0 != 3) {
            return null;
        } else {
            if (!this.field4401) {
                this.field4381.method2773(this.field4379, this.field4374);
                this.field4401 = true;
            }
            ++field4206;
            return this.field4381;
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1907(Canvas arg0) {
        ++field4312;
        if (this.field4346 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4332.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method847(true, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field4332.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "ca", descriptor = "(IIII)V")
    public final void method1908(int arg0, int arg1, int arg2, int arg3) {
        ++field4240;
        if (~arg0 >= -1 && ~(this.field4345 + -1) >= ~arg2 && ~arg1 >= -1 && ~(this.field4340 + -1) >= ~arg3) {
            this.method1984();
        } else {
            this.field4403 = ~this.field4345 <= ~arg2 ? arg2 : 0;
            this.field4422 = ~arg1 <= -1 ? arg1 : 0;
            this.field4396 = arg0 < 0 ? 0 : arg0;
            this.field4435 = arg3 > this.field4345 ? 0 : arg3;
            if (!this.field4504) {
                this.field4504 = true;
                this.method858((byte) 81);
            }
            this.method853((byte) 118);
            this.method1911(6);
        }
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(B)V")
    private final void method1909(byte arg0) {
        this.field4406 = false;
        ++field4307;
        this.method2022((byte) 58);
        int var2 = 39 % ((arg0 - -11) / 39);
        if (class304.field4085 == this.field4383) {
            this.method2009(0);
        }
    }

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "([I)V")
    public final void method1910(int[] arg0) {
        ++field4222;
        arg0[2] = this.field4403;
        arg0[0] = this.field4396;
        arg0[3] = this.field4435;
        arg0[1] = this.field4422;
    }

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "(I)V")
    public abstract void method830(int arg0);

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "(I)V")
    private final void method1911(int arg0) {
        this.field4454 = (float) (this.field4422 - this.field4430);
        ++field4343;
        this.field4415 = (float) (-this.field4430 + this.field4435);
        if (arg0 != 6) {
            this.field4422 = -61;
        }
        this.field4393 = (float) (-this.field4445 + this.field4396);
        this.field4466 = (float) (-this.field4445 + this.field4403);
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(B)V")
    private final void method1912(byte arg0) {
        this.field4448 = false;
        ++field4243;
        if (class580.field8005 == this.field4383) {
            this.method2017(12);
            this.method2009(0);
        }
        int var2 = -10 % ((arg0 - 61) / 41);
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1790(Canvas arg0) {
        ++field4208;
        Object var2 = null;
        if (arg0 != null && this.field4346 != arg0) {
            if (this.field4332.containsKey(arg0)) {
                var2 = this.field4332.get(arg0);
            }
        } else {
            var2 = this.field4196;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method815(var2, (byte) 31, arg0);
            if (this.field4192 == arg0) {
                this.method1904((byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "(I)V")
    public final void method1913(int arg0) {
        ++field4211;
        int var2 = 91 % ((56 - arg0) / 60);
        Enumeration var3 = this.field4332.keys();
        while (var3.hasMoreElements()) {
            Canvas var4 = (Canvas) var3.nextElement();
            this.method854(this.field4332.get(var4), true, var4);
        }
        this.field4485.method1022((byte) 33);
        this.field4490.method1022((byte) 33);
        this.field4487.method3185((byte) -20);
        this.field4496.method3185((byte) -20);
        this.field4497.method3185((byte) -20);
        this.field4493.method3185((byte) -20);
        this.field4495.method3185((byte) -20);
        this.field4481.method1679(-1);
        this.field4503.method1022((byte) 33);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ltk;IB)V")
    public final void method1914(class73 arg0, int arg1, byte arg2) {
        if (arg2 != 115) {
            this.field4491 = null;
        }
        this.method814(false, -122, arg1, arg0);
        ++field4189;
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(Z)V")
    public final void method1915(boolean arg0) {
        ++field4361;
        this.field4416 = new class492[this.field4460];
        this.field4426 = new class619[this.field4460];
        this.field4411 = new class264[this.field4460];
        this.field4444 = new class264[this.field4460];
        this.field4455 = new class537[this.field4460];
        for (int var2 = 0; ~var2 > ~this.field4460; ++var2) {
            this.field4411[var2] = class594.field8145;
            this.field4444[var2] = class594.field8145;
            this.field4455[var2] = class100.field1221;
            this.field4416[var2] = new class492();
        }
        this.field4465 = new class329[this.field4387 + -2];
        this.field4408 = this.method804(1, class680.field9664, 115, 1, class420.field5862);
        this.method1877(new class323(262144));
        this.field4488 = this.method813(new class401[] { new class401(new class102[] { class102.field1241, class102.field1245 }) }, 114);
        this.field4498 = this.method813(new class401[] { new class401(new class102[] { class102.field1241, class102.field1243 }) }, 37);
        this.field4489 = this.method813(new class401[] { new class401(class102.field1241), new class401(class102.field1243), new class401(class102.field1245), new class401(class102.field1242) }, 77);
        this.field4502 = this.method813(new class401[] { new class401(class102.field1241), new class401(class102.field1243), new class401(class102.field1245) }, 85);
        this.field4494 = new class565(this, 0, 0, false, false);
        this.field4487 = new class565(this, 0, 0, true, true);
        this.field4500 = new class565(this, 0, 0, false, false);
        this.field4496 = new class565(this, 0, 0, true, true);
        this.field4491 = new class565(this, 0, 0, false, false);
        this.field4497 = new class565(this, 0, 0, true, true);
        this.field4492 = new class565(this, 0, 0, false, false);
        this.field4493 = new class565(this, 0, 0, true, true);
        this.field4486 = new class565(this, 0, 0, false, false);
        this.field4495 = new class565(this, 0, 0, true, true);
        this.field4481 = new class275(this);
        this.field4503 = this.method850(true, true);
        this.method1948((byte) -57);
        this.field4351 = new class494(this);
        this.field4459[1] = this.method798(1, arg0);
        this.field4459[2] = this.method798(2, false);
        this.field4459[4] = this.method798(4, arg0);
        this.field4459[5] = this.method798(5, false);
        this.field4459[6] = this.method798(6, false);
        this.field4459[7] = this.method798(7, false);
        this.field4459[3] = this.method798(3, false);
        this.field4459[8] = this.method798(8, arg0);
        this.field4459[9] = this.method798(9, arg0);
        if (!this.field4459[2].method22((byte) 75)) {
            this.field4459[2] = this.method798(0, false);
        }
        if (!this.field4459[4].method22((byte) 75)) {
            this.field4459[4] = this.field4459[2];
        }
        if (!this.field4459[8].method22((byte) 75)) {
            this.field4459[8] = this.field4459[4];
        }
        if (!this.field4459[9].method22((byte) 75)) {
            this.field4459[9] = this.field4459[8];
        }
        this.method795(true);
        this.method1984();
    }

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "(I)V")
    public final void method1916(int arg0) {
        if (arg0 == 2) {
            this.field4374.method600();
            ++field4271;
            this.field4371 = true;
            this.method1935(0);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLcv;Lcv;)V")
    public final void method1917(boolean arg0, class264 arg1, class264 arg2) {
        ++field4301;
        boolean var4 = arg0;
        if (this.field4444[this.field4425] != arg2) {
            this.field4444[this.field4425] = arg2;
            this.method840(true);
            var4 = true;
        }
        if (this.field4411[this.field4425] != arg1) {
            this.field4411[this.field4425] = arg1;
            this.method837(94);
            var4 = true;
        }
        if (var4) {
            this.field4400 &= -30;
        }
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)Li;")
    public final class173 method1918(int arg0) {
        ++field4259;
        class323 var2 = new class323(arg0);
        this.field4329.method378(var2, 31316);
        return var2;
    }

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "(I)V")
    private final void method1919(int arg0) {
        ++field4367;
        this.method809(1, arg0, this.field4490);
        this.method849((byte) 43, this.field4484);
        this.method856(-2, 0, class315.field4530, 1);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method1920(byte arg0, Buffer arg1) {
        if (arg0 <= 83) {
            this.field4439 = 13;
        }
        ++field4344;
        this.field4418.method1521(arg1);
        return this.field4418;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZB)Lvp;")
    public abstract class467 method819(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(IIIII)V")
    public static final void method1921(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4241;
        float var5 = (float) class561.field7667 / (float) class561.field7676;
        int var6 = arg2;
        int var7 = arg3;
        if (!(var5 < 1.0F)) {
            var6 = (int) ((float) arg3 / var5);
        } else {
            var7 = (int) ((float) arg2 * var5);
        }
        int var8 = arg1 - (-var7 + arg3) / 2;
        int var9 = arg4 - (-var6 + arg2) / arg0;
        class522.field7230 = -1;
        class52.field677 = class561.field7676 * var9 / var6;
        class351.field5122 = -(class561.field7667 * var8 / var7) + class561.field7667;
        class92.field1131 = -1;
        class511.method2892(-1);
    }

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "()Lq;")
    public final class111 method1922() {
        ++field4217;
        return new class492();
    }

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "(I)V")
    public abstract void method810(int arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class176 method1787(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4369;
        return new class303(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZZ)Lgo;")
    public abstract class526 method850(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1923(boolean arg0, int arg1, int arg2) {
        ++field4228;
        if (arg2 != 1) {
            this.field4487 = null;
        }
        return this.field4190.method1534(arg1, arg0);
    }

    @OriginalMember(owner = "client!sv", name = "IA", descriptor = "()I")
    public final int method1924() {
        ++field4201;
        return this.field4424;
    }

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "(I)V")
    public final void method1925(int arg0) {
        if (this.field4400 != 2) {
            this.method1944(true);
            this.method2024(false, false);
            this.method1965(false, 0);
            this.method1994(false, false);
            this.method1949(-32, false);
            this.method2018((byte) -103, -2, false, false);
            this.field4400 = 2;
        }
        int var2 = -25 % ((arg0 - -50) / 56);
        ++field4248;
    }

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "(I)V")
    public abstract void method779(int arg0);

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "(IIIIII)V")
    public final void method1926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4291;
        this.method2003((byte) 31);
        this.method1883(arg4, (byte) 87);
        this.method1997(class577.field7974, 0, -97);
        this.method1914(class577.field7974, 0, (byte) 115);
        this.method1881(123, arg5);
        this.field4374.method2772((float) arg3, 1.0F, (byte) 123, (float) arg2);
        this.field4374.method595(arg0, arg1, 0);
        this.method1959(false);
        this.method817((byte) -119, false);
        this.method2021(2);
        this.method817((byte) -61, true);
        this.method1914(class322.field4722, 0, (byte) 115);
        this.method1997(class322.field4722, 0, -124);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1927(int arg0, byte arg1, int arg2) {
        ++field4348;
        return arg1 != -30 ? true : class669.method3712(0, arg2, arg0) & class144.method984(arg0, (byte) 77, arg2);
    }

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "(I)V")
    public final void method1928(int arg0) {
        if (this.field4455[this.field4425] != class100.field1221) {
            this.field4455[this.field4425] = class100.field1221;
            this.field4416[this.field4425].method600();
            this.method1985(80);
        }
        ++field4349;
        if (arg0 != -9396) {
            this.method1792(108, 112, -17, 97, 72, -63, 97, -34, 79, 28);
        }
    }

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "(Z)V")
    public abstract void method852(boolean arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZIILtk;)V")
    public abstract void method814(boolean arg0, int arg1, int arg2, class73 arg3);

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "()V")
    public final void method1929() {
        ++field4218;
        this.field4405.method980(-68);
    }

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "()Z")
    public final boolean method1930() {
        ++field4246;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "(Z)V")
    public abstract void method840(boolean arg0);

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "(I)V")
    public final void method1931(int arg0) {
        if (arg0 > -56) {
            this.method815((Object) null, (byte) 32, (Canvas) null);
        }
        this.method1979(3000);
        ++field4274;
        this.method2009(0);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[BILnl;ZZII)Lsd;")
    public abstract class595 method787(int arg0, byte[] arg1, int arg2, class50 arg3, boolean arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sv", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method1932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4293;
        float var7 = this.field4377.method2787(1, (float) arg2, (float) arg0, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field4377.method2787(1, (float) arg5, (float) arg3, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4384) || !((float) this.field4384 > var8)) && (!((float) this.field4424 < var7) || !((float) this.field4424 < var8))) {
            int var9 = (int) ((float) this.field4410 * this.field4377.method2786(110, (float) arg0, (float) arg2, (float) arg1) / var7);
            int var10 = (int) ((float) this.field4410 * this.field4377.method2786(69, (float) arg3, (float) arg5, (float) arg4) / var8);
            if (this.field4393 > (float) var9 && this.field4393 > (float) var10 || this.field4466 < (float) var9 && this.field4466 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field4382 * this.field4377.method2766((float) arg0, (float) arg2, (float) arg1, 14) / var7);
                int var12 = (int) ((float) this.field4382 * this.field4377.method2766((float) arg3, (float) arg5, (float) arg4, 14) / var8);
                return (!(this.field4454 > (float) var11) || !((float) var12 < this.field4454)) && (!(this.field4415 < (float) var11) || !(this.field4415 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "()Z")
    public final boolean method1933() {
        ++field4302;
        return this.field4468;
    }

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "(I)I")
    public final int method1934(int arg0) {
        ++field4333;
        if (arg0 != 9059) {
            this.method1979(-90);
        }
        return this.field4404;
    }

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "(I)V")
    private final void method1935(int arg0) {
        if (class431.field5990 == this.field4383) {
            float var2 = this.method859(true);
            this.field4374.method2776(var2, -62, var2, 0.0F);
        }
        ++field4223;
        this.field4401 = false;
        this.method810(124);
        if (arg0 == 0) {
            if (this.field4421 != null) {
                this.field4421.method870(8);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "(I)V")
    public final void method1936(int arg0) {
        ++field4250;
        if (~this.field4400 != -5) {
            this.method1944(true);
            this.method2024(false, false);
            this.method1965(false, 0);
            this.method1994(false, false);
            this.method1949(-32, false);
            this.method2018((byte) -90, -2, false, false);
            this.method1881(arg0 + 108, 1);
            this.method1995(0, arg0 + -12);
            this.field4400 = 4;
        }
        if (arg0 != 13) {
            this.method1924();
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILfo;)V")
    private final void method1937(int arg0, int arg1, class417 arg2) {
        ++field4337;
        this.method809(1, 0, this.field4485);
        this.method849((byte) 43, this.field4499);
        this.method856(arg0 ^ -2, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1938(Canvas arg0) {
        ++field4255;
        if (this.field4346 == arg0) {
            throw new RuntimeException();
        } else if (this.field4332.containsKey(arg0)) {
            this.method854(this.field4332.get(arg0), true, arg0);
            this.field4332.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class424 method1939(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4309;
        class282 var6 = new class282(this, arg2, arg3, arg4);
        var6.method68(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIIZII)Lsd;")
    public abstract class595 method844(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIF)Lhj;")
    public final class329 method1940(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4352;
        return new class410(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "(I)V")
    public static void method1941(int arg0) {
        field4365 = null;
        field4368 = null;
        field4375 = null;
        int var1 = 105 % ((69 - arg0) / 50);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZ)V")
    public abstract void method817(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "()Z")
    public final boolean method1942() {
        ++field4360;
        return false;
    }

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "(I)V")
    public abstract void method837(int arg0);

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "(B)V")
    public final void method1943(byte arg0) {
        ++field4285;
        if (arg0 >= -97) {
            this.method1998((class50) null, -113, true, 11, (float[]) null, 57);
        }
        if (this.field4400 != 16) {
            this.method1947(-31769);
            this.method2024(true, false);
            this.method1994(false, true);
            this.method1949(-32, true);
            this.method1881(126, 1);
            this.field4400 = 16;
        }
    }

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "(Z)V")
    private final void method1944(boolean arg0) {
        if (!arg0) {
            this.method2002(123, true);
        }
        ++field4350;
        if (class431.field5990 != this.field4383) {
            class488 var2 = this.field4383;
            this.field4383 = class431.field5990;
            if (var2.method2716(68)) {
                this.method1981(-108);
            }
            this.method1882(-2);
            this.field4420 = this.field4440;
            this.method2009(0);
            this.field4400 &= -25;
        }
    }

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "()Z")
    public final boolean method1945() {
        ++field4207;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(FFFIIIII)[F")
    public static final float[] method1946(float arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4308;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[4] = 1.0F;
        var8[3] = 0.0F;
        var8[6] = -var11;
        var8[5] = 0.0F;
        var8[2] = var11;
        var8[0] = var10;
        var8[7] = 0.0F;
        var8[8] = var10;
        var8[1] = 0.0F;
        float var12 = (float) arg4 + -var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg6 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -var15 + 1.0F;
        float var18 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg5 * arg5));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg3) / var19;
                var16 = (float) arg5 / var19;
            }
            var13[8] = var16 * var16 * var17 + var15;
            var13[6] = var14 * var16 * var17;
            var13[1] = var16 * var18;
            var13[2] = var14 * var16 * var17;
            var13[5] = var14 * var18;
            var13[3] = -var16 * var18;
            var13[4] = var15;
            var13[7] = -var14 * var18;
            var13[0] = var14 * var14 * var17 + var15;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[4] *= arg0;
        var9[3] *= arg0;
        var9[1] *= arg2;
        var9[6] *= arg1;
        var9[8] *= arg1;
        var9[2] *= arg2;
        var9[7] *= arg1;
        var9[5] *= arg0;
        var9[0] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "(I)V")
    private final void method1947(int arg0) {
        if (class580.field8005 != this.field4383) {
            class488 var2 = this.field4383;
            this.field4383 = class580.field8005;
            if (!var2.method2716(69)) {
                this.method1981(-119);
            }
            this.method2017(arg0 + 31781);
            this.field4420 = this.field4402;
            this.method2009(0);
            this.field4400 &= -8;
        }
        ++field4224;
        if (arg0 != -31769) {
            this.method1953();
        }
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "(B)V")
    public final void method1948(byte arg0) {
        ++field4331;
        Hashtable var2 = new Hashtable();
        if (this.field4332 != null && !this.field4332.isEmpty()) {
            Enumeration var3 = this.field4332.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method847(true, var4));
            }
        }
        this.field4332 = var2;
        this.method1898((byte) -128);
        if (arg0 <= -12) {
            this.method1960(12);
            this.field4481.method1675(this, false);
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(IZ)V")
    public final void method1949(int arg0, boolean arg1) {
        ++field4287;
        if (this.field4442 == !arg1) {
            this.field4442 = arg1;
            this.method820(14084);
            this.field4400 &= -32;
        }
        if (arg0 != -32) {
            this.field4429 = 0.38665268F;
        }
    }

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "()I")
    public final int method1950() {
        ++field4237;
        return this.field4376 + this.field4373 + this.field4370;
    }

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "(I)V")
    public abstract void method820(int arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lme;Z)Lxa;")
    public final class424 method1951(class366 arg0, boolean arg1) {
        ++field4272;
        class424 var10;
        if (arg0.field5252 != 0 && arg0.field5253 != 0) {
            int[] var3 = new int[arg0.field5253 * arg0.field5252];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field5255 == null) {
                for (int var6 = 0; var6 < arg0.field5253; ++var6) {
                    for (int var7 = 0; ~arg0.field5252 < ~var7; ++var7) {
                        int var8 = arg0.field5248[arg0.field5256[var4++] & 255];
                        var3[var5++] = ~var8 == -1 ? 0 : class288.method1722(-16777216, var8);
                    }
                }
            } else {
                for (int var9 = 0; ~arg0.field5253 < ~var9; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field5252; ++var11) {
                        var3[var5++] = class288.method1722(arg0.field5255[var4] << 24, arg0.field5248[class230.method1424(arg0.field5256[var4], 255)]);
                        ++var4;
                    }
                }
            }
            var10 = this.method1894(var3, 0, arg0.field5252, arg0.field5252, arg0.field5253);
        } else {
            var10 = this.method1894(new int[1], 0, 1, 1, 1);
        }
        var10.method1155(arg0.field5250, arg0.field5251, arg0.field5254, arg0.field5249);
        return var10;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([Lba;Lob;Lq;[Lqn;I)V")
    public final void method1796(class629[] arg0, class309 arg1, class111 arg2, class455[] arg3, int arg4) {
        ++field4265;
        this.method1799(arg0, arg2, arg3, arg4);
        this.method1961(arg1);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Laq;)V")
    public final void method1952(class108 arg0) {
        ++field4336;
        this.field4391 = (class222) arg0;
    }

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "()V")
    public final void method1953() {
        this.field4431 = false;
        ++field4264;
        this.method1902(0, 0, false, false, false, 0);
        this.method1999(12519);
        this.method800((byte) -46);
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(IIIIII)Laq;")
    public final class108 method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4303;
        return new class127(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BF)V")
    public final void method1955(byte arg0, float arg1) {
        if (this.field4385 != arg1) {
            this.field4385 = arg1;
            this.method1912((byte) -59);
        }
        if (arg0 > 56) {
            ++field4186;
        }
    }

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "(ILfa;II)V")
    public final void method1956(int arg0, class185 arg1, int arg2, int arg3) {
        ++field4342;
        class305 var5 = (class305) arg1;
        class595 var6 = var5.field4100;
        this.method1925(69);
        this.method1884(var6, -2);
        this.method1881(125, 1);
        this.method1917(false, class66.field868, class66.field868);
        this.method1997(class577.field7974, 0, -71);
        this.method1883(arg0, (byte) 100);
        this.field4374.method2772((float) this.field4340, 0.0F, (byte) 123, (float) this.field4345);
        this.method1959(false);
        this.field4416[0].method2772(var6.method170((float) this.field4340, -17968), 1.0F, (byte) 123, var6.method168(31688, (float) this.field4345));
        this.field4416[0].method2776(var6.method168(31688, (float) (-arg2)), -67, var6.method170((float) (-arg3), -17968), 0.0F);
        this.field4455[0] = class248.field3341;
        this.method1985(83);
        this.method2021(2);
        this.method1928(-9396);
        this.method1997(class322.field4722, 0, -105);
    }

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "(B)V")
    public abstract void method853(byte arg0);

    @OriginalMember(owner = "client!sv", name = "ka", descriptor = "(FF)V")
    public final void method1957(float arg0, float arg1) {
        ++field4249;
        if (this.field4429 != arg0 || this.field4388 != arg1) {
            this.field4388 = arg1;
            this.field4429 = arg0;
            this.method1890((byte) 30);
            this.method1963((byte) -74);
            this.method1912((byte) 123);
            this.method1909((byte) 96);
        }
    }

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "(I)V")
    public final void method1958(int arg0) {
        if (arg0 != 20786) {
            this.field4450 = 52;
        }
        ++field4292;
        if (this.field4400 != 8) {
            this.method1967(arg0 ^ -20842);
            this.method2024(true, false);
            this.method1994(false, true);
            this.method1949(-32, true);
            this.method1881(123, 1);
            this.field4400 = 8;
        }
    }

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "(Z)V")
    public final void method1959(boolean arg0) {
        this.field4371 = arg0;
        ++field4257;
        this.method1935(0);
    }

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "(B)V")
    public abstract void method848(byte arg0);

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "(I)V")
    private final void method1960(int arg0) {
        this.field4490 = this.method819(true, (byte) -120);
        ++field4204;
        this.field4490.method1019(arg0, 24, -26802);
        this.field4484 = this.method813(new class401[] { new class401(class102.field1241) }, arg0 ^ 121);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lob;)V")
    public final void method1961(class309 arg0) {
        this.field4481.method1677(0, this, arg0);
        ++field4195;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "()I")
    public final int method1962() {
        ++field4316;
        return this.field4387 + -2;
    }

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "(B)V")
    private final void method1963(byte arg0) {
        if (this.field4388 == 0.0F) {
            this.field4417[14] = this.field4473;
            this.field4417[10] = this.field4463;
        } else {
            float var2 = this.field4429 / (this.field4429 + this.field4388);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field4473 * (-var2 + 1.0F) / this.field4388;
            this.field4417[10] = this.field4463 + var4;
            this.field4417[14] = this.field4473 * var3;
        }
        ++field4213;
        this.field4472 = (this.field4417[14] - (float) this.field4424) / this.field4417[10];
        if (arg0 < -49) {
            ;
        }
    }

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "(Z)V")
    public void method795(boolean arg0) {
        ++field4315;
        this.method2019(arg0);
    }

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "(I)Lvea;")
    public final class64 method1964(int arg0) {
        ++field4266;
        if (arg0 != 2) {
            this.method2020((class598) null, (class366[]) null, true);
        }
        return this.field4391 == null ? null : this.field4391.method765(-102);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILgo;IILfo;I)V")
    public abstract void method818(int arg0, int arg1, class526 arg2, int arg3, int arg4, class417 arg5, int arg6);

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(ZI)V")
    public final void method1965(boolean arg0, int arg1) {
        ++field4325;
        if (!arg0 != !this.field4467) {
            this.field4467 = arg0;
            this.method830(arg1 + -76);
            this.field4400 &= -8;
        }
        if (arg1 != 0) {
            this.field4499 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILll;)V")
    public abstract void method788(int arg0, class114 arg1);

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "(Z)Lkm;")
    public final class492 method1966(boolean arg0) {
        ++field4238;
        if (arg0) {
            this.method1987(72, -88);
        }
        return this.field4379;
    }

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "(I)V")
    private final void method1967(int arg0) {
        if (class304.field4085 != this.field4383) {
            class488 var2 = this.field4383;
            this.field4383 = class304.field4085;
            if (!var2.method2716(-59)) {
                this.method1981(82);
            }
            this.method2022((byte) 58);
            this.field4420 = this.field4417;
            this.method2009(0);
            this.field4400 &= -8;
        }
        if (arg0 >= -84) {
            this.method1987(-56, -119);
        }
        ++field4364;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(ZB)V")
    public final void method1968(boolean arg0, byte arg1) {
        ++field4319;
        this.method1883(arg1 << 8 | arg1 << 24 | arg1 << 16 | arg1, (byte) 87);
        if (arg0) {
            this.method1989();
        }
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(II)V")
    public final void method1969(int arg0, int arg1) {
        ++field4261;
        if (arg1 == -26328) {
            if (this.field4425 != arg0) {
                this.field4425 = arg0;
                this.method852(true);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "(I)V")
    public abstract void method812(int arg0);

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "(IIII)V")
    public final void method1970(int arg0, int arg1, int arg2, int arg3) {
        ++field4188;
        boolean var5 = false;
        if (this.field4396 < arg0) {
            this.field4396 = arg0;
            var5 = true;
        }
        if (~this.field4403 < ~arg2) {
            this.field4403 = arg2;
            var5 = true;
        }
        if (~arg1 < ~this.field4422) {
            var5 = true;
            this.field4422 = arg1;
        }
        if (this.field4435 > arg3) {
            var5 = true;
            this.field4435 = arg3;
        }
        if (var5) {
            if (!this.field4504) {
                this.field4504 = true;
                this.method858((byte) 55);
            }
            this.method853((byte) 118);
            this.method1911(6);
        }
    }

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "(I)I")
    public final int method1971(int arg0) {
        if (arg0 != 5) {
            this.field4378 = null;
        }
        ++field4193;
        return this.field4392;
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "()Lq;")
    public final class111 method1972() {
        ++field4366;
        return this.field4501;
    }

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "()Z")
    public final boolean method1973() {
        ++field4323;
        return false;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Le;Lpq;II)V")
    public class312(Canvas arg0, Object arg1, class479 arg2, class159 arg3, int arg4, int arg5) {
        super(arg2);
        this.field4192 = this.field4346 = arg0;
        this.field4196 = this.field4362 = arg1;
        this.field4231 = arg3;
        this.field4452 = arg4;
        Dimension var7 = arg0.getSize();
        this.field4345 = this.field4273 = var7.width;
        this.field4340 = this.field4234 = var7.height;
        this.field4462 = arg5;
        class397.method2352(true, -89, false);
        this.field4405 = new class143(this, super.field9731);
        this.field4235 = new NativeInterface(super.field9731.method1730(13449), this.field4462);
        for (int var8 = 0; super.field9731.method1730(13449) > var8; ++var8) {
            class568 var9 = super.field9731.method1728(-94, var8);
            if (var9 != null) {
                this.field4235.initTextureMetrics(var8, var9.field7869, var9.field7863);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIZ[IZ)Lsd;")
    public final class595 method1974(int arg0, int arg1, boolean arg2, int[] arg3, boolean arg4) {
        ++field4284;
        return arg2 ? null : this.method844(arg3, arg1, 0, arg0, arg4, 0, 0);
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(IIIIII)V")
    public final void method1975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4282;
        float var7 = this.method859(true);
        this.method2003((byte) -105);
        this.method1883(arg4, (byte) 83);
        this.method1997(class577.field7974, 0, -95);
        this.method1914(class577.field7974, 0, (byte) 115);
        this.method1881(120, arg5);
        this.field4374.method2772((float) (arg3 + -1), 1.0F, (byte) 123, (float) (arg2 + -1));
        this.field4374.method2776((float) arg0 + -var7, -75, (float) arg1 + -var7, 0.0F);
        this.method1959(false);
        this.method817((byte) -92, false);
        this.method1937(0, 4, class321.field4713);
        this.method817((byte) -72, true);
        this.method1914(class322.field4722, 0, (byte) 115);
        this.method1997(class322.field4722, 0, -126);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4289;
    }

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "()Z")
    public final boolean method1976() {
        ++field4254;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(I)V")
    public final void method1797(int arg0) {
        ++field4357;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(FFFBFFF)Z")
    private final boolean method1977(float arg0, float arg1, float arg2, byte arg3, float arg4, float arg5, float arg6) {
        ++field4226;
        Buffer var8 = this.field4490.method1025(true, (byte) 67);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method1920((byte) 90, var8);
            if (arg3 > -72) {
                return true;
            } else {
                if (Stream.method1519()) {
                    var9.method1530(arg5);
                    var9.method1530(arg6);
                    var9.method1530(arg1);
                    var9.method1530(arg2);
                    var9.method1530(arg0);
                    var9.method1530(arg4);
                } else {
                    var9.method1520(arg5);
                    var9.method1520(arg6);
                    var9.method1520(arg1);
                    var9.method1520(arg2);
                    var9.method1520(arg0);
                    var9.method1520(arg4);
                }
                var9.method1523();
                return this.field4490.method1021(true);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "(B)V")
    public abstract void method858(byte arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI[BIZLnl;)Lsd;")
    public final class595 method1978(byte arg0, int arg1, byte[] arg2, int arg3, boolean arg4, class50 arg5) {
        ++field4253;
        if (arg0 != 55) {
            this.method1931(-12);
        }
        return this.method787(arg3, arg2, arg1, arg5, false, arg4, 0, 0);
    }

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "(I)V")
    public final void method1979(int arg0) {
        ++field4363;
        if (arg0 != 3000) {
            this.field4502 = null;
        }
        if (class630.field8568 != this.field4383) {
            class488 var2 = this.field4383;
            this.field4383 = class630.field8568;
            if (var2.method2716(arg0 + -2907)) {
                this.method1981(-107);
            }
            this.field4400 &= -32;
            this.field4420 = this.field4482;
        }
    }

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "(I)I")
    public final int method1980(int arg0) {
        ++field4225;
        return arg0 != 0 ? 118 : this.field4425;
    }

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "(I)V")
    private final void method1981(int arg0) {
        ++field4262;
        this.field4401 = false;
        if (this.field4421 != null) {
            this.field4421.method872((byte) -128);
        }
        this.method831(13081);
        int var2 = -123 % ((-48 - arg0) / 45);
    }

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "(Z)F")
    public abstract float method859(boolean arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class185 method1982(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4313;
        return class311.method1867((byte) -96, arg0, arg1, arg3, arg2, this);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public final void method1983(int arg0) {
        ++field4280;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field4476 = arg0;
            this.field4405.method980(58);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "(B)V")
    public abstract void method786(byte arg0);

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "()V")
    public final void method1984() {
        this.field4435 = this.field4340;
        this.field4403 = this.field4345;
        this.field4396 = 0;
        ++field4320;
        this.field4422 = 0;
        if (this.field4504) {
            this.field4504 = false;
            this.method858((byte) 117);
        }
        this.method1911(6);
    }

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "(I)V")
    private final void method1985(int arg0) {
        if (arg0 > 78) {
            ++field4321;
            this.method846(2);
            if (this.field4421 != null) {
                this.field4421.method871((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([Lba;Lq;[Lqn;I)V")
    public final void method1799(class629[] arg0, class111 arg1, class455[] arg2, int arg3) {
        ++field4355;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method665(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "ha", descriptor = "(F)V")
    public final void method1986(float arg0) {
        ++field4334;
        if (this.field4475 != arg0) {
            this.field4475 = arg0;
            this.field4235.setAmbient(arg0);
            this.method832(5);
            this.method824(1);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)I")
    public final int method1987(int arg0, int arg1) {
        ++field4359;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)V")
    public void method785(int arg0) {
        this.field4405.method976(-118989143);
        ++field4199;
        this.field4453 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
    public final void method1793(int arg0) {
        ++field4268;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "(I)V")
    public abstract void method824(int arg0);

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "()Z")
    public final boolean method1988() {
        ++field4245;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "()Z")
    public final boolean method1989() {
        ++field4200;
        return false;
    }

    @OriginalMember(owner = "client!sv", name = "U", descriptor = "()I")
    public final int method1990() {
        ++field4297;
        return this.field4384;
    }

    @OriginalMember(owner = "client!sv", name = "YA", descriptor = "(IFFFFF)V")
    public final void method1991(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4242;
        boolean var7 = this.field4389 != arg0;
        if (var7 || this.field4399 != arg1 || this.field4432 != arg2) {
            this.field4399 = arg1;
            this.field4432 = arg2;
            this.field4389 = arg0;
            if (var7) {
                this.field4458 = (float) (this.field4389 & 16711680) / 1.671168E7F;
                this.field4419 = (float) (this.field4389 & 255) / 255.0F;
                this.field4414 = (float) (65280 & this.field4389) / 65280.0F;
                this.method832(5);
            }
            this.field4235.setSunColour(this.field4458, this.field4414, this.field4419, arg1, arg2);
            this.method825((byte) 56);
        }
        if (this.field4412[0] != arg3 || this.field4412[1] != arg4 || this.field4412[2] != arg5) {
            this.field4412[0] = arg3;
            this.field4412[2] = arg5;
            this.field4412[1] = arg4;
            this.field4461[2] = -arg5;
            this.field4461[1] = -arg4;
            this.field4461[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4443[1] = arg4 * var8;
            this.field4443[2] = arg5 * var8;
            this.field4443[0] = arg3 * var8;
            this.field4470[0] = -this.field4443[0];
            this.field4470[1] = -this.field4443[1];
            this.field4470[2] = -this.field4443[2];
            this.field4235.setSunDirection(this.field4443[0], this.field4443[1], this.field4443[2]);
            this.method812(8);
            this.field4456 = (int) (arg5 * 256.0F / arg4);
            this.field4437 = (int) (arg3 * 256.0F / arg4);
        }
        this.method824(1);
    }

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "()Z")
    public final boolean method1992() {
        ++field4198;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lnl;ILeea;)Z")
    public abstract boolean method808(class50 arg0, int arg1, class680 arg2);

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "(I)V")
    public abstract void method846(int arg0);

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "(B)Lkm;")
    public final class492 method1993(byte arg0) {
        if (arg0 != -26) {
            this.field4501 = null;
        }
        ++field4286;
        return this.field4416[this.field4425];
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
    public abstract void method854(Object arg0, boolean arg1, Canvas arg2);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLqca;)V")
    public abstract void method849(byte arg0, class547 arg1);

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(ZZ)V")
    public final void method1994(boolean arg0, boolean arg1) {
        if (this.field4457 == !arg1) {
            this.field4457 = arg1;
            this.method793(-86);
            this.field4400 &= -32;
        }
        if (arg0) {
            this.method1951((class366) null, true);
        }
        ++field4335;
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(II)V")
    public abstract void method823(int arg0, int arg1);

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(II)V")
    public final void method1995(int arg0, int arg1) {
        if (~arg0 == -2) {
            this.method1917(false, class66.field868, class66.field868);
        } else if (~arg0 == -1) {
            this.method1917(false, class594.field8145, class594.field8145);
        } else if (arg0 == 2) {
            this.method1917(false, class66.field868, class75.field948);
        } else if (arg0 == 3) {
            this.method1917(false, class594.field8145, class129.field1635);
        } else if (arg0 == 4) {
            this.method1917(false, class517.field7094, class517.field7094);
        }
        ++field4279;
        if (arg1 != 1) {
            this.field4377 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIII)V")
    public final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4310;
    }

    @OriginalMember(owner = "client!sv", name = "S", descriptor = "(I)V")
    public abstract void method831(int arg0);

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "()Z")
    public final boolean method1791() {
        ++field4236;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "(B)[F")
    public final float[] method1996(byte arg0) {
        ++field4339;
        if (arg0 <= 58) {
            this.method1878(-75, -109, -17, 15);
        }
        return this.field4482;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZIILnl;BII[F)Lsd;")
    public abstract class595 method789(boolean arg0, int arg1, int arg2, class50 arg3, byte arg4, int arg5, int arg6, float[] arg7);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ltk;II)V")
    public final void method1997(class73 arg0, int arg1, int arg2) {
        if (arg2 > -57) {
            this.field4448 = false;
        }
        this.method807(false, arg1, false, -21480, arg0);
        ++field4305;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lnl;IZI[FI)Lsd;")
    public final class595 method1998(class50 arg0, int arg1, boolean arg2, int arg3, float[] arg4, int arg5) {
        ++field4326;
        if (arg3 <= 104) {
            this.field4192 = null;
        }
        return this.method789(arg2, 0, 0, arg0, (byte) 106, arg1, arg5, arg4);
    }

    @OriginalMember(owner = "client!sv", name = "T", descriptor = "(I)V")
    private final void method1999(int arg0) {
        ++field4281;
        if (this.field4421 != null) {
            this.field4421.method874(false);
        }
        this.method786((byte) -60);
        if (arg0 != 12519) {
            this.field4457 = false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method2000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class185 arg6, int arg7, int arg8) {
        ++field4330;
    }

    @OriginalMember(owner = "client!sv", name = "X", descriptor = "(III)V")
    public final void method2001(int arg0, int arg1, int arg2) {
        ++field4244;
        if (~this.field4441 != ~arg0 || this.field4439 != arg1 || this.field4395 != arg2) {
            this.field4395 = arg2;
            this.field4439 = arg1;
            this.field4441 = arg0;
            if (this.field4431) {
                return;
            }
            this.method1999(12519);
            this.method800((byte) -46);
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(IZ)V")
    public final void method2002(int arg0, boolean arg1) {
        ++field4191;
        if (arg0 != -1) {
            this.field4499 = null;
        }
        if (!this.field4397 != !arg1) {
            this.field4397 = arg1;
            this.method835(0);
        }
    }

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "(B)V")
    private final void method2003(byte arg0) {
        int var2 = -35 / ((-41 - arg0) / 35);
        ++field4247;
        if (~this.field4400 != -2) {
            this.method1944(true);
            this.method2024(false, false);
            this.method1965(false, 0);
            this.method1994(false, false);
            this.method1949(-32, false);
            this.method2018((byte) -50, -2, false, false);
            this.method1995(1, 1);
            this.method1884(this.field4408, -2);
            this.field4400 = 1;
        }
    }

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "(B)Lkm;")
    public final class492 method2004(byte arg0) {
        ++field4214;
        return arg0 > -2 ? null : this.field4374;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(Z)V")
    public final void method1798(boolean arg0) {
        this.field4433 = arg0;
        ++field4306;
        this.method820(14084);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public final void method1794(int arg0) {
        ++field4233;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIILnl;[BI)Lgp;")
    public abstract class94 method799(int arg0, int arg1, int arg2, class50 arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "()F")
    public final float method2005() {
        ++field4263;
        return this.field4429;
    }

    @OriginalMember(owner = "client!sv", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method2006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4299;
    }

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "()V")
    public void method843() {
        ++field4220;
        if (!this.field4398) {
            for (class28 var1 = this.field4329.method374((byte) 60); var1 != null; var1 = this.field4329.method372(-20740)) {
                ((class323) var1).method2080(127);
            }
            Enumeration var2 = this.field4332.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method854(this.field4332.get(var3), true, var3);
            }
            class238.method1469(-3, false, true);
            this.field4235.release();
            this.field4398 = true;
        }
    }

    @OriginalMember(owner = "client!sv", name = "U", descriptor = "(I)V")
    public abstract void method832(int arg0);

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)I")
    public final int method2007(int arg0, int arg1) {
        ++field4317;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "(Z)V")
    public abstract void method833(boolean arg0);

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "(IIIII)V")
    public final void method2008(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4353;
    }

    @OriginalMember(owner = "client!sv", name = "V", descriptor = "(I)V")
    private final void method2009(int arg0) {
        this.method816(8);
        ++field4269;
        if (this.field4421 != null) {
            this.field4421.method873(-110);
        }
        if (arg0 != 0) {
            this.field4453 = 10;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIII)V")
    public final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4296;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        if (this.method1977((float) arg3 + var10, 0.0F, (float) arg2 + var11, (byte) -122, 0.0F, (float) arg0, (float) arg1)) {
            this.method2003((byte) 67);
            this.method1883(arg4, (byte) 100);
            this.method1997(class577.field7974, 0, -122);
            this.method1914(class577.field7974, 0, (byte) 115);
            this.method1881(126, arg5);
            this.method1916(2);
            this.method817((byte) -113, false);
            this.method1919(0);
            this.method817((byte) -72, true);
            this.method1914(class322.field4722, 0, (byte) 115);
            this.method1997(class322.field4722, 0, -114);
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(IB)Lgo;")
    public final class526 method2011(int arg0, byte arg1) {
        if (arg1 <= 119) {
            this.field4496 = null;
        }
        if (~(arg0 * 2) < ~this.field4503.method1024((byte) 54)) {
            this.field4503.method1446(arg0, 30419);
        }
        ++field4267;
        return this.field4503;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZIZILtk;)V")
    public abstract void method807(boolean arg0, int arg1, boolean arg2, int arg3, class73 arg4);

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "(Z)I")
    public final int method2012(boolean arg0) {
        if (!arg0) {
            this.field4489 = null;
        }
        ++field4358;
        return this.field4394;
    }

    @OriginalMember(owner = "client!sv", name = "W", descriptor = "(I)Lkm;")
    public final class492 method2013(int arg0) {
        ++field4219;
        if (arg0 != 0) {
            this.method848((byte) 15);
        }
        return this.field4416[this.field4425];
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([Loh;I)Lqca;")
    public abstract class547 method813(class401[] arg0, int arg1);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lkm;Z)V")
    public final void method2014(class492 arg0, boolean arg1) {
        ++field4205;
        this.field4374.method597(arg0);
        this.field4371 = arg1;
        this.method1935(0);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z[F)[F")
    public final float[] method2015(boolean arg0, float[] arg1) {
        arg1[4] = this.field4420[1];
        arg1[0] = this.field4420[0];
        arg1[8] = this.field4420[2];
        ++field4314;
        arg1[12] = this.field4420[3];
        arg1[2] = this.field4420[8];
        arg1[1] = this.field4420[4];
        arg1[13] = this.field4420[7];
        arg1[9] = this.field4420[6];
        if (arg0) {
            return null;
        } else {
            arg1[5] = this.field4420[5];
            arg1[7] = this.field4420[13];
            arg1[3] = this.field4420[12];
            arg1[10] = this.field4420[10];
            arg1[14] = this.field4420[11];
            arg1[6] = this.field4420[9];
            arg1[11] = this.field4420[14];
            arg1[15] = this.field4420[15];
            return arg1;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZI[[I)Lvea;")
    public abstract class64 method845(byte arg0, boolean arg1, int arg2, int[][] arg3);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[Lhj;)V")
    public final void method2016(int arg0, class329[] arg1) {
        ++field4197;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field4465[var3] = arg1[var3];
        }
        this.field4469 = arg0;
        if (this.field4383.method2716(-54)) {
            this.method857(-3136);
        }
    }

    @OriginalMember(owner = "client!sv", name = "X", descriptor = "(I)V")
    private final void method2017(int arg0) {
        if (!this.field4448) {
            float[] var2 = this.field4402;
            float var3 = (float) this.field4384 - this.field4388;
            float var4 = (float) this.field4424 - this.field4388;
            float var5 = (float) (-this.field4430) * this.field4385 / (float) this.field4382;
            float var6 = (float) (-this.field4445) * this.field4385 / (float) this.field4410;
            float var7 = (float) (-this.field4445 + this.field4345) * this.field4385 / (float) this.field4410;
            float var8 = (float) (-this.field4430 + this.field4340) * this.field4385 / (float) this.field4382;
            if (var6 != var7 && var5 != var8) {
                var2[5] = 2.0F / (var8 - var5);
                var2[14] = var3 / (var3 - var4);
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F / (-var4 + var3);
                var2[0] = 2.0F / (-var6 + var7);
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
            } else {
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
            }
            this.method1890((byte) 62);
            this.field4448 = true;
        }
        ++field4328;
        if (arg0 != 12) {
            this.field4324 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BIZZ)V")
    public final void method2018(byte arg0, int arg1, boolean arg2, boolean arg3) {
        if (this.field4427 != arg1) {
            if (arg1 < 0) {
                this.method1928(-9396);
                this.method1884((class619) null, -2);
                this.method1995(0, 1);
                if (!this.field4431) {
                    this.method1902(0, 0, arg3, false, arg2, 0);
                }
            } else {
                class595 var5 = this.field4405.method981(false, arg1);
                class568 var6 = super.field9731.method1728(-116, arg1);
                if (var6.field7855 == 0 && var6.field7859 == 0) {
                    this.method1928(-9396);
                } else {
                    int var7 = var6.field7853 ? 64 : 128;
                    int var8 = var7 * 50;
                    class492 var9 = this.method1993((byte) -26);
                    var9.method2775((float) (this.field4453 % var8 * var6.field7855) / (float) var8, -13099, (float) (this.field4453 % var8 * var6.field7859) / (float) var8, 0.0F);
                    this.method1896(class248.field3341, (byte) -6);
                }
                if (!this.field4431) {
                    this.method1902(var6.field7856, var6.field7866, arg3, false, arg2, var6.field7870);
                }
                if (this.field4421 != null) {
                    this.field4421.method19(var6.field7862, 8, var5);
                } else {
                    this.method1884(var5, -2);
                    this.method1995(var6.field7862, 1);
                }
            }
            this.field4427 = arg1;
        }
        ++field4212;
        this.field4400 &= -8;
        int var10 = -81 / ((arg0 - 25) / 60);
    }

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "(Z)V")
    private final void method2019(boolean arg0) {
        ++field4283;
        this.method832(5);
        this.method825((byte) 98);
        this.method830(-93);
        this.method857(-3136);
        this.method812(8);
        this.method824(1);
        this.method835(0);
        this.method793(-75);
        this.method820(14084);
        this.method800((byte) -46);
        this.method786((byte) -60);
        this.method828(-116);
        this.method833(false);
        this.method790((byte) -84);
        for (int var2 = this.field4460 + -1; var2 >= 0; --var2) {
            this.method1969(var2, -26328);
            this.method840(true);
            this.method837(-112);
            this.method1928(-9396);
        }
        this.method841(121);
        this.method848((byte) 85);
        if (!arg0) {
            this.method824(68);
        }
        this.method816(8);
        this.method810(97);
        this.method831(13081);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lil;[Lme;Z)Lta;")
    public final class301 method2020(class598 arg0, class366[] arg1, boolean arg2) {
        ++field4354;
        return new class385(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sv", name = "Y", descriptor = "(I)V")
    public final void method2021(int arg0) {
        this.method1937(0, arg0, class490.field6606);
        ++field4356;
    }

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "(B)V")
    public abstract void method800(byte arg0);

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "(B)V")
    private final void method2022(byte arg0) {
        if (!this.field4406) {
            float[] var2 = this.field4417;
            float var3 = (float) (-this.field4445 * this.field4384) / (float) this.field4410;
            float var4 = (float) ((-this.field4445 + this.field4345) * this.field4384) / (float) this.field4410;
            float var5 = (float) (this.field4430 * this.field4384) / (float) this.field4382;
            float var6 = (float) ((-this.field4340 + this.field4430) * this.field4384) / (float) this.field4382;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field4384 * 2.0F;
                var2[15] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[10] = this.field4463 = (float) this.field4424 / (float) (this.field4384 - this.field4424);
                var2[5] = var7 / (-var6 + var5);
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[14] = this.field4473 = (float) (this.field4424 * this.field4384) / (float) (-this.field4424 + this.field4384);
                var2[2] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[1] = 0.0F;
                var2[11] = -1.0F;
            } else {
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[0] = 1.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.0F;
                var2[4] = 0.0F;
            }
            this.method1963((byte) -97);
            this.field4406 = true;
        }
        if (arg0 != 58) {
            this.method1955((byte) -65, -2.3904161F);
        }
        ++field4295;
    }

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "(Z)Lkm;")
    public final class492 method2023(boolean arg0) {
        if (!arg0) {
            this.method1966(false);
        }
        ++field4322;
        return this.field4380;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(ZZ)V")
    public final void method2024(boolean arg0, boolean arg1) {
        ++field4202;
        if (!this.field4409 != !arg0) {
            this.field4409 = arg0;
            this.method800((byte) -46);
            this.field4400 &= -32;
        }
        if (arg1) {
            this.method2010(58, 44, -68, 123, -95, 53);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILvp;)V")
    public abstract void method809(int arg0, int arg1, class467 arg2);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILfo;I)V")
    public abstract void method856(int arg0, int arg1, class417 arg2, int arg3);
}
