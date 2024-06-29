import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class697 extends class263 {

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Lbj;")
    private class227 field9655;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "Lrk;")
    private class30 field9671;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "Ljaa;")
    private class576 field9670;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    private int field9668;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    private int field9658;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    private int field9649;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    private int field9653;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "[[F")
    private float[][] field9661;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "[[F")
    private float[][] field9667;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "[[F")
    private float[][] field9669;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "Lji;")
    private class572 field9666;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "Lgm;")
    private class113 field9664;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "Lhd;")
    private class694 field9672;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "Lwb;")
    private class308 field9651;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "Lad;")
    private class393 field9659;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Lce;")
    private class288 field9650;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "Lce;")
    private class288 field9665;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    private int field9657;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "Lcga;")
    public static class449 field9674 = new class449(26, 0);

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "Ldr;")
    public static class675 field9677 = new class675(32, 19);

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
    private int field9676;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pn", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field9678;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3859(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)Lls;", line = 6)
    public static final class129 method3851(int arg0, byte arg1) {
        field9675++;
        class129[] var2 = class663.method3687(true);
        if (arg1 != -56) {
            field9674 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class129 var4 = var2[var3];
            if (var4.field1564 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 44)
    public static void method3852(int arg0) {
        field9674 = null;
        field9677 = null;
        if (arg0 != 4) {
            field9674 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 55)
    public static final void method3853(int arg0) {
        field9656++;
        class71.field919.method391(class17.field180, class226.field2919, class195.field2301);
        if (arg0 < 109) {
            method3852(123);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(SI)V", line = 68)
    private final void method3854(short arg0, int arg1) {
        field9654++;
        if (arg1 != -12296) {
            this.field9669 = null;
        }
        if (this.field9670.field7643) {
            this.field9666.method3080((byte) -55, arg0);
        } else {
            this.field9666.method3060(-32768, arg0);
        }
        this.field9657++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z", line = 84)
    public static final boolean method3855(byte arg0, Class arg1, String arg2) {
        field9663++;
        if (arg0 < 0) {
            method3853(18);
        }
        Class var3 = (Class) class167.field1960.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        }
        Object var4 = null;
        File var5 = (File) class186.field2190.get(arg2);
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg1, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class167.field1960.put(arg2, arg1);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class167.field1960.put(arg2, field9678 == null ? (field9678 = method3859("qn")) : field9678);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)S", line = 154)
    public static final short method3856(int arg0, boolean arg1) {
        if (!arg1) {
            return -112;
        }
        field9660++;
        int var2 = (arg0 & 0xFC2D) >> 10;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[[ZIBI)V", line = 185)
    public final void method3857(int arg0, boolean[][] arg1, int arg2, byte arg3, int arg4) {
        int var6 = 83 % ((-arg3 - 45) / 51);
        field9662++;
        if (this.field9651 == null || this.field9668 > arg2 + arg4 || arg2 - arg4 > this.field9658 || arg0 + arg4 < this.field9649 || this.field9653 < (arg0 - arg4)) {
            return;
        }
        for (int var7 = this.field9649; var7 <= this.field9653; var7++) {
            for (int var8 = this.field9668; var8 <= this.field9658; var8++) {
                int var9 = var8 - arg2;
                int var10 = var7 - arg0;
                if ((-arg4) < var9 && arg4 > var9 && -arg4 < var10 && arg4 > var10 && arg1[arg4 + var9][arg4 + var10]) {
                    this.field9670.method3111(-15361, (int) (this.field9655.method1368(128) * 255.0F) << 24);
                    this.field9670.method3190(null, 32885, this.field9665, this.field9650, null);
                    this.field9670.method3129(this.field9651, -103, 0, this.field9657, 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIBII)V", line = 251)
    private final void method3858(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field9673++;
        long var8 = -1L;
        int var10 = (arg6 << this.field9671.field1683) + arg3;
        int var11 = (arg0 << this.field9671.field1683) + arg2;
        int var12 = this.field9671.method194(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class263 var13 = this.field9672.method3828(var8, (byte) -91);
            if (var13 != null) {
                this.method3854(((class517) var13).field6544, -12296);
                return;
            }
        }
        short var14 = (short) (this.field9676++);
        if (var8 != -1L) {
            this.field9672.method3832(new class517(var14), var8, 84);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg2 == 0) {
            var15 = this.field9669[arg5][arg1];
            var16 = this.field9661[arg5][arg1];
            var17 = this.field9667[arg5][arg1];
        } else if (this.field9671.field1686 == arg3 && arg2 == 0) {
            var16 = this.field9661[arg5 + 1][arg1];
            var17 = this.field9667[arg5 + 1][arg1];
            var15 = this.field9669[arg5 + 1][arg1];
        } else if (this.field9671.field1686 == arg3 && this.field9671.field1686 == arg2) {
            var17 = this.field9667[arg5 + 1][arg1 + 1];
            var16 = this.field9661[arg5 + 1][arg1 + 1];
            var15 = this.field9669[arg5 + 1][arg1 + 1];
        } else if (arg3 == 0 && this.field9671.field1686 == arg2) {
            var16 = this.field9661[arg5][arg1 + 1];
            var17 = this.field9667[arg5][arg1 + 1];
            var15 = this.field9669[arg5][arg1 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field9671.field1686;
            float var19 = (float) arg2 / (float) this.field9671.field1686;
            float var20 = this.field9669[arg5][arg1];
            float var21 = this.field9661[arg5][arg1];
            float var22 = this.field9667[arg5][arg1];
            float var23 = this.field9669[arg5 + 1][arg1];
            float var24 = this.field9661[arg5 + 1][arg1];
            float var25 = (this.field9669[arg5][arg1 + 1] - var20) * var18 + var20;
            float var26 = this.field9667[arg5 + 1][arg1];
            float var27 = (this.field9661[arg5][arg1 + 1] - var21) * var18 + var21;
            float var28 = (this.field9667[arg5][arg1 + 1] - var22) * var18 + var22;
            float var29 = (this.field9661[arg5 + 1][arg1 + 1] - var24) * var18 + var24;
            float var30 = (this.field9669[arg5 + 1][arg1 + 1] - var23) * var18 + var23;
            var15 = (var30 - var25) * var19 + var25;
            var16 = (var29 - var27) * var19 + var27;
            float var31 = (this.field9667[arg5 + 1][arg1 + 1] - var26) * var18 + var26;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field9655.method1374((byte) 35) - var10);
        float var33 = (float) (this.field9655.method1373((byte) 84) - var12);
        if (arg4 < 92) {
            return;
        }
        float var34 = (float) (this.field9655.method1370((byte) -5) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field9655.method1367(126);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var38 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field9655.method1372(124);
        int var45 = (int) ((float) ((var44 & 0xFFD8B6) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF40) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field9670.field7643) {
            this.field9664.method784(-1585528400, (float) var10);
            this.field9664.method784(-1585528400, (float) var12);
            this.field9664.method784(-1585528400, (float) var11);
        } else {
            this.field9664.method782(367967696, (float) var10);
            this.field9664.method782(367967696, (float) var12);
            this.field9664.method782(367967696, (float) var11);
        }
        this.field9664.method3090(var45, 3);
        this.field9664.method3090(var46, 3);
        this.field9664.method3090(var47, 3);
        this.field9664.method3090(255, 3);
        this.method3854(var14, -12296);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Ljaa;Lrk;Lbj;[I)V", line = 421)
    public class697(class576 arg0, class30 arg1, class227 arg2, int[] arg3) {
        this.field9655 = arg2;
        this.field9671 = arg1;
        this.field9670 = arg0;
        int var5 = this.field9655.method1367(28) - (arg1.field1686 >> 1);
        this.field9668 = this.field9655.method1374((byte) 70) - var5 >> arg1.field1683;
        this.field9658 = this.field9655.method1374((byte) 114) + var5 >> arg1.field1683;
        this.field9649 = this.field9655.method1370((byte) -5) - var5 >> arg1.field1683;
        this.field9653 = var5 + this.field9655.method1370((byte) -5) >> arg1.field1683;
        int var6 = this.field9658 + 1 - this.field9668;
        int var7 = this.field9653 + 1 - this.field9649;
        this.field9661 = new float[var6 + 1][var7 + 1];
        this.field9667 = new float[var6 + 1][var7 + 1];
        this.field9669 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var26 = this.field9649 + var8;
            if (var26 > 0 && (this.field9671.field1684 - 1) > var26) {
                for (int var27 = 0; var27 <= var6; var27++) {
                    int var28 = var27 + this.field9668;
                    if (var28 > 0 && var28 < (this.field9671.field1685 - 1)) {
                        int var29 = arg1.method201(var28 + 1, var26) - arg1.method201(var28 - 1, var26);
                        int var30 = arg1.method201(var28, var26 + 1) - arg1.method201(var28, var26 - 1);
                        float var31 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var30 * var30 + 65536)));
                        this.field9669[var27][var8] = (float) var29 * var31;
                        this.field9661[var27][var8] = var31 * -256.0F;
                        this.field9667[var27][var8] = (float) var30 * var31;
                    }
                }
            }
        }
        byte var9 = 0;
        int var10 = 0;
        for (int var11 = this.field9649; var11 <= this.field9653; var11++) {
            if (var11 >= 0 && var11 < arg1.field1684) {
                for (int var22 = this.field9668; var22 <= this.field9658; var22++) {
                    if (var22 >= 0 && var22 < arg1.field1685) {
                        int var23 = arg3[var10];
                        int[] var24 = arg1.field356[var22][var11];
                        if (var24 != null && var23 != 0) {
                            if (var23 == 1) {
                                int var25 = 0;
                                while (var25 < var24.length) {
                                    if (var24[var25++] != -1 && var24[var25++] != -1 && var24[var25++] != -1) {
                                        this.field9657 += 3;
                                    }
                                }
                            } else {
                                this.field9657 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field9658 - this.field9668;
            }
        }
        if (var9 > 0) {
            this.field9666 = new class572(var9 * 2);
            this.field9664 = new class113(var9 * 16);
            this.field9672 = new class694(class560.method2979(var9, (byte) 103));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field9649; var14 <= this.field9653; var14++) {
                if (var14 >= 0 && arg1.field1684 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field9668; var16 <= this.field9658; var16++) {
                        if (var16 >= 0 && arg1.field1685 > var16) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field356[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    int[] var19 = arg1.field384[var16][var14];
                                    int[] var20 = arg1.field365[var16][var14];
                                    int var21 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var21 >= var18.length) {
                                                break label111;
                                            }
                                            if (var18[var21] == -1 || var18[var21 + 1] == -1 || var18[var21 + 2] == -1) {
                                                var21 += 3;
                                            } else {
                                                this.method3858(var14, var13, var20[var21], var19[var21], (byte) 117, var15, var16);
                                                var21++;
                                                this.method3858(var14, var13, var20[var21], var19[var21], (byte) 119, var15, var16);
                                                var21++;
                                                this.method3858(var14, var13, var20[var21], var19[var21], (byte) 113, var15, var16);
                                                var21++;
                                            }
                                        }
                                    }
                                } else if (var17 == 3) {
                                    this.method3858(var14, var13, 0, 0, (byte) 105, var15, var16);
                                    this.method3858(var14, var13, 0, arg1.field1686, (byte) 117, var15, var16);
                                    this.method3858(var14, var13, arg1.field1686, 0, (byte) 109, var15, var16);
                                } else if (var17 == 2) {
                                    this.method3858(var14, var13, 0, arg1.field1686, (byte) 95, var15, var16);
                                    this.method3858(var14, var13, arg1.field1686, arg1.field1686, (byte) 103, var15, var16);
                                    this.method3858(var14, var13, 0, 0, (byte) 93, var15, var16);
                                } else if (var17 == 5) {
                                    this.method3858(var14, var13, arg1.field1686, arg1.field1686, (byte) 107, var15, var16);
                                    this.method3858(var14, var13, arg1.field1686, 0, (byte) 94, var15, var16);
                                    this.method3858(var14, var13, 0, arg1.field1686, (byte) 97, var15, var16);
                                } else if (var17 == 4) {
                                    this.method3858(var14, var13, arg1.field1686, 0, (byte) 114, var15, var16);
                                    this.method3858(var14, var13, 0, 0, (byte) 117, var15, var16);
                                    this.method3858(var14, var13, arg1.field1686, arg1.field1686, (byte) 120, var15, var16);
                                }
                            }
                        }
                        var12++;
                        var15++;
                    }
                } else {
                    var12 += this.field9658 - this.field9668;
                }
                var13++;
            }
            this.field9651 = this.field9670.method3150(this.field9666.field7318, 5123, this.field9666.field7313, (byte) 116, false);
            this.field9659 = this.field9670.method3136(0, this.field9664.field7318, this.field9664.field7313, 16, false);
            this.field9650 = new class288(this.field9659, 5126, 3, 0);
            this.field9665 = new class288(this.field9659, 5121, 4, 12);
        } else {
            this.field9665 = null;
            this.field9659 = null;
            this.field9651 = null;
            this.field9650 = null;
        }
        this.field9672 = null;
        this.field9664 = null;
        this.field9669 = this.field9661 = this.field9667 = null;
        this.field9666 = null;
    }
}
