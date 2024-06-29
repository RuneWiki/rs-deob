import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class192 {

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "Lmc;")
    public class220 field3325 = new class220();

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "[I")
    public static int[] field3327 = new int[4];

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "Lmc;")
    private class220 field3332;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lmc;I)V")
    public final void method1456(class220 arg0, int arg1) {
        field3328++;
        if (arg0.field3587 != null) {
            arg0.method1568(arg1 - 82);
        }
        arg0.field3589 = this.field3325;
        if (arg1 != 0) {
            this.method1456(null, -74);
        }
        arg0.field3587 = this.field3325.field3587;
        arg0.field3587.field3589 = arg0;
        arg0.field3589.field3587 = arg0;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)J")
    public static final long method1457(boolean arg0) {
        field3329++;
        if (arg0) {
            field3327 = null;
        }
        return class751.field10473.method41((byte) -112);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public final void method1458(byte arg0) {
        if (arg0 != 66) {
            return;
        }
        while (true) {
            class220 var2 = this.field3325.field3589;
            if (this.field3325 == var2) {
                field3330++;
                this.field3332 = null;
                return;
            }
            var2.method1568(-110);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)I")
    public final int method1459(int arg0) {
        field3331++;
        if (arg0 != 4) {
            method1461((byte) 63);
        }
        int var2 = 0;
        for (class220 var3 = this.field3325.field3589; var3 != this.field3325; var3 = var3.field3589) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)Lmc;")
    public final class220 method1460(byte arg0) {
        if (arg0 <= 48) {
            return null;
        }
        field3326++;
        class220 var2 = this.field3332;
        if (this.field3325 == var2) {
            this.field3332 = null;
            return null;
        } else {
            this.field3332 = var2.field3589;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(B)V")
    public static void method1461(byte arg0) {
        field3327 = null;
        if (arg0 != 104) {
            field3327 = null;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)Lmc;")
    public final class220 method1462(int arg0) {
        field3324++;
        class220 var2 = this.field3325.field3589;
        if (arg0 != 0) {
            this.method1460((byte) 80);
        }
        if (this.field3325 == var2) {
            this.field3332 = null;
            return null;
        } else {
            this.field3332 = var2.field3589;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "()V")
    public class192() {
        this.field3325.field3589 = this.field3325;
        this.field3325.field3587 = this.field3325;
    }
}
