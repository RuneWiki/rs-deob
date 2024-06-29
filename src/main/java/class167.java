import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class167 extends class146 {

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "[I")
    public static int[] field2752 = new int[2];

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field2757 = 0;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1201(int arg0) {
        if (arg0 == -63) {
            field2752 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIZILsb;I)V")
    public static final void method1202(int arg0, int arg1, int arg2, boolean arg3, int arg4, class124 arg5, int arg6) {
        class225.field3579 = arg5;
        field2751++;
        class257.field4086 = arg2;
        class47.field870 = arg4;
        class138.field2311 = arg0;
        client.field4563 = arg1;
        field2753 = arg6;
        class293.field4652 = arg3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILig;)V")
    public static final void method1203(int arg0, class136 arg1) {
        while (arg1.field2263.length > arg1.field2231) {
            int var2 = 0;
            boolean var3 = false;
            int var4 = 0;
            if (arg1.method1012(4) == 1) {
                var3 = true;
                var2 = arg1.method1012(4);
                var4 = arg1.method1012(4);
            }
            int var5 = arg1.method1012(arg0 - 14558);
            int var6 = arg1.method1012(4);
            int var7 = var5 * 64 - class285.field4524;
            int var8 = class253.field4030 - (var6 * 64 + 1 - class31.field524);
            if (var7 >= 0 && var8 - 63 >= 0 && class159.field2574 > (var7 + 63) && var8 < class31.field524) {
                int var9 = var8 >> 6;
                int var10 = var7 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var3 || (var2 * 8) <= var11 && var11 < var2 * 8 + 8 && var12 >= (var4 * 8) && var12 < (var4 * 8 + 8)) {
                            byte var13 = arg1.method981(false);
                            if (var13 != 0) {
                                if (class137.field2299[var10][var9] == null) {
                                    class137.field2299[var10][var9] = new byte[4096];
                                }
                                class137.field2299[var10][var9][(63 - var12 << 6) + var11] = var13;
                                byte var14 = arg1.method981(false);
                                if (class213.field3419[var10][var9] == null) {
                                    class213.field3419[var10][var9] = new byte[4096];
                                }
                                class213.field3419[var10][var9][(63 - var12 << 6) + var11] = var14;
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                    byte var16 = arg1.method981(false);
                    if (var16 != 0) {
                        arg1.field2231++;
                    }
                }
            }
        }
        field2750++;
        if (arg0 != 14562) {
            field2757 = -5;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(Z)V")
    public static final void method1204(boolean arg0) {
        field2748++;
        if (class292.field4637 > 0) {
            class31.method270(31377);
            return;
        }
        class178.field2965 = class23.field360;
        if (!arg0) {
            method1203(-87, (class136) null);
        }
        class23.field360 = null;
        class274.method1856(40, 5);
    }
}
