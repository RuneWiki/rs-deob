import java.awt.Rectangle;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class250 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lmh;")
    private class537 field3222;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
    public static int[] field3225;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3224;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[Lmc;")
    public static class114[] field3228;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
    public static int[] field3229;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[I")
    public static int[] field3230;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[[[B")
    public static byte[][][] field3223;

    @OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3222.method3081((byte) -57, this.field3226);
        field3221++;
        super.finalize();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field3225 = null;
        field3223 = null;
        field3224 = null;
        field3230 = null;
        field3229 = null;
        field3228 = null;
        if (arg0 != 24768) {
            method1421(-95);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lpq;BILjava/lang/String;)Lvs;")
    public static final class506 method1422(class165 arg0, byte arg1, int arg2, String arg3) {
        field3227++;
        if (arg2 == 0) {
            return arg0.method911(arg3, (byte) 83);
        } else if (arg2 == 1) {
            try {
                class47.method250(false, new Object[] { (new URL(arg0.field2014.getCodeBase(), arg3)).toString() }, arg0.field2014, "openjs");
                class506 var4 = new class506();
                var4.field7031 = 1;
                return var4;
            } catch (Throwable var11) {
                class506 var5 = new class506();
                var5.field7031 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg0.field2014.getAppletContext().showDocument(new URL(arg0.field2014.getCodeBase(), arg3), "_blank");
                class506 var6 = new class506();
                var6.field7031 = 1;
                return var6;
            } catch (Exception var12) {
                class506 var7 = new class506();
                var7.field7031 = 2;
                return var7;
            }
        } else {
            int var8 = -86 % ((-arg1 - 58) / 52);
            if (arg2 != 3) {
                throw new IllegalArgumentException();
            }
            try {
                class47.method249("loggedout", arg0.field2014, (byte) 125);
            } catch (Throwable var14) {
            }
            try {
                arg0.field2014.getAppletContext().showDocument(new URL(arg0.field2014.getCodeBase(), arg3), "_top");
                class506 var9 = new class506();
                var9.field7031 = 1;
                return var9;
            } catch (Exception var13) {
                class506 var10 = new class506();
                var10.field7031 = 2;
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lmh;II)V")
    public class250(class537 arg0, int arg1, int arg2) {
        this.field3222 = arg0;
        this.field3226 = arg2;
    }

    static {
        new class180("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field3225 = new int[1000];
        field3224 = new Rectangle[100];
        field3228 = new class114[50];
        field3229 = new int[] { 2047, 16383, 65535 };
        for (int var0 = 0; var0 < 100; var0++) {
            field3224[var0] = new Rectangle();
        }
        field3230 = new int[1000];
    }
}
