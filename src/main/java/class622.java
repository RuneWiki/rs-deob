import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class622 extends class747 {

    @OriginalMember(owner = "client!jv", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field8319 = new String[5];

    @OriginalMember(owner = "client!jv", name = "K", descriptor = "I")
    public static int field8324 = 1403;

    @OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
    public static int field8328 = 0;

    @OriginalMember(owner = "client!jv", name = "G", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!jv", name = "H", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!jv", name = "J", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!jv", name = "M", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!jv", name = "N", descriptor = "Lfd;")
    public static class298 field8327;

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V", line = 4)
    public class622() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(III)Z", line = 9)
    public static final boolean method3508(int arg0, int arg1, int arg2) {
        if (arg2 > -111) {
            return false;
        } else {
            ++field8320;
            return (class452.method2764(arg0, arg1, (byte) -60) | class338.method2148(arg1, -104, arg0) | class248.method1707(arg1, -1, arg0)) & class280.method1871(1, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(Z)I", line = 21)
    public static final int method3509(boolean arg0) {
        ++field8321;
        if (!arg0) {
            field8319 = null;
        }
        return class649.field8705;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZI)I", line = 32)
    private final int method3510(int arg0, boolean arg1, int arg2) {
        ++field8326;
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        if (arg1) {
            field8328 = -108;
        }
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(B)V", line = 50)
    public static void method3511(byte arg0) {
        field8327 = null;
        field8319 = null;
        if (arg0 <= 44) {
            field8323 = -100;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)[I", line = 72)
    public final int[] method182(int arg0, int arg1) {
        ++field8325;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int var4 = class515.field7103[arg0];
            for (int var5 = 0; ~var5 > ~class73.field1095; ++var5) {
                var3[var5] = this.method3510(class639.field8571[var5], false, var4) % 4096;
            }
        }
        if (arg1 >= -89) {
            field8324 = 51;
        }
        return var3;
    }
}
