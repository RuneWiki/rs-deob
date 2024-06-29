import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class460 {

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    private int field6808 = 32;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "Z")
    private boolean field6824 = false;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "J")
    private long field6811 = class375.method2397((byte) -75);

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "[Lms;")
    private class82[] field6830 = new class82[8];

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "J")
    private long field6833 = 0L;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    private int field6829 = 0;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    private int field6835 = 0;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "[Lms;")
    private class82[] field6831 = new class82[8];

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    private int field6827 = 0;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    private int field6826 = 0;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "Z")
    private boolean field6834 = true;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "J")
    private long field6837 = 0L;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field6813 = 0;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    private int field6828;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public int field6832;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public int field6836;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lms;")
    private class82 field6806;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "[I")
    public int[] field6823;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
    private final void method2816(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method917();
        }
        this.field6835 -= arg0;
        field6816++;
        if (this.field6835 < 0) {
            this.field6835 = 0;
        }
        if (this.field6806 != null) {
            this.field6806.method721(arg0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lms;B)V")
    public final synchronized void method2817(class82 arg0, byte arg1) {
        if (arg1 == -114) {
            field6805++;
            this.field6806 = arg0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V")
    public void method912() throws Exception {
        field6821++;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()V")
    public void method915() throws Exception {
        field6818++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public final synchronized void method2818(byte arg0) {
        field6825++;
        if (this.field6824) {
            return;
        }
        long var2 = class375.method2397((byte) -75);
        try {
            if ((this.field6811 + 500000L) < var2) {
                this.field6811 = var2 - 500000L;
            }
            while (var2 > this.field6811 + 5000L) {
                this.method2816(256, 0);
                this.field6811 += (256000 / class193.field2961);
            }
        } catch (Exception var7) {
            this.field6811 = var2;
        }
        if (this.field6823 == null) {
            return;
        }
        try {
            if (this.field6833 != 0L) {
                if (var2 < this.field6833) {
                    return;
                }
                this.method916(this.field6836);
                this.field6834 = true;
                this.field6833 = 0L;
            }
            if (arg0 == -73) {
                int var4 = this.method913();
                if (this.field6827 < (this.field6829 - var4)) {
                    this.field6827 = this.field6829 - var4;
                }
                int var5 = this.field6832 + this.field6828;
                if ((var5 + 256) > 16384) {
                    var5 = 16128;
                }
                if ((var5 + 256) > this.field6836) {
                    this.field6836 += 1024;
                    if (this.field6836 > 16384) {
                        this.field6836 = 16384;
                    }
                    this.method917();
                    this.method916(this.field6836);
                    var4 = 0;
                    this.field6834 = true;
                    if ((var5 + 256) > this.field6836) {
                        var5 = this.field6836 - 256;
                        this.field6828 = var5 - this.field6832;
                    }
                }
                while (var4 < var5) {
                    this.method2824(this.field6823, 256);
                    var4 += 256;
                    this.method915();
                }
                if (this.field6837 < var2) {
                    if (this.field6834) {
                        this.field6834 = false;
                    } else if (this.field6827 == 0 && this.field6826 == 0) {
                        this.method917();
                        this.field6833 = var2 + 2000L;
                        return;
                    } else {
                        this.field6828 = Math.min(this.field6826, this.field6827);
                        this.field6826 = this.field6827;
                    }
                    this.field6827 = 0;
                    this.field6837 = var2 + 2000L;
                }
                this.field6829 = var4;
            }
        } catch (Exception var6) {
            this.method917();
            this.field6833 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public final synchronized void method2819(int arg0) {
        if (class423.field6214 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class423.field6214.field2679[var3] == this) {
                    class423.field6214.field2679[var3] = null;
                }
                if (class423.field6214.field2679[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class423.field6214.field2676 = true;
                while (class423.field6214.field2677) {
                    class468.method2848(50L, (byte) 51);
                }
                class423.field6214 = null;
            }
        }
        field6817++;
        this.method917();
        this.field6823 = null;
        if (arg0 >= 39) {
            this.field6824 = true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "()V")
    public void method917() {
        field6820++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLms;I)V")
    private final void method2820(byte arg0, class82 arg1, int arg2) {
        field6812++;
        int var4 = arg2 >> 5;
        class82 var5 = this.field6831[var4];
        if (var5 == null) {
            this.field6830[var4] = arg1;
        } else {
            var5.field1335 = arg1;
        }
        int var6 = 5 / ((arg0 - 58) / 54);
        this.field6831[var4] = arg1;
        arg1.field1333 = arg2;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public void method916(int arg0) throws Exception {
        field6819++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([IIIIIIII)V")
    public static final void method2821(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6807++;
        if (arg4 > 0 && !class380.method2416(-1, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class380.method2416(-1, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg7 == 32993) {
            int var8 = 0;
            int var9 = arg4 >= arg2 ? arg2 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg2 >> 1;
            if (arg1 < 6) {
                field6813 = -60;
            }
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg5, var8, arg6, arg4, arg2, 0, arg7, arg3, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg4;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = (var20 & 0xFF6B) >> 8;
                        int var24 = var12[var16++];
                        int var25 = var20 >> 16 & 0xFF;
                        int var26 = var20 >> 24 & 0xFF;
                        int var27 = var20 & 0xFF;
                        int var28 = ((var21 & 0xFF9712) >> 16) + var25;
                        int var29 = (var21 >> 24 & 0xFF) + var26;
                        int var30 = (var21 >> 8 & 0xFF) + var23;
                        int var31 = (var21 & 0xFF) + var27;
                        int var32 = (var22 >> 24 & 0xFF) + var29;
                        int var33 = (var22 >> 8 & 0xFF) + var30;
                        int var34 = (var22 >> 16 & 0xFF) + var28;
                        int var35 = (var22 & 0xFF) + var31;
                        int var36 = (var24 & 0xFF) + var35;
                        int var37 = (var24 >> 16 & 0xFF) + var34;
                        int var38 = ((var24 & 0xFFB0) >> 8) + var33;
                        int var39 = (var24 >> 24 & 0xFF) + var32;
                        var13[var14++] = class19.method118(class307.method2028(1020, var36) >> 2, class19.method118(class307.method2028(1020, var38) << 6, class19.method118(class307.method2028(16711680, var37 << 14), class307.method2028(-16777216, var39 << 22))));
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                var12 = var18;
                arg4 = var10;
                arg2 = var11;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public final synchronized void method2822(int arg0) {
        this.field6834 = true;
        field6810++;
        if (arg0 != 958016102) {
            return;
        }
        try {
            this.method912();
        } catch (Exception var2) {
            this.method917();
            this.field6833 = class375.method2397((byte) -75) + 2000L;
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "()I")
    public int method913() throws Exception {
        field6814++;
        return this.field6836;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method911(Component arg0) throws Exception {
        field6822++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILum;Lum;)V")
    public static final void method2823(int arg0, class83 arg1, class83 arg2) {
        class527.field7724 = arg2;
        field6815++;
        if (arg0 <= -55) {
            class59.field895 = arg1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([II)V")
    private final void method2824(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class162.field2453) {
            var3 = arg1 << 1;
        }
        class325.method2135(arg0, 0, var3);
        this.field6835 -= arg1;
        if (this.field6806 != null && this.field6835 <= 0) {
            this.field6835 += class193.field2961 >> 4;
            class265.method1843(0, this.field6806);
            this.method2820((byte) 120, this.field6806, this.field6806.method724());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class82 var10 = null;
                        class82 var11 = this.field6830[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class475 var12 = var11.field1336;
                                if (var12 == null || var12.field6952 <= var8) {
                                    var11.field1334 = true;
                                    int var13 = var11.method722();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field6952 += var13;
                                    }
                                    if (var4 >= this.field6808) {
                                        break label107;
                                    }
                                    class82 var14 = var11.method720();
                                    if (var14 != null) {
                                        int var15 = var11.field1333;
                                        while (var14 != null) {
                                            this.method2820((byte) 123, var14, var15 * var14.method724() >> 8);
                                            var14 = var11.method719();
                                        }
                                    }
                                    class82 var16 = var11.field1335;
                                    var11.field1335 = null;
                                    if (var10 == null) {
                                        this.field6830[var7] = var16;
                                    } else {
                                        var10.field1335 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field6831[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1335;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class82 var18 = this.field6830[var17];
                this.field6830[var17] = this.field6831[var17] = null;
                while (var18 != null) {
                    class82 var19 = var18.field1335;
                    var18.field1335 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field6835 < 0) {
            this.field6835 = 0;
        }
        if (this.field6806 != null) {
            this.field6806.method725(arg0, 0, arg1);
        }
        this.field6811 = class375.method2397((byte) -75);
    }
}
