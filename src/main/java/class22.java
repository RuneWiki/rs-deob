import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class22 {

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Ls;")
    private class227 field281;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lqj;")
    private static class196 field271 = class80.method502(" is already on your friend list)3", -48);

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lqj;")
    public static class196 field274 = field271;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lea;")
    public static class243 field277 = new class243();

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lqj;")
    public static class196 field284 = class80.method502("<col=ffffff> )4 ", -48);

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lqj;")
    public static class196 field285 = class80.method502("gelb:", -48);

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Lqj;")
    public static class196 field290 = class80.method502(":", -48);

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field288 = 5063219;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "J")
    public static long field286;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)V")
    public static final void method128(int arg0, int arg1, int arg2, int arg3) {
        field287++;
        class178 var4 = class62.method394(arg2 ^ arg2, arg1, arg0);
        if (var4 != null && var4.field3152 != null) {
            class157 var5 = new class157();
            var5.field2526 = var4;
            var5.field2534 = var4.field3152;
            class88.method550(var5, arg2 - 16829);
        }
        class203.field3670 = arg1;
        class62.field848 = arg3;
        class211.field3798 = arg0;
        class171.field2883 = true;
        class214.method1472(arg2 - 16817, var4);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IJLpe;)V")
    public final void method129(int arg0, long arg1, class258 arg2) {
        this.field281.method1532(true, arg1, new class223(arg2));
        field275++;
        if (arg0 != 30972) {
            field286 = -35L;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
    public final void method130(int arg0, int arg1) {
        this.field281.method1535(arg1, 30704);
        int var3 = 5 % ((arg0 - 5) / 55);
        field283++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method131(int arg0) {
        field274 = null;
        field277 = null;
        field290 = null;
        field285 = null;
        if (arg0 == 0) {
            field271 = null;
            field284 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)Lpe;")
    public final class258 method132(long arg0, int arg1) {
        if (arg1 <= 108) {
            return null;
        } else {
            field282++;
            class223 var4 = (class223) this.field281.method1537(arg0, false);
            return var4 == null ? null : var4.field4004;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V")
    public class22(int arg0) {
        this.field281 = new class227(arg0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JB)V")
    public final void method133(long arg0, byte arg1) {
        this.field281.method1533(arg0, arg1 ^ 0x6142);
        if (arg1 != 6) {
            this.method133(-79L, (byte) 28);
        }
        field273++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILbk;I)[Lub;")
    public static final class43[] method134(int arg0, int arg1, class136 arg2, int arg3) {
        if (arg1 < 103) {
            field271 = null;
        }
        field278++;
        return class84.method528(arg2, arg0, arg3, 0) ? class94.method583(255) : null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public final void method135(int arg0) {
        field270++;
        this.field281.method1529(382);
        int var2 = -79 / ((-arg0 - 53) / 42);
    }
}
