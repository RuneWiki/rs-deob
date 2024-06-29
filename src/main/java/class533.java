import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class533 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ltj;")
    public class210 field7503 = null;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[Lld;")
    public class182[] field7508 = null;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Ltj;")
    public class210 field7507 = null;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[Lld;")
    public class182[] field7505 = null;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Ltj;")
    public class210 field7509 = null;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Z")
    public boolean field7506;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lsi;")
    public static class586 field7504 = new class586();

    @OriginalMember(owner = "client!od", name = "h", descriptor = "J")
    public static long field7510 = 0L;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method3172(int arg0, int arg1, int arg2, int arg3) {
        class727 var4 = class107.field1351[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class377 var5 = var4.field10171;
        class377 var6 = var4.field10181;
        if (var5 != null) {
            var5.field4765 = (short) (var5.field4765 * arg3 / (0x10 << class714.field10017 - 7));
            var5.field4767 = (short) (var5.field4767 * arg3 / (0x10 << class714.field10017 - 7));
        }
        if (var6 != null) {
            var6.field4765 = (short) (var6.field4765 * arg3 / (0x10 << class714.field10017 - 7));
            var6.field4767 = (short) (var6.field4767 * arg3 / (0x10 << class714.field10017 - 7));
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lpc;)V", line = 86)
    public class533(class700 arg0) {
        this.field7506 = arg0.field9793;
        class757.method4222(true, arg0);
        if (this.field7506) {
            byte[] var2 = class439.method2590(true, class342.field4296, false);
            this.field7509 = new class210(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class439.method2590(true, class720.field10113, false);
            this.field7503 = new class210(arg0, 6410, 128, 128, 16, var3, 6410);
            class451 var4 = arg0.field9728;
            if (var4.method2740(35632)) {
                byte[] var5 = class439.method2590(true, class728.field10192, false);
                this.field7507 = new class210(arg0, 6408, 128, 128, 16);
                class210 var6 = new class210(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method2739(1, this.field7507, 2.0F, var6)) {
                    this.field7507.method2344(1);
                } else {
                    this.field7507.method2346(10833);
                    this.field7507 = null;
                }
                var6.method2346(10833);
                return;
            }
        } else {
            this.field7508 = new class182[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class737.method4147(32768, (byte) -84, var7 * 16384 * 2, class342.field4296);
                this.field7508[var7] = new class182(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field7505 = new class182[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class737.method4147(32768, (byte) -84, var8 * 128 * 128 * 2, class720.field10113);
                this.field7505[var8] = new class182(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 41)
    public static final void method3173(int arg0, int arg1) {
        field7511++;
        if (arg1 != 25540) {
            return;
        }
        class318 var2 = (class318) class444.field5950.method2121(100, (long) arg0);
        if (var2 != null) {
            var2.field3911 = !var2.field3911;
            var2.field3917.method2243(arg1 ^ 0xFFFF9C7F, var2.field3911);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 60)
    public static void method3174(int arg0) {
        field7504 = null;
        if (arg0 != 16) {
            field7510 = -39L;
        }
    }
}
