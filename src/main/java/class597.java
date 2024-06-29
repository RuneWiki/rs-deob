import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public abstract class class597 extends class209 {

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public int field8011;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "B")
    public byte field8004;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "S")
    public short field8014;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "S")
    public short field8017;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
    public int field8013;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "B")
    public byte field8010;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "S")
    public short field8005;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
    public int field8018;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "S")
    public short field8008;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "Z")
    public boolean field8015;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "Lcga;")
    public static class449 field8007 = new class449(49, 8);

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "Ldr;")
    public static class675 field8012 = new class675(48, 2);

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "Lns;")
    public static class375 field8016 = new class375();

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    public int field8009;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "[Lxa;")
    public static class468[] field8019;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)I")
    public abstract int method2117(int arg0);

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(B)V")
    public static void method3295(byte arg0) {
        field8012 = null;
        field8019 = null;
        field8007 = null;
        if (arg0 <= -105) {
            field8016 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)V")
    public void method226(int arg0) {
        int var2 = -115 / ((arg0 + 60) / 57);
        field8006++;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field8011 = arg3;
        this.field8004 = arg9;
        this.field8014 = (short) arg6;
        this.field8017 = (short) arg4;
        this.field8013 = arg2;
        this.field8010 = (byte) arg0;
        this.field8005 = (short) arg5;
        this.field8018 = arg1;
        this.field8008 = (short) arg7;
        this.field8015 = arg8;
    }
}
