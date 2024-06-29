import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class124 extends class105 {

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
    private int field2493 = 204;

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
    private int field2495 = 1;

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "I")
    private int field2504 = 1;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "Z")
    public static boolean field2492 = false;

    @OriginalMember(owner = "client!ng", name = "jb", descriptor = "Z")
    public static boolean field2503 = false;

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "Lea;")
    public static class40 field2501 = new class40();

    @OriginalMember(owner = "client!ng", name = "lb", descriptor = "Leh;")
    private static class47 field2505 = class195.method1282((byte) -4, "Connection lost)3");

    @OriginalMember(owner = "client!ng", name = "mb", descriptor = "Leh;")
    public static class47 field2506 = field2505;

    @OriginalMember(owner = "client!ng", name = "nb", descriptor = "I")
    public static int field2507 = 0;

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ng", name = "ib", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ng", name = "ob", descriptor = "Lfd;")
    public static class52 field2508;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
    public static final void method945(int arg0) {
        if (arg0 != 0) {
            method946(56, -63, -12, -46, -62, -37, 123, -12);
        }
        ++field2500;
        class126.field2521.method993(1);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method946(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class142 var8 = new class142();
        var8.field2793 = arg2 / 128;
        var8.field2794 = arg3 / 128;
        var8.field2787 = arg4 / 128;
        var8.field2779 = arg5 / 128;
        var8.field2798 = arg1;
        var8.field2783 = arg2;
        var8.field2788 = arg3;
        var8.field2786 = arg4;
        var8.field2797 = arg5;
        var8.field2802 = arg6;
        var8.field2803 = arg7;
        class119.field2414[arg0][class119.field2412[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 == -256) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        this.field2493 = arg1.method569(26496);
                    }
                } else {
                    this.field2495 = arg1.method604((byte) -46);
                }
            } else {
                this.field2504 = arg1.method604((byte) -124);
            }
            ++field2496;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field2499;
        int[] var3 = super.field2192.method336(-56, arg0);
        if (super.field2192.field770) {
            for (int var4 = 0; ~class149.field2928 < ~var4; ++var4) {
                int var5 = class26.field500[arg0];
                int var6 = class167.field3237[var4];
                int var7 = this.field2504 * var6 >> 12;
                int var8 = var6 % (4096 / this.field2504) * this.field2504;
                int var9 = var5 % (4096 / this.field2495) * this.field2495;
                int var10 = this.field2495 * var5 >> 12;
                if (this.field2493 > var9) {
                    for (var7 -= var10; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var8 > ~this.field2493) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field2493 < ~var8) {
                    int var11;
                    for (var11 = var7 - var10; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 <= 78) {
            this.field2495 = -26;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
    public static final void method947(int arg0) {
        ++field2497;
        if (class160.field3105 != null) {
            class103 var1 = class160.field3105;
            synchronized (class160.field3105) {
                class160.field3105 = null;
            }
        }
        if (arg0 < 44) {
            field2506 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2505 = null;
        field2508 = null;
        if (arg0 < 45) {
            method947(37);
        }
        field2501 = null;
        field2506 = null;
    }
}
