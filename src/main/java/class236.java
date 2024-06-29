import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class236 extends class150 {

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    public static int field3487 = -1;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "Lst;")
    public static class335 field3488 = new class335(4, 18);

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
    public static int field3494 = 0;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "Lkr;")
    public static class602 field3495 = new class602(26, 6);

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "Lfd;")
    private class298 field3493;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field3496;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZB)V", line = 9)
    public final void method597(int arg0, int arg1, boolean arg2, byte arg3) {
        if (arg3 != -92) {
            this.method202((byte) -86);
        }
        ++field3489;
        int var5 = this.method956(88) * super.field2073.field7561 / 10000;
        int[] var6 = new int[4];
        class129.field1802.method1454(var6);
        class129.field1802.method1544(arg1, arg0 + 2, arg1 - -var5, super.field2073.field7550 + arg0);
        this.field3493.method1964(arg1, arg0 - -2, super.field2073.field7561, super.field2073.field7550);
        class129.field1802.method1544(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)V", line = 29)
    public static void method1568(int arg0) {
        field3495 = null;
        if (arg0 == -1) {
            field3496 = null;
            field3488 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Luu;Luu;Lfq;)V", line = 41)
    public class236(class237 arg0, class237 arg1, class204 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZII)V", line = 44)
    public final void method600(int arg0, boolean arg1, int arg2, int arg3) {
        class129.field1802.method1534(arg2 + -2, arg0, super.field2073.field7561 + 4, super.field2073.field7550 + 2, ((class204) super.field2073).field2695, 0);
        ++field3486;
        class129.field1802.method1534(arg2 + -1, arg0 + 1, super.field2073.field7561 + 2, super.field2073.field7550, arg3, 0);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Z", line = 59)
    public final boolean method202(byte arg0) {
        ++field3491;
        if (!super.method202((byte) -125)) {
            return false;
        } else {
            if (arg0 >= -46) {
                field3487 = -128;
            }
            return super.field2074.method1578(((class204) super.field2073).field2690, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 74)
    public final void method200(int arg0) {
        if (arg0 < 12) {
            this.method200(-22);
        }
        super.method200(26);
        ++field3492;
        this.field3493 = class532.method3159(super.field2074, 0, ((class204) super.field2073).field2690);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIZ)Lni;", line = 86)
    public static final class515 method1569(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3490;
        class262 var4 = class137.field1948[arg1][arg0][arg2];
        if (var4 == null) {
            return null;
        } else {
            class515 var5 = null;
            if (arg3) {
                return null;
            } else {
                int var6 = -1;
                for (class638 var7 = var4.field3846; var7 != null; var7 = var7.field8564) {
                    class395 var8 = var7.field8567;
                    if (var8 instanceof class515) {
                        class515 var9 = (class515) var8;
                        int var10 = (-1 + var9.method662((byte) 15)) * 256 + 252;
                        int var11 = -var10 + var9.field4410 >> 9;
                        int var12 = -var10 + var9.field4418 >> 9;
                        int var13 = var9.field4410 + var10 >> 9;
                        int var14 = var9.field4418 - -var10 >> 9;
                        if (arg0 >= var11 && ~var12 >= ~arg2 && arg0 <= var13 && var14 >= arg2) {
                            int var15 = (var13 - -1 + -arg0) * (var14 + 1 + -arg2);
                            if (~var6 > ~var15) {
                                var5 = var9;
                                var6 = var15;
                            }
                        }
                    }
                }
                return var5;
            }
        }
    }
}
