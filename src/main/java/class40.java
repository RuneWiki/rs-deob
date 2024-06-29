import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class40 extends class18 {

    @OriginalMember(owner = "mapview!v", name = "s", descriptor = "[B")
    public byte[] field530;

    @OriginalMember(owner = "mapview!v", name = "q", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "Lna;")
    public static class26 field524 = class33.method219("world", 89);

    @OriginalMember(owner = "mapview!v", name = "o", descriptor = "[I")
    public static int[] field526 = new int[128];

    @OriginalMember(owner = "mapview!v", name = "u", descriptor = "Lna;")
    public static class26 field532 = class33.method219("Dairy Churn", 107);

    @OriginalMember(owner = "mapview!v", name = "r", descriptor = "Lna;")
    public static class26 field529 = class33.method219("Agility Training", 83);

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "mapview!v", name = "t", descriptor = "Lh;")
    public static class14 field531;

    @OriginalMember(owner = "mapview!v", name = "p", descriptor = "[B")
    public static byte[] field527;

    @OriginalMember(owner = "mapview!v", name = "v", descriptor = "[B")
    public static byte[] field533;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "[I")
    public static int[] field525;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(I)I", line = 8)
    public final int method246(int arg0) {
        if (arg0 != -25327) {
            this.method257(null, -121, 29, 27);
        }
        this.field528 += 2;
        return ((this.field530[this.field528 - 2] & 0xFF) << 8) + (this.field530[this.field528 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Z)B", line = 29)
    public static final byte method247(boolean arg0) {
        if (!arg0) {
            method256((byte) -59);
        }
        return field533 == null ? 0 : field533[class6.field65];
    }

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "(I)I", line = 55)
    public final int method248(int arg0) {
        if (arg0 != 255) {
            this.field528 = 86;
        }
        this.field528 += 4;
        return ((this.field530[this.field528 - 4] & 0xFF) << 24) + (this.field530[this.field528 - 1] & 0xFF) + ((this.field530[this.field528 + -2] & 0xFF) << 8) + ((this.field530[this.field528 + -3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IB)V", line = 82)
    public final void method249(int arg0, byte arg1) {
        if (arg1 != -126) {
            this.method249(-16, (byte) -54);
        }
        this.field530[this.field528++] = (byte) (arg0 >> 24);
        this.field530[this.field528++] = (byte) (arg0 >> 16);
        this.field530[this.field528++] = (byte) (arg0 >> 8);
        this.field530[this.field528++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ZI)V", line = 106)
    public final void method250(boolean arg0, int arg1) {
        if (!arg0) {
            this.field530[this.field528++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(B)B", line = 121)
    public final byte method251(byte arg0) {
        if (arg0 < 40) {
            field531 = null;
        }
        return this.field530[this.field528++];
    }

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "(I)I", line = 172)
    public final int method252(int arg0) {
        if (arg0 != 255) {
            method253(null, -68);
        }
        return this.field530[this.field528++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "([Lna;I)V", line = 182)
    public static final void method253(class26[] arg0, int arg1) {
        class26.method174(arg0.length, arg0, false, arg1);
    }

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "(I)V", line = 189)
    public static final void method254(int arg0) {
        class30 var1 = class10.field95;
        synchronized (class10.field95) {
            class21.field228 = class24.field251;
            if (class15.field155 >= 0) {
                while (class39.field515 != class15.field155) {
                    int var2 = field526[class39.field515];
                    class39.field515 = class39.field515 + 1 & 0x7F;
                    if (var2 < 0) {
                        class28.field423[~var2] = false;
                    } else {
                        class28.field423[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class28.field423[var3] = false;
                }
                class15.field155 = class39.field515;
            }
            class24.field251 = class18.field166;
        }
        int var5 = -126 % ((-arg0 - 48) / 35);
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(B)Lna;", line = 233)
    public final class26 method255(byte arg0) {
        if (arg0 < 126) {
            this.field528 = -64;
        }
        int var2 = this.field528;
        while (this.field530[this.field528++] != 0) {
        }
        return class11.method56(this.field528 - var2 - 1, var2, this.field530, (byte) 36);
    }

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "(B)V", line = 257)
    public static void method256(byte arg0) {
        field525 = null;
        field529 = null;
        field527 = null;
        field526 = null;
        field532 = null;
        field524 = null;
        field531 = null;
        if (arg0 != 44) {
            field529 = null;
        }
        field533 = null;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "([BIII)V", line = 321)
    public final void method257(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -13990) {
            field529 = null;
        }
        for (int var5 = arg3; var5 < arg3 + arg1; var5++) {
            arg0[var5] = this.field530[this.field528++];
        }
    }

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "(B)I", line = 337)
    public final int method258(byte arg0) {
        if (arg0 < 120) {
            method254(12);
        }
        this.field528 += 3;
        return (this.field530[this.field528 - 1] & 0xFF) + ((this.field530[this.field528 - 2] & 0xFF) << 8) + ((this.field530[this.field528 + -3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I[III)V", line = 364)
    public final void method259(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = this.field528;
        if (arg0 != 1469468875) {
            field524 = null;
        }
        this.field528 = arg3;
        int var6 = (arg2 - arg3) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = -957401312;
            int var9 = this.method248(255);
            int var10 = -1640531527;
            int var11 = 32;
            int var12 = this.method248(255);
            while (var11-- > 0) {
                var12 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ arg1[var8 >>> 11 & 0x2FA00003] + var8;
                var8 -= var10;
                var9 -= arg1[var8 & 0x3] + var8 ^ (var12 >>> 5 ^ var12 << 4) + var12;
            }
            this.field528 -= 8;
            this.method249(var9, (byte) -126);
            this.method249(var12, (byte) -126);
        }
        this.field528 = var5;
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "(I)V", line = 409)
    public class40(int arg0) {
        this.field530 = class6.method37(true, arg0);
        this.field528 = 0;
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "([B)V", line = 417)
    public class40(byte[] arg0) {
        this.field528 = 0;
        this.field530 = arg0;
    }
}
