import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class550 {

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "Lgr;")
    public class439 field7259 = null;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "[Lsia;")
    public class737[] field7261 = null;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "Lgr;")
    public class439 field7262 = null;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "[Lsia;")
    public class737[] field7266 = null;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "Lgr;")
    public class439 field7265 = null;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "Z")
    public boolean field7264;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "[I")
    public static int[] field7260 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "[Laba;")
    public static class177[] field7257;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "[Lnc;")
    public static class23[] field7256;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "[Lre;")
    public static class602[] field7263;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)V")
    public static final void method3073(int arg0, int arg1, int arg2) {
        class701 var3 = class660.field8718[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class495.method2796(var3.field9729);
        class495.method2796(var3.field9739);
        if (var3.field9729 != null) {
            var3.field9729 = null;
        }
        if (var3.field9739 != null) {
            var3.field9739 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
    public static void method3074(byte arg0) {
        field7256 = null;
        field7260 = null;
        field7263 = null;
        field7257 = null;
        if (arg0 != -75) {
            method3074((byte) -23);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BI)S")
    public static final short method3075(byte arg0, int arg1) {
        if (arg0 > -103) {
            return -107;
        }
        field7258++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x387) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lrda;)V")
    public class550(class663 arg0) {
        this.field7264 = arg0.field9059;
        class592.method3221(-112, arg0);
        if (this.field7264) {
            byte[] var2 = class464.method2631(class583.field7638, false, -30711);
            this.field7265 = new class439(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class464.method2631(class176.field2658, false, -30711);
            this.field7262 = new class439(arg0, 6410, 128, 128, 16, var3, 6410);
            class34 var4 = arg0.field8950;
            if (var4.method284(35632)) {
                byte[] var5 = class464.method2631(class148.field2335, false, -30711);
                this.field7259 = new class439(arg0, 6408, 128, 128, 16);
                class439 var6 = new class439(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method283(this.field7259, 2.0F, (byte) 113, var6)) {
                    this.field7259.method2616((byte) -70);
                } else {
                    this.field7259.method2618(91);
                    this.field7259 = null;
                }
                var6.method2618(-74);
                return;
            }
        } else {
            this.field7266 = new class737[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class501.method2821(class583.field7638, 108, 32768, var7 * 16384 * 2);
                this.field7266[var7] = new class737(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field7261 = new class737[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class501.method2821(class176.field2658, 44, 32768, var8 * 128 * 128 * 2);
                this.field7261[var8] = new class737(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
