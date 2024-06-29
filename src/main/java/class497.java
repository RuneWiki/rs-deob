import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class497 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    private int field7061 = -1;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field7066 = new String[0];

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
    private boolean field7064 = false;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    private int field7060;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lhe;")
    public static class372 field7067 = new class372(64);

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field7071 = 1;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field7073 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V", line = 8)
    private final void method2955(int arg0, boolean arg1) {
        field7057++;
        String[] var3 = new String[this.method2962(arg0, 14636)];
        class319.method2017(this.field7066, 0, var3, 0, this.field7066.length);
        if (!arg1) {
            this.field7066 = var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 26)
    private final void method2956(int arg0, byte arg1, String arg2) {
        if (arg0 > this.field7061) {
            this.field7061 = arg0;
        }
        field7069++;
        if (arg0 >= this.field7066.length) {
            this.method2955(arg0, false);
        }
        this.field7066[arg0] = arg2;
        if (arg1 != -86) {
            field7071 = -44;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 50)
    public final String[] method2957(int arg0) {
        field7070++;
        String[] var2 = new String[this.field7061 + 1];
        if (arg0 < 8) {
            this.field7060 = -107;
        }
        class319.method2017(this.field7066, 0, var2, 0, this.field7061 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IZ)V", line = 237)
    public class497(int arg0, boolean arg1) {
        this.field7064 = arg1;
        this.field7060 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 71)
    public static final void method2958(byte arg0) {
        field7068++;
        if (class245.method1633(class87.field1246, 695) || class245.method1631(-10, class87.field1246)) {
            class37.method187(class460.field6783 >> 12, class364.field5254 >> 12, 5000, true);
        } else {
            int var1 = class130.field1749.field6133[0] >> 3;
            int var2 = class130.field1749.field6139[0] >> 3;
            if (var1 >= 0 && (class194.field2946 >> 3) > var1 && var2 >= 0 && var2 < (class255.field3656 >> 3)) {
                class37.method187(var2, var1, 5000, true);
            } else {
                class37.method187(class255.field3656 >> 4, class194.field2946 >> 4, 0, true);
            }
        }
        class600.method3489((byte) 113);
        class170.method1229((byte) -102);
        class285.method1823(0);
        class290.method1850(-104);
        if (arg0 > -78) {
            method2960((byte) -6, null, -67, -88);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;)V", line = 100)
    public final void method2959(int arg0, String arg1) {
        this.method2956(this.field7061 - arg0, (byte) -86, arg1);
        field7065++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLbs;II)V", line = 110)
    public static final void method2960(byte arg0, class689 arg1, int arg2, int arg3) {
        field7063++;
        int[] var4 = new int[4];
        int var5 = -6 / ((arg0 - 52) / 36);
        class319.method2021(var4, 0, var4.length, arg2);
        class528.method3084(arg1, arg3, var4, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 123)
    public static void method2961(boolean arg0) {
        if (arg0) {
            field7067 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I", line = 140)
    private final int method2962(int arg0, int arg1) {
        field7058++;
        if (arg1 != 14636) {
            method2963(-106, 26, (byte) 17, 60, -13);
        }
        int var3 = this.field7066.length;
        while (var3 <= arg0) {
            if (!this.field7064) {
                var3 += this.field7060;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field7060 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIBII)V", line = 170)
    public static final void method2963(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7062++;
        if (class22.field234 != 1) {
            return;
        }
        int var5 = arg4 / class634.field8902;
        int var6 = arg1 / class634.field8902;
        int var7 = arg3 / class437.field6477;
        int var8 = arg0 / class437.field6477;
        if (class73.field1021 <= var5 || var6 < 0 || var7 >= class627.field8770 || var8 < 0) {
            return;
        }
        if (class627.field8770 <= var8) {
            var8 = class627.field8770 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = 110 % ((-arg2 - 58) / 32);
        if (class73.field1021 <= var6) {
            var6 = class73.field1021 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        for (int var10 = var7; var10 <= var8; var10++) {
            int var11 = class291.method1859(class627.field8770, (byte) -97, var10 + class386.field5833) * class73.field1021;
            for (int var12 = var5; var12 <= var6; var12++) {
                int var13 = var11 + class291.method1859(class73.field1021, (byte) -97, class672.field9372 + var12);
                class564.field8028[var13] = class271.field3871;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "toString", descriptor = "()Ljava/lang/String;", line = 248)
    public final String toString() {
        field7059++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field7061; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field7066[var2]);
        }
        var1.append("]");
        return var1.toString();
    }
}
