import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class375 {

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "B")
    public byte field5430;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field5423 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "Lum;")
    public class129 field5424;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lum;")
    public class129 field5428;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Lnf;")
    public class19 field5427;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Lnf;")
    public class19 field5431;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Lgm;")
    public class208 field5425;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Laca;")
    public class217 field5432;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "Lmda;")
    public static class349 field5435;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Ldn;")
    public class375 field5433;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Lrv;")
    public static class438 field5421;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "Lhf;")
    public class644 field5422;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "S")
    public short field5426;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "S")
    public short field5434;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "S")
    public short field5436;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "S")
    public short field5437;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
    public static final void method2325() {
        class183.method1289(1, class433.field6202);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public final void method2326(int arg0) {
        while (this.field5425 != null) {
            class208 var2 = this.field5425.field3146;
            this.field5425.method1485(32659);
            this.field5425 = var2;
        }
        field5419++;
        if (arg0 >= -109) {
            field5435 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
    public class375(int arg0) {
        this.field5430 = (byte) arg0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILum;Lum;)V")
    public static final void method2327(int arg0, int arg1, int arg2, class129 arg3, class129 arg4) {
        class375 var5 = class211.method1494(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5428 = arg3;
        var5.field5424 = arg4;
        int var6 = class95.field1372 == class25.field221 ? 1 : 0;
        if (!arg3.method607((byte) 119)) {
            class399.field5714[var6][class145.field1963[var6]++] = arg3;
        } else if (arg3.method614((byte) -117)) {
            class499.field7174[var6][class575.field8273[var6]++] = arg3;
        } else {
            class132.field1818[var6][class355.field5248[var6]++] = arg3;
            class235.field3518 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method607((byte) 125)) {
            if (arg4.method614((byte) -103)) {
                class499.field7174[var6][class575.field8273[var6]++] = arg4;
                return;
            }
            class132.field1818[var6][class355.field5248[var6]++] = arg4;
            class235.field3518 = true;
            return;
        }
        class399.field5714[var6][class145.field1963[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
    public static void method2328(int arg0) {
        if (arg0 >= -63) {
            method2329(87, null, null, (byte) 3, 34, 124);
        }
        field5435 = null;
        field5421 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILrq;Lha;BII)V")
    public static final void method2329(int arg0, class482 arg1, class543 arg2, byte arg3, int arg4, int arg5) {
        field5438++;
        class607 var6 = class258.field3697.method4085(arg1.field6880, true);
        if (var6.field8614 == -1) {
            return;
        }
        int var8;
        if (arg1.field6919) {
            int var7 = arg1.field6891 + arg0;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class515 var9 = var6.method3540(arg1.field6933, arg3 + 68, var8, arg2);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field6936;
        int var11 = arg1.field6879;
        if ((var8 & 0x1) == 1) {
            var11 = arg1.field6936;
            var10 = arg1.field6879;
        }
        int var12 = var9.method784();
        int var13 = var9.method780();
        if (var6.field8610) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field8613 == 0) {
            var9.method3132(arg5, arg4 - (var11 * 4 - 4), var12, var13);
        } else {
            var9.method3130(arg5, arg4 + 4 - (var11 * 4), var12, var13, 0, var6.field8613 | 0xFF000000, 1);
        }
        if (arg3 != 59) {
            field5421 = null;
        }
    }
}
