import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class351 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public static int[] field4950 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lma;")
    public static class12 field4952;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Leq;")
    public static class209 field4955;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "[Lkr;")
    public static class743[] field4958;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lha;I)V", line = 3)
    public static final void method2203(class58 arg0, int arg1) {
        field4953++;
        int var2 = -28 / ((-arg1 - 81) / 44);
        if (class510.field7279 != class468.field6748.field649 && class390.field5454 != null && class69.method713(class468.field6748.field649, arg0, 0)) {
            class510.field7279 = class468.field6748.field649;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 27)
    public static final void method2204(int arg0) {
        class748.field10459 = new String[500];
        class160.field2390 = class419.field5896.field4594 + class419.field5896.field4586 + 2;
        field4954++;
        class308.field4359 = class436.field6100.field4594 + class436.field6100.field4586 + 2;
        for (int var1 = 0; var1 < class748.field10459.length; var1++) {
            class748.field10459[var1] = "";
        }
        class569.method3326(class281.field3939.method1839((byte) 45, class744.field10426), (byte) -42);
        if (arg0 != 65536) {
            method2205(null, 29, -16, 123);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;", line = 52)
    public static final String method2205(String[] arg0, int arg1, int arg2, int arg3) {
        field4957++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg3 != 500) {
                field4955 = null;
            }
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 119)
    public static void method2206(int arg0) {
        field4950 = null;
        field4958 = null;
        field4952 = null;
        if (arg0 < 52) {
            field4952 = null;
        }
        field4955 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)I", line = 134)
    public static final int method2207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -23) {
            method2206(66);
        }
        field4956++;
        int var5 = 65536 - class316.field4490[arg4 * 8192 / arg1] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZII)V", line = 148)
    public static final void method2208(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 < 46) {
            return;
        }
        if (class160.field2387.method4203(true, (long) arg3) == null) {
            if (class610.field8828) {
                class236 var4 = new class236(arg3, new class167(4096, class546.field7698, arg3), arg2, arg1);
                var4.field3348.method3314(-2, class415.field5815[class744.field10426]);
                class160.field2387.method4211(var4, (byte) 100, (long) arg3);
            } else {
                class249.method1660(arg1, (byte) 124, arg3);
            }
        }
        field4951++;
    }
}
