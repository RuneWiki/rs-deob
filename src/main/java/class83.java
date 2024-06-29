import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class83 {

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lwm;")
    public static class152 field1153 = class157.method1048("<br>", 114);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "[Lwm;")
    public static class152[] field1152 = new class152[100];

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[Lwm;")
    public static class152[] field1155 = new class152[100];

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[I")
    public static int[] field1156 = new int[500];

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILbg;IBLoe;II)V", line = 9)
    public static final void method538(int arg0, class203 arg1, int arg2, byte arg3, class127 arg4, int arg5, int arg6) {
        field1150++;
        if (arg1 == null) {
            return;
        }
        int var7 = class272.field4645 + class202.field3262 & 0x7FF;
        int var8 = arg2 * arg2 + arg6 * arg6;
        int var9 = Math.max(arg4.field1876 / 2, arg4.field1921 / 2) + 10;
        if ((var9 * var9) < var8) {
            return;
        }
        int var10 = class181.field2886[var7];
        int var11 = var10 * 256 / (class130.field1980 + 256);
        int var12 = class181.field2884[var7];
        int var13 = var12 * 256 / (class130.field1980 + 256);
        int var14 = arg2 * var11 - arg6 * var13 >> 16;
        int var15 = arg2 * var13 + arg6 * var11 >> 16;
        if (class217.field3516) {
            ((class68) arg1).method431(arg4.field1876 / 2 + arg0 + var15 - (arg1.field3283 / 2), arg4.field1921 / 2 + -var14 - arg1.field3278 / 2 + arg5, (class68) arg4.method818(-1, false));
        } else {
            ((class109) arg1).method724(arg0 + var15 + (arg4.field1876 / 2) - (arg1.field3283 / 2), arg4.field1921 / 2 + arg5 + -(arg1.field3278 / 2) + -var14, arg4.field1776, arg4.field1825);
        }
        int var16 = -2 % ((arg3 - 15) / 60);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lah;ILah;ZZ)Luk;", line = 58)
    public static final class93 method539(class205 arg0, int arg1, class205 arg2, boolean arg3, boolean arg4) {
        field1151++;
        boolean var5 = true;
        int[] var6 = arg2.method1366(0, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1365(arg1, var6[var7], false);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg0.method1365(0, var9, false);
                } else {
                    var10 = arg0.method1365(var9, 0, false);
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
            if (arg3) {
                return (class93) null;
            } else {
                return new class93(arg2, arg0, arg1, arg4);
            }
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 127)
    public static void method540(int arg0) {
        field1152 = null;
        field1153 = null;
        field1155 = null;
        field1156 = null;
        if (arg0 >= -82) {
            method538(101, (class203) null, -25, (byte) -61, (class127) null, -104, -79);
        }
    }
}
