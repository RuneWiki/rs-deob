import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class229 extends class163 {

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lke;")
    public class256 field3927;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lke;")
    public static class256 field3922 = class316.method2202("; Max)2Age=", 27626);

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lke;")
    public static class256 field3925 = class316.method2202("::pcachesize", 27626);

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lke;")
    public static class256 field3924 = class316.method2202("blinken3:", 27626);

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Lke;")
    public static class256 field3929 = class316.method2202("Nehmen", 27626);

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[I")
    public static int[] field3930 = new int[32];

    @OriginalMember(owner = "client!md", name = "A", descriptor = "[Lvk;")
    public static class150[] field3931 = new class150[6];

    @OriginalMember(owner = "client!md", name = "x", descriptor = "[J")
    public static long[] field3928 = new long[32];

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 6)
    public static final void method1559(int arg0) {
        field3926++;
        if (class137.field2390 == 5) {
            class137.field2390 = 6;
            if (arg0 != -30412) {
                method1560(18, -71, 45);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)J", line = 21)
    public static final long method1560(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4641; var4++) {
            class269 var5 = var3.field4624[var4];
            if ((var5.field4601 >> 29 & 0x3L) == 2L && var5.field4594 == arg1 && var5.field4587 == arg2) {
                return var5.field4601;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 42)
    public static void method1561(int arg0) {
        if (arg0 != 128) {
            method1562((class67) null, -34, 76);
        }
        field3929 = null;
        field3928 = null;
        field3922 = null;
        field3925 = null;
        field3931 = null;
        field3930 = null;
        field3924 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lgg;II)V", line = 64)
    public static final void method1562(class67 arg0, int arg1, int arg2) {
        field3923++;
        if (arg0.field1212 > class45.field840) {
            class76.method576(-56, arg0);
        } else if (arg0.field1216 >= class45.field840) {
            class234.method1584(true, arg0);
        } else {
            class282.method1976(arg0, 0);
        }
        if (arg0.field1192 < 128 || arg0.field1197 < 128 || arg0.field1192 >= 13184 || arg0.field1197 >= 13184) {
            arg0.field1212 = 0;
            arg0.field1253 = -1;
            arg0.field1202 = -1;
            arg0.field1216 = 0;
            arg0.field1192 = arg0.field1215[0] * 128 + (arg0.method515(5373952) * 64);
            arg0.field1197 = arg0.field1254[0] * 128 + (arg0.method515(arg2 ^ 0x520040) * 64);
            arg0.method517((byte) -89);
        }
        if (arg2 != 64) {
            method1562((class67) null, -22, -108);
        }
        if (class121.field2124 == arg0 && (arg0.field1192 < 1536 || arg0.field1197 < 1536 || arg0.field1192 >= 11776 || arg0.field1197 >= 11776)) {
            arg0.field1212 = 0;
            arg0.field1253 = -1;
            arg0.field1202 = -1;
            arg0.field1216 = 0;
            arg0.field1192 = arg0.field1215[0] * 128 + (arg0.method515(arg2 + 5373888) * 64);
            arg0.field1197 = arg0.field1254[0] * 128 + arg0.method515(5373952) * 64;
            arg0.method517((byte) -85);
        }
        class54.method434(1, arg0);
        class86.method628(-1, arg0);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 154)
    public class229() {
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lke;I)V", line = 156)
    public class229(class256 arg0, int arg1) {
        this.field3927 = arg0;
    }
}
