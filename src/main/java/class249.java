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

@OriginalClass("client!tt")
public class class249 extends class299 {

    @OriginalMember(owner = "client!tt", name = "yb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3778 = new Hashtable();

    @OriginalMember(owner = "client!tt", name = "Wd", descriptor = "I")
    public int field3906 = 128;

    @OriginalMember(owner = "client!tt", name = "ke", descriptor = "Lve;")
    private class185 field3920 = new class185();

    @OriginalMember(owner = "client!tt", name = "le", descriptor = "Lgl;")
    private class495 field3921 = new class495();

    @OriginalMember(owner = "client!tt", name = "me", descriptor = "Lgl;")
    public class495 field3922 = new class495();

    @OriginalMember(owner = "client!tt", name = "ne", descriptor = "I")
    public int field3923 = 8;

    @OriginalMember(owner = "client!tt", name = "pe", descriptor = "Z")
    private boolean field3925 = false;

    @OriginalMember(owner = "client!tt", name = "te", descriptor = "I")
    public int field3929 = 3;

    @OriginalMember(owner = "client!tt", name = "qe", descriptor = "Lnv;")
    private class44 field3926 = new class44();

    @OriginalMember(owner = "client!tt", name = "ue", descriptor = "[Lun;")
    private class119[] field3930 = new class119[4];

    @OriginalMember(owner = "client!tt", name = "ze", descriptor = "I")
    private int field3935 = -1;

    @OriginalMember(owner = "client!tt", name = "ye", descriptor = "I")
    private int field3934 = -1;

    @OriginalMember(owner = "client!tt", name = "Ae", descriptor = "I")
    private int field3936 = -1;

    @OriginalMember(owner = "client!tt", name = "xe", descriptor = "[Lun;")
    private class119[] field3933 = new class119[4];

    @OriginalMember(owner = "client!tt", name = "Be", descriptor = "[Lun;")
    private class119[] field3937 = new class119[4];

    @OriginalMember(owner = "client!tt", name = "Ee", descriptor = "Lnv;")
    private class44 field3940;

    @OriginalMember(owner = "client!tt", name = "Ge", descriptor = "Lnv;")
    private class44 field3942;

    @OriginalMember(owner = "client!tt", name = "He", descriptor = "Lnv;")
    private class44 field3943;

    @OriginalMember(owner = "client!tt", name = "Ie", descriptor = "Lnv;")
    private class44 field3944;

    @OriginalMember(owner = "client!tt", name = "Je", descriptor = "Lnv;")
    private class44 field3945;

    @OriginalMember(owner = "client!tt", name = "Ke", descriptor = "Lnv;")
    private class44 field3946;

    @OriginalMember(owner = "client!tt", name = "Le", descriptor = "Lnv;")
    private class44 field3947;

    @OriginalMember(owner = "client!tt", name = "Re", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!tt", name = "qf", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!tt", name = "Oe", descriptor = "[Lrd;")
    private class344[] field3950;

    @OriginalMember(owner = "client!tt", name = "xf", descriptor = "[F")
    private float[] field3984;

    @OriginalMember(owner = "client!tt", name = "Ze", descriptor = "[F")
    private float[] field3961;

    @OriginalMember(owner = "client!tt", name = "zf", descriptor = "[F")
    public float[] field3986;

    @OriginalMember(owner = "client!tt", name = "ag", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!tt", name = "sg", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!tt", name = "vf", descriptor = "F")
    public float field3982;

    @OriginalMember(owner = "client!tt", name = "ig", descriptor = "F")
    public float field4021;

    @OriginalMember(owner = "client!tt", name = "Qf", descriptor = "[F")
    private float[] field4003;

    @OriginalMember(owner = "client!tt", name = "of", descriptor = "I")
    private int field3975;

    @OriginalMember(owner = "client!tt", name = "xg", descriptor = "I")
    private int field4036;

    @OriginalMember(owner = "client!tt", name = "Kf", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!tt", name = "Ne", descriptor = "F")
    public float field3949;

    @OriginalMember(owner = "client!tt", name = "Qe", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!tt", name = "eg", descriptor = "F")
    public float field4017;

    @OriginalMember(owner = "client!tt", name = "Lf", descriptor = "I")
    public int field3998;

    @OriginalMember(owner = "client!tt", name = "qg", descriptor = "F")
    private float field4029;

    @OriginalMember(owner = "client!tt", name = "Eg", descriptor = "F")
    private float field4043;

    @OriginalMember(owner = "client!tt", name = "dg", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!tt", name = "Yf", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!tt", name = "wf", descriptor = "F")
    public float field3983;

    @OriginalMember(owner = "client!tt", name = "Of", descriptor = "I")
    private int field4001;

    @OriginalMember(owner = "client!tt", name = "Ig", descriptor = "I")
    private int field4047;

    @OriginalMember(owner = "client!tt", name = "Rf", descriptor = "Z")
    private boolean field4004;

    @OriginalMember(owner = "client!tt", name = "sf", descriptor = "[F")
    private float[] field3979;

    @OriginalMember(owner = "client!tt", name = "Cg", descriptor = "F")
    public float field4041;

    @OriginalMember(owner = "client!tt", name = "Vf", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!tt", name = "jf", descriptor = "I")
    private int field3970;

    @OriginalMember(owner = "client!tt", name = "Vg", descriptor = "I")
    private int field4060;

    @OriginalMember(owner = "client!tt", name = "Tg", descriptor = "F")
    public float field4058;

    @OriginalMember(owner = "client!tt", name = "Nf", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!tt", name = "vg", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!tt", name = "Zg", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!tt", name = "If", descriptor = "F")
    public float field3995;

    @OriginalMember(owner = "client!tt", name = "Lg", descriptor = "F")
    private float field4050;

    @OriginalMember(owner = "client!tt", name = "Wg", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!tt", name = "Qg", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!tt", name = "Se", descriptor = "Lsd;")
    public class268 field3954;

    @OriginalMember(owner = "client!tt", name = "eh", descriptor = "[I")
    public int[] field4069;

    @OriginalMember(owner = "client!tt", name = "bh", descriptor = "[I")
    public int[] field4066;

    @OriginalMember(owner = "client!tt", name = "gh", descriptor = "[B")
    public byte[] field4071;

    @OriginalMember(owner = "client!tt", name = "ch", descriptor = "[I")
    public int[] field4067;

    @OriginalMember(owner = "client!tt", name = "Zd", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!tt", name = "bd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3859;

    @OriginalMember(owner = "client!tt", name = "yd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3882;

    @OriginalMember(owner = "client!tt", name = "Ub", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field3800;

    @OriginalMember(owner = "client!tt", name = "zd", descriptor = "J")
    private long field3883;

    @OriginalMember(owner = "client!tt", name = "gb", descriptor = "J")
    private long field3760;

    @OriginalMember(owner = "client!tt", name = "Df", descriptor = "Z")
    public boolean field3990;

    @OriginalMember(owner = "client!tt", name = "Jg", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!tt", name = "Sf", descriptor = "Ljava/lang/String;")
    private String field4005;

    @OriginalMember(owner = "client!tt", name = "Tf", descriptor = "Z")
    public boolean field4006;

    @OriginalMember(owner = "client!tt", name = "Hf", descriptor = "Z")
    private boolean field3994;

    @OriginalMember(owner = "client!tt", name = "Ag", descriptor = "Z")
    public boolean field4039;

    @OriginalMember(owner = "client!tt", name = "Af", descriptor = "Z")
    public boolean field3987;

    @OriginalMember(owner = "client!tt", name = "Yg", descriptor = "Z")
    private boolean field4063;

    @OriginalMember(owner = "client!tt", name = "bf", descriptor = "Z")
    public boolean field3963;

    @OriginalMember(owner = "client!tt", name = "Ug", descriptor = "Ljava/lang/String;")
    private String field4059;

    @OriginalMember(owner = "client!tt", name = "Gf", descriptor = "Z")
    public boolean field3993;

    @OriginalMember(owner = "client!tt", name = "ng", descriptor = "Z")
    private boolean field4026;

    @OriginalMember(owner = "client!tt", name = "Td", descriptor = "Lou;")
    public class453 field3903;

    @OriginalMember(owner = "client!tt", name = "oe", descriptor = "Lkc;")
    public class159 field3924;

    @OriginalMember(owner = "client!tt", name = "ae", descriptor = "Lut;")
    private class149 field3910;

    @OriginalMember(owner = "client!tt", name = "de", descriptor = "Lts;")
    private class37 field3913;

    @OriginalMember(owner = "client!tt", name = "Xd", descriptor = "Lch;")
    private class164 field3907;

    @OriginalMember(owner = "client!tt", name = "vc", descriptor = "Lvg;")
    public static class56 field3827 = new class56(64);

    @OriginalMember(owner = "client!tt", name = "cd", descriptor = "Lpu;")
    public static class179 field3860 = new class179("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!tt", name = "Ad", descriptor = "Ld;")
    public static class242 field3884 = new class242(200);

    @OriginalMember(owner = "client!tt", name = "Kd", descriptor = "Ljp;")
    public static class55 field3894 = new class55(20, 11);

    @OriginalMember(owner = "client!tt", name = "df", descriptor = "F")
    public float field3965;

    @OriginalMember(owner = "client!tt", name = "kf", descriptor = "F")
    private float field3971;

    @OriginalMember(owner = "client!tt", name = "Bf", descriptor = "F")
    public float field3988;

    @OriginalMember(owner = "client!tt", name = "Xf", descriptor = "F")
    private float field4010;

    @OriginalMember(owner = "client!tt", name = "Zf", descriptor = "F")
    public float field4012;

    @OriginalMember(owner = "client!tt", name = "jg", descriptor = "F")
    public float field4022;

    @OriginalMember(owner = "client!tt", name = "kg", descriptor = "F")
    public float field4023;

    @OriginalMember(owner = "client!tt", name = "rg", descriptor = "F")
    private float field4030;

    @OriginalMember(owner = "client!tt", name = "tg", descriptor = "F")
    public float field4032;

    @OriginalMember(owner = "client!tt", name = "Xg", descriptor = "F")
    public float field4062;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    private int field3726;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!tt", name = "P", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!tt", name = "R", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!tt", name = "S", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!tt", name = "T", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!tt", name = "U", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!tt", name = "V", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!tt", name = "X", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!tt", name = "Y", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!tt", name = "Z", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!tt", name = "ab", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!tt", name = "bb", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!tt", name = "cb", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!tt", name = "db", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!tt", name = "eb", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!tt", name = "fb", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!tt", name = "hb", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!tt", name = "ib", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!tt", name = "jb", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!tt", name = "kb", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!tt", name = "lb", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!tt", name = "mb", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!tt", name = "nb", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!tt", name = "ob", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!tt", name = "pb", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!tt", name = "qb", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!tt", name = "rb", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!tt", name = "sb", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!tt", name = "tb", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!tt", name = "ub", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!tt", name = "vb", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!tt", name = "wb", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!tt", name = "xb", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!tt", name = "zb", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!tt", name = "Ab", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!tt", name = "Bb", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!tt", name = "Cb", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!tt", name = "Db", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!tt", name = "Eb", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!tt", name = "Fb", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!tt", name = "Gb", descriptor = "I")
    public int field3786;

    @OriginalMember(owner = "client!tt", name = "Hb", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!tt", name = "Ib", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!tt", name = "Jb", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!tt", name = "Kb", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!tt", name = "Lb", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!tt", name = "Mb", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!tt", name = "Nb", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!tt", name = "Ob", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!tt", name = "Pb", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!tt", name = "Qb", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!tt", name = "Rb", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!tt", name = "Sb", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!tt", name = "Tb", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!tt", name = "Vb", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!tt", name = "Wb", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!tt", name = "Xb", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!tt", name = "Yb", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!tt", name = "Zb", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!tt", name = "ac", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!tt", name = "bc", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!tt", name = "cc", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!tt", name = "dc", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!tt", name = "ec", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!tt", name = "fc", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!tt", name = "gc", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!tt", name = "hc", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!tt", name = "ic", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!tt", name = "jc", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!tt", name = "kc", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!tt", name = "lc", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!tt", name = "mc", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!tt", name = "nc", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!tt", name = "oc", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!tt", name = "pc", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!tt", name = "qc", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!tt", name = "rc", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!tt", name = "sc", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!tt", name = "tc", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!tt", name = "uc", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!tt", name = "wc", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!tt", name = "xc", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!tt", name = "yc", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!tt", name = "zc", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!tt", name = "Ac", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!tt", name = "Bc", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!tt", name = "Cc", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!tt", name = "Dc", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!tt", name = "Ec", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!tt", name = "Fc", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!tt", name = "Gc", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!tt", name = "Hc", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!tt", name = "Ic", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!tt", name = "Jc", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!tt", name = "Kc", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!tt", name = "Lc", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!tt", name = "Mc", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!tt", name = "Nc", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!tt", name = "Oc", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!tt", name = "Pc", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!tt", name = "Qc", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!tt", name = "Rc", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!tt", name = "Sc", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!tt", name = "Tc", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!tt", name = "Uc", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!tt", name = "Vc", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!tt", name = "Wc", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!tt", name = "Xc", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!tt", name = "Yc", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!tt", name = "Zc", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!tt", name = "ad", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!tt", name = "dd", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!tt", name = "ed", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!tt", name = "fd", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!tt", name = "gd", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!tt", name = "hd", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!tt", name = "id", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!tt", name = "jd", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!tt", name = "kd", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!tt", name = "ld", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!tt", name = "md", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!tt", name = "nd", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!tt", name = "od", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!tt", name = "pd", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!tt", name = "qd", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!tt", name = "rd", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!tt", name = "sd", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!tt", name = "td", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!tt", name = "ud", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!tt", name = "vd", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!tt", name = "wd", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!tt", name = "xd", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!tt", name = "Bd", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!tt", name = "Cd", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!tt", name = "Dd", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!tt", name = "Ed", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!tt", name = "Fd", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!tt", name = "Gd", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!tt", name = "Hd", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!tt", name = "Id", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!tt", name = "Jd", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!tt", name = "Ld", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!tt", name = "Md", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!tt", name = "Nd", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!tt", name = "Od", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!tt", name = "Pd", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!tt", name = "Qd", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!tt", name = "Rd", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!tt", name = "Sd", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!tt", name = "Ud", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!tt", name = "Vd", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!tt", name = "Yd", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!tt", name = "be", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!tt", name = "ce", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!tt", name = "ee", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!tt", name = "fe", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!tt", name = "ge", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!tt", name = "he", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!tt", name = "ie", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!tt", name = "je", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!tt", name = "re", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!tt", name = "Ce", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!tt", name = "De", descriptor = "I")
    private int field3939;

    @OriginalMember(owner = "client!tt", name = "Fe", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!tt", name = "Te", descriptor = "I")
    private int field3955;

    @OriginalMember(owner = "client!tt", name = "We", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!tt", name = "Xe", descriptor = "I")
    private int field3959;

    @OriginalMember(owner = "client!tt", name = "Ye", descriptor = "I")
    private int field3960;

    @OriginalMember(owner = "client!tt", name = "af", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!tt", name = "cf", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!tt", name = "ef", descriptor = "I")
    private int field3966;

    @OriginalMember(owner = "client!tt", name = "gf", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!tt", name = "pf", descriptor = "I")
    private int field3976;

    @OriginalMember(owner = "client!tt", name = "rf", descriptor = "I")
    private int field3978;

    @OriginalMember(owner = "client!tt", name = "Ef", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!tt", name = "Jf", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!tt", name = "hg", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!tt", name = "lg", descriptor = "I")
    private int field4024;

    @OriginalMember(owner = "client!tt", name = "Fg", descriptor = "I")
    private int field4044;

    @OriginalMember(owner = "client!tt", name = "dh", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!tt", name = "fh", descriptor = "I")
    private int field4070;

    @OriginalMember(owner = "client!tt", name = "bg", descriptor = "J")
    private long field4014;

    @OriginalMember(owner = "client!tt", name = "ve", descriptor = "Lun;")
    private class119 field3931;

    @OriginalMember(owner = "client!tt", name = "we", descriptor = "Lun;")
    private class119 field3932;

    @OriginalMember(owner = "client!tt", name = "pg", descriptor = "Lql;")
    private class121 field4028;

    @OriginalMember(owner = "client!tt", name = "zg", descriptor = "Lql;")
    private class121 field4038;

    @OriginalMember(owner = "client!tt", name = "tf", descriptor = "Lak;")
    public class35 field3980;

    @OriginalMember(owner = "client!tt", name = "Ue", descriptor = "Lpp;")
    public class387 field3956;

    @OriginalMember(owner = "client!tt", name = "Og", descriptor = "Lpp;")
    public class387 field4053;

    @OriginalMember(owner = "client!tt", name = "yf", descriptor = "Ltm;")
    private class406 field3985;

    @OriginalMember(owner = "client!tt", name = "ug", descriptor = "Lf;")
    private class412 field4033;

    @OriginalMember(owner = "client!tt", name = "Pe", descriptor = "Lqo;")
    public class425 field3951;

    @OriginalMember(owner = "client!tt", name = "mf", descriptor = "Lqo;")
    public class425 field3973;

    @OriginalMember(owner = "client!tt", name = "nf", descriptor = "Lqo;")
    public class425 field3974;

    @OriginalMember(owner = "client!tt", name = "Cf", descriptor = "Lqo;")
    public class425 field3989;

    @OriginalMember(owner = "client!tt", name = "Wf", descriptor = "Lqo;")
    public class425 field4009;

    @OriginalMember(owner = "client!tt", name = "cg", descriptor = "Lqo;")
    public class425 field4015;

    @OriginalMember(owner = "client!tt", name = "fg", descriptor = "Lqo;")
    public class425 field4018;

    @OriginalMember(owner = "client!tt", name = "yg", descriptor = "Lqo;")
    public class425 field4037;

    @OriginalMember(owner = "client!tt", name = "Hg", descriptor = "Lqo;")
    public class425 field4046;

    @OriginalMember(owner = "client!tt", name = "Kg", descriptor = "Lqo;")
    public class425 field4049;

    @OriginalMember(owner = "client!tt", name = "Rg", descriptor = "Lfp;")
    private class440 field4056;

    @OriginalMember(owner = "client!tt", name = "Me", descriptor = "Lgl;")
    public class495 field3948;

    @OriginalMember(owner = "client!tt", name = "uf", descriptor = "Lgl;")
    public class495 field3981;

    @OriginalMember(owner = "client!tt", name = "Pg", descriptor = "Lcd;")
    public class65 field4054;

    @OriginalMember(owner = "client!tt", name = "se", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field3928;

    @OriginalMember(owner = "client!tt", name = "Ve", descriptor = "Z")
    private boolean field3957;

    @OriginalMember(owner = "client!tt", name = "ff", descriptor = "Z")
    public boolean field3967;

    @OriginalMember(owner = "client!tt", name = "hf", descriptor = "Z")
    private boolean field3969;

    @OriginalMember(owner = "client!tt", name = "lf", descriptor = "Z")
    private boolean field3972;

    @OriginalMember(owner = "client!tt", name = "Ff", descriptor = "Z")
    private boolean field3992;

    @OriginalMember(owner = "client!tt", name = "Mf", descriptor = "Z")
    public boolean field3999;

    @OriginalMember(owner = "client!tt", name = "Pf", descriptor = "Z")
    private boolean field4002;

    @OriginalMember(owner = "client!tt", name = "Uf", descriptor = "Z")
    public boolean field4007;

    @OriginalMember(owner = "client!tt", name = "gg", descriptor = "Z")
    private boolean field4019;

    @OriginalMember(owner = "client!tt", name = "mg", descriptor = "Z")
    public boolean field4025;

    @OriginalMember(owner = "client!tt", name = "og", descriptor = "Z")
    private boolean field4027;

    @OriginalMember(owner = "client!tt", name = "wg", descriptor = "Z")
    public boolean field4035;

    @OriginalMember(owner = "client!tt", name = "Dg", descriptor = "Z")
    public boolean field4042;

    @OriginalMember(owner = "client!tt", name = "Gg", descriptor = "Z")
    private boolean field4045;

    @OriginalMember(owner = "client!tt", name = "Mg", descriptor = "Z")
    public boolean field4051;

    @OriginalMember(owner = "client!tt", name = "Ng", descriptor = "Z")
    private boolean field4052;

    @OriginalMember(owner = "client!tt", name = "Sg", descriptor = "Z")
    public boolean field4057;

    @OriginalMember(owner = "client!tt", name = "ah", descriptor = "Z")
    private boolean field4065;

    @OriginalMember(owner = "client!tt", name = "Bg", descriptor = "[Lin;")
    private class169[] field4040;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 3)
    public final void method536(Canvas arg0) {
        ++field3739;
        if (this.field3859 == arg0) {
            throw new RuntimeException();
        } else if (this.field3778.containsKey(arg0)) {
            Long var2 = (Long) this.field3778.get(arg0);
            this.field3800.releaseSurface(arg0, var2);
            this.field3778.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZ)V", line = 23)
    public final void method1706(int arg0, boolean arg1) {
        if (arg0 > -32) {
            this.method1730((byte) -12);
        }
        ++field3749;
        if (!this.field3957 == arg1) {
            this.field3957 = arg1;
            this.method1773(16);
            this.field3959 &= -32;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZIII)V", line = 41)
    public final void method1707(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3908;
        if (arg0) {
            OpenGL.glDrawArrays(arg3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(IZ)V", line = 55)
    public final void method1708(int arg0, boolean arg1) {
        ++field3757;
        if (arg0 == -8) {
            if (this.field4019 != arg1) {
                this.field4019 = arg1;
                this.method1721(false);
                this.field3959 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lvm;)V", line = 74)
    public final void method588(class320 arg0) {
        ++field3881;
        this.field3920.method1291(arg0, this, (byte) -105);
    }

    @OriginalMember(owner = "client!tt", name = "GA", descriptor = "(IIII)V", line = 82)
    public final void method541(int arg0, int arg1, int arg2, int arg3) {
        this.field3997 = arg0;
        this.field4055 = arg3;
        this.field3953 = arg1;
        this.field4011 = arg2;
        ++field3774;
        this.method1783((byte) -114);
        this.method1772(8);
        if (this.field3955 != 3) {
            if (this.field3955 == 2) {
                this.method1746(false);
                return;
            }
        } else {
            this.method1767(116);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(FBFFF)V", line = 111)
    public final void method1709(float arg0, byte arg1, float arg2, float arg3, float arg4) {
        int var6 = 114 / ((arg1 - 35) / 50);
        class151.field2263[0] = arg2;
        class151.field2263[3] = arg3;
        class151.field2263[2] = arg0;
        class151.field2263[1] = arg4;
        ++field3819;
        OpenGL.glTexEnvfv(8960, 8705, class151.field2263, 0);
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "()V", line = 129)
    public final void method499() {
        ++field3773;
        this.field3910.method1063((byte) -113);
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(B)V", line = 141)
    private final void method1710(byte arg0) {
        if (this.field3955 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field3758 < -1 && ~this.field3786 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field3758, (double) this.field3786, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field3955 = 1;
            this.field3959 &= -25;
        }
        int var2 = -70 % ((6 - arg0) / 52);
        ++field3855;
    }

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "()Z", line = 165)
    public final boolean method570() {
        ++field3832;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(B)V", line = 174)
    private final void method1711(byte arg0) {
        this.field3948 = new class495();
        ++field3879;
        this.field3981 = new class495();
        this.field4040 = new class169[this.field3996];
        this.field4054 = new class65(this, 3553, 6408, 1, 1);
        new class65(this, 3553, 6408, 1, 1);
        new class65(this, 3553, 6408, 1, 1);
        if (arg0 < 93) {
            this.method581();
        }
        this.field4018 = new class425(this);
        this.field4049 = new class425(this);
        this.field3974 = new class425(this);
        this.field4009 = new class425(this);
        this.field3973 = new class425(this);
        this.field4046 = new class425(this);
        this.field4015 = new class425(this);
        this.field3951 = new class425(this);
        this.field4037 = new class425(this);
        this.field3989 = new class425(this);
        if (this.field3993) {
            this.field3980 = new class35(this);
            new class35(this);
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(II)V", line = 213)
    public final void method514(int arg0, int arg1) {
        if (~this.field4013 != ~arg0 || this.field4016 != arg1) {
            this.field4016 = arg1;
            this.field4013 = arg0;
            this.method1783((byte) -86);
            this.method1753(23597);
            if (this.field3955 == 3) {
                this.method1767(114);
            } else if (~this.field3955 == -3) {
                this.method1746(false);
            }
        }
        ++field3753;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIZ)Lo;", line = 239)
    public final class363 method601(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3880;
        return new class322(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "()Z", line = 249)
    public final boolean method560() {
        ++field3785;
        return false;
    }

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "(I)V", line = 259)
    public final void method1712(int arg0) {
        if (arg0 != 255) {
            this.field3934 = 36;
        }
        OpenGL.glPushMatrix();
        ++field3727;
    }

    @OriginalMember(owner = "client!tt", name = "AA", descriptor = "()I", line = 270)
    public final int method537() {
        ++field3848;
        return this.field4013;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIII)V", line = 278)
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3784;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1779(-2);
        this.method1732(arg5, 9);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3969) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3969) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!tt", name = "OA", descriptor = "()I", line = 310)
    public final int method590() {
        ++field3769;
        int var1 = this.field4070;
        this.field4070 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "()Z", line = 322)
    public final boolean method581() {
        ++field3788;
        return this.field3969 && (!this.method544() || this.field3972);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V", line = 330)
    public final synchronized void method1713(int arg0, int arg1, int arg2) {
        ++field3851;
        class50 var4 = new class50(arg1);
        var4.field1932 = (long) arg0;
        this.field3942.method292((byte) 121, var4);
        if (arg2 != 6144) {
            this.method1731(20);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lun;B)V", line = 345)
    public final void method1714(class119 arg0, byte arg1) {
        if (arg1 <= 27) {
            this.method580();
        }
        ++field3781;
        if (this.field3935 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field3935 <= -1) {
                this.field3930[this.field3935].method221(11957);
            }
            this.field3931 = this.field3930[++this.field3935] = arg0;
            this.field3931.method216(6177);
        }
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)V", line = 363)
    private final void method1715(byte arg0) {
        OpenGL.glViewport(this.field3970, this.field4047, this.field3758, this.field3786);
        if (arg0 != 50) {
            this.method1711((byte) 106);
        }
        ++field3886;
    }

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)V", line = 374)
    private final void method1716(int arg0) {
        if ((float) arg0 == this.field4062) {
            this.field3961[10] = this.field3971;
            this.field3961[14] = this.field4010;
        } else {
            float var2 = this.field4058 / (this.field4062 + this.field4058);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field4010 * (1.0F - var2) / this.field4062;
            this.field3961[10] = this.field3971 + var4;
            this.field3961[14] = this.field4010 * var3;
        }
        ++field3852;
        this.field4041 = (this.field3961[14] + (float) (-this.field4016)) / this.field3961[10];
        this.field3949 = (float) this.field4016 + -this.field4062;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIB)V", line = 404)
    public final synchronized void method1717(int arg0, int arg1, byte arg2) {
        ++field3805;
        class50 var4 = new class50(arg1);
        int var5 = -97 % ((arg2 - 4) / 56);
        var4.field1932 = (long) arg0;
        this.field3945.method292((byte) 121, var4);
    }

    @OriginalMember(owner = "client!tt", name = "ba", descriptor = "(IIII)V", line = 417)
    public final void method571(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > this.field3786) {
            arg3 = this.field3786;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        ++field3874;
        if (this.field3758 < arg2) {
            arg2 = this.field3758;
        }
        this.field3952 = arg3;
        this.field4001 = arg1;
        this.field4036 = arg0;
        this.field4060 = arg2;
        OpenGL.glEnable(3089);
        this.method1772(8);
        this.method1770(false);
    }

    @OriginalMember(owner = "client!tt", name = "VA", descriptor = "(IIIIII)Z", line = 447)
    public final boolean method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3893;
        float var7 = (float) arg2 * this.field3948.field7237 + (float) arg0 * this.field3948.field7214 + (float) arg1 * this.field3948.field7221 + this.field3948.field7229;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3948.field7237 + (float) arg3 * this.field3948.field7214 + (float) arg4 * this.field3948.field7221 + this.field3948.field7229;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field4013 > var7) || !(var8 < (float) this.field4013)) && (!((float) this.field4016 < var7) || !(var8 > (float) this.field4016))) {
            int var9 = (int) (((float) arg2 * this.field3948.field7230 + (float) arg0 * this.field3948.field7233 + (float) arg1 * this.field3948.field7235 + this.field3948.field7216) * (float) this.field4011 / var7);
            int var10 = (int) (((float) arg5 * this.field3948.field7230 + (float) arg3 * this.field3948.field7233 + (float) arg4 * this.field3948.field7235 + this.field3948.field7216) * (float) this.field4011 / var8);
            if ((float) var9 < this.field4012 && (float) var10 < this.field4012 || this.field4032 < (float) var9 && this.field4032 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field3948.field7209 + (float) arg0 * this.field3948.field7231 + (float) arg1 * this.field3948.field7236 + this.field3948.field7210) * (float) this.field4055 / var7);
                int var12 = (int) (((float) arg5 * this.field3948.field7209 + (float) arg3 * this.field3948.field7231 + (float) arg4 * this.field3948.field7236 + this.field3948.field7210) * (float) this.field4055 / var8);
                return (!((float) var11 < this.field4023) || !((float) var12 < this.field4023)) && (!((float) var11 > this.field4022) || !((float) var12 > this.field4022));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(Z)V", line = 487)
    public final void method597(boolean arg0) {
        ++field3744;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIZ)V", line = 500)
    public final void method1718(int arg0, int arg1, boolean arg2) {
        this.method1743(-13055, true, arg0, arg2);
        ++field3811;
        if (arg1 != 24295) {
            this.field3928 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(Z)V", line = 512)
    public static void method1719(boolean arg0) {
        if (!arg0) {
            method1719(true);
        }
        field3827 = null;
        field3884 = null;
        field3860 = null;
        field3894 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lap;[Lrr;Z)Lla;", line = 525)
    public final class310 method542(class29 arg0, class309[] arg1, boolean arg2) {
        ++field3767;
        return new class266(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lbn;)V", line = 533)
    public final void method526(class307 arg0) {
        this.field3985 = (class406) arg0;
        ++field3900;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "()V", line = 543)
    public final void method530() {
        ++field3885;
        try {
            this.field3800.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "(I)V", line = 560)
    public final void method1720(int arg0) {
        int var2 = 104 / ((arg0 - 68) / 32);
        ++field3794;
        if (~this.field3959 != -5) {
            this.method1710((byte) 109);
            this.method1775((byte) -106, false);
            this.method1708(-8, false);
            this.method1739((byte) 81, false);
            this.method1706(-102, false);
            this.method1725(-128, -2);
            this.method1732(1, 9);
            this.method1734(-104, 0);
            this.field3959 = 4;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 585)
    public final void method539(Canvas arg0) {
        ++field3846;
        if (this.field3859 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3778.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field3800.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field3778.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "ZA", descriptor = "(IIIII)V", line = 624)
    public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3876;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(Z)V", line = 634)
    private final void method1721(boolean arg0) {
        if (this.field4019 && !this.field4002) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field3813;
        if (arg0) {
            this.field4047 = -78;
        }
    }

    @OriginalMember(owner = "client!tt", name = "sa", descriptor = "(IIII)[I", line = 649)
    public final int[] method587(int arg0, int arg1, int arg2, int arg3) {
        ++field3722;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field3786 + -arg1, arg2, 1, 32993, this.field4048, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lgl;I)V", line = 672)
    public final void method1722(class495 arg0, int arg1) {
        ++field3731;
        OpenGL.glLoadMatrixf(arg0.method2969(arg1 + -12976), 0);
        if (arg1 != 12975) {
            this.field3960 = 68;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Ln;", line = 683)
    public final class393 method605(int arg0) {
        ++field3729;
        class319 var2 = new class319(arg0);
        this.field3926.method292((byte) 121, var2);
        return var2;
    }

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "(IFFFFF)V", line = 694)
    public final void method596(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3877;
        boolean var7 = ~this.field4031 != ~arg0;
        if (var7 || this.field3983 != arg1 || this.field4017 != arg2) {
            this.field3983 = arg1;
            this.field4031 = arg0;
            this.field4017 = arg2;
            if (var7) {
                this.field3982 = (float) (this.field4031 & 255) / 255.0F;
                this.field4021 = (float) (this.field4031 & 16711680) / 1.671168E7F;
                this.field3995 = (float) (65280 & this.field4031) / 65280.0F;
                this.method1752(6408);
            }
            this.method1754((byte) -91);
        }
        if (this.field4003[0] != arg3 || this.field4003[1] != arg4 || this.field4003[2] != arg5) {
            this.field4003[1] = arg4;
            this.field4003[2] = arg5;
            this.field4003[0] = arg3;
            this.field3984[1] = -arg4;
            this.field3984[0] = -arg3;
            this.field3984[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3986[2] = arg5 * var8;
            this.field3986[1] = arg4 * var8;
            this.field3986[0] = arg3 * var8;
            this.field3979[2] = -this.field3986[2];
            this.field3979[1] = -this.field3986[1];
            this.field3979[0] = -this.field3986[0];
            this.method1774(4611);
            this.field3968 = (int) (arg5 * 256.0F / arg4);
            this.field3958 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IF)V", line = 743)
    public final void method1723(int arg0, float arg1) {
        ++field3872;
        if (arg0 == -4) {
            if (this.field4050 != arg1) {
                this.field4050 = arg1;
                if (~this.field3955 == -4) {
                    this.method1767(86);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "(I)V", line = 763)
    public final void method1724(int arg0) {
        ++field3796;
        if (arg0 != -28440) {
            this.method1749(-124, (class169) null);
        }
        if (this.field3959 != 8) {
            this.method1727(104);
            this.method1775((byte) -106, true);
            this.method1739((byte) 114, true);
            this.method1706(arg0 + 28329, true);
            this.method1732(1, 9);
            this.method1734(arg0 ^ 28494, 0);
            this.field3959 = 8;
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(II)V", line = 787)
    public final void method1725(int arg0, int arg1) {
        int var3 = 51 / ((arg0 - -49) / 62);
        this.method1718(arg1, 24295, true);
        ++field3917;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V", line = 797)
    public final void method591(boolean arg0) {
        ++field3799;
    }

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "(I)V", line = 804)
    private final void method1726(int arg0) {
        if (arg0 != -1064) {
            this.field3937 = null;
        }
        ++field3798;
        if (this.field4045 && this.field4057 | this.field3998 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!tt", name = "JA", descriptor = "(F)V", line = 821)
    public final void method502(float arg0) {
        ++field3733;
        if (this.field3965 != arg0) {
            this.field3965 = arg0;
            this.method1752(6408);
        }
    }

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "()I", line = 840)
    public final int method572() {
        ++field3857;
        return 4;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Le;Lvm;Lc;Lwg;I)V", line = 848)
    public final void method584(class289 arg0, class320 arg1, class517 arg2, class41 arg3, int arg4) {
        ++field3772;
        arg0.method673(arg2, arg3, arg4);
        this.method588(arg1);
    }

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "(I)V", line = 857)
    private final void method1727(int arg0) {
        if (this.field3955 != 2) {
            this.field3955 = 2;
            this.method1746(false);
            this.method1781(-9570);
            this.field3959 &= -8;
        }
        if (arg0 < 99) {
            this.field4069 = null;
        }
        ++field3817;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lbn;Lbn;FLbn;)Lbn;", line = 877)
    public final class307 method550(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        ++field3824;
        if (arg0 != null && arg1 != null && this.field4025 && this.field3993) {
            class9 var5 = null;
            class406 var6 = (class406) arg0;
            class406 var7 = (class406) arg1;
            class32 var8 = var6.method44(6);
            class32 var9 = var7.method44(6);
            if (var8 != null && var9 != null) {
                int var10 = var9.field383 < var8.field383 ? var8.field383 : var9.field383;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class9) {
                    class9 var11 = (class9) arg3;
                    if (var10 == var11.method45((byte) 106)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class9(this, var10);
                }
                if (var5.method46(var8, arg2, var9, 1)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(B)I", line = 928)
    private final int method1728(byte arg0) {
        ++field3790;
        int var2 = 0;
        this.field4059 = OpenGL.glGetString(7936).toLowerCase();
        this.field4005 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field4059.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field4059.indexOf("brian paul") != -1 || ~this.field4059.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class454.method2784(' ', 1, var3.replace('.', ' '));
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class453.method2777(var4[0], 10);
                int var6 = class453.method2777(var4[1], 10);
                this.field3966 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field3966 > -13) {
            var2 |= 2;
        }
        if (!this.field3800.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3800.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field3996 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field3962 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field3978 = var7[0];
        if (~this.field3996 > -3 || this.field3962 < 2 || this.field3978 < 2) {
            var2 |= 16;
        }
        this.field3990 = NativeStream.method2927();
        this.field3800.arePbuffersAvailable();
        this.field3994 = this.field3800.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3969 = this.field3800.isExtensionAvailable("GL_ARB_multisample");
        this.field4035 = this.field3800.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3800.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4051 = this.field3800.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4007 = this.field3800.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4039 = this.field3800.isExtensionAvailable("GL_EXT_texture3D");
        this.field3987 = this.field3800.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4025 = this.field3800.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4006 = this.field3800.isExtensionAvailable("GL_ARB_texture_float");
        this.field3967 = false;
        this.field3993 = this.field3800.isExtensionAvailable("GL_EXT_framebuffer_object");
        if (arg0 <= 111) {
            return 85;
        } else {
            this.field4042 = this.field3800.isExtensionAvailable("GL_EXT_framebuffer_blit");
            this.field3999 = this.field3800.isExtensionAvailable("GL_EXT_framebuffer_multisample");
            this.field3972 = this.field3999 & this.field4042;
            return ~var2 == -1 ? 0 : var2;
        }
    }

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "()Z", line = 1013)
    public final boolean method508() {
        ++field3812;
        if (this.field3913 != null) {
            if (!this.field3913.method3170((byte) 101)) {
                if (!this.field3910.method1071(this.field3913, false)) {
                    return false;
                }
                this.field3903.method2774(-108);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(Z)Lrh;", line = 1038)
    public final class32 method1729(boolean arg0) {
        ++field3779;
        if (!arg0) {
            this.field3996 = 26;
        }
        return this.field3985 == null ? null : this.field3985.method44(6);
    }

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "(B)V", line = 1052)
    public final void method1730(byte arg0) {
        if (this.field3959 != 16) {
            this.method1759(-8);
            this.method1775((byte) -106, true);
            this.method1739((byte) 116, true);
            this.method1706(-62, true);
            this.method1732(1, 9);
            this.method1734(-88, 0);
            this.field3959 = 16;
        }
        ++field3745;
        if (arg0 >= -20) {
            this.field3965 = -1.2741506F;
        }
    }

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "()Z", line = 1074)
    public final boolean method515() {
        ++field3818;
        return this.field3913 != null && (~this.field3909 >= -2 || this.field3972);
    }

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "(I)V", line = 1082)
    private final void method1731(int arg0) {
        if (this.field4065) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4065 = false;
        }
        ++field3748;
        if (arg0 >= -40) {
            this.field4028 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "()Z", line = 1102)
    public final boolean method522() {
        ++field3806;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ln;)V", line = 1111)
    public final void method535(class393 arg0) {
        this.field3928 = ((class319) arg0).field4839;
        ++field3840;
        if (this.field4028 == null) {
            class268 var2 = new class268(80);
            if (!this.field3990) {
                var2.method1859(-1.0F, 0);
                var2.method1859(-1.0F, 0);
                var2.method1859(0.0F, 0);
                var2.method1859(0.0F, 0);
                var2.method1859(1.0F, 0);
                var2.method1859(1.0F, 0);
                var2.method1859(-1.0F, 0);
                var2.method1859(0.0F, 0);
                var2.method1859(1.0F, 0);
                var2.method1859(1.0F, 0);
                var2.method1859(1.0F, 0);
                var2.method1859(1.0F, 0);
                var2.method1859(0.0F, 0);
                var2.method1859(1.0F, 0);
                var2.method1859(0.0F, 0);
                var2.method1859(-1.0F, 0);
                var2.method1859(1.0F, 0);
                var2.method1859(0.0F, 0);
                var2.method1859(0.0F, 0);
                var2.method1859(0.0F, 0);
            } else {
                var2.method1857(false, -1.0F);
                var2.method1857(false, -1.0F);
                var2.method1857(false, 0.0F);
                var2.method1857(false, 0.0F);
                var2.method1857(false, 1.0F);
                var2.method1857(false, 1.0F);
                var2.method1857(false, -1.0F);
                var2.method1857(false, 0.0F);
                var2.method1857(false, 1.0F);
                var2.method1857(false, 1.0F);
                var2.method1857(false, 1.0F);
                var2.method1857(false, 1.0F);
                var2.method1857(false, 0.0F);
                var2.method1857(false, 1.0F);
                var2.method1857(false, 0.0F);
                var2.method1857(false, -1.0F);
                var2.method1857(false, 1.0F);
                var2.method1857(false, 0.0F);
                var2.method1857(false, 0.0F);
                var2.method1857(false, 0.0F);
            }
            this.field4028 = this.method1735(var2.field2973, false, 20, var2.field2982, 32);
            this.field3956 = new class387(this.field4028, 5126, 3, 0);
            this.field4053 = new class387(this.field4028, 5126, 2, 12);
            this.field3920.method1289(this, true);
        }
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(II)V", line = 1178)
    public final void method1732(int arg0, int arg1) {
        if (this.field4020 != arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg0 == 1) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (arg0 != 2) {
                if (arg0 != 128) {
                    var5 = 0;
                    var3 = true;
                    var4 = false;
                } else {
                    var5 = 3;
                    var3 = true;
                    var4 = true;
                }
            } else {
                var5 = 2;
                var4 = false;
                var3 = true;
            }
            if (!var3 == this.field3992) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field3992 = var3;
            }
            if (this.field4052 == !var4) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field4052 = var4;
            }
            if (this.field4044 != var5) {
                if (var5 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var5 != 2) {
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
                this.field4044 = var5;
            }
            this.field4020 = arg0;
            this.field3959 &= -29;
        }
        if (arg1 != 9) {
            this.method569(-79, -40, 66, -33, -7, 0.4123519F);
        }
        ++field3891;
    }

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "()V", line = 1272)
    public final void method585() {
        this.field4057 = false;
        ++field3766;
        this.field3907.method1174(false, false, 0, 0, -118, 0);
        this.method1753(23597);
        this.method1726(-1064);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(FBFF)V", line = 1286)
    private final void method1733(float arg0, byte arg1, float arg2, float arg3) {
        if (arg1 != -27) {
            this.method1721(true);
        }
        OpenGL.glMatrixMode(5890);
        ++field3865;
        if (this.field4065) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg0, arg2);
        OpenGL.glMatrixMode(5888);
        this.field4065 = true;
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(II)V", line = 1305)
    public final void method1734(int arg0, int arg1) {
        ++field3763;
        if (arg0 <= -17) {
            if (arg1 == 1) {
                this.method1741(7681, (byte) -76, 7681);
            } else if (arg1 == 0) {
                this.method1741(8448, (byte) -31, 8448);
            } else {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.method1741(260, (byte) 103, 8448);
                        return;
                    }
                    if (arg1 == 4) {
                        this.method1741(34023, (byte) -49, 34023);
                        return;
                    }
                } else {
                    this.method1741(34165, (byte) 122, 7681);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([BZIII)Lql;", line = 1335)
    public final class121 method1735(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3850;
        if (arg4 != 32) {
            return null;
        } else {
            return (class121) (!this.field3994 || arg1 && !this.field4063 ? new class364(this, arg2, arg0, arg3) : new class250(this, arg2, arg0, arg3, arg1));
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIILta;II)V", line = 1351)
    public final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class340 arg6, int arg7, int arg8) {
        ++field3835;
        class415 var10 = (class415) arg6;
        class412 var11 = var10.field6106;
        this.method1758((byte) 79);
        this.method1749(25752, var10.field6106);
        this.method1732(arg5, 9);
        this.method1741(7681, (byte) -111, 8448);
        this.method1780(768, 34167, 34176, 0);
        float var12 = var11.field6080 / (float) var11.field6076;
        float var13 = var11.field6075 / (float) var11.field6077;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method1780(768, 5890, 34176, 0);
    }

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "(IIIIII[BII)V", line = 1386)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3771;
        float var10;
        float var11;
        if (this.field4033 != null && this.field4033.field1026 >= arg2 && this.field4033.field1027 >= arg3) {
            this.field4033.method442(0, 0, arg3, 0, 0, arg6, 6406, arg2, false, 3314);
            var10 = (float) arg2 * this.field4033.field6080 / (float) this.field4033.field1026;
            var11 = (float) arg3 * this.field4033.field6075 / (float) this.field4033.field1027;
        } else {
            this.field4033 = class447.method2751(6406, this, (byte) 70, arg3, arg6, false, arg2, 6406);
            this.field4033.method437(false, (byte) -121, false);
            var10 = this.field4033.field6080;
            var11 = this.field4033.field6075;
        }
        this.method1758((byte) 116);
        this.method1749(25752, this.field4033);
        this.method1732(arg8, 9);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1745(arg5, 2);
        this.method1741(34165, (byte) 118, 34165);
        this.method1780(768, 34166, 34176, 0);
        this.method1780(770, 5890, 34176, 2);
        this.method1778(34166, 770, 1, 0);
        this.method1778(5890, 770, 1, 2);
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
        this.method1780(768, 5890, 34176, 0);
        this.method1780(770, 34166, 34176, 2);
        this.method1778(5890, 770, 1, 0);
        this.method1778(34166, 770, 1, 2);
    }

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "()Z", line = 1444)
    public final boolean method544() {
        ++field3915;
        return this.field3913 != null && this.field3913.method3170((byte) 46);
    }

    @OriginalMember(owner = "client!tt", name = "Q", descriptor = "(III)V", line = 1458)
    public final void method534(int arg0, int arg1, int arg2) {
        if (this.field4064 != arg0 || this.field3998 != arg1 || ~this.field4000 != ~arg2) {
            this.field3998 = arg1;
            this.field4000 = arg2;
            this.field4064 = arg0;
            if (!this.field4057) {
                this.method1753(23597);
                this.method1726(-1064);
            }
        }
        ++field3853;
    }

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "(II)I", line = 1484)
    public final int method1736(int arg0, int arg1) {
        int var3 = -89 % ((-6 - arg1) / 44);
        ++field3842;
        if (~arg0 != -2) {
            if (~arg0 == -1) {
                return 8448;
            } else if (~arg0 == -3) {
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
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lun;B)V", line = 1513)
    public final void method1737(class119 arg0, byte arg1) {
        ++field3764;
        if (~this.field3935 <= -1 && this.field3930[this.field3935] == arg0) {
            if (arg1 == 54) {
                this.field3930[this.field3935--] = null;
                arg0.method221(11957);
                if (this.field3935 >= 0) {
                    this.field3931 = this.field3930[this.field3935];
                    this.field3931.method216(6177);
                } else {
                    this.field3931 = null;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(ZI)V", line = 1537)
    public final void method1738(boolean arg0, int arg1) {
        ++field3732;
        if (!arg0 == this.field4002) {
            this.field4002 = arg0;
            this.method1721(false);
        }
        if (arg1 != 255) {
            this.method557(-72, -110);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BZ)V", line = 1554)
    public final void method1739(byte arg0, boolean arg1) {
        ++field3756;
        if (arg0 > 67) {
            if (this.field4027 != arg1) {
                if (arg1) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
                this.field3959 &= -32;
                this.field4027 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)V", line = 1577)
    public final synchronized void method1740(byte arg0, int arg1, int arg2) {
        ++field3916;
        if (arg0 < 76) {
            this.method1771((byte) 55, (class119) null);
        }
        class50 var4 = new class50(arg1);
        var4.field1932 = (long) arg2;
        this.field3943.method292((byte) 121, var4);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBI)V", line = 1591)
    public final void method1741(int arg0, byte arg1, int arg2) {
        ++field3863;
        if (~this.field3991 == -1) {
            boolean var4 = false;
            if (~this.field4061 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                this.field4061 = arg0;
                var4 = true;
            }
            if (~this.field3977 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field3977 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field3959 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
        int var5 = -113 / ((49 - arg1) / 53);
    }

    @OriginalMember(owner = "client!tt", name = "va", descriptor = "()V", line = 1632)
    public final void method577() {
        this.field4060 = this.field3758;
        this.field3952 = this.field3786;
        this.field4001 = 0;
        this.field4036 = 0;
        ++field3725;
        OpenGL.glDisable(3089);
        this.method1772(8);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII)V", line = 1648)
    public final void method561(int arg0, int arg1, int arg2, int arg3) {
        ++field3888;
        if (!this.field4057) {
            throw new RuntimeException("");
        } else {
            this.field3964 = arg0;
            this.field4008 = arg3;
            this.field4034 = arg2;
            this.field3975 = arg1;
            this.field3907.field2479.method1282(-106);
            this.method1753(23597);
        }
    }

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "()I", line = 1669)
    public final int method547() {
        ++field3803;
        return this.field4016;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)V", line = 1682)
    public final synchronized void method1742(byte arg0, int arg1) {
        ++field3741;
        class130 var3 = new class130();
        var3.field1932 = (long) arg1;
        if (arg0 > 87) {
            this.field3946.method292((byte) 121, var3);
        }
    }

    @OriginalMember(owner = "client!tt", name = "IA", descriptor = "(IIIII)V", line = 1696)
    public final void method548(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3793;
        this.method1779(-2);
        this.method1732(arg4, 9);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "()Z", line = 1716)
    public final boolean method563() {
        ++field3801;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZIZ)V", line = 1724)
    public final void method1743(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg0 != -13055) {
            this.field3907 = null;
        }
        if (~this.field3976 != ~arg2) {
            if (~arg2 > -1) {
                this.method1731(-48);
                this.method1749(25752, (class169) null);
                this.method1734(-50, 0);
                if (!this.field4057) {
                    this.field3907.method1174(arg1, arg3, 0, 0, -74, 0);
                }
            } else {
                class65 var5 = this.field3903.method2776(arg2, 64);
                class420 var6 = super.field4588.method938(arg0 + 41978, arg2);
                if (var6.field6166 == 0 && ~var6.field6154 == -1) {
                    this.method1731(-62);
                } else {
                    int var7 = !var6.field6170 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method1733((float) (this.field3927 % var8 * var6.field6154) / (float) var8, (byte) -27, 0.0F, (float) (this.field3927 % var8 * var6.field6166) / (float) var8);
                }
                if (this.field4057) {
                    this.method1749(arg0 + 38807, var5);
                    this.method1734(-89, var6.field6158);
                } else {
                    this.field3907.method1174(arg1, arg3, var6.field6169, var6.field6179, -69, var6.field6178);
                    if (!this.field3907.method1176(false, var6.field6158, var5)) {
                        this.method1749(arg0 ^ -22119, var5);
                        this.method1734(arg0 ^ 12981, var6.field6158);
                    }
                }
            }
            this.field3976 = arg2;
        }
        ++field3918;
        this.field3959 &= -8;
    }

    @OriginalMember(owner = "client!tt", name = "ra", descriptor = "(ILta;II)V", line = 1787)
    public final void method604(int arg0, class340 arg1, int arg2, int arg3) {
        ++field3836;
        class415 var5 = (class415) arg1;
        class412 var6 = var5.field6106;
        this.method1758((byte) -5);
        this.method1749(25752, var5.field6106);
        this.method1732(1, 9);
        this.method1741(7681, (byte) -79, 8448);
        this.method1780(768, 34167, 34176, 0);
        float var7 = var6.field6080 / (float) var6.field6076;
        float var8 = var6.field6075 / (float) var6.field6077;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4036) * var7, (float) (-arg3 + this.field4001) * var8);
        OpenGL.glVertex2i(this.field4036, this.field4001);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4036) * var7, (float) (-arg3 + this.field3952) * var8);
        OpenGL.glVertex2i(this.field4036, this.field3952);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4060) * var7, (float) (-arg3 + this.field3952) * var8);
        OpenGL.glVertex2i(this.field4060, this.field3952);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4060) * var7, (float) (this.field4001 - arg3) * var8);
        OpenGL.glVertex2i(this.field4060, this.field4001);
        OpenGL.glEnd();
        this.method1780(768, 5890, 34176, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)I", line = 1823)
    public final int method1744(int arg0, byte arg1) {
        ++field3875;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (arg0 != 6410 && arg0 != 34846 && arg0 != 34844) {
                if (arg0 != 6407) {
                    if (arg0 != 6408 && ~arg0 != -34848) {
                        if (~arg0 == -34844) {
                            return 6;
                        } else if (arg0 == 34842) {
                            return 8;
                        } else if (~arg0 == -6403) {
                            return 3;
                        } else if (~arg0 == -6402) {
                            return 1;
                        } else if (arg1 != -27) {
                            return -39;
                        } else {
                            throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "(II)V", line = 1865)
    public final void method1745(int arg0, int arg1) {
        class151.field2263[3] = (float) (arg0 >>> 24) / 255.0F;
        class151.field2263[arg1] = (float) class307.method2028(255, arg0) / 255.0F;
        class151.field2263[0] = (float) class307.method2028(16711680, arg0) / 1.671168E7F;
        class151.field2263[1] = (float) class307.method2028(65280, arg0) / 65280.0F;
        ++field3890;
        OpenGL.glTexEnvfv(8960, 8705, class151.field2263, 0);
    }

    @OriginalMember(owner = "client!tt", name = "T", descriptor = "()F", line = 1877)
    public final float method498() {
        ++field3868;
        return this.field4058;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1890)
    public final void method518(Canvas arg0) {
        ++field3873;
        long var2 = 0L;
        if (arg0 != null && this.field3859 != arg0) {
            if (this.field3778.containsKey(arg0)) {
                Long var4 = (Long) this.field3778.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field3883;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field3800.surfaceResized(var2);
            if (this.field3882 == arg0) {
                this.method1769((byte) -43);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "(Z)V", line = 1930)
    private final void method1746(boolean arg0) {
        OpenGL.glMatrixMode(5889);
        ++field3919;
        OpenGL.glLoadMatrixf(this.field3961, 0);
        if (arg0) {
            this.field4048 = 14;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLgl;)V", line = 1946)
    public final void method1747(boolean arg0, class495 arg1) {
        ++field3804;
        if (arg0) {
            OpenGL.glPushMatrix();
            OpenGL.glMultMatrixf(arg1.method2969(-1), 0);
        }
    }

    @OriginalMember(owner = "client!tt", name = "P", descriptor = "(IIIIII)V", line = 1958)
    public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3844;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1779(-2);
        float var10 = (float) arg3 + var8;
        this.method1732(arg5, 9);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3969) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3969) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIIIII)V", line = 1993)
    public final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3838;
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)V", line = 2002)
    public final synchronized void method594(int arg0) {
        ++field3912;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field3942.method293((byte) 103)) {
            class50 var12 = (class50) this.field3942.method298(-47);
            class536.field7864[var3++] = (int) var12.field1932;
            this.field3938 -= var12.field771;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class536.field7864, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class536.field7864, 0);
            var3 = 0;
        }
        while (!this.field3943.method293((byte) 106)) {
            class50 var11 = (class50) this.field3943.method298(-93);
            class536.field7864[var3++] = (int) var11.field1932;
            this.field3941 -= var11.field771;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class536.field7864, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class536.field7864, 0);
            var3 = 0;
        }
        while (!this.field3944.method293((byte) 78)) {
            class50 var10 = (class50) this.field3944.method298(-21);
            class536.field7864[var3++] = var10.field771;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class536.field7864, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class536.field7864, 0);
            var3 = 0;
        }
        while (!this.field3945.method293((byte) 118)) {
            class50 var9 = (class50) this.field3945.method298(-25);
            class536.field7864[var3++] = (int) var9.field1932;
            this.field3939 -= var9.field771;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class536.field7864, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class536.field7864, 0);
            boolean var4 = false;
        }
        while (!this.field3940.method293((byte) 84)) {
            class50 var8 = (class50) this.field3940.method298(-27);
            OpenGL.glDeleteLists((int) var8.field1932, var8.field771);
        }
        while (!this.field3946.method293((byte) 97)) {
            class130 var7 = this.field3946.method298(-61);
            OpenGL.glDeleteProgramARB((int) var7.field1932);
        }
        while (!this.field3947.method293((byte) 89)) {
            class130 var6 = this.field3947.method298(-113);
            OpenGL.glDeleteObjectARB(var6.field1932);
        }
        while (!this.field3940.method293((byte) 103)) {
            class50 var5 = (class50) this.field3940.method298(-27);
            OpenGL.glDeleteLists((int) var5.field1932, var5.field771);
        }
        this.field3903.method2778((byte) 110);
        if (this.method543() > 100663296 && class375.method2397((byte) -75) > this.field4014 + 60000L) {
            System.gc();
            this.field4014 = class375.method2397((byte) -75);
        }
        this.field3927 = var2;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(IIII)V", line = 2166)
    public final void method523(int arg0, int arg1, int arg2, int arg3) {
        this.field3910.method1067(arg0, arg2, arg3, arg1, (byte) -60);
        ++field3768;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lpp;Lpp;Lpp;ILpp;)V", line = 2177)
    public final void method1748(class387 arg0, class387 arg1, class387 arg2, int arg3, class387 arg4) {
        ++field3862;
        if (arg4 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1785((byte) -87, arg4.field5689);
            OpenGL.glVertexPointer(arg4.field5691, arg4.field5692, this.field4038.method905((byte) -124), this.field4038.method904(arg3 + 26405) - -((long) arg4.field5687));
            OpenGL.glEnableClientState(32884);
        }
        if (arg2 != null) {
            this.method1785((byte) -102, arg2.field5689);
            OpenGL.glNormalPointer(arg2.field5692, this.field4038.method905((byte) -124), this.field4038.method904(26405) - -((long) arg2.field5687));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method1785((byte) -82, arg0.field5689);
            OpenGL.glColorPointer(arg0.field5691, arg0.field5692, this.field4038.method905((byte) -124), this.field4038.method904(arg3 + 26405) - -((long) arg0.field5687));
            OpenGL.glEnableClientState(32886);
        }
        if (arg3 == 0) {
            if (arg1 != null) {
                this.method1785((byte) -104, arg1.field5689);
                OpenGL.glTexCoordPointer(arg1.field5691, arg1.field5692, this.field4038.method905((byte) -124), this.field4038.method904(arg3 + 26405) + (long) arg1.field5687);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILin;)V", line = 2226)
    public final void method1749(int arg0, class169 arg1) {
        ++field3783;
        if (arg0 == 25752) {
            class169 var3 = this.field4040[this.field3991];
            if (arg1 != var3) {
                if (arg1 != null) {
                    if (var3 == null) {
                        OpenGL.glEnable(arg1.field2564);
                    } else if (~arg1.field2564 != ~var3.field2564) {
                        OpenGL.glDisable(var3.field2564);
                        OpenGL.glEnable(arg1.field2564);
                    }
                    OpenGL.glBindTexture(arg1.field2564, arg1.method1203((byte) 78));
                } else {
                    OpenGL.glDisable(var3.field2564);
                }
                this.field4040[this.field3991] = arg1;
            }
            this.field3959 &= -2;
        }
    }

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "()V", line = 2266)
    public final void method527() {
        ++field3829;
        if (this.field3913 != null && this.field3913.method3170((byte) -83)) {
            this.field3910.method1062(-6, this.field3913);
            this.field3903.method2774(-49);
        }
    }

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "()V", line = 2281)
    public final void method556() {
        for (class130 var1 = this.field3926.method295((byte) -37); var1 != null; var1 = this.field3926.method296(true)) {
            ((class319) var1).method2114(0);
        }
        ++field3777;
        if (this.field3910 != null) {
            this.field3910.method1069(-389);
        }
        if (this.field3800 != null) {
            this.method1777((byte) 73);
            Enumeration var2 = this.field3778.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3778.get(var3);
                this.field3800.releaseSurface(var3, var4);
            }
            this.field3800.release();
            this.field3800 = null;
        }
        if (this.field3925) {
            class487.method2945(false, true, (byte) -60);
            this.field3925 = false;
        }
    }

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "()V", line = 2328)
    public final void method503() {
        ++field3830;
        if (this.field4026 && this.field3758 > 0 && ~this.field3786 < -1) {
            int var1 = this.field4036;
            int var2 = this.field4060;
            int var3 = this.field4001;
            int var4 = this.field3952;
            this.method577();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1784(-81);
            this.method1775((byte) -106, false);
            this.method1708(-8, false);
            this.method1739((byte) 84, false);
            this.method1706(-59, false);
            this.method1749(25752, (class169) null);
            this.method1725(-116, -2);
            this.method1734(-63, 1);
            this.method1732(0, 9);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3758, this.field3786, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method571(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!tt", name = "da", descriptor = "(FF)V", line = 2374)
    public final void method606(float arg0, float arg1) {
        ++field3743;
        if (this.field4058 != arg0 || this.field4062 != arg1) {
            this.field4058 = arg0;
            this.field4062 = arg1;
            this.method1716(0);
            if (this.field3955 != 3) {
                if (this.field3955 == 2) {
                    this.method1746(false);
                    return;
                }
            } else {
                this.method1767(83);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(JI)V", line = 2398)
    public final synchronized void method1750(long arg0, int arg1) {
        ++field3742;
        class130 var4 = new class130();
        var4.field1932 = arg0;
        this.field3947.method292((byte) 121, var4);
        if (arg1 != 0) {
            this.method1775((byte) -28, true);
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V", line = 2413)
    public final void method525(int arg0) {
        this.method1777((byte) 113);
        ++field3837;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(FIF)V", line = 2421)
    public final void method1751(float arg0, int arg1, float arg2) {
        this.field4043 = arg2;
        this.field4029 = arg0;
        ++field3861;
        if (!this.field4057) {
            this.method1753(23597);
        }
        if (arg1 != 1) {
            this.method1762(-114, (class440) null, (byte) 72, 18, 49);
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(IIIIII)V", line = 2439)
    public final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1779(-2);
        ++field3833;
        this.method1732(arg5, 9);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "()Lc;", line = 2455)
    public final class517 method496() {
        ++field3831;
        return new class495();
    }

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "(I)V", line = 2463)
    private final void method1752(int arg0) {
        class151.field2263[0] = this.field4021 * this.field3965;
        ++field3858;
        if (arg0 == 6408) {
            class151.field2263[2] = this.field3982 * this.field3965;
            class151.field2263[1] = this.field3995 * this.field3965;
            class151.field2263[3] = 1.0F;
            OpenGL.glLightModelfv(2899, class151.field2263, 0);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIF)Lrd;", line = 2478)
    public final class344 method569(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3724;
        return new class290(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "()V", line = 2488)
    public final void method580() {
        ++field3735;
    }

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "()V", line = 2497)
    public final void method593() {
        this.method1706(-64, true);
        ++field3902;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "()Z", line = 2510)
    public final boolean method521() {
        ++field3737;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "(I)V", line = 2518)
    private final void method1753(int arg0) {
        ++field3834;
        int var2;
        if (this.field4057) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field3975;
        } else {
            this.field4030 = (float) (this.field4016 - this.field4000) - this.field4043;
            this.field3988 = -((float) this.field3998 * this.field4029) + this.field4030;
            if ((float) this.field4013 > this.field3988) {
                this.field3988 = (float) this.field4013;
            }
            OpenGL.glFogf(2915, this.field3988);
            OpenGL.glFogf(2916, this.field4030);
            var2 = this.field4064;
        }
        class151.field2263[2] = (float) class307.method2028(var2, 255) / 255.0F;
        class151.field2263[1] = (float) class307.method2028(var2, 65280) / 65280.0F;
        class151.field2263[0] = (float) class307.method2028(16711680, var2) / 1.671168E7F;
        OpenGL.glFogfv(2918, class151.field2263, 0);
        if (arg0 != 23597) {
            this.field4040 = null;
        }
        if (this.field4057) {
            this.field3907.field2479.method1287((byte) -108);
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2558)
    public final void method507(Canvas arg0) {
        this.field3760 = 0L;
        this.field3882 = null;
        ++field3905;
        if (arg0 != null && this.field3859 != arg0) {
            if (this.field3778.containsKey(arg0)) {
                Long var2 = (Long) this.field3778.get(arg0);
                this.field3760 = var2;
                this.field3882 = arg0;
            }
        } else {
            this.field3760 = this.field3883;
            this.field3882 = this.field3859;
        }
        if (this.field3882 != null && ~this.field3760 != -1L) {
            this.field3800.setSurface(this.field3760);
            this.method1769((byte) -101);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "(IIII)V", line = 2589)
    public final void method511(int arg0, int arg1, int arg2, int arg3) {
        ++field3809;
        this.field4057 = true;
        this.field3975 = arg1;
        this.field4008 = arg3;
        this.field4034 = arg2;
        this.field3964 = arg0;
        this.field3907.method1174(false, false, 3, 0, -57, 0);
        this.field3907.field2479.method1282(-128);
        this.method1753(23597);
        this.method1726(-1064);
    }

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "()Z", line = 2610)
    public final boolean method568() {
        ++field3914;
        return false;
    }

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "(B)V", line = 2618)
    private final void method1754(byte arg0) {
        class151.field2263[0] = this.field4021 * this.field3983;
        class151.field2263[2] = this.field3983 * this.field3982;
        class151.field2263[3] = 1.0F;
        ++field3746;
        class151.field2263[1] = this.field3995 * this.field3983;
        OpenGL.glLightfv(16384, 4609, class151.field2263, 0);
        class151.field2263[1] = -this.field4017 * this.field3995;
        class151.field2263[3] = 1.0F;
        class151.field2263[2] = -this.field4017 * this.field3982;
        class151.field2263[0] = -this.field4017 * this.field4021;
        if (arg0 != -91) {
            this.field3909 = 25;
        }
        OpenGL.glLightfv(16385, 4609, class151.field2263, 0);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Z)V", line = 2641)
    public final void method509(boolean arg0) {
        ++field3755;
        this.field4004 = arg0;
        this.method1773(16);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(III)V", line = 2652)
    public final void method1755(int arg0, int arg1, int arg2) {
        this.field4047 = arg1;
        ++field3871;
        this.field3970 = arg2;
        this.method1715((byte) 50);
        this.method1770(false);
        if (arg0 <= 121) {
            this.field4034 = -29;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(IIIIII)Lbn;", line = 2666)
    public final class307 method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3856;
        return this.field4025 ? new class385(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "(II)V", line = 2674)
    public final void method1756(int arg0, int arg1) {
        ++field3899;
        int var3 = -43 % ((arg1 - 45) / 53);
        if (~this.field3991 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field3991 = arg0;
        }
    }

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "(B)V", line = 2690)
    public final void method1757(byte arg0) {
        OpenGL.glPopMatrix();
        ++field3821;
        if (arg0 != 45) {
            this.method596(110, -0.6472944F, -1.2408867F, -0.34806857F, 0.6534662F, 0.823213F);
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "()Z", line = 2701)
    public final boolean method528() {
        ++field3869;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "(B)V", line = 2709)
    public final void method1758(byte arg0) {
        ++field3789;
        int var2 = 93 % ((arg0 - 45) / 32);
        if (this.field3959 != 2) {
            this.method1710((byte) 61);
            this.method1775((byte) -106, false);
            this.method1708(-8, false);
            this.method1739((byte) 118, false);
            this.method1706(-93, false);
            this.method1725(-116, -2);
            this.field3959 = 2;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([Le;Lvm;Lc;[Lwg;I)V", line = 2731)
    public final void method531(class289[] arg0, class320 arg1, class517 arg2, class41[] arg3, int arg4) {
        this.method603(arg0, arg2, arg3, arg4);
        ++field3892;
        this.method588(arg1);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[Lrd;)V", line = 2741)
    public final void method519(int arg0, class344[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field3950[var3] = arg1[var3];
        }
        ++field3759;
        this.field3960 = arg0;
        if (~this.field3955 != -2) {
            this.method1760((byte) -39);
        }
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)V", line = 2763)
    public final void method595(int arg0) {
        ++field3780;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field3906 = arg0;
            this.field3903.method2774(-25);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "(I)V", line = 2778)
    private final void method1759(int arg0) {
        if (arg0 != -8) {
            this.field3979 = null;
        }
        if (~this.field3955 != -4) {
            this.field3955 = 3;
            this.method1767(112);
            this.method1781(-9570);
            this.field3959 &= -8;
        }
        ++field3854;
    }

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "(B)V", line = 2797)
    private final void method1760(byte arg0) {
        ++field3823;
        int var2 = 0;
        if (arg0 != -39) {
            this.field4057 = false;
        }
        while (var2 < this.field3960) {
            class344 var3 = this.field3950[var2];
            int var4 = var2 + 16386;
            class166.field2505[0] = (float) var3.method2214((byte) 125);
            class166.field2505[1] = (float) var3.method2217(true);
            class166.field2505[2] = (float) var3.method2216(-1);
            class166.field2505[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class166.field2505, 0);
            int var5 = var3.method2212(-1);
            float var6 = var3.method2211(-46) / 255.0F;
            class166.field2505[2] = var6 * (float) class307.method2028(255, var5);
            class166.field2505[0] = (float) class307.method2028(var5 >> 16, 255) * var6;
            class166.field2505[1] = var6 * (float) class307.method2028(255, var5 >> 8);
            OpenGL.glLightfv(var4, 4609, class166.field2505, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2218(921) * var3.method2218(921)));
            OpenGL.glEnable(var4);
            ++var2;
        }
        while (var2 < this.field4024) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field4024 = this.field3960;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZIB[B)Lfp;", line = 2842)
    public final class440 method1761(int arg0, boolean arg1, int arg2, byte arg3, byte[] arg4) {
        ++field3889;
        if (arg3 >= -74) {
            this.field4032 = 0.4244486F;
        }
        return (class440) (!this.field3994 || arg1 && !this.field4063 ? new class18(this, arg2, arg4, arg0) : new class533(this, arg2, arg4, arg0, arg1));
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "()Z", line = 2859)
    public final boolean method573() {
        ++field3810;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "()Z", line = 2867)
    public final boolean method553() {
        ++field3761;
        return this.field3907.method1173(-119, 3);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([Le;Lc;[Lwg;I)V", line = 2877)
    public final void method603(class289[] arg0, class517 arg1, class41[] arg2, int arg3) {
        ++field3839;
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method673(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([IIIII)Lo;", line = 2897)
    public final class363 method520(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3808;
        return new class322(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tt", name = "aa", descriptor = "()F", line = 2908)
    public final float method575() {
        ++field3845;
        return this.field4062;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILfp;BII)V", line = 2917)
    public final void method1762(int arg0, class440 arg1, byte arg2, int arg3, int arg4) {
        ++field3828;
        int var6 = arg1.method112(-31057);
        int var7 = arg0 * this.method1786(var6, 23697);
        this.method1763(arg1, 13371);
        OpenGL.glDrawElements(arg3, arg4, var6, arg1.method113((byte) -46) + (long) var7);
        if (arg2 > 121) {
            ;
        }
    }

    @OriginalMember(owner = "client!tt", name = "Y", descriptor = "()I", line = 2940)
    public final int method513() {
        ++field3770;
        int var1 = this.field4068;
        this.field4068 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!tt", name = "HA", descriptor = "(IIII)V", line = 2951)
    public final void method599(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 < ~this.field4036) {
            this.field4036 = arg0;
        }
        if (~this.field4060 < ~arg2) {
            this.field4060 = arg2;
        }
        if (~this.field3952 < ~arg3) {
            this.field3952 = arg3;
        }
        if (~arg1 < ~this.field4001) {
            this.field4001 = arg1;
        }
        ++field3775;
        OpenGL.glEnable(3089);
        this.method1772(8);
        this.method1770(false);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 2979)
    public final void method549(int arg0) {
        this.method1766(-122);
        ++field3878;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lfp;I)V", line = 2989)
    public final void method1763(class440 arg0, int arg1) {
        if (arg1 != 13371) {
            this.method1712(-9);
        }
        ++field3847;
        if (this.field4056 != arg0) {
            if (this.field3994) {
                OpenGL.glBindBufferARB(34963, arg0.method117((byte) -113));
            }
            this.field4056 = arg0;
        }
    }

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "()Z", line = 3013)
    public final boolean method510() {
        ++field3730;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "(I)V", line = 3022)
    private final void method1764(int arg0) {
        this.method1725(115, -2);
        ++field3765;
        for (int var2 = this.field3996 + -1; var2 >= 0; --var2) {
            this.method1756(var2, -41);
            this.method1749(25752, (class169) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1741(8448, (byte) 108, 8448);
        this.method1780(770, 34168, arg0 ^ 34175, 2);
        this.method1731(-125);
        this.field4020 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4044 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4052 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field3992 = true;
        this.method1775((byte) -106, true);
        this.method1708(-8, true);
        this.method1739((byte) 122, true);
        if (arg0 != 255) {
            this.field3760 = -93L;
        }
        this.method1706(arg0 + -312, true);
        this.method1784(86);
        this.field3800.setSwapInterval(0);
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
        this.field4031 = this.field4064 = -1;
        this.method577();
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 3094)
    public final class11 method540(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3736;
        return new class134(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!tt", name = "ma", descriptor = "(IIIII)V", line = 3103)
    public final void method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3807;
        this.method1779(-2);
        this.method1732(arg4, 9);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(Lun;B)V", line = 3123)
    public final void method1765(class119 arg0, byte arg1) {
        if (arg1 != 21) {
            this.method510();
        }
        ++field3826;
        if (!this.field4042) {
            if (this.field3936 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field3936 >= 0) {
                    this.field3933[this.field3936].method223(-4807);
                }
                this.field3932 = this.field3931 = this.field3933[++this.field3936] = arg0;
                this.field3932.method226((byte) 99);
            }
        } else {
            this.method1787((byte) -86, arg0);
            this.method1714(arg0, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "(I)V", line = 3153)
    private final void method1766(int arg0) {
        ++field3911;
        int var2 = 0;
        if (arg0 >= -111) {
            this.method511(112, 69, 79, -47);
        }
        while (!this.field3800.attach()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class468.method2848(1000L, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIII)V", line = 3176)
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field3787;
        this.method555(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "(I)V", line = 3188)
    private final void method1767(int arg0) {
        if (arg0 < 7) {
            this.field3976 = 91;
        }
        ++field3904;
        float var2 = (float) (-this.field3997) * this.field4050 / (float) this.field4011;
        float var3 = (float) (-this.field3953) * this.field4050 / (float) this.field4055;
        float var4 = (float) (-this.field3997 + this.field3758) * this.field4050 / (float) this.field4011;
        float var5 = (float) (-this.field3953 + this.field3786) * this.field4050 / (float) this.field4055;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field4013 + -this.field4062), (double) ((float) this.field4016 + -this.field4062));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBLjaggl/memory/NativeBuffer;ZI)Lql;", line = 3214)
    public final class121 method1768(int arg0, byte arg1, NativeBuffer arg2, boolean arg3, int arg4) {
        if (arg1 >= -107) {
            this.field3950 = null;
        }
        ++field3802;
        return (class121) (!this.field3994 || arg3 && !this.field4063 ? new class364(this, arg0, arg2) : new class250(this, arg0, arg2, arg4, arg3));
    }

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "(B)V", line = 3232)
    private final void method1769(byte arg0) {
        if (this.field3882 != null) {
            Dimension var2 = this.field3882.getSize();
            this.field3820 = var2.height;
            this.field3726 = var2.width;
        } else {
            this.field3726 = this.field3820 = 0;
        }
        ++field3867;
        if (this.field3931 == null) {
            this.field3758 = this.field3726;
            this.field3786 = this.field3820;
            this.method1715((byte) 50);
        }
        this.method1784(67);
        this.method577();
        if (arg0 >= -35) {
            this.field4066 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I", line = 3265)
    public final int method589(int arg0, int arg1) {
        ++field3752;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "(Z)V", line = 3277)
    private final void method1770(boolean arg0) {
        ++field3792;
        if (this.field4036 <= this.field4060 && this.field3952 >= this.field4001) {
            OpenGL.glScissor(this.field3970 - -this.field4036, this.field4047 + this.field3786 + -this.field3952, -this.field4036 + this.field4060, -this.field4001 + this.field3952);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0) {
            this.field4002 = true;
        }
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "()Z", line = 3296)
    public final boolean method562() {
        ++field3738;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLun;)V", line = 3305)
    public final void method1771(byte arg0, class119 arg1) {
        ++field3896;
        if (~this.field3934 <= -1 && this.field3937[this.field3934] == arg1) {
            this.field3937[this.field3934--] = null;
            arg1.method218((byte) -73);
            if (arg0 < 102) {
                this.field3938 = -80;
            }
            if (this.field3934 >= 0) {
                this.field3932 = this.field3937[this.field3934];
                this.field3932.method219(2509);
            } else {
                this.field3932 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "(I)V", line = 3330)
    private final void method1772(int arg0) {
        this.field4032 = (float) (this.field4060 - this.field3997);
        ++field3866;
        if (arg0 != 8) {
            this.field3993 = false;
        }
        this.field4022 = (float) (this.field3952 - this.field3953);
        this.field4012 = (float) (-this.field3997 + this.field4036);
        this.field4023 = (float) (-this.field3953 + this.field4001);
    }

    @OriginalMember(owner = "client!tt", name = "ya", descriptor = "(I)V", line = 3344)
    public final void method500(int arg0) {
        this.field3929 = 0;
        ++field3797;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field3929;
        }
        this.field3923 = 1 << this.field3929;
    }

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "(I)V", line = 3360)
    private final void method1773(int arg0) {
        if (arg0 != 16) {
            this.field3972 = false;
        }
        OpenGL.glDepthMask(this.field3957 && this.field4004);
        ++field3747;
    }

    @OriginalMember(owner = "client!tt", name = "MA", descriptor = "([I)V", line = 3371)
    public final void method545(int[] arg0) {
        arg0[2] = this.field4060;
        ++field3740;
        arg0[3] = this.field3952;
        arg0[1] = this.field4001;
        arg0[0] = this.field4036;
    }

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "(I)V", line = 3383)
    public final void method1774(int arg0) {
        OpenGL.glLightfv(16384, arg0, this.field3986, 0);
        ++field3723;
        OpenGL.glLightfv(16385, 4611, this.field3979, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II[I[I)Lta;", line = 3392)
    public final class340 method516(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3815;
        return class21.method129(this, arg2, arg0, arg1, arg3, -3);
    }

    @OriginalMember(owner = "client!tt", name = "SA", descriptor = "(Lc;)V", line = 3401)
    public final void method582(class517 arg0) {
        this.field3948 = (class495) arg0;
        ++field3750;
        this.field3981.method2968(1121, this.field3948);
        if (this.field3955 != 1) {
            this.method1781(-9570);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(BZ)V", line = 3420)
    public final void method1775(byte arg0, boolean arg1) {
        if (!this.field4045 == arg1) {
            this.field4045 = arg1;
            this.method1726(-1064);
            this.field3959 &= -32;
        }
        if (arg0 == -106) {
            ++field3870;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 3439)
    public final void method501(Rectangle[] arg0, int arg1) {
        ++field3762;
        this.method530();
    }

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "(III[I)V", line = 3448)
    public final void method592(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3816;
        float var5 = (float) arg2 * this.field3948.field7237 + (float) arg0 * this.field3948.field7214 + (float) arg1 * this.field3948.field7221 + this.field3948.field7229;
        if (!((float) this.field4013 > var5) && !((float) this.field4016 < var5)) {
            int var6 = (int) (((float) arg2 * this.field3948.field7230 + (float) arg0 * this.field3948.field7233 + (float) arg1 * this.field3948.field7235 + this.field3948.field7216) * (float) this.field4011 / var5);
            int var7 = (int) (((float) arg2 * this.field3948.field7209 + (float) arg0 * this.field3948.field7231 + (float) arg1 * this.field3948.field7236 + this.field3948.field7210) * (float) this.field4055 / var5);
            if ((float) var6 >= this.field4012 && this.field4032 >= (float) var6 && (float) var7 >= this.field4023 && (float) var7 <= this.field4022) {
                arg3[0] = (int) ((float) var6 - this.field4012);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field4023);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(IB)V", line = 3479)
    public final synchronized void method1776(int arg0, byte arg1) {
        int var3 = -80 / ((59 - arg1) / 46);
        ++field3898;
        class50 var4 = new class50(arg0);
        this.field3944.method292((byte) 121, var4);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lfe;IIII)Le;", line = 3494)
    public final class289 method554(class153 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3782;
        return new class425(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "(B)V", line = 3502)
    private final void method1777(byte arg0) {
        int var2 = 36 / ((arg0 - -11) / 44);
        this.field3800.detach();
        ++field3734;
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(IIII)V", line = 3513)
    public final void method1778(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34184 - -arg3, arg0);
        ++field3887;
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg1);
        if (arg2 != 1) {
            this.field4014 = -90L;
        }
    }

    @OriginalMember(owner = "client!tt", name = "pa", descriptor = "()I", line = 3526)
    public final int method543() {
        ++field3895;
        return this.field3941 + this.field3939 + this.field3938;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILgt;)V", line = 3538)
    public class249(int arg0, Canvas arg1, class127 arg2, int arg3, class66 arg4) {
        super(arg0, arg2);
        new class462();
        new class56(16);
        this.field3940 = new class44();
        this.field3942 = new class44();
        this.field3943 = new class44();
        this.field3944 = new class44();
        this.field3945 = new class44();
        this.field3946 = new class44();
        this.field3947 = new class44();
        this.field3953 = 0;
        this.field3977 = 8448;
        this.field3950 = new class344[class308.field4707];
        this.field3984 = new float[4];
        this.field3961 = new float[16];
        this.field3986 = new float[4];
        this.field4013 = 50;
        this.field4031 = -1;
        this.field3982 = 1.0F;
        this.field4021 = 1.0F;
        this.field4003 = new float[4];
        this.field3975 = -1;
        this.field4036 = 0;
        this.field3997 = 0;
        this.field3949 = 3584.0F;
        this.field3952 = 0;
        this.field4017 = -1.0F;
        this.field3998 = -1;
        this.field4029 = 1.0F;
        this.field4043 = 0.0F;
        this.field4016 = 3584;
        this.field4011 = 512;
        this.field3983 = -1.0F;
        this.field4001 = 0;
        this.field4047 = 0;
        this.field4004 = true;
        this.field3979 = new float[4];
        this.field4041 = 3584.0F;
        this.field4008 = 0;
        this.field3970 = 0;
        this.field4060 = 0;
        this.field4058 = 3000.0F;
        this.field4000 = 0;
        this.field4034 = -1;
        this.field4064 = -1;
        this.field3995 = 1.0F;
        this.field4050 = 1.0F;
        this.field4061 = 8448;
        this.field4055 = 512;
        this.field3954 = new class268(8192);
        this.field4069 = new int[1];
        this.field4066 = new int[1];
        this.field4071 = new byte[16384];
        this.field4067 = new int[1];
        this.field3909 = arg3;
        this.field3882 = this.field3859 = arg1;
        try {
            if (class525.field7695 == null || !class525.field7695) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class525.field7695 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (!var6.startsWith("mac")) {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method468("jaggl.dll", (byte) 126).toString());
                        } else {
                            System.load(arg4.method468("libjaggl.jnilib", (byte) 126).toString());
                        }
                    } else {
                        System.load(arg4.method468("libjaggl.so", (byte) 126).toString());
                    }
                    class525.field7695 = Boolean.TRUE;
                }
            }
            if (class525.field7695 != null && class525.field7695) {
                this.field3800 = new OpenGL();
                this.field3760 = this.field3883 = this.field3800.init(arg1, 8, 8, 8, 24, 0, this.field3909);
                if (this.field3883 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method1766(-126);
                    int var7 = this.method1728((byte) 114);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field4048 = this.field3990 ? 33639 : 5121;
                        if (~this.field4005.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class454.method2784(' ', 1, this.field4005.replace('/', ' '));
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class235.method1601(var13.substring(1, 3), 20979)) {
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
                                            if (~var13.length() <= -5 && class235.method1601(var13.substring(0, 4), 20979)) {
                                                var8 = class453.method2777(var13.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field4006 = false;
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && var8 <= 7999) {
                                    this.field3994 = false;
                                }
                                if (~var8 <= -7001 && var8 <= 9250) {
                                    this.field4039 = false;
                                }
                            }
                            this.field3987 &= this.field3800.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field4063 = this.field3994;
                            this.field3963 = true;
                        }
                        if (~this.field4059.indexOf("intel") != 0) {
                            this.field3993 = false;
                        }
                        this.field4026 = !this.field4059.equals("s3 graphics");
                        if (this.field3994) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class488.method2946(true, false, false);
                        this.field3925 = true;
                        this.field3903 = new class453(this, super.field4588);
                        this.method1711((byte) 126);
                        this.field3924 = new class159(this);
                        this.field3910 = new class149(this);
                        if (this.field3910.method1066(false)) {
                            this.field3913 = new class37(this);
                            if (!this.field3913.method246(34842)) {
                                this.field3913.method239(0);
                                this.field3913 = null;
                            }
                        }
                        this.field3907 = new class164(this);
                        this.method1764(255);
                        this.method1769((byte) -75);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field3800.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class468.method2848(100L, (byte) -73);
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
            this.method556();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "(I)V", line = 3737)
    private final void method1779(int arg0) {
        ++field3849;
        if (~this.field3959 != arg0) {
            this.method1710((byte) 86);
            this.method1775((byte) -106, false);
            this.method1708(-8, false);
            this.method1739((byte) 100, false);
            this.method1706(-92, false);
            this.method1749(25752, (class169) null);
            this.method1725(-123, -2);
            this.method1734(-124, 1);
            this.field3959 = 1;
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(IIII)V", line = 3759)
    public final void method1780(int arg0, int arg1, int arg2, int arg3) {
        ++field3754;
        OpenGL.glTexEnvi(8960, arg2 + arg3, arg1);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg0);
    }

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "(I)V", line = 3771)
    private final void method1781(int arg0) {
        OpenGL.glLoadIdentity();
        ++field3814;
        if (arg0 == -9570) {
            OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMultMatrixf(this.field3948.method2969(arg0 ^ 9569), 0);
            if (this.field4057) {
                this.field3907.field2479.method1282(arg0 + 9461);
            }
            this.method1774(4611);
            this.method1760((byte) -39);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lun;Z)V", line = 3790)
    public final void method1782(class119 arg0, boolean arg1) {
        if (!arg1) {
            this.field3923 = -12;
        }
        ++field3776;
        if (this.field4042) {
            this.method1771((byte) 125, arg0);
            this.method1737(arg0, (byte) 54);
        } else if (this.field3936 >= 0 && this.field3933[this.field3936] == arg0) {
            this.field3933[this.field3936--] = null;
            arg0.method223(-4807);
            if (~this.field3936 <= -1) {
                this.field3932 = this.field3931 = this.field3933[this.field3936];
                this.field3932.method226((byte) 99);
            } else {
                this.field3932 = this.field3931 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "(B)V", line = 3828)
    private final void method1783(byte arg0) {
        ++field3901;
        float[] var2 = this.field3961;
        float var3 = (float) (-this.field3997 * this.field4013) / (float) this.field4011;
        float var4 = (float) ((-this.field3997 + this.field3758) * this.field4013) / (float) this.field4011;
        float var5 = (float) (this.field4013 * this.field3953) / (float) this.field4055;
        if (arg0 < -28) {
            float var6 = (float) ((-this.field3786 + this.field3953) * this.field4013) / (float) this.field4055;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field4013 * 2.0F;
                var2[0] = var7 / (var4 - var3);
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[4] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[11] = -1.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = this.field3971 = (float) (-(this.field4016 - -this.field4013)) / (float) (-this.field4013 + this.field4016);
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[14] = this.field4010 = -((float) this.field4016 * var7) / (float) (-this.field4013 + this.field4016);
            } else {
                var2[15] = 1.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[12] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
            }
            this.method1716(0);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lrr;Z)Lo;", line = 3890)
    public final class363 method574(class309 arg0, boolean arg1) {
        ++field3791;
        int[] var3 = new int[arg0.field4717 * arg0.field4713];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4715 != null) {
            for (int var6 = 0; arg0.field4717 > var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field4713; ++var7) {
                    var3[var5++] = class19.method118(arg0.field4715[var4] << 24, arg0.field4709[class307.method2028(arg0.field4711[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~var8 > ~arg0.field4717; ++var8) {
                for (int var10 = 0; arg0.field4713 > var10; ++var10) {
                    int var11 = arg0.field4709[255 & arg0.field4711[var4++]];
                    var3[var5++] = var11 == 0 ? 0 : class19.method118(var11, -16777216);
                }
            }
        }
        class363 var9 = this.method520(var3, 0, arg0.field4713, arg0.field4713, arg0.field4717);
        var9.method400(arg0.field4716, arg0.field4712, arg0.field4714, arg0.field4710);
        return var9;
    }

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "()Lc;", line = 3951)
    public final class517 method538() {
        ++field3728;
        return this.field3921;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(FFF)V", line = 3965)
    public final void method517(float arg0, float arg1, float arg2) {
        class291.field4500 = arg0;
        class166.field2504 = arg2;
        class11.field121 = arg1;
        ++field3795;
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V", line = 3982)
    public final void method504(int arg0) {
        ++field3864;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "(I)V", line = 3994)
    public final void method1784(int arg0) {
        if (~this.field3955 != -1) {
            this.field3959 &= -32;
            this.field3955 = 0;
        }
        ++field3841;
        int var2 = 54 % (-arg0 / 52);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLql;)V", line = 4021)
    public final void method1785(byte arg0, class121 arg1) {
        if (this.field4038 != arg1) {
            if (this.field3994) {
                OpenGL.glBindBufferARB(34962, arg1.method906(false));
            }
            this.field4038 = arg1;
        }
        ++field3897;
        if (arg0 > -76) {
            this.method1772(-90);
        }
    }

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "(II)I", line = 4041)
    public final int method1786(int arg0, int arg1) {
        ++field3825;
        if (arg0 != 5121 && arg0 != 5120) {
            if (arg1 != 23697) {
                field3894 = null;
            }
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

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(BLun;)V", line = 4065)
    public final void method1787(byte arg0, class119 arg1) {
        ++field3822;
        if (~this.field3934 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field3934 >= 0) {
                this.field3937[this.field3934].method218((byte) -82);
            }
            if (arg0 >= -37) {
                this.method565(-110, -113, 41, -11, -115);
            }
            this.field3932 = this.field3937[++this.field3934] = arg1;
            this.field3932.method219(2509);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)I", line = 4084)
    public final int method557(int arg0, int arg1) {
        ++field3751;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "(I)V", line = 4092)
    public final void method567(int arg0) {
        this.method1732(0, 9);
        ++field3843;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }
}
