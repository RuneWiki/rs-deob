import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class482 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lkm;")
    public class238[] field7113 = null;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lwt;")
    public class205 field7114 = null;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[Lkm;")
    public class238[] field7119 = null;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lwt;")
    public class205 field7118 = null;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lwt;")
    public class205 field7120 = null;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Z")
    public boolean field7116;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public static volatile boolean field7117 = false;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lwq;")
    public static class115 field7121 = new class115(0, -1);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 12)
    public static void method2943(int arg0) {
        if (arg0 == 6410) {
            field7121 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lur;)V", line = 47)
    public class482(class377 arg0) {
        this.field7116 = arg0.field5383;
        class497.method2991(arg0, 0);
        if (this.field7116) {
            byte[] var2 = class518.method3099(false, class428.field6223, 24160);
            this.field7118 = new class205(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class518.method3099(false, class212.field2845, 24160);
            this.field7114 = new class205(arg0, 6410, 128, 128, 16, var3, 6410);
            class321 var4 = arg0.field5314;
            if (var4.method1902((byte) 110)) {
                byte[] var5 = class518.method3099(false, class469.field6961, 24160);
                this.field7120 = new class205(arg0, 6408, 128, 128, 16);
                class205 var6 = new class205(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1904(var6, -18178, this.field7120, 2.0F)) {
                    this.field7120.method1561((byte) 126);
                } else {
                    this.field7120.method1553(-17);
                    this.field7120 = null;
                }
                var6.method1553(-127);
                return;
            }
        } else {
            this.field7119 = new class238[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class242.method1513(class428.field6223, true, 32768, var7 * 128 * 256);
                this.field7119[var7] = new class238(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field7113 = new class238[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class242.method1513(class212.field2845, true, 32768, var8 * 256 * 128);
                this.field7113[var8] = new class238(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
