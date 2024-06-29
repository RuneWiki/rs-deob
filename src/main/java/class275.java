import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class275 extends class23 {

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    private int field4572 = 5;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "[S")
    private short[] field4567 = new short[512];

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
    private int field4579 = 1;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    private int field4571 = 2048;

    @OriginalMember(owner = "client!j", name = "ob", descriptor = "I")
    private int field4583 = 0;

    @OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
    private int field4584 = 2;

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "[B")
    private byte[] field4576 = new byte[512];

    @OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
    private int field4582 = 5;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "[I")
    public static int[] field4568 = new int[1000];

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!j", name = "qb", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!j", name = "rb", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!j", name = "sb", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "Lke;")
    public static class107 field4573;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Lp;")
    public static class94 field4570;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 12)
    private final void method1910(int arg0) {
        field4586++;
        Random var2 = new Random((long) this.field4583);
        this.field4567 = new short[512];
        if (this.field4571 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4567[var3] = (short) class110.method830((byte) -112, var2, this.field4571);
            }
        }
        if (arg0 >= -37) {
            method1913(-95, 118, 34);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILsd;)V", line = 45)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field4569++;
        if (arg0 == 0) {
            this.field4582 = this.field4572 = arg2.method226(255);
        } else if (arg0 == 1) {
            this.field4583 = arg2.method226(255);
        } else if (arg0 == 2) {
            this.field4571 = arg2.method197(-1);
        } else if (arg0 == 3) {
            this.field4584 = arg2.method226(255);
        } else if (arg0 == 4) {
            this.field4579 = arg2.method226(arg1 ^ 0xFF);
        } else if (arg0 == 5) {
            this.field4582 = arg2.method226(arg1 + 255);
        } else if (arg0 == 6) {
            this.field4572 = arg2.method226(255);
        }
        if (arg1 != 0) {
            field4581 = -9;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)[I", line = 123)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            this.field4572 = -94;
        }
        int[] var3 = this.field403.method724((byte) 113, arg1);
        field4578++;
        if (this.field403.field1760) {
            int var4 = (class150.field2509[arg1] * this.field4572) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class52.field1007; var7++) {
                class95.field1720 = Integer.MAX_VALUE;
                class53.field1026 = Integer.MAX_VALUE;
                class177.field2922 = Integer.MAX_VALUE;
                class267.field4452 = Integer.MAX_VALUE;
                int var8 = class315.field5345[var7] * this.field4582 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field4576[(this.field4572 <= var11 ? var11 - this.field4572 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field4576[(var13 < this.field4582 ? var13 : var13 - this.field4582) + var12 & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field4567[var14] - (var13 << 12);
                        int var16 = var4 - (var11 << 12) - this.field4567[var27];
                        int var17 = this.field4579;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 >= 0 ? var15 : -var15;
                            int var25 = var16 >= 0 ? var16 : -var16;
                            var18 = var24 > var25 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var15 * var15;
                            int var20 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class267.field4452 > var18) {
                            class95.field1720 = class53.field1026;
                            class53.field1026 = class177.field2922;
                            class177.field2922 = class267.field4452;
                            class267.field4452 = var18;
                        } else if (var18 < class177.field2922) {
                            class95.field1720 = class53.field1026;
                            class53.field1026 = class177.field2922;
                            class177.field2922 = var18;
                        } else if (class53.field1026 > var18) {
                            class95.field1720 = class53.field1026;
                            class53.field1026 = var18;
                        } else if (var18 < class95.field1720) {
                            class95.field1720 = var18;
                        }
                    }
                }
                int var26 = this.field4584;
                if (var26 == 0) {
                    var3[var7] = class267.field4452;
                } else if (var26 == 1) {
                    var3[var7] = class177.field2922;
                } else if (var26 == 3) {
                    var3[var7] = class53.field1026;
                } else if (var26 == 4) {
                    var3[var7] = class95.field1720;
                } else if (var26 == 2) {
                    var3[var7] = class177.field2922 - class267.field4452;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 439)
    public class275() {
        super(0, true);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(BI)I", line = 344)
    public static final int method1911(byte arg0, int arg1) {
        if (arg0 <= 57) {
            field4568 = (int[]) null;
        }
        field4585++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIII)I", line = 363)
    public static final int method1912(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 94) {
            return 33;
        }
        field4580++;
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        return (arg2 >> 5 << 7) + ((arg3 >> 2 << 10) + (arg1 >> 1));
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)Lhf;", line = 392)
    public static final class193 method1913(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field216; var4++) {
            class193 var5 = var3.field230[var4];
            if ((var5.field3101 >> 29 & 0x3L) == 2L && var5.field3107 == arg1 && var5.field3108 == arg2) {
                class7.method39(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(III)Lak;", line = 428)
    public static final class302 method1914(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class302 var4 = var3.field235;
            var3.field235 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 456)
    public final void method61(byte arg0) {
        field4574++;
        if (arg0 != 4) {
            method1913(-77, 13, 92);
        }
        this.field4576 = class122.method923(this.field4583, 70);
        this.method1910(arg0 ^ 0xFFFFFFA2);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V", line = 468)
    public static void method1915(boolean arg0) {
        if (arg0) {
            field4570 = (class94) null;
        }
        field4570 = null;
        field4568 = null;
        field4573 = null;
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V", line = 483)
    public static final void method1916(int arg0) {
        if (arg0 != 2048) {
            field4575 = 37;
        }
        class285.field4795.method1347(arg0 - 2048);
        class104.field1843.method1347(0);
        field4577++;
    }
}
