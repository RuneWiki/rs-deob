import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class155 extends class154 {

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2472 = "Loaded input handler";

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "B")
    public byte field2466;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "Lfj;")
    public class274 field2473;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZ)V")
    public static final void method1047(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1050(-60, (class164) null, (class164) null);
        }
        class16.field305 = -arg0 + class262.field4276 + -1 + class262.field4278;
        class208.field3314 = -class262.field4275 + arg1;
        ++field2468;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)I")
    public final int method1043(int arg0) {
        ++field2474;
        if (arg0 != -12007) {
            method1047(-49, 95, false);
        }
        return this.field2473 == null ? 0 : this.field2473.field4458 * 100 / (this.field2473.field4441.length + -this.field2466);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)[B")
    public final byte[] method1045(boolean arg0) {
        ++field2470;
        if (!super.field2461 && this.field2473.field4458 >= this.field2473.field4441.length + -this.field2466) {
            if (!arg0) {
                this.field2473 = null;
            }
            return this.field2473.field4441;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
    public static final void method1048(int arg0, int arg1) {
        ++field2467;
        if (arg0 > -74) {
            method1050(-63, (class164) null, (class164) null);
        }
        if (class118.method816(arg1, 0)) {
            class219.method1491(-1, (byte) -77, class208.field3315[arg1]);
        }
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
    public static void method1049(int arg0) {
        if (arg0 < -17) {
            field2472 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILgi;Lgi;)V")
    public static final void method1050(int arg0, class164 arg1, class164 arg2) {
        if (arg0 != 7) {
            field2472 = null;
        }
        class254.field4203 = arg2;
        ++field2477;
        class53.field782 = arg1;
        class28.field496 = class53.field782.method1145((byte) 93, 3);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1051(String arg0, byte arg1) {
        ++field2475;
        if (class7.field167 != null) {
            int var2 = 0;
            if (arg1 < -36) {
                long var3 = class162.method1114((byte) -112, arg0);
                if (var3 != 0L) {
                    while (~var2 > ~class7.field167.length && class7.field167[var2].field2209 != var3) {
                        ++var2;
                    }
                    if (class7.field167.length > var2 && class7.field167[var2] != null) {
                        ++class156.field2498;
                        class311.field5027.method2081(false, 7);
                        class311.field5027.method1840((byte) 47, class7.field167[var2].field2209);
                    }
                }
            }
        }
    }
}
