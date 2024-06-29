import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class360 extends class264 {

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
    private boolean field5226 = true;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
    public boolean field5231 = false;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(ILmfa;)V")
    public class360(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)Z")
    public final boolean method2257(int arg0) {
        if (arg0 != 14996) {
            return true;
        } else {
            ++field5232;
            return super.field3731.method3634(0).method2860(false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)I")
    public final int method2258(byte arg0) {
        if (arg0 >= -31) {
            this.field5226 = true;
        }
        ++field5235;
        return super.field3733;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        this.field5231 = false;
        super.field3733 = arg1;
        ++field5230;
        if (arg0 >= -114) {
            this.method659((byte) -2, -24);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            this.field5226 = true;
        }
        ++field5236;
        this.field5231 = true;
        return !super.field3731.method3634(0).method2860(false) ? 0 : 2;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lmfa;)V")
    public class360(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Z")
    public final boolean method2259(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field5228;
            return this.field5226;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field5225;
        if (!super.field3731.method3634(arg0 ^ 112).method2860(false)) {
            return 3;
        } else if (~arg1 == -4 && !class382.method2346("jagdx", -115)) {
            return 3;
        } else {
            return arg0 != 112 ? -27 : 2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
    public static final void method2260(byte arg0) throws class138 {
        ++field5234;
        if (arg0 == 107) {
            if (~class463.field6612 == -2) {
                class438.field6281.method406(class614.field8677, class364.field5265);
            } else {
                class438.field6281.method406(0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Liw;I)V")
    public static final void method2261(class331 arg0, int arg1) {
        ++field5229;
        for (int var2 = 0; class486.field6883 > var2; ++var2) {
            int var3 = class762.field10498[var2];
            class559 var4 = class581.field8250[var3];
            int var5 = arg0.method842(2384);
            if (~(32 & var5) != -1) {
                var5 += arg0.method842(2384) << 8;
            }
            if (~(var5 & 256) != -1) {
                var5 += arg0.method842(arg1 + 20914) << 16;
            }
            class179.method1352(var5, arg0, var3, (byte) -25, var4);
        }
        if (arg1 != -18530) {
            field5233 = 94;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        if (!super.field3731.method3634(0).method2860(false)) {
            super.field3733 = 0;
        }
        int var2 = -119 % ((arg0 - 1) / 41);
        ++field5224;
        if (~super.field3733 > -1 || ~super.field3733 < -6) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V")
    public final void method2262(byte arg0, boolean arg1) {
        if (arg0 == -60) {
            ++field5227;
            this.field5226 = arg1;
        }
    }
}
