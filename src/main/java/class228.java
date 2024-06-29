import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class228 {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    private int field4154 = -1;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    private int field4158 = 0;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lli;")
    private static class185 field4145 = class245.method1649("Loading )2 please wait)3", -111);

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lli;")
    public static class185 field4146 = field4145;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field4153 = -1;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    public static int[] field4149 = new int[25];

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lli;")
    public static class185 field4156 = class245.method1649("(U", -57);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvc;")
    public static final class161 method1571(Throwable arg0, String arg1) {
        field4143++;
        class161 var2;
        if ((arg0 instanceof class161)) {
            var2 = (class161) arg0;
            var2.field3044 = var2.field3044 + ' ' + arg1;
        } else {
            var2 = new class161(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
    private final void method1572(int arg0, byte arg1) {
        field4157++;
        int var3 = -63 % ((arg1 - 40) / 55);
        double var4 = (double) ((arg0 & 0xFFFFF4) >> 16) / 256.0D;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = var4;
        if (var6 < var4) {
            var8 = var6;
        }
        double var10 = (double) (arg0 & 0xFF) / 256.0D;
        double var12 = var4;
        if (var4 < var6) {
            var12 = var6;
        }
        double var14 = 0.0D;
        if (var8 > var10) {
            var8 = var10;
        }
        double var16 = 0.0D;
        if (var12 < var10) {
            var12 = var10;
        }
        double var18 = (var8 + var12) / 2.0D;
        this.field4147 = (int) (var18 * 256.0D);
        if (var8 != var12) {
            if (var4 == var12) {
                var14 = (var6 - var10) / (var12 - var8);
            } else if (var6 == var12) {
                var14 = (var10 - var4) / (var12 - var8) + 2.0D;
            } else if (var10 == var12) {
                var14 = (var4 - var6) / (var12 - var8) + 4.0D;
            }
            if (var18 < 0.5D) {
                var16 = (var12 - var8) / (var8 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var8) / (2.0D - var12 - var8);
            }
        }
        if (this.field4147 < 0) {
            this.field4147 = 0;
        } else if (this.field4147 > 255) {
            this.field4147 = 255;
        }
        this.field4142 = (int) (var16 * 256.0D);
        if (this.field4142 < 0) {
            this.field4142 = 0;
        } else if (this.field4142 > 255) {
            this.field4142 = 255;
        }
        double var20 = var14 / 6.0D;
        if ((var18 > 0.5D)) {
            this.field4152 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field4152 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field4152 < 1) {
            this.field4152 = 1;
        }
        this.field4148 = (int) ((double) this.field4152 * var20);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method1573(byte arg0) {
        field4146 = null;
        field4145 = null;
        field4149 = null;
        if (arg0 != -120) {
            field4145 = null;
        }
        field4156 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BILjd;)V")
    public final void method1574(byte arg0, int arg1, class118 arg2) {
        if (arg0 <= 40) {
            this.method1574((byte) 67, 58, (class118) null);
        }
        field4159++;
        while (true) {
            int var4 = arg2.method867(false);
            if (var4 == 0) {
                return;
            }
            this.method1577(var4, -3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static final void method1575(int arg0) {
        class152.field2871 = new class31(32);
        field4144++;
        if (arg0 != 255) {
            field4153 = 44;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)I")
    public static final int method1576(byte arg0, int arg1) {
        if (arg0 == -117) {
            field4155++;
            return arg1 >>> 8;
        } else {
            return 47;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILjd;)V")
    private final void method1577(int arg0, int arg1, int arg2, class118 arg3) {
        if (arg1 != -3) {
            return;
        }
        field4150++;
        if (arg0 == 1) {
            this.field4158 = arg3.method873((byte) -96);
            this.method1572(this.field4158, (byte) -92);
        } else if (arg0 == 2) {
            this.field4154 = arg3.method827(arg1 ^ 0xFFFFFF02);
            if (this.field4154 != 65535) {
                return;
            }
            this.field4154 = -1;
        } else if (arg0 == 3) {
            arg3.method827(255);
            return;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZ)V")
    public static final void method1578(int arg0, int arg1, boolean arg2) {
        field4151++;
        class191 var3 = class71.field1238[class265.field4703][arg1][arg0];
        if (var3 == null) {
            class243.method1643(class265.field4703, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class176 var5 = (class176) var3.method1375(16259);
        class176 var6 = null;
        while (var5 != null) {
            class134 var13 = class165.method1179(102, var5.field3223.field1852);
            int var14 = var13.field2460;
            if (var13.field2469 == 1) {
                var14 = (var5.field3223.field1850 + 1) * var14;
            }
            if (var4 < var14) {
                var6 = var5;
                var4 = var14;
            }
            var5 = (class176) var3.method1377(-19546);
        }
        if (var6 == null) {
            class243.method1643(class265.field4703, arg1, arg0);
            return;
        }
        var3.method1378(var6, arg2);
        class176 var7 = (class176) var3.method1375(16259);
        class102 var8 = null;
        class102 var9 = null;
        while (var7 != null) {
            class102 var12 = var7.field3223;
            if (var6.field3223.field1852 != var12.field1852) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field1852 != var12.field1852 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class176) var3.method1377(-19546);
        }
        long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class180.method1271(class265.field4703, arg1, arg0, class236.method1606(100, arg0 * 128 + 64, arg1 * 128 + 64, class265.field4703), var6.field3223, var10, var8, var9);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)J")
    public static final long method1579(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3627; var4++) {
            class49 var5 = var3.field3646[var4];
            if ((var5.field802 >> 29 & 0x3L) == 2L && var5.field816 == arg1 && var5.field796 == arg2) {
                return var5.field802;
            }
        }
        return 0L;
    }
}
