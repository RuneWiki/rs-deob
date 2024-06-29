import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class228 extends class624 {

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field2982 = -1;

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "[I")
    public static int[] field2984 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "[B")
    private byte[] field2985;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z")
    public static final boolean method1395(int arg0, int arg1, int arg2) {
        field2980++;
        if (arg1 != 0) {
            field2982 = -26;
        }
        return (arg2 & 0x40000) != 0 | class216.method1336(arg0, arg2, (byte) -56) || class4.method25(-1, arg0, arg2);
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
    public static final void method1396(int arg0) {
        field2979++;
        if (arg0 != 2024967811) {
            return;
        }
        class588.method3286(arg0 - 2024967811, class72.field935.field6529);
        int var1 = (class132.field1679 >> 12) + (class253.field3490 >> 3);
        class432.field5993 = class596.field8164.field3925 = 0;
        int var2 = (class471.field6379 >> 12) + (class186.field2280 >> 3);
        class596.field8164.method2963((byte) -57, 8, 8);
        byte var3 = 18;
        class480.field6461 = new int[var3];
        class552.field7552 = new byte[var3][];
        class448.field6135 = new int[var3];
        class244.field3288 = new int[var3][4];
        class80.field1012 = new int[var3];
        class73.field940 = new byte[var3][];
        class93.field1153 = new byte[var3][];
        class683.field9707 = new int[var3];
        class681.field9677 = new byte[var3][];
        class161.field2043 = new int[var3];
        class339.field4957 = new int[var3];
        class278.field3768 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class588.field8082 >> 4)) / 8; var5 <= (((class588.field8082 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class12.field113 >> 4)) / 8; var8 <= ((var2 + (class12.field113 >> 4)) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class339.field4957[var4] = var9;
                class480.field6461[var4] = class397.field5664.method1090("m" + var5 + "_" + var8, (byte) 43);
                class448.field6135[var4] = class397.field5664.method1090("l" + var5 + "_" + var8, (byte) -105);
                class161.field2043[var4] = class397.field5664.method1090("n" + var5 + "_" + var8, (byte) 65);
                class80.field1012[var4] = class397.field5664.method1090("um" + var5 + "_" + var8, (byte) 63);
                class683.field9707[var4] = class397.field5664.method1090("ul" + var5 + "_" + var8, (byte) 58);
                if (class161.field2043[var4] == -1) {
                    class480.field6461[var4] = -1;
                    class448.field6135[var4] = -1;
                    class80.field1012[var4] = -1;
                    class683.field9707[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class161.field2043.length; var6++) {
            class161.field2043[var6] = -1;
            class480.field6461[var6] = -1;
            class448.field6135[var6] = -1;
            class80.field1012[var6] = -1;
            class683.field9707[var6] = -1;
        }
        byte var7;
        if (class476.field6436 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class286.method1717(false, arg0 ^ 0x874D7107, var2, var7, var1);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
    public class228() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field2984 = null;
        if (arg0 != -18734) {
            field2984 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBB)V")
    public final void method249(int arg0, byte arg1, byte arg2) {
        if (arg1 != 97) {
            return;
        }
        field2981++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2985[var10001] = -1;
        this.field2985[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(IIII)[B")
    public final byte[] method1398(int arg0, int arg1, int arg2, int arg3) {
        this.field2985 = new byte[arg0 * arg3 * arg2 * 2];
        if (arg1 < 19) {
            method1397(0);
        }
        field2983++;
        this.method3645(arg2, arg3, arg0, -23747);
        return this.field2985;
    }
}
