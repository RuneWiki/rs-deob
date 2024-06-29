import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class653 extends class321 {

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "[I")
    public static int[] field9346 = new int[1];

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Liba;")
    public static class211 field9348 = new class211(34, -1);

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field9352 = 0;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public int field9337;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public int field9338;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public int field9341;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public int field9347;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Lmea;")
    public class355 field9340;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Ljava/lang/String;")
    public String field9350;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "[I")
    public int[] field9342;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "[I")
    public int[] field9344;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "[I")
    public static int[] field9351;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "[Lefa;")
    public class322[] field9345;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field9343;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Luca;II[II[I)Lkba;", line = 3)
    public static final class20 method3693(class287 arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        field9336++;
        if (arg1 != 30705) {
            return null;
        }
        byte[] var6 = new byte[arg2 * arg4];
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg4 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class20(arg0, arg4, arg2, var6);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method3694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class109.field1626 = arg0;
        class119.field1780 = arg2;
        field9339++;
        class608.field8804 = arg5;
        class115.field1731 = arg1;
        class478.field6845 = arg3;
        if (class608.field8804 >= 100) {
            int var6 = class119.field1780 * 512 + 256;
            int var7 = class478.field6845 * 512 + 256;
            int var8 = class504.method2870((byte) -119, var7, var6, class49.field779) - class109.field1626;
            int var9 = var6 - class306.field4529;
            int var10 = var8 - class533.field7839;
            int var11 = var7 - class603.field8702;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class246.field3255 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class481.field6886 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class246.field3255 < 1024) {
                class246.field3255 = 1024;
            }
            class276.field3597 = 0;
            if (class246.field3255 > 3072) {
                class246.field3255 = 3072;
            }
        }
        class684.field9659 = 2;
        if (arg4 != 0) {
            field9348 = null;
        }
        class150.field2120 = -1;
        class250.field3280 = -1;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V", line = 93)
    public static void method3695(int arg0) {
        field9351 = null;
        field9348 = null;
        if (arg0 != 512) {
            field9351 = null;
        }
        field9346 = null;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 105)
    public static final void method3696(int arg0) {
        for (class426 var1 = (class426) class152.field2150.method1904(false); var1 != null; var1 = (class426) class152.field2150.method1901(arg0 - 28526)) {
            if (class603.method3428(500, var1.field6223)) {
                class286.method1687(var1, (byte) -125);
            }
        }
        if (arg0 != 28623) {
            method3694(59, 3, -38, -5, -121, 25);
        }
        field9349++;
        if (class373.field5520 == 1) {
            class291.method1794(15669);
            return;
        }
        class430.method2569(class232.field3067, arg0 ^ 0x6FCF, class201.field2730, class367.field5374, class291.field4283);
        int var2 = class141.field2042.method3455(class279.field3649.method1654(90, class262.field3401), (byte) 1);
        for (class426 var3 = (class426) class152.field2150.method1904(false); var3 != null; var3 = (class426) class152.field2150.method1901(109)) {
            int var4 = class104.method739(var3, -11666);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class367.field5374 = var2 + 8;
        class232.field3067 = (class70.field1083 ? 26 : 22) + class373.field5520 * 16;
    }
}
