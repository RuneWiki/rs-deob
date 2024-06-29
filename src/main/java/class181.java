import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class181 extends class76 {

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    private int field2561;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field2573 = 0;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lqh;")
    public static class134 field2567 = new class134();

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field2580 = 0;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field2584 = 0;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "Lbc;")
    public static class282 field2578;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2574;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "Z")
    public static boolean field2576;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "[Loc;")
    public static class232[] field2577;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "[S")
    public static short[] field2582;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public static final void method1177(int arg0, int arg1) {
        if (arg1 >= 27) {
            class285.field4395.method62(-23, arg0);
            ++field2565;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)V")
    public final void method168(int arg0, int arg1, int arg2) {
        int var4 = this.field2568 * arg2 >> 12;
        int var5 = this.field2560 * arg2 >> 12;
        ++field2570;
        int var6 = this.field2579 * arg1 >> 12;
        int var7 = this.field2563 * arg1 >> 12;
        int var8 = this.field2571 * arg2 >> 12;
        int var9 = this.field2562 * arg1 >> 12;
        int var10 = this.field2561 * arg2 >> 12;
        int var11 = this.field2566 * arg1 >> 12;
        client.method1925(arg0 ^ arg0, var5, var6, var10, var11, var9, var8, var4, super.field910, var7);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2579 = arg3;
        this.field2566 = arg5;
        this.field2571 = arg4;
        this.field2563 = arg1;
        this.field2568 = arg0;
        this.field2561 = arg6;
        this.field2560 = arg2;
        this.field2562 = arg7;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)V")
    public final void method167(int arg0, int arg1, byte arg2) {
        if (arg2 >= -37) {
            this.field2560 = 91;
        }
        ++field2569;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BZ)V")
    public static final void method1178(byte arg0, boolean arg1) {
        ++field2572;
        class6.method32(arg0 ^ -108);
        if (~class141.field2034 == -31 || class141.field2034 == 25) {
            ++class290.field4504;
            if (~class290.field4504 <= -51 || arg1) {
                class290.field4504 = 0;
                if (!class150.field2185 && class117.field1637 != null) {
                    ++class70.field806;
                    class94.field1259.method592(242, false);
                    try {
                        class117.field1637.method1206(class94.field1259.field3030, class94.field1259.field3021, (byte) -43, 0);
                        class94.field1259.field3021 = 0;
                    } catch (IOException var2) {
                        class150.field2185 = true;
                    }
                }
                class6.method32(arg0 ^ -118);
                if (arg0 != -84) {
                    field2582 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I")
    public static final int method1179(byte arg0) {
        if (arg0 <= 99) {
            field2567 = null;
        }
        ++field2581;
        return class26.field310;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
    public final void method166(int arg0, int arg1, int arg2) {
        int var4 = 60 % ((-14 - arg1) / 55);
        ++field2564;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1180(int arg0) {
        field2578 = null;
        field2577 = null;
        field2574 = null;
        if (arg0 == -1382315316) {
            field2567 = null;
            field2582 = null;
        }
    }
}
