import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class643 {

    @OriginalMember(owner = "client!or", name = "h", descriptor = "Z")
    public boolean field9022 = false;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public int field9017;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public int field9023;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Lsha;")
    public class730 field9021;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lrg;BI)V", line = 3)
    private final void method3683(class645 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field9017 = arg0.method3712((byte) 7);
        } else if (arg2 == 2) {
            this.field9023 = arg0.method3747((byte) -74);
        } else if (arg2 == 3) {
            this.field9022 = true;
        } else if (arg2 == 4) {
            this.field9017 = -1;
        }
        field9019++;
        if (arg1 <= 110) {
            this.method3687(27, null);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z", line = 31)
    public final boolean method3684(int arg0) {
        if (arg0 == -1) {
            field9018++;
            return this.field9021.field10226.method208(this.field9017, (byte) 70);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lha;BIZ)Lpga;", line = 44)
    public final class536 method3685(class60 arg0, byte arg1, int arg2, boolean arg3) {
        field9016++;
        if (arg1 < 73) {
            this.field9017 = -122;
        }
        long var5 = (long) (arg2 << 16 | this.field9017 | (arg3 ? 262144 : 0) | arg0.field852 << 19);
        class536 var7 = (class536) this.field9021.field10228.method803(116, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field9021.field10226.method208(this.field9017, (byte) 70)) {
            class129 var8 = class129.method919(this.field9021.field10226, this.field9017, 0);
            if (var8 != null) {
                var8.field1733 = var8.field1735 = var8.field1731 = var8.field1737 = 0;
                if (arg3) {
                    var8.method917();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method910();
                }
            }
            class536 var10 = arg0.method422(var8, true);
            if (var10 != null) {
                this.field9021.field10228.method801(1, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 90)
    public static final void method3686(byte arg0) {
        if (arg0 == 9) {
            class33.field341.method809(true);
            field9015++;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILrg;)V", line = 101)
    public final void method3687(int arg0, class645 arg1) {
        if (arg0 != 3) {
            this.method3685(null, (byte) -111, 39, false);
        }
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                field9020++;
                return;
            }
            this.method3683(arg1, (byte) 122, var3);
        }
    }
}
