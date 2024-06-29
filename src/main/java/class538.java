import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class538 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lmfa;")
    public class615[] field7543 = null;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lkv;")
    public class268 field7544 = null;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lkv;")
    public class268 field7547 = null;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lkv;")
    public class268 field7551 = null;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "[Lmfa;")
    public class615[] field7550 = null;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Z")
    public boolean field7545;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
    public static int[] field7549 = new int[4096];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lsaa;")
    public static class326 field7546 = new class326("game4", 3);

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lbh;")
    public static class36 field7542;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[Z")
    public static boolean[] field7548;

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Leea;)V", line = 35)
    public class538(class131 arg0) {
        this.field7545 = arg0.field1842;
        class507.method2997((byte) -82, arg0);
        if (this.field7545) {
            byte[] var6 = class294.method1917(2, false, class288.field4075);
            this.field7551 = new class268(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class294.method1917(2, false, class404.field5717);
            this.field7547 = new class268(arg0, 6410, 128, 128, 16, var7, 6410);
            class561 var8 = arg0.field1789;
            if (var8.method3232(true)) {
                byte[] var9 = class294.method1917(2, false, class195.field2601);
                this.field7544 = new class268(arg0, 6408, 128, 128, 16);
                class268 var10 = new class268(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3233(2.0F, var10, 0, this.field7544)) {
                    this.field7544.method1290(0);
                } else {
                    this.field7544.method1286(true);
                    this.field7544 = null;
                }
                var10.method1286(true);
            }
        } else {
            this.field7550 = new class615[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class661.method3622(class288.field4075, var2 * 128 * 256, 0, 32768);
                this.field7550[var2] = new class615(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field7543 = new class615[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class661.method3622(class404.field5717, var3 * 128 * 256, 0, 32768);
                this.field7543[var3] = new class615(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 100)
    public static void method3124(int arg0) {
        if (arg0 != 16) {
            field7542 = null;
        }
        field7549 = null;
        field7542 = null;
        field7548 = null;
        field7546 = null;
    }
}
