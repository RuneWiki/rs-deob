import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 implements Runnable {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[Lib;")
    public volatile class57[] field1042 = new class57[2];

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
    public volatile boolean field1052 = false;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Z")
    public volatile boolean field1047 = false;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lja;")
    private static class62 field1045 = class30.method243(43, "No reply from loginserver)3");

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lja;")
    public static class62 field1044 = field1045;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1054 = -1;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lc;")
    public static class18 field1049 = new class18(64);

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field1061 = 50;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[I")
    public static int[] field1058 = new int[field1061];

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lja;")
    public static class62 field1064 = class30.method243(43, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "[Lja;")
    public static class62[] field1062 = new class62[field1061];

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lja;")
    public static class62 field1057 = class30.method243(43, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
    public static int[] field1065 = new int[field1061];

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
    public static int[] field1060 = new int[field1061];

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "[I")
    public static int[] field1066 = new int[field1061];

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[I")
    public static int[] field1059 = new int[field1061];

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "[I")
    public static int[] field1067 = new int[field1061];

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
    public static int[] field1063 = new int[field1061];

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "[Lqb;")
    public static class112[] field1068 = new class112[4];

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lea;")
    public static class29 field1056;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lfe;")
    public class41 field1046;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method329(int arg0) {
        if (arg0 >= -103) {
            field1068 = null;
        }
        field1045 = null;
        field1044 = null;
        field1062 = null;
        field1049 = null;
        field1067 = null;
        field1064 = null;
        field1066 = null;
        field1056 = null;
        field1057 = null;
        field1058 = null;
        field1059 = null;
        field1063 = null;
        field1068 = null;
        field1065 = null;
        field1060 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[BII)Lja;")
    public static final class62 method330(byte arg0, byte[] arg1, int arg2, int arg3) {
        field1051++;
        if (arg0 != 42) {
            field1045 = null;
        }
        class62 var4 = new class62();
        var4.field1538 = 0;
        var4.field1504 = new byte[arg2];
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field1504[var4.field1538++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
    public final void run() {
        this.field1047 = true;
        field1055++;
        try {
            while (!this.field1052) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1042[var1];
                    if (var2 != null) {
                        var2.method394(false);
                    }
                }
                class146.method1168(-19127, 10L);
                class146.method1166(this.field1046, 1, null);
            }
        } catch (Exception var9) {
            class93.method715(var9, null, true);
        } finally {
            Object var6 = null;
            this.field1047 = false;
        }
    }
}
