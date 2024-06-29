import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class270 extends class307 {

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public int field4483;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Lqd;")
    public static class40 field4482 = class147.method1106("Schrifts-=tze geladen)3", (byte) -115);

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field4487 = 0;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Lqd;")
    public static class40 field4489 = class147.method1106(")4p=", (byte) -69);

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Z")
    public static boolean field4488 = false;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 10)
    public class270() {
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILce;Lce;)V", line = 27)
    public static final void method1869(int arg0, class239 arg1, class239 arg2) {
        class61.field1161 = arg2;
        class251.field4155 = arg1;
        if (arg0 == 15) {
            field4484++;
            class150.field2523 = class251.field4155.method1664(3, (byte) 30);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V", line = 55)
    public class270(int arg0) {
        this.field4483 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V", line = 65)
    public static void method1870(int arg0) {
        if (arg0 != 2983) {
            field4489 = (class40) null;
        }
        field4482 = null;
        field4489 = null;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V", line = 91)
    public static final void method1871(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class123.field2135[var1] = false;
        }
        field4481++;
        class30.field632 = -1;
        class315.field5349 = -1;
        if (arg0 != 5) {
            method1871(125);
        }
        class103.field1814 = 1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 109)
    public static final void method1872(byte arg0) {
        field4485++;
        while (class95.field1715.method1456(class202.field3201, 128) >= 11) {
            int var1 = class95.field1715.method1466(arg0 ^ 0x15E5, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class298.field4979[var1] == null) {
                class298.field4979[var1] = new class258();
                var2 = true;
                if (class151.field2526[var1] != null) {
                    class298.field4979[var1].method1812(class151.field2526[var1], -46);
                }
            }
            class212.field3390[class159.field2663++] = var1;
            class258 var3 = class298.field4979[var1];
            var3.field1509 = class256.field4266;
            int var4 = class232.field3801[class95.field1715.method1466(-5582, 3)];
            if (var2) {
                var3.field1521 = var3.field1507 = var4;
            }
            int var5 = class95.field1715.method1466(-5582, 1);
            int var6 = class95.field1715.method1466(-5582, 1);
            if (var6 == 1) {
                class301.field5048[class87.field1555++] = var1;
            }
            int var7 = class95.field1715.method1466(arg0 - 5541, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class95.field1715.method1466(-5582, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1811(arg0 ^ 0xFFFFFFD7, class255.field4233.field1532[0] + var8, var5 == 1, class255.field4233.field1489[0] + var7);
        }
        class95.field1715.method1459(128);
        if (arg0 != -41) {
            method1871(17);
        }
    }
}
