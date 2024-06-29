import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class130 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Z")
    public boolean field2032;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Z")
    public boolean field2036;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[S")
    public short[] field2026;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lso;")
    public static class335 field2037 = new class335();

    @OriginalMember(owner = "client!m", name = "u", descriptor = "[Z")
    public static boolean[] field2043 = new boolean[100];

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    private int field2030;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    private int field2033;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lni;")
    public class369 field2038;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Ljk;")
    public static class456 field2042;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILiu;)Z", line = 7)
    public static final boolean method957(int arg0, int arg1, class415 arg2) {
        field2034++;
        int var3 = arg2.method2487(2, -103);
        if (var3 == 0) {
            if (arg2.method2487(1, -81) != 0) {
                method957(-1190546226, arg1, arg2);
            }
            int var4 = arg2.method2487(6, -58);
            int var5 = arg2.method2487(6, -30);
            boolean var6 = arg2.method2487(1, -85) == 1;
            if (var6) {
                class8.field60[class177.field2636++] = arg1;
            }
            if (class494.field7143[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class22 var7 = class263.field3977[arg1];
            class510 var8 = class494.field7143[arg1] = new class510();
            var8.field290 = arg1;
            if (class138.field2148[arg1] != null) {
                var8.method2967(-111, class138.field2148[arg1]);
            }
            var8.method130((byte) 31, var7.field229, true);
            var8.field260 = var7.field230;
            int var9 = var7.field228;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field7375 = var7.field233;
            var8.field342[0] = class319.field4736[arg1];
            var8.field6956 = (byte) var10;
            var8.method2965((var11 << 6) + var4 - class82.field1315, (byte) 44, (var12 << 6) + var5 - class501.field7240);
            var8.field7382 = false;
            class263.field3977[arg1] = null;
            return true;
        }
        if (arg0 != -1190546226) {
            method957(-47, 18, null);
        }
        if (var3 == 1) {
            int var13 = arg2.method2487(2, -57);
            int var14 = class263.field3977[arg1].field228;
            class263.field3977[arg1].field228 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method2487(5, -125);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class263.field3977[arg1].field228;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FDA48) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class263.field3977[arg1].field228 = (var20 << 14) + (var19 << 28) + var21;
            return false;
        } else {
            int var22 = arg2.method2487(18, arg0 ^ 0x46F64B33);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class263.field3977[arg1].field228;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class263.field3977[arg1].field228 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Canvas;)Lan;", line = 168)
    public static final class20 method958(int arg0, Canvas arg1) {
        field2031++;
        try {
            Class var2 = Class.forName("jf");
            class20 var3 = (class20) var2.getDeclaredConstructor().newInstance();
            var3.method111((byte) 127, arg1);
            return arg0 < 46 ? null : var3;
        } catch (Throwable var5) {
            class419 var4 = new class419();
            var4.method111((byte) 126, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZB)V", line = 195)
    public final void method959(int arg0, boolean arg1, byte arg2) {
        field2039++;
        if (arg2 < 121) {
            method957(-111, 77, null);
        }
        int var6;
        if (arg1) {
            var6 = 2048;
        } else {
            int var4 = this.field2029 * arg0 / 50 + this.field2024 & 0x7FF;
            int var5 = this.field2033;
            if (var5 == 1) {
                var6 = (class358.field5204[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class92.field1482[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field2038.method1509((byte) -88, (float) ((this.field2030 * var6 >> 11) + this.field2023) / 2048.0F);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 275)
    public static void method960(byte arg0) {
        field2037 = null;
        if (arg0 >= -68) {
            field2043 = null;
        }
        field2043 = null;
        field2042 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lqa;IIBIII)V", line = 288)
    private final void method961(class167 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2025++;
        if (arg3 < 29) {
            this.field2028 = 123;
        }
        this.field2038 = arg0.method334(arg1, arg4, arg6, arg2, arg5, 1.0F);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIB)V", line = 302)
    public final void method962(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field2023 = arg2;
        this.field2029 = arg0;
        this.field2030 = arg1;
        this.field2033 = arg3;
        if (arg4 != -47) {
            method957(-111, 83, null);
        }
        field2041++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 323)
    private final void method963(int arg0) {
        if (arg0 != 1792) {
            this.field2024 = -63;
        }
        int var2 = this.field2027;
        if (var2 == 2) {
            this.field2029 = 2048;
            this.field2033 = 1;
            this.field2030 = 2048;
            this.field2023 = 0;
        } else if (var2 == 3) {
            this.field2033 = 1;
            this.field2023 = 0;
            this.field2029 = 4096;
            this.field2030 = 2048;
        } else if (var2 == 4) {
            this.field2029 = 2048;
            this.field2030 = 2048;
            this.field2033 = 4;
            this.field2023 = 0;
        } else if (var2 == 5) {
            this.field2033 = 4;
            this.field2030 = 2048;
            this.field2029 = 8192;
            this.field2023 = 0;
        } else if (var2 == 12) {
            this.field2030 = 2048;
            this.field2033 = 2;
            this.field2029 = 2048;
            this.field2023 = 0;
        } else if (var2 == 13) {
            this.field2033 = 2;
            this.field2030 = 2048;
            this.field2029 = 8192;
            this.field2023 = 0;
        } else if (var2 == 10) {
            this.field2023 = 1536;
            this.field2029 = 2048;
            this.field2030 = 512;
            this.field2033 = 3;
        } else if (var2 == 11) {
            this.field2023 = 1536;
            this.field2033 = 3;
            this.field2030 = 512;
            this.field2029 = 4096;
        } else if (var2 == 6) {
            this.field2023 = 1280;
            this.field2033 = 3;
            this.field2030 = 768;
            this.field2029 = 2048;
        } else if (var2 == 7) {
            this.field2023 = 1280;
            this.field2029 = 4096;
            this.field2030 = 768;
            this.field2033 = 3;
        } else if (var2 == 8) {
            this.field2033 = 3;
            this.field2030 = 1024;
            this.field2029 = 2048;
            this.field2023 = 1024;
        } else if (var2 == 9) {
            this.field2029 = 4096;
            this.field2033 = 3;
            this.field2030 = 1024;
            this.field2023 = 1024;
        } else if (var2 == 14) {
            this.field2023 = 1280;
            this.field2030 = 768;
            this.field2029 = 2048;
            this.field2033 = 1;
        } else if (var2 == 15) {
            this.field2033 = 1;
            this.field2030 = 512;
            this.field2029 = 4096;
            this.field2023 = 1536;
        } else if (var2 == 16) {
            this.field2033 = 1;
            this.field2030 = 256;
            this.field2023 = 1792;
            this.field2029 = 8192;
        } else {
            this.field2030 = 2048;
            this.field2029 = 2048;
            this.field2033 = 0;
            this.field2023 = 0;
        }
        field2035++;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 520)
    protected class130() {
        if (class92.field1482 == null) {
            class529.method3140((byte) 115);
        }
        this.method963(1792);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lqa;Lwn;I)V", line = 532)
    public class130(class167 arg0, class519 arg1, int arg2) {
        if (class92.field1482 == null) {
            class529.method3140((byte) -71);
        }
        this.field2028 = arg1.method3072((byte) -122);
        this.field2032 = (this.field2028 & 0x8) != 0;
        this.field2036 = (this.field2028 & 0x10) != 0;
        this.field2028 &= 0x7;
        int var4 = arg1.method3018(566990904) << arg2;
        int var5 = arg1.method3018(566990904) << arg2;
        int var6 = arg1.method3018(566990904) << arg2;
        int var7 = arg1.method3072((byte) -120);
        int var8 = var7 * 2 + 1;
        this.field2026 = new short[var8];
        for (int var9 = 0; var9 < this.field2026.length; var9++) {
            short var13 = (short) arg1.method3018(566990904);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field2026[var9] = (short) class442.method2600(var14 << 8, var15);
        }
        int var10 = (var7 << class322.field4795) + class185.field2738;
        int var11 = class167.field2517 == null ? class470.field6825[class119.method871(arg1.method3018(566990904), 0) & 0xFFFF] : class167.field2517[arg1.method3018(566990904)];
        int var12 = arg1.method3072((byte) -123);
        this.field2027 = var12 & 0x1F;
        this.field2024 = var12 & 0xE0 << 3;
        if (this.field2027 != 31) {
            this.method963(1792);
        }
        this.method961(arg0, var4, var10, (byte) 74, var6, var11, var5);
    }
}
