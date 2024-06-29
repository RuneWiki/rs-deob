import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class207 extends class270 {

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    private int field3508 = 0;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    private int field3506 = 4096;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    private int field3512 = 0;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    private int field3519 = 12288;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    private int field3518 = 2048;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    private int field3514 = 8192;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    private int field3505 = 2048;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "Lmh;")
    public static class62 field3511 = class201.method1405(true, "<img=0>");

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "Lmh;")
    public static class62 field3515 = class201.method1405(true, ")4a=");

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "Lmh;")
    public static class62 field3521 = class201.method1405(true, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field3520 = 0;

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "Lmh;")
    private static class62 field3523 = class201.method1405(true, "Unable to find ");

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "Lmh;")
    public static class62 field3516 = field3523;

    @OriginalMember(owner = "client!ag", name = "mb", descriptor = "Lmh;")
    public static class62 field3525 = class201.method1405(true, "Okay");

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ag", name = "nb", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lmi;II)V", line = 22)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3505 = arg0.method721(86);
        } else if (arg1 == 1) {
            this.field3512 = arg0.method721(79);
        } else if (arg1 == 2) {
            this.field3508 = arg0.method721(68);
        } else if (arg1 == 3) {
            this.field3518 = arg0.method721(22);
        } else if (arg1 == 4) {
            this.field3519 = arg0.method721(56);
        } else if (arg1 == 5) {
            this.field3506 = arg0.method721(81);
        } else if (arg1 == 6) {
            this.field3514 = arg0.method721(66);
        }
        field3524++;
        int var5 = 124 % ((arg2 + 8) / 53);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([Ljava/lang/Object;[JZ)V", line = 82)
    public static final void method1451(Object[] arg0, long[] arg1, boolean arg2) {
        class205.method1425(arg1.length - 1, arg1, arg0, 0, 114);
        if (!arg2) {
            method1452((byte) 116);
        }
        field3526++;
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(B)V", line = 94)
    public static void method1452(byte arg0) {
        field3523 = null;
        field3511 = null;
        field3525 = null;
        field3521 = null;
        field3515 = null;
        if (arg0 > -93) {
            field3515 = (class62) null;
        }
        field3516 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 142)
    public class207() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)I", line = 120)
    public static final int method1453(int arg0, int arg1, int arg2) {
        field3522++;
        class272 var3 = (class272) class222.field3829.method311((byte) 114, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 == 20258) {
            return arg0 >= 0 && var3.field4625.length > arg0 ? var3.field4625[arg0] : 0;
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(III)Z", line = 146)
    private final boolean method1454(int arg0, int arg1, int arg2) {
        field3507++;
        int var4 = (arg2 - arg0) * this.field3519 >> 12;
        if (arg1 != 4096) {
            method1451((Object[]) null, (long[]) null, false);
        }
        int var5 = class63.field953[(var4 * 255 & 0xFF5DD) >> 12];
        int var6 = (var5 << 12) / this.field3519;
        int var7 = (var6 << 12) / this.field3514;
        int var8 = this.field3506 * var7 >> 12;
        return var8 > (arg0 + arg2) && (-var8) < (arg0 + arg2);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I", line = 164)
    public final int[] method6(int arg0, int arg1) {
        field3513++;
        if (arg0 != 18693) {
            this.method1455(4, 59, 59);
        }
        int[] var3 = this.field4573.method919(arg1, arg0 + 7379);
        if (this.field4573.field1984) {
            int var4 = class166.field2702[arg1] - 2048;
            for (int var5 = 0; var5 < class109.field1770; var5++) {
                int var6 = class283.field4840[var5] - 2048;
                int var7 = this.field3512 + var4;
                int var8 = this.field3505 + var6;
                int var9 = var7 < -2048 ? var7 + 4096 : var7;
                int var10 = var9 <= 2048 ? var9 : var9 - 4096;
                int var11 = var8 >= -2048 ? var8 : var8 + 4096;
                int var12 = this.field3518 + var4;
                int var13 = var11 <= 2048 ? var11 : var11 - 4096;
                int var14 = var12 < -2048 ? var12 + 4096 : var12;
                int var15 = this.field3508 + var6;
                int var16 = var15 >= -2048 ? var15 : var15 + 4096;
                int var17 = var14 <= 2048 ? var14 : var14 - 4096;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = this.method1454(var13, 4096, var10) || this.method1455(var18, -91, var17) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(B)V", line = 228)
    public final void method231(byte arg0) {
        if (arg0 == 90) {
            field3510++;
            class96.method767((byte) -55);
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(III)Z", line = 251)
    private final boolean method1455(int arg0, int arg1, int arg2) {
        field3517++;
        int var4 = (arg0 + arg2) * this.field3519 >> 12;
        int var5 = class63.field953[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3519;
        int var7 = (var6 << 12) / this.field3514;
        int var8 = this.field3506 * var7 >> 12;
        if (arg1 > -51) {
            this.field3508 = -95;
        }
        return var8 > (arg2 - arg0) && (-var8) < (arg2 - arg0);
    }
}
