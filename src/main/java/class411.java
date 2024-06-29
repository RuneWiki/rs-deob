import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class411 implements class686 {

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
    private boolean field5813 = false;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Leq;")
    public class357 field5807;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    private int field5811;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public int field5809;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public int field5794;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "Z")
    private boolean field5806;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public int field5803;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Lmq;")
    public static class78 field5797 = new class78(100, 6);

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field5814;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kp", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field5815;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "()V")
    public static final void method2428() {
        for (int var0 = 0; var0 < class150.field1824; var0++) {
            if (!class399.field5524[var0]) {
                class615 var1 = class708.field9968[var0];
                class621 var2 = var1.field8615;
                int var3 = var1.field8605;
                int var4 = var2.method3399((byte) -108) - class5.field54;
                int var5 = (var4 * 2 >> class455.field6383) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3402(true) - var4 >> class455.field6383;
                int var9 = var2.method3404(-1) - var4 >> class455.field6383;
                int var10 = var2.method3404(-1) + var4 >> class455.field6383;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class665.field9107) {
                    var10 = class665.field9107 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field8604[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class90.field1142) {
                        var16 = class90.field1142 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class451 var19 = class730.method4079(var3, var17, var11, field5815 == null ? (field5815 = method2440("rq")) : field5815);
                        if (var19 != null && var19.field6323 != 0) {
                            if (var19.field6323 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field8604[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field8604[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field8604[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field8604[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class399.field5524[var0] = true;
                class517.field7282[var3].method539(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public final void method2429(byte arg0) {
        field5812++;
        if (arg0 < -91 && this.field5803 > 0) {
            this.field5807.method2196(this.method2435(true), this.field5803, (byte) 32);
            this.field5803 = 0;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Z")
    public static final boolean method2430(int arg0, int arg1, int arg2) {
        field5796++;
        if (arg2 == 0) {
            return class467.method2759(6509, arg1, arg0) || class126.method815(arg0, 3, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
    private final void method2431(int arg0, int arg1) {
        field5804++;
        this.field5807.field4972 -= arg1;
        this.field5807.field4972 += this.method2435(true);
        int var3 = 29 / ((arg0 - 24) / 59);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V")
    private final void method2432(byte arg0) {
        if (arg0 != -123) {
            this.method2439(false);
        }
        this.field5807.method2120(-1, this);
        field5805++;
        if (this.field5813) {
            OpenGL.glTexParameteri(this.field5794, 10241, this.field5806 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5794, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5794, 10241, this.field5806 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5794, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
    public final void method2433(boolean arg0, int arg1) {
        field5802++;
        if (arg0 != this.field5813) {
            this.field5813 = arg0;
            this.method2432((byte) -123);
        }
        if (arg1 >= -84) {
            method2430(-69, 79, 41);
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)V")
    public static void method2434(byte arg0) {
        int var1 = 35 % ((arg0 - 28) / 37);
        field5797 = null;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)I")
    private final int method2435(boolean arg0) {
        if (!arg0) {
            this.method2436(49, false);
        }
        field5808++;
        int var2 = this.field5807.method2179(this.field5809, (byte) -97) * this.field5811;
        return this.field5806 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
    public final void method2436(int arg0, boolean arg1) {
        field5799++;
        if (arg0 >= 119 && this.field5806 != arg1) {
            int var3 = this.method2435(true);
            this.field5806 = true;
            this.method2432((byte) -123);
            this.method2431(113, var3);
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(Z)Z")
    public final boolean method2437(boolean arg0) {
        field5800++;
        if (this.field5807.field5073) {
            int var2 = this.method2435(arg0);
            this.field5807.method2120(-1, this);
            OpenGL.glGenerateMipmapEXT(this.field5794);
            this.field5806 = true;
            this.method2432((byte) -123);
            this.method2431(86, var2);
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class35.method318(0, arg3, arg4, arg8, arg0, 0, arg6, arg1, arg5, arg2);
        if (arg7 >= 102) {
            field5814++;
        }
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(Z)I")
    public final int method2439(boolean arg0) {
        if (!arg0) {
            this.method2433(false, 44);
        }
        field5810++;
        return this.field5803;
    }

    @OriginalMember(owner = "client!kp", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5798++;
        this.method2429((byte) -124);
        super.finalize();
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Leq;IIIZ)V")
    public class411(class357 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5807 = arg0;
        this.field5811 = arg3;
        this.field5809 = arg2;
        this.field5794 = arg1;
        this.field5806 = arg4;
        OpenGL.glGenTextures(1, class373.field5247, 0);
        this.field5803 = class373.field5247[0];
        this.method2431(-128, 0);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
    public abstract void method369(boolean arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2440(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
