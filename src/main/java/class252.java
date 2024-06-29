import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class252 implements class383 {

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Z")
    private boolean field3366 = false;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public int field3356;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lur;")
    public class377 field3354;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Z")
    private boolean field3348;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lao;")
    public static class191 field3349 = new class191(63, 9);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "[[[B")
    public static byte[][][] field3358;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public final void method1553(int arg0) {
        field3353++;
        int var2 = 105 % ((-arg0 - 78) / 46);
        if (this.field3362 > 0) {
            this.field3354.method2304(this.method1560(61), this.field3362, 35);
            this.field3362 = 0;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    private final void method1554(int arg0) {
        this.field3354.method2236(this, arg0 ^ 0x8E995E6E);
        field3367++;
        if (arg0 != -1902551544) {
            field3358 = null;
        }
        if (this.field3366) {
            OpenGL.glTexParameteri(this.field3364, 10241, this.field3348 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3364, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3364, 10241, this.field3348 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3364, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BZ)V")
    public final void method1555(byte arg0, boolean arg1) {
        if (this.field3366 != arg1) {
            this.field3366 = arg1;
            this.method1554(-1902551544);
        }
        if (arg0 <= 106) {
            method1558(null);
        }
        field3368++;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public static void method1556(int arg0) {
        field3358 = null;
        if (arg0 != 2) {
            method1564(-124L, 112, -83, null, null, -22, 90, 108, 39);
        }
        field3349 = null;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I")
    public final int method1557(int arg0) {
        if (arg0 != -2) {
            method1565(-92, 92, null);
        }
        field3357++;
        return this.field3362;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lza;)V")
    public static final void method1558(class287 arg0) {
        for (int var1 = class12.field127; var1 < class478.field7065; var1++) {
            for (int var2 = 0; var2 < class515.field7487; var2++) {
                for (int var3 = 0; var3 < class114.field1494; var3++) {
                    class498 var4 = class186.field2421[var1][var2][var3];
                    if (var4 != null) {
                        class262 var5 = var4.field7264;
                        class262 var6 = var4.field7257;
                        if (var5 != null && var5.method41((byte) -62)) {
                            class14.method86(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method41((byte) -62)) {
                                class14.method86(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method40(121, 0, 0, false, 0, var5, arg0);
                                var6.method42((byte) 92);
                            }
                            var5.method42((byte) 92);
                        }
                        for (class192 var7 = var4.field7263; var7 != null; var7 = var7.field2469) {
                            class279 var9 = var7.field2466;
                            if (var9 != null && var9.method41((byte) -62)) {
                                class14.method86(arg0, var9, var1, var2, var3, var9.field3697 + 1 - var9.field3698, var9.field3691 - var9.field3688 + 1);
                                var9.method42((byte) 92);
                            }
                        }
                        class215 var8 = var4.field7268;
                        if (var8 != null && var8.method41((byte) -62)) {
                            class338.method1968(arg0, var8, var1, var2, var3);
                            var8.method42((byte) 92);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)B")
    public static final byte method1559(int arg0, int arg1, int arg2) {
        field3352++;
        if (arg0 == 9) {
            if (arg1 != -9954) {
                method1556(104);
            }
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1553(-126);
        field3361++;
        super.finalize();
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
    private final int method1560(int arg0) {
        field3363++;
        int var2 = this.field3354.method2302(this.field3356, 34844) * this.field3360;
        int var3 = 66 / ((-arg0 - 33) / 35);
        return this.field3348 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z")
    public final boolean method1561(byte arg0) {
        field3359++;
        if (!this.field3354.field5417) {
            return arg0 != 126;
        }
        int var2 = this.method1560(47);
        this.field3354.method2236(this, -63);
        OpenGL.glGenerateMipmapEXT(this.field3364);
        this.field3348 = true;
        this.method1554(arg0 ^ 0x8E995E76);
        this.method1562(var2, 15395);
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    private final void method1562(int arg0, int arg1) {
        field3351++;
        this.field3354.field5324 -= arg0;
        this.field3354.field5324 += this.method1560(-96);
        if (arg1 != 15395) {
            this.field3356 = 77;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
    public final void method1563(boolean arg0, int arg1) {
        if (arg0 != this.field3348) {
            int var3 = this.method1560(5);
            this.field3348 = true;
            this.method1554(arg1 - 1902561784);
            this.method1562(var3, 15395);
        }
        if (arg1 != 10240) {
            this.method1555((byte) 67, false);
        }
        field3350++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JIILta;Ljk;IIII)V")
    public static final void method1564(long arg0, int arg1, int arg2, class144 arg3, class450 arg4, int arg5, int arg6, int arg7, int arg8) {
        field3355++;
        if (arg8 < 59) {
            return;
        }
        int var10 = arg6 * arg6 + arg7 * arg7;
        if (arg0 < (long) var10) {
            return;
        }
        int var11 = Math.min(arg4.field6612 / 2, arg4.field6573 / 2);
        if (var11 * var11 >= var10) {
            class522.method3111(arg5, arg3, arg2, arg6, arg4, arg7, class186.field2426[arg1], (byte) 39);
            return;
        }
        var11 -= 10;
        int var12;
        if (class47.field491 == 4) {
            var12 = (int) class143.field1907 & 0x3FFF;
        } else {
            var12 = (int) class143.field1907 + class299.field3928 & 0x3FFF;
        }
        int var13 = class456.field6812[var12];
        int var14 = class456.field6811[var12];
        if (class47.field491 != 4) {
            var13 = var13 * 256 / (class420.field6099 + 256);
            var14 = var14 * 256 / (class420.field6099 + 256);
        }
        int var15 = arg6 * var13 + (arg7 * var14) >> 15;
        int var16 = arg6 * var14 - (arg7 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class193.field2498[arg1].method140((float) arg4.field6612 / 2.0F + (float) arg5 + (float) var19, (float) arg4.field6573 / 2.0F + (float) arg2 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILkh;)Z")
    public static final boolean method1565(int arg0, int arg1, class13 arg2) {
        field3365++;
        int var3 = arg2.method80(2, 255);
        if (var3 == 0) {
            if (arg2.method80(1, 255) != 0) {
                method1565(-12971, arg1, arg2);
            }
            int var4 = arg2.method80(6, arg0 + 13226);
            int var5 = arg2.method80(6, arg0 ^ 0xFFFFCDAA);
            boolean var6 = arg2.method80(1, 255) == 1;
            if (var6) {
                class407.field5847[class154.field2019++] = arg1;
            }
            if (class29.field272[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class228 var7 = class362.field4936[arg1];
            class531 var8 = class29.field272[arg1] = new class531();
            var8.field1211 = arg1;
            if (class484.field7127[arg1] != null) {
                var8.method3159(class484.field7127[arg1], 113);
            }
            var8.method553(var7.field3076, arg0 + 13083);
            var8.field1156 = var7.field3074;
            int var9 = var7.field3073;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FD12E) >> 14;
            var8.field7803 = var7.field3071;
            int var12 = var9 & 0xFF;
            var8.field1255[0] = class447.field6522[arg1];
            var8.field3695 = (byte) var10;
            var8.method3152((var11 << 6) + var4 - class357.field4867, 128, (var12 << 6) + var5 - class418.field6074);
            var8.field7799 = false;
            class362.field4936[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method80(2, 255);
            int var14 = class362.field4936[arg1].field3073;
            class362.field4936[arg1].field3073 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method80(5, 255);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class362.field4936[arg1].field3073;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class362.field4936[arg1].field3073 = (var20 << 14) + ((var19 << 28) + var21);
            return false;
        } else {
            if (arg0 != -12971) {
                field3349 = null;
            }
            int var22 = arg2.method80(18, 255);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class362.field4936[arg1].field3073;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class362.field4936[arg1].field3073 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lur;IIIZ)V")
    public class252(class377 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3360 = arg3;
        this.field3356 = arg2;
        this.field3354 = arg0;
        this.field3364 = arg1;
        this.field3348 = arg4;
        OpenGL.glGenTextures(1, class242.field3201, 0);
        this.field3362 = class242.field3201[0];
        this.method1562(0, 15395);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public abstract void method863(byte arg0);
}
