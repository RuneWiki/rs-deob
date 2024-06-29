import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class257 {

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Lqk;")
    private class12 field3496 = new class12();

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Lfi;")
    public static class331 field3494 = new class331(64);

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field3501 = -1;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field3507 = 2;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Lqk;")
    private class12 field3506;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "Len;")
    public static class174 field3504;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "[I")
    public static int[] field3500;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Lqk;")
    public final class12 method1604(byte arg0) {
        field3508++;
        int var2 = -4 / ((arg0 + 7) / 58);
        class12 var3 = this.field3496.field134;
        if (this.field3496 == var3) {
            this.field3506 = null;
            return null;
        } else {
            this.field3506 = var3.field134;
            return var3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lqk;I)V")
    public final void method1605(class12 arg0, int arg1) {
        field3497++;
        if (arg0.field128 != null) {
            arg0.method96(3);
        }
        if (arg1 == -14638) {
            arg0.field134 = this.field3496;
            arg0.field128 = this.field3496.field128;
            arg0.field128.field134 = arg0;
            arg0.field134.field128 = arg0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Lqk;")
    public final class12 method1606(int arg0) {
        field3495++;
        class12 var2 = this.field3496.field134;
        if (this.field3496 == var2) {
            return null;
        } else {
            int var3 = 61 / ((arg0 + 77) / 36);
            var2.method96(3);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)Lqk;")
    public final class12 method1607(int arg0) {
        field3505++;
        if (arg0 != 16239) {
            field3504 = null;
        }
        class12 var2 = this.field3496.field128;
        if (this.field3496 == var2) {
            this.field3506 = null;
            return null;
        } else {
            this.field3506 = var2.field128;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public static void method1608(int arg0) {
        if (arg0 != 2) {
            method1608(12);
        }
        field3494 = null;
        field3504 = null;
        field3500 = null;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
    public final int method1609(int arg0) {
        field3498++;
        int var2 = 0;
        for (class12 var3 = this.field3496.field134; var3 != this.field3496; var3 = var3.field134) {
            var2++;
        }
        if (arg0 != 10196) {
            field3500 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public final void method1610(boolean arg0) {
        while (true) {
            class12 var2 = this.field3496.field134;
            if (this.field3496 == var2) {
                if (!arg0) {
                    return;
                }
                field3499++;
                this.field3506 = null;
                return;
            }
            var2.method96(3);
        }
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)Z")
    public final boolean method1611(int arg0) {
        if (arg0 > -88) {
            this.method1610(false);
        }
        field3493++;
        return this.field3496.field134 == this.field3496;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(I)Lqk;")
    public final class12 method1612(int arg0) {
        field3502++;
        class12 var2 = this.field3506;
        if (arg0 != -1) {
            field3504 = null;
        }
        if (this.field3496 == var2) {
            this.field3506 = null;
            return null;
        } else {
            this.field3506 = var2.field134;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)Z")
    public static final boolean method1613(int arg0) {
        if (arg0 >= -118) {
            return false;
        } else {
            field3503++;
            return class341.field5018 == 0 ? class219.field3012 : true;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
    public class257() {
        this.field3496.field134 = this.field3496;
        this.field3496.field128 = this.field3496;
    }
}
