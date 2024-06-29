import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class217 extends class317 {

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    private int field3102 = 10;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    private int field3107 = 0;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    private int field3105 = 2048;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3106 = "Loaded interfaces";

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3104 = 0;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "Lkm;")
    public static class133 field3110;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "[I")
    public static int[] field3099;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "[I")
    private int[] field3100;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "[I")
    private int[] field3113;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lcg;II)V", line = 15)
    public final void method60(class316 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3102 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field3105 = arg0.method2220((byte) 110);
        } else if (arg2 == 2) {
            this.field3107 = arg0.method2219(16448);
        }
        field3109++;
        int var5 = -115 / ((-arg1 - 17) / 40);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[I", line = 49)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            field3106 = (String) null;
        }
        field3101++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -54);
        if (this.field4847.field2751) {
            int var4 = class51.field693[arg1];
            if (this.field3107 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3102; var6++) {
                    if (var4 >= this.field3100[var6] && var4 < this.field3100[var6 + 1]) {
                        if (var4 < this.field3113[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class281.method1944(var3, 0, class326.field4933, var5);
            } else {
                for (int var7 = 0; var7 < class326.field4933; var7++) {
                    short var8 = 0;
                    int var9 = class99.field1360[var7];
                    int var10 = 0;
                    int var11 = this.field3107;
                    if (var11 == 1) {
                        var10 = var9;
                    } else if (var11 == 2) {
                        var10 = (var4 + var9 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var10 = (var9 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field3102; var12++) {
                        if (this.field3100[var12] <= var10 && this.field3100[var12 + 1] > var10) {
                            if (var10 < this.field3113[var12]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var8;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)V", line = 168)
    public static void method1500(byte arg0) {
        field3110 = null;
        field3106 = null;
        field3099 = null;
        if (arg0 != 107) {
            method1500((byte) -46);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 184)
    private final void method1501(boolean arg0) {
        this.field3113 = new int[this.field3102 + 1];
        this.field3100 = new int[this.field3102 + 1];
        field3111++;
        int var2 = 4096 / this.field3102;
        int var3 = this.field3105 * var2 >> 12;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3102; var5++) {
            this.field3100[var5] = var4;
            this.field3113[var5] = var3 + var4;
            var4 += var2;
        }
        if (!arg0) {
            this.field3113 = (int[]) null;
        }
        this.field3100[this.field3102] = 4096;
        this.field3113[this.field3102] = this.field3113[0] + 4096;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 219)
    public final void method546(int arg0) {
        if (arg0 != -21522) {
            this.field3105 = 15;
        }
        this.method1501(true);
        field3112++;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 232)
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkm;B)V", line = 250)
    public static final void method1502(class133 arg0, byte arg1) {
        class266.field3876 = arg0;
        if (arg1 < 29) {
            method1502((class133) null, (byte) -92);
        }
        field3103++;
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)V", line = 261)
    public static final void method1503(byte arg0) {
        class90.method690(5, (byte) -76);
        class143.method1036(5, -181413792);
        class337.method2335(5, (byte) 97);
        field3108++;
        class211.method1483(-19676, 5);
        class314.method2143(5, 32063);
        class289.method1981(109, 5);
        class42.method259(5, -125);
        class125.method910(5, (byte) 123);
        class109.method800(0, 5);
        class290.method1988(5, (byte) -34);
        class309.method2123(true, 5);
        class318.method2232(5, 10);
        class173.method1210(5, -126);
        class124.method895(8, 5);
        class287.method1975(false, 5);
        class312.method2136(88, 5);
        class163.method1174(5, (byte) -97);
        class218.method1506(-68, 50);
        if (arg0 < -72) {
            class100.method733(5, 0);
            class185.method1300(5, (byte) 117);
            class16.field196.method720(5, 1088);
            class140.field1918.method720(5, 1088);
        }
    }
}
