import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class151 extends class288 {

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "[B")
    public byte[] field2191;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2195 = 0;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2198;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "[Z")
    public static boolean[] field2192;

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
    public class151(byte[] arg0) {
        this.field2191 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public static final int method993(int arg0, int arg1) {
        field2196++;
        if (arg0 > arg1) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[Lwe;ZIIZ)V")
    public static final void method994(int arg0, class82[] arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        int var6 = 0;
        if (arg2) {
            return;
        }
        while (arg1.length > var6) {
            class82 var7 = arg1[var6];
            if (var7 != null && var7.field1101 == arg4) {
                class152.method998(arg0, arg3, -15809, arg5, var7);
                class66.method404(arg3, 22595, var7, arg0);
                if (var7.field1113 - var7.field1131 < var7.field1125) {
                    var7.field1125 = var7.field1113 - var7.field1131;
                }
                if (var7.field1079 - var7.field1048 < var7.field1018) {
                    var7.field1018 = var7.field1079 - var7.field1048;
                }
                if (var7.field1018 < 0) {
                    var7.field1018 = 0;
                }
                if (var7.field1125 < 0) {
                    var7.field1125 = 0;
                }
                if (var7.field1026 == 0) {
                    class54.method324((byte) 122, var7, arg5);
                }
            }
            var6++;
        }
        field2194++;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public static void method995(int arg0) {
        field2192 = null;
        if (arg0 > -113) {
            field2195 = 38;
        }
        field2198 = null;
    }
}
