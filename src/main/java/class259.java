import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class259 extends class567 implements class738 {

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    private int field3391;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II[BI)V", line = 3)
    public final void method689(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method3191(arg2, arg0);
        if (arg1 != 7896) {
            this.field3391 = -117;
        }
        ++field3396;
        this.field3391 = arg3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 17)
    public static final void method1557(int arg0, int arg1) {
        ++field3389;
        class235.field3092 = arg0;
        if (arg1 != 0) {
            method1557(-95, -97);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)J", line = 31)
    public final long method690(int arg0) {
        ++field3392;
        if (arg0 != 24582) {
            this.field3391 = 44;
        }
        return super.field8000.getAddress();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/lang/String;)J", line = 42)
    public static final long method1558(byte arg0, String arg1) {
        ++field3397;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (1 - (-var6 - -65));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 + -97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + -21);
            }
            if (~var2 <= -177917621779460414L) {
                break;
            }
        }
        if (arg0 > -124) {
            field3393 = 56;
        }
        while (~(var2 % 37L) == -1L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lac;I[BI)V", line = 86)
    public class259(class541 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3391 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lac;ILjaclib/memory/Buffer;)V", line = 98)
    public class259(class541 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field3391 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I", line = 110)
    public final int method692(int arg0) {
        if (arg0 != -14112) {
            this.method691(-28);
        }
        ++field3394;
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I", line = 123)
    public final int method691(int arg0) {
        ++field3390;
        int var2 = -17 / ((arg0 - -19) / 45);
        return this.field3391;
    }
}
