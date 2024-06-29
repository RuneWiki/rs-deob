import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class34 implements Runnable {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Z")
    public boolean field796 = true;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field798 = new Object();

    @OriginalMember(owner = "client!d", name = "l", descriptor = "[I")
    public int[] field805 = new int[500];

    @OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
    public int[] field802 = new int[500];

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public int field806 = 0;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lj;")
    public static class98 field795 = new class98(0, 0);

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
    public static int[] field803 = new int[50];

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lkh;")
    public static class117 field800 = class224.method1450((byte) 15, "titlebox");

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lkh;")
    public static class117 field808 = class224.method1450((byte) 17, "hitmarks");

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field807 = -1;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[I")
    public static int[] field804 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILdd;Ldd;IIIIJ)V")
    public static final void method301(int arg0, int arg1, int arg2, int arg3, class38 arg4, class38 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class239 var12 = new class239();
        var12.field4326 = arg10;
        var12.field4328 = arg1 * 128 + 64;
        var12.field4315 = arg2 * 128 + 64;
        var12.field4322 = arg3;
        var12.field4320 = arg4;
        var12.field4331 = arg5;
        var12.field4321 = arg6;
        var12.field4325 = arg7;
        var12.field4319 = arg8;
        var12.field4316 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class109.field2063[var13][arg1][arg2] == null) {
                class109.field2063[var13][arg1][arg2] = new class170(var13, arg1, arg2);
            }
        }
        class109.field2063[arg0][arg1][arg2].field3073 = var12;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Lib;")
    public static final class90 method302(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3062;
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
    public final void run() {
        field794++;
        while (this.field796) {
            Object var1 = this.field798;
            synchronized (this.field798) {
                if (this.field806 < 500) {
                    this.field805[this.field806] = class137.field2479;
                    this.field802[this.field806] = class199.field3571;
                    this.field806++;
                }
            }
            class165.method1167(-22942, 50L);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method303(byte arg0) {
        field795 = null;
        field808 = null;
        int var1 = 106 / ((arg0 + 56) / 54);
        field804 = null;
        field800 = null;
        field803 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lkh;")
    public static final class117 method304(int arg0, int arg1) {
        class117 var2 = new class117();
        field797++;
        var2.field2196 = new byte[arg1];
        var2.field2213 = 0;
        if (arg0 != 144) {
            field795 = null;
        }
        return var2;
    }
}
