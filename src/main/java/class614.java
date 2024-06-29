import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class614 extends RuntimeException {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Ljava/lang/String;")
    public String field8508;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field8509;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field8510 = 0;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lga;")
    public static class332 field8506;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Ljava/lang/String;")
    public static String field8513;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[[[B")
    public static byte[][][] field8511;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lha;III[Z)V", line = 14)
    public static final void method3395(class117 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class446.field5914 == class246.field3214) {
            return;
        }
        int var5 = class454.field5981[arg1].method1609(arg2, arg3, 55);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class270 var7 = class454.field5981[var6];
                if (var7 != null) {
                    var7.method1357(arg0, arg2, var5 - var7.method1609(arg2, arg3, 95), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 41)
    public static void method3396(byte arg0) {
        if (arg0 != -24) {
            method3396((byte) -78);
        }
        field8513 = null;
        field8506 = null;
        field8511 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 53)
    public class614(Throwable arg0, String arg1) {
        this.field8508 = arg1;
        this.field8509 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z", line = 65)
    public static final boolean method3397(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field8512 = -82;
        }
        field8507++;
        return (arg0 & 0x84080) != 0;
    }
}
