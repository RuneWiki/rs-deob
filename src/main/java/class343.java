import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class343 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[Lnj;")
    public static class204[] field5325 = new class204[29];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
    public static int[] field5324 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field5329 = 0;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field5330 = 0;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field5333 = 0;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5335 = null;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 17)
    public static final boolean method2377(String arg0, byte arg1) {
        int var2 = 62 / ((23 - arg1) / 38);
        field5332++;
        return class71.method545(10, (byte) 119, true, arg0);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 33)
    public static final void method2378(byte arg0) {
        field5331++;
        try {
            if (arg0 > -46) {
                return;
            }
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class318.field4807 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 60)
    public static final void method2379(int arg0) {
        class41.field787.method1884(-22054);
        if (arg0 != 26407) {
            method2377((String) null, (byte) 66);
        }
        field5326++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 84)
    public static void method2380(int arg0) {
        int var1 = 82 / ((11 - arg0) / 46);
        field5324 = null;
        field5325 = null;
        field5335 = null;
    }
}
