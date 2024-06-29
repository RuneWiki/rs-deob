import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class152 extends class208 {

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public int field2589 = 0;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field2573 = -1;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "[[I")
    public static int[][] field2588 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "Lve;")
    public static class255 field2586 = class87.method607(65, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public int field2578;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "Lmg;")
    public class145 field2587;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Ltj;")
    public static class169 field2575;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "Lta;")
    public class186 field2576;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Lt;")
    public class242 field2572;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lqb;")
    public class94 field2567;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "Lqb;")
    public class94 field2582;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Z")
    public boolean field2570;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[I")
    public int[] field2568;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 8)
    public final void method1119(int arg0) {
        field2584++;
        int var2 = this.field2569;
        if (arg0 != 1) {
            this.method1119(-16);
        }
        if (this.field2587 != null) {
            class145 var5 = this.field2587.method1089(-100);
            if (var5 == null) {
                this.field2578 = 0;
                this.field2581 = 0;
                this.field2568 = null;
                this.field2574 = 0;
                this.field2569 = -1;
            } else {
                this.field2568 = var5.field2411;
                this.field2578 = var5.field2431;
                this.field2581 = var5.field2432 * 128;
                this.field2569 = var5.field2461;
                this.field2574 = var5.field2450;
            }
        } else if (this.field2576 != null) {
            int var3 = class196.method1407(this.field2576, (byte) 116);
            if (var2 != var3) {
                class236 var4 = this.field2576.field2996;
                this.field2569 = var3;
                if (var4.field3893 != null) {
                    var4 = var4.method1628(96);
                }
                if (var4 == null) {
                    this.field2581 = 0;
                } else {
                    this.field2581 = var4.field3941 * 128;
                }
            }
        } else if (this.field2572 != null) {
            this.field2569 = class314.method2164(this.field2572, true);
            this.field2581 = this.field2572.field4053 * 128;
        }
        if (this.field2569 != var2 && this.field2567 != null) {
            class230.field3813.method1481(this.field2567);
            this.field2567 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V", line = 100)
    public static void method1120(byte arg0) {
        if (arg0 >= -92) {
            field2588 = (int[][]) ((int[][]) null);
        }
        field2586 = null;
        field2575 = null;
        field2588 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBIIII)V", line = 135)
    public static final void method1121(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2585++;
        int var6 = arg2 - arg4;
        int var7 = arg3 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class194.method1388(arg3, -1, arg0, arg4, arg5);
            }
        } else if (var7 == 0) {
            class84.method591(arg5, arg4, -1, arg0, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            if (arg1 >= -99) {
                field2573 = 73;
            }
            int var9 = arg0 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg4 < class125.field2082) {
                var10 = class125.field2082;
                var11 = var9 + (class125.field2082 * var8 >> 12);
            } else if (class30.field473 >= arg4) {
                var10 = arg4;
                var11 = arg0;
            } else {
                var11 = (class30.field473 * var8 >> 12) + var9;
                var10 = class30.field473;
            }
            if (var11 < class261.field4427) {
                var10 = (class261.field4427 - var9 << 12) / var8;
                var11 = class261.field4427;
            } else if (var11 > class11.field156) {
                var11 = class11.field156;
                var10 = (class11.field156 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class125.field2082 > arg2) {
                var13 = class125.field2082;
                var12 = var9 + (class125.field2082 * var8 >> 12);
            } else if (class30.field473 >= arg2) {
                var12 = arg3;
                var13 = arg2;
            } else {
                var13 = class30.field473;
                var12 = (class30.field473 * var8 >> 12) + var9;
            }
            if (var12 < class261.field4427) {
                var13 = (class261.field4427 - var9 << 12) / var8;
                var12 = class261.field4427;
            } else if (class11.field156 < var12) {
                var12 = class11.field156;
                var13 = (class11.field156 - var9 << 12) / var8;
            }
            class288.method2043(var10, var11, arg5, true, var13, var12);
        }
    }
}
