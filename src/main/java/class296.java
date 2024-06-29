import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class296 {

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field4837 = 0;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lsf;")
    public static class124 field4832 = new class124(4);

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "F")
    public static float field4843;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Lgf;", line = 5)
    public static final class11 method2124(int arg0, int arg1) {
        class11 var2 = (class11) class119.field2124.method893((long) arg1, 65);
        field4840++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class232.field3806.method1404(class156.method1108(arg1, (byte) 68), class120.method873(8, arg1), (byte) -100);
        class11 var4 = new class11();
        var4.field354 = arg1;
        if (var3 != null) {
            var4.method120(new class146(var3), 57);
        }
        var4.method112(false);
        if (~var4.field300 != arg0) {
            var4.method121(true, method2124(arg0 ^ 0x0, var4.field300), method2124(0, var4.field296));
        }
        if (var4.field303 != -1) {
            var4.method111(method2124(arg0 ^ 0x0, var4.field314), (byte) 57, method2124(0, var4.field303));
        }
        if (!class201.field3365 && var4.field359) {
            var4.field334 = class51.field1043;
            var4.field361 = false;
            var4.field318 = class73.field1341;
            var4.field353 = 0;
            var4.field340 = class234.field3836;
        }
        class119.field2124.method888((long) arg1, var4, 79);
        return var4;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V", line = 43)
    public static final void method2125(int arg0, int arg1) {
        field4838++;
        int var2 = -89 / ((48 - arg0) / 59);
        class199 var3 = class173.method1231(false, 2, arg1);
        var3.method1358(-1);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([BZ)[B", line = 55)
    public static final byte[] method2126(byte[] arg0, boolean arg1) {
        field4839++;
        if (arg0 == null) {
            return null;
        }
        if (!arg1) {
            method2131(-53);
        }
        byte[] var2 = new byte[arg0.length];
        class89.method689(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Loe;I)Lpf;", line = 80)
    public static final class97 method2127(class146 arg0, int arg1) {
        if (arg1 == 2) {
            field4833++;
            return new class97(arg0.method1050(3), arg0.method1050(3), arg0.method1050(3), arg0.method1050(3), arg0.method1025((byte) -102), arg0.method1005((byte) 122));
        } else {
            return (class97) null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 91)
    public static final void method2128(int arg0) {
        class325.field5245 = class145.method985(8, 0.4F, 35, arg0, 2048, (byte) 95, 8, true);
        field4842++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZLek;Lek;)V", line = 100)
    public static final void method2129(int arg0, boolean arg1, class206 arg2, class206 arg3) {
        class57.field1141 = arg1;
        if (arg0 < -41) {
            class205.field3417 = arg2;
            class19.field505 = arg3;
            field4834++;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z", line = 120)
    public static final boolean method2130(int arg0, int arg1, int arg2) {
        int var3 = class120.field2136[arg0][arg1][arg2];
        if (-class264.field4332 == var3) {
            return false;
        } else if (class264.field4332 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class153.method1093(var4 + 1, class144.field2427[arg0][arg1][arg2], var5 + 1) && class153.method1093(var4 + 128 - 1, class144.field2427[arg0][arg1 + 1][arg2], var5 + 1) && class153.method1093(var4 + 128 - 1, class144.field2427[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class153.method1093(var4 + 1, class144.field2427[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class120.field2136[arg0][arg1][arg2] = class264.field4332;
                return true;
            } else {
                class120.field2136[arg0][arg1][arg2] = -class264.field4332;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V", line = 150)
    public static void method2131(int arg0) {
        if (arg0 != 128) {
            field4843 = 0.013576541F;
        }
        field4832 = null;
    }
}
