import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class395 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public int field5825 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public int field5828 = 2048;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field5827 = 0;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field5835 = 2048;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lwf;")
    public static class1 field5831 = new class1(5000);

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lgq;")
    public static class418 field5836 = new class418(16);

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lar;")
    public static class47 field5837 = new class47();

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
    public static int[] field5838 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[[B")
    public static byte[][] field5833;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
    public static final int method2536(int arg0) {
        if (arg0 == -3) {
            field5834++;
            return class75.field1077;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Z")
    public static final boolean method2537(byte arg0, int arg1) {
        field5832++;
        if (class339.field4887[arg1]) {
            return true;
        }
        int var2 = -11 / ((-arg0 - 63) / 45);
        if (!class300.field4408.method2255(arg1, (byte) -84)) {
            return false;
        }
        int var3 = class300.field4408.method2272(64, arg1);
        if (var3 == 0) {
            class339.field4887[arg1] = true;
            return true;
        }
        if (class365.field5292[arg1] == null) {
            class365.field5292[arg1] = new class394[var3];
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class365.field5292[arg1][var4] == null) {
                byte[] var5 = class300.field4408.method2261(var4, arg1, 83);
                if (var5 != null) {
                    class394 var6 = class365.field5292[arg1][var4] = new class394();
                    var6.field5698 = (arg1 << 16) + var4;
                    if (var5[0] == -1) {
                        var6.method2520(new class228(var5), (byte) 113);
                    } else {
                        var6.method2534(-1, new class228(var5));
                    }
                }
            }
        }
        class339.field4887[arg1] = true;
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static void method2538(int arg0) {
        field5836 = null;
        field5833 = null;
        field5831 = null;
        field5838 = null;
        if (arg0 < 22) {
            method2538(-122);
        }
        field5837 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILnj;II)V")
    private final void method2539(int arg0, class228 arg1, int arg2, int arg3) {
        field5829++;
        if (arg2 != -3794) {
            return;
        }
        if (arg0 == 1) {
            this.field5827 = arg1.method1348(-112);
        } else if (arg0 == 2) {
            this.field5835 = arg1.method1343(255);
        } else if (arg0 == 3) {
            this.field5828 = arg1.method1343(255);
            return;
        } else if (arg0 == 4) {
            this.field5825 = arg1.method1319((byte) -13);
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lnj;II)V")
    public final void method2540(class228 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1348(-122);
            if (var4 == 0) {
                field5830++;
                if (arg2 != -4554) {
                    method2538(76);
                    return;
                }
                return;
            }
            this.method2539(var4, arg0, -3794, arg1);
        }
    }
}
