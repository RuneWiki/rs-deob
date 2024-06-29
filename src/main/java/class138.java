import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class138 {

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "J")
    public long field2461 = 0L;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lbd;")
    public static class162 field2460 = class17.method142(0, "null");

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field2473 = 0;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lbd;")
    public static class162 field2457 = class17.method142(0, "cross");

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lrk;")
    public class255 field2459;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lrk;")
    public class255 field2468;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "[I")
    public static int[] field2467;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lob;IZ)V", line = 20)
    public static final void method1077(class78 arg0, int arg1, boolean arg2) {
        field2466++;
        int var3 = arg0.field1220 == 0 ? arg0.field1367 : arg0.field1220;
        int var4 = arg0.field1283 == 0 ? arg0.field1340 : arg0.field1283;
        class115.method908(var4, arg2, var3, class95.field1739[arg0.field1235 >> 16], false, arg0.field1235);
        if (arg1 < 98) {
            method1079((byte) 87, (Component) null);
        }
        if (arg0.field1363 != null) {
            class115.method908(var4, arg2, var3, arg0.field1363, false, arg0.field1235);
        }
        class172 var5 = (class172) class137.field2440.method1672((long) arg0.field1235, 19760);
        if (var5 != null) {
            class273.method1854(var5.field2985, -1, arg2, var4, var3);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 57)
    public static void method1078(byte arg0) {
        field2467 = null;
        field2460 = null;
        field2457 = null;
        if (arg0 >= -9) {
            field2460 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 76)
    public static final void method1079(byte arg0, Component arg1) {
        arg1.removeKeyListener(class237.field3946);
        field2463++;
        arg1.removeFocusListener(class237.field3946);
        if (arg0 != -37) {
            field2457 = (class162) null;
        }
        class86.field1535 = -1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)I", line = 94)
    public static final int method1080(boolean arg0, int arg1) {
        field2455++;
        return arg0 ? 2 : arg1 >>> 8;
    }
}
