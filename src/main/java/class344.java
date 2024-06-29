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

@OriginalClass("client!mj")
public abstract class class344 extends class564 {

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "Lgk;")
    private class616 field4340 = new class616();

    @OriginalMember(owner = "client!mj", name = "Pd", descriptor = "Z")
    public boolean field4508 = true;

    @OriginalMember(owner = "client!mj", name = "Rd", descriptor = "Lafa;")
    public class537 field4510 = new class537();

    @OriginalMember(owner = "client!mj", name = "Sd", descriptor = "Lafa;")
    public class537 field4511 = new class537();

    @OriginalMember(owner = "client!mj", name = "Td", descriptor = "Lafa;")
    public class537 field4512 = new class537();

    @OriginalMember(owner = "client!mj", name = "Ud", descriptor = "Lafa;")
    public class537 field4513 = new class537();

    @OriginalMember(owner = "client!mj", name = "Vd", descriptor = "Lafa;")
    private class537 field4514 = new class537();

    @OriginalMember(owner = "client!mj", name = "Wd", descriptor = "Lafa;")
    private class537 field4515 = new class537();

    @OriginalMember(owner = "client!mj", name = "ke", descriptor = "Loo;")
    public class41 field4529 = class198.field2350;

    @OriginalMember(owner = "client!mj", name = "oe", descriptor = "I")
    public int field4533 = 50;

    @OriginalMember(owner = "client!mj", name = "fe", descriptor = "Z")
    private boolean field4524 = false;

    @OriginalMember(owner = "client!mj", name = "Ke", descriptor = "I")
    private int field4555 = 0;

    @OriginalMember(owner = "client!mj", name = "se", descriptor = "I")
    public int field4537 = 8;

    @OriginalMember(owner = "client!mj", name = "Be", descriptor = "I")
    private int field4546 = 0;

    @OriginalMember(owner = "client!mj", name = "Se", descriptor = "[F")
    public float[] field4563 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!mj", name = "Ie", descriptor = "Z")
    private boolean field4553 = false;

    @OriginalMember(owner = "client!mj", name = "Yd", descriptor = "[Lnm;")
    private class369[] field4517 = new class369[10];

    @OriginalMember(owner = "client!mj", name = "ne", descriptor = "Z")
    public boolean field4532 = false;

    @OriginalMember(owner = "client!mj", name = "df", descriptor = "Z")
    public boolean field4574 = true;

    @OriginalMember(owner = "client!mj", name = "Ve", descriptor = "I")
    public int field4566 = 0;

    @OriginalMember(owner = "client!mj", name = "Ze", descriptor = "I")
    private int field4570 = 16777215;

    @OriginalMember(owner = "client!mj", name = "Pe", descriptor = "[F")
    private float[] field4560 = new float[16];

    @OriginalMember(owner = "client!mj", name = "ff", descriptor = "I")
    public int field4576 = 0;

    @OriginalMember(owner = "client!mj", name = "nf", descriptor = "Z")
    private boolean field4583 = false;

    @OriginalMember(owner = "client!mj", name = "le", descriptor = "Z")
    public boolean field4530 = true;

    @OriginalMember(owner = "client!mj", name = "qe", descriptor = "Z")
    public boolean field4535 = false;

    @OriginalMember(owner = "client!mj", name = "Je", descriptor = "Z")
    private boolean field4554 = false;

    @OriginalMember(owner = "client!mj", name = "uf", descriptor = "F")
    public float field4590 = 3584.0F;

    @OriginalMember(owner = "client!mj", name = "Ue", descriptor = "I")
    public int field4565 = -1;

    @OriginalMember(owner = "client!mj", name = "kf", descriptor = "F")
    public float field4580 = 3584.0F;

    @OriginalMember(owner = "client!mj", name = "sf", descriptor = "Z")
    public boolean field4588 = true;

    @OriginalMember(owner = "client!mj", name = "wf", descriptor = "Z")
    public boolean field4592 = false;

    @OriginalMember(owner = "client!mj", name = "We", descriptor = "I")
    public int field4567 = 512;

    @OriginalMember(owner = "client!mj", name = "de", descriptor = "F")
    private float field4522 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "bf", descriptor = "F")
    public float field4572 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "xf", descriptor = "F")
    public float field4593 = -1.0F;

    @OriginalMember(owner = "client!mj", name = "lf", descriptor = "[F")
    private float[] field4581 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!mj", name = "He", descriptor = "I")
    private int field4552 = 0;

    @OriginalMember(owner = "client!mj", name = "cf", descriptor = "Z")
    public boolean field4573 = false;

    @OriginalMember(owner = "client!mj", name = "Te", descriptor = "[F")
    private float[] field4564 = new float[16];

    @OriginalMember(owner = "client!mj", name = "vf", descriptor = "[F")
    private float[] field4591 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!mj", name = "re", descriptor = "I")
    public int field4536 = -1;

    @OriginalMember(owner = "client!mj", name = "Cf", descriptor = "Ljd;")
    public class539 field4598 = class376.field5109;

    @OriginalMember(owner = "client!mj", name = "jf", descriptor = "I")
    public int field4579 = 0;

    @OriginalMember(owner = "client!mj", name = "Me", descriptor = "Z")
    private boolean field4557 = false;

    @OriginalMember(owner = "client!mj", name = "he", descriptor = "F")
    public float field4526 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "ue", descriptor = "Z")
    public boolean field4539 = true;

    @OriginalMember(owner = "client!mj", name = "Oe", descriptor = "[F")
    private float[] field4559 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!mj", name = "Ef", descriptor = "I")
    public int field4600 = 0;

    @OriginalMember(owner = "client!mj", name = "tf", descriptor = "F")
    public float field4589 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "zf", descriptor = "I")
    private int field4595 = -1;

    @OriginalMember(owner = "client!mj", name = "yf", descriptor = "I")
    public int field4594 = 3;

    @OriginalMember(owner = "client!mj", name = "De", descriptor = "[F")
    private float[] field4548 = new float[16];

    @OriginalMember(owner = "client!mj", name = "rf", descriptor = "I")
    public int field4587 = 0;

    @OriginalMember(owner = "client!mj", name = "Lf", descriptor = "I")
    public int field4607 = 128;

    @OriginalMember(owner = "client!mj", name = "me", descriptor = "Z")
    public boolean field4531 = true;

    @OriginalMember(owner = "client!mj", name = "ze", descriptor = "I")
    public int field4544 = 0;

    @OriginalMember(owner = "client!mj", name = "Zd", descriptor = "I")
    public int field4518 = 0;

    @OriginalMember(owner = "client!mj", name = "Mf", descriptor = "I")
    private int field4608 = 0;

    @OriginalMember(owner = "client!mj", name = "Af", descriptor = "F")
    public float field4596 = 1.0F;

    @OriginalMember(owner = "client!mj", name = "Jf", descriptor = "I")
    public int field4605 = 0;

    @OriginalMember(owner = "client!mj", name = "Re", descriptor = "[F")
    public float[] field4562 = this.field4559;

    @OriginalMember(owner = "client!mj", name = "ie", descriptor = "Z")
    private boolean field4527 = false;

    @OriginalMember(owner = "client!mj", name = "Bf", descriptor = "I")
    private int field4597 = -1;

    @OriginalMember(owner = "client!mj", name = "gf", descriptor = "I")
    public int field4577 = 0;

    @OriginalMember(owner = "client!mj", name = "we", descriptor = "[F")
    public float[] field4541 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!mj", name = "Pf", descriptor = "I")
    private int field4611 = 1;

    @OriginalMember(owner = "client!mj", name = "Ae", descriptor = "I")
    private int field4545 = -1;

    @OriginalMember(owner = "client!mj", name = "Gf", descriptor = "F")
    public float field4602 = -1.0F;

    @OriginalMember(owner = "client!mj", name = "Df", descriptor = "I")
    public int field4599 = 3584;

    @OriginalMember(owner = "client!mj", name = "Sf", descriptor = "I")
    public int field4614 = 512;

    @OriginalMember(owner = "client!mj", name = "Tf", descriptor = "I")
    public int field4615 = 0;

    @OriginalMember(owner = "client!mj", name = "Ff", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4601 = new Stream();

    @OriginalMember(owner = "client!mj", name = "ag", descriptor = "Lafa;")
    private class537 field4622 = new class537();

    @OriginalMember(owner = "client!mj", name = "Fd", descriptor = "Ljava/lang/Object;")
    public Object field4498;

    @OriginalMember(owner = "client!mj", name = "cc", descriptor = "Ljava/lang/Object;")
    private Object field4417;

    @OriginalMember(owner = "client!mj", name = "rb", descriptor = "Ltf;")
    public class701 field4380;

    @OriginalMember(owner = "client!mj", name = "Qe", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!mj", name = "Uc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4461;

    @OriginalMember(owner = "client!mj", name = "pd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4482;

    @OriginalMember(owner = "client!mj", name = "ud", descriptor = "I")
    private int field4487;

    @OriginalMember(owner = "client!mj", name = "Rc", descriptor = "I")
    public int field4458;

    @OriginalMember(owner = "client!mj", name = "sb", descriptor = "I")
    private int field4381;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!mj", name = "ae", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!mj", name = "Xd", descriptor = "Lje;")
    private class267 field4516;

    @OriginalMember(owner = "client!mj", name = "bd", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field4468;

    @OriginalMember(owner = "client!mj", name = "ee", descriptor = "F")
    public float field4523;

    @OriginalMember(owner = "client!mj", name = "je", descriptor = "F")
    public float field4528;

    @OriginalMember(owner = "client!mj", name = "pe", descriptor = "F")
    public float field4534;

    @OriginalMember(owner = "client!mj", name = "ve", descriptor = "F")
    public float field4540;

    @OriginalMember(owner = "client!mj", name = "ye", descriptor = "F")
    private float field4543;

    @OriginalMember(owner = "client!mj", name = "Ee", descriptor = "F")
    public float field4549;

    @OriginalMember(owner = "client!mj", name = "Fe", descriptor = "F")
    public float field4550;

    @OriginalMember(owner = "client!mj", name = "Of", descriptor = "F")
    private float field4610;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!mj", name = "kb", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!mj", name = "lb", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!mj", name = "mb", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!mj", name = "nb", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!mj", name = "ob", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!mj", name = "pb", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!mj", name = "qb", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!mj", name = "tb", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!mj", name = "ub", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!mj", name = "vb", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!mj", name = "wb", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!mj", name = "xb", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!mj", name = "yb", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!mj", name = "zb", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!mj", name = "Ab", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!mj", name = "Bb", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!mj", name = "Cb", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!mj", name = "Db", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!mj", name = "Eb", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!mj", name = "Fb", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!mj", name = "Gb", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!mj", name = "Hb", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!mj", name = "Ib", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!mj", name = "Jb", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!mj", name = "Kb", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!mj", name = "Lb", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!mj", name = "Mb", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!mj", name = "Nb", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!mj", name = "Ob", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!mj", name = "Pb", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!mj", name = "Qb", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!mj", name = "Rb", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!mj", name = "Ub", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!mj", name = "Vb", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!mj", name = "Wb", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!mj", name = "Xb", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!mj", name = "Zb", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!mj", name = "ac", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!mj", name = "bc", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!mj", name = "dc", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!mj", name = "ec", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!mj", name = "fc", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!mj", name = "gc", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!mj", name = "hc", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!mj", name = "ic", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!mj", name = "jc", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!mj", name = "kc", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!mj", name = "lc", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!mj", name = "mc", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!mj", name = "nc", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!mj", name = "oc", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!mj", name = "pc", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!mj", name = "qc", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!mj", name = "rc", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!mj", name = "sc", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!mj", name = "tc", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!mj", name = "uc", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!mj", name = "vc", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!mj", name = "wc", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!mj", name = "xc", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!mj", name = "yc", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!mj", name = "zc", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!mj", name = "Ac", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!mj", name = "Bc", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!mj", name = "Cc", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!mj", name = "Dc", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!mj", name = "Ec", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!mj", name = "Fc", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!mj", name = "Gc", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!mj", name = "Hc", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!mj", name = "Ic", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!mj", name = "Jc", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!mj", name = "Kc", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!mj", name = "Lc", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!mj", name = "Mc", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!mj", name = "Nc", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!mj", name = "Oc", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!mj", name = "Pc", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!mj", name = "Qc", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!mj", name = "Sc", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!mj", name = "Tc", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!mj", name = "Vc", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!mj", name = "Wc", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!mj", name = "Xc", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!mj", name = "Yc", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!mj", name = "Zc", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!mj", name = "ad", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!mj", name = "cd", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!mj", name = "dd", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!mj", name = "ed", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!mj", name = "fd", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!mj", name = "gd", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!mj", name = "hd", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!mj", name = "id", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!mj", name = "jd", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!mj", name = "kd", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!mj", name = "ld", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!mj", name = "md", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!mj", name = "nd", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!mj", name = "od", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!mj", name = "qd", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!mj", name = "rd", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!mj", name = "sd", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!mj", name = "td", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!mj", name = "vd", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!mj", name = "wd", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!mj", name = "xd", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!mj", name = "yd", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!mj", name = "zd", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!mj", name = "Ad", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!mj", name = "Bd", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!mj", name = "Cd", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!mj", name = "Dd", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!mj", name = "Ed", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!mj", name = "Gd", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!mj", name = "Hd", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!mj", name = "Id", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!mj", name = "Jd", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!mj", name = "Kd", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!mj", name = "Ld", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!mj", name = "Md", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!mj", name = "Nd", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!mj", name = "Od", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!mj", name = "Qd", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!mj", name = "ge", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!mj", name = "xe", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!mj", name = "Ge", descriptor = "I")
    private int field4551;

    @OriginalMember(owner = "client!mj", name = "Xe", descriptor = "I")
    public int field4568;

    @OriginalMember(owner = "client!mj", name = "af", descriptor = "I")
    public int field4571;

    @OriginalMember(owner = "client!mj", name = "pf", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!mj", name = "Hf", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!mj", name = "Nf", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!mj", name = "Qf", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!mj", name = "Uf", descriptor = "I")
    private int field4616;

    @OriginalMember(owner = "client!mj", name = "qg", descriptor = "I")
    private int field4638;

    @OriginalMember(owner = "client!mj", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!mj", name = "Yf", descriptor = "Lsu;")
    private class155 field4620;

    @OriginalMember(owner = "client!mj", name = "fg", descriptor = "Lsu;")
    private class155 field4627;

    @OriginalMember(owner = "client!mj", name = "og", descriptor = "Lmda;")
    private class17 field4636;

    @OriginalMember(owner = "client!mj", name = "dg", descriptor = "Lada;")
    public class278 field4625;

    @OriginalMember(owner = "client!mj", name = "eg", descriptor = "Lada;")
    private class278 field4626;

    @OriginalMember(owner = "client!mj", name = "gg", descriptor = "Lada;")
    public class278 field4628;

    @OriginalMember(owner = "client!mj", name = "lg", descriptor = "Lada;")
    public class278 field4633;

    @OriginalMember(owner = "client!mj", name = "mg", descriptor = "Lada;")
    private class278 field4634;

    @OriginalMember(owner = "client!mj", name = "ng", descriptor = "Lada;")
    public class278 field4635;

    @OriginalMember(owner = "client!mj", name = "Vf", descriptor = "Ld;")
    public class330 field4617;

    @OriginalMember(owner = "client!mj", name = "Wf", descriptor = "Ld;")
    public class330 field4618;

    @OriginalMember(owner = "client!mj", name = "Xf", descriptor = "Ld;")
    public class330 field4619;

    @OriginalMember(owner = "client!mj", name = "Zf", descriptor = "Ld;")
    public class330 field4621;

    @OriginalMember(owner = "client!mj", name = "bg", descriptor = "Ld;")
    public class330 field4623;

    @OriginalMember(owner = "client!mj", name = "cg", descriptor = "Ld;")
    public class330 field4624;

    @OriginalMember(owner = "client!mj", name = "hg", descriptor = "Ld;")
    public class330 field4629;

    @OriginalMember(owner = "client!mj", name = "ig", descriptor = "Ld;")
    public class330 field4630;

    @OriginalMember(owner = "client!mj", name = "jg", descriptor = "Ld;")
    public class330 field4631;

    @OriginalMember(owner = "client!mj", name = "kg", descriptor = "Ld;")
    public class330 field4632;

    @OriginalMember(owner = "client!mj", name = "Yb", descriptor = "Ltt;")
    public class341 field4413;

    @OriginalMember(owner = "client!mj", name = "of", descriptor = "Lnm;")
    private class369 field4584;

    @OriginalMember(owner = "client!mj", name = "If", descriptor = "Lgp;")
    private class611 field4604;

    @OriginalMember(owner = "client!mj", name = "hf", descriptor = "Laga;")
    private class660 field4578;

    @OriginalMember(owner = "client!mj", name = "mf", descriptor = "Llc;")
    public class686 field4582;

    @OriginalMember(owner = "client!mj", name = "Sb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4407;

    @OriginalMember(owner = "client!mj", name = "Tb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field4408;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4369;

    @OriginalMember(owner = "client!mj", name = "be", descriptor = "Z")
    public boolean field4520;

    @OriginalMember(owner = "client!mj", name = "ce", descriptor = "Z")
    public boolean field4521;

    @OriginalMember(owner = "client!mj", name = "Ne", descriptor = "Z")
    public boolean field4558;

    @OriginalMember(owner = "client!mj", name = "ef", descriptor = "Z")
    public boolean field4575;

    @OriginalMember(owner = "client!mj", name = "Rf", descriptor = "Z")
    public boolean field4613;

    @OriginalMember(owner = "client!mj", name = "pg", descriptor = "Z")
    public boolean field4637;

    @OriginalMember(owner = "client!mj", name = "Le", descriptor = "[Lsea;")
    public class319[] field4556;

    @OriginalMember(owner = "client!mj", name = "Ye", descriptor = "[Lsea;")
    public class319[] field4569;

    @OriginalMember(owner = "client!mj", name = "te", descriptor = "[Lafa;")
    public class537[] field4538;

    @OriginalMember(owner = "client!mj", name = "Kf", descriptor = "[Leq;")
    public class670[] field4606;

    @OriginalMember(owner = "client!mj", name = "qf", descriptor = "[Llc;")
    private class686[] field4586;

    @OriginalMember(owner = "client!mj", name = "Ce", descriptor = "[Lnd;")
    public class689[] field4547;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public final void method1978(byte arg0) {
        ++field4377;
        if (~this.field4551 != -5) {
            this.method2054(18179);
            this.method2027(false, false);
            this.method1984(false, (byte) -38);
            this.method2001(false, (byte) 119);
            this.method2029(7, false);
            this.method2008(false, 59, -2, false);
            this.method2051(1, (byte) -89);
            this.method2004(0, 2);
            this.field4551 = 4;
        }
        if (arg0 <= 66) {
            this.method1990(-40);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILgb;B)V")
    public final void method1979(int arg0, class163 arg1, byte arg2) {
        this.method1305(arg1, 14604, arg0, false);
        ++field4366;
        if (arg2 > -6) {
            this.field4408 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method1980(byte arg0, Buffer arg1) {
        this.field4601.method3466(arg1);
        ++field4437;
        if (arg0 != -74) {
            this.field4538 = null;
        }
        return this.field4601;
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)V")
    public final void method1981(int arg0) {
        if (arg0 >= -69) {
            this.field4517 = null;
        }
        ++field4404;
        this.method2026(class25.field218, 0, 2);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    private final void method1982(byte arg0) {
        this.field4583 = false;
        ++field4355;
        this.method2055(15);
        if (arg0 != 65) {
            this.method2023(-112);
        }
        if (class300.field3732 == this.field4529) {
            this.method1985(22316);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()I")
    public final int method981() {
        ++field4441;
        return this.field4507 - -this.field4502 - -this.field4505;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZBII[I)Lpm;")
    public final class134 method1983(boolean arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        if (arg1 < 71) {
            return null;
        } else {
            ++field4475;
            return this.method1300((byte) 80, arg0, 0, arg2, arg3, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZB)V")
    public final void method1984(boolean arg0, byte arg1) {
        if (arg1 < -16) {
            if (this.field4573 != arg0) {
                this.field4573 = arg0;
                this.method1322(6);
                this.field4551 &= -8;
            }
            ++field4489;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)V")
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4504;
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(I)V")
    public abstract void method1306(int arg0);

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)V")
    private final void method1985(int arg0) {
        this.method1336(true);
        if (arg0 != 22316) {
            this.method1319(71, 39, 37, (class179) null, (class485) null);
        }
        ++field4373;
        if (this.field4584 != null) {
            this.field4584.method6((byte) 76);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZ)Lf;")
    public final class534 method1025(int arg0, int arg1, boolean arg2) {
        ++field4400;
        return new class470(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "(IIII)V")
    public final void method941(int arg0, int arg1, int arg2, int arg3) {
        ++field4492;
        boolean var5 = false;
        if (~this.field4576 > ~arg0) {
            this.field4576 = arg0;
            var5 = true;
        }
        if (~arg2 > ~this.field4615) {
            var5 = true;
            this.field4615 = arg2;
        }
        if (arg1 > this.field4577) {
            var5 = true;
            this.field4577 = arg1;
        }
        if (~arg3 > ~this.field4605) {
            var5 = true;
            this.field4605 = arg3;
        }
        if (var5) {
            if (!this.field4637) {
                this.field4637 = true;
                this.method1318((byte) 98);
            }
            this.method1315(-12002);
            this.method2023(111);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILsq;IZII[F)Lpm;")
    public abstract class134 method1295(int arg0, int arg1, class485 arg2, int arg3, boolean arg4, int arg5, int arg6, float[] arg7);

    @OriginalMember(owner = "client!mj", name = "pa", descriptor = "(III)V")
    public final void method937(int arg0, int arg1, int arg2) {
        ++field4445;
        if (~this.field4565 != ~arg0 || this.field4536 != arg1 || ~this.field4566 != ~arg2) {
            this.field4565 = arg0;
            this.field4566 = arg2;
            this.field4536 = arg1;
            this.method2028((byte) -98);
            this.method1309((byte) 36);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZ)V")
    public final void method1986(byte arg0, boolean arg1) {
        ++field4484;
        if (arg1) {
            this.method1988(arg0 | arg0 << 24 | arg0 << 16 | arg0 << 8, 4);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lsu;II)V")
    public abstract void method1281(class155 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V")
    private final void method1987(int arg0) {
        ++field4438;
        this.field4548[10] = this.field4610;
        this.field4548[14] = this.field4543;
        this.field4590 = (this.field4548[14] + (float) (-this.field4599)) / this.field4548[arg0];
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V")
    public final void method1988(int arg0, int arg1) {
        ++field4451;
        if (arg1 == 4) {
            if (this.field4525 != arg0) {
                this.field4525 = arg0;
                this.method1293(arg1 ^ -25970);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lho;[Lqo;Z)Lla;")
    public final class413 method998(class463 arg0, class550[] arg1, boolean arg2) {
        ++field4351;
        return new class57(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "(I)V")
    public abstract void method1320(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([IIIII)Lf;")
    public final class534 method1017(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4477;
        return new class470(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public final void method1018(int arg0) {
        ++field4389;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)Lmda;")
    public final class17 method1989(int arg0, int arg1) {
        ++field4348;
        if (this.field4636.method197(-14) < arg0 * 2) {
            this.field4636.method73(arg0, (byte) -55);
        }
        if (arg1 < 90) {
            this.field4575 = false;
        }
        return this.field4636;
    }

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "(I)I")
    public final int method1990(int arg0) {
        ++field4494;
        if (arg0 != 0) {
            this.method1019(-59, 116, -79, (int[]) null);
        }
        return this.field4595;
    }

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "(I)[F")
    public final float[] method1991(int arg0) {
        ++field4429;
        return arg0 != 1 ? null : this.field4559;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    private final void method1992(byte arg0) {
        if (this.field4482 != null) {
            Dimension var2 = this.field4482.getSize();
            this.field4487 = var2.height;
            this.field4381 = var2.width;
        } else {
            this.field4381 = this.field4487 = 1;
        }
        ++field4426;
        this.field4458 = this.field4487;
        this.field4332 = this.field4381;
        this.method2002((byte) -124);
        this.method2056(-14028);
        this.method1982((byte) 65);
        this.method1292(false);
        this.method2023(119);
        if (arg0 != -109) {
            this.field4558 = false;
        }
        this.method2019((byte) -126);
        this.method1050();
    }

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "(IIIIII)V")
    public final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2005((byte) -104);
        ++field4371;
        this.method1988(arg4, 4);
        this.method2012((byte) -113, 0, class107.field1154);
        this.method1979(0, class107.field1154, (byte) -66);
        this.method2051(arg5, (byte) 125);
        this.field4510.method3030((float) arg2, (byte) -51, (float) arg3, 1.0F);
        this.field4510.method30(arg0, arg1, 0);
        this.method2033((byte) 101);
        this.method1278(false, (byte) -109);
        this.method1981(-107);
        this.method1278(true, (byte) -109);
        this.method1979(0, class304.field3769, (byte) -102);
        this.method2012((byte) -93, 0, class304.field3769);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZB)V")
    public abstract void method1278(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lal;B)V")
    public abstract void method1335(class307 arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "VA", descriptor = "(IFFFFF)V")
    public final void method1032(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4453;
        boolean var7 = ~this.field4570 != ~arg0;
        if (var7 || this.field4602 != arg1 || this.field4593 != arg2) {
            this.field4570 = arg0;
            this.field4602 = arg1;
            this.field4593 = arg2;
            if (var7) {
                this.field4526 = (float) (65280 & this.field4570) / 65280.0F;
                this.field4572 = (float) (this.field4570 & 255) / 255.0F;
                this.field4589 = (float) (this.field4570 & 16711680) / 1.671168E7F;
                this.method1320(9415);
            }
            this.field4468.setSunColour(this.field4589, this.field4526, this.field4572, arg1, arg2);
            this.method1331(-107);
        }
        if (this.field4591[0] != arg3 || this.field4591[1] != arg4 || this.field4591[2] != arg5) {
            this.field4591[1] = arg4;
            this.field4591[2] = arg5;
            this.field4591[0] = arg3;
            this.field4581[1] = -arg4;
            this.field4581[0] = -arg3;
            this.field4581[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4563[2] = arg5 * var8;
            this.field4563[1] = arg4 * var8;
            this.field4563[0] = arg3 * var8;
            this.field4541[2] = -this.field4563[2];
            this.field4541[0] = -this.field4563[0];
            this.field4541[1] = -this.field4563[1];
            this.field4468.setSunDirection(this.field4563[0], this.field4563[1], this.field4563[2]);
            this.method1301(true);
            this.field4568 = (int) (arg3 * 256.0F / arg4);
            this.field4609 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1284(-76);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1993(boolean arg0, int arg1, int arg2) {
        int var4 = 113 % ((-17 - arg1) / 59);
        ++field4446;
        return this.field4407.method3462(arg2, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method1006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4422;
        float var7 = this.field4511.method3031(-92, (float) arg0, (float) arg2, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field4511.method3031(-89, (float) arg3, (float) arg5, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field4533 > var7) || !((float) this.field4533 > var8)) && (!((float) this.field4599 < var7) || !(var8 > (float) this.field4599))) {
            int var9 = (int) ((float) this.field4567 * this.field4511.method3014((float) arg0, (float) arg2, 0, (float) arg1) / var7);
            int var10 = (int) ((float) this.field4567 * this.field4511.method3014((float) arg3, (float) arg5, 0, (float) arg4) / var8);
            if (this.field4528 > (float) var9 && this.field4528 > (float) var10 || this.field4534 < (float) var9 && this.field4534 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field4614 * this.field4511.method3011((float) arg2, 0, (float) arg1, (float) arg0) / var7);
                int var12 = (int) ((float) this.field4614 * this.field4511.method3011((float) arg5, 0, (float) arg4, (float) arg3) / var8);
                return (!((float) var11 < this.field4523) || !(this.field4523 > (float) var12)) && (!(this.field4540 < (float) var11) || !((float) var12 > this.field4540));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILsea;Lsea;)V")
    public final void method1994(int arg0, class319 arg1, class319 arg2) {
        ++field4397;
        boolean var4 = false;
        if (arg0 != -30) {
            this.field4510 = null;
        }
        if (this.field4556[this.field4579] != arg2) {
            this.field4556[this.field4579] = arg2;
            var4 = true;
            this.method1323((byte) -70);
        }
        if (this.field4569[this.field4579] != arg1) {
            this.field4569[this.field4579] = arg1;
            var4 = true;
            this.method1299(-108);
        }
        if (var4) {
            this.field4551 &= -30;
        }
    }

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "(I)F")
    public abstract float method1288(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lgb;IIZ)V")
    public abstract void method1305(class163 arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    private final void method1995(byte arg0) {
        this.method1320(9415);
        ++field4386;
        this.method1331(-77);
        this.method1322(6);
        this.method1307(122);
        this.method1301(true);
        this.method1284(-92);
        this.method1317(false);
        this.method1306(0);
        this.method1311((byte) 8);
        this.method1309((byte) 67);
        this.method1296(false);
        this.method1297(-7);
        this.method1330(-108);
        this.method1332(true);
        if (arg0 > -87) {
            this.field4498 = null;
        }
        for (int var2 = this.field4612 + -1; var2 >= 0; --var2) {
            this.method2015(var2, -2);
            this.method1323((byte) -70);
            this.method1299(-100);
            this.method2010(111);
        }
        this.method1293(-25974);
        this.method1292(false);
        this.method1336(true);
        this.method1310(4924);
        this.method1308((byte) 117);
    }

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "(I)V")
    public final void method1996(int arg0) {
        ++field4382;
        Hashtable var2 = new Hashtable();
        if (this.field4369 != null && !this.field4369.isEmpty()) {
            Enumeration var3 = this.field4369.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1298(var4, (byte) -95));
            }
        }
        this.field4369 = var2;
        this.method2000((byte) 101);
        this.method2006((byte) 107);
        this.field4604.method3409(-16645, this);
        if (arg0 != -3953) {
            this.field4589 = -0.24094117F;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILlc;)V")
    public final void method1997(int arg0, class686 arg1) {
        ++field4488;
        if (arg0 <= 125) {
            this.method2019((byte) -87);
        }
        if (this.field4586[this.field4579] != arg1) {
            this.field4586[this.field4579] = arg1;
            if (arg1 != null) {
                arg1.method2076(true);
            } else {
                this.method1312(-867);
            }
            this.field4551 &= -2;
        }
    }

    @OriginalMember(owner = "client!mj", name = "YA", descriptor = "(IIII)V")
    public final void method1031(int arg0, int arg1, int arg2, int arg3) {
        ++field4450;
        if (!this.field4558) {
            throw new RuntimeException("");
        } else {
            this.field4545 = arg2;
            this.field4595 = arg1;
            this.field4616 = arg0;
            this.field4552 = arg3;
            if (this.field4553) {
                this.field4517[3].method56((byte) 72);
                this.field4517[3].method11(94);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class534 method951(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4509;
        class470 var6 = new class470(this, arg2, arg3, arg4);
        var6.method485(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lbs;IZI)V")
    public abstract void method1291(class215 arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!mj", name = "va", descriptor = "(I)V")
    public final void method1027(int arg0) {
        ++field4447;
        this.field4594 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field4594;
        }
        this.field4537 = 1 << this.field4594;
    }

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "(I)V")
    public abstract void method1284(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Lnm;")
    public class369 method1316(int arg0, byte arg1) {
        if (arg1 < 7) {
            return null;
        } else {
            ++field4455;
            if (~arg0 != -7) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        return arg0 == 7 ? new class275(this) : new class116(this);
                    } else {
                        return new class342(this, this.field4413);
                    }
                } else {
                    return new class194(this);
                }
            } else {
                return new class554(this);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "()[I")
    public final int[] method938() {
        ++field4431;
        return new int[] { this.field4587, this.field4600, this.field4567, this.field4614 };
    }

    @OriginalMember(owner = "client!mj", name = "JA", descriptor = "()V")
    public final void method1050() {
        ++field4343;
        this.field4605 = this.field4458;
        this.field4576 = 0;
        this.field4577 = 0;
        this.field4615 = this.field4332;
        if (this.field4637) {
            this.field4637 = false;
            this.method1318((byte) -73);
        }
        this.method2023(53);
    }

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "(I)V")
    private final void method1998(int arg0) {
        if (arg0 != 28) {
            this.method999(-78, 69, 12, -84, 126, 0);
        }
        ++field4476;
        if (class536.field7501 != this.field4529) {
            class41 var2 = this.field4529;
            this.field4529 = class536.field7501;
            if (!var2.method213(44)) {
                this.method2038((byte) -98);
            }
            this.method2042(12);
            this.field4562 = this.field4548;
            this.method1985(22316);
            this.field4551 &= -8;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILrt;Lsq;)Lpm;")
    public abstract class134 method1319(int arg0, int arg1, int arg2, class179 arg3, class485 arg4);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lnd;Z)V")
    public final void method1999(class689 arg0, boolean arg1) {
        this.field4547[this.field4579] = arg0;
        if (!arg1) {
            ++field4406;
            this.method2025(97);
        }
    }

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "()Lq;")
    public final class490 method950() {
        ++field4410;
        return this.field4622;
    }

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "(I)V")
    public abstract void method1331(int arg0);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V")
    private final void method2000(byte arg0) {
        ++field4420;
        this.field4620 = this.method1283(false, -1);
        this.field4620.method353(140, 28, (byte) 126);
        if (arg0 > 76) {
            for (int var2 = 0; ~var2 > -5; ++var2) {
                Buffer var3 = this.field4620.method354(true, true);
                if (var3 != null) {
                    Stream var4 = this.method1980((byte) -74, var3);
                    if (Stream.method3480()) {
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(1.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(1.0F);
                        var4.method3469(0.0F);
                        var4.method3469(1.0F);
                        var4.method3469(1.0F);
                        var4.method3469(1.0F);
                        var4.method3469(0.0F);
                        var4.method3469(1.0F);
                        var4.method3469(1.0F);
                        var4.method3469(1.0F);
                        var4.method3469(1.0F);
                        var4.method3469(1.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(1.0F);
                        var4.method3469(0.0F);
                        var4.method3469(1.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                        var4.method3469(0.0F);
                    } else {
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(1.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(1.0F);
                        var4.method3475(0.0F);
                        var4.method3475(1.0F);
                        var4.method3475(1.0F);
                        var4.method3475(1.0F);
                        var4.method3475(0.0F);
                        var4.method3475(1.0F);
                        var4.method3475(1.0F);
                        var4.method3475(1.0F);
                        var4.method3475(1.0F);
                        var4.method3475(1.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(1.0F);
                        var4.method3475(0.0F);
                        var4.method3475(1.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                        var4.method3475(0.0F);
                    }
                    var4.method3472();
                    if (this.field4620.method357(-28830)) {
                        break;
                    }
                }
            }
            this.field4634 = this.method1279(125, new class436[] { new class436(new class615[] { class615.field8653, class615.field8665, class615.field8665 }) });
        }
    }

    @OriginalMember(owner = "client!mj", name = "MA", descriptor = "(III[I)V")
    public final void method970(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4439;
        float var5 = this.field4511.method3031(-119, (float) arg0, (float) arg2, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field4600;
            var7 = this.field4587;
        } else {
            var7 = (int) ((float) this.field4567 * this.field4511.method3014((float) arg0, (float) arg2, 0, (float) arg1) / var5);
            var6 = (int) ((float) this.field4614 * this.field4511.method3011((float) arg2, 0, (float) arg1, (float) arg0) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field4528);
        arg3[1] = (int) ((float) var6 + -this.field4523);
    }

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "()Z")
    public final boolean method946() {
        ++field4327;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "()Lq;")
    public final class490 method1035() {
        ++field4383;
        return new class537();
    }

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "(I)V")
    public void method1307(int arg0) {
        ++field4466;
        this.field4603 = this.field4542;
        this.field4542 = 0;
        if (arg0 < 60) {
            this.field4560 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([I)V")
    public final void method996(int[] arg0) {
        ++field4391;
        arg0[0] = this.field4332;
        arg0[1] = this.field4458;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(ZB)V")
    public final void method2001(boolean arg0, byte arg1) {
        ++field4399;
        int var3 = 64 / ((arg1 - 72) / 45);
        if (this.field4592 != arg0) {
            this.field4592 = arg0;
            this.method1306(0);
            this.field4551 &= -32;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Le;)V")
    public final void method1043(class385 arg0) {
        ++field4336;
        this.field4407 = ((class434) arg0).field6129;
        this.field4408 = this.field4407.method3462(32768, false);
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V")
    private final void method2002(byte arg0) {
        this.field4527 = false;
        ++field4394;
        if (arg0 > -100) {
            this.method1980((byte) -124, (Buffer) null);
        }
        if (class419.field5592 == this.field4529) {
            this.method2053(116);
            this.method1985(22316);
        }
    }

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "(I)V")
    public final void method2003(int arg0) {
        ++field4462;
        if (arg0 == 16) {
            if (~this.field4551 != -17) {
                this.method2039(arg0 ^ 48);
                this.method2027(false, true);
                this.method2001(true, (byte) -76);
                this.method2029(arg0 + -9, true);
                this.method2051(1, (byte) 115);
                this.field4551 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(II)V")
    public final void method2004(int arg0, int arg1) {
        if (arg1 != 2) {
            this.field4578 = null;
        }
        ++field4353;
        if (~arg0 == -2) {
            this.method1994(-30, class428.field6081, class428.field6081);
        } else if (arg0 != 0) {
            if (arg0 == 2) {
                this.method1994(arg1 ^ -32, class428.field6081, class239.field2967);
            } else {
                if (arg0 != 3) {
                    if (~arg0 == -5) {
                        this.method1994(-30, class36.field371, class36.field371);
                        return;
                    }
                } else {
                    this.method1994(-30, class250.field3133, class644.field9099);
                }
            }
        } else {
            this.method1994(-30, class250.field3133, class250.field3133);
        }
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)V")
    private final void method2005(byte arg0) {
        int var2 = 30 % ((-22 - arg0) / 61);
        if (this.field4551 != 1) {
            this.method2054(18179);
            this.method2027(false, false);
            this.method1984(false, (byte) -77);
            this.method2001(false, (byte) -77);
            this.method2029(7, false);
            this.method2008(false, 79, -2, false);
            this.method2004(1, 2);
            this.method1997(127, this.field4582);
            this.field4551 = 1;
        }
        ++field4357;
    }

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "(I)V")
    public abstract void method1297(int arg0);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public final void method991(int arg0) {
        ++field4463;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field4516 != null) {
                this.field4516.method1573(64);
            }
            this.field4607 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(Z)V")
    public abstract void method1332(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(B)V")
    private final void method2006(byte arg0) {
        if (arg0 != 107) {
            this.method2029(-39, false);
        }
        this.field4627 = this.method1283(true, -1);
        ++field4376;
        this.field4627.method353(24, 12, (byte) -121);
        this.field4626 = this.method1279(115, new class436[] { new class436(class615.field8653) });
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class274 method1001(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4368;
        return new class547(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(II)V")
    public abstract void method1280(int arg0, int arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
    public void method1029() {
        if (!this.field4524) {
            for (class333 var1 = this.field4340.method3434((byte) 2); var1 != null; var1 = this.field4340.method3430(true)) {
                ((class434) var1).method2488(24);
            }
            Enumeration var2 = this.field4369.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1294(1, var3, this.field4369.get(var3));
            }
            class694.method3817(true, false, (byte) 43);
            this.field4468.release();
            this.field4524 = true;
        }
        ++field4352;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Ltf;II)V")
    public class344(Canvas arg0, Object arg1, class524 arg2, class701 arg3, int arg4, int arg5) {
        super(arg2);
        this.field4417 = this.field4498 = arg1;
        this.field4380 = arg3;
        this.field4561 = arg4;
        this.field4482 = this.field4461 = arg0;
        Dimension var7 = arg0.getSize();
        this.field4458 = this.field4487 = var7.height;
        this.field4332 = this.field4381 = var7.width;
        this.field4519 = arg5;
        class370.method2159(-97, true, false);
        if (super.field8050 != null) {
            this.field4516 = new class267(this, super.field8050);
            this.field4468 = new NativeInterface(super.field8050.method142(-26131), this.field4519);
            for (int var8 = 0; ~var8 > ~super.field8050.method142(-26131); ++var8) {
                class295 var9 = super.field8050.method140(var8, 862);
                if (var9 != null) {
                    this.field4468.initTextureMetrics(var8, var9.field3671, var9.field3667);
                }
            }
        } else {
            this.field4468 = new NativeInterface(0, this.field4519);
            this.field4516 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)Lmda;")
    public abstract class17 method1326(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lqw;)V")
    public final void method1033(class332 arg0) {
        this.field4604.method3401(arg0, this, -1, false);
        ++field4333;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[FLsq;ZB)Lpm;")
    public final class134 method2007(int arg0, int arg1, float[] arg2, class485 arg3, boolean arg4, byte arg5) {
        ++field4491;
        return arg5 > -112 ? null : this.method1295(arg0, -27701, arg3, 0, arg4, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIIZ)V")
    public final void method2008(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (this.field4597 != arg2 || !this.field4558 == this.field4553) {
            class134 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field4558 ? 0 : 3;
            if (~arg2 > -1) {
                this.method2010(114);
            } else {
                var5 = this.field4516.method1576(arg2, -1);
                class295 var10 = super.field8050.method140(arg2, 862);
                if (var10.field3673 == 0 && var10.field3681 == 0) {
                    this.method2010(126);
                } else {
                    int var11 = !var10.field3668 ? 128 : 64;
                    int var12 = var11 * 50;
                    class537 var13 = this.method2044(97);
                    var13.method3015((float) (this.field4585 % var12 * var10.field3673) / (float) var12, -22535, 0.0F, (float) (this.field4585 % var12 * var10.field3681) / (float) var12);
                    this.method1999(class103.field1120, false);
                }
                var6 = var10.field3682;
                if (!this.field4558) {
                    var7 = var10.field3676;
                    var9 = var10.field3669;
                    var8 = var10.field3677;
                }
            }
            this.method2024(var9, arg0, var8, arg3, var7, -62);
            if (this.field4584 != null) {
                this.field4584.method9((byte) -94, var6, var5);
            } else {
                this.method1997(126, var5);
                this.method2004(var6, 2);
            }
            this.field4597 = arg2;
            this.field4553 = this.field4558;
        }
        ++field4367;
        if (arg1 >= 57) {
            this.field4551 &= -8;
        }
    }

    @OriginalMember(owner = "client!mj", name = "ra", descriptor = "(F)V")
    public final void method949(float arg0) {
        if (this.field4596 != arg0) {
            this.field4596 = arg0;
            this.field4468.setAmbient(arg0);
            this.method1320(9415);
            this.method1284(-30);
        }
        ++field4416;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(FFFFFFI)Z")
    private final boolean method2009(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        ++field4359;
        Buffer var8 = this.field4627.method354(true, true);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method1980((byte) -74, var8);
            if (Stream.method3480()) {
                var9.method3469(arg2);
                var9.method3469(arg5);
                var9.method3469(arg0);
                var9.method3469(arg4);
                var9.method3469(arg1);
                var9.method3469(arg3);
            } else {
                var9.method3475(arg2);
                var9.method3475(arg5);
                var9.method3475(arg0);
                var9.method3475(arg4);
                var9.method3475(arg1);
                var9.method3475(arg3);
            }
            var9.method3472();
            if (arg6 != 1) {
                this.method1315(42);
            }
            return this.field4627.method357(-28830);
        }
    }

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "(I)V")
    public abstract void method1312(int arg0);

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "(I)V")
    public final void method2010(int arg0) {
        if (this.field4547[this.field4579] != class537.field7554) {
            this.field4547[this.field4579] = class537.field7554;
            this.field4538[this.field4579].method22();
            this.method2025(126);
        }
        if (arg0 < 107) {
            this.field4581 = null;
        }
        ++field4428;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(Z)V")
    public void method1333(boolean arg0) {
        if (!arg0) {
            this.field4512 = null;
        }
        ++field4392;
        this.method1995((byte) -115);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public final void method1015(boolean arg0) {
        ++field4387;
    }

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "()I")
    public final int method952() {
        ++field4500;
        return this.field4638;
    }

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "()Z")
    public final boolean method1042() {
        ++field4467;
        return this.field4517[3].method8(-60);
    }

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "(IIIII)V")
    public final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4454;
        this.method957(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIII)V")
    public final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4363;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method2009(0.0F, (float) arg3 + var8, (float) arg0, 0.0F, (float) arg2 + var9, (float) arg1, 1)) {
            this.method2005((byte) -121);
            this.method1988(arg4, 4);
            this.method2012((byte) -88, 0, class107.field1154);
            this.method1979(0, class107.field1154, (byte) -29);
            this.method2051(arg5, (byte) 107);
            this.method2011(false);
            this.method1278(false, (byte) -109);
            this.method2013(46);
            this.method1278(true, (byte) -109);
            this.method1979(0, class304.field3769, (byte) -12);
            this.method2012((byte) -78, 0, class304.field3769);
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(Z)V")
    public final void method2011(boolean arg0) {
        this.field4510.method22();
        ++field4414;
        this.field4508 = true;
        this.method2036(arg0);
    }

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "()Z")
    public final boolean method960() {
        ++field4421;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILgb;)V")
    public final void method2012(byte arg0, int arg1, class163 arg2) {
        ++field4465;
        this.method1328(arg1, false, false, true, arg2);
        if (arg0 >= -35) {
            this.field4540 = 0.35249963F;
        }
    }

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "(I)V")
    public abstract void method1282(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILrt;Lsq;)Z")
    public abstract boolean method1334(int arg0, class179 arg1, class485 arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lef;IIII)Lda;")
    public final class473 method1051(class581 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4481;
        return new class330(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4379;
    }

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "(I)V")
    public abstract void method1293(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[I[I)Lua;")
    public final class598 method940(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4335;
        return class531.method2984(arg3, arg2, arg0, arg1, this, 0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLada;)V")
    public abstract void method1285(boolean arg0, class278 arg1);

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "(I)V")
    private final void method2013(int arg0) {
        this.method1281(this.field4627, 0, 124);
        if (arg0 < 2) {
            this.field4524 = true;
        }
        ++field4460;
        this.method1285(true, this.field4626);
        this.method1291(class418.field5588, 0, true, 1);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
    public abstract void method1327(Canvas arg0, Object arg1, boolean arg2);

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "(I)Lafa;")
    public final class537 method2014(int arg0) {
        ++field4345;
        return arg0 != 390 ? null : this.field4510;
    }

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "()Z")
    public final boolean method1008() {
        ++field4409;
        return this.field4521;
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(II)V")
    public final void method2015(int arg0, int arg1) {
        if (arg1 == -2) {
            ++field4346;
            if (~this.field4579 != ~arg0) {
                this.field4579 = arg0;
                this.method1282(1);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IF)V")
    public final void method2016(int arg0, float arg1) {
        ++field4349;
        if (arg0 != 9) {
            this.field4498 = null;
        }
        if (this.field4522 != arg1) {
            this.field4522 = arg1;
            this.method1982((byte) 65);
        }
    }

    @OriginalMember(owner = "client!mj", name = "XA", descriptor = "(IIIII)V")
    public final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4378;
        this.method957(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lqo;Z)Lf;")
    public final class534 method1041(class550 arg0, boolean arg1) {
        ++field4415;
        class534 var9;
        if (~arg0.field7873 != -1 && arg0.field7872 != 0) {
            int[] var3 = new int[arg0.field7873 * arg0.field7872];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field7868 != null) {
                for (int var6 = 0; ~arg0.field7872 < ~var6; ++var6) {
                    for (int var7 = 0; var7 < arg0.field7873; ++var7) {
                        var3[var5++] = class422.method2436(arg0.field7871[class105.method572(arg0.field7869[var4], 255)], arg0.field7868[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; arg0.field7872 > var8; ++var8) {
                    for (int var10 = 0; ~var10 > ~arg0.field7873; ++var10) {
                        int var11 = arg0.field7871[255 & arg0.field7869[var4++]];
                        var3[var5++] = ~var11 != -1 ? class422.method2436(-16777216, var11) : 0;
                    }
                }
            }
            var9 = this.method1017(var3, 0, arg0.field7873, arg0.field7873, arg0.field7872);
        } else {
            var9 = this.method1017(new int[1], 0, 1, 1, 1);
        }
        var9.method313(arg0.field7870, arg0.field7867, arg0.field7875, arg0.field7874);
        return var9;
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "()Z")
    public final boolean method965() {
        ++field4490;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(B)V")
    public final void method2017(byte arg0) {
        this.field4547 = new class689[this.field4612];
        this.field4586 = new class686[this.field4612];
        this.field4556 = new class319[this.field4612];
        this.field4569 = new class319[this.field4612];
        this.field4538 = new class537[this.field4612];
        ++field4449;
        for (int var2 = 0; this.field4612 > var2; ++var2) {
            this.field4569[var2] = class250.field3133;
            this.field4556[var2] = class250.field3133;
            this.field4547[var2] = class537.field7554;
            this.field4538[var2] = new class537();
        }
        this.field4606 = new class670[this.field4571 + -2];
        this.field4582 = this.method1319(1, 1, -22, class179.field2008, class412.field5529);
        this.method1043(new class434(262144));
        this.field4635 = this.method1279(-82, new class436[] { new class436(new class615[] { class615.field8653, class615.field8665 }) });
        this.field4628 = this.method1279(123, new class436[] { new class436(new class615[] { class615.field8653, class615.field8663 }) });
        this.field4625 = this.method1279(arg0 ^ -91, new class436[] { new class436(class615.field8653), new class436(class615.field8663), new class436(class615.field8665), new class436(class615.field8658) });
        if (arg0 != 59) {
            this.method2053(7);
        }
        this.field4633 = this.method1279(-98, new class436[] { new class436(class615.field8653), new class436(class615.field8663), new class436(class615.field8665) });
        this.field4631 = new class330(this, 0, 0, false, false);
        this.field4632 = new class330(this, 0, 0, true, true);
        this.field4621 = new class330(this, 0, 0, false, false);
        this.field4629 = new class330(this, 0, 0, true, true);
        this.field4624 = new class330(this, 0, 0, false, false);
        this.field4623 = new class330(this, 0, 0, true, true);
        this.field4618 = new class330(this, 0, 0, false, false);
        this.field4617 = new class330(this, 0, 0, true, true);
        this.field4619 = new class330(this, 0, 0, false, false);
        this.field4630 = new class330(this, 0, 0, true, true);
        this.field4604 = new class611(this);
        this.field4636 = this.method1326(-100, true);
        this.method1996(arg0 + -4012);
        this.field4413 = new class341(this);
        this.field4517[1] = this.method1316(1, (byte) 63);
        this.field4517[2] = this.method1316(2, (byte) 86);
        this.field4517[4] = this.method1316(4, (byte) 71);
        this.field4517[5] = this.method1316(5, (byte) 12);
        this.field4517[6] = this.method1316(6, (byte) 32);
        this.field4517[7] = this.method1316(7, (byte) 79);
        this.field4517[3] = this.method1316(3, (byte) 111);
        this.field4517[8] = this.method1316(8, (byte) 124);
        this.field4517[9] = this.method1316(9, (byte) 125);
        if (!this.field4517[2].method8(76)) {
            this.field4517[2] = this.method1316(0, (byte) 43);
        }
        if (!this.field4517[4].method8(109)) {
            this.field4517[4] = this.field4517[2];
        }
        if (!this.field4517[8].method8(-64)) {
            this.field4517[8] = this.field4517[4];
        }
        if (!this.field4517[9].method8(-127)) {
            this.field4517[9] = this.field4517[8];
        }
        this.method1333(true);
        this.method1050();
        this.method1011();
    }

    @OriginalMember(owner = "client!mj", name = "oa", descriptor = "([I)V")
    public final void method963(int[] arg0) {
        arg0[2] = this.field4615;
        arg0[0] = this.field4576;
        arg0[3] = this.field4605;
        arg0[1] = this.field4577;
        ++field4419;
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
    public final void method942(int arg0) {
        ++field4330;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1294(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZIII[II)Lpm;")
    public abstract class134 method1300(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLafa;)V")
    public final void method2018(boolean arg0, class537 arg1) {
        ++field4497;
        this.field4510.method15(arg1);
        this.field4508 = false;
        this.method2036(!arg0);
        if (!arg0) {
            this.method1052();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZLbs;Lmda;I)V")
    public abstract void method1276(int arg0, int arg1, int arg2, boolean arg3, class215 arg4, class17 arg5, int arg6);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    public void method948(int arg0) {
        ++field4362;
        if (this.field4516 != null) {
            this.field4516.method1574((byte) 111);
        }
        this.field4585 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(B)V")
    public final void method2019(byte arg0) {
        ++field4328;
        if (class198.field2350 != this.field4529) {
            class41 var2 = this.field4529;
            this.field4529 = class198.field2350;
            if (var2.method213(-108)) {
                this.method2038((byte) -104);
            }
            this.field4562 = this.field4559;
            this.field4551 &= -32;
        }
        if (arg0 > -116) {
            this.field4581 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "ZA", descriptor = "(Z)V")
    public final void method955(boolean arg0) {
        ++field4423;
        this.field4531 = arg0;
        this.method1311((byte) 8);
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(Z)V")
    public abstract void method1336(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "(I)Lafa;")
    public final class537 method2020(int arg0) {
        ++field4479;
        if (arg0 != 15) {
            this.field4597 = 92;
        }
        return this.field4538[this.field4579];
    }

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "(I)V")
    public final void method2021(int arg0) {
        if (arg0 == 0) {
            if (~this.field4551 != -9) {
                this.method1998(28);
                this.method2027(false, true);
                this.method2001(true, (byte) 123);
                this.method2029(7, true);
                this.method2051(1, (byte) -33);
                this.field4551 = 8;
            }
            ++field4329;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI[BILsq;)Ln;")
    public abstract class514 method1290(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, class485 arg5);

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "(I)I")
    public final int method2022(int arg0) {
        ++field4341;
        if (arg0 != 0) {
            this.method1032(23, -0.08374633F, 0.034562077F, -0.17997755F, 1.796191F, 1.3079157F);
        }
        return this.field4545;
    }

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "()Z")
    public final boolean method1005() {
        ++field4411;
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "(I)V")
    private final void method2023(int arg0) {
        ++field4364;
        this.field4534 = (float) (-this.field4587 + this.field4615);
        if (arg0 > 4) {
            this.field4523 = (float) (-this.field4600 + this.field4577);
            this.field4528 = (float) (-this.field4587 + this.field4576);
            this.field4540 = (float) (-this.field4600 + this.field4605);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZIZII)V")
    private final void method2024(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        boolean var7 = arg1 & this.method1042();
        ++field4412;
        if (!var7 && (~arg0 == -5 || arg0 == 8 || ~arg0 == -10)) {
            arg0 = 2;
            arg2 = ~arg0 == -5 ? arg4 & 1 : 1;
            arg4 = 0;
        }
        if (~arg0 != -1 && arg3) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (arg5 <= -11) {
            if (~this.field4555 == ~arg0) {
                if (~this.field4555 != -1) {
                    this.field4517[Integer.MAX_VALUE & this.field4555].method5(382, arg3);
                    if (this.field4608 != arg4 || this.field4546 != arg2) {
                        this.field4517[Integer.MAX_VALUE & this.field4555].method7(arg4, 8250, arg2);
                        this.field4546 = arg2;
                        this.field4608 = arg4;
                    }
                    return;
                }
            } else {
                if (this.field4555 != 0) {
                    this.field4517[Integer.MAX_VALUE & this.field4555].method3((byte) 111);
                }
                if (arg0 != 0) {
                    this.field4584 = this.field4517[arg0 & Integer.MAX_VALUE];
                    this.field4584.method10(arg3, -14330);
                    this.field4584.method5(382, arg3);
                    this.field4584.method7(arg4, 8250, arg2);
                } else {
                    this.field4584 = null;
                }
                this.field4555 = arg0;
                this.field4546 = arg2;
                this.field4608 = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "(I)V")
    private final void method2025(int arg0) {
        if (arg0 >= 63) {
            this.method1289(79);
            ++field4501;
            if (this.field4584 != null) {
                this.field4584.method4((byte) 86);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lbs;II)V")
    private final void method2026(class215 arg0, int arg1, int arg2) {
        this.method1281(this.field4620, arg1, 106);
        ++field4396;
        this.method1285(true, this.field4634);
        this.method1291(arg0, 0, true, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "()Z")
    public final boolean method972() {
        ++field4480;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZZ)V")
    public final void method2027(boolean arg0, boolean arg1) {
        if (!arg1 == this.field4575) {
            this.field4575 = arg1;
            this.method1309((byte) 104);
            this.field4551 &= -32;
        }
        ++field4398;
        if (arg0) {
            this.field4508 = true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(B)V")
    private final void method2028(byte arg0) {
        if (this.field4584 != null) {
            this.field4584.method11(127);
        }
        ++field4478;
        if (arg0 >= -77) {
            this.field4582 = null;
        }
        this.method1296(false);
    }

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "(I)V")
    public abstract void method1310(int arg0);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IZ)V")
    public final void method2029(int arg0, boolean arg1) {
        if (!arg1 != !this.field4532) {
            this.field4532 = arg1;
            this.method1311((byte) 8);
            this.field4551 &= -32;
        }
        if (arg0 == 7) {
            ++field4503;
        }
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(B)V")
    public abstract void method1323(byte arg0);

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(Z)V")
    public abstract void method1292(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "(I)Lafa;")
    public final class537 method2030(int arg0) {
        if (arg0 != 29443) {
            this.method2039(22);
        }
        ++field4496;
        return this.field4513;
    }

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "(I)Lica;")
    public final class219 method2031(int arg0) {
        ++field4405;
        if (arg0 >= -78) {
            this.field4585 = 22;
        }
        return this.field4578 != null ? this.field4578.method3175(-75) : null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lq;)V")
    public final void method992(class490 arg0) {
        ++field4388;
        this.field4511 = (class537) arg0;
        this.field4513.method15(this.field4511);
        this.field4513.method3027(121);
        this.field4514.method3026(0, this.field4513);
        this.field4512.method3026(0, this.field4511);
        if (this.field4529.method213(-122)) {
            this.method2038((byte) -121);
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
    public final void method978(int arg0) {
        ++field4430;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(Z)V")
    public abstract void method1301(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "()I")
    public final int method971() {
        ++field4433;
        return this.field4599;
    }

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "()Z")
    public final boolean method1053() {
        ++field4344;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "(I)V")
    public abstract void method1299(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIF)Leq;")
    public final class670 method1010(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4334;
        return new class461(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "(B)V")
    public abstract void method1309(byte arg0);

    @OriginalMember(owner = "client!mj", name = "GA", descriptor = "(II)V")
    public final void method1016(int arg0, int arg1) {
        if (this.field4533 != arg0 || this.field4599 != arg1) {
            this.field4599 = arg1;
            this.field4533 = arg0;
            this.method2056(-14028);
            this.method1982((byte) 65);
            this.method2028((byte) -95);
        }
        ++field4339;
    }

    @OriginalMember(owner = "client!mj", name = "FA", descriptor = "(ILua;II)V")
    public final void method1036(int arg0, class598 arg1, int arg2, int arg3) {
        ++field4495;
        class507 var5 = (class507) arg1;
        class134 var6 = var5.field7284;
        this.method2048(true);
        this.method1997(127, var6);
        this.method2051(1, (byte) -115);
        this.method1994(-30, class428.field6081, class428.field6081);
        this.method2012((byte) -103, 0, class107.field1154);
        this.method1988(arg0, 4);
        this.field4510.method3030((float) this.field4332, (byte) -51, (float) this.field4458, 0.0F);
        this.method2033((byte) 101);
        this.field4538[0].method3030(var6.method756((float) this.field4332, 5044), (byte) -51, var6.method758((float) this.field4458, false), 1.0F);
        this.field4538[0].method3017(var6.method756((float) (-arg2), 5044), 0.0F, (byte) -48, var6.method758((float) (-arg3), false));
        this.field4547[0] = class103.field1120;
        this.method2025(87);
        this.method1981(-112);
        this.method2010(112);
        this.method2012((byte) -128, 0, class304.field3769);
    }

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "(I)Lafa;")
    public final class537 method2032(int arg0) {
        ++field4464;
        if (!this.field4557) {
            this.field4515.method3028(this.field4513, this.field4510);
            this.field4557 = true;
        }
        if (arg0 < 30) {
            this.field4627 = null;
        }
        return this.field4515;
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(Z)V")
    public abstract void method1296(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "da", descriptor = "(IIII)V")
    public final void method982(int arg0, int arg1, int arg2, int arg3) {
        ++field4393;
        if (~arg0 >= -1 && ~arg2 <= ~(this.field4332 + -1) && ~arg1 >= -1 && ~(this.field4458 - 1) >= ~arg3) {
            this.method1050();
        } else {
            this.field4577 = arg1 < 0 ? 0 : arg1;
            this.field4576 = arg0 >= 0 ? arg0 : 0;
            this.field4605 = ~arg3 >= ~this.field4332 ? arg3 : 0;
            this.field4615 = arg2 <= this.field4332 ? arg2 : 0;
            if (!this.field4637) {
                this.field4637 = true;
                this.method1318((byte) 106);
            }
            this.method1315(-12002);
            this.method2023(15);
        }
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "()I")
    public final int method953() {
        ++field4384;
        return this.field4571 - 2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ[[IB)Lica;")
    public abstract class219 method1321(int arg0, boolean arg1, int[][] arg2, byte arg3);

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "(B)V")
    public final void method2033(byte arg0) {
        if (arg0 != 101) {
            this.field4555 = -71;
        }
        this.field4508 = false;
        ++field4372;
        this.method2036(false);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(BZ)V")
    public final void method2034(byte arg0, boolean arg1) {
        if (this.field4574 == !arg1) {
            this.field4574 = arg1;
            this.method1317(false);
        }
        ++field4427;
        if (arg0 != 41) {
            this.method1305((class163) null, 46, 0, false);
        }
    }

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "(I)V")
    private final void method2035(int arg0) {
        ++field4432;
        this.field4580 = (float) this.field4599;
        if (arg0 <= 39) {
            this.method938();
        }
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(Z)V")
    private final void method2036(boolean arg0) {
        ++field4331;
        if (class419.field5592 == this.field4529) {
            float var2 = this.method1288(29813);
            this.field4510.method3017(var2, 0.0F, (byte) -48, var2);
        }
        this.field4557 = arg0;
        this.method1310(4924);
        if (this.field4584 != null) {
            this.field4584.method1(8220);
        }
    }

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "(I)I")
    public final int method2037(int arg0) {
        if (arg0 != 9) {
            this.method2036(true);
        }
        ++field4375;
        return this.field4616;
    }

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "(B)V")
    public abstract void method1318(byte arg0);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "(B)V")
    private final void method2038(byte arg0) {
        this.field4557 = false;
        ++field4442;
        if (arg0 < -90) {
            if (this.field4584 != null) {
                this.field4584.method2(17789);
            }
            this.method1308((byte) 105);
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method993(Canvas arg0) {
        ++field4418;
        if (this.field4461 == arg0) {
            throw new RuntimeException();
        } else if (this.field4369.containsKey(arg0)) {
            this.method1294(1, arg0, this.field4369.get(arg0));
            this.field4369.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "(I)V")
    private final void method2039(int arg0) {
        if (arg0 <= 6) {
            this.method1334(-102, (class179) null, (class485) null);
        }
        ++field4374;
        if (class300.field3732 != this.field4529) {
            class41 var2 = this.field4529;
            this.field4529 = class300.field3732;
            if (!var2.method213(24)) {
                this.method2038((byte) -122);
            }
            this.method2055(15);
            this.field4562 = this.field4564;
            this.method1985(22316);
            this.field4551 &= -8;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public abstract Object method1298(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(IIIIII)Llj;")
    public final class60 method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4358;
        return new class559(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "(I)V")
    public final void method2040(int arg0) {
        ++field4425;
        this.method2019((byte) -125);
        this.method1985(arg0 + 28515);
        if (arg0 != -6199) {
            this.field4515 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Luaa;)Lada;")
    public abstract class278 method1279(int arg0, class436[] arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)I")
    public final int method1004(int arg0, int arg1) {
        ++field4459;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZZ)V")
    public final void method2041(boolean arg0, boolean arg1) {
        if (!this.field4588 != !arg1) {
            this.field4588 = arg1;
            this.method1309((byte) 44);
        }
        ++field4456;
        if (arg0) {
            this.field4607 = -113;
        }
    }

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "(I)V")
    private final void method2042(int arg0) {
        ++field4436;
        if (!this.field4554) {
            float[] var2 = this.field4548;
            float var3 = (float) (-this.field4587 * this.field4533) / (float) this.field4567;
            float var4 = (float) ((-this.field4587 + this.field4332) * this.field4533) / (float) this.field4567;
            float var5 = (float) (this.field4600 * this.field4533) / (float) this.field4614;
            float var6 = (float) ((-this.field4458 + this.field4600) * this.field4533) / (float) this.field4614;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field4533 * 2.0F;
                var2[15] = 0.0F;
                var2[11] = -1.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[0] = var7 / (-var3 + var4);
                var2[5] = var7 / (-var6 + var5);
                var2[10] = this.field4610 = (float) this.field4599 / (float) (-this.field4599 + this.field4533);
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[14] = this.field4543 = (float) (this.field4599 * this.field4533) / (float) (-this.field4599 + this.field4533);
            } else {
                var2[14] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[5] = 1.0F;
                var2[2] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F;
            }
            this.method1987(10);
            this.field4554 = true;
        }
        if (arg0 != 12) {
            this.field4635 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "(I)V")
    public abstract void method1330(int arg0);

    @OriginalMember(owner = "client!mj", name = "BA", descriptor = "()I")
    public final int method966() {
        ++field4390;
        return this.field4533;
    }

    @OriginalMember(owner = "client!mj", name = "AA", descriptor = "(III[I)V")
    public final void method1019(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4356;
        float var5 = this.field4511.method3031(-86, (float) arg0, (float) arg2, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field4600;
            var7 = this.field4587;
        } else {
            var7 = (int) ((float) this.field4567 * this.field4511.method3014((float) arg0, (float) arg2, 0, (float) arg1) / var5);
            var6 = (int) ((float) this.field4614 * this.field4511.method3011((float) arg2, 0, (float) arg1, (float) arg0) / var5);
        }
        arg3[0] = (int) ((float) var7 - this.field4528);
        arg3[1] = (int) ((float) var6 - this.field4523);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class598 arg6, int arg7, int arg8) {
        ++field4360;
    }

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "(I)I")
    public final int method2043(int arg0) {
        if (arg0 != 4) {
            this.field4524 = true;
        }
        ++field4401;
        return this.field4579;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Leq;)V")
    public final void method1020(int arg0, class670[] arg1) {
        ++field4470;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field4606[var3] = arg1[var3];
        }
        this.field4542 = arg0;
        if (this.field4529.method213(-122)) {
            this.method1307(79);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method956(Canvas arg0) {
        ++field4354;
        Object var2 = null;
        if (arg0 != null && this.field4461 != arg0) {
            if (this.field4369.containsKey(arg0)) {
                var2 = this.field4369.get(arg0);
            }
        } else {
            var2 = this.field4417;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1302(false, arg0, var2);
            if (this.field4482 == arg0) {
                this.method1992((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "()Z")
    public final boolean method1038() {
        ++field4361;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "(I)Lafa;")
    public final class537 method2044(int arg0) {
        if (arg0 < 10) {
            this.field4635 = null;
        }
        ++field4402;
        return this.field4538[this.field4579];
    }

    @OriginalMember(owner = "client!mj", name = "CA", descriptor = "(IIII)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3) {
        this.field4545 = arg2;
        this.field4552 = arg3;
        this.field4558 = true;
        this.field4616 = arg0;
        this.field4595 = arg1;
        ++field4469;
    }

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "(I)V")
    public final void method2045(int arg0) {
        ++field4434;
        Enumeration var2 = this.field4369.keys();
        while (var2.hasMoreElements()) {
            Canvas var4 = (Canvas) var2.nextElement();
            this.method1294(1, var4, this.field4369.get(var4));
        }
        this.field4620.method74((byte) 118);
        int var3 = -55 % ((-21 - arg0) / 61);
        this.field4627.method74((byte) 108);
        this.field4632.method1893((byte) -64);
        this.field4629.method1893((byte) -106);
        this.field4623.method1893((byte) -117);
        this.field4617.method1893((byte) -69);
        this.field4630.method1893((byte) -124);
        this.field4604.method3403(-4906);
        this.field4636.method74((byte) 112);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)Lsu;")
    public abstract class155 method1283(boolean arg0, int arg1);

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "()V")
    public final void method1047() {
        this.field4558 = false;
        ++field4493;
    }

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "()Z")
    public final boolean method939() {
        ++field4370;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZZZLgb;)V")
    public abstract void method1328(int arg0, boolean arg1, boolean arg2, boolean arg3, class163 arg4);

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "(I)V")
    public abstract void method1315(int arg0);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(IIIII)V")
    public final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4395;
    }

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "(I)V")
    public abstract void method1289(int arg0);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method988(Canvas arg0) {
        this.field4417 = null;
        ++field4444;
        this.field4482 = null;
        if (arg0 != null && this.field4461 != arg0) {
            if (this.field4369.containsKey(arg0)) {
                this.field4417 = this.field4369.get(arg0);
                this.field4482 = arg0;
            }
        } else {
            this.field4482 = this.field4461;
            this.field4417 = this.field4498;
        }
        if (this.field4482 != null && this.field4417 != null) {
            this.method1327(this.field4482, this.field4417, true);
            this.method1992((byte) -109);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[BBILsq;Z)Lpm;")
    public final class134 method2046(int arg0, byte[] arg1, byte arg2, int arg3, class485 arg4, boolean arg5) {
        ++field4474;
        return arg2 <= 38 ? null : this.method1313(arg1, 2, arg5, arg3, arg0, 0, arg4, 0);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method968(Canvas arg0) {
        ++field4499;
        if (this.field4461 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4369.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1298(arg0, (byte) -119);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field4369.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()Z")
    public final boolean method1052() {
        ++field4471;
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4365;
    }

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "(I)Lafa;")
    public final class537 method2047(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field4486;
            return this.field4514;
        }
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(Z)V")
    public final void method2048(boolean arg0) {
        ++field4435;
        if (arg0) {
            if (this.field4551 != 2) {
                this.method2054(18179);
                this.method2027(false, false);
                this.method1984(false, (byte) -35);
                this.method2001(false, (byte) -68);
                this.method2029(7, false);
                this.method2008(false, 124, -2, false);
                this.field4551 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lrt;Lsq;B)Z")
    public abstract boolean method1287(class179 arg0, class485 arg1, byte arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B[F)[F")
    public final float[] method2049(byte arg0, float[] arg1) {
        if (arg0 != -50) {
            this.method1043((class385) null);
        }
        arg1[0] = this.field4562[0];
        arg1[8] = this.field4562[2];
        ++field4342;
        arg1[12] = this.field4562[3];
        arg1[4] = this.field4562[1];
        arg1[5] = this.field4562[5];
        arg1[1] = this.field4562[4];
        arg1[9] = this.field4562[6];
        arg1[2] = this.field4562[8];
        arg1[13] = this.field4562[7];
        arg1[3] = this.field4562[12];
        arg1[7] = this.field4562[13];
        arg1[10] = this.field4562[10];
        arg1[14] = this.field4562[11];
        arg1[6] = this.field4562[9];
        arg1[15] = this.field4562[15];
        arg1[11] = this.field4562[14];
        return arg1;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZI)V")
    public final void method2050(boolean arg0, int arg1) {
        ++field4457;
        if (this.field4535 == !arg0) {
            this.field4535 = arg0;
            this.method1322(6);
        }
        if (arg1 <= 37) {
            this.method1022(111, 69, 51, 77, -48, 123);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)V")
    public final void method2051(int arg0, byte arg1) {
        ++field4506;
        if (~this.field4611 != ~arg0) {
            boolean var3;
            boolean var4;
            class539 var5;
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -129) {
                        var3 = true;
                        var4 = true;
                        var5 = class554.field7918;
                    } else {
                        var3 = false;
                        var5 = class547.field7838;
                        var4 = false;
                    }
                } else {
                    var5 = class162.field1814;
                    var4 = true;
                    var3 = false;
                }
            } else {
                var5 = class376.field5109;
                var4 = true;
                var3 = true;
            }
            if (!var3 == this.field4539) {
                this.field4539 = var3;
                this.method1332(true);
            }
            if (var4 == !this.field4530) {
                this.field4530 = var4;
                this.method1297(7);
            }
            if (this.field4598 != var5) {
                this.field4598 = var5;
                this.method1330(-34);
            }
            this.field4551 &= -29;
            this.field4611 = arg0;
        }
        int var6 = 42 / ((arg1 - 48) / 56);
    }

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(Z)V")
    public abstract void method1317(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BIZIIILsq;I)Lpm;")
    public abstract class134 method1313(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7);

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "(I)V")
    public abstract void method1322(int arg0);

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "(I)I")
    public final int method2052(int arg0) {
        if (arg0 != -6771) {
            this.field4545 = -105;
        }
        ++field4473;
        return this.field4552;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(IIIIII)V")
    public final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4440;
        float var7 = this.method1288(29813);
        this.method2005((byte) 126);
        this.method1988(arg4, 4);
        this.method2012((byte) -94, 0, class107.field1154);
        this.method1979(0, class107.field1154, (byte) -113);
        this.method2051(arg5, (byte) -103);
        this.field4510.method3030((float) (arg2 + -1), (byte) -51, (float) (arg3 + -1), 1.0F);
        this.field4510.method3017((float) arg0 + -var7, 0.0F, (byte) -48, (float) arg1 + -var7);
        this.method2033((byte) 101);
        this.method1278(false, (byte) -109);
        this.method2026(class286.field3572, 0, 4);
        this.method1278(true, (byte) -109);
        this.method1979(0, class304.field3769, (byte) -123);
        this.method2012((byte) -61, 0, class304.field3769);
    }

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "(I)V")
    private final void method2053(int arg0) {
        ++field4472;
        int var2 = -122 / ((42 - arg0) / 62);
        if (!this.field4527) {
            float[] var3 = this.field4560;
            if (~this.field4332 != -1 && ~this.field4458 != -1) {
                var3[7] = 0.0F;
                var3[5] = -2.0F / (float) this.field4458;
                var3[3] = 0.0F;
                var3[1] = 0.0F;
                var3[13] = 1.0F;
                var3[4] = 0.0F;
                var3[15] = 1.0F;
                var3[14] = 0.5F;
                var3[6] = 0.0F;
                var3[10] = 0.5F;
                var3[11] = 0.0F;
                var3[9] = 0.0F;
                var3[12] = -1.0F;
                var3[2] = 0.0F;
                var3[0] = 2.0F / (float) this.field4332;
                var3[8] = 0.0F;
            } else {
                var3[0] = 1.0F;
                var3[11] = 0.0F;
                var3[9] = 0.0F;
                var3[8] = 0.0F;
                var3[14] = 0.0F;
                var3[5] = 1.0F;
                var3[4] = 0.0F;
                var3[13] = 0.0F;
                var3[6] = 0.0F;
                var3[10] = 1.0F;
                var3[15] = 1.0F;
                var3[3] = 0.0F;
                var3[7] = 0.0F;
                var3[1] = 0.0F;
                var3[12] = 0.0F;
                var3[2] = 0.0F;
            }
            this.field4527 = true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1302(boolean arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "()Lq;")
    public final class490 method983() {
        ++field4337;
        return this.field4511;
    }

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "(I)V")
    private final void method2054(int arg0) {
        if (arg0 != 18179) {
            this.field4581 = null;
        }
        if (class419.field5592 != this.field4529) {
            class41 var2 = this.field4529;
            this.field4529 = class419.field5592;
            if (var2.method213(-112)) {
                this.method2038((byte) -123);
            }
            this.method2053(-112);
            this.field4562 = this.field4560;
            this.method1985(22316);
            this.field4551 &= -25;
        }
        ++field4347;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Llj;)V")
    public final void method947(class60 arg0) {
        this.field4578 = (class660) arg0;
        ++field4443;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)I")
    public final int method973(int arg0, int arg1) {
        ++field4485;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "(B)V")
    public abstract void method1311(byte arg0);

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)Le;")
    public final class385 method1012(int arg0) {
        ++field4448;
        class434 var2 = new class434(arg0);
        this.field4340.method3425(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "()Z")
    public final boolean method994() {
        ++field4483;
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "la", descriptor = "(IIII)V")
    public final void method997(int arg0, int arg1, int arg2, int arg3) {
        this.field4587 = arg0;
        this.field4567 = arg2;
        ++field4350;
        this.field4600 = arg1;
        this.field4614 = arg3;
        this.method1982((byte) 65);
        this.method2056(-14028);
        this.method2019((byte) -123);
        this.method2023(14);
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "()V")
    public final void method1000() {
        if (this.field4516 != null) {
            this.field4516.method1573(64);
        }
        ++field4424;
    }

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "(B)V")
    public abstract void method1308(byte arg0);

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "(I)V")
    private final void method2055(int arg0) {
        if (!this.field4583) {
            float[] var2 = this.field4564;
            float var3 = (float) this.field4533;
            float var4 = (float) this.field4599;
            float var5 = (float) (-this.field4600) * this.field4522 / (float) this.field4614;
            float var6 = (float) (-this.field4587) * this.field4522 / (float) this.field4567;
            float var7 = (float) (-this.field4587 + this.field4332) * this.field4522 / (float) this.field4567;
            float var8 = (float) (this.field4458 - this.field4600) * this.field4522 / (float) this.field4614;
            if (var6 != var7 && var5 != var8) {
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[11] = 0.0F;
                var2[14] = var3 / (-var4 + var3);
                var2[0] = 2.0F / (var7 - var6);
                var2[8] = 0.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F / (-var4 + var3);
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
            } else {
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = 0.0F;
                var2[5] = 1.0F;
                var2[2] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
            }
            this.method2035(88);
            this.field4583 = true;
        }
        if (arg0 != 15) {
            this.field4595 = 2;
        }
        ++field4385;
    }

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "(I)V")
    private final void method2056(int arg0) {
        ++field4452;
        this.field4554 = false;
        if (arg0 != -14028) {
            this.method1994(25, (class319) null, (class319) null);
        }
        this.method2042(arg0 + 14040);
        if (class536.field7501 == this.field4529) {
            this.method1985(22316);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lqw;I)V")
    public final void method1048(class332 arg0, int arg1) {
        this.field4604.method3401(arg0, this, arg1, false);
        ++field4338;
    }
}
