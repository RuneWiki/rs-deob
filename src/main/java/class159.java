import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class159 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lab;")
    public static class279 field2598 = new class279(64);

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lab;")
    public static class279 field2601 = new class279(64);

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
    public static int[] field2604 = new int[1000];

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lab;")
    public static class279 field2602 = new class279(4);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 7)
    public static final String method1024(long arg0, byte arg1) {
        field2596++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class15.field279[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            if (arg1 != 83) {
                method1024(-15L, (byte) 40);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V", line = 64)
    public static final void method1027(byte arg0, int arg1) {
        class147.field2415.method1883(2047773287, arg1);
        field2600++;
        if (arg0 >= -11) {
            method1028(23);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 78)
    public static final void method1028(int arg0) {
        for (int var1 = 0; var1 < class136.field2285; var1++) {
            class313 var2 = class71.method547(var1, (byte) -53);
            if (var2 != null && var2.field4756 == 0) {
                class23.field468[var1] = 0;
                class40.field771[var1] = 0;
            }
        }
        field2597++;
        class123.field2125 = new class39(16);
        if (arg0 != 1000) {
            field2603 = 61;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 103)
    public static void method1029(int arg0) {
        field2602 = null;
        field2604 = null;
        field2601 = null;
        if (arg0 != 13013) {
            method1029(-10);
        }
        field2598 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIILsc;IJ)Z", line = 115)
    public static final boolean method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class19 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class196.method1262(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BZ)V")
    public abstract void method1025(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1026(int arg0);
}
