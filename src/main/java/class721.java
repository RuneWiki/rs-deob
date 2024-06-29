import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class721 extends class134 {

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field10080 = 0;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "[[B")
    public static byte[][] field10089 = new byte[50][];

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "D")
    public static double field10081;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field10085;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field10088;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB[BI)[B", line = 6)
    public static final byte[] method4054(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 >= -116) {
            method4057(-74);
        }
        ++field10085;
        byte[] var4;
        if (~arg0 >= -1) {
            var4 = arg2;
        } else {
            var4 = new byte[arg3];
            for (int var5 = 0; ~var5 > ~arg3; ++var5) {
                var4[var5] = arg2[arg0 + var5];
            }
        }
        class723 var6 = new class723();
        var6.method4061((byte) -77);
        var6.method4059(var4, 64, (long) (arg3 * 8));
        byte[] var7 = new byte[64];
        var6.method4060((byte) -111, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)I", line = 42)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            return -66;
        } else {
            ++field10086;
            if (super.field1712.method2282((byte) 121)) {
                return 3;
            } else {
                return super.field1712.method2277((byte) 104) == class257.field3338 ? 1 : 3;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 62)
    public final void method60(byte arg0) {
        if (arg0 >= 118) {
            ++field10084;
            if (super.field1712.method2277((byte) 104) != class257.field3338) {
                super.field1708 = 1;
            } else if (super.field1712.method2282((byte) 112)) {
                super.field1708 = 0;
            }
            if (super.field1708 != 0 && ~super.field1708 != -2) {
                super.field1708 = this.method58(0);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I", line = 82)
    public final int method4055(byte arg0) {
        ++field10088;
        if (arg0 < 119) {
            field10081 = 0.8269233149088107D;
        }
        return super.field1708;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)Z", line = 94)
    public final boolean method4056(int arg0) {
        ++field10087;
        if (super.field1712.method2282((byte) 117)) {
            return false;
        } else if (super.field1712.method2277((byte) 104) == class257.field3338) {
            return true;
        } else {
            if (arg0 != -1) {
                method4054(-108, (byte) 43, (byte[]) null, -37);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 112)
    public static void method4057(int arg0) {
        field10089 = null;
        if (arg0 != 0) {
            field10081 = -0.004191568579013829D;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lkda;)V", line = 122)
    public class721(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I", line = 126)
    public final int method58(int arg0) {
        if (arg0 != 0) {
            return 13;
        } else {
            ++field10083;
            return 1;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILkda;)V", line = 137)
    public class721(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 148)
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        int var3 = -32 % ((-26 - arg0) / 41);
        ++field10082;
    }
}
