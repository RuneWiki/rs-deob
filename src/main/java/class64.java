import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class64 extends class261 {

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    private int field964 = 2048;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    private int field967 = 4096;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    private int field969 = 0;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "I")
    private int field972 = 2048;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    private int field971 = 12288;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    private int field963 = 0;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "I")
    private int field977 = 8192;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "Lve;")
    public static class255 field973 = class87.method607(49, ":allyreq:");

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([BI)[B", line = 11)
    public static final byte[] method386(byte[] arg0, int arg1) {
        class70 var2 = new class70(arg0);
        field961++;
        int var3 = var2.method481(~arg1);
        int var4 = var2.method469(arg1 + 113);
        if (arg1 < ~var4 || !(class266.field4504 == 0 || class266.field4504 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method447(var5, arg1 ^ 0x7E, var4, 0);
            return var5;
        } else {
            int var6 = var2.method469(88);
            if (var6 < 0 || class266.field4504 != 0 && class266.field4504 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class233.method1616(var7, var6, arg0, var4, 9);
            } else {
                class163.field2754.method542(22911, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 57)
    public class64() {
        super(0, true);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(III)Z", line = 63)
    private final boolean method387(int arg0, int arg1, int arg2) {
        field976++;
        int var4 = (arg1 + arg2) * this.field971 >> 12;
        if (arg0 != -2) {
            return false;
        }
        int var5 = class72.field1188[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field971;
        int var7 = (var6 << 12) / this.field977;
        int var8 = this.field967 * var7 >> 12;
        return arg2 - arg1 < var8 && arg2 - arg1 > -var8;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(III)Z", line = 83)
    private final boolean method388(int arg0, int arg1, int arg2) {
        int var4 = -22 % ((arg0 - 21) / 56);
        field974++;
        int var5 = (arg2 - arg1) * this.field971 >> 12;
        int var6 = class72.field1188[var5 * 255 >> 12 & 0xFF];
        int var7 = (var6 << 12) / this.field971;
        int var8 = (var7 << 12) / this.field977;
        int var9 = this.field967 * var8 >> 12;
        return (arg1 + arg2) < var9 && (arg1 + arg2) > (-var9);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)I", line = 99)
    public static final int method389(int arg0, int arg1) {
        field962++;
        if (arg1 != 265157387) {
            method390((byte) 125, -65);
        }
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(B)V", line = 116)
    public final void method111(byte arg0) {
        class254.method1735(73);
        field968++;
        if (arg0 != -57) {
            this.field963 = -58;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)[I", line = 143)
    public final int[] method21(byte arg0, int arg1) {
        field966++;
        int var3 = -62 % ((-arg0 - 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int var5 = class20.field324[arg1] - 2048;
            for (int var6 = 0; var6 < class92.field1576; var6++) {
                int var7 = class245.field4120[var6] - 2048;
                int var8 = this.field964 + var7;
                int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                int var10 = this.field963 + var5;
                int var11 = var9 > 2048 ? var9 - 4096 : var9;
                int var12 = var10 < -2048 ? var10 + 4096 : var10;
                int var13 = var12 > 2048 ? var12 - 4096 : var12;
                int var14 = var7 + this.field969;
                int var15 = var14 >= -2048 ? var14 : var14 + 4096;
                int var16 = var15 <= 2048 ? var15 : var15 - 4096;
                int var17 = this.field972 + var5;
                int var18 = var17 >= -2048 ? var17 : var17 + 4096;
                int var19 = var18 > 2048 ? var18 - 4096 : var18;
                var4[var6] = this.method388(118, var11, var13) || this.method387(-2, var16, var19) ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(BI)Z", line = 206)
    public static final boolean method390(byte arg0, int arg1) {
        field970++;
        if (arg0 >= -63) {
            return false;
        } else {
            return ((arg1 & 0x377A4C) >> 21) != 0;
        }
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(B)V", line = 217)
    public static void method391(byte arg0) {
        field973 = null;
        if (arg0 > -77) {
            field973 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 227)
    public static final void method392(int arg0) {
        if (arg0 == 3758) {
            class101.field1708.method554(0);
            field978++;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lpb;BI)V", line = 255)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 > -115) {
            this.field977 = -18;
        }
        field975++;
        if (arg2 == 0) {
            this.field964 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field963 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field969 = arg0.method423(255);
        } else if (arg2 == 3) {
            this.field972 = arg0.method423(255);
        } else if (arg2 == 4) {
            this.field971 = arg0.method423(255);
        } else if (arg2 == 5) {
            this.field967 = arg0.method423(255);
        } else if (arg2 == 6) {
            this.field977 = arg0.method423(255);
        }
    }
}
