import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class222 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[Lwg;")
    public class393[] field3104 = null;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lpp;")
    public class38 field3105 = null;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lpp;")
    public class38 field3103 = null;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[Lwg;")
    public class393[] field3109 = null;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lpp;")
    public class38 field3110 = null;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Z")
    public boolean field3106;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "F")
    public static float field3108;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lbv;)V", line = 28)
    public class222(class282 arg0) {
        this.field3106 = arg0.field4221;
        class425.method2558(128, arg0);
        if (this.field3106) {
            byte[] var6 = class1.method6((byte) -85, class31.field467, false);
            this.field3103 = new class38(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class1.method6((byte) -85, class253.field3508, false);
            this.field3110 = new class38(arg0, 6410, 128, 128, 16, var7, 6410);
            class268 var8 = arg0.field4081;
            if (var8.method1714((byte) -26)) {
                byte[] var9 = class1.method6((byte) -85, class224.field3157, false);
                this.field3105 = new class38(arg0, 6408, 128, 128, 16);
                class38 var10 = new class38(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method1715(this.field3105, var10, 2.0F, (byte) 82)) {
                    this.field3105.method124(126);
                } else {
                    this.field3105.method121((byte) -57);
                    this.field3105 = null;
                }
                var10.method121((byte) -57);
            }
        } else {
            this.field3104 = new class393[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class470.method2821(class31.field467, var2 * 256 * 128, false, 32768);
                this.field3104[var2] = new class393(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field3109 = new class393[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class470.method2821(class253.field3508, var3 * 128 * 128 * 2, false, 32768);
                this.field3109[var3] = new class393(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
