import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class165 {

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Ljl;")
    public static class332 field2617 = new class332(64);

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
    public static int[] field2622 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "[Lfc;")
    public static class288[] field2621 = new class288[32768];

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 6)
    public static final String method1282(byte arg0, long arg1) {
        field2619++;
        class38.field567.setTime(new Date(arg1));
        if (arg0 >= -88) {
            method1285(-79, -87, false, -118);
        }
        int var3 = class38.field567.get(7);
        int var4 = class38.field567.get(5);
        int var5 = class38.field567.get(2);
        int var6 = class38.field567.get(1);
        int var7 = class38.field567.get(11);
        int var8 = class38.field567.get(12);
        int var9 = class38.field567.get(13);
        return class251.field4250[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class195.field3107[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 37)
    public static void method1283(int arg0) {
        field2622 = null;
        if (arg0 != 0) {
            field2617 = (class332) null;
        }
        field2617 = null;
        field2621 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljh;III)V", line = 56)
    public static final void method1284(class258 arg0, int arg1, int arg2, int arg3) {
        field2616++;
        if (arg0.field3547 == arg3 && arg3 != -1) {
            class43 var4 = class198.method1524(arg3, 116);
            int var5 = var4.field668;
            if (var5 == 1) {
                arg0.field3558 = 0;
                arg0.field3559 = arg1;
                arg0.field3517 = 0;
                arg0.field3576 = 1;
                arg0.field3531 = 0;
                class334.method2338(class6.field55 == arg0, arg0.field3577, arg0.field3511, arg0.field3517, (byte) -13, var4);
            }
            if (var5 == 2) {
                arg0.field3531 = 0;
            }
        } else if (arg3 == -1 || arg0.field3547 == -1 || class198.method1524(arg3, -79).field660 >= class198.method1524(arg0.field3547, 94).field660) {
            arg0.field3558 = 0;
            arg0.field3547 = arg3;
            arg0.field3491 = arg0.field3503;
            arg0.field3531 = 0;
            arg0.field3559 = arg1;
            arg0.field3517 = 0;
            arg0.field3576 = 1;
            if (arg0.field3547 != -1) {
                class334.method2338(class6.field55 == arg0, arg0.field3577, arg0.field3511, arg0.field3517, (byte) -13, class198.method1524(arg0.field3547, 105));
            }
        }
        if (arg2 != 1) {
            field2617 = (class332) null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZI)V", line = 107)
    public static final void method1285(int arg0, int arg1, boolean arg2, int arg3) {
        field2623++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class232.field3855 = arg2;
        class227.field3788 = arg1;
        if (arg3 <= 56) {
            field2617 = (class332) null;
        }
        class89.field1503 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V", line = 129)
    public static final void method1286(int arg0, boolean arg1) {
        class129.field2187.method2334(4, arg0);
        if (arg1) {
            class180.field2878.method2334(4, arg0);
            field2620++;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 141)
    public static final void method1287(int arg0) {
        class311.field4956.method2327(1);
        field2618++;
        class186.field2997.method2327(1);
        if (arg0 != 12) {
            field2617 = (class332) null;
        }
    }
}
