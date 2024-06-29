import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public abstract class class674 extends class66 {

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
    public int field9502;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "F")
    public float field9504;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public int field9498;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    private int field9509;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    private int field9496;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    public int field9506;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "[Lww;")
    public static class681[] field9494 = new class681[50];

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
    public static int field9500 = 0;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "[I")
    public static int[] field9495 = new int[5];

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "Lrl;")
    public static class672 field9508 = new class672(51, -1);

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I", line = 7)
    public final int method3851(byte arg0) {
        field9501++;
        int var2 = -82 / ((-arg0 - 57) / 54);
        return this.field9502;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)Luf;", line = 18)
    public static final class413 method3852(int arg0, int arg1, int arg2) {
        field9493++;
        class413 var3 = (class413) class199.field3246.method1558((long) arg0 << 32 | (long) arg1, (byte) -93);
        if (var3 == null) {
            var3 = new class413(arg0, arg1);
            class199.field3246.method1564(var3.field844, var3, (byte) 98);
        }
        if (arg2 < 121) {
            method3853(-48, 0, null, (byte) 42, 116);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILpba;BI)V", line = 41)
    public static final void method3853(int arg0, int arg1, class304 arg2, byte arg3, int arg4) {
        field9503++;
        int var5 = arg2.field4264[arg0];
        int var6 = arg2.field4265[0];
        if (var5 < 0 || var5 >= class275.field4426 || var6 < 0 || var6 >= class417.field6374 || arg1 < 0 || class275.field4426 <= arg1 || arg4 < 0 || class417.field6374 <= arg4) {
            return;
        }
        int var7 = class532.method3219(0, -4, arg1, 0, class399.field6176, 0, class10.field172[arg2.field9695], class156.field2677, var5, arg4, true, var6, (byte) 52, arg2.method1841(20744), 0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg2.method2114(class399.field6176[var8], arg3, -8242, class156.field2677[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I", line = 75)
    public final int method3854(int arg0) {
        field9497++;
        if (arg0 != -1) {
            this.field9506 = -9;
        }
        return this.field9496;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V", line = 93)
    public static void method3855(byte arg0) {
        field9508 = null;
        field9494 = null;
        if (arg0 != -11) {
            method3858(-21, -14);
        }
        field9495 = null;
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(B)F", line = 105)
    public final float method3856(byte arg0) {
        field9499++;
        if (arg0 > -30) {
            field9500 = 84;
        }
        return this.field9504;
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)I", line = 117)
    public final int method3857(byte arg0) {
        if (arg0 != -35) {
            this.field9509 = -37;
        }
        field9505++;
        return this.field9498;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V", line = 128)
    public static final void method3858(int arg0, int arg1) {
        class516.field7497 = arg0;
        class204.field3329 = arg1;
        field9491++;
        class471.field6976 = 3;
        class442.field6729 = 100;
    }

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "(B)I", line = 146)
    public final int method3859(byte arg0) {
        if (arg0 == 117) {
            field9492++;
            return this.field9506;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "(B)I", line = 158)
    public final int method3860(byte arg0) {
        field9507++;
        if (arg0 > -117) {
            field9495 = null;
        }
        return this.field9509;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIIF)V", line = 176)
    public class674(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field9502 = arg1;
        this.field9504 = arg5;
        this.field9498 = arg0;
        this.field9509 = arg3;
        this.field9496 = arg4;
        this.field9506 = arg2;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V")
    public abstract void method187(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IF)V")
    public abstract void method188(int arg0, float arg1);
}
