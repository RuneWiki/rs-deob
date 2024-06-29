import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class228 extends class260 {

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    private int field4011 = -1;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Loh;")
    public static class263 field4005 = class253.method1681(-122, "::tele ");

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field4002 = 0;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field4012 = 0;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "Loh;")
    public static class263 field4007 = class253.method1681(-123, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "Lue;")
    public static class86 field4004;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[I")
    public int[] field3999;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
    public final int method1544(int arg0) {
        if (arg0 < 15) {
            field4004 = null;
        }
        ++field4008;
        return this.field4011;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public static void method1545(int arg0) {
        field4007 = null;
        field4004 = null;
        field4005 = null;
        if (arg0 != -20022) {
            method1547(42, (class262) null);
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)Z")
    public final boolean method1546(byte arg0) {
        ++field4014;
        if (this.field3999 != null) {
            return true;
        } else if (this.field4011 >= 0) {
            class140 var2 = class232.field4063 < 0 ? class148.method972(-29769, class23.field674, this.field4011) : class105.method709(class232.field4063, this.field4011, class23.field674, true);
            var2.method932();
            this.field4009 = var2.field2583;
            this.field4003 = var2.field2585;
            this.field3999 = var2.field2571;
            return true;
        } else {
            if (arg0 >= -48) {
                this.method86(-95, -60, (class194) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public final void method453(byte arg0) {
        super.method453((byte) -123);
        ++field4001;
        if (arg0 >= -115) {
            field4007 = null;
        }
        this.field3999 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILtj;)V")
    public static final void method1547(int arg0, class262 arg1) {
        ++field4000;
        class183.field3310 = 3;
        class159.method1043((byte) 67, true);
        class7.field135 = true;
        class107.field2027 = 0;
        class125.field2322 = true;
        class126.field2331 = true;
        class159.field2896 = true;
        class187.field3372 = true;
        class277.field4853 = 2;
        class107.field2028 = true;
        class232.field4061 = 0;
        class126.field2335 = 0;
        class1.field9 = true;
        class64.field1292 = 0;
        class101.field1930 = true;
        class206 var2 = null;
        class214.field3798 = 127;
        class245.field4319 = false;
        class146.field2670 = true;
        class265.field4632 = 127;
        class253.field4397 = true;
        class17.field394 = true;
        class2.field51 = 0;
        class60.field1239 = 0;
        class95.field1866 = 255;
        try {
            class235 var3 = arg1.method1730(0, "runescape");
            int var4 = 113 % ((arg0 - 51) / 59);
            while (var3.field4114 == 0) {
                class215.method1457(1L, (byte) 117);
            }
            if (~var3.field4114 == -2) {
                var2 = (class206) var3.field4117;
                byte[] var5 = new byte[(int) var2.method1424(114)];
                int var7;
                for (int var6 = 0; var5.length > var6; var6 += var7) {
                    var7 = var2.method1423(var6, var5.length + -var6, 1, var5);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class128.method831((byte) 48, new class194(var5));
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method1426(-10272);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)Lwd;")
    public static final class22 method1548(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        return var3 == null ? null : var3.field43;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)J")
    public static final long method1549(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field27; ++var4) {
                class70 var5 = var3.field37[var4];
                if ((var5.field1408 >> 29 & 3L) == 2L && var5.field1405 == arg1 && var5.field1403 == arg2) {
                    return var5.field1408;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[[I")
    public int[][] method174(int arg0, int arg1) {
        ++field4010;
        if (arg1 != 5) {
            field4002 = -97;
        }
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (super.field4509.field4346 && this.method1546((byte) -116)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = this.field4003 * (~class60.field1235 == ~this.field4009 ? arg0 : this.field4009 * arg0 / class60.field1235);
            if (class49.field1052 != this.field4003) {
                for (int var8 = 0; ~var8 > ~class49.field1052; ++var8) {
                    int var9 = this.field4003 * var8 / class49.field1052;
                    int var10 = this.field3999[var7 - -var9];
                    var5[var8] = class263.method1777(4080, var10 << 4);
                    var6[var8] = class263.method1777(4080, var10 >> 4);
                    var4[var8] = class263.method1777(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class49.field1052 > var11; ++var11) {
                    int var12 = this.field3999[var7++];
                    var5[var11] = class263.method1777(var12, 255) << 4;
                    var6[var11] = class263.method1777(4080, var12 >> 4);
                    var4[var11] = class263.method1777(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class228() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (~arg0 == -1) {
            this.field4011 = arg2.method1294((byte) 3);
        }
        if (arg1 != 5701) {
            field4004 = null;
        }
        ++field4006;
    }
}
