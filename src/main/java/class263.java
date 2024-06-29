import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class263 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Luk;")
    public static class96 field4665 = new class96(64);

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "[I")
    public static int[] field4670 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field4669 = new Random();

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1786(byte arg0) {
        if (arg0 <= -104) {
            field4665 = null;
            field4669 = null;
            field4670 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ls;)V")
    public static final void method1787(class228 arg0) {
        for (int var1 = arg0.field4137; var1 <= arg0.field4135; var1++) {
            for (int var2 = arg0.field4127; var2 <= arg0.field4128; var2++) {
                class249 var3 = class248.field4406[arg0.field4141][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4445; var4++) {
                        if (var3.field4429[var4] == arg0) {
                            var3.field4445--;
                            for (int var5 = var4; var5 < var3.field4445; var5++) {
                                var3.field4429[var5] = var3.field4429[var5 + 1];
                                var3.field4434[var5] = var3.field4434[var5 + 1];
                            }
                            var3.field4429[var3.field4445] = null;
                            break;
                        }
                    }
                    var3.field4425 = 0;
                    for (int var6 = 0; var6 < var3.field4445; var6++) {
                        var3.field4425 |= var3.field4434[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([[IB)V")
    public static final void method1788(int[][] arg0, byte arg1) {
        if (arg1 == 0) {
            field4667++;
            class249.field4420 = arg0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static final void method1789(byte arg0) {
        int var1 = 27 / ((-arg0 - 63) / 41);
        for (int var2 = 0; var2 < class21.field544; var2++) {
            int var10002 = class246.field4375[var2]--;
            if (class246.field4375[var2] >= -10) {
                class199 var4 = class211.field3815[var2];
                if (var4 == null) {
                    var4 = class199.method1373(class220.field3964, class180.field3243[var2], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class246.field4375[var2] += var4.method1371();
                    class211.field3815[var2] = var4;
                }
                if (class246.field4375[var2] < 0) {
                    int var5;
                    if (class91.field1853[var2] == 0) {
                        var5 = class264.field4672;
                    } else {
                        int var6 = (class91.field1853[var2] & 0xFF9F34) >> 16;
                        int var7 = (class91.field1853[var2] & 0xFF) * 128;
                        int var8 = var6 * 128 + 64 - class124.field2412.field676;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = (class91.field1853[var2] & 0xFF39) >> 8;
                        int var10 = var9 * 128 + 64 - class124.field2412.field685;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        int var11 = var8 + var10 - 128;
                        if (var11 > var7) {
                            class246.field4375[var2] = -100;
                            continue;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        var5 = (var7 - var11) * class152.field2879 / var7;
                    }
                    if (var5 > 0) {
                        class19 var12 = var4.method1372().method151(class50.field1059);
                        class266 var13 = class266.method1827(var12, 100, var5);
                        var13.method1830(class75.field1496[var2] - 1);
                        class2.field18.method371(var13);
                    }
                    class246.field4375[var2] = -100;
                }
            } else {
                class21.field544--;
                for (int var3 = var2; var3 < class21.field544; var3++) {
                    class180.field3243[var3] = class180.field3243[var3 + 1];
                    class211.field3815[var3] = class211.field3815[var3 + 1];
                    class75.field1496[var3] = class75.field1496[var3 + 1];
                    class246.field4375[var3] = class246.field4375[var3 + 1];
                    class91.field1853[var3] = class91.field1853[var3 + 1];
                }
                var2--;
            }
        }
        field4664++;
        if (class91.field1854 && !class155.method1134(28)) {
            if (class139.field2646 != 0 && class39.field909 != -1) {
                class108.method770(false, (byte) -82, class39.field909, class232.field4204, 0, class139.field2646);
            }
            class91.field1854 = false;
        } else if (class139.field2646 != 0 && class39.field909 != -1 && !class155.method1134(-126)) {
            class163.field3063++;
            class36.field809.method1356(243, true);
            class36.field809.method1406(1472534024, class39.field909);
            class39.field909 = -1;
        }
    }
}
