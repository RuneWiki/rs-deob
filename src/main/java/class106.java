import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class106 extends class403 {

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "[I")
    public static int[] field1581 = new int[256];

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "Lmc;")
    public static class78 field1582 = new class78(63, 8);

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Lh;")
    public static class434 field1594 = new class434(41, 3);

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Z")
    public static boolean field1595;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field1596;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "Ljava/lang/String;")
    public String field1583;

    static {
        new class206("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field1597 = 0;
        field1595 = false;
        field1596 = new String[100];
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 4)
    public final int method654(int arg0) {
        ++field1586;
        if (arg0 != 1509384992) {
            this.field1583 = null;
        }
        return (int) (255L & super.field6047 >>> 32);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)J", line = 16)
    public final long method655(boolean arg0) {
        if (!arg0) {
            return -10L;
        } else {
            ++field1585;
            return super.field5532 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)I", line = 28)
    public final int method656(byte arg0) {
        ++field1588;
        if (arg0 >= -9) {
            this.method658(-37);
        }
        return (int) super.field6047;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(Z)V", line = 46)
    public static void method657(boolean arg0) {
        field1582 = null;
        if (arg0) {
            field1595 = false;
        }
        field1581 = null;
        field1594 = null;
        field1596 = null;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 61)
    public final void method658(int arg0) {
        if (arg0 == 0) {
            super.field5532 |= Long.MIN_VALUE;
            ++field1591;
            if (~this.method655(true) == -1L) {
                class11.field140.method336(arg0 + -123, this);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V", line = 76)
    public final void method659(int arg0) {
        super.field5532 = class440.method2583(25267) + 500L | super.field5532 & Long.MIN_VALUE;
        ++field1592;
        int var2 = -66 / ((10 - arg0) / 62);
        class351.field4877.method336(-123, this);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V", line = 87)
    public class106(int arg0, int arg1) {
        super.field6047 = (long) arg1 | (long) arg0 << 32;
    }
}
