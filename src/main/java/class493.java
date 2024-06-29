import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class493 implements Runnable {

    @OriginalMember(owner = "client!tja", name = "g", descriptor = "[Liv;")
    public volatile class635[] field6761 = new class635[2];

    @OriginalMember(owner = "client!tja", name = "e", descriptor = "Z")
    public volatile boolean field6759 = false;

    @OriginalMember(owner = "client!tja", name = "h", descriptor = "Z")
    public volatile boolean field6762 = false;

    @OriginalMember(owner = "client!tja", name = "i", descriptor = "Lsv;")
    public static class570 field6763 = new class570(18, 8);

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!tja", name = "f", descriptor = "Lcea;")
    public class111 field6760;

    @OriginalMember(owner = "client!tja", name = "k", descriptor = "Lm;")
    public static class554 field6765;

    @OriginalMember(owner = "client!tja", name = "j", descriptor = "[I")
    public static int[] field6764;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)V", line = 5)
    public static void method2878(int arg0) {
        field6764 = null;
        if (arg0 < 0) {
            field6764 = null;
        }
        field6763 = null;
        field6765 = null;
    }

    @OriginalMember(owner = "client!tja", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        this.field6762 = true;
        field6758++;
        try {
            while (!this.field6759) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class635 var2 = this.field6761[var1];
                    if (var2 != null) {
                        var2.method3617((byte) -86);
                    }
                }
                class579.method3405(10L, 10);
                class697.method3912(4, this.field6760, null);
            }
        } catch (Exception var9) {
            class349.method2122(var9, null, 1);
        } finally {
            Object var6 = null;
            this.field6762 = false;
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZIII)V", line = 53)
    public static final void method2879(boolean arg0, int arg1, int arg2, int arg3) {
        field6757++;
        if (class108.field1547.method4253((long) arg3, ~arg2) == null) {
            if (class453.field6204) {
                class622 var4 = new class622(arg3, new class578(4096, class30.field334, arg3), arg1, arg0);
                var4.field8775.method3978(class422.field5869[class423.field5892], (byte) 52);
                class108.field1547.method4252(false, var4, (long) arg3);
            } else {
                class661.method3707(arg3, arg0, 2);
            }
        }
        if (arg2 != 0) {
            field6763 = null;
        }
    }

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "(I)V", line = 79)
    public static final void method2880(int arg0) {
        field6756++;
        class702.method3933(arg0 + 1713);
        class673.field9429 = null;
        class651.field9225 = null;
        class577.field8318 = 0;
        class609.field8651 = 0;
        class95.field1354 = null;
        class48.field674.field5983 = 0;
        class549.field7634 = 0;
        class654.field9250 = null;
        class664.method3720(-2);
        class322.method1947(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class588.field8451[var1] = null;
        }
        class719.field10041 = null;
        for (int var2 = 0; var2 < class51.field731; var2++) {
            class506 var4 = class654.field9252[var2].field9191;
            if (var4 != null) {
                var4.field4054 = -1;
            }
        }
        class675.method3776(-98);
        class783.field10725 = 1;
        class401.field5533 = arg0;
        class743.field10323 = arg0;
        class75.method690(true, 10);
        for (int var3 = 0; var3 < 100; var3++) {
            class438.field6082[var3] = true;
        }
        class594.method3470(-25957);
        class168.field2547 = null;
        class762.field10560 = 0L;
    }
}
