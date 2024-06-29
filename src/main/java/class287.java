import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class287 extends RuntimeException {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4913;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Ljava/lang/String;")
    public String field4910;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4911 = 0;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[Ljf;")
    public static class229[] field4917 = new class229[100];

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field4915 = 99;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field4914 = 0;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(JIZIZ)Ljf;", line = 16)
    public static final class229 method2003(long arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field4919++;
        class229 var6 = class4.method19(0, 57);
        if (arg2) {
            method2006(29);
        }
        if (arg0 < 0L) {
            arg0 = -arg0;
            var6.method1652(class112.field1976, -12501);
        }
        class229 var7 = class293.field5018;
        class229 var8 = class260.field4514;
        if (arg3 == 1) {
            var7 = class260.field4514;
            var8 = class293.field5018;
        }
        if (arg3 == 2) {
            var8 = class14.field196;
            var7 = class260.field4514;
        }
        if (arg3 == 3) {
            var8 = class293.field5018;
            var7 = class260.field4514;
        }
        class229 var9 = class4.method19(0, -124);
        class229 var10 = class4.method19(0, -95);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method1652(class84.method607(108, (int) (arg0 % 10L)), -12501);
            arg0 /= 10L;
        }
        if (arg0 == 0L) {
            var9 = class131.field2320;
        }
        int var12 = 0;
        while (arg0 > 0L) {
            if (arg4 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1652(var8, -12501);
            }
            var12++;
            var9.method1652(class84.method607(102, (int) (arg0 % 10L)), -12501);
            arg0 /= 10L;
        }
        if (var10.method1626(15) > 0) {
            var10.method1652(var7, -12501);
        }
        return class142.method989(new class229[] { var6, var9.method1651(0), var10.method1651(0) }, -21);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 99)
    public static final void method2004(byte arg0) {
        field4916++;
        if (arg0 != -31) {
            method2004((byte) 96);
        }
        for (int var1 = 0; var1 < class131.field2313; var1++) {
            int var10002 = class234.field4047[var1]--;
            if (class234.field4047[var1] >= -10) {
                class2 var2 = class245.field4359[var1];
                if (var2 == null) {
                    var2 = class2.method8(class289.field4945, class232.field4039[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class234.field4047[var1] += var2.method5();
                    class245.field4359[var1] = var2;
                }
                if (class234.field4047[var1] < 0) {
                    int var3;
                    if (class226.field3866[var1] == 0) {
                        var3 = class298.field5083;
                    } else {
                        int var4 = class226.field3866[var1] >> 16 & 0xFF;
                        int var5 = (class226.field3866[var1] & 0xFF) * 128;
                        int var6 = class226.field3866[var1] >> 8 & 0xFF;
                        int var7 = var4 * 128 + 64 - class301.field5124.field1983;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 * 128 - (class301.field5124.field2028 - 64);
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var9 > var5) {
                            class234.field4047[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = (var5 - var9) * class31.field531 / var5;
                    }
                    if (var3 > 0) {
                        class316 var10 = var2.method6().method2141(class225.field3845);
                        class178 var11 = class178.method1220(var10, 100, var3);
                        var11.method1224(class47.field857[var1] - 1);
                        class104.field1816.method617(var11);
                    }
                    class234.field4047[var1] = -100;
                }
            } else {
                class131.field2313--;
                for (int var12 = var1; var12 < class131.field2313; var12++) {
                    class232.field4039[var12] = class232.field4039[var12 + 1];
                    class245.field4359[var12] = class245.field4359[var12 + 1];
                    class47.field857[var12] = class47.field857[var12 + 1];
                    class234.field4047[var12] = class234.field4047[var12 + 1];
                    class226.field3866[var12] = class226.field3866[var12 + 1];
                }
                var1--;
            }
        }
        if (class269.field4620 && !class48.method409(-1)) {
            if (class27.field487 != 0 && class232.field4020 != -1) {
                class127.method901(class259.field4506, false, class232.field4020, class27.field487, 0, true);
            }
            class269.field4620 = false;
        } else if (class27.field487 != 0 && class232.field4020 != -1 && !class48.method409(-1)) {
            class29.field507++;
            class84.field1608.method1397(211, 0);
            class84.field1608.method100(class232.field4020, 65280);
            class232.field4020 = -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V", line = 233)
    public static final void method2005(boolean arg0, int arg1) {
        if (arg1 < 116) {
            method2003(68L, 6, false, 74, true);
        }
        class104.method703(false, class78.field1429, arg0, class16.field263, class175.field3046);
        field4918++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 244)
    public static void method2006(int arg0) {
        field4917 = null;
        if (arg0 != 14824) {
            field4914 = -82;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 255)
    public static final void method2007(int arg0) {
        if (arg0 != 11190) {
            method2003(6L, 17, true, 17, true);
        }
        class284.field4866.method226((byte) -114);
        field4912++;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 267)
    public class287(Throwable arg0, String arg1) {
        this.field4913 = arg0;
        this.field4910 = arg1;
    }
}
