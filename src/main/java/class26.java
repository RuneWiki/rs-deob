import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class26 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field512 = "flash1:";

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lih;")
    public static class143 field510;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLjava/lang/String;)J", line = 17)
    public static final long method217(byte arg0, String arg1) {
        field511++;
        int var2 = arg1.length();
        if (arg0 > -36) {
            method217((byte) 70, (String) null);
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = ((var3 << 5) + ((long) arg1.charAt(var5))) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lbm;ZILbm;I)Lrn;", line = 53)
    public static final class294 method218(class307 arg0, boolean arg1, int arg2, class307 arg3, int arg4) {
        field513++;
        boolean var5 = true;
        int[] var6 = arg3.method2055(arg4, 0);
        if (arg2 != 1430232264) {
            return (class294) null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method2032(var6[var7], arg2 - 1430232139, arg4);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method2032(var9, 109, 0);
                } else {
                    var10 = arg0.method2032(0, 105, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class294(arg3, arg0, arg4, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 106)
    public static void method219(boolean arg0) {
        field510 = null;
        field512 = null;
        if (!arg0) {
            method217((byte) 67, (String) null);
        }
    }
}
