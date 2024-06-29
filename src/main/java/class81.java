import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class81 extends class270 {

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    private int field1357 = 0;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    private int field1351 = 5;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    private int field1356 = 2;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "[S")
    private short[] field1353 = new short[512];

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
    private int field1358 = 5;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "[B")
    private byte[] field1344 = new byte[512];

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    private int field1343 = 2048;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    private int field1346 = 1;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field1348 = 100;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "Lmh;")
    public static class62 field1360 = class201.method1405(true, "Standort");

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Lsg;")
    public static class191 field1354 = null;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Ltc;")
    public static class263 field1345 = new class263();

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
    public static int field1361 = 10;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 5)
    private final void method622(int arg0) {
        field1359++;
        Random var2 = new Random((long) this.field1357);
        this.field1353 = new short[512];
        if (arg0 < this.field1343) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field1353[var3] = (short) class73.method525(this.field1343, var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZIII)V", line = 30)
    public static final void method623(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class232.method1639(arg1, 98);
        field1352++;
        int var7 = arg1 - arg5;
        int var8 = arg1;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = 0;
        int var10 = var7;
        int var11 = -arg1;
        int var12 = -var7;
        int var13 = -1;
        int[] var14 = class282.field4817[arg6];
        int var15 = -1;
        if (arg3) {
            method626((byte[]) null, (byte) 113);
        }
        int var16 = arg4 - var7;
        class271.method1861(arg0, !arg3, var14, var16, arg4 - arg1);
        int var17 = arg4 + var7;
        class271.method1861(arg2, true, var14, var17, var16);
        class271.method1861(arg0, true, var14, arg1 + arg4, var17);
        while (var9 < var8) {
            var15 += 2;
            var11 += var15;
            var13 += 2;
            var12 += var13;
            if (var12 >= 0 && var10 >= 1) {
                class209.field3539[var10] = var9;
                var10--;
                var12 -= var10 << 1;
            }
            var9++;
            if (var11 >= 0) {
                var8--;
                var11 -= var8 << 1;
                if (var7 > var8) {
                    int[] var18 = class282.field4817[arg6 + var8];
                    int[] var19 = class282.field4817[arg6 - var8];
                    int var20 = class209.field3539[var8];
                    int var21 = arg4 + var9;
                    int var22 = arg4 - var9;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class271.method1861(arg0, !arg3, var18, var24, var22);
                    class271.method1861(arg2, !arg3, var18, var23, var24);
                    class271.method1861(arg0, true, var18, var21, var23);
                    class271.method1861(arg0, true, var19, var24, var22);
                    class271.method1861(arg2, true, var19, var23, var24);
                    class271.method1861(arg0, true, var19, var21, var23);
                } else {
                    int[] var25 = class282.field4817[arg6 + var8];
                    int var26 = arg4 + var9;
                    int[] var27 = class282.field4817[arg6 - var8];
                    int var28 = arg4 - var9;
                    class271.method1861(arg0, true, var25, var26, var28);
                    class271.method1861(arg0, true, var27, var26, var28);
                }
            }
            int[] var29 = class282.field4817[arg6 + var9];
            int[] var30 = class282.field4817[arg6 - var9];
            int var31 = arg4 + var8;
            int var32 = arg4 - var8;
            if (var9 < var7) {
                int var33 = var9 > var10 ? class209.field3539[var9] : var10;
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class271.method1861(arg0, true, var29, var35, var32);
                class271.method1861(arg2, true, var29, var34, var35);
                class271.method1861(arg0, true, var29, var31, var34);
                class271.method1861(arg0, true, var30, var35, var32);
                class271.method1861(arg2, !arg3, var30, var34, var35);
                class271.method1861(arg0, true, var30, var31, var34);
            } else {
                class271.method1861(arg0, true, var29, var31, var32);
                class271.method1861(arg0, !arg3, var30, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 161)
    public static void method624(int arg0) {
        field1345 = null;
        field1360 = null;
        field1354 = null;
        if (arg0 != 2) {
            method625(12, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I", line = 174)
    public final int[] method6(int arg0, int arg1) {
        field1355++;
        if (arg0 != 18693) {
            return (int[]) null;
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int var4 = class166.field2702[arg1] * this.field1358 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class109.field1770; var7++) {
                class198.field3348 = Integer.MAX_VALUE;
                class71.field1082 = Integer.MAX_VALUE;
                class98.field1623 = Integer.MAX_VALUE;
                class191.field3179 = Integer.MAX_VALUE;
                int var8 = (class283.field4840[var7] * this.field1351) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field1344[(this.field1358 <= var11 ? var11 - this.field1358 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field1344[(var13 < this.field1351 ? var13 : var13 - this.field1351) + var12 & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 + var8 - this.field1353[var14];
                        int var16 = var4 - this.field1353[var27] - (var11 << 12);
                        int var17 = this.field1346;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 >= 0 ? var16 : -var16;
                            int var25 = var15 < 0 ? -var15 : var15;
                            var18 = var25 > var24 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var19 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var20 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var21 = var19 + var20;
                            var18 = var21 * var21 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 < 0 ? -var16 : var16) + (var15 < 0 ? -var15 : var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class191.field3179) {
                            class198.field3348 = class71.field1082;
                            class71.field1082 = class98.field1623;
                            class98.field1623 = class191.field3179;
                            class191.field3179 = var18;
                        } else if (var18 < class98.field1623) {
                            class198.field3348 = class71.field1082;
                            class71.field1082 = class98.field1623;
                            class98.field1623 = var18;
                        } else if (var18 < class71.field1082) {
                            class198.field3348 = class71.field1082;
                            class71.field1082 = var18;
                        } else if (var18 < class198.field3348) {
                            class198.field3348 = var18;
                        }
                    }
                }
                int var26 = this.field1356;
                if (var26 == 0) {
                    var3[var7] = class191.field3179;
                } else if (var26 == 1) {
                    var3[var7] = class98.field1623;
                } else if (var26 == 3) {
                    var3[var7] = class71.field1082;
                } else if (var26 == 4) {
                    var3[var7] = class198.field3348;
                } else if (var26 == 2) {
                    var3[var7] = class98.field1623 - class191.field3179;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lmi;II)V", line = 394)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field1350++;
        int var4 = 82 / ((arg2 + 8) / 53);
        if (arg1 == 0) {
            this.field1351 = this.field1358 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field1357 = arg0.method702(-1);
        } else if (arg1 == 2) {
            this.field1343 = arg0.method721(106);
        } else if (arg1 == 3) {
            this.field1356 = arg0.method702(-1);
        } else if (arg1 == 4) {
            this.field1346 = arg0.method702(-1);
        } else if (arg1 == 5) {
            this.field1351 = arg0.method702(-1);
        } else if (arg1 == 6) {
            this.field1358 = arg0.method702(-1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)I", line = 475)
    public static final int method625(int arg0, byte arg1) {
        int var2 = 104 % ((41 - arg1) / 63);
        field1349++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 488)
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BB)[B", line = 499)
    public static final byte[] method626(byte[] arg0, byte arg1) {
        field1347++;
        if (arg1 != 69) {
            method625(-111, (byte) 107);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class231.method1635(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(B)V", line = 518)
    public final void method231(byte arg0) {
        if (arg0 != 90) {
            this.field1357 = -61;
        }
        field1362++;
        this.field1344 = class199.method1394(this.field1357, 0);
        this.method622(0);
    }
}
