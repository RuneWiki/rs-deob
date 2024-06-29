import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class688 extends class45 implements class477 {

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "[Lpm;")
    public static class131[] field9718 = new class131[35];

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "C")
    public char field9715;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public int field9723;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public int field9724;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public int field9725;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "J")
    public long field9711;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Lga;")
    public static class332 field9713;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "[Lci;")
    public static class152[] field9712;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Z", line = 9)
    public static final boolean method3889(int arg0, int arg1) {
        field9722++;
        int var2 = 54 / ((-arg0 - 46) / 33);
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)I", line = 19)
    public final int method2749(int arg0) {
        int var2 = -53 / ((-arg0 - 59) / 44);
        field9720++;
        return this.field9723;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)C", line = 32)
    public final char method2750(boolean arg0) {
        if (arg0) {
            this.field9725 = 86;
        }
        field9717++;
        return this.field9715;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V", line = 44)
    public static final void method3890(int arg0) {
        field9721++;
        class502.field6924 = null;
        if (arg0 != 29326) {
            return;
        }
        class564.method3129((byte) 87, class60.field750, 0, class399.field5301, 0, -1, 0, class164.field2349, 0);
        if (class502.field6924 != null) {
            class86.method473(0, class609.field8465, class60.field750, class399.field5301, -1412584499, class138.field1877, class502.field6924, 0, 32092, class342.field4584.field5604);
            class502.field6924 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I", line = 63)
    public final int method2746(int arg0) {
        if (arg0 != 4849) {
            this.method2748(-14);
        }
        field9710++;
        return this.field9725;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(JIII)V", line = 77)
    public static final void method3891(long arg0, int arg1, int arg2, int arg3) {
        field9714++;
        int var5 = ((int) arg0 & 0x7DDA2) >> 14;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (arg1 != -481834194) {
            method3889(114, -47);
        }
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class134.method776(0, 0, arg3, -75, true, var6, var5, arg2, 0);
            return;
        }
        class600 var8 = class118.field1510.method3921(var7, -67);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field8290;
            var9 = var8.field8343;
        } else {
            var9 = var8.field8290;
            var10 = var8.field8343;
        }
        int var11 = var8.field8287;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class134.method776(var9, var11, arg3, -35, true, 0, 0, arg2, var10);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)J", line = 122)
    public final long method2748(int arg0) {
        if (arg0 != 28704) {
            this.field9715 = '"';
        }
        field9719++;
        return this.field9711;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I", line = 133)
    public final int method2747(boolean arg0) {
        if (arg0) {
            method3893(-126, 124, 107, null, null);
        }
        field9716++;
        return this.field9724;
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V", line = 144)
    public static void method3892(int arg0) {
        field9713 = null;
        field9718 = null;
        field9712 = null;
        if (arg0 != 0) {
            method3891(-29L, -70, 112, -41);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIILia;Lia;)V", line = 163)
    public static final void method3893(int arg0, int arg1, int arg2, class190 arg3, class190 arg4) {
        class207 var5 = class549.method3077(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2768 = arg3;
        var5.field2767 = arg4;
        int var6 = class446.field5914 == class246.field3214 ? 1 : 0;
        if (!arg3.method161(28602)) {
            class100.field1206[var6][class189.field2627[var6]++] = arg3;
        } else if (arg3.method168(20071)) {
            class648.field8957[var6][class629.field8709[var6]++] = arg3;
        } else {
            class150.field2058[var6][class57.field730[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method161(28602)) {
            if (arg4.method168(20071)) {
                class648.field8957[var6][class629.field8709[var6]++] = arg4;
                return;
            }
            class150.field2058[var6][class57.field730[var6]++] = arg4;
            return;
        }
        class100.field1206[var6][class189.field2627[var6]++] = arg4;
    }
}
