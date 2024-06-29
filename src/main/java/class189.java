import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class189 {

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "[I")
    public static int[] field2580 = new int[6];

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "Lco;")
    public static class210 field2588 = new class210(260);

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
    public static int field2593 = 0;

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "Z")
    public static boolean field2595 = false;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "B")
    public byte field2574;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "B")
    public byte field2575;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "B")
    public byte field2576;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "B")
    public byte field2578;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "B")
    public byte field2584;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "B")
    public byte field2586;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "B")
    public byte field2589;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "S")
    public short field2587;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Z")
    public boolean field2572;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Z")
    public boolean field2573;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Z")
    public boolean field2577;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Z")
    public boolean field2581;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Z")
    public boolean field2582;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Z")
    public boolean field2583;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "Z")
    public boolean field2590;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "Z")
    public boolean field2591;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "Z")
    public boolean field2592;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
    public static final void method1035(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field2585++;
        if (arg1 != -20089) {
            return;
        }
        class101 var8 = new class101();
        var8.field1225 = arg3;
        var8.field1223 = arg7;
        var8.field1224 = arg0;
        var8.field1220 = class204.field2796 + arg5;
        var8.field1228 = arg4;
        var8.field1222 = arg2;
        var8.field1226 = arg6;
        class192.field2648.method2336(var8, (byte) -56);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method1036(int arg0) {
        field2580 = null;
        if (arg0 > -1) {
            field2593 = -43;
        }
        field2588 = null;
    }
}
