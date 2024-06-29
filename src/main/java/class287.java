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

@OriginalClass("client!uca")
public class class287 extends class98 {

    @OriginalMember(owner = "client!uca", name = "Rb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3893 = new Hashtable();

    @OriginalMember(owner = "client!uca", name = "je", descriptor = "I")
    public int field4015 = 128;

    @OriginalMember(owner = "client!uca", name = "Wd", descriptor = "Ldt;")
    private class573 field4002 = new class573();

    @OriginalMember(owner = "client!uca", name = "ke", descriptor = "Lbb;")
    private class196 field4016 = new class196();

    @OriginalMember(owner = "client!uca", name = "le", descriptor = "Lbb;")
    public class196 field4017 = new class196();

    @OriginalMember(owner = "client!uca", name = "ne", descriptor = "I")
    public int field4019 = 3;

    @OriginalMember(owner = "client!uca", name = "qe", descriptor = "I")
    public int field4022 = 8;

    @OriginalMember(owner = "client!uca", name = "se", descriptor = "Z")
    private boolean field4024 = false;

    @OriginalMember(owner = "client!uca", name = "re", descriptor = "Ldc;")
    private class302 field4023 = new class302();

    @OriginalMember(owner = "client!uca", name = "te", descriptor = "I")
    private int field4025 = -1;

    @OriginalMember(owner = "client!uca", name = "xe", descriptor = "I")
    private int field4029 = -1;

    @OriginalMember(owner = "client!uca", name = "Ae", descriptor = "[Ltr;")
    private class114[] field4032 = new class114[4];

    @OriginalMember(owner = "client!uca", name = "ze", descriptor = "[Ltr;")
    private class114[] field4031 = new class114[4];

    @OriginalMember(owner = "client!uca", name = "Ce", descriptor = "[Ltr;")
    private class114[] field4034 = new class114[4];

    @OriginalMember(owner = "client!uca", name = "De", descriptor = "I")
    private int field4035 = -1;

    @OriginalMember(owner = "client!uca", name = "ve", descriptor = "Loga;")
    private class158 field4027 = new class158();

    @OriginalMember(owner = "client!uca", name = "Ee", descriptor = "Lefa;")
    private class322 field4036 = new class322(16);

    @OriginalMember(owner = "client!uca", name = "Fe", descriptor = "Ldc;")
    private class302 field4037 = new class302();

    @OriginalMember(owner = "client!uca", name = "Ke", descriptor = "Ldc;")
    private class302 field4042 = new class302();

    @OriginalMember(owner = "client!uca", name = "Le", descriptor = "Ldc;")
    private class302 field4043 = new class302();

    @OriginalMember(owner = "client!uca", name = "Me", descriptor = "Ldc;")
    private class302 field4044 = new class302();

    @OriginalMember(owner = "client!uca", name = "Ne", descriptor = "Ldc;")
    private class302 field4045 = new class302();

    @OriginalMember(owner = "client!uca", name = "Oe", descriptor = "Ldc;")
    private class302 field4046 = new class302();

    @OriginalMember(owner = "client!uca", name = "Pe", descriptor = "Ldc;")
    private class302 field4047 = new class302();

    @OriginalMember(owner = "client!uca", name = "Ue", descriptor = "Lbb;")
    public class196 field4052 = new class196();

    @OriginalMember(owner = "client!uca", name = "Ze", descriptor = "Lbb;")
    public class196 field4057 = new class196();

    @OriginalMember(owner = "client!uca", name = "af", descriptor = "Lbb;")
    public class196 field4058 = new class196();

    @OriginalMember(owner = "client!uca", name = "kf", descriptor = "I")
    public int field4067 = 0;

    @OriginalMember(owner = "client!uca", name = "ff", descriptor = "F")
    private float field4063 = -1.0F;

    @OriginalMember(owner = "client!uca", name = "nf", descriptor = "F")
    private float field4070 = -1.0F;

    @OriginalMember(owner = "client!uca", name = "pf", descriptor = "F")
    public float field4072 = 1.0F;

    @OriginalMember(owner = "client!uca", name = "Uf", descriptor = "F")
    public float field4103 = 3584.0F;

    @OriginalMember(owner = "client!uca", name = "Ff", descriptor = "F")
    public float field4088 = 1.0F;

    @OriginalMember(owner = "client!uca", name = "df", descriptor = "F")
    public float field4061 = 1.0F;

    @OriginalMember(owner = "client!uca", name = "If", descriptor = "[F")
    private float[] field4091 = new float[16];

    @OriginalMember(owner = "client!uca", name = "bg", descriptor = "I")
    private int field4110 = 0;

    @OriginalMember(owner = "client!uca", name = "bf", descriptor = "I")
    public int field4059 = 512;

    @OriginalMember(owner = "client!uca", name = "lg", descriptor = "[F")
    private float[] field4120 = new float[4];

    @OriginalMember(owner = "client!uca", name = "Wf", descriptor = "F")
    private float field4105 = 1.0F;

    @OriginalMember(owner = "client!uca", name = "lf", descriptor = "I")
    public int field4068 = -1;

    @OriginalMember(owner = "client!uca", name = "tg", descriptor = "Z")
    private boolean field4128 = false;

    @OriginalMember(owner = "client!uca", name = "ug", descriptor = "I")
    public int field4129 = 0;

    @OriginalMember(owner = "client!uca", name = "Kf", descriptor = "I")
    private int field4093 = 0;

    @OriginalMember(owner = "client!uca", name = "wg", descriptor = "[Ltg;")
    private class334[] field4131 = new class334[class508.field7176];

    @OriginalMember(owner = "client!uca", name = "Rf", descriptor = "I")
    private int field4100 = 0;

    @OriginalMember(owner = "client!uca", name = "Df", descriptor = "F")
    private float field4086 = 0.0F;

    @OriginalMember(owner = "client!uca", name = "qg", descriptor = "F")
    public float field4125 = -1.0F;

    @OriginalMember(owner = "client!uca", name = "sg", descriptor = "I")
    private int field4127 = 3584;

    @OriginalMember(owner = "client!uca", name = "jg", descriptor = "I")
    private int field4118 = -1;

    @OriginalMember(owner = "client!uca", name = "Zf", descriptor = "F")
    public float field4108 = -1.0F;

    @OriginalMember(owner = "client!uca", name = "Af", descriptor = "I")
    public int field4083 = -1;

    @OriginalMember(owner = "client!uca", name = "xf", descriptor = "I")
    public int field4080 = 50;

    @OriginalMember(owner = "client!uca", name = "ig", descriptor = "I")
    private int field4117 = 8448;

    @OriginalMember(owner = "client!uca", name = "Bg", descriptor = "I")
    private int field4136 = 0;

    @OriginalMember(owner = "client!uca", name = "Ag", descriptor = "F")
    private float field4135 = 1.0F;

    @OriginalMember(owner = "client!uca", name = "Lf", descriptor = "I")
    public int field4094 = 0;

    @OriginalMember(owner = "client!uca", name = "wf", descriptor = "[F")
    private float[] field4079 = new float[4];

    @OriginalMember(owner = "client!uca", name = "Mg", descriptor = "I")
    public int field4147 = -1;

    @OriginalMember(owner = "client!uca", name = "Rg", descriptor = "I")
    private int field4152 = 0;

    @OriginalMember(owner = "client!uca", name = "Ng", descriptor = "I")
    private int field4148 = 0;

    @OriginalMember(owner = "client!uca", name = "Og", descriptor = "[F")
    public float[] field4149 = new float[4];

    @OriginalMember(owner = "client!uca", name = "Ug", descriptor = "Z")
    private boolean field4155 = true;

    @OriginalMember(owner = "client!uca", name = "ch", descriptor = "I")
    public int field4163 = -1;

    @OriginalMember(owner = "client!uca", name = "Wg", descriptor = "I")
    private int field4157 = 8448;

    @OriginalMember(owner = "client!uca", name = "uf", descriptor = "F")
    public float field4077 = 3584.0F;

    @OriginalMember(owner = "client!uca", name = "ah", descriptor = "I")
    public int field4161 = 512;

    @OriginalMember(owner = "client!uca", name = "Tg", descriptor = "I")
    public int field4154 = 0;

    @OriginalMember(owner = "client!uca", name = "fh", descriptor = "[F")
    private float[] field4166 = new float[4];

    @OriginalMember(owner = "client!uca", name = "qf", descriptor = "Lbca;")
    public class449 field4073 = new class449(8192);

    @OriginalMember(owner = "client!uca", name = "ih", descriptor = "[I")
    public int[] field4169 = new int[1];

    @OriginalMember(owner = "client!uca", name = "jh", descriptor = "[I")
    public int[] field4170 = new int[1];

    @OriginalMember(owner = "client!uca", name = "mh", descriptor = "[I")
    public int[] field4173 = new int[1];

    @OriginalMember(owner = "client!uca", name = "kh", descriptor = "[B")
    public byte[] field4171 = new byte[16384];

    @OriginalMember(owner = "client!uca", name = "ae", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!uca", name = "Lc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3939;

    @OriginalMember(owner = "client!uca", name = "vb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3871;

    @OriginalMember(owner = "client!uca", name = "yb", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field3874;

    @OriginalMember(owner = "client!uca", name = "pb", descriptor = "J")
    private long field3865;

    @OriginalMember(owner = "client!uca", name = "Ob", descriptor = "J")
    private long field3890;

    @OriginalMember(owner = "client!uca", name = "cf", descriptor = "Z")
    public boolean field4060;

    @OriginalMember(owner = "client!uca", name = "mf", descriptor = "I")
    public int field4069;

    @OriginalMember(owner = "client!uca", name = "Hg", descriptor = "Ljava/lang/String;")
    private String field4142;

    @OriginalMember(owner = "client!uca", name = "hh", descriptor = "Z")
    public boolean field4168;

    @OriginalMember(owner = "client!uca", name = "yg", descriptor = "Z")
    private boolean field4133;

    @OriginalMember(owner = "client!uca", name = "Xf", descriptor = "Z")
    public boolean field4106;

    @OriginalMember(owner = "client!uca", name = "xg", descriptor = "Z")
    public boolean field4132;

    @OriginalMember(owner = "client!uca", name = "dh", descriptor = "Z")
    public boolean field4164;

    @OriginalMember(owner = "client!uca", name = "Sg", descriptor = "Z")
    private boolean field4153;

    @OriginalMember(owner = "client!uca", name = "yf", descriptor = "Ljava/lang/String;")
    private String field4081;

    @OriginalMember(owner = "client!uca", name = "ef", descriptor = "Z")
    public boolean field4062;

    @OriginalMember(owner = "client!uca", name = "og", descriptor = "Z")
    private boolean field4123;

    @OriginalMember(owner = "client!uca", name = "Vd", descriptor = "Ltfa;")
    private class610 field4001;

    @OriginalMember(owner = "client!uca", name = "pe", descriptor = "Ljn;")
    public class117 field4021;

    @OriginalMember(owner = "client!uca", name = "ge", descriptor = "Loa;")
    private class43 field4012;

    @OriginalMember(owner = "client!uca", name = "ce", descriptor = "Lki;")
    private class362 field4008;

    @OriginalMember(owner = "client!uca", name = "ie", descriptor = "Lrga;")
    private class58 field4014;

    @OriginalMember(owner = "client!uca", name = "tb", descriptor = "Liba;")
    public static class211 field3869 = new class211(2, 3);

    @OriginalMember(owner = "client!uca", name = "Ed", descriptor = "Lrf;")
    public static class157 field3984 = new class157();

    @OriginalMember(owner = "client!uca", name = "Cf", descriptor = "F")
    public float field4085;

    @OriginalMember(owner = "client!uca", name = "Jf", descriptor = "F")
    public float field4092;

    @OriginalMember(owner = "client!uca", name = "eg", descriptor = "F")
    private float field4113;

    @OriginalMember(owner = "client!uca", name = "gg", descriptor = "F")
    private float field4115;

    @OriginalMember(owner = "client!uca", name = "mg", descriptor = "F")
    public float field4121;

    @OriginalMember(owner = "client!uca", name = "Lg", descriptor = "F")
    public float field4146;

    @OriginalMember(owner = "client!uca", name = "Qg", descriptor = "F")
    public float field4151;

    @OriginalMember(owner = "client!uca", name = "Xg", descriptor = "F")
    public float field4158;

    @OriginalMember(owner = "client!uca", name = "Yg", descriptor = "F")
    private float field4159;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!uca", name = "B", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!uca", name = "C", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!uca", name = "D", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!uca", name = "E", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!uca", name = "F", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!uca", name = "G", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!uca", name = "H", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!uca", name = "I", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!uca", name = "K", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!uca", name = "M", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!uca", name = "N", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!uca", name = "O", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!uca", name = "P", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!uca", name = "Q", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!uca", name = "R", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!uca", name = "S", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!uca", name = "T", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!uca", name = "U", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!uca", name = "V", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!uca", name = "W", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!uca", name = "X", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!uca", name = "Y", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!uca", name = "Z", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!uca", name = "ab", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!uca", name = "bb", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!uca", name = "cb", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!uca", name = "db", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!uca", name = "eb", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!uca", name = "fb", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!uca", name = "gb", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!uca", name = "hb", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!uca", name = "ib", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!uca", name = "jb", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!uca", name = "kb", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!uca", name = "lb", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!uca", name = "mb", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!uca", name = "nb", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!uca", name = "ob", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!uca", name = "qb", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!uca", name = "rb", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!uca", name = "sb", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!uca", name = "ub", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!uca", name = "wb", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!uca", name = "xb", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!uca", name = "zb", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!uca", name = "Ab", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!uca", name = "Bb", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!uca", name = "Cb", descriptor = "I")
    private int field3878;

    @OriginalMember(owner = "client!uca", name = "Db", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!uca", name = "Eb", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!uca", name = "Fb", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!uca", name = "Gb", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!uca", name = "Hb", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!uca", name = "Ib", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!uca", name = "Jb", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!uca", name = "Kb", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!uca", name = "Lb", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!uca", name = "Mb", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!uca", name = "Nb", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!uca", name = "Pb", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!uca", name = "Qb", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!uca", name = "Sb", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!uca", name = "Tb", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!uca", name = "Ub", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!uca", name = "Vb", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!uca", name = "Wb", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!uca", name = "Xb", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!uca", name = "Yb", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!uca", name = "Zb", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!uca", name = "ac", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!uca", name = "bc", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!uca", name = "cc", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!uca", name = "dc", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!uca", name = "ec", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!uca", name = "fc", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!uca", name = "gc", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!uca", name = "hc", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!uca", name = "ic", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!uca", name = "jc", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!uca", name = "kc", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!uca", name = "lc", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!uca", name = "mc", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!uca", name = "nc", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!uca", name = "oc", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!uca", name = "pc", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!uca", name = "qc", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!uca", name = "rc", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!uca", name = "sc", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!uca", name = "tc", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!uca", name = "uc", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!uca", name = "vc", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!uca", name = "wc", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!uca", name = "xc", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!uca", name = "yc", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!uca", name = "zc", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!uca", name = "Ac", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!uca", name = "Bc", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!uca", name = "Cc", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!uca", name = "Dc", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!uca", name = "Ec", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!uca", name = "Fc", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!uca", name = "Gc", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!uca", name = "Hc", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!uca", name = "Ic", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!uca", name = "Jc", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!uca", name = "Kc", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!uca", name = "Mc", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!uca", name = "Nc", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!uca", name = "Oc", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!uca", name = "Pc", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!uca", name = "Qc", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!uca", name = "Rc", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!uca", name = "Sc", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!uca", name = "Tc", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!uca", name = "Uc", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!uca", name = "Vc", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!uca", name = "Wc", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!uca", name = "Xc", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!uca", name = "Yc", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!uca", name = "Zc", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!uca", name = "ad", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!uca", name = "bd", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!uca", name = "cd", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!uca", name = "dd", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!uca", name = "ed", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!uca", name = "fd", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!uca", name = "gd", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!uca", name = "hd", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!uca", name = "id", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!uca", name = "jd", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!uca", name = "kd", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!uca", name = "ld", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!uca", name = "md", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!uca", name = "nd", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!uca", name = "od", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!uca", name = "pd", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!uca", name = "qd", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!uca", name = "rd", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!uca", name = "sd", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!uca", name = "td", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!uca", name = "ud", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!uca", name = "vd", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!uca", name = "wd", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!uca", name = "xd", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!uca", name = "yd", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!uca", name = "zd", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!uca", name = "Ad", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!uca", name = "Bd", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!uca", name = "Cd", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!uca", name = "Dd", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!uca", name = "Fd", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!uca", name = "Gd", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!uca", name = "Hd", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!uca", name = "Id", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!uca", name = "Jd", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!uca", name = "Kd", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!uca", name = "Ld", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!uca", name = "Md", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!uca", name = "Nd", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!uca", name = "Od", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!uca", name = "Pd", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!uca", name = "Qd", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!uca", name = "Rd", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!uca", name = "Sd", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!uca", name = "Td", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!uca", name = "Ud", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!uca", name = "Xd", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!uca", name = "Yd", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!uca", name = "Zd", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!uca", name = "be", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!uca", name = "de", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!uca", name = "ee", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!uca", name = "fe", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!uca", name = "he", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!uca", name = "oe", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!uca", name = "Ge", descriptor = "I")
    public int field4038;

    @OriginalMember(owner = "client!uca", name = "He", descriptor = "I")
    private int field4039;

    @OriginalMember(owner = "client!uca", name = "Ie", descriptor = "I")
    public int field4040;

    @OriginalMember(owner = "client!uca", name = "Je", descriptor = "I")
    private int field4041;

    @OriginalMember(owner = "client!uca", name = "Qe", descriptor = "I")
    private int field4048;

    @OriginalMember(owner = "client!uca", name = "Re", descriptor = "I")
    private int field4049;

    @OriginalMember(owner = "client!uca", name = "Te", descriptor = "I")
    private int field4051;

    @OriginalMember(owner = "client!uca", name = "gf", descriptor = "I")
    private int field4064;

    @OriginalMember(owner = "client!uca", name = "jf", descriptor = "I")
    private int field4066;

    @OriginalMember(owner = "client!uca", name = "Ef", descriptor = "I")
    private int field4087;

    @OriginalMember(owner = "client!uca", name = "Of", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!uca", name = "ag", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!uca", name = "dg", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!uca", name = "ng", descriptor = "I")
    private int field4122;

    @OriginalMember(owner = "client!uca", name = "Gg", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!uca", name = "Ig", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!uca", name = "Pg", descriptor = "I")
    private int field4150;

    @OriginalMember(owner = "client!uca", name = "Zg", descriptor = "I")
    private int field4160;

    @OriginalMember(owner = "client!uca", name = "bh", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!uca", name = "lh", descriptor = "I")
    private int field4172;

    @OriginalMember(owner = "client!uca", name = "nh", descriptor = "I")
    private int field4174;

    @OriginalMember(owner = "client!uca", name = "Xe", descriptor = "J")
    private long field4055;

    @OriginalMember(owner = "client!uca", name = "we", descriptor = "Ltr;")
    private class114 field4028;

    @OriginalMember(owner = "client!uca", name = "ye", descriptor = "Ltr;")
    private class114 field4030;

    @OriginalMember(owner = "client!uca", name = "eh", descriptor = "Laaa;")
    public class227 field4165;

    @OriginalMember(owner = "client!uca", name = "sf", descriptor = "Lre;")
    private class290 field4075;

    @OriginalMember(owner = "client!uca", name = "tf", descriptor = "Ltda;")
    public class340 field4076;

    @OriginalMember(owner = "client!uca", name = "vf", descriptor = "Ltda;")
    public class340 field4078;

    @OriginalMember(owner = "client!uca", name = "Bf", descriptor = "Ltda;")
    public class340 field4084;

    @OriginalMember(owner = "client!uca", name = "Gf", descriptor = "Ltda;")
    public class340 field4089;

    @OriginalMember(owner = "client!uca", name = "Nf", descriptor = "Ltda;")
    public class340 field4096;

    @OriginalMember(owner = "client!uca", name = "Vf", descriptor = "Ltda;")
    public class340 field4104;

    @OriginalMember(owner = "client!uca", name = "Yf", descriptor = "Ltda;")
    public class340 field4107;

    @OriginalMember(owner = "client!uca", name = "hg", descriptor = "Ltda;")
    public class340 field4116;

    @OriginalMember(owner = "client!uca", name = "kg", descriptor = "Ltda;")
    public class340 field4119;

    @OriginalMember(owner = "client!uca", name = "Eg", descriptor = "Ltda;")
    public class340 field4139;

    @OriginalMember(owner = "client!uca", name = "zf", descriptor = "Lgv;")
    public class39 field4082;

    @OriginalMember(owner = "client!uca", name = "pg", descriptor = "Lgv;")
    public class39 field4124;

    @OriginalMember(owner = "client!uca", name = "ue", descriptor = "Lmp;")
    private class503 field4026;

    @OriginalMember(owner = "client!uca", name = "fg", descriptor = "Lei;")
    private class506 field4114;

    @OriginalMember(owner = "client!uca", name = "Sf", descriptor = "Lfba;")
    private class558 field4101;

    @OriginalMember(owner = "client!uca", name = "Cg", descriptor = "Lfba;")
    private class558 field4137;

    @OriginalMember(owner = "client!uca", name = "Be", descriptor = "Lffa;")
    private class559 field4033;

    @OriginalMember(owner = "client!uca", name = "vg", descriptor = "Lffa;")
    public class559 field4130;

    @OriginalMember(owner = "client!uca", name = "zg", descriptor = "Lfw;")
    private class636 field4134;

    @OriginalMember(owner = "client!uca", name = "me", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4018;

    @OriginalMember(owner = "client!uca", name = "Se", descriptor = "Z")
    private boolean field4050;

    @OriginalMember(owner = "client!uca", name = "Ve", descriptor = "Z")
    private boolean field4053;

    @OriginalMember(owner = "client!uca", name = "We", descriptor = "Z")
    private boolean field4054;

    @OriginalMember(owner = "client!uca", name = "Ye", descriptor = "Z")
    private boolean field4056;

    @OriginalMember(owner = "client!uca", name = "hf", descriptor = "Z")
    private boolean field4065;

    @OriginalMember(owner = "client!uca", name = "of", descriptor = "Z")
    public boolean field4071;

    @OriginalMember(owner = "client!uca", name = "rf", descriptor = "Z")
    public boolean field4074;

    @OriginalMember(owner = "client!uca", name = "Hf", descriptor = "Z")
    public boolean field4090;

    @OriginalMember(owner = "client!uca", name = "Mf", descriptor = "Z")
    private boolean field4095;

    @OriginalMember(owner = "client!uca", name = "Pf", descriptor = "Z")
    public boolean field4098;

    @OriginalMember(owner = "client!uca", name = "Qf", descriptor = "Z")
    public boolean field4099;

    @OriginalMember(owner = "client!uca", name = "Tf", descriptor = "Z")
    private boolean field4102;

    @OriginalMember(owner = "client!uca", name = "cg", descriptor = "Z")
    private boolean field4111;

    @OriginalMember(owner = "client!uca", name = "rg", descriptor = "Z")
    private boolean field4126;

    @OriginalMember(owner = "client!uca", name = "Dg", descriptor = "Z")
    public boolean field4138;

    @OriginalMember(owner = "client!uca", name = "Fg", descriptor = "Z")
    public boolean field4140;

    @OriginalMember(owner = "client!uca", name = "Jg", descriptor = "Z")
    public boolean field4144;

    @OriginalMember(owner = "client!uca", name = "Kg", descriptor = "Z")
    private boolean field4145;

    @OriginalMember(owner = "client!uca", name = "Vg", descriptor = "Z")
    private boolean field4156;

    @OriginalMember(owner = "client!uca", name = "gh", descriptor = "[Lvaa;")
    private class517[] field4167;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V", line = 3)
    public final synchronized void method1688(int arg0, int arg1, int arg2) {
        ++field3925;
        if (arg1 != 1) {
            this.method718(-104, -24, 23);
        }
        class258 var4 = new class258(arg0);
        var4.field5740 = (long) arg2;
        this.field4042.method1909(var4, (byte) -81);
    }

    @OriginalMember(owner = "client!uca", name = "XA", descriptor = "(IIIII)V", line = 17)
    public final void method691(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1728(1);
        ++field3848;
        this.method1721(-121, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)Le;", line = 37)
    public final class698 method622(int arg0) {
        ++field3932;
        class59 var2 = new class59(arg0);
        this.field4023.method1909(var2, (byte) -81);
        return var2;
    }

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "()V", line = 49)
    public final void method655() throws class232 {
        try {
            this.field3874.swapBuffers();
        } catch (Exception var1) {
        }
        ++field3837;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIILua;II)V", line = 67)
    public final void method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        ++field3897;
        class20 var10 = (class20) arg6;
        class506 var11 = var10.field382;
        this.method1748(2);
        this.method1709((byte) -79, var10.field382);
        this.method1721(-128, arg5);
        this.method1701(7681, 1, 8448);
        this.method1755(34167, 34176, 768, 0);
        float var12 = var11.field7159 / (float) var11.field7156;
        float var13 = var11.field7154 / (float) var11.field7160;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method1755(5890, 34176, 768, 0);
    }

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "(I)V", line = 105)
    private final void method1689(int arg0) {
        this.field4167 = new class517[this.field4162];
        ++field3987;
        this.field4165 = new class227(this, 3553, 6408, 1, 1);
        new class227(this, 3553, 6408, 1, 1);
        new class227(this, 3553, 6408, 1, 1);
        this.field4096 = new class340(this);
        if (arg0 != -4) {
            this.field4156 = true;
        }
        this.field4139 = new class340(this);
        this.field4107 = new class340(this);
        this.field4076 = new class340(this);
        this.field4116 = new class340(this);
        this.field4104 = new class340(this);
        this.field4089 = new class340(this);
        this.field4078 = new class340(this);
        this.field4119 = new class340(this);
        this.field4084 = new class340(this);
        if (this.field4062) {
            this.field4130 = new class559(this);
            new class559(this);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILjava/lang/String;Lua;Lfo;ILla;Lps;IIII)V", line = 144)
    public static final void method1690(int arg0, int arg1, String arg2, class591 arg3, class606 arg4, int arg5, class393 arg6, class5 arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3965;
        int var12;
        if (class684.field9659 == 4) {
            var12 = 16383 & (int) class311.field4589;
        } else {
            var12 = (int) class311.field4589 - -class53.field817 & 16383;
        }
        int var13 = Math.max(arg7.field202 / 2, arg7.field76 / 2) + 10;
        int var14 = arg10 * arg10 - -(arg0 * arg0);
        if (~(var13 * var13) <= ~var14) {
            int var15 = class271.field3549[var12];
            int var16 = class271.field3544[var12];
            if (class684.field9659 != 4) {
                var16 = var16 * 256 / (class697.field9826 + 256);
                var15 = var15 * 256 / (class697.field9826 + 256);
            }
            int var17 = arg0 * var15 - -(arg10 * var16) >> 14;
            int var18 = arg0 * var16 - arg10 * var15 >> 14;
            int var19 = arg4.method3460((class256[]) null, true, 100, arg2);
            int var20 = var17 - var19 / 2;
            if (arg11 >= -23) {
                method1726(24, 91);
            }
            int var21 = arg4.method3452(0, (byte) -120, 100, (class256[]) null, arg2);
            if (-arg7.field202 <= var20 && ~arg7.field202 <= ~var20 && -arg7.field76 <= var18 && ~arg7.field76 <= ~var18) {
                arg6.method2435((class256[]) null, (int[]) null, arg2, 0, var19, arg9 + var20 - -(arg7.field202 / 2), 50, arg8, arg7.field76 / 2 - var18 + arg1 - var21 + -arg5, 1, arg9, 0, 0, arg3, 0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(FZ)V", line = 198)
    public final void method1691(float arg0, boolean arg1) {
        if (!arg1) {
            this.field4162 = -54;
        }
        ++field3842;
        if (this.field4135 != arg0) {
            this.field4135 = arg0;
            if (this.field4087 == 3) {
                this.method1723((byte) -115);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILtr;)V", line = 217)
    public final void method1692(int arg0, class114 arg1) {
        ++field3818;
        if (~this.field4029 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field4029 <= arg0) {
                this.field4032[this.field4029].method852(arg0 ^ 5365);
            }
            this.field4028 = this.field4032[++this.field4029] = arg1;
            this.field4028.method851((byte) 88);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZZ)V", line = 232)
    public final void method1693(boolean arg0, boolean arg1) {
        if (!arg0 != !this.field4053) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field4053 = arg0;
            this.field4049 &= -32;
        }
        ++field3910;
        if (arg1) {
            this.method1699((class114) null, -50);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BZ)V", line = 254)
    public final void method1694(byte arg0, boolean arg1) {
        if (arg0 > 75) {
            ++field3933;
            if (!arg1 != !this.field4050) {
                this.field4050 = arg1;
                this.method1713(32902);
                this.field4049 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ltr;I)V", line = 272)
    public final void method1695(class114 arg0, int arg1) {
        if (arg1 == 255) {
            ++field3872;
            if (!this.field4098) {
                if (~this.field4025 <= -1 && this.field4031[this.field4025] == arg0) {
                    this.field4031[this.field4025--] = null;
                    arg0.method849(109);
                    if (this.field4025 < 0) {
                        this.field4028 = this.field4030 = null;
                    } else {
                        this.field4028 = this.field4030 = this.field4031[this.field4025];
                        this.field4028.method848((byte) 7);
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.method1699(arg0, 3);
                this.method1725(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "()Z", line = 311)
    public final boolean method624() {
        ++field3859;
        return false;
    }

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "()Z", line = 320)
    public final boolean method674() {
        ++field3839;
        return this.field4008 != null && (this.field4006 <= 1 || this.field4095);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Le;)V", line = 328)
    public final void method648(class698 arg0) {
        ++field3875;
        this.field4018 = ((class59) arg0).field955;
        if (this.field4101 == null) {
            class449 var2 = new class449(80);
            if (this.field4060) {
                var2.method2651(874114616, -1.0F);
                var2.method2651(874114616, -1.0F);
                var2.method2651(874114616, 0.0F);
                var2.method2651(874114616, 0.0F);
                var2.method2651(874114616, 1.0F);
                var2.method2651(874114616, 1.0F);
                var2.method2651(874114616, -1.0F);
                var2.method2651(874114616, 0.0F);
                var2.method2651(874114616, 1.0F);
                var2.method2651(874114616, 1.0F);
                var2.method2651(874114616, 1.0F);
                var2.method2651(874114616, 1.0F);
                var2.method2651(874114616, 0.0F);
                var2.method2651(874114616, 1.0F);
                var2.method2651(874114616, 0.0F);
                var2.method2651(874114616, -1.0F);
                var2.method2651(874114616, 1.0F);
                var2.method2651(874114616, 0.0F);
                var2.method2651(874114616, 0.0F);
                var2.method2651(874114616, 0.0F);
            } else {
                var2.method2650(929234520, -1.0F);
                var2.method2650(929234520, -1.0F);
                var2.method2650(929234520, 0.0F);
                var2.method2650(929234520, 0.0F);
                var2.method2650(929234520, 1.0F);
                var2.method2650(929234520, 1.0F);
                var2.method2650(929234520, -1.0F);
                var2.method2650(929234520, 0.0F);
                var2.method2650(929234520, 1.0F);
                var2.method2650(929234520, 1.0F);
                var2.method2650(929234520, 1.0F);
                var2.method2650(929234520, 1.0F);
                var2.method2650(929234520, 0.0F);
                var2.method2650(929234520, 1.0F);
                var2.method2650(929234520, 0.0F);
                var2.method2650(929234520, -1.0F);
                var2.method2650(929234520, 1.0F);
                var2.method2650(929234520, 0.0F);
                var2.method2650(929234520, 0.0F);
                var2.method2650(929234520, 0.0F);
            }
            this.field4101 = this.method1753(20, var2.field7952, var2.field7956, false, -11863);
            this.field4082 = new class39(this.field4101, 5126, 3, 0);
            this.field4124 = new class39(this.field4101, 5126, 2, 12);
            this.field4002.method3299(true, this);
        }
    }

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "(I)V", line = 393)
    public final void method1696(int arg0) {
        ++field3912;
        if (arg0 >= -10) {
            this.method646(114);
        }
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)V", line = 404)
    private final void method1697(byte arg0) {
        int var2 = 92 / ((arg0 - -77) / 34);
        if (this.field4111) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4111 = false;
        }
        ++field3972;
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(B)Leg;", line = 421)
    public final class364 method1698(byte arg0) {
        ++field3873;
        if (arg0 != -29) {
            this.method704((int[]) null, -81, -8, -114, 102);
        }
        return this.field4134 == null ? null : this.field4134.method1498(-108);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(Ltr;I)V", line = 435)
    public final void method1699(class114 arg0, int arg1) {
        ++field3991;
        if (arg1 == 3) {
            if (~this.field4029 <= -1 && this.field4032[this.field4029] == arg0) {
                this.field4032[this.field4029--] = null;
                arg0.method852(-5366);
                if (~this.field4029 > -1) {
                    this.field4028 = null;
                } else {
                    this.field4028 = this.field4032[this.field4029];
                    this.field4028.method851((byte) 63);
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "()Lpg;", line = 459)
    public final class658 method683() {
        ++field3877;
        int var1 = -1;
        if (~this.field4081.indexOf("nvidia") == 0) {
            if (~this.field4081.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (~this.field4081.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class658(var1, "OpenGL", this.field4160, this.field4142, 0L);
    }

    @OriginalMember(owner = "client!uca", name = "IA", descriptor = "(IIIIII[BII)V", line = 480)
    public final void method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3899;
        float var10;
        float var11;
        if (this.field4114 != null && arg2 <= this.field4114.field3016 && ~this.field4114.field3019 <= ~arg3) {
            this.field4114.method1423(0, 0, 0, arg2, arg3, arg6, 0, 6406, false, -33);
            var10 = (float) arg2 * this.field4114.field7159 / (float) this.field4114.field3016;
            var11 = (float) arg3 * this.field4114.field7154 / (float) this.field4114.field3019;
        } else {
            this.field4114 = class134.method952(false, true, 6406, 6406, arg3, arg2, this, arg6);
            this.field4114.method1424(10242, false, false);
            var11 = this.field4114.field7154;
            var10 = this.field4114.field7159;
        }
        this.method1748(2);
        this.method1709((byte) -83, this.field4114);
        this.method1721(58, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1759(true, arg5);
        this.method1701(34165, 1, 34165);
        this.method1755(34166, 34176, 768, 0);
        this.method1755(5890, 34176, 770, 2);
        this.method1724((byte) 11, 770, 34166, 0);
        this.method1724((byte) 11, 770, 5890, 2);
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
        this.method1755(5890, 34176, 768, 0);
        this.method1755(34166, 34176, 770, 2);
        this.method1724((byte) 11, 770, 5890, 0);
        this.method1724((byte) 11, 770, 34166, 2);
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(Ltr;I)V", line = 538)
    public final void method1700(class114 arg0, int arg1) {
        ++field3938;
        if (arg1 < 50) {
            this.field4133 = false;
        }
        if (~this.field4035 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field4035 >= 0) {
                this.field4034[this.field4035].method853(false);
            }
            this.field4030 = this.field4034[++this.field4035] = arg0;
            this.field4030.method850((byte) 67);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lut;Z)Lf;", line = 560)
    public final class256 method660(class616 arg0, boolean arg1) {
        ++field3921;
        int[] var3 = new int[arg0.field8869 * arg0.field8868];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field8875 != null) {
            for (int var6 = 0; arg0.field8868 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field8869 < ~var7; ++var7) {
                    var3[var5++] = class151.method1076(arg0.field8875[var4] << 24, arg0.field8873[class425.method2563(255, arg0.field8871[var4])]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~arg0.field8868 < ~var8; ++var8) {
                for (int var10 = 0; var10 < arg0.field8869; ++var10) {
                    int var11 = arg0.field8873[255 & arg0.field8871[var4++]];
                    var3[var5++] = ~var11 != -1 ? class151.method1076(-16777216, var11) : 0;
                }
            }
        }
        class256 var9 = this.method704(var3, 0, arg0.field8869, arg0.field8869, arg0.field8868);
        var9.method58(arg0.field8870, arg0.field8874, arg0.field8872, arg0.field8867);
        return var9;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(III)V", line = 622)
    public final void method1701(int arg0, int arg1, int arg2) {
        ++field3973;
        if (arg1 != 1) {
            this.field4153 = false;
        }
        if (~this.field4150 == -1) {
            boolean var4 = false;
            if (this.field4157 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                this.field4157 = arg0;
                var4 = true;
            }
            if (~this.field4117 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field4117 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field4049 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIILre;)V", line = 663)
    public final void method1702(int arg0, int arg1, int arg2, int arg3, class290 arg4) {
        ++field3962;
        int var6 = arg4.method1792((byte) 115);
        int var7 = arg1 * this.method1742(true, var6);
        if (arg3 == 28498) {
            this.method1732((byte) -102, arg4);
            OpenGL.glDrawElements(arg0, arg2, var6, arg4.method1793((byte) 102) + (long) var7);
        }
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(B)V", line = 680)
    public final void method1703(byte arg0) {
        if (arg0 <= -83) {
            ++field3986;
            if (this.field4087 != 0) {
                this.field4087 = 0;
                this.field4049 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "(I)V", line = 698)
    private final void method1704(int arg0) {
        if (arg0 == -12692) {
            ++field3908;
            float[] var2 = this.field4091;
            float var3 = (float) (-this.field4154 * this.field4080) / (float) this.field4161;
            float var4 = (float) ((-this.field4154 + this.field3941) * this.field4080) / (float) this.field4161;
            float var5 = (float) (this.field4129 * this.field4080) / (float) this.field4059;
            float var6 = (float) ((-this.field3959 + this.field4129) * this.field4080) / (float) this.field4059;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field4080 * 2.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[11] = -1.0F;
                var2[10] = this.field4115 = (float) (-(this.field4127 - -this.field4080)) / (float) (-this.field4080 + this.field4127);
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[6] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[14] = this.field4159 = -((float) this.field4127 * var7) / (float) (-this.field4080 + this.field4127);
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[15] = 0.0F;
                var2[13] = 0.0F;
            } else {
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[14] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[13] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
            }
            this.method1766(false);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZB)V", line = 761)
    public final void method1705(boolean arg0, byte arg1) {
        ++field4005;
        if (!this.field4126 == arg0) {
            this.field4126 = arg0;
            this.method1738(30806);
            this.field4049 &= -8;
        }
        int var3 = 89 % ((arg1 - 13) / 42);
    }

    @OriginalMember(owner = "client!uca", name = "ra", descriptor = "(F)V", line = 780)
    public final void method711(float arg0) {
        ++field3817;
        if (this.field4121 != arg0) {
            this.field4121 = arg0;
            this.method1747(91);
        }
    }

    @OriginalMember(owner = "client!uca", name = "V", descriptor = "(IIII)V", line = 795)
    public final void method692(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field4110 > ~arg0) {
            this.field4110 = arg0;
        }
        if (arg2 < this.field4100) {
            this.field4100 = arg2;
        }
        if (this.field4152 < arg1) {
            this.field4152 = arg1;
        }
        if (~arg3 > ~this.field4136) {
            this.field4136 = arg3;
        }
        ++field3854;
        OpenGL.glEnable(3089);
        this.method1771(-5489);
        this.method1743(0);
    }

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "()Z", line = 821)
    public final boolean method654() {
        ++field3891;
        return false;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lak;IIII)Lda;", line = 830)
    public final class395 method651(class677 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3881;
        return new class340(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "(I)V", line = 841)
    private final void method1706(int arg0) {
        ++field3983;
        if (~this.field4087 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field3941 > 0 && ~this.field3959 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field3941, (double) this.field3959, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4049 &= -25;
            this.field4087 = 1;
        }
        int var2 = 1 % ((arg0 - 45) / 38);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZIIILjaclib/memory/Buffer;)Lfba;", line = 866)
    public final class558 method1707(boolean arg0, int arg1, int arg2, int arg3, Buffer arg4) {
        if (arg3 != 5126) {
            this.method1741((byte) -114);
        }
        ++field3828;
        return (class558) (!this.field4133 || arg0 && !this.field4153 ? new class527(this, arg2, arg4) : new class627(this, arg2, arg4, arg1, arg0));
    }

    @OriginalMember(owner = "client!uca", name = "da", descriptor = "(IIII)V", line = 886)
    public final void method652(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3941 < arg2) {
            arg2 = this.field3941;
        }
        if (arg3 > this.field3959) {
            arg3 = this.field3959;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        ++field3946;
        this.field4100 = arg2;
        this.field4136 = arg3;
        this.field4152 = arg1;
        this.field4110 = arg0;
        OpenGL.glEnable(3089);
        this.method1771(-5489);
        this.method1743(0);
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(III)V", line = 918)
    public final synchronized void method1708(int arg0, int arg1, int arg2) {
        ++field3815;
        class258 var4 = new class258(arg2);
        if (arg0 != 29916) {
            this.field4071 = true;
        }
        var4.field5740 = (long) arg1;
        this.field4045.method1909(var4, (byte) -81);
    }

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "()Z", line = 933)
    public final boolean method645() {
        ++field3927;
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "()V", line = 941)
    public final void method642() {
        ++field3989;
        if (this.field4123 && ~this.field3941 < -1 && ~this.field3959 < -1) {
            int var1 = this.field4110;
            int var2 = this.field4100;
            int var3 = this.field4152;
            int var4 = this.field4136;
            this.method699();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1703((byte) -107);
            this.method1770(false, (byte) -66);
            this.method1705(false, (byte) -48);
            this.method1693(false, false);
            this.method1694((byte) 107, false);
            this.method1709((byte) -99, (class517) null);
            this.method1761(-2, 260);
            this.method1751(1, 21575);
            this.method1721(-119, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3941, this.field3959, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method652(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLvaa;)V", line = 986)
    public final void method1709(byte arg0, class517 arg1) {
        ++field3866;
        if (arg0 < -45) {
            class517 var3 = this.field4167[this.field4150];
            if (arg1 != var3) {
                if (arg1 == null) {
                    OpenGL.glDisable(var3.field7260);
                } else {
                    if (var3 != null) {
                        if (~arg1.field7260 != ~var3.field7260) {
                            OpenGL.glDisable(var3.field7260);
                            OpenGL.glEnable(arg1.field7260);
                        }
                    } else {
                        OpenGL.glEnable(arg1.field7260);
                    }
                    OpenGL.glBindTexture(arg1.field7260, arg1.method2928(9729));
                }
                this.field4167[this.field4150] = arg1;
            }
            this.field4049 &= -2;
        }
    }

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "(B)V", line = 1026)
    public final void method1710(byte arg0) {
        ++field3852;
        int var2 = -98 / ((arg0 - -36) / 37);
        if (~this.field4049 != -5) {
            this.method1706(-93);
            this.method1770(false, (byte) -71);
            this.method1705(false, (byte) -37);
            this.method1693(false, false);
            this.method1694((byte) 95, false);
            this.method1761(-2, 260);
            this.method1721(-128, 1);
            this.field4049 = 4;
        }
    }

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "()V", line = 1048)
    public final void method681() {
        OpenGL.glFinish();
        ++field3843;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZLbb;)V", line = 1057)
    public final void method1711(boolean arg0, class196 arg1) {
        OpenGL.glLoadMatrixf(arg1.method1284(arg0), 0);
        ++field3855;
    }

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "()Z", line = 1067)
    public final boolean method686() {
        ++field3902;
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(Z)V", line = 1075)
    public final void method1712(boolean arg0) {
        ++field3911;
        if (this.field4049 != 16) {
            this.method1762((byte) 59);
            this.method1770(true, (byte) -85);
            this.method1693(true, false);
            this.method1694((byte) 124, true);
            this.method1721(-115, 1);
            this.field4049 = 16;
        }
        if (arg0) {
            this.field4084 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "(I)V", line = 1097)
    private final void method1713(int arg0) {
        OpenGL.glDepthMask(this.field4050 && this.field4155);
        ++field3945;
        if (arg0 != 32902) {
            this.method1757(-100, 102L);
        }
    }

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "()V", line = 1108)
    public final void method656() {
        ++field3980;
    }

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "()V", line = 1117)
    public final void method676() {
        this.field4012.method251(true);
        ++field3821;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lgv;ILgv;Lgv;Lgv;)V", line = 1127)
    public final void method1714(class39 arg0, int arg1, class39 arg2, class39 arg3, class39 arg4) {
        ++field3922;
        if (arg4 != null) {
            this.method1736(34962, arg4.field588);
            OpenGL.glVertexPointer(arg4.field583, arg4.field586, this.field4137.method2987(121), this.field4137.method2984((byte) 12) + (long) arg4.field587);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg1 != -1) {
            this.method666();
        }
        if (arg2 != null) {
            this.method1736(arg1 + 34963, arg2.field588);
            OpenGL.glNormalPointer(arg2.field586, this.field4137.method2987(127), this.field4137.method2984((byte) 12) + (long) arg2.field587);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg3 != null) {
            this.method1736(arg1 + 34963, arg3.field588);
            OpenGL.glColorPointer(arg3.field583, arg3.field586, this.field4137.method2987(119), this.field4137.method2984((byte) 12) - -((long) arg3.field587));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method1736(arg1 + 34963, arg0.field588);
            OpenGL.glTexCoordPointer(arg0.field583, arg0.field586, this.field4137.method2987(127), this.field4137.method2984((byte) 12) - -((long) arg0.field587));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 1173)
    public final class682 method677(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3882;
        return new class436(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1184)
    public final void method689(Rectangle[] arg0, int arg1) throws class232 {
        this.method655();
        ++field3864;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lfo;[Lut;Z)Lla;", line = 1195)
    public final class393 method684(class606 arg0, class616[] arg1, boolean arg2) {
        ++field3942;
        return new class467(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uca", name = "FA", descriptor = "(ILua;II)V", line = 1203)
    public final void method715(int arg0, class591 arg1, int arg2, int arg3) {
        ++field3820;
        class20 var5 = (class20) arg1;
        class506 var6 = var5.field382;
        this.method1748(2);
        this.method1709((byte) -55, var5.field382);
        this.method1721(97, 1);
        this.method1701(7681, 1, 8448);
        this.method1755(34167, 34176, 768, 0);
        float var7 = var6.field7159 / (float) var6.field7156;
        float var8 = var6.field7154 / (float) var6.field7160;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field4110 - arg2) * var7, (float) (this.field4152 - arg3) * var8);
        OpenGL.glVertex2i(this.field4110, this.field4152);
        OpenGL.glTexCoord2f((float) (this.field4110 - arg2) * var7, (float) (-arg3 + this.field4136) * var8);
        OpenGL.glVertex2i(this.field4110, this.field4136);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4100) * var7, (float) (this.field4136 - arg3) * var8);
        OpenGL.glVertex2i(this.field4100, this.field4136);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4100) * var7, (float) (-arg3 + this.field4152) * var8);
        OpenGL.glVertex2i(this.field4100, this.field4152);
        OpenGL.glEnd();
        this.method1755(5890, 34176, 768, 0);
    }

    @OriginalMember(owner = "client!uca", name = "BA", descriptor = "()I", line = 1238)
    public final int method668() {
        ++field3895;
        return this.field4080;
    }

    @OriginalMember(owner = "client!uca", name = "CA", descriptor = "(IIII)V", line = 1250)
    public final void method680(int arg0, int arg1, int arg2, int arg3) {
        this.field4071 = true;
        this.field4147 = arg1;
        this.field4109 = arg0;
        this.field4067 = arg3;
        ++field3929;
        this.field4083 = arg2;
    }

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "(I)V", line = 1266)
    private final void method1715(int arg0) {
        if (this.field3871 == null) {
            this.field3825 = this.field3878 = 0;
        } else {
            Dimension var2 = this.field3871.getSize();
            this.field3878 = var2.height;
            this.field3825 = var2.width;
        }
        ++field3862;
        if (this.field4030 == null) {
            this.field3941 = this.field3825;
            this.field3959 = this.field3878;
            this.method1727(1);
        }
        this.method1703((byte) -125);
        this.method699();
        if (arg0 != 0) {
            this.method616((class151) null);
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V", line = 1296)
    public class287(Canvas arg0, class615 arg1, int arg2) {
        super(arg1);
        this.field4006 = arg2;
        this.field3871 = this.field3939 = arg0;
        if (!class436.method2588("jaclib", (byte) 85)) {
            throw new RuntimeException("");
        } else if (!class436.method2588("jaggl", (byte) 116)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field3874 = new OpenGL();
                this.field3890 = this.field3865 = this.field3874.init(arg0, 8, 8, 8, 24, 0, this.field4006);
                if (this.field3865 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method1731((byte) 0);
                    int var4 = this.method1746(2);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field4069 = !this.field4060 ? 5121 : 33639;
                        if (~this.field4142.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class509.method2891(this.field4142.replace('/', ' '), ' ', 40);
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class86.method488((byte) 122, var10.substring(1, 3))) {
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
                                            if (var10.length() >= 4 && class86.method488((byte) 115, var10.substring(0, 4))) {
                                                var5 = class87.method496(var10.substring(0, 4), (byte) -127);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field4168 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field4133 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field4106 = false;
                            }
                            this.field4132 &= this.field3874.method160("GL_ARB_half_float_pixel");
                            this.field4164 = true;
                            this.field4153 = this.field4133;
                        }
                        if (this.field4081.indexOf("intel") != -1) {
                            this.field4062 = false;
                        }
                        this.field4123 = !this.field4081.equals("s3 graphics");
                        if (this.field4133) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class530.method3075(true, (byte) 80, false);
                        this.field4024 = true;
                        this.field4001 = new class610(this, super.field1491);
                        this.method1689(-4);
                        this.field4021 = new class117(this);
                        this.field4012 = new class43(this);
                        if (this.field4012.method248(1)) {
                            this.field4008 = new class362(this);
                            if (!this.field4008.method2225((byte) -122)) {
                                this.field4008.method1645(false);
                                this.field4008 = null;
                            }
                        }
                        this.field4014 = new class58(this);
                        this.method1733(-84);
                        this.method1715(0);
                        this.method642();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method697();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "ya", descriptor = "()V", line = 1446)
    public final void method638() {
        this.method1694((byte) 101, true);
        ++field3954;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "(IIIII)V", line = 1457)
    public final void method635(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1728(1);
        ++field3880;
        this.method1721(-119, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(II)I", line = 1478)
    public final int method706(int arg0, int arg1) {
        ++field3885;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!uca", name = "YA", descriptor = "(IIII)V", line = 1486)
    public final void method657(int arg0, int arg1, int arg2, int arg3) {
        ++field3857;
        if (!this.field4071) {
            throw new RuntimeException("");
        } else {
            this.field4109 = arg0;
            this.field4083 = arg2;
            this.field4147 = arg1;
            this.field4067 = arg3;
            if (this.field4128) {
                this.field4014.field943.method1142((byte) -128);
                this.field4014.field943.method1143(0);
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZI)V", line = 1511)
    public final void method1716(boolean arg0, int arg1) {
        if (arg1 == 3042) {
            ++field3937;
            if (this.field4102 != arg0) {
                this.field4102 = arg0;
                this.method1738(30806);
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZIB)V", line = 1527)
    public final void method1717(boolean arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            this.field4100 = -67;
        }
        this.method1722(arg0, true, arg1, -10708);
        ++field3935;
    }

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "()I", line = 1539)
    public final int method669() {
        ++field3966;
        return 4;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBI)V", line = 1547)
    public final synchronized void method1718(int arg0, byte arg1, int arg2) {
        ++field4011;
        class258 var4 = new class258(arg0);
        if (arg1 != -93) {
            this.field4085 = 0.11457676F;
        }
        var4.field5740 = (long) arg2;
        this.field4043.method1909(var4, (byte) -81);
    }

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "()Z", line = 1565)
    public final boolean method671() {
        ++field4004;
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "GA", descriptor = "(II)V", line = 1573)
    public final void method675(int arg0, int arg1) {
        ++field3813;
        if (this.field4080 != arg0 || this.field4127 != arg1) {
            this.field4080 = arg0;
            this.field4127 = arg1;
            this.method1704(-12692);
            this.method1739(-70);
            if (~this.field4087 == -4) {
                this.method1723((byte) -115);
                return;
            }
            if (this.field4087 != 2) {
                return;
            }
            this.method1734(4);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZ[BII)Lre;", line = 1598)
    public final class290 method1719(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        ++field3831;
        if (arg4 != 0) {
            return null;
        } else {
            return (class290) (!this.field4133 || arg1 && !this.field4153 ? new class588(this, arg3, arg2, arg0) : new class423(this, arg3, arg2, arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "(B)V", line = 1615)
    private final void method1720(byte arg0) {
        ++field3979;
        int var2;
        for (var2 = 0; ~var2 > ~this.field4122; ++var2) {
            class334 var3 = this.field4131[var2];
            class356.field5261[0] = (float) var3.method2050((byte) -60);
            int var4 = var2 + 16386;
            class356.field5261[1] = (float) var3.method2045(0);
            class356.field5261[2] = (float) var3.method2046(true);
            class356.field5261[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class356.field5261, 0);
            int var5 = var3.method2049(0);
            float var6 = var3.method2053((byte) 127) / 255.0F;
            class356.field5261[2] = var6 * (float) class425.method2563(var5, 255);
            class356.field5261[0] = (float) class425.method2563(var5 >> 16, 255) * var6;
            class356.field5261[1] = (float) (class425.method2563(var5, 65442) >> 8) * var6;
            OpenGL.glLightfv(var4, 4609, class356.field5261, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2051(arg0 + -520326440) * var3.method2051(arg0 + -520326440)));
            OpenGL.glEnable(var4);
        }
        while (this.field4141 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field4141 = this.field4122;
        if (arg0 != -87) {
            this.method1756((byte) -25);
        }
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(II)V", line = 1661)
    public final void method1721(int arg0, int arg1) {
        if (this.field4048 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    var3 = true;
                    var4 = false;
                    var5 = 2;
                } else if (~arg1 != -129) {
                    var3 = true;
                    var5 = 0;
                    var4 = false;
                } else {
                    var4 = true;
                    var3 = true;
                    var5 = 3;
                }
            } else {
                var4 = true;
                var3 = true;
                var5 = 1;
            }
            if (this.field4054 != var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field4054 = var3;
            }
            if (var4 == !this.field4056) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field4056 = var4;
            }
            if (~this.field4051 != ~var5) {
                if (~var5 != -2) {
                    if (~var5 != -3) {
                        if (var5 == 3) {
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
                this.field4051 = var5;
            }
            this.field4048 = arg1;
            this.field4049 &= -29;
        }
        int var6 = 97 % ((-62 - arg0) / 53);
        ++field3949;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZZII)V", line = 1754)
    public final void method1722(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 != -10708) {
            this.field4023 = null;
        }
        if (this.field4064 != arg2 || !this.field4071 != !this.field4128) {
            class227 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field4071 ? 0 : 3;
            if (~arg2 > -1) {
                this.method1697((byte) -26);
            } else {
                var5 = this.field4001.method3482(0, arg2);
                class457 var10 = super.field1491.method955(-1330, arg2);
                if (~var10.field6601 == -1 && ~var10.field6607 == -1) {
                    this.method1697((byte) 101);
                } else {
                    int var11 = var10.field6610 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method1744(0.0F, (float) (this.field4020 % var12 * var10.field6601) / (float) var12, (float) (this.field4020 % var12 * var10.field6607) / (float) var12, arg3 + 10586);
                }
                var6 = var10.field6591;
                if (!this.field4071) {
                    var9 = var10.field6600;
                    var7 = var10.field6599;
                    var8 = var10.field6589;
                }
            }
            this.field4014.method365(var8, var9, var7, arg1, arg0, -128);
            if (!this.field4014.method362(var6, arg3 ^ 28336, var5)) {
                this.method1709((byte) -105, var5);
                this.method1751(var6, 21575);
            }
            this.field4128 = this.field4071;
            this.field4064 = arg2;
        }
        ++field3870;
        this.field4049 &= -8;
    }

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "(B)V", line = 1817)
    private final void method1723(byte arg0) {
        if (arg0 == -115) {
            ++field3863;
            float var2 = (float) (-this.field4154) * this.field4135 / (float) this.field4161;
            float var3 = (float) (-this.field4129) * this.field4135 / (float) this.field4059;
            float var4 = (float) (-this.field4154 + this.field3941) * this.field4135 / (float) this.field4161;
            float var5 = (float) (this.field3959 - this.field4129) * this.field4135 / (float) this.field4059;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field4080, (double) this.field4127);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(IIIIZ)Lf;", line = 1842)
    public final class256 method688(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3958;
        return new class503(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!uca", name = "oa", descriptor = "([I)V", line = 1857)
    public final void method628(int[] arg0) {
        arg0[0] = this.field4110;
        arg0[3] = this.field4136;
        ++field3953;
        arg0[1] = this.field4152;
        arg0[2] = this.field4100;
    }

    @OriginalMember(owner = "client!uca", name = "C", descriptor = "()Lq;", line = 1868)
    public final class151 method717() {
        ++field3903;
        return new class196();
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BIII)V", line = 1878)
    public final void method1724(byte arg0, int arg1, int arg2, int arg3) {
        ++field3996;
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg2);
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg1);
        if (arg0 != 11) {
            this.method679((class620) null);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZLtr;)V", line = 1890)
    public final void method1725(boolean arg0, class114 arg1) {
        ++field3961;
        if (!arg0) {
            if (this.field4035 >= 0 && this.field4034[this.field4035] == arg1) {
                this.field4034[this.field4035--] = null;
                arg1.method853(false);
                if (this.field4035 >= 0) {
                    this.field4030 = this.field4034[this.field4035];
                    this.field4030.method850((byte) 98);
                } else {
                    this.field4030 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I[Ltg;)V", line = 1913)
    public final void method696(int arg0, class334[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field4131[var3] = arg1[var3];
        }
        ++field3892;
        this.field4122 = arg0;
        if (this.field4087 != 1) {
            this.method1720((byte) -87);
        }
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(II)Z", line = 1935)
    public static final boolean method1726(int arg0, int arg1) {
        if (arg0 != 2097152) {
            return false;
        } else {
            ++field3832;
            return arg1 == 1 || ~arg1 == -4 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "(I)V", line = 1947)
    private final void method1727(int arg0) {
        OpenGL.glViewport(this.field4093, this.field4148, this.field3941, this.field3959);
        if (arg0 != 1) {
            this.field4028 = null;
        }
        ++field3816;
    }

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "(I)V", line = 1958)
    private final void method1728(int arg0) {
        if (this.field4049 != arg0) {
            this.method1706(-80);
            this.method1770(false, (byte) 111);
            this.method1705(false, (byte) -114);
            this.method1693(false, false);
            this.method1694((byte) 84, false);
            this.method1709((byte) -74, (class517) null);
            this.method1761(-2, arg0 + 259);
            this.method1751(1, 21575);
            this.field4049 = 1;
        }
        ++field3995;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1980)
    public final void method613(Canvas arg0) {
        ++field3957;
        if (this.field3939 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3893.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field3874.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field3893.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "(I)V", line = 2016)
    private final void method1729(int arg0) {
        this.field3874.method161();
        ++field3856;
        if (arg0 < 103) {
            this.field4158 = 0.8613341F;
        }
    }

    @OriginalMember(owner = "client!uca", name = "DA", descriptor = "()I", line = 2027)
    public final int method666() {
        ++field3916;
        int var1 = this.field4172;
        this.field4172 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!uca", name = "AA", descriptor = "(III[I)V", line = 2038)
    public final void method629(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3913;
        float var5 = (float) arg2 * this.field4052.field2671 + (float) arg0 * this.field4052.field2649 + (float) arg1 * this.field4052.field2668 + this.field4052.field2679;
        if (!(var5 < (float) this.field4080) && !((float) this.field4127 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4052.field2664 + (float) arg0 * this.field4052.field2644 + (float) arg1 * this.field4052.field2655 + this.field4052.field2642) * (float) this.field4161 / var5);
            int var7 = (int) (((float) arg2 * this.field4052.field2674 + (float) arg0 * this.field4052.field2654 + (float) arg1 * this.field4052.field2672 + this.field4052.field2661) * (float) this.field4059 / var5);
            if (this.field4092 <= (float) var6 && this.field4085 >= (float) var6 && this.field4146 <= (float) var7 && (float) var7 <= this.field4158) {
                arg3[1] = (int) ((float) var7 + -this.field4146);
                arg3[0] = (int) ((float) var6 + -this.field4092);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "(B)V", line = 2071)
    public final void method1730(byte arg0) {
        if (arg0 != 90) {
            this.method683();
        }
        ++field3896;
        if (this.field4049 != 8) {
            this.method1749((byte) 101);
            this.method1770(true, (byte) 114);
            this.method1693(true, false);
            this.method1694((byte) 93, true);
            this.method1721(-116, 1);
            this.field4049 = 8;
        }
    }

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "(B)V", line = 2093)
    private final void method1731(byte arg0) {
        ++field3977;
        int var2 = 0;
        while (!this.field3874.method159()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class687.method3846(1000L, 95);
        }
        if (arg0 != 0) {
            this.method1692(-122, (class114) null);
        }
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2119)
    public final void method709(Canvas arg0) {
        this.field3871 = null;
        this.field3890 = 0L;
        ++field3858;
        if (arg0 != null && this.field3939 != arg0) {
            if (this.field3893.containsKey(arg0)) {
                Long var2 = (Long) this.field3893.get(arg0);
                this.field3890 = var2;
                this.field3871 = arg0;
            }
        } else {
            this.field3890 = this.field3865;
            this.field3871 = this.field3939;
        }
        if (this.field3871 != null && this.field3890 != 0L) {
            this.field3874.setSurface(this.field3890);
            this.method1715(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "()V", line = 2150)
    public final void method662() {
        ++field3905;
        if (!this.field4062) {
            if (!this.field4065) {
                throw new RuntimeException("");
            }
            this.field4026.method44(0, 0, this.field3941, this.field3959, 0, 0);
            this.field3874.setSurface(this.field3890);
        } else {
            if (this.field4033 != this.field4030) {
                throw new RuntimeException();
            }
            this.field4033.method3244(0, 36009);
            this.field4033.method3244(8, 36009);
            this.method1695(this.field4033, 255);
        }
        this.field3941 = this.field3825;
        this.field4026 = null;
        this.field3959 = this.field3878;
        this.method1703((byte) -103);
        this.method1727(1);
        this.method699();
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lq;)V", line = 2184)
    public final void method616(class151 arg0) {
        this.field4052.method887(arg0);
        ++field4000;
        this.field4057.method887(this.field4052);
        this.field4057.method1279((byte) 121);
        this.field4058.method1282(this.field4057, -121);
        if (~this.field4087 != -2) {
            this.method1752(-28257);
        }
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(IIIIII)V", line = 2203)
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3952;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1728(1);
        this.method1721(10, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4145) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4145) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIIIIII)V", line = 2237)
    public final void method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method1728(1);
        ++field3990;
        this.method1721(-117, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "()V", line = 2256)
    public final void method653() {
        ++field3931;
        if (this.field4008 != null && this.field4008.method1644(false)) {
            this.field4012.method242(this.field4008, false);
            this.field4001.method3478(false);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([IIIII)Lf;", line = 2271)
    public final class256 method704(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3861;
        return new class503(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLre;)V", line = 2279)
    public final void method1732(byte arg0, class290 arg1) {
        ++field3994;
        if (this.field4075 != arg1) {
            if (this.field4133) {
                OpenGL.glBindBufferARB(34963, arg1.method1790(17906));
            }
            this.field4075 = arg1;
        }
        if (arg0 > -91) {
            this.method1715(-63);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIII)V", line = 2302)
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
        this.field4012.method249(arg1, arg3, arg2, (byte) -93, arg0);
        ++field3968;
    }

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "(I)V", line = 2313)
    private final void method1733(int arg0) {
        ++field3992;
        this.method1761(-2, 260);
        for (int var2 = this.field4162 + -1; var2 >= 0; --var2) {
            this.method1745(true, var2);
            this.method1709((byte) -100, (class517) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1701(8448, 1, 8448);
        this.method1755(34168, 34176, 770, 2);
        this.method1697((byte) -113);
        this.field4048 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        if (arg0 >= -80) {
            this.field4027 = null;
        }
        this.field4051 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4056 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4054 = true;
        this.method1770(true, (byte) -97);
        this.method1705(true, (byte) -47);
        this.method1693(true, false);
        this.method1694((byte) 113, true);
        this.method1703((byte) -113);
        this.field3874.setSwapInterval(0);
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
        this.field4118 = this.field4163 = -1;
        this.method699();
    }

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "(I)V", line = 2385)
    private final void method1734(int arg0) {
        ++field3840;
        if (arg0 != 4) {
            this.method1704(-88);
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field4091, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "(I)V", line = 2400)
    private final void method1735(int arg0) {
        ++field3867;
        if (arg0 != 2) {
            this.field4114 = null;
        }
        if (this.field4156 && this.field4068 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILfba;)V", line = 2415)
    public final void method1736(int arg0, class558 arg1) {
        if (arg0 != 34962) {
            this.field4048 = -87;
        }
        if (this.field4137 != arg1) {
            if (this.field4133) {
                OpenGL.glBindBufferARB(34962, arg1.method2985(17831));
            }
            this.field4137 = arg1;
        }
        ++field3924;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(FBF)V", line = 2434)
    public final void method1737(float arg0, byte arg1, float arg2) {
        this.field4105 = arg2;
        if (arg1 > -3) {
            this.method608();
        }
        this.field4086 = arg0;
        ++field3886;
        this.method1739(-107);
    }

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "(I)V", line = 2454)
    private final void method1738(int arg0) {
        if (arg0 != 30806) {
            this.method637(94, 108, -78, 37, -99, 16);
        }
        if (this.field4126 && !this.field4102) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field3906;
    }

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "(I)V", line = 2470)
    private final void method1739(int arg0) {
        ++field3956;
        int var2 = -118 % ((arg0 - -23) / 42);
        this.field4113 = (float) (this.field4127 - this.field4094) - this.field4086;
        this.field4151 = -((float) this.field4068 * this.field4105) + this.field4113;
        if (this.field4151 < (float) this.field4080) {
            this.field4151 = (float) this.field4080;
        }
        OpenGL.glFogf(2915, this.field4151);
        OpenGL.glFogf(2916, this.field4113);
        class431.field6265[2] = (float) class425.method2563(this.field4163, 255) / 255.0F;
        class431.field6265[0] = (float) class425.method2563(16711680, this.field4163) / 1.671168E7F;
        class431.field6265[1] = (float) class425.method2563(this.field4163, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class431.field6265, 0);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "()Z", line = 2497)
    public final boolean method618() {
        ++field3914;
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ltr;B)V", line = 2505)
    public final void method1740(class114 arg0, byte arg1) {
        if (arg1 >= 110) {
            ++field3900;
            if (!this.field4098) {
                if (this.field4025 >= 3) {
                    throw new RuntimeException();
                } else {
                    if (this.field4025 >= 0) {
                        this.field4031[this.field4025].method849(-51);
                    }
                    this.field4028 = this.field4030 = this.field4031[++this.field4025] = arg0;
                    this.field4028.method848((byte) -88);
                }
            } else {
                this.method1692(-1, arg0);
                this.method1700(arg0, 102);
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "(B)V", line = 2535)
    private final void method1741(byte arg0) {
        class431.field6265[2] = this.field4108 * this.field4061;
        if (arg0 > -38) {
            this.field4060 = true;
        }
        class431.field6265[3] = 1.0F;
        class431.field6265[0] = this.field4108 * this.field4088;
        class431.field6265[1] = this.field4108 * this.field4072;
        ++field3970;
        OpenGL.glLightfv(16384, 4609, class431.field6265, 0);
        class431.field6265[0] = -this.field4125 * this.field4088;
        class431.field6265[2] = -this.field4125 * this.field4061;
        class431.field6265[3] = 1.0F;
        class431.field6265[1] = -this.field4125 * this.field4072;
        OpenGL.glLightfv(16385, 4609, class431.field6265, 0);
    }

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "()Z", line = 2558)
    public final boolean method685() {
        ++field3947;
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(ZI)I", line = 2567)
    public final int method1742(boolean arg0, int arg1) {
        ++field3923;
        if (~arg1 != -5122 && arg1 != 5120) {
            if (arg1 != 5123 && arg1 != 5122) {
                if (!arg0) {
                    this.field4116 = null;
                }
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

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "(I)V", line = 2590)
    private final void method1743(int arg0) {
        ++field3963;
        if (~this.field4100 <= ~this.field4110 && ~this.field4136 <= ~this.field4152) {
            OpenGL.glScissor(this.field4093 - -this.field4110, this.field4148 - this.field4136 + this.field3959, -this.field4110 + this.field4100, -this.field4152 + this.field4136);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 0) {
            this.method1710((byte) 109);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(FFFI)V", line = 2605)
    private final void method1744(float arg0, float arg1, float arg2, int arg3) {
        OpenGL.glMatrixMode(5890);
        ++field3901;
        if (this.field4111) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg2, arg0);
        OpenGL.glMatrixMode(5888);
        if (arg3 >= -114) {
            this.method665(34);
        }
        this.field4111 = true;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(ZI)V", line = 2623)
    public final void method1745(boolean arg0, int arg1) {
        if (~this.field4150 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field4150 = arg1;
        }
        ++field3814;
        if (!arg0) {
            this.field4053 = true;
        }
    }

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "(I)I", line = 2642)
    private final int method1746(int arg0) {
        ++field3940;
        this.field4081 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field4142 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field4081.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field4081.indexOf("brian paul") != 0 || ~this.field4081.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class509.method2891(var3.replace('.', ' '), ' ', 52);
        if (~var4.length <= -3) {
            try {
                int var5 = class87.method496(var4[0], (byte) -113);
                int var6 = class87.method496(var4[1], (byte) -95);
                this.field4160 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field4160 > -13) {
            var2 |= 2;
        }
        if (!this.field3874.method160("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3874.method160("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4162 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field4066 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field4097 = var7[0];
        if (arg0 > this.field4162 || this.field4066 < 2 || ~this.field4097 > -3) {
            var2 |= 16;
        }
        this.field4060 = Stream.method2077();
        this.field4065 = this.field3874.arePbuffersAvailable();
        this.field4133 = this.field3874.method160("GL_ARB_vertex_buffer_object");
        this.field4145 = this.field3874.method160("GL_ARB_multisample");
        this.field4140 = this.field3874.method160("GL_ARB_vertex_program");
        this.field3874.method160("GL_ARB_fragment_program");
        this.field4074 = this.field3874.method160("GL_ARB_vertex_shader");
        this.field4099 = this.field3874.method160("GL_ARB_fragment_shader");
        this.field4168 = this.field3874.method160("GL_EXT_texture3D");
        this.field4132 = this.field3874.method160("GL_ARB_texture_rectangle");
        this.field4090 = this.field3874.method160("GL_ARB_texture_cube_map");
        this.field4106 = this.field3874.method160("GL_ARB_texture_float");
        this.field4144 = false;
        this.field4062 = this.field3874.method160("GL_EXT_framebuffer_object");
        this.field4098 = this.field3874.method160("GL_EXT_framebuffer_blit");
        this.field4138 = this.field3874.method160("GL_EXT_framebuffer_multisample");
        this.field4095 = this.field4138 & this.field4098;
        OpenGL.glGetFloatv(2834, class431.field6265, 0);
        this.field4063 = class431.field6265[1];
        this.field4070 = class431.field6265[0];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)V", line = 2725)
    public final void method640(int arg0) {
        ++field3960;
        this.method1729(122);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V", line = 2733)
    public final void method626(int arg0) {
        ++field3907;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "(I)V", line = 2744)
    private final void method1747(int arg0) {
        ++field3879;
        class431.field6265[0] = this.field4121 * this.field4088;
        class431.field6265[3] = 1.0F;
        class431.field6265[2] = this.field4121 * this.field4061;
        class431.field6265[1] = this.field4121 * this.field4072;
        if (arg0 < 62) {
            this.method1742(false, 1);
        }
        OpenGL.glLightModelfv(2899, class431.field6265, 0);
    }

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "(I)V", line = 2759)
    public final void method1748(int arg0) {
        ++field3868;
        if (~this.field4049 != -3) {
            this.method1706(116);
            this.method1770(false, (byte) 84);
            this.method1705(false, (byte) 96);
            this.method1693(false, false);
            this.method1694((byte) 91, false);
            this.method1761(-2, 260);
            this.field4049 = 2;
        }
        if (arg0 != 2) {
            this.method1694((byte) 68, false);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIZ)Lf;", line = 2781)
    public final class256 method631(int arg0, int arg1, boolean arg2) {
        ++field3883;
        return new class503(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "()Z", line = 2790)
    public final boolean method650() {
        ++field4010;
        if (this.field4008 != null) {
            if (!this.field4008.method1644(false)) {
                if (!this.field4012.method246(114, this.field4008)) {
                    return false;
                }
                this.field4001.method3478(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "(B)V", line = 2816)
    private final void method1749(byte arg0) {
        ++field3845;
        if (this.field4087 != 2) {
            this.field4087 = 2;
            this.method1734(4);
            this.method1752(arg0 ^ -28166);
            this.field4049 &= -8;
        }
        if (arg0 != 101) {
            this.field4012 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(FIFFF)V", line = 2835)
    public final void method1750(float arg0, int arg1, float arg2, float arg3, float arg4) {
        class431.field6265[1] = arg0;
        class431.field6265[3] = arg3;
        int var6 = -4 % ((54 - arg1) / 45);
        class431.field6265[0] = arg4;
        ++field3967;
        class431.field6265[2] = arg2;
        OpenGL.glTexEnvfv(8960, 8705, class431.field6265, 0);
    }

    @OriginalMember(owner = "client!uca", name = "JA", descriptor = "()V", line = 2849)
    public final void method699() {
        this.field4110 = 0;
        ++field3860;
        this.field4152 = 0;
        this.field4100 = this.field3941;
        this.field4136 = this.field3959;
        OpenGL.glDisable(3089);
        this.method1771(-5489);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)V", line = 2869)
    public final void method612(boolean arg0) {
        ++field3928;
    }

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "(II)V", line = 2881)
    public final void method1751(int arg0, int arg1) {
        if (arg1 != 21575) {
            this.field4021 = null;
        }
        ++field3944;
        if (~arg0 == -2) {
            this.method1701(7681, arg1 ^ 21574, 7681);
        } else if (~arg0 != -1) {
            if (~arg0 != -3) {
                if (~arg0 == -4) {
                    this.method1701(260, 1, 8448);
                    return;
                }
                if (~arg0 == -5) {
                    this.method1701(34023, arg1 + -21574, 34023);
                    return;
                }
            } else {
                this.method1701(34165, arg1 + -21574, 7681);
            }
        } else {
            this.method1701(8448, arg1 ^ 21574, 8448);
        }
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2914)
    public final void method672(Canvas arg0) {
        ++field3993;
        if (this.field3939 == arg0) {
            throw new RuntimeException();
        } else if (this.field3893.containsKey(arg0)) {
            Long var2 = (Long) this.field3893.get(arg0);
            this.field3874.releaseSurface(arg0, var2);
            this.field3893.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "(I)V", line = 2933)
    private final void method1752(int arg0) {
        ++field3969;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field4057.method1284(true), 0);
        if (this.field4128) {
            this.field4014.field943.method1142((byte) 103);
        }
        this.method1756((byte) -17);
        if (arg0 != -28257) {
            this.method611((class649) null);
        }
        this.method1720((byte) -87);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I[BIZI)Lfba;", line = 2951)
    public final class558 method1753(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        ++field3898;
        if (!this.field4133 || arg3 && !this.field4153) {
            if (arg4 != -11863) {
                this.field4044 = null;
            }
            return new class527(this, arg0, arg1, arg2);
        } else {
            return new class627(this, arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!uca", name = "B", descriptor = "()Z", line = 2967)
    public final boolean method705() {
        ++field3948;
        return this.field4008 != null && this.field4008.method1644(false);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBII)V", line = 2975)
    public final void method1754(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg3, arg0, arg2);
        if (arg1 >= -99) {
            this.method1742(true, 12);
        }
        ++field3841;
    }

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "()V", line = 2989)
    public final void method647() {
        this.field4071 = false;
        ++field4007;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([I)V", line = 2999)
    public final void method610(int[] arg0) {
        ++field3943;
        arg0[0] = this.field3941;
        arg0[1] = this.field3959;
    }

    @OriginalMember(owner = "client!uca", name = "ZA", descriptor = "(Z)V", line = 3012)
    public final void method636(boolean arg0) {
        this.field4155 = arg0;
        ++field3847;
        this.method1713(32902);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(IIII)V", line = 3025)
    public final void method1755(int arg0, int arg1, int arg2, int arg3) {
        ++field3836;
        OpenGL.glTexEnvi(8960, arg1 + arg3, arg0);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg2);
    }

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "(B)V", line = 3035)
    public final void method1756(byte arg0) {
        ++field3827;
        OpenGL.glLightfv(16384, 4611, this.field4149, 0);
        if (arg0 != -17) {
            this.method1705(true, (byte) 111);
        }
        OpenGL.glLightfv(16385, 4611, this.field4079, 0);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(FFF)V", line = 3047)
    public final void method619(float arg0, float arg1, float arg2) {
        class552.field8125 = arg2;
        ++field3978;
        class100.field1517 = arg1;
        class445.field6468 = arg0;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Luo;I)V", line = 3059)
    public final void method708(class620 arg0, int arg1) {
        this.field4002.method3294(arg1, arg0, 1600, this);
        ++field3826;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIII)V", line = 3067)
    public final void method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3971;
        this.method1728(1);
        this.method1721(72, arg5);
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

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(IIIII)V", line = 3100)
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field3835;
        if (~(arg0 + arg2) <= ~this.field4110 && ~(-arg2 + arg0) >= ~this.field4100 && this.field4152 <= arg1 + arg2 && this.field4136 >= arg1 - arg2) {
            this.method1728(1);
            this.method1721(62, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field4070) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field4063 >= (float) var8) {
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
                    if (~var9 < -513) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class334.method2048(var9, (byte) -55);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class347.field5140[var11] * (float) arg2 + var6, class347.field5126[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIII)V", line = 3176)
    public final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field3904;
        this.method609(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "()V", line = 3189)
    public final void method697() {
        for (class381 var1 = this.field4023.method1904(false); var1 != null; var1 = this.field4023.method1901(96)) {
            ((class59) var1).method369((byte) 110);
        }
        ++field3955;
        if (this.field4012 != null) {
            this.field4012.method247(-79);
        }
        if (this.field3874 != null) {
            this.method1729(123);
            Enumeration var2 = this.field3893.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3893.get(var3);
                this.field3874.releaseSurface(var3, var4);
            }
            this.field3874.release();
            this.field3874 = null;
        }
        if (this.field4024) {
            class541.method3181((byte) 47, false, true);
            this.field4024 = false;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIF)Ltg;", line = 3234)
    public final class334 method687(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3976;
        return new class544(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uca", name = "O", descriptor = "(IIIIII)Z", line = 3242)
    public final boolean method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3998;
        float var7 = (float) arg2 * this.field4052.field2671 + (float) arg0 * this.field4052.field2649 + (float) arg1 * this.field4052.field2668 + this.field4052.field2679;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4052.field2671 + (float) arg3 * this.field4052.field2649 + (float) arg4 * this.field4052.field2668 + this.field4052.field2679;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4080) || !(var8 < (float) this.field4080)) && (!(var7 > (float) this.field4127) || !(var8 > (float) this.field4127))) {
            int var9 = (int) (((float) arg2 * this.field4052.field2664 + (float) arg0 * this.field4052.field2644 + (float) arg1 * this.field4052.field2655 + this.field4052.field2642) * (float) this.field4161 / var7);
            int var10 = (int) (((float) arg5 * this.field4052.field2664 + (float) arg3 * this.field4052.field2644 + (float) arg4 * this.field4052.field2655 + this.field4052.field2642) * (float) this.field4161 / var8);
            if ((float) var9 < this.field4092 && (float) var10 < this.field4092 || (float) var9 > this.field4085 && this.field4085 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4052.field2674 + (float) arg0 * this.field4052.field2654 + (float) arg1 * this.field4052.field2672 + this.field4052.field2661) * (float) this.field4059 / var7);
                int var12 = (int) (((float) arg5 * this.field4052.field2674 + (float) arg3 * this.field4052.field2654 + (float) arg4 * this.field4052.field2672 + this.field4052.field2661) * (float) this.field4059 / var8);
                return (!((float) var11 < this.field4146) || !(this.field4146 > (float) var12)) && (!((float) var11 > this.field4158) || !(this.field4158 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)V", line = 3280)
    public final void method665(int arg0) {
        this.method1731((byte) 0);
        ++field3830;
    }

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "()Z", line = 3290)
    public final boolean method694() {
        ++field3964;
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IJ)V", line = 3298)
    public final synchronized void method1757(int arg0, long arg1) {
        ++field3844;
        class381 var4 = new class381();
        var4.field5740 = arg1;
        int var5 = -22 / ((43 - arg0) / 36);
        this.field4047.method1909(var4, (byte) -81);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BI)V", line = 3312)
    public final synchronized void method1758(byte arg0, int arg1) {
        ++field3894;
        class381 var3 = new class381();
        var3.field5740 = (long) arg1;
        this.field4046.method1909(var3, (byte) -81);
        if (arg0 > -24) {
            this.method629(-67, 81, -38, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(ZI)V", line = 3326)
    public final void method1759(boolean arg0, int arg1) {
        ++field4003;
        class431.field6265[1] = (float) class425.method2563(arg1, 65280) / 65280.0F;
        class431.field6265[0] = (float) class425.method2563(16711680, arg1) / 1.671168E7F;
        class431.field6265[2] = (float) class425.method2563(255, arg1) / 255.0F;
        class431.field6265[3] = (float) (arg1 >>> 24) / 255.0F;
        if (!arg0) {
            this.field4132 = true;
        }
        OpenGL.glTexEnvfv(8960, 8705, class431.field6265, 0);
    }

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "(IIIIII)V", line = 3342)
    public final void method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3909;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1728(1);
        this.method1721(-126, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4145) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4145) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(BI)I", line = 3378)
    public final int method1760(byte arg0, int arg1) {
        ++field3824;
        if (arg0 <= 2) {
            this.field4039 = 105;
        }
        if (~arg1 == -2) {
            return 7681;
        } else if (~arg1 == -1) {
            return 8448;
        } else if (arg1 != 2) {
            if (~arg1 != -4) {
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

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "()Z", line = 3408)
    public final boolean method630() {
        ++field3999;
        return this.field4145 && (!this.method705() || this.field4095);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(II)I", line = 3416)
    public final int method661(int arg0, int arg1) {
        ++field3950;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "(II)V", line = 3424)
    public final void method1761(int arg0, int arg1) {
        if (arg1 != 260) {
            this.field4104 = null;
        }
        this.method1717(true, arg0, (byte) 102);
        ++field4013;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)V", line = 3435)
    public final void method713(boolean arg0) {
        ++field3834;
    }

    @OriginalMember(owner = "client!uca", name = "U", descriptor = "()I", line = 3447)
    public final int method608() {
        ++field3982;
        return this.field4127;
    }

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "(B)V", line = 3460)
    private final void method1762(byte arg0) {
        if (arg0 != 59) {
            this.field4083 = 100;
        }
        if (~this.field4087 != -4) {
            this.field4087 = 3;
            this.method1723((byte) -115);
            this.method1752(-28257);
            this.field4049 &= -8;
        }
        ++field3985;
    }

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "(I)V", line = 3480)
    public final void method690(int arg0) {
        ++field4009;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field4015 = arg0;
            this.field4001.method3478(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "(B)V", line = 3493)
    public final void method1763(byte arg0) {
        ++field3915;
        if (arg0 <= -113) {
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "()Z", line = 3504)
    public final boolean method663() {
        ++field3823;
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(II[I[I)Lua;", line = 3512)
    public final class591 method617(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3851;
        return class653.method3693(this, 30705, arg1, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "()Z", line = 3524)
    public final boolean method649() {
        ++field3930;
        return this.field4014.method363(120, 3);
    }

    @OriginalMember(owner = "client!uca", name = "MA", descriptor = "(III[I)V", line = 3532)
    public final void method620(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3850;
        float var5 = (float) arg2 * this.field4052.field2671 + (float) arg0 * this.field4052.field2649 + (float) arg1 * this.field4052.field2668 + this.field4052.field2679;
        if (!(var5 < (float) this.field4080) && !((float) this.field4127 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4052.field2664 + (float) arg0 * this.field4052.field2644 + (float) arg1 * this.field4052.field2655 + this.field4052.field2642) * (float) this.field4161 / var5);
            int var7 = (int) (((float) arg2 * this.field4052.field2674 + (float) arg0 * this.field4052.field2654 + (float) arg1 * this.field4052.field2672 + this.field4052.field2661) * (float) this.field4059 / var5);
            arg3[0] = (int) ((float) var6 + -this.field4092);
            arg3[1] = (int) ((float) var7 + -this.field4146);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(IBI)V", line = 3554)
    public final void method1764(int arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            this.field4076 = null;
        }
        ++field3917;
        this.field4093 = arg0;
        this.field4148 = arg2;
        this.method1727(arg1 ^ -46);
        this.method1743(0);
    }

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "(II)V", line = 3569)
    public final synchronized void method1765(int arg0, int arg1) {
        ++field3889;
        class258 var3 = new class258(arg0);
        if (arg1 != 5532) {
            this.method634(10, 34, -116, -103, 16, -120, -116, -19, -47, 0);
        }
        this.field4044.method1909(var3, (byte) -81);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(IIIIII)Lrs;", line = 3585)
    public final class649 method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3919;
        return !this.field4090 ? null : new class245(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(Z)V", line = 3593)
    private final void method1766(boolean arg0) {
        this.field4091[14] = this.field4159;
        if (!arg0) {
            ++field3926;
            this.field4091[10] = this.field4115;
            this.field4103 = (float) this.field4127;
            this.field4077 = (this.field4091[14] + (float) (-this.field4127)) / this.field4091[10];
        }
    }

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "()[I", line = 3623)
    public final int[] method625() {
        ++field3920;
        return new int[] { this.field4154, this.field4129, this.field4161, this.field4059 };
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lbb;B)V", line = 3631)
    public final void method1767(class196 arg0, byte arg1) {
        ++field3936;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method1284(true), 0);
        if (arg1 != 18) {
            this.field4167 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "()I", line = 3644)
    public final int method615() {
        ++field3819;
        return this.field4040 + this.field4038 + this.field4039;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lf;Z)V", line = 3652)
    public final void method673(class256 arg0, boolean arg1) {
        this.field4026 = (class503) arg0;
        ++field3951;
        if (this.field4062) {
            if (this.field4033 == null) {
                this.field4033 = new class559(this);
            }
            if (this.field4033 == this.field4030) {
                throw new RuntimeException();
            }
            this.method1740(this.field4033, (byte) 111);
            if (arg1) {
                class267 var3 = (class267) this.field4036.method2002((byte) -126, (long) (this.field4026.method48() << 16 | this.field4026.method56()));
                if (var3 == null) {
                    var3 = new class267(this, 6402, this.field4026.method48(), this.field4026.method56());
                    class267 var5;
                    for (this.field4041 += var3.field3479; ~this.field4041 < -2097153; this.field4041 -= var5.field3479) {
                        class321 var4 = this.field4027.method1130((byte) -64);
                        if (var4 == null) {
                            break;
                        }
                        var5 = (class267) var4;
                        var5.method1989((byte) 51);
                        var5.method2360((byte) 66);
                        var5.method1599(36161);
                    }
                    this.field4036.method2001(108, var3, (long) (this.field4026.method48() << 16 | this.field4026.method56()));
                }
                this.field4027.method1131(53, var3);
                this.field4033.method3239(var3, 8, false);
            }
            this.field4033.method3235(-125, this.field4026.field7120, 0);
        } else {
            if (!this.field4065) {
                throw new RuntimeException("");
            }
            class651 var6 = (class651) this.field4036.method2002((byte) -114, (long) (this.field4026.method48() << 16 | this.field4026.method56()));
            if (var6 == null) {
                var6 = new class651(this, this.field4026.method48(), this.field4026.method56());
                class651 var8;
                for (this.field4041 += var6.field9322 * 4; this.field4041 > 2097152; this.field4041 -= var8.field9322) {
                    class321 var7 = this.field4027.method1130((byte) -64);
                    if (var7 == null) {
                        break;
                    }
                    var8 = (class651) var7;
                    var8.method1989((byte) 113);
                    var8.method2360((byte) 66);
                    this.field3874.releasePbuffer(var8.method3686(16));
                }
                this.field4036.method2001(-123, var6, (long) (this.field4026.method48() << 16 | this.field4026.method56()));
            }
            this.field4027.method1131(-88, var6);
            this.field3874.setPbuffer(var6.method3686(16));
        }
        this.field3941 = arg0.method48();
        this.field3959 = arg0.method56();
        this.method1703((byte) -90);
        this.method1727(1);
        this.method699();
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V", line = 3749)
    public final synchronized void method639(int arg0) {
        ++field3888;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4042.method1903(-63)) {
            class258 var12 = (class258) this.field4042.method1902(109);
            class319.field4640[var2++] = (int) var12.field5740;
            this.field4040 -= var12.field3352;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class319.field4640, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class319.field4640, 0);
            var2 = 0;
        }
        while (!this.field4043.method1903(-19)) {
            class258 var11 = (class258) this.field4043.method1902(114);
            class319.field4640[var2++] = (int) var11.field5740;
            this.field4038 -= var11.field3352;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class319.field4640, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class319.field4640, 0);
            var2 = 0;
        }
        while (!this.field4044.method1903(-14)) {
            class258 var10 = (class258) this.field4044.method1902(106);
            class319.field4640[var2++] = var10.field3352;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class319.field4640, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class319.field4640, 0);
            var2 = 0;
        }
        while (!this.field4045.method1903(-109)) {
            class258 var9 = (class258) this.field4045.method1902(124);
            class319.field4640[var2++] = (int) var9.field5740;
            this.field4039 -= var9.field3352;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class319.field4640, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class319.field4640, 0);
            boolean var4 = false;
        }
        while (!this.field4037.method1903(-25)) {
            class258 var8 = (class258) this.field4037.method1902(113);
            OpenGL.glDeleteLists((int) var8.field5740, var8.field3352);
        }
        while (!this.field4046.method1903(-76)) {
            class381 var7 = this.field4046.method1902(113);
            OpenGL.glDeleteProgramARB((int) var7.field5740);
        }
        while (!this.field4047.method1903(-70)) {
            class381 var6 = this.field4047.method1902(103);
            OpenGL.glDeleteObjectARB(var6.field5740);
        }
        while (!this.field4037.method1903(-99)) {
            class258 var5 = (class258) this.field4037.method1902(113);
            OpenGL.glDeleteLists((int) var5.field5740, var5.field3352);
        }
        this.field4001.method3480(false);
        if (~this.method615() < -100663297 && class60.method371(false) > this.field4055 - -60000L) {
            System.gc();
            this.field4055 = class60.method371(false);
        }
        this.field4020 = var3;
    }

    @OriginalMember(owner = "client!uca", name = "va", descriptor = "(I)V", line = 3917)
    public final void method659(int arg0) {
        ++field3876;
        this.field4019 = 0;
        while (~arg0 < -2) {
            ++this.field4019;
            arg0 >>= 1;
        }
        this.field4022 = 1 << this.field4019;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Luo;)V", line = 3941)
    public final void method679(class620 arg0) {
        this.field4002.method3294(-1, arg0, 1600, this);
        ++field3853;
    }

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "()Lq;", line = 3950)
    public final class151 method658() {
        ++field3829;
        return this.field4052;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(BI)I", line = 3959)
    public final int method1768(byte arg0, int arg1) {
        if (arg0 != 91) {
            this.field4123 = true;
        }
        ++field3997;
        if (~arg1 != -6407 && arg1 != 6409) {
            if (~arg1 != -6411 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 != 6408 && arg1 != 34847) {
                    if (arg1 != 34843) {
                        if (arg1 == 34842) {
                            return 8;
                        } else if (~arg1 == -6403) {
                            return 3;
                        } else if (arg1 == 6401) {
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

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "(I)V", line = 4001)
    public static void method1769(int arg0) {
        if (arg0 == 256) {
            field3984 = null;
            field3869 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lrs;Lrs;FLrs;)Lrs;", line = 4014)
    public final class649 method707(class649 arg0, class649 arg1, float arg2, class649 arg3) {
        ++field3988;
        if (arg0 != null && arg1 != null && this.field4090 && this.field4062) {
            class442 var5 = null;
            class636 var6 = (class636) arg0;
            class636 var7 = (class636) arg1;
            class364 var8 = var6.method1498(-90);
            class364 var9 = var7.method1498(-68);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field5338 <= ~var8.field5338 ? var9.field5338 : var8.field5338;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class442) {
                    class442 var11 = (class442) arg3;
                    if (var11.method2610(-5043) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class442(this, var10);
                }
                if (var5.method2613(var8, arg2, var9, (byte) 68)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lrs;)V", line = 4064)
    public final void method611(class649 arg0) {
        ++field3822;
        this.field4134 = (class636) arg0;
    }

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "()Lq;", line = 4079)
    public final class151 method682() {
        ++field3974;
        return this.field4016;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(ZB)V", line = 4092)
    public final void method1770(boolean arg0, byte arg1) {
        int var3 = 79 / ((arg1 - 11) / 44);
        if (this.field4156 != arg0) {
            this.field4156 = arg0;
            this.method1735(2);
            this.field4049 &= -32;
        }
        ++field3846;
    }

    @OriginalMember(owner = "client!uca", name = "ja", descriptor = "(I)V", line = 4109)
    public final void method646(int arg0) {
        this.method1721(46, 0);
        ++field3838;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!uca", name = "VA", descriptor = "(IFFFFF)V", line = 4123)
    public final void method607(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3981;
        boolean var7 = ~this.field4118 != ~arg0;
        if (var7 || this.field4108 != arg1 || this.field4125 != arg2) {
            this.field4125 = arg2;
            this.field4108 = arg1;
            this.field4118 = arg0;
            if (var7) {
                this.field4061 = (float) (255 & this.field4118) / 255.0F;
                this.field4088 = (float) (16711680 & this.field4118) / 1.671168E7F;
                this.field4072 = (float) (this.field4118 & 65280) / 65280.0F;
                this.method1747(63);
            }
            this.method1741((byte) -86);
        }
        if (this.field4166[0] != arg3 || this.field4166[1] != arg4 || this.field4166[2] != arg5) {
            this.field4166[0] = arg3;
            this.field4166[1] = arg4;
            this.field4166[2] = arg5;
            this.field4120[1] = -arg4;
            this.field4120[2] = -arg5;
            this.field4120[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4149[1] = arg4 * var8;
            this.field4149[0] = arg3 * var8;
            this.field4149[2] = arg5 * var8;
            this.field4079[1] = -this.field4149[1];
            this.field4079[2] = -this.field4149[2];
            this.field4079[0] = -this.field4149[0];
            this.method1756((byte) -17);
            this.field4143 = (int) (arg3 * 256.0F / arg4);
            this.field4112 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!uca", name = "T", descriptor = "()I", line = 4176)
    public final int method627() {
        ++field3849;
        int var1 = this.field4174;
        this.field4174 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "(I)V", line = 4187)
    private final void method1771(int arg0) {
        this.field4146 = (float) (this.field4152 - this.field4129);
        this.field4085 = (float) (-this.field4154 + this.field4100);
        ++field3918;
        this.field4158 = (float) (-this.field4129 + this.field4136);
        if (arg0 != -5489) {
            this.field4034 = null;
        }
        this.field4092 = (float) (-this.field4154 + this.field4110);
    }

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "(IIII)[I", line = 4205)
    public final int[] method702(int arg0, int arg1, int arg2, int arg3) {
        ++field3884;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field3959 + -var6, arg2, 1, 32993, this.field4069, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uca", name = "la", descriptor = "(IIII)V", line = 4229)
    public final void method667(int arg0, int arg1, int arg2, int arg3) {
        this.field4129 = arg1;
        ++field3934;
        this.field4059 = arg3;
        this.field4154 = arg0;
        this.field4161 = arg2;
        this.method1704(-12692);
        this.method1771(-5489);
        if (~this.field4087 != -4) {
            if (this.field4087 == 2) {
                this.method1734(4);
                return;
            }
        } else {
            this.method1723((byte) -115);
        }
    }

    @OriginalMember(owner = "client!uca", name = "pa", descriptor = "(III)V", line = 4255)
    public final void method718(int arg0, int arg1, int arg2) {
        ++field3887;
        if (~this.field4163 != ~arg0 || ~this.field4068 != ~arg1 || this.field4094 != arg2) {
            this.field4094 = arg2;
            this.field4163 = arg0;
            this.field4068 = arg1;
            this.method1739(-101);
            this.method1735(2);
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 4273)
    public final void method641(Canvas arg0) {
        ++field3833;
        long var2 = 0L;
        if (arg0 != null && this.field3939 != arg0) {
            if (this.field3893.containsKey(arg0)) {
                Long var4 = (Long) this.field3893.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field3865;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field3874.surfaceResized(var2);
            if (this.field3871 == arg0) {
                this.method1715(0);
            }
        }
    }
}
