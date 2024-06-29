import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class195 {

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "B")
    private byte field3478;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lkh;")
    public static class117 field3474 = class224.method1450((byte) 111, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lkh;")
    public static class117 field3475 = class224.method1450((byte) -17, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lkh;")
    private static class117 field3479 = class224.method1450((byte) 116, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Lkh;")
    public static class117 field3486 = field3479;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field3485 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Leh;")
    public static class53 field3473 = new class53(5);

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field3487 = 0;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "[I")
    public static int[] field3489 = new int[32];

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Z")
    public static boolean field3488 = false;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method1295(int arg0) {
        field3475 = null;
        field3489 = null;
        field3479 = null;
        field3473 = null;
        field3474 = null;
        int var1 = -1 / ((arg0 - 14) / 61);
        field3486 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
    public final int method1296(int arg0) {
        int var2 = 106 / ((-arg0 - 55) / 34);
        field3483++;
        return this.field3478 & 0x7;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)I")
    public final int method1297(byte arg0) {
        if (arg0 != -87) {
            this.method1297((byte) 106);
        }
        field3477++;
        return (this.field3478 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lfa;")
    public static final class57 method1298(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3065; var4++) {
            class57 var5 = var3.field3063[var4];
            if ((var5.field1171 >> 29 & 0x3L) == 2L && var5.field1186 == arg1 && var5.field1170 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class195() {
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lnc;)V")
    public class195(class145 arg0) {
        this.field3478 = arg0.method994((byte) 126);
        this.field3482 = arg0.method1049((byte) 120);
        this.field3480 = arg0.method1018(-1068451600);
        this.field3472 = arg0.method1018(-1068451600);
        this.field3481 = arg0.method1018(-1068451600);
        this.field3484 = arg0.method1018(-1068451600);
    }
}
