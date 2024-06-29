import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class49 {

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "Z")
    public boolean field517;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "Z")
    public boolean field525;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "[S")
    public short[] field516;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Lea;")
    public static class474 field515 = new class474("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "Loj;")
    public class321 field522;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 7)
    public static void method271(byte arg0) {
        field515 = null;
        int var1 = 27 / ((-arg0 - 42) / 61);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)I", line = 16)
    public static final int method272(int arg0, int arg1) {
        return class184.field2290 == null ? 0 : class184.field2290[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIILoa;IBI)V", line = 30)
    private final void method273(int arg0, int arg1, int arg2, class605 arg3, int arg4, byte arg5, int arg6) {
        this.field522 = arg3.method346(arg2, arg4, arg0, arg1, arg6, 1.0F);
        if (arg5 != -77) {
            method275(-40, 34, 79);
        }
        field527++;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIBII)V", line = 45)
    public final void method274(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field529 = arg1;
        field519++;
        if (arg2 == -14) {
            this.field513 = arg4;
            this.field521 = arg0;
            this.field530 = arg3;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)I", line = 59)
    public static final int method275(int arg0, int arg1, int arg2) {
        field523++;
        if (arg0 != -25231) {
            field515 = null;
        }
        int var3 = class489.method2940(30810, arg1 - 1, arg2 - 1) + (class489.method2940(arg0 ^ 0xFFFFE52B, arg1 - 1, arg2 - -1) + class489.method2940(30810, arg1 + 1, arg2 + -1)) + class489.method2940(30810, arg1 + 1, arg2 + 1);
        int var4 = class489.method2940(arg0 ^ 0xFFFFE52B, arg1, arg2 - 1) + (class489.method2940(30810, arg1, arg2 + 1) + class489.method2940(30810, arg1 - 1, arg2) + class489.method2940(30810, arg1 + 1, arg2));
        int var5 = class489.method2940(30810, arg1, arg2);
        return var5 / 4 + (var3 / 16 + (var4 / 8));
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZBI)V", line = 76)
    public final void method276(boolean arg0, byte arg1, int arg2) {
        field518++;
        if (arg1 != -61) {
            this.field520 = -62;
        }
        int var6;
        if (arg0) {
            var6 = 2048;
        } else {
            int var4 = this.field530 * arg2 / 50 + this.field526 & 0x7FF;
            int var5 = this.field513;
            if (var5 == 1) {
                var6 = (class605.field8859[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class84.field958[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field522.method1756((float) ((this.field521 * var6 >> 11) + this.field529) / 2048.0F, arg1 ^ 0xFFFE795C);
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)V", line = 162)
    private final void method277(byte arg0) {
        field524++;
        int var2 = this.field514;
        if (var2 == 2) {
            this.field530 = 2048;
            this.field529 = 0;
            this.field513 = 1;
            this.field521 = 2048;
        } else if (var2 == 3) {
            this.field513 = 1;
            this.field530 = 4096;
            this.field529 = 0;
            this.field521 = 2048;
        } else if (var2 == 4) {
            this.field529 = 0;
            this.field530 = 2048;
            this.field521 = 2048;
            this.field513 = 4;
        } else if (var2 == 5) {
            this.field521 = 2048;
            this.field529 = 0;
            this.field513 = 4;
            this.field530 = 8192;
        } else if (var2 == 12) {
            this.field521 = 2048;
            this.field513 = 2;
            this.field530 = 2048;
            this.field529 = 0;
        } else if (var2 == 13) {
            this.field513 = 2;
            this.field521 = 2048;
            this.field529 = 0;
            this.field530 = 8192;
        } else if (var2 == 10) {
            this.field529 = 1536;
            this.field513 = 3;
            this.field521 = 512;
            this.field530 = 2048;
        } else if (var2 == 11) {
            this.field529 = 1536;
            this.field530 = 4096;
            this.field513 = 3;
            this.field521 = 512;
        } else if (var2 == 6) {
            this.field529 = 1280;
            this.field530 = 2048;
            this.field521 = 768;
            this.field513 = 3;
        } else if (var2 == 7) {
            this.field529 = 1280;
            this.field530 = 4096;
            this.field513 = 3;
            this.field521 = 768;
        } else if (var2 == 8) {
            this.field521 = 1024;
            this.field513 = 3;
            this.field529 = 1024;
            this.field530 = 2048;
        } else if (var2 == 9) {
            this.field529 = 1024;
            this.field530 = 4096;
            this.field513 = 3;
            this.field521 = 1024;
        } else if (var2 == 14) {
            this.field530 = 2048;
            this.field521 = 768;
            this.field529 = 1280;
            this.field513 = 1;
        } else if (var2 == 15) {
            this.field521 = 512;
            this.field529 = 1536;
            this.field513 = 1;
            this.field530 = 4096;
        } else if (var2 == 16) {
            this.field513 = 1;
            this.field529 = 1792;
            this.field521 = 256;
            this.field530 = 8192;
        } else {
            this.field521 = 2048;
            this.field530 = 2048;
            this.field513 = 0;
            this.field529 = 0;
        }
        if (arg0 < 23) {
            method271((byte) -101);
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V", line = 356)
    protected class49() {
        if (class84.field958 == null) {
            class243.method1620(17569);
        }
        this.method277((byte) 66);
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Loa;Lrt;I)V", line = 366)
    public class49(class605 arg0, class194 arg1, int arg2) {
        if (class84.field958 == null) {
            class243.method1620(17569);
        }
        this.field520 = arg1.method1177(255);
        this.field517 = (this.field520 & 0x8) != 0;
        this.field525 = (this.field520 & 0x10) != 0;
        this.field520 &= 0x7;
        int var4 = arg1.method1220(122) << arg2;
        int var5 = arg1.method1220(123) << arg2;
        int var6 = arg1.method1220(-128) << arg2;
        int var7 = arg1.method1177(255);
        int var8 = var7 * 2 + 1;
        this.field516 = new short[var8];
        for (int var9 = 0; var9 < this.field516.length; var9++) {
            short var13 = (short) arg1.method1220(-18);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field516[var9] = (short) class283.method1834(var14 << 8, var15);
        }
        int var10 = (var7 << class465.field6917) + class170.field2095;
        int var11 = class403.field6100 == null ? class348.field4972[class26.method156(117, arg1.method1220(-102)) & 0xFFFF] : class403.field6100[arg1.method1220(126)];
        int var12 = arg1.method1177(255);
        this.field514 = var12 & 0x1F;
        this.field526 = var12 & 0xE0 << 3;
        if (this.field514 != 31) {
            this.method277((byte) 113);
        }
        this.method273(var5, var10, var4, arg0, var6, (byte) -77, var11);
    }
}
