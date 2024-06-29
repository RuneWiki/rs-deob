import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class100 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    public static int[] field1594 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field1599 = 1;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1592 = new CRC32();

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field1602 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method622(int arg0) {
        field1592 = null;
        if (arg0 >= 0) {
            field1594 = null;
        }
        field1594 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Ldg;")
    public static final class148 method623(int arg0, int arg1) {
        field1597++;
        class148 var2 = (class148) class62.field1110.method991((long) arg1, arg0 - 25857);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class12.field141.method826((byte) 35, class257.method1776(6840, arg1), class30.method211(arg1, (byte) -103));
        class148 var4 = new class148();
        var4.field2503 = arg1;
        if (var3 != null) {
            var4.method1007(88, new class225(var3));
        }
        var4.method998(false);
        if (var4.field2534 != arg0) {
            var4.method1000((byte) -2, method623(-1, var4.field2545), method623(arg0, var4.field2534));
        }
        if (var4.field2511 != -1) {
            var4.method1003(method623(-1, var4.field2511), -115, method623(-1, var4.field2523));
        }
        if (!class261.field4595 && var4.field2513) {
            var4.field2512 = null;
            var4.field2537 = 0;
            var4.field2508 = null;
            var4.field2540 = false;
            var4.field2529 = class159.field2697;
        }
        class62.field1110.method987(var4, (long) arg1, -2438);
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BIIII)V")
    public static final void method624(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -4) {
            method623(-32, 83);
        }
        field1593++;
        class207.field3680 = arg1;
        class99.field1584 = arg4;
        class37.field678 = arg2;
        class242.field4314 = arg3;
    }
}
