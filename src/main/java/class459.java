import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class459 {

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "J")
    private long field6471;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    private int field6473;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field6465 = 0;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[Z")
    public static boolean[] field6468 = new boolean[8];

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lqfa;")
    public static class98 field6470 = new class98(116, 2);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[Ls;")
    public static class278[] field6474;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method2725(int arg0) {
        field6474 = null;
        if (arg0 < 118) {
            method2725(-66);
        }
        field6468 = null;
        field6470 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Lpfa;")
    public final class295 method2726(int arg0, int arg1) {
        field6466++;
        int var3 = 9 / ((arg0 - 20) / 48);
        return class295.method1920((byte) 38, this.method2729(arg1, (byte) 111));
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I")
    public final int method2727(byte arg0) {
        field6472++;
        if (arg0 != 43) {
            field6468 = null;
        }
        return this.field6473;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lpfa;B)V")
    private final void method2728(class295 arg0, byte arg1) {
        field6467++;
        this.field6471 |= (arg0.field4147 << class295.field4161 * this.field6473++);
        if (arg1 <= 77) {
            this.method2727((byte) -95);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lpfa;)V")
    public class459(class295 arg0) {
        this.field6471 = arg0.field4147;
        this.field6473 = 1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)I")
    private final int method2729(int arg0, byte arg1) {
        if (arg1 < 4) {
            return -93;
        } else {
            field6469++;
            return (int) (this.field6471 >> class295.field4161 * arg0) & 0xF;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "([Lpfa;)V")
    public class459(class295[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2728(arg0[var2], (byte) 121);
        }
    }
}
