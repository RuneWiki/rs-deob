import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class64 {

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
    private int[] field1085;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "[I")
    private int[] field1084;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "[B")
    private byte[] field1088;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lha;")
    public static class46 field1076 = class271.method1828("mapdots", -46);

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lha;")
    public static class46 field1078 = class271.method1828("null", -46);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field1079 = 0;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lha;")
    public static class46 field1083 = null;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lha;")
    public static class46 field1087 = class271.method1828("showVideoAd", -46);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
    public static final void method444(byte[] arg0, int arg1) {
        field1086++;
        class75 var2 = new class75(arg0);
        int var3 = var2.method558(1);
        if (var3 != 1) {
            return;
        }
        if (arg1 != -3372) {
            field1078 = null;
        }
        boolean var4 = var2.method558(1) == 1;
        if (var4) {
            class244.method1674((byte) -69, var2);
        }
        client.method1807(var2, (byte) -122);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BII[B)I")
    public final int method445(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field1080++;
        int var7 = arg0 + arg3;
        int var8 = arg1 << 3;
        int var9 = 0;
        while (var7 > arg3) {
            int var10 = arg2[arg3] & 0xFF;
            byte var11 = this.field1088[var10];
            int var12 = this.field1085[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            var8 += var11;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var14 + var11 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var9 = class235.method1595(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var9 = var12 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var9 = var12 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var9 = var12 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        if (arg4 != -990274781) {
            field1078 = null;
        }
        return (var8 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method446(int arg0) {
        field1087 = null;
        field1078 = null;
        if (arg0 != -1) {
            method449(-91, (class181) null);
        }
        field1083 = null;
        field1076 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)I")
    public static final int method447(byte arg0, int arg1) {
        field1077++;
        int var2 = 39 / ((-arg0 - 25) / 38);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BI[BII)I")
    public final int method448(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field1082++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 65 % ((-arg2 - 44) / 44);
        while (true) {
            byte var11 = arg3[var9];
            if (var11 >= 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var12;
            if ((var12 = this.field1084[var8]) < 0) {
                arg1[arg5++] = (byte) (~var12);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var13;
            if ((var13 = this.field1084[var8]) < 0) {
                arg1[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var14;
            if ((var14 = this.field1084[var8]) < 0) {
                arg1[arg5++] = (byte) (~var14);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var15;
            if ((var15 = this.field1084[var8]) < 0) {
                arg1[arg5++] = (byte) (~var15);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var16;
            if ((var16 = this.field1084[var8]) < 0) {
                arg1[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var17;
            if ((var17 = this.field1084[var8]) < 0) {
                arg1[arg5++] = (byte) (~var17);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var18;
            if ((var18 = this.field1084[var8]) < 0) {
                arg1[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var19;
            if ((var19 = this.field1084[var8]) < 0) {
                arg1[arg5++] = (byte) (~var19);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILpi;)I")
    public static final int method449(int arg0, class181 arg1) {
        field1081++;
        int var2 = 0;
        if (arg1.method1307((byte) -14, class128.field2347)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class260.field4535)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class92.field1716)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class201.field3582)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class190.field3392)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class269.field4650)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class33.field610)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class234.field4073)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class90.field1698)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class218.field3853)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class188.field3365)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class268.field4640)) {
            var2++;
        }
        if (arg0 > -2) {
            method444((byte[]) null, -87);
        }
        if (arg1.method1307((byte) -14, class209.field3739)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class247.field4375)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, class176.field3165)) {
            var2++;
        }
        if (arg1.method1307((byte) -14, client.field4697)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
    public class64(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field1085 = new int[var3];
        this.field1084 = new int[8];
        this.field1088 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field1085[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var2[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var2[var9] = var2[var9 - 1];
                            break;
                        }
                        var2[var9] = class235.method1595(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var2[var6 - 1];
                }
                var2[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1084[var14] == 0) {
                            this.field1084[var14] = var4;
                        }
                        var14 = this.field1084[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1084.length <= var14) {
                        int[] var18 = new int[this.field1084.length * 2];
                        for (int var19 = 0; var19 < this.field1084.length; var19++) {
                            var18[var19] = this.field1084[var19];
                        }
                        this.field1084 = var18;
                    }
                }
                this.field1084[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
