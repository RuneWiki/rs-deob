import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class53 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Z")
    public boolean field643 = false;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "F")
    public static float field647;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IC)Z", line = 4)
    public static final boolean method319(int arg0, char arg1) {
        field653++;
        if (arg0 != -256) {
            return false;
        } else if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 32)
    public static final void method320(int arg0) {
        field646++;
        class89.field1108.method1241(117);
        int var1 = 64 % ((arg0 + 23) / 60);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BIILjava/lang/String;II)I", line = 43)
    public static final int method321(byte[] arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg4 != -14337) {
            field647 = -1.6618197F;
        }
        int var6 = arg1 - arg2;
        field651++;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg5 + var7] = -97;
            } else {
                arg0[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIZ)Ltb;", line = 180)
    public final class234 method322(byte arg0, int arg1, boolean arg2) {
        field642++;
        class234 var4 = (class234) class167.field2325.method1239((byte) -19, (long) ((arg2 ? 262144 : 0) | this.field650 | arg1 << 16));
        if (var4 != null) {
            return var4;
        }
        class61.field748.method1194(this.field650, (byte) 126);
        class234 var5 = class315.method2203(class61.field748, -635, 0, this.field650);
        if (var5 != null) {
            var5.method1656(class133.field1821, class61.field756, class142.field1991);
            var5.field4741 = var5.field4743;
            var5.field4744 = var5.field4749;
            if (arg2) {
                var5.method1652();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                var5.method1650();
            }
            class167.field2325.method1243(var5, (long) ((arg2 ? 262144 : 0) | arg1 << 16 | this.field650), -29282);
        }
        if (arg0 < 108) {
            this.method325(63, (class107) null, (byte) -103);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILp;)V", line = 217)
    private final void method323(int arg0, int arg1, int arg2, class107 arg3) {
        if (arg0 == 1) {
            this.field650 = arg3.method624(14612);
        } else if (arg0 == 2) {
            this.field641 = arg3.method622((byte) 74);
        } else if (arg0 == 3) {
            this.field643 = true;
        } else if (arg0 == 4) {
            this.field650 = -1;
        }
        field645++;
        if (arg2 != -13716) {
            this.field650 = 46;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V", line = 246)
    public static final void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field649++;
        if (arg7 != 2) {
            field647 = -0.8918072F;
        }
        if (arg5 < 1 || arg0 < 1 || arg5 > 102 || arg0 > 102) {
            return;
        }
        if (!class339.method2348((byte) 69) && (class264.field4163[0][arg5][arg0] & 0x2) == 0) {
            int var8 = arg1;
            if ((class264.field4163[arg1][arg5][arg0] & 0x8) != 0) {
                var8 = 0;
            }
            if (class244.field3669 != var8) {
                return;
            }
        }
        int var9 = arg1;
        if (arg1 < 3 && (class264.field4163[1][arg5][arg0] & 0x2) == 2) {
            var9 = arg1 + 1;
        }
        class40.method232(arg1, var9, arg5, arg0, arg4, (byte) -81, class149.field2072[arg1]);
        if (arg6 >= 0) {
            boolean var10 = class90.field1124;
            class90.field1124 = true;
            class91.method532(arg3, arg2, false, arg1, false, var9, class149.field2072[arg1], arg5, 3, arg6, arg0);
            class90.field1124 = var10;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILp;B)V", line = 305)
    public final void method325(int arg0, class107 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method661(-1);
            if (var4 == 0) {
                field652++;
                int var5 = 101 / ((arg2 - 25) / 54);
                return;
            }
            this.method323(var4, arg0, -13716, arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I", line = 333)
    public static final int method326(int arg0) {
        class313.field4837 = 0;
        if (arg0 < 88) {
            method320(-40);
        }
        field648++;
        return class141.method937(-71);
    }
}
