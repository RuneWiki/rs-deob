import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class448 {

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "J")
    public long field6211;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/lang/String;")
    public String field6207;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public int field6214;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Ljava/lang/String;")
    public String field6206;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field6205;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lvj;")
    public static class373 field6209 = new class373(27, 14);

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field6213 = 0;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZZILdn;)V")
    public static final void method2621(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, class438 arg5) {
        class442.field6104 = 10000;
        class527.field7382 = arg5;
        class175.field2117 = arg4;
        class121.field1518 = arg2;
        class503.field6979 = arg1;
        class79.field923 = arg0;
        if (arg3) {
            field6210++;
            class578.field8436 = 1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZLn;Ljava/awt/Canvas;)Lqa;")
    public static final class206 method2622(int arg0, boolean arg1, class17 arg2, Canvas arg3) {
        field6208++;
        if (arg0 != 1) {
            method2621(-63, 97, false, false, -74, null);
        }
        return arg1 ? new class460(arg3, arg2) : new class50(arg3, arg2);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z")
    public static final boolean method2623(int arg0, int arg1, int arg2) {
        if (arg2 != 27) {
            method2622(90, false, null, null);
        }
        field6212++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method2624(byte arg0) {
        field6209 = null;
        if (arg0 > -9) {
            method2623(122, 59, -126);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class448(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field6211 = arg4;
        this.field6207 = arg3;
        this.field6214 = arg0;
        this.field6206 = arg1;
        this.field6205 = arg2;
    }
}
