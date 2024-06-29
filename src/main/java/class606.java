import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class606 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[[I")
    public static int[][] field8552 = new int[6][];

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljt;")
    public static class106 field8553 = new class106(30);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lada;")
    public static class164 field8555 = new class164();

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "D")
    public static double field8556;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    public static int[] field8557;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method3516(int arg0) {
        field8557 = null;
        field8552 = null;
        field8553 = null;
        field8555 = null;
        if (arg0 != 8) {
            field8552 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static final void method3517(boolean arg0) {
        field8554++;
        class389.method2499((byte) -3, class63.field916.field10198.method2966(17503));
        int var1 = (class364.field5254 >> 12) + (class361.field5224 >> 3);
        class341.field4946 = class130.field1749.field8429 = 0;
        int var2 = (class460.field6783 >> 12) + (class582.field8288 >> 3);
        class130.field1749.method3915(8, 8, (byte) -28);
        byte var3 = 18;
        class724.field10107 = new int[var3][4];
        class434.field6462 = new int[var3];
        class324.field4628 = new byte[var3][];
        class46.field666 = new byte[var3][];
        class502.field7147 = new byte[var3][];
        class642.field9002 = new int[var3];
        class298.field4233 = new int[var3];
        class146.field1945 = new byte[var3][];
        class446.field6617 = new int[var3];
        class140.field1857 = new byte[var3][];
        field8557 = new int[var3];
        class468.field6842 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class194.field2946 >> 4)) / 8; var5 <= ((var1 + (class194.field2946 >> 4)) / 8); var5++) {
            for (int var8 = (var2 - (class255.field3656 >> 4)) / 8; var8 <= (((class255.field3656 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class434.field6462[var4] = var9;
                class642.field9002[var4] = class111.field1553.method217("m" + var5 + "_" + var8, (byte) -93);
                field8557[var4] = class111.field1553.method217("l" + var5 + "_" + var8, (byte) -93);
                class468.field6842[var4] = class111.field1553.method217("n" + var5 + "_" + var8, (byte) -93);
                class298.field4233[var4] = class111.field1553.method217("um" + var5 + "_" + var8, (byte) -93);
                class446.field6617[var4] = class111.field1553.method217("ul" + var5 + "_" + var8, (byte) -93);
                if (class468.field6842[var4] == -1) {
                    class642.field9002[var4] = -1;
                    field8557[var4] = -1;
                    class298.field4233[var4] = -1;
                    class446.field6617[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class468.field6842.length; var6++) {
            class468.field6842[var6] = -1;
            class642.field9002[var6] = -1;
            field8557[var6] = -1;
            class298.field4233[var6] = -1;
            class446.field6617[var6] = -1;
        }
        byte var7;
        if (class87.field1246 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class756.method4220(arg0, -26510, var1, var2, var7);
    }
}
