import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class40 {

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field607 = 0;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "F")
    public static float field605;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method293(int arg0, int arg1, int arg2) {
        field608++;
        if (arg1 != 2) {
            method296((byte) -93, null);
        }
        return class394.method2310((byte) -125, arg2, arg0) || class458.method2607(false, arg2, arg0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBII)I", line = 19)
    public static final int method294(int arg0, byte arg1, int arg2, int arg3) {
        field604++;
        if (arg1 != -58) {
            return 32;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIBI)V", line = 46)
    public static final void method295(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field610++;
        if (class39.field593 == 1) {
            class217.field2941[class506.field7033 / 100].method3109(class485.field6758 - 8, class255.field3373 + -8);
        }
        if (class39.field593 == 2) {
            class217.field2941[(class506.field7033 / 100) + 4].method3109(class485.field6758 - 8, class255.field3373 + -8);
        }
        if (arg3 <= 81) {
            field606 = -12;
        }
        class505.method2881(1);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLhq;)V", line = 72)
    public static final void method296(byte arg0, class108 arg1) {
        arg1.method750(true);
        field609++;
        int var2 = class391.field5305;
        class515 var3 = class385.field5232 = class499.field6901[var2] = new class515();
        var3.field6170 = var2;
        int var4 = arg1.method756(7, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFE037) >> 14;
        var3.field6261[0] = var6 - class401.field5382;
        int var7 = var4 & 0x3FFF;
        var3.field584 = (var3.field6261[0] << 7) + (var3.method2590(0) << 6);
        var3.field6266[0] = var7 - class421.field5762;
        var3.field574 = (var3.field6266[0] << 7) + (var3.method2590(0) << 6);
        class411.field5656 = var3.field573 = var5;
        if (arg0 < 68) {
            return;
        }
        if (class406.field5589[var2] != null) {
            var3.method3029(-79, class406.field5589[var2]);
        }
        class461.field6368 = 0;
        class461.field6370[class461.field6368++] = var2;
        class66.field1020[var2] = 0;
        class193.field2709 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method756(7, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF2C) >> 8;
                int var12 = var9 & 0xFF;
                class212 var13 = class449.field6120[var8] = new class212();
                var13.field2881 = -1;
                var13.field2885 = (var10 << 28) + (var11 << 14) + var12;
                var13.field2889 = false;
                var13.field2880 = 0;
                class385.field5247[class193.field2709++] = var8;
                class66.field1020[var8] = 0;
            }
        }
        arg1.method757((byte) 120);
    }
}
