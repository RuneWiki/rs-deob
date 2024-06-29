import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class690 extends class703 implements class550 {

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    private int field9551;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field9544 = 0;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)J", line = 4)
    public final long method3213(int arg0) {
        ++field9550;
        if (arg0 != -20288) {
            this.method949(35);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)I", line = 15)
    public final int method3210(boolean arg0) {
        ++field9546;
        return !arg0 ? 90 : this.field9551;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I", line = 31)
    public final int method3211(int arg0) {
        ++field9543;
        int var2 = -46 % ((-43 - arg0) / 42);
        return super.field9807;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[BII)V", line = 41)
    public final void method3212(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = -83 % ((-56 - arg2) / 61);
        ++field9549;
        this.method4000(arg0, true, arg1);
        this.field9551 = arg3;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V", line = 52)
    public final void method949(int arg0) {
        int var2 = -47 % ((56 - arg0) / 57);
        super.field9808.method1025(this, 124);
        ++field9548;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lwh;I[BIZ)V", line = 65)
    public class690(class148 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9551 = arg1;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(CI)Z", line = 78)
    public static final boolean method3923(char arg0, int arg1) {
        ++field9545;
        if (arg1 >= -1) {
            return true;
        } else {
            return ~arg0 == -161 || ~arg0 == -33 || arg0 == '_' || ~arg0 == -46;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILjava/lang/String;Lge;I)Ltj;", line = 91)
    public static final class197 method3924(int arg0, String arg1, class711 arg2, int arg3) {
        ++field9547;
        if (~arg3 == -1) {
            return arg2.method4059((byte) 88, arg1);
        } else if (~arg3 == -2) {
            try {
                class121.method878((byte) -117, new Object[] { (new URL(class466.field6830.getCodeBase(), arg1)).toString() }, "openjs", class466.field6830);
                class197 var4 = new class197();
                var4.field2986 = 1;
                return var4;
            } catch (Throwable var10) {
                class197 var5 = new class197();
                var5.field2986 = 2;
                return var5;
            }
        } else if (~arg3 == arg0) {
            try {
                class466.field6830.getAppletContext().showDocument(new URL(class466.field6830.getCodeBase(), arg1), "_blank");
                class197 var6 = new class197();
                var6.field2986 = 1;
                return var6;
            } catch (Exception var11) {
                class197 var7 = new class197();
                var7.field2986 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class121.method877(class466.field6830, "loggedout", arg0 + -22418);
            } catch (Throwable var13) {
            }
            try {
                class466.field6830.getAppletContext().showDocument(new URL(class466.field6830.getCodeBase(), arg1), "_top");
                class197 var8 = new class197();
                var8.field2986 = 1;
                return var8;
            } catch (Exception var12) {
                class197 var9 = new class197();
                var9.field2986 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V", line = 162)
    public static final void method3925(int arg0) {
        if (class179.field2759.field10019 && class350.field5112.field8131 != -1) {
            class660.method3806(class350.field5112.field8131, -26276, class350.field5112.field8138);
        }
        ++field9542;
        if (arg0 > -86) {
            method3924(-50, (String) null, (class711) null, -76);
        }
    }
}
