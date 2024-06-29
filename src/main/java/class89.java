import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class89 {

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public int field1147 = 128;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
    public int field1151 = 128;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "S")
    public static short field1153 = 1;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "Ljd;")
    public static class216 field1148 = new class216(2, 2);

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "[C")
    public static char[] field1159 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "[I")
    public static int[] field1158 = new int[4096];

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "Z")
    public static boolean field1160 = false;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "Ldr;")
    public static class675 field1157 = new class675(97, -1);

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "Lhm;")
    public static class208 field1161 = new class208(8);

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Lqfa;")
    public final class89 method665(int arg0) {
        if (arg0 != -7085) {
            this.method665(34);
        }
        field1155++;
        return new class89(this.field1145, this.field1151, this.field1147, this.field1154, this.field1146, this.field1149);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZLqfa;)V")
    public final void method666(boolean arg0, class89 arg1) {
        this.field1154 = arg1.field1154;
        field1152++;
        this.field1151 = arg1.field1151;
        if (!arg0) {
            field1161 = null;
        }
        this.field1149 = arg1.field1149;
        this.field1145 = arg1.field1145;
        this.field1146 = arg1.field1146;
        this.field1147 = arg1.field1147;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lrr;IIB)V")
    public static final void method667(class337 arg0, int arg1, int arg2, byte arg3) {
        int var4 = -1 / ((-arg3 - 13) / 61);
        if (arg0.field4273 == 0) {
            arg0.field4153 = arg0.field4222;
        } else if (arg0.field4273 == 1) {
            arg0.field4153 = (arg2 - arg0.field4309) / 2 + arg0.field4222;
        } else if (arg0.field4273 == 2) {
            arg0.field4153 = arg2 - arg0.field4309 - arg0.field4222;
        } else if (arg0.field4273 == 3) {
            arg0.field4153 = arg0.field4222 * arg2 >> 14;
        } else if (arg0.field4273 == 4) {
            arg0.field4153 = (arg0.field4222 * arg2 >> 14) + (arg2 - arg0.field4309) / 2;
        } else {
            arg0.field4153 = arg2 - arg0.field4309 - (arg0.field4222 * arg2 >> 14);
        }
        if (arg0.field4281 == 0) {
            arg0.field4227 = arg0.field4303;
        } else if (arg0.field4281 == 1) {
            arg0.field4227 = (arg1 - arg0.field4211) / 2 + arg0.field4303;
        } else if (arg0.field4281 == 2) {
            arg0.field4227 = arg1 - arg0.field4211 - arg0.field4303;
        } else if (arg0.field4281 == 3) {
            arg0.field4227 = arg0.field4303 * arg1 >> 14;
        } else if (arg0.field4281 == 4) {
            arg0.field4227 = (arg0.field4303 * arg1 >> 14) + (arg1 - arg0.field4211) / 2;
        } else {
            arg0.field4227 = arg1 - arg0.field4211 - (arg0.field4303 * arg1 >> 14);
        }
        field1144++;
        if (!class373.field4819) {
            return;
        }
        if (client.method1693(arg0).field4604 == 0 && arg0.field4212 != 0) {
            return;
        }
        if (arg0.field4227 < 0) {
            arg0.field4227 = 0;
        } else if (arg1 < arg0.field4227 + arg0.field4211) {
            arg0.field4227 = arg1 - arg0.field4211;
        }
        if (arg0.field4153 < 0) {
            arg0.field4153 = 0;
            return;
        }
        if (arg2 < (arg0.field4309 + arg0.field4153)) {
            arg0.field4153 = arg2 - arg0.field4309;
            return;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZI)Z")
    public static final boolean method668(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1156++;
            return (arg2 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
    public static final void method669(byte arg0) {
        field1150++;
        if (arg0 != -38) {
            field1159 = null;
        }
        int var1 = class611.field8310.method2746(102, class628.field8526);
        if (var1 == 0) {
            class252.field3249 = null;
            class433.method2386(0, 18);
        } else if (var1 == 1) {
            class374.method2162(0, (byte) 0);
            class433.method2386(512, 37);
            if (class234.field3033 != null) {
                class173.method1037(2664);
            }
        } else {
            class374.method2162(0, (byte) (class197.field2318 - 4 & 0xFF));
            class433.method2386(2, arg0 + 119);
        }
        class422.field5354 = class675.field9219;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)V")
    public static void method670(byte arg0) {
        field1161 = null;
        field1157 = null;
        field1158 = null;
        if (arg0 == 36) {
            field1148 = null;
            field1159 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(I)V")
    public class89(int arg0) {
        this.field1145 = arg0;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IIIIII)V")
    private class89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1149 = arg5;
        this.field1154 = arg3;
        this.field1147 = arg2;
        this.field1145 = arg0;
        this.field1146 = arg4;
        this.field1151 = arg1;
    }
}
