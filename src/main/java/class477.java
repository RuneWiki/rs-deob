import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class477 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lmq;")
    private class104 field6736 = new class104(64);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lfc;")
    private class343 field6737;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
    public static boolean field6743 = false;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field6744 = 0;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Z")
    public static final boolean method2802(int arg0) {
        field6745++;
        if (arg0 != 217) {
            method2802(61);
        }
        if (class486.field6856) {
            try {
                if ((Boolean) class207.method1299(class343.field4703.field234, arg0 ^ 0x4C6E, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
    public final void method2803(byte arg0, int arg1) {
        field6739++;
        class104 var3 = this.field6736;
        synchronized (this.field6736) {
            this.field6736.method666(arg1, false);
        }
        if (arg0 != 110) {
            this.field6737 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method2804(int arg0) {
        field6738++;
        class104 var2 = this.field6736;
        synchronized (this.field6736) {
            this.field6736.method654(false);
        }
        if (arg0 != 0) {
            method2802(72);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)I")
    public static final int method2805(int arg0, byte arg1) {
        field6742++;
        int var2 = 57 / ((arg1 + 12) / 48);
        double var3 = (double) ((arg0 & 0xFFA478) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFB4) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return (var22 >> 5 << 7) + ((var21 >> 2 & 0x3F) << 10) + (var23 >> 1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Log;")
    public final class318 method2806(int arg0, int arg1) {
        if (arg1 >= -73) {
            field6744 = -98;
        }
        field6741++;
        class104 var3 = this.field6736;
        class318 var4;
        synchronized (this.field6736) {
            var4 = (class318) this.field6736.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6737.method2029(32, arg0, 0);
        class318 var6 = new class318();
        if (var5 != null) {
            var6.method1919(new class425(var5), (byte) 62);
        }
        class104 var7 = this.field6736;
        synchronized (this.field6736) {
            this.field6736.method653(123, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public final void method2807(boolean arg0) {
        if (!arg0) {
            this.field6737 = null;
        }
        field6740++;
        class104 var2 = this.field6736;
        synchronized (this.field6736) {
            this.field6736.method656(113);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ldk;ILfc;)V")
    public class477(class328 arg0, int arg1, class343 arg2) {
        this.field6737 = arg2;
        this.field6737.method2054(0, 32);
    }
}
