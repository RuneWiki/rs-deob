import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class440 {

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lnk;")
    public class505 field6456 = new class505();

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "[F")
    public static float[] field6449 = new float[4];

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Z")
    public static boolean field6454 = false;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field6455 = 12;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lnk;")
    private class505 field6457;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Lnk;")
    public final class505 method2706(boolean arg0) {
        field6450++;
        class505 var2 = this.field6457;
        if (this.field6456 == var2) {
            this.field6457 = null;
            return null;
        } else {
            this.field6457 = var2.field7378;
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Lnk;")
    public final class505 method2707(boolean arg0) {
        if (arg0) {
            this.method2708(-81);
        }
        field6453++;
        class505 var2 = this.field6456.field7378;
        if (this.field6456 == var2) {
            this.field6457 = null;
            return null;
        } else {
            this.field6457 = var2.field7378;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public final void method2708(int arg0) {
        while (true) {
            class505 var2 = this.field6456.field7378;
            if (this.field6456 == var2) {
                field6451++;
                this.field6457 = null;
                if (arg0 != 0) {
                    this.method2708(89);
                    return;
                }
                return;
            }
            var2.method3008(arg0 + 116);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(Z)V")
    public static void method2709(boolean arg0) {
        field6449 = null;
        if (arg0) {
            method2709(true);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
    public final int method2710(int arg0) {
        field6452++;
        int var2 = arg0;
        for (class505 var3 = this.field6456.field7378; var3 != this.field6456; var3 = var3.field7378) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLnk;)V")
    public final void method2711(boolean arg0, class505 arg1) {
        field6448++;
        if (arg1.field7383 != null) {
            arg1.method3008(127);
        }
        arg1.field7383 = this.field6456.field7383;
        arg1.field7378 = this.field6456;
        arg1.field7383.field7378 = arg1;
        arg1.field7378.field7383 = arg1;
        if (!arg0) {
            this.method2710(-79);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
    public class440() {
        this.field6456.field7378 = this.field6456;
        this.field6456.field7383 = this.field6456;
    }
}
