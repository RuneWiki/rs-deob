import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class307 {

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public int field5272;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "F")
    public float field5271;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "F")
    public float field5270;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "F")
    public float field5265;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    private int field5274;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    private int field5269;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Lsk;")
    public static class199 field5267 = new class199(50);

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "Lmh;")
    public static class62 field5278 = class201.method1405(true, "(Udns");

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "J")
    public static long field5277 = 0L;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[Z")
    public static boolean[] field5266;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILhi;)V", line = 12)
    public static final void method2092(int arg0, class26 arg1) {
        field5275++;
        class193.field3251 = arg1;
        if (arg0 != -60) {
            field5268 = -37;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 25)
    public static void method2093(int arg0) {
        field5267 = null;
        field5266 = null;
        if (arg0 == -1) {
            field5278 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V", line = 51)
    public static final void method2094(int arg0, int arg1, int arg2) {
        class127.field2101 = class215.field3648[arg0][arg2].field5274;
        field5281++;
        if (arg1 == -60) {
            class186.field2967 = class215.field3648[arg0][arg2].field5269;
            class97.field1600 = class215.field3648[arg0][arg2].field5280;
            class179.method1262((float) class127.field2101, (float) class186.field2967, (float) class97.field1600);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)Lnb;", line = 71)
    public static final class134 method2095(int arg0, boolean arg1) {
        class134 var2 = (class134) class197.field3335.method263(2013, (long) arg0);
        if (!arg1) {
            field5278 = (class62) null;
        }
        field5282++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class91.field1428.method157(arg0, 26, (byte) 19);
        class134 var4 = new class134();
        if (var3 != null) {
            var4.method1014((byte) 120, new class92(var3));
        }
        class197.field3335.method257(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILmh;)I", line = 103)
    public static final int method2096(int arg0, class62 arg1) {
        field5276++;
        if (arg1.method439(107) == 0) {
            return -1;
        }
        if (arg0 < 113) {
            method2097(-109);
        }
        for (int var2 = 0; var2 < class252.field4270.field3942; var2++) {
            if (class252.field4270.field3934[var2].method445(class120.field2002, class181.field2876, 16058).method438(-11489, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 134)
    public static final void method2097(int arg0) {
        class249.field4226.method1392(0);
        if (arg0 == 8) {
            field5267.method1392(0);
            field5273++;
            class275.field4672.method1392(0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 145)
    public class307() {
        this.field5279 = class179.field2859;
        this.field5272 = 0;
        this.field5271 = 0.69921875F;
        this.field5270 = 1.2F;
        this.field5264 = class179.field2860;
        this.field5265 = 1.1523438F;
        this.field5274 = -50;
        this.field5269 = -60;
        this.field5280 = -50;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lmi;)V", line = 161)
    public class307(class92 arg0) {
        int var2 = arg0.method702(-1);
        if ((var2 & 0x1) == 0) {
            this.field5264 = class179.field2860;
        } else {
            this.field5264 = arg0.method704(1509947792);
        }
        if ((var2 & 0x2) == 0) {
            this.field5265 = 1.1523438F;
        } else {
            this.field5265 = (float) arg0.method721(68) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field5271 = 0.69921875F;
        } else {
            this.field5271 = (float) arg0.method721(47) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field5270 = 1.2F;
        } else {
            this.field5270 = (float) arg0.method721(23) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5280 = -50;
            this.field5269 = -60;
            this.field5274 = -50;
        } else {
            this.field5274 = arg0.method699((byte) -107);
            this.field5269 = arg0.method699((byte) -79);
            this.field5280 = arg0.method699((byte) -67);
        }
        if ((var2 & 0x20) == 0) {
            this.field5279 = class179.field2859;
        } else {
            this.field5279 = arg0.method704(1509947792);
        }
        if ((var2 & 0x40) == 0) {
            this.field5272 = 0;
        } else {
            this.field5272 = arg0.method721(48);
        }
    }
}
