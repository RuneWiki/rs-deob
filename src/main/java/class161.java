import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class161 extends class644 {

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "[[I")
    public static int[][] field2220 = new int[128][128];

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2217 = new CRC32();

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "Ltba;")
    private class165 field2224;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "Ltw;")
    public static class205 field2219;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILsl;I)V", line = 6)
    private final void method1127(int arg0, class461 arg1, int arg2) {
        field2226++;
        if (arg0 != -8164 || arg2 != 249) {
            return;
        }
        int var4 = arg1.method2600((byte) -124);
        if (this.field2224 == null) {
            int var5 = class565.method3253(119, var4);
            this.field2224 = new class165(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method2600((byte) -127) == 1;
            int var8 = arg1.method2576((byte) 40);
            class168 var9;
            if (var7) {
                var9 = new class645(arg1.method2574(-1));
            } else {
                var9 = new class393(arg1.method2622(-539564808));
            }
            this.field2224.method1153(var9, (long) var8, arg0 + 8163);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZ)I", line = 57)
    public final int method1128(int arg0, int arg1, boolean arg2) {
        field2223++;
        if (arg2) {
            this.method1131(null, (byte) -112, -92);
        }
        if (this.field2224 == null) {
            return arg0;
        } else {
            class393 var4 = (class393) this.field2224.method1160((long) arg1, 119);
            return var4 == null ? arg0 : var4.field4992;
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V", line = 81)
    public static void method1129(byte arg0) {
        field2217 = null;
        if (arg0 == 53) {
            field2219 = null;
            field2220 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILsl;)V", line = 93)
    public final void method1130(int arg0, class461 arg1) {
        field2221++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2600((byte) -125);
            if (var3 == 0) {
                return;
            }
            this.method1127(-8164, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;", line = 118)
    public final String method1131(String arg0, byte arg1, int arg2) {
        field2222++;
        if (this.field2224 == null) {
            return arg0;
        }
        class645 var4 = (class645) this.field2224.method1160((long) arg2, 119);
        if (var4 == null) {
            return arg0;
        } else if (arg1 >= -67) {
            return null;
        } else {
            return var4.field8929;
        }
    }
}
