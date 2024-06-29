import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class318 {

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "[I")
    public int[] field3958 = new int[4];

    @OriginalMember(owner = "client!bha", name = "e", descriptor = "[I")
    public int[] field3960 = new int[4];

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "[I")
    public int[] field3968 = new int[4];

    @OriginalMember(owner = "client!bha", name = "i", descriptor = "B")
    public byte field3964;

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "B")
    public byte field3962;

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "S")
    public short field3961;

    @OriginalMember(owner = "client!bha", name = "h", descriptor = "S")
    public short field3963;

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "S")
    public short field3957;

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "[S")
    public short[] field3967;

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "[S")
    public short[] field3973;

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "[S")
    public short[] field3971;

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "S")
    public short field3959;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "[[I")
    public static int[][] field3972 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "[I")
    public static int[] field3970 = new int[5];

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "Lwm;")
    public static class30 field3965;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 3)
    public static final void method1857(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field3969++;
        class391 var5 = class752.method4075(arg3, (byte) -87, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field5146 != null) {
            class244 var6 = new class244();
            var6.field3354 = arg0;
            var6.field3353 = arg2;
            var6.field3349 = var5.field5146;
            var6.field3350 = var5;
            class760.method4148(var6);
        }
        if (class332.field4052 != 10 || !client.method2637(var5).method2126(arg0 - 1, arg1 + -1)) {
            return;
        }
        if (arg0 == 1) {
            class29.field259++;
            class13 var7 = class659.method3587(class68.field909, 98, class506.field6469);
            class366.method2104(var7, var5.field5128, arg4, arg3, (byte) 89);
            class116.method679(var7, arg1);
        }
        if (arg0 == 2) {
            class728.field9563++;
            class13 var8 = class659.method3587(class68.field909, arg1 + 98, class521.field6623);
            class366.method2104(var8, var5.field5128, arg4, arg3, (byte) 114);
            class116.method679(var8, arg1);
        }
        if (arg0 == 3) {
            class162.field2158++;
            class13 var9 = class659.method3587(class68.field909, 98, class752.field10243);
            class366.method2104(var9, var5.field5128, arg4, arg3, (byte) 57);
            class116.method679(var9, 0);
        }
        if (arg0 == 4) {
            class212.field2913++;
            class13 var10 = class659.method3587(class68.field909, 98, class271.field3569);
            class366.method2104(var10, var5.field5128, arg4, arg3, (byte) -110);
            class116.method679(var10, 0);
        }
        if (arg0 == 5) {
            class753.field10260++;
            class13 var11 = class659.method3587(class68.field909, 98, class20.field184);
            class366.method2104(var11, var5.field5128, arg4, arg3, (byte) -89);
            class116.method679(var11, arg1);
        }
        if (arg0 == 6) {
            class119.field1600++;
            class13 var12 = class659.method3587(class68.field909, 98, class225.field3050);
            class366.method2104(var12, var5.field5128, arg4, arg3, (byte) -85);
            class116.method679(var12, 0);
        }
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 7) {
            class515.field6565++;
            class13 var13 = class659.method3587(class68.field909, 98, class54.field705);
            class366.method2104(var13, var5.field5128, arg4, arg3, (byte) 102);
            class116.method679(var13, 0);
        }
        if (arg0 == 8) {
            class491.field6312++;
            class13 var14 = class659.method3587(class68.field909, 98, class296.field3759);
            class366.method2104(var14, var5.field5128, arg4, arg3, (byte) -112);
            class116.method679(var14, 0);
        }
        if (arg0 == 9) {
            class57.field745++;
            class13 var15 = class659.method3587(class68.field909, arg1 ^ 0x62, class135.field1784);
            class366.method2104(var15, var5.field5128, arg4, arg3, (byte) 102);
            class116.method679(var15, 0);
        }
        if (arg0 == 10) {
            class745.field10087++;
            class13 var16 = class659.method3587(class68.field909, 98, class721.field9477);
            class366.method2104(var16, var5.field5128, arg4, arg3, (byte) 83);
            class116.method679(var16, arg1);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 141)
    public static final byte[] method1858(String arg0, byte arg1) {
        if (arg1 >= -66) {
            field3970 = null;
        }
        field3966++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V", line = 281)
    public static void method1859(int arg0) {
        field3972 = null;
        field3965 = null;
        int var1 = -3 % ((77 - arg0) / 49);
        field3970 = null;
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 308)
    public class318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field3964 = (byte) arg0;
        this.field3962 = (byte) arg1;
        this.field3960[3] = arg5;
        this.field3960[1] = arg3;
        this.field3960[0] = arg2;
        this.field3960[2] = arg4;
        this.field3958[3] = arg9;
        this.field3958[2] = arg8;
        this.field3958[1] = arg7;
        this.field3958[0] = arg6;
        this.field3968[3] = arg13;
        this.field3968[2] = arg12;
        this.field3968[0] = arg10;
        this.field3968[1] = arg11;
        this.field3961 = (short) (arg2 >> class88.field1221);
        this.field3963 = (short) (arg4 >> class88.field1221);
        this.field3957 = (short) (arg10 >> class88.field1221);
        this.field3967 = new short[4];
        this.field3973 = new short[4];
        this.field3971 = new short[4];
        this.field3959 = (short) (arg12 >> class88.field1221);
    }
}
