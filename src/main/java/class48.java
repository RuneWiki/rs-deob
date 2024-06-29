import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class48 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field723 = "Opened title screen";

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public static int[] field718;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[[Z")
    public static boolean[][] field721;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIILh;JLh;Lh;)V", line = 9)
    public static final void method408(int arg0, int arg1, int arg2, int arg3, class111 arg4, long arg5, class111 arg6, class111 arg7) {
        class47 var9 = new class47();
        var9.field712 = arg4;
        var9.field716 = arg1 * 128 + 64;
        var9.field713 = arg2 * 128 + 64;
        var9.field706 = arg3;
        var9.field705 = arg5;
        var9.field707 = arg6;
        var9.field708 = arg7;
        int var10 = 0;
        class167 var11 = class302.field4502[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2407; var12++) {
                class180 var13 = var11.field2406[var12];
                if ((var13.field2585 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2591.method371();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field717 = -var10;
        if (class302.field4502[arg0][arg1][arg2] == null) {
            class302.field4502[arg0][arg1][arg2] = new class167(arg0, arg1, arg2);
        }
        class302.field4502[arg0][arg1][arg2].field2402 = var9;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Lpd;", line = 57)
    public static final class290 method409(byte arg0, int arg1) {
        field726++;
        class290 var2 = (class290) class121.field1697.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 59) {
            field719 = -28;
        }
        byte[] var3 = class314.field4665.method2520(30, arg1, (byte) -25);
        class290 var4 = new class290();
        if (var3 != null) {
            var4.method2088(new class190(var3), (byte) -97, arg1);
        }
        class121.field1697.method460(var4, -26089, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)I", line = 81)
    public static final int method410(int arg0, int arg1, int arg2) {
        field724++;
        class206 var3 = (class206) class135.field1968.method1405((long) arg0, false);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= arg2 && var3.field3014.length > arg1) {
            return var3.field3014[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 97)
    public static final void method411(int arg0) {
        field725++;
        client.method343();
        client.method361();
        client.method353();
        client.method358();
        client.method363();
        client.method365();
        if (arg0 != 64) {
            field723 = (String) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lta;I)V", line = 113)
    public static final void method412(class300 arg0, int arg1) {
        field720++;
        class83.method677(-9435, arg1, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 121)
    public static void method413(byte arg0) {
        field718 = null;
        field721 = (boolean[][]) null;
        if (arg0 == 29) {
            field723 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 140)
    public static final void method414(int arg0) {
        class19.field304 = null;
        class352.field5424 = null;
        class126.field1826 = (byte[][][]) null;
        field722++;
        class102.field1454 = (byte[][][]) null;
        if (arg0 != 25482) {
            field718 = (int[]) null;
        }
        class228.field3462 = (int[][][]) null;
        class132.field1933 = (byte[][][]) null;
        class261.field3913 = (byte[][][]) null;
        class300.field4492 = (byte[][][]) null;
        class230.field3476 = null;
        class154.field2201 = null;
        class229.field3469 = null;
        class343.field5299 = null;
    }
}
