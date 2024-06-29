import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class571 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "[Lsu;")
    private class219[] field8089;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    private int field8094;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lke;")
    public static class622 field8095 = new class622(96, 6);

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "J")
    private long field8088;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Lsu;")
    private class219 field8092;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLrv;)Lgea;")
    public static final class82 method3315(byte arg0, class120 arg1) {
        field8097++;
        if (arg0 != -110) {
            method3318(false);
        }
        class269 var2 = class302.method2002(arg0 ^ 0x3832, arg1);
        int var3 = arg1.method898((byte) -99);
        int var4 = arg1.method898((byte) -116);
        int var5 = arg1.method898((byte) -121);
        int var6 = arg1.method898((byte) -128);
        int var7 = arg1.method898((byte) -79);
        int var8 = arg1.method898((byte) -86);
        return new class82(var2.field3774, var2.field3784, var2.field3777, var2.field3783, var2.field3769, var2.field3773, var2.field3781, var2.field3775, var2.field3776, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(JI)Lsu;")
    public final class219 method3316(long arg0, int arg1) {
        this.field8088 = arg0;
        field8090++;
        if (arg1 != 7958) {
            this.field8088 = 66L;
        }
        class219 var4 = this.field8089[(int) ((long) (this.field8094 - 1) & arg0)];
        for (this.field8092 = var4.field3126; this.field8092 != var4; this.field8092 = this.field8092.field3126) {
            if (this.field8092.field3123 == arg0) {
                class219 var5 = this.field8092;
                this.field8092 = this.field8092.field3126;
                return var5;
            }
        }
        this.field8092 = null;
        return null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILsu;J)V")
    public final void method3317(int arg0, class219 arg1, long arg2) {
        field8091++;
        if (arg1.field3125 != null) {
            arg1.method1512(false);
        }
        class219 var5 = this.field8089[(int) ((long) (this.field8094 - 1) & arg2)];
        arg1.field3125 = var5.field3125;
        arg1.field3126 = var5;
        arg1.field3125.field3126 = arg1;
        arg1.field3126.field3125 = arg1;
        if (arg0 != 1) {
            this.field8088 = 78L;
        }
        arg1.field3123 = arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static void method3318(boolean arg0) {
        if (!arg0) {
            field8095 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(I)V")
    public class571(int arg0) {
        this.field8089 = new class219[arg0];
        this.field8094 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class219 var3 = this.field8089[var2] = new class219();
            var3.field3125 = var3;
            var3.field3126 = var3;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Lsu;")
    public final class219 method3319(int arg0) {
        field8093++;
        if (this.field8092 == null) {
            return null;
        }
        class219 var2 = this.field8089[(int) ((long) (this.field8094 - 1) & this.field8088)];
        while (this.field8092 != var2) {
            if (this.field8092.field3123 == this.field8088) {
                class219 var3 = this.field8092;
                this.field8092 = this.field8092.field3126;
                return var3;
            }
            this.field8092 = this.field8092.field3126;
        }
        this.field8092 = null;
        return arg0 == -1 ? null : null;
    }
}
