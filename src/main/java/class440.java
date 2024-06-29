import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class440 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field6026 = 16777215;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public int field6035 = 8;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lqk;")
    public static class148 field6033 = new class148(74, 28);

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lbh;")
    public static class538 field6036 = new class538(260);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field6025;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public int field6027;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field6028;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field6032;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field6034;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
    public boolean field6031;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILvj;)V", line = 3)
    private final void method2631(int arg0, int arg1, class26 arg2) {
        if (arg0 == 1) {
            this.field6035 = arg2.method193(2);
        } else if (arg0 == 2) {
            this.field6031 = true;
        } else if (arg0 == 3) {
            this.field6025 = arg2.method173(-3);
            this.field6028 = arg2.method173(-3);
            this.field6034 = arg2.method173(-3);
        } else if (arg0 == 4) {
            this.field6027 = arg2.method194((byte) 119);
        } else if (arg0 == 5) {
            this.field6032 = arg2.method193(2);
        } else if (arg0 == 6) {
            this.field6026 = arg2.method186((byte) 105);
        }
        if (arg1 <= 23) {
            this.field6026 = 54;
        }
        field6024++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILvj;)V", line = 53)
    public final void method2632(int arg0, class26 arg1) {
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                int var4 = 40 / ((arg0 + 52) / 48);
                field6029++;
                return;
            }
            this.method2631(var3, 75, arg1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)Z", line = 73)
    public static final boolean method2633(int arg0, byte arg1, int arg2) {
        if (arg1 >= -113) {
            method2634(-120);
        }
        field6030++;
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 87)
    public static void method2634(int arg0) {
        if (arg0 < 26) {
            method2633(-109, (byte) -19, -63);
        }
        field6033 = null;
        field6036 = null;
    }
}
