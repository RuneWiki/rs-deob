import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 {

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[I")
    private int[] field62;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public static int[] field55 = new int[2];

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[[[I")
    public static int[][][] field66 = new int[2][][];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Llm;")
    public static class210 field59;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Le;", line = 4)
    public static final class226 method30(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3368;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)Ldi;", line = 12)
    public static final class48 method31(int arg0, byte arg1) {
        field63++;
        class48 var2 = (class48) class42.field516.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -126) {
            byte[] var3 = field59.method1441(class221.method1549(arg0, (byte) -27), (byte) -44, class297.method2071(125, arg0));
            class48 var4 = new class48();
            var4.field617 = arg0;
            if (var3 != null) {
                var4.method332(new class263(var3), (byte) -96);
            }
            class42.field516.method2175((long) arg0, var4, arg1 ^ 0xFFFFFFF9);
            return var4;
        } else {
            return (class48) null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILf;Z)V", line = 38)
    public static final void method32(int arg0, int arg1, class329 arg2, boolean arg3) {
        if (arg2.field5067 == 0) {
            arg2.field4929 = arg2.field4998;
        } else if (arg2.field5067 == 1) {
            arg2.field4929 = (arg0 - arg2.field5018) / 2 + arg2.field4998;
        } else if (arg2.field5067 == 2) {
            arg2.field4929 = arg0 - arg2.field5018 - arg2.field4998;
        } else if (arg2.field5067 == 3) {
            arg2.field4929 = arg2.field4998 * arg0 >> 14;
        } else if (arg2.field5067 == 4) {
            arg2.field4929 = (arg2.field4998 * arg0 >> 14) + (arg0 - arg2.field5018) / 2;
        } else {
            arg2.field4929 = arg0 - (arg2.field4998 * arg0 >> 14) - arg2.field5018;
        }
        if (arg2.field5057 == 0) {
            arg2.field4962 = arg2.field5042;
        } else if (arg2.field5057 == 1) {
            arg2.field4962 = (arg1 - arg2.field4994) / 2 + arg2.field5042;
        } else if (arg2.field5057 == 2) {
            arg2.field4962 = arg1 - arg2.field5042 - arg2.field4994;
        } else if (arg2.field5057 == 3) {
            arg2.field4962 = arg2.field5042 * arg1 >> 14;
        } else if (arg2.field5057 == 4) {
            arg2.field4962 = (arg2.field5042 * arg1 >> 14) + (arg1 - arg2.field4994) / 2;
        } else {
            arg2.field4962 = arg1 - (arg2.field5042 * arg1 >> 14) - arg2.field4994;
        }
        field58++;
        if (!arg3) {
            field66 = (int[][][]) ((int[][][]) null);
        }
        if (!class250.field3733 || !(client.method902(arg2).field242 != 0 || arg2.field5066 == 0)) {
            return;
        }
        if (arg2.field4929 < 0) {
            arg2.field4929 = 0;
        } else if ((arg2.field4929 + arg2.field5018) > arg0) {
            arg2.field4929 = arg0 - arg2.field5018;
        }
        if (arg2.field4962 < 0) {
            arg2.field4962 = 0;
        } else if (arg1 < (arg2.field4994 + arg2.field4962)) {
            arg2.field4962 = arg1 - arg2.field4994;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 116)
    public static final byte[] method33(byte arg0, String arg1) {
        field60++;
        int var2 = -84 / ((-arg0 - 6) / 51);
        int var3 = arg1.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg1.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)V", line = 253)
    public static final void method34(int arg0, boolean arg1) {
        field57++;
        class154.field2321 = -1;
        class233.field3504 = arg0;
        if (!arg1) {
            method37((byte) -72);
        }
        class204.field3070 = -1;
        class162.method1150((byte) 24);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I", line = 267)
    public final int method35(int arg0, int arg1) {
        field56++;
        if (arg1 != -1888) {
            method32(100, -104, (class329) null, true);
        }
        int var3 = (this.field62.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field62[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field62[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 296)
    public static void method36(int arg0) {
        int var1 = 67 / ((-arg0 - 49) / 47);
        field59 = null;
        field66 = (int[][][]) null;
        field55 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 308)
    public static final void method37(byte arg0) {
        field61++;
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class206.field3104[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class56.field706; var3++) {
            class195 var4 = class241.field3592[class20.field239[var3]];
            if (var4 != null) {
                var4.field1535 = false;
            }
        }
        if (arg0 <= 53) {
            method33((byte) 96, (String) null);
        }
        for (int var5 = 0; var5 < class172.field2577; var5++) {
            class69 var6 = class187.field2788[class56.field711[var5]];
            if (var6 != null) {
                var6.field1535 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIILjava/lang/String;)V", line = 368)
    public static final void method38(int arg0, int arg1, int arg2, int arg3, String arg4) {
        field65++;
        class329 var5 = class10.method48(arg0, arg1, (byte) 123);
        if (var5 == null) {
            return;
        }
        if (var5.field4978 != null) {
            class286 var6 = new class286();
            var6.field4310 = var5.field4978;
            var6.field4321 = arg2;
            var6.field4330 = var5;
            var6.field4317 = arg4;
            class9.method39(var6, arg3 ^ 0x192B);
        }
        boolean var7 = true;
        if (var5.field5032 > 0) {
            var7 = class144.method1031((byte) -87, var5);
        }
        if (!var7 || !client.method902(var5).method137(arg2 - 1, 60)) {
            return;
        }
        if (arg2 == 1) {
            class234.field3507.method28(89, false);
            class37.field451++;
            class234.field3507.method1815(76, arg1);
            class234.field3507.method1823(arg0, (byte) -70);
        }
        if (arg2 == 2) {
            class44.field541++;
            class234.field3507.method28(175, false);
            class234.field3507.method1815(arg3 + 21, arg1);
            class234.field3507.method1823(arg0, (byte) -93);
        }
        if (arg2 == 3) {
            class234.field3507.method28(252, false);
            class234.field3507.method1815(arg3 ^ 0x3D, arg1);
            class234.field3507.method1823(arg0, (byte) -90);
            class70.field923++;
        }
        if (arg2 == 4) {
            class234.field3507.method28(191, false);
            class234.field3507.method1815(82, arg1);
            class234.field3507.method1823(arg0, (byte) -119);
            class98.field1515++;
        }
        if (arg2 == 5) {
            class234.field3507.method28(64, false);
            class149.field2242++;
            class234.field3507.method1815(119, arg1);
            class234.field3507.method1823(arg0, (byte) -51);
        }
        if (arg2 == 6) {
            class223.field3400++;
            class234.field3507.method28(248, false);
            class234.field3507.method1815(104, arg1);
            class234.field3507.method1823(arg0, (byte) -87);
        }
        if (arg2 == 7) {
            class38.field466++;
            class234.field3507.method28(213, false);
            class234.field3507.method1815(95, arg1);
            class234.field3507.method1823(arg0, (byte) -34);
        }
        if (arg2 == 8) {
            class103.field1640++;
            class234.field3507.method28(44, false);
            class234.field3507.method1815(123, arg1);
            class234.field3507.method1823(arg0, (byte) -42);
        }
        if (arg2 == 9) {
            class64.field844++;
            class234.field3507.method28(40, false);
            class234.field3507.method1815(arg3 + 7, arg1);
            class234.field3507.method1823(arg0, (byte) -117);
        }
        if (arg2 == 10) {
            class205.field3077++;
            class234.field3507.method28(60, false);
            class234.field3507.method1815(127, arg1);
            class234.field3507.method1823(arg0, (byte) -95);
        }
        if (arg3 != 89) {
            method30(-73, 83, -31);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([I)V", line = 498)
    public class8(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field62 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field62[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field62[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field62[var5 + var5] = arg0[var4];
            this.field62[var5 + var5 + 1] = var4++;
        }
    }
}
