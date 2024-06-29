import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class165 {

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field2547 = 99;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field2556 = -1;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public int field2558 = 5;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Z")
    public boolean field2543 = false;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Z")
    public boolean field2562 = false;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field2553 = 2;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Z")
    public boolean field2550 = false;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field2551 = -1;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public int field2566 = -1;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public int field2569 = -1;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Z")
    public boolean field2546 = false;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public int field2549 = -1;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Z")
    public static boolean field2541 = false;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "Liv;")
    public static class64 field2568 = new class64(70, -1);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lnt;")
    public class147 field2554;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2561;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "Z")
    public static boolean field2567;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[I")
    public int[] field2539;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "[I")
    private int[] field2559;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "[I")
    public int[] field2564;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "[Z")
    public boolean[] field2560;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[[I")
    public int[][] field2544;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BZII)I")
    public final int method1215(byte arg0, boolean arg1, int arg2, int arg3) {
        field2570++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2539[arg2];
        class291 var8 = null;
        class291 var9 = this.field2554.method1129(var7 >> 16, (byte) 121);
        if (arg0 != -34) {
            return 110;
        }
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2546 || class21.field428) && arg3 != -1 && arg3 < this.field2539.length) {
            int var11 = this.field2539[arg3];
            var8 = this.field2554.method1129(var11 >> 16, (byte) 46);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2550) {
            var5 |= 0x200;
        }
        if (var9.method1839(-126, var10)) {
            var5 |= 0x80;
        }
        if (var9.method1841(var10, 0)) {
            var5 |= 0x100;
        }
        if (var9.method1837(var10, (byte) 84)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1839(-111, var6)) {
                var5 |= 0x80;
            }
            if (var8.method1841(var6, 0)) {
                var5 |= 0x100;
            }
            if (var8.method1837(var6, (byte) 84)) {
                var5 |= 0x400;
            }
        }
        if (this.field2559 != null && arg1) {
            if (arg2 < this.field2559.length) {
                int var12 = this.field2559[arg2];
                if (var12 != 65535) {
                    class291 var13 = this.field2554.method1129(var12 >> 16, (byte) 92);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1839(arg0 ^ 0x5D, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1841(var14, 0)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1837(var14, (byte) 84)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field2546 || class21.field428) && arg3 != -1 && this.field2559.length > arg3) {
                int var15 = this.field2559[arg3];
                if (var15 != 65535) {
                    class291 var16 = this.field2554.method1129(var15 >> 16, (byte) 120);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1839(-126, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1841(var17, 0)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1837(var17, (byte) 84)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public final void method1216(byte arg0) {
        if (this.field2566 == -1) {
            if (this.field2560 == null) {
                this.field2566 = 0;
            } else {
                this.field2566 = 2;
            }
        }
        if (this.field2556 == -1) {
            if (this.field2560 == null) {
                this.field2556 = 0;
            } else {
                this.field2556 = 2;
            }
        }
        field2563++;
        if (arg0 != 8) {
            this.method1219((byte) 123, null, 47);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILc;IIIB)Lc;")
    public final class121 method1217(int arg0, int arg1, int arg2, class121 arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2552++;
        int var9 = this.field2564[arg0];
        int var10 = this.field2539[arg0];
        class291 var11 = this.field2554.method1129(var10 >> 16, (byte) 117);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg3.method938(arg7, arg6, true);
        }
        class291 var13 = null;
        if ((this.field2546 || class21.field428) && arg1 != -1 && this.field2539.length > arg1) {
            int var14 = this.field2539[arg1];
            var13 = this.field2554.method1129(var14 >> 16, (byte) 124);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field2550) {
            arg6 |= 0x200;
        }
        if (var11.method1839(-122, var12)) {
            arg6 |= 0x80;
        }
        if (var11.method1841(var12, arg4 ^ arg4)) {
            arg6 |= 0x100;
        }
        if (var11.method1837(var12, (byte) 84)) {
            arg6 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1839(-97, arg1)) {
                arg6 |= 0x80;
            }
            if (var13.method1841(arg1, arg4 - 2190)) {
                arg6 |= 0x100;
            }
            if (var13.method1837(arg1, (byte) 84)) {
                arg6 |= 0x400;
            }
        }
        int var15 = arg6 | 0x20;
        class121 var16 = arg3.method938(arg7, var15, true);
        var16.method916(var11, this.field2550, var13, var9, var12, arg5 - 1, arg2, -67, arg1);
        return var16;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1218(int arg0) {
        field2568 = null;
        field2561 = null;
        if (arg0 != -127) {
            method1220(-5, 61);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLcu;I)V")
    private final void method1219(byte arg0, class145 arg1, int arg2) {
        if (arg0 != 63) {
            method1220(98, -16);
        }
        if (arg2 == 1) {
            int var13 = arg1.method1069((byte) -42);
            this.field2564 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2564[var14] = arg1.method1069((byte) -23);
            }
            this.field2539 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2539[var15] = arg1.method1069((byte) -41);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2539[var16] = (arg1.method1069((byte) -80) << 16) + this.field2539[var16];
            }
        } else if (arg2 == 2) {
            this.field2549 = arg1.method1069((byte) -51);
        } else if (arg2 == 3) {
            this.field2560 = new boolean[256];
            int var11 = arg1.method1063((byte) 115);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2560[arg1.method1063((byte) -79)] = true;
            }
        } else if (arg2 == 4) {
            this.field2562 = true;
        } else if (arg2 == 5) {
            this.field2558 = arg1.method1063((byte) -127);
        } else if (arg2 == 6) {
            this.field2551 = arg1.method1069((byte) -14);
        } else if (arg2 == 7) {
            this.field2569 = arg1.method1069((byte) -90);
        } else if (arg2 == 8) {
            this.field2547 = arg1.method1063((byte) 106);
        } else if (arg2 == 9) {
            this.field2566 = arg1.method1063((byte) 102);
        } else if (arg2 == 10) {
            this.field2556 = arg1.method1063((byte) 102);
        } else if (arg2 == 11) {
            this.field2553 = arg1.method1063((byte) 117);
        } else if (arg2 == 12) {
            int var8 = arg1.method1063((byte) 102);
            this.field2559 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2559[var9] = arg1.method1069((byte) -109);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2559[var10] += arg1.method1069((byte) -96) << 16;
            }
        } else if (arg2 == 13) {
            int var4 = arg1.method1069((byte) -86);
            this.field2544 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1063((byte) -97);
                if (var6 > 0) {
                    this.field2544[var5] = new int[var6];
                    this.field2544[var5][0] = arg1.method1085(-29);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field2544[var5][var7] = arg1.method1069((byte) -90);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field2550 = true;
        } else if (arg2 == 15) {
            this.field2546 = true;
        } else if (arg2 == 16) {
            this.field2543 = true;
        }
        field2540++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
    public static final int method1220(int arg0, int arg1) {
        if (arg1 != 511970922) {
            field2568 = null;
        }
        field2555++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
    public static final int method1221(int arg0, int arg1, int arg2) {
        field2548++;
        if (arg0 != 9154) {
            method1218(121);
        }
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILc;I)Lc;")
    public final class121 method1222(int arg0, int arg1, int arg2, int arg3, class121 arg4, int arg5) {
        field2565++;
        int var7 = this.field2564[arg1];
        int var8 = this.field2539[arg1];
        class291 var9 = this.field2554.method1129(var8 >> 16, (byte) 58);
        int var10 = var8 & 0xFFFF;
        if (arg3 > -74) {
            this.field2556 = 35;
        }
        if (var9 == null) {
            return arg4.method938((byte) 1, arg0, true);
        }
        class291 var11 = null;
        if ((this.field2546 || class21.field428) && arg5 != -1 && this.field2539.length > arg5) {
            int var12 = this.field2539[arg5];
            var11 = this.field2554.method1129(var12 >> 16, (byte) 111);
            arg5 = var12 & 0xFFFF;
        }
        class291 var13 = null;
        class291 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2559 != null) {
            if (arg1 < this.field2559.length) {
                var15 = this.field2559[arg1];
                if (var15 != 65535) {
                    var13 = this.field2554.method1129(var15 >> 16, (byte) 57);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2546 || class21.field428) && arg5 != -1 && arg5 < this.field2559.length) {
                var16 = this.field2559[arg5];
                if (var16 != 65535) {
                    var14 = this.field2554.method1129(var16 >> 16, (byte) 47);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2550) {
            arg0 |= 0x200;
        }
        if (var9.method1839(-101, var10)) {
            arg0 |= 0x80;
        }
        if (var9.method1841(var10, 0)) {
            arg0 |= 0x100;
        }
        if (var9.method1837(var10, (byte) 84)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1839(-101, var15)) {
                arg0 |= 0x80;
            }
            if (var13.method1841(var15, 0)) {
                arg0 |= 0x100;
            }
            if (var13.method1837(var15, (byte) 84)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1839(-110, arg5)) {
                arg0 |= 0x80;
            }
            if (var11.method1841(arg5, 0)) {
                arg0 |= 0x100;
            }
            if (var11.method1837(arg5, (byte) 84)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1839(-107, var16)) {
                arg0 |= 0x80;
            }
            if (var14.method1841(var16, 0)) {
                arg0 |= 0x100;
            }
            if (var14.method1837(var16, (byte) 84)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class121 var18 = arg4.method938((byte) 1, var17, true);
        var18.method916(var9, this.field2550, var11, var7, var10, arg2 - 1, 0, -62, arg5);
        if (var13 != null) {
            var18.method916(var13, this.field2550, var14, var7, var15, arg2 - 1, 0, -120, var16);
        }
        return var18;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lcu;I)V")
    public final void method1223(class145 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1063((byte) 123);
            if (var3 == 0) {
                if (arg1 >= -126) {
                    this.field2549 = -66;
                }
                field2557++;
                return;
            }
            this.method1219((byte) 63, arg0, var3);
        }
    }
}
