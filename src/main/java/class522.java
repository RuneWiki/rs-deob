import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class522 extends class402 implements class437 {

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    private int field7233;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field7230 = -1;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I")
    public final int method2514(int arg0) {
        ++field7231;
        if (arg0 > -89) {
            this.method2515((byte) -72);
        }
        return 0;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)V")
    public static final void method2980(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field9238 != null) {
                var3.field9238 = null;
            }
            if (var3.field9234 != null) {
                var3.field9234 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lpea;ILjaclib/memory/Buffer;)V")
    public class522(class641 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field7233 = arg1;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)I")
    public final int method2516(int arg0) {
        if (arg0 != -18831) {
            this.method2516(10);
        }
        ++field7232;
        return this.field7233;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lpea;I[BI)V")
    public class522(class641 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7233 = arg1;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)J")
    public final long method2515(byte arg0) {
        ++field7228;
        if (arg0 > -72) {
            this.field7233 = -33;
        }
        return super.field5699.getAddress();
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method2981(String arg0, int arg1) {
        ++field7227;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 != 28484) {
            return -93L;
        } else {
            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                var2 *= 37L;
                char var6 = arg0.charAt(var5);
                if (~var6 <= -66 && var6 <= 'Z') {
                    var2 += (long) (var6 + -64);
                } else if (var6 >= 'a' && var6 <= 'z') {
                    var2 += (long) (var6 + -96);
                } else if (var6 >= '0' && ~var6 >= -58) {
                    var2 += (long) (var6 + 27 + -48);
                }
                if (~var2 <= -177917621779460414L) {
                    break;
                }
            }
            while (~(var2 % 37L) == -1L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[BIB)V")
    public final void method2513(int arg0, byte[] arg1, int arg2, byte arg3) {
        ++field7229;
        if (arg3 >= -85) {
            method2980(-2, -11, -106);
        }
        this.method2370(arg1, arg0);
        this.field7233 = arg2;
    }
}
