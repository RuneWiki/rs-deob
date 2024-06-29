import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class14 extends class120 {

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    private int field179 = 1365;

    @OriginalMember(owner = "client!ml", name = "eb", descriptor = "I")
    private int field185 = 20;

    @OriginalMember(owner = "client!ml", name = "hb", descriptor = "I")
    private int field188 = 0;

    @OriginalMember(owner = "client!ml", name = "ib", descriptor = "I")
    private int field189 = 0;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "S")
    public static short field177 = 256;

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "Z")
    public static boolean field181 = true;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "Lok;")
    public static class41 field178 = class137.method956("<img=0>", 45);

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ml", name = "cb", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ml", name = "db", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ml", name = "fb", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ml", name = "gb", descriptor = "[[B")
    public static byte[][] field187;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZI)I", line = 5)
    public static final int method61(int arg0, int arg1, boolean arg2, int arg3) {
        field180++;
        class306 var4 = (class306) class186.field3031.method617((long) arg3, false);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg0 != 31) {
            method63(-106, -61);
        }
        for (int var6 = 0; var6 < var4.field5125.length; var6++) {
            if (var4.field5125[var6] >= 0 && var4.field5125[var6] < class213.field3435) {
                class138 var7 = class130.method918(var4.field5125[var6], arg0 ^ 0xFFFFFF98);
                if (var7.field2057 != null) {
                    class55 var8 = (class55) var7.field2057.method617((long) arg1, false);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field5130[var6] * var8.field804;
                        } else {
                            var5 += var8.field804;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)[I", line = 53)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            return (int[]) null;
        }
        field183++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            for (int var4 = 0; var4 < class307.field5160; var4++) {
                int var5 = (class203.field3278[var4] << 12) / this.field179 + this.field188;
                int var6 = (class16.field216[arg0] << 12) / this.field179 + this.field189;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field185 > var13) {
                    var13++;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 + var7 - var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= this.field185 - 1 ? 0 : (var13 << 12) / this.field185;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Llb;II)V", line = 110)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return;
        }
        field175++;
        if (arg2 == 0) {
            this.field179 = arg0.method759((byte) -79);
        } else if (arg2 == 1) {
            this.field185 = arg0.method759((byte) -101);
        } else if (arg2 == 2) {
            this.field188 = arg0.method759((byte) -99);
        } else if (arg2 == 3) {
            this.field189 = arg0.method759((byte) -86);
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(III)J", line = 163)
    public static final long method62(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        return var3 == null || var3.field5207 == null ? 0L : var3.field5207.field1508;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 227)
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)Lkb;", line = 184)
    public static final class85 method63(int arg0, int arg1) {
        field186++;
        class85 var2 = (class85) class22.field330.method136((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 17511) {
            method61(81, -29, true, 5);
        }
        byte[] var3 = class109.field1523.method454(class305.method2098((byte) 23, arg1), 0, class311.method2155(arg1, arg0 - 17606));
        class85 var4 = new class85();
        if (var3 != null) {
            var4.method605(-1, new class112(var3));
        }
        class22.field330.method132((long) arg1, var4, arg0 ^ 0xFFFFBB98);
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLok;Lok;Lok;I)V", line = 212)
    public static final void method64(byte arg0, class41 arg1, class41 arg2, class41 arg3, int arg4) {
        class107.method728(201, arg3, -1, arg2, arg4, arg1);
        int var5 = -105 / ((arg0 + 42) / 53);
        field174++;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V", line = 235)
    public static void method65(int arg0) {
        field187 = (byte[][]) null;
        field178 = null;
        if (arg0 > -28) {
            method63(-57, -2);
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V", line = 246)
    public static final void method66(byte arg0) {
        field176++;
        int var1 = class239.field3833;
        int var2 = class109.field1528;
        int var3 = 6116423;
        int var4 = class228.field3637;
        int var5 = class117.field1717;
        if (class166.field2625) {
            class190.method1363(var1, var2, var5, var4, var3);
            class190.method1363(var1 + 1, var2 - -1, var5 - 2, 16, 0);
            class190.method1361(var1 + 1, var2 - -18, var5 - 2, var4 + -19, 0);
        } else {
            class54.method383(var1, var2, var5, var4, var3);
            class54.method383(var1 + 1, var2 - -1, var5 - 2, 16, 0);
            class54.method378(var1 + 1, var2 - -18, var5 - 2, var4 + -19, 0);
        }
        class140.field2165.method1788(class51.field773, var1 + 3, var2 + 14, var3, -1);
        int var6 = class53.field789;
        int var7 = class129.field1929;
        int var8 = 0;
        if (arg0 > -11) {
            field177 = 8;
        }
        while (var8 < class98.field1432) {
            int var9 = 16777215;
            int var10 = (class98.field1432 - var8 - 1) * 15 + var2 + 31;
            if (var7 > var1 && var1 + var5 > var7 && var6 > (var10 - 13) && var6 < (var10 + 3)) {
                var9 = 16776960;
            }
            class140.field2165.method1788(class129.method901(var8, 3975), var1 + 3, var10, var9, 0);
            var8++;
        }
        class104.method721(class117.field1717, -1, class228.field3637, class239.field3833, class109.field1528);
    }
}
