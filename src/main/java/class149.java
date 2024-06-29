import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class149 {

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "Ltq;")
    private class536 field1897 = new class536(256);

    @OriginalMember(owner = "client!pja", name = "g", descriptor = "Lck;")
    private class733 field1901;

    @OriginalMember(owner = "client!pja", name = "j", descriptor = "Ld;")
    private class284 field1904;

    @OriginalMember(owner = "client!pja", name = "f", descriptor = "[F")
    public static float[] field1900 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "Lrda;")
    public static class467 field1895 = new class467(8);

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!pja", name = "d", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!pja", name = "e", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!pja", name = "h", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!pja", name = "i", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(BI)Lgha;", line = 5)
    public final class520 method848(byte arg0, int arg1) {
        field1902++;
        int var3 = 91 % ((arg0 - 37) / 63);
        Object var4 = this.field1897.method2931((long) arg1, (byte) -96);
        if (var4 != null) {
            return (class520) var4;
        } else if (this.field1904.method1733(-1852, arg1)) {
            class191 var5 = this.field1904.method1732((byte) 116, arg1);
            int var6 = var5.field2673 ? 64 : this.field1901.field9800;
            class520 var8;
            if (var5.field2668 && this.field1901.method899()) {
                float[] var7 = this.field1904.method1735(0.7F, arg1, var6, var6, false, 61);
                var8 = new class520(this.field1901, 3553, 34842, var6, var6, var5.field2671 != 0, var7, 6408);
            } else {
                int[] var9;
                if (var5.field2682 != 2 && class176.method1134(14031, var5.field2678)) {
                    var9 = this.field1904.method1737(arg1, var6, 0.7F, true, var6, (byte) 45);
                } else {
                    var9 = this.field1904.method1734(-25886, false, var6, var6, arg1, 0.7F);
                }
                var8 = new class520(this.field1901, 3553, 6408, var6, var6, var5.field2671 != 0, var9, 0, 0, false);
            }
            var8.method2873(-26403, var5.field2660, var5.field2663);
            this.field1897.method2918((long) arg1, var8, 100);
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(Z)V", line = 51)
    public final void method849(boolean arg0) {
        if (arg0) {
            field1900 = null;
        }
        this.field1897.method2928(true, 5);
        field1898++;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V", line = 63)
    public final void method850(int arg0) {
        this.field1897.method2919(arg0);
        field1899++;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)V", line = 80)
    public static final void method851(int arg0, int arg1, int arg2) {
        field1903++;
        class614 var3 = class497.method2759(7, 5977, (long) arg1);
        var3.method3277(639);
        var3.field7742 = arg2;
        if (arg0 != 167) {
            field1900 = null;
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(B)V", line = 99)
    public static void method852(byte arg0) {
        field1895 = null;
        int var1 = -21 % ((arg0 - 28) / 45);
        field1900 = null;
    }

    @OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(Lck;Ld;)V", line = 112)
    public class149(class733 arg0, class284 arg1) {
        this.field1901 = arg0;
        this.field1904 = arg1;
    }
}
