import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class86 extends class8 {

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field1192 = 0;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "[I")
    public static int[] field1196 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Z", line = 4)
    public static final boolean method581(boolean arg0) {
        field1191++;
        if (arg0) {
            return true;
        }
        if (class102.field1494) {
            try {
                return !(Boolean) class308.method2181("showingVideoAd", 32627, class14.field159.field1951);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V", line = 25)
    public static final void method583(int arg0, int arg1) {
        field1194++;
        if (arg0 == -1 || !class149.field2300[arg0]) {
            return;
        }
        class193.field3157.method1277(arg0, -126);
        if (class221.field3547[arg0] == null) {
            return;
        }
        int var2 = -88 / ((arg1 + 52) / 32);
        boolean var3 = true;
        for (int var4 = 0; var4 < class221.field3547[arg0].length; var4++) {
            if (class221.field3547[arg0][var4] != null) {
                if (class221.field3547[arg0][var4].field2478 == 2) {
                    var3 = false;
                } else {
                    class221.field3547[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class221.field3547[arg0] = null;
        }
        class149.field2300[arg0] = false;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V", line = 70)
    public static void method584(int arg0) {
        if (arg0 != -11017) {
            method584(78);
        }
        field1196 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V", line = 94)
    public static final void method586(int arg0, int arg1) {
        class36.field478.method708(arg1, true);
        if (arg0 < 78) {
            method583(-51, 46);
        }
        field1195++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILjava/lang/String;[BI)I", line = 109)
    public static final int method587(int arg0, int arg1, int arg2, String arg3, byte[] arg4, int arg5) {
        int var6 = arg1 - arg0;
        field1197++;
        if (arg5 != -8225) {
            return -59;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg2 + var7] = -97;
            } else {
                arg4[arg2 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Z")
    public abstract boolean method582(int arg0);

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method585(byte arg0);
}
