import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class220 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[S")
    public static short[] field3683 = new short[256];

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3684 = 1;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lcg;")
    public static class49 field3682;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1614(int arg0) {
        field3685++;
        for (int var1 = 0; var1 < 100; var1++) {
            class272.field4337[var1] = true;
        }
        if (arg0 >= -88) {
            method1615(-22);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Ljava/lang/String;", line = 23)
    public static final String method1615(int arg0) {
        field3687++;
        String var1 = "www";
        if (class246.field3988 != 0) {
            var1 = "www-wtqa";
        }
        if (arg0 != -1321467992) {
            return (String) null;
        }
        String var2 = "";
        if (class256.field4125 != null) {
            var2 = "/p=" + class256.field4125;
        }
        return "http://" + var1 + ".runescape.com/l=" + class5.field67 + "/a=" + class201.field3433 + var2 + "/";
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILcg;Lcg;I)Lwl;", line = 60)
    public static final class100 method1616(boolean arg0, int arg1, class49 arg2, class49 arg3, int arg4) {
        if (arg1 < 125) {
            method1617((byte) -108);
        }
        boolean var5 = true;
        field3681++;
        int[] var6 = arg2.method430(arg4, (byte) -94);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method442(var6[var7], arg4, true);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg3.method442(var9, 0, true);
                } else {
                    var10 = arg3.method442(0, var9, true);
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
            return new class100(arg2, arg3, arg4, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 113)
    public static void method1617(byte arg0) {
        field3683 = null;
        int var1 = -111 / ((-arg0 - 14) / 36);
        field3682 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)I", line = 123)
    public static final int method1618(int arg0, byte arg1, int arg2) {
        field3686++;
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 != 100) {
            return -61;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }
}
