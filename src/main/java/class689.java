import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class689 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "Lvm;")
    public class687 field9586 = new class687();

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Z")
    public boolean field9595 = false;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "Lkaa;")
    public static class47 field9588 = new class47(28, -1);

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "[I")
    public static int[] field9593 = new int[6];

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "B")
    public static byte field9592;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "Z")
    public static boolean field9594;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "[[I")
    public static int[][] field9589;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILww;)V")
    public final void method3875(int arg0, class733 arg1) {
        field9590++;
        class256 var3 = arg1.field10152;
        boolean var4 = true;
        class364[] var5 = arg1.field10150;
        for (int var6 = arg0; var6 < var5.length; var6++) {
            if (var5[var6].field5117) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field9595) {
            for (class733 var7 = (class733) this.field9586.method3874((byte) 58); var7 != null; var7 = (class733) this.field9586.method3868(-24951)) {
                if (var7.field10152 == var3) {
                    var7.method2815(-128);
                    class500.method2819(var7, (byte) 31);
                }
            }
        }
        for (class733 var8 = (class733) this.field9586.method3874((byte) 125); var8 != null; var8 = (class733) this.field9586.method3868(-24951)) {
            if (var3.field3509 >= var8.field10152.field3509) {
                class548.method3066((byte) -117, var8, arg1);
                return;
            }
        }
        this.field9586.method3870(arg1, 0);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public final void method3876(int arg0) {
        while (true) {
            class733 var2 = (class733) this.field9586.method3873(false);
            if (var2 == null) {
                if (arg0 != 28) {
                    return;
                }
                field9587++;
                return;
            }
            var2.method2815(-128);
            class500.method2819(var2, (byte) 31);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZB)V")
    public static final void method3877(boolean arg0, byte arg1) {
        class423.field5835++;
        field9591++;
        class583 var2 = class381.method2246(1, class128.field2105, class165.field2497);
        class42.method309(var2, 0);
        int var3 = -9 % ((arg1 + 25) / 45);
        for (class8 var4 = (class8) class350.field4925.method2144(true); var4 != null; var4 = (class8) class350.field4925.method2146(false)) {
            if (!var4.method3566((byte) 78)) {
                var4 = (class8) class350.field4925.method2144(true);
                if (var4 == null) {
                    break;
                }
            }
            if (var4.field157 == 0) {
                class710.method3990(false, arg0, true, var4);
            }
        }
        if (class420.field5787 != null) {
            class399.method2347(class420.field5787, 2260);
            class420.field5787 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
    public static void method3878(int arg0) {
        field9589 = null;
        field9593 = null;
        if (arg0 < 88) {
            field9589 = null;
        }
        field9588 = null;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Z)V")
    public class689(boolean arg0) {
        this.field9595 = arg0;
    }
}
