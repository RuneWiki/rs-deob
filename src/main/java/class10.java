import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class10 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "J")
    public long field91 = 0L;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field93 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field95 = new String[8];

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lqf;")
    public static class148 field102 = null;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Z")
    public static boolean field105 = false;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Ljava/lang/String;")
    public static String field107 = "Loaded interfaces";

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Z")
    public static boolean field108 = true;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lgd;")
    public class310 field94;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lgd;")
    public class310 field98;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lpj;", line = 9)
    public static final class183 method78(int arg0, int arg1) {
        field100++;
        class183 var2 = (class183) class57.field849.method1432((byte) 125, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class146.field2235.method1507(class228.method1622(arg0, true), (byte) 39, class121.method933((byte) 116, arg0));
        class183 var4 = new class183();
        var4.field2758 = arg0;
        if (arg1 != 2) {
            field97 = 109;
        }
        if (var3 != null) {
            var4.method1319((byte) -16, new class35(var3));
        }
        var4.method1327(90);
        class57.field849.method1436(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 37)
    public static void method79(int arg0) {
        field93 = null;
        field95 = null;
        field102 = null;
        if (arg0 != 21736) {
            method79(43);
        }
        field107 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIJIZ)Ljava/lang/String;", line = 54)
    public static final String method80(int arg0, int arg1, long arg2, int arg3, boolean arg4) {
        field104++;
        char var6 = ',';
        StringBuffer var7 = new StringBuffer(26);
        char var8 = '.';
        if (arg1 == 0) {
            var6 = '.';
            var8 = ',';
        }
        if (arg1 == 2) {
            var8 = ' ';
        }
        if (arg0 >= -65) {
            return (String) null;
        }
        boolean var9 = false;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var9 = true;
        }
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var7.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var7.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var7.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var9) {
                    var7.append('-');
                }
                return var7.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var7.append(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BIIB)I", line = 173)
    public static final int method81(byte[] arg0, int arg1, int arg2, byte arg3) {
        int var4 = -1;
        int var5 = arg2;
        if (arg3 < 47) {
            return 46;
        }
        while (arg1 > var5) {
            var4 = var4 >>> 8 ^ class190.field3026[(var4 ^ arg0[var5]) & 0xFF];
            var5++;
        }
        int var6 = ~var4;
        field106++;
        return var6;
    }
}
