import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class173 {

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public int field2391 = 0;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public int field2396 = 0;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Lgw;")
    private class690 field2392 = new class690(64);

    @OriginalMember(owner = "client!os", name = "l", descriptor = "Luk;")
    private class215 field2402 = null;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "Luu;")
    private class237 field2401;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Luu;")
    private class237 field2398;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "[F")
    public static float[] field2399 = new float[2];

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "Lkr;")
    public static class602 field2397 = new class602(53, -2);

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[J")
    public static long[] field2393;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 14)
    public static void method1105(int arg0) {
        field2399 = null;
        if (arg0 != -2) {
            field2400 = -97;
        }
        field2397 = null;
        field2393 = null;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(ILuu;Luu;Luk;)V", line = 110)
    public class173(int arg0, class237 arg1, class237 arg2, class215 arg3) {
        this.field2402 = arg3;
        this.field2401 = arg2;
        this.field2398 = arg1;
        if (this.field2398 != null) {
            this.field2396 = this.field2398.method1597(1, 0);
        }
        if (this.field2401 != null) {
            this.field2391 = this.field2401.method1597(1, 0);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjn;[IJ)Ljava/lang/String;", line = 36)
    public final String method1106(int arg0, class324 arg1, int[] arg2, long arg3) {
        if (arg0 != 0) {
            return null;
        }
        field2394++;
        if (this.field2402 != null) {
            String var6 = this.field2402.method1267(arg2, arg3, (byte) 22, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)Ljb;", line = 61)
    public final class192 method1107(boolean arg0, int arg1) {
        field2395++;
        class192 var3 = (class192) this.field2392.method3898((byte) -42, (long) arg1);
        if (!arg0) {
            method1105(41);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field2401.method1572(1, 0, arg1 & 0x7FFF);
        } else {
            var4 = this.field2398.method1572(1, 0, arg1);
        }
        class192 var5 = new class192();
        var5.field2603 = this;
        if (var4 != null) {
            var5.method1187(new class63(var4), (byte) 121);
        }
        if (arg1 >= 32768) {
            var5.method1192(14);
        }
        this.field2392.method3899(-127, var5, (long) arg1);
        return var5;
    }
}
