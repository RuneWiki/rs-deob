import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class436 extends class665 {

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lvfa;")
    private class623 field6359;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public int field6363;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "Lok;")
    private class228 field6369;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "F")
    public float field6373;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "[I")
    private int[] field6372;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public int field6367;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public int field6374;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public int field6365;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "Ljca;")
    private class636 field6361;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "Lwba;")
    public static class46 field6378 = new class46();

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "Ljava/lang/String;")
    public static String field6383 = "";

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field6384 = 0;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "Lwba;")
    public static class46 field6382 = new class46();

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Llq;")
    private class512 field6360;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6368;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6380;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)V", line = 8)
    public final void method2588(byte arg0, int arg1) {
        field6358++;
        if (arg0 >= -24) {
            this.field6368 = null;
        }
        this.field6368.method3473(arg1 * 4 + 3);
        this.field6368.method3485(-1);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V", line = 25)
    public static final void method2589(boolean arg0, byte arg1) {
        field6371++;
        if (field6383.length() == 0) {
            return;
        }
        class262.method1723(true, "--> " + field6383);
        class78.method715(arg0, 120, field6383, false);
        class126.field1881 = 0;
        class689.field9706 = 0;
        if (arg1 == -4) {
            field6383 = "";
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([III)V", line = 43)
    public final void method2590(int[] arg0, int arg1, int arg2) {
        if (arg2 >= -32) {
            field6381 = -19;
        }
        field6366++;
        int var4 = 0;
        class231 var5 = this.field6369.field3510;
        var5.field9761 = 0;
        if (this.field6369.field3514) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field6359.field8710[var7];
                int var9 = this.field6372[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method3852(false, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method3852(false, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method3852(false, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field6359.field8710[var13];
                int var15 = this.field6372[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method3843(var14[var17++] & 0xFFFF, true);
                            var4++;
                            var5.method3843(var14[var17++] & 0xFFFF, true);
                            var4++;
                            var5.method3843(var14[var17++] & 0xFFFF, true);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field6361.method1948(var5.field9761, var5.field9796, (byte) -99, 5123);
        this.field6369.method1562((byte) -12, this.field6359.field8736, this.field6359.field8740, this.field6360, this.field6359.field8735);
        this.field6369.method1570((this.field6359.field8698 & 0x8) != 0, 0, this.field6374, (this.field6359.field8698 & 0x7) != 0);
        if (this.field6369.field3479) {
            this.field6369.method195(Integer.MAX_VALUE, this.field6363, this.field6367, this.field6365);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field6373, 1.0F / this.field6373, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field6369.method1562((byte) -12, this.field6359.field8736, this.field6359.field8740, this.field6360, this.field6359.field8735);
        this.field6369.method1522((byte) 31, 0, 4, this.field6361, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(BI)V", line = 169)
    public final void method2591(byte arg0, int arg1) {
        field6364++;
        this.field6380 = this.field6369.field3406.method3468(arg1 * 4, true);
        this.field6368 = new Stream(this.field6380);
        if (arg0 < 79) {
            this.field6359 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 181)
    public static void method2592(int arg0) {
        field6382 = null;
        if (arg0 == Integer.MAX_VALUE) {
            field6383 = null;
            field6378 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)Lsn;", line = 193)
    public static final class583 method2593(int arg0, boolean arg1) {
        field6375++;
        class583[] var2 = class375.method2262(arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class583 var4 = var2[var3];
            if (var4.field8194 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V", line = 219)
    public final void method2594(int arg0, byte arg1) {
        this.field6368.method3471();
        field6379++;
        class283 var3 = this.field6369.method1533(this.field6380, arg0 * 4, 4, arg1, false);
        this.field6360 = new class512(var3, 5121, 4, 0);
        this.field6368 = null;
        this.field6380 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZFII)V", line = 234)
    public final void method2595(int arg0, boolean arg1, float arg2, int arg3, int arg4) {
        field6377++;
        if (this.field6374 != -1) {
            class159 var6 = this.field6369.field2384.method1386(this.field6374, -6514);
            int var7 = var6.field2292 & 0xFF;
            if (var7 != 0 && var6.field2300 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2297 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var12 << 8 & 0xFF00A2) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (!arg1) {
            this.method2597(55, 97, -66, -125);
        }
        if (arg2 != 1.0F) {
            int var15 = (arg3 & 0xFF6E80) >> 16;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            int var19 = (int) ((float) var16 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var18 << 16 | var19 << 8;
        }
        this.field6368.method3473(arg0 * 4);
        this.field6368.method3485((byte) (arg3 >> 16));
        this.field6368.method3485((byte) (arg3 >> 8));
        this.field6368.method3485((byte) arg3);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILmo;)V", line = 342)
    public static final void method2596(int arg0, class695 arg1) {
        if (arg0 != 4) {
            return;
        }
        field6362++;
        byte[] var2 = new byte[24];
        if (class68.field1242 != null) {
            try {
                class68.field1242.method2533(0L, arg0 - 4);
                class68.field1242.method2531(-53, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method3857(7010, 24, var2, 0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)V", line = 388)
    public final void method2597(int arg0, int arg1, int arg2, int arg3) {
        field6370++;
        if (arg3 == -12405) {
            this.field6372[this.field6359.field631 * arg0 + arg2] = class486.method2826(this.field6372[this.field6359.field631 * arg0 + arg2], 0x1 << arg1);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 403)
    public static final void method2598(int arg0) {
        field6376++;
        class203 var1 = null;
        try {
            var1 = class4.method12("2", (byte) -118);
            class695 var2 = new class695((class390.field5782 * 6) + 3);
            var2.method3853((byte) 51, 1);
            var2.method3852(false, class390.field5782);
            for (int var3 = 0; var3 < class524.field7403.length; var3++) {
                if (class591.field8281[var3]) {
                    var2.method3852(false, var3);
                    var2.method3868(class524.field7403[var3], -318419336);
                }
            }
            if (arg0 >= -32) {
                method2593(-41, false);
            }
            var1.method1345(var2.field9761, 0, var2.field9796, -4290);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method1344((byte) 124);
            }
        } catch (Exception var4) {
        }
        class580.field8175 = class490.method2840(true);
        class52.field1042 = false;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lvfa;IIIII)V", line = 456)
    public class436(class623 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6359 = arg0;
        this.field6363 = arg3;
        this.field6369 = this.field6359.field8708;
        this.field6373 = arg2;
        this.field6372 = new int[this.field6359.field632 * this.field6359.field631];
        this.field6367 = arg4;
        this.field6374 = arg1;
        this.field6365 = arg5;
        this.field6361 = new class636(this.field6369, 5123, null, 1);
    }
}
