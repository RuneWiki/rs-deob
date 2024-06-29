import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class301 {

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public int field4701;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[Lng;")
    public class182[] field4697;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
    public int[] field4693;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4694 = 0;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[Lsg;")
    public static class44[] field4699;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 9)
    public static final void method2121(byte arg0) {
        if (arg0 != 30) {
            method2124(43, (String) null);
        }
        client.field4423.method378(0);
        class148.field2356.method378(0);
        field4698++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 25)
    public static void method2122(int arg0) {
        field4699 = null;
        if (arg0 != -19081) {
            field4694 = 4;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIILio;JLio;Lio;)V", line = 39)
    public static final void method2123(int arg0, int arg1, int arg2, int arg3, class294 arg4, long arg5, class294 arg6, class294 arg7) {
        class353 var9 = new class353();
        var9.field5619 = arg4;
        var9.field5621 = arg1 * 128 + 64;
        var9.field5623 = arg2 * 128 + 64;
        var9.field5626 = arg3;
        var9.field5634 = arg5;
        var9.field5622 = arg6;
        var9.field5618 = arg7;
        int var10 = 0;
        class196 var11 = class194.field2947[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2979; var12++) {
                class44 var13 = var11.field2998[var12];
                if ((var13.field502 & 0x400000L) == 4194304L) {
                    int var14 = var13.field494.method417();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field5632 = -var10;
        if (class194.field2947[arg0][arg1][arg2] == null) {
            class194.field2947[arg0][arg1][arg2] = new class196(arg0, arg1, arg2);
        }
        class194.field2947[arg0][arg1][arg2].field2985 = var9;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 89)
    public static final byte[] method2124(int arg0, String arg1) {
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
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
        if (arg0 != 8364) {
            field4699 = (class44[]) null;
        }
        field4696++;
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)Z", line = 229)
    public static final boolean method2125(int arg0, byte[] arg1) {
        if (arg0 >= -2) {
            method2126((class16) null, 122);
        }
        field4700++;
        class143 var2 = new class143(arg1);
        int var3 = var2.method1043(true);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1043(true) == 1;
        if (var4) {
            class349.method2417((byte) 93, var2);
        }
        class307.method2166(var2, 65535);
        return true;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V", line = 252)
    public class301(int arg0) {
        this.field4701 = arg0;
        this.field4697 = new class182[this.field4701];
        this.field4693 = new int[this.field4701];
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lnk;I)V", line = 265)
    public static final void method2126(class16 arg0, int arg1) {
        field4695++;
        int var2 = 15 / ((-arg1 - 28) / 39);
        class345.field5473 = arg0;
        class189.field2846 = class345.field5473.method110(false, 16);
    }
}
