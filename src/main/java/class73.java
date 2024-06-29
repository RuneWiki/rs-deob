import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class73 {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lsf;")
    public static class108 field1107 = class140.method973(255, ")3");

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lsf;")
    public static class108 field1108 = class140.method973(255, "_labels");

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lik;")
    public static class262 field1104;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "[Lt;")
    public static class257[] field1109;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZII)I", line = 13)
    public static final int method485(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = class263.field4657[class44.method301(arg2, arg0)];
        field1106++;
        if (arg3 > 0) {
            int var5 = class263.field4661.method572(arg3 & 0xFFFF, 255);
            if (var5 != 0) {
                int var6;
                if (arg0 < 0) {
                    var6 = 0;
                } else if (arg0 <= 127) {
                    var6 = arg0 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var7 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class263.field4661.method573(arg3 & 0xFFFF, (byte) -103);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                int var11 = (var4 >> 8 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var11 & 0xFF00) + (var12 >> 8) + (var10 << 8 & 0xFF00EA);
            }
        }
        if (!arg1) {
            field1108 = (class108) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V", line = 92)
    public static final void method486(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1105++;
        if (arg0 != 16711680) {
            method485(97, false, 71, -7);
        }
        class209.method1452(arg1 + arg3, class106.field1839[arg4], 7, arg1 - arg3, arg2);
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class106.field1839[arg4 + var6];
                var7 -= var6 << 1;
                int[] var10 = class106.field1839[arg4 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class209.method1452(var11, var9, 7, var12, arg2);
                class209.method1452(var11, var10, arg0 - 16711673, var12, arg2);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class106.field1839[arg4 + var5];
            int[] var16 = class106.field1839[arg4 - var5];
            class209.method1452(var13, var15, 7, var14, arg2);
            class209.method1452(var13, var16, arg0 - 16711673, var14, arg2);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V", line = 149)
    public static final void method487(int arg0, int arg1) {
        if (arg1 != 16711680) {
            field1108 = (class108) null;
        }
        field1111++;
        class317.field5451.method637(arg0, arg1 ^ 0xFF0071);
        class286.field5000.method637(arg0, arg1 - 16711566);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 176)
    public static void method488(int arg0) {
        int var1 = 12 / ((arg0 + 45) / 58);
        field1104 = null;
        field1108 = null;
        field1107 = null;
        field1109 = null;
    }
}
