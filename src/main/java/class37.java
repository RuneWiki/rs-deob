import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class37 extends class259 {

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field645 = 0;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "[I")
    public static int[] field647 = new int[32];

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "J")
    public static long field644 = 0L;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "F")
    public static float field643;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "Lpk;")
    public static class237 field650;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method286(int arg0, String arg1) {
        field646++;
        int var2 = arg1.length();
        if (arg0 != 25077) {
            return -47L;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var3 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var3 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var3 += (long) (var6 + 27 - 48);
            }
            if (var3 >= 177917621779460413L) {
                break;
            }
        }
        while ((var3 % 37L) == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method287(long arg0, byte arg1) {
        field654++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 < 102) {
                return null;
            }
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class24.field392[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static void method288(int arg0) {
        if (arg0 != 28164) {
            field645 = 84;
        }
        field647 = null;
        field650 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILme;Lpk;Lpk;)V")
    public static final void method289(int arg0, class276 arg1, class237 arg2, class237 arg3) {
        class147.field2126 = arg3;
        field651++;
        class63.field1060 = arg2;
        class102.field1497 = arg1;
        if (class147.field2126 != null) {
            class134.field1962 = class147.field2126.method1614(0, 1);
        }
        if (arg0 <= 34) {
            field643 = 1.0621451F;
        }
        if (class63.field1060 != null) {
            class297.field4587 = class63.field1060.method1614(0, 1);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)I")
    public static final int method290(byte arg0, int arg1) {
        if (arg0 != -69) {
            field647 = null;
        }
        field653++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method291(int arg0);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
    public static final void method292(int arg0, byte arg1, int arg2) {
        field652++;
        class243 var3 = class143.method973(arg2, -27248);
        int var4 = var3.field3768;
        int var5 = var3.field3759;
        int var6 = var3.field3761;
        int var7 = class63.field1046[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        int var9 = -21 / ((arg1 + 36) / 52);
        class295.method1943(var8 & arg0 << var5 | class166.field2447[var4] & ~var8, var4, (byte) 96);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Z")
    public abstract boolean method293(boolean arg0);
}
