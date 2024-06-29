import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class641 extends class659 {

    @OriginalMember(owner = "client!mfa", name = "r", descriptor = "Ljava/lang/String;")
    public String field8635;

    @OriginalMember(owner = "client!mfa", name = "s", descriptor = "Lnc;")
    public class26 field8636;

    @OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
    public static int field8645 = 0;

    @OriginalMember(owner = "client!mfa", name = "t", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!mfa", name = "u", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!mfa", name = "v", descriptor = "I")
    public int field8639;

    @OriginalMember(owner = "client!mfa", name = "w", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!mfa", name = "x", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "Ljj;")
    public static class129 field8643;

    @OriginalMember(owner = "client!mfa", name = "y", descriptor = "[I")
    public static int[] field8642;

    @OriginalMember(owner = "client!mfa", name = "A", descriptor = "[[[B")
    public static byte[][][] field8644;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "(B)I")
    public final int method3529(byte arg0) {
        field8640++;
        if (this.field8636.field259.field8885 == this.field8636.field259) {
            if (arg0 < 123) {
                field8644 = null;
            }
            return -1;
        } else {
            return ((class478) this.field8636.field259.field8885).field6718;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BLtd;)Z")
    public final boolean method3530(byte arg0, class478 arg1) {
        field8637++;
        if (arg0 != 89) {
            field8642 = null;
        }
        int var3 = this.method3529((byte) 125);
        arg1.method3659(arg0 - 88);
        this.field8639--;
        if (this.field8639 != 0) {
            return this.method3529((byte) 124) != var3;
        }
        this.method1102((byte) 117);
        this.method3659(arg0 ^ 0x58);
        class382.field5558--;
        class497.field6990.method3108(arg1.field6708, 16337, this);
        return false;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
    public static void method3531(int arg0) {
        if (arg0 != 8192) {
            method3533(107, 59, 80);
        }
        field8642 = null;
        field8643 = null;
        field8644 = null;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(BLtd;)Z")
    public final boolean method3532(byte arg0, class478 arg1) {
        field8641++;
        boolean var3 = true;
        arg1.method3659(1);
        int var4 = -73 / ((arg0 - 10) / 63);
        class478 var5 = (class478) this.field8636.method152((byte) -13);
        while (var5 != null) {
            if (class318.method2063(arg1.field6718, var5.field6718, 17229)) {
                class532.method3076(true, arg1, var5);
                this.field8639++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var5 = (class478) this.field8636.method146((byte) 97);
            var3 = false;
        }
        this.field8636.method150(0, arg1);
        this.field8639++;
        return var3;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class641(String arg0) {
        this.field8635 = arg0;
        this.field8636 = new class26();
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)Z")
    public static final boolean method3533(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3533(64, -95, 61);
        }
        field8646++;
        return class75.method605((byte) -110, arg0, arg1) & ((arg1 & 0x2000) != 0 | class143.method995(arg0, arg1, -1) | class124.method891(arg1, 13546, arg0));
    }
}
