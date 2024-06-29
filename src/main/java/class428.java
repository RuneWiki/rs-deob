import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class428 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[Lsq;")
    public class120[] field6399 = null;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[Lsq;")
    public class120[] field6401 = null;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Liq;")
    public class434 field6403 = null;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Liq;")
    public class434 field6402 = null;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Liq;")
    public class434 field6407 = null;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Z")
    public boolean field6400;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Lbj;")
    public static class162 field6398 = new class162(48, 3);

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "[[I")
    public static int[][] field6408 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Los;")
    public static class309 field6405 = new class309("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Los;")
    public static class309 field6409 = new class309(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Llb;")
    public static class383 field6410 = new class383("WTRC", 1);

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lgv;")
    public static class58 field6404;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 4)
    public static void method2586(int arg0) {
        field6410 = null;
        field6408 = null;
        if (arg0 != -1859) {
            field6404 = null;
        }
        field6405 = null;
        field6409 = null;
        field6404 = null;
        field6398 = null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lda;)V", line = 47)
    public class428(class44 arg0) {
        this.field6400 = arg0.field854;
        class198.method1350((byte) 114, arg0);
        if (this.field6400) {
            byte[] var6 = class160.method1144(false, 112, class281.field4247);
            this.field6403 = new class434(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class160.method1144(false, 100, class93.field1851);
            this.field6402 = new class434(arg0, 6410, 128, 128, 16, var7, 6410);
            class194 var8 = arg0.field808;
            if (var8.method1310((byte) 115)) {
                byte[] var9 = class160.method1144(false, 94, class390.field5861);
                this.field6407 = new class434(arg0, 6408, 128, 128, 16);
                class434 var10 = new class434(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method1312(2.0F, this.field6407, var10, -1)) {
                    this.field6407.method2349((byte) 18);
                } else {
                    this.field6407.method2341((byte) -75);
                    this.field6407 = null;
                }
                var10.method2341((byte) -70);
            }
        } else {
            this.field6401 = new class120[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class234.method1540(var2 * 128 * 256, 32768, 1, class281.field4247);
                this.field6401[var2] = new class120(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field6399 = new class120[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class234.method1540(var3 * 128 * 128 * 2, 32768, 1, class93.field1851);
                this.field6399[var3] = new class120(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
