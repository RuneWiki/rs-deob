import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class648 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lgj;")
    public class635 field8914 = null;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[Ltp;")
    public class533[] field8915 = null;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lgj;")
    public class635 field8917 = null;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lgj;")
    public class635 field8911 = null;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[Ltp;")
    public class533[] field8919 = null;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Z")
    public boolean field8913;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field8912 = new String[200];

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field8918 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method3674(boolean arg0) {
        if (arg0) {
            method3674(true);
        }
        field8912 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lqo;)V")
    public class648(class22 arg0) {
        this.field8913 = arg0.field653;
        class206.method1426(8, arg0);
        if (this.field8913) {
            byte[] var2 = class216.method1547(false, class716.field9751, 53146732);
            this.field8911 = new class635(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class216.method1547(false, class516.field7191, 53146732);
            this.field8917 = new class635(arg0, 6410, 128, 128, 16, var3, 6410);
            class567 var4 = arg0.field558;
            if (var4.method3282(35632)) {
                byte[] var5 = class216.method1547(false, class605.field8307, 53146732);
                this.field8914 = new class635(arg0, 6408, 128, 128, 16);
                class635 var6 = new class635(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method3281(this.field8914, var6, -114, 2.0F)) {
                    this.field8914.method449(-82);
                } else {
                    this.field8914.method451(-19948);
                    this.field8914 = null;
                }
                var6.method451(-19948);
                return;
            }
        } else {
            this.field8915 = new class533[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class742.method4071((byte) 97, class716.field9751, var7 * 128 * 2 * 128, 32768);
                this.field8915[var7] = new class533(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field8919 = new class533[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class742.method4071((byte) 110, class516.field7191, var8 * 2 * 16384, 32768);
                this.field8919[var8] = new class533(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
