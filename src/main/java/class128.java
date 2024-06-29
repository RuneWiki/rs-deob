import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class128 extends class130 {

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "[B")
    public byte[] field2509;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "[Lsd;")
    public static class166[] field2507 = new class166[100];

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2513 = 0;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "[I")
    public static int[] field2516 = new int[100];

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "B")
    public static byte field2514 = 0;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static void method907(int arg0) {
        if (arg0 != 22588) {
            field2507 = null;
        }
        field2507 = null;
        field2516 = null;
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static final void method908(int arg0) {
        field2517++;
        if (arg0 <= 57) {
            return;
        }
        for (class46 var1 = (class46) class32.field588.method1109((byte) -83); var1 != null; var1 = (class46) class32.field588.method1115((byte) 112)) {
            if (var1.field817 == -1) {
                var1.field827 = 0;
                class16.method87(var1, 1);
            } else {
                var1.method915(0);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public static final void method909(int arg0, int arg1, int arg2) {
        field2515++;
        long var3 = (long) ((arg0 << 16) + arg2);
        class89 var5 = (class89) class89.field1748.method224(-1, var3);
        if (var5 != null) {
            class136.field2656.method781(-30103, var5);
            if (arg1 != 0) {
                method909(-28, 89, 45);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)Lsd;")
    public static final class166 method910(boolean arg0, int arg1) {
        field2511++;
        class166 var2 = new class166();
        var2.field3187 = 0;
        if (arg0) {
            var2.field3162 = new byte[arg1];
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
    public class128(byte[] arg0) {
        this.field2509 = arg0;
    }
}
