import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lsc;")
    public static class128 field3519 = class129.method1017(false, "blinken2:");

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lsc;")
    public static class128 field3518 = class129.method1017(false, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[Z")
    public static boolean[] field3517 = new boolean[100];

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lsc;")
    private static class128 field3525 = class129.method1017(false, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lsc;")
    public static class128 field3523 = field3525;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lrb;")
    public static class120 field3516 = new class120(64);

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lsf;")
    public static class131 field3521;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3515;

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class153() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method1212(int arg0, int arg1, int arg2) {
        field3522++;
        if (class149.field3440 != 0 && arg1 != -1) {
            class79.method595(0, class146.field3377, arg2 + 13394, arg1, false, class149.field3440);
            class67.field1511 = true;
        }
        if (arg2 != -13393) {
            method1213(-96, null);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILhe;)Lhe;")
    public static final class54 method1213(int arg0, class54 arg1) {
        field3524++;
        int var2 = class151.method1202((byte) -36, class77.method561(98, arg1));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = arg0; var3 < var2; var3++) {
            arg1 = class46.method338(arg1.field1175, -116);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1214(int arg0) {
        field3516 = null;
        field3519 = null;
        field3521 = null;
        field3525 = null;
        field3518 = null;
        field3517 = null;
        if (arg0 != 0) {
            field3516 = null;
        }
        field3523 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z[BLmc;)V")
    public final void method1215(boolean arg0, byte[] arg1, class86 arg2) {
        field3520++;
        if (arg2.field1920[arg2.field1924] != 31 || arg2.field1920[arg2.field1924 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg0) {
            method1212(-105, 72, -69);
        }
        if (this.field3515 == null) {
            this.field3515 = new Inflater(true);
        }
        try {
            this.field3515.setInput(arg2.field1920, arg2.field1924 + 10, -arg2.field1924 - 10 - 8 + arg2.field1920.length);
            this.field3515.inflate(arg1);
        } catch (Exception var4) {
            this.field3515.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3515.reset();
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V")
    private class153(int arg0, int arg1, int arg2) {
    }
}
