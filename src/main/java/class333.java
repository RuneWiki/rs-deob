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

@OriginalClass("client!pg")
public class class333 extends class295 {

    @OriginalMember(owner = "client!pg", name = "wc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4632 = new Hashtable();

    @OriginalMember(owner = "client!pg", name = "de", descriptor = "I")
    public int field4717 = 128;

    @OriginalMember(owner = "client!pg", name = "he", descriptor = "Lfj;")
    private class499 field4721 = new class499();

    @OriginalMember(owner = "client!pg", name = "ie", descriptor = "Lsh;")
    private class511 field4722 = new class511();

    @OriginalMember(owner = "client!pg", name = "je", descriptor = "Lsh;")
    public class511 field4723 = new class511();

    @OriginalMember(owner = "client!pg", name = "oe", descriptor = "I")
    public int field4728 = 3;

    @OriginalMember(owner = "client!pg", name = "le", descriptor = "Z")
    private boolean field4725 = false;

    @OriginalMember(owner = "client!pg", name = "pe", descriptor = "I")
    public int field4729 = 8;

    @OriginalMember(owner = "client!pg", name = "ne", descriptor = "Lmg;")
    private class530 field4727 = new class530();

    @OriginalMember(owner = "client!pg", name = "ue", descriptor = "[Lli;")
    private class386[] field4734 = new class386[4];

    @OriginalMember(owner = "client!pg", name = "re", descriptor = "[Lli;")
    private class386[] field4731 = new class386[4];

    @OriginalMember(owner = "client!pg", name = "ve", descriptor = "I")
    private int field4735 = -1;

    @OriginalMember(owner = "client!pg", name = "te", descriptor = "I")
    private int field4733 = -1;

    @OriginalMember(owner = "client!pg", name = "ye", descriptor = "[Lli;")
    private class386[] field4738 = new class386[4];

    @OriginalMember(owner = "client!pg", name = "xe", descriptor = "I")
    private int field4737 = -1;

    @OriginalMember(owner = "client!pg", name = "Be", descriptor = "Lmg;")
    private class530 field4741;

    @OriginalMember(owner = "client!pg", name = "De", descriptor = "Lmg;")
    private class530 field4743;

    @OriginalMember(owner = "client!pg", name = "Ee", descriptor = "Lmg;")
    private class530 field4744;

    @OriginalMember(owner = "client!pg", name = "Fe", descriptor = "Lmg;")
    private class530 field4745;

    @OriginalMember(owner = "client!pg", name = "Ge", descriptor = "Lmg;")
    private class530 field4746;

    @OriginalMember(owner = "client!pg", name = "He", descriptor = "Lmg;")
    private class530 field4747;

    @OriginalMember(owner = "client!pg", name = "Ie", descriptor = "Lmg;")
    private class530 field4748;

    @OriginalMember(owner = "client!pg", name = "of", descriptor = "[Lsa;")
    private class447[] field4779;

    @OriginalMember(owner = "client!pg", name = "Se", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!pg", name = "Ye", descriptor = "F")
    public float field4764;

    @OriginalMember(owner = "client!pg", name = "Ne", descriptor = "I")
    private int field4753;

    @OriginalMember(owner = "client!pg", name = "uf", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!pg", name = "Lf", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!pg", name = "jf", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!pg", name = "zf", descriptor = "I")
    public int field4790;

    @OriginalMember(owner = "client!pg", name = "Vf", descriptor = "I")
    private int field4812;

    @OriginalMember(owner = "client!pg", name = "Xe", descriptor = "F")
    public float field4763;

    @OriginalMember(owner = "client!pg", name = "Hf", descriptor = "I")
    private int field4798;

    @OriginalMember(owner = "client!pg", name = "og", descriptor = "I")
    private int field4831;

    @OriginalMember(owner = "client!pg", name = "Qf", descriptor = "[F")
    private float[] field4807;

    @OriginalMember(owner = "client!pg", name = "kg", descriptor = "F")
    private float field4827;

    @OriginalMember(owner = "client!pg", name = "qg", descriptor = "F")
    private float field4833;

    @OriginalMember(owner = "client!pg", name = "ef", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!pg", name = "Pe", descriptor = "Z")
    private boolean field4755;

    @OriginalMember(owner = "client!pg", name = "vg", descriptor = "I")
    private int field4838;

    @OriginalMember(owner = "client!pg", name = "wg", descriptor = "F")
    public float field4839;

    @OriginalMember(owner = "client!pg", name = "eg", descriptor = "I")
    private int field4821;

    @OriginalMember(owner = "client!pg", name = "wf", descriptor = "F")
    public float field4787;

    @OriginalMember(owner = "client!pg", name = "ug", descriptor = "I")
    private int field4837;

    @OriginalMember(owner = "client!pg", name = "Ef", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!pg", name = "sg", descriptor = "I")
    public int field4835;

    @OriginalMember(owner = "client!pg", name = "Je", descriptor = "[F")
    private float[] field4749;

    @OriginalMember(owner = "client!pg", name = "bf", descriptor = "I")
    public int field4767;

    @OriginalMember(owner = "client!pg", name = "Bg", descriptor = "F")
    public float field4844;

    @OriginalMember(owner = "client!pg", name = "Kg", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!pg", name = "Jg", descriptor = "[F")
    private float[] field4852;

    @OriginalMember(owner = "client!pg", name = "Xf", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!pg", name = "Ug", descriptor = "[F")
    private float[] field4863;

    @OriginalMember(owner = "client!pg", name = "dg", descriptor = "F")
    private float field4820;

    @OriginalMember(owner = "client!pg", name = "Ue", descriptor = "I")
    private int field4760;

    @OriginalMember(owner = "client!pg", name = "Qg", descriptor = "F")
    public float field4859;

    @OriginalMember(owner = "client!pg", name = "Cg", descriptor = "F")
    public float field4845;

    @OriginalMember(owner = "client!pg", name = "Ng", descriptor = "F")
    public float field4856;

    @OriginalMember(owner = "client!pg", name = "fg", descriptor = "I")
    public int field4822;

    @OriginalMember(owner = "client!pg", name = "cf", descriptor = "[F")
    public float[] field4768;

    @OriginalMember(owner = "client!pg", name = "Pg", descriptor = "I")
    public int field4858;

    @OriginalMember(owner = "client!pg", name = "yf", descriptor = "Ldv;")
    public class504 field4789;

    @OriginalMember(owner = "client!pg", name = "Yg", descriptor = "[I")
    public int[] field4867;

    @OriginalMember(owner = "client!pg", name = "bh", descriptor = "[I")
    public int[] field4870;

    @OriginalMember(owner = "client!pg", name = "dh", descriptor = "[I")
    public int[] field4872;

    @OriginalMember(owner = "client!pg", name = "ah", descriptor = "[B")
    public byte[] field4869;

    @OriginalMember(owner = "client!pg", name = "fe", descriptor = "I")
    public int field4719;

    @OriginalMember(owner = "client!pg", name = "pc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4625;

    @OriginalMember(owner = "client!pg", name = "xb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4581;

    @OriginalMember(owner = "client!pg", name = "Vc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4657;

    @OriginalMember(owner = "client!pg", name = "xd", descriptor = "J")
    private long field4685;

    @OriginalMember(owner = "client!pg", name = "Cc", descriptor = "J")
    private long field4638;

    @OriginalMember(owner = "client!pg", name = "Ff", descriptor = "Z")
    public boolean field4796;

    @OriginalMember(owner = "client!pg", name = "ig", descriptor = "I")
    public int field4825;

    @OriginalMember(owner = "client!pg", name = "Re", descriptor = "Ljava/lang/String;")
    private String field4757;

    @OriginalMember(owner = "client!pg", name = "Ze", descriptor = "Z")
    public boolean field4765;

    @OriginalMember(owner = "client!pg", name = "If", descriptor = "Z")
    public boolean field4799;

    @OriginalMember(owner = "client!pg", name = "Nf", descriptor = "Z")
    private boolean field4804;

    @OriginalMember(owner = "client!pg", name = "Mf", descriptor = "Z")
    public boolean field4803;

    @OriginalMember(owner = "client!pg", name = "af", descriptor = "Z")
    private boolean field4766;

    @OriginalMember(owner = "client!pg", name = "sf", descriptor = "Z")
    public boolean field4783;

    @OriginalMember(owner = "client!pg", name = "Xg", descriptor = "Ljava/lang/String;")
    private String field4866;

    @OriginalMember(owner = "client!pg", name = "hf", descriptor = "Z")
    public boolean field4773;

    @OriginalMember(owner = "client!pg", name = "zg", descriptor = "Z")
    private boolean field4842;

    @OriginalMember(owner = "client!pg", name = "be", descriptor = "Lhl;")
    public class233 field4715;

    @OriginalMember(owner = "client!pg", name = "me", descriptor = "Lwe;")
    public class143 field4726;

    @OriginalMember(owner = "client!pg", name = "ge", descriptor = "Lng;")
    private class164 field4720;

    @OriginalMember(owner = "client!pg", name = "ee", descriptor = "Lcq;")
    private class81 field4718;

    @OriginalMember(owner = "client!pg", name = "ce", descriptor = "Lej;")
    private class358 field4716;

    @OriginalMember(owner = "client!pg", name = "Nc", descriptor = "[I")
    public static int[] field4649;

    @OriginalMember(owner = "client!pg", name = "Ke", descriptor = "F")
    public float field4750;

    @OriginalMember(owner = "client!pg", name = "nf", descriptor = "F")
    public float field4778;

    @OriginalMember(owner = "client!pg", name = "pf", descriptor = "F")
    public float field4780;

    @OriginalMember(owner = "client!pg", name = "qf", descriptor = "F")
    private float field4781;

    @OriginalMember(owner = "client!pg", name = "Cf", descriptor = "F")
    private float field4793;

    @OriginalMember(owner = "client!pg", name = "Pf", descriptor = "F")
    private float field4806;

    @OriginalMember(owner = "client!pg", name = "Uf", descriptor = "F")
    public float field4811;

    @OriginalMember(owner = "client!pg", name = "ng", descriptor = "F")
    public float field4830;

    @OriginalMember(owner = "client!pg", name = "yg", descriptor = "F")
    public float field4841;

    @OriginalMember(owner = "client!pg", name = "Eg", descriptor = "F")
    public float field4847;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!pg", name = "jb", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!pg", name = "kb", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!pg", name = "lb", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!pg", name = "mb", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!pg", name = "nb", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!pg", name = "ob", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!pg", name = "pb", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!pg", name = "qb", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!pg", name = "rb", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!pg", name = "sb", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!pg", name = "tb", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!pg", name = "ub", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!pg", name = "vb", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!pg", name = "wb", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!pg", name = "yb", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!pg", name = "zb", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!pg", name = "Ab", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!pg", name = "Bb", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!pg", name = "Cb", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!pg", name = "Db", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!pg", name = "Eb", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!pg", name = "Fb", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!pg", name = "Gb", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!pg", name = "Hb", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!pg", name = "Ib", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!pg", name = "Jb", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!pg", name = "Kb", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!pg", name = "Lb", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!pg", name = "Mb", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!pg", name = "Nb", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!pg", name = "Ob", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!pg", name = "Pb", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!pg", name = "Qb", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!pg", name = "Rb", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!pg", name = "Sb", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!pg", name = "Tb", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!pg", name = "Ub", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!pg", name = "Vb", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!pg", name = "Wb", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!pg", name = "Xb", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!pg", name = "Yb", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!pg", name = "Zb", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!pg", name = "ac", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!pg", name = "bc", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!pg", name = "cc", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!pg", name = "dc", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!pg", name = "ec", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!pg", name = "fc", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!pg", name = "gc", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!pg", name = "hc", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!pg", name = "ic", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!pg", name = "jc", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!pg", name = "kc", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!pg", name = "lc", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!pg", name = "mc", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!pg", name = "nc", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!pg", name = "oc", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!pg", name = "qc", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!pg", name = "rc", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!pg", name = "sc", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!pg", name = "tc", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!pg", name = "uc", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!pg", name = "vc", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!pg", name = "xc", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!pg", name = "yc", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!pg", name = "zc", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!pg", name = "Ac", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!pg", name = "Bc", descriptor = "I")
    private int field4637;

    @OriginalMember(owner = "client!pg", name = "Dc", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!pg", name = "Ec", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!pg", name = "Fc", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!pg", name = "Gc", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!pg", name = "Hc", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!pg", name = "Ic", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!pg", name = "Jc", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!pg", name = "Kc", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!pg", name = "Lc", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!pg", name = "Mc", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!pg", name = "Oc", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!pg", name = "Pc", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!pg", name = "Qc", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!pg", name = "Rc", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!pg", name = "Sc", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!pg", name = "Tc", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!pg", name = "Uc", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!pg", name = "Wc", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!pg", name = "Xc", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!pg", name = "Yc", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!pg", name = "Zc", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!pg", name = "ad", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!pg", name = "bd", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!pg", name = "cd", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!pg", name = "dd", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!pg", name = "ed", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!pg", name = "fd", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!pg", name = "gd", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!pg", name = "hd", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!pg", name = "id", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!pg", name = "jd", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!pg", name = "kd", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!pg", name = "ld", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!pg", name = "md", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!pg", name = "nd", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!pg", name = "od", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!pg", name = "pd", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!pg", name = "qd", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!pg", name = "rd", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!pg", name = "sd", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!pg", name = "td", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!pg", name = "ud", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!pg", name = "vd", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!pg", name = "wd", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!pg", name = "yd", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!pg", name = "zd", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!pg", name = "Ad", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!pg", name = "Bd", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!pg", name = "Cd", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!pg", name = "Dd", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!pg", name = "Ed", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!pg", name = "Fd", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!pg", name = "Gd", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!pg", name = "Hd", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!pg", name = "Id", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!pg", name = "Jd", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!pg", name = "Kd", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!pg", name = "Ld", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!pg", name = "Md", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!pg", name = "Nd", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!pg", name = "Od", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!pg", name = "Pd", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!pg", name = "Qd", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!pg", name = "Rd", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!pg", name = "Sd", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!pg", name = "Td", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!pg", name = "Ud", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!pg", name = "Vd", descriptor = "I")
    private int field4709;

    @OriginalMember(owner = "client!pg", name = "Wd", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!pg", name = "Xd", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!pg", name = "Yd", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!pg", name = "Zd", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!pg", name = "ae", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!pg", name = "ke", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!pg", name = "ze", descriptor = "I")
    private int field4739;

    @OriginalMember(owner = "client!pg", name = "Ae", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!pg", name = "Ce", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!pg", name = "Oe", descriptor = "I")
    private int field4754;

    @OriginalMember(owner = "client!pg", name = "Te", descriptor = "I")
    private int field4759;

    @OriginalMember(owner = "client!pg", name = "We", descriptor = "I")
    private int field4762;

    @OriginalMember(owner = "client!pg", name = "mf", descriptor = "I")
    private int field4777;

    @OriginalMember(owner = "client!pg", name = "vf", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!pg", name = "Df", descriptor = "I")
    private int field4794;

    @OriginalMember(owner = "client!pg", name = "cg", descriptor = "I")
    private int field4819;

    @OriginalMember(owner = "client!pg", name = "jg", descriptor = "I")
    public int field4826;

    @OriginalMember(owner = "client!pg", name = "rg", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!pg", name = "xg", descriptor = "I")
    public int field4840;

    @OriginalMember(owner = "client!pg", name = "Dg", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!pg", name = "Lg", descriptor = "I")
    private int field4854;

    @OriginalMember(owner = "client!pg", name = "Og", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!pg", name = "Sg", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!pg", name = "Wg", descriptor = "I")
    private int field4865;

    @OriginalMember(owner = "client!pg", name = "Zg", descriptor = "I")
    private int field4868;

    @OriginalMember(owner = "client!pg", name = "ch", descriptor = "I")
    private int field4871;

    @OriginalMember(owner = "client!pg", name = "Zf", descriptor = "J")
    private long field4816;

    @OriginalMember(owner = "client!pg", name = "Mg", descriptor = "Lbd;")
    public class142 field4855;

    @OriginalMember(owner = "client!pg", name = "Tf", descriptor = "Lnn;")
    private class171 field4810;

    @OriginalMember(owner = "client!pg", name = "hg", descriptor = "Lnn;")
    private class171 field4824;

    @OriginalMember(owner = "client!pg", name = "xf", descriptor = "Lgq;")
    private class241 field4788;

    @OriginalMember(owner = "client!pg", name = "Hg", descriptor = "Lfw;")
    private class337 field4850;

    @OriginalMember(owner = "client!pg", name = "se", descriptor = "Lli;")
    private class386 field4732;

    @OriginalMember(owner = "client!pg", name = "we", descriptor = "Lli;")
    private class386 field4736;

    @OriginalMember(owner = "client!pg", name = "Rg", descriptor = "Lhu;")
    private class403 field4860;

    @OriginalMember(owner = "client!pg", name = "Me", descriptor = "Loj;")
    public class415 field4752;

    @OriginalMember(owner = "client!pg", name = "rf", descriptor = "Loj;")
    public class415 field4782;

    @OriginalMember(owner = "client!pg", name = "tf", descriptor = "Loj;")
    public class415 field4784;

    @OriginalMember(owner = "client!pg", name = "Rf", descriptor = "Loj;")
    public class415 field4808;

    @OriginalMember(owner = "client!pg", name = "lg", descriptor = "Loj;")
    public class415 field4828;

    @OriginalMember(owner = "client!pg", name = "mg", descriptor = "Loj;")
    public class415 field4829;

    @OriginalMember(owner = "client!pg", name = "pg", descriptor = "Loj;")
    public class415 field4832;

    @OriginalMember(owner = "client!pg", name = "tg", descriptor = "Loj;")
    public class415 field4836;

    @OriginalMember(owner = "client!pg", name = "Gg", descriptor = "Loj;")
    public class415 field4849;

    @OriginalMember(owner = "client!pg", name = "Vg", descriptor = "Loj;")
    public class415 field4864;

    @OriginalMember(owner = "client!pg", name = "Jf", descriptor = "Lhf;")
    public class475 field4800;

    @OriginalMember(owner = "client!pg", name = "Tg", descriptor = "Lhf;")
    public class475 field4862;

    @OriginalMember(owner = "client!pg", name = "Kf", descriptor = "Lsh;")
    public class511 field4801;

    @OriginalMember(owner = "client!pg", name = "Ig", descriptor = "Lsh;")
    public class511 field4851;

    @OriginalMember(owner = "client!pg", name = "gg", descriptor = "Leb;")
    public class60 field4823;

    @OriginalMember(owner = "client!pg", name = "qe", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4730;

    @OriginalMember(owner = "client!pg", name = "Le", descriptor = "Z")
    private boolean field4751;

    @OriginalMember(owner = "client!pg", name = "Qe", descriptor = "Z")
    public boolean field4756;

    @OriginalMember(owner = "client!pg", name = "df", descriptor = "Z")
    public boolean field4769;

    @OriginalMember(owner = "client!pg", name = "ff", descriptor = "Z")
    public boolean field4771;

    @OriginalMember(owner = "client!pg", name = "gf", descriptor = "Z")
    private boolean field4772;

    @OriginalMember(owner = "client!pg", name = "kf", descriptor = "Z")
    public boolean field4775;

    @OriginalMember(owner = "client!pg", name = "lf", descriptor = "Z")
    private boolean field4776;

    @OriginalMember(owner = "client!pg", name = "Af", descriptor = "Z")
    private boolean field4791;

    @OriginalMember(owner = "client!pg", name = "Bf", descriptor = "Z")
    private boolean field4792;

    @OriginalMember(owner = "client!pg", name = "Gf", descriptor = "Z")
    private boolean field4797;

    @OriginalMember(owner = "client!pg", name = "Of", descriptor = "Z")
    public boolean field4805;

    @OriginalMember(owner = "client!pg", name = "Sf", descriptor = "Z")
    public boolean field4809;

    @OriginalMember(owner = "client!pg", name = "Wf", descriptor = "Z")
    private boolean field4813;

    @OriginalMember(owner = "client!pg", name = "Yf", descriptor = "Z")
    public boolean field4815;

    @OriginalMember(owner = "client!pg", name = "ag", descriptor = "Z")
    private boolean field4817;

    @OriginalMember(owner = "client!pg", name = "bg", descriptor = "Z")
    public boolean field4818;

    @OriginalMember(owner = "client!pg", name = "Ag", descriptor = "Z")
    private boolean field4843;

    @OriginalMember(owner = "client!pg", name = "Fg", descriptor = "Z")
    private boolean field4848;

    @OriginalMember(owner = "client!pg", name = "Ve", descriptor = "[Lfg;")
    private class128[] field4761;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IIII)V")
    public final void method1962(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 100) {
            OpenGL.glDrawArrays(arg2, arg3, arg0);
            ++field4573;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method454(Canvas arg0) {
        ++field4586;
        long var2 = 0L;
        if (arg0 != null && this.field4625 != arg0) {
            if (this.field4632.containsKey(arg0)) {
                Long var4 = (Long) this.field4632.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field4685;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field4657.surfaceResized(var2);
            if (this.field4581 == arg0) {
                this.method1965(57);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method476(Rectangle[] arg0, int arg1) {
        this.method536();
        ++field4653;
    }

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "()V")
    public final void method491() {
        ++field4677;
        if (this.field4718 != null && this.field4718.method2540(89)) {
            this.field4720.method1151(this.field4718, (byte) -74);
            this.field4715.method1424(34842);
        }
    }

    @OriginalMember(owner = "client!pg", name = "JA", descriptor = "(F)V")
    public final void method554(float arg0) {
        ++field4557;
        if (this.field4778 != arg0) {
            this.field4778 = arg0;
            this.method1982(0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "(I)V")
    public final void method467(int arg0) {
        this.method2033(0, -1743);
        ++field4675;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)V")
    private final void method1963(int arg0) {
        if (this.field4841 != 0.0F) {
            float var2 = this.field4856 / (this.field4856 + this.field4841);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field4806 * (-var2 + 1.0F) / this.field4841;
            this.field4807[14] = this.field4806 * var3;
            this.field4807[10] = this.field4793 + var4;
        } else {
            this.field4807[10] = this.field4793;
            this.field4807[14] = this.field4806;
        }
        if (arg0 >= -56) {
            this.field4770 = 44;
        }
        ++field4680;
        this.field4839 = (float) this.field4785 - this.field4841;
        this.field4844 = (this.field4807[14] - (float) this.field4785) / this.field4807[10];
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBLfw;II)V")
    public final void method1964(int arg0, byte arg1, class337 arg2, int arg3, int arg4) {
        ++field4570;
        int var6 = arg2.method2055(126);
        if (arg1 <= -47) {
            int var7 = arg0 * this.method1995(var6, true);
            this.method2000(-9770, arg2);
            OpenGL.glDrawElements(arg3, arg4, var6, (long) var7 + arg2.method2054(-98));
        }
    }

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "()I")
    public final int method502() {
        ++field4529;
        return 4;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public final synchronized void method484(int arg0) {
        ++field4531;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4743.method3135(-19033)) {
            class437 var12 = (class437) this.field4743.method3134((byte) 122);
            class407.field5773[var3++] = (int) var12.field6883;
            this.field4740 -= var12.field6308;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class407.field5773, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class407.field5773, 0);
            var3 = 0;
        }
        while (!this.field4744.method3135(-19033)) {
            class437 var11 = (class437) this.field4744.method3134((byte) -56);
            class407.field5773[var3++] = (int) var11.field6883;
            this.field4742 -= var11.field6308;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class407.field5773, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class407.field5773, 0);
            var3 = 0;
        }
        while (!this.field4745.method3135(-19033)) {
            class437 var10 = (class437) this.field4745.method3134((byte) 117);
            class407.field5773[var3++] = var10.field6308;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class407.field5773, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class407.field5773, 0);
            var3 = 0;
        }
        while (!this.field4746.method3135(-19033)) {
            class437 var9 = (class437) this.field4746.method3134((byte) 106);
            class407.field5773[var3++] = (int) var9.field6883;
            this.field4739 -= var9.field6308;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class407.field5773, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class407.field5773, 0);
            boolean var4 = false;
        }
        while (!this.field4741.method3135(-19033)) {
            class437 var8 = (class437) this.field4741.method3134((byte) -89);
            OpenGL.glDeleteLists((int) var8.field6883, var8.field6308);
        }
        while (!this.field4747.method3135(-19033)) {
            class476 var7 = this.field4747.method3134((byte) -103);
            OpenGL.glDeleteProgramARB((int) var7.field6883);
        }
        while (!this.field4748.method3135(-19033)) {
            class476 var6 = this.field4748.method3134((byte) 105);
            OpenGL.glDeleteObjectARB(var6.field6883);
        }
        while (!this.field4741.method3135(-19033)) {
            class437 var5 = (class437) this.field4741.method3134((byte) -43);
            OpenGL.glDeleteLists((int) var5.field6883, var5.field6308);
        }
        this.field4715.method1426(-124);
        if (this.method473() > 100663296 && class254.method1522((byte) -51) > this.field4816 + 60000L) {
            System.gc();
            this.field4816 = class254.method1522((byte) -51);
        }
        this.field4724 = var2;
    }

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "(I)V")
    private final void method1965(int arg0) {
        if (this.field4581 != null) {
            Dimension var2 = this.field4581.getSize();
            this.field4709 = var2.height;
            this.field4637 = var2.width;
        } else {
            this.field4637 = this.field4709 = 0;
        }
        ++field4563;
        if (arg0 <= 17) {
            this.method540(-126, -86, 122, 44, -3, 9);
        }
        if (this.field4732 == null) {
            this.field4613 = this.field4709;
            this.field4700 = this.field4637;
            this.method2004((byte) -126);
        }
        this.method2038(-385881688);
        this.method477();
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)V")
    public final void method474(int arg0, int arg1, int arg2, int arg3) {
        ++field4676;
        this.field4720.method1146(arg0, arg3, 0, arg2, arg1);
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(I)V")
    public final void method493(int arg0) {
        ++field4710;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)V")
    public final void method1966(int arg0, int arg1) {
        if (~arg1 == -2) {
            this.method2023(7681, 7681, 2929);
        } else if (arg1 == 0) {
            this.method2023(8448, 8448, 2929);
        } else if (~arg1 == -3) {
            this.method2023(34165, 7681, 2929);
        } else if (arg1 == 3) {
            this.method2023(260, 8448, arg0 + 2930);
        } else if (~arg1 == -5) {
            this.method2023(34023, 34023, 2929);
        }
        ++field4588;
        if (arg0 != -1) {
            this.field4780 = -0.15087853F;
        }
    }

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "()V")
    public final void method532() {
        ++field4562;
        this.method2025(-32, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "()Z")
    public final boolean method551() {
        ++field4702;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    private final void method1967(byte arg0) {
        OpenGL.glLoadIdentity();
        if (arg0 != 45) {
            this.method1963(-28);
        }
        ++field4601;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field4851.method3030(false), 0);
        if (this.field4769) {
            this.field4716.field5151.method1622((byte) -61);
        }
        this.method2029((byte) 106);
        this.method1991((byte) 35);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[I[I)Lta;")
    public final class336 method562(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4701;
        return class390.method2315(arg3, this, arg1, arg0, arg2, 4526);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BII)V")
    public final synchronized void method1968(byte arg0, int arg1, int arg2) {
        if (arg0 != -103) {
            this.method476((Rectangle[]) null, 91);
        }
        ++field4564;
        class437 var4 = new class437(arg1);
        var4.field6883 = (long) arg2;
        this.field4746.method3139(0, var4);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V")
    public final void method1969(int arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            this.method2043(-126);
        }
        this.method1975(arg2, -23387, true, arg0);
        ++field4652;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lli;Z)V")
    public final void method1970(class386 arg0, boolean arg1) {
        ++field4636;
        if (!this.field4775) {
            if (this.field4735 < 0 || this.field4731[this.field4735] != arg0) {
                throw new RuntimeException();
            }
            this.field4731[this.field4735--] = null;
            arg0.method393((byte) -97);
            if (~this.field4735 > -1) {
                this.field4736 = this.field4732 = null;
            } else {
                this.field4736 = this.field4732 = this.field4731[this.field4735];
                this.field4736.method390((byte) -127);
            }
        } else {
            this.method2012(-1, arg0);
            this.method2009(arg0, (byte) 111);
        }
        if (!arg1) {
            this.method1978(false);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lqq;IIII)Le;")
    public final class285 method501(class496 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4706;
        return new class415(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "(I)V")
    public final void method1971(int arg0) {
        ++field4608;
        if (arg0 >= -5) {
            this.field4811 = -0.91865754F;
        }
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!pg", name = "OA", descriptor = "()I")
    public final int method507() {
        ++field4679;
        int var1 = this.field4868;
        this.field4868 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pg", name = "ya", descriptor = "(I)V")
    public final void method547(int arg0) {
        this.field4728 = 0;
        ++field4579;
        while (arg0 > 1) {
            ++this.field4728;
            arg0 >>= 1;
        }
        this.field4729 = 1 << this.field4728;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lli;I)V")
    public final void method1972(class386 arg0, int arg1) {
        ++field4548;
        if (this.field4737 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field4737 <= -1) {
                this.field4734[this.field4737].method402((byte) -116);
            }
            this.field4736 = this.field4734[++this.field4737] = arg0;
            if (arg1 != 16389) {
                this.method511(-47, 84, 109, -122);
            }
            this.field4736.method395(50);
        }
    }

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "()Z")
    public final boolean method466() {
        ++field4688;
        return this.field4817 && (!this.method549() || this.field4843);
    }

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "()Z")
    public final boolean method498() {
        ++field4686;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIIIII)V")
    public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4642;
        this.method2024((byte) 103);
        this.method2033(arg5, -1743);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
    public final void method524(boolean arg0) {
        ++field4583;
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "()Z")
    public final boolean method542() {
        ++field4684;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "pa", descriptor = "()I")
    public final int method473() {
        ++field4690;
        return this.field4742 + this.field4740 + this.field4739;
    }

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "()Z")
    public final boolean method475() {
        ++field4590;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lhf;Lhf;Lhf;Lhf;I)V")
    public final void method1973(class475 arg0, class475 arg1, class475 arg2, class475 arg3, int arg4) {
        if (arg4 != 32888) {
            this.field4853 = -7;
        }
        ++field4584;
        if (arg3 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1999(false, arg3.field6875);
            OpenGL.glVertexPointer(arg3.field6874, arg3.field6877, this.field4810.method883(113), this.field4810.method882((byte) 120) - -((long) arg3.field6868));
            OpenGL.glEnableClientState(32884);
        }
        if (arg1 != null) {
            this.method1999(false, arg1.field6875);
            OpenGL.glNormalPointer(arg1.field6877, this.field4810.method883(arg4 ^ -32806), this.field4810.method882((byte) 116) + (long) arg1.field6868);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method1999(false, arg2.field6875);
            OpenGL.glColorPointer(arg2.field6874, arg2.field6877, this.field4810.method883(-122), this.field4810.method882((byte) 124) + (long) arg2.field6868);
            OpenGL.glEnableClientState(32886);
        }
        if (arg0 != null) {
            this.method1999(false, arg0.field6875);
            OpenGL.glTexCoordPointer(arg0.field6874, arg0.field6877, this.field4810.method883(-127), this.field4810.method882((byte) 116) - -((long) arg0.field6868));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public final void method513(int arg0) {
        ++field4712;
        this.method1978(false);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)I")
    private final int method1974(byte arg0) {
        ++field4539;
        this.field4866 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        if (arg0 != 93) {
            this.method462(-0.045317072F, -1.3936663F);
        }
        this.field4757 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field4866.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field4866.indexOf("brian paul") != 0 || ~this.field4866.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class139.method982(' ', (byte) 10, var3.replace('.', ' '));
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class410.method2405(arg0 + -217, var4[0]);
                int var6 = class410.method2405(124, var4[1]);
                this.field4819 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field4819 > -13) {
            var2 |= 2;
        }
        if (!this.field4657.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4657.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4826 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field4754 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field4762 = var7[0];
        if (~this.field4826 > -3 || this.field4754 < 2 || ~this.field4762 > -3) {
            var2 |= 16;
        }
        this.field4796 = NativeStream.method2852();
        this.field4657.arePbuffersAvailable();
        this.field4804 = this.field4657.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4817 = this.field4657.isExtensionAvailable("GL_ARB_multisample");
        this.field4771 = this.field4657.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4657.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4818 = this.field4657.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4756 = this.field4657.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4799 = this.field4657.isExtensionAvailable("GL_EXT_texture3D");
        this.field4803 = this.field4657.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4805 = this.field4657.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4765 = this.field4657.isExtensionAvailable("GL_ARB_texture_float");
        this.field4809 = false;
        this.field4773 = this.field4657.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field4775 = this.field4657.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field4815 = this.field4657.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field4843 = this.field4775 & this.field4815;
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIZI)V")
    public final void method1975(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (~this.field4857 != ~arg3) {
            if (arg3 < 0) {
                this.method1976(1);
                this.method1977((class128) null, true);
                this.method1966(arg1 + 23386, 0);
                if (!this.field4769) {
                    this.field4716.method2131(-7, arg0, 0, arg2, 0, 0);
                }
            } else {
                class142 var5 = this.field4715.method1425(arg1 ^ 23351, arg3);
                class249 var6 = super.field3988.method914(false, arg3);
                if (~var6.field3395 == -1 && var6.field3376 == 0) {
                    this.method1976(arg1 ^ -23388);
                } else {
                    int var7 = var6.field3386 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method1980((float) (this.field4724 % var8 * var6.field3395) / (float) var8, arg1 + 19396, 0.0F, (float) (this.field4724 % var8 * var6.field3376) / (float) var8);
                }
                if (this.field4769) {
                    this.method1977(var5, true);
                    this.method1966(arg1 + 23386, var6.field3378);
                } else {
                    this.field4716.method2131(86, arg0, var6.field3382, arg2, var6.field3379, var6.field3383);
                    if (!this.field4716.method2132(var5, var6.field3378, (byte) 119)) {
                        this.method1977(var5, true);
                        this.method1966(-1, var6.field3378);
                    }
                }
            }
            this.field4857 = arg3;
        }
        ++field4571;
        if (arg1 != -23387) {
            this.method465((class23) null, (class23) null, -0.53704035F, (class23) null);
        }
        this.field4777 &= -8;
    }

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "(I)V")
    private final void method1976(int arg0) {
        if (arg0 != 1) {
            this.method509(22, 37, 74, 87, 87, -56, -69);
        }
        ++field4565;
        if (this.field4848) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4848 = false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "()F")
    public final float method461() {
        ++field4654;
        return this.field4856;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([Le;Lc;[Lrr;I)V")
    public final void method457(class285[] arg0, class512 arg1, class305[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method701(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field4560;
    }

    @OriginalMember(owner = "client!pg", name = "aa", descriptor = "()F")
    public final float method472() {
        ++field4658;
        return this.field4841;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lfg;Z)V")
    public final void method1977(class128 arg0, boolean arg1) {
        ++field4672;
        if (!arg1) {
            this.method2011((byte) -76);
        }
        class128 var3 = this.field4761[this.field4854];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field1970);
                } else if (arg0.field1970 != var3.field1970) {
                    OpenGL.glDisable(var3.field1970);
                    OpenGL.glEnable(arg0.field1970);
                }
                OpenGL.glBindTexture(arg0.field1970, arg0.method927((byte) -109));
            } else {
                OpenGL.glDisable(var3.field1970);
            }
            this.field4761[this.field4854] = arg0;
        }
        this.field4777 &= -2;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(Z)V")
    private final void method1978(boolean arg0) {
        ++field4634;
        if (arg0) {
            this.method473();
        }
        this.field4657.detach();
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(II)V")
    public final synchronized void method1979(int arg0, int arg1) {
        ++field4605;
        class437 var3 = new class437(arg1);
        this.field4745.method3139(0, var3);
        if (arg0 != -34847) {
            this.method534(53, 1.3998144F, -0.764922F, 0.86618495F, -0.13717665F, -0.2587412F);
        }
    }

    @OriginalMember(owner = "client!pg", name = "ZA", descriptor = "(IIIII)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4558;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIZ)Lo;")
    public final class359 method565(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4703;
        return new class29(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method463(Canvas arg0) {
        ++field4692;
        if (this.field4625 == arg0) {
            throw new RuntimeException();
        } else if (this.field4632.containsKey(arg0)) {
            Long var2 = (Long) this.field4632.get(arg0);
            this.field4657.releaseSurface(arg0, var2);
            this.field4632.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "da", descriptor = "(FF)V")
    public final void method462(float arg0, float arg1) {
        ++field4682;
        if (this.field4856 != arg0 || this.field4841 != arg1) {
            this.field4856 = arg0;
            this.field4841 = arg1;
            this.method1963(-90);
            if (this.field4759 != 3) {
                if (~this.field4759 == -3) {
                    this.method2031(5888);
                    return;
                }
            } else {
                this.method2022(2);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "()Z")
    public final boolean method492() {
        ++field4640;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "()Z")
    public final boolean method531() {
        ++field4541;
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(FIFF)V")
    private final void method1980(float arg0, int arg1, float arg2, float arg3) {
        if (arg1 != -3991) {
            this.field4850 = null;
        }
        OpenGL.glMatrixMode(5890);
        ++field4536;
        if (this.field4848) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg3, arg2);
        OpenGL.glMatrixMode(5888);
        this.field4848 = true;
    }

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "(I)V")
    private final void method1981(int arg0) {
        if (arg0 != 1) {
            this.method463((Canvas) null);
        }
        ++field4697;
        if (~this.field4759 != -3) {
            this.field4759 = 2;
            this.method2031(5888);
            this.method1967((byte) 45);
            this.field4777 &= -8;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ln;)V")
    public final void method497(class391 arg0) {
        ++field4655;
        this.field4730 = ((class234) arg0).field3249;
        if (this.field4824 == null) {
            class504 var2 = new class504(80);
            if (this.field4796) {
                var2.method2988(-59, -1.0F);
                var2.method2988(-118, -1.0F);
                var2.method2988(-63, 0.0F);
                var2.method2988(-60, 0.0F);
                var2.method2988(-65, 1.0F);
                var2.method2988(-87, 1.0F);
                var2.method2988(-66, -1.0F);
                var2.method2988(-100, 0.0F);
                var2.method2988(-55, 1.0F);
                var2.method2988(-126, 1.0F);
                var2.method2988(-78, 1.0F);
                var2.method2988(-63, 1.0F);
                var2.method2988(-121, 0.0F);
                var2.method2988(-117, 1.0F);
                var2.method2988(-64, 0.0F);
                var2.method2988(-59, -1.0F);
                var2.method2988(-51, 1.0F);
                var2.method2988(-94, 0.0F);
                var2.method2988(-85, 0.0F);
                var2.method2988(-104, 0.0F);
            } else {
                var2.method2989(-1.0F, -13163);
                var2.method2989(-1.0F, -13163);
                var2.method2989(0.0F, -13163);
                var2.method2989(0.0F, -13163);
                var2.method2989(1.0F, -13163);
                var2.method2989(1.0F, -13163);
                var2.method2989(-1.0F, -13163);
                var2.method2989(0.0F, -13163);
                var2.method2989(1.0F, -13163);
                var2.method2989(1.0F, -13163);
                var2.method2989(1.0F, -13163);
                var2.method2989(1.0F, -13163);
                var2.method2989(0.0F, -13163);
                var2.method2989(1.0F, -13163);
                var2.method2989(0.0F, -13163);
                var2.method2989(-1.0F, -13163);
                var2.method2989(1.0F, -13163);
                var2.method2989(0.0F, -13163);
                var2.method2989(0.0F, -13163);
                var2.method2989(0.0F, -13163);
            }
            this.field4824 = this.method1983(var2.field4360, false, 20, var2.field4336, 1);
            this.field4862 = new class475(this.field4824, 5126, 3, 0);
            this.field4800 = new class475(this.field4824, 5126, 2, 12);
            this.field4721.method2972((byte) -126, this);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)I")
    public final int method525(int arg0, int arg1) {
        ++field4568;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "(I)V")
    private final void method1982(int arg0) {
        class165.field2532[2] = this.field4859 * this.field4778;
        class165.field2532[arg0] = this.field4787 * this.field4778;
        class165.field2532[1] = this.field4845 * this.field4778;
        ++field4656;
        class165.field2532[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class165.field2532, 0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZI[BI)Lnn;")
    public final class171 method1983(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        ++field4691;
        if (arg4 != 1) {
            this.method1972((class386) null, -20);
        }
        return (class171) (!this.field4804 || arg1 && !this.field4766 ? new class120(this, arg2, arg3, arg0) : new class213(this, arg2, arg3, arg0, arg1));
    }

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "()I")
    public final int method464() {
        ++field4555;
        return this.field4785;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(FFF)V")
    public final void method505(float arg0, float arg1, float arg2) {
        ++field4618;
        class309.field4207 = arg1;
        class147.field2260 = arg2;
        class219.field3094 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "(I)V")
    private final void method1984(int arg0) {
        ++field4559;
        if (~this.field4759 != -4) {
            this.field4759 = 3;
            this.method2022(2);
            this.method1967((byte) 45);
            this.field4777 &= -8;
        }
        if (arg0 != 1791027752) {
            this.field4766 = false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public final synchronized void method1985(int arg0, int arg1, int arg2) {
        ++field4650;
        if (arg0 != 768) {
            this.field4844 = -0.7234914F;
        }
        class437 var4 = new class437(arg2);
        var4.field6883 = (long) arg1;
        this.field4744.method3139(0, var4);
    }

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "()Z")
    public final boolean method564() {
        ++field4668;
        return this.field4716.method2136(3, (byte) -57);
    }

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "(IIIIII)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4713;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2024((byte) 119);
        float var10 = (float) arg3 + var8;
        this.method2033(arg5, -1743);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4817) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4817) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(II)V")
    public final synchronized void method1986(int arg0, int arg1) {
        ++field4695;
        class476 var3 = new class476();
        var3.field6883 = (long) arg1;
        this.field4747.method3139(0, var3);
        int var4 = 13 / ((arg0 - 2) / 38);
    }

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "(I)V")
    private final void method1987(int arg0) {
        class165.field2532[3] = 1.0F;
        class165.field2532[1] = this.field4845 * this.field4764;
        class165.field2532[2] = this.field4859 * this.field4764;
        class165.field2532[0] = this.field4787 * this.field4764;
        ++field4554;
        OpenGL.glLightfv(16384, 4609, class165.field2532, 0);
        class165.field2532[1] = -this.field4763 * this.field4845;
        if (arg0 != 16116) {
            this.method470();
        }
        class165.field2532[2] = -this.field4763 * this.field4859;
        class165.field2532[0] = -this.field4763 * this.field4787;
        class165.field2532[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class165.field2532, 0);
    }

    @OriginalMember(owner = "client!pg", name = "VA", descriptor = "(IIIIII)Z")
    public final boolean method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4631;
        float var7 = (float) arg2 * this.field4851.field7473 + (float) arg0 * this.field4851.field7471 + (float) arg1 * this.field4851.field7498 + this.field4851.field7484;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4851.field7473 + (float) arg3 * this.field4851.field7471 + (float) arg4 * this.field4851.field7498 + this.field4851.field7484;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field4790 > var7) || !((float) this.field4790 > var8)) && (!((float) this.field4785 < var7) || !((float) this.field4785 < var8))) {
            int var9 = (int) (((float) arg2 * this.field4851.field7481 + (float) arg0 * this.field4851.field7468 + (float) arg1 * this.field4851.field7469 + this.field4851.field7479) * (float) this.field4822 / var7);
            int var10 = (int) (((float) arg5 * this.field4851.field7481 + (float) arg3 * this.field4851.field7468 + (float) arg4 * this.field4851.field7469 + this.field4851.field7479) * (float) this.field4822 / var8);
            if (this.field4750 > (float) var9 && this.field4750 > (float) var10 || this.field4780 < (float) var9 && this.field4780 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4851.field7477 + (float) arg0 * this.field4851.field7486 + (float) arg1 * this.field4851.field7487 + this.field4851.field7472) * (float) this.field4774 / var7);
                int var12 = (int) (((float) arg5 * this.field4851.field7477 + (float) arg3 * this.field4851.field7486 + (float) arg4 * this.field4851.field7487 + this.field4851.field7472) * (float) this.field4774 / var8);
                return (!(this.field4830 > (float) var11) || !((float) var12 < this.field4830)) && (!(this.field4847 < (float) var11) || !((float) var12 > this.field4847));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "(IIIIII[BII)V")
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4669;
        float var10;
        float var11;
        if (this.field4788 != null && this.field4788.field2110 >= arg2 && arg3 <= this.field4788.field2108) {
            this.field4788.method996(0, false, arg2, 6406, false, 0, arg3, 0, 0, arg6);
            var10 = (float) arg2 * this.field4788.field3329 / (float) this.field4788.field2110;
            var11 = (float) arg3 * this.field4788.field3325 / (float) this.field4788.field2108;
        } else {
            this.field4788 = class79.method612(arg2, 6406, this, 34037, false, arg3, 6406, arg6);
            this.field4788.method990(false, 1024, false);
            var11 = this.field4788.field3325;
            var10 = this.field4788.field3329;
        }
        this.method2032(false);
        this.method1977(this.field4788, true);
        this.method2033(arg8, -1743);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1988((byte) 109, arg5);
        this.method2023(34165, 34165, 2929);
        this.method2040(false, 0, 768, 34166);
        this.method2040(false, 2, 770, 5890);
        this.method1994(0, 770, 34166, 8960);
        this.method1994(2, 770, 5890, 8960);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2040(false, 0, 768, 5890);
        this.method2040(false, 2, 770, 34166);
        this.method1994(0, 770, 5890, 8960);
        this.method1994(2, 770, 34166, 8960);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)Lks;")
    public final class23 method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4681;
        return this.field4805 ? new class467(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
    public final void method1988(byte arg0, int arg1) {
        if (arg0 == 109) {
            class165.field2532[2] = (float) class375.method2245(arg1, 255) / 255.0F;
            ++field4535;
            class165.field2532[1] = (float) class375.method2245(65280, arg1) / 65280.0F;
            class165.field2532[0] = (float) class375.method2245(arg1, 16711680) / 1.671168E7F;
            class165.field2532[3] = (float) (arg1 >>> 24) / 255.0F;
            OpenGL.glTexEnvfv(8960, 8705, class165.field2532, 0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)V")
    public final void method528(boolean arg0) {
        this.field4755 = arg0;
        ++field4611;
        this.method2043(32884);
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public final void method494(int arg0) {
        this.method2011((byte) -97);
        ++field4666;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()Z")
    public final boolean method500() {
        ++field4705;
        if (this.field4718 != null) {
            if (!this.field4718.method2540(116)) {
                if (!this.field4720.method1144(false, this.field4718)) {
                    return false;
                }
                this.field4715.method1424(34842);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
    private final void method1989(byte arg0) {
        ++field4664;
        if (arg0 <= 22) {
            this.field4750 = -2.067366F;
        }
        if (~this.field4759 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field4700 < -1 && ~this.field4613 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field4700, (double) this.field4613, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4777 &= -25;
            this.field4759 = 1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4635;
        OpenGL.glLineWidth((float) arg5);
        this.method552(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
    public final void method1990(boolean arg0, int arg1) {
        if (arg0) {
            this.field4815 = false;
        }
        ++field4620;
        if (~this.field4854 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field4854 = arg1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
    private final void method1991(byte arg0) {
        ++field4643;
        int var2 = 0;
        if (arg0 == 35) {
            while (this.field4846 > var2) {
                class447 var3 = this.field4779[var2];
                class224.field3173[0] = (float) var3.method2633(0);
                int var4 = 16386 - -var2;
                class224.field3173[1] = (float) var3.method2640(arg0 + -131);
                class224.field3173[2] = (float) var3.method2638(class373.method2233(arg0, 22014));
                class224.field3173[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class224.field3173, 0);
                int var5 = var3.method2637(105);
                float var6 = var3.method2639(24755) / 255.0F;
                class224.field3173[0] = var6 * (float) (class375.method2245(var5, 16757933) >> 16);
                class224.field3173[1] = (float) class375.method2245(255, var5 >> 8) * var6;
                class224.field3173[2] = var6 * (float) class375.method2245(255, var5);
                OpenGL.glLightfv(var4, 4609, class224.field3173, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2636((byte) 60) * var3.method2636((byte) 45)));
                OpenGL.glEnable(var4);
                ++var2;
            }
            while (this.field4794 > var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field4794 = this.field4846;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(FBF)V")
    public final void method1992(float arg0, byte arg1, float arg2) {
        ++field4526;
        this.field4833 = arg2;
        this.field4827 = arg0;
        if (!this.field4769) {
            this.method1996(false);
        }
        if (arg1 <= 61) {
            this.field4819 = 86;
        }
    }

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "(I)V")
    public final void method1993(int arg0) {
        ++field4711;
        if (arg0 == 1) {
            if (this.field4777 != 4) {
                this.method1989((byte) 83);
                this.method2020(85, false);
                this.method2036(30919, false);
                this.method2016(false, arg0 + -58);
                this.method2025(-32, false);
                this.method1998(-2, (byte) -53);
                this.method2033(1, -1743);
                this.method1966(arg0 + -2, 0);
                this.field4777 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IIII)V")
    public final void method1994(int arg0, int arg1, int arg2, int arg3) {
        ++field4600;
        OpenGL.glTexEnvi(arg3, arg0 + 34184, arg2);
        OpenGL.glTexEnvi(8960, 34200 - -arg0, arg1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public final class11 method506(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4665;
        return new class163(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)I")
    public final int method1995(int arg0, boolean arg1) {
        ++field4633;
        if (~arg0 != -5122 && arg0 != 5120) {
            if (arg0 != 5123 && ~arg0 != -5123) {
                if (!arg1) {
                    this.field4826 = -125;
                }
                if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!pg", name = "MA", descriptor = "([I)V")
    public final void method495(int[] arg0) {
        arg0[3] = this.field4837;
        ++field4552;
        arg0[2] = this.field4831;
        arg0[0] = this.field4798;
        arg0[1] = this.field4802;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(Z)V")
    private final void method1996(boolean arg0) {
        ++field4540;
        int var2;
        if (this.field4769) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field4760;
        } else {
            this.field4781 = (float) (this.field4785 - this.field4814) + -this.field4833;
            this.field4811 = this.field4781 - (float) this.field4795 * this.field4827;
            if ((float) this.field4790 > this.field4811) {
                this.field4811 = (float) this.field4790;
            }
            OpenGL.glFogf(2915, this.field4811);
            OpenGL.glFogf(2916, this.field4781);
            var2 = this.field4835;
        }
        class165.field2532[0] = (float) class375.method2245(16711680, var2) / 1.671168E7F;
        class165.field2532[2] = (float) class375.method2245(255, var2) / 255.0F;
        if (!arg0) {
            class165.field2532[1] = (float) class375.method2245(65280, var2) / 65280.0F;
            OpenGL.glFogfv(2918, class165.field2532, 0);
            if (this.field4769) {
                this.field4716.field5151.method1621(5654);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "IA", descriptor = "(IIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4607;
        this.method2024((byte) -108);
        this.method2033(arg4, -1743);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "(IFFFFF)V")
    public final void method534(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4628;
        boolean var7 = ~this.field4853 != ~arg0;
        if (var7 || this.field4764 != arg1 || this.field4763 != arg2) {
            this.field4764 = arg1;
            this.field4763 = arg2;
            this.field4853 = arg0;
            if (var7) {
                this.field4859 = (float) (255 & this.field4853) / 255.0F;
                this.field4787 = (float) (this.field4853 & 16711680) / 1.671168E7F;
                this.field4845 = (float) (65280 & this.field4853) / 65280.0F;
                this.method1982(0);
            }
            this.method1987(16116);
        }
        if (this.field4863[0] != arg3 || this.field4863[1] != arg4 || this.field4863[2] != arg5) {
            this.field4863[0] = arg3;
            this.field4863[2] = arg5;
            this.field4863[1] = arg4;
            this.field4749[2] = -arg5;
            this.field4749[0] = -arg3;
            this.field4749[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4768[1] = arg4 * var8;
            this.field4768[2] = arg5 * var8;
            this.field4768[0] = arg3 * var8;
            this.field4852[0] = -this.field4768[0];
            this.field4852[1] = -this.field4768[1];
            this.field4852[2] = -this.field4768[2];
            this.method2029((byte) 81);
            this.field4840 = (int) (arg3 * 256.0F / arg4);
            this.field4861 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)V")
    private final void method1997(byte arg0) {
        ++field4693;
        float[] var2 = this.field4807;
        float var3 = (float) (-this.field4758 * this.field4790) / (float) this.field4822;
        float var4 = (float) ((-this.field4758 + this.field4700) * this.field4790) / (float) this.field4822;
        if (arg0 < 45) {
            this.method1982(-125);
        }
        float var5 = (float) (this.field4790 * this.field4770) / (float) this.field4774;
        float var6 = (float) ((-this.field4613 + this.field4770) * this.field4790) / (float) this.field4774;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field4790 * 2.0F;
            var2[3] = 0.0F;
            var2[2] = 0.0F;
            var2[14] = this.field4806 = -((float) this.field4785 * var7) / (float) (-this.field4790 + this.field4785);
            var2[13] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[15] = 0.0F;
            var2[6] = 0.0F;
            var2[1] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[5] = var7 / (var5 - var6);
            var2[12] = 0.0F;
            var2[11] = -1.0F;
            var2[10] = this.field4793 = (float) (-(this.field4790 + this.field4785)) / (float) (-this.field4790 + this.field4785);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[7] = 0.0F;
            var2[4] = 0.0F;
        } else {
            var2[4] = 0.0F;
            var2[2] = 0.0F;
            var2[11] = 0.0F;
            var2[13] = 0.0F;
            var2[9] = 0.0F;
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
            var2[8] = 0.0F;
            var2[1] = 0.0F;
            var2[14] = 0.0F;
            var2[7] = 0.0F;
            var2[6] = 0.0F;
            var2[10] = 1.0F;
            var2[0] = 1.0F;
            var2[15] = 1.0F;
        }
        this.method1963(-100);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
    public final void method1998(int arg0, byte arg1) {
        this.method1969(arg0, 0, true);
        if (arg1 != -53) {
            this.field4801 = null;
        }
        ++field4659;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLnn;)V")
    public final void method1999(boolean arg0, class171 arg1) {
        if (this.field4810 != arg1) {
            if (this.field4804) {
                OpenGL.glBindBufferARB(34962, arg1.method881(13298));
            }
            this.field4810 = arg1;
        }
        ++field4543;
        if (arg0) {
            this.field4759 = 75;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILfw;)V")
    public final void method2000(int arg0, class337 arg1) {
        if (this.field4850 != arg1) {
            if (this.field4804) {
                OpenGL.glBindBufferARB(34963, arg1.method2053(arg0 + 9848));
            }
            this.field4850 = arg1;
        }
        if (arg0 != -9770) {
            this.field4872 = null;
        }
        ++field4606;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "()V")
    public final void method485() {
        this.field4720.method1148(-3);
        ++field4683;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lli;I)V")
    public final void method2001(class386 arg0, int arg1) {
        ++field4553;
        if (this.field4775) {
            this.method1972(arg0, 16389);
            this.method2034((byte) 15, arg0);
        } else {
            if (this.field4735 >= 3) {
                throw new RuntimeException();
            }
            if (this.field4735 >= 0) {
                this.field4731[this.field4735].method393((byte) -97);
            }
            this.field4736 = this.field4732 = this.field4731[++this.field4735] = arg0;
            this.field4736.method390((byte) -127);
        }
        if (arg1 < 56) {
            this.method1966(32, 81);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()V")
    public final void method490() {
        ++field4663;
    }

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "(I)Lgi;")
    public final class490 method2002(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field4698;
            return this.field4860 == null ? null : this.field4860.method1915((byte) 104);
        }
    }

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "()V")
    public final void method536() {
        ++field4694;
        try {
            this.field4657.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lsh;I)V")
    public final void method2003(class511 arg0, int arg1) {
        OpenGL.glLoadMatrixf(arg0.method3030(false), arg1);
        ++field4629;
    }

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "()Lc;")
    public final class512 method489() {
        ++field4689;
        return new class511();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([Le;Lvk;Lc;[Lrr;I)V")
    public final void method499(class285[] arg0, class334 arg1, class512 arg2, class305[] arg3, int arg4) {
        ++field4639;
        this.method457(arg0, arg2, arg3, arg4);
        this.method533(arg1);
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(B)V")
    private final void method2004(byte arg0) {
        if (arg0 < -39) {
            ++field4538;
            OpenGL.glViewport(this.field4838, this.field4753, this.field4700, this.field4613);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
    public final synchronized void method2005(int arg0, int arg1, int arg2) {
        ++field4647;
        class437 var4 = new class437(arg1);
        var4.field6883 = (long) arg0;
        this.field4743.method3139(arg2, var4);
    }

    @OriginalMember(owner = "client!pg", name = "sa", descriptor = "(IIII)[I")
    public final int[] method537(int arg0, int arg1, int arg2, int arg3) {
        ++field4542;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field4613 + -var6, arg2, 1, 32993, this.field4825, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Ln;")
    public final class391 method539(int arg0) {
        ++field4623;
        class234 var2 = new class234(arg0);
        this.field4727.method3139(0, var2);
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BIZIB)Lfw;")
    public final class337 method2006(byte[] arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        if (arg4 < 123) {
            return null;
        } else {
            ++field4707;
            return (class337) (!this.field4804 || arg2 && !this.field4766 ? new class379(this, arg1, arg0, arg3) : new class355(this, arg1, arg0, arg3, arg2));
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lvk;)V")
    public final void method533(class334 arg0) {
        this.field4721.method2970((byte) -125, arg0, this);
        ++field4624;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method535(Canvas arg0) {
        ++field4614;
        if (this.field4625 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4632.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field4657.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field4632.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(FFZFF)V")
    public final void method2007(float arg0, float arg1, boolean arg2, float arg3, float arg4) {
        class165.field2532[0] = arg0;
        if (!arg2) {
            this.field4747 = null;
        }
        class165.field2532[3] = arg3;
        ++field4524;
        class165.field2532[2] = arg1;
        class165.field2532[1] = arg4;
        OpenGL.glTexEnvfv(8960, 8705, class165.field2532, 0);
    }

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "(I)V")
    private final void method2008(int arg0) {
        this.method1998(-2, (byte) -53);
        ++field4592;
        for (int var2 = this.field4826 - 1; var2 >= 0; --var2) {
            this.method1990(false, var2);
            this.method1977((class128) null, true);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2023(8448, 8448, 2929);
        this.method2040(false, 2, 770, 34168);
        this.method1976(arg0 + 11426);
        this.field4834 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4865 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4772 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4791 = true;
        this.method2020(89, true);
        this.method2036(30919, true);
        if (arg0 == -11425) {
            this.method2016(true, -106);
            this.method2025(-32, true);
            this.method2038(-385881688);
            this.field4657.setSwapInterval(0);
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
            this.field4853 = this.field4835 = -1;
            this.method477();
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lli;B)V")
    public final void method2009(class386 arg0, byte arg1) {
        ++field4648;
        if (~this.field4733 <= -1 && this.field4738[this.field4733] == arg0) {
            this.field4738[this.field4733--] = null;
            arg0.method400(13646);
            if (~this.field4733 <= -1) {
                this.field4732 = this.field4738[this.field4733];
                this.field4732.method396(true);
            } else {
                this.field4732 = null;
            }
            int var3 = 43 / ((-65 - arg1) / 61);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "()Z")
    public final boolean method549() {
        ++field4612;
        return this.field4718 != null && this.field4718.method2540(111);
    }

    @OriginalMember(owner = "client!pg", name = "ma", descriptor = "(IIIII)V")
    public final void method543(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4582;
        this.method2024((byte) -127);
        this.method2033(arg4, -1743);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pg", name = "va", descriptor = "()V")
    public final void method477() {
        this.field4837 = this.field4613;
        this.field4802 = 0;
        this.field4798 = 0;
        this.field4831 = this.field4700;
        ++field4549;
        OpenGL.glDisable(3089);
        this.method2026(16);
    }

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "(I)V")
    public static void method2010(int arg0) {
        field4649 = null;
        if (arg0 >= -115) {
            method2010(78);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method486(Canvas arg0) {
        this.field4638 = 0L;
        this.field4581 = null;
        ++field4569;
        if (arg0 != null && this.field4625 != arg0) {
            if (this.field4632.containsKey(arg0)) {
                Long var2 = (Long) this.field4632.get(arg0);
                this.field4638 = var2;
                this.field4581 = arg0;
            }
        } else {
            this.field4581 = this.field4625;
            this.field4638 = this.field4685;
        }
        if (this.field4581 != null && ~this.field4638 != -1L) {
            this.field4657.setSurface(this.field4638);
            this.method1965(20);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(B)V")
    private final void method2011(byte arg0) {
        ++field4567;
        int var2 = 0;
        while (!this.field4657.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class334.method2047(1000L, 0);
        }
        if (arg0 > -93) {
            this.field4787 = -0.14542699F;
        }
    }

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "()V")
    public final void method488() {
        this.field4769 = false;
        ++field4527;
        this.field4716.method2131(-97, false, 0, false, 0, 0);
        this.method1996(false);
        this.method2042(2912);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Le;Lvk;Lc;Lrr;I)V")
    public final void method553(class285 arg0, class334 arg1, class512 arg2, class305 arg3, int arg4) {
        arg0.method701(arg2, arg3, arg4);
        ++field4699;
        this.method533(arg1);
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "()Z")
    public final boolean method519() {
        ++field4551;
        return this.field4718 != null && (~this.field4719 >= -2 || this.field4843);
    }

    @OriginalMember(owner = "client!pg", name = "ba", descriptor = "(IIII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (this.field4700 < arg2) {
            arg2 = this.field4700;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        ++field4525;
        if (~arg3 < ~this.field4613) {
            arg3 = this.field4613;
        }
        this.field4802 = arg1;
        this.field4831 = arg2;
        this.field4837 = arg3;
        this.field4798 = arg0;
        OpenGL.glEnable(3089);
        this.method2026(16);
        this.method2018((byte) 121);
    }

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "(IIII)V")
    public final void method517(int arg0, int arg1, int arg2, int arg3) {
        this.field4858 = arg2;
        this.field4786 = arg0;
        this.field4760 = arg1;
        this.field4767 = arg3;
        this.field4769 = true;
        ++field4593;
        this.field4716.method2131(124, false, 3, false, 0, 0);
        this.field4716.field5151.method1622((byte) -61);
        this.method1996(false);
        this.method2042(2912);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIILta;II)V")
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class336 arg6, int arg7, int arg8) {
        ++field4578;
        class397 var10 = (class397) arg6;
        class241 var11 = var10.field5703;
        this.method2032(false);
        this.method1977(var10.field5703, true);
        this.method2033(arg5, -1743);
        this.method2023(7681, 8448, 2929);
        this.method2040(false, 0, 768, 34167);
        float var12 = var11.field3329 / (float) var11.field3326;
        float var13 = var11.field3325 / (float) var11.field3324;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2040(false, 0, 768, 5890);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILli;)V")
    public final void method2012(int arg0, class386 arg1) {
        ++field4596;
        if (this.field4737 >= 0 && this.field4734[this.field4737] == arg1) {
            this.field4734[this.field4737--] = null;
            arg1.method402((byte) -47);
            if (arg0 >= ~this.field4737) {
                this.field4736 = this.field4734[this.field4737];
                this.field4736.method395(arg0 ^ -87);
            } else {
                this.field4736 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pg", name = "AA", descriptor = "()I")
    public final int method520() {
        ++field4604;
        return this.field4790;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[Lsa;)V")
    public final void method503(int arg0, class447[] arg1) {
        ++field4621;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field4779[var3] = arg1[var3];
        }
        this.field4846 = arg0;
        if (~this.field4759 != -2) {
            this.method1991((byte) 35);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIIII)Lo;")
    public final class359 method510(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4622;
        return new class29(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BF)V")
    public final void method2013(byte arg0, float arg1) {
        ++field4662;
        if (this.field4820 != arg1) {
            this.field4820 = arg1;
            if (~this.field4759 == -4) {
                this.method2022(arg0 ^ -44);
            }
        }
        if (arg0 != -42) {
            this.method2018((byte) 31);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJ)V")
    public final synchronized void method2014(int arg0, long arg1) {
        ++field4661;
        class476 var4 = new class476();
        var4.field6883 = arg1;
        this.field4748.method3139(arg0 ^ arg0, var4);
    }

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "(I)V")
    public final void method2015(int arg0) {
        if (arg0 <= -88) {
            ++field4704;
            if (this.field4777 != 16) {
                this.method1984(1791027752);
                this.method2020(-22, true);
                this.method2016(true, -31);
                this.method2025(-32, true);
                this.method2033(1, -1743);
                this.method1966(-1, 0);
                this.field4777 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "SA", descriptor = "(Lc;)V")
    public final void method548(class512 arg0) {
        this.field4851 = (class511) arg0;
        ++field4644;
        this.field4801.method3033(true, this.field4851);
        if (this.field4759 != 1) {
            this.method1967((byte) 45);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(ZI)V")
    public final void method2016(boolean arg0, int arg1) {
        if (this.field4797 != arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field4797 = arg0;
            this.field4777 &= -32;
        }
        ++field4572;
        if (arg1 >= -13) {
            this.field4764 = 1.4378499F;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)V")
    public final void method2017(int arg0, int arg1, int arg2) {
        ++field4595;
        this.field4838 = arg1;
        this.field4753 = arg2;
        this.method2004((byte) -80);
        if (arg0 != 768) {
            this.field4790 = 95;
        }
        this.method2018((byte) 109);
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(B)V")
    private final void method2018(byte arg0) {
        ++field4537;
        if (arg0 < 7) {
            this.field4789 = null;
        }
        if (this.field4831 >= this.field4798 && ~this.field4837 <= ~this.field4802) {
            OpenGL.glScissor(this.field4838 + this.field4798, this.field4753 + this.field4613 + -this.field4837, -this.field4798 + this.field4831, -this.field4802 + this.field4837);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lkt;[Lau;Z)Lla;")
    public final class306 method529(class61 arg0, class396[] arg1, boolean arg2) {
        ++field4641;
        return new class52(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "(III)V")
    public final void method558(int arg0, int arg1, int arg2) {
        ++field4627;
        if (this.field4835 != arg0 || this.field4795 != arg1 || this.field4814 != arg2) {
            this.field4835 = arg0;
            this.field4795 = arg1;
            this.field4814 = arg2;
            if (this.field4769) {
                return;
            }
            this.method1996(false);
            this.method2042(2912);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()V")
    public final void method560() {
        ++field4575;
        for (class476 var1 = this.field4727.method3137(0); var1 != null; var1 = this.field4727.method3132(0)) {
            ((class234) var1).method1430(13);
        }
        if (this.field4720 != null) {
            this.field4720.method1153(-64);
        }
        if (this.field4657 != null) {
            this.method1978(false);
            Enumeration var2 = this.field4632.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4632.get(var3);
                this.field4657.releaseSurface(var3, var4);
            }
            this.field4657.release();
            this.field4657 = null;
        }
        if (this.field4725) {
            class100.method786(false, 5, true);
            this.field4725 = false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)I")
    public final int method2019(byte arg0, int arg1) {
        ++field4615;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (arg1 != 6410 && ~arg1 != -34847 && arg1 != 34844) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (arg1 != 6408 && arg1 != 34847) {
                    if (~arg1 == -34844) {
                        return 6;
                    } else if (~arg1 == -34843) {
                        return 8;
                    } else if (arg1 == 6402) {
                        return 3;
                    } else if (~arg1 == -6402) {
                        return 1;
                    } else if (arg0 < 73) {
                        return -117;
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

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IIIIII)V")
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4545;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method2024((byte) -33);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2033(arg5, -1743);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4817) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4817) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IZ)V")
    public final void method2020(int arg0, boolean arg1) {
        int var3 = -44 % ((arg0 - 41) / 37);
        ++field4589;
        if (this.field4813 != arg1) {
            this.field4813 = arg1;
            this.method2042(2912);
            this.field4777 &= -32;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
    public final int method459(int arg0, int arg1) {
        ++field4587;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BIIZLjaggl/memory/NativeBuffer;)Lnn;")
    public final class171 method2021(byte arg0, int arg1, int arg2, boolean arg3, NativeBuffer arg4) {
        ++field4667;
        int var6 = 72 / ((arg0 - 25) / 43);
        return (class171) (!this.field4804 || arg3 && !this.field4766 ? new class120(this, arg2, arg4) : new class213(this, arg2, arg4, arg1, arg3));
    }

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "(I)V")
    private final void method2022(int arg0) {
        ++field4678;
        float var2 = (float) (-this.field4758) * this.field4820 / (float) this.field4822;
        float var3 = (float) (-this.field4770) * this.field4820 / (float) this.field4774;
        if (arg0 != 2) {
            this.method507();
        }
        float var4 = (float) (this.field4700 - this.field4758) * this.field4820 / (float) this.field4822;
        float var5 = (float) (this.field4613 - this.field4770) * this.field4820 / (float) this.field4774;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field4790 - this.field4841), (double) ((float) this.field4785 - this.field4841));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(III)V")
    public final void method2023(int arg0, int arg1, int arg2) {
        ++field4696;
        if (arg2 != 2929) {
            this.field4741 = null;
        }
        if (~this.field4854 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (this.field4821 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                this.field4821 = arg0;
                var4 = true;
            }
            if (this.field4812 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field4812 = arg1;
            }
            if (var4) {
                this.field4777 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "()Z")
    public final boolean method514() {
        ++field4619;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(B)V")
    private final void method2024(byte arg0) {
        if (~this.field4777 != -2) {
            this.method1989((byte) 110);
            this.method2020(108, false);
            this.method2036(30919, false);
            this.method2016(false, -96);
            this.method2025(-32, false);
            this.method1977((class128) null, true);
            this.method1998(-2, (byte) -53);
            this.method1966(-1, 1);
            this.field4777 = 1;
        }
        int var2 = 1 / ((arg0 - 41) / 59);
        ++field4576;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IZ)V")
    public final void method2025(int arg0, boolean arg1) {
        if (arg0 == -32) {
            ++field4687;
            if (this.field4751 != arg1) {
                this.field4751 = arg1;
                this.method2043(32884);
                this.field4777 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "GA", descriptor = "(IIII)V")
    public final void method471(int arg0, int arg1, int arg2, int arg3) {
        this.field4770 = arg1;
        this.field4822 = arg2;
        this.field4774 = arg3;
        this.field4758 = arg0;
        ++field4660;
        this.method1997((byte) 92);
        this.method2026(16);
        if (~this.field4759 == -4) {
            this.method2022(2);
        } else if (this.field4759 == 2) {
            this.method2031(5888);
        }
    }

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "(I)V")
    private final void method2026(int arg0) {
        if (arg0 != 16) {
            this.method1967((byte) -30);
        }
        ++field4673;
        this.field4847 = (float) (this.field4837 - this.field4770);
        this.field4780 = (float) (this.field4831 - this.field4758);
        this.field4830 = (float) (-this.field4770 + this.field4802);
        this.field4750 = (float) (-this.field4758 + this.field4798);
    }

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "()Lc;")
    public final class512 method541() {
        ++field4546;
        return this.field4722;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lks;Lks;FLks;)Lks;")
    public final class23 method465(class23 arg0, class23 arg1, float arg2, class23 arg3) {
        ++field4530;
        if (arg0 != null && arg1 != null && this.field4805 && this.field4773) {
            class323 var5 = null;
            class403 var6 = (class403) arg0;
            class403 var7 = (class403) arg1;
            class490 var8 = var6.method1915((byte) 106);
            class490 var9 = var7.method1915((byte) 101);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field7082 > ~var8.field7082 ? var8.field7082 : var9.field7082;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class323) {
                    class323 var11 = (class323) arg3;
                    if (var11.method1912(-124) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class323(this, var10);
                }
                if (var5.method1914(arg2, (byte) -120, var8, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "(B)V")
    private final void method2027(byte arg0) {
        if (this.field4792 && !this.field4776) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field4544;
        if (arg0 < 1) {
            this.method498();
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(ZI)V")
    public final void method2028(boolean arg0, int arg1) {
        if (arg1 != 5) {
            this.method502();
        }
        ++field4651;
        if (!this.field4776 == arg0) {
            this.field4776 = arg0;
            this.method2027((byte) 14);
        }
    }

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "(B)V")
    public final void method2029(byte arg0) {
        ++field4616;
        if (arg0 < 69) {
            method2044((byte) -10, -65, -52);
        }
        OpenGL.glLightfv(16384, 4611, this.field4768, 0);
        OpenGL.glLightfv(16385, 4611, this.field4852, 0);
    }

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "(B)V")
    public final void method2030(byte arg0) {
        ++field4630;
        if (this.field4777 != 8) {
            this.method1981(1);
            this.method2020(104, true);
            this.method2016(true, -34);
            this.method2025(-32, true);
            this.method2033(1, -1743);
            this.method1966(-1, 0);
            this.field4777 = 8;
        }
        if (arg0 < 52) {
            this.method520();
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final void method504(int arg0) {
        ++field4591;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field4717 = arg0;
            this.field4715.method1424(34842);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "(I)V")
    private final void method2031(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field4585;
        OpenGL.glLoadMatrixf(this.field4807, 0);
        OpenGL.glMatrixMode(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "(III[I)V")
    public final void method478(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4602;
        float var5 = (float) arg2 * this.field4851.field7473 + (float) arg0 * this.field4851.field7471 + (float) arg1 * this.field4851.field7498 + this.field4851.field7484;
        if (!((float) this.field4790 > var5) && !(var5 > (float) this.field4785)) {
            int var6 = (int) (((float) arg2 * this.field4851.field7481 + (float) arg0 * this.field4851.field7468 + (float) arg1 * this.field4851.field7469 + this.field4851.field7479) * (float) this.field4822 / var5);
            int var7 = (int) (((float) arg2 * this.field4851.field7477 + (float) arg0 * this.field4851.field7486 + (float) arg1 * this.field4851.field7487 + this.field4851.field7472) * (float) this.field4774 / var5);
            if (this.field4750 <= (float) var6 && this.field4780 >= (float) var6 && (float) var7 >= this.field4830 && this.field4847 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field4750);
                arg3[1] = (int) ((float) var7 - this.field4830);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(Z)V")
    public final void method2032(boolean arg0) {
        if (~this.field4777 != -3) {
            this.method1989((byte) 101);
            this.method2020(-30, false);
            this.method2036(30919, false);
            this.method2016(false, -57);
            this.method2025(-32, false);
            this.method1998(-2, (byte) -53);
            this.field4777 = 2;
        }
        ++field4670;
        if (arg0) {
            this.field4831 = -91;
        }
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(II)V")
    public final void method2033(int arg0, int arg1) {
        if (this.field4834 != arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg0 == 1) {
                var3 = 1;
                var4 = true;
                var5 = true;
            } else if (arg0 != 2) {
                if (arg0 == 128) {
                    var3 = 3;
                    var5 = true;
                    var4 = true;
                } else {
                    var3 = 0;
                    var5 = false;
                    var4 = true;
                }
            } else {
                var4 = true;
                var5 = false;
                var3 = 2;
            }
            if (!var4 != !this.field4791) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field4791 = var4;
            }
            if (this.field4772 != var5) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field4772 = var5;
            }
            if (~this.field4865 != ~var3) {
                if (var3 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var3 != 2) {
                    if (~var3 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field4865 = var3;
            }
            this.field4834 = arg0;
            this.field4777 &= -29;
        }
        ++field4597;
        if (arg1 != -1743) {
            this.method484(74);
        }
    }

    @OriginalMember(owner = "client!pg", name = "ra", descriptor = "(ILta;II)V")
    public final void method523(int arg0, class336 arg1, int arg2, int arg3) {
        ++field4599;
        class397 var5 = (class397) arg1;
        class241 var6 = var5.field5703;
        this.method2032(false);
        this.method1977(var5.field5703, true);
        this.method2033(1, -1743);
        this.method2023(7681, 8448, 2929);
        this.method2040(false, 0, 768, 34167);
        float var7 = var6.field3329 / (float) var6.field3326;
        float var8 = var6.field3325 / (float) var6.field3324;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field4798 - arg2) * var7, (float) (this.field4802 - arg3) * var8);
        OpenGL.glVertex2i(this.field4798, this.field4802);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4798) * var7, (float) (this.field4837 - arg3) * var8);
        OpenGL.glVertex2i(this.field4798, this.field4837);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4831) * var7, (float) (-arg3 + this.field4837) * var8);
        OpenGL.glVertex2i(this.field4831, this.field4837);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4831) * var7, (float) (-arg3 + this.field4802) * var8);
        OpenGL.glVertex2i(this.field4831, this.field4802);
        OpenGL.glEnd();
        this.method2040(false, 0, 768, 5890);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3) {
        ++field4598;
        if (!this.field4769) {
            throw new RuntimeException("");
        } else {
            this.field4786 = arg0;
            this.field4767 = arg3;
            this.field4760 = arg1;
            this.field4858 = arg2;
            this.field4716.field5151.method1622((byte) -61);
            this.method1996(false);
        }
    }

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "()I")
    public final int method470() {
        ++field4533;
        int var1 = this.field4871;
        this.field4871 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lau;Z)Lo;")
    public final class359 method555(class396 arg0, boolean arg1) {
        ++field4534;
        int[] var3 = new int[arg0.field5700 * arg0.field5696];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field5695 != null) {
            for (int var6 = 0; ~var6 > ~arg0.field5700; ++var6) {
                for (int var7 = 0; ~arg0.field5696 < ~var7; ++var7) {
                    var3[var5++] = class219.method1367(arg0.field5695[var4] << 24, arg0.field5693[class375.method2245(255, arg0.field5698[var4])]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~arg0.field5700 < ~var8; ++var8) {
                for (int var10 = 0; arg0.field5696 > var10; ++var10) {
                    int var11 = arg0.field5693[arg0.field5698[var4++] & 255];
                    var3[var5++] = ~var11 != -1 ? class219.method1367(-16777216, var11) : 0;
                }
            }
        }
        class359 var9 = this.method510(var3, 0, arg0.field5696, arg0.field5696, arg0.field5700);
        var9.method210(arg0.field5694, arg0.field5699, arg0.field5697, arg0.field5701);
        return var9;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4708;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLli;)V")
    public final void method2034(byte arg0, class386 arg1) {
        ++field4556;
        if (~this.field4733 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field4733 >= 0) {
                this.field4738[this.field4733].method400(13646);
            }
            this.field4732 = this.field4738[++this.field4733] = arg1;
            if (arg0 < 7) {
                this.field4685 = 35L;
            }
            this.field4732.method396(true);
        }
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(Z)V")
    private final void method2035(boolean arg0) {
        ++field4603;
        this.field4851 = new class511();
        this.field4801 = new class511();
        this.field4761 = new class128[this.field4826];
        if (arg0) {
            this.method532();
        }
        this.field4855 = new class142(this, 3553, 6408, 1, 1);
        new class142(this, 3553, 6408, 1, 1);
        new class142(this, 3553, 6408, 1, 1);
        this.field4829 = new class415(this);
        this.field4864 = new class415(this);
        this.field4782 = new class415(this);
        this.field4849 = new class415(this);
        this.field4784 = new class415(this);
        this.field4808 = new class415(this);
        this.field4836 = new class415(this);
        this.field4832 = new class415(this);
        this.field4828 = new class415(this);
        this.field4752 = new class415(this);
        if (this.field4773) {
            this.field4823 = new class60(this);
            new class60(this);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(II)V")
    public final void method512(int arg0, int arg1) {
        ++field4617;
        if (this.field4790 != arg0 || this.field4785 != arg1) {
            this.field4790 = arg0;
            this.field4785 = arg1;
            this.method1997((byte) 122);
            this.method1996(false);
            if (this.field4759 == 3) {
                this.method2022(2);
                return;
            }
            if (this.field4759 != 2) {
                return;
            }
            this.method2031(5888);
        }
    }

    @OriginalMember(owner = "client!pg", name = "HA", descriptor = "(IIII)V")
    public final void method515(int arg0, int arg1, int arg2, int arg3) {
        if (~arg3 > ~this.field4837) {
            this.field4837 = arg3;
        }
        if (~arg1 < ~this.field4802) {
            this.field4802 = arg1;
        }
        if (arg2 < this.field4831) {
            this.field4831 = arg2;
        }
        ++field4580;
        if (~this.field4798 > ~arg0) {
            this.field4798 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method2026(16);
        this.method2018((byte) 28);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IZ)V")
    public final void method2036(int arg0, boolean arg1) {
        ++field4566;
        if (arg1 == !this.field4792) {
            this.field4792 = arg1;
            this.method2027((byte) 16);
            this.field4777 &= -8;
        }
        if (arg0 != 30919) {
            this.field4855 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILsh;)V")
    public final void method2037(int arg0, class511 arg1) {
        OpenGL.glPushMatrix();
        ++field4645;
        if (arg0 == -8497) {
            OpenGL.glMultMatrixf(arg1.method3030(false), 0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "(I)V")
    public final void method2038(int arg0) {
        if (~this.field4759 != -1) {
            this.field4759 = 0;
            this.field4777 &= -32;
        }
        if (arg0 != -385881688) {
            this.field4768 = null;
        }
        ++field4574;
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(II)I")
    public final int method2039(int arg0, int arg1) {
        if (arg1 != 260) {
            return 84;
        } else {
            ++field4674;
            if (~arg0 != -2) {
                if (arg0 == 0) {
                    return 8448;
                } else if (~arg0 == -3) {
                    return 34165;
                } else if (~arg0 != -4) {
                    if (arg0 == 4) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 7681;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIII)V")
    public final void method2040(boolean arg0, int arg1, int arg2, int arg3) {
        ++field4671;
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg3);
        if (arg0) {
            this.method2000(108, (class337) null);
        }
        OpenGL.glTexEnvi(8960, 34192 - -arg1, arg2);
    }

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "()Z")
    public final boolean method557() {
        ++field4594;
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "()Z")
    public final boolean method561() {
        ++field4577;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()Z")
    public final boolean method550() {
        ++field4714;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public final void method521(boolean arg0) {
        ++field4528;
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "()V")
    public final void method516() {
        ++field4547;
        if (this.field4842 && this.field4700 > 0 && ~this.field4613 < -1) {
            int var1 = this.field4798;
            int var2 = this.field4831;
            int var3 = this.field4802;
            int var4 = this.field4837;
            this.method477();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2038(-385881688);
            this.method2020(101, false);
            this.method2036(30919, false);
            this.method2016(false, -121);
            this.method2025(-32, false);
            this.method1977((class128) null, true);
            this.method1998(-2, (byte) -53);
            this.method1966(-1, 1);
            this.method2033(0, -1743);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4700, this.field4613, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method511(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "(I)V")
    public final void method2041(int arg0) {
        ++field4646;
        OpenGL.glPushMatrix();
        if (arg0 != 1) {
            this.field4762 = -4;
        }
    }

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "(I)V")
    private final void method2042(int arg0) {
        ++field4561;
        if (this.field4813 && this.field4769 | ~this.field4795 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 2912) {
            this.field4742 = -91;
        }
    }

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "(I)V")
    private final void method2043(int arg0) {
        OpenGL.glDepthMask(this.field4751 && this.field4755);
        ++field4532;
        if (arg0 != 32884) {
            this.field4763 = -1.7434504F;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILor;)V")
    public class333(int arg0, Canvas arg1, class127 arg2, int arg3, class173 arg4) {
        super(arg0, arg2);
        new class531();
        new class270(16);
        this.field4741 = new class530();
        this.field4743 = new class530();
        this.field4744 = new class530();
        this.field4745 = new class530();
        this.field4746 = new class530();
        this.field4747 = new class530();
        this.field4748 = new class530();
        this.field4779 = new class447[class151.field2323];
        this.field4758 = 0;
        this.field4764 = -1.0F;
        this.field4753 = 0;
        this.field4785 = 3584;
        this.field4802 = 0;
        this.field4774 = 512;
        this.field4790 = 50;
        this.field4812 = 8448;
        this.field4763 = -1.0F;
        this.field4798 = 0;
        this.field4831 = 0;
        this.field4807 = new float[16];
        this.field4827 = 1.0F;
        this.field4833 = 0.0F;
        this.field4770 = 0;
        this.field4755 = true;
        this.field4838 = 0;
        this.field4839 = 3584.0F;
        this.field4821 = 8448;
        this.field4787 = 1.0F;
        this.field4837 = 0;
        this.field4795 = -1;
        this.field4835 = -1;
        this.field4749 = new float[4];
        this.field4767 = 0;
        this.field4844 = 3584.0F;
        this.field4853 = -1;
        this.field4852 = new float[4];
        this.field4814 = 0;
        this.field4863 = new float[4];
        this.field4820 = 1.0F;
        this.field4760 = -1;
        this.field4859 = 1.0F;
        this.field4845 = 1.0F;
        this.field4856 = 3000.0F;
        this.field4822 = 512;
        this.field4768 = new float[4];
        this.field4858 = -1;
        this.field4789 = new class504(8192);
        this.field4867 = new int[1];
        this.field4870 = new int[1];
        this.field4872 = new int[1];
        this.field4869 = new byte[16384];
        this.field4719 = arg3;
        this.field4581 = this.field4625 = arg1;
        try {
            if (class210.field3003 == null || !class210.field3003) {
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
                            System.load(arg4.method1198("jaggl.dll", 17464).toString());
                        } else {
                            System.load(arg4.method1198("libjaggl.jnilib", 17464).toString());
                        }
                    } else {
                        System.load(arg4.method1198("libjaggl.so", 17464).toString());
                    }
                    class210.field3003 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class210.field3003 = Boolean.TRUE;
                }
            }
            if (class210.field3003 != null && class210.field3003) {
                this.field4657 = new OpenGL();
                this.field4638 = this.field4685 = this.field4657.init(arg1, 8, 8, 8, 24, 0, this.field4719);
                if (this.field4685 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2011((byte) -105);
                    int var7 = this.method1974((byte) 93);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field4825 = !this.field4796 ? 5121 : 33639;
                        if (~this.field4757.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class139.method982(' ', (byte) 10, this.field4757.replace('/', ' '));
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (~var13.charAt(0) == -121 && var13.length() >= 3 && class458.method2674(var13.substring(1, 3), -86)) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (var13.length() >= 4 && class458.method2674(var13.substring(0, 4), -111)) {
                                                var8 = class410.method2405(21, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field4765 = false;
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && ~var8 >= -9251) {
                                    this.field4799 = false;
                                }
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field4804 = false;
                                }
                            }
                            this.field4803 &= this.field4657.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field4766 = this.field4804;
                            this.field4783 = true;
                        }
                        if (this.field4866.indexOf("intel") != -1) {
                            this.field4773 = false;
                        }
                        this.field4842 = !this.field4866.equals("s3 graphics");
                        if (this.field4804) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class482.method2863(0, true, false);
                        this.field4725 = true;
                        this.field4715 = new class233(this, super.field3988);
                        this.method2035(false);
                        this.field4726 = new class143(this);
                        this.field4720 = new class164(this);
                        if (this.field4720.method1145(false)) {
                            this.field4718 = new class81(this);
                            if (!this.field4718.method629((byte) 23)) {
                                this.field4718.method621(1);
                                this.field4718 = null;
                            }
                        }
                        this.field4716 = new class358(this);
                        this.method2008(-11425);
                        this.method1965(123);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field4657.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class334.method2047(100L, 0);
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
            this.method560();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lks;)V")
    public final void method480(class23 arg0) {
        ++field4609;
        this.field4860 = (class403) arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIF)Lsa;")
    public final class447 method518(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4550;
        return new class72(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BII)V")
    public static final void method2044(byte arg0, int arg1, int arg2) {
        ++field4626;
        class314 var3 = class177.method1213(false, 7, arg2);
        if (arg0 != -48) {
            field4649 = null;
        }
        var3.method1808(-7412);
        var3.field4253 = arg1;
    }

    static {
        new class157("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field4649 = new int[4096];
    }
}
