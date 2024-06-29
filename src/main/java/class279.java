import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class279 extends class261 {

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    private int field4770 = 4096;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    private int field4772 = 0;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    private int field4776 = 0;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    private int field4781 = 2000;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    private int field4777 = 16;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Lve;")
    public static class255 field4778 = class87.method607(108, "::");

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "Lkh;")
    public static class13 field4774 = new class13(128);

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field4784 = 0;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "Lve;")
    public static class255 field4782 = class87.method607(102, " ");

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field4785 = 0;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "Lve;")
    public static class255 field4786 = class87.method607(104, "blinken2:");

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "[[[I")
    public static int[][][] field4783;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(B)V", line = 5)
    public static void method1941(byte arg0) {
        field4774 = null;
        field4778 = null;
        field4783 = (int[][][]) null;
        if (arg0 <= -46) {
            field4782 = null;
            field4786 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 184)
    public class279() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 34)
    public static final void method1942(int arg0) {
        if (arg0 <= 64) {
            field4782 = (class255) null;
        }
        field4779++;
        class101.field1708.method553(113);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lpb;BI)V", line = 53)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field4773++;
        if (arg1 >= -115) {
            return;
        }
        if (arg2 == 0) {
            this.field4772 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field4781 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field4777 = arg0.method481(0);
        } else if (arg2 == 3) {
            this.field4776 = arg0.method423(255);
        } else if (arg2 == 4) {
            this.field4770 = arg0.method423(255);
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(B)V", line = 113)
    public final void method111(byte arg0) {
        class254.method1735(83);
        field4780++;
        if (arg0 != -57) {
            method1942(-89);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lme;III)V", line = 138)
    public static final void method1943(class177 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class29.field449) {
            class249 var4 = class118.field1984[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4184 != null && var4.field4184.field5194.method1264()) {
                arg0.method1261(var4.field4184.field5194, 128, 0, 0, true);
            }
        }
        if (arg3 < class29.field449) {
            class249 var5 = class118.field1984[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4184 != null && var5.field4184.field5194.method1264()) {
                arg0.method1261(var5.field4184.field5194, 0, 0, 128, true);
            }
        }
        if (arg2 < class29.field449 && arg3 < class315.field5347) {
            class249 var6 = class118.field1984[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4184 != null && var6.field4184.field5194.method1264()) {
                arg0.method1261(var6.field4184.field5194, 128, 0, 128, true);
            }
        }
        if (arg2 < class29.field449 && arg3 > 0) {
            class249 var7 = class118.field1984[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4184 != null && var7.field4184.field5194.method1264()) {
                arg0.method1261(var7.field4184.field5194, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)I", line = 196)
    public static final int method1944(int arg0, int arg1, int arg2, int arg3) {
        field4775++;
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        return arg3 == 4 ? (arg0 >> 1) + ((arg1 >> 2 << 10) + (arg2 >> 5 << 7)) : -74;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I", line = 222)
    public final int[] method21(byte arg0, int arg1) {
        field4771++;
        int var3 = -82 / ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int var5 = this.field4770 >> 1;
            int[][] var6 = this.field4425.method904(120);
            Random var7 = new Random((long) this.field4772);
            for (int var8 = 0; var8 < this.field4781; var8++) {
                int var9 = this.field4770 <= 0 ? this.field4776 : this.field4776 + class212.method1522(var7, this.field4770, (byte) 117) - var5;
                int var10 = var9 >> 4 & 0xFF;
                int var11 = class212.method1522(var7, class92.field1576, (byte) 121);
                int var12 = class212.method1522(var7, class210.field3590, (byte) 107);
                int var13 = (class107.field1800[var10] * this.field4777 >> 12) + var12;
                int var14 = (class72.field1188[var10] * this.field4777 >> 12) + var11;
                int var15 = var13 - var12;
                int var16 = var14 - var11;
                if (var16 != 0 || var15 != 0) {
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var17 = var15 > var16;
                    if (var17) {
                        int var18 = var14;
                        int var19 = var11;
                        var11 = var12;
                        var12 = var19;
                        var14 = var13;
                        var13 = var18;
                    }
                    if (var14 < var11) {
                        int var20 = var11;
                        var11 = var14;
                        var14 = var20;
                        int var21 = var12;
                        var12 = var13;
                        var13 = var21;
                    }
                    int var22 = var14 - var11;
                    int var23 = var12;
                    int var24 = var13 - var12;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class212.method1522(var7, 4096, (byte) 119) >> 2);
                    int var27 = -var22 / 2;
                    int var28 = var13 <= var12 ? -1 : 1;
                    for (int var29 = var11; var29 < var14; var29++) {
                        int var30 = class77.field1260 & var29;
                        var27 += var24;
                        int var31 = class250.field4205 & var23;
                        int var32 = (var29 - var11) * var25 + var26 + 1024;
                        if (var27 > 0) {
                            var27 += -var22;
                            var23 -= -var28;
                        }
                        if (var17) {
                            var6[var31][var30] = var32;
                        } else {
                            var6[var30][var31] = var32;
                        }
                    }
                }
            }
        }
        return var4;
    }
}
