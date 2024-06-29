import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class106 extends class55 {

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "Ljava/lang/String;")
    public String field1413;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "Lea;")
    public static class547 field1411 = new class547(20, 7);

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "F")
    public static float field1416;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field1415;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V")
    public static void method719(boolean arg0) {
        field1415 = null;
        field1411 = null;
        if (arg0) {
            field1411 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public static final void method720(int arg0) {
        class361.field4790 = 0;
        field1410++;
        int var1 = class569.field8012.method3419((byte) 104);
        if (arg0 < 4) {
            return;
        }
        int var2 = class569.field8012.method3411(121);
        int var3 = class569.field8012.method3428((byte) 80);
        boolean var4 = class569.field8012.method3435(true) == 1;
        class726.method4073((byte) -65);
        class391.method2273((byte) 8, var3);
        int var5 = (class488.field6682 - class569.field8012.field8520) / 16;
        class252.field3241 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class252.field3241[var6][var10] = class569.field8012.method3418(-2);
            }
        }
        class125.field1628 = null;
        class519.field6991 = new int[var5];
        client.field4115 = new byte[var5][];
        class459.field6343 = new int[var5];
        class354.field4722 = new int[var5];
        class83.field1140 = new byte[var5][];
        class72.field779 = new byte[var5][];
        class459.field6350 = new byte[var5][];
        class585.field8195 = new int[var5];
        class584.field8182 = null;
        class735.field10249 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class272.field3589 >> 4)) / 8; var8 <= ((class272.field3589 >> 4) + var2) / 8; var8++) {
            for (int var9 = (var1 - (class3.field26 >> 4)) / 8; var9 <= ((class3.field26 >> 4) + var1) / 8; var9++) {
                class519.field6991[var7] = (var8 << 8) + var9;
                class354.field4722[var7] = class591.field8248.method2890((byte) -90, "m" + var8 + "_" + var9);
                class585.field8195[var7] = class591.field8248.method2890((byte) -114, "l" + var8 + "_" + var9);
                class735.field10249[var7] = class591.field8248.method2890((byte) -77, "um" + var8 + "_" + var9);
                class459.field6343[var7] = class591.field8248.method2890((byte) -61, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class745.method4160(-6547, var1, var4, var2, 11);
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
    public class106() {
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class106(String arg0, int arg1) {
        this.field1413 = arg0;
    }
}
