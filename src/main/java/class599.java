import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class599 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Ldg;")
    public static class376 field8467 = new class376(71, -1);

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lnea;")
    public static class664 field8474 = new class664(41, 2);

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field8477 = 1400;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lnea;")
    public static class664 field8475 = new class664(0, -1);

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "F")
    public static float field8476;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[B")
    public byte[] field8473;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[S")
    public short[] field8466;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[S")
    public short[] field8468;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[S")
    public short[] field8470;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 7)
    public static void method3389(int arg0) {
        field8467 = null;
        field8475 = null;
        int var1 = -68 / ((arg0 - 6) / 61);
        field8474 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V", line = 22)
    public static final void method3390(int arg0, int arg1) {
        field8471++;
        class191 var2 = class6.method38(arg1, -121, arg0);
        var2.method1284((byte) -48);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Z", line = 33)
    public static final boolean method3391(byte arg0, int arg1) {
        field8469++;
        int var2 = arg0 & 0xFF;
        if (arg1 != 0) {
            field8465 = 114;
        }
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class497.field7043[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILde;[IB)V", line = 63)
    public static final void method3392(int arg0, class491 arg1, int[] arg2, byte arg3) {
        if (arg1.field6259 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field6259.length; var5++) {
                if (arg1.field6259[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field6218 != -1) {
                class30 var6 = class188.field2708.method2140(arg1.field6218, 127);
                int var7 = var6.field461;
                if (var7 == 1) {
                    arg1.field6175 = arg0;
                    arg1.field6251 = 0;
                    arg1.field6253 = 0;
                    arg1.field6222 = 1;
                    arg1.field6194 = 0;
                    class603.method3399(var6, arg1.field3024, arg1.field6194, class648.field9106 == arg1, -58, arg1.field3029, arg1.field3019);
                }
                if (var7 == 2) {
                    arg1.field6253 = 0;
                }
            }
        }
        field8472++;
        if (arg3 >= -74) {
            return;
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg1.field6259 == null || arg1.field6259[var9] == -1 || class188.field2708.method2140(arg2[var9], 126).field462 >= class188.field2708.method2140(arg1.field6259[var9], 127).field462) {
                arg1.field6259 = arg2;
                arg1.field6175 = arg0;
                break;
            }
        }
        if (var8) {
            arg1.field6259 = arg2;
            arg1.field6175 = arg0;
        }
    }
}
