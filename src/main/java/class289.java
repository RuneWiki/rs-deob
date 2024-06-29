import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class289 extends class232 {

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    private int field4852 = 5;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    private int field4857 = 5;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "[B")
    private byte[] field4848 = new byte[512];

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    private int field4849 = 2048;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    private int field4854 = 0;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    private int field4861 = 1;

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "[S")
    private short[] field4865 = new short[512];

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "I")
    private int field4866 = 2;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "Lhi;")
    public static class82 field4851 = class95.method664((byte) -125, "; Max)2Age=");

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "Lhi;")
    private static class82 field4862 = class95.method664((byte) -42, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "Z")
    public static boolean field4864 = false;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field4850 = 0;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "Lhi;")
    public static class82 field4847 = field4862;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V", line = 11)
    public static void method1996(byte arg0) {
        field4862 = null;
        field4847 = null;
        if (arg0 < -75) {
            field4851 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILum;Lum;)V", line = 30)
    public static final void method1997(int arg0, class222 arg1, class222 arg2) {
        field4858++;
        if (arg0 > -87) {
            method1997(89, (class222) null, (class222) null);
        }
        class106.field1884 = arg2;
        class285.field4799 = arg1;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V", line = 42)
    public final void method144(int arg0) {
        if (arg0 > 48) {
            field4853++;
            this.field4848 = class13.method73(this.field4854, -113);
            this.method1998(19979);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)[I", line = 58)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = -3 % ((arg1 + 31) / 55);
        field4860++;
        int[] var4 = this.field4008.method131((byte) -101, arg0);
        if (this.field4008.field256) {
            int var5 = class273.field4607[arg0] * this.field4852 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; var8 < class54.field858; var8++) {
                class200.field3441 = Integer.MAX_VALUE;
                class26.field351 = Integer.MAX_VALUE;
                class205.field3590 = Integer.MAX_VALUE;
                class284.field4770 = Integer.MAX_VALUE;
                int var9 = class24.field329[var8] * this.field4857 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 - 1; var12 <= var7; var12++) {
                    int var13 = this.field4848[(var12 < this.field4852 ? var12 : var12 - this.field4852) & 0xFF] & 0xFF;
                    for (int var14 = var10 - 1; var14 <= var11; var14++) {
                        int var15 = (this.field4848[(var14 >= this.field4857 ? var14 - this.field4857 : var14) + var13 & 0xFF] & 0xFF) * 2;
                        int var10001 = var14 << 12;
                        int var28 = var15 + 1;
                        int var16 = var9 - (var10001 + this.field4865[var15]);
                        int var17 = var5 - (var12 << 12) - this.field4865[var28];
                        int var18 = this.field4861;
                        int var21;
                        if (var18 == 1) {
                            var21 = var16 * var16 + var17 * var17 >> 12;
                        } else if (var18 == 3) {
                            int var19 = var17 >= 0 ? var17 : -var17;
                            int var20 = var16 < 0 ? -var16 : var16;
                            var21 = var20 > var19 ? var20 : var19;
                        } else if (var18 == 4) {
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var25 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                            int var26 = var24 + var25;
                            var21 = var26 * var26 >> 12;
                        } else if (var18 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var17 * var17;
                            var21 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var18 == 2) {
                            var21 = (var16 >= 0 ? var16 : -var16) + (var17 < 0 ? -var17 : var17);
                        } else {
                            var21 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class284.field4770 > var21) {
                            class200.field3441 = class26.field351;
                            class26.field351 = class205.field3590;
                            class205.field3590 = class284.field4770;
                            class284.field4770 = var21;
                        } else if (var21 < class205.field3590) {
                            class200.field3441 = class26.field351;
                            class26.field351 = class205.field3590;
                            class205.field3590 = var21;
                        } else if (class26.field351 > var21) {
                            class200.field3441 = class26.field351;
                            class26.field351 = var21;
                        } else if (var21 < class200.field3441) {
                            class200.field3441 = var21;
                        }
                    }
                }
                int var27 = this.field4866;
                if (var27 == 0) {
                    var4[var8] = class284.field4770;
                } else if (var27 == 1) {
                    var4[var8] = class205.field3590;
                } else if (var27 == 3) {
                    var4[var8] = class26.field351;
                } else if (var27 == 4) {
                    var4[var8] = class200.field3441;
                } else if (var27 == 2) {
                    var4[var8] = class205.field3590 - class284.field4770;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 300)
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V", line = 272)
    private final void method1998(int arg0) {
        field4855++;
        Random var2 = new Random((long) this.field4854);
        this.field4865 = new short[512];
        if (arg0 != 19979) {
            method1997(77, (class222) null, (class222) null);
        }
        if (this.field4849 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4865[var3] = (short) class232.method1650(this.field4849, false, var2);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZII)I", line = 304)
    public static final int method1999(int arg0, boolean arg1, int arg2, int arg3) {
        field4859++;
        if (!arg1) {
            return -59;
        }
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        return (arg2 >> 2 << 10) + ((arg3 >> 5 << 7) + (arg0 >> 1));
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lum;I)V", line = 334)
    public static final void method2000(class222 arg0, int arg1) {
        if (arg1 != 255) {
            field4864 = false;
        }
        field4867++;
        class107.field1901 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLbc;)V", line = 365)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field4856++;
        if (arg1 != -19) {
            return;
        }
        if (arg0 == 0) {
            this.field4857 = this.field4852 = arg2.method1082(-121);
        } else if (arg0 == 1) {
            this.field4854 = arg2.method1082(arg1 - 73);
        } else if (arg0 == 2) {
            this.field4849 = arg2.method1090(false);
        } else if (arg0 == 3) {
            this.field4866 = arg2.method1082(-46);
        } else if (arg0 == 4) {
            this.field4861 = arg2.method1082(-37);
        } else if (arg0 == 5) {
            this.field4857 = arg2.method1082(-100);
        } else if (arg0 == 6) {
            this.field4852 = arg2.method1082(-36);
        }
    }
}
