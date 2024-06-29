import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class565 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Ldv;")
    public class87 field8030 = null;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[Lfq;")
    public class204[] field8035 = null;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Ldv;")
    public class87 field8038 = null;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Ldv;")
    public class87 field8036 = null;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[Lfq;")
    public class204[] field8034 = null;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Z")
    public boolean field8037;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field8033 = -1;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lwu;")
    public static class557 field8032;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[Lta;")
    public static class27[] field8029;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)Z", line = 4)
    public static final boolean method3379(int arg0, byte arg1, int arg2) {
        if (arg1 < 72) {
            return false;
        } else {
            field8031++;
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lep;)V", line = 54)
    public class565(class371 arg0) {
        this.field8037 = arg0.field5018;
        class702.method3955(128, arg0);
        if (this.field8037) {
            byte[] var2 = class379.method2314(false, class573.field8105, (byte) -112);
            this.field8036 = new class87(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class379.method2314(false, class264.field3594, (byte) -107);
            this.field8038 = new class87(arg0, 6410, 128, 128, 16, var3, 6410);
            class290 var4 = arg0.field4948;
            if (var4.method1712(105)) {
                byte[] var5 = class379.method2314(false, class475.field6489, (byte) -122);
                this.field8030 = new class87(arg0, 6408, 128, 128, 16);
                class87 var6 = new class87(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1713(var6, this.field8030, -124, 2.0F)) {
                    this.field8030.method2408((byte) -89);
                } else {
                    this.field8030.method2411(0);
                    this.field8030 = null;
                }
                var6.method2411(0);
                return;
            }
        } else {
            this.field8034 = new class204[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class435.method2615(class573.field8105, 32768, 13997, var7 * 128 * 2 * 128);
                this.field8034[var7] = new class204(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field8035 = new class204[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class435.method2615(class264.field3594, 32768, 13997, var8 * 128 * 256);
                this.field8035[var8] = new class204(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 24)
    public static void method3380(boolean arg0) {
        field8029 = null;
        if (!arg0) {
            method3379(-123, (byte) -60, -88);
        }
        field8032 = null;
    }
}
