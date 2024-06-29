import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class543 {

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    private int field7943 = 0;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    private int field7945 = -1;

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "Lui;")
    private class193 field7952 = new class193();

    @OriginalMember(owner = "client!tda", name = "v", descriptor = "Z")
    public boolean field7962 = false;

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "I")
    private int field7961;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    private int field7949;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "[[[I")
    private int[][][] field7958;

    @OriginalMember(owner = "client!tda", name = "m", descriptor = "[Lkca;")
    private class71[] field7953;

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "Z")
    public static boolean field7955 = false;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "Lrg;")
    public static class548 field7946 = new class548(50, 3);

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!tda", name = "k", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!tda", name = "s", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!tda", name = "t", descriptor = "[[Let;")
    public static class509[][] field7960;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(III)Lwv;", line = 4)
    public static final class31 method3171(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        return var3 == null || var3.field4506 == null ? null : var3.field4506;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IBLav;II)V", line = 11)
    public static final void method3172(int arg0, byte arg1, class545 arg2, int arg3, int arg4) {
        field7956++;
        int var5 = arg2.field6483[0];
        int var6 = arg2.field6491[0];
        if (var5 < 0 || class106.field1289 <= var5 || var6 < 0 || var6 >= class422.field5452 || arg4 < 0 || arg4 >= class106.field1289 || arg0 < 0 || class422.field5452 <= arg0) {
            return;
        }
        if (arg3 >= -100) {
            method3172(-124, (byte) -49, null, -7, 42);
        }
        int var7 = class279.method1591(arg2.method2694(28146), var5, class545.field7996, -4, 0, var6, class309.field3939[arg2.field8660], class602.field8696, arg0, 0, -64, arg4, 0, 0, true);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg2.method3190(class545.field7996[var8], arg1, -109, class602.field8696[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)Z", line = 47)
    public static final boolean method3173(int arg0, int arg1) {
        class567.field8326 = arg0 + 1 & 0xFFFF;
        class523.field7334 = true;
        field7951++;
        if (arg1 < 22) {
            field7955 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIB)Z", line = 62)
    public static final boolean method3174(int arg0, int arg1, byte arg2) {
        field7944++;
        if (arg2 != -46) {
            field7955 = true;
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 75)
    public static final void method3175(String arg0, boolean arg1) {
        if (class330.field4302 == null) {
            class542.method3162(-123);
        }
        field7954++;
        String[] var2 = class220.method1267(arg0, '\n', (byte) -119);
        if (!arg1) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class208.field2500; var4 > 0; var4--) {
                class330.field4302[var4] = class330.field4302[var4 - 1];
            }
            class330.field4302[0] = var2[var3];
            if ((class330.field4302.length - 1) > class208.field2500) {
                class208.field2500++;
                if (class54.field458 > 0) {
                    class54.field458++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)V", line = 118)
    public static void method3176(boolean arg0) {
        field7960 = null;
        if (!arg0) {
            method3179(31);
        }
        field7946 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V", line = 129)
    public static final void method3177(byte arg0) {
        int var1 = 0;
        int var2 = -91 / ((-arg0 - 41) / 43);
        while (class69.field666.length > var1) {
            for (int var3 = 0; var3 < class69.field666[var1].length; var3++) {
                class69.field666[var1][var3] = class290.field3764;
            }
            var1++;
        }
        field7950++;
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(II)[[I", line = 155)
    public final int[][] method3178(int arg0, int arg1) {
        field7948++;
        if (arg1 != 0) {
            this.method3178(-1, -128);
        }
        if (this.field7961 == this.field7949) {
            this.field7962 = this.field7953[arg0] == null;
            this.field7953[arg0] = class564.field8288;
            return this.field7958[arg0];
        } else if (this.field7949 == 1) {
            this.field7962 = this.field7945 != arg0;
            this.field7945 = arg0;
            return this.field7958[0];
        } else {
            class71 var3 = this.field7953[arg0];
            if (var3 == null) {
                this.field7962 = true;
                if (this.field7943 >= this.field7949) {
                    class71 var4 = (class71) this.field7952.method1042(2);
                    var3 = new class71(arg0, var4.field690);
                    this.field7953[var4.field686] = null;
                    var4.method3187(true);
                } else {
                    var3 = new class71(arg0, this.field7943);
                    this.field7943++;
                }
                this.field7953[arg0] = var3;
            } else {
                this.field7962 = false;
            }
            this.field7952.method1053(var3, ~arg1);
            return this.field7958[var3.field690];
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(III)V", line = 446)
    public class543(int arg0, int arg1, int arg2) {
        this.field7961 = arg1;
        this.field7949 = arg0;
        this.field7958 = new int[this.field7949][3][arg2];
        this.field7953 = new class71[this.field7961];
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V", line = 234)
    public static final void method3179(int arg0) {
        field7942++;
        class354[] var1 = class463.field6478;
        synchronized (class463.field6478) {
            for (int var2 = arg0; var2 < class463.field6478.length; var2++) {
                class463.field6478[var2] = new class354();
                class509.field7204[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILjava/lang/String;IIZ)V", line = 262)
    public static final void method3180(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
        field7947++;
        class509 var5 = class369.method2071(arg2, arg3, -20190);
        if (var5 == null) {
            return;
        }
        if (var5.field7176 != null) {
            class503 var6 = new class503();
            var6.field6975 = var5.field7176;
            var6.field6973 = var5;
            var6.field6972 = arg0;
            var6.field6977 = arg1;
            class630.method3608(var6);
        }
        if (!arg4) {
            field7960 = null;
        }
        if (class137.field1671 != 9 || !client.method1412(var5).method1506(arg0 - 1, (byte) -128)) {
            return;
        }
        if (arg0 == 1) {
            class256.field3285++;
            class418.method2378(17984, class303.field3872);
            class62.method361(arg3, 117, arg2, var5.field7082);
        }
        if (arg0 == 2) {
            class119.field1493++;
            class418.method2378(17984, class439.field6080);
            class62.method361(arg3, 118, arg2, var5.field7082);
        }
        if (arg0 == 3) {
            class418.method2378(17984, class174.field2112);
            class181.field2190++;
            class62.method361(arg3, -15, arg2, var5.field7082);
        }
        if (arg0 == 4) {
            class418.method2378(17984, class615.field8915);
            class80.field948++;
            class62.method361(arg3, -44, arg2, var5.field7082);
        }
        if (arg0 == 5) {
            class200.field2403++;
            class418.method2378(17984, class527.field7384);
            class62.method361(arg3, 105, arg2, var5.field7082);
        }
        if (arg0 == 6) {
            class580.field8456++;
            class418.method2378(17984, class562.field8274);
            class62.method361(arg3, 111, arg2, var5.field7082);
        }
        if (arg0 == 7) {
            class388.field5122++;
            class418.method2378(17984, class67.field650);
            class62.method361(arg3, -88, arg2, var5.field7082);
        }
        if (arg0 == 8) {
            class418.method2378(17984, class533.field7494);
            class201.field2415++;
            class62.method361(arg3, 125, arg2, var5.field7082);
        }
        if (arg0 == 9) {
            class289.field3748++;
            class418.method2378(17984, class151.field1808);
            class62.method361(arg3, -20, arg2, var5.field7082);
        }
        if (arg0 == 10) {
            class418.method2378(17984, class147.field1766);
            class219.field2702++;
            class62.method361(arg3, 106, arg2, var5.field7082);
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)[[[I", line = 394)
    public final int[][][] method3181(int arg0) {
        field7957++;
        if (this.field7961 != this.field7949) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field7949; var2++) {
            this.field7953[var2] = class564.field8288;
        }
        if (arg0 != -1) {
            this.field7949 = 114;
        }
        return this.field7958;
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V", line = 421)
    public final void method3182(byte arg0) {
        for (int var2 = 0; var2 < this.field7949; var2++) {
            this.field7958[var2][0] = null;
            this.field7958[var2][1] = null;
            this.field7958[var2][2] = null;
            this.field7958[var2] = null;
        }
        field7941++;
        this.field7953 = null;
        if (arg0 > 105) {
            this.field7958 = null;
            this.field7952.method1048(-7730);
            this.field7952 = null;
        }
    }
}
