import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class349 extends class117 {

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public int field5398 = 0;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public int field5386;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public int field5389;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public int field5391;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public int field5392;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public int field5394;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public int field5396;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public int field5399;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public int field5403;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Lno;")
    public class181 field5384;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "Lbd;")
    public class226 field5397;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "Lbd;")
    public class226 field5405;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "Lqm;")
    public class228 field5404;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Lei;")
    public class261 field5388;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "Z")
    public boolean field5393;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "[I")
    public static int[] field5395;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "[I")
    public int[] field5400;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 5)
    public final void method2446(int arg0) {
        field5401++;
        if (arg0 != 7819) {
            this.field5399 = -65;
        }
        int var2 = this.field5399;
        if (this.field5388 != null) {
            class261 var3 = this.field5388.method1925(88);
            if (var3 == null) {
                this.field5400 = null;
                this.field5406 = 0;
                this.field5399 = -1;
                this.field5394 = 0;
                this.field5390 = 0;
                this.field5392 = 0;
            } else {
                this.field5394 = var3.field3890;
                this.field5390 = var3.field3944;
                this.field5406 = var3.field3916;
                this.field5400 = var3.field3917;
                this.field5399 = var3.field3966;
                this.field5392 = var3.field3897 * 128;
            }
        } else if (this.field5384 != null) {
            int var4 = class312.method2186(this.field5384, 255);
            if (var2 != var4) {
                this.field5399 = var4;
                class214 var5 = this.field5384.field2609;
                if (var5.field3142 != null) {
                    var5 = var5.method1539(false);
                }
                if (var5 == null) {
                    this.field5406 = this.field5392 = 0;
                } else {
                    this.field5406 = var5.field3140;
                    this.field5392 = var5.field3111 * 128;
                }
            }
        } else if (this.field5404 != null) {
            this.field5399 = class180.method1249(this.field5404, 0);
            this.field5406 = this.field5404.field3448;
            this.field5392 = this.field5404.field3432 * 128;
        }
        if (this.field5399 != var2 && this.field5405 != null) {
            class179.field2576.method1397(this.field5405);
            this.field5405 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Lid;", line = 97)
    public static final class200 method2447(int arg0, byte arg1) {
        if (arg1 != -9) {
            field5395 = (int[]) null;
        }
        class200 var2 = (class200) class263.field4030.method461((byte) 120, (long) arg0);
        field5407++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class355.field5448.method2520(36, arg0, (byte) -25);
        class200 var4 = new class200();
        var4.field2921 = arg0;
        if (var3 != null) {
            var4.method1457(new class190(var3), -1);
        }
        class263.field4030.method460(var4, -26089, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIBIIII)V", line = 124)
    public static final void method2448(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field5402++;
        if (class256.method1887(arg7, -1)) {
            if (arg4 != 127) {
                method2447(61, (byte) 57);
            }
            class14.method82(class119.field1677[arg7], -123, arg1, arg0, arg6, arg5, arg3, -1, arg8, arg2);
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class332.field5051[var9] = true;
            }
        } else {
            class332.field5051[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 170)
    public static void method2449(int arg0) {
        if (arg0 == 13297) {
            field5395 = null;
        }
    }
}
