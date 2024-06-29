import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class412 {

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public int field5655;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field5654 = 0;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "[[[Lfba;")
    public static class24[][][] field5656;

    @OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field5657++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 20)
    public static void method2363(byte arg0) {
        if (arg0 < -10) {
            field5656 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(II)V", line = 29)
    public class412(int arg0, int arg1) {
        this.field5655 = arg1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)Z", line = 40)
    public static final boolean method2364(int arg0, boolean arg1) {
        field5652++;
        if (arg1) {
            field5653 = -70;
        }
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 51)
    public static final void method2365(boolean arg0) {
        field5651++;
        class178.method1197((byte) 13, class344.field4718.field5434);
        int var1 = (class259.field3563 >> 12) + (class473.field6334 >> 3);
        class29.field476 = class199.field2897.field8609 = 0;
        int var2 = (class643.field8632 >> 12) + (class233.field3269 >> 3);
        class199.field2897.method2314(8, 0, 8);
        byte var3 = 18;
        class204.field2954 = new byte[var3][];
        class376.field5072 = new int[var3];
        class3.field40 = new int[var3];
        class373.field5046 = new int[var3];
        class91.field1386 = new int[var3];
        class502.field6717 = new byte[var3][];
        class559.field7419 = new int[var3][4];
        class63.field965 = new byte[var3][];
        class120.field2025 = new int[var3];
        class426.field5860 = new byte[var3][];
        class454.field6186 = new int[var3];
        class214.field3061 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class34.field530 >> 4)) / 8; var5 <= ((class34.field530 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class34.field531 >> 4)) / 8; var8 <= ((class34.field531 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class376.field5072[var4] = var9;
                class373.field5046[var4] = class243.field3403.method2523("m" + var5 + "_" + var8, (byte) 95);
                class120.field2025[var4] = class243.field3403.method2523("l" + var5 + "_" + var8, (byte) 79);
                class91.field1386[var4] = class243.field3403.method2523("n" + var5 + "_" + var8, (byte) 119);
                class3.field40[var4] = class243.field3403.method2523("um" + var5 + "_" + var8, (byte) 103);
                class454.field6186[var4] = class243.field3403.method2523("ul" + var5 + "_" + var8, (byte) 83);
                if (class91.field1386[var4] == -1) {
                    class373.field5046[var4] = -1;
                    class120.field2025[var4] = -1;
                    class3.field40[var4] = -1;
                    class454.field6186[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class91.field1386.length; var6++) {
            class91.field1386[var6] = -1;
            class373.field5046[var6] = -1;
            class120.field2025[var6] = -1;
            class3.field40[var6] = -1;
            class454.field6186[var6] = -1;
        }
        byte var7;
        if (class32.field525 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class659.method3691(var7, var2, 512, var1, arg0);
    }
}
