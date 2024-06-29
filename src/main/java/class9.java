import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class9 extends class28 {

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public int field78 = 0;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field87 = 1401;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "Luca;")
    public class252 field92;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "Lhl;")
    public class491 field106;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lhl;")
    public class491 field82;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lva;")
    public class513 field75;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lva;")
    public class513 field88;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lud;")
    public class519 field74;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lmda;")
    public class53 field85;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Lmda;")
    public class53 field93;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Ldw;")
    public class676 field84;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Loa;")
    public static class689 field103;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Z")
    public boolean field101;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Z")
    public boolean field73;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Z")
    public boolean field80;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
    public int[] field79;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)I")
    public static final int method58(int arg0, byte arg1, int arg2) {
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        field104++;
        if (arg1 > -107) {
            field103 = null;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public final void method59(byte arg0) {
        field77++;
        if (arg0 != -125) {
            this.field102 = -106;
        }
        int var2 = this.field83;
        boolean var3 = this.field101;
        if (this.field92 != null) {
            class252 var6 = this.field92.method1568(-1, class327.field4771);
            if (var6 == null) {
                this.field91 = 0;
                this.field83 = -1;
                this.field99 = 0;
                this.field90 = 0;
                this.field101 = false;
                this.field79 = null;
                this.field86 = 0;
                this.field73 = false;
            } else {
                this.field91 = var6.field3465;
                this.field99 = var6.field3460;
                this.field79 = var6.field3419;
                this.field101 = var6.field3454;
                this.field73 = var6.field3405;
                this.field90 = var6.field3425;
                this.field83 = var6.field3420;
                this.field86 = var6.field3464 << 9;
            }
        } else if (this.field84 != null) {
            int var4 = class118.method723(arg0 ^ 0xFFFFFFF8, this.field84);
            if (var2 != var4) {
                this.field83 = var4;
                class195 var5 = this.field84.field9594;
                if (var5.field2557 != null) {
                    var5 = var5.method1242(class327.field4771, (byte) -32);
                }
                if (var5 == null) {
                    this.field101 = this.field84.field9594.field2545;
                    this.field90 = this.field86 = 0;
                } else {
                    this.field86 = var5.field2539 << 9;
                    this.field90 = var5.field2571;
                    this.field101 = var5.field2545;
                }
            }
        } else if (this.field74 != null) {
            this.field83 = class238.method1481(this.field74, arg0 + 140);
            this.field86 = this.field74.field7190 << 9;
            this.field90 = this.field74.field7189;
            this.field101 = this.field74.field7192;
        }
        if (this.field83 == var2 && this.field101 == var3) {
            return;
        }
        if (this.field106 == null) {
            return;
        }
        class285.field3866.method3203(this.field106);
        this.field93 = null;
        this.field106 = null;
        this.field88 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method60(int arg0) {
        field103 = null;
        if (arg0 != -1162158679) {
            method61((char) 65420, -14);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(CI)B")
    public static final byte method61(char arg0, int arg1) {
        field97++;
        if (arg1 != 2174) {
            method58(-109, (byte) 44, 47);
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lud;ILdw;ILuca;IZI)V")
    public static final void method62(class519 arg0, int arg1, class676 arg2, int arg3, class252 arg4, int arg5, boolean arg6, int arg7) {
        field76++;
        class9 var8 = new class9();
        if (!arg6) {
            return;
        }
        var8.field105 = arg1;
        var8.field89 = arg3 << 9;
        var8.field102 = arg7 << 9;
        if (arg4 != null) {
            var8.field92 = arg4;
            int var9 = arg4.field3450;
            int var10 = arg4.field3431;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg4.field3450;
                var9 = arg4.field3431;
            }
            var8.field101 = arg4.field3454;
            var8.field100 = arg3 + var9 << 9;
            var8.field79 = arg4.field3419;
            var8.field91 = arg4.field3465;
            var8.field99 = arg4.field3460;
            var8.field86 = arg4.field3464 << 9;
            var8.field90 = arg4.field3425;
            var8.field73 = arg4.field3405;
            var8.field83 = arg4.field3420;
            var8.field94 = arg7 + var10 << 9;
            if (arg4.field3391 != null) {
                var8.field80 = true;
                var8.method59((byte) -125);
            }
            if (var8.field79 != null) {
                var8.field96 = var8.field99 + (int) (Math.random() * (double) (var8.field91 - var8.field99));
            }
            class638.field8704.method378(var8, 31316);
        } else if (arg2 != null) {
            var8.field84 = arg2;
            class195 var11 = arg2.field9594;
            if (var11.field2557 != null) {
                var8.field80 = true;
                var11 = var11.method1242(class327.field4771, (byte) -32);
            }
            if (var11 != null) {
                var8.field100 = arg3 + var11.field2591 << 9;
                var8.field94 = var11.field2591 + arg7 << 9;
                var8.field83 = class118.method723(115, arg2);
                var8.field101 = var11.field2545;
                var8.field86 = var11.field2539 << 9;
                var8.field90 = var11.field2571;
            }
            class612.field8352.method378(var8, 31316);
        } else if (arg0 != null) {
            var8.field74 = arg0;
            var8.field100 = arg3 + arg0.method241(-25747) << 9;
            var8.field94 = arg0.method241(-25747) + arg7 << 9;
            var8.field83 = class238.method1481(arg0, 15);
            var8.field101 = arg0.field7192;
            var8.field86 = arg0.field7190 << 9;
            var8.field90 = arg0.field7189;
            class288.field3881.method2504((long) arg0.field463, 115, var8);
            return;
        }
    }
}
