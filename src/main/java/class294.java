import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class294 extends class305 {

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "[Lsj;")
    public class182[] field4493;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4491 = "Loaded config";

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public static int field4488 = 0;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "Z")
    public static boolean field4494 = false;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4498 = "Loading world list data";

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "Z")
    public static boolean field4497 = false;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "Lbm;")
    public static class307 field4492;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "Z")
    public static boolean field4499;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V", line = 16)
    public static void method1969(int arg0) {
        field4498 = null;
        if (arg0 != 376) {
            field4490 = -82;
        }
        field4492 = null;
        field4491 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)Z", line = 29)
    public final boolean method1970(int arg0, boolean arg1) {
        field4495++;
        if (arg1) {
            method1972((String) null, true);
        }
        return this.field4493[arg0].field2905;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Z", line = 46)
    public final boolean method1971(int arg0, int arg1) {
        int var3 = 47 / ((43 - arg0) / 61);
        field4500++;
        return this.field4493[arg1].field2911;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lbm;Lbm;IZ)V", line = 58)
    public class294(class307 arg0, class307 arg1, int arg2, boolean arg3) {
        class55 var5 = new class55();
        int var6 = arg0.method2056(arg2, -121);
        this.field4493 = new class182[var6];
        int[] var7 = arg0.method2055(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2036(arg2, var7[var8], (byte) 90);
            class214 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class214 var12 = (class214) var5.method424(-47); var12 != null; var12 = (class214) var5.method425(-32547)) {
                if (var12.field3429 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2032(var11, 117, 0);
                } else {
                    var13 = arg1.method2032(0, 115, var11);
                }
                var10 = new class214(var11, var13);
                var5.method427((byte) 100, var10);
            }
            this.field4493[var7[var8]] = new class182(var9, var10);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 124)
    public static final byte[] method1972(String arg0, boolean arg1) {
        field4487++;
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
        if (arg1) {
            method1972((String) null, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)V", line = 274)
    public static final void method1973(byte arg0) {
        field4486++;
        if (arg0 < -107) {
            class135.field2262.method1884(-22054);
            class186.field3022.method1884(-22054);
        }
    }
}
