import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class283 extends class17 {

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Z")
    public boolean field4944 = true;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "[B")
    private byte[] field4952 = new byte[512];

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public int field4949 = 0;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public int field4951 = 1638;

    @OriginalMember(owner = "client!ae", name = "pb", descriptor = "I")
    public int field4959 = 4;

    @OriginalMember(owner = "client!ae", name = "ub", descriptor = "I")
    public int field4964 = 4;

    @OriginalMember(owner = "client!ae", name = "wb", descriptor = "I")
    public int field4966 = 4;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "[I")
    public static int[] field4947 = new int[2048];

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "[I")
    public static int[] field4945 = new int[99];

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "[Lsf;")
    public static class108[] field4958;

    @OriginalMember(owner = "client!ae", name = "sb", descriptor = "Z")
    public static boolean field4962;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!ae", name = "rb", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ae", name = "tb", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!ae", name = "vb", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "Lik;")
    public static class262 field4957;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "[S")
    private short[] field4950;

    @OriginalMember(owner = "client!ae", name = "qb", descriptor = "[S")
    private short[] field4960;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)V", line = 11)
    private final void method2032(boolean arg0) {
        if (!arg0) {
            method2036(-10);
        }
        field4954++;
        if (this.field4951 > 0) {
            this.field4950 = new short[this.field4964];
            this.field4960 = new short[this.field4964];
            for (int var2 = 0; var2 < this.field4964; var2++) {
                this.field4950[var2] = (short) ((int) (Math.pow((double) ((float) this.field4951 / 4096.0F), (double) var2) * 4096.0D));
                this.field4960[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4950 != null && this.field4950.length == this.field4964) {
            this.field4960 = new short[this.field4964];
            for (int var3 = 0; var3 < this.field4964; var3++) {
                this.field4960[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)V", line = 50)
    public static final void method2033(int arg0) {
        field4948++;
        class331.field5651.method644((byte) 98);
        class229.field3992.method644((byte) 94);
        if (arg0 == -798165300) {
            class72.field1094.method644((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(II)[I", line = 63)
    public final int[] method120(int arg0, int arg1) {
        field4956++;
        int[] var3 = this.field217.method1698(127, arg1);
        if (arg0 > -95) {
            this.field4966 = -90;
        }
        if (this.field217.field4295) {
            this.method2038(var3, arg1, (byte) -60);
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4945[var1] = var0 / 4;
        }
        field4958 = new class108[1000];
        field4962 = true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLt;)V", line = 95)
    public static final void method2034(boolean arg0, class257 arg1) {
        field4955++;
        for (int var2 = 0; var2 < class282.field4943.length; var2++) {
            class282.field4943[var2] = 0;
        }
        if (arg0) {
            method2034(false, (class257) null);
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var3 * Math.random() * 128.0D);
            class282.field4943[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var3 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class52.field764[var9] = (class282.field4943[var9 + 128] + class282.field4943[var9 + 1] + class282.field4943[var9 + -1] + class282.field4943[var9 + -128]) / 4;
                }
            }
            int[] var10 = class282.field4943;
            class282.field4943 = class52.field764;
            class52.field764 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field884; var12++) {
            for (int var13 = 0; var13 < arg1.field889; var13++) {
                if (arg1.field4551[var11++] != 0) {
                    int var14 = var13 + arg1.field878 + 16;
                    int var15 = arg1.field881 + var12 + 16;
                    int var16 = (var15 << 7) + var14;
                    class282.field4943[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V", line = 200)
    public final void method116(boolean arg0) {
        this.field4952 = class135.method927(this.field4949, 0);
        if (!arg0) {
            this.field4952 = (byte[]) null;
        }
        field4961++;
        this.method2032(arg0);
        for (int var2 = this.field4964 - 1; var2 >= 1; var2--) {
            short var3 = this.field4950[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field4964--;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 234)
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLrm;I)V", line = 261)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            this.field4960 = (short[]) null;
        }
        field4965++;
        if (arg2 == 0) {
            this.field4944 = arg1.method1731(true) == 1;
        } else if (arg2 == 1) {
            this.field4964 = arg1.method1731(true);
        } else if (arg2 == 2) {
            this.field4951 = arg1.method1728(true);
            if (this.field4951 < 0) {
                this.field4950 = new short[this.field4964];
                for (int var5 = 0; var5 < this.field4964; var5++) {
                    this.field4950[var5] = (short) arg1.method1728(true);
                }
            }
        } else if (arg2 == 3) {
            this.field4959 = this.field4966 = arg1.method1731(true);
        } else if (arg2 == 4) {
            this.field4949 = arg1.method1731(true);
        } else if (arg2 == 5) {
            this.field4959 = arg1.method1731(true);
        } else if (arg2 == 6) {
            this.field4966 = arg1.method1731(true);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 362)
    public static void method2035(byte arg0) {
        field4958 = null;
        field4945 = null;
        field4957 = null;
        field4947 = null;
        if (arg0 < 3) {
            method2033(-43);
        }
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)[Lvd;", line = 385)
    public static final class135[] method2036(int arg0) {
        field4946++;
        class135[] var1 = new class135[class196.field3546];
        if (arg0 > -35) {
            return (class135[]) null;
        }
        for (int var2 = 0; var2 < class196.field3546; var2++) {
            int var3 = class273.field4795[var2] * class155.field2780[var2];
            byte[] var4 = class94.field1512[var2];
            if (class236.field4142[var2]) {
                byte[] var7 = class39.field542[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class242.method1674(class321.field5494[class162.method1118(255, var4[var9])], class162.method1118(var7[var9], 255) << 24);
                }
                if (class231.field4051) {
                    var1[var2] = new class153(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], var8);
                } else {
                    var1[var2] = new class82(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class321.field5494[class162.method1118(255, var4[var6])];
                }
                if (class231.field4051) {
                    var1[var2] = new class49(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], var5);
                } else {
                    var1[var2] = new class12(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], var5);
                }
            }
        }
        class15.method100(1);
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)I", line = 450)
    private final int method2037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4963++;
        int var8 = arg0 - 4096;
        int var9 = arg1 >> 12;
        int var10 = arg1 & 0xFFF;
        int var11 = var9 + 1;
        if (arg6 <= var11) {
            var11 = 0;
        }
        int var12 = var9 & 0xFF;
        int var13 = class140.field2462[var10];
        int var14 = var10 - 4096;
        if (arg3 != -8155) {
            this.field4960 = (short[]) null;
        }
        int var15 = var11 & 0xFF;
        int var16 = this.field4952[var12 + arg2] & 0x3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? arg0 + var10 : -var10 + arg0;
        } else {
            var17 = var16 == 2 ? var10 - arg0 : -arg0 + -var10;
        }
        int var18 = this.field4952[arg2 + var15] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? var14 + arg0 : -var14 + arg0;
        } else {
            var19 = var18 == 2 ? var14 - arg0 : -arg0 + -var14;
        }
        int var20 = this.field4952[var12 + arg5] & 0x3;
        int var21 = ((var19 - var17) * var13 >> 12) + var17;
        int var22;
        if (var20 > 1) {
            var22 = var20 == 2 ? var10 - var8 : -var8 + -var10;
        } else {
            var22 = var20 == 0 ? var8 + var10 : -var10 + var8;
        }
        int var23 = this.field4952[arg5 + var15] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        } else {
            var24 = var23 == 0 ? var8 + var14 : -var14 + var8;
        }
        int var25 = ((var24 - var22) * var13 >> 12) + var22;
        return ((var25 - var21) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([IIB)V", line = 530)
    public final void method2038(int[] arg0, int arg1, byte arg2) {
        field4953++;
        int var4 = class36.field504[arg1] * this.field4966;
        if (this.field4964 == 1) {
            int var38 = this.field4960[0] << 12;
            int var39 = this.field4959 * var38 >> 12;
            short var40 = this.field4950[0];
            int var41 = var4 * var38 >> 12;
            int var42 = this.field4966 * var38 >> 12;
            int var43 = var41 >> 12;
            int var44 = var41 & 0xFFF;
            int var45 = var43 + 1;
            int var46 = class140.field2462[var44];
            int var47 = this.field4952[var43 & 0xFF] & 0xFF;
            if (var45 >= var42) {
                var45 = 0;
            }
            int var48 = this.field4952[var45 & 0xFF] & 0xFF;
            if (this.field4944) {
                for (int var49 = 0; var49 < class116.field2008; var49++) {
                    int var50 = class61.field979[var49] * this.field4959;
                    int var51 = this.method2037(var44, var38 * var50 >> 12, var47, -8155, var46, var48, var39);
                    int var52 = var40 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class116.field2008; var53++) {
                    int var54 = class61.field979[var53] * this.field4959;
                    int var55 = this.method2037(var44, var38 * var54 >> 12, var47, -8155, var46, var48, var39);
                    arg0[var53] = var40 * var55 >> 12;
                }
            }
        } else {
            short var5 = this.field4950[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field4960[0] << 12;
                int var7 = this.field4959 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = var8 >> 12;
                int var10 = var8 & 0xFFF;
                int var11 = this.field4966 * var6 >> 12;
                int var12 = var9 + 1;
                if (var12 >= var11) {
                    var12 = 0;
                }
                int var13 = this.field4952[var12 & 0xFF] & 0xFF;
                int var14 = this.field4952[var9 & 0xFF] & 0xFF;
                int var15 = class140.field2462[var10];
                for (int var16 = 0; var16 < class116.field2008; var16++) {
                    int var17 = class61.field979[var16] * this.field4959;
                    int var18 = this.method2037(var10, var6 * var17 >> 12, var14, -8155, var15, var13, var7);
                    arg0[var16] = var5 * var18 >> 12;
                }
            }
            for (int var19 = 1; var19 < this.field4964; var19++) {
                short var20 = this.field4950[var19];
                if (var20 > 8 || var20 < -8) {
                    int var21 = this.field4960[var19] << 12;
                    int var22 = this.field4959 * var21 >> 12;
                    int var23 = this.field4966 * var21 >> 12;
                    int var24 = var4 * var21 >> 12;
                    int var25 = var24 >> 12;
                    int var26 = this.field4952[var25 & 0xFF] & 0xFF;
                    int var27 = var25 + 1;
                    int var28 = var24 & 0xFFF;
                    int var29 = class140.field2462[var28];
                    if (var23 <= var27) {
                        var27 = 0;
                    }
                    int var30 = this.field4952[var27 & 0xFF] & 0xFF;
                    if (this.field4944 && this.field4964 - 1 == var19) {
                        for (int var31 = 0; var31 < class116.field2008; var31++) {
                            int var32 = class61.field979[var31] * this.field4959;
                            int var33 = this.method2037(var28, var21 * var32 >> 12, var26, -8155, var29, var30, var22);
                            int var34 = (var20 * var33 >> 12) + arg0[var31];
                            arg0[var31] = (var34 >> 1) + 2048;
                        }
                    } else {
                        for (int var35 = 0; var35 < class116.field2008; var35++) {
                            int var36 = class61.field979[var35] * this.field4959;
                            int var37 = this.method2037(var28, var21 * var36 >> 12, var26, -8155, var29, var30, var22);
                            arg0[var35] += var20 * var37 >> 12;
                        }
                    }
                }
            }
        }
        if (arg2 > -25) {
            this.method116(true);
        }
    }
}
