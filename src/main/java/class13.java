import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field113 = new String[100];

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "J")
    public static long field117 = 0L;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Z")
    public static boolean field115 = false;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Lpca;")
    public static class653 field114 = new class653(20);

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "[Lxa;")
    public static class458[] field121;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "[Lgi;")
    public static class620[] field120;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[[S")
    public static short[][] field116;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method62(int arg0) {
        field119++;
        int var1 = class11.field111;
        int[] var2 = class79.field827;
        for (int var3 = arg0; var3 < var1; var3++) {
            class455 var4 = class362.field4726[var2[var3]];
            if (var4 != null) {
                class368.method2014(var4, var4.method1656(true), (byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 29)
    public static void method63(byte arg0) {
        if (arg0 != 62) {
            field114 = null;
        }
        field120 = null;
        field116 = null;
        field121 = null;
        field114 = null;
        field113 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lag;I)V", line = 58)
    public static final void method64(class625 arg0, int arg1) {
        field118++;
        if (arg1 != -9581) {
            return;
        }
        for (class282 var2 = (class282) class390.field5211.method3174((byte) 49); var2 != null; var2 = (class282) class390.field5211.method3168(false)) {
            if (var2.field3570 == arg0) {
                if (var2.field3577 != null) {
                    class424.field5641.method2852(var2.field3577);
                    var2.field3577 = null;
                }
                var2.method1519((byte) 121);
                return;
            }
        }
    }
}
