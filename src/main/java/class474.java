import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class474 implements class525 {

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "Lok;")
    private class101 field6822;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "[Lwaa;")
    private class33[] field6824;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lps;")
    public static class469 field6828 = new class469(9, 4);

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "[[B")
    public static byte[][] field6835 = new byte[50][];

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "Lkf;")
    public static class287 field6833 = new class287();

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Lpi;")
    public static class464 field6836;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Lr;")
    private class564 field6825;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Z")
    private boolean field6821;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "Z")
    public static boolean field6834;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZB)V")
    public final void method2452(boolean arg0, byte arg1) {
        boolean var3 = true;
        int var4 = -73 / ((arg1 + 12) / 61);
        field6830++;
        class33[] var5 = this.field6824;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class33 var7 = var5[var6];
            if (var7 != null) {
                var7.method155(var3 || this.field6821, -3563);
            }
        }
        this.field6821 = false;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I")
    public final int method2447(byte arg0) {
        if (arg0 == -93) {
            field6829++;
            return this.field6822.field1088;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public final void method2458(int arg0) {
        if (class701.field9813 != this.field6825) {
            this.field6821 = true;
            this.field6825 = class701.field9813;
        }
        field6827++;
        this.field6825.method1002(0);
        class33[] var2 = this.field6824;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class33 var4 = var2[var3];
            if (var4 != null) {
                var4.method156(23004);
            }
        }
        if (arg0 <= 1) {
            this.method2450(55);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)I")
    public final int method2455(boolean arg0) {
        field6823++;
        if (!arg0) {
            return -116;
        }
        int var2 = 0;
        class33[] var3 = this.field6824;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class33 var5 = var3[var4];
            if (var5 == null || var5.method157(!arg0)) {
                var2++;
            }
        }
        return var2 * 100 / this.field6824.length;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method2450(int arg0) {
        field6832++;
        if (arg0 != -4211) {
            this.method2447((byte) 104);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IJ)Z")
    public final boolean method2451(int arg0, long arg1) {
        field6826++;
        int var4 = 122 / ((arg0 + 58) / 50);
        return class557.method3157(-117) >= arg1 + ((long) this.field6822.field1092);
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
    public static void method2732(int arg0) {
        field6833 = null;
        if (arg0 != 0) {
            method2732(-67);
        }
        field6836 = null;
        field6828 = null;
        field6835 = null;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lok;Lul;)V")
    public class474(class101 arg0, class428 arg1) {
        this.field6822 = arg0;
        this.field6824 = new class33[this.field6822.field1093.length];
        for (int var3 = 0; var3 < this.field6824.length; var3++) {
            this.field6824[var3] = arg1.method2470((byte) 89, this.field6822.field1093[var3]);
        }
    }
}
