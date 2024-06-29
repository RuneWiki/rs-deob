import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class339 {

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Lcl;")
    public class53 field4916 = null;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lcl;")
    public class53 field4917 = null;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lcl;")
    public class53 field4919 = null;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[Lbd;")
    public class142[] field4914 = null;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[Lbd;")
    public class142[] field4920 = null;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Z")
    public boolean field4912;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[[Z")
    public static boolean[][] field4915 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lrb;")
    public static class283 field4918 = new class283(72, 0);

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 3)
    public static void method2061(byte arg0) {
        field4918 = null;
        field4915 = null;
        int var1 = -55 % ((-arg0 - 44) / 43);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lpg;)V", line = 62)
    public class339(class333 arg0) {
        this.field4912 = arg0.field4799;
        class51.method341(false, arg0);
        if (this.field4912) {
            byte[] var6 = class234.method1428(class203.field2938, false, false);
            this.field4919 = new class53(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class234.method1428(class134.field2049, false, false);
            this.field4916 = new class53(arg0, 6410, 128, 128, 16, var7, 6410);
            class143 var8 = arg0.field4726;
            if (var8.method997(16532)) {
                byte[] var9 = class234.method1428(class363.field5223, false, false);
                this.field4917 = new class53(arg0, 6408, 128, 128, 16);
                class53 var10 = new class53(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method999(var10, 2.0F, (byte) 44, this.field4917)) {
                    this.field4917.method925(0);
                } else {
                    this.field4917.method923(-31252);
                    this.field4917 = null;
                }
                var10.method923(-31252);
            }
        } else {
            this.field4920 = new class142[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class153.method1102(-5, class203.field2938, 32768, var2 * 128 * 128 * 2);
                this.field4920[var2] = new class142(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field4914 = new class142[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class153.method1102(-5, class134.field2049, 32768, var3 * 16384 * 2);
                this.field4914[var3] = new class142(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)Z", line = 22)
    public static final boolean method2062(byte arg0, int arg1) {
        field4913++;
        int var2 = 41 / ((22 - arg0) / 42);
        if (arg1 == 22 || arg1 == 18 || arg1 == 19 || arg1 == 4 || arg1 == 21) {
            return true;
        } else {
            return arg1 == 9 || arg1 == 1001;
        }
    }
}
