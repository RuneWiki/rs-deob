import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class241 extends class312 {

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public int field3407 = -1;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public int field3409 = -1;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "[I")
    public static int[] field3412 = new int[50];

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(ILea;)Lms;")
    public final class450 method696(int arg0, class58 arg1) {
        ++field3411;
        class309 var3 = arg1.method210();
        var3.method1866(super.field4235, super.field4238, super.field4231);
        class450 var4 = class61.method494(-116, 3);
        if (this.field3407 != -1) {
            class116 var5 = class367.method2308(false, this.field3407).method74(1024, (byte) -33, this.field3406, 0, (class83) null, arg1, (class339) null, 0, -1);
            if (var5 != null) {
                var5.method896(var3, var4.field6451[2], 0);
            }
        }
        if (this.field3409 != -1) {
            class116 var6 = class367.method2308(false, this.field3409).method74(1024, (byte) 86, this.field3410, 0, (class83) null, arg1, (class339) null, 0, -1);
            if (var6 != null) {
                var6.method896(var3, var4.field6451[1], 0);
            }
        }
        class116 var7 = class367.method2308(false, this.field3404).method74(1024, (byte) 87, this.field3408, arg0, (class83) null, arg1, (class339) null, 0, -1);
        if (var7 != null) {
            var7.method896(var3, var4.field6451[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1565(int arg0, int arg1, int arg2, Class arg3) {
        class63 var4 = class341.field4617[arg0][arg1][arg2];
        if (var4 != null) {
            for (class48 var5 = var4.field853; var5 != null; var5 = var5.field608) {
                class5 var6 = var5.field617;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field52 == arg1 && var6.field55 == arg2) {
                    class319.method1948(var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lea;I)V")
    public final void method707(class58 arg0, int arg1) {
        if (arg1 <= -99) {
            ++field3403;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZILea;I)Z")
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        ++field3405;
        class309 var5 = arg2.method210();
        if (!arg0) {
            this.field3404 = -78;
        }
        var5.method1866(super.field4235, super.field4238, super.field4231);
        class116 var6 = class367.method2308(false, this.field3404).method74(65536, (byte) 98, this.field3408, 0, (class83) null, arg2, (class339) null, 0, -1);
        if (var6 != null && var6.method898(arg3, arg1, var5, true)) {
            return true;
        } else {
            if (~this.field3409 != 0) {
                class116 var7 = class367.method2308(false, this.field3409).method74(65536, (byte) 118, this.field3410, 0, (class83) null, arg2, (class339) null, 0, -1);
                if (var7 != null && var7.method898(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            if (~this.field3407 != 0) {
                class116 var8 = class367.method2308(!arg0, this.field3407).method74(65536, (byte) -48, this.field3406, 0, (class83) null, arg2, (class339) null, 0, -1);
                if (var8 != null && var8.method898(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static void method1566(boolean arg0) {
        if (!arg0) {
            field3412 = null;
        }
        field3412 = null;
    }
}
