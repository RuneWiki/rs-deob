import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 {

    @OriginalMember(owner = "client!sja", name = "g", descriptor = "Lgj;")
    private class659 field131 = new class659();

    @OriginalMember(owner = "client!sja", name = "j", descriptor = "Lnc;")
    private class26 field134 = new class26();

    @OriginalMember(owner = "client!sja", name = "i", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!sja", name = "k", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client!sja", name = "h", descriptor = "Ltca;")
    private class184 field132;

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "Laka;")
    public static class86 field126 = new class86("WIP", 2);

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!sja", name = "e", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!sja", name = "f", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V")
    public static void method75(int arg0) {
        field126 = null;
        int var1 = 25 % (-arg0 / 37);
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(IJ)Lgj;")
    public final class659 method76(int arg0, long arg1) {
        if (arg0 < 12) {
            return null;
        }
        field129++;
        class659 var4 = (class659) this.field132.method1248(86, arg1);
        if (var4 != null) {
            this.field134.method150(0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(I[I[I)V")
    public static final void method77(int arg0, int[] arg1, int[] arg2) {
        field130++;
        if (arg0 != 26883) {
            return;
        }
        if (arg1 == null || arg2 == null) {
            class356.field5192 = null;
            class582.field7912 = null;
            class764.field10493 = null;
            return;
        }
        class764.field10493 = arg1;
        class582.field7912 = new int[arg1.length];
        class356.field5192 = new byte[arg1.length][][];
        for (int var3 = 0; var3 < class764.field10493.length; var3++) {
            class356.field5192[var3] = new byte[arg2[var3]][];
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(JB)V")
    public final void method78(long arg0, byte arg1) {
        field125++;
        class659 var4 = (class659) this.field132.method1248(120, arg0);
        if (var4 != null) {
            var4.method1102((byte) 81);
            var4.method3659(1);
            this.field135++;
        }
        if (arg1 <= 16) {
            this.method80(false);
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lgj;JZ)V")
    public final void method79(class659 arg0, long arg1, boolean arg2) {
        field127++;
        if (this.field135 == 0) {
            class659 var5 = this.field134.method155(118);
            var5.method1102((byte) 61);
            var5.method3659(1);
            if (this.field131 == var5) {
                class659 var6 = this.field134.method155(108);
                var6.method1102((byte) 56);
                var6.method3659(1);
            }
        } else {
            this.field135--;
        }
        this.field132.method1247(4070, arg1, arg0);
        if (arg2) {
            this.method79(null, -7L, false);
        }
        this.field134.method150(0, arg0);
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Z)V")
    public final void method80(boolean arg0) {
        if (arg0) {
            this.field133 = 96;
        }
        this.field134.method153(56);
        field128++;
        this.field132.method1244(30407);
        this.field131 = new class659();
        this.field135 = this.field133;
    }

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(I)V")
    public class11(int arg0) {
        this.field133 = arg0;
        this.field135 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field132 = new class184(var2);
    }
}
