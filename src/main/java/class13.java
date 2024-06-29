import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class13 extends class295 {

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[I")
    public static int[] field386 = new int[256];

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "Ljava/lang/String;")
    public static String field398;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Lek;")
    public static class206 field400;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "[B")
    private byte[] field389;

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIFFF)V", line = 15)
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field387 = (int) (arg7 * 4096.0F);
        this.field385 = (int) (arg6 * 4096.0F);
        this.field396 = this.field394 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 28)
    public final void method128(int arg0) {
        int var2 = 91 % ((arg0 + 45) / 35);
        this.field396 = this.field394;
        this.field391 >>= 0x4;
        field384++;
        if (this.field391 < 0) {
            this.field391 = 0;
        } else if (this.field391 > 255) {
            this.field391 = 255;
        }
        this.method135(this.field395++, (byte) this.field391);
        this.field391 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 49)
    public final void method129(int arg0, int arg1, int arg2) {
        if (arg2 <= 125) {
            method131((byte) 121);
        }
        if (arg1 == 0) {
            this.field402 = 4096;
            this.field399 = this.field385 - (arg0 >= 0 ? arg0 : -arg0);
            this.field399 = this.field399 * this.field399 >> 12;
            this.field391 = this.field399;
        } else {
            this.field402 = this.field399 * this.field387 >> 12;
            if (this.field402 < 0) {
                this.field402 = 0;
            } else if (this.field402 > 4096) {
                this.field402 = 4096;
            }
            this.field399 = this.field385 - (arg0 < 0 ? -arg0 : arg0);
            this.field399 = this.field399 * this.field399 >> 12;
            this.field399 = this.field402 * this.field399 >> 12;
            this.field391 += this.field399 * this.field396 >> 12;
            this.field396 = this.field396 * this.field394 >> 12;
        }
        field390++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBI)I", line = 84)
    public static final int method130(int arg0, byte arg1, int arg2) {
        field382++;
        int var3 = -116 / ((arg1 - 12) / 41);
        class353 var4 = (class353) class216.field3591.method2344(-1, (long) arg0);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var4.field5646.length) {
            return var4.field5646[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 104)
    public static void method131(byte arg0) {
        if (arg0 > -118) {
            field397 = 124;
        }
        field386 = null;
        field398 = null;
        field400 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field386[var0] = var1;
        }
        field398 = "Prepared sound engine";
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V", line = 121)
    public static final void method132(int arg0) {
        class105.field1928 = null;
        class106.method786();
        field388++;
        if (arg0 != 0) {
            field397 = 86;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLg;)Z", line = 164)
    public static final boolean method133(boolean arg0, class181 arg1) {
        field392++;
        if (arg1.field3048 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field3048.length; var2++) {
            int var3 = class202.method1383((byte) 123, var2, arg1);
            int var4 = arg1.field3020[var2];
            if (arg1.field3048[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field3048[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field3048[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 222)
    public final void method134(int arg0) {
        this.field395 = 0;
        this.field391 = arg0;
        field401++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V", line = 235)
    public void method135(int arg0, byte arg1) {
        field383++;
        this.field389[arg0] = arg1;
    }
}
