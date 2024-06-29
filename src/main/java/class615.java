import java.util.Hashtable;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class615 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Luf;")
    public static class380 field8516 = new class380(8);

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Leba;")
    public static class550 field8521 = new class550(75, 2);

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field8523 = new Hashtable();

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field8518;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILhca;IIIZ)V")
    public static final void method3398(int arg0, int arg1, class186 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8514++;
        if (class413.field5414 >= 50 || arg2 == null || arg2.field2589 == null || arg0 >= arg2.field2589.length || arg2.field2589[arg0] == null) {
            return;
        }
        int var7 = arg2.field2589[arg0][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xEE) >> 5;
        if (arg2.field2589[arg0].length > 1) {
            int var10 = (int) ((double) arg2.field2589[arg0].length * Math.random());
            if (var10 > 0) {
                var8 = arg2.field2589[arg0][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg6) {
                if (arg2.field2578) {
                    class609.method3379(var8, 0, var9, 255, -121, false);
                    return;
                }
                class493.method2816(var9, var8, arg3 + 1776, 255, 0);
            }
        } else if (class602.field8408.field4329 != 0) {
            int var12 = arg1 - 256 >> 9;
            if (arg3 != -1773) {
                method3400((byte) 5, -124, 42);
            }
            int var13 = arg4 - 256 >> 9;
            class67.field824[class413.field5414++] = new class480((byte) (arg2.field2578 ? 2 : 1), var8, var9, 0, 255, (var13 << 8) + ((arg5 << 24) + (var12 << 16) + var11));
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BB)[B")
    public final byte[] method3399(byte[] arg0, byte arg1) {
        field8520++;
        if (arg1 != -95) {
            return null;
        }
        class157 var3 = new class157(arg0);
        var3.field2219 = arg0.length - 4;
        int var4 = var3.method968(arg1 ^ 0xFFFFFFC6);
        var3.field2219 = 0;
        byte[] var5 = new byte[var4];
        this.method3402(var3, var5, (byte) -54);
        return var5;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)V")
    public static final void method3400(byte arg0, int arg1, int arg2) {
        field8517++;
        class517.field7183++;
        class229 var3 = class97.method550(class71.field841, false, class663.field9441);
        int var4 = -87 % ((arg0 + 83) / 32);
        var3.field2971.method937(arg1, -1972311984);
        var3.field2971.method918(24551, arg2);
        class307.method1805(var3, -14704);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
    public static final boolean method3401(int arg0, int arg1, int arg2) {
        field8522++;
        if (arg2 != -28443) {
            method3398(-5, -59, null, 2, -70, 94, false);
        }
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lio;[BB)V")
    public final void method3402(class157 arg0, byte[] arg1, byte arg2) {
        field8515++;
        if (arg0.field2199[arg0.field2219] != 31 || arg0.field2199[arg0.field2219 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field8518 == null) {
            this.field8518 = new Inflater(true);
        }
        int var4 = -9 % ((68 - arg2) / 45);
        try {
            this.field8518.setInput(arg0.field2199, arg0.field2219 + 10, arg0.field2199.length - arg0.field2219 - 18);
            this.field8518.inflate(arg1);
        } catch (Exception var5) {
            this.field8518.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field8518.reset();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3403(boolean arg0, int arg1, int arg2) {
        field8519++;
        if (arg0) {
            field8516 = null;
        }
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method3404(int arg0) {
        field8521 = null;
        field8516 = null;
        if (arg0 != -28678) {
            method3400((byte) -80, -8, -105);
        }
        field8523 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class615() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V")
    private class615(int arg0, int arg1, int arg2) {
    }
}
