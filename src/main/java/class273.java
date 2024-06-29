import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class273 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[Lsa;")
    public class532[] field4344 = null;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[Lsa;")
    public class532[] field4347 = null;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ler;")
    public class160 field4348 = null;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ler;")
    public class160 field4350 = null;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Ler;")
    public class160 field4349 = null;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Z")
    public boolean field4346;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1844(int arg0, String arg1, int arg2) {
        field4351++;
        class456 var3 = class233.method1654(arg0, 2, 123);
        if (arg2 != 128) {
            method1844(-32, null, -107);
        }
        var3.method2858(arg2 ^ 0x288A);
        var3.field7037 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lna;)V")
    public class273(class211 arg0) {
        this.field4346 = arg0.field3600;
        class14.method80(arg0, 16);
        if (this.field4346) {
            byte[] var6 = class153.method937(class15.field162, false, (byte) -97);
            this.field4349 = new class160(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class153.method937(class221.field3737, false, (byte) -55);
            this.field4350 = new class160(arg0, 6410, 128, 128, 16, var7, 6410);
            class1 var8 = arg0.field3478;
            if (var8.method4(35632)) {
                byte[] var9 = class153.method937(class181.field2627, false, (byte) 97);
                this.field4348 = new class160(arg0, 6408, 128, 128, 16);
                class160 var10 = new class160(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method5(var10, -128, 2.0F, this.field4348)) {
                    this.field4348.method2701((byte) 103);
                } else {
                    this.field4348.method2698(0);
                    this.field4348 = null;
                }
                var10.method2698(0);
            }
        } else {
            this.field4344 = new class532[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class339.method2249(-128, 32768, var2 * 128 * 256, class15.field162);
                this.field4344[var2] = new class532(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field4347 = new class532[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class339.method2249(-128, 32768, var3 * 256 * 128, class221.field3737);
                this.field4347[var3] = new class532(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    static {
        new class213("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }
}
