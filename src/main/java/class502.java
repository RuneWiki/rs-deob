import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class502 {

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "[I")
    private int[] field7020;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7017 = new BigInteger("c093db9182b20ba3e47bff31c546b69e06894a224531c266dda313beb654610b7f967c84f1a222c21bfa4bf57391b245dfa8e9a37731dc0a0492f50a7b5cd15b", 16);

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field7021 = 0;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
    public final int method2998(int arg0, int arg1) {
        field7018++;
        if (arg1 != -31259) {
            field7017 = null;
        }
        int var3 = (this.field7020.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field7020[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field7020[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static final void method2999(int arg0) {
        field7019++;
        for (int var1 = 0; var1 < 100; var1++) {
            class290.field3804[var1] = null;
        }
        class209.field2978 = arg0;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static void method3000(byte arg0) {
        field7017 = null;
        if (arg0 != -23) {
            method2999(110);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lvs;)V")
    public static final void method3001(class519 arg0) {
        if (class442.field6068 >= 65535) {
            return;
        }
        class757 var1 = arg0.field7244;
        class146.field2026[class442.field6068] = arg0;
        class226.field3165[class442.field6068] = false;
        class442.field6068++;
        int var2 = arg0.field7249;
        if (arg0.field7231) {
            var2 = 0;
        }
        int var3 = arg0.field7249;
        if (arg0.field7253) {
            var3 = class214.field3021 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method4205((byte) 8) + class457.field6297 - var1.method4206((byte) 120) >> class509.field7106;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method4205((byte) 8) + var1.method4206((byte) 121) - class457.field6297 >> class509.field7106;
            if (var7 >= class314.field4059) {
                var7 = class314.field4059 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field7242[var5++];
                int var10 = (var1.method4203(20918) + class457.field6297 - var1.method4206((byte) 123) >> class509.field7106) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class485.field6556) {
                    var11 = class485.field6556 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class706.field9852[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class706.field9852[var4][var12][var8] = var13 | (long) class442.field6068;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class706.field9852[var4][var12][var8] = var13 | (long) class442.field6068 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class706.field9852[var4][var12][var8] = var13 | (long) class442.field6068 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class706.field9852[var4][var12][var8] = var13 | (long) class442.field6068 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lam;Z)V")
    public static final void method3002(class55 arg0, boolean arg1) {
        field7022++;
        if (arg1) {
            field7021 = -101;
        }
        for (class67 var2 = (class67) class483.field6544.method3118((byte) 73); var2 != null; var2 = (class67) class483.field6544.method3111(123)) {
            if (var2.field917 == arg0) {
                if (var2.field927 != null) {
                    class237.field3299.method3761(var2.field927);
                    var2.field927 = null;
                }
                var2.method3065(-17363);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "([I)V")
    public class502(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field7020 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field7020[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field7020[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field7020[var5 + var5] = arg0[var4];
            this.field7020[var5 + var5 + 1] = var4++;
        }
    }
}
