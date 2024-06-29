import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class249 {

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[B")
    private byte[] field4310;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[I")
    private int[] field4317;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "[I")
    private int[] field4316;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static volatile int field4306 = -1;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field4311 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lqe;")
    public static class168 field4309 = class66.method448("Schlie-8en", -120);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[S")
    public static short[] field4305 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4314 = 100;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Z")
    public static boolean field4315 = true;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lqe;")
    public static class168 field4318 = class66.method448("blinken1:", 49);

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[I")
    public static int[] field4320 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Z")
    public static boolean field4321 = false;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[Lqe;")
    public static class168[] field4307;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BZI[BII)I")
    public final int method1643(byte[] arg0, boolean arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field4319++;
        if (arg5 == 0) {
            return 0;
        } else if (arg1) {
            int var7 = arg2 + arg5;
            int var8 = 0;
            int var9 = arg4;
            while (true) {
                byte var10 = arg3[var9];
                if (var10 >= 0) {
                    var8++;
                } else {
                    var8 = this.field4317[var8];
                }
                int var11;
                if ((var11 = this.field4317[var8]) < 0) {
                    arg0[arg2++] = (byte) ~var11;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field4317[var8];
                }
                int var12;
                if ((var12 = this.field4317[var8]) < 0) {
                    arg0[arg2++] = (byte) ~var12;
                    if (arg2 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field4317[var8];
                }
                int var13;
                if ((var13 = this.field4317[var8]) < 0) {
                    arg0[arg2++] = (byte) ~var13;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field4317[var8];
                }
                int var14;
                if ((var14 = this.field4317[var8]) < 0) {
                    arg0[arg2++] = (byte) ~var14;
                    if (arg2 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field4317[var8];
                }
                int var15;
                if ((var15 = this.field4317[var8]) < 0) {
                    arg0[arg2++] = (byte) ~var15;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field4317[var8];
                }
                int var16;
                if ((var16 = this.field4317[var8]) < 0) {
                    arg0[arg2++] = (byte) ~var16;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field4317[var8];
                }
                int var17;
                if ((var17 = this.field4317[var8]) < 0) {
                    arg0[arg2++] = (byte) ~var17;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field4317[var8];
                }
                int var18;
                if ((var18 = this.field4317[var8]) < 0) {
                    arg0[arg2++] = (byte) ~var18;
                    if (arg2 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg4;
        } else {
            return -66;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLoe;Loe;)V")
    public static final void method1644(byte arg0, class256 arg1, class256 arg2) {
        class88.field1368 = arg2;
        field4304++;
        class2.field17 = arg1;
        if (arg0 != -60) {
            field4305 = null;
        }
        class91.field1407 = class2.field17.method1694(3, 28851);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1645(byte arg0) {
        field4320 = null;
        if (arg0 != -6) {
            field4313 = 43;
        }
        field4307 = null;
        field4318 = null;
        field4309 = null;
        field4305 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BIIZ[B)I")
    public final int method1646(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        int var7 = arg0 + arg2;
        field4303++;
        int var8 = 0;
        if (!arg4) {
            return -89;
        }
        int var9 = arg3 << 3;
        while (var7 > arg0) {
            int var10 = arg5[arg0] & 0xFF;
            int var11 = this.field4316[var10];
            byte var12 = this.field4310[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class102.method675(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
    public class249(byte[] arg0) {
        int var2 = arg0.length;
        this.field4310 = arg0;
        this.field4317 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        this.field4316 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field4316[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class102.method675(var12, var11);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4317[var14] == 0) {
                            this.field4317[var14] = var3;
                        }
                        var14 = this.field4317[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4317.length) {
                        int[] var18 = new int[this.field4317.length * 2];
                        for (int var19 = 0; var19 < this.field4317.length; var19++) {
                            var18[var19] = this.field4317[var19];
                        }
                        this.field4317 = var18;
                    }
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field4317[var14] = ~var5;
            }
        }
    }
}
