import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class258 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public int field4488 = 0;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lwd;")
    public static class217 field4490 = new class217(new byte[5000]);

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field4495 = -1;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field4496 = 0;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Lij;")
    public static class50 field4494 = class78.method578(122, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field4497 = 0;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[B)V")
    public static final void method1735(int arg0, byte[] arg1) {
        class217 var2 = new class217(arg1);
        int var3 = var2.method1441(-10);
        int var4 = 0;
        if (arg0 > 0) {
            return;
        }
        while (var4 < var3) {
            class129 var5 = new class129();
            class50 var6 = var2.method1469((byte) -111);
            var5.field2265 = var2.method1441(109);
            var5.field2258 = var2.method1441(-111);
            var5.field2266 = var2.method1487(255);
            var5.field2263 = var6.method410(32, 0, 47);
            var5.field2256 = var6.method389(47, false);
            class172.field2858.method684(var5, (byte) 109);
            var4++;
        }
        field4492++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILwd;B)V")
    private final void method1736(int arg0, class217 arg1, byte arg2) {
        if (arg2 != 82) {
            field4497 = -67;
        }
        if (arg0 == 5) {
            this.field4488 = arg1.method1441(arg2 ^ 0xE);
        }
        field4487++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
    public static final int method1737(int arg0, int arg1) {
        field4485++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (~arg1 <= arg0) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)I")
    public static final int method1738(int arg0, int arg1) {
        field4493++;
        return arg1 == -411383350 ? arg0 >>> 10 : 82;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)I")
    public static final int method1739(int arg0, int arg1) {
        if (arg0 == 23918) {
            field4486++;
            return arg1 >>> 8;
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method1740(boolean arg0) {
        field4490 = null;
        field4494 = null;
        if (arg0) {
            method1740(false);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILwd;)V")
    public final void method1741(int arg0, class217 arg1) {
        if (arg0 != 0) {
            field4497 = 48;
        }
        while (true) {
            int var3 = arg1.method1487(255);
            if (var3 == 0) {
                field4489++;
                return;
            }
            this.method1736(var3, arg1, (byte) 82);
        }
    }
}
