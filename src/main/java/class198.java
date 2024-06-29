import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class198 {

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "J")
    public long field3184 = 0L;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
    public static boolean field3178 = true;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[Lbe;")
    public static class92[] field3179 = new class92[27];

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lok;")
    public static class41 field3183 = class137.method956("1", 45);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lth;")
    public class126 field3176;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lth;")
    public class126 field3177;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 15)
    public static void method1409(int arg0) {
        field3183 = null;
        if (arg0 != -1) {
            method1409(21);
        }
        field3179 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 48)
    public static final void method1410(byte arg0) {
        field3180++;
        int var1 = (class88.field1300 >> 3) + (class235.field3779 >> 10);
        int var2 = (class55.field809 >> 3) + (class251.field3990 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class124.field1840 = new byte[var5][];
        class110.field1557 = new int[var5];
        class62.field902 = new byte[var5][];
        class77.field1143 = new int[var5];
        class314.field5297 = new int[var5];
        class60.field887 = new byte[var5][];
        byte var6 = 8;
        class125.field1862 = new int[var5];
        class203.field3279 = new int[var5];
        class160.field2538 = new int[var5];
        class51.field778 = new int[var5][4];
        class158.field2482 = new byte[var5][];
        class14.field187 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class110.field1557[var7] = var10;
                class314.field5297[var7] = class245.field3938.method476(class187.method1346(new class41[] { class221.field3527, class1.method4(var8, (byte) 101), class284.field4616, class1.method4(var9, (byte) 26) }, 0), (byte) -83);
                class160.field2538[var7] = class245.field3938.method476(class187.method1346(new class41[] { class26.field373, class1.method4(var8, (byte) 97), class284.field4616, class1.method4(var9, (byte) 26) }, 0), (byte) -40);
                class77.field1143[var7] = class245.field3938.method476(class187.method1346(new class41[] { class41.field661, class1.method4(var8, (byte) 23), class284.field4616, class1.method4(var9, (byte) 119) }, 0), (byte) 127);
                class125.field1862[var7] = class245.field3938.method476(class187.method1346(new class41[] { class264.field4180, class1.method4(var8, (byte) 105), class284.field4616, class1.method4(var9, (byte) 14) }, 0), (byte) 122);
                class203.field3279[var7] = class245.field3938.method476(class187.method1346(new class41[] { class119.field1755, class1.method4(var8, (byte) 29), class284.field4616, class1.method4(var9, (byte) 102) }, 0), (byte) 1);
                if (class77.field1143[var7] == -1) {
                    class314.field5297[var7] = -1;
                    class160.field2538[var7] = -1;
                    class125.field1862[var7] = -1;
                    class203.field3279[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class77.field1143.length; var11++) {
            class77.field1143[var11] = -1;
            class314.field5297[var11] = -1;
            class160.field2538[var11] = -1;
            class125.field1862[var11] = -1;
            class203.field3279[var11] = -1;
        }
        int var12 = -115 % ((arg0 + 49) / 45);
        class272.method1924(var2, var3, var4, (byte) -124, true, var6, var1);
    }
}
