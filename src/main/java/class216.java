import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class216 extends class151 {

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "Lbd;")
    private static class162 field3610 = class17.method142(0, "level: ");

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Lbd;")
    public static class162 field3605 = field3610;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "Lqb;")
    public static class209 field3612 = new class209(50);

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "J")
    public long field3604;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "Lqi;")
    public class216 field3607;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Lqi;")
    public class216 field3611;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "Lgj;")
    public static class294 field3614;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Lob;")
    public static class78 field3606;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lvf;", line = 11)
    public static final class268 method1569(int arg0, int arg1) {
        if (arg0 <= 72) {
            field3613 = -20;
        }
        class268 var2 = (class268) class284.field4807.method1382((byte) -71, (long) arg1);
        field3608++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field978.method1128(arg1, 0, 26);
        class268 var4 = new class268();
        if (var3 != null) {
            var4.method1834(new class94(var3), false);
        }
        class284.field4807.method1386(var4, -68, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIILda;)[Lud;", line = 37)
    public static final class79[] method1570(int arg0, int arg1, int arg2, class143 arg3) {
        field3609++;
        if (arg0 != 29931) {
            field3613 = 106;
        }
        return class94.method757(arg3, arg1, arg0 ^ 0x8E41E33B, arg2) ? class42.method310((byte) -115) : null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lrk;III)V", line = 51)
    public static final void method1571(class255 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class32.field524) {
            class225 var4 = class288.field4856[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3763 != null && var4.field3763.field2659.method824()) {
                arg0.method797(var4.field3763.field2659, 128, 0, 0, true);
            }
        }
        if (arg3 < class32.field524) {
            class225 var5 = class288.field4856[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3763 != null && var5.field3763.field2659.method824()) {
                arg0.method797(var5.field3763.field2659, 0, 0, 128, true);
            }
        }
        if (arg2 < class32.field524 && arg3 < class158.field2787) {
            class225 var6 = class288.field4856[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3763 != null && var6.field3763.field2659.method824()) {
                arg0.method797(var6.field3763.field2659, 128, 0, 128, true);
            }
        }
        if (arg2 < class32.field524 && arg3 > 0) {
            class225 var7 = class288.field4856[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3763 != null && var7.field3763.field2659.method824()) {
                arg0.method797(var7.field3763.field2659, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 99)
    public static void method1572(byte arg0) {
        field3606 = null;
        field3614 = null;
        field3612 = null;
        int var1 = 75 / ((-arg0 - 6) / 62);
        field3605 = null;
        field3610 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 113)
    public final void method1573(int arg0) {
        field3615++;
        if (this.field3611 == null) {
            return;
        }
        this.field3611.field3607 = this.field3607;
        if (arg0 != -9728) {
            method1570(92, 101, -108, (class143) null);
        }
        this.field3607.field3611 = this.field3611;
        this.field3611 = null;
        this.field3607 = null;
    }
}
