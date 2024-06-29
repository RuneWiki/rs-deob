import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class37 implements class209 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lni;")
    private class522 field381;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Ltga;")
    private class58 field383;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lni;")
    private class522 field386;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[[I")
    public static int[][] field377 = new int[6][];

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[S")
    public static short[] field384 = new short[] { 20, 22, 44, 47, 51, 3, 45, 19 };

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field385;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field376;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[I")
    public static int[] field388;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lda;")
    private class61 field379;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZB)V")
    public final void method182(boolean arg0, byte arg1) {
        if (arg1 > -81) {
            this.method183(-24);
        }
        if (arg0) {
            int var3 = this.field383.field622.method3841(class751.field10419, this.field383.field626, (byte) 41) + this.field383.field614;
            int var4 = this.field383.field615.method606(this.field383.field620, class396.field5620, (byte) -56) + this.field383.field613;
            this.field379.method473(var3, null, this.field383.field626, this.field383.field612, 0, this.field383.field625, null, this.field383.field618, (byte) -67, this.field383.field617, null, this.field383.field624, 0, this.field383.field629, var4, this.field383.field620);
        }
        field378++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z")
    public final boolean method183(int arg0) {
        field380++;
        boolean var2 = true;
        if (!this.field381.method2882(-79, this.field383.field619)) {
            var2 = false;
        }
        if (arg0 != 14017) {
            this.field379 = null;
        }
        if (!this.field386.method2882(arg0 - 14055, this.field383.field619)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method184(byte arg0) {
        if (arg0 != -43) {
            method185(-62);
        }
        field382++;
        class377 var2 = class389.method2270(this.field386, true, this.field383.field619);
        this.field379 = class21.field142.method425(var2, class204.method1128(this.field381, this.field383.field619), true);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method185(int arg0) {
        if (arg0 != 51) {
            method185(-6);
        }
        field377 = null;
        field388 = null;
        field376 = null;
        field384 = null;
        field385 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lni;Lni;Ltga;)V")
    public class37(class522 arg0, class522 arg1, class58 arg2) {
        this.field381 = arg0;
        this.field383 = arg2;
        this.field386 = arg1;
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field385 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field376 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field388 = new int[1000];
    }
}
