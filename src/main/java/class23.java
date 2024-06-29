import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class23 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Z")
    public boolean field288 = false;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field287 = "purple:";

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field297 = "Connection lost.";

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "J")
    public long field289;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lva;")
    public static class121 field293;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lfe;")
    public class94 field285;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field291;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lvn;", line = 8)
    public static final class7 method172(int arg0, int arg1) {
        field296++;
        class7 var2 = (class7) class172.field2619.method1294((long) arg1, 124);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class266.field4111.method2103(0, 34, arg1);
        if (arg0 <= 64) {
            method172(105, 29);
        }
        class7 var4 = new class7();
        if (var3 != null) {
            var4.method45(new class303(var3), false, arg1);
        }
        class172.field2619.method1292((long) arg1, -100, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 44)
    public static void method173(boolean arg0) {
        field297 = null;
        field291 = null;
        field293 = null;
        if (!arg0) {
            field293 = (class121) null;
        }
        field287 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[Ljava/lang/Object;[J)V", line = 58)
    public static final void method174(int arg0, int arg1, int arg2, Object[] arg3, long[] arg4) {
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            long var6 = arg4[var5];
            arg4[var5] = arg4[arg1];
            int var8 = arg0;
            arg4[arg1] = var6;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if ((long) (var10 & 0x1) + var6 > arg4[var10]) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var8];
                    arg4[var8] = var11;
                    Object var13 = arg3[var10];
                    arg3[var10] = arg3[var8];
                    arg3[var8++] = var13;
                }
            }
            arg4[arg1] = arg4[var8];
            arg4[var8] = var6;
            arg3[arg1] = arg3[var8];
            arg3[var8] = var9;
            method174(arg0, var8 - 1, 4321, arg3, arg4);
            method174(var8 + 1, arg1, 4321, arg3, arg4);
        }
        if (arg2 != 4321) {
            field292 = -28;
        }
        field290++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([BII)I", line = 124)
    public static final int method175(byte[] arg0, int arg1, int arg2) {
        field294++;
        int var3 = -12 % ((-arg2 - 85) / 33);
        return class85.method581(arg0, -165438552, 0, arg1);
    }
}
