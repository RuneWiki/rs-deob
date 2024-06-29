import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class149 {

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Ldc;")
    public static class37 field2827 = class185.method1233((byte) 86, "document)3cookie=(R");

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "J")
    public static long field2822 = 0L;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Ldc;")
    public static class37 field2825 = class185.method1233((byte) 86, "hint_headicons");

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field2828 = -1;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public int field2820;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "J")
    public long field2819;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Ljc;")
    public static class100 field2830;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lwb;")
    public static class239 field2816;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Ldj;")
    public static class44 field2821;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Ldj;")
    public static class44 field2824;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lia;")
    public class88 field2829;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method1025(int arg0) {
        if (arg0 != -1686910681) {
            field2821 = null;
        }
        field2825 = null;
        field2824 = null;
        field2821 = null;
        field2816 = null;
        field2827 = null;
        field2830 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static final void method1026(boolean arg0) {
        field2817++;
        int var1 = (class238.field4382.field3505 >> 7) + class99.field1735;
        int var2 = (class238.field4382.field3490 >> 7) + class124.field2212;
        class245.field4482 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class245.field4482 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class245.field4482 = 1;
        }
        if (class245.field4482 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class245.field4482 = 0;
        }
        if (!arg0) {
            field2822 = -59L;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1027(int arg0, byte[] arg1) {
        class28 var2 = new class28(arg1);
        field2818++;
        int var3 = var2.method215(-1797813752);
        int var4 = var2.method226(arg0 + 111);
        if (var4 < arg0 || class230.field4217 != 0 && class230.field4217 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method204(var4, var7, arg0 ^ 0x70, 0);
            return var7;
        } else {
            int var5 = var2.method226(arg0 ^ 0x6C);
            if (var5 < 0 || class230.field4217 != 0 && var5 > class230.field4217) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class188.method1253(var6, var5, arg1, var4, 9);
            } else {
                class39.field816.method1520(var6, false, var2);
            }
            return var6;
        }
    }
}
