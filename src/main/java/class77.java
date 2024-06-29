import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class77 extends class215 {

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "[I")
    private int[] field957 = new int[3];

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    private int field960 = 3216;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    private int field966 = 4096;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
    private int field973 = 3216;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Ljava/lang/String;")
    public static String field965 = null;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
    public static int[] field959 = new int[64];

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "[I")
    public static int[] field971 = new int[50];

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
    public static int field972 = 0;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "J")
    public static long field958 = 0L;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            field959 = null;
        }
        ++field967;
        int[] var3 = super.field3445.method1755(arg0, (byte) 97);
        if (super.field3445.field4163) {
            int var4 = class211.field3394 * this.field966 >> 12;
            int[] var5 = this.method1503(arg1 ^ -256, 0, class83.field1026 & arg0 + -1);
            int[] var6 = this.method1503(arg1 ^ -256, 0, arg0);
            int[] var7 = this.method1503(-1, 0, class83.field1026 & arg0 + 1);
            for (int var8 = 0; class244.field4015 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                if (var10 < 0) {
                    var10 = -var10;
                }
                int var11 = (var6[class118.field1673 & var8 + -1] + -var6[class118.field1673 & var8 - -1]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (var10 > 255) {
                    var10 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class28.field401[var12 - -((var10 + 1) * var10 >> 1)] & 255;
                int var14 = var11 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field957[0] * var14 >> 12;
                int var18 = this.field957[1] * var16 >> 12;
                int var19 = this.field957[2] * var15 >> 12;
                var3[var8] = var17 + var19 - -var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(II)I")
    public static final int method429(int arg0, int arg1) {
        int var2 = arg0 >>> 1;
        if (arg1 != 1) {
            field958 = -62L;
        }
        ++field962;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
    private final void method430(byte arg0) {
        ++field961;
        double var2 = Math.cos((double) ((float) this.field960 / 4096.0F));
        this.field957[0] = (int) (Math.sin((double) ((float) this.field973 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 <= 18) {
            field959 = null;
        }
        this.field957[1] = (int) (4096.0D * Math.cos((double) ((float) this.field973 / 4096.0F)) * var2);
        this.field957[2] = (int) (4096.0D * Math.sin((double) ((float) this.field960 / 4096.0F)));
        int var4 = this.field957[0] * this.field957[0] >> 12;
        int var5 = this.field957[2] * this.field957[2] >> 12;
        int var6 = this.field957[1] * this.field957[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 - -var5 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field957[2] = (this.field957[2] << 12) / var7;
            this.field957[0] = (this.field957[0] << 12) / var7;
            this.field957[1] = (this.field957[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field964;
        if (arg0 == 1521146348) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field960 = arg2.method549(255);
                    }
                } else {
                    this.field973 = arg2.method549(arg0 + -1521146093);
                }
            } else {
                this.field966 = arg2.method549(arg0 + -1521146093);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(II)V")
    public static final void method431(int arg0, int arg1) {
        short var2 = 256;
        ++field968;
        if (~var2 > ~arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class67.field851 += arg0 * 128;
        if (class195.field3112.length < class67.field851) {
            int var3 = (int) (Math.random() * 12.0D);
            class67.field851 -= class195.field3112.length;
            class247.method1712(arg1 + -20943, class201.field3174[var3]);
        }
        int var4 = arg0 * 128;
        int var5 = 0;
        int var6 = (-arg0 + var2) * 128;
        for (int var7 = 0; var7 < var6; ++var7) {
            int var26 = class52.field681[var5 - -var4] + -(class195.field3112[class195.field3112.length + -1 & class67.field851 + var5] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class52.field681[var5++] = var26;
        }
        for (int var8 = -arg0 + var2; var2 > var8; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (~var25 > -51 && var24 > 10 && ~var24 > -119) {
                    class52.field681[var23 + var24] = 255;
                } else {
                    class52.field681[var23 + var24] = 0;
                }
            }
        }
        if (arg1 != 20943) {
            field971 = null;
        }
        for (int var9 = 0; ~(-arg0 + var2) < ~var9; ++var9) {
            class279.field4433[var9] = class279.field4433[var9 - -arg0];
        }
        for (int var10 = -arg0 + var2; var10 < var2; ++var10) {
            class279.field4433[var10] = (int) (Math.sin((double) class3.field46 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class3.field46 / 15.0D) + Math.sin((double) class3.field46 / 16.0D) * 12.0D);
            ++class3.field46;
        }
        class226.field3633 += arg0;
        int var11 = ((1 & class73.field924) + arg0) / 2;
        if (~var11 < -1) {
            for (int var12 = 0; class226.field3633 > var12; ++var12) {
                int var21 = 2 + (int) (124.0D * Math.random());
                int var22 = (int) (Math.random() * 128.0D) + 128;
                class52.field681[var21 - -(var22 << 7)] = 192;
            }
            class226.field3633 = 0;
            for (int var13 = 0; ~var13 > ~var2; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (var11 + var20 < 128) {
                        var18 += class52.field681[var11 + var20 - -var19];
                    }
                    if (~(-1 - var11 + var20) <= -1) {
                        var18 -= class52.field681[var19 + -1 + -var11 + var20];
                    }
                    if (~var20 <= -1) {
                        class127.field2034[var19 + var20] = var18 / (var11 * 2 - -1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; ~var16 > ~var2; ++var16) {
                    int var17 = var16 * 128;
                    if (var2 > var16 - -var11) {
                        var15 += class127.field2034[var14 - (-(var11 * 128) + -var17)];
                    }
                    if (~(-var11 + -1 + var16) <= -1) {
                        var15 -= class127.field2034[var14 + var17 + -((var11 + 1) * 128)];
                    }
                    if (var16 >= 0) {
                        class52.field681[var14 + var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        this.method430((byte) 94);
        if (arg0 != -49) {
            field965 = null;
        }
        ++field963;
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
    public static void method432(int arg0) {
        field959 = null;
        if (arg0 <= 24) {
            method429(85, -89);
        }
        field965 = null;
        field971 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class77() {
        super(1, true);
    }
}
