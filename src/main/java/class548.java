import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class548 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lmga;")
    public static class739 field7410 = new class739(12, 7);

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[[I")
    public static int[][] field7411 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Leia;")
    public static class255 field7413;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;)J", line = 5)
    public static final long method3108(byte arg0, String arg1) {
        field7407++;
        long var2 = 0L;
        int var4 = arg1.length();
        int var5 = 0;
        if (arg0 != 17) {
            return 25L;
        }
        while (var4 > var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
            var5++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I", line = 50)
    public static final int method3109(byte arg0) {
        if (arg0 < 74) {
            return -93;
        } else {
            field7412++;
            return class39.field623;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z[B)[B", line = 63)
    public static final byte[] method3110(boolean arg0, byte[] arg1) {
        field7409++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        class278.method1796(arg1, 0, var2, 0, arg1.length);
        if (arg0) {
            field7410 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 85)
    public static void method3111(int arg0) {
        field7413 = null;
        if (arg0 == 6) {
            field7410 = null;
            field7411 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZBJ)Ljava/lang/String;", line = 102)
    public static final String method3112(int arg0, boolean arg1, byte arg2, long arg3) {
        field7408++;
        Calendar var5;
        if (arg1) {
            class146.method1094(-17062, arg3);
            var5 = class295.field4283;
        } else {
            class109.method822((byte) -124, arg3);
            var5 = class295.field4285;
        }
        int var6 = var5.get(5);
        int var7 = var5.get(2) + 1;
        if (arg2 != 70) {
            field7410 = null;
        }
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }
}
