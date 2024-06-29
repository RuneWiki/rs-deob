import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class338 extends class359 {

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "J")
    public long field5003;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[I")
    public static int[] field5006 = new int[6];

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)I", line = 7)
    public static final int method2175(int arg0, byte arg1) {
        int var2 = 72 % ((arg1 - 85) / 36);
        field5004++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Lmb;", line = 20)
    public static final class143 method2176(int arg0, int arg1, int arg2) {
        class302 var3 = class19.field202[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4311;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 28)
    public class338() {
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)I", line = 32)
    public static final int method2177(int arg0) {
        field5005++;
        int var1 = -8 / ((-arg0 - 35) / 52);
        return ((class351.field5129 == 0 ? 0 : 1) << 20) + ((class159.field2255 ? 1 : 0) << 19) + ((class420.field6046 ? 1 : 0) << 9) + ((class78.field885 ? 1 : 0) << 6) + (class287.field4044 & 0x7) + ((class219.field3012 ? 1 : 0) << 3) - (-((class67.field763 ? 1 : 0) << 4) - ((class281.field3945 ? 1 : 0) << 5) + -((class40.field424 ? 1 : 0) << 8) + -((class41.field487 ? 1 : 0) << 10) + (-((class341.field5022 & 0x3) << 11) - (((class216.field2943 ? 1 : 0) << 13) - -((class307.field4399 ? 1 : 0) << 15))) + -((class25.field245 ? 1 : 0) << 16)) - (-(class169.field2373 << 17) - (((class75.field834 == 0 ? 0 : 1) << 21) + ((class308.field4405 == 0 ? 0 : 1) << 22) + (class85.method462(-2048) << 23)) + -(class318.field4509 << 25) + -((class436.field6388 ? 1 : 0) << 27) - (class264.field3709 << 28));
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(J)V", line = 47)
    public class338(long arg0) {
        this.field5003 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 59)
    public static void method2178(byte arg0) {
        int var1 = -128 % ((-arg0 - 61) / 34);
        field5006 = null;
    }
}
