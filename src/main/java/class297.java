import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class297 extends class199 {

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    private int field4312 = 4;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    private int field4317 = 4;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field4304 = -1;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field4308 = -1;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field4310 = "Hidden";

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "Z")
    public static boolean field4314 = false;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field4315 = -1;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "[J")
    public static long[] field4311 = new long[100];

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "Lfh;")
    public static class140 field4306;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2029(boolean arg0) {
        field4310 = null;
        if (arg0) {
            method2030((class213) null, (byte) 83, (class213) null);
        }
        field4306 = null;
        field4311 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Llh;BLlh;)V", line = 29)
    public static final void method2030(class213 arg0, byte arg1, class213 arg2) {
        if (arg2.field3007 != null) {
            arg2.method1556(255);
        }
        arg2.field3012 = arg0.field3012;
        field4313++;
        arg2.field3007 = arg0;
        arg2.field3007.field3012 = arg2;
        int var3 = 58 / ((arg1 - 28) / 51);
        arg2.field3012.field3007 = arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V", line = 49)
    public static final void method2031(boolean arg0, byte arg1) {
        field4316++;
        if (arg0 != class166.field2324) {
            class166.field2324 = arg0;
            class330.method2286(256);
            int var2 = -76 % ((arg1 - 74) / 40);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLfd;I)V", line = 67)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field4309++;
        if (arg2 == 0) {
            this.field4312 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field4317 = arg1.method2096((byte) -122);
        }
        if (arg0 != -43) {
            method2031(true, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 100)
    public class297() {
        super(1, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I", line = 106)
    public final int[] method190(int arg0, int arg1) {
        if (arg0 != -1735) {
            field4311 = (long[]) null;
        }
        field4307++;
        int[] var3 = this.field2802.method2502(arg1, arg0 ^ 0xFFFFF951);
        if (this.field2802.field5637) {
            int var4 = class95.field1235 / this.field4312;
            int var5 = class224.field3233 / this.field4317;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1467(-7764, class224.field3233 * var6 / var5, 0);
            } else {
                var7 = this.method1467(-7764, 0, 0);
            }
            for (int var8 = 0; var8 < class95.field1235; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class95.field1235 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[[I", line = 165)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            method2030((class213) null, (byte) 34, (class213) null);
        }
        field4305++;
        int[][] var3 = this.field2796.method2187(arg0, -117);
        if (this.field2796.field4667) {
            int var4 = class95.field1235 / this.field4312;
            int var5 = class224.field3233 / this.field4317;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1459(0, class224.field3233 * var6 / var5, (byte) -51);
            } else {
                var7 = this.method1459(0, 0, (byte) -51);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class95.field1235; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class95.field1235 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }
}
