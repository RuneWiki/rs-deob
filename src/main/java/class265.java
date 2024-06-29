import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class265 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lik;")
    public static class267 field3992 = new class267(50);

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field3996 = 2;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3999 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lpf;")
    public static class294 field4001;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lne;")
    public static class52 field3995;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1761(String arg0, byte arg1, String arg2, String arg3) {
        field4002++;
        int var4 = -36 / ((arg1 - 4) / 52);
        int var5 = arg2.length();
        int var6 = arg0.length();
        int var7 = arg3.length();
        if (var6 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var8 = var5;
        int var9 = var7 - var6;
        if (var9 != 0) {
            int var10 = 0;
            while (true) {
                int var11 = arg2.indexOf(arg0, var10);
                if (var11 < 0) {
                    break;
                }
                var10 = var6 + var11;
                var8 += var9;
            }
        }
        StringBuffer var12 = new StringBuffer(var8);
        int var13 = 0;
        while (true) {
            int var14 = arg2.indexOf(arg0, var13);
            if (var14 < 0) {
                var12.append(arg2.substring(var13));
                return var12.toString();
            }
            var12.append(arg2.substring(var13, var14));
            var12.append(arg3);
            var13 = var14 + var6;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
    public static final void method1762(int arg0, int arg1) {
        if (arg1 != -1) {
            field3996 = -73;
        }
        if (class13.field172 == null || class13.field172.length < arg0) {
            class13.field172 = new int[arg0];
        }
        field3994++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static final void method1763(int arg0) {
        field3998++;
        class210.field3158.method1782(0);
        class71.field1127.method1782(arg0);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method1764(int arg0) {
        field4001 = null;
        field3992 = null;
        if (arg0 == 17) {
            field3995 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lmi;")
    public static final class266 method1765(byte arg0) {
        field3993++;
        if (class52.field844.length > class140.field2053) {
            return class52.field844[class140.field2053++];
        } else {
            int var1 = 109 % ((arg0 + 1) / 49);
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
    public static final void method1766(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4000++;
        if (arg3 != -5085) {
            return;
        }
        if (arg2 < arg0) {
            class64.method429(class23.field284[arg1], arg2, (byte) 83, arg4, arg0);
        } else {
            class64.method429(class23.field284[arg1], arg0, (byte) 115, arg4, arg2);
        }
    }
}
