import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class119 {

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Ljf;")
    public static class60 field1987 = new class60();

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1988 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Ldf;")
    public static class51 field1989 = class46.method233("RuneScape wird geladen )2 bitte warten)3)3)3", 100);

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Z")
    public static volatile boolean field1990 = true;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Ltg;")
    public static class171 field1984;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)Lsa;")
    public static final class241 method857(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class241 var4 = var3.field1627;
            var3.field1627 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZZ)V")
    public static final void method858(boolean arg0, boolean arg1) {
        class190.method1361(205);
        if (!arg0) {
            method858(true, true);
        }
        field1986++;
        if (class195.field3249 != 30 && class195.field3249 != 25) {
            return;
        }
        class154.field2565++;
        if (class154.field2565 < 50 && !arg1) {
            return;
        }
        class154.field2565 = 0;
        if (!class156.field2578 && class204.field3415 != null) {
            class95.field1575.method424((byte) 113, 209);
            class89.field1480++;
            try {
                class204.field3415.method840(0, -782, class95.field1575.field2014, class95.field1575.field2026);
                class95.field1575.field2026 = 0;
            } catch (IOException var2) {
                class156.field2578 = true;
            }
        }
        class190.method1361(205);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILrb;)V")
    public static final void method859(int arg0, class247 arg1) {
        if (class179.field2960 == arg1.field4302 || arg1.field4344 == -1 || arg1.field4321 != 0 || arg1.field4292 + 1 > class72.method501(arg1.field4344, (byte) 39).field2532[arg1.field4277]) {
            int var2 = class179.field2960 - arg1.field4278;
            int var3 = arg1.field4302 - arg1.field4278;
            int var4 = arg1.field4345 * 64 + arg1.field4317 * 128;
            int var5 = arg1.field4345 * 64 + arg1.field4329 * 128;
            int var6 = arg1.field4286 * 128 + (arg1.field4345 * 64);
            int var7 = arg1.field4345 * 64 + arg1.field4281 * 128;
            arg1.field4348 = ((var3 - var2) * var6 + var2 * var5) / var3;
            arg1.field4319 = ((var3 - var2) * var4 + var2 * var7) / var3;
        }
        if (arg1.field4331 == 0) {
            arg1.field4294 = 1024;
        }
        arg1.field4296 = 0;
        field1985++;
        if (arg0 != 1024) {
            method857(22, 56, -32);
        }
        if (arg1.field4331 == 1) {
            arg1.field4294 = 1536;
        }
        if (arg1.field4331 == 2) {
            arg1.field4294 = 0;
        }
        if (arg1.field4331 == 3) {
            arg1.field4294 = 512;
        }
        arg1.field4326 = arg1.field4294;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)V")
    public static final void method860(int arg0, int arg1, int arg2) {
        field1983++;
        long var3 = (long) ((arg2 << 16) + arg1);
        if (arg0 != -28600) {
            field1988 = null;
        }
        class228 var5 = (class228) class201.field3353.method1453(var3, 1);
        if (var5 != null) {
            class169.field2752.method403(var5, -71);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public static void method861(boolean arg0) {
        field1987 = null;
        field1988 = null;
        field1989 = null;
        field1984 = null;
        if (!arg0) {
            method859(99, (class247) null);
        }
    }
}
