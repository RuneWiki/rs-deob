import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class85 {

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "Lnga;")
    private class510 field1548 = new class510(256);

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "Ld;")
    private class149 field1550;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "Loea;")
    private class594 field1549;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "Z")
    public static boolean field1546 = false;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
    public final void method810(int arg0) {
        if (arg0 != -3) {
            method813(117, -65, -56);
        }
        this.field1548.method3048(false);
        field1553++;
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
    public final void method811(int arg0) {
        this.field1548.method3049(5, (byte) 126);
        field1552++;
        if (arg0 != -28153) {
            this.method814(45, 81);
        }
    }

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V")
    public static final void method812(int arg0) {
        field1545++;
        class332.field4686.method676((byte) 27, 5);
        class174.field2537.method2404(-1, 5);
        class284.field4039.method2573(-31707, 5);
        class66.field1181.method128(5, 18152);
        class134.field2102.method3036(5, 5);
        class558.field7942.method724(0, 5);
        class698.field9806.method854(5, (byte) -53);
        class638.field9104.method3752((byte) 84, 5);
        class679.field9567.method213((byte) 29, 5);
        class99.field1677.method2370(5, 101);
        class675.field9475.method1254(5, (byte) -124);
        class399.field5581.method2644(5, 1171111178);
        class93.field1631.method792(5, 1004);
        class285.field4042.method2987(5, true);
        class252.field3594.method965(5, (byte) 120);
        class206.field2944.method2956(419684, 5);
        int var1 = 58 / ((20 - arg0) / 37);
        class569.field8108.method3088(5, 126);
        class341.field4798.method958(5, 31);
        class254.field3692.method897(-116, 5);
        class582.field8227.method1613(0, 5);
        class49.method436((byte) 48, 5);
        class65.method688(false, 50);
        class562.method3290(50, (byte) 110);
        class449.method2675(5, true);
        class308.method2000(5, (byte) 74);
        class735.field10349.method3049(5, (byte) 126);
        class193.field2760.method3049(5, (byte) 127);
        class299.field4137.method3049(5, (byte) 126);
        class233.field3308.method3049(5, (byte) 126);
        class357.field5015.method3049(5, (byte) 127);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)Z")
    public static final boolean method813(int arg0, int arg1, int arg2) {
        if (arg0 != 1024) {
            method812(-117);
        }
        field1551++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)Lme;")
    public final class192 method814(int arg0, int arg1) {
        field1554++;
        Object var3 = this.field1548.method3054((byte) -118, (long) arg1);
        if (var3 != null) {
            return (class192) var3;
        } else if (this.field1550.method1152(arg1, -94)) {
            class546 var4 = this.field1550.method1154(-113, arg1);
            if (arg0 < 98) {
                return null;
            }
            int var5 = var4.field7706 ? 64 : this.field1549.field8528;
            class192 var7;
            if (var4.field7699 && this.field1549.method562()) {
                float[] var6 = this.field1550.method1153(false, arg1, false, 0.7F, var5, var5);
                var7 = new class192(this.field1549, 3553, 34842, var5, var5, var4.field7709 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field7708 != 2 && class471.method2857((byte) 72, var4.field7711)) {
                    var8 = this.field1550.method1151(0.7F, var5, true, -18596, arg1, var5);
                } else {
                    var8 = this.field1550.method1155(var5, false, arg1, (byte) 79, 0.7F, var5);
                }
                var7 = new class192(this.field1549, 3553, 6408, var5, var5, var4.field7709 != 0, var8, 0, 0, false);
            }
            var7.method1346((byte) -68, var4.field7704, var4.field7702);
            this.field1548.method3047(false, var7, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Loea;Ld;)V")
    public class85(class594 arg0, class149 arg1) {
        this.field1550 = arg1;
        this.field1549 = arg0;
    }
}
