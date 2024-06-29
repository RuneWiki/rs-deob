import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class57 extends class30 {

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Z")
    public static boolean field1221 = false;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Lia;")
    public static class257 field1219 = class28.method234(-86, ")3");

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lch;")
    public static class148 field1211;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "Lmb;")
    public static class178 field1224;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "[I")
    public static int[] field1212;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIILme;)V")
    public static final void method436(int arg0, int arg1, int arg2, int arg3, class44 arg4) {
        field1217++;
        if (class9.field177 < 3) {
            ((class190) class118.field2120).method485(arg1, arg0, arg4.field926, arg4.field981, class118.field2120.field3193 / 2, class118.field2120.field3204 / 2, class25.field479, 256, arg4.field1010, arg4.field974);
        } else {
            class23.method193(arg1, arg0, 0, arg4.field1010, arg4.field974);
        }
        class75.field1464[arg3] = true;
        if (arg2 != 28024) {
            field1211 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZILmb;III)V")
    public static final void method437(boolean arg0, int arg1, class178 arg2, int arg3, int arg4, int arg5) {
        field1210++;
        class196.field3316 = arg4;
        class252.field4334 = arg2;
        class89.field1707 = 10000;
        class178.field3086 = arg3;
        class19.field405 = arg0;
        class55.field1179 = arg1;
        class244.field4242 = 1;
        if (arg5 == -21260) {
            ;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILad;)V")
    public static final void method438(int arg0, class241 arg1) {
        arg1.field4170 = arg1.field4165;
        field1223++;
        if (arg1.field4148 == 0) {
            arg1.field4133 = 0;
            return;
        }
        if (arg1.field4129 != -1 && arg1.field4144 == 0) {
            class31 var2 = class186.method1263(0, arg1.field4129);
            if (arg1.field4167 > 0 && var2.field595 == 0) {
                arg1.field4133++;
                return;
            }
            if (arg1.field4167 <= 0 && var2.field599 == 0) {
                arg1.field4133++;
                return;
            }
        }
        int var3 = arg1.field4177;
        int var4 = arg1.field4143;
        int var5 = arg1.field4182[arg1.field4148 - 1] * 128 + arg1.field4128 * 64;
        int var6 = arg1.field4119[arg1.field4148 + arg0] * 128 + arg1.field4128 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || (var6 - var4) > 256 || (var6 - var4) < -256) {
            arg1.field4143 = var6;
            arg1.field4177 = var5;
            return;
        }
        if (var5 <= var3) {
            if (var5 >= var3) {
                if (var4 < var6) {
                    arg1.field4125 = 1024;
                } else if (var4 > var6) {
                    arg1.field4125 = 0;
                }
            } else if (var6 > var4) {
                arg1.field4125 = 768;
            } else if (var4 <= var6) {
                arg1.field4125 = 512;
            } else {
                arg1.field4125 = 256;
            }
        } else if (var6 > var4) {
            arg1.field4125 = 1280;
        } else if (var4 <= var6) {
            arg1.field4125 = 1536;
        } else {
            arg1.field4125 = 1792;
        }
        int var7 = arg1.field4125 - arg1.field4118 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field4149;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field4145;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field4176;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field4183;
        }
        if (var8 == -1) {
            var8 = arg1.field4145;
        }
        arg1.field4170 = var8;
        boolean var10 = true;
        if (arg1 instanceof class197) {
            var10 = ((class197) arg1).field3322.field3344;
        }
        if (var10) {
            if (arg1.field4125 != arg1.field4118 && arg1.field4171 == -1 && arg1.field4146 != 0) {
                var9 = 2;
            }
            if (arg1.field4148 > 2) {
                var9 = 6;
            }
            if (arg1.field4148 > 3) {
                var9 = 8;
            }
            if (arg1.field4133 > 0 && arg1.field4148 > 1) {
                arg1.field4133--;
                var9 = 8;
            }
        } else {
            if (arg1.field4148 > 1) {
                var9 = 6;
            }
            if (arg1.field4148 > 2) {
                var9 = 8;
            }
            if (arg1.field4133 > 0 && arg1.field4148 > 1) {
                var9 = 8;
                arg1.field4133--;
            }
        }
        if (arg1.field4173[arg1.field4148 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var4) {
            arg1.field4143 += var9;
            if (var6 < arg1.field4143) {
                arg1.field4143 = var6;
            }
        } else if (var6 < var4) {
            arg1.field4143 -= var9;
            if (var6 > arg1.field4143) {
                arg1.field4143 = var6;
            }
        }
        if (var9 >= 8 && arg1.field4170 == arg1.field4145 && arg1.field4135 != -1) {
            arg1.field4170 = arg1.field4135;
        }
        if (var3 < var5) {
            arg1.field4177 += var9;
            if (var5 < arg1.field4177) {
                arg1.field4177 = var5;
            }
        } else if (var5 < var3) {
            arg1.field4177 -= var9;
            if (arg1.field4177 < var5) {
                arg1.field4177 = var5;
            }
        }
        if (arg1.field4177 == var5 && arg1.field4143 == var6) {
            if (arg1.field4167 > 0) {
                arg1.field4167--;
            }
            arg1.field4148--;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
    public static final void method439(int arg0, int arg1) {
        class44.field994.method831(arg1, -123);
        class39.field783.method831(arg1, arg0 - 27536);
        class231.field3875.method831(arg1, arg0 ^ 0xFFFF9496);
        if (arg0 != 27412) {
            field1219 = null;
        }
        field1220++;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static void method440(byte arg0) {
        if (arg0 >= -95) {
            method440((byte) -93);
        }
        field1211 = null;
        field1219 = null;
        field1224 = null;
        field1212 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II)V")
    public class57(int arg0, int arg1) {
        this.field1214 = arg1;
        this.field1218 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lo;I)V")
    public static final void method441(class164 arg0, int arg1) {
        field1216++;
        if (arg1 == -10305) {
            class94.method691(arg0, 200000, (byte) 117);
        }
    }
}
