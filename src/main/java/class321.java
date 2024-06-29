import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class321 extends class162 {

    @OriginalMember(owner = "client!qg", name = "Ed", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4748 = new Hashtable();

    @OriginalMember(owner = "client!qg", name = "ee", descriptor = "I")
    public int field4774 = 128;

    @OriginalMember(owner = "client!qg", name = "fe", descriptor = "Lgg;")
    private class115 field4775 = new class115();

    @OriginalMember(owner = "client!qg", name = "je", descriptor = "Lht;")
    private class408 field4779 = new class408();

    @OriginalMember(owner = "client!qg", name = "ke", descriptor = "Lht;")
    public class408 field4780 = new class408();

    @OriginalMember(owner = "client!qg", name = "pe", descriptor = "I")
    public int field4785 = 3;

    @OriginalMember(owner = "client!qg", name = "re", descriptor = "I")
    public int field4787 = 8;

    @OriginalMember(owner = "client!qg", name = "qe", descriptor = "Z")
    private boolean field4786 = false;

    @OriginalMember(owner = "client!qg", name = "oe", descriptor = "Lko;")
    private class348 field4784 = new class348();

    @OriginalMember(owner = "client!qg", name = "ve", descriptor = "[Lef;")
    private class336[] field4791 = new class336[4];

    @OriginalMember(owner = "client!qg", name = "we", descriptor = "[Lef;")
    private class336[] field4792 = new class336[4];

    @OriginalMember(owner = "client!qg", name = "ye", descriptor = "I")
    private int field4794 = -1;

    @OriginalMember(owner = "client!qg", name = "xe", descriptor = "I")
    private int field4793 = -1;

    @OriginalMember(owner = "client!qg", name = "te", descriptor = "I")
    private int field4789 = -1;

    @OriginalMember(owner = "client!qg", name = "ze", descriptor = "[Lef;")
    private class336[] field4795 = new class336[4];

    @OriginalMember(owner = "client!qg", name = "Ae", descriptor = "Lko;")
    private class348 field4796;

    @OriginalMember(owner = "client!qg", name = "Ee", descriptor = "Lko;")
    private class348 field4800;

    @OriginalMember(owner = "client!qg", name = "Fe", descriptor = "Lko;")
    private class348 field4801;

    @OriginalMember(owner = "client!qg", name = "Ge", descriptor = "Lko;")
    private class348 field4802;

    @OriginalMember(owner = "client!qg", name = "He", descriptor = "Lko;")
    private class348 field4803;

    @OriginalMember(owner = "client!qg", name = "Ie", descriptor = "Lko;")
    private class348 field4804;

    @OriginalMember(owner = "client!qg", name = "Je", descriptor = "Lko;")
    private class348 field4805;

    @OriginalMember(owner = "client!qg", name = "Xe", descriptor = "Z")
    private boolean field4819;

    @OriginalMember(owner = "client!qg", name = "Re", descriptor = "I")
    private int field4813;

    @OriginalMember(owner = "client!qg", name = "Ke", descriptor = "I")
    private int field4806;

    @OriginalMember(owner = "client!qg", name = "df", descriptor = "F")
    public float field4825;

    @OriginalMember(owner = "client!qg", name = "Qe", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!qg", name = "yf", descriptor = "I")
    private int field4845;

    @OriginalMember(owner = "client!qg", name = "Lf", descriptor = "F")
    public float field4858;

    @OriginalMember(owner = "client!qg", name = "Ze", descriptor = "F")
    public float field4821;

    @OriginalMember(owner = "client!qg", name = "Vf", descriptor = "I")
    private int field4868;

    @OriginalMember(owner = "client!qg", name = "Kf", descriptor = "F")
    private float field4857;

    @OriginalMember(owner = "client!qg", name = "Mf", descriptor = "[F")
    public float[] field4859;

    @OriginalMember(owner = "client!qg", name = "ff", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!qg", name = "mg", descriptor = "[F")
    private float[] field4885;

    @OriginalMember(owner = "client!qg", name = "Se", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!qg", name = "qf", descriptor = "I")
    public int field4837;

    @OriginalMember(owner = "client!qg", name = "Me", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!qg", name = "tg", descriptor = "F")
    public float field4892;

    @OriginalMember(owner = "client!qg", name = "wf", descriptor = "I")
    public int field4843;

    @OriginalMember(owner = "client!qg", name = "qg", descriptor = "F")
    public float field4889;

    @OriginalMember(owner = "client!qg", name = "Fg", descriptor = "[F")
    private float[] field4904;

    @OriginalMember(owner = "client!qg", name = "zg", descriptor = "I")
    private int field4898;

    @OriginalMember(owner = "client!qg", name = "Dg", descriptor = "I")
    private int field4902;

    @OriginalMember(owner = "client!qg", name = "Ff", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!qg", name = "Yf", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!qg", name = "Ef", descriptor = "F")
    private float field4851;

    @OriginalMember(owner = "client!qg", name = "Kg", descriptor = "F")
    public float field4909;

    @OriginalMember(owner = "client!qg", name = "wg", descriptor = "I")
    private int field4895;

    @OriginalMember(owner = "client!qg", name = "mf", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!qg", name = "Pg", descriptor = "I")
    private int field4914;

    @OriginalMember(owner = "client!qg", name = "rf", descriptor = "F")
    public float field4838;

    @OriginalMember(owner = "client!qg", name = "Og", descriptor = "F")
    private float field4913;

    @OriginalMember(owner = "client!qg", name = "nf", descriptor = "[F")
    private float[] field4834;

    @OriginalMember(owner = "client!qg", name = "Sg", descriptor = "I")
    public int field4917;

    @OriginalMember(owner = "client!qg", name = "jf", descriptor = "[F")
    private float[] field4830;

    @OriginalMember(owner = "client!qg", name = "Xg", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!qg", name = "ah", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!qg", name = "vg", descriptor = "[Ltj;")
    private class131[] field4894;

    @OriginalMember(owner = "client!qg", name = "Tg", descriptor = "I")
    private int field4918;

    @OriginalMember(owner = "client!qg", name = "Yg", descriptor = "F")
    public float field4923;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4589;

    @OriginalMember(owner = "client!qg", name = "Ud", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4764;

    @OriginalMember(owner = "client!qg", name = "be", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!qg", name = "ad", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4718;

    @OriginalMember(owner = "client!qg", name = "pc", descriptor = "J")
    private long field4681;

    @OriginalMember(owner = "client!qg", name = "Qb", descriptor = "J")
    private long field4656;

    @OriginalMember(owner = "client!qg", name = "Df", descriptor = "Z")
    public boolean field4850;

    @OriginalMember(owner = "client!qg", name = "Nf", descriptor = "I")
    public int field4860;

    @OriginalMember(owner = "client!qg", name = "eg", descriptor = "Ljava/lang/String;")
    private String field4877;

    @OriginalMember(owner = "client!qg", name = "Bf", descriptor = "Z")
    public boolean field4848;

    @OriginalMember(owner = "client!qg", name = "vf", descriptor = "Z")
    public boolean field4842;

    @OriginalMember(owner = "client!qg", name = "Te", descriptor = "Z")
    private boolean field4815;

    @OriginalMember(owner = "client!qg", name = "Wg", descriptor = "Z")
    public boolean field4921;

    @OriginalMember(owner = "client!qg", name = "gf", descriptor = "Z")
    private boolean field4828;

    @OriginalMember(owner = "client!qg", name = "bf", descriptor = "Ljava/lang/String;")
    private String field4823;

    @OriginalMember(owner = "client!qg", name = "pf", descriptor = "Z")
    public boolean field4836;

    @OriginalMember(owner = "client!qg", name = "lg", descriptor = "Z")
    private boolean field4884;

    @OriginalMember(owner = "client!qg", name = "de", descriptor = "Llt;")
    public class474 field4773;

    @OriginalMember(owner = "client!qg", name = "me", descriptor = "Lov;")
    public class122 field4782;

    @OriginalMember(owner = "client!qg", name = "ie", descriptor = "Lme;")
    private class129 field4778;

    @OriginalMember(owner = "client!qg", name = "ge", descriptor = "Lup;")
    private class179 field4776;

    @OriginalMember(owner = "client!qg", name = "ae", descriptor = "Lfs;")
    private class387 field4770;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!qg", name = "Jb", descriptor = "Lmt;")
    public static class271 field4649 = null;

    @OriginalMember(owner = "client!qg", name = "pd", descriptor = "Lob;")
    public static class516 field4733 = new class516("", 14);

    @OriginalMember(owner = "client!qg", name = "If", descriptor = "F")
    public float field4855;

    @OriginalMember(owner = "client!qg", name = "Zf", descriptor = "F")
    private float field4872;

    @OriginalMember(owner = "client!qg", name = "bg", descriptor = "F")
    public float field4874;

    @OriginalMember(owner = "client!qg", name = "cg", descriptor = "F")
    public float field4875;

    @OriginalMember(owner = "client!qg", name = "hg", descriptor = "F")
    public float field4880;

    @OriginalMember(owner = "client!qg", name = "ng", descriptor = "F")
    public float field4886;

    @OriginalMember(owner = "client!qg", name = "sg", descriptor = "F")
    public float field4891;

    @OriginalMember(owner = "client!qg", name = "Gg", descriptor = "F")
    private float field4905;

    @OriginalMember(owner = "client!qg", name = "Vg", descriptor = "F")
    private float field4920;

    @OriginalMember(owner = "client!qg", name = "Zg", descriptor = "F")
    public float field4924;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!qg", name = "mb", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!qg", name = "nb", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!qg", name = "ob", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!qg", name = "pb", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!qg", name = "qb", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!qg", name = "rb", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!qg", name = "sb", descriptor = "I")
    private int field4632;

    @OriginalMember(owner = "client!qg", name = "tb", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!qg", name = "ub", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!qg", name = "vb", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!qg", name = "wb", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!qg", name = "xb", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!qg", name = "yb", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!qg", name = "zb", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!qg", name = "Ab", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!qg", name = "Bb", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!qg", name = "Cb", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!qg", name = "Db", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!qg", name = "Eb", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!qg", name = "Fb", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!qg", name = "Gb", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!qg", name = "Hb", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!qg", name = "Ib", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!qg", name = "Kb", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!qg", name = "Lb", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!qg", name = "Mb", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!qg", name = "Nb", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!qg", name = "Ob", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!qg", name = "Pb", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!qg", name = "Rb", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!qg", name = "Sb", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!qg", name = "Tb", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!qg", name = "Ub", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!qg", name = "Vb", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!qg", name = "Wb", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!qg", name = "Xb", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!qg", name = "Yb", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!qg", name = "Zb", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!qg", name = "ac", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!qg", name = "bc", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!qg", name = "cc", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!qg", name = "dc", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!qg", name = "ec", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!qg", name = "fc", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!qg", name = "gc", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!qg", name = "hc", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!qg", name = "ic", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!qg", name = "jc", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!qg", name = "kc", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!qg", name = "lc", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!qg", name = "mc", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!qg", name = "nc", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!qg", name = "oc", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!qg", name = "qc", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!qg", name = "rc", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!qg", name = "sc", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!qg", name = "tc", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!qg", name = "uc", descriptor = "I")
    private int field4686;

    @OriginalMember(owner = "client!qg", name = "vc", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!qg", name = "wc", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!qg", name = "xc", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!qg", name = "yc", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!qg", name = "zc", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!qg", name = "Ac", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!qg", name = "Bc", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!qg", name = "Cc", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!qg", name = "Dc", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!qg", name = "Ec", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!qg", name = "Fc", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!qg", name = "Gc", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!qg", name = "Hc", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!qg", name = "Ic", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!qg", name = "Jc", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!qg", name = "Kc", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!qg", name = "Lc", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!qg", name = "Mc", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!qg", name = "Nc", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!qg", name = "Oc", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!qg", name = "Pc", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!qg", name = "Qc", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!qg", name = "Rc", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!qg", name = "Sc", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!qg", name = "Tc", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!qg", name = "Uc", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!qg", name = "Vc", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!qg", name = "Wc", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!qg", name = "Xc", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!qg", name = "Yc", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!qg", name = "Zc", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!qg", name = "bd", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!qg", name = "cd", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!qg", name = "dd", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!qg", name = "ed", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!qg", name = "fd", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!qg", name = "gd", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!qg", name = "hd", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!qg", name = "id", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!qg", name = "jd", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!qg", name = "kd", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!qg", name = "ld", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!qg", name = "md", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!qg", name = "nd", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!qg", name = "od", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!qg", name = "qd", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!qg", name = "rd", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!qg", name = "sd", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!qg", name = "td", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!qg", name = "ud", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!qg", name = "vd", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!qg", name = "wd", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!qg", name = "xd", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!qg", name = "yd", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!qg", name = "zd", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!qg", name = "Ad", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!qg", name = "Bd", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!qg", name = "Cd", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!qg", name = "Dd", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!qg", name = "Fd", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!qg", name = "Gd", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!qg", name = "Hd", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!qg", name = "Id", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!qg", name = "Jd", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!qg", name = "Kd", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!qg", name = "Ld", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!qg", name = "Md", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!qg", name = "Nd", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!qg", name = "Od", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!qg", name = "Pd", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!qg", name = "Qd", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!qg", name = "Rd", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!qg", name = "Sd", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!qg", name = "Td", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!qg", name = "Vd", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!qg", name = "Wd", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!qg", name = "Xd", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!qg", name = "Yd", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!qg", name = "Zd", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!qg", name = "ce", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!qg", name = "he", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!qg", name = "le", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!qg", name = "Be", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!qg", name = "Ce", descriptor = "I")
    public int field4798;

    @OriginalMember(owner = "client!qg", name = "De", descriptor = "I")
    private int field4799;

    @OriginalMember(owner = "client!qg", name = "We", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!qg", name = "lf", descriptor = "I")
    private int field4832;

    @OriginalMember(owner = "client!qg", name = "sf", descriptor = "I")
    private int field4839;

    @OriginalMember(owner = "client!qg", name = "uf", descriptor = "I")
    public int field4841;

    @OriginalMember(owner = "client!qg", name = "xf", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!qg", name = "zf", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!qg", name = "Gf", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!qg", name = "Jf", descriptor = "I")
    private int field4856;

    @OriginalMember(owner = "client!qg", name = "Qf", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!qg", name = "Sf", descriptor = "I")
    private int field4865;

    @OriginalMember(owner = "client!qg", name = "Xf", descriptor = "I")
    private int field4870;

    @OriginalMember(owner = "client!qg", name = "ag", descriptor = "I")
    private int field4873;

    @OriginalMember(owner = "client!qg", name = "gg", descriptor = "I")
    public int field4879;

    @OriginalMember(owner = "client!qg", name = "ug", descriptor = "I")
    private int field4893;

    @OriginalMember(owner = "client!qg", name = "Eg", descriptor = "I")
    private int field4903;

    @OriginalMember(owner = "client!qg", name = "Hg", descriptor = "I")
    private int field4906;

    @OriginalMember(owner = "client!qg", name = "Ng", descriptor = "I")
    private int field4912;

    @OriginalMember(owner = "client!qg", name = "fg", descriptor = "J")
    private long field4878;

    @OriginalMember(owner = "client!qg", name = "Mg", descriptor = "Lkk;")
    private class125 field4911;

    @OriginalMember(owner = "client!qg", name = "cf", descriptor = "Lce;")
    private class201 field4824;

    @OriginalMember(owner = "client!qg", name = "jg", descriptor = "Lwt;")
    public class202 field4882;

    @OriginalMember(owner = "client!qg", name = "bh", descriptor = "Lwt;")
    public class202 field4926;

    @OriginalMember(owner = "client!qg", name = "Hf", descriptor = "Lbb;")
    public class217 field4854;

    @OriginalMember(owner = "client!qg", name = "dg", descriptor = "Lbb;")
    public class217 field4876;

    @OriginalMember(owner = "client!qg", name = "ef", descriptor = "Ljp;")
    public class236 field4826;

    @OriginalMember(owner = "client!qg", name = "Rf", descriptor = "Ljp;")
    public class236 field4864;

    @OriginalMember(owner = "client!qg", name = "Rg", descriptor = "Ljp;")
    public class236 field4916;

    @OriginalMember(owner = "client!qg", name = "of", descriptor = "Luv;")
    private class243 field4835;

    @OriginalMember(owner = "client!qg", name = "Jg", descriptor = "Luv;")
    private class243 field4908;

    @OriginalMember(owner = "client!qg", name = "se", descriptor = "Lef;")
    private class336 field4788;

    @OriginalMember(owner = "client!qg", name = "ue", descriptor = "Lef;")
    private class336 field4790;

    @OriginalMember(owner = "client!qg", name = "Ye", descriptor = "Lht;")
    public class408 field4820;

    @OriginalMember(owner = "client!qg", name = "Ug", descriptor = "Lht;")
    public class408 field4919;

    @OriginalMember(owner = "client!qg", name = "Ne", descriptor = "Lph;")
    public class453 field4809;

    @OriginalMember(owner = "client!qg", name = "Pe", descriptor = "Lph;")
    public class453 field4811;

    @OriginalMember(owner = "client!qg", name = "af", descriptor = "Lph;")
    public class453 field4822;

    @OriginalMember(owner = "client!qg", name = "hf", descriptor = "Lph;")
    public class453 field4829;

    @OriginalMember(owner = "client!qg", name = "Of", descriptor = "Lph;")
    public class453 field4861;

    @OriginalMember(owner = "client!qg", name = "kg", descriptor = "Lph;")
    public class453 field4883;

    @OriginalMember(owner = "client!qg", name = "rg", descriptor = "Lph;")
    public class453 field4890;

    @OriginalMember(owner = "client!qg", name = "Ag", descriptor = "Lph;")
    public class453 field4899;

    @OriginalMember(owner = "client!qg", name = "Ig", descriptor = "Lph;")
    public class453 field4907;

    @OriginalMember(owner = "client!qg", name = "Qg", descriptor = "Lph;")
    public class453 field4915;

    @OriginalMember(owner = "client!qg", name = "Af", descriptor = "Lls;")
    private class92 field4847;

    @OriginalMember(owner = "client!qg", name = "ne", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4783;

    @OriginalMember(owner = "client!qg", name = "Le", descriptor = "Z")
    public boolean field4807;

    @OriginalMember(owner = "client!qg", name = "Oe", descriptor = "Z")
    public boolean field4810;

    @OriginalMember(owner = "client!qg", name = "Ue", descriptor = "Z")
    public boolean field4816;

    @OriginalMember(owner = "client!qg", name = "Ve", descriptor = "Z")
    private boolean field4817;

    @OriginalMember(owner = "client!qg", name = "kf", descriptor = "Z")
    public boolean field4831;

    @OriginalMember(owner = "client!qg", name = "tf", descriptor = "Z")
    private boolean field4840;

    @OriginalMember(owner = "client!qg", name = "Cf", descriptor = "Z")
    public boolean field4849;

    @OriginalMember(owner = "client!qg", name = "Pf", descriptor = "Z")
    public boolean field4862;

    @OriginalMember(owner = "client!qg", name = "Tf", descriptor = "Z")
    private boolean field4866;

    @OriginalMember(owner = "client!qg", name = "Uf", descriptor = "Z")
    private boolean field4867;

    @OriginalMember(owner = "client!qg", name = "Wf", descriptor = "Z")
    private boolean field4869;

    @OriginalMember(owner = "client!qg", name = "ig", descriptor = "Z")
    private boolean field4881;

    @OriginalMember(owner = "client!qg", name = "og", descriptor = "Z")
    private boolean field4887;

    @OriginalMember(owner = "client!qg", name = "pg", descriptor = "Z")
    private boolean field4888;

    @OriginalMember(owner = "client!qg", name = "xg", descriptor = "Z")
    public boolean field4896;

    @OriginalMember(owner = "client!qg", name = "yg", descriptor = "Z")
    private boolean field4897;

    @OriginalMember(owner = "client!qg", name = "Cg", descriptor = "Z")
    public boolean field4901;

    @OriginalMember(owner = "client!qg", name = "Lg", descriptor = "Z")
    private boolean field4910;

    @OriginalMember(owner = "client!qg", name = "Bg", descriptor = "[Lgo;")
    private class440[] field4900;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "()Z")
    public final boolean method481() {
        ++field4731;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "()V")
    public final void method427() {
        for (class439 var1 = this.field4784.method2257((byte) 120); var1 != null; var1 = this.field4784.method2256(-116)) {
            ((class47) var1).method354(79);
        }
        ++field4642;
        if (this.field4778 != null) {
            this.field4778.method950((byte) -122);
        }
        if (this.field4718 != null) {
            this.method2069(104);
            Enumeration var2 = this.field4748.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4748.get(var3);
                this.field4718.releaseSurface(var3, var4);
            }
            this.field4718.release();
            this.field4718 = null;
        }
        if (this.field4786) {
            class86.method701(false, true, 0);
            this.field4786 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "()Z")
    public final boolean method446() {
        ++field4601;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "()V")
    public final void method501() {
        this.field4807 = false;
        ++field4594;
        this.field4770.method2432(false, 0, false, -1);
        this.method2032(8158);
        this.method2071(30188);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)V")
    public final synchronized void method2007(int arg0, boolean arg1, int arg2) {
        ++field4655;
        if (!arg1) {
            class242 var4 = new class242(arg2);
            var4.field6399 = (long) arg0;
            this.field4801.method2270(0, var4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "JA", descriptor = "(II)V")
    public final void method511(int arg0, int arg1) {
        ++field4588;
        if (this.field4871 != arg0 || this.field4843 != arg1) {
            this.field4871 = arg0;
            this.field4843 = arg1;
            this.method2077(-107);
            this.method2032(8158);
            if (this.field4856 == 3) {
                this.method2033((byte) -126);
                return;
            }
            if (this.field4856 != 2) {
                return;
            }
            this.method2084(-15849);
        }
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V")
    public final void method507(int arg0) {
        ++field4740;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field4774 = arg0;
            this.field4773.method2839(61);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)V")
    public final void method2008(int arg0, int arg1) {
        if (arg1 != 848) {
            this.method2067(14, 94, -52);
        }
        ++field4726;
        this.method2049(-103, arg0, true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Llo;IIII)Lc;")
    public final class121 method499(class527 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4766;
        return new class453(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
    public final void method2009(int arg0, boolean arg1) {
        class204.field2945[2] = (float) class388.method2441(arg0, 255) / 255.0F;
        ++field4648;
        class204.field2945[1] = (float) class388.method2441(arg0, 65280) / 65280.0F;
        if (arg1) {
            this.field4816 = true;
        }
        class204.field2945[3] = (float) (arg0 >>> 24) / 255.0F;
        class204.field2945[0] = (float) class388.method2441(16711680, arg0) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class204.field2945, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FIF)V")
    public final void method2010(float arg0, int arg1, float arg2) {
        int var4 = -42 % ((-20 - arg1) / 54);
        this.field4857 = arg0;
        ++field4670;
        this.field4851 = arg2;
        if (!this.field4807) {
            this.method2032(8158);
        }
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)V")
    private final void method2011(int arg0) {
        if (this.field4924 != 0.0F) {
            float var2 = this.field4858 / (this.field4924 + this.field4858);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field4920 * (-var2 + 1.0F) / this.field4924;
            this.field4885[10] = this.field4905 + var4;
            this.field4885[14] = this.field4920 * var3;
        } else {
            this.field4885[10] = this.field4905;
            this.field4885[14] = this.field4920;
        }
        ++field4721;
        if (arg0 == 23247) {
            this.field4909 = (float) this.field4843 + -this.field4924;
            this.field4923 = (this.field4885[14] - (float) this.field4843) / this.field4885[10];
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4634;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZB[B)Lce;")
    public final class201 method2012(int arg0, int arg1, boolean arg2, byte arg3, byte[] arg4) {
        int var6 = 75 % ((63 - arg3) / 39);
        ++field4591;
        return (class201) (!this.field4815 || arg2 && !this.field4828 ? new class320(this, arg0, arg4, arg1) : new class94(this, arg0, arg4, arg1, arg2));
    }

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "()Z")
    public final boolean method513() {
        ++field4639;
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ldt;Z)Lf;")
    public final class528 method517(class158 arg0, boolean arg1) {
        ++field4593;
        int[] var3 = new int[arg0.field2391 * arg0.field2388];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2390 != null) {
            for (int var6 = 0; arg0.field2388 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field2391 < ~var7; ++var7) {
                    var3[var5++] = class29.method239(arg0.field2386[class388.method2441(arg0.field2384[var4], 255)], arg0.field2390[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~arg0.field2388 < ~var8; ++var8) {
                for (int var10 = 0; arg0.field2391 > var10; ++var10) {
                    int var11 = arg0.field2386[255 & arg0.field2384[var4++]];
                    var3[var5++] = var11 == 0 ? 0 : class29.method239(-16777216, var11);
                }
            }
        }
        class528 var9 = this.method527(var3, 0, arg0.field2391, arg0.field2391, arg0.field2388);
        var9.method141(arg0.field2392, arg0.field2385, arg0.field2387, arg0.field2389);
        return var9;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B[BZII)Luv;")
    public final class243 method2013(byte arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        ++field4710;
        int var6 = -47 / ((arg0 - -11) / 39);
        return (class243) (!this.field4815 || arg2 && !this.field4828 ? new class327(this, arg3, arg1, arg4) : new class343(this, arg3, arg1, arg4, arg2));
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
    private final void method2014(byte arg0) {
        ++field4608;
        this.method2008(-2, 848);
        for (int var2 = this.field4844 + -1; ~var2 <= -1; --var2) {
            this.method2030(var2, (byte) -124);
            this.method2042((class440) null, 0);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2070(77, 8448, 8448);
        this.method2053(71, 2, 34168, 770);
        this.method2020((byte) -102);
        this.field4818 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4853 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4840 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4869 = true;
        this.method2018(true, 22090);
        this.method2024(true, true);
        this.method2016((byte) -56, true);
        this.method2052((byte) 96, true);
        this.method2043(0);
        this.field4718.setSwapInterval(0);
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
        int var5 = 93 / ((45 - arg0) / 37);
        this.field4813 = this.field4917 = -1;
        this.method492();
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V")
    private final void method2015(byte arg0) {
        ++field4600;
        if (~this.field4898 >= ~this.field4845 && ~this.field4868 <= ~this.field4895) {
            OpenGL.glScissor(this.field4902 + this.field4898, this.field4914 - -this.field4737 - this.field4868, -this.field4898 + this.field4845, -this.field4895 + this.field4868);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        int var2 = 61 % ((-49 - arg0) / 55);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BZ)V")
    public final void method2016(byte arg0, boolean arg1) {
        ++field4724;
        if (arg1 == !this.field4866) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field4832 &= -32;
            this.field4866 = arg1;
        }
        if (arg0 != -56) {
            this.field4826 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[Ltj;)V")
    public final void method464(int arg0, class131[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field4894[var3] = arg1[var3];
        }
        ++field4618;
        this.field4846 = arg0;
        if (this.field4856 != 1) {
            this.method2029(65280);
        }
    }

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "(I)V")
    public final void method2017(int arg0) {
        ++field4676;
        if (arg0 == -5) {
            if (this.field4832 != 4) {
                this.method2026(false);
                this.method2018(false, 22090);
                this.method2024(true, false);
                this.method2016((byte) -56, false);
                this.method2052((byte) 109, false);
                this.method2008(-2, arg0 ^ -853);
                this.method2061(1, (byte) -74);
                this.method2068(0, 13134);
                this.field4832 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V")
    public final void method2018(boolean arg0, int arg1) {
        ++field4729;
        if (this.field4881 == !arg0) {
            this.field4881 = arg0;
            this.method2071(arg1 + 8098);
            this.field4832 &= -32;
        }
        if (arg1 != 22090) {
            this.field4880 = 0.22082683F;
        }
    }

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "(I)V")
    private final void method2019(int arg0) {
        if (this.field4856 != arg0) {
            this.field4856 = 2;
            this.method2084(-15849);
            this.method2051(arg0 + -3);
            this.field4832 &= -8;
        }
        ++field4684;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V")
    private final void method2020(byte arg0) {
        if (arg0 != -102) {
            this.field4840 = false;
        }
        ++field4633;
        if (this.field4897) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4897 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IZ)V")
    public final synchronized void method2021(int arg0, boolean arg1) {
        ++field4619;
        class242 var3 = new class242(arg0);
        if (!arg1) {
            this.field4922 = 106;
        }
        this.field4802.method2270(0, var3);
    }

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "(I)V")
    private final void method2022(int arg0) {
        if (arg0 != -1) {
            this.method2046(-72);
        }
        if (this.field4856 != 3) {
            this.field4856 = 3;
            this.method2033((byte) -110);
            this.method2051(-1);
            this.field4832 &= -8;
        }
        ++field4609;
    }

    @OriginalMember(owner = "client!qg", name = "va", descriptor = "()V")
    public final void method492() {
        this.field4895 = 0;
        this.field4898 = 0;
        this.field4868 = this.field4737;
        this.field4845 = this.field4749;
        ++field4744;
        OpenGL.glDisable(3089);
        this.method2076(-107);
    }

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "()I")
    public final int method459() {
        ++field4694;
        return this.field4843;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLjaggl/memory/NativeBuffer;III)Luv;")
    public final class243 method2023(boolean arg0, NativeBuffer arg1, int arg2, int arg3, int arg4) {
        ++field4704;
        if (!this.field4815 || arg0 && !this.field4828) {
            return arg2 != 17999 ? null : new class327(this, arg3, arg1);
        } else {
            return new class343(this, arg3, arg1, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZ)V")
    public final void method2024(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field4828 = true;
        }
        if (!this.field4867 == arg1) {
            this.field4867 = arg1;
            this.method2088(-1);
            this.field4832 &= -8;
        }
        ++field4703;
    }

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "()Z")
    public final boolean method474() {
        ++field4732;
        return this.field4776 != null && (~this.field4771 >= -2 || this.field4817);
    }

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "(III)V")
    public final void method535(int arg0, int arg1, int arg2) {
        ++field4739;
        if (~this.field4917 != ~arg0 || this.field4808 != arg1 || this.field4837 != arg2) {
            this.field4917 = arg0;
            this.field4808 = arg1;
            this.field4837 = arg2;
            if (this.field4807) {
                return;
            }
            this.method2032(8158);
            this.method2071(30188);
        }
    }

    @OriginalMember(owner = "client!qg", name = "SA", descriptor = "(IIIIII)Z")
    public final boolean method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4665;
        float var7 = (float) arg2 * this.field4919.field6015 + (float) arg0 * this.field4919.field6021 + (float) arg1 * this.field4919.field6000 + this.field4919.field6011;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4919.field6015 + (float) arg3 * this.field4919.field6021 + (float) arg4 * this.field4919.field6000 + this.field4919.field6011;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4871) || !(var8 < (float) this.field4871)) && (!(var7 > (float) this.field4843) || !((float) this.field4843 < var8))) {
            int var9 = (int) (((float) arg2 * this.field4919.field6003 + (float) arg0 * this.field4919.field6024 + (float) arg1 * this.field4919.field6002 + this.field4919.field6018) * (float) this.field4814 / var7);
            int var10 = (int) (((float) arg5 * this.field4919.field6003 + (float) arg3 * this.field4919.field6024 + (float) arg4 * this.field4919.field6002 + this.field4919.field6018) * (float) this.field4814 / var8);
            if (this.field4880 > (float) var9 && this.field4880 > (float) var10 || (float) var9 > this.field4886 && this.field4886 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4919.field6013 + (float) arg0 * this.field4919.field5992 + (float) arg1 * this.field4919.field6027 + this.field4919.field5991) * (float) this.field4922 / var7);
                int var12 = (int) (((float) arg5 * this.field4919.field6013 + (float) arg3 * this.field4919.field5992 + (float) arg4 * this.field4919.field6027 + this.field4919.field5991) * (float) this.field4922 / var8);
                return (!(this.field4874 > (float) var11) || !((float) var12 < this.field4874)) && (!((float) var11 > this.field4891) || !((float) var12 > this.field4891));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(II)I")
    public final int method2025(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field4814 = 90;
        }
        ++field4641;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && arg0 != 34846 && arg0 != 34844) {
                if (arg0 != 6407) {
                    if (arg0 != 6408 && arg0 != 34847) {
                        if (arg0 != 34843) {
                            if (arg0 != 34842) {
                                if (~arg0 == -6403) {
                                    return 3;
                                } else if (arg0 == 6401) {
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
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method523(Canvas arg0) {
        this.field4764 = null;
        this.field4656 = 0L;
        ++field4650;
        if (arg0 != null && this.field4589 != arg0) {
            if (this.field4748.containsKey(arg0)) {
                Long var2 = (Long) this.field4748.get(arg0);
                this.field4656 = var2;
                this.field4764 = arg0;
            }
        } else {
            this.field4764 = this.field4589;
            this.field4656 = this.field4681;
        }
        if (this.field4764 != null && this.field4656 != 0L) {
            this.field4718.setSurface(this.field4656);
            this.method2081(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(Z)V")
    private final void method2026(boolean arg0) {
        ++field4605;
        if (~this.field4856 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field4749 < -1 && this.field4737 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field4749, (double) this.field4737, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4832 &= -25;
            this.field4856 = 1;
        }
        if (arg0) {
            this.method2058(-120);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
    public final int method518(int arg0, int arg1) {
        ++field4585;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "(I)V")
    public final void method2027(int arg0) {
        ++field4756;
        if (arg0 > -7) {
            this.method444();
        }
        if (~this.field4832 != -9) {
            this.method2019(2);
            this.method2018(true, 22090);
            this.method2016((byte) -56, true);
            this.method2052((byte) 78, true);
            this.method2061(1, (byte) -117);
            this.method2068(0, 13134);
            this.field4832 = 8;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLce;)V")
    public final void method2028(boolean arg0, class201 arg1) {
        ++field4658;
        if (this.field4824 != arg1) {
            if (this.field4815) {
                OpenGL.glBindBufferARB(34963, arg1.method759((byte) -23));
            }
            this.field4824 = arg1;
        }
        if (!arg0) {
            this.field4786 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4712;
        OpenGL.glLineWidth((float) arg5);
        this.method470(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "(I)V")
    private final void method2029(int arg0) {
        ++field4742;
        int var2;
        for (var2 = 0; this.field4846 > var2; ++var2) {
            class131 var3 = this.field4894[var2];
            class66.field1164[0] = (float) var3.method966(119);
            int var4 = var2 + 16386;
            class66.field1164[1] = (float) var3.method969((byte) -24);
            class66.field1164[2] = (float) var3.method965(false);
            class66.field1164[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class66.field1164, 0);
            int var5 = var3.method968(false);
            float var6 = var3.method967(-118) / 255.0F;
            class66.field1164[0] = (float) class388.method2441(255, var5 >> 16) * var6;
            class66.field1164[2] = var6 * (float) class388.method2441(var5, 255);
            class66.field1164[1] = var6 * (float) class388.method2441(255, var5 >> 8);
            OpenGL.glLightfv(var4, 4609, class66.field1164, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method964((byte) -120) * var3.method964((byte) -124)));
            OpenGL.glEnable(var4);
        }
        while (var2 < this.field4903) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        if (arg0 != 65280) {
            this.field4902 = -124;
        }
        this.field4903 = this.field4846;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
    public final void method2030(int arg0, byte arg1) {
        int var3 = 24 % ((-76 - arg1) / 44);
        if (this.field4906 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field4906 = arg0;
        }
        ++field4714;
    }

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "(I)V")
    private final void method2031(int arg0) {
        class204.field2945[2] = this.field4875 * this.field4838;
        class204.field2945[0] = this.field4875 * this.field4825;
        class204.field2945[3] = 1.0F;
        class204.field2945[1] = this.field4892 * this.field4875;
        ++field4668;
        OpenGL.glLightModelfv(2899, class204.field2945, arg0);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V")
    public final void method433(boolean arg0) {
        ++field4753;
    }

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "()F")
    public final float method477() {
        ++field4592;
        return this.field4924;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([IIIII)Lf;")
    public final class528 method527(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4762;
        return new class308(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lds;[Ldt;Z)Loa;")
    public final class488 method453(class12 arg0, class158[] arg1, boolean arg2) {
        ++field4688;
        return new class376(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "()Z")
    public final boolean method524() {
        ++field4730;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "(I)V")
    private final void method2032(int arg0) {
        ++field4644;
        int var2;
        if (!this.field4807) {
            this.field4872 = (float) (-this.field4837 + this.field4843) - this.field4857;
            this.field4855 = -((float) this.field4808 * this.field4851) + this.field4872;
            if ((float) this.field4871 > this.field4855) {
                this.field4855 = (float) this.field4871;
            }
            OpenGL.glFogf(2915, this.field4855);
            OpenGL.glFogf(2916, this.field4872);
            var2 = this.field4917;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field4918;
        }
        class204.field2945[2] = (float) class388.method2441(255, var2) / 255.0F;
        if (arg0 != 8158) {
            this.field4773 = null;
        }
        class204.field2945[1] = (float) class388.method2441(var2, 65280) / 65280.0F;
        class204.field2945[0] = (float) class388.method2441(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class204.field2945, 0);
        if (this.field4807) {
            this.field4770.field5739.method1828(0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V")
    private final void method2033(byte arg0) {
        ++field4691;
        float var2 = (float) (-this.field4925) * this.field4913 / (float) this.field4814;
        if (arg0 > -94) {
            this.method520(-22, 0.09183387F, 1.2803564F, 0.13605134F, -0.74962616F, 0.6551471F);
        }
        float var3 = (float) (-this.field4833) * this.field4913 / (float) this.field4922;
        float var4 = (float) (-this.field4925 + this.field4749) * this.field4913 / (float) this.field4814;
        float var5 = (float) (-this.field4833 + this.field4737) * this.field4913 / (float) this.field4922;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field4871 - this.field4924), (double) ((float) this.field4843 + -this.field4924));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIF)Ltj;")
    public final class131 method483(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4636;
        return new class235(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
    public final void method468(int arg0) {
        this.method2080(-67);
        ++field4717;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3) {
        ++field4611;
        this.field4778.method953(-32324, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qg", name = "FA", descriptor = "()I")
    public final int method489() {
        ++field4624;
        return this.field4799 + this.field4797 + this.field4798;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIII)V")
    public final void method2034(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
        ++field4667;
        OpenGL.glTexEnvi(arg3, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "(I)V")
    public final void method2035(int arg0) {
        if (this.field4832 != 2) {
            this.method2026(false);
            this.method2018(false, 22090);
            this.method2024(true, false);
            this.method2016((byte) -56, false);
            this.method2052((byte) 121, false);
            this.method2008(-2, 848);
            this.field4832 = 2;
        }
        int var2 = -14 / ((69 - arg0) / 54);
        ++field4628;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLef;)V")
    public final void method2036(byte arg0, class336 arg1) {
        ++field4693;
        if (this.field4862) {
            this.method2083(58, arg1);
            this.method2062(arg1, (byte) -117);
        } else {
            if (~this.field4794 <= -4) {
                throw new RuntimeException();
            }
            if (this.field4794 >= 0) {
                this.field4795[this.field4794].method1437((byte) -115);
            }
            this.field4790 = this.field4788 = this.field4795[++this.field4794] = arg1;
            this.field4790.method1438((byte) -113);
        }
        if (arg0 < 101) {
            this.method2031(122);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZBZ)V")
    public final void method2037(int arg0, boolean arg1, byte arg2, boolean arg3) {
        if (arg2 == -96) {
            if (this.field4839 != arg0) {
                if (arg0 < 0) {
                    this.method2020((byte) -102);
                    this.method2042((class440) null, 0);
                    this.method2068(0, 13134);
                    if (!this.field4807) {
                        this.field4770.method2432(arg1, 0, arg3, -1);
                    }
                } else {
                    class236 var5 = this.field4773.method2838(arg0, -16681);
                    class216 var6 = super.field2449.method935(arg0, -8037);
                    if (~var6.field3096 == -1 && var6.field3111 == 0) {
                        this.method2020((byte) -102);
                    } else {
                        int var7 = var6.field3112 ? 64 : 128;
                        int var8 = var7 * 50;
                        this.method2066((float) (this.field4781 % var8 * var6.field3111) / (float) var8, 5890, 0.0F, (float) (this.field4781 % var8 * var6.field3096) / (float) var8);
                    }
                    if (this.field4807) {
                        this.field4770.method2432(arg1, 3, arg3, arg2 ^ 95);
                        this.method2042(var5, 0);
                        this.method2068(var6.field3100, arg2 ^ -13074);
                    } else {
                        this.field4770.method2432(arg1, var6.field3109, arg3, arg2 + 95);
                        this.field4770.method2434(var6.field3118, var6.field3117, (byte) 99);
                        if (!this.field4770.method2435((byte) 67, var5, var6.field3100)) {
                            this.method2042(var5, 0);
                            this.method2068(var6.field3100, 13134);
                        }
                    }
                }
                this.field4839 = arg0;
            }
            ++field4620;
            this.field4832 &= -8;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FZ)V")
    public final void method2038(float arg0, boolean arg1) {
        if (this.field4913 != arg0) {
            this.field4913 = arg0;
            if (~this.field4856 == -4) {
                this.method2033((byte) -116);
            }
        }
        ++field4701;
        if (arg1) {
            this.field4859 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(Z)V")
    private final void method2039(boolean arg0) {
        class204.field2945[1] = this.field4892 * this.field4821;
        class204.field2945[0] = this.field4825 * this.field4821;
        class204.field2945[3] = 1.0F;
        class204.field2945[2] = this.field4838 * this.field4821;
        ++field4625;
        OpenGL.glLightfv(16384, 4609, class204.field2945, 0);
        class204.field2945[2] = -this.field4889 * this.field4838;
        class204.field2945[0] = -this.field4889 * this.field4825;
        class204.field2945[1] = -this.field4889 * this.field4892;
        class204.field2945[3] = 1.0F;
        if (arg0) {
            this.method513();
        }
        OpenGL.glLightfv(16385, 4609, class204.field2945, 0);
    }

    @OriginalMember(owner = "client!qg", name = "XA", descriptor = "(IFFFFF)V")
    public final void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4660;
        boolean var7 = this.field4813 != arg0;
        if (var7 || this.field4821 != arg1 || this.field4889 != arg2) {
            this.field4889 = arg2;
            this.field4813 = arg0;
            this.field4821 = arg1;
            if (var7) {
                this.field4892 = (float) (this.field4813 & 65280) / 65280.0F;
                this.field4825 = (float) (this.field4813 & 16711680) / 1.671168E7F;
                this.field4838 = (float) (this.field4813 & 255) / 255.0F;
                this.method2031(0);
            }
            this.method2039(false);
        }
        if (this.field4830[0] != arg3 || this.field4830[1] != arg4 || this.field4830[2] != arg5) {
            this.field4830[0] = arg3;
            this.field4830[1] = arg4;
            this.field4830[2] = arg5;
            this.field4834[2] = -arg5;
            this.field4834[0] = -arg3;
            this.field4834[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4859[2] = arg5 * var8;
            this.field4859[0] = arg3 * var8;
            this.field4859[1] = arg4 * var8;
            this.field4904[1] = -this.field4859[1];
            this.field4904[0] = -this.field4859[0];
            this.field4904[2] = -this.field4859[2];
            this.method2090(16384);
            this.field4879 = (int) (arg3 * 256.0F / arg4);
            this.field4841 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method435(Rectangle[] arg0, int arg1) {
        ++field4647;
        this.method521();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB)V")
    public final void method2040(boolean arg0, byte arg1) {
        if (arg0 == !this.field4888) {
            this.field4888 = arg0;
            this.method2088(-1);
        }
        ++field4689;
        int var3 = 81 / ((-65 - arg1) / 38);
    }

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "(I)V")
    public final void method2041(int arg0) {
        OpenGL.glPopMatrix();
        ++field4738;
        if (arg0 != -1) {
            this.method497((class413) null);
        }
    }

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "(Lia;)V")
    public final void method497(class413 arg0) {
        this.field4919 = (class408) arg0;
        ++field4669;
        this.field4820.method2531((byte) -107, this.field4919);
        if (this.field4856 != 1) {
            this.method2051(-1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lgo;I)V")
    public final void method2042(class440 arg0, int arg1) {
        ++field4651;
        if (arg1 != 0) {
            this.field4796 = null;
        }
        class440 var3 = this.field4900[this.field4906];
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field6424);
            } else {
                if (var3 != null) {
                    if (~arg0.field6424 != ~var3.field6424) {
                        OpenGL.glDisable(var3.field6424);
                        OpenGL.glEnable(arg0.field6424);
                    }
                } else {
                    OpenGL.glEnable(arg0.field6424);
                }
                OpenGL.glBindTexture(arg0.field6424, arg0.method2676(27180));
            }
            this.field4900[this.field4906] = arg0;
        }
        this.field4832 &= -2;
    }

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "(IIIII)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4690;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ll;)V")
    public final void method449(class16 arg0) {
        this.field4783 = ((class47) arg0).field718;
        ++field4673;
        if (this.field4835 == null) {
            class382 var2 = new class382(80);
            if (!this.field4850) {
                var2.method2420(-1.0F, (byte) 4);
                var2.method2420(-1.0F, (byte) 4);
                var2.method2420(0.0F, (byte) 4);
                var2.method2420(0.0F, (byte) 4);
                var2.method2420(1.0F, (byte) 4);
                var2.method2420(1.0F, (byte) 4);
                var2.method2420(-1.0F, (byte) 4);
                var2.method2420(0.0F, (byte) 4);
                var2.method2420(1.0F, (byte) 4);
                var2.method2420(1.0F, (byte) 4);
                var2.method2420(1.0F, (byte) 4);
                var2.method2420(1.0F, (byte) 4);
                var2.method2420(0.0F, (byte) 4);
                var2.method2420(1.0F, (byte) 4);
                var2.method2420(0.0F, (byte) 4);
                var2.method2420(-1.0F, (byte) 4);
                var2.method2420(1.0F, (byte) 4);
                var2.method2420(0.0F, (byte) 4);
                var2.method2420(0.0F, (byte) 4);
                var2.method2420(0.0F, (byte) 4);
            } else {
                var2.method2421(25785, -1.0F);
                var2.method2421(25785, -1.0F);
                var2.method2421(25785, 0.0F);
                var2.method2421(25785, 0.0F);
                var2.method2421(25785, 1.0F);
                var2.method2421(25785, 1.0F);
                var2.method2421(25785, -1.0F);
                var2.method2421(25785, 0.0F);
                var2.method2421(25785, 1.0F);
                var2.method2421(25785, 1.0F);
                var2.method2421(25785, 1.0F);
                var2.method2421(25785, 1.0F);
                var2.method2421(25785, 0.0F);
                var2.method2421(25785, 1.0F);
                var2.method2421(25785, 0.0F);
                var2.method2421(25785, -1.0F);
                var2.method2421(25785, 1.0F);
                var2.method2421(25785, 0.0F);
                var2.method2421(25785, 0.0F);
                var2.method2421(25785, 0.0F);
            }
            this.field4835 = this.method2013((byte) 40, var2.field4326, false, 20, var2.field4333);
            this.field4882 = new class202(this.field4835, 5126, 3, 0);
            this.field4926 = new class202(this.field4835, 5126, 2, 12);
            this.field4775.method847(true, this);
        }
    }

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "(I)V")
    public final void method2043(int arg0) {
        if (arg0 != 0) {
            this.method472(-121, 114);
        }
        ++field4614;
        if (~this.field4856 != -1) {
            this.field4856 = 0;
            this.field4832 &= -32;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLuv;)V")
    public final void method2044(byte arg0, class243 arg1) {
        ++field4754;
        if (this.field4908 != arg1) {
            if (this.field4815) {
                OpenGL.glBindBufferARB(34962, arg1.method1568(-118));
            }
            this.field4908 = arg1;
        }
        if (arg0 != -62) {
            this.method2062((class336) null, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "pa", descriptor = "(IIII)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field4749 > ~arg2) {
            arg2 = this.field4749;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        ++field4725;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~this.field4737 > ~arg3) {
            arg3 = this.field4737;
        }
        this.field4895 = arg1;
        this.field4898 = arg0;
        this.field4845 = arg2;
        this.field4868 = arg3;
        OpenGL.glEnable(3089);
        this.method2076(-110);
        this.method2015((byte) 50);
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(Z)V")
    public static final void method2045(boolean arg0) {
        ++field4708;
        if (arg0) {
            if (class84.field1407 != null) {
                class84.field1407.method1160(-121);
            }
            if (class204.field2944 != null) {
                class204.field2944.method1160(-112);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "(ILea;II)V")
    public final void method434(int arg0, class381 arg1, int arg2, int arg3) {
        ++field4696;
        class124 var5 = (class124) arg1;
        class92 var6 = var5.field1919;
        this.method2035(124);
        this.method2042(var5.field1919, 0);
        this.method2061(1, (byte) -99);
        this.method2070(72, 8448, 7681);
        this.method2053(-124, 0, 34167, 768);
        float var7 = var6.field1513 / (float) var6.field1522;
        float var8 = var6.field1517 / (float) var6.field1520;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4898) * var7, (float) (-arg3 + this.field4895) * var8);
        OpenGL.glVertex2i(this.field4898, this.field4895);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4898) * var7, (float) (-arg3 + this.field4868) * var8);
        OpenGL.glVertex2i(this.field4898, this.field4868);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4845) * var7, (float) (-arg3 + this.field4868) * var8);
        OpenGL.glVertex2i(this.field4845, this.field4868);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4845) * var7, (float) (-arg3 + this.field4895) * var8);
        OpenGL.glVertex2i(this.field4845, this.field4895);
        OpenGL.glEnd();
        this.method2053(-127, 0, 5890, 768);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lmd;)V")
    public final void method455(class379 arg0) {
        ++field4707;
        this.field4911 = (class125) arg0;
    }

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "()Z")
    public final boolean method522() {
        ++field4671;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "(I)V")
    private final void method2046(int arg0) {
        if (arg0 <= 14) {
            this.field4839 = 37;
        }
        ++field4640;
        OpenGL.glViewport(this.field4902, this.field4914, this.field4749, this.field4737);
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "()Lia;")
    public final class413 method439() {
        ++field4581;
        return this.field4779;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        ++field4719;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "()Z")
    public final boolean method442() {
        ++field4763;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IJ)V")
    public final synchronized void method2047(int arg0, long arg1) {
        ++field4579;
        class439 var4 = new class439();
        int var5 = 118 % ((arg0 - -18) / 54);
        var4.field6399 = arg1;
        this.field4805.method2270(0, var4);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(IIII)V")
    public final void method2048(int arg0, int arg1, int arg2, int arg3) {
        ++field4723;
        OpenGL.glDrawArrays(arg3, arg2, arg1);
        int var5 = -81 % ((-56 - arg0) / 53);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V")
    public final void method2049(int arg0, int arg1, boolean arg2) {
        ++field4638;
        if (arg0 > -80) {
            this.field4792 = null;
        }
        this.method2037(arg1, true, (byte) -96, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II[I[I)Lea;")
    public final class381 method431(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4637;
        return class24.method199(-117, arg0, arg1, this, arg2, arg3);
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "()I")
    public final int method462() {
        ++field4711;
        int var1 = this.field4873;
        this.field4873 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(B)V")
    public final void method2050(byte arg0) {
        if (arg0 > -23) {
            this.field4787 = -54;
        }
        if (this.field4832 != 16) {
            this.method2022(-1);
            this.method2018(true, 22090);
            this.method2016((byte) -56, true);
            this.method2052((byte) 123, true);
            this.method2061(1, (byte) -90);
            this.method2068(0, 13134);
            this.field4832 = 16;
        }
        ++field4700;
    }

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "()Z")
    public final boolean method469() {
        ++field4697;
        return this.field4910 && (!this.method529() || this.field4817);
    }

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "()Lia;")
    public final class413 method428() {
        ++field4635;
        return new class408();
    }

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "(I)V")
    private final void method2051(int arg0) {
        if (arg0 != -1) {
            field4733 = null;
        }
        OpenGL.glLoadIdentity();
        ++field4666;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field4919.method2526(111), 0);
        if (this.field4807) {
            this.field4770.field5739.method1827((byte) -26);
        }
        this.method2090(16384);
        this.method2029(65280);
    }

    @OriginalMember(owner = "client!qg", name = "da", descriptor = "(IIIII)V")
    public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4720;
        this.method2058(-2);
        this.method2061(arg4, (byte) -93);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(BZ)V")
    public final void method2052(byte arg0, boolean arg1) {
        if (this.field4887 == !arg1) {
            this.field4887 = arg1;
            this.method2055((byte) 56);
            this.field4832 &= -32;
        }
        ++field4706;
        if (arg0 <= 21) {
            this.field4854 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()Z")
    public final boolean method525() {
        ++field4767;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(IIII)V")
    public final void method2053(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
        ++field4598;
        int var5 = -12 % ((arg0 - -51) / 54);
        OpenGL.glTexEnvi(8960, 34192 - -arg1, arg3);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)V")
    public final synchronized void method2054(int arg0, byte arg1) {
        ++field4631;
        class439 var3 = new class439();
        var3.field6399 = (long) arg0;
        this.field4804.method2270(0, var3);
        if (arg1 >= 0) {
            this.field4780 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "(I)V")
    public final void method436(int arg0) {
        ++field4652;
        this.method2061(0, (byte) -50);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(B)V")
    private final void method2055(byte arg0) {
        OpenGL.glDepthMask(this.field4887 && this.field4819);
        ++field4621;
        if (arg0 != 56) {
            this.method523((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lef;B)V")
    public final void method2056(class336 arg0, byte arg1) {
        ++field4596;
        if (this.field4793 >= 0 && this.field4791[this.field4793] == arg0) {
            if (arg1 != -38) {
                this.method487();
            }
            this.field4791[this.field4793--] = null;
            arg0.method1432((byte) 101);
            if (~this.field4793 > -1) {
                this.field4790 = null;
            } else {
                this.field4790 = this.field4791[this.field4793];
                this.field4790.method1433(9435);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "ia", descriptor = "(III[I)V")
    public final void method463(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4734;
        float var5 = (float) arg2 * this.field4919.field6015 + (float) arg0 * this.field4919.field6021 + (float) arg1 * this.field4919.field6000 + this.field4919.field6011;
        if (!(var5 < (float) this.field4871) && !((float) this.field4843 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4919.field6003 + (float) arg0 * this.field4919.field6024 + (float) arg1 * this.field4919.field6002 + this.field4919.field6018) * (float) this.field4814 / var5);
            int var7 = (int) (((float) arg2 * this.field4919.field6013 + (float) arg0 * this.field4919.field5992 + (float) arg1 * this.field4919.field6027 + this.field4919.field5991) * (float) this.field4922 / var5);
            if (this.field4880 <= (float) var6 && this.field4886 >= (float) var6 && this.field4874 <= (float) var7 && this.field4891 >= (float) var7) {
                arg3[1] = (int) ((float) var7 - this.field4874);
                arg3[0] = (int) ((float) var6 + -this.field4880);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lgn;)V")
    public final void method467(class492 arg0) {
        this.field4775.method846((byte) -99, arg0, this);
        ++field4675;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lht;I)V")
    public final void method2057(class408 arg0, int arg1) {
        ++field4616;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method2526(arg1 + -12347), 0);
        if (arg1 != 12391) {
            this.field4869 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "(I)V")
    private final void method2058(int arg0) {
        if (this.field4832 != 1) {
            this.method2026(false);
            this.method2018(false, 22090);
            this.method2024(true, false);
            this.method2016((byte) -56, false);
            this.method2052((byte) 121, false);
            this.method2042((class440) null, arg0 ^ -2);
            this.method2008(-2, 848);
            this.method2068(1, 13134);
            this.field4832 = 1;
        }
        if (arg0 == -2) {
            ++field4582;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()I")
    public final int method512() {
        ++field4722;
        return this.field4871;
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V")
    public final void method454(int arg0) {
        this.method2069(114);
        ++field4747;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lef;I)V")
    public final void method2059(class336 arg0, int arg1) {
        ++field4685;
        if (this.field4789 >= 0 && this.field4792[this.field4789] == arg0) {
            if (arg1 != 1) {
                this.method457(79);
            }
            this.field4792[this.field4789--] = null;
            arg0.method1429((byte) -1);
            if (this.field4789 < 0) {
                this.field4788 = null;
            } else {
                this.field4788 = this.field4792[this.field4789];
                this.field4788.method1447((byte) -41);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "()V")
    public final void method448() {
        if (this.field4776 != null && this.field4776.method89((byte) 107)) {
            this.field4778.method951(true, this.field4776);
            this.field4773.method2839(93);
        }
        ++field4610;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public final class35 method478(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4597;
        return new class267(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(BLef;)V")
    public final void method2060(byte arg0, class336 arg1) {
        ++field4716;
        if (arg0 == -54) {
            if (this.field4862) {
                this.method2056(arg1, (byte) -38);
                this.method2059(arg1, arg0 + 55);
            } else if (this.field4794 >= 0 && this.field4795[this.field4794] == arg1) {
                this.field4795[this.field4794--] = null;
                arg1.method1437((byte) -115);
                if (this.field4794 >= 0) {
                    this.field4790 = this.field4788 = this.field4795[this.field4794];
                    this.field4790.method1438((byte) -113);
                } else {
                    this.field4790 = this.field4788 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
    public final void method444() {
        ++field4709;
        this.field4778.method949((byte) 19);
    }

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "(IIII)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > this.field4898) {
            this.field4898 = arg0;
        }
        if (~this.field4895 > ~arg1) {
            this.field4895 = arg1;
        }
        ++field4727;
        if (~arg3 > ~this.field4868) {
            this.field4868 = arg3;
        }
        if (this.field4845 > arg2) {
            this.field4845 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method2076(-102);
        this.method2015((byte) 25);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(IB)V")
    public final void method2061(int arg0, byte arg1) {
        if (~this.field4818 != ~arg0) {
            boolean var3;
            byte var4;
            boolean var5;
            if (arg0 == 1) {
                var3 = true;
                var4 = 1;
                var5 = true;
            } else if (~arg0 == -3) {
                var3 = true;
                var4 = 2;
                var5 = false;
            } else if (arg0 == 128) {
                var3 = true;
                var5 = true;
                var4 = 3;
            } else {
                var4 = 0;
                var5 = false;
                var3 = true;
            }
            if (!this.field4869 == var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field4869 = var3;
            }
            if (!var5 == this.field4840) {
                if (var5) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field4840 = var5;
            }
            if (~this.field4853 != ~var4) {
                if (var4 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var4 == -3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (var4 != 3) {
                    OpenGL.glDisable(3042);
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                }
                this.field4853 = var4;
            }
            this.field4818 = arg0;
            this.field4832 &= -29;
        }
        if (arg1 <= -37) {
            ++field4768;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lef;B)V")
    public final void method2062(class336 arg0, byte arg1) {
        ++field4646;
        if (this.field4789 >= 3) {
            throw new RuntimeException();
        } else {
            int var3 = 16 % ((arg1 - -30) / 56);
            if (this.field4789 >= 0) {
                this.field4792[this.field4789].method1429((byte) -1);
            }
            this.field4788 = this.field4792[++this.field4789] = arg0;
            this.field4788.method1447((byte) -71);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method465(int arg0) {
        ++field4584;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(B)V")
    public static void method2063(byte arg0) {
        if (arg0 >= -92) {
            field4604 = 38;
        }
        field4733 = null;
        field4649 = null;
    }

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "(I)V")
    public final void method2064(int arg0) {
        ++field4713;
        if (arg0 == 1) {
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(B)I")
    private final int method2065(byte arg0) {
        ++field4617;
        this.field4823 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field4877 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field4823.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (arg0 > -23) {
            return 53;
        } else {
            if (~this.field4823.indexOf("brian paul") != 0 || this.field4823.indexOf("mesa") != -1) {
                var2 |= 1;
            }
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class82.method650(false, ' ', var3.replace('.', ' '));
            if (var4.length < 2) {
                var2 |= 4;
            } else {
                try {
                    int var5 = class457.method2745(var4[0], true);
                    int var6 = class457.method2745(var4[1], true);
                    this.field4912 = var5 * 10 - -var6;
                } catch (NumberFormatException var8) {
                    var2 |= 4;
                }
            }
            if (~this.field4912 > -13) {
                var2 |= 2;
            }
            if (!this.field4718.isExtensionAvailable("GL_ARB_multitexture")) {
                var2 |= 8;
            }
            if (!this.field4718.isExtensionAvailable("GL_ARB_texture_env_combine")) {
                var2 |= 32;
            }
            int[] var7 = new int[1];
            OpenGL.glGetIntegerv(34018, var7, 0);
            this.field4844 = var7[0];
            OpenGL.glGetIntegerv(34929, var7, 0);
            this.field4865 = var7[0];
            OpenGL.glGetIntegerv(34930, var7, 0);
            this.field4870 = var7[0];
            if (this.field4844 < 2 || ~this.field4865 > -3 || this.field4870 < 2) {
                var2 |= 16;
            }
            this.field4850 = NativeStream.method2652();
            this.field4718.arePbuffersAvailable();
            this.field4815 = this.field4718.isExtensionAvailable("GL_ARB_vertex_buffer_object");
            this.field4910 = this.field4718.isExtensionAvailable("GL_ARB_multisample");
            this.field4810 = this.field4718.isExtensionAvailable("GL_ARB_vertex_program");
            this.field4718.isExtensionAvailable("GL_ARB_fragment_program");
            this.field4901 = this.field4718.isExtensionAvailable("GL_ARB_vertex_shader");
            this.field4831 = this.field4718.isExtensionAvailable("GL_ARB_fragment_shader");
            this.field4842 = this.field4718.isExtensionAvailable("GL_EXT_texture3D");
            this.field4921 = this.field4718.isExtensionAvailable("GL_ARB_texture_rectangle");
            this.field4896 = this.field4718.isExtensionAvailable("GL_ARB_texture_cube_map");
            this.field4848 = this.field4718.isExtensionAvailable("GL_ARB_texture_float");
            this.field4816 = false;
            this.field4836 = this.field4718.isExtensionAvailable("GL_EXT_framebuffer_object");
            this.field4862 = this.field4718.isExtensionAvailable("GL_EXT_framebuffer_blit");
            this.field4849 = this.field4718.isExtensionAvailable("GL_EXT_framebuffer_multisample");
            this.field4817 = this.field4849 & this.field4862;
            return ~var2 != -1 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lc;Lgn;Lia;Lsf;I)V")
    public final void method531(class121 arg0, class492 arg1, class413 arg2, class361 arg3, int arg4) {
        ++field4699;
        arg0.method910(arg2, arg3, arg4);
        this.method467(arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FIFF)V")
    private final void method2066(float arg0, int arg1, float arg2, float arg3) {
        ++field4587;
        OpenGL.glMatrixMode(arg1);
        if (this.field4897) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg0, arg2);
        OpenGL.glMatrixMode(5888);
        this.field4897 = true;
    }

    @OriginalMember(owner = "client!qg", name = "GA", descriptor = "(IIII)V")
    public final void method485(int arg0, int arg1, int arg2, int arg3) {
        this.field4922 = arg3;
        this.field4833 = arg1;
        this.field4814 = arg2;
        ++field4750;
        this.field4925 = arg0;
        this.method2077(-125);
        this.method2076(-102);
        if (this.field4856 != 3) {
            if (this.field4856 == 2) {
                this.method2084(-15849);
                return;
            }
        } else {
            this.method2033((byte) -98);
        }
    }

    @OriginalMember(owner = "client!qg", name = "NA", descriptor = "(IIIIII)V")
    public final void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4662;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2058(-2);
        this.method2061(arg5, (byte) -67);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4910) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4910) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
    public final void method2067(int arg0, int arg1, int arg2) {
        this.field4902 = arg2;
        this.field4914 = arg1;
        ++field4777;
        if (arg0 != 1786) {
            this.field4856 = 55;
        }
        this.method2046(104);
        this.method2015((byte) 43);
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(II)V")
    public final void method2068(int arg0, int arg1) {
        ++field4672;
        if (arg1 != 13134) {
            this.method531((class121) null, (class492) null, (class413) null, (class361) null, 74);
        }
        if (~arg0 != -2) {
            if (~arg0 == -1) {
                this.method2070(81, 8448, 8448);
            } else if (arg0 != 2) {
                if (arg0 != 3) {
                    if (~arg0 == -5) {
                        this.method2070(120, 34023, 34023);
                        return;
                    }
                } else {
                    this.method2070(101, 8448, 260);
                }
            } else {
                this.method2070(108, 7681, 34165);
            }
        } else {
            this.method2070(101, 7681, 7681);
        }
    }

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "(I)V")
    private final void method2069(int arg0) {
        if (arg0 >= 96) {
            ++field4603;
            this.field4718.detach();
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;ILci;)V")
    public class321(int arg0, Canvas arg1, class126 arg2, int arg3, class312 arg4) {
        super(arg0, arg2);
        new class111();
        new class398(16);
        this.field4796 = new class348();
        this.field4800 = new class348();
        this.field4801 = new class348();
        this.field4802 = new class348();
        this.field4803 = new class348();
        this.field4804 = new class348();
        this.field4805 = new class348();
        this.field4819 = true;
        this.field4813 = -1;
        this.field4806 = 8448;
        this.field4825 = 1.0F;
        this.field4812 = -1;
        this.field4845 = 0;
        this.field4858 = 3000.0F;
        this.field4821 = -1.0F;
        this.field4868 = 0;
        this.field4857 = 0.0F;
        this.field4859 = new float[4];
        this.field4827 = 8448;
        this.field4885 = new float[16];
        this.field4814 = 512;
        this.field4837 = 0;
        this.field4808 = -1;
        this.field4892 = 1.0F;
        this.field4843 = 3584;
        this.field4889 = -1.0F;
        this.field4904 = new float[4];
        this.field4898 = 0;
        this.field4902 = 0;
        this.field4852 = 0;
        this.field4871 = 50;
        this.field4851 = 1.0F;
        this.field4909 = 3584.0F;
        this.field4895 = 0;
        this.field4833 = 0;
        this.field4914 = 0;
        this.field4838 = 1.0F;
        this.field4913 = 1.0F;
        this.field4834 = new float[4];
        this.field4917 = -1;
        this.field4830 = new float[4];
        this.field4922 = 512;
        this.field4925 = 0;
        this.field4894 = new class131[class441.field6479];
        this.field4918 = -1;
        this.field4923 = 3584.0F;
        this.field4764 = this.field4589 = arg1;
        this.field4771 = arg3;
        try {
            if (class206.field2969 == null || !class206.field2969) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class206.field2969 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method1973(0, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method1973(0, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method1973(0, "libjaggl.so").toString());
                    }
                    class206.field2969 = Boolean.TRUE;
                }
            }
            if (class206.field2969 != null && class206.field2969) {
                this.field4718 = new OpenGL();
                this.field4656 = this.field4681 = this.field4718.init(arg1, 8, 8, 8, 24, 0, this.field4771);
                if (~this.field4681 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2080(-113);
                    int var7 = this.method2065((byte) -103);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field4860 = !this.field4850 ? 5121 : 33639;
                        if (~this.field4877.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class82.method650(false, ' ', this.field4877.replace('/', ' '));
                            for (int var12 = 0; var12 < var11.length; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (~var13.charAt(0) == -121 && var13.length() >= 3 && class65.method570(var13.substring(1, 3), -1484774708)) {
                                            var13 = var13.substring(1);
                                            var10 = true;
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var9 = true;
                                                var13 = var13.substring(2);
                                            }
                                            if (~var13.length() <= -5 && class65.method570(var13.substring(0, 4), -1484774708)) {
                                                var8 = class457.method2745(var13.substring(0, 4), true);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field4848 = false;
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && var8 <= 9250) {
                                    this.field4842 = false;
                                }
                                if (var8 >= 7000 && ~var8 >= -8000) {
                                    this.field4815 = false;
                                }
                            }
                            this.field4921 &= this.field4718.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field4828 = this.field4815;
                        }
                        if (~this.field4823.indexOf("intel") != 0) {
                            this.field4836 = false;
                        }
                        this.field4884 = !this.field4823.equals("s3 graphics");
                        if (this.field4815) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class91.method744(true, false, -113);
                        this.field4786 = true;
                        this.field4773 = new class474(this, super.field2449);
                        this.method2072((byte) 62);
                        this.field4782 = new class122(this);
                        this.field4778 = new class129(this);
                        if (this.field4778.method946(8276)) {
                            this.field4776 = new class179(this);
                            if (!this.field4776.method1268(-99)) {
                                this.field4776.method95(124);
                                this.field4776 = null;
                            }
                        }
                        this.field4770 = new class387(this);
                        this.method2014((byte) -40);
                        this.method2081(true);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field4718.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class185.method1285(121, 100L);
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
            this.method427();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFF)V")
    public final void method450(float arg0, float arg1, float arg2) {
        ++field4674;
        class372.field5579 = arg0;
        class334.field5126 = arg1;
        class186.field2767 = arg2;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)V")
    public final void method2070(int arg0, int arg1, int arg2) {
        if (arg0 >= 66) {
            if (~this.field4906 == -1) {
                boolean var4 = false;
                if (this.field4827 != arg2) {
                    OpenGL.glTexEnvi(8960, 34161, arg2);
                    this.field4827 = arg2;
                    var4 = true;
                }
                if (~this.field4806 != ~arg1) {
                    OpenGL.glTexEnvi(8960, 34162, arg1);
                    var4 = true;
                    this.field4806 = arg1;
                }
                if (var4) {
                    this.field4832 &= -30;
                }
            } else {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                OpenGL.glTexEnvi(8960, 34162, arg1);
            }
            ++field4623;
        }
    }

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "(I)V")
    private final void method2071(int arg0) {
        if (this.field4881 && ~this.field4808 <= -1 | this.field4807) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field4751;
        if (arg0 != 30188) {
            this.method2013((byte) 35, (byte[]) null, true, 25, 122);
        }
    }

    @OriginalMember(owner = "client!qg", name = "fa", descriptor = "(IIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3) {
        this.field4863 = arg0;
        this.field4852 = arg3;
        this.field4807 = true;
        ++field4687;
        this.field4918 = arg1;
        this.field4812 = arg2;
        this.field4770.method2432(false, 3, false, -1);
        this.field4770.field5739.method1827((byte) -26);
        this.method2032(8158);
        this.method2071(30188);
    }

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "()Z")
    public final boolean method519() {
        ++field4745;
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(IIIIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4602;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2058(-2);
        this.method2061(arg5, (byte) -39);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4910) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4910) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "()Z")
    public final boolean method484() {
        ++field4769;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "(FF)V")
    public final void method514(float arg0, float arg1) {
        ++field4653;
        if (this.field4858 != arg0 || this.field4924 != arg1) {
            this.field4858 = arg0;
            this.field4924 = arg1;
            this.method2011(23247);
            if (this.field4856 != 3) {
                if (~this.field4856 == -3) {
                    this.method2084(-15849);
                    return;
                }
            } else {
                this.method2033((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "(B)V")
    private final void method2072(byte arg0) {
        this.field4919 = new class408();
        ++field4586;
        this.field4820 = new class408();
        this.field4900 = new class440[this.field4844];
        this.field4826 = new class236(this, 3553, 6408, 1, 1);
        this.field4916 = new class236(this, 3553, 6408, 1, 1);
        this.field4864 = new class236(this, 3553, 6408, 1, 1);
        this.field4829 = new class453(this);
        this.field4899 = new class453(this);
        this.field4822 = new class453(this);
        this.field4907 = new class453(this);
        this.field4890 = new class453(this);
        this.field4883 = new class453(this);
        this.field4811 = new class453(this);
        this.field4809 = new class453(this);
        this.field4861 = new class453(this);
        this.field4915 = new class453(this);
        if (this.field4836) {
            this.field4854 = new class217(this);
            this.field4876 = new class217(this);
        }
        if (arg0 <= 54) {
            this.field4808 = 120;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(IB)I")
    public final int method2073(int arg0, byte arg1) {
        ++field4583;
        if (~arg0 == -2) {
            return 7681;
        } else if (~arg0 == -1) {
            return 8448;
        } else if (~arg0 != -3) {
            if (arg0 != 3) {
                if (arg0 == 4) {
                    return 34023;
                } else {
                    if (arg1 <= 118) {
                        this.method433(false);
                    }
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "()V")
    public final void method510() {
        ++field4772;
        if (this.field4884 && this.field4749 > 0 && this.field4737 > 0) {
            int var1 = this.field4898;
            int var2 = this.field4845;
            int var3 = this.field4895;
            int var4 = this.field4868;
            this.method492();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2043(0);
            this.method2018(false, 22090);
            this.method2024(true, false);
            this.method2016((byte) -56, false);
            this.method2052((byte) 72, false);
            this.method2042((class440) null, 0);
            this.method2008(-2, 848);
            this.method2068(1, 13134);
            this.method2061(0, (byte) -94);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4749, this.field4737, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method509(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFBF)V")
    public final void method2074(float arg0, float arg1, float arg2, byte arg3, float arg4) {
        class204.field2945[3] = arg2;
        class204.field2945[2] = arg0;
        class204.field2945[1] = arg1;
        ++field4765;
        class204.field2945[0] = arg4;
        if (arg3 <= -24) {
            OpenGL.glTexEnvfv(8960, 8705, class204.field2945, 0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method533(Canvas arg0) {
        ++field4630;
        long var2 = 0L;
        if (arg0 != null && this.field4589 != arg0) {
            if (this.field4748.containsKey(arg0)) {
                Long var4 = (Long) this.field4748.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field4681;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field4718.surfaceResized(var2);
            if (this.field4764 == arg0) {
                this.method2081(true);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
    public final int method488() {
        ++field4629;
        return 4;
    }

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "()Z")
    public final boolean method529() {
        ++field4761;
        return this.field4776 != null && this.field4776.method89((byte) 107);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class528 method532(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4590;
        return new class308(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "(IIIII)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2058(-2);
        ++field4682;
        this.method2061(arg4, (byte) -75);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(IIIIII)V")
    public final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4758;
        this.method2058(-2);
        this.method2061(arg5, (byte) -111);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V")
    public final void method494(boolean arg0) {
        this.field4819 = arg0;
        ++field4752;
        this.method2055((byte) 56);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZII)V")
    public final synchronized void method2075(boolean arg0, int arg1, int arg2) {
        ++field4613;
        class242 var4 = new class242(arg1);
        var4.field6399 = (long) arg2;
        if (arg0) {
            this.method2017(-82);
        }
        this.field4803.method2270(0, var4);
    }

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "()V")
    public final void method506() {
        ++field4695;
        this.method2052((byte) 54, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "([I)V")
    public final void method505(int[] arg0) {
        ++field4663;
        arg0[0] = this.field4898;
        arg0[2] = this.field4845;
        arg0[1] = this.field4895;
        arg0[3] = this.field4868;
    }

    @OriginalMember(owner = "client!qg", name = "ua", descriptor = "(F)V")
    public final void method458(float arg0) {
        if (this.field4875 != arg0) {
            this.field4875 = arg0;
            this.method2031(0);
        }
        ++field4645;
    }

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "(I)V")
    private final void method2076(int arg0) {
        this.field4880 = (float) (-this.field4925 + this.field4898);
        this.field4891 = (float) (this.field4868 - this.field4833);
        if (arg0 >= -90) {
            this.method2019(81);
        }
        this.field4886 = (float) (this.field4845 - this.field4925);
        ++field4702;
        this.field4874 = (float) (-this.field4833 + this.field4895);
    }

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "(I)V")
    private final void method2077(int arg0) {
        ++field4743;
        float[] var2 = this.field4885;
        int var3 = -124 / ((-62 - arg0) / 42);
        float var4 = (float) (-this.field4925 * this.field4871) / (float) this.field4814;
        float var5 = (float) ((-this.field4925 + this.field4749) * this.field4871) / (float) this.field4814;
        float var6 = (float) (this.field4871 * this.field4833) / (float) this.field4922;
        float var7 = (float) ((-this.field4737 + this.field4833) * this.field4871) / (float) this.field4922;
        if (var4 != var5 && var6 != var7) {
            float var8 = (float) this.field4871 * 2.0F;
            var2[11] = -1.0F;
            var2[12] = 0.0F;
            var2[2] = 0.0F;
            var2[1] = 0.0F;
            var2[10] = this.field4905 = (float) (-(this.field4871 + this.field4843)) / (float) (-this.field4871 + this.field4843);
            var2[6] = 0.0F;
            var2[9] = (var6 + var7) / (-var7 + var6);
            var2[3] = 0.0F;
            var2[0] = var8 / (var5 - var4);
            var2[14] = this.field4920 = -((float) this.field4843 * var8) / (float) (this.field4843 - this.field4871);
            var2[7] = 0.0F;
            var2[4] = 0.0F;
            var2[5] = var8 / (-var7 + var6);
            var2[13] = 0.0F;
            var2[15] = 0.0F;
            var2[8] = (var4 + var5) / (-var4 + var5);
        } else {
            var2[13] = 0.0F;
            var2[12] = 0.0F;
            var2[2] = 0.0F;
            var2[5] = 1.0F;
            var2[9] = 0.0F;
            var2[6] = 0.0F;
            var2[3] = 0.0F;
            var2[14] = 0.0F;
            var2[11] = 0.0F;
            var2[10] = 1.0F;
            var2[0] = 1.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[7] = 0.0F;
            var2[8] = 0.0F;
            var2[15] = 1.0F;
        }
        this.method2011(23247);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)V")
    public final synchronized void method2078(byte arg0, int arg1, int arg2) {
        ++field4692;
        class242 var4 = new class242(arg2);
        var4.field6399 = (long) arg1;
        this.field4800.method2270(0, var4);
        int var5 = -51 / ((arg0 - 36) / 32);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)I")
    public final int method2079(byte arg0, int arg1) {
        ++field4741;
        if (arg0 != 116) {
            this.method469();
        }
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg1 != 5123 && ~arg1 != -5123) {
                if (~arg1 != -5126 && ~arg1 != -5125 && ~arg1 != -5127) {
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

    @OriginalMember(owner = "client!qg", name = "la", descriptor = "()F")
    public final float method487() {
        ++field4678;
        return this.field4858;
    }

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "(I)V")
    private final void method2080(int arg0) {
        ++field4705;
        if (arg0 >= -49) {
            this.field4686 = -32;
        }
        int var2 = 0;
        while (!this.field4718.attach()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class185.method1285(111, 1000L);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lc;Lia;[Lsf;I)V")
    public final void method438(class121[] arg0, class413 arg1, class361[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method910(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field4657;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Ll;")
    public final class16 method452(int arg0) {
        ++field4736;
        class47 var2 = new class47(arg0);
        this.field4784.method2270(0, var2);
        return var2;
    }

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "()V")
    public final void method521() {
        try {
            this.field4718.swapBuffers();
        } catch (Exception var1) {
        }
        ++field4626;
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(Z)V")
    private final void method2081(boolean arg0) {
        ++field4595;
        if (this.field4764 != null) {
            Dimension var2 = this.field4764.getSize();
            this.field4632 = var2.height;
            this.field4686 = var2.width;
        } else {
            this.field4686 = this.field4632 = 0;
        }
        if (this.field4788 == null) {
            this.field4737 = this.field4632;
            this.field4749 = this.field4686;
            this.method2046(28);
        }
        this.method2043(0);
        this.method492();
        if (!arg0) {
            this.field4813 = -84;
        }
    }

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "()V")
    public final void method503() {
        ++field4735;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLht;)V")
    public final void method2082(boolean arg0, class408 arg1) {
        ++field4606;
        if (arg0) {
            this.field4842 = true;
        }
        OpenGL.glLoadMatrixf(arg1.method2526(87), 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILef;)V")
    public final void method2083(int arg0, class336 arg1) {
        if (arg0 <= 6) {
            this.method435((Rectangle[]) null, -86);
        }
        ++field4627;
        if (~this.field4793 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field4793 >= 0) {
                this.field4791[this.field4793].method1432((byte) 101);
            }
            this.field4790 = this.field4791[++this.field4793] = arg1;
            this.field4790.method1433(9435);
        }
    }

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "(I)V")
    private final void method2084(int arg0) {
        if (arg0 != -15849) {
            this.field4871 = -68;
        }
        OpenGL.glMatrixMode(5889);
        ++field4654;
        OpenGL.glLoadMatrixf(this.field4885, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method500(Canvas arg0) {
        ++field4615;
        if (this.field4589 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4748.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field4718.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field4748.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lwt;Lwt;Lwt;ILwt;)V")
    public final void method2085(class202 arg0, class202 arg1, class202 arg2, int arg3, class202 arg4) {
        ++field4746;
        if (arg0 != null) {
            this.method2044((byte) -62, arg0.field2921);
            OpenGL.glVertexPointer(arg0.field2922, arg0.field2927, this.field4908.method1566(arg3 + 46065), this.field4908.method1565((byte) -88) - -((long) arg0.field2925));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method2044((byte) -62, arg1.field2921);
            OpenGL.glNormalPointer(arg1.field2927, this.field4908.method1566(16999), this.field4908.method1565((byte) -88) + (long) arg1.field2925);
            OpenGL.glEnableClientState(32885);
        }
        if (arg3 != -29066) {
            this.field4830 = null;
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method2044((byte) -62, arg4.field2921);
            OpenGL.glColorPointer(arg4.field2922, arg4.field2927, this.field4908.method1566(16999), this.field4908.method1565((byte) -88) + (long) arg4.field2925);
            OpenGL.glEnableClientState(32886);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method2044((byte) -62, arg2.field2921);
            OpenGL.glTexCoordPointer(arg2.field2922, arg2.field2927, this.field4908.method1566(16999), this.field4908.method1565((byte) -88) - -((long) arg2.field2925));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILce;III)V")
    public final void method2086(int arg0, class201 arg1, int arg2, int arg3, int arg4) {
        ++field4622;
        int var6 = arg1.method755(arg4 ^ -20843);
        int var7 = arg2 * this.method2079((byte) 116, var6);
        if (arg4 != 0) {
            this.method2068(41, 78);
        }
        this.method2028(true, arg1);
        OpenGL.glDrawElements(arg3, arg0, var6, arg1.method757(false) - -((long) var7));
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIILea;II)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        ++field4659;
        class124 var10 = (class124) arg6;
        class92 var11 = var10.field1919;
        this.method2035(127);
        this.method2042(var10.field1919, 0);
        this.method2061(arg5, (byte) -97);
        this.method2070(127, 8448, 7681);
        this.method2053(-109, 0, 34167, 768);
        float var12 = var11.field1513 / (float) var11.field1522;
        float var13 = var11.field1517 / (float) var11.field1520;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2053(-108, 0, 5890, 768);
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(Z)V")
    public static final void method2087(boolean arg0) {
        class151.field2320 = false;
        if (arg0) {
            ++field4643;
            class107.field1671 = null;
            class67.method582(-25099);
        }
    }

    @OriginalMember(owner = "client!qg", name = "IA", descriptor = "(IIII)[I")
    public final int[] method508(int arg0, int arg1, int arg2, int arg3) {
        ++field4661;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field4737 + -arg1, arg2, 1, 32993, this.field4860, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qg", name = "na", descriptor = "(I)V")
    public final void method479(int arg0) {
        ++field4580;
        this.field4785 = 0;
        while (~arg0 < -2) {
            ++this.field4785;
            arg0 >>= 1;
        }
        this.field4787 = 1 << this.field4785;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method466(Canvas arg0) {
        ++field4679;
        if (this.field4589 == arg0) {
            throw new RuntimeException();
        } else if (this.field4748.containsKey(arg0)) {
            Long var2 = (Long) this.field4748.get(arg0);
            this.field4718.releaseSurface(arg0, var2);
            this.field4748.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "aa", descriptor = "(IIIIII[BII)V")
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4612;
        float var10;
        float var11;
        if (this.field4847 != null && this.field4847.field3430 >= arg2 && arg3 <= this.field4847.field3429) {
            this.field4847.method1533(0, false, arg6, 6406, arg3, 0, true, 0, 0, arg2);
            var10 = (float) arg3 * this.field4847.field1517 / (float) this.field4847.field3429;
            var11 = (float) arg2 * this.field4847.field1513 / (float) this.field4847.field3430;
        } else {
            this.field4847 = class168.method1192(107, this, 6406, arg3, false, 6406, arg2, arg6);
            this.field4847.method1534(false, 127, false);
            var11 = this.field4847.field1513;
            var10 = this.field4847.field1517;
        }
        this.method2035(-5);
        this.method2042(this.field4847, 0);
        this.method2061(arg8, (byte) -61);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2009(arg5, false);
        this.method2070(85, 34165, 34165);
        this.method2053(78, 0, 34166, 768);
        this.method2053(-105, 2, 5890, 770);
        this.method2034(0, 34166, 770, 8960);
        this.method2034(2, 5890, 770, 8960);
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
        this.method2053(114, 0, 5890, 768);
        this.method2053(-127, 2, 34166, 770);
        this.method2034(0, 5890, 770, 8960);
        this.method2034(2, 34166, 770, 8960);
    }

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "()Z")
    public final boolean method482() {
        ++field4755;
        return this.field4770.method2436(3, (byte) 84);
    }

    @OriginalMember(owner = "client!qg", name = "ba", descriptor = "(IIII)V")
    public final void method536(int arg0, int arg1, int arg2, int arg3) {
        ++field4599;
        if (!this.field4807) {
            throw new RuntimeException("");
        } else {
            this.field4852 = arg3;
            this.field4918 = arg1;
            this.field4863 = arg0;
            this.field4812 = arg2;
            this.field4770.field5739.method1827((byte) -26);
            this.method2032(8158);
        }
    }

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "(I)V")
    private final void method2088(int arg0) {
        ++field4715;
        if (this.field4867 && !this.field4888) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != -1) {
            this.method484();
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(IIIIII)Lmd;")
    public final class379 method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4760;
        return this.field4896 ? new class147(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "()Z")
    public final boolean method493() {
        ++field4698;
        if (this.field4776 != null) {
            if (!this.field4776.method89((byte) 107)) {
                if (!this.field4778.method948((byte) 114, this.field4776)) {
                    return false;
                }
                this.field4773.method2839(-60);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)I")
    public final int method472(int arg0, int arg1) {
        ++field4757;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(Z)Lnm;")
    public final class329 method2089(boolean arg0) {
        ++field4680;
        if (!arg0) {
            this.field4812 = -5;
        }
        return this.field4911 == null ? null : this.field4911.method933(false);
    }

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "()Z")
    public final boolean method473() {
        ++field4759;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public final synchronized void method457(int arg0) {
        ++field4677;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4800.method2268((byte) -102)) {
            class242 var12 = (class242) this.field4800.method2254(-8);
            class524.field7707[var3++] = (int) var12.field6399;
            this.field4797 -= var12.field3509;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class524.field7707, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class524.field7707, 0);
            var3 = 0;
        }
        while (!this.field4801.method2268((byte) -121)) {
            class242 var11 = (class242) this.field4801.method2254(-8);
            class524.field7707[var3++] = (int) var11.field6399;
            this.field4798 -= var11.field3509;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class524.field7707, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class524.field7707, 0);
            var3 = 0;
        }
        while (!this.field4802.method2268((byte) -90)) {
            class242 var10 = (class242) this.field4802.method2254(-8);
            class524.field7707[var3++] = var10.field3509;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class524.field7707, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class524.field7707, 0);
            var3 = 0;
        }
        while (!this.field4803.method2268((byte) -118)) {
            class242 var9 = (class242) this.field4803.method2254(-8);
            class524.field7707[var3++] = (int) var9.field6399;
            this.field4799 -= var9.field3509;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class524.field7707, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class524.field7707, 0);
            boolean var4 = false;
        }
        while (!this.field4796.method2268((byte) -98)) {
            class242 var8 = (class242) this.field4796.method2254(-8);
            OpenGL.glDeleteLists((int) var8.field6399, var8.field3509);
        }
        while (!this.field4804.method2268((byte) -96)) {
            class439 var7 = this.field4804.method2254(-8);
            OpenGL.glDeleteProgramARB((int) var7.field6399);
        }
        while (!this.field4805.method2268((byte) -92)) {
            class439 var6 = this.field4805.method2254(-8);
            OpenGL.glDeleteObjectARB(var6.field6399);
        }
        while (!this.field4796.method2268((byte) -92)) {
            class242 var5 = (class242) this.field4796.method2254(-8);
            OpenGL.glDeleteLists((int) var5.field6399, var5.field3509);
        }
        this.field4773.method2837(34842);
        if (~this.method489() < -100663297 && class464.method2773((byte) 103) > this.field4878 + 60000L) {
            System.gc();
            this.field4878 = class464.method2773((byte) 103);
        }
        this.field4781 = var2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lmd;Lmd;FLmd;)Lmd;")
    public final class379 method440(class379 arg0, class379 arg1, float arg2, class379 arg3) {
        ++field4683;
        if (arg0 != null && arg1 != null && this.field4896 && this.field4836 && this.field4862) {
            class211 var5 = null;
            class125 var6 = (class125) arg0;
            class125 var7 = (class125) arg1;
            class329 var8 = var6.method933(false);
            class329 var9 = var7.method933(false);
            if (var8 != null && var9 != null) {
                int var10 = var8.field5077 > var9.field5077 ? var8.field5077 : var9.field5077;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class211) {
                    class211 var11 = (class211) arg3;
                    if (var10 == var11.method1413(0)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class211(this, var10);
                }
                if (var5.method1412(var9, arg2, 1, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lc;Lgn;Lia;[Lsf;I)V")
    public final void method495(class121[] arg0, class492 arg1, class413 arg2, class361[] arg3, int arg4) {
        ++field4607;
        this.method438(arg0, arg2, arg3, arg4);
        this.method467(arg1);
    }

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "(I)V")
    public final void method2090(int arg0) {
        OpenGL.glLightfv(arg0, 4611, this.field4859, 0);
        ++field4728;
        OpenGL.glLightfv(16385, 4611, this.field4904, 0);
    }

    @OriginalMember(owner = "client!qg", name = "xa", descriptor = "()I")
    public final int method445() {
        ++field4664;
        int var1 = this.field4893;
        this.field4893 = 0;
        return var1;
    }
}
