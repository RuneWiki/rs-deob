import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class94 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Ldc;")
    public static class36 field1767 = new class36();

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1768 = new CRC32();

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Lqe;")
    public static class179 field1770 = class206.method1380("<col=00ffff>", (byte) 85);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    public static int[] field1769;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method609(byte arg0) {
        field1768 = null;
        field1767 = null;
        field1770 = null;
        if (arg0 > -56) {
            method609((byte) -74);
        }
        field1769 = null;
    }
}
