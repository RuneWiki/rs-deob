import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class367 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Z")
    public static boolean field5091 = false;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lhc;")
    public static class368 field5095 = new class368("M", "M", "M", "M");

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field5096 = 0;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lka;")
    public static class408 field5097 = new class408(64);

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field5099 = 0;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public int field5088;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public int field5092;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Leq;")
    public static class141 field5098;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[I")
    public int[] field5087;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)Lmf;", line = 3)
    public static final class14 method2308(boolean arg0, int arg1) {
        field5094++;
        class408 var2 = class22.field282;
        class14 var3;
        synchronized (class22.field282) {
            var3 = (class14) class22.field282.method2529(0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class409.field5702.method1926(0, class222.method1469(-20872, arg1), class119.method925(209268044, arg1));
        class14 var5 = new class14();
        var5.field168 = arg1;
        var5.field142 = new String[] { null, null, class189.field2724.method2313((byte) -128, class106.field1492), null, null };
        var5.field151 = new String[] { null, null, null, null, class266.field3660.method2313((byte) -88, class106.field1492) };
        if (var4 != null) {
            var5.method86(0, new class366(var4));
        }
        if (arg0) {
            return null;
        }
        var5.method79(4);
        if (var5.field197 != -1) {
            var5.method82(method2308(arg0, var5.field155), (byte) 72, method2308(false, var5.field197));
        }
        if (var5.field198 != -1) {
            var5.method87((byte) 126, method2308(arg0, var5.field198), method2308(false, var5.field170));
        }
        if (!class141.field2071 && var5.field145) {
            var5.field191 = class369.field5110.method2313((byte) -125, class106.field1492);
            var5.field147 = 0;
            var5.field186 = null;
            var5.field157 = false;
            var5.field142 = class194.field2803;
            var5.field151 = class19.field255;
            if (var5.field158 != null) {
                boolean var6 = false;
                for (class311 var7 = var5.field158.method842((byte) -25); var7 != null; var7 = var5.field158.method836(-116)) {
                    class200 var8 = class405.method2504((int) var7.field4226, (byte) -79);
                    if (var8.field2872) {
                        var7.method1884(false);
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var5.field158 = null;
                }
            }
        }
        class408 var9 = class22.field282;
        synchronized (class22.field282) {
            class22.field282.method2527(-102, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I", line = 84)
    public static final int method2309(int arg0, int arg1, int arg2) {
        field5089++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + arg2;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 98)
    public static void method2310(byte arg0) {
        field5095 = null;
        field5097 = null;
        field5098 = null;
        int var1 = -97 / ((arg0 - 41) / 40);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[B", line = 112)
    public static final byte[] method2311(int arg0, int arg1) {
        field5090++;
        if (arg0 != 0) {
            field5097 = null;
        }
        class402 var2 = (class402) class67.field940.method515(-1, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class92.method724(var4, var7, arg0 + 126);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class402(var3);
            class67.field940.method519((long) arg1, true, var2);
        }
        return var2.field5558;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V", line = 164)
    public static final void method2312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class50.field641 == 1) {
            class310.field4208[class220.field3085 / 100].method616(class309.field4197 - 8, class271.field3702 + -8);
        }
        field5093++;
        if (arg1 != 4) {
            field5091 = false;
        }
        if (class50.field641 == 2) {
            class310.field4208[class220.field3085 / 100 + 4].method616(class309.field4197 - 8, class271.field3702 - 8);
        }
        class416.method2568(-403);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V")
    public abstract void method413(int arg0, int arg1, int arg2, int arg3, Graphics arg4, byte arg5);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public abstract void method416(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method414(int arg0, int arg1, Graphics arg2, int arg3);
}
