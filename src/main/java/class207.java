import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class207 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lij;")
    public class391 field2975 = null;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "[Lgaa;")
    public class275[] field2974 = null;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lij;")
    public class391 field2973 = null;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lij;")
    public class391 field2977 = null;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "[Lgaa;")
    public class275[] field2979 = null;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Z")
    public boolean field2976;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Ldb;")
    public static class298 field2978 = new class298(75, -2);

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[I")
    public static int[] field2980 = new int[8];

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "Lgba;")
    public static class625 field2981;

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lno;)V", line = 48)
    public class207(class658 arg0) {
        this.field2976 = arg0.field9307;
        class484.method2703((byte) -45, arg0);
        if (this.field2976) {
            byte[] var6 = class50.method338(false, class702.field9898, 15900);
            this.field2975 = new class391(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class50.method338(false, class172.field2650, 15900);
            this.field2977 = new class391(arg0, 6410, 128, 128, 16, var7, 6410);
            class109 var8 = arg0.field9188;
            if (var8.method809((byte) -109)) {
                byte[] var9 = class50.method338(false, class11.field212, 15900);
                this.field2973 = new class391(arg0, 6408, 128, 128, 16);
                class391 var10 = new class391(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method813(122, 2.0F, var10, this.field2973)) {
                    this.field2973.method2167(113);
                } else {
                    this.field2973.method2170(9729);
                    this.field2973 = null;
                }
                var10.method2170(9729);
            }
        } else {
            this.field2979 = new class275[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class227.method1422(32768, var2 * 128 * 256, class702.field9898, false);
                this.field2979[var2] = new class275(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field2974 = new class275[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class227.method1422(32768, var3 * 256 * 128, class172.field2650, false);
                this.field2974[var3] = new class275(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 22)
    public static void method1338(int arg0) {
        if (arg0 != 128) {
            method1338(-113);
        }
        field2980 = null;
        field2981 = null;
        field2978 = null;
    }
}
