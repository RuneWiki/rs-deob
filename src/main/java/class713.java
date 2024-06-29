import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class713 extends class334 {

    @OriginalMember(owner = "client!dga", name = "Oi", descriptor = "Ltf;")
    private class524 field10051 = new class524();

    @OriginalMember(owner = "client!dga", name = "qh", descriptor = "Ltf;")
    private class524 field10108 = new class524();

    @OriginalMember(owner = "client!dga", name = "yi", descriptor = "Ltf;")
    private class524 field10109 = new class524();

    @OriginalMember(owner = "client!dga", name = "ai", descriptor = "Ltf;")
    private class524 field10111 = new class524();

    @OriginalMember(owner = "client!dga", name = "Gg", descriptor = "Ltf;")
    private class524 field10113 = new class524();

    @OriginalMember(owner = "client!dga", name = "ch", descriptor = "Ltf;")
    private class524 field10114 = new class524();

    @OriginalMember(owner = "client!dga", name = "Ki", descriptor = "Ltf;")
    private class524 field10115 = new class524();

    @OriginalMember(owner = "client!dga", name = "Li", descriptor = "[Lgh;")
    private class799[] field10116 = new class799[16];

    @OriginalMember(owner = "client!dga", name = "rh", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field10124 = new MapBuffer();

    @OriginalMember(owner = "client!dga", name = "Ng", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field10125 = new MapBuffer();

    @OriginalMember(owner = "client!dga", name = "Qh", descriptor = "I")
    private int field10132 = 0;

    @OriginalMember(owner = "client!dga", name = "ei", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field10032;

    @OriginalMember(owner = "client!dga", name = "Wh", descriptor = "Ljava/lang/String;")
    private String field10137;

    @OriginalMember(owner = "client!dga", name = "gh", descriptor = "Ljava/lang/String;")
    private String field10128;

    @OriginalMember(owner = "client!dga", name = "Hg", descriptor = "I")
    private int field10131;

    @OriginalMember(owner = "client!dga", name = "Th", descriptor = "Z")
    public boolean field10133;

    @OriginalMember(owner = "client!dga", name = "Eh", descriptor = "Z")
    private boolean field10134;

    @OriginalMember(owner = "client!dga", name = "ci", descriptor = "Z")
    private boolean field10130;

    @OriginalMember(owner = "client!dga", name = "fh", descriptor = "Z")
    public boolean field10127;

    @OriginalMember(owner = "client!dga", name = "ni", descriptor = "Z")
    public boolean field10136;

    @OriginalMember(owner = "client!dga", name = "ph", descriptor = "Z")
    public boolean field10135;

    @OriginalMember(owner = "client!dga", name = "Sg", descriptor = "[I")
    public int[] field10129;

    @OriginalMember(owner = "client!dga", name = "Wg", descriptor = "I")
    public int field10126;

    @OriginalMember(owner = "client!dga", name = "Ui", descriptor = "[Ljava/lang/String;")
    private static final String[] field10138 = new String[] { method5168(method5167("?DB\u001d9:\u000b")), method5168(method5167("?DB\u001d\u0003\u001d\u000b")), method5168(method5167("?DB\u001d\u001c\u0018\u000b")), method5168(method5167(" \r\r\u001d*")), method5168(method5167("5VO_")), method5168(method5167("?DB\u001d\u0011\u0012\u000b")), method5168(method5167("?DB\u001d\u001b\u0012\u000b")), method5168(method5167("?DB\u001d\u0015\u0013\u000b")), method5168(method5167("?DB\u001d\u001es")), method5168(method5167("?DB\u001d\u0011\u001e\u000b")), method5168(method5167("?DB\u001d\u0015\u0011\u000b")), method5168(method5167("?DB\u001d\u0014\u0013\u000b")), method5168(method5167("?DB\u001d\u0001\u0012\u000b")), method5168(method5167("?DB\u001d\u0011\u001f\u000b")), method5168(method5167("?DB\u001d\u0010\u0012\u000b")), method5168(method5167("?DB\u001d\u0006\u0013\u000b")), method5168(method5167("?DB\u001d\u0010s")), method5168(method5167("?DB\u001d\u0015s")), method5168(method5167("?DB\u001d\u001a\u001a\u000b")), method5168(method5167("?DB\u001d\u0014\u0019\u000b")), method5168(method5167("?DB\u001d\u0010\u001e\u000b")), method5168(method5167("?DB\u001d\u0004\u0018\u000b")), method5168(method5167("?DB\u001d\u001d\u001d\u000b")), method5168(method5167("?DB\u001d\u001f\u0012\u000b")), method5168(method5167("?DB\u001d\u0005s")), method5168(method5167("?DB\u001d\u0010\u0013\u000b")), method5168(method5167("?DB\u001d\u0016\u0011\u000b")), method5168(method5167("?DB\u001d\u0018s")), method5168(method5167("?DB\u001d\u0012\u0011\u000b")), method5168(method5167("?DB\u001d\u0003\u0019\u000b")), method5168(method5167("?DB\u001d\u0004\u001c\u000b")), method5168(method5167("?DB\u001d\u0014\u0011\u000b")), method5168(method5167("?DB\u001d\u0006\u001a\u000b")), method5168(method5167("?DB\u001d\u0011\u001a\u000b")), method5168(method5167("?DB\u001d\u0010\u001d\u000b")), method5168(method5167("?DB\u001d\u0015\u0019\u000b")), method5168(method5167("?DB\u001d\u0016\u001a\u000b")), method5168(method5167("?DB\u001d\u001b\u001d\u000b")), method5168(method5167("?DB\u001d\u001c\u001f\u000b")), method5168(method5167("?DB\u001d.:\u000b")), method5168(method5167("?DB\u001d\u0004\u0012\u000b")), method5168(method5167("?DB\u001d\u0019\u0013\u000b")), method5168(method5167("?DB\u001d\u0019\u001e\u000b")), method5168(method5167("\u001co|r\u0005\u0019|UV%/F[l$3BGV%")), method5168(method5167("\u001co|r\u0005\u0019|KR;=|E_8:W|C>#FO")), method5168(method5167("\u001co|r\u0005\u0019|UV%/F[l5.EEV%\u0004LAY28W")), method5168(method5167("\u001co|v\u000f\u000f|WV//VQVd\u001f")), method5168(method5167(")BGV85")), method5168(method5167("\u001co|r\u0005\u0019|WV//VQV\b8VAV\b6BS")), method5168(method5167("?DB\u001dk2MJGis")), method5168(method5167("\u001co|r\u0005\u0019|EA6<NF]#\u0004SQ\\0)BN")), method5168(method5167("9QJR9{SBF;")), method5168(method5167("\u001co|r\u0005\u0019|UV%/F[l')LDA66")), method5168(method5167("\u001co|r\u0005\u0019|WV//VQV\b5LMl'4TFA\b4E|G 4")), method5168(method5167("2MWV;")), method5168(method5167("6J@A8(LEG")), method5168(method5167("\u001co|r\u0005\u0019|NF;/JWV//VQV")), method5168(method5167("\u001co|r\u0005\u0019|EA6<NF]#\u0004PKR3>Q")), method5168(method5167("3G")), method5168(method5167("\u001co|r\u0005\u0019|WV//VQV\b>MUl44NAZ9>")), method5168(method5167("\u001co|r\u0005\u0019|WV//VQV\b)F@G65DOV")), method5168(method5167("\u001co|r\u0005\u0019|NF;/JPR:+OF")), method5168(method5167("6FPR")), method5168(method5167("?DB\u001d\u0019\u0012\u000b")), method5168(method5167("?DB\u001d\u0002\u0018\u000b")), method5168(method5167("?DB\u001d\u0019\u001c\u000b")), method5168(method5167("?DB\u001d\u0006\u0012\u000b")), method5168(method5167("\u0014SF]\u0010\u0017")), method5168(method5167("?DB\u001d\u001a\u0012\u000b")), method5168(method5167(":WJ")), method5168(method5167("5UJW>:")), method5168(method5167("?DB\u001d\u0010\u001a\u000b")), method5168(method5167("?DB\u001d\u001c\u0019\u000b")), method5168(method5167("?DB\u001d\u0015\u001c\u000b")), method5168(method5167("?DB\u001d\u0006\u001c\u000b")), method5168(method5167("?DB\u001d\u0003\u001f\u000b")), method5168(method5167("?DB\u001d\u0000s")), method5168(method5167("?DB\u001d\u0002\u0012\u000b")), method5168(method5167("?DB\u001d\u0006\u001e\u000b")), method5168(method5167("?DB\u001d\u0007\u0019\u000b")), method5168(method5167("?DB\u001d\u0018\u0012\u000b")), method5168(method5167("?DB\u001d\u0011\u0011\u000b")), method5168(method5167("?DB\u001d\u0003\u0012\u000b")), method5168(method5167("?DB\u001d\u0006\u001f\u000b")), method5168(method5167("?DB\u001d\u0007\u001e\u000b")), method5168(method5167("?DB\u001d\u001c\u0012\u000b")), method5168(method5167("?DB\u001d\u0013s")), method5168(method5167("?DB\u001d\u0011s")), method5168(method5167("?DB\u001d\u0010\u001c\u000b")), method5168(method5167("?DB\u001d\u001e\u0012\u000b")), method5168(method5167("?DB\u001d\u0014\u001a\u000b")), method5168(method5167("?DB\u001d\u0010\u0019\u000b")), method5168(method5167("?DB\u001d\u001a\u0013\u000b")), method5168(method5167("?DB\u001d\u0015\u001a\u000b")), method5168(method5167("?DB\u001d\u0000\u0012\u000b")), method5168(method5167("?DB\u001d\u0001\u001e\u000b")), method5168(method5167("?DB\u001d\u0000\u001a\u000b")), method5168(method5167("?DB\u001d\u0013\u0011\u000b")), method5168(method5167("?DB\u001d\u0019s")), method5168(method5167("?DB\u001d\u0000\u001d\u000b")), method5168(method5167("?DB\u001d\u001e\u0019\u000b")), method5168(method5167("?DB\u001d\u0014\u001e\u000b")), method5168(method5167("?DB\u001d\u0007\u0012\u000b")), method5168(method5167("?DB\u001d\u001a\u001f\u000b")), method5168(method5167("?DB\u001d\u0003\u001e\u000b")), method5168(method5167("?DB\u001d\u0018\u0018\u000b")), method5168(method5167("?DB\u001d\u0005\u001a\u000b")), method5168(method5167("?DB\u001d\u0018\u001a\u000b")), method5168(method5167("?DB\u001d\u0015\u001e\u000b")), method5168(method5167("?DB\u001d\u0001s")), method5168(method5167("?DB\u001d5s")) };

    @OriginalMember(owner = "client!dga", name = "Hi", descriptor = "I")
    public static int field10069 = 0;

    @OriginalMember(owner = "client!dga", name = "fi", descriptor = "Ldp;")
    public static class514 field10085 = new class514();

    @OriginalMember(owner = "client!dga", name = "Bh", descriptor = "Lui;")
    public static class251 field10107 = new class251(8);

    @OriginalMember(owner = "client!dga", name = "Pi", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!dga", name = "Di", descriptor = "I")
    public static int field10018;

    @OriginalMember(owner = "client!dga", name = "kh", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!dga", name = "Dg", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!dga", name = "Zg", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!dga", name = "Nh", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!dga", name = "Jh", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!dga", name = "Ci", descriptor = "I")
    public static int field10024;

    @OriginalMember(owner = "client!dga", name = "Ph", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!dga", name = "yh", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!dga", name = "Ii", descriptor = "I")
    public static int field10027;

    @OriginalMember(owner = "client!dga", name = "oh", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!dga", name = "Dh", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!dga", name = "oi", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!dga", name = "Ch", descriptor = "I")
    public static int field10031;

    @OriginalMember(owner = "client!dga", name = "Ih", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!dga", name = "qi", descriptor = "I")
    public static int field10034;

    @OriginalMember(owner = "client!dga", name = "Gi", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!dga", name = "Lg", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!dga", name = "Fg", descriptor = "I")
    public static int field10037;

    @OriginalMember(owner = "client!dga", name = "ui", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!dga", name = "zi", descriptor = "I")
    public static int field10039;

    @OriginalMember(owner = "client!dga", name = "Ji", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!dga", name = "Eg", descriptor = "I")
    public static int field10041;

    @OriginalMember(owner = "client!dga", name = "Qi", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!dga", name = "hh", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!dga", name = "Mh", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!dga", name = "Rg", descriptor = "I")
    public static int field10045;

    @OriginalMember(owner = "client!dga", name = "Kg", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!dga", name = "ii", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!dga", name = "Ai", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!dga", name = "ih", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!dga", name = "si", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!dga", name = "ti", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!dga", name = "Fh", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!dga", name = "ah", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!dga", name = "Vg", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!dga", name = "Og", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!dga", name = "sh", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!dga", name = "hi", descriptor = "I")
    public static int field10058;

    @OriginalMember(owner = "client!dga", name = "Hh", descriptor = "I")
    public static int field10059;

    @OriginalMember(owner = "client!dga", name = "zh", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!dga", name = "Fi", descriptor = "I")
    public static int field10061;

    @OriginalMember(owner = "client!dga", name = "gi", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!dga", name = "Gh", descriptor = "I")
    public static int field10063;

    @OriginalMember(owner = "client!dga", name = "dh", descriptor = "I")
    public static int field10064;

    @OriginalMember(owner = "client!dga", name = "Yg", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!dga", name = "di", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!dga", name = "wh", descriptor = "I")
    public static int field10067;

    @OriginalMember(owner = "client!dga", name = "Vh", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!dga", name = "bi", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!dga", name = "xh", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!dga", name = "ki", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!dga", name = "Ig", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!dga", name = "Tg", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!dga", name = "uh", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!dga", name = "Ri", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!dga", name = "li", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!dga", name = "Uh", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!dga", name = "vh", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!dga", name = "pi", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!dga", name = "Ni", descriptor = "I")
    public static int field10081;

    @OriginalMember(owner = "client!dga", name = "mi", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!dga", name = "Qg", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!dga", name = "Jg", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!dga", name = "Yh", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!dga", name = "Lh", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!dga", name = "Xh", descriptor = "I")
    public static int field10088;

    @OriginalMember(owner = "client!dga", name = "Mi", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!dga", name = "eh", descriptor = "I")
    public static int field10090;

    @OriginalMember(owner = "client!dga", name = "ri", descriptor = "I")
    public static int field10091;

    @OriginalMember(owner = "client!dga", name = "nh", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!dga", name = "Mg", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!dga", name = "Kh", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!dga", name = "lh", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!dga", name = "Pg", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!dga", name = "jh", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!dga", name = "mh", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!dga", name = "Bi", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!dga", name = "Ah", descriptor = "I")
    public static int field10100;

    @OriginalMember(owner = "client!dga", name = "bh", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!dga", name = "Rh", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!dga", name = "Ei", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!dga", name = "Ug", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!dga", name = "Sh", descriptor = "I")
    public static int field10105;

    @OriginalMember(owner = "client!dga", name = "Oh", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!dga", name = "Zh", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!dga", name = "th", descriptor = "I")
    private int field10123;

    @OriginalMember(owner = "client!dga", name = "wi", descriptor = "J")
    private long field10122;

    @OriginalMember(owner = "client!dga", name = "Ti", descriptor = "Lkj;")
    public static class26 field10112;

    @OriginalMember(owner = "client!dga", name = "ji", descriptor = "Z")
    private boolean field10117;

    @OriginalMember(owner = "client!dga", name = "xi", descriptor = "Z")
    private boolean field10118;

    @OriginalMember(owner = "client!dga", name = "vi", descriptor = "Z")
    private boolean field10119;

    @OriginalMember(owner = "client!dga", name = "Xg", descriptor = "Z")
    private boolean field10120;

    @OriginalMember(owner = "client!dga", name = "Si", descriptor = "Z")
    private boolean field10121;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(BI)Loo;")
    public final class593 method2127(byte arg0, int arg1) {
        try {
            ++field10043;
            if (arg0 <= 72) {
                field10110 = 22;
            }
            if (arg1 != 3) {
                if (arg1 != 4) {
                    return ~arg1 == -9 ? new class784(this, super.field4705, super.field4687) : super.method2127((byte) 76, arg1);
                } else {
                    return new class355(this, super.field4705, super.field4687);
                }
            } else {
                return new class790(this, super.field4705);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10138[79] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "(I)V")
    public final void method2119(int arg0) {
        try {
            if (arg0 >= -9) {
                this.field10127 = false;
            }
            OpenGL.glDepthMask(super.field4765 && super.field4738);
            ++field10076;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZZBLoba;I)V")
    public final void method2096(boolean arg0, boolean arg1, byte arg2, class739 arg3, int arg4) {
        try {
            ++field10062;
            OpenGL.glTexEnvi(8960, arg4 + 34176, class774.method5579(34166, arg3));
            if (arg0) {
                OpenGL.glTexEnvi(8960, arg4 + 34192, !arg1 ? 770 : 771);
            } else {
                OpenGL.glTexEnvi(8960, 34192 - -arg4, arg1 ? 769 : 768);
            }
            int var6 = 8 / ((13 - arg2) / 49);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10138[64] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10138[3] : field10138[4]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lot;I)V")
    public final void method2120(class218 arg0, int arg1) {
        try {
            ++field10065;
            class121[] var3 = ((class465) arg0).field6778;
            int var4 = 0;
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            if (arg1 != -1) {
                field10112 = null;
            }
            for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
                class121 var9 = var3[var8];
                class799 var10 = this.field10116[var8];
                int var11 = 0;
                int var12 = var10.method5765(26270);
                long var13 = var10.method3061(~arg1);
                var10.method3059(~arg1);
                for (int var15 = 0; ~var15 > ~var9.method1090((byte) 28); ++var15) {
                    class212 var16 = var9.method1095(-24983, var15);
                    if (class212.field3105 == var16) {
                        var7 = true;
                        OpenGL.glVertexPointer(3, 5126, var12, (long) var11 + var13);
                    } else if (class212.field3110 != var16) {
                        if (class212.field3111 == var16) {
                            OpenGL.glColorPointer(4, 5121, var12, (long) var11 + var13);
                            var5 = true;
                        } else if (class212.field3112 != var16) {
                            if (class212.field3113 == var16) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(2, 5126, var12, (long) var11 + var13);
                            } else if (class212.field3114 == var16) {
                                OpenGL.glClientActiveTexture(33984 - -(var4++));
                                OpenGL.glTexCoordPointer(3, 5126, var12, (long) var11 + var13);
                            } else if (class212.field3115 == var16) {
                                OpenGL.glClientActiveTexture(33984 - -(var4++));
                                OpenGL.glTexCoordPointer(4, 5126, var12, var13 - -((long) var11));
                            }
                        } else {
                            OpenGL.glClientActiveTexture(33984 + var4++);
                            OpenGL.glTexCoordPointer(1, 5126, var12, (long) var11 + var13);
                        }
                    } else {
                        OpenGL.glNormalPointer(5126, var12, (long) var11 + var13);
                        var6 = true;
                    }
                    var11 += var16.field3108;
                }
            }
            if (this.field10117 != var7) {
                if (!var7) {
                    OpenGL.glDisableClientState(32884);
                } else {
                    OpenGL.glEnableClientState(32884);
                }
                this.field10117 = var7;
            }
            if (!this.field10118 == var6) {
                if (!var6) {
                    OpenGL.glDisableClientState(32885);
                } else {
                    OpenGL.glEnableClientState(32885);
                }
                this.field10118 = var6;
            }
            if (!this.field10121 != !var5) {
                if (var5) {
                    OpenGL.glEnableClientState(32886);
                } else {
                    OpenGL.glDisableClientState(32886);
                }
                this.field10121 = var5;
            }
            if (~var4 < ~this.field10123) {
                for (int var17 = this.field10123; ~var4 < ~var17; ++var17) {
                    OpenGL.glClientActiveTexture(var17 + 33984);
                    OpenGL.glEnableClientState(32888);
                }
                this.field10123 = var4;
            } else if (~var4 > ~this.field10123) {
                for (int var18 = var4; var18 < this.field10123; ++var18) {
                    OpenGL.glClientActiveTexture(var18 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field10123 = var4;
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field10138[29] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILlc;)V")
    public final void method2062(int arg0, class608 arg1) {
        try {
            if (class289.field4086 != arg1) {
                int var3 = class170.method1431((byte) -92, arg1);
                OpenGL.glTexGeni(8192, 9472, var3);
                OpenGL.glEnable(3168);
                OpenGL.glTexGeni(8193, 9472, var3);
                OpenGL.glEnable(3169);
                OpenGL.glTexGeni(8194, 9472, var3);
                OpenGL.glEnable(3170);
            } else {
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
            }
            if (arg0 != -5138) {
                this.field10118 = true;
            }
            ++field10087;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10138[74] + arg0 + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lhh;Lon;Z)Z")
    public final boolean method2079(class250 arg0, class496 arg1, boolean arg2) {
        try {
            if (!arg2) {
                return true;
            } else {
                ++field10050;
                return true;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10138[75] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "u", descriptor = "()V")
    public final void method135() {
        try {
            ++field10072;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[102] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "(I)V")
    public final void method2072(int arg0) {
        try {
            ++field10074;
            this.method5166((byte) -11);
            if (arg0 != 10979) {
                this.field10051 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public final Object method2065(Canvas arg0, int arg1) {
        try {
            ++field10098;
            long var3 = this.field10032.prepareSurface(arg0);
            if (arg1 != 0) {
                field10085 = null;
            }
            if (var3 == -1L) {
                throw new RuntimeException();
            } else {
                return new Long(var3);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[13] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "ya", descriptor = "()V")
    public final void method225() {
        try {
            this.method2628(1, true);
            ++field10091;
            OpenGL.glClear(256);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[39] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "A", descriptor = "()Z")
    public final boolean method217() {
        try {
            ++field10034;
            return false;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[85] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "(II)Lkb;")
    public final class102 method191(int arg0, int arg1) {
        try {
            ++field10066;
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[66] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "()I")
    public final int method139() {
        try {
            ++field10055;
            return this.field10132;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[8] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "s", descriptor = "(I)V")
    public final void method2092(int arg0) {
        try {
            ++field10029;
            int var2 = -83 % ((65 - arg0) / 43);
            int var3 = this.field10129[super.field4735];
            if (var3 != 0) {
                this.field10129[super.field4735] = 0;
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10138[106] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[[IZ)Lnm;")
    public final class361 method2083(int arg0, int arg1, int[][] arg2, boolean arg3) {
        try {
            ++field10027;
            if (arg0 != 1) {
                field10112 = null;
            }
            return new class308(this, arg1, arg3, arg2);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[27] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10138[3] : field10138[4]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILhh;III[B)Ljca;")
    public final class542 method2093(int arg0, class250 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        try {
            ++field10017;
            if (arg3 != 3282) {
                this.field10032 = null;
            }
            return new class637(this, arg1, arg2, arg0, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10138[109] + arg0 + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method2066(Object arg0, Canvas arg1, int arg2) {
        try {
            ++field10070;
            int var4 = 8 % ((arg2 - -9) / 52);
            Long var5 = (Long) arg0;
            this.field10032.surfaceResized(var5);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10138[73] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "U", descriptor = "(I)V")
    public final void method2064(int arg0) {
        try {
            OpenGL.glMatrixMode(5890);
            ++field10059;
            if (arg0 == 1) {
                if (super.field4764[super.field4735] == class684.field9603) {
                    OpenGL.glLoadIdentity();
                } else {
                    OpenGL.glLoadMatrixf(super.field4722[super.field4735].method4654(class643.field9158, false), 0);
                }
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[88] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)Luba;")
    public final class517 method2071(boolean arg0, int arg1) {
        try {
            if (arg1 != -21663) {
                this.method234();
            }
            ++field10104;
            return new class288(this, class496.field7282, arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[105] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "r", descriptor = "(B)V")
    public final void method2081(byte arg0) {
        try {
            ++field10038;
            super.field4809 = (float) (-super.field4779 + super.field4786);
            if (arg0 <= -21) {
                super.field4718 = super.field4809 - (float) super.field4732;
                if ((float) super.field4813 > super.field4718) {
                    super.field4718 = (float) super.field4813;
                }
                OpenGL.glFogf(2915, super.field4718);
                OpenGL.glFogf(2916, super.field4809);
                class238.field3443[2] = (float) class434.method3377(super.field4768, 255) / 255.0F;
                class238.field3443[0] = (float) class434.method3377(super.field4768, 16711680) / 1.671168E7F;
                class238.field3443[1] = (float) class434.method3377(65280, super.field4768) / 65280.0F;
                OpenGL.glFogfv(2918, class238.field3443, 0);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[76] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "G", descriptor = "(I)V")
    public final void method2116(int arg0) {
        try {
            ++field10097;
            OpenGL.glTexEnvi(8960, 34162, class218.method1846(80, super.field4817[super.field4735]));
            if (arg0 != 13730) {
                field10069 = -72;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method2113(Object arg0, Canvas arg1, int arg2) {
        try {
            ++field10082;
            if (arg2 == 1125) {
                Long var4 = (Long) arg0;
                if (!this.field10032.setSurface(var4)) {
                    throw new RuntimeException();
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[83] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "()V")
    public final void method167() {
        try {
            ++field10094;
            super.method167();
            if (this.field10032 != null) {
                this.field10032.method5237();
                this.field10032.release();
                this.field10032 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[108] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "na", descriptor = "(IIII)[I")
    public final int[] method227(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10020;
            int[] var5 = new int[arg2 * arg3];
            for (int var6 = 0; ~arg3 < ~var6; ++var6) {
                OpenGL.glReadPixelsi(arg0, super.field4646 - 1 + -arg1 + -var6, arg2, 1, 32993, this.field10126, var5, arg2 * var6);
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10138[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "t", descriptor = "(I)V")
    public final void method2102(int arg0) {
        try {
            if (arg0 <= 98) {
                this.field10032 = null;
            }
            if (super.field4789 && !super.field4811) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field10075;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "gb", descriptor = "(I)V")
    public final void method2100(int arg0) {
        try {
            if (arg0 == 4) {
                ++field10084;
                if (!super.field4794) {
                    OpenGL.glDisable(16384);
                    OpenGL.glDisable(16385);
                } else {
                    OpenGL.glEnable(16384);
                    OpenGL.glEnable(16385);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[84] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZIB[BILhh;II)Lcf;")
    public final class196 method2126(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4, class250 arg5, int arg6, int arg7) {
        try {
            if (arg2 != 82) {
                this.field10126 = -67;
            }
            ++field10099;
            if (this.field10130 || class357.method2858(arg7, false) && class357.method2858(arg1, false)) {
                return new class414(this, arg5, arg7, arg1, arg0, arg3, arg6, arg4);
            } else if (!this.field10134) {
                class414 var9 = new class414(this, arg5, class496.field7281, class788.method5671(1282334120, arg7), class788.method5671(1282334120, arg1));
                var9.method1699(arg5, 0, arg3, arg2 ^ -19466, arg4, arg1, arg7, arg6, 0);
                return var9;
            } else {
                return new class696(this, arg5, arg7, arg1, arg3, arg6, arg4);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10138[91] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10138[3] : field10138[4]) + ',' + arg4 + ',' + (arg5 != null ? field10138[3] : field10138[4]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lhh;IIILon;)Lcf;")
    public final class196 method2121(class250 arg0, int arg1, int arg2, int arg3, class496 arg4) {
        try {
            if (arg1 != 4) {
                this.method160(-1.3633941F, -0.1813113F, 2.5507815F);
            }
            ++field10044;
            if (this.field10130 || class357.method2858(arg3, false) && class357.method2858(arg2, false)) {
                return new class414(this, arg0, arg4, arg3, arg2);
            } else {
                return this.field10134 ? new class696(this, arg0, arg4, arg3, arg2) : new class414(this, arg0, arg4, class788.method5671(1282334120, arg3), class788.method5671(1282334120, arg2));
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10138[11] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "hb", descriptor = "(I)V")
    public static void method5160(int arg0) {
        try {
            field10112 = null;
            field10085 = null;
            field10107 = null;
            if (arg0 != 3) {
                method5165((class476) null, 119);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[98] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "(I)V")
    public final void method2123(int arg0) {
        try {
            ++field10078;
            for (int var2 = super.field4733 + -1; var2 >= 0; --var2) {
                OpenGL.glActiveTexture(var2 + 33984);
                OpenGL.glTexEnvi(8960, 8704, 34160);
                OpenGL.glTexEnvi(8960, 34161, 8448);
                OpenGL.glTexEnvi(8960, 34178, 34166);
                OpenGL.glTexEnvi(8960, 34162, 8448);
                OpenGL.glTexEnvi(8960, 34186, 34166);
            }
            OpenGL.glTexEnvi(8960, 34186, 34168);
            OpenGL.glShadeModel(7425);
            OpenGL.glClearDepth(1.0F);
            OpenGL.glDepthFunc(515);
            OpenGL.glPolygonMode(1028, 6914);
            OpenGL.glEnable(2884);
            OpenGL.glCullFace(1029);
            OpenGL.glAlphaFunc(516, 0.0F);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glColorMaterial(1028, 5634);
            OpenGL.glEnable(2903);
            float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
            for (int var4 = 0; var4 < 8; ++var4) {
                int var5 = 16384 - -var4;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
            }
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field10032.setSwapInterval(0);
            super.method2123(arg0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10138[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lbl;IZ)V")
    public final void method2088(class719 arg0, int arg1, boolean arg2) {
        try {
            if (!arg2) {
                this.field10116[arg1] = (class799) arg0;
                ++field10060;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10138[2] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "db", descriptor = "(I)V")
    public final void method2070(int arg0) {
        try {
            ++field10056;
            this.method2644((byte) 64);
            int var2;
            for (var2 = arg0; ~super.field4737 < ~var2; ++var2) {
                class330 var3 = super.field4730[var2];
                int var4 = var3.method2591(11062);
                int var5 = var2 + 16386;
                float var6 = var3.method2597(2) / 255.0F;
                class238.field3443[0] = (float) var3.method2595((byte) 106);
                class238.field3443[1] = (float) var3.method2590((byte) 127);
                class238.field3443[2] = (float) var3.method2592(true);
                class238.field3443[3] = 1.0F;
                OpenGL.glLightfv(var5, 4611, class238.field3443, 0);
                class238.field3443[2] = (float) class434.method3377(var4, 255) * var6;
                class238.field3443[3] = 1.0F;
                class238.field3443[1] = var6 * (float) class434.method3377(var4 >> 8, 255);
                class238.field3443[0] = (float) (class434.method3377(16735869, var4) >> 16) * var6;
                OpenGL.glLightfv(var5, 4609, class238.field3443, 0);
                OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method2594((byte) 21) * var3.method2594((byte) 21)));
                OpenGL.glEnable(var5);
            }
            while (~var2 > ~super.field4802) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            super.method2070(arg0);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10138[86] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[FIIIZILhh;)Lcf;")
    public final class196 method2073(int arg0, float[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class250 arg7) {
        try {
            if (arg4 != 0) {
                this.field10117 = true;
            }
            ++field10105;
            if (!this.field10130 && (!class357.method2858(arg3, false) || !class357.method2858(arg6, false))) {
                if (!this.field10134) {
                    class414 var9 = new class414(this, arg7, class496.field7285, class788.method5671(arg4 ^ 1282334120, arg3), class788.method5671(1282334120, arg6));
                    var9.method3233(arg3, 0, 0, arg6, arg1, arg7, arg0, arg4, arg2);
                    return var9;
                } else {
                    return new class696(this, arg7, arg3, arg6, arg1, arg0, arg2);
                }
            } else {
                return new class414(this, arg7, arg3, arg6, arg5, arg1, arg0, arg2);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10138[95] + arg0 + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(ZI)Lbl;")
    public final class719 method2117(boolean arg0, int arg1) {
        try {
            ++field10063;
            if (arg1 != 16) {
                this.field10133 = true;
            }
            return new class799(this, arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[35] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "()Z")
    public final boolean method164() {
        try {
            ++field10028;
            return false;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[31] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(JB)V")
    public final synchronized void method5161(long arg0, byte arg1) {
        try {
            if (arg1 <= -113) {
                ++field10049;
                class578 var4 = new class578();
                var4.field8378 = arg0;
                this.field10115.method3984(var4, 0);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[90] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(IIIID)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, double arg4) {
        try {
            ++field10092;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10138[110] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "()V")
    public final void method163() {
        try {
            ++field10023;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[77] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "()Lcba;")
    public final class254 method210() {
        try {
            ++field10048;
            int var1 = -1;
            if (this.field10137.indexOf(field10138[70]) == -1) {
                if (~this.field10137.indexOf(field10138[54]) != 0) {
                    var1 = 32902;
                } else if (this.field10137.indexOf(field10138[69]) != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 4318;
            }
            return new class254(var1, field10138[67], this.field10131, this.field10128, 0L);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[68] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lsn;Lsn;FLsn;)Lsn;")
    public final class369 method155(class369 arg0, class369 arg1, float arg2, class369 arg3) {
        try {
            ++field10079;
            return !(arg2 < 0.5F) ? arg1 : arg0;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[63] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + arg2 + ',' + (arg3 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "(B)V")
    public final void method2090(byte arg0) {
        try {
            if (arg0 != -94) {
                this.method2103((class700) null, -4, -120, 39);
            }
            if (!super.field4842) {
                OpenGL.glDisable(3089);
            } else {
                OpenGL.glEnable(3089);
            }
            ++field10057;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[99] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BZ)V")
    public final void method2101(byte arg0, boolean arg1) {
        try {
            if (arg0 == 46) {
                if (!arg1) {
                    OpenGL.glDisable(32925);
                } else {
                    OpenGL.glEnable(32925);
                }
                ++field10021;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[42] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "(B)V")
    public final void method2106(byte arg0) {
        try {
            OpenGL.glTexEnvi(8960, 34161, class218.method1846(-59, super.field4798[super.field4735]));
            ++field10077;
            if (arg0 >= -117) {
                this.method227(52, 18, -89, -115);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[92] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "()V")
    public final void method238() {
        try {
            ++field10071;
            if (~super.field4653 < -1 || ~super.field4646 < -1) {
                int var1 = super.field4731;
                int var2 = super.field4812;
                int var3 = super.field4787;
                int var4 = super.field4754;
                this.method240();
                OpenGL.glReadBuffer(1028);
                OpenGL.glDrawBuffer(1029);
                this.method2687(101);
                this.method2685(false, -32);
                this.method2647(false, 0);
                this.method2669(false, -18819);
                this.method2628(1, false);
                this.method2668(24, (class764) null);
                this.method2664(false, false, 16, -2);
                this.method2679(2, 1);
                this.method2619(0, 1);
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                OpenGL.glRasterPos2i(0, 0);
                OpenGL.glCopyPixels(0, 0, super.field4653, super.field4646, 6144);
                OpenGL.glFlush();
                OpenGL.glReadBuffer(1029);
                OpenGL.glDrawBuffer(1029);
                this.method208(var1, var3, var2, var4);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[40] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZILoba;Z)V")
    public final void method2063(boolean arg0, int arg1, class739 arg2, boolean arg3) {
        try {
            ++field10095;
            OpenGL.glTexEnvi(8960, arg1 + 34184, class774.method5579(34166, arg2));
            OpenGL.glTexEnvi(8960, arg1 + 34200, arg3 ? 771 : 770);
            if (arg0) {
                this.field10130 = true;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[101] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10138[3] : field10138[4]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lbha;Lkb;)Ltha;")
    public final class296 method134(class545 arg0, class102 arg1) {
        try {
            ++field10106;
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[10] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "(I)V")
    public final synchronized void method175(int arg0) {
        try {
            ++field10073;
            int var14 = arg0 & Integer.MAX_VALUE;
            int var2 = 0;
            while (!this.field10108.method3974(-22016)) {
                class529 var3 = (class529) this.field10108.method3980(-27119);
                class142.field1843[var2++] = (int) var3.field8378;
                super.field4712 -= var3.field7679;
                if (~var2 == -1001) {
                    OpenGL.glDeleteBuffersARB(var2, class142.field1843, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteBuffersARB(var2, class142.field1843, 0);
                var2 = 0;
            }
            while (!this.field10109.method3974(-22016)) {
                class529 var4 = (class529) this.field10109.method3980(-27119);
                class142.field1843[var2++] = (int) var4.field8378;
                super.field4711 -= var4.field7679;
                if (~var2 == -1001) {
                    OpenGL.glDeleteTextures(var2, class142.field1843, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteTextures(var2, class142.field1843, 0);
                var2 = 0;
            }
            while (!this.field10111.method3974(-22016)) {
                class529 var5 = (class529) this.field10111.method3980(-27119);
                class142.field1843[var2++] = var5.field7679;
                if (var2 == 1000) {
                    OpenGL.glDeleteFramebuffersEXT(var2, class142.field1843, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteFramebuffersEXT(var2, class142.field1843, 0);
                var2 = 0;
            }
            while (!this.field10113.method3974(-22016)) {
                class529 var6 = (class529) this.field10113.method3980(-27119);
                class142.field1843[var2++] = (int) var6.field8378;
                super.field4706 -= var6.field7679;
                if (~var2 == -1001) {
                    OpenGL.glDeleteRenderbuffersEXT(var2, class142.field1843, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class142.field1843, 0);
                boolean var7 = false;
            }
            while (!this.field10051.method3974(-22016)) {
                class529 var8 = (class529) this.field10051.method3980(-27119);
                OpenGL.glDeleteLists((int) var8.field8378, var8.field7679);
            }
            while (!this.field10114.method3974(-22016)) {
                class578 var9 = this.field10114.method3980(-27119);
                OpenGL.glDeleteProgramARB((int) var9.field8378);
            }
            while (!this.field10115.method3974(-22016)) {
                class578 var10 = this.field10115.method3980(-27119);
                OpenGL.glDeleteObjectARB(var10.field8378);
            }
            while (!this.field10051.method3974(-22016)) {
                class529 var11 = (class529) this.field10051.method3980(-27119);
                OpenGL.glDeleteLists((int) var11.field8378, var11.field7679);
            }
            if (this.method122() > 100663296 && ~(this.field10122 + 60000L) > ~class614.method4531(-123)) {
                System.gc();
                this.field10122 = class614.method4531(-96);
            }
            super.method175(var14);
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field10138[41] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)F")
    public final float method2095(byte arg0) {
        try {
            if (arg0 != -111) {
                return -1.310913F;
            } else {
                ++field10018;
                return 0.0F;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[Luc;)Lot;")
    public final class218 method2080(int arg0, class121[] arg1) {
        try {
            ++field10042;
            return arg0 <= 57 ? null : new class465(arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[32] + arg0 + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "(B)V")
    public final void method2115(byte arg0) {
        try {
            if (super.field4766) {
                OpenGL.glEnable(3008);
            } else {
                OpenGL.glDisable(3008);
            }
            ++field10100;
            int var2 = 0 / ((arg0 - 29) / 56);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[34] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "O", descriptor = "(I)V")
    public final void method2069(int arg0) {
        try {
            if (arg0 == -4984) {
                OpenGL.glViewport(super.field4721, super.field4784, super.field4653, super.field4646);
                ++field10090;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "H", descriptor = "(I)V")
    public final void method2125(int arg0) {
        try {
            OpenGL.glMatrixMode(5889);
            int var2 = -117 / ((30 - arg0) / 53);
            ++field10080;
            OpenGL.glLoadMatrixf(super.field4792, 0);
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[93] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method224(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class142 {
        try {
            ++field10081;
            this.method132(arg2, arg3);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[12] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "r", descriptor = "()V")
    public final void method234() {
        try {
            ++field10083;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[81] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(FFF)V")
    public final void method160(float arg0, float arg1, float arg2) {
        try {
            ++field10019;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10138[97] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "(II)V")
    public final void method149(int arg0, int arg1) {
        try {
            ++field10064;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[87] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V")
    public final synchronized void method5162(int arg0, int arg1, int arg2) {
        try {
            ++field10101;
            class529 var4 = new class529(arg2);
            var4.field8378 = (long) arg1;
            if (arg0 == 34162) {
                this.field10108.method3984(var4, 0);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[36] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "GA", descriptor = "(I)V")
    public final void method243(int arg0) {
        try {
            OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
            ++field10041;
            OpenGL.glClear(16384);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[71] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZII)V")
    public final synchronized void method5163(boolean arg0, int arg1, int arg2) {
        try {
            ++field10026;
            class529 var4 = new class529(arg2);
            var4.field8378 = (long) arg1;
            this.field10109.method3984(var4, 0);
            if (!arg0) {
                this.field10108 = null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[33] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "(B)V")
    public final void method2104(byte arg0) {
        try {
            ++field10088;
            this.field10119 = false;
            this.method5166((byte) -11);
            if (arg0 != -106) {
                this.method2092(3);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "(II)V")
    public final synchronized void method5164(int arg0, int arg1) {
        try {
            ++field10046;
            class578 var3 = new class578();
            if (arg1 == 3) {
                var3.field8378 = (long) arg0;
                this.field10114.method3984(var3, 0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10138[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIII)V")
    public final void method151(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10047;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[28] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Llga;I)V")
    public class713(OpenGL arg0, Canvas arg1, long arg2, class673 arg3, class47 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            try {
                this.field10032 = arg0;
                this.field10032.method5239();
                this.field10137 = OpenGL.glGetString(7936).toLowerCase();
                this.field10128 = OpenGL.glGetString(7937).toLowerCase();
                if (~this.field10137.indexOf(field10138[55]) == 0 && this.field10137.indexOf(field10138[51]) == -1 && ~this.field10137.indexOf(field10138[62]) == 0) {
                    String var8 = OpenGL.glGetString(7938);
                    String[] var9 = class793.method5716(' ', var8.replace('.', ' '), -83);
                    if (var9.length >= 2) {
                        try {
                            int var10 = class425.method3299(var9[0], (byte) 98);
                            int var11 = class425.method3299(var9[1], (byte) 115);
                            this.field10131 = var10 * 10 - -var11;
                        } catch (NumberFormatException var23) {
                            throw new RuntimeException("");
                        }
                        if (this.field10131 < 12) {
                            throw new RuntimeException("");
                        } else if (!this.field10032.method5238(field10138[56])) {
                            throw new RuntimeException("");
                        } else if (!this.field10032.method5238(field10138[59])) {
                            throw new RuntimeException("");
                        } else {
                            int[] var12 = new int[1];
                            OpenGL.glGetIntegerv(34018, var12, 0);
                            super.field4733 = var12[0];
                            if (super.field4733 < 2) {
                                throw new RuntimeException("");
                            } else {
                                super.field4740 = 8;
                                this.field10133 = this.field10032.method5238(field10138[45]);
                                super.field4763 = this.field10032.method5238(field10138[61]);
                                this.field10134 = this.field10032.method5238(field10138[60]);
                                super.field4750 = this.field10032.method5238(field10138[48]);
                                this.field10130 = this.field10032.method5238(field10138[53]);
                                super.field4780 = this.field10032.method5238(field10138[46]);
                                this.field10127 = this.field10032.method5238(field10138[43]);
                                this.field10136 = this.field10032.method5238(field10138[52]);
                                this.field10135 = this.field10032.method5238(field10138[57]);
                                this.field10032.method5238(field10138[50]);
                                this.field10129 = new int[super.field4733];
                                this.field10126 = !Stream.method3200() ? 5121 : 33639;
                                if (~this.field10128.indexOf(field10138[47]) != 0) {
                                    int var13 = 0;
                                    boolean var14 = false;
                                    boolean var15 = false;
                                    String[] var16 = class793.method5716(' ', this.field10128.replace('/', ' '), -121);
                                    for (int var17 = 0; var17 < var16.length; ++var17) {
                                        String var18 = var16[var17];
                                        try {
                                            if (var18.length() > 0) {
                                                if (var18.charAt(0) == 'x' && ~var18.length() <= -4 && class756.method5486(0, var18.substring(1, 3))) {
                                                    var15 = true;
                                                    var18 = var18.substring(1);
                                                }
                                                if (var18.equals(field10138[58])) {
                                                    var14 = true;
                                                } else {
                                                    if (var18.startsWith(field10138[58])) {
                                                        var14 = true;
                                                        var18 = var18.substring(2);
                                                    }
                                                    if (var18.length() >= 4 && class756.method5486(0, var18.substring(0, 4))) {
                                                        var13 = class425.method3299(var18.substring(0, 4), (byte) 101);
                                                        break;
                                                    }
                                                }
                                            }
                                        } catch (Exception var24) {
                                        }
                                    }
                                    if (!var15 && !var14) {
                                        if (~var13 <= -7001 && ~var13 >= -9251) {
                                            super.field4780 = false;
                                        }
                                        if (var13 >= 7000 && var13 <= 7999) {
                                            this.field10133 = false;
                                        }
                                    }
                                    this.field10134 &= this.field10032.method5238(field10138[44]);
                                }
                                this.field10137.indexOf(field10138[54]);
                                if (this.field10133) {
                                    try {
                                        int[] var19 = new int[1];
                                        OpenGL.glGenBuffersARB(1, var19, 0);
                                    } catch (Throwable var22) {
                                        throw new RuntimeException("");
                                    }
                                }
                            }
                        }
                    } else {
                        throw new RuntimeException("");
                    }
                } else {
                    throw new RuntimeException("");
                }
            } catch (Throwable var25) {
                var25.printStackTrace();
                this.method177((byte) -87);
                throw new RuntimeException("");
            }
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field10138[49] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + arg2 + ',' + (arg3 != null ? field10138[3] : field10138[4]) + ',' + (arg4 != null ? field10138[3] : field10138[4]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "q", descriptor = "(I)V")
    public final void method2110(int arg0) {
        try {
            class238.field3443[1] = (float) class434.method3377(65280, super.field4720) / 65280.0F;
            class238.field3443[0] = (float) class434.method3377(super.field4720, 16711680) / 1.671168E7F;
            class238.field3443[3] = (float) (super.field4720 >>> 24) / 255.0F;
            class238.field3443[2] = (float) class434.method3377(255, super.field4720) / 255.0F;
            ++field10031;
            if (arg0 <= 101) {
                this.method139();
            }
            OpenGL.glTexEnvfv(8960, 8705, class238.field3443, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[65] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ltha;)V")
    public final void method165(class296 arg0) {
        try {
            ++field10102;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[94] + (arg0 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lcb;IILuba;III)V")
    public final void method2074(class700 arg0, int arg1, int arg2, class517 arg3, int arg4, int arg5, int arg6) {
        try {
            ++field10040;
            byte var8;
            int var9;
            if (class434.field6287 == arg0) {
                var8 = 1;
                var9 = arg5 * 2;
            } else if (class696.field9752 != arg0) {
                if (class12.field163 == arg0) {
                    var8 = 4;
                    var9 = arg5 * 3;
                } else if (class36.field443 != arg0) {
                    if (class709.field9896 != arg0) {
                        var8 = 0;
                        var9 = arg5;
                    } else {
                        var8 = 5;
                        var9 = arg5 + 2;
                    }
                } else {
                    var9 = arg5 - -2;
                    var8 = 6;
                }
            } else {
                var9 = arg5 - -1;
                var8 = 3;
            }
            class496 var10 = arg3.method2345(112);
            class288 var11 = (class288) arg3;
            var11.method3059(0);
            if (arg6 < 8) {
                this.method2117(true, -96);
            }
            OpenGL.glDrawElements(var8, var9, class800.method5769(-115, var10), var11.method3061(0) + (long) (var10.field7279 * arg4));
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field10138[7] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10138[3] : field10138[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
        try {
            ++field10103;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[80] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIZ[III)Lcf;")
    public final class196 method2078(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        try {
            ++field10086;
            if (arg2 != -20084) {
                this.field10108 = null;
            }
            if (this.field10130 || class357.method2858(arg1, false) && class357.method2858(arg5, false)) {
                return new class414(this, arg1, arg5, arg3, arg4, arg0, arg6);
            } else if (this.field10134) {
                return new class696(this, arg1, arg5, arg4, arg0, arg6);
            } else {
                class414 var8 = new class414(this, class385.field5635, class496.field7281, class788.method5671(1282334120, arg1), class788.method5671(1282334120, arg5));
                var8.method1704(arg0, 0, (byte) 13, arg6, arg4, arg5, arg1, 0);
                return var8;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10138[78] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10138[3] : field10138[4]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "(B)V")
    public final void method2108(byte arg0) {
        try {
            ++field10068;
            if (arg0 >= -125) {
                field10069 = 73;
            }
            if (!super.field4804) {
                OpenGL.glDisable(3042);
            } else {
                OpenGL.glEnable(3042);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[89] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lcb;III)V")
    public final void method2103(class700 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10036;
            if (arg3 <= 92) {
                this.method5163(true, -65, 59);
            }
            byte var5;
            int var6;
            if (class434.field6287 != arg0) {
                if (class696.field9752 == arg0) {
                    var5 = 3;
                    var6 = arg1 + 1;
                } else if (class12.field163 != arg0) {
                    if (class36.field443 != arg0) {
                        if (class709.field9896 != arg0) {
                            var5 = 0;
                            var6 = arg1;
                        } else {
                            var6 = arg1 - -2;
                            var5 = 5;
                        }
                    } else {
                        var6 = arg1 - -2;
                        var5 = 6;
                    }
                } else {
                    var5 = 4;
                    var6 = arg1 * 3;
                }
            } else {
                var5 = 1;
                var6 = arg1 * 2;
            }
            OpenGL.glDrawArrays(var5, arg2, var6);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10138[19] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "V", descriptor = "(I)V")
    public final void method2098(int arg0) {
        try {
            if (arg0 == -23832) {
                ++field10093;
                if (class686.field9617 == super.field4726) {
                    OpenGL.glBlendFunc(770, 771);
                } else {
                    if (class503.field7340 != super.field4726) {
                        if (class618.field8809 == super.field4726) {
                            OpenGL.glBlendFunc(774, 1);
                            return;
                        }
                    } else {
                        OpenGL.glBlendFunc(1, 1);
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "(I)V")
    public final void method2114(int arg0) {
        try {
            ++field10033;
            OpenGL.glLightfv(16384, 4611, super.field4746, 0);
            if (arg0 != -5072) {
                this.method5161(-31L, (byte) 62);
            }
            OpenGL.glLightfv(16385, 4611, super.field4771, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "()V")
    public final void method138() {
        try {
            ++field10045;
            OpenGL.glFinish();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10138[6] + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "(I)V")
    public final void method2097(int arg0) {
        try {
            ++field10030;
            if (arg0 != -12888) {
                this.method225();
            }
            if (super.field4782 && super.field4760 && super.field4732 >= 0) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[37] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "(II)Lbha;")
    public final class545 method179(int arg0, int arg1) {
        try {
            ++field10058;
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[26] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILon;Lhh;)Z")
    public final boolean method2082(int arg0, class496 arg1, class250 arg2) {
        try {
            if (arg0 != -27964) {
                this.method2080(-45, (class121[]) null);
            }
            ++field10054;
            return true;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10138[30] + arg0 + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + (arg2 != null ? field10138[3] : field10138[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "(I)V")
    public final void method2084(int arg0) {
        try {
            if (arg0 == 4843) {
                ++field10061;
                OpenGL.glActiveTexture(super.field4735 + 33984);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[103] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "(I)V")
    public final void method2075(int arg0) {
        try {
            if (super.field4734) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            if (arg0 > -65) {
                this.field10135 = true;
            }
            ++field10022;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)V")
    public final void method2124(byte arg0, int arg1) {
        try {
            ++field10089;
            if (arg0 < 120) {
                this.method2103((class700) null, 15, 7, 78);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "L", descriptor = "(I)V")
    public final void method2109(int arg0) {
        try {
            ++field10052;
            class238.field3443[3] = 1.0F;
            class238.field3443[0] = super.field4807 * super.field4801;
            class238.field3443[arg0] = super.field4801 * super.field4767;
            class238.field3443[2] = super.field4801 * super.field4758;
            OpenGL.glLightModelfv(2899, class238.field3443, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "(I)V")
    public final void method2091(int arg0) {
        try {
            if (arg0 != -9213) {
                this.field10117 = true;
            }
            ++field10096;
            OpenGL.glScissor(super.field4731 + super.field4721, -super.field4754 + super.field4646 + super.field4784, -super.field4731 + super.field4812, -super.field4787 + super.field4754);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[38] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(II)V")
    public final void method132(int arg0, int arg1) throws class142 {
        try {
            ++field10067;
            this.field10032.swapBuffers();
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[82] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "(Z)V")
    public final void method2094(boolean arg0) {
        try {
            if (!arg0) {
                ++field10053;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[72] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "(B)V")
    public final void method2085(byte arg0) {
        try {
            ++field10025;
            class238.field3443[0] = super.field4807 * super.field4757;
            class238.field3443[1] = super.field4767 * super.field4757;
            class238.field3443[3] = 1.0F;
            class238.field3443[2] = super.field4758 * super.field4757;
            OpenGL.glLightfv(16384, 4609, class238.field3443, 0);
            class238.field3443[0] = -super.field4736 * super.field4807;
            if (arg0 != -23) {
                this.method2091(50);
            }
            class238.field3443[1] = -super.field4736 * super.field4767;
            class238.field3443[3] = 1.0F;
            class238.field3443[2] = -super.field4736 * super.field4758;
            OpenGL.glLightfv(16385, 4609, class238.field3443, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[104] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Leea;I)V")
    public static final void method5165(class476 arg0, int arg1) {
        try {
            ++field10037;
            arg0.method5127(class531.field7700.method498(71), 26108);
            arg0.method5127(class45.field645.method498(125), 26108);
            arg0.method5127(class217.field3180.method498(77), 26108);
            arg0.method5127(class767.field10953.method498(96), 26108);
            arg0.method5127(class395.field5736.method498(52), 26108);
            arg0.method5127(class203.field2987.method498(71), 26108);
            arg0.method5127(class379.field5540.method498(116), 26108);
            arg0.method5127(class378.field5529.method498(61), 26108);
            arg0.method5127(class524.field7640.method498(78), 26108);
            arg0.method5127(class156.field1990.method498(45), 26108);
            arg0.method5127(class489.field7167.method498(97), 26108);
            arg0.method5127(class98.field1330.method498(82), 26108);
            arg0.method5127(class788.field11371.method498(83), 26108);
            arg0.method5127(class151.field1933.method498(98), 26108);
            arg0.method5127(class449.field6575.method498(41), 26108);
            arg0.method5127(class654.field9281.method498(69), 26108);
            arg0.method5127(class343.field4991.method498(118), 26108);
            arg0.method5127(class234.field3375.method498(78), 26108);
            arg0.method5127(class347.field5047.method498(49), 26108);
            arg0.method5127(class691.field9674.method498(57), 26108);
            arg0.method5127(class493.field7240.method498(73), 26108);
            arg0.method5127(class776.field11061.method498(66), 26108);
            arg0.method5127(class430.field6237.method498(90), 26108);
            arg0.method5127(class622.field8890.method498(125), 26108);
            arg0.method5127(class130.field1620.method498(40), 26108);
            arg0.method5127(class151.field1929.method498(35), 26108);
            arg0.method5127(class164.field2118.method498(69), 26108);
            arg0.method5127(class765.field10939.method498(40), 26108);
            int var2 = -80 % ((arg1 - -40) / 52);
            arg0.method5127(class551.field8050.method498(93), 26108);
            arg0.method5127(class353.field5121.method498(65), 26108);
            arg0.method5127(class268.field3796.method498(81), 26108);
            arg0.method5127(class194.field2701.method498(34), 26108);
            arg0.method5127(class108.method1024((byte) 69), 26108);
            arg0.method5127(class431.method3355(127), 26108);
            arg0.method5127(class135.field1751.method498(125), 26108);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10138[107] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method2076(Object arg0, Canvas arg1, int arg2) {
        try {
            ++field10039;
            if (arg2 != 0) {
                this.field10124 = null;
            }
            Long var4 = (Long) arg0;
            this.field10032.releaseSurface(arg1, var4);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10138[100] + (arg0 != null ? field10138[3] : field10138[4]) + ',' + (arg1 != null ? field10138[3] : field10138[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "t", descriptor = "(B)V")
    private final void method5166(byte arg0) {
        try {
            ++field10035;
            if (this.field10120) {
                OpenGL.glPopMatrix();
            }
            if (arg0 != -11) {
                this.method2123(-54);
            }
            if (super.field4770.method5331(-30751)) {
                if (!this.field10119) {
                    OpenGL.glLoadMatrixf(super.field4715.method4654(class643.field9158, false), 0);
                    this.field10119 = true;
                    this.method2114(-5072);
                    this.method2070(0);
                }
                if (super.field4710) {
                    this.field10120 = false;
                } else {
                    OpenGL.glPushMatrix();
                    OpenGL.glMultMatrixf(super.field4708.method4654(class643.field9158, false), 0);
                    this.field10120 = true;
                }
            } else if (!super.field4710) {
                OpenGL.glLoadMatrixf(super.field4708.method4654(class643.field9158, false), 0);
                this.field10120 = false;
            } else {
                OpenGL.glLoadIdentity();
                this.field10120 = false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10138[96] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5167(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 87);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5168(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
