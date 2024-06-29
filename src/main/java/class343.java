import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class343 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field5116;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lrt;")
    public class133 field5118;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[I")
    public int[] field5119;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLgt;)[Lkw;")
    public static final class138[] method2207(boolean arg0, class66 arg1) {
        field5120++;
        if (!arg1.method447(111)) {
            return new class138[0];
        }
        class329 var2 = arg1.method466(-15864);
        while (var2.field4974 == 0) {
            class468.method2848(10L, (byte) -98);
        }
        if (var2.field4974 == 2) {
            return new class138[0];
        }
        int[] var3 = (int[]) var2.field4975;
        if (arg0) {
            method2208(-29, 75, -116);
        }
        class138[] var4 = new class138[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class138 var6 = new class138();
            var4[var5] = var6;
            var6.field2085 = var3[var5 << 2];
            var6.field2086 = var3[(var5 << 2) + 1];
            var6.field2090 = var3[(var5 << 2) + 2];
            var6.field2084 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public static final void method2208(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4376 != null) {
            var3.field4376 = null;
        }
        if (var3.field4389 != null) {
            var3.field4389 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static final void method2209(int arg0) {
        class258.field4135 = new class128[50];
        field5117++;
        class510.field7414 = 0;
        if (arg0 > -1) {
            field5121 = -14;
        }
    }
}
