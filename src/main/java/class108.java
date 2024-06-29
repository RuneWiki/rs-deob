import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class108 {

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
    public static boolean field1569 = false;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[[[I")
    public static int[][][] field1564;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
    public static final int method800(byte arg0) {
        if (arg0 < 69) {
            field1564 = null;
        }
        field1567++;
        return client.field2582;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method801(boolean arg0) {
        if (!arg0) {
            method804((byte) 26, true);
        }
        field1564 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IC)B")
    public static final byte method802(int arg0, char arg1) {
        field1562++;
        byte var2;
        if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (arg0 != -711) {
            field1566 = -118;
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILjava/lang/String;[BI)I")
    public static final int method803(int arg0, int arg1, int arg2, String arg3, byte[] arg4, int arg5) {
        int var6 = arg5 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg1 + var7);
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
        if (arg0 == -23775) {
            field1568++;
            return var6;
        } else {
            return 63;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BZ)V")
    public static final void method804(byte arg0, boolean arg1) {
        int var2 = -116 / ((arg0 + 74) / 46);
        byte[][] var3 = class206.field3311;
        byte var4 = 4;
        field1565++;
        int[] var5 = null;
        for (int var6 = 0; var6 < var4; var6++) {
            class126.method908(-17);
            for (int var7 = 0; var7 < 13; var7++) {
                for (int var8 = 0; var8 < 13; var8++) {
                    boolean var9 = false;
                    int var10 = class121.field1771[var6][var7][var8];
                    if (var10 != -1) {
                        int var11 = var10 >> 24 & 0x3;
                        if (!arg1 || var11 == 0) {
                            int var12 = var10 >> 1 & 0x3;
                            int var13 = (var10 & 0x3FFE) >> 3;
                            int var14 = (var10 & 0xFFF0E1) >> 14;
                            int var15 = (var14 / 8 << 8) + var13 / 8;
                            for (int var16 = 0; var16 < class286.field4548.length; var16++) {
                                if (class286.field4548[var16] == var15 && var3[var16] != null) {
                                    int[] var17 = class138.method979(class138.field2237, var11, var14, arg1, false, var13, var8 * 8, var7 * 8, var6, var3[var16], var12);
                                    var9 = true;
                                    if (var5 == null && var17 != null) {
                                        var5 = var17;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class168.method1238(var7 * 8, var8 * 8, var6, true, 8, 8);
                    }
                }
            }
        }
        if (var5 == null) {
            class57.field820 = -1;
            return;
        }
        class131.field2029 = var5[3];
        class229.field3701 = var5[2];
        class287.field4562 = var5[1];
        class277.field4443 = var5[4];
        class57.field820 = var5[0];
    }
}
