import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class442 {

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    private int field6463;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[Lqp;")
    private class396[] field6461;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
    public static boolean field6457 = false;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field6464 = -50;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6459 = "Starting 3d Library";

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field6456 = 0;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "J")
    private long field6468;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lqp;")
    private class396 field6462;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Z")
    public static boolean field6467;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZJ)Lqp;")
    public final class396 method2736(boolean arg0, long arg1) {
        field6458++;
        this.field6468 = arg1;
        class396 var4 = this.field6461[(int) (arg1 & (long) (this.field6463 - 1))];
        for (this.field6462 = var4.field5777; this.field6462 != var4; this.field6462 = this.field6462.field5777) {
            if (this.field6462.field5780 == arg1) {
                class396 var5 = this.field6462;
                this.field6462 = this.field6462.field5777;
                return var5;
            }
        }
        if (!arg0) {
            this.method2737(83);
        }
        this.field6462 = null;
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lqp;")
    public final class396 method2737(int arg0) {
        field6466++;
        if (this.field6462 == null) {
            return null;
        }
        class396 var2 = this.field6461[(int) ((long) (this.field6463 - 1) & this.field6468)];
        while (this.field6462 != var2) {
            if (this.field6462.field5780 == this.field6468) {
                class396 var3 = this.field6462;
                this.field6462 = this.field6462.field5777;
                return var3;
            }
            this.field6462 = this.field6462.field5777;
        }
        if (arg0 == -1) {
            this.field6462 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method2738(boolean arg0) {
        field6459 = null;
        if (!arg0) {
            field6456 = 49;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLqp;J)V")
    public final void method2739(byte arg0, class396 arg1, long arg2) {
        if (arg1.field5779 != null) {
            arg1.method2519(-2107);
        }
        field6460++;
        class396 var5 = this.field6461[(int) ((long) (this.field6463 - 1) & arg2)];
        arg1.field5779 = var5.field5779;
        arg1.field5777 = var5;
        arg1.field5779.field5777 = arg1;
        arg1.field5780 = arg2;
        arg1.field5777.field5779 = arg1;
        if (arg0 != -126) {
            this.field6468 = -99L;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZIII)I")
    public static final int method2740(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6465++;
        int var5 = arg0 & 0xF;
        if (!arg1) {
            field6467 = true;
        }
        int var6 = var5 < 8 ? arg4 : arg3;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg2) : arg3;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
    public class442(int arg0) {
        this.field6463 = arg0;
        this.field6461 = new class396[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class396 var3 = this.field6461[var2] = new class396();
            var3.field5777 = var3;
            var3.field5779 = var3;
        }
    }
}
