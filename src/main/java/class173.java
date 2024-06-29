import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class173 implements class409 {

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "Ltp;")
    private class557 field2452;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "Lcb;")
    private class544 field2446;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "Lcb;")
    private class544 field2447;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2449 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "Ljo;")
    public static class351 field2453 = new class351(89, 8);

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "Lda;")
    private class67 field2451;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZB)V")
    public final void method374(boolean arg0, byte arg1) {
        if (arg0) {
            int var3 = this.field2452.field7910.method2164(class785.field10790, 0, this.field2452.field7906) + this.field2452.field7919;
            int var4 = this.field2452.field7904.method1378((byte) 4, class264.field3734, this.field2452.field7901) + this.field2452.field7905;
            this.field2451.method516(var4, this.field2452.field7901, this.field2452.field7913, 0, 0, this.field2452.field7915, this.field2452.field7906, this.field2452.field7909, this.field2452.field7914, var3, (byte) 89, this.field2452.field7917, null, null, null, this.field2452.field7902);
        }
        if (arg1 != -105) {
            this.method814((byte) -102);
        }
        field2450++;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lwk;III[I[I)Llga;")
    public static final class739 method1304(class151 arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        if (arg2 >= -2) {
            field2453 = null;
        }
        field2445++;
        if (!arg0.method1070(-109, class539.field7574, class770.field10614)) {
            int[] var6 = new int[arg1 * arg3];
            for (int var7 = 0; var7 < arg3; var7++) {
                int var8 = arg1 * var7 + arg4[var7];
                for (int var9 = 0; var9 < arg5[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class739(arg0, arg1, arg3, var6);
        }
        byte[] var10 = new byte[arg1 * arg3];
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = arg1 * var11 + arg4[var11];
            for (int var13 = 0; var13 < arg5[var11]; var13++) {
                var10[var12++] = -1;
            }
        }
        return new class739(arg0, arg1, arg3, var10);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)V")
    public final void method811(boolean arg0) {
        field2444++;
        class263 var2 = class96.method677(this.field2447, this.field2452.field7907, (byte) -125);
        this.field2451 = class638.field8979.method403(var2, class625.method3581(this.field2446, this.field2452.field7907), true);
        if (arg0) {
            this.field2451 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)V")
    public static void method1305(byte arg0) {
        field2453 = null;
        field2449 = null;
        if (arg0 >= -110) {
            method1304(null, -43, 108, 65, null, null);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lcb;Lcb;Ltp;)V")
    public class173(class544 arg0, class544 arg1, class557 arg2) {
        this.field2452 = arg2;
        this.field2446 = arg0;
        this.field2447 = arg1;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        field2448++;
        boolean var2 = true;
        int var3 = 101 % ((-arg0 - 65) / 37);
        if (!this.field2446.method3131(122, this.field2452.field7907)) {
            var2 = false;
        }
        if (!this.field2447.method3131(119, this.field2452.field7907)) {
            var2 = false;
        }
        return var2;
    }
}
