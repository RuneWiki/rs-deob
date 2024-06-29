import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class684 implements class209 {

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "Luk;")
    public class263 field9517;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "Lni;")
    private class522 field9519;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "Z")
    public static boolean field9509 = true;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "Lmu;")
    public static class303 field9510 = new class303("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field9521 = 0;

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "Llga;")
    public static class712 field9523 = new class712(11, 15);

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "F")
    public static float field9520;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field9511;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "Ljj;")
    public static class121 field9522;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "Lufa;")
    public class680 field9512;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V", line = 4)
    public static void method3870(int arg0) {
        field9522 = null;
        field9523 = null;
        field9510 = null;
        if (arg0 > -79) {
            field9520 = 0.14854974F;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZB)V", line = 23)
    public void method182(boolean arg0, byte arg1) {
        field9515++;
        if (arg1 < -81 && arg0) {
            int var3 = this.field9517.field3444.method3841(class751.field10419, this.field9512.method666(), (byte) 83) + this.field9517.field3447;
            int var4 = this.field9517.field3446.method606(this.field9512.method663(), class396.field5620, (byte) -56) + this.field9517.field3448;
            this.field9512.method3859(var3, var4);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V", line = 43)
    public final void method184(byte arg0) {
        if (arg0 != -43) {
            this.field9519 = null;
        }
        this.field9512 = class79.method594(this.field9517.field3441, this.field9519, (byte) -89);
        field9511++;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Z", line = 54)
    public final boolean method183(int arg0) {
        if (arg0 != 14017) {
            this.method184((byte) 85);
        }
        field9513++;
        return this.field9519.method2882(arg0 ^ 0xFFFFC902, this.field9517.field3441);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IILkia;)Z", line = 67)
    public static final boolean method3871(int arg0, int arg1, class620 arg2) {
        field9516++;
        class194.field2324.method36(arg2.field8692[arg0], arg2.field8689[arg0], arg2.field8694[arg0], class175.field2162);
        if (arg1 != 5541) {
            field9510 = null;
        }
        int var3 = class175.field2162[2];
        if (var3 < 50) {
            return false;
        } else {
            arg2.field8698[arg0] = (short) (class175.field2162[0] * class729.field10177 / var3 + class427.field6030);
            arg2.field8687[arg0] = (short) (class175.field2162[1] * class449.field6273 / var3 + class593.field8261);
            arg2.field8686[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)I", line = 88)
    public static final int method3872(boolean arg0) {
        if (arg0) {
            field9514++;
            return class104.field1395;
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lni;Luk;)V", line = 105)
    public class684(class522 arg0, class263 arg1) {
        this.field9517 = arg1;
        this.field9519 = arg0;
    }
}
