import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class7 extends class65 {

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Z")
    public boolean field73;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field74 = -1;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIB)V")
    public static final void method30(int arg0, int arg1, int arg2, byte arg3) {
        field71++;
        int var4 = class265.field4123 + arg0;
        int var5 = class723.field10155 + arg1;
        if (class488.field7062 == null || arg0 < 0 || arg1 < 0 || class191.field3229 <= arg0 || arg1 >= class314.field4720) {
            return;
        }
        if (arg3 >= -34) {
            method30(-59, -24, 68, (byte) 27);
        }
        if (class654.field9289.field5453.method3878(3) == 0 && class145.field2251.field9470 != arg2) {
            return;
        }
        long var6 = (long) (var4 | arg2 << 28 | var5 << 14);
        class477 var8 = (class477) class665.field9441.method3512(true, var6);
        if (var8 == null) {
            class524.method3116(arg2, arg0, arg1);
            return;
        }
        class51 var9 = (class51) var8.field6929.method3463((byte) -50);
        if (var9 == null) {
            class524.method3116(arg2, arg0, arg1);
            return;
        }
        class567 var10 = (class567) class524.method3116(arg2, arg0, arg1);
        if (var10 == null) {
            var10 = new class567(arg0 << 9, class211.field3511[arg2].method2160(-89, arg1, arg0), arg1 << 9, arg2, arg2);
        } else {
            var10.field8045 = var10.field8026 = -1;
        }
        var10.field8032 = var9.field819;
        var10.field8040 = var9.field823;
        label61: while (true) {
            class51 var11 = (class51) var8.field6929.method3469((byte) 107);
            if (var11 == null) {
                break;
            }
            if (var10.field8040 != var11.field823) {
                var10.field8035 = var11.field819;
                var10.field8045 = var11.field823;
                while (true) {
                    class51 var12 = (class51) var8.field6929.method3469((byte) 107);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field8040 != var12.field823 && var10.field8045 != var12.field823) {
                        var10.field8026 = var12.field823;
                        var10.field8039 = var12.field819;
                    }
                }
            }
        }
        int var13 = class232.method1611((arg1 << 9) + 256, (arg0 << 9) + 256, arg2, (byte) -103);
        var10.field9477 = arg0 << 9;
        var10.field9474 = var13;
        var10.field9470 = (byte) arg2;
        var10.field8031 = 0;
        var10.field9475 = arg1 << 9;
        var10.field9469 = (byte) arg2;
        if (class584.method3365(false, arg0, arg1)) {
            var10.field9469++;
        }
        class127.method980(arg2, arg0, arg1, var13, var10);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIZ)V")
    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field75 = arg3;
        this.field73 = arg5;
        this.field67 = arg1;
        this.field70 = arg0;
        this.field72 = arg4;
        this.field69 = arg2;
    }
}
