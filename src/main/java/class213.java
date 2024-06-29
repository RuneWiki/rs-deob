import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class213 extends class519 implements class171 {

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    private int field3030;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)J", line = 3)
    public final long method882(byte arg0) {
        ++field3029;
        if (arg0 <= 112) {
            this.field3030 = 12;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 15)
    public static final int method1346(String arg0, int arg1) {
        ++field3025;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 != 1573621477) {
            method1346((String) null, -68);
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = (var3 << 5) + -var3 + arg0.charAt(var4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II[BB)V", line = 38)
    public final void method878(int arg0, int arg1, byte[] arg2, byte arg3) {
        ++field3027;
        this.method3095(arg0, arg2, (byte) 112);
        if (arg3 == -32) {
            this.field3030 = arg1;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI)Z", line = 51)
    public static final boolean method1347(int arg0, byte arg1, int arg2) {
        if (arg1 <= 121) {
            return true;
        } else {
            ++field3028;
            return ~(arg0 & 32) != -1;
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V", line = 62)
    public final void method1348(byte arg0) {
        super.field7627.method1999(false, this);
        if (arg0 != 113) {
            this.method1348((byte) 105);
        }
        ++field3026;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I", line = 76)
    public final int method881(int arg0) {
        ++field3031;
        if (arg0 != 13298) {
            this.field3030 = 98;
        }
        return super.field7628;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lpg;I[BIZ)V", line = 91)
    public class213(class333 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3030 = arg1;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lpg;ILjaggl/memory/NativeBuffer;IZ)V", line = 99)
    public class213(class333 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3030 = arg1;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I", line = 108)
    public final int method883(int arg0) {
        ++field3024;
        int var2 = 18 % ((-38 - arg0) / 56);
        return this.field3030;
    }
}
