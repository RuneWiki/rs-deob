import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class23 {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lfj;")
    public class659 field281 = null;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[Lfba;")
    public class350[] field279 = null;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lfj;")
    public class659 field282 = null;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[Lfba;")
    public class350[] field280 = null;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lfj;")
    public class659 field283 = null;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Z")
    public boolean field284;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lst;")
    public static class335 field278 = new class335(76, 3);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Luu;")
    public static class237 field277;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 3)
    public static void method130(boolean arg0) {
        if (!arg0) {
            field278 = null;
            field277 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ldw;)V", line = 45)
    public class23(class664 arg0) {
        this.field284 = arg0.field9131;
        class159.method995(arg0, 30723);
        if (this.field284) {
            byte[] var2 = class229.method1363(82, class723.field10041, false);
            this.field282 = new class659(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class229.method1363(111, class236.field3496, false);
            this.field281 = new class659(arg0, 6410, 128, 128, 16, var3, 6410);
            class669 var4 = arg0.field9006;
            if (var4.method3772(-87)) {
                byte[] var5 = class229.method1363(83, class268.field3924, false);
                this.field283 = new class659(arg0, 6408, 128, 128, 16);
                class659 var6 = new class659(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method3773(115, this.field283, var6, 2.0F)) {
                    this.field283.method3291(-1);
                } else {
                    this.field283.method3288(-122);
                    this.field283 = null;
                }
                var6.method3288(-119);
                return;
            }
        } else {
            this.field280 = new class350[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class446.method2723(class723.field10041, var7 * 128 * 128 * 2, 32768, 33);
                this.field280[var7] = new class350(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field279 = new class350[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class446.method2723(class236.field3496, var8 * 128 * 2 * 128, 32768, 93);
                this.field279[var8] = new class350(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
