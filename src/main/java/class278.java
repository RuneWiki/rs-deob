import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class278 extends class261 {

    @OriginalMember(owner = "client!tia", name = "dh", descriptor = "Lat;")
    private class398 field4489 = new class398();

    @OriginalMember(owner = "client!tia", name = "wh", descriptor = "Lat;")
    private class398 field4522 = new class398();

    @OriginalMember(owner = "client!tia", name = "hh", descriptor = "Lat;")
    private class398 field4525 = new class398();

    @OriginalMember(owner = "client!tia", name = "fh", descriptor = "Lat;")
    private class398 field4530 = new class398();

    @OriginalMember(owner = "client!tia", name = "Ug", descriptor = "Lat;")
    private class398 field4532 = new class398();

    @OriginalMember(owner = "client!tia", name = "th", descriptor = "Lat;")
    private class398 field4533 = new class398();

    @OriginalMember(owner = "client!tia", name = "Fg", descriptor = "Lat;")
    private class398 field4534 = new class398();

    @OriginalMember(owner = "client!tia", name = "Yh", descriptor = "[Lnfa;")
    private class710[] field4536 = new class710[16];

    @OriginalMember(owner = "client!tia", name = "Oi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field4537 = new MapBuffer();

    @OriginalMember(owner = "client!tia", name = "Eg", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field4544 = new MapBuffer();

    @OriginalMember(owner = "client!tia", name = "Ji", descriptor = "I")
    private int field4551 = 0;

    @OriginalMember(owner = "client!tia", name = "Bh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4485;

    @OriginalMember(owner = "client!tia", name = "Qh", descriptor = "Ljava/lang/String;")
    private String field4552;

    @OriginalMember(owner = "client!tia", name = "Lg", descriptor = "Ljava/lang/String;")
    private String field4555;

    @OriginalMember(owner = "client!tia", name = "Dg", descriptor = "I")
    private int field4548;

    @OriginalMember(owner = "client!tia", name = "hi", descriptor = "Z")
    public boolean field4550;

    @OriginalMember(owner = "client!tia", name = "Ei", descriptor = "Z")
    private boolean field4546;

    @OriginalMember(owner = "client!tia", name = "ui", descriptor = "Z")
    private boolean field4553;

    @OriginalMember(owner = "client!tia", name = "Zh", descriptor = "Z")
    public boolean field4556;

    @OriginalMember(owner = "client!tia", name = "Ag", descriptor = "Z")
    public boolean field4554;

    @OriginalMember(owner = "client!tia", name = "Di", descriptor = "Z")
    public boolean field4547;

    @OriginalMember(owner = "client!tia", name = "vi", descriptor = "[I")
    public int[] field4545;

    @OriginalMember(owner = "client!tia", name = "Ng", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!tia", name = "Qi", descriptor = "[Ljava/lang/String;")
    private static final String[] field4557 = new String[] { method2391(method2390("&\"\n\u0004'\u0017c")), method2391(method2390("<>\u0007F")), method2391(method2390(")eE\u0004\u001e")), method2391(method2390("&\"\n\u00047\u0017c")), method2391(method2390("&\"\n\u0004&\u0014c")), method2391(method2390("&\"\n\u0004 \u0017c")), method2391(method2390("&\"\n\u0004-\u0011c")), method2391(method2390("&\"\n\u0004*\u0014c")), method2391(method2390("&\"\n\u0004,\u0017c")), method2391(method2390("&\"\n\u0004,\u0010c")), method2391(method2390("&\"\n\u0004$\u0013c")), method2391(method2390("&\"\n\u00041\u0010c")), method2391(method2390("&\"\n\u00046\u0014c")), method2391(method2390("&\"\n\u00042\u0010c")), method2391(method2390("&\"\n\u0004'\u0015c")), method2391(method2390("&\"\n\u00040\u0016c")), method2391(method2390("&\"\n\u00042\u0014c")), method2391(method2390("&\"\n\u0004*z")), method2391(method2390("&\"\n\u0004/\u0010c")), method2391(method2390("&\"\n\u0004 \u0014c")), method2391(method2390("&\"\n\u0004$\u0014c")), method2391(method2390("&\"\n\u0004)\u0014c")), method2391(method2390(";%\u001fO\u000f")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u001fO\u001b&>\u0019O<<$\u0005u\u0013=<\u000eX<=-4^\u0014=")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u001fO\u001b&>\u0019O<7%\u001du\u0000=&\tC\r7")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u0006_\u000f&\"\u001fO\u001b&>\u0019O")), method2391(method2390(":/")), method2391(method2390(" *\u000fO\f<")), method2391(method2390("?.\u0018K")), method2391(method2390("?\"\bX\f!$\r^")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u0003K\u000f4\u0014\rF\f3?4Z\n*.\u0007")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u001fO\u001b&>\u0019O<1>\tO<?*\u001b")), method2391(method2390("&\"\n\u0004_;%\u0002^]z")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u001dO\u0011&.\u0013u\u0001'-\rO\u0011\r$\t@\u00061?")), method2391(method2390("09\u0002K\rr;\n_\u000f")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u001dO\u0011&.\u0013u\u0013 $\fX\u0002?")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u001dO\u0011&.\u0013u\u0010:*\u000fO\u0011")), method2391(method2390("\u0015\u00074o;\u0006\u0014\u001fO\u001b&>\u0019OP\u0016")), method2391(method2390("\u0015\u00074k1\u0010\u0014\rX\u00025&\u000eD\u0017\r8\u0003K\u000779")), method2391(method2390("\u0015\u00074k1\u0010\u0014\rX\u00025&\u000eD\u0017\r;\u0019E\u0004 *\u0006")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u001fO\u001b&>\u0019O< .\b^\u0002<,\u0007O")), method2391(method2390("\u0015\u00074k1\u0010\u0014\u0006_\u000f&\"\u0018K\u000e\"'\u000e")), method2391(method2390("&\"\n\u0004\u001a3c")), method2391(method2390("&\"\n\u00044\u0014c")), method2391(method2390("&\"\n\u00043\u0014c")), method2391(method2390("&\"\n\u0004,\u0013c")), method2391(method2390("&\"\n\u00041\u0013c")), method2391(method2390("&\"\n\u0004%\u0013c")), method2391(method2390("&\"\n\u0004+\u0014c")), method2391(method2390("&\"\n\u0004\r3c")), method2391(method2390("&\"\n\u0004%\u0016c")), method2391(method2390("&\"\n\u00047\u0014c")), method2391(method2390("&\"\n\u0004&\u0015c")), method2391(method2390("&\"\n\u00042\u0013c")), method2391(method2390("3?\u0002")), method2391(method2390("<=\u0002N\n3")), method2391(method2390("&\"\n\u00042\u0016c")), method2391(method2390("\u001d;\u000eD$\u001e")), method2391(method2390("&\"\n\u0004*\u0015c")), method2391(method2390("&\"\n\u0004\u0001z")), method2391(method2390("&\"\n\u00046\u0017c")), method2391(method2390("&\"\n\u0004(\u0014c")), method2391(method2390("&\"\n\u00044\u0017c")), method2391(method2390("&\"\n\u0004'\u0016c")), method2391(method2390("&\"\n\u0004'\u0014c")), method2391(method2390("&\"\n\u0004-\u0014c")), method2391(method2390("&\"\n\u0004*\u0011c")), method2391(method2390("&\"\n\u0004%z")), method2391(method2390("&\"\n\u0004*\u0017c")), method2391(method2390("&\"\n\u0004(\u0010c")), method2391(method2390("&\"\n\u00041\u0014c")), method2391(method2390("&\"\n\u0004/\u0014c")), method2391(method2390("&\"\n\u00045\u0017c")), method2391(method2390("&\"\n\u00047\u0013c")), method2391(method2390("&\"\n\u00045\u0014c")), method2391(method2390("&\"\n\u0004.\u0017c")), method2391(method2390("&\"\n\u0004'z")), method2391(method2390("&\"\n\u00044\u0013c")), method2391(method2390("&\"\n\u0004\"\u0014c")), method2391(method2390("&\"\n\u0004-\u0010c")), method2391(method2390("&\"\n\u0004(\u0015c")), method2391(method2390("&\"\n\u00040\u0017c")), method2391(method2390("&\"\n\u00043\u0017c")), method2391(method2390("&\"\n\u00046\u0013c")), method2391(method2390("&\"\n\u0004%\u0014c")), method2391(method2390("&\"\n\u0004,\u0014c")), method2391(method2390("&\"\n\u0004\"\u0013c")), method2391(method2390("&\"\n\u0004%\u0017c")), method2391(method2390("&\"\n\u0004%\u0015c")), method2391(method2390("&\"\n\u0004 \u0010c")), method2391(method2390("&\"\n\u0004-\u0017c")), method2391(method2390("&\"\n\u0004)\u0017c")), method2391(method2390("&\"\n\u0004!\u0015c")), method2391(method2390("&\"\n\u0004+\u0017c")), method2391(method2390("&\"\n\u0004!\u0017c")), method2391(method2390("&\"\n\u0004*\u0013c")), method2391(method2390("&\"\n\u0004(\u0017c")), method2391(method2390("&\"\n\u00044\u0016c")), method2391(method2390("&\"\n\u0004/\u0017c")), method2391(method2390("&\"\n\u00045\u0016c")), method2391(method2390("&\"\n\u0004-z")), method2391(method2390("&\"\n\u0004.\u0013c")), method2391(method2390("&\"\n\u0004)\u0015c")), method2391(method2390("&\"\n\u0004.\u0014c")), method2391(method2390("&\"\n\u0004(\u0011c")), method2391(method2390("&\"\n\u00042\u0017c")), method2391(method2390("&\"\n\u00041\u0017c")), method2391(method2390("&\"\n\u0004!\u0014c")), method2391(method2390("&\"\n\u0004\"\u0017c")), method2391(method2390("&\"\n\u0004 \u0013c")), method2391(method2390("&\"\n\u0004&\u0017c")), method2391(method2390("&\"\n\u0004$\u0017c")), method2391(method2390("&\"\n\u0004$\u0015c")), method2391(method2390("&\"\n\u0004+\u0015c")) };

    @OriginalMember(owner = "client!tia", name = "Mi", descriptor = "[C")
    public static char[] field4470 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!tia", name = "Ii", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!tia", name = "Kg", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!tia", name = "uh", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!tia", name = "lh", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!tia", name = "Ah", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!tia", name = "Hh", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!tia", name = "yh", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!tia", name = "bh", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!tia", name = "gi", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!tia", name = "Qg", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!tia", name = "ch", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!tia", name = "Sh", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!tia", name = "qi", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!tia", name = "nh", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!tia", name = "qh", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!tia", name = "ph", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!tia", name = "Fi", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!tia", name = "ai", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!tia", name = "zi", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!tia", name = "xh", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!tia", name = "Bi", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!tia", name = "Oh", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!tia", name = "xi", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!tia", name = "sh", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!tia", name = "Tg", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!tia", name = "kh", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!tia", name = "Uh", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!tia", name = "rh", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!tia", name = "Rg", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!tia", name = "Ci", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!tia", name = "ah", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!tia", name = "Zg", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!tia", name = "Cg", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!tia", name = "Sg", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!tia", name = "eh", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!tia", name = "Mg", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!tia", name = "mh", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!tia", name = "di", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!tia", name = "ji", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!tia", name = "Gh", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!tia", name = "Ch", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!tia", name = "Rh", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!tia", name = "Jh", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!tia", name = "ri", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!tia", name = "Kh", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!tia", name = "ci", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!tia", name = "ii", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!tia", name = "fi", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!tia", name = "Pg", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!tia", name = "Dh", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!tia", name = "ti", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!tia", name = "Pi", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!tia", name = "jh", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!tia", name = "Gg", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!tia", name = "ei", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!tia", name = "Vh", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!tia", name = "Yg", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!tia", name = "Jg", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!tia", name = "oh", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!tia", name = "Mh", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!tia", name = "yi", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!tia", name = "Og", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!tia", name = "oi", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!tia", name = "zh", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!tia", name = "ni", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!tia", name = "gh", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!tia", name = "Hg", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!tia", name = "pi", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!tia", name = "Ig", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!tia", name = "Wh", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!tia", name = "Fh", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!tia", name = "bi", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!tia", name = "Wg", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!tia", name = "li", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!tia", name = "wi", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!tia", name = "mi", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!tia", name = "Ai", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!tia", name = "Vg", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!tia", name = "Xg", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!tia", name = "vh", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!tia", name = "Ih", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!tia", name = "ih", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!tia", name = "Lh", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!tia", name = "Bg", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!tia", name = "ki", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!tia", name = "Nh", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!tia", name = "Hi", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!tia", name = "Eh", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!tia", name = "Ph", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!tia", name = "Xh", descriptor = "I")
    private int field4540;

    @OriginalMember(owner = "client!tia", name = "Li", descriptor = "J")
    private long field4535;

    @OriginalMember(owner = "client!tia", name = "Th", descriptor = "Z")
    private boolean field4538;

    @OriginalMember(owner = "client!tia", name = "Gi", descriptor = "Z")
    private boolean field4539;

    @OriginalMember(owner = "client!tia", name = "Ni", descriptor = "Z")
    private boolean field4541;

    @OriginalMember(owner = "client!tia", name = "Ki", descriptor = "Z")
    private boolean field4542;

    @OriginalMember(owner = "client!tia", name = "si", descriptor = "Z")
    private boolean field4543;

    @OriginalMember(owner = "client!tia", name = "v", descriptor = "()V", line = 3)
    public final void method233() {
        try {
            OpenGL.glFinish();
            ++field4503;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[9] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "k", descriptor = "(Z)V", line = 12)
    public final void method1065(boolean arg0) {
        try {
            class348.field5643[2] = super.field4189 * super.field4139;
            class348.field5643[3] = 1.0F;
            class348.field5643[0] = super.field4180 * super.field4139;
            ++field4451;
            class348.field5643[1] = super.field4196 * super.field4139;
            OpenGL.glLightfv(16384, 4609, class348.field5643, 0);
            class348.field5643[3] = 1.0F;
            class348.field5643[2] = -super.field4163 * super.field4189;
            class348.field5643[0] = -super.field4163 * super.field4180;
            class348.field5643[1] = -super.field4163 * super.field4196;
            OpenGL.glLightfv(16385, 4609, class348.field5643, 0);
            if (!arg0) {
                this.method225();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[103] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "(B)V", line = 34)
    public final void method1028(byte arg0) {
        try {
            OpenGL.glLightfv(16384, 4611, super.field4185, 0);
            ++field4462;
            if (arg0 <= -71) {
                OpenGL.glLightfv(16385, 4611, super.field4169, 0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[68] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "F", descriptor = "(II)V", line = 46)
    public final void method161(int arg0, int arg1) {
        try {
            ++field4486;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[67] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZZ)Lfk;", line = 53)
    public final class682 method1030(boolean arg0, boolean arg1) {
        try {
            if (arg1) {
                this.field4542 = true;
            }
            ++field4517;
            return new class710(this, arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lfk;II)V", line = 64)
    public final void method1036(class682 arg0, int arg1, int arg2) {
        try {
            if (arg2 == 2) {
                ++field4480;
                this.field4536[arg1] = (class710) arg0;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4557[80] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;", line = 75)
    public final Object method1031(byte arg0, Canvas arg1) {
        try {
            ++field4460;
            if (arg0 != -97) {
                return null;
            } else {
                long var3 = this.field4485.prepareSurface(arg1);
                if (var3 == -1L) {
                    throw new RuntimeException();
                } else {
                    return new Long(var3);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[16] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIIILua;[FIZ)Lah;", line = 96)
    public final class406 method1062(int arg0, int arg1, int arg2, int arg3, class696 arg4, float[] arg5, int arg6, boolean arg7) {
        try {
            ++field4496;
            if (arg1 != 0) {
                return null;
            } else if (!this.field4553 && (!class46.method469(arg0, 1010) || !class46.method469(arg3, 1010))) {
                if (!this.field4546) {
                    class522 var9 = new class522(this, arg4, class544.field8008, class90.method883((byte) 73, arg0), class90.method883((byte) 87, arg3));
                    var9.method3905(arg6, arg2, -16749, arg3, arg0, 0, 0, arg5, arg4);
                    return var9;
                } else {
                    return new class389(this, arg4, arg0, arg3, arg5, arg2, arg6);
                }
            } else {
                return new class522(this, arg4, arg0, arg3, arg7, arg5, arg2, arg6);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field4557[43] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4557[2] : field4557[1]) + ',' + (arg5 != null ? field4557[2] : field4557[1]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLgaa;)V", line = 124)
    public final void method1042(byte arg0, class313 arg1) {
        try {
            ++field4531;
            class482[] var3 = ((class465) arg1).field7138;
            int var4 = 0;
            boolean var5 = false;
            if (arg0 != 123) {
                this.method2386(82);
            }
            boolean var6 = false;
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
                class482 var9 = var3[var8];
                class710 var10 = this.field4536[var8];
                int var11 = 0;
                int var12 = var10.method5157(true);
                long var13 = var10.method979((byte) 92);
                var10.method974((byte) -124);
                for (int var15 = 0; ~var9.method3676(15) < ~var15; ++var15) {
                    class771 var16 = var9.method3677(var15, -25596);
                    if (class771.field11297 == var16) {
                        OpenGL.glVertexPointer(3, 5126, var12, (long) var11 + var13);
                        var7 = true;
                    } else if (class771.field11298 == var16) {
                        OpenGL.glNormalPointer(5126, var12, (long) var11 + var13);
                        var6 = true;
                    } else if (class771.field11300 != var16) {
                        if (class771.field11303 == var16) {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(1, 5126, var12, var13 - -((long) var11));
                        } else if (class771.field11304 == var16) {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(2, 5126, var12, (long) var11 + var13);
                        } else if (class771.field11305 != var16) {
                            if (class771.field11306 == var16) {
                                OpenGL.glClientActiveTexture(33984 - -(var4++));
                                OpenGL.glTexCoordPointer(4, 5126, var12, var13 - -((long) var11));
                            }
                        } else {
                            OpenGL.glClientActiveTexture(33984 + var4++);
                            OpenGL.glTexCoordPointer(3, 5126, var12, var13 - -((long) var11));
                        }
                    } else {
                        var5 = true;
                        OpenGL.glColorPointer(4, 5121, var12, (long) var11 + var13);
                    }
                    var11 += var16.field11294;
                }
            }
            if (var7 == !this.field4541) {
                if (!var7) {
                    OpenGL.glDisableClientState(32884);
                } else {
                    OpenGL.glEnableClientState(32884);
                }
                this.field4541 = var7;
            }
            if (!this.field4539 != !var6) {
                if (!var6) {
                    OpenGL.glDisableClientState(32885);
                } else {
                    OpenGL.glEnableClientState(32885);
                }
                this.field4539 = var6;
            }
            if (!var5 == this.field4543) {
                if (var5) {
                    OpenGL.glEnableClientState(32886);
                } else {
                    OpenGL.glDisableClientState(32886);
                }
                this.field4543 = var5;
            }
            if (this.field4540 >= var4) {
                if (var4 < this.field4540) {
                    for (int var17 = var4; ~this.field4540 < ~var17; ++var17) {
                        OpenGL.glClientActiveTexture(var17 + 33984);
                        OpenGL.glDisableClientState(32888);
                    }
                    this.field4540 = var4;
                    return;
                }
            } else {
                for (int var18 = this.field4540; ~var4 < ~var18; ++var18) {
                    OpenGL.glClientActiveTexture(var18 + 33984);
                    OpenGL.glEnableClientState(32888);
                }
                this.field4540 = var4;
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field4557[71] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "GA", descriptor = "(I)V", line = 286)
    public final void method182(int arg0) {
        try {
            ++field4500;
            OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
            OpenGL.glClear(16384);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "(II)V", line = 298)
    public final void method171(int arg0, int arg1) throws class146 {
        try {
            this.field4485.swapBuffers();
            ++field4461;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[53] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "u", descriptor = "(I)V", line = 308)
    public final void method1069(int arg0) {
        try {
            if (arg0 != 262144) {
                this.field4556 = true;
            }
            this.field4542 = false;
            ++field4475;
            this.method2386(0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[102] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "(Z)V", line = 320)
    public final void method178(boolean arg0) {
        try {
            ++field4523;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[76] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "t", descriptor = "()V", line = 328)
    public final void method202() {
        try {
            ++field4520;
            super.method202();
            if (this.field4485 != null) {
                this.field4485.method4763();
                this.field4485.release();
                this.field4485 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[50] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLua;Ldn;)Z", line = 350)
    public final boolean method1034(byte arg0, class696 arg1, class544 arg2) {
        try {
            int var4 = -106 / ((4 - arg0) / 44);
            ++field4444;
            return true;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[106] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + (arg2 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "()Z", line = 362)
    public final boolean method167() {
        try {
            ++field4490;
            return false;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[46] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "h", descriptor = "(B)V", line = 370)
    public final void method1053(byte arg0) {
        try {
            ++field4471;
            if (arg0 != -78) {
                this.field4541 = false;
            }
            this.method2386(arg0 + 78);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[48] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "(I)V", line = 382)
    public final void method1086(int arg0) {
        try {
            ++field4505;
            super.field4155 = (float) (-super.field4232 + super.field4151);
            super.field4186 = super.field4155 - (float) super.field4205;
            if ((float) super.field4158 > super.field4186) {
                super.field4186 = (float) super.field4158;
            }
            OpenGL.glFogf(2915, super.field4186);
            OpenGL.glFogf(2916, super.field4155);
            class348.field5643[0] = (float) class292.method2485(16711680, super.field4170) / 1.671168E7F;
            int var2 = 12 / ((23 - arg0) / 47);
            class348.field5643[1] = (float) class292.method2485(65280, super.field4170) / 65280.0F;
            class348.field5643[2] = (float) class292.method2485(255, super.field4170) / 255.0F;
            OpenGL.glFogfv(2918, class348.field5643, 0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[93] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "()V", line = 409)
    public final void method222() {
        try {
            ++field4482;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[104] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "U", descriptor = "(I)V", line = 417)
    public final void method1045(int arg0) {
        try {
            this.method2239(-19527);
            ++field4473;
            int var2;
            for (var2 = 0; var2 < super.field4227; ++var2) {
                class731 var3 = super.field4174[var2];
                int var4 = var3.method5294(true);
                int var5 = 16386 - -var2;
                float var6 = var3.method5299(31541) / 255.0F;
                class348.field5643[0] = (float) var3.method5300(32);
                class348.field5643[1] = (float) var3.method5297(false);
                class348.field5643[2] = (float) var3.method5298(-4);
                class348.field5643[3] = 1.0F;
                OpenGL.glLightfv(var5, 4611, class348.field5643, 0);
                class348.field5643[0] = var6 * (float) (class292.method2485(var4, 16768857) >> 16);
                class348.field5643[1] = var6 * (float) class292.method2485(var4 >> 8, 255);
                class348.field5643[3] = 1.0F;
                class348.field5643[2] = var6 * (float) class292.method2485(var4, 255);
                OpenGL.glLightfv(var5, 4609, class348.field5643, 0);
                OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method5295(32) * var3.method5295(32)));
                OpenGL.glEnable(var5);
            }
            if (arg0 < 50) {
                this.field4550 = true;
            }
            while (~var2 > ~super.field4143) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            super.method1045(95);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4557[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "t", descriptor = "(B)V", line = 465)
    public final void method1027(byte arg0) {
        try {
            OpenGL.glTexEnvi(8960, 34161, class272.method2343(super.field4193[super.field4181], arg0 + 94));
            if (arg0 != 29) {
                this.field4543 = false;
            }
            ++field4513;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[92] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(B[[IZI)Loda;", line = 476)
    public final class125 method1049(byte arg0, int[][] arg1, boolean arg2, int arg3) {
        try {
            if (arg0 >= -62) {
                return null;
            } else {
                ++field4529;
                return new class198(this, arg3, arg2, arg1);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[45] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "(I)V", line = 487)
    public final void method1071(int arg0) {
        try {
            ++field4488;
            if (arg0 != 1) {
                this.method1074(false);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[47] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "Q", descriptor = "(I)V", line = 500)
    public final void method1063(int arg0) {
        try {
            OpenGL.glMatrixMode(5890);
            ++field4493;
            if (super.field4172[super.field4181] == class452.field6989) {
                OpenGL.glLoadIdentity();
            } else {
                OpenGL.glLoadMatrixf(super.field4226[super.field4181].method4495(-17, class741.field10915), 0);
            }
            OpenGL.glMatrixMode(5888);
            if (arg0 <= 112) {
                this.method202();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[101] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "()V", line = 519)
    public final void method215() {
        try {
            ++field4491;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[73] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "(B)F", line = 531)
    public final float method1056(byte arg0) {
        try {
            if (arg0 != -13) {
                this.method1092(120);
            }
            ++field4477;
            return 0.0F;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[84] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V", line = 542)
    public final void method1090(Canvas arg0, Object arg1, byte arg2) {
        try {
            ++field4463;
            if (arg2 != -34) {
                this.method1050((class126) null, 103, 120, 109);
            }
            Long var4 = (Long) arg1;
            if (!this.field4485.setSurface(var4)) {
                throw new RuntimeException();
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[74] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZJ)V", line = 560)
    public final synchronized void method2380(boolean arg0, long arg1) {
        try {
            ++field4437;
            if (!arg0) {
                this.method1056((byte) 39);
            }
            class568 var4 = new class568();
            var4.field8252 = arg1;
            this.field4534.method3220(var4, 0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[90] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "u", descriptor = "()V", line = 574)
    public final void method216() {
        try {
            ++field4498;
            if (super.field4015 > 0 || ~super.field3947 < -1) {
                int var1 = super.field4217;
                int var2 = super.field4201;
                int var3 = super.field4188;
                int var4 = super.field4203;
                this.method227();
                OpenGL.glReadBuffer(1028);
                OpenGL.glDrawBuffer(1029);
                this.method2222(false);
                this.method2209(false, -32);
                this.method2241((byte) -30, false);
                this.method2250(false, (byte) -89);
                this.method2230((byte) 89, false);
                this.method2233((byte) -109, (class399) null);
                this.method2263(false, -2, (byte) 93, false);
                this.method2258(1, (byte) -115);
                this.method2254(0, 79);
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                OpenGL.glRasterPos2i(0, 0);
                OpenGL.glCopyPixels(0, 0, super.field4015, super.field3947, 6144);
                OpenGL.glFlush();
                OpenGL.glReadBuffer(1029);
                OpenGL.glDrawBuffer(1029);
                this.method221(var1, var3, var2, var4);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[89] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "(B)Lsg;", line = 617)
    public static final class420 method2381(byte arg0) {
        try {
            if (arg0 > -92) {
                method2385(-3);
            }
            ++field4524;
            if (class770.field11260 != null && class358.field5764 != null) {
                class358.field5764.method4200(class770.field11260, (byte) 109);
                class420 var1 = (class420) class358.field5764.method4203((byte) 110);
                if (var1 == null) {
                    return null;
                } else {
                    class209 var2 = class770.field11257.method2325(-2, var1.field6636);
                    return var2 != null && var2.field3270 && var2.method1884(class770.field11252, false) ? var1 : class295.method2546(-1);
                }
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[105] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "(Z)V", line = 643)
    public final void method1037(boolean arg0) {
        try {
            if (arg0) {
                this.method216();
            }
            ++field4484;
            if (!super.field4262) {
                OpenGL.glDisable(3089);
            } else {
                OpenGL.glEnable(3089);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[88] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II[BIZLua;II)Lah;", line = 659)
    public final class406 method1043(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, class696 arg5, int arg6, int arg7) {
        try {
            if (arg6 != -27137) {
                return null;
            } else {
                ++field4456;
                if (this.field4553 || class46.method469(arg7, 1010) && class46.method469(arg1, 1010)) {
                    return new class522(this, arg5, arg7, arg1, arg4, arg2, arg3, arg0);
                } else if (!this.field4546) {
                    class522 var9 = new class522(this, arg5, class544.field8004, class90.method883((byte) 86, arg7), class90.method883((byte) 49, arg1));
                    var9.method3171(arg3, arg1, arg0, arg5, arg6 + 55126, 0, arg2, arg7, 0);
                    return var9;
                } else {
                    return new class389(this, arg5, arg7, arg1, arg2, arg3, arg0);
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field4557[87] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4557[2] : field4557[1]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4557[2] : field4557[1]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "(B)V", line = 689)
    public final void method1059(byte arg0) {
        try {
            if (!super.field4165) {
                OpenGL.glDisable(16384);
                OpenGL.glDisable(16385);
            } else {
                OpenGL.glEnable(16384);
                OpenGL.glEnable(16385);
            }
            int var2 = 79 / ((arg0 - 60) / 41);
            ++field4449;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "I", descriptor = "()I", line = 709)
    public final int method154() {
        try {
            ++field4465;
            return this.field4551;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[17] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 717)
    public final void method1044(byte arg0, Canvas arg1, Object arg2) {
        try {
            ++field4445;
            if (arg0 > -114) {
                this.field4546 = false;
            }
            Long var4 = (Long) arg2;
            this.field4485.releaseSurface(arg1, var4);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[3] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + (arg2 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IZLega;B)V", line = 730)
    public final void method1046(int arg0, boolean arg1, class742 arg2, byte arg3) {
        try {
            int var5 = 18 / ((-72 - arg3) / 40);
            OpenGL.glTexEnvi(8960, arg0 + 34184, class548.method4073((byte) -112, arg2));
            ++field4506;
            OpenGL.glTexEnvi(8960, arg0 + 34200, arg1 ? 771 : 770);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4557[86] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4557[2] : field4557[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZLega;ZII)V", line = 742)
    public final void method1067(boolean arg0, class742 arg1, boolean arg2, int arg3, int arg4) {
        try {
            ++field4512;
            OpenGL.glTexEnvi(8960, arg4 + 34176, class548.method4073((byte) -99, arg1));
            if (arg0) {
                OpenGL.glTexEnvi(8960, arg4 + 34192, !arg2 ? 770 : 771);
            } else {
                OpenGL.glTexEnvi(8960, arg4 + 34192, !arg2 ? 768 : 769);
            }
            if (arg3 >= -89) {
                this.field4530 = null;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4557[64] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "eb", descriptor = "(I)V", line = 758)
    public static void method2382(int arg0) {
        try {
            field4470 = null;
            if (arg0 != 27748) {
                method2384(25, (byte) 53, -30, -28, 55, -15, 87, 16);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[61] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "m", descriptor = "(II)I", line = 769)
    public static final int method2383(int arg0, int arg1) {
        try {
            ++field4457;
            int var4 = (1431655765 & arg1 >>> 1) + (1431655765 & arg1);
            int var5 = (var4 >>> 2 & 858993459) + (var4 & arg0);
            int var6 = (var5 >>> 4) + var5 & 252645135;
            int var7 = (var6 >>> 8) + var6;
            int var8 = (var7 >>> 16) + var7;
            return 255 & var8;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[109] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lgda;I)V", line = 782)
    public class278(OpenGL arg0, Canvas arg1, long arg2, class158 arg3, class58 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            try {
                this.field4485 = arg0;
                this.field4485.method4762();
                this.field4552 = OpenGL.glGetString(7936).toLowerCase();
                this.field4555 = OpenGL.glGetString(7937).toLowerCase();
                if (~this.field4552.indexOf(field4557[29]) == 0 && this.field4552.indexOf(field4557[34]) == -1 && ~this.field4552.indexOf(field4557[28]) == 0) {
                    String var8 = OpenGL.glGetString(7938);
                    String[] var9 = class444.method3476(' ', 11206, var8.replace('.', ' '));
                    if (var9.length < 2) {
                        throw new RuntimeException("");
                    } else {
                        try {
                            int var10 = class441.method3457(true, var9[0]);
                            int var11 = class441.method3457(true, var9[1]);
                            this.field4548 = var10 * 10 + var11;
                        } catch (NumberFormatException var23) {
                            throw new RuntimeException("");
                        }
                        if (this.field4548 < 12) {
                            throw new RuntimeException("");
                        } else if (!this.field4485.method4761(field4557[25])) {
                            throw new RuntimeException("");
                        } else if (!this.field4485.method4761(field4557[24])) {
                            throw new RuntimeException("");
                        } else {
                            int[] var12 = new int[1];
                            OpenGL.glGetIntegerv(34018, var12, 0);
                            super.field4200 = var12[0];
                            if (~super.field4200 > -3) {
                                throw new RuntimeException("");
                            } else {
                                super.field4178 = 8;
                                this.field4550 = this.field4485.method4761(field4557[33]);
                                super.field4207 = this.field4485.method4761(field4557[41]);
                                this.field4546 = this.field4485.method4761(field4557[40]);
                                super.field4142 = this.field4485.method4761(field4557[31]);
                                this.field4553 = this.field4485.method4761(field4557[23]);
                                super.field4140 = this.field4485.method4761(field4557[37]);
                                this.field4556 = this.field4485.method4761(field4557[36]);
                                this.field4554 = this.field4485.method4761(field4557[35]);
                                this.field4547 = this.field4485.method4761(field4557[38]);
                                this.field4485.method4761(field4557[39]);
                                this.field4545 = new int[super.field4200];
                                this.field4549 = !Stream.method5108() ? 5121 : 33639;
                                if (~this.field4555.indexOf(field4557[27]) != 0) {
                                    int var13 = 0;
                                    boolean var14 = false;
                                    boolean var15 = false;
                                    String[] var16 = class444.method3476(' ', 11206, this.field4555.replace('/', ' '));
                                    for (int var17 = 0; var17 < var16.length; ++var17) {
                                        String var18 = var16[var17];
                                        try {
                                            if (~var18.length() < -1) {
                                                if (~var18.charAt(0) == -121 && var18.length() >= 3 && class30.method316(10, var18.substring(1, 3))) {
                                                    var18 = var18.substring(1);
                                                    var15 = true;
                                                }
                                                if (var18.equals(field4557[26])) {
                                                    var14 = true;
                                                } else {
                                                    if (var18.startsWith(field4557[26])) {
                                                        var14 = true;
                                                        var18 = var18.substring(2);
                                                    }
                                                    if (~var18.length() <= -5 && class30.method316(10, var18.substring(0, 4))) {
                                                        var13 = class441.method3457(true, var18.substring(0, 4));
                                                        break;
                                                    }
                                                }
                                            }
                                        } catch (Exception var24) {
                                        }
                                    }
                                    if (!var15 && !var14) {
                                        if (~var13 <= -7001 && var13 <= 9250) {
                                            super.field4140 = false;
                                        }
                                        if (~var13 <= -7001 && ~var13 >= -8000) {
                                            this.field4550 = false;
                                        }
                                    }
                                    this.field4546 &= this.field4485.method4761(field4557[30]);
                                }
                                this.field4552.indexOf(field4557[22]);
                                if (this.field4550) {
                                    try {
                                        int[] var19 = new int[1];
                                        OpenGL.glGenBuffersARB(1, var19, 0);
                                    } catch (Throwable var22) {
                                        throw new RuntimeException("");
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw new RuntimeException("");
                }
            } catch (Throwable var25) {
                var25.printStackTrace();
                this.method668(-4369);
                throw new RuntimeException("");
            }
        } catch (RuntimeException var26) {
            throw class590.method4333(var26, field4557[32] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + arg2 + ',' + (arg3 != null ? field4557[2] : field4557[1]) + ',' + (arg4 != null ? field4557[2] : field4557[1]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "I", descriptor = "(I)V", line = 939)
    public final void method1060(int arg0) {
        try {
            for (int var2 = super.field4200 + -1; ~var2 <= -1; --var2) {
                OpenGL.glActiveTexture(33984 - -var2);
                OpenGL.glTexEnvi(8960, 8704, 34160);
                OpenGL.glTexEnvi(8960, 34161, 8448);
                OpenGL.glTexEnvi(8960, 34178, 34166);
                OpenGL.glTexEnvi(8960, 34162, 8448);
                OpenGL.glTexEnvi(8960, 34186, 34166);
            }
            ++field4454;
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
            int var4 = -60 % ((-77 - arg0) / 34);
            for (int var5 = 0; var5 < 8; ++var5) {
                int var6 = 16384 + var5;
                OpenGL.glLightfv(var6, 4608, var3, 0);
                OpenGL.glLightf(var6, 4615, 0.0F);
                OpenGL.glLightf(var6, 4616, 0.0F);
            }
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field4485.setSwapInterval(0);
            super.method1060(-125);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4557[78] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(BI)V", line = 995)
    public final void method1083(byte arg0, int arg1) {
        try {
            ++field4446;
            if (arg0 != -1) {
                this.method1086(-52);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[21] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIZI[III)Lah;", line = 1005)
    public final class406 method1088(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
        try {
            if (arg5 != 3982) {
                this.method1077(-101, true);
            }
            ++field4474;
            if (this.field4553 || class46.method469(arg6, 1010) && class46.method469(arg1, 1010)) {
                return new class522(this, arg6, arg1, arg2, arg4, arg0, arg3);
            } else if (!this.field4546) {
                class522 var8 = new class522(this, class313.field5120, class544.field8004, class90.method883((byte) 114, arg6), class90.method883((byte) 65, arg1));
                var8.method3169(0, arg0, arg1, arg4, arg3, (byte) 119, arg6, 0);
                return var8;
            } else {
                return new class389(this, arg6, arg1, arg4, arg0, arg3);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field4557[72] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4557[2] : field4557[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "(I)V", line = 1033)
    public final void method1082(int arg0) {
        try {
            if (arg0 != 1) {
                method2381((byte) -10);
            }
            OpenGL.glActiveTexture(33984 - -super.field4181);
            ++field4467;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[58] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "n", descriptor = "(B)V", line = 1049)
    public final void method1072(byte arg0) {
        try {
            class348.field5643[0] = (float) class292.method2485(super.field4238, 16711680) / 1.671168E7F;
            class348.field5643[3] = (float) (super.field4238 >>> 24) / 255.0F;
            ++field4458;
            class348.field5643[2] = (float) class292.method2485(255, super.field4238) / 255.0F;
            class348.field5643[1] = (float) class292.method2485(65280, super.field4238) / 65280.0F;
            if (arg0 > -115) {
                this.field4543 = false;
            }
            OpenGL.glTexEnvfv(8960, 8705, class348.field5643, 0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[98] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lsia;)V", line = 1064)
    public final void method248(class769 arg0) {
        try {
            ++field4495;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[6] + (arg0 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lel;Ltq;)Lsia;", line = 1071)
    public final class769 method217(class575 arg0, class657 arg1) {
        try {
            ++field4441;
            return null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[15] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IBIIIIII)V", line = 1079)
    public static final void method2384(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            ++field4481;
            int var8 = 0;
            if (arg1 < -85) {
                int var9 = arg2;
                int var10 = 0;
                int var11 = -arg6 + arg7;
                int var12 = -arg6 + arg2;
                int var13 = arg7 * arg7;
                int var14 = arg2 * arg2;
                int var15 = var11 * var11;
                int var16 = var12 * var12;
                int var17 = var14 << 1;
                int var18 = var13 << 1;
                int var19 = var16 << 1;
                int var20 = var15 << 1;
                int var21 = arg2 << 1;
                int var22 = var12 << 1;
                int var23 = (-var21 + 1) * var13 - -var17;
                int var24 = -((var21 + -1) * var18) + var14;
                int var25 = (1 - var22) * var15 + var19;
                int var26 = var16 - (var22 + -1) * var20;
                int var27 = var13 << 2;
                int var28 = var14 << 2;
                int var29 = var15 << 2;
                int var30 = var16 << 2;
                int var31 = var17 * 3;
                int var32 = (var21 - 3) * var18;
                int var33 = var19 * 3;
                int var34 = (var22 - 3) * var20;
                int var35 = var28;
                int var36 = (arg2 + -1) * var27;
                int var37 = var30;
                int var38 = (var12 + -1) * var29;
                if (~arg0 <= ~class310.field5088 && ~arg0 >= ~class478.field7264) {
                    int[] var39 = class193.field3047[arg0];
                    int var40 = class694.method5039(class779.field11374, class546.field8030, 0, arg5 - arg7);
                    int var41 = class694.method5039(class779.field11374, class546.field8030, 0, arg5 + arg7);
                    int var42 = class694.method5039(class779.field11374, class546.field8030, 0, arg5 - var11);
                    int var43 = class694.method5039(class779.field11374, class546.field8030, 0, arg5 + var11);
                    class545.method4051(var40, arg3, var42, var39, -114);
                    class545.method4051(var42, arg4, var43, var39, -127);
                    class545.method4051(var43, arg3, var41, var39, -111);
                }
                while (var9 > 0) {
                    boolean var44 = ~var12 <= ~var9;
                    if (var44) {
                        if (var25 < 0) {
                            while (var25 < 0) {
                                var25 += var33;
                                var26 += var37;
                                var37 += var30;
                                ++var10;
                                var33 += var30;
                            }
                        }
                        if (var26 < 0) {
                            var25 += var33;
                            var26 += var37;
                            ++var10;
                            var37 += var30;
                            var33 += var30;
                        }
                        var26 += -var34;
                        var25 += -var38;
                        var34 -= var29;
                        var38 -= var29;
                    }
                    if (~var23 > -1) {
                        while (var23 < 0) {
                            var24 += var35;
                            var23 += var31;
                            var35 += var28;
                            ++var8;
                            var31 += var28;
                        }
                    }
                    if (~var24 > -1) {
                        var23 += var31;
                        var24 += var35;
                        var31 += var28;
                        ++var8;
                        var35 += var28;
                    }
                    var24 += -var32;
                    var23 += -var36;
                    --var9;
                    var32 -= var27;
                    var36 -= var27;
                    int var45 = arg0 - var9;
                    int var46 = arg0 + var9;
                    if (~class310.field5088 >= ~var46 && ~var45 >= ~class478.field7264) {
                        int var47 = class694.method5039(class779.field11374, class546.field8030, 0, arg5 - -var8);
                        int var48 = class694.method5039(class779.field11374, class546.field8030, 0, -var8 + arg5);
                        if (var44) {
                            int var49 = class694.method5039(class779.field11374, class546.field8030, 0, arg5 + var10);
                            int var50 = class694.method5039(class779.field11374, class546.field8030, 0, -var10 + arg5);
                            if (~var45 <= ~class310.field5088) {
                                int[] var51 = class193.field3047[var45];
                                class545.method4051(var48, arg3, var50, var51, -117);
                                class545.method4051(var50, arg4, var49, var51, -107);
                                class545.method4051(var49, arg3, var47, var51, -107);
                            }
                            if (class478.field7264 >= var46) {
                                int[] var52 = class193.field3047[var46];
                                class545.method4051(var48, arg3, var50, var52, -106);
                                class545.method4051(var50, arg4, var49, var52, -127);
                                class545.method4051(var49, arg3, var47, var52, -108);
                            }
                        } else {
                            if (var45 >= class310.field5088) {
                                class545.method4051(var48, arg3, var47, class193.field3047[var45], -107);
                            }
                            if (class478.field7264 >= var46) {
                                class545.method4051(var48, arg3, var47, class193.field3047[var46], -113);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var54) {
            throw class590.method4333(var54, field4557[77] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1285)
    public final void method1079(int arg0, Canvas arg1, Object arg2) {
        try {
            ++field4476;
            if (arg0 != 4) {
                this.field4489 = null;
            }
            Long var4 = (Long) arg2;
            this.field4485.surfaceResized(var4);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[81] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + (arg2 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1298)
    public final void method256(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class146 {
        try {
            this.method171(arg2, arg3);
            ++field4516;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[18] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "([BIILua;BI)Lfd;", line = 1308)
    public final class555 method1080(byte[] arg0, int arg1, int arg2, class696 arg3, byte arg4, int arg5) {
        try {
            if (arg4 <= 86) {
                this.method167();
            }
            ++field4514;
            return new class458(this, arg3, arg5, arg1, arg2, arg0);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4557[111] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4557[2] : field4557[1]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "db", descriptor = "(I)I", line = 1319)
    public static final int method2385(int arg0) {
        try {
            ++field4440;
            int var1 = class492.field7416.method4937(arg0 ^ -2426);
            if (arg0 != -2334) {
                field4470 = null;
            }
            if (~var1 > ~(class594.field8589.length + -1)) {
                class492.field7416 = class594.field8589[var1 + 1];
            }
            return 100;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[96] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "cb", descriptor = "(I)V", line = 1337)
    private final void method2386(int arg0) {
        try {
            ++field4518;
            if (this.field4538) {
                OpenGL.glPopMatrix();
            }
            if (arg0 != 0) {
                this.field4550 = true;
            }
            if (super.field4176.method5583(13)) {
                if (!this.field4542) {
                    OpenGL.glLoadMatrixf(super.field4135.method4495(121, class741.field10915), 0);
                    this.field4542 = true;
                    this.method1028((byte) -126);
                    this.method1045(arg0 ^ 117);
                }
                if (!super.field4124) {
                    OpenGL.glPushMatrix();
                    OpenGL.glMultMatrixf(super.field4131.method4495(arg0 + -14, class741.field10915), 0);
                    this.field4538 = true;
                } else {
                    this.field4538 = false;
                }
            } else if (!super.field4124) {
                OpenGL.glLoadMatrixf(super.field4131.method4495(-44, class741.field10915), 0);
                this.field4538 = false;
            } else {
                OpenGL.glLoadIdentity();
                this.field4538 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIII)V", line = 1392)
    public final void method164(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4453;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[83] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(FFF)V", line = 1399)
    public final void method159(float arg0, float arg1, float arg2) {
        try {
            ++field4450;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4557[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "w", descriptor = "(B)V", line = 1406)
    public final void method1032(byte arg0) {
        try {
            ++field4478;
            if (arg0 > 114) {
                if (super.field4166) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[94] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "u", descriptor = "(B)V", line = 1423)
    public final void method1041(byte arg0) {
        try {
            if (arg0 == -18) {
                ++field4494;
                if (class317.field5178 != super.field4230) {
                    if (class533.field7828 != super.field4230) {
                        if (class327.field5365 == super.field4230) {
                            OpenGL.glBlendFunc(774, 1);
                            return;
                        }
                    } else {
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glBlendFunc(770, 771);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[52] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "t", descriptor = "(I)V", line = 1447)
    public final void method1057(int arg0) {
        try {
            if (arg0 != 2) {
                this.field4543 = false;
            }
            ++field4447;
            OpenGL.glTexEnvi(8960, 34162, class272.method2343(super.field4206[super.field4181], 110));
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[44] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(III)V", line = 1458)
    public final synchronized void method2387(int arg0, int arg1, int arg2) {
        try {
            ++field4509;
            class272 var4 = new class272(arg2);
            var4.field8252 = (long) arg0;
            this.field4525.method3220(var4, 0);
            if (arg1 > -3) {
                this.field4525 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[82] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lel;", line = 1472)
    public final class575 method209(int arg0, int arg1) {
        try {
            ++field4466;
            return null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[95] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "(I)V", line = 1480)
    public final synchronized void method260(int arg0) {
        try {
            ++field4472;
            int var2 = 0;
            int var14 = arg0 & Integer.MAX_VALUE;
            while (!this.field4522.method3217((byte) -61)) {
                class272 var3 = (class272) this.field4522.method3219(-127);
                class493.field7418[var2++] = (int) var3.field8252;
                super.field4132 -= var3.field4377;
                if (var2 == 1000) {
                    OpenGL.glDeleteBuffersARB(var2, class493.field7418, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteBuffersARB(var2, class493.field7418, 0);
                var2 = 0;
            }
            while (!this.field4525.method3217((byte) 59)) {
                class272 var4 = (class272) this.field4525.method3219(-127);
                class493.field7418[var2++] = (int) var4.field8252;
                super.field4123 -= var4.field4377;
                if (~var2 == -1001) {
                    OpenGL.glDeleteTextures(var2, class493.field7418, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteTextures(var2, class493.field7418, 0);
                var2 = 0;
            }
            while (!this.field4530.method3217((byte) -58)) {
                class272 var5 = (class272) this.field4530.method3219(-77);
                class493.field7418[var2++] = var5.field4377;
                if (~var2 == -1001) {
                    OpenGL.glDeleteFramebuffersEXT(var2, class493.field7418, 0);
                    var2 = 0;
                }
            }
            if (var2 > 0) {
                OpenGL.glDeleteFramebuffersEXT(var2, class493.field7418, 0);
                var2 = 0;
            }
            while (!this.field4532.method3217((byte) 114)) {
                class272 var6 = (class272) this.field4532.method3219(-82);
                class493.field7418[var2++] = (int) var6.field8252;
                super.field4127 -= var6.field4377;
                if (var2 == 1000) {
                    OpenGL.glDeleteRenderbuffersEXT(var2, class493.field7418, 0);
                    var2 = 0;
                }
            }
            if (~var2 < -1) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class493.field7418, 0);
                boolean var7 = false;
            }
            while (!this.field4489.method3217((byte) 126)) {
                class272 var8 = (class272) this.field4489.method3219(-48);
                OpenGL.glDeleteLists((int) var8.field8252, var8.field4377);
            }
            while (!this.field4533.method3217((byte) -74)) {
                class568 var9 = this.field4533.method3219(-42);
                OpenGL.glDeleteProgramARB((int) var9.field8252);
            }
            while (!this.field4534.method3217((byte) -86)) {
                class568 var10 = this.field4534.method3219(-93);
                OpenGL.glDeleteObjectARB(var10.field8252);
            }
            while (!this.field4489.method3217((byte) -99)) {
                class272 var11 = (class272) this.field4489.method3219(-44);
                OpenGL.glDeleteLists((int) var11.field8252, var11.field4377);
            }
            if (~this.method187() < -100663297 && this.field4535 + 60000L < class712.method5167(-2334)) {
                System.gc();
                this.field4535 = class712.method5167(-2334);
            }
            super.method260(var14);
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field4557[66] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIBILjj;Llp;I)V", line = 1642)
    public final void method1064(int arg0, int arg1, byte arg2, int arg3, class126 arg4, class414 arg5, int arg6) {
        try {
            ++field4510;
            int var8;
            byte var9;
            if (class451.field6976 != arg4) {
                if (class240.field3698 != arg4) {
                    if (class356.field5727 == arg4) {
                        var8 = arg6 * 3;
                        var9 = 4;
                    } else if (class376.field6098 == arg4) {
                        var8 = arg6 + 2;
                        var9 = 6;
                    } else if (class285.field4610 == arg4) {
                        var8 = arg6 + 2;
                        var9 = 5;
                    } else {
                        var8 = arg6;
                        var9 = 0;
                    }
                } else {
                    var8 = arg6 + 1;
                    var9 = 3;
                }
            } else {
                var9 = 1;
                var8 = arg6 * 2;
            }
            if (arg2 != -33) {
                this.field4556 = true;
            }
            class544 var10 = arg5.method3306((byte) -111);
            class685 var11 = (class685) arg5;
            var11.method974((byte) -127);
            OpenGL.glDrawElements(var9, var8, class580.method4254(true, var10), var11.method979((byte) 117) - -((long) (var10.field7999 * arg3)));
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field4557[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4557[2] : field4557[1]) + ',' + (arg5 != null ? field4557[2] : field4557[1]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "(II)V", line = 1699)
    public final synchronized void method2388(int arg0, int arg1) {
        try {
            int var3 = -27 / ((arg1 - 34) / 33);
            ++field4487;
            class568 var4 = new class568();
            var4.field8252 = (long) arg0;
            this.field4533.method3220(var4, 0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[70] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lfg;I)V", line = 1714)
    public final void method1089(class136 arg0, int arg1) {
        try {
            ++field4492;
            if (class207.field3238 != arg0) {
                int var3 = class721.method5236(arg0, (byte) -124);
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
            if (arg1 >= -58) {
                this.field4553 = false;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4557[108] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "h", descriptor = "(Z)V", line = 1743)
    public final void method1052(boolean arg0) {
        try {
            if (arg0) {
                this.field4532 = null;
            }
            ++field4528;
            OpenGL.glScissor(super.field4195 - -super.field4217, -super.field4203 + super.field4187 + super.field3947, -super.field4217 + super.field4201, -super.field4188 + super.field4203);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[65] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILdn;Lua;)Z", line = 1756)
    public final boolean method1058(int arg0, class544 arg1, class696 arg2) {
        try {
            ++field4479;
            if (arg0 != 6) {
                this.method217((class575) null, (class657) null);
            }
            return true;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4557[75] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + (arg2 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "v", descriptor = "(B)V", line = 1771)
    public final void method1039(byte arg0) {
        try {
            ++field4502;
            int var2 = this.field4545[super.field4181];
            int var3 = 83 % ((arg0 - -41) / 46);
            if (var2 != 0) {
                this.field4545[super.field4181] = 0;
                OpenGL.glBindTexture(var2, 0);
                OpenGL.glDisable(var2);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4557[113] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "y", descriptor = "(I)V", line = 1789)
    public final void method1091(int arg0) {
        try {
            class348.field5643[0] = super.field4192 * super.field4180;
            class348.field5643[3] = 1.0F;
            if (arg0 < -63) {
                class348.field5643[2] = super.field4192 * super.field4189;
                class348.field5643[1] = super.field4196 * super.field4192;
                ++field4497;
                OpenGL.glLightModelfv(2899, class348.field5643, 0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "V", descriptor = "(I)V", line = 1804)
    public final void method1040(int arg0) {
        try {
            if (super.field4194) {
                OpenGL.glEnable(3008);
            } else {
                OpenGL.glDisable(3008);
            }
            ++field4501;
            if (arg0 != 0) {
                this.field4545 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "ya", descriptor = "()V", line = 1821)
    public final void method196() {
        try {
            this.method2230((byte) 68, true);
            ++field4508;
            OpenGL.glClear(256);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[42] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IZ)Llp;", line = 1831)
    public final class414 method1077(int arg0, boolean arg1) {
        try {
            ++field4452;
            return arg0 != -7930 ? null : new class685(this, class544.field8005, arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[91] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "(II)Ltq;", line = 1842)
    public final class657 method223(int arg0, int arg1) {
        try {
            ++field4442;
            return null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[79] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "(II)Lqba;", line = 1854)
    public final class428 method1084(int arg0, int arg1) {
        try {
            ++field4469;
            if (arg0 > -18) {
                this.field4530 = null;
            }
            if (~arg1 != -4) {
                if (~arg1 != -5) {
                    return ~arg1 == -9 ? new class321(this, super.field4092, super.field4002) : super.method1084(-115, arg1);
                } else {
                    return new class530(this, super.field4092, super.field4002);
                }
            } else {
                return new class411(this, super.field4092);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4557[62] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Ljj;III)V", line = 1899)
    public final void method1050(class126 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4443;
            if (arg3 != 7645) {
                this.method154();
            }
            byte var5;
            int var6;
            if (class451.field6976 != arg0) {
                if (class240.field3698 == arg0) {
                    var5 = 3;
                    var6 = arg2 + 1;
                } else if (class356.field5727 != arg0) {
                    if (class376.field6098 == arg0) {
                        var5 = 6;
                        var6 = arg2 + 2;
                    } else if (class285.field4610 != arg0) {
                        var6 = arg2;
                        var5 = 0;
                    } else {
                        var5 = 5;
                        var6 = arg2 - -2;
                    }
                } else {
                    var5 = 4;
                    var6 = arg2 * 3;
                }
            } else {
                var6 = arg2 * 2;
                var5 = 1;
            }
            OpenGL.glDrawArrays(var5, arg1, var6);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4557[100] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Llia;Llia;FLlia;)Llia;", line = 1951)
    public final class505 method249(class505 arg0, class505 arg1, float arg2, class505 arg3) {
        try {
            ++field4511;
            return arg2 < 0.5F ? arg0 : arg1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[69] + (arg0 != null ? field4557[2] : field4557[1]) + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + arg2 + ',' + (arg3 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "K", descriptor = "(I)V", line = 1959)
    public final void method1081(int arg0) {
        try {
            OpenGL.glDepthMask(super.field4231 && super.field4218);
            if (arg0 > -75) {
                this.method2380(true, 39L);
            }
            ++field4527;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[60] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I[Lgt;)Lgaa;", line = 1971)
    public final class313 method1051(int arg0, class482[] arg1) {
        try {
            ++field4504;
            return arg0 != 14 ? null : new class465(arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[5] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "n", descriptor = "(Z)V", line = 1982)
    public final void method1074(boolean arg0) {
        try {
            if (!arg0) {
                this.field4554 = true;
            }
            if (super.field4237) {
                OpenGL.glEnable(3042);
            } else {
                OpenGL.glDisable(3042);
            }
            ++field4483;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[85] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "H", descriptor = "(I)V", line = 1998)
    public final void method1038(int arg0) {
        try {
            if (arg0 < 7) {
                this.field4552 = null;
            }
            ++field4438;
            if (super.field4141 && super.field4164 && ~super.field4205 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[110] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(ILdn;IILua;)Lah;", line = 2013)
    public final class406 method1048(int arg0, class544 arg1, int arg2, int arg3, class696 arg4) {
        try {
            ++field4499;
            if (arg3 < 1) {
                this.field4552 = null;
            }
            if (!this.field4553 && (!class46.method469(arg0, 1010) || !class46.method469(arg2, 1010))) {
                return !this.field4546 ? new class522(this, arg4, arg1, class90.method883((byte) 47, arg0), class90.method883((byte) 67, arg2)) : new class389(this, arg4, arg1, arg0, arg2);
            } else {
                return new class522(this, arg4, arg1, arg0, arg2);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4557[112] + arg0 + ',' + (arg1 != null ? field4557[2] : field4557[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4557[2] : field4557[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(ZB)V", line = 2039)
    public final void method1075(boolean arg0, byte arg1) {
        try {
            ++field4515;
            if (!arg0) {
                OpenGL.glDisable(32925);
            } else {
                OpenGL.glEnable(32925);
            }
            if (arg1 < 87) {
                this.field4545 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4557[99] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(III)V", line = 2055)
    public final synchronized void method2389(int arg0, int arg1, int arg2) {
        try {
            if (arg0 <= 113) {
                method2382(-113);
            }
            ++field4468;
            class272 var4 = new class272(arg2);
            var4.field8252 = (long) arg1;
            this.field4522.method3220(var4, 0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4557[97] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "m", descriptor = "()Lwaa;", line = 2070)
    public final class734 method240() {
        try {
            ++field4459;
            int var1 = -1;
            if (~this.field4552.indexOf(field4557[55]) != 0) {
                var1 = 4318;
            } else if (~this.field4552.indexOf(field4557[22]) != 0) {
                var1 = 32902;
            } else if (~this.field4552.indexOf(field4557[54]) != 0) {
                var1 = 4098;
            }
            return new class734(var1, field4557[57], this.field4548, this.field4555, 0L);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[56] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(IIIID)V", line = 2095)
    public final void method199(int arg0, int arg1, int arg2, int arg3, double arg4) {
        try {
            ++field4521;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4557[59] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "w", descriptor = "(I)V", line = 2104)
    public final void method1092(int arg0) {
        try {
            OpenGL.glMatrixMode(5889);
            ++field4464;
            if (arg0 != 11) {
                this.method1031((byte) 24, (Canvas) null);
            }
            OpenGL.glLoadMatrixf(super.field4167, 0);
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[107] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "x", descriptor = "()V", line = 2117)
    public final void method225() {
        try {
            ++field4519;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[11] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "na", descriptor = "(IIII)[I", line = 2125)
    public final int[] method207(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4455;
            int[] var5 = new int[arg2 * arg3];
            for (int var6 = 0; arg3 > var6; ++var6) {
                OpenGL.glReadPixelsi(arg0, -arg1 + super.field3947 + -var6 + -1, arg2, 1, 32993, this.field4549, var5, arg2 * var6);
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4557[49] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "L", descriptor = "(I)V", line = 2150)
    public final void method1029(int arg0) {
        try {
            OpenGL.glViewport(super.field4195, super.field4187, super.field4015, super.field3947);
            if (arg0 != 11321) {
                this.method1043(-73, 123, (byte[]) null, -3, true, (class696) null, -15, -104);
            }
            ++field4507;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "()Z", line = 2162)
    public final boolean method263() {
        try {
            ++field4526;
            return false;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4557[63] + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "(B)V", line = 2176)
    public final void method1087(byte arg0) {
        try {
            if (arg0 > -41) {
                this.method1060(-101);
            }
            if (super.field4146 && !super.field4147) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field4439;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4557[51] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2390(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 99);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2391(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
