import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class184 implements class509 {

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "Lom;")
    private class389 field2301;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Leb;")
    private class10 field2303;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public final void method938(int arg0) {
        if (arg0 < 61) {
            field2299 = -71;
        }
        field2298++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Z")
    public final boolean method941(byte arg0) {
        if (arg0 == -79) {
            field2302++;
            return this.field2303.method25(16495);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)[Liga;")
    public static final class91[] method1156(byte arg0) {
        if (arg0 > -45) {
            field2299 = 60;
        }
        field2304++;
        return new class91[] { class413.field5781, class358.field5151, class349.field5071, class247.field3675, class138.field1764, class76.field843, class221.field3022, class554.field7678, class164.field2095, class419.field5830, class60.field692, class31.field301, class722.field9960, class22.field201, class212.field2926 };
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)V")
    public final void method939(int arg0, boolean arg1) {
        field2297++;
        if (arg0 != 7998) {
            return;
        }
        class237 var3 = this.field2303.method24(this.field2301.field5542, (byte) -1);
        if (var3 == null) {
            return;
        }
        int var4 = this.field2301.field5546.method1744(class456.field6378, this.field2301.field5545, (byte) 72) + this.field2301.field5552;
        int var5 = this.field2301.field5548.method59(0, class565.field7983, this.field2301.field5551) + this.field2301.field5547;
        if (this.field2301.field5540) {
            class111.field1332.method171(var4, var5, this.field2301.field5545, this.field2301.field5551, this.field2301.field5543, 0);
        }
        int var6 = var5 + this.method1157(1, var5, var4, class386.field5515, 5, var3.field3565) * 12;
        int var9 = var6 + 8;
        if (this.field2301.field5540) {
            class111.field1332.method139(var4, var9, this.field2301.field5545 + var4 - 1, var9, this.field2301.field5543, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1157(1, var6, var4, class386.field5515, 5, var3.field3567) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1157(arg0 ^ 0x1F3F, var10, var4, class386.field5515, 5, var3.field3563) * 12;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILda;ILjava/lang/String;)I")
    private final int method1157(int arg0, int arg1, int arg2, class442 arg3, int arg4, String arg5) {
        field2300++;
        return arg0 == 1 ? arg3.method2643(arg1 + arg4, 0, 0, arg2 + arg4, 0, this.field2301.field5545 - (arg4 * 2), -(arg4 * 2) + this.field2301.field5551, null, arg5, this.field2301.field5549, (byte) -33, null, this.field2301.field5541, 0, 0, null) : 22;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Leb;Lom;)V")
    public class184(class10 arg0, class389 arg1) {
        this.field2301 = arg1;
        this.field2303 = arg0;
    }
}
