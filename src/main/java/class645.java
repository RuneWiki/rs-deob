import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class645 extends class159 {

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "Lqq;")
    private class501 field8696;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "Luaa;")
    private class127 field8691;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "Lee;")
    private class703 field8692;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    private int field8687;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    private int field8683;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    private int field8689;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    private int field8673;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[[F")
    private float[][] field8675;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[[F")
    private float[][] field8676;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "[[F")
    private float[][] field8685;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    private int field8680;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "Lkm;")
    private class373 field8684;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lra;")
    private class118 field8678;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Ltca;")
    private class184 field8681;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8697;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8699;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    private int field8677;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "Lqj;")
    public static class535 field8686 = new class535(32);

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Lqw;")
    public static class84 field8695 = new class84();

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field8698;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tl", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field8700;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "[Ls;")
    public static class295[] field8694;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static final void method3572(int arg0) {
        field8688++;
        if (arg0 >= -21) {
            field8694 = null;
        }
        if (class786.field10800.field3233) {
            class115.field1557 = 96;
            return;
        }
        try {
            Method var1 = (field8700 == null ? (field8700 = method3579("java.lang.Runtime")) : field8700).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class115.field1557 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
    public static final void method3573(int arg0, int arg1) {
        if (arg0 > -17) {
            method3572(-80);
        }
        class4.field28 = arg1;
        field8690++;
        class408.field5772.method3103(-11294);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIII)V")
    private final void method3574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8693++;
        long var8 = -1L;
        int var10 = (arg0 << this.field8696.field4179) + arg6;
        int var11 = (arg2 << this.field8696.field4179) + arg5;
        int var12 = this.field8696.method1895(var10, var11, 126);
        if ((arg6 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class159 var13 = this.field8681.method1248(93, var8);
            if (var13 != null) {
                this.method3577(((class603) var13).field8189, (byte) 119);
                return;
            }
        }
        short var14 = (short) (this.field8677++);
        if (var8 != -1L) {
            this.field8681.method1247(4070, var8, new class603(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg5 == 0) {
            var15 = this.field8676[arg1][arg3];
            var16 = this.field8675[arg1][arg3];
            var17 = this.field8685[arg1][arg3];
        } else if (this.field8696.field4177 == arg6 && arg5 == 0) {
            var17 = this.field8685[arg1 + 1][arg3];
            var16 = this.field8675[arg1 + 1][arg3];
            var15 = this.field8676[arg1 + 1][arg3];
        } else if (this.field8696.field4177 == arg6 && this.field8696.field4177 == arg5) {
            var17 = this.field8685[arg1 + 1][arg3 + 1];
            var16 = this.field8675[arg1 + 1][arg3 + 1];
            var15 = this.field8676[arg1 + 1][arg3 + 1];
        } else if (arg6 == 0 && this.field8696.field4177 == arg5) {
            var16 = this.field8675[arg1][arg3 + 1];
            var17 = this.field8685[arg1][arg3 + 1];
            var15 = this.field8676[arg1][arg3 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field8696.field4177;
            float var19 = (float) arg5 / (float) this.field8696.field4177;
            float var20 = this.field8676[arg1][arg3];
            float var21 = this.field8685[arg1][arg3];
            float var22 = this.field8675[arg1][arg3];
            float var23 = this.field8676[arg1 + 1][arg3];
            float var24 = this.field8685[arg1 + 1][arg3];
            float var25 = (this.field8685[arg1 + 1][arg3 + 1] - var24) * var18 + var24;
            float var26 = (this.field8675[arg1][arg3 + 1] - var22) * var18 + var22;
            float var27 = (this.field8676[arg1 + 1][arg3 + 1] - var23) * var18 + var23;
            float var28 = this.field8675[arg1 + 1][arg3];
            float var29 = (this.field8676[arg1][arg3 + 1] - var20) * var18 + var20;
            float var30 = (this.field8685[arg1][arg3 + 1] - var21) * var18 + var21;
            var15 = (var27 - var29) * var19 + var29;
            float var31 = (this.field8675[arg1 + 1][arg3 + 1] - var28) * var18 + var28;
            var17 = (var25 - var30) * var19 + var30;
            var16 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field8691.method899(true) - var10);
        float var33 = (float) (this.field8691.method904(-118) - var12);
        float var34 = (float) (this.field8691.method901((byte) -115) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field8691.method903((byte) -114);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8691.method898(-107);
        int var45 = (int) ((float) ((var44 & 0xFF2574) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3798()) {
            this.field8697.method3800((float) var10);
            this.field8697.method3800((float) var12);
            this.field8697.method3800((float) var11);
        } else {
            this.field8697.method3809((float) var10);
            this.field8697.method3809((float) var12);
            this.field8697.method3809((float) var11);
        }
        if (arg4 >= -113) {
            return;
        }
        if (this.field8692.field9591 == 0) {
            this.field8697.method3799(var47);
            this.field8697.method3799(var46);
            this.field8697.method3799(var45);
        } else {
            this.field8697.method3799(var45);
            this.field8697.method3799(var46);
            this.field8697.method3799(var47);
        }
        this.field8697.method3799(255);
        this.method3577(var14, (byte) 118);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public static void method3575(int arg0) {
        field8694 = null;
        if (arg0 != 1) {
            field8694 = null;
        }
        field8695 = null;
        field8686 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III[[ZI)V")
    public final void method3576(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field8682++;
        if (this.field8678 == null || this.field8687 > arg2 + arg1 || arg2 - arg1 > this.field8683 || this.field8689 > arg0 + arg1 || arg0 - arg1 > this.field8673) {
            return;
        }
        int var6 = this.field8689;
        if (arg4 != 0) {
            this.field8677 = 5;
        }
        while (this.field8673 >= var6) {
            for (int var7 = this.field8687; var7 <= this.field8683; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg0;
                if (var8 > (-arg1) && var8 < arg1 && var9 > (-arg1) && arg1 > var9 && arg3[var8 + arg1][arg1 + var9]) {
                    this.field8692.method3913(-27653, (byte) ((int) (this.field8691.method902(arg4) * 255.0F)));
                    this.field8692.method2818(false, this.field8684, 0);
                    this.field8692.method2816((byte) 119, this.field8692.field9613);
                    this.field8692.method2820(this.field8680 / 3, 0, -13847, this.field8677, class356.field5191, 0, this.field8678);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(SB)V")
    private final void method3577(short arg0, byte arg1) {
        if (Stream.method3798()) {
            this.field8699.method3795(arg0);
        } else {
            this.field8699.method3804(arg0);
        }
        field8674++;
        int var3 = 37 / ((30 - arg1) / 51);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static final void method3578(byte arg0) {
        field8679++;
        class723.field9821.method4222(-40);
        class220.method1405((byte) 127);
        class230.field2959 = null;
        class260.field3856 = null;
        class73.field989 = 0;
        class640.field8614 = null;
        class535.field7418 = 0;
        class560.field7678.field3725 = 0;
        class141.method984(true);
        int var1 = -99 / ((29 - arg0) / 33);
        class245.field3209 = null;
        class43.field463 = null;
        class26.field261 = 0;
        class525.field7289 = 0;
        class551.field7606 = null;
        class86.field1213 = null;
        class199.field2588 = 0;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lee;Lqq;Luaa;[I)V")
    public class645(class703 arg0, class501 arg1, class127 arg2, int[] arg3) {
        this.field8696 = arg1;
        this.field8691 = arg2;
        this.field8692 = arg0;
        int var5 = this.field8691.method903((byte) -112) - (arg1.field4177 >> 1);
        this.field8687 = this.field8691.method899(true) - var5 >> arg1.field4179;
        this.field8683 = var5 + this.field8691.method899(true) >> arg1.field4179;
        this.field8689 = this.field8691.method901((byte) -115) - var5 >> arg1.field4179;
        this.field8673 = var5 + this.field8691.method901((byte) -115) >> arg1.field4179;
        int var6 = this.field8683 + 1 - this.field8687;
        int var7 = this.field8673 + 1 - this.field8689;
        this.field8675 = new float[var6 + 1][var7 + 1];
        this.field8676 = new float[var6 + 1][var7 + 1];
        this.field8685 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = var8 + this.field8689;
            if (var27 > 0 && var27 < this.field8696.field4173 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field8687 + var28;
                    if (var29 > 0 && (this.field8696.field4174 - 1) > var29) {
                        int var30 = arg1.method1898(var27, var29 + 1, (byte) -121) - arg1.method1898(var27, var29 - 1, (byte) -98);
                        int var31 = arg1.method1898(var27 + 1, var29, (byte) -95) - arg1.method1898(var27 - 1, var29, (byte) -52);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var31 * var31) + 65536)));
                        this.field8676[var28][var8] = (float) var30 * var32;
                        this.field8685[var28][var8] = var32 * -256.0F;
                        this.field8675[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8689; var10 <= this.field8673; var10++) {
            if (var10 >= 0 && arg1.field4173 > var10) {
                for (int var23 = this.field8687; var23 <= this.field8683; var23++) {
                    if (var23 >= 0 && arg1.field4174 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7005[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8680 += 3;
                                    }
                                }
                            } else {
                                this.field8680 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8683 - this.field8687;
            }
        }
        if (this.field8680 <= 0) {
            this.field8684 = null;
            this.field8678 = null;
        } else {
            this.field8681 = new class184(class8.method45(23714, this.field8680));
            this.field8678 = this.field8692.method2813(false, (byte) -111);
            this.field8678.method850(-8165, this.field8680);
            NativeHeapBuffer var11 = this.field8692.method3835(false, 0, this.field8680 * 16);
            this.field8697 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8678.method847(-124, true);
                } while (var12 == null);
                this.field8699 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8689; var15 <= this.field8673; var15++) {
                    if (var15 >= 0 && var15 < arg1.field4173) {
                        int var16 = 0;
                        for (int var17 = this.field8687; var17 <= this.field8683; var17++) {
                            if (var17 >= 0 && var17 < arg1.field4174) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field7005[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7009[var17][var15];
                                        int[] var21 = arg1.field7036[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3574(var17, var16, var15, var14, -116, var21[var22], var20[var22]);
                                                    var22++;
                                                    this.method3574(var17, var16, var15, var14, -115, var21[var22], var20[var22]);
                                                    var22++;
                                                    this.method3574(var17, var16, var15, var14, -123, var21[var22], var20[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3574(var17, var16, var15, var14, -116, 0, 0);
                                        this.method3574(var17, var16, var15, var14, -114, 0, arg1.field4177);
                                        this.method3574(var17, var16, var15, var14, -117, arg1.field4177, 0);
                                    } else if (var18 == 2) {
                                        this.method3574(var17, var16, var15, var14, -122, 0, arg1.field4177);
                                        this.method3574(var17, var16, var15, var14, -114, arg1.field4177, arg1.field4177);
                                        this.method3574(var17, var16, var15, var14, -121, 0, 0);
                                    } else if (var18 == 5) {
                                        this.method3574(var17, var16, var15, var14, -116, arg1.field4177, arg1.field4177);
                                        this.method3574(var17, var16, var15, var14, -128, arg1.field4177, 0);
                                        this.method3574(var17, var16, var15, var14, -122, 0, arg1.field4177);
                                    } else if (var18 == 4) {
                                        this.method3574(var17, var16, var15, var14, -127, arg1.field4177, 0);
                                        this.method3574(var17, var16, var15, var14, -127, 0, 0);
                                        this.method3574(var17, var16, var15, var14, -127, arg1.field4177, arg1.field4177);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field8683 - this.field8687;
                    }
                    var14++;
                }
                this.field8699.method3797();
                if (this.field8678.method849(18579)) {
                    this.field8697.method3797();
                    this.field8684 = this.field8692.method2795(0, false);
                    this.field8684.method2336(false, 16, var11, this.field8677 * 16);
                    break;
                }
                this.field8697.method3802(0);
                this.field8681.method1244(30407);
            }
        }
        this.field8699 = null;
        this.field8676 = this.field8685 = this.field8675 = null;
        this.field8697 = null;
        this.field8681 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3579(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
