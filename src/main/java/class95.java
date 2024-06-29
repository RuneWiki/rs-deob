import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class95 extends class310 {

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "B")
    public byte field1373 = 5;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Llc;")
    public static class435 field1380 = new class435(24, 3);

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1383;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Z")
    public boolean field1379;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "[I")
    public static int[] field1384;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[Ls;")
    public static class339[] field1372;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method734(byte arg0) {
        field1383 = null;
        field1384 = null;
        field1372 = null;
        if (arg0 != -119) {
            method734((byte) 32);
        }
        field1380 = null;
    }
}
