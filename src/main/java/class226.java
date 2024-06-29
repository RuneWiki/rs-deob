import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class226 extends class304 {

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    private int field3450 = 0;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    private int field3456 = 1;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    private int field3460 = 0;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "[I")
    public static int[] field3455 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "F")
    public static float field3453;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "Ljd;")
    public static class95 field3462;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "[I")
    public static int[] field3459;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V", line = 4)
    public static void method1606(int arg0) {
        field3459 = null;
        if (arg0 > 112) {
            field3455 = null;
            field3462 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)Lqh;", line = 16)
    public static final class32 method1607(int arg0, int arg1) {
        field3454++;
        class32 var2 = (class32) class94.field1330.method747((long) arg1, (byte) 112);
        int var3 = -107 % ((arg0 + 65) / 54);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class65.field942.method696(class39.method301(arg1, (byte) -117), (byte) 125, class300.method2068((byte) -101, arg1));
        class32 var5 = new class32();
        var5.field404 = arg1;
        if (var4 != null) {
            var5.method248(new class254(var4), (byte) 127);
        }
        var5.method256(85);
        if (var5.field437) {
            var5.field466 = 0;
            var5.field405 = false;
        }
        if (!class248.field3729 && var5.field474) {
            var5.field415 = null;
        }
        class94.field1330.method744(var5, -15692, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 51)
    public class226() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lwm;II)V", line = 55)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field3458++;
        if (arg2 != -2828) {
            method1608((class254) null, -12);
        }
        if (arg1 == 0) {
            this.field3460 = arg0.method1774((byte) -112);
        } else if (arg1 == 1) {
            this.field3450 = arg0.method1774((byte) -114);
        } else if (arg1 == 3) {
            this.field3456 = arg0.method1774((byte) 5);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lwm;I)V", line = 98)
    public static final void method1608(class254 arg0, int arg1) {
        field3457++;
        if (arg1 != 64) {
            return;
        }
        while (true) {
            while (arg0.field3840.length > arg0.field3866) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1774((byte) -109) == 1) {
                    var3 = arg0.method1774((byte) -93);
                    var2 = true;
                    var4 = arg0.method1774((byte) 24);
                }
                int var5 = arg0.method1774((byte) 117);
                int var6 = arg0.method1774((byte) 127);
                int var7 = var5 * 64 - class196.field3024;
                int var8 = -(var6 * 64) - (1 - class176.field2822 - class229.field3494);
                if (var7 >= 0 && (var8 - 63) >= 0 && class243.field3691 > var7 + 63 && var8 < class229.field3494) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < (var3 * 8 + 8) && var12 >= var4 * 8 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg0.method1733(2023893896);
                                if (var13 != 0) {
                                    if (class209.field3194[var9][var10] == null) {
                                        class209.field3194[var9][var10] = new byte[4096];
                                    }
                                    class209.field3194[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1733(2023893896);
                                    if (class240.field3653[var9][var10] == null) {
                                        class240.field3653[var9][var10] = new byte[4096];
                                    }
                                    class240.field3653[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1733(2023893896);
                        if (var16 != 0) {
                            arg0.field3866++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 194)
    public final void method100(boolean arg0) {
        field3464++;
        class32.method251(-102);
        if (!arg0) {
            field3459 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZI)V", line = 213)
    public static final void method1609(int arg0, boolean arg1, boolean arg2, int arg3) {
        int var10002;
        for (int var4 = 0; var4 < class52.field702; var4++) {
            class76 var5 = class264.field4064[class272.field4252[var4]];
            if (var5 != null && var5.method598(-75) && var5.field1104.method2316(-1)) {
                int var6 = var5.method1897(8);
                if (arg2) {
                    if (!var5.field1104.field5165) {
                        continue;
                    }
                } else if (arg1 != var5.field1104.field5187 || arg3 != 0 && arg3 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field4713 & 0x7F) == 64 && (var5.field4731 & 0x7F) == 64) {
                        int var7 = var5.field4713 >> 7;
                        int var8 = var5.field4731 >> 7;
                        if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                            var10002 = class112.field1694[var7][var8]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field4713 & 0x7F) == 0 && (var5.field4731 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field4713 & 0x7F) == 64 && (var5.field4731 & 0x7F) == 64)) {
                    int var9 = var5.field4731 - (var6 * 64) >> 7;
                    int var10 = var5.field4713 - (var6 * 64) >> 7;
                    int var11 = var5.method1897(8) + var10;
                    int var12 = var9 + var5.method1897(8);
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    for (int var13 = var10; var13 < var11; var13++) {
                        for (int var14 = var9; var14 < var12; var14++) {
                            var10002 = class112.field1694[var13][var14]++;
                        }
                    }
                }
            }
        }
        int var15 = -9 / ((17 - arg0) / 46);
        label216: for (int var16 = 0; var16 < class52.field702; var16++) {
            class76 var17 = class264.field4064[class272.field4252[var16]];
            long var18 = (long) class272.field4252[var16] << 32 | 0x20000000L;
            if (var17 != null && var17.method598(-68) && var17.field1104.method2316(-1)) {
                int var20 = var17.method1897(8);
                if (arg2) {
                    if (!var17.field1104.field5165) {
                        continue;
                    }
                } else if (arg1 != var17.field1104.field5187 || arg3 != 0 && arg3 != var20) {
                    continue;
                }
                var17.field4680 = true;
                if (var20 == 1) {
                    if ((var17.field4713 & 0x7F) == 64 && (var17.field4731 & 0x7F) == 64) {
                        int var30 = var17.field4713 >> 7;
                        int var31 = var17.field4731 >> 7;
                        if (var30 < 0 || var30 >= 104 || var31 < 0 || var31 >= 104) {
                            continue;
                        }
                        if (class112.field1694[var30][var31] > 1) {
                            var10002 = class112.field1694[var30][var31]--;
                            continue;
                        }
                    }
                } else if ((var20 & 0x1) == 0 && (var17.field4713 & 0x7F) == 0 && (var17.field4731 & 0x7F) == 0 || (var20 & 0x1) == 1 && (var17.field4713 & 0x7F) == 64 && (var17.field4731 & 0x7F) == 64) {
                    int var21 = var17.field4713 - var20 * 64 >> 7;
                    int var22 = var20 + var21;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    int var23 = var17.field4731 - (var20 * 64) >> 7;
                    int var24 = var23 + var20;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    boolean var25 = true;
                    for (int var26 = var21; var26 < var22; var26++) {
                        for (int var27 = var23; var27 < var24; var27++) {
                            if (class112.field1694[var26][var27] <= 1) {
                                var25 = false;
                                break;
                            }
                        }
                    }
                    if (var25) {
                        int var28 = var21;
                        while (true) {
                            if (var22 <= var28) {
                                continue label216;
                            }
                            for (int var29 = var23; var29 < var24; var29++) {
                                var10002 = class112.field1694[var28][var29]--;
                            }
                            var28++;
                        }
                    }
                }
                var17.field4680 = false;
                if (!var17.field1104.field5139) {
                    var18 |= Long.MIN_VALUE;
                }
                var17.field4732 = class328.method2291(class265.field4112, var17.field4731, var17.field4713, 122);
                class114.method874(class265.field4112, var17.field4713, var17.field4731, var17.field4732, (var20 - 1) * 64 + 60, var17, var17.field4682, var18, var17.field4683);
            }
        }
        field3461++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I", line = 467)
    public final int[] method71(int arg0, int arg1) {
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (arg0 != 7) {
            field3455 = (int[]) null;
        }
        field3452++;
        if (this.field4669.field5223) {
            int var4 = class84.field1225[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class218.field3333; var6++) {
                int var7 = class162.field2631[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field3460 == 0) {
                    var9 = (var7 - var4) * this.field3456;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3456 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field3450 == 0) {
                    var12 = class307.field4784[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field3450 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
