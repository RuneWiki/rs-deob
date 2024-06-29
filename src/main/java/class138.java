import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class138 {

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[Lmo;")
    private class447[] field1969;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    private int field1963;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[S")
    public static short[] field1962 = new short[256];

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field1971 = 13156520;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "J")
    private long field1966;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lmo;")
    private class447 field1965;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method947(boolean arg0) {
        field1962 = null;
        if (arg0) {
            method949(55, -71, -17, 87, -122, -58, -80);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IJ)Lmo;")
    public final class447 method948(int arg0, long arg1) {
        this.field1966 = arg1;
        field1964++;
        class447 var4 = this.field1969[(int) (arg1 & (long) (this.field1963 - arg0))];
        for (this.field1965 = var4.field6442; this.field1965 != var4; this.field1965 = this.field1965.field6442) {
            if (this.field1965.field6446 == arg1) {
                class447 var5 = this.field1965;
                this.field1965 = this.field1965.field6442;
                return var5;
            }
        }
        this.field1965 = null;
        return null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
    public static final void method949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class33 var7 = new class33();
        var7.field507 = arg1 >> 7;
        var7.field504 = arg2 >> 7;
        var7.field519 = arg3 >> 7;
        var7.field505 = arg4 >> 7;
        var7.field521 = arg0;
        var7.field522 = arg1;
        var7.field512 = arg2;
        var7.field510 = arg3;
        var7.field524 = arg4;
        var7.field525 = arg5;
        var7.field514 = arg6;
        class99.field1515[class389.field5668++] = var7;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(JLmo;I)V")
    public final void method950(long arg0, class447 arg1, int arg2) {
        int var5 = -21 / ((-arg2 - 12) / 59);
        field1967++;
        if (arg1.field6443 != null) {
            arg1.method2788((byte) -114);
        }
        class447 var6 = this.field1969[(int) (arg0 & (long) (this.field1963 - 1))];
        arg1.field6442 = var6;
        arg1.field6443 = var6.field6443;
        arg1.field6443.field6442 = arg1;
        arg1.field6442.field6443 = arg1;
        arg1.field6446 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILqj;)Ljd;")
    public static final class125 method951(int arg0, int arg1, int arg2, class296 arg3) {
        field1968++;
        class371 var4 = new class371(arg3.method1920(arg1, false, arg0));
        class125 var5 = new class125(arg1, var4.method2422(-1), var4.method2422(-1), var4.method2413((byte) -30), var4.method2413((byte) -30), var4.method2429(0) == 1, var4.method2429(0));
        int var6 = var4.method2429(arg2 + 10164);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field1760.method1301(50, new class129(var4.method2429(0), var4.method2403((byte) 101), var4.method2403((byte) 73), var4.method2403((byte) 78), var4.method2403((byte) 94), var4.method2403((byte) 64), var4.method2403((byte) 101), var4.method2403((byte) 92), var4.method2403((byte) 83)));
        }
        var5.method837(true);
        return arg2 == -10164 ? var5 : null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
    public class138(int arg0) {
        this.field1969 = new class447[arg0];
        this.field1963 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class447 var3 = this.field1969[var2] = new class447();
            var3.field6442 = var3;
            var3.field6443 = var3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Lmo;")
    public final class447 method952(byte arg0) {
        field1970++;
        if (arg0 != 30) {
            this.field1969 = null;
        }
        if (this.field1965 == null) {
            return null;
        }
        class447 var2 = this.field1969[(int) (this.field1966 & (long) (this.field1963 - 1))];
        while (this.field1965 != var2) {
            if (this.field1965.field6446 == this.field1966) {
                class447 var3 = this.field1965;
                this.field1965 = this.field1965.field6442;
                return var3;
            }
            this.field1965 = this.field1965.field6442;
        }
        this.field1965 = null;
        return null;
    }
}
