import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class255 extends class317 {

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    private int field3649 = 0;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    private int field3653 = 2000;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    private int field3654 = 0;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    private int field3655 = 16;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    private int field3658 = 4096;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "Lik;")
    public static class17 field3648 = new class17(32);

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Lhd;")
    public static class56 field3647;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lin;Z)V", line = 4)
    public static final void method1741(class344 arg0, boolean arg1) {
        if (arg1) {
            field3656 = -123;
        }
        field3650++;
        if (class170.field2320 == arg0.field5336) {
            class121.field1644[arg0.field5230] = true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILao;Lik;)Ltk;", line = 22)
    public static final class268 method1742(int arg0, class273 arg1, class17 arg2) {
        field3651++;
        long var3 = ((long) arg1.field4082 << 56) + ((long) arg1.field4099 << 32) + (long) (arg1.field4087 - -(arg1.field4097 - -1 << 16));
        if (arg0 != -1633550088) {
            return (class268) null;
        }
        class268 var5 = (class268) arg2.method111(-103, var3);
        if (var5 == null) {
            var5 = new class268(arg1.field4097, (float) arg1.field4087, true, false, arg1.field4099);
            arg2.method120(var3, var5, arg0 ^ 0x615DA645);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 320)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lin;BI)Ljava/lang/String;", line = 52)
    public static final String method1743(class344 arg0, byte arg1, int arg2) {
        field3652++;
        if (arg1 < 100) {
            return (String) null;
        } else if (!client.method821(arg0).method2031(false, arg2) && arg0.field5339 == null) {
            return null;
        } else if (arg0.field5312 == null || arg0.field5312.length <= arg2 || arg0.field5312[arg2] == null || arg0.field5312[arg2].trim().length() == 0) {
            return class63.field823 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field5312[arg2];
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 75)
    public final void method546(int arg0) {
        if (arg0 != -21522) {
            this.field3658 = -2;
        }
        field3657++;
        class98.method714((byte) -122);
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)V", line = 93)
    public static void method1744(byte arg0) {
        if (arg0 == -84) {
            field3648 = null;
            field3647 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[I", line = 109)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            this.field3655 = 62;
        }
        field3646++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -63);
        if (this.field4847.field2751) {
            int var4 = this.field3658 >> 1;
            int[][] var5 = this.field4847.method1388(-128);
            Random var6 = new Random((long) this.field3649);
            for (int var7 = 0; var7 < this.field3653; var7++) {
                int var8 = this.field3658 <= 0 ? this.field3654 : this.field3654 - (var4 - class175.method1217((byte) 70, var6, this.field3658));
                int var9 = class175.method1217((byte) 86, var6, class326.field4933);
                int var10 = var8 >> 4 & 0xFF;
                int var11 = class175.method1217((byte) 76, var6, class340.field5109);
                int var12 = (class115.field1555[var10] * this.field3655 >> 12) + var11;
                int var13 = var12 - var11;
                int var14 = (class257.field3805[var10] * this.field3655 >> 12) + var9;
                int var15 = var14 - var9;
                if (var15 != 0 || var13 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = var13 > var15;
                    if (var16) {
                        int var17 = var9;
                        var9 = var11;
                        var11 = var17;
                        int var18 = var14;
                        var14 = var12;
                        var12 = var18;
                    }
                    if (var9 > var14) {
                        int var19 = var9;
                        int var20 = var11;
                        var9 = var14;
                        var11 = var12;
                        var14 = var19;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var14 - var9;
                    int var23 = var12 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class175.method1217((byte) 124, var6, 4096) >> 2);
                    int var27 = var12 > var11 ? 1 : -1;
                    for (int var28 = var9; var28 < var14; var28++) {
                        int var29 = (var28 - var9) * var25 + var26 + 1024;
                        var24 += var23;
                        int var30 = var28 & class246.field3548;
                        int var31 = var21 & class202.field2889;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var27;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lcg;II)V", line = 267)
    public final void method60(class316 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3649 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field3653 = arg0.method2220((byte) 47);
        } else if (arg2 == 2) {
            this.field3655 = arg0.method2219(16448);
        } else if (arg2 == 3) {
            this.field3654 = arg0.method2220((byte) 110);
        } else if (arg2 == 4) {
            this.field3658 = arg0.method2220((byte) 103);
        }
        int var5 = -123 / ((-arg1 - 17) / 40);
        field3659++;
    }
}
