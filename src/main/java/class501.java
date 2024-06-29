import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class501 {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lad;")
    private class19 field7237 = new class19(64);

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Ltf;")
    private class701 field7239;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lsb;")
    public static class305 field7240 = new class305(2, 7);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLuk;[[B)V", line = 3)
    public static final void method2881(byte arg0, class476 arg1, byte[][] arg2) {
        field7234++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class115 var11 = new class115(var10);
                int var12 = class306.field3784[var5] >> 8;
                int var13 = class306.field3784[var5] & 0xFF;
                int var14 = var12 * 64 - class26.field245;
                int var15 = var13 * 64 - class231.field2860;
                class530.method2975((byte) 125);
                arg1.method3505(var14, class26.field245, class231.field2860, var11, arg0 ^ 0x3D, class282.field3534, var15);
                arg1.method2738(var15, var14, (byte) -125, var11, class701.field9813, var3);
                if (!arg1.field8821 && (class43.field418 / 8) == var12 && class613.field8628 / 8 == var13 && var3[0] != -1) {
                    class160.field1788 = class66.field669.method2494(var3[0], var3[2], -80, class328.field4021, var3[1], var3[3]);
                    class153.field1692 = var3[4];
                }
            }
        }
        if (arg0 != 104) {
            method2883(-126, (byte) -75, -109, 21, -62);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class306.field3784[var6] >> 8) * 64 - class26.field245;
            int var8 = (class306.field3784[var6] & 0xFF) * 64 - class231.field2860;
            byte[] var9 = arg2[var6];
            if (var9 == null && class613.field8628 < 800) {
                class530.method2975((byte) 92);
                arg1.method3509(64, var8, (byte) -38, 64, var7);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLjava/io/File;)[B", line = 81)
    public static final byte[] method2882(boolean arg0, File arg1) {
        if (arg0) {
            method2885(null, (byte) 47, -95, -8, null, -111);
        }
        field7235++;
        return class157.method847((byte) 121, (int) arg1.length(), arg1);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIII)I", line = 92)
    public static final int method2883(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field7233++;
        int var5 = arg4 & 0xF;
        if (arg1 != -118) {
            method2882(true, null);
        }
        int var6 = var5 >= 8 ? arg0 : arg3;
        int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg3 : arg2);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lqh;ILtf;)V", line = 271)
    public class501(class320 arg0, int arg1, class701 arg2) {
        this.field7239 = arg2;
        this.field7239.method3883(5, 0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 122)
    public static void method2884(int arg0) {
        field7240 = null;
        int var1 = -100 % ((-arg0 - 53) / 50);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BBIILjava/lang/String;I)I", line = 132)
    public static final int method2885(byte[] arg0, byte arg1, int arg2, int arg3, String arg4, int arg5) {
        field7238++;
        int var6 = arg2 - arg5;
        if (arg1 > -7) {
            field7240 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg3 + var7] = -97;
            } else {
                arg0[arg3 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lfm;", line = 286)
    public final class205 method2886(int arg0, int arg1) {
        field7236++;
        class19 var3 = this.field7237;
        class205 var4;
        synchronized (this.field7237) {
            var4 = (class205) this.field7237.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field7239;
        byte[] var6;
        synchronized (this.field7239) {
            var6 = this.field7239.method3854((byte) 90, 5, arg0);
        }
        class205 var7 = new class205();
        if (var6 != null) {
            var7.method1231(new class115(var6), 8);
        }
        class19 var8 = this.field7237;
        synchronized (this.field7237) {
            if (arg1 > -42) {
                field7240 = null;
            }
            this.field7237.method92(1, (long) arg0, var7);
            return var7;
        }
    }
}
