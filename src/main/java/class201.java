import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class201 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field3555 = 16;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Z")
    public boolean field3565 = true;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public int field3566 = -1;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public int field3562 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
    public boolean field3557 = false;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public int field3561 = 128;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field3556 = -1;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field3563 = 8;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
    public boolean field3569 = true;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public int field3558 = 1190717;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[Lld;")
    public static class115[] field3560 = new class115[32768];

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Ls;")
    public static class261 field3559 = new class261(4);

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 8)
    public static void method1399(byte arg0) {
        field3559 = null;
        field3560 = null;
        if (arg0 > -75) {
            method1402(-99, 95, 33);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIIILdj;)V", line = 25)
    public static final void method1400(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class314 arg6) {
        class194.field3347 = arg5;
        field3567++;
        class20.field540 = arg2;
        class134.field2332 = arg1;
        class20.field537 = arg6;
        class106.field1809 = arg0;
        class52.field1023 = 1;
        class75.field1406 = arg3;
        int var7 = -61 / ((49 - arg4) / 32);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ldj;I)V", line = 45)
    public static final void method1401(class314 arg0, int arg1) {
        class299.field5093 = class195.method1357(class308.field5232, 24508, arg0);
        field3570++;
        class233.field4025 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class279.field4818[var2] & 0xFF0000) >> 16);
            int var4 = (class279.field4818[var2 + 1] & 0xFF0000) >> 16;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class279.field4818[var2] >> 8 & 0xFF);
            int var7 = (class279.field4818[var2 + 1] & 0xFF00) >> 8;
            float var8 = (float) (class279.field4818[var2] & 0xFF);
            float var9 = ((float) var7 - var6) / 64.0F;
            int var10 = class279.field4818[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class233.field4025[var2 * 64 + var12] = class279.method1951(class279.method1951((int) var3 << 16, (int) var6 << 8), (int) var8);
                var3 += var5;
                var8 += var11;
                var6 += var9;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class233.field4025[var13] = class279.field4818[3];
        }
        class121.field2052 = new int[32768];
        class75.field1408 = new int[32768];
        class144.method959(arg1 ^ 0xFFFFC6C1, (class127) null);
        class128.field2222 = new int[32768];
        class181.field3170 = new int[32768];
        if (class247.field4247) {
            class283.field4871 = new class186(128, 254);
        } else {
            class283.field4871 = new class231(128, 254);
        }
        if (arg1 != -8) {
            field3560 = (class115[]) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)J", line = 120)
    public static final long method1402(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        return var3 == null || var3.field2571 == null ? 0L : var3.field2571.field1264;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILbg;I)V", line = 136)
    private final void method1403(byte arg0, int arg1, class194 arg2, int arg3) {
        field3564++;
        if (arg0 != -115) {
            field3560 = (class115[]) null;
        }
        if (arg1 == 1) {
            this.field3562 = class118.method707(arg2.method1349((byte) 91), -1);
        } else if (arg1 == 2) {
            this.field3566 = arg2.method1325(7627);
        } else if (arg1 == 3) {
            this.field3566 = arg2.method1308(-46);
            if (this.field3566 == 65535) {
                this.field3566 = -1;
            }
        } else if (arg1 == 5) {
            this.field3565 = false;
        } else if (arg1 == 7) {
            this.field3556 = class118.method707(arg2.method1349((byte) 91), -1);
        } else if (arg1 == 8) {
            class259.field4478 = arg3;
        } else if (arg1 == 9) {
            this.field3561 = arg2.method1308(-91);
        } else if (arg1 == 10) {
            this.field3569 = false;
        } else if (arg1 == 11) {
            this.field3563 = arg2.method1325(arg0 + 7742);
        } else if (arg1 == 12) {
            this.field3557 = true;
        } else if (arg1 == 13) {
            this.field3558 = arg2.method1349((byte) 91);
        } else if (arg1 == 14) {
            this.field3555 = arg2.method1325(7627);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIZ)Lmh;", line = 241)
    public static final class128 method1404(int arg0, int arg1, int arg2, boolean arg3) {
        field3571++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        int var5 = arg2 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        if (arg1 < 92) {
            method1399((byte) -82);
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg2 % arg0;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
            arg2 /= arg0;
        }
        class128 var10 = new class128();
        var10.field2224 = var7;
        var10.field2181 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lbg;IB)V", line = 308)
    public final void method1405(class194 arg0, int arg1, byte arg2) {
        field3568++;
        if (arg2 != 38) {
            this.field3561 = -50;
        }
        while (true) {
            int var4 = arg0.method1325(arg2 ^ 0x1DED);
            if (var4 == 0) {
                return;
            }
            this.method1403((byte) -115, var4, arg0, arg1);
        }
    }
}
