import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class389 extends class401 {

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field5488 = 0;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "[F")
    public static float[] field5492 = new float[4];

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5508 = null;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "[I")
    public static int[] field5497 = new int[200];

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Llh;")
    public static class487 field5489 = new class487(58, 4);

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field5485;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public int field5493;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public int field5496;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public int field5501;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public int field5505;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public int field5509;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public int field5511;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public int field5513;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public int field5514;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public int field5515;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public int field5517;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lvp;")
    public class172 field5482;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lvp;")
    public class172 field5490;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lbu;")
    public class19 field5486;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lbu;")
    public class19 field5498;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Ljs;")
    public class301 field5504;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Lew;")
    public static class456 field5502;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lsf;")
    public class484 field5499;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lsf;")
    public class484 field5503;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lqh;")
    public class61 field5484;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "Lhb;")
    public class677 field5516;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Z")
    public boolean field5483;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Z")
    public boolean field5494;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Z")
    public boolean field5507;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "[I")
    public int[] field5506;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
    public static final void method2286(int arg0, int arg1, int arg2) {
        if (class570.field8101 == 1) {
            class624.method3467(arg2, arg0, 0, class43.field518);
        } else if (class570.field8101 == 2) {
            class285.method1753(arg0, arg2, -108);
        }
        if (arg1 < 106) {
            method2288(125);
        }
        field5500++;
        class570.field8101 = 0;
        class43.field518 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public final void method2287(int arg0) {
        field5510++;
        if (arg0 != -1536) {
            method2288(69);
        }
        int var2 = this.field5496;
        boolean var3 = this.field5483;
        if (this.field5504 != null) {
            class301 var6 = this.field5504.method1833(-116, class578.field8156);
            if (var6 == null) {
                this.field5509 = 0;
                this.field5515 = 256;
                this.field5493 = 0;
                this.field5505 = 0;
                this.field5496 = -1;
                this.field5494 = false;
                this.field5483 = false;
                this.field5517 = 0;
                this.field5506 = null;
                this.field5514 = 256;
            } else {
                this.field5517 = var6.field4160;
                this.field5505 = var6.field4106 << 9;
                this.field5496 = var6.field4148;
                this.field5509 = var6.field4116;
                this.field5506 = var6.field4126;
                this.field5514 = var6.field4183;
                this.field5493 = var6.field4111;
                this.field5515 = var6.field4174;
                this.field5494 = var6.field4172;
                this.field5483 = var6.field4146;
            }
        } else if (this.field5484 != null) {
            int var4 = class402.method2345(this.field5484, (byte) 114);
            if (var2 != var4) {
                this.field5496 = var4;
                class568 var5 = this.field5484.field674;
                if (var5.field8079 != null) {
                    var5 = var5.method3259((byte) 119, class578.field8156);
                }
                if (var5 == null) {
                    this.field5483 = this.field5484.field674.field8030;
                    this.field5514 = 256;
                    this.field5493 = this.field5505 = 0;
                    this.field5515 = 256;
                } else {
                    this.field5493 = var5.field8057;
                    this.field5505 = var5.field8037 << 9;
                    this.field5483 = var5.field8030;
                    this.field5515 = var5.field8012;
                    this.field5514 = var5.field8029;
                }
            }
        } else if (this.field5516 != null) {
            this.field5496 = class92.method669(this.field5516, 106);
            this.field5483 = this.field5516.field9664;
            this.field5493 = this.field5516.field9676;
            this.field5505 = this.field5516.field9683 << 9;
            this.field5515 = 256;
            this.field5514 = 256;
        }
        if (this.field5496 == var2 && var3 == this.field5483) {
            return;
        }
        if (this.field5499 == null) {
            return;
        }
        class61.field680.method1464(this.field5499);
        this.field5499 = null;
        this.field5490 = null;
        this.field5498 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method2288(int arg0) {
        if (arg0 > -108) {
            method2286(72, -122, -91);
        }
        field5502 = null;
        field5497 = null;
        field5508 = null;
        field5489 = null;
        field5492 = null;
    }
}
