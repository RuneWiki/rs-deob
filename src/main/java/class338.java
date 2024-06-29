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

@OriginalClass("client!ef")
public class class338 extends class38 {

    @OriginalMember(owner = "client!ef", name = "xb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4599 = new Hashtable();

    @OriginalMember(owner = "client!ef", name = "Yd", descriptor = "I")
    public int field4730 = 128;

    @OriginalMember(owner = "client!ef", name = "ce", descriptor = "Ldp;")
    private class3 field4734 = new class3();

    @OriginalMember(owner = "client!ef", name = "ie", descriptor = "Ltc;")
    private class234 field4740 = new class234();

    @OriginalMember(owner = "client!ef", name = "je", descriptor = "Ltc;")
    public class234 field4741 = new class234();

    @OriginalMember(owner = "client!ef", name = "ne", descriptor = "Z")
    private boolean field4745 = false;

    @OriginalMember(owner = "client!ef", name = "me", descriptor = "I")
    public int field4744 = 3;

    @OriginalMember(owner = "client!ef", name = "pe", descriptor = "I")
    public int field4747 = 8;

    @OriginalMember(owner = "client!ef", name = "oe", descriptor = "Lar;")
    private class479 field4746 = new class479();

    @OriginalMember(owner = "client!ef", name = "se", descriptor = "[Lnf;")
    private class406[] field4750 = new class406[4];

    @OriginalMember(owner = "client!ef", name = "re", descriptor = "[Lnf;")
    private class406[] field4749 = new class406[4];

    @OriginalMember(owner = "client!ef", name = "we", descriptor = "I")
    private int field4754 = -1;

    @OriginalMember(owner = "client!ef", name = "xe", descriptor = "I")
    private int field4755 = -1;

    @OriginalMember(owner = "client!ef", name = "ve", descriptor = "I")
    private int field4753 = -1;

    @OriginalMember(owner = "client!ef", name = "ye", descriptor = "[Lnf;")
    private class406[] field4756 = new class406[4];

    @OriginalMember(owner = "client!ef", name = "Ae", descriptor = "Lar;")
    private class479 field4758;

    @OriginalMember(owner = "client!ef", name = "De", descriptor = "Lar;")
    private class479 field4761;

    @OriginalMember(owner = "client!ef", name = "Ee", descriptor = "Lar;")
    private class479 field4762;

    @OriginalMember(owner = "client!ef", name = "Fe", descriptor = "Lar;")
    private class479 field4763;

    @OriginalMember(owner = "client!ef", name = "Ge", descriptor = "Lar;")
    private class479 field4764;

    @OriginalMember(owner = "client!ef", name = "He", descriptor = "Lar;")
    private class479 field4765;

    @OriginalMember(owner = "client!ef", name = "Ie", descriptor = "Lar;")
    private class479 field4766;

    @OriginalMember(owner = "client!ef", name = "Ke", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!ef", name = "Ye", descriptor = "F")
    public float field4782;

    @OriginalMember(owner = "client!ef", name = "Ef", descriptor = "F")
    public float field4813;

    @OriginalMember(owner = "client!ef", name = "hf", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!ef", name = "jf", descriptor = "I")
    private int field4792;

    @OriginalMember(owner = "client!ef", name = "Uf", descriptor = "I")
    private int field4829;

    @OriginalMember(owner = "client!ef", name = "Xe", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!ef", name = "Tf", descriptor = "I")
    public int field4828;

    @OriginalMember(owner = "client!ef", name = "cf", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!ef", name = "Nf", descriptor = "F")
    public float field4822;

    @OriginalMember(owner = "client!ef", name = "Af", descriptor = "I")
    private int field4809;

    @OriginalMember(owner = "client!ef", name = "Wf", descriptor = "F")
    private float field4831;

    @OriginalMember(owner = "client!ef", name = "Cf", descriptor = "[F")
    private float[] field4811;

    @OriginalMember(owner = "client!ef", name = "mg", descriptor = "F")
    public float field4847;

    @OriginalMember(owner = "client!ef", name = "Yf", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!ef", name = "qf", descriptor = "[F")
    private float[] field4799;

    @OriginalMember(owner = "client!ef", name = "pg", descriptor = "F")
    private float field4850;

    @OriginalMember(owner = "client!ef", name = "lg", descriptor = "F")
    public float field4846;

    @OriginalMember(owner = "client!ef", name = "Gf", descriptor = "I")
    private int field4815;

    @OriginalMember(owner = "client!ef", name = "wg", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!ef", name = "Le", descriptor = "[F")
    public float[] field4769;

    @OriginalMember(owner = "client!ef", name = "af", descriptor = "F")
    public float field4784;

    @OriginalMember(owner = "client!ef", name = "Ze", descriptor = "[F")
    private float[] field4783;

    @OriginalMember(owner = "client!ef", name = "gg", descriptor = "I")
    private int field4841;

    @OriginalMember(owner = "client!ef", name = "Fg", descriptor = "F")
    public float field4866;

    @OriginalMember(owner = "client!ef", name = "Ag", descriptor = "Z")
    private boolean field4861;

    @OriginalMember(owner = "client!ef", name = "ff", descriptor = "I")
    public int field4789;

    @OriginalMember(owner = "client!ef", name = "jg", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!ef", name = "Mg", descriptor = "I")
    private int field4873;

    @OriginalMember(owner = "client!ef", name = "Pg", descriptor = "F")
    private float field4876;

    @OriginalMember(owner = "client!ef", name = "Ne", descriptor = "F")
    public float field4771;

    @OriginalMember(owner = "client!ef", name = "Kg", descriptor = "[F")
    private float[] field4871;

    @OriginalMember(owner = "client!ef", name = "Bf", descriptor = "I")
    private int field4810;

    @OriginalMember(owner = "client!ef", name = "Hf", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!ef", name = "Qg", descriptor = "[Ljd;")
    private class153[] field4877;

    @OriginalMember(owner = "client!ef", name = "Lf", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!ef", name = "gf", descriptor = "I")
    private int field4790;

    @OriginalMember(owner = "client!ef", name = "Xg", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!ef", name = "Yg", descriptor = "I")
    public int field4885;

    @OriginalMember(owner = "client!ef", name = "mc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4640;

    @OriginalMember(owner = "client!ef", name = "Xc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4677;

    @OriginalMember(owner = "client!ef", name = "fe", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!ef", name = "ud", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4700;

    @OriginalMember(owner = "client!ef", name = "jc", descriptor = "J")
    private long field4637;

    @OriginalMember(owner = "client!ef", name = "Sd", descriptor = "J")
    private long field4724;

    @OriginalMember(owner = "client!ef", name = "Oe", descriptor = "Z")
    public boolean field4772;

    @OriginalMember(owner = "client!ef", name = "Ng", descriptor = "I")
    public int field4874;

    @OriginalMember(owner = "client!ef", name = "vf", descriptor = "Ljava/lang/String;")
    private String field4804;

    @OriginalMember(owner = "client!ef", name = "Ve", descriptor = "Z")
    public boolean field4779;

    @OriginalMember(owner = "client!ef", name = "bf", descriptor = "Z")
    private boolean field4785;

    @OriginalMember(owner = "client!ef", name = "Sg", descriptor = "Z")
    public boolean field4879;

    @OriginalMember(owner = "client!ef", name = "hg", descriptor = "Z")
    public boolean field4842;

    @OriginalMember(owner = "client!ef", name = "ng", descriptor = "Z")
    private boolean field4848;

    @OriginalMember(owner = "client!ef", name = "Zf", descriptor = "Ljava/lang/String;")
    private String field4834;

    @OriginalMember(owner = "client!ef", name = "pf", descriptor = "Z")
    public boolean field4798;

    @OriginalMember(owner = "client!ef", name = "Zg", descriptor = "Z")
    private boolean field4886;

    @OriginalMember(owner = "client!ef", name = "Xd", descriptor = "Lqj;")
    public class352 field4729;

    @OriginalMember(owner = "client!ef", name = "qe", descriptor = "Lqo;")
    public class19 field4748;

    @OriginalMember(owner = "client!ef", name = "ge", descriptor = "Lrf;")
    private class58 field4738;

    @OriginalMember(owner = "client!ef", name = "Wd", descriptor = "Lit;")
    private class455 field4728;

    @OriginalMember(owner = "client!ef", name = "be", descriptor = "Lpl;")
    private class459 field4733;

    @OriginalMember(owner = "client!ef", name = "yd", descriptor = "Lls;")
    public static class93 field4704 = new class93();

    @OriginalMember(owner = "client!ef", name = "Me", descriptor = "F")
    public float field4770;

    @OriginalMember(owner = "client!ef", name = "nf", descriptor = "F")
    public float field4796;

    @OriginalMember(owner = "client!ef", name = "rf", descriptor = "F")
    private float field4800;

    @OriginalMember(owner = "client!ef", name = "wf", descriptor = "F")
    public float field4805;

    @OriginalMember(owner = "client!ef", name = "zf", descriptor = "F")
    public float field4808;

    @OriginalMember(owner = "client!ef", name = "Of", descriptor = "F")
    public float field4823;

    @OriginalMember(owner = "client!ef", name = "Qf", descriptor = "F")
    public float field4825;

    @OriginalMember(owner = "client!ef", name = "cg", descriptor = "F")
    public float field4837;

    @OriginalMember(owner = "client!ef", name = "fg", descriptor = "F")
    private float field4840;

    @OriginalMember(owner = "client!ef", name = "Cg", descriptor = "F")
    private float field4863;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ef", name = "sb", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!ef", name = "tb", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ef", name = "ub", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ef", name = "vb", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ef", name = "wb", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ef", name = "yb", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ef", name = "zb", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ef", name = "Ab", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ef", name = "Bb", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ef", name = "Cb", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ef", name = "Db", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ef", name = "Eb", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ef", name = "Fb", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ef", name = "Gb", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ef", name = "Hb", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ef", name = "Ib", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ef", name = "Jb", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ef", name = "Kb", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ef", name = "Lb", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ef", name = "Mb", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ef", name = "Nb", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ef", name = "Ob", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ef", name = "Pb", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ef", name = "Qb", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ef", name = "Rb", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ef", name = "Sb", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ef", name = "Tb", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ef", name = "Ub", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ef", name = "Vb", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ef", name = "Wb", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ef", name = "Xb", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ef", name = "Yb", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ef", name = "Zb", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ef", name = "ac", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ef", name = "bc", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ef", name = "cc", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ef", name = "dc", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ef", name = "ec", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ef", name = "fc", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ef", name = "gc", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ef", name = "hc", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ef", name = "ic", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ef", name = "kc", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ef", name = "lc", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ef", name = "nc", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ef", name = "oc", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ef", name = "pc", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ef", name = "qc", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ef", name = "rc", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ef", name = "sc", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ef", name = "tc", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ef", name = "uc", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ef", name = "vc", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ef", name = "wc", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ef", name = "xc", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ef", name = "yc", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ef", name = "zc", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!ef", name = "Ac", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ef", name = "Bc", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ef", name = "Cc", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!ef", name = "Dc", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ef", name = "Ec", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ef", name = "Fc", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ef", name = "Gc", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ef", name = "Hc", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ef", name = "Ic", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ef", name = "Jc", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ef", name = "Kc", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ef", name = "Lc", descriptor = "I")
    private int field4665;

    @OriginalMember(owner = "client!ef", name = "Mc", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ef", name = "Nc", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ef", name = "Oc", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ef", name = "Pc", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ef", name = "Qc", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ef", name = "Rc", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!ef", name = "Sc", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ef", name = "Tc", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ef", name = "Uc", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ef", name = "Vc", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ef", name = "Wc", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ef", name = "Yc", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ef", name = "Zc", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ef", name = "ad", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!ef", name = "bd", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ef", name = "cd", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!ef", name = "dd", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ef", name = "ed", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ef", name = "fd", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ef", name = "gd", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ef", name = "hd", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!ef", name = "id", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ef", name = "jd", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!ef", name = "kd", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ef", name = "ld", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ef", name = "md", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!ef", name = "nd", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ef", name = "od", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ef", name = "pd", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ef", name = "qd", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!ef", name = "rd", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!ef", name = "sd", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!ef", name = "td", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ef", name = "vd", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!ef", name = "wd", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!ef", name = "xd", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!ef", name = "zd", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!ef", name = "Ad", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ef", name = "Bd", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!ef", name = "Cd", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ef", name = "Dd", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ef", name = "Ed", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ef", name = "Fd", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ef", name = "Gd", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ef", name = "Hd", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ef", name = "Id", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ef", name = "Jd", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ef", name = "Kd", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ef", name = "Ld", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!ef", name = "Md", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ef", name = "Nd", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ef", name = "Od", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ef", name = "Pd", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ef", name = "Qd", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!ef", name = "Rd", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!ef", name = "Td", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!ef", name = "Ud", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!ef", name = "Vd", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!ef", name = "Zd", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ef", name = "ae", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ef", name = "de", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!ef", name = "ee", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ef", name = "he", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!ef", name = "le", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!ef", name = "ze", descriptor = "I")
    public int field4757;

    @OriginalMember(owner = "client!ef", name = "Be", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!ef", name = "Ce", descriptor = "I")
    private int field4760;

    @OriginalMember(owner = "client!ef", name = "Te", descriptor = "I")
    private int field4777;

    @OriginalMember(owner = "client!ef", name = "tf", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!ef", name = "ag", descriptor = "I")
    private int field4835;

    @OriginalMember(owner = "client!ef", name = "bg", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!ef", name = "dg", descriptor = "I")
    private int field4838;

    @OriginalMember(owner = "client!ef", name = "eg", descriptor = "I")
    public int field4839;

    @OriginalMember(owner = "client!ef", name = "ig", descriptor = "I")
    private int field4843;

    @OriginalMember(owner = "client!ef", name = "qg", descriptor = "I")
    private int field4851;

    @OriginalMember(owner = "client!ef", name = "ug", descriptor = "I")
    private int field4855;

    @OriginalMember(owner = "client!ef", name = "zg", descriptor = "I")
    private int field4860;

    @OriginalMember(owner = "client!ef", name = "Bg", descriptor = "I")
    private int field4862;

    @OriginalMember(owner = "client!ef", name = "Gg", descriptor = "I")
    private int field4867;

    @OriginalMember(owner = "client!ef", name = "Lg", descriptor = "I")
    private int field4872;

    @OriginalMember(owner = "client!ef", name = "Og", descriptor = "I")
    private int field4875;

    @OriginalMember(owner = "client!ef", name = "Vg", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!ef", name = "Wg", descriptor = "I")
    private int field4883;

    @OriginalMember(owner = "client!ef", name = "ah", descriptor = "I")
    public int field4887;

    @OriginalMember(owner = "client!ef", name = "uf", descriptor = "J")
    private long field4803;

    @OriginalMember(owner = "client!ef", name = "Qe", descriptor = "Lrt;")
    private class151 field4774;

    @OriginalMember(owner = "client!ef", name = "Jf", descriptor = "Ltc;")
    public class234 field4818;

    @OriginalMember(owner = "client!ef", name = "Kf", descriptor = "Ltc;")
    public class234 field4819;

    @OriginalMember(owner = "client!ef", name = "rg", descriptor = "Lml;")
    public class264 field4852;

    @OriginalMember(owner = "client!ef", name = "Rg", descriptor = "Lml;")
    public class264 field4878;

    @OriginalMember(owner = "client!ef", name = "Ug", descriptor = "Lml;")
    public class264 field4881;

    @OriginalMember(owner = "client!ef", name = "Jg", descriptor = "Ltb;")
    private class274 field4870;

    @OriginalMember(owner = "client!ef", name = "Se", descriptor = "Lje;")
    public class276 field4776;

    @OriginalMember(owner = "client!ef", name = "sf", descriptor = "Lje;")
    public class276 field4801;

    @OriginalMember(owner = "client!ef", name = "Ue", descriptor = "Lap;")
    private class334 field4778;

    @OriginalMember(owner = "client!ef", name = "lf", descriptor = "Lap;")
    private class334 field4794;

    @OriginalMember(owner = "client!ef", name = "Je", descriptor = "Lko;")
    public class348 field4767;

    @OriginalMember(owner = "client!ef", name = "kf", descriptor = "Lko;")
    public class348 field4793;

    @OriginalMember(owner = "client!ef", name = "mf", descriptor = "Lko;")
    public class348 field4795;

    @OriginalMember(owner = "client!ef", name = "xf", descriptor = "Lko;")
    public class348 field4806;

    @OriginalMember(owner = "client!ef", name = "Sf", descriptor = "Lko;")
    public class348 field4827;

    @OriginalMember(owner = "client!ef", name = "og", descriptor = "Lko;")
    public class348 field4849;

    @OriginalMember(owner = "client!ef", name = "sg", descriptor = "Lko;")
    public class348 field4853;

    @OriginalMember(owner = "client!ef", name = "yg", descriptor = "Lko;")
    public class348 field4859;

    @OriginalMember(owner = "client!ef", name = "Ig", descriptor = "Lko;")
    public class348 field4869;

    @OriginalMember(owner = "client!ef", name = "Tg", descriptor = "Lko;")
    public class348 field4880;

    @OriginalMember(owner = "client!ef", name = "te", descriptor = "Lnf;")
    private class406 field4751;

    @OriginalMember(owner = "client!ef", name = "ue", descriptor = "Lnf;")
    private class406 field4752;

    @OriginalMember(owner = "client!ef", name = "If", descriptor = "Ltq;")
    private class442 field4817;

    @OriginalMember(owner = "client!ef", name = "We", descriptor = "Lwc;")
    public class48 field4780;

    @OriginalMember(owner = "client!ef", name = "ef", descriptor = "Lwc;")
    public class48 field4788;

    @OriginalMember(owner = "client!ef", name = "ke", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4742;

    @OriginalMember(owner = "client!ef", name = "Pe", descriptor = "Z")
    public boolean field4773;

    @OriginalMember(owner = "client!ef", name = "Re", descriptor = "Z")
    public boolean field4775;

    @OriginalMember(owner = "client!ef", name = "df", descriptor = "Z")
    private boolean field4787;

    @OriginalMember(owner = "client!ef", name = "of", descriptor = "Z")
    private boolean field4797;

    @OriginalMember(owner = "client!ef", name = "yf", descriptor = "Z")
    private boolean field4807;

    @OriginalMember(owner = "client!ef", name = "Df", descriptor = "Z")
    private boolean field4812;

    @OriginalMember(owner = "client!ef", name = "Ff", descriptor = "Z")
    private boolean field4814;

    @OriginalMember(owner = "client!ef", name = "Mf", descriptor = "Z")
    public boolean field4821;

    @OriginalMember(owner = "client!ef", name = "Pf", descriptor = "Z")
    private boolean field4824;

    @OriginalMember(owner = "client!ef", name = "Rf", descriptor = "Z")
    private boolean field4826;

    @OriginalMember(owner = "client!ef", name = "Vf", descriptor = "Z")
    public boolean field4830;

    @OriginalMember(owner = "client!ef", name = "Xf", descriptor = "Z")
    private boolean field4832;

    @OriginalMember(owner = "client!ef", name = "tg", descriptor = "Z")
    public boolean field4854;

    @OriginalMember(owner = "client!ef", name = "vg", descriptor = "Z")
    public boolean field4856;

    @OriginalMember(owner = "client!ef", name = "xg", descriptor = "Z")
    private boolean field4858;

    @OriginalMember(owner = "client!ef", name = "Dg", descriptor = "Z")
    public boolean field4864;

    @OriginalMember(owner = "client!ef", name = "Eg", descriptor = "Z")
    public boolean field4865;

    @OriginalMember(owner = "client!ef", name = "Hg", descriptor = "Z")
    private boolean field4868;

    @OriginalMember(owner = "client!ef", name = "kg", descriptor = "[Lmk;")
    private class40[] field4845;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 3)
    private final void method1926(byte arg0) {
        if (~this.field4843 != -4) {
            this.field4843 = 3;
            this.method1935((byte) -101);
            this.method1999(arg0 ^ 94);
            this.field4802 &= -8;
        }
        ++field4605;
        if (arg0 != 95) {
            this.field4862 = -93;
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V", line = 24)
    public final void method1927(int arg0) {
        ++field4559;
        if (arg0 != -31484) {
            this.method258(-113, 58, (int[]) null, (int[]) null);
        }
        OpenGL.glLightfv(16384, 4611, this.field4769, 0);
        OpenGL.glLightfv(16385, 4611, this.field4811, 0);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I", line = 36)
    public final int method288(int arg0, int arg1) {
        ++field4565;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "()Z", line = 44)
    public final boolean method301() {
        ++field4635;
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(IIIIII)Lmh;", line = 52)
    public final class444 method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4570;
        return !this.field4854 ? null : new class331(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ef", name = "GA", descriptor = "(IIII)V", line = 61)
    public final void method305(int arg0, int arg1, int arg2, int arg3) {
        ++field4705;
        if (!this.field4856) {
            throw new RuntimeException("");
        } else {
            this.field4820 = arg2;
            this.field4882 = arg0;
            this.field4786 = arg3;
            this.field4809 = arg1;
            this.field4733.field6741.method2221(Integer.MAX_VALUE);
            this.method1936((byte) 60);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIILma;II)V", line = 80)
    public final void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        ++field4707;
        class320 var10 = (class320) arg6;
        class442 var11 = var10.field4374;
        this.method1934(-3);
        this.method1996(2, var10.field4374);
        this.method1976(-128, arg5);
        this.method1963(true, 7681, 8448);
        this.method1975(34176, 34167, 768, 0);
        float var12 = var11.field6542 / (float) var11.field6539;
        float var13 = var11.field6543 / (float) var11.field6545;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method1975(34176, 5890, 768, 0);
    }

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "()Z", line = 111)
    public final boolean method282() {
        ++field4721;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V", line = 122)
    public final void method326(int arg0) {
        ++field4596;
        this.method1969(-8897);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()V", line = 130)
    public final void method236() {
        ++field4650;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(FZ)V", line = 139)
    public final void method1928(float arg0, boolean arg1) {
        ++field4545;
        if (!arg1) {
            this.field4842 = false;
        }
        if (this.field4876 != arg0) {
            this.field4876 = arg0;
            if (this.field4843 == 3) {
                this.method1935((byte) 62);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "()Z", line = 161)
    public final boolean method249() {
        ++field4651;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(Z)V", line = 171)
    private final void method1929(boolean arg0) {
        OpenGL.glViewport(this.field4829, this.field4857, this.field4549, this.field4548);
        if (arg0) {
            ++field4735;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BFF)V", line = 182)
    public final void method1930(byte arg0, float arg1, float arg2) {
        ++field4600;
        this.field4831 = arg1;
        this.field4850 = arg2;
        if (arg0 > -30) {
            this.method226((class471[]) null, (class122) null, (class387[]) null, 8);
        }
        if (!this.field4856) {
            this.method1936((byte) 60);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V", line = 200)
    private final void method1931(byte arg0) {
        ++field4655;
        int var2;
        for (var2 = 0; ~this.field4872 < ~var2; ++var2) {
            class153 var3 = this.field4877[var2];
            class346.field4959[0] = (float) var3.method1026(true);
            int var4 = var2 + 16386;
            class346.field4959[1] = (float) var3.method1025((byte) -89);
            class346.field4959[2] = (float) var3.method1027(class36.method216(arg0, 624));
            class346.field4959[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class346.field4959, 0);
            int var5 = var3.method1021(14919);
            float var6 = var3.method1023((byte) -17) / 255.0F;
            class346.field4959[0] = (float) class251.method1501(var5 >> 16, 255) * var6;
            class346.field4959[2] = var6 * (float) class251.method1501(255, var5);
            class346.field4959[1] = var6 * (float) (class251.method1501(65415, var5) >> 8);
            OpenGL.glLightfv(var4, 4609, class346.field4959, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1029((byte) -128) * var3.method1029((byte) -124)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field4838) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        if (arg0 != -41) {
            this.method290((class53) null);
        }
        this.field4838 = this.field4872;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 249)
    public final void method239(Canvas arg0) {
        ++field4739;
        long var2 = 0L;
        if (arg0 != null && this.field4640 != arg0) {
            if (this.field4599.containsKey(arg0)) {
                Long var4 = (Long) this.field4599.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field4637;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field4700.surfaceResized(var2);
            if (this.field4677 == arg0) {
                this.method1977(75);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V", line = 280)
    public final void method247(boolean arg0) {
        ++field4578;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V", line = 289)
    public final void method1932(boolean arg0, int arg1) {
        if (!arg0 != !this.field4826) {
            this.field4826 = arg0;
            this.method1958(false);
            this.field4802 &= -32;
        }
        ++field4645;
        if (arg1 != -32) {
            this.method1977(-54);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 309)
    public final void method228(Rectangle[] arg0, int arg1) {
        ++field4616;
        this.method229();
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZI)V", line = 317)
    public final void method1933(boolean arg0, int arg1) {
        if (!this.field4814 == arg0) {
            this.field4814 = arg0;
            this.method2003(true);
        }
        ++field4581;
        if (arg1 != -19629) {
            this.field4778 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "(I)V", line = 334)
    public final void method246(int arg0) {
        ++field4661;
        this.method1976(-102, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V", line = 346)
    public final void method1934(int arg0) {
        ++field4555;
        if (~this.field4802 != arg0) {
            this.method2004(98);
            this.method1932(false, -32);
            this.method1937(false, -88);
            this.method1938(34160, false);
            this.method1985(false, (byte) -86);
            this.method1944(-2, arg0 + 12432);
            this.field4802 = 2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lt;Lpn;Lc;[Lii;I)V", line = 367)
    public final void method242(class471[] arg0, class523 arg1, class122 arg2, class387[] arg3, int arg4) {
        ++field4727;
        this.method226(arg0, arg2, arg3, arg4);
        this.method316(arg1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lt;Lpn;Lc;Lii;I)V", line = 376)
    public final void method312(class471 arg0, class523 arg1, class122 arg2, class387 arg3, int arg4) {
        arg0.method397(arg2, arg3, arg4);
        ++field4714;
        this.method316(arg1);
    }

    @OriginalMember(owner = "client!ef", name = "MA", descriptor = "(I)V", line = 385)
    public final void method269(int arg0) {
        this.field4744 = 0;
        ++field4657;
        while (~arg0 < -2) {
            ++this.field4744;
            arg0 >>= 1;
        }
        this.field4747 = 1 << this.field4744;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V", line = 407)
    private final void method1935(byte arg0) {
        ++field4606;
        float var2 = (float) (-this.field4885) * this.field4876 / (float) this.field4791;
        float var3 = (float) (-this.field4816) * this.field4876 / (float) this.field4789;
        int var4 = 72 % ((arg0 - -33) / 58);
        float var5 = (float) (-this.field4885 + this.field4549) * this.field4876 / (float) this.field4791;
        float var6 = (float) (-this.field4816 + this.field4548) * this.field4876 / (float) this.field4789;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var5 && var3 != var6) {
            OpenGL.glOrtho((double) var2, (double) var5, (double) (-var6), (double) (-var3), (double) ((float) this.field4828 + -this.field4805), (double) ((float) this.field4768 - this.field4805));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V", line = 430)
    private final void method1936(byte arg0) {
        ++field4638;
        int var2;
        if (this.field4856) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field4809;
        } else {
            this.field4863 = (float) (-this.field4884 + this.field4768) + -this.field4831;
            this.field4823 = this.field4863 - (float) this.field4844 * this.field4850;
            if ((float) this.field4828 > this.field4823) {
                this.field4823 = (float) this.field4828;
            }
            OpenGL.glFogf(2915, this.field4823);
            OpenGL.glFogf(2916, this.field4863);
            var2 = this.field4833;
        }
        if (arg0 != 60) {
            this.field4835 = -26;
        }
        class281.field3859[2] = (float) class251.method1501(255, var2) / 255.0F;
        class281.field3859[1] = (float) class251.method1501(var2, 65280) / 65280.0F;
        class281.field3859[0] = (float) class251.method1501(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class281.field3859, 0);
        if (this.field4856) {
            this.field4733.field6741.method2224(-127);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(ZI)V", line = 469)
    public final void method1937(boolean arg0, int arg1) {
        if (arg0 == !this.field4868) {
            this.field4868 = arg0;
            this.method2003(true);
            this.field4802 &= -8;
        }
        ++field4710;
        if (arg1 >= -75) {
            this.method324((class490) null, (class4[]) null, false);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V", line = 487)
    public final void method1938(int arg0, boolean arg1) {
        ++field4723;
        if (arg0 != 34160) {
            this.method2005(-18);
        }
        if (!arg1 != !this.field4807) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field4802 &= -32;
            this.field4807 = arg1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lnf;B)V", line = 508)
    public final void method1939(class406 arg0, byte arg1) {
        ++field4579;
        if (arg1 > 72) {
            if (!this.field4775) {
                if (~this.field4755 <= -4) {
                    throw new RuntimeException();
                } else {
                    if (this.field4755 >= 0) {
                        this.field4749[this.field4755].method1646(true);
                    }
                    this.field4752 = this.field4751 = this.field4749[++this.field4755] = arg0;
                    this.field4752.method1641(24617);
                }
            } else {
                this.method2001(125, arg0);
                this.method1983(arg0, -103);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZILjaggl/memory/NativeBuffer;I)Lap;", line = 538)
    public final class334 method1940(int arg0, boolean arg1, int arg2, NativeBuffer arg3, int arg4) {
        ++field4686;
        if (arg4 > -80) {
            this.field4853 = null;
        }
        return (class334) (!this.field4785 || arg1 && !this.field4848 ? new class324(this, arg0, arg3) : new class17(this, arg0, arg3, arg2, arg1));
    }

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "(III[I)V", line = 558)
    public final void method256(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4675;
        float var5 = (float) arg2 * this.field4818.field3317 + (float) arg0 * this.field4818.field3314 + (float) arg1 * this.field4818.field3329 + this.field4818.field3312;
        if (!(var5 < (float) this.field4828) && !((float) this.field4768 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4818.field3326 + (float) arg0 * this.field4818.field3309 + (float) arg1 * this.field4818.field3296 + this.field4818.field3313) * (float) this.field4791 / var5);
            int var7 = (int) (((float) arg2 * this.field4818.field3323 + (float) arg0 * this.field4818.field3297 + (float) arg1 * this.field4818.field3319 + this.field4818.field3328) * (float) this.field4789 / var5);
            if (this.field4837 <= (float) var6 && this.field4770 >= (float) var6 && this.field4796 <= (float) var7 && (float) var7 <= this.field4808) {
                arg3[0] = (int) ((float) var6 + -this.field4837);
                arg3[1] = (int) ((float) var7 + -this.field4796);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "()V", line = 591)
    public final void method222() {
        ++field4615;
        this.field4856 = false;
        this.field4733.method2691(-1, false, false, 0);
        this.method1936((byte) 60);
        this.method1958(false);
    }

    @OriginalMember(owner = "client!ef", name = "OA", descriptor = "(IIII)V", line = 605)
    public final void method279(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field4548 > ~arg3) {
            arg3 = this.field4548;
        }
        ++field4698;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~this.field4549 > ~arg2) {
            arg2 = this.field4549;
        }
        this.field4815 = arg3;
        this.field4810 = arg1;
        this.field4841 = arg2;
        this.field4790 = arg0;
        OpenGL.glEnable(3089);
        this.method1986((byte) -125);
        this.method1990(97);
    }

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "()V", line = 634)
    public final void method320() {
        ++field4586;
        if (this.field4728 != null && this.field4728.method877(-78)) {
            this.field4738.method474(this.field4728, 1);
            this.field4729.method2111(-103);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 649)
    public final void method270(Canvas arg0) {
        ++field4568;
        if (this.field4640 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4599.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field4700.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field4599.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZI[BI)Lrt;", line = 683)
    public final class151 method1941(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        ++field4541;
        if (!this.field4785 || arg1 && !this.field4848) {
            return arg2 != 0 ? null : new class409(this, arg4, arg3, arg0);
        } else {
            return new class445(this, arg4, arg3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lmh;)V", line = 700)
    public final void method315(class444 arg0) {
        ++field4604;
        this.field4870 = (class274) arg0;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)V", line = 715)
    private final void method1942(byte arg0) {
        int var2 = 107 / ((arg0 - -80) / 41);
        ++field4689;
        if (this.field4787) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4787 = false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "()V", line = 733)
    public final void method260() {
        this.field4841 = this.field4549;
        this.field4810 = 0;
        this.field4815 = this.field4548;
        ++field4715;
        this.field4790 = 0;
        OpenGL.glDisable(3089);
        this.method1986((byte) -122);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([IIIII)Ll;", line = 751)
    public final class16 method244(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4585;
        return new class493(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[BBZ)Lap;", line = 759)
    public final class334 method1943(int arg0, int arg1, byte[] arg2, byte arg3, boolean arg4) {
        if (arg3 != 49) {
            return null;
        } else {
            ++field4587;
            return (class334) (!this.field4785 || arg4 && !this.field4848 ? new class324(this, arg1, arg2, arg0) : new class17(this, arg1, arg2, arg0, arg4));
        }
    }

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "()Z", line = 776)
    public final boolean method314() {
        ++field4588;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "()Z", line = 785)
    public final boolean method261() {
        ++field4643;
        return this.field4728 != null && this.field4728.method877(-105);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[[I[[IIII)Lta;", line = 794)
    public final class142 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4542;
        return new class70(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V", line = 802)
    public final synchronized void method281(int arg0) {
        ++field4667;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4761.method2807(120)) {
            class500 var12 = (class500) this.field4761.method2816(true);
            class275.field3765[var2++] = (int) var12.field3615;
            this.field4759 -= var12.field7369;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class275.field3765, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class275.field3765, 0);
            var2 = 0;
        }
        while (!this.field4762.method2807(105)) {
            class500 var11 = (class500) this.field4762.method2816(true);
            class275.field3765[var2++] = (int) var11.field3615;
            this.field4757 -= var11.field7369;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class275.field3765, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class275.field3765, 0);
            var2 = 0;
        }
        while (!this.field4763.method2807(103)) {
            class500 var10 = (class500) this.field4763.method2816(true);
            class275.field3765[var2++] = var10.field7369;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class275.field3765, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class275.field3765, 0);
            var2 = 0;
        }
        while (!this.field4764.method2807(123)) {
            class500 var9 = (class500) this.field4764.method2816(true);
            class275.field3765[var2++] = (int) var9.field3615;
            this.field4760 -= var9.field7369;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class275.field3765, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class275.field3765, 0);
            boolean var4 = false;
        }
        while (!this.field4758.method2807(122)) {
            class500 var8 = (class500) this.field4758.method2816(true);
            OpenGL.glDeleteLists((int) var8.field3615, var8.field7369);
        }
        while (!this.field4765.method2807(116)) {
            class260 var7 = this.field4765.method2816(true);
            OpenGL.glDeleteProgramARB((int) var7.field3615);
        }
        while (!this.field4766.method2807(108)) {
            class260 var6 = this.field4766.method2816(true);
            OpenGL.glDeleteObjectARB(var6.field3615);
        }
        while (!this.field4758.method2807(100)) {
            class500 var5 = (class500) this.field4758.method2816(true);
            OpenGL.glDeleteLists((int) var5.field3615, var5.field7369);
        }
        this.field4729.method2113(6408);
        if (~this.method313() < -100663297 && ~(this.field4803 + 60000L) > ~class246.method1483(5957)) {
            System.gc();
            this.field4803 = class246.method1483(5957);
        }
        this.field4743 = var3;
    }

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "()Z", line = 969)
    public final boolean method273() {
        ++field4656;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V", line = 977)
    public final void method1944(int arg0, int arg1) {
        this.method1997(true, arg0, 0);
        if (arg1 == 12429) {
            ++field4719;
        }
    }

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "()Z", line = 988)
    public final boolean method287() {
        ++field4731;
        return this.field4728 != null && (this.field4737 <= 1 || this.field4824);
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)V", line = 998)
    private final void method1945(int arg0) {
        if (this.field4802 != 1) {
            this.method2004(95);
            this.method1932(false, -32);
            this.method1937(false, arg0 ^ -864);
            this.method1938(34160, false);
            this.method1985(false, (byte) -94);
            this.method1996(2, (class40) null);
            this.method1944(-2, arg0 ^ 13197);
            this.method1974(1, arg0 ^ 4353);
            this.field4802 = 1;
        }
        if (arg0 != 768) {
            this.method316((class523) null);
        }
        ++field4623;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)V", line = 1027)
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field4590;
        this.method285(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ldq;[Lft;Z)Lla;", line = 1041)
    public final class315 method324(class490 arg0, class4[] arg1, boolean arg2) {
        ++field4711;
        return new class379(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)I", line = 1049)
    public final int method1946(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method1951((byte) 95);
        }
        ++field4681;
        if (arg1 != 5121 && arg1 != 5120) {
            if (arg1 != 5123 && arg1 != 5122) {
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

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(II)V", line = 1070)
    public static final void method1947(int arg0, int arg1) {
        class162 var2 = class528.field7803;
        synchronized (class528.field7803) {
            class528.field7803.method1065((byte) -95, arg1);
        }
        ++field4624;
        if (arg0 != 29034) {
            method1961(-21, 103, -121, -12, -79, 62, 18);
        }
        class162 var3 = class345.field4953;
        synchronized (class345.field4953) {
            class345.field4953.method1065((byte) -95, arg1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "()Z", line = 1086)
    public final boolean method298() {
        ++field4706;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "()Z", line = 1094)
    public final boolean method294() {
        ++field4699;
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ltc;Z)V", line = 1104)
    public final void method1948(class234 arg0, boolean arg1) {
        ++field4695;
        OpenGL.glPushMatrix();
        if (!arg1) {
            this.field4814 = true;
        }
        OpenGL.glMultMatrixf(arg0.method1440((byte) -127), 0);
    }

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "(I)V", line = 1118)
    public final void method1949(int arg0) {
        OpenGL.glPushMatrix();
        ++field4572;
        if (arg0 != 3) {
            this.field4640 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(II)V", line = 1129)
    public final void method1950(int arg0, int arg1) {
        if (this.field4860 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field4860 = arg1;
        }
        if (arg0 != -29847) {
            this.field4744 = 57;
        }
        ++field4709;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(B)V", line = 1147)
    private final void method1951(byte arg0) {
        ++field4617;
        if (this.field4805 == 0.0F) {
            this.field4871[14] = this.field4840;
            this.field4871[10] = this.field4800;
        } else {
            float var2 = this.field4813 / (this.field4813 + this.field4805);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field4840 * (1.0F - var2) / this.field4805;
            this.field4871[14] = this.field4840 * var3;
            this.field4871[10] = this.field4800 + var4;
        }
        this.field4771 = (float) this.field4768 + -this.field4805;
        this.field4782 = (this.field4871[14] + (float) (-this.field4768)) / this.field4871[10];
        if (arg0 != -91) {
            this.field4857 = 82;
        }
    }

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "()Z", line = 1180)
    public final boolean method297() {
        ++field4589;
        if (this.field4728 != null) {
            if (!this.field4728.method877(-48)) {
                if (!this.field4738.method479(this.field4728, false)) {
                    return false;
                }
                this.field4729.method2111(-114);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "(IIII)[I", line = 1205)
    public final int[] method251(int arg0, int arg1, int arg2, int arg3) {
        ++field4703;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field4548 + -var6, arg2, 1, 32993, this.field4874, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLnf;)V", line = 1227)
    public final void method1952(boolean arg0, class406 arg1) {
        if (!arg0) {
            ++field4726;
            if (~this.field4753 <= -1 && this.field4750[this.field4753] == arg1) {
                this.field4750[this.field4753--] = null;
                arg1.method1632(1393);
                if (~this.field4753 > -1) {
                    this.field4751 = null;
                } else {
                    this.field4751 = this.field4750[this.field4753];
                    this.field4751.method1638((byte) -30);
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)V", line = 1251)
    public final synchronized void method1953(int arg0, byte arg1, int arg2) {
        ++field4543;
        if (arg1 <= 40) {
            this.field4876 = -1.8232442F;
        }
        class500 var4 = new class500(arg2);
        var4.field3615 = (long) arg0;
        this.field4762.method2809(var4, 2);
    }

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "(I)V", line = 1265)
    public final void method1954(int arg0) {
        ++field4574;
        OpenGL.glPopMatrix();
        if (arg0 != 34162) {
            this.method300(17, 64, 114, 84, -118);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIII)V", line = 1279)
    public final void method293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4602;
        this.method1945(768);
        this.method1976(-97, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(B)V", line = 1301)
    private final void method1955(byte arg0) {
        ++field4583;
        float[] var2 = this.field4871;
        float var3 = (float) (-this.field4885 * this.field4828) / (float) this.field4791;
        float var4 = (float) ((-this.field4885 + this.field4549) * this.field4828) / (float) this.field4791;
        float var5 = (float) (this.field4828 * this.field4816) / (float) this.field4789;
        float var6 = (float) ((-this.field4548 + this.field4816) * this.field4828) / (float) this.field4789;
        int var7 = -10 % ((52 - arg0) / 38);
        if (var3 != var4 && var5 != var6) {
            float var8 = (float) this.field4828 * 2.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[15] = 0.0F;
            var2[6] = 0.0F;
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[7] = 0.0F;
            var2[11] = -1.0F;
            var2[13] = 0.0F;
            var2[10] = this.field4800 = (float) (-(this.field4828 + this.field4768)) / (float) (-this.field4828 + this.field4768);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[5] = var8 / (var5 - var6);
            var2[2] = 0.0F;
            var2[0] = var8 / (-var3 + var4);
            var2[14] = this.field4840 = -((float) this.field4768 * var8) / (float) (-this.field4828 + this.field4768);
            var2[1] = 0.0F;
            var2[4] = 0.0F;
        } else {
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[8] = 0.0F;
            var2[1] = 0.0F;
            var2[0] = 1.0F;
            var2[7] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
            var2[12] = 0.0F;
            var2[14] = 0.0F;
            var2[6] = 0.0F;
            var2[10] = 1.0F;
            var2[11] = 0.0F;
            var2[15] = 1.0F;
            var2[9] = 0.0F;
            var2[2] = 0.0F;
        }
        this.method1951((byte) -91);
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(II)I", line = 1362)
    public final int method1956(int arg0, int arg1) {
        ++field4598;
        if (arg1 != 6410) {
            this.method290((class53) null);
        }
        if (~arg0 != -6407 && ~arg0 != -6410) {
            if (arg0 != 6410 && arg0 != 34846 && arg0 != 34844) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (arg0 != 6408 && arg0 != 34847) {
                    if (~arg0 == -34844) {
                        return 6;
                    } else if (arg0 == 34842) {
                        return 8;
                    } else if (arg0 == 6402) {
                        return 3;
                    } else if (~arg0 == -6402) {
                        return 1;
                    } else {
                        throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[I[I)Lma;", line = 1408)
    public final class10 method258(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4557;
        return class403.method2431(this, arg1, arg3, arg2, (byte) -128, arg0);
    }

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "(I)V", line = 1418)
    private final void method1957(int arg0) {
        ++field4678;
        this.field4818 = new class234();
        this.field4819 = new class234();
        this.field4845 = new class40[this.field4839];
        this.field4852 = new class264(this, 3553, 6408, 1, 1);
        this.field4881 = new class264(this, 3553, arg0, 1, 1);
        this.field4878 = new class264(this, 3553, 6408, 1, 1);
        this.field4827 = new class348(this);
        this.field4859 = new class348(this);
        this.field4880 = new class348(this);
        this.field4869 = new class348(this);
        this.field4767 = new class348(this);
        this.field4806 = new class348(this);
        this.field4849 = new class348(this);
        this.field4793 = new class348(this);
        this.field4853 = new class348(this);
        this.field4795 = new class348(this);
        if (this.field4798) {
            this.field4776 = new class276(this);
            this.field4801 = new class276(this);
        }
    }

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "(IIIIII)V", line = 1456)
    public final void method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4649;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1945(768);
        this.method1976(-93, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4832) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4832) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(Z)V", line = 1492)
    private final void method1958(boolean arg0) {
        if (this.field4826 && this.field4844 >= 0 | this.field4856) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0) {
            method1947(3, 121);
        }
        ++field4660;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(Z)V", line = 1508)
    public final void method321(boolean arg0) {
        ++field4544;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()V", line = 1518)
    public final void method229() {
        ++field4671;
        try {
            this.field4700.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "()F", line = 1537)
    public final float method259() {
        ++field4592;
        return this.field4813;
    }

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "(I)Lvg;", line = 1546)
    public final class39 method1959(int arg0) {
        ++field4684;
        if (arg0 != 34018) {
            this.field4773 = true;
        }
        return this.field4870 == null ? null : this.field4870.method1628(50);
    }

    @OriginalMember(owner = "client!ef", name = "YA", descriptor = "()I", line = 1557)
    public final int method237() {
        ++field4619;
        return this.field4768;
    }

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "()Lc;", line = 1566)
    public final class122 method280() {
        ++field4618;
        return this.field4740;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIII)V", line = 1574)
    public final void method1960(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 5889) {
            this.method255(51, (class153[]) null);
        }
        ++field4659;
        OpenGL.glDrawArrays(arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V", line = 1589)
    public final void method292(int arg0) {
        ++field4679;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field4730 = arg0;
            this.field4729.method2111(-101);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIIII)V", line = 1603)
    public static final void method1961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4607;
        int var7 = class46.method425(true, arg2, class224.field3193, class417.field6057);
        int var8 = class46.method425(true, arg4, class224.field3193, class417.field6057);
        int var9 = class46.method425(true, arg6, class76.field1021, class424.field6204);
        int var10 = class46.method425(true, arg1, class76.field1021, class424.field6204);
        int var11 = class46.method425(true, arg2 - -arg0, class224.field3193, class417.field6057);
        int var12 = class46.method425(true, -arg0 + arg4, class224.field3193, class417.field6057);
        if (arg3 == -10568) {
            for (int var13 = var7; ~var13 > ~var11; ++var13) {
                class210.method1300(var9, class437.field6400[var13], (byte) 118, var10, arg5);
            }
            for (int var14 = var8; ~var12 > ~var14; --var14) {
                class210.method1300(var9, class437.field6400[var14], (byte) 101, var10, arg5);
            }
            int var15 = class46.method425(true, arg0 + arg6, class76.field1021, class424.field6204);
            int var16 = class46.method425(true, -arg0 + arg1, class76.field1021, class424.field6204);
            for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                int[] var18 = class437.field6400[var17];
                class210.method1300(var9, var18, (byte) 93, var15, arg5);
                class210.method1300(var16, var18, (byte) 82, var10, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIII)V", line = 1658)
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1945(768);
        ++field4558;
        this.method1976(-113, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 1674)
    public final void method221(int arg0) {
        ++field4601;
        this.method1998((byte) 81);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lap;I)V", line = 1682)
    public final void method1962(class334 arg0, int arg1) {
        if (this.field4778 != arg0) {
            if (this.field4785) {
                OpenGL.glBindBufferARB(34962, arg0.method104(false));
            }
            this.field4778 = arg0;
        }
        ++field4682;
        if (arg1 != 34962) {
            this.method242((class471[]) null, (class523) null, (class122) null, (class387[]) null, 94);
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(FF)V", line = 1702)
    public final void method245(float arg0, float arg1) {
        ++field4666;
        if (this.field4813 != arg0 || this.field4805 != arg1) {
            this.field4805 = arg1;
            this.field4813 = arg0;
            this.method1951((byte) -91);
            if (~this.field4843 != -4) {
                if (this.field4843 == 2) {
                    this.method1989(-35);
                    return;
                }
            } else {
                this.method1935((byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)V", line = 1734)
    public final void method1963(boolean arg0, int arg1, int arg2) {
        if (~this.field4860 == -1) {
            boolean var4 = false;
            if (~this.field4792 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var4 = true;
                this.field4792 = arg1;
            }
            if (this.field4873 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field4873 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field4802 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
        if (arg0) {
            ++field4646;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIIII)V", line = 1777)
    public final void method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4701;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;ILdr;)V", line = 1784)
    public class338(int arg0, Canvas arg1, class277 arg2, int arg3, class504 arg4) {
        super(arg0, arg2);
        new class356();
        new class247(16);
        this.field4758 = new class479();
        this.field4761 = new class479();
        this.field4762 = new class479();
        this.field4763 = new class479();
        this.field4764 = new class479();
        this.field4765 = new class479();
        this.field4766 = new class479();
        this.field4768 = 3584;
        this.field4782 = 3584.0F;
        this.field4813 = 3000.0F;
        this.field4791 = 512;
        this.field4792 = 8448;
        this.field4829 = 0;
        this.field4781 = -1;
        this.field4828 = 50;
        this.field4786 = 0;
        this.field4822 = 1.0F;
        this.field4809 = -1;
        this.field4831 = 0.0F;
        this.field4811 = new float[4];
        this.field4847 = 1.0F;
        this.field4833 = -1;
        this.field4799 = new float[4];
        this.field4850 = 1.0F;
        this.field4846 = -1.0F;
        this.field4815 = 0;
        this.field4857 = 0;
        this.field4769 = new float[4];
        this.field4784 = -1.0F;
        this.field4783 = new float[4];
        this.field4841 = 0;
        this.field4866 = 1.0F;
        this.field4861 = true;
        this.field4789 = 512;
        this.field4844 = -1;
        this.field4873 = 8448;
        this.field4876 = 1.0F;
        this.field4771 = 3584.0F;
        this.field4871 = new float[16];
        this.field4810 = 0;
        this.field4816 = 0;
        this.field4877 = new class153[class472.field6893];
        this.field4820 = -1;
        this.field4790 = 0;
        this.field4884 = 0;
        this.field4885 = 0;
        this.field4677 = this.field4640 = arg1;
        this.field4737 = arg3;
        try {
            if (class33.field443 == null || !class33.field443) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (!var6.startsWith("mac")) {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2972("jaggl.dll", 21).toString());
                        } else {
                            System.load(arg4.method2972("libjaggl.jnilib", 21).toString());
                        }
                    } else {
                        System.load(arg4.method2972("libjaggl.so", 21).toString());
                    }
                    class33.field443 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class33.field443 = Boolean.TRUE;
                }
            }
            if (class33.field443 != null && class33.field443) {
                this.field4700 = new OpenGL();
                this.field4724 = this.field4637 = this.field4700.init(arg1, 8, 8, 8, 24, 0, this.field4737);
                if (~this.field4637 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1998((byte) 81);
                    int var7 = this.method2005(0);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field4874 = !this.field4772 ? 5121 : 33639;
                        if (this.field4804.indexOf("radeon") != -1) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class38.method284(' ', this.field4804.replace('/', ' '), false);
                            for (int var12 = 0; var11.length > var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (var13.length() > 0) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class325.method1882(var13.substring(1, 3), false)) {
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
                                            if (~var13.length() <= -5 && class325.method1882(var13.substring(0, 4), false)) {
                                                var8 = class104.method765(var13.substring(0, 4), 128);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field4779 = false;
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && var8 <= 7999) {
                                    this.field4785 = false;
                                }
                                if (var8 >= 7000 && var8 <= 9250) {
                                    this.field4879 = false;
                                }
                            }
                            this.field4842 &= this.field4700.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field4848 = this.field4785;
                        }
                        if (this.field4834.indexOf("intel") != -1) {
                            this.field4798 = false;
                        }
                        this.field4886 = !this.field4834.equals("s3 graphics");
                        if (this.field4785) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class235.method1450(true, false, 5);
                        this.field4745 = true;
                        this.field4729 = new class352(this, super.field471);
                        this.method1957(6408);
                        this.field4748 = new class19(this);
                        this.field4738 = new class58(this);
                        if (this.field4738.method476(0)) {
                            this.field4728 = new class455(this);
                            if (!this.field4728.method2677(false)) {
                                this.field4728.method872(60);
                                this.field4728 = null;
                            }
                        }
                        this.field4733 = new class459(this);
                        this.method2007(8704);
                        this.method1977(88);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field4700.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (~(var15++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class157.method1046(-128, 100L);
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
            this.method240();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "(I)V", line = 1986)
    public final void method1964(int arg0) {
        if (arg0 <= 100) {
            this.method237();
        }
        ++field4654;
        if (~this.field4843 != -1) {
            this.field4802 &= -32;
            this.field4843 = 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIZI)V", line = 2003)
    public static final void method1965(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field4687;
        if (!arg4) {
            int var6 = 0;
            int var7 = arg2;
            int var8 = arg0 * arg0;
            int var9 = arg2 * arg2;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg2 << 1;
            int var13 = (1 - var12) * var8 + var10;
            int var14 = -((var12 + -1) * var11) + var9;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg2 << 1) + -3) * var11;
            int var19 = (var6 + 1) * var16;
            int var20 = (arg2 + -1) * var15;
            class210.method1300(-arg0 + arg1, class437.field6400[arg3], (byte) 93, arg0 + arg1, arg5);
            while (~var7 < -1) {
                if (var13 < 0) {
                    while (~var13 > -1) {
                        var14 += var19;
                        var13 += var17;
                        ++var6;
                        var19 += var16;
                        var17 += var16;
                    }
                }
                if (~var14 > -1) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
                var13 += -var20;
                var14 += -var18;
                --var7;
                var20 -= var15;
                var18 -= var15;
                int var21 = -var7 + arg3;
                int var22 = arg3 - -var7;
                int var23 = arg1 + var6;
                int var24 = -var6 + arg1;
                class210.method1300(var24, class437.field6400[var21], (byte) 95, var23, arg5);
                class210.method1300(var24, class437.field6400[var22], (byte) 111, var23, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(II)V", line = 2086)
    public final synchronized void method1966(int arg0, int arg1) {
        if (arg1 <= 83) {
            this.method270((Canvas) null);
        }
        ++field4692;
        class260 var3 = new class260();
        var3.field3615 = (long) arg0;
        this.field4765.method2809(var3, 2);
    }

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "()Z", line = 2100)
    public final boolean method309() {
        ++field4594;
        return this.field4832 && (!this.method261() || this.field4824);
    }

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "()I", line = 2108)
    public final int method272() {
        ++field4639;
        int var1 = this.field4883;
        this.field4883 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ef", name = "TA", descriptor = "(IIIII)V", line = 2120)
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4702;
        this.method1945(768);
        this.method1976(-112, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "(I)V", line = 2141)
    private final void method1967(int arg0) {
        class281.field3859[1] = this.field4847 * this.field4825;
        class281.field3859[2] = this.field4825 * this.field4822;
        class281.field3859[3] = 1.0F;
        class281.field3859[0] = this.field4866 * this.field4825;
        ++field4566;
        OpenGL.glLightModelfv(2899, class281.field3859, arg0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lwc;Lwc;ILwc;Lwc;)V", line = 2157)
    public final void method1968(class48 arg0, class48 arg1, int arg2, class48 arg3, class48 arg4) {
        ++field4563;
        if (arg0 != null) {
            this.method1962(arg0.field571, 34962);
            OpenGL.glVertexPointer(arg0.field577, arg0.field572, this.field4778.method111(-28487), this.field4778.method110((byte) -127) - -((long) arg0.field573));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg2 > 105) {
            if (arg3 == null) {
                OpenGL.glDisableClientState(32885);
            } else {
                this.method1962(arg3.field571, 34962);
                OpenGL.glNormalPointer(arg3.field572, this.field4778.method111(-28487), this.field4778.method110((byte) -110) + (long) arg3.field573);
                OpenGL.glEnableClientState(32885);
            }
            if (arg1 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method1962(arg1.field571, 34962);
                OpenGL.glColorPointer(arg1.field577, arg1.field572, this.field4778.method111(-28487), this.field4778.method110((byte) -108) - -((long) arg1.field573));
                OpenGL.glEnableClientState(32886);
            }
            if (arg4 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method1962(arg4.field571, 34962);
                OpenGL.glTexCoordPointer(arg4.field577, arg4.field572, this.field4778.method111(-28487), this.field4778.method110((byte) -75) + (long) arg4.field573);
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "(I)V", line = 2204)
    private final void method1969(int arg0) {
        if (arg0 == -8897) {
            this.field4700.detach();
            ++field4644;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lft;Z)Ll;", line = 2215)
    public final class16 method265(class4 arg0, boolean arg1) {
        ++field4610;
        int[] var3 = new int[arg0.field41 * arg0.field36];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field39 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field36; ++var6) {
                for (int var7 = 0; var7 < arg0.field41; ++var7) {
                    int var8 = arg0.field40[255 & arg0.field34[var4++]];
                    var3[var5++] = var8 == 0 ? 0 : class255.method1532(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field36 < ~var9; ++var9) {
                for (int var11 = 0; ~arg0.field41 < ~var11; ++var11) {
                    var3[var5++] = class255.method1532(arg0.field39[var4] << 24, arg0.field40[class251.method1501(arg0.field34[var4], 255)]);
                    ++var4;
                }
            }
        }
        class16 var10 = this.method244(var3, 0, arg0.field41, arg0.field41, arg0.field36);
        var10.method97(arg0.field37, arg0.field33, arg0.field38, arg0.field35);
        return var10;
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(II)I", line = 2279)
    public final int method1970(int arg0, int arg1) {
        ++field4603;
        if (arg0 != -11037) {
            this.field4724 = 64L;
        }
        if (arg1 == 1) {
            return 7681;
        } else if (~arg1 == -1) {
            return 8448;
        } else if (~arg1 != -3) {
            if (arg1 != 3) {
                if (arg1 == 4) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!ef", name = "da", descriptor = "([I)V", line = 2312)
    public final void method234(int[] arg0) {
        arg0[3] = this.field4815;
        arg0[1] = this.field4810;
        ++field4636;
        arg0[0] = this.field4790;
        arg0[2] = this.field4841;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFFFI)V", line = 2326)
    public final void method1971(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class281.field3859[0] = arg2;
        if (arg4 != 17670) {
            this.method221(2);
        }
        class281.field3859[3] = arg0;
        class281.field3859[2] = arg1;
        ++field4722;
        class281.field3859[1] = arg3;
        OpenGL.glTexEnvfv(8960, 8705, class281.field3859, 0);
    }

    @OriginalMember(owner = "client!ef", name = "UA", descriptor = "(III)V", line = 2343)
    public final void method241(int arg0, int arg1, int arg2) {
        ++field4713;
        if (~this.field4833 != ~arg0 || this.field4844 != arg1 || this.field4884 != arg2) {
            this.field4833 = arg0;
            this.field4844 = arg1;
            this.field4884 = arg2;
            if (this.field4856) {
                return;
            }
            this.method1936((byte) 60);
            this.method1958(false);
        }
    }

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "(IIII)V", line = 2366)
    public final void method296(int arg0, int arg1, int arg2, int arg3) {
        this.field4816 = arg1;
        this.field4789 = arg3;
        this.field4791 = arg2;
        this.field4885 = arg0;
        ++field4613;
        this.method1955((byte) 101);
        this.method1986((byte) 74);
        if (~this.field4843 == -4) {
            this.method1935((byte) 97);
        } else if (~this.field4843 == -3) {
            this.method1989(-10);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZII)Z", line = 2389)
    public static final boolean method1972(boolean arg0, int arg1, int arg2) {
        ++field4652;
        if (!arg0) {
            return true;
        } else {
            return (2048 & arg1) != 0 && ~(55 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "ZA", descriptor = "()I", line = 2402)
    public final int method283() {
        ++field4669;
        int var1 = this.field4777;
        this.field4777 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lu;)V", line = 2418)
    public final void method290(class53 arg0) {
        this.field4742 = ((class102) arg0).field1542;
        ++field4628;
        if (this.field4794 == null) {
            class498 var2 = new class498(80);
            if (this.field4772) {
                var2.method2906((byte) 80, -1.0F);
                var2.method2906((byte) 80, -1.0F);
                var2.method2906((byte) 80, 0.0F);
                var2.method2906((byte) 80, 0.0F);
                var2.method2906((byte) 80, 1.0F);
                var2.method2906((byte) 80, 1.0F);
                var2.method2906((byte) 80, -1.0F);
                var2.method2906((byte) 80, 0.0F);
                var2.method2906((byte) 80, 1.0F);
                var2.method2906((byte) 80, 1.0F);
                var2.method2906((byte) 80, 1.0F);
                var2.method2906((byte) 80, 1.0F);
                var2.method2906((byte) 80, 0.0F);
                var2.method2906((byte) 80, 1.0F);
                var2.method2906((byte) 80, 0.0F);
                var2.method2906((byte) 80, -1.0F);
                var2.method2906((byte) 80, 1.0F);
                var2.method2906((byte) 80, 0.0F);
                var2.method2906((byte) 80, 0.0F);
                var2.method2906((byte) 80, 0.0F);
            } else {
                var2.method2909(1107866360, -1.0F);
                var2.method2909(1107866360, -1.0F);
                var2.method2909(1107866360, 0.0F);
                var2.method2909(1107866360, 0.0F);
                var2.method2909(1107866360, 1.0F);
                var2.method2909(1107866360, 1.0F);
                var2.method2909(1107866360, -1.0F);
                var2.method2909(1107866360, 0.0F);
                var2.method2909(1107866360, 1.0F);
                var2.method2909(1107866360, 1.0F);
                var2.method2909(1107866360, 1.0F);
                var2.method2909(1107866360, 1.0F);
                var2.method2909(1107866360, 0.0F);
                var2.method2909(1107866360, 1.0F);
                var2.method2909(1107866360, 0.0F);
                var2.method2909(1107866360, -1.0F);
                var2.method2909(1107866360, 1.0F);
                var2.method2909(1107866360, 0.0F);
                var2.method2909(1107866360, 0.0F);
                var2.method2909(1107866360, 0.0F);
            }
            this.field4794 = this.method1943(var2.field5719, 20, var2.field5678, (byte) 49, false);
            this.field4788 = new class48(this.field4794, 5126, 3, 0);
            this.field4780 = new class48(this.field4794, 5126, 2, 12);
            this.field4734.method8(this, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(IIII)V", line = 2486)
    public final void method1973(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
            ++field4697;
            OpenGL.glTexEnvi(8960, arg1 + 34200, arg3);
        }
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(II)V", line = 2498)
    public final void method1974(int arg0, int arg1) {
        if (arg0 == 1) {
            this.method1963(true, 7681, 7681);
        } else if (~arg0 != -1) {
            if (arg0 != 2) {
                if (arg0 != 3) {
                    if (~arg0 == -5) {
                        this.method1963(true, 34023, 34023);
                    }
                } else {
                    this.method1963(true, 260, 8448);
                }
            } else {
                this.method1963(true, 34165, 7681);
            }
        } else {
            this.method1963(true, 8448, 8448);
        }
        ++field4690;
        if (arg1 != 4609) {
            method1965(52, 99, -22, 5, false, -26);
        }
    }

    @OriginalMember(owner = "client!ef", name = "DA", descriptor = "(IIIIII[BII)V", line = 2530)
    public final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4567;
        float var10;
        float var11;
        if (this.field4817 != null && arg2 <= this.field4817.field3641 && arg3 <= this.field4817.field3645) {
            this.field4817.method1584(0, 0, arg3, 6406, arg2, 0, false, 0, arg6, 0);
            var10 = (float) arg2 * this.field4817.field6542 / (float) this.field4817.field3641;
            var11 = (float) arg3 * this.field4817.field6543 / (float) this.field4817.field3645;
        } else {
            this.field4817 = class55.method468(false, arg3, this, arg2, (byte) 38, arg6, 6406, 6406);
            this.field4817.method1579(-6746, false, false);
            var10 = this.field4817.field6542;
            var11 = this.field4817.field6543;
        }
        this.method1934(-3);
        this.method1996(2, this.field4817);
        this.method1976(-127, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1992(arg5, (byte) 125);
        this.method1963(true, 34165, 34165);
        this.method1975(34176, 34166, 768, 0);
        this.method1975(34176, 5890, 770, 2);
        this.method1973(34166, 0, 0, 770);
        this.method1973(5890, 2, 0, 770);
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
        this.method1975(34176, 5890, 768, 0);
        this.method1975(34176, 34166, 770, 2);
        this.method1973(5890, 0, 0, 770);
        this.method1973(34166, 2, 0, 770);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(IIII)V", line = 2587)
    public final void method1975(int arg0, int arg1, int arg2, int arg3) {
        ++field4634;
        OpenGL.glTexEnvi(8960, arg0 + arg3, arg1);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "(II)V", line = 2596)
    public final void method1976(int arg0, int arg1) {
        if (arg0 > -91) {
            this.method1957(101);
        }
        if (this.field4862 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (arg1 != 2) {
                if (~arg1 != -129) {
                    var5 = 0;
                    var4 = true;
                    var3 = false;
                } else {
                    var5 = 3;
                    var3 = true;
                    var4 = true;
                }
            } else {
                var4 = true;
                var3 = false;
                var5 = 2;
            }
            if (this.field4812 != var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field4812 = var4;
            }
            if (this.field4797 != var3) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field4797 = var3;
            }
            if (~this.field4835 != ~var5) {
                if (var5 != 1) {
                    if (~var5 == -3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var5 == 3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field4835 = var5;
            }
            this.field4802 &= -29;
            this.field4862 = arg1;
        }
        ++field4696;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2690)
    public final void method266(Canvas arg0) {
        this.field4724 = 0L;
        ++field4685;
        this.field4677 = null;
        if (arg0 != null && this.field4640 != arg0) {
            if (this.field4599.containsKey(arg0)) {
                Long var2 = (Long) this.field4599.get(arg0);
                this.field4724 = var2;
                this.field4677 = arg0;
            }
        } else {
            this.field4724 = this.field4637;
            this.field4677 = this.field4640;
        }
        if (this.field4677 != null && this.field4724 != 0L) {
            this.field4700.setSurface(this.field4724);
            this.method1977(71);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ef", name = "IA", descriptor = "()I", line = 2719)
    public final int method313() {
        ++field4648;
        return this.field4759 + this.field4757 + this.field4760;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lmh;Lmh;FLmh;)Lmh;", line = 2727)
    public final class444 method277(class444 arg0, class444 arg1, float arg2, class444 arg3) {
        ++field4550;
        if (arg0 != null && arg1 != null && this.field4854 && this.field4798 && this.field4775) {
            class527 var5 = null;
            class274 var6 = (class274) arg0;
            class274 var7 = (class274) arg1;
            class39 var8 = var6.method1628(83);
            class39 var9 = var7.method1628(91);
            if (var8 != null && var9 != null) {
                int var10 = var9.field490 < var8.field490 ? var8.field490 : var9.field490;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class527) {
                    class527 var11 = (class527) arg3;
                    if (var10 == var11.method3131((byte) -93)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class527(this, var10);
                }
                if (var5.method3132(var8, -79, var9, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lt;Lc;[Lii;I)V", line = 2773)
    public final void method226(class471[] arg0, class122 arg1, class387[] arg2, int arg3) {
        ++field4712;
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method397(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "(I)V", line = 2791)
    private final void method1977(int arg0) {
        if (this.field4677 != null) {
            Dimension var2 = this.field4677.getSize();
            this.field4653 = var2.width;
            this.field4665 = var2.height;
        } else {
            this.field4653 = this.field4665 = 0;
        }
        ++field4614;
        if (this.field4751 == null) {
            this.field4548 = this.field4665;
            this.field4549 = this.field4653;
            this.method1929(true);
        }
        this.method1964(123);
        if (arg0 > 36) {
            this.method260();
        }
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(B)V", line = 2820)
    private final void method1978(byte arg0) {
        ++field4694;
        if (~this.field4843 != -3) {
            this.field4843 = 2;
            this.method1989(-5);
            this.method1999(arg0 ^ 12);
            this.field4802 &= -8;
        }
        if (arg0 != 13) {
            this.field4813 = 0.9927666F;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V", line = 2840)
    public final synchronized void method1979(int arg0, int arg1, int arg2) {
        ++field4693;
        class500 var4 = new class500(arg1);
        var4.field3615 = (long) arg2;
        if (arg0 < -56) {
            this.field4761.method2809(var4, 2);
        }
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(B)V", line = 2861)
    public final void method1980(byte arg0) {
        ++field4716;
        if (this.field4802 != 4) {
            this.method2004(122);
            this.method1932(false, -32);
            this.method1937(false, -128);
            this.method1938(34160, false);
            this.method1985(false, (byte) -84);
            this.method1944(-2, 12429);
            this.method1976(-121, 1);
            this.method1974(0, 4609);
            this.field4802 = 4;
        }
        int var2 = 8 / ((arg0 - 15) / 61);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BIIILrt;)V", line = 2885)
    public final void method1981(byte arg0, int arg1, int arg2, int arg3, class151 arg4) {
        ++field4629;
        int var6 = arg4.method1014(true);
        int var7 = arg2 * this.method1946(1, var6);
        this.method1982(34963, arg4);
        OpenGL.glDrawElements(arg3, arg1, var6, (long) var7 + arg4.method1015(-6936));
        int var8 = 13 % ((arg0 - -44) / 39);
    }

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "()V", line = 2901)
    public final void method329() {
        this.field4738.method472(1);
        ++field4672;
    }

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "()Z", line = 2912)
    public final boolean method276() {
        ++field4642;
        return this.field4733.method2692(true, 3);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFF)V", line = 2922)
    public final void method254(float arg0, float arg1, float arg2) {
        class242.field3389 = arg0;
        class28.field366 = arg2;
        ++field4582;
        class356.field5200 = arg1;
    }

    @OriginalMember(owner = "client!ef", name = "fa", descriptor = "(IIII)V", line = 2934)
    public final void method250(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < this.field4841) {
            this.field4841 = arg2;
        }
        if (~this.field4790 > ~arg0) {
            this.field4790 = arg0;
        }
        if (arg1 > this.field4810) {
            this.field4810 = arg1;
        }
        ++field4575;
        if (arg3 < this.field4815) {
            this.field4815 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method1986((byte) 66);
        this.method1990(82);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILrt;)V", line = 2961)
    public final void method1982(int arg0, class151 arg1) {
        if (arg0 == 34963) {
            if (this.field4774 != arg1) {
                if (this.field4785) {
                    OpenGL.glBindBufferARB(34963, arg1.method1013(false));
                }
                this.field4774 = arg1;
            }
            ++field4717;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lnf;I)V", line = 2982)
    public final void method1983(class406 arg0, int arg1) {
        ++field4663;
        if (~this.field4753 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field4753 >= 0) {
                this.field4750[this.field4753].method1632(1393);
            }
            this.field4751 = this.field4750[++this.field4753] = arg0;
            this.field4751.method1638((byte) -30);
            if (arg1 >= -57) {
                this.method1969(14);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V", line = 3001)
    public final void method1984(int arg0, int arg1, int arg2) {
        this.field4857 = arg2;
        if (arg1 <= 43) {
            this.method1932(false, -66);
        }
        this.field4829 = arg0;
        ++field4595;
        this.method1929(true);
        this.method1990(125);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 3015)
    public final void method248(int arg0) {
        ++field4608;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "(F)V", line = 3026)
    public final void method252(float arg0) {
        if (this.field4825 != arg0) {
            this.field4825 = arg0;
            this.method1967(0);
        }
        ++field4620;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V", line = 3042)
    public final void method1985(boolean arg0, byte arg1) {
        if (this.field4858 != arg0) {
            this.field4858 = arg0;
            this.method2006(2);
            this.field4802 &= -32;
        }
        ++field4664;
        int var3 = 4 / ((-25 - arg1) / 59);
    }

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "(B)V", line = 3059)
    private final void method1986(byte arg0) {
        this.field4796 = (float) (-this.field4816 + this.field4810);
        this.field4808 = (float) (-this.field4816 + this.field4815);
        int var2 = 94 / ((-59 - arg0) / 57);
        this.field4770 = (float) (-this.field4885 + this.field4841);
        this.field4837 = (float) (-this.field4885 + this.field4790);
        ++field4668;
    }

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "(II)V", line = 3072)
    public final synchronized void method1987(int arg0, int arg1) {
        ++field4560;
        class500 var3 = new class500(arg1);
        this.field4763.method2809(var3, 2);
        int var4 = -83 % ((-3 - arg0) / 37);
    }

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "(I)V", line = 3084)
    public final void method1988(int arg0) {
        if (arg0 == -1) {
            if (this.field4802 != 8) {
                this.method1978((byte) 13);
                this.method1932(true, arg0 ^ 31);
                this.method1938(34160, true);
                this.method1985(true, (byte) 39);
                this.method1976(-118, 1);
                this.method1974(0, 4609);
                this.field4802 = 8;
            }
            ++field4691;
        }
    }

    @OriginalMember(owner = "client!ef", name = "NA", descriptor = "(IIIII)V", line = 3105)
    public final void method300(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4708;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()Z", line = 3116)
    public final boolean method223() {
        ++field4674;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "xa", descriptor = "()F", line = 3124)
    public final float method271() {
        ++field4573;
        return this.field4805;
    }

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "()V", line = 3134)
    public final void method322() {
        this.method1985(true, (byte) 53);
        ++field4609;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "()V", line = 3148)
    public final void method240() {
        for (class260 var1 = this.field4746.method2818((byte) 127); var1 != null; var1 = this.field4746.method2820((byte) -58)) {
            ((class102) var1).method762(0);
        }
        ++field4562;
        if (this.field4738 != null) {
            this.field4738.method477(-73);
        }
        if (this.field4700 != null) {
            this.method1969(-8897);
            Enumeration var2 = this.field4599.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4599.get(var3);
                this.field4700.releaseSurface(var3, var4);
            }
            this.field4700.release();
            this.field4700 = null;
        }
        if (this.field4745) {
            class51.method446(false, false, true);
            this.field4745 = false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "(I)V", line = 3192)
    private final void method1989(int arg0) {
        ++field4683;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field4871, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 > -4) {
            this.method2008((byte) 18, -23L);
        }
    }

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "(I)V", line = 3206)
    private final void method1990(int arg0) {
        if (this.field4841 >= this.field4790 && this.field4815 >= this.field4810) {
            OpenGL.glScissor(this.field4829 + this.field4790, -this.field4815 + this.field4857 + this.field4548, -this.field4790 + this.field4841, -this.field4810 + this.field4815);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 > 72) {
            ++field4577;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(FIFF)V", line = 3222)
    private final void method1991(float arg0, int arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field4641;
        if (this.field4787) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg0, arg3);
        OpenGL.glMatrixMode(5888);
        if (arg1 != 31330) {
            this.field4879 = true;
        }
        this.field4787 = true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V", line = 3240)
    public final void method1992(int arg0, byte arg1) {
        ++field4546;
        class281.field3859[2] = (float) class251.method1501(255, arg0) / 255.0F;
        if (arg1 >= 118) {
            class281.field3859[1] = (float) class251.method1501(arg0, 65280) / 65280.0F;
            class281.field3859[3] = (float) (arg0 >>> 24) / 255.0F;
            class281.field3859[0] = (float) class251.method1501(arg0, 16711680) / 1.671168E7F;
            OpenGL.glTexEnvfv(8960, 8705, class281.field3859, 0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[Ljd;)V", line = 3256)
    public final void method255(int arg0, class153[] arg1) {
        ++field4676;
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field4877[var3] = arg1[var3];
        }
        this.field4872 = arg0;
        if (this.field4843 != 1) {
            this.method1931((byte) -41);
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 3277)
    public final void method302(Canvas arg0) {
        ++field4630;
        if (this.field4640 == arg0) {
            throw new RuntimeException();
        } else if (this.field4599.containsKey(arg0)) {
            Long var2 = (Long) this.field4599.get(arg0);
            this.field4700.releaseSurface(arg0, var2);
            this.field4599.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "()V", line = 3296)
    public final void method262() {
        ++field4556;
        if (this.field4886 && this.field4549 > 0 && ~this.field4548 < -1) {
            int var1 = this.field4790;
            int var2 = this.field4841;
            int var3 = this.field4810;
            int var4 = this.field4815;
            this.method260();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1964(106);
            this.method1932(false, -32);
            this.method1937(false, -123);
            this.method1938(34160, false);
            this.method1985(false, (byte) 87);
            this.method1996(2, (class40) null);
            this.method1944(-2, 12429);
            this.method1974(1, 4609);
            this.method1976(-106, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4549, this.field4548, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method279(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "()Z", line = 3343)
    public final boolean method308() {
        ++field4718;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(III)V", line = 3351)
    public final synchronized void method1993(int arg0, int arg1, int arg2) {
        ++field4647;
        class500 var4 = new class500(arg0);
        var4.field3615 = (long) arg1;
        if (arg2 == 32616) {
            this.field4764.method2809(var4, arg2 ^ 32618);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILnf;)V", line = 3368)
    public final void method1994(int arg0, class406 arg1) {
        ++field4576;
        if (~this.field4754 <= -1 && this.field4756[this.field4754] == arg1) {
            this.field4756[this.field4754--] = null;
            arg1.method1633(95);
            if (this.field4754 < 0) {
                this.field4752 = null;
            } else {
                this.field4752 = this.field4756[this.field4754];
                this.field4752.method1645((byte) -127);
            }
            if (arg0 != 5890) {
                this.field4827 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "(IFFFFF)V", line = 3394)
    public final void method232(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4540;
        boolean var7 = this.field4781 != arg0;
        if (var7 || this.field4784 != arg1 || this.field4846 != arg2) {
            this.field4781 = arg0;
            this.field4784 = arg1;
            this.field4846 = arg2;
            if (var7) {
                this.field4847 = (float) (65280 & this.field4781) / 65280.0F;
                this.field4866 = (float) (this.field4781 & 16711680) / 1.671168E7F;
                this.field4822 = (float) (this.field4781 & 255) / 255.0F;
                this.method1967(0);
            }
            this.method2011(false);
        }
        if (this.field4783[0] != arg3 || this.field4783[1] != arg4 || this.field4783[2] != arg5) {
            this.field4783[0] = arg3;
            this.field4783[2] = arg5;
            this.field4783[1] = arg4;
            this.field4799[0] = -arg3;
            this.field4799[1] = -arg4;
            this.field4799[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4769[1] = arg4 * var8;
            this.field4769[2] = arg5 * var8;
            this.field4769[0] = arg3 * var8;
            this.field4811[0] = -this.field4769[0];
            this.field4811[1] = -this.field4769[1];
            this.field4811[2] = -this.field4769[2];
            this.method1927(-31484);
            this.field4836 = (int) (arg3 * 256.0F / arg4);
            this.field4887 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V", line = 3447)
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
        ++field4725;
        this.field4738.method475(arg0, arg1, arg2, (byte) 127, arg3);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIZ)Ll;", line = 3459)
    public final class16 method275(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4627;
        return new class493(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "(B)V", line = 3467)
    public final void method1995(byte arg0) {
        ++field4621;
        if (this.field4802 != 16) {
            this.method1926((byte) 95);
            this.method1932(true, -32);
            this.method1938(34160, true);
            this.method1985(true, (byte) 73);
            this.method1976(-126, 1);
            this.method1974(0, 4609);
            this.field4802 = 16;
        }
        if (arg0 < 20) {
            this.field4798 = true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "JA", descriptor = "(IIIIII)Z", line = 3489)
    public final boolean method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4673;
        float var7 = (float) arg2 * this.field4818.field3317 + (float) arg0 * this.field4818.field3314 + (float) arg1 * this.field4818.field3329 + this.field4818.field3312;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4818.field3317 + (float) arg3 * this.field4818.field3314 + (float) arg4 * this.field4818.field3329 + this.field4818.field3312;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4828) || !(var8 < (float) this.field4828)) && (!((float) this.field4768 < var7) || !(var8 > (float) this.field4768))) {
            int var9 = (int) (((float) arg2 * this.field4818.field3326 + (float) arg0 * this.field4818.field3309 + (float) arg1 * this.field4818.field3296 + this.field4818.field3313) * (float) this.field4791 / var7);
            int var10 = (int) (((float) arg5 * this.field4818.field3326 + (float) arg3 * this.field4818.field3309 + (float) arg4 * this.field4818.field3296 + this.field4818.field3313) * (float) this.field4791 / var8);
            if (this.field4837 > (float) var9 && this.field4837 > (float) var10 || (float) var9 > this.field4770 && (float) var10 > this.field4770) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4818.field3323 + (float) arg0 * this.field4818.field3297 + (float) arg1 * this.field4818.field3319 + this.field4818.field3328) * (float) this.field4789 / var7);
                int var12 = (int) (((float) arg5 * this.field4818.field3323 + (float) arg3 * this.field4818.field3297 + (float) arg4 * this.field4818.field3319 + this.field4818.field3328) * (float) this.field4789 / var8);
                return (!((float) var11 < this.field4796) || !(this.field4796 > (float) var12)) && (!(this.field4808 < (float) var11) || !((float) var12 > this.field4808));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "()Lc;", line = 3528)
    public final class122 method310() {
        ++field4584;
        return new class234();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILmk;)V", line = 3536)
    public final void method1996(int arg0, class40 arg1) {
        if (arg0 != 2) {
            this.method1943(-120, 113, (byte[]) null, (byte) -102, true);
        }
        ++field4551;
        class40 var3 = this.field4845[this.field4860];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field505);
                } else if (~arg1.field505 != ~var3.field505) {
                    OpenGL.glDisable(var3.field505);
                    OpenGL.glEnable(arg1.field505);
                }
                OpenGL.glBindTexture(arg1.field505, arg1.method340(1));
            } else {
                OpenGL.glDisable(var3.field505);
            }
            this.field4845[this.field4860] = arg1;
        }
        this.field4802 &= -2;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(ZII)V", line = 3574)
    public final void method1997(boolean arg0, int arg1, int arg2) {
        ++field4569;
        if (arg2 != 0) {
            this.field4876 = 0.09575616F;
        }
        this.method2002(true, (byte) -127, arg0, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lpn;)V", line = 3587)
    public final void method316(class523 arg0) {
        this.field4734.method13(this, -1601, arg0);
        ++field4732;
    }

    @OriginalMember(owner = "client!ef", name = "AA", descriptor = "(IIII)V", line = 3597)
    public final void method327(int arg0, int arg1, int arg2, int arg3) {
        this.field4820 = arg2;
        this.field4882 = arg0;
        this.field4856 = true;
        this.field4809 = arg1;
        ++field4554;
        this.field4786 = arg3;
        this.field4733.method2691(-1, false, false, 3);
        this.field4733.field6741.method2221(Integer.MAX_VALUE);
        this.method1936((byte) 60);
        this.method1958(false);
    }

    @OriginalMember(owner = "client!ef", name = "ia", descriptor = "(II)V", line = 3620)
    public final void method311(int arg0, int arg1) {
        if (this.field4828 != arg0 || this.field4768 != arg1) {
            this.field4768 = arg1;
            this.field4828 = arg0;
            this.method1955((byte) -18);
            this.method1936((byte) 60);
            if (~this.field4843 != -4) {
                if (this.field4843 == 2) {
                    this.method1989(-5);
                }
            } else {
                this.method1935((byte) 38);
            }
        }
        ++field4622;
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "()I", line = 3646)
    public final int method263() {
        ++field4561;
        return 4;
    }

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "(B)V", line = 3654)
    private final void method1998(byte arg0) {
        if (arg0 != 81) {
            this.field4809 = 64;
        }
        ++field4553;
        int var2 = 0;
        while (!this.field4700.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class157.method1046(-128, 1000L);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIF)Ljd;", line = 3677)
    public final class153 method323(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4593;
        return new class449(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "(I)V", line = 3685)
    private final void method1999(int arg0) {
        OpenGL.glLoadIdentity();
        ++field4597;
        OpenGL.glRotatef(180.0F, (float) arg0, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field4818.method1440((byte) -126), 0);
        if (this.field4856) {
            this.field4733.field6741.method2221(arg0 ^ 2147483646);
        }
        this.method1927(arg0 ^ -31483);
        this.method1931((byte) -41);
    }

    @OriginalMember(owner = "client!ef", name = "ea", descriptor = "(Lc;)V", line = 3700)
    public final void method299(class122 arg0) {
        this.field4818 = (class234) arg0;
        ++field4736;
        this.field4819.method1443(1, this.field4818);
        if (~this.field4843 != -2) {
            this.method1999(1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "(I)V", line = 3719)
    public static void method2000(int arg0) {
        if (arg0 != 1) {
            method2000(-21);
        }
        field4704 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V", line = 3730)
    public final void method235(boolean arg0) {
        ++field4632;
        this.field4861 = arg0;
        this.method2006(2);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I", line = 3742)
    public final int method257(int arg0, int arg1) {
        ++field4670;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(ILnf;)V", line = 3753)
    public final void method2001(int arg0, class406 arg1) {
        ++field4580;
        if (~this.field4754 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field4754 <= -1) {
                this.field4756[this.field4754].method1633(-112);
            }
            this.field4752 = this.field4756[++this.field4754] = arg1;
            int var3 = 98 % ((arg0 - 82) / 32);
            this.field4752.method1645((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZBZI)V", line = 3771)
    public final void method2002(boolean arg0, byte arg1, boolean arg2, int arg3) {
        ++field4626;
        if (this.field4855 != arg3) {
            if (arg3 < 0) {
                this.method1942((byte) 91);
                this.method1996(2, (class40) null);
                this.method1974(0, 4609);
                if (!this.field4856) {
                    this.field4733.method2691(-1, arg2, arg0, 0);
                }
            } else {
                class264 var5 = this.field4729.method2112(-3594, arg3);
                class166 var6 = super.field471.method1654(20, arg3);
                if (var6.field2488 == 0 && var6.field2495 == 0) {
                    this.method1942((byte) 8);
                } else {
                    int var7 = !var6.field2480 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method1991((float) (this.field4743 % var8 * var6.field2495) / (float) var8, 31330, (float) (this.field4743 % var8 * var6.field2488) / (float) var8, 0.0F);
                }
                if (this.field4856) {
                    this.field4733.method2691(-1, arg2, arg0, 3);
                    this.method1996(2, var5);
                    this.method1974(var6.field2500, 4609);
                } else {
                    this.field4733.method2691(-1, arg2, arg0, var6.field2492);
                    this.field4733.method2696(var6.field2491, 2, var6.field2490);
                    if (!this.field4733.method2694(false, var5, var6.field2500)) {
                        this.method1996(2, var5);
                        this.method1974(var6.field2500, 4609);
                    }
                }
            }
            this.field4855 = arg3;
        }
        if (arg1 > -124) {
            this.field4857 = -20;
        }
        this.field4802 &= -8;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(Z)V", line = 3835)
    private final void method2003(boolean arg0) {
        if (!arg0) {
            this.method285(-90, -104, 89, 14, -103, -26);
        }
        if (this.field4868 && !this.field4814) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field4658;
    }

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "(I)V", line = 3850)
    private final void method2004(int arg0) {
        ++field4571;
        if (arg0 < 83) {
            this.field4859 = null;
        }
        if (this.field4843 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field4549 > 0 && this.field4548 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field4549, (double) this.field4548, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4843 = 1;
            this.field4802 &= -25;
        }
    }

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "(I)I", line = 3876)
    private final int method2005(int arg0) {
        ++field4688;
        int var2 = 0;
        this.field4834 = OpenGL.glGetString(7936).toLowerCase();
        this.field4804 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field4834.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field4834.indexOf("brian paul") != -1 || this.field4834.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class38.method284(' ', var3.replace('.', ' '), false);
        if (~var4.length <= -3) {
            try {
                int var5 = class104.method765(var4[0], arg0 ^ 128);
                int var6 = class104.method765(var4[1], arg0 + 128);
                this.field4875 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field4875 < 12) {
            var2 |= 2;
        }
        if (!this.field4700.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4700.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4839 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, arg0);
        this.field4867 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field4851 = var7[0];
        if (this.field4839 < 2 || this.field4867 < 2 || ~this.field4851 > -3) {
            var2 |= 16;
        }
        this.field4772 = NativeStream.method2594();
        this.field4700.arePbuffersAvailable();
        this.field4785 = this.field4700.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4832 = this.field4700.isExtensionAvailable("GL_ARB_multisample");
        this.field4821 = this.field4700.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4700.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4865 = this.field4700.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4773 = this.field4700.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4879 = this.field4700.isExtensionAvailable("GL_EXT_texture3D");
        this.field4842 = this.field4700.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4854 = this.field4700.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4779 = this.field4700.isExtensionAvailable("GL_ARB_texture_float");
        this.field4864 = false;
        this.field4798 = this.field4700.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field4775 = this.field4700.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field4830 = this.field4700.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field4824 = this.field4830 & this.field4775;
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!ef", name = "ca", descriptor = "(ILma;II)V", line = 3960)
    public final void method291(int arg0, class10 arg1, int arg2, int arg3) {
        ++field4680;
        class320 var5 = (class320) arg1;
        class442 var6 = var5.field4374;
        this.method1934(-3);
        this.method1996(2, var5.field4374);
        this.method1976(-104, 1);
        this.method1963(true, 7681, 8448);
        this.method1975(34176, 34167, 768, 0);
        float var7 = var6.field6542 / (float) var6.field6539;
        float var8 = var6.field6543 / (float) var6.field6545;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4790) * var7, (float) (-arg3 + this.field4810) * var8);
        OpenGL.glVertex2i(this.field4790, this.field4810);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4790) * var7, (float) (-arg3 + this.field4815) * var8);
        OpenGL.glVertex2i(this.field4790, this.field4815);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4841) * var7, (float) (-arg3 + this.field4815) * var8);
        OpenGL.glVertex2i(this.field4841, this.field4815);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4841) * var7, (float) (this.field4810 - arg3) * var8);
        OpenGL.glVertex2i(this.field4841, this.field4810);
        OpenGL.glEnd();
        this.method1975(34176, 5890, 768, 0);
    }

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "(I)V", line = 3995)
    private final void method2006(int arg0) {
        if (arg0 != 2) {
            this.method294();
        }
        OpenGL.glDepthMask(this.field4858 && this.field4861);
        ++field4591;
    }

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "(I)V", line = 4011)
    private final void method2007(int arg0) {
        ++field4720;
        this.method1944(-2, 12429);
        for (int var2 = this.field4839 + -1; ~var2 <= -1; --var2) {
            this.method1950(-29847, var2);
            this.method1996(2, (class40) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1963(true, 8448, 8448);
        this.method1975(34176, 34168, 770, 2);
        this.method1942((byte) 53);
        this.field4862 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4835 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4797 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4812 = true;
        this.method1932(true, -32);
        this.method1937(true, -90);
        this.method1938(34160, true);
        this.method1985(true, (byte) -103);
        this.method1964(108);
        if (arg0 == 8704) {
            this.field4700.setSwapInterval(0);
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
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field4781 = this.field4833 = -1;
            this.method260();
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V", line = 4084)
    public final void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4547;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method1945(768);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method1976(-126, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4832) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4832) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BJ)V", line = 4116)
    public final synchronized void method2008(byte arg0, long arg1) {
        ++field4552;
        class260 var4 = new class260();
        if (arg0 != -74) {
            this.field4599 = null;
        }
        var4.field3615 = arg1;
        this.field4766.method2809(var4, arg0 ^ -76);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lu;", line = 4131)
    public final class53 method274(int arg0) {
        ++field4633;
        class102 var2 = new class102(arg0);
        this.field4746.method2809(var2, 2);
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lnf;I)V", line = 4142)
    public final void method2009(class406 arg0, int arg1) {
        ++field4564;
        if (arg1 == 0) {
            if (!this.field4775) {
                if (this.field4755 >= 0 && this.field4749[this.field4755] == arg0) {
                    this.field4749[this.field4755--] = null;
                    arg0.method1646(true);
                    if (this.field4755 >= 0) {
                        this.field4752 = this.field4751 = this.field4749[this.field4755];
                        this.field4752.method1641(24617);
                    } else {
                        this.field4752 = this.field4751 = null;
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.method1994(arg1 + 5890, arg0);
                this.method1952(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()I", line = 4176)
    public final int method224() {
        ++field4612;
        return this.field4828;
    }

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "()Z", line = 4185)
    public final boolean method278() {
        ++field4625;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILtc;)V", line = 4196)
    public final void method2010(int arg0, class234 arg1) {
        ++field4662;
        if (arg0 < 18) {
            this.field4797 = false;
        }
        OpenGL.glLoadMatrixf(arg1.method1440((byte) -126), 0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lkq;IIII)Lt;", line = 4208)
    public final class471 method231(class419 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4611;
        return new class348(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(Z)V", line = 4227)
    private final void method2011(boolean arg0) {
        class281.field3859[0] = this.field4866 * this.field4784;
        class281.field3859[3] = 1.0F;
        if (arg0) {
            this.field4761 = null;
        }
        class281.field3859[2] = this.field4822 * this.field4784;
        ++field4631;
        class281.field3859[1] = this.field4847 * this.field4784;
        OpenGL.glLightfv(16384, 4609, class281.field3859, 0);
        class281.field3859[3] = 1.0F;
        class281.field3859[0] = -this.field4846 * this.field4866;
        class281.field3859[2] = -this.field4846 * this.field4822;
        class281.field3859[1] = -this.field4846 * this.field4847;
        OpenGL.glLightfv(16385, 4609, class281.field3859, 0);
    }
}
