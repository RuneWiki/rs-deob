import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class198 extends class102 {

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public int field3414 = 0;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "Z")
    public static boolean field3421 = true;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field3422 = 0;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "Ljava/awt/Font;")
    public static Font field3423;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lga;IIIIII)V")
    public static final void method1290(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        field3416++;
        if (arg4 <= 10) {
            method1294((byte) 55);
        }
        boolean var9 = false;
        boolean var10 = true;
        if (arg1 == 0) {
            var7 = class225.method1434(arg3, arg6, arg5);
        } else if (arg1 == 1) {
            var7 = class31.method177(arg3, arg6, arg5);
        } else if (arg1 == 2) {
            var7 = class12.method53(arg3, arg6, arg5);
        } else if (arg1 == 3) {
            var7 = class86.method612(arg3, arg6, arg5);
        }
        int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var12 = false;
        int var13 = ((int) var7 & 0x3E7935) >> 20;
        class231 var14 = class52.method359(107, var11);
        if (var14.method1512((byte) -6)) {
            class176.method1187(arg5, var14, arg3, (byte) 18, arg6);
        }
        int var15 = (int) var7 >> 14 & 0x1F;
        if (var7 == 0L) {
            return;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                class109.method742(arg3, arg6, arg5);
                return;
            }
            if (arg1 != 2) {
                if (arg1 == 3) {
                    class24.method107(arg3, arg6, arg5);
                    if (var14.field4055 == 1) {
                        arg0.method1113(arg6, -262145, arg5);
                        return;
                    }
                }
                return;
            }
            class216.method1394(arg3, arg6, arg5);
            if (var14.field4055 != 0 && (var14.field4021 + arg6) < 104 && var14.field4021 + arg5 < 104 && var14.field4020 + arg6 < 104 && var14.field4020 + arg5 < 104) {
                arg0.method1120(var14.field4020, arg6, var14.field4021, var13, arg5, var14.field4063, (byte) 82);
                return;
            }
            return;
        }
        class82.method568(arg3, arg6, arg5);
        if (var14.field4055 != 0) {
            arg0.method1124(arg6, var15, arg5, true, var14.field4063, var13);
            return;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILlh;I)V")
    private final void method1291(int arg0, class249 arg1, int arg2) {
        field3418++;
        if (~arg2 == arg0) {
            this.field3414 = arg1.method1674(1355769544);
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    public static final void method1292(int arg0) {
        if (arg0 == -13893) {
            field3417++;
            class91.field1754 = new class125();
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public static void method1293(byte arg0) {
        if (arg0 == 23) {
            field3423 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)Lqb;")
    public static final class11 method1294(byte arg0) {
        field3424++;
        try {
            return arg0 < 56 ? null : (class11) Class.forName("qh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)V")
    public static final void method1295(byte arg0) {
        field3415++;
        if (arg0 <= -56) {
            field3423 = null;
            class143.field2609 = null;
            class86.field1691 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLlh;)V")
    public final void method1296(byte arg0, class249 arg1) {
        while (true) {
            int var3 = arg1.method1677(-6677);
            if (var3 == 0) {
                field3420++;
                int var4 = -126 % ((arg0 + 63) / 59);
                return;
            }
            this.method1291(-3, arg1, var3);
        }
    }
}
