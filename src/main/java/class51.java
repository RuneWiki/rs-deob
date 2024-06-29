import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class51 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field684 = 0;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field686 = 0;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIZI)Ljava/lang/String;", line = 6)
    public static final String method355(int arg0, int arg1, boolean arg2, int arg3) {
        field683++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = (char) arg0;
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg1;
                int var9 = var8 - (arg1 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 58)
    public static final void method356(int arg0) {
        class189 var1 = class211.field2822;
        synchronized (class211.field2822) {
            class211.field2822.method1136((byte) -79);
        }
        field688++;
        class189 var2 = class143.field1939;
        synchronized (class143.field1939) {
            class143.field1939.method1136((byte) -122);
        }
        int var3 = 30 % ((-arg0 - 41) / 59);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Leb;I)V", line = 74)
    public static final void method357(class382 arg0, int arg1) {
        arg0.field5548 = null;
        field685++;
        int var2 = arg0.field5543.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field5543[var3].field4802 = false;
        }
        class162[] var4 = class380.field5529;
        synchronized (class380.field5529) {
            if (class380.field5529.length > var2 && class92.field1298[var2] < 200) {
                class380.field5529[var2].method1003(2166, arg0);
                int var10002 = class92.field1298[var2]++;
            }
            if (arg1 != -13504) {
                field684 = 94;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 103)
    public static final String method358(long arg0, byte arg1) {
        field687++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            if (arg1 != 37) {
                return null;
            }
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class262.field3799[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }
}
