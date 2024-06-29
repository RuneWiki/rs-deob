import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class86 {

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
    public static int[] field1411 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lsc;")
    public static class256 field1409 = new class256(16);

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1412 = new CRC32();

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field1418 = -1;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "J")
    public long field1408;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Luf;")
    public static class176 field1419;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lqd;")
    public static class3 field1416;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lnc;")
    public class86 field1407;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lnc;")
    public class86 field1414;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
    public static int[] field1410;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[[B")
    public static byte[][] field1417;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method692(int arg0) {
        field1412 = null;
        field1410 = null;
        field1416 = null;
        field1419 = null;
        field1411 = null;
        field1417 = null;
        if (arg0 == 15156) {
            field1409 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method693(int arg0) {
        int var2 = -57 % ((arg0 - 29) / 44);
        field1413++;
        if (this.field1414 != null) {
            this.field1414.field1407 = this.field1407;
            this.field1407.field1414 = this.field1414;
            this.field1407 = null;
            this.field1414 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Z")
    public final boolean method694(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field1406++;
            return this.field1414 != null;
        }
    }
}
