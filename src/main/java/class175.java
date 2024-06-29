import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class175 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[Lwo;")
    public static class407[] field2574 = new class407[6];

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[[I")
    public static int[][] field2579 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[B")
    public static final byte[] method1202(int arg0, int arg1) {
        if (arg0 != 255) {
            return null;
        }
        field2577++;
        class189 var2 = (class189) class525.field7308.method3286(-91, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class407.method2472(97, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class189(var3);
            class525.field7308.method3287(0, (long) arg1, var2);
        }
        return var2.field2718;
    }

    @OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2576++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1203(int arg0, String arg1) {
        field2573++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class596.method3403(arg1, -105);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class511.field7081; var3++) {
            String var4 = class290.field4198[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class596.method3403(var4, -84);
            if (var5 != null && var5.equals(var2)) {
                class511.field7081--;
                for (int var6 = var3; var6 < class511.field7081; var6++) {
                    class290.field4198[var6] = class290.field4198[var6 + 1];
                    class97.field1699[var6] = class97.field1699[var6 + 1];
                    class293.field4223[var6] = class293.field4223[var6 + 1];
                    class240.field3494[var6] = class240.field3494[var6 + 1];
                    class536.field7484[var6] = class536.field7484[var6 + 1];
                }
                class190.field2720++;
                class137.field2179 = class498.field6986;
                class624.method3537(-80, class46.field642);
                class127.field2088.method1710(class51.method441((byte) -91, arg1), 74);
                class127.field2088.method1726((byte) -52, arg1);
                break;
            }
        }
        int var7 = 55 / ((77 - arg0) / 33);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLpb;II)V")
    public static final void method1204(byte arg0, class366 arg1, int arg2, int arg3) {
        if (arg0 != 56) {
            method1203(88, null);
        }
        class584.field8319[arg2][arg3] = arg1;
        field2575++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
    public static final void method1205(String arg0, int arg1, int arg2, String arg3, int arg4, String arg5) {
        field2578++;
        class150.method1076(arg3, 99, arg1, null, arg0, arg4, arg5, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2574 = null;
        if (arg0 == 258) {
            field2579 = null;
        }
    }
}
