import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class533 extends class469 implements class534 {

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lpl;")
    public class469 field7863;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "Lgw;")
    public static class118 field7867 = new class118();

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I", line = 4)
    public final int method560(int arg0) {
        if (arg0 == -29863) {
            field7869++;
            return 0;
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 15)
    public final void method548(int arg0) {
        int var2 = 53 / ((-arg0 - 37) / 34);
        field7868++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lqa;I)V", line = 26)
    public final void method551(class167 arg0, int arg1) {
        field7859++;
        if (arg1 <= 62) {
            this.method562(null, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I", line = 37)
    public final int method559(byte arg0) {
        if (arg0 < 3) {
            return -83;
        } else {
            field7866++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILqa;)Z", line = 49)
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        if (arg2 < 42) {
            this.field7863 = null;
        }
        field7862++;
        return false;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I", line = 60)
    public final int method561(byte arg0) {
        if (arg0 != -85) {
            this.method561((byte) 58);
        }
        field7860++;
        return 0;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIILpl;)V", line = 71)
    public class533(int arg0, int arg1, int arg2, int arg3, int arg4, class469 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class102.method749(16383, arg1, arg0));
        this.field7863 = arg5;
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I", line = 83)
    public final int method910(int arg0) {
        field7865++;
        if (arg0 != 8) {
            method3156(-58);
        }
        return 0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lqa;B)Lem;", line = 94)
    public final class154 method562(class167 arg0, byte arg1) {
        field7870++;
        if (arg1 >= -117) {
            this.method559((byte) -15);
        }
        return this.field7863.method562(arg0, (byte) -127);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILqa;)Lnj;", line = 106)
    public final class166 method554(int arg0, class167 arg1) {
        field7873++;
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V", line = 117)
    public static void method3154(int arg0) {
        field7867 = null;
        if (arg0 != 0) {
            method3156(72);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLqa;)V", line = 128)
    public final void method557(byte arg0, class167 arg1) {
        field7871++;
        int var3 = 101 % ((arg0 - 13) / 59);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lqa;B)V", line = 139)
    public final void method552(class167 arg0, byte arg1) {
        if (arg1 >= -119) {
            this.method559((byte) 110);
        }
        field7861++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lbt;Z[Lbn;)Lej;", line = 156)
    public static final class80 method3155(class33 arg0, boolean arg1, class314[] arg2) {
        field7872++;
        if (!arg1) {
            field7867 = null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field4680 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field4680);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class413.field5849, 0);
        if (class413.field5849[0] == 0) {
            if (class413.field5849[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class413.field5849, 1);
            if (class413.field5849[1] > 1) {
                byte[] var7 = new byte[class413.field5849[1]];
                OpenGL.glGetInfoLogARB(var4, class413.field5849[1], class413.field5849, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class413.field5849[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field4680);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class80(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILqa;I)Lka;", line = 226)
    public final class336 method550(int arg0, class167 arg1, int arg2) {
        if (arg0 == -14322) {
            field7857++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V", line = 237)
    public static final void method3156(int arg0) {
        field7858++;
        if (arg0 != -28008) {
            method3155(null, false, null);
        }
        for (int var1 = 0; var1 < class162.field2458; var1++) {
            int var2 = class56.field1009[var1];
            class279 var3 = ((class193) class390.field5539.method2284(true, (long) var2)).field2805;
            int var4 = class336.field4966.method3072((byte) -119);
            if ((var4 & 0x20) != 0) {
                var4 += class336.field4966.method3072((byte) -124) << 8;
            }
            if ((var4 & 0x200) != 0) {
                int var5 = class336.field4966.method3075(90);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class336.field4966.method3018(566990904);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class336.field4966.method3075(104);
                    var8[var9] = class336.field4966.method3081(arg0 + 52091);
                }
                class257.method1660((byte) 74, var7, var6, var8, var3);
            }
            if ((var4 & 0x400) != 0) {
                var3.field236 = class336.field4966.method3034((byte) -47);
                var3.field279 = class336.field4966.method3026(arg0 ^ 0x6D10);
                var3.field325 = class336.field4966.method3026(-122);
                var3.field278 = class336.field4966.method3026(-109);
                var3.field308 = class336.field4966.method3065((byte) -127) + class24.field349;
                var3.field314 = class336.field4966.method3018(arg0 + 567018912) + class24.field349;
                var3.field266 = class336.field4966.method3060(-23438);
                var3.field325 += var3.field343[0];
                var3.field333 = 1;
                var3.field335 = 0;
                var3.field236 += var3.field343[0];
                var3.field278 += var3.field344[0];
                var3.field279 += var3.field344[0];
            }
            if ((var4 & 0x10) != 0) {
                int var11 = class336.field4966.method3018(566990904);
                int var12 = class336.field4966.method3053(-129);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var13 = class336.field4966.method3075(-80);
                var3.method132(false, var13, (byte) -12, var11, var12);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field4157.method1976(-65)) {
                    class173.method1217((byte) 123, var3);
                }
                var3.method1793(class117.field1812.method2310(-1, class336.field4966.method3081(24083)), arg0 ^ 0x6D0B);
                var3.method137((byte) 87, var3.field4157.field4620);
                var3.field305 = var3.field4157.field4604 << 3;
                if (var3.field4157.method1976(-86)) {
                    class332.method2105(arg0 ^ 0xFFFF92B7, var3.field343[0], var3.field6956, var3, 0, var3.field344[0], null, null);
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field4154 = class336.field4966.method3065((byte) -128);
                var3.field4161 = class336.field4966.method3018(566990904);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field276 = class336.field4966.method3036((byte) 99);
                var3.field268 = class336.field4966.method3034((byte) -64);
                var3.field253 = class336.field4966.method3026(-124);
                var3.field265 = (byte) class336.field4966.method3076(0);
                var3.field257 = class24.field349 + class336.field4966.method3065((byte) -128);
                var3.field296 = class24.field349 + class336.field4966.method3065((byte) -128);
            }
            if ((var4 & 0x2) != 0) {
                var3.field239 = class336.field4966.method3082((byte) 71);
                var3.field306 = 100;
            }
            if ((var4 & 0x40) != 0) {
                var3.field260 = class336.field4966.method3081(24083);
                if (var3.field260 == 65535) {
                    var3.field260 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var14 = class336.field4966.method3064(-2);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var15 = class336.field4966.method3076(0);
                class405.method2415(var14, 0, var3, var15);
            }
            if ((var4 & 0x8) != 0) {
                int var16 = class336.field4966.method3033(arg0 + 39798);
                int var17 = class336.field4966.method3060(-23438);
                var3.method124((byte) -9, var16, class24.field349, var17);
            }
            if ((var4 & 0x2000) != 0) {
                int var18 = class336.field4966.method3018(arg0 ^ 0xDE340AA0);
                var3.field291 = class336.field4966.method3072((byte) -128);
                var3.field263 = class336.field4966.method3076(arg0 + 28008);
                var3.field272 = (var18 & 0x8000) != 0;
                var3.field304 = var18 & 0x7FFF;
                var3.field310 = class24.field349 + var3.field304 + var3.field291;
            }
            if ((var4 & 0x4) != 0) {
                int var19 = class336.field4966.method3033(arg0 ^ 0xFFFFBC96);
                int var20 = class336.field4966.method3072((byte) -128);
                var3.method124((byte) -9, var19, class24.field349, var20);
                var3.field319 = class24.field349 + 300;
                var3.field241 = class336.field4966.method3072((byte) -127);
            }
            if ((var4 & 0x800) != 0) {
                int var21 = class336.field4966.method3081(24083);
                int var22 = class336.field4966.method3028(-23254);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var23 = class336.field4966.method3072((byte) -127);
                var3.method132(true, var23, (byte) -12, var21, var22);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Z", line = 445)
    public final boolean method547(int arg0) {
        int var2 = 55 / ((arg0 + 73) / 39);
        field7864++;
        return false;
    }
}
