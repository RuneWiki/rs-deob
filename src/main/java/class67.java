import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class67 extends class306 {

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field1016 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "[I")
    public static int[] field1015 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "Z")
    public static boolean field1020 = false;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "J")
    public static long field1014;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "[I")
    public static int[] field1017;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 6)
    public static void method534(int arg0) {
        field1015 = null;
        if (arg0 != 0) {
            method535(75);
        }
        field1017 = null;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 20)
    public static final void method535(int arg0) {
        field1012++;
        if (class345.field5363 != null && class345.field5363.field4671 + 64 - class345.field5363.method738(-6421) * 64 >> 7 == class57.field862 && class345.field5363.field4672 - ((class345.field5363.method738(-6421) - 1) * 64) >> 7 == class169.field2723) {
            class57.field862 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class171.field2755[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class45.field703; var3++) {
            class92 var4 = class74.field1140[class325.field5068[var3]];
            if (var4 != null) {
                var4.field4684 = false;
            }
        }
        int var5 = 0 / ((arg0 - 34) / 40);
        for (int var6 = 0; var6 < class83.field1290; var6++) {
            class86 var7 = class197.field3029[class76.field1192[var6]];
            if (var7 != null) {
                var7.field4684 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V", line = 96)
    public static final void method536(byte arg0, int arg1) {
        field1018++;
        class170 var2 = class221.method1613(6, arg1, -8410);
        int var3 = 28 % ((20 - arg0) / 60);
        var2.method1267(120);
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 107)
    public static final void method537(int arg0) {
        if (class155.field2520 != null) {
            class75 var1 = new class75();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class155.field2520[var2][var3] = var1;
                }
            }
        }
        field1019++;
        if (arg0 != -28372) {
            field1020 = false;
        }
    }
}
