import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class55 {

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lwm;")
    public static class152 field865 = class157.method1048(")1 ", 108);

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[Lwm;")
    public static class152[] field864 = new class152[500];

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Z")
    public static boolean field862 = false;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lwm;")
    private static class152 field863 = class157.method1048("Members object", 112);

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lwm;")
    public static class152 field870 = class157.method1048("Verbindung abgebrochen)3", 120);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lwm;")
    public static class152 field860 = field863;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Lwm;")
    private static class152 field872 = class157.method1048("Loaded world list data", 99);

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lwm;")
    public static class152 field869 = field872;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lah;")
    public static class205 field861;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[Leg;")
    public static class300[] field868;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILjava/lang/String;)Lwm;", line = 7)
    public static final class152 method366(int arg0, String arg1) {
        field871++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class152 var4 = new class152();
        var4.field2389 = var2;
        var4.field2371 = 0;
        for (int var5 = arg0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field2371++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)V", line = 63)
    public static final void method367(boolean arg0, int arg1) {
        class268.field4521 = 1000 / arg1;
        field859++;
        if (!arg0) {
            method368(44);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 79)
    public static void method368(int arg0) {
        field860 = null;
        int var1 = -87 / ((-arg0 - 43) / 33);
        field865 = null;
        field864 = null;
        field863 = null;
        field869 = null;
        field861 = null;
        field872 = null;
        field868 = null;
        field870 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V", line = 151)
    public static final void method369(long[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        field867++;
        if (arg3 != 2) {
            field868 = (class300[]) null;
        }
        if (arg2 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var9;
        for (int var10 = arg1; var10 < arg2; var10++) {
            if (arg0[var10] < (long) (var10 & 0x1) + var7) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                Object var13 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var13;
            }
        }
        arg0[arg2] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg2] = arg4[var6];
        arg4[var6] = var9;
        method369(arg0, arg1, var6 - 1, 2, arg4);
        method369(arg0, var6 + 1, arg2, 2, arg4);
    }
}
