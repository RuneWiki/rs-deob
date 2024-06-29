import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class584 extends class639 {

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "[I")
    public static int[] field8242 = new int[1000];

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public int field8236;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public int field8237;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public int field8240;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public int field8243;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "J")
    public long field8239;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Lf;")
    public static class702 field8234;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)I")
    public final int method1010(int arg0) {
        if (arg0 > -83) {
            this.field8237 = 83;
        }
        field8241++;
        return this.field8243;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(Z)I")
    public final int method1011(boolean arg0) {
        if (!arg0) {
            field8234 = null;
        }
        field8233++;
        return this.field8237;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)I")
    public final int method1014(boolean arg0) {
        field8232++;
        if (arg0) {
            this.method1010(-3);
        }
        return this.field8236;
    }

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "(I)V")
    public static void method3329(int arg0) {
        int var1 = -94 / ((81 - arg0) / 36);
        field8242 = null;
        field8234 = null;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I")
    public final int method1013(int arg0) {
        field8238++;
        if (arg0 != 731) {
            this.method1011(false);
        }
        return this.field8240;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)J")
    public final long method1012(int arg0) {
        if (arg0 != -15665) {
            field8234 = null;
        }
        field8235++;
        return this.field8239;
    }
}
