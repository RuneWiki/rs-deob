import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class378 {

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "Z")
    public static boolean field5160 = true;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "Z")
    public static boolean field5158 = false;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "[[Lir;")
    public static class28[][] field5161;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
    public static final void method2304(int arg0) {
        field5157++;
        class215.field3195 = 0;
        boolean var1 = class262.field3679.method793((byte) 34) == 1;
        int var2 = class262.field3679.method784((byte) -107);
        if (arg0 >= -53) {
            method2306((byte) -52, 25, -75, 85, -57);
        }
        int var3 = class262.field3679.method755(true);
        int var4 = class262.field3679.method763(86);
        class744.method4130((byte) 22);
        class535.method3035((byte) 106, var3);
        int var5 = (class11.field179 - class262.field3679.field1442) / 16;
        class82.field1135 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class82.field1135[var6][var10] = class262.field3679.method773(3);
            }
        }
        class537.field7299 = new int[var5];
        class120.field2189 = null;
        class1.field15 = new byte[var5][];
        class532.field7197 = null;
        class783.field10755 = new byte[var5][];
        class444.field6024 = new byte[var5][];
        class286.field3935 = new byte[var5][];
        class79.field1114 = new int[var5];
        class320.field4373 = new int[var5];
        class450.field6173 = new int[var5];
        class201.field3055 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class483.field6515 >> 4)) / 8; var8 <= (((class483.field6515 >> 4) + var2) / 8); var8++) {
            for (int var9 = (var4 - (class65.field926 >> 4)) / 8; var9 <= (((class65.field926 >> 4) + var4) / 8); var9++) {
                class201.field3055[var7] = (var8 << 8) + var9;
                class79.field1114[var7] = class193.field2947.method3738(-1, "m" + var8 + "_" + var9);
                class320.field4373[var7] = class193.field2947.method3738(-1, "l" + var8 + "_" + var9);
                class450.field6173[var7] = class193.field2947.method3738(-1, "um" + var8 + "_" + var9);
                class537.field7299[var7] = class193.field2947.method3738(-1, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class465.method2683(-44, 11, var2, var1, var4);
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
    public static void method2305(int arg0) {
        field5161 = null;
        if (arg0 != 7641) {
            method2305(24);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BIIII)I")
    public static final int method2306(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5159++;
        if (arg0 <= 21) {
            return 2;
        } else {
            int var5 = arg4 & 0xF;
            int var6 = var5 < 8 ? arg3 : arg1;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg2) : arg1;
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        }
    }
}
