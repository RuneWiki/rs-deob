import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class453 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field6503 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Lij;")
    public static class316 field6506;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2823(int arg0) {
        class326.field4434 = true;
        field6504++;
        if (arg0 != 0) {
            method2824(26);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 20)
    public static void method2824(int arg0) {
        if (arg0 < 97) {
            method2826(-73, 119, 86, -76, -93, -31, -35);
        }
        field6506 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 32)
    public static final void method2825(byte arg0) {
        field6502++;
        class408 var1 = class142.field2082;
        synchronized (class142.field2082) {
            class142.field2082.method2530((byte) -124);
        }
        int var2 = 32 % ((arg0 - 51) / 50);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V", line = 50)
    public static final void method2826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6505++;
        int var7 = class294.method1789(arg5, (byte) -5, class42.field543, class143.field2090);
        int var8 = class294.method1789(arg1, (byte) -5, class42.field543, class143.field2090);
        int var9 = class294.method1789(arg6, (byte) -5, class430.field6003, class80.field1119);
        int var10 = class294.method1789(arg0, (byte) -5, class430.field6003, class80.field1119);
        int var11 = class294.method1789(arg2 + arg5, (byte) -5, class42.field543, class143.field2090);
        int var12 = class294.method1789(arg1 - arg2, (byte) -5, class42.field543, class143.field2090);
        for (int var13 = var7; var13 < var11; var13++) {
            class149.method1112(arg4, var10, 8, var9, class83.field1157[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class149.method1112(arg4, var10, 8, var9, class83.field1157[var14]);
        }
        int var15 = class294.method1789(arg6 + arg2, (byte) -5, class430.field6003, class80.field1119);
        int var16 = class294.method1789(arg0 - arg2, (byte) -5, class430.field6003, class80.field1119);
        int var17 = var11;
        if (arg3 >= -29) {
            method2825((byte) -22);
        }
        while (var12 >= var17) {
            int[] var18 = class83.field1157[var17];
            class149.method1112(arg4, var15, 8, var9, var18);
            class149.method1112(arg4, var10, 8, var16, var18);
            var17++;
        }
    }
}
