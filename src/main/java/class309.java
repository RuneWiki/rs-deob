import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class309 extends class16 {

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    private int field4828 = -1;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field4823 = new String[1000];

    @OriginalMember(owner = "client!te", name = "T", descriptor = "Z")
    public static volatile boolean field4825 = false;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "[I")
    public static int[] field4837 = new int[32];

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field4831 = "Loading...";

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "[I")
    private int[] field4830;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V", line = 5)
    public static final void method2161(int arg0, int[] arg1, Object[] arg2) {
        field4829++;
        class93.method676(arg0, arg1, arg1.length - 1, arg0 + 2, arg2);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[[I", line = 15)
    public final int[][] method54(int arg0, byte arg1) {
        int[][] var3 = this.field197.method715(true, arg0);
        int var4 = -83 % ((40 - arg1) / 41);
        field4835++;
        if (this.field197.field1548 && this.method2165(-1)) {
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int var7 = this.field4836 * (class294.field4619 == this.field4827 ? arg0 : this.field4827 * arg0 / class294.field4619);
            int[] var8 = var3[1];
            if (class276.field4376 == this.field4836) {
                for (int var12 = 0; var12 < class276.field4376; var12++) {
                    int var13 = this.field4830[var7++];
                    var5[var12] = class200.method1465(4080, var13 << 4);
                    var8[var12] = class200.method1465(var13, 65280) >> 4;
                    var6[var12] = class200.method1465(16711680, var13) >> 12;
                }
            } else {
                for (int var9 = 0; var9 < class276.field4376; var9++) {
                    int var10 = this.field4836 * var9 / class276.field4376;
                    int var11 = this.field4830[var7 + var10];
                    var5[var9] = class200.method1465(var11 << 4, 4080);
                    var8[var9] = class200.method1465(var11 >> 4, 4080);
                    var6[var9] = class200.method1465(var11 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V", line = 88)
    public final void method68(int arg0) {
        super.method68(arg0);
        field4826++;
        this.field4830 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)I", line = 97)
    public static final int method2162(int arg0, int arg1, int arg2, int arg3) {
        field4838++;
        if (arg1 != -29962) {
            method2163(2, 5);
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I", line = 119)
    public static final int method2163(int arg0, int arg1) {
        field4832++;
        if (arg1 != -13013) {
            field4831 = (String) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 130)
    public class309() {
        super(0, false);
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V", line = 144)
    public static void method2164(byte arg0) {
        int var1 = -16 / ((arg0 + 54) / 51);
        field4837 = null;
        field4831 = null;
        field4823 = null;
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)Z", line = 160)
    private final boolean method2165(int arg0) {
        field4833++;
        if (this.field4830 != null) {
            return true;
        } else if (arg0 >= ~this.field4828) {
            int var2 = class276.field4376;
            int var3 = class294.field4619;
            int var4 = class276.field4375.method60(this.field4828, (byte) -86).field30 ? 64 : 128;
            this.field4830 = class276.field4375.method61(var4, false, (byte) 38, 1.0F, var4, this.field4828);
            this.field4827 = var4;
            this.field4836 = var4;
            class93.method670((byte) 127, var3, var2);
            return this.field4830 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)I", line = 199)
    public final int method113(int arg0) {
        if (arg0 != -9079) {
            method2162(7, -40, -116, 83);
        }
        field4834++;
        return this.field4828;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLim;I)V", line = 210)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field4824++;
        if (arg0 != -7) {
            field4837 = (int[]) null;
        }
        if (arg2 == 0) {
            this.field4828 = arg1.method1396(-59);
        }
    }
}
