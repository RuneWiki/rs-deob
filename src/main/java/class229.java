import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class229 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    private int field3928 = 32;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "J")
    private long field3942 = class164.method1183((byte) 80);

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "[Lhk;")
    private class30[] field3952 = new class30[8];

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    private int field3959 = 0;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    private int field3953 = 0;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "[Lhk;")
    private class30[] field3956 = new class30[8];

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "J")
    private long field3957 = 0L;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Z")
    private boolean field3960 = true;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    private int field3958 = 0;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "J")
    private long field3962 = 0L;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    private int field3963 = 0;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[[I")
    public static int[][] field3934 = new int[104][104];

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Lq;")
    public static class148 field3941 = null;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field3933 = 0;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Z")
    public static boolean field3932 = true;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    private int field3961;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lhk;")
    private class30 field3948;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
    public int[] field3940;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "[Lj;")
    public static class189[] field3947;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
    public void method1099() {
        field3950++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1102(Component arg0) throws Exception {
        field3931++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([II)V")
    private final void method1575(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class61.field1028) {
            var3 = arg1 << 1;
        }
        class66.method464(arg0, 0, var3);
        this.field3953 -= arg1;
        if (this.field3948 != null && this.field3953 <= 0) {
            this.field3953 += class253.field4432 >> 4;
            class83.method620(6562, this.field3948);
            this.method1576((byte) 100, this.field3948.method210(), this.field3948);
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
                        class30 var10 = null;
                        class30 var11 = this.field3956[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class259 var12 = var11.field547;
                                if (var12 == null || var12.field4559 <= var8) {
                                    var11.field546 = true;
                                    int var13 = var11.method80();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4559 += var13;
                                    }
                                    if (var4 >= this.field3928) {
                                        break label107;
                                    }
                                    class30 var14 = var11.method72();
                                    if (var14 != null) {
                                        int var15 = var11.field545;
                                        while (var14 != null) {
                                            this.method1576((byte) 109, var15 * var14.method210() >> 8, var14);
                                            var14 = var11.method88();
                                        }
                                    }
                                    class30 var16 = var11.field548;
                                    var11.field548 = null;
                                    if (var10 == null) {
                                        this.field3956[var7] = var16;
                                    } else {
                                        var10.field548 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3952[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field548;
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
                class30 var18 = this.field3956[var17];
                this.field3956[var17] = this.field3952[var17] = null;
                while (var18 != null) {
                    class30 var19 = var18.field548;
                    var18.field548 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3953 < 0) {
            this.field3953 = 0;
        }
        if (this.field3948 != null) {
            this.field3948.method56(arg0, 0, arg1);
        }
        this.field3942 = class164.method1183((byte) 80);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BILhk;)V")
    private final void method1576(byte arg0, int arg1, class30 arg2) {
        field3946++;
        int var4 = 78 % ((-arg0 - 46) / 57);
        int var5 = arg1 >> 5;
        class30 var6 = this.field3952[var5];
        if (var6 == null) {
            this.field3956[var5] = arg2;
        } else {
            var6.field548 = arg2;
        }
        this.field3952[var5] = arg2;
        arg2.field545 = arg1;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()V")
    public void method1100() throws Exception {
        field3937++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public void method1104(int arg0) throws Exception {
        field3930++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
    public static final void method1577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3933 = arg2;
        class116.field2077 = arg1;
        class106.field1899 = arg0;
        field3951++;
        class215.field3666 = arg4;
        if (arg3 != 286331153) {
            field3932 = true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Z")
    public static final boolean method1578(int arg0, int arg1, int arg2) {
        int var3 = class86.field1512[arg0][arg1][arg2];
        if (-class1.field11 == var3) {
            return false;
        } else if (class1.field11 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class16.method143(var4 + 1, class78.field1393[arg0][arg1][arg2], var5 + 1) && class16.method143(var4 + 128 - 1, class78.field1393[arg0][arg1 + 1][arg2], var5 + 1) && class16.method143(var4 + 128 - 1, class78.field1393[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class16.method143(var4 + 1, class78.field1393[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class86.field1512[arg0][arg1][arg2] = class1.field11;
                return true;
            } else {
                class86.field1512[arg0][arg1][arg2] = -class1.field11;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()I")
    public int method1103() throws Exception {
        field3939++;
        return this.field3954;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method1579(byte arg0) {
        this.field3960 = true;
        field3935++;
        if (arg0 != 64) {
            method1584(28);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public final synchronized void method1580(int arg0) {
        field3949++;
        if (this.field3940 == null) {
            return;
        }
        long var2 = class164.method1183((byte) 80);
        try {
            if (this.field3962 != 0L) {
                if (this.field3962 > var2) {
                    return;
                }
                this.method1104(this.field3954);
                this.field3960 = true;
                this.field3962 = 0L;
            }
            int var4 = this.method1103();
            int var5 = this.field3955 + this.field3961;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3959 < this.field3958 - var4) {
                this.field3959 = this.field3958 - var4;
            }
            if (var5 + 256 > this.field3954) {
                var4 = 0;
                this.field3954 += 1024;
                if (this.field3954 > 16384) {
                    this.field3954 = 16384;
                }
                this.method1099();
                this.method1104(this.field3954);
                if ((var5 + 256) > this.field3954) {
                    var5 = this.field3954 - 256;
                    this.field3961 = var5 - this.field3955;
                }
                this.field3960 = true;
            }
            while (var4 < var5) {
                this.method1575(this.field3940, 256);
                this.method1105();
                var4 += 256;
            }
            if (var2 > this.field3957) {
                if (this.field3960) {
                    this.field3960 = false;
                } else if (this.field3959 == 0 && this.field3963 == 0) {
                    this.method1099();
                    this.field3962 = var2 + 2000L;
                    return;
                } else {
                    this.field3961 = Math.min(this.field3963, this.field3959);
                    this.field3963 = this.field3959;
                }
                this.field3957 = var2 + 2000L;
                this.field3959 = 0;
            }
            this.field3958 = var4;
        } catch (Exception var7) {
            this.method1099();
            this.field3962 = var2 + 2000L;
        }
        try {
            if (var2 > this.field3942 + 500000L) {
                var2 = this.field3942;
            }
            if (arg0 != 5386) {
                this.method1583(-68, (class30) null);
            }
            while (this.field3942 + 5000L < var2) {
                this.method1582(256, 16128);
                this.field3942 += (long) (256000 / class253.field4432);
            }
        } catch (Exception var6) {
            this.field3942 = var2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public final synchronized void method1581(int arg0) {
        field3945++;
        this.field3960 = true;
        if (arg0 != -13476) {
            this.method1575((int[]) null, 60);
        }
        try {
            this.method1100();
        } catch (Exception var2) {
            this.method1099();
            this.field3962 = class164.method1183((byte) 80) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    private final void method1582(int arg0, int arg1) {
        field3936++;
        this.field3953 -= arg0;
        if (this.field3953 < 0) {
            this.field3953 = 0;
        }
        if (this.field3948 != null) {
            this.field3948.method54(arg0);
        }
        if (arg1 != 16128) {
            this.method1575((int[]) null, -7);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILhk;)V")
    public final synchronized void method1583(int arg0, class30 arg1) {
        field3929++;
        if (arg0 > 107) {
            this.field3948 = arg1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public static void method1584(int arg0) {
        field3934 = null;
        field3941 = null;
        field3947 = null;
        if (arg0 <= 120) {
            method1584(-54);
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "()V")
    public void method1105() throws Exception {
        field3943++;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public final synchronized void method1585(int arg0) {
        if (arg0 != 13270) {
            this.field3960 = false;
        }
        field3938++;
        if (class184.field3167 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class184.field3167.field1962[var3] == this) {
                    class184.field3167.field1962[var3] = null;
                }
                if (class184.field3167.field1962[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class184.field3167.field1955 = true;
                while (class184.field3167.field1959) {
                    class234.method1603(50L, -113);
                }
                class184.field3167 = null;
            }
        }
        this.method1099();
        this.field3940 = null;
    }
}
