import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 extends class166 {

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    private int field436 = 2000;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    private int field447 = 0;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    private int field445 = 4096;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    private int field444 = 16;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    private int field449 = 0;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field443 = 0;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lhj;")
    public static class69 field448 = class181.method1318("leuchten3:", (byte) -116);

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "[[[Lka;")
    public static class243[][][] field437 = new class243[4][104][104];

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "Ljava/util/Random;")
    public static Random field439 = new Random();

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field440;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field445 = arg1.method912(-116);
                        }
                    } else {
                        this.field447 = arg1.method912(80);
                    }
                } else {
                    this.field444 = arg1.method937(false);
                }
            } else {
                this.field436 = arg1.method912(arg0 ^ -23);
            }
        } else {
            this.field449 = arg1.method937(false);
        }
        if (arg0 != 96) {
            method174((class83) null, (class83) null, -36);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            return null;
        } else {
            ++field435;
            int[] var3 = super.field3071.method1252(arg0, true);
            if (super.field3071.field3142) {
                int var4 = this.field445 >> 1;
                int[][] var5 = super.field3071.method1253((byte) -123);
                Random var6 = new Random((long) this.field449);
                for (int var7 = 0; var7 < this.field436; ++var7) {
                    int var8 = ~this.field445 >= -1 ? this.field447 : this.field447 - var4 - -client.method1149(arg1 ^ -8388508, this.field445, var6);
                    int var9 = (4088 & var8) >> 4;
                    int var10 = client.method1149(-127, class253.field4565, var6);
                    int var11 = client.method1149(34, class146.field2691, var6);
                    int var12 = (class244.field4476[var9] * this.field444 >> 12) + var10;
                    int var13 = (class206.field3767[var9] * this.field444 >> 12) + var11;
                    int var14 = var13 - var11;
                    int var15 = var12 - var10;
                    if (~var15 != -1 || ~var14 != -1) {
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        boolean var16 = ~var14 < ~var15;
                        if (var16) {
                            int var17 = var12;
                            int var18 = var10;
                            var10 = var11;
                            var11 = var18;
                            var12 = var13;
                            var13 = var17;
                        }
                        if (var10 > var12) {
                            int var19 = var10;
                            var10 = var12;
                            var12 = var19;
                            int var20 = var11;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = -var10 + var12;
                        int var22 = var11;
                        int var23 = -var11 + var13;
                        int var24 = -var21 / 2;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var25 = 2048 / var21;
                        int var26 = -(client.method1149(arg1 ^ -8388521, 4096, var6) >> 2) + 1024;
                        int var27 = var11 < var13 ? 1 : -1;
                        for (int var28 = var10; var28 < var12; ++var28) {
                            var24 += var23;
                            int var29 = var26 + 1024 - -((-var10 + var28) * var25);
                            int var30 = class138.field2583 & var22;
                            int var31 = class12.field183 & var28;
                            if (!var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            if (~var24 < -1) {
                                var22 -= -var27;
                                var24 -= var21;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
    public static void method173(byte arg0) {
        field437 = null;
        field448 = null;
        if (arg0 == -122) {
            field439 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lnc;Lnc;I)V")
    public static final void method174(class83 arg0, class83 arg1, int arg2) {
        class90.field1708 = arg1;
        class24.field343 = arg0;
        if (arg2 != -14826) {
            field443 = 8;
        }
        ++field438;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
    public static final void method175(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field446;
        int var5 = -arg0;
        if (arg3 != 2) {
            method176(-26, 36, 110);
        }
        int var6 = 0;
        int var7 = arg0;
        int var8 = -1;
        int var9 = class240.method1700(class35.field485, arg2 - -arg0, 127, class201.field3629);
        int var10 = class240.method1700(class35.field485, -arg0 + arg2, -5, class201.field3629);
        class99.method740(arg1, class186.field3402[arg4], -1162793114, var9, var10);
        while (var6 < var7) {
            var8 += 2;
            var5 += var8;
            if (~var5 < -1) {
                --var7;
                var5 -= var7 << 1;
                int var11 = arg4 - var7;
                int var12 = arg4 + var7;
                if (~class19.field252 >= ~var12 && var11 <= class166.field3075) {
                    int var13 = class240.method1700(class35.field485, arg2 + var6, -94, class201.field3629);
                    int var14 = class240.method1700(class35.field485, -var6 + arg2, arg3 ^ 124, class201.field3629);
                    if (var12 <= class166.field3075) {
                        class99.method740(arg1, class186.field3402[var12], -1162793114, var13, var14);
                    }
                    if (~class19.field252 >= ~var11) {
                        class99.method740(arg1, class186.field3402[var11], -1162793114, var13, var14);
                    }
                }
            }
            ++var6;
            int var15 = arg4 + var6;
            int var16 = arg4 - var6;
            if (class19.field252 <= var15 && var16 <= class166.field3075) {
                int var17 = class240.method1700(class35.field485, arg2 + var7, -61, class201.field3629);
                int var18 = class240.method1700(class35.field485, -var7 + arg2, arg3 + 123, class201.field3629);
                if (~var15 >= ~class166.field3075) {
                    class99.method740(arg1, class186.field3402[var15], arg3 ^ -1162793116, var17, var18);
                }
                if (var16 >= class19.field252) {
                    class99.method740(arg1, class186.field3402[var16], -1162793114, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(III)Lge;")
    public static final class68 method176(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class68 var4 = var3.field3949;
            var3.field3949 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        ++field442;
        int var2 = -91 / ((arg0 - 58) / 50);
        class243.method1728(-94);
    }
}
