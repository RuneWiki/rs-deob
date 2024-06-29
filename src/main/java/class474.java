import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class474 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
    private int[] field6974;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field6982 = 0;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6980 = new String[200];

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "S")
    public static short field6977 = 32767;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6983 = "";

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field6986 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6988++;
        if (arg0 < 97 || arg7 < 1 || arg5 < 1 || arg7 > (class30.field323 - 2) || arg5 > class182.field2661 - 2) {
            return;
        }
        int var9 = arg1;
        if (arg1 < 3 && class57.method347(arg5, arg7, true)) {
            var9 = arg1 + 1;
        }
        if (!class426.field6401.method2532(1, class170.field2529) && !class495.method2971(arg5, 1, class271.field3942, var9, arg7)) {
            return;
        }
        if (class108.field1553 == null) {
            return;
        }
        class489.field7212.method1963(-2, arg1, arg4, arg5, arg7, class434.field6500[arg1], class348.field5015);
        if (arg6 < 0) {
            return;
        }
        boolean var10 = class426.field6401.field993;
        class426.field6401.field993 = true;
        class489.field7212.method1966(arg3, arg1, arg7, class348.field5015, arg6, class434.field6500[arg1], arg5, arg2, arg8, 653377575, var9);
        class426.field6401.field993 = var10;
        return;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIZIZ)Lic;")
    public static final class491 method2830(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field6975++;
        if (arg2) {
            return null;
        }
        class135 var5 = null;
        if (class23.field252 != null) {
            var5 = new class135(arg3, class23.field252, class118.field1786[arg3], 1000000);
        }
        class326.field4650[arg3] = class386.field5853.method374(arg3, 1, class289.field4159, var5);
        if (arg4) {
            class326.field4650[arg3].method1979(-21202);
        }
        return new class491(class326.field4650[arg3], arg0, arg1);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method2831(boolean arg0) {
        field6980 = null;
        field6983 = null;
        if (!arg0) {
            field6980 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([I)V")
    public class474(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field6974 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field6974[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field6974[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field6974[var5 + var5] = arg0[var4];
            this.field6974[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)V")
    public static final void method2832(boolean arg0, int arg1, int arg2) {
        field6981++;
        class138 var3 = class307.method1936((byte) 68, arg0, arg2);
        if (var3 != null) {
            for (int var4 = arg1; var4 < var3.field2079.length; var4++) {
                var3.field2079[var4] = -1;
                var3.field2081[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method2833(int arg0, int[] arg1) {
        field6979++;
        StringBuffer var2 = new StringBuffer();
        if (arg0 != -1) {
            method2833(-115, null);
        }
        int var3 = class502.field7367;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class343 var5 = class140.field2104.method665(14, arg1[var4]);
            if (var5.field4965 != -1) {
                class529 var6 = (class529) class264.field3860.method1536((long) var5.field4965, 0);
                if (var6 == null) {
                    class408 var7 = class408.method2459(class6.field81, var5.field4965, 0);
                    if (var7 != null) {
                        var6 = class348.field5015.method1030(var7, true);
                        class264.field3860.method1542(var6, (byte) 112, (long) var5.field4965);
                    }
                }
                if (var6 != null) {
                    class337.field4733[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIII)I")
    public static final int method2834(boolean arg0, int arg1, int arg2, int arg3) {
        field6987++;
        int var4 = arg3 & 0x3;
        if (arg0) {
            method2830(true, -71, true, -3, false);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method2835(byte arg0) {
        field6985++;
        int var1 = -27 % ((1 - arg0) / 39);
        class471.field6948 = class39.method236(8, 2048, (byte) 123, 4, 8, true, 35, 0.4F);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
    public final int method2836(int arg0, int arg1) {
        if (arg1 < 99) {
            field6986 = 88;
        }
        field6976++;
        int var3 = (this.field6974.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field6974[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field6974[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
    public static final void method2837(boolean arg0) {
        field6978++;
        class296[] var1 = class350.field5373;
        synchronized (class350.field5373) {
            for (int var2 = 0; var2 < class350.field5373.length; var2++) {
                class350.field5373[var2] = new class296();
                class308.field4435[var2] = 0;
            }
            if (!arg0) {
                field6980 = null;
            }
        }
    }
}
