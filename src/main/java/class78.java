import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class78 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[I")
    private int[] field1240;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1242 = new String[100];

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1243 = "Prepared sound engine";

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1238 = "flash3:";

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1241 = -1;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "[I")
    public static int[] field1244;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
    public static final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class11.field145 != arg0 && arg1 != 0 && class195.field3109 < 50 && arg2 != -1) {
            class71.field1031[class195.field3109] = arg2;
            class275.field4553[class195.field3109] = arg1;
            class166.field2608[class195.field3109] = arg3;
            class276.field4575[class195.field3109] = null;
            class307.field4996[class195.field3109] = 0;
            class105.field1575[class195.field3109] = arg4;
            class195.field3109++;
        }
        field1236++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I")
    public final int method521(byte arg0, int arg1) {
        field1237++;
        if (arg0 != 81) {
            field1241 = 29;
        }
        int var3 = (this.field1240.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field1240[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1240[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        field1242 = null;
        if (arg0 < 89) {
            method523(-15);
        }
        field1238 = null;
        field1243 = null;
        field1244 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "([I)V")
    public class78(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field1240 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1240[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1240[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field1240[var5 + var5] = arg0[var4];
            this.field1240[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static final void method523(int arg0) {
        field1239++;
        class82.method555(class132.field2028, 125);
        if (arg0 != -1) {
            method523(-93);
        }
        byte var1 = 0;
        int var2 = (class254.field4063 >> 3) + (class174.field2724 >> 10);
        int var3 = (class53.field715 >> 10) + (class101.field1517 >> 3);
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class18.field245 = new int[var6];
        class287.field4779 = new int[var6][4];
        class7.field56 = new byte[var6][];
        class127.field1966 = new int[var6];
        class298.field4908 = new int[var6];
        class53.field718 = new int[var6];
        class225.field3574 = new byte[var6][];
        class214.field3426 = new int[var6];
        class242.field3841 = new byte[var6][];
        class173.field2688 = new int[var6];
        int var7 = 0;
        for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class53.field718[var7] = var11;
                class173.field2688[var7] = class145.field2296.method1895("m" + var8 + "_" + var10, false);
                class18.field245[var7] = class145.field2296.method1895("l" + var8 + "_" + var10, false);
                class298.field4908[var7] = class145.field2296.method1895("n" + var8 + "_" + var10, false);
                class214.field3426[var7] = class145.field2296.method1895("um" + var8 + "_" + var10, false);
                class127.field1966[var7] = class145.field2296.method1895("ul" + var8 + "_" + var10, false);
                if (class298.field4908[var7] == -1) {
                    class173.field2688[var7] = -1;
                    class18.field245[var7] = -1;
                    class214.field3426[var7] = -1;
                    class127.field1966[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class298.field4908.length; var9++) {
            class298.field4908[var9] = -1;
            class173.field2688[var9] = -1;
            class18.field245[var9] = -1;
            class214.field3426[var9] = -1;
            class127.field1966[var9] = -1;
        }
        class216.method1511(var4, var1, var5, (byte) -58, var3, var2, false, true);
    }
}
