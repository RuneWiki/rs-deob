import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class66 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Z")
    public boolean field980 = false;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public int field984 = 2;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Z")
    public boolean field992 = true;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public int field982 = 0;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public int field995 = 0;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public int field996 = 127;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Z")
    public boolean field989 = false;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public int field994 = 2;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Z")
    public boolean field998 = true;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Z")
    public boolean field993 = true;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
    public boolean field997 = true;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public int field987 = 1;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
    public boolean field988 = true;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public int field1002 = 0;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field1000 = 0;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public int field1007 = 2;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "Z")
    public boolean field1017 = true;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public int field991 = 2;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Z")
    public boolean field1014 = true;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public int field1003 = 0;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "Z")
    public boolean field1020 = true;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "Z")
    public boolean field1004 = true;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public int field1018 = 255;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Z")
    public boolean field979 = false;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Z")
    public boolean field1016 = true;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public int field1024 = 3;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "Z")
    public boolean field1006 = true;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Z")
    public boolean field1019 = true;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public int field1022 = 127;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public int field1001 = 0;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    public int field1026 = 0;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
    public static int[] field990 = new int[200];

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "S")
    public static short field999 = 256;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Lmv;")
    public static class252 field1009 = new class252(5000);

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "Z")
    public boolean field1013;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
    public boolean field985;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
    public boolean field986;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZIZII)V")
    public static final void method386(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 > arg0) {
            int var7 = (arg0 + arg6) / 2;
            int var8 = arg0;
            class412 var9 = class92.field1377[var7];
            class92.field1377[var7] = class92.field1377[arg6];
            class92.field1377[arg6] = var9;
            for (int var10 = arg0; var10 < arg6; var10++) {
                if (class353.method2209(arg2, arg4, class92.field1377[var10], arg3 ^ 0xFFFFC4C5, arg1, var9, arg5) <= 0) {
                    class412 var11 = class92.field1377[var10];
                    class92.field1377[var10] = class92.field1377[var8];
                    class92.field1377[var8++] = var11;
                }
            }
            class92.field1377[arg6] = class92.field1377[var8];
            class92.field1377[var8] = var9;
            method386(arg0, arg1, arg2, arg3, arg4, arg5, var8 - 1);
            method386(var8 + 1, arg1, arg2, -7737, arg4, arg5, arg6);
        }
        field1023++;
        if (arg3 != -7737) {
            field999 = 8;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZB)V")
    public final void method387(int arg0, boolean arg1, byte arg2) {
        if (arg0 == 1 || arg0 == 3) {
            this.field986 = arg1;
        } else {
            this.field985 = arg1;
        }
        if (arg2 >= -56) {
            method390(-41, -109, 92, -51);
        }
        field1010++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
    public static final void method388(byte arg0, int arg1) {
        field1011++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class142.field2119 = arg1;
        if (arg0 != -49) {
            field999 = -106;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILdh;)V")
    public static final void method389(int arg0, class209 arg1) {
        field981++;
        int var2 = 0;
        if (arg0 != -65536) {
            field1009 = null;
        }
        while (var2 < class213.field3113) {
            int var3 = arg1.method1434(arg0 + 82423);
            int var4 = arg1.method1450((byte) 101);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class6.field83[var3] != null) {
                class6.field83[var3].field888 = var4;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
    public static final void method390(int arg0, int arg1, int arg2, int arg3) {
        class183.field2684 = new byte[arg0][arg1][arg2];
        field1005++;
        if (arg3 != 6619) {
            field1009 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)I")
    public static final int method391(int arg0, int arg1, int arg2) {
        if (arg0 < 35) {
            return -83;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        field1015++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Z")
    public final boolean method392(int arg0, int arg1) {
        field1008++;
        if (arg0 != -2) {
            method389(39, null);
        }
        return arg1 == 1 || arg1 == 3 ? this.field986 : this.field985;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)I")
    public final int method393(int arg0, int arg1) {
        field1021++;
        if (arg1 != 1) {
            method388((byte) 23, -110);
        }
        return arg0 == 1 || arg0 == 3 ? this.field984 : this.field1003;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method394(byte arg0) {
        field990 = null;
        field1009 = null;
        if (arg0 < 40) {
            method386(11, 74, false, 6, false, -39, -125);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIB)V")
    public final void method395(int arg0, int arg1, byte arg2) {
        field1012++;
        if (arg2 != -61) {
            this.field1022 = 78;
        }
        if (arg1 == 1 || arg1 == 3) {
            this.field984 = arg0;
        } else {
            this.field1003 = arg0;
        }
    }
}
