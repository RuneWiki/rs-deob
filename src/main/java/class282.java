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

@OriginalClass("client!bv")
public class class282 extends class496 {

    @OriginalMember(owner = "client!bv", name = "Ac", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3990 = new Hashtable();

    @OriginalMember(owner = "client!bv", name = "he", descriptor = "I")
    public int field4075 = 128;

    @OriginalMember(owner = "client!bv", name = "Wd", descriptor = "Lon;")
    private class503 field4064 = new class503();

    @OriginalMember(owner = "client!bv", name = "ie", descriptor = "Lrc;")
    private class120 field4076 = new class120();

    @OriginalMember(owner = "client!bv", name = "je", descriptor = "Lrc;")
    public class120 field4077 = new class120();

    @OriginalMember(owner = "client!bv", name = "me", descriptor = "I")
    public int field4080 = 3;

    @OriginalMember(owner = "client!bv", name = "oe", descriptor = "Z")
    private boolean field4082 = false;

    @OriginalMember(owner = "client!bv", name = "re", descriptor = "I")
    public int field4085 = 8;

    @OriginalMember(owner = "client!bv", name = "pe", descriptor = "Lvr;")
    private class306 field4083 = new class306();

    @OriginalMember(owner = "client!bv", name = "te", descriptor = "[Lcc;")
    private class122[] field4087 = new class122[4];

    @OriginalMember(owner = "client!bv", name = "xe", descriptor = "I")
    private int field4091 = -1;

    @OriginalMember(owner = "client!bv", name = "we", descriptor = "[Lcc;")
    private class122[] field4090 = new class122[4];

    @OriginalMember(owner = "client!bv", name = "ue", descriptor = "[Lcc;")
    private class122[] field4088 = new class122[4];

    @OriginalMember(owner = "client!bv", name = "ye", descriptor = "I")
    private int field4092 = -1;

    @OriginalMember(owner = "client!bv", name = "ze", descriptor = "I")
    private int field4093 = -1;

    @OriginalMember(owner = "client!bv", name = "Ee", descriptor = "Lvr;")
    private class306 field4098;

    @OriginalMember(owner = "client!bv", name = "Fe", descriptor = "Lvr;")
    private class306 field4099;

    @OriginalMember(owner = "client!bv", name = "Ge", descriptor = "Lvr;")
    private class306 field4100;

    @OriginalMember(owner = "client!bv", name = "He", descriptor = "Lvr;")
    private class306 field4101;

    @OriginalMember(owner = "client!bv", name = "Ie", descriptor = "Lvr;")
    private class306 field4102;

    @OriginalMember(owner = "client!bv", name = "Je", descriptor = "Lvr;")
    private class306 field4103;

    @OriginalMember(owner = "client!bv", name = "Ke", descriptor = "Lvr;")
    private class306 field4104;

    @OriginalMember(owner = "client!bv", name = "Me", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!bv", name = "Ve", descriptor = "I")
    private int field4115;

    @OriginalMember(owner = "client!bv", name = "hf", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!bv", name = "Qe", descriptor = "[F")
    public float[] field4110;

    @OriginalMember(owner = "client!bv", name = "qf", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!bv", name = "ff", descriptor = "I")
    private int field4125;

    @OriginalMember(owner = "client!bv", name = "yf", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!bv", name = "Re", descriptor = "F")
    public float field4111;

    @OriginalMember(owner = "client!bv", name = "Tf", descriptor = "I")
    private int field4164;

    @OriginalMember(owner = "client!bv", name = "Xf", descriptor = "I")
    private int field4168;

    @OriginalMember(owner = "client!bv", name = "Sf", descriptor = "F")
    public float field4163;

    @OriginalMember(owner = "client!bv", name = "uf", descriptor = "F")
    private float field4139;

    @OriginalMember(owner = "client!bv", name = "jf", descriptor = "[F")
    private float[] field4128;

    @OriginalMember(owner = "client!bv", name = "lg", descriptor = "F")
    public float field4182;

    @OriginalMember(owner = "client!bv", name = "Pf", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!bv", name = "gg", descriptor = "F")
    public float field4177;

    @OriginalMember(owner = "client!bv", name = "qg", descriptor = "[F")
    private float[] field4187;

    @OriginalMember(owner = "client!bv", name = "Uf", descriptor = "F")
    public float field4165;

    @OriginalMember(owner = "client!bv", name = "ig", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!bv", name = "Nf", descriptor = "I")
    private int field4158;

    @OriginalMember(owner = "client!bv", name = "yg", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!bv", name = "sf", descriptor = "F")
    public float field4137;

    @OriginalMember(owner = "client!bv", name = "If", descriptor = "Z")
    private boolean field4153;

    @OriginalMember(owner = "client!bv", name = "Mg", descriptor = "[F")
    private float[] field4209;

    @OriginalMember(owner = "client!bv", name = "Gf", descriptor = "[Ldd;")
    private class471[] field4151;

    @OriginalMember(owner = "client!bv", name = "ng", descriptor = "I")
    private int field4184;

    @OriginalMember(owner = "client!bv", name = "Dg", descriptor = "I")
    public int field4200;

    @OriginalMember(owner = "client!bv", name = "og", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!bv", name = "bg", descriptor = "F")
    private float field4172;

    @OriginalMember(owner = "client!bv", name = "We", descriptor = "I")
    private int field4116;

    @OriginalMember(owner = "client!bv", name = "wg", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!bv", name = "Yf", descriptor = "F")
    public float field4169;

    @OriginalMember(owner = "client!bv", name = "xg", descriptor = "F")
    public float field4194;

    @OriginalMember(owner = "client!bv", name = "Tg", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!bv", name = "Sg", descriptor = "[F")
    private float[] field4215;

    @OriginalMember(owner = "client!bv", name = "ag", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!bv", name = "mg", descriptor = "I")
    private int field4183;

    @OriginalMember(owner = "client!bv", name = "xf", descriptor = "I")
    private int field4142;

    @OriginalMember(owner = "client!bv", name = "Wg", descriptor = "F")
    private float field4219;

    @OriginalMember(owner = "client!bv", name = "Yd", descriptor = "I")
    public int field4066;

    @OriginalMember(owner = "client!bv", name = "Dd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4045;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3889;

    @OriginalMember(owner = "client!bv", name = "nb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field3925;

    @OriginalMember(owner = "client!bv", name = "wd", descriptor = "J")
    private long field4038;

    @OriginalMember(owner = "client!bv", name = "kb", descriptor = "J")
    private long field3922;

    @OriginalMember(owner = "client!bv", name = "Ag", descriptor = "Z")
    public boolean field4197;

    @OriginalMember(owner = "client!bv", name = "bf", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!bv", name = "tg", descriptor = "Ljava/lang/String;")
    private String field4190;

    @OriginalMember(owner = "client!bv", name = "sg", descriptor = "Z")
    private boolean field4189;

    @OriginalMember(owner = "client!bv", name = "Yg", descriptor = "Z")
    public boolean field4221;

    @OriginalMember(owner = "client!bv", name = "Bf", descriptor = "Z")
    public boolean field4146;

    @OriginalMember(owner = "client!bv", name = "Kf", descriptor = "Z")
    public boolean field4155;

    @OriginalMember(owner = "client!bv", name = "rf", descriptor = "Z")
    private boolean field4136;

    @OriginalMember(owner = "client!bv", name = "Ue", descriptor = "Ljava/lang/String;")
    private String field4114;

    @OriginalMember(owner = "client!bv", name = "Of", descriptor = "Z")
    public boolean field4159;

    @OriginalMember(owner = "client!bv", name = "vg", descriptor = "Z")
    private boolean field4192;

    @OriginalMember(owner = "client!bv", name = "de", descriptor = "Lej;")
    public class517 field4071;

    @OriginalMember(owner = "client!bv", name = "ne", descriptor = "Lng;")
    public class268 field4081;

    @OriginalMember(owner = "client!bv", name = "fe", descriptor = "Lcg;")
    private class10 field4073;

    @OriginalMember(owner = "client!bv", name = "be", descriptor = "Lff;")
    private class209 field4069;

    @OriginalMember(owner = "client!bv", name = "Xd", descriptor = "Lpc;")
    private class188 field4065;

    @OriginalMember(owner = "client!bv", name = "od", descriptor = "Lpg;")
    public static class492 field4030;

    @OriginalMember(owner = "client!bv", name = "le", descriptor = "Lui;")
    public static class375 field4079;

    @OriginalMember(owner = "client!bv", name = "Te", descriptor = "F")
    public float field4113;

    @OriginalMember(owner = "client!bv", name = "Ef", descriptor = "F")
    private float field4149;

    @OriginalMember(owner = "client!bv", name = "Lf", descriptor = "F")
    public float field4156;

    @OriginalMember(owner = "client!bv", name = "cg", descriptor = "F")
    public float field4173;

    @OriginalMember(owner = "client!bv", name = "eg", descriptor = "F")
    public float field4175;

    @OriginalMember(owner = "client!bv", name = "rg", descriptor = "F")
    public float field4188;

    @OriginalMember(owner = "client!bv", name = "Hg", descriptor = "F")
    private float field4204;

    @OriginalMember(owner = "client!bv", name = "Pg", descriptor = "F")
    public float field4212;

    @OriginalMember(owner = "client!bv", name = "Ug", descriptor = "F")
    public float field4217;

    @OriginalMember(owner = "client!bv", name = "Zg", descriptor = "F")
    private float field4222;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!bv", name = "P", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!bv", name = "Q", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!bv", name = "R", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!bv", name = "S", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!bv", name = "T", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!bv", name = "U", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!bv", name = "V", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!bv", name = "W", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!bv", name = "X", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!bv", name = "Y", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!bv", name = "Z", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!bv", name = "ab", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!bv", name = "bb", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!bv", name = "cb", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!bv", name = "db", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!bv", name = "eb", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!bv", name = "fb", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!bv", name = "gb", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!bv", name = "hb", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!bv", name = "ib", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!bv", name = "jb", descriptor = "I")
    private int field3921;

    @OriginalMember(owner = "client!bv", name = "lb", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!bv", name = "mb", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!bv", name = "ob", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!bv", name = "pb", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!bv", name = "qb", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!bv", name = "rb", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!bv", name = "sb", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!bv", name = "tb", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!bv", name = "ub", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!bv", name = "vb", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!bv", name = "wb", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!bv", name = "xb", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!bv", name = "yb", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!bv", name = "zb", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!bv", name = "Ab", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!bv", name = "Bb", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!bv", name = "Cb", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!bv", name = "Db", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!bv", name = "Eb", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!bv", name = "Fb", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!bv", name = "Gb", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!bv", name = "Hb", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!bv", name = "Ib", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!bv", name = "Jb", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!bv", name = "Kb", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!bv", name = "Lb", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!bv", name = "Mb", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!bv", name = "Nb", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!bv", name = "Ob", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!bv", name = "Pb", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!bv", name = "Qb", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!bv", name = "Rb", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!bv", name = "Sb", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!bv", name = "Tb", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!bv", name = "Ub", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!bv", name = "Vb", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!bv", name = "Wb", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!bv", name = "Xb", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!bv", name = "Yb", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!bv", name = "Zb", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!bv", name = "ac", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!bv", name = "bc", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!bv", name = "cc", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!bv", name = "dc", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!bv", name = "ec", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!bv", name = "fc", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!bv", name = "gc", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!bv", name = "hc", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!bv", name = "ic", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!bv", name = "jc", descriptor = "I")
    private int field3973;

    @OriginalMember(owner = "client!bv", name = "kc", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!bv", name = "lc", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!bv", name = "mc", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!bv", name = "nc", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!bv", name = "oc", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!bv", name = "pc", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!bv", name = "qc", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!bv", name = "rc", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!bv", name = "sc", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!bv", name = "tc", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!bv", name = "uc", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!bv", name = "vc", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!bv", name = "wc", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!bv", name = "xc", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!bv", name = "yc", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!bv", name = "zc", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!bv", name = "Bc", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!bv", name = "Cc", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!bv", name = "Dc", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!bv", name = "Ec", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!bv", name = "Fc", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!bv", name = "Gc", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!bv", name = "Hc", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!bv", name = "Ic", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!bv", name = "Jc", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!bv", name = "Kc", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!bv", name = "Lc", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!bv", name = "Mc", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!bv", name = "Nc", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!bv", name = "Oc", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!bv", name = "Pc", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!bv", name = "Qc", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!bv", name = "Rc", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!bv", name = "Sc", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!bv", name = "Tc", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!bv", name = "Uc", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!bv", name = "Vc", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!bv", name = "Wc", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!bv", name = "Xc", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!bv", name = "Yc", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!bv", name = "Zc", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!bv", name = "ad", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!bv", name = "bd", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!bv", name = "cd", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!bv", name = "dd", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!bv", name = "ed", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!bv", name = "fd", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!bv", name = "gd", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!bv", name = "hd", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!bv", name = "id", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!bv", name = "jd", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!bv", name = "kd", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!bv", name = "ld", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!bv", name = "md", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!bv", name = "nd", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!bv", name = "pd", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!bv", name = "qd", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!bv", name = "rd", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!bv", name = "sd", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!bv", name = "td", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!bv", name = "ud", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!bv", name = "vd", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!bv", name = "xd", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!bv", name = "yd", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!bv", name = "zd", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!bv", name = "Ad", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!bv", name = "Bd", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!bv", name = "Cd", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!bv", name = "Ed", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!bv", name = "Fd", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!bv", name = "Gd", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!bv", name = "Hd", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!bv", name = "Id", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!bv", name = "Jd", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!bv", name = "Kd", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!bv", name = "Ld", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!bv", name = "Md", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!bv", name = "Nd", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!bv", name = "Od", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!bv", name = "Pd", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!bv", name = "Qd", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!bv", name = "Rd", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!bv", name = "Sd", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!bv", name = "Td", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!bv", name = "Ud", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!bv", name = "Vd", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!bv", name = "Zd", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!bv", name = "ae", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!bv", name = "ce", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!bv", name = "ee", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!bv", name = "ge", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!bv", name = "ke", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!bv", name = "se", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!bv", name = "Be", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!bv", name = "Ce", descriptor = "I")
    private int field4096;

    @OriginalMember(owner = "client!bv", name = "De", descriptor = "I")
    public int field4097;

    @OriginalMember(owner = "client!bv", name = "Le", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!bv", name = "Se", descriptor = "I")
    private int field4112;

    @OriginalMember(owner = "client!bv", name = "Xe", descriptor = "I")
    private int field4117;

    @OriginalMember(owner = "client!bv", name = "df", descriptor = "I")
    private int field4123;

    @OriginalMember(owner = "client!bv", name = "lf", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!bv", name = "mf", descriptor = "I")
    private int field4131;

    @OriginalMember(owner = "client!bv", name = "nf", descriptor = "I")
    private int field4132;

    @OriginalMember(owner = "client!bv", name = "vf", descriptor = "I")
    private int field4140;

    @OriginalMember(owner = "client!bv", name = "Cf", descriptor = "I")
    private int field4147;

    @OriginalMember(owner = "client!bv", name = "Df", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!bv", name = "Mf", descriptor = "I")
    private int field4157;

    @OriginalMember(owner = "client!bv", name = "Rf", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!bv", name = "Vf", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!bv", name = "hg", descriptor = "I")
    private int field4178;

    @OriginalMember(owner = "client!bv", name = "ug", descriptor = "I")
    public int field4191;

    @OriginalMember(owner = "client!bv", name = "Jg", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!bv", name = "Qg", descriptor = "I")
    private int field4213;

    @OriginalMember(owner = "client!bv", name = "Eg", descriptor = "J")
    private long field4201;

    @OriginalMember(owner = "client!bv", name = "cf", descriptor = "Lrc;")
    public class120 field4122;

    @OriginalMember(owner = "client!bv", name = "zf", descriptor = "Lrc;")
    public class120 field4144;

    @OriginalMember(owner = "client!bv", name = "ve", descriptor = "Lcc;")
    private class122 field4089;

    @OriginalMember(owner = "client!bv", name = "Ae", descriptor = "Lcc;")
    private class122 field4094;

    @OriginalMember(owner = "client!bv", name = "Gg", descriptor = "Ltu;")
    private class176 field4203;

    @OriginalMember(owner = "client!bv", name = "Oe", descriptor = "Lag;")
    public class308 field4108;

    @OriginalMember(owner = "client!bv", name = "af", descriptor = "Lag;")
    public class308 field4120;

    @OriginalMember(owner = "client!bv", name = "kf", descriptor = "Lag;")
    public class308 field4129;

    @OriginalMember(owner = "client!bv", name = "wf", descriptor = "Lag;")
    public class308 field4141;

    @OriginalMember(owner = "client!bv", name = "Af", descriptor = "Lag;")
    public class308 field4145;

    @OriginalMember(owner = "client!bv", name = "Zf", descriptor = "Lag;")
    public class308 field4170;

    @OriginalMember(owner = "client!bv", name = "Fg", descriptor = "Lag;")
    public class308 field4202;

    @OriginalMember(owner = "client!bv", name = "Lg", descriptor = "Lag;")
    public class308 field4208;

    @OriginalMember(owner = "client!bv", name = "Vg", descriptor = "Lag;")
    public class308 field4218;

    @OriginalMember(owner = "client!bv", name = "Xg", descriptor = "Lag;")
    public class308 field4220;

    @OriginalMember(owner = "client!bv", name = "gf", descriptor = "Lks;")
    public class317 field4126;

    @OriginalMember(owner = "client!bv", name = "jg", descriptor = "Lks;")
    public class317 field4180;

    @OriginalMember(owner = "client!bv", name = "Hf", descriptor = "Ltb;")
    private class339 field4152;

    @OriginalMember(owner = "client!bv", name = "fg", descriptor = "Log;")
    private class346 field4176;

    @OriginalMember(owner = "client!bv", name = "Ze", descriptor = "Lwg;")
    public class393 field4119;

    @OriginalMember(owner = "client!bv", name = "Qf", descriptor = "Lwg;")
    public class393 field4161;

    @OriginalMember(owner = "client!bv", name = "Ng", descriptor = "Lwg;")
    public class393 field4210;

    @OriginalMember(owner = "client!bv", name = "kg", descriptor = "Lgf;")
    private class46 field4181;

    @OriginalMember(owner = "client!bv", name = "ch", descriptor = "Lgf;")
    private class46 field4225;

    @OriginalMember(owner = "client!bv", name = "tf", descriptor = "Lit;")
    public class509 field4138;

    @OriginalMember(owner = "client!bv", name = "Og", descriptor = "Lit;")
    public class509 field4211;

    @OriginalMember(owner = "client!bv", name = "qe", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4084;

    @OriginalMember(owner = "client!bv", name = "Ne", descriptor = "Z")
    private boolean field4107;

    @OriginalMember(owner = "client!bv", name = "Pe", descriptor = "Z")
    public boolean field4109;

    @OriginalMember(owner = "client!bv", name = "Ye", descriptor = "Z")
    public boolean field4118;

    @OriginalMember(owner = "client!bv", name = "ef", descriptor = "Z")
    private boolean field4124;

    @OriginalMember(owner = "client!bv", name = "of", descriptor = "Z")
    private boolean field4133;

    @OriginalMember(owner = "client!bv", name = "pf", descriptor = "Z")
    public boolean field4134;

    @OriginalMember(owner = "client!bv", name = "Ff", descriptor = "Z")
    public boolean field4150;

    @OriginalMember(owner = "client!bv", name = "Jf", descriptor = "Z")
    private boolean field4154;

    @OriginalMember(owner = "client!bv", name = "Wf", descriptor = "Z")
    private boolean field4167;

    @OriginalMember(owner = "client!bv", name = "dg", descriptor = "Z")
    private boolean field4174;

    @OriginalMember(owner = "client!bv", name = "pg", descriptor = "Z")
    public boolean field4186;

    @OriginalMember(owner = "client!bv", name = "zg", descriptor = "Z")
    private boolean field4196;

    @OriginalMember(owner = "client!bv", name = "Bg", descriptor = "Z")
    public boolean field4198;

    @OriginalMember(owner = "client!bv", name = "Cg", descriptor = "Z")
    public boolean field4199;

    @OriginalMember(owner = "client!bv", name = "Ig", descriptor = "Z")
    private boolean field4205;

    @OriginalMember(owner = "client!bv", name = "Kg", descriptor = "Z")
    public boolean field4207;

    @OriginalMember(owner = "client!bv", name = "Rg", descriptor = "Z")
    private boolean field4214;

    @OriginalMember(owner = "client!bv", name = "ah", descriptor = "Z")
    private boolean field4223;

    @OriginalMember(owner = "client!bv", name = "bh", descriptor = "[Lkv;")
    private class14[] field4224;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(FFF)V")
    public final void method1120(float arg0, float arg1, float arg2) {
        class288.field4296 = arg2;
        class368.field5661 = arg0;
        ++field4004;
        class290.field4306 = arg1;
    }

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "(I)V")
    private final void method1766(int arg0) {
        if (arg0 <= 19) {
            this.method1794(-113, 88);
        }
        if (this.field4214 && this.field4109 | ~this.field4179 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field3890;
    }

    @OriginalMember(owner = "client!bv", name = "ba", descriptor = "(IIII)V")
    public final void method1108(int arg0, int arg1, int arg2, int arg3) {
        ++field3927;
        if (!this.field4109) {
            throw new RuntimeException("");
        } else {
            this.field4195 = arg2;
            this.field4125 = arg1;
            this.field4148 = arg0;
            this.field4193 = arg3;
            this.field4065.field2633.method859(0);
            this.method1840(false);
        }
    }

    @OriginalMember(owner = "client!bv", name = "da", descriptor = "(IIIII)V")
    public final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3989;
        this.method1810(18845);
        this.method1802(arg4, (byte) 57);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZIIII)V")
    public static final void method1767(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (~arg3 > -2) {
            arg3 = 1;
        }
        ++field3928;
        int var6 = arg0 + -334;
        if (~var6 <= -1) {
            if (var6 > 100) {
                var6 = 100;
            }
        } else {
            var6 = 0;
        }
        int var7 = (class362.field5618 - class381.field5811) * var6 / 100 + class381.field5811;
        if (~var7 <= ~class103.field1470) {
            if (~class126.field1797 > ~var7) {
                var7 = class126.field1797;
            }
        } else {
            var7 = class103.field1470;
        }
        int var8 = arg0 * var7 * 512 / (arg3 * 334);
        if (class259.field3620 <= var8) {
            if (class405.field6123 < var8) {
                short var9 = class405.field6123;
                var7 = var9 * 334 * arg3 / (arg0 * 512);
                if (~class103.field1470 < ~var7) {
                    var7 = class103.field1470;
                    int var10 = var9 * 334 * arg3 / (var7 * 512);
                    int var11 = (-var10 + arg0) / 2;
                    if (arg1) {
                        class337.field5242.method1107();
                        class337.field5242.method2952(arg3, var11, arg5, -16777216, (byte) -53, arg4);
                        class337.field5242.method2952(arg3, var11, arg5, -16777216, (byte) -53, arg4 - -arg0 + -var11);
                    }
                    arg4 += var11;
                    arg0 -= var11 * 2;
                }
            }
        } else {
            short var12 = class259.field3620;
            var7 = arg3 * 334 * var12 / (arg0 * 512);
            if (class126.field1797 < var7) {
                var7 = class126.field1797;
                int var13 = arg0 * 512 * var7 / (var12 * 334);
                int var14 = (-var13 + arg3) / 2;
                if (arg1) {
                    class337.field5242.method1107();
                    class337.field5242.method2952(var14, arg0, arg5, -16777216, (byte) -53, arg4);
                    class337.field5242.method2952(var14, arg0, -var14 + arg5 + arg3, -16777216, (byte) -53, arg4);
                }
                arg3 -= var14 * 2;
                arg5 += var14;
            }
        }
        class99.field1429 = (short) arg0;
        class130.field1908 = (short) arg3;
        class493.field7198 = arg4;
        class290.field4312 = arg5;
        if (arg2 != -16777216) {
            method1774((byte) 20);
        }
        class57.field763 = arg0 * var7 / 334;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IB)V")
    public final synchronized void method1768(int arg0, byte arg1) {
        ++field4070;
        class74 var3 = new class74(arg0);
        int var4 = 8 / ((arg1 - 39) / 33);
        this.field4101.method1958(var3, 0);
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(Z)V")
    public final void method1114(boolean arg0) {
        ++field3981;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)I")
    public final int method1769(byte arg0, int arg1) {
        ++field3934;
        if (~arg1 == -2) {
            return 7681;
        } else if (~arg1 == -1) {
            return 8448;
        } else if (arg1 == 2) {
            return 34165;
        } else if (~arg1 == -4) {
            return 260;
        } else if (~arg1 == -5) {
            return 34023;
        } else {
            if (arg0 != 93) {
                this.method1045(10);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "()I")
    public final int method1084() {
        ++field3912;
        return 4;
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "()V")
    public final void method1085() {
        ++field3961;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)V")
    public final synchronized void method1770(int arg0, int arg1, int arg2) {
        ++field4016;
        class74 var4 = new class74(arg2);
        var4.field6799 = (long) arg1;
        this.field4100.method1958(var4, arg0 + 7936);
        if (arg0 != -7936) {
            this.method1120(0.7575038F, -0.6740997F, 0.21468563F);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lcc;I)V")
    public final void method1771(class122 arg0, int arg1) {
        ++field3933;
        if (this.field4093 >= 0 && this.field4090[this.field4093] == arg0) {
            this.field4090[this.field4093--] = null;
            arg0.method782(arg1 + -108);
            if (this.field4093 >= arg1) {
                this.field4094 = this.field4090[this.field4093];
                this.field4094.method783((byte) 60);
            } else {
                this.field4094 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "()Z")
    public final boolean method1089() {
        ++field3965;
        return this.field4069 != null && (this.field4066 <= 1 || this.field4174);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLcc;)V")
    public final void method1772(byte arg0, class122 arg1) {
        ++field3949;
        if (this.field4093 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field4093 <= -1) {
                this.field4090[this.field4093].method782(-127);
            }
            if (arg0 != 57) {
                this.field4099 = null;
            }
            this.field4094 = this.field4090[++this.field4093] = arg1;
            this.field4094.method783((byte) -33);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIZLjaggl/memory/NativeBuffer;Z)Lgf;")
    public final class46 method1773(int arg0, int arg1, boolean arg2, NativeBuffer arg3, boolean arg4) {
        ++field3880;
        if (!arg2) {
            this.method1118(-73, -60, 62);
        }
        return (class46) (!this.field4189 || arg4 && !this.field4136 ? new class247(this, arg0, arg3) : new class216(this, arg0, arg3, arg1, arg4));
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V")
    public static final void method1774(byte arg0) {
        ++field3943;
        int var1 = class363.field5623 * 128 - -64;
        int var2 = class54.field721 * 128 - -64;
        int var3 = class500.method2985(var1, 5293, class195.field2770, var2) - class30.field462;
        if (~class522.field7720 > -101) {
            if (~class34.field539 > ~var1) {
                class34.field539 += (-class34.field539 + var1) * class522.field7720 / 1000 + class4.field60;
                if (~class34.field539 < ~var1) {
                    class34.field539 = var1;
                }
            }
            if (~class34.field539 < ~var1) {
                class34.field539 -= (-var1 + class34.field539) * class522.field7720 / 1000 + class4.field60;
                if (~var1 < ~class34.field539) {
                    class34.field539 = var1;
                }
            }
            if (~var3 < ~class154.field2246) {
                class154.field2246 += class4.field60 - -((-class154.field2246 + var3) * class522.field7720 / 1000);
                if (class154.field2246 > var3) {
                    class154.field2246 = var3;
                }
            }
            if (class301.field4447 < var2) {
                class301.field4447 += (-class301.field4447 + var2) * class522.field7720 / 1000 + class4.field60;
                if (~var2 > ~class301.field4447) {
                    class301.field4447 = var2;
                }
            }
            if (~var3 > ~class154.field2246) {
                class154.field2246 -= (-var3 + class154.field2246) * class522.field7720 / 1000 + class4.field60;
                if (~var3 < ~class154.field2246) {
                    class154.field2246 = var3;
                }
            }
            if (~class301.field4447 < ~var2) {
                class301.field4447 -= (-var2 + class301.field4447) * class522.field7720 / 1000 + class4.field60;
                if (~class301.field4447 > ~var2) {
                    class301.field4447 = var2;
                }
            }
        } else {
            class301.field4447 = class54.field721 * 128 + 64;
            class34.field539 = class363.field5623 * 128 + 64;
            class154.field2246 = class500.method2985(class34.field539, 5293, class195.field2770, class301.field4447) - class30.field462;
        }
        int var4 = class173.field2489 * 128 + 64;
        int var5 = class467.field6804 * 128 - -64;
        int var6 = class500.method2985(var5, 5293, class195.field2770, var4) + -class83.field1117;
        int var7 = var5 - class34.field539;
        int var8 = -class154.field2246 + var6;
        int var9 = var4 - class301.field4447;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 16383;
        if (~var11 > -1025) {
            var11 = 1024;
        }
        int var12 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9));
        if (~var11 < -3073) {
            var11 = 3072;
        }
        if (~var11 < ~class353.field5478) {
            class353.field5478 += (-class353.field5478 + var11 >> 3) * class314.field4800 / 1000 + class362.field5619 << 3;
            if (~class353.field5478 < ~var11) {
                class353.field5478 = var11;
            }
        }
        if (class353.field5478 > var11) {
            class353.field5478 -= (-var11 + class353.field5478 >> 3) * class314.field4800 / 1000 + class362.field5619 << 3;
            if (var11 > class353.field5478) {
                class353.field5478 = var11;
            }
        }
        int var13 = var12 - class30.field461;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        if (arg0 > 93) {
            int var14 = var13 >> 3;
            if (~var14 < -1) {
                class30.field461 += class314.field4800 * var14 / 1000 + class362.field5619 << 3;
                class30.field461 &= 16383;
            }
            if (~var14 > -1) {
                class30.field461 -= class362.field5619 - -(-var14 * class314.field4800 / 1000) << 3;
                class30.field461 &= 16383;
            }
            int var15 = -class30.field461 + var12;
            if (var15 > 8192) {
                var15 -= 16384;
            }
            if (~var15 > 8191) {
                var15 += 16384;
            }
            class522.field7715 = 0;
            if (~var15 > -1 && ~var14 < -1 || var15 > 0 && ~var14 > -1) {
                class30.field461 = var12;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "(I)V")
    private final void method1775(int arg0) {
        OpenGL.glDepthMask(this.field4223 && this.field4153);
        ++field4034;
        if (arg0 != 0) {
            this.field4150 = false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "()F")
    public final float method1104() {
        ++field4067;
        return this.field4175;
    }

    @OriginalMember(owner = "client!bv", name = "FA", descriptor = "()I")
    public final int method1111() {
        ++field3906;
        return this.field4096 + this.field4095 + this.field4097;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(III)V")
    public final void method1776(int arg0, int arg1, int arg2) {
        if (arg0 == -30) {
            if (~this.field4213 != -1) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                OpenGL.glTexEnvi(8960, 34162, arg1);
            } else {
                boolean var4 = false;
                if (~this.field4142 != ~arg2) {
                    OpenGL.glTexEnvi(8960, 34161, arg2);
                    var4 = true;
                    this.field4142 = arg2;
                }
                if (~this.field4158 != ~arg1) {
                    OpenGL.glTexEnvi(8960, 34162, arg1);
                    var4 = true;
                    this.field4158 = arg1;
                }
                if (var4) {
                    this.field4123 &= -30;
                }
            }
            ++field3959;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(BLcc;)V")
    public final void method1777(byte arg0, class122 arg1) {
        ++field4056;
        if (~this.field4091 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field4091 >= 0) {
                this.field4087[this.field4091].method781(-18631);
            }
            this.field4089 = this.field4087[++this.field4091] = arg1;
            this.field4089.method785(48);
            if (arg0 > -103) {
                this.method1090((Canvas) null);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lrc;I)V")
    public final void method1778(class120 arg0, int arg1) {
        ++field4050;
        OpenGL.glPushMatrix();
        if (arg1 < 99) {
            this.method1095((class4) null, (class476[]) null, true);
        }
        OpenGL.glMultMatrixf(arg0.method771(0), 0);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lcc;Z)V")
    public final void method1779(class122 arg0, boolean arg1) {
        if (!arg1) {
            this.method1820(-48, -96L);
        }
        ++field3985;
        if (!this.field4118) {
            if (~this.field4092 <= -1 && this.field4088[this.field4092] == arg0) {
                this.field4088[this.field4092--] = null;
                arg0.method784((byte) -77);
                if (~this.field4092 > -1) {
                    this.field4089 = this.field4094 = null;
                } else {
                    this.field4089 = this.field4094 = this.field4088[this.field4092];
                    this.field4089.method786(-50);
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method1822(arg0, 46);
            this.method1771(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "()Z")
    public final boolean method1052() {
        ++field4026;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(II)I")
    public final int method1780(int arg0, int arg1) {
        ++field3992;
        if (arg1 != 1) {
            return 21;
        } else if (~arg0 != -5122 && arg0 != 5120) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
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

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lvo;)V")
    public final void method1042(class258 arg0) {
        this.field4064.method3009(arg0, this, 10013);
        ++field3953;
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(Z)V")
    public final void method1781(boolean arg0) {
        if (arg0) {
            this.field4193 = -1;
        }
        ++field4027;
        if (~this.field4123 != -5) {
            this.method1798(-31360);
            this.method1831(false, true);
            this.method1823(-23419, false);
            this.method1801((byte) 17, false);
            this.method1827(false, -81);
            this.method1811(-2, (byte) -87);
            this.method1802(1, (byte) 57);
            this.method1794(0, 55);
            this.field4123 = 4;
        }
    }

    @OriginalMember(owner = "client!bv", name = "U", descriptor = "(IIIII)V")
    public final void method1122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4028;
        this.method1810(18845);
        this.method1802(arg4, (byte) 57);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)V")
    public final void method1782(byte arg0) {
        if (~this.field4123 != -9) {
            this.method1838((byte) -2);
            this.method1831(true, true);
            this.method1801((byte) -15, true);
            this.method1827(true, -85);
            this.method1802(1, (byte) 57);
            this.method1794(0, 104);
            this.field4123 = 8;
        }
        ++field3986;
        if (arg0 >= -12) {
            this.field4138 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(FIFF)V")
    private final void method1783(float arg0, int arg1, float arg2, float arg3) {
        ++field3888;
        OpenGL.glMatrixMode(5890);
        if (this.field4196) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg0, arg2);
        OpenGL.glMatrixMode(arg1);
        this.field4196 = true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1091(Rectangle[] arg0, int arg1) {
        this.method1075();
        ++field3966;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public final class206 method1059(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3956;
        return new class257(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lc;Lia;[Lmn;I)V")
    public final void method1062(class201[] arg0, class23 arg1, class159[] arg2, int arg3) {
        ++field3983;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method318(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIF)Ldd;")
    public final class471 method1071(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3901;
        return new class62(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lc;Lvo;Lia;Lmn;I)V")
    public final void method1047(class201 arg0, class258 arg1, class23 arg2, class159 arg3, int arg4) {
        ++field4058;
        arg0.method318(arg2, arg3, arg4);
        this.method1042(arg1);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1090(Canvas arg0) {
        ++field3970;
        if (this.field4045 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3990.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field3925.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field3990.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "(I)V")
    private final void method1784(int arg0) {
        ++field3908;
        this.field4173 = (float) (-this.field4216 + this.field4168);
        if (arg0 != 763) {
            this.method1825((byte) 31, 47, -118, 25);
        }
        this.field4217 = (float) (-this.field4216 + this.field4183);
        this.field4156 = (float) (-this.field4127 + this.field4116);
        this.field4212 = (float) (this.field4115 - this.field4127);
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(I)V")
    public final void method1105(int arg0) {
        this.method1815(70);
        ++field3995;
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;ILhu;)V")
    public class282(int arg0, Canvas arg1, class373 arg2, int arg3, class469 arg4) {
        super(arg0, arg2);
        new class233();
        new class141(16);
        this.field4098 = new class306();
        this.field4099 = new class306();
        this.field4100 = new class306();
        this.field4101 = new class306();
        this.field4102 = new class306();
        this.field4103 = new class306();
        this.field4104 = new class306();
        this.field4106 = 50;
        this.field4115 = 0;
        this.field4127 = 0;
        this.field4110 = new float[4];
        this.field4135 = -1;
        this.field4125 = -1;
        this.field4143 = 0;
        this.field4111 = 1.0F;
        this.field4164 = 0;
        this.field4168 = 0;
        this.field4163 = 3000.0F;
        this.field4139 = 1.0F;
        this.field4128 = new float[16];
        this.field4182 = 1.0F;
        this.field4160 = 3584;
        this.field4177 = -1.0F;
        this.field4187 = new float[4];
        this.field4165 = 3584.0F;
        this.field4179 = -1;
        this.field4158 = 8448;
        this.field4195 = -1;
        this.field4137 = 3584.0F;
        this.field4153 = true;
        this.field4209 = new float[4];
        this.field4151 = new class471[class247.field3445];
        this.field4184 = -1;
        this.field4200 = 512;
        this.field4185 = 512;
        this.field4172 = 1.0F;
        this.field4116 = 0;
        this.field4193 = 0;
        this.field4169 = -1.0F;
        this.field4194 = 1.0F;
        this.field4216 = 0;
        this.field4215 = new float[4];
        this.field4171 = 0;
        this.field4183 = 0;
        this.field4142 = 8448;
        this.field4219 = 0.0F;
        this.field4066 = arg3;
        this.field3889 = this.field4045 = arg1;
        try {
            if (class178.field2535 == null || !class178.field2535) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method2791("libjaggl.jnilib", 3).toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2791("jaggl.dll", 3).toString());
                        }
                    } else {
                        System.load(arg4.method2791("libjaggl.so", 3).toString());
                    }
                    class178.field2535 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class178.field2535 = Boolean.TRUE;
                }
            }
            if (class178.field2535 != null && class178.field2535) {
                this.field3925 = new OpenGL();
                this.field3922 = this.field4038 = this.field3925.init(arg1, 8, 8, 8, 24, 0, this.field4066);
                if (~this.field4038 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1815(64);
                    int var7 = this.method1842(34930);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field4121 = !this.field4197 ? 5121 : 33639;
                        if (this.field4190.indexOf("radeon") != -1) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class14.method125(38, ' ', this.field4190.replace('/', ' '));
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (~var13.charAt(0) == -121 && ~var13.length() <= -4 && class301.method1939((byte) -50, var13.substring(1, 3))) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var9 = true;
                                                var13 = var13.substring(2);
                                            }
                                            if (var13.length() >= 4 && class301.method1939((byte) -91, var13.substring(0, 4))) {
                                                var8 = class188.method1320(var13.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && ~var8 >= -8000) {
                                    this.field4189 = false;
                                }
                                if (~var8 <= -7001 && ~var8 >= -9251) {
                                    this.field4221 = false;
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field4146 = false;
                            }
                            this.field4155 &= this.field3925.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field4136 = this.field4189;
                        }
                        if (this.field4114.indexOf("intel") != -1) {
                            this.field4159 = false;
                        }
                        this.field4192 = !this.field4114.equals("s3 graphics");
                        if (this.field4189) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class220.method1492((byte) -125, true, false);
                        this.field4082 = true;
                        this.field4071 = new class517(this, super.field7256);
                        this.method1806((byte) 103);
                        this.field4081 = new class268(this);
                        this.field4073 = new class10(this);
                        if (this.field4073.method89((byte) 86)) {
                            this.field4069 = new class209(this);
                            if (!this.field4069.method1449((byte) -98)) {
                                this.field4069.method1446((byte) -76);
                                this.field4069 = null;
                            }
                        }
                        this.field4065 = new class188(this);
                        this.method1807(14475);
                        this.method1847(31363);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field3925.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class106.method710(100L, (byte) 6);
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
            this.method1099();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZII)V")
    public final void method1785(boolean arg0, int arg1, int arg2) {
        this.method1786(true, arg2, arg0, arg1 ^ -20997);
        if (arg1 != -21047) {
            this.field4155 = true;
        }
        ++field4005;
    }

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "()Z")
    public final boolean method1146() {
        ++field4019;
        return this.field4069 != null && this.field4069.method2367(true);
    }

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "()Z")
    public final boolean method1077() {
        ++field3885;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZIZI)V")
    public final void method1786(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (~this.field4178 != ~arg1) {
            if (~arg1 > -1) {
                this.method1841(34);
                this.method1787((class14) null, (byte) 121);
                this.method1794(0, 112);
                if (!this.field4109) {
                    this.field4065.method1319(0, arg0, arg2, true);
                }
            } else {
                class393 var5 = this.field4071.method3078(arg3 ^ -87, arg1);
                class263 var6 = super.field7256.method1558(arg1, (byte) 117);
                if (~var6.field3664 == -1 && var6.field3655 == 0) {
                    this.method1841(23);
                } else {
                    int var7 = !var6.field3654 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method1783((float) (this.field4086 % var8 * var6.field3655) / (float) var8, 5888, 0.0F, (float) (this.field4086 % var8 * var6.field3664) / (float) var8);
                }
                if (this.field4109) {
                    this.field4065.method1319(3, arg0, arg2, true);
                    this.method1787(var5, (byte) 121);
                    this.method1794(var6.field3666, 126);
                } else {
                    this.field4065.method1319(var6.field3671, arg0, arg2, true);
                    this.field4065.method1322(var6.field3659, (byte) -89, var6.field3656);
                    if (!this.field4065.method1323(var5, 103, var6.field3666)) {
                        this.method1787(var5, (byte) 121);
                        this.method1794(var6.field3666, arg3 + 19);
                    }
                }
            }
            this.field4178 = arg1;
        }
        if (arg3 != 50) {
            this.field4212 = -0.14426951F;
        }
        ++field3899;
        this.field4123 &= -8;
    }

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "()Z")
    public final boolean method1040() {
        ++field3958;
        return false;
    }

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "()V")
    public final void method1099() {
        ++field3997;
        for (class467 var1 = this.field4083.method1970(64); var1 != null; var1 = this.field4083.method1960(24)) {
            ((class307) var1).method1973(-32251);
        }
        if (this.field4073 != null) {
            this.field4073.method81(1);
        }
        if (this.field3925 != null) {
            this.method1793((byte) 104);
            Enumeration var2 = this.field3990.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3990.get(var3);
                this.field3925.releaseSurface(var3, var4);
            }
            this.field3925.release();
            this.field3925 = null;
        }
        if (this.field4082) {
            class525.method3112(true, false, -115);
            this.field4082 = false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lkv;B)V")
    public final void method1787(class14 arg0, byte arg1) {
        if (arg1 != 121) {
            this.method1059(103, 41, (int[][]) null, (int[][]) null, 71, 95, -21);
        }
        ++field3914;
        class14 var3 = this.field4224[this.field4213];
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field240);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field240);
                } else if (arg0.field240 != var3.field240) {
                    OpenGL.glDisable(var3.field240);
                    OpenGL.glEnable(arg0.field240);
                }
                OpenGL.glBindTexture(arg0.field240, arg0.method115(-6216));
            }
            this.field4224[this.field4213] = arg0;
        }
        this.field4123 &= -2;
    }

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "(I)V")
    private final void method1788(int arg0) {
        if (this.field4112 != 3) {
            this.field4112 = 3;
            this.method1844(arg0 ^ -22772);
            this.method1803(-15544);
            this.field4123 &= -8;
        }
        if (arg0 == -8) {
            ++field4055;
        }
    }

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "(I)V")
    public final void method1789(int arg0) {
        ++field4025;
        if (arg0 == -12479) {
            OpenGL.glLightfv(16384, 4611, this.field4110, 0);
            OpenGL.glLightfv(16385, 4611, this.field4187, 0);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lit;BLit;Lit;Lit;)V")
    public final void method1790(class509 arg0, byte arg1, class509 arg2, class509 arg3, class509 arg4) {
        if (arg2 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1849(true, arg2.field7567);
            OpenGL.glVertexPointer(arg2.field7566, arg2.field7571, this.field4181.method346(-67), this.field4181.method347((byte) -93) - -((long) arg2.field7569));
            OpenGL.glEnableClientState(32884);
        }
        ++field4035;
        if (arg3 != null) {
            this.method1849(true, arg3.field7567);
            OpenGL.glNormalPointer(arg3.field7571, this.field4181.method346(18), this.field4181.method347((byte) -93) + (long) arg3.field7569);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method1849(true, arg4.field7567);
            OpenGL.glColorPointer(arg4.field7566, arg4.field7571, this.field4181.method346(120), this.field4181.method347((byte) -93) + (long) arg4.field7569);
            OpenGL.glEnableClientState(32886);
        }
        if (arg1 == 43) {
            if (arg0 != null) {
                this.method1849(true, arg0.field7567);
                OpenGL.glTexCoordPointer(arg0.field7566, arg0.field7571, this.field4181.method346(118), this.field4181.method347((byte) -93) + (long) arg0.field7569);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "GA", descriptor = "(IIII)V")
    public final void method1127(int arg0, int arg1, int arg2, int arg3) {
        this.field4216 = arg0;
        this.field4200 = arg2;
        this.field4185 = arg3;
        this.field4127 = arg1;
        ++field4024;
        this.method1832(15);
        this.method1784(763);
        if (~this.field4112 == -4) {
            this.method1844(22772);
        } else if (this.field4112 == 2) {
            this.method1830(0);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II[I[I)Lea;")
    public final class15 method1038(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3988;
        return class83.method536(0, arg1, arg0, arg2, arg3, this);
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(IIIIII)V")
    public final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1810(18845);
        ++field4018;
        this.method1802(arg5, (byte) 57);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "(I)V")
    private final void method1791(int arg0) {
        ++field4074;
        if (arg0 != -1) {
            this.method1040();
        }
        int var2;
        for (var2 = 0; var2 < this.field4131; ++var2) {
            class471 var3 = this.field4151[var2];
            int var4 = 16386 - -var2;
            class333.field5149[0] = (float) var3.method2827(class41.method323(arg0, -23088));
            class333.field5149[1] = (float) var3.method2825(45);
            class333.field5149[2] = (float) var3.method2832(15);
            class333.field5149[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class333.field5149, 0);
            int var5 = var3.method2833(false);
            float var6 = var3.method2826(-1) / 255.0F;
            class333.field5149[0] = var6 * (float) (class494.method2942(var5, 16749448) >> 16);
            class333.field5149[1] = var6 * (float) class494.method2942(255, var5 >> 8);
            class333.field5149[2] = (float) class494.method2942(var5, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class333.field5149, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2830(122) * var3.method2830(123)));
            OpenGL.glEnable(var4);
        }
        while (~this.field4140 < ~var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field4140 = this.field4131;
    }

    @OriginalMember(owner = "client!bv", name = "aa", descriptor = "(IIIIII[BII)V")
    public final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4001;
        float var10;
        float var11;
        if (this.field4176 != null && this.field4176.field5980 >= arg2 && this.field4176.field5979 >= arg3) {
            this.field4176.method2422(0, arg6, 6406, arg2, 0, 0, 0, false, false, arg3);
            var10 = (float) arg2 * this.field4176.field5417 / (float) this.field4176.field5980;
            var11 = (float) arg3 * this.field4176.field5412 / (float) this.field4176.field5979;
        } else {
            this.field4176 = class215.method1466(6406, false, arg2, arg6, arg3, 6406, this, 23409);
            this.field4176.method2417(true, false, false);
            var11 = this.field4176.field5412;
            var10 = this.field4176.field5417;
        }
        this.method1833(16384);
        this.method1787(this.field4176, (byte) 121);
        this.method1802(arg8, (byte) 57);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1792(arg5, 6865);
        this.method1776(-30, 34165, 34165);
        this.method1828(34166, 768, 0, (byte) -84);
        this.method1828(5890, 770, 2, (byte) -115);
        this.method1825((byte) 103, 0, 770, 34166);
        this.method1825((byte) 115, 2, 770, 5890);
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
        this.method1828(5890, 768, 0, (byte) -89);
        this.method1828(34166, 770, 2, (byte) -96);
        this.method1825((byte) 95, 0, 770, 5890);
        this.method1825((byte) 70, 2, 770, 34166);
    }

    @OriginalMember(owner = "client!bv", name = "SA", descriptor = "(IIIIII)Z")
    public final boolean method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4059;
        float var7 = (float) arg2 * this.field4144.field1708 + (float) arg0 * this.field4144.field1712 + (float) arg1 * this.field4144.field1718 + this.field4144.field1719;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4144.field1708 + (float) arg3 * this.field4144.field1712 + (float) arg4 * this.field4144.field1718 + this.field4144.field1719;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4106) || !((float) this.field4106 > var8)) && (!((float) this.field4160 < var7) || !((float) this.field4160 < var8))) {
            int var9 = (int) (((float) arg2 * this.field4144.field1693 + (float) arg0 * this.field4144.field1704 + (float) arg1 * this.field4144.field1710 + this.field4144.field1720) * (float) this.field4200 / var7);
            int var10 = (int) (((float) arg5 * this.field4144.field1693 + (float) arg3 * this.field4144.field1704 + (float) arg4 * this.field4144.field1710 + this.field4144.field1720) * (float) this.field4200 / var8);
            if ((float) var9 < this.field4173 && this.field4173 > (float) var10 || (float) var9 > this.field4217 && this.field4217 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4144.field1717 + (float) arg0 * this.field4144.field1699 + (float) arg1 * this.field4144.field1698 + this.field4144.field1701) * (float) this.field4185 / var7);
                int var12 = (int) (((float) arg5 * this.field4144.field1717 + (float) arg3 * this.field4144.field1699 + (float) arg4 * this.field4144.field1698 + this.field4144.field1701) * (float) this.field4185 / var8);
                return (!(this.field4156 > (float) var11) || !((float) var12 < this.field4156)) && (!(this.field4212 < (float) var11) || !((float) var12 > this.field4212));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIILea;II)V")
    public final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class15 arg6, int arg7, int arg8) {
        ++field4000;
        class277 var10 = (class277) arg6;
        class346 var11 = var10.field3841;
        this.method1833(16384);
        this.method1787(var10.field3841, (byte) 121);
        this.method1802(arg5, (byte) 57);
        this.method1776(-30, 8448, 7681);
        this.method1828(34167, 768, 0, (byte) -121);
        float var12 = var11.field5417 / (float) var11.field5415;
        float var13 = var11.field5412 / (float) var11.field5411;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method1828(5890, 768, 0, (byte) -116);
    }

    @OriginalMember(owner = "client!bv", name = "Z", descriptor = "(IIII)V")
    public final void method1110(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4183 > arg2) {
            this.field4183 = arg2;
        }
        if (~arg3 > ~this.field4115) {
            this.field4115 = arg3;
        }
        if (this.field4168 < arg0) {
            this.field4168 = arg0;
        }
        ++field3962;
        if (this.field4116 < arg1) {
            this.field4116 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method1784(763);
        this.method1824(2);
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(II)V")
    public final void method1792(int arg0, int arg1) {
        class224.field3163[2] = (float) class494.method2942(arg0, 255) / 255.0F;
        if (arg1 != 6865) {
            this.field4098 = null;
        }
        class224.field3163[3] = (float) (arg0 >>> 24) / 255.0F;
        class224.field3163[1] = (float) class494.method2942(arg0, 65280) / 65280.0F;
        class224.field3163[0] = (float) class494.method2942(arg0, 16711680) / 1.671168E7F;
        ++field3919;
        OpenGL.glTexEnvfv(8960, 8705, class224.field3163, 0);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "()Lia;")
    public final class23 method1092() {
        ++field4047;
        return new class120();
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)V")
    private final void method1793(byte arg0) {
        this.field3925.detach();
        ++field4039;
        int var2 = 31 % ((-35 - arg0) / 52);
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(II)V")
    public final void method1794(int arg0, int arg1) {
        if (arg1 > 48) {
            ++field4036;
            if (~arg0 != -2) {
                if (arg0 == 0) {
                    this.method1776(-30, 8448, 8448);
                } else if (~arg0 == -3) {
                    this.method1776(-30, 7681, 34165);
                } else {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.method1776(-30, 34023, 34023);
                            return;
                        }
                    } else {
                        this.method1776(-30, 8448, 260);
                    }
                }
            } else {
                this.method1776(-30, 7681, 7681);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "W", descriptor = "()I")
    public final int method1069() {
        ++field3945;
        return this.field4160;
    }

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "(I)V")
    private final void method1795(int arg0) {
        class224.field3163[3] = 1.0F;
        class224.field3163[0] = this.field4188 * this.field4111;
        ++field4040;
        class224.field3163[2] = this.field4194 * this.field4188;
        if (arg0 != 12782) {
            this.field4105 = -52;
        }
        class224.field3163[1] = this.field4188 * this.field4182;
        OpenGL.glLightModelfv(2899, class224.field3163, 0);
    }

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "(Lia;)V")
    public final void method1064(class23 arg0) {
        this.field4144 = (class120) arg0;
        ++field4006;
        this.field4122.method773(this.field4144, 1);
        if (~this.field4112 != -2) {
            this.method1803(-15544);
        }
    }

    @OriginalMember(owner = "client!bv", name = "XA", descriptor = "(IFFFFF)V")
    public final void method1139(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3917;
        boolean var7 = this.field4184 != arg0;
        if (var7 || this.field4169 != arg1 || this.field4177 != arg2) {
            this.field4177 = arg2;
            this.field4184 = arg0;
            this.field4169 = arg1;
            if (var7) {
                this.field4194 = (float) (255 & this.field4184) / 255.0F;
                this.field4111 = (float) (this.field4184 & 16711680) / 1.671168E7F;
                this.field4182 = (float) (this.field4184 & 65280) / 65280.0F;
                this.method1795(12782);
            }
            this.method1839(-67);
        }
        if (this.field4215[0] != arg3 || this.field4215[1] != arg4 || this.field4215[2] != arg5) {
            this.field4215[2] = arg5;
            this.field4215[0] = arg3;
            this.field4215[1] = arg4;
            this.field4209[1] = -arg4;
            this.field4209[2] = -arg5;
            this.field4209[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4110[1] = arg4 * var8;
            this.field4110[0] = arg3 * var8;
            this.field4110[2] = arg5 * var8;
            this.field4187[1] = -this.field4110[1];
            this.field4187[2] = -this.field4110[2];
            this.field4187[0] = -this.field4110[0];
            this.method1789(-12479);
            this.field4191 = (int) (arg3 * 256.0F / arg4);
            this.field4130 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "(I)V")
    public final void method1053(int arg0) {
        this.method1802(0, (byte) 57);
        ++field3942;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(IIIIII)Lmc;")
    public final class242 method1140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3892;
        return !this.field4199 ? null : new class397(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "(I)V")
    public final void method1796(int arg0) {
        if (arg0 == -1) {
            ++field4046;
            OpenGL.glPopMatrix();
        }
    }

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "()Lia;")
    public final class23 method1088() {
        ++field4009;
        return this.field4076;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)I")
    public final int method1130(int arg0, int arg1) {
        ++field4008;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZII)V")
    public final void method1797(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            ++field4061;
            OpenGL.glDrawArrays(arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!bv", name = "fa", descriptor = "(IIII)V")
    public final void method1103(int arg0, int arg1, int arg2, int arg3) {
        ++field4011;
        this.field4195 = arg2;
        this.field4193 = arg3;
        this.field4109 = true;
        this.field4148 = arg0;
        this.field4125 = arg1;
        this.field4065.method1319(3, false, false, true);
        this.field4065.field2633.method859(0);
        this.method1840(false);
        this.method1766(79);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([IIIII)Lf;")
    public final class191 method1097(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3976;
        return new class83(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "(I)V")
    private final void method1798(int arg0) {
        if (this.field4112 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field3987 < -1 && this.field3964 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field3987, (double) this.field3964, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4112 = 1;
            this.field4123 &= -25;
        }
        ++field3883;
        if (arg0 != -31360) {
            this.method1119(102);
        }
    }

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "()V")
    public final void method1075() {
        ++field4010;
        try {
            this.field3925.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "(I)V")
    private final void method1799(int arg0) {
        ++field3950;
        if (this.field4175 == 0.0F) {
            this.field4128[14] = this.field4222;
            this.field4128[10] = this.field4149;
        } else {
            float var2 = this.field4163 / (this.field4175 + this.field4163);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field4222 * (-var2 + 1.0F) / this.field4175;
            this.field4128[10] = this.field4149 + var4;
            this.field4128[14] = this.field4222 * var3;
        }
        this.field4137 = (this.field4128[14] - (float) this.field4160) / this.field4128[10];
        this.field4165 = (float) this.field4160 - this.field4175;
        if (arg0 == 1481612304) {
            ;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZ)I")
    public final int method1800(int arg0, boolean arg1) {
        if (arg1) {
            return 15;
        } else {
            ++field3911;
            if (arg0 != 6406 && ~arg0 != -6410) {
                if (~arg0 != -6411 && arg0 != 34846 && ~arg0 != -34845) {
                    if (arg0 == 6407) {
                        return 3;
                    } else if (~arg0 != -6409 && ~arg0 != -34848) {
                        if (~arg0 != -34844) {
                            if (~arg0 != -34843) {
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
                    return 2;
                }
            } else {
                return 1;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "()Z")
    public final boolean method1124() {
        ++field3923;
        if (this.field4069 != null) {
            if (!this.field4069.method2367(true)) {
                if (!this.field4073.method80(107, this.field4069)) {
                    return false;
                }
                this.field4071.method3073(-1);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1083(Canvas arg0) {
        ++field3975;
        long var2 = 0L;
        if (arg0 != null && this.field4045 != arg0) {
            if (this.field3990.containsKey(arg0)) {
                Long var4 = (Long) this.field3990.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field4038;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field3925.surfaceResized(var2);
            if (this.field3889 == arg0) {
                this.method1847(31363);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BZ)V")
    public final void method1801(byte arg0, boolean arg1) {
        if (!this.field4205 != !arg1) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field4205 = arg1;
            this.field4123 &= -32;
        }
        ++field4037;
        int var3 = 98 / ((arg0 - -56) / 37);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[Ldd;)V")
    public final void method1106(int arg0, class471[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field4151[var3] = arg1[var3];
        }
        ++field3994;
        this.field4131 = arg0;
        if (~this.field4112 != -2) {
            this.method1791(-1);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(IB)V")
    public final void method1802(int arg0, byte arg1) {
        if (arg1 == 57) {
            ++field4072;
            if (this.field4166 != arg0) {
                boolean var3;
                boolean var4;
                byte var5;
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        var3 = true;
                        var4 = false;
                        var5 = 2;
                    } else if (~arg0 == -129) {
                        var4 = true;
                        var5 = 3;
                        var3 = true;
                    } else {
                        var3 = true;
                        var4 = false;
                        var5 = 0;
                    }
                } else {
                    var3 = true;
                    var5 = 1;
                    var4 = true;
                }
                if (this.field4154 == !var3) {
                    OpenGL.glColorMask(var3, var3, var3, true);
                    this.field4154 = var3;
                }
                if (this.field4133 != var4) {
                    if (!var4) {
                        OpenGL.glDisable(3008);
                    } else {
                        OpenGL.glEnable(3008);
                    }
                    this.field4133 = var4;
                }
                if (~this.field4105 != ~var5) {
                    if (var5 == 1) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(770, 771);
                    } else if (var5 != 2) {
                        if (~var5 != -4) {
                            OpenGL.glDisable(3042);
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                    this.field4105 = var5;
                }
                this.field4166 = arg0;
                this.field4123 &= -29;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "()I")
    public final int method1035() {
        ++field3948;
        return this.field4106;
    }

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "(I)V")
    private final void method1803(int arg0) {
        OpenGL.glLoadIdentity();
        ++field3886;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field4144.method771(0), 0);
        if (this.field4109) {
            this.field4065.field2633.method859(0);
        }
        this.method1789(-12479);
        if (arg0 != -15544) {
            this.method1847(-2);
        }
        this.method1791(-1);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(FIF)V")
    public final void method1804(float arg0, int arg1, float arg2) {
        ++field3916;
        int var4 = 17 % ((-17 - arg1) / 55);
        this.field4219 = arg2;
        this.field4139 = arg0;
        if (!this.field4109) {
            this.method1840(false);
        }
    }

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "(I)Llr;")
    public final class237 method1805(int arg0) {
        if (arg0 != 1365) {
            return null;
        } else {
            ++field3968;
            return this.field4152 == null ? null : this.field4152.method445((byte) 113);
        }
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)V")
    private final void method1806(byte arg0) {
        ++field3991;
        this.field4144 = new class120();
        this.field4122 = new class120();
        this.field4224 = new class14[this.field4162];
        this.field4119 = new class393(this, 3553, 6408, 1, 1);
        this.field4161 = new class393(this, 3553, 6408, 1, 1);
        this.field4210 = new class393(this, 3553, 6408, 1, 1);
        this.field4129 = new class308(this);
        this.field4120 = new class308(this);
        if (arg0 <= 47) {
            this.field3889 = null;
        }
        this.field4220 = new class308(this);
        this.field4108 = new class308(this);
        this.field4170 = new class308(this);
        this.field4141 = new class308(this);
        this.field4145 = new class308(this);
        this.field4208 = new class308(this);
        this.field4202 = new class308(this);
        this.field4218 = new class308(this);
        if (this.field4159) {
            this.field4180 = new class317(this);
            this.field4126 = new class317(this);
        }
    }

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "(I)V")
    private final void method1807(int arg0) {
        this.method1811(-2, (byte) -87);
        ++field4060;
        for (int var2 = this.field4162 + -1; var2 >= 0; --var2) {
            this.method1819(var2, (byte) 98);
            this.method1787((class14) null, (byte) 121);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1776(-30, 8448, 8448);
        this.method1828(34168, 770, 2, (byte) -83);
        this.method1841(26);
        this.field4166 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4105 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4133 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4154 = true;
        this.method1831(true, true);
        this.method1823(arg0 + -37894, true);
        this.method1801((byte) -124, true);
        this.method1827(true, -91);
        this.method1813((byte) 56);
        this.field3925.setSwapInterval(0);
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
        if (arg0 == 14475) {
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
            this.field4184 = this.field4135 = -1;
            this.method1107();
        }
    }

    @OriginalMember(owner = "client!bv", name = "na", descriptor = "(I)V")
    public final void method1126(int arg0) {
        this.field4080 = 0;
        ++field4032;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field4080;
        }
        this.field4085 = 1 << this.field4080;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BII)V")
    public final synchronized void method1808(byte arg0, int arg1, int arg2) {
        ++field3937;
        class74 var4 = new class74(arg2);
        var4.field6799 = (long) arg1;
        if (arg0 != 108) {
            this.method1109();
        }
        this.field4102.method1958(var4, 0);
    }

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "(B)V")
    public final void method1809(byte arg0) {
        ++field4003;
        OpenGL.glPushMatrix();
        if (arg0 <= 107) {
            this.method1082((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "(I)V")
    private final void method1810(int arg0) {
        if (arg0 != 18845) {
            this.method1812(-15, (byte[]) null, -79, 56, false);
        }
        if (this.field4123 != 1) {
            this.method1798(-31360);
            this.method1831(false, true);
            this.method1823(-23419, false);
            this.method1801((byte) 99, false);
            this.method1827(false, -108);
            this.method1787((class14) null, (byte) 121);
            this.method1811(-2, (byte) -87);
            this.method1794(1, 50);
            this.field4123 = 1;
        }
        ++field3891;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lse;[Lrl;Z)Loa;")
    public final class33 method1095(class4 arg0, class476[] arg1, boolean arg2) {
        ++field3979;
        return new class416(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(IB)V")
    public final void method1811(int arg0, byte arg1) {
        if (arg1 != -87) {
            this.field4206 = 39;
        }
        this.method1785(true, -21047, arg0);
        ++field4023;
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)Ll;")
    public final class195 method1129(int arg0) {
        ++field3993;
        class307 var2 = new class307(arg0);
        this.field4083.method1958(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "(I)V")
    public final synchronized void method1119(int arg0) {
        ++field3930;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4099.method1965(64)) {
            class74 var12 = (class74) this.field4099.method1962(0);
            class15.field249[var2++] = (int) var12.field6799;
            this.field4097 -= var12.field998;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class15.field249, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class15.field249, 0);
            var2 = 0;
        }
        while (!this.field4100.method1965(64)) {
            class74 var11 = (class74) this.field4100.method1962(0);
            class15.field249[var2++] = (int) var11.field6799;
            this.field4095 -= var11.field998;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class15.field249, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class15.field249, 0);
            var2 = 0;
        }
        while (!this.field4101.method1965(64)) {
            class74 var10 = (class74) this.field4101.method1962(0);
            class15.field249[var2++] = var10.field998;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class15.field249, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class15.field249, 0);
            var2 = 0;
        }
        while (!this.field4102.method1965(64)) {
            class74 var9 = (class74) this.field4102.method1962(0);
            class15.field249[var2++] = (int) var9.field6799;
            this.field4096 -= var9.field998;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class15.field249, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class15.field249, 0);
            boolean var4 = false;
        }
        while (!this.field4098.method1965(64)) {
            class74 var8 = (class74) this.field4098.method1962(0);
            OpenGL.glDeleteLists((int) var8.field6799, var8.field998);
        }
        while (!this.field4103.method1965(64)) {
            class467 var7 = this.field4103.method1962(0);
            OpenGL.glDeleteProgramARB((int) var7.field6799);
        }
        while (!this.field4104.method1965(64)) {
            class467 var6 = this.field4104.method1962(0);
            OpenGL.glDeleteObjectARB(var6.field6799);
        }
        while (!this.field4098.method1965(64)) {
            class74 var5 = (class74) this.field4098.method1962(0);
            OpenGL.glDeleteLists((int) var5.field6799, var5.field998);
        }
        this.field4071.method3075((byte) -113);
        if (~this.method1111() < -100663297 && ~(this.field4201 - -60000L) > ~class264.method1698(true)) {
            System.gc();
            this.field4201 = class264.method1698(true);
        }
        this.field4086 = var3;
    }

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "(ILea;II)V")
    public final void method1080(int arg0, class15 arg1, int arg2, int arg3) {
        ++field3893;
        class277 var5 = (class277) arg1;
        class346 var6 = var5.field3841;
        this.method1833(16384);
        this.method1787(var5.field3841, (byte) 121);
        this.method1802(1, (byte) 57);
        this.method1776(-30, 8448, 7681);
        this.method1828(34167, 768, 0, (byte) -115);
        float var7 = var6.field5417 / (float) var6.field5415;
        float var8 = var6.field5412 / (float) var6.field5411;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4168) * var7, (float) (this.field4116 - arg3) * var8);
        OpenGL.glVertex2i(this.field4168, this.field4116);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4168) * var7, (float) (-arg3 + this.field4115) * var8);
        OpenGL.glVertex2i(this.field4168, this.field4115);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4183) * var7, (float) (-arg3 + this.field4115) * var8);
        OpenGL.glVertex2i(this.field4183, this.field4115);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4183) * var7, (float) (this.field4116 - arg3) * var8);
        OpenGL.glVertex2i(this.field4183, this.field4116);
        OpenGL.glEnd();
        this.method1828(5890, 768, 0, (byte) -92);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[BIIZ)Lgf;")
    public final class46 method1812(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        ++field4015;
        if (!this.field4189 || arg4 && !this.field4136) {
            int var6 = -121 % ((arg3 - 63) / 55);
            return new class247(this, arg0, arg1, arg2);
        } else {
            return new class216(this, arg0, arg1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lro;IIII)Lc;")
    public final class201 method1076(class192 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4057;
        return new class308(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIII)V")
    public final void method1073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3881;
        OpenGL.glLineWidth((float) arg5);
        this.method1074(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "(B)V")
    public final void method1813(byte arg0) {
        ++field3947;
        if (~this.field4112 != -1) {
            this.field4123 &= -32;
            this.field4112 = 0;
        }
        if (arg0 < 37) {
            this.method1145();
        }
    }

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "(I)V")
    private final void method1814(int arg0) {
        ++field4012;
        OpenGL.glViewport(this.field4143, this.field4164, this.field3987, this.field3964);
        if (arg0 != 2915) {
            this.method1773(-114, 0, true, (NativeBuffer) null, false);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class191 method1134(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3898;
        return new class83(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)V")
    public final void method1072(int arg0) {
        ++field3884;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "(I)V")
    private final void method1815(int arg0) {
        ++field3951;
        int var2 = 0;
        while (!this.field3925.attach()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class106.method710(1000L, (byte) 6);
        }
        if (arg0 <= 39) {
            this.method1120(0.8133391F, 1.1344539F, -0.18240717F);
        }
    }

    @OriginalMember(owner = "client!bv", name = "ua", descriptor = "(F)V")
    public final void method1096(float arg0) {
        if (this.field4188 != arg0) {
            this.field4188 = arg0;
            this.method1795(12782);
        }
        ++field3944;
    }

    @OriginalMember(owner = "client!bv", name = "ia", descriptor = "(III[I)V")
    public final void method1055(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3971;
        float var5 = (float) arg2 * this.field4144.field1708 + (float) arg0 * this.field4144.field1712 + (float) arg1 * this.field4144.field1718 + this.field4144.field1719;
        if (!(var5 < (float) this.field4106) && !((float) this.field4160 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4144.field1693 + (float) arg0 * this.field4144.field1704 + (float) arg1 * this.field4144.field1710 + this.field4144.field1720) * (float) this.field4200 / var5);
            int var7 = (int) (((float) arg2 * this.field4144.field1717 + (float) arg0 * this.field4144.field1699 + (float) arg1 * this.field4144.field1698 + this.field4144.field1701) * (float) this.field4185 / var5);
            if (this.field4173 <= (float) var6 && (float) var6 <= this.field4217 && this.field4156 <= (float) var7 && (float) var7 <= this.field4212) {
                arg3[1] = (int) ((float) var7 + -this.field4156);
                arg3[0] = (int) ((float) var6 - this.field4173);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "()Z")
    public final boolean method1043() {
        ++field4052;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "()V")
    public final void method1058() {
        ++field3897;
        if (this.field4192 && ~this.field3987 < -1 && this.field3964 > 0) {
            int var1 = this.field4168;
            int var2 = this.field4183;
            int var3 = this.field4116;
            int var4 = this.field4115;
            this.method1107();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1813((byte) 80);
            this.method1831(false, true);
            this.method1823(-23419, false);
            this.method1801((byte) 96, false);
            this.method1827(false, -102);
            this.method1787((class14) null, (byte) 121);
            this.method1811(-2, (byte) -87);
            this.method1794(1, 123);
            this.method1802(0, (byte) 57);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3987, this.field3964, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1046(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[BZII)Ltu;")
    public final class176 method1816(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        ++field3972;
        if (!this.field4189 || arg2 && !this.field4136) {
            int var6 = 92 / ((31 - arg0) / 52);
            return new class227(this, arg4, arg1, arg3);
        } else {
            return new class520(this, arg4, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "(I)V")
    private final void method1817(int arg0) {
        ++field3967;
        int var2 = 103 % ((arg0 - 4) / 63);
        if (this.field4107 && !this.field4167) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public final void method1045(int arg0) {
        ++field3913;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field4075 = arg0;
            this.field4071.method3073(-1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lrl;Z)Lf;")
    public final class191 method1117(class476 arg0, boolean arg1) {
        ++field4017;
        int[] var3 = new int[arg0.field6933 * arg0.field6928];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field6925 != null) {
            for (int var6 = 0; ~var6 > ~arg0.field6928; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field6933; ++var7) {
                    var3[var5++] = class286.method1860(arg0.field6925[var4] << 24, arg0.field6929[class494.method2942(arg0.field6927[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~var8 > ~arg0.field6928; ++var8) {
                for (int var10 = 0; ~arg0.field6933 < ~var10; ++var10) {
                    int var11 = arg0.field6929[255 & arg0.field6927[var4++]];
                    var3[var5++] = var11 != 0 ? class286.method1860(-16777216, var11) : 0;
                }
            }
        }
        class191 var9 = this.method1097(var3, 0, arg0.field6933, arg0.field6933, arg0.field6928);
        var9.method221(arg0.field6931, arg0.field6926, arg0.field6930, arg0.field6932);
        return var9;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)V")
    public final synchronized void method1818(boolean arg0, int arg1) {
        ++field3969;
        class467 var3 = new class467();
        if (arg0) {
            this.field4180 = null;
        }
        var3.field6799 = (long) arg1;
        this.field4103.method1958(var3, 0);
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(IB)V")
    public final void method1819(int arg0, byte arg1) {
        ++field4043;
        if (~this.field4213 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field4213 = arg0;
        }
        if (arg1 <= 91) {
            this.field4193 = -71;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(IJ)V")
    public final synchronized void method1820(int arg0, long arg1) {
        ++field3999;
        class467 var4 = new class467();
        var4.field6799 = arg1;
        this.field4104.method1958(var4, 0);
        if (arg0 != 897494512) {
            this.method1799(101);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILtu;)V")
    public final void method1821(int arg0, class176 arg1) {
        ++field4062;
        if (arg0 > -50) {
            this.method1079(-4, -80, -71, 34, 22);
        }
        if (this.field4203 != arg1) {
            if (this.field4189) {
                OpenGL.glBindBufferARB(34963, arg1.method1267(32675));
            }
            this.field4203 = arg1;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Lcc;I)V")
    public final void method1822(class122 arg0, int arg1) {
        ++field3894;
        if (~this.field4091 <= -1 && this.field4087[this.field4091] == arg0) {
            this.field4087[this.field4091--] = null;
            arg0.method781(-18631);
            if (~this.field4091 <= -1) {
                this.field4089 = this.field4087[this.field4091];
                this.field4089.method785(103);
            } else {
                this.field4089 = null;
            }
            if (arg1 <= 44) {
                this.method1804(-0.4076041F, -78, 0.6075896F);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(IZ)V")
    public final void method1823(int arg0, boolean arg1) {
        if (arg0 == -23419) {
            ++field3938;
            if (!this.field4107 != !arg1) {
                this.field4107 = arg1;
                this.method1817(124);
                this.field4123 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "(I)V")
    private final void method1824(int arg0) {
        if (~this.field4183 <= ~this.field4168 && this.field4116 <= this.field4115) {
            OpenGL.glScissor(this.field4168 + this.field4143, this.field3964 - this.field4115 + this.field4164, this.field4183 - this.field4168, this.field4115 - this.field4116);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 2) {
            this.field4172 = 0.03480343F;
        }
        ++field4063;
    }

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "()Z")
    public final boolean method1138() {
        ++field4051;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BIII)V")
    public final void method1825(byte arg0, int arg1, int arg2, int arg3) {
        ++field3955;
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg2);
        if (arg0 <= 65) {
            this.field4076 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "V", descriptor = "(III)V")
    public final void method1118(int arg0, int arg1, int arg2) {
        if (~this.field4135 != ~arg0 || ~this.field4179 != ~arg1 || this.field4171 != arg2) {
            this.field4171 = arg2;
            this.field4135 = arg0;
            this.field4179 = arg1;
            if (!this.field4109) {
                this.method1840(false);
                this.method1766(112);
            }
        }
        ++field4054;
    }

    @OriginalMember(owner = "client!bv", name = "IA", descriptor = "(IIII)[I")
    public final int[] method1102(int arg0, int arg1, int arg2, int arg3) {
        ++field4042;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field3964, arg2, 1, 32993, this.field4121, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)I")
    public final int method1141(int arg0, int arg1) {
        ++field3882;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "()Z")
    public final boolean method1065() {
        ++field4021;
        return this.field4124 && (!this.method1146() || this.field4174);
    }

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "()Z")
    public final boolean method1070() {
        ++field4013;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "()Z")
    public final boolean method1094() {
        ++field3946;
        return false;
    }

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "(I)V")
    public static void method1826(int arg0) {
        field4030 = null;
        field4079 = null;
        if (arg0 != 16384) {
            method1826(-85);
        }
    }

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "([I)V")
    public final void method1048(int[] arg0) {
        arg0[3] = this.field4115;
        arg0[0] = this.field4168;
        arg0[1] = this.field4116;
        ++field3904;
        arg0[2] = this.field4183;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ll;)V")
    public final void method1133(class195 arg0) {
        ++field4020;
        this.field4084 = ((class307) arg0).field4508;
        if (this.field4225 == null) {
            class455 var2 = new class455(80);
            if (!this.field4197) {
                var2.method2737(-88, -1.0F);
                var2.method2737(-77, -1.0F);
                var2.method2737(-82, 0.0F);
                var2.method2737(-93, 0.0F);
                var2.method2737(-103, 1.0F);
                var2.method2737(-98, 1.0F);
                var2.method2737(-77, -1.0F);
                var2.method2737(-105, 0.0F);
                var2.method2737(-106, 1.0F);
                var2.method2737(-104, 1.0F);
                var2.method2737(-122, 1.0F);
                var2.method2737(-118, 1.0F);
                var2.method2737(-117, 0.0F);
                var2.method2737(-82, 1.0F);
                var2.method2737(-93, 0.0F);
                var2.method2737(-113, -1.0F);
                var2.method2737(-107, 1.0F);
                var2.method2737(-109, 0.0F);
                var2.method2737(-79, 0.0F);
                var2.method2737(-108, 0.0F);
            } else {
                var2.method2741(96, -1.0F);
                var2.method2741(108, -1.0F);
                var2.method2741(107, 0.0F);
                var2.method2741(72, 0.0F);
                var2.method2741(106, 1.0F);
                var2.method2741(93, 1.0F);
                var2.method2741(93, -1.0F);
                var2.method2741(120, 0.0F);
                var2.method2741(110, 1.0F);
                var2.method2741(66, 1.0F);
                var2.method2741(77, 1.0F);
                var2.method2741(81, 1.0F);
                var2.method2741(94, 0.0F);
                var2.method2741(67, 1.0F);
                var2.method2741(68, 0.0F);
                var2.method2741(109, -1.0F);
                var2.method2741(114, 1.0F);
                var2.method2741(127, 0.0F);
                var2.method2741(117, 0.0F);
                var2.method2741(103, 0.0F);
            }
            this.field4225 = this.method1812(20, var2.field1277, var2.field1292, -18, false);
            this.field4138 = new class509(this.field4225, 5126, 3, 0);
            this.field4211 = new class509(this.field4225, 5126, 2, 12);
            this.field4064.method3006(this, (byte) -2);
        }
    }

    @OriginalMember(owner = "client!bv", name = "S", descriptor = "()V")
    public final void method1044() {
        ++field4078;
        this.field4109 = false;
        this.field4065.method1319(0, false, false, true);
        this.method1840(false);
        this.method1766(36);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(ZI)V")
    public final void method1827(boolean arg0, int arg1) {
        if (!arg0 != !this.field4223) {
            this.field4223 = arg0;
            this.method1775(0);
            this.field4123 &= -32;
        }
        ++field4007;
        if (arg1 >= -14) {
            this.method1834(1.389001F, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIB)V")
    public final void method1828(int arg0, int arg1, int arg2, byte arg3) {
        ++field4014;
        if (arg3 <= -71) {
            OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
            OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIII)V")
    public final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3960;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method1810(18845);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1802(arg5, (byte) 57);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4124) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4124) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILtu;I)V")
    public final void method1829(int arg0, int arg1, int arg2, class176 arg3, int arg4) {
        ++field3926;
        int var6 = arg3.method1269(arg0 ^ -85);
        int var7 = arg1 * this.method1780(var6, arg0);
        this.method1821(-87, arg3);
        OpenGL.glDrawElements(arg4, arg2, var6, (long) var7 + arg3.method1268(32127));
        if (arg0 != 1) {
            this.method1141(65, 87);
        }
    }

    @OriginalMember(owner = "client!bv", name = "pa", descriptor = "(IIII)V")
    public final void method1046(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field3987) {
            arg2 = this.field3987;
        }
        if (~arg3 < ~this.field3964) {
            arg3 = this.field3964;
        }
        ++field3954;
        this.field4183 = arg2;
        this.field4115 = arg3;
        this.field4116 = arg1;
        this.field4168 = arg0;
        OpenGL.glEnable(3089);
        this.method1784(763);
        this.method1824(2);
    }

    @OriginalMember(owner = "client!bv", name = "xa", descriptor = "()I")
    public final int method1054() {
        ++field3900;
        int var1 = this.field4132;
        this.field4132 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "(I)V")
    private final void method1830(int arg0) {
        ++field4044;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field4128, arg0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZZ)V")
    public final void method1831(boolean arg0, boolean arg1) {
        if (!this.field4214 == arg0) {
            this.field4214 = arg0;
            this.method1766(33);
            this.field4123 &= -32;
        }
        if (!arg1) {
            this.field4161 = null;
        }
        ++field3940;
    }

    @OriginalMember(owner = "client!bv", name = "NA", descriptor = "(IIIIII)V")
    public final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4033;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1810(18845);
        float var10 = (float) arg3 + var8;
        this.method1802(arg5, (byte) 57);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4124) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4124) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "(I)V")
    private final void method1832(int arg0) {
        ++field3974;
        float[] var2 = this.field4128;
        float var3 = (float) (-this.field4216 * this.field4106) / (float) this.field4200;
        float var4 = (float) ((-this.field4216 + this.field3987) * this.field4106) / (float) this.field4200;
        float var5 = (float) (this.field4127 * this.field4106) / (float) this.field4185;
        float var6 = (float) ((-this.field3964 + this.field4127) * this.field4106) / (float) this.field4185;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field4106 * 2.0F;
            var2[13] = 0.0F;
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[12] = 0.0F;
            var2[11] = -1.0F;
            var2[6] = 0.0F;
            var2[14] = this.field4222 = -((float) this.field4160 * var7) / (float) (this.field4160 - this.field4106);
            var2[5] = var7 / (var5 - var6);
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[15] = 0.0F;
            var2[10] = this.field4149 = (float) (-(this.field4160 + this.field4106)) / (float) (-this.field4106 + this.field4160);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[4] = 0.0F;
        } else {
            var2[8] = 0.0F;
            var2[11] = 0.0F;
            var2[12] = 0.0F;
            var2[0] = 1.0F;
            var2[15] = 1.0F;
            var2[1] = 0.0F;
            var2[10] = 1.0F;
            var2[3] = 0.0F;
            var2[7] = 0.0F;
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[9] = 0.0F;
            var2[14] = 0.0F;
            var2[4] = 0.0F;
            var2[5] = 1.0F;
        }
        if (arg0 != 15) {
            this.method1110(85, -115, 59, -35);
        }
        this.method1799(1481612304);
    }

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "(I)V")
    public final void method1833(int arg0) {
        if (~this.field4123 != -3) {
            this.method1798(arg0 ^ -14976);
            this.method1831(false, true);
            this.method1823(-23419, false);
            this.method1801((byte) 88, false);
            this.method1827(false, -64);
            this.method1811(-2, (byte) -87);
            this.field4123 = 2;
        }
        if (arg0 != 16384) {
            this.method1824(76);
        }
        ++field3903;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(FB)V")
    public final void method1834(float arg0, byte arg1) {
        ++field3920;
        if (arg1 == 53) {
            if (this.field4172 != arg0) {
                this.field4172 = arg0;
                if (this.field4112 == 3) {
                    this.method1844(22772);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)V")
    public final void method1131(int arg0) {
        ++field3982;
        this.method1793((byte) -90);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(FFFFI)V")
    public final void method1835(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class224.field3163[1] = arg2;
        class224.field3163[3] = arg3;
        ++field3996;
        class224.field3163[0] = arg1;
        if (arg4 > -96) {
            this.method1084();
        }
        class224.field3163[2] = arg0;
        OpenGL.glTexEnvfv(8960, 8705, class224.field3163, 0);
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(III)V")
    public final synchronized void method1836(int arg0, int arg1, int arg2) {
        ++field3932;
        class74 var4 = new class74(arg2);
        var4.field6799 = (long) arg0;
        this.field4099.method1958(var4, arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(III)V")
    public final void method1837(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            this.field4146 = true;
        }
        ++field3887;
        this.field4143 = arg0;
        this.field4164 = arg1;
        this.method1814(2915);
        this.method1824(arg2 ^ 3);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lmc;Lmc;FLmc;)Lmc;")
    public final class242 method1081(class242 arg0, class242 arg1, float arg2, class242 arg3) {
        ++field3980;
        if (arg0 != null && arg1 != null && this.field4199 && this.field4159 && this.field4118) {
            class67 var5 = null;
            class339 var6 = (class339) arg0;
            class339 var7 = (class339) arg1;
            class237 var8 = var6.method445((byte) 118);
            class237 var9 = var7.method445((byte) 119);
            if (var8 != null && var9 != null) {
                int var10 = var9.field3374 < var8.field3374 ? var8.field3374 : var9.field3374;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class67) {
                    class67 var11 = (class67) arg3;
                    if (~var11.method442(17061) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class67(this, var10);
                }
                if (var5.method444(var9, arg2, var8, -114)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "()Z")
    public final boolean method1132() {
        ++field3984;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "(B)V")
    private final void method1838(byte arg0) {
        if (arg0 == -2) {
            ++field4049;
            if (this.field4112 != 2) {
                this.field4112 = 2;
                this.method1830(arg0 ^ -2);
                this.method1803(-15544);
                this.field4123 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "()V")
    public final void method1066() {
        ++field4053;
        this.method1827(true, -39);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "()Z")
    public final boolean method1109() {
        ++field3896;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "()Z")
    public final boolean method1056() {
        ++field4041;
        return this.field4065.method1321((byte) -60, 3);
    }

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "(IIIII)V")
    public final void method1063(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4068;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "(I)V")
    private final void method1839(int arg0) {
        class224.field3163[1] = this.field4182 * this.field4169;
        class224.field3163[0] = this.field4169 * this.field4111;
        class224.field3163[2] = this.field4194 * this.field4169;
        ++field3924;
        class224.field3163[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class224.field3163, 0);
        class224.field3163[2] = -this.field4177 * this.field4194;
        int var2 = 96 / ((arg0 - -14) / 53);
        class224.field3163[3] = 1.0F;
        class224.field3163[1] = -this.field4177 * this.field4182;
        class224.field3163[0] = -this.field4177 * this.field4111;
        OpenGL.glLightfv(16385, 4609, class224.field3163, 0);
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(Z)V")
    private final void method1840(boolean arg0) {
        ++field3977;
        int var2;
        if (this.field4109) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field4125;
        } else {
            this.field4204 = (float) (-this.field4171 + this.field4160) + -this.field4219;
            this.field4113 = this.field4204 - (float) this.field4179 * this.field4139;
            if ((float) this.field4106 > this.field4113) {
                this.field4113 = (float) this.field4106;
            }
            OpenGL.glFogf(2915, this.field4113);
            OpenGL.glFogf(2916, this.field4204);
            var2 = this.field4135;
        }
        class224.field3163[2] = (float) class494.method2942(255, var2) / 255.0F;
        class224.field3163[0] = (float) class494.method2942(var2, 16711680) / 1.671168E7F;
        if (arg0) {
            this.field4083 = null;
        }
        class224.field3163[1] = (float) class494.method2942(var2, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class224.field3163, 0);
        if (this.field4109) {
            this.field4065.field2633.method860(-18534);
        }
    }

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "(I)V")
    private final void method1841(int arg0) {
        ++field3935;
        if (this.field4196) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4196 = false;
        }
        if (arg0 < 15) {
            this.field4225 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "()I")
    public final int method1068() {
        ++field3957;
        int var1 = this.field4117;
        this.field4117 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "(FF)V")
    public final void method1087(float arg0, float arg1) {
        ++field3902;
        if (this.field4163 != arg0 || this.field4175 != arg1) {
            this.field4163 = arg0;
            this.field4175 = arg1;
            this.method1799(1481612304);
            if (~this.field4112 == -4) {
                this.method1844(22772);
                return;
            }
            if (~this.field4112 != -3) {
                return;
            }
            this.method1830(0);
        }
    }

    @OriginalMember(owner = "client!bv", name = "JA", descriptor = "(II)V")
    public final void method1137(int arg0, int arg1) {
        if (~this.field4106 != ~arg0 || ~this.field4160 != ~arg1) {
            this.field4106 = arg0;
            this.field4160 = arg1;
            this.method1832(15);
            this.method1840(false);
            if (~this.field4112 != -4) {
                if (~this.field4112 == -3) {
                    this.method1830(0);
                }
            } else {
                this.method1844(22772);
            }
        }
        ++field3895;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4031;
    }

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "(I)I")
    private final int method1842(int arg0) {
        ++field3963;
        this.field4114 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field4190 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field4114.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field4114.indexOf("brian paul") != -1 || ~this.field4114.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class14.method125(107, ' ', var3.replace('.', ' '));
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class188.method1320(var4[0], arg0 + -34872);
                int var6 = class188.method1320(var4[1], arg0 + -35056);
                this.field4147 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field4147 > -13) {
            var2 |= 2;
        }
        if (!this.field3925.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3925.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4162 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field4157 = var7[0];
        OpenGL.glGetIntegerv(arg0, var7, 0);
        this.field4206 = var7[0];
        if (~this.field4162 > -3 || this.field4157 < 2 || ~this.field4206 > -3) {
            var2 |= 16;
        }
        this.field4197 = NativeStream.method156();
        this.field3925.arePbuffersAvailable();
        this.field4189 = this.field3925.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4124 = this.field3925.isExtensionAvailable("GL_ARB_multisample");
        this.field4207 = this.field3925.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3925.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4198 = this.field3925.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4150 = this.field3925.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4221 = this.field3925.isExtensionAvailable("GL_EXT_texture3D");
        this.field4155 = this.field3925.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4199 = this.field3925.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4146 = this.field3925.isExtensionAvailable("GL_ARB_texture_float");
        this.field4134 = false;
        this.field4159 = this.field3925.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field4118 = this.field3925.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field4186 = this.field3925.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field4174 = this.field4186 & this.field4118;
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILcc;)V")
    public final void method1843(int arg0, class122 arg1) {
        ++field3978;
        if (!this.field4118) {
            if (this.field4092 >= 3) {
                throw new RuntimeException();
            }
            if (~this.field4092 <= -1) {
                this.field4088[this.field4092].method784((byte) -115);
            }
            this.field4089 = this.field4094 = this.field4088[++this.field4092] = arg1;
            this.field4089.method786(-52);
        } else {
            this.method1777((byte) -111, arg1);
            this.method1772((byte) 57, arg1);
        }
        int var3 = -91 % ((arg0 - -24) / 52);
    }

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "(I)V")
    private final void method1844(int arg0) {
        ++field3941;
        float var2 = (float) (-this.field4216) * this.field4172 / (float) this.field4200;
        float var3 = (float) (-this.field4127) * this.field4172 / (float) this.field4185;
        if (arg0 != 22772) {
            this.field4071 = null;
        }
        float var4 = (float) (-this.field4216 + this.field3987) * this.field4172 / (float) this.field4200;
        float var5 = (float) (this.field3964 - this.field4127) * this.field4172 / (float) this.field4185;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field4106 - this.field4175), (double) ((float) this.field4160 + -this.field4175));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "()Z")
    public final boolean method1145() {
        ++field4002;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "(B)V")
    public final void method1845(byte arg0) {
        if (this.field4123 != 16) {
            this.method1788(-8);
            this.method1831(true, true);
            this.method1801((byte) -111, true);
            this.method1827(true, -22);
            this.method1802(1, (byte) 57);
            this.method1794(0, 79);
            this.field4123 = 16;
        }
        ++field3918;
        if (arg0 < 16) {
            this.field4166 = 20;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lmc;)V")
    public final void method1093(class242 arg0) {
        ++field4048;
        this.field4152 = (class339) arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
    public final void method1067(boolean arg0) {
        ++field4029;
    }

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "()V")
    public final void method1121() {
        ++field3907;
        this.field4073.method91(false);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII)V")
    public final void method1039(int arg0, int arg1, int arg2, int arg3) {
        ++field3905;
        this.field4073.method88(arg1, arg2, (byte) 10, arg0, arg3);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)V")
    public final void method1144(boolean arg0) {
        this.field4153 = arg0;
        ++field3952;
        this.method1775(0);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1082(Canvas arg0) {
        ++field4022;
        this.field3889 = null;
        this.field3922 = 0L;
        if (arg0 != null && this.field4045 != arg0) {
            if (this.field3990.containsKey(arg0)) {
                Long var2 = (Long) this.field3990.get(arg0);
                this.field3922 = var2;
                this.field3889 = arg0;
            }
        } else {
            this.field3922 = this.field4038;
            this.field3889 = this.field4045;
        }
        if (this.field3889 != null && this.field3922 != 0L) {
            this.field3925.setSurface(this.field3922);
            this.method1847(31363);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1049(Canvas arg0) {
        ++field3909;
        if (this.field4045 == arg0) {
            throw new RuntimeException();
        } else if (this.field3990.containsKey(arg0)) {
            Long var2 = (Long) this.field3990.get(arg0);
            this.field3925.releaseSurface(arg0, var2);
            this.field3990.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLrc;)V")
    public final void method1846(byte arg0, class120 arg1) {
        OpenGL.glLoadMatrixf(arg1.method771(0), 0);
        if (arg0 <= -78) {
            ++field3931;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lc;Lvo;Lia;[Lmn;I)V")
    public final void method1078(class201[] arg0, class258 arg1, class23 arg2, class159[] arg3, int arg4) {
        this.method1062(arg0, arg2, arg3, arg4);
        ++field3915;
        this.method1042(arg1);
    }

    @OriginalMember(owner = "client!bv", name = "la", descriptor = "()F")
    public final float method1115() {
        ++field3929;
        return this.field4163;
    }

    @OriginalMember(owner = "client!bv", name = "va", descriptor = "()V")
    public final void method1107() {
        this.field4116 = 0;
        this.field4115 = this.field3964;
        this.field4168 = 0;
        this.field4183 = this.field3987;
        ++field3998;
        OpenGL.glDisable(3089);
        this.method1784(763);
    }

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "(I)V")
    private final void method1847(int arg0) {
        if (this.field3889 != null) {
            Dimension var2 = this.field3889.getSize();
            this.field3921 = var2.height;
            this.field3973 = var2.width;
        } else {
            this.field3973 = this.field3921 = 0;
        }
        ++field3939;
        if (this.field4094 == null) {
            this.field3987 = this.field3973;
            this.field3964 = this.field3921;
            this.method1814(2915);
        }
        if (arg0 == 31363) {
            this.method1813((byte) 111);
            this.method1107();
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(ZZ)V")
    public final void method1848(boolean arg0, boolean arg1) {
        if (arg1) {
            ++field3936;
            if (arg0 == !this.field4167) {
                this.field4167 = arg0;
                this.method1817(113);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "()V")
    public final void method1143() {
        if (this.field4069 != null && this.field4069.method2367(true)) {
            this.field4073.method83(74, this.field4069);
            this.field4071.method3073(-1);
        }
        ++field3879;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLgf;)V")
    public final void method1849(boolean arg0, class46 arg1) {
        if (!arg0) {
            this.field4076 = null;
        }
        if (this.field4181 != arg1) {
            if (this.field4189) {
                OpenGL.glBindBufferARB(34962, arg1.method348(true));
            }
            this.field4181 = arg1;
        }
        ++field3910;
    }

    static {
        new class375("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field4030 = new class492(83, 1);
        new class375("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field4079 = new class375("K", "T", "K", "K");
    }
}
