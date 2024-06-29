import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class644 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field9375 = -1;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public int field9382 = -1;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
    public static boolean field9381 = false;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lfr;")
    public static class350 field9374 = class14.method100(0);

    @OriginalMember(owner = "client!f", name = "d", descriptor = "F")
    public static float field9377;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    public int[] field9378;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLgw;)V", line = 6)
    public final void method3721(byte arg0, class148 arg1) {
        field9380++;
        if (arg0 != 18) {
            this.field9378 = null;
        }
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                return;
            }
            this.method3722(arg1, 65, var3);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lgw;II)V", line = 28)
    private final void method3722(class148 arg0, int arg1, int arg2) {
        field9376++;
        int var4 = -79 / ((2 - arg1) / 50);
        if (arg2 == 1) {
            this.field9382 = arg0.method1045(true);
        } else if (arg2 == 2) {
            this.field9378 = new int[arg0.method1032((byte) -33)];
            for (int var5 = 0; var5 < this.field9378.length; var5++) {
                this.field9378[var5] = arg0.method1045(true);
            }
            return;
        } else if (arg2 == 3) {
            this.field9375 = arg0.method1032((byte) -33);
            return;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 71)
    public static void method3723(int arg0) {
        if (arg0 <= 54) {
            method3724(94, 66);
        }
        field9374 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 81)
    public static final void method3724(int arg0, int arg1) {
        class378.field5211 = 2;
        class84.field1208 = arg1;
        field9379++;
        long var2 = 0L;
        if (class183.field2754 == null) {
            class469.method2832(-61, 35);
            return;
        }
        class148 var4 = new class148(class641.method3705((byte) -115, class165.method1191(class183.field2754, -71)));
        long var5 = var4.method1004((byte) 54);
        class18.field162 = var4.method1004((byte) 84);
        class263.method1665(class217.method1415(var5, -80), true, -122, "");
        int var7 = -37 / ((arg0 - 29) / 63);
    }
}
