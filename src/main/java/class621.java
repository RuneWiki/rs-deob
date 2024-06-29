import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class621 extends class501 {

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public int field9150 = 0;

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9154 = new Rectangle[100];

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "[I")
    public static int[] field9157;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lgw;B)V")
    public final void method3628(class148 arg0, byte arg1) {
        int var3 = 74 / ((arg1 + 40) / 47);
        field9155++;
        while (true) {
            int var4 = arg0.method1032((byte) -33);
            if (var4 == 0) {
                return;
            }
            this.method3629(true, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZLgw;I)V")
    private final void method3629(boolean arg0, class148 arg1, int arg2) {
        if (arg0) {
            field9152++;
            if (arg2 == 2) {
                this.field9150 = arg1.method1045(true);
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V")
    public static final void method3630(byte arg0) {
        class92.method733(0);
        field9151++;
        class58.field738 = null;
        if (arg0 <= 72) {
            field9157 = null;
        }
        class216.field3176 = null;
        class491.field6998 = null;
        class26.field280 = null;
        class584.field8576 = null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
    public static void method3631(int arg0) {
        field9157 = null;
        field9154 = null;
        if (arg0 != 2) {
            field9154 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IZ)V")
    public static final void method3632(int arg0, boolean arg1) {
        for (class14 var2 = (class14) class1.field5.method124((byte) 42); var2 != null; var2 = (class14) class1.field5.method120(-93)) {
            if (var2.field139 != null) {
                class155.field2316.method258(var2.field139);
                var2.field139 = null;
            }
            if (var2.field128 != null) {
                class155.field2316.method258(var2.field128);
                var2.field128 = null;
            }
            var2.method2457(arg0 - 8421);
        }
        if (arg0 != -1) {
            method3632(45, false);
        }
        field9156++;
        if (!arg1) {
            return;
        }
        for (class14 var3 = (class14) class615.field9103.method124((byte) 42); var3 != null; var3 = (class14) class615.field9103.method120(39)) {
            if (var3.field139 != null) {
                class155.field2316.method258(var3.field139);
                var3.field139 = null;
            }
            var3.method2457(-8422);
        }
        for (class14 var4 = (class14) class276.field3879.method2798((byte) -103); var4 != null; var4 = (class14) class276.field3879.method2806(true)) {
            if (var4.field139 != null) {
                class155.field2316.method258(var4.field139);
                var4.field139 = null;
            }
            var4.method2457(-8422);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I[B)Lod;")
    public static final class433 method3633(int arg0, byte[] arg1) {
        field9149++;
        class433 var2 = new class433();
        class148 var3 = new class148(arg1);
        var3.field2177 = var3.field2146.length - 2;
        int var4 = var3.method1045(true);
        int var5 = var3.field2146.length - var4 - 12 - 2;
        var3.field2177 = var5;
        int var6 = var3.method1026(-917302120);
        var2.field5797 = var3.method1045(true);
        var2.field5798 = var3.method1045(true);
        var2.field5792 = var3.method1045(true);
        var2.field5805 = var3.method1045(true);
        int var7 = var3.method1032((byte) -33);
        if (var7 > 0) {
            var2.field5794 = new class465[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1045(true);
                class465 var10 = new class465(class322.method1938(var9, 83));
                var2.field5794[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1026(-917302120);
                    int var12 = var3.method1026(-917302120);
                    var10.method2797(-4234, new class556(var12), (long) var11);
                }
            }
        }
        var3.field2177 = arg0;
        var2.field5801 = var3.method1040(25142);
        var2.field5799 = new int[var6];
        var2.field5804 = new int[var6];
        var2.field5795 = new String[var6];
        int var13 = 0;
        while (var3.field2177 < var5) {
            int var14 = var3.method1045(true);
            if (var14 == 3) {
                var2.field5795[var13] = var3.method1023(-29153).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field5799[var13] = var3.method1032((byte) -33);
            } else {
                var2.field5799[var13] = var3.method1026(-917302120);
            }
            var2.field5804[var13++] = var14;
        }
        return var2;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9154[var0] = new Rectangle();
        }
        field9157 = new int[32];
    }
}
