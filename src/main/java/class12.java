import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class12 extends RuntimeException {

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field143;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Ljava/lang/String;")
    public String field137;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Ld;")
    public static class7 field139 = class38.method251((byte) 87, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "Ld;")
    public static class7 field140 = class38.method251((byte) 55, "Water Source");

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Ld;")
    public static class7 field142 = class38.method251((byte) -67, "codeversion");

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "[I")
    public static int[] field135;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(BLjava/lang/String;)Ld;", line = 10)
    public static final class7 method105(byte arg0, String arg1) {
        int var2 = -26 % ((arg0 + 15) / 51);
        byte[] var3;
        try {
            var3 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var3 = arg1.getBytes();
        }
        class7 var5 = new class7();
        var5.field76 = 0;
        var5.field75 = var3;
        for (int var6 = 0; var6 < var3.length; var6++) {
            if (var3[var6] != 0) {
                var3[var5.field76++] = var3[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 72)
    public static void method106(int arg0) {
        field139 = null;
        field142 = null;
        field140 = null;
        if (arg0 <= 6) {
            field138 = 38;
        }
        field135 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 98)
    public class12(Throwable arg0, String arg1) {
        this.field143 = arg0;
        this.field137 = arg1;
    }
}
