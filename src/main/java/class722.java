import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class722 {

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "[Lgha;")
    public class520[] field9479 = null;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "[Lgha;")
    public class520[] field9482 = null;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "Lkq;")
    public class362 field9483 = null;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Lkq;")
    public class362 field9485 = null;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Lkq;")
    public class362 field9486 = null;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "Z")
    public boolean field9478;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "Lqv;")
    public static class116 field9484;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "Lwm;")
    public static class30 field9481;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 3)
    public static void method3866(int arg0) {
        if (arg0 == 3553) {
            field9484 = null;
            field9481 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lck;)V", line = 37)
    public class722(class733 arg0) {
        this.field9478 = arg0.field9912;
        class197.method1358(arg0, -67);
        if (this.field9478) {
            byte[] var2 = class170.method1076(class525.field6680, 18406, false);
            this.field9483 = new class362(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class170.method1076(class362.field4411, 18406, false);
            this.field9485 = new class362(arg0, 6410, 128, 128, 16, var3, 6410);
            class34 var4 = arg0.field9808;
            if (var4.method195((byte) 86)) {
                byte[] var5 = class170.method1076(class110.field1479, 18406, false);
                this.field9486 = new class362(arg0, 6408, 128, 128, 16);
                class362 var6 = new class362(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method193(this.field9486, 2.0F, (byte) 20, var6)) {
                    this.field9486.method752(Integer.MAX_VALUE);
                } else {
                    this.field9486.method753(-1);
                    this.field9486 = null;
                }
                var6.method753(-1);
                return;
            }
        } else {
            this.field9479 = new class520[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class24.method109(class525.field6680, 32768, -2312, var7 * 16384 * 2);
                this.field9479[var7] = new class520(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field9482 = new class520[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class24.method109(class362.field4411, 32768, -2312, var8 * 2 * 128 * 128);
                this.field9482[var8] = new class520(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
