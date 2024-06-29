import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class28 {

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "J")
    public static long field379 = 0L;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "[I")
    public static int[] field383 = new int[128];

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "Lh;")
    public static class15 field386 = class26.method190(true, "50(U");

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Z")
    public static boolean field382 = false;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "Z")
    public static volatile boolean field385 = true;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "B")
    public byte field384;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "[B")
    public byte[] field380;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 7)
    public static void method203(byte arg0) {
        if (arg0 > -42) {
            field386 = null;
        }
        field386 = null;
        field383 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(ILjava/lang/String;)Lh;", line = 44)
    public static final class15 method204(int arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class15 var4 = new class15();
        var4.field247 = var2;
        var4.field250 = arg0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field250++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 74)
    public final void method205(int arg0) {
        boolean var2 = true;
        if (arg0 != 0) {
            method203((byte) -91);
        }
        if (this.field380 == null) {
            return;
        }
        this.field384 = this.field380[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field380[var3] != this.field384) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field380 = null;
        }
    }
}
