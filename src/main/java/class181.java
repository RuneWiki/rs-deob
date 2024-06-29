import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class181 extends class430 {

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "J")
    public long field2504;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lhu;")
    public static class225 field2502 = null;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[[I")
    public static int[][] field2503 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2501 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lss;")
    public static class506 field2495;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lla;II)Ltd;")
    public static final class515 method1279(class423 arg0, int arg1, int arg2) {
        field2496++;
        class515 var3 = (class515) class734.field10292.method2216(arg1 + arg1, (long) arg2);
        if (var3 == null) {
            if (class463.field6617) {
                var3 = class211.field3164.method202(class676.method3841(arg0, arg2), true);
            } else {
                var3 = class310.method1927(-1, arg0.method2611((byte) -104, arg2));
            }
            class734.field10292.method2213((byte) -16, (long) arg2, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([BIBII[BIII)V")
    public static final void method1280(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field2499++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] = (byte) (arg0[var10001] - arg5[arg8++]);
                int var14 = arg3++;
                arg0[var14] = (byte) (arg0[var14] - arg5[arg8++]);
                int var15 = arg3++;
                arg0[var15] = (byte) (arg0[var15] - arg5[arg8++]);
                int var16 = arg3++;
                arg0[var16] = (byte) (arg0[var16] - arg5[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg0[var10001] = (byte) (arg0[var10001] - arg5[arg8++]);
            }
            arg8 += arg7;
            arg3 += arg4;
        }
        if (arg2 < 80) {
            method1284(87);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method1281(byte arg0) {
        field2495 = null;
        field2501 = null;
        int var1 = -75 % ((23 - arg0) / 58);
        field2503 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V")
    public static final void method1282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2498++;
        class487.field7022 = arg2;
        if (arg1 <= 24) {
            field2495 = null;
        }
        class654.field9364 = arg0;
        class456.field6493 = arg4;
        class551.field8041 = arg3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
    public static final void method1283(boolean arg0) {
        if (!arg0) {
            field2501 = null;
        }
        if (class345.field4749.field4087 && class296.field4058.field7472 != -1) {
            class51.method473(50000, class296.field4058.field7472, class296.field4058.field7468);
        }
        field2500++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static final void method1284(int arg0) {
        field2497++;
        int var1 = 0;
        if (class243.field3580.field7991.method3589(false) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class243.field3580.field8008.method4186(false) == 0) {
            var1 |= 0x40;
        }
        class183.method1295((byte) 0, var1);
        int var6 = -62 / ((-arg0 - 41) / 52);
        class375.field5421.method2682((byte) 91, var1);
        class425.field6147.method4150(var1, 0);
        class288.field4000.method2824(var1, -77412414);
        class596.field8476.method2256(false, var1);
        class422.method2584(true, var1);
        class381.method2360(var1, 0);
        class692.method3909((byte) 32, var1);
        class615.method3574(var1, 100);
        class443.method2708(-381264440);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class181() {
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(J)V")
    public class181(long arg0) {
        this.field2504 = arg0;
    }
}
