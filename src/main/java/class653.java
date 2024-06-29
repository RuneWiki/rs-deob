import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class653 {

    @OriginalMember(owner = "client!go", name = "d", descriptor = "Lek;")
    public class532 field9121 = null;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "[Lkm;")
    public class373[] field9122 = null;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[Lkm;")
    public class373[] field9120 = null;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "Lek;")
    public class532 field9119 = null;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Lek;")
    public class532 field9124 = null;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "Z")
    public boolean field9123;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lvea;")
    public static class288 field9125 = new class288(1);

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Lfba;")
    public static class27 field9127 = new class27(49, 2);

    @OriginalMember(owner = "client!go", name = "l", descriptor = "Lbu;")
    public static class21 field9129 = new class21(11, -2);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Ldp;")
    public static class3 field9128;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Lti;")
    public static class463 field9126;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 7)
    public static void method3745(int arg0) {
        field9128 = null;
        field9127 = null;
        if (arg0 <= 38) {
            field9128 = null;
        }
        field9126 = null;
        field9125 = null;
        field9129 = null;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lqfa;)V", line = 46)
    public class653(class106 arg0) {
        this.field9123 = arg0.field1494;
        class442.method2632(arg0, 128);
        if (this.field9123) {
            byte[] var2 = class56.method388(true, false, class330.field4578);
            this.field9119 = new class532(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class56.method388(true, false, class519.field7337);
            this.field9121 = new class532(arg0, 6410, 128, 128, 16, var3, 6410);
            class199 var4 = arg0.field1438;
            if (var4.method1372(0)) {
                byte[] var5 = class56.method388(true, false, class619.field8653);
                this.field9124 = new class532(arg0, 6408, 128, 128, 16);
                class532 var6 = new class532(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1371(2.0F, this.field9124, false, var6)) {
                    this.field9124.method1318(91);
                } else {
                    this.field9124.method1310((byte) -102);
                    this.field9124 = null;
                }
                var6.method1310((byte) -102);
                return;
            }
        } else {
            this.field9122 = new class373[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class157.method1202(32768, var7 * 128 * 128 * 2, class330.field4578, false);
                this.field9122[var7] = new class373(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field9120 = new class373[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class157.method1202(32768, var8 * 2 * 16384, class519.field7337, false);
                this.field9120[var8] = new class373(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
