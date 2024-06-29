import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class294 extends class738 {

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Ldh;")
    public static class320 field3614 = new class320(37, 7);

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "Lhs;")
    public static class325 field3621 = new class325(7, 2);

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "Ljava/lang/Object;")
    public static Object field3620;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "[B")
    private byte[] field3618;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
    public static final void method1745(int arg0, int arg1) {
        field3623++;
        class47 var2 = class258.method1546(arg0, arg1, (byte) 121);
        var2.method274(false);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BIB)V")
    public final void method1394(byte arg0, int arg1, byte arg2) {
        field3616++;
        int var4 = arg1 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field3618[var10001] = -1;
        if (arg0 == 1) {
            int var5 = arg2 & 0xFF;
            this.field3618[var6] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public static void method1746(byte arg0) {
        field3614 = null;
        field3621 = null;
        field3620 = null;
        if (arg0 != 59) {
            method1747(false, -72, 68, 69);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class294() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(ZIII)Lkw;")
    public static final class249 method1747(boolean arg0, int arg1, int arg2, int arg3) {
        field3613++;
        class249 var4 = null;
        if (arg1 == 0) {
            class156.field1713++;
            var4 = class289.method1715(class472.field6762, 116, class41.field470);
        }
        if (arg1 == 1) {
            var4 = class289.method1715(class417.field5807, 104, class41.field470);
            class123.field1299++;
        }
        var4.field3016.method1470((byte) -122, class464.field6624 + arg2);
        var4.field3016.method1471(-37, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
        var4.field3016.method1446(class181.field2144 + arg3, arg0);
        class471.field6718 = arg2;
        class75.field796 = arg3;
        class115.field1202 = false;
        class286.method1705((byte) 8);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZLoh;II)V")
    public static final void method1748(int arg0, int arg1, boolean arg2, class404 arg3, int arg4, int arg5) {
        field3617++;
        if (arg0 != 15251) {
            field3614 = null;
        }
        class537.method3158(arg5, arg3, arg4, 256, 0L, arg1, arg2);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1749(int arg0, int arg1, int arg2, int arg3) {
        this.field3618 = new byte[arg1 * 2 * arg3 * arg0];
        int var5 = -50 / ((arg2 - 30) / 58);
        field3622++;
        this.method3296((byte) -48, arg0, arg3, arg1);
        return this.field3618;
    }
}
