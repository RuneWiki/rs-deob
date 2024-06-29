import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class280 extends class224 {

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    private int field4698 = 5;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    private int field4699 = 5;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    private int field4692 = 2;

    @OriginalMember(owner = "client!rj", name = "gb", descriptor = "[B")
    private byte[] field4707 = new byte[512];

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    private int field4696 = 0;

    @OriginalMember(owner = "client!rj", name = "lb", descriptor = "I")
    private int field4712 = 2048;

    @OriginalMember(owner = "client!rj", name = "mb", descriptor = "[S")
    private short[] field4713 = new short[512];

    @OriginalMember(owner = "client!rj", name = "nb", descriptor = "I")
    private int field4714 = 1;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field4694 = 0;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "Luf;")
    private static class168 field4693 = class148.method1019(-1720, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field4705 = 0;

    @OriginalMember(owner = "client!rj", name = "ib", descriptor = "Luf;")
    public static class168 field4709 = field4693;

    @OriginalMember(owner = "client!rj", name = "jb", descriptor = "I")
    public static int field4710 = -1;

    @OriginalMember(owner = "client!rj", name = "ob", descriptor = "I")
    public static int field4715 = 0;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "Luf;")
    public static class168 field4703 = class148.method1019(-1720, "Okay");

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "Luf;")
    private static class168 field4701 = class148.method1019(-1720, "cyan:");

    @OriginalMember(owner = "client!rj", name = "kb", descriptor = "Luf;")
    public static class168 field4711 = field4701;

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "Luf;")
    public static class168 field4706 = field4701;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!rj", name = "hb", descriptor = "[[I")
    public static int[][] field4708;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZLj;)V", line = 6)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field4704++;
        if (arg1) {
            method1937((byte) -52);
        }
        if (arg0 == 0) {
            this.field4699 = this.field4698 = arg2.method1042((byte) 120);
        } else if (arg0 == 1) {
            this.field4696 = arg2.method1042((byte) -14);
        } else if (arg0 == 2) {
            this.field4712 = arg2.method1069(50);
        } else if (arg0 == 3) {
            this.field4692 = arg2.method1042((byte) -32);
        } else if (arg0 == 4) {
            this.field4714 = arg2.method1042((byte) 97);
        } else if (arg0 == 5) {
            this.field4699 = arg2.method1042((byte) -106);
        } else if (arg0 == 6) {
            this.field4698 = arg2.method1042((byte) -124);
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(Z)V", line = 97)
    private final void method1936(boolean arg0) {
        field4697++;
        Random var2 = new Random((long) this.field4696);
        this.field4713 = new short[512];
        if (this.field4712 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4713[var3] = (short) class103.method774(this.field4712, var2, Integer.MIN_VALUE);
            }
        }
        if (!arg0) {
            this.method18((byte) 73, -75);
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 430)
    public class280() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)V", line = 151)
    public static void method1937(byte arg0) {
        field4706 = null;
        field4703 = null;
        field4709 = null;
        int var1 = 42 / ((arg0 - 1) / 44);
        field4693 = null;
        field4708 = (int[][]) null;
        field4701 = null;
        field4711 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIII)V", line = 167)
    public static final void method1938(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 88) {
            field4706 = (class168) null;
        }
        if (class1.field1 != 0 && arg1 != 0 && class36.field414 < 50 && arg2 != -1) {
            class271.field4554[class36.field414] = arg2;
            class295.field4996[class36.field414] = arg1;
            class242.field4067[class36.field414] = arg3;
            class135.field2114[class36.field414] = null;
            class221.field3588[class36.field414] = 0;
            class36.field414++;
        }
        field4695++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[I", line = 191)
    public final int[] method18(byte arg0, int arg1) {
        int[] var3 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int var4 = class303.field5103[arg1] * this.field4698 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class187.field2961; var7++) {
                class6.field80 = Integer.MAX_VALUE;
                class294.field4987 = Integer.MAX_VALUE;
                class251.field4276 = Integer.MAX_VALUE;
                class253.field4336 = Integer.MAX_VALUE;
                int var8 = (class73.field979[var7] * this.field4699) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field4707[(this.field4698 > var11 ? var11 : var11 - this.field4698) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field4707[(var13 < this.field4699 ? var13 : var13 - this.field4699) + var12 & 0xFF] & 0xFF) * 2;
                        int var28 = var14 + 1;
                        int var15 = var8 - this.field4713[var14] - (var13 << 12);
                        int var16 = -(var11 << 12) - (this.field4713[var28] - var4);
                        int var17 = this.field4714;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 < 0 ? -var16 : var16;
                            int var25 = var15 < 0 ? -var15 : var15;
                            var18 = var24 < var25 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var19 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var20 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var21 = var19 + var20;
                            var18 = var21 * var21 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 >= 0 ? var16 : -var16) + (var15 < 0 ? -var15 : var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class253.field4336 > var18) {
                            class6.field80 = class294.field4987;
                            class294.field4987 = class251.field4276;
                            class251.field4276 = class253.field4336;
                            class253.field4336 = var18;
                        } else if (var18 < class251.field4276) {
                            class6.field80 = class294.field4987;
                            class294.field4987 = class251.field4276;
                            class251.field4276 = var18;
                        } else if (class294.field4987 > var18) {
                            class6.field80 = class294.field4987;
                            class294.field4987 = var18;
                        } else if (var18 < class6.field80) {
                            class6.field80 = var18;
                        }
                    }
                }
                int var26 = this.field4692;
                if (var26 == 0) {
                    var3[var7] = class253.field4336;
                } else if (var26 == 1) {
                    var3[var7] = class251.field4276;
                } else if (var26 == 3) {
                    var3[var7] = class294.field4987;
                } else if (var26 == 4) {
                    var3[var7] = class6.field80;
                } else if (var26 == 2) {
                    var3[var7] = class251.field4276 - class253.field4336;
                }
            }
        }
        field4702++;
        int var27 = -66 / ((arg0 - 20) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 406)
    public final void method80(boolean arg0) {
        field4700++;
        this.field4707 = class300.method2051(true, this.field4696);
        if (arg0) {
            this.method1936(false);
        }
        this.method1936(!arg0);
    }
}
