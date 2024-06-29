import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class520 {

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field7620 = 99;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Z")
    public boolean field7623 = false;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public int field7618 = 2;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
    public boolean field7619 = false;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Z")
    public boolean field7634 = false;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public int field7635 = -1;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public int field7629 = -1;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "Z")
    public boolean field7647 = false;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public int field7644 = 5;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public int field7643 = -1;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public int field7632 = -1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field7611 = -1;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "[[B")
    public static byte[][] field7626 = new byte[250][];

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Laa;")
    public static class76 field7622 = new class76(71, -1);

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Z")
    public static boolean field7641 = false;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field7646 = new String[100];

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Ljo;")
    public static class382 field7639 = new class382(200);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field7624;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Lm;")
    public class80 field7640;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[I")
    private int[] field7614;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "[I")
    public int[] field7630;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "[I")
    public int[] field7645;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[Z")
    public boolean[] field7613;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[[I")
    public int[][] field7625;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 10)
    public final void method3071(int arg0) {
        if (arg0 > -91) {
            this.field7624 = -57;
        }
        field7616++;
        if (this.field7611 == -1) {
            if (this.field7613 == null) {
                this.field7611 = 0;
            } else {
                this.field7611 = 2;
            }
        }
        if (this.field7643 != -1) {
            return;
        }
        if (this.field7613 == null) {
            this.field7643 = 0;
        } else {
            this.field7643 = 2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([FIIIIII)V", line = 42)
    public static final void method3072(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7621++;
        if (arg4 > 0 && !class384.method2305(1, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class384.method2305(1, arg2)) {
            int var7 = class96.method753(true, arg1);
            int var8 = arg5;
            int var9 = arg2 > arg4 ? arg4 : arg2;
            int var10 = arg4 >> 1;
            int var11 = arg2 >> 1;
            float[] var12 = arg0;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg6, arg4, arg2, 0, arg1, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg4 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg4 = var10;
                var12 = var15;
                arg2 = var11;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIILt;)Lt;", line = 149)
    public final class398 method3073(int arg0, int arg1, int arg2, int arg3, int arg4, class398 arg5) {
        field7615++;
        int var7 = this.field7645[arg0];
        if (arg3 <= 53) {
            return null;
        }
        int var8 = this.field7630[arg0];
        class41 var9 = this.field7640.method571(var8 >> 16, 100);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method610((byte) 1, arg4, true);
        }
        class41 var11 = null;
        if ((this.field7647 || class522.field7688) && arg1 != -1 && this.field7630.length > arg1) {
            int var12 = this.field7630[arg1];
            var11 = this.field7640.method571(var12 >> 16, 100);
            arg1 = var12 & 0xFFFF;
        }
        class41 var13 = null;
        class41 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field7614 != null) {
            if (this.field7614.length > arg0) {
                var15 = this.field7614[arg0];
                if (var15 != 65535) {
                    var13 = this.field7640.method571(var15 >> 16, 100);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field7647 || class522.field7688) && arg1 != -1 && arg1 < this.field7614.length) {
                var16 = this.field7614[arg1];
                if (var16 != 65535) {
                    var14 = this.field7640.method571(var16 >> 16, 100);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field7634) {
            arg4 |= 0x200;
        }
        if (var9.method324(var10, -1500)) {
            arg4 |= 0x80;
        }
        if (var9.method327((byte) 104, var10)) {
            arg4 |= 0x100;
        }
        if (var9.method326(0, var10)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method324(var15, -1500)) {
                arg4 |= 0x80;
            }
            if (var13.method327((byte) 49, var15)) {
                arg4 |= 0x100;
            }
            if (var13.method326(0, var15)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method324(arg1, -1500)) {
                arg4 |= 0x80;
            }
            if (var11.method327((byte) 50, arg1)) {
                arg4 |= 0x100;
            }
            if (var11.method326(0, arg1)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method324(var16, -1500)) {
                arg4 |= 0x80;
            }
            if (var14.method327((byte) -78, var16)) {
                arg4 |= 0x100;
            }
            if (var14.method326(0, var16)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class398 var18 = arg5.method610((byte) 1, var17, true);
        var18.method2391(-1, this.field7634, var9, 0, var11, arg2 - 1, var10, arg1, var7);
        if (var13 != null) {
            var18.method2391(-1, this.field7634, var13, 0, var14, arg2 - 1, var15, var16, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILgk;I)V", line = 291)
    private final void method3074(int arg0, class468 arg1, int arg2) {
        field7627++;
        if (arg2 != -13) {
            return;
        }
        if (arg0 == 1) {
            int var13 = arg1.method2727((byte) 43);
            this.field7645 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field7645[var14] = arg1.method2727((byte) 43);
            }
            this.field7630 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field7630[var15] = arg1.method2727((byte) 43);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field7630[var16] += arg1.method2727((byte) 43) << 16;
            }
        } else if (arg0 == 2) {
            this.field7632 = arg1.method2727((byte) 43);
        } else if (arg0 == 3) {
            this.field7613 = new boolean[256];
            int var11 = arg1.method2765(65);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field7613[arg1.method2765(class286.method1773(arg2, -79))] = true;
            }
        } else if (arg0 == 4) {
            this.field7619 = true;
        } else if (arg0 == 5) {
            this.field7644 = arg1.method2765(64);
        } else if (arg0 == 6) {
            this.field7635 = arg1.method2727((byte) 43);
        } else if (arg0 == 7) {
            this.field7629 = arg1.method2727((byte) 43);
        } else if (arg0 == 8) {
            this.field7620 = arg1.method2765(arg2 + 119);
        } else if (arg0 == 9) {
            this.field7643 = arg1.method2765(81);
        } else if (arg0 == 10) {
            this.field7611 = arg1.method2765(62);
        } else if (arg0 == 11) {
            this.field7618 = arg1.method2765(78);
        } else if (arg0 == 12) {
            int var8 = arg1.method2765(55);
            this.field7614 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field7614[var9] = arg1.method2727((byte) 43);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field7614[var10] = (arg1.method2727((byte) 43) << 16) + this.field7614[var10];
            }
        } else if (arg0 == 13) {
            int var4 = arg1.method2727((byte) 43);
            this.field7625 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2765(100);
                if (var6 > 0) {
                    this.field7625[var5] = new int[var6];
                    this.field7625[var5][0] = arg1.method2759(class286.method1773(arg2, -1919914877));
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field7625[var5][var7] = arg1.method2727((byte) 43);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field7634 = true;
        } else if (arg0 == 15) {
            this.field7647 = true;
        } else if (arg0 == 16) {
            this.field7623 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZ)I", line = 451)
    public final int method3075(int arg0, int arg1, int arg2, boolean arg3) {
        field7631++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field7630[arg0];
        class41 var8 = null;
        class41 var9 = this.field7640.method571(var7 >> 16, 100);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field7647 || class522.field7688) && arg2 != -1 && arg2 < this.field7630.length) {
            int var11 = this.field7630[arg2];
            var8 = this.field7640.method571(var11 >> 16, 100);
            var6 = var11 & 0xFFFF;
        }
        if (this.field7634) {
            var5 |= 0x200;
        }
        if (var9.method324(var10, arg1 - 9198)) {
            var5 |= 0x80;
        }
        if (var9.method327((byte) 89, var10)) {
            var5 |= 0x100;
        }
        if (var9.method326(0, var10)) {
            var5 |= 0x400;
        }
        if (arg1 != 7698) {
            return -68;
        }
        if (var8 != null) {
            if (var8.method324(var6, -1500)) {
                var5 |= 0x80;
            }
            if (var8.method327((byte) -52, var6)) {
                var5 |= 0x100;
            }
            if (var8.method326(0, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field7614 != null && arg3) {
            if (arg0 < this.field7614.length) {
                int var12 = this.field7614[arg0];
                if (var12 != 65535) {
                    class41 var13 = this.field7640.method571(var12 >> 16, arg1 - 7598);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method324(var14, -1500)) {
                            var5 |= 0x80;
                        }
                        if (var13.method327((byte) -52, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method326(0, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field7647 || class522.field7688) && arg2 != -1 && arg2 < this.field7614.length) {
                int var15 = this.field7614[arg2];
                if (var15 != 65535) {
                    class41 var16 = this.field7640.method571(var15 >> 16, arg1 ^ 0x1E76);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method324(var17, -1500)) {
                            var5 |= 0x80;
                        }
                        if (var16.method327((byte) 82, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method326(0, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BII)Z", line = 582)
    public static final boolean method3076(byte arg0, int arg1, int arg2) {
        if (arg0 >= -46) {
            return false;
        } else {
            field7612++;
            return (arg1 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZI)V", line = 596)
    public static final void method3077(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class305.field4555 <= arg1 && arg1 <= class286.field4290) {
            int var5 = class375.method2223(false, arg4, class102.field1544, class297.field4427);
            int var6 = class375.method2223(false, arg2, class102.field1544, class297.field4427);
            class522.method3095(arg1, -119, var5, var6, arg0);
        }
        if (arg3) {
            method3078(-28);
        }
        field7628++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 634)
    public static void method3078(int arg0) {
        field7622 = null;
        field7646 = null;
        field7626 = null;
        field7639 = null;
        if (arg0 != -12086) {
            field7617 = -110;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIIILt;I)Lt;", line = 657)
    public final class398 method3079(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class398 arg6, int arg7) {
        field7637++;
        int var9 = this.field7645[arg4];
        int var10 = this.field7630[arg4];
        class41 var11 = this.field7640.method571(var10 >> 16, 100);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method610(arg2, arg0, true);
        }
        class41 var13 = null;
        if ((this.field7647 || class522.field7688) && arg7 != -1 && arg7 < this.field7630.length) {
            int var14 = this.field7630[arg7];
            var13 = this.field7640.method571(var14 >> 16, 100);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field7634) {
            arg0 |= 0x200;
        }
        if (var11.method324(var12, arg3 ^ 0x5D7)) {
            arg0 |= 0x80;
        }
        if (var11.method327((byte) 75, var12)) {
            arg0 |= 0x100;
        }
        if (var11.method326(0, var12)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method324(arg7, arg3 - 1487)) {
                arg0 |= 0x80;
            }
            if (var13.method327((byte) 71, arg7)) {
                arg0 |= 0x100;
            }
            if (var13.method326(0, arg7)) {
                arg0 |= 0x400;
            }
        }
        int var15 = arg0 | 0x20;
        class398 var16 = arg6.method610(arg2, var15, true);
        if (arg3 == -13) {
            var16.method2391(arg3 ^ 0xC, this.field7634, var11, arg1, var13, arg5 - 1, var12, arg7, var9);
            return var16;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLgk;)V", line = 719)
    public final void method3080(boolean arg0, class468 arg1) {
        field7633++;
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2765(87);
            if (var3 == 0) {
                return;
            }
            this.method3074(var3, arg1, -13);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V", line = 746)
    public static final void method3081(int arg0) {
        class146.field2203 = 0;
        field7636++;
        if (arg0 != -21703) {
            method3078(83);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class448.field6609[var1] = null;
            class364.field5564[var1] = 1;
            class490.field7297[var1] = null;
        }
    }
}
