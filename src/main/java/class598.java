import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class598 {

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "J")
    public static long field8353 = -1L;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "Lfaa;")
    public static class139 field8356 = new class139(32);

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "[Laf;")
    public static class400[] field8359 = new class400[6];

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "[I")
    public static int[] field8360 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field8358;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "[Lui;")
    public static class209[] field8361;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "[[[Z")
    public static boolean[][][] field8354;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
    public static void method3374(int arg0) {
        field8361 = null;
        field8356 = null;
        field8360 = null;
        if (arg0 < 100) {
            field8361 = null;
        }
        field8359 = null;
        field8354 = null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILen;I)Lir;")
    public static final class25 method3375(int arg0, int arg1, class290 arg2, int arg3) {
        field8352++;
        int var4 = arg0 << 10 | arg2.field3992;
        class25 var5 = (class25) class383.field5424.method3543((long) var4 << 16, -24045);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class221.field3091.method3632(true, class221.field3091.method3633(var4, (byte) 124));
        if (var6 == null) {
            if (arg3 != 389873232) {
                return null;
            }
            int var9 = arg2.field3992 | arg1 + 65536 << 10;
            class25 var10 = (class25) class383.field5424.method3543((long) var9 << 16, -24045);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class221.field3091.method3632(true, class221.field3091.method3633(var9, (byte) 124));
            if (var11 == null) {
                int var14 = arg2.field3992 | 0x3FFFC00;
                class25 var15 = (class25) class383.field5424.method3543((long) var14 << 16, -24045);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class221.field3091.method3632(true, class221.field3091.method3633(var14, (byte) 124));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class25 var17;
                    try {
                        var17 = class457.method2607(var16, -25614);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field311 = arg2;
                    class383.field5424.method3548((long) var14 << 16, 7, var17);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class25 var12;
                try {
                    var12 = class457.method2607(var11, arg3 ^ 0xE8C365A2);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field311 = arg2;
                class383.field5424.method3548((long) var9 << 16, arg3 - 389873225, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class25 var7;
            try {
                var7 = class457.method2607(var6, -25614);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field311 = arg2;
            class383.field5424.method3548((long) var4 << 16, 7, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lac;[BI)V")
    public final void method3376(class501 arg0, byte[] arg1, int arg2) {
        field8357++;
        if (arg0.field6855[arg0.field6892] != 31 || arg0.field6855[arg0.field6892 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field8358 == null) {
            this.field8358 = new Inflater(true);
        }
        try {
            this.field8358.setInput(arg0.field6855, arg0.field6892 + 10, arg0.field6855.length + -8 + -arg0.field6892 + -10);
            this.field8358.inflate(arg1);
        } catch (Exception var4) {
            this.field8358.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg2 != -2259) {
            field8359 = null;
        }
        this.field8358.reset();
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I[B)[B")
    public final byte[] method3377(int arg0, byte[] arg1) {
        if (arg0 < 25) {
            method3375(-88, 12, null, 0);
        }
        field8355++;
        class501 var3 = new class501(arg1);
        var3.field6892 = arg1.length - 4;
        int var4 = var3.method2853((byte) -42);
        var3.field6892 = 0;
        byte[] var5 = new byte[var4];
        this.method3376(var3, var5, -2259);
        return var5;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
    public class598() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(III)V")
    private class598(int arg0, int arg1, int arg2) {
    }
}
