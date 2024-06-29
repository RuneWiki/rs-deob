import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class69 extends class102 {

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    private int field1395 = -1;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "Lqe;")
    public static class179 field1385 = class206.method1380(")3", (byte) -127);

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Z")
    public static boolean field1378 = false;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lqe;")
    public static class179 field1390 = class206.method1380("Null", (byte) 80);

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "[I")
    public static int[] field1393 = new int[25];

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lqe;")
    public static class179 field1391 = class206.method1380("l", (byte) -127);

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "Lqe;")
    private static class179 field1389 = class206.method1380(" more options", (byte) 90);

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Lqe;")
    public static class179 field1381 = field1389;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "Lhi;")
    public static class85 field1380;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "[I")
    public int[] field1382;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lae;I)Z")
    public static final boolean method443(class6 arg0, int arg1) {
        ++field1388;
        if (arg0.field187 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg1 != 27948) {
                return true;
            } else {
                while (var2 < arg0.field187.length) {
                    int var3 = class226.method1480(123, arg0, var2);
                    int var4 = arg0.field76[var2];
                    if (~arg0.field187[var2] != -3) {
                        if (~arg0.field187[var2] == -4) {
                            if (~var4 <= ~var3) {
                                return false;
                            }
                        } else if (~arg0.field187[var2] == -5) {
                            if (var3 == var4) {
                                return false;
                            }
                        } else if (var3 != var4) {
                            return false;
                        }
                    } else if (var4 <= var3) {
                        return false;
                    }
                    ++var2;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I")
    public int[][] method14(int arg0, int arg1) {
        ++field1396;
        int[][] var3 = super.field1950.method598((byte) -31, arg0);
        if (super.field1950.field1724 && this.method447(5793)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class117.field2216 != ~this.field1379 ? this.field1379 * arg0 / class117.field2216 : arg0) * this.field1386;
            if (~class155.field2796 == ~this.field1386) {
                for (int var8 = 0; var8 < class155.field2796; ++var8) {
                    int var9 = this.field1382[var7++];
                    var6[var8] = class107.method696(255, var9) << 4;
                    var5[var8] = class107.method696(4080, var9 >> 4);
                    var4[var8] = class107.method696(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class155.field2796; ++var10) {
                    int var11 = this.field1386 * var10 / class155.field2796;
                    int var12 = this.field1382[var7 + var11];
                    var6[var10] = class107.method696(var12 << 4, 4080);
                    var5[var10] = class107.method696(4080, var12 >> 4);
                    var4[var10] = class107.method696(var12, 16711680) >> 12;
                }
            }
        }
        if (arg1 != 64) {
            this.method449(88);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILeh;I)Lnb;")
    public static final class143 method444(int arg0, int arg1, class52 arg2, int arg3) {
        if (arg1 != 26236) {
            method448((class52) null, true, 37, 127, (class52) null);
        }
        ++field1392;
        return !class77.method495(20480, arg3, arg0, arg2) ? null : class237.method1540(false);
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static void method445(int arg0) {
        field1391 = null;
        field1385 = null;
        field1390 = null;
        field1389 = null;
        if (arg0 != 0) {
            field1391 = null;
        }
        field1393 = null;
        field1380 = null;
        field1381 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public final void method446(int arg0) {
        ++field1383;
        super.method446(-108);
        if (arg0 > -56) {
            method448((class52) null, false, 70, -63, (class52) null);
        }
        this.field1382 = null;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        ++field1384;
        if (arg0 != 5793) {
            return true;
        } else if (this.field1382 != null) {
            return true;
        } else if (~this.field1395 <= -1) {
            class126 var2 = class172.method1092((byte) 116, this.field1395, class159.field2896);
            var2.method796();
            this.field1382 = var2.field2315;
            this.field1386 = var2.field2607;
            this.field1379 = var2.field2601;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Leh;ZIILeh;)Lfe;")
    public static final class60 method448(class52 arg0, boolean arg1, int arg2, int arg3, class52 arg4) {
        ++field1387;
        boolean var5 = true;
        int[] var6 = arg4.method363(arg3, false);
        for (int var7 = 0; ~var7 > ~var6.length; ++var7) {
            byte[] var8 = arg4.method341(var6[var7], arg2 + -65281, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 255 | var8[0] << 8 & 65280;
                byte[] var10;
                if (!arg1) {
                    var10 = arg0.method341(0, -1, var9);
                } else {
                    var10 = arg0.method341(var9, -1, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg2 != 65280) {
            method443((class6) null, 91);
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class60(arg4, arg0, arg3, arg1);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
    public final int method449(int arg0) {
        ++field1394;
        if (arg0 != -7615) {
            method443((class6) null, 0);
        }
        return this.field1395;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method14(-22, -39);
        }
        if (arg1 == 0) {
            this.field1395 = arg0.method1252(2);
        }
        ++field1397;
    }
}
