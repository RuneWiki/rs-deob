import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class219 extends class359 {

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public int field2994 = 0;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public int field2996 = -1;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Lcs;")
    public static class189 field3002 = new class189(16);

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Z")
    public static boolean field3012 = true;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field3013 = 0;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "[[I")
    public static int[][] field3010;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 3)
    public static void method1432(int arg0) {
        field3002 = null;
        field3010 = null;
        if (arg0 >= -1) {
            field3002 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I", line = 16)
    public static final int method1433(int arg0, int arg1) {
        if (arg1 == 16) {
            field3008++;
            return arg0 >>> 8;
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)J", line = 39)
    public static final long method1434(int arg0, String arg1) {
        if (arg0 != 14224) {
            return -47L;
        }
        field3001++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILen;BIILeq;I)Lkh;", line = 73)
    public static final class11 method1435(int arg0, int arg1, class174 arg2, byte arg3, int arg4, int arg5, class116 arg6, int arg7) {
        class331.field4736.field5643 = arg6 != null;
        class331.field4736.field5641 = arg5;
        class331.field4736.field5645 = arg7;
        field2999++;
        class331.field4736.field5647 = arg0;
        class331.field4736.field5646 = arg2.field2424;
        class331.field4736.field5642 = arg1;
        class331.field4736.field5648 = arg4;
        int var8 = -115 / ((14 - arg3) / 47);
        return (class11) class134.field1864.method885(class331.field4736, 0);
    }
}
