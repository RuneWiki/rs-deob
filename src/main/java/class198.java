import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class198 {

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Lad;")
    private class11 field2550 = new class11(16);

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Ldn;")
    private class201 field2549;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Lsu;")
    public static class111 field2553 = new class111(1);

    @OriginalMember(owner = "client!so", name = "i", descriptor = "[I")
    public static int[] field2556 = new int[1];

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "Lan;")
    public static class183 field2555;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "Lf;")
    public static class404 field2557;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V")
    public final void method1271(byte arg0, int arg1) {
        class11 var3 = this.field2550;
        synchronized (this.field2550) {
            this.field2550.method80(-51, arg1);
            if (arg0 > -58) {
                this.method1272(-29, -95);
            }
        }
        field2558++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Lhc;")
    public final class318 method1272(int arg0, int arg1) {
        field2554++;
        class11 var3 = this.field2550;
        class318 var4;
        synchronized (this.field2550) {
            var4 = (class318) this.field2550.method78((long) arg1, (byte) -85);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2549.method1313((byte) -100, arg0, arg1);
        class318 var6 = new class318();
        if (var5 != null) {
            var6.method1896(new class88(var5), arg0 ^ 0xAB2);
        }
        class11 var7 = this.field2550;
        synchronized (this.field2550) {
            this.field2550.method88((long) arg1, 112, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public final void method1273(int arg0) {
        class11 var2 = this.field2550;
        synchronized (this.field2550) {
            if (arg0 != 0) {
                return;
            }
            this.field2550.method90((byte) -27);
        }
        field2548++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public static void method1274(byte arg0) {
        field2553 = null;
        if (arg0 <= 120) {
            method1274((byte) 64);
        }
        field2557 = null;
        field2556 = null;
        field2555 = null;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
    public static final void method1275(byte arg0) {
        class34.field540 = null;
        int var1 = 85 / ((-arg0 - 71) / 48);
        field2551++;
        class141.method971(class23.field419, 0, class92.field1281, 0, -1, 0, 0, class282.field3610, -1);
        if (class34.field540 != null) {
            class140.method969(class509.field7473, class12.field198.field5811, 0, class23.field419, class34.field540, class358.field4613, -10, -1412584499, 0, class92.field1281);
            class34.field540 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
    public final void method1276(int arg0) {
        class11 var2 = this.field2550;
        synchronized (this.field2550) {
            this.field2550.method84(121);
        }
        if (arg0 == 0) {
            field2552++;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lgt;ILdn;)V")
    public class198(class65 arg0, int arg1, class201 arg2) {
        this.field2549 = arg2;
        this.field2549.method1302(-119, 30);
    }
}
