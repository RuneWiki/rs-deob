import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class316 {

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "B")
    public byte field4264 = 0;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "S")
    public short field4258;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "S")
    public short field4260;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "B")
    public byte field4265;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "B")
    public byte field4250;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Z")
    public static boolean field4246 = false;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "B")
    public byte field4251;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "B")
    public byte field4261;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "B")
    public byte field4270;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "B")
    public byte field4272;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "Lqc;")
    public class226 field4268;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "Lqc;")
    public class226 field4269;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "Llk;")
    public class272 field4256;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "Lwo;")
    public static class285 field4248;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Lsk;")
    public class291 field4249;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Lsq;")
    public class316 field4271;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Los;")
    public class337 field4254;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "Lqo;")
    public class364 field4259;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "Lqo;")
    public class364 field4266;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Lsl;")
    public class388 field4255;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "S")
    public short field4252;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "Z")
    public boolean field4253;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "Z")
    public boolean field4263;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "Z")
    public boolean field4267;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public final void method1981(int arg0) {
        while (this.field4256 != null) {
            class272 var2 = this.field4256.field3514;
            this.field4256.method1715(arg0 + 41);
            this.field4256 = var2;
        }
        field4262++;
        this.field4264 = 0;
        if (arg0 != 2) {
            this.field4258 = 110;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(III)V")
    public class316(int arg0, int arg1, int arg2) {
        this.field4258 = (short) arg2;
        this.field4260 = (short) arg1;
        this.field4250 = this.field4265 = (byte) arg0;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBI)I")
    public static final int method1982(int arg0, byte arg1, int arg2) {
        field4245++;
        int var3 = class101.method609(arg2 + 45365, 4, 2, arg0 + 91923) + (class101.method609(arg2 + 10294, 2, 2, arg0 + 37821) - 128 >> 1) + (class101.method609(arg2, 1, 2, arg0) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 >= -20) {
            method1982(72, (byte) 49, -120);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public static void method1983(int arg0) {
        if (arg0 < 21) {
            method1982(1, (byte) 71, 18);
        }
        field4248 = null;
    }

    static {
        new class72((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
    }
}
