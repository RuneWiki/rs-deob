import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public abstract class class264 implements class658 {

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    private int field3864 = 0;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    private int field3868 = -1;

    @OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
    private int field3874;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lhj;")
    public class47 field3860;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "Z")
    private boolean field3866;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "[J")
    public static long[] field3865 = new long[256];

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
    private int field3873;

    @OriginalMember(owner = "client!lfa", name = "q", descriptor = "I")
    private int field3876;

    @OriginalMember(owner = "client!lfa", name = "r", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!lfa", name = "s", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!lfa", name = "t", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!lfa", name = "u", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!lfa", name = "v", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!lfa", name = "w", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "Lefa;")
    public static class531 field3869;

    @OriginalMember(owner = "client!lfa", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3875;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3865[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BLjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;", line = 10)
    public final Buffer method1803(byte arg0, MapBuffer arg1, boolean arg2) {
        field3861++;
        if (arg0 >= -93) {
            method1811(-90, -32, -19, -85, 95, -115, -86, 52);
        }
        if (this.field3864 == 0) {
            this.method1809(-27);
            if (this.field3868 <= 0) {
                this.field3864 = 2;
                return this.field3875;
            }
            OpenGL.glBindBufferARB(this.field3874, this.field3868);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field3874, this.field3876, null, 0, this.field3866 ? 35040 : 35044);
                if (this.field3873 <= this.field3860.field3304.field5936) {
                    this.field3864 = 1;
                    return this.field3860.field3304;
                }
            }
            if (!arg1.method3330() && arg1.method3332(this.field3874, this.field3873, 35001)) {
                this.field3864 = 2;
                return arg1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZI)V", line = 57)
    public void method969(boolean arg0, int arg1) {
        if (this.field3876 < arg1) {
            this.method1809(-49);
            if (this.field3868 <= 0) {
                this.field3875 = this.field3860.method1500(false, arg1, false);
            } else {
                OpenGL.glBindBufferARB(this.field3874, this.field3868);
                OpenGL.glBufferDataARBub(this.field3874, arg1, null, 0, this.field3866 ? 35040 : 35044);
                this.field3860.field3333 += arg1 - this.field3876;
            }
            this.field3876 = arg1;
        }
        field3871++;
        if (arg0) {
            this.field3873 = -10;
        }
        this.field3873 = arg1;
    }

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)V", line = 87)
    public static void method1804(int arg0) {
        field3869 = null;
        int var1 = 99 / ((-arg0 - 12) / 50);
        field3865 = null;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILmfa;)V", line = 97)
    public static final void method1805(int arg0, class409 arg1) {
        arg1.method2563((byte) 33);
        field3872++;
        int var2 = class145.field2037;
        class96 var3 = class388.field5601 = class251.field3675[var2] = new class96();
        var3.field7148 = var2;
        int var4 = arg1.method2560(-63, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field7197[0] = var6 - class113.field1509;
        int var7 = var4 & 0x3FFF;
        var3.field4410 = (var3.field7197[0] << 9) + (var3.method662((byte) 15) << 8);
        var3.field7198[0] = var7 - class587.field7995;
        var3.field4418 = (var3.field7198[arg0] << 9) + (var3.method662((byte) 15) << 8);
        class96.field1331 = var3.field4408 = var3.field4419 = var5;
        if (class479.method2918(var3.field7198[0], true, var3.field7197[0])) {
            var3.field4419++;
        }
        if (class318.field4426[var2] != null) {
            var3.method657(56, class318.field4426[var2]);
        }
        class209.field2736 = 0;
        class344.field4898[class209.field2736++] = var2;
        class104.field1430[var2] = 0;
        class85.field1204 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method2560(arg0 - 87, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class721 var13 = class20.field198[var8] = new class721();
                var13.field10027 = (var10 << 28) + (var11 << 14) + var12;
                var13.field10034 = false;
                var13.field10033 = 0;
                var13.field10032 = -1;
                class172.field2388[class85.field1204++] = var8;
                class104.field1430[var8] = 0;
            }
        }
        arg1.method2567(arg0);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IBLjaclib/memory/Source;)Z", line = 168)
    public final boolean method1806(int arg0, byte arg1, Source arg2) {
        field3870++;
        if (arg1 != -108) {
            this.field3866 = false;
        }
        if (arg0 <= this.field3876) {
            if (this.field3868 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field3874, this.field3868);
            OpenGL.glBufferSubDataARBa(this.field3874, 0, this.field3873, arg2.getAddress());
            this.field3860.field3333 += arg0 - this.field3873;
        } else {
            this.method1809(-88);
            if (this.field3868 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field3874, this.field3868);
            OpenGL.glBufferDataARBa(this.field3874, arg0, arg2.getAddress(), this.field3866 ? 35040 : 35044);
            this.field3860.field3333 += arg0 - this.field3873;
            this.field3876 = arg0;
        }
        this.field3873 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!lfa", name = "finalize", descriptor = "()V", line = 209)
    protected final void finalize() throws Throwable {
        field3862++;
        this.method970(-124);
        super.finalize();
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljaggl/MapBuffer;Z)Z", line = 226)
    public final boolean method1807(MapBuffer arg0, boolean arg1) {
        field3880++;
        boolean var3 = arg1;
        if (this.field3864 != 0) {
            if (this.field3868 > 0) {
                OpenGL.glBindBufferARB(this.field3874, this.field3868);
                if (this.field3864 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field3874, 0, this.field3876, this.field3860.field3304.getAddress());
                } else {
                    var3 = arg0.method3331();
                }
            }
            this.field3864 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "(I)V", line = 259)
    public final void method1808(int arg0) {
        if (this.field3860.field719) {
            OpenGL.glBindBufferARB(this.field3874, this.field3868);
        }
        if (arg0 != 0) {
            this.field3860 = null;
        }
        field3877++;
    }

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)V", line = 274)
    private final void method1809(int arg0) {
        field3878++;
        int var2 = 75 % ((arg0 - 40) / 61);
        if (this.field3868 >= 0) {
            return;
        }
        if (this.field3860.field719) {
            OpenGL.glGenBuffersARB(1, class308.field4320, 0);
            this.field3868 = class308.field4320[0];
            OpenGL.glBindBufferARB(this.field3874, this.field3868);
        } else {
            this.field3868 = 0;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)I", line = 298)
    public int method971(int arg0) {
        field3881++;
        return arg0 == -127 ? this.field3873 : 58;
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lhj;IZ)V", line = 582)
    public class264(class47 arg0, int arg1, boolean arg2) {
        this.field3874 = arg1;
        this.field3860 = arg0;
        this.field3866 = arg2;
    }

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "(I)J", line = 322)
    public final long method1810(int arg0) {
        if (arg0 != -1) {
            this.field3860 = null;
        }
        field3879++;
        return this.field3868 == 0 ? this.field3875.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIIIIII)V", line = 333)
    public static final void method1811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3882++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg6 - arg7;
        int var12 = arg2 - arg7;
        int var13 = arg6 * arg6;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (arg5 <= 25) {
            field3869 = null;
        }
        if (arg4 >= class291.field4181 && class262.field3848 >= arg4) {
            int[] var38 = class538.field7454[arg4];
            int var39 = class41.method223(true, class726.field10064, class607.field8185, arg0 - arg6);
            int var40 = class41.method223(true, class726.field10064, class607.field8185, arg0 + arg6);
            int var41 = class41.method223(true, class726.field10064, class607.field8185, arg0 - var11);
            int var42 = class41.method223(true, class726.field10064, class607.field8185, arg0 + var11);
            class102.method675(arg3, 93, var39, var41, var38);
            class102.method675(arg1, -95, var41, var42, var38);
            class102.method675(arg3, -49, var42, var40, var38);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg4 - var9;
            int var46 = arg4 + var9;
            if (class291.field4181 <= var46 && var45 <= class262.field3848) {
                int var47 = class41.method223(true, class726.field10064, class607.field8185, arg0 + var8);
                int var48 = class41.method223(true, class726.field10064, class607.field8185, arg0 - var8);
                if (var44) {
                    int var49 = class41.method223(true, class726.field10064, class607.field8185, arg0 + var10);
                    int var50 = class41.method223(true, class726.field10064, class607.field8185, arg0 - var10);
                    if (var45 >= class291.field4181) {
                        int[] var51 = class538.field7454[var45];
                        class102.method675(arg3, -93, var48, var50, var51);
                        class102.method675(arg1, -114, var50, var49, var51);
                        class102.method675(arg3, -100, var49, var47, var51);
                    }
                    if (var46 <= class262.field3848) {
                        int[] var52 = class538.field7454[var46];
                        class102.method675(arg3, 76, var48, var50, var52);
                        class102.method675(arg1, 107, var50, var49, var52);
                        class102.method675(arg3, -63, var49, var47, var52);
                    }
                } else {
                    if (var45 >= class291.field4181) {
                        class102.method675(arg3, 101, var48, var47, class538.field7454[var45]);
                    }
                    if (var46 <= class262.field3848) {
                        class102.method675(arg3, -39, var48, var47, class538.field7454[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V", line = 563)
    public void method970(int arg0) {
        if (arg0 > -95) {
            return;
        }
        field3867++;
        if (this.field3868 > 0) {
            this.field3860.method293(this.field3868, (byte) -119, this.field3873);
            this.field3868 = -1;
        }
    }
}
