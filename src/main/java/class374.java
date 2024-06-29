import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class374 {

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[Lwo;")
    public class692[] field5651 = null;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Ltq;")
    public class512 field5652 = null;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Ltq;")
    public class512 field5648 = null;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ltq;")
    public class512 field5656 = null;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[Lwo;")
    public class692[] field5657 = null;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Z")
    public boolean field5655;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[Lim;")
    public static class625[] field5649 = new class625[50];

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ltm;")
    public static class334 field5650 = new class334(15, 7);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "J")
    public static long field5653 = -1L;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2373(String arg0, int arg1) {
        field5654++;
        if (arg1 <= 116) {
            method2374(-120);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class127.method983((byte) -10, arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method2374(int arg0) {
        if (arg0 != 14278) {
            method2373(null, 106);
        }
        field5650 = null;
        field5649 = null;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lrs;)V")
    public class374(class166 arg0) {
        this.field5655 = arg0.field2801;
        class56.method525(arg0, 16);
        if (this.field5655) {
            byte[] var6 = class512.method3076(class642.field9102, 10583, false);
            this.field5648 = new class512(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class512.method3076(class426.field6264, 10583, false);
            this.field5656 = new class512(arg0, 6410, 128, 128, 16, var7, 6410);
            class431 var8 = arg0.field2759;
            if (var8.method2679(35632)) {
                byte[] var9 = class512.method3076(class580.field8214, 10583, false);
                this.field5652 = new class512(arg0, 6408, 128, 128, 16);
                class512 var10 = new class512(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2677(2.0F, this.field5652, var10, 5888)) {
                    this.field5652.method2957((byte) -66);
                } else {
                    this.field5652.method2965((byte) -40);
                    this.field5652 = null;
                }
                var10.method2965((byte) -40);
            }
        } else {
            this.field5657 = new class692[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class150.method1146(32768, var2 * 16384 * 2, class642.field9102, (byte) 113);
                this.field5657[var2] = new class692(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field5651 = new class692[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class150.method1146(32768, var3 * 128 * 256, class426.field6264, (byte) 113);
                this.field5651[var3] = new class692(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
