import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class64 extends class166 {

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    private int field1232 = 1;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    private int field1237 = 0;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    private int field1240 = 0;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1235 = new CRC32();

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "Lhj;")
    private static class69 field1238 = class181.method1318("Your ignore list is full)3 Max of 100 users)3", (byte) -119);

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "Lhj;")
    private static class69 field1244 = class181.method1318("Unable to find ", (byte) -110);

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "Lhj;")
    public static class69 field1241 = field1244;

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "Lhj;")
    public static class69 field1247 = field1238;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "Z")
    public static boolean field1246 = true;

    @OriginalMember(owner = "client!ri", name = "fb", descriptor = "Lhj;")
    private static class69 field1249 = class181.method1318("Loading config )2 ", (byte) -116);

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "Lhj;")
    public static class69 field1242 = field1249;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "[[[I")
    public static int[][][] field1243;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public static void method417(int arg0) {
        field1244 = null;
        field1249 = null;
        field1247 = null;
        field1238 = null;
        field1242 = null;
        field1243 = null;
        field1241 = null;
        if (arg0 != -7) {
            method420(-36, true);
        }
        field1235 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([BI)V")
    public static final void method418(byte[] arg0, int arg1) {
        ++field1233;
        class128 var2 = new class128(arg0);
        var2.field2379 = arg0.length - 2;
        class196.field3573 = var2.method912(50);
        class69.field1350 = new int[class196.field3573];
        class138.field2585 = new int[class196.field3573];
        class270.field4788 = new boolean[class196.field3573];
        class157.field2919 = new byte[class196.field3573][];
        class113.field2167 = new int[class196.field3573];
        class45.field645 = new byte[class196.field3573][];
        class88.field1682 = new int[class196.field3573];
        var2.field2379 = arg0.length + -(class196.field3573 * 8) + -7;
        class229.field4196 = var2.method912(87);
        class53.field941 = var2.method912(-80);
        int var3 = (255 & var2.method937(false)) + 1;
        for (int var4 = 0; var4 < class196.field3573; ++var4) {
            class138.field2585[var4] = var2.method912(-84);
        }
        int var5 = 81 % ((arg1 - -11) / 45);
        for (int var6 = 0; var6 < class196.field3573; ++var6) {
            class88.field1682[var6] = var2.method912(-104);
        }
        for (int var7 = 0; ~var7 > ~class196.field3573; ++var7) {
            class69.field1350[var7] = var2.method912(125);
        }
        for (int var8 = 0; ~var8 > ~class196.field3573; ++var8) {
            class113.field2167[var8] = var2.method912(-86);
        }
        var2.field2379 = arg0.length + -(class196.field3573 * 8) + -((var3 - 1) * 3) + -7;
        class50.field841 = new int[var3];
        for (int var9 = 1; ~var3 < ~var9; ++var9) {
            class50.field841[var9] = var2.method952((byte) -97);
            if (class50.field841[var9] == 0) {
                class50.field841[var9] = 1;
            }
        }
        var2.field2379 = 0;
        for (int var10 = 0; var10 < class196.field3573; ++var10) {
            int var11 = class113.field2167[var10];
            int var12 = class69.field1350[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            boolean var15 = false;
            class157.field2919[var10] = var14;
            byte[] var16 = new byte[var13];
            class45.field645[var10] = var16;
            int var17 = var2.method937(false);
            if (~(1 & var17) != -1) {
                int var18 = 0;
                label88: while (true) {
                    if (var18 >= var12) {
                        if ((2 & var17) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (~var12 >= ~var19) {
                                break label88;
                            }
                            for (int var20 = 0; ~var11 < ~var20; ++var20) {
                                byte var21 = var16[var12 * var20 + var19] = var2.method950(1495791448);
                                var15 |= var21 != -1;
                            }
                            ++var19;
                        }
                    }
                    for (int var22 = 0; ~var11 < ~var22; ++var22) {
                        var14[var18 - -(var12 * var22)] = var2.method950(1495791448);
                    }
                    ++var18;
                }
            } else {
                for (int var23 = 0; var23 < var13; ++var23) {
                    var14[var23] = var2.method950(1495791448);
                }
                if ((var17 & 2) != 0) {
                    for (int var24 = 0; ~var13 < ~var24; ++var24) {
                        byte var25 = var16[var24] = var2.method950(1495791448);
                        var15 |= var25 != -1;
                    }
                }
            }
            class270.field4788[var10] = var15;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 != 96) {
            this.method16(29);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field1232 = arg1.method937(false);
                }
            } else {
                this.field1237 = arg1.method937(false);
            }
        } else {
            this.field1240 = arg1.method937(false);
        }
        ++field1239;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class64() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(III)Z")
    public static final boolean method419(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class12.field143; ++var3) {
            class192 var4 = class233.field4258[var3];
            if (var4.field3489 == 1) {
                int var5 = var4.field3468 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3488 * var5 >> 8) + var4.field3472;
                    int var7 = (var4.field3493 * var5 >> 8) + var4.field3475;
                    int var8 = (var4.field3476 * var5 >> 8) + var4.field3481;
                    int var9 = (var4.field3485 * var5 >> 8) + var4.field3490;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3489 == 2) {
                int var10 = arg0 - var4.field3468;
                if (var10 > 0) {
                    int var11 = (var4.field3488 * var10 >> 8) + var4.field3472;
                    int var12 = (var4.field3493 * var10 >> 8) + var4.field3475;
                    int var13 = (var4.field3476 * var10 >> 8) + var4.field3481;
                    int var14 = (var4.field3485 * var10 >> 8) + var4.field3490;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3489 == 3) {
                int var15 = var4.field3472 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3469 * var15 >> 8) + var4.field3468;
                    int var17 = (var4.field3484 * var15 >> 8) + var4.field3471;
                    int var18 = (var4.field3476 * var15 >> 8) + var4.field3481;
                    int var19 = (var4.field3485 * var15 >> 8) + var4.field3490;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3489 == 4) {
                int var20 = arg2 - var4.field3472;
                if (var20 > 0) {
                    int var21 = (var4.field3469 * var20 >> 8) + var4.field3468;
                    int var22 = (var4.field3484 * var20 >> 8) + var4.field3471;
                    int var23 = (var4.field3476 * var20 >> 8) + var4.field3481;
                    int var24 = (var4.field3485 * var20 >> 8) + var4.field3490;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3489 == 5) {
                int var25 = arg1 - var4.field3481;
                if (var25 > 0) {
                    int var26 = (var4.field3469 * var25 >> 8) + var4.field3468;
                    int var27 = (var4.field3484 * var25 >> 8) + var4.field3471;
                    int var28 = (var4.field3488 * var25 >> 8) + var4.field3472;
                    int var29 = (var4.field3493 * var25 >> 8) + var4.field3475;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            method418((byte[]) null, 33);
        }
        ++field1234;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int var4 = class13.field187[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class253.field4565 > var6; ++var6) {
                int var7 = class24.field347[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field1240 == -1) {
                    var9 = (-var4 + var7) * this.field1232;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field1232 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field1237 == -1) {
                    var12 = class206.field3767[var12 >> 4 & 255] + 4096 >> 1;
                } else if (this.field1237 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V")
    public static final void method420(int arg0, boolean arg1) {
        ++field1248;
        if (!arg1) {
            field1246 = false;
        }
        class166.field3055.method1708(-1009973721, arg0);
        class235.field4284.method1708(-1009973721, arg0);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        class243.method1728(-127);
        ++field1236;
        int var2 = 65 / ((58 - arg0) / 50);
    }
}
