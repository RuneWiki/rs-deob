import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class449 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lkr;")
    private class486 field6206;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Z")
    public static boolean field6207 = false;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Ltr;")
    public static class176 field6202;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lah;")
    private class238 field6201;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method2616(int arg0) {
        if (arg0 != 2) {
            field6207 = false;
        }
        field6202 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
    public static final boolean method2617(int arg0, int arg1) {
        field6204++;
        if (arg1 == 7652) {
            return (arg0 & -arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBLdt;)I")
    public static final int method2618(int arg0, byte arg1, class145 arg2) {
        if (arg1 != -15) {
            method2618(102, (byte) 12, (class145) null);
        }
        field6205++;
        if (!client.method1122(arg2).method2318(-1, arg0) && arg2.field1929 == null) {
            return -1;
        } else if (arg2.field2023 == null || arg0 >= arg2.field2023.length) {
            return -1;
        } else {
            return arg2.field2023[arg0];
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Lah;")
    public final class238 method2619(byte arg0) {
        field6198++;
        if (arg0 != 60) {
            this.field6201 = null;
        }
        class238 var2 = this.field6201;
        if (this.field6206.field6838 == var2) {
            this.field6201 = null;
            return null;
        } else {
            this.field6201 = var2.field3575;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLkr;)V")
    public final void method2620(byte arg0, class486 arg1) {
        field6199++;
        this.field6206 = arg1;
        int var3 = 78 / ((arg0 + 24) / 57);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Lah;")
    public final class238 method2621(int arg0) {
        field6200++;
        if (arg0 != 1) {
            return null;
        }
        class238 var2 = this.field6206.field6838.field3575;
        if (this.field6206.field6838 == var2) {
            this.field6201 = null;
            return null;
        } else {
            this.field6201 = var2.field3575;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class449() {
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([JIII[I)V")
    public static final void method2622(long[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg1 < arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (var7 + ((long) (var10 & 0x1)) > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var9;
            method2622(arg0, arg1, var6 - 1, 15201, arg4);
            method2622(arg0, var6 + 1, arg2, 15201, arg4);
        }
        if (arg3 != 15201) {
            field6207 = false;
        }
        field6203++;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lkr;)V")
    public class449(class486 arg0) {
        this.field6206 = arg0;
    }
}
