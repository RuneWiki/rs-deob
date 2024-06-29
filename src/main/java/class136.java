import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class136 {

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Llg;")
    private class106 field2668 = new class106();

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lwg;")
    private class205 field2676 = new class205();

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    private int field2673;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    private int field2675;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lwf;")
    private class204 field2677;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
    public static int[] field2666 = new int[32768];

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Z")
    public static volatile boolean field2663 = true;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[I")
    public static int[] field2667 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Leh;")
    private static class47 field2672 = class195.method1282((byte) -4, "Please wait)3)3)3");

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "B")
    public static byte field2664 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Leh;")
    public static class47 field2660 = field2672;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)Llg;")
    public final class106 method986(byte arg0, long arg1) {
        class106 var4 = (class106) this.field2677.method1342(arg1, (byte) -20);
        if (var4 != null) {
            this.field2676.method1348(var4, 256);
        }
        field2669++;
        if (arg0 != 50) {
            this.method991(68);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JLlg;I)V")
    public final void method987(long arg0, class106 arg1, int arg2) {
        field2674++;
        if (this.field2675 == 0) {
            class106 var5 = this.field2676.method1346((byte) 43);
            var5.method885(3);
            var5.method865(-13283);
            if (this.field2668 == var5) {
                class106 var6 = this.field2676.method1346((byte) 43);
                var6.method885(3);
                var6.method865(-13283);
            }
        } else {
            this.field2675--;
        }
        this.field2677.method1341(arg2 ^ 0xFFFF8F3B, arg0, arg1);
        if (arg2 == 28842) {
            this.field2676.method1348(arg1, 256);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        field2660 = null;
        field2666 = null;
        field2667 = null;
        field2672 = null;
        if (arg0 != 0) {
            field2664 = -25;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I")
    public static int method989(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JI)V")
    public final void method990(long arg0, int arg1) {
        class106 var4 = (class106) this.field2677.method1342(arg0, (byte) -20);
        if (arg1 != -1) {
            return;
        }
        if (var4 != null) {
            var4.method885(3);
            var4.method865(-13283);
            this.field2675++;
        }
        field2662++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Lmb;")
    public final class110 method991(int arg0) {
        field2670++;
        return arg0 == 16446 ? this.field2677.method1340(false) : null;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Lmb;")
    public final class110 method992(int arg0) {
        field2665++;
        if (arg0 != 0) {
            this.method991(40);
        }
        return this.field2677.method1344(false);
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public final void method993(int arg0) {
        if (arg0 != 1) {
            field2666 = null;
        }
        while (true) {
            class106 var2 = this.field2676.method1346((byte) 43);
            if (var2 == null) {
                field2671++;
                this.field2675 = this.field2673;
                return;
            }
            var2.method885(3);
            var2.method865(-13283);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
    public class136(int arg0) {
        this.field2673 = arg0;
        this.field2675 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2677 = new class204(var2);
    }
}
