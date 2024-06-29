import java.math.BigInteger;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class140 extends class193 {

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lie;")
    public static class117 field2482 = new class117(20);

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2485 = new CRC32();

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field2487 = 0;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lia;")
    public static class257 field2486 = class28.method234(114, "labels)3dat");

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[I")
    public static int[] field2488 = new int[32];

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2489 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Lia;")
    private static class257 field2492 = class28.method234(-128, "Loading title screen )2 ");

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "[Lia;")
    public static class257[] field2496 = new class257[1000];

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Lia;")
    public static class257 field2495 = field2492;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lia;")
    private static class257 field2490 = class28.method234(-107, "purple:");

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Lia;")
    public static class257 field2494 = field2490;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Lia;")
    public static class257 field2493 = field2490;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method953(byte arg0) {
        field2490 = null;
        field2485 = null;
        field2495 = null;
        field2482 = null;
        field2492 = null;
        field2493 = null;
        field2488 = null;
        if (arg0 > 18) {
            field2496 = null;
            field2486 = null;
            field2489 = null;
            field2494 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static final void method954(int arg0) {
        field2481++;
        int var1 = class71.field1399.method792(class34.field657);
        for (int var2 = 0; var2 < class199.field3407; var2++) {
            int var6 = class71.field1399.method792(class233.method1541((byte) 112, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class169.field2920 = class199.field3407 * 15 + 22;
        var1 += 8;
        class182.field3152 = var1;
        int var3 = class199.field3407 * 15 + 21;
        class216.field3663 = true;
        int var4 = class105.field1952 - (var1 / 2);
        if (class12.field241 < var1 + var4) {
            var4 = class12.field241 - var1;
        }
        if (var4 < arg0) {
            var4 = 0;
        }
        class213.field3644 = var4;
        int var5 = class74.field1430;
        if (var5 + var3 > class166.field2897) {
            var5 = class166.field2897 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class207.field3547 = var5;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static final void method955(byte arg0) {
        field2483++;
        class252.method1649();
        for (int var1 = 0; var1 < 4; var1++) {
            class173.field2961[var1].method1552(0);
        }
        if (arg0 >= -115) {
            field2486 = null;
        }
        System.gc();
    }
}
