import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class467 extends class451 {

    @OriginalMember(owner = "client!od", name = "G", descriptor = "[[I")
    public static int[][] field6714 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Ldg;")
    public static class376 field6712 = new class376(68, 3);

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field6717 = 0;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "Lwba;")
    public static class46 field6719 = new class46();

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Luq;")
    public static class146 field6721;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "[B")
    private byte[] field6720;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2760(String arg0, byte arg1) {
        field6713++;
        if (arg0 == null) {
            return;
        }
        if (!(class142.field2091 < 200 || class149.field2169) || class142.field2091 >= 200) {
            class60.method639(4, class274.field4126.method1804(7175, class512.field7203), 65535);
            String var2 = class274.field4127.method1804(7175, class512.field7203);
            if (var2 != null) {
                class60.method639(4, var2, 65535);
            }
            return;
        }
        String var3 = class563.method3220((byte) 89, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class142.field2091; var4++) {
            String var9 = class563.method3220((byte) 55, class124.field1865[var4]);
            if (var9 != null && var9.equals(var3)) {
                class60.method639(4, arg0 + class274.field4154.method1804(7175, class512.field7203), 65535);
                return;
            }
            if (class668.field9444[var4] != null) {
                String var10 = class563.method3220((byte) 62, class668.field9444[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class60.method639(4, arg0 + class274.field4154.method1804(7175, class512.field7203), 65535);
                    return;
                }
            }
        }
        if (arg1 > -64) {
            return;
        }
        for (int var5 = 0; var5 < class363.field5180; var5++) {
            String var7 = class563.method3220((byte) 55, class98.field1547[var5]);
            if (var7 != null && var7.equals(var3)) {
                class60.method639(4, class274.field4159.method1804(7175, class512.field7203) + arg0 + class274.field4160.method1804(7175, class512.field7203), 65535);
                return;
            }
            if (class484.field6879[var5] != null) {
                String var8 = class563.method3220((byte) 116, class484.field6879[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class60.method639(4, class274.field4159.method1804(7175, class512.field7203) + arg0 + class274.field4160.method1804(7175, class512.field7203), 65535);
                    return;
                }
            }
        }
        if (class563.method3220((byte) 64, class648.field9106.field6981).equals(var3)) {
            class60.method639(4, class274.field4157.method1804(7175, class512.field7203), 65535);
            return;
        }
        class23.field308++;
        class135 var6 = class688.method3794(class190.field2748, class583.field8198, (byte) 38);
        var6.field1978.method3853((byte) 51, class652.method3606(12351, arg0));
        var6.field1978.method3837(4102, arg0);
        class19.method223(var6, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIB)V")
    public final void method2392(boolean arg0, int arg1, byte arg2) {
        if (arg0) {
            this.method2762(97, (byte) -14, 89, -34);
        }
        field6716++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6720[var10001] = var5;
        this.field6720[var6] = var5;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lvb;")
    public static final class178 method2761(int arg0) {
        field6711++;
        if (arg0 != -16192) {
            field6712 = null;
        }
        return class23.field316 < class439.field6407.length ? class439.field6407[class23.field316++] : null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)[B")
    public final byte[] method2762(int arg0, byte arg1, int arg2, int arg3) {
        field6715++;
        if (arg1 <= 60) {
            return null;
        } else {
            this.field6720 = new byte[arg0 * arg2 * arg3 * 2];
            this.method3724(arg0, arg2, arg3, -1029882484);
            return this.field6720;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class467() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
    public static void method2763(byte arg0) {
        field6714 = null;
        field6719 = null;
        field6721 = null;
        if (arg0 < -50) {
            field6712 = null;
        }
    }
}
